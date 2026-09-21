# Smart embedded podcast ad skip core trace

Known chain: skip-ad branch -> TimelineConductor dependency AP 0x1868200 +0x68 -> 0x1371d90.
0x1371d90 contains smartSkipEmbeddedPodcastAd and smart-skip-embedded-podcast-ad.

## dependency +0x68 / smartSkipEmbeddedPodcastAd: 0x1371d90 FDE=(20389264, 20389947)
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

### direct calls
- 0x1371dc2 -> 0x137c2cc: call   137c2cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1850>
- 0x1371dd9 -> 0x1382d90: call   1382d90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c8314>
- 0x1371e01 -> 0xb33de6: call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
- 0x1371e15 -> 0x1382e18: call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
- 0x1371e42 -> 0x1367944: call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
- 0x1371e57 -> 0x1393c2a: call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
- 0x1371e66 -> 0x13933de: call   13933de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8962>
- 0x1371e82 -> 0xa7b836: call   a7b836 <JNI_OnUnload@@Base+0x3103>
- 0x1371e95 -> 0x16c5428: call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
- 0x1371eb2 -> 0x13a1a4a: call   13a1a4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6fce>
- 0x1371ee5 -> 0x13a392c: call   13a392c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8eb0>
- 0x1371f05 -> 0x16c532e: call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
- 0x1371f0f -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x1371f2b -> 0x137cb68: call   137cb68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c20ec>
- 0x1371f67 -> 0x1367944: call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
- 0x1371f7c -> 0x1382662: call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
- 0x1371fa0 -> 0x13825fa: call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
- 0x1371fad -> 0x136795c: call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
- 0x1371fb7 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x1371fce -> 0x136795c: call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
- 0x1371fe2 -> 0x16c532e: call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
- 0x1371ff1 -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x1372000 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x1372016 -> 0x1382e18: call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
- 0x1372031 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x1372036 -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

### referenced printable literals
- 0x1371db1 -> 0x371518: 'smartSkipEmbeddedPodcastAd'
- 0x1371f88 -> 0x34d976: 'smart-skip-embedded-podcast-ad'

## central post-target action: 0x137cb68 FDE=(20433768, 20436289)
     137cb68:	55                   	push   rbp
     137cb69:	41 57                	push   r15
     137cb6b:	41 56                	push   r14
     137cb6d:	41 55                	push   r13
     137cb6f:	41 54                	push   r12
     137cb71:	53                   	push   rbx
     137cb72:	48 81 ec 08 05 00 00 	sub    rsp,0x508
     137cb79:	44 89 44 24 4c       	mov    DWORD PTR [rsp+0x4c],r8d
     137cb7e:	89 cd                	mov    ebp,ecx
     137cb80:	41 89 d7             	mov    r15d,edx
     137cb83:	49 89 f5             	mov    r13,rsi
     137cb86:	48 89 fb             	mov    rbx,rdi
     137cb89:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     137cb90:	00 00 
     137cb92:	48 89 84 24 00 05 00 	mov    QWORD PTR [rsp+0x500],rax
     137cb99:	00 
     137cb9a:	44 8b a7 b0 09 00 00 	mov    r12d,DWORD PTR [rdi+0x9b0]
     137cba1:	45 85 e4             	test   r12d,r12d
     137cba4:	74 07                	je     137cbad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2131>
     137cba6:	83 a3 b0 09 00 00 00 	and    DWORD PTR [rbx+0x9b0],0x0
     137cbad:	48 89 df             	mov    rdi,rbx
     137cbb0:	e8 8f ad fe ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     137cbb5:	48 85 c0             	test   rax,rax
     137cbb8:	0f 84 8a 00 00 00    	je     137cc48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c21cc>
     137cbbe:	49 89 c6             	mov    r14,rax
     137cbc1:	44 89 64 24 64       	mov    DWORD PTR [rsp+0x64],r12d
     137cbc6:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
     137cbcb:	48 89 c7             	mov    rdi,rax
     137cbce:	e8 0b 68 01 00       	call   13933de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8962>
     137cbd3:	48 89 d1             	mov    rcx,rdx
     137cbd6:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
     137cbdd:	48 99                	cqo
     137cbdf:	48 f7 f9             	idiv   rcx
     137cbe2:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     137cbe7:	49 8b 06             	mov    rax,QWORD PTR [r14]
     137cbea:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
     137cbf1:	00 
     137cbf2:	4c 89 e7             	mov    rdi,r12
     137cbf5:	4c 89 f6             	mov    rsi,r14
     137cbf8:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
     137cbfe:	4c 89 e7             	mov    rdi,r12
     137cc01:	e8 a8 07 ff ff       	call   136d3ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2932>
     137cc06:	89 d3                	mov    ebx,edx
     137cc08:	49 89 04 24          	mov    QWORD PTR [r12],rax
     137cc0c:	41 88 54 24 08       	mov    BYTE PTR [r12+0x8],dl
     137cc11:	45 85 ff             	test   r15d,r15d
     137cc14:	74 4c                	je     137cc62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c21e6>
     137cc16:	41 83 ff 02          	cmp    r15d,0x2
     137cc1a:	74 36                	je     137cc52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c21d6>
     137cc1c:	41 83 ff 01          	cmp    r15d,0x1
     137cc20:	0f 85 26 08 00 00    	jne    137d44c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c29d0>
     137cc26:	84 db                	test   bl,bl
     137cc28:	74 1e                	je     137cc48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c21cc>
     137cc2a:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     137cc2f:	89 6c 24 48          	mov    DWORD PTR [rsp+0x48],ebp
     137cc33:	4c 8d bc 24 40 02 00 	lea    r15,[rsp+0x240]
     137cc3a:	00 
     137cc3b:	4c 89 ff             	mov    rdi,r15
     137cc3e:	e8 2f 8f 7c ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
     137cc43:	4d 03 2f             	add    r13,QWORD PTR [r15]
     137cc46:	eb 23                	jmp    137cc6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c21ef>
     137cc48:	45 31 ff             	xor    r15d,r15d
     137cc4b:	31 db                	xor    ebx,ebx
     137cc4d:	e9 cb 07 00 00       	jmp    137d41d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c29a1>
     137cc52:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     137cc57:	89 6c 24 48          	mov    DWORD PTR [rsp+0x48],ebp
     137cc5b:	4c 03 6c 24 68       	add    r13,QWORD PTR [rsp+0x68]
     137cc60:	eb 09                	jmp    137cc6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c21ef>
     137cc62:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     137cc67:	89 6c 24 48          	mov    DWORD PTR [rsp+0x48],ebp
     137cc6b:	48 b8 02 00 00 00 01 	movabs rax,0x100000002
     137cc72:	00 00 00 
     137cc75:	48 8d 70 03          	lea    rsi,[rax+0x3]
     137cc79:	4c 8b 64 24 58       	mov    r12,QWORD PTR [rsp+0x58]
     137cc7e:	4c 89 e7             	mov    rdi,r12
     137cc81:	e8 bc 08 00 00       	call   137d542 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2ac6>
     137cc86:	48 8d 35 ef 52 0d ff 	lea    rsi,[rip+0xffffffffff0d52ef]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     137cc8d:	48 8d 0d 70 85 fa fe 	lea    rcx,[rip+0xfffffffffefa8570]        # 325204 <_ZTSSt12bad_any_cast@@Base-0x6afc4>
     137cc94:	45 31 ff             	xor    r15d,r15d
     137cc97:	6a 04                	push   0x4
     137cc99:	5f                   	pop    rdi
     137cc9a:	ba a9 09 00 00       	mov    edx,0x9a9
     137cc9f:	4d 89 e8             	mov    r8,r13
     137cca2:	31 c0                	xor    eax,eax
     137cca4:	e8 29 9c 45 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     137cca9:	49 8d b6 20 01 00 00 	lea    rsi,[r14+0x120]
     137ccb0:	48 8d ac 24 48 04 00 	lea    rbp,[rsp+0x448]
     137ccb7:	00 
     137ccb8:	48 89 ef             	mov    rdi,rbp
     137ccbb:	e8 12 ab 14 00       	call   14c77d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cd56>
     137ccc0:	49 8d b4 24 48 02 00 	lea    rsi,[r12+0x248]
     137ccc7:	00 
     137ccc8:	48 8d 05 99 06 06 ff 	lea    rax,[rip+0xffffffffff060699]        # 3dd368 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2db7>
     137cccf:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     137ccd4:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
     137ccd9:	0f b6 c3             	movzx  eax,bl
     137ccdc:	89 04 24             	mov    DWORD PTR [rsp],eax
     137ccdf:	48 8d 9c 24 e8 03 00 	lea    rbx,[rsp+0x3e8]
     137cce6:	00 
     137cce7:	6a 01                	push   0x1
     137cce9:	41 58                	pop    r8
     137cceb:	48 89 df             	mov    rdi,rbx
     137ccee:	48 89 ea             	mov    rdx,rbp
     137ccf1:	48 8b 4c 24 68       	mov    rcx,QWORD PTR [rsp+0x68]
     137ccf6:	4c 8b 4c 24 50       	mov    r9,QWORD PTR [rsp+0x50]
     137ccfb:	e8 2a 83 1d 00       	call   155502a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39a5ae>
     137cd00:	80 7b 58 00          	cmp    BYTE PTR [rbx+0x58],0x0
     137cd04:	74 24                	je     137cd2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c22ae>
     137cd06:	83 7c 24 64 00       	cmp    DWORD PTR [rsp+0x64],0x0
     137cd0b:	4c 8b 64 24 58       	mov    r12,QWORD PTR [rsp+0x58]
     137cd10:	0f 84 84 00 00 00    	je     137cd9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c231e>
     137cd16:	f6 84 24 e8 03 00 00 	test   BYTE PTR [rsp+0x3e8],0x1
     137cd1d:	01 
     137cd1e:	74 13                	je     137cd33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c22b7>
     137cd20:	4c 8b 84 24 f8 03 00 	mov    r8,QWORD PTR [rsp+0x3f8]
     137cd27:	00 
     137cd28:	eb 11                	jmp    137cd3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c22bf>
     137cd2a:	31 db                	xor    ebx,ebx
     137cd2c:	31 c0                	xor    eax,eax
     137cd2e:	e9 cd 06 00 00       	jmp    137d400 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2984>
     137cd33:	4c 8d 84 24 e9 03 00 	lea    r8,[rsp+0x3e9]
     137cd3a:	00 
     137cd3b:	48 8d 35 3a 52 0d ff 	lea    rsi,[rip+0xffffffffff0d523a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     137cd42:	48 8d 0d fe f2 fa fe 	lea    rcx,[rip+0xfffffffffefaf2fe]        # 32c047 <_ZTSSt12bad_any_cast@@Base-0x64181>
     137cd49:	6a 04                	push   0x4
     137cd4b:	5f                   	pop    rdi
     137cd4c:	ba dd 09 00 00       	mov    edx,0x9dd
     137cd51:	31 c0                	xor    eax,eax
     137cd53:	e8 7a 9b 45 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     137cd58:	0f b6 84 24 30 04 00 	movzx  eax,BYTE PTR [rsp+0x430]
     137cd5f:	00 
     137cd60:	83 f8 02             	cmp    eax,0x2
     137cd63:	0f 82 4c 03 00 00    	jb     137d0b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2639>
     137cd69:	0f 84 6c 03 00 00    	je     137d0db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c265f>
     137cd6f:	83 f8 03             	cmp    eax,0x3
     137cd72:	0f 85 7e 03 00 00    	jne    137d0f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c267a>
     137cd78:	48 b8 02 00 00 00 01 	movabs rax,0x100000002
     137cd7f:	00 00 00 
     137cd82:	48 89 84 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rax
     137cd89:	00 
     137cd8a:	c7 84 24 b0 02 00 00 	mov    DWORD PTR [rsp+0x2b0],0x4
     137cd91:	04 00 00 00 
     137cd95:	e9 4b 04 00 00       	jmp    137d1e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2769>
     137cd9a:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
     137cda1:	00 
     137cda2:	48 8d b4 24 48 04 00 	lea    rsi,[rsp+0x448]
     137cda9:	00 
     137cdaa:	e8 07 d7 d0 ff       	call   108a4b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2518cc>
     137cdaf:	84 c0                	test   al,al
     137cdb1:	0f 84 5f ff ff ff    	je     137cd16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c229a>
     137cdb7:	49 83 bc 24 80 06 00 	cmp    QWORD PTR [r12+0x680],0x0
     137cdbe:	00 00 
     137cdc0:	0f 85 50 ff ff ff    	jne    137cd16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c229a>
     137cdc6:	48 8d 35 af 51 0d ff 	lea    rsi,[rip+0xffffffffff0d51af]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     137cdcd:	48 8d 0d 3b 74 00 ff 	lea    rcx,[rip+0xffffffffff00743b]        # 38420f <_ZTSSt12bad_any_cast@@Base-0xbfb9>
     137cdd4:	6a 04                	push   0x4
     137cdd6:	5f                   	pop    rdi
     137cdd7:	ba ba 09 00 00       	mov    edx,0x9ba
     137cddc:	31 c0                	xor    eax,eax
     137cdde:	e8 ef 9a 45 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     137cde3:	48 8d b4 24 e8 03 00 	lea    rsi,[rsp+0x3e8]
     137cdea:	00 
     137cdeb:	48 8b 46 50          	mov    rax,QWORD PTR [rsi+0x50]
     137cdef:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     137cdf6:	00 
     137cdf7:	48 c7 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],0x3e8
     137cdfe:	00 e8 03 00 00 
     137ce03:	c6 84 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],0x1
     137ce0a:	01 
     137ce0b:	8a 46 48             	mov    al,BYTE PTR [rsi+0x48]
     137ce0e:	fe c8                	dec    al
     137ce10:	31 c9                	xor    ecx,ecx
     137ce12:	3c 02                	cmp    al,0x2
     137ce14:	0f 92 c1             	setb   cl
     137ce17:	4c 8d ac 24 48 02 00 	lea    r13,[rsp+0x248]
     137ce1e:	00 
     137ce1f:	41 89 4d f8          	mov    DWORD PTR [r13-0x8],ecx
     137ce23:	4c 89 ef             	mov    rdi,r13
     137ce26:	e8 25 f8 d0 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     137ce2b:	8b 44 24 4c          	mov    eax,DWORD PTR [rsp+0x4c]
     137ce2f:	88 84 24 90 02 00 00 	mov    BYTE PTR [rsp+0x290],al
     137ce36:	48 8b 84 24 38 04 00 	mov    rax,QWORD PTR [rsp+0x438]
     137ce3d:	00 
     137ce3e:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     137ce45:	00 
     137ce46:	c6 84 24 a0 02 00 00 	mov    BYTE PTR [rsp+0x2a0],0x1
     137ce4d:	01 
     137ce4e:	8b 84 24 40 02 00 00 	mov    eax,DWORD PTR [rsp+0x240]
     137ce55:	48 8d 94 24 f8 02 00 	lea    rdx,[rsp+0x2f8]
     137ce5c:	00 
     137ce5d:	89 42 08             	mov    DWORD PTR [rdx+0x8],eax
     137ce60:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     137ce64:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
     137ce68:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     137ce6d:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     137ce71:	0f 57 c0             	xorps  xmm0,xmm0
     137ce74:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     137ce79:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     137ce7e:	48 8b 84 24 70 02 00 	mov    rax,QWORD PTR [rsp+0x270]
     137ce85:	00 
     137ce86:	48 89 42 38          	mov    QWORD PTR [rdx+0x38],rax
     137ce8a:	0f 10 8c 24 60 02 00 	movups xmm1,XMMWORD PTR [rsp+0x260]
     137ce91:	00 
     137ce92:	0f 11 4a 28          	movups XMMWORD PTR [rdx+0x28],xmm1
     137ce96:	48 83 a4 24 70 02 00 	and    QWORD PTR [rsp+0x270],0x0
     137ce9d:	00 00 
     137ce9f:	0f 11 84 24 60 02 00 	movups XMMWORD PTR [rsp+0x260],xmm0
     137cea6:	00 
     137cea7:	0f 10 84 24 78 02 00 	movups xmm0,XMMWORD PTR [rsp+0x278]
     137ceae:	00 
     137ceaf:	0f 11 42 40          	movups XMMWORD PTR [rdx+0x40],xmm0
     137ceb3:	8a 84 24 88 02 00 00 	mov    al,BYTE PTR [rsp+0x288]
     137ceba:	88 42 50             	mov    BYTE PTR [rdx+0x50],al
     137cebd:	0f 10 84 24 90 02 00 	movups xmm0,XMMWORD PTR [rsp+0x290]
     137cec4:	00 
     137cec5:	0f 11 42 58          	movups XMMWORD PTR [rdx+0x58],xmm0
     137cec9:	8a 84 24 a0 02 00 00 	mov    al,BYTE PTR [rsp+0x2a0]
     137ced0:	88 42 68             	mov    BYTE PTR [rdx+0x68],al
     137ced3:	c7 42 70 01 00 00 00 	mov    DWORD PTR [rdx+0x70],0x1
     137ceda:	48 b8 02 00 00 00 01 	movabs rax,0x100000002
     137cee1:	00 00 00 
     137cee4:	48 89 82 80 00 00 00 	mov    QWORD PTR [rdx+0x80],rax
     137ceeb:	c7 82 e8 00 00 00 04 	mov    DWORD PTR [rdx+0xe8],0x4
     137cef2:	00 00 00 
     137cef5:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
     137cefc:	00 
     137cefd:	4c 89 f6             	mov    rsi,r14
     137cf00:	e8 14 f7 ff ff       	call   137c619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1b9d>
     137cf05:	4c 8d 8c 24 d8 02 00 	lea    r9,[rsp+0x2d8]
     137cf0c:	00 
     137cf0d:	49 83 21 00          	and    QWORD PTR [r9],0x0
     137cf11:	48 8d 05 c8 ae 65 ff 	lea    rax,[rip+0xffffffffff65aec8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     137cf18:	49 89 41 10          	mov    QWORD PTR [r9+0x10],rax
     137cf1c:	48 8d 05 bd ae 65 ff 	lea    rax,[rip+0xffffffffff65aebd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     137cf23:	49 89 41 18          	mov    QWORD PTR [r9+0x18],rax
     137cf27:	48 8d 84 24 b8 02 00 	lea    rax,[rsp+0x2b8]
     137cf2e:	00 
     137cf2f:	48 83 20 00          	and    QWORD PTR [rax],0x0
     137cf33:	48 8d 0d a6 ae 65 ff 	lea    rcx,[rip+0xffffffffff65aea6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     137cf3a:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     137cf3e:	48 8d 0d 9b ae 65 ff 	lea    rcx,[rip+0xffffffffff65ae9b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     137cf45:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     137cf49:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     137cf4d:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     137cf54:	00 
     137cf55:	48 8d 94 24 90 04 00 	lea    rdx,[rsp+0x490]
     137cf5c:	00 
     137cf5d:	4c 89 e7             	mov    rdi,r12
     137cf60:	31 c9                	xor    ecx,ecx
     137cf62:	45 31 c0             	xor    r8d,r8d
     137cf65:	e8 42 b4 fe ff       	call   13683ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad930>
     137cf6a:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
     137cf71:	00 
     137cf72:	e8 23 42 72 ff       	call   aa119a <JNI_OnUnload@@Base+0x28a67>
     137cf77:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
     137cf7e:	00 
     137cf7f:	e8 0c c6 fe ff       	call   1369590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aeb14>
     137cf84:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
     137cf8b:	00 
     137cf8c:	e8 d9 cf 6f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     137cf91:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
     137cf98:	00 
     137cf99:	e8 f2 f8 ff ff       	call   137c890 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1e14>
     137cf9e:	4c 89 ef             	mov    rdi,r13
     137cfa1:	e8 26 18 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     137cfa6:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
     137cfad:	00 
     137cfae:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
     137cfb5:	00 
     137cfb6:	48 89 84 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rax
     137cfbd:	00 
     137cfbe:	48 83 a4 24 50 02 00 	and    QWORD PTR [rsp+0x250],0x0
     137cfc5:	00 00 
     137cfc7:	49 8d 9c 24 68 06 00 	lea    rbx,[r12+0x668]
     137cfce:	00 
     137cfcf:	49 8b 8c 24 70 06 00 	mov    rcx,QWORD PTR [r12+0x670]
     137cfd6:	00 
     137cfd7:	48 39 d9             	cmp    rcx,rbx
     137cfda:	74 59                	je     137d035 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c25b9>
     137cfdc:	4c 8d bc 24 40 02 00 	lea    r15,[rsp+0x240]
     137cfe3:	00 
     137cfe4:	4c 39 71 10          	cmp    QWORD PTR [rcx+0x10],r14
     137cfe8:	74 3f                	je     137d029 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c25ad>
     137cfea:	4c 8b 61 08          	mov    r12,QWORD PTR [rcx+0x8]
     137cfee:	49 39 dc             	cmp    r12,rbx
     137cff1:	74 17                	je     137d00a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c258e>
     137cff3:	4d 39 74 24 10       	cmp    QWORD PTR [r12+0x10],r14
     137cff8:	40 0f 95 c5          	setne  bpl
     137cffc:	74 12                	je     137d010 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2594>
     137cffe:	4d 8b 64 24 08       	mov    r12,QWORD PTR [r12+0x8]
     137d003:	49 39 dc             	cmp    r12,rbx
     137d006:	75 eb                	jne    137cff3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2577>
     137d008:	eb 03                	jmp    137d00d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2591>
     137d00a:	40 b5 01             	mov    bpl,0x1
     137d00d:	49 89 dc             	mov    r12,rbx
     137d010:	4c 89 ff             	mov    rdi,r15
     137d013:	4c 89 fe             	mov    rsi,r15
     137d016:	48 89 da             	mov    rdx,rbx
     137d019:	4d 89 e0             	mov    r8,r12
     137d01c:	e8 31 ed ff ff       	call   137bd52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c12d6>
     137d021:	4c 89 e1             	mov    rcx,r12
     137d024:	40 84 ed             	test   bpl,bpl
     137d027:	75 04                	jne    137d02d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c25b1>
     137d029:	4c 8b 61 08          	mov    r12,QWORD PTR [rcx+0x8]
     137d02d:	4c 89 e1             	mov    rcx,r12
     137d030:	49 39 dc             	cmp    r12,rbx
     137d033:	75 af                	jne    137cfe4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2568>
     137d035:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     137d03c:	00 
     137d03d:	e8 b4 75 9a ff       	call   d245f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271596>
     137d042:	48 8b b4 24 38 04 00 	mov    rsi,QWORD PTR [rsp+0x438]
     137d049:	00 
     137d04a:	ba e8 03 00 00       	mov    edx,0x3e8
     137d04f:	4c 89 f7             	mov    rdi,r14
     137d052:	e8 05 b8 01 00       	call   139885c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ddde0>
     137d057:	4c 8b 74 24 58       	mov    r14,QWORD PTR [rsp+0x58]
     137d05c:	8b 5c 24 48          	mov    ebx,DWORD PTR [rsp+0x48]
     137d060:	4c 89 f7             	mov    rdi,r14
     137d063:	e8 6a e6 fe ff       	call   136b6d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b0c56>
     137d068:	84 db                	test   bl,bl
     137d06a:	74 08                	je     137d074 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c25f8>
     137d06c:	4c 89 f7             	mov    rdi,r14
     137d06f:	e8 44 e8 fe ff       	call   136b8b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b0e3c>
     137d074:	49 81 c6 b8 09 00 00 	add    r14,0x9b8
     137d07b:	48 8d 9c 24 40 02 00 	lea    rbx,[rsp+0x240]
     137d082:	00 
     137d083:	48 89 df             	mov    rdi,rbx
     137d086:	4c 89 f6             	mov    rsi,r14
     137d089:	e8 da 60 00 00       	call   1383168 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c86ec>
     137d08e:	48 83 7b 50 00       	cmp    QWORD PTR [rbx+0x50],0x0
     137d093:	74 0e                	je     137d0a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2627>
     137d095:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     137d09c:	00 
     137d09d:	6a 06                	push   0x6
     137d09f:	5e                   	pop    rsi
     137d0a0:	ff 57 18             	call   QWORD PTR [rdi+0x18]
     137d0a3:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     137d0aa:	00 
     137d0ab:	e8 cc 7e 00 00       	call   1384f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ca500>
     137d0b0:	e9 37 03 00 00       	jmp    137d3ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2970>
     137d0b5:	fe c8                	dec    al
     137d0b7:	31 c9                	xor    ecx,ecx
     137d0b9:	3c 02                	cmp    al,0x2
     137d0bb:	0f 92 c1             	setb   cl
     137d0be:	48 8d 9c 24 98 04 00 	lea    rbx,[rsp+0x498]
     137d0c5:	00 
     137d0c6:	89 4b f8             	mov    DWORD PTR [rbx-0x8],ecx
     137d0c9:	48 8d b4 24 e8 03 00 	lea    rsi,[rsp+0x3e8]
     137d0d0:	00 
     137d0d1:	48 89 df             	mov    rdi,rbx
     137d0d4:	e8 77 f5 d0 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     137d0d9:	eb 37                	jmp    137d112 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2696>
     137d0db:	c7 84 24 48 02 00 00 	mov    DWORD PTR [rsp+0x248],0x1
     137d0e2:	01 00 00 00 
     137d0e6:	c7 84 24 b0 02 00 00 	mov    DWORD PTR [rsp+0x2b0],0x2
     137d0ed:	02 00 00 00 
     137d0f1:	e9 ef 00 00 00       	jmp    137d1e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2769>
     137d0f6:	48 8d 9c 24 98 04 00 	lea    rbx,[rsp+0x498]
     137d0fd:	00 
     137d0fe:	83 63 f8 00          	and    DWORD PTR [rbx-0x8],0x0
     137d102:	48 8d b4 24 e8 03 00 	lea    rsi,[rsp+0x3e8]
     137d109:	00 
     137d10a:	48 89 df             	mov    rdi,rbx
     137d10d:	e8 3e f5 d0 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     137d112:	8b 44 24 4c          	mov    eax,DWORD PTR [rsp+0x4c]
     137d116:	88 84 24 e0 04 00 00 	mov    BYTE PTR [rsp+0x4e0],al
     137d11d:	48 8b 84 24 38 04 00 	mov    rax,QWORD PTR [rsp+0x438]
     137d124:	00 
     137d125:	48 89 84 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],rax
     137d12c:	00 
     137d12d:	c6 84 24 f0 04 00 00 	mov    BYTE PTR [rsp+0x4f0],0x1
     137d134:	01 
     137d135:	8b 84 24 90 04 00 00 	mov    eax,DWORD PTR [rsp+0x490]
     137d13c:	89 84 24 48 02 00 00 	mov    DWORD PTR [rsp+0x248],eax
     137d143:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     137d147:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
     137d14e:	00 
     137d14f:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     137d152:	0f 11 84 24 50 02 00 	movups XMMWORD PTR [rsp+0x250],xmm0
     137d159:	00 
     137d15a:	0f 57 c0             	xorps  xmm0,xmm0
     137d15d:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     137d160:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     137d165:	48 8b 84 24 c0 04 00 	mov    rax,QWORD PTR [rsp+0x4c0]
     137d16c:	00 
     137d16d:	48 89 84 24 78 02 00 	mov    QWORD PTR [rsp+0x278],rax
     137d174:	00 
     137d175:	0f 10 8c 24 b0 04 00 	movups xmm1,XMMWORD PTR [rsp+0x4b0]
     137d17c:	00 
     137d17d:	0f 11 8c 24 68 02 00 	movups XMMWORD PTR [rsp+0x268],xmm1
     137d184:	00 
     137d185:	0f 11 84 24 b0 04 00 	movups XMMWORD PTR [rsp+0x4b0],xmm0
     137d18c:	00 
     137d18d:	48 83 a4 24 c0 04 00 	and    QWORD PTR [rsp+0x4c0],0x0
     137d194:	00 00 
     137d196:	0f 10 84 24 c8 04 00 	movups xmm0,XMMWORD PTR [rsp+0x4c8]
     137d19d:	00 
     137d19e:	0f 11 84 24 80 02 00 	movups XMMWORD PTR [rsp+0x280],xmm0
     137d1a5:	00 
     137d1a6:	8a 84 24 d8 04 00 00 	mov    al,BYTE PTR [rsp+0x4d8]
     137d1ad:	88 84 24 90 02 00 00 	mov    BYTE PTR [rsp+0x290],al
     137d1b4:	0f 10 84 24 e0 04 00 	movups xmm0,XMMWORD PTR [rsp+0x4e0]
     137d1bb:	00 
     137d1bc:	0f 11 84 24 98 02 00 	movups XMMWORD PTR [rsp+0x298],xmm0
     137d1c3:	00 
     137d1c4:	8a 84 24 f0 04 00 00 	mov    al,BYTE PTR [rsp+0x4f0]
     137d1cb:	88 84 24 a8 02 00 00 	mov    BYTE PTR [rsp+0x2a8],al
     137d1d2:	c7 84 24 b0 02 00 00 	mov    DWORD PTR [rsp+0x2b0],0x1
     137d1d9:	01 00 00 00 
     137d1dd:	48 89 df             	mov    rdi,rbx
     137d1e0:	e8 e7 15 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     137d1e5:	40 8a ac 24 30 04 00 	mov    bpl,BYTE PTR [rsp+0x430]
     137d1ec:	00 
     137d1ed:	40 80 e5 fe          	and    bpl,0xfe
     137d1f1:	4c 8d bc 24 48 02 00 	lea    r15,[rsp+0x248]
     137d1f8:	00 
     137d1f9:	40 80 fd 02          	cmp    bpl,0x2
     137d1fd:	75 7d                	jne    137d27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2800>
     137d1ff:	4c 8d b4 24 e0 00 00 	lea    r14,[rsp+0xe0]
     137d206:	00 
     137d207:	4c 89 f7             	mov    rdi,r14
     137d20a:	4c 89 fe             	mov    rsi,r15
     137d20d:	e8 86 9c fd ff       	call   1356e98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c41c>
     137d212:	bf 80 00 00 00       	mov    edi,0x80
     137d217:	e8 e4 0c 47 00       	call   17edf00 <_Znwm@plt>
     137d21c:	48 89 c3             	mov    rbx,rax
     137d21f:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     137d226:	00 
     137d227:	48 8d 44 24 78       	lea    rax,[rsp+0x78]
     137d22c:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     137d233:	00 
     137d234:	48 c7 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],0x1
     137d23b:	00 01 00 00 00 
     137d240:	48 8d 05 11 b5 4e 00 	lea    rax,[rip+0x4eb511]        # 1868758 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24e40>
     137d247:	48 89 03             	mov    QWORD PTR [rbx],rax
     137d24a:	48 89 df             	mov    rdi,rbx
     137d24d:	48 83 c7 10          	add    rdi,0x10
     137d251:	4c 89 f6             	mov    rsi,r14
     137d254:	e8 3f 9c fd ff       	call   1356e98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c41c>
     137d259:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     137d260:	00 
     137d261:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     137d265:	48 89 9c 24 b0 04 00 	mov    QWORD PTR [rsp+0x4b0],rbx
     137d26c:	00 
     137d26d:	e8 58 d0 6f ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     137d272:	4c 89 f7             	mov    rdi,r14
     137d275:	e8 f2 93 fd ff       	call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
     137d27a:	eb 50                	jmp    137d2cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2850>
     137d27c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     137d283:	00 
     137d284:	4c 89 fe             	mov    rsi,r15
     137d287:	e8 0c 9c fd ff       	call   1356e98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c41c>
     137d28c:	48 8d 94 24 50 01 00 	lea    rdx,[rsp+0x150]
     137d293:	00 
     137d294:	48 b8 02 00 00 00 01 	movabs rax,0x100000002
     137d29b:	00 00 00 
     137d29e:	48 89 82 80 00 00 00 	mov    QWORD PTR [rdx+0x80],rax
     137d2a5:	c7 82 e8 00 00 00 04 	mov    DWORD PTR [rdx+0xe8],0x4
     137d2ac:	00 00 00 
     137d2af:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
     137d2b6:	00 
     137d2b7:	4c 89 f6             	mov    rsi,r14
     137d2ba:	e8 5a f3 ff ff       	call   137c619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1b9d>
     137d2bf:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     137d2c6:	00 
     137d2c7:	e8 c4 f5 ff ff       	call   137c890 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1e14>
     137d2cc:	48 8b 9c 24 38 04 00 	mov    rbx,QWORD PTR [rsp+0x438]
     137d2d3:	00 
     137d2d4:	48 89 9c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rbx
     137d2db:	00 
     137d2dc:	c6 84 24 88 00 00 00 	mov    BYTE PTR [rsp+0x88],0x1
     137d2e3:	01 
     137d2e4:	44 8a b4 24 31 04 00 	mov    r14b,BYTE PTR [rsp+0x431]
     137d2eb:	00 
     137d2ec:	8b bc 24 b0 02 00 00 	mov    edi,DWORD PTR [rsp+0x2b0]
     137d2f3:	e8 50 17 73 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     137d2f8:	48 8d 44 24 77       	lea    rax,[rsp+0x77]
     137d2fd:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     137d302:	48 89 07             	mov    QWORD PTR [rdi],rax
     137d305:	8b 84 24 b0 02 00 00 	mov    eax,DWORD PTR [rsp+0x2b0]
     137d30c:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     137d311:	48 39 c8             	cmp    rax,rcx
     137d314:	6a ff                	push   0xffffffffffffffff
     137d316:	59                   	pop    rcx
     137d317:	48 0f 45 c8          	cmovne rcx,rax
     137d31b:	48 8d 05 ee ba 4f 00 	lea    rax,[rip+0x4fbaee]        # 1878e10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x354f8>
     137d322:	4c 89 fe             	mov    rsi,r15
     137d325:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
     137d328:	45 31 c0             	xor    r8d,r8d
     137d32b:	40 80 fd 02          	cmp    bpl,0x2
     137d32f:	41 0f 94 c0          	sete   r8b
     137d333:	66 3d 01 01          	cmp    ax,0x101
     137d337:	b9 00 01 00 00       	mov    ecx,0x100
     137d33c:	0f 43 c8             	cmovae ecx,eax
     137d33f:	44 88 b4 24 a0 00 00 	mov    BYTE PTR [rsp+0xa0],r14b
     137d346:	00 
     137d347:	8b 44 24 48          	mov    eax,DWORD PTR [rsp+0x48]
     137d34b:	88 84 24 a1 00 00 00 	mov    BYTE PTR [rsp+0xa1],al
     137d352:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
     137d359:	00 
     137d35a:	c6 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],0x1
     137d361:	01 
     137d362:	88 8c 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],cl
     137d369:	31 c0                	xor    eax,eax
     137d36b:	88 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],al
     137d372:	88 84 24 c8 00 00 00 	mov    BYTE PTR [rsp+0xc8],al
     137d379:	c7 84 24 d0 00 00 00 	mov    DWORD PTR [rsp+0xd0],0x1
     137d380:	01 00 00 00 
     137d384:	0f 10 84 24 98 00 00 	movups xmm0,XMMWORD PTR [rsp+0x98]
     137d38b:	00 
     137d38c:	0f 10 8c 24 a8 00 00 	movups xmm1,XMMWORD PTR [rsp+0xa8]
     137d393:	00 
     137d394:	0f 10 94 24 b8 00 00 	movups xmm2,XMMWORD PTR [rsp+0xb8]
     137d39b:	00 
     137d39c:	0f 10 9c 24 c8 00 00 	movups xmm3,XMMWORD PTR [rsp+0xc8]
     137d3a3:	00 
     137d3a4:	0f 11 5c 24 30       	movups XMMWORD PTR [rsp+0x30],xmm3
     137d3a9:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
     137d3ae:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     137d3b3:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     137d3b7:	48 8d b4 24 e8 03 00 	lea    rsi,[rsp+0x3e8]
     137d3be:	00 
     137d3bf:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
     137d3c6:	00 
     137d3c7:	48 8d 8c 24 90 04 00 	lea    rcx,[rsp+0x490]
     137d3ce:	00 
     137d3cf:	4c 89 e7             	mov    rdi,r12
     137d3d2:	e8 4d f3 ff ff       	call   137c724 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1ca8>
     137d3d7:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
     137d3de:	00 
     137d3df:	e8 86 cb 6f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     137d3e4:	4c 89 ff             	mov    rdi,r15
     137d3e7:	e8 80 92 fd ff       	call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
     137d3ec:	48 8b 84 24 38 04 00 	mov    rax,QWORD PTR [rsp+0x438]
     137d3f3:	00 
     137d3f4:	0f b6 d8             	movzx  ebx,al
     137d3f7:	48 25 00 ff ff ff    	and    rax,0xffffffffffffff00
     137d3fd:	41 b7 01             	mov    r15b,0x1
     137d400:	48 09 c3             	or     rbx,rax
     137d403:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
     137d40a:	00 
     137d40b:	e8 fe 70 ea ff       	call   122450e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a92>
     137d410:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
     137d417:	00 
     137d418:	e8 af 13 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     137d41d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     137d424:	00 00 
     137d426:	48 3b 84 24 00 05 00 	cmp    rax,QWORD PTR [rsp+0x500]
     137d42d:	00 
     137d42e:	0f 85 08 01 00 00    	jne    137d53c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2ac0>
     137d434:	48 89 d8             	mov    rax,rbx
     137d437:	44 89 fa             	mov    edx,r15d
     137d43a:	48 81 c4 08 05 00 00 	add    rsp,0x508
     137d441:	5b                   	pop    rbx
     137d442:	41 5c                	pop    r12
     137d444:	41 5d                	pop    r13
     137d446:	41 5e                	pop    r14
     137d448:	41 5f                	pop    r15
     137d44a:	5d                   	pop    rbp
     137d44b:	c3                   	ret
     137d44c:	e8 6e cb 6f ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     137d451:	48 89 c3             	mov    rbx,rax
     137d454:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     137d45b:	00 
     137d45c:	e8 1b 7b 00 00       	call   1384f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ca500>
     137d461:	e9 a1 00 00 00       	jmp    137d507 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a8b>
     137d466:	48 89 c3             	mov    rbx,rax
     137d469:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
     137d470:	00 
     137d471:	e8 24 3d 72 ff       	call   aa119a <JNI_OnUnload@@Base+0x28a67>
     137d476:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
     137d47d:	00 
     137d47e:	e8 0d c1 fe ff       	call   1369590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aeb14>
     137d483:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
     137d48a:	00 
     137d48b:	e8 da ca 6f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     137d490:	eb 03                	jmp    137d495 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a19>
     137d492:	48 89 c3             	mov    rbx,rax
     137d495:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
     137d49c:	00 
     137d49d:	e8 ee f3 ff ff       	call   137c890 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1e14>
     137d4a2:	4c 89 ef             	mov    rdi,r13
     137d4a5:	e8 22 13 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     137d4aa:	eb 5b                	jmp    137d507 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a8b>
     137d4ac:	eb 3a                	jmp    137d4e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a6c>
     137d4ae:	48 89 c3             	mov    rbx,rax
     137d4b1:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     137d4b8:	00 
     137d4b9:	e8 0c ce 6f ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     137d4be:	eb 15                	jmp    137d4d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a59>
     137d4c0:	48 89 c3             	mov    rbx,rax
     137d4c3:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     137d4ca:	00 
     137d4cb:	e8 c0 f3 ff ff       	call   137c890 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1e14>
     137d4d0:	eb 2d                	jmp    137d4ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a83>
     137d4d2:	48 89 c3             	mov    rbx,rax
     137d4d5:	4c 89 f7             	mov    rdi,r14
     137d4d8:	e8 8f 91 fd ff       	call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
     137d4dd:	eb 20                	jmp    137d4ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a83>
     137d4df:	eb 00                	jmp    137d4e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a65>
     137d4e1:	48 89 c3             	mov    rbx,rax
     137d4e4:	eb 19                	jmp    137d4ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a83>
     137d4e6:	eb 00                	jmp    137d4e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a6c>
     137d4e8:	48 89 c3             	mov    rbx,rax
     137d4eb:	eb 1a                	jmp    137d507 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a8b>
     137d4ed:	eb 00                	jmp    137d4ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2a73>
     137d4ef:	48 89 c3             	mov    rbx,rax
     137d4f2:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
     137d4f9:	00 
     137d4fa:	e8 6b ca 6f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     137d4ff:	4c 89 ff             	mov    rdi,r15
     137d502:	e8 65 91 fd ff       	call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
     137d507:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
     137d50e:	00 
     137d50f:	e8 fa 6f ea ff       	call   122450e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a92>
     137d514:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
     137d51b:	00 
     137d51c:	e8 ab 12 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     137d521:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     137d528:	00 00 
     137d52a:	48 3b 84 24 00 05 00 	cmp    rax,QWORD PTR [rsp+0x500]
     137d531:	00 
     137d532:	75 08                	jne    137d53c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2ac0>
     137d534:	48 89 df             	mov    rdi,rbx
     137d537:	e8 94 27 6f ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     137d53c:	e8 6f 25 47 00       	call   17efab0 <__stack_chk_fail@plt>

### direct calls
- 0x137cbb0 -> 0x1367944: call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
- 0x137cbce -> 0x13933de: call   13933de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8962>
- 0x137cc01 -> 0x136d3ae: call   136d3ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2932>
- 0x137cc3e -> 0xb45b72: call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
- 0x137cc81 -> 0x137d542: call   137d542 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2ac6>
- 0x137cca4 -> 0x17d68d2: call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
- 0x137ccbb -> 0x14c77d2: call   14c77d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cd56>
- 0x137ccfb -> 0x155502a: call   155502a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39a5ae>
- 0x137cd53 -> 0x17d68d2: call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
- 0x137cdaa -> 0x108a4b6: call   108a4b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2518cc>
- 0x137cdde -> 0x17d68d2: call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
- 0x137ce26 -> 0x108c650: call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
- 0x137cf00 -> 0x137c619: call   137c619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1b9d>
- 0x137cf65 -> 0x13683ac: call   13683ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad930>
- 0x137cf72 -> 0xaa119a: call   aa119a <JNI_OnUnload@@Base+0x28a67>
- 0x137cf7f -> 0x1369590: call   1369590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aeb14>
- 0x137cf8c -> 0xa79f6a: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- 0x137cf99 -> 0x137c890: call   137c890 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1e14>
- 0x137cfa1 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x137d01c -> 0x137bd52: call   137bd52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c12d6>
- 0x137d03d -> 0xd245f6: call   d245f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271596>
- 0x137d052 -> 0x139885c: call   139885c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ddde0>
- 0x137d063 -> 0x136b6d2: call   136b6d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b0c56>
- 0x137d06f -> 0x136b8b8: call   136b8b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b0e3c>
- 0x137d089 -> 0x1383168: call   1383168 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c86ec>
- 0x137d0ab -> 0x1384f7c: call   1384f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ca500>
- 0x137d0d4 -> 0x108c650: call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
- 0x137d10d -> 0x108c650: call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
- 0x137d1e0 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x137d20d -> 0x1356e98: call   1356e98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c41c>
- 0x137d217 -> 0x17edf00: call   17edf00 <_Znwm@plt>
- 0x137d254 -> 0x1356e98: call   1356e98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c41c>
- 0x137d26d -> 0xa7a2ca: call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
- 0x137d275 -> 0x135666c: call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
- 0x137d287 -> 0x1356e98: call   1356e98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c41c>
- 0x137d2ba -> 0x137c619: call   137c619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1b9d>
- 0x137d2c7 -> 0x137c890: call   137c890 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1e14>
- 0x137d2f3 -> 0xaaea48: call   aaea48 <JNI_OnUnload@@Base+0x36315>
- 0x137d3d2 -> 0x137c724: call   137c724 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1ca8>
- 0x137d3df -> 0xa79f6a: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- 0x137d3e7 -> 0x135666c: call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
- 0x137d40b -> 0x122450e: call   122450e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a92>
- 0x137d418 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x137d44c -> 0xa79fbf: call   a79fbf <JNI_OnUnload@@Base+0x188c>
- 0x137d45c -> 0x1384f7c: call   1384f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ca500>
- 0x137d471 -> 0xaa119a: call   aa119a <JNI_OnUnload@@Base+0x28a67>
- 0x137d47e -> 0x1369590: call   1369590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aeb14>
- 0x137d48b -> 0xa79f6a: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- 0x137d49d -> 0x137c890: call   137c890 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1e14>
- 0x137d4a5 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x137d4b9 -> 0xa7a2ca: call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
- 0x137d4cb -> 0x137c890: call   137c890 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1e14>
- 0x137d4d8 -> 0x135666c: call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
- 0x137d4fa -> 0xa79f6a: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- 0x137d502 -> 0x135666c: call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
- 0x137d50f -> 0x122450e: call   122450e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a92>
- 0x137d51c -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x137d537 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x137d53c -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

### referenced printable literals
- 0x137cc8d -> 0x325204: 'Seeking to position: %lldms'
- 0x137cd42 -> 0x32c047: 'Seeking by playing clip %s with start offset'
- 0x137cdcd -> 0x38420f: 'Seeking within current clip'
- 0x137cf11 -> 0x9d7de0: "b'\\xc3\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\x83\\x7f\\x08'"

## state/segment lookup: 0x1367944 FDE=(20347204, 20347227)
     1367944:	53                   	push   rbx
     1367945:	48 89 fb             	mov    rbx,rdi
     1367948:	e8 3d 00 00 00       	call   136798a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acf0e>
     136794d:	48 85 c0             	test   rax,rax
     1367950:	75 07                	jne    1367959 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acedd>
     1367952:	48 8b 83 80 06 00 00 	mov    rax,QWORD PTR [rbx+0x680]
     1367959:	5b                   	pop    rbx
     136795a:	c3                   	ret

### direct calls
- 0x1367948 -> 0x136798a: call   136798a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acf0e>

### referenced printable literals

## optional/state decode: 0x1393c2a FDE=(20528170, 20528203)
     1393c2a:	80 be 90 01 00 00 00 	cmp    BYTE PTR [rsi+0x190],0x0
     1393c31:	74 0c                	je     1393c3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91c3>
     1393c33:	48 81 c6 78 01 00 00 	add    rsi,0x178
     1393c3a:	e9 27 8b 73 ff       	jmp    acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     1393c3f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1393c42:	48 8b 80 f0 00 00 00 	mov    rax,QWORD PTR [rax+0xf0]
     1393c49:	ff e0                	jmp    rax

### direct calls

### referenced printable literals

## time/rational extraction: 0x13933de FDE=(20526046, 20526124)
     13933de:	53                   	push   rbx
     13933df:	48 83 ec 20          	sub    rsp,0x20
     13933e3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13933ea:	00 00 
     13933ec:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     13933f1:	48 8d 9f a8 04 00 00 	lea    rbx,[rdi+0x4a8]
     13933f8:	e8 bf 00 00 00       	call   13934bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8a40>
     13933fd:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     1393402:	48 89 06             	mov    QWORD PTR [rsi],rax
     1393405:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     1393409:	48 89 df             	mov    rdi,rbx
     139340c:	e8 6d d4 ff ff       	call   139087e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5e02>
     1393411:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     1393418:	00 00 
     139341a:	48 3b 4c 24 18       	cmp    rcx,QWORD PTR [rsp+0x18]
     139341f:	75 06                	jne    1393427 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d89ab>
     1393421:	48 83 c4 20          	add    rsp,0x20
     1393425:	5b                   	pop    rbx
     1393426:	c3                   	ret
     1393427:	e8 84 c6 45 00       	call   17efab0 <__stack_chk_fail@plt>

### direct calls
- 0x13933f8 -> 0x13934bc: call   13934bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8a40>
- 0x139340c -> 0x139087e: call   139087e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5e02>
- 0x1393427 -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

### referenced printable literals

## target lookup A: 0x13a1a4a FDE=(20585034, 20585231)
     13a1a4a:	41 56                	push   r14
     13a1a4c:	53                   	push   rbx
     13a1a4d:	48 83 ec 38          	sub    rsp,0x38
     13a1a51:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a1a58:	00 00 
     13a1a5a:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     13a1a5f:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     13a1a63:	75 47                	jne    13a1aac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7030>
     13a1a65:	48 89 cb             	mov    rbx,rcx
     13a1a68:	49 89 d6             	mov    r14,rdx
     13a1a6b:	0f 57 c0             	xorps  xmm0,xmm0
     13a1a6e:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     13a1a73:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     13a1a76:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     13a1a7b:	48 8d 4c 24 0f       	lea    rcx,[rsp+0xf]
     13a1a80:	e8 9d fe ff ff       	call   13a1922 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6ea6>
     13a1a85:	84 c0                	test   al,al
     13a1a87:	74 27                	je     13a1ab0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7034>
     13a1a89:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13a1a8e:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     13a1a93:	48 39 c8             	cmp    rax,rcx
     13a1a96:	74 18                	je     13a1ab0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7034>
     13a1a98:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     13a1a9b:	4c 39 f2             	cmp    rdx,r14
     13a1a9e:	7f 06                	jg     13a1aa6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e702a>
     13a1aa0:	4c 39 70 08          	cmp    QWORD PTR [rax+0x8],r14
     13a1aa4:	7f 30                	jg     13a1ad6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e705a>
     13a1aa6:	48 83 c0 10          	add    rax,0x10
     13a1aaa:	eb e7                	jmp    13a1a93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7017>
     13a1aac:	31 db                	xor    ebx,ebx
     13a1aae:	eb 0c                	jmp    13a1abc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7040>
     13a1ab0:	31 db                	xor    ebx,ebx
     13a1ab2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a1ab7:	e8 6c 9c 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a1abc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a1ac3:	00 00 
     13a1ac5:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a1aca:	75 3e                	jne    13a1b0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e708e>
     13a1acc:	89 d8                	mov    eax,ebx
     13a1ace:	48 83 c4 38          	add    rsp,0x38
     13a1ad2:	5b                   	pop    rbx
     13a1ad3:	41 5e                	pop    r14
     13a1ad5:	c3                   	ret
     13a1ad6:	48 89 13             	mov    QWORD PTR [rbx],rdx
     13a1ad9:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13a1add:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     13a1ae1:	b3 01                	mov    bl,0x1
     13a1ae3:	eb cd                	jmp    13a1ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7036>
     13a1ae5:	48 89 c3             	mov    rbx,rax
     13a1ae8:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a1aed:	e8 36 9c 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a1af2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a1af9:	00 00 
     13a1afb:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a1b00:	75 08                	jne    13a1b0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e708e>
     13a1b02:	48 89 df             	mov    rdi,rbx
     13a1b05:	e8 c6 e1 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13a1b0a:	e8 a1 df 44 00       	call   17efab0 <__stack_chk_fail@plt>

### direct calls
- 0x13a1a80 -> 0x13a1922: call   13a1922 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6ea6>
- 0x13a1ab7 -> 0xa7b728: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
- 0x13a1aed -> 0xa7b728: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
- 0x13a1b05 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x13a1b0a -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

### referenced printable literals

## target lookup B: 0x13a392c FDE=(20592940, 20593137)
     13a392c:	41 56                	push   r14
     13a392e:	53                   	push   rbx
     13a392f:	48 83 ec 38          	sub    rsp,0x38
     13a3933:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a393a:	00 00 
     13a393c:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     13a3941:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     13a3945:	75 47                	jne    13a398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f12>
     13a3947:	48 89 cb             	mov    rbx,rcx
     13a394a:	49 89 d6             	mov    r14,rdx
     13a394d:	0f 57 c0             	xorps  xmm0,xmm0
     13a3950:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     13a3955:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     13a3958:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     13a395d:	48 8d 4c 24 0f       	lea    rcx,[rsp+0xf]
     13a3962:	e8 91 fe ff ff       	call   13a37f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8d7c>
     13a3967:	84 c0                	test   al,al
     13a3969:	74 27                	je     13a3992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f16>
     13a396b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13a3970:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     13a3975:	48 39 c8             	cmp    rax,rcx
     13a3978:	74 18                	je     13a3992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f16>
     13a397a:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     13a397d:	4c 39 f2             	cmp    rdx,r14
     13a3980:	7f 06                	jg     13a3988 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f0c>
     13a3982:	4c 39 70 08          	cmp    QWORD PTR [rax+0x8],r14
     13a3986:	7f 30                	jg     13a39b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f3c>
     13a3988:	48 83 c0 10          	add    rax,0x10
     13a398c:	eb e7                	jmp    13a3975 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8ef9>
     13a398e:	31 db                	xor    ebx,ebx
     13a3990:	eb 0c                	jmp    13a399e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f22>
     13a3992:	31 db                	xor    ebx,ebx
     13a3994:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a3999:	e8 8a 7d 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a399e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a39a5:	00 00 
     13a39a7:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a39ac:	75 3e                	jne    13a39ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f70>
     13a39ae:	89 d8                	mov    eax,ebx
     13a39b0:	48 83 c4 38          	add    rsp,0x38
     13a39b4:	5b                   	pop    rbx
     13a39b5:	41 5e                	pop    r14
     13a39b7:	c3                   	ret
     13a39b8:	48 89 13             	mov    QWORD PTR [rbx],rdx
     13a39bb:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13a39bf:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     13a39c3:	b3 01                	mov    bl,0x1
     13a39c5:	eb cd                	jmp    13a3994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f18>
     13a39c7:	48 89 c3             	mov    rbx,rax
     13a39ca:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a39cf:	e8 54 7d 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a39d4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a39db:	00 00 
     13a39dd:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a39e2:	75 08                	jne    13a39ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f70>
     13a39e4:	48 89 df             	mov    rdi,rbx
     13a39e7:	e8 e4 c2 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13a39ec:	e8 bf c0 44 00       	call   17efab0 <__stack_chk_fail@plt>

### direct calls
- 0x13a3962 -> 0x13a37f8: call   13a37f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8d7c>
- 0x13a3999 -> 0xa7b728: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
- 0x13a39cf -> 0xa7b728: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
- 0x13a39e7 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x13a39ec -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

### referenced printable literals

## post-action state builder: 0x1382662 FDE=(20457058, 20457656)
     1382662:	41 57                	push   r15
     1382664:	41 56                	push   r14
     1382666:	41 55                	push   r13
     1382668:	41 54                	push   r12
     138266a:	53                   	push   rbx
     138266b:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
     1382672:	49 89 d4             	mov    r12,rdx
     1382675:	48 89 fb             	mov    rbx,rdi
     1382678:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138267f:	00 00 
     1382681:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     1382688:	00 
     1382689:	e8 2a 02 00 00       	call   13828b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e3c>
     138268e:	31 c0                	xor    eax,eax
     1382690:	88 43 58             	mov    BYTE PTR [rbx+0x58],al
     1382693:	88 83 98 00 00 00    	mov    BYTE PTR [rbx+0x98],al
     1382699:	88 83 a0 00 00 00    	mov    BYTE PTR [rbx+0xa0],al
     138269f:	88 83 10 01 00 00    	mov    BYTE PTR [rbx+0x110],al
     13826a5:	4d 85 e4             	test   r12,r12
     13826a8:	0f 84 78 01 00 00    	je     1382826 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7daa>
     13826ae:	4c 8d 7b 58          	lea    r15,[rbx+0x58]
     13826b2:	4c 8d b3 a0 00 00 00 	lea    r14,[rbx+0xa0]
     13826b9:	49 8d b4 24 98 01 00 	lea    rsi,[r12+0x198]
     13826c0:	00 
     13826c1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13826c6:	e8 9b a0 74 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     13826cb:	48 8d 15 aa f8 0c ff 	lea    rdx,[rip+0xffffffffff0cf8aa]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     13826d2:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     13826d7:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     13826dc:	e8 0d 5d 7c ff       	call   b483ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9538e>
     13826e1:	49 8d b4 24 38 01 00 	lea    rsi,[r12+0x138]
     13826e8:	00 
     13826e9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     13826ee:	e8 4d b8 46 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13826f3:	41 0f 10 84 24 61 01 	movups xmm0,XMMWORD PTR [r12+0x161]
     13826fa:	00 00 
     13826fc:	4c 8d 6c 24 28       	lea    r13,[rsp+0x28]
     1382701:	41 0f 11 45 30       	movups XMMWORD PTR [r13+0x30],xmm0
     1382706:	4c 89 ff             	mov    rdi,r15
     1382709:	4c 89 ee             	mov    rsi,r13
     138270c:	e8 f9 01 00 00       	call   138290a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e8e>
     1382711:	4c 89 ef             	mov    rdi,r13
     1382714:	e8 b3 c0 71 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1382719:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     138271e:	e8 0d 46 72 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1382723:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1382728:	4c 89 e6             	mov    rsi,r12
     138272b:	e8 fa 14 01 00       	call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
     1382730:	48 8d 15 45 f8 0c ff 	lea    rdx,[rip+0xffffffffff0cf845]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1382737:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     138273c:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     1382741:	e8 a8 5c 7c ff       	call   b483ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9538e>
     1382746:	49 8d b4 24 20 01 00 	lea    rsi,[r12+0x120]
     138274d:	00 
     138274e:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
     1382753:	4c 89 ef             	mov    rdi,r13
     1382756:	e8 e5 b7 46 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     138275b:	41 8a 84 24 60 01 00 	mov    al,BYTE PTR [r12+0x160]
     1382762:	00 
     1382763:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
     1382767:	41 0f 10 84 24 50 01 	movups xmm0,XMMWORD PTR [r12+0x150]
     138276e:	00 00 
     1382770:	0f 11 44 24 58       	movups XMMWORD PTR [rsp+0x58],xmm0
     1382775:	41 0f 10 84 24 08 01 	movups xmm0,XMMWORD PTR [r12+0x108]
     138277c:	00 00 
     138277e:	0f 11 44 24 69       	movups XMMWORD PTR [rsp+0x69],xmm0
     1382783:	c6 44 24 79 01       	mov    BYTE PTR [rsp+0x79],0x1
     1382788:	4c 89 e7             	mov    rdi,r12
     138278b:	e8 82 13 01 00       	call   1393b12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d9096>
     1382790:	f3 0f 11 44 24 7c    	movss  DWORD PTR [rsp+0x7c],xmm0
     1382796:	49 69 84 24 d0 04 00 	imul   rax,QWORD PTR [r12+0x4d0],0x3e8
     138279d:	00 e8 03 00 00 
     13827a2:	48 99                	cqo
     13827a4:	49 f7 bc 24 d8 04 00 	idiv   QWORD PTR [r12+0x4d8]
     13827ab:	00 
     13827ac:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     13827b3:	00 
     13827b4:	41 80 bc 24 f0 04 00 	cmp    BYTE PTR [r12+0x4f0],0x0
     13827bb:	00 00 
     13827bd:	74 35                	je     13827f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7d78>
     13827bf:	49 8d bc 24 e0 04 00 	lea    rdi,[r12+0x4e0]
     13827c6:	00 
     13827c7:	e8 da 3d 7f ff       	call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
     13827cc:	49 69 84 24 e0 04 00 	imul   rax,QWORD PTR [r12+0x4e0],0x3e8
     13827d3:	00 e8 03 00 00 
     13827d8:	48 99                	cqo
     13827da:	49 f7 bc 24 e8 04 00 	idiv   QWORD PTR [r12+0x4e8]
     13827e1:	00 
     13827e2:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     13827e9:	00 
     13827ea:	c6 84 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],0x1
     13827f1:	01 
     13827f2:	eb 10                	jmp    1382804 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7d88>
     13827f4:	31 c0                	xor    eax,eax
     13827f6:	88 84 24 88 00 00 00 	mov    BYTE PTR [rsp+0x88],al
     13827fd:	88 84 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],al
     1382804:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
     1382809:	4c 89 f7             	mov    rdi,r14
     138280c:	48 89 de             	mov    rsi,rbx
     138280f:	e8 78 01 00 00       	call   138298c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7f10>
     1382814:	48 89 df             	mov    rdi,rbx
     1382817:	e8 b0 bf 71 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     138281c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1382821:	e8 0a 45 72 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1382826:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138282d:	00 00 
     138282f:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
     1382836:	00 
     1382837:	75 7a                	jne    13828b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e37>
     1382839:	48 81 c4 a0 00 00 00 	add    rsp,0xa0
     1382840:	5b                   	pop    rbx
     1382841:	41 5c                	pop    r12
     1382843:	41 5d                	pop    r13
     1382845:	41 5e                	pop    r14
     1382847:	41 5f                	pop    r15
     1382849:	c3                   	ret
     138284a:	eb 00                	jmp    138284c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7dd0>
     138284c:	49 89 c4             	mov    r12,rax
     138284f:	4c 89 ef             	mov    rdi,r13
     1382852:	e8 39 b6 46 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1382857:	eb 09                	jmp    1382862 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7de6>
     1382859:	eb 04                	jmp    138285f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7de3>
     138285b:	eb 11                	jmp    138286e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7df2>
     138285d:	eb 1e                	jmp    138287d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e01>
     138285f:	49 89 c4             	mov    r12,rax
     1382862:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1382867:	e8 24 b6 46 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     138286c:	eb 03                	jmp    1382871 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7df5>
     138286e:	49 89 c4             	mov    r12,rax
     1382871:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1382876:	e8 b5 44 72 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     138287b:	eb 03                	jmp    1382880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e04>
     138287d:	49 89 c4             	mov    r12,rax
     1382880:	4c 89 f7             	mov    rdi,r14
     1382883:	e8 f6 50 fe ff       	call   136797e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acf02>
     1382888:	4c 89 ff             	mov    rdi,r15
     138288b:	e8 dc 7e e7 ff       	call   11fa76c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fcf0>
     1382890:	48 89 df             	mov    rdi,rbx
     1382893:	e8 34 bf 71 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1382898:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138289f:	00 00 
     13828a1:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
     13828a8:	00 
     13828a9:	75 08                	jne    13828b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e37>
     13828ab:	4c 89 e7             	mov    rdi,r12
     13828ae:	e8 1d d4 6e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13828b3:	e8 f8 d1 46 00       	call   17efab0 <__stack_chk_fail@plt>

### direct calls
- 0x1382689 -> 0x13828b8: call   13828b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e3c>
- 0x13826c6 -> 0xacc766: call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
- 0x13826dc -> 0xb483ee: call   b483ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9538e>
- 0x13826ee -> 0x17edf40: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
- 0x138270c -> 0x138290a: call   138290a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e8e>
- 0x1382714 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x138271e -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x138272b -> 0x1393c2a: call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
- 0x1382741 -> 0xb483ee: call   b483ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9538e>
- 0x1382756 -> 0x17edf40: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
- 0x138278b -> 0x1393b12: call   1393b12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d9096>
- 0x13827c7 -> 0xb765a6: call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
- 0x138280f -> 0x138298c: call   138298c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7f10>
- 0x1382817 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x1382821 -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x1382852 -> 0x17ede90: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0x1382867 -> 0x17ede90: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0x1382876 -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x1382883 -> 0x136797e: call   136797e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acf02>
- 0x138288b -> 0x11fa76c: call   11fa76c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fcf0>
- 0x1382893 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x13828ae -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x13828b3 -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

### referenced printable literals

## smart-skip event/action sink: 0x13825fa FDE=(20456954, 20457057)
     13825fa:	80 7e 50 00          	cmp    BYTE PTR [rsi+0x50],0x0
     13825fe:	74 60                	je     1382660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be4>
     1382600:	55                   	push   rbp
     1382601:	41 57                	push   r15
     1382603:	41 56                	push   r14
     1382605:	41 55                	push   r13
     1382607:	41 54                	push   r12
     1382609:	53                   	push   rbx
     138260a:	50                   	push   rax
     138260b:	4d 89 c6             	mov    r14,r8
     138260e:	49 89 d7             	mov    r15,rdx
     1382611:	49 89 f5             	mov    r13,rsi
     1382614:	49 89 fc             	mov    r12,rdi
     1382617:	48 89 f7             	mov    rdi,rsi
     138261a:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
     138261e:	e8 13 92 6f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1382623:	48 89 c5             	mov    rbp,rax
     1382626:	48 89 d3             	mov    rbx,rdx
     1382629:	49 83 c5 18          	add    r13,0x18
     138262d:	4c 89 ef             	mov    rdi,r13
     1382630:	e8 01 92 6f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1382635:	49 89 d0             	mov    r8,rdx
     1382638:	4c 89 e7             	mov    rdi,r12
     138263b:	48 89 ee             	mov    rsi,rbp
     138263e:	48 89 da             	mov    rdx,rbx
     1382641:	48 89 c1             	mov    rcx,rax
     1382644:	4d 89 f9             	mov    r9,r15
     1382647:	41 56                	push   r14
     1382649:	ff 74 24 08          	push   QWORD PTR [rsp+0x8]
     138264d:	e8 c1 fa ff ff       	call   1382113 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7697>
     1382652:	48 83 c4 18          	add    rsp,0x18
     1382656:	5b                   	pop    rbx
     1382657:	41 5c                	pop    r12
     1382659:	41 5d                	pop    r13
     138265b:	41 5e                	pop    r14
     138265d:	41 5f                	pop    r15
     138265f:	5d                   	pop    rbp
     1382660:	c3                   	ret

### direct calls
- 0x138261e -> 0xa7b836: call   a7b836 <JNI_OnUnload@@Base+0x3103>
- 0x1382630 -> 0xa7b836: call   a7b836 <JNI_OnUnload@@Base+0x3103>
- 0x138264d -> 0x1382113: call   1382113 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7697>

### referenced printable literals

## 0x137cb68 callsite argument window
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
