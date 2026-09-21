# TimelineConductor r14 origin before c8 install
Target: 0x135fd57 stores r14 into TimelineConductor+0xc8.

## r14 definitions in constructor before target: 28
### 1. 0x135d1a2: mov    r14,QWORD PTR [rcx]
     135d172:	00 
     135d173:	48 8d 87 c0 00 00 00 	lea    rax,[rdi+0xc0]
     135d17a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     135d181:	00 
     135d182:	48 8d 87 c8 00 00 00 	lea    rax,[rdi+0xc8]
     135d189:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     135d18e:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     135d193:	48 8d 87 d8 00 00 00 	lea    rax,[rdi+0xd8]
     135d19a:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     135d1a1:	00 
     135d1a2:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
     135d1a5:	48 8d 35 19 92 fd fe 	lea    rsi,[rip+0xfffffffffefd9219]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
     135d1ac:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
     135d1b3:	00 
     135d1b4:	4c 89 ff             	mov    rdi,r15
     135d1b7:	4c 89 ac 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r13
     135d1be:	00 
     135d1bf:	e8 ba c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1c4:	4c 8d a4 24 e8 0a 00 	lea    r12,[rsp+0xae8]
     135d1cb:	00 
     135d1cc:	48 8d 35 7b 35 00 ff 	lea    rsi,[rip+0xffffffffff00357b]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
     135d1d3:	4c 89 e7             	mov    rdi,r12
     135d1d6:	e8 a3 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1db:	4c 8d a4 24 00 0b 00 	lea    r12,[rsp+0xb00]
     135d1e2:	00 
     135d1e3:	48 8d 35 e8 2d fe fe 	lea    rsi,[rip+0xfffffffffefe2de8]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
     135d1ea:	4c 89 e7             	mov    rdi,r12
     135d1ed:	e8 8c c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>

### 2. 0x135d38e: lea    r14,[rip+0xfffffffffefd9030]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
     135d364:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d36b:	00 
     135d36c:	e9 ed 00 00 00       	jmp    135d45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29e2>
     135d371:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     135d378:	00 
     135d379:	4c 89 fe             	mov    rsi,r15
     135d37c:	e8 ff 0c 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     135d381:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d388:	00 
     135d389:	e9 d0 00 00 00       	jmp    135d45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29e2>
     135d38e:	4c 8d 35 30 90 fd fe 	lea    r14,[rip+0xfffffffffefd9030]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
     135d395:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d39c:	00 
     135d39d:	4c 89 f6             	mov    rsi,r14
     135d3a0:	e8 aa e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3a5:	84 c0                	test   al,al
     135d3a7:	74 1a                	je     135d3c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2947>
     135d3a9:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3b0:	00 
     135d3b1:	e8 7a 99 74 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     135d3b6:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d3bd:	00 
     135d3be:	e9 8b 00 00 00       	jmp    135d44e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29d2>
     135d3c3:	4c 8d 35 84 33 00 ff 	lea    r14,[rip+0xffffffffff003384]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
     135d3ca:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3d1:	00 
     135d3d2:	4c 89 f6             	mov    rsi,r14
     135d3d5:	e8 75 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>

### 3. 0x135d3c3: lea    r14,[rip+0xffffffffff003384]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
     135d39d:	4c 89 f6             	mov    rsi,r14
     135d3a0:	e8 aa e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3a5:	84 c0                	test   al,al
     135d3a7:	74 1a                	je     135d3c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2947>
     135d3a9:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3b0:	00 
     135d3b1:	e8 7a 99 74 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     135d3b6:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d3bd:	00 
     135d3be:	e9 8b 00 00 00       	jmp    135d44e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29d2>
     135d3c3:	4c 8d 35 84 33 00 ff 	lea    r14,[rip+0xffffffffff003384]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
     135d3ca:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3d1:	00 
     135d3d2:	4c 89 f6             	mov    rsi,r14
     135d3d5:	e8 75 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3da:	84 c0                	test   al,al
     135d3dc:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d3e3:	00 
     135d3e4:	74 02                	je     135d3e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a296c>
     135d3e6:	eb 59                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d3e8:	4c 8d 35 e3 2b fe fe 	lea    r14,[rip+0xfffffffffefe2be3]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
     135d3ef:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3f6:	00 
     135d3f7:	4c 89 f6             	mov    rsi,r14
     135d3fa:	e8 50 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3ff:	84 c0                	test   al,al
     135d401:	74 02                	je     135d405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2989>
     135d403:	eb 3c                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>

### 4. 0x135d3e8: lea    r14,[rip+0xfffffffffefe2be3]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
     135d3c3:	4c 8d 35 84 33 00 ff 	lea    r14,[rip+0xffffffffff003384]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
     135d3ca:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3d1:	00 
     135d3d2:	4c 89 f6             	mov    rsi,r14
     135d3d5:	e8 75 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3da:	84 c0                	test   al,al
     135d3dc:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d3e3:	00 
     135d3e4:	74 02                	je     135d3e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a296c>
     135d3e6:	eb 59                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d3e8:	4c 8d 35 e3 2b fe fe 	lea    r14,[rip+0xfffffffffefe2be3]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
     135d3ef:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3f6:	00 
     135d3f7:	4c 89 f6             	mov    rsi,r14
     135d3fa:	e8 50 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3ff:	84 c0                	test   al,al
     135d401:	74 02                	je     135d405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2989>
     135d403:	eb 3c                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d405:	4c 8d 35 e6 7d fc fe 	lea    r14,[rip+0xfffffffffefc7de6]        # 3251f2 <_ZTSSt12bad_any_cast@@Base-0x6afd6>
     135d40c:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d413:	00 
     135d414:	4c 89 f6             	mov    rsi,r14
     135d417:	e8 33 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d41c:	84 c0                	test   al,al
     135d41e:	74 02                	je     135d422 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29a6>
     135d420:	eb 1f                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d422:	4c 8d 35 a0 3b 02 ff 	lea    r14,[rip+0xffffffffff023ba0]        # 380fc9 <_ZTSSt12bad_any_cast@@Base-0xf1ff>
     135d429:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]

### 5. 0x135d405: lea    r14,[rip+0xfffffffffefc7de6]        # 3251f2 <_ZTSSt12bad_any_cast@@Base-0x6afd6>
     135d3e4:	74 02                	je     135d3e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a296c>
     135d3e6:	eb 59                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d3e8:	4c 8d 35 e3 2b fe fe 	lea    r14,[rip+0xfffffffffefe2be3]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
     135d3ef:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3f6:	00 
     135d3f7:	4c 89 f6             	mov    rsi,r14
     135d3fa:	e8 50 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3ff:	84 c0                	test   al,al
     135d401:	74 02                	je     135d405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2989>
     135d403:	eb 3c                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d405:	4c 8d 35 e6 7d fc fe 	lea    r14,[rip+0xfffffffffefc7de6]        # 3251f2 <_ZTSSt12bad_any_cast@@Base-0x6afd6>
     135d40c:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d413:	00 
     135d414:	4c 89 f6             	mov    rsi,r14
     135d417:	e8 33 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d41c:	84 c0                	test   al,al
     135d41e:	74 02                	je     135d422 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29a6>
     135d420:	eb 1f                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d422:	4c 8d 35 a0 3b 02 ff 	lea    r14,[rip+0xffffffffff023ba0]        # 380fc9 <_ZTSSt12bad_any_cast@@Base-0xf1ff>
     135d429:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d430:	00 
     135d431:	4c 89 f6             	mov    rsi,r14
     135d434:	e8 16 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d439:	84 c0                	test   al,al
     135d43b:	0f 84 f9 2c 00 00    	je     136013a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a56be>
     135d441:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d448:	00 
     135d449:	e8 e2 98 74 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

### 6. 0x135d422: lea    r14,[rip+0xffffffffff023ba0]        # 380fc9 <_ZTSSt12bad_any_cast@@Base-0xf1ff>
     135d401:	74 02                	je     135d405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2989>
     135d403:	eb 3c                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d405:	4c 8d 35 e6 7d fc fe 	lea    r14,[rip+0xfffffffffefc7de6]        # 3251f2 <_ZTSSt12bad_any_cast@@Base-0x6afd6>
     135d40c:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d413:	00 
     135d414:	4c 89 f6             	mov    rsi,r14
     135d417:	e8 33 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d41c:	84 c0                	test   al,al
     135d41e:	74 02                	je     135d422 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29a6>
     135d420:	eb 1f                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d422:	4c 8d 35 a0 3b 02 ff 	lea    r14,[rip+0xffffffffff023ba0]        # 380fc9 <_ZTSSt12bad_any_cast@@Base-0xf1ff>
     135d429:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d430:	00 
     135d431:	4c 89 f6             	mov    rsi,r14
     135d434:	e8 16 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d439:	84 c0                	test   al,al
     135d43b:	0f 84 f9 2c 00 00    	je     136013a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a56be>
     135d441:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d448:	00 
     135d449:	e8 e2 98 74 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     135d44e:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     135d455:	00 
     135d456:	4c 89 f6             	mov    rsi,r14
     135d459:	e8 22 0b 49 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     135d45e:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
     135d463:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d466:	e8 d9 fe 95 ff       	call   cbd344 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a2e4>
     135d46b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]

### 7. 0x135d4f3: mov    r14,rax
     135d4cf:	89 44 24 40          	mov    DWORD PTR [rsp+0x40],eax
     135d4d3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4d6:	e8 fb f7 95 ff       	call   cbccd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209c76>
     135d4db:	89 44 24 58          	mov    DWORD PTR [rsp+0x58],eax
     135d4df:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4e2:	e8 b3 fa 95 ff       	call   cbcf9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209f3a>
     135d4e7:	89 44 24 50          	mov    DWORD PTR [rsp+0x50],eax
     135d4eb:	6a 10                	push   0x10
     135d4ed:	5f                   	pop    rdi
     135d4ee:	e8 0d 0a 49 00       	call   17edf00 <_Znwm@plt>
     135d4f3:	49 89 c6             	mov    r14,rax
     135d4f6:	48 8d 35 75 a1 00 ff 	lea    rsi,[rip+0xffffffffff00a175]        # 367672 <_ZTSSt12bad_any_cast@@Base-0x28b56>
     135d4fd:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     135d504:	00 
     135d505:	e8 74 c5 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d50a:	48 8d 94 24 d0 0a 00 	lea    rdx,[rsp+0xad0]
     135d511:	00 
     135d512:	48 83 62 20 00       	and    QWORD PTR [rdx+0x20],0x0
     135d517:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135d51e:	00 
     135d51f:	4c 89 f7             	mov    rdi,r14
     135d522:	e8 fd 53 2b 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>
     135d527:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     135d52e:	00 
     135d52f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     135d533:	4c 89 ef             	mov    rdi,r13
     135d536:	4c 89 f6             	mov    rsi,r14
     135d539:	e8 de 36 00 00       	call   1360c1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61a0>

### 8. 0x135d572: mov    r14,rax
     135d54d:	00 
     135d54e:	e8 17 ca 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135d553:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     135d55a:	00 
     135d55b:	e8 30 09 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135d560:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135d564:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d567:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135d56a:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d571:	00 
     135d572:	49 89 c6             	mov    r14,rax
     135d575:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135d579:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d57c:	ff 50 10             	call   QWORD PTR [rax+0x10]
     135d57f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d582:	e8 31 1e 96 ff       	call   cbf3b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20c358>
     135d587:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d58a:	e8 83 1d 96 ff       	call   cbf312 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20c2b2>
     135d58f:	83 f8 01             	cmp    eax,0x1
     135d592:	b9 00 77 01 00       	mov    ecx,0x17700
     135d597:	ba 80 bb 00 00       	mov    edx,0xbb80
     135d59c:	0f 44 d1             	cmove  edx,ecx
     135d59f:	83 f8 02             	cmp    eax,0x2
     135d5a2:	bb 00 ee 02 00       	mov    ebx,0x2ee00
     135d5a7:	0f 45 da             	cmovne ebx,edx
     135d5aa:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     135d5b1:	00 
     135d5b2:	48 8b b4 24 d8 10 00 	mov    rsi,QWORD PTR [rsp+0x10d8]

### 9. 0x135d707: lea    r14,[rsp+0xb28]
     135d6df:	49 89 47 e0          	mov    QWORD PTR [r15-0x20],rax
     135d6e3:	4d 89 77 e8          	mov    QWORD PTR [r15-0x18],r14
     135d6e7:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135d6ee:	00 
     135d6ef:	49 89 47 f0          	mov    QWORD PTR [r15-0x10],rax
     135d6f3:	4d 89 6f f8          	mov    QWORD PTR [r15-0x8],r13
     135d6f7:	4c 89 ff             	mov    rdi,r15
     135d6fa:	48 8b b4 24 c8 10 00 	mov    rsi,QWORD PTR [rsp+0x10c8]
     135d701:	00 
     135d702:	e8 89 cb 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135d707:	4c 8d b4 24 28 0b 00 	lea    r14,[rsp+0xb28]
     135d70e:	00 
     135d70f:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
     135d716:	00 
     135d717:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     135d71b:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
     135d722:	00 
     135d723:	4c 89 f7             	mov    rdi,r14
     135d726:	e8 15 08 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     135d72b:	4c 8d a4 24 40 0b 00 	lea    r12,[rsp+0xb40]
     135d732:	00 
     135d733:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135d73a:	00 
     135d73b:	4c 89 e7             	mov    rdi,r12
     135d73e:	e8 5b ff 95 ff       	call   cbd69e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a63e>
     135d743:	48 8d bc 24 f8 0b 00 	lea    rdi,[rsp+0xbf8]
     135d74a:	00 
     135d74b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### 10. 0x135d85a: lea    r14,[rsp+0x5a0]
     135d830:	4c 89 ff             	mov    rdi,r15
     135d833:	e8 92 ca 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135d838:	48 89 df             	mov    rdi,rbx
     135d83b:	e8 0e 34 00 00       	call   1360c4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61d2>
     135d840:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135d847:	00 
     135d848:	e8 bf 7b 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d84d:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
     135d854:	00 
     135d855:	e8 b2 7b 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d85a:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
     135d861:	00 
     135d862:	4c 89 f7             	mov    rdi,r14
     135d865:	e8 44 eb 76 ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     135d86a:	6a 20                	push   0x20
     135d86c:	5f                   	pop    rdi
     135d86d:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     135d872:	e8 89 06 49 00       	call   17edf00 <_Znwm@plt>
     135d877:	66 0f ef c0          	pxor   xmm0,xmm0
     135d87b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135d880:	48 8d 0d 49 30 4a 00 	lea    rcx,[rip+0x4a3049]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
     135d887:	48 89 08             	mov    QWORD PTR [rax],rcx
     135d88a:	48 89 c1             	mov    rcx,rax
     135d88d:	48 83 c1 18          	add    rcx,0x18
     135d891:	48 8d 15 58 a5 50 00 	lea    rdx,[rip+0x50a558]        # 1867df0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x244d8>
     135d898:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     135d89c:	48 89 8b 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rcx
     135d8a3:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]

### 11. 0x135d95d: mov    r14,QWORD PTR [rsp+0xdb8]
     135d935:	00 
     135d936:	4c 89 b4 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r14
     135d93d:	00 
     135d93e:	48 8d 05 6b a5 50 00 	lea    rax,[rip+0x50a56b]        # 1867eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24598>
     135d945:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135d94c:	00 
     135d94d:	4c 89 bc 24 80 0f 00 	mov    QWORD PTR [rsp+0xf80],r15
     135d954:	00 
     135d955:	48 8b 9c 24 b0 0d 00 	mov    rbx,QWORD PTR [rsp+0xdb0]
     135d95c:	00 
     135d95d:	4c 8b b4 24 b8 0d 00 	mov    r14,QWORD PTR [rsp+0xdb8]
     135d964:	00 
     135d965:	48 89 9c 24 20 03 00 	mov    QWORD PTR [rsp+0x320],rbx
     135d96c:	00 
     135d96d:	4c 89 b4 24 28 03 00 	mov    QWORD PTR [rsp+0x328],r14
     135d974:	00 
     135d975:	4c 8b a4 24 c0 0d 00 	mov    r12,QWORD PTR [rsp+0xdc0]
     135d97c:	00 
     135d97d:	4c 89 a4 24 30 03 00 	mov    QWORD PTR [rsp+0x330],r12
     135d984:	00 
     135d985:	66 0f ef c0          	pxor   xmm0,xmm0
     135d989:	48 83 a4 24 c0 0d 00 	and    QWORD PTR [rsp+0xdc0],0x0
     135d990:	00 00 
     135d992:	66 0f 7f 84 24 b0 0d 	movdqa XMMWORD PTR [rsp+0xdb0],xmm0
     135d999:	00 00 
     135d99b:	48 83 a4 24 60 0e 00 	and    QWORD PTR [rsp+0xe60],0x0
     135d9a2:	00 00 
     135d9a4:	6a 20                	push   0x20

### 12. 0x135d9c2: lea    r14,[rsp+0x320]
     135d99b:	48 83 a4 24 60 0e 00 	and    QWORD PTR [rsp+0xe60],0x0
     135d9a2:	00 00 
     135d9a4:	6a 20                	push   0x20
     135d9a6:	5f                   	pop    rdi
     135d9a7:	e8 54 05 49 00       	call   17edf00 <_Znwm@plt>
     135d9ac:	48 8d 0d 45 a5 50 00 	lea    rcx,[rip+0x50a545]        # 1867ef8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x245e0>
     135d9b3:	48 89 08             	mov    QWORD PTR [rax],rcx
     135d9b6:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     135d9ba:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     135d9be:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
     135d9c2:	4c 8d b4 24 20 03 00 	lea    r14,[rsp+0x320]
     135d9c9:	00 
     135d9ca:	66 0f ef c0          	pxor   xmm0,xmm0
     135d9ce:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     135d9d3:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     135d9d8:	48 89 84 24 60 0e 00 	mov    QWORD PTR [rsp+0xe60],rax
     135d9df:	00 
     135d9e0:	48 8d b4 24 d0 01 00 	lea    rsi,[rsp+0x1d0]
     135d9e7:	00 
     135d9e8:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135d9ef:	00 
     135d9f0:	4c 8d a4 24 a0 05 00 	lea    r12,[rsp+0x5a0]
     135d9f7:	00 
     135d9f8:	4c 89 ef             	mov    rdi,r13
     135d9fb:	48 89 da             	mov    rdx,rbx
     135d9fe:	48 8b 8c 24 98 10 00 	mov    rcx,QWORD PTR [rsp+0x1098]
     135da05:	00 
     135da06:	4d 89 e0             	mov    r8,r12

### 13. 0x135dcc0: mov    r14,QWORD PTR [rsp+0x38]
     135dc9e:	74 06                	je     135dca6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a322a>
     135dca0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dca3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dca6:	48 8d bc 24 e0 08 00 	lea    rdi,[rsp+0x8e0]
     135dcad:	00 
     135dcae:	e8 b3 f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dcb3:	6a 08                	push   0x8
     135dcb5:	5f                   	pop    rdi
     135dcb6:	e8 45 02 49 00       	call   17edf00 <_Znwm@plt>
     135dcbb:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
     135dcc0:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     135dcc5:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135dcca:	48 8d 0d d7 bf 50 00 	lea    rcx,[rip+0x50bfd7]        # 1869ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26390>
     135dcd1:	48 89 08             	mov    QWORD PTR [rax],rcx
     135dcd4:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     135dcdb:	00 
     135dcdc:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135dcdf:	48 89 01             	mov    QWORD PTR [rcx],rax
     135dce2:	48 85 ff             	test   rdi,rdi
     135dce5:	74 06                	je     135dced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a3271>
     135dce7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcea:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dced:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     135dcf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcf5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dcf8:	49 89 c4             	mov    r12,rax
     135dcfb:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dcfe:	4c 89 ff             	mov    rdi,r15

### 14. 0x135de86: lea    r14,[rip+0xffffffffff07f483]        # 3dd310 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d5f>
     135de67:	6a 17                	push   0x17
     135de69:	5d                   	pop    rbp
     135de6a:	6a 19                	push   0x19
     135de6c:	41 5c                	pop    r12
     135de6e:	48 89 ea             	mov    rdx,rbp
     135de71:	4d 89 e0             	mov    r8,r12
     135de74:	45 31 c9             	xor    r9d,r9d
     135de77:	e8 e2 96 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135de7c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135de7f:	4c 8d 3d 6a f4 07 ff 	lea    r15,[rip+0xffffffffff07f46a]        # 3dd2f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d3f>
     135de86:	4c 8d 35 83 f4 07 ff 	lea    r14,[rip+0xffffffffff07f483]        # 3dd310 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d5f>
     135de8d:	6a 1c                	push   0x1c
     135de8f:	41 5d                	pop    r13
     135de91:	4c 89 fe             	mov    rsi,r15
     135de94:	48 89 ea             	mov    rdx,rbp
     135de97:	4c 89 f1             	mov    rcx,r14
     135de9a:	4d 89 e8             	mov    r8,r13
     135de9d:	41 b9 10 27 00 00    	mov    r9d,0x2710
     135dea3:	68 60 ea 00 00       	push   0xea60
     135dea8:	6a 00                	push   0x0
     135deaa:	e8 43 97 28 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     135deaf:	58                   	pop    rax
     135deb0:	59                   	pop    rcx
     135deb1:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135deb4:	e8 43 02 96 ff       	call   cbe0fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b09c>
     135deb9:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax
     135dec0:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135dec3:	e8 80 02 96 ff       	call   cbe148 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b0e8>

### 15. 0x135dff7: lea    r14,[rsp+0x620]
     135dfd0:	74 05                	je     135dfd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a355b>
     135dfd2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135dfd7:	48 8d 9c 24 f0 05 00 	lea    rbx,[rsp+0x5f0]
     135dfde:	00 
     135dfdf:	48 8d b4 24 b0 08 00 	lea    rsi,[rsp+0x8b0]
     135dfe6:	00 
     135dfe7:	48 89 df             	mov    rdi,rbx
     135dfea:	4c 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r15
     135dff1:	00 
     135dff2:	e8 99 c2 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135dff7:	4c 8d b4 24 20 06 00 	lea    r14,[rsp+0x620]
     135dffe:	00 
     135dfff:	4c 89 f7             	mov    rdi,r14
     135e002:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135e009:	00 
     135e00a:	e8 d7 ef 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135e00f:	48 8d bc 24 e8 06 00 	lea    rdi,[rsp+0x6e8]
     135e016:	00 
     135e017:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     135e01c:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
     135e020:	4c 89 ee             	mov    rsi,r13
     135e023:	e8 6c ea 96 ff       	call   ccca94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219a34>
     135e028:	66 83 a4 24 00 07 00 	and    WORD PTR [rsp+0x700],0x0
     135e02f:	00 00 
     135e031:	8b 9c 24 b8 00 00 00 	mov    ebx,DWORD PTR [rsp+0xb8]
     135e038:	89 9c 24 04 07 00 00 	mov    DWORD PTR [rsp+0x704],ebx
     135e03f:	48 c7 84 24 08 07 00 	mov    QWORD PTR [rsp+0x708],0x3e8
     135e046:	00 e8 03 00 00 

### 16. 0x135e2d5: lea    r14,[rsp+0x540]
     135e2ac:	4c 89 bc 24 40 08 00 	mov    QWORD PTR [rsp+0x840],r15
     135e2b3:	00 
     135e2b4:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
     135e2b9:	4c 8d bc 24 e0 03 00 	lea    r15,[rsp+0x3e0]
     135e2c0:	00 
     135e2c1:	4d 89 67 f0          	mov    QWORD PTR [r15-0x10],r12
     135e2c5:	4c 89 ff             	mov    rdi,r15
     135e2c8:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135e2cf:	00 
     135e2d0:	e8 11 ed 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135e2d5:	4c 8d b4 24 40 05 00 	lea    r14,[rsp+0x540]
     135e2dc:	00 
     135e2dd:	66 41 83 a6 60 ff ff 	and    WORD PTR [r14-0xa0],0x0
     135e2e4:	ff 00 
     135e2e6:	41 89 9e 64 ff ff ff 	mov    DWORD PTR [r14-0x9c],ebx
     135e2ed:	49 c7 86 68 ff ff ff 	mov    QWORD PTR [r14-0x98],0x3e8
     135e2f4:	e8 03 00 00 
     135e2f8:	49 c7 86 70 ff ff ff 	mov    QWORD PTR [r14-0x90],0xfa0
     135e2ff:	a0 0f 00 00 
     135e303:	49 83 a6 78 ff ff ff 	and    QWORD PTR [r14-0x88],0x0
     135e30a:	00 
     135e30b:	41 c6 46 80 01       	mov    BYTE PTR [r14-0x80],0x1
     135e310:	41 83 66 81 00       	and    DWORD PTR [r14-0x7f],0x0
     135e315:	66 41 83 66 85 00    	and    WORD PTR [r14-0x7b],0x0
     135e31b:	49 c7 46 88 01 00 00 	mov    QWORD PTR [r14-0x78],0x1
     135e322:	00 
     135e323:	31 c0                	xor    eax,eax
     135e325:	41 88 46 90          	mov    BYTE PTR [r14-0x70],al

### 17. 0x135e654: mov    r14,QWORD PTR [r12+0xa8]
     135e62c:	41 88 9c 24 40 01 00 	mov    BYTE PTR [r12+0x140],bl
     135e633:	00 
     135e634:	41 88 9c 24 d0 01 00 	mov    BYTE PTR [r12+0x1d0],bl
     135e63b:	00 
     135e63c:	41 88 9c 24 d8 01 00 	mov    BYTE PTR [r12+0x1d8],bl
     135e643:	00 
     135e644:	41 88 9c 24 f8 01 00 	mov    BYTE PTR [r12+0x1f8],bl
     135e64b:	00 
     135e64c:	41 88 9c 24 00 02 00 	mov    BYTE PTR [r12+0x200],bl
     135e653:	00 
     135e654:	4d 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [r12+0xa8]
     135e65b:	00 
     135e65c:	4c 8d 84 24 20 03 00 	lea    r8,[rsp+0x320]
     135e663:	00 
     135e664:	4d 89 20             	mov    QWORD PTR [r8],r12
     135e667:	48 8d 35 23 ea 73 ff 	lea    rsi,[rip+0xffffffffff73ea23]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     135e66e:	48 8d 0d ed b3 02 00 	lea    rcx,[rip+0x2b3ed]        # 1389a62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cefe6>
     135e675:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135e67c:	00 
     135e67d:	6a 08                	push   0x8
     135e67f:	41 59                	pop    r9
     135e681:	48 89 df             	mov    rdi,rbx
     135e684:	31 d2                	xor    edx,edx
     135e686:	e8 09 c1 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135e68b:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     135e68e:	48 8d 15 1b f3 07 ff 	lea    rdx,[rip+0xffffffffff07f31b]        # 3dd9b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x33ff>
     135e695:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e69c:	00 

### 18. 0x135e6ce: mov    r14,QWORD PTR [r12+0xa8]
     135e6a5:	48 8d 9c 24 40 0e 00 	lea    rbx,[rsp+0xe40]
     135e6ac:	00 
     135e6ad:	4c 89 ff             	mov    rdi,r15
     135e6b0:	48 89 de             	mov    rsi,rbx
     135e6b3:	e8 3a b5 47 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     135e6b8:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135e6bc:	e8 c5 fd 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e6c1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135e6c8:	00 
     135e6c9:	e8 1a c1 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     135e6ce:	4d 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [r12+0xa8]
     135e6d5:	00 
     135e6d6:	4c 8d 84 24 20 03 00 	lea    r8,[rsp+0x320]
     135e6dd:	00 
     135e6de:	4d 89 20             	mov    QWORD PTR [r8],r12
     135e6e1:	48 8d 35 a9 e9 73 ff 	lea    rsi,[rip+0xffffffffff73e9a9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     135e6e8:	48 8d 0d 1f b4 02 00 	lea    rcx,[rip+0x2b41f]        # 1389b0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf092>
     135e6ef:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135e6f6:	00 
     135e6f7:	6a 08                	push   0x8
     135e6f9:	41 59                	pop    r9
     135e6fb:	48 89 df             	mov    rdi,rbx
     135e6fe:	31 d2                	xor    edx,edx
     135e700:	e8 8f c0 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135e705:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     135e708:	48 8d 15 b1 f2 07 ff 	lea    rdx,[rip+0xffffffffff07f2b1]        # 3dd9c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x340f>
     135e70f:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e716:	00 

### 19. 0x135e843: lea    r14,[rsp+0xad0]
     135e818:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135e81f:	00 
     135e820:	e8 71 1c 94 ff       	call   ca0496 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ed436>
     135e825:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135e82c:	00 
     135e82d:	e8 5e f6 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135e832:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
     135e839:	00 
     135e83a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135e83e:	e8 43 fc 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e843:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
     135e84a:	00 
     135e84b:	4c 89 f7             	mov    rdi,r14
     135e84e:	e8 b9 87 7e ff       	call   b4700c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93fac>
     135e853:	4d 89 26             	mov    QWORD PTR [r14],r12
     135e856:	48 8d 05 07 dc 71 ff 	lea    rax,[rip+0xffffffffff71dc07]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135e85d:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135e861:	48 8d 05 98 b8 02 00 	lea    rax,[rip+0x2b898]        # 138a100 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf684>
     135e868:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     135e86c:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135e873:	00 
     135e874:	48 89 df             	mov    rdi,rbx
     135e877:	e8 3c 07 37 00       	call   16cefb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83124>
     135e87c:	48 8d 35 11 94 01 ff 	lea    rsi,[rip+0xffffffffff019411]        # 377c94 <_ZTSSt12bad_any_cast@@Base-0x18534>
     135e883:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135e88a:	00 
     135e88b:	e8 ee b1 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135e890:	48 8d 9c 24 b0 0d 00 	lea    rbx,[rsp+0xdb0]

### 20. 0x135e930: lea    r14,[rsp+0xad0]
     135e905:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135e90c:	00 
     135e90d:	e8 84 1b 94 ff       	call   ca0496 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ed436>
     135e912:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135e919:	00 
     135e91a:	e8 71 f5 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135e91f:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
     135e926:	00 
     135e927:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135e92b:	e8 56 fb 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e930:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
     135e937:	00 
     135e938:	4c 89 f7             	mov    rdi,r14
     135e93b:	e8 cc 86 7e ff       	call   b4700c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93fac>
     135e940:	4d 89 26             	mov    QWORD PTR [r14],r12
     135e943:	48 8d 05 1a db 71 ff 	lea    rax,[rip+0xffffffffff71db1a]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135e94a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135e94e:	48 8d 05 43 c2 02 00 	lea    rax,[rip+0x2c243]        # 138ab98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d011c>
     135e955:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     135e959:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135e960:	00 
     135e961:	48 89 df             	mov    rdi,rbx
     135e964:	e8 4f 06 37 00       	call   16cefb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83124>
     135e969:	48 8d 35 bb 89 fe fe 	lea    rsi,[rip+0xfffffffffefe89bb]        # 34732b <_ZTSSt12bad_any_cast@@Base-0x48e9d>
     135e970:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135e977:	00 
     135e978:	e8 01 b1 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135e97d:	48 8d 9c 24 b0 0d 00 	lea    rbx,[rsp+0xdb0]

### 21. 0x135ea1d: lea    r14,[rsp+0xad0]
     135e9f2:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135e9f9:	00 
     135e9fa:	e8 97 1a 94 ff       	call   ca0496 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ed436>
     135e9ff:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135ea06:	00 
     135ea07:	e8 84 f4 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135ea0c:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
     135ea13:	00 
     135ea14:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135ea18:	e8 69 fa 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ea1d:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
     135ea24:	00 
     135ea25:	4c 89 f7             	mov    rdi,r14
     135ea28:	e8 df 85 7e ff       	call   b4700c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93fac>
     135ea2d:	4d 89 26             	mov    QWORD PTR [r14],r12
     135ea30:	48 8d 05 2d da 71 ff 	lea    rax,[rip+0xffffffffff71da2d]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135ea37:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135ea3b:	48 8d 05 9e c1 02 00 	lea    rax,[rip+0x2c19e]        # 138abe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0164>
     135ea42:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     135ea46:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135ea4d:	00 
     135ea4e:	48 89 df             	mov    rdi,rbx
     135ea51:	e8 62 05 37 00       	call   16cefb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83124>
     135ea56:	48 8d 35 3c 1c ff fe 	lea    rsi,[rip+0xfffffffffeff1c3c]        # 350699 <_ZTSSt12bad_any_cast@@Base-0x3fb2f>
     135ea5d:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135ea64:	00 
     135ea65:	e8 14 b0 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135ea6a:	48 8d 9c 24 b0 0d 00 	lea    rbx,[rsp+0xdb0]

### 22. 0x135ebf8: lea    r14,[rsp+0x320]
     135ebd0:	00 
     135ebd1:	e8 c0 18 94 ff       	call   ca0496 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ed436>
     135ebd6:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135ebdd:	00 
     135ebde:	e8 ad f2 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135ebe3:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
     135ebea:	00 
     135ebeb:	e8 96 f8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ebf0:	4c 8d ac 24 d0 0a 00 	lea    r13,[rsp+0xad0]
     135ebf7:	00 
     135ebf8:	4c 8d b4 24 20 03 00 	lea    r14,[rsp+0x320]
     135ebff:	00 
     135ec00:	4c 89 ef             	mov    rdi,r13
     135ec03:	4c 89 f6             	mov    rsi,r14
     135ec06:	e8 a9 12 37 00       	call   16cfeb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84020>
     135ec0b:	48 89 df             	mov    rdi,rbx
     135ec0e:	4c 89 ee             	mov    rsi,r13
     135ec11:	e8 06 ac 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135ec16:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     135ec1a:	e8 67 f8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ec1f:	4c 89 f7             	mov    rdi,r14
     135ec22:	e8 21 5c 75 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
     135ec27:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135ec2e:	00 
     135ec2f:	e8 36 b3 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ec34:	48 8b 9c 24 00 01 00 	mov    rbx,QWORD PTR [rsp+0x100]
     135ec3b:	00 
     135ec3c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]

### 23. 0x135ec72: mov    r14,rax
     135ec50:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ec57:	00 
     135ec58:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec5b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ec5e:	4c 8b bc 24 b0 10 00 	mov    r15,QWORD PTR [rsp+0x10b0]
     135ec65:	00 
     135ec66:	48 89 c3             	mov    rbx,rax
     135ec69:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec6c:	4c 89 ff             	mov    rdi,r15
     135ec6f:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135ec72:	49 89 c6             	mov    r14,rax
     135ec75:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec78:	4c 89 ff             	mov    rdi,r15
     135ec7b:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135ec7e:	48 89 c5             	mov    rbp,rax
     135ec81:	6a 40                	push   0x40
     135ec83:	5f                   	pop    rdi
     135ec84:	e8 77 f2 48 00       	call   17edf00 <_Znwm@plt>
     135ec89:	49 89 c7             	mov    r15,rax
     135ec8c:	48 8d 05 cd 29 51 00 	lea    rax,[rip+0x5129cd]        # 1871660 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dd48>
     135ec93:	49 89 07             	mov    QWORD PTR [r15],rax
     135ec96:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135ec9d:	00 
     135ec9e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
     135eca2:	49 89 5f 10          	mov    QWORD PTR [r15+0x10],rbx
     135eca6:	48 8b 84 24 c0 10 00 	mov    rax,QWORD PTR [rsp+0x10c0]
     135ecad:	00 
     135ecae:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax

### 24. 0x135edd4: mov    r14,rax
     135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx
     135edbb:	48 85 ff             	test   rdi,rdi
     135edbe:	74 06                	je     135edc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a434a>
     135edc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edc3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135edc6:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135edcd:	00 
     135edce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edd1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135edd4:	49 89 c6             	mov    r14,rax
     135edd7:	bf 10 01 00 00       	mov    edi,0x110
     135eddc:	e8 1f f1 48 00       	call   17edf00 <_Znwm@plt>
     135ede1:	48 89 c3             	mov    rbx,rax
     135ede4:	48 8d 05 cd b2 50 00 	lea    rax,[rip+0x50b2cd]        # 186a0b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x267a0>
     135edeb:	48 89 03             	mov    QWORD PTR [rbx],rax
     135edee:	48 8d 05 63 b3 50 00 	lea    rax,[rip+0x50b363]        # 186a158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26840>
     135edf5:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
     135edfc:	00 
     135edfd:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135ee04:	00 
     135ee05:	48 89 84 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],rax
     135ee0c:	00 
     135ee0d:	4c 89 b4 24 e0 0a 00 	mov    QWORD PTR [rsp+0xae0],r14
     135ee14:	00 
     135ee15:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ee1c:	00 
     135ee1d:	48 8d 73 10          	lea    rsi,[rbx+0x10]

### 25. 0x135efaa: lea    r14,[rip+0x5d8b17]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     135ef7c:	00 00 
     135ef7e:	48 c7 84 24 78 03 00 	mov    QWORD PTR [rsp+0x378],0x7d0
     135ef85:	00 d0 07 00 00 
     135ef8a:	8a 45 04             	mov    al,BYTE PTR [rbp+0x4]
     135ef8d:	88 84 24 80 03 00 00 	mov    BYTE PTR [rsp+0x380],al
     135ef94:	48 8b 45 38          	mov    rax,QWORD PTR [rbp+0x38]
     135ef98:	48 8d b4 24 f0 02 00 	lea    rsi,[rsp+0x2f0]
     135ef9f:	00 
     135efa0:	48 89 06             	mov    QWORD PTR [rsi],rax
     135efa3:	c7 46 08 4e 1f 00 00 	mov    DWORD PTR [rsi+0x8],0x1f4e
     135efaa:	4c 8d 35 17 8b 5d 00 	lea    r14,[rip+0x5d8b17]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     135efb1:	4c 89 76 10          	mov    QWORD PTR [rsi+0x10],r14
     135efb5:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
     135efb9:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     135efbd:	c7 46 20 4f 1f 00 00 	mov    DWORD PTR [rsi+0x20],0x1f4f
     135efc4:	4c 89 76 28          	mov    QWORD PTR [rsi+0x28],r14
     135efc8:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135efcf:	00 
     135efd0:	6a 02                	push   0x2
     135efd2:	5a                   	pop    rdx
     135efd3:	e8 24 1d 00 00       	call   1360cfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6280>
     135efd8:	48 8d 9c 24 88 03 00 	lea    rbx,[rsp+0x388]
     135efdf:	00 
     135efe0:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
     135efe7:	00 
     135efe8:	66 0f 6f 84 24 90 01 	movdqa xmm0,XMMWORD PTR [rsp+0x190]
     135efef:	00 00 
     135eff1:	0f 57 c9             	xorps  xmm1,xmm1

### 26. 0x135f171: mov    r14,QWORD PTR [rsp+0x208]
     135f145:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     135f148:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135f14d:	0f 11 8c 24 18 02 00 	movups XMMWORD PTR [rsp+0x218],xmm1
     135f154:	00 
     135f155:	e8 ce c5 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135f15a:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     135f15f:	66 0f ef c0          	pxor   xmm0,xmm0
     135f163:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
     135f169:	80 bc 24 20 02 00 00 	cmp    BYTE PTR [rsp+0x220],0x0
     135f170:	00 
     135f171:	4c 8b b4 24 08 02 00 	mov    r14,QWORD PTR [rsp+0x208]
     135f178:	00 
     135f179:	74 0a                	je     135f185 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4709>
     135f17b:	48 8b 9c 24 18 02 00 	mov    rbx,QWORD PTR [rsp+0x218]
     135f182:	00 
     135f183:	eb 37                	jmp    135f1bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4740>
     135f185:	48 8b 84 24 00 02 00 	mov    rax,QWORD PTR [rsp+0x200]
     135f18c:	00 
     135f18d:	4c 89 f3             	mov    rbx,r14
     135f190:	4c 39 f0             	cmp    rax,r14
     135f193:	74 17                	je     135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>
     135f195:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     135f199:	7f 0e                	jg     135f1a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a472d>
     135f19b:	48 83 c0 18          	add    rax,0x18
     135f19f:	4c 39 f0             	cmp    rax,r14
     135f1a2:	75 f1                	jne    135f195 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4719>
     135f1a4:	4c 89 f3             	mov    rbx,r14
     135f1a7:	eb 03                	jmp    135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>

### 27. 0x135f22a: mov    r14,rax
     135f204:	48 63 84 24 e8 00 00 	movsxd rax,DWORD PTR [rsp+0xe8]
     135f20b:	00 
     135f20c:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     135f213:	00 
     135f214:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135f21b:	00 
     135f21c:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f21f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135f224:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f227:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f22a:	49 89 c6             	mov    r14,rax
     135f22d:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
     135f234:	00 
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
     135f258:	48 89 c6             	mov    rsi,rax
     135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
     135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     135f271:	00 

### 28. 0x135f2bd: mov    r14,rax
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135f2ec:	00 
     135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135f2f4:	00 
     135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135f301:	00 
     135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]

## LAST r14 definition before target
- 0x135f2bd: mov    r14,rax
     135f195:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     135f199:	7f 0e                	jg     135f1a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a472d>
     135f19b:	48 83 c0 18          	add    rax,0x18
     135f19f:	4c 39 f0             	cmp    rax,r14
     135f1a2:	75 f1                	jne    135f195 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4719>
     135f1a4:	4c 89 f3             	mov    rbx,r14
     135f1a7:	eb 03                	jmp    135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>
     135f1a9:	48 89 c3             	mov    rbx,rax
     135f1ac:	48 89 9c 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rbx
     135f1b3:	00 
     135f1b4:	c6 84 24 20 02 00 00 	mov    BYTE PTR [rsp+0x220],0x1
     135f1bb:	01 
     135f1bc:	4c 39 f3             	cmp    rbx,r14
     135f1bf:	74 38                	je     135f1f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a477d>
     135f1c1:	4c 89 ef             	mov    rdi,r13
     135f1c4:	48 89 de             	mov    rsi,rbx
     135f1c7:	e8 ec 1b 00 00       	call   1360db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a633c>
     135f1cc:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
     135f1d3:	00 
     135f1d4:	48 83 c3 18          	add    rbx,0x18
     135f1d8:	48 39 c3             	cmp    rbx,rax
     135f1db:	74 14                	je     135f1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4775>
     135f1dd:	48 8d 4b 18          	lea    rcx,[rbx+0x18]
     135f1e1:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     135f1e5:	48 89 cb             	mov    rbx,rcx
     135f1e8:	7e ee                	jle    135f1d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a475c>
     135f1ea:	48 83 c1 e8          	add    rcx,0xffffffffffffffe8
     135f1ee:	48 89 c8             	mov    rax,rcx
     135f1f1:	48 89 c3             	mov    rbx,rax
     135f1f4:	4c 39 f0             	cmp    rax,r14
     135f1f7:	75 c8                	jne    135f1c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4745>
     135f1f9:	8a 44 24 2f          	mov    al,BYTE PTR [rsp+0x2f]
     135f1fd:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     135f204:	48 63 84 24 e8 00 00 	movsxd rax,DWORD PTR [rsp+0xe8]
     135f20b:	00 
     135f20c:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     135f213:	00 
     135f214:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135f21b:	00 
     135f21c:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f21f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135f224:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f227:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f22a:	49 89 c6             	mov    r14,rax
     135f22d:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
     135f234:	00 
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
     135f258:	48 89 c6             	mov    rsi,rax
     135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
     135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     135f271:	00 
     135f272:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135f2ec:	00 
     135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135f2f4:	00 
     135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135f301:	00 
     135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]
     135f309:	00 
     135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f30f:	48 83 a4 24 30 0e 00 	and    QWORD PTR [rsp+0xe30],0x0
     135f316:	00 00 
     135f318:	6a 70                	push   0x70
     135f31a:	5f                   	pop    rdi
     135f31b:	e8 e0 eb 48 00       	call   17edf00 <_Znwm@plt>
     135f320:	48 89 c3             	mov    rbx,rax
     135f323:	48 8d 05 c6 8c 50 00 	lea    rax,[rip+0x508cc6]        # 1867ff0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x246d8>
     135f32a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f32d:	48 89 df             	mov    rdi,rbx
     135f330:	48 83 c7 10          	add    rdi,0x10
     135f334:	48 8d b4 24 b0 0d 00 	lea    rsi,[rsp+0xdb0]
     135f33b:	00 
     135f33c:	e8 cb 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f341:	48 89 9c 24 30 0e 00 	mov    QWORD PTR [rsp+0xe30],rbx
     135f348:	00 
     135f349:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f350:	00 
     135f351:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135f358:	00 
     135f359:	e8 08 1c 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f35e:	48 83 a4 24 a0 0d 00 	and    QWORD PTR [rsp+0xda0],0x0
     135f365:	00 00 
     135f367:	bf c0 02 00 00       	mov    edi,0x2c0
     135f36c:	e8 8f eb 48 00       	call   17edf00 <_Znwm@plt>
     135f371:	48 89 c3             	mov    rbx,rax
     135f374:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135f37b:	00 
     135f37c:	48 8d 84 24 30 0a 00 	lea    rax,[rsp+0xa30]
     135f383:	00 
     135f384:	48 89 84 24 68 0f 00 	mov    QWORD PTR [rsp+0xf68],rax
     135f38b:	00 
     135f38c:	48 c7 84 24 70 0f 00 	mov    QWORD PTR [rsp+0xf70],0x1
     135f393:	00 01 00 00 00 
     135f398:	48 8d 05 99 8c 50 00 	lea    rax,[rip+0x508c99]        # 1868038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24720>
     135f39f:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f3a2:	48 89 df             	mov    rdi,rbx
     135f3a5:	48 83 c7 10          	add    rdi,0x10
     135f3a9:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135f3b0:	00 
     135f3b1:	e8 b0 1b 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f3b6:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
     135f3bb:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135f3c2:	00 
     135f3c3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135f3c7:	48 89 9c 24 a0 0d 00 	mov    QWORD PTR [rsp+0xda0],rbx
     135f3ce:	00 
     135f3cf:	e8 f6 ae 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135f3d4:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     135f3db:	00 00 
     135f3dd:	48 8d 05 9c 8c 50 00 	lea    rax,[rip+0x508c9c]        # 1868080 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24768>
     135f3e4:	48 8d 8c 24 a0 0a 00 	lea    rcx,[rsp+0xaa0]
     135f3eb:	00 
     135f3ec:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f3ef:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f3f3:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135f3fa:	00 
     135f3fb:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     135f402:	00 
     135f403:	e8 9a 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f408:	48 83 a4 24 90 0a 00 	and    QWORD PTR [rsp+0xa90],0x0
     135f40f:	00 00 
     135f411:	6a 50                	push   0x50
     135f413:	5f                   	pop    rdi
     135f414:	e8 e7 ea 48 00       	call   17edf00 <_Znwm@plt>
     135f419:	48 89 c3             	mov    rbx,rax
     135f41c:	48 8d ac 24 b8 03 00 	lea    rbp,[rsp+0x3b8]
     135f423:	00 
     135f424:	48 8d 05 9d 8c 50 00 	lea    rax,[rip+0x508c9d]        # 18680c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247b0>
     135f42b:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f42e:	48 89 df             	mov    rdi,rbx
     135f431:	48 83 c7 10          	add    rdi,0x10
     135f435:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
     135f43c:	00 
     135f43d:	e8 60 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f442:	48 89 9c 24 90 0a 00 	mov    QWORD PTR [rsp+0xa90],rbx
     135f449:	00 
     135f44a:	48 8d 05 8f f4 4a 00 	lea    rax,[rip+0x4af48f]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135f451:	48 8d 8c 24 00 0a 00 	lea    rcx,[rsp+0xa00]
     135f458:	00 
     135f459:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f45c:	48 8d 05 63 1a 00 00 	lea    rax,[rip+0x1a63]        # 1360ec6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a644a>
     135f463:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     135f467:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f46b:	48 8d 05 9e 8c 50 00 	lea    rax,[rip+0x508c9e]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>
     135f472:	48 8d 8c 24 d0 09 00 	lea    rcx,[rsp+0x9d0]
     135f479:	00 
     135f47a:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f47d:	48 8b 84 24 80 10 00 	mov    rax,QWORD PTR [rsp+0x1080]
     135f484:	00 
     135f485:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     135f489:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f48d:	48 8d 05 6c 8d 50 00 	lea    rax,[rip+0x508d6c]        # 1868200 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x248e8>
     135f494:	49 89 06             	mov    QWORD PTR [r14],rax
     135f497:	48 8d 05 2a 8f 50 00 	lea    rax,[rip+0x508f2a]        # 18683c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ab0>
     135f49e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135f4a2:	48 8d 05 4f 8f 50 00 	lea    rax,[rip+0x508f4f]        # 18683f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ae0>
     135f4a9:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135f4ad:	48 8d 05 0c 90 50 00 	lea    rax,[rip+0x50900c]        # 18684c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ba8>
     135f4b4:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     135f4b8:	49 8d 5e 20          	lea    rbx,[r14+0x20]
     135f4bc:	6a 61                	push   0x61
     135f4be:	59                   	pop    rcx
     135f4bf:	48 8d 84 24 20 03 00 	lea    rax,[rsp+0x320]
     135f4c6:	00 
     135f4c7:	48 89 df             	mov    rdi,rbx
     135f4ca:	48 89 c6             	mov    rsi,rax
     135f4cd:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]
     135f4cf:	0f 10 40 68          	movups xmm0,XMMWORD PTR [rax+0x68]
     135f4d3:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
     135f4da:	00 
     135f4db:	48 8b 40 78          	mov    rax,QWORD PTR [rax+0x78]
     135f4df:	49 89 86 98 00 00 00 	mov    QWORD PTR [r14+0x98],rax
     135f4e6:	0f 57 c0             	xorps  xmm0,xmm0
     135f4e9:	48 8d 84 24 88 03 00 	lea    rax,[rsp+0x388]
     135f4f0:	00 
     135f4f1:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     135f4f6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     135f4f9:	0f 10 4d e8          	movups xmm1,XMMWORD PTR [rbp-0x18]
     135f4fd:	41 0f 29 8e a0 00 00 	movaps XMMWORD PTR [r14+0xa0],xmm1
     135f504:	00 
     135f505:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
     135f509:	49 89 86 b0 00 00 00 	mov    QWORD PTR [r14+0xb0],rax
     135f510:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     135f515:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     135f51a:	f3 0f 6f 45 00       	movdqu xmm0,XMMWORD PTR [rbp+0x0]
     135f51f:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
     135f526:	00 00 
     135f528:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f52f:	00 
     135f530:	49 89 86 c8 00 00 00 	mov    QWORD PTR [r14+0xc8],rax
     135f537:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135f53e:	00 
     135f53f:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
     135f546:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135f54b:	49 89 86 d8 00 00 00 	mov    QWORD PTR [r14+0xd8],rax
     135f552:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     135f557:	49 89 86 e0 00 00 00 	mov    QWORD PTR [r14+0xe0],rax
     135f55e:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]
     135f565:	48 8d b4 24 40 0e 00 	lea    rsi,[rsp+0xe40]
     135f56c:	00 

## r14-preservation calls after last definition
 135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
 135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
 135f31b:	e8 e0 eb 48 00       	call   17edf00 <_Znwm@plt>
 135f33c:	e8 cb 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
 135f359:	e8 08 1c 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
 135f36c:	e8 8f eb 48 00       	call   17edf00 <_Znwm@plt>
 135f3b1:	e8 b0 1b 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
 135f3cf:	e8 f6 ae 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 135f403:	e8 9a 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
 135f414:	e8 e7 ea 48 00       	call   17edf00 <_Znwm@plt>
 135f43d:	e8 60 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
 135f494:	49 89 06             	mov    QWORD PTR [r14],rax
 135f49e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 135f4a9:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 135f4b4:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 135f4b8:	49 8d 5e 20          	lea    rbx,[r14+0x20]
 135f4d3:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
 135f4df:	49 89 86 98 00 00 00 	mov    QWORD PTR [r14+0x98],rax
 135f4fd:	41 0f 29 8e a0 00 00 	movaps XMMWORD PTR [r14+0xa0],xmm1
 135f509:	49 89 86 b0 00 00 00 	mov    QWORD PTR [r14+0xb0],rax
 135f51f:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
 135f530:	49 89 86 c8 00 00 00 	mov    QWORD PTR [r14+0xc8],rax
 135f53f:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
 135f54b:	49 89 86 d8 00 00 00 	mov    QWORD PTR [r14+0xd8],rax
 135f557:	49 89 86 e0 00 00 00 	mov    QWORD PTR [r14+0xe0],rax
 135f55e:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]
 135f572:	e8 27 fa 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
 135f577:	4d 8d ae b0 01 00 00 	lea    r13,[r14+0x1b0]
 135f5a0:	49 89 86 d0 01 00 00 	mov    QWORD PTR [r14+0x1d0],rax
 135f5a9:	49 8d 8e d0 01 00 00 	lea    rcx,[r14+0x1d0]
 135f5b6:	4d 89 ae d0 01 00 00 	mov    QWORD PTR [r14+0x1d0],r13
 135f5cb:	ff 50 18             	call   QWORD PTR [rax+0x18]
 135f5ce:	49 8d ae e0 01 00 00 	lea    rbp,[r14+0x1e0]
 135f5f7:	49 89 86 00 02 00 00 	mov    QWORD PTR [r14+0x200],rax
 135f600:	49 8d 8e 00 02 00 00 	lea    rcx,[r14+0x200]
 135f60d:	49 89 ae 00 02 00 00 	mov    QWORD PTR [r14+0x200],rbp
 135f622:	ff 50 18             	call   QWORD PTR [rax+0x18]
 135f625:	49 8d b6 10 02 00 00 	lea    rsi,[r14+0x210]
 135f668:	49 89 86 30 02 00 00 	mov    QWORD PTR [r14+0x230],rax
 135f671:	49 8d 8e 30 02 00 00 	lea    rcx,[r14+0x230]
 135f67e:	49 89 b6 30 02 00 00 	mov    QWORD PTR [r14+0x230],rsi
 135f690:	ff 50 18             	call   QWORD PTR [rax+0x18]
 135f698:	49 89 86 40 02 00 00 	mov    QWORD PTR [r14+0x240],rax
 135f6a1:	41 88 9e 48 02 00 00 	mov    BYTE PTR [r14+0x248],bl
 135f6a8:	41 88 9e b8 05 00 00 	mov    BYTE PTR [r14+0x5b8],bl
 135f6af:	66 41 83 a6 c0 05 00 	and    WORD PTR [r14+0x5c0],0x0
 135f6b8:	4d 8d 6e 10          	lea    r13,[r14+0x10]
 135f6bc:	49 8d 6e 18          	lea    rbp,[r14+0x18]
 135f6c4:	f3 41 0f 7f 86 c8 05 	movdqu XMMWORD PTR [r14+0x5c8],xmm0
 135f6cd:	f3 41 0f 7f 86 d4 05 	movdqu XMMWORD PTR [r14+0x5d4],xmm0
 135f6dd:	49 89 86 e8 05 00 00 	mov    QWORD PTR [r14+0x5e8],rax
 135f6e4:	49 8d be f0 05 00 00 	lea    rdi,[r14+0x5f0]
 135f6eb:	e8 06 a3 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 135f6f0:	41 c6 86 00 06 00 00 	mov    BYTE PTR [r14+0x600],0x1
 135f6f8:	41 c7 86 04 06 00 00 	mov    DWORD PTR [r14+0x604],0x1
 135f703:	49 83 a6 08 06 00 00 	and    QWORD PTR [r14+0x608],0x0
 135f70b:	49 83 a6 18 06 00 00 	and    QWORD PTR [r14+0x618],0x0
 135f713:	49 83 a6 28 06 00 00 	and    QWORD PTR [r14+0x628],0x0
 135f722:	49 89 86 30 06 00 00 	mov    QWORD PTR [r14+0x630],rax
 135f729:	49 8d 86 40 06 00 00 	lea    rax,[r14+0x640]
 135f734:	66 41 0f 7f 86 40 06 	movdqa XMMWORD PTR [r14+0x640],xmm0
 135f73d:	49 89 86 38 06 00 00 	mov    QWORD PTR [r14+0x638],rax
 135f744:	49 83 a6 60 06 00 00 	and    QWORD PTR [r14+0x660],0x0
 135f74c:	66 41 0f 7f 86 50 06 	movdqa XMMWORD PTR [r14+0x650],xmm0
 135f755:	49 8d 86 68 06 00 00 	lea    rax,[r14+0x668]
 135f75c:	49 89 86 68 06 00 00 	mov    QWORD PTR [r14+0x668],rax
 135f768:	49 89 86 70 06 00 00 	mov    QWORD PTR [r14+0x670],rax
 135f76f:	49 83 a6 98 06 00 00 	and    QWORD PTR [r14+0x698],0x0
 135f777:	49 8d 86 a8 06 00 00 	lea    rax,[r14+0x6a8]
 135f77e:	f3 41 0f 7f 86 a8 06 	movdqu XMMWORD PTR [r14+0x6a8],xmm0
 135f787:	f3 41 0f 7f 86 78 06 	movdqu XMMWORD PTR [r14+0x678],xmm0
 135f790:	f3 41 0f 7f 86 84 06 	movdqu XMMWORD PTR [r14+0x684],xmm0
 135f799:	49 89 86 a0 06 00 00 	mov    QWORD PTR [r14+0x6a0],rax
 135f7a0:	41 88 9e b8 06 00 00 	mov    BYTE PTR [r14+0x6b8],bl
 135f7a7:	41 88 9e 18 07 00 00 	mov    BYTE PTR [r14+0x718],bl
 135f7ae:	49 8d 86 28 07 00 00 	lea    rax,[r14+0x728]
 135f7b5:	f3 41 0f 7f 86 28 07 	movdqu XMMWORD PTR [r14+0x728],xmm0
 135f7be:	49 89 86 20 07 00 00 	mov    QWORD PTR [r14+0x720],rax
 135f7c5:	4d 89 be 38 07 00 00 	mov    QWORD PTR [r14+0x738],r15
 135f7cc:	4d 8d be 40 07 00 00 	lea    r15,[r14+0x740]
 135f7de:	e8 f7 3d 97 ff       	call   cd35da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22057a>
 135f7eb:	49 89 86 70 07 00 00 	mov    QWORD PTR [r14+0x770],rax
 135f7f2:	4d 89 a6 78 07 00 00 	mov    QWORD PTR [r14+0x778],r12
 135f809:	4c 89 73 b0          	mov    QWORD PTR [rbx-0x50],r14
 135f816:	49 8b 86 38 07 00 00 	mov    rax,QWORD PTR [r14+0x738]
 135f82d:	49 8b 86 c8 00 00 00 	mov    rax,QWORD PTR [r14+0xc8]
 135f863:	e8 28 aa 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 135f868:	4d 8d a6 80 07 00 00 	lea    r12,[r14+0x780]
 135f877:	49 8b 86 70 07 00 00 	mov    rax,QWORD PTR [r14+0x770]
 135f882:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
 135f887:	41 0f 10 4e 68       	movups xmm1,XMMWORD PTR [r14+0x68]
 135f896:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
 135f8cd:	41 0f 29 86 c0 07 00 	movaps XMMWORD PTR [r14+0x7c0],xmm0
 135f8e0:	49 89 86 d0 07 00 00 	mov    QWORD PTR [r14+0x7d0],rax
 135f8e7:	49 8d be e0 07 00 00 	lea    rdi,[r14+0x7e0]
 135f8f1:	e8 e4 3c 97 ff       	call   cd35da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22057a>
 135f906:	41 0f 29 96 30 08 00 	movaps XMMWORD PTR [r14+0x830],xmm2
 135f90e:	41 0f 29 8e 20 08 00 	movaps XMMWORD PTR [r14+0x820],xmm1
 135f916:	66 41 0f 7f 86 10 08 	movdqa XMMWORD PTR [r14+0x810],xmm0
 135f927:	e8 de 60 00 00       	call   1365a0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aaf8e>
 135f92c:	4d 8d be 40 08 00 00 	lea    r15,[r14+0x840]
 135f95a:	49 89 86 60 08 00 00 	mov    QWORD PTR [r14+0x860],rax
 135f963:	49 8d 8e 60 08 00 00 	lea    rcx,[r14+0x860]
 135f975:	4d 89 be 60 08 00 00 	mov    QWORD PTR [r14+0x860],r15
 135f98a:	ff 50 18             	call   QWORD PTR [rax+0x18]
 135f98d:	4d 8d ae 70 08 00 00 	lea    r13,[r14+0x870]
 135f9b6:	49 89 86 90 08 00 00 	mov    QWORD PTR [r14+0x890],rax
 135f9bf:	49 8d 8e 90 08 00 00 	lea    rcx,[r14+0x890]
 135f9cc:	4d 89 ae 90 08 00 00 	mov    QWORD PTR [r14+0x890],r13
 135f9e1:	ff 50 18             	call   QWORD PTR [rax+0x18]
 135f9f9:	49 89 9e a0 08 00 00 	mov    QWORD PTR [r14+0x8a0],rbx
 135fa00:	49 8d be a8 08 00 00 	lea    rdi,[r14+0x8a8]
 135fa0f:	e8 ee a3 47 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
 135fa14:	49 8d be 00 09 00 00 	lea    rdi,[r14+0x900]
 135fa23:	e8 e2 1c 96 ff       	call   cc170a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e6aa>
 135fa2a:	41 88 ae 58 09 00 00 	mov    BYTE PTR [r14+0x958],bpl
 135fa31:	41 88 ae a8 09 00 00 	mov    BYTE PTR [r14+0x9a8],bpl
 135fa38:	41 83 a6 b0 09 00 00 	and    DWORD PTR [r14+0x9b0],0x0
 135fa40:	66 41 83 a6 b4 09 00 	and    WORD PTR [r14+0x9b4],0x0
 135fa49:	49 8d 86 b8 09 00 00 	lea    rax,[r14+0x9b8]
 135fa5d:	4c 89 33             	mov    QWORD PTR [rbx],r14
 135faa0:	4d 8d be f0 09 00 00 	lea    r15,[r14+0x9f0]
 135faab:	f3 41 0f 7f 86 b8 09 	movdqu XMMWORD PTR [r14+0x9b8],xmm0
 135fab4:	f3 41 0f 7f 86 c8 09 	movdqu XMMWORD PTR [r14+0x9c8],xmm0
 135fabd:	f3 41 0f 7f 86 d8 09 	movdqu XMMWORD PTR [r14+0x9d8],xmm0
 135fac6:	f3 41 0f 7f 86 e8 09 	movdqu XMMWORD PTR [r14+0x9e8],xmm0
 135facf:	49 89 86 00 0a 00 00 	mov    QWORD PTR [r14+0xa00],rax
 135fadf:	e8 80 c9 71 ff       	call   a7c464 <JNI_OnUnload@@Base+0x3d31>
 135fae4:	4d 89 a6 08 0a 00 00 	mov    QWORD PTR [r14+0xa08],r12
 135faf0:	49 8d 9e 10 0a 00 00 	lea    rbx,[r14+0xa10]
 135fafd:	e8 86 f5 ee ff       	call   124f088 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9460c>
 135fb02:	49 8d 86 38 0a 00 00 	lea    rax,[r14+0xa38]
 135fb0d:	f3 41 0f 7f 86 38 0a 	movdqu XMMWORD PTR [r14+0xa38],xmm0
 135fb16:	49 89 86 30 0a 00 00 	mov    QWORD PTR [r14+0xa30],rax
 135fb1d:	41 88 ae 80 0a 00 00 	mov    BYTE PTR [r14+0xa80],bpl
 135fb24:	f3 41 0f 7f 86 48 0a 	movdqu XMMWORD PTR [r14+0xa48],xmm0
 135fb2d:	f3 41 0f 7f 86 58 0a 	movdqu XMMWORD PTR [r14+0xa58],xmm0
 135fb36:	41 88 ae 68 0a 00 00 	mov    BYTE PTR [r14+0xa68],bpl
 135fb40:	e8 bb e3 48 00       	call   17edf00 <_Znwm@plt>
 135fb84:	49 89 8e 88 0a 00 00 	mov    QWORD PTR [r14+0xa88],rcx
 135fb8b:	49 89 86 90 0a 00 00 	mov    QWORD PTR [r14+0xa90],rax
 135fb92:	f3 41 0f 7f 86 98 0a 	movdqu XMMWORD PTR [r14+0xa98],xmm0
 135fb9b:	66 41 83 a6 a8 0a 00 	and    WORD PTR [r14+0xaa8],0x0
 135fbac:	e8 d5 94 e9 ff       	call   11f9086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e60a>
 135fbb9:	e8 bc 71 00 00       	call   1366d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2fe>
 135fbc0:	41 88 9e e8 0a 00 00 	mov    BYTE PTR [r14+0xae8],bl
 135fbcb:	66 41 0f 7f 86 b0 0a 	movdqa XMMWORD PTR [r14+0xab0],xmm0
 135fbd4:	66 41 0f 7f 86 c0 0a 	movdqa XMMWORD PTR [r14+0xac0],xmm0
 135fbdd:	66 41 0f 7f 86 d0 0a 	movdqa XMMWORD PTR [r14+0xad0],xmm0
 135fbe6:	41 88 9e e0 0a 00 00 	mov    BYTE PTR [r14+0xae0],bl
 135fbed:	49 83 a6 f0 0a 00 00 	and    QWORD PTR [r14+0xaf0],0x0
 135fbf5:	41 88 9e f8 0a 00 00 	mov    BYTE PTR [r14+0xaf8],bl
 135fbfc:	41 88 9e 00 0b 00 00 	mov    BYTE PTR [r14+0xb00],bl
 135fc03:	4d 89 be 08 0b 00 00 	mov    QWORD PTR [r14+0xb08],r15
 135fc0a:	4d 89 a6 10 0b 00 00 	mov    QWORD PTR [r14+0xb10],r12
 135fc19:	49 89 86 18 0b 00 00 	mov    QWORD PTR [r14+0xb18],rax
 135fc20:	4d 8d be 20 0b 00 00 	lea    r15,[r14+0xb20]
 135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
 135fc37:	4d 8d ae 50 0b 00 00 	lea    r13,[r14+0xb50]
 135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
 135fc46:	66 41 83 a6 a8 0b 00 	and    WORD PTR [r14+0xba8],0x0
 135fc4f:	41 88 9e aa 0b 00 00 	mov    BYTE PTR [r14+0xbaa],bl
 135fc56:	49 8d ae b0 0b 00 00 	lea    rbp,[r14+0xbb0]
 135fc68:	e8 55 1a 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 135fc6d:	49 8d 9e c0 0b 00 00 	lea    rbx,[r14+0xbc0]
 135fc7c:	e8 a9 5a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 135fc81:	4c 89 f7             	mov    rdi,r14
 135fc86:	e8 15 71 00 00       	call   1366da0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac324>
 135fc8b:	49 8b be 78 07 00 00 	mov    rdi,QWORD PTR [r14+0x778]
 135fc9a:	4c 89 36             	mov    QWORD PTR [rsi],r14
 135fcb6:	ff 50 38             	call   QWORD PTR [rax+0x38]
 135fcc1:	e8 5a 74 00 00       	call   1367120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac6a4>
 135fcce:	e8 97 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135fcdb:	e8 8a a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135fce8:	e8 7d a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135fcf5:	e8 70 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135fd02:	e8 63 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135fd0f:	e8 56 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135fd1c:	e8 95 13 00 00       	call   13610b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a663a>
 135fd29:	e8 3c a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
 135fd43:	e8 1e d3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 135fd4a:	e8 37 e7 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
