# service184 exact tagged-result source

Ground truth install chain:
- 0x133303c copies rsp+0x10 pair into tagged variant rsp+0x290
- tag rsp+0x2a8 = 1
- 0x13330b2 takes first qword as service pointer
- 0x1333835 installs it into registry table[184]
- 0x1333863 immediately calls service virtual +0x20

The pair at rsp+0x10 is copied directly from rsp+0x3a0 immediately after 0x1334fce;
rsp+0x3a0 was populated by 0x1334dea. This report traces that exact path.

## producer 0x1334dea; FDE=(20139498, 20139981)
     1334dea:	55                   	push   rbp
     1334deb:	41 57                	push   r15
     1334ded:	41 56                	push   r14
     1334def:	41 55                	push   r13
     1334df1:	41 54                	push   r12
     1334df3:	53                   	push   rbx
     1334df4:	48 81 ec 18 02 00 00 	sub    rsp,0x218
     1334dfb:	49 89 cc             	mov    r12,rcx
     1334dfe:	49 89 d7             	mov    r15,rdx
     1334e01:	49 89 f5             	mov    r13,rsi
     1334e04:	49 89 fe             	mov    r14,rdi
     1334e07:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1334e0e:	00 00 
     1334e10:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     1334e17:	00 
     1334e18:	48 81 c6 80 00 00 00 	add    rsi,0x80
     1334e1f:	48 89 e5             	mov    rbp,rsp
     1334e22:	48 89 ef             	mov    rdi,rbp
     1334e25:	e8 be 30 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
     1334e2a:	49 8b 1c 24          	mov    rbx,QWORD PTR [r12]
     1334e2e:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     1334e33:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
     1334e38:	4d 89 6c 24 f8       	mov    QWORD PTR [r12-0x8],r13
     1334e3d:	4c 89 e7             	mov    rdi,r12
     1334e40:	48 89 ee             	mov    rsi,rbp
     1334e43:	e8 64 43 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     1334e48:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1334e4d:	4c 89 fe             	mov    rsi,r15
     1334e50:	e8 37 09 00 00       	call   133578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad10>
     1334e55:	49 89 1e             	mov    QWORD PTR [r14],rbx
     1334e58:	bf c8 00 00 00       	mov    edi,0xc8
     1334e5d:	e8 9e 90 4b 00       	call   17edf00 <_Znwm@plt>
     1334e62:	49 89 c7             	mov    r15,rax
     1334e65:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     1334e6c:	00 
     1334e6d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     1334e72:	e8 9b 09 00 00       	call   1335812 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad96>
     1334e77:	0f 57 c0             	xorps  xmm0,xmm0
     1334e7a:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     1334e7f:	48 8d 05 4a 0e 53 00 	lea    rax,[rip+0x530e4a]        # 1865cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x223b8>
     1334e86:	49 89 07             	mov    QWORD PTR [r15],rax
     1334e89:	4c 8d a4 24 68 01 00 	lea    r12,[rsp+0x168]
     1334e90:	00 
     1334e91:	49 89 5c 24 f8       	mov    QWORD PTR [r12-0x8],rbx
     1334e96:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
     1334e9d:	00 
     1334e9e:	4c 89 e7             	mov    rdi,r12
     1334ea1:	e8 6c 09 00 00       	call   1335812 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad96>
     1334ea6:	48 8b 84 24 60 01 00 	mov    rax,QWORD PTR [rsp+0x160]
     1334ead:	00 
     1334eae:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1334eb2:	4c 89 ff             	mov    rdi,r15
     1334eb5:	48 83 c7 20          	add    rdi,0x20
     1334eb9:	4c 89 e6             	mov    rsi,r12
     1334ebc:	e8 51 09 00 00       	call   1335812 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad96>
     1334ec1:	4c 89 e7             	mov    rdi,r12
     1334ec4:	e8 97 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     1334ec9:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
     1334ecd:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     1334ed4:	00 
     1334ed5:	e8 86 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     1334eda:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1334edf:	e8 7c 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     1334ee4:	48 89 e7             	mov    rdi,rsp
     1334ee7:	e8 3a bc 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1334eec:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1334ef3:	00 00 
     1334ef5:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     1334efc:	00 
     1334efd:	0f 85 bd 00 00 00    	jne    1334fc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a544>
     1334f03:	48 81 c4 18 02 00 00 	add    rsp,0x218
     1334f0a:	5b                   	pop    rbx
     1334f0b:	41 5c                	pop    r12
     1334f0d:	41 5d                	pop    r13
     1334f0f:	41 5e                	pop    r14
     1334f11:	41 5f                	pop    r15
     1334f13:	5d                   	pop    rbp
     1334f14:	c3                   	ret
     1334f15:	49 89 c6             	mov    r14,rax
     1334f18:	4c 89 e7             	mov    rdi,r12
     1334f1b:	e8 40 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     1334f20:	eb 03                	jmp    1334f25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a4a9>
     1334f22:	49 89 c6             	mov    r14,rax
     1334f25:	4c 89 ff             	mov    rdi,r15
     1334f28:	e8 e3 90 4b 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     1334f2d:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     1334f34:	00 
     1334f35:	e8 26 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     1334f3a:	eb 03                	jmp    1334f3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a4c3>
     1334f3c:	49 89 c6             	mov    r14,rax
     1334f3f:	4c 89 ff             	mov    rdi,r15
     1334f42:	e8 d9 8f 4b 00       	call   17edf20 <_ZdlPv@plt>
     1334f47:	eb 03                	jmp    1334f4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a4d0>
     1334f49:	49 89 c6             	mov    r14,rax
     1334f4c:	4c 89 f7             	mov    rdi,r14
     1334f4f:	e8 1c 8f 4b 00       	call   17ede70 <__cxa_begin_catch@plt>
     1334f54:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1334f59:	48 89 de             	mov    rsi,rbx
     1334f5c:	e8 19 09 00 00       	call   133587a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17adfe>
     1334f61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1334f68:	00 00 
     1334f6a:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     1334f71:	00 
     1334f72:	75 4c                	jne    1334fc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a544>
     1334f74:	e8 27 98 4b 00       	call   17ee7a0 <__cxa_rethrow@plt>
     1334f79:	48 89 c3             	mov    rbx,rax
     1334f7c:	4c 89 e7             	mov    rdi,r12
     1334f7f:	e8 a2 bb 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1334f84:	eb 17                	jmp    1334f9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a521>
     1334f86:	48 89 c3             	mov    rbx,rax
     1334f89:	eb 12                	jmp    1334f9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a521>
     1334f8b:	48 89 c3             	mov    rbx,rax
     1334f8e:	e8 fd 95 4b 00       	call   17ee590 <__cxa_end_catch@plt>
     1334f93:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1334f98:	e8 c3 08 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     1334f9d:	48 89 e7             	mov    rdi,rsp
     1334fa0:	e8 81 bb 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1334fa5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1334fac:	00 00 
     1334fae:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     1334fb5:	00 
     1334fb6:	75 08                	jne    1334fc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a544>
     1334fb8:	48 89 df             	mov    rdi,rbx
     1334fbb:	e8 10 ad 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1334fc0:	e8 eb aa 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     1334fc5:	48 89 c7             	mov    rdi,rax
     1334fc8:	e8 d8 4a 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## post-producer helper 0x1334fce; FDE=(20139982, 20141171)
     1334fce:	55                   	push   rbp
     1334fcf:	41 57                	push   r15
     1334fd1:	41 56                	push   r14
     1334fd3:	41 55                	push   r13
     1334fd5:	41 54                	push   r12
     1334fd7:	53                   	push   rbx
     1334fd8:	48 83 ec 38          	sub    rsp,0x38
     1334fdc:	49 89 f4             	mov    r12,rsi
     1334fdf:	48 89 fb             	mov    rbx,rdi
     1334fe2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1334fe9:	00 00 
     1334feb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1334ff0:	48 89 f7             	mov    rdi,rsi
     1334ff3:	e8 ec 15 01 00       	call   13465e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18bb68>
     1334ff8:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]
     1334ffc:	48 85 ed             	test   rbp,rbp
     1334fff:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1335004:	74 17                	je     133501d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5a1>
     1335006:	48 89 c1             	mov    rcx,rax
     1335009:	f3 4c 0f b8 f5       	popcnt r14,rbp
     133500e:	49 83 fe 01          	cmp    r14,0x1
     1335012:	77 0b                	ja     133501f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5a3>
     1335014:	4c 8d 7d ff          	lea    r15,[rbp-0x1]
     1335018:	49 21 cf             	and    r15,rcx
     133501b:	eb 15                	jmp    1335032 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5b6>
     133501d:	eb 7b                	jmp    133509a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a61e>
     133501f:	49 89 cf             	mov    r15,rcx
     1335022:	48 39 e9             	cmp    rcx,rbp
     1335025:	72 0b                	jb     1335032 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5b6>
     1335027:	48 89 c8             	mov    rax,rcx
     133502a:	31 d2                	xor    edx,edx
     133502c:	48 f7 f5             	div    rbp
     133502f:	49 89 d7             	mov    r15,rdx
     1335032:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1335035:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     1335039:	48 85 c0             	test   rax,rax
     133503c:	74 5c                	je     133509a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a61e>
     133503e:	4c 8b 28             	mov    r13,QWORD PTR [rax]
     1335041:	4d 85 ed             	test   r13,r13
     1335044:	74 54                	je     133509a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a61e>
     1335046:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     133504a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     133504f:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     1335053:	48 39 c8             	cmp    rax,rcx
     1335056:	75 1a                	jne    1335072 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5f6>
     1335058:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     133505c:	4c 89 e6             	mov    rsi,r12
     133505f:	e8 c4 06 00 00       	call   1335728 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17acac>
     1335064:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1335069:	84 c0                	test   al,al
     133506b:	74 24                	je     1335091 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a615>
     133506d:	e9 97 03 00 00       	jmp    1335409 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a98d>
     1335072:	41 83 fe 01          	cmp    r14d,0x1
     1335076:	77 07                	ja     133507f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a603>
     1335078:	48 23 44 24 08       	and    rax,QWORD PTR [rsp+0x8]
     133507d:	eb 0d                	jmp    133508c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a610>
     133507f:	48 39 e8             	cmp    rax,rbp
     1335082:	72 08                	jb     133508c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a610>
     1335084:	31 d2                	xor    edx,edx
     1335086:	48 f7 f5             	div    rbp
     1335089:	48 89 d0             	mov    rax,rdx
     133508c:	4c 39 f8             	cmp    rax,r15
     133508f:	75 09                	jne    133509a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a61e>
     1335091:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     1335095:	4d 85 ed             	test   r13,r13
     1335098:	75 b5                	jne    133504f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5d3>
     133509a:	4c 8d 73 10          	lea    r14,[rbx+0x10]
     133509e:	bf b0 00 00 00       	mov    edi,0xb0
     13350a3:	e8 58 8e 4b 00       	call   17edf00 <_Znwm@plt>
     13350a8:	49 89 c5             	mov    r13,rax
     13350ab:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     13350b0:	48 83 20 00          	and    QWORD PTR [rax],0x0
     13350b4:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
     13350b9:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
     13350be:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
     13350c3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13350c8:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax
     13350cc:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     13350d0:	4c 89 e6             	mov    rsi,r12
     13350d3:	e8 b4 06 00 00       	call   133578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad10>
     13350d8:	0f 57 c0             	xorps  xmm0,xmm0
     13350db:	41 0f 11 85 a0 00 00 	movups XMMWORD PTR [r13+0xa0],xmm0
     13350e2:	00 
     13350e3:	c6 44 24 28 01       	mov    BYTE PTR [rsp+0x28],0x1
     13350e8:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     13350ec:	48 ff c0             	inc    rax
     13350ef:	78 07                	js     13350f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a67c>
     13350f1:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     13350f6:	eb 15                	jmp    133510d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a691>
     13350f8:	48 89 c1             	mov    rcx,rax
     13350fb:	48 d1 e9             	shr    rcx,1
     13350fe:	83 e0 01             	and    eax,0x1
     1335101:	48 09 c8             	or     rax,rcx
     1335104:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     1335109:	f3 0f 58 c0          	addss  xmm0,xmm0
     133510d:	48 89 e9             	mov    rcx,rbp
     1335110:	48 d1 e9             	shr    rcx,1
     1335113:	89 e8                	mov    eax,ebp
     1335115:	83 e0 01             	and    eax,0x1
     1335118:	48 09 c8             	or     rax,rcx
     133511b:	48 85 ed             	test   rbp,rbp
     133511e:	78 07                	js     1335127 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a6ab>
     1335120:	f3 48 0f 2a d5       	cvtsi2ss xmm2,rbp
     1335125:	eb 09                	jmp    1335130 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a6b4>
     1335127:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
     133512c:	f3 0f 58 d2          	addss  xmm2,xmm2
     1335130:	f3 0f 10 4b 20       	movss  xmm1,DWORD PTR [rbx+0x20]
     1335135:	74 0d                	je     1335144 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a6c8>
     1335137:	f3 0f 59 d1          	mulss  xmm2,xmm1
     133513b:	0f 2e c2             	ucomiss xmm0,xmm2
     133513e:	0f 86 4f 02 00 00    	jbe    1335393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a917>
     1335144:	48 83 fd 03          	cmp    rbp,0x3
     1335148:	0f 92 c0             	setb   al
     133514b:	48 8d 4d ff          	lea    rcx,[rbp-0x1]
     133514f:	48 85 cd             	test   rbp,rcx
     1335152:	0f 95 c1             	setne  cl
     1335155:	08 c1                	or     cl,al
     1335157:	0f b6 c1             	movzx  eax,cl
     133515a:	48 8d 04 68          	lea    rax,[rax+rbp*2]
     133515e:	f3 0f 5e c1          	divss  xmm0,xmm1
     1335162:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
     1335168:	f3 48 0f 2c c8       	cvttss2si rcx,xmm0
     133516d:	48 89 ca             	mov    rdx,rcx
     1335170:	f3 0f 5c 05 a4 96 05 	subss  xmm0,DWORD PTR [rip+0xffffffffff0596a4]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
     1335177:	ff 
     1335178:	f3 4c 0f 2c e0       	cvttss2si r12,xmm0
     133517d:	48 c1 fa 3f          	sar    rdx,0x3f
     1335181:	49 21 d4             	and    r12,rdx
     1335184:	49 09 cc             	or     r12,rcx
     1335187:	4c 39 e0             	cmp    rax,r12
     133518a:	4c 0f 47 e0          	cmova  r12,rax
     133518e:	49 83 fc 01          	cmp    r12,0x1
     1335192:	75 06                	jne    133519a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a71e>
     1335194:	6a 02                	push   0x2
     1335196:	41 5c                	pop    r12
     1335198:	eb 15                	jmp    13351af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a733>
     133519a:	49 8d 44 24 ff       	lea    rax,[r12-0x1]
     133519f:	49 85 c4             	test   r12,rax
     13351a2:	74 0b                	je     13351af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a733>
     13351a4:	4c 89 e7             	mov    rdi,r12
     13351a7:	e8 34 8e 4b 00       	call   17edfe0 <_ZNSt6__ndk112__next_primeEm@plt>
     13351ac:	49 89 c4             	mov    r12,rax
     13351af:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
     13351b3:	4d 39 f4             	cmp    r12,r14
     13351b6:	76 67                	jbe    133521f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a7a3>
     13351b8:	4d 89 e7             	mov    r15,r12
     13351bb:	4c 89 f8             	mov    rax,r15
     13351be:	48 c1 e8 3d          	shr    rax,0x3d
     13351c2:	0f 85 6a 02 00 00    	jne    1335432 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9b6>
     13351c8:	4a 8d 3c fd 00 00 00 	lea    rdi,[r15*8+0x0]
     13351cf:	00 
     13351d0:	e8 2b 8d 4b 00       	call   17edf00 <_Znwm@plt>
     13351d5:	48 89 df             	mov    rdi,rbx
     13351d8:	48 89 c6             	mov    rsi,rax
     13351db:	e8 b6 a5 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     13351e0:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
     13351e4:	31 c0                	xor    eax,eax
     13351e6:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
     13351e9:	48 83 24 c1 00       	and    QWORD PTR [rcx+rax*8],0x0
     13351ee:	48 ff c0             	inc    rax
     13351f1:	49 39 c7             	cmp    r15,rax
     13351f4:	75 f0                	jne    13351e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a76a>
     13351f6:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     13351fb:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     13351fe:	48 85 ff             	test   rdi,rdi
     1335201:	0f 84 60 01 00 00    	je     1335367 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a8eb>
     1335207:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     133520b:	f3 49 0f b8 f7       	popcnt rsi,r15
     1335210:	48 83 fe 01          	cmp    rsi,0x1
     1335214:	77 26                	ja     133523c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a7c0>
     1335216:	49 8d 47 ff          	lea    rax,[r15-0x1]
     133521a:	48 21 c1             	and    rcx,rax
     133521d:	eb 2d                	jmp    133524c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a7d0>
     133521f:	0f 83 42 01 00 00    	jae    1335367 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a8eb>
     1335225:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     1335229:	48 85 c0             	test   rax,rax
     133522c:	0f 88 9c 00 00 00    	js     13352ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a852>
     1335232:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     1335237:	e9 a7 00 00 00       	jmp    13352e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a867>
     133523c:	4c 39 f9             	cmp    rcx,r15
     133523f:	72 0b                	jb     133524c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a7d0>
     1335241:	48 89 c8             	mov    rax,rcx
     1335244:	31 d2                	xor    edx,edx
     1335246:	49 f7 f7             	div    r15
     1335249:	48 89 d1             	mov    rcx,rdx
     133524c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     133524f:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
     1335254:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
     1335258:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
     133525b:	4d 85 c0             	test   r8,r8
     133525e:	0f 84 03 01 00 00    	je     1335367 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a8eb>
     1335264:	4d 8d 4f ff          	lea    r9,[r15-0x1]
     1335268:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
     133526c:	83 fe 01             	cmp    esi,0x1
     133526f:	77 05                	ja     1335276 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a7fa>
     1335271:	4c 21 c8             	and    rax,r9
     1335274:	eb 0d                	jmp    1335283 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a807>
     1335276:	4c 39 f8             	cmp    rax,r15
     1335279:	72 08                	jb     1335283 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a807>
     133527b:	31 d2                	xor    edx,edx
     133527d:	49 f7 f7             	div    r15
     1335280:	48 89 d0             	mov    rax,rdx
     1335283:	48 39 c8             	cmp    rax,rcx
     1335286:	74 2a                	je     13352b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a836>
     1335288:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
     133528b:	48 83 3c c2 00       	cmp    QWORD PTR [rdx+rax*8],0x0
     1335290:	74 36                	je     13352c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a84c>
     1335292:	49 8b 10             	mov    rdx,QWORD PTR [r8]
     1335295:	48 89 17             	mov    QWORD PTR [rdi],rdx
     1335298:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
     133529b:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
     133529f:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     13352a2:	49 89 10             	mov    QWORD PTR [r8],rdx
     13352a5:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
     13352a8:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
     13352ac:	4c 89 00             	mov    QWORD PTR [rax],r8
     13352af:	49 89 f8             	mov    r8,rdi
     13352b2:	48 89 c8             	mov    rax,rcx
     13352b5:	4c 89 c7             	mov    rdi,r8
     13352b8:	4d 8b 00             	mov    r8,QWORD PTR [r8]
     13352bb:	48 89 c1             	mov    rcx,rax
     13352be:	4d 85 c0             	test   r8,r8
     13352c1:	75 a5                	jne    1335268 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a7ec>
     13352c3:	e9 9f 00 00 00       	jmp    1335367 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a8eb>
     13352c8:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
     13352cc:	eb e7                	jmp    13352b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a839>
     13352ce:	48 89 c1             	mov    rcx,rax
     13352d1:	48 d1 e9             	shr    rcx,1
     13352d4:	83 e0 01             	and    eax,0x1
     13352d7:	48 09 c8             	or     rax,rcx
     13352da:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     13352df:	f3 0f 58 c0          	addss  xmm0,xmm0
     13352e3:	f3 0f 5e 43 20       	divss  xmm0,DWORD PTR [rbx+0x20]
     13352e8:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
     13352ee:	f3 48 0f 2c c0       	cvttss2si rax,xmm0
     13352f3:	48 89 c1             	mov    rcx,rax
     13352f6:	f3 0f 5c 05 1e 95 05 	subss  xmm0,DWORD PTR [rip+0xffffffffff05951e]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
     13352fd:	ff 
     13352fe:	f3 48 0f 2c f8       	cvttss2si rdi,xmm0
     1335303:	48 c1 f9 3f          	sar    rcx,0x3f
     1335307:	48 21 cf             	and    rdi,rcx
     133530a:	48 09 c7             	or     rdi,rax
     133530d:	49 83 fe 03          	cmp    r14,0x3
     1335311:	72 28                	jb     133533b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a8bf>
     1335313:	f3 49 0f b8 c6       	popcnt rax,r14
     1335318:	83 f8 01             	cmp    eax,0x1
     133531b:	77 1e                	ja     133533b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a8bf>
     133531d:	48 8d 47 ff          	lea    rax,[rdi-0x1]
     1335321:	48 0f bd c8          	bsr    rcx,rax
     1335325:	83 f1 3f             	xor    ecx,0x3f
     1335328:	f6 d9                	neg    cl
     133532a:	6a 01                	push   0x1
     133532c:	41 5f                	pop    r15
     133532e:	49 d3 e7             	shl    r15,cl
     1335331:	48 83 ff 02          	cmp    rdi,0x2
     1335335:	4c 0f 42 ff          	cmovb  r15,rdi
     1335339:	eb 08                	jmp    1335343 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a8c7>
     133533b:	e8 a0 8c 4b 00       	call   17edfe0 <_ZNSt6__ndk112__next_primeEm@plt>
     1335340:	49 89 c7             	mov    r15,rax
     1335343:	4d 39 fc             	cmp    r12,r15
     1335346:	4d 0f 47 fc          	cmova  r15,r12
     133534a:	4d 39 f7             	cmp    r15,r14
     133534d:	73 18                	jae    1335367 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a8eb>
     133534f:	4d 85 ff             	test   r15,r15
     1335352:	0f 85 63 fe ff ff    	jne    13351bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a73f>
     1335358:	48 89 df             	mov    rdi,rbx
     133535b:	31 f6                	xor    esi,esi
     133535d:	e8 34 a4 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     1335362:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     1335367:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]
     133536b:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     133536f:	48 85 c5             	test   rbp,rax
     1335372:	75 0a                	jne    133537e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a902>
     1335374:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1335379:	49 21 c7             	and    r15,rax
     133537c:	eb 15                	jmp    1335393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a917>
     133537e:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1335383:	49 39 ef             	cmp    r15,rbp
     1335386:	72 0b                	jb     1335393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a917>
     1335388:	4c 89 f8             	mov    rax,r15
     133538b:	31 d2                	xor    edx,edx
     133538d:	48 f7 f5             	div    rbp
     1335390:	49 89 d7             	mov    r15,rdx
     1335393:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1335396:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     133539a:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     133539f:	48 85 c0             	test   rax,rax
     13353a2:	74 09                	je     13353ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a931>
     13353a4:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13353a7:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
     13353ab:	eb 47                	jmp    13353f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a978>
     13353ad:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     13353b1:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     13353b5:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     13353b9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     13353bc:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     13353c1:	4a 89 0c f8          	mov    QWORD PTR [rax+r15*8],rcx
     13353c5:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     13353c9:	48 85 c0             	test   rax,rax
     13353cc:	74 29                	je     13353f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a97b>
     13353ce:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13353d2:	48 8d 4d ff          	lea    rcx,[rbp-0x1]
     13353d6:	48 85 cd             	test   rbp,rcx
     13353d9:	75 05                	jne    13353e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a964>
     13353db:	48 21 c8             	and    rax,rcx
     13353de:	eb 0d                	jmp    13353ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a971>
     13353e0:	48 39 e8             	cmp    rax,rbp
     13353e3:	72 08                	jb     13353ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a971>
     13353e5:	31 d2                	xor    edx,edx
     13353e7:	48 f7 f5             	div    rbp
     13353ea:	48 89 d0             	mov    rax,rdx
     13353ed:	48 c1 e0 03          	shl    rax,0x3
     13353f1:	48 03 03             	add    rax,QWORD PTR [rbx]
     13353f4:	4c 89 28             	mov    QWORD PTR [rax],r13
     13353f7:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     13353fc:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1335400:	48 ff 43 18          	inc    QWORD PTR [rbx+0x18]
     1335404:	e8 e1 03 00 00       	call   13357ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad6e>
     1335409:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1335410:	00 00 
     1335412:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     1335417:	75 55                	jne    133546e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f2>
     1335419:	49 81 c5 a0 00 00 00 	add    r13,0xa0
     1335420:	4c 89 e8             	mov    rax,r13
     1335423:	48 83 c4 38          	add    rsp,0x38
     1335427:	5b                   	pop    rbx
     1335428:	41 5c                	pop    r12
     133542a:	41 5d                	pop    r13
     133542c:	41 5e                	pop    r14
     133542e:	41 5f                	pop    r15
     1335430:	5d                   	pop    rbp
     1335431:	c3                   	ret
     1335432:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1335439:	00 00 
     133543b:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     1335440:	75 2c                	jne    133546e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f2>
     1335442:	e8 98 62 74 ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
     1335447:	eb 00                	jmp    1335449 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9cd>
     1335449:	48 89 c3             	mov    rbx,rax
     133544c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1335451:	e8 94 03 00 00       	call   13357ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad6e>
     1335456:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133545d:	00 00 
     133545f:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     1335464:	75 08                	jne    133546e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f2>
     1335466:	48 89 df             	mov    rdi,rbx
     1335469:	e8 62 a8 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     133546e:	e8 3d a6 4b 00       	call   17efab0 <__stack_chk_fail@plt>

## returned-object helper b2990a; FDE=(11704586, 11704625)
      b2990a:	53                   	push   rbx
      b2990b:	48 89 fb             	mov    rbx,rdi
      b2990e:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      b29915:	48 85 c0             	test   rax,rax
      b29918:	74 05                	je     b2991f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768bf>
      b2991a:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      b2991f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      b29923:	f3 0f 7f 03          	movdqu XMMWORD PTR [rbx],xmm0
      b29927:	e8 86 4b f7 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      b2992c:	48 89 d8             	mov    rax,rbx
      b2992f:	5b                   	pop    rbx
      b29930:	c3                   	ret

## cleanup/registration helper 0x1335474; FDE=(20141172, 20141479)
     1335474:	41 57                	push   r15
     1335476:	41 56                	push   r14
     1335478:	53                   	push   rbx
     1335479:	48 83 ec 20          	sub    rsp,0x20
     133547d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1335484:	00 00 
     1335486:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     133548b:	4c 8b 0e             	mov    r9,QWORD PTR [rsi]
     133548e:	48 8b 4e 08          	mov    rcx,QWORD PTR [rsi+0x8]
     1335492:	4c 8b 57 08          	mov    r10,QWORD PTR [rdi+0x8]
     1335496:	f3 4d 0f b8 f2       	popcnt r14,r10
     133549b:	49 83 fe 01          	cmp    r14,0x1
     133549f:	77 09                	ja     13354aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aa2e>
     13354a1:	49 8d 42 ff          	lea    rax,[r10-0x1]
     13354a5:	48 21 c1             	and    rcx,rax
     13354a8:	eb 10                	jmp    13354ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aa3e>
     13354aa:	4c 39 d1             	cmp    rcx,r10
     13354ad:	72 0b                	jb     13354ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aa3e>
     13354af:	48 89 c8             	mov    rax,rcx
     13354b2:	31 d2                	xor    edx,edx
     13354b4:	49 f7 f2             	div    r10
     13354b7:	48 89 d1             	mov    rcx,rdx
     13354ba:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
     13354bd:	49 8b 04 cf          	mov    rax,QWORD PTR [r15+rcx*8]
     13354c1:	49 89 c3             	mov    r11,rax
     13354c4:	48 8b 00             	mov    rax,QWORD PTR [rax]
     13354c7:	48 39 f0             	cmp    rax,rsi
     13354ca:	75 f5                	jne    13354c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aa45>
     13354cc:	48 8d 5f 10          	lea    rbx,[rdi+0x10]
     13354d0:	49 39 db             	cmp    r11,rbx
     13354d3:	74 25                	je     13354fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aa7e>
     13354d5:	49 8b 43 08          	mov    rax,QWORD PTR [r11+0x8]
     13354d9:	41 83 fe 01          	cmp    r14d,0x1
     13354dd:	77 09                	ja     13354e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aa6c>
     13354df:	49 8d 52 ff          	lea    rdx,[r10-0x1]
     13354e3:	48 21 d0             	and    rax,rdx
     13354e6:	eb 0d                	jmp    13354f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aa79>
     13354e8:	4c 39 d0             	cmp    rax,r10
     13354eb:	72 08                	jb     13354f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aa79>
     13354ed:	31 d2                	xor    edx,edx
     13354ef:	49 f7 f2             	div    r10
     13354f2:	48 89 d0             	mov    rax,rdx
     13354f5:	48 39 c8             	cmp    rax,rcx
     13354f8:	74 35                	je     133552f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aab3>
     13354fa:	4d 85 c9             	test   r9,r9
     13354fd:	74 28                	je     1335527 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aaab>
     13354ff:	4d 8b 41 08          	mov    r8,QWORD PTR [r9+0x8]
     1335503:	41 83 fe 01          	cmp    r14d,0x1
     1335507:	77 09                	ja     1335512 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aa96>
     1335509:	49 8d 52 ff          	lea    rdx,[r10-0x1]
     133550d:	4c 21 c2             	and    rdx,r8
     1335510:	eb 10                	jmp    1335522 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aaa6>
     1335512:	4c 89 c2             	mov    rdx,r8
     1335515:	4d 39 d0             	cmp    r8,r10
     1335518:	72 08                	jb     1335522 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aaa6>
     133551a:	4c 89 c0             	mov    rax,r8
     133551d:	31 d2                	xor    edx,edx
     133551f:	49 f7 f2             	div    r10
     1335522:	48 39 ca             	cmp    rdx,rcx
     1335525:	74 11                	je     1335538 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aabc>
     1335527:	49 83 24 cf 00       	and    QWORD PTR [r15+rcx*8],0x0
     133552c:	4c 8b 0e             	mov    r9,QWORD PTR [rsi]
     133552f:	4d 85 c9             	test   r9,r9
     1335532:	74 33                	je     1335567 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aaeb>
     1335534:	4d 8b 41 08          	mov    r8,QWORD PTR [r9+0x8]
     1335538:	41 83 fe 01          	cmp    r14d,0x1
     133553c:	77 08                	ja     1335546 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aaca>
     133553e:	49 ff ca             	dec    r10
     1335541:	4d 21 d0             	and    r8,r10
     1335544:	eb 10                	jmp    1335556 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aada>
     1335546:	4d 39 d0             	cmp    r8,r10
     1335549:	72 0b                	jb     1335556 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aada>
     133554b:	4c 89 c0             	mov    rax,r8
     133554e:	31 d2                	xor    edx,edx
     1335550:	49 f7 f2             	div    r10
     1335553:	49 89 d0             	mov    r8,rdx
     1335556:	49 39 c8             	cmp    r8,rcx
     1335559:	74 0f                	je     133556a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aaee>
     133555b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133555e:	4e 89 1c c0          	mov    QWORD PTR [rax+r8*8],r11
     1335562:	4c 8b 0e             	mov    r9,QWORD PTR [rsi]
     1335565:	eb 03                	jmp    133556a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aaee>
     1335567:	45 31 c9             	xor    r9d,r9d
     133556a:	4d 89 0b             	mov    QWORD PTR [r11],r9
     133556d:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     1335571:	48 ff 4f 18          	dec    QWORD PTR [rdi+0x18]
     1335575:	48 89 e7             	mov    rdi,rsp
     1335578:	48 89 37             	mov    QWORD PTR [rdi],rsi
     133557b:	48 89 5f 08          	mov    QWORD PTR [rdi+0x8],rbx
     133557f:	c6 47 10 01          	mov    BYTE PTR [rdi+0x10],0x1
     1335583:	e8 78 01 00 00       	call   1335700 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ac84>
     1335588:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133558f:	00 00 
     1335591:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1335596:	75 0a                	jne    13355a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab26>
     1335598:	48 83 c4 20          	add    rsp,0x20
     133559c:	5b                   	pop    rbx
     133559d:	41 5e                	pop    r14
     133559f:	41 5f                	pop    r15
     13355a1:	c3                   	ret
     13355a2:	e8 09 a5 4b 00       	call   17efab0 <__stack_chk_fail@plt>

## preceding lookup helper 0x1334d26; FDE=(20139302, 20139497)
     1334d26:	55                   	push   rbp
     1334d27:	41 57                	push   r15
     1334d29:	41 56                	push   r14
     1334d2b:	41 55                	push   r13
     1334d2d:	41 54                	push   r12
     1334d2f:	53                   	push   rbx
     1334d30:	50                   	push   rax
     1334d31:	48 89 f3             	mov    rbx,rsi
     1334d34:	49 89 ff             	mov    r15,rdi
     1334d37:	48 89 f7             	mov    rdi,rsi
     1334d3a:	e8 a5 18 01 00       	call   13465e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18bb68>
     1334d3f:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]
     1334d43:	4d 85 ed             	test   r13,r13
     1334d46:	0f 84 88 00 00 00    	je     1334dd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a358>
     1334d4c:	49 89 c6             	mov    r14,rax
     1334d4f:	f3 49 0f b8 ed       	popcnt rbp,r13
     1334d54:	48 83 fd 01          	cmp    rbp,0x1
     1334d58:	77 09                	ja     1334d63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2e7>
     1334d5a:	4d 8d 65 ff          	lea    r12,[r13-0x1]
     1334d5e:	4d 21 f4             	and    r12,r14
     1334d61:	eb 15                	jmp    1334d78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2fc>
     1334d63:	4d 39 ee             	cmp    r14,r13
     1334d66:	73 05                	jae    1334d6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2f1>
     1334d68:	4d 89 f4             	mov    r12,r14
     1334d6b:	eb 0b                	jmp    1334d78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2fc>
     1334d6d:	4c 89 f0             	mov    rax,r14
     1334d70:	31 d2                	xor    edx,edx
     1334d72:	49 f7 f5             	div    r13
     1334d75:	49 89 d4             	mov    r12,rdx
     1334d78:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1334d7b:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
     1334d7f:	48 85 c0             	test   rax,rax
     1334d82:	74 50                	je     1334dd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a358>
     1334d84:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     1334d87:	4d 85 ff             	test   r15,r15
     1334d8a:	74 48                	je     1334dd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a358>
     1334d8c:	49 8d 45 ff          	lea    rax,[r13-0x1]
     1334d90:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1334d94:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     1334d98:	4c 39 f0             	cmp    rax,r14
     1334d9b:	75 12                	jne    1334daf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a333>
     1334d9d:	49 8d 7f 10          	lea    rdi,[r15+0x10]
     1334da1:	48 89 de             	mov    rsi,rbx
     1334da4:	e8 7f 09 00 00       	call   1335728 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17acac>
     1334da9:	84 c0                	test   al,al
     1334dab:	74 1f                	je     1334dcc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a350>
     1334dad:	eb 28                	jmp    1334dd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a35b>
     1334daf:	83 fd 01             	cmp    ebp,0x1
     1334db2:	77 06                	ja     1334dba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a33e>
     1334db4:	48 23 04 24          	and    rax,QWORD PTR [rsp]
     1334db8:	eb 0d                	jmp    1334dc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a34b>
     1334dba:	4c 39 e8             	cmp    rax,r13
     1334dbd:	72 08                	jb     1334dc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a34b>
     1334dbf:	31 d2                	xor    edx,edx
     1334dc1:	49 f7 f5             	div    r13
     1334dc4:	48 89 d0             	mov    rax,rdx
     1334dc7:	4c 39 e0             	cmp    rax,r12
     1334dca:	75 08                	jne    1334dd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a358>
     1334dcc:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     1334dcf:	4d 85 ff             	test   r15,r15
     1334dd2:	75 c0                	jne    1334d94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a318>
     1334dd4:	45 31 ff             	xor    r15d,r15d
     1334dd7:	4c 89 f8             	mov    rax,r15
     1334dda:	48 83 c4 08          	add    rsp,0x8
     1334dde:	5b                   	pop    rbx
     1334ddf:	41 5c                	pop    r12
     1334de1:	41 5d                	pop    r13
     1334de3:	41 5e                	pop    r14
     1334de5:	41 5f                	pop    r15
     1334de7:	5d                   	pop    rbp
     1334de8:	c3                   	ret

## Main caller window 0x1332f70..0x1333060
     1332f72:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
     1332f79:	48 85 c0             	test   rax,rax
     1332f7c:	74 20                	je     1332f9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178522>
     1332f7e:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
     1332f85:	00 
     1332f86:	48 89 bc 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rdi
     1332f8d:	00 
     1332f8e:	e9 b2 00 00 00       	jmp    1333045 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1785c9>
     1332f93:	49 83 26 00          	and    QWORD PTR [r14],0x0
     1332f97:	e9 7a 14 00 00       	jmp    1334416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17999a>
     1332f9c:	31 ff                	xor    edi,edi
     1332f9e:	e8 e3 b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1332fa3:	49 8d 6e 58          	lea    rbp,[r14+0x58]
     1332fa7:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
     1332fae:	00 
     1332faf:	48 89 ef             	mov    rdi,rbp
     1332fb2:	e8 6f 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     1332fb7:	48 85 c0             	test   rax,rax
     1332fba:	0f 84 2e 05 00 00    	je     13334ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178a72>
     1332fc0:	49 89 c5             	mov    r13,rax
     1332fc3:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
     1332fca:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
     1332fce:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1332fd3:	4c 89 eb             	mov    rbx,r13
     1332fd6:	48 83 c3 10          	add    rbx,0x10
     1332fda:	48 8d 8c 24 e0 02 00 	lea    rcx,[rsp+0x2e0]
     1332fe1:	00 
     1332fe2:	48 89 11             	mov    QWORD PTR [rcx],rdx
     1332fe5:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1332fec:	00 
     1332fed:	4c 89 f6             	mov    rsi,r14
     1332ff0:	48 89 da             	mov    rdx,rbx
     1332ff3:	e8 f2 1d 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
     1332ff8:	48 8b bc 24 e0 02 00 	mov    rdi,QWORD PTR [rsp+0x2e0]
     1332fff:	00 
     1333000:	48 85 ff             	test   rdi,rdi
     1333003:	74 06                	je     133300b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17858f>
     1333005:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1333008:	ff 50 08             	call   QWORD PTR [rax+0x8]
     133300b:	4c 89 e7             	mov    rdi,r12
     133300e:	48 89 de             	mov    rsi,rbx
     1333011:	e8 b8 1f 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>
     1333016:	0f 28 84 24 a0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3a0]
     133301d:	00 
     133301e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1333023:	48 89 c7             	mov    rdi,rax
     1333026:	e8 df 68 7f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
     133302b:	48 89 ef             	mov    rdi,rbp
     133302e:	4c 89 ee             	mov    rsi,r13
     1333031:	e8 3e 24 00 00       	call   1335474 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f8>
     1333036:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     133303c:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
     1333043:	00 00 
     1333045:	c7 84 24 a8 02 00 00 	mov    DWORD PTR [rsp+0x2a8],0x1
     133304c:	01 00 00 00 
     1333050:	31 ff                	xor    edi,edi
     1333052:	e8 2f b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1333057:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     133305e:	00 
     133305f:	e8 88 1c 00 00       	call   1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>

## 0x1334dea writes to output RDI
## Candidate source loads feeding producer output first qword
## Direct callers of 0x1334dea
### caller @0x1332ff3; FDE=(20131328, 20138970)
     1332f85:	00 
     1332f86:	48 89 bc 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rdi
     1332f8d:	00 
     1332f8e:	e9 b2 00 00 00       	jmp    1333045 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1785c9>
     1332f93:	49 83 26 00          	and    QWORD PTR [r14],0x0
     1332f97:	e9 7a 14 00 00       	jmp    1334416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17999a>
     1332f9c:	31 ff                	xor    edi,edi
     1332f9e:	e8 e3 b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1332fa3:	49 8d 6e 58          	lea    rbp,[r14+0x58]
     1332fa7:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
     1332fae:	00 
     1332faf:	48 89 ef             	mov    rdi,rbp
     1332fb2:	e8 6f 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     1332fb7:	48 85 c0             	test   rax,rax
     1332fba:	0f 84 2e 05 00 00    	je     13334ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178a72>
     1332fc0:	49 89 c5             	mov    r13,rax
     1332fc3:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
     1332fca:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
     1332fce:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1332fd3:	4c 89 eb             	mov    rbx,r13
     1332fd6:	48 83 c3 10          	add    rbx,0x10
     1332fda:	48 8d 8c 24 e0 02 00 	lea    rcx,[rsp+0x2e0]
     1332fe1:	00 
     1332fe2:	48 89 11             	mov    QWORD PTR [rcx],rdx
     1332fe5:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1332fec:	00 
     1332fed:	4c 89 f6             	mov    rsi,r14
     1332ff0:	48 89 da             	mov    rdx,rbx
     1332ff3:	e8 f2 1d 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
     1332ff8:	48 8b bc 24 e0 02 00 	mov    rdi,QWORD PTR [rsp+0x2e0]
     1332fff:	00 
     1333000:	48 85 ff             	test   rdi,rdi
     1333003:	74 06                	je     133300b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17858f>
     1333005:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1333008:	ff 50 08             	call   QWORD PTR [rax+0x8]
     133300b:	4c 89 e7             	mov    rdi,r12
     133300e:	48 89 de             	mov    rsi,rbx
     1333011:	e8 b8 1f 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>
     1333016:	0f 28 84 24 a0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3a0]
     133301d:	00 
     133301e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1333023:	48 89 c7             	mov    rdi,rax
     1333026:	e8 df 68 7f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
     133302b:	48 89 ef             	mov    rdi,rbp
     133302e:	4c 89 ee             	mov    rsi,r13
     1333031:	e8 3e 24 00 00       	call   1335474 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f8>
     1333036:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     133303c:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
     1333043:	00 00 
     1333045:	c7 84 24 a8 02 00 00 	mov    DWORD PTR [rsp+0x2a8],0x1
     133304c:	01 00 00 00 
     1333050:	31 ff                	xor    edi,edi
     1333052:	e8 2f b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1333057:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     133305e:	00 
     133305f:	e8 88 1c 00 00       	call   1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>
     1333064:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     133306b:	00 
     133306c:	e8 1f ae 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1333071:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     1333078:	00 
     1333079:	e8 4c 32 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
     133307e:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
     1333085:	00 
     1333086:	e8 a3 22 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     133308b:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
     1333090:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     1333097:	00 
     1333098:	4c 89 ee             	mov    rsi,r13
     133309b:	e8 b2 e2 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
     13330a0:	31 c0                	xor    eax,eax
     13330a2:	48 8d 8c 24 90 02 00 	lea    rcx,[rsp+0x290]
     13330a9:	00 
     13330aa:	83 79 18 01          	cmp    DWORD PTR [rcx+0x18],0x1

### caller @0x1334540; FDE=(20131328, 20138970)
     13344d0:	74 47                	je     1334519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a9d>
     13344d2:	48 8b 84 24 b0 03 00 	mov    rax,QWORD PTR [rsp+0x3b0]
     13344d9:	00 
     13344da:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
     13344e1:	00 
     13344e2:	66 0f 6f 84 24 a0 03 	movdqa xmm0,XMMWORD PTR [rsp+0x3a0]
     13344e9:	00 00 
     13344eb:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
     13344f2:	00 00 
     13344f4:	66 0f ef c0          	pxor   xmm0,xmm0
     13344f8:	66 0f 7f 84 24 a0 03 	movdqa XMMWORD PTR [rsp+0x3a0],xmm0
     13344ff:	00 00 
     1334501:	48 83 a4 24 b0 03 00 	and    QWORD PTR [rsp+0x3b0],0x0
     1334508:	00 00 
     133450a:	83 a4 24 a8 02 00 00 	and    DWORD PTR [rsp+0x2a8],0x0
     1334511:	00 
     1334512:	b3 01                	mov    bl,0x1
     1334514:	e9 87 00 00 00       	jmp    13345a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179b24>
     1334519:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
     1334520:	00 00 
     1334522:	48 8d 8c 24 f0 04 00 	lea    rcx,[rsp+0x4f0]
     1334529:	00 
     133452a:	48 89 01             	mov    QWORD PTR [rcx],rax
     133452d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     1334534:	00 
     1334535:	48 8d 94 24 10 04 00 	lea    rdx,[rsp+0x410]
     133453c:	00 
     133453d:	4c 89 f6             	mov    rsi,r14
     1334540:	e8 a5 08 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
     1334545:	48 8b bc 24 f0 04 00 	mov    rdi,QWORD PTR [rsp+0x4f0]
     133454c:	00 
     133454d:	48 85 ff             	test   rdi,rdi
     1334550:	74 06                	je     1334558 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179adc>
     1334552:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1334555:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1334558:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
     133455f:	00 
     1334560:	4c 89 e7             	mov    rdi,r12
     1334563:	e8 66 0a 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>
     1334568:	0f 28 84 24 e0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2e0]
     133456f:	00 
     1334570:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1334575:	48 89 c7             	mov    rdi,rax
     1334578:	e8 8d 53 7f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
     133457d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     1334583:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
     133458a:	00 00 
     133458c:	c7 84 24 a8 02 00 00 	mov    DWORD PTR [rsp+0x2a8],0x1
     1334593:	01 00 00 00 
     1334597:	31 db                	xor    ebx,ebx
     1334599:	31 ff                	xor    edi,edi
     133459b:	e8 e6 9e 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13345a0:	48 8b bc 24 f0 01 00 	mov    rdi,QWORD PTR [rsp+0x1f0]
     13345a7:	00 
     13345a8:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
     13345af:	00 00 
     13345b1:	48 85 ff             	test   rdi,rdi
     13345b4:	74 06                	je     13345bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179b40>
     13345b6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13345b9:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13345bc:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     13345c3:	00 
     13345c4:	e8 c7 98 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13345c9:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     13345d0:	00 
     13345d1:	e8 16 07 00 00       	call   1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>
     13345d6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     13345dd:	00 
     13345de:	e8 ad 98 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13345e3:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     13345ea:	00 
     13345eb:	e8 da 1c 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
     13345f0:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
     13345f7:	00 

## Uses of installed service pointer from rsp+0x28 before table installation
### 0x13330b5: mov    QWORD PTR [rsp+0x28],rax
     1333086:	e8 a3 22 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     133308b:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
     1333090:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     1333097:	00 
     1333098:	4c 89 ee             	mov    rsi,r13
     133309b:	e8 b2 e2 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
     13330a0:	31 c0                	xor    eax,eax
     13330a2:	48 8d 8c 24 90 02 00 	lea    rcx,[rsp+0x290]
     13330a9:	00 
     13330aa:	83 79 18 01          	cmp    DWORD PTR [rcx+0x18],0x1
     13330ae:	48 0f 45 c8          	cmovne rcx,rax
     13330b2:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     13330b5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     13330ba:	4c 8b 71 08          	mov    r14,QWORD PTR [rcx+0x8]
     13330be:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
     13330c2:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
     13330c9:	00 00 
     13330cb:	66 0f ef c0          	pxor   xmm0,xmm0
     13330cf:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
     13330d3:	49 8b 77 48          	mov    rsi,QWORD PTR [r15+0x48]
     13330d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     13330da:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
     13330e1:	00 
     13330e2:	31 d2                	xor    edx,edx
     13330e4:	ff 50 18             	call   QWORD PTR [rax+0x18]
     13330e7:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
     13330eb:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     13330f2:	00 
     13330f3:	e8 4c 55 fe ff       	call   1318644 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15dbc8>
     13330f8:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
     13330fc:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
     1333103:	00 
     1333104:	66 0f 6f 84 24 10 04 	movdqa xmm0,XMMWORD PTR [rsp+0x410]
     133310b:	00 00 
     133310d:	41 0f b6 97 cd 00 00 	movzx  edx,BYTE PTR [r15+0xcd]
     1333114:	00 

### 0x133354e: mov    rsi,QWORD PTR [rsp+0x28]
     133351a:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
     1333521:	00 
     1333522:	48 85 c0             	test   rax,rax
     1333525:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
     133352a:	0f 84 1f 0f 00 00    	je     133444f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1799d3>
     1333530:	0f b6 8c 24 a0 03 00 	movzx  ecx,BYTE PTR [rsp+0x3a0]
     1333537:	00 
     1333538:	f6 c1 01             	test   cl,0x1
     133353b:	0f 84 8a 0f 00 00    	je     13344cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a4f>
     1333541:	48 8b 8c 24 a8 03 00 	mov    rcx,QWORD PTR [rsp+0x3a8]
     1333548:	00 
     1333549:	e9 7f 0f 00 00       	jmp    13344cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a51>
     133354e:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1333553:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1333556:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     133355d:	00 
     133355e:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1333561:	4d 89 ec             	mov    r12,r13
     1333564:	4c 8b ac 24 10 04 00 	mov    r13,QWORD PTR [rsp+0x410]
     133356b:	00 
     133356c:	4c 8b b4 24 18 04 00 	mov    r14,QWORD PTR [rsp+0x418]
     1333573:	00 
     1333574:	6a 04                	push   0x4
     1333576:	5a                   	pop    rdx
     1333577:	4c 89 ef             	mov    rdi,r13
     133357a:	4c 89 f6             	mov    rsi,r14
     133357d:	e8 56 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
     1333582:	41 b7 01             	mov    r15b,0x1
     1333585:	84 c0                	test   al,al
     1333587:	74 15                	je     133359e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178b22>
     1333589:	6a 3f                	push   0x3f
     133358b:	5a                   	pop    rdx
     133358c:	4c 89 ef             	mov    rdi,r13
     133358f:	4c 89 f6             	mov    rsi,r14
     1333592:	e8 41 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
     1333597:	41 89 c7             	mov    r15d,eax

### 0x1333830: mov    rax,QWORD PTR [rsp+0x28]
     13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
     13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1333806:	48 89 ef             	mov    rdi,rbp
     1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
     1333810:	00 
     1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
     133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
     1333822:	00 00 
     1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
     1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
     1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
     133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
     133386b:	34 01                	xor    al,0x1
     133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
     1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
     133387a:	00 
     133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
     1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
     1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     133389f:	00 
     13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]

### 0x133384f: mov    QWORD PTR [rsp+0x28],rdi
     1333810:	00 
     1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
     133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
     1333822:	00 00 
     1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
     1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
     1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
     133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
     133386b:	34 01                	xor    al,0x1
     133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
     1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
     133387a:	00 
     133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
     1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
     1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     133389f:	00 
     13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
     13338ac:	00 
     13338ad:	41 c6 04 24 00       	mov    BYTE PTR [r12],0x0
     13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13338b7:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     13338ba:	4c 8d b4 24 10 04 00 	lea    r14,[rsp+0x410]

### 0x1333b34: mov    rdi,QWORD PTR [rsp+0x28]
     1333b0a:	4c 89 e7             	mov    rdi,r12
     1333b0d:	31 d2                	xor    edx,edx
     1333b0f:	e8 80 6c 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     1333b14:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1333b17:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     1333b1e:	00 
     1333b1f:	4c 89 fe             	mov    rsi,r15
     1333b22:	4c 89 e2             	mov    rdx,r12
     1333b25:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
     1333b29:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1333b2c:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]
     1333b33:	00 
     1333b34:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1333b39:	4c 89 fe             	mov    rsi,r15
     1333b3c:	e8 b1 60 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     1333b41:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1333b45:	e8 3c a9 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1333b4a:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
     1333b51:	00 
     1333b52:	e8 91 6c 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1333b57:	48 83 a4 24 80 02 00 	and    QWORD PTR [rsp+0x280],0x0
     1333b5e:	00 00 
     1333b60:	66 0f ef c0          	pxor   xmm0,xmm0
     1333b64:	66 0f 7f 84 24 70 02 	movdqa XMMWORD PTR [rsp+0x270],xmm0
     1333b6b:	00 00 
     1333b6d:	80 bb 60 03 00 00 00 	cmp    BYTE PTR [rbx+0x360],0x0
     1333b74:	0f 84 9e 00 00 00    	je     1333c18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17919c>
     1333b7a:	80 bb 64 03 00 00 00 	cmp    BYTE PTR [rbx+0x364],0x0
     1333b81:	0f 84 91 00 00 00    	je     1333c18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17919c>
     1333b87:	4d 89 f5             	mov    r13,r14
     1333b8a:	4c 8b bb 68 03 00 00 	mov    r15,QWORD PTR [rbx+0x368]
     1333b91:	4c 8b b3 70 03 00 00 	mov    r14,QWORD PTR [rbx+0x370]
     1333b98:	4d 29 fe             	sub    r14,r15
     1333b9b:	4c 8d 25 b6 8f 0a ff 	lea    r12,[rip+0xffffffffff0a8fb6]        # 3dcb58 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25a7>
     1333ba2:	4d 85 f6             	test   r14,r14
     1333ba5:	74 31                	je     1333bd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17915c>

### 0x1334978: mov    rdi,QWORD PTR [rsp+0x28]
     1334936:	e8 4b 41 00 00       	call   1338a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e00a>
     133493b:	48 8b bb 78 06 00 00 	mov    rdi,QWORD PTR [rbx+0x678]
     1334942:	e8 3f 9b 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1334947:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     133494c:	e8 2b a8 83 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     1334951:	48 8b bb 50 06 00 00 	mov    rdi,QWORD PTR [rbx+0x650]
     1334958:	e8 55 9b 76 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     133495d:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     1334962:	e8 6d 52 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334967:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     133496c:	e8 d5 cd 48 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     1334971:	4c 8d bb b8 05 00 00 	lea    r15,[rbx+0x5b8]
     1334978:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     133497d:	e8 52 52 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334982:	48 8b bb c8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c8]
     1334989:	e8 f8 9a 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     133498e:	4c 89 ff             	mov    rdi,r15
     1334991:	e8 74 59 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
     1334996:	66 0f ef c0          	pxor   xmm0,xmm0
     133499a:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
     13349a1:	00 00 
     13349a3:	48 8b bb a8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5a8]
     13349aa:	e8 d7 9a 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13349af:	48 89 df             	mov    rdi,rbx
     13349b2:	48 81 c7 78 05 00 00 	add    rdi,0x578
     13349b9:	e8 a8 dc 7a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     13349be:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     13349c3:	e8 ea 40 00 00       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
     13349c8:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
     13349cf:	00 
     13349d0:	e8 dd 40 00 00       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
     13349d5:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     13349da:	e8 a5 77 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
     13349df:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     13349e4:	e8 9b 77 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
     13349e9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]

## Fixed input-field loads in 0x1334dea
- rdx+0x170 at 0x1332e2f: lea    rbp,[rdx+0x170]
- rdx+0x8 at 0x13339d5: mov    QWORD PTR [rdx+0x8],rbx
- rdx+0x20 at 0x13339d9: mov    QWORD PTR [rdx+0x20],rdx
