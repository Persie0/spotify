# Service184 helper de6c9a


/tmp/s184d/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000de6c20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3ca6>:
  de6c20:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
  de6c27:	00 
  de6c28:	e8 59 78 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  de6c2d:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
  de6c34:	00 
  de6c35:	e8 4c 78 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  de6c3a:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
  de6c41:	00 
  de6c42:	e8 49 72 a0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  de6c47:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  de6c4e:	00 
  de6c4f:	e8 5a 08 d1 ff       	call   af74ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4444e>
  de6c54:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de6c5b:	00 00 
  de6c5d:	48 3b 84 24 90 04 00 	cmp    rax,QWORD PTR [rsp+0x490]
  de6c64:	00 
  de6c65:	75 09                	jne    de6c70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3cf6>
  de6c67:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  de6c6b:	e8 60 90 c8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  de6c70:	e8 3b 8e a0 00       	call   17efab0 <__stack_chk_fail@plt>
  de6c75:	cc                   	int3
  de6c76:	53                   	push   rbx
  de6c77:	48 89 fb             	mov    rbx,rdi
  de6c7a:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  de6c7e:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  de6c82:	6a 20                	push   0x20
  de6c84:	5a                   	pop    rdx
  de6c85:	e8 54 b6 d7 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  de6c8a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  de6c8d:	48 8b b8 00 01 00 00 	mov    rdi,QWORD PTR [rax+0x100]
  de6c94:	5b                   	pop    rbx
  de6c95:	e9 00 00 00 00       	jmp    de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
  de6c9a:	48 85 ff             	test   rdi,rdi
  de6c9d:	74 04                	je     de6ca3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d29>
  de6c9f:	48 89 f8             	mov    rax,rdi
  de6ca2:	c3                   	ret
  de6ca3:	50                   	push   rax
  de6ca4:	e8 16 33 c9 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  de6ca9:	cc                   	int3
  de6caa:	50                   	push   rax
  de6cab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  de6cae:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  de6cb1:	48 83 c7 20          	add    rdi,0x20
  de6cb5:	e8 3e 01 00 00       	call   de6df8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3e7e>
  de6cba:	58                   	pop    rax
  de6cbb:	c3                   	ret
  de6cbc:	48 89 c7             	mov    rdi,rax
  de6cbf:	e8 e1 2d c9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  de6cc4:	53                   	push   rbx
  de6cc5:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  de6cc9:	48 85 c0             	test   rax,rax
  de6ccc:	74 11                	je     de6cdf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d65>
  de6cce:	48 89 fb             	mov    rbx,rdi
  de6cd1:	31 ff                	xor    edi,edi
  de6cd3:	48 89 de             	mov    rsi,rbx
  de6cd6:	31 d2                	xor    edx,edx
  de6cd8:	ff d0                	call   rax
  de6cda:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  de6cdf:	5b                   	pop    rbx
  de6ce0:	c3                   	ret
  de6ce1:	48 89 c7             	mov    rdi,rax
  de6ce4:	e8 bc 2d c9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  de6ce9:	cc                   	int3
  de6cea:	41 56                	push   r14
  de6cec:	53                   	push   rbx
  de6ced:	50                   	push   rax
  de6cee:	0f 57 c0             	xorps  xmm0,xmm0
  de6cf1:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
  de6cf5:	48 8d 05 cc 48 a9 00 	lea    rax,[rip+0xa948cc]        # 187b5c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37cb0>
  de6cfc:	48 89 07             	mov    QWORD PTR [rdi],rax
  de6cff:	48 8d 05 f2 8a 65 ff 	lea    rax,[rip+0xffffffffff658af2]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
  de6d06:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
  de6d0a:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
  de6d0e:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
  de6d12:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
  de6d16:	48 39 f7             	cmp    rdi,rsi
  de6d19:	74 4b                	je     de6d66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3dec>
  de6d1b:	48 89 f3             	mov    rbx,rsi
  de6d1e:	49 89 fe             	mov    r14,rdi
  de6d21:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
  de6d25:	a8 01                	test   al,0x1
  de6d27:	75 45                	jne    de6d6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3df4>
  de6d29:	48 85 c0             	test   rax,rax
  de6d2c:	74 0d                	je     de6d3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3dc1>
  de6d2e:	4c 89 f7             	mov    rdi,r14
  de6d31:	48 89 de             	mov    rsi,rbx
  de6d34:	e8 27 7d 96 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
  de6d39:	eb 2b                	jmp    de6d66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3dec>
  de6d3b:	0f 18 0d ce 74 b4 00 	prefetcht0 BYTE PTR [rip+0xb474ce]        # 192e210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x75620>
  de6d42:	48 8d 3d c7 74 b4 00 	lea    rdi,[rip+0xb474c7]        # 192e210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x75620>
  de6d49:	48 8b 05 c8 74 b4 00 	mov    rax,QWORD PTR [rip+0xb474c8]        # 192e218 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x75628>
  de6d50:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  de6d53:	e8 92 7e 96 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  de6d58:	48 89 d7             	mov    rdi,rdx
  de6d5b:	4c 89 f6             	mov    rsi,r14
  de6d5e:	48 89 da             	mov    rdx,rbx
  de6d61:	e8 34 34 95 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  de6d66:	48 83 c4 08          	add    rsp,0x8
  de6d6a:	5b                   	pop    rbx
  de6d6b:	41 5e                	pop    r14
  de6d6d:	c3                   	ret
  de6d6e:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
  de6d72:	48 8b 00             	mov    rax,QWORD PTR [rax]
  de6d75:	eb b2                	jmp    de6d29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3daf>
  de6d77:	48 89 c7             	mov    rdi,rax
  de6d7a:	e8 26 2d c9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  de6d7f:	cc                   	int3
  de6d80:	50                   	push   rax
  de6d81:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  de6d84:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  de6d87:	48 83 c7 20          	add    rdi,0x20
  de6d8b:	e8 68 00 00 00       	call   de6df8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3e7e>
  de6d90:	58                   	pop    rax
  de6d91:	c3                   	ret
  de6d92:	48 89 c7             	mov    rdi,rax
  de6d95:	e8 0b 2d c9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  de6d9a:	50                   	push   rax
  de6d9b:	48 89 f8             	mov    rax,rdi
  de6d9e:	48 8b 56 20          	mov    rdx,QWORD PTR [rsi+0x20]
  de6da2:	48 85 d2             	test   rdx,rdx
  de6da5:	74 0f                	je     de6db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3e3c>
  de6da7:	48 8d 4e 20          	lea    rcx,[rsi+0x20]
  de6dab:	48 39 f2             	cmp    rdx,rsi
  de6dae:	74 13                	je     de6dc3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3e49>
  de6db0:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
  de6db4:	eb 07                	jmp    de6dbd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3e43>
  de6db6:	48 83 c0 20          	add    rax,0x20
  de6dba:	48 89 c1             	mov    rcx,rax
  de6dbd:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  de6dc1:	eb 10                	jmp    de6dd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3e59>
  de6dc3:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
  de6dc7:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  de6dca:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  de6dcd:	48 89 c6             	mov    rsi,rax
  de6dd0:	ff 51 18             	call   QWORD PTR [rcx+0x18]
  de6dd3:	58                   	pop    rax
  de6dd4:	c3                   	ret
  de6dd5:	48 89 c7             	mov    rdi,rax
  de6dd8:	e8 c8 2c c9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  de6ddd:	cc                   	int3
  de6dde:	50                   	push   rax
  de6ddf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  de6de2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  de6de5:	48 83 c7 20          	add    rdi,0x20
  de6de9:	e8 0a 00 00 00       	call   de6df8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3e7e>
  de6dee:	58                   	pop    rax
  de6def:	c3                   	ret
  de6df0:	48 89 c7             	mov    rdi,rax
  de6df3:	e8 ad 2c c9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  de6df8:	41 57                	push   r15
  de6dfa:	41 56                	push   r14
  de6dfc:	53                   	push   rbx
  de6dfd:	48 83 ec 20          	sub    rsp,0x20
  de6e01:	48 89 f3             	mov    rbx,rsi
  de6e04:	49 89 fe             	mov    r14,rdi
  de6e07:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de6e0e:	00 00 
  de6e10:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  de6e15:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
  de6e19:	e8 7c 00 00 00       	call   de6e9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3f20>
  de6e1e:	49                   	rex.WB
  de6e1f:	89                   	.byte 0x89

## Callers
  de7354:	41 54                	push   r12
  de7356:	53                   	push   rbx
  de7357:	50                   	push   rax
  de7358:	49 89 ce             	mov    r14,rcx
  de735b:	49 89 d7             	mov    r15,rdx
  de735e:	48 89 fb             	mov    rbx,rdi
  de7361:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
  de7365:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
  de7369:	6a 20                	push   0x20
  de736b:	5a                   	pop    rdx
  de736c:	e8 6d af d7 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  de7371:	49 8b 06             	mov    rax,QWORD PTR [r14]
  de7374:	4c 8b b0 00 01 00 00 	mov    r14,QWORD PTR [rax+0x100]
  de737b:	4c 89 f7             	mov    rdi,r14
  de737e:	e8 17 f9 ff ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
  de7383:	4d 8b bf 38 01 00 00 	mov    r15,QWORD PTR [r15+0x138]
  de738a:	4d 8b a6 48 01 00 00 	mov    r12,QWORD PTR [r14+0x148]
  de7391:	6a 40                	push   0x40
  de7393:	5f                   	pop    rdi
  de7394:	e8 67 6b a0 00       	call   17edf00 <_Znwm@plt>
  de7399:	49 89 c6             	mov    r14,rax
  de739c:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  de73a0:	48 8d 05 41 9e a8 00 	lea    rax,[rip+0xa89e41]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
  de73a7:	49 89 06             	mov    QWORD PTR [r14],rax
  de73aa:	4d 89 66 10          	mov    QWORD PTR [r14+0x10],r12
  de73ae:	48 8d 05 af 50 c9 ff 	lea    rax,[rip+0xffffffffffc950af]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  de73b5:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  de73b9:	48 8d 05 44 00 00 00 	lea    rax,[rip+0x44]        # de7404 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb448a>
  de73c0:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
  de73c4:	0f 57 c0             	xorps  xmm0,xmm0
  de73c7:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
  de73cc:	4c 89 f7             	mov    rdi,r14
  de73cf:	4c 89 fe             	mov    rsi,r15
  de73d2:	e8 6d 78 ce ff       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
  de73d7:	4c 89 33             	mov    QWORD PTR [rbx],r14
  de73da:	48 89 d8             	mov    rax,rbx
  de73dd:	48 83 c4 08          	add    rsp,0x8
--
 11ee69b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 11ee6a0:	48 89 df             	mov    rdi,rbx
 11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
 11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 11ee6ad:	48 89 df             	mov    rdi,rbx
 11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
 11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
 11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
 11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
 11ee6e0:	48 89 df             	mov    rdi,rbx
 11ee6e3:	e8 2c 99 99 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
 11ee6e8:	49 89 c4             	mov    r12,rax
 11ee6eb:	48 89 df             	mov    rdi,rbx
 11ee6ee:	e8 43 86 ac ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
 11ee6f3:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
 11ee6fa:	00 
 11ee6fb:	48 89 df             	mov    rdi,rbx
 11ee6fe:	e8 c7 6a bf ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
 11ee703:	48 89 c5             	mov    rbp,rax
 11ee706:	48 89 df             	mov    rdi,rbx
 11ee709:	e8 c0 30 a2 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
 11ee70e:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
 11ee715:	00 
 11ee716:	48 89 df             	mov    rdi,rbx
 11ee719:	e8 10 76 eb ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
 11ee71e:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 11ee723:	48 89 df             	mov    rdi,rbx
 11ee726:	e8 fd 08 00 00       	call   11ef028 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345ac>
 11ee72b:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
 11ee732:	00 
 11ee733:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
--
 135c783:	48 83 ec 20          	sub    rsp,0x20
 135c787:	49 89 ce             	mov    r14,rcx
 135c78a:	49 89 d7             	mov    r15,rdx
 135c78d:	48 89 fb             	mov    rbx,rdi
 135c790:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135c797:	00 00 
 135c799:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 135c79e:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
 135c7a2:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
 135c7a6:	ba b8 00 00 00       	mov    edx,0xb8
 135c7ab:	e8 2e 5b 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
 135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]
 135c7ba:	4c 89 f7             	mov    rdi,r14
 135c7bd:	e8 d8 a4 a8 ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
 135c7c2:	49 8b 8f 90 00 00 00 	mov    rcx,QWORD PTR [r15+0x90]
 135c7c9:	49 8b b7 38 01 00 00 	mov    rsi,QWORD PTR [r15+0x138]
 135c7d0:	49 83 c6 20          	add    r14,0x20
 135c7d4:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
 135c7d9:	49 83 20 00          	and    QWORD PTR [r8],0x0
 135c7dd:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 135c7e2:	4c 89 f2             	mov    rdx,r14
 135c7e5:	e8 21 3e 96 ff       	call   cc060b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d5ab>
 135c7ea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 135c7ef:	48 89 03             	mov    QWORD PTR [rbx],rax
 135c7f2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 135c7f7:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
 135c7fd:	48 85 ff             	test   rdi,rdi
 135c800:	74 06                	je     135c808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1d8c>
 135c802:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135c805:	ff 50 08             	call   QWORD PTR [rax+0x8]
 135c808:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135c80f:	00 00 
 135c811:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 135c816:	75 3e                	jne    135c856 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1dda>
 135c818:	48 89 d8             	mov    rax,rbx
 135c81b:	48 83 c4 20          	add    rsp,0x20
