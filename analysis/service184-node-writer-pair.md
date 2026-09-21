# Service184 paired weak-node writer

## Exact paired writer 0x132fc9c / 0x132fcbb

/tmp/s184pair/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000132fb00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175084>:
 132fb00:	4b 00 64 48 8b       	rex.WXB add BYTE PTR [r8+r9*2-0x75],spl
 132fb05:	04 25                	add    al,0x25
 132fb07:	28 00                	sub    BYTE PTR [rax],al
 132fb09:	00 00                	add    BYTE PTR [rax],al
 132fb0b:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 132fb10:	75 32                	jne    132fb44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1750c8>
 132fb12:	89 d8                	mov    eax,ebx
 132fb14:	48 83 c4 38          	add    rsp,0x38
 132fb18:	5b                   	pop    rbx
 132fb19:	41 5e                	pop    r14
 132fb1b:	41 5f                	pop    r15
 132fb1d:	5d                   	pop    rbp
 132fb1e:	c3                   	ret
 132fb1f:	48 89 c3             	mov    rbx,rax
 132fb22:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 132fb27:	e8 64 e3 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
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
 132fb76:	55                   	push   rbp
 132fb77:	41 56                	push   r14
 132fb79:	53                   	push   rbx
 132fb7a:	48 83 ec 20          	sub    rsp,0x20
 132fb7e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fb85:	00 00 
 132fb87:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 132fb8c:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 132fb8f:	8b 2b                	mov    ebp,DWORD PTR [rbx]
 132fb91:	48 83 c3 08          	add    rbx,0x8
 132fb95:	49 89 e6             	mov    r14,rsp
 132fb98:	4c 89 f7             	mov    rdi,r14
 132fb9b:	e8 bc fe ff ff       	call   132fa5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174fe0>
 132fba0:	4c 89 f7             	mov    rdi,r14
 132fba3:	89 ee                	mov    esi,ebp
 132fba5:	31 d2                	xor    edx,edx
 132fba7:	48 89 d9             	mov    rcx,rbx
 132fbaa:	e8 a9 97 2a 00       	call   15d9358 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e8dc>
 132fbaf:	89 c3                	mov    ebx,eax
 132fbb1:	48 89 e7             	mov    rdi,rsp
 132fbb4:	e8 d7 e2 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132fbb9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fbc0:	00 00 
 132fbc2:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 132fbc7:	75 2e                	jne    132fbf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17517b>
 132fbc9:	89 d8                	mov    eax,ebx
 132fbcb:	48 83 c4 20          	add    rsp,0x20
 132fbcf:	5b                   	pop    rbx
 132fbd0:	41 5e                	pop    r14
 132fbd2:	5d                   	pop    rbp
 132fbd3:	c3                   	ret
 132fbd4:	48 89 c3             	mov    rbx,rax
 132fbd7:	48 89 e7             	mov    rdi,rsp
 132fbda:	e8 b1 e2 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132fbdf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fbe6:	00 00 
 132fbe8:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 132fbed:	75 08                	jne    132fbf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17517b>
 132fbef:	48 89 df             	mov    rdi,rbx
 132fbf2:	e8 d9 00 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 132fbf7:	e8 b4 fe 4b 00       	call   17efab0 <__stack_chk_fail@plt>
 132fbfc:	41 57                	push   r15
 132fbfe:	41 56                	push   r14
 132fc00:	41 55                	push   r13
 132fc02:	41 54                	push   r12
 132fc04:	53                   	push   rbx
 132fc05:	49 89 ce             	mov    r14,rcx
 132fc08:	49 89 d7             	mov    r15,rdx
 132fc0b:	48 89 fb             	mov    rbx,rdi
 132fc0e:	e8 21 a8 39 00       	call   16ca434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5a0>
 132fc13:	0f 57 c0             	xorps  xmm0,xmm0
 132fc16:	0f 29 43 60          	movaps XMMWORD PTR [rbx+0x60],xmm0
 132fc1a:	48 83 63 70 00       	and    QWORD PTR [rbx+0x70],0x0
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
 132fd2d:	41 8a 87 90 00 00 00 	mov    al,BYTE PTR [r15+0x90]
 132fd34:	88 83 f0 00 00 00    	mov    BYTE PTR [rbx+0xf0],al
 132fd3a:	31 c0                	xor    eax,eax
 132fd3c:	88 83 00 01 00 00    	mov    BYTE PTR [rbx+0x100],al
 132fd42:	88 83 50 01 00 00    	mov    BYTE PTR [rbx+0x150],al
 132fd48:	41 38 87 f0 00 00 00 	cmp    BYTE PTR [r15+0xf0],al
 132fd4f:	74 13                	je     132fd64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1752e8>
 132fd51:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
 132fd58:	49 8d b7 a0 00 00 00 	lea    rsi,[r15+0xa0]
 132fd5f:	e8 d2 ba f7 ff       	call   12ab836 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf0dba>
 132fd64:	41 0f b7 87 00 01 00 	movzx  eax,WORD PTR [r15+0x100]
 132fd6b:	00 
 132fd6c:	66 89 83 60 01 00 00 	mov    WORD PTR [rbx+0x160],ax
 132fd73:	4c 8d bb 70 01 00 00 	lea    r15,[rbx+0x170]
 132fd7a:	4c 89 ff             	mov    rdi,r15
 132fd7d:	4c 89 f6             	mov    rsi,r14
 132fd80:	e8 59 21 98 ff       	call   cb1ede <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fee7e>
 132fd85:	80 bb 50 01 00 00 00 	cmp    BYTE PTR [rbx+0x150],0x0
 132fd8c:	74 11                	je     132fd9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175323>
 132fd8e:	4c 8d 73 60          	lea    r14,[rbx+0x60]
 132fd92:	e8 8b da 47 00       	call   17ad822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16198e>
 132fd97:	48 89 c1             	mov    rcx,rax
 132fd9a:	41 b0 01             	mov    r8b,0x1
 132fd9d:	eb 05                	jmp    132fda4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175328>
 132fd9f:	45 31 c0             	xor    r8d,r8d
 132fda2:	31 c9                	xor    ecx,ecx
 132fda4:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
 132fda8:	48 8b b3 80 00 00 00 	mov    rsi,QWORD PTR [rbx+0x80]
 132fdaf:	48 89 f0             	mov    rax,rsi
 132fdb2:	48 29 f8             	sub    rax,rdi
 132fdb5:	6a 38                	push   0x38
 132fdb7:	41 59                	pop    r9
 132fdb9:	48 99                	cqo
 132fdbb:	49 f7 f9             	idiv   r9
 132fdbe:	48 0f bd c0          	bsr    rax,rax
 132fdc2:	83 f0 3f             	xor    eax,0x3f
 132fdc5:	01 c0                	add    eax,eax
 132fdc7:	48 83 f0 7e          	xor    rax,0x7e
 132fdcb:	31 d2                	xor    edx,edx
 132fdcd:	48 39 fe             	cmp    rsi,rdi
 132fdd0:	48 89 8b d8 01 00 00 	mov    QWORD PTR [rbx+0x1d8],rcx
 132fdd7:	44 88 83 e0 01 00 00 	mov    BYTE PTR [rbx+0x1e0],r8b
 132fdde:	48 0f 45 d0          	cmovne rdx,rax
 132fde2:	6a 01                	push   0x1
 132fde4:	59                   	pop    rcx
 132fde5:	e8 92 02 00 00       	call   133007c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175600>
 132fdea:	4c 8b 73 78          	mov    r14,QWORD PTR [rbx+0x78]
 132fdee:	4c 8b ab 80 00 00 00 	mov    r13,QWORD PTR [rbx+0x80]
 132fdf5:	4d 39 ee             	cmp    r14,r13
 132fdf8:	74 26                	je     132fe20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1753a4>
 132fdfa:	4d 8d 7e 38          	lea    r15,[r14+0x38]
 132fdfe:	4d 39 ef             	cmp    r15,r13
 132fe01:	0f 84 8e 00 00 00    	je     132fe95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175419>
 132fe07:	4c 89 f7             	mov    rdi,r14
 132fe0a:	4c 89 fe             	mov    rsi,r15
 132fe0d:	e8 da 9f 2a 00       	call   15d9dec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f370>
 132fe12:	4d 89 fe             	mov    r14,r15
 132fe15:	84 c0                	test   al,al
 132fe17:	74 e1                	je     132fdfa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17537e>
 132fe19:	49 83 c7 c8          	add    r15,0xffffffffffffffc8
 132fe1d:	4d 89 fe             	mov    r14,r15
 132fe20:	4d 39 ee             	cmp    r14,r13
 132fe23:	74 70                	je     132fe95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175419>
 132fe25:	4d 8d 7e 70          	lea    r15,[r14+0x70]
 132fe29:	4d 39 ef             	cmp    r15,r13
 132fe2c:	74 2e                	je     132fe5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1753e0>
 132fe2e:	4c 89 f7             	mov    rdi,r14
 132fe31:	4c 89 fe             	mov    rsi,r15
 132fe34:	e8 b3 9f 2a 00       	call   15d9dec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f370>
 132fe39:	84 c0                	test   al,al
 132fe3b:	75 0f                	jne    132fe4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1753d0>
 132fe3d:	49                   	rex.WB
 132fe3e:	83                   	.byte 0x83
 132fe3f:	c6                   	.byte 0xc6

## Wider containing construction window

/tmp/s184pair/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000132f600 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174b84>:
 132f600:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f607:	00 00 
 132f609:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 132f60e:	75 08                	jne    132f618 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174b9c>
 132f610:	48 89 df             	mov    rdi,rbx
 132f613:	e8 b8 06 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 132f618:	e8 93 04 4c 00       	call   17efab0 <__stack_chk_fail@plt>
 132f61d:	cc                   	int3
 132f61e:	55                   	push   rbp
 132f61f:	41 56                	push   r14
 132f621:	53                   	push   rbx
 132f622:	48 83 ec 20          	sub    rsp,0x20
 132f626:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f62d:	00 00 
 132f62f:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 132f634:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 132f637:	8b 2b                	mov    ebp,DWORD PTR [rbx]
 132f639:	48 83 c3 08          	add    rbx,0x8
 132f63d:	49 89 e6             	mov    r14,rsp
 132f640:	4c 89 f7             	mov    rdi,r14
 132f643:	e8 70 fe ff ff       	call   132f4b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174a3c>
 132f648:	6a 01                	push   0x1
 132f64a:	5a                   	pop    rdx
 132f64b:	4c 89 f7             	mov    rdi,r14
 132f64e:	89 ee                	mov    esi,ebp
 132f650:	48 89 d9             	mov    rcx,rbx
 132f653:	e8 00 9d 2a 00       	call   15d9358 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e8dc>
 132f658:	89 c3                	mov    ebx,eax
 132f65a:	48 89 e7             	mov    rdi,rsp
 132f65d:	e8 2e e8 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132f662:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f669:	00 00 
 132f66b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 132f670:	75 2e                	jne    132f6a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174c24>
 132f672:	89 d8                	mov    eax,ebx
 132f674:	48 83 c4 20          	add    rsp,0x20
 132f678:	5b                   	pop    rbx
 132f679:	41 5e                	pop    r14
 132f67b:	5d                   	pop    rbp
 132f67c:	c3                   	ret
 132f67d:	48 89 c3             	mov    rbx,rax
 132f680:	48 89 e7             	mov    rdi,rsp
 132f683:	e8 08 e8 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132f688:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f68f:	00 00 
 132f691:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 132f696:	75 08                	jne    132f6a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174c24>
 132f698:	48 89 df             	mov    rdi,rbx
 132f69b:	e8 30 06 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 132f6a0:	e8 0b 04 4c 00       	call   17efab0 <__stack_chk_fail@plt>
 132f6a5:	cc                   	int3
 132f6a6:	41 56                	push   r14
 132f6a8:	53                   	push   rbx
 132f6a9:	48 83 ec 28          	sub    rsp,0x28
 132f6ad:	48 89 d3             	mov    rbx,rdx
 132f6b0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f6b7:	00 00 
 132f6b9:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 132f6be:	48 8b 17             	mov    rdx,QWORD PTR [rdi]
 132f6c1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 132f6c4:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 132f6c9:	4c 89 f7             	mov    rdi,r14
 132f6cc:	ff 50 70             	call   QWORD PTR [rax+0x70]
 132f6cf:	4c 89 f7             	mov    rdi,r14
 132f6d2:	31 f6                	xor    esi,esi
 132f6d4:	48 89 da             	mov    rdx,rbx
 132f6d7:	e8 48 9a 2a 00       	call   15d9124 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e6a8>
 132f6dc:	89 c3                	mov    ebx,eax
 132f6de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 132f6e3:	e8 a8 e7 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132f6e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f6ef:	00 00 
 132f6f1:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 132f6f6:	75 2f                	jne    132f727 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174cab>
 132f6f8:	89 d8                	mov    eax,ebx
 132f6fa:	48 83 c4 28          	add    rsp,0x28
 132f6fe:	5b                   	pop    rbx
 132f6ff:	41 5e                	pop    r14
 132f701:	c3                   	ret
 132f702:	48 89 c3             	mov    rbx,rax
 132f705:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 132f70a:	e8 81 e7 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132f70f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f716:	00 00 
 132f718:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 132f71d:	75 08                	jne    132f727 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174cab>
 132f71f:	48 89 df             	mov    rdi,rbx
 132f722:	e8 a9 05 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 132f727:	e8 84 03 4c 00       	call   17efab0 <__stack_chk_fail@plt>
 132f72c:	55                   	push   rbp
 132f72d:	41 57                	push   r15
 132f72f:	41 56                	push   r14
 132f731:	53                   	push   rbx
 132f732:	48 83 ec 38          	sub    rsp,0x38
 132f736:	48 89 d3             	mov    rbx,rdx
 132f739:	49 89 fe             	mov    r14,rdi
 132f73c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f743:	00 00 
 132f745:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 132f74a:	40 8a 2f             	mov    bpl,BYTE PTR [rdi]
 132f74d:	48 8b 57 08          	mov    rdx,QWORD PTR [rdi+0x8]
 132f751:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 132f754:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 132f759:	ff 50 70             	call   QWORD PTR [rax+0x70]
 132f75c:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
 132f760:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 132f763:	48 89 e7             	mov    rdi,rsp
 132f766:	48 89 de             	mov    rsi,rbx
 132f769:	ff 50 70             	call   QWORD PTR [rax+0x70]
 132f76c:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
 132f771:	49 89 e7             	mov    r15,rsp
 132f774:	4c 89 f7             	mov    rdi,r14
 132f777:	4c 89 fe             	mov    rsi,r15
 132f77a:	e8 c1 98 2a 00       	call   15d9040 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e5c4>
 132f77f:	89 c3                	mov    ebx,eax
 132f781:	f7 db                	neg    ebx
 132f783:	40 84 ed             	test   bpl,bpl
 132f786:	0f 45 d8             	cmovne ebx,eax
 132f789:	4c 89 ff             	mov    rdi,r15
 132f78c:	e8 ff e6 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132f791:	4c 89 f7             	mov    rdi,r14
 132f794:	e8 f7 e6 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132f799:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f7a0:	00 00 
 132f7a2:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 132f7a7:	75 32                	jne    132f7db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174d5f>
 132f7a9:	89 d8                	mov    eax,ebx
 132f7ab:	48 83 c4 38          	add    rsp,0x38
 132f7af:	5b                   	pop    rbx
 132f7b0:	41 5e                	pop    r14
 132f7b2:	41 5f                	pop    r15
 132f7b4:	5d                   	pop    rbp
 132f7b5:	c3                   	ret
 132f7b6:	48 89 c3             	mov    rbx,rax
 132f7b9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 132f7be:	e8 cd e6 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132f7c3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f7ca:	00 00 
 132f7cc:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 132f7d1:	75 08                	jne    132f7db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174d5f>
 132f7d3:	48 89 df             	mov    rdi,rbx
 132f7d6:	e8 f5 04 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 132f7db:	e8 d0 02 4c 00       	call   17efab0 <__stack_chk_fail@plt>
 132f7e0:	55                   	push   rbp
 132f7e1:	41 56                	push   r14
 132f7e3:	53                   	push   rbx
 132f7e4:	48 83 ec 20          	sub    rsp,0x20
 132f7e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f7ef:	00 00 
 132f7f1:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 132f7f6:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 132f7f9:	8b 2b                	mov    ebp,DWORD PTR [rbx]
 132f7fb:	48 8b 53 28          	mov    rdx,QWORD PTR [rbx+0x28]
 132f7ff:	48 83 c3 08          	add    rbx,0x8
 132f803:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 132f806:	49 89 e6             	mov    r14,rsp
 132f809:	4c 89 f7             	mov    rdi,r14
 132f80c:	ff 50 70             	call   QWORD PTR [rax+0x70]
 132f80f:	4c 89 f7             	mov    rdi,r14
 132f812:	89 ee                	mov    esi,ebp
 132f814:	31 d2                	xor    edx,edx
 132f816:	48 89 d9             	mov    rcx,rbx
 132f819:	e8 3a 9b 2a 00       	call   15d9358 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e8dc>
 132f81e:	89 c3                	mov    ebx,eax
 132f820:	48 89 e7             	mov    rdi,rsp
 132f823:	e8 68 e6 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132f828:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f82f:	00 00 
 132f831:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 132f836:	75 2e                	jne    132f866 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174dea>
 132f838:	89 d8                	mov    eax,ebx
 132f83a:	48 83 c4 20          	add    rsp,0x20
 132f83e:	5b                   	pop    rbx
 132f83f:	41 5e                	pop    r14
 132f841:	5d                   	pop    rbp
 132f842:	c3                   	ret
 132f843:	48 89 c3             	mov    rbx,rax
 132f846:	48 89 e7             	mov    rdi,rsp
 132f849:	e8 42 e6 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132f84e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f855:	00 00 
 132f857:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 132f85c:	75 08                	jne    132f866 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174dea>
 132f85e:	48 89 df             	mov    rdi,rbx
 132f861:	e8 6a 04 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 132f866:	e8 45 02 4c 00       	call   17efab0 <__stack_chk_fail@plt>
 132f86b:	cc                   	int3
 132f86c:	53                   	push   rbx
 132f86d:	48 89 d3             	mov    rbx,rdx
 132f870:	48 89 f7             	mov    rdi,rsi
 132f873:	e8 0c 00 00 00       	call   132f884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e08>
 132f878:	48 63 f8             	movsxd rdi,eax
 132f87b:	48 89 de             	mov    rsi,rbx
 132f87e:	5b                   	pop    rbx
 132f87f:	e9 18 9e 2a 00       	jmp    15d969c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41ec20>
 132f884:	53                   	push   rbx
 132f885:	48 89 fb             	mov    rbx,rdi
 132f888:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 132f88b:	ff 50 58             	call   QWORD PTR [rax+0x58]
 132f88e:	48 c1 e8 20          	shr    rax,0x20
 132f892:	84 c0                	test   al,al
 132f894:	74 0b                	je     132f8a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e25>
 132f896:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 132f899:	48 89 df             	mov    rdi,rbx
 132f89c:	ff 50 58             	call   QWORD PTR [rax+0x58]
 132f89f:	eb 03                	jmp    132f8a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e28>
 132f8a1:	6a ff                	push   0xffffffffffffffff
 132f8a3:	58                   	pop    rax
 132f8a4:	5b                   	pop    rbx
 132f8a5:	c3                   	ret
 132f8a6:	55                   	push   rbp
 132f8a7:	41 56                	push   r14
 132f8a9:	53                   	push   rbx
 132f8aa:	48 89 d3             	mov    rbx,rdx
 132f8ad:	44 8a 37             	mov    r14b,BYTE PTR [rdi]
 132f8b0:	48 89 f7             	mov    rdi,rsi
 132f8b3:	e8 cc ff ff ff       	call   132f884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e08>
 132f8b8:	89 c5                	mov    ebp,eax
 132f8ba:	48 89 df             	mov    rdi,rbx
 132f8bd:	e8 c2 ff ff ff       	call   132f884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e08>
 132f8c2:	29 c5                	sub    ebp,eax
 132f8c4:	89 e8                	mov    eax,ebp
 132f8c6:	f7 d8                	neg    eax
 132f8c8:	45 84 f6             	test   r14b,r14b
 132f8cb:	0f 45 c5             	cmovne eax,ebp
 132f8ce:	5b                   	pop    rbx
 132f8cf:	41 5e                	pop    r14
 132f8d1:	5d                   	pop    rbp
 132f8d2:	c3                   	ret
 132f8d3:	cc                   	int3
 132f8d4:	41 56                	push   r14
 132f8d6:	53                   	push   rbx
 132f8d7:	50                   	push   rax
 132f8d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 132f8db:	8b 18                	mov    ebx,DWORD PTR [rax]
 132f8dd:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
 132f8e1:	48 89 f7             	mov    rdi,rsi
 132f8e4:	e8 9b ff ff ff       	call   132f884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e08>
 132f8e9:	48 63 f8             	movsxd rdi,eax
 132f8ec:	89 de                	mov    esi,ebx
 132f8ee:	4c 89 f2             	mov    rdx,r14
 132f8f1:	48 83 c4 08          	add    rsp,0x8
 132f8f5:	5b                   	pop    rbx
 132f8f6:	41 5e                	pop    r14
 132f8f8:	e9 57 9d 2a 00       	jmp    15d9654 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41ebd8>
 132f8fd:	cc                   	int3
 132f8fe:	53                   	push   rbx
 132f8ff:	48 89 d3             	mov    rbx,rdx
 132f902:	48 89 f7             	mov    rdi,rsi
 132f905:	e8 0c 00 00 00       	call   132f916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e9a>
 132f90a:	48 63 f8             	movsxd rdi,eax
 132f90d:	48 89 de             	mov    rsi,rbx
 132f910:	5b                   	pop    rbx
 132f911:	e9 86 9d 2a 00       	jmp    15d969c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41ec20>
 132f916:	48 83 ec 18          	sub    rsp,0x18
 132f91a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f921:	00 00 
 132f923:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 132f928:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 132f92b:	ff 50 68             	call   QWORD PTR [rax+0x68]
 132f92e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 132f933:	48 89 07             	mov    QWORD PTR [rdi],rax
 132f936:	e8 05 f2 4b 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
 132f93b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 132f942:	00 00 
 132f944:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 132f949:	75 05                	jne    132f950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174ed4>
 132f94b:	48 83 c4 18          	add    rsp,0x18
 132f94f:	c3                   	ret
 132f950:	e8 5b 01 4c 00       	call   17efab0 <__stack_chk_fail@plt>
 132f955:	cc                   	int3
 132f956:	55                   	push   rbp
 132f957:	41 56                	push   r14
 132f959:	53                   	push   rbx
 132f95a:	48 89 d3             	mov    rbx,rdx
 132f95d:	44 8a 37             	mov    r14b,BYTE PTR [rdi]
 132f960:	48 89 f7             	mov    rdi,rsi
 132f963:	e8 ae ff ff ff       	call   132f916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e9a>
 132f968:	89 c5                	mov    ebp,eax
 132f96a:	48 89 df             	mov    rdi,rbx
 132f96d:	e8 a4 ff ff ff       	call   132f916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e9a>
 132f972:	29 c5                	sub    ebp,eax
 132f974:	89 e8                	mov    eax,ebp
 132f976:	f7 d8                	neg    eax
 132f978:	45 84 f6             	test   r14b,r14b
 132f97b:	0f 45 c5             	cmovne eax,ebp
 132f97e:	5b                   	pop    rbx
 132f97f:	41 5e                	pop    r14
 132f981:	5d                   	pop    rbp
 132f982:	c3                   	ret
 132f983:	cc                   	int3
 132f984:	41 56                	push   r14
 132f986:	53                   	push   rbx
 132f987:	50                   	push   rax
 132f988:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 132f98b:	8b 18                	mov    ebx,DWORD PTR [rax]
 132f98d:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
 132f991:	48 89 f7             	mov    rdi,rsi
 132f994:	e8 7d ff ff ff       	call   132f916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174e9a>
 132f999:	48 63 f8             	movsxd rdi,eax
 132f99c:	89 de                	mov    esi,ebx
 132f99e:	4c 89 f2             	mov    rdx,r14
 132f9a1:	48 83 c4 08          	add    rsp,0x8
 132f9a5:	5b                   	pop    rbx
 132f9a6:	41 5e                	pop    r14
 132f9a8:	e9 a7 9c 2a 00       	jmp    15d9654 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41ebd8>
 132f9ad:	cc                   	int3
 132f9ae:	48 8d 05 bb 62 53 00 	lea    rax,[rip+0x5362bb]        # 1865c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22358>
 132f9b5:	48 89 07             	mov    QWORD PTR [rdi],rax
 132f9b8:	e9 53 e6 4b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 132f9bd:	cc                   	int3
 132f9be:	53                   	push   rbx
 132f9bf:	48 89 fb             	mov    rbx,rdi
 132f9c2:	e8 e7 ff ff ff       	call   132f9ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174f32>
 132f9c7:	48 89 df             	mov    rdi,rbx
 132f9ca:	5b                   	pop    rbx
 132f9cb:	e9 50 e5 4b 00       	jmp    17edf20 <_ZdlPv@plt>
 132f9d0:	48 83 c7 18          	add    rdi,0x18
 132f9d4:	e9 63 98 ff ff       	jmp    132923c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e7c0>
 132f9d9:	cc                   	int3
 132f9da:	41 56                	push   r14
 132f9dc:	53                   	push   rbx
 132f9dd:	48 83 ec 28          	sub    rsp,0x28
 132f9e1:	48 89 d3             	mov    rbx,rdx
 132f9e4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132f9eb:	00 00 
 132f9ed:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 132f9f2:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 132f9f7:	4c 89 f7             	mov    rdi,r14
 132f9fa:	e8 5d 00 00 00       	call   132fa5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174fe0>
 132f9ff:	4c 89 f7             	mov    rdi,r14
 132fa02:	31 f6                	xor    esi,esi
 132fa04:	48 89 da             	mov    rdx,rbx
 132fa07:	e8 18 97 2a 00       	call   15d9124 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e6a8>
 132fa0c:	89 c3                	mov    ebx,eax
 132fa0e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 132fa13:	e8 78 e4 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132fa18:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fa1f:	00 00 
 132fa21:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 132fa26:	75 2f                	jne    132fa57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174fdb>
 132fa28:	89 d8                	mov    eax,ebx
 132fa2a:	48 83 c4 28          	add    rsp,0x28
 132fa2e:	5b                   	pop    rbx
 132fa2f:	41 5e                	pop    r14
 132fa31:	c3                   	ret
 132fa32:	48 89 c3             	mov    rbx,rax
 132fa35:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 132fa3a:	e8 51 e4 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132fa3f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fa46:	00 00 
 132fa48:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 132fa4d:	75 08                	jne    132fa57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174fdb>
 132fa4f:	48 89 df             	mov    rdi,rbx
 132fa52:	e8 79 02 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 132fa57:	e8 54 00 4c 00       	call   17efab0 <__stack_chk_fail@plt>
 132fa5c:	53                   	push   rbx
 132fa5d:	48 89 fb             	mov    rbx,rdi
 132fa60:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 132fa63:	48 89 f7             	mov    rdi,rsi
 132fa66:	ff 50 60             	call   QWORD PTR [rax+0x60]
 132fa69:	48 89 df             	mov    rdi,rbx
 132fa6c:	48 89 c6             	mov    rsi,rax
 132fa6f:	5b                   	pop    rbx
 132fa70:	e9 cb e4 4b 00       	jmp    17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 132fa75:	cc                   	int3
 132fa76:	48 8d 05 bb 61 53 00 	lea    rax,[rip+0x5361bb]        # 1865c38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22320>
 132fa7d:	48 89 07             	mov    QWORD PTR [rdi],rax
 132fa80:	e9 8b e5 4b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 132fa85:	cc                   	int3
 132fa86:	53                   	push   rbx
 132fa87:	48 89 fb             	mov    rbx,rdi
 132fa8a:	e8 e7 ff ff ff       	call   132fa76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174ffa>
 132fa8f:	48 89 df             	mov    rdi,rbx
 132fa92:	5b                   	pop    rbx
 132fa93:	e9 88 e4 4b 00       	jmp    17edf20 <_ZdlPv@plt>
 132fa98:	48 83 c7 18          	add    rdi,0x18
 132fa9c:	e9 3b 96 ff ff       	jmp    13290dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e660>
 132faa1:	cc                   	int3
 132faa2:	55                   	push   rbp
 132faa3:	41 57                	push   r15
 132faa5:	41 56                	push   r14
 132faa7:	53                   	push   rbx
 132faa8:	48 83 ec 38          	sub    rsp,0x38
 132faac:	48 89 d3             	mov    rbx,rdx
 132faaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fab6:	00 00 
 132fab8:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 132fabd:	40 8a 2f             	mov    bpl,BYTE PTR [rdi]
 132fac0:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 132fac5:	e8 92 ff ff ff       	call   132fa5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174fe0>
 132faca:	48 89 e7             	mov    rdi,rsp
 132facd:	48 89 de             	mov    rsi,rbx
 132fad0:	e8 87 ff ff ff       	call   132fa5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174fe0>
 132fad5:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
 132fada:	49 89 e7             	mov    r15,rsp
 132fadd:	4c 89 f7             	mov    rdi,r14
 132fae0:	4c 89 fe             	mov    rsi,r15
 132fae3:	e8 58 95 2a 00       	call   15d9040 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e5c4>
 132fae8:	89 c3                	mov    ebx,eax
 132faea:	f7 db                	neg    ebx
 132faec:	40 84 ed             	test   bpl,bpl
 132faef:	0f 45 d8             	cmovne ebx,eax
 132faf2:	4c 89 ff             	mov    rdi,r15
 132faf5:	e8 96 e3 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132fafa:	4c 89 f7             	mov    rdi,r14
 132fafd:	e8 8e e3 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132fb02:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fb09:	00 00 
 132fb0b:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 132fb10:	75 32                	jne    132fb44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1750c8>
 132fb12:	89 d8                	mov    eax,ebx
 132fb14:	48 83 c4 38          	add    rsp,0x38
 132fb18:	5b                   	pop    rbx
 132fb19:	41 5e                	pop    r14
 132fb1b:	41 5f                	pop    r15
 132fb1d:	5d                   	pop    rbp
 132fb1e:	c3                   	ret
 132fb1f:	48 89 c3             	mov    rbx,rax
 132fb22:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 132fb27:	e8 64 e3 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
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
 132fb76:	55                   	push   rbp
 132fb77:	41 56                	push   r14
 132fb79:	53                   	push   rbx
 132fb7a:	48 83 ec 20          	sub    rsp,0x20
 132fb7e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fb85:	00 00 
 132fb87:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 132fb8c:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 132fb8f:	8b 2b                	mov    ebp,DWORD PTR [rbx]
 132fb91:	48 83 c3 08          	add    rbx,0x8
 132fb95:	49 89 e6             	mov    r14,rsp
 132fb98:	4c 89 f7             	mov    rdi,r14
 132fb9b:	e8 bc fe ff ff       	call   132fa5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174fe0>
 132fba0:	4c 89 f7             	mov    rdi,r14
 132fba3:	89 ee                	mov    esi,ebp
 132fba5:	31 d2                	xor    edx,edx
 132fba7:	48 89 d9             	mov    rcx,rbx
 132fbaa:	e8 a9 97 2a 00       	call   15d9358 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e8dc>
 132fbaf:	89 c3                	mov    ebx,eax
 132fbb1:	48 89 e7             	mov    rdi,rsp
 132fbb4:	e8 d7 e2 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132fbb9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fbc0:	00 00 
 132fbc2:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 132fbc7:	75 2e                	jne    132fbf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17517b>
 132fbc9:	89 d8                	mov    eax,ebx
 132fbcb:	48 83 c4 20          	add    rsp,0x20
 132fbcf:	5b                   	pop    rbx
 132fbd0:	41 5e                	pop    r14
 132fbd2:	5d                   	pop    rbp
 132fbd3:	c3                   	ret
 132fbd4:	48 89 c3             	mov    rbx,rax
 132fbd7:	48 89 e7             	mov    rdi,rsp
 132fbda:	e8 b1 e2 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 132fbdf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 132fbe6:	00 00 
 132fbe8:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 132fbed:	75 08                	jne    132fbf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17517b>
 132fbef:	48 89 df             	mov    rdi,rbx
 132fbf2:	e8 d9 00 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 132fbf7:	e8 b4 fe 4b 00       	call   17efab0 <__stack_chk_fail@plt>
 132fbfc:	41 57                	push   r15
 132fbfe:	41 56                	push   r14
 132fc00:	41 55                	push   r13
 132fc02:	41 54                	push   r12
 132fc04:	53                   	push   rbx
 132fc05:	49 89 ce             	mov    r14,rcx
 132fc08:	49 89 d7             	mov    r15,rdx
 132fc0b:	48 89 fb             	mov    rbx,rdi
 132fc0e:	e8 21 a8 39 00       	call   16ca434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5a0>
 132fc13:	0f 57 c0             	xorps  xmm0,xmm0
 132fc16:	0f 29 43 60          	movaps XMMWORD PTR [rbx+0x60],xmm0
 132fc1a:	48 83 63 70 00       	and    QWORD PTR [rbx+0x70],0x0
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
 132fd2d:	41 8a 87 90 00 00 00 	mov    al,BYTE PTR [r15+0x90]
 132fd34:	88 83 f0 00 00 00    	mov    BYTE PTR [rbx+0xf0],al
 132fd3a:	31 c0                	xor    eax,eax
 132fd3c:	88 83 00 01 00 00    	mov    BYTE PTR [rbx+0x100],al
 132fd42:	88 83 50 01 00 00    	mov    BYTE PTR [rbx+0x150],al
 132fd48:	41 38 87 f0 00 00 00 	cmp    BYTE PTR [r15+0xf0],al
 132fd4f:	74 13                	je     132fd64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1752e8>
 132fd51:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
 132fd58:	49 8d b7 a0 00 00 00 	lea    rsi,[r15+0xa0]
 132fd5f:	e8 d2 ba f7 ff       	call   12ab836 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf0dba>
 132fd64:	41 0f b7 87 00 01 00 	movzx  eax,WORD PTR [r15+0x100]
 132fd6b:	00 
 132fd6c:	66 89 83 60 01 00 00 	mov    WORD PTR [rbx+0x160],ax
 132fd73:	4c 8d bb 70 01 00 00 	lea    r15,[rbx+0x170]
 132fd7a:	4c 89 ff             	mov    rdi,r15
 132fd7d:	4c 89 f6             	mov    rsi,r14
 132fd80:	e8 59 21 98 ff       	call   cb1ede <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fee7e>
 132fd85:	80 bb 50 01 00 00 00 	cmp    BYTE PTR [rbx+0x150],0x0
 132fd8c:	74 11                	je     132fd9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175323>
 132fd8e:	4c 8d 73 60          	lea    r14,[rbx+0x60]
 132fd92:	e8 8b da 47 00       	call   17ad822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16198e>
 132fd97:	48 89 c1             	mov    rcx,rax
 132fd9a:	41 b0 01             	mov    r8b,0x1
 132fd9d:	eb 05                	jmp    132fda4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175328>
 132fd9f:	45 31 c0             	xor    r8d,r8d
 132fda2:	31 c9                	xor    ecx,ecx
 132fda4:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
 132fda8:	48 8b b3 80 00 00 00 	mov    rsi,QWORD PTR [rbx+0x80]
 132fdaf:	48 89 f0             	mov    rax,rsi
 132fdb2:	48 29 f8             	sub    rax,rdi
 132fdb5:	6a 38                	push   0x38
 132fdb7:	41 59                	pop    r9
 132fdb9:	48 99                	cqo
 132fdbb:	49 f7 f9             	idiv   r9
 132fdbe:	48 0f bd c0          	bsr    rax,rax
 132fdc2:	83 f0 3f             	xor    eax,0x3f
 132fdc5:	01 c0                	add    eax,eax
 132fdc7:	48 83 f0 7e          	xor    rax,0x7e
 132fdcb:	31 d2                	xor    edx,edx
 132fdcd:	48 39 fe             	cmp    rsi,rdi
 132fdd0:	48 89 8b d8 01 00 00 	mov    QWORD PTR [rbx+0x1d8],rcx
 132fdd7:	44 88 83 e0 01 00 00 	mov    BYTE PTR [rbx+0x1e0],r8b
 132fdde:	48 0f 45 d0          	cmovne rdx,rax
 132fde2:	6a 01                	push   0x1
 132fde4:	59                   	pop    rcx
 132fde5:	e8 92 02 00 00       	call   133007c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175600>
 132fdea:	4c 8b 73 78          	mov    r14,QWORD PTR [rbx+0x78]
 132fdee:	4c 8b ab 80 00 00 00 	mov    r13,QWORD PTR [rbx+0x80]
 132fdf5:	4d 39 ee             	cmp    r14,r13
 132fdf8:	74 26                	je     132fe20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1753a4>
 132fdfa:	4d 8d 7e 38          	lea    r15,[r14+0x38]
 132fdfe:	4d 39 ef             	cmp    r15,r13
 132fe01:	0f 84 8e 00 00 00    	je     132fe95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175419>
 132fe07:	4c 89 f7             	mov    rdi,r14
 132fe0a:	4c 89 fe             	mov    rsi,r15
 132fe0d:	e8 da 9f 2a 00       	call   15d9dec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f370>
 132fe12:	4d 89 fe             	mov    r14,r15
 132fe15:	84 c0                	test   al,al
 132fe17:	74 e1                	je     132fdfa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17537e>
 132fe19:	49 83 c7 c8          	add    r15,0xffffffffffffffc8
 132fe1d:	4d 89 fe             	mov    r14,r15
 132fe20:	4d 39 ee             	cmp    r14,r13
 132fe23:	74 70                	je     132fe95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175419>
 132fe25:	4d 8d 7e 70          	lea    r15,[r14+0x70]
 132fe29:	4d 39 ef             	cmp    r15,r13
 132fe2c:	74 2e                	je     132fe5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1753e0>
 132fe2e:	4c 89 f7             	mov    rdi,r14
 132fe31:	4c 89 fe             	mov    rsi,r15
 132fe34:	e8 b3 9f 2a 00       	call   15d9dec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f370>
 132fe39:	84 c0                	test   al,al
 132fe3b:	75 0f                	jne    132fe4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1753d0>
 132fe3d:	49 83 c6 38          	add    r14,0x38
 132fe41:	4c 89 f7             	mov    rdi,r14
 132fe44:	4c 89 fe             	mov    rsi,r15
 132fe47:	e8 42 ba df ff       	call   112b88e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2ca4>
 132fe4c:	49 83 c7 38          	add    r15,0x38
 132fe50:	4d 39 ef             	cmp    r15,r13
 132fe53:	75 d9                	jne    132fe2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1753b2>
 132fe55:	4c 8b ab 80 00 00 00 	mov    r13,QWORD PTR [rbx+0x80]
 132fe5c:	49 83 c6 38          	add    r14,0x38
 132fe60:	4d 39 ee             	cmp    r14,r13
 132fe63:	74 30                	je     132fe95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175419>
 132fe65:	4c 8d 7b 78          	lea    r15,[rbx+0x78]
 132fe69:	b0 01                	mov    al,0x1
 132fe6b:	84 c0                	test   al,al
 132fe6d:	75 1b                	jne    132fe8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17540e>
 132fe6f:	4d 89 ec             	mov    r12,r13
 132fe72:	4c 89 f7             	mov    rdi,r14
 132fe75:	4c 89 e6             	mov    rsi,r12
 132fe78:	e8 11 ba df ff       	call   112b88e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2ca4>
 132fe7d:	49 83 c4 38          	add    r12,0x38
 132fe81:	49 83 c6 38          	add    r14,0x38
 132fe85:	4d 39 ec             	cmp    r12,r13
 132fe88:	75 e8                	jne    132fe72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1753f6>
 132fe8a:	4c 89 ff             	mov    rdi,r15
 132fe8d:	4c 89 f6             	mov    rsi,r14
 132fe90:	e8 97 66 8f ff       	call   c2652c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1734cc>
 132fe95:	48 8b bb 90 00 00 00 	mov    rdi,QWORD PTR [rbx+0x90]
 132fe9c:	48 8b b3 98 00 00 00 	mov    rsi,QWORD PTR [rbx+0x98]
 132fea3:	48 89 f0             	mov    rax,rsi
 132fea6:	48 29 f8             	sub    rax,rdi
 132fea9:	48 c1 f8 02          	sar    rax,0x2
 132fead:	48 0f bd c0          	bsr    rax,rax
 132feb1:	83 f0 3f             	xor    eax,0x3f
 132feb4:	01 c0                	add    eax,eax
 132feb6:	48 83 f0 7e          	xor    rax,0x7e
 132feba:	31 d2                	xor    edx,edx
 132febc:	48 39 fe             	cmp    rsi,rdi
 132febf:	48 0f 45 d0          	cmovne rdx,rax
 132fec3:	6a 01                	push   0x1
 132fec5:	59                   	pop    rcx
 132fec6:	e8 ae 0b 00 00       	call   1330a79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175ffd>
 132fecb:	4c 8b bb 90 00 00 00 	mov    r15,QWORD PTR [rbx+0x90]
 132fed2:	4c 8b b3 98 00 00 00 	mov    r14,QWORD PTR [rbx+0x98]
 132fed9:	4d 39 f7             	cmp    r15,r14
 132fedc:	74 20                	je     132fefe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175482>
 132fede:	49 83 c7 04          	add    r15,0x4
 132fee2:	4d 39 f7             	cmp    r15,r14
 132fee5:	74 74                	je     132ff5b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1754df>
 132fee7:	41 8b 4f fc          	mov    ecx,DWORD PTR [r15-0x4]
 132feeb:	49 8d 47 04          	lea    rax,[r15+0x4]
 132feef:	41 3b 0f             	cmp    ecx,DWORD PTR [r15]
 132fef2:	49 89 c7             	mov    r15,rax
 132fef5:	75 eb                	jne    132fee2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175466>
 132fef7:	48 83 c0 f8          	add    rax,0xfffffffffffffff8
 132fefb:	49 89 c7             	mov    r15,rax
 132fefe:	4d 39 f7             	cmp    r15,r14
 132ff01:	74 58                	je     132ff5b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1754df>
 132ff03:	49 8d 47 08          	lea    rax,[r15+0x8]
 132ff07:	4c 39 f0             	cmp    rax,r14
 132ff0a:	74 23                	je     132ff2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1754b3>
 132ff0c:	41 8b 0f             	mov    ecx,DWORD PTR [r15]
 132ff0f:	89 ca                	mov    edx,ecx
 132ff11:	8b 08                	mov    ecx,DWORD PTR [rax]
 132ff13:	39 ca                	cmp    edx,ecx
 132ff15:	74 08                	je     132ff1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1754a3>
 132ff17:	41 89 4f 04          	mov    DWORD PTR [r15+0x4],ecx
 132ff1b:	49 83 c7 04          	add    r15,0x4
 132ff1f:	48 83 c0 04          	add    rax,0x4
 132ff23:	4c 39 f0             	cmp    rax,r14
 132ff26:	75 e7                	jne    132ff0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175493>
 132ff28:	4c 8b b3 98 00 00 00 	mov    r14,QWORD PTR [rbx+0x98]
 132ff2f:	49 83 c7 04          	add    r15,0x4
 132ff33:	4d 39 f7             	cmp    r15,r14
 132ff36:	74 23                	je     132ff5b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1754df>
 132ff38:	4c 89 f6             	mov    rsi,r14
 132ff3b:	4c 29 fe             	sub    rsi,r15
 132ff3e:	4c 01 fe             	add    rsi,r15
 132ff41:	49 29 f6             	sub    r14,rsi
 132ff44:	74 0b                	je     132ff51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1754d5>
 132ff46:	4c 89 ff             	mov    rdi,r15
 132ff49:	4c 89 f2             	mov    rdx,r14
 132ff4c:	e8 8f fb 4b 00       	call   17efae0 <memmove@plt>
 132ff51:	4d 01 f7             	add    r15,r14
 132ff54:	4c 89 bb 98 00 00 00 	mov    QWORD PTR [rbx+0x98],r15
 132ff5b:	48 8b bb b8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb8]
 132ff62:	48 8b b3 c0 00 00 00 	mov    rsi,QWORD PTR [rbx+0xc0]
 132ff69:	48 89 f0             	mov    rax,rsi
 132ff6c:	48 29 f8             	sub    rax,rdi
 132ff6f:	6a 30                	push   0x30
 132ff71:	59                   	pop    rcx
 132ff72:	48 99                	cqo
 132ff74:	48 f7 f9             	idiv   rcx
 132ff77:	48 0f bd c0          	bsr    rax,rax
 132ff7b:	83 f0 3f             	xor    eax,0x3f
 132ff7e:	01 c0                	add    eax,eax
 132ff80:	48 83 f0 7e          	xor    rax,0x7e
 132ff84:	31 d2                	xor    edx,edx
 132ff86:	48 39 fe             	cmp    rsi,rdi
 132ff89:	48 0f 45 d0          	cmovne rdx,rax
 132ff8d:	6a 01                	push   0x1
 132ff8f:	59                   	pop    rcx
 132ff90:	e8 4f ff e8 ff       	call   11bfee4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5468>
 132ff95:	4c 8b b3 b8 00 00 00 	mov    r14,QWORD PTR [rbx+0xb8]
 132ff9c:	4c 8b a3 c0 00 00 00 	mov    r12,QWORD PTR [rbx+0xc0]
 132ffa3:	4d 39 e6             	cmp    r14,r12
 132ffa6:	74 26                	je     132ffce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175552>
 132ffa8:	4d 8d 7e 30          	lea    r15,[r14+0x30]
 132ffac:	4d 39 e7             	cmp    r15,r12
 132ffaf:	0f 84 9a 00 00 00    	je     133004f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755d3>
 132ffb5:	4c 89 f7             	mov    rdi,r14
 132ffb8:	4c 89 fe             	mov    rsi,r15
 132ffbb:	e8 36 9c 81 ff       	call   b49bf6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96b96>
 132ffc0:	4d 89 fe             	mov    r14,r15
 132ffc3:	84 c0                	test   al,al
 132ffc5:	74 e1                	je     132ffa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17552c>
 132ffc7:	49 83 c7 d0          	add    r15,0xffffffffffffffd0
 132ffcb:	4d 89 fe             	mov    r14,r15
 132ffce:	4d 39 e6             	cmp    r14,r12
 132ffd1:	74 7c                	je     133004f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755d3>
 132ffd3:	4d 8d 7e 60          	lea    r15,[r14+0x60]
 132ffd7:	4d 39 e7             	cmp    r15,r12
 132ffda:	74 2e                	je     133000a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17558e>
 132ffdc:	4c 89 f7             	mov    rdi,r14
 132ffdf:	4c 89 fe             	mov    rsi,r15
 132ffe2:	e8 0f 9c 81 ff       	call   b49bf6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96b96>
 132ffe7:	84 c0                	test   al,al
 132ffe9:	75 0f                	jne    132fffa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17557e>
 132ffeb:	49 83 c6 30          	add    r14,0x30
 132ffef:	4c 89 f7             	mov    rdi,r14
 132fff2:	4c 89 fe             	mov    rsi,r15
 132fff5:	e8 b6 19 c3 ff       	call   f619b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128dc6>
 132fffa:	49 83 c7 30          	add    r15,0x30
 132fffe:	4d 39 e7             	cmp    r15,r12
 1330001:	75 d9                	jne    132ffdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175560>
 1330003:	4c 8b a3 c0 00 00 00 	mov    r12,QWORD PTR [rbx+0xc0]
 133000a:	49 83 c6 30          	add    r14,0x30
 133000e:	4d 39 e6             	cmp    r14,r12
 1330011:	74 3c                	je     133004f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755d3>
 1330013:	48 81 c3 b8 00 00 00 	add    rbx,0xb8
 133001a:	b0 01                	mov    al,0x1
 133001c:	84 c0                	test   al,al
 133001e:	75 1b                	jne    133003b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755bf>
 1330020:	4d 89 e7             	mov    r15,r12
 1330023:	4c 89 f7             	mov    rdi,r14
 1330026:	4c 89 fe             	mov    rsi,r15
 1330029:	e8 82 19 c3 ff       	call   f619b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128dc6>
 133002e:	49 83 c7 30          	add    r15,0x30
 1330032:	49 83 c6 30          	add    r14,0x30
 1330036:	4d 39 e7             	cmp    r15,r12
 1330039:	75 e8                	jne    1330023 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755a7>
 133003b:	48 89 df             	mov    rdi,rbx
 133003e:	4c 89 f6             	mov    rsi,r14
 1330041:	5b                   	pop    rbx
 1330042:	41 5c                	pop    r12
 1330044:	41 5d                	pop    r13
 1330046:	41 5e                	pop    r14
 1330048:	41 5f                	pop    r15
 133004a:	e9 0b 14 82 ff       	jmp    b5145a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9e3fa>
 133004f:	5b                   	pop    rbx
 1330050:	41 5c                	pop    r12
 1330052:	41 5d                	pop    r13
 1330054:	41 5e                	pop    r14
 1330056:	41 5f                	pop    r15
 1330058:	c3                   	ret
 1330059:	49 89 c4             	mov    r12,rax
 133005c:	4c 89 ff             	mov    rdi,r15
 133005f:	e8 ca 52 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1330064:	4c 89 f7             	mov    rdi,r14
 1330067:	e8 26 47 d4 ff       	call   1074792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23bba8>
 133006c:	48 89 df             	mov    rdi,rbx
 133006f:	e8 ba 52 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1330074:	4c 89 e7             	mov    rdi,r12
 1330077:	e8 54 fc 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 133007c:	55                   	push   rbp
 133007d:	41 57                	push   r15
 133007f:	41 56                	push   r14
 1330081:	41 55                	push   r13
 1330083:	41 54                	push   r12
 1330085:	53                   	push   rbx
 1330086:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
 133008d:	89 4c 24 1c          	mov    DWORD PTR [rsp+0x1c],ecx
 1330091:	49 89 d6             	mov    r14,rdx
 1330094:	49 89 f4             	mov    r12,rsi
 1330097:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 133009c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 13300a3:	00 00 
 13300a5:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 13300ac:	00 
 13300ad:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
 13300b4:	00 
 13300b5:	49 8d 44 24 c8       	lea    rax,[r12-0x38]
 13300ba:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 13300bf:	49 8d 44 24 90       	lea    rax,[r12-0x70]
 13300c4:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 13300c9:	49 8d 84 24 58 ff ff 	lea    rax,[r12-0xa8]
 13300d0:	ff 
 13300d1:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 13300d6:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
 13300db:	4c 89 64 24 28       	mov    QWORD PTR [rsp+0x28],r12
 13300e0:	4c 89 e1             	mov    rcx,r12
 13300e3:	48 29 e9             	sub    rcx,rbp
 13300e6:	48 89 c8             	mov    rax,rcx
 13300e9:	48 99                	cqo
 13300eb:	6a 38                	push   0x38
 13300ed:	5e                   	pop    rsi
 13300ee:	48 f7 fe             	idiv   rsi
 13300f1:	48 83 f8 05          	cmp    rax,0x5
 13300f5:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
 13300fa:	0f 86 52 03 00 00    	jbe    1330452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759d6>
 1330100:	48 81 f9 3f 05 00 00 	cmp    rcx,0x53f
 1330107:	0f 8e d7 03 00 00    	jle    13304e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175a68>
 133010d:	4d 85 f6             	test   r14,r14
 1330110:	0f 84 d3 04 00 00    	je     13305e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b6d>
 1330116:	48 d1 e8             	shr    rax,1
 1330119:	4c 6b f8 38          	imul   r15,rax,0x38
 133011d:	49 8d 1c 2f          	lea    rbx,[r15+rbp*1]
 1330121:	48 81 f9 01 1c 00 00 	cmp    rcx,0x1c01
 1330128:	72 67                	jb     1330191 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175715>
 133012a:	48 89 ef             	mov    rdi,rbp
 133012d:	48 89 de             	mov    rsi,rbx
 1330130:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 1330135:	e8 26 11 00 00       	call   1331260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1767e4>
 133013a:	48 8d 7d 38          	lea    rdi,[rbp+0x38]
 133013e:	4d 89 f4             	mov    r12,r14
 1330141:	4d 8d 34 2f          	lea    r14,[r15+rbp*1]
 1330145:	49 83 c6 c8          	add    r14,0xffffffffffffffc8
 1330149:	4c 89 f6             	mov    rsi,r14
 133014c:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
 1330151:	e8 0a 11 00 00       	call   1331260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1767e4>
 1330156:	48 8d 7d 70          	lea    rdi,[rbp+0x70]
 133015a:	49 01 ef             	add    r15,rbp
 133015d:	49 83 c7 38          	add    r15,0x38
 1330161:	4c 89 fe             	mov    rsi,r15
 1330164:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
 1330169:	e8 f2 10 00 00       	call   1331260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1767e4>
 133016e:	4c 89 f7             	mov    rdi,r14
 1330171:	4d 89 e6             	mov    r14,r12
 1330174:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
 1330179:	48 89 de             	mov    rsi,rbx
 133017c:	4c 89 fa             	mov    rdx,r15
 133017f:	e8 dc 10 00 00       	call   1331260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1767e4>
 1330184:	48 89 ef             	mov    rdi,rbp
 1330187:	48 89 de             	mov    rsi,rbx
 133018a:	e8 76 b6 df ff       	call   112b805 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2c1b>
 133018f:	eb 10                	jmp    13301a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175725>
 1330191:	48 89 df             	mov    rdi,rbx
 1330194:	48 89 ee             	mov    rsi,rbp
 1330197:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 133019c:	e8 bf 10 00 00       	call   1331260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1767e4>
 13301a1:	49 ff ce             	dec    r14
 13301a4:	80 7c 24 1c 00       	cmp    BYTE PTR [rsp+0x1c],0x0
 13301a9:	75 14                	jne    13301bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175743>
 13301ab:	48 8d 7d c8          	lea    rdi,[rbp-0x38]
 13301af:	48 89 ee             	mov    rsi,rbp
 13301b2:	e8 4d 10 00 00       	call   1331204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176788>
 13301b7:	84 c0                	test   al,al
 13301b9:	0f 84 6c 01 00 00    	je     133032b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758af>
 13301bf:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
 13301c4:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
 13301c8:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 13301cf:	00 
 13301d0:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
 13301d4:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
 13301db:	00 
 13301dc:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
 13301e1:	0f 57 c9             	xorps  xmm1,xmm1
 13301e4:	0f 11 4d 00          	movups XMMWORD PTR [rbp+0x0],xmm1
 13301e8:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
 13301ec:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
 13301f3:	00 
 13301f4:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 13301f8:	0f 10 45 18          	movups xmm0,XMMWORD PTR [rbp+0x18]
 13301fc:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 13301ff:	48                   	rex.W

## Direct callers of functions in paired writer window

## High-address vptr loads in construction window
 132f99e:	4c 89 f2             	mov    rdx,r14
 132f9a1:	48 83 c4 08          	add    rsp,0x8
 132f9a5:	5b                   	pop    rbx
 132f9a6:	41 5e                	pop    r14
 132f9a8:	e9 a7 9c 2a 00       	jmp    15d9654 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41ebd8>
 132f9ad:	cc                   	int3
 132f9ae:	48 8d 05 bb 62 53 00 	lea    rax,[rip+0x5362bb]        # 1865c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22358>
 132f9b5:	48 89 07             	mov    QWORD PTR [rdi],rax
 132f9b8:	e9 53 e6 4b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 132f9bd:	cc                   	int3
 132f9be:	53                   	push   rbx
 132f9bf:	48 89 fb             	mov    rbx,rdi
 132f9c2:	e8 e7 ff ff ff       	call   132f9ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174f32>
 132f9c7:	48 89 df             	mov    rdi,rbx
 132f9ca:	5b                   	pop    rbx
 132f9cb:	e9 50 e5 4b 00       	jmp    17edf20 <_ZdlPv@plt>
 132f9d0:	48 83 c7 18          	add    rdi,0x18
 132f9d4:	e9 63 98 ff ff       	jmp    132923c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e7c0>
 132f9d9:	cc                   	int3
--
 132fa66:	ff 50 60             	call   QWORD PTR [rax+0x60]
 132fa69:	48 89 df             	mov    rdi,rbx
 132fa6c:	48 89 c6             	mov    rsi,rax
 132fa6f:	5b                   	pop    rbx
 132fa70:	e9 cb e4 4b 00       	jmp    17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 132fa75:	cc                   	int3
 132fa76:	48 8d 05 bb 61 53 00 	lea    rax,[rip+0x5361bb]        # 1865c38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22320>
 132fa7d:	48 89 07             	mov    QWORD PTR [rdi],rax
 132fa80:	e9 8b e5 4b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 132fa85:	cc                   	int3
 132fa86:	53                   	push   rbx
 132fa87:	48 89 fb             	mov    rbx,rdi
 132fa8a:	e8 e7 ff ff ff       	call   132fa76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174ffa>
 132fa8f:	48 89 df             	mov    rdi,rbx
 132fa92:	5b                   	pop    rbx
 132fa93:	e9 88 e4 4b 00       	jmp    17edf20 <_ZdlPv@plt>
 132fa98:	48 83 c7 18          	add    rdi,0x18
 132fa9c:	e9 3b 96 ff ff       	jmp    13290dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e660>
 132faa1:	cc                   	int3
--
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
