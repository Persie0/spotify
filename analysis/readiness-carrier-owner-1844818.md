# Readiness carrier owner AP 0x1844818

Proven construction: 0xe94e4c allocates 0x150 bytes; AP 0x1844818 stored at [object]; e94f6d stores the small readiness carrier base at object+0x140.

## Vtable relocation slice
- +0x0: 0x1007f4c
- +0x8: 0x1007f5c
- +0x10: 0x1007f6e
- +0x20: 0xa50370
- +0x38: 0x1007f78
- +0x40: 0x1008502
- +0x48: 0x1008514
- +0x50: 0x10088b4
- +0x58: 0x1008950
- +0x60: 0x10089d0
- +0x78: 0x9d7de0
- +0x80: 0xa50370
- +0x88: 0x1008444
- +0x90: 0x1008464
- +0x98: 0x9d7de0
- +0xa0: 0xa50370
- +0xa8: 0x1008478
- +0xc0: 0x9d7de0
- +0xc8: 0xa50370
- +0xd0: 0x1007fda
- +0xd8: 0x1007ffa
- +0xe0: 0x9d7de0
- +0xe8: 0xa50370
- +0xf0: 0x100800e
- +0x108: 0x1008ef8
- +0x110: 0x1008f0c
- +0x118: 0x1008f1e
- +0x120: 0x1008f54
- +0x128: 0xaae9b2
- +0x130: 0xaae9bc
- +0x138: 0x1008f82
- +0x150: 0x1009c9e
- +0x158: 0xcc1cfa
- +0x160: 0x1009cb0
- +0x168: 0x1009ce4
- +0x170: 0x1009cf6
- +0x178: 0x100a050

## Method bodies that reference +0x140
## All direct code refs/materializations of AP 0x1844818
### 0xe94e58: lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e17:	e8 33 6a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e94e1c:	44 0f b6 e0          	movzx  r12d,al
      e94e20:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94e27:	00 
      e94e28:	4c 89 f7             	mov    rdi,r14
      e94e2b:	e8 00 1f c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e94e30:	31 ed                	xor    ebp,ebp
      e94e32:	41 83 fc 01          	cmp    r12d,0x1
      e94e36:	40 0f 94 c5          	sete   bpl
      e94e3a:	41 83 fc 02          	cmp    r12d,0x2
      e94e3e:	41 0f 44 ec          	cmove  ebp,r12d
      e94e42:	bf 50 01 00 00       	mov    edi,0x150
      e94e47:	e8 b4 90 95 00       	call   17edf00 <_Znwm@plt>
      e94e4c:	49 89 c4             	mov    r12,rax
      e94e4f:	66 0f ef c0          	pxor   xmm0,xmm0
      e94e53:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94e58:	48 8d 05 b9 f9 9a 00 	lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e5f:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
      e94e6a:	00 
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94e8e:	00 f0 3f 
      e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      e94e96:	31 c0                	xor    eax,eax
      e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
      e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e94ebf:	00 
      e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      e94ec5:	4c 89 ee             	mov    rsi,r13
      e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e94ed4:	00 00 
      e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
      e94edd:	00 
      e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
      e94ee5:	00 
      e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
      e94eed:	00 
      e94eee:	48 89 df             	mov    rdi,rbx
      e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
      e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]

### 0x1007f4c: lea    rax,[rip+0x83c8c5]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
     1007f23:	cc                   	int3
     1007f24:	53                   	push   rbx
     1007f25:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1007f28:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1007f2c:	48 85 db             	test   rbx,rbx
     1007f2f:	74 18                	je     1007f49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf35f>
     1007f31:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0
     1007f35:	74 09                	je     1007f40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf356>
     1007f37:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     1007f3b:	e8 c6 c9 b5 ff       	call   b64906 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb18a6>
     1007f40:	48 89 df             	mov    rdi,rbx
     1007f43:	5b                   	pop    rbx
     1007f44:	e9 d7 5f 7e 00       	jmp    17edf20 <_ZdlPv@plt>
     1007f49:	5b                   	pop    rbx
     1007f4a:	c3                   	ret
     1007f4b:	cc                   	int3
     1007f4c:	48 8d 05 c5 c8 83 00 	lea    rax,[rip+0x83c8c5]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
     1007f53:	48 89 07             	mov    QWORD PTR [rdi],rax
     1007f56:	e9 b5 60 7e 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     1007f5b:	cc                   	int3
     1007f5c:	53                   	push   rbx
     1007f5d:	48 89 fb             	mov    rbx,rdi
     1007f60:	e8 e7 ff ff ff       	call   1007f4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf362>
     1007f65:	48 89 df             	mov    rdi,rbx
     1007f68:	5b                   	pop    rbx
     1007f69:	e9 b2 5f 7e 00       	jmp    17edf20 <_ZdlPv@plt>
     1007f6e:	48 83 c7 20          	add    rdi,0x20
     1007f72:	e9 01 00 00 00       	jmp    1007f78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf38e>
     1007f77:	cc                   	int3
     1007f78:	53                   	push   rbx
     1007f79:	48 89 fb             	mov    rbx,rdi
     1007f7c:	48 8b bf 20 01 00 00 	mov    rdi,QWORD PTR [rdi+0x120]
     1007f83:	e8 fe 64 a9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1007f88:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
     1007f8f:	e8 f2 64 a9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1007f94:	48 8b bb 00 01 00 00 	mov    rdi,QWORD PTR [rbx+0x100]
     1007f9b:	e8 12 65 a9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1007fa0:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     1007fa7:	e8 ba 1e 7d 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1007fac:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
     1007fb3:	e8 70 1e a7 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1007fb8:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
     1007fbf:	e8 5a 1c e9 ff       	call   e99c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61034>
     1007fc4:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     1007fc8:	e8 9d 1f a7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1007fcd:	48 83 c3 28          	add    rbx,0x28
     1007fd1:	48 89 df             	mov    rdi,rbx
     1007fd4:	5b                   	pop    rbx
     1007fd5:	e9 b6 5e 7e 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1007fda:	53                   	push   rbx
     1007fdb:	48 89 fb             	mov    rbx,rdi
     1007fde:	6a 10                	push   0x10
     1007fe0:	5f                   	pop    rdi

## ec7c18 full compact body
      ec7c18:	41 57                	push   r15
      ec7c1a:	41 56                	push   r14
      ec7c1c:	41 55                	push   r13
      ec7c1e:	41 54                	push   r12
      ec7c20:	53                   	push   rbx
      ec7c21:	48 83 ec 60          	sub    rsp,0x60
      ec7c25:	49 89 f7             	mov    r15,rsi
      ec7c28:	49 89 fe             	mov    r14,rdi
      ec7c2b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec7c32:	00 00 
      ec7c34:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      ec7c39:	48 8d 05 e8 b4 96 00 	lea    rax,[rip+0x96b4e8]        # 1833128 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x50c0>
      ec7c40:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec7c43:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      ec7c47:	48 89 df             	mov    rdi,rbx
      ec7c4a:	e8 3f 06 c6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ec7c4f:	49 8b 07             	mov    rax,QWORD PTR [r15]
      ec7c52:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ec7c56:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      ec7c5a:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
      ec7c5e:	0f 57 c0             	xorps  xmm0,xmm0
      ec7c61:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      ec7c65:	4d 8d 7e 70          	lea    r15,[r14+0x70]
      ec7c69:	4c 89 ff             	mov    rdi,r15
      ec7c6c:	e8 85 1d 91 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ec7c71:	4d 8b 66 60          	mov    r12,QWORD PTR [r14+0x60]
      ec7c75:	49 89 e0             	mov    r8,rsp
      ec7c78:	4d 89 30             	mov    QWORD PTR [r8],r14
      ec7c7b:	48 8d 35 0f 54 bd ff 	lea    rsi,[rip+0xffffffffffbd540f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      ec7c82:	48 8d 0d a9 00 00 00 	lea    rcx,[rip+0xa9]        # ec7d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f148>
      ec7c89:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      ec7c8e:	6a 08                	push   0x8
      ec7c90:	41 59                	pop    r9
      ec7c92:	4c 89 ef             	mov    rdi,r13
      ec7c95:	31 d2                	xor    edx,edx
      ec7c97:	e8 f8 2a 91 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      ec7c9c:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      ec7ca0:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      ec7ca5:	4c 89 e6             	mov    rsi,r12
      ec7ca8:	4c 89 ea             	mov    rdx,r13
      ec7cab:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ec7cae:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
      ec7cb3:	4c 89 ff             	mov    rdi,r15
      ec7cb6:	48 89 de             	mov    rsi,rbx
      ec7cb9:	e8 34 1f 91 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      ec7cbe:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ec7cc2:	e8 bf 67 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec7cc7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec7ccc:	e8 17 2b 91 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      ec7cd1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec7cd8:	00 00 
      ec7cda:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      ec7cdf:	75 4c                	jne    ec7d2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f143>
      ec7ce1:	48 83 c4 60          	add    rsp,0x60
      ec7ce5:	5b                   	pop    rbx
      ec7ce6:	41 5c                	pop    r12
      ec7ce8:	41 5d                	pop    r13
      ec7cea:	41 5e                	pop    r14
      ec7cec:	41 5f                	pop    r15
      ec7cee:	c3                   	ret
      ec7cef:	49 89 c4             	mov    r12,rax
      ec7cf2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec7cf7:	e8 ec 2a 91 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      ec7cfc:	4c 89 ff             	mov    rdi,r15
      ec7cff:	e8 d0 1e 91 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      ec7d04:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
      ec7d08:	e8 79 67 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec7d0d:	48 89 df             	mov    rdi,rbx
      ec7d10:	e8 51 21 91 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ec7d15:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec7d1c:	00 00 
      ec7d1e:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      ec7d23:	75 08                	jne    ec7d2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f143>
      ec7d25:	4c 89 e7             	mov    rdi,r12
      ec7d28:	e8 a3 7f ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ec7d2d:	e8 7e 7d 92 00       	call   17efab0 <__stack_chk_fail@plt>

## ec7c18 input-pair field transfers
### 0xec7c4f: mov    rax,QWORD PTR [r15]
      ec7c2b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec7c32:	00 00 
      ec7c34:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      ec7c39:	48 8d 05 e8 b4 96 00 	lea    rax,[rip+0x96b4e8]        # 1833128 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x50c0>
      ec7c40:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec7c43:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      ec7c47:	48 89 df             	mov    rdi,rbx
      ec7c4a:	e8 3f 06 c6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ec7c4f:	49 8b 07             	mov    rax,QWORD PTR [r15]
      ec7c52:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ec7c56:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      ec7c5a:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
      ec7c5e:	0f 57 c0             	xorps  xmm0,xmm0
      ec7c61:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      ec7c65:	4d 8d 7e 70          	lea    r15,[r14+0x70]
      ec7c69:	4c 89 ff             	mov    rdi,r15
      ec7c6c:	e8 85 1d 91 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ec7c71:	4d 8b 66 60          	mov    r12,QWORD PTR [r14+0x60]
      ec7c75:	49 89 e0             	mov    r8,rsp
      ec7c78:	4d 89 30             	mov    QWORD PTR [r8],r14
      ec7c7b:	48 8d 35 0f 54 bd ff 	lea    rsi,[rip+0xffffffffffbd540f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      ec7c82:	48 8d 0d a9 00 00 00 	lea    rcx,[rip+0xa9]        # ec7d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f148>
      ec7c89:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      ec7c8e:	6a 08                	push   0x8
      ec7c90:	41 59                	pop    r9

### 0xec7c56: mov    rax,QWORD PTR [r15+0x8]
      ec7c34:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      ec7c39:	48 8d 05 e8 b4 96 00 	lea    rax,[rip+0x96b4e8]        # 1833128 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x50c0>
      ec7c40:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec7c43:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      ec7c47:	48 89 df             	mov    rdi,rbx
      ec7c4a:	e8 3f 06 c6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ec7c4f:	49 8b 07             	mov    rax,QWORD PTR [r15]
      ec7c52:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ec7c56:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      ec7c5a:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
      ec7c5e:	0f 57 c0             	xorps  xmm0,xmm0
      ec7c61:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      ec7c65:	4d 8d 7e 70          	lea    r15,[r14+0x70]
      ec7c69:	4c 89 ff             	mov    rdi,r15
      ec7c6c:	e8 85 1d 91 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ec7c71:	4d 8b 66 60          	mov    r12,QWORD PTR [r14+0x60]
      ec7c75:	49 89 e0             	mov    r8,rsp
      ec7c78:	4d 89 30             	mov    QWORD PTR [r8],r14
      ec7c7b:	48 8d 35 0f 54 bd ff 	lea    rsi,[rip+0xffffffffffbd540f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      ec7c82:	48 8d 0d a9 00 00 00 	lea    rcx,[rip+0xa9]        # ec7d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f148>
      ec7c89:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      ec7c8e:	6a 08                	push   0x8
      ec7c90:	41 59                	pop    r9
      ec7c92:	4c 89 ef             	mov    rdi,r13
      ec7c95:	31 d2                	xor    edx,edx

### 0xec7c61: movups XMMWORD PTR [r15],xmm0
      ec7c43:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      ec7c47:	48 89 df             	mov    rdi,rbx
      ec7c4a:	e8 3f 06 c6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ec7c4f:	49 8b 07             	mov    rax,QWORD PTR [r15]
      ec7c52:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ec7c56:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      ec7c5a:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
      ec7c5e:	0f 57 c0             	xorps  xmm0,xmm0
      ec7c61:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      ec7c65:	4d 8d 7e 70          	lea    r15,[r14+0x70]
      ec7c69:	4c 89 ff             	mov    rdi,r15
      ec7c6c:	e8 85 1d 91 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ec7c71:	4d 8b 66 60          	mov    r12,QWORD PTR [r14+0x60]
      ec7c75:	49 89 e0             	mov    r8,rsp
      ec7c78:	4d 89 30             	mov    QWORD PTR [r8],r14
      ec7c7b:	48 8d 35 0f 54 bd ff 	lea    rsi,[rip+0xffffffffffbd540f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      ec7c82:	48 8d 0d a9 00 00 00 	lea    rcx,[rip+0xa9]        # ec7d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f148>
      ec7c89:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      ec7c8e:	6a 08                	push   0x8
      ec7c90:	41 59                	pop    r9
      ec7c92:	4c 89 ef             	mov    rdi,r13
      ec7c95:	31 d2                	xor    edx,edx
      ec7c97:	e8 f8 2a 91 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      ec7c9c:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      ec7ca0:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]

## Reads/writes of object+0x140 around creator
### 0xe94324: mov    rax,QWORD PTR [r13+0x140]
      e942f5:	e8 8c a1 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e942fa:	31 ff                	xor    edi,edi
      e942fc:	e8 85 a1 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94301:	31 ff                	xor    edi,edi
      e94303:	e8 7e a1 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94308:	31 ff                	xor    edi,edi
      e9430a:	e8 77 a1 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9430f:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      e94314:	41 0f 10 85 38 01 00 	movups xmm0,XMMWORD PTR [r13+0x138]
      e9431b:	00 
      e9431c:	0f 29 84 24 d0 01 00 	movaps XMMWORD PTR [rsp+0x1d0],xmm0
      e94323:	00 
      e94324:	49 8b 85 40 01 00 00 	mov    rax,QWORD PTR [r13+0x140]
      e9432b:	48 85 c0             	test   rax,rax
      e9432e:	74 05                	je     e94335 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b74b>
      e94330:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94335:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      e9433c:	00 
      e9433d:	f3 41 0f 6f 85 c8 00 	movdqu xmm0,XMMWORD PTR [r13+0xc8]
      e94344:	00 00 
      e94346:	66 0f 7f 84 24 90 01 	movdqa XMMWORD PTR [rsp+0x190],xmm0
      e9434d:	00 00 
      e9434f:	49 8b 85 d0 00 00 00 	mov    rax,QWORD PTR [r13+0xd0]
      e94356:	48 85 c0             	test   rax,rax
      e94359:	74 05                	je     e94360 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b776>
      e9435b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94360:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      e94365:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e94369:	e8 71 56 00 00       	call   e999df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60df5>
      e9436e:	41 80 bd 31 01 00 00 	cmp    BYTE PTR [r13+0x131],0x0
      e94375:	00 
      e94376:	74 58                	je     e943d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b7e6>
      e94378:	48 8d 0d e9 0c 9a 00 	lea    rcx,[rip+0x9a0ce9]        # 1835068 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7000>
      e9437f:	84 c0                	test   al,al
      e94381:	74 70                	je     e943f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b809>
      e94383:	48 89 8c 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rcx
      e9438a:	00 

### 0xe94f6d: mov    QWORD PTR [r12+0x140],r15
      e94f3d:	00 
      e94f3e:	49 89 84 24 28 01 00 	mov    QWORD PTR [r12+0x128],rax
      e94f45:	00 
      e94f46:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
      e94f4d:	00 
      e94f4e:	49 89 84 24 30 01 00 	mov    QWORD PTR [r12+0x130],rax
      e94f55:	00 
      e94f56:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94f5b:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e94f60:	49 89 84 24 38 01 00 	mov    QWORD PTR [r12+0x138],rax
      e94f67:	00 
      e94f68:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
      e94f6d:	4d 89 bc 24 40 01 00 	mov    QWORD PTR [r12+0x140],r15
      e94f74:	00 
      e94f75:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e94f7a:	8a 84 24 88 00 00 00 	mov    al,BYTE PTR [rsp+0x88]
      e94f81:	41 88 84 24 48 01 00 	mov    BYTE PTR [r12+0x148],al
      e94f88:	00 
      e94f89:	41 89 ac 24 4c 01 00 	mov    DWORD PTR [r12+0x14c],ebp
      e94f90:	00 
      e94f91:	49 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [r12+0xb0]
      e94f98:	00 
      e94f99:	48 8d 05 f0 f8 9a 00 	lea    rax,[rip+0x9af8f0]        # 1844890 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf78>
      e94fa0:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
      e94fa7:	00 
      e94fa8:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94faf:	00 
      e94fb0:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94fb7:	00 
      e94fb8:	48 83 c7 20          	add    rdi,0x20
      e94fbc:	4c 89 f6             	mov    rsi,r14
      e94fbf:	e8 3a 3b 17 00       	call   1008afe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cff14>
      e94fc4:	4c 89 f7             	mov    rdi,r14
      e94fc7:	e8 9e 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94fcc:	49 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [r12+0xb8]
      e94fd3:	00 
      e94fd4:	48 8d 05 fd f8 9a 00 	lea    rax,[rip+0x9af8fd]        # 18448d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xfc0>

### 0xe95921: mov    QWORD PTR [rsp+0x140],rcx
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
      e95963:	00 
      e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95969:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
      e95970:	00 00 
      e95972:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
      e95979:	00 00 
      e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e95980:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e95984:	48 8b 83 78 05 00 00 	mov    rax,QWORD PTR [rbx+0x578]
      e9598b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### 0xe95bf2: mov    r9,QWORD PTR [rsp+0x140]
      e95bc4:	00 
      e95bc5:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e95bc9:	f0 48 ff 45 00       	lock inc QWORD PTR [rbp+0x0]
      e95bce:	48 83 ec 08          	sub    rsp,0x8
      e95bd2:	48 8d bc 24 18 0e 00 	lea    rdi,[rsp+0xe18]
      e95bd9:	00 
      e95bda:	48 8b 94 24 58 01 00 	mov    rdx,QWORD PTR [rsp+0x158]
      e95be1:	00 
      e95be2:	48 8b 8c 24 50 01 00 	mov    rcx,QWORD PTR [rsp+0x150]
      e95be9:	00 
      e95bea:	4c 8b 84 24 48 01 00 	mov    r8,QWORD PTR [rsp+0x148]
      e95bf1:	00 
      e95bf2:	4c 8b 8c 24 40 01 00 	mov    r9,QWORD PTR [rsp+0x140]
      e95bf9:	00 
      e95bfa:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
      e95bff:	ff b5 98 05 00 00    	push   QWORD PTR [rbp+0x598]
      e95c05:	50                   	push   rax
      e95c06:	48 8d 84 24 e8 02 00 	lea    rax,[rsp+0x2e8]
      e95c0d:	00 
      e95c0e:	50                   	push   rax
      e95c0f:	41 54                	push   r12
      e95c11:	41 56                	push   r14
      e95c13:	41 57                	push   r15
      e95c15:	53                   	push   rbx
      e95c16:	41 55                	push   r13
      e95c18:	ff b4 24 a8 00 00 00 	push   QWORD PTR [rsp+0xa8]
      e95c1f:	41 53                	push   r11
      e95c21:	41 52                	push   r10
      e95c23:	ff b4 24 30 01 00 00 	push   QWORD PTR [rsp+0x130]
      e95c2a:	ff b4 24 80 02 00 00 	push   QWORD PTR [rsp+0x280]
      e95c31:	ff b4 24 90 02 00 00 	push   QWORD PTR [rsp+0x290]
      e95c38:	ff b4 24 78 02 00 00 	push   QWORD PTR [rsp+0x278]
      e95c3f:	ff b4 24 a8 02 00 00 	push   QWORD PTR [rsp+0x2a8]
      e95c46:	ff b4 24 b8 02 00 00 	push   QWORD PTR [rsp+0x2b8]
      e95c4d:	ff b4 24 98 02 00 00 	push   QWORD PTR [rsp+0x298]
      e95c54:	ff b4 24 a8 02 00 00 	push   QWORD PTR [rsp+0x2a8]
      e95c5b:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]

### 0xe96440: mov    QWORD PTR [rbx+0x140],rax
      e96407:	e8 84 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9640c:	44 88 a4 24 60 01 00 	mov    BYTE PTR [rsp+0x160],r12b
      e96413:	00 
      e96414:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
      e9641b:	48 8d b4 24 40 07 00 	lea    rsi,[rsp+0x740]
      e96422:	00 
      e96423:	e8 68 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e96428:	4c 8d b4 24 90 07 00 	lea    r14,[rsp+0x790]
      e9642f:	00 
      e96430:	41 0f 28 46 e0       	movaps xmm0,XMMWORD PTR [r14-0x20]
      e96435:	0f 29 83 30 01 00 00 	movaps XMMWORD PTR [rbx+0x130],xmm0
      e9643c:	49 8b 46 f0          	mov    rax,QWORD PTR [r14-0x10]
      e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
      e96447:	0f 57 c0             	xorps  xmm0,xmm0
      e9644a:	41 0f 11 46 e8       	movups XMMWORD PTR [r14-0x18],xmm0
      e9644f:	48 89 df             	mov    rdi,rbx
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 

### 0xe9662b: lea    r14,[rbp+0x140]
      e965f6:	48 89 bc 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rdi
      e965fd:	00 
      e965fe:	e8 3b eb f6 ff       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
      e96603:	48 8b 9c 24 90 03 00 	mov    rbx,QWORD PTR [rsp+0x390]
      e9660a:	00 
      e9660b:	48 89 9d 28 01 00 00 	mov    QWORD PTR [rbp+0x128],rbx
      e96612:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]
      e96619:	00 
      e9661a:	48 89 85 30 01 00 00 	mov    QWORD PTR [rbp+0x130],rax
      e96621:	48 85 c0             	test   rax,rax
      e96624:	74 05                	je     e9662b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da41>
      e96626:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9662b:	4c 8d b5 40 01 00 00 	lea    r14,[rbp+0x140]
      e96632:	48 8d b4 24 00 0a 00 	lea    rsi,[rsp+0xa00]
      e96639:	00 
      e9663a:	4c 89 f7             	mov    rdi,r14
      e9663d:	e8 4e 3c be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e96642:	48 8d b5 70 01 00 00 	lea    rsi,[rbp+0x170]
      e96649:	48 8b bc 24 20 08 00 	mov    rdi,QWORD PTR [rsp+0x820]
      e96650:	00 
      e96651:	48 85 ff             	test   rdi,rdi
      e96654:	4c 89 b4 24 50 01 00 	mov    QWORD PTR [rsp+0x150],r14
      e9665b:	00 
      e9665c:	48 89 b4 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rsi
      e96663:	00 
      e96664:	74 15                	je     e9667b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da91>
      e96666:	48 8d 84 24 00 08 00 	lea    rax,[rsp+0x800]
      e9666d:	00 
      e9666e:	48 39 c7             	cmp    rdi,rax
      e96671:	74 13                	je     e96686 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da9c>
      e96673:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96676:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e96679:	eb 02                	jmp    e9667d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da93>
      e9667b:	31 c0                	xor    eax,eax
      e9667d:	48 89 85 90 01 00 00 	mov    QWORD PTR [rbp+0x190],rax
      e96684:	eb 15                	jmp    e9669b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dab1>
      e96686:	48 89 b5 90 01 00 00 	mov    QWORD PTR [rbp+0x190],rsi

### 0xe966aa: mov    QWORD PTR [rsp+0x140],rdi
      e96679:	eb 02                	jmp    e9667d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da93>
      e9667b:	31 c0                	xor    eax,eax
      e9667d:	48 89 85 90 01 00 00 	mov    QWORD PTR [rbp+0x190],rax
      e96684:	eb 15                	jmp    e9669b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dab1>
      e96686:	48 89 b5 90 01 00 00 	mov    QWORD PTR [rbp+0x190],rsi
      e9668d:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e96694:	00 
      e96695:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96698:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e9669b:	48 8d bd a0 01 00 00 	lea    rdi,[rbp+0x1a0]
      e966a2:	48 8d b4 24 20 06 00 	lea    rsi,[rsp+0x620]
      e966a9:	00 
      e966aa:	48 89 bc 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rdi
      e966b1:	00 
      e966b2:	e8 d9 3b be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e966b7:	4c 8d 84 24 d0 03 00 	lea    r8,[rsp+0x3d0]
      e966be:	00 
      e966bf:	49 89 28             	mov    QWORD PTR [r8],rbp
      e966c2:	48 8d 35 c8 69 c0 ff 	lea    rsi,[rip+0xffffffffffc069c8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e966c9:	48 8d 0d f2 90 02 00 	lea    rcx,[rip+0x290f2]        # ebf7c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86bd8>
      e966d0:	4c 8d b4 24 50 10 00 	lea    r14,[rsp+0x1050]
      e966d7:	00 
      e966d8:	6a 08                	push   0x8
      e966da:	41 59                	pop    r9
      e966dc:	4c 89 f7             	mov    rdi,r14
      e966df:	31 d2                	xor    edx,edx
      e966e1:	e8 ae 40 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e966e6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e966e9:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e966f0:	00 
      e966f1:	48 89 de             	mov    rsi,rbx
      e966f4:	4c 89 f2             	mov    rdx,r14
      e966f7:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      e966fd:	48 8d bd d0 01 00 00 	lea    rdi,[rbp+0x1d0]
      e96704:	4c 8d b4 24 10 10 00 	lea    r14,[rsp+0x1010]
      e9670b:	00 
      e9670c:	48 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rdi

### 0xe9819e: mov    rdi,QWORD PTR [r12+0x140]
      e98168:	e8 7b 26 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9816d:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e98174:	00 
      e98175:	e8 4a 27 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
      e9817a:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e98181:	00 
      e98182:	e8 dd 49 c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
      e98187:	e9 eb 00 00 00       	jmp    e98277 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f68d>
      e9818c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98191:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e98198:	00 
      e98199:	e8 cc 1d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9819e:	49 8b bc 24 40 01 00 	mov    rdi,QWORD PTR [r12+0x140]
      e981a5:	00 
      e981a6:	e8 db 62 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e981ab:	49 8b bc 24 30 01 00 	mov    rdi,QWORD PTR [r12+0x130]
      e981b2:	00 
      e981b3:	e8 ce 62 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e981b8:	49 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [r12+0x120]
      e981bf:	00 
      e981c0:	e8 ed 62 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e981c5:	48 89 df             	mov    rdi,rbx
      e981c8:	e8 99 1c 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e981cd:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
      e981d4:	00 
      e981d5:	e8 4e 1c be ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
      e981da:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e981e1:	00 
      e981e2:	e8 37 1a 00 00       	call   e99c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61034>
      e981e7:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e981ec:	e8 79 1d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e981f1:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e981f8:	00 
      e981f9:	e8 92 5c 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e981fe:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e98205:	00 
      e98206:	e8 5f 1d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0xe9864c: mov    rdi,QWORD PTR [rsp+0x140]
      e9861c:	00 
      e9861d:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e98620:	e8 9b 56 01 00       	call   eadcc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x750d6>
      e98625:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
      e9862c:	00 
      e9862d:	e8 38 19 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98632:	48 8b bc 24 30 01 00 	mov    rdi,QWORD PTR [rsp+0x130]
      e98639:	00 
      e9863a:	e8 95 15 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e9863f:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
      e98646:	00 
      e98647:	e8 88 15 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e9864c:	48 8b bc 24 40 01 00 	mov    rdi,QWORD PTR [rsp+0x140]
      e98653:	00 
      e98654:	e8 11 19 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98659:	48 8b bc 24 48 01 00 	mov    rdi,QWORD PTR [rsp+0x148]
      e98660:	00 
      e98661:	e8 04 19 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98666:	48 8b bc 24 50 01 00 	mov    rdi,QWORD PTR [rsp+0x150]
      e9866d:	00 
      e9866e:	e8 f7 18 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98673:	48 8b bd 30 01 00 00 	mov    rdi,QWORD PTR [rbp+0x130]
      e9867a:	e8 07 5e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9867f:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      e98686:	00 
      e98687:	e8 da 17 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e9868c:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      e98693:	00 
      e98694:	e8 cd 17 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e98699:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
      e986a0:	00 
      e986a1:	e8 c0 17 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e986a6:	48 8b 7d 10          	mov    rdi,QWORD PTR [rbp+0x10]
      e986aa:	e8 03 5e c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e986af:	66 0f 6f 84 24 a0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1a0]
      e986b6:	00 00 
      e986b8:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1

### 0xe98e8e: mov    rdi,QWORD PTR [r14+0x140]
      e98e57:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e5c:	e9 fe f9 ff ff       	jmp    e9885f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc75>
      e98e61:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e66:	e9 01 fa ff ff       	jmp    e9886c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc82>
      e98e6b:	eb 00                	jmp    e98e6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60283>
      e98e6d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e72:	e9 27 fa ff ff       	jmp    e9889e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fcb4>
      e98e77:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e7c:	4c 8b b4 24 90 00 00 	mov    r14,QWORD PTR [rsp+0x90]
      e98e83:	00 
      e98e84:	4c 89 f3             	mov    rbx,r14
      e98e87:	48 81 c3 e8 00 00 00 	add    rbx,0xe8
      e98e8e:	49 8b be 40 01 00 00 	mov    rdi,QWORD PTR [r14+0x140]
      e98e95:	e8 ec 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98e9a:	49 8b be 30 01 00 00 	mov    rdi,QWORD PTR [r14+0x130]
      e98ea1:	e8 e0 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ea6:	49 8b be 20 01 00 00 	mov    rdi,QWORD PTR [r14+0x120]
      e98ead:	e8 d4 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98eb2:	48 89 df             	mov    rdi,rbx
      e98eb5:	e8 2e 27 be ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
      e98eba:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e98ebf:	e8 a6 10 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98ec4:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98ec9:	e8 06 0d 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98ece:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
      e98ed5:	00 
      e98ed6:	e8 f9 0c 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98edb:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e98ee0:	e8 ef 0c 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98ee5:	4c 89 ff             	mov    rdi,r15
      e98ee8:	e8 e7 0c 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98eed:	31 ff                	xor    edi,edi
      e98eef:	e8 92 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ef4:	31 ff                	xor    edi,edi
      e98ef6:	e8 8b 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98efb:	31 ff                	xor    edi,edi
      e98efd:	e8 84 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

