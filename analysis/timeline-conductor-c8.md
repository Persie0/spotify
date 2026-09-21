# TimelineConductor this+0xc8 dependency trace

Known: service AP 0x1867c98; +0x28 method 0xc2e960 returns [this+0xc8].
Constructor forms &this+0xc8 at 0x135d182 and stores it to stack slot rsp+0x60 at 0x135d189.

## All rsp+0x60 references in constructor
### 0x135d189: mov    QWORD PTR [rsp+0x60],rax
     135d14d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     135d154:	00 
     135d155:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     135d15c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135d163:	00 
     135d164:	48 8d 87 b8 00 00 00 	lea    rax,[rdi+0xb8]
     135d16b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
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

### 0x135fd4f: mov    rax,QWORD PTR [rsp+0x60]
     135fd1c:	e8 95 13 00 00       	call   13610b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a663a>
     135fd21:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
     135fd28:	00 
     135fd29:	e8 3c a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd2e:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135fd35:	00 
     135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     135fd3b:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135fd42:	00 
     135fd43:	e8 1e d3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135fd48:	31 ff                	xor    edi,edi
     135fd4a:	e8 37 e7 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fd4f:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fd54:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135fd57:	4c 89 30             	mov    QWORD PTR [rax],r14
     135fd5a:	48 85 ff             	test   rdi,rdi
     135fd5d:	74 06                	je     135fd65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a52e9>
     135fd5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fd62:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135fd65:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135fd6c:	00 
     135fd6d:	e8 f8 a1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd72:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135fd79:	00 
     135fd7a:	e8 7f 13 00 00       	call   13610fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6682>
     135fd7f:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135fd86:	00 
     135fd87:	e8 9c b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd8c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     135fd93:	00 
     135fd94:	e8 8f b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd99:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135fda0:	00 

### 0x135fdea: mov    rax,QWORD PTR [rsp+0x60]
     135fdc2:	48 0f 44 c8          	cmove  rcx,rax
     135fdc6:	49 89 8c 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rcx
     135fdcd:	00 
     135fdce:	48 8b 84 24 18 11 00 	mov    rax,QWORD PTR [rsp+0x1118]
     135fdd5:	00 
     135fdd6:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fdd9:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
     135fddd:	4c 39 f3             	cmp    rbx,r14
     135fde0:	74 1c                	je     135fdfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5382>
     135fde2:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135fde5:	48 85 ff             	test   rdi,rdi
     135fde8:	74 0e                	je     135fdf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a537c>
     135fdea:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fdef:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     135fdf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fdf5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     135fdf8:	48 83 c3 08          	add    rbx,0x8
     135fdfc:	eb df                	jmp    135fddd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5361>
     135fdfe:	6a 40                	push   0x40
     135fe00:	5f                   	pop    rdi
     135fe01:	e8 fa e0 48 00       	call   17edf00 <_Znwm@plt>
     135fe06:	48 8d 0d 03 8c 50 00 	lea    rcx,[rip+0x508c03]        # 1868a10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x250f8>
     135fe0d:	48 89 08             	mov    QWORD PTR [rax],rcx
     135fe10:	48 8b 8c 24 70 10 00 	mov    rcx,QWORD PTR [rsp+0x1070]
     135fe17:	00 
     135fe18:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     135fe1c:	66 0f ef c0          	pxor   xmm0,xmm0
     135fe20:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     135fe25:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     135fe2a:	f3 0f 7f 40 30       	movdqu XMMWORD PTR [rax+0x30],xmm0
     135fe2f:	48 8b 9c 24 f8 00 00 	mov    rbx,QWORD PTR [rsp+0xf8]
     135fe36:	00 
     135fe37:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]

### 0x135fe40: mov    r14,QWORD PTR [rsp+0x60]
     135fe10:	48 8b 8c 24 70 10 00 	mov    rcx,QWORD PTR [rsp+0x1070]
     135fe17:	00 
     135fe18:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     135fe1c:	66 0f ef c0          	pxor   xmm0,xmm0
     135fe20:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     135fe25:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     135fe2a:	f3 0f 7f 40 30       	movdqu XMMWORD PTR [rax+0x30],xmm0
     135fe2f:	48 8b 9c 24 f8 00 00 	mov    rbx,QWORD PTR [rsp+0xf8]
     135fe36:	00 
     135fe37:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135fe3a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135fe3d:	48 85 ff             	test   rdi,rdi
     135fe40:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
     135fe45:	74 0d                	je     135fe54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a53d8>
     135fe47:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fe4a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135fe4d:	66 0f ef c0          	pxor   xmm0,xmm0
     135fe51:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135fe54:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     135fe57:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
     135fe5e:	00 
     135fe5f:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
     135fe63:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
     135fe67:	4c 8b 0e             	mov    r9,QWORD PTR [rsi]
     135fe6a:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fe71:	00 
     135fe72:	6a 0c                	push   0xc
     135fe74:	59                   	pop    rcx
     135fe75:	4c 8d 84 24 58 01 00 	lea    r8,[rsp+0x158]
     135fe7c:	00 
     135fe7d:	48 89 c2             	mov    rdx,rax
     135fe80:	41 ff 91 c0 00 00 00 	call   QWORD PTR [r9+0xc0]
     135fe87:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]

### 0x135ff42: mov    rax,QWORD PTR [rsp+0x60]
     135ff12:	48 89 df             	mov    rdi,rbx
     135ff15:	4c 89 f6             	mov    rsi,r14
     135ff18:	e8 ff 98 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135ff1d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     135ff21:	e8 60 e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ff26:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
     135ff2d:	00 
     135ff2e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     135ff32:	e8 89 e6 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135ff37:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135ff3e:	00 
     135ff3f:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135ff42:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135ff47:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     135ff4a:	4c 89 b3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r14
     135ff51:	48 8d 35 48 e4 07 ff 	lea    rsi,[rip+0xffffffffff07e448]        # 3de3a0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3def>
     135ff58:	6a 01                	push   0x1
     135ff5a:	5a                   	pop    rdx
     135ff5b:	4c 89 ff             	mov    rdi,r15
     135ff5e:	e8 c9 9a d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     135ff63:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135ff66:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135ff6d:	00 
     135ff6e:	6a 08                	push   0x8
     135ff70:	59                   	pop    rcx
     135ff71:	4c 8d 84 24 d0 0a 00 	lea    r8,[rsp+0xad0]
     135ff78:	00 
     135ff79:	4c 89 f6             	mov    rsi,r14
     135ff7c:	48 89 da             	mov    rdx,rbx
     135ff7f:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     135ff85:	48 81 c3 f8 00 00 00 	add    rbx,0xf8
     135ff8c:	4c 8d b4 24 60 0f 00 	lea    r14,[rsp+0xf60]
     135ff93:	00 

### 0x135ffb5: mov    rax,QWORD PTR [rsp+0x60]
     135ff7f:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     135ff85:	48 81 c3 f8 00 00 00 	add    rbx,0xf8
     135ff8c:	4c 8d b4 24 60 0f 00 	lea    r14,[rsp+0xf60]
     135ff93:	00 
     135ff94:	48 89 df             	mov    rdi,rbx
     135ff97:	4c 89 f6             	mov    rsi,r14
     135ff9a:	e8 7d 98 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135ff9f:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     135ffa3:	e8 de e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ffa8:	48 8b bc 24 d8 0a 00 	mov    rdi,QWORD PTR [rsp+0xad8]
     135ffaf:	00 
     135ffb0:	e8 0b e6 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135ffb5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135ffba:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135ffbd:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135ffc2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ffc5:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135ffc8:	4c 8d 84 24 40 0e 00 	lea    r8,[rsp+0xe40]
     135ffcf:	00 
     135ffd0:	49 89 00             	mov    QWORD PTR [r8],rax
     135ffd3:	48 8d 35 b7 d0 73 ff 	lea    rsi,[rip+0xffffffffff73d0b7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     135ffda:	48 8d 0d 43 e5 95 ff 	lea    rcx,[rip+0xffffffffff95e543]        # cbe524 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b4c4>
     135ffe1:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
     135ffe8:	00 
     135ffe9:	6a 08                	push   0x8
     135ffeb:	41 59                	pop    r9
     135ffed:	4c 89 f7             	mov    rdi,r14
     135fff0:	31 d2                	xor    edx,edx
     135fff2:	e8 9d a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135fff7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135fffa:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     1360001:	00 
     1360002:	48 89 de             	mov    rsi,rbx

### 0x1360b6e: mov    rdi,QWORD PTR [rsp+0x60]
     1360b36:	48 8d bc 24 a0 09 00 	lea    rdi,[rsp+0x9a0]
     1360b3d:	00 
     1360b3e:	e8 27 94 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360b43:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1360b4a:	00 
     1360b4b:	e8 40 d3 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 

## Forward slices from loads of &this+0xc8
### load @0x135fd4f: rax = &this+0xc8
     135fd4f:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fd54:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135fd57:	4c 89 30             	mov    QWORD PTR [rax],r14
    [clobber]  135fd5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### load @0x135fdea: rax = &this+0xc8
     135fdea:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fdef:	48 8b 30             	mov    rsi,QWORD PTR [rax]
    [clobber]  135fdf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### load @0x135fe40: r14 = &this+0xc8
     135fe40:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
     135fe4a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135fe54:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     135fe80:	41 ff 91 c0 00 00 00 	call   QWORD PTR [r9+0xc0]
     135fe9a:	e8 7d 99 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135fea3:	e8 de e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135feb0:	e8 0b e7 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
    [clobber]  135fec0:	4d 8b 36             	mov    r14,QWORD PTR [r14]

### load @0x135ff42: rax = &this+0xc8
     135ff42:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135ff47:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     135ff5e:	e8 c9 9a d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
    [clobber]  135ff63:	49 8b 06             	mov    rax,QWORD PTR [r14]

### load @0x135ffb5: rax = &this+0xc8
     135ffb5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135ffba:	48 8b 18             	mov    rbx,QWORD PTR [rax]
    [clobber]  135ffc2:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### load @0x1360b6e: rdi = &this+0xc8
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
    [clobber]  1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]

## Writes through c8-address aliases
### alias rax from 0x135fd4f; write 0x135fd57: mov    QWORD PTR [rax],r14
     135fd28:	00 
     135fd29:	e8 3c a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd2e:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135fd35:	00 
     135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     135fd3b:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135fd42:	00 
     135fd43:	e8 1e d3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135fd48:	31 ff                	xor    edi,edi
     135fd4a:	e8 37 e7 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fd4f:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fd54:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135fd57:	4c 89 30             	mov    QWORD PTR [rax],r14
     135fd5a:	48 85 ff             	test   rdi,rdi
     135fd5d:	74 06                	je     135fd65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a52e9>
     135fd5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fd62:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135fd65:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135fd6c:	00 
     135fd6d:	e8 f8 a1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd72:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135fd79:	00 
     135fd7a:	e8 7f 13 00 00       	call   13610fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6682>
     135fd7f:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135fd86:	00 
     135fd87:	e8 9c b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd8c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     135fd93:	00 
     135fd94:	e8 8f b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd99:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135fda0:	00 

## Calls fed with c8 address
### from load 0x1360b6e; call 0x1360b73: call   a79e28 <JNI_OnUnload@@Base+0x16f5>; live=['rdi']
     1360b29:	48 8d bc 24 b0 08 00 	lea    rdi,[rsp+0x8b0]
     1360b30:	00 
     1360b31:	e8 34 94 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360b36:	48 8d bc 24 a0 09 00 	lea    rdi,[rsp+0x9a0]
     1360b3d:	00 
     1360b3e:	e8 27 94 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360b43:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1360b4a:	00 
     1360b4b:	e8 40 d3 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]

### from load 0x1360b6e; call 0x1360b80: call   a79e28 <JNI_OnUnload@@Base+0x16f5>; live=['rdi']
     1360b36:	48 8d bc 24 a0 09 00 	lea    rdi,[rsp+0x9a0]
     1360b3d:	00 
     1360b3e:	e8 27 94 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360b43:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1360b4a:	00 
     1360b4b:	e8 40 d3 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]

### from load 0x1360b6e; call 0x1360b8d: call   a79e28 <JNI_OnUnload@@Base+0x16f5>; live=['rdi']
     1360b43:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1360b4a:	00 
     1360b4b:	e8 40 d3 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### from load 0x1360b6e; call 0x1360b9a: call   a79e28 <JNI_OnUnload@@Base+0x16f5>; live=['rdi']
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 

### from load 0x1360b6e; call 0x1360ba7: call   a79e28 <JNI_OnUnload@@Base+0x16f5>; live=['rdi']
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 
     1360c0a:	75 0a                	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360c0c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1360c11:	e8 ba f0 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### from load 0x1360b6e; call 0x1360bb4: call   a79e28 <JNI_OnUnload@@Base+0x16f5>; live=['rdi']
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 
     1360c0a:	75 0a                	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360c0c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1360c11:	e8 ba f0 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1360c16:	e8 95 ee 48 00       	call   17efab0 <__stack_chk_fail@plt>

### from load 0x1360b6e; call 0x1360bc0: call   a9e486 <JNI_OnUnload@@Base+0x25d53>; live=['rdi']
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 
     1360c0a:	75 0a                	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360c0c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1360c11:	e8 ba f0 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1360c16:	e8 95 ee 48 00       	call   17efab0 <__stack_chk_fail@plt>

### from load 0x1360b6e; call 0x1360bcd: call   a79e28 <JNI_OnUnload@@Base+0x16f5>; live=['rdi']
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 
     1360c0a:	75 0a                	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360c0c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1360c11:	e8 ba f0 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1360c16:	e8 95 ee 48 00       	call   17efab0 <__stack_chk_fail@plt>

### from load 0x1360b6e; call 0x1360bda: call   a79e28 <JNI_OnUnload@@Base+0x16f5>; live=['rdi']
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 
     1360c0a:	75 0a                	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360c0c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1360c11:	e8 ba f0 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1360c16:	e8 95 ee 48 00       	call   17efab0 <__stack_chk_fail@plt>

### from load 0x1360b6e; call 0x1360be7: call   aa6e74 <JNI_OnUnload@@Base+0x2e741>; live=['rdi']
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 
     1360c0a:	75 0a                	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360c0c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1360c11:	e8 ba f0 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1360c16:	e8 95 ee 48 00       	call   17efab0 <__stack_chk_fail@plt>

### from load 0x1360b6e; call 0x1360bf4: call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>; live=['rdi']
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 
     1360c0a:	75 0a                	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360c0c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1360c11:	e8 ba f0 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1360c16:	e8 95 ee 48 00       	call   17efab0 <__stack_chk_fail@plt>

## Explicit +0xc8 destination writes in constructor
### 0x135d14d: mov    QWORD PTR [rsp+0xc8],rax
     135d111:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     135d118:	00 
     135d119:	48 8d 87 80 00 00 00 	lea    rax,[rdi+0x80]
     135d120:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     135d127:	00 
     135d128:	48 8d 87 88 00 00 00 	lea    rax,[rdi+0x88]
     135d12f:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
     135d136:	00 
     135d137:	48 8d 87 a0 00 00 00 	lea    rax,[rdi+0xa0]
     135d13e:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     135d145:	00 
     135d146:	48 8d 87 a8 00 00 00 	lea    rax,[rdi+0xa8]
     135d14d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     135d154:	00 
     135d155:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     135d15c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135d163:	00 
     135d164:	48 8d 87 b8 00 00 00 	lea    rax,[rdi+0xb8]
     135d16b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
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

### 0x135f530: mov    QWORD PTR [r14+0xc8],rax
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
     135f56d:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
     135f572:	e8 27 fa 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
     135f577:	4d 8d ae b0 01 00 00 	lea    r13,[r14+0x1b0]
     135f57e:	48 8b 84 24 30 0e 00 	mov    rax,QWORD PTR [rsp+0xe30]
     135f585:	00 
     135f586:	48 85 c0             	test   rax,rax
     135f589:	74 1e                	je     135f5a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b2d>
     135f58b:	48 8d 8c 24 10 0e 00 	lea    rcx,[rsp+0xe10]
     135f592:	00 
     135f593:	48 39 c8             	cmp    rax,rcx

## Nearby helper target snippets
### target 0xa79a7e
      a79a7e:	41 56                	push   r14
      a79a80:	53                   	push   rbx
      a79a81:	50                   	push   rax
      a79a82:	48 89 f3             	mov    rbx,rsi
      a79a85:	49 89 fe             	mov    r14,rdi
      a79a88:	48 89 f7             	mov    rdi,rsi
      a79a8b:	e8 80 44 d7 00       	call   17edf10 <strlen@plt>
      a79a90:	4c 89 f7             	mov    rdi,r14
      a79a93:	48 89 de             	mov    rsi,rbx
      a79a96:	48 89 c2             	mov    rdx,rax
      a79a99:	48 83 c4 08          	add    rsp,0x8
      a79a9d:	5b                   	pop    rbx
      a79a9e:	41 5e                	pop    r14
      a79aa0:	e9 fb 43 d7 00       	jmp    17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
      a79aa5:	50                   	push   rax
      a79aa6:	e8 c5 43 d7 00       	call   17ede70 <__cxa_begin_catch@plt>
      a79aab:	e8 d0 43 d7 00       	call   17ede80 <_ZSt9terminatev@plt>
      a79ab0:	41 57                	push   r15
      a79ab2:	41 56                	push   r14
      a79ab4:	41 55                	push   r13
      a79ab6:	41 54                	push   r12
      a79ab8:	53                   	push   rbx
      a79ab9:	48 83 ec 30          	sub    rsp,0x30
      a79abd:	89 d3                	mov    ebx,edx
      a79abf:	49 89 f7             	mov    r15,rsi
      a79ac2:	49 89 fc             	mov    r12,rdi
      a79ac5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79acc:	00 00 
      a79ace:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      a79ad3:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
      a79ad8:	4c 89 f7             	mov    rdi,r14
      a79adb:	e8 0c b0 d5 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>
      a79ae0:	4d 8b 36             	mov    r14,QWORD PTR [r14]
      a79ae3:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      a79ae8:	4c 89 ef             	mov    rdi,r13
      a79aeb:	4c 89 f6             	mov    rsi,r14
      a79aee:	4c 89 e2             	mov    rdx,r12
      a79af1:	4c 89 f9             	mov    rcx,r15
      a79af4:	e8 7c bc d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>
      a79af9:	49 8b 4d 08          	mov    rcx,QWORD PTR [r13+0x8]
      a79afd:	48 85 c9             	test   rcx,rcx
      a79b00:	74 23                	je     a79b25 <JNI_OnUnload@@Base+0x13f2>
      a79b02:	48 8b 35 af 97 f6 00 	mov    rsi,QWORD PTR [rip+0xf697af]        # 19e32b8 <__cxa_new_handler@@Base+0x2b48>
      a79b09:	48 8b 15 90 97 f6 00 	mov    rdx,QWORD PTR [rip+0xf69790]        # 19e32a0 <__cxa_new_handler@@Base+0x2b30>
      a79b10:	4c 89 f7             	mov    rdi,r14
      a79b13:	41 89 d8             	mov    r8d,ebx
      a79b16:	31 c0                	xor    eax,eax
      a79b18:	e8 c9 01 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>
      a79b1d:	4c 89 f7             	mov    rdi,r14
      a79b20:	e8 c3 b0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a79b25:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a79b2a:	e8 97 c1 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a79b2f:	8a 44 24 20          	mov    al,BYTE PTR [rsp+0x20]
      a79b33:	8a 4c 24 21          	mov    cl,BYTE PTR [rsp+0x21]
      a79b37:	64 48 8b 14 25 28 00 	mov    rdx,QWORD PTR fs:0x28
      a79b3e:	00 00 
      a79b40:	48 3b 54 24 28       	cmp    rdx,QWORD PTR [rsp+0x28]
      a79b45:	75 18                	jne    a79b5f <JNI_OnUnload@@Base+0x142c>
      a79b47:	0f b6 f8             	movzx  edi,al
      a79b4a:	0f b6 f1             	movzx  esi,cl
      a79b4d:	48 83 c4 30          	add    rsp,0x30
      a79b51:	5b                   	pop    rbx
      a79b52:	41 5c                	pop    r12
      a79b54:	41 5d                	pop    r13
      a79b56:	41 5e                	pop    r14
      a79b58:	41 5f                	pop    r15
      a79b5a:	e9 67 b0 d5 00       	jmp    17d4bc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9e7>
      a79b5f:	e8 4c 5f d7 00       	call   17efab0 <__stack_chk_fail@plt>
      a79b64:	48 89 c7             	mov    rdi,rax
      a79b67:	e8 39 ff ff ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      a79b6c:	41 57                	push   r15
      a79b6e:	41 56                	push   r14
      a79b70:	41 55                	push   r13
      a79b72:	41 54                	push   r12
      a79b74:	53                   	push   rbx
      a79b75:	48 83 ec 30          	sub    rsp,0x30
      a79b79:	89 d3                	mov    ebx,edx
      a79b7b:	49 89 f7             	mov    r15,rsi
      a79b7e:	49 89 fc             	mov    r12,rdi
      a79b81:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79b88:	00 00 
      a79b8a:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      a79b8f:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
      a79b94:	4c 89 f7             	mov    rdi,r14
      a79b97:	e8 50 af d5 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>
      a79b9c:	4d 8b 36             	mov    r14,QWORD PTR [r14]
      a79b9f:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      a79ba4:	4c 89 ef             	mov    rdi,r13
      a79ba7:	4c 89 f6             	mov    rsi,r14
      a79baa:	4c 89 e2             	mov    rdx,r12
      a79bad:	4c 89 f9             	mov    rcx,r15
      a79bb0:	e8 c0 bb d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>
      a79bb5:	49 8b 4d 08          	mov    rcx,QWORD PTR [r13+0x8]
      a79bb9:	48 85 c9             	test   rcx,rcx
      a79bbc:	74 23                	je     a79be1 <JNI_OnUnload@@Base+0x14ae>
      a79bbe:	48 8b 35 f3 96 f6 00 	mov    rsi,QWORD PTR [rip+0xf696f3]        # 19e32b8 <__cxa_new_handler@@Base+0x2b48>
      a79bc5:	48 8b 15 dc 96 f6 00 	mov    rdx,QWORD PTR [rip+0xf696dc]        # 19e32a8 <__cxa_new_handler@@Base+0x2b38>
      a79bcc:	4c 89 f7             	mov    rdi,r14
      a79bcf:	41 89 d8             	mov    r8d,ebx
      a79bd2:	31 c0                	xor    eax,eax

### target 0xa79e28
      a79e28:	48 89 f8             	mov    rax,rdi
      a79e2b:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      a79e2e:	48 83 20 00          	and    QWORD PTR [rax],0x0
      a79e32:	48 85 ff             	test   rdi,rdi
      a79e35:	74 06                	je     a79e3d <JNI_OnUnload@@Base+0x170a>
      a79e37:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a79e3a:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
      a79e3d:	c3                   	ret
      a79e3e:	41 57                	push   r15
      a79e40:	41 56                	push   r14
      a79e42:	53                   	push   rbx
      a79e43:	48 83 ec 60          	sub    rsp,0x60
      a79e47:	48 89 f3             	mov    rbx,rsi
      a79e4a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79e51:	00 00 
      a79e53:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      a79e58:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a79e5d:	e8 1b b6 d5 00       	call   17d547d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x129e>
      a79e62:	6a 10                	push   0x10
      a79e64:	5f                   	pop    rdi
      a79e65:	e8 96 40 d7 00       	call   17edf00 <_Znwm@plt>
      a79e6a:	49 89 c7             	mov    r15,rax
      a79e6d:	48 8d 05 6c 30 d8 00 	lea    rax,[rip+0xd8306c]        # 17fcee0 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2c00>
      a79e74:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a79e79:	48 89 02             	mov    QWORD PTR [rdx],rax
      a79e7c:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
      a79e80:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      a79e85:	4c 89 ff             	mov    rdi,r15
      a79e88:	e8 97 8a b9 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>
      a79e8d:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
      a79e91:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a79e96:	e8 cf 00 00 00       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      a79e9b:	6a 18                	push   0x18
      a79e9d:	5f                   	pop    rdi
      a79e9e:	e8 5d 40 d7 00       	call   17edf00 <_Znwm@plt>
      a79ea3:	49 89 c6             	mov    r14,rax
      a79ea6:	48 89 e7             	mov    rdi,rsp
      a79ea9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      a79ead:	48 8d 05 b4 2f d8 00 	lea    rax,[rip+0xd82fb4]        # 17fce68 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2b88>
      a79eb4:	49 89 06             	mov    QWORD PTR [r14],rax
      a79eb7:	48 8d 05 02 30 d8 00 	lea    rax,[rip+0xd83002]        # 17fcec0 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2be0>
      a79ebe:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      a79ec2:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
      a79ec6:	e8 bf 00 00 00       	call   a79f8a <JNI_OnUnload@@Base+0x1857>
      a79ecb:	e8 dc 00 00 00       	call   a79fac <JNI_OnUnload@@Base+0x1879>
      a79ed0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
      a79ed5:	4c 89 ff             	mov    rdi,r15
      a79ed8:	48 89 c6             	mov    rsi,rax
      a79edb:	48 89 da             	mov    rdx,rbx
      a79ede:	4c 89 f1             	mov    rcx,r14
      a79ee1:	e8 f0 d7 d4 00       	call   17c76d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b842>
      a79ee6:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]
      a79eea:	48 85 db             	test   rbx,rbx
      a79eed:	74 05                	je     a79ef4 <JNI_OnUnload@@Base+0x17c1>
      a79eef:	45 31 f6             	xor    r14d,r14d
      a79ef2:	eb 0a                	jmp    a79efe <JNI_OnUnload@@Base+0x17cb>
      a79ef4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a79ef9:	e8 c8 bd d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a79efe:	0f 57 c0             	xorps  xmm0,xmm0
      a79f01:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a79f06:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      a79f09:	e8 b8 bd d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a79f0e:	4d 85 f6             	test   r14,r14
      a79f11:	74 09                	je     a79f1c <JNI_OnUnload@@Base+0x17e9>
      a79f13:	49 8b 06             	mov    rax,QWORD PTR [r14]
      a79f16:	4c 89 f7             	mov    rdi,r14
      a79f19:	ff 50 08             	call   QWORD PTR [rax+0x8]
      a79f1c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a79f21:	e8 6a 3f d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a79f26:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79f2d:	00 00 
      a79f2f:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      a79f34:	75 0d                	jne    a79f43 <JNI_OnUnload@@Base+0x1810>
      a79f36:	48 89 d8             	mov    rax,rbx
      a79f39:	48 83 c4 60          	add    rsp,0x60
      a79f3d:	5b                   	pop    rbx
      a79f3e:	41 5e                	pop    r14
      a79f40:	41 5f                	pop    r15
      a79f42:	c3                   	ret
      a79f43:	e8 68 5b d7 00       	call   17efab0 <__stack_chk_fail@plt>
      a79f48:	48 89 c3             	mov    rbx,rax
      a79f4b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a79f50:	e8 15 00 00 00       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      a79f55:	4c 89 ff             	mov    rdi,r15
      a79f58:	e8 c3 3f d7 00       	call   17edf20 <_ZdlPv@plt>
      a79f5d:	eb 03                	jmp    a79f62 <JNI_OnUnload@@Base+0x182f>
      a79f5f:	48 89 c3             	mov    rbx,rax
      a79f62:	48 89 df             	mov    rdi,rbx
      a79f65:	e8 3b fb ff ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      a79f6a:	48 8b 4f 20          	mov    rcx,QWORD PTR [rdi+0x20]
      a79f6e:	48 39 f9             	cmp    rcx,rdi
      a79f71:	74 0d                	je     a79f80 <JNI_OnUnload@@Base+0x184d>
      a79f73:	48 85 c9             	test   rcx,rcx
      a79f76:	74 11                	je     a79f89 <JNI_OnUnload@@Base+0x1856>
      a79f78:	6a 05                	push   0x5
      a79f7a:	58                   	pop    rax
      a79f7b:	48 89 cf             	mov    rdi,rcx
      a79f7e:	eb 03                	jmp    a79f83 <JNI_OnUnload@@Base+0x1850>
      a79f80:	6a 04                	push   0x4
      a79f82:	58                   	pop    rax

### target 0xa79f6a
      a79f6a:	48 8b 4f 20          	mov    rcx,QWORD PTR [rdi+0x20]
      a79f6e:	48 39 f9             	cmp    rcx,rdi
      a79f71:	74 0d                	je     a79f80 <JNI_OnUnload@@Base+0x184d>
      a79f73:	48 85 c9             	test   rcx,rcx
      a79f76:	74 11                	je     a79f89 <JNI_OnUnload@@Base+0x1856>
      a79f78:	6a 05                	push   0x5
      a79f7a:	58                   	pop    rax
      a79f7b:	48 89 cf             	mov    rdi,rcx
      a79f7e:	eb 03                	jmp    a79f83 <JNI_OnUnload@@Base+0x1850>
      a79f80:	6a 04                	push   0x4
      a79f82:	58                   	pop    rax
      a79f83:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
      a79f86:	ff 24 c1             	jmp    QWORD PTR [rcx+rax*8]
      a79f89:	c3                   	ret
      a79f8a:	53                   	push   rbx
      a79f8b:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      a79f8e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      a79f92:	48 85 db             	test   rbx,rbx
      a79f95:	74 12                	je     a79fa9 <JNI_OnUnload@@Base+0x1876>
      a79f97:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      a79f9b:	e8 4e 8f b9 00       	call   1612eee <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe05c>
      a79fa0:	48 89 df             	mov    rdi,rbx
      a79fa3:	5b                   	pop    rbx
      a79fa4:	e9 77 3f d7 00       	jmp    17edf20 <_ZdlPv@plt>
      a79fa9:	5b                   	pop    rbx
      a79faa:	c3                   	ret
      a79fab:	cc                   	int3
      a79fac:	48 8b 05 1d 93 f6 00 	mov    rax,QWORD PTR [rip+0xf6931d]        # 19e32d0 <__cxa_new_handler@@Base+0x2b60>
      a79fb3:	48 85 c0             	test   rax,rax
      a79fb6:	74 01                	je     a79fb9 <JNI_OnUnload@@Base+0x1886>
      a79fb8:	c3                   	ret
      a79fb9:	50                   	push   rax
      a79fba:	e8 00 00 00 00       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      a79fbf:	50                   	push   rax
      a79fc0:	e8 00 00 00 00       	call   a79fc5 <JNI_OnUnload@@Base+0x1892>
      a79fc5:	48 8d 05 f9 ff ff ff 	lea    rax,[rip+0xfffffffffffffff9]        # a79fc5 <JNI_OnUnload@@Base+0x1892>
      a79fcc:	48 89 04 25 00 00 00 	mov    QWORD PTR ds:0x0,rax
      a79fd3:	00 
      a79fd4:	48 8d 05 8d 2e d8 00 	lea    rax,[rip+0xd82e8d]        # 17fce68 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2b88>
      a79fdb:	48 89 07             	mov    QWORD PTR [rdi],rax
      a79fde:	48 8d 05 db 2e d8 00 	lea    rax,[rip+0xd82edb]        # 17fcec0 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2be0>
      a79fe5:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      a79fe9:	48 83 c7 10          	add    rdi,0x10
      a79fed:	e9 36 fe ff ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
      a79ff2:	53                   	push   rbx
      a79ff3:	48 89 fb             	mov    rbx,rdi
      a79ff6:	e8 d9 ff ff ff       	call   a79fd4 <JNI_OnUnload@@Base+0x18a1>
      a79ffb:	48 89 df             	mov    rdi,rbx
      a79ffe:	5b                   	pop    rbx
      a79fff:	e9 1c 3f d7 00       	jmp    17edf20 <_ZdlPv@plt>
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
      a7a009:	cc                   	int3
      a7a00a:	41 57                	push   r15
      a7a00c:	41 56                	push   r14
      a7a00e:	41 55                	push   r13
      a7a010:	41 54                	push   r12
      a7a012:	53                   	push   rbx
      a7a013:	48 83 ec 60          	sub    rsp,0x60
      a7a017:	49 89 d6             	mov    r14,rdx
      a7a01a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a7a021:	00 00 
      a7a023:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      a7a028:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a7a02b:	ff 50 10             	call   QWORD PTR [rax+0x10]
      a7a02e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a7a031:	48 89 c7             	mov    rdi,rax
      a7a034:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      a7a037:	49 89 c7             	mov    r15,rax
      a7a03a:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
      a7a03f:	48 89 df             	mov    rdi,rbx
      a7a042:	4c 89 f6             	mov    rsi,r14
      a7a045:	e8 ce b2 d5 00       	call   17d5318 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1139>
      a7a04a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a7a04d:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      a7a051:	48 8d 0d c0 7b 9d ff 	lea    rcx,[rip+0xffffffffff9d7bc0]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      a7a058:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      a7a05d:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      a7a060:	48 89 4e 08          	mov    QWORD PTR [rsi+0x8],rcx
      a7a064:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      a7a069:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
      a7a06e:	49 83 26 00          	and    QWORD PTR [r14],0x0
      a7a072:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
      a7a077:	49 89 04 24          	mov    QWORD PTR [r12],rax
      a7a07b:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
      a7a080:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
      a7a085:	48 8d 05 70 71 0c 00 	lea    rax,[rip+0xc7170]        # b411fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e19c>
      a7a08c:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      a7a091:	48 8d 05 86 71 0c 00 	lea    rax,[rip+0xc7186]        # b4121e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e1be>
      a7a098:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      a7a09d:	4c 89 ff             	mov    rdi,r15
      a7a0a0:	4c 89 e2             	mov    rdx,r12
      a7a0a3:	e8 e0 73 d4 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
      a7a0a8:	4c 89 e7             	mov    rdi,r12
      a7a0ab:	e8 ee d1 02 00       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      a7a0b0:	4c 89 ef             	mov    rdi,r13
      a7a0b3:	e8 80 13 02 00       	call   a9b438 <JNI_OnUnload@@Base+0x22d05>
      a7a0b8:	4c 89 f7             	mov    rdi,r14
      a7a0bb:	e8 4c b3 d5 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
      a7a0c0:	48 89 df             	mov    rdi,rbx

### target 0xa7b728
      a7b728:	48 83 ec 18          	sub    rsp,0x18
      a7b72c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a7b733:	00 00 
      a7b735:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a7b73a:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
      a7b73f:	48 89 38             	mov    QWORD PTR [rax],rdi
      a7b742:	48 89 c7             	mov    rdi,rax
      a7b745:	e8 1a 00 00 00       	call   a7b764 <JNI_OnUnload@@Base+0x3031>
      a7b74a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a7b751:	00 00 
      a7b753:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      a7b758:	75 05                	jne    a7b75f <JNI_OnUnload@@Base+0x302c>
      a7b75a:	48 83 c4 18          	add    rsp,0x18
      a7b75e:	c3                   	ret
      a7b75f:	e8 4c 43 d7 00       	call   17efab0 <__stack_chk_fail@plt>
      a7b764:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a7b767:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a7b76a:	48 85 c9             	test   rcx,rcx
      a7b76d:	74 0f                	je     a7b77e <JNI_OnUnload@@Base+0x304b>
      a7b76f:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      a7b773:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a7b776:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      a7b779:	e9 a2 27 d7 00       	jmp    17edf20 <_ZdlPv@plt>
      a7b77e:	c3                   	ret
      a7b77f:	cc                   	int3
      a7b780:	41 57                	push   r15
      a7b782:	41 56                	push   r14
      a7b784:	41 54                	push   r12
      a7b786:	53                   	push   rbx
      a7b787:	50                   	push   rax
      a7b788:	49 89 d6             	mov    r14,rdx
      a7b78b:	49 89 f7             	mov    r15,rsi
      a7b78e:	48 89 fb             	mov    rbx,rdi
      a7b791:	49 89 d4             	mov    r12,rdx
      a7b794:	49 29 f4             	sub    r12,rsi
      a7b797:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
      a7b79a:	48 89 c8             	mov    rax,rcx
      a7b79d:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
      a7b7a1:	48 ff c8             	dec    rax
      a7b7a4:	f6 07 01             	test   BYTE PTR [rdi],0x1
      a7b7a7:	6a 16                	push   0x16
      a7b7a9:	5e                   	pop    rsi
      a7b7aa:	48 0f 45 f0          	cmovne rsi,rax
      a7b7ae:	4c 89 e2             	mov    rdx,r12
      a7b7b1:	48 29 f2             	sub    rdx,rsi
      a7b7b4:	76 25                	jbe    a7b7db <JNI_OnUnload@@Base+0x30a8>
      a7b7b6:	f6 c1 01             	test   cl,0x1
      a7b7b9:	74 06                	je     a7b7c1 <JNI_OnUnload@@Base+0x308e>
      a7b7bb:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      a7b7bf:	eb 05                	jmp    a7b7c6 <JNI_OnUnload@@Base+0x3093>
      a7b7c1:	d1 e9                	shr    ecx,1
      a7b7c3:	83 e1 7f             	and    ecx,0x7f
      a7b7c6:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
      a7b7cb:	48 89 df             	mov    rdi,rbx
      a7b7ce:	45 31 c0             	xor    r8d,r8d
      a7b7d1:	49 89 c9             	mov    r9,rcx
      a7b7d4:	e8 ff 00 00 00       	call   a7b8d8 <JNI_OnUnload@@Base+0x31a5>
      a7b7d9:	8a 0b                	mov    cl,BYTE PTR [rbx]
      a7b7db:	f6 c1 01             	test   cl,0x1
      a7b7de:	74 06                	je     a7b7e6 <JNI_OnUnload@@Base+0x30b3>
      a7b7e0:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      a7b7e4:	eb 11                	jmp    a7b7f7 <JNI_OnUnload@@Base+0x30c4>
      a7b7e6:	48 8d 43 01          	lea    rax,[rbx+0x1]
      a7b7ea:	eb 0b                	jmp    a7b7f7 <JNI_OnUnload@@Base+0x30c4>
      a7b7ec:	41 8a 0f             	mov    cl,BYTE PTR [r15]
      a7b7ef:	88 08                	mov    BYTE PTR [rax],cl
      a7b7f1:	48 ff c0             	inc    rax
      a7b7f4:	49 ff c7             	inc    r15
      a7b7f7:	4d 39 f7             	cmp    r15,r14
      a7b7fa:	75 f0                	jne    a7b7ec <JNI_OnUnload@@Base+0x30b9>
      a7b7fc:	c6 00 00             	mov    BYTE PTR [rax],0x0
      a7b7ff:	f6 03 01             	test   BYTE PTR [rbx],0x1
      a7b802:	75 08                	jne    a7b80c <JNI_OnUnload@@Base+0x30d9>
      a7b804:	45 00 e4             	add    r12b,r12b
      a7b807:	44 88 23             	mov    BYTE PTR [rbx],r12b
      a7b80a:	eb 04                	jmp    a7b810 <JNI_OnUnload@@Base+0x30dd>
      a7b80c:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
      a7b810:	48 89 d8             	mov    rax,rbx
      a7b813:	48 83 c4 08          	add    rsp,0x8
      a7b817:	5b                   	pop    rbx
      a7b818:	41 5c                	pop    r12
      a7b81a:	41 5e                	pop    r14
      a7b81c:	41 5f                	pop    r15
      a7b81e:	c3                   	ret
      a7b81f:	cc                   	int3
      a7b820:	89 f8                	mov    eax,edi
      a7b822:	d0 e8                	shr    al,1
      a7b824:	40 f6 c7 01          	test   dil,0x1
      a7b828:	0f b6 c0             	movzx  eax,al
      a7b82b:	48 0f 45 c6          	cmovne rax,rsi
      a7b82f:	48 85 c0             	test   rax,rax
      a7b832:	0f 94 c0             	sete   al
      a7b835:	c3                   	ret
      a7b836:	0f b6 0f             	movzx  ecx,BYTE PTR [rdi]
      a7b839:	48 8d 47 01          	lea    rax,[rdi+0x1]
      a7b83d:	89 ca                	mov    edx,ecx
      a7b83f:	d1 ea                	shr    edx,1
      a7b841:	f6 c1 01             	test   cl,0x1
      a7b844:	48 0f 45 47 10       	cmovne rax,QWORD PTR [rdi+0x10]
      a7b849:	48 0f 45 57 08       	cmovne rdx,QWORD PTR [rdi+0x8]

### target 0xa9e486
      a9e486:	48 85 ff             	test   rdi,rdi
      a9e489:	0f 85 01 00 00 00    	jne    a9e490 <JNI_OnUnload@@Base+0x25d5d>
      a9e48f:	c3                   	ret
      a9e490:	6a ff                	push   0xffffffffffffffff
      a9e492:	58                   	pop    rax
      a9e493:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a9e499:	48 85 c0             	test   rax,rax
      a9e49c:	74 01                	je     a9e49f <JNI_OnUnload@@Base+0x25d6c>
      a9e49e:	c3                   	ret
      a9e49f:	53                   	push   rbx
      a9e4a0:	48 89 fb             	mov    rbx,rdi
      a9e4a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a9e4a6:	ff 50 10             	call   QWORD PTR [rax+0x10]
      a9e4a9:	48 89 df             	mov    rdi,rbx
      a9e4ac:	5b                   	pop    rbx
      a9e4ad:	e9 3e fb d4 00       	jmp    17edff0 <_ZNSt6__ndk119__shared_weak_count14__release_weakEv@plt>
      a9e4b2:	48 85 ff             	test   rdi,rdi
      a9e4b5:	0f 85 35 fb d4 00    	jne    17edff0 <_ZNSt6__ndk119__shared_weak_count14__release_weakEv@plt>
      a9e4bb:	c3                   	ret
      a9e4bc:	48 8d 05 a5 ef d5 00 	lea    rax,[rip+0xd5efa5]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      a9e4c3:	48 89 07             	mov    QWORD PTR [rdi],rax
      a9e4c6:	e9 45 fb d4 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      a9e4cb:	cc                   	int3
      a9e4cc:	53                   	push   rbx
      a9e4cd:	48 89 fb             	mov    rbx,rdi
      a9e4d0:	e8 e7 ff ff ff       	call   a9e4bc <JNI_OnUnload@@Base+0x25d89>
      a9e4d5:	48 89 df             	mov    rdi,rbx
      a9e4d8:	5b                   	pop    rbx
      a9e4d9:	e9 42 fa d4 00       	jmp    17edf20 <_ZdlPv@plt>
      a9e4de:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      a9e4e2:	48 83 c7 18          	add    rdi,0x18
      a9e4e6:	ff 20                	jmp    QWORD PTR [rax]
      a9e4e8:	31 c0                	xor    eax,eax
      a9e4ea:	31 c9                	xor    ecx,ecx
      a9e4ec:	49 89 c0             	mov    r8,rax
      a9e4ef:	49 c1 e0 08          	shl    r8,0x8
      a9e4f3:	0f b6 04 0f          	movzx  eax,BYTE PTR [rdi+rcx*1]
      a9e4f7:	4c 09 c0             	or     rax,r8
      a9e4fa:	48 ff c1             	inc    rcx
      a9e4fd:	48 83 f9 08          	cmp    rcx,0x8
      a9e501:	75 e9                	jne    a9e4ec <JNI_OnUnload@@Base+0x25db9>
      a9e503:	31 c9                	xor    ecx,ecx
      a9e505:	45 31 c0             	xor    r8d,r8d
      a9e508:	4d 89 c1             	mov    r9,r8
      a9e50b:	49 c1 e1 08          	shl    r9,0x8
      a9e50f:	44 0f b6 44 0f 08    	movzx  r8d,BYTE PTR [rdi+rcx*1+0x8]
      a9e515:	4d 09 c8             	or     r8,r9
      a9e518:	48 ff c1             	inc    rcx
      a9e51b:	48 83 f9 08          	cmp    rcx,0x8
      a9e51f:	75 e7                	jne    a9e508 <JNI_OnUnload@@Base+0x25dd5>
      a9e521:	48 89 06             	mov    QWORD PTR [rsi],rax
      a9e524:	4c 89 02             	mov    QWORD PTR [rdx],r8
      a9e527:	c3                   	ret
      a9e528:	55                   	push   rbp
      a9e529:	41 57                	push   r15
      a9e52b:	41 56                	push   r14
      a9e52d:	41 55                	push   r13
      a9e52f:	41 54                	push   r12
      a9e531:	53                   	push   rbx
      a9e532:	48 83 ec 68          	sub    rsp,0x68
      a9e536:	49 89 f6             	mov    r14,rsi
      a9e539:	49 89 fc             	mov    r12,rdi
      a9e53c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a9e543:	00 00 
      a9e545:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      a9e54a:	0f 57 c0             	xorps  xmm0,xmm0
      a9e54d:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      a9e552:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      a9e557:	49 89 d5             	mov    r13,rdx
      a9e55a:	8b 72 10             	mov    esi,DWORD PTR [rdx+0x10]
      a9e55d:	48 8b 15 a4 4d f4 00 	mov    rdx,QWORD PTR [rip+0xf44da4]        # 19e3308 <__cxa_new_handler@@Base+0x2b98>
      a9e564:	49 8b 06             	mov    rax,QWORD PTR [r14]
      a9e567:	4c 89 f7             	mov    rdi,r14
      a9e56a:	31 c9                	xor    ecx,ecx
      a9e56c:	ff 90 60 05 00 00    	call   QWORD PTR [rax+0x560]
      a9e572:	48 89 c3             	mov    rbx,rax
      a9e575:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      a9e57a:	4c 89 ff             	mov    rdi,r15
      a9e57d:	e8 44 77 d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a9e582:	4d 89 37             	mov    QWORD PTR [r15],r14
      a9e585:	49 89 5f 08          	mov    QWORD PTR [r15+0x8],rbx
      a9e589:	48 85 db             	test   rbx,rbx
      a9e58c:	0f 84 23 01 00 00    	je     a9e6b5 <JNI_OnUnload@@Base+0x25f82>
      a9e592:	41 8b 75 10          	mov    esi,DWORD PTR [r13+0x10]
      a9e596:	48 8b 15 6b 4d f4 00 	mov    rdx,QWORD PTR [rip+0xf44d6b]        # 19e3308 <__cxa_new_handler@@Base+0x2b98>
      a9e59d:	49 8b 06             	mov    rax,QWORD PTR [r14]
      a9e5a0:	4c 89 f7             	mov    rdi,r14
      a9e5a3:	31 c9                	xor    ecx,ecx
      a9e5a5:	ff 90 60 05 00 00    	call   QWORD PTR [rax+0x560]
      a9e5ab:	48 89 c5             	mov    rbp,rax
      a9e5ae:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
      a9e5b3:	48 89 df             	mov    rdi,rbx
      a9e5b6:	e8 0b 77 d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a9e5bb:	4c 89 33             	mov    QWORD PTR [rbx],r14
      a9e5be:	48 89 6b 08          	mov    QWORD PTR [rbx+0x8],rbp
      a9e5c2:	48 85 ed             	test   rbp,rbp
      a9e5c5:	0f 84 f8 00 00 00    	je     a9e6c3 <JNI_OnUnload@@Base+0x25f90>
      a9e5cb:	4c 89 e8             	mov    rax,r13
      a9e5ce:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
      a9e5d2:	48 83 c0 08          	add    rax,0x8

### target 0xab981c
      ab981c:	53                   	push   rbx
      ab981d:	48 89 fb             	mov    rbx,rdi
      ab9820:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      ab9823:	0f 57 c9             	xorps  xmm1,xmm1
      ab9826:	0f 11 0e             	movups XMMWORD PTR [rsi],xmm1
      ab9829:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      ab982d:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      ab9830:	e8 51 4c fe ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ab9835:	48 89 d8             	mov    rax,rbx
      ab9838:	5b                   	pop    rbx
      ab9839:	c3                   	ret
      ab983a:	48 39 d6             	cmp    rsi,rdx
      ab983d:	74 22                	je     ab9861 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6801>
      ab983f:	53                   	push   rbx
      ab9840:	48 89 f0             	mov    rax,rsi
      ab9843:	48 89 fb             	mov    rbx,rdi
      ab9846:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
      ab984a:	48 89 d7             	mov    rdi,rdx
      ab984d:	48 89 c2             	mov    rdx,rax
      ab9850:	e8 0d 00 00 00       	call   ab9862 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6802>
      ab9855:	48 89 df             	mov    rdi,rbx
      ab9858:	48 89 c6             	mov    rsi,rax
      ab985b:	5b                   	pop    rbx
      ab985c:	e9 17 dd ff ff       	jmp    ab7578 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4518>
      ab9861:	c3                   	ret
      ab9862:	41 57                	push   r15
      ab9864:	41 56                	push   r14
      ab9866:	53                   	push   rbx
      ab9867:	48 89 d3             	mov    rbx,rdx
      ab986a:	48 39 f7             	cmp    rdi,rsi
      ab986d:	74 1e                	je     ab988d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x682d>
      ab986f:	49 89 f6             	mov    r14,rsi
      ab9872:	49 89 ff             	mov    r15,rdi
      ab9875:	48 89 df             	mov    rdi,rbx
      ab9878:	4c 89 fe             	mov    rsi,r15
      ab987b:	e8 9c ff ff ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ab9880:	49 83 c7 10          	add    r15,0x10
      ab9884:	48 83 c3 10          	add    rbx,0x10
      ab9888:	4d 39 f7             	cmp    r15,r14
      ab988b:	75 e8                	jne    ab9875 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6815>
      ab988d:	48 89 d8             	mov    rax,rbx
      ab9890:	5b                   	pop    rbx
      ab9891:	41 5e                	pop    r14
      ab9893:	41 5f                	pop    r15
      ab9895:	c3                   	ret
      ab9896:	53                   	push   rbx
      ab9897:	48 89 fb             	mov    rbx,rdi
      ab989a:	6a 10                	push   0x10
      ab989c:	5f                   	pop    rdi
      ab989d:	e8 5e 46 d3 00       	call   17edf00 <_Znwm@plt>
      ab98a2:	48 8d 0d ff 54 d4 00 	lea    rcx,[rip+0xd454ff]        # 17feda8 <_ZTIN4asio22service_already_existsE@@Base+0x590>
      ab98a9:	48 89 08             	mov    QWORD PTR [rax],rcx
      ab98ac:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      ab98b0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      ab98b4:	5b                   	pop    rbx
      ab98b5:	c3                   	ret
      ab98b6:	48 8d 05 eb 54 d4 00 	lea    rax,[rip+0xd454eb]        # 17feda8 <_ZTIN4asio22service_already_existsE@@Base+0x590>
      ab98bd:	48 89 06             	mov    QWORD PTR [rsi],rax
      ab98c0:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      ab98c4:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      ab98c8:	c3                   	ret
      ab98c9:	cc                   	int3
      ab98ca:	55                   	push   rbp
      ab98cb:	41 57                	push   r15
      ab98cd:	41 56                	push   r14
      ab98cf:	41 55                	push   r13
      ab98d1:	41 54                	push   r12
      ab98d3:	53                   	push   rbx
      ab98d4:	50                   	push   rax
      ab98d5:	48 89 f3             	mov    rbx,rsi
      ab98d8:	48 8b 6f 08          	mov    rbp,QWORD PTR [rdi+0x8]
      ab98dc:	44 8b 02             	mov    r8d,DWORD PTR [rdx]
      ab98df:	0f b6 42 48          	movzx  eax,BYTE PTR [rdx+0x48]
      ab98e3:	a8 01                	test   al,0x1
      ab98e5:	74 09                	je     ab98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6890>
      ab98e7:	8b 42 50             	mov    eax,DWORD PTR [rdx+0x50]
      ab98ea:	48 8b 52 58          	mov    rdx,QWORD PTR [rdx+0x58]
      ab98ee:	eb 06                	jmp    ab98f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6896>
      ab98f0:	d1 e8                	shr    eax,1
      ab98f2:	48 83 c2 49          	add    rdx,0x49
      ab98f6:	41 b9 f4 01 00 00    	mov    r9d,0x1f4
      ab98fc:	44 39 c8             	cmp    eax,r9d
      ab98ff:	44 0f 4c c8          	cmovl  r9d,eax
      ab9903:	48 89 14 24          	mov    QWORD PTR [rsp],rdx
      ab9907:	48 8d 35 27 94 8b ff 	lea    rsi,[rip+0xffffffffff8b9427]        # 372d35 <_ZTSSt12bad_any_cast@@Base-0x1d493>
      ab990e:	48 8d 0d 6b 11 88 ff 	lea    rcx,[rip+0xffffffffff88116b]        # 33aa80 <_ZTSSt12bad_any_cast@@Base-0x55748>
      ab9915:	6a 04                	push   0x4
      ab9917:	5f                   	pop    rdi
      ab9918:	ba 51 01 00 00       	mov    edx,0x151
      ab991d:	31 c0                	xor    eax,eax
      ab991f:	e8 ae cf d1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      ab9924:	4c 8d 75 60          	lea    r14,[rbp+0x60]
      ab9928:	4c 8b 65 60          	mov    r12,QWORD PTR [rbp+0x60]
      ab992c:	4c 8b 7d 68          	mov    r15,QWORD PTR [rbp+0x68]
      ab9930:	4d 39 fc             	cmp    r12,r15
      ab9933:	74 13                	je     ab9948 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x68e8>
      ab9935:	4d 8d 6c 24 10       	lea    r13,[r12+0x10]
      ab993a:	49 39 1c 24          	cmp    QWORD PTR [r12],rbx
      ab993e:	74 0d                	je     ab994d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x68ed>
      ab9940:	4d 89 ec             	mov    r12,r13

### target 0x10a9a2c
     10a9a2c:	41 57                	push   r15
     10a9a2e:	41 56                	push   r14
     10a9a30:	41 54                	push   r12
     10a9a32:	53                   	push   rbx
     10a9a33:	50                   	push   rax
     10a9a34:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
     10a9a38:	0f 57 c0             	xorps  xmm0,xmm0
     10a9a3b:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     10a9a3f:	48 89 1f             	mov    QWORD PTR [rdi],rbx
     10a9a42:	48 85 d2             	test   rdx,rdx
     10a9a45:	74 1f                	je     10a9a66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e7c>
     10a9a47:	49 89 d6             	mov    r14,rdx
     10a9a4a:	49 89 f7             	mov    r15,rsi
     10a9a4d:	49 89 fc             	mov    r12,rdi
     10a9a50:	4c 89 e7             	mov    rdi,r12
     10a9a53:	48 89 de             	mov    rsi,rbx
     10a9a56:	4c 89 fa             	mov    rdx,r15
     10a9a59:	e8 28 00 00 00       	call   10a9a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e9c>
     10a9a5e:	49 ff c7             	inc    r15
     10a9a61:	49 ff ce             	dec    r14
     10a9a64:	75 ea                	jne    10a9a50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e66>
     10a9a66:	48 83 c4 08          	add    rsp,0x8
     10a9a6a:	5b                   	pop    rbx
     10a9a6b:	41 5c                	pop    r12
     10a9a6d:	41 5e                	pop    r14
     10a9a6f:	41 5f                	pop    r15
     10a9a71:	c3                   	ret
     10a9a72:	49 89 c6             	mov    r14,rax
     10a9a75:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     10a9a78:	e8 3d 4b a3 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
     10a9a7d:	4c 89 f7             	mov    rdi,r14
     10a9a80:	e8 4b 62 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10a9a85:	cc                   	int3
     10a9a86:	55                   	push   rbp
     10a9a87:	41 57                	push   r15
     10a9a89:	41 56                	push   r14
     10a9a8b:	41 55                	push   r13
     10a9a8d:	41 54                	push   r12
     10a9a8f:	53                   	push   rbx
     10a9a90:	48 83 ec 28          	sub    rsp,0x28
     10a9a94:	49 89 d6             	mov    r14,rdx
     10a9a97:	49 89 f7             	mov    r15,rsi
     10a9a9a:	48 89 fb             	mov    rbx,rdi
     10a9a9d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a9aa4:	00 00 
     10a9aa6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a9aab:	48 8d 6f 08          	lea    rbp,[rdi+0x8]
     10a9aaf:	48 39 f5             	cmp    rbp,rsi
     10a9ab2:	74 0c                	je     10a9ac0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ed6>
     10a9ab4:	45 8a 2e             	mov    r13b,BYTE PTR [r14]
     10a9ab7:	41 8a 47 19          	mov    al,BYTE PTR [r15+0x19]
     10a9abb:	41 38 c5             	cmp    r13b,al
     10a9abe:	73 2b                	jae    10a9aeb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270f01>
     10a9ac0:	4c 89 f8             	mov    rax,r15
     10a9ac3:	4c 39 3b             	cmp    QWORD PTR [rbx],r15
     10a9ac6:	74 10                	je     10a9ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270eee>
     10a9ac8:	4c 89 ff             	mov    rdi,r15
     10a9acb:	e8 40 60 a3 ff       	call   adfb10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cab0>
     10a9ad0:	41 8a 0e             	mov    cl,BYTE PTR [r14]
     10a9ad3:	38 48 19             	cmp    BYTE PTR [rax+0x19],cl
     10a9ad6:	73 45                	jae    10a9b1d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270f33>
     10a9ad8:	49 83 3f 00          	cmp    QWORD PTR [r15],0x0
     10a9adc:	4d 89 fc             	mov    r12,r15
     10a9adf:	74 58                	je     10a9b39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270f4f>
     10a9ae1:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     10a9ae5:	48 83 c0 08          	add    rax,0x8
     10a9ae9:	eb 40                	jmp    10a9b2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270f41>
     10a9aeb:	0f 86 82 00 00 00    	jbe    10a9b73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270f89>
     10a9af1:	4c 89 ff             	mov    rdi,r15
     10a9af4:	e8 e9 4c 9f ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     10a9af9:	49 89 c4             	mov    r12,rax
     10a9afc:	48 39 e8             	cmp    rax,rbp
     10a9aff:	74 0b                	je     10a9b0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270f22>
     10a9b01:	45 3a 6c 24 19       	cmp    r13b,BYTE PTR [r12+0x19]
     10a9b06:	0f 83 86 00 00 00    	jae    10a9b92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270fa8>
     10a9b0c:	49 83 7f 08 00       	cmp    QWORD PTR [r15+0x8],0x0
     10a9b11:	0f 84 81 00 00 00    	je     10a9b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270fae>
     10a9b17:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
     10a9b1b:	eb 11                	jmp    10a9b2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270f44>
     10a9b1d:	0f b6 d1             	movzx  edx,cl
     10a9b20:	48 89 e6             	mov    rsi,rsp
     10a9b23:	48 89 df             	mov    rdi,rbx
     10a9b26:	e8 79 00 00 00       	call   10a9ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270fba>
     10a9b2b:	49 89 c4             	mov    r12,rax
     10a9b2e:	49 83 3c 24 00       	cmp    QWORD PTR [r12],0x0
     10a9b33:	75 3e                	jne    10a9b73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270f89>
     10a9b35:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     10a9b39:	6a 20                	push   0x20
     10a9b3b:	5f                   	pop    rdi
     10a9b3c:	e8 bf 43 74 00       	call   17edf00 <_Znwm@plt>
     10a9b41:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     10a9b46:	49 89 6d 08          	mov    QWORD PTR [r13+0x8],rbp
     10a9b4a:	41 8a 0e             	mov    cl,BYTE PTR [r14]
     10a9b4d:	88 48 19             	mov    BYTE PTR [rax+0x19],cl
     10a9b50:	41 c6 45 10 01       	mov    BYTE PTR [r13+0x10],0x1
     10a9b55:	48 89 df             	mov    rdi,rbx
     10a9b58:	4c 89 fe             	mov    rsi,r15
     10a9b5b:	4c 89 e2             	mov    rdx,r12
     10a9b5e:	48 89 c1             	mov    rcx,rax
     10a9b61:	e8 06 60 a3 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>

### target 0x13610fe
     13610fe:	53                   	push   rbx
     13610ff:	48 89 fb             	mov    rbx,rdi
     1361102:	48 81 c7 80 00 00 00 	add    rdi,0x80
     1361109:	e8 1a a6 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     136110e:	48 83 c3 68          	add    rbx,0x68
     1361112:	48 89 df             	mov    rdi,rbx
     1361115:	5b                   	pop    rbx
     1361116:	e9 0d a6 71 ff       	jmp    a7b728 <JNI_OnUnload@@Base+0x2ff5>
     136111b:	cc                   	int3
     136111c:	41 56                	push   r14
     136111e:	53                   	push   rbx
     136111f:	48 81 ec 88 00 00 00 	sub    rsp,0x88
     1361126:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     136112d:	00 00 
     136112f:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     1361136:	00 
     1361137:	48 8d 05 8a 69 5d 00 	lea    rax,[rip+0x5d698a]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     136113e:	48 39 c2             	cmp    rdx,rax
     1361141:	75 6c                	jne    13611af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6733>
     1361143:	81 fe 4f 1f 00 00    	cmp    esi,0x1f4f
     1361149:	75 64                	jne    13611af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6733>
     136114b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     136114e:	48 8b 98 c8 00 00 00 	mov    rbx,QWORD PTR [rax+0xc8]
     1361155:	48 8d 35 26 e3 fc fe 	lea    rsi,[rip+0xfffffffffefce326]        # 32f482 <_ZTSSt12bad_any_cast@@Base-0x60d46>
     136115c:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     1361161:	4c 89 f7             	mov    rdi,r14
     1361164:	e8 15 89 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1361169:	31 c0                	xor    eax,eax
     136116b:	41 88 46 38          	mov    BYTE PTR [r14+0x38],al
     136116f:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
     1361173:	41 88 46 48          	mov    BYTE PTR [r14+0x48],al
     1361177:	66 41 83 66 50 00    	and    WORD PTR [r14+0x50],0x0
     136117d:	0f 57 c0             	xorps  xmm0,xmm0
     1361180:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
     1361185:	41 0f 11 46 21       	movups XMMWORD PTR [r14+0x21],xmm0
     136118a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     136118d:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1361192:	48 89 de             	mov    rsi,rbx
     1361195:	4c 89 f2             	mov    rdx,r14
     1361198:	ff 50 28             	call   QWORD PTR [rax+0x28]
     136119b:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     13611a0:	e8 41 2c 7d ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     13611a5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13611aa:	e8 1d d6 73 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13611af:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13611b6:	00 00 
     13611b8:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     13611bf:	00 
     13611c0:	75 33                	jne    13611f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6779>
     13611c2:	48 81 c4 88 00 00 00 	add    rsp,0x88
     13611c9:	5b                   	pop    rbx
     13611ca:	41 5e                	pop    r14
     13611cc:	c3                   	ret
     13611cd:	48 89 c3             	mov    rbx,rax
     13611d0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13611d5:	e8 f2 d5 73 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13611da:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13611e1:	00 00 
     13611e3:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     13611ea:	00 
     13611eb:	75 08                	jne    13611f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6779>
     13611ed:	48 89 df             	mov    rdi,rbx
     13611f0:	e8 db ea 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13611f5:	e8 b6 e8 48 00       	call   17efab0 <__stack_chk_fail@plt>
     13611fa:	53                   	push   rbx
     13611fb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     13611fe:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1361202:	48 85 db             	test   rbx,rbx
     1361205:	74 12                	je     1361219 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a679d>
     1361207:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     136120b:	e8 6c df 80 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     1361210:	48 89 df             	mov    rdi,rbx
     1361213:	5b                   	pop    rbx
     1361214:	e9 07 cd 48 00       	jmp    17edf20 <_ZdlPv@plt>
     1361219:	5b                   	pop    rbx
     136121a:	c3                   	ret
     136121b:	cc                   	int3
     136121c:	53                   	push   rbx
     136121d:	48 89 fb             	mov    rbx,rdi
     1361220:	6a 10                	push   0x10
     1361222:	5f                   	pop    rdi
     1361223:	e8 d8 cc 48 00       	call   17edf00 <_Znwm@plt>
     1361228:	48 8d 0d e1 6e 50 00 	lea    rcx,[rip+0x506ee1]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>
     136122f:	48 89 08             	mov    QWORD PTR [rax],rcx
     1361232:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     1361236:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     136123a:	5b                   	pop    rbx
     136123b:	c3                   	ret
     136123c:	48 8d 05 cd 6e 50 00 	lea    rax,[rip+0x506ecd]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>
     1361243:	48 89 06             	mov    QWORD PTR [rsi],rax
     1361246:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     136124a:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     136124e:	c3                   	ret
     136124f:	cc                   	int3
     1361250:	55                   	push   rbp
     1361251:	41 56                	push   r14
     1361253:	53                   	push   rbx
     1361254:	48 83 ec 40          	sub    rsp,0x40
     1361258:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     136125f:	00 00 

### target 0x17da794
     17da794:	41 57                	push   r15
     17da796:	41 56                	push   r14
     17da798:	53                   	push   rbx
     17da799:	4c 89 cb             	mov    rbx,r9
     17da79c:	4d 89 c6             	mov    r14,r8
     17da79f:	49 89 ff             	mov    r15,rdi
     17da7a2:	0f 57 c0             	xorps  xmm0,xmm0
     17da7a5:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     17da7aa:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     17da7ad:	48 89 77 18          	mov    QWORD PTR [rdi+0x18],rsi
     17da7b1:	48 89 57 20          	mov    QWORD PTR [rdi+0x20],rdx
     17da7b5:	48 89 4f 28          	mov    QWORD PTR [rdi+0x28],rcx
     17da7b9:	6a 08                	push   0x8
     17da7bb:	5e                   	pop    rsi
     17da7bc:	4c 89 cf             	mov    rdi,r9
     17da7bf:	e8 7c 50 01 00       	call   17ef840 <_ZnamSt11align_val_t@plt>
     17da7c4:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     17da7c8:	49 89 5f 38          	mov    QWORD PTR [r15+0x38],rbx
     17da7cc:	48 89 c7             	mov    rdi,rax
     17da7cf:	4c 89 f6             	mov    rsi,r14
     17da7d2:	48 89 da             	mov    rdx,rbx
     17da7d5:	41 ff 57 18          	call   QWORD PTR [r15+0x18]
     17da7d9:	5b                   	pop    rbx
     17da7da:	41 5e                	pop    r14
     17da7dc:	41 5f                	pop    r15
     17da7de:	c3                   	ret
     17da7df:	48 89 c7             	mov    rdi,rax
     17da7e2:	e8 be f2 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     17da7e7:	cc                   	int3
     17da7e8:	53                   	push   rbx
     17da7e9:	48 89 fb             	mov    rbx,rdi
     17da7ec:	e8 11 00 00 00       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>
     17da7f1:	48 89 df             	mov    rdi,rbx
     17da7f4:	5b                   	pop    rbx
     17da7f5:	e9 82 4a e1 ff       	jmp    15ef27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x434800>
     17da7fa:	48 89 c7             	mov    rdi,rax
     17da7fd:	e8 a3 f2 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     17da802:	53                   	push   rbx
     17da803:	48 89 fb             	mov    rbx,rdi
     17da806:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
     17da80a:	48 85 ff             	test   rdi,rdi
     17da80d:	74 1d                	je     17da82c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x664d>
     17da80f:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     17da813:	48 85 c0             	test   rax,rax
     17da816:	74 06                	je     17da81e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x663f>
     17da818:	ff d0                	call   rax
     17da81a:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     17da81e:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
     17da823:	6a 08                	push   0x8
     17da825:	5e                   	pop    rsi
     17da826:	5b                   	pop    rbx
     17da827:	e9 04 50 01 00       	jmp    17ef830 <_ZdaPvSt11align_val_t@plt>
     17da82c:	5b                   	pop    rbx
     17da82d:	c3                   	ret
     17da82e:	41 56                	push   r14
     17da830:	53                   	push   rbx
     17da831:	50                   	push   rax
     17da832:	48 89 fb             	mov    rbx,rdi
     17da835:	48 39 f7             	cmp    rdi,rsi
     17da838:	74 6c                	je     17da8a6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x66c7>
     17da83a:	49 89 f6             	mov    r14,rsi
     17da83d:	48 89 df             	mov    rdi,rbx
     17da840:	e8 bd ff ff ff       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>
     17da845:	48 89 df             	mov    rdi,rbx
     17da848:	e8 69 d8 ff ff       	call   17d80b6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3ed7>
     17da84d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     17da850:	48 89 03             	mov    QWORD PTR [rbx],rax
     17da853:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     17da857:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     17da85b:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     17da85f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     17da863:	0f 57 c0             	xorps  xmm0,xmm0
     17da866:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     17da86a:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     17da86e:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
     17da873:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     17da877:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
     17da87b:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
     17da880:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     17da884:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
     17da888:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
     17da88d:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     17da891:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     17da895:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
     17da89a:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     17da89e:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
     17da8a2:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     17da8a6:	48 89 d8             	mov    rax,rbx
     17da8a9:	48 83 c4 08          	add    rsp,0x8
     17da8ad:	5b                   	pop    rbx
     17da8ae:	41 5e                	pop    r14
     17da8b0:	c3                   	ret
     17da8b1:	48 89 c7             	mov    rdi,rax
     17da8b4:	e8 ec f1 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     17da8b9:	cc                   	int3
     17da8ba:	53                   	push   rbx
     17da8bb:	48 83 ec 20          	sub    rsp,0x20
     17da8bf:	48 89 fb             	mov    rbx,rdi
     17da8c2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17da8c9:	00 00 

### target 0x17edf00
     17edf00:	ff 25 7a 44 0c 00    	jmp    QWORD PTR [rip+0xc447a]        # 18b2380 <_Znwm@@Base+0xe44ef0>
     17edf06:	68 0b 00 00 00       	push   0xb
     17edf0b:	e9 30 ff ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edf10:	ff 25 72 44 0c 00    	jmp    QWORD PTR [rip+0xc4472]        # 18b2388 <strlen@LIBC>
     17edf16:	68 0c 00 00 00       	push   0xc
     17edf1b:	e9 20 ff ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edf20:	ff 25 6a 44 0c 00    	jmp    QWORD PTR [rip+0xc446a]        # 18b2390 <_ZdlPv@@Base+0xe5cba0>
     17edf26:	68 0d 00 00 00       	push   0xd
     17edf2b:	e9 10 ff ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edf30:	ff 25 62 44 0c 00    	jmp    QWORD PTR [rip+0xc4462]        # 18b2398 <_ZNSt9exceptionD2Ev@@Base+0xeda5b8>
     17edf36:	68 0e 00 00 00       	push   0xe
     17edf3b:	e9 00 ff ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edf40:	ff 25 5a 44 0c 00    	jmp    QWORD PTR [rip+0xc445a]        # 18b23a0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@@Base+0xeac4e0>
     17edf46:	68 0f 00 00 00       	push   0xf
     17edf4b:	e9 f0 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edf50:	ff 25 52 44 0c 00    	jmp    QWORD PTR [rip+0xc4452]        # 18b23a8 <_ZNSt20bad_array_new_lengthC1Ev@@Base+0xe5c798>
     17edf56:	68 10 00 00 00       	push   0x10
     17edf5b:	e9 e0 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edf60:	ff 25 4a 44 0c 00    	jmp    QWORD PTR [rip+0xc444a]        # 18b23b0 <_ZNSt20bad_array_new_lengthD1Ev@@Base+0xeda5d0>
     17edf66:	68 11 00 00 00       	push   0x11
     17edf6b:	e9 d0 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edf70:	ff 25 42 44 0c 00    	jmp    QWORD PTR [rip+0xc4442]        # 18b23b8 <memcmp@LIBC>
     17edf76:	68 12 00 00 00       	push   0x12
     17edf7b:	e9 c0 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edf80:	ff 25 3a 44 0c 00    	jmp    QWORD PTR [rip+0xc443a]        # 18b23c0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@@Base+0xeaaec0>
     17edf86:	68 13 00 00 00       	push   0x13
     17edf8b:	e9 b0 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edf90:	ff 25 32 44 0c 00    	jmp    QWORD PTR [rip+0xc4432]        # 18b23c8 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE21__grow_by_and_replaceEmmmmmmPKc@@Base+0xeac798>
     17edf96:	68 14 00 00 00       	push   0x14
     17edf9b:	e9 a0 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edfa0:	ff 25 2a 44 0c 00    	jmp    QWORD PTR [rip+0xc442a]        # 18b23d0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9__grow_byEmmmmmm@@Base+0xeab620>
     17edfa6:	68 15 00 00 00       	push   0x15
     17edfab:	e9 90 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edfb0:	ff 25 22 44 0c 00    	jmp    QWORD PTR [rip+0xc4422]        # 18b23d8 <_ZNSt6__ndk115system_categoryEv@@Base+0xea5128>
     17edfb6:	68 16 00 00 00       	push   0x16
     17edfbb:	e9 80 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edfc0:	ff 25 1a 44 0c 00    	jmp    QWORD PTR [rip+0xc441a]        # 18b23e0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKc@@Base+0xeaad00>
     17edfc6:	68 17 00 00 00       	push   0x17
     17edfcb:	e9 70 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edfd0:	ff 25 12 44 0c 00    	jmp    QWORD PTR [rip+0xc4412]        # 18b23e8 <__cxa_thread_atexit@@Base+0xe436c8>
     17edfd6:	68 18 00 00 00       	push   0x18
     17edfdb:	e9 60 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edfe0:	ff 25 0a 44 0c 00    	jmp    QWORD PTR [rip+0xc440a]        # 18b23f0 <_ZNSt6__ndk112__next_primeEm@@Base+0xeade20>
     17edfe6:	68 19 00 00 00       	push   0x19
     17edfeb:	e9 50 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17edff0:	ff 25 02 44 0c 00    	jmp    QWORD PTR [rip+0xc4402]        # 18b23f8 <_ZNSt6__ndk119__shared_weak_count14__release_weakEv@@Base+0xeacf78>
     17edff6:	68 1a 00 00 00       	push   0x1a
     17edffb:	e9 40 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee000:	ff 25 fa 43 0c 00    	jmp    QWORD PTR [rip+0xc43fa]        # 18b2400 <_ZNSt6__ndk111__call_onceERVmPvPFvS2_E@@Base+0xeb0410>
     17ee006:	68 1b 00 00 00       	push   0x1b
     17ee00b:	e9 30 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee010:	ff 25 f2 43 0c 00    	jmp    QWORD PTR [rip+0xc43f2]        # 18b2408 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xeda628>
     17ee016:	68 1c 00 00 00       	push   0x1c
     17ee01b:	e9 20 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee020:	ff 25 ea 43 0c 00    	jmp    QWORD PTR [rip+0xc43ea]        # 18b2410 <_ZNSt6__ndk112__get_sp_mutEPKv@@Base+0xeacef0>
     17ee026:	68 1d 00 00 00       	push   0x1d
     17ee02b:	e9 10 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee030:	ff 25 e2 43 0c 00    	jmp    QWORD PTR [rip+0xc43e2]        # 18b2418 <_ZNSt6__ndk18__sp_mut4lockEv@@Base+0xeacf38>
     17ee036:	68 1e 00 00 00       	push   0x1e
     17ee03b:	e9 00 fe ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee040:	ff 25 da 43 0c 00    	jmp    QWORD PTR [rip+0xc43da]        # 18b2420 <_ZNSt6__ndk18__sp_mut6unlockEv@@Base+0xeacf20>
     17ee046:	68 1f 00 00 00       	push   0x1f
     17ee04b:	e9 f0 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee050:	ff 25 d2 43 0c 00    	jmp    QWORD PTR [rip+0xc43d2]        # 18b2428 <_ZNSt6__ndk15mutexD1Ev@@Base+0xea3548>
     17ee056:	68 20 00 00 00       	push   0x20
     17ee05b:	e9 e0 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee060:	ff 25 ca 43 0c 00    	jmp    QWORD PTR [rip+0xc43ca]        # 18b2430 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm@@Base+0xeabb10>
     17ee066:	68 21 00 00 00       	push   0x21
     17ee06b:	e9 d0 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee070:	ff 25 c2 43 0c 00    	jmp    QWORD PTR [rip+0xc43c2]        # 18b2438 <strerror@LIBC>
     17ee076:	68 22 00 00 00       	push   0x22
     17ee07b:	e9 c0 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee080:	ff 25 ba 43 0c 00    	jmp    QWORD PTR [rip+0xc43ba]        # 18b2440 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@@Base+0xeaadb0>
     17ee086:	68 23 00 00 00       	push   0x23
     17ee08b:	e9 b0 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee090:	ff 25 b2 43 0c 00    	jmp    QWORD PTR [rip+0xc43b2]        # 18b2448 <_ZNKSt6__ndk14__fs10filesystem4path16__root_directoryEv@@Base+0xeafbd8>
     17ee096:	68 24 00 00 00       	push   0x24
     17ee09b:	e9 a0 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee0a0:	ff 25 aa 43 0c 00    	jmp    QWORD PTR [rip+0xc43aa]        # 18b2450 <_ZNKSt6__ndk14__fs10filesystem4path10__filenameEv@@Base+0xeaf8a0>
     17ee0a6:	68 25 00 00 00       	push   0x25
     17ee0ab:	e9 90 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee0b0:	ff 25 a2 43 0c 00    	jmp    QWORD PTR [rip+0xc43a2]        # 18b2458 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc@@Base+0xeab5a8>
     17ee0b6:	68 26 00 00 00       	push   0x26
     17ee0bb:	e9 80 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee0c0:	ff 25 9a 43 0c 00    	jmp    QWORD PTR [rip+0xc439a]        # 18b2460 <_ZNSt6__ndk14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE@@Base+0xe5f720>
     17ee0c6:	68 27 00 00 00       	push   0x27
     17ee0cb:	e9 70 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee0d0:	ff 25 92 43 0c 00    	jmp    QWORD PTR [rip+0xc4392]        # 18b2468 <strncpy@LIBC>
     17ee0d6:	68 28 00 00 00       	push   0x28
     17ee0db:	e9 60 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee0e0:	ff 25 8a 43 0c 00    	jmp    QWORD PTR [rip+0xc438a]        # 18b2470 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6resizeEmc@@Base+0xeaab60>
     17ee0e6:	68 29 00 00 00       	push   0x29
     17ee0eb:	e9 50 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee0f0:	ff 25 82 43 0c 00    	jmp    QWORD PTR [rip+0xc4382]        # 18b2478 <_ZNSt6__ndk15mutex4lockEv@@Base+0xea3588>
     17ee0f6:	68 2a 00 00 00       	push   0x2a
     17ee0fb:	e9 40 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee100:	ff 25 7a 43 0c 00    	jmp    QWORD PTR [rip+0xc437a]        # 18b2480 <_ZNSt6__ndk15mutex6unlockEv@@Base+0xea3550>
     17ee106:	68 2b 00 00 00       	push   0x2b
     17ee10b:	e9 30 fd ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
     17ee110:	ff 25 72 43 0c 00    	jmp    QWORD PTR [rip+0xc4372]        # 18b2488 <_ZNSt6__ndk113random_deviceclEv@@Base+0xea2748>

