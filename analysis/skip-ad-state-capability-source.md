# Skip Ad state capability source

## Function containing 0x12d3087

/tmp/skipcap/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000012d2e80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118404>:
 12d2e80:	31 d2                	xor    edx,edx
 12d2e82:	e8 73 94 04 00       	call   131c2fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16187e>
 12d2e87:	80 bc 24 18 03 00 00 	cmp    BYTE PTR [rsp+0x318],0x0
 12d2e8e:	00 
 12d2e8f:	4c 8d a4 24 00 03 00 	lea    r12,[rsp+0x300]
 12d2e96:	00 
 12d2e97:	74 0b                	je     12d2ea4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118428>
 12d2e99:	4c 89 f7             	mov    rdi,r14
 12d2e9c:	4c 89 e6             	mov    rsi,r12
 12d2e9f:	e8 dc b1 51 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 12d2ea4:	4c 89 e7             	mov    rdi,r12
 12d2ea7:	e8 84 3e 7d ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 12d2eac:	41 80 7f 1a 00       	cmp    BYTE PTR [r15+0x1a],0x0
 12d2eb1:	74 1b                	je     12d2ece <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118452>
 12d2eb3:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
 12d2eba:	00 
 12d2ebb:	e8 76 9b 04 00       	call   131ca36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161fba>
 12d2ec0:	40 80 f5 01          	xor    bpl,0x1
 12d2ec4:	40 20 e8             	and    al,bpl
 12d2ec7:	88 43 28             	mov    BYTE PTR [rbx+0x28],al
 12d2eca:	80 4b 10 04          	or     BYTE PTR [rbx+0x10],0x4
 12d2ece:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 12d2ed2:	41 80 bc 24 b2 01 00 	cmp    BYTE PTR [r12+0x1b2],0x0
 12d2ed9:	00 00 
 12d2edb:	4c 8d b4 24 50 03 00 	lea    r14,[rsp+0x350]
 12d2ee2:	00 
 12d2ee3:	0f 84 96 01 00 00    	je     12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
 12d2ee9:	41 80 bc 24 20 06 00 	cmp    BYTE PTR [r12+0x620],0x0
 12d2ef0:	00 00 
 12d2ef2:	0f 84 b6 00 00 00    	je     12d2fae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118532>
 12d2ef8:	49 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [r12+0x228]
 12d2eff:	00 
 12d2f00:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d2f03:	ff 50 30             	call   QWORD PTR [rax+0x30]
 12d2f06:	49 8b 4c 24 10       	mov    rcx,QWORD PTR [r12+0x10]
 12d2f0b:	48 8b 89 88 02 00 00 	mov    rcx,QWORD PTR [rcx+0x288]
 12d2f12:	48 8d 15 a7 35 59 00 	lea    rdx,[rip+0x5935a7]        # 18664c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22ba8>
 12d2f19:	48 89 94 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rdx
 12d2f20:	00 
 12d2f21:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 12d2f26:	48 89 94 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rdx
 12d2f2d:	00 
 12d2f2e:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 12d2f35:	00 
 12d2f36:	48 89 8c 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rcx
 12d2f3d:	00 
 12d2f3e:	4c 89 f7             	mov    rdi,r14
 12d2f41:	e8 f0 9a 04 00       	call   131ca36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161fba>
 12d2f46:	84 c0                	test   al,al
 12d2f48:	74 60                	je     12d2faa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11852e>
 12d2f4a:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 12d2f4f:	c6 81 f5 00 00 00 01 	mov    BYTE PTR [rcx+0xf5],0x1
 12d2f56:	80 49 12 10          	or     BYTE PTR [rcx+0x12],0x10
 12d2f5a:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 12d2f5e:	48 89 84 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rax
 12d2f65:	00 
 12d2f66:	48 89 8c 24 08 03 00 	mov    QWORD PTR [rsp+0x308],rcx
 12d2f6d:	00 
 12d2f6e:	48 8d 05 cf ac 80 ff 	lea    rax,[rip+0xffffffffff80accf]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 12d2f75:	48 89 84 24 10 03 00 	mov    QWORD PTR [rsp+0x310],rax
 12d2f7c:	00 
 12d2f7d:	48 8d 05 b6 35 00 00 	lea    rax,[rip+0x35b6]        # 12d653a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11babe>
 12d2f84:	48 89 84 24 18 03 00 	mov    QWORD PTR [rsp+0x318],rax
 12d2f8b:	00 
 12d2f8c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 12d2f91:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d2f94:	48 8d 9c 24 00 03 00 	lea    rbx,[rsp+0x300]
 12d2f9b:	00 
 12d2f9c:	48 89 de             	mov    rsi,rbx
 12d2f9f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 12d2fa2:	48 89 df             	mov    rdi,rbx
 12d2fa5:	e8 f4 d0 af ff       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
 12d2faa:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 12d2fae:	41 80 bc 24 21 06 00 	cmp    BYTE PTR [r12+0x621],0x0
 12d2fb5:	00 00 
 12d2fb7:	0f 84 c2 00 00 00    	je     12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
 12d2fbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 12d2fc2:	80 b8 f5 00 00 00 00 	cmp    BYTE PTR [rax+0xf5],0x0
 12d2fc9:	0f 85 b0 00 00 00    	jne    12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
 12d2fcf:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
 12d2fd4:	48 8b 58 60          	mov    rbx,QWORD PTR [rax+0x60]
 12d2fd8:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 12d2fdd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d2fe0:	ff 50 40             	call   QWORD PTR [rax+0x40]
 12d2fe3:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 12d2fe6:	48 89 df             	mov    rdi,rbx
 12d2fe9:	48 89 c6             	mov    rsi,rax
 12d2fec:	48 8d 15 45 29 72 00 	lea    rdx,[rip+0x722945]        # 19f5938 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f7>
 12d2ff3:	ff 51 50             	call   QWORD PTR [rcx+0x50]
 12d2ff6:	84 c0                	test   al,al
 12d2ff8:	74 1e                	je     12d3018 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11859c>
 12d2ffa:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 12d2fff:	c6 80 f5 00 00 00 01 	mov    BYTE PTR [rax+0xf5],0x1
 12d3006:	80 48 12 10          	or     BYTE PTR [rax+0x12],0x10
 12d300a:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 12d300e:	4c 8d b4 24 50 03 00 	lea    r14,[rsp+0x350]
 12d3015:	00 
 12d3016:	eb 67                	jmp    12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
 12d3018:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 12d301d:	80 b8 f5 00 00 00 00 	cmp    BYTE PTR [rax+0xf5],0x0
 12d3024:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 12d3028:	4c 8d b4 24 50 03 00 	lea    r14,[rsp+0x350]
 12d302f:	00 
 12d3030:	75 4d                	jne    12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
 12d3032:	4c 89 a4 24 50 03 00 	mov    QWORD PTR [rsp+0x350],r12
 12d3039:	00 
 12d303a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 12d303f:	48 89 84 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rax
 12d3046:	00 
 12d3047:	48 8d 05 f6 ab 80 ff 	lea    rax,[rip+0xffffffffff80abf6]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 12d304e:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 12d3055:	00 
 12d3056:	48 8d 05 13 35 00 00 	lea    rax,[rip+0x3513]        # 12d6570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11baf4>
 12d305d:	48 89 84 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rax
 12d3064:	00 
 12d3065:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 12d306a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d306d:	4c 89 f6             	mov    rsi,r14
 12d3070:	ff 50 10             	call   QWORD PTR [rax+0x10]
 12d3073:	4c 89 f7             	mov    rdi,r14
 12d3076:	e8 23 d0 af ff       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
 12d307b:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 12d307f:	41 8a 84 24 01 01 00 	mov    al,BYTE PTR [r12+0x101]
 12d3086:	00 
 12d3087:	41 0a 84 24 b5 01 00 	or     al,BYTE PTR [r12+0x1b5]
 12d308e:	00 
 12d308f:	74 2a                	je     12d30bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11863f>
 12d3091:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 12d3096:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d3099:	ff 50 68             	call   QWORD PTR [rax+0x68]
 12d309c:	48 89 84 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rax
 12d30a3:	00 
 12d30a4:	4c 89 f7             	mov    rdi,r14
 12d30a7:	e8 94 ba 51 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
 12d30ac:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 12d30b1:	89 81 f0 00 00 00    	mov    DWORD PTR [rcx+0xf0],eax
 12d30b7:	80 49 12 04          	or     BYTE PTR [rcx+0x12],0x4
 12d30bb:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 12d30bf:	8a 81 00 01 00 00    	mov    al,BYTE PTR [rcx+0x100]
 12d30c5:	0a 81 b4 01 00 00    	or     al,BYTE PTR [rcx+0x1b4]
 12d30cb:	74 45                	je     12d3112 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118696>
 12d30cd:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 12d30d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d30d5:	ff 50 60             	call   QWORD PTR [rax+0x60]
 12d30d8:	4c 89 f7             	mov    rdi,r14
 12d30db:	48 89 c6             	mov    rsi,rax
 12d30de:	e8 5d ae 51 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 12d30e3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 12d30e8:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
 12d30ec:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
 12d30f0:	f6 c2 01             	test   dl,0x1
 12d30f3:	0f 85 3b 02 00 00    	jne    12d3334 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1188b8>
 12d30f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 12d30fe:	48 83 c7 68          	add    rdi,0x68
 12d3102:	4c 89 f6             	mov    rsi,r14
 12d3105:	e8 dc 26 49 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
 12d310a:	4c 89 f7             	mov    rdi,r14
 12d310d:	e8 7e ad 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12d3112:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 12d3116:	48 89 9c 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rbx
 12d311d:	00 
 12d311e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 12d3123:	48 89 84 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rax
 12d312a:	00 
 12d312b:	48 8d 05 12 ab 80 ff 	lea    rax,[rip+0xffffffffff80ab12]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 12d3132:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 12d3139:	00 
 12d313a:	48 8d 05 e1 34 00 00 	lea    rax,[rip+0x34e1]        # 12d6622 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11bba6>
 12d3141:	48 89 84 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rax
 12d3148:	00 
 12d3149:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 12d314e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d3151:	4c 89 f6             	mov    rsi,r14
 12d3154:	ff 50 78             	call   QWORD PTR [rax+0x78]
 12d3157:	4c 89 f7             	mov    rdi,r14
 12d315a:	e8 f1 0b 00 00       	call   12d3d50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1192d4>
 12d315f:	48 8b bb a8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a8]
 12d3166:	48 85 ff             	test   rdi,rdi
 12d3169:	48 8d 05 e0 9f 6f 00 	lea    rax,[rip+0x6f9fe0]        # 19cd150 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x95d98>
 12d3170:	48 0f 44 f8          	cmove  rdi,rax
 12d3174:	e8 26 a0 07 00       	call   134d19f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192723>
 12d3179:	84 c0                	test   al,al
 12d317b:	48 8d 9c 24 50 03 00 	lea    rbx,[rsp+0x350]
 12d3182:	00 
 12d3183:	74 2e                	je     12d31b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118737>
 12d3185:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 12d3189:	48 8b b8 e8 00 00 00 	mov    rdi,QWORD PTR [rax+0xe8]
 12d3190:	48 85 ff             	test   rdi,rdi
 12d3193:	48 8d 05 b6 9f 6f 00 	lea    rax,[rip+0x6f9fb6]        # 19cd150 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x95d98>
 12d319a:	48 0f 44 f8          	cmove  rdi,rax
 12d319e:	e8 fc 9f 07 00       	call   134d19f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192723>
 12d31a3:	84 c0                	test   al,al
 12d31a5:	48 8d 9c 24 50 03 00 	lea    rbx,[rsp+0x350]
 12d31ac:	00 
 12d31ad:	0f 85 d2 00 00 00    	jne    12d3285 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118809>
 12d31b3:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 12d31b7:	48 8b b8 38 02 00 00 	mov    rdi,QWORD PTR [rax+0x238]
 12d31be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d31c1:	ff 50 60             	call   QWORD PTR [rax+0x60]
 12d31c4:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 12d31c9:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
 12d31cc:	48 89 df             	mov    rdi,rbx
 12d31cf:	48 89 c2             	mov    rdx,rax
 12d31d2:	ff 51 70             	call   QWORD PTR [rcx+0x70]
 12d31d5:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
 12d31da:	48 89 de             	mov    rsi,rbx
 12d31dd:	e8 9d 8b ab ff       	call   d8bd7f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58e05>
 12d31e2:	48 89 c3             	mov    rbx,rax
 12d31e5:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 12d31e9:	48 8b b8 a8 01 00 00 	mov    rdi,QWORD PTR [rax+0x1a8]
 12d31f0:	48 85 ff             	test   rdi,rdi
 12d31f3:	48 8d 05 56 9f 6f 00 	lea    rax,[rip+0x6f9f56]        # 19cd150 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x95d98>
 12d31fa:	48 0f 44 f8          	cmove  rdi,rax
 12d31fe:	e8 9c 9f 07 00       	call   134d19f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192723>
 12d3203:	89 c5                	mov    ebp,eax
 12d3205:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 12d3209:	4c 8b b8 e8 00 00 00 	mov    r15,QWORD PTR [rax+0xe8]
 12d3210:	4c 8b b0 a8 01 00 00 	mov    r14,QWORD PTR [rax+0x1a8]
 12d3217:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 12d321c:	83 48 10 08          	or     DWORD PTR [rax+0x10],0x8
 12d3220:	48 8b 40 78          	mov    rax,QWORD PTR [rax+0x78]
 12d3224:	48 85 c0             	test   rax,rax
 12d3227:	75 21                	jne    12d324a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1187ce>
 12d3229:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 12d322e:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
 12d3232:	40 f6 c7 01          	test   dil,0x1
 12d3236:	0f 85 1c 01 00 00    	jne    12d3358 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1188dc>
 12d323c:	e8 b5 a0 fe ff       	call   12bd2f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10287a>
 12d3241:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 12d3246:	48 89 41 78          	mov    QWORD PTR [rcx+0x78],rax
 12d324a:	40 84 ed             	test   bpl,bpl
 12d324d:	4d 0f 45 f7          	cmovne r14,r15
 12d3251:	4d 85 f6             	test   r14,r14
 12d3254:	48 8d 0d f5 9e 6f 00 	lea    rcx,[rip+0x6f9ef5]        # 19cd150 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x95d98>
 12d325b:	4c 0f 44 f1          	cmove  r14,rcx
 12d325f:	48 89 c7             	mov    rdi,rax
 12d3262:	48 8d b4 24 50 03 00 	lea    rsi,[rsp+0x350]
 12d3269:	00 
 12d326a:	48 89 da             	mov    rdx,rbx
 12d326d:	4c 89 f1             	mov    rcx,r14
 12d3270:	e8 95 c7 04 00       	call   131fa0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164f8e>
 12d3275:	48 8d 9c 24 50 03 00 	lea    rbx,[rsp+0x350]
 12d327c:	00 
 12d327d:	48 89 df             	mov    rdi,rbx
 12d3280:	e8 0b ac 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12d3285:	48 83 a4 24 50 03 00 	and    QWORD PTR [rsp+0x350],0x0
 12d328c:	00 00 
 12d328e:	48 83 a4 24 60 03 00 	and    QWORD PTR [rsp+0x360],0x0
 12d3295:	00 00 
 12d3297:	6a 18                	push   0x18
 12d3299:	5f                   	pop    rdi
 12d329a:	e8 61 ac 51 00       	call   17edf00 <_Znwm@plt>
 12d329f:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 12d32a4:	48 89 38             	mov    QWORD PTR [rax],rdi
 12d32a7:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 12d32ab:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 12d32af:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 12d32b4:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 12d32b8:	48 89 84 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rax
 12d32bf:	00 
 12d32c0:	48 8d 05 47 f0 88 ff 	lea    rax,[rip+0xffffffffff88f047]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 12d32c7:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 12d32ce:	00 
 12d32cf:	48 8d 05 86 35 00 00 	lea    rax,[rip+0x3586]        # 12d685c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11bde0>
 12d32d6:	48 89 84 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rax
 12d32dd:	00 
 12d32de:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d32e1:	48 89 de             	mov    rsi,rbx
 12d32e4:	ff 50 38             	call   QWORD PTR [rax+0x38]
 12d32e7:	48 89 df             	mov    rdi,rbx
 12d32ea:	e8 47 37 00 00       	call   12d6a36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11bfba>
 12d32ef:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
 12d32f6:	00 
 12d32f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d32fa:	ff 50 10             	call   QWORD PTR [rax+0x10]
 12d32fd:	e9 0e f1 ff ff       	jmp    12d2410 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117994>
 12d3302:	48 8b b4 24 b0 01 00 	mov    rsi,QWORD PTR [rsp+0x1b0]
 12d3309:	00 
 12d330a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 12d330d:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
 12d3314:	00 
 12d3315:	6a 01                	push   0x1
 12d3317:	5a                   	pop    rdx
 12d3318:	ff 50 18             	call   QWORD PTR [rax+0x18]
 12d331b:	48 8d 9c 24 c8 01 00 	lea    rbx,[rsp+0x1c8]
 12d3322:	00 
 12d3323:	e9 7b f3 ff ff       	jmp    12d26a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117c27>
 12d3328:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
 12d332c:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 12d332f:	e9 54 f5 ff ff       	jmp    12d2888 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117e0c>
 12d3334:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
 12d3338:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 12d333b:	e9 b9 fd ff ff       	jmp    12d30f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11867d>

## Direct callers of local neighborhood

## State-class constructor/materializer around e9cc

/tmp/skipcap/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000e9cc60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64076>:
  e9cc60:	05 f0 48 ff 42       	add    eax,0x42ff48f0
  e9cc65:	08 48 8b             	or     BYTE PTR [rax-0x75],cl
  e9cc68:	8c 24 e0             	mov    WORD PTR [rax+riz*8],fs
  e9cc6b:	12 00                	adc    al,BYTE PTR [rax]
  e9cc6d:	00 48 8b             	add    BYTE PTR [rax-0x75],cl
  e9cc70:	50                   	push   rax
  e9cc71:	08 0f                	or     BYTE PTR [rdi],cl
  e9cc73:	10 00                	adc    BYTE PTR [rax],al
  e9cc75:	0f 29 84 24 10 0b 00 	movaps XMMWORD PTR [rsp+0xb10],xmm0
  e9cc7c:	00 
  e9cc7d:	48 85 d2             	test   rdx,rdx
  e9cc80:	74 05                	je     e9cc87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6409d>
  e9cc82:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e9cc87:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9cc8b:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
  e9cc8f:	66 0f 7f 84 24 20 0b 	movdqa XMMWORD PTR [rsp+0xb20],xmm0
  e9cc96:	00 00 
  e9cc98:	48 85 c0             	test   rax,rax
  e9cc9b:	74 05                	je     e9cca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x640b8>
  e9cc9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cca2:	48 83 a4 24 60 06 00 	and    QWORD PTR [rsp+0x660],0x0
  e9cca9:	00 00 
  e9ccab:	bf d0 03 00 00       	mov    edi,0x3d0
  e9ccb0:	e8 4b 12 95 00       	call   17edf00 <_Znwm@plt>
  e9ccb5:	49 89 c4             	mov    r12,rax
  e9ccb8:	4c 8d bc 24 b0 07 00 	lea    r15,[rsp+0x7b0]
  e9ccbf:	00 
  e9ccc0:	48 89 84 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rax
  e9ccc7:	00 
  e9ccc8:	48 8d 84 24 20 05 00 	lea    rax,[rsp+0x520]
  e9cccf:	00 
  e9ccd0:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
  e9ccd7:	00 
  e9ccd8:	48 c7 84 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],0x1
  e9ccdf:	00 01 00 00 00 
  e9cce4:	48 8d 05 f5 98 99 00 	lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
  e9cceb:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e9ccef:	49 8b 47 c0          	mov    rax,QWORD PTR [r15-0x40]
  e9ccf3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  e9ccf8:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
  e9ccfd:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
  e9cd02:	48 89 ee             	mov    rsi,rbp
  e9cd05:	e8 ee c4 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9cd0a:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
  e9cd0e:	41 0f 29 44 24 50    	movaps XMMWORD PTR [r12+0x50],xmm0
  e9cd14:	41 0f 28 47 10       	movaps xmm0,XMMWORD PTR [r15+0x10]
  e9cd19:	41 0f 11 44 24 60    	movups XMMWORD PTR [r12+0x60],xmm0
  e9cd1f:	0f 57 c0             	xorps  xmm0,xmm0
  e9cd22:	48 8d 84 24 c0 07 00 	lea    rax,[rsp+0x7c0]
  e9cd29:	00 
  e9cd2a:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
  e9cd2d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
  e9cd32:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
  e9cd37:	48 8d b4 24 d0 07 00 	lea    rsi,[rsp+0x7d0]
  e9cd3e:	00 
  e9cd3f:	e8 60 c1 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
  e9cd44:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]
  e9cd4b:	00 
  e9cd4c:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
  e9cd53:	00 
  e9cd54:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
  e9cd5b:	00 
  e9cd5c:	e8 0b 96 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
  e9cd61:	49 8d ac 24 d0 00 00 	lea    rbp,[r12+0xd0]
  e9cd68:	00 
  e9cd69:	48 89 ef             	mov    rdi,rbp
  e9cd6c:	48 8d b4 24 30 08 00 	lea    rsi,[rsp+0x830]
  e9cd73:	00 
  e9cd74:	e8 37 96 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
  e9cd79:	4d 8d b4 24 00 01 00 	lea    r14,[r12+0x100]
  e9cd80:	00 
  e9cd81:	4c 89 f7             	mov    rdi,r14
  e9cd84:	48 89 de             	mov    rsi,rbx
  e9cd87:	e8 5c c1 05 00       	call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
  e9cd8c:	41 0f 28 87 e0 00 00 	movaps xmm0,XMMWORD PTR [r15+0xe0]
  e9cd93:	00 
  e9cd94:	66 41 0f 6f 8f f0 00 	movdqa xmm1,XMMWORD PTR [r15+0xf0]
  e9cd9b:	00 00 
  e9cd9d:	66 41 0f 7f 8c 24 40 	movdqa XMMWORD PTR [r12+0x140],xmm1
  e9cda4:	01 00 00 
  e9cda7:	41 0f 29 84 24 30 01 	movaps XMMWORD PTR [r12+0x130],xmm0
  e9cdae:	00 00 
  e9cdb0:	49 8b 87 08 01 00 00 	mov    rax,QWORD PTR [r15+0x108]
  e9cdb7:	66 41 0f 6f 87 00 01 	movdqa xmm0,XMMWORD PTR [r15+0x100]
  e9cdbe:	00 00 
  e9cdc0:	f3 41 0f 7f 84 24 50 	movdqu XMMWORD PTR [r12+0x150],xmm0
  e9cdc7:	01 00 00 
  e9cdca:	48 85 c0             	test   rax,rax
  e9cdcd:	74 05                	je     e9cdd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x641ea>
  e9cdcf:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cdd4:	49 8d bc 24 60 01 00 	lea    rdi,[r12+0x160]
  e9cddb:	00 
  e9cddc:	48 8d b4 24 c0 08 00 	lea    rsi,[rsp+0x8c0]
  e9cde3:	00 
  e9cde4:	e8 43 c1 05 00       	call   ef8f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0342>
  e9cde9:	48 8b 84 24 68 09 00 	mov    rax,QWORD PTR [rsp+0x968]
  e9cdf0:	00 
  e9cdf1:	66 0f 6f 84 24 60 09 	movdqa xmm0,XMMWORD PTR [rsp+0x960]
  e9cdf8:	00 00 
  e9cdfa:	f3 41 0f 7f 84 24 00 	movdqu XMMWORD PTR [r12+0x200],xmm0
  e9ce01:	02 00 00 
  e9ce04:	48 85 c0             	test   rax,rax
  e9ce07:	74 05                	je     e9ce0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64224>
  e9ce09:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9ce0e:	8a 84 24 70 09 00 00 	mov    al,BYTE PTR [rsp+0x970]
  e9ce15:	41 88 84 24 10 02 00 	mov    BYTE PTR [r12+0x210],al
  e9ce1c:	00 
  e9ce1d:	49 8d 9c 24 20 02 00 	lea    rbx,[r12+0x220]
  e9ce24:	00 
  e9ce25:	48 89 df             	mov    rdi,rbx
  e9ce28:	48 8d b4 24 80 09 00 	lea    rsi,[rsp+0x980]
  e9ce2f:	00 
  e9ce30:	e8 5b d4 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9ce35:	48 8b 84 24 b8 09 00 	mov    rax,QWORD PTR [rsp+0x9b8]
  e9ce3c:	00 
  e9ce3d:	66 0f 6f 84 24 b0 09 	movdqa xmm0,XMMWORD PTR [rsp+0x9b0]
  e9ce44:	00 00 
  e9ce46:	f3 41 0f 7f 84 24 50 	movdqu XMMWORD PTR [r12+0x250],xmm0
  e9ce4d:	02 00 00 
  e9ce50:	48 85 c0             	test   rax,rax
  e9ce53:	74 05                	je     e9ce5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64270>
  e9ce55:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9ce5a:	4d 8d bc 24 60 02 00 	lea    r15,[r12+0x260]
  e9ce61:	00 
  e9ce62:	4c 89 ff             	mov    rdi,r15
  e9ce65:	48 8d b4 24 c0 09 00 	lea    rsi,[rsp+0x9c0]
  e9ce6c:	00 
  e9ce6d:	e8 1e d4 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9ce72:	49 8d bc 24 90 02 00 	lea    rdi,[r12+0x290]
  e9ce79:	00 
  e9ce7a:	48 8d b4 24 f0 09 00 	lea    rsi,[rsp+0x9f0]
  e9ce81:	00 
  e9ce82:	e8 09 d4 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9ce87:	48 8d 8c 24 20 0a 00 	lea    rcx,[rsp+0xa20]
  e9ce8e:	00 
  e9ce8f:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
  e9ce92:	41 0f 11 84 24 c0 02 	movups XMMWORD PTR [r12+0x2c0],xmm0
  e9ce99:	00 00 
  e9ce9b:	0f 57 c0             	xorps  xmm0,xmm0
  e9ce9e:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
  e9cea1:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
  e9cea5:	0f 28 41 10          	movaps xmm0,XMMWORD PTR [rcx+0x10]
  e9cea9:	41 0f 11 84 24 d0 02 	movups XMMWORD PTR [r12+0x2d0],xmm0
  e9ceb0:	00 00 
  e9ceb2:	48 85 c0             	test   rax,rax
  e9ceb5:	74 05                	je     e9cebc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x642d2>
  e9ceb7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cebc:	48 8b 84 24 48 0a 00 	mov    rax,QWORD PTR [rsp+0xa48]
  e9cec3:	00 
  e9cec4:	0f 28 84 24 40 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xa40]
  e9cecb:	00 
  e9cecc:	41 0f 11 84 24 e0 02 	movups XMMWORD PTR [r12+0x2e0],xmm0
  e9ced3:	00 00 
  e9ced5:	48 85 c0             	test   rax,rax
  e9ced8:	74 05                	je     e9cedf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x642f5>
  e9ceda:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cedf:	48 8b 84 24 58 0a 00 	mov    rax,QWORD PTR [rsp+0xa58]
  e9cee6:	00 
  e9cee7:	0f 28 84 24 50 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xa50]
  e9ceee:	00 
  e9ceef:	41 0f 11 84 24 f0 02 	movups XMMWORD PTR [r12+0x2f0],xmm0
  e9cef6:	00 00 
  e9cef8:	48 85 c0             	test   rax,rax
  e9cefb:	74 05                	je     e9cf02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64318>
  e9cefd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cf02:	48 8b 84 24 68 0a 00 	mov    rax,QWORD PTR [rsp+0xa68]
  e9cf09:	00 
  e9cf0a:	0f 28 84 24 60 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xa60]
  e9cf11:	00 
  e9cf12:	41 0f 11 84 24 00 03 	movups XMMWORD PTR [r12+0x300],xmm0
  e9cf19:	00 00 
  e9cf1b:	48 85 c0             	test   rax,rax
  e9cf1e:	74 05                	je     e9cf25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6433b>
  e9cf20:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cf25:	48 8b 84 24 78 0a 00 	mov    rax,QWORD PTR [rsp+0xa78]
  e9cf2c:	00 
  e9cf2d:	0f 28 84 24 70 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xa70]
  e9cf34:	00 
  e9cf35:	41 0f 11 84 24 10 03 	movups XMMWORD PTR [r12+0x310],xmm0
  e9cf3c:	00 00 
  e9cf3e:	48 85 c0             	test   rax,rax
  e9cf41:	74 05                	je     e9cf48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6435e>
  e9cf43:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cf48:	48 8b 84 24 88 0a 00 	mov    rax,QWORD PTR [rsp+0xa88]
  e9cf4f:	00 
  e9cf50:	0f 28 84 24 80 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xa80]
  e9cf57:	00 
  e9cf58:	41 0f 11 84 24 20 03 	movups XMMWORD PTR [r12+0x320],xmm0
  e9cf5f:	00 00 
  e9cf61:	48 85 c0             	test   rax,rax
  e9cf64:	74 05                	je     e9cf6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64381>
  e9cf66:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cf6b:	48 8b 84 24 98 0a 00 	mov    rax,QWORD PTR [rsp+0xa98]
  e9cf72:	00 
  e9cf73:	0f 28 84 24 90 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xa90]
  e9cf7a:	00 
  e9cf7b:	41 0f 11 84 24 30 03 	movups XMMWORD PTR [r12+0x330],xmm0
  e9cf82:	00 00 
  e9cf84:	48 85 c0             	test   rax,rax
  e9cf87:	74 05                	je     e9cf8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x643a4>
  e9cf89:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cf8e:	8a 84 24 a0 0a 00 00 	mov    al,BYTE PTR [rsp+0xaa0]
  e9cf95:	41 88 84 24 40 03 00 	mov    BYTE PTR [r12+0x340],al
  e9cf9c:	00 
  e9cf9d:	48 8b 84 24 b0 0a 00 	mov    rax,QWORD PTR [rsp+0xab0]
  e9cfa4:	00 
  e9cfa5:	0f 10 84 24 a8 0a 00 	movups xmm0,XMMWORD PTR [rsp+0xaa8]
  e9cfac:	00 
  e9cfad:	41 0f 11 84 24 48 03 	movups XMMWORD PTR [r12+0x348],xmm0
  e9cfb4:	00 00 
  e9cfb6:	48 85 c0             	test   rax,rax
  e9cfb9:	74 05                	je     e9cfc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x643d6>
  e9cfbb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cfc0:	48 8d 84 24 d0 0a 00 	lea    rax,[rsp+0xad0]
  e9cfc7:	00 
  e9cfc8:	0f 10 40 e8          	movups xmm0,XMMWORD PTR [rax-0x18]
  e9cfcc:	41 0f 11 84 24 58 03 	movups XMMWORD PTR [r12+0x358],xmm0
  e9cfd3:	00 00 
  e9cfd5:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
  e9cfd9:	49 89 8c 24 68 03 00 	mov    QWORD PTR [r12+0x368],rcx
  e9cfe0:	00 
  e9cfe1:	48 85 c9             	test   rcx,rcx
  e9cfe4:	74 05                	je     e9cfeb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64401>
  e9cfe6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e9cfeb:	0f 28 84 24 d0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xad0]
  e9cff2:	00 
  e9cff3:	41 0f 11 84 24 70 03 	movups XMMWORD PTR [r12+0x370],xmm0
  e9cffa:	00 00 
  e9cffc:	0f 57 c0             	xorps  xmm0,xmm0
  e9cfff:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
  e9d002:	48 8b 84 24 e8 0a 00 	mov    rax,QWORD PTR [rsp+0xae8]
  e9d009:	00 
  e9d00a:	0f 28 84 24 e0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xae0]
  e9d011:	00 
  e9d012:	41 0f 11 84 24 80 03 	movups XMMWORD PTR [r12+0x380],xmm0
  e9d019:	00 00 
  e9d01b:	48 85 c0             	test   rax,rax
  e9d01e:	74 05                	je     e9d025 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6443b>
  e9d020:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9d025:	48 8b 84 24 f8 0a 00 	mov    rax,QWORD PTR [rsp+0xaf8]
  e9d02c:	00 
  e9d02d:	0f 28 84 24 f0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xaf0]
  e9d034:	00 
  e9d035:	41 0f 11 84 24 90 03 	movups XMMWORD PTR [r12+0x390],xmm0
  e9d03c:	00 00 
  e9d03e:	48 85 c0             	test   rax,rax
  e9d041:	74 05                	je     e9d048 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6445e>
  e9d043:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9d048:	48 8b 84 24 08 0b 00 	mov    rax,QWORD PTR [rsp+0xb08]
  e9d04f:	00 
  e9d050:	0f 28 84 24 00 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb00]
  e9d057:	00 
  e9d058:	41 0f 11 84 24 a0 03 	movups XMMWORD PTR [r12+0x3a0],xmm0
  e9d05f:	00 00 
  e9d061:	48 85 c0             	test   rax,rax
  e9d064:	74 05                	je     e9d06b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64481>
  e9d066:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9d06b:	48 8b 84 24 18 0b 00 	mov    rax,QWORD PTR [rsp+0xb18]
  e9d072:	00 
  e9d073:	0f 28 84 24 10 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb10]
  e9d07a:	00 
  e9d07b:	41 0f 11 84 24 b0 03 	movups XMMWORD PTR [r12+0x3b0],xmm0
  e9d082:	00 00 
  e9d084:	48 85 c0             	test   rax,rax
  e9d087:	74 05                	je     e9d08e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644a4>
  e9d089:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9d08e:	48 8b 84 24 28 0b 00 	mov    rax,QWORD PTR [rsp+0xb28]
  e9d095:	00 
  e9d096:	0f 28 84 24 20 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb20]
  e9d09d:	00 
  e9d09e:	41 0f 11 84 24 c0 03 	movups XMMWORD PTR [r12+0x3c0],xmm0
  e9d0a5:	00 00 
  e9d0a7:	48 85 c0             	test   rax,rax
  e9d0aa:	74 05                	je     e9d0b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644c7>
  e9d0ac:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9d0b1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
  e9d0b8:	00 
  e9d0b9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
  e9d0c4:	00 
  e9d0c5:	e8 00 d2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9d0ca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9d0d1:	00 
  e9d0d2:	e8 97 be 05 00       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
  e9d0d7:	4c 89 ef             	mov    rdi,r13
  e9d0da:	e8 a7 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d0df:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
  e9d0e6:	00 
  e9d0e7:	48 89 df             	mov    rdi,rbx
  e9d0ea:	e8 a1 0d 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9d0ef:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
  e9d0f6:	00 
  e9d0f7:	4c 89 f7             	mov    rdi,r14
  e9d0fa:	e8 23 0a c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
  e9d0ff:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
  e9d105:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e9d10c:	e8 75 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d111:	31 ff                	xor    edi,edi
  e9d113:	e8 6e 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d118:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
  e9d11f:	00 
  e9d120:	e8 45 ce bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9d125:	31 ff                	xor    edi,edi
  e9d127:	e8 5a 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d12c:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
  e9d133:	00 
  e9d134:	e8 c1 a9 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
  e9d139:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
  e9d13e:	e8 43 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d143:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  e9d148:	e8 39 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d14d:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  e9d152:	e8 2f 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d157:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
  e9d15e:	00 
  e9d15f:	e8 22 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d164:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
  e9d169:	e8 18 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d16e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
  e9d175:	00 
  e9d176:	e8 0b 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d17b:	48                   	rex.W
  e9d17c:	8d                   	.byte 0x8d
  e9d17d:	bc                   	.byte 0xbc
  e9d17e:	24 80                	and    al,0x80

## State fields in e9cc constructor
  e9cccf:	00 
  e9ccd0:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
  e9ccd7:	00 
  e9ccd8:	48 c7 84 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],0x1
  e9ccdf:	00 01 00 00 00 
  e9cce4:	48 8d 05 f5 98 99 00 	lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
  e9cceb:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e9ccef:	49 8b 47 c0          	mov    rax,QWORD PTR [r15-0x40]
  e9ccf3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  e9ccf8:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
  e9ccfd:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
  e9cd02:	48 89 ee             	mov    rsi,rbp
  e9cd05:	e8 ee c4 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9cd0a:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
  e9cd0e:	41 0f 29 44 24 50    	movaps XMMWORD PTR [r12+0x50],xmm0
  e9cd14:	41 0f 28 47 10       	movaps xmm0,XMMWORD PTR [r15+0x10]
  e9cd19:	41 0f 11 44 24 60    	movups XMMWORD PTR [r12+0x60],xmm0
  e9cd1f:	0f 57 c0             	xorps  xmm0,xmm0
  e9cd22:	48 8d 84 24 c0 07 00 	lea    rax,[rsp+0x7c0]
  e9cd29:	00 
  e9cd2a:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
  e9cd2d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
  e9cd32:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
  e9cd37:	48 8d b4 24 d0 07 00 	lea    rsi,[rsp+0x7d0]
  e9cd3e:	00 
  e9cd3f:	e8 60 c1 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
  e9cd44:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]
  e9cd4b:	00 
  e9cd4c:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
  e9cd53:	00 
  e9cd54:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
  e9cd5b:	00 
--
  e9cf89:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cf8e:	8a 84 24 a0 0a 00 00 	mov    al,BYTE PTR [rsp+0xaa0]
  e9cf95:	41 88 84 24 40 03 00 	mov    BYTE PTR [r12+0x340],al
  e9cf9c:	00 
  e9cf9d:	48 8b 84 24 b0 0a 00 	mov    rax,QWORD PTR [rsp+0xab0]
  e9cfa4:	00 
  e9cfa5:	0f 10 84 24 a8 0a 00 	movups xmm0,XMMWORD PTR [rsp+0xaa8]
  e9cfac:	00 
  e9cfad:	41 0f 11 84 24 48 03 	movups XMMWORD PTR [r12+0x348],xmm0
  e9cfb4:	00 00 
  e9cfb6:	48 85 c0             	test   rax,rax
  e9cfb9:	74 05                	je     e9cfc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x643d6>
  e9cfbb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cfc0:	48 8d 84 24 d0 0a 00 	lea    rax,[rsp+0xad0]
  e9cfc7:	00 
  e9cfc8:	0f 10 40 e8          	movups xmm0,XMMWORD PTR [rax-0x18]
  e9cfcc:	41 0f 11 84 24 58 03 	movups XMMWORD PTR [r12+0x358],xmm0
  e9cfd3:	00 00 
  e9cfd5:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
  e9cfd9:	49 89 8c 24 68 03 00 	mov    QWORD PTR [r12+0x368],rcx
  e9cfe0:	00 
  e9cfe1:	48 85 c9             	test   rcx,rcx
  e9cfe4:	74 05                	je     e9cfeb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64401>
  e9cfe6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e9cfeb:	0f 28 84 24 d0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xad0]
--
  e9d1e0:	00 
  e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9d1e6:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
  e9d1eb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e9d1f0:	48 8d 05 b9 44 99 00 	lea    rax,[rip+0x9944b9]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
  e9d1f7:	49 89 06             	mov    QWORD PTR [r14],rax
  e9d1fa:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  e9d1ff:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  e9d203:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
  e9d207:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
  e9d20b:	31 ff                	xor    edi,edi
  e9d20d:	e8 74 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d212:	48 8d 05 37 64 97 00 	lea    rax,[rip+0x976437]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
  e9d219:	48 89 84 24 20 05 00 	mov    QWORD PTR [rsp+0x520],rax
  e9d220:	00 
  e9d221:	48 8d 05 a0 81 06 00 	lea    rax,[rip+0x681a0]        # f053c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc7de>
  e9d228:	48 89 84 24 28 05 00 	mov    QWORD PTR [rsp+0x528],rax
  e9d22f:	00 
  e9d230:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
  e9d237:	00 
  e9d238:	48 89 b4 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rsi
  e9d23f:	00 
  e9d240:	48 8d 05 b1 44 99 00 	lea    rax,[rip+0x9944b1]        # 18316f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3690>
  e9d247:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9d24a:	4c 8b b4 24 e8 12 00 	mov    r14,QWORD PTR [rsp+0x12e8]
--
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
  e9d383:	4c 89 ee             	mov    rsi,r13
  e9d386:	e8 05 cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9d38b:	4c 8d bb b0 00 00 00 	lea    r15,[rbx+0xb0]
  e9d392:	4c 89 ff             	mov    rdi,r15
--
  e9d9be:	49 63 dd             	movsxd rbx,r13d
  e9d9c1:	48 89 9c 24 00 08 00 	mov    QWORD PTR [rsp+0x800],rbx
  e9d9c8:	00 
  e9d9c9:	bf b0 00 00 00       	mov    edi,0xb0
  e9d9ce:	e8 2d 05 95 00       	call   17edf00 <_Znwm@plt>
  e9d9d3:	49 89 c4             	mov    r12,rax
  e9d9d6:	48 8d 05 33 c0 99 00 	lea    rax,[rip+0x99c033]        # 1839a10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb9a8>
  e9d9dd:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e9d9e1:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
  e9d9e6:	4c 8d ac 24 70 07 00 	lea    r13,[rsp+0x770]
  e9d9ed:	00 
  e9d9ee:	4c 89 ee             	mov    rsi,r13
  e9d9f1:	e8 0e 8b 00 00       	call   ea6504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91a>
  e9d9f6:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
  e9d9fb:	4c 89 f6             	mov    rsi,r14
  e9d9fe:	e8 bf 2e 08 00       	call   f208c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cd8>
  e9da03:	4c 89 e7             	mov    rdi,r12
  e9da06:	48 83 c7 70          	add    rdi,0x70
  e9da0a:	4c 89 fe             	mov    rsi,r15
  e9da0d:	e8 ee 89 e2 ff       	call   cc6400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133a0>
  e9da12:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
  e9da19:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
  e9da20:	00 
  e9da21:	4c 89 a4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r12
  e9da28:	00 
--
  e9da6e:	4c 89 ff             	mov    rdi,r15
  e9da71:	e8 8a 89 e2 ff       	call   cc6400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133a0>
  e9da76:	49 89 5f 30          	mov    QWORD PTR [r15+0x30],rbx
  e9da7a:	bf b0 00 00 00       	mov    edi,0xb0
  e9da7f:	e8 7c 04 95 00       	call   17edf00 <_Znwm@plt>
  e9da84:	49 89 c4             	mov    r12,rax
  e9da87:	48 8d 05 ca bf 99 00 	lea    rax,[rip+0x99bfca]        # 1839a58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb9f0>
  e9da8e:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e9da92:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
  e9da97:	4c 8d ac 24 60 10 00 	lea    r13,[rsp+0x1060]
  e9da9e:	00 
  e9da9f:	4c 89 ee             	mov    rsi,r13
  e9daa2:	e8 5d 8a 00 00       	call   ea6504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91a>
  e9daa7:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
  e9daac:	4c 89 f6             	mov    rsi,r14
  e9daaf:	e8 0e 2e 08 00       	call   f208c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cd8>
  e9dab4:	4c 89 e7             	mov    rdi,r12
  e9dab7:	48 83 c7 70          	add    rdi,0x70
  e9dabb:	4c 89 fe             	mov    rsi,r15
  e9dabe:	e8 3d 89 e2 ff       	call   cc6400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133a0>
  e9dac3:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
  e9daca:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
  e9dad1:	00 
  e9dad2:	4c 89 a4 24 f0 0e 00 	mov    QWORD PTR [rsp+0xef0],r12
  e9dad9:	00 

## rsp+0x770 producer in enclosing e9 function
  e99d36:	00 01 00 
  e99d39:	4c 8d 84 24 f0 06 00 	lea    r8,[rsp+0x6f0]
  e99d40:	00 
  e99d41:	49 89 40 e0          	mov    QWORD PTR [r8-0x20],rax
  e99d45:	66 41 83 60 e8 00    	and    WORD PTR [r8-0x18],0x0
  e99d4b:	48 89 8c 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rcx
  e99d52:	00 
  e99d53:	41 83 60 ec 00       	and    DWORD PTR [r8-0x14],0x0
  e99d58:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
  e99d5d:	41 83 60 ef 00       	and    DWORD PTR [r8-0x11],0x0
  e99d62:	49 89 f4             	mov    r12,rsi
  e99d65:	41 c7 40 f4 00 01 00 	mov    DWORD PTR [r8-0xc],0x100
  e99d6c:	00 
  e99d6d:	48 8d 05 4c 40 96 00 	lea    rax,[rip+0x96404c]        # 17fddc0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe60>
  e99d74:	49 89 00             	mov    QWORD PTR [r8],rax
  e99d77:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
  e99d7b:	49 83 60 30 00       	and    QWORD PTR [r8+0x30],0x0
  e99d80:	49 89 ff             	mov    r15,rdi
  e99d83:	41 83 60 37 00       	and    DWORD PTR [r8+0x37],0x0
  e99d88:	48 8b b4 24 68 13 00 	mov    rsi,QWORD PTR [rsp+0x1368]
  e99d8f:	00 
  e99d90:	49 c7 40 40 96 00 00 	mov    QWORD PTR [r8+0x40],0x96
  e99d97:	00 
  e99d98:	41 c6 40 48 01       	mov    BYTE PTR [r8+0x48],0x1
  e99d9d:	48 b8 00 00 00 00 0a 	movabs rax,0xa00000000
  e99da4:	00 00 00 
  e99da7:	49 89 40 58          	mov    QWORD PTR [r8+0x58],rax
  e99dab:	41 83 60 50 00       	and    DWORD PTR [r8+0x50],0x0
  e99db0:	31 c0                	xor    eax,eax
  e99db2:	41 88 40 54          	mov    BYTE PTR [r8+0x54],al
  e99db6:	41 88 40 60          	mov    BYTE PTR [r8+0x60],al
  e99dba:	49 c7 40 68 50 00 00 	mov    QWORD PTR [r8+0x68],0x50
  e99dc1:	00 
  e99dc2:	49 83 60 70 00       	and    QWORD PTR [r8+0x70],0x0
  e99dc7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99dca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99dd1:	00 
  e99dd2:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e99dd5:	4c 89 a4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r12
  e99ddc:	00 
  e99ddd:	6a 38                	push   0x38
  e99ddf:	5f                   	pop    rdi
  e99de0:	e8 1b 41 95 00       	call   17edf00 <_Znwm@plt>
  e99de5:	4c 8b a4 24 58 12 00 	mov    r12,QWORD PTR [rsp+0x1258]
  e99dec:	00 
  e99ded:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
  e99df4:	00 
  e99df5:	66 0f ef c9          	pxor   xmm1,xmm1
  e99df9:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
  e99dfe:	48 8d 0d 7b 72 96 00 	lea    rcx,[rip+0x96727b]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
  e99e05:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99e08:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
  e99e0f:	00 
  e99e10:	66 0f 7f 8c 24 70 07 	movdqa XMMWORD PTR [rsp+0x770],xmm1
  e99e17:	00 00 
  e99e19:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
  e99e1d:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
  e99e21:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  e99e26:	48 89 58 30          	mov    QWORD PTR [rax+0x30],rbx
  e99e2a:	31 ff                	xor    edi,edi
  e99e2c:	e8 55 46 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99e31:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e99e38:	00 
  e99e39:	e8 48 46 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99e3e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e99e42:	48 8d 35 ee 9e 53 ff 	lea    rsi,[rip+0xffffffffff539eee]        # 3d3d37 <_ZTSN5boost17bad_function_callE@@Base+0x107d>
  e99e49:	48 8d 0d 00 9f 53 ff 	lea    rcx,[rip+0xffffffffff539f00]        # 3d3d50 <_ZTSN5boost17bad_function_callE@@Base+0x1096>
  e99e50:	6a 0b                	push   0xb
  e99e52:	5a                   	pop    rdx
  e99e53:	6a 40                	push   0x40
  e99e55:	41 58                	pop    r8
  e99e57:	45 31 c9             	xor    r9d,r9d
  e99e5a:	e8 2b d5 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e99e5f:	88 44 24 24          	mov    BYTE PTR [rsp+0x24],al
  e99e63:	f3 41 0f 6f 04 24    	movdqu xmm0,XMMWORD PTR [r12]
  e99e69:	66 0f 7f 84 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm0
  e99e70:	00 00 
  e99e72:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  e99e77:	48 85 c0             	test   rax,rax
  e99e7a:	74 05                	je     e99e81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61297>
  e99e7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e99e81:	66 0f ef c0          	pxor   xmm0,xmm0
  e99e85:	66 0f 7f 84 24 70 01 	movdqa XMMWORD PTR [rsp+0x170],xmm0
  e99e8c:	00 00 
  e99e8e:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
  e99e95:	00 00 
  e99e97:	48 83 bc 24 40 12 00 	cmp    QWORD PTR [rsp+0x1240],0x0
  e99e9e:	00 00 
  e99ea0:	74 73                	je     e99f15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6132b>
  e99ea2:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e99ea6:	48 8d 15 5f 93 53 ff 	lea    rdx,[rip+0xffffffffff53935f]        # 3d320c <_ZTSN5boost17bad_function_callE@@Base+0x552>
  e99ead:	4c 8d 05 6c 93 53 ff 	lea    r8,[rip+0xffffffffff53936c]        # 3d3220 <_ZTSN5boost17bad_function_callE@@Base+0x566>
  e99eb4:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e99ebb:	00 
  e99ebc:	6a 0b                	push   0xb
  e99ebe:	59                   	pop    rcx
  e99ebf:	6a 11                	push   0x11
  e99ec1:	41 59                	pop    r9
  e99ec3:	48 89 df             	mov    rdi,rbx
  e99ec6:	e8 fd d5 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e99ecb:	40 b5 01             	mov    bpl,0x1
  e99ece:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
  e99ed2:	74 32                	je     e99f06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6131c>
  e99ed4:	48 8d 35 60 93 53 ff 	lea    rsi,[rip+0xffffffffff539360]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
  e99edb:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99ee2:	00 
  e99ee3:	e8 67 19 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99ee8:	84 c0                	test   al,al
  e99eea:	75 1a                	jne    e99f06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6131c>
  e99eec:	48 8d 35 3f 93 53 ff 	lea    rsi,[rip+0xffffffffff53933f]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
  e99ef3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99efa:	00 
  e99efb:	e8 4f 19 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99f00:	89 c5                	mov    ebp,eax
  e99f02:	40 80 f5 01          	xor    bpl,0x1
  e99f06:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99f0d:	00 
  e99f0e:	e8 1d ce c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e99f13:	eb 02                	jmp    e99f17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6132d>
  e99f15:	31 ed                	xor    ebp,ebp
  e99f17:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e99f1b:	48 8d 15 5f 9b 53 ff 	lea    rdx,[rip+0xffffffffff539b5f]        # 3d3a81 <_ZTSN5boost17bad_function_callE@@Base+0xdc7>
  e99f22:	4c 8d 05 67 9b 53 ff 	lea    r8,[rip+0xffffffffff539b67]        # 3d3a90 <_ZTSN5boost17bad_function_callE@@Base+0xdd6>
  e99f29:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e99f30:	00 
  e99f31:	6a 0b                	push   0xb
  e99f33:	59                   	pop    rcx
  e99f34:	6a 27                	push   0x27
  e99f36:	41 59                	pop    r9
  e99f38:	48 89 df             	mov    rdi,rbx
  e99f3b:	e8 88 d5 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e99f40:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
  e99f44:	74 18                	je     e99f5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61374>
  e99f46:	48 8d 35 ee 92 53 ff 	lea    rsi,[rip+0xffffffffff5392ee]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
  e99f4d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99f54:	00 
  e99f55:	e8 f5 18 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99f5a:	89 c3                	mov    ebx,eax
  e99f5c:	eb 02                	jmp    e99f60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61376>
  e99f5e:	31 db                	xor    ebx,ebx
  e99f60:	4c 89 bc 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r15
  e99f67:	00 
  e99f68:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99f6f:	00 
  e99f70:	e8 bb cd c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e99f75:	88 9c 24 29 07 00 00 	mov    BYTE PTR [rsp+0x729],bl
  e99f7c:	89 ac 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ebp
  e99f83:	89 e8                	mov    eax,ebp
  e99f85:	34 01                	xor    al,0x1
  e99f87:	88 84 24 e7 06 00 00 	mov    BYTE PTR [rsp+0x6e7],al
  e99f8e:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
  e99f95:	00 
  e99f96:	48 8b 18             	mov    rbx,QWORD PTR [rax]
  e99f99:	bf 60 01 00 00       	mov    edi,0x160
  e99f9e:	e8 5d 3f 95 00       	call   17edf00 <_Znwm@plt>
  e99fa3:	49 89 c5             	mov    r13,rax
  e99fa6:	66 0f ef c0          	pxor   xmm0,xmm0
  e99faa:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e99faf:	48 8d 05 12 0e 97 00 	lea    rax,[rip+0x970e12]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
  e99fb6:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  e99fba:	48 8d 05 8f 96 97 00 	lea    rax,[rip+0x97968f]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
  e99fc1:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e99fc8:	00 
  e99fc9:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99fcc:	48 8d 05 37 68 02 00 	lea    rax,[rip+0x26837]        # ec080a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87c20>
  e99fd3:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e99fd7:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
  e99fdb:	48 8d 05 1e 74 99 00 	lea    rax,[rip+0x99741e]        # 1831400 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3398>
  e99fe2:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  e99fe6:	4c 8d a4 24 00 0d 00 	lea    r12,[rsp+0xd00]
  e99fed:	00 
  e99fee:	4c 89 e7             	mov    rdi,r12
  e99ff1:	e8 20 b6 00 00       	call   ea5616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ca2c>
  e99ff6:	66 41 c7 45 30 4c 00 	mov    WORD PTR [r13+0x30],0x4c
  e99ffd:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e9a002:	49 89 45 38          	mov    QWORD PTR [r13+0x38],rax
  e9a006:	49 89 5d 40          	mov    QWORD PTR [r13+0x40],rbx
  e9a00a:	49 8d 5d 48          	lea    rbx,[r13+0x48]
  e9a00e:	48 89 df             	mov    rdi,rbx
  e9a011:	e8 78 e2 c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e9a016:	4d 8d b5 a0 00 00 00 	lea    r14,[r13+0xa0]
  e9a01d:	66 0f ef c0          	pxor   xmm0,xmm0
  e9a021:	66 41 0f 7f 85 b0 00 	movdqa XMMWORD PTR [r13+0xb0],xmm0
  e9a028:	00 00 
  e9a02a:	66 41 0f 7f 85 a0 00 	movdqa XMMWORD PTR [r13+0xa0],xmm0
  e9a031:	00 00 
  e9a033:	41 c7 85 c0 00 00 00 	mov    DWORD PTR [r13+0xc0],0x3f800000
  e9a03a:	00 00 80 3f 
  e9a03e:	4d 8d bd d0 00 00 00 	lea    r15,[r13+0xd0]
  e9a045:	4c 89 ff             	mov    rdi,r15
  e9a048:	4c 89 e6             	mov    rsi,r12
  e9a04b:	e8 c6 b5 00 00       	call   ea5616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ca2c>
  e9a050:	49 8d bd 00 01 00 00 	lea    rdi,[r13+0x100]
  e9a057:	48 8d 35 55 8e 4c ff 	lea    rsi,[rip+0xffffffffff4c8e55]        # 362eb3 <_ZTSSt12bad_any_cast@@Base-0x2d315>
  e9a05e:	6a 13                	push   0x13
  e9a060:	5a                   	pop    rdx
  e9a061:	e8 b4 29 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  e9a066:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
  e9a06d:	00 
  e9a06e:	49 8d 6d 20          	lea    rbp,[r13+0x20]
  e9a072:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9a076:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
  e9a07a:	f3 41 0f 7f 85 18 01 	movdqu XMMWORD PTR [r13+0x118],xmm0
  e9a081:	00 00 
  e9a083:	48 85 c0             	test   rax,rax
  e9a086:	74 05                	je     e9a08d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x614a3>
  e9a088:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9a08d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
  e9a094:	00 
  e9a095:	e8 d0 fe bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9a09a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9a09e:	66 41 0f 7f 85 30 01 	movdqa XMMWORD PTR [r13+0x130],xmm0
  e9a0a5:	00 00 
  e9a0a7:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0
  e9a0ae:	00 
  e9a0af:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
  e9a0b4:	4d 8d b5 48 01 00 00 	lea    r14,[r13+0x148]
  e9a0bb:	4c 89 f7             	mov    rdi,r14
  e9a0be:	e8 33 f9 93 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e9a0c3:	4c 8d 84 24 e0 03 00 	lea    r8,[rsp+0x3e0]
  e9a0ca:	00 
  e9a0cb:	49 89 28             	mov    QWORD PTR [r8],rbp
  e9a0ce:	48 8d 35 bc 2f c0 ff 	lea    rsi,[rip+0xffffffffffc02fbc]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e9a0d5:	48 8d 0d 7e b5 00 00 	lea    rcx,[rip+0xb57e]        # ea565a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ca70>
  e9a0dc:	31 c0                	xor    eax,eax
  e9a0de:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e9a0e3:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
  e9a0ea:	00 
  e9a0eb:	6a 08                	push   0x8
  e9a0ed:	41 59                	pop    r9
  e9a0ef:	4c 89 ff             	mov    rdi,r15
  e9a0f2:	31 d2                	xor    edx,edx
  e9a0f4:	e8 9b 06 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e9a0f9:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
  e9a100:	00 
  e9a101:	4c 89 e7             	mov    rdi,r12
  e9a104:	4c 89 fe             	mov    rsi,r15
  e9a107:	e8 2e 06 94 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  e9a10c:	4c 8d ac 24 d0 0e 00 	lea    r13,[rsp+0xed0]
  e9a113:	00 
  e9a114:	4c 89 ef             	mov    rdi,r13
  e9a117:	48 89 de             	mov    rsi,rbx
  e9a11a:	4c 89 e2             	mov    rdx,r12
  e9a11d:	e8 a8 fe 93 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
  e9a122:	4c 89 e7             	mov    rdi,r12
  e9a125:	e8 be 06 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9a12a:	4c 89 f7             	mov    rdi,r14
  e9a12d:	4c 89 ee             	mov    rsi,r13
  e9a130:	e8 bd fa 93 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
  e9a135:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e9a139:	e8 48 43 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9a13e:	4c 89 ff             	mov    rdi,r15
  e9a141:	e8 a2 06 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9a146:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
  e9a14d:	00 
  e9a14e:	e8 17 fe bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9a153:	31 ff                	xor    edi,edi
  e9a155:	e8 c2 42 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9a15a:	4c 8b bc 24 48 12 00 	mov    r15,QWORD PTR [rsp+0x1248]
  e9a161:	00 
  e9a162:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  e9a165:	48 8d 35 83 a3 53 ff 	lea    rsi,[rip+0xffffffffff53a383]        # 3d44ef <_ZTSN5boost17bad_function_callE@@Base+0x1835>
  e9a16c:	48 8d 0d 8d a3 53 ff 	lea    rcx,[rip+0xffffffffff53a38d]        # 3d4500 <_ZTSN5boost17bad_function_callE@@Base+0x1846>
  e9a173:	6a 0b                	push   0xb
  e9a175:	41 5c                	pop    r12
  e9a177:	6a 29                	push   0x29
  e9a179:	41 58                	pop    r8
  e9a17b:	4c 89 e2             	mov    rdx,r12
  e9a17e:	45 31 c9             	xor    r9d,r9d
  e9a181:	e8 04 d2 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a186:	88 44 24 10          	mov    BYTE PTR [rsp+0x10],al
  e9a18a:	88 84 24 66 07 00 00 	mov    BYTE PTR [rsp+0x766],al
  e9a191:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  e9a194:	48 8d 35 16 95 53 ff 	lea    rsi,[rip+0xffffffffff539516]        # 3d36b1 <_ZTSN5boost17bad_function_callE@@Base+0x9f7>
  e9a19b:	48 8d 0d 1e 95 53 ff 	lea    rcx,[rip+0xffffffffff53951e]        # 3d36c0 <_ZTSN5boost17bad_function_callE@@Base+0xa06>
  e9a1a2:	6a 1b                	push   0x1b
  e9a1a4:	41 58                	pop    r8
  e9a1a6:	4c 89 e2             	mov    rdx,r12
  e9a1a9:	45 31 c9             	xor    r9d,r9d
  e9a1ac:	e8 d9 d1 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a1b1:	41 89 c5             	mov    r13d,eax
  e9a1b4:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  e9a1b7:	48 8d 35 8b 95 53 ff 	lea    rsi,[rip+0xffffffffff53958b]        # 3d3749 <_ZTSN5boost17bad_function_callE@@Base+0xa8f>
  e9a1be:	48 8d 0d 9b 95 53 ff 	lea    rcx,[rip+0xffffffffff53959b]        # 3d3760 <_ZTSN5boost17bad_function_callE@@Base+0xaa6>
  e9a1c5:	6a 27                	push   0x27
  e9a1c7:	41 58                	pop    r8
  e9a1c9:	6a 01                	push   0x1
  e9a1cb:	41 5e                	pop    r14
  e9a1cd:	4c 89 e2             	mov    rdx,r12
--
  e9a1ef:	41 58                	pop    r8
  e9a1f1:	4c 89 e2             	mov    rdx,r12
  e9a1f4:	45 89 f1             	mov    r9d,r14d
  e9a1f7:	e8 8e d1 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a1fc:	88 44 24 50          	mov    BYTE PTR [rsp+0x50],al
  e9a200:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  e9a203:	48 8d 35 12 9c 53 ff 	lea    rsi,[rip+0xffffffffff539c12]        # 3d3e1c <_ZTSN5boost17bad_function_callE@@Base+0x1162>
  e9a20a:	48 8d 0d 1f 9c 53 ff 	lea    rcx,[rip+0xffffffffff539c1f]        # 3d3e30 <_ZTSN5boost17bad_function_callE@@Base+0x1176>
  e9a211:	6a 30                	push   0x30
  e9a213:	5b                   	pop    rbx
  e9a214:	4c 89 e2             	mov    rdx,r12
  e9a217:	49 89 d8             	mov    r8,rbx
  e9a21a:	45 31 c9             	xor    r9d,r9d
  e9a21d:	e8 68 d1 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a222:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
  e9a226:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  e9a229:	48 8d 35 31 9c 53 ff 	lea    rsi,[rip+0xffffffffff539c31]        # 3d3e61 <_ZTSN5boost17bad_function_callE@@Base+0x11a7>
  e9a230:	48 8d 0d 39 9c 53 ff 	lea    rcx,[rip+0xffffffffff539c39]        # 3d3e70 <_ZTSN5boost17bad_function_callE@@Base+0x11b6>
  e9a237:	4c 89 e2             	mov    rdx,r12
  e9a23a:	49 89 d8             	mov    r8,rbx
  e9a23d:	45 31 c9             	xor    r9d,r9d
  e9a240:	e8 45 d1 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a245:	88 84 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],al
  e9a24c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  e9a24f:	48 8d 35 4b 9c 53 ff 	lea    rsi,[rip+0xffffffffff539c4b]        # 3d3ea1 <_ZTSN5boost17bad_function_callE@@Base+0x11e7>
  e9a256:	48 8d 0d 53 9c 53 ff 	lea    rcx,[rip+0xffffffffff539c53]        # 3d3eb0 <_ZTSN5boost17bad_function_callE@@Base+0x11f6>
  e9a25d:	6a 2a                	push   0x2a
  e9a25f:	41 58                	pop    r8
  e9a261:	4c 89 e2             	mov    rdx,r12
  e9a264:	45 31 c9             	xor    r9d,r9d
  e9a267:	e8 1e d1 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a26c:	88 44 24 30          	mov    BYTE PTR [rsp+0x30],al
  e9a270:	49 8b 37             	mov    rsi,QWORD PTR [r15]
  e9a273:	48 8d 15 b0 9e 53 ff 	lea    rdx,[rip+0xffffffffff539eb0]        # 3d412a <_ZTSN5boost17bad_function_callE@@Base+0x1470>
  e9a27a:	4c 8d 05 bf 9e 53 ff 	lea    r8,[rip+0xffffffffff539ebf]        # 3d4140 <_ZTSN5boost17bad_function_callE@@Base+0x1486>
  e9a281:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9a288:	00 
  e9a289:	6a 1e                	push   0x1e
  e9a28b:	41 59                	pop    r9
  e9a28d:	48 89 df             	mov    rdi,rbx
  e9a290:	4c 89 e1             	mov    rcx,r12
  e9a293:	e8 30 d2 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e9a298:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
  e9a29c:	48 89 ac 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rbp
  e9a2a3:	00 
  e9a2a4:	44 88 6c 24 78       	mov    BYTE PTR [rsp+0x78],r13b
  e9a2a9:	74 4b                	je     e9a2f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6170c>
  e9a2ab:	48 8d 35 fd 06 4b ff 	lea    rsi,[rip+0xffffffffff4b06fd]        # 34a9af <_ZTSSt12bad_any_cast@@Base-0x45819>
  e9a2b2:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9a2b9:	00 
  e9a2ba:	e8 90 15 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e9a2bf:	84 c0                	test   al,al
  e9a2c1:	74 17                	je     e9a2da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616f0>
  e9a2c3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9a2ca:	00 
  e9a2cb:	e8 60 ca c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e9a2d0:	6a 05                	push   0x5
  e9a2d2:	58                   	pop    rax
  e9a2d3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e9a2d8:	eb 29                	jmp    e9a303 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61719>
  e9a2da:	48 8d 35 bf 91 53 ff 	lea    rsi,[rip+0xffffffffff5391bf]        # 3d34a0 <_ZTSN5boost17bad_function_callE@@Base+0x7e6>
  e9a2e1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9a2e8:	00 
  e9a2e9:	e8 61 15 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e9a2ee:	84 c0                	test   al,al
  e9a2f0:	0f 84 e7 14 00 00    	je     e9b7dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62bf3>
  e9a2f6:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9a2fd:	00 
  e9a2fe:	e8 2d ca c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e9a303:	41 b5 01             	mov    r13b,0x1
  e9a306:	48 8b ac 24 48 12 00 	mov    rbp,QWORD PTR [rsp+0x1248]
  e9a30d:	00 
  e9a30e:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  e9a312:	48 8d 35 ed 9e 53 ff 	lea    rsi,[rip+0xffffffffff539eed]        # 3d4206 <_ZTSN5boost17bad_function_callE@@Base+0x154c>
  e9a319:	48 8d 0d 00 9f 53 ff 	lea    rcx,[rip+0xffffffffff539f00]        # 3d4220 <_ZTSN5boost17bad_function_callE@@Base+0x1566>
  e9a320:	6a 0b                	push   0xb
  e9a322:	41 5f                	pop    r15
  e9a324:	6a 28                	push   0x28
  e9a326:	41 58                	pop    r8
  e9a328:	4c 89 fa             	mov    rdx,r15
  e9a32b:	45 31 c9             	xor    r9d,r9d
  e9a32e:	e8 57 d0 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a333:	41 89 c4             	mov    r12d,eax
  e9a336:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  e9a33a:	48 8d 35 88 9e 53 ff 	lea    rsi,[rip+0xffffffffff539e88]        # 3d41c9 <_ZTSN5boost17bad_function_callE@@Base+0x150f>
  e9a341:	48 8d 0d 98 9e 53 ff 	lea    rcx,[rip+0xffffffffff539e98]        # 3d41e0 <_ZTSN5boost17bad_function_callE@@Base+0x1526>
  e9a348:	6a 25                	push   0x25
  e9a34a:	41 58                	pop    r8
  e9a34c:	4c 89 fa             	mov    rdx,r15
  e9a34f:	45 31 c9             	xor    r9d,r9d
  e9a352:	e8 33 d0 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a357:	89 c3                	mov    ebx,eax
  e9a359:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  e9a35d:	48 8d 35 e5 9e 53 ff 	lea    rsi,[rip+0xffffffffff539ee5]        # 3d4249 <_ZTSN5boost17bad_function_callE@@Base+0x158f>
  e9a364:	48 8d 0d f5 9e 53 ff 	lea    rcx,[rip+0xffffffffff539ef5]        # 3d4260 <_ZTSN5boost17bad_function_callE@@Base+0x15a6>
  e9a36b:	6a 1e                	push   0x1e
  e9a36d:	41 58                	pop    r8
  e9a36f:	4c 89 fa             	mov    rdx,r15
  e9a372:	45 31 c9             	xor    r9d,r9d
  e9a375:	e8 10 d0 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a37a:	84 c0                	test   al,al
  e9a37c:	75 21                	jne    e9a39f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x617b5>
  e9a37e:	40 8a 6c 24 10       	mov    bpl,BYTE PTR [rsp+0x10]
  e9a383:	89 e9                	mov    ecx,ebp
  e9a385:	80 f1 01             	xor    cl,0x1
  e9a388:	75 1a                	jne    e9a3a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x617ba>
  e9a38a:	48 8b bc 24 38 13 00 	mov    rdi,QWORD PTR [rsp+0x1338]
  e9a391:	00 
  e9a392:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9a395:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
  e9a39b:	34 01                	xor    al,0x1
  e9a39d:	eb 05                	jmp    e9a3a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x617ba>
  e9a39f:	40 8a 6c 24 10       	mov    bpl,BYTE PTR [rsp+0x10]
  e9a3a4:	0f b6 4c 24 78       	movzx  ecx,BYTE PTR [rsp+0x78]
  e9a3a9:	66 0f 6e c1          	movd   xmm0,ecx
  e9a3ad:	0f b6 4c 24 40       	movzx  ecx,BYTE PTR [rsp+0x40]
  e9a3b2:	66 0f 3a 20 c1 01    	pinsrb xmm0,ecx,0x1
  e9a3b8:	0f b6 4c 24 50       	movzx  ecx,BYTE PTR [rsp+0x50]
  e9a3bd:	66 0f 3a 20 c1 02    	pinsrb xmm0,ecx,0x2
  e9a3c3:	0f b6 4c 24 70       	movzx  ecx,BYTE PTR [rsp+0x70]
  e9a3c8:	66 0f 3a 20 c1 03    	pinsrb xmm0,ecx,0x3
  e9a3ce:	66 0f 7e 84 24 d4 06 	movd   DWORD PTR [rsp+0x6d4],xmm0
--
  e9a53c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9a540:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
  e9a544:	f3 41 0f 7f 85 18 01 	movdqu XMMWORD PTR [r13+0x118],xmm0
  e9a54b:	00 00 
  e9a54d:	48 85 c0             	test   rax,rax
  e9a550:	74 05                	je     e9a557 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6196d>
  e9a552:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9a557:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
  e9a55e:	00 
  e9a55f:	e8 06 fa bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9a564:	66 0f ef c0          	pxor   xmm0,xmm0
  e9a568:	66 41 0f 7f 85 30 01 	movdqa XMMWORD PTR [r13+0x130],xmm0
  e9a56f:	00 00 
  e9a571:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13
  e9a576:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0
  e9a57d:	00 
  e9a57e:	48 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rbp
  e9a585:	00 
  e9a586:	4c 8d b5 48 01 00 00 	lea    r14,[rbp+0x148]
  e9a58d:	4c 89 f7             	mov    rdi,r14
  e9a590:	e8 61 f4 93 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e9a595:	4c 8d 84 24 e0 03 00 	lea    r8,[rsp+0x3e0]
  e9a59c:	00 
  e9a59d:	4c 89 bc 24 48 01 00 	mov    QWORD PTR [rsp+0x148],r15
  e9a5a4:	00 
  e9a5a5:	4d 89 38             	mov    QWORD PTR [r8],r15
  e9a5a8:	48 8d 35 e2 2a c0 ff 	lea    rsi,[rip+0xffffffffffc02ae2]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e9a5af:	48 8d 0d f8 b4 00 00 	lea    rcx,[rip+0xb4f8]        # ea5aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6cec4>
  e9a5b6:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
  e9a5bd:	00 
  e9a5be:	6a 08                	push   0x8
  e9a5c0:	41 59                	pop    r9
  e9a5c2:	4c 89 ff             	mov    rdi,r15
  e9a5c5:	31 d2                	xor    edx,edx
  e9a5c7:	e8 c8 01 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e9a5cc:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
  e9a5d3:	00 
  e9a5d4:	4c 89 e7             	mov    rdi,r12
  e9a5d7:	4c 89 fe             	mov    rsi,r15
  e9a5da:	e8 5b 01 94 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  e9a5df:	4c 8d ac 24 d0 0e 00 	lea    r13,[rsp+0xed0]
  e9a5e6:	00 
  e9a5e7:	4c 89 ef             	mov    rdi,r13
  e9a5ea:	48 89 de             	mov    rsi,rbx
  e9a5ed:	4c 89 e2             	mov    rdx,r12
  e9a5f0:	e8 d5 f9 93 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
  e9a5f5:	4c 89 e7             	mov    rdi,r12
  e9a5f8:	e8 eb 01 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9a5fd:	4c 89 f7             	mov    rdi,r14
  e9a600:	4c 89 ee             	mov    rsi,r13
  e9a603:	e8 ea f5 93 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
  e9a608:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e9a60c:	e8 75 3e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9a611:	4c 89 ff             	mov    rdi,r15
  e9a614:	e8 cf 01 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9a619:	48 8d 9c 24 30 0b 00 	lea    rbx,[rsp+0xb30]
  e9a620:	00 
  e9a621:	48 89 df             	mov    rdi,rbx
  e9a624:	e8 41 f9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9a629:	31 ff                	xor    edi,edi
  e9a62b:	e8 ec 3d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9a630:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
  e9a637:	00 
  e9a638:	4c 8b 30             	mov    r14,QWORD PTR [rax]
  e9a63b:	bf 60 01 00 00       	mov    edi,0x160
  e9a640:	e8 bb 38 95 00       	call   17edf00 <_Znwm@plt>
  e9a645:	49 89 c7             	mov    r15,rax
  e9a648:	49 89 c5             	mov    r13,rax
  e9a64b:	66 0f ef c0          	pxor   xmm0,xmm0
  e9a64f:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
  e9a655:	48 8d 05 6c 07 97 00 	lea    rax,[rip+0x97076c]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
  e9a65c:	49 89 07             	mov    QWORD PTR [r15],rax
  e9a65f:	48 8d 05 ea 8f 97 00 	lea    rax,[rip+0x978fea]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
  e9a666:	48 89 84 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rax
  e9a66d:	00 
  e9a66e:	48 8d 05 28 20 12 00 	lea    rax,[rip+0x122028]        # fbc69d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183ab3>
  e9a675:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
  e9a67c:	00 
  e9a67d:	48 89 9c 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],rbx
  e9a684:	00 
  e9a685:	48 8d 05 7c 6e 99 00 	lea    rax,[rip+0x996e7c]        # 1831508 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x34a0>
  e9a68c:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
  e9a690:	4c 8d a4 24 00 0d 00 	lea    r12,[rsp+0xd00]
  e9a697:	00 
  e9a698:	4c 89 e7             	mov    rdi,r12
  e9a69b:	48 89 de             	mov    rsi,rbx
  e9a69e:	e8 0d b7 00 00       	call   ea5db0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d1c6>
  e9a6a3:	66 41 c7 47 30 0b 00 	mov    WORD PTR [r15+0x30],0xb
  e9a6aa:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e9a6af:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
  e9a6b3:	4d 89 77 40          	mov    QWORD PTR [r15+0x40],r14
--
  e9a726:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
  e9a72a:	f3 41 0f 7f 85 18 01 	movdqu XMMWORD PTR [r13+0x118],xmm0
  e9a731:	00 00 
  e9a733:	48 85 c0             	test   rax,rax
  e9a736:	74 05                	je     e9a73d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61b53>
  e9a738:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9a73d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
  e9a744:	00 
  e9a745:	e8 20 f8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9a74a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9a74e:	66 41 0f 7f 85 30 01 	movdqa XMMWORD PTR [r13+0x130],xmm0
  e9a755:	00 00 
  e9a757:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
  e9a75c:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0
  e9a763:	00 
  e9a764:	48 89 ac 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rbp
  e9a76b:	00 
  e9a76c:	4c 8d b5 48 01 00 00 	lea    r14,[rbp+0x148]
  e9a773:	4c 89 f7             	mov    rdi,r14
  e9a776:	e8 7b f2 93 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e9a77b:	4c 8d 84 24 e0 03 00 	lea    r8,[rsp+0x3e0]
  e9a782:	00 
  e9a783:	4c 89 bc 24 40 01 00 	mov    QWORD PTR [rsp+0x140],r15
  e9a78a:	00 
  e9a78b:	4d 89 38             	mov    QWORD PTR [r8],r15
  e9a78e:	48 8d 35 fc 28 c0 ff 	lea    rsi,[rip+0xffffffffffc028fc]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e9a795:	48 8d 0d 58 b6 00 00 	lea    rcx,[rip+0xb658]        # ea5df4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d20a>
  e9a79c:	45 31 ed             	xor    r13d,r13d
  e9a79f:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
  e9a7a6:	00 
  e9a7a7:	6a 08                	push   0x8
  e9a7a9:	41 59                	pop    r9
  e9a7ab:	4c 89 ff             	mov    rdi,r15
  e9a7ae:	31 d2                	xor    edx,edx
  e9a7b0:	e8 df ff 93 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e9a7b5:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
  e9a7bc:	00 
  e9a7bd:	4c 89 e7             	mov    rdi,r12
  e9a7c0:	4c 89 fe             	mov    rsi,r15
  e9a7c3:	e8 72 ff 93 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  e9a7c8:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
  e9a7cf:	00 
  e9a7d0:	48 89 ef             	mov    rdi,rbp
  e9a7d3:	48 89 de             	mov    rsi,rbx
  e9a7d6:	4c 89 e2             	mov    rdx,r12
  e9a7d9:	e8 ec f7 93 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
  e9a7de:	4c 89 e7             	mov    rdi,r12
  e9a7e1:	e8 02 00 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9a7e6:	4c 89 f7             	mov    rdi,r14
  e9a7e9:	48 89 ee             	mov    rsi,rbp
  e9a7ec:	e8 01 f4 93 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
  e9a7f1:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
  e9a7f5:	e8 8c 3c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9a7fa:	4c 89 ff             	mov    rdi,r15
  e9a7fd:	e8 e6 ff 93 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9a802:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
  e9a809:	00 
  e9a80a:	e8 5b f7 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9a80f:	31 ff                	xor    edi,edi
  e9a811:	e8 06 3c c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9a816:	6a 20                	push   0x20
  e9a818:	5f                   	pop    rdi
  e9a819:	e8 e2 36 95 00       	call   17edf00 <_Znwm@plt>
  e9a81e:	48 8b 94 24 68 12 00 	mov    rdx,QWORD PTR [rsp+0x1268]
  e9a825:	00 
  e9a826:	66 0f ef c0          	pxor   xmm0,xmm0
  e9a82a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9a82f:	48 8d 0d 32 6d 99 00 	lea    rcx,[rip+0x996d32]        # 1831568 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe59788>
  e9a836:	48 89 08             	mov    QWORD PTR [rax],rcx
  e9a839:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
  e9a840:	00 
  e9a841:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e9a845:	4c 8b b4 24 48 12 00 	mov    r14,QWORD PTR [rsp+0x1248]
  e9a84c:	00 
  e9a84d:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  e9a850:	40 b5 01             	mov    bpl,0x1
  e9a853:	40 88 ac 24 21 07 00 	mov    BYTE PTR [rsp+0x721],bpl
  e9a85a:	00 
  e9a85b:	48 8d 35 80 8c 53 ff 	lea    rsi,[rip+0xffffffffff538c80]        # 3d34e2 <_ZTSN5boost17bad_function_callE@@Base+0x828>
  e9a862:	48 8d 0d 87 8c 53 ff 	lea    rcx,[rip+0xffffffffff538c87]        # 3d34f0 <_ZTSN5boost17bad_function_callE@@Base+0x836>
  e9a869:	6a 0b                	push   0xb
  e9a86b:	5b                   	pop    rbx
  e9a86c:	6a 1c                	push   0x1c
  e9a86e:	41 58                	pop    r8
  e9a870:	48 89 bc 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rdi
  e9a877:	00 
  e9a878:	48 89 da             	mov    rdx,rbx
  e9a87b:	45 31 c9             	xor    r9d,r9d
  e9a87e:	e8 a7 cb 74 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  e9a883:	89 84 24 cc 00 00 00 	mov    DWORD PTR [rsp+0xcc],eax
  e9a88a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  e9a88d:	e8 da b9 00 00       	call   ea626c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d682>
  e9a892:	89 84 24 c8 00 00 00 	mov    DWORD PTR [rsp+0xc8],eax
  e9a899:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  e9a89c:	e8 e9 b9 00 00       	call   ea628a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6a0>
  e9a8a1:	89 84 24 c4 00 00 00 	mov    DWORD PTR [rsp+0xc4],eax
  e9a8a8:	40 88 ac 24 20 07 00 	mov    BYTE PTR [rsp+0x720],bpl
  e9a8af:	00 
  e9a8b0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  e9a8b3:	48 8d 35 43 94 53 ff 	lea    rsi,[rip+0xffffffffff539443]        # 3d3cfd <_ZTSN5boost17bad_function_callE@@Base+0x1043>
  e9a8ba:	48 8d 0d 4f 94 53 ff 	lea    rcx,[rip+0xffffffffff53944f]        # 3d3d10 <_ZTSN5boost17bad_function_callE@@Base+0x1056>
  e9a8c1:	6a 26                	push   0x26
  e9a8c3:	41 58                	pop    r8
  e9a8c5:	6a 01                	push   0x1
  e9a8c7:	41 59                	pop    r9
  e9a8c9:	48 89 da             	mov    rdx,rbx
  e9a8cc:	e8 b9 ca 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a8d1:	88 84 24 42 07 00 00 	mov    BYTE PTR [rsp+0x742],al
  e9a8d8:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  e9a8db:	48 8d 35 a1 8d 53 ff 	lea    rsi,[rip+0xffffffffff538da1]        # 3d3683 <_ZTSN5boost17bad_function_callE@@Base+0x9c9>
  e9a8e2:	48 8d 0d a7 8d 53 ff 	lea    rcx,[rip+0xffffffffff538da7]        # 3d3690 <_ZTSN5boost17bad_function_callE@@Base+0x9d6>
  e9a8e9:	6a 20                	push   0x20
  e9a8eb:	41 58                	pop    r8
  e9a8ed:	48 89 da             	mov    rdx,rbx
  e9a8f0:	45 31 c9             	xor    r9d,r9d
  e9a8f3:	e8 92 ca 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a8f8:	88 84 24 22 07 00 00 	mov    BYTE PTR [rsp+0x722],al
  e9a8ff:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9a902:	48 8d 15 7f 8e 53 ff 	lea    rdx,[rip+0xffffffffff538e7f]        # 3d3788 <_ZTSN5boost17bad_function_callE@@Base+0xace>
  e9a909:	4c 8d 05 90 8e 53 ff 	lea    r8,[rip+0xffffffffff538e90]        # 3d37a0 <_ZTSN5boost17bad_function_callE@@Base+0xae6>
  e9a910:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
  e9a917:	00 
  e9a918:	6a 1f                	push   0x1f
  e9a91a:	41 59                	pop    r9
  e9a91c:	4c 89 f7             	mov    rdi,r14
  e9a91f:	48 89 d9             	mov    rcx,rbx
  e9a922:	e8 a1 cb 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e9a927:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  e9a92c:	74 18                	je     e9a946 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61d5c>
  e9a92e:	48 8d 35 06 89 53 ff 	lea    rsi,[rip+0xffffffffff538906]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
  e9a935:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9a93c:	00 
  e9a93d:	e8 0d 0f be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e9a942:	44 0f b6 e8          	movzx  r13d,al
  e9a946:	48 8b 9c 24 08 13 00 	mov    rbx,QWORD PTR [rsp+0x1308]
  e9a94d:	00 
  e9a94e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9a955:	00 
  e9a956:	e8 d5 c3 c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e9a95b:	44 89 ac 24 d0 06 00 	mov    DWORD PTR [rsp+0x6d0],r13d
  e9a962:	00 
  e9a963:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
  e9a96a:	00 
  e9a96b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9a96f:	e8 b4 75 00 00       	call   ea1f28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6933e>
  e9a974:	88 84 24 23 07 00 00 	mov    BYTE PTR [rsp+0x723],al
  e9a97b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9a97f:	48 8d 35 f7 8e 53 ff 	lea    rsi,[rip+0xffffffffff538ef7]        # 3d387d <_ZTSN5boost17bad_function_callE@@Base+0xbc3>
  e9a986:	48 8d 0d 03 8f 53 ff 	lea    rcx,[rip+0xffffffffff538f03]        # 3d3890 <_ZTSN5boost17bad_function_callE@@Base+0xbd6>
  e9a98d:	6a 0b                	push   0xb
  e9a98f:	41 5e                	pop    r14
  e9a991:	6a 26                	push   0x26
  e9a993:	41 58                	pop    r8
  e9a995:	4c 89 f2             	mov    rdx,r14
  e9a998:	45 31 c9             	xor    r9d,r9d
  e9a99b:	e8 ea c9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a9a0:	88 84 24 24 07 00 00 	mov    BYTE PTR [rsp+0x724],al
  e9a9a7:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9a9ab:	48 8d 35 57 8e 53 ff 	lea    rsi,[rip+0xffffffffff538e57]        # 3d3809 <_ZTSN5boost17bad_function_callE@@Base+0xb4f>
  e9a9b2:	48 8d 0d 67 8e 53 ff 	lea    rcx,[rip+0xffffffffff538e67]        # 3d3820 <_ZTSN5boost17bad_function_callE@@Base+0xb66>
  e9a9b9:	6a 18                	push   0x18
  e9a9bb:	41 58                	pop    r8
  e9a9bd:	4c 89 f2             	mov    rdx,r14
  e9a9c0:	45 31 c9             	xor    r9d,r9d
  e9a9c3:	e8 c2 c9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a9c8:	88 44 24 25          	mov    BYTE PTR [rsp+0x25],al
  e9a9cc:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9a9d0:	48 8d 35 46 8f 53 ff 	lea    rsi,[rip+0xffffffffff538f46]        # 3d391d <_ZTSN5boost17bad_function_callE@@Base+0xc63>
  e9a9d7:	48 8d 0d 52 8f 53 ff 	lea    rcx,[rip+0xffffffffff538f52]        # 3d3930 <_ZTSN5boost17bad_function_callE@@Base+0xc76>
  e9a9de:	6a 1e                	push   0x1e
  e9a9e0:	41 5f                	pop    r15
  e9a9e2:	4c 89 f2             	mov    rdx,r14
  e9a9e5:	4d 89 f8             	mov    r8,r15
  e9a9e8:	45 31 c9             	xor    r9d,r9d
  e9a9eb:	e8 9a c9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9a9f0:	88 84 24 26 07 00 00 	mov    BYTE PTR [rsp+0x726],al
  e9a9f7:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9a9fb:	48 8d 35 1a 90 53 ff 	lea    rsi,[rip+0xffffffffff53901a]        # 3d3a1c <_ZTSN5boost17bad_function_callE@@Base+0xd62>
  e9aa02:	48 8d 0d 27 90 53 ff 	lea    rcx,[rip+0xffffffffff539027]        # 3d3a30 <_ZTSN5boost17bad_function_callE@@Base+0xd76>
  e9aa09:	4c 89 f2             	mov    rdx,r14
  e9aa0c:	4d 89 f8             	mov    r8,r15
  e9aa0f:	45 31 c9             	xor    r9d,r9d
  e9aa12:	e8 73 c9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9aa17:	88 84 24 28 07 00 00 	mov    BYTE PTR [rsp+0x728],al
  e9aa1e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9aa22:	48 8d 35 98 90 53 ff 	lea    rsi,[rip+0xffffffffff539098]        # 3d3ac1 <_ZTSN5boost17bad_function_callE@@Base+0xe07>
  e9aa29:	48 8d 0d a0 90 53 ff 	lea    rcx,[rip+0xffffffffff5390a0]        # 3d3ad0 <_ZTSN5boost17bad_function_callE@@Base+0xe16>
  e9aa30:	6a 22                	push   0x22
  e9aa32:	41 58                	pop    r8
  e9aa34:	4c 89 f2             	mov    rdx,r14
  e9aa37:	45 31 c9             	xor    r9d,r9d
  e9aa3a:	e8 4b c9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
--
  e9ac57:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9ac5b:	48 8d 35 b3 92 53 ff 	lea    rsi,[rip+0xffffffffff5392b3]        # 3d3f15 <_ZTSN5boost17bad_function_callE@@Base+0x125b>
  e9ac62:	48 8d 0d c7 92 53 ff 	lea    rcx,[rip+0xffffffffff5392c7]        # 3d3f30 <_ZTSN5boost17bad_function_callE@@Base+0x1276>
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
  e9ad0a:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
  e9ad11:	00 
  e9ad12:	4c 89 f7             	mov    rdi,r14
  e9ad15:	e8 12 1d fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
  e9ad1a:	66 41 c7 46 30 00 01 	mov    WORD PTR [r14+0x30],0x100
  e9ad21:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
  e9ad28:	00 00 
  e9ad2a:	6a 60                	push   0x60
  e9ad2c:	5f                   	pop    rdi
  e9ad2d:	e8 ce 31 95 00       	call   17edf00 <_Znwm@plt>
  e9ad32:	48 89 c3             	mov    rbx,rax
  e9ad35:	48 8d 05 ac da 9f 00 	lea    rax,[rip+0x9fdaac]        # 18987e8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5728>
  e9ad3c:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9ad3f:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
  e9ad46:	00 
  e9ad47:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
  e9ad4b:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
  e9ad4f:	0f 57 c0             	xorps  xmm0,xmm0
  e9ad52:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  e9ad56:	48 89 df             	mov    rdi,rbx
  e9ad59:	48 83 c7 20          	add    rdi,0x20
  e9ad5d:	4c 89 f6             	mov    rsi,r14
  e9ad60:	e8 c7 1c fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
  e9ad65:	41 0f b7 47 40       	movzx  eax,WORD PTR [r15+0x40]
  e9ad6a:	66 89 43 50          	mov    WORD PTR [rbx+0x50],ax
  e9ad6e:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
  e9ad75:	00 
  e9ad76:	4c 89 ff             	mov    rdi,r15
  e9ad79:	e8 66 ae c9 ff       	call   b35be4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b84>
  e9ad7e:	48 83 bc 24 80 10 00 	cmp    QWORD PTR [rsp+0x1080],0x0
  e9ad85:	00 00 
  e9ad87:	74 5c                	je     e9ade5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x621fb>
  e9ad89:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9ad90:	00 
  e9ad91:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9ad98:	00 
  e9ad99:	e8 06 de 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
  e9ad9e:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
  e9ada5:	00 00 
  e9ada7:	6a 40                	push   0x40
  e9ada9:	5f                   	pop    rdi
  e9adaa:	e8 51 31 95 00       	call   17edf00 <_Znwm@plt>
  e9adaf:	48 89 c3             	mov    rbx,rax
  e9adb2:	48 8d 05 0f d9 9f 00 	lea    rax,[rip+0x9fd90f]        # 18986c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5608>
  e9adb9:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9adbc:	48 89 df             	mov    rdi,rbx
  e9adbf:	48 83 c7 10          	add    rdi,0x10
  e9adc3:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
  e9adca:	00 
  e9adcb:	4c 89 fe             	mov    rsi,r15
  e9adce:	e8 d1 dd 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
  e9add3:	48 89 9c 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rbx
  e9adda:	00 
  e9addb:	4c 89 ff             	mov    rdi,r15
  e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
  e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
  e9adec:	00 00 
  e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
  e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
  e9adfa:	00 
  e9adfb:	48 89 df             	mov    rdi,rbx
  e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
  e9ae0a:	00 
  e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
  e9ae29:	00 
  e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9ae2f:	31 ff                	xor    edi,edi
  e9ae31:	e8 50 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9ae36:	bf 00 01 00 00       	mov    edi,0x100
  e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
  e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
  e9ae47:	00 
  e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
  e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
  e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
  e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
  e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
  e9ae66:	00 
  e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
  e9ae6e:	00 
  e9ae6f:	49 89 c6             	mov    r14,rax
  e9ae72:	4c 89 e7             	mov    rdi,r12
  e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
  e9ae7a:	48 8d 05 57 67 99 00 	lea    rax,[rip+0x996757]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
  e9ae81:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9ae88:	00 
  e9ae89:	4c 89 bc 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],r15
  e9ae90:	00 
  e9ae91:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
  e9ae98:	00 
  e9ae99:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
  e9ae9e:	48 89 ef             	mov    rdi,rbp
  e9aea1:	4c 89 e6             	mov    rsi,r12
  e9aea4:	e8 3b b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
  e9aea9:	49 8d 7e 50          	lea    rdi,[r14+0x50]
  e9aead:	48 89 de             	mov    rsi,rbx
  e9aeb0:	e8 73 b4 00 00       	call   ea6328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d73e>
  e9aeb5:	66 0f ef c0          	pxor   xmm0,xmm0
  e9aeb9:	66 41 0f 7f 86 90 00 	movdqa XMMWORD PTR [r14+0x90],xmm0
  e9aec0:	00 00 
  e9aec2:	66 41 0f 7f 86 80 00 	movdqa XMMWORD PTR [r14+0x80],xmm0
  e9aec9:	00 00 
  e9aecb:	b8 00 00 80 3f       	mov    eax,0x3f800000
  e9aed0:	41 89 86 a0 00 00 00 	mov    DWORD PTR [r14+0xa0],eax
  e9aed7:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
  e9aede:	00 00 
  e9aee0:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
  e9aee7:	00 00 
  e9aee9:	41 89 86 c8 00 00 00 	mov    DWORD PTR [r14+0xc8],eax
  e9aef0:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
  e9aef7:	00 00 
  e9aef9:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
  e9af00:	00 00 
  e9af02:	4c 89 74 24 78       	mov    QWORD PTR [rsp+0x78],r14
  e9af07:	41 89 86 f0 00 00 00 	mov    DWORD PTR [r14+0xf0],eax
  e9af0e:	48 89 df             	mov    rdi,rbx
  e9af11:	e8 54 f0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9af16:	4c 89 e7             	mov    rdi,r12
  e9af19:	e8 4c f0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9af1e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9af22:	48 8d 35 df 93 53 ff 	lea    rsi,[rip+0xffffffffff5393df]        # 3d4308 <_ZTSN5boost17bad_function_callE@@Base+0x164e>
  e9af29:	48 8d 0d f0 93 53 ff 	lea    rcx,[rip+0xffffffffff5393f0]        # 3d4320 <_ZTSN5boost17bad_function_callE@@Base+0x1666>
  e9af30:	6a 0b                	push   0xb
  e9af32:	5b                   	pop    rbx
  e9af33:	6a 1b                	push   0x1b
  e9af35:	41 58                	pop    r8
  e9af37:	48 89 da             	mov    rdx,rbx
  e9af3a:	45 31 c9             	xor    r9d,r9d
  e9af3d:	e8 48 c4 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9af42:	88 84 24 62 07 00 00 	mov    BYTE PTR [rsp+0x762],al
  e9af49:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9af4d:	48 8d 35 e8 93 53 ff 	lea    rsi,[rip+0xffffffffff5393e8]        # 3d433c <_ZTSN5boost17bad_function_callE@@Base+0x1682>
--
  e9b100:	48 8d 0d a9 e2 99 00 	lea    rcx,[rip+0x99e2a9]        # 18393b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb348>
  e9b107:	48 89 08             	mov    QWORD PTR [rax],rcx
  e9b10a:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
  e9b10e:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
  e9b112:	4d 85 f6             	test   r14,r14
  e9b115:	74 05                	je     e9b11c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62532>
  e9b117:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9b11c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9b122:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
  e9b127:	48 85 db             	test   rbx,rbx
  e9b12a:	74 05                	je     e9b131 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62547>
  e9b12c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9b131:	40 88 68 28          	mov    BYTE PTR [rax+0x28],bpl
  e9b135:	48 89 84 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rax
  e9b13c:	00 
  e9b13d:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
  e9b144:	00 
  e9b145:	e8 c6 79 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e9b14a:	48 8d 35 bf 9e 53 ff 	lea    rsi,[rip+0xffffffffff539ebf]        # 3d5010 <_ZTSN5boost17bad_function_callE@@Base+0x2356>
  e9b151:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
  e9b158:	00 
  e9b159:	e8 e2 2d 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e9b15e:	48 8d ac 24 30 0b 00 	lea    rbp,[rsp+0xb30]
  e9b165:	00 
  e9b166:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9b16d:	00 
  e9b16e:	48 89 ef             	mov    rdi,rbp
  e9b171:	e8 9c dc ce ff       	call   b88e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5db2>
  e9b176:	4c 8d ac 24 d0 0e 00 	lea    r13,[rsp+0xed0]
  e9b17d:	00 
  e9b17e:	4c 8d b4 24 00 0d 00 	lea    r14,[rsp+0xd00]
  e9b185:	00 
  e9b186:	4c 89 ef             	mov    rdi,r13
  e9b189:	4c 89 f6             	mov    rsi,r14
  e9b18c:	e8 c5 dc ce ff       	call   b88e56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5df6>
  e9b191:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
  e9b198:	00 
  e9b199:	4c 8d bc 24 d0 0c 00 	lea    r15,[rsp+0xcd0]
  e9b1a0:	00 
  e9b1a1:	4c 89 e7             	mov    rdi,r12
  e9b1a4:	4c 89 fe             	mov    rsi,r15
  e9b1a7:	48 89 ea             	mov    rdx,rbp
  e9b1aa:	4c 89 e9             	mov    rcx,r13
  e9b1ad:	e8 94 cf ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
  e9b1b2:	4c 89 ef             	mov    rdi,r13
  e9b1b5:	e8 b0 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b1ba:	48 89 ef             	mov    rdi,rbp
  e9b1bd:	e8 a8 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b1c2:	4c 89 ff             	mov    rdi,r15
  e9b1c5:	e8 c6 2c 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9b1ca:	4c 89 f7             	mov    rdi,r14
  e9b1cd:	e8 98 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b1d2:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9b1d9:	00 
  e9b1da:	e8 8b ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b1df:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
  e9b1e6:	00 
  e9b1e7:	4c 89 e6             	mov    rsi,r12
  e9b1ea:	e8 09 3f ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
  e9b1ef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b1f6:	00 
  e9b1f7:	e8 72 d0 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
  e9b1fc:	48 89 df             	mov    rdi,rbx
  e9b1ff:	e8 82 32 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9b204:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9b209:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
  e9b210:	00 
  e9b211:	48 8b 84 24 60 13 00 	mov    rax,QWORD PTR [rsp+0x1360]
  e9b218:	00 
  e9b219:	48 8b 8c 24 18 13 00 	mov    rcx,QWORD PTR [rsp+0x1318]
  e9b220:	00 
  e9b221:	4c 8b 84 24 00 13 00 	mov    r8,QWORD PTR [rsp+0x1300]
  e9b228:	00 
  e9b229:	48 8b 9c 24 f8 12 00 	mov    rbx,QWORD PTR [rsp+0x12f8]
  e9b230:	00 
  e9b231:	48 8b b4 24 f0 12 00 	mov    rsi,QWORD PTR [rsp+0x12f0]
  e9b238:	00 
  e9b239:	48 8d 15 e0 63 99 00 	lea    rdx,[rip+0x9963e0]        # 1831620 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x35b8>
  e9b240:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
  e9b247:	00 
  e9b248:	48 89 17             	mov    QWORD PTR [rdi],rdx
  e9b24b:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  e9b24f:	48 89 7f 20          	mov    QWORD PTR [rdi+0x20],rdi
  e9b253:	48 8d 05 56 77 99 00 	lea    rax,[rip+0x997756]        # 18329b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4948>
  e9b25a:	48 89 84 24 d0 0e 00 	mov    QWORD PTR [rsp+0xed0],rax
  e9b261:	00 
  e9b262:	4c 89 84 24 d8 0e 00 	mov    QWORD PTR [rsp+0xed8],r8
  e9b269:	00 
  e9b26a:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
  e9b271:	00 
  e9b272:	48 89 84 24 f0 0e 00 	mov    QWORD PTR [rsp+0xef0],rax
  e9b279:	00 
  e9b27a:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  e9b27d:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
  e9b282:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9b286:	48 85 c0             	test   rax,rax
  e9b289:	74 05                	je     e9b290 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x626a6>
  e9b28b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9b290:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
  e9b297:	00 
  e9b298:	4c 8b b4 24 98 13 00 	mov    r14,QWORD PTR [rsp+0x1398]
  e9b29f:	00 
  e9b2a0:	48 8d 05 39 36 97 00 	lea    rax,[rip+0x973639]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e9b2a7:	48 89 84 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rax
  e9b2ae:	00 
  e9b2af:	48 8b 05 f2 67 a1 00 	mov    rax,QWORD PTR [rip+0xa167f2]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
  e9b2b6:	48 89 84 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rax
  e9b2bd:	00 
  e9b2be:	48 8d 84 24 e0 03 00 	lea    rax,[rsp+0x3e0]
  e9b2c5:	00 
  e9b2c6:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
  e9b2cd:	00 
  e9b2ce:	48 8d 0d 0b 36 97 00 	lea    rcx,[rip+0x97360b]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e9b2d5:	48 8d 84 24 a0 0e 00 	lea    rax,[rsp+0xea0]
  e9b2dc:	00 
--
  e9b3a4:	00 00 
  e9b3a6:	48 83 a4 24 60 05 00 	and    QWORD PTR [rsp+0x560],0x0
  e9b3ad:	00 00 
  e9b3af:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b3b3:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
  e9b3b9:	e8 36 b0 00 00       	call   ea63f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d80a>
  e9b3be:	89 c3                	mov    ebx,eax
  e9b3c0:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b3c4:	e8 49 b0 00 00       	call   ea6412 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d828>
  e9b3c9:	89 c5                	mov    ebp,eax
  e9b3cb:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b3cf:	e8 5c b0 00 00       	call   ea6430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d846>
  e9b3d4:	41 89 c6             	mov    r14d,eax
  e9b3d7:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b3db:	48 8d 35 83 91 53 ff 	lea    rsi,[rip+0xffffffffff539183]        # 3d4565 <_ZTSN5boost17bad_function_callE@@Base+0x18ab>
  e9b3e2:	48 8d 0d 97 91 53 ff 	lea    rcx,[rip+0xffffffffff539197]        # 3d4580 <_ZTSN5boost17bad_function_callE@@Base+0x18c6>
  e9b3e9:	6a 0b                	push   0xb
  e9b3eb:	5a                   	pop    rdx
  e9b3ec:	6a 47                	push   0x47
  e9b3ee:	41 58                	pop    r8
  e9b3f0:	45 31 c9             	xor    r9d,r9d
  e9b3f3:	e8 92 bf 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b3f8:	4c 89 e9             	mov    rcx,r13
  e9b3fb:	41 89 c5             	mov    r13d,eax
  e9b3fe:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  e9b401:	e8 48 b0 00 00       	call   ea644e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d864>
  e9b406:	48 63 db             	movsxd rbx,ebx
  e9b409:	4c 63 fd             	movsxd r15,ebp
  e9b40c:	4d 63 e6             	movsxd r12,r14d
  e9b40f:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9b415:	66 48 0f 7e c5       	movq   rbp,xmm0
  e9b41a:	45 0f b6 f5          	movzx  r14d,r13b
  e9b41e:	84 c0                	test   al,al
  e9b420:	74 4a                	je     e9b46c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62882>
  e9b422:	44 89 34 24          	mov    DWORD PTR [rsp],r14d
  e9b426:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b42d:	00 
  e9b42e:	48 89 ee             	mov    rsi,rbp
  e9b431:	48 8b 94 24 90 00 00 	mov    rdx,QWORD PTR [rsp+0x90]
  e9b438:	00 
  e9b439:	48 89 d9             	mov    rcx,rbx
  e9b43c:	4d 89 f8             	mov    r8,r15
  e9b43f:	4d 89 e1             	mov    r9,r12
  e9b442:	e8 8a 1d 3f 00       	call   128d1d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd2755>
  e9b447:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b44e:	00 
  e9b44f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9b456:	00 
  e9b457:	6a 60                	push   0x60
  e9b459:	5a                   	pop    rdx
  e9b45a:	e8 df fa 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b45f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b466:	00 
  e9b467:	e8 fe ea bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b46c:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
  e9b473:	00 
  e9b474:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b478:	48 8d 35 f4 7d 53 ff 	lea    rsi,[rip+0xffffffffff537df4]        # 3d3273 <_ZTSN5boost17bad_function_callE@@Base+0x5b9>
  e9b47f:	48 8d 0d fa 7d 53 ff 	lea    rcx,[rip+0xffffffffff537dfa]        # 3d3280 <_ZTSN5boost17bad_function_callE@@Base+0x5c6>
  e9b486:	6a 0b                	push   0xb
  e9b488:	5a                   	pop    rdx
  e9b489:	6a 2a                	push   0x2a
  e9b48b:	41 58                	pop    r8
  e9b48d:	45 31 c9             	xor    r9d,r9d
  e9b490:	e8 f5 be 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b495:	84 c0                	test   al,al
  e9b497:	74 4a                	je     e9b4e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x628f9>
  e9b499:	44 89 34 24          	mov    DWORD PTR [rsp],r14d
  e9b49d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b4a4:	00 
  e9b4a5:	48 89 ee             	mov    rsi,rbp
  e9b4a8:	48 8b 94 24 90 00 00 	mov    rdx,QWORD PTR [rsp+0x90]
  e9b4af:	00 
  e9b4b0:	48 89 d9             	mov    rcx,rbx
  e9b4b3:	4d 89 f8             	mov    r8,r15
  e9b4b6:	4d 89 e1             	mov    r9,r12
  e9b4b9:	e8 13 1d 3f 00       	call   128d1d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd2755>
  e9b4be:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b4c5:	00 
  e9b4c6:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9b4cd:	00 
  e9b4ce:	6a 1f                	push   0x1f
  e9b4d0:	5a                   	pop    rdx
  e9b4d1:	e8 68 fa 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b4d6:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b4dd:	00 
  e9b4de:	e8 87 ea bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b4e3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b4e7:	e8 80 af 00 00       	call   ea646c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d882>
  e9b4ec:	84 c0                	test   al,al
  e9b4ee:	74 41                	je     e9b531 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62947>
  e9b4f0:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
  e9b4f7:	00 
  e9b4f8:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  e9b4fb:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
  e9b4ff:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b506:	00 
  e9b507:	e8 b5 b3 14 00       	call   fe68c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1adcd7>
  e9b50c:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b513:	00 
  e9b514:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9b51b:	00 
  e9b51c:	6a 60                	push   0x60
  e9b51e:	5a                   	pop    rdx
  e9b51f:	e8 1a fa 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b524:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b52b:	00 
  e9b52c:	e8 39 ea bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b531:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b535:	48 8d 35 7c 7e 53 ff 	lea    rsi,[rip+0xffffffffff537e7c]        # 3d33b8 <_ZTSN5boost17bad_function_callE@@Base+0x6fe>
  e9b53c:	48 8d 0d 8d 7e 53 ff 	lea    rcx,[rip+0xffffffffff537e8d]        # 3d33d0 <_ZTSN5boost17bad_function_callE@@Base+0x716>
  e9b543:	6a 0b                	push   0xb
  e9b545:	5a                   	pop    rdx
  e9b546:	6a 2f                	push   0x2f
  e9b548:	41 58                	pop    r8
  e9b54a:	45 31 c9             	xor    r9d,r9d
  e9b54d:	e8 38 be 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b552:	84 c0                	test   al,al
  e9b554:	74 41                	je     e9b597 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x629ad>
  e9b556:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
  e9b55d:	00 
  e9b55e:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  e9b561:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
  e9b565:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b56c:	00 
  e9b56d:	e8 4f b3 14 00       	call   fe68c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1adcd7>
  e9b572:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b579:	00 
  e9b57a:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9b581:	00 
  e9b582:	6a 1d                	push   0x1d
  e9b584:	5a                   	pop    rdx
  e9b585:	e8 b4 f9 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b58a:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b591:	00 
  e9b592:	e8 d3 e9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b597:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b59b:	e8 ea ae 00 00       	call   ea648a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d8a0>
  e9b5a0:	84 c0                	test   al,al
  e9b5a2:	0f 84 94 00 00 00    	je     e9b63c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62a52>
  e9b5a8:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
  e9b5af:	00 
  e9b5b0:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e9b5b4:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
  e9b5ba:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
  e9b5be:	48 85 db             	test   rbx,rbx
  e9b5c1:	74 05                	je     e9b5c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x629de>
  e9b5c3:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9b5c8:	48 83 a4 24 90 07 00 	and    QWORD PTR [rsp+0x790],0x0
  e9b5cf:	00 00 
  e9b5d1:	6a 28                	push   0x28
  e9b5d3:	5f                   	pop    rdi
  e9b5d4:	e8 27 29 95 00       	call   17edf00 <_Znwm@plt>
  e9b5d9:	48 8d 0d 40 93 9a 00 	lea    rcx,[rip+0x9a9340]        # 1844920 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1008>
  e9b5e0:	48 89 08             	mov    QWORD PTR [rax],rcx
  e9b5e3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9b5e9:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9b5ee:	48 85 db             	test   rbx,rbx
  e9b5f1:	74 05                	je     e9b5f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62a0e>
  e9b5f3:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9b5f8:	48 c7 40 18 05 00 00 	mov    QWORD PTR [rax+0x18],0x5
  e9b5ff:	00 
  e9b600:	48 c7 40 20 f4 01 00 	mov    QWORD PTR [rax+0x20],0x1f4
  e9b607:	00 
  e9b608:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
  e9b60f:	00 
  e9b610:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  e9b614:	48 89 df             	mov    rdi,rbx
  e9b617:	e8 6a 2e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9b61c:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b623:	00 
  e9b624:	6a 02                	push   0x2
  e9b626:	5a                   	pop    rdx
  e9b627:	4c 89 f6             	mov    rsi,r14
  e9b62a:	e8 0f f9 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b62f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b636:	00 
  e9b637:	e8 2e e9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b63c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b640:	48 8d 35 f0 7d 53 ff 	lea    rsi,[rip+0xffffffffff537df0]        # 3d3437 <_ZTSN5boost17bad_function_callE@@Base+0x77d>
  e9b647:	48 8d 0d 02 7e 53 ff 	lea    rcx,[rip+0xffffffffff537e02]        # 3d3450 <_ZTSN5boost17bad_function_callE@@Base+0x796>
  e9b64e:	6a 0b                	push   0xb
  e9b650:	5a                   	pop    rdx
  e9b651:	6a 1d                	push   0x1d
  e9b653:	41 58                	pop    r8
  e9b655:	45 31 c9             	xor    r9d,r9d
  e9b658:	e8 2d bd 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b65d:	84 c0                	test   al,al
  e9b65f:	0f 84 4f 01 00 00    	je     e9b7b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62bca>
  e9b665:	bf 48 01 00 00       	mov    edi,0x148
  e9b66a:	e8 91 28 95 00       	call   17edf00 <_Znwm@plt>
  e9b66f:	48 89 c3             	mov    rbx,rax
  e9b672:	66 0f ef c0          	pxor   xmm0,xmm0
  e9b676:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9b67b:	48 8d 05 ee 90 99 00 	lea    rax,[rip+0x9990ee]        # 1834770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6708>
  e9b682:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9b685:	49 89 dc             	mov    r12,rbx
  e9b688:	49 83 c4 18          	add    r12,0x18
  e9b68c:	4c 89 e7             	mov    rdi,r12
  e9b68f:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  e9b694:	48 8b 94 24 f0 00 00 	mov    rdx,QWORD PTR [rsp+0xf0]
  e9b69b:	00 
  e9b69c:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
  e9b6a3:	00 
  e9b6a4:	e8 97 ba 04 00       	call   ee7140 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae556>
  e9b6a9:	31 ff                	xor    edi,edi
  e9b6ab:	e8 6c 2d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9b6b0:	bf 48 01 00 00       	mov    edi,0x148
  e9b6b5:	e8 46 28 95 00       	call   17edf00 <_Znwm@plt>
  e9b6ba:	49 89 c7             	mov    r15,rax
  e9b6bd:	66 0f ef c0          	pxor   xmm0,xmm0
  e9b6c1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9b6c6:	48 8d 05 6b 91 99 00 	lea    rax,[rip+0x99916b]        # 1834838 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x67d0>
  e9b6cd:	49 89 07             	mov    QWORD PTR [r15],rax
  e9b6d0:	4c 89 fd             	mov    rbp,r15
  e9b6d3:	48 83 c5 18          	add    rbp,0x18
  e9b6d7:	41 b8 e8 03 00 00    	mov    r8d,0x3e8
  e9b6dd:	48 89 ef             	mov    rdi,rbp
  e9b6e0:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  e9b6e5:	48 8b 94 24 f0 00 00 	mov    rdx,QWORD PTR [rsp+0xf0]
  e9b6ec:	00 
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
  e9b763:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
  e9b767:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
  e9b76b:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
  e9b772:	00 
  e9b773:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  e9b777:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9b77e:	00 
  e9b77f:	e8 8c 73 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e9b784:	4c 89 ff             	mov    rdi,r15
  e9b787:	e8 fa 2c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9b78c:	48 89 df             	mov    rdi,rbx
  e9b78f:	e8 f2 2c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9b794:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b79b:	00 
  e9b79c:	6a 3c                	push   0x3c
  e9b79e:	5a                   	pop    rdx
  e9b79f:	4c 89 f6             	mov    rsi,r14
  e9b7a2:	e8 97 f7 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b7a7:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b7ae:	00 
  e9b7af:	e8 b6 e7 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b7b4:	48 8b 84 24 50 05 00 	mov    rax,QWORD PTR [rsp+0x550]
  e9b7bb:	00 
  e9b7bc:	48 3b 84 24 58 05 00 	cmp    rax,QWORD PTR [rsp+0x558]
  e9b7c3:	00 
  e9b7c4:	74 50                	je     e9b816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62c2c>
  e9b7c6:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
  e9b7cd:	00 
  e9b7ce:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
  e9b7d5:	00 
  e9b7d6:	e8 09 f9 3e 00       	call   128b0e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0668>
  e9b7db:	eb 42                	jmp    e9b81f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62c35>
  e9b7dd:	48 8d 35 13 ac 59 ff 	lea    rsi,[rip+0xffffffffff59ac13]        # 4363f7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5be46>
  e9b7e4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b7eb:	00 
  e9b7ec:	e8 5e 00 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e9b7f1:	84 c0                	test   al,al
  e9b7f3:	0f 84 14 01 00 00    	je     e9b90d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d23>
  e9b7f9:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b800:	00 
  e9b801:	e8 2a b5 c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e9b806:	6a 02                	push   0x2
  e9b808:	58                   	pop    rax
  e9b809:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e9b80e:	45 31 ed             	xor    r13d,r13d
  e9b811:	e9 f0 ea ff ff       	jmp    e9a306 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6171c>
  e9b816:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
  e9b81d:	00 00 
  e9b81f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b823:	e8 80 aa 00 00       	call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
  e9b828:	84 c0                	test   al,al
  e9b82a:	0f 84 85 00 00 00    	je     e9b8b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ccb>
  e9b830:	48 8d 35 45 67 5b ff 	lea    rsi,[rip+0xffffffffff5b6745]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  e9b837:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9b83e:	00 
  e9b83f:	e8 3a e2 bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e9b844:	48 8b 84 24 78 12 00 	mov    rax,QWORD PTR [rsp+0x1278]
  e9b84b:	00 
  e9b84c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  e9b84f:	48 8d 15 aa 3e b5 00 	lea    rdx,[rip+0xb53eaa]        # 19ef700 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xe30>
  e9b856:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9b85d:	00 
  e9b85e:	48 8d 8c 24 60 10 00 	lea    rcx,[rsp+0x1060]
  e9b865:	00 
  e9b866:	48 89 df             	mov    rdi,rbx
  e9b869:	e8 82 77 77 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
  e9b86e:	48 89 df             	mov    rdi,rbx
  e9b871:	e8 ae 32 83 00       	call   16ceb24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82c90>
  e9b876:	89 c3                	mov    ebx,eax
  e9b878:	6a 40                	push   0x40
  e9b87a:	5f                   	pop    rdi
  e9b87b:	e8 80 26 95 00       	call   17edf00 <_Znwm@plt>
  e9b880:	49 89 c5             	mov    r13,rax
  e9b883:	0f b6 f3             	movzx  esi,bl
  e9b886:	48 8d 94 24 30 0b 00 	lea    rdx,[rsp+0xb30]
  e9b88d:	00 
  e9b88e:	48 89 c7             	mov    rdi,rax
  e9b891:	e8 34 2e 3f 00       	call   128e6ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3c4e>
  e9b896:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b89d:	00 
  e9b89e:	e8 ed 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9b8a3:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9b8aa:	00 
  e9b8ab:	e8 e0 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9b8b0:	e9 0b 01 00 00       	jmp    e9b9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62dd6>
  e9b8b5:	6a 40                	push   0x40
  e9b8b7:	5f                   	pop    rdi
  e9b8b8:	e8 43 26 95 00       	call   17edf00 <_Znwm@plt>
  e9b8bd:	48 89 c3             	mov    rbx,rax
  e9b8c0:	49 89 c5             	mov    r13,rax
  e9b8c3:	48 8d 05 c6 58 9c 00 	lea    rax,[rip+0x9c58c6]        # 1861190 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d878>
  e9b8ca:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9b8cd:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
  e9b8d2:	48 83 bc 24 50 0b 00 	cmp    QWORD PTR [rsp+0xb50],0x0
  e9b8d9:	00 00 
  e9b8db:	74 60                	je     e9b93d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d53>
  e9b8dd:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b8e4:	00 
  e9b8e5:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9b8ec:	00 
  e9b8ed:	e8 08 f6 3e 00       	call   128aefa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd047e>
  e9b8f2:	49 8b 7d 30          	mov    rdi,QWORD PTR [r13+0x30]
  e9b8f6:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
  e9b8fa:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
  e9b8ff:	4c 39 ff             	cmp    rdi,r15
  e9b902:	74 63                	je     e9b967 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d7d>
  e9b904:	48 85 ff             	test   rdi,rdi
  e9b907:	74 67                	je     e9b970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d86>
  e9b909:	6a 05                	push   0x5
  e9b90b:	eb 5c                	jmp    e9b969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d7f>
  e9b90d:	48 8d 35 e2 74 49 ff 	lea    rsi,[rip+0xffffffffff4974e2]        # 332df6 <_ZTSSt12bad_any_cast@@Base-0x5d3d2>
  e9b914:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b91b:	00 
  e9b91c:	e8 2e ff bd ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e9b921:	84 c0                	test   al,al
  e9b923:	0f 84 4d 38 00 00    	je     e9f176 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6658c>
  e9b929:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b930:	00 
  e9b931:	e8 fa b3 c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e9b936:	6a 03                	push   0x3
  e9b938:	e9 95 e9 ff ff       	jmp    e9a2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616e8>
  e9b93d:	48 8d 05 84 c9 a0 00 	lea    rax,[rip+0xa0c984]        # 18a82c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15208>
  e9b944:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9b94b:	00 
  e9b94c:	48 8d 84 24 70 07 00 	lea    rax,[rsp+0x770]
  e9b953:	00 
  e9b954:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e9b95b:	00 
  e9b95c:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
  e9b960:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
  e9b965:	eb 09                	jmp    e9b970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d86>
  e9b967:	6a 04                	push   0x4
  e9b969:	58                   	pop    rax
  e9b96a:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  e9b96d:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
  e9b970:	48 83 c3 30          	add    rbx,0x30
  e9b974:	48 8b 84 24 90 07 00 	mov    rax,QWORD PTR [rsp+0x790]
  e9b97b:	00 
  e9b97c:	48 85 c0             	test   rax,rax
  e9b97f:	74 18                	je     e9b999 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62daf>
  e9b981:	48 8d 8c 24 70 07 00 	lea    rcx,[rsp+0x770]
  e9b988:	00 
  e9b989:	48 39 c8             	cmp    rax,rcx
  e9b98c:	74 11                	je     e9b99f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62db5>
  e9b98e:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9b991:	48 8d 9c 24 90 07 00 	lea    rbx,[rsp+0x790]
  e9b998:	00 
  e9b999:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  e9b99d:	eb 14                	jmp    e9b9b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62dc9>
  e9b99f:	4c 89 3b             	mov    QWORD PTR [rbx],r15
  e9b9a2:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b9a9:	00 
  e9b9aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9b9ad:	4c 89 fe             	mov    rsi,r15
  e9b9b0:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e9b9b3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b9ba:	00 
  e9b9bb:	e8 aa e5 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b9c0:	48 8b 84 24 48 12 00 	mov    rax,QWORD PTR [rsp+0x1248]
  e9b9c7:	00 
  e9b9c8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e9b9cb:	48 8d 35 76 8a 53 ff 	lea    rsi,[rip+0xffffffffff538a76]        # 3d4448 <_ZTSN5boost17bad_function_callE@@Base+0x178e>
  e9b9d2:	48 8d 0d 87 8a 53 ff 	lea    rcx,[rip+0xffffffffff538a87]        # 3d4460 <_ZTSN5boost17bad_function_callE@@Base+0x17a6>
  e9b9d9:	6a 0b                	push   0xb
  e9b9db:	5a                   	pop    rdx
  e9b9dc:	6a 20                	push   0x20
  e9b9de:	41 58                	pop    r8
  e9b9e0:	45 31 c9             	xor    r9d,r9d
  e9b9e3:	e8 a2 b9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b9e8:	89 c3                	mov    ebx,eax
  e9b9ea:	e8 41 37 95 00       	call   17ef130 <_ZNSt6__ndk16thread20hardware_concurrencyEv@plt>
  e9b9ef:	89 c5                	mov    ebp,eax
  e9b9f1:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
  e9b9f8:	00 
  e9b9f9:	e8 2e 66 06 00       	call   f0202c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9442>
  e9b9fe:	66 0f 6f 84 24 20 05 	movdqa xmm0,XMMWORD PTR [rsp+0x520]
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
  e9baa2:	4c 89 f6             	mov    rsi,r14
  e9baa5:	e8 28 66 06 00       	call   f020d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94e8>
  e9baaa:	4c 89 f7             	mov    rdi,r14
  e9baad:	e8 b8 e4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9bab2:	4c 89 a4 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r12
  e9bab9:	00 
  e9baba:	4c 89 bc 24 98 07 00 	mov    QWORD PTR [rsp+0x798],r15
  e9bac1:	00 
  e9bac2:	6a 48                	push   0x48
  e9bac4:	5f                   	pop    rdi
  e9bac5:	e8 36 24 95 00       	call   17edf00 <_Znwm@plt>
  e9baca:	49 89 c6             	mov    r14,rax
  e9bacd:	89 e8                	mov    eax,ebp
  e9bacf:	66 0f ef c0          	pxor   xmm0,xmm0
  e9bad3:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
  e9bad9:	48 8d 0d 88 19 96 00 	lea    rcx,[rip+0x961988]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e9bae0:	49 89 0e             	mov    QWORD PTR [r14],rcx
  e9bae3:	4d 89 f7             	mov    r15,r14
  e9bae6:	49 83 c7 18          	add    r15,0x18
  e9baea:	48 8d 0d a7 55 9c 00 	lea    rcx,[rip+0x9c55a7]        # 1861098 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d780>
  e9baf1:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
  e9baf5:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
  e9baf9:	49 c7 46 28 14 00 00 	mov    QWORD PTR [r14+0x28],0x14
  e9bb00:	00 
  e9bb01:	49 c7 46 30 f4 01 00 	mov    QWORD PTR [r14+0x30],0x1f4
  e9bb08:	00 
  e9bb09:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
  e9bb0d:	41 88 5e 40          	mov    BYTE PTR [r14+0x40],bl
  e9bb11:	31 ff                	xor    edi,edi
  e9bb13:	e8 04 29 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9bb18:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9bb1f:	00 
  e9bb20:	4c 89 7e 30          	mov    QWORD PTR [rsi+0x30],r15
  e9bb24:	4c 89 76 38          	mov    QWORD PTR [rsi+0x38],r14
  e9bb28:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
  e9bb2f:	00 
  e9bb30:	6a 04                	push   0x4
  e9bb32:	5a                   	pop    rdx
  e9bb33:	e8 de 65 06 00       	call   f02116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc952c>
  e9bb38:	6a 20                	push   0x20
  e9bb3a:	5f                   	pop    rdi
  e9bb3b:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9bb40:	e8 bb 23 95 00       	call   17edf00 <_Znwm@plt>
  e9bb45:	4c 8b b4 24 98 13 00 	mov    r14,QWORD PTR [rsp+0x1398]
  e9bb4c:	00 
  e9bb4d:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
  e9bb54:	00 
  e9bb55:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
  e9bb59:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
  e9bb5d:	66 0f ef c9          	pxor   xmm1,xmm1
  e9bb61:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
  e9bb65:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  e9bb6a:	48 8d 0d 37 52 9c 00 	lea    rcx,[rip+0x9c5237]        # 1860da8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d490>
  e9bb71:	48 89 08             	mov    QWORD PTR [rax],rcx
  e9bb74:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9bb79:	49 89 c7             	mov    r15,rax
  e9bb7c:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e9bb80:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9bb87:	00 
  e9bb88:	66 0f 7f 0f          	movdqa XMMWORD PTR [rdi],xmm1
  e9bb8c:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
  e9bb91:	e8 b2 8c c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
  e9bb96:	48 89 df             	mov    rdi,rbx
  e9bb99:	e8 aa 8c c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
  e9bb9e:	6a 40                	push   0x40
  e9bba0:	5b                   	pop    rbx
  e9bba1:	48 8b bc 1c 68 07 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0x768]
  e9bba8:	00 
  e9bba9:	e8 d8 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bbae:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
  e9bbb2:	75 ed                	jne    e9bba1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62fb7>
  e9bbb4:	31 ff                	xor    edi,edi
  e9bbb6:	e8 cb 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bbbb:	31 ff                	xor    edi,edi
  e9bbbd:	e8 c4 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bbc2:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
  e9bbc9:	00 
  e9bbca:	e8 9b e3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9bbcf:	31 ff                	xor    edi,edi
  e9bbd1:	e8 b0 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bbd6:	31 ff                	xor    edi,edi
  e9bbd8:	e8 a9 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bbdd:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
  e9bbe4:	00 
  e9bbe5:	e8 80 e3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9bbea:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
--
  e9bca4:	66 0f 7f 44 24 60    	movdqa XMMWORD PTR [rsp+0x60],xmm0
  e9bcaa:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  e9bcae:	48 85 c0             	test   rax,rax
  e9bcb1:	74 05                	je     e9bcb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x630ce>
  e9bcb3:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9bcb8:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
  e9bcbf:	00 
  e9bcc0:	41 8a 5e 01          	mov    bl,BYTE PTR [r14+0x1]
  e9bcc4:	66 0f ef c0          	pxor   xmm0,xmm0
  e9bcc8:	66 0f 7f 84 24 50 05 	movdqa XMMWORD PTR [rsp+0x550],xmm0
  e9bccf:	00 00 
  e9bcd1:	48 83 a4 24 60 05 00 	and    QWORD PTR [rsp+0x560],0x0
  e9bcd8:	00 00 
  e9bcda:	6a 30                	push   0x30
  e9bcdc:	5f                   	pop    rdi
  e9bcdd:	e8 1e 22 95 00       	call   17edf00 <_Znwm@plt>
  e9bce2:	88 5c 24 27          	mov    BYTE PTR [rsp+0x27],bl
  e9bce6:	66 0f ef c0          	pxor   xmm0,xmm0
  e9bcea:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9bcef:	48 8d 0d d2 56 99 00 	lea    rcx,[rip+0x9956d2]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9bcf6:	48 89 08             	mov    QWORD PTR [rax],rcx
  e9bcf9:	48 8d 48 18          	lea    rcx,[rax+0x18]
  e9bcfd:	48 8d 15 fc 18 9a 00 	lea    rdx,[rip+0x9a18fc]        # 183d600 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf598>
  e9bd04:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e9bd08:	48 8b b4 24 58 12 00 	mov    rsi,QWORD PTR [rsp+0x1258]
  e9bd0f:	00 
  e9bd10:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]
  e9bd14:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
  e9bd17:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
  e9bd1b:	48 85 d2             	test   rdx,rdx
  e9bd1e:	74 05                	je     e9bd25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6313b>
  e9bd20:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e9bd25:	66 48 0f 6e c0       	movq   xmm0,rax
  e9bd2a:	66 48 0f 6e c9       	movq   xmm1,rcx
  e9bd2f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9bd33:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9bd3a:	00 
  e9bd3b:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
  e9bd3f:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9bd46:	00 
  e9bd47:	48 89 de             	mov    rsi,rbx
  e9bd4a:	e8 5f dd ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9bd4f:	4c 8b b4 24 98 12 00 	mov    r14,QWORD PTR [rsp+0x1298]
  e9bd56:	00 
  e9bd57:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e9bd5e:	00 
  e9bd5f:	e8 22 27 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bd64:	31 ff                	xor    edi,edi
  e9bd66:	e8 1b 27 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bd6b:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
  e9bd6f:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  e9bd74:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
  e9bd78:	48 85 c0             	test   rax,rax
  e9bd7b:	74 0a                	je     e9bd87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6319d>
  e9bd7d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9bd82:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9bd87:	6a 60                	push   0x60
  e9bd89:	5f                   	pop    rdi
  e9bd8a:	e8 71 21 95 00       	call   17edf00 <_Znwm@plt>
  e9bd8f:	49 89 c7             	mov    r15,rax
  e9bd92:	0f 57 c0             	xorps  xmm0,xmm0
  e9bd95:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e9bd99:	48 8d 2d 90 18 9a 00 	lea    rbp,[rip+0x9a1890]        # 183d630 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf5c8>
  e9bda0:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9bda3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9bda9:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
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
  e9be2b:	31 ff                	xor    edi,edi
  e9be2d:	e8 ea 25 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9be32:	4c 89 f7             	mov    rdi,r14
  e9be35:	e8 4c 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9be3a:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9be41:	00 
  e9be42:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9be48:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9be4c:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9be53:	00 
  e9be54:	e8 55 dc ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9be59:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
  e9be60:	00 
  e9be61:	e8 20 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9be66:	31 ff                	xor    edi,edi
  e9be68:	e8 19 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9be6d:	4c 89 f7             	mov    rdi,r14
  e9be70:	e8 11 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9be75:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
  e9be7c:	00 
  e9be7d:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e9be80:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  e9be85:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
  e9be89:	4d 85 f6             	test   r14,r14
  e9be8c:	74 0a                	je     e9be98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632ae>
  e9be8e:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9be93:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9be98:	6a 60                	push   0x60
  e9be9a:	5f                   	pop    rdi
  e9be9b:	e8 60 20 95 00       	call   17edf00 <_Znwm@plt>
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
  e9bf51:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9bf57:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9bf5b:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9bf62:	00 
  e9bf63:	e8 46 db ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9bf68:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
  e9bf6f:	00 
  e9bf70:	e8 11 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bf75:	31 ff                	xor    edi,edi
  e9bf77:	e8 0a 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bf7c:	4c 89 f7             	mov    rdi,r14
  e9bf7f:	e8 02 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bf84:	80 bc 24 e7 06 00 00 	cmp    BYTE PTR [rsp+0x6e7],0x0
  e9bf8b:	00 
  e9bf8c:	0f 84 05 01 00 00    	je     e9c097 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634ad>
  e9bf92:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
  e9bf99:	00 
  e9bf9a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e9bf9d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  e9bfa2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  e9bfa6:	48 85 c0             	test   rax,rax
  e9bfa9:	74 0a                	je     e9bfb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x633cb>
  e9bfab:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9bfb0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9bfb5:	6a 60                	push   0x60
  e9bfb7:	5f                   	pop    rdi
  e9bfb8:	e8 43 1f 95 00       	call   17edf00 <_Znwm@plt>
  e9bfbd:	49 89 c7             	mov    r15,rax
  e9bfc0:	0f 57 c0             	xorps  xmm0,xmm0
  e9bfc3:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e9bfc7:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9bfca:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
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
  e9c04d:	31 ff                	xor    edi,edi
  e9c04f:	e8 c8 23 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c054:	4c 89 f7             	mov    rdi,r14
  e9c057:	e8 2a 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c05c:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9c063:	00 
  e9c064:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c06a:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9c06e:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c075:	00 
  e9c076:	e8 33 da ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c07b:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
  e9c082:	00 
  e9c083:	e8 fe 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c088:	31 ff                	xor    edi,edi
  e9c08a:	e8 f7 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c08f:	4c 89 f7             	mov    rdi,r14
  e9c092:	e8 ef 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c097:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
  e9c09e:	00 
  e9c09f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e9c0a3:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
  e9c0a9:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
  e9c0ad:	48 85 db             	test   rbx,rbx
  e9c0b0:	74 05                	je     e9c0b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634cd>
  e9c0b2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c0b7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9c0be:	00 
  e9c0bf:	48 8d b4 24 28 02 00 	lea    rsi,[rsp+0x228]
  e9c0c6:	00 
  e9c0c7:	e8 f0 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
  e9c0cc:	bf 80 00 00 00       	mov    edi,0x80
  e9c0d1:	e8 2a 1e 95 00       	call   17edf00 <_Znwm@plt>
  e9c0d6:	49 89 c6             	mov    r14,rax
  e9c0d9:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c0dd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9c0e2:	48 8d 05 b7 11 9a 00 	lea    rax,[rip+0x9a11b7]        # 183d2a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf238>
  e9c0e9:	49 89 06             	mov    QWORD PTR [r14],rax
  e9c0ec:	4d 89 f7             	mov    r15,r14
  e9c0ef:	49 83 c7 18          	add    r15,0x18
  e9c0f3:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
--
  e9c142:	48 8d 84 24 e0 0c 00 	lea    rax,[rsp+0xce0]
  e9c149:	00 
  e9c14a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c14e:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
  e9c153:	48 89 2b             	mov    QWORD PTR [rbx],rbp
  e9c156:	4c 89 a4 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],r12
  e9c15d:	00 
  e9c15e:	4c 8b 68 f8          	mov    r13,QWORD PTR [rax-0x8]
  e9c162:	4c 89 ac 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],r13
  e9c169:	00 
  e9c16a:	4d 85 ed             	test   r13,r13
  e9c16d:	74 05                	je     e9c174 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6358a>
  e9c16f:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
  e9c174:	4c 89 bc 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],r15
  e9c17b:	00 
  e9c17c:	4c 89 b4 24 48 0b 00 	mov    QWORD PTR [rsp+0xb48],r14
  e9c183:	00 
  e9c184:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
  e9c188:	6a 28                	push   0x28
  e9c18a:	5f                   	pop    rdi
  e9c18b:	e8 70 1d 95 00       	call   17edf00 <_Znwm@plt>
  e9c190:	48 8d 8c 24 40 0b 00 	lea    rcx,[rsp+0xb40]
  e9c197:	00 
  e9c198:	48 8d 15 39 11 9a 00 	lea    rdx,[rip+0x9a1139]        # 183d2d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf270>
  e9c19f:	48 89 10             	mov    QWORD PTR [rax],rdx
  e9c1a2:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
  e9c1a6:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
  e9c1aa:	4d 85 ed             	test   r13,r13
  e9c1ad:	74 05                	je     e9c1b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x635ca>
  e9c1af:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
  e9c1b4:	4c 8d 63 20          	lea    r12,[rbx+0x20]
  e9c1b8:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
  e9c1bc:	4c 89 70 20          	mov    QWORD PTR [rax+0x20],r14
  e9c1c0:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c1c4:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
  e9c1c8:	4c 8d ac 24 70 07 00 	lea    r13,[rsp+0x770]
  e9c1cf:	00 
  e9c1d0:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  e9c1d4:	4c 89 e7             	mov    rdi,r12
  e9c1d7:	4c 89 ee             	mov    rsi,r13
  e9c1da:	e8 a9 b0 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9c1df:	4c 89 ef             	mov    rdi,r13
  e9c1e2:	e8 83 dd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9c1e7:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
  e9c1ee:	00 
  e9c1ef:	e8 1c 69 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e9c1f4:	66 48 0f 6e c3       	movq   xmm0,rbx
  e9c1f9:	66 49 0f 6e cc       	movq   xmm1,r12
  e9c1fe:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c202:	66 0f 7f 8c 24 f0 00 	movdqa XMMWORD PTR [rsp+0xf0],xmm1
  e9c209:	00 00 
  e9c20b:	31 ff                	xor    edi,edi
  e9c20d:	e8 0a 22 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c212:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
  e9c219:	00 
  e9c21a:	e8 f1 68 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e9c21f:	31 ff                	xor    edi,edi
  e9c221:	e8 60 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c226:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
  e9c22d:	00 
  e9c22e:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
  e9c235:	00 00 
  e9c237:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9c23b:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c242:	00 
  e9c243:	e8 66 d8 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c248:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
  e9c24f:	00 
  e9c250:	e8 31 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c255:	31 ff                	xor    edi,edi
  e9c257:	e8 2a 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c25c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9c263:	00 
  e9c264:	e8 91 b8 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
  e9c269:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c26f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e9c276:	e8 0b 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c27b:	80 bc 24 21 07 00 00 	cmp    BYTE PTR [rsp+0x721],0x0
  e9c282:	00 
  e9c283:	0f 84 8b 00 00 00    	je     e9c314 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6372a>
  e9c289:	6a 30                	push   0x30
  e9c28b:	5f                   	pop    rdi
  e9c28c:	e8 6f 1c 95 00       	call   17edf00 <_Znwm@plt>
  e9c291:	48 89 c3             	mov    rbx,rax
  e9c294:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
  e9c299:	66 48 0f 6e c0       	movq   xmm0,rax
  e9c29e:	f3 0f 7e 8c 24 20 01 	movq   xmm1,QWORD PTR [rsp+0x120]
  e9c2a5:	00 00 
  e9c2a7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c2ab:	48 83 c0 08          	add    rax,0x8
  e9c2af:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c2b3:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
  e9c2b8:	48 8d 0d 09 51 99 00 	lea    rcx,[rip+0x995109]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c2bf:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  e9c2c2:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e9c2c6:	49 89 de             	mov    r14,rbx
  e9c2c9:	49 83 c6 18          	add    r14,0x18
  e9c2cd:	48 8d 05 6c 11 9a 00 	lea    rax,[rip+0x9a116c]        # 183d440 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf3d8>
  e9c2d4:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  e9c2d8:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
  e9c2dd:	31 ff                	xor    edi,edi
  e9c2df:	e8 a2 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c2e4:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9c2eb:	00 
  e9c2ec:	4c 89 36             	mov    QWORD PTR [rsi],r14
  e9c2ef:	48 89 5e 08          	mov    QWORD PTR [rsi+0x8],rbx
  e9c2f3:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c2fa:	00 
  e9c2fb:	e8 ae d7 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c300:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e9c307:	00 
  e9c308:	e8 79 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c30d:	31 ff                	xor    edi,edi
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
  e9c386:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c38d:	00 
  e9c38e:	e8 1b d7 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c393:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
  e9c39a:	00 
  e9c39b:	e8 e6 20 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c3a0:	31 ff                	xor    edi,edi
  e9c3a2:	e8 df 20 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c3a7:	80 bc 24 67 07 00 00 	cmp    BYTE PTR [rsp+0x767],0x0
  e9c3ae:	00 
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
  e9c425:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9c42c:	00 
  e9c42d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c433:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9c437:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c43e:	00 
  e9c43f:	e8 6a d6 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c444:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
  e9c44b:	00 
  e9c44c:	e8 35 20 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c451:	31 ff                	xor    edi,edi
  e9c453:	e8 2e 20 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c458:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
  e9c45f:	00 
  e9c460:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e9c463:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  e9c468:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  e9c46c:	48 85 c0             	test   rax,rax
  e9c46f:	74 0a                	je     e9c47b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63891>
  e9c471:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9c476:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9c47b:	6a 60                	push   0x60
  e9c47d:	5f                   	pop    rdi
  e9c47e:	e8 7d 1a 95 00       	call   17edf00 <_Znwm@plt>
  e9c483:	49 89 c6             	mov    r14,rax
  e9c486:	0f 57 c0             	xorps  xmm0,xmm0
  e9c489:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e9c48d:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9c490:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
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
  e9c513:	31 ff                	xor    edi,edi
  e9c515:	e8 02 1f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c51a:	48 89 df             	mov    rdi,rbx
  e9c51d:	e8 64 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c522:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9c529:	00 
  e9c52a:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c530:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9c534:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c53b:	00 
  e9c53c:	e8 6d d5 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c541:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
  e9c548:	00 
  e9c549:	e8 38 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c54e:	31 ff                	xor    edi,edi
  e9c550:	e8 31 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c555:	48 89 df             	mov    rdi,rbx
  e9c558:	e8 29 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c55d:	80 bc 24 28 07 00 00 	cmp    BYTE PTR [rsp+0x728],0x0
  e9c564:	00 
  e9c565:	0f 84 05 01 00 00    	je     e9c670 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63a86>
  e9c56b:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
  e9c572:	00 
  e9c573:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e9c576:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  e9c57b:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  e9c57f:	48 85 c0             	test   rax,rax
  e9c582:	74 0a                	je     e9c58e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639a4>
  e9c584:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9c589:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9c58e:	6a 60                	push   0x60
  e9c590:	5f                   	pop    rdi
  e9c591:	e8 6a 19 95 00       	call   17edf00 <_Znwm@plt>
  e9c596:	49 89 c6             	mov    r14,rax
  e9c599:	0f 57 c0             	xorps  xmm0,xmm0
  e9c59c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e9c5a0:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9c5a3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
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
  e9c626:	31 ff                	xor    edi,edi
  e9c628:	e8 ef 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c62d:	48 89 df             	mov    rdi,rbx
  e9c630:	e8 51 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c635:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9c63c:	00 
  e9c63d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c643:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9c647:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c64e:	00 
  e9c64f:	e8 5a d4 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c654:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
  e9c65b:	00 
  e9c65c:	e8 25 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c661:	31 ff                	xor    edi,edi
  e9c663:	e8 1e 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c668:	48 89 df             	mov    rdi,rbx
  e9c66b:	e8 16 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c670:	44 0f b6 b4 24 d9 06 	movzx  r14d,BYTE PTR [rsp+0x6d9]
  e9c677:	00 00 
  e9c679:	44 8a bc 24 60 07 00 	mov    r15b,BYTE PTR [rsp+0x760]
  e9c680:	00 
  e9c681:	44 89 f0             	mov    eax,r14d
  e9c684:	44 08 f8             	or     al,r15b
  e9c687:	0f 84 b9 00 00 00    	je     e9c746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63b5c>
  e9c68d:	6a 60                	push   0x60
  e9c68f:	5f                   	pop    rdi
  e9c690:	e8 6b 18 95 00       	call   17edf00 <_Znwm@plt>
  e9c695:	48 89 c3             	mov    rbx,rax
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
  e9c70c:	31 ff                	xor    edi,edi
  e9c70e:	e8 09 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c713:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9c71a:	00 
  e9c71b:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c721:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9c725:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c72c:	00 
  e9c72d:	e8 7c d3 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c732:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
  e9c739:	00 
  e9c73a:	e8 47 1d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c73f:	31 ff                	xor    edi,edi
  e9c741:	e8 40 1d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c746:	80 bc 24 61 07 00 00 	cmp    BYTE PTR [rsp+0x761],0x0
  e9c74d:	00 
  e9c74e:	0f 84 c2 00 00 00    	je     e9c816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63c2c>
  e9c754:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
  e9c75b:	00 
  e9c75c:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e9c760:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
  e9c766:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
  e9c76a:	48 85 db             	test   rbx,rbx
  e9c76d:	74 05                	je     e9c774 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63b8a>
  e9c76f:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c774:	6a 40                	push   0x40
  e9c776:	5f                   	pop    rdi
  e9c777:	e8 84 17 95 00       	call   17edf00 <_Znwm@plt>
  e9c77c:	48 8d 48 18          	lea    rcx,[rax+0x18]
  e9c780:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c784:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9c789:	48 8d 15 38 4c 99 00 	lea    rdx,[rip+0x994c38]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c790:	48 89 10             	mov    QWORD PTR [rax],rdx
  e9c793:	48 8d 15 16 0f 9a 00 	lea    rdx,[rip+0x9a0f16]        # 183d6b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf648>
  e9c79a:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e9c79e:	48 8b 94 24 38 13 00 	mov    rdx,QWORD PTR [rsp+0x1338]
  e9c7a5:	00 
  e9c7a6:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
  e9c7aa:	48 8b 94 24 d0 00 00 	mov    rdx,QWORD PTR [rsp+0xd0]
  e9c7b1:	00 
  e9c7b2:	48 89 50 28          	mov    QWORD PTR [rax+0x28],rdx
  e9c7b6:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e9c7bb:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
  e9c7bf:	48 85 db             	test   rbx,rbx
  e9c7c2:	74 05                	je     e9c7c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63bdf>
  e9c7c4:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c7c9:	66 48 0f 6e c0       	movq   xmm0,rax
  e9c7ce:	66 48 0f 6e c9       	movq   xmm1,rcx
  e9c7d3:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c7d7:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9c7de:	00 
  e9c7df:	66 0f 7f 0e          	movdqa XMMWORD PTR [rsi],xmm1
  e9c7e3:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c7ea:	00 
  e9c7eb:	e8 be d2 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c7f0:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e9c7f7:	00 
  e9c7f8:	e8 89 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c7fd:	31 ff                	xor    edi,edi
  e9c7ff:	e8 82 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c804:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c80a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e9c811:	e8 70 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c816:	48 8d 35 13 0b 5a ff 	lea    rsi,[rip+0xffffffffff5a0b13]        # 43d330 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2f3c>
  e9c81d:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
  e9c824:	00 
  e9c825:	e8 16 17 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e9c82a:	6a 50                	push   0x50
  e9c82c:	5f                   	pop    rdi
  e9c82d:	e8 ce 16 95 00       	call   17edf00 <_Znwm@plt>
  e9c832:	49 89 c4             	mov    r12,rax
  e9c835:	49 89 c5             	mov    r13,rax
  e9c838:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c83c:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
  e9c843:	48 8d 05 7e 4b 99 00 	lea    rax,[rip+0x994b7e]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c84a:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e9c84e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9c855:	00 
  e9c856:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
  e9c85d:	00 
  e9c85e:	6a 01                	push   0x1
  e9c860:	5a                   	pop    rdx
  e9c861:	e8 f2 ab c0 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  e9c866:	4c 8b bc 24 30 13 00 	mov    r15,QWORD PTR [rsp+0x1330]
  e9c86d:	00 
  e9c86e:	48 8b 9c 24 10 13 00 	mov    rbx,QWORD PTR [rsp+0x1310]
  e9c875:	00 
  e9c876:	48 8d 05 3b 0c 9a 00 	lea    rax,[rip+0x9a0c3b]        # 183d4b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf450>
  e9c87d:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
  e9c881:	0f 28 84 24 50 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x550]
  e9c888:	00 
  e9c889:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
  e9c88e:	48 8b 84 24 60 05 00 	mov    rax,QWORD PTR [rsp+0x560]
  e9c895:	00 
  e9c896:	49 89 45 30          	mov    QWORD PTR [r13+0x30],rax
  e9c89a:	66 0f ef c9          	pxor   xmm1,xmm1
  e9c89e:	66 0f 7f 8c 24 50 05 	movdqa XMMWORD PTR [rsp+0x550],xmm1
  e9c8a5:	00 00 
  e9c8a7:	48 83 a4 24 60 05 00 	and    QWORD PTR [rsp+0x560],0x0
  e9c8ae:	00 00 
  e9c8b0:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
  e9c8b7:	00 
  e9c8b8:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
  e9c8bd:	f3 41 0f 7f 45 38    	movdqu XMMWORD PTR [r13+0x38],xmm0
  e9c8c3:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
  e9c8c7:	49 89 45 48          	mov    QWORD PTR [r13+0x48],rax
  e9c8cb:	66 41 0f 7f 0e       	movdqa XMMWORD PTR [r14],xmm1
  e9c8d0:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  e9c8d5:	4c 89 f7             	mov    rdi,r14
  e9c8d8:	e8 0b ed bd ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  e9c8dd:	31 ff                	xor    edi,edi
  e9c8df:	e8 38 1b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c8e4:	48 8b 84 24 38 13 00 	mov    rax,QWORD PTR [rsp+0x1338]
  e9c8eb:	00 
  e9c8ec:	49 89 06             	mov    QWORD PTR [r14],rax
  e9c8ef:	48 8d ac 24 80 07 00 	lea    rbp,[rsp+0x780]
  e9c8f6:	00 
  e9c8f7:	48 8d b4 24 10 06 00 	lea    rsi,[rsp+0x610]
  e9c8fe:	00 
  e9c8ff:	48 89 ef             	mov    rdi,rbp
  e9c902:	e8 f1 c8 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9c907:	48 8b 84 24 00 13 00 	mov    rax,QWORD PTR [rsp+0x1300]
  e9c90e:	00 
  e9c90f:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
  e9c913:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
  e9c917:	48 8d bc 24 c0 07 00 	lea    rdi,[rsp+0x7c0]
  e9c91e:	00 
  e9c91f:	48 89 de             	mov    rsi,rbx
  e9c922:	e8 97 f3 c2 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e9c927:	4c 8b b4 24 50 13 00 	mov    r14,QWORD PTR [rsp+0x1350]
  e9c92e:	00 
  e9c92f:	48 8d bc 24 d0 07 00 	lea    rdi,[rsp+0x7d0]
  e9c936:	00 
  e9c937:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
  e9c93e:	00 
  e9c93f:	e8 60 c5 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
  e9c944:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
  e9c94b:	00 
  e9c94c:	48 8d b4 24 e0 05 00 	lea    rsi,[rsp+0x5e0]
  e9c953:	00 
  e9c954:	e8 13 9a 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
  e9c959:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
  e9c960:	00 
  e9c961:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
  e9c968:	00 
  e9c969:	e8 42 9a 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
  e9c96e:	48 8d 9c 24 60 08 00 	lea    rbx,[rsp+0x860]
  e9c975:	00 
  e9c976:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
  e9c97d:	00 
  e9c97e:	48 89 df             	mov    rdi,rbx
  e9c981:	e8 62 c5 05 00       	call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
  e9c986:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
  e9c98d:	00 
  e9c98e:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
  e9c992:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
--
  e9d041:	74 05                	je     e9d048 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6445e>
  e9d043:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9d048:	48 8b 84 24 08 0b 00 	mov    rax,QWORD PTR [rsp+0xb08]
  e9d04f:	00 
  e9d050:	0f 28 84 24 00 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb00]
  e9d057:	00 
  e9d058:	41 0f 11 84 24 a0 03 	movups XMMWORD PTR [r12+0x3a0],xmm0
  e9d05f:	00 00 
  e9d061:	48 85 c0             	test   rax,rax
  e9d064:	74 05                	je     e9d06b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64481>
  e9d066:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9d06b:	48 8b 84 24 18 0b 00 	mov    rax,QWORD PTR [rsp+0xb18]
  e9d072:	00 
  e9d073:	0f 28 84 24 10 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb10]
  e9d07a:	00 
  e9d07b:	41 0f 11 84 24 b0 03 	movups XMMWORD PTR [r12+0x3b0],xmm0
  e9d082:	00 00 
  e9d084:	48 85 c0             	test   rax,rax
  e9d087:	74 05                	je     e9d08e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644a4>
  e9d089:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9d08e:	48 8b 84 24 28 0b 00 	mov    rax,QWORD PTR [rsp+0xb28]
  e9d095:	00 
  e9d096:	0f 28 84 24 20 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb20]
  e9d09d:	00 
  e9d09e:	41 0f 11 84 24 c0 03 	movups XMMWORD PTR [r12+0x3c0],xmm0
  e9d0a5:	00 00 
  e9d0a7:	48 85 c0             	test   rax,rax
  e9d0aa:	74 05                	je     e9d0b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644c7>
  e9d0ac:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9d0b1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
  e9d0b8:	00 
  e9d0b9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
  e9d0c4:	00 
  e9d0c5:	e8 00 d2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9d0ca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9d0d1:	00 
  e9d0d2:	e8 97 be 05 00       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
  e9d0d7:	4c 89 ef             	mov    rdi,r13
  e9d0da:	e8 a7 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d0df:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
  e9d0e6:	00 
  e9d0e7:	48 89 df             	mov    rdi,rbx
  e9d0ea:	e8 a1 0d 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9d0ef:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
  e9d0f6:	00 
  e9d0f7:	4c 89 f7             	mov    rdi,r14
  e9d0fa:	e8 23 0a c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
  e9d0ff:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
  e9d105:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e9d10c:	e8 75 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d111:	31 ff                	xor    edi,edi
  e9d113:	e8 6e 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d118:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
  e9d11f:	00 
  e9d120:	e8 45 ce bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9d125:	31 ff                	xor    edi,edi
  e9d127:	e8 5a 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d12c:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
  e9d133:	00 
  e9d134:	e8 c1 a9 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
  e9d139:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
  e9d13e:	e8 43 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d143:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  e9d148:	e8 39 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d14d:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  e9d152:	e8 2f 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d157:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
  e9d15e:	00 
  e9d15f:	e8 22 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d164:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
  e9d169:	e8 18 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d16e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
  e9d175:	00 
  e9d176:	e8 0b 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9d17b:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
  e9d182:	00 
  e9d183:	e8 e2 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9d188:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
  e9d18f:	00 
  e9d190:	e8 d5 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9d195:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
  e9d19c:	00 
  e9d19d:	e8 c8 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9d1a2:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
  e9d1a9:	00 
  e9d1aa:	e8 bb cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9d1af:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
  e9d1b6:	00 
  e9d1b7:	e8 ae cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9d1bc:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
