# Service184 weak-node producer trace

Recovered consumer:
  node = 1334d26(container=r14+0x30, key=...)
  weak = node+0xa8; lock(weak)
  service184 = node+0xa0
  rootTable+0x5c0 = service184

## 1334d26 map/node lookup helper
     1334ca0:	e8 2d 00 00 00       	call   1334cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a256>
     1334ca5:	4c 89 f7             	mov    rdi,r14
     1334ca8:	e8 73 92 4b 00       	call   17edf20 <_ZdlPv@plt>
     1334cad:	4d 89 fe             	mov    r14,r15
     1334cb0:	4d 85 ff             	test   r15,r15
     1334cb3:	75 e4                	jne    1334c99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a21d>
     1334cb5:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1334cb8:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1334cbc:	48 85 ff             	test   rdi,rdi
     1334cbf:	74 0a                	je     1334ccb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a24f>
     1334cc1:	5b                   	pop    rbx
     1334cc2:	41 5e                	pop    r14
     1334cc4:	41 5f                	pop    r15
     1334cc6:	e9 55 92 4b 00       	jmp    17edf20 <_ZdlPv@plt>
     1334ccb:	5b                   	pop    rbx
     1334ccc:	41 5e                	pop    r14
     1334cce:	41 5f                	pop    r15
     1334cd0:	c3                   	ret
     1334cd1:	cc                   	int3
     1334cd2:	53                   	push   rbx
     1334cd3:	48 89 fb             	mov    rbx,rdi
     1334cd6:	48 8b bf 98 00 00 00 	mov    rdi,QWORD PTR [rdi+0x98]
     1334cdd:	e8 d0 97 76 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1334ce2:	48 89 df             	mov    rdi,rbx
     1334ce5:	5b                   	pop    rbx
     1334ce6:	e9 01 00 00 00       	jmp    1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>
     1334ceb:	cc                   	int3
     1334cec:	53                   	push   rbx
     1334ced:	48 89 fb             	mov    rbx,rdi
     1334cf0:	48 83 c7 78          	add    rdi,0x78
     1334cf4:	e8 97 91 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1334cf9:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     1334cfd:	e8 c8 15 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
     1334d02:	48 89 df             	mov    rdi,rbx
     1334d05:	5b                   	pop    rbx
     1334d06:	e9 23 06 39 00       	jmp    16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1334d0b:	cc                   	int3
     1334d0c:	53                   	push   rbx
     1334d0d:	48 89 fb             	mov    rbx,rdi
     1334d10:	48 81 c7 90 00 00 00 	add    rdi,0x90
     1334d17:	e8 f0 fa d3 ff       	call   107480c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23bc22>
     1334d1c:	48 89 df             	mov    rdi,rbx
     1334d1f:	5b                   	pop    rbx
     1334d20:	e9 c7 ff ff ff       	jmp    1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>
     1334d25:	cc                   	int3
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
     1334de9:	cc                   	int3
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

## Direct callers of 1334d26
### 0x1332f4c
     1332eef:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
     1332ef6:	00 
     1332ef7:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     1332efb:	48 83 a4 24 90 01 00 	and    QWORD PTR [rsp+0x190],0x0
     1332f02:	00 00 
     1332f04:	66 0f ef c0          	pxor   xmm0,xmm0
     1332f08:	66 0f 7f 84 24 80 01 	movdqa XMMWORD PTR [rsp+0x180],xmm0
     1332f0f:	00 00 
     1332f11:	40 88 6b 70          	mov    BYTE PTR [rbx+0x70],bpl
     1332f15:	0f 28 8c 24 60 01 00 	movaps xmm1,XMMWORD PTR [rsp+0x160]
     1332f1c:	00 
     1332f1d:	0f 11 4b 78          	movups XMMWORD PTR [rbx+0x78],xmm1
     1332f21:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
     1332f28:	00 
     1332f29:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
     1332f30:	66 0f 7f 84 24 60 01 	movdqa XMMWORD PTR [rsp+0x160],xmm0
     1332f37:	00 00 
     1332f39:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
     1332f40:	00 00 
     1332f42:	4d 8d 66 30          	lea    r12,[r14+0x30]
     1332f46:	4c 89 e7             	mov    rdi,r12
     1332f49:	48 89 de             	mov    rsi,rbx
     1332f4c:	e8 d5 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     1332f51:	48 85 c0             	test   rax,rax
     1332f54:	74 4d                	je     1332fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178527>
     1332f56:	48 89 c3             	mov    rbx,rax
     1332f59:	48 8b b8 a8 00 00 00 	mov    rdi,QWORD PTR [rax+0xa8]
     1332f60:	48 85 ff             	test   rdi,rdi
     1332f63:	74 37                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
     1332f65:	e8 d6 b1 4b 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
     1332f6a:	48 85 c0             	test   rax,rax
     1332f6d:	74 2d                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
     1332f6f:	48 89 c7             	mov    rdi,rax
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

### 0x1332fb2
     1332f60:	48 85 ff             	test   rdi,rdi
     1332f63:	74 37                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
     1332f65:	e8 d6 b1 4b 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
     1332f6a:	48 85 c0             	test   rax,rax
     1332f6d:	74 2d                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
     1332f6f:	48 89 c7             	mov    rdi,rax
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

### 0x13358fe
     13358b2:	4d 85 f6             	test   r14,r14
     13358b5:	0f 84 08 07 00 00    	je     1335fc3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b547>
     13358bb:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13358be:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13358c2:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     13358c9:	00 00 
     13358cb:	48 3b 8c 24 c0 01 00 	cmp    rcx,QWORD PTR [rsp+0x1c0]
     13358d2:	00 
     13358d3:	0f 85 be 07 00 00    	jne    1336097 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b61b>
     13358d9:	4c 89 f7             	mov    rdi,r14
     13358dc:	48 81 c4 c8 01 00 00 	add    rsp,0x1c8
     13358e3:	5b                   	pop    rbx
     13358e4:	41 5c                	pop    r12
     13358e6:	41 5d                	pop    r13
     13358e8:	41 5e                	pop    r14
     13358ea:	41 5f                	pop    r15
     13358ec:	5d                   	pop    rbp
     13358ed:	ff e0                	jmp    rax
     13358ef:	4d 8d 7c 24 30       	lea    r15,[r12+0x30]
     13358f4:	48 83 c5 18          	add    rbp,0x18
     13358f8:	4c 89 ff             	mov    rdi,r15
     13358fb:	48 89 ee             	mov    rsi,rbp
     13358fe:	e8 23 f4 ff ff       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     1335903:	48 85 c0             	test   rax,rax
     1335906:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     133590b:	0f 84 0e 01 00 00    	je     1335a1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17afa3>
     1335911:	48 89 c1             	mov    rcx,rax
     1335914:	4c 8b 00             	mov    r8,QWORD PTR [rax]
     1335917:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
     133591b:	4d 8b 4c 24 38       	mov    r9,QWORD PTR [r12+0x38]
     1335920:	f3 49 0f b8 d9       	popcnt rbx,r9
     1335925:	48 83 fb 01          	cmp    rbx,0x1
     1335929:	77 09                	ja     1335934 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aeb8>
     133592b:	49 8d 41 ff          	lea    rax,[r9-0x1]
     133592f:	48 21 c6             	and    rsi,rax
     1335932:	eb 10                	jmp    1335944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aec8>
     1335934:	4c 39 ce             	cmp    rsi,r9
     1335937:	72 0b                	jb     1335944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aec8>
     1335939:	48 89 f0             	mov    rax,rsi
     133593c:	31 d2                	xor    edx,edx
     133593e:	49 f7 f1             	div    r9
     1335941:	48 89 d6             	mov    rsi,rdx
     1335944:	4d 8b 27             	mov    r12,QWORD PTR [r15]
     1335947:	49 8b 04 f4          	mov    rax,QWORD PTR [r12+rsi*8]
     133594b:	49 89 c2             	mov    r10,rax
     133594e:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1335951:	48 39 c8             	cmp    rax,rcx
     1335954:	75 f5                	jne    133594b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aecf>
     1335956:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     133595b:	4c 8d 58 40          	lea    r11,[rax+0x40]
     133595f:	4d 39 da             	cmp    r10,r11

### 0x1336147
     1336107:	5b                   	pop    rbx
     1336108:	e9 13 7e 4b 00       	jmp    17edf20 <_ZdlPv@plt>
     133610d:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     1336110:	48 89 06             	mov    QWORD PTR [rsi],rax
     1336113:	c3                   	ret
     1336114:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1336117:	e9 06 00 00 00       	jmp    1336122 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b6a6>
     133611c:	e9 3f f7 ff ff       	jmp    1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     1336121:	cc                   	int3
     1336122:	41 56                	push   r14
     1336124:	53                   	push   rbx
     1336125:	50                   	push   rax
     1336126:	49 89 fe             	mov    r14,rdi
     1336129:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     133612c:	48 83 c7 08          	add    rdi,0x8
     1336130:	e8 09 22 83 ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
     1336135:	84 c0                	test   al,al
     1336137:	75 2a                	jne    1336163 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b6e7>
     1336139:	48 83 c3 58          	add    rbx,0x58
     133613d:	49 83 c6 18          	add    r14,0x18
     1336141:	48 89 df             	mov    rdi,rbx
     1336144:	4c 89 f6             	mov    rsi,r14
     1336147:	e8 da eb ff ff       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     133614c:	48 85 c0             	test   rax,rax
     133614f:	74 12                	je     1336163 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b6e7>
     1336151:	48 89 df             	mov    rdi,rbx
     1336154:	48 89 c6             	mov    rsi,rax
     1336157:	48 83 c4 08          	add    rsp,0x8
     133615b:	5b                   	pop    rbx
     133615c:	41 5e                	pop    r14
     133615e:	e9 11 f3 ff ff       	jmp    1335474 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f8>
     1336163:	48 83 c4 08          	add    rsp,0x8
     1336167:	5b                   	pop    rbx
     1336168:	41 5e                	pop    r14
     133616a:	c3                   	ret
     133616b:	48 89 c7             	mov    rdi,rax
     133616e:	e8 32 39 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1336173:	cc                   	int3
     1336174:	53                   	push   rbx
     1336175:	48 89 fb             	mov    rbx,rdi
     1336178:	48 8d 05 51 fb 52 00 	lea    rax,[rip+0x52fb51]        # 1865cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x223b8>
     133617f:	48 89 07             	mov    QWORD PTR [rdi],rax
     1336182:	48 83 c7 20          	add    rdi,0x20
     1336186:	e8 d5 f6 ff ff       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     133618b:	48 89 df             	mov    rdi,rbx
     133618e:	5b                   	pop    rbx
     133618f:	e9 7c 7e 4b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     1336194:	53                   	push   rbx
     1336195:	48 89 fb             	mov    rbx,rdi
     1336198:	e8 d7 ff ff ff       	call   1336174 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b6f8>
     133619d:	48 89 df             	mov    rdi,rbx

## Writes to node-like +0xa0 / +0xa8 in 0x1300000..0x1360000
### 0x13024f2: movups XMMWORD PTR [r14+0xa8],xmm0
     13024c0:	4c 89 f7             	mov    rdi,r14
     13024c3:	ff 50 38             	call   QWORD PTR [rax+0x38]
     13024c6:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     13024cb:	48 89 c6             	mov    rsi,rax
     13024ce:	e8 6d ba 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13024d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13024d6:	4c 89 f7             	mov    rdi,r14
     13024d9:	ff 50 40             	call   QWORD PTR [rax+0x40]
     13024dc:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     13024e3:	00 
     13024e4:	48 89 c6             	mov    rsi,rax
     13024e7:	e8 54 ba 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13024ec:	0f 57 c0             	xorps  xmm0,xmm0
     13024ef:	49 89 e6             	mov    r14,rsp
     13024f2:	41 0f 11 86 a8 00 00 	movups XMMWORD PTR [r14+0xa8],xmm0
     13024f9:	00 
     13024fa:	49 83 a6 b8 00 00 00 	and    QWORD PTR [r14+0xb8],0x0
     1302501:	00 
     1302502:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1302505:	4c 89 f6             	mov    rsi,r14
     1302508:	e8 97 60 f2 ff       	call   12285a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db28>
     130250d:	4c 89 f7             	mov    rdi,r14
     1302510:	e8 83 76 d8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1302515:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     130251c:	00 00 
     130251e:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
     1302525:	00 
     1302526:	75 0b                	jne    1302533 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x147ab7>
     1302528:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
     130252f:	5b                   	pop    rbx
     1302530:	41 5e                	pop    r14
     1302532:	c3                   	ret
     1302533:	e8 78 d5 4e 00       	call   17efab0 <__stack_chk_fail@plt>
     1302538:	48 89 c7             	mov    rdi,rax
     130253b:	e8 65 75 77 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### 0x1307cf1: mov    QWORD PTR [rsp+0xa8],rax
     1307cc4:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     1307cc8:	48 85 c0             	test   rax,rax
     1307ccb:	75 ce                	jne    1307c9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d21f>
     1307ccd:	e9 a8 00 00 00       	jmp    1307d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d2fe>
     1307cd2:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1307cd5:	4d 89 fe             	mov    r14,r15
     1307cd8:	48 85 c0             	test   rax,rax
     1307cdb:	75 be                	jne    1307c9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d21f>
     1307cdd:	e9 9c 00 00 00       	jmp    1307d7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d302>
     1307ce2:	49 8d 5f 08          	lea    rbx,[r15+0x8]
     1307ce6:	6a 58                	push   0x58
     1307ce8:	5f                   	pop    rdi
     1307ce9:	e8 12 62 4e 00       	call   17edf00 <_Znwm@plt>
     1307cee:	49 89 c6             	mov    r14,rax
     1307cf1:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1307cf8:	00 
     1307cf9:	4c 89 a4 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r12
     1307d00:	00 
     1307d01:	c6 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],0x0
     1307d08:	00 
     1307d09:	48 89 c7             	mov    rdi,rax
     1307d0c:	48 83 c7 20          	add    rdi,0x20
     1307d10:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     1307d15:	e8 a4 01 00 00       	call   1307ebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d442>
     1307d1a:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
     1307d1f:	c6 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],0x1
     1307d26:	01 
     1307d27:	0f 57 c0             	xorps  xmm0,xmm0
     1307d2a:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1307d2e:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
     1307d32:	4c 89 33             	mov    QWORD PTR [rbx],r14
     1307d35:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
     1307d39:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1307d3c:	48 85 c0             	test   rax,rax
     1307d3f:	74 07                	je     1307d48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d2cc>

### 0x1307d89: mov    QWORD PTR [rsp+0xa8],rax
     1307d54:	48 ff 45 40          	inc    QWORD PTR [rbp+0x40]
     1307d58:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     1307d5f:	00 
     1307d60:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
     1307d63:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1307d67:	e8 26 3e 7f ff       	call   afbb92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48b32>
     1307d6c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1307d71:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     1307d75:	e9 8c 00 00 00       	jmp    1307e06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d38a>
     1307d7a:	4d 8d 77 08          	lea    r14,[r15+0x8]
     1307d7e:	6a 58                	push   0x58
     1307d80:	5f                   	pop    rdi
     1307d81:	e8 7a 61 4e 00       	call   17edf00 <_Znwm@plt>
     1307d86:	48 89 c3             	mov    rbx,rax
     1307d89:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1307d90:	00 
     1307d91:	4c 89 a4 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r12
     1307d98:	00 
     1307d99:	c6 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],0x0
     1307da0:	00 
     1307da1:	48 89 c7             	mov    rdi,rax
     1307da4:	48 83 c7 20          	add    rdi,0x20
     1307da8:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     1307dad:	e8 0c 01 00 00       	call   1307ebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d442>
     1307db2:	83 63 50 00          	and    DWORD PTR [rbx+0x50],0x0
     1307db6:	c6 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],0x1
     1307dbd:	01 
     1307dbe:	0f 57 c0             	xorps  xmm0,xmm0
     1307dc1:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     1307dc4:	4c 89 7b 10          	mov    QWORD PTR [rbx+0x10],r15
     1307dc8:	49 89 1e             	mov    QWORD PTR [r14],rbx
     1307dcb:	48 8b 45 48          	mov    rax,QWORD PTR [rbp+0x48]
     1307dcf:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1307dd2:	48 85 c0             	test   rax,rax
     1307dd5:	74 07                	je     1307dde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d362>

### 0x1308b51: mov    QWORD PTR [rsp+0xa0],r13
     1308b19:	0f 85 10 01 00 00    	jne    1308c2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e1b3>
     1308b1f:	4c 89 f6             	mov    rsi,r14
     1308b22:	e8 6b cc 45 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1308b27:	4d 8b 6f 38          	mov    r13,QWORD PTR [r15+0x38]
     1308b2b:	49 8b 6f 40          	mov    rbp,QWORD PTR [r15+0x40]
     1308b2f:	4d 8d b7 b0 00 00 00 	lea    r14,[r15+0xb0]
     1308b36:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1308b3d:	00 
     1308b3e:	4c 89 f6             	mov    rsi,r14
     1308b41:	e8 5a 71 47 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
     1308b46:	84 c0                	test   al,al
     1308b48:	74 61                	je     1308bab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e12f>
     1308b4a:	4c 8d 63 18          	lea    r12,[rbx+0x18]
     1308b4e:	4c 29 ed             	sub    rbp,r13
     1308b51:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
     1308b58:	00 
     1308b59:	48 89 ac 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbp
     1308b60:	00 
     1308b61:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]
     1308b68:	00 
     1308b69:	4c 89 ef             	mov    rdi,r13
     1308b6c:	4c 89 f6             	mov    rsi,r14
     1308b6f:	e8 e2 d5 7a ff       	call   ab6156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30f6>
     1308b74:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     1308b79:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
     1308b7e:	0f 10 84 24 a0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xa0]
     1308b85:	00 
     1308b86:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     1308b8a:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1308b91:	00 
     1308b92:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
     1308b99:	00 
     1308b9a:	4c 89 fe             	mov    rsi,r15
     1308b9d:	31 d2                	xor    edx,edx
     1308b9f:	31 c9                	xor    ecx,ecx

### 0x1308b59: mov    QWORD PTR [rsp+0xa8],rbp
     1308b22:	e8 6b cc 45 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1308b27:	4d 8b 6f 38          	mov    r13,QWORD PTR [r15+0x38]
     1308b2b:	49 8b 6f 40          	mov    rbp,QWORD PTR [r15+0x40]
     1308b2f:	4d 8d b7 b0 00 00 00 	lea    r14,[r15+0xb0]
     1308b36:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1308b3d:	00 
     1308b3e:	4c 89 f6             	mov    rsi,r14
     1308b41:	e8 5a 71 47 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
     1308b46:	84 c0                	test   al,al
     1308b48:	74 61                	je     1308bab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e12f>
     1308b4a:	4c 8d 63 18          	lea    r12,[rbx+0x18]
     1308b4e:	4c 29 ed             	sub    rbp,r13
     1308b51:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
     1308b58:	00 
     1308b59:	48 89 ac 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbp
     1308b60:	00 
     1308b61:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]
     1308b68:	00 
     1308b69:	4c 89 ef             	mov    rdi,r13
     1308b6c:	4c 89 f6             	mov    rsi,r14
     1308b6f:	e8 e2 d5 7a ff       	call   ab6156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30f6>
     1308b74:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     1308b79:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
     1308b7e:	0f 10 84 24 a0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xa0]
     1308b85:	00 
     1308b86:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     1308b8a:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1308b91:	00 
     1308b92:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
     1308b99:	00 
     1308b9a:	4c 89 fe             	mov    rsi,r15
     1308b9d:	31 d2                	xor    edx,edx
     1308b9f:	31 c9                	xor    ecx,ecx
     1308ba1:	4d 89 e0             	mov    r8,r12
     1308ba4:	e8 6f b3 37 00       	call   1683f18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38084>

### 0x130a5a9: mov    BYTE PTR [rdi+0xa0],al
     130a574:	00 
     130a575:	0f 29 47 30          	movaps XMMWORD PTR [rdi+0x30],xmm0
     130a579:	0f 29 47 20          	movaps XMMWORD PTR [rdi+0x20],xmm0
     130a57d:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
     130a581:	48 83 67 40 00       	and    QWORD PTR [rdi+0x40],0x0
     130a586:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     130a589:	48 b8 01 00 00 00 01 	movabs rax,0x100000001
     130a590:	00 00 00 
     130a593:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
     130a597:	31 c0                	xor    eax,eax
     130a599:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     130a59c:	48 83 67 68 00       	and    QWORD PTR [rdi+0x68],0x0
     130a5a1:	0f 11 47 58          	movups XMMWORD PTR [rdi+0x58],xmm0
     130a5a5:	c6 47 70 01          	mov    BYTE PTR [rdi+0x70],0x1
     130a5a9:	88 87 a0 00 00 00    	mov    BYTE PTR [rdi+0xa0],al
     130a5af:	88 87 f0 00 00 00    	mov    BYTE PTR [rdi+0xf0],al
     130a5b5:	66 83 a7 00 01 00 00 	and    WORD PTR [rdi+0x100],0x0
     130a5bc:	00 
     130a5bd:	0f 11 47 78          	movups XMMWORD PTR [rdi+0x78],xmm0
     130a5c1:	0f 11 87 81 00 00 00 	movups XMMWORD PTR [rdi+0x81],xmm0
     130a5c8:	e8 ff ca 00 00       	call   13170cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15c650>
     130a5cd:	48 8d 35 84 07 6e 00 	lea    rsi,[rip+0x6e0784]        # 19ead58 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1990>
     130a5d4:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
     130a5db:	00 
     130a5dc:	48 89 df             	mov    rdi,rbx
     130a5df:	e8 6e 6d 9a ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
     130a5e4:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     130a5eb:	00 
     130a5ec:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
     130a5f3:	00 
     130a5f4:	48 8d 94 24 00 01 00 	lea    rdx,[rsp+0x100]
     130a5fb:	00 
     130a5fc:	48 89 d9             	mov    rcx,rbx
     130a5ff:	e8 f8 55 02 00       	call   132fbfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175180>
     130a604:	48 89 eb             	mov    rbx,rbp

### 0x1314b5b: mov    QWORD PTR [rsp+0xa8],rbx
     1314b24:	74 26                	je     1314b4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a0d0>
     1314b26:	4c 89 f7             	mov    rdi,r14
     1314b29:	e8 e2 af 7c ff       	call   adfb10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cab0>
     1314b2e:	48 89 c3             	mov    rbx,rax
     1314b31:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     1314b35:	48 8b 70 28          	mov    rsi,QWORD PTR [rax+0x28]
     1314b39:	4c 89 e2             	mov    rdx,r12
     1314b3c:	4c 89 f9             	mov    rcx,r15
     1314b3f:	e8 f6 db b3 ff       	call   e5273a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b50>
     1314b44:	84 c0                	test   al,al
     1314b46:	0f 84 88 00 00 00    	je     1314bd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a158>
     1314b4c:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0
     1314b50:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1314b55:	0f 84 b4 00 00 00    	je     1314c0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a193>
     1314b5b:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
     1314b62:	00 
     1314b63:	48 83 c3 08          	add    rbx,0x8
     1314b67:	e9 88 00 00 00       	jmp    1314bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a178>
     1314b6c:	48 89 df             	mov    rdi,rbx
     1314b6f:	4c 89 f6             	mov    rsi,r14
     1314b72:	4c 89 e2             	mov    rdx,r12
     1314b75:	4c 89 f9             	mov    rcx,r15
     1314b78:	e8 bd db b3 ff       	call   e5273a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b50>
     1314b7d:	84 c0                	test   al,al
     1314b7f:	0f 84 f7 00 00 00    	je     1314c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a200>
     1314b85:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     1314b8a:	4c 89 f7             	mov    rdi,r14
     1314b8d:	e8 50 9c 78 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     1314b92:	48 89 c3             	mov    rbx,rax
     1314b95:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     1314b9a:	48 39 c3             	cmp    rbx,rax
     1314b9d:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1314ba2:	74 1b                	je     1314bbf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a143>
     1314ba4:	48 8b 53 20          	mov    rdx,QWORD PTR [rbx+0x20]
     1314ba8:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]

### 0x1314bca: mov    QWORD PTR [rsp+0xa8],rbx
     1314b92:	48 89 c3             	mov    rbx,rax
     1314b95:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     1314b9a:	48 39 c3             	cmp    rbx,rax
     1314b9d:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1314ba2:	74 1b                	je     1314bbf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a143>
     1314ba4:	48 8b 53 20          	mov    rdx,QWORD PTR [rbx+0x20]
     1314ba8:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
     1314bac:	4c 89 e7             	mov    rdi,r12
     1314baf:	4c 89 fe             	mov    rsi,r15
     1314bb2:	e8 83 db b3 ff       	call   e5273a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b50>
     1314bb7:	84 c0                	test   al,al
     1314bb9:	0f 84 07 01 00 00    	je     1314cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a24a>
     1314bbf:	49 83 7e 08 00       	cmp    QWORD PTR [r14+0x8],0x0
     1314bc4:	0f 84 1c 01 00 00    	je     1314ce6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a26a>
     1314bca:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
     1314bd1:	00 
     1314bd2:	eb 20                	jmp    1314bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a178>
     1314bd4:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1314bd9:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     1314be0:	00 
     1314be1:	4c 89 e2             	mov    rdx,r12
     1314be4:	4c 89 f9             	mov    rcx,r15
     1314be7:	e8 34 61 d3 ff       	call   104ad20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x212136>
     1314bec:	48 89 c3             	mov    rbx,rax
     1314bef:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1314bf4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1314bf7:	48 85 ff             	test   rdi,rdi
     1314bfa:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     1314bff:	0f 85 86 00 00 00    	jne    1314c8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a20f>
     1314c05:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
     1314c0c:	00 
     1314c0d:	eb 0b                	jmp    1314c1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a19e>
     1314c0f:	4c 89 b4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r14
     1314c16:	00 
     1314c17:	4c 89 f3             	mov    rbx,r14

### 0x1314c0f: mov    QWORD PTR [rsp+0xa8],r14
     1314bd9:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     1314be0:	00 
     1314be1:	4c 89 e2             	mov    rdx,r12
     1314be4:	4c 89 f9             	mov    rcx,r15
     1314be7:	e8 34 61 d3 ff       	call   104ad20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x212136>
     1314bec:	48 89 c3             	mov    rbx,rax
     1314bef:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1314bf4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1314bf7:	48 85 ff             	test   rdi,rdi
     1314bfa:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     1314bff:	0f 85 86 00 00 00    	jne    1314c8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a20f>
     1314c05:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
     1314c0c:	00 
     1314c0d:	eb 0b                	jmp    1314c1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a19e>
     1314c0f:	4c 89 b4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r14
     1314c16:	00 
     1314c17:	4c 89 f3             	mov    rbx,r14
     1314c1a:	6a 30                	push   0x30
     1314c1c:	5f                   	pop    rdi
     1314c1d:	e8 de 92 4d 00       	call   17edf00 <_Znwm@plt>
     1314c22:	49 89 c7             	mov    r15,rax
     1314c25:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     1314c2a:	48 8d 42 20          	lea    rax,[rdx+0x20]
     1314c2e:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
     1314c33:	48 89 8c 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rcx
     1314c3a:	00 
     1314c3b:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     1314c3e:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
     1314c43:	c6 84 24 e0 00 00 00 	mov    BYTE PTR [rsp+0xe0],0x1
     1314c4a:	01 
     1314c4b:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1314c50:	4c 89 f6             	mov    rsi,r14
     1314c53:	49 89 d6             	mov    r14,rdx
     1314c56:	48 89 da             	mov    rdx,rbx
     1314c59:	4c 89 f9             	mov    rcx,r15

### 0x1314cea: mov    QWORD PTR [rsp+0xa8],r14
     1314cb3:	48 8d 84 24 98 00 00 	lea    rax,[rsp+0x98]
     1314cba:	00 
     1314cbb:	49 39 c6             	cmp    r14,rax
     1314cbe:	0f 85 a7 fd ff ff    	jne    1314a6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x159fef>
     1314cc4:	eb 31                	jmp    1314cf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a27b>
     1314cc6:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1314ccb:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     1314cd2:	00 
     1314cd3:	4c 89 e2             	mov    rdx,r12
     1314cd6:	4c 89 f9             	mov    rcx,r15
     1314cd9:	e8 42 60 d3 ff       	call   104ad20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x212136>
     1314cde:	48 89 c3             	mov    rbx,rax
     1314ce1:	e9 0e ff ff ff       	jmp    1314bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a178>
     1314ce6:	49 8d 5e 08          	lea    rbx,[r14+0x8]
     1314cea:	4c 89 b4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r14
     1314cf1:	00 
     1314cf2:	e9 23 ff ff ff       	jmp    1314c1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a19e>
     1314cf7:	0f 57 c0             	xorps  xmm0,xmm0
     1314cfa:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1314cff:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1314d04:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1314d07:	48 8b 9c 24 b0 00 00 	mov    rbx,QWORD PTR [rsp+0xb0]
     1314d0e:	00 
     1314d0f:	4c 8b bc 24 b8 00 00 	mov    r15,QWORD PTR [rsp+0xb8]
     1314d16:	00 
     1314d17:	4c 39 fb             	cmp    rbx,r15
     1314d1a:	0f 84 88 00 00 00    	je     1314da8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a32c>
     1314d20:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
     1314d25:	41 bd ff ff ff ff    	mov    r13d,0xffffffff
     1314d2b:	48 8d 2d 1e fb 54 00 	lea    rbp,[rip+0x54fb1e]        # 1864850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20f38>
     1314d32:	4c 8d b4 24 a8 00 00 	lea    r14,[rsp+0xa8]
     1314d39:	00 
     1314d3a:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     1314d3f:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     1314d46:	00 

### 0x1314d8d: mov    QWORD PTR [rsp+0xa8],rcx
     1314d54:	4c 89 a4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r12
     1314d5b:	00 
     1314d5c:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1314d61:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     1314d68:	00 
     1314d69:	4c 89 a4 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r12
     1314d70:	00 
     1314d71:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     1314d78:	00 
     1314d79:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
     1314d7c:	4c 39 e8             	cmp    rax,r13
     1314d7f:	0f 84 84 00 00 00    	je     1314e09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a38d>
     1314d85:	48 8d 8c 24 d0 00 00 	lea    rcx,[rsp+0xd0]
     1314d8c:	00 
     1314d8d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
     1314d94:	00 
     1314d95:	4c 89 f7             	mov    rdi,r14
     1314d98:	48 89 de             	mov    rsi,rbx
     1314d9b:	ff 54 c5 00          	call   QWORD PTR [rbp+rax*8+0x0]
     1314d9f:	48 83 c3 18          	add    rbx,0x18
     1314da3:	4c 39 fb             	cmp    rbx,r15
     1314da6:	75 92                	jne    1314d3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a2be>
     1314da8:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     1314dad:	e8 0e 98 7c ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1314db2:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     1314db7:	e8 04 98 7c ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1314dbc:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     1314dc3:	00 
     1314dc4:	e8 f7 97 7c ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1314dc9:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1314dd0:	00 
     1314dd1:	e8 26 a8 78 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
     1314dd6:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1314ddb:	e8 1c a8 78 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
     1314de0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x1316a0e: mov    QWORD PTR [rsp+0xa8],r14
     13169d8:	00 
     13169d9:	c6 84 24 68 07 00 00 	mov    BYTE PTR [rsp+0x768],0x0
     13169e0:	00 
     13169e1:	4d 69 e6 d0 02 00 00 	imul   r12,r14,0x2d0
     13169e8:	41 bd d0 02 00 00    	mov    r13d,0x2d0
     13169ee:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     13169f2:	4d 89 fe             	mov    r14,r15
     13169f5:	4c 89 f7             	mov    rdi,r14
     13169f8:	48 89 de             	mov    rsi,rbx
     13169fb:	e8 94 22 f0 ff       	call   1218c94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e218>
     1316a00:	4c 01 eb             	add    rbx,r13
     1316a03:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
     1316a0a:	00 
     1316a0b:	4d 01 ee             	add    r14,r13
     1316a0e:	4c 89 b4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r14
     1316a15:	00 
     1316a16:	49 81 c4 30 fd ff ff 	add    r12,0xfffffffffffffd30
     1316a1d:	75 d6                	jne    13169f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15bf79>
     1316a1f:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
     1316a26:	00 
     1316a27:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
     1316a2b:	e8 c2 33 f0 ff       	call   1219df2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f376>
     1316a30:	4c 89 74 24 78       	mov    QWORD PTR [rsp+0x78],r14
     1316a35:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     1316a3a:	48 8d bc 24 f0 0d 00 	lea    rdi,[rsp+0xdf0]
     1316a41:	00 
     1316a42:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
     1316a46:	e8 d3 e1 f0 ff       	call   1224c1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a1a2>
     1316a4b:	48 8d 9c 24 a0 14 00 	lea    rbx,[rsp+0x14a0]
     1316a52:	00 
     1316a53:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
     1316a5a:	00 
     1316a5b:	48 8d 54 24 70       	lea    rdx,[rsp+0x70]
     1316a60:	48 89 df             	mov    rdi,rbx
     1316a63:	e8 76 b9 fe ff       	call   13023de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x147962>

### 0x1317692: mov    BYTE PTR [rsi+0xa0],0x0
     1317659:	48 89 fb             	mov    rbx,rdi
     131765c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1317663:	00 00 
     1317665:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     131766c:	00 
     131766d:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     1317672:	4c 89 f7             	mov    rdi,r14
     1317675:	e8 dc 6d f8 ff       	call   129e456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe39da>
     131767a:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     1317681:	00 
     1317682:	4c 89 f6             	mov    rsi,r14
     1317685:	e8 12 b1 8f ff       	call   c1279c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15f73c>
     131768a:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
     1317691:	00 
     1317692:	c6 86 a0 00 00 00 00 	mov    BYTE PTR [rsi+0xa0],0x0
     1317699:	48 89 df             	mov    rdi,rbx
     131769c:	e8 1c 02 00 00       	call   13178bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ce41>
     13176a1:	49 89 c6             	mov    r14,rax
     13176a4:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     13176ab:	00 
     13176ac:	e8 b5 64 2a 00       	call   15bdb66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4030ea>
     13176b1:	4d 85 f6             	test   r14,r14
     13176b4:	74 08                	je     13176be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cc42>
     13176b6:	41 8b 2e             	mov    ebp,DWORD PTR [r14]
     13176b9:	e9 77 01 00 00       	jmp    1317835 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cdb9>
     13176be:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     13176c2:	e8 1f ac 2a 00       	call   15c22e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40786a>
     13176c7:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
     13176cb:	49 8b 77 68          	mov    rsi,QWORD PTR [r15+0x68]
     13176cf:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     13176d6:	00 
     13176d7:	e8 10 8e 36 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
     13176dc:	4c 8b b4 24 b8 00 00 	mov    r14,QWORD PTR [rsp+0xb8]
     13176e3:	00 
     13176e4:	4d 85 f6             	test   r14,r14

### 0x13179c6: mov    BYTE PTR [r15+0xa0],bpl
     1317993:	41 55                	push   r13
     1317995:	41 54                	push   r12
     1317997:	53                   	push   rbx
     1317998:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
     131799f:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx
     13179a3:	89 d5                	mov    ebp,edx
     13179a5:	49 89 fe             	mov    r14,rdi
     13179a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13179af:	00 00 
     13179b1:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     13179b8:	00 
     13179b9:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     13179be:	4c 89 ff             	mov    rdi,r15
     13179c1:	e8 d6 ad 8f ff       	call   c1279c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15f73c>
     13179c6:	41 88 af a0 00 00 00 	mov    BYTE PTR [r15+0xa0],bpl
     13179cd:	4c 89 ff             	mov    rdi,r15
     13179d0:	e8 b9 04 00 00       	call   1317e8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d412>
     13179d5:	49 89 c7             	mov    r15,rax
     13179d8:	49 8b 5e 08          	mov    rbx,QWORD PTR [r14+0x8]
     13179dc:	48 85 db             	test   rbx,rbx
     13179df:	74 14                	je     13179f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cf79>
     13179e1:	f3 4c 0f b8 eb       	popcnt r13,rbx
     13179e6:	49 83 fd 01          	cmp    r13,0x1
     13179ea:	77 0b                	ja     13179f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cf7b>
     13179ec:	4c 8d 63 ff          	lea    r12,[rbx-0x1]
     13179f0:	4d 21 fc             	and    r12,r15
     13179f3:	eb 15                	jmp    1317a0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cf8e>
     13179f5:	eb 78                	jmp    1317a6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cff3>
     13179f7:	4d 89 fc             	mov    r12,r15
     13179fa:	49 39 df             	cmp    r15,rbx
     13179fd:	72 0b                	jb     1317a0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cf8e>
     13179ff:	4c 89 f8             	mov    rax,r15
     1317a02:	31 d2                	xor    edx,edx
     1317a04:	48 f7 f3             	div    rbx
     1317a07:	49 89 d4             	mov    r12,rdx

### 0x1318269: mov    QWORD PTR [rsp+0xa8],rax
     1318244:	c3                   	ret
     1318245:	cc                   	int3
     1318246:	55                   	push   rbp
     1318247:	41 57                	push   r15
     1318249:	41 56                	push   r14
     131824b:	41 54                	push   r12
     131824d:	53                   	push   rbx
     131824e:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
     1318255:	48 89 cb             	mov    rbx,rcx
     1318258:	89 d5                	mov    ebp,edx
     131825a:	49 89 f6             	mov    r14,rsi
     131825d:	49 89 ff             	mov    r15,rdi
     1318260:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1318267:	00 00 
     1318269:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1318270:	00 
     1318271:	48 83 c7 50          	add    rdi,0x50
     1318275:	e8 6c a0 2a 00       	call   15c22e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40786a>
     131827a:	49 89 e4             	mov    r12,rsp
     131827d:	4c 89 e7             	mov    rdi,r12
     1318280:	4c 89 f6             	mov    rsi,r14
     1318283:	e8 14 a5 8f ff       	call   c1279c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15f73c>
     1318288:	41 88 ac 24 a0 00 00 	mov    BYTE PTR [r12+0xa0],bpl
     131828f:	00 
     1318290:	4c 89 ff             	mov    rdi,r15
     1318293:	4c 89 e6             	mov    rsi,r12
     1318296:	e8 22 f6 ff ff       	call   13178bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ce41>
     131829b:	49 89 c6             	mov    r14,rax
     131829e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13182a3:	e8 be 58 2a 00       	call   15bdb66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4030ea>
     13182a8:	4d 85 f6             	test   r14,r14
     13182ab:	74 05                	je     13182b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d836>
     13182ad:	41 8b 06             	mov    eax,DWORD PTR [r14]
     13182b0:	89 03                	mov    DWORD PTR [rbx],eax
     13182b2:	4d 85 f6             	test   r14,r14

### 0x1318288: mov    BYTE PTR [r12+0xa0],bpl
     1318255:	48 89 cb             	mov    rbx,rcx
     1318258:	89 d5                	mov    ebp,edx
     131825a:	49 89 f6             	mov    r14,rsi
     131825d:	49 89 ff             	mov    r15,rdi
     1318260:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1318267:	00 00 
     1318269:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1318270:	00 
     1318271:	48 83 c7 50          	add    rdi,0x50
     1318275:	e8 6c a0 2a 00       	call   15c22e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40786a>
     131827a:	49 89 e4             	mov    r12,rsp
     131827d:	4c 89 e7             	mov    rdi,r12
     1318280:	4c 89 f6             	mov    rsi,r14
     1318283:	e8 14 a5 8f ff       	call   c1279c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15f73c>
     1318288:	41 88 ac 24 a0 00 00 	mov    BYTE PTR [r12+0xa0],bpl
     131828f:	00 
     1318290:	4c 89 ff             	mov    rdi,r15
     1318293:	4c 89 e6             	mov    rsi,r12
     1318296:	e8 22 f6 ff ff       	call   13178bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ce41>
     131829b:	49 89 c6             	mov    r14,rax
     131829e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13182a3:	e8 be 58 2a 00       	call   15bdb66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4030ea>
     13182a8:	4d 85 f6             	test   r14,r14
     13182ab:	74 05                	je     13182b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d836>
     13182ad:	41 8b 06             	mov    eax,DWORD PTR [r14]
     13182b0:	89 03                	mov    DWORD PTR [rbx],eax
     13182b2:	4d 85 f6             	test   r14,r14
     13182b5:	0f 95 c0             	setne  al
     13182b8:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     13182bf:	00 00 
     13182c1:	48 3b 8c 24 a8 00 00 	cmp    rcx,QWORD PTR [rsp+0xa8]
     13182c8:	00 
     13182c9:	75 10                	jne    13182db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d85f>
     13182cb:	48 81 c4 b0 00 00 00 	add    rsp,0xb0
     13182d2:	5b                   	pop    rbx

### 0x1318bd7: mov    QWORD PTR [rsp+0xa0],rax
     1318ba8:	48 8b 87 18 02 00 00 	mov    rax,QWORD PTR [rdi+0x218]
     1318baf:	c3                   	ret
     1318bb0:	55                   	push   rbp
     1318bb1:	41 57                	push   r15
     1318bb3:	41 56                	push   r14
     1318bb5:	41 55                	push   r13
     1318bb7:	41 54                	push   r12
     1318bb9:	53                   	push   rbx
     1318bba:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     1318bc1:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     1318bc6:	49 89 f6             	mov    r14,rsi
     1318bc9:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     1318bce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1318bd5:	00 00 
     1318bd7:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     1318bde:	00 
     1318bdf:	48 8b be d8 00 00 00 	mov    rdi,QWORD PTR [rsi+0xd8]
     1318be6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1318be9:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1318bec:	48 85 c0             	test   rax,rax
     1318bef:	75 0e                	jne    1318bff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e183>
     1318bf1:	41 80 be b0 01 00 00 	cmp    BYTE PTR [r14+0x1b0],0x0
     1318bf8:	00 
     1318bf9:	75 04                	jne    1318bff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e183>
     1318bfb:	31 c0                	xor    eax,eax
     1318bfd:	eb 6b                	jmp    1318c6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e1ee>
     1318bff:	49 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [r14+0xb8]
     1318c06:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1318c0b:	4d 8b a6 c0 00 00 00 	mov    r12,QWORD PTR [r14+0xc0]
     1318c12:	4d 8b ae d0 00 00 00 	mov    r13,QWORD PTR [r14+0xd0]
     1318c19:	49 8d ae 10 01 00 00 	lea    rbp,[r14+0x110]
     1318c20:	49 8b be c8 00 00 00 	mov    rdi,QWORD PTR [r14+0xc8]
     1318c27:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1318c2a:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1318c2d:	89 c3                	mov    ebx,eax

### 0x13198d3: movups XMMWORD PTR [r14+0xa0],xmm0
     1319893:	0f 84 5a 03 00 00    	je     1319bf3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f177>
     1319899:	41 8b 54 24 08       	mov    edx,DWORD PTR [r12+0x8]
     131989e:	4d 8b 64 24 10       	mov    r12,QWORD PTR [r12+0x10]
     13198a3:	e9 50 03 00 00       	jmp    1319bf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f17c>
     13198a8:	bf f8 00 00 00       	mov    edi,0xf8
     13198ad:	e8 4e 46 4d 00       	call   17edf00 <_Znwm@plt>
     13198b2:	49 89 c6             	mov    r14,rax
     13198b5:	48 8d 05 94 b3 54 00 	lea    rax,[rip+0x54b394]        # 1864c50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21338>
     13198bc:	49 89 06             	mov    QWORD PTR [r14],rax
     13198bf:	49 8d 7e 08          	lea    rdi,[r14+0x8]
     13198c3:	e8 cc 05 00 00       	call   1319e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f418>
     13198c8:	41 83 a6 d8 00 00 00 	and    DWORD PTR [r14+0xd8],0x0
     13198cf:	00 
     13198d0:	0f 57 c0             	xorps  xmm0,xmm0
     13198d3:	41 0f 11 86 a0 00 00 	movups XMMWORD PTR [r14+0xa0],xmm0
     13198da:	00 
     13198db:	41 0f 11 86 b0 00 00 	movups XMMWORD PTR [r14+0xb0],xmm0
     13198e2:	00 
     13198e3:	41 0f 11 86 c0 00 00 	movups XMMWORD PTR [r14+0xc0],xmm0
     13198ea:	00 
     13198eb:	48 8b bb b0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb0]
     13198f2:	4c 89 b3 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],r14
     13198f9:	48 85 ff             	test   rdi,rdi
     13198fc:	0f 84 30 04 00 00    	je     1319d32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f2b6>
     1319902:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1319905:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1319908:	e9 9b fe ff ff       	jmp    13197a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ed2c>
     131990d:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     1319912:	4c 89 f7             	mov    rdi,r14
     1319915:	e8 34 ec 84 ff       	call   b6854e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54ee>
     131991a:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     131991e:	48 8b 73 78          	mov    rsi,QWORD PTR [rbx+0x78]
     1319922:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1319926:	4c 89 f2             	mov    rdx,r14
     1319929:	e8 10 3d 90 ff       	call   c1d63e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a5de>

### 0x131a088: mov    QWORD PTR [rsp+0xa0],rax
     131a05a:	e9 99 98 3b 00       	jmp    16d38f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87a64>
     131a05f:	cc                   	int3
     131a060:	53                   	push   rbx
     131a061:	48 89 fb             	mov    rbx,rdi
     131a064:	e8 ab ff ff ff       	call   131a014 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f598>
     131a069:	48 89 df             	mov    rdi,rbx
     131a06c:	5b                   	pop    rbx
     131a06d:	e9 ae 3e 4d 00       	jmp    17edf20 <_ZdlPv@plt>
     131a072:	41 56                	push   r14
     131a074:	53                   	push   rbx
     131a075:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     131a07c:	48 89 f3             	mov    rbx,rsi
     131a07f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131a086:	00 00 
     131a088:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     131a08f:	00 
     131a090:	48 8d 77 08          	lea    rsi,[rdi+0x8]
     131a094:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     131a099:	4c 89 f7             	mov    rdi,r14
     131a09c:	e8 d1 e5 84 ff       	call   b68672 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5612>
     131a0a1:	48 89 df             	mov    rdi,rbx
     131a0a4:	4c 89 f6             	mov    rsi,r14
     131a0a7:	e8 54 8b e8 ff       	call   11a2c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a016>
     131a0ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131a0b3:	00 00 
     131a0b5:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     131a0bc:	00 
     131a0bd:	75 0d                	jne    131a0cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f650>
     131a0bf:	b0 01                	mov    al,0x1
     131a0c1:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
     131a0c8:	5b                   	pop    rbx
     131a0c9:	41 5e                	pop    r14
     131a0cb:	c3                   	ret
     131a0cc:	e8 df 59 4d 00       	call   17efab0 <__stack_chk_fail@plt>
     131a0d1:	cc                   	int3

### 0x131a0e8: mov    QWORD PTR [rsp+0xa0],rax
     131a0bd:	75 0d                	jne    131a0cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f650>
     131a0bf:	b0 01                	mov    al,0x1
     131a0c1:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
     131a0c8:	5b                   	pop    rbx
     131a0c9:	41 5e                	pop    r14
     131a0cb:	c3                   	ret
     131a0cc:	e8 df 59 4d 00       	call   17efab0 <__stack_chk_fail@plt>
     131a0d1:	cc                   	int3
     131a0d2:	41 56                	push   r14
     131a0d4:	53                   	push   rbx
     131a0d5:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     131a0dc:	48 89 f3             	mov    rbx,rsi
     131a0df:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131a0e6:	00 00 
     131a0e8:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     131a0ef:	00 
     131a0f0:	48 8d 77 08          	lea    rsi,[rdi+0x8]
     131a0f4:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     131a0f9:	4c 89 f7             	mov    rdi,r14
     131a0fc:	e8 71 e5 84 ff       	call   b68672 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5612>
     131a101:	48 89 df             	mov    rdi,rbx
     131a104:	4c 89 f6             	mov    rsi,r14
     131a107:	e8 74 8b e8 ff       	call   11a2c80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a096>
     131a10c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131a113:	00 00 
     131a115:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     131a11c:	00 
     131a11d:	75 0d                	jne    131a12c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f6b0>
     131a11f:	b0 01                	mov    al,0x1
     131a121:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
     131a128:	5b                   	pop    rbx
     131a129:	41 5e                	pop    r14
     131a12b:	c3                   	ret
     131a12c:	e8 7f 59 4d 00       	call   17efab0 <__stack_chk_fail@plt>
     131a131:	cc                   	int3

### 0x131fdd2: mov    QWORD PTR [rax+0xa8],rdi
     131fd98:	48 89 c6             	mov    rsi,rax
     131fd9b:	e8 a0 e1 4c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     131fda0:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     131fda4:	80 48 10 40          	or     BYTE PTR [rax+0x10],0x40
     131fda8:	48 8b b8 a8 00 00 00 	mov    rdi,QWORD PTR [rax+0xa8]
     131fdaf:	48 85 ff             	test   rdi,rdi
     131fdb2:	75 25                	jne    131fdd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16535d>
     131fdb4:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     131fdb8:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     131fdbc:	40 f6 c7 01          	test   dil,0x1
     131fdc0:	0f 85 1a 11 00 00    	jne    1320ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166464>
     131fdc6:	e8 2b d5 f9 ff       	call   12bd2f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10287a>
     131fdcb:	48 89 c7             	mov    rdi,rax
     131fdce:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     131fdd2:	48 89 b8 a8 00 00 00 	mov    QWORD PTR [rax+0xa8],rdi
     131fdd9:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
     131fddd:	48 85 c9             	test   rcx,rcx
     131fde0:	48 0f 44 cd          	cmove  rcx,rbp
     131fde4:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     131fdeb:	00 
     131fdec:	4c 89 ea             	mov    rdx,r13
     131fdef:	e8 16 fc ff ff       	call   131fa0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164f8e>
     131fdf4:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     131fdfb:	00 
     131fdfc:	e8 8f e0 4c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131fe01:	49 8b 7e 58          	mov    rdi,QWORD PTR [r14+0x58]
     131fe05:	48 85 ff             	test   rdi,rdi
     131fe08:	48 0f 44 fd          	cmove  rdi,rbp
     131fe0c:	e8 8e d3 02 00       	call   134d19f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192723>
     131fe11:	84 c0                	test   al,al
     131fe13:	75 6d                	jne    131fe82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165406>
     131fe15:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     131fe18:	48 89 df             	mov    rdi,rbx
     131fe1b:	ff 50 48             	call   QWORD PTR [rax+0x48]
     131fe1e:	48 85 c0             	test   rax,rax

### 0x1322b8c: mov    QWORD PTR [rsp+0xa0],r12
     1322b5b:	31 d2                	xor    edx,edx
     1322b5d:	49 f7 f7             	div    r15
     1322b60:	48 89 d5             	mov    rbp,rdx
     1322b63:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
     1322b6a:	00 
     1322b6b:	48 8b 04 e9          	mov    rax,QWORD PTR [rcx+rbp*8]
     1322b6f:	48 85 c0             	test   rax,rax
     1322b72:	74 0c                	je     1322b80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168104>
     1322b74:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1322b77:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
     1322b7b:	e9 ce 00 00 00       	jmp    1322c4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681d2>
     1322b80:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     1322b87:	00 
     1322b88:	49 89 04 24          	mov    QWORD PTR [r12],rax
     1322b8c:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     1322b93:	00 
     1322b94:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
     1322b9b:	00 
     1322b9c:	48 89 04 e9          	mov    QWORD PTR [rcx+rbp*8],rax
     1322ba0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1322ba4:	48 85 c0             	test   rax,rax
     1322ba7:	0f 84 a4 00 00 00    	je     1322c51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681d5>
     1322bad:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1322bb1:	49 8d 4f ff          	lea    rcx,[r15-0x1]
     1322bb5:	49 85 cf             	test   r15,rcx
     1322bb8:	75 7b                	jne    1322c35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681b9>
     1322bba:	48 21 c8             	and    rax,rcx
     1322bbd:	e9 80 00 00 00       	jmp    1322c42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681c6>
     1322bc2:	4c 39 fd             	cmp    rbp,r15
     1322bc5:	72 0b                	jb     1322bd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168156>
     1322bc7:	48 89 e8             	mov    rax,rbp
     1322bca:	31 d2                	xor    edx,edx
     1322bcc:	49 f7 f7             	div    r15
     1322bcf:	48 89 d5             	mov    rbp,rdx
     1322bd2:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]

### 0x13251fa: mov    QWORD PTR [rsp+0xa0],rax
     13251c0:	e8 e7 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     13251c5:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     13251ca:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     13251cf:	4c 89 f7             	mov    rdi,r14
     13251d2:	e8 27 d5 86 ff       	call   b926fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf69e>
     13251d7:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
     13251dc:	40 88 6c 24 40       	mov    BYTE PTR [rsp+0x40],bpl
     13251e1:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
     13251e6:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
     13251ed:	00 00 
     13251ef:	6a 48                	push   0x48
     13251f1:	5f                   	pop    rdi
     13251f2:	e8 09 8d 4c 00       	call   17edf00 <_Znwm@plt>
     13251f7:	48 89 c5             	mov    rbp,rax
     13251fa:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     1325201:	00 
     1325202:	48 8d 84 24 bf 00 00 	lea    rax,[rsp+0xbf]
     1325209:	00 
     132520a:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1325211:	00 
     1325212:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0x1
     1325219:	00 01 00 00 00 
     132521e:	48 8d 05 33 09 54 00 	lea    rax,[rip+0x540933]        # 1865b58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22240>
     1325225:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1325229:	4c 8d 6d 08          	lea    r13,[rbp+0x8]
     132522d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     1325232:	4c 89 ef             	mov    rdi,r13
     1325235:	e8 72 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     132523a:	48 89 ef             	mov    rdi,rbp
     132523d:	48 83 c7 18          	add    rdi,0x18
     1325241:	4c 89 f6             	mov    rsi,r14
     1325244:	e8 63 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     1325249:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     132524e:	0f 10 40 f0          	movups xmm0,XMMWORD PTR [rax-0x10]
     1325252:	0f 11 45 28          	movups XMMWORD PTR [rbp+0x28],xmm0

### 0x132520a: mov    QWORD PTR [rsp+0xa8],rax
     13251d2:	e8 27 d5 86 ff       	call   b926fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf69e>
     13251d7:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
     13251dc:	40 88 6c 24 40       	mov    BYTE PTR [rsp+0x40],bpl
     13251e1:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
     13251e6:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
     13251ed:	00 00 
     13251ef:	6a 48                	push   0x48
     13251f1:	5f                   	pop    rdi
     13251f2:	e8 09 8d 4c 00       	call   17edf00 <_Znwm@plt>
     13251f7:	48 89 c5             	mov    rbp,rax
     13251fa:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     1325201:	00 
     1325202:	48 8d 84 24 bf 00 00 	lea    rax,[rsp+0xbf]
     1325209:	00 
     132520a:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1325211:	00 
     1325212:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0x1
     1325219:	00 01 00 00 00 
     132521e:	48 8d 05 33 09 54 00 	lea    rax,[rip+0x540933]        # 1865b58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22240>
     1325225:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1325229:	4c 8d 6d 08          	lea    r13,[rbp+0x8]
     132522d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     1325232:	4c 89 ef             	mov    rdi,r13
     1325235:	e8 72 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     132523a:	48 89 ef             	mov    rdi,rbp
     132523d:	48 83 c7 18          	add    rdi,0x18
     1325241:	4c 89 f6             	mov    rsi,r14
     1325244:	e8 63 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     1325249:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     132524e:	0f 10 40 f0          	movups xmm0,XMMWORD PTR [rax-0x10]
     1325252:	0f 11 45 28          	movups XMMWORD PTR [rbp+0x28],xmm0
     1325256:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     132525d:	00 
     132525e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1325262:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]

### 0x132fc9c: mov    QWORD PTR [rbx+0xa0],rax
     132fc53:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     132fc57:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
     132fc5e:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
     132fc62:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
     132fc69:	41 0f 11 47 18       	movups XMMWORD PTR [r15+0x18],xmm0
     132fc6e:	49 83 67 28 00       	and    QWORD PTR [r15+0x28],0x0
     132fc73:	0f 29 83 90 00 00 00 	movaps XMMWORD PTR [rbx+0x90],xmm0
     132fc7a:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
     132fc81:	00 
     132fc82:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
     132fc86:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
     132fc8d:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
     132fc91:	48 89 83 98 00 00 00 	mov    QWORD PTR [rbx+0x98],rax
     132fc98:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
     132fc9c:	48 89 83 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rax
     132fca3:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
     132fca8:	41 0f 29 47 30       	movaps XMMWORD PTR [r15+0x30],xmm0
     132fcad:	41 8a 47 50          	mov    al,BYTE PTR [r15+0x50]
     132fcb1:	88 83 b0 00 00 00    	mov    BYTE PTR [rbx+0xb0],al
     132fcb7:	49 8b 47 48          	mov    rax,QWORD PTR [r15+0x48]
     132fcbb:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     132fcc2:	48 83 a3 c8 00 00 00 	and    QWORD PTR [rbx+0xc8],0x0
     132fcc9:	00 
     132fcca:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
     132fcd1:	49 8b 47 58          	mov    rax,QWORD PTR [r15+0x58]
     132fcd5:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     132fcdc:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
     132fce0:	48 89 83 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],rax
     132fce7:	49 8b 47 68          	mov    rax,QWORD PTR [r15+0x68]
     132fceb:	48 89 83 c8 00 00 00 	mov    QWORD PTR [rbx+0xc8],rax
     132fcf2:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
     132fcf7:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
     132fcfc:	41 8a 47 70          	mov    al,BYTE PTR [r15+0x70]
     132fd00:	88 83 d0 00 00 00    	mov    BYTE PTR [rbx+0xd0],al
     132fd06:	49 8b 87 88 00 00 00 	mov    rax,QWORD PTR [r15+0x88]

### 0x132fcbb: mov    QWORD PTR [rbx+0xa8],rax
     132fc73:	0f 29 83 90 00 00 00 	movaps XMMWORD PTR [rbx+0x90],xmm0
     132fc7a:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
     132fc81:	00 
     132fc82:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
     132fc86:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
     132fc8d:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
     132fc91:	48 89 83 98 00 00 00 	mov    QWORD PTR [rbx+0x98],rax
     132fc98:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
     132fc9c:	48 89 83 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rax
     132fca3:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
     132fca8:	41 0f 29 47 30       	movaps XMMWORD PTR [r15+0x30],xmm0
     132fcad:	41 8a 47 50          	mov    al,BYTE PTR [r15+0x50]
     132fcb1:	88 83 b0 00 00 00    	mov    BYTE PTR [rbx+0xb0],al
     132fcb7:	49 8b 47 48          	mov    rax,QWORD PTR [r15+0x48]
     132fcbb:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     132fcc2:	48 83 a3 c8 00 00 00 	and    QWORD PTR [rbx+0xc8],0x0
     132fcc9:	00 
     132fcca:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
     132fcd1:	49 8b 47 58          	mov    rax,QWORD PTR [r15+0x58]
     132fcd5:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     132fcdc:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
     132fce0:	48 89 83 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],rax
     132fce7:	49 8b 47 68          	mov    rax,QWORD PTR [r15+0x68]
     132fceb:	48 89 83 c8 00 00 00 	mov    QWORD PTR [rbx+0xc8],rax
     132fcf2:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
     132fcf7:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
     132fcfc:	41 8a 47 70          	mov    al,BYTE PTR [r15+0x70]
     132fd00:	88 83 d0 00 00 00    	mov    BYTE PTR [rbx+0xd0],al
     132fd06:	49 8b 87 88 00 00 00 	mov    rax,QWORD PTR [r15+0x88]
     132fd0d:	48 89 83 e8 00 00 00 	mov    QWORD PTR [rbx+0xe8],rax
     132fd14:	41 0f 10 4f 78       	movups xmm1,XMMWORD PTR [r15+0x78]
     132fd19:	0f 11 8b d8 00 00 00 	movups XMMWORD PTR [rbx+0xd8],xmm1
     132fd20:	49 83 a7 88 00 00 00 	and    QWORD PTR [r15+0x88],0x0
     132fd27:	00 
     132fd28:	41 0f 11 47 78       	movups XMMWORD PTR [r15+0x78],xmm0

### 0x1331d2b: mov    QWORD PTR [rsp+0xa8],rax
     1331ced:	e8 3c 9d 74 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1331cf2:	4c 89 f7             	mov    rdi,r14
     1331cf5:	e8 6a 47 ff ff       	call   1326464 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b9e8>
     1331cfa:	48 89 df             	mov    rdi,rbx
     1331cfd:	e8 8e c1 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1331d02:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     1331d06:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1331d0b:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
     1331d0f:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1331d14:	4c 8b 65 30          	mov    r12,QWORD PTR [rbp+0x30]
     1331d18:	f3 0f 6f 45 38       	movdqu xmm0,XMMWORD PTR [rbp+0x38]
     1331d1d:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     1331d23:	48 8b 5d 50          	mov    rbx,QWORD PTR [rbp+0x50]
     1331d27:	48 8b 45 70          	mov    rax,QWORD PTR [rbp+0x70]
     1331d2b:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1331d32:	00 
     1331d33:	4c 8b 7d 78          	mov    r15,QWORD PTR [rbp+0x78]
     1331d37:	bf e0 02 00 00       	mov    edi,0x2e0
     1331d3c:	e8 bf c1 4b 00       	call   17edf00 <_Znwm@plt>
     1331d41:	48 89 c5             	mov    rbp,rax
     1331d44:	49 83 c5 58          	add    r13,0x58
     1331d48:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1331d4f:	00 
     1331d50:	4c 89 ee             	mov    rsi,r13
     1331d53:	e8 88 a2 9d ff       	call   d0bfe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258f80>
     1331d58:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
     1331d5f:	00 
     1331d60:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
     1331d67:	00 
     1331d68:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
     1331d6f:	00 
     1331d70:	48 85 c0             	test   rax,rax
     1331d73:	74 05                	je     1331d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1772fe>
     1331d75:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1331d7a:	48 83 a4 24 f8 00 00 	and    QWORD PTR [rsp+0xf8],0x0

### 0x1331eda: mov    QWORD PTR [rsp+0xa0],rbx
     1331e9f:	48 89 da             	mov    rdx,rbx
     1331ea2:	e8 f1 de 00 00       	call   133fd98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18531c>
     1331ea7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     1331eae:	00 
     1331eaf:	e8 74 cf d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
     1331eb4:	48 8d 85 18 02 00 00 	lea    rax,[rbp+0x218]
     1331ebb:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1331ec0:	48 83 a5 18 02 00 00 	and    QWORD PTR [rbp+0x218],0x0
     1331ec7:	00 
     1331ec8:	48 8d bd 20 02 00 00 	lea    rdi,[rbp+0x220]
     1331ecf:	6a 01                	push   0x1
     1331ed1:	59                   	pop    rcx
     1331ed2:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     1331ed9:	00 
     1331eda:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     1331ee1:	00 
     1331ee2:	48 89 de             	mov    rsi,rbx
     1331ee5:	89 ca                	mov    edx,ecx
     1331ee7:	41 89 c8             	mov    r8d,ecx
     1331eea:	4c 8b 4c 24 40       	mov    r9,QWORD PTR [rsp+0x40]
     1331eef:	e8 90 9f f9 ff       	call   12cbe84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x111408>
     1331ef4:	83 a5 30 02 00 00 00 	and    DWORD PTR [rbp+0x230],0x0
     1331efb:	66 83 a5 34 02 00 00 	and    WORD PTR [rbp+0x234],0x0
     1331f02:	00 
     1331f03:	4c 8b bd 38 01 00 00 	mov    r15,QWORD PTR [rbp+0x138]
     1331f0a:	48 8b 9d 40 01 00 00 	mov    rbx,QWORD PTR [rbp+0x140]
     1331f11:	4c 29 fb             	sub    rbx,r15
     1331f14:	0f 84 a7 00 00 00    	je     1331fc1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177545>
     1331f1a:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
     1331f1f:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
     1331f24:	4c 8d 25 1e 5f 01 ff 	lea    r12,[rip+0xffffffffff015f1e]        # 347e49 <_ZTSSt12bad_any_cast@@Base-0x4837f>
     1331f2b:	4c 8d 2d 68 98 04 ff 	lea    r13,[rip+0xffffffffff049868]        # 37b79a <_ZTSSt12bad_any_cast@@Base-0x14a2e>
     1331f32:	48 8d 2d 2c ac ff fe 	lea    rbp,[rip+0xfffffffffeffac2c]        # 32cb65 <_ZTSSt12bad_any_cast@@Base-0x63663>
     1331f39:	4c 8d 35 4b 26 03 ff 	lea    r14,[rip+0xffffffffff03264b]        # 36458b <_ZTSSt12bad_any_cast@@Base-0x2bc3d>
     1331f40:	4c 89 ff             	mov    rdi,r15

### 0x13336ef: mov    QWORD PTR [rsp+0xa8],rdi
     13336ab:	00 
     13336ac:	48 8d bb 58 04 00 00 	lea    rdi,[rbx+0x458]
     13336b3:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
     13336ba:	00 
     13336bb:	e8 36 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336c0:	48 8d bb 68 04 00 00 	lea    rdi,[rbx+0x468]
     13336c7:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
     13336ce:	00 
     13336cf:	e8 22 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336d4:	48 8d bb 78 04 00 00 	lea    rdi,[rbx+0x478]
     13336db:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
     13336e2:	00 
     13336e3:	e8 0e 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336e8:	48 8d bb 88 04 00 00 	lea    rdi,[rbx+0x488]
     13336ef:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
     13336f6:	00 
     13336f7:	e8 fa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336fc:	48 8d bb 98 04 00 00 	lea    rdi,[rbx+0x498]
     1333703:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     133370a:	00 
     133370b:	e8 e6 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333710:	48 8d bb a8 04 00 00 	lea    rdi,[rbx+0x4a8]
     1333717:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     133371e:	00 
     133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
     133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     1333732:	00 
     1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
     133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     1333746:	00 
     1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
     1333753:	00 

### 0x133373f: mov    QWORD PTR [rsp+0xa0],rdi
     13336f7:	e8 fa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336fc:	48 8d bb 98 04 00 00 	lea    rdi,[rbx+0x498]
     1333703:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     133370a:	00 
     133370b:	e8 e6 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333710:	48 8d bb a8 04 00 00 	lea    rdi,[rbx+0x4a8]
     1333717:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     133371e:	00 
     133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
     133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     1333732:	00 
     1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
     133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     1333746:	00 
     1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
     1333753:	00 
     1333754:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
     133375b:	00 
     133375c:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
     1333763:	00 
     1333764:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
     133376b:	00 
     133376c:	31 c0                	xor    eax,eax
     133376e:	88 83 18 05 00 00    	mov    BYTE PTR [rbx+0x518],al
     1333774:	88 83 38 05 00 00    	mov    BYTE PTR [rbx+0x538],al
     133377a:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
     1333780:	88 83 60 05 00 00    	mov    BYTE PTR [rbx+0x560],al
     1333786:	0f 57 c0             	xorps  xmm0,xmm0
     1333789:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
     1333790:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
     1333797:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
     133379e:	c7 83 98 05 00 00 00 	mov    DWORD PTR [rbx+0x598],0x3f800000

### 0x13350db: movups XMMWORD PTR [r13+0xa0],xmm0
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

### 0x133627f: mov    QWORD PTR [rsp+0xa0],rax
     1336256:	5b                   	pop    rbx
     1336257:	e9 c4 7c 4b 00       	jmp    17edf20 <_ZdlPv@plt>
     133625c:	55                   	push   rbp
     133625d:	41 57                	push   r15
     133625f:	41 56                	push   r14
     1336261:	41 55                	push   r13
     1336263:	41 54                	push   r12
     1336265:	53                   	push   rbx
     1336266:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     133626d:	49 89 d6             	mov    r14,rdx
     1336270:	49 89 f7             	mov    r15,rsi
     1336273:	48 89 fd             	mov    rbp,rdi
     1336276:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133627d:	00 00 
     133627f:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     1336286:	00 
     1336287:	80 ba 50 01 00 00 00 	cmp    BYTE PTR [rdx+0x150],0x0
     133628e:	0f 84 c1 00 00 00    	je     1336355 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b8d9>
     1336294:	48 89 2c 24          	mov    QWORD PTR [rsp],rbp
     1336298:	4d 8b a7 d8 00 00 00 	mov    r12,QWORD PTR [r15+0xd8]
     133629f:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
     13362a4:	49 8b 5c 24 40       	mov    rbx,QWORD PTR [r12+0x40]
     13362a9:	48 85 db             	test   rbx,rbx
     13362ac:	74 52                	je     1336300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b884>
     13362ae:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
     13362b5:	00 
     13362b6:	48 8d 6c 24 60       	lea    rbp,[rsp+0x60]
     13362bb:	48 8d b3 00 02 00 00 	lea    rsi,[rbx+0x200]
     13362c2:	4c 89 ef             	mov    rdi,r13
     13362c5:	e8 66 50 77 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     13362ca:	48 8b 94 24 80 00 00 	mov    rdx,QWORD PTR [rsp+0x80]
     13362d1:	00 
     13362d2:	48 85 d2             	test   rdx,rdx
     13362d5:	74 14                	je     13362eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b86f>
     13362d7:	48 8d 73 10          	lea    rsi,[rbx+0x10]

### 0x133798a: movups XMMWORD PTR [rdi+0xa0],xmm0
     133794f:	cc                   	int3
     1337950:	48 8d 05 51 e5 52 00 	lea    rax,[rip+0x52e551]        # 1865ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22590>
     1337957:	48 89 07             	mov    QWORD PTR [rdi],rax
     133795a:	48 83 67 60 00       	and    QWORD PTR [rdi+0x60],0x0
     133795f:	48 83 67 70 00       	and    QWORD PTR [rdi+0x70],0x0
     1337964:	48 83 a7 80 00 00 00 	and    QWORD PTR [rdi+0x80],0x0
     133796b:	00 
     133796c:	0f 57 c0             	xorps  xmm0,xmm0
     133796f:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     1337973:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     1337977:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
     133797b:	0f 11 47 38          	movups XMMWORD PTR [rdi+0x38],xmm0
     133797f:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
     1337983:	0f 11 87 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm0
     133798a:	0f 11 87 a0 00 00 00 	movups XMMWORD PTR [rdi+0xa0],xmm0
     1337991:	c6 87 b0 00 00 00 01 	mov    BYTE PTR [rdi+0xb0],0x1
     1337998:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
     133799f:	e9 ea 08 7f ff       	jmp    b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     13379a4:	55                   	push   rbp
     13379a5:	41 57                	push   r15
     13379a7:	41 56                	push   r14
     13379a9:	41 55                	push   r13
     13379ab:	41 54                	push   r12
     13379ad:	53                   	push   rbx
     13379ae:	48 83 ec 18          	sub    rsp,0x18
     13379b2:	45 89 ce             	mov    r14d,r9d
     13379b5:	45 89 c5             	mov    r13d,r8d
     13379b8:	89 cd                	mov    ebp,ecx
     13379ba:	49 89 d7             	mov    r15,rdx
     13379bd:	49 89 f4             	mov    r12,rsi
     13379c0:	48 89 fb             	mov    rbx,rdi
     13379c3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13379ca:	00 00 
     13379cc:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     13379d1:	0f 57 c0             	xorps  xmm0,xmm0

### 0x13391c9: mov    QWORD PTR [rsp+0xa0],rcx
     1339194:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
     1339198:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
     133919c:	48 6b d2 18          	imul   rdx,rdx,0x18
     13391a0:	48 01 c2             	add    rdx,rax
     13391a3:	48 89 11             	mov    QWORD PTR [rcx],rdx
     13391a6:	48 8d 94 24 08 02 00 	lea    rdx,[rsp+0x208]
     13391ad:	00 
     13391ae:	48 89 02             	mov    QWORD PTR [rdx],rax
     13391b1:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     13391b8:	00 
     13391b9:	48 89 94 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdx
     13391c0:	00 
     13391c1:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
     13391c8:	00 
     13391c9:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     13391d0:	00 
     13391d1:	49 6b cf 18          	imul   rcx,r15,0x18
     13391d5:	31 ff                	xor    edi,edi
     13391d7:	48 8d 15 02 d7 52 00 	lea    rdx,[rip+0x52d702]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
     13391de:	48 89 fe             	mov    rsi,rdi
     13391e1:	48 89 14 38          	mov    QWORD PTR [rax+rdi*1],rdx
     13391e5:	49 8b 7c 3e 08       	mov    rdi,QWORD PTR [r14+rdi*1+0x8]
     13391ea:	48 89 7c 30 08       	mov    QWORD PTR [rax+rsi*1+0x8],rdi
     13391ef:	49 8b 7c 36 10       	mov    rdi,QWORD PTR [r14+rsi*1+0x10]
     13391f4:	48 89 7c 30 10       	mov    QWORD PTR [rax+rsi*1+0x10],rdi
     13391f9:	48 85 ff             	test   rdi,rdi
     13391fc:	74 05                	je     1339203 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e787>
     13391fe:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
     1339203:	48 8d 7e 18          	lea    rdi,[rsi+0x18]
     1339207:	48 39 f9             	cmp    rcx,rdi
     133920a:	75 d2                	jne    13391de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e762>
     133920c:	4c 8d 34 30          	lea    r14,[rax+rsi*1]
     1339210:	49 83 c6 18          	add    r14,0x18
     1339214:	4c 89 b4 24 20 02 00 	mov    QWORD PTR [rsp+0x220],r14
     133921b:	00 

### 0x13394b7: mov    QWORD PTR [r15+0xa0],rax
     1339466:	48 8d 8b d8 04 00 00 	lea    rcx,[rbx+0x4d8]
     133946d:	49 89 4f 68          	mov    QWORD PTR [r15+0x68],rcx
     1339471:	48 8d 8b f8 04 00 00 	lea    rcx,[rbx+0x4f8]
     1339478:	49 89 4f 70          	mov    QWORD PTR [r15+0x70],rcx
     133947c:	4d 89 57 78          	mov    QWORD PTR [r15+0x78],r10
     1339480:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
     1339487:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     133948e:	00 
     133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
     1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
     133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
     13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
     13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
     13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
     13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
     13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
     13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]
     13394da:	0f 11 84 24 0c 02 00 	movups XMMWORD PTR [rsp+0x20c],xmm0
     13394e1:	00 
     13394e2:	f2 41 0f 10 07       	movsd  xmm0,QWORD PTR [r15]
     13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     13394ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13394ef:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     13394f5:	48 85 c0             	test   rax,rax
     13394f8:	74 06                	je     1339500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea84>
     13394fa:	44 8a 68 5b          	mov    r13b,BYTE PTR [rax+0x5b]
     13394fe:	eb 03                	jmp    1339503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea87>
     1339500:	45 31 ed             	xor    r13d,r13d
     1339503:	44 8a bc 24 d0 00 00 	mov    r15b,BYTE PTR [rsp+0xd0]
     133950a:	00 
     133950b:	48 8b ac 24 c8 00 00 	mov    rbp,QWORD PTR [rsp+0xc8]
     1339512:	00 

### 0x13394c3: mov    QWORD PTR [r15+0xa8],rax
     1339471:	48 8d 8b f8 04 00 00 	lea    rcx,[rbx+0x4f8]
     1339478:	49 89 4f 70          	mov    QWORD PTR [r15+0x70],rcx
     133947c:	4d 89 57 78          	mov    QWORD PTR [r15+0x78],r10
     1339480:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
     1339487:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     133948e:	00 
     133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
     1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
     133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
     13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
     13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
     13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
     13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
     13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
     13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]
     13394da:	0f 11 84 24 0c 02 00 	movups XMMWORD PTR [rsp+0x20c],xmm0
     13394e1:	00 
     13394e2:	f2 41 0f 10 07       	movsd  xmm0,QWORD PTR [r15]
     13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     13394ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13394ef:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     13394f5:	48 85 c0             	test   rax,rax
     13394f8:	74 06                	je     1339500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea84>
     13394fa:	44 8a 68 5b          	mov    r13b,BYTE PTR [rax+0x5b]
     13394fe:	eb 03                	jmp    1339503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea87>
     1339500:	45 31 ed             	xor    r13d,r13d
     1339503:	44 8a bc 24 d0 00 00 	mov    r15b,BYTE PTR [rsp+0xd0]
     133950a:	00 
     133950b:	48 8b ac 24 c8 00 00 	mov    rbp,QWORD PTR [rsp+0xc8]
     1339512:	00 
     1339513:	4c 8b a4 24 d8 00 00 	mov    r12,QWORD PTR [rsp+0xd8]
     133951a:	00 

### 0x133aa52: mov    BYTE PTR [rbx+0xa8],al
     133aa1b:	31 c0                	xor    eax,eax
     133aa1d:	88 07                	mov    BYTE PTR [rdi],al
     133aa1f:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
     133aa24:	49 89 cd             	mov    r13,rcx
     133aa27:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
     133aa2c:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
     133aa31:	48 89 f7             	mov    rdi,rsi
     133aa34:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
     133aa39:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
     133aa3e:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
     133aa43:	44 8a b4 24 90 00 00 	mov    r14b,BYTE PTR [rsp+0x90]
     133aa4a:	00 
     133aa4b:	4c 8d 53 28          	lea    r10,[rbx+0x28]
     133aa4f:	88 43 68             	mov    BYTE PTR [rbx+0x68],al
     133aa52:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
     133aa58:	48 83 ec 08          	sub    rsp,0x8
     133aa5c:	45 0f b6 ce          	movzx  r9d,r14b
     133aa60:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     133aa65:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
     133aa6a:	48 89 d6             	mov    rsi,rdx
     133aa6d:	48 89 ca             	mov    rdx,rcx
     133aa70:	4c 89 c1             	mov    rcx,r8
     133aa73:	4d 89 e0             	mov    r8,r12
     133aa76:	44 89 4c 24 24       	mov    DWORD PTR [rsp+0x24],r9d
     133aa7b:	ff b4 24 b0 00 00 00 	push   QWORD PTR [rsp+0xb0]
     133aa82:	41 52                	push   r10
     133aa84:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     133aa8b:	e8 35 02 00 00       	call   133acc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180249>
     133aa90:	48 83 c4 20          	add    rsp,0x20
     133aa94:	88 03                	mov    BYTE PTR [rbx],al
     133aa96:	41 b7 01             	mov    r15b,0x1
     133aa99:	84 c0                	test   al,al
     133aa9b:	0f 84 80 00 00 00    	je     133ab21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1800a5>
     133aaa1:	4d 85 ed             	test   r13,r13
     133aaa4:	74 74                	je     133ab1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18009e>

### 0x133abd5: mov    BYTE PTR [rbx+0xa8],0x0
     133aba0:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     133aba5:	48 29 c8             	sub    rax,rcx
     133aba8:	6a 38                	push   0x38
     133abaa:	41 5e                	pop    r14
     133abac:	48 99                	cqo
     133abae:	49 f7 fe             	idiv   r14
     133abb1:	4c 39 e0             	cmp    rax,r12
     133abb4:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     133abb9:	0f 83 93 00 00 00    	jae    133ac52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801d6>
     133abbf:	80 bb a8 00 00 00 00 	cmp    BYTE PTR [rbx+0xa8],0x0
     133abc6:	74 28                	je     133abf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180174>
     133abc8:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     133abcd:	4c 89 e7             	mov    rdi,r12
     133abd0:	e8 89 e0 ff ff       	call   1338c5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e1e2>
     133abd5:	c6 83 a8 00 00 00 00 	mov    BYTE PTR [rbx+0xa8],0x0
     133abdc:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     133abe1:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     133abe6:	48 29 c8             	sub    rax,rcx
     133abe9:	48 99                	cqo
     133abeb:	49 f7 fe             	idiv   r14
     133abee:	eb 05                	jmp    133abf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180179>
     133abf0:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     133abf5:	0f 57 c0             	xorps  xmm0,xmm0
     133abf8:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
     133abfe:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     133ac04:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
     133ac0a:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     133ac0f:	c6 83 a8 00 00 00 01 	mov    BYTE PTR [rbx+0xa8],0x1
     133ac16:	48 83 ec 08          	sub    rsp,0x8
     133ac1a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     133ac1f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     133ac24:	4c 89 fa             	mov    rdx,r15
     133ac27:	49 89 c0             	mov    r8,rax
     133ac2a:	44 8b 4c 24 24       	mov    r9d,DWORD PTR [rsp+0x24]
     133ac2f:	ff b4 24 b0 00 00 00 	push   QWORD PTR [rsp+0xb0]

### 0x133ac0f: mov    BYTE PTR [rbx+0xa8],0x1
     133abd0:	e8 89 e0 ff ff       	call   1338c5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e1e2>
     133abd5:	c6 83 a8 00 00 00 00 	mov    BYTE PTR [rbx+0xa8],0x0
     133abdc:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     133abe1:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     133abe6:	48 29 c8             	sub    rax,rcx
     133abe9:	48 99                	cqo
     133abeb:	49 f7 fe             	idiv   r14
     133abee:	eb 05                	jmp    133abf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180179>
     133abf0:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     133abf5:	0f 57 c0             	xorps  xmm0,xmm0
     133abf8:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
     133abfe:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     133ac04:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
     133ac0a:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     133ac0f:	c6 83 a8 00 00 00 01 	mov    BYTE PTR [rbx+0xa8],0x1
     133ac16:	48 83 ec 08          	sub    rsp,0x8
     133ac1a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     133ac1f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     133ac24:	4c 89 fa             	mov    rdx,r15
     133ac27:	49 89 c0             	mov    r8,rax
     133ac2a:	44 8b 4c 24 24       	mov    r9d,DWORD PTR [rsp+0x24]
     133ac2f:	ff b4 24 b0 00 00 00 	push   QWORD PTR [rsp+0xb0]
     133ac36:	41 54                	push   r12
     133ac38:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     133ac3f:	e8 81 00 00 00       	call   133acc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180249>
     133ac44:	48 83 c4 20          	add    rsp,0x20
     133ac48:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
     133ac4b:	0f 95 c1             	setne  cl
     133ac4e:	20 c8                	and    al,cl
     133ac50:	88 03                	mov    BYTE PTR [rbx],al
     133ac52:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     133ac57:	e8 66 b2 8e ff       	call   c25ec2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x172e62>
     133ac5c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133ac63:	00 00 
     133ac65:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]

### 0x133cb5a: mov    QWORD PTR [rsp+0xa0],r15
     133cb23:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     133cb28:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133cb2f:	00 00 
     133cb31:	6a 18                	push   0x18
     133cb33:	5f                   	pop    rdi
     133cb34:	e8 c7 13 4b 00       	call   17edf00 <_Znwm@plt>
     133cb39:	49 89 c7             	mov    r15,rax
     133cb3c:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     133cb41:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     133cb46:	48 89 c7             	mov    rdi,rax
     133cb49:	4c 89 e6             	mov    rsi,r12
     133cb4c:	e8 67 b4 82 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     133cb51:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     133cb56:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     133cb5a:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     133cb61:	00 
     133cb62:	48 8d 05 d1 b7 8e ff 	lea    rax,[rip+0xffffffffff8eb7d1]        # c2833a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1752da>
     133cb69:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     133cb70:	00 
     133cb71:	48 8d 05 a6 07 00 00 	lea    rax,[rip+0x7a6]        # 133d31e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1828a2>
     133cb78:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     133cb7f:	00 
     133cb80:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     133cb84:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133cb87:	ff 50 50             	call   QWORD PTR [rax+0x50]
     133cb8a:	49 89 c7             	mov    r15,rax
     133cb8d:	48 89 c7             	mov    rdi,rax
     133cb90:	48 81 c7 d0 09 00 00 	add    rdi,0x9d0
     133cb97:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
     133cb9d:	49 69 8f 00 0a 00 00 	imul   rcx,QWORD PTR [r15+0xa00],0x3e8
     133cba4:	e8 03 00 00 
     133cba8:	48 01 c1             	add    rcx,rax
     133cbab:	48 89 8c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rcx
     133cbb2:	00 
     133cbb3:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]

### 0x133d1f8: mov    QWORD PTR [rsp+0xa8],rcx
     133d1c1:	e8 ca 0c 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133d1c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133d1cd:	00 00 
     133d1cf:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     133d1d4:	75 08                	jne    133d1de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182762>
     133d1d6:	48 89 df             	mov    rdi,rbx
     133d1d9:	e8 f2 2a 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     133d1de:	e8 cd 28 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133d1e3:	cc                   	int3
     133d1e4:	53                   	push   rbx
     133d1e5:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
     133d1ec:	48 89 f8             	mov    rax,rdi
     133d1ef:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     133d1f6:	00 00 
     133d1f8:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
     133d1ff:	00 
     133d200:	66 89 b4 24 a4 00 00 	mov    WORD PTR [rsp+0xa4],si
     133d207:	00 
     133d208:	c1 ee 10             	shr    esi,0x10
     133d20b:	40 88 b4 24 a6 00 00 	mov    BYTE PTR [rsp+0xa6],sil
     133d212:	00 
     133d213:	0f 57 c0             	xorps  xmm0,xmm0
     133d216:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
     133d21d:	00 
     133d21e:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     133d221:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     133d226:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     133d22b:	48 89 c6             	mov    rsi,rax
     133d22e:	e8 d7 d1 49 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
     133d233:	48 8d 84 24 a4 00 00 	lea    rax,[rsp+0xa4]
     133d23a:	00 
     133d23b:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     133d240:	48 89 06             	mov    QWORD PTR [rsi],rax
     133d243:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
     133d248:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]

### 0x133f554: mov    QWORD PTR [rsp+0xa8],rax
     133f525:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     133f52c:	00 
     133f52d:	75 08                	jne    133f537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184abb>
     133f52f:	48 89 df             	mov    rdi,rbx
     133f532:	e8 99 07 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     133f537:	e8 74 05 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133f53c:	55                   	push   rbp
     133f53d:	41 57                	push   r15
     133f53f:	41 56                	push   r14
     133f541:	41 54                	push   r12
     133f543:	53                   	push   rbx
     133f544:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
     133f54b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133f552:	00 00 
     133f554:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     133f55b:	00 
     133f55c:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
     133f55f:	48 8b 1a             	mov    rbx,QWORD PTR [rdx]
     133f562:	80 7b 38 00          	cmp    BYTE PTR [rbx+0x38],0x0
     133f566:	0f 84 cd 00 00 00    	je     133f639 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184bbd>
     133f56c:	4d 8b 27             	mov    r12,QWORD PTR [r15]
     133f56f:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
     133f574:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     133f577:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
     133f57c:	4c 89 f7             	mov    rdi,r14
     133f57f:	ff 50 18             	call   QWORD PTR [rax+0x18]
     133f582:	41 8b 06             	mov    eax,DWORD PTR [r14]
     133f585:	ff c8                	dec    eax
     133f587:	83 f8 fe             	cmp    eax,0xfffffffe
     133f58a:	40 0f 92 c5          	setb   bpl
     133f58e:	41 22 6e 0c          	and    bpl,BYTE PTR [r14+0xc]
     133f592:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     133f597:	e8 8c c1 73 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     133f59c:	4d 8b 74 24 58       	mov    r14,QWORD PTR [r12+0x58]
     133f5a1:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### 0x1340d41: mov    BYTE PTR [rbx+0xa8],al
     1340d06:	48 89 03             	mov    QWORD PTR [rbx],rax
     1340d09:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
     1340d0d:	4c 8d 73 30          	lea    r14,[rbx+0x30]
     1340d11:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
     1340d16:	0f 57 c0             	xorps  xmm0,xmm0
     1340d19:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     1340d1d:	4c 89 63 48          	mov    QWORD PTR [rbx+0x48],r12
     1340d21:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     1340d25:	4c 89 fe             	mov    rsi,r15
     1340d28:	e8 13 d2 4a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1340d2d:	31 c0                	xor    eax,eax
     1340d2f:	88 83 88 00 00 00    	mov    BYTE PTR [rbx+0x88],al
     1340d35:	88 83 8c 00 00 00    	mov    BYTE PTR [rbx+0x8c],al
     1340d3b:	88 83 90 00 00 00    	mov    BYTE PTR [rbx+0x90],al
     1340d41:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
     1340d47:	48 89 df             	mov    rdi,rbx
     1340d4a:	48 83 c4 08          	add    rsp,0x8
     1340d4e:	5b                   	pop    rbx
     1340d4f:	41 5c                	pop    r12
     1340d51:	41 5e                	pop    r14
     1340d53:	41 5f                	pop    r15
     1340d55:	e9 78 f7 ff ff       	jmp    13404d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x185a56>
     1340d5a:	49 89 c7             	mov    r15,rax
     1340d5d:	4c 89 f7             	mov    rdi,r14
     1340d60:	e8 9f 1e d3 ff       	call   1072c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a01a>
     1340d65:	48 89 df             	mov    rdi,rbx
     1340d68:	e8 b1 1e d3 ff       	call   1072c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a034>
     1340d6d:	4c 89 ff             	mov    rdi,r15
     1340d70:	e8 5b ef 72 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1340d75:	cc                   	int3
     1340d76:	53                   	push   rbx
     1340d77:	48 89 fb             	mov    rbx,rdi
     1340d7a:	48 8d 05 d7 53 52 00 	lea    rax,[rip+0x5253d7]        # 1866158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22840>
     1340d81:	48 89 07             	mov    QWORD PTR [rdi],rax
     1340d84:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]

### 0x1341e19: mov    BYTE PTR [rsi+0xa0],cl
     1341dda:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
     1341ddf:	f6 40 10 04          	test   BYTE PTR [rax+0x10],0x4
     1341de3:	0f 85 a1 00 00 00    	jne    1341e8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18740e>
     1341de9:	31 c0                	xor    eax,eax
     1341deb:	31 d2                	xor    edx,edx
     1341ded:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1341df4:	00 
     1341df5:	88 96 80 00 00 00    	mov    BYTE PTR [rsi+0x80],dl
     1341dfb:	0f 28 84 24 e0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1e0]
     1341e02:	00 
     1341e03:	0f 11 86 81 00 00 00 	movups XMMWORD PTR [rsi+0x81],xmm0
     1341e0a:	0f 10 84 24 ef 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1ef]
     1341e11:	00 
     1341e12:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
     1341e19:	88 8e a0 00 00 00    	mov    BYTE PTR [rsi+0xa0],cl
     1341e1f:	88 86 a8 00 00 00    	mov    BYTE PTR [rsi+0xa8],al
     1341e25:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1341e2a:	e8 6f 01 00 00       	call   1341f9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187522>
     1341e2f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1341e36:	00 
     1341e37:	e8 e4 da d9 ff       	call   10df920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6d36>
     1341e3c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1341e43:	00 
     1341e44:	e8 e5 34 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1341e49:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1341e4e:	48 89 df             	mov    rdi,rbx
     1341e51:	4c 89 f6             	mov    rsi,r14
     1341e54:	e8 57 01 00 00       	call   1341fb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187534>
     1341e59:	4c 89 f7             	mov    rdi,r14
     1341e5c:	e8 83 53 f8 ff       	call   12c71e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c768>
     1341e61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1341e68:	00 00 
     1341e6a:	48 3b 84 24 00 02 00 	cmp    rax,QWORD PTR [rsp+0x200]
     1341e71:	00 
     1341e72:	0f 85 c6 00 00 00    	jne    1341f3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1874c2>

### 0x1341e1f: mov    BYTE PTR [rsi+0xa8],al
     1341ddf:	f6 40 10 04          	test   BYTE PTR [rax+0x10],0x4
     1341de3:	0f 85 a1 00 00 00    	jne    1341e8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18740e>
     1341de9:	31 c0                	xor    eax,eax
     1341deb:	31 d2                	xor    edx,edx
     1341ded:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1341df4:	00 
     1341df5:	88 96 80 00 00 00    	mov    BYTE PTR [rsi+0x80],dl
     1341dfb:	0f 28 84 24 e0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1e0]
     1341e02:	00 
     1341e03:	0f 11 86 81 00 00 00 	movups XMMWORD PTR [rsi+0x81],xmm0
     1341e0a:	0f 10 84 24 ef 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1ef]
     1341e11:	00 
     1341e12:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
     1341e19:	88 8e a0 00 00 00    	mov    BYTE PTR [rsi+0xa0],cl
     1341e1f:	88 86 a8 00 00 00    	mov    BYTE PTR [rsi+0xa8],al
     1341e25:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1341e2a:	e8 6f 01 00 00       	call   1341f9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187522>
     1341e2f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1341e36:	00 
     1341e37:	e8 e4 da d9 ff       	call   10df920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6d36>
     1341e3c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1341e43:	00 
     1341e44:	e8 e5 34 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1341e49:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1341e4e:	48 89 df             	mov    rdi,rbx
     1341e51:	4c 89 f6             	mov    rsi,r14
     1341e54:	e8 57 01 00 00       	call   1341fb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187534>
     1341e59:	4c 89 f7             	mov    rdi,r14
     1341e5c:	e8 83 53 f8 ff       	call   12c71e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c768>
     1341e61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1341e68:	00 00 
     1341e6a:	48 3b 84 24 00 02 00 	cmp    rax,QWORD PTR [rsp+0x200]
     1341e71:	00 
     1341e72:	0f 85 c6 00 00 00    	jne    1341f3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1874c2>
     1341e78:	48 81 c4 08 02 00 00 	add    rsp,0x208

### 0x1345024: mov    QWORD PTR [rdx+0xa0],r12
     1344fe7:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     1344feb:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
     1344fef:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     1344ff3:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
     1344ff8:	49 83 c6 18          	add    r14,0x18
     1344ffc:	49 83 c7 18          	add    r15,0x18
     1345000:	49 39 c6             	cmp    r14,rax
     1345003:	75 db                	jne    1344fe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a564>
     1345005:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
     134500a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     134500f:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
     1345013:	e8 82 49 ff ff       	call   133999a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef1e>
     1345018:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     134501d:	0f 10 82 a0 00 00 00 	movups xmm0,XMMWORD PTR [rdx+0xa0]
     1345024:	4c 89 a2 a0 00 00 00 	mov    QWORD PTR [rdx+0xa0],r12
     134502b:	4c 89 ba a8 00 00 00 	mov    QWORD PTR [rdx+0xa8],r15
     1345032:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1345039:	00 
     134503a:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     134503e:	48 8b 82 b0 00 00 00 	mov    rax,QWORD PTR [rdx+0xb0]
     1345045:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     1345049:	48 89 8a b0 00 00 00 	mov    QWORD PTR [rdx+0xb0],rcx
     1345050:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     1345054:	0f 13 07             	movlps QWORD PTR [rdi],xmm0
     1345057:	e8 e4 4b ff ff       	call   1339c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f1c4>
     134505c:	e9 6e 01 00 00       	jmp    13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
     1345061:	4d 89 f4             	mov    r12,r14
     1345064:	4d 29 f4             	sub    r12,r14
     1345067:	4c 89 e0             	mov    rax,r12
     134506a:	48 99                	cqo
     134506c:	49 f7 f8             	idiv   r8
     134506f:	48 39 c8             	cmp    rax,rcx
     1345072:	7d 71                	jge    13450e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a669>
     1345074:	49 8d 14 2c          	lea    rdx,[r12+rbp*1]
     1345078:	48 8d 44 24 68       	lea    rax,[rsp+0x68]

### 0x134502b: mov    QWORD PTR [rdx+0xa8],r15
     1344feb:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
     1344fef:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     1344ff3:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
     1344ff8:	49 83 c6 18          	add    r14,0x18
     1344ffc:	49 83 c7 18          	add    r15,0x18
     1345000:	49 39 c6             	cmp    r14,rax
     1345003:	75 db                	jne    1344fe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a564>
     1345005:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
     134500a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     134500f:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
     1345013:	e8 82 49 ff ff       	call   133999a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef1e>
     1345018:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     134501d:	0f 10 82 a0 00 00 00 	movups xmm0,XMMWORD PTR [rdx+0xa0]
     1345024:	4c 89 a2 a0 00 00 00 	mov    QWORD PTR [rdx+0xa0],r12
     134502b:	4c 89 ba a8 00 00 00 	mov    QWORD PTR [rdx+0xa8],r15
     1345032:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1345039:	00 
     134503a:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     134503e:	48 8b 82 b0 00 00 00 	mov    rax,QWORD PTR [rdx+0xb0]
     1345045:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     1345049:	48 89 8a b0 00 00 00 	mov    QWORD PTR [rdx+0xb0],rcx
     1345050:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     1345054:	0f 13 07             	movlps QWORD PTR [rdi],xmm0
     1345057:	e8 e4 4b ff ff       	call   1339c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f1c4>
     134505c:	e9 6e 01 00 00       	jmp    13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
     1345061:	4d 89 f4             	mov    r12,r14
     1345064:	4d 29 f4             	sub    r12,r14
     1345067:	4c 89 e0             	mov    rax,r12
     134506a:	48 99                	cqo
     134506c:	49 f7 f8             	idiv   r8
     134506f:	48 39 c8             	cmp    rax,rcx
     1345072:	7d 71                	jge    13450e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a669>
     1345074:	49 8d 14 2c          	lea    rdx,[r12+rbp*1]
     1345078:	48 8d 44 24 68       	lea    rax,[rsp+0x68]
     134507d:	4c 89 30             	mov    QWORD PTR [rax],r14

### 0x1345107: mov    QWORD PTR [rax+0xa8],rbx
     13450d5:	48 83 c3 18          	add    rbx,0x18
     13450d9:	4c 39 e9             	cmp    rcx,r13
     13450dc:	75 dc                	jne    13450ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a63e>
     13450de:	48 89 5c 24 68       	mov    QWORD PTR [rsp+0x68],rbx
     13450e3:	eb 0c                	jmp    13450f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a675>
     13450e5:	49 8d 04 2f          	lea    rax,[r15+rbp*1]
     13450e9:	4c 89 f3             	mov    rbx,r14
     13450ec:	eb 2e                	jmp    134511c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a6a0>
     13450ee:	4c 89 f3             	mov    rbx,r14
     13450f1:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     13450f8:	00 
     13450f9:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
     13450fd:	e8 98 48 ff ff       	call   133999a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef1e>
     1345102:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1345107:	48 89 98 a8 00 00 00 	mov    QWORD PTR [rax+0xa8],rbx
     134510e:	4d 85 e4             	test   r12,r12
     1345111:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1345116:	0f 8e b3 00 00 00    	jle    13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
     134511c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1345121:	4b 8d 04 3e          	lea    rax,[r14+r15*1]
     1345125:	48 89 d9             	mov    rcx,rbx
     1345128:	4c 29 f9             	sub    rcx,r15
     134512b:	48 89 da             	mov    rdx,rbx
     134512e:	4c 39 f1             	cmp    rcx,r14
     1345131:	73 31                	jae    1345164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a6e8>
     1345133:	48 8d 35 a6 17 52 00 	lea    rsi,[rip+0x5217a6]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
     134513a:	0f 57 c0             	xorps  xmm0,xmm0
     134513d:	48 89 da             	mov    rdx,rbx
     1345140:	48 89 32             	mov    QWORD PTR [rdx],rsi
     1345143:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
     1345147:	48 89 7a 08          	mov    QWORD PTR [rdx+0x8],rdi
     134514b:	48 8b 79 10          	mov    rdi,QWORD PTR [rcx+0x10]
     134514f:	48 89 7a 10          	mov    QWORD PTR [rdx+0x10],rdi
     1345153:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     1345157:	48 83 c1 18          	add    rcx,0x18

### 0x1345169: mov    QWORD PTR [rcx+0xa8],rdx
     1345133:	48 8d 35 a6 17 52 00 	lea    rsi,[rip+0x5217a6]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
     134513a:	0f 57 c0             	xorps  xmm0,xmm0
     134513d:	48 89 da             	mov    rdx,rbx
     1345140:	48 89 32             	mov    QWORD PTR [rdx],rsi
     1345143:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
     1345147:	48 89 7a 08          	mov    QWORD PTR [rdx+0x8],rdi
     134514b:	48 8b 79 10          	mov    rdi,QWORD PTR [rcx+0x10]
     134514f:	48 89 7a 10          	mov    QWORD PTR [rdx+0x10],rdi
     1345153:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     1345157:	48 83 c1 18          	add    rcx,0x18
     134515b:	48 83 c2 18          	add    rdx,0x18
     134515f:	4c 39 f1             	cmp    rcx,r14
     1345162:	72 dc                	jb     1345140 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a6c4>
     1345164:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     1345169:	48 89 91 a8 00 00 00 	mov    QWORD PTR [rcx+0xa8],rdx
     1345170:	48 39 c3             	cmp    rbx,rax
     1345173:	74 33                	je     13451a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a72c>
     1345175:	49 89 df             	mov    r15,rbx
     1345178:	49 83 c7 f0          	add    r15,0xfffffffffffffff0
     134517c:	48 01 eb             	add    rbx,rbp
     134517f:	49 89 dc             	mov    r12,rbx
     1345182:	4d 29 ec             	sub    r12,r13
     1345185:	49 83 c4 f0          	add    r12,0xfffffffffffffff0
     1345189:	4d 01 f5             	add    r13,r14
     134518c:	49 29 dd             	sub    r13,rbx
     134518f:	4c 89 ff             	mov    rdi,r15
     1345192:	4c 89 e6             	mov    rsi,r12
     1345195:	e8 82 46 77 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     134519a:	49 83 c7 e8          	add    r15,0xffffffffffffffe8
     134519e:	49 83 c4 e8          	add    r12,0xffffffffffffffe8
     13451a2:	49 83 c5 18          	add    r13,0x18
     13451a6:	75 e7                	jne    134518f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a713>
     13451a8:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     13451ad:	48 39 eb             	cmp    rbx,rbp
     13451b0:	74 1d                	je     13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>

### 0x134b72b: mov    BYTE PTR [r14+0xa0],al
     134b6f8:	41 80 4e 10 20       	or     BYTE PTR [r14+0x10],0x20
     134b6fd:	80 7b 3a 00          	cmp    BYTE PTR [rbx+0x3a],0x0
     134b701:	74 41                	je     134b744 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190cc8>
     134b703:	49 8d 77 18          	lea    rsi,[r15+0x18]
     134b707:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
     134b70b:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     134b712:	00 
     134b713:	ff 50 10             	call   QWORD PTR [rax+0x10]
     134b716:	48 8b bc 24 90 01 00 	mov    rdi,QWORD PTR [rsp+0x190]
     134b71d:	00 
     134b71e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     134b721:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
     134b728:	00 
     134b729:	ff 10                	call   QWORD PTR [rax]
     134b72b:	41 88 86 a0 00 00 00 	mov    BYTE PTR [r14+0xa0],al
     134b732:	41 80 4e 12 02       	or     BYTE PTR [r14+0x12],0x2
     134b737:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     134b73e:	00 
     134b73f:	e8 ea 9b 37 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     134b744:	4c 8b a4 24 78 01 00 	mov    r12,QWORD PTR [rsp+0x178]
     134b74b:	00 
     134b74c:	80 7b 2e 00          	cmp    BYTE PTR [rbx+0x2e],0x0
     134b750:	74 24                	je     134b776 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190cfa>
     134b752:	48 8b b4 24 80 01 00 	mov    rsi,QWORD PTR [rsp+0x180]
     134b759:	00 
     134b75a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     134b761:	00 
     134b762:	4c 89 e2             	mov    rdx,r12
     134b765:	e8 a3 31 29 00       	call   15de90d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x423e91>
     134b76a:	41 88 86 9a 00 00 00 	mov    BYTE PTR [r14+0x9a],al
     134b771:	41 80 4e 11 40       	or     BYTE PTR [r14+0x11],0x40
     134b776:	80 7b 2f 00          	cmp    BYTE PTR [rbx+0x2f],0x0
     134b77a:	74 51                	je     134b7cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190d51>
     134b77c:	49 8b 07             	mov    rax,QWORD PTR [r15]
     134b77f:	4c 89 ff             	mov    rdi,r15

### 0x134c3b3: mov    DWORD PTR [r15+0xa0],eax
     134c37d:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
     134c382:	ff 50 10             	call   QWORD PTR [rax+0x10]
     134c385:	41 80 4f 10 04       	or     BYTE PTR [r15+0x10],0x4
     134c38a:	49 8d 7f 70          	lea    rdi,[r15+0x70]
     134c38e:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     134c392:	f6 c2 01             	test   dl,0x1
     134c395:	0f 85 e5 02 00 00    	jne    134c680 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191c04>
     134c39b:	48 89 c6             	mov    rsi,rax
     134c39e:	e8 ef 93 41 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     134c3a3:	80 7b 2b 00          	cmp    BYTE PTR [rbx+0x2b],0x0
     134c3a7:	74 16                	je     134c3bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191943>
     134c3a9:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     134c3ad:	4c 89 e7             	mov    rdi,r12
     134c3b0:	ff 50 20             	call   QWORD PTR [rax+0x20]
     134c3b3:	41 89 87 a0 00 00 00 	mov    DWORD PTR [r15+0xa0],eax
     134c3ba:	41 80 4f 11 01       	or     BYTE PTR [r15+0x11],0x1
     134c3bf:	80 7b 2c 00          	cmp    BYTE PTR [rbx+0x2c],0x0
     134c3c3:	74 28                	je     134c3ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191971>
     134c3c5:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     134c3c9:	4c 89 e7             	mov    rdi,r12
     134c3cc:	ff 50 28             	call   QWORD PTR [rax+0x28]
     134c3cf:	41 80 4f 10 08       	or     BYTE PTR [r15+0x10],0x8
     134c3d4:	49 8d 7f 78          	lea    rdi,[r15+0x78]
     134c3d8:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     134c3dc:	f6 c2 01             	test   dl,0x1
     134c3df:	0f 85 a7 02 00 00    	jne    134c68c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191c10>
     134c3e5:	48 89 c6             	mov    rsi,rax
     134c3e8:	e8 a5 93 41 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     134c3ed:	80 7b 2d 00          	cmp    BYTE PTR [rbx+0x2d],0x0
     134c3f1:	74 3f                	je     134c432 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1919b6>
     134c3f3:	49 8d 74 24 28       	lea    rsi,[r12+0x28]
     134c3f8:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
     134c3fd:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     134c402:	ff 50 10             	call   QWORD PTR [rax+0x10]
     134c405:	41 80 4f 10 10       	or     BYTE PTR [r15+0x10],0x10

### 0x134c594: mov    DWORD PTR [r15+0xa8],ecx
     134c56f:	74 2f                	je     134c5a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b24>
     134c571:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     134c575:	4c 89 e7             	mov    rdi,r12
     134c578:	ff 50 30             	call   QWORD PTR [rax+0x30]
     134c57b:	85 c0                	test   eax,eax
     134c57d:	74 21                	je     134c5a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b24>
     134c57f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     134c583:	4c 89 e7             	mov    rdi,r12
     134c586:	ff 50 30             	call   QWORD PTR [rax+0x30]
     134c589:	ff c8                	dec    eax
     134c58b:	83 f8 03             	cmp    eax,0x3
     134c58e:	6a ff                	push   0xffffffffffffffff
     134c590:	59                   	pop    rcx
     134c591:	0f 42 c8             	cmovb  ecx,eax
     134c594:	41 89 8f a8 00 00 00 	mov    DWORD PTR [r15+0xa8],ecx
     134c59b:	41 80 4f 11 04       	or     BYTE PTR [r15+0x11],0x4
     134c5a0:	80 7b 33 00          	cmp    BYTE PTR [rbx+0x33],0x0
     134c5a4:	74 3b                	je     134c5e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b65>
     134c5a6:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     134c5aa:	4c 89 e7             	mov    rdi,r12
     134c5ad:	ff 50 70             	call   QWORD PTR [rax+0x70]
     134c5b0:	85 c0                	test   eax,eax
     134c5b2:	7e 2d                	jle    134c5e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b65>
     134c5b4:	4d 8d 6f 18          	lea    r13,[r15+0x18]
     134c5b8:	31 ed                	xor    ebp,ebp
     134c5ba:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     134c5be:	4c 89 e7             	mov    rdi,r12
     134c5c1:	89 ee                	mov    esi,ebp
     134c5c3:	ff 50 78             	call   QWORD PTR [rax+0x78]
     134c5c6:	4c 89 ef             	mov    rdi,r13
     134c5c9:	48 89 c6             	mov    rsi,rax
     134c5cc:	e8 7e e3 79 ff       	call   aea94f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x378ef>
     134c5d1:	ff c5                	inc    ebp
     134c5d3:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     134c5d7:	4c 89 e7             	mov    rdi,r12

### 0x134e5fd: movups XMMWORD PTR [rbx+0xa8],xmm0
     134e5b8:	0f 11 45 18          	movups XMMWORD PTR [rbp+0x18],xmm0
     134e5bc:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
     134e5c0:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
     134e5c6:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
     134e5ca:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
     134e5cf:	41 8a 46 30          	mov    al,BYTE PTR [r14+0x30]
     134e5d3:	88 45 30             	mov    BYTE PTR [rbp+0x30],al
     134e5d6:	48 89 ee             	mov    rsi,rbp
     134e5d9:	e8 c2 00 d7 ff       	call   10be6a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285ab6>
     134e5de:	0f 57 c0             	xorps  xmm0,xmm0
     134e5e1:	0f 11 83 e8 00 00 00 	movups XMMWORD PTR [rbx+0xe8],xmm0
     134e5e8:	0f 11 83 d8 00 00 00 	movups XMMWORD PTR [rbx+0xd8],xmm0
     134e5ef:	0f 11 83 c8 00 00 00 	movups XMMWORD PTR [rbx+0xc8],xmm0
     134e5f6:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
     134e5fd:	0f 11 83 a8 00 00 00 	movups XMMWORD PTR [rbx+0xa8],xmm0
     134e604:	c7 83 f8 00 00 00 01 	mov    DWORD PTR [rbx+0xf8],0x1
     134e60b:	00 00 00 
     134e60e:	48 89 ef             	mov    rdi,rbp
     134e611:	e8 a0 d2 90 ff       	call   c5b8b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8856>
     134e616:	4c 89 ef             	mov    rdi,r13
     134e619:	e8 68 00 d7 ff       	call   10be686 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285a9c>
     134e61e:	4c 89 f7             	mov    rdi,r14
     134e621:	e8 90 d2 90 ff       	call   c5b8b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8856>
     134e626:	4c 89 ff             	mov    rdi,r15
     134e629:	e8 58 00 d7 ff       	call   10be686 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285a9c>
     134e62e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     134e635:	00 00 
     134e637:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]
     134e63e:	00 
     134e63f:	75 6e                	jne    134e6af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x193c33>
     134e641:	48 81 c4 48 01 00 00 	add    rsp,0x148
     134e648:	5b                   	pop    rbx
     134e649:	41 5c                	pop    r12
     134e64b:	41 5d                	pop    r13
     134e64d:	41 5e                	pop    r14

### 0x134f4da: mov    BYTE PTR [rsp+0xa0],al
     134f4a0:	0f 84 eb 01 00 00    	je     134f691 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194c15>
     134f4a6:	48 8d 43 20          	lea    rax,[rbx+0x20]
     134f4aa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     134f4af:	48 8d 43 30          	lea    rax,[rbx+0x30]
     134f4b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     134f4b8:	48 c1 e1 03          	shl    rcx,0x3
     134f4bc:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
     134f4c3:	00 
     134f4c4:	45 31 ff             	xor    r15d,r15d
     134f4c7:	45 31 ed             	xor    r13d,r13d
     134f4ca:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
     134f4cf:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     134f4d4:	4a 8b 2c 38          	mov    rbp,QWORD PTR [rax+r15*1]
     134f4d8:	31 c0                	xor    eax,eax
     134f4da:	88 84 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],al
     134f4e1:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al
     134f4e8:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
     134f4ef:	0f 57 c0             	xorps  xmm0,xmm0
     134f4f2:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     134f4f9:	00 
     134f4fa:	0f 11 84 24 89 00 00 	movups XMMWORD PTR [rsp+0x89],xmm0
     134f501:	00 
     134f502:	48 8b 75 18          	mov    rsi,QWORD PTR [rbp+0x18]
     134f506:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     134f50a:	4d 89 f4             	mov    r12,r14
     134f50d:	4c 89 f7             	mov    rdi,r14
     134f510:	e8 6b eb 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     134f515:	4c 63 75 48          	movsxd r14,DWORD PTR [rbp+0x48]
     134f519:	4c 89 b4 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r14
     134f520:	00 
     134f521:	8b 7d 40             	mov    edi,DWORD PTR [rbp+0x40]
     134f524:	e8 61 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
     134f529:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     134f530:	00 
     134f531:	88 94 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],dl

### 0x134f4e1: mov    BYTE PTR [rsp+0xa8],al
     134f4a6:	48 8d 43 20          	lea    rax,[rbx+0x20]
     134f4aa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     134f4af:	48 8d 43 30          	lea    rax,[rbx+0x30]
     134f4b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     134f4b8:	48 c1 e1 03          	shl    rcx,0x3
     134f4bc:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
     134f4c3:	00 
     134f4c4:	45 31 ff             	xor    r15d,r15d
     134f4c7:	45 31 ed             	xor    r13d,r13d
     134f4ca:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
     134f4cf:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     134f4d4:	4a 8b 2c 38          	mov    rbp,QWORD PTR [rax+r15*1]
     134f4d8:	31 c0                	xor    eax,eax
     134f4da:	88 84 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],al
     134f4e1:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al
     134f4e8:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
     134f4ef:	0f 57 c0             	xorps  xmm0,xmm0
     134f4f2:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     134f4f9:	00 
     134f4fa:	0f 11 84 24 89 00 00 	movups XMMWORD PTR [rsp+0x89],xmm0
     134f501:	00 
     134f502:	48 8b 75 18          	mov    rsi,QWORD PTR [rbp+0x18]
     134f506:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     134f50a:	4d 89 f4             	mov    r12,r14
     134f50d:	4c 89 f7             	mov    rdi,r14
     134f510:	e8 6b eb 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     134f515:	4c 63 75 48          	movsxd r14,DWORD PTR [rbp+0x48]
     134f519:	4c 89 b4 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r14
     134f520:	00 
     134f521:	8b 7d 40             	mov    edi,DWORD PTR [rbp+0x40]
     134f524:	e8 61 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
     134f529:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     134f530:	00 
     134f531:	88 94 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],dl
     134f538:	8b 7d 44             	mov    edi,DWORD PTR [rbp+0x44]

### 0x134f531: mov    BYTE PTR [rsp+0xa0],dl
     134f4fa:	0f 11 84 24 89 00 00 	movups XMMWORD PTR [rsp+0x89],xmm0
     134f501:	00 
     134f502:	48 8b 75 18          	mov    rsi,QWORD PTR [rbp+0x18]
     134f506:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     134f50a:	4d 89 f4             	mov    r12,r14
     134f50d:	4c 89 f7             	mov    rdi,r14
     134f510:	e8 6b eb 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     134f515:	4c 63 75 48          	movsxd r14,DWORD PTR [rbp+0x48]
     134f519:	4c 89 b4 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r14
     134f520:	00 
     134f521:	8b 7d 40             	mov    edi,DWORD PTR [rbp+0x40]
     134f524:	e8 61 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
     134f529:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     134f530:	00 
     134f531:	88 94 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],dl
     134f538:	8b 7d 44             	mov    edi,DWORD PTR [rbp+0x44]
     134f53b:	e8 4a 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
     134f540:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     134f547:	00 
     134f548:	88 94 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],dl
     134f54f:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     134f553:	48 8b 68 28          	mov    rbp,QWORD PTR [rax+0x28]
     134f557:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
     134f55b:	48 39 f5             	cmp    rbp,rsi
     134f55e:	73 58                	jae    134f5b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194b3c>
     134f560:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     134f567:	00 
     134f568:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     134f56c:	0f 28 84 24 80 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x80]
     134f573:	00 
     134f574:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
     134f578:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
     134f57f:	00 00 
     134f581:	0f 57 c0             	xorps  xmm0,xmm0
     134f584:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0

### 0x134f540: mov    QWORD PTR [rsp+0xa8],rax
     134f506:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     134f50a:	4d 89 f4             	mov    r12,r14
     134f50d:	4c 89 f7             	mov    rdi,r14
     134f510:	e8 6b eb 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     134f515:	4c 63 75 48          	movsxd r14,DWORD PTR [rbp+0x48]
     134f519:	4c 89 b4 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r14
     134f520:	00 
     134f521:	8b 7d 40             	mov    edi,DWORD PTR [rbp+0x40]
     134f524:	e8 61 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
     134f529:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     134f530:	00 
     134f531:	88 94 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],dl
     134f538:	8b 7d 44             	mov    edi,DWORD PTR [rbp+0x44]
     134f53b:	e8 4a 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
     134f540:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     134f547:	00 
     134f548:	88 94 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],dl
     134f54f:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     134f553:	48 8b 68 28          	mov    rbp,QWORD PTR [rax+0x28]
     134f557:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
     134f55b:	48 39 f5             	cmp    rbp,rsi
     134f55e:	73 58                	jae    134f5b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194b3c>
     134f560:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     134f567:	00 
     134f568:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     134f56c:	0f 28 84 24 80 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x80]
     134f573:	00 
     134f574:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
     134f578:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
     134f57f:	00 00 
     134f581:	0f 57 c0             	xorps  xmm0,xmm0
     134f584:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     134f58b:	00 
     134f58c:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     134f593:	00 

### 0x1352f1d: mov    QWORD PTR [rsp+0xa8],r12
     1352ee6:	e8 b9 06 00 00       	call   13535a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b28>
     1352eeb:	49 83 c5 20          	add    r13,0x20
     1352eef:	4c 8b a4 24 18 01 00 	mov    r12,QWORD PTR [rsp+0x118]
     1352ef6:	00 
     1352ef7:	49 83 c4 20          	add    r12,0x20
     1352efb:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
     1352f02:	00 
     1352f03:	49 83 fd 40          	cmp    r13,0x40
     1352f07:	75 c6                	jne    1352ecf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198453>
     1352f09:	40 b5 01             	mov    bpl,0x1
     1352f0c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1352f13:	00 
     1352f14:	40 88 6f 18          	mov    BYTE PTR [rdi+0x18],bpl
     1352f18:	e8 c3 06 00 00       	call   13535e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b64>
     1352f1d:	4c 89 a4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r12
     1352f24:	00 
     1352f25:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1352f2c:	00 
     1352f2d:	40 88 6f 08          	mov    BYTE PTR [rdi+0x8],bpl
     1352f31:	e8 e0 06 00 00       	call   1353616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b9a>
     1352f36:	6a 40                	push   0x40
     1352f38:	41 5e                	pop    r14
     1352f3a:	4a 8b bc 34 40 01 00 	mov    rdi,QWORD PTR [rsp+r14*1+0x140]
     1352f41:	00 
     1352f42:	e8 73 b6 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
     1352f47:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
     1352f4b:	75 ed                	jne    1352f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1984be>
     1352f4d:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     1352f52:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1352f55:	48 85 c0             	test   rax,rax
     1352f58:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
     1352f5d:	74 3a                	je     1352f99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19851d>
     1352f5f:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
     1352f66:	00 
     1352f67:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax

### 0x1353372: mov    QWORD PTR [rsp+0xa8],r15
     1353344:	48 89 c5             	mov    rbp,rax
     1353347:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     135334e:	00 
     135334f:	e8 32 b1 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1353354:	eb 6f                	jmp    13533c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198949>
     1353356:	eb 05                	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
     1353358:	48 89 c5             	mov    rbp,rax
     135335b:	eb 75                	jmp    13533d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198956>
     135335d:	48 89 c5             	mov    rbp,rax
     1353360:	eb 63                	jmp    13533c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198949>
     1353362:	48 89 c5             	mov    rbp,rax
     1353365:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     135336c:	00 
     135336d:	e8 6e 02 00 00       	call   13535e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b64>
     1353372:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
     1353379:	00 
     135337a:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1353381:	00 
     1353382:	e8 8f 02 00 00       	call   1353616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b9a>
     1353387:	6a 40                	push   0x40
     1353389:	41 5e                	pop    r14
     135338b:	4a 8b bc 34 40 01 00 	mov    rdi,QWORD PTR [rsp+r14*1+0x140]
     1353392:	00 
     1353393:	e8 22 b2 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
     1353398:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
     135339c:	75 ed                	jne    135338b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19890f>
     135339e:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     13533a5:	00 
     13533a6:	e8 15 b2 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     13533ab:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     13533b2:	00 
     13533b3:	e8 ce b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13533b8:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     13533bf:	00 
     13533c0:	e8 c1 b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x1354156: mov    QWORD PTR [rsp+0xa0],rax
     1354128:	48 89 df             	mov    rdi,rbx
     135412b:	e8 a0 bb 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1354130:	e8 7b b9 49 00       	call   17efab0 <__stack_chk_fail@plt>
     1354135:	cc                   	int3
     1354136:	41 57                	push   r15
     1354138:	41 56                	push   r14
     135413a:	41 54                	push   r12
     135413c:	53                   	push   rbx
     135413d:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     1354144:	4c 89 cb             	mov    rbx,r9
     1354147:	4d 89 c6             	mov    r14,r8
     135414a:	49 89 ff             	mov    r15,rdi
     135414d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354154:	00 00 
     1354156:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     135415d:	00 
     135415e:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     1354163:	4c 89 e7             	mov    rdi,r12
     1354166:	48 89 d6             	mov    rsi,rdx
     1354169:	4c 89 c2             	mov    rdx,r8
     135416c:	e8 85 00 00 00       	call   13541f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19977a>
     1354171:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     1354175:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     135417a:	48 89 01             	mov    QWORD PTR [rcx],rax
     135417d:	c6 41 08 01          	mov    BYTE PTR [rcx+0x8],0x1
     1354181:	41 0f 10 46 10       	movups xmm0,XMMWORD PTR [r14+0x10]
     1354186:	49 89 e0             	mov    r8,rsp
     1354189:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     135418d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1354191:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354194:	4c 89 e6             	mov    rsi,r12
     1354197:	48 89 da             	mov    rdx,rbx
     135419a:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135419d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13541a2:	e8 fd 01 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>

### 0x1354dce: mov    QWORD PTR [rbx+0xa0],rax
     1354d92:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     1354d96:	e8 a5 91 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1354d9b:	4c 8d 63 20          	lea    r12,[rbx+0x20]
     1354d9f:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
     1354da4:	4c 89 e7             	mov    rdi,r12
     1354da7:	48 89 ee             	mov    rsi,rbp
     1354daa:	4c 89 ea             	mov    rdx,r13
     1354dad:	e8 56 01 00 00       	call   1354f08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a48c>
     1354db2:	41 8a 47 08          	mov    al,BYTE PTR [r15+0x8]
     1354db6:	88 83 98 00 00 00    	mov    BYTE PTR [rbx+0x98],al
     1354dbc:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1354dbf:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
     1354dc6:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     1354dcb:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     1354dce:	48 89 83 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rax
     1354dd5:	8a 41 08             	mov    al,BYTE PTR [rcx+0x8]
     1354dd8:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
     1354dde:	41 80 7e 04 00       	cmp    BYTE PTR [r14+0x4],0x0
     1354de3:	0f 95 c0             	setne  al
     1354de6:	41 83 3e 00          	cmp    DWORD PTR [r14],0x0
     1354dea:	0f 94 c1             	sete   cl
     1354ded:	20 c1                	and    cl,al
     1354def:	88 8b b0 00 00 00    	mov    BYTE PTR [rbx+0xb0],cl
     1354df5:	48 81 c3 b8 00 00 00 	add    rbx,0xb8
     1354dfc:	48 8d 35 79 d1 0f ff 	lea    rsi,[rip+0xffffffffff0fd179]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1354e03:	48 89 df             	mov    rdi,rbx
     1354e06:	e8 73 4c 72 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1354e0b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1354e10:	e8 7b 90 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1354e15:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1354e1a:	e8 1d 52 ed ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     1354e1f:	48 8d bc 24 c8 02 00 	lea    rdi,[rsp+0x2c8]
     1354e26:	00 
     1354e27:	e8 a0 99 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1354e2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x1354dd8: mov    BYTE PTR [rbx+0xa8],al
     1354d9b:	4c 8d 63 20          	lea    r12,[rbx+0x20]
     1354d9f:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
     1354da4:	4c 89 e7             	mov    rdi,r12
     1354da7:	48 89 ee             	mov    rsi,rbp
     1354daa:	4c 89 ea             	mov    rdx,r13
     1354dad:	e8 56 01 00 00       	call   1354f08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a48c>
     1354db2:	41 8a 47 08          	mov    al,BYTE PTR [r15+0x8]
     1354db6:	88 83 98 00 00 00    	mov    BYTE PTR [rbx+0x98],al
     1354dbc:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1354dbf:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
     1354dc6:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     1354dcb:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     1354dce:	48 89 83 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rax
     1354dd5:	8a 41 08             	mov    al,BYTE PTR [rcx+0x8]
     1354dd8:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
     1354dde:	41 80 7e 04 00       	cmp    BYTE PTR [r14+0x4],0x0
     1354de3:	0f 95 c0             	setne  al
     1354de6:	41 83 3e 00          	cmp    DWORD PTR [r14],0x0
     1354dea:	0f 94 c1             	sete   cl
     1354ded:	20 c1                	and    cl,al
     1354def:	88 8b b0 00 00 00    	mov    BYTE PTR [rbx+0xb0],cl
     1354df5:	48 81 c3 b8 00 00 00 	add    rbx,0xb8
     1354dfc:	48 8d 35 79 d1 0f ff 	lea    rsi,[rip+0xffffffffff0fd179]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1354e03:	48 89 df             	mov    rdi,rbx
     1354e06:	e8 73 4c 72 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1354e0b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1354e10:	e8 7b 90 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1354e15:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1354e1a:	e8 1d 52 ed ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     1354e1f:	48 8d bc 24 c8 02 00 	lea    rdi,[rsp+0x2c8]
     1354e26:	00 
     1354e27:	e8 a0 99 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1354e2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354e33:	00 00 
     1354e35:	48 3b 84 24 10 03 00 	cmp    rax,QWORD PTR [rsp+0x310]

### 0x13553eb: mov    QWORD PTR [rsp+0xa0],rax
     13553c2:	e8 e9 a6 49 00       	call   17efab0 <__stack_chk_fail@plt>
     13553c7:	cc                   	int3
     13553c8:	e9 17 0e 00 00       	jmp    13561e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b768>
     13553cd:	cc                   	int3
     13553ce:	55                   	push   rbp
     13553cf:	41 57                	push   r15
     13553d1:	41 56                	push   r14
     13553d3:	41 55                	push   r13
     13553d5:	41 54                	push   r12
     13553d7:	53                   	push   rbx
     13553d8:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     13553df:	48 89 fb             	mov    rbx,rdi
     13553e2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13553e9:	00 00 
     13553eb:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     13553f2:	00 
     13553f3:	48 89 d6             	mov    rsi,rdx
     13553f6:	e8 97 0f 00 00       	call   1356392 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b916>
     13553fb:	48 85 c0             	test   rax,rax
     13553fe:	0f 84 05 01 00 00    	je     1355509 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aa8d>
     1355404:	49 89 c6             	mov    r14,rax
     1355407:	80 bb e0 08 00 00 00 	cmp    BYTE PTR [rbx+0x8e0],0x0
     135540e:	c6 83 e0 08 00 00 01 	mov    BYTE PTR [rbx+0x8e0],0x1
     1355415:	75 2d                	jne    1355444 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a9c8>
     1355417:	4c 8b 63 58          	mov    r12,QWORD PTR [rbx+0x58]
     135541b:	4c 8b 6b 60          	mov    r13,QWORD PTR [rbx+0x60]
     135541f:	4d 39 ec             	cmp    r12,r13
     1355422:	74 20                	je     1355444 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a9c8>
     1355424:	4c 8d bb 80 00 00 00 	lea    r15,[rbx+0x80]
     135542b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     135542f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1355432:	4c 89 fe             	mov    rsi,r15
     1355435:	4c 89 f2             	mov    rdx,r14
     1355438:	ff 50 10             	call   QWORD PTR [rax+0x10]
     135543b:	49 83 c4 20          	add    r12,0x20

### 0x13564e3: mov    QWORD PTR [r15+0xa8],rax
     13564a9:	49 8d 74 24 68       	lea    rsi,[r12+0x68]
     13564ae:	4c 89 ef             	mov    rdi,r13
     13564b1:	e8 8a 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13564b6:	41 0f 10 84 24 80 00 	movups xmm0,XMMWORD PTR [r12+0x80]
     13564bd:	00 00 
     13564bf:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
     13564c6:	00 
     13564c7:	be 90 00 00 00       	mov    esi,0x90
     13564cc:	49 8d 2c 37          	lea    rbp,[r15+rsi*1]
     13564d0:	4c 01 e6             	add    rsi,r12
     13564d3:	48 89 ef             	mov    rdi,rbp
     13564d6:	e8 65 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13564db:	49 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [r12+0xa8]
     13564e2:	00 
     13564e3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
     13564ea:	be b0 00 00 00       	mov    esi,0xb0
     13564ef:	49 8d 3c 37          	lea    rdi,[r15+rsi*1]
     13564f3:	4c 01 e6             	add    rsi,r12
     13564f6:	e8 6b 62 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     13564fb:	41 0f 10 84 24 d0 00 	movups xmm0,XMMWORD PTR [r12+0xd0]
     1356502:	00 00 
     1356504:	41 0f 10 8c 24 d9 00 	movups xmm1,XMMWORD PTR [r12+0xd9]
     135650b:	00 00 
     135650d:	41 0f 11 8f d9 00 00 	movups XMMWORD PTR [r15+0xd9],xmm1
     1356514:	00 
     1356515:	41 0f 11 87 d0 00 00 	movups XMMWORD PTR [r15+0xd0],xmm0
     135651c:	00 
     135651d:	49 8b 84 24 f0 00 00 	mov    rax,QWORD PTR [r12+0xf0]
     1356524:	00 
     1356525:	49 89 87 f0 00 00 00 	mov    QWORD PTR [r15+0xf0],rax
     135652c:	49 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [r12+0xf8]
     1356533:	00 
     1356534:	49 89 87 f8 00 00 00 	mov    QWORD PTR [r15+0xf8],rax
     135653b:	48 85 c0             	test   rax,rax
     135653e:	74 05                	je     1356545 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bac9>

### 0x1356815: movups XMMWORD PTR [rbx+0xa8],xmm0
     13567d9:	41 0f 10 57 79       	movups xmm2,XMMWORD PTR [r15+0x79]
     13567de:	0f 11 53 79          	movups XMMWORD PTR [rbx+0x79],xmm2
     13567e2:	0f 11 4b 70          	movups XMMWORD PTR [rbx+0x70],xmm1
     13567e6:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
     13567ea:	be 90 00 00 00       	mov    esi,0x90
     13567ef:	4c 8d 24 33          	lea    r12,[rbx+rsi*1]
     13567f3:	4c 01 fe             	add    rsi,r15
     13567f6:	4c 89 e7             	mov    rdi,r12
     13567f9:	e8 ac f3 ee ff       	call   1245baa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b12e>
     13567fe:	41 0f 10 87 a8 00 00 	movups xmm0,XMMWORD PTR [r15+0xa8]
     1356805:	00 
     1356806:	41 0f 10 8f b8 00 00 	movups xmm1,XMMWORD PTR [r15+0xb8]
     135680d:	00 
     135680e:	0f 11 8b b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm1
     1356815:	0f 11 83 a8 00 00 00 	movups XMMWORD PTR [rbx+0xa8],xmm0
     135681c:	be c8 00 00 00       	mov    esi,0xc8
     1356821:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1356825:	4c 01 fe             	add    rsi,r15
     1356828:	e8 55 00 00 00       	call   1356882 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19be06>
     135682d:	41 8a 87 30 01 00 00 	mov    al,BYTE PTR [r15+0x130]
     1356834:	88 83 30 01 00 00    	mov    BYTE PTR [rbx+0x130],al
     135683a:	49 8b 87 28 01 00 00 	mov    rax,QWORD PTR [r15+0x128]
     1356841:	48 89 83 28 01 00 00 	mov    QWORD PTR [rbx+0x128],rax
     1356848:	48 83 c4 08          	add    rsp,0x8
     135684c:	5b                   	pop    rbx
     135684d:	41 5c                	pop    r12
     135684f:	41 5e                	pop    r14
     1356851:	41 5f                	pop    r15
     1356853:	c3                   	ret
     1356854:	49 89 c7             	mov    r15,rax
     1356857:	4c 89 e7             	mov    rdi,r12
     135685a:	e8 bb dc ec ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     135685f:	eb 03                	jmp    1356864 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bde8>
     1356861:	49 89 c7             	mov    r15,rax
     1356864:	4c 89 f7             	mov    rdi,r14

### 0x1356c85: mov    QWORD PTR [rbx+0xa8],rax
     1356c4d:	4c 89 f6             	mov    rsi,r14
     1356c50:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
     1356c53:	41 8b 47 60          	mov    eax,DWORD PTR [r15+0x60]
     1356c57:	89 43 60             	mov    DWORD PTR [rbx+0x60],eax
     1356c5a:	4c 8d 63 68          	lea    r12,[rbx+0x68]
     1356c5e:	49 8d 77 68          	lea    rsi,[r15+0x68]
     1356c62:	4c 89 e7             	mov    rdi,r12
     1356c65:	e8 fc 5a 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     1356c6a:	be 88 00 00 00       	mov    esi,0x88
     1356c6f:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
     1356c73:	4c 01 fe             	add    rsi,r15
     1356c76:	4c 89 ef             	mov    rdi,r13
     1356c79:	e8 e8 5a 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     1356c7e:	49 8b 87 a8 00 00 00 	mov    rax,QWORD PTR [r15+0xa8]
     1356c85:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     1356c8c:	be b0 00 00 00       	mov    esi,0xb0
     1356c91:	48 8d 2c 33          	lea    rbp,[rbx+rsi*1]
     1356c95:	4c 01 fe             	add    rsi,r15
     1356c98:	48 89 ef             	mov    rdi,rbp
     1356c9b:	e8 c6 5a 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     1356ca0:	49 8b 87 d0 00 00 00 	mov    rax,QWORD PTR [r15+0xd0]
     1356ca7:	49 8b 8f d5 00 00 00 	mov    rcx,QWORD PTR [r15+0xd5]
     1356cae:	48 89 8b d5 00 00 00 	mov    QWORD PTR [rbx+0xd5],rcx
     1356cb5:	48 89 83 d0 00 00 00 	mov    QWORD PTR [rbx+0xd0],rax
     1356cbc:	be e0 00 00 00       	mov    esi,0xe0
     1356cc1:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1356cc5:	4c 01 fe             	add    rsi,r15
     1356cc8:	e8 dd ee ee ff       	call   1245baa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b12e>
     1356ccd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1356cd4:	00 00 
     1356cd6:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1356cdb:	0f 85 87 00 00 00    	jne    1356d68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c2ec>
     1356ce1:	b8 f8 00 00 00       	mov    eax,0xf8
     1356ce6:	48 01 c3             	add    rbx,rax
     1356ce9:	49 01 c7             	add    r15,rax

### 0x1356dca: mov    DWORD PTR [rbx+0xa0],eax
     1356d8a:	4c 89 f7             	mov    rdi,r14
     1356d8d:	e8 d4 59 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     1356d92:	4c 8d 63 68          	lea    r12,[rbx+0x68]
     1356d96:	49 8d 77 68          	lea    rsi,[r15+0x68]
     1356d9a:	4c 89 e7             	mov    rdi,r12
     1356d9d:	e8 9e 71 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1356da2:	41 8a 87 80 00 00 00 	mov    al,BYTE PTR [r15+0x80]
     1356da9:	88 83 80 00 00 00    	mov    BYTE PTR [rbx+0x80],al
     1356daf:	be 88 00 00 00       	mov    esi,0x88
     1356db4:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
     1356db8:	4c 01 fe             	add    rsi,r15
     1356dbb:	4c 89 ef             	mov    rdi,r13
     1356dbe:	e8 7d 71 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1356dc3:	41 8b 87 a0 00 00 00 	mov    eax,DWORD PTR [r15+0xa0]
     1356dca:	89 83 a0 00 00 00    	mov    DWORD PTR [rbx+0xa0],eax
     1356dd0:	be a8 00 00 00       	mov    esi,0xa8
     1356dd5:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1356dd9:	4c 01 fe             	add    rsi,r15
     1356ddc:	e8 c9 ed ee ff       	call   1245baa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b12e>
     1356de1:	41 8a 87 e0 00 00 00 	mov    al,BYTE PTR [r15+0xe0]
     1356de8:	88 83 e0 00 00 00    	mov    BYTE PTR [rbx+0xe0],al
     1356dee:	41 0f 10 87 c0 00 00 	movups xmm0,XMMWORD PTR [r15+0xc0]
     1356df5:	00 
     1356df6:	41 0f 10 8f d0 00 00 	movups xmm1,XMMWORD PTR [r15+0xd0]
     1356dfd:	00 
     1356dfe:	0f 11 8b d0 00 00 00 	movups XMMWORD PTR [rbx+0xd0],xmm1
     1356e05:	0f 11 83 c0 00 00 00 	movups XMMWORD PTR [rbx+0xc0],xmm0
     1356e0c:	5b                   	pop    rbx
     1356e0d:	41 5c                	pop    r12
     1356e0f:	41 5d                	pop    r13
     1356e11:	41 5e                	pop    r14
     1356e13:	41 5f                	pop    r15
     1356e15:	c3                   	ret
     1356e16:	49 89 c7             	mov    r15,rax
     1356e19:	4c 89 ef             	mov    rdi,r13

### 0x1357199: mov    QWORD PTR [rbx+0xa8],rax
     1357158:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     135715c:	49 8d 76 50          	lea    rsi,[r14+0x50]
     1357160:	e8 c9 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357165:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     1357169:	49 8d 76 68          	lea    rsi,[r14+0x68]
     135716d:	e8 bc 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357172:	41 0f 10 86 80 00 00 	movups xmm0,XMMWORD PTR [r14+0x80]
     1357179:	00 
     135717a:	0f 11 83 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm0
     1357181:	be 90 00 00 00       	mov    esi,0x90
     1357186:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     135718a:	4c 01 f6             	add    rsi,r14
     135718d:	e8 9c 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357192:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
     1357199:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     13571a0:	be b0 00 00 00       	mov    esi,0xb0
     13571a5:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     13571a9:	4c 01 f6             	add    rsi,r14
     13571ac:	e8 b3 e5 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
     13571b1:	41 0f 10 86 d0 00 00 	movups xmm0,XMMWORD PTR [r14+0xd0]
     13571b8:	00 
     13571b9:	41 0f 10 8e d9 00 00 	movups xmm1,XMMWORD PTR [r14+0xd9]
     13571c0:	00 
     13571c1:	0f 11 83 d0 00 00 00 	movups XMMWORD PTR [rbx+0xd0],xmm0
     13571c8:	0f 11 8b d9 00 00 00 	movups XMMWORD PTR [rbx+0xd9],xmm1
     13571cf:	b8 f0 00 00 00       	mov    eax,0xf0
     13571d4:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
     13571d8:	49 01 c6             	add    r14,rax
     13571db:	4c 89 f6             	mov    rsi,r14
     13571de:	e8 39 26 76 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     13571e3:	48 89 d8             	mov    rax,rbx
     13571e6:	48 83 c4 08          	add    rsp,0x8
     13571ea:	5b                   	pop    rbx
     13571eb:	41 5e                	pop    r14
     13571ed:	c3                   	ret

### 0x1357429: mov    QWORD PTR [rdi+0xa0],rax
     13573e6:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     13573ea:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
     13573ee:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
     13573f2:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     13573f6:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     13573fb:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     13573ff:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     1357403:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     1357407:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     135740b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     135740f:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     1357414:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
     135741b:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
     1357422:	48 8b 86 a0 00 00 00 	mov    rax,QWORD PTR [rsi+0xa0]
     1357429:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     1357430:	0f 10 8e 90 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x90]
     1357437:	0f 11 8f 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm1
     135743e:	48 83 a6 a0 00 00 00 	and    QWORD PTR [rsi+0xa0],0x0
     1357445:	00 
     1357446:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
     135744d:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     1357454:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     135745b:	31 c0                	xor    eax,eax
     135745d:	88 87 b0 00 00 00    	mov    BYTE PTR [rdi+0xb0],al
     1357463:	88 87 c8 00 00 00    	mov    BYTE PTR [rdi+0xc8],al
     1357469:	38 86 c8 00 00 00    	cmp    BYTE PTR [rsi+0xc8],al
     135746f:	74 32                	je     13574a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ca27>
     1357471:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     1357478:	48 8b 8e c0 00 00 00 	mov    rcx,QWORD PTR [rsi+0xc0]
     135747f:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     1357483:	0f 10 8e b0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xb0]
     135748a:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     135748d:	0f 11 86 b0 00 00 00 	movups XMMWORD PTR [rsi+0xb0],xmm0
     1357494:	48 83 a6 c0 00 00 00 	and    QWORD PTR [rsi+0xc0],0x0
     135749b:	00 

### 0x1357454: mov    QWORD PTR [rdi+0xa8],rax
     1357403:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     1357407:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     135740b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     135740f:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     1357414:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
     135741b:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
     1357422:	48 8b 86 a0 00 00 00 	mov    rax,QWORD PTR [rsi+0xa0]
     1357429:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     1357430:	0f 10 8e 90 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x90]
     1357437:	0f 11 8f 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm1
     135743e:	48 83 a6 a0 00 00 00 	and    QWORD PTR [rsi+0xa0],0x0
     1357445:	00 
     1357446:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
     135744d:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     1357454:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     135745b:	31 c0                	xor    eax,eax
     135745d:	88 87 b0 00 00 00    	mov    BYTE PTR [rdi+0xb0],al
     1357463:	88 87 c8 00 00 00    	mov    BYTE PTR [rdi+0xc8],al
     1357469:	38 86 c8 00 00 00    	cmp    BYTE PTR [rsi+0xc8],al
     135746f:	74 32                	je     13574a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ca27>
     1357471:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     1357478:	48 8b 8e c0 00 00 00 	mov    rcx,QWORD PTR [rsi+0xc0]
     135747f:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     1357483:	0f 10 8e b0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xb0]
     135748a:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     135748d:	0f 11 86 b0 00 00 00 	movups XMMWORD PTR [rsi+0xb0],xmm0
     1357494:	48 83 a6 c0 00 00 00 	and    QWORD PTR [rsi+0xc0],0x0
     135749b:	00 
     135749c:	c6 87 c8 00 00 00 01 	mov    BYTE PTR [rdi+0xc8],0x1
     13574a3:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
     13574aa:	0f 10 96 d9 00 00 00 	movups xmm2,XMMWORD PTR [rsi+0xd9]
     13574b1:	0f 11 97 d9 00 00 00 	movups XMMWORD PTR [rdi+0xd9],xmm2
     13574b8:	0f 11 8f d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm1
     13574bf:	48 8b 86 f0 00 00 00 	mov    rax,QWORD PTR [rsi+0xf0]
     13574c6:	48 89 87 f0 00 00 00 	mov    QWORD PTR [rdi+0xf0],rax

### 0x135771f: mov    DWORD PTR [rdi+0xa0],eax
     13576d1:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     13576d5:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     13576d9:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     13576dd:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     13576e2:	8a 86 80 00 00 00    	mov    al,BYTE PTR [rsi+0x80]
     13576e8:	88 87 80 00 00 00    	mov    BYTE PTR [rdi+0x80],al
     13576ee:	48 8b 86 98 00 00 00 	mov    rax,QWORD PTR [rsi+0x98]
     13576f5:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
     13576fc:	0f 10 8e 88 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x88]
     1357703:	0f 11 8f 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm1
     135770a:	48 83 a6 98 00 00 00 	and    QWORD PTR [rsi+0x98],0x0
     1357711:	00 
     1357712:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
     1357719:	8b 86 a0 00 00 00    	mov    eax,DWORD PTR [rsi+0xa0]
     135771f:	89 87 a0 00 00 00    	mov    DWORD PTR [rdi+0xa0],eax
     1357725:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
     135772c:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
     1357733:	00 
     1357734:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     135773b:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     1357742:	48 8b 86 b0 00 00 00 	mov    rax,QWORD PTR [rsi+0xb0]
     1357749:	48 89 87 b0 00 00 00 	mov    QWORD PTR [rdi+0xb0],rax
     1357750:	48 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [rsi+0xb8]
     1357757:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
     135775e:	48 83 a6 b8 00 00 00 	and    QWORD PTR [rsi+0xb8],0x0
     1357765:	00 
     1357766:	0f 11 86 a8 00 00 00 	movups XMMWORD PTR [rsi+0xa8],xmm0
     135776d:	8a 86 e0 00 00 00    	mov    al,BYTE PTR [rsi+0xe0]
     1357773:	88 87 e0 00 00 00    	mov    BYTE PTR [rdi+0xe0],al
     1357779:	0f 10 86 c0 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xc0]
     1357780:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
     1357787:	0f 11 8f d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm1
     135778e:	0f 11 87 c0 00 00 00 	movups XMMWORD PTR [rdi+0xc0],xmm0
     1357795:	c3                   	ret
     1357796:	80 bf 90 00 00 00 00 	cmp    BYTE PTR [rdi+0x90],0x0

### 0x1357725: movups XMMWORD PTR [rdi+0xa8],xmm0
     13576d5:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     13576d9:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     13576dd:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     13576e2:	8a 86 80 00 00 00    	mov    al,BYTE PTR [rsi+0x80]
     13576e8:	88 87 80 00 00 00    	mov    BYTE PTR [rdi+0x80],al
     13576ee:	48 8b 86 98 00 00 00 	mov    rax,QWORD PTR [rsi+0x98]
     13576f5:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
     13576fc:	0f 10 8e 88 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x88]
     1357703:	0f 11 8f 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm1
     135770a:	48 83 a6 98 00 00 00 	and    QWORD PTR [rsi+0x98],0x0
     1357711:	00 
     1357712:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
     1357719:	8b 86 a0 00 00 00    	mov    eax,DWORD PTR [rsi+0xa0]
     135771f:	89 87 a0 00 00 00    	mov    DWORD PTR [rdi+0xa0],eax
     1357725:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
     135772c:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
     1357733:	00 
     1357734:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     135773b:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     1357742:	48 8b 86 b0 00 00 00 	mov    rax,QWORD PTR [rsi+0xb0]
     1357749:	48 89 87 b0 00 00 00 	mov    QWORD PTR [rdi+0xb0],rax
     1357750:	48 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [rsi+0xb8]
     1357757:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
     135775e:	48 83 a6 b8 00 00 00 	and    QWORD PTR [rsi+0xb8],0x0
     1357765:	00 
     1357766:	0f 11 86 a8 00 00 00 	movups XMMWORD PTR [rsi+0xa8],xmm0
     135776d:	8a 86 e0 00 00 00    	mov    al,BYTE PTR [rsi+0xe0]
     1357773:	88 87 e0 00 00 00    	mov    BYTE PTR [rdi+0xe0],al
     1357779:	0f 10 86 c0 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xc0]
     1357780:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
     1357787:	0f 11 8f d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm1
     135778e:	0f 11 87 c0 00 00 00 	movups XMMWORD PTR [rdi+0xc0],xmm0
     1357795:	c3                   	ret
     1357796:	80 bf 90 00 00 00 00 	cmp    BYTE PTR [rdi+0x90],0x0
     135779d:	74 11                	je     13577b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cd34>

### 0x135773b: mov    QWORD PTR [rdi+0xa8],rax
     13576e8:	88 87 80 00 00 00    	mov    BYTE PTR [rdi+0x80],al
     13576ee:	48 8b 86 98 00 00 00 	mov    rax,QWORD PTR [rsi+0x98]
     13576f5:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
     13576fc:	0f 10 8e 88 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x88]
     1357703:	0f 11 8f 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm1
     135770a:	48 83 a6 98 00 00 00 	and    QWORD PTR [rsi+0x98],0x0
     1357711:	00 
     1357712:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
     1357719:	8b 86 a0 00 00 00    	mov    eax,DWORD PTR [rsi+0xa0]
     135771f:	89 87 a0 00 00 00    	mov    DWORD PTR [rdi+0xa0],eax
     1357725:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
     135772c:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
     1357733:	00 
     1357734:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     135773b:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     1357742:	48 8b 86 b0 00 00 00 	mov    rax,QWORD PTR [rsi+0xb0]
     1357749:	48 89 87 b0 00 00 00 	mov    QWORD PTR [rdi+0xb0],rax
     1357750:	48 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [rsi+0xb8]
     1357757:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
     135775e:	48 83 a6 b8 00 00 00 	and    QWORD PTR [rsi+0xb8],0x0
     1357765:	00 
     1357766:	0f 11 86 a8 00 00 00 	movups XMMWORD PTR [rsi+0xa8],xmm0
     135776d:	8a 86 e0 00 00 00    	mov    al,BYTE PTR [rsi+0xe0]
     1357773:	88 87 e0 00 00 00    	mov    BYTE PTR [rdi+0xe0],al
     1357779:	0f 10 86 c0 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xc0]
     1357780:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
     1357787:	0f 11 8f d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm1
     135778e:	0f 11 87 c0 00 00 00 	movups XMMWORD PTR [rdi+0xc0],xmm0
     1357795:	c3                   	ret
     1357796:	80 bf 90 00 00 00 00 	cmp    BYTE PTR [rdi+0x90],0x0
     135779d:	74 11                	je     13577b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cd34>
     135779f:	53                   	push   rbx
     13577a0:	48 89 fb             	mov    rbx,rdi
     13577a3:	e8 aa ee ff ff       	call   1356652 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbd6>
     13577a8:	c6 83 90 00 00 00 00 	mov    BYTE PTR [rbx+0x90],0x0

### 0x1357766: movups XMMWORD PTR [rsi+0xa8],xmm0
     1357712:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
     1357719:	8b 86 a0 00 00 00    	mov    eax,DWORD PTR [rsi+0xa0]
     135771f:	89 87 a0 00 00 00    	mov    DWORD PTR [rdi+0xa0],eax
     1357725:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
     135772c:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
     1357733:	00 
     1357734:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     135773b:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     1357742:	48 8b 86 b0 00 00 00 	mov    rax,QWORD PTR [rsi+0xb0]
     1357749:	48 89 87 b0 00 00 00 	mov    QWORD PTR [rdi+0xb0],rax
     1357750:	48 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [rsi+0xb8]
     1357757:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
     135775e:	48 83 a6 b8 00 00 00 	and    QWORD PTR [rsi+0xb8],0x0
     1357765:	00 
     1357766:	0f 11 86 a8 00 00 00 	movups XMMWORD PTR [rsi+0xa8],xmm0
     135776d:	8a 86 e0 00 00 00    	mov    al,BYTE PTR [rsi+0xe0]
     1357773:	88 87 e0 00 00 00    	mov    BYTE PTR [rdi+0xe0],al
     1357779:	0f 10 86 c0 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xc0]
     1357780:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
     1357787:	0f 11 8f d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm1
     135778e:	0f 11 87 c0 00 00 00 	movups XMMWORD PTR [rdi+0xc0],xmm0
     1357795:	c3                   	ret
     1357796:	80 bf 90 00 00 00 00 	cmp    BYTE PTR [rdi+0x90],0x0
     135779d:	74 11                	je     13577b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cd34>
     135779f:	53                   	push   rbx
     13577a0:	48 89 fb             	mov    rbx,rdi
     13577a3:	e8 aa ee ff ff       	call   1356652 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbd6>
     13577a8:	c6 83 90 00 00 00 00 	mov    BYTE PTR [rbx+0x90],0x0
     13577af:	5b                   	pop    rbx
     13577b0:	c3                   	ret
     13577b1:	cc                   	int3
     13577b2:	41 56                	push   r14
     13577b4:	53                   	push   rbx
     13577b5:	50                   	push   rax
     13577b6:	48 89 d3             	mov    rbx,rdx

### 0x1357a3c: mov    DWORD PTR [r14+0xa0],eax
     13579f9:	e8 9e e1 eb ff       	call   1215b9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b120>
     13579fe:	49 8d 7e 48          	lea    rdi,[r14+0x48]
     1357a02:	48 8d 73 48          	lea    rsi,[rbx+0x48]
     1357a06:	e8 59 dd 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
     1357a0b:	49 8d 7e 68          	lea    rdi,[r14+0x68]
     1357a0f:	48 8d 73 68          	lea    rsi,[rbx+0x68]
     1357a13:	e8 16 40 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357a18:	8a 83 80 00 00 00    	mov    al,BYTE PTR [rbx+0x80]
     1357a1e:	41 88 86 80 00 00 00 	mov    BYTE PTR [r14+0x80],al
     1357a25:	be 88 00 00 00       	mov    esi,0x88
     1357a2a:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
     1357a2e:	48 01 de             	add    rsi,rbx
     1357a31:	e8 f8 3f 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357a36:	8b 83 a0 00 00 00    	mov    eax,DWORD PTR [rbx+0xa0]
     1357a3c:	41 89 86 a0 00 00 00 	mov    DWORD PTR [r14+0xa0],eax
     1357a43:	be a8 00 00 00       	mov    esi,0xa8
     1357a48:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
     1357a4c:	48 01 de             	add    rsi,rbx
     1357a4f:	e8 cc 03 00 00       	call   1357e20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d3a4>
     1357a54:	8a 83 e0 00 00 00    	mov    al,BYTE PTR [rbx+0xe0]
     1357a5a:	41 88 86 e0 00 00 00 	mov    BYTE PTR [r14+0xe0],al
     1357a61:	0f 10 83 c0 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xc0]
     1357a68:	0f 10 8b d0 00 00 00 	movups xmm1,XMMWORD PTR [rbx+0xd0]
     1357a6f:	41 0f 11 8e d0 00 00 	movups XMMWORD PTR [r14+0xd0],xmm1
     1357a76:	00 
     1357a77:	41 0f 11 86 c0 00 00 	movups XMMWORD PTR [r14+0xc0],xmm0
     1357a7e:	00 
     1357a7f:	48 83 c4 08          	add    rsp,0x8
     1357a83:	5b                   	pop    rbx
     1357a84:	41 5e                	pop    r14
     1357a86:	c3                   	ret
     1357a87:	cc                   	int3
     1357a88:	41 56                	push   r14
     1357a8a:	53                   	push   rbx
     1357a8b:	48 83 ec 18          	sub    rsp,0x18

### 0x1357b39: mov    DWORD PTR [r14+0xa8],eax
     1357b01:	48 83 c4 18          	add    rsp,0x18
     1357b05:	5b                   	pop    rbx
     1357b06:	41 5e                	pop    r14
     1357b08:	e9 6b 05 00 00       	jmp    1358078 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d5fc>
     1357b0d:	48 89 f7             	mov    rdi,rsi
     1357b10:	e8 4f cb ec ff       	call   1224664 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
     1357b15:	49 8d 7e 68          	lea    rdi,[r14+0x68]
     1357b19:	48 8d 73 68          	lea    rsi,[rbx+0x68]
     1357b1d:	e8 42 dc 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
     1357b22:	be 88 00 00 00       	mov    esi,0x88
     1357b27:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
     1357b2b:	48 01 de             	add    rsi,rbx
     1357b2e:	e8 31 dc 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
     1357b33:	8b 83 a8 00 00 00    	mov    eax,DWORD PTR [rbx+0xa8]
     1357b39:	41 89 86 a8 00 00 00 	mov    DWORD PTR [r14+0xa8],eax
     1357b40:	8a 83 ac 00 00 00    	mov    al,BYTE PTR [rbx+0xac]
     1357b46:	41 88 86 ac 00 00 00 	mov    BYTE PTR [r14+0xac],al
     1357b4d:	be b0 00 00 00       	mov    esi,0xb0
     1357b52:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
     1357b56:	48 01 de             	add    rsi,rbx
     1357b59:	e8 06 dc 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
     1357b5e:	48 8b 83 d0 00 00 00 	mov    rax,QWORD PTR [rbx+0xd0]
     1357b65:	48 8b 8b d5 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd5]
     1357b6c:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
     1357b73:	49 89 8e d5 00 00 00 	mov    QWORD PTR [r14+0xd5],rcx
     1357b7a:	be e0 00 00 00       	mov    esi,0xe0
     1357b7f:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
     1357b83:	48 01 de             	add    rsi,rbx
     1357b86:	e8 95 02 00 00       	call   1357e20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d3a4>
     1357b8b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1357b92:	00 00 
     1357b94:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1357b99:	75 2c                	jne    1357bc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d14b>
     1357b9b:	b8 f8 00 00 00       	mov    eax,0xf8
     1357ba0:	49 01 c6             	add    r14,rax

### 0x1357da4: movups XMMWORD PTR [r14+0xa8],xmm0
     1357d62:	0f 10 43 60          	movups xmm0,XMMWORD PTR [rbx+0x60]
     1357d66:	0f 10 4b 70          	movups xmm1,XMMWORD PTR [rbx+0x70]
     1357d6a:	0f 10 53 79          	movups xmm2,XMMWORD PTR [rbx+0x79]
     1357d6e:	41 0f 11 56 79       	movups XMMWORD PTR [r14+0x79],xmm2
     1357d73:	41 0f 11 4e 70       	movups XMMWORD PTR [r14+0x70],xmm1
     1357d78:	41 0f 11 46 60       	movups XMMWORD PTR [r14+0x60],xmm0
     1357d7d:	be 90 00 00 00       	mov    esi,0x90
     1357d82:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
     1357d86:	48 01 de             	add    rsi,rbx
     1357d89:	e8 92 00 00 00       	call   1357e20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d3a4>
     1357d8e:	0f 10 83 a8 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xa8]
     1357d95:	0f 10 8b b1 00 00 00 	movups xmm1,XMMWORD PTR [rbx+0xb1]
     1357d9c:	41 0f 11 8e b1 00 00 	movups XMMWORD PTR [r14+0xb1],xmm1
     1357da3:	00 
     1357da4:	41 0f 11 86 a8 00 00 	movups XMMWORD PTR [r14+0xa8],xmm0
     1357dab:	00 
     1357dac:	be c8 00 00 00       	mov    esi,0xc8
     1357db1:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
     1357db5:	48 01 de             	add    rsi,rbx
     1357db8:	e8 9b 00 00 00       	call   1357e58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d3dc>
     1357dbd:	48 8b 83 28 01 00 00 	mov    rax,QWORD PTR [rbx+0x128]
     1357dc4:	49 89 86 28 01 00 00 	mov    QWORD PTR [r14+0x128],rax
     1357dcb:	8a 83 30 01 00 00    	mov    al,BYTE PTR [rbx+0x130]
     1357dd1:	41 88 86 30 01 00 00 	mov    BYTE PTR [r14+0x130],al
     1357dd8:	48 83 c4 08          	add    rsp,0x8
     1357ddc:	5b                   	pop    rbx
     1357ddd:	41 5e                	pop    r14
     1357ddf:	c3                   	ret
     1357de0:	48 89 de             	mov    rsi,rbx
     1357de3:	48 83 c4 08          	add    rsp,0x8
     1357de7:	5b                   	pop    rbx
     1357de8:	41 5e                	pop    r14
     1357dea:	e9 01 00 00 00       	jmp    1357df0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d374>
     1357def:	cc                   	int3
     1357df0:	41 56                	push   r14

### 0x13585d6: mov    QWORD PTR [rsp+0xa0],rax
     13585b1:	41 5e                	pop    r14
     13585b3:	41 5f                	pop    r15
     13585b5:	c3                   	ret
     13585b6:	e8 f5 74 49 00       	call   17efab0 <__stack_chk_fail@plt>
     13585bb:	cc                   	int3
     13585bc:	55                   	push   rbp
     13585bd:	41 57                	push   r15
     13585bf:	41 56                	push   r14
     13585c1:	41 55                	push   r13
     13585c3:	41 54                	push   r12
     13585c5:	53                   	push   rbx
     13585c6:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     13585cd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13585d4:	00 00 
     13585d6:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     13585dd:	00 
     13585de:	80 bf d9 04 00 00 00 	cmp    BYTE PTR [rdi+0x4d9],0x0
     13585e5:	0f 85 8d 00 00 00    	jne    1358678 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dbfc>
     13585eb:	44 89 c3             	mov    ebx,r8d
     13585ee:	49 89 f5             	mov    r13,rsi
     13585f1:	49 89 fc             	mov    r12,rdi
     13585f4:	48 89 14 24          	mov    QWORD PTR [rsp],rdx
     13585f8:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     13585fd:	c6 87 d9 04 00 00 01 	mov    BYTE PTR [rdi+0x4d9],0x1
     1358604:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1358609:	4c 89 e6             	mov    rsi,r12
     135860c:	e8 c9 fe ff ff       	call   13584da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19da5e>
     1358611:	4c 89 e7             	mov    rdi,r12
     1358614:	e8 f1 fe ff ff       	call   135850a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19da8e>
     1358619:	48 89 c1             	mov    rcx,rax
     135861c:	48 c1 e9 20          	shr    rcx,0x20
     1358620:	0f 45 d8             	cmovne ebx,eax
     1358623:	4d 8b 75 00          	mov    r14,QWORD PTR [r13+0x0]
     1358627:	4d 8b 7d 08          	mov    r15,QWORD PTR [r13+0x8]
     135862b:	4d 39 fe             	cmp    r14,r15

### 0x135a7be: mov    QWORD PTR [rsp+0xa0],r12
     135a784:	49 89 c6             	mov    r14,rax
     135a787:	48 89 df             	mov    rdi,rbx
     135a78a:	e8 11 8b 80 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     135a78f:	49 8b 4c 24 20       	mov    rcx,QWORD PTR [r12+0x20]
     135a794:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
     135a799:	4d 8b 7c 24 68       	mov    r15,QWORD PTR [r12+0x68]
     135a79e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     135a7a1:	48 89 c7             	mov    rdi,rax
     135a7a4:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     135a7a7:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     135a7ac:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
     135a7b1:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     135a7b6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     135a7bd:	00 
     135a7be:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     135a7c5:	00 
     135a7c6:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
     135a7cd:	00 
     135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
     135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
     135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
     135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
     135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     135a80e:	00 
     135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     135a816:	00 
     135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0

### 0x135aa3e: mov    QWORD PTR [rsp+0xa8],rax
     135aa12:	00 
     135aa13:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa16:	4c 89 f7             	mov    rdi,r14
     135aa19:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa1c:	49 89 c7             	mov    r15,rax
     135aa1f:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     135aa24:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135aa27:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     135aa2c:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa2f:	4c 89 f7             	mov    rdi,r14
     135aa32:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa35:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa38:	4c 89 f7             	mov    rdi,r14
     135aa3b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa3e:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135aa45:	00 
     135aa46:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     135aa4b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135aa4e:	48 8d 35 9b b0 0d ff 	lea    rsi,[rip+0xffffffffff0db09b]        # 435af0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b53f>
     135aa55:	48 8d 0d b4 b0 0d ff 	lea    rcx,[rip+0xffffffffff0db0b4]        # 435b10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b55f>
     135aa5c:	6a 10                	push   0x10
     135aa5e:	41 5e                	pop    r14
     135aa60:	6a 29                	push   0x29
     135aa62:	41 58                	pop    r8
     135aa64:	4c 89 f2             	mov    rdx,r14
     135aa67:	45 31 c9             	xor    r9d,r9d
     135aa6a:	e8 ef ca 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135aa6f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135aa72:	48 8d 35 a7 b1 0d ff 	lea    rsi,[rip+0xffffffffff0db1a7]        # 435c20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b66f>
     135aa79:	48 8d 0d c0 b1 0d ff 	lea    rcx,[rip+0xffffffffff0db1c0]        # 435c40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b68f>
     135aa80:	6a 1a                	push   0x1a
     135aa82:	41 58                	pop    r8
     135aa84:	4c 89 f2             	mov    rdx,r14
     135aa87:	45 31 c9             	xor    r9d,r9d
     135aa8a:	68 80 96 98 00       	push   0x989680

### 0x135cd61: mov    QWORD PTR [rsp+0xa8],rcx
     135cd29:	0f 11 84 24 c8 00 00 	movups XMMWORD PTR [rsp+0xc8],xmm0
     135cd30:	00 
     135cd31:	4c 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r8
     135cd38:	00 
     135cd39:	48 89 8c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rcx
     135cd40:	00 
     135cd41:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
     135cd48:	00 
     135cd49:	48 8b 8c 24 78 01 00 	mov    rcx,QWORD PTR [rsp+0x178]
     135cd50:	00 
     135cd51:	48 89 8c 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rcx
     135cd58:	00 
     135cd59:	48 8b 8c 24 28 01 00 	mov    rcx,QWORD PTR [rsp+0x128]
     135cd60:	00 
     135cd61:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
     135cd68:	00 
     135cd69:	48 8b 8c 24 18 01 00 	mov    rcx,QWORD PTR [rsp+0x118]
     135cd70:	00 
     135cd71:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     135cd78:	00 
     135cd79:	48 8b 8c 24 30 01 00 	mov    rcx,QWORD PTR [rsp+0x130]
     135cd80:	00 
     135cd81:	48 89 8c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rcx
     135cd88:	00 
     135cd89:	48 8d 8c 24 e8 01 00 	lea    rcx,[rsp+0x1e8]
     135cd90:	00 
     135cd91:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     135cd98:	00 
     135cd99:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     135cda0:	00 
     135cda1:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
     135cda8:	00 
     135cda9:	48 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rsi
     135cdb0:	00 
     135cdb1:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12

### 0x135cd71: mov    QWORD PTR [rsp+0xa0],rcx
     135cd39:	48 89 8c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rcx
     135cd40:	00 
     135cd41:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
     135cd48:	00 
     135cd49:	48 8b 8c 24 78 01 00 	mov    rcx,QWORD PTR [rsp+0x178]
     135cd50:	00 
     135cd51:	48 89 8c 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rcx
     135cd58:	00 
     135cd59:	48 8b 8c 24 28 01 00 	mov    rcx,QWORD PTR [rsp+0x128]
     135cd60:	00 
     135cd61:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
     135cd68:	00 
     135cd69:	48 8b 8c 24 18 01 00 	mov    rcx,QWORD PTR [rsp+0x118]
     135cd70:	00 
     135cd71:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     135cd78:	00 
     135cd79:	48 8b 8c 24 30 01 00 	mov    rcx,QWORD PTR [rsp+0x130]
     135cd80:	00 
     135cd81:	48 89 8c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rcx
     135cd88:	00 
     135cd89:	48 8d 8c 24 e8 01 00 	lea    rcx,[rsp+0x1e8]
     135cd90:	00 
     135cd91:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     135cd98:	00 
     135cd99:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     135cda0:	00 
     135cda1:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
     135cda8:	00 
     135cda9:	48 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rsi
     135cdb0:	00 
     135cdb1:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12
     135cdb6:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
     135cdbb:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     135cdc0:	48 8b 84 24 38 01 00 	mov    rax,QWORD PTR [rsp+0x138]
     135cdc7:	00 

### 0x135d0c4: movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
     135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
     135d0f4:	48 89 f5             	mov    rbp,rsi
     135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     135d101:	48 8b 8c 24 88 10 00 	mov    rcx,QWORD PTR [rsp+0x1088]
     135d108:	00 
     135d109:	4c 8d 6f 10          	lea    r13,[rdi+0x10]
     135d10d:	48 8d 47 20          	lea    rax,[rdi+0x20]
     135d111:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     135d118:	00 

### 0x135d15c: mov    QWORD PTR [rsp+0xa8],rax
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
     135d1b4:	4c 89 ff             	mov    rdi,r15
     135d1b7:	4c 89 ac 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r13
     135d1be:	00 

### 0x135d16b: mov    QWORD PTR [rsp+0xa0],rax
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
     135d1b4:	4c 89 ff             	mov    rdi,r15
     135d1b7:	4c 89 ac 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r13
     135d1be:	00 
     135d1bf:	e8 ba c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1c4:	4c 8d a4 24 e8 0a 00 	lea    r12,[rsp+0xae8]
     135d1cb:	00 

### 0x135e5b6: mov    QWORD PTR [r12+0xa0],rax
     135e572:	e8 35 aa cf ff       	call   1058fac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2203c2>
     135e577:	66 0f ef c0          	pxor   xmm0,xmm0
     135e57b:	66 41 0f 7f 44 24 50 	movdqa XMMWORD PTR [r12+0x50],xmm0
     135e582:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
     135e589:	f3 41 0f 7f 44 24 28 	movdqu XMMWORD PTR [r12+0x28],xmm0
     135e590:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     135e596:	41 c7 44 24 60 00 00 	mov    DWORD PTR [r12+0x60],0x3f800000
     135e59d:	80 3f 
     135e59f:	31 db                	xor    ebx,ebx
     135e5a1:	41 88 5c 24 68       	mov    BYTE PTR [r12+0x68],bl
     135e5a6:	41 88 9c 24 98 00 00 	mov    BYTE PTR [r12+0x98],bl
     135e5ad:	00 
     135e5ae:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135e5b5:	00 
     135e5b6:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
     135e5bd:	00 
     135e5be:	48 8b 84 24 90 10 00 	mov    rax,QWORD PTR [rsp+0x1090]
     135e5c5:	00 
     135e5c6:	49 89 84 24 a8 00 00 	mov    QWORD PTR [r12+0xa8],rax
     135e5cd:	00 
     135e5ce:	4d 8d bc 24 d0 00 00 	lea    r15,[r12+0xd0]
     135e5d5:	00 
     135e5d6:	66 41 0f 7f 84 24 b0 	movdqa XMMWORD PTR [r12+0xb0],xmm0
     135e5dd:	00 00 00 
     135e5e0:	f3 41 0f 7f 84 24 b9 	movdqu XMMWORD PTR [r12+0xb9],xmm0
     135e5e7:	00 00 00 
     135e5ea:	4c 89 ff             	mov    rdi,r15
     135e5ed:	e8 04 b4 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e5f2:	49 8d ac 24 e0 00 00 	lea    rbp,[r12+0xe0]
     135e5f9:	00 
     135e5fa:	48 89 ef             	mov    rdi,rbp
     135e5fd:	e8 f4 b3 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e602:	4d 8d ac 24 f0 00 00 	lea    r13,[r12+0xf0]
     135e609:	00 
     135e60a:	48 8d b4 24 60 0f 00 	lea    rsi,[rsp+0xf60]

### 0x135e5c6: mov    QWORD PTR [r12+0xa8],rax
     135e589:	f3 41 0f 7f 44 24 28 	movdqu XMMWORD PTR [r12+0x28],xmm0
     135e590:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     135e596:	41 c7 44 24 60 00 00 	mov    DWORD PTR [r12+0x60],0x3f800000
     135e59d:	80 3f 
     135e59f:	31 db                	xor    ebx,ebx
     135e5a1:	41 88 5c 24 68       	mov    BYTE PTR [r12+0x68],bl
     135e5a6:	41 88 9c 24 98 00 00 	mov    BYTE PTR [r12+0x98],bl
     135e5ad:	00 
     135e5ae:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135e5b5:	00 
     135e5b6:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
     135e5bd:	00 
     135e5be:	48 8b 84 24 90 10 00 	mov    rax,QWORD PTR [rsp+0x1090]
     135e5c5:	00 
     135e5c6:	49 89 84 24 a8 00 00 	mov    QWORD PTR [r12+0xa8],rax
     135e5cd:	00 
     135e5ce:	4d 8d bc 24 d0 00 00 	lea    r15,[r12+0xd0]
     135e5d5:	00 
     135e5d6:	66 41 0f 7f 84 24 b0 	movdqa XMMWORD PTR [r12+0xb0],xmm0
     135e5dd:	00 00 00 
     135e5e0:	f3 41 0f 7f 84 24 b9 	movdqu XMMWORD PTR [r12+0xb9],xmm0
     135e5e7:	00 00 00 
     135e5ea:	4c 89 ff             	mov    rdi,r15
     135e5ed:	e8 04 b4 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e5f2:	49 8d ac 24 e0 00 00 	lea    rbp,[r12+0xe0]
     135e5f9:	00 
     135e5fa:	48 89 ef             	mov    rdi,rbp
     135e5fd:	e8 f4 b3 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e602:	4d 8d ac 24 f0 00 00 	lea    r13,[r12+0xf0]
     135e609:	00 
     135e60a:	48 8d b4 24 60 0f 00 	lea    rsi,[rsp+0xf60]
     135e611:	00 
     135e612:	4c 89 ef             	mov    rdi,r13
     135e615:	e8 d6 98 77 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
     135e61a:	49 83 a4 24 20 01 00 	and    QWORD PTR [r12+0x120],0x0

### 0x135ed66: mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed2a:	e8 01 2e 04 00       	call   13a1b30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e70b4>
     135ed2f:	66 0f ef c0          	pxor   xmm0,xmm0
     135ed33:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ed38:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ed3d:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ed42:	48 89 d8             	mov    rax,rbx
     135ed45:	48 83 c0 68          	add    rax,0x68
     135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ed58:	00 
     135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ed65:	00 
     135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed6d:	00 80 3f 
     135ed70:	6a 64                	push   0x64
     135ed72:	58                   	pop    rax
     135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ed88:	00 
     135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ed90:	00 
     135ed91:	4c 89 ef             	mov    rdi,r13
     135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135eda0:	00 
     135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
     135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135edac:	00 
     135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135edb4:	00 
     135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx

### 0x135ed73: mov    QWORD PTR [rbx+0xa8],rax
     135ed3d:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ed42:	48 89 d8             	mov    rax,rbx
     135ed45:	48 83 c0 68          	add    rax,0x68
     135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ed58:	00 
     135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ed65:	00 
     135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed6d:	00 80 3f 
     135ed70:	6a 64                	push   0x64
     135ed72:	58                   	pop    rax
     135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ed88:	00 
     135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ed90:	00 
     135ed91:	4c 89 ef             	mov    rdi,r13
     135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135eda0:	00 
     135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
     135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135edac:	00 
     135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135edb4:	00 
     135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx
     135edbb:	48 85 ff             	test   rdi,rdi
     135edbe:	74 06                	je     135edc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a434a>
     135edc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edc3:	ff 50 08             	call   QWORD PTR [rax+0x8]

### 0x135ee64: mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee28:	e8 39 4d 04 00       	call   13a3b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e90ea>
     135ee2d:	66 0f ef c0          	pxor   xmm0,xmm0
     135ee31:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ee36:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ee3b:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ee40:	48 89 d8             	mov    rax,rbx
     135ee43:	48 83 c0 68          	add    rax,0x68
     135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ee56:	00 
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ee63:	00 
     135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee6b:	00 80 3f 
     135ee6e:	6a 64                	push   0x64
     135ee70:	58                   	pop    rax
     135ee71:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ee78:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ee7f:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ee86:	00 
     135ee87:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ee8e:	00 
     135ee8f:	4c 89 ef             	mov    rdi,r13
     135ee92:	e8 d3 b0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ee97:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135ee9e:	00 
     135ee9f:	66 0f ef c0          	pxor   xmm0,xmm0
     135eea3:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135eeaa:	00 
     135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135eeb2:	00 
     135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx

### 0x135ee71: mov    QWORD PTR [rbx+0xa8],rax
     135ee3b:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ee40:	48 89 d8             	mov    rax,rbx
     135ee43:	48 83 c0 68          	add    rax,0x68
     135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ee56:	00 
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ee63:	00 
     135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee6b:	00 80 3f 
     135ee6e:	6a 64                	push   0x64
     135ee70:	58                   	pop    rax
     135ee71:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ee78:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ee7f:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ee86:	00 
     135ee87:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ee8e:	00 
     135ee8f:	4c 89 ef             	mov    rdi,r13
     135ee92:	e8 d3 b0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ee97:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135ee9e:	00 
     135ee9f:	66 0f ef c0          	pxor   xmm0,xmm0
     135eea3:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135eeaa:	00 
     135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135eeb2:	00 
     135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx
     135eeb9:	48 85 ff             	test   rdi,rdi
     135eebc:	74 06                	je     135eec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4448>
     135eebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135eec1:	ff 50 08             	call   QWORD PTR [rax+0x8]

## Paired +0xa0/+0xa8 accesses in same local neighborhoods
### centered 0x1308b51
     1308b02:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1308b09:	00 
     1308b0a:	80 4f e8 04          	or     BYTE PTR [rdi-0x18],0x4
     1308b0e:	49 83 c6 30          	add    r14,0x30
     1308b12:	48 8b 57 e0          	mov    rdx,QWORD PTR [rdi-0x20]
     1308b16:	f6 c2 01             	test   dl,0x1
     1308b19:	0f 85 10 01 00 00    	jne    1308c2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e1b3>
     1308b1f:	4c 89 f6             	mov    rsi,r14
     1308b22:	e8 6b cc 45 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1308b27:	4d 8b 6f 38          	mov    r13,QWORD PTR [r15+0x38]
     1308b2b:	49 8b 6f 40          	mov    rbp,QWORD PTR [r15+0x40]
     1308b2f:	4d 8d b7 b0 00 00 00 	lea    r14,[r15+0xb0]
     1308b36:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1308b3d:	00 
     1308b3e:	4c 89 f6             	mov    rsi,r14
     1308b41:	e8 5a 71 47 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
     1308b46:	84 c0                	test   al,al
     1308b48:	74 61                	je     1308bab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e12f>
     1308b4a:	4c 8d 63 18          	lea    r12,[rbx+0x18]
     1308b4e:	4c 29 ed             	sub    rbp,r13
     1308b51:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
     1308b58:	00 
     1308b59:	48 89 ac 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbp
     1308b60:	00 
     1308b61:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]
     1308b68:	00 
     1308b69:	4c 89 ef             	mov    rdi,r13
     1308b6c:	4c 89 f6             	mov    rsi,r14
     1308b6f:	e8 e2 d5 7a ff       	call   ab6156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30f6>
     1308b74:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     1308b79:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
     1308b7e:	0f 10 84 24 a0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xa0]
     1308b85:	00 
     1308b86:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     1308b8a:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1308b91:	00 
     1308b92:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
     1308b99:	00 
     1308b9a:	4c 89 fe             	mov    rsi,r15
     1308b9d:	31 d2                	xor    edx,edx
     1308b9f:	31 c9                	xor    ecx,ecx

### centered 0x1308b7e
     1308b2f:	4d 8d b7 b0 00 00 00 	lea    r14,[r15+0xb0]
     1308b36:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1308b3d:	00 
     1308b3e:	4c 89 f6             	mov    rsi,r14
     1308b41:	e8 5a 71 47 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
     1308b46:	84 c0                	test   al,al
     1308b48:	74 61                	je     1308bab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e12f>
     1308b4a:	4c 8d 63 18          	lea    r12,[rbx+0x18]
     1308b4e:	4c 29 ed             	sub    rbp,r13
     1308b51:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
     1308b58:	00 
     1308b59:	48 89 ac 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbp
     1308b60:	00 
     1308b61:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]
     1308b68:	00 
     1308b69:	4c 89 ef             	mov    rdi,r13
     1308b6c:	4c 89 f6             	mov    rsi,r14
     1308b6f:	e8 e2 d5 7a ff       	call   ab6156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30f6>
     1308b74:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     1308b79:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
     1308b7e:	0f 10 84 24 a0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xa0]
     1308b85:	00 
     1308b86:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     1308b8a:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1308b91:	00 
     1308b92:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
     1308b99:	00 
     1308b9a:	4c 89 fe             	mov    rsi,r15
     1308b9d:	31 d2                	xor    edx,edx
     1308b9f:	31 c9                	xor    ecx,ecx
     1308ba1:	4d 89 e0             	mov    r8,r12
     1308ba4:	e8 6f b3 37 00       	call   1683f18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38084>
     1308ba9:	eb 21                	jmp    1308bcc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e150>
     1308bab:	48 8d 35 3c 85 04 ff 	lea    rsi,[rip+0xffffffffff04853c]        # 3510ee <_ZTSSt12bad_any_cast@@Base-0x3f0da>
     1308bb2:	48 8d 0d c3 93 14 ff 	lea    rcx,[rip+0xffffffffff1493c3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1308bb9:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1308bc0:	00 
     1308bc1:	6a 0a                	push   0xa
     1308bc3:	5a                   	pop    rdx
     1308bc4:	45 31 c0             	xor    r8d,r8d
     1308bc7:	e8 70 10 85 ff       	call   b59c3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6bdc>

### centered 0x13169b6
     1316965:	00 
     1316966:	48 8d 44 24 70       	lea    rax,[rsp+0x70]
     131696b:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1316970:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
     1316974:	48 89 84 24 f0 0d 00 	mov    QWORD PTR [rsp+0xdf0],rax
     131697b:	00 
     131697c:	44 88 b4 24 f8 0d 00 	mov    BYTE PTR [rsp+0xdf8],r14b
     1316983:	00 
     1316984:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     1316989:	4d 85 f6             	test   r14,r14
     131698c:	0f 84 a8 00 00 00    	je     1316a3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15bfbe>
     1316992:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1316997:	4c 89 f6             	mov    rsi,r14
     131699a:	e8 f3 33 f0 ff       	call   1219d92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f316>
     131699f:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
     13169a6:	00 
     13169a7:	4c 8b 78 f8          	mov    r15,QWORD PTR [rax-0x8]
     13169ab:	48 8d 8c 24 a8 00 00 	lea    rcx,[rsp+0xa8]
     13169b2:	00 
     13169b3:	4c 89 39             	mov    QWORD PTR [rcx],r15
     13169b6:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     13169bd:	00 
     13169be:	4c 89 3a             	mov    QWORD PTR [rdx],r15
     13169c1:	48 89 84 24 50 07 00 	mov    QWORD PTR [rsp+0x750],rax
     13169c8:	00 
     13169c9:	48 89 94 24 58 07 00 	mov    QWORD PTR [rsp+0x758],rdx
     13169d0:	00 
     13169d1:	48 89 8c 24 60 07 00 	mov    QWORD PTR [rsp+0x760],rcx
     13169d8:	00 
     13169d9:	c6 84 24 68 07 00 00 	mov    BYTE PTR [rsp+0x768],0x0
     13169e0:	00 
     13169e1:	4d 69 e6 d0 02 00 00 	imul   r12,r14,0x2d0
     13169e8:	41 bd d0 02 00 00    	mov    r13d,0x2d0
     13169ee:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     13169f2:	4d 89 fe             	mov    r14,r15
     13169f5:	4c 89 f7             	mov    rdi,r14
     13169f8:	48 89 de             	mov    rsi,rbx
     13169fb:	e8 94 22 f0 ff       	call   1218c94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e218>
     1316a00:	4c 01 eb             	add    rbx,r13
     1316a03:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
     1316a0a:	00 

### centered 0x13177ae
     1317769:	5a                   	pop    rdx
     131776a:	45 31 c0             	xor    r8d,r8d
     131776d:	e8 74 9b e1 ff       	call   11312e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f86fc>
     1317772:	e9 84 00 00 00       	jmp    13177fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd7f>
     1317777:	d1 e9                	shr    ecx,1
     1317779:	48 85 c9             	test   rcx,rcx
     131777c:	74 30                	je     13177ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd32>
     131777e:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1317785:	00 
     1317786:	4c 8b 78 30          	mov    r15,QWORD PTR [rax+0x30]
     131778a:	e8 a7 40 76 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     131778f:	49 89 d0             	mov    r8,rdx
     1317792:	4d 8b 17             	mov    r10,QWORD PTR [r15]
     1317795:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131779a:	4c 8d 4c 24 14       	lea    r9,[rsp+0x14]
     131779f:	4c 89 fe             	mov    rsi,r15
     13177a2:	4c 89 f2             	mov    rdx,r14
     13177a5:	48 89 c1             	mov    rcx,rax
     13177a8:	41 ff 52 60          	call   QWORD PTR [r10+0x60]
     13177ac:	eb 4d                	jmp    13177fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd7f>
     13177ae:	0f b6 8c 24 a0 00 00 	movzx  ecx,BYTE PTR [rsp+0xa0]
     13177b5:	00 
     13177b6:	f6 c1 01             	test   cl,0x1
     13177b9:	74 0a                	je     13177c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd49>
     13177bb:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     13177c2:	00 
     13177c3:	eb 02                	jmp    13177c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd4b>
     13177c5:	d1 e9                	shr    ecx,1
     13177c7:	48 85 c9             	test   rcx,rcx
     13177ca:	0f 84 92 00 00 00    	je     1317862 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cde6>
     13177d0:	4c 8d 84 24 a0 00 00 	lea    r8,[rsp+0xa0]
     13177d7:	00 
     13177d8:	45 0f b6 48 e0       	movzx  r9d,BYTE PTR [r8-0x20]
     13177dd:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     13177e1:	48 8b 50 30          	mov    rdx,QWORD PTR [rax+0x30]
     13177e5:	48 8d 44 24 14       	lea    rax,[rsp+0x14]
     13177ea:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     13177ee:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13177f3:	4c 89 f1             	mov    rcx,r14
     13177f6:	e8 2b 8d 2b 00       	call   15d0526 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x415aaa>
     13177fb:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]

### centered 0x13177d0
     131778a:	e8 a7 40 76 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     131778f:	49 89 d0             	mov    r8,rdx
     1317792:	4d 8b 17             	mov    r10,QWORD PTR [r15]
     1317795:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131779a:	4c 8d 4c 24 14       	lea    r9,[rsp+0x14]
     131779f:	4c 89 fe             	mov    rsi,r15
     13177a2:	4c 89 f2             	mov    rdx,r14
     13177a5:	48 89 c1             	mov    rcx,rax
     13177a8:	41 ff 52 60          	call   QWORD PTR [r10+0x60]
     13177ac:	eb 4d                	jmp    13177fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd7f>
     13177ae:	0f b6 8c 24 a0 00 00 	movzx  ecx,BYTE PTR [rsp+0xa0]
     13177b5:	00 
     13177b6:	f6 c1 01             	test   cl,0x1
     13177b9:	74 0a                	je     13177c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd49>
     13177bb:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     13177c2:	00 
     13177c3:	eb 02                	jmp    13177c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd4b>
     13177c5:	d1 e9                	shr    ecx,1
     13177c7:	48 85 c9             	test   rcx,rcx
     13177ca:	0f 84 92 00 00 00    	je     1317862 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cde6>
     13177d0:	4c 8d 84 24 a0 00 00 	lea    r8,[rsp+0xa0]
     13177d7:	00 
     13177d8:	45 0f b6 48 e0       	movzx  r9d,BYTE PTR [r8-0x20]
     13177dd:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     13177e1:	48 8b 50 30          	mov    rdx,QWORD PTR [rax+0x30]
     13177e5:	48 8d 44 24 14       	lea    rax,[rsp+0x14]
     13177ea:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     13177ee:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13177f3:	4c 89 f1             	mov    rcx,r14
     13177f6:	e8 2b 8d 2b 00       	call   15d0526 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x415aaa>
     13177fb:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1317802:	00 
     1317803:	e8 7e 6c 78 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1317808:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     131780d:	31 ed                	xor    ebp,ebp
     131780f:	48 85 ff             	test   rdi,rdi
     1317812:	75 1c                	jne    1317830 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cdb4>
     1317814:	8b 4c 24 14          	mov    ecx,DWORD PTR [rsp+0x14]
     1317818:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     131781d:	48 89 df             	mov    rdi,rbx
     1317820:	31 d2                	xor    edx,edx

### centered 0x1318288
     1318246:	55                   	push   rbp
     1318247:	41 57                	push   r15
     1318249:	41 56                	push   r14
     131824b:	41 54                	push   r12
     131824d:	53                   	push   rbx
     131824e:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
     1318255:	48 89 cb             	mov    rbx,rcx
     1318258:	89 d5                	mov    ebp,edx
     131825a:	49 89 f6             	mov    r14,rsi
     131825d:	49 89 ff             	mov    r15,rdi
     1318260:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1318267:	00 00 
     1318269:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1318270:	00 
     1318271:	48 83 c7 50          	add    rdi,0x50
     1318275:	e8 6c a0 2a 00       	call   15c22e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40786a>
     131827a:	49 89 e4             	mov    r12,rsp
     131827d:	4c 89 e7             	mov    rdi,r12
     1318280:	4c 89 f6             	mov    rsi,r14
     1318283:	e8 14 a5 8f ff       	call   c1279c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15f73c>
     1318288:	41 88 ac 24 a0 00 00 	mov    BYTE PTR [r12+0xa0],bpl
     131828f:	00 
     1318290:	4c 89 ff             	mov    rdi,r15
     1318293:	4c 89 e6             	mov    rsi,r12
     1318296:	e8 22 f6 ff ff       	call   13178bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ce41>
     131829b:	49 89 c6             	mov    r14,rax
     131829e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13182a3:	e8 be 58 2a 00       	call   15bdb66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4030ea>
     13182a8:	4d 85 f6             	test   r14,r14
     13182ab:	74 05                	je     13182b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d836>
     13182ad:	41 8b 06             	mov    eax,DWORD PTR [r14]
     13182b0:	89 03                	mov    DWORD PTR [rbx],eax
     13182b2:	4d 85 f6             	test   r14,r14
     13182b5:	0f 95 c0             	setne  al
     13182b8:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     13182bf:	00 00 
     13182c1:	48 3b 8c 24 a8 00 00 	cmp    rcx,QWORD PTR [rsp+0xa8]
     13182c8:	00 
     13182c9:	75 10                	jne    13182db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d85f>
     13182cb:	48 81 c4 b0 00 00 00 	add    rsp,0xb0
     13182d2:	5b                   	pop    rbx

### centered 0x131d38a
     131d33d:	48 8d 05 94 c1 58 00 	lea    rax,[rip+0x58c194]        # 18a94d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x16418>
     131d344:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     131d348:	48 8d 05 a9 24 12 ff 	lea    rax,[rip+0xffffffffff1224a9]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     131d34f:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     131d353:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
     131d357:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     131d35b:	4c 89 ff             	mov    rdi,r15
     131d35e:	e8 d3 e4 75 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     131d363:	49 89 d0             	mov    r8,rdx
     131d366:	4d 8b 14 24          	mov    r10,QWORD PTR [r12]
     131d36a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     131d36f:	6a 16                	push   0x16
     131d371:	5a                   	pop    rdx
     131d372:	4c 89 e6             	mov    rsi,r12
     131d375:	48 89 c1             	mov    rcx,rax
     131d378:	4d 89 e9             	mov    r9,r13
     131d37b:	41 ff 52 30          	call   QWORD PTR [r10+0x30]
     131d37f:	80 7c 24 40 01       	cmp    BYTE PTR [rsp+0x40],0x1
     131d384:	75 7b                	jne    131d401 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162985>
     131d386:	4c 8d 63 20          	lea    r12,[rbx+0x20]
     131d38a:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     131d391:	00 
     131d392:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
     131d399:	00 
     131d39a:	4c 89 e2             	mov    rdx,r12
     131d39d:	e8 b4 b1 84 ff       	call   b68556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54f6>
     131d3a2:	84 c0                	test   al,al
     131d3a4:	74 5b                	je     131d401 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162985>
     131d3a6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     131d3ab:	4c 89 fe             	mov    rsi,r15
     131d3ae:	e8 8d 0b 4d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     131d3b3:	48 89 d8             	mov    rax,rbx
     131d3b6:	48 83 c0 18          	add    rax,0x18
     131d3ba:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     131d3bf:	66 c7 46 18 16 00    	mov    WORD PTR [rsi+0x18],0x16
     131d3c5:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     131d3ca:	48 89 02             	mov    QWORD PTR [rdx],rax
     131d3cd:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
     131d3d1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     131d3d6:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     131d3da:	4c 89 f7             	mov    rdi,r14

### centered 0x131dc8f
     131dc42:	0f 11 45 08          	movups XMMWORD PTR [rbp+0x8],xmm0
     131dc46:	48 8d 05 8b b8 58 00 	lea    rax,[rip+0x58b88b]        # 18a94d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x16418>
     131dc4d:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     131dc51:	48 8d 05 a0 1b 12 ff 	lea    rax,[rip+0xffffffffff121ba0]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     131dc58:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     131dc5c:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     131dc60:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     131dc64:	4c 89 e7             	mov    rdi,r12
     131dc67:	e8 ca db 75 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     131dc6c:	49 89 d0             	mov    r8,rdx
     131dc6f:	4d 8b 55 00          	mov    r10,QWORD PTR [r13+0x0]
     131dc73:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     131dc78:	6a 34                	push   0x34
     131dc7a:	5a                   	pop    rdx
     131dc7b:	4c 89 ee             	mov    rsi,r13
     131dc7e:	48 89 c1             	mov    rcx,rax
     131dc81:	49 89 e9             	mov    r9,rbp
     131dc84:	41 ff 52 30          	call   QWORD PTR [r10+0x30]
     131dc88:	80 7c 24 40 01       	cmp    BYTE PTR [rsp+0x40],0x1
     131dc8d:	75 77                	jne    131dd06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16328a>
     131dc8f:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     131dc96:	00 
     131dc97:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
     131dc9e:	00 
     131dc9f:	4c 89 f2             	mov    rdx,r14
     131dca2:	e8 af a8 84 ff       	call   b68556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54f6>
     131dca7:	84 c0                	test   al,al
     131dca9:	74 5b                	je     131dd06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16328a>
     131dcab:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     131dcb0:	4c 89 e6             	mov    rsi,r12
     131dcb3:	e8 88 02 4d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     131dcb8:	48 89 d8             	mov    rax,rbx
     131dcbb:	48 83 c0 18          	add    rax,0x18
     131dcbf:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     131dcc4:	66 c7 46 18 34 00    	mov    WORD PTR [rsi+0x18],0x34
     131dcca:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     131dccf:	48 89 02             	mov    QWORD PTR [rdx],rax
     131dcd2:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
     131dcd6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     131dcdb:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     131dcdf:	4c 89 ff             	mov    rdi,r15

### centered 0x131e835
     131e7e1:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
     131e7e6:	48 8d 05 eb ac 58 00 	lea    rax,[rip+0x58aceb]        # 18a94d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x16418>
     131e7ed:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     131e7f1:	48 8d 05 00 10 12 ff 	lea    rax,[rip+0xffffffffff121000]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     131e7f8:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     131e7fc:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
     131e800:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     131e804:	4c 89 ff             	mov    rdi,r15
     131e807:	e8 2a d0 75 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     131e80c:	49 89 d0             	mov    r8,rdx
     131e80f:	4d 8b 14 24          	mov    r10,QWORD PTR [r12]
     131e813:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     131e818:	4c 89 e6             	mov    rsi,r12
     131e81b:	ba b3 00 00 00       	mov    edx,0xb3
     131e820:	48 89 c1             	mov    rcx,rax
     131e823:	4d 89 e9             	mov    r9,r13
     131e826:	41 ff 52 30          	call   QWORD PTR [r10+0x30]
     131e82a:	80 7c 24 40 01       	cmp    BYTE PTR [rsp+0x40],0x1
     131e82f:	75 7b                	jne    131e8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163e30>
     131e831:	4c 8d 63 20          	lea    r12,[rbx+0x20]
     131e835:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     131e83c:	00 
     131e83d:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
     131e844:	00 
     131e845:	4c 89 e2             	mov    rdx,r12
     131e848:	e8 09 9d 84 ff       	call   b68556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54f6>
     131e84d:	84 c0                	test   al,al
     131e84f:	74 5b                	je     131e8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163e30>
     131e851:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     131e856:	4c 89 fe             	mov    rsi,r15
     131e859:	e8 e2 f6 4c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     131e85e:	48 89 d8             	mov    rax,rbx
     131e861:	48 83 c0 18          	add    rax,0x18
     131e865:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     131e86a:	66 c7 46 18 b3 00    	mov    WORD PTR [rsi+0x18],0xb3
     131e870:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     131e875:	48 89 02             	mov    QWORD PTR [rdx],rax
     131e878:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
     131e87c:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     131e881:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     131e885:	4c 89 f7             	mov    rdi,r14

### centered 0x1320821
     13207c4:	f6 c2 01             	test   dl,0x1
     13207c7:	0f 85 07 07 00 00    	jne    1320ed4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166458>
     13207cd:	e8 c0 4f 44 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     13207d2:	41 80 be 90 00 00 00 	cmp    BYTE PTR [r14+0x90],0x0
     13207d9:	00 
     13207da:	74 17                	je     13207f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165d77>
     13207dc:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13207e1:	8a 80 fc 01 00 00    	mov    al,BYTE PTR [rax+0x1fc]
     13207e7:	41 88 87 d9 00 00 00 	mov    BYTE PTR [r15+0xd9],al
     13207ee:	41 80 4f 12 20       	or     BYTE PTR [r15+0x12],0x20
     13207f3:	41 80 be 91 00 00 00 	cmp    BYTE PTR [r14+0x91],0x0
     13207fa:	00 
     13207fb:	0f 84 e2 04 00 00    	je     1320ce3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166267>
     1320801:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1320806:	80 b9 fd 01 00 00 00 	cmp    BYTE PTR [rcx+0x1fd],0x0
     132080d:	b0 01                	mov    al,0x1
     132080f:	75 1b                	jne    132082c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165db0>
     1320811:	80 b9 b8 00 00 00 00 	cmp    BYTE PTR [rcx+0xb8],0x0
     1320818:	74 12                	je     132082c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165db0>
     132081a:	48 8b b1 a8 00 00 00 	mov    rsi,QWORD PTR [rcx+0xa8]
     1320821:	8b b9 a0 00 00 00    	mov    edi,DWORD PTR [rcx+0xa0]
     1320827:	e8 f4 af 75 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     132082c:	4d 8d 77 10          	lea    r14,[r15+0x10]
     1320830:	41 88 87 da 00 00 00 	mov    BYTE PTR [r15+0xda],al
     1320837:	b8 00 00 40 00       	mov    eax,0x400000
     132083c:	e9 97 04 00 00       	jmp    1320cd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16625c>
     1320841:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1320848:	00 
     1320849:	e8 9c aa 7d ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     132084e:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1320853:	4c 8b b4 24 40 01 00 	mov    r14,QWORD PTR [rsp+0x140]
     132085a:	00 
     132085b:	41 80 be 8b 00 00 00 	cmp    BYTE PTR [r14+0x8b],0x0
     1320862:	00 
     1320863:	74 51                	je     13208b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165e3a>
     1320865:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1320868:	48 89 df             	mov    rdi,rbx
     132086b:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     1320871:	48 85 c0             	test   rax,rax
     1320874:	74 40                	je     13208b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165e3a>
     1320876:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### centered 0x1322897
     1322859:	e9 11 04 00 00       	jmp    1322c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681f3>
     132285e:	83 ff 01             	cmp    edi,0x1
     1322861:	77 05                	ja     1322868 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167dec>
     1322863:	4c 21 c8             	and    rax,r9
     1322866:	eb 0d                	jmp    1322875 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167df9>
     1322868:	4c 39 f8             	cmp    rax,r15
     132286b:	72 08                	jb     1322875 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167df9>
     132286d:	31 d2                	xor    edx,edx
     132286f:	49 f7 f7             	div    r15
     1322872:	48 89 d0             	mov    rax,rdx
     1322875:	4c 39 f0             	cmp    rax,r14
     1322878:	75 08                	jne    1322882 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167e06>
     132287a:	4d 8b 00             	mov    r8,QWORD PTR [r8]
     132287d:	4d 85 c0             	test   r8,r8
     1322880:	75 c2                	jne    1322844 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167dc8>
     1322882:	bf 98 00 00 00       	mov    edi,0x98
     1322887:	e8 74 b6 4c 00       	call   17edf00 <_Znwm@plt>
     132288c:	49 89 c4             	mov    r12,rax
     132288f:	48 89 84 24 f8 02 00 	mov    QWORD PTR [rsp+0x2f8],rax
     1322896:	00 
     1322897:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
     132289e:	00 
     132289f:	48 89 84 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rax
     13228a6:	00 
     13228a7:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     13228ac:	49 89 6c 24 08       	mov    QWORD PTR [r12+0x8],rbp
     13228b1:	0f 28 84 24 70 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x270]
     13228b8:	00 
     13228b9:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
     13228bf:	4c 89 e7             	mov    rdi,r12
     13228c2:	48 83 c7 20          	add    rdi,0x20
     13228c6:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
     13228cd:	00 
     13228ce:	e8 59 13 00 00       	call   1323c2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1691b0>
     13228d3:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     13228da:	00 
     13228db:	48 ff c0             	inc    rax
     13228de:	78 07                	js     13228e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167e6b>
     13228e0:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     13228e5:	eb 15                	jmp    13228fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167e80>
     13228e7:	48 89 c1             	mov    rcx,rax

### centered 0x13250e5
     1325093:	00 
     1325094:	48 89 8b e8 00 00 00 	mov    QWORD PTR [rbx+0xe8],rcx
     132509b:	f3 0f 10 84 24 e0 00 	movss  xmm0,DWORD PTR [rsp+0xe0]
     13250a2:	00 00 
     13250a4:	f3 0f 11 83 f0 00 00 	movss  DWORD PTR [rbx+0xf0],xmm0
     13250ab:	00 
     13250ac:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     13250b3:	00 
     13250b4:	48 89 83 e0 00 00 00 	mov    QWORD PTR [rbx+0xe0],rax
     13250bb:	48 85 c9             	test   rcx,rcx
     13250be:	0f 84 90 00 00 00    	je     1325154 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6d8>
     13250c4:	48 8d 8c 24 d0 00 00 	lea    rcx,[rsp+0xd0]
     13250cb:	00 
     13250cc:	48 8d b3 e0 00 00 00 	lea    rsi,[rbx+0xe0]
     13250d3:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13250d7:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
     13250db:	48 85 d7             	test   rdi,rdx
     13250de:	75 5a                	jne    132513a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6be>
     13250e0:	48 21 d0             	and    rax,rdx
     13250e3:	eb 62                	jmp    1325147 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6cb>
     13250e5:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     13250ec:	80 bb f8 00 00 00 00 	cmp    BYTE PTR [rbx+0xf8],0x0
     13250f3:	74 0e                	je     1325103 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a687>
     13250f5:	e8 76 24 79 ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
     13250fa:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
     1325101:	eb 23                	jmp    1325126 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6aa>
     1325103:	4c 8b b3 a0 00 00 00 	mov    r14,QWORD PTR [rbx+0xa0]
     132510a:	4c 8b bb a8 00 00 00 	mov    r15,QWORD PTR [rbx+0xa8]
     1325111:	e8 5a 24 79 ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
     1325116:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
     132511d:	4d 39 fe             	cmp    r14,r15
     1325120:	0f 84 cb 01 00 00    	je     13252f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a875>
     1325126:	48 81 c3 10 01 00 00 	add    rbx,0x110
     132512d:	48 89 df             	mov    rdi,rbx
     1325130:	e8 73 39 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1325135:	e9 b7 01 00 00       	jmp    13252f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a875>
     132513a:	48 39 f8             	cmp    rax,rdi
     132513d:	72 08                	jb     1325147 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6cb>
     132513f:	31 d2                	xor    edx,edx
     1325141:	48 f7 f7             	div    rdi
     1325144:	48 89 d0             	mov    rax,rdx

### centered 0x1325103
     13250ac:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     13250b3:	00 
     13250b4:	48 89 83 e0 00 00 00 	mov    QWORD PTR [rbx+0xe0],rax
     13250bb:	48 85 c9             	test   rcx,rcx
     13250be:	0f 84 90 00 00 00    	je     1325154 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6d8>
     13250c4:	48 8d 8c 24 d0 00 00 	lea    rcx,[rsp+0xd0]
     13250cb:	00 
     13250cc:	48 8d b3 e0 00 00 00 	lea    rsi,[rbx+0xe0]
     13250d3:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13250d7:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
     13250db:	48 85 d7             	test   rdi,rdx
     13250de:	75 5a                	jne    132513a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6be>
     13250e0:	48 21 d0             	and    rax,rdx
     13250e3:	eb 62                	jmp    1325147 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6cb>
     13250e5:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     13250ec:	80 bb f8 00 00 00 00 	cmp    BYTE PTR [rbx+0xf8],0x0
     13250f3:	74 0e                	je     1325103 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a687>
     13250f5:	e8 76 24 79 ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
     13250fa:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
     1325101:	eb 23                	jmp    1325126 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6aa>
     1325103:	4c 8b b3 a0 00 00 00 	mov    r14,QWORD PTR [rbx+0xa0]
     132510a:	4c 8b bb a8 00 00 00 	mov    r15,QWORD PTR [rbx+0xa8]
     1325111:	e8 5a 24 79 ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
     1325116:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
     132511d:	4d 39 fe             	cmp    r14,r15
     1325120:	0f 84 cb 01 00 00    	je     13252f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a875>
     1325126:	48 81 c3 10 01 00 00 	add    rbx,0x110
     132512d:	48 89 df             	mov    rdi,rbx
     1325130:	e8 73 39 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1325135:	e9 b7 01 00 00       	jmp    13252f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a875>
     132513a:	48 39 f8             	cmp    rax,rdi
     132513d:	72 08                	jb     1325147 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6cb>
     132513f:	31 d2                	xor    edx,edx
     1325141:	48 f7 f7             	div    rdi
     1325144:	48 89 d0             	mov    rax,rdx
     1325147:	49 8b 17             	mov    rdx,QWORD PTR [r15]
     132514a:	48 89 34 c2          	mov    QWORD PTR [rdx+rax*8],rsi
     132514e:	0f 57 c0             	xorps  xmm0,xmm0
     1325151:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     1325154:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1325159:	4c 89 f6             	mov    rsi,r14

### centered 0x13251fa
     13251af:	59                   	pop    rcx
     13251b0:	48 99                	cqo
     13251b2:	48 f7 f9             	idiv   rcx
     13251b5:	49 89 c5             	mov    r13,rax
     13251b8:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13251bd:	4c 89 f6             	mov    rsi,r14
     13251c0:	e8 e7 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     13251c5:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     13251ca:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     13251cf:	4c 89 f7             	mov    rdi,r14
     13251d2:	e8 27 d5 86 ff       	call   b926fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf69e>
     13251d7:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
     13251dc:	40 88 6c 24 40       	mov    BYTE PTR [rsp+0x40],bpl
     13251e1:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
     13251e6:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
     13251ed:	00 00 
     13251ef:	6a 48                	push   0x48
     13251f1:	5f                   	pop    rdi
     13251f2:	e8 09 8d 4c 00       	call   17edf00 <_Znwm@plt>
     13251f7:	48 89 c5             	mov    rbp,rax
     13251fa:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     1325201:	00 
     1325202:	48 8d 84 24 bf 00 00 	lea    rax,[rsp+0xbf]
     1325209:	00 
     132520a:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1325211:	00 
     1325212:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0x1
     1325219:	00 01 00 00 00 
     132521e:	48 8d 05 33 09 54 00 	lea    rax,[rip+0x540933]        # 1865b58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22240>
     1325225:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1325229:	4c 8d 6d 08          	lea    r13,[rbp+0x8]
     132522d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     1325232:	4c 89 ef             	mov    rdi,r13
     1325235:	e8 72 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     132523a:	48 89 ef             	mov    rdi,rbp
     132523d:	48 83 c7 18          	add    rdi,0x18
     1325241:	4c 89 f6             	mov    rsi,r14
     1325244:	e8 63 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     1325249:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     132524e:	0f 10 40 f0          	movups xmm0,XMMWORD PTR [rax-0x10]
     1325252:	0f 11 45 28          	movups XMMWORD PTR [rbp+0x28],xmm0

### centered 0x1325256
     1325201:	00 
     1325202:	48 8d 84 24 bf 00 00 	lea    rax,[rsp+0xbf]
     1325209:	00 
     132520a:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1325211:	00 
     1325212:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0x1
     1325219:	00 01 00 00 00 
     132521e:	48 8d 05 33 09 54 00 	lea    rax,[rip+0x540933]        # 1865b58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22240>
     1325225:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1325229:	4c 8d 6d 08          	lea    r13,[rbp+0x8]
     132522d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     1325232:	4c 89 ef             	mov    rdi,r13
     1325235:	e8 72 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     132523a:	48 89 ef             	mov    rdi,rbp
     132523d:	48 83 c7 18          	add    rdi,0x18
     1325241:	4c 89 f6             	mov    rsi,r14
     1325244:	e8 63 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     1325249:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     132524e:	0f 10 40 f0          	movups xmm0,XMMWORD PTR [rax-0x10]
     1325252:	0f 11 45 28          	movups XMMWORD PTR [rbp+0x28],xmm0
     1325256:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     132525d:	00 
     132525e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1325262:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     1325265:	0f 11 45 38          	movups XMMWORD PTR [rbp+0x38],xmm0
     1325269:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]
     1325270:	00 
     1325271:	49 89 6e 20          	mov    QWORD PTR [r14+0x20],rbp
     1325275:	e8 50 50 75 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     132527a:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     132527e:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
     1325282:	48 8d 15 2b 10 01 ff 	lea    rdx,[rip+0xffffffffff01102b]        # 3362b4 <_ZTSSt12bad_any_cast@@Base-0x59f14>
     1325289:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     132528e:	4c 89 e6             	mov    rsi,r12
     1325291:	4c 89 f9             	mov    rcx,r15
     1325294:	4c 8b 44 24 08       	mov    r8,QWORD PTR [rsp+0x8]
     1325299:	4d 89 f1             	mov    r9,r14
     132529c:	6a 04                	push   0x4
     132529e:	6a 01                	push   0x1
     13252a0:	ff d0                	call   rax
     13252a2:	58                   	pop    rax

### centered 0x1325d8b
     1325d3e:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
     1325d41:	4c 89 ff             	mov    rdi,r15
     1325d44:	4c 89 f6             	mov    rsi,r14
     1325d47:	48 89 c2             	mov    rdx,rax
     1325d4a:	ff 51 50             	call   QWORD PTR [rcx+0x50]
     1325d4d:	41 89 c7             	mov    r15d,eax
     1325d50:	4c 89 f7             	mov    rdi,r14
     1325d53:	e8 d6 f5 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1325d58:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
     1325d5f:	00 
     1325d60:	e8 c9 f5 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1325d65:	48 89 ef             	mov    rdi,rbp
     1325d68:	e8 19 87 77 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1325d6d:	45 08 fc             	or     r12b,r15b
     1325d70:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     1325d75:	75 26                	jne    1325d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b321>
     1325d77:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1325d7c:	4c 89 ee             	mov    rsi,r13
     1325d7f:	e8 74 aa dd ff       	call   11007f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7c0e>
     1325d84:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
     1325d8b:	48 2b 83 a0 00 00 00 	sub    rax,QWORD PTR [rbx+0xa0]
     1325d92:	48 c1 f8 04          	sar    rax,0x4
     1325d96:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1325d9b:	73 39                	jae    1325dd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b35a>
     1325d9d:	49 83 c5 10          	add    r13,0x10
     1325da1:	4d 39 fd             	cmp    r13,r15
     1325da4:	0f 85 05 fe ff ff    	jne    1325baf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b133>
     1325daa:	eb 18                	jmp    1325dc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b348>
     1325dac:	41 b4 01             	mov    r12b,0x1
     1325daf:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     1325db3:	80 7b 20 00          	cmp    BYTE PTR [rbx+0x20],0x0
     1325db7:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     1325dbc:	0f 85 04 ff ff ff    	jne    1325cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b24a>
     1325dc2:	eb d9                	jmp    1325d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b321>
     1325dc4:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
     1325dcb:	48 2b 83 a0 00 00 00 	sub    rax,QWORD PTR [rbx+0xa0]
     1325dd2:	48 c1 f8 04          	sar    rax,0x4
     1325dd6:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1325ddb:	73 09                	jae    1325de6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b36a>
     1325ddd:	80 bb fa 00 00 00 00 	cmp    BYTE PTR [rbx+0xfa],0x0
     1325de4:	74 3b                	je     1325e21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b3a5>

### centered 0x1325dcb
     1325d75:	75 26                	jne    1325d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b321>
     1325d77:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1325d7c:	4c 89 ee             	mov    rsi,r13
     1325d7f:	e8 74 aa dd ff       	call   11007f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7c0e>
     1325d84:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
     1325d8b:	48 2b 83 a0 00 00 00 	sub    rax,QWORD PTR [rbx+0xa0]
     1325d92:	48 c1 f8 04          	sar    rax,0x4
     1325d96:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1325d9b:	73 39                	jae    1325dd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b35a>
     1325d9d:	49 83 c5 10          	add    r13,0x10
     1325da1:	4d 39 fd             	cmp    r13,r15
     1325da4:	0f 85 05 fe ff ff    	jne    1325baf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b133>
     1325daa:	eb 18                	jmp    1325dc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b348>
     1325dac:	41 b4 01             	mov    r12b,0x1
     1325daf:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     1325db3:	80 7b 20 00          	cmp    BYTE PTR [rbx+0x20],0x0
     1325db7:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     1325dbc:	0f 85 04 ff ff ff    	jne    1325cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b24a>
     1325dc2:	eb d9                	jmp    1325d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b321>
     1325dc4:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
     1325dcb:	48 2b 83 a0 00 00 00 	sub    rax,QWORD PTR [rbx+0xa0]
     1325dd2:	48 c1 f8 04          	sar    rax,0x4
     1325dd6:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1325ddb:	73 09                	jae    1325de6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b36a>
     1325ddd:	80 bb fa 00 00 00 00 	cmp    BYTE PTR [rbx+0xfa],0x0
     1325de4:	74 3b                	je     1325e21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b3a5>
     1325de6:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
     1325ded:	48 81 c3 10 01 00 00 	add    rbx,0x110
     1325df4:	48 89 df             	mov    rdi,rbx
     1325df7:	e8 ac 2c 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1325dfc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1325e03:	00 00 
     1325e05:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     1325e0c:	00 
     1325e0d:	75 73                	jne    1325e82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b406>
     1325e0f:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     1325e16:	5b                   	pop    rbx
     1325e17:	41 5c                	pop    r12
     1325e19:	41 5d                	pop    r13
     1325e1b:	41 5e                	pop    r14
     1325e1d:	41 5f                	pop    r15

### centered 0x132fc7a
     132fc1f:	49 8b 07             	mov    rax,QWORD PTR [r15]
     132fc22:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
     132fc26:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     132fc2a:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     132fc2e:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     132fc32:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     132fc36:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     132fc3b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     132fc3f:	48 83 a3 88 00 00 00 	and    QWORD PTR [rbx+0x88],0x0
     132fc46:	00 
     132fc47:	0f 11 43 78          	movups XMMWORD PTR [rbx+0x78],xmm0
     132fc4b:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
     132fc4f:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
     132fc53:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     132fc57:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
     132fc5e:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
     132fc62:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
     132fc69:	41 0f 11 47 18       	movups XMMWORD PTR [r15+0x18],xmm0
     132fc6e:	49 83 67 28 00       	and    QWORD PTR [r15+0x28],0x0
     132fc73:	0f 29 83 90 00 00 00 	movaps XMMWORD PTR [rbx+0x90],xmm0
     132fc7a:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
     132fc81:	00 
     132fc82:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
     132fc86:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
     132fc8d:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
     132fc91:	48 89 83 98 00 00 00 	mov    QWORD PTR [rbx+0x98],rax
     132fc98:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
     132fc9c:	48 89 83 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rax
     132fca3:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
     132fca8:	41 0f 29 47 30       	movaps XMMWORD PTR [r15+0x30],xmm0
     132fcad:	41 8a 47 50          	mov    al,BYTE PTR [r15+0x50]
     132fcb1:	88 83 b0 00 00 00    	mov    BYTE PTR [rbx+0xb0],al
     132fcb7:	49 8b 47 48          	mov    rax,QWORD PTR [r15+0x48]
     132fcbb:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     132fcc2:	48 83 a3 c8 00 00 00 	and    QWORD PTR [rbx+0xc8],0x0
     132fcc9:	00 
     132fcca:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
     132fcd1:	49 8b 47 58          	mov    rax,QWORD PTR [r15+0x58]
     132fcd5:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     132fcdc:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
     132fce0:	48 89 83 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],rax

### centered 0x132fc9c
     132fc3b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     132fc3f:	48 83 a3 88 00 00 00 	and    QWORD PTR [rbx+0x88],0x0
     132fc46:	00 
     132fc47:	0f 11 43 78          	movups XMMWORD PTR [rbx+0x78],xmm0
     132fc4b:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
     132fc4f:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
     132fc53:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     132fc57:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
     132fc5e:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
     132fc62:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
     132fc69:	41 0f 11 47 18       	movups XMMWORD PTR [r15+0x18],xmm0
     132fc6e:	49 83 67 28 00       	and    QWORD PTR [r15+0x28],0x0
     132fc73:	0f 29 83 90 00 00 00 	movaps XMMWORD PTR [rbx+0x90],xmm0
     132fc7a:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
     132fc81:	00 
     132fc82:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
     132fc86:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
     132fc8d:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
     132fc91:	48 89 83 98 00 00 00 	mov    QWORD PTR [rbx+0x98],rax
     132fc98:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
     132fc9c:	48 89 83 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rax
     132fca3:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
     132fca8:	41 0f 29 47 30       	movaps XMMWORD PTR [r15+0x30],xmm0
     132fcad:	41 8a 47 50          	mov    al,BYTE PTR [r15+0x50]
     132fcb1:	88 83 b0 00 00 00    	mov    BYTE PTR [rbx+0xb0],al
     132fcb7:	49 8b 47 48          	mov    rax,QWORD PTR [r15+0x48]
     132fcbb:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     132fcc2:	48 83 a3 c8 00 00 00 	and    QWORD PTR [rbx+0xc8],0x0
     132fcc9:	00 
     132fcca:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
     132fcd1:	49 8b 47 58          	mov    rax,QWORD PTR [r15+0x58]
     132fcd5:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     132fcdc:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
     132fce0:	48 89 83 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],rax
     132fce7:	49 8b 47 68          	mov    rax,QWORD PTR [r15+0x68]
     132fceb:	48 89 83 c8 00 00 00 	mov    QWORD PTR [rbx+0xc8],rax
     132fcf2:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
     132fcf7:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
     132fcfc:	41 8a 47 70          	mov    al,BYTE PTR [r15+0x70]
     132fd00:	88 83 d0 00 00 00    	mov    BYTE PTR [rbx+0xd0],al
     132fd06:	49 8b 87 88 00 00 00 	mov    rax,QWORD PTR [r15+0x88]

### centered 0x133288d
     133283a:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     133283d:	e8 d4 bc 77 ff       	call   aae516 <JNI_OnUnload@@Base+0x35de3>
     1332842:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     1332849:	00 
     133284a:	e8 8f b7 84 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
     133284f:	4c 8d bc 24 c0 01 00 	lea    r15,[rsp+0x1c0]
     1332856:	00 
     1332857:	4c 89 ff             	mov    rdi,r15
     133285a:	e8 7f b7 84 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
     133285f:	66 0f ef c0          	pxor   xmm0,xmm0
     1332863:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
     1332868:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     133286d:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     1332874:	00 
     1332875:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]
     133287c:	00 
     133287d:	4c 8d 84 24 c0 01 00 	lea    r8,[rsp+0x1c0]
     1332884:	00 
     1332885:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
     133288c:	00 
     133288d:	48 8b 94 24 a0 00 00 	mov    rdx,QWORD PTR [rsp+0xa0]
     1332894:	00 
     1332895:	e8 6c 9c 00 00       	call   133c506 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181a8a>
     133289a:	4c 8d bc 24 58 01 00 	lea    r15,[rsp+0x158]
     13328a1:	00 
     13328a2:	49 8b 37             	mov    rsi,QWORD PTR [r15]
     13328a5:	49 83 27 00          	and    QWORD PTR [r15],0x0
     13328a9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     13328ae:	e8 c9 53 00 00       	call   1337c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d200>
     13328b3:	4c 89 ff             	mov    rdi,r15
     13328b6:	e8 3d 54 00 00       	call   1337cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d27c>
     13328bb:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
     13328c2:	00 
     13328c3:	e8 60 8e 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13328c8:	4c 8d bc 24 40 01 00 	lea    r15,[rsp+0x140]
     13328cf:	00 
     13328d0:	4c 89 ff             	mov    rdi,r15
     13328d3:	e8 50 8e 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13328d8:	4c 8b a5 18 02 00 00 	mov    r12,QWORD PTR [rbp+0x218]
     13328df:	49 89 2f             	mov    QWORD PTR [r15],rbp
     13328e2:	48 8d 35 a8 a7 76 ff 	lea    rsi,[rip+0xffffffffff76a7a8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>

### centered 0x1332f72
     1332f28:	00 
     1332f29:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
     1332f30:	66 0f 7f 84 24 60 01 	movdqa XMMWORD PTR [rsp+0x160],xmm0
     1332f37:	00 00 
     1332f39:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
     1332f40:	00 00 
     1332f42:	4d 8d 66 30          	lea    r12,[r14+0x30]
     1332f46:	4c 89 e7             	mov    rdi,r12
     1332f49:	48 89 de             	mov    rsi,rbx
     1332f4c:	e8 d5 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     1332f51:	48 85 c0             	test   rax,rax
     1332f54:	74 4d                	je     1332fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178527>
     1332f56:	48 89 c3             	mov    rbx,rax
     1332f59:	48 8b b8 a8 00 00 00 	mov    rdi,QWORD PTR [rax+0xa8]
     1332f60:	48 85 ff             	test   rdi,rdi
     1332f63:	74 37                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
     1332f65:	e8 d6 b1 4b 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
     1332f6a:	48 85 c0             	test   rax,rax
     1332f6d:	74 2d                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
     1332f6f:	48 89 c7             	mov    rdi,rax
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

### centered 0x133373f
     13336db:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
     13336e2:	00 
     13336e3:	e8 0e 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336e8:	48 8d bb 88 04 00 00 	lea    rdi,[rbx+0x488]
     13336ef:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
     13336f6:	00 
     13336f7:	e8 fa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336fc:	48 8d bb 98 04 00 00 	lea    rdi,[rbx+0x498]
     1333703:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     133370a:	00 
     133370b:	e8 e6 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333710:	48 8d bb a8 04 00 00 	lea    rdi,[rbx+0x4a8]
     1333717:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     133371e:	00 
     133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
     133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     1333732:	00 
     1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
     133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     1333746:	00 
     1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
     1333753:	00 
     1333754:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
     133375b:	00 
     133375c:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
     1333763:	00 
     1333764:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
     133376b:	00 
     133376c:	31 c0                	xor    eax,eax
     133376e:	88 83 18 05 00 00    	mov    BYTE PTR [rbx+0x518],al
     1333774:	88 83 38 05 00 00    	mov    BYTE PTR [rbx+0x538],al
     133377a:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
     1333780:	88 83 60 05 00 00    	mov    BYTE PTR [rbx+0x560],al
     1333786:	0f 57 c0             	xorps  xmm0,xmm0
     1333789:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
     1333790:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
     1333797:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
     133379e:	c7 83 98 05 00 00 00 	mov    DWORD PTR [rbx+0x598],0x3f800000

### centered 0x13349e9
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
     13349f0:	00 
     13349f1:	e8 de 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     13349f6:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     13349fd:	00 
     13349fe:	e8 d1 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a03:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     1334a0a:	00 
     1334a0b:	e8 c4 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a10:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     1334a17:	00 
     1334a18:	e8 b7 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a1d:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1334a24:	00 
     1334a25:	e8 aa 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a2a:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
     1334a31:	00 
     1334a32:	e8 9d 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a37:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     1334a3e:	00 
     1334a3f:	e8 90 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>

### centered 0x13394b7
     133944d:	49 89 4f 30          	mov    QWORD PTR [r15+0x30],rcx
     1339451:	4d 89 67 38          	mov    QWORD PTR [r15+0x38],r12
     1339455:	4d 89 6f 40          	mov    QWORD PTR [r15+0x40],r13
     1339459:	49 89 7f 48          	mov    QWORD PTR [r15+0x48],rdi
     133945d:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
     1339462:	45 88 5f 60          	mov    BYTE PTR [r15+0x60],r11b
     1339466:	48 8d 8b d8 04 00 00 	lea    rcx,[rbx+0x4d8]
     133946d:	49 89 4f 68          	mov    QWORD PTR [r15+0x68],rcx
     1339471:	48 8d 8b f8 04 00 00 	lea    rcx,[rbx+0x4f8]
     1339478:	49 89 4f 70          	mov    QWORD PTR [r15+0x70],rcx
     133947c:	4d 89 57 78          	mov    QWORD PTR [r15+0x78],r10
     1339480:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
     1339487:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     133948e:	00 
     133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
     1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
     133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
     13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
     13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
     13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
     13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
     13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
     13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]
     13394da:	0f 11 84 24 0c 02 00 	movups XMMWORD PTR [rsp+0x20c],xmm0
     13394e1:	00 
     13394e2:	f2 41 0f 10 07       	movsd  xmm0,QWORD PTR [r15]
     13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     13394ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13394ef:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     13394f5:	48 85 c0             	test   rax,rax
     13394f8:	74 06                	je     1339500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea84>
     13394fa:	44 8a 68 5b          	mov    r13b,BYTE PTR [rax+0x5b]
     13394fe:	eb 03                	jmp    1339503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea87>
     1339500:	45 31 ed             	xor    r13d,r13d
     1339503:	44 8a bc 24 d0 00 00 	mov    r15b,BYTE PTR [rsp+0xd0]
     133950a:	00 
     133950b:	48 8b ac 24 c8 00 00 	mov    rbp,QWORD PTR [rsp+0xc8]
     1339512:	00 

### centered 0x133a413
     133a3df:	b0 01                	mov    al,0x1
     133a3e1:	5b                   	pop    rbx
     133a3e2:	c3                   	ret
     133a3e3:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     133a3ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133a3ed:	5b                   	pop    rbx
     133a3ee:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
     133a3f1:	cc                   	int3
     133a3f2:	53                   	push   rbx
     133a3f3:	48 89 fb             	mov    rbx,rdi
     133a3f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133a3f9:	ff 50 50             	call   QWORD PTR [rax+0x50]
     133a3fc:	89 c1                	mov    ecx,eax
     133a3fe:	31 c0                	xor    eax,eax
     133a400:	84 c9                	test   cl,cl
     133a402:	75 06                	jne    133a40a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f98e>
     133a404:	8b 83 30 06 00 00    	mov    eax,DWORD PTR [rbx+0x630]
     133a40a:	5b                   	pop    rbx
     133a40b:	c3                   	ret
     133a40c:	48 8b 87 a8 00 00 00 	mov    rax,QWORD PTR [rdi+0xa8]
     133a413:	48 2b 87 a0 00 00 00 	sub    rax,QWORD PTR [rdi+0xa0]
     133a41a:	6a 18                	push   0x18
     133a41c:	59                   	pop    rcx
     133a41d:	48 99                	cqo
     133a41f:	48 f7 f9             	idiv   rcx
     133a422:	c3                   	ret
     133a423:	cc                   	int3
     133a424:	55                   	push   rbp
     133a425:	41 57                	push   r15
     133a427:	41 56                	push   r14
     133a429:	41 55                	push   r13
     133a42b:	41 54                	push   r12
     133a42d:	53                   	push   rbx
     133a42e:	48 83 ec 38          	sub    rsp,0x38
     133a432:	48 89 fb             	mov    rbx,rdi
     133a435:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133a43c:	00 00 
     133a43e:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     133a443:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133a446:	49 89 e6             	mov    r14,rsp
     133a449:	4c 89 f7             	mov    rdi,r14

### centered 0x133a87c
     133a831:	00 00 
     133a833:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     133a838:	75 08                	jne    133a842 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17fdc6>
     133a83a:	48 89 df             	mov    rdi,rbx
     133a83d:	e8 8e 54 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     133a842:	e8 69 52 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133a847:	cc                   	int3
     133a848:	53                   	push   rbx
     133a849:	48 89 fb             	mov    rbx,rdi
     133a84c:	48 8b bf c0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5c0]
     133a853:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133a856:	ff 50 50             	call   QWORD PTR [rax+0x50]
     133a859:	48 8b bb 80 03 00 00 	mov    rdi,QWORD PTR [rbx+0x380]
     133a860:	e8 89 42 00 00       	call   133eaee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184072>
     133a865:	48 8b bb 90 03 00 00 	mov    rdi,QWORD PTR [rbx+0x390]
     133a86c:	5b                   	pop    rbx
     133a86d:	e9 ce 20 00 00       	jmp    133c940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181ec4>
     133a872:	48 83 c7 08          	add    rdi,0x8
     133a876:	e9 6f e3 ff ff       	jmp    1338bea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e16e>
     133a87b:	cc                   	int3
     133a87c:	48 8b 8f a0 00 00 00 	mov    rcx,QWORD PTR [rdi+0xa0]
     133a883:	48 8b 87 a8 00 00 00 	mov    rax,QWORD PTR [rdi+0xa8]
     133a88a:	48 29 c8             	sub    rax,rcx
     133a88d:	6a 18                	push   0x18
     133a88f:	5e                   	pop    rsi
     133a890:	48 99                	cqo
     133a892:	48 f7 fe             	idiv   rsi
     133a895:	48 89 c2             	mov    rdx,rax
     133a898:	48 89 c8             	mov    rax,rcx
     133a89b:	c3                   	ret
     133a89c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     133a8a0:	e9 3f f7 ff ff       	jmp    1339fe4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f568>
     133a8a5:	cc                   	int3
     133a8a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     133a8aa:	e9 09 f9 ff ff       	jmp    133a1b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f73c>
     133a8af:	cc                   	int3
     133a8b0:	e9 35 e3 ff ff       	jmp    1338bea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e16e>
     133a8b5:	cc                   	int3
     133a8b6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     133a8ba:	e9 ff fa ff ff       	jmp    133a3be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f942>
     133a8bf:	cc                   	int3

### centered 0x133acee
     133acaf:	00 00 
     133acb1:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     133acb6:	75 08                	jne    133acc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180244>
     133acb8:	4c 89 f7             	mov    rdi,r14
     133acbb:	e8 10 50 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     133acc0:	e8 eb 4d 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133acc5:	55                   	push   rbp
     133acc6:	41 57                	push   r15
     133acc8:	41 56                	push   r14
     133acca:	41 55                	push   r13
     133accc:	41 54                	push   r12
     133acce:	53                   	push   rbx
     133accf:	48 83 ec 68          	sub    rsp,0x68
     133acd3:	49 89 d7             	mov    r15,rdx
     133acd6:	48 89 f5             	mov    rbp,rsi
     133acd9:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     133acde:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     133ace5:	00 
     133ace6:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
     133aced:	00 
     133acee:	48 8b 9c 24 a0 00 00 	mov    rbx,QWORD PTR [rsp+0xa0]
     133acf5:	00 
     133acf6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133acfd:	00 00 
     133acff:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     133ad04:	0f 57 c0             	xorps  xmm0,xmm0
     133ad07:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     133ad0c:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     133ad11:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     133ad16:	41 0f b6 c1          	movzx  eax,r9b
     133ad1a:	89 44 24 04          	mov    DWORD PTR [rsp+0x4],eax
     133ad1e:	4d 85 c0             	test   r8,r8
     133ad21:	0f 84 c2 00 00 00    	je     133ade9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18036d>
     133ad27:	49 89 cc             	mov    r12,rcx
     133ad2a:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
     133ad2f:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     133ad34:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
     133ad39:	49 6b e8 38          	imul   rbp,r8,0x38
     133ad3d:	4c 8d 2d dc 02 6b 00 	lea    r13,[rip+0x6b02dc]        # 19eb020 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1c58>
     133ad44:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
     133ad49:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]

### centered 0x133ad93
     133ad44:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
     133ad49:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     133ad4e:	4c 89 e7             	mov    rdi,r12
     133ad51:	e8 e0 0a 74 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     133ad56:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     133ad5b:	48 89 54 24 58       	mov    QWORD PTR [rsp+0x58],rdx
     133ad60:	4c 89 ef             	mov    rdi,r13
     133ad63:	48 89 de             	mov    rsi,rbx
     133ad66:	e8 9d b3 ec ff       	call   1206108 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b68c>
     133ad6b:	84 c0                	test   al,al
     133ad6d:	4c 89 f7             	mov    rdi,r14
     133ad70:	49 0f 45 ff          	cmovne rdi,r15
     133ad74:	4c 89 e6             	mov    rsi,r12
     133ad77:	e8 94 c4 f8 ff       	call   12c7210 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c794>
     133ad7c:	49 83 c4 38          	add    r12,0x38
     133ad80:	48 83 c5 c8          	add    rbp,0xffffffffffffffc8
     133ad84:	75 c8                	jne    133ad4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1802d2>
     133ad86:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     133ad8b:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     133ad90:	48 39 c1             	cmp    rcx,rax
     133ad93:	48 8b 9c 24 a0 00 00 	mov    rbx,QWORD PTR [rsp+0xa0]
     133ad9a:	00 
     133ad9b:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
     133ada2:	00 
     133ada3:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     133ada8:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     133adaf:	00 
     133adb0:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     133adb5:	74 32                	je     133ade9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18036d>
     133adb7:	48 29 c8             	sub    rax,rcx
     133adba:	48 99                	cqo
     133adbc:	6a 38                	push   0x38
     133adbe:	5e                   	pop    rsi
     133adbf:	48 f7 fe             	idiv   rsi
     133adc2:	48 83 ec 08          	sub    rsp,0x8
     133adc6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     133adcb:	31 f6                	xor    esi,esi
     133adcd:	31 d2                	xor    edx,edx
     133adcf:	49 89 c0             	mov    r8,rax
     133add2:	44 8b 4c 24 0c       	mov    r9d,DWORD PTR [rsp+0xc]
     133add7:	41 55                	push   r13

### centered 0x133dd68
     133dd2f:	00 
     133dd30:	e8 ed 6e 7a ff       	call   ae4c22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x31bc2>
     133dd35:	eb 03                	jmp    133dd3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1832be>
     133dd37:	48 89 c3             	mov    rbx,rax
     133dd3a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133dd41:	00 
     133dd42:	e8 49 01 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133dd47:	eb 03                	jmp    133dd4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1832d0>
     133dd49:	48 89 c3             	mov    rbx,rax
     133dd4c:	48 89 df             	mov    rdi,rbx
     133dd4f:	e8 51 bd 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     133dd54:	55                   	push   rbp
     133dd55:	41 57                	push   r15
     133dd57:	41 56                	push   r14
     133dd59:	41 55                	push   r13
     133dd5b:	41 54                	push   r12
     133dd5d:	53                   	push   rbx
     133dd5e:	48 83 ec 68          	sub    rsp,0x68
     133dd62:	49 89 cf             	mov    r15,rcx
     133dd65:	48 89 fb             	mov    rbx,rdi
     133dd68:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     133dd6f:	00 
     133dd70:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     133dd77:	00 00 
     133dd79:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
     133dd7e:	48 8d 0d 3b 87 52 00 	lea    rcx,[rip+0x52873b]        # 18664c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22ba8>
     133dd85:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     133dd8a:	48 89 74 24 28       	mov    QWORD PTR [rsp+0x28],rsi
     133dd8f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     133dd94:	48 8d 05 2d d3 6a 00 	lea    rax,[rip+0x6ad32d]        # 19eb0c8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1d00>
     133dd9b:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     133dda0:	83 fa 17             	cmp    edx,0x17
     133dda3:	0f 87 08 05 00 00    	ja     133e2b1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183835>
     133dda9:	4d 89 cc             	mov    r12,r9
     133ddac:	49 89 f6             	mov    r14,rsi
     133ddaf:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     133ddb6:	00 
     133ddb7:	89 d0                	mov    eax,edx
     133ddb9:	48 8d 0d fc a0 05 ff 	lea    rcx,[rip+0xffffffffff05a0fc]        # 397ebc <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x4a9d>
     133ddc0:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
     133ddc4:	48 01 c8             	add    rax,rcx

### centered 0x133ed4f
     133ed0d:	4d 8b 64 24 58       	mov    r12,QWORD PTR [r12+0x58]
     133ed12:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
     133ed17:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     133ed1a:	48 89 ef             	mov    rdi,rbp
     133ed1d:	31 d2                	xor    edx,edx
     133ed1f:	ff 50 18             	call   QWORD PTR [rax+0x18]
     133ed22:	48 89 ef             	mov    rdi,rbp
     133ed25:	e8 0c cb 73 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     133ed2a:	49 89 d0             	mov    r8,rdx
     133ed2d:	4d 8b 0c 24          	mov    r9,QWORD PTR [r12]
     133ed31:	4c 89 f3             	mov    rbx,r14
     133ed34:	4c 89 f7             	mov    rdi,r14
     133ed37:	4c 89 e6             	mov    rsi,r12
     133ed3a:	6a 0a                	push   0xa
     133ed3c:	5a                   	pop    rdx
     133ed3d:	48 89 c1             	mov    rcx,rax
     133ed40:	41 ff 51 28          	call   QWORD PTR [r9+0x28]
     133ed44:	49 89 ec             	mov    r12,rbp
     133ed47:	48 89 ef             	mov    rdi,rbp
     133ed4a:	e8 41 f1 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133ed4f:	80 bc 24 a0 00 00 00 	cmp    BYTE PTR [rsp+0xa0],0x4
     133ed56:	04 
     133ed57:	74 32                	je     133ed8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18430f>
     133ed59:	40 8a ac 24 e1 00 00 	mov    bpl,BYTE PTR [rsp+0xe1]
     133ed60:	00 
     133ed61:	80 bc 24 e0 00 00 00 	cmp    BYTE PTR [rsp+0xe0],0x0
     133ed68:	00 
     133ed69:	0f 94 c0             	sete   al
     133ed6c:	40 84 ed             	test   bpl,bpl
     133ed6f:	74 05                	je     133ed76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1842fa>
     133ed71:	41 20 c7             	and    r15b,al
     133ed74:	74 10                	je     133ed86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18430a>
     133ed76:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     133ed7d:	00 
     133ed7e:	4c 89 ee             	mov    rsi,r13
     133ed81:	e8 b4 44 8d ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
     133ed86:	40 20 6c 24 7f       	and    BYTE PTR [rsp+0x7f],bpl
     133ed8b:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     133ed92:	00 
     133ed93:	e8 f8 f0 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133ed98:	49 89 df             	mov    r15,rbx

### centered 0x133ee95
     133ee44:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     133ee48:	48 8d 05 ed 06 00 00 	lea    rax,[rip+0x6ed]        # 133f53c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184ac0>
     133ee4f:	e9 3f 02 00 00       	jmp    133f093 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184617>
     133ee54:	49 39 dd             	cmp    r13,rbx
     133ee57:	0f 84 85 00 00 00    	je     133eee2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184466>
     133ee5d:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133ee64:	00 
     133ee65:	41 bc 09 04 00 00    	mov    r12d,0x409
     133ee6b:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
     133ee72:	00 
     133ee73:	0f 57 c0             	xorps  xmm0,xmm0
     133ee76:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     133ee7d:	00 
     133ee7e:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     133ee82:	48 8b 78 50          	mov    rdi,QWORD PTR [rax+0x50]
     133ee86:	4c 89 ee             	mov    rsi,r13
     133ee89:	31 d2                	xor    edx,edx
     133ee8b:	4c 89 f1             	mov    rcx,r14
     133ee8e:	e8 b5 f2 2f 00       	call   163e148 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x392b6>
     133ee93:	89 c5                	mov    ebp,eax
     133ee95:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     133ee9c:	00 
     133ee9d:	48 85 ff             	test   rdi,rdi
     133eea0:	74 0f                	je     133eeb1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184435>
     133eea2:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
     133eea6:	75 24                	jne    133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
     133eea8:	e8 33 21 9d ff       	call   d10fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25df80>
     133eead:	84 c0                	test   al,al
     133eeaf:	75 1b                	jne    133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
     133eeb1:	83 fd 0a             	cmp    ebp,0xa
     133eeb4:	77 16                	ja     133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
     133eeb6:	41 0f a3 ec          	bt     r12d,ebp
     133eeba:	73 10                	jae    133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
     133eebc:	4c 89 ff             	mov    rdi,r15
     133eebf:	4c 89 ee             	mov    rsi,r13
     133eec2:	e8 73 43 8d ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
     133eec7:	c6 44 24 7f 00       	mov    BYTE PTR [rsp+0x7f],0x0
     133eecc:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     133eed3:	00 
     133eed4:	e8 ad f5 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     133eed9:	49 83 c5 58          	add    r13,0x58

### centered 0x133eefd
     133eeb1:	83 fd 0a             	cmp    ebp,0xa
     133eeb4:	77 16                	ja     133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
     133eeb6:	41 0f a3 ec          	bt     r12d,ebp
     133eeba:	73 10                	jae    133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
     133eebc:	4c 89 ff             	mov    rdi,r15
     133eebf:	4c 89 ee             	mov    rsi,r13
     133eec2:	e8 73 43 8d ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
     133eec7:	c6 44 24 7f 00       	mov    BYTE PTR [rsp+0x7f],0x0
     133eecc:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     133eed3:	00 
     133eed4:	e8 ad f5 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     133eed9:	49 83 c5 58          	add    r13,0x58
     133eedd:	49 39 dd             	cmp    r13,rbx
     133eee0:	75 91                	jne    133ee73 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1843f7>
     133eee2:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     133eee6:	49 83 bc 24 80 00 00 	cmp    QWORD PTR [r12+0x80],0x0
     133eeed:	00 00 
     133eeef:	0f 84 5e 02 00 00    	je     133f153 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1846d7>
     133eef5:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
     133eefa:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     133eefd:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133ef04:	00 
     133ef05:	4c 89 f7             	mov    rdi,r14
     133ef08:	ff 50 18             	call   QWORD PTR [rax+0x18]
     133ef0b:	41 8b 06             	mov    eax,DWORD PTR [r14]
     133ef0e:	ff c8                	dec    eax
     133ef10:	83 f8 fe             	cmp    eax,0xfffffffe
     133ef13:	0f 92 c0             	setb   al
     133ef16:	41 22 46 0c          	and    al,BYTE PTR [r14+0xc]
     133ef1a:	88 44 24 08          	mov    BYTE PTR [rsp+0x8],al
     133ef1e:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     133ef25:	00 
     133ef26:	e8 fd c7 73 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     133ef2b:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]
     133ef30:	49 8b 44 24 38       	mov    rax,QWORD PTR [r12+0x38]
     133ef35:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     133ef3a:	49 39 c7             	cmp    r15,rax
     133ef3d:	0f 84 10 02 00 00    	je     133f153 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1846d7>
     133ef43:	4c 8d 6c 24 48       	lea    r13,[rsp+0x48]
     133ef48:	41 8b 57 38          	mov    edx,DWORD PTR [r15+0x38]
     133ef4c:	49 8b 7c 24 68       	mov    rdi,QWORD PTR [r12+0x68]

### centered 0x133f044
     133eff0:	e8 41 c8 73 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     133eff5:	48 89 d1             	mov    rcx,rdx
     133eff8:	48 89 df             	mov    rdi,rbx
     133effb:	44 89 e6             	mov    esi,r12d
     133effe:	48 89 c2             	mov    rdx,rax
     133f001:	e8 88 c7 33 00       	call   167b78e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8fa>
     133f006:	4c 89 ef             	mov    rdi,r13
     133f009:	e8 82 ee 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133f00e:	40 20 6c 24 7f       	and    BYTE PTR [rsp+0x7f],bpl
     133f013:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     133f01a:	00 
     133f01b:	e8 70 ee 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133f020:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     133f023:	4d 85 f6             	test   r14,r14
     133f026:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     133f02a:	0f 85 41 ff ff ff    	jne    133ef71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844f5>
     133f030:	49 83 c7 58          	add    r15,0x58
     133f034:	4c 3b 7c 24 28       	cmp    r15,QWORD PTR [rsp+0x28]
     133f039:	0f 85 09 ff ff ff    	jne    133ef48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844cc>
     133f03f:	e9 0f 01 00 00       	jmp    133f153 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1846d7>
     133f044:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     133f04b:	00 00 
     133f04d:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133f054:	00 00 
     133f056:	6a 18                	push   0x18
     133f058:	5f                   	pop    rdi
     133f059:	e8 a2 ee 4a 00       	call   17edf00 <_Znwm@plt>
     133f05e:	4c 89 20             	mov    QWORD PTR [rax],r12
     133f061:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     133f068:	00 
     133f069:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     133f06d:	48 8d 4c 24 7f       	lea    rcx,[rsp+0x7f]
     133f072:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     133f076:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133f07d:	00 
     133f07e:	49 89 06             	mov    QWORD PTR [r14],rax
     133f081:	48 8d 05 86 32 82 ff 	lea    rax,[rip+0xffffffffff823286]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     133f088:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     133f08c:	48 8d 05 0b 06 00 00 	lea    rax,[rip+0x60b]        # 133f69e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184c22>
     133f093:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     133f097:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]

### centered 0x133f431
     133f3ef:	e8 48 8e 82 ff       	call   b6823c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb51dc>
     133f3f4:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     133f3fb:	00 
     133f3fc:	e8 0b 40 8d ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
     133f401:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133f408:	00 00 
     133f40a:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     133f411:	00 
     133f412:	0f 85 1f 01 00 00    	jne    133f537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184abb>
     133f418:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     133f41f:	5b                   	pop    rbx
     133f420:	41 5c                	pop    r12
     133f422:	41 5d                	pop    r13
     133f424:	41 5e                	pop    r14
     133f426:	41 5f                	pop    r15
     133f428:	5d                   	pop    rbp
     133f429:	c3                   	ret
     133f42a:	eb 02                	jmp    133f42e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1849b2>
     133f42c:	eb 00                	jmp    133f42e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1849b2>
     133f42e:	48 89 c3             	mov    rbx,rax
     133f431:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f438:	00 
     133f439:	e8 04 f7 8e ff       	call   c2eb42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17bae2>
     133f43e:	e9 c2 00 00 00       	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
     133f443:	48 89 c3             	mov    rbx,rax
     133f446:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     133f44d:	00 
     133f44e:	eb 6c                	jmp    133f4bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a40>
     133f450:	eb 00                	jmp    133f452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1849d6>
     133f452:	48 89 c3             	mov    rbx,rax
     133f455:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f45c:	00 
     133f45d:	e8 90 8d 82 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     133f462:	4c 89 f7             	mov    rdi,r14
     133f465:	eb 46                	jmp    133f4ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a31>
     133f467:	48 89 c3             	mov    rbx,rax
     133f46a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f471:	00 
     133f472:	e8 f3 aa 73 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     133f477:	eb 05                	jmp    133f47e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a02>
     133f479:	eb 1d                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>

### centered 0x133f455
     133f41f:	5b                   	pop    rbx
     133f420:	41 5c                	pop    r12
     133f422:	41 5d                	pop    r13
     133f424:	41 5e                	pop    r14
     133f426:	41 5f                	pop    r15
     133f428:	5d                   	pop    rbp
     133f429:	c3                   	ret
     133f42a:	eb 02                	jmp    133f42e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1849b2>
     133f42c:	eb 00                	jmp    133f42e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1849b2>
     133f42e:	48 89 c3             	mov    rbx,rax
     133f431:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f438:	00 
     133f439:	e8 04 f7 8e ff       	call   c2eb42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17bae2>
     133f43e:	e9 c2 00 00 00       	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
     133f443:	48 89 c3             	mov    rbx,rax
     133f446:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     133f44d:	00 
     133f44e:	eb 6c                	jmp    133f4bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a40>
     133f450:	eb 00                	jmp    133f452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1849d6>
     133f452:	48 89 c3             	mov    rbx,rax
     133f455:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f45c:	00 
     133f45d:	e8 90 8d 82 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     133f462:	4c 89 f7             	mov    rdi,r14
     133f465:	eb 46                	jmp    133f4ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a31>
     133f467:	48 89 c3             	mov    rbx,rax
     133f46a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f471:	00 
     133f472:	e8 f3 aa 73 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     133f477:	eb 05                	jmp    133f47e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a02>
     133f479:	eb 1d                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
     133f47b:	48 89 c3             	mov    rbx,rax
     133f47e:	4c 89 f7             	mov    rdi,r14
     133f481:	e8 a0 16 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     133f486:	eb 03                	jmp    133f48b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a0f>
     133f488:	48 89 c3             	mov    rbx,rax
     133f48b:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     133f490:	eb 1b                	jmp    133f4ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a31>
     133f492:	eb 04                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
     133f494:	eb 0c                	jmp    133f4a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a26>
     133f496:	eb 00                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>

### centered 0x133f46a
     133f429:	c3                   	ret
     133f42a:	eb 02                	jmp    133f42e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1849b2>
     133f42c:	eb 00                	jmp    133f42e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1849b2>
     133f42e:	48 89 c3             	mov    rbx,rax
     133f431:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f438:	00 
     133f439:	e8 04 f7 8e ff       	call   c2eb42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17bae2>
     133f43e:	e9 c2 00 00 00       	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
     133f443:	48 89 c3             	mov    rbx,rax
     133f446:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     133f44d:	00 
     133f44e:	eb 6c                	jmp    133f4bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a40>
     133f450:	eb 00                	jmp    133f452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1849d6>
     133f452:	48 89 c3             	mov    rbx,rax
     133f455:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f45c:	00 
     133f45d:	e8 90 8d 82 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     133f462:	4c 89 f7             	mov    rdi,r14
     133f465:	eb 46                	jmp    133f4ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a31>
     133f467:	48 89 c3             	mov    rbx,rax
     133f46a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f471:	00 
     133f472:	e8 f3 aa 73 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     133f477:	eb 05                	jmp    133f47e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a02>
     133f479:	eb 1d                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
     133f47b:	48 89 c3             	mov    rbx,rax
     133f47e:	4c 89 f7             	mov    rdi,r14
     133f481:	e8 a0 16 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     133f486:	eb 03                	jmp    133f48b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a0f>
     133f488:	48 89 c3             	mov    rbx,rax
     133f48b:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     133f490:	eb 1b                	jmp    133f4ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a31>
     133f492:	eb 04                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
     133f494:	eb 0c                	jmp    133f4a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a26>
     133f496:	eb 00                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
     133f498:	48 89 c3             	mov    rbx,rax
     133f49b:	eb 68                	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
     133f49d:	48 89 c3             	mov    rbx,rax
     133f4a0:	eb 6d                	jmp    133f50f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a93>
     133f4a2:	48 89 c3             	mov    rbx,rax
     133f4a5:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### centered 0x133f4a5
     133f46a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f471:	00 
     133f472:	e8 f3 aa 73 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     133f477:	eb 05                	jmp    133f47e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a02>
     133f479:	eb 1d                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
     133f47b:	48 89 c3             	mov    rbx,rax
     133f47e:	4c 89 f7             	mov    rdi,r14
     133f481:	e8 a0 16 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     133f486:	eb 03                	jmp    133f48b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a0f>
     133f488:	48 89 c3             	mov    rbx,rax
     133f48b:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     133f490:	eb 1b                	jmp    133f4ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a31>
     133f492:	eb 04                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
     133f494:	eb 0c                	jmp    133f4a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a26>
     133f496:	eb 00                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
     133f498:	48 89 c3             	mov    rbx,rax
     133f49b:	eb 68                	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
     133f49d:	48 89 c3             	mov    rbx,rax
     133f4a0:	eb 6d                	jmp    133f50f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a93>
     133f4a2:	48 89 c3             	mov    rbx,rax
     133f4a5:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f4ac:	00 
     133f4ad:	e8 74 16 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     133f4b2:	eb 51                	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
     133f4b4:	48 89 c3             	mov    rbx,rax
     133f4b7:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     133f4bc:	e8 cf e9 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133f4c1:	eb 12                	jmp    133f4d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a59>
     133f4c3:	eb 0d                	jmp    133f4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a56>
     133f4c5:	48 89 c3             	mov    rbx,rax
     133f4c8:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     133f4cf:	00 
     133f4d0:	eb 08                	jmp    133f4da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a5e>
     133f4d2:	48 89 c3             	mov    rbx,rax
     133f4d5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     133f4da:	e8 a7 ef 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     133f4df:	eb 24                	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
     133f4e1:	48 89 c3             	mov    rbx,rax
     133f4e4:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     133f4e9:	e8 a2 e9 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133f4ee:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]

### centered 0x1341e19
     1341dc4:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     1341dc8:	75 08                	jne    1341dd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187356>
     1341dca:	c6 84 24 a8 01 00 00 	mov    BYTE PTR [rsp+0x1a8],0x1
     1341dd1:	01 
     1341dd2:	41 83 7c 24 38 01    	cmp    DWORD PTR [r12+0x38],0x1
     1341dd8:	75 0f                	jne    1341de9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18736d>
     1341dda:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
     1341ddf:	f6 40 10 04          	test   BYTE PTR [rax+0x10],0x4
     1341de3:	0f 85 a1 00 00 00    	jne    1341e8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18740e>
     1341de9:	31 c0                	xor    eax,eax
     1341deb:	31 d2                	xor    edx,edx
     1341ded:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1341df4:	00 
     1341df5:	88 96 80 00 00 00    	mov    BYTE PTR [rsi+0x80],dl
     1341dfb:	0f 28 84 24 e0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1e0]
     1341e02:	00 
     1341e03:	0f 11 86 81 00 00 00 	movups XMMWORD PTR [rsi+0x81],xmm0
     1341e0a:	0f 10 84 24 ef 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1ef]
     1341e11:	00 
     1341e12:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
     1341e19:	88 8e a0 00 00 00    	mov    BYTE PTR [rsi+0xa0],cl
     1341e1f:	88 86 a8 00 00 00    	mov    BYTE PTR [rsi+0xa8],al
     1341e25:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1341e2a:	e8 6f 01 00 00       	call   1341f9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187522>
     1341e2f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1341e36:	00 
     1341e37:	e8 e4 da d9 ff       	call   10df920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6d36>
     1341e3c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1341e43:	00 
     1341e44:	e8 e5 34 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1341e49:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1341e4e:	48 89 df             	mov    rdi,rbx
     1341e51:	4c 89 f6             	mov    rsi,r14
     1341e54:	e8 57 01 00 00       	call   1341fb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187534>
     1341e59:	4c 89 f7             	mov    rdi,r14
     1341e5c:	e8 83 53 f8 ff       	call   12c71e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c768>
     1341e61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1341e68:	00 00 
     1341e6a:	48 3b 84 24 00 02 00 	cmp    rax,QWORD PTR [rsp+0x200]
     1341e71:	00 
     1341e72:	0f 85 c6 00 00 00    	jne    1341f3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1874c2>

### centered 0x1344e05
     1344dbe:	e8 af ea 25 00       	call   15a3872 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8df6>
     1344dc3:	4c 89 ff             	mov    rdi,r15
     1344dc6:	e8 77 9d 8e ff       	call   c2eb42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17bae2>
     1344dcb:	48 8d b3 d0 02 00 00 	lea    rsi,[rbx+0x2d0]
     1344dd2:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     1344dd7:	4c 89 ff             	mov    rdi,r15
     1344dda:	e8 51 65 76 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     1344ddf:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     1344de2:	4d 85 ff             	test   r15,r15
     1344de5:	74 13                	je     1344dfa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a37e>
     1344de7:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1344dea:	48 8d 15 07 5e 5d 00 	lea    rdx,[rip+0x5d5e07]        # 191abf8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62008>
     1344df1:	6a 05                	push   0x5
     1344df3:	5e                   	pop    rsi
     1344df4:	4c 89 ff             	mov    rdi,r15
     1344df7:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1344dfa:	48 83 7b 68 00       	cmp    QWORD PTR [rbx+0x68],0x0
     1344dff:	6a 18                	push   0x18
     1344e01:	41 58                	pop    r8
     1344e03:	74 66                	je     1344e6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a3ef>
     1344e05:	48 8b 8b a0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xa0]
     1344e0c:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
     1344e13:	48 29 c8             	sub    rax,rcx
     1344e16:	48 99                	cqo
     1344e18:	4c 89 c5             	mov    rbp,r8
     1344e1b:	49 f7 f8             	idiv   r8
     1344e1e:	48 8d 54 24 48       	lea    rdx,[rsp+0x48]
     1344e23:	4c 89 32             	mov    QWORD PTR [rdx],r14
     1344e26:	48 8d 35 83 1a 52 00 	lea    rsi,[rip+0x521a83]        # 18668b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f98>
     1344e2d:	4c 8d b4 24 88 00 00 	lea    r14,[rsp+0x88]
     1344e34:	00 
     1344e35:	49 89 36             	mov    QWORD PTR [r14],rsi
     1344e38:	49 89 4e 08          	mov    QWORD PTR [r14+0x8],rcx
     1344e3c:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1344e40:	49 89 56 18          	mov    QWORD PTR [r14+0x18],rdx
     1344e44:	4c 8d 6c 24 68       	lea    r13,[rsp+0x68]
     1344e49:	4c 89 ef             	mov    rdi,r13
     1344e4c:	89 c6                	mov    esi,eax
     1344e4e:	e8 7f 36 49 00       	call   17d84d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x42f3>
     1344e53:	4c 89 ef             	mov    rdi,r13
     1344e56:	4c 89 f6             	mov    rsi,r14

### centered 0x1344ee5
     1344e93:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
     1344e98:	4d 89 ef             	mov    r15,r13
     1344e9b:	49 29 ef             	sub    r15,rbp
     1344e9e:	4c 89 f8             	mov    rax,r15
     1344ea1:	48 99                	cqo
     1344ea3:	49 f7 f8             	idiv   r8
     1344ea6:	4d 85 ff             	test   r15,r15
     1344ea9:	0f 8e 20 03 00 00    	jle    13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
     1344eaf:	48 89 c1             	mov    rcx,rax
     1344eb2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1344eb7:	4c 8b b7 a8 00 00 00 	mov    r14,QWORD PTR [rdi+0xa8]
     1344ebe:	4c 8d 8f b0 00 00 00 	lea    r9,[rdi+0xb0]
     1344ec5:	48 8b b7 b0 00 00 00 	mov    rsi,QWORD PTR [rdi+0xb0]
     1344ecc:	48 89 f0             	mov    rax,rsi
     1344ecf:	4c 29 f0             	sub    rax,r14
     1344ed2:	48 99                	cqo
     1344ed4:	49 f7 f8             	idiv   r8
     1344ed7:	48 39 c8             	cmp    rax,rcx
     1344eda:	0f 8d 81 01 00 00    	jge    1345061 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a5e5>
     1344ee0:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
     1344ee5:	48 8b bf a0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xa0]
     1344eec:	4c 89 f0             	mov    rax,r14
     1344eef:	48 29 f8             	sub    rax,rdi
     1344ef2:	48 99                	cqo
     1344ef4:	49 f7 f8             	idiv   r8
     1344ef7:	48 01 c1             	add    rcx,rax
     1344efa:	48 89 ca             	mov    rdx,rcx
     1344efd:	4c 89 c3             	mov    rbx,r8
     1344f00:	e8 71 65 73 ff       	call   a7b476 <JNI_OnUnload@@Base+0x2d43>
     1344f05:	48 89 c6             	mov    rsi,rax
     1344f08:	4c 89 f0             	mov    rax,r14
     1344f0b:	49 2b 04 24          	sub    rax,QWORD PTR [r12]
     1344f0f:	48 99                	cqo
     1344f11:	48 f7 fb             	idiv   rbx
     1344f14:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1344f1b:	00 
     1344f1c:	48 89 c2             	mov    rdx,rax
     1344f1f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1344f24:	e8 93 65 73 ff       	call   a7b4bc <JNI_OnUnload@@Base+0x2d89>
     1344f29:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
     1344f30:	00 

### centered 0x1344f85
     1344f34:	48 83 c5 08          	add    rbp,0x8
     1344f38:	31 c9                	xor    ecx,ecx
     1344f3a:	48 8d 1d 9f 19 52 00 	lea    rbx,[rip+0x52199f]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
     1344f41:	0f 57 c0             	xorps  xmm0,xmm0
     1344f44:	48 8d 14 08          	lea    rdx,[rax+rcx*1]
     1344f48:	48 83 c2 18          	add    rdx,0x18
     1344f4c:	48 89 5a e8          	mov    QWORD PTR [rdx-0x18],rbx
     1344f50:	48 8b 74 0d 00       	mov    rsi,QWORD PTR [rbp+rcx*1+0x0]
     1344f55:	48 89 72 f0          	mov    QWORD PTR [rdx-0x10],rsi
     1344f59:	48 8b 74 0d 08       	mov    rsi,QWORD PTR [rbp+rcx*1+0x8]
     1344f5e:	48 89 72 f8          	mov    QWORD PTR [rdx-0x8],rsi
     1344f62:	0f 11 44 0d 00       	movups XMMWORD PTR [rbp+rcx*1+0x0],xmm0
     1344f67:	48 83 c1 18          	add    rcx,0x18
     1344f6b:	4c 39 fa             	cmp    rdx,r15
     1344f6e:	75 d4                	jne    1344f44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a4c8>
     1344f70:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
     1344f77:	00 
     1344f78:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     1344f7f:	00 
     1344f80:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1344f85:	49 8b 95 a0 00 00 00 	mov    rdx,QWORD PTR [r13+0xa0]
     1344f8c:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1344f91:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1344f96:	0f 10 44 24 48       	movups xmm0,XMMWORD PTR [rsp+0x48]
     1344f9b:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     1344f9f:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     1344fa4:	48 89 ef             	mov    rdi,rbp
     1344fa7:	4c 89 f6             	mov    rsi,r14
     1344faa:	e8 d1 4c ff ff       	call   1339c80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f204>
     1344faf:	49 89 c4             	mov    r12,rax
     1344fb2:	49 8b 85 a8 00 00 00 	mov    rax,QWORD PTR [r13+0xa8]
     1344fb9:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
     1344fbe:	4c 89 39             	mov    QWORD PTR [rcx],r15
     1344fc1:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
     1344fc6:	4c 89 3a             	mov    QWORD PTR [rdx],r15
     1344fc9:	48 89 6c 24 68       	mov    QWORD PTR [rsp+0x68],rbp
     1344fce:	48 89 54 24 70       	mov    QWORD PTR [rsp+0x70],rdx
     1344fd3:	48 89 4c 24 78       	mov    QWORD PTR [rsp+0x78],rcx
     1344fd8:	4c 39 f0             	cmp    rax,r14
     1344fdb:	74 2d                	je     134500a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a58e>
     1344fdd:	0f 57 c0             	xorps  xmm0,xmm0

### centered 0x134501d
     1344fce:	48 89 54 24 70       	mov    QWORD PTR [rsp+0x70],rdx
     1344fd3:	48 89 4c 24 78       	mov    QWORD PTR [rsp+0x78],rcx
     1344fd8:	4c 39 f0             	cmp    rax,r14
     1344fdb:	74 2d                	je     134500a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a58e>
     1344fdd:	0f 57 c0             	xorps  xmm0,xmm0
     1344fe0:	49 89 1f             	mov    QWORD PTR [r15],rbx
     1344fe3:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
     1344fe7:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     1344feb:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
     1344fef:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     1344ff3:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
     1344ff8:	49 83 c6 18          	add    r14,0x18
     1344ffc:	49 83 c7 18          	add    r15,0x18
     1345000:	49 39 c6             	cmp    r14,rax
     1345003:	75 db                	jne    1344fe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a564>
     1345005:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
     134500a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     134500f:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
     1345013:	e8 82 49 ff ff       	call   133999a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef1e>
     1345018:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     134501d:	0f 10 82 a0 00 00 00 	movups xmm0,XMMWORD PTR [rdx+0xa0]
     1345024:	4c 89 a2 a0 00 00 00 	mov    QWORD PTR [rdx+0xa0],r12
     134502b:	4c 89 ba a8 00 00 00 	mov    QWORD PTR [rdx+0xa8],r15
     1345032:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1345039:	00 
     134503a:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     134503e:	48 8b 82 b0 00 00 00 	mov    rax,QWORD PTR [rdx+0xb0]
     1345045:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     1345049:	48 89 8a b0 00 00 00 	mov    QWORD PTR [rdx+0xb0],rcx
     1345050:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     1345054:	0f 13 07             	movlps QWORD PTR [rdi],xmm0
     1345057:	e8 e4 4b ff ff       	call   1339c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f1c4>
     134505c:	e9 6e 01 00 00       	jmp    13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
     1345061:	4d 89 f4             	mov    r12,r14
     1345064:	4d 29 f4             	sub    r12,r14
     1345067:	4c 89 e0             	mov    rax,r12
     134506a:	48 99                	cqo
     134506c:	49 f7 f8             	idiv   r8
     134506f:	48 39 c8             	cmp    rax,rcx
     1345072:	7d 71                	jge    13450e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a669>
     1345074:	49 8d 14 2c          	lea    rdx,[r12+rbp*1]

### centered 0x1345024
     1344fd3:	48 89 4c 24 78       	mov    QWORD PTR [rsp+0x78],rcx
     1344fd8:	4c 39 f0             	cmp    rax,r14
     1344fdb:	74 2d                	je     134500a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a58e>
     1344fdd:	0f 57 c0             	xorps  xmm0,xmm0
     1344fe0:	49 89 1f             	mov    QWORD PTR [r15],rbx
     1344fe3:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
     1344fe7:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     1344feb:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
     1344fef:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     1344ff3:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
     1344ff8:	49 83 c6 18          	add    r14,0x18
     1344ffc:	49 83 c7 18          	add    r15,0x18
     1345000:	49 39 c6             	cmp    r14,rax
     1345003:	75 db                	jne    1344fe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a564>
     1345005:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
     134500a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     134500f:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
     1345013:	e8 82 49 ff ff       	call   133999a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef1e>
     1345018:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     134501d:	0f 10 82 a0 00 00 00 	movups xmm0,XMMWORD PTR [rdx+0xa0]
     1345024:	4c 89 a2 a0 00 00 00 	mov    QWORD PTR [rdx+0xa0],r12
     134502b:	4c 89 ba a8 00 00 00 	mov    QWORD PTR [rdx+0xa8],r15
     1345032:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1345039:	00 
     134503a:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     134503e:	48 8b 82 b0 00 00 00 	mov    rax,QWORD PTR [rdx+0xb0]
     1345045:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     1345049:	48 89 8a b0 00 00 00 	mov    QWORD PTR [rdx+0xb0],rcx
     1345050:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     1345054:	0f 13 07             	movlps QWORD PTR [rdi],xmm0
     1345057:	e8 e4 4b ff ff       	call   1339c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f1c4>
     134505c:	e9 6e 01 00 00       	jmp    13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
     1345061:	4d 89 f4             	mov    r12,r14
     1345064:	4d 29 f4             	sub    r12,r14
     1345067:	4c 89 e0             	mov    rax,r12
     134506a:	48 99                	cqo
     134506c:	49 f7 f8             	idiv   r8
     134506f:	48 39 c8             	cmp    rax,rcx
     1345072:	7d 71                	jge    13450e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a669>
     1345074:	49 8d 14 2c          	lea    rdx,[r12+rbp*1]
     1345078:	48 8d 44 24 68       	lea    rax,[rsp+0x68]

### centered 0x134f4da
     134f489:	48 83 c1 07          	add    rcx,0x7
     134f48d:	a8 01                	test   al,0x1
     134f48f:	49 0f 44 ce          	cmove  rcx,r14
     134f493:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     134f498:	48 63 4c 24 68       	movsxd rcx,DWORD PTR [rsp+0x68]
     134f49d:	48 85 c9             	test   rcx,rcx
     134f4a0:	0f 84 eb 01 00 00    	je     134f691 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194c15>
     134f4a6:	48 8d 43 20          	lea    rax,[rbx+0x20]
     134f4aa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     134f4af:	48 8d 43 30          	lea    rax,[rbx+0x30]
     134f4b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     134f4b8:	48 c1 e1 03          	shl    rcx,0x3
     134f4bc:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
     134f4c3:	00 
     134f4c4:	45 31 ff             	xor    r15d,r15d
     134f4c7:	45 31 ed             	xor    r13d,r13d
     134f4ca:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
     134f4cf:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     134f4d4:	4a 8b 2c 38          	mov    rbp,QWORD PTR [rax+r15*1]
     134f4d8:	31 c0                	xor    eax,eax
     134f4da:	88 84 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],al
     134f4e1:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al
     134f4e8:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
     134f4ef:	0f 57 c0             	xorps  xmm0,xmm0
     134f4f2:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     134f4f9:	00 
     134f4fa:	0f 11 84 24 89 00 00 	movups XMMWORD PTR [rsp+0x89],xmm0
     134f501:	00 
     134f502:	48 8b 75 18          	mov    rsi,QWORD PTR [rbp+0x18]
     134f506:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     134f50a:	4d 89 f4             	mov    r12,r14
     134f50d:	4c 89 f7             	mov    rdi,r14
     134f510:	e8 6b eb 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     134f515:	4c 63 75 48          	movsxd r14,DWORD PTR [rbp+0x48]
     134f519:	4c 89 b4 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r14
     134f520:	00 
     134f521:	8b 7d 40             	mov    edi,DWORD PTR [rbp+0x40]
     134f524:	e8 61 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
     134f529:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     134f530:	00 
     134f531:	88 94 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],dl

### centered 0x134f531
     134f4da:	88 84 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],al
     134f4e1:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al
     134f4e8:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
     134f4ef:	0f 57 c0             	xorps  xmm0,xmm0
     134f4f2:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     134f4f9:	00 
     134f4fa:	0f 11 84 24 89 00 00 	movups XMMWORD PTR [rsp+0x89],xmm0
     134f501:	00 
     134f502:	48 8b 75 18          	mov    rsi,QWORD PTR [rbp+0x18]
     134f506:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     134f50a:	4d 89 f4             	mov    r12,r14
     134f50d:	4c 89 f7             	mov    rdi,r14
     134f510:	e8 6b eb 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     134f515:	4c 63 75 48          	movsxd r14,DWORD PTR [rbp+0x48]
     134f519:	4c 89 b4 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r14
     134f520:	00 
     134f521:	8b 7d 40             	mov    edi,DWORD PTR [rbp+0x40]
     134f524:	e8 61 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
     134f529:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     134f530:	00 
     134f531:	88 94 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],dl
     134f538:	8b 7d 44             	mov    edi,DWORD PTR [rbp+0x44]
     134f53b:	e8 4a 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
     134f540:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     134f547:	00 
     134f548:	88 94 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],dl
     134f54f:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     134f553:	48 8b 68 28          	mov    rbp,QWORD PTR [rax+0x28]
     134f557:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
     134f55b:	48 39 f5             	cmp    rbp,rsi
     134f55e:	73 58                	jae    134f5b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194b3c>
     134f560:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     134f567:	00 
     134f568:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     134f56c:	0f 28 84 24 80 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x80]
     134f573:	00 
     134f574:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
     134f578:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
     134f57f:	00 00 
     134f581:	0f 57 c0             	xorps  xmm0,xmm0
     134f584:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0

### centered 0x13509f7
     13509ab:	4c 89 f7             	mov    rdi,r14
     13509ae:	48 89 c2             	mov    rdx,rax
     13509b1:	45 31 c0             	xor    r8d,r8d
     13509b4:	45 31 c9             	xor    r9d,r9d
     13509b7:	e8 4a b1 31 00       	call   166bb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fc72>
     13509bc:	e9 6d 01 00 00       	jmp    1350b2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1960b2>
     13509c1:	31 c0                	xor    eax,eax
     13509c3:	45 85 e4             	test   r12d,r12d
     13509c6:	0f 94 c1             	sete   cl
     13509c9:	20 c1                	and    cl,al
     13509cb:	88 8d 98 00 00 00    	mov    BYTE PTR [rbp+0x98],cl
     13509d1:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     13509d8:	00 
     13509d9:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     13509e0:	00 
     13509e1:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     13509e5:	f3 0f 6f 84 24 98 00 	movdqu xmm0,XMMWORD PTR [rsp+0x98]
     13509ec:	00 00 
     13509ee:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
     13509f2:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
     13509f7:	48 8d 85 a0 00 00 00 	lea    rax,[rbp+0xa0]
     13509fe:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1350a03:	31 ed                	xor    ebp,ebp
     1350a05:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
     1350a0c:	00 
     1350a0d:	4c 39 ac 24 80 00 00 	cmp    QWORD PTR [rsp+0x80],r13
     1350a14:	00 
     1350a15:	74 0a                	je     1350a21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195fa5>
     1350a17:	4c 8b b4 24 90 00 00 	mov    r14,QWORD PTR [rsp+0x90]
     1350a1e:	00 
     1350a1f:	eb 21                	jmp    1350a42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195fc6>
     1350a21:	4c 3b ac 24 88 00 00 	cmp    r13,QWORD PTR [rsp+0x88]
     1350a28:	00 
     1350a29:	0f 84 b3 00 00 00    	je     1350ae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196066>
     1350a2f:	4c 8b b4 24 90 00 00 	mov    r14,QWORD PTR [rsp+0x90]
     1350a36:	00 
     1350a37:	4c 3b 74 24 10       	cmp    r14,QWORD PTR [rsp+0x10]
     1350a3c:	0f 84 a0 00 00 00    	je     1350ae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196066>
     1350a42:	4d 8d 7e 30          	lea    r15,[r14+0x30]
     1350a46:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1350a4a:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]

### centered 0x1354dce
     1354d7b:	88 0b                	mov    BYTE PTR [rbx],cl
     1354d7d:	41 83 bd 90 02 00 00 	cmp    DWORD PTR [r13+0x290],0x0
     1354d84:	00 
     1354d85:	0f 94 43 01          	sete   BYTE PTR [rbx+0x1]
     1354d89:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     1354d8d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     1354d92:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     1354d96:	e8 a5 91 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1354d9b:	4c 8d 63 20          	lea    r12,[rbx+0x20]
     1354d9f:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
     1354da4:	4c 89 e7             	mov    rdi,r12
     1354da7:	48 89 ee             	mov    rsi,rbp
     1354daa:	4c 89 ea             	mov    rdx,r13
     1354dad:	e8 56 01 00 00       	call   1354f08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a48c>
     1354db2:	41 8a 47 08          	mov    al,BYTE PTR [r15+0x8]
     1354db6:	88 83 98 00 00 00    	mov    BYTE PTR [rbx+0x98],al
     1354dbc:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1354dbf:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
     1354dc6:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     1354dcb:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     1354dce:	48 89 83 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rax
     1354dd5:	8a 41 08             	mov    al,BYTE PTR [rcx+0x8]
     1354dd8:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
     1354dde:	41 80 7e 04 00       	cmp    BYTE PTR [r14+0x4],0x0
     1354de3:	0f 95 c0             	setne  al
     1354de6:	41 83 3e 00          	cmp    DWORD PTR [r14],0x0
     1354dea:	0f 94 c1             	sete   cl
     1354ded:	20 c1                	and    cl,al
     1354def:	88 8b b0 00 00 00    	mov    BYTE PTR [rbx+0xb0],cl
     1354df5:	48 81 c3 b8 00 00 00 	add    rbx,0xb8
     1354dfc:	48 8d 35 79 d1 0f ff 	lea    rsi,[rip+0xffffffffff0fd179]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1354e03:	48 89 df             	mov    rdi,rbx
     1354e06:	e8 73 4c 72 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1354e0b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1354e10:	e8 7b 90 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1354e15:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1354e1a:	e8 1d 52 ed ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     1354e1f:	48 8d bc 24 c8 02 00 	lea    rdi,[rsp+0x2c8]
     1354e26:	00 
     1354e27:	e8 a0 99 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1354e2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### centered 0x1357422
     13573cc:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
     13573d0:	0f 57 c0             	xorps  xmm0,xmm0
     13573d3:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     13573d8:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     13573dc:	8b 46 48             	mov    eax,DWORD PTR [rsi+0x48]
     13573df:	89 47 48             	mov    DWORD PTR [rdi+0x48],eax
     13573e2:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
     13573e6:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     13573ea:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
     13573ee:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
     13573f2:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     13573f6:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     13573fb:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     13573ff:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     1357403:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     1357407:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     135740b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     135740f:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     1357414:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
     135741b:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
     1357422:	48 8b 86 a0 00 00 00 	mov    rax,QWORD PTR [rsi+0xa0]
     1357429:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     1357430:	0f 10 8e 90 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x90]
     1357437:	0f 11 8f 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm1
     135743e:	48 83 a6 a0 00 00 00 	and    QWORD PTR [rsi+0xa0],0x0
     1357445:	00 
     1357446:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
     135744d:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     1357454:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     135745b:	31 c0                	xor    eax,eax
     135745d:	88 87 b0 00 00 00    	mov    BYTE PTR [rdi+0xb0],al
     1357463:	88 87 c8 00 00 00    	mov    BYTE PTR [rdi+0xc8],al
     1357469:	38 86 c8 00 00 00    	cmp    BYTE PTR [rsi+0xc8],al
     135746f:	74 32                	je     13574a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ca27>
     1357471:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     1357478:	48 8b 8e c0 00 00 00 	mov    rcx,QWORD PTR [rsi+0xc0]
     135747f:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     1357483:	0f 10 8e b0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xb0]
     135748a:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     135748d:	0f 11 86 b0 00 00 00 	movups XMMWORD PTR [rsi+0xb0],xmm0
     1357494:	48 83 a6 c0 00 00 00 	and    QWORD PTR [rsi+0xc0],0x0

### centered 0x1357429
     13573d0:	0f 57 c0             	xorps  xmm0,xmm0
     13573d3:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     13573d8:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     13573dc:	8b 46 48             	mov    eax,DWORD PTR [rsi+0x48]
     13573df:	89 47 48             	mov    DWORD PTR [rdi+0x48],eax
     13573e2:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
     13573e6:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     13573ea:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
     13573ee:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
     13573f2:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     13573f6:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     13573fb:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     13573ff:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     1357403:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     1357407:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     135740b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     135740f:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     1357414:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
     135741b:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
     1357422:	48 8b 86 a0 00 00 00 	mov    rax,QWORD PTR [rsi+0xa0]
     1357429:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     1357430:	0f 10 8e 90 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x90]
     1357437:	0f 11 8f 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm1
     135743e:	48 83 a6 a0 00 00 00 	and    QWORD PTR [rsi+0xa0],0x0
     1357445:	00 
     1357446:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
     135744d:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     1357454:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     135745b:	31 c0                	xor    eax,eax
     135745d:	88 87 b0 00 00 00    	mov    BYTE PTR [rdi+0xb0],al
     1357463:	88 87 c8 00 00 00    	mov    BYTE PTR [rdi+0xc8],al
     1357469:	38 86 c8 00 00 00    	cmp    BYTE PTR [rsi+0xc8],al
     135746f:	74 32                	je     13574a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ca27>
     1357471:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     1357478:	48 8b 8e c0 00 00 00 	mov    rcx,QWORD PTR [rsi+0xc0]
     135747f:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     1357483:	0f 10 8e b0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xb0]
     135748a:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     135748d:	0f 11 86 b0 00 00 00 	movups XMMWORD PTR [rsi+0xb0],xmm0
     1357494:	48 83 a6 c0 00 00 00 	and    QWORD PTR [rsi+0xc0],0x0
     135749b:	00 

### centered 0x135743e
     13573dc:	8b 46 48             	mov    eax,DWORD PTR [rsi+0x48]
     13573df:	89 47 48             	mov    DWORD PTR [rdi+0x48],eax
     13573e2:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
     13573e6:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     13573ea:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
     13573ee:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
     13573f2:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     13573f6:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     13573fb:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     13573ff:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     1357403:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     1357407:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     135740b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     135740f:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     1357414:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
     135741b:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
     1357422:	48 8b 86 a0 00 00 00 	mov    rax,QWORD PTR [rsi+0xa0]
     1357429:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     1357430:	0f 10 8e 90 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x90]
     1357437:	0f 11 8f 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm1
     135743e:	48 83 a6 a0 00 00 00 	and    QWORD PTR [rsi+0xa0],0x0
     1357445:	00 
     1357446:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
     135744d:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     1357454:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     135745b:	31 c0                	xor    eax,eax
     135745d:	88 87 b0 00 00 00    	mov    BYTE PTR [rdi+0xb0],al
     1357463:	88 87 c8 00 00 00    	mov    BYTE PTR [rdi+0xc8],al
     1357469:	38 86 c8 00 00 00    	cmp    BYTE PTR [rsi+0xc8],al
     135746f:	74 32                	je     13574a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ca27>
     1357471:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     1357478:	48 8b 8e c0 00 00 00 	mov    rcx,QWORD PTR [rsi+0xc0]
     135747f:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     1357483:	0f 10 8e b0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xb0]
     135748a:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     135748d:	0f 11 86 b0 00 00 00 	movups XMMWORD PTR [rsi+0xb0],xmm0
     1357494:	48 83 a6 c0 00 00 00 	and    QWORD PTR [rsi+0xc0],0x0
     135749b:	00 
     135749c:	c6 87 c8 00 00 00 01 	mov    BYTE PTR [rdi+0xc8],0x1
     13574a3:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
     13574aa:	0f 10 96 d9 00 00 00 	movups xmm2,XMMWORD PTR [rsi+0xd9]

### centered 0x1357719
     13576b5:	0f 10 4e 48          	movups xmm1,XMMWORD PTR [rsi+0x48]
     13576b9:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     13576bc:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
     13576c0:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
     13576c5:	c6 47 60 01          	mov    BYTE PTR [rdi+0x60],0x1
     13576c9:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     13576cd:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     13576d1:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     13576d5:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     13576d9:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     13576dd:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     13576e2:	8a 86 80 00 00 00    	mov    al,BYTE PTR [rsi+0x80]
     13576e8:	88 87 80 00 00 00    	mov    BYTE PTR [rdi+0x80],al
     13576ee:	48 8b 86 98 00 00 00 	mov    rax,QWORD PTR [rsi+0x98]
     13576f5:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
     13576fc:	0f 10 8e 88 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x88]
     1357703:	0f 11 8f 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm1
     135770a:	48 83 a6 98 00 00 00 	and    QWORD PTR [rsi+0x98],0x0
     1357711:	00 
     1357712:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
     1357719:	8b 86 a0 00 00 00    	mov    eax,DWORD PTR [rsi+0xa0]
     135771f:	89 87 a0 00 00 00    	mov    DWORD PTR [rdi+0xa0],eax
     1357725:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
     135772c:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
     1357733:	00 
     1357734:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     135773b:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     1357742:	48 8b 86 b0 00 00 00 	mov    rax,QWORD PTR [rsi+0xb0]
     1357749:	48 89 87 b0 00 00 00 	mov    QWORD PTR [rdi+0xb0],rax
     1357750:	48 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [rsi+0xb8]
     1357757:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
     135775e:	48 83 a6 b8 00 00 00 	and    QWORD PTR [rsi+0xb8],0x0
     1357765:	00 
     1357766:	0f 11 86 a8 00 00 00 	movups XMMWORD PTR [rsi+0xa8],xmm0
     135776d:	8a 86 e0 00 00 00    	mov    al,BYTE PTR [rsi+0xe0]
     1357773:	88 87 e0 00 00 00    	mov    BYTE PTR [rdi+0xe0],al
     1357779:	0f 10 86 c0 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xc0]
     1357780:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
     1357787:	0f 11 8f d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm1
     135778e:	0f 11 87 c0 00 00 00 	movups XMMWORD PTR [rdi+0xc0],xmm0
     1357795:	c3                   	ret

### centered 0x135771f
     13576b9:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     13576bc:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
     13576c0:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
     13576c5:	c6 47 60 01          	mov    BYTE PTR [rdi+0x60],0x1
     13576c9:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     13576cd:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     13576d1:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     13576d5:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     13576d9:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     13576dd:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     13576e2:	8a 86 80 00 00 00    	mov    al,BYTE PTR [rsi+0x80]
     13576e8:	88 87 80 00 00 00    	mov    BYTE PTR [rdi+0x80],al
     13576ee:	48 8b 86 98 00 00 00 	mov    rax,QWORD PTR [rsi+0x98]
     13576f5:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
     13576fc:	0f 10 8e 88 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x88]
     1357703:	0f 11 8f 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm1
     135770a:	48 83 a6 98 00 00 00 	and    QWORD PTR [rsi+0x98],0x0
     1357711:	00 
     1357712:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
     1357719:	8b 86 a0 00 00 00    	mov    eax,DWORD PTR [rsi+0xa0]
     135771f:	89 87 a0 00 00 00    	mov    DWORD PTR [rdi+0xa0],eax
     1357725:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
     135772c:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
     1357733:	00 
     1357734:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     135773b:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     1357742:	48 8b 86 b0 00 00 00 	mov    rax,QWORD PTR [rsi+0xb0]
     1357749:	48 89 87 b0 00 00 00 	mov    QWORD PTR [rdi+0xb0],rax
     1357750:	48 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [rsi+0xb8]
     1357757:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
     135775e:	48 83 a6 b8 00 00 00 	and    QWORD PTR [rsi+0xb8],0x0
     1357765:	00 
     1357766:	0f 11 86 a8 00 00 00 	movups XMMWORD PTR [rsi+0xa8],xmm0
     135776d:	8a 86 e0 00 00 00    	mov    al,BYTE PTR [rsi+0xe0]
     1357773:	88 87 e0 00 00 00    	mov    BYTE PTR [rdi+0xe0],al
     1357779:	0f 10 86 c0 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xc0]
     1357780:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
     1357787:	0f 11 8f d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm1
     135778e:	0f 11 87 c0 00 00 00 	movups XMMWORD PTR [rdi+0xc0],xmm0
     1357795:	c3                   	ret
     1357796:	80 bf 90 00 00 00 00 	cmp    BYTE PTR [rdi+0x90],0x0

### centered 0x135cd71
     135cd21:	0f 11 8c 24 d8 00 00 	movups XMMWORD PTR [rsp+0xd8],xmm1
     135cd28:	00 
     135cd29:	0f 11 84 24 c8 00 00 	movups XMMWORD PTR [rsp+0xc8],xmm0
     135cd30:	00 
     135cd31:	4c 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r8
     135cd38:	00 
     135cd39:	48 89 8c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rcx
     135cd40:	00 
     135cd41:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
     135cd48:	00 
     135cd49:	48 8b 8c 24 78 01 00 	mov    rcx,QWORD PTR [rsp+0x178]
     135cd50:	00 
     135cd51:	48 89 8c 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rcx
     135cd58:	00 
     135cd59:	48 8b 8c 24 28 01 00 	mov    rcx,QWORD PTR [rsp+0x128]
     135cd60:	00 
     135cd61:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
     135cd68:	00 
     135cd69:	48 8b 8c 24 18 01 00 	mov    rcx,QWORD PTR [rsp+0x118]
     135cd70:	00 
     135cd71:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     135cd78:	00 
     135cd79:	48 8b 8c 24 30 01 00 	mov    rcx,QWORD PTR [rsp+0x130]
     135cd80:	00 
     135cd81:	48 89 8c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rcx
     135cd88:	00 
     135cd89:	48 8d 8c 24 e8 01 00 	lea    rcx,[rsp+0x1e8]
     135cd90:	00 
     135cd91:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     135cd98:	00 
     135cd99:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     135cda0:	00 
     135cda1:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
     135cda8:	00 
     135cda9:	48 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rsi
     135cdb0:	00 
     135cdb1:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12
     135cdb6:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
     135cdbb:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     135cdc0:	48 8b 84 24 38 01 00 	mov    rax,QWORD PTR [rsp+0x138]
     135cdc7:	00 

### centered 0x135d137
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
     135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
     135d0f4:	48 89 f5             	mov    rbp,rsi
     135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     135d101:	48 8b 8c 24 88 10 00 	mov    rcx,QWORD PTR [rsp+0x1088]
     135d108:	00 
     135d109:	4c 8d 6f 10          	lea    r13,[rdi+0x10]
     135d10d:	48 8d 47 20          	lea    rax,[rdi+0x20]
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

### centered 0x135d16b
     135d109:	4c 8d 6f 10          	lea    r13,[rdi+0x10]
     135d10d:	48 8d 47 20          	lea    rax,[rdi+0x20]
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
     135d1b4:	4c 89 ff             	mov    rdi,r15
     135d1b7:	4c 89 ac 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r13
     135d1be:	00 
     135d1bf:	e8 ba c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1c4:	4c 8d a4 24 e8 0a 00 	lea    r12,[rsp+0xae8]
     135d1cb:	00 

### centered 0x135e5b6
     135e552:	e8 39 bd 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135e557:	48 8d 05 1a a7 50 00 	lea    rax,[rip+0x50a71a]        # 1868c78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25360>
     135e55e:	49 89 04 24          	mov    QWORD PTR [r12],rax
     135e562:	66 0f ef c0          	pxor   xmm0,xmm0
     135e566:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
     135e56d:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
     135e572:	e8 35 aa cf ff       	call   1058fac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2203c2>
     135e577:	66 0f ef c0          	pxor   xmm0,xmm0
     135e57b:	66 41 0f 7f 44 24 50 	movdqa XMMWORD PTR [r12+0x50],xmm0
     135e582:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
     135e589:	f3 41 0f 7f 44 24 28 	movdqu XMMWORD PTR [r12+0x28],xmm0
     135e590:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     135e596:	41 c7 44 24 60 00 00 	mov    DWORD PTR [r12+0x60],0x3f800000
     135e59d:	80 3f 
     135e59f:	31 db                	xor    ebx,ebx
     135e5a1:	41 88 5c 24 68       	mov    BYTE PTR [r12+0x68],bl
     135e5a6:	41 88 9c 24 98 00 00 	mov    BYTE PTR [r12+0x98],bl
     135e5ad:	00 
     135e5ae:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135e5b5:	00 
     135e5b6:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
     135e5bd:	00 
     135e5be:	48 8b 84 24 90 10 00 	mov    rax,QWORD PTR [rsp+0x1090]
     135e5c5:	00 
     135e5c6:	49 89 84 24 a8 00 00 	mov    QWORD PTR [r12+0xa8],rax
     135e5cd:	00 
     135e5ce:	4d 8d bc 24 d0 00 00 	lea    r15,[r12+0xd0]
     135e5d5:	00 
     135e5d6:	66 41 0f 7f 84 24 b0 	movdqa XMMWORD PTR [r12+0xb0],xmm0
     135e5dd:	00 00 00 
     135e5e0:	f3 41 0f 7f 84 24 b9 	movdqu XMMWORD PTR [r12+0xb9],xmm0
     135e5e7:	00 00 00 
     135e5ea:	4c 89 ff             	mov    rdi,r15
     135e5ed:	e8 04 b4 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e5f2:	49 8d ac 24 e0 00 00 	lea    rbp,[r12+0xe0]
     135e5f9:	00 
     135e5fa:	48 89 ef             	mov    rdi,rbp
     135e5fd:	e8 f4 b3 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e602:	4d 8d ac 24 f0 00 00 	lea    r13,[r12+0xf0]
     135e609:	00 
     135e60a:	48 8d b4 24 60 0f 00 	lea    rsi,[rsp+0xf60]

### centered 0x135ed66
     135ed16:	00 
     135ed17:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ed1e:	00 
     135ed1f:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ed23:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ed27:	4c 89 ef             	mov    rdi,r13
     135ed2a:	e8 01 2e 04 00       	call   13a1b30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e70b4>
     135ed2f:	66 0f ef c0          	pxor   xmm0,xmm0
     135ed33:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ed38:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ed3d:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ed42:	48 89 d8             	mov    rax,rbx
     135ed45:	48 83 c0 68          	add    rax,0x68
     135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ed58:	00 
     135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ed65:	00 
     135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed6d:	00 80 3f 
     135ed70:	6a 64                	push   0x64
     135ed72:	58                   	pop    rax
     135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ed88:	00 
     135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ed90:	00 
     135ed91:	4c 89 ef             	mov    rdi,r13
     135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135eda0:	00 
     135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
     135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135edac:	00 
     135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135edb4:	00 
     135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx

### centered 0x135ee64
     135ee14:	00 
     135ee15:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ee1c:	00 
     135ee1d:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ee21:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ee25:	4c 89 ef             	mov    rdi,r13
     135ee28:	e8 39 4d 04 00       	call   13a3b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e90ea>
     135ee2d:	66 0f ef c0          	pxor   xmm0,xmm0
     135ee31:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ee36:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ee3b:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ee40:	48 89 d8             	mov    rax,rbx
     135ee43:	48 83 c0 68          	add    rax,0x68
     135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ee56:	00 
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ee63:	00 
     135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee6b:	00 80 3f 
     135ee6e:	6a 64                	push   0x64
     135ee70:	58                   	pop    rax
     135ee71:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ee78:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ee7f:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ee86:	00 
     135ee87:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ee8e:	00 
     135ee8f:	4c 89 ef             	mov    rdi,r13
     135ee92:	e8 d3 b0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ee97:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135ee9e:	00 
     135ee9f:	66 0f ef c0          	pxor   xmm0,xmm0
     135eea3:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135eeaa:	00 
     135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135eeb2:	00 
     135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx

### centered 0x135eeab
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ee63:	00 
     135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee6b:	00 80 3f 
     135ee6e:	6a 64                	push   0x64
     135ee70:	58                   	pop    rax
     135ee71:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ee78:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ee7f:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ee86:	00 
     135ee87:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ee8e:	00 
     135ee8f:	4c 89 ef             	mov    rdi,r13
     135ee92:	e8 d3 b0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ee97:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135ee9e:	00 
     135ee9f:	66 0f ef c0          	pxor   xmm0,xmm0
     135eea3:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135eeaa:	00 
     135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135eeb2:	00 
     135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx
     135eeb9:	48 85 ff             	test   rdi,rdi
     135eebc:	74 06                	je     135eec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4448>
     135eebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135eec1:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135eec4:	8a 45 01             	mov    al,BYTE PTR [rbp+0x1]
     135eec7:	88 84 24 20 03 00 00 	mov    BYTE PTR [rsp+0x320],al
     135eece:	8a 45 02             	mov    al,BYTE PTR [rbp+0x2]
     135eed1:	88 84 24 21 03 00 00 	mov    BYTE PTR [rsp+0x321],al
     135eed8:	8a 45 03             	mov    al,BYTE PTR [rbp+0x3]
     135eedb:	88 84 24 22 03 00 00 	mov    BYTE PTR [rsp+0x322],al
     135eee2:	0f 10 45 10          	movups xmm0,XMMWORD PTR [rbp+0x10]
     135eee6:	0f 11 84 24 28 03 00 	movups XMMWORD PTR [rsp+0x328],xmm0
     135eeed:	00 
     135eeee:	0f 10 45 20          	movups xmm0,XMMWORD PTR [rbp+0x20]
     135eef2:	0f 11 84 24 38 03 00 	movups XMMWORD PTR [rsp+0x338],xmm0
     135eef9:	00 
     135eefa:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]

### centered 0x135f2a3
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

## Vptr immediates near paired writers
### 0x13224f4: lea    rax,[rip+0x581c0d]        # 18a4108 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x11048>
     13224d2:	0f 87 92 00 00 00    	ja     132256a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167aee>
     13224d8:	48 89 df             	mov    rdi,rbx
     13224db:	4c 89 e6             	mov    rsi,r12
     13224de:	4c 89 f9             	mov    rcx,r15
     13224e1:	e8 f6 09 00 00       	call   1322edc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168460>
     13224e6:	e9 b8 07 00 00       	jmp    1322ca3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168227>
     13224eb:	48 83 a4 24 88 01 00 	and    QWORD PTR [rsp+0x188],0x0
     13224f2:	00 00 
     13224f4:	48 8d 05 0d 1c 58 00 	lea    rax,[rip+0x581c0d]        # 18a4108 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x11048>
     13224fb:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
     1322502:	00 
     1322503:	4d 8d 66 30          	lea    r12,[r14+0x30]
     1322507:	83 65 18 00          	and    DWORD PTR [rbp+0x18],0x0
     132250b:	0f 57 c0             	xorps  xmm0,xmm0
     132250e:	0f 11 45 08          	movups XMMWORD PTR [rbp+0x8],xmm0
     1322512:	41 8b 46 7c          	mov    eax,DWORD PTR [r14+0x7c]
     1322516:	b9 0c fe ff ff       	mov    ecx,0xfffffe0c
     132251b:	01 c8                	add    eax,ecx
     132251d:	83 f8 63             	cmp    eax,0x63
     1322520:	0f 87 27 01 00 00    	ja     132264d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167bd1>
     1322526:	48 89 df             	mov    rdi,rbx

### 0x13249a2: lea    rax,[rip+0x540e67]        # 1865810 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21ef8>
     1324987:	74 13                	je     132499c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169f20>
     1324989:	c6 87 78 01 00 00 00 	mov    BYTE PTR [rdi+0x178],0x0
     1324990:	48 81 c7 20 01 00 00 	add    rdi,0x120
     1324997:	e9 0c 41 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     132499c:	c3                   	ret
     132499d:	cc                   	int3
     132499e:	53                   	push   rbx
     132499f:	48 89 fb             	mov    rbx,rdi
     13249a2:	48 8d 05 67 0e 54 00 	lea    rax,[rip+0x540e67]        # 1865810 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21ef8>
     13249a9:	48 89 07             	mov    QWORD PTR [rdi],rax
     13249ac:	48 81 c7 20 01 00 00 	add    rdi,0x120
     13249b3:	e8 ae 54 4b 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     13249b8:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
     13249bf:	e8 a2 54 4b 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     13249c4:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
     13249cb:	e8 34 d5 98 ff       	call   cb1f04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feea4>
     13249d0:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     13249d4:	e8 cb e7 39 00       	call   16c31a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77310>
     13249d9:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     13249dd:	5b                   	pop    rbx
     13249de:	e9 a3 9a 77 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x132521e: lea    rax,[rip+0x540933]        # 1865b58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22240>
     13251fa:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     1325201:	00 
     1325202:	48 8d 84 24 bf 00 00 	lea    rax,[rsp+0xbf]
     1325209:	00 
     132520a:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1325211:	00 
     1325212:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0x1
     1325219:	00 01 00 00 00 
     132521e:	48 8d 05 33 09 54 00 	lea    rax,[rip+0x540933]        # 1865b58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22240>
     1325225:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1325229:	4c 8d 6d 08          	lea    r13,[rbp+0x8]
     132522d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     1325232:	4c 89 ef             	mov    rdi,r13
     1325235:	e8 72 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     132523a:	48 89 ef             	mov    rdi,rbp
     132523d:	48 83 c7 18          	add    rdi,0x18
     1325241:	4c 89 f6             	mov    rsi,r14
     1325244:	e8 63 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     1325249:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     132524e:	0f 10 40 f0          	movups xmm0,XMMWORD PTR [rax-0x10]
     1325252:	0f 11 45 28          	movups XMMWORD PTR [rbp+0x28],xmm0

### 0x132624a: lea    rcx,[rip+0x53f907]        # 1865b58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22240>
     1326229:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1326230:	00 00 
     1326232:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     1326237:	75 08                	jne    1326241 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b7c5>
     1326239:	48 89 df             	mov    rdi,rbx
     132623c:	e8 8f 9a 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1326241:	e8 6a 98 4c 00       	call   17efab0 <__stack_chk_fail@plt>
     1326246:	48 8d 47 08          	lea    rax,[rdi+0x8]
     132624a:	48 8d 0d 07 f9 53 00 	lea    rcx,[rip+0x53f907]        # 1865b58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22240>
     1326251:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     1326254:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
     1326258:	48 89 c6             	mov    rsi,rax
     132625b:	e9 9a 00 00 00       	jmp    13262fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b87e>
     1326260:	48 83 c7 08          	add    rdi,0x8
     1326264:	e9 c7 f6 ff ff       	jmp    1325930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16aeb4>
     1326269:	cc                   	int3
     132626a:	53                   	push   rbx
     132626b:	48 89 fb             	mov    rbx,rdi
     132626e:	48 83 c7 08          	add    rdi,0x8
     1326272:	e8 b9 f6 ff ff       	call   1325930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16aeb4>
     1326277:	48 89 df             	mov    rdi,rbx

### 0x132633e: lea    rax,[rip+0x53f6cb]        # 1865a10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x220f8>
     1326326:	c3                   	ret
     1326327:	49 89 c6             	mov    r14,rax
     132632a:	48 89 df             	mov    rdi,rbx
     132632d:	e8 f4 a7 77 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1326332:	4c 89 f7             	mov    rdi,r14
     1326335:	e8 96 99 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     132633a:	53                   	push   rbx
     132633b:	48 89 fb             	mov    rbx,rdi
     132633e:	48 8d 05 cb f6 53 00 	lea    rax,[rip+0x53f6cb]        # 1865a10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x220f8>
     1326345:	48 89 07             	mov    QWORD PTR [rdi],rax
     1326348:	48 81 c7 78 01 00 00 	add    rdi,0x178
     132634f:	e8 28 8e 84 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     1326354:	48 8d bb 10 01 00 00 	lea    rdi,[rbx+0x110]
     132635b:	e8 06 3b 4b 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1326360:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
     1326367:	e8 68 38 4b 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     132636c:	48 8d bb d0 00 00 00 	lea    rdi,[rbx+0xd0]
     1326373:	e8 68 1c 7c ff       	call   ae7fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34f80>
     1326378:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
     132637f:	e8 d2 11 79 ff       	call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
     1326384:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]

### 0x132fb4a: lea    rax,[rip+0x5360af]        # 1865c00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x222e8>
     132fb2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     132fb33:	00 00 
     132fb35:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     132fb3a:	75 08                	jne    132fb44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1750c8>
     132fb3c:	48 89 df             	mov    rdi,rbx
     132fb3f:	e8 8c 01 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     132fb44:	e8 67 ff 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     132fb49:	cc                   	int3
     132fb4a:	48 8d 05 af 60 53 00 	lea    rax,[rip+0x5360af]        # 1865c00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x222e8>
     132fb51:	48 89 07             	mov    QWORD PTR [rdi],rax
     132fb54:	e9 b7 e4 4b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     132fb59:	cc                   	int3
     132fb5a:	53                   	push   rbx
     132fb5b:	48 89 fb             	mov    rbx,rdi
     132fb5e:	e8 e7 ff ff ff       	call   132fb4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1750ce>
     132fb63:	48 89 df             	mov    rdi,rbx
     132fb66:	5b                   	pop    rbx
     132fb67:	e9 b4 e3 4b 00       	jmp    17edf20 <_ZdlPv@plt>
     132fb6c:	48 83 c7 18          	add    rdi,0x18
     132fb70:	e9 ff 93 ff ff       	jmp    1328f74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e4f8>
     132fb75:	cc                   	int3

### 0x1331d8b: lea    rax,[rip+0x53498e]        # 1866720 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22e08>
     1331d6f:	00 
     1331d70:	48 85 c0             	test   rax,rax
     1331d73:	74 05                	je     1331d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1772fe>
     1331d75:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1331d7a:	48 83 a4 24 f8 00 00 	and    QWORD PTR [rsp+0xf8],0x0
     1331d81:	00 00 
     1331d83:	4c 89 b4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r14
     1331d8a:	00 
     1331d8b:	48 8d 05 8e 49 53 00 	lea    rax,[rip+0x53498e]        # 1866720 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22e08>
     1331d92:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1331d96:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
     1331d9a:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     1331da1:	00 
     1331da2:	e8 a9 5b 00 00       	call   1337950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ced4>
     1331da7:	48 8d 05 8a 47 53 00 	lea    rax,[rip+0x53478a]        # 1866538 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22c20>
     1331dae:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1331db2:	48 8d 05 2f 48 53 00 	lea    rax,[rip+0x53482f]        # 18665e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22cd0>
     1331db9:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     1331dbd:	48 8d 05 5c 48 53 00 	lea    rax,[rip+0x53485c]        # 1866620 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d08>
     1331dc4:	48 89 85 18 01 00 00 	mov    QWORD PTR [rbp+0x118],rax
     1331dcb:	48 89 9d 20 01 00 00 	mov    QWORD PTR [rbp+0x120],rbx

### 0x1331da7: lea    rax,[rip+0x53478a]        # 1866538 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22c20>
     1331d83:	4c 89 b4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r14
     1331d8a:	00 
     1331d8b:	48 8d 05 8e 49 53 00 	lea    rax,[rip+0x53498e]        # 1866720 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22e08>
     1331d92:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1331d96:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
     1331d9a:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     1331da1:	00 
     1331da2:	e8 a9 5b 00 00       	call   1337950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ced4>
     1331da7:	48 8d 05 8a 47 53 00 	lea    rax,[rip+0x53478a]        # 1866538 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22c20>
     1331dae:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1331db2:	48 8d 05 2f 48 53 00 	lea    rax,[rip+0x53482f]        # 18665e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22cd0>
     1331db9:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     1331dbd:	48 8d 05 5c 48 53 00 	lea    rax,[rip+0x53485c]        # 1866620 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d08>
     1331dc4:	48 89 85 18 01 00 00 	mov    QWORD PTR [rbp+0x118],rax
     1331dcb:	48 89 9d 20 01 00 00 	mov    QWORD PTR [rbp+0x120],rbx
     1331dd2:	48 8b 84 24 d8 00 00 	mov    rax,QWORD PTR [rsp+0xd8]
     1331dd9:	00 
     1331dda:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
     1331de1:	00 
     1331de2:	0f 11 85 28 01 00 00 	movups XMMWORD PTR [rbp+0x128],xmm0
     1331de9:	48 85 c0             	test   rax,rax

### 0x1331db2: lea    rax,[rip+0x53482f]        # 18665e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22cd0>
     1331d8b:	48 8d 05 8e 49 53 00 	lea    rax,[rip+0x53498e]        # 1866720 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22e08>
     1331d92:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1331d96:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
     1331d9a:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     1331da1:	00 
     1331da2:	e8 a9 5b 00 00       	call   1337950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ced4>
     1331da7:	48 8d 05 8a 47 53 00 	lea    rax,[rip+0x53478a]        # 1866538 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22c20>
     1331dae:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1331db2:	48 8d 05 2f 48 53 00 	lea    rax,[rip+0x53482f]        # 18665e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22cd0>
     1331db9:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     1331dbd:	48 8d 05 5c 48 53 00 	lea    rax,[rip+0x53485c]        # 1866620 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d08>
     1331dc4:	48 89 85 18 01 00 00 	mov    QWORD PTR [rbp+0x118],rax
     1331dcb:	48 89 9d 20 01 00 00 	mov    QWORD PTR [rbp+0x120],rbx
     1331dd2:	48 8b 84 24 d8 00 00 	mov    rax,QWORD PTR [rsp+0xd8]
     1331dd9:	00 
     1331dda:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
     1331de1:	00 
     1331de2:	0f 11 85 28 01 00 00 	movups XMMWORD PTR [rbp+0x128],xmm0
     1331de9:	48 85 c0             	test   rax,rax
     1331dec:	74 05                	je     1331df3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177377>
     1331dee:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### 0x1331dbd: lea    rax,[rip+0x53485c]        # 1866620 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d08>
     1331d96:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
     1331d9a:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     1331da1:	00 
     1331da2:	e8 a9 5b 00 00       	call   1337950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ced4>
     1331da7:	48 8d 05 8a 47 53 00 	lea    rax,[rip+0x53478a]        # 1866538 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22c20>
     1331dae:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1331db2:	48 8d 05 2f 48 53 00 	lea    rax,[rip+0x53482f]        # 18665e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22cd0>
     1331db9:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     1331dbd:	48 8d 05 5c 48 53 00 	lea    rax,[rip+0x53485c]        # 1866620 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d08>
     1331dc4:	48 89 85 18 01 00 00 	mov    QWORD PTR [rbp+0x118],rax
     1331dcb:	48 89 9d 20 01 00 00 	mov    QWORD PTR [rbp+0x120],rbx
     1331dd2:	48 8b 84 24 d8 00 00 	mov    rax,QWORD PTR [rsp+0xd8]
     1331dd9:	00 
     1331dda:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
     1331de1:	00 
     1331de2:	0f 11 85 28 01 00 00 	movups XMMWORD PTR [rbp+0x128],xmm0
     1331de9:	48 85 c0             	test   rax,rax
     1331dec:	74 05                	je     1331df3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177377>
     1331dee:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1331df3:	0f 28 84 24 20 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x120]
     1331dfa:	00 

### 0x13320b4: lea    rax,[rip+0x5346cd]        # 1866788 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22e70>
     1332092:	00 
     1332093:	e8 92 36 83 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     1332098:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
     133209d:	66 0f ef c0          	pxor   xmm0,xmm0
     13320a1:	f3 0f 7f 85 d0 02 00 	movdqu XMMWORD PTR [rbp+0x2d0],xmm0
     13320a8:	00 
     13320a9:	48 8b bd 98 02 00 00 	mov    rdi,QWORD PTR [rbp+0x298]
     13320b0:	4c 8d 7d 10          	lea    r15,[rbp+0x10]
     13320b4:	48 8d 05 cd 46 53 00 	lea    rax,[rip+0x5346cd]        # 1866788 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22e70>
     13320bb:	48 8d 94 24 00 03 00 	lea    rdx,[rsp+0x300]
     13320c2:	00 
     13320c3:	48 89 02             	mov    QWORD PTR [rdx],rax
     13320c6:	48 89 6a 08          	mov    QWORD PTR [rdx+0x8],rbp
     13320ca:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
     13320ce:	4c 89 fe             	mov    rsi,r15
     13320d1:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12
     13320d6:	e8 59 46 ff ff       	call   1326734 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16bcb8>
     13320db:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     13320e2:	00 
     13320e3:	e8 82 7e 74 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13320e8:	4c 8b b5 38 01 00 00 	mov    r14,QWORD PTR [rbp+0x138]

### 0x13339c3: lea    rax,[rip+0x532516]        # 1865ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x225c8>
     133399d:	48 8b bb c8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3c8]
     13339a4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13339a7:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
     13339ae:	00 
     13339af:	4c 89 fa             	mov    rdx,r15
     13339b2:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     13339b8:	48 8b bb b8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5b8]
     13339bf:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
     13339c3:	48 8d 05 16 25 53 00 	lea    rax,[rip+0x532516]        # 1865ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x225c8>
     13339ca:	48 8d 94 24 c0 04 00 	lea    rdx,[rsp+0x4c0]
     13339d1:	00 
     13339d2:	48 89 02             	mov    QWORD PTR [rdx],rax
     13339d5:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
     13339d9:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
     13339dd:	4c 89 fe             	mov    rsi,r15
     13339e0:	e8 4f 2d ff ff       	call   1326734 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16bcb8>
     13339e5:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
     13339ec:	00 
     13339ed:	e8 78 65 74 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13339f2:	48 8b ab 68 03 00 00 	mov    rbp,QWORD PTR [rbx+0x368]
     13339f9:	48 8b 83 70 03 00 00 	mov    rax,QWORD PTR [rbx+0x370]

### 0x1333a1a: lea    rcx,[rip+0x532507]        # 1865f28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22610>
     1333a00:	48 29 e8             	sub    rax,rbp
     1333a03:	48 99                	cqo
     1333a05:	6a 38                	push   0x38
     1333a07:	59                   	pop    rcx
     1333a08:	48 f7 f9             	idiv   rcx
     1333a0b:	49 89 c6             	mov    r14,rax
     1333a0e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1333a13:	0f b6 80 d0 00 00 00 	movzx  eax,BYTE PTR [rax+0xd0]
     1333a1a:	48 8d 0d 07 25 53 00 	lea    rcx,[rip+0x532507]        # 1865f28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22610>
     1333a21:	48 89 8c 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rcx
     1333a28:	00 
     1333a29:	48 89 9c 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rbx
     1333a30:	00 
     1333a31:	4c 89 a4 24 10 05 00 	mov    QWORD PTR [rsp+0x510],r12
     1333a38:	00 
     1333a39:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     1333a40:	00 
     1333a41:	4c 89 fe             	mov    rsi,r15
     1333a44:	31 d2                	xor    edx,edx
     1333a46:	31 c9                	xor    ecx,ecx
     1333a48:	49 89 e8             	mov    r8,rbp

### 0x1336178: lea    rax,[rip+0x52fb51]        # 1865cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x223b8>
     1336167:	5b                   	pop    rbx
     1336168:	41 5e                	pop    r14
     133616a:	c3                   	ret
     133616b:	48 89 c7             	mov    rdi,rax
     133616e:	e8 32 39 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1336173:	cc                   	int3
     1336174:	53                   	push   rbx
     1336175:	48 89 fb             	mov    rbx,rdi
     1336178:	48 8d 05 51 fb 52 00 	lea    rax,[rip+0x52fb51]        # 1865cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x223b8>
     133617f:	48 89 07             	mov    QWORD PTR [rdi],rax
     1336182:	48 83 c7 20          	add    rdi,0x20
     1336186:	e8 d5 f6 ff ff       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     133618b:	48 89 df             	mov    rdi,rbx
     133618e:	5b                   	pop    rbx
     133618f:	e9 7c 7e 4b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     1336194:	53                   	push   rbx
     1336195:	48 89 fb             	mov    rbx,rdi
     1336198:	e8 d7 ff ff ff       	call   1336174 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b6f8>
     133619d:	48 89 df             	mov    rdi,rbx
     13361a0:	5b                   	pop    rbx
     13361a1:	e9 7a 7d 4b 00       	jmp    17edf20 <_ZdlPv@plt>

### 0x13361d3: lea    rax,[rip+0x52face]        # 1865ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22390>
     13361be:	e9 9d f6 ff ff       	jmp    1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     13361c3:	48 89 c7             	mov    rdi,rax
     13361c6:	e8 da 38 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     13361cb:	cc                   	int3
     13361cc:	41 56                	push   r14
     13361ce:	53                   	push   rbx
     13361cf:	50                   	push   rax
     13361d0:	48 89 fb             	mov    rbx,rdi
     13361d3:	48 8d 05 ce fa 52 00 	lea    rax,[rip+0x52face]        # 1865ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22390>
     13361da:	48 89 07             	mov    QWORD PTR [rdi],rax
     13361dd:	4c 8b b7 d8 00 00 00 	mov    r14,QWORD PTR [rdi+0xd8]
     13361e4:	48 83 a7 d8 00 00 00 	and    QWORD PTR [rdi+0xd8],0x0
     13361eb:	00 
     13361ec:	4d 85 f6             	test   r14,r14
     13361ef:	74 2e                	je     133621f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b7a3>
     13361f1:	49 8d be 80 00 00 00 	lea    rdi,[r14+0x80]
     13361f8:	e8 7f 8f 83 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     13361fd:	49 8d 7e 58          	lea    rdi,[r14+0x58]
     1336201:	e8 22 e2 d3 ff       	call   1074428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23b83e>
     1336206:	49 8d 7e 30          	lea    rdi,[r14+0x30]
     133620a:	e8 63 e2 d3 ff       	call   1074472 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23b888>

### 0x13378fc: lea    rax,[rip+0x52e405]        # 1865d08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x223f0>
     13378ec:	5b                   	pop    rbx
     13378ed:	41 5e                	pop    r14
     13378ef:	41 5f                	pop    r15
     13378f1:	c3                   	ret
     13378f2:	e8 b9 81 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     13378f7:	cc                   	int3
     13378f8:	53                   	push   rbx
     13378f9:	48 89 fb             	mov    rbx,rdi
     13378fc:	48 8d 05 05 e4 52 00 	lea    rax,[rip+0x52e405]        # 1865d08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x223f0>
     1337903:	48 89 07             	mov    QWORD PTR [rdi],rax
     1337906:	48 83 c7 30          	add    rdi,0x30
     133790a:	e8 7f 5c f7 ff       	call   12ad58e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2b12>
     133790f:	48 89 df             	mov    rdi,rbx
     1337912:	5b                   	pop    rbx
     1337913:	e9 f8 66 4b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     1337918:	53                   	push   rbx
     1337919:	48 89 fb             	mov    rbx,rdi
     133791c:	e8 d7 ff ff ff       	call   13378f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ce7c>
     1337921:	48 89 df             	mov    rdi,rbx
     1337924:	5b                   	pop    rbx
     1337925:	e9 f6 65 4b 00       	jmp    17edf20 <_ZdlPv@plt>

### 0x1337950: lea    rax,[rip+0x52e551]        # 1865ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22590>
     1337936:	48 89 df             	mov    rdi,rbx
     1337939:	e8 bc f5 ff ff       	call   1336efa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c47e>
     133793e:	48 89 df             	mov    rdi,rbx
     1337941:	5b                   	pop    rbx
     1337942:	e9 47 5c f7 ff       	jmp    12ad58e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2b12>
     1337947:	48 89 c7             	mov    rdi,rax
     133794a:	e8 56 21 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     133794f:	cc                   	int3
     1337950:	48 8d 05 51 e5 52 00 	lea    rax,[rip+0x52e551]        # 1865ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22590>
     1337957:	48 89 07             	mov    QWORD PTR [rdi],rax
     133795a:	48 83 67 60 00       	and    QWORD PTR [rdi+0x60],0x0
     133795f:	48 83 67 70 00       	and    QWORD PTR [rdi+0x70],0x0
     1337964:	48 83 a7 80 00 00 00 	and    QWORD PTR [rdi+0x80],0x0
     133796b:	00 
     133796c:	0f 57 c0             	xorps  xmm0,xmm0
     133796f:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     1337973:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     1337977:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
     133797b:	0f 11 47 38          	movups XMMWORD PTR [rdi+0x38],xmm0
     133797f:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
     1337983:	0f 11 87 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm0

### 0x1338ac2: lea    rax,[rip+0x52e47f]        # 1866f48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23630>
     1338aac:	5b                   	pop    rbx
     1338aad:	e9 64 36 ff ff       	jmp    132c116 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17169a>
     1338ab2:	80 7f 20 00          	cmp    BYTE PTR [rdi+0x20],0x0
     1338ab6:	0f 85 c8 36 ff ff    	jne    132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
     1338abc:	c3                   	ret
     1338abd:	cc                   	int3
     1338abe:	53                   	push   rbx
     1338abf:	48 89 fb             	mov    rbx,rdi
     1338ac2:	48 8d 05 7f e4 52 00 	lea    rax,[rip+0x52e47f]        # 1866f48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23630>
     1338ac9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1338acc:	48 83 c7 28          	add    rdi,0x28
     1338ad0:	e8 91 13 4a 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1338ad5:	48 83 c3 18          	add    rbx,0x18
     1338ad9:	48 89 df             	mov    rdi,rbx
     1338adc:	5b                   	pop    rbx
     1338add:	e9 f2 10 4a 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1338ae2:	41 56                	push   r14
     1338ae4:	53                   	push   rbx
     1338ae5:	50                   	push   rax
     1338ae6:	48 89 fb             	mov    rbx,rdi
     1338ae9:	48 8d 05 b8 d3 52 00 	lea    rax,[rip+0x52d3b8]        # 1865ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22590>

### 0x1338ae9: lea    rax,[rip+0x52d3b8]        # 1865ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22590>
     1338ad5:	48 83 c3 18          	add    rbx,0x18
     1338ad9:	48 89 df             	mov    rdi,rbx
     1338adc:	5b                   	pop    rbx
     1338add:	e9 f2 10 4a 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1338ae2:	41 56                	push   r14
     1338ae4:	53                   	push   rbx
     1338ae5:	50                   	push   rax
     1338ae6:	48 89 fb             	mov    rbx,rdi
     1338ae9:	48 8d 05 b8 d3 52 00 	lea    rax,[rip+0x52d3b8]        # 1865ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22590>
     1338af0:	48 89 07             	mov    QWORD PTR [rdi],rax
     1338af3:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
     1338afa:	e8 67 13 4a 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1338aff:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
     1338b06:	e8 3b 00 00 00       	call   1338b46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e0ca>
     1338b0b:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
     1338b0f:	e8 70 36 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
     1338b14:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     1338b18:	e8 f9 35 ff ff       	call   132c116 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17169a>
     1338b1d:	4c 8d 73 08          	lea    r14,[rbx+0x8]
     1338b21:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     1338b25:	e8 ac 74 8e ff       	call   c1ffd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16cf76>

### 0x13391d7: lea    rdx,[rip+0x52d702]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
     13391b9:	48 89 94 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdx
     13391c0:	00 
     13391c1:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
     13391c8:	00 
     13391c9:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     13391d0:	00 
     13391d1:	49 6b cf 18          	imul   rcx,r15,0x18
     13391d5:	31 ff                	xor    edi,edi
     13391d7:	48 8d 15 02 d7 52 00 	lea    rdx,[rip+0x52d702]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
     13391de:	48 89 fe             	mov    rsi,rdi
     13391e1:	48 89 14 38          	mov    QWORD PTR [rax+rdi*1],rdx
     13391e5:	49 8b 7c 3e 08       	mov    rdi,QWORD PTR [r14+rdi*1+0x8]
     13391ea:	48 89 7c 30 08       	mov    QWORD PTR [rax+rsi*1+0x8],rdi
     13391ef:	49 8b 7c 36 10       	mov    rdi,QWORD PTR [r14+rsi*1+0x10]
     13391f4:	48 89 7c 30 10       	mov    QWORD PTR [rax+rsi*1+0x10],rdi
     13391f9:	48 85 ff             	test   rdi,rdi
     13391fc:	74 05                	je     1339203 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e787>
     13391fe:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
     1339203:	48 8d 7e 18          	lea    rdi,[rsi+0x18]
     1339207:	48 39 f9             	cmp    rcx,rdi
     133920a:	75 d2                	jne    13391de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e762>

### 0x13392c4: lea    rax,[rip+0x52cca5]        # 1865f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22658>
     13392a0:	41 c7 47 20 00 00 80 	mov    DWORD PTR [r15+0x20],0x3f800000
     13392a7:	3f 
     13392a8:	48 8d bb 70 05 00 00 	lea    rdi,[rbx+0x570]
     13392af:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     13392b6:	00 
     13392b7:	e8 52 4f ee ff       	call   121e20e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63792>
     13392bc:	4c 89 ff             	mov    rdi,r15
     13392bf:	e8 a2 93 7a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     13392c4:	48 8d 05 a5 cc 52 00 	lea    rax,[rip+0x52cca5]        # 1865f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22658>
     13392cb:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
     13392d2:	00 
     13392d3:	48 89 01             	mov    QWORD PTR [rcx],rax
     13392d6:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
     13392da:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     13392de:	48 8b b3 48 04 00 00 	mov    rsi,QWORD PTR [rbx+0x448]
     13392e5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     13392e8:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
     13392ef:	00 
     13392f0:	4c 89 ff             	mov    rdi,r15
     13392f3:	ff 50 18             	call   QWORD PTR [rax+0x18]
     13392f6:	41 8b 07             	mov    eax,DWORD PTR [r15]

### 0x133a9b4: lea    rcx,[rip+0x52b4ad]        # 1865e68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22550>
     133a9a0:	41 56                	push   r14
     133a9a2:	53                   	push   rbx
     133a9a3:	48 89 d3             	mov    rbx,rdx
     133a9a6:	49 89 f6             	mov    r14,rsi
     133a9a9:	49 89 ff             	mov    r15,rdi
     133a9ac:	6a 20                	push   0x20
     133a9ae:	5f                   	pop    rdi
     133a9af:	e8 4c 35 4b 00       	call   17edf00 <_Znwm@plt>
     133a9b4:	48 8d 0d ad b4 52 00 	lea    rcx,[rip+0x52b4ad]        # 1865e68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22550>
     133a9bb:	48 89 08             	mov    QWORD PTR [rax],rcx
     133a9be:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     133a9c2:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
     133a9c6:	83 60 18 00          	and    DWORD PTR [rax+0x18],0x0
     133a9ca:	49 89 07             	mov    QWORD PTR [r15],rax
     133a9cd:	5b                   	pop    rbx
     133a9ce:	41 5e                	pop    r14
     133a9d0:	41 5f                	pop    r15
     133a9d2:	c3                   	ret
     133a9d3:	cc                   	int3
     133a9d4:	ff 47 18             	inc    DWORD PTR [rdi+0x18]
     133a9d7:	c3                   	ret

### 0x133f243: lea    rax,[rip+0x526e86]        # 18660d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x227b8>
     133f227:	4c 89 f7             	mov    rdi,r14
     133f22a:	e8 7d 9f 83 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     133f22f:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
     133f236:	00 00 
     133f238:	6a 20                	push   0x20
     133f23a:	5f                   	pop    rdi
     133f23b:	e8 c0 ec 4a 00       	call   17edf00 <_Znwm@plt>
     133f240:	48 89 c5             	mov    rbp,rax
     133f243:	48 8d 05 86 6e 52 00 	lea    rax,[rip+0x526e86]        # 18660d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x227b8>
     133f24a:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     133f24e:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     133f253:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     133f257:	48 89 ef             	mov    rdi,rbp
     133f25a:	48 83 c7 10          	add    rdi,0x10
     133f25e:	4c 89 f6             	mov    rsi,r14
     133f261:	e8 52 8d 82 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     133f266:	4c 8d 8c 24 a0 00 00 	lea    r9,[rsp+0xa0]
     133f26d:	00 
     133f26e:	49 89 69 20          	mov    QWORD PTR [r9+0x20],rbp
     133f272:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     133f276:	8b 80 94 00 00 00    	mov    eax,DWORD PTR [rax+0x94]

