# AdsSetupImpl -> readiness source identity proof

Known: AdsSetupImpl base AP 0x180dcd8; +0x28 = a4b8e0 = return this+0x10.

## Embedded +0x10 constructor 0x14cd946

/tmp/asprove/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014cd900 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312e84>:
 14cd900:	19 49 89             	sbb    DWORD PTR [rcx-0x77],ecx
 14cd903:	c7                   	(bad)
 14cd904:	eb 14                	jmp    14cd91a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312e9e>
 14cd906:	49 89 c7             	mov    r15,rax
 14cd909:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 14cd90d:	4c 89 f7             	mov    rdi,r14
 14cd910:	e8 7b 05 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14cd915:	49 39 de             	cmp    r14,rbx
 14cd918:	75 ef                	jne    14cd909 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312e8d>
 14cd91a:	48 8d 3d 07 1f 52 00 	lea    rdi,[rip+0x521f07]        # 19ef828 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xf58>
 14cd921:	e8 da 0e 32 00       	call   17ee800 <__cxa_guard_abort@plt>
 14cd926:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14cd92d:	00 00 
 14cd92f:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
 14cd936:	00 
 14cd937:	75 08                	jne    14cd941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312ec5>
 14cd939:	4c 89 ff             	mov    rdi,r15
 14cd93c:	e8 8f 23 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 14cd941:	e8 6a 21 32 00       	call   17efab0 <__stack_chk_fail@plt>
 14cd946:	41 56                	push   r14
 14cd948:	53                   	push   rbx
 14cd949:	50                   	push   rax
 14cd94a:	48 89 fb             	mov    rbx,rdi
 14cd94d:	48 83 a7 50 01 00 00 	and    QWORD PTR [rdi+0x150],0x0
 14cd954:	00 
 14cd955:	4c 8d b7 60 01 00 00 	lea    r14,[rdi+0x160]
 14cd95c:	ba 30 01 00 00       	mov    edx,0x130
 14cd961:	31 f6                	xor    esi,esi
 14cd963:	e8 28 12 32 00       	call   17eeb90 <memset@plt>
 14cd968:	4c 89 f7             	mov    rdi,r14
 14cd96b:	e8 86 c0 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 14cd970:	48 83 a3 90 01 00 00 	and    QWORD PTR [rbx+0x190],0x0
 14cd977:	00 
 14cd978:	0f 57 c0             	xorps  xmm0,xmm0
 14cd97b:	0f 29 83 a0 01 00 00 	movaps XMMWORD PTR [rbx+0x1a0],xmm0
 14cd982:	0f 11 83 a9 01 00 00 	movups XMMWORD PTR [rbx+0x1a9],xmm0
 14cd989:	0f 29 83 c0 01 00 00 	movaps XMMWORD PTR [rbx+0x1c0],xmm0
 14cd990:	0f 29 83 d0 01 00 00 	movaps XMMWORD PTR [rbx+0x1d0],xmm0
 14cd997:	48 83 c4 08          	add    rsp,0x8
 14cd99b:	5b                   	pop    rbx
 14cd99c:	41 5e                	pop    r14
 14cd99e:	c3                   	ret
 14cd99f:	cc                   	int3
 14cd9a0:	53                   	push   rbx
 14cd9a1:	48 89 fb             	mov    rbx,rdi
 14cd9a4:	48 8b bf d8 01 00 00 	mov    rdi,QWORD PTR [rdi+0x1d8]
 14cd9ab:	e8 d6 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cd9b0:	48 8b bb c8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1c8]
 14cd9b7:	e8 ca 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cd9bc:	48 8d bb a0 01 00 00 	lea    rdi,[rbx+0x1a0]
 14cd9c3:	e8 c8 04 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14cd9c8:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
 14cd9cf:	e8 96 c5 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 14cd9d4:	48 8d bb 60 01 00 00 	lea    rdi,[rbx+0x160]
 14cd9db:	e8 f4 c1 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 14cd9e0:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
 14cd9e7:	e8 7e c5 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 14cd9ec:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
 14cd9f3:	e8 da 00 00 00       	call   14cdad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313056>
 14cd9f8:	48 8b bb 20 01 00 00 	mov    rdi,QWORD PTR [rbx+0x120]
 14cd9ff:	e8 82 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda04:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
 14cda0b:	e8 76 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda10:	48 8b bb 00 01 00 00 	mov    rdi,QWORD PTR [rbx+0x100]
 14cda17:	e8 6a 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda1c:	48 8b bb f0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xf0]
 14cda23:	e8 5e 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda28:	48 8b bb e0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe0]
 14cda2f:	e8 52 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda34:	48 8b bb d0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xd0]
 14cda3b:	e8 46 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda40:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
 14cda47:	e8 8e 00 00 00       	call   14cdada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31305e>
 14cda4c:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
 14cda53:	e8 8a 00 00 00       	call   14cdae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313066>
 14cda58:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
 14cda5f:	e8 86 00 00 00       	call   14cdaea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31306e>
 14cda64:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
 14cda6b:	e8 16 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda70:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
 14cda77:	e8 0a 0a 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda7c:	48 8b bb 88 00 00 00 	mov    rdi,QWORD PTR [rbx+0x88]
 14cda83:	e8 fe 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda88:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
 14cda8c:	e8 f5 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda91:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
 14cda95:	e8 ec 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cda9a:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
 14cda9e:	e8 e3 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdaa3:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
 14cdaa7:	e8 da 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdaac:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
 14cdab0:	e8 d1 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdab5:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 14cdab9:	e8 c8 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdabe:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 14cdac2:	e8 bf 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdac7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14cdacb:	5b                   	pop    rbx
 14cdacc:	e9 b5 09 5d ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdad1:	cc                   	int3
 14cdad2:	31 f6                	xor    esi,esi
 14cdad4:	e9 cd 00 00 00       	jmp    14cdba6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31312a>
 14cdad9:	cc                   	int3
 14cdada:	31 f6                	xor    esi,esi
 14cdadc:	e9 89 00 00 00       	jmp    14cdb6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130ee>
 14cdae1:	cc                   	int3
 14cdae2:	31 f6                	xor    esi,esi
 14cdae4:	e9 57 00 00 00       	jmp    14cdb40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130c4>
 14cdae9:	cc                   	int3
 14cdaea:	31 f6                	xor    esi,esi
 14cdaec:	e9 01 00 00 00       	jmp    14cdaf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313076>
 14cdaf1:	cc                   	int3
 14cdaf2:	53                   	push   rbx
 14cdaf3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 14cdaf6:	48 89 37             	mov    QWORD PTR [rdi],rsi
 14cdaf9:	48 85 db             	test   rbx,rbx
 14cdafc:	74 3f                	je     14cdb3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130c1>
 14cdafe:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 14cdb02:	e8 cd c0 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 14cdb07:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 14cdb0b:	e8 c4 c0 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 14cdb10:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 14cdb14:	e8 bb c0 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 14cdb19:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 14cdb1d:	e8 ec 9b 5e ff       	call   ab770e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46ae>
 14cdb22:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 14cdb26:	e8 5b 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdb2b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14cdb2f:	e8 52 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdb34:	48 89 df             	mov    rdi,rbx
 14cdb37:	5b                   	pop    rbx
 14cdb38:	e9 e3 03 32 00       	jmp    17edf20 <_ZdlPv@plt>
 14cdb3d:	5b                   	pop    rbx
 14cdb3e:	c3                   	ret
 14cdb3f:	cc                   	int3
 14cdb40:	53                   	push   rbx
 14cdb41:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 14cdb44:	48 89 37             	mov    QWORD PTR [rdi],rsi
 14cdb47:	48 85 db             	test   rbx,rbx
 14cdb4a:	74 1b                	je     14cdb67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130eb>
 14cdb4c:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 14cdb50:	e8 b9 9b 5e ff       	call   ab770e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46ae>
 14cdb55:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14cdb59:	e8 28 09 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdb5e:	48 89 df             	mov    rdi,rbx
 14cdb61:	5b                   	pop    rbx
 14cdb62:	e9 b9 03 32 00       	jmp    17edf20 <_ZdlPv@plt>
 14cdb67:	5b                   	pop    rbx
 14cdb68:	c3                   	ret
 14cdb69:	cc                   	int3
 14cdb6a:	53                   	push   rbx
 14cdb6b:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 14cdb6e:	48 89 37             	mov    QWORD PTR [rdi],rsi
 14cdb71:	48 85 db             	test   rbx,rbx
 14cdb74:	74 2d                	je     14cdba3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313127>
 14cdb76:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 14cdb7a:	e8 11 03 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14cdb7f:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 14cdb83:	e8 86 9b 5e ff       	call   ab770e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46ae>
 14cdb88:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 14cdb8c:	e8 f5 08 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdb91:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14cdb95:	e8 ec 08 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdb9a:	48 89 df             	mov    rdi,rbx
 14cdb9d:	5b                   	pop    rbx
 14cdb9e:	e9 7d 03 32 00       	jmp    17edf20 <_ZdlPv@plt>
 14cdba3:	5b                   	pop    rbx
 14cdba4:	c3                   	ret
 14cdba5:	cc                   	int3
 14cdba6:	53                   	push   rbx
 14cdba7:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 14cdbaa:	48 89 37             	mov    QWORD PTR [rdi],rsi
 14cdbad:	48 85 db             	test   rbx,rbx
 14cdbb0:	74 24                	je     14cdbd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31315a>
 14cdbb2:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 14cdbb6:	e8 19 c0 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 14cdbbb:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 14cdbbf:	e8 10 c0 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 14cdbc4:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 14cdbc8:	e8 0b 00 00 00       	call   14cdbd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31315c>
 14cdbcd:	48 89 df             	mov    rdi,rbx
 14cdbd0:	5b                   	pop    rbx
 14cdbd1:	e9 4a 03 32 00       	jmp    17edf20 <_ZdlPv@plt>
 14cdbd6:	5b                   	pop    rbx
 14cdbd7:	c3                   	ret
 14cdbd8:	48 83 7f 10 00       	cmp    QWORD PTR [rdi+0x10],0x0
 14cdbdd:	74 49                	je     14cdc28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3131ac>
 14cdbdf:	41 57                	push   r15
 14cdbe1:	41 56                	push   r14
 14cdbe3:	53                   	push   rbx
 14cdbe4:	48 89 fb             	mov    rbx,rdi
 14cdbe7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14cdbea:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
 14cdbee:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 14cdbf2:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 14cdbf5:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
 14cdbf9:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 14cdbfc:	48 89 08             	mov    QWORD PTR [rax],rcx
 14cdbff:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 14cdc04:	49 39 de             	cmp    r14,rbx
 14cdc07:	74 1a                	je     14cdc23 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3131a7>
 14cdc09:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
 14cdc0d:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
 14cdc11:	e8 70 08 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cdc16:	4c 89 f7             	mov    rdi,r14
 14cdc19:	e8 02 03 32 00       	call   17edf20 <_ZdlPv@plt>
 14cdc1e:	4d 89 fe             	mov    r14,r15
 14cdc21:	eb e1                	jmp    14cdc04 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313188>
 14cdc23:	5b                   	pop    rbx
 14cdc24:	41 5e                	pop    r14
 14cdc26:	41 5f                	pop    r15
 14cdc28:	c3                   	ret
 14cdc29:	cc                   	int3
 14cdc2a:	55                   	push   rbp
 14cdc2b:	41 57                	push   r15
 14cdc2d:	41 56                	push   r14
 14cdc2f:	41 55                	push   r13
 14cdc31:	41 54                	push   r12
 14cdc33:	53                   	push   rbx
 14cdc34:	48 81 ec e8 03 00 00 	sub    rsp,0x3e8
 14cdc3b:	49 89 f5             	mov    r13,rsi
 14cdc3e:	49 89 fe             	mov    r14,rdi
 14cdc41:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14cdc48:	00 00 
 14cdc4a:	48 89 84 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rax
 14cdc51:	00 
 14cdc52:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
 14cdc56:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cdc59:	48 8d 35 48 a6 f6 fe 	lea    rsi,[rip+0xfffffffffef6a648]        # 4382a8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dcf7>
 14cdc60:	48 8d 0d 59 a6 f6 fe 	lea    rcx,[rip+0xfffffffffef6a659]        # 4382c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd0f>
 14cdc67:	6a 08                	push   0x8
 14cdc69:	41 5f                	pop    r15
 14cdc6b:	6a 19                	push   0x19
 14cdc6d:	5b                   	pop    rbx
 14cdc6e:	6a 01                	push   0x1
 14cdc70:	41 59                	pop    r9
 14cdc72:	4c 89 fa             	mov    rdx,r15
 14cdc75:	49 89 d8             	mov    r8,rbx
 14cdc78:	e8 e1 98 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 14cdc7d:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
 14cdc81:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cdc84:	48 8d 35 4f a6 f6 fe 	lea    rsi,[rip+0xfffffffffef6a64f]        # 4382da <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd29>
 14cdc8b:	48 8d 0d 5e a6 f6 fe 	lea    rcx,[rip+0xfffffffffef6a65e]        # 4382f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd3f>
 14cdc92:	6a 15                	push   0x15
 14cdc94:	41 5c                	pop    r12
 14cdc96:	4c 89 fa             	mov    rdx,r15
 14cdc99:	4d 89 e0             	mov    r8,r12
 14cdc9c:	45 31 c9             	xor    r9d,r9d
 14cdc9f:	e8 ba 98 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 14cdca4:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
 14cdca8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cdcab:	48 8d 35 54 a6 f6 fe 	lea    rsi,[rip+0xfffffffffef6a654]        # 438306 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd55>
 14cdcb2:	48 8d 0d 57 a6 f6 fe 	lea    rcx,[rip+0xfffffffffef6a657]        # 438310 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd5f>
 14cdcb9:	4c 89 fa             	mov    rdx,r15
 14cdcbc:	49 89 d8             	mov    r8,rbx
 14cdcbf:	45 31 c9             	xor    r9d,r9d
 14cdcc2:	e8 97 98 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 14cdcc7:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
 14cdccb:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cdcce:	48 8d 35 55 a6 f6 fe 	lea    rsi,[rip+0xfffffffffef6a655]        # 43832a <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd79>
 14cdcd5:	48 8d 0d 64 a6 f6 fe 	lea    rcx,[rip+0xfffffffffef6a664]        # 438340 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd8f>
 14cdcdc:	6a 1a                	push   0x1a
 14cdcde:	41 58                	pop    r8
 14cdce0:	4c 89 fa             	mov    rdx,r15
 14cdce3:	45 31 c9             	xor    r9d,r9d
 14cdce6:	e8 73 98 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 14cdceb:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
 14cdcef:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cdcf2:	48 8d 35 62 a6 f6 fe 	lea    rsi,[rip+0xfffffffffef6a662]        # 43835b <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ddaa>
 14cdcf9:	48 8d 0d 70 a6 f6 fe 	lea    rcx,[rip+0xfffffffffef6a670]        # 438370 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ddbf>
 14cdd00:	6a 1b                	push   0x1b
 14cdd02:	41 58                	pop    r8
 14cdd04:	4c 89 fa             	mov    rdx,r15
 14cdd07:	45 31 c9             	xor    r9d,r9d
 14cdd0a:	e8 4f 98 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 14cdd0f:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
 14cdd13:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cdd16:	48 8d 35 6f a6 f6 fe 	lea    rsi,[rip+0xfffffffffef6a66f]        # 43838c <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dddb>
 14cdd1d:	48 8d 0d 7c a6 f6 fe 	lea    rcx,[rip+0xfffffffffef6a67c]        # 4383a0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ddef>
 14cdd24:	6a 11                	push   0x11
 14cdd26:	41 58                	pop    r8
 14cdd28:	4c 89 fa             	mov    rdx,r15
 14cdd2b:	45 31 c9             	xor    r9d,r9d
 14cdd2e:	e8 2b 98 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 14cdd33:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
 14cdd37:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cdd3a:	48 8d 35 71 a6 f6 fe 	lea    rsi,[rip+0xfffffffffef6a671]        # 4383b2 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de01>
 14cdd41:	48 8d 0d 73 a6 f6 fe 	lea    rcx,[rip+0xfffffffffef6a673]        # 4383bb <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de0a>
 14cdd48:	6a 0d                	push   0xd
 14cdd4a:	41 58                	pop    r8
 14cdd4c:	4c 89 fa             	mov    rdx,r15
 14cdd4f:	45 31 c9             	xor    r9d,r9d
 14cdd52:	e8 07 98 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 14cdd57:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
 14cdd5b:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cdd5e:	48 8d 35 64 a6 f6 fe 	lea    rsi,[rip+0xfffffffffef6a664]        # 4383c9 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de18>
 14cdd65:	48 8d 0d 74 a6 f6 fe 	lea    rcx,[rip+0xfffffffffef6a674]        # 4383e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de2f>
 14cdd6c:	4c 89 fa             	mov    rdx,r15
 14cdd6f:	49 89 d8             	mov    r8,rbx
 14cdd72:	45 31 c9             	xor    r9d,r9d
 14cdd75:	e8 e4 97 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 14cdd7a:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
 14cdd7e:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cdd81:	48 8d 35 72 a6 f6 fe 	lea    rsi,[rip+0xfffffffffef6a672]        # 4383fa <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de49>
 14cdd88:	48 8d 0d 81 a6 f6 fe 	lea    rcx,[rip+0xfffffffffef6a681]        # 438410 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de5f>
 14cdd8f:	6a 1e                	push   0x1e
 14cdd91:	41 58                	pop    r8
 14cdd93:	4c 89 fa             	mov    rdx,r15
 14cdd96:	45 31 c9             	xor    r9d,r9d
 14cdd99:	e8 c0 97 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 14cdd9e:	49                   	rex.WB
 14cdd9f:	8b                   	.byte 0x8b

## AP 0x1879950 full relocation slice through +0x170
0000000001879950  0000000000000008 R_X86_64_RELATIVE                         1455804
0000000001879958  0000000000000008 R_X86_64_RELATIVE                         14e16e6
0000000001879960  0000000000000008 R_X86_64_RELATIVE                         a10ec0
0000000001879968  0000000000000008 R_X86_64_RELATIVE                         14e16f8
0000000001879970  0000000000000008 R_X86_64_RELATIVE                         14e1702
0000000001879978  0000000000000008 R_X86_64_RELATIVE                         14e194e
0000000001879980  0000000000000008 R_X86_64_RELATIVE                         14e19e8
0000000001879988  0000000000000008 R_X86_64_RELATIVE                         14e1a82
0000000001879990  0000000000000008 R_X86_64_RELATIVE                         14e1a98
0000000001879998  0000000000000008 R_X86_64_RELATIVE                         14e1d2c
00000000018799a0  0000000000000008 R_X86_64_RELATIVE                         14e1d38
00000000018799a8  0000000000000008 R_X86_64_RELATIVE                         14e1d4a
00000000018799b0  0000000000000008 R_X86_64_RELATIVE                         14e1d5c
00000000018799b8  0000000000000008 R_X86_64_RELATIVE                         14e1d9c
00000000018799c0  0000000000000008 R_X86_64_RELATIVE                         14e1f16
00000000018799c8  0000000000000008 R_X86_64_RELATIVE                         14e1f2e
00000000018799d0  0000000000000008 R_X86_64_RELATIVE                         14e1fc8
00000000018799d8  0000000000000008 R_X86_64_RELATIVE                         14e2040
00000000018799e0  0000000000000008 R_X86_64_RELATIVE                         14e20da
00000000018799e8  0000000000000008 R_X86_64_RELATIVE                         14e2174
00000000018799f0  0000000000000008 R_X86_64_RELATIVE                         14e21b4
00000000018799f8  0000000000000008 R_X86_64_RELATIVE                         14e226a
0000000001879a00  0000000000000008 R_X86_64_RELATIVE                         14e22a4
0000000001879a08  0000000000000008 R_X86_64_RELATIVE                         14e233e
0000000001879a10  0000000000000008 R_X86_64_RELATIVE                         14e23d8
0000000001879a18  0000000000000008 R_X86_64_RELATIVE                         14e2472
0000000001879a20  0000000000000008 R_X86_64_RELATIVE                         14e248a
0000000001879a28  0000000000000008 R_X86_64_RELATIVE                         14e24b8
0000000001879a30  0000000000000008 R_X86_64_RELATIVE                         14e24d0
0000000001879a38  0000000000000008 R_X86_64_RELATIVE                         14e24e8
0000000001879a40  0000000000000008 R_X86_64_RELATIVE                         14e25d0
0000000001879a58  0000000000000008 R_X86_64_RELATIVE                         14e40ca
0000000001879a60  0000000000000008 R_X86_64_RELATIVE                         14e41c2
0000000001879a68  0000000000000008 R_X86_64_RELATIVE                         14e41d4
0000000001879a70  0000000000000008 R_X86_64_RELATIVE                         14e42b0
0000000001879a78  0000000000000008 R_X86_64_RELATIVE                         14e431c
0000000001879a80  0000000000000008 R_X86_64_RELATIVE                         14e4b28
0000000001879a88  0000000000000008 R_X86_64_RELATIVE                         14e4c40
0000000001879a90  0000000000000008 R_X86_64_RELATIVE                         125bd98
0000000001879a98  0000000000000008 R_X86_64_RELATIVE                         14e4c4e
0000000001879aa0  0000000000000008 R_X86_64_RELATIVE                         14e4cbe
0000000001879aa8  0000000000000008 R_X86_64_RELATIVE                         14e4cea
0000000001879ab0  0000000000000008 R_X86_64_RELATIVE                         14e4cfc
0000000001879ab8  0000000000000008 R_X86_64_RELATIVE                         14e4e5c
0000000001879ac0  0000000000000008 R_X86_64_RELATIVE                         14e4eba
0000000001879ac8  0000000000000008 R_X86_64_RELATIVE                         14e4f7e
0000000001879ad0  0000000000000008 R_X86_64_RELATIVE                         14e5000

## Exact target at AP+0x140 (slot VA 0x1879a90)
target=125bd98

/tmp/asprove/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000125bd78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa12fc>:
 125bd78:	c3                   	ret
 125bd79:	cc                   	int3
 125bd7a:	53                   	push   rbx
 125bd7b:	48 89 fb             	mov    rbx,rdi
 125bd7e:	48 8b 76 18          	mov    rsi,QWORD PTR [rsi+0x18]
 125bd82:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 125bd85:	ff 50 30             	call   QWORD PTR [rax+0x30]
 125bd88:	48 89 d8             	mov    rax,rbx
 125bd8b:	5b                   	pop    rbx
 125bd8c:	c3                   	ret
 125bd8d:	cc                   	int3
 125bd8e:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 125bd92:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 125bd95:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
 125bd98:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 125bd9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 125bd9f:	ff 60 40             	jmp    QWORD PTR [rax+0x40]
 125bda2:	41 57                	push   r15
 125bda4:	41 56                	push   r14
 125bda6:	41 55                	push   r13
 125bda8:	41 54                	push   r12
 125bdaa:	53                   	push   rbx
 125bdab:	48 81 ec 90 00 00 00 	sub    rsp,0x90
 125bdb2:	49 89 f6             	mov    r14,rsi
 125bdb5:	48 89 fb             	mov    rbx,rdi
 125bdb8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 125bdbf:	00 00 
 125bdc1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 125bdc8:	00 
 125bdc9:	48 8b 77 18          	mov    rsi,QWORD PTR [rdi+0x18]
 125bdcd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 125bdd0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 125bdd5:	4c 89 ff             	mov    rdi,r15
 125bdd8:	ff 50 28             	call   QWORD PTR [rax+0x28]
 125bddb:	4c 89 f7             	mov    rdi,r14
 125bdde:	4c 89 fe             	mov    rsi,r15
 125bde1:	e8 48 fc 81 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 125bde6:	4c 89 ff             	mov    rdi,r15
 125bde9:	e8 a2 20 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 125bdee:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
 125bdf2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 125bdf5:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 125bdfa:	4c 89 ff             	mov    rdi,r15
 125bdfd:	ff 50 30             	call   QWORD PTR [rax+0x30]
 125be00:	41 80 7f 18 00       	cmp    BYTE PTR [r15+0x18],0x0
 125be05:	74 0e                	je     125be15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1399>
 125be07:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 125be0b:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 125be10:	e8 6b 22 59 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 125be15:	4c                   	rex.WR
 125be16:	8d                   	.byte 0x8d
 125be17:	7c                   	.byte 0x7c

## AdsSetupImpl constructor fields around capability/timer region
  b86790:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  b86797:	00 
  b86798:	66 41 0f 7f 86 20 03 	movdqa XMMWORD PTR [r14+0x320],xmm0
  b8679f:	00 00 
  b867a1:	66 41 0f 7f 86 30 03 	movdqa XMMWORD PTR [r14+0x330],xmm0
  b867a8:	00 00 
  b867aa:	66 41 0f 7f 86 40 03 	movdqa XMMWORD PTR [r14+0x340],xmm0
  b867b1:	00 00 
  b867b3:	66 41 0f 7f 86 50 03 	movdqa XMMWORD PTR [r14+0x350],xmm0
  b867ba:	00 00 
  b867bc:	49 83 a6 60 03 00 00 	and    QWORD PTR [r14+0x360],0x0
  b867c3:	00 
  b867c4:	48 8d bc 24 38 04 00 	lea    rdi,[rsp+0x438]
  b867cb:	00 
  b867cc:	e8 68 bd b1 00       	call   16a2539 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x566a5>
  b867d1:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
  b867d6:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  b867da:	83 24 24 00          	and    DWORD PTR [rsp],0x0
  b867de:	c7 44 24 08 10 27 00 	mov    DWORD PTR [rsp+0x8],0x2710
  b867e5:	00 
  b867e6:	48 8d 35 9a 95 81 ff 	lea    rsi,[rip+0xffffffffff81959a]        # 39fd87 <_ZTSN5boost9exceptionE@@Base+0x769>
  b867ed:	48 8d 0d 9c 95 81 ff 	lea    rcx,[rip+0xffffffffff81959c]        # 39fd90 <_ZTSN5boost9exceptionE@@Base+0x772>
  b867f4:	6a 08                	push   0x8
--
  b86b38:	4c 89 ff             	mov    rdi,r15
  b86b3b:	48 83 c7 28          	add    rdi,0x28
  b86b3f:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
  b86b45:	48 8d b4 24 d0 04 00 	lea    rsi,[rsp+0x4d0]
  b86b4c:	00 
  b86b4d:	e8 ac 15 00 00       	call   b880fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd509e>
  b86b52:	49 83 67 48 00       	and    QWORD PTR [r15+0x48],0x0
  b86b57:	49 83 67 58 00       	and    QWORD PTR [r15+0x58],0x0
  b86b5c:	49 89 9e 48 03 00 00 	mov    QWORD PTR [r14+0x348],rbx
  b86b63:	49 8b be 50 03 00 00 	mov    rdi,QWORD PTR [r14+0x350]
  b86b6a:	4d 89 be 50 03 00 00 	mov    QWORD PTR [r14+0x350],r15
  b86b71:	e8 10 79 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b86b76:	31 ff                	xor    edi,edi
  b86b78:	e8 09 79 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b86b7d:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
  b86b84:	00 
  b86b85:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b86b88:	ff 50 28             	call   QWORD PTR [rax+0x28]
  b86b8b:	49 89 c4             	mov    r12,rax
  b86b8e:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
  b86b95:	00 
  b86b96:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b86b99:	ff 50 30             	call   QWORD PTR [rax+0x30]
  b86b9c:	49 89 c5             	mov    r13,rax
  b86b9f:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
--
  b86c8f:	00 
  b86c90:	48 89 df             	mov    rdi,rbx
  b86c93:	e8 0e 2c a6 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
  b86c98:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
  b86c9d:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  b86ca1:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
  b86ca8:	00 
  b86ca9:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  b86cad:	49 8b 86 50 03 00 00 	mov    rax,QWORD PTR [r14+0x350]
  b86cb4:	f3 41 0f 6f 86 48 03 	movdqu xmm0,XMMWORD PTR [r14+0x348]
  b86cbb:	00 00 
  b86cbd:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
  b86cc2:	48 85 c0             	test   rax,rax
  b86cc5:	74 05                	je     b86ccc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3c6c>
  b86cc7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  b86ccc:	48 8d 9c 24 88 03 00 	lea    rbx,[rsp+0x388]
  b86cd3:	00 
  b86cd4:	4c 89 63 f0          	mov    QWORD PTR [rbx-0x10],r12
  b86cd8:	4c 89 6b f8          	mov    QWORD PTR [rbx-0x8],r13
  b86cdc:	48 89 df             	mov    rdi,rbx
  b86cdf:	48 8b b4 24 b0 00 00 	mov    rsi,QWORD PTR [rsp+0xb0]
  b86ce6:	00 
  b86ce7:	e8 54 72 c6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  b86cec:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
--
  b86fed:	48 89 de             	mov    rsi,rbx
  b86ff0:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b86ff3:	bb 70 01 00 00       	mov    ebx,0x170
  b86ff8:	49 8d 3c 1e          	lea    rdi,[r14+rbx*1]
  b86ffc:	48 8d b4 24 d0 07 00 	lea    rsi,[rsp+0x7d0]
  b87003:	00 
  b87004:	e8 e9 2b c5 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
  b87009:	4d 8d be 80 01 00 00 	lea    r15,[r14+0x180]
  b87010:	49 8b be a0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1a0]
  b87017:	49 83 a6 a0 01 00 00 	and    QWORD PTR [r14+0x1a0],0x0
  b8701e:	00 
  b8701f:	4c 39 ff             	cmp    rdi,r15
  b87022:	74 0a                	je     b8702e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3fce>
  b87024:	48 85 ff             	test   rdi,rdi
  b87027:	74 11                	je     b8703a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3fda>
  b87029:	6a 05                	push   0x5
  b8702b:	58                   	pop    rax
  b8702c:	eb 06                	jmp    b87034 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3fd4>
  b8702e:	6a 04                	push   0x4
  b87030:	58                   	pop    rax
  b87031:	4c 89 ff             	mov    rdi,r15
  b87034:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  b87037:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
  b8703a:	49 8d 86 a0 01 00 00 	lea    rax,[r14+0x1a0]
  b87041:	48 8b 8c 24 00 08 00 	mov    rcx,QWORD PTR [rsp+0x800]
  b87048:	00 
  b87049:	48 85 c9             	test   rcx,rcx
  b8704c:	74 13                	je     b87061 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4001>
  b8704e:	48 01 dd             	add    rbp,rbx
  b87051:	48 39 e9             	cmp    rcx,rbp
  b87054:	74 11                	je     b87067 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4007>
  b87056:	48 89 08             	mov    QWORD PTR [rax],rcx
  b87059:	48 8d 84 24 00 08 00 	lea    rax,[rsp+0x800]
  b87060:	00 
  b87061:	48 83 20 00          	and    QWORD PTR [rax],0x0
  b87065:	eb 14                	jmp    b8707b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd401b>
  b87067:	4c 89 38             	mov    QWORD PTR [rax],r15
  b8706a:	48 8b 84 24 e0 07 00 	mov    rax,QWORD PTR [rsp+0x7e0]
  b87071:	00 
  b87072:	48 89 ef             	mov    rdi,rbp
  b87075:	4c 89 fe             	mov    rsi,r15
  b87078:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b8707b:	49 8d be b0 01 00 00 	lea    rdi,[r14+0x1b0]
  b87082:	48 8d 9c 24 10 08 00 	lea    rbx,[rsp+0x810]
  b87089:	00 
  b8708a:	48 89 de             	mov    rsi,rbx
  b8708d:	e8 9c 49 ef ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
  b87092:	8a 43 18             	mov    al,BYTE PTR [rbx+0x18]
  b87095:	41 88 86 c8 01 00 00 	mov    BYTE PTR [r14+0x1c8],al
  b8709c:	4c 89 f7             	mov    rdi,r14
  b8709f:	48 81 c7 d0 01 00 00 	add    rdi,0x1d0
  b870a6:	48 8d 9c 24 30 08 00 	lea    rbx,[rsp+0x830]
  b870ad:	00 
  b870ae:	48 89 de             	mov    rsi,rbx
  b870b1:	e8 66 27 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  b870b6:	0f 28 43 10          	movaps xmm0,XMMWORD PTR [rbx+0x10]
  b870ba:	66 0f ef c9          	pxor   xmm1,xmm1
  b870be:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1
  b870c3:	49 8b be e8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1e8]
  b870ca:	41 0f 11 86 e0 01 00 	movups XMMWORD PTR [r14+0x1e0],xmm0
  b870d1:	00 
  b870d2:	e8 af 73 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b870d7:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]

## Global exact accesses near AdsSetup family
  b898b9:	41 5e                	pop    r14
  b898bb:	41 5f                	pop    r15
  b898bd:	c3                   	ret
  b898be:	48 89 c3             	mov    rbx,rax
  b898c1:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
  b898c6:	eb 2e                	jmp    b898f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6896>
  b898c8:	eb 33                	jmp    b898fd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd689d>
  b898ca:	48 89 c3             	mov    rbx,rax
  b898cd:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
  b898d4:	00 
  b898d5:	e8 ac 4b f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b898da:	eb 03                	jmp    b898df <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd687f>
  b898dc:	48 89 c3             	mov    rbx,rax
  b898df:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  b898e4:	e8 81 06 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b898e9:	eb 3b                	jmp    b89926 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd68c6>
  b898eb:	48 89 c3             	mov    rbx,rax
  b898ee:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
  b898f5:	00 
  b898f6:	e8 8b 4b f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b898fb:	eb 03                	jmp    b89900 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd68a0>
  b898fd:	48 89 c3             	mov    rbx,rax
  b89900:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  b89905:	e8 de 0e c5 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  b8990a:	eb 1a                	jmp    b89926 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd68c6>
  b8990c:	48 89 c3             	mov    rbx,rax
  b8990f:	48 89 e7             	mov    rdi,rsp
  b89912:	e8 1f 04 00 00       	call   b89d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6cd6>
  b89917:	eb 03                	jmp    b8991c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd68bc>
  b89919:	48 89 c3             	mov    rbx,rax
  b8991c:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  b89921:	e8 c0 07 00 00       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
--
  b8ac2e:	48 8d 05 db 33 c8 00 	lea    rax,[rip+0xc833db]        # 180e010 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3cd0>
  b8ac35:	48 89 07             	mov    QWORD PTR [rdi],rax
  b8ac38:	48 81 c7 d0 02 00 00 	add    rdi,0x2d0
  b8ac3f:	e8 22 f2 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac44:	48 8d bb 78 02 00 00 	lea    rdi,[rbx+0x278]
  b8ac4b:	e8 16 f2 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac50:	48 8d bb 20 02 00 00 	lea    rdi,[rbx+0x220]
  b8ac57:	e8 0a f2 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac5c:	48 8d bb c8 01 00 00 	lea    rdi,[rbx+0x1c8]
  b8ac63:	e8 fe f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac68:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
  b8ac6f:	e8 f2 f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac74:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
  b8ac7b:	e8 e6 f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac80:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
  b8ac87:	e8 da f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac8c:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
  b8ac90:	e8 d1 f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac95:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
  b8ac99:	e8 ce ef ff ff       	call   b89c6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c0c>
  b8ac9e:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
  b8aca2:	e8 2d ef c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b8aca7:	48 8d 7b 30          	lea    rdi,[rbx+0x30]

## All code refs to AP 0x1879950
 14557cd:	cc                   	int3
 14557ce:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
 14557d2:	48 8d 05 c7 e5 41 00 	lea    rax,[rip+0x41e5c7]        # 1873da0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30488>
 14557d9:	48 89 07             	mov    QWORD PTR [rdi],rax
 14557dc:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 14557e1:	48 8d 05 10 a0 fe fe 	lea    rax,[rip+0xfffffffffefea010]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 14557e8:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
 14557ec:	83 67 40 00          	and    DWORD PTR [rdi+0x40],0x0
 14557f0:	83 67 30 00          	and    DWORD PTR [rdi+0x30],0x0
 14557f4:	0f 57 c0             	xorps  xmm0,xmm0
 14557f7:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
 14557fb:	48 89 d6             	mov    rsi,rdx
 14557fe:	e9 f5 fe ff ff       	jmp    14556f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ac7c>
 1455803:	cc                   	int3
 1455804:	41 56                	push   r14
 1455806:	53                   	push   rbx
 1455807:	50                   	push   rax
 1455808:	48 89 fb             	mov    rbx,rdi
 145580b:	48 8d 05 3e 41 42 00 	lea    rax,[rip+0x42413e]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
 1455812:	48 89 07             	mov    QWORD PTR [rdi],rax
 1455815:	48 81 c7 90 01 00 00 	add    rdi,0x190
 145581c:	e8 45 ce 68 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 1455821:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
 1455828:	e8 63 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 145582d:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
 1455834:	e8 57 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1455839:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
 1455840:	e8 4b 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1455845:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
 145584c:	e8 3f 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1455851:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
 1455858:	e8 8d 5a 6a ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
 145585d:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
 1455864:	e8 27 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1455869:	48 83 bb c8 00 00 00 	cmp    QWORD PTR [rbx+0xc8],0x0
 1455870:	00 
 1455871:	74 17                	je     145588a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ae0e>
 1455873:	4c 8d b3 c8 00 00 00 	lea    r14,[rbx+0xc8]
 145587a:	4c 89 f7             	mov    rdi,r14
 145587d:	e8 a8 00 00 00       	call   145592a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29aeae>
 1455882:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 1455885:	e8 96 86 39 00       	call   17edf20 <_ZdlPv@plt>
 145588a:	48 83 bb b0 00 00 00 	cmp    QWORD PTR [rbx+0xb0],0x0
 1455891:	00 
 1455892:	74 17                	je     14558ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ae2f>
 1455894:	4c 8d b3 b0 00 00 00 	lea    r14,[rbx+0xb0]
 145589b:	4c 89 f7             	mov    rdi,r14
 145589e:	e8 4f 00 00 00       	call   14558f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ae76>
 14558a3:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 14558a6:	e8 75 86 39 00       	call   17edf20 <_ZdlPv@plt>
 14558ab:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
 14558b2:	e8 d5 58 fe ff       	call   143b18c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280710>
 14558b7:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
 14558be:	e8 c9 58 fe ff       	call   143b18c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280710>
 14558c3:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
 14558c7:	e8 c0 58 fe ff       	call   143b18c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280710>
 14558cc:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
--
 14e15ca:	c3                   	ret
 14e15cb:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 14e15ce:	48 8d 35 eb ba f5 fe 	lea    rsi,[rip+0xfffffffffef5baeb]        # 43d0c0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2ccc>
 14e15d5:	48 83 c4 08          	add    rsp,0x8
 14e15d9:	5b                   	pop    rbx
 14e15da:	41 5e                	pop    r14
 14e15dc:	41 5f                	pop    r15
 14e15de:	5d                   	pop    rbp
 14e15df:	e9 3a a3 18 00       	jmp    166b91e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa8a>
 14e15e4:	55                   	push   rbp
 14e15e5:	41 57                	push   r15
 14e15e7:	41 56                	push   r14
 14e15e9:	53                   	push   rbx
 14e15ea:	48 83 ec 48          	sub    rsp,0x48
 14e15ee:	48 89 fb             	mov    rbx,rdi
 14e15f1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14e15f8:	00 00 
 14e15fa:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 14e15ff:	48 8d 05 4a 83 39 00 	lea    rax,[rip+0x39834a]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
 14e1606:	48 89 07             	mov    QWORD PTR [rdi],rax
 14e1609:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 14e160d:	48 89 f7             	mov    rdi,rsi
 14e1610:	e8 a7 11 00 00       	call   14e27bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d40>
 14e1615:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 14e161a:	48 89 06             	mov    QWORD PTR [rsi],rax
 14e161d:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 14e1621:	4c 8d 7c 24 1f       	lea    r15,[rsp+0x1f]
 14e1626:	4c 89 ff             	mov    rdi,r15
 14e1629:	e8 f2 2c 6b ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
 14e162e:	4c 89 f7             	mov    rdi,r14
 14e1631:	4c 89 fe             	mov    rsi,r15
 14e1634:	e8 af 2d e7 ff       	call   13543e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19996c>
 14e1639:	0f 57 c0             	xorps  xmm0,xmm0
 14e163c:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
 14e1640:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 14e1644:	bd 00 00 80 3f       	mov    ebp,0x3f800000
 14e1649:	89 6b 40             	mov    DWORD PTR [rbx+0x40],ebp
 14e164c:	45 31 f6             	xor    r14d,r14d
 14e164f:	44 88 73 48          	mov    BYTE PTR [rbx+0x48],r14b
 14e1653:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
 14e1657:	0f 11 83 00 01 00 00 	movups XMMWORD PTR [rbx+0x100],xmm0
 14e165e:	0f 11 83 10 01 00 00 	movups XMMWORD PTR [rbx+0x110],xmm0
 14e1665:	ba a9 00 00 00       	mov    edx,0xa9
 14e166a:	31 f6                	xor    esi,esi
 14e166c:	e8 1f d5 30 00       	call   17eeb90 <memset@plt>
 14e1671:	89 ab 20 01 00 00    	mov    DWORD PTR [rbx+0x120],ebp
 14e1677:	0f 57 c0             	xorps  xmm0,xmm0
 14e167a:	0f 11 83 90 01 00 00 	movups XMMWORD PTR [rbx+0x190],xmm0
 14e1681:	0f 11 83 a0 01 00 00 	movups XMMWORD PTR [rbx+0x1a0],xmm0
 14e1688:	0f 11 83 28 01 00 00 	movups XMMWORD PTR [rbx+0x128],xmm0
 14e168f:	0f 11 83 38 01 00 00 	movups XMMWORD PTR [rbx+0x138],xmm0
 14e1696:	0f 11 83 48 01 00 00 	movups XMMWORD PTR [rbx+0x148],xmm0
 14e169d:	0f 11 83 58 01 00 00 	movups XMMWORD PTR [rbx+0x158],xmm0
 14e16a4:	0f 11 83 68 01 00 00 	movups XMMWORD PTR [rbx+0x168],xmm0
 14e16ab:	0f 11 83 78 01 00 00 	movups XMMWORD PTR [rbx+0x178],xmm0
 14e16b2:	83 a3 88 01 00 00 00 	and    DWORD PTR [rbx+0x188],0x0
 14e16b9:	89 ab b0 01 00 00    	mov    DWORD PTR [rbx+0x1b0],ebp
