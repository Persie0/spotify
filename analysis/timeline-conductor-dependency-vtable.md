# TimelineConductor dependency vtable

Proven chain:
- TimelineConductor service AP = 0x1867c98
- TimelineConductor +0x28 = 0xc2e960 = return [this+0xc8]
- constructor allocates 0xbd0-byte dependency at 0x135f2b8
- dependency pointer captured in r14 at 0x135f2bd
- primary dependency vptr 0x1868200 stored at 0x135f494
- dependency pointer installed into TimelineConductor+0xc8 at 0x135fd57

## Primary vtable 0x1868200
- +0x0: 0x136ee08 FDE=(20377096, 20377559)
- +0x8: 0x136efd8 FDE=(20377560, 20377578)
- +0x10: 0x136efea FDE=(20377578, 20379228)
- +0x18: 0x136f65c FDE=(20379228, 20381174)
- +0x20: 0x136fdf6 FDE=(20381174, 20381762)
- +0x28: 0x1370042 FDE=(20381762, 20382807)
- +0x30: 0x1370458 FDE=(20382808, 20383004)
- +0x38: 0x137051c FDE=(20383004, 20383763)
- +0x40: 0x1370814 FDE=(20383764, 20385890)
- +0x48: 0x1371062 FDE=(20385890, 20387130)
- +0x50: 0x137153a FDE=(20387130, 20388171)
- +0x58: 0x137194c FDE=(20388172, 20388736)
- +0x60: 0x1371b80 FDE=(20388736, 20389264)
- +0x68: 0x1371d90 FDE=(20389264, 20389947)
- +0x70: 0x137203c FDE=(20389948, 20390011)
- +0x78: 0x137207c FDE=(20390012, 20390065)
- +0x80: 0x13720b2 FDE=(20390066, 20391736)
- +0x88: 0x1372738 FDE=(20391736, 20394719)
- +0x90: 0x13732e0 FDE=(20394720, 20394828)
- +0x98: 0x137334c FDE=(20394828, 20395009)
- +0xa0: 0x1373402 FDE=(20395010, 20395118)
- +0xa8: 0x137346e FDE=(20395118, 20395226)
- +0xb0: 0x13734da FDE=(20395226, 20395489)
- +0xb8: 0x13735e2 FDE=(20395490, 20395723)
- +0xc0: 0x13736cc FDE=(20395724, 20396548)
- +0xc8: 0x1373a04 FDE=(20396548, 20397011)
- +0xd0: 0x1373bd4 FDE=(20397012, 20397146)
- +0xd8: 0x1373c5a FDE=(20397146, 20397386)
- +0xe0: 0x1373d4a FDE=(20397386, 20397827)
- +0xe8: 0x1373f04 FDE=(20397828, 20397849)
- +0xf0: 0x1373f1a FDE=(20397850, 20398218)
- +0xf8: 0x137408a FDE=(20398218, 20398626)
- +0x100: 0x1374222 FDE=(20398626, 20400104)
- +0x108: 0x13747e8 FDE=(20400104, 20400252)

## Exact +0x68 target: 0x1371d90
     1371d90:	55                   	push   rbp
     1371d91:	41 57                	push   r15
     1371d93:	41 56                	push   r14
     1371d95:	53                   	push   rbx
     1371d96:	48 81 ec a8 01 00 00 	sub    rsp,0x1a8
     1371d9d:	48 89 fb             	mov    rbx,rdi
     1371da0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1371da7:	00 00 
     1371da9:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     1371db0:	00 
     1371db1:	4c 8d 35 60 f7 ff fe 	lea    r14,[rip+0xfffffffffefff760]        # 371518 <_ZTSSt12bad_any_cast@@Base-0x1ecb0>
     1371db8:	6a 1a                	push   0x1a
     1371dba:	41 5f                	pop    r15
     1371dbc:	4c 89 f6             	mov    rsi,r14
     1371dbf:	4c 89 fa             	mov    rdx,r15
     1371dc2:	e8 05 a5 00 00       	call   137c2cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1850>
     1371dc7:	48 8d b3 b8 09 00 00 	lea    rsi,[rbx+0x9b8]
     1371dce:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1371dd3:	4c 89 f2             	mov    rdx,r14
     1371dd6:	4c 89 f9             	mov    rcx,r15
     1371dd9:	e8 b2 0f 01 00       	call   1382d90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c8314>
     1371dde:	48 8b b3 40 02 00 00 	mov    rsi,QWORD PTR [rbx+0x240]
     1371de5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1371de8:	4c 8d b4 24 88 00 00 	lea    r14,[rsp+0x88]
     1371def:	00 
     1371df0:	4c 89 f7             	mov    rdi,r14
     1371df3:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     1371df9:	4d 8b 7e 10          	mov    r15,QWORD PTR [r14+0x10]
     1371dfd:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1371e01:	e8 e0 1f 7c ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1371e06:	4d 85 ff             	test   r15,r15
     1371e09:	74 34                	je     1371e3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b73c3>
     1371e0b:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1371e10:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1371e15:	e8 fe 0f 01 00       	call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     1371e1a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1371e21:	00 00 
     1371e23:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
     1371e2a:	00 
     1371e2b:	0f 85 05 02 00 00    	jne    1372036 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b75ba>
     1371e31:	48 81 c4 a8 01 00 00 	add    rsp,0x1a8
     1371e38:	5b                   	pop    rbx
     1371e39:	41 5e                	pop    r14
     1371e3b:	41 5f                	pop    r15
     1371e3d:	5d                   	pop    rbp
     1371e3e:	c3                   	ret
     1371e3f:	48 89 df             	mov    rdi,rbx
     1371e42:	e8 fd 5a ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1371e47:	49 89 c6             	mov    r14,rax
     1371e4a:	48 85 c0             	test   rax,rax
     1371e4d:	74 bc                	je     1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371e4f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371e54:	4c 89 f6             	mov    rsi,r14
     1371e57:	e8 ce 1d 02 00       	call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
     1371e5c:	80 7c 24 48 00       	cmp    BYTE PTR [rsp+0x48],0x0
     1371e61:	74 5f                	je     1371ec2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7446>
     1371e63:	4c 89 f7             	mov    rdi,r14
     1371e66:	e8 73 15 02 00       	call   13933de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8962>
     1371e6b:	48 89 d1             	mov    rcx,rdx
     1371e6e:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
     1371e75:	48 99                	cqo
     1371e77:	48 f7 f9             	idiv   rcx
     1371e7a:	49 89 c6             	mov    r14,rax
     1371e7d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371e82:	e8 af 99 70 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1371e87:	4c 8d bc 24 88 00 00 	lea    r15,[rsp+0x88]
     1371e8e:	00 
     1371e8f:	4c 89 ff             	mov    rdi,r15
     1371e92:	48 89 c6             	mov    rsi,rax
     1371e95:	e8 8e 35 35 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1371e9a:	0f 57 c0             	xorps  xmm0,xmm0
     1371e9d:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     1371ea2:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     1371ea5:	48 8b bb 08 0b 00 00 	mov    rdi,QWORD PTR [rbx+0xb08]
     1371eac:	4c 89 fe             	mov    rsi,r15
     1371eaf:	4c 89 f2             	mov    rdx,r14
     1371eb2:	e8 93 fb 02 00       	call   13a1a4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6fce>
     1371eb7:	84 c0                	test   al,al
     1371eb9:	74 0f                	je     1371eca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b744e>
     1371ebb:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     1371ec0:	eb 31                	jmp    1371ef3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7477>
     1371ec2:	40 b5 01             	mov    bpl,0x1
     1371ec5:	45 31 f6             	xor    r14d,r14d
     1371ec8:	eb 40                	jmp    1371f0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b748e>
     1371eca:	0f 57 c0             	xorps  xmm0,xmm0
     1371ecd:	48 89 e1             	mov    rcx,rsp
     1371ed0:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     1371ed3:	48 8b bb 10 0b 00 00 	mov    rdi,QWORD PTR [rbx+0xb10]
     1371eda:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     1371ee1:	00 
     1371ee2:	4c 89 f2             	mov    rdx,r14
     1371ee5:	e8 42 1a 03 00       	call   13a392c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8eb0>
     1371eea:	84 c0                	test   al,al
     1371eec:	74 09                	je     1371ef7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b747b>
     1371eee:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     1371ef3:	31 ed                	xor    ebp,ebp
     1371ef5:	eb 06                	jmp    1371efd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7481>
     1371ef7:	40 b5 01             	mov    bpl,0x1
     1371efa:	45 31 f6             	xor    r14d,r14d
     1371efd:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371f04:	00 
     1371f05:	e8 24 34 35 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1371f0a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371f0f:	e8 1c 4e 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1371f14:	40 84 ed             	test   bpl,bpl
     1371f17:	0f 85 ee fe ff ff    	jne    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371f1d:	6a 01                	push   0x1
     1371f1f:	41 58                	pop    r8
     1371f21:	48 89 df             	mov    rdi,rbx
     1371f24:	4c 89 f6             	mov    rsi,r14
     1371f27:	31 d2                	xor    edx,edx
     1371f29:	31 c9                	xor    ecx,ecx
     1371f2b:	e8 38 ac 00 00       	call   137cb68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c20ec>
     1371f30:	4c 8b b3 d0 00 00 00 	mov    r14,QWORD PTR [rbx+0xd0]
     1371f37:	31 c0                	xor    eax,eax
     1371f39:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
     1371f3d:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     1371f41:	88 44 24 78          	mov    BYTE PTR [rsp+0x78],al
     1371f45:	66 83 a4 24 80 00 00 	and    WORD PTR [rsp+0x80],0x0
     1371f4c:	00 00 
     1371f4e:	0f 57 c0             	xorps  xmm0,xmm0
     1371f51:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1371f56:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1371f5b:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     1371f60:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
     1371f64:	48 89 df             	mov    rdi,rbx
     1371f67:	e8 d8 59 ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1371f6c:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371f73:	00 
     1371f74:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     1371f79:	48 89 c2             	mov    rdx,rax
     1371f7c:	e8 e1 06 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     1371f81:	48 81 c3 58 09 00 00 	add    rbx,0x958
     1371f88:	48 8d 15 e7 b9 fd fe 	lea    rdx,[rip+0xfffffffffefdb9e7]        # 34d976 <_ZTSSt12bad_any_cast@@Base-0x42852>
     1371f8f:	6a 1e                	push   0x1e
     1371f91:	59                   	pop    rcx
     1371f92:	4c 8d 84 24 88 00 00 	lea    r8,[rsp+0x88]
     1371f99:	00 
     1371f9a:	4c 89 f7             	mov    rdi,r14
     1371f9d:	48 89 de             	mov    rsi,rbx
     1371fa0:	e8 55 06 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     1371fa5:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fac:	00 
     1371fad:	e8 aa 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fb2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371fb7:	e8 10 c8 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1371fbc:	e9 4a fe ff ff       	jmp    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371fc1:	eb 14                	jmp    1371fd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b755b>
     1371fc3:	48 89 c3             	mov    rbx,rax
     1371fc6:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fcd:	00 
     1371fce:	e8 89 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fd3:	eb 26                	jmp    1371ffb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b757f>
     1371fd5:	eb 32                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1371fd7:	48 89 c3             	mov    rbx,rax
     1371fda:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fe1:	00 
     1371fe2:	e8 47 33 35 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1371fe7:	eb 03                	jmp    1371fec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7570>
     1371fe9:	48 89 c3             	mov    rbx,rax
     1371fec:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371ff1:	e8 3a 4d 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1371ff6:	eb 14                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>
     1371ff8:	48 89 c3             	mov    rbx,rax
     1371ffb:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1372000:	e8 c7 c7 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1372005:	eb 05                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>
     1372007:	eb 00                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1372009:	48 89 c3             	mov    rbx,rax
     137200c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1372011:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1372016:	e8 fd 0d 01 00       	call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     137201b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1372022:	00 00 
     1372024:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
     137202b:	00 
     137202c:	75 08                	jne    1372036 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b75ba>
     137202e:	48 89 df             	mov    rdi,rbx
     1372031:	e8 9a dc 6f ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1372036:	e8 75 da 47 00       	call   17efab0 <__stack_chk_fail@plt>

## Strings/high-address constants referenced by +0x68 body
- insn 0x1371db1 -> 0x371518: 1371db1:	4c 8d 35 60 f7 ff fe 	lea    r14,[rip+0xfffffffffefff760]        # 371518 <_ZTSSt12bad_any_cast@@Base-0x1ecb0>
- insn 0x1371f88 -> 0x34d976: 1371f88:	48 8d 15 e7 b9 fd fe 	lea    rdx,[rip+0xfffffffffefdb9e7]        # 34d976 <_ZTSSt12bad_any_cast@@Base-0x42852>

## Nearby secondary interface vptrs from construction
### AP 0x18683c8
- +0x0: 0x1377eb8 FDE=(20414136, 20414145)
- +0x8: 0x1377ec2 FDE=(20414146, 20414155)
- +0x10: 0x1377ecc FDE=(20414156, 20414165)
- +0x18: 0x1377ed6 FDE=(20414166, 20414175)
- +0x20: 0xfffffffffffffff0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0x1377ee0 FDE=(20414176, 20414185)
- +0x38: 0x1377eea FDE=(20414186, 20414195)
- +0x40: 0x1377ef4 FDE=(20414196, 20414217)
- +0x48: 0x1377f0a FDE=(20414218, 20414227)
- +0x50: 0x1377f14 FDE=(20414228, 20414237)
- +0x58: 0x1377f1e FDE=(20414238, 20414247)
- +0x60: 0x1377f28 FDE=(20414248, 20414257)
- +0x68: 0x1377f32 FDE=(20414258, 20414267)
- +0x70: 0x1377f3c FDE=(20414268, 20414277)
- +0x78: 0x1377f46 FDE=(20414278, 20414287)
- +0x80: 0x1377f50 FDE=(20414288, 20414297)
- +0x88: 0x1377f5a FDE=(20414298, 20414307)

### AP 0x18683f8
- +0x0: 0x1377ee0 FDE=(20414176, 20414185)
- +0x8: 0x1377eea FDE=(20414186, 20414195)
- +0x10: 0x1377ef4 FDE=(20414196, 20414217)
- +0x18: 0x1377f0a FDE=(20414218, 20414227)
- +0x20: 0x1377f14 FDE=(20414228, 20414237)
- +0x28: 0x1377f1e FDE=(20414238, 20414247)
- +0x30: 0x1377f28 FDE=(20414248, 20414257)
- +0x38: 0x1377f32 FDE=(20414258, 20414267)
- +0x40: 0x1377f3c FDE=(20414268, 20414277)
- +0x48: 0x1377f46 FDE=(20414278, 20414287)
- +0x50: 0x1377f50 FDE=(20414288, 20414297)
- +0x58: 0x1377f5a FDE=(20414298, 20414307)
- +0x60: 0x1377f64 FDE=(20414308, 20414320)
- +0x68: 0x1377f70 FDE=(20414320, 20414329)
- +0x70: 0x1377f7a FDE=(20414330, 20414339)
- +0x78: 0x1377f84 FDE=(20414340, 20414349)
- +0x80: 0x1377f8e FDE=(20414350, 20414359)
- +0x88: 0x1377f98 FDE=(20414360, 20414369)

### AP 0x18684c0
- +0x0: 0x1377fd4 FDE=(20414420, 20414429)
- +0x8: 0x1377fde FDE=(20414430, 20414439)
- +0x10: 0x1377fe8 FDE=(20414440, 20414448)
- +0x18: 0x1377ff0 FDE=(20414448, 20414506)
- +0x20: 0x137802a FDE=(20414506, 20414522)
- +0x28: 0x137803a FDE=(20414522, 20414541)
- +0x30: 0x137804e FDE=(20414542, 20414549)
- +0x38: 0x9d81d0 FDE=(10322384, 10322387)
- +0x40: 0x136bca0 FDE=(20364448, 20364452)
- +0x48: 0x9d81d0 FDE=(10322384, 10322387)
- +0x50: 0x9d81d0 FDE=(10322384, 10322387)
- +0x58: 0x1381a6c FDE=(20453996, 20454209)
- +0x60: 0x13817a4 FDE=(20453284, 20453295)
- +0x68: 0x13817b0 FDE=(20453296, 20453307)
- +0x70: 0x1381b42 FDE=(20454210, 20454663)
- +0x78: 0x1381d08 FDE=(20454664, 20455000)
- +0x80: 0x13817a4 FDE=(20453284, 20453295)
- +0x88: 0x13817b0 FDE=(20453296, 20453307)

