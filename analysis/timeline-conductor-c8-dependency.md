# TimelineConductor this+0xc8 dependency trace

Proven class:
- TimelineConductorSetupImpl provider ID 0xb8, factory 0x135c878
- factory allocates 0xf0-byte object and calls constructor 0x135d056
- constructor writes vptr 0x1867c98
- vtable +0x28 = 0xc2e960 = return [this+0xc8]
- Skip Ad later calls returned dependency virtual +0x68

Constructor alias creation:
- 0x135d182: lea rax,[rdi+0xc8]
- 0x135d189: mov [rsp+0x60],rax

## All references to constructor stack slot rsp+0x60
### 0x135d189: mov    QWORD PTR [rsp+0x60],rax
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

### 0x135fd4f: mov    rax,QWORD PTR [rsp+0x60]
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

### 0x135fdea: mov    rax,QWORD PTR [rsp+0x60]
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

### 0x135fe40: mov    r14,QWORD PTR [rsp+0x60]
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

### 0x135ff42: mov    rax,QWORD PTR [rsp+0x60]
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

### 0x135ffb5: mov    rax,QWORD PTR [rsp+0x60]
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

### 0x1360b6e: mov    rdi,QWORD PTR [rsp+0x60]
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

- refs: 7

## Forward slices from loads of &this+0xc8
### alias rax loaded @0x135fd4f
     135fd4f:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fd54:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135fd57:	4c 89 30             	mov    QWORD PTR [rax],r14
    STOP overwrite:  135fd5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### alias rax loaded @0x135fdea
     135fdea:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fdef:	48 8b 30             	mov    rsi,QWORD PTR [rax]
    STOP overwrite:  135fdf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### alias r14 loaded @0x135fe40
     135fe40:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
     135fe54:	49 8b 36             	mov    rsi,QWORD PTR [r14]
    STOP overwrite:  135fec0:	4d 8b 36             	mov    r14,QWORD PTR [r14]

### alias rax loaded @0x135ff42
     135ff42:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135ff47:	4c 8b 30             	mov    r14,QWORD PTR [rax]
    STOP overwrite:  135ff63:	49 8b 06             	mov    rax,QWORD PTR [r14]

### alias rax loaded @0x135ffb5
     135ffb5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135ffba:	48 8b 18             	mov    rbx,QWORD PTR [rax]
    STOP overwrite:  135ffc2:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### alias rdi loaded @0x1360b6e
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
    STOP overwrite:  1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]

## Calls immediately downstream of c8 alias loads
### alias=rax source=0x135fd4f, call @0x135fd62: call   QWORD PTR [rax+0x8]
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
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax

### alias=rax source=0x135fd4f, call @0x135fd6d: call   a79f6a <JNI_OnUnload@@Base+0x1837>
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
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
     135fdc2:	48 0f 44 c8          	cmove  rcx,rax
     135fdc6:	49 89 8c 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rcx
     135fdcd:	00 

### alias=rax source=0x135fd4f, call @0x135fd7a: call   13610fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6682>
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
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
     135fdc2:	48 0f 44 c8          	cmove  rcx,rax
     135fdc6:	49 89 8c 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rcx
     135fdcd:	00 
     135fdce:	48 8b 84 24 18 11 00 	mov    rax,QWORD PTR [rsp+0x1118]
     135fdd5:	00 
     135fdd6:	48 8b 18             	mov    rbx,QWORD PTR [rax]

### alias=rax source=0x135fd4f, call @0x135fd87: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
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
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
     135fdc2:	48 0f 44 c8          	cmove  rcx,rax
     135fdc6:	49 89 8c 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rcx
     135fdcd:	00 
     135fdce:	48 8b 84 24 18 11 00 	mov    rax,QWORD PTR [rsp+0x1118]
     135fdd5:	00 
     135fdd6:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fdd9:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
     135fddd:	4c 39 f3             	cmp    rbx,r14
     135fde0:	74 1c                	je     135fdfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5382>

### alias=rax source=0x135fd4f, call @0x135fd94: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
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
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
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

### alias=rax source=0x135fd4f, call @0x135fda1: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
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
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
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

### alias=rax source=0x135fd4f, call @0x135fdae: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd7a:	e8 7f 13 00 00       	call   13610fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6682>
     135fd7f:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135fd86:	00 
     135fd87:	e8 9c b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd8c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     135fd93:	00 
     135fd94:	e8 8f b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd99:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135fda0:	00 
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
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

### alias=rax source=0x135fdea, call @0x135fdf5: call   QWORD PTR [rax+0x10]
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
     135fe3a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135fe3d:	48 85 ff             	test   rdi,rdi
     135fe40:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
     135fe45:	74 0d                	je     135fe54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a53d8>
     135fe47:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### alias=rax source=0x135fdea, call @0x135fe01: call   17edf00 <_Znwm@plt>
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

### alias=rax source=0x135fdea, call @0x135fe4a: call   QWORD PTR [rax+0x8]
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
     135fe8e:	00 
     135fe8f:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     135fe96:	00 
     135fe97:	48 89 de             	mov    rsi,rbx
     135fe9a:	e8 7d 99 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>

### alias=r14 source=0x135fe40, call @0x135fe4a: call   QWORD PTR [rax+0x8]
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
     135fe8e:	00 
     135fe8f:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     135fe96:	00 
     135fe97:	48 89 de             	mov    rsi,rbx
     135fe9a:	e8 7d 99 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>

### alias=r14 source=0x135fe40, call @0x135fe80: call   QWORD PTR [r9+0xc0]
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
     135fe8e:	00 
     135fe8f:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     135fe96:	00 
     135fe97:	48 89 de             	mov    rsi,rbx
     135fe9a:	e8 7d 99 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135fe9f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135fea3:	e8 de e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fea8:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
     135feaf:	00 
     135feb0:	e8 0b e7 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135feb5:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135febc:	00 
     135febd:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fec0:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     135fec3:	4c 89 b3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r14
     135feca:	48 8d 35 a0 e4 07 ff 	lea    rsi,[rip+0xffffffffff07e4a0]        # 3de371 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3dc0>
     135fed1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fed8:	00 
     135fed9:	6a 01                	push   0x1
     135fedb:	5a                   	pop    rdx
     135fedc:	e8 4b 9b d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>

### alias=r14 source=0x135fe40, call @0x135fe9a: call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135fe71:	00 
     135fe72:	6a 0c                	push   0xc
     135fe74:	59                   	pop    rcx
     135fe75:	4c 8d 84 24 58 01 00 	lea    r8,[rsp+0x158]
     135fe7c:	00 
     135fe7d:	48 89 c2             	mov    rdx,rax
     135fe80:	41 ff 91 c0 00 00 00 	call   QWORD PTR [r9+0xc0]
     135fe87:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135fe8e:	00 
     135fe8f:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     135fe96:	00 
     135fe97:	48 89 de             	mov    rsi,rbx
     135fe9a:	e8 7d 99 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135fe9f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135fea3:	e8 de e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fea8:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
     135feaf:	00 
     135feb0:	e8 0b e7 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135feb5:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135febc:	00 
     135febd:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fec0:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     135fec3:	4c 89 b3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r14
     135feca:	48 8d 35 a0 e4 07 ff 	lea    rsi,[rip+0xffffffffff07e4a0]        # 3de371 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3dc0>
     135fed1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fed8:	00 
     135fed9:	6a 01                	push   0x1
     135fedb:	5a                   	pop    rdx
     135fedc:	e8 4b 9b d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     135fee1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135fee4:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135feeb:	00 
     135feec:	6a 07                	push   0x7
     135feee:	59                   	pop    rcx
     135feef:	4c 8d 84 24 d0 0a 00 	lea    r8,[rsp+0xad0]

### alias=r14 source=0x135fe40, call @0x135fea3: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fe74:	59                   	pop    rcx
     135fe75:	4c 8d 84 24 58 01 00 	lea    r8,[rsp+0x158]
     135fe7c:	00 
     135fe7d:	48 89 c2             	mov    rdx,rax
     135fe80:	41 ff 91 c0 00 00 00 	call   QWORD PTR [r9+0xc0]
     135fe87:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135fe8e:	00 
     135fe8f:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     135fe96:	00 
     135fe97:	48 89 de             	mov    rsi,rbx
     135fe9a:	e8 7d 99 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135fe9f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135fea3:	e8 de e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fea8:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
     135feaf:	00 
     135feb0:	e8 0b e7 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135feb5:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135febc:	00 
     135febd:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fec0:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     135fec3:	4c 89 b3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r14
     135feca:	48 8d 35 a0 e4 07 ff 	lea    rsi,[rip+0xffffffffff07e4a0]        # 3de371 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3dc0>
     135fed1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fed8:	00 
     135fed9:	6a 01                	push   0x1
     135fedb:	5a                   	pop    rdx
     135fedc:	e8 4b 9b d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     135fee1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135fee4:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135feeb:	00 
     135feec:	6a 07                	push   0x7
     135feee:	59                   	pop    rcx
     135feef:	4c 8d 84 24 d0 0a 00 	lea    r8,[rsp+0xad0]
     135fef6:	00 
     135fef7:	4c 89 f6             	mov    rsi,r14

### alias=r14 source=0x135fe40, call @0x135feb0: call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135fe7d:	48 89 c2             	mov    rdx,rax
     135fe80:	41 ff 91 c0 00 00 00 	call   QWORD PTR [r9+0xc0]
     135fe87:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135fe8e:	00 
     135fe8f:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     135fe96:	00 
     135fe97:	48 89 de             	mov    rsi,rbx
     135fe9a:	e8 7d 99 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135fe9f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135fea3:	e8 de e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fea8:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
     135feaf:	00 
     135feb0:	e8 0b e7 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135feb5:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135febc:	00 
     135febd:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fec0:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     135fec3:	4c 89 b3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r14
     135feca:	48 8d 35 a0 e4 07 ff 	lea    rsi,[rip+0xffffffffff07e4a0]        # 3de371 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3dc0>
     135fed1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fed8:	00 
     135fed9:	6a 01                	push   0x1
     135fedb:	5a                   	pop    rdx
     135fedc:	e8 4b 9b d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     135fee1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135fee4:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135feeb:	00 
     135feec:	6a 07                	push   0x7
     135feee:	59                   	pop    rcx
     135feef:	4c 8d 84 24 d0 0a 00 	lea    r8,[rsp+0xad0]
     135fef6:	00 
     135fef7:	4c 89 f6             	mov    rsi,r14
     135fefa:	48 89 da             	mov    rdx,rbx
     135fefd:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     135ff03:	48 81 c3 f8 00 00 00 	add    rbx,0xf8

### alias=rax source=0x135ff42, call @0x135ff5e: call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
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
     135ff94:	48 89 df             	mov    rdi,rbx
     135ff97:	4c 89 f6             	mov    rsi,r14
     135ff9a:	e8 7d 98 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135ff9f:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     135ffa3:	e8 de e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ffa8:	48 8b bc 24 d8 0a 00 	mov    rdi,QWORD PTR [rsp+0xad8]
     135ffaf:	00 
     135ffb0:	e8 0b e6 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135ffb5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]

### alias=rax source=0x135ff42, call @0x135ff7f: call   QWORD PTR [rax+0xc0]
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

### alias=rax source=0x135ff42, call @0x135ff9a: call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
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

### alias=rax source=0x135ff42, call @0x135ffa3: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ff71:	4c 8d 84 24 d0 0a 00 	lea    r8,[rsp+0xad0]
     135ff78:	00 
     135ff79:	4c 89 f6             	mov    rsi,r14
     135ff7c:	48 89 da             	mov    rdx,rbx
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

### alias=rax source=0x135ff42, call @0x135ffb0: call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135ff7c:	48 89 da             	mov    rdx,rbx
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
     1360005:	4c 89 f2             	mov    rdx,r14

### alias=rax source=0x135ff42, call @0x135ffc5: call   QWORD PTR [rax+0x30]
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
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### alias=rax source=0x135ffb5, call @0x135ffc5: call   QWORD PTR [rax+0x30]
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
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### alias=rax source=0x135ffb5, call @0x135fff2: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
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
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136001f:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360026:	00 
     1360027:	e8 bc a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136002c:	4d 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [r12+0xc8]
     1360033:	00 
     1360034:	4c 89 23             	mov    QWORD PTR [rbx],r12
     1360037:	48 8d 35 53 d0 73 ff 	lea    rsi,[rip+0xffffffffff73d053]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     136003e:	48 8d 0d d7 10 00 00 	lea    rcx,[rip+0x10d7]        # 136111c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66a0>
     1360045:	4c 8d bc 24 18 01 00 	lea    r15,[rsp+0x118]
     136004c:	00 
     136004d:	6a 08                	push   0x8
     136004f:	41 59                	pop    r9

### alias=rax source=0x135ffb5, call @0x1360008: call   QWORD PTR [rax+0xa8]
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
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136001f:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360026:	00 
     1360027:	e8 bc a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136002c:	4d 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [r12+0xc8]
     1360033:	00 
     1360034:	4c 89 23             	mov    QWORD PTR [rbx],r12
     1360037:	48 8d 35 53 d0 73 ff 	lea    rsi,[rip+0xffffffffff73d053]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     136003e:	48 8d 0d d7 10 00 00 	lea    rcx,[rip+0x10d7]        # 136111c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66a0>
     1360045:	4c 8d bc 24 18 01 00 	lea    r15,[rsp+0x118]
     136004c:	00 
     136004d:	6a 08                	push   0x8
     136004f:	41 59                	pop    r9
     1360051:	4c 89 ff             	mov    rdi,r15
     1360054:	31 d2                	xor    edx,edx
     1360056:	49 89 d8             	mov    r8,rbx
     1360059:	e8 36 a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     136005e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1360061:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]

### alias=rax source=0x135ffb5, call @0x136001a: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ffed:	4c 89 f7             	mov    rdi,r14
     135fff0:	31 d2                	xor    edx,edx
     135fff2:	e8 9d a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135fff7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135fffa:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     1360001:	00 
     1360002:	48 89 de             	mov    rsi,rbx
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136001f:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360026:	00 
     1360027:	e8 bc a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136002c:	4d 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [r12+0xc8]
     1360033:	00 
     1360034:	4c 89 23             	mov    QWORD PTR [rbx],r12
     1360037:	48 8d 35 53 d0 73 ff 	lea    rsi,[rip+0xffffffffff73d053]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     136003e:	48 8d 0d d7 10 00 00 	lea    rcx,[rip+0x10d7]        # 136111c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66a0>
     1360045:	4c 8d bc 24 18 01 00 	lea    r15,[rsp+0x118]
     136004c:	00 
     136004d:	6a 08                	push   0x8
     136004f:	41 59                	pop    r9
     1360051:	4c 89 ff             	mov    rdi,r15
     1360054:	31 d2                	xor    edx,edx
     1360056:	49 89 d8             	mov    r8,rbx
     1360059:	e8 36 a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     136005e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1360061:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360068:	00 
     1360069:	4c 89 f6             	mov    rsi,r14
     136006c:	4c 89 fa             	mov    rdx,r15
     136006f:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]

### alias=rax source=0x135ffb5, call @0x1360027: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     135fff7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135fffa:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     1360001:	00 
     1360002:	48 89 de             	mov    rsi,rbx
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136001f:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360026:	00 
     1360027:	e8 bc a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136002c:	4d 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [r12+0xc8]
     1360033:	00 
     1360034:	4c 89 23             	mov    QWORD PTR [rbx],r12
     1360037:	48 8d 35 53 d0 73 ff 	lea    rsi,[rip+0xffffffffff73d053]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     136003e:	48 8d 0d d7 10 00 00 	lea    rcx,[rip+0x10d7]        # 136111c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66a0>
     1360045:	4c 8d bc 24 18 01 00 	lea    r15,[rsp+0x118]
     136004c:	00 
     136004d:	6a 08                	push   0x8
     136004f:	41 59                	pop    r9
     1360051:	4c 89 ff             	mov    rdi,r15
     1360054:	31 d2                	xor    edx,edx
     1360056:	49 89 d8             	mov    r8,rbx
     1360059:	e8 36 a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     136005e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1360061:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360068:	00 
     1360069:	4c 89 f6             	mov    rsi,r14
     136006c:	4c 89 fa             	mov    rdx,r15
     136006f:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     1360075:	48 8b bc 24 d8 0a 00 	mov    rdi,QWORD PTR [rsp+0xad8]
     136007c:	00 
     136007d:	e8 04 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### alias=rdi source=0x1360b6e, call @0x1360b73: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
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

### alias=rdi source=0x1360b6e, call @0x1360b80: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
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

### alias=rdi source=0x1360b6e, call @0x1360b8d: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
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

### alias=rdi source=0x1360b6e, call @0x1360b9a: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
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

### alias=rdi source=0x1360b6e, call @0x1360ba7: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
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

### alias=rdi source=0x1360b6e, call @0x1360bb4: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
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

### alias=rdi source=0x1360b6e, call @0x1360bc0: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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
     1360c1b:	cc                   	int3
     1360c1c:	53                   	push   rbx

### alias=rdi source=0x1360b6e, call @0x1360bcd: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
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
     1360c1b:	cc                   	int3
     1360c1c:	53                   	push   rbx
     1360c1d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1360c20:	48 89 37             	mov    QWORD PTR [rdi],rsi
     1360c23:	48 85 db             	test   rbx,rbx

### alias=rdi source=0x1360b6e, call @0x1360bda: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
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
     1360c1b:	cc                   	int3
     1360c1c:	53                   	push   rbx
     1360c1d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1360c20:	48 89 37             	mov    QWORD PTR [rdi],rsi
     1360c23:	48 85 db             	test   rbx,rbx
     1360c26:	74 13                	je     1360c3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61bf>
     1360c28:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1360c2b:	48 89 df             	mov    rdi,rbx

### alias=rdi source=0x1360b6e, call @0x1360be7: call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
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
     1360c1b:	cc                   	int3
     1360c1c:	53                   	push   rbx
     1360c1d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1360c20:	48 89 37             	mov    QWORD PTR [rdi],rsi
     1360c23:	48 85 db             	test   rbx,rbx
     1360c26:	74 13                	je     1360c3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61bf>
     1360c28:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1360c2b:	48 89 df             	mov    rdi,rbx
     1360c2e:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1360c31:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1360c34:	48 89 df             	mov    rdi,rbx

### alias=rdi source=0x1360b6e, call @0x1360bf4: call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
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
     1360c1b:	cc                   	int3
     1360c1c:	53                   	push   rbx
     1360c1d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1360c20:	48 89 37             	mov    QWORD PTR [rdi],rsi
     1360c23:	48 85 db             	test   rbx,rbx
     1360c26:	74 13                	je     1360c3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61bf>
     1360c28:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1360c2b:	48 89 df             	mov    rdi,rbx
     1360c2e:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1360c31:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1360c34:	48 89 df             	mov    rdi,rbx
     1360c37:	5b                   	pop    rbx
     1360c38:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
     1360c3b:	5b                   	pop    rbx

## Writes through c8 aliases
### 0x135fd57: mov    QWORD PTR [rax],r14
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

## Direct +0xc8 qword writes anywhere in constructor
### 0x135d14d: mov    QWORD PTR [rsp+0xc8],rax
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

### 0x135f530: mov    QWORD PTR [r14+0xc8],rax
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

## High-address constants around c8 alias call sites
- 0x135fe06: lea    rcx,[rip+0x508c03]        # 1868a10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x250f8> -> 0x1868a10

## TimelineConductor getter methods
### 0xc2e960 FDE=(12773728, 12773736)
      c2e960:	48 8b 87 c8 00 00 00 	mov    rax,QWORD PTR [rdi+0xc8]
      c2e967:	c3                   	ret

### 0xc7ddb4 FDE=(13098420, 13098428)
      c7ddb4:	48 8b 87 d0 00 00 00 	mov    rax,QWORD PTR [rdi+0xd0]
      c7ddbb:	c3                   	ret

### 0x1364c6e FDE=(20335726, 20335770)
     1364c6e:	48 89 f8             	mov    rax,rdi
     1364c71:	48 8b 96 a0 00 00 00 	mov    rdx,QWORD PTR [rsi+0xa0]
     1364c78:	48 85 d2             	test   rdx,rdx
     1364c7b:	74 16                	je     1364c93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa217>
     1364c7d:	48 8b 4a 10          	mov    rcx,QWORD PTR [rdx+0x10]
     1364c81:	0f 10 42 08          	movups xmm0,XMMWORD PTR [rdx+0x8]
     1364c85:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1364c88:	48 85 c9             	test   rcx,rcx
     1364c8b:	74 0c                	je     1364c99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa21d>
     1364c8d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1364c92:	c3                   	ret
     1364c93:	0f 57 c0             	xorps  xmm0,xmm0
     1364c96:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1364c99:	c3                   	ret

