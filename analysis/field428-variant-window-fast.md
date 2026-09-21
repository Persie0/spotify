# Fast field428 variant-selection window

## 0xe9fb00..0xea0400

/tmp/f428win/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000e9fb00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f16>:
  e9fb00:	7e 30                	jle    e9fb32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f48>
  e9fb02:	4c 89 ff             	mov    rdi,r15
  e9fb05:	e8 84 87 c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e9fb0a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9fb0e:	f3 41 0f 7f 86 98 00 	movdqu XMMWORD PTR [r14+0x98],xmm0
  e9fb15:	00 00 
  e9fb17:	f3 41 0f 7f 86 88 00 	movdqu XMMWORD PTR [r14+0x88],xmm0
  e9fb1e:	00 00 
  e9fb20:	b8 00 00 80 3f       	mov    eax,0x3f800000
  e9fb25:	41 89 86 a8 00 00 00 	mov    DWORD PTR [r14+0xa8],eax
  e9fb2c:	41 c6 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],0x1
  e9fb33:	01 
  e9fb34:	4d 8d a6 b8 00 00 00 	lea    r12,[r14+0xb8]
  e9fb3b:	4d 89 a6 b8 00 00 00 	mov    QWORD PTR [r14+0xb8],r12
  e9fb42:	4d 89 a6 c0 00 00 00 	mov    QWORD PTR [r14+0xc0],r12
  e9fb49:	49 83 a6 e8 00 00 00 	and    QWORD PTR [r14+0xe8],0x0
  e9fb50:	00 
  e9fb51:	f3 41 0f 7f 86 c8 00 	movdqu XMMWORD PTR [r14+0xc8],xmm0
  e9fb58:	00 00 
  e9fb5a:	f3 41 0f 7f 86 d8 00 	movdqu XMMWORD PTR [r14+0xd8],xmm0
  e9fb61:	00 00 
  e9fb63:	41 89 86 f0 00 00 00 	mov    DWORD PTR [r14+0xf0],eax
  e9fb6a:	49 89 9e f8 00 00 00 	mov    QWORD PTR [r14+0xf8],rbx
  e9fb71:	49 89 9e 00 01 00 00 	mov    QWORD PTR [r14+0x100],rbx
  e9fb78:	49 83 a6 08 01 00 00 	and    QWORD PTR [r14+0x108],0x0
  e9fb7f:	00 
  e9fb80:	4d 8d ae 88 00 00 00 	lea    r13,[r14+0x88]
  e9fb87:	48 8d 05 e7 e0 5e 00 	lea    rax,[rip+0x5ee0e7]        # 148dc75 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d31f9>
  e9fb8e:	49 89 86 10 01 00 00 	mov    QWORD PTR [r14+0x110],rax
  e9fb95:	49 8d be 18 01 00 00 	lea    rdi,[r14+0x118]
  e9fb9c:	48 8d 35 83 a8 4c ff 	lea    rsi,[rip+0xffffffffff4ca883]        # 36a426 <_ZTSSt12bad_any_cast@@Base-0x25da2>
  e9fba3:	6a 0b                	push   0xb
  e9fba5:	5a                   	pop    rdx
  e9fba6:	e8 6f ce bf ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  e9fbab:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
  e9fbb2:	00 
  e9fbb3:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9fbb7:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
  e9fbbb:	f3 41 0f 7f 86 30 01 	movdqu XMMWORD PTR [r14+0x130],xmm0
  e9fbc2:	00 00 
  e9fbc4:	48 85 c0             	test   rax,rax
  e9fbc7:	74 05                	je     e9fbce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66fe4>
  e9fbc9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9fbce:	49 83 a6 40 01 00 00 	and    QWORD PTR [r14+0x140],0x0
  e9fbd5:	00 
  e9fbd6:	31 ff                	xor    edi,edi
  e9fbd8:	e8 3f e8 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9fbdd:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
  e9fbe4:	00 
  e9fbe5:	4c 8b 38             	mov    r15,QWORD PTR [rax]
  e9fbe8:	bf 48 01 00 00       	mov    edi,0x148
  e9fbed:	e8 0e e3 94 00       	call   17edf00 <_Znwm@plt>
  e9fbf2:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]
  e9fbf7:	48 89 c5             	mov    rbp,rax
  e9fbfa:	66 0f ef c0          	pxor   xmm0,xmm0
  e9fbfe:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9fc03:	48 8d 05 d6 1c 99 00 	lea    rax,[rip+0x991cd6]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
  e9fc0a:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
  e9fc0e:	66 c7 45 18 da 00    	mov    WORD PTR [rbp+0x18],0xda
  e9fc14:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e9fc19:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
  e9fc1d:	4c 89 7d 28          	mov    QWORD PTR [rbp+0x28],r15
  e9fc21:	4c 8d 7d 30          	lea    r15,[rbp+0x30]
  e9fc25:	4c 89 ff             	mov    rdi,r15
  e9fc28:	e8 61 86 c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e9fc2d:	66 0f ef c0          	pxor   xmm0,xmm0
  e9fc31:	f3 0f 7f 85 98 00 00 	movdqu XMMWORD PTR [rbp+0x98],xmm0
  e9fc38:	00 
  e9fc39:	f3 0f 7f 85 88 00 00 	movdqu XMMWORD PTR [rbp+0x88],xmm0
  e9fc40:	00 
  e9fc41:	b8 00 00 80 3f       	mov    eax,0x3f800000
  e9fc46:	89 85 a8 00 00 00    	mov    DWORD PTR [rbp+0xa8],eax
  e9fc4c:	c6 85 b0 00 00 00 01 	mov    BYTE PTR [rbp+0xb0],0x1
  e9fc53:	4c 8d a5 b8 00 00 00 	lea    r12,[rbp+0xb8]
  e9fc5a:	4c 89 a5 b8 00 00 00 	mov    QWORD PTR [rbp+0xb8],r12
  e9fc61:	4c 89 a5 c0 00 00 00 	mov    QWORD PTR [rbp+0xc0],r12
  e9fc68:	48 83 a5 e8 00 00 00 	and    QWORD PTR [rbp+0xe8],0x0
  e9fc6f:	00 
  e9fc70:	f3 0f 7f 85 c8 00 00 	movdqu XMMWORD PTR [rbp+0xc8],xmm0
  e9fc77:	00 
  e9fc78:	f3 0f 7f 85 d8 00 00 	movdqu XMMWORD PTR [rbp+0xd8],xmm0
  e9fc7f:	00 
  e9fc80:	89 85 f0 00 00 00    	mov    DWORD PTR [rbp+0xf0],eax
  e9fc86:	48 89 9d f8 00 00 00 	mov    QWORD PTR [rbp+0xf8],rbx
  e9fc8d:	48 89 9d 00 01 00 00 	mov    QWORD PTR [rbp+0x100],rbx
  e9fc94:	48 83 a5 08 01 00 00 	and    QWORD PTR [rbp+0x108],0x0
  e9fc9b:	00 
  e9fc9c:	48 8d 9d 88 00 00 00 	lea    rbx,[rbp+0x88]
  e9fca3:	48 8d 05 41 d9 5f 00 	lea    rax,[rip+0x5fd941]        # 149d5eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e2b6f>
  e9fcaa:	48 89 85 10 01 00 00 	mov    QWORD PTR [rbp+0x110],rax
  e9fcb1:	48 8d bd 18 01 00 00 	lea    rdi,[rbp+0x118]
  e9fcb8:	48 8d 35 0d 32 4c ff 	lea    rsi,[rip+0xffffffffff4c320d]        # 362ecc <_ZTSSt12bad_any_cast@@Base-0x2d2fc>
  e9fcbf:	6a 11                	push   0x11
  e9fcc1:	5a                   	pop    rdx
  e9fcc2:	e8 53 cd bf ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  e9fcc7:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
  e9fcce:	00 
  e9fccf:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9fcd3:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
  e9fcd7:	f3 0f 7f 85 30 01 00 	movdqu XMMWORD PTR [rbp+0x130],xmm0
  e9fcde:	00 
  e9fcdf:	48 85 c0             	test   rax,rax
  e9fce2:	74 05                	je     e9fce9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x670ff>
  e9fce4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9fce9:	48 83 a5 40 01 00 00 	and    QWORD PTR [rbp+0x140],0x0
  e9fcf0:	00 
  e9fcf1:	31 ff                	xor    edi,edi
  e9fcf3:	e8 24 e7 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9fcf8:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
  e9fcff:	00 
  e9fd00:	4c 8b 20             	mov    r12,QWORD PTR [rax]
  e9fd03:	48 8d 05 0e 1c 99 00 	lea    rax,[rip+0x991c0e]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  e9fd0a:	48 8d 8c 24 c0 02 00 	lea    rcx,[rsp+0x2c0]
  e9fd11:	00 
  e9fd12:	48 89 01             	mov    QWORD PTR [rcx],rax
  e9fd15:	48 8d 05 76 bf 5f 00 	lea    rax,[rip+0x5fbf76]        # 149bc92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e1216>
  e9fd1c:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  e9fd20:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  e9fd24:	48 8d 05 35 1c 99 00 	lea    rax,[rip+0x991c35]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  e9fd2b:	48 8d 8c 24 90 02 00 	lea    rcx,[rsp+0x290]
  e9fd32:	00 
  e9fd33:	48 89 01             	mov    QWORD PTR [rcx],rax
  e9fd36:	48 8d 05 48 6f 5e 00 	lea    rax,[rip+0x5e6f48]        # 1486c85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cc209>
  e9fd3d:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  e9fd41:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  e9fd45:	48 8d 35 1c 4a 53 ff 	lea    rsi,[rip+0xffffffffff534a1c]        # 3d4768 <_ZTSN5boost17bad_function_callE@@Base+0x1aae>
  e9fd4c:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
  e9fd53:	00 
  e9fd54:	e8 e7 e1 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e9fd59:	49 8d 4e 18          	lea    rcx,[r14+0x18]
  e9fd5d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e9fd62:	66 48 0f 6e c0       	movq   xmm0,rax
  e9fd67:	66 49 0f 6e cd       	movq   xmm1,r13
  e9fd6c:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9fd70:	66 49 0f 6e c6       	movq   xmm0,r14
  e9fd75:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
  e9fd7a:	66 48 0f 6e d1       	movq   xmm2,rcx
  e9fd7f:	66 0f 6c d0          	punpcklqdq xmm2,xmm0
  e9fd83:	48 8d 4d 18          	lea    rcx,[rbp+0x18]
  e9fd87:	48 89 c2             	mov    rdx,rax
  e9fd8a:	48 83 c2 08          	add    rdx,0x8
  e9fd8e:	4c 89 f6             	mov    rsi,r14
  e9fd91:	48 83 c6 08          	add    rsi,0x8
  e9fd95:	66 48 0f 6e c5       	movq   xmm0,rbp
  e9fd9a:	48 89 ef             	mov    rdi,rbp
  e9fd9d:	48 83 c7 08          	add    rdi,0x8
  e9fda1:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
  e9fda6:	66 48 0f 6e d9       	movq   xmm3,rcx
  e9fdab:	66 0f 6c d8          	punpcklqdq xmm3,xmm0
  e9fdaf:	48 8d 9c 24 b0 07 00 	lea    rbx,[rsp+0x7b0]
  e9fdb6:	00 
  e9fdb7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e9fdbc:	48 89 43 c0          	mov    QWORD PTR [rbx-0x40],rax
  e9fdc0:	4c 89 63 c8          	mov    QWORD PTR [rbx-0x38],r12
  e9fdc4:	66 0f 7f 8c 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm1
  e9fdcb:	00 00 
  e9fdcd:	66 0f 7f 4b d0       	movdqa XMMWORD PTR [rbx-0x30],xmm1
  e9fdd2:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
  e9fdd7:	f0 48 ff 02          	lock inc QWORD PTR [rdx]
  e9fddb:	66 0f 7f 94 24 90 00 	movdqa XMMWORD PTR [rsp+0x90],xmm2
  e9fde2:	00 00 
  e9fde4:	66 0f 7f 53 e0       	movdqa XMMWORD PTR [rbx-0x20],xmm2
  e9fde9:	48 89 b4 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rsi
  e9fdf0:	00 
  e9fdf1:	f0 48 ff 06          	lock inc QWORD PTR [rsi]
  e9fdf5:	66 0f 7f 9c 24 a0 00 	movdqa XMMWORD PTR [rsp+0xa0],xmm3
  e9fdfc:	00 00 
  e9fdfe:	66 0f 7f 5b f0       	movdqa XMMWORD PTR [rbx-0x10],xmm3
  e9fe03:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
  e9fe0a:	00 
  e9fe0b:	f0 48 ff 07          	lock inc QWORD PTR [rdi]
  e9fe0f:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
  e9fe16:	00 
  e9fe17:	48 89 df             	mov    rdi,rbx
  e9fe1a:	e8 71 a4 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9fe1f:	4d 89 e5             	mov    r13,r12
  e9fe22:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
  e9fe29:	00 
  e9fe2a:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
  e9fe31:	00 
  e9fe32:	e8 59 a4 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9fe37:	4c 8b a4 24 90 13 00 	mov    r12,QWORD PTR [rsp+0x1390]
  e9fe3e:	00 
  e9fe3f:	48 8b b4 24 88 13 00 	mov    rsi,QWORD PTR [rsp+0x1388]
  e9fe46:	00 
  e9fe47:	4c 8d bc 24 10 08 00 	lea    r15,[rsp+0x810]
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
  ea03d5:	48 8b 18             	mov    rbx,QWORD PTR [rax]
  ea03d8:	48 8d 35 f1 43 53 ff 	lea    rsi,[rip+0xffffffffff5343f1]        # 3d47d0 <_ZTSN5boost17bad_function_callE@@Base+0x1b16>
  ea03df:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
  ea03e6:	00 
  ea03e7:	e8 54 db 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  ea03ec:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]
  ea03f1:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  ea03f6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  ea03fd:	00 
  ea03fe:	48                   	rex.W
  ea03ff:	89                   	.byte 0x89

## Branches/tests only
  e9fb00:	7e 30                	jle    e9fb32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f48>
  e9fbc4:	48 85 c0             	test   rax,rax
  e9fbc7:	74 05                	je     e9fbce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66fe4>
  e9fcdf:	48 85 c0             	test   rax,rax
  e9fce2:	74 05                	je     e9fce9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x670ff>
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
  ea02b3:	48 85 c0             	test   rax,rax
  ea02b6:	74 05                	je     ea02bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676d3>
  ea02d8:	48 85 c0             	test   rax,rax
  ea02db:	74 05                	je     ea02e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676f8>
  ea0314:	48 85 c0             	test   rax,rax
  ea0317:	74 05                	je     ea031e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67734>

## High-address refs
  e9fc03:	48 8d 05 d6 1c 99 00 	lea    rax,[rip+0x991cd6]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
  e9fd03:	48 8d 05 0e 1c 99 00 	lea    rax,[rip+0x991c0e]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  e9fd24:	48 8d 05 35 1c 99 00 	lea    rax,[rip+0x991c35]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
  ea01e4:	48 8d 05 3d 45 99 00 	lea    rax,[rip+0x99453d]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>

## Key stack blocks
  e9e029:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9e0fd:	4c 8d ac 24 60 10 00 	lea    r13,[rsp+0x1060]
  e9e10d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9e192:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9e1a2:	48 89 8c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rcx
  e9e1aa:	88 9c 24 70 10 00 00 	mov    BYTE PTR [rsp+0x1070],bl
  e9e1b1:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
  e9e1df:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9e228:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9e265:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9e26d:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
  e9e28c:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9e2d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9e2fd:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9e305:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
  e9e324:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9e36d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9e395:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9e39d:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
  e9e3bc:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9e405:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9e4c0:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
  e9e50b:	48 89 84 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rax
  e9e5ba:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9e5ca:	48 8d ac 24 60 10 00 	lea    rbp,[rsp+0x1060]
  e9e625:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9e694:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
  e9e6a1:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
  e9e6a9:	48 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbp
  e9e6f1:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
  e9e701:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
  e9e758:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9e7e6:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9e84f:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9e88f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9e8b4:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9e8f5:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9e902:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9e97c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9e9eb:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9eac6:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9eb0c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9eb4d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9eb82:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9eb9f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9ebac:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
  e9ebb4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9ec2d:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
  e9ec35:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
  e9ec3d:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
  e9ec45:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9ec5d:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9ec7f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9ec8c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9ed3d:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9ed4b:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
  e9ed54:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
  e9ed5c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9ed74:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9ed9d:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9edaa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9edd7:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
  e9ede4:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
  e9edec:	4c 89 b4 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],r14
  e9edf4:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
  e9ee3c:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
  e9ee4c:	4c 8d a4 24 60 10 00 	lea    r12,[rsp+0x1060]
  e9ee9b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9eeb0:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
  e9eefd:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9ef05:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
  e9ef24:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9ef6d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9ef95:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9ef9d:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
  e9efa5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9efbd:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
  e9efe2:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9efef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f017:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9f01f:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
  e9f027:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f03f:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
  e9f064:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f071:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f099:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9f0a1:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
  e9f0a9:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f0c1:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
  e9f0e6:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f0f3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f15e:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9f166:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
  e9f17d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f192:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f1a6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9f1ae:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
  e9f1b7:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
  e9f1bf:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f1d7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9f201:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f20e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f21b:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
  e9f2a3:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
  e9f2b0:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
  e9f2b8:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
  e9f2f8:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
  e9f308:	4c 8d a4 24 60 10 00 	lea    r12,[rsp+0x1060]
  e9f357:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f3dd:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
  e9f423:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
  e9f42f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f44c:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
  e9f47e:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f48b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f4b3:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9f4bb:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
  e9f4c3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f4db:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9f4fd:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f50a:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f55b:	48 8d 9c 24 70 10 00 	lea    rbx,[rsp+0x1070]
  e9f59e:	66 0f 6f 84 24 60 10 	movdqa xmm0,XMMWORD PTR [rsp+0x1060]
  e9f5b1:	66 0f 7f 84 24 60 10 	movdqa XMMWORD PTR [rsp+0x1060],xmm0
  e9f5d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f5f7:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
  e9f61c:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f629:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f665:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9f66d:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
  e9f675:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f68d:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
  e9f6b5:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f6c2:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f6f8:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9f708:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
  e9f710:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
  e9f718:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f730:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9f752:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f75f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f79a:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f7b7:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f7c4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f873:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
  e9f8b5:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
  e9f8c1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f8d6:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9f8ff:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9f90c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9f93c:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9f944:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
  e9f963:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9f9ac:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9ff00:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
  e9ff10:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
  e9ff18:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
  e9ff2f:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
  e9ff3d:	48 8b 84 24 88 07 00 	mov    rax,QWORD PTR [rsp+0x788]
  e9ff45:	0f 28 84 24 80 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x780]
  e9ff5d:	48 8b 84 24 98 07 00 	mov    rax,QWORD PTR [rsp+0x798]
  e9ff65:	0f 28 84 24 90 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x790]
  ea005c:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
  ea01ef:	0f 28 84 24 60 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1060]
  ea01fd:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
  ea0205:	0f 28 84 24 70 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1070]
  ea021d:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
  ea0225:	0f 28 84 24 80 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1080]
  ea036c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  ea0381:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  ea03f6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
