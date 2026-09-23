# Restrictions `+0xa0` callback-package flow v15

Focus: inspect likely `+0xa0` methods for how they consume `rdx=callback package`, store it, copy it, or invoke package+0x28 (`e99c54`). Static provenance only.

## Candidate `+0xa0` method `0x9d7de0` full window

```text
  9d7d77:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  9d7d7e:	00 00
  9d7d80:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
  9d7d85:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
  9d7d89:	48 c7 44 24 08 00 00 	mov    QWORD PTR [rsp+0x8],0x0
  9d7d90:	00 00
  9d7d92:	48 89 e7             	mov    rdi,rsp
  9d7d95:	48 89 c6             	mov    rsi,rax
  9d7d98:	e8 63 22 00 00       	call   9da000 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1e30>
  9d7d9d:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  9d7da4:	00 00
  9d7da6:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
  9d7dab:	75 05                	jne    9d7db2 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x842>
  9d7dad:	48 83 c4 18          	add    rsp,0x18
  9d7db1:	c3                   	ret
  9d7db2:	e8 f9 7c e1 00       	call   17efab0 <__stack_chk_fail@plt>
  9d7db7:	cc                   	int3
  9d7db8:	cc                   	int3
  9d7db9:	cc                   	int3
  9d7dba:	cc                   	int3
  9d7dbb:	cc                   	int3
  9d7dbc:	cc                   	int3
  9d7dbd:	cc                   	int3
  9d7dbe:	cc                   	int3
  9d7dbf:	cc                   	int3
  9d7dc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  9d7dc3:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  9d7dc7:	ff e0                	jmp    rax
  9d7dc9:	cc                   	int3
  9d7dca:	cc                   	int3
  9d7dcb:	cc                   	int3
  9d7dcc:	cc                   	int3
  9d7dcd:	cc                   	int3
  9d7dce:	cc                   	int3
  9d7dcf:	cc                   	int3
  9d7dd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  9d7dd3:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  9d7dd7:	ff e0                	jmp    rax
  9d7dd9:	cc                   	int3
  9d7dda:	cc                   	int3
  9d7ddb:	cc                   	int3
  9d7ddc:	cc                   	int3
  9d7ddd:	cc                   	int3
  9d7dde:	cc                   	int3
  9d7ddf:	cc                   	int3
  9d7de0:	c3                   	ret
  9d7de1:	cc                   	int3
  9d7de2:	cc                   	int3
  9d7de3:	cc                   	int3
  9d7de4:	cc                   	int3
  9d7de5:	cc                   	int3
  9d7de6:	cc                   	int3
  9d7de7:	cc                   	int3
  9d7de8:	cc                   	int3
  9d7de9:	cc                   	int3
  9d7dea:	cc                   	int3
  9d7deb:	cc                   	int3
  9d7dec:	cc                   	int3
  9d7ded:	cc                   	int3
  9d7dee:	cc                   	int3
  9d7def:	cc                   	int3
  9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
  9d7df4:	0f 94 c0             	sete   al
  9d7df7:	c3                   	ret
  9d7df8:	cc                   	int3
  9d7df9:	cc                   	int3
  9d7dfa:	cc                   	int3
  9d7dfb:	cc                   	int3
  9d7dfc:	cc                   	int3
  9d7dfd:	cc                   	int3
  9d7dfe:	cc                   	int3
  9d7dff:	cc                   	int3
  9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
  9d7e03:	c3                   	ret
  9d7e04:	cc                   	int3
  9d7e05:	cc                   	int3
  9d7e06:	cc                   	int3
  9d7e07:	cc                   	int3
  9d7e08:	cc                   	int3
  9d7e09:	cc                   	int3
  9d7e0a:	cc                   	int3
  9d7e0b:	cc                   	int3
  9d7e0c:	cc                   	int3
  9d7e0d:	cc                   	int3
  9d7e0e:	cc                   	int3
  9d7e0f:	cc                   	int3
  9d7e10:	50                   	push   rax
  9d7e11:	48 89 f7             	mov    rdi,rsi
  9d7e14:	4c 8d 05 65 24 00 01 	lea    r8,[rip+0x1002465]        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e1b:	48 c7 c6 ff ff ff ff 	mov    rsi,0xffffffffffffffff
  9d7e22:	31 c0                	xor    eax,eax
  9d7e24:	e8 17 00 00 00       	call   9d7e40 <_ZNSt13bad_exceptionD1Ev@@Base+0x60>
  9d7e29:	48 98                	cdqe
  9d7e2b:	c6 05 4e 24 00 01 00 	mov    BYTE PTR [rip+0x100244e],0x0        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e32:	59                   	pop    rcx
  9d7e33:	c3                   	ret
  9d7e34:	cc                   	int3
  9d7e35:	cc                   	int3
  9d7e36:	cc                   	int3
  9d7e37:	cc                   	int3
  9d7e38:	cc                   	int3
  9d7e39:	cc                   	int3
  9d7e3a:	cc                   	int3
  9d7e3b:	cc                   	int3
  9d7e3c:	cc                   	int3
  9d7e3d:	cc                   	int3
  9d7e3e:	cc                   	int3
  9d7e3f:	cc                   	int3
  9d7e40:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
  9d7e47:	48 89 f1             	mov    rcx,rsi
  9d7e4a:	84 c0                	test   al,al
  9d7e4c:	74 31                	je     9d7e7f <_ZNSt13bad_exceptionD1Ev@@Base+0x9f>
  9d7e4e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  9d7e53:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
  9d7e58:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
  9d7e5d:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
  9d7e62:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
  9d7e67:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
  9d7e6e:	00
  9d7e6f:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
  9d7e76:	00
  9d7e77:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
  9d7e7e:	00
  9d7e7f:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
  9d7e84:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
  9d7e89:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  9d7e90:	00 00
  9d7e92:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
  9d7e99:	00
  9d7e9a:	48 89 e0             	mov    rax,rsp
  9d7e9d:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
  9d7ea4:	00
  9d7ea5:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
  9d7eac:	00
  9d7ead:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
  9d7eb4:	00
  9d7eb5:	48 b8 20 00 00 00 30 	movabs rax,0x3000000020
  9d7ebc:	00 00 00
  9d7ebf:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
  9d7ec6:	00
  9d7ec7:	4c 8d 05 41 6e 97 ff 	lea    r8,[rip+0xffffffffff976e41]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
  9d7ece:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
  9d7ed5:	00
  9d7ed6:	48 89 d6             	mov    rsi,rdx
  9d7ed9:	31 d2                	xor    edx,edx
  9d7edb:	e8 90 72 e1 00       	call   17ef170 <__vsnprintf_chk@plt>
  9d7ee0:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  9d7ee7:	00 00
  9d7ee9:	48 3b 8c 24 d0 00 00 	cmp    rcx,QWORD PTR [rsp+0xd0]
  9d7ef0:	00
  9d7ef1:	75 08                	jne    9d7efb <_ZNSt13bad_exceptionD1Ev@@Base+0x11b>
  9d7ef3:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
  9d7efa:	c3                   	ret
  9d7efb:	e8 b0 7b e1 00       	call   17efab0 <__stack_chk_fail@plt>
  9d7f00:	8b 47 08             	mov    eax,DWORD PTR [rdi+0x8]
  9d7f03:	c3                   	ret
  9d7f04:	cc                   	int3
  9d7f05:	cc                   	int3
  9d7f06:	cc                   	int3
  9d7f07:	cc                   	int3
  9d7f08:	cc                   	int3
  9d7f09:	cc                   	int3
  9d7f0a:	cc                   	int3
  9d7f0b:	cc                   	int3
  9d7f0c:	cc                   	int3
  9d7f0d:	cc                   	int3
  9d7f0e:	cc                   	int3
  9d7f0f:	cc                   	int3
  9d7f10:	53                   	push   rbx
  9d7f11:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
  9d7f18:	48 89 d3             	mov    rbx,rdx
  9d7f1b:	84 c0                	test   al,al
  9d7f1d:	74 31                	je     9d7f50 <_ZNSt13bad_exceptionD1Ev@@Base+0x170>
  9d7f1f:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  9d7f24:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
  9d7f29:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
  9d7f2e:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
  9d7f33:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
  9d7f38:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
  9d7f3f:	00
  9d7f40:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
  9d7f47:	00
  9d7f48:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
  9d7f4f:	00
  9d7f50:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
  9d7f55:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
  9d7f5a:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
  9d7f5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  9d7f66:	00 00
  9d7f68:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
  9d7f6f:	00
  9d7f70:	48 89 e0             	mov    rax,rsp
  9d7f73:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
  9d7f7a:	00
  9d7f7b:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
  9d7f82:	00
  9d7f83:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
  9d7f8a:	00
  9d7f8b:	48 b8 18 00 00 00 30 	movabs rax,0x3000000018
  9d7f92:	00 00 00
  9d7f95:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
  9d7f9c:	00
  9d7f9d:	48 85 ff             	test   rdi,rdi
  9d7fa0:	74 09                	je     9d7fab <_ZNSt13bad_exceptionD1Ev@@Base+0x1cb>
  9d7fa2:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
  9d7fa6:	75 03                	jne    9d7fab <_ZNSt13bad_exceptionD1Ev@@Base+0x1cb>
  9d7fa8:	89 77 08             	mov    DWORD PTR [rdi+0x8],esi
  9d7fab:	48 85 db             	test   rbx,rbx
  9d7fae:	74 32                	je     9d7fe2 <_ZNSt13bad_exceptionD1Ev@@Base+0x202>
  9d7fb0:	48 8d 3d c9 22 00 01 	lea    rdi,[rip+0x10022c9]        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7fb7:	be 00 01 00 00       	mov    esi,0x100
  9d7fbc:	e8 4f 65 e1 00       	call   17ee510 <__strlen_chk@plt>
  9d7fc1:	48 85 c0             	test   rax,rax
  9d7fc4:	75 1c                	jne    9d7fe2 <_ZNSt13bad_exceptionD1Ev@@Base+0x202>
  9d7fc6:	48 8d 3d b3 22 00 01 	lea    rdi,[rip+0x10022b3]        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7fcd:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
  9d7fd4:	00
  9d7fd5:	be 00 01 00 00       	mov    esi,0x100
  9d7fda:	48 89 da             	mov    rdx,rbx
  9d7fdd:	e8 8e 6b e1 00       	call   17eeb70 <vsnprintf@plt>
  9d7fe2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  9d7fe9:	00 00
  9d7feb:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
  9d7ff2:	00
  9d7ff3:	75 09                	jne    9d7ffe <_ZNSt13bad_exceptionD1Ev@@Base+0x21e>
  9d7ff5:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
  9d7ffc:	5b                   	pop    rbx
  9d7ffd:	c3                   	ret
  9d7ffe:	e8 ad 7a e1 00       	call   17efab0 <__stack_chk_fail@plt>
  9d8003:	cc                   	int3
  9d8004:	cc                   	int3
  9d8005:	cc                   	int3
  9d8006:	cc                   	int3
  9d8007:	cc                   	int3
  9d8008:	cc                   	int3
```
### filtered dataflow rows for `0x9d7de0`

| addr | instruction |
|---:|---|
| `0x9d7d85` | `9d7d85:	48 89 34 24          	mov    QWORD PTR [rsp],rsi` |
| `0x9d7d92` | `9d7d92:	48 89 e7             	mov    rdi,rsp` |
| `0x9d7d95` | `9d7d95:	48 89 c6             	mov    rsi,rax` |
| `0x9d7dc0` | `9d7dc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x9d7dd0` | `9d7dd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x9d7df0` | `9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0` |
| `0x9d7e00` | `9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]` |
| `0x9d7e11` | `9d7e11:	48 89 f7             	mov    rdi,rsi` |
| `0x9d7e14` | `9d7e14:	4c 8d 05 65 24 00 01 	lea    r8,[rip+0x1002465]        # 19da280 <__stop_pb_defaults@@Base+0x20>` |
| `0x9d7e1b` | `9d7e1b:	48 c7 c6 ff ff ff ff 	mov    rsi,0xffffffffffffffff` |
| `0x9d7e2b` | `9d7e2b:	c6 05 4e 24 00 01 00 	mov    BYTE PTR [rip+0x100244e],0x0        # 19da280 <__stop_pb_defaults@@Base+0x20>` |
| `0x9d7e47` | `9d7e47:	48 89 f1             	mov    rcx,rsi` |
| `0x9d7e4e` | `9d7e4e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0` |
| `0x9d7e7f` | `9d7e7f:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8` |
| `0x9d7e84` | `9d7e84:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9` |
| `0x9d7ed6` | `9d7ed6:	48 89 d6             	mov    rsi,rdx` |
| `0x9d7f00` | `9d7f00:	8b 47 08             	mov    eax,DWORD PTR [rdi+0x8]` |
| `0x9d7f18` | `9d7f18:	48 89 d3             	mov    rbx,rdx` |
| `0x9d7f1f` | `9d7f1f:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0` |
| `0x9d7f50` | `9d7f50:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx` |
| `0x9d7f55` | `9d7f55:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8` |
| `0x9d7f5a` | `9d7f5a:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9` |
| `0x9d7f9d` | `9d7f9d:	48 85 ff             	test   rdi,rdi` |
| `0x9d7fa2` | `9d7fa2:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0` |
| `0x9d7fa8` | `9d7fa8:	89 77 08             	mov    DWORD PTR [rdi+0x8],esi` |
| `0x9d7fae` | `9d7fae:	74 32                	je     9d7fe2 <_ZNSt13bad_exceptionD1Ev@@Base+0x202>` |
| `0x9d7fb0` | `9d7fb0:	48 8d 3d c9 22 00 01 	lea    rdi,[rip+0x10022c9]        # 19da280 <__stop_pb_defaults@@Base+0x20>` |
| `0x9d7fc4` | `9d7fc4:	75 1c                	jne    9d7fe2 <_ZNSt13bad_exceptionD1Ev@@Base+0x202>` |
| `0x9d7fc6` | `9d7fc6:	48 8d 3d b3 22 00 01 	lea    rdi,[rip+0x10022b3]        # 19da280 <__stop_pb_defaults@@Base+0x20>` |
| `0x9d7fda` | `9d7fda:	48 89 da             	mov    rdx,rbx` |

## Candidate `+0xa0` method `0xa50370` full window

```text
  a502ee:	e8 2d dc d9 00       	call   17edf20 <_ZdlPv@plt>
  a502f3:	4c 89 f7             	mov    rdi,r14
  a502f6:	e8 d5 f9 01 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a502fb:	cc                   	int3
  a502fc:	cc                   	int3
  a502fd:	cc                   	int3
  a502fe:	cc                   	int3
  a502ff:	cc                   	int3
  a50300:	48 8d 05 11 90 da 00 	lea    rax,[rip+0xda9011]        # 17f9318 <_ZTINSt6__ndk111regex_errorE@@Base+0x28>
  a50307:	48 89 07             	mov    QWORD PTR [rdi],rax
  a5030a:	e9 01 dd d9 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  a5030f:	cc                   	int3
  a50310:	53                   	push   rbx
  a50311:	48 89 fb             	mov    rbx,rdi
  a50314:	48 8d 05 fd 8f da 00 	lea    rax,[rip+0xda8ffd]        # 17f9318 <_ZTINSt6__ndk111regex_errorE@@Base+0x28>
  a5031b:	48 89 07             	mov    QWORD PTR [rdi],rax
  a5031e:	e8 ed dc d9 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  a50323:	48 89 df             	mov    rdi,rbx
  a50326:	5b                   	pop    rbx
  a50327:	e9 f4 db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a5032c:	cc                   	int3
  a5032d:	cc                   	int3
  a5032e:	cc                   	int3
  a5032f:	cc                   	int3
  a50330:	53                   	push   rbx
  a50331:	48 89 fb             	mov    rbx,rdi
  a50334:	f6 47 48 01          	test   BYTE PTR [rdi+0x48],0x1
  a50338:	75 0e                	jne    a50348 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa28>
  a5033a:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
  a5033e:	75 17                	jne    a50357 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa37>
  a50340:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
  a50344:	75 20                	jne    a50366 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa46>
  a50346:	5b                   	pop    rbx
  a50347:	c3                   	ret
  a50348:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
  a5034c:	e8 cf db d9 00       	call   17edf20 <_ZdlPv@plt>
  a50351:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
  a50355:	74 e9                	je     a50340 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa20>
  a50357:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
  a5035b:	e8 c0 db d9 00       	call   17edf20 <_ZdlPv@plt>
  a50360:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
  a50364:	74 e0                	je     a50346 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa26>
  a50366:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  a5036a:	5b                   	pop    rbx
  a5036b:	e9 b0 db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a50375:	cc                   	int3
  a50376:	cc                   	int3
  a50377:	cc                   	int3
  a50378:	cc                   	int3
  a50379:	cc                   	int3
  a5037a:	cc                   	int3
  a5037b:	cc                   	int3
  a5037c:	cc                   	int3
  a5037d:	cc                   	int3
  a5037e:	cc                   	int3
  a5037f:	cc                   	int3
  a50380:	41 57                	push   r15
  a50382:	41 56                	push   r14
  a50384:	53                   	push   rbx
  a50385:	48 83 ec 30          	sub    rsp,0x30
  a50389:	49 89 d7             	mov    r15,rdx
  a5038c:	48 89 f0             	mov    rax,rsi
  a5038f:	48 89 fb             	mov    rbx,rdi
  a50392:	89 ce                	mov    esi,ecx
  a50394:	4c 89 c2             	mov    rdx,r8
  a50397:	48 89 c1             	mov    rcx,rax
  a5039a:	e8 41 fa d9 00       	call   17efde0 <_ZNSt6__ndk112system_errorC2ENS_10error_codeERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@plt>
  a5039f:	48 8b 05 62 1b e6 00 	mov    rax,QWORD PTR [rip+0xe61b62]        # 18b1f08 <_ZTVNSt6__ndk14__fs10filesystem16filesystem_errorE@@Base+0xbcde8>
  a503a6:	48 83 c0 10          	add    rax,0x10
  a503aa:	48 89 03             	mov    QWORD PTR [rbx],rax
  a503ad:	4c 8d 73 20          	lea    r14,[rbx+0x20]
  a503b1:	0f 57 c0             	xorps  xmm0,xmm0
  a503b4:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  a503b9:	48 c7 44 24 20 00 00 	mov    QWORD PTR [rsp+0x20],0x0
  a503c0:	00 00
  a503c2:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
  a503c7:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  a503cc:	4c 89 f7             	mov    rdi,r14
  a503cf:	4c 89 fa             	mov    rdx,r15
  a503d2:	e8 69 00 00 00       	call   a50440 <_ZdaPv@@Base+0xd0>
  a503d7:	f6 44 24 10 01       	test   BYTE PTR [rsp+0x10],0x1
  a503dc:	74 0a                	je     a503e8 <_ZdaPv@@Base+0x78>
  a503de:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  a503e3:	e8 38 db d9 00       	call   17edf20 <_ZdlPv@plt>
  a503e8:	48 89 df             	mov    rdi,rbx
  a503eb:	be 01 00 00 00       	mov    esi,0x1
  a503f0:	e8 eb f7 d9 00       	call   17efbe0 <_ZNSt6__ndk14__fs10filesystem16filesystem_error13__create_whatEi@plt>
  a503f5:	48 83 c4 30          	add    rsp,0x30
  a503f9:	5b                   	pop    rbx
  a503fa:	41 5e                	pop    r14
  a503fc:	41 5f                	pop    r15
  a503fe:	c3                   	ret
  a503ff:	49 89 c7             	mov    r15,rax
  a50402:	4c 89 f7             	mov    rdi,r14
  a50405:	e8 e6 f0 ff ff       	call   a4f4f0 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iteratorC1ERKNS1_4pathENS1_17directory_optionsEPNS_10error_codeE@@Base+0x3e0>
  a5040a:	48 89 df             	mov    rdi,rbx
  a5040d:	e8 de f7 d9 00       	call   17efbf0 <_ZNSt6__ndk112system_errorD2Ev@plt>
  a50412:	4c 89 ff             	mov    rdi,r15
  a50415:	e8 b6 f8 01 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a5041a:	49 89 c7             	mov    r15,rax
  a5041d:	f6 44 24 10 01       	test   BYTE PTR [rsp+0x10],0x1
  a50422:	74 0a                	je     a5042e <_ZdaPv@@Base+0xbe>
  a50424:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  a50429:	e8 f2 da d9 00       	call   17edf20 <_ZdlPv@plt>
  a5042e:	48 89 df             	mov    rdi,rbx
  a50431:	e8 ba f7 d9 00       	call   17efbf0 <_ZNSt6__ndk112system_errorD2Ev@plt>
  a50436:	4c 89 ff             	mov    rdi,r15
  a50439:	e8 92 f8 01 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a5043e:	cc                   	int3
  a5043f:	cc                   	int3
  a50440:	55                   	push   rbp
  a50441:	41 57                	push   r15
  a50443:	41 56                	push   r14
  a50445:	41 55                	push   r13
  a50447:	41 54                	push   r12
  a50449:	53                   	push   rbx
  a5044a:	50                   	push   rax
  a5044b:	49 89 cc             	mov    r12,rcx
  a5044e:	48 89 d5             	mov    rbp,rdx
  a50451:	49 89 fe             	mov    r14,rdi
  a50454:	bf 60 00 00 00       	mov    edi,0x60
  a50459:	e8 a2 da d9 00       	call   17edf00 <_Znwm@plt>
  a5045e:	49 89 c5             	mov    r13,rax
  a50461:	48 89 c3             	mov    rbx,rax
  a50464:	0f 57 c0             	xorps  xmm0,xmm0
  a50467:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  a5046b:	48 8d 05 a6 8e da 00 	lea    rax,[rip+0xda8ea6]        # 17f9318 <_ZTINSt6__ndk111regex_errorE@@Base+0x28>
  a50472:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  a50476:	4d 8d 7d 18          	lea    r15,[r13+0x18]
  a5047a:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
  a5047e:	75 12                	jne    a50492 <_ZdaPv@@Base+0x122>
  a50480:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
  a50484:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  a50488:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
  a5048c:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
  a50490:	eb 10                	jmp    a504a2 <_ZdaPv@@Base+0x132>
  a50492:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
  a50496:	48 8b 75 10          	mov    rsi,QWORD PTR [rbp+0x10]
  a5049a:	4c 89 ff             	mov    rdi,r15
  a5049d:	e8 c0 b5 02 00       	call   a7ba62 <JNI_OnUnload@@Base+0x332f>
  a504a2:	49 83 c5 30          	add    r13,0x30
  a504a6:	41 f6 04 24 01       	test   BYTE PTR [r12],0x1
  a504ab:	75 15                	jne    a504c2 <_ZdaPv@@Base+0x152>
  a504ad:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
  a504b2:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
  a504b6:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
  a504bb:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
  a504c0:	eb 12                	jmp    a504d4 <_ZdaPv@@Base+0x164>
  a504c2:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
  a504c7:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
  a504cc:	4c 89 ef             	mov    rdi,r13
  a504cf:	e8 8e b5 02 00       	call   a7ba62 <JNI_OnUnload@@Base+0x332f>
  a504d4:	0f 57 c0             	xorps  xmm0,xmm0
  a504d7:	0f 11 43 48          	movups XMMWORD PTR [rbx+0x48],xmm0
  a504db:	48 c7 43 58 00 00 00 	mov    QWORD PTR [rbx+0x58],0x0
  a504e2:	00
  a504e3:	4d 89 3e             	mov    QWORD PTR [r14],r15
  a504e6:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
  a504ea:	4c 89 f0             	mov    rax,r14
  a504ed:	48 83 c4 08          	add    rsp,0x8
  a504f1:	5b                   	pop    rbx
  a504f2:	41 5c                	pop    r12
  a504f4:	41 5d                	pop    r13
  a504f6:	41 5e                	pop    r14
  a504f8:	41 5f                	pop    r15
  a504fa:	5d                   	pop    rbp
  a504fb:	c3                   	ret
  a504fc:	49 89 c6             	mov    r14,rax
  a504ff:	41 f6 07 01          	test   BYTE PTR [r15],0x1
  a50503:	74 0e                	je     a50513 <_ZdaPv@@Base+0x1a3>
  a50505:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  a50509:	e8 12 da d9 00       	call   17edf20 <_ZdlPv@plt>
  a5050e:	eb 03                	jmp    a50513 <_ZdaPv@@Base+0x1a3>
  a50510:	49 89 c6             	mov    r14,rax
  a50513:	48 89 df             	mov    rdi,rbx
  a50516:	e8 f5 da d9 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  a5051b:	48 89 df             	mov    rdi,rbx
  a5051e:	e8 fd d9 d9 00       	call   17edf20 <_ZdlPv@plt>
  a50523:	4c 89 f7             	mov    rdi,r14
  a50526:	e8 a5 f7 01 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a5052b:	cc                   	int3
  a5052c:	cc                   	int3
  a5052d:	cc                   	int3
  a5052e:	cc                   	int3
  a5052f:	cc                   	int3
  a50530:	41 57                	push   r15
  a50532:	41 56                	push   r14
  a50534:	41 54                	push   r12
  a50536:	53                   	push   rbx
  a50537:	50                   	push   rax
  a50538:	49 89 cf             	mov    r15,rcx
  a5053b:	49 89 d4             	mov    r12,rdx
  a5053e:	48 89 f1             	mov    rcx,rsi
  a50541:	48 89 fb             	mov    rbx,rdi
  a50544:	44 89 c6             	mov    esi,r8d
  a50547:	4c 89 ca             	mov    rdx,r9
  a5054a:	e8 91 f8 d9 00       	call   17efde0 <_ZNSt6__ndk112system_errorC2ENS_10error_codeERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@plt>
  a5054f:	48 8b 05 b2 19 e6 00 	mov    rax,QWORD PTR [rip+0xe619b2]        # 18b1f08 <_ZTVNSt6__ndk14__fs10filesystem16filesystem_errorE@@Base+0xbcde8>
  a50556:	48 83 c0 10          	add    rax,0x10
  a5055a:	48 89 03             	mov    QWORD PTR [rbx],rax
  a5055d:	4c 8d 73 20          	lea    r14,[rbx+0x20]
  a50561:	48 8d 74 24 07       	lea    rsi,[rsp+0x7]
  a50566:	4c 89 f7             	mov    rdi,r14
  a50569:	4c 89 e2             	mov    rdx,r12
  a5056c:	4c 89 f9             	mov    rcx,r15
  a5056f:	e8 4c 00 00 00       	call   a505c0 <_ZdaPv@@Base+0x250>
  a50574:	48 89 df             	mov    rdi,rbx
  a50577:	be 02 00 00 00       	mov    esi,0x2
  a5057c:	e8 5f f6 d9 00       	call   17efbe0 <_ZNSt6__ndk14__fs10filesystem16filesystem_error13__create_whatEi@plt>
  a50581:	48 83 c4 08          	add    rsp,0x8
  a50585:	5b                   	pop    rbx
  a50586:	41 5c                	pop    r12
  a50588:	41 5e                	pop    r14
  a5058a:	41 5f                	pop    r15
  a5058c:	c3                   	ret
  a5058d:	49 89 c7             	mov    r15,rax
  a50590:	4c 89 f7             	mov    rdi,r14
  a50593:	e8 58 ef ff ff       	call   a4f4f0 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iteratorC1ERKNS1_4pathENS1_17directory_optionsEPNS_10error_codeE@@Base+0x3e0>
  a50598:	48 89 df             	mov    rdi,rbx
  a5059b:	e8 50 f6 d9 00       	call   17efbf0 <_ZNSt6__ndk112system_errorD2Ev@plt>
  a505a0:	4c 89 ff             	mov    rdi,r15
  a505a3:	e8 28 f7 01 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a505a8:	49 89 c7             	mov    r15,rax
  a505ab:	48 89 df             	mov    rdi,rbx
  a505ae:	e8 3d f6 d9 00       	call   17efbf0 <_ZNSt6__ndk112system_errorD2Ev@plt>
  a505b3:	4c 89 ff             	mov    rdi,r15
  a505b6:	e8 15 f7 01 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a505bb:	cc                   	int3
  a505bc:	cc                   	int3
  a505bd:	cc                   	int3
  a505be:	cc                   	int3
  a505bf:	cc                   	int3
  a505c0:	55                   	push   rbp
  a505c1:	41 57                	push   r15
```
### filtered dataflow rows for `0xa50370`

| addr | instruction |
|---:|---|
| `0xa502f3` | `a502f3:	4c 89 f7             	mov    rdi,r14` |
| `0xa50300` | `a50300:	48 8d 05 11 90 da 00 	lea    rax,[rip+0xda9011]        # 17f9318 <_ZTINSt6__ndk111regex_errorE@@Base+0x28>` |
| `0xa50307` | `a50307:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xa50311` | `a50311:	48 89 fb             	mov    rbx,rdi` |
| `0xa50314` | `a50314:	48 8d 05 fd 8f da 00 	lea    rax,[rip+0xda8ffd]        # 17f9318 <_ZTINSt6__ndk111regex_errorE@@Base+0x28>` |
| `0xa5031b` | `a5031b:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xa50323` | `a50323:	48 89 df             	mov    rdi,rbx` |
| `0xa50331` | `a50331:	48 89 fb             	mov    rbx,rdi` |
| `0xa50334` | `a50334:	f6 47 48 01          	test   BYTE PTR [rdi+0x48],0x1` |
| `0xa50338` | `a50338:	75 0e                	jne    a50348 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa28>` |
| `0xa5033a` | `a5033a:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1` |
| `0xa5033e` | `a5033e:	75 17                	jne    a50357 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa37>` |
| `0xa50340` | `a50340:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1` |
| `0xa50344` | `a50344:	75 20                	jne    a50366 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa46>` |
| `0xa50348` | `a50348:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]` |
| `0xa50351` | `a50351:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1` |
| `0xa50355` | `a50355:	74 e9                	je     a50340 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa20>` |
| `0xa50357` | `a50357:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xa50360` | `a50360:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1` |
| `0xa50364` | `a50364:	74 e0                	je     a50346 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa26>` |
| `0xa50366` | `a50366:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]` |
| `0xa50389` | `a50389:	49 89 d7             	mov    r15,rdx` |
| `0xa5038c` | `a5038c:	48 89 f0             	mov    rax,rsi` |
| `0xa5038f` | `a5038f:	48 89 fb             	mov    rbx,rdi` |
| `0xa50394` | `a50394:	4c 89 c2             	mov    rdx,r8` |
| `0xa503ad` | `a503ad:	4c 8d 73 20          	lea    r14,[rbx+0x20]` |
| `0xa503b9` | `a503b9:	48 c7 44 24 20 00 00 	mov    QWORD PTR [rsp+0x20],0x0` |
| `0xa503c2` | `a503c2:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]` |
| `0xa503cc` | `a503cc:	4c 89 f7             	mov    rdi,r14` |
| `0xa503cf` | `a503cf:	4c 89 fa             	mov    rdx,r15` |
| `0xa503de` | `a503de:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]` |
| `0xa503e8` | `a503e8:	48 89 df             	mov    rdi,rbx` |
| `0xa50402` | `a50402:	4c 89 f7             	mov    rdi,r14` |
| `0xa50405` | `a50405:	e8 e6 f0 ff ff       	call   a4f4f0 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iteratorC1ERKNS1_4pathENS1_17directory_optionsEPNS_10error_codeE@@Base+0x3e0>` |
| `0xa5040a` | `a5040a:	48 89 df             	mov    rdi,rbx` |
| `0xa50412` | `a50412:	4c 89 ff             	mov    rdi,r15` |
| `0xa50424` | `a50424:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]` |
| `0xa5042e` | `a5042e:	48 89 df             	mov    rdi,rbx` |
| `0xa50436` | `a50436:	4c 89 ff             	mov    rdi,r15` |
| `0xa5044e` | `a5044e:	48 89 d5             	mov    rbp,rdx` |
| `0xa50451` | `a50451:	49 89 fe             	mov    r14,rdi` |
| `0xa5046b` | `a5046b:	48 8d 05 a6 8e da 00 	lea    rax,[rip+0xda8ea6]        # 17f9318 <_ZTINSt6__ndk111regex_errorE@@Base+0x28>` |
| `0xa50476` | `a50476:	4d 8d 7d 18          	lea    r15,[r13+0x18]` |
| `0xa50492` | `a50492:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]` |
| `0xa50496` | `a50496:	48 8b 75 10          	mov    rsi,QWORD PTR [rbp+0x10]` |
| `0xa5049a` | `a5049a:	4c 89 ff             	mov    rdi,r15` |
| `0xa504c2` | `a504c2:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]` |
| `0xa504c7` | `a504c7:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]` |
| `0xa504cc` | `a504cc:	4c 89 ef             	mov    rdi,r13` |
| `0xa50505` | `a50505:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]` |
| `0xa50513` | `a50513:	48 89 df             	mov    rdi,rbx` |
| `0xa5051b` | `a5051b:	48 89 df             	mov    rdi,rbx` |
| `0xa50523` | `a50523:	4c 89 f7             	mov    rdi,r14` |
| `0xa5053b` | `a5053b:	49 89 d4             	mov    r12,rdx` |
| `0xa5053e` | `a5053e:	48 89 f1             	mov    rcx,rsi` |
| `0xa50541` | `a50541:	48 89 fb             	mov    rbx,rdi` |
| `0xa50547` | `a50547:	4c 89 ca             	mov    rdx,r9` |
| `0xa5055d` | `a5055d:	4c 8d 73 20          	lea    r14,[rbx+0x20]` |
| `0xa50561` | `a50561:	48 8d 74 24 07       	lea    rsi,[rsp+0x7]` |
| `0xa50566` | `a50566:	4c 89 f7             	mov    rdi,r14` |
| `0xa50569` | `a50569:	4c 89 e2             	mov    rdx,r12` |
| `0xa50574` | `a50574:	48 89 df             	mov    rdi,rbx` |
| `0xa50590` | `a50590:	4c 89 f7             	mov    rdi,r14` |
| `0xa50593` | `a50593:	e8 58 ef ff ff       	call   a4f4f0 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iteratorC1ERKNS1_4pathENS1_17directory_optionsEPNS_10error_codeE@@Base+0x3e0>` |
| `0xa50598` | `a50598:	48 89 df             	mov    rdi,rbx` |
| `0xa505a0` | `a505a0:	4c 89 ff             	mov    rdi,r15` |
| `0xa505ab` | `a505ab:	48 89 df             	mov    rdi,rbx` |
| `0xa505b3` | `a505b3:	4c 89 ff             	mov    rdi,r15` |

## Candidate `+0xa0` method `0xad647a` full window

```text
  ad63cf:	6a 40                	push   0x40
  ad63d1:	5f                   	pop    rdi
  ad63d2:	e8 29 7b d1 00       	call   17edf00 <_Znwm@plt>
  ad63d7:	48 89 c3             	mov    rbx,rax
  ad63da:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  ad63de:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  ad63e3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  ad63e8:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  ad63ef:	00 00
  ad63f1:	48 8d 05 78 ab d2 00 	lea    rax,[rip+0xd2ab78]        # 1800f70 <_ZTIN4asio22service_already_existsE@@Base+0x2758>
  ad63f8:	48 89 03             	mov    QWORD PTR [rbx],rax
  ad63fb:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  ad63ff:	4c 89 f6             	mov    rsi,r14
  ad6402:	e8 89 3e fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad6407:	48 89 e7             	mov    rdi,rsp
  ad640a:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  ad640e:	e8 b7 3e fa ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  ad6413:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad641a:	00 00
  ad641c:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  ad6421:	75 2e                	jne    ad6451 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x233f1>
  ad6423:	48 89 d8             	mov    rax,rbx
  ad6426:	48 83 c4 28          	add    rsp,0x28
  ad642a:	5b                   	pop    rbx
  ad642b:	41 5e                	pop    r14
  ad642d:	c3                   	ret
  ad642e:	48 89 c3             	mov    rbx,rax
  ad6431:	48 89 e7             	mov    rdi,rsp
  ad6434:	e8 91 3e fa ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  ad6439:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad6440:	00 00
  ad6442:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  ad6447:	75 08                	jne    ad6451 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x233f1>
  ad6449:	48 89 df             	mov    rdi,rbx
  ad644c:	e8 7f 98 f9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  ad6451:	e8 5a 96 d1 00       	call   17efab0 <__stack_chk_fail@plt>
  ad6456:	48 8d 47 10          	lea    rax,[rdi+0x10]
  ad645a:	48 8d 0d 0f ab d2 00 	lea    rcx,[rip+0xd2ab0f]        # 1800f70 <_ZTIN4asio22service_already_existsE@@Base+0x2758>
  ad6461:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  ad6464:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  ad6468:	48 89 c6             	mov    rsi,rax
  ad646b:	e9 20 3e fa ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad6470:	48 83 c7 10          	add    rdi,0x10
  ad6474:	e9 f1 3a fa ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  ad6479:	cc                   	int3
  ad647a:	53                   	push   rbx
  ad647b:	48 89 fb             	mov    rbx,rdi
  ad647e:	48 83 c7 10          	add    rdi,0x10
  ad6482:	e8 e3 3a fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad6487:	48 89 df             	mov    rdi,rbx
  ad648a:	5b                   	pop    rbx
  ad648b:	e9 90 7a d1 00       	jmp    17edf20 <_ZdlPv@plt>
  ad6490:	41 57                	push   r15
  ad6492:	41 56                	push   r14
  ad6494:	41 55                	push   r13
  ad6496:	41 54                	push   r12
  ad6498:	53                   	push   rbx
  ad6499:	48 81 ec 60 01 00 00 	sub    rsp,0x160
  ad64a0:	4d 89 cf             	mov    r15,r9
  ad64a3:	4d 89 c4             	mov    r12,r8
  ad64a6:	49 89 f6             	mov    r14,rsi
  ad64a9:	48 89 fb             	mov    rbx,rdi
  ad64ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad64b3:	00 00
  ad64b5:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  ad64bc:	00
  ad64bd:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
  ad64c2:	4c 89 ef             	mov    rdi,r13
  ad64c5:	48 89 ce             	mov    rsi,rcx
  ad64c8:	e8 a3 af b2 00       	call   1601470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4469f4>
  ad64cd:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  ad64d4:	00
  ad64d5:	4c 89 e6             	mov    rsi,r12
  ad64d8:	e8 29 01 00 00       	call   ad6606 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235a6>
  ad64dd:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  ad64e4:	00
  ad64e5:	4c 89 fe             	mov    rsi,r15
  ad64e8:	e8 5d 01 00 00       	call   ad664a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235ea>
  ad64ed:	4c 89 ef             	mov    rdi,r13
  ad64f0:	e8 bd b7 b2 00       	call   1601cb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x447236>
  ad64f5:	84 c0                	test   al,al
  ad64f7:	75 4e                	jne    ad6547 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x234e7>
  ad64f9:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  ad64fd:	e8 60 3f fa ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  ad6502:	84 c0                	test   al,al
  ad6504:	74 41                	je     ad6547 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x234e7>
  ad6506:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
  ad650d:	00
  ad650e:	4c 89 f7             	mov    rdi,r14
  ad6511:	e8 e6 3e b1 00       	call   15ea3fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f980>
  ad6516:	41 c7 06 0b 00 00 00 	mov    DWORD PTR [r14],0xb
  ad651d:	48 8d 05 34 a3 e7 00 	lea    rax,[rip+0xe7a334]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
  ad6524:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  ad6528:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
  ad652f:	00
  ad6530:	4c 89 f6             	mov    rsi,r14
  ad6533:	e8 58 78 fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  ad6538:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  ad653f:	00
  ad6540:	e8 0f 09 fd ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
  ad6545:	eb 12                	jmp    ad6559 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x234f9>
  ad6547:	48 8b bc 24 40 01 00 	mov    rdi,QWORD PTR [rsp+0x140]
  ad654e:	00
  ad654f:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  ad6554:	e8 37 78 fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  ad6559:	48 89 df             	mov    rdi,rbx
  ad655c:	e8 b0 85 b7 00       	call   164eb11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7d>
  ad6561:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  ad6568:	00
  ad6569:	e8 fc 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad656e:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  ad6575:	00
  ad6576:	e8 ef 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad657b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  ad6580:	e8 19 b0 b2 00       	call   160159e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x446b22>
  ad6585:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad658c:	00 00
  ad658e:	48 3b 84 24 58 01 00 	cmp    rax,QWORD PTR [rsp+0x158]
  ad6595:	00
  ad6596:	75 68                	jne    ad6600 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235a0>
  ad6598:	48 89 d8             	mov    rax,rbx
  ad659b:	48 81 c4 60 01 00 00 	add    rsp,0x160
  ad65a2:	5b                   	pop    rbx
  ad65a3:	41 5c                	pop    r12
  ad65a5:	41 5d                	pop    r13
  ad65a7:	41 5e                	pop    r14
  ad65a9:	41 5f                	pop    r15
  ad65ab:	c3                   	ret
  ad65ac:	48 89 c3             	mov    rbx,rax
  ad65af:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  ad65b6:	00
  ad65b7:	e8 98 08 fd ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
  ad65bc:	eb 03                	jmp    ad65c1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23561>
  ad65be:	48 89 c3             	mov    rbx,rax
  ad65c1:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  ad65c8:	00
  ad65c9:	e8 9c 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad65ce:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  ad65d5:	00
  ad65d6:	e8 8f 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad65db:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  ad65e0:	e8 b9 af b2 00       	call   160159e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x446b22>
  ad65e5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad65ec:	00 00
  ad65ee:	48 3b 84 24 58 01 00 	cmp    rax,QWORD PTR [rsp+0x158]
  ad65f5:	00
  ad65f6:	75 08                	jne    ad6600 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235a0>
  ad65f8:	48 89 df             	mov    rdi,rbx
  ad65fb:	e8 d0 96 f9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  ad6600:	e8 ab 94 d1 00       	call   17efab0 <__stack_chk_fail@plt>
  ad6605:	cc                   	int3
  ad6606:	50                   	push   rax
  ad6607:	48 89 f8             	mov    rax,rdi
  ad660a:	48 8b 56 20          	mov    rdx,QWORD PTR [rsi+0x20]
  ad660e:	48 85 d2             	test   rdx,rdx
  ad6611:	74 0f                	je     ad6622 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235c2>
  ad6613:	48 8d 4e 20          	lea    rcx,[rsi+0x20]
  ad6617:	48 39 f2             	cmp    rdx,rsi
  ad661a:	74 13                	je     ad662f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235cf>
  ad661c:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
  ad6620:	eb 07                	jmp    ad6629 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235c9>
  ad6622:	48 83 c0 20          	add    rax,0x20
  ad6626:	48 89 c1             	mov    rcx,rax
  ad6629:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  ad662d:	eb 10                	jmp    ad663f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235df>
  ad662f:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
  ad6633:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  ad6636:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ad6639:	48 89 c6             	mov    rsi,rax
  ad663c:	ff 51 18             	call   QWORD PTR [rcx+0x18]
  ad663f:	58                   	pop    rax
  ad6640:	c3                   	ret
  ad6641:	48 89 c7             	mov    rdi,rax
  ad6644:	e8 5c 34 fa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ad6649:	cc                   	int3
  ad664a:	50                   	push   rax
  ad664b:	48 89 f8             	mov    rax,rdi
  ad664e:	48 8b 56 20          	mov    rdx,QWORD PTR [rsi+0x20]
  ad6652:	48 85 d2             	test   rdx,rdx
  ad6655:	74 0f                	je     ad6666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23606>
  ad6657:	48 8d 4e 20          	lea    rcx,[rsi+0x20]
  ad665b:	48 39 f2             	cmp    rdx,rsi
  ad665e:	74 13                	je     ad6673 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23613>
  ad6660:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
  ad6664:	eb 07                	jmp    ad666d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2360d>
  ad6666:	48 83 c0 20          	add    rax,0x20
  ad666a:	48 89 c1             	mov    rcx,rax
  ad666d:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  ad6671:	eb 10                	jmp    ad6683 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23623>
  ad6673:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
  ad6677:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  ad667a:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ad667d:	48 89 c6             	mov    rsi,rax
  ad6680:	ff 51 18             	call   QWORD PTR [rcx+0x18]
  ad6683:	58                   	pop    rax
  ad6684:	c3                   	ret
  ad6685:	48 89 c7             	mov    rdi,rax
  ad6688:	e8 18 34 fa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ad668d:	cc                   	int3
  ad668e:	41 56                	push   r14
  ad6690:	53                   	push   rbx
  ad6691:	50                   	push   rax
  ad6692:	31 c0                	xor    eax,eax
  ad6694:	88 07                	mov    BYTE PTR [rdi],al
  ad6696:	88 47 58             	mov    BYTE PTR [rdi+0x58],al
  ad6699:	38 46 58             	cmp    BYTE PTR [rsi+0x58],al
  ad669c:	74 0c                	je     ad66aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2364a>
  ad669e:	48 89 fb             	mov    rbx,rdi
  ad66a1:	e8 f2 0d 00 00       	call   ad7498 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24438>
  ad66a6:	c6 43 58 01          	mov    BYTE PTR [rbx+0x58],0x1
  ad66aa:	48 83 c4 08          	add    rsp,0x8
  ad66ae:	5b                   	pop    rbx
  ad66af:	41 5e                	pop    r14
  ad66b1:	c3                   	ret
  ad66b2:	49 89 c6             	mov    r14,rax
  ad66b5:	48 89 df             	mov    rdi,rbx
  ad66b8:	e8 ab 01 00 00       	call   ad6868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23808>
  ad66bd:	4c 89 f7             	mov    rdi,r14
  ad66c0:	e8 0b 96 f9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  ad66c5:	cc                   	int3
  ad66c6:	41 57                	push   r15
  ad66c8:	41 56                	push   r14
  ad66ca:	41 54                	push   r12
  ad66cc:	53                   	push   rbx
  ad66cd:	48 83 ec 18          	sub    rsp,0x18
  ad66d1:	49 89 f6             	mov    r14,rsi
  ad66d4:	48 89 fb             	mov    rbx,rdi
  ad66d7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad66de:	00 00
  ad66e0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  ad66e5:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
  ad66e9:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  ad66ed:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
  ad66f0:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  ad66f3:	0f 57 c0             	xorps  xmm0,xmm0
```
### filtered dataflow rows for `0xad647a`

| addr | instruction |
|---:|---|
| `0xad63d1` | `ad63d1:	5f                   	pop    rdi` |
| `0xad63fb` | `ad63fb:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0xad63ff` | `ad63ff:	4c 89 f6             	mov    rsi,r14` |
| `0xad6407` | `ad6407:	48 89 e7             	mov    rdi,rsp` |
| `0xad640a` | `ad640a:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0xad641c` | `ad641c:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xad6431` | `ad6431:	48 89 e7             	mov    rdi,rsp` |
| `0xad6442` | `ad6442:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xad6449` | `ad6449:	48 89 df             	mov    rdi,rbx` |
| `0xad6456` | `ad6456:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0xad6461` | `ad6461:	48 89 0e             	mov    QWORD PTR [rsi],rcx` |
| `0xad6464` | `ad6464:	48 8d 7e 10          	lea    rdi,[rsi+0x10]` |
| `0xad6468` | `ad6468:	48 89 c6             	mov    rsi,rax` |
| `0xad6470` | `ad6470:	48 83 c7 10          	add    rdi,0x10` |
| `0xad6474` | `ad6474:	e9 f1 3a fa ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xad647b` | `ad647b:	48 89 fb             	mov    rbx,rdi` |
| `0xad647e` | `ad647e:	48 83 c7 10          	add    rdi,0x10` |
| `0xad6482` | `ad6482:	e8 e3 3a fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xad6487` | `ad6487:	48 89 df             	mov    rdi,rbx` |
| `0xad64a6` | `ad64a6:	49 89 f6             	mov    r14,rsi` |
| `0xad64a9` | `ad64a9:	48 89 fb             	mov    rbx,rdi` |
| `0xad64c2` | `ad64c2:	4c 89 ef             	mov    rdi,r13` |
| `0xad64c5` | `ad64c5:	48 89 ce             	mov    rsi,rcx` |
| `0xad64cd` | `ad64cd:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]` |
| `0xad64d5` | `ad64d5:	4c 89 e6             	mov    rsi,r12` |
| `0xad64dd` | `ad64dd:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]` |
| `0xad64e5` | `ad64e5:	4c 89 fe             	mov    rsi,r15` |
| `0xad64ed` | `ad64ed:	4c 89 ef             	mov    rdi,r13` |
| `0xad64f9` | `ad64f9:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]` |
| `0xad650e` | `ad650e:	4c 89 f7             	mov    rdi,r14` |
| `0xad6528` | `ad6528:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]` |
| `0xad6530` | `ad6530:	4c 89 f6             	mov    rsi,r14` |
| `0xad6538` | `ad6538:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]` |
| `0xad6547` | `ad6547:	48 8b bc 24 40 01 00 	mov    rdi,QWORD PTR [rsp+0x140]` |
| `0xad654f` | `ad654f:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]` |
| `0xad6559` | `ad6559:	48 89 df             	mov    rdi,rbx` |
| `0xad6561` | `ad6561:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]` |
| `0xad6569` | `ad6569:	e8 fc 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xad656e` | `ad656e:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]` |
| `0xad6576` | `ad6576:	e8 ef 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xad657b` | `ad657b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]` |
| `0xad65af` | `ad65af:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]` |
| `0xad65c1` | `ad65c1:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]` |
| `0xad65c9` | `ad65c9:	e8 9c 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xad65ce` | `ad65ce:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]` |
| `0xad65d6` | `ad65d6:	e8 8f 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xad65db` | `ad65db:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]` |
| `0xad65f8` | `ad65f8:	48 89 df             	mov    rdi,rbx` |
| `0xad6607` | `ad6607:	48 89 f8             	mov    rax,rdi` |
| `0xad660a` | `ad660a:	48 8b 56 20          	mov    rdx,QWORD PTR [rsi+0x20]` |
| `0xad660e` | `ad660e:	48 85 d2             	test   rdx,rdx` |
| `0xad6613` | `ad6613:	48 8d 4e 20          	lea    rcx,[rsi+0x20]` |
| `0xad6617` | `ad6617:	48 39 f2             	cmp    rdx,rsi` |
| `0xad661c` | `ad661c:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx` |
| `0xad662f` | `ad662f:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax` |
| `0xad6633` | `ad6633:	48 8b 39             	mov    rdi,QWORD PTR [rcx]` |
| `0xad6636` | `ad6636:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]` |
| `0xad6639` | `ad6639:	48 89 c6             	mov    rsi,rax` |
| `0xad663c` | `ad663c:	ff 51 18             	call   QWORD PTR [rcx+0x18]` |
| `0xad6641` | `ad6641:	48 89 c7             	mov    rdi,rax` |
| `0xad664b` | `ad664b:	48 89 f8             	mov    rax,rdi` |
| `0xad664e` | `ad664e:	48 8b 56 20          	mov    rdx,QWORD PTR [rsi+0x20]` |
| `0xad6652` | `ad6652:	48 85 d2             	test   rdx,rdx` |
| `0xad6657` | `ad6657:	48 8d 4e 20          	lea    rcx,[rsi+0x20]` |
| `0xad665b` | `ad665b:	48 39 f2             	cmp    rdx,rsi` |
| `0xad6660` | `ad6660:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx` |
| `0xad6673` | `ad6673:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax` |
| `0xad6677` | `ad6677:	48 8b 39             	mov    rdi,QWORD PTR [rcx]` |
| `0xad667a` | `ad667a:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]` |
| `0xad667d` | `ad667d:	48 89 c6             	mov    rsi,rax` |
| `0xad6680` | `ad6680:	ff 51 18             	call   QWORD PTR [rcx+0x18]` |
| `0xad6685` | `ad6685:	48 89 c7             	mov    rdi,rax` |
| `0xad6694` | `ad6694:	88 07                	mov    BYTE PTR [rdi],al` |
| `0xad6696` | `ad6696:	88 47 58             	mov    BYTE PTR [rdi+0x58],al` |
| `0xad6699` | `ad6699:	38 46 58             	cmp    BYTE PTR [rsi+0x58],al` |
| `0xad669e` | `ad669e:	48 89 fb             	mov    rbx,rdi` |
| `0xad66b5` | `ad66b5:	48 89 df             	mov    rdi,rbx` |
| `0xad66bd` | `ad66bd:	4c 89 f7             	mov    rdi,r14` |
| `0xad66d1` | `ad66d1:	49 89 f6             	mov    r14,rsi` |
| `0xad66d4` | `ad66d4:	48 89 fb             	mov    rbx,rdi` |
| `0xad66e5` | `ad66e5:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]` |
| `0xad66e9` | `ad66e9:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax` |
| `0xad66ed` | `ad66ed:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]` |
| `0xad66f0` | `ad66f0:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |

## Candidate `+0xa0` method `0xe9929a` full window

```text
  e99206:	5b                   	pop    rbx
  e99207:	e9 7a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9920c:	53                   	push   rbx
  e9920d:	48 83 ec 20          	sub    rsp,0x20
  e99211:	48 89 fe             	mov    rsi,rdi
  e99214:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9921b:	00 00
  e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e99222:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  e99227:	48 89 df             	mov    rdi,rbx
  e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99232:	48 85 ff             	test   rdi,rdi
  e99235:	74 06                	je     e9923d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60653>
  e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99249:	00 00
  e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
```
### filtered dataflow rows for `0xe9929a`

| addr | instruction |
|---:|---|
| `0xe99211` | `e99211:	48 89 fe             	mov    rsi,rdi` |
| `0xe9921d` | `e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xe99227` | `e99227:	48 89 df             	mov    rdi,rbx` |
| `0xe9922f` | `e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99232` | `e99232:	48 85 ff             	test   rdi,rdi` |
| `0xe99237` | `e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe9923a` | `e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe9923d` | `e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe9924b` | `e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xe99261` | `e99261:	48 89 c7             	mov    rdi,rax` |
| `0xe9926b` | `e9926b:	48 89 fb             	mov    rbx,rdi` |
| `0xe99270` | `e99270:	5f                   	pop    rdi` |
| `0xe9928f` | `e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0xe99292` | `e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]` |
| `0xe99295` | `e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al` |
| `0xe9929a` | `e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0` |
| `0xe992a9` | `e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe992ac` | `e992ac:	48 83 c7 10          	add    rdi,0x10` |
| `0xe992b0` | `e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xe992b7` | `e992b7:	48 89 fb             	mov    rbx,rdi` |
| `0xe992bf` | `e992bf:	48 89 df             	mov    rdi,rbx` |
| `0xe992d8` | `e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xe992dd` | `e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]` |
| `0xe992e3` | `e992e3:	5f                   	pop    rdi` |
| `0xe9930d` | `e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0xe99311` | `e99311:	4c 89 f6             	mov    rsi,r14` |
| `0xe99319` | `e99319:	48 89 e7             	mov    rdi,rsp` |
| `0xe9931c` | `e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0xe9932e` | `e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe99343` | `e99343:	48 89 e7             	mov    rdi,rsp` |
| `0xe99354` | `e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe9935b` | `e9935b:	48 89 df             	mov    rdi,rbx` |
| `0xe99368` | `e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0xe99373` | `e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx` |
| `0xe99376` | `e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]` |
| `0xe9937a` | `e9937a:	48 89 c6             	mov    rsi,rax` |
| `0xe99382` | `e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xe99393` | `e99393:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe9939d` | `e9939d:	48 89 fb             	mov    rbx,rdi` |
| `0xe993a5` | `e993a5:	48 89 df             	mov    rdi,rbx` |
| `0xe993ae` | `e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xe993b2` | `e993b2:	48 83 c7 20          	add    rdi,0x20` |
| `0xe993b6` | `e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]` |
| `0xe993c1` | `e993c1:	49 89 d6             	mov    r14,rdx` |
| `0xe993c4` | `e993c4:	48 89 f3             	mov    rbx,rsi` |
| `0xe993cb` | `e993cb:	49 89 fc             	mov    r12,rdi` |
| `0xe993ce` | `e993ce:	48 39 df             	cmp    rdi,rbx` |
| `0xe993d3` | `e993d3:	4c 89 e7             	mov    rdi,r12` |
| `0xe993d6` | `e993d6:	4c 89 f6             	mov    rsi,r14` |
| `0xe993d9` | `e993d9:	4c 89 fa             	mov    rdx,r15` |
| `0xe993e1` | `e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]` |
| `0xe993fd` | `e993fd:	48 89 fb             	mov    rbx,rdi` |
| `0xe99405` | `e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1` |
| `0xe99416` | `e99416:	48 89 fb             	mov    rbx,rdi` |
| `0xe9942f` | `e9942f:	4c 89 f7             	mov    rdi,r14` |
| `0xe99432` | `e99432:	48 89 de             	mov    rsi,rbx` |
| `0xe9943a` | `e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe9943d` | `e9943d:	48 85 f6             	test   rsi,rsi` |
| `0xe99446` | `e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe99449` | `e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe9944e` | `e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe99454` | `e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xe99459` | `e99459:	48 89 df             	mov    rdi,rbx` |
| `0xe9945c` | `e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe9945f` | `e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99469` | `e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe99494` | `e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe994a3` | `e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe994c0` | `e994c0:	48 89 df             	mov    rdi,rbx` |
| `0xe994db` | `e994db:	49 89 f6             	mov    r14,rsi` |
| `0xe994de` | `e994de:	48 89 fb             	mov    rbx,rdi` |
| `0xe994ea` | `e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xe994ef` | `e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]` |
| `0xe994f3` | `e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]` |
| `0xe994f7` | `e994f7:	49 39 f7             	cmp    r15,rsi` |
| `0xe994fc` | `e994fc:	4c 89 ff             	mov    rdi,r15` |
| `0xe994ff` | `e994ff:	4c 89 f6             	mov    rsi,r14` |
| `0xe99515` | `e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99518` | `e99518:	49 29 ff             	sub    r15,rdi` |

## Candidate `+0xa0` method `0xe992a2` full window

```text
  e9920d:	48 83 ec 20          	sub    rsp,0x20
  e99211:	48 89 fe             	mov    rsi,rdi
  e99214:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9921b:	00 00
  e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e99222:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  e99227:	48 89 df             	mov    rdi,rbx
  e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99232:	48 85 ff             	test   rdi,rdi
  e99235:	74 06                	je     e9923d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60653>
  e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99249:	00 00
  e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
```
### filtered dataflow rows for `0xe992a2`

| addr | instruction |
|---:|---|
| `0xe99211` | `e99211:	48 89 fe             	mov    rsi,rdi` |
| `0xe9921d` | `e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xe99227` | `e99227:	48 89 df             	mov    rdi,rbx` |
| `0xe9922f` | `e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99232` | `e99232:	48 85 ff             	test   rdi,rdi` |
| `0xe99237` | `e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe9923a` | `e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe9923d` | `e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe9924b` | `e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xe99261` | `e99261:	48 89 c7             	mov    rdi,rax` |
| `0xe9926b` | `e9926b:	48 89 fb             	mov    rbx,rdi` |
| `0xe99270` | `e99270:	5f                   	pop    rdi` |
| `0xe9928f` | `e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0xe99292` | `e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]` |
| `0xe99295` | `e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al` |
| `0xe9929a` | `e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0` |
| `0xe992a9` | `e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe992ac` | `e992ac:	48 83 c7 10          	add    rdi,0x10` |
| `0xe992b0` | `e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xe992b7` | `e992b7:	48 89 fb             	mov    rbx,rdi` |
| `0xe992bf` | `e992bf:	48 89 df             	mov    rdi,rbx` |
| `0xe992d8` | `e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xe992dd` | `e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]` |
| `0xe992e3` | `e992e3:	5f                   	pop    rdi` |
| `0xe9930d` | `e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0xe99311` | `e99311:	4c 89 f6             	mov    rsi,r14` |
| `0xe99319` | `e99319:	48 89 e7             	mov    rdi,rsp` |
| `0xe9931c` | `e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0xe9932e` | `e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe99343` | `e99343:	48 89 e7             	mov    rdi,rsp` |
| `0xe99354` | `e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe9935b` | `e9935b:	48 89 df             	mov    rdi,rbx` |
| `0xe99368` | `e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0xe99373` | `e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx` |
| `0xe99376` | `e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]` |
| `0xe9937a` | `e9937a:	48 89 c6             	mov    rsi,rax` |
| `0xe99382` | `e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xe99393` | `e99393:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe9939d` | `e9939d:	48 89 fb             	mov    rbx,rdi` |
| `0xe993a5` | `e993a5:	48 89 df             	mov    rdi,rbx` |
| `0xe993ae` | `e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xe993b2` | `e993b2:	48 83 c7 20          	add    rdi,0x20` |
| `0xe993b6` | `e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]` |
| `0xe993c1` | `e993c1:	49 89 d6             	mov    r14,rdx` |
| `0xe993c4` | `e993c4:	48 89 f3             	mov    rbx,rsi` |
| `0xe993cb` | `e993cb:	49 89 fc             	mov    r12,rdi` |
| `0xe993ce` | `e993ce:	48 39 df             	cmp    rdi,rbx` |
| `0xe993d3` | `e993d3:	4c 89 e7             	mov    rdi,r12` |
| `0xe993d6` | `e993d6:	4c 89 f6             	mov    rsi,r14` |
| `0xe993d9` | `e993d9:	4c 89 fa             	mov    rdx,r15` |
| `0xe993e1` | `e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]` |
| `0xe993fd` | `e993fd:	48 89 fb             	mov    rbx,rdi` |
| `0xe99405` | `e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1` |
| `0xe99416` | `e99416:	48 89 fb             	mov    rbx,rdi` |
| `0xe9942f` | `e9942f:	4c 89 f7             	mov    rdi,r14` |
| `0xe99432` | `e99432:	48 89 de             	mov    rsi,rbx` |
| `0xe9943a` | `e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe9943d` | `e9943d:	48 85 f6             	test   rsi,rsi` |
| `0xe99446` | `e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe99449` | `e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe9944e` | `e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe99454` | `e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xe99459` | `e99459:	48 89 df             	mov    rdi,rbx` |
| `0xe9945c` | `e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe9945f` | `e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99469` | `e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe99494` | `e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe994a3` | `e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe994c0` | `e994c0:	48 89 df             	mov    rdi,rbx` |
| `0xe994db` | `e994db:	49 89 f6             	mov    r14,rsi` |
| `0xe994de` | `e994de:	48 89 fb             	mov    rbx,rdi` |
| `0xe994ea` | `e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xe994ef` | `e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]` |
| `0xe994f3` | `e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]` |
| `0xe994f7` | `e994f7:	49 39 f7             	cmp    r15,rsi` |
| `0xe994fc` | `e994fc:	4c 89 ff             	mov    rdi,r15` |
| `0xe994ff` | `e994ff:	4c 89 f6             	mov    rsi,r14` |
| `0xe99515` | `e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99518` | `e99518:	49 29 ff             	sub    r15,rdi` |
| `0xe99522` | `e99522:	4c 89 fa             	mov    rdx,r15` |

## Candidate `+0xa0` method `0xe992b6` full window

```text
  e99222:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  e99227:	48 89 df             	mov    rdi,rbx
  e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99232:	48 85 ff             	test   rdi,rdi
  e99235:	74 06                	je     e9923d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60653>
  e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99249:	00 00
  e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
  e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
  e99531:	48 c1 fa 04          	sar    rdx,0x4
  e99535:	49 89 e5             	mov    r13,rsp
  e99538:	4c 89 ef             	mov    rdi,r13
```
### filtered dataflow rows for `0xe992b6`

| addr | instruction |
|---:|---|
| `0xe99227` | `e99227:	48 89 df             	mov    rdi,rbx` |
| `0xe9922f` | `e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99232` | `e99232:	48 85 ff             	test   rdi,rdi` |
| `0xe99237` | `e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe9923a` | `e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe9923d` | `e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe9924b` | `e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xe99261` | `e99261:	48 89 c7             	mov    rdi,rax` |
| `0xe9926b` | `e9926b:	48 89 fb             	mov    rbx,rdi` |
| `0xe99270` | `e99270:	5f                   	pop    rdi` |
| `0xe9928f` | `e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0xe99292` | `e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]` |
| `0xe99295` | `e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al` |
| `0xe9929a` | `e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0` |
| `0xe992a9` | `e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe992ac` | `e992ac:	48 83 c7 10          	add    rdi,0x10` |
| `0xe992b0` | `e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xe992b7` | `e992b7:	48 89 fb             	mov    rbx,rdi` |
| `0xe992bf` | `e992bf:	48 89 df             	mov    rdi,rbx` |
| `0xe992d8` | `e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xe992dd` | `e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]` |
| `0xe992e3` | `e992e3:	5f                   	pop    rdi` |
| `0xe9930d` | `e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0xe99311` | `e99311:	4c 89 f6             	mov    rsi,r14` |
| `0xe99319` | `e99319:	48 89 e7             	mov    rdi,rsp` |
| `0xe9931c` | `e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0xe9932e` | `e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe99343` | `e99343:	48 89 e7             	mov    rdi,rsp` |
| `0xe99354` | `e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe9935b` | `e9935b:	48 89 df             	mov    rdi,rbx` |
| `0xe99368` | `e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0xe99373` | `e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx` |
| `0xe99376` | `e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]` |
| `0xe9937a` | `e9937a:	48 89 c6             	mov    rsi,rax` |
| `0xe99382` | `e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xe99393` | `e99393:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe9939d` | `e9939d:	48 89 fb             	mov    rbx,rdi` |
| `0xe993a5` | `e993a5:	48 89 df             	mov    rdi,rbx` |
| `0xe993ae` | `e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xe993b2` | `e993b2:	48 83 c7 20          	add    rdi,0x20` |
| `0xe993b6` | `e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]` |
| `0xe993c1` | `e993c1:	49 89 d6             	mov    r14,rdx` |
| `0xe993c4` | `e993c4:	48 89 f3             	mov    rbx,rsi` |
| `0xe993cb` | `e993cb:	49 89 fc             	mov    r12,rdi` |
| `0xe993ce` | `e993ce:	48 39 df             	cmp    rdi,rbx` |
| `0xe993d3` | `e993d3:	4c 89 e7             	mov    rdi,r12` |
| `0xe993d6` | `e993d6:	4c 89 f6             	mov    rsi,r14` |
| `0xe993d9` | `e993d9:	4c 89 fa             	mov    rdx,r15` |
| `0xe993e1` | `e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]` |
| `0xe993fd` | `e993fd:	48 89 fb             	mov    rbx,rdi` |
| `0xe99405` | `e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1` |
| `0xe99416` | `e99416:	48 89 fb             	mov    rbx,rdi` |
| `0xe9942f` | `e9942f:	4c 89 f7             	mov    rdi,r14` |
| `0xe99432` | `e99432:	48 89 de             	mov    rsi,rbx` |
| `0xe9943a` | `e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe9943d` | `e9943d:	48 85 f6             	test   rsi,rsi` |
| `0xe99446` | `e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe99449` | `e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe9944e` | `e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe99454` | `e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xe99459` | `e99459:	48 89 df             	mov    rdi,rbx` |
| `0xe9945c` | `e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe9945f` | `e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99469` | `e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe99494` | `e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe994a3` | `e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe994c0` | `e994c0:	48 89 df             	mov    rdi,rbx` |
| `0xe994db` | `e994db:	49 89 f6             	mov    r14,rsi` |
| `0xe994de` | `e994de:	48 89 fb             	mov    rbx,rdi` |
| `0xe994ea` | `e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xe994ef` | `e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]` |
| `0xe994f3` | `e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]` |
| `0xe994f7` | `e994f7:	49 39 f7             	cmp    r15,rsi` |
| `0xe994fc` | `e994fc:	4c 89 ff             	mov    rdi,r15` |
| `0xe994ff` | `e994ff:	4c 89 f6             	mov    rsi,r14` |
| `0xe99515` | `e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99518` | `e99518:	49 29 ff             	sub    r15,rdi` |
| `0xe99522` | `e99522:	4c 89 fa             	mov    rdx,r15` |
| `0xe9952a` | `e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0xe9952e` | `e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]` |
| `0xe99531` | `e99531:	48 c1 fa 04          	sar    rdx,0x4` |
| `0xe99538` | `e99538:	4c 89 ef             	mov    rdi,r13` |

## Candidate `+0xa0` method `0xe99382` full window

```text
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
  e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
  e99531:	48 c1 fa 04          	sar    rdx,0x4
  e99535:	49 89 e5             	mov    r13,rsp
  e99538:	4c 89 ef             	mov    rdi,r13
  e9953b:	48 89 c6             	mov    rsi,rax
  e9953e:	4c 89 e1             	mov    rcx,r12
  e99541:	e8 94 00 c2 ff       	call   ab95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x657a>
  e99546:	4d 8b 7d 10          	mov    r15,QWORD PTR [r13+0x10]
  e9954a:	4c 89 ff             	mov    rdi,r15
  e9954d:	4c 89 f6             	mov    rsi,r14
  e99550:	e8 e9 04 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99555:	49 83 c7 10          	add    r15,0x10
  e99559:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e9955d:	48 89 df             	mov    rdi,rbx
  e99560:	4c 89 ee             	mov    rsi,r13
  e99563:	e8 e6 3b c2 ff       	call   abd14e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa0ee>
  e99568:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
  e9956c:	4c 89 ef             	mov    rdi,r13
  e9956f:	e8 3c 01 c2 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
  e99574:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e99578:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9957f:	00 00
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e99586:	75 0e                	jne    e99596 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609ac>
  e99588:	48 83 c4 30          	add    rsp,0x30
  e9958c:	5b                   	pop    rbx
  e9958d:	41 5c                	pop    r12
  e9958f:	41 5d                	pop    r13
  e99591:	41 5e                	pop    r14
  e99593:	41 5f                	pop    r15
  e99595:	c3                   	ret
  e99596:	e8 15 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9959b:	cc                   	int3
  e9959c:	41 56                	push   r14
  e9959e:	53                   	push   rbx
  e9959f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e995a6:	48 89 fb             	mov    rbx,rdi
  e995a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e995b0:	00 00
  e995b2:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e995b9:	00
  e995ba:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e995bf:	4c 89 f7             	mov    rdi,r14
  e995c2:	48 89 de             	mov    rsi,rbx
  e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e995cd:	48 85 f6             	test   rsi,rsi
  e995d0:	74 27                	je     e995f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a0f>
  e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e995e9:	48 89 df             	mov    rdi,rbx
  e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995f4:	e8 65 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e995f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
```
### filtered dataflow rows for `0xe99382`

| addr | instruction |
|---:|---|
| `0xe992d8` | `e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xe992dd` | `e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]` |
| `0xe992e3` | `e992e3:	5f                   	pop    rdi` |
| `0xe9930d` | `e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0xe99311` | `e99311:	4c 89 f6             	mov    rsi,r14` |
| `0xe99319` | `e99319:	48 89 e7             	mov    rdi,rsp` |
| `0xe9931c` | `e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0xe9932e` | `e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe99343` | `e99343:	48 89 e7             	mov    rdi,rsp` |
| `0xe99354` | `e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe9935b` | `e9935b:	48 89 df             	mov    rdi,rbx` |
| `0xe99368` | `e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0xe99373` | `e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx` |
| `0xe99376` | `e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]` |
| `0xe9937a` | `e9937a:	48 89 c6             	mov    rsi,rax` |
| `0xe99382` | `e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xe99393` | `e99393:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe9939d` | `e9939d:	48 89 fb             	mov    rbx,rdi` |
| `0xe993a5` | `e993a5:	48 89 df             	mov    rdi,rbx` |
| `0xe993ae` | `e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xe993b2` | `e993b2:	48 83 c7 20          	add    rdi,0x20` |
| `0xe993b6` | `e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]` |
| `0xe993c1` | `e993c1:	49 89 d6             	mov    r14,rdx` |
| `0xe993c4` | `e993c4:	48 89 f3             	mov    rbx,rsi` |
| `0xe993cb` | `e993cb:	49 89 fc             	mov    r12,rdi` |
| `0xe993ce` | `e993ce:	48 39 df             	cmp    rdi,rbx` |
| `0xe993d3` | `e993d3:	4c 89 e7             	mov    rdi,r12` |
| `0xe993d6` | `e993d6:	4c 89 f6             	mov    rsi,r14` |
| `0xe993d9` | `e993d9:	4c 89 fa             	mov    rdx,r15` |
| `0xe993e1` | `e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]` |
| `0xe993fd` | `e993fd:	48 89 fb             	mov    rbx,rdi` |
| `0xe99405` | `e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1` |
| `0xe99416` | `e99416:	48 89 fb             	mov    rbx,rdi` |
| `0xe9942f` | `e9942f:	4c 89 f7             	mov    rdi,r14` |
| `0xe99432` | `e99432:	48 89 de             	mov    rsi,rbx` |
| `0xe9943a` | `e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe9943d` | `e9943d:	48 85 f6             	test   rsi,rsi` |
| `0xe99446` | `e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe99449` | `e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe9944e` | `e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe99454` | `e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xe99459` | `e99459:	48 89 df             	mov    rdi,rbx` |
| `0xe9945c` | `e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe9945f` | `e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99469` | `e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe99494` | `e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe994a3` | `e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe994c0` | `e994c0:	48 89 df             	mov    rdi,rbx` |
| `0xe994db` | `e994db:	49 89 f6             	mov    r14,rsi` |
| `0xe994de` | `e994de:	48 89 fb             	mov    rbx,rdi` |
| `0xe994ea` | `e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xe994ef` | `e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]` |
| `0xe994f3` | `e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]` |
| `0xe994f7` | `e994f7:	49 39 f7             	cmp    r15,rsi` |
| `0xe994fc` | `e994fc:	4c 89 ff             	mov    rdi,r15` |
| `0xe994ff` | `e994ff:	4c 89 f6             	mov    rsi,r14` |
| `0xe99515` | `e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99518` | `e99518:	49 29 ff             	sub    r15,rdi` |
| `0xe99522` | `e99522:	4c 89 fa             	mov    rdx,r15` |
| `0xe9952a` | `e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0xe9952e` | `e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]` |
| `0xe99531` | `e99531:	48 c1 fa 04          	sar    rdx,0x4` |
| `0xe99538` | `e99538:	4c 89 ef             	mov    rdi,r13` |
| `0xe9953b` | `e9953b:	48 89 c6             	mov    rsi,rax` |
| `0xe9954a` | `e9954a:	4c 89 ff             	mov    rdi,r15` |
| `0xe9954d` | `e9954d:	4c 89 f6             	mov    rsi,r14` |
| `0xe9955d` | `e9955d:	48 89 df             	mov    rdi,rbx` |
| `0xe99560` | `e99560:	4c 89 ee             	mov    rsi,r13` |
| `0xe9956c` | `e9956c:	4c 89 ef             	mov    rdi,r13` |
| `0xe99581` | `e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]` |
| `0xe995a6` | `e995a6:	48 89 fb             	mov    rbx,rdi` |
| `0xe995bf` | `e995bf:	4c 89 f7             	mov    rdi,r14` |
| `0xe995c2` | `e995c2:	48 89 de             	mov    rsi,rbx` |
| `0xe995ca` | `e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe995cd` | `e995cd:	48 85 f6             	test   rsi,rsi` |
| `0xe995d6` | `e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe995d9` | `e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe995de` | `e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe995e4` | `e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xe995e9` | `e995e9:	48 89 df             	mov    rdi,rbx` |
| `0xe995ec` | `e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe995ef` | `e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe995f9` | `e995f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |

## Candidate `+0xa0` method `0xe993ae` full window

```text
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
  e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
  e99531:	48 c1 fa 04          	sar    rdx,0x4
  e99535:	49 89 e5             	mov    r13,rsp
  e99538:	4c 89 ef             	mov    rdi,r13
  e9953b:	48 89 c6             	mov    rsi,rax
  e9953e:	4c 89 e1             	mov    rcx,r12
  e99541:	e8 94 00 c2 ff       	call   ab95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x657a>
  e99546:	4d 8b 7d 10          	mov    r15,QWORD PTR [r13+0x10]
  e9954a:	4c 89 ff             	mov    rdi,r15
  e9954d:	4c 89 f6             	mov    rsi,r14
  e99550:	e8 e9 04 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99555:	49 83 c7 10          	add    r15,0x10
  e99559:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e9955d:	48 89 df             	mov    rdi,rbx
  e99560:	4c 89 ee             	mov    rsi,r13
  e99563:	e8 e6 3b c2 ff       	call   abd14e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa0ee>
  e99568:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
  e9956c:	4c 89 ef             	mov    rdi,r13
  e9956f:	e8 3c 01 c2 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
  e99574:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e99578:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9957f:	00 00
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e99586:	75 0e                	jne    e99596 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609ac>
  e99588:	48 83 c4 30          	add    rsp,0x30
  e9958c:	5b                   	pop    rbx
  e9958d:	41 5c                	pop    r12
  e9958f:	41 5d                	pop    r13
  e99591:	41 5e                	pop    r14
  e99593:	41 5f                	pop    r15
  e99595:	c3                   	ret
  e99596:	e8 15 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9959b:	cc                   	int3
  e9959c:	41 56                	push   r14
  e9959e:	53                   	push   rbx
  e9959f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e995a6:	48 89 fb             	mov    rbx,rdi
  e995a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e995b0:	00 00
  e995b2:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e995b9:	00
  e995ba:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e995bf:	4c 89 f7             	mov    rdi,r14
  e995c2:	48 89 de             	mov    rsi,rbx
  e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e995cd:	48 85 f6             	test   rsi,rsi
  e995d0:	74 27                	je     e995f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a0f>
  e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e995e9:	48 89 df             	mov    rdi,rbx
  e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995f4:	e8 65 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e995f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e995fe:	e8 83 4e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99603:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9960a:	00 00
  e9960c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99613:	00
  e99614:	75 42                	jne    e99658 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a6e>
  e99616:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9961d:	5b                   	pop    rbx
  e9961e:	41 5e                	pop    r14
  e99620:	c3                   	ret
  e99621:	48 89 c3             	mov    rbx,rax
  e99624:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99629:	e8 30 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
```
### filtered dataflow rows for `0xe993ae`

| addr | instruction |
|---:|---|
| `0xe9930d` | `e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0xe99311` | `e99311:	4c 89 f6             	mov    rsi,r14` |
| `0xe99319` | `e99319:	48 89 e7             	mov    rdi,rsp` |
| `0xe9931c` | `e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0xe9932e` | `e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe99343` | `e99343:	48 89 e7             	mov    rdi,rsp` |
| `0xe99354` | `e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xe9935b` | `e9935b:	48 89 df             	mov    rdi,rbx` |
| `0xe99368` | `e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0xe99373` | `e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx` |
| `0xe99376` | `e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]` |
| `0xe9937a` | `e9937a:	48 89 c6             	mov    rsi,rax` |
| `0xe99382` | `e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xe99393` | `e99393:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe9939d` | `e9939d:	48 89 fb             	mov    rbx,rdi` |
| `0xe993a5` | `e993a5:	48 89 df             	mov    rdi,rbx` |
| `0xe993ae` | `e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xe993b2` | `e993b2:	48 83 c7 20          	add    rdi,0x20` |
| `0xe993b6` | `e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]` |
| `0xe993c1` | `e993c1:	49 89 d6             	mov    r14,rdx` |
| `0xe993c4` | `e993c4:	48 89 f3             	mov    rbx,rsi` |
| `0xe993cb` | `e993cb:	49 89 fc             	mov    r12,rdi` |
| `0xe993ce` | `e993ce:	48 39 df             	cmp    rdi,rbx` |
| `0xe993d3` | `e993d3:	4c 89 e7             	mov    rdi,r12` |
| `0xe993d6` | `e993d6:	4c 89 f6             	mov    rsi,r14` |
| `0xe993d9` | `e993d9:	4c 89 fa             	mov    rdx,r15` |
| `0xe993e1` | `e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]` |
| `0xe993fd` | `e993fd:	48 89 fb             	mov    rbx,rdi` |
| `0xe99405` | `e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1` |
| `0xe99416` | `e99416:	48 89 fb             	mov    rbx,rdi` |
| `0xe9942f` | `e9942f:	4c 89 f7             	mov    rdi,r14` |
| `0xe99432` | `e99432:	48 89 de             	mov    rsi,rbx` |
| `0xe9943a` | `e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe9943d` | `e9943d:	48 85 f6             	test   rsi,rsi` |
| `0xe99446` | `e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe99449` | `e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe9944e` | `e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe99454` | `e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xe99459` | `e99459:	48 89 df             	mov    rdi,rbx` |
| `0xe9945c` | `e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe9945f` | `e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99469` | `e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe99494` | `e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe994a3` | `e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe994c0` | `e994c0:	48 89 df             	mov    rdi,rbx` |
| `0xe994db` | `e994db:	49 89 f6             	mov    r14,rsi` |
| `0xe994de` | `e994de:	48 89 fb             	mov    rbx,rdi` |
| `0xe994ea` | `e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xe994ef` | `e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]` |
| `0xe994f3` | `e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]` |
| `0xe994f7` | `e994f7:	49 39 f7             	cmp    r15,rsi` |
| `0xe994fc` | `e994fc:	4c 89 ff             	mov    rdi,r15` |
| `0xe994ff` | `e994ff:	4c 89 f6             	mov    rsi,r14` |
| `0xe99515` | `e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99518` | `e99518:	49 29 ff             	sub    r15,rdi` |
| `0xe99522` | `e99522:	4c 89 fa             	mov    rdx,r15` |
| `0xe9952a` | `e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0xe9952e` | `e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]` |
| `0xe99531` | `e99531:	48 c1 fa 04          	sar    rdx,0x4` |
| `0xe99538` | `e99538:	4c 89 ef             	mov    rdi,r13` |
| `0xe9953b` | `e9953b:	48 89 c6             	mov    rsi,rax` |
| `0xe9954a` | `e9954a:	4c 89 ff             	mov    rdi,r15` |
| `0xe9954d` | `e9954d:	4c 89 f6             	mov    rsi,r14` |
| `0xe9955d` | `e9955d:	48 89 df             	mov    rdi,rbx` |
| `0xe99560` | `e99560:	4c 89 ee             	mov    rsi,r13` |
| `0xe9956c` | `e9956c:	4c 89 ef             	mov    rdi,r13` |
| `0xe99581` | `e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]` |
| `0xe995a6` | `e995a6:	48 89 fb             	mov    rbx,rdi` |
| `0xe995bf` | `e995bf:	4c 89 f7             	mov    rdi,r14` |
| `0xe995c2` | `e995c2:	48 89 de             	mov    rsi,rbx` |
| `0xe995ca` | `e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe995cd` | `e995cd:	48 85 f6             	test   rsi,rsi` |
| `0xe995d6` | `e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe995d9` | `e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe995de` | `e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe995e4` | `e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xe995e9` | `e995e9:	48 89 df             	mov    rdi,rbx` |
| `0xe995ec` | `e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe995ef` | `e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe995f9` | `e995f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe99624` | `e99624:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |

## Candidate `+0xa0` method `0xeaaf6e` full window

```text
  eaaedc:	41 57                	push   r15
  eaaede:	41 56                	push   r14
  eaaee0:	53                   	push   rbx
  eaaee1:	49 89 fe             	mov    r14,rdi
  eaaee4:	48 8d 5f 18          	lea    rbx,[rdi+0x18]
  eaaee8:	4c 8b 7f 18          	mov    r15,QWORD PTR [rdi+0x18]
  eaaeec:	49 8d 47 ff          	lea    rax,[r15-0x1]
  eaaef0:	48 83 f8 fb          	cmp    rax,0xfffffffffffffffb
  eaaef4:	77 0f                	ja     eaaf05 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7231b>
  eaaef6:	4c 89 ff             	mov    rdi,r15
  eaaef9:	41 ff 57 08          	call   QWORD PTR [r15+0x8]
  eaaefd:	4c 89 ff             	mov    rdi,r15
  eaaf00:	e8 1b 30 94 00       	call   17edf20 <_ZdlPv@plt>
  eaaf05:	49 83 c6 40          	add    r14,0x40
  eaaf09:	4c 89 f7             	mov    rdi,r14
  eaaf0c:	e8 d1 c6 bf ff       	call   aa75e2 <JNI_OnUnload@@Base+0x2eeaf>
  eaaf11:	48 89 df             	mov    rdi,rbx
  eaaf14:	5b                   	pop    rbx
  eaaf15:	41 5e                	pop    r14
  eaaf17:	41 5f                	pop    r15
  eaaf19:	e9 14 7b c4 ff       	jmp    af2a32 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f9d2>
  eaaf1e:	48 8d 05 a3 64 98 00 	lea    rax,[rip+0x9864a3]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  eaaf25:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaaf28:	e9 e3 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaaf2d:	cc                   	int3
  eaaf2e:	53                   	push   rbx
  eaaf2f:	48 89 fb             	mov    rbx,rdi
  eaaf32:	e8 e7 ff ff ff       	call   eaaf1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72334>
  eaaf37:	48 89 df             	mov    rdi,rbx
  eaaf3a:	5b                   	pop    rbx
  eaaf3b:	e9 e0 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaaf40:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  eaaf44:	48 83 c7 18          	add    rdi,0x18
  eaaf48:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
  eaaf4b:	cc                   	int3
  eaaf4c:	48 8d 05 1d 6b 98 00 	lea    rax,[rip+0x986b1d]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
  eaaf53:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaaf56:	e9 b5 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaaf5b:	cc                   	int3
  eaaf5c:	53                   	push   rbx
  eaaf5d:	48 89 fb             	mov    rbx,rdi
  eaaf60:	e8 e7 ff ff ff       	call   eaaf4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72362>
  eaaf65:	48 89 df             	mov    rdi,rbx
  eaaf68:	5b                   	pop    rbx
  eaaf69:	e9 b2 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaaf6e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  eaaf72:	48 83 c7 18          	add    rdi,0x18
  eaaf76:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
  eaaf79:	cc                   	int3
  eaaf7a:	48 8d 05 17 6c 98 00 	lea    rax,[rip+0x986c17]        # 1831b98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3b30>
  eaaf81:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaaf84:	e9 87 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaaf89:	cc                   	int3
  eaaf8a:	53                   	push   rbx
  eaaf8b:	48 89 fb             	mov    rbx,rdi
  eaaf8e:	e8 e7 ff ff ff       	call   eaaf7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72390>
  eaaf93:	48 89 df             	mov    rdi,rbx
  eaaf96:	5b                   	pop    rbx
  eaaf97:	e9 84 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaaf9c:	48 83 c7 18          	add    rdi,0x18
  eaafa0:	e9 01 00 00 00       	jmp    eaafa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723bc>
  eaafa5:	cc                   	int3
  eaafa6:	41 57                	push   r15
  eaafa8:	41 56                	push   r14
  eaafaa:	53                   	push   rbx
  eaafab:	48 89 fb             	mov    rbx,rdi
  eaafae:	e8 3b 00 00 00       	call   eaafee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72404>
  eaafb3:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
  eaafb7:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
  eaafbb:	4d 39 fe             	cmp    r14,r15
  eaafbe:	74 0e                	je     eaafce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723e4>
  eaafc0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  eaafc3:	e8 58 2f 94 00       	call   17edf20 <_ZdlPv@plt>
  eaafc8:	49 83 c6 08          	add    r14,0x8
  eaafcc:	eb ed                	jmp    eaafbb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723d1>
  eaafce:	48 89 df             	mov    rdi,rbx
  eaafd1:	e8 8e c0 db ff       	call   c67064 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4004>
  eaafd6:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  eaafd9:	48 85 ff             	test   rdi,rdi
  eaafdc:	74 0a                	je     eaafe8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723fe>
  eaafde:	5b                   	pop    rbx
  eaafdf:	41 5e                	pop    r14
  eaafe1:	41 5f                	pop    r15
  eaafe3:	e9 38 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaafe8:	5b                   	pop    rbx
  eaafe9:	41 5e                	pop    r14
  eaafeb:	41 5f                	pop    r15
  eaafed:	c3                   	ret
  eaafee:	41 57                	push   r15
  eaaff0:	41 56                	push   r14
  eaaff2:	41 54                	push   r12
  eaaff4:	53                   	push   rbx
  eaaff5:	50                   	push   rax
  eaaff6:	48 89 fb             	mov    rbx,rdi
  eaaff9:	e8 a0 00 00 00       	call   eab09e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724b4>
  eaaffe:	49 89 c6             	mov    r14,rax
  eab001:	49 89 d7             	mov    r15,rdx
  eab004:	48 89 df             	mov    rdi,rbx
  eab007:	e8 ba 00 00 00       	call   eab0c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724dc>
  eab00c:	49 39 d7             	cmp    r15,rdx
  eab00f:	74 2a                	je     eab03b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72451>
  eab011:	49 89 d4             	mov    r12,rdx
  eab014:	4c 89 ff             	mov    rdi,r15
  eab017:	e8 b0 37 bf ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
  eab01c:	49 83 c7 30          	add    r15,0x30
  eab020:	4c 89 f8             	mov    rax,r15
  eab023:	49 2b 06             	sub    rax,QWORD PTR [r14]
  eab026:	48 3d f0 0f 00 00    	cmp    rax,0xff0
  eab02c:	75 08                	jne    eab036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7244c>
  eab02e:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
  eab032:	49 83 c6 08          	add    r14,0x8
  eab036:	4d 39 e7             	cmp    r15,r12
  eab039:	75 d9                	jne    eab014 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7242a>
  eab03b:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
  eab040:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  eab044:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
  eab048:	48 29 c1             	sub    rcx,rax
  eab04b:	48 c1 f9 03          	sar    rcx,0x3
  eab04f:	48 83 f9 03          	cmp    rcx,0x3
  eab053:	72 25                	jb     eab07a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72490>
  eab055:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  eab058:	e8 c3 2e 94 00       	call   17edf20 <_ZdlPv@plt>
  eab05d:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  eab061:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
  eab065:	48 83 c0 08          	add    rax,0x8
  eab069:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  eab06d:	48 29 c1             	sub    rcx,rax
  eab070:	48 c1 f9 03          	sar    rcx,0x3
  eab074:	48 83 f9 02          	cmp    rcx,0x2
  eab078:	77 db                	ja     eab055 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7246b>
  eab07a:	48 83 f9 01          	cmp    rcx,0x1
  eab07e:	74 0a                	je     eab08a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724a0>
  eab080:	48 83 f9 02          	cmp    rcx,0x2
  eab084:	75 0b                	jne    eab091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724a7>
  eab086:	6a 55                	push   0x55
  eab088:	eb 02                	jmp    eab08c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724a2>
  eab08a:	6a 2a                	push   0x2a
  eab08c:	58                   	pop    rax
  eab08d:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  eab091:	48 83 c4 08          	add    rsp,0x8
  eab095:	5b                   	pop    rbx
  eab096:	41 5c                	pop    r12
  eab098:	41 5e                	pop    r14
  eab09a:	41 5f                	pop    r15
  eab09c:	c3                   	ret
  eab09d:	cc                   	int3
  eab09e:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  eab0a2:	6a 55                	push   0x55
  eab0a4:	59                   	pop    rcx
  eab0a5:	31 d2                	xor    edx,edx
  eab0a7:	48 f7 f1             	div    rcx
  eab0aa:	48 89 d1             	mov    rcx,rdx
  eab0ad:	31 d2                	xor    edx,edx
  eab0af:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
  eab0b3:	48 8d 04 c6          	lea    rax,[rsi+rax*8]
  eab0b7:	48 39 77 10          	cmp    QWORD PTR [rdi+0x10],rsi
  eab0bb:	74 07                	je     eab0c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724da>
  eab0bd:	48 6b d1 30          	imul   rdx,rcx,0x30
  eab0c1:	48 03 10             	add    rdx,QWORD PTR [rax]
  eab0c4:	c3                   	ret
  eab0c5:	cc                   	int3
  eab0c6:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  eab0ca:	48 03 47 28          	add    rax,QWORD PTR [rdi+0x28]
  eab0ce:	6a 55                	push   0x55
  eab0d0:	59                   	pop    rcx
  eab0d1:	31 d2                	xor    edx,edx
  eab0d3:	48 f7 f1             	div    rcx
  eab0d6:	48 89 d1             	mov    rcx,rdx
  eab0d9:	31 d2                	xor    edx,edx
  eab0db:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
  eab0df:	48 8d 04 c6          	lea    rax,[rsi+rax*8]
  eab0e3:	48 39 77 10          	cmp    QWORD PTR [rdi+0x10],rsi
  eab0e7:	74 07                	je     eab0f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72506>
  eab0e9:	48 6b d1 30          	imul   rdx,rcx,0x30
  eab0ed:	48 03 10             	add    rdx,QWORD PTR [rax]
  eab0f0:	c3                   	ret
  eab0f1:	cc                   	int3
  eab0f2:	48 8d 05 67 6a 98 00 	lea    rax,[rip+0x986a67]        # 1831b60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3af8>
  eab0f9:	48 89 07             	mov    QWORD PTR [rdi],rax
  eab0fc:	e9 0f 2f 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eab101:	cc                   	int3
  eab102:	53                   	push   rbx
  eab103:	48 89 fb             	mov    rbx,rdi
  eab106:	e8 e7 ff ff ff       	call   eab0f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72508>
  eab10b:	48 89 df             	mov    rdi,rbx
  eab10e:	5b                   	pop    rbx
  eab10f:	e9 0c 2e 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eab114:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
  eab118:	e9 01 00 00 00       	jmp    eab11e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72534>
  eab11d:	cc                   	int3
  eab11e:	48 85 ff             	test   rdi,rdi
  eab121:	74 27                	je     eab14a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72560>
  eab123:	53                   	push   rbx
  eab124:	48 89 fb             	mov    rbx,rdi
  eab127:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  eab12a:	e8 ef ff ff ff       	call   eab11e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72534>
  eab12f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  eab133:	e8 e6 ff ff ff       	call   eab11e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72534>
  eab138:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  eab13c:	e8 0b 00 00 00       	call   eab14c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72562>
  eab141:	48 89 df             	mov    rdi,rbx
  eab144:	5b                   	pop    rbx
  eab145:	e9 d6 2d 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eab14a:	c3                   	ret
  eab14b:	cc                   	int3
  eab14c:	53                   	push   rbx
  eab14d:	48 89 fb             	mov    rbx,rdi
  eab150:	48 83 c7 18          	add    rdi,0x18
  eab154:	e8 35 32 20 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
  eab159:	48 89 df             	mov    rdi,rbx
  eab15c:	5b                   	pop    rbx
  eab15d:	e9 2e 2d 94 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eab162:	53                   	push   rbx
  eab163:	48 89 fb             	mov    rbx,rdi
  eab166:	48 83 c7 18          	add    rdi,0x18
  eab16a:	e8 21 2d 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eab16f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  eab173:	5b                   	pop    rbx
  eab174:	e9 01 00 00 00       	jmp    eab17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72590>
  eab179:	cc                   	int3
  eab17a:	e9 01 00 00 00       	jmp    eab180 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72596>
  eab17f:	cc                   	int3
  eab180:	48 85 ff             	test   rdi,rdi
  eab183:	74 27                	je     eab1ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x725c2>
  eab185:	53                   	push   rbx
  eab186:	48 89 fb             	mov    rbx,rdi
  eab189:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  eab18c:	e8 ef ff ff ff       	call   eab180 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72596>
  eab191:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  eab195:	e8 e6 ff ff ff       	call   eab180 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72596>
  eab19a:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  eab19e:	e8 0b 00 00 00       	call   eab1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x725c4>
  eab1a3:	48 89 df             	mov    rdi,rbx
  eab1a6:	5b                   	pop    rbx
  eab1a7:	e9 74 2d 94 00       	jmp    17edf20 <_ZdlPv@plt>
```
### filtered dataflow rows for `0xeaaf6e`

| addr | instruction |
|---:|---|
| `0xeaaee1` | `eaaee1:	49 89 fe             	mov    r14,rdi` |
| `0xeaaee4` | `eaaee4:	48 8d 5f 18          	lea    rbx,[rdi+0x18]` |
| `0xeaaee8` | `eaaee8:	4c 8b 7f 18          	mov    r15,QWORD PTR [rdi+0x18]` |
| `0xeaaef6` | `eaaef6:	4c 89 ff             	mov    rdi,r15` |
| `0xeaaef9` | `eaaef9:	41 ff 57 08          	call   QWORD PTR [r15+0x8]` |
| `0xeaaefd` | `eaaefd:	4c 89 ff             	mov    rdi,r15` |
| `0xeaaf09` | `eaaf09:	4c 89 f7             	mov    rdi,r14` |
| `0xeaaf11` | `eaaf11:	48 89 df             	mov    rdi,rbx` |
| `0xeaaf25` | `eaaf25:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xeaaf2f` | `eaaf2f:	48 89 fb             	mov    rbx,rdi` |
| `0xeaaf37` | `eaaf37:	48 89 df             	mov    rdi,rbx` |
| `0xeaaf40` | `eaaf40:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xeaaf44` | `eaaf44:	48 83 c7 18          	add    rdi,0x18` |
| `0xeaaf53` | `eaaf53:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xeaaf5d` | `eaaf5d:	48 89 fb             	mov    rbx,rdi` |
| `0xeaaf65` | `eaaf65:	48 89 df             	mov    rdi,rbx` |
| `0xeaaf6e` | `eaaf6e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xeaaf72` | `eaaf72:	48 83 c7 18          	add    rdi,0x18` |
| `0xeaaf76` | `eaaf76:	ff 60 20             	jmp    QWORD PTR [rax+0x20]` |
| `0xeaaf81` | `eaaf81:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xeaaf8b` | `eaaf8b:	48 89 fb             	mov    rbx,rdi` |
| `0xeaaf93` | `eaaf93:	48 89 df             	mov    rdi,rbx` |
| `0xeaaf9c` | `eaaf9c:	48 83 c7 18          	add    rdi,0x18` |
| `0xeaafab` | `eaafab:	48 89 fb             	mov    rbx,rdi` |
| `0xeaafc0` | `eaafc0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xeaafce` | `eaafce:	48 89 df             	mov    rdi,rbx` |
| `0xeaafd6` | `eaafd6:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xeaafd9` | `eaafd9:	48 85 ff             	test   rdi,rdi` |
| `0xeaaff6` | `eaaff6:	48 89 fb             	mov    rbx,rdi` |
| `0xeab001` | `eab001:	49 89 d7             	mov    r15,rdx` |
| `0xeab004` | `eab004:	48 89 df             	mov    rdi,rbx` |
| `0xeab00c` | `eab00c:	49 39 d7             	cmp    r15,rdx` |
| `0xeab011` | `eab011:	49 89 d4             	mov    r12,rdx` |
| `0xeab014` | `eab014:	4c 89 ff             	mov    rdi,r15` |
| `0xeab03b` | `eab03b:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0` |
| `0xeab055` | `eab055:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0xeab08d` | `eab08d:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax` |
| `0xeab09e` | `eab09e:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xeab0aa` | `eab0aa:	48 89 d1             	mov    rcx,rdx` |
| `0xeab0af` | `eab0af:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]` |
| `0xeab0b3` | `eab0b3:	48 8d 04 c6          	lea    rax,[rsi+rax*8]` |
| `0xeab0b7` | `eab0b7:	48 39 77 10          	cmp    QWORD PTR [rdi+0x10],rsi` |
| `0xeab0bd` | `eab0bd:	48 6b d1 30          	imul   rdx,rcx,0x30` |
| `0xeab0c1` | `eab0c1:	48 03 10             	add    rdx,QWORD PTR [rax]` |
| `0xeab0c6` | `eab0c6:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xeab0ca` | `eab0ca:	48 03 47 28          	add    rax,QWORD PTR [rdi+0x28]` |
| `0xeab0d6` | `eab0d6:	48 89 d1             	mov    rcx,rdx` |
| `0xeab0db` | `eab0db:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]` |
| `0xeab0df` | `eab0df:	48 8d 04 c6          	lea    rax,[rsi+rax*8]` |
| `0xeab0e3` | `eab0e3:	48 39 77 10          	cmp    QWORD PTR [rdi+0x10],rsi` |
| `0xeab0e9` | `eab0e9:	48 6b d1 30          	imul   rdx,rcx,0x30` |
| `0xeab0ed` | `eab0ed:	48 03 10             	add    rdx,QWORD PTR [rax]` |
| `0xeab0f9` | `eab0f9:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xeab103` | `eab103:	48 89 fb             	mov    rbx,rdi` |
| `0xeab10b` | `eab10b:	48 89 df             	mov    rdi,rbx` |
| `0xeab114` | `eab114:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]` |
| `0xeab11e` | `eab11e:	48 85 ff             	test   rdi,rdi` |
| `0xeab124` | `eab124:	48 89 fb             	mov    rbx,rdi` |
| `0xeab127` | `eab127:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0xeab12f` | `eab12f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xeab138` | `eab138:	48 8d 7b 20          	lea    rdi,[rbx+0x20]` |
| `0xeab141` | `eab141:	48 89 df             	mov    rdi,rbx` |
| `0xeab14d` | `eab14d:	48 89 fb             	mov    rbx,rdi` |
| `0xeab150` | `eab150:	48 83 c7 18          	add    rdi,0x18` |
| `0xeab159` | `eab159:	48 89 df             	mov    rdi,rbx` |
| `0xeab163` | `eab163:	48 89 fb             	mov    rbx,rdi` |
| `0xeab166` | `eab166:	48 83 c7 18          	add    rdi,0x18` |
| `0xeab16f` | `eab16f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xeab180` | `eab180:	48 85 ff             	test   rdi,rdi` |
| `0xeab186` | `eab186:	48 89 fb             	mov    rbx,rdi` |
| `0xeab189` | `eab189:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0xeab191` | `eab191:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xeab19a` | `eab19a:	48 8d 7b 20          	lea    rdi,[rbx+0x20]` |
| `0xeab1a3` | `eab1a3:	48 89 df             	mov    rdi,rbx` |

## Candidate `+0xa0` method `0xeaba70` full window

```text
  eab9e1:	e8 c8 f7 ff ff       	call   eab1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x725c4>
  eab9e6:	48 89 df             	mov    rdi,rbx
  eab9e9:	5b                   	pop    rbx
  eab9ea:	e9 31 25 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eab9ef:	5b                   	pop    rbx
  eab9f0:	c3                   	ret
  eab9f1:	cc                   	int3
  eab9f2:	48 8d 05 1f 61 98 00 	lea    rax,[rip+0x98611f]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eab9f9:	48 89 07             	mov    QWORD PTR [rdi],rax
  eab9fc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  eaba00:	e9 81 2a bf ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  eaba05:	cc                   	int3
  eaba06:	53                   	push   rbx
  eaba07:	48 89 fb             	mov    rbx,rdi
  eaba0a:	e8 e3 ff ff ff       	call   eab9f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72e08>
  eaba0f:	48 89 df             	mov    rdi,rbx
  eaba12:	5b                   	pop    rbx
  eaba13:	e9 08 25 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaba18:	41 56                	push   r14
  eaba1a:	53                   	push   rbx
  eaba1b:	50                   	push   rax
  eaba1c:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
  eaba20:	6a 20                	push   0x20
  eaba22:	5f                   	pop    rdi
  eaba23:	e8 d8 24 94 00       	call   17edf00 <_Znwm@plt>
  eaba28:	49 89 c6             	mov    r14,rax
  eaba2b:	48 8d 05 e6 60 98 00 	lea    rax,[rip+0x9860e6]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eaba32:	49 89 06             	mov    QWORD PTR [r14],rax
  eaba35:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  eaba39:	48 89 de             	mov    rsi,rbx
  eaba3c:	e8 17 d3 c8 ff       	call   b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
  eaba41:	4c 89 f0             	mov    rax,r14
  eaba44:	48 83 c4 08          	add    rsp,0x8
  eaba48:	5b                   	pop    rbx
  eaba49:	41 5e                	pop    r14
  eaba4b:	c3                   	ret
  eaba4c:	48 8d 47 08          	lea    rax,[rdi+0x8]
  eaba50:	48 8d 0d c1 60 98 00 	lea    rcx,[rip+0x9860c1]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eaba57:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  eaba5a:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
  eaba5e:	48 89 c6             	mov    rsi,rax
  eaba61:	e9 f2 d2 c8 ff       	jmp    b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
  eaba66:	48 83 c7 08          	add    rdi,0x8
  eaba6a:	e9 70 df fe ff       	jmp    e999df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60df5>
  eaba6f:	cc                   	int3
  eaba70:	48 8d 05 69 60 98 00 	lea    rax,[rip+0x986069]        # 1831ae0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a78>
  eaba77:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaba7a:	e9 91 25 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaba7f:	cc                   	int3
  eaba80:	53                   	push   rbx
  eaba81:	48 89 fb             	mov    rbx,rdi
  eaba84:	e8 e7 ff ff ff       	call   eaba70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72e86>
  eaba89:	48 89 df             	mov    rdi,rbx
  eaba8c:	5b                   	pop    rbx
  eaba8d:	e9 8e 24 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaba92:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  eaba96:	48 83 c7 20          	add    rdi,0x20
  eaba9a:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
  eaba9d:	cc                   	int3
  eaba9e:	41 57                	push   r15
  eabaa0:	41 56                	push   r14
  eabaa2:	41 54                	push   r12
  eabaa4:	53                   	push   rbx
  eabaa5:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  eabaac:	48 89 fb             	mov    rbx,rdi
  eabaaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabab6:	00 00
  eabab8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  eababf:	00
  eabac0:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
  eabac4:	49 89 e7             	mov    r15,rsp
  eabac7:	4c 89 ff             	mov    rdi,r15
  eabaca:	48 89 d6             	mov    rsi,rdx
  eabacd:	e8 68 ec 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  eabad2:	48 8d 35 86 f2 d8 ff 	lea    rsi,[rip+0xffffffffffd8f286]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
  eabad9:	48 8d 15 a6 da cb ff 	lea    rdx,[rip+0xffffffffffcbdaa6]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
  eabae0:	48 8d 0d 01 02 00 00 	lea    rcx,[rip+0x201]        # eabce8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730fe>
  eabae7:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  eabaec:	6a 40                	push   0x40
  eabaee:	41 59                	pop    r9
  eabaf0:	4c 89 e7             	mov    rdi,r12
  eabaf3:	4d 89 f8             	mov    r8,r15
  eabaf6:	e8 99 ec 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eabafb:	49 8b 06             	mov    rax,QWORD PTR [r14]
  eabafe:	48 89 df             	mov    rdi,rbx
  eabb01:	4c 89 f6             	mov    rsi,r14
  eabb04:	4c 89 e2             	mov    rdx,r12
  eabb07:	ff 50 40             	call   QWORD PTR [rax+0x40]
  eabb0a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabb0f:	e8 d4 ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb14:	48 89 e7             	mov    rdi,rsp
  eabb17:	e8 cc ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb1c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb23:	00 00
  eabb25:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabb2c:	00
  eabb2d:	75 42                	jne    eabb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72f87>
  eabb2f:	48 89 d8             	mov    rax,rbx
  eabb32:	48 81 c4 88 00 00 00 	add    rsp,0x88
  eabb39:	5b                   	pop    rbx
  eabb3a:	41 5c                	pop    r12
  eabb3c:	41 5e                	pop    r14
  eabb3e:	41 5f                	pop    r15
  eabb40:	c3                   	ret
  eabb41:	48 89 c3             	mov    rbx,rax
  eabb44:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabb49:	e8 9a ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb4e:	48 89 e7             	mov    rdi,rsp
  eabb51:	e8 92 ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb5d:	00 00
  eabb5f:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabb66:	00
  eabb67:	75 08                	jne    eabb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72f87>
  eabb69:	48 89 df             	mov    rdi,rbx
  eabb6c:	e8 5f 41 bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabb71:	e8 3a 3f 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabb76:	41 57                	push   r15
  eabb78:	41 56                	push   r14
  eabb7a:	41 54                	push   r12
  eabb7c:	53                   	push   rbx
  eabb7d:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  eabb84:	48 89 fb             	mov    rbx,rdi
  eabb87:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb8e:	00 00
  eabb90:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  eabb97:	00
  eabb98:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
  eabb9c:	49 89 e7             	mov    r15,rsp
  eabb9f:	4c 89 ff             	mov    rdi,r15
  eabba2:	48 89 d6             	mov    rsi,rdx
  eabba5:	e8 90 eb 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  eabbaa:	48 8d 35 ae f1 d8 ff 	lea    rsi,[rip+0xffffffffffd8f1ae]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
  eabbb1:	48 8d 15 ce d9 cb ff 	lea    rdx,[rip+0xffffffffffcbd9ce]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
  eabbb8:	48 8d 0d a5 00 00 00 	lea    rcx,[rip+0xa5]        # eabc64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7307a>
  eabbbf:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  eabbc4:	6a 40                	push   0x40
  eabbc6:	41 59                	pop    r9
  eabbc8:	4c 89 e7             	mov    rdi,r12
  eabbcb:	4d 89 f8             	mov    r8,r15
  eabbce:	e8 c1 eb 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eabbd3:	49 8b 06             	mov    rax,QWORD PTR [r14]
  eabbd6:	48 89 df             	mov    rdi,rbx
  eabbd9:	4c 89 f6             	mov    rsi,r14
  eabbdc:	4c 89 e2             	mov    rdx,r12
  eabbdf:	ff 50 38             	call   QWORD PTR [rax+0x38]
  eabbe2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabbe7:	e8 fc eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabbec:	48 89 e7             	mov    rdi,rsp
  eabbef:	e8 f4 eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabbf4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabbfb:	00 00
  eabbfd:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabc04:	00
  eabc05:	75 42                	jne    eabc49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7305f>
  eabc07:	48 89 d8             	mov    rax,rbx
  eabc0a:	48 81 c4 88 00 00 00 	add    rsp,0x88
  eabc11:	5b                   	pop    rbx
  eabc12:	41 5c                	pop    r12
  eabc14:	41 5e                	pop    r14
  eabc16:	41 5f                	pop    r15
  eabc18:	c3                   	ret
  eabc19:	48 89 c3             	mov    rbx,rax
  eabc1c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabc21:	e8 c2 eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabc26:	48 89 e7             	mov    rdi,rsp
  eabc29:	e8 ba eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabc2e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabc35:	00 00
  eabc37:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabc3e:	00
  eabc3f:	75 08                	jne    eabc49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7305f>
  eabc41:	48 89 df             	mov    rdi,rbx
  eabc44:	e8 87 40 bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabc49:	e8 62 3e 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabc4e:	53                   	push   rbx
  eabc4f:	48 89 fb             	mov    rbx,rdi
  eabc52:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
  eabc56:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  eabc59:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
  eabc5f:	48 89 d8             	mov    rax,rbx
  eabc62:	5b                   	pop    rbx
  eabc63:	c3                   	ret
  eabc64:	41 57                	push   r15
  eabc66:	41 56                	push   r14
  eabc68:	53                   	push   rbx
  eabc69:	48 83 ec 20          	sub    rsp,0x20
  eabc6d:	48 89 d3             	mov    rbx,rdx
  eabc70:	49 89 fe             	mov    r14,rdi
  eabc73:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabc7a:	00 00
  eabc7c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  eabc81:	48 83 c6 30          	add    rsi,0x30
  eabc85:	49 89 e7             	mov    r15,rsp
  eabc88:	4c 89 ff             	mov    rdi,r15
  eabc8b:	e8 9a e8 81 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
  eabc90:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  eabc94:	4c 89 fe             	mov    rsi,r15
  eabc97:	48 89 da             	mov    rdx,rbx
  eabc9a:	41 ff 56 28          	call   QWORD PTR [r14+0x28]
  eabc9e:	48 89 e7             	mov    rdi,rsp
  eabca1:	e8 ea 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabca6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcad:	00 00
  eabcaf:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabcb4:	75 2d                	jne    eabce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730f9>
  eabcb6:	48 83 c4 20          	add    rsp,0x20
  eabcba:	5b                   	pop    rbx
  eabcbb:	41 5e                	pop    r14
  eabcbd:	41 5f                	pop    r15
  eabcbf:	c3                   	ret
  eabcc0:	48 89 c3             	mov    rbx,rax
  eabcc3:	48 89 e7             	mov    rdi,rsp
  eabcc6:	e8 c5 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabccb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcd2:	00 00
  eabcd4:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabcd9:	75 08                	jne    eabce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730f9>
  eabcdb:	48 89 df             	mov    rdi,rbx
  eabcde:	e8 ed 3f bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabce3:	e8 c8 3d 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabce8:	41 57                	push   r15
  eabcea:	41 56                	push   r14
  eabcec:	53                   	push   rbx
  eabced:	48 83 ec 20          	sub    rsp,0x20
  eabcf1:	48 89 f3             	mov    rbx,rsi
  eabcf4:	49 89 fe             	mov    r14,rdi
  eabcf7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcfe:	00 00
  eabd00:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  eabd05:	48 83 c6 30          	add    rsi,0x30
  eabd09:	49 89 e7             	mov    r15,rsp
  eabd0c:	4c 89 ff             	mov    rdi,r15
  eabd0f:	e8 16 e8 81 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
  eabd14:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
```
### filtered dataflow rows for `0xeaba70`

| addr | instruction |
|---:|---|
| `0xeab9e6` | `eab9e6:	48 89 df             	mov    rdi,rbx` |
| `0xeab9f9` | `eab9f9:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xeab9fc` | `eab9fc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]` |
| `0xeaba07` | `eaba07:	48 89 fb             	mov    rbx,rdi` |
| `0xeaba0f` | `eaba0f:	48 89 df             	mov    rdi,rbx` |
| `0xeaba1c` | `eaba1c:	48 8d 5f 08          	lea    rbx,[rdi+0x8]` |
| `0xeaba22` | `eaba22:	5f                   	pop    rdi` |
| `0xeaba35` | `eaba35:	49 8d 7e 08          	lea    rdi,[r14+0x8]` |
| `0xeaba39` | `eaba39:	48 89 de             	mov    rsi,rbx` |
| `0xeaba4c` | `eaba4c:	48 8d 47 08          	lea    rax,[rdi+0x8]` |
| `0xeaba57` | `eaba57:	48 89 0e             	mov    QWORD PTR [rsi],rcx` |
| `0xeaba5a` | `eaba5a:	48 8d 7e 08          	lea    rdi,[rsi+0x8]` |
| `0xeaba5e` | `eaba5e:	48 89 c6             	mov    rsi,rax` |
| `0xeaba66` | `eaba66:	48 83 c7 08          	add    rdi,0x8` |
| `0xeaba77` | `eaba77:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xeaba81` | `eaba81:	48 89 fb             	mov    rbx,rdi` |
| `0xeaba89` | `eaba89:	48 89 df             	mov    rdi,rbx` |
| `0xeaba92` | `eaba92:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xeaba96` | `eaba96:	48 83 c7 20          	add    rdi,0x20` |
| `0xeaba9a` | `eaba9a:	ff 60 30             	jmp    QWORD PTR [rax+0x30]` |
| `0xeabaac` | `eabaac:	48 89 fb             	mov    rbx,rdi` |
| `0xeabac0` | `eabac0:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]` |
| `0xeabac7` | `eabac7:	4c 89 ff             	mov    rdi,r15` |
| `0xeabaca` | `eabaca:	48 89 d6             	mov    rsi,rdx` |
| `0xeabad2` | `eabad2:	48 8d 35 86 f2 d8 ff 	lea    rsi,[rip+0xffffffffffd8f286]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>` |
| `0xeabad9` | `eabad9:	48 8d 15 a6 da cb ff 	lea    rdx,[rip+0xffffffffffcbdaa6]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>` |
| `0xeabae0` | `eabae0:	48 8d 0d 01 02 00 00 	lea    rcx,[rip+0x201]        # eabce8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730fe>` |
| `0xeabaf0` | `eabaf0:	4c 89 e7             	mov    rdi,r12` |
| `0xeabaf6` | `eabaf6:	e8 99 ec 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xeabafe` | `eabafe:	48 89 df             	mov    rdi,rbx` |
| `0xeabb01` | `eabb01:	4c 89 f6             	mov    rsi,r14` |
| `0xeabb04` | `eabb04:	4c 89 e2             	mov    rdx,r12` |
| `0xeabb07` | `eabb07:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xeabb0a` | `eabb0a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabb14` | `eabb14:	48 89 e7             	mov    rdi,rsp` |
| `0xeabb44` | `eabb44:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabb4e` | `eabb4e:	48 89 e7             	mov    rdi,rsp` |
| `0xeabb69` | `eabb69:	48 89 df             	mov    rdi,rbx` |
| `0xeabb84` | `eabb84:	48 89 fb             	mov    rbx,rdi` |
| `0xeabb98` | `eabb98:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]` |
| `0xeabb9f` | `eabb9f:	4c 89 ff             	mov    rdi,r15` |
| `0xeabba2` | `eabba2:	48 89 d6             	mov    rsi,rdx` |
| `0xeabbaa` | `eabbaa:	48 8d 35 ae f1 d8 ff 	lea    rsi,[rip+0xffffffffffd8f1ae]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>` |
| `0xeabbb1` | `eabbb1:	48 8d 15 ce d9 cb ff 	lea    rdx,[rip+0xffffffffffcbd9ce]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>` |
| `0xeabbc8` | `eabbc8:	4c 89 e7             	mov    rdi,r12` |
| `0xeabbce` | `eabbce:	e8 c1 eb 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xeabbd6` | `eabbd6:	48 89 df             	mov    rdi,rbx` |
| `0xeabbd9` | `eabbd9:	4c 89 f6             	mov    rsi,r14` |
| `0xeabbdc` | `eabbdc:	4c 89 e2             	mov    rdx,r12` |
| `0xeabbdf` | `eabbdf:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0xeabbe2` | `eabbe2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabbec` | `eabbec:	48 89 e7             	mov    rdi,rsp` |
| `0xeabc1c` | `eabc1c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabc26` | `eabc26:	48 89 e7             	mov    rdi,rsp` |
| `0xeabc41` | `eabc41:	48 89 df             	mov    rdi,rbx` |
| `0xeabc4f` | `eabc4f:	48 89 fb             	mov    rbx,rdi` |
| `0xeabc52` | `eabc52:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]` |
| `0xeabc56` | `eabc56:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xeabc59` | `eabc59:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]` |
| `0xeabc6d` | `eabc6d:	48 89 d3             	mov    rbx,rdx` |
| `0xeabc70` | `eabc70:	49 89 fe             	mov    r14,rdi` |
| `0xeabc7c` | `eabc7c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xeabc81` | `eabc81:	48 83 c6 30          	add    rsi,0x30` |
| `0xeabc88` | `eabc88:	4c 89 ff             	mov    rdi,r15` |
| `0xeabc90` | `eabc90:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]` |
| `0xeabc94` | `eabc94:	4c 89 fe             	mov    rsi,r15` |
| `0xeabc97` | `eabc97:	48 89 da             	mov    rdx,rbx` |
| `0xeabc9a` | `eabc9a:	41 ff 56 28          	call   QWORD PTR [r14+0x28]` |
| `0xeabc9e` | `eabc9e:	48 89 e7             	mov    rdi,rsp` |
| `0xeabcaf` | `eabcaf:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xeabcc3` | `eabcc3:	48 89 e7             	mov    rdi,rsp` |
| `0xeabcd4` | `eabcd4:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xeabcdb` | `eabcdb:	48 89 df             	mov    rdi,rbx` |
| `0xeabcf1` | `eabcf1:	48 89 f3             	mov    rbx,rsi` |
| `0xeabcf4` | `eabcf4:	49 89 fe             	mov    r14,rdi` |
| `0xeabd00` | `eabd00:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xeabd05` | `eabd05:	48 83 c6 30          	add    rsi,0x30` |
| `0xeabd0c` | `eabd0c:	4c 89 ff             	mov    rdi,r15` |
| `0xeabd14` | `eabd14:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |

## Candidate `+0xa0` method `0xeaba80` full window

```text
  eab9ef:	5b                   	pop    rbx
  eab9f0:	c3                   	ret
  eab9f1:	cc                   	int3
  eab9f2:	48 8d 05 1f 61 98 00 	lea    rax,[rip+0x98611f]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eab9f9:	48 89 07             	mov    QWORD PTR [rdi],rax
  eab9fc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  eaba00:	e9 81 2a bf ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  eaba05:	cc                   	int3
  eaba06:	53                   	push   rbx
  eaba07:	48 89 fb             	mov    rbx,rdi
  eaba0a:	e8 e3 ff ff ff       	call   eab9f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72e08>
  eaba0f:	48 89 df             	mov    rdi,rbx
  eaba12:	5b                   	pop    rbx
  eaba13:	e9 08 25 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaba18:	41 56                	push   r14
  eaba1a:	53                   	push   rbx
  eaba1b:	50                   	push   rax
  eaba1c:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
  eaba20:	6a 20                	push   0x20
  eaba22:	5f                   	pop    rdi
  eaba23:	e8 d8 24 94 00       	call   17edf00 <_Znwm@plt>
  eaba28:	49 89 c6             	mov    r14,rax
  eaba2b:	48 8d 05 e6 60 98 00 	lea    rax,[rip+0x9860e6]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eaba32:	49 89 06             	mov    QWORD PTR [r14],rax
  eaba35:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  eaba39:	48 89 de             	mov    rsi,rbx
  eaba3c:	e8 17 d3 c8 ff       	call   b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
  eaba41:	4c 89 f0             	mov    rax,r14
  eaba44:	48 83 c4 08          	add    rsp,0x8
  eaba48:	5b                   	pop    rbx
  eaba49:	41 5e                	pop    r14
  eaba4b:	c3                   	ret
  eaba4c:	48 8d 47 08          	lea    rax,[rdi+0x8]
  eaba50:	48 8d 0d c1 60 98 00 	lea    rcx,[rip+0x9860c1]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eaba57:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  eaba5a:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
  eaba5e:	48 89 c6             	mov    rsi,rax
  eaba61:	e9 f2 d2 c8 ff       	jmp    b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
  eaba66:	48 83 c7 08          	add    rdi,0x8
  eaba6a:	e9 70 df fe ff       	jmp    e999df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60df5>
  eaba6f:	cc                   	int3
  eaba70:	48 8d 05 69 60 98 00 	lea    rax,[rip+0x986069]        # 1831ae0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a78>
  eaba77:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaba7a:	e9 91 25 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaba7f:	cc                   	int3
  eaba80:	53                   	push   rbx
  eaba81:	48 89 fb             	mov    rbx,rdi
  eaba84:	e8 e7 ff ff ff       	call   eaba70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72e86>
  eaba89:	48 89 df             	mov    rdi,rbx
  eaba8c:	5b                   	pop    rbx
  eaba8d:	e9 8e 24 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaba92:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  eaba96:	48 83 c7 20          	add    rdi,0x20
  eaba9a:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
  eaba9d:	cc                   	int3
  eaba9e:	41 57                	push   r15
  eabaa0:	41 56                	push   r14
  eabaa2:	41 54                	push   r12
  eabaa4:	53                   	push   rbx
  eabaa5:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  eabaac:	48 89 fb             	mov    rbx,rdi
  eabaaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabab6:	00 00
  eabab8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  eababf:	00
  eabac0:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
  eabac4:	49 89 e7             	mov    r15,rsp
  eabac7:	4c 89 ff             	mov    rdi,r15
  eabaca:	48 89 d6             	mov    rsi,rdx
  eabacd:	e8 68 ec 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  eabad2:	48 8d 35 86 f2 d8 ff 	lea    rsi,[rip+0xffffffffffd8f286]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
  eabad9:	48 8d 15 a6 da cb ff 	lea    rdx,[rip+0xffffffffffcbdaa6]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
  eabae0:	48 8d 0d 01 02 00 00 	lea    rcx,[rip+0x201]        # eabce8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730fe>
  eabae7:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  eabaec:	6a 40                	push   0x40
  eabaee:	41 59                	pop    r9
  eabaf0:	4c 89 e7             	mov    rdi,r12
  eabaf3:	4d 89 f8             	mov    r8,r15
  eabaf6:	e8 99 ec 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eabafb:	49 8b 06             	mov    rax,QWORD PTR [r14]
  eabafe:	48 89 df             	mov    rdi,rbx
  eabb01:	4c 89 f6             	mov    rsi,r14
  eabb04:	4c 89 e2             	mov    rdx,r12
  eabb07:	ff 50 40             	call   QWORD PTR [rax+0x40]
  eabb0a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabb0f:	e8 d4 ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb14:	48 89 e7             	mov    rdi,rsp
  eabb17:	e8 cc ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb1c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb23:	00 00
  eabb25:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabb2c:	00
  eabb2d:	75 42                	jne    eabb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72f87>
  eabb2f:	48 89 d8             	mov    rax,rbx
  eabb32:	48 81 c4 88 00 00 00 	add    rsp,0x88
  eabb39:	5b                   	pop    rbx
  eabb3a:	41 5c                	pop    r12
  eabb3c:	41 5e                	pop    r14
  eabb3e:	41 5f                	pop    r15
  eabb40:	c3                   	ret
  eabb41:	48 89 c3             	mov    rbx,rax
  eabb44:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabb49:	e8 9a ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb4e:	48 89 e7             	mov    rdi,rsp
  eabb51:	e8 92 ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb5d:	00 00
  eabb5f:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabb66:	00
  eabb67:	75 08                	jne    eabb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72f87>
  eabb69:	48 89 df             	mov    rdi,rbx
  eabb6c:	e8 5f 41 bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabb71:	e8 3a 3f 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabb76:	41 57                	push   r15
  eabb78:	41 56                	push   r14
  eabb7a:	41 54                	push   r12
  eabb7c:	53                   	push   rbx
  eabb7d:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  eabb84:	48 89 fb             	mov    rbx,rdi
  eabb87:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb8e:	00 00
  eabb90:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  eabb97:	00
  eabb98:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
  eabb9c:	49 89 e7             	mov    r15,rsp
  eabb9f:	4c 89 ff             	mov    rdi,r15
  eabba2:	48 89 d6             	mov    rsi,rdx
  eabba5:	e8 90 eb 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  eabbaa:	48 8d 35 ae f1 d8 ff 	lea    rsi,[rip+0xffffffffffd8f1ae]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
  eabbb1:	48 8d 15 ce d9 cb ff 	lea    rdx,[rip+0xffffffffffcbd9ce]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
  eabbb8:	48 8d 0d a5 00 00 00 	lea    rcx,[rip+0xa5]        # eabc64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7307a>
  eabbbf:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  eabbc4:	6a 40                	push   0x40
  eabbc6:	41 59                	pop    r9
  eabbc8:	4c 89 e7             	mov    rdi,r12
  eabbcb:	4d 89 f8             	mov    r8,r15
  eabbce:	e8 c1 eb 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eabbd3:	49 8b 06             	mov    rax,QWORD PTR [r14]
  eabbd6:	48 89 df             	mov    rdi,rbx
  eabbd9:	4c 89 f6             	mov    rsi,r14
  eabbdc:	4c 89 e2             	mov    rdx,r12
  eabbdf:	ff 50 38             	call   QWORD PTR [rax+0x38]
  eabbe2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabbe7:	e8 fc eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabbec:	48 89 e7             	mov    rdi,rsp
  eabbef:	e8 f4 eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabbf4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabbfb:	00 00
  eabbfd:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabc04:	00
  eabc05:	75 42                	jne    eabc49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7305f>
  eabc07:	48 89 d8             	mov    rax,rbx
  eabc0a:	48 81 c4 88 00 00 00 	add    rsp,0x88
  eabc11:	5b                   	pop    rbx
  eabc12:	41 5c                	pop    r12
  eabc14:	41 5e                	pop    r14
  eabc16:	41 5f                	pop    r15
  eabc18:	c3                   	ret
  eabc19:	48 89 c3             	mov    rbx,rax
  eabc1c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabc21:	e8 c2 eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabc26:	48 89 e7             	mov    rdi,rsp
  eabc29:	e8 ba eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabc2e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabc35:	00 00
  eabc37:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabc3e:	00
  eabc3f:	75 08                	jne    eabc49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7305f>
  eabc41:	48 89 df             	mov    rdi,rbx
  eabc44:	e8 87 40 bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabc49:	e8 62 3e 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabc4e:	53                   	push   rbx
  eabc4f:	48 89 fb             	mov    rbx,rdi
  eabc52:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
  eabc56:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  eabc59:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
  eabc5f:	48 89 d8             	mov    rax,rbx
  eabc62:	5b                   	pop    rbx
  eabc63:	c3                   	ret
  eabc64:	41 57                	push   r15
  eabc66:	41 56                	push   r14
  eabc68:	53                   	push   rbx
  eabc69:	48 83 ec 20          	sub    rsp,0x20
  eabc6d:	48 89 d3             	mov    rbx,rdx
  eabc70:	49 89 fe             	mov    r14,rdi
  eabc73:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabc7a:	00 00
  eabc7c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  eabc81:	48 83 c6 30          	add    rsi,0x30
  eabc85:	49 89 e7             	mov    r15,rsp
  eabc88:	4c 89 ff             	mov    rdi,r15
  eabc8b:	e8 9a e8 81 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
  eabc90:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  eabc94:	4c 89 fe             	mov    rsi,r15
  eabc97:	48 89 da             	mov    rdx,rbx
  eabc9a:	41 ff 56 28          	call   QWORD PTR [r14+0x28]
  eabc9e:	48 89 e7             	mov    rdi,rsp
  eabca1:	e8 ea 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabca6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcad:	00 00
  eabcaf:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabcb4:	75 2d                	jne    eabce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730f9>
  eabcb6:	48 83 c4 20          	add    rsp,0x20
  eabcba:	5b                   	pop    rbx
  eabcbb:	41 5e                	pop    r14
  eabcbd:	41 5f                	pop    r15
  eabcbf:	c3                   	ret
  eabcc0:	48 89 c3             	mov    rbx,rax
  eabcc3:	48 89 e7             	mov    rdi,rsp
  eabcc6:	e8 c5 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabccb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcd2:	00 00
  eabcd4:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabcd9:	75 08                	jne    eabce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730f9>
  eabcdb:	48 89 df             	mov    rdi,rbx
  eabcde:	e8 ed 3f bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabce3:	e8 c8 3d 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabce8:	41 57                	push   r15
  eabcea:	41 56                	push   r14
  eabcec:	53                   	push   rbx
  eabced:	48 83 ec 20          	sub    rsp,0x20
  eabcf1:	48 89 f3             	mov    rbx,rsi
  eabcf4:	49 89 fe             	mov    r14,rdi
  eabcf7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcfe:	00 00
  eabd00:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  eabd05:	48 83 c6 30          	add    rsi,0x30
  eabd09:	49 89 e7             	mov    r15,rsp
  eabd0c:	4c 89 ff             	mov    rdi,r15
  eabd0f:	e8 16 e8 81 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
  eabd14:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  eabd18:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  eabd1c:	4c 89 fe             	mov    rsi,r15
  eabd1f:	41 ff 56 28          	call   QWORD PTR [r14+0x28]
  eabd23:	48 89 e7             	mov    rdi,rsp
```
### filtered dataflow rows for `0xeaba80`

| addr | instruction |
|---:|---|
| `0xeab9f9` | `eab9f9:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xeab9fc` | `eab9fc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]` |
| `0xeaba07` | `eaba07:	48 89 fb             	mov    rbx,rdi` |
| `0xeaba0f` | `eaba0f:	48 89 df             	mov    rdi,rbx` |
| `0xeaba1c` | `eaba1c:	48 8d 5f 08          	lea    rbx,[rdi+0x8]` |
| `0xeaba22` | `eaba22:	5f                   	pop    rdi` |
| `0xeaba35` | `eaba35:	49 8d 7e 08          	lea    rdi,[r14+0x8]` |
| `0xeaba39` | `eaba39:	48 89 de             	mov    rsi,rbx` |
| `0xeaba4c` | `eaba4c:	48 8d 47 08          	lea    rax,[rdi+0x8]` |
| `0xeaba57` | `eaba57:	48 89 0e             	mov    QWORD PTR [rsi],rcx` |
| `0xeaba5a` | `eaba5a:	48 8d 7e 08          	lea    rdi,[rsi+0x8]` |
| `0xeaba5e` | `eaba5e:	48 89 c6             	mov    rsi,rax` |
| `0xeaba66` | `eaba66:	48 83 c7 08          	add    rdi,0x8` |
| `0xeaba77` | `eaba77:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xeaba81` | `eaba81:	48 89 fb             	mov    rbx,rdi` |
| `0xeaba89` | `eaba89:	48 89 df             	mov    rdi,rbx` |
| `0xeaba92` | `eaba92:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xeaba96` | `eaba96:	48 83 c7 20          	add    rdi,0x20` |
| `0xeaba9a` | `eaba9a:	ff 60 30             	jmp    QWORD PTR [rax+0x30]` |
| `0xeabaac` | `eabaac:	48 89 fb             	mov    rbx,rdi` |
| `0xeabac0` | `eabac0:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]` |
| `0xeabac7` | `eabac7:	4c 89 ff             	mov    rdi,r15` |
| `0xeabaca` | `eabaca:	48 89 d6             	mov    rsi,rdx` |
| `0xeabad2` | `eabad2:	48 8d 35 86 f2 d8 ff 	lea    rsi,[rip+0xffffffffffd8f286]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>` |
| `0xeabad9` | `eabad9:	48 8d 15 a6 da cb ff 	lea    rdx,[rip+0xffffffffffcbdaa6]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>` |
| `0xeabae0` | `eabae0:	48 8d 0d 01 02 00 00 	lea    rcx,[rip+0x201]        # eabce8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730fe>` |
| `0xeabaf0` | `eabaf0:	4c 89 e7             	mov    rdi,r12` |
| `0xeabaf6` | `eabaf6:	e8 99 ec 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xeabafe` | `eabafe:	48 89 df             	mov    rdi,rbx` |
| `0xeabb01` | `eabb01:	4c 89 f6             	mov    rsi,r14` |
| `0xeabb04` | `eabb04:	4c 89 e2             	mov    rdx,r12` |
| `0xeabb07` | `eabb07:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xeabb0a` | `eabb0a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabb14` | `eabb14:	48 89 e7             	mov    rdi,rsp` |
| `0xeabb44` | `eabb44:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabb4e` | `eabb4e:	48 89 e7             	mov    rdi,rsp` |
| `0xeabb69` | `eabb69:	48 89 df             	mov    rdi,rbx` |
| `0xeabb84` | `eabb84:	48 89 fb             	mov    rbx,rdi` |
| `0xeabb98` | `eabb98:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]` |
| `0xeabb9f` | `eabb9f:	4c 89 ff             	mov    rdi,r15` |
| `0xeabba2` | `eabba2:	48 89 d6             	mov    rsi,rdx` |
| `0xeabbaa` | `eabbaa:	48 8d 35 ae f1 d8 ff 	lea    rsi,[rip+0xffffffffffd8f1ae]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>` |
| `0xeabbb1` | `eabbb1:	48 8d 15 ce d9 cb ff 	lea    rdx,[rip+0xffffffffffcbd9ce]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>` |
| `0xeabbc8` | `eabbc8:	4c 89 e7             	mov    rdi,r12` |
| `0xeabbce` | `eabbce:	e8 c1 eb 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xeabbd6` | `eabbd6:	48 89 df             	mov    rdi,rbx` |
| `0xeabbd9` | `eabbd9:	4c 89 f6             	mov    rsi,r14` |
| `0xeabbdc` | `eabbdc:	4c 89 e2             	mov    rdx,r12` |
| `0xeabbdf` | `eabbdf:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0xeabbe2` | `eabbe2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabbec` | `eabbec:	48 89 e7             	mov    rdi,rsp` |
| `0xeabc1c` | `eabc1c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabc26` | `eabc26:	48 89 e7             	mov    rdi,rsp` |
| `0xeabc41` | `eabc41:	48 89 df             	mov    rdi,rbx` |
| `0xeabc4f` | `eabc4f:	48 89 fb             	mov    rbx,rdi` |
| `0xeabc52` | `eabc52:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]` |
| `0xeabc56` | `eabc56:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xeabc59` | `eabc59:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]` |
| `0xeabc6d` | `eabc6d:	48 89 d3             	mov    rbx,rdx` |
| `0xeabc70` | `eabc70:	49 89 fe             	mov    r14,rdi` |
| `0xeabc7c` | `eabc7c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xeabc81` | `eabc81:	48 83 c6 30          	add    rsi,0x30` |
| `0xeabc88` | `eabc88:	4c 89 ff             	mov    rdi,r15` |
| `0xeabc90` | `eabc90:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]` |
| `0xeabc94` | `eabc94:	4c 89 fe             	mov    rsi,r15` |
| `0xeabc97` | `eabc97:	48 89 da             	mov    rdx,rbx` |
| `0xeabc9a` | `eabc9a:	41 ff 56 28          	call   QWORD PTR [r14+0x28]` |
| `0xeabc9e` | `eabc9e:	48 89 e7             	mov    rdi,rsp` |
| `0xeabcaf` | `eabcaf:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xeabcc3` | `eabcc3:	48 89 e7             	mov    rdi,rsp` |
| `0xeabcd4` | `eabcd4:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xeabcdb` | `eabcdb:	48 89 df             	mov    rdi,rbx` |
| `0xeabcf1` | `eabcf1:	48 89 f3             	mov    rbx,rsi` |
| `0xeabcf4` | `eabcf4:	49 89 fe             	mov    r14,rdi` |
| `0xeabd00` | `eabd00:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xeabd05` | `eabd05:	48 83 c6 30          	add    rsi,0x30` |
| `0xeabd0c` | `eabd0c:	4c 89 ff             	mov    rdi,r15` |
| `0xeabd14` | `eabd14:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0xeabd18` | `eabd18:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]` |
| `0xeabd1c` | `eabd1c:	4c 89 fe             	mov    rsi,r15` |
| `0xeabd1f` | `eabd1f:	41 ff 56 28          	call   QWORD PTR [r14+0x28]` |
| `0xeabd23` | `eabd23:	48 89 e7             	mov    rdi,rsp` |

## Candidate `+0xa0` method `0xeabc4e` full window

```text
  eabba2:	48 89 d6             	mov    rsi,rdx
  eabba5:	e8 90 eb 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  eabbaa:	48 8d 35 ae f1 d8 ff 	lea    rsi,[rip+0xffffffffffd8f1ae]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
  eabbb1:	48 8d 15 ce d9 cb ff 	lea    rdx,[rip+0xffffffffffcbd9ce]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
  eabbb8:	48 8d 0d a5 00 00 00 	lea    rcx,[rip+0xa5]        # eabc64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7307a>
  eabbbf:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  eabbc4:	6a 40                	push   0x40
  eabbc6:	41 59                	pop    r9
  eabbc8:	4c 89 e7             	mov    rdi,r12
  eabbcb:	4d 89 f8             	mov    r8,r15
  eabbce:	e8 c1 eb 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eabbd3:	49 8b 06             	mov    rax,QWORD PTR [r14]
  eabbd6:	48 89 df             	mov    rdi,rbx
  eabbd9:	4c 89 f6             	mov    rsi,r14
  eabbdc:	4c 89 e2             	mov    rdx,r12
  eabbdf:	ff 50 38             	call   QWORD PTR [rax+0x38]
  eabbe2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabbe7:	e8 fc eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabbec:	48 89 e7             	mov    rdi,rsp
  eabbef:	e8 f4 eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabbf4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabbfb:	00 00
  eabbfd:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabc04:	00
  eabc05:	75 42                	jne    eabc49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7305f>
  eabc07:	48 89 d8             	mov    rax,rbx
  eabc0a:	48 81 c4 88 00 00 00 	add    rsp,0x88
  eabc11:	5b                   	pop    rbx
  eabc12:	41 5c                	pop    r12
  eabc14:	41 5e                	pop    r14
  eabc16:	41 5f                	pop    r15
  eabc18:	c3                   	ret
  eabc19:	48 89 c3             	mov    rbx,rax
  eabc1c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabc21:	e8 c2 eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabc26:	48 89 e7             	mov    rdi,rsp
  eabc29:	e8 ba eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabc2e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabc35:	00 00
  eabc37:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabc3e:	00
  eabc3f:	75 08                	jne    eabc49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7305f>
  eabc41:	48 89 df             	mov    rdi,rbx
  eabc44:	e8 87 40 bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabc49:	e8 62 3e 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabc4e:	53                   	push   rbx
  eabc4f:	48 89 fb             	mov    rbx,rdi
  eabc52:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
  eabc56:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  eabc59:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
  eabc5f:	48 89 d8             	mov    rax,rbx
  eabc62:	5b                   	pop    rbx
  eabc63:	c3                   	ret
  eabc64:	41 57                	push   r15
  eabc66:	41 56                	push   r14
  eabc68:	53                   	push   rbx
  eabc69:	48 83 ec 20          	sub    rsp,0x20
  eabc6d:	48 89 d3             	mov    rbx,rdx
  eabc70:	49 89 fe             	mov    r14,rdi
  eabc73:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabc7a:	00 00
  eabc7c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  eabc81:	48 83 c6 30          	add    rsi,0x30
  eabc85:	49 89 e7             	mov    r15,rsp
  eabc88:	4c 89 ff             	mov    rdi,r15
  eabc8b:	e8 9a e8 81 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
  eabc90:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  eabc94:	4c 89 fe             	mov    rsi,r15
  eabc97:	48 89 da             	mov    rdx,rbx
  eabc9a:	41 ff 56 28          	call   QWORD PTR [r14+0x28]
  eabc9e:	48 89 e7             	mov    rdi,rsp
  eabca1:	e8 ea 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabca6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcad:	00 00
  eabcaf:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabcb4:	75 2d                	jne    eabce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730f9>
  eabcb6:	48 83 c4 20          	add    rsp,0x20
  eabcba:	5b                   	pop    rbx
  eabcbb:	41 5e                	pop    r14
  eabcbd:	41 5f                	pop    r15
  eabcbf:	c3                   	ret
  eabcc0:	48 89 c3             	mov    rbx,rax
  eabcc3:	48 89 e7             	mov    rdi,rsp
  eabcc6:	e8 c5 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabccb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcd2:	00 00
  eabcd4:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabcd9:	75 08                	jne    eabce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730f9>
  eabcdb:	48 89 df             	mov    rdi,rbx
  eabcde:	e8 ed 3f bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabce3:	e8 c8 3d 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabce8:	41 57                	push   r15
  eabcea:	41 56                	push   r14
  eabcec:	53                   	push   rbx
  eabced:	48 83 ec 20          	sub    rsp,0x20
  eabcf1:	48 89 f3             	mov    rbx,rsi
  eabcf4:	49 89 fe             	mov    r14,rdi
  eabcf7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcfe:	00 00
  eabd00:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  eabd05:	48 83 c6 30          	add    rsi,0x30
  eabd09:	49 89 e7             	mov    r15,rsp
  eabd0c:	4c 89 ff             	mov    rdi,r15
  eabd0f:	e8 16 e8 81 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
  eabd14:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  eabd18:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  eabd1c:	4c 89 fe             	mov    rsi,r15
  eabd1f:	41 ff 56 28          	call   QWORD PTR [r14+0x28]
  eabd23:	48 89 e7             	mov    rdi,rsp
  eabd26:	e8 65 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabd2b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabd32:	00 00
  eabd34:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabd39:	75 2d                	jne    eabd68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7317e>
  eabd3b:	48 83 c4 20          	add    rsp,0x20
  eabd3f:	5b                   	pop    rbx
  eabd40:	41 5e                	pop    r14
  eabd42:	41 5f                	pop    r15
  eabd44:	c3                   	ret
  eabd45:	48 89 c3             	mov    rbx,rax
  eabd48:	48 89 e7             	mov    rdi,rsp
  eabd4b:	e8 40 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabd50:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabd57:	00 00
  eabd59:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabd5e:	75 08                	jne    eabd68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7317e>
  eabd60:	48 89 df             	mov    rdi,rbx
  eabd63:	e8 68 3f bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabd68:	e8 43 3d 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabd6d:	cc                   	int3
  eabd6e:	53                   	push   rbx
  eabd6f:	48 83 ec 10          	sub    rsp,0x10
  eabd73:	48 89 fb             	mov    rbx,rdi
  eabd76:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabd7d:	00 00
  eabd7f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  eabd84:	8b 87 28 05 00 00    	mov    eax,DWORD PTR [rdi+0x528]
  eabd8a:	b9 ff ff ff ff       	mov    ecx,0xffffffff
  eabd8f:	48 39 c8             	cmp    rax,rcx
  eabd92:	74 12                	je     eabda6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x731bc>
  eabd94:	48 8d 0d 0d 56 98 00 	lea    rcx,[rip+0x98560d]        # 18313a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3340>
  eabd9b:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]
  eabda0:	48 89 de             	mov    rsi,rbx
  eabda3:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
  eabda6:	83 8b 28 05 00 00 ff 	or     DWORD PTR [rbx+0x528],0xffffffff
  eabdad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabdb4:	00 00
  eabdb6:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
  eabdbb:	75 06                	jne    eabdc3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x731d9>
  eabdbd:	48 83 c4 10          	add    rsp,0x10
  eabdc1:	5b                   	pop    rbx
  eabdc2:	c3                   	ret
  eabdc3:	e8 e8 3c 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabdc8:	48 89 c7             	mov    rdi,rax
  eabdcb:	e8 d5 dc bc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  eabdd0:	48 89 f7             	mov    rdi,rsi
  eabdd3:	e9 86 ba ff ff       	jmp    ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  eabdd8:	48 8b 7e 18          	mov    rdi,QWORD PTR [rsi+0x18]
  eabddc:	e9 95 29 bf ff       	jmp    a9e776 <JNI_OnUnload@@Base+0x26043>
  eabde1:	cc                   	int3
  eabde2:	41 56                	push   r14
  eabde4:	53                   	push   rbx
  eabde5:	50                   	push   rax
  eabde6:	49 89 f6             	mov    r14,rsi
  eabde9:	48 89 fb             	mov    rbx,rdi
  eabdec:	6a 6d                	push   0x6d
  eabdee:	59                   	pop    rcx
  eabdef:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]
  eabdf1:	49 8b 46 70          	mov    rax,QWORD PTR [r14+0x70]
  eabdf5:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
  eabdf9:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
  eabdfd:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
  eabe01:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
  eabe08:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
  eabe0f:	0f 57 c0             	xorps  xmm0,xmm0
  eabe12:	49 83 a6 80 00 00 00 	and    QWORD PTR [r14+0x80],0x0
  eabe19:	00
  eabe1a:	41 0f 11 46 70       	movups XMMWORD PTR [r14+0x70],xmm0
  eabe1f:	41 0f 10 86 88 00 00 	movups xmm0,XMMWORD PTR [r14+0x88]
  eabe26:	00
  eabe27:	41 0f 10 8e 98 00 00 	movups xmm1,XMMWORD PTR [r14+0x98]
  eabe2e:	00
  eabe2f:	0f 11 8b 98 00 00 00 	movups XMMWORD PTR [rbx+0x98],xmm1
  eabe36:	0f 11 83 88 00 00 00 	movups XMMWORD PTR [rbx+0x88],xmm0
  eabe3d:	be a8 00 00 00       	mov    esi,0xa8
  eabe42:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
  eabe46:	4c 01 f6             	add    rsi,r14
  eabe49:	e8 50 a0 fb ff       	call   e65e9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d2b4>
  eabe4e:	41 8a 86 22 05 00 00 	mov    al,BYTE PTR [r14+0x522]
  eabe55:	88 83 22 05 00 00    	mov    BYTE PTR [rbx+0x522],al
  eabe5b:	41 0f b7 86 20 05 00 	movzx  eax,WORD PTR [r14+0x520]
  eabe62:	00
  eabe63:	66 89 83 20 05 00 00 	mov    WORD PTR [rbx+0x520],ax
  eabe6a:	48 83 c4 08          	add    rsp,0x8
  eabe6e:	5b                   	pop    rbx
  eabe6f:	41 5e                	pop    r14
  eabe71:	c3                   	ret
  eabe72:	41 56                	push   r14
  eabe74:	53                   	push   rbx
  eabe75:	50                   	push   rax
  eabe76:	49 89 fe             	mov    r14,rdi
  eabe79:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  eabe7d:	48 85 ff             	test   rdi,rdi
  eabe80:	74 1d                	je     eabe9f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x732b5>
  eabe82:	e8 b9 22 94 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
  eabe87:	48 85 c0             	test   rax,rax
  eabe8a:	74 13                	je     eabe9f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x732b5>
  eabe8c:	48 89 c3             	mov    rbx,rax
  eabe8f:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  eabe92:	48 85 ff             	test   rdi,rdi
  eabe95:	74 0a                	je     eabea1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x732b7>
  eabe97:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  eabe9a:	ff 50 20             	call   QWORD PTR [rax+0x20]
  eabe9d:	eb 02                	jmp    eabea1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x732b7>
  eabe9f:	31 db                	xor    ebx,ebx
  eabea1:	48 89 df             	mov    rdi,rbx
  eabea4:	48 83 c4 08          	add    rsp,0x8
  eabea8:	5b                   	pop    rbx
  eabea9:	41 5e                	pop    r14
  eabeab:	e9 d6 25 bf ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  eabeb0:	48 89 c7             	mov    rdi,rax
  eabeb3:	e8 ed db bc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  eabeb8:	48 83 c7 20          	add    rdi,0x20
  eabebc:	e9 e7 cb c7 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
  eabec1:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
  eabec5:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  eabec9:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
  eabecc:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  eabecf:	c3                   	ret
  eabed0:	48 89 f8             	mov    rax,rdi
  eabed3:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  eabed6:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  eabeda:	48 03 78 08          	add    rdi,QWORD PTR [rax+0x8]
  eabede:	f6 c1 01             	test   cl,0x1
  eabee1:	74 08                	je     eabeeb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73301>
```
### filtered dataflow rows for `0xeabc4e`

| addr | instruction |
|---:|---|
| `0xeabba2` | `eabba2:	48 89 d6             	mov    rsi,rdx` |
| `0xeabbaa` | `eabbaa:	48 8d 35 ae f1 d8 ff 	lea    rsi,[rip+0xffffffffffd8f1ae]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>` |
| `0xeabbb1` | `eabbb1:	48 8d 15 ce d9 cb ff 	lea    rdx,[rip+0xffffffffffcbd9ce]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>` |
| `0xeabbc8` | `eabbc8:	4c 89 e7             	mov    rdi,r12` |
| `0xeabbce` | `eabbce:	e8 c1 eb 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xeabbd6` | `eabbd6:	48 89 df             	mov    rdi,rbx` |
| `0xeabbd9` | `eabbd9:	4c 89 f6             	mov    rsi,r14` |
| `0xeabbdc` | `eabbdc:	4c 89 e2             	mov    rdx,r12` |
| `0xeabbdf` | `eabbdf:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0xeabbe2` | `eabbe2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabbec` | `eabbec:	48 89 e7             	mov    rdi,rsp` |
| `0xeabc1c` | `eabc1c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabc26` | `eabc26:	48 89 e7             	mov    rdi,rsp` |
| `0xeabc41` | `eabc41:	48 89 df             	mov    rdi,rbx` |
| `0xeabc4f` | `eabc4f:	48 89 fb             	mov    rbx,rdi` |
| `0xeabc52` | `eabc52:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]` |
| `0xeabc56` | `eabc56:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xeabc59` | `eabc59:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]` |
| `0xeabc6d` | `eabc6d:	48 89 d3             	mov    rbx,rdx` |
| `0xeabc70` | `eabc70:	49 89 fe             	mov    r14,rdi` |
| `0xeabc7c` | `eabc7c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xeabc81` | `eabc81:	48 83 c6 30          	add    rsi,0x30` |
| `0xeabc88` | `eabc88:	4c 89 ff             	mov    rdi,r15` |
| `0xeabc90` | `eabc90:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]` |
| `0xeabc94` | `eabc94:	4c 89 fe             	mov    rsi,r15` |
| `0xeabc97` | `eabc97:	48 89 da             	mov    rdx,rbx` |
| `0xeabc9a` | `eabc9a:	41 ff 56 28          	call   QWORD PTR [r14+0x28]` |
| `0xeabc9e` | `eabc9e:	48 89 e7             	mov    rdi,rsp` |
| `0xeabcaf` | `eabcaf:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xeabcc3` | `eabcc3:	48 89 e7             	mov    rdi,rsp` |
| `0xeabcd4` | `eabcd4:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xeabcdb` | `eabcdb:	48 89 df             	mov    rdi,rbx` |
| `0xeabcf1` | `eabcf1:	48 89 f3             	mov    rbx,rsi` |
| `0xeabcf4` | `eabcf4:	49 89 fe             	mov    r14,rdi` |
| `0xeabd00` | `eabd00:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xeabd05` | `eabd05:	48 83 c6 30          	add    rsi,0x30` |
| `0xeabd0c` | `eabd0c:	4c 89 ff             	mov    rdi,r15` |
| `0xeabd14` | `eabd14:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0xeabd18` | `eabd18:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]` |
| `0xeabd1c` | `eabd1c:	4c 89 fe             	mov    rsi,r15` |
| `0xeabd1f` | `eabd1f:	41 ff 56 28          	call   QWORD PTR [r14+0x28]` |
| `0xeabd23` | `eabd23:	48 89 e7             	mov    rdi,rsp` |
| `0xeabd34` | `eabd34:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xeabd48` | `eabd48:	48 89 e7             	mov    rdi,rsp` |
| `0xeabd59` | `eabd59:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xeabd60` | `eabd60:	48 89 df             	mov    rdi,rbx` |
| `0xeabd73` | `eabd73:	48 89 fb             	mov    rbx,rdi` |
| `0xeabd84` | `eabd84:	8b 87 28 05 00 00    	mov    eax,DWORD PTR [rdi+0x528]` |
| `0xeabd9b` | `eabd9b:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]` |
| `0xeabda0` | `eabda0:	48 89 de             	mov    rsi,rbx` |
| `0xeabda3` | `eabda3:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]` |
| `0xeabdc8` | `eabdc8:	48 89 c7             	mov    rdi,rax` |
| `0xeabdd0` | `eabdd0:	48 89 f7             	mov    rdi,rsi` |
| `0xeabdd8` | `eabdd8:	48 8b 7e 18          	mov    rdi,QWORD PTR [rsi+0x18]` |
| `0xeabde6` | `eabde6:	49 89 f6             	mov    r14,rsi` |
| `0xeabde9` | `eabde9:	48 89 fb             	mov    rbx,rdi` |
| `0xeabdef` | `eabdef:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]` |
| `0xeabe42` | `eabe42:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]` |
| `0xeabe46` | `eabe46:	4c 01 f6             	add    rsi,r14` |
| `0xeabe76` | `eabe76:	49 89 fe             	mov    r14,rdi` |
| `0xeabe79` | `eabe79:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]` |
| `0xeabe7d` | `eabe7d:	48 85 ff             	test   rdi,rdi` |
| `0xeabe8f` | `eabe8f:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xeabe92` | `eabe92:	48 85 ff             	test   rdi,rdi` |
| `0xeabe97` | `eabe97:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xeabe9a` | `eabe9a:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0xeabea1` | `eabea1:	48 89 df             	mov    rdi,rbx` |
| `0xeabeb0` | `eabeb0:	48 89 c7             	mov    rdi,rax` |
| `0xeabeb8` | `eabeb8:	48 83 c7 20          	add    rdi,0x20` |
| `0xeabec1` | `eabec1:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]` |
| `0xeabec5` | `eabec5:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax` |
| `0xeabec9` | `eabec9:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]` |
| `0xeabecc` | `eabecc:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0xeabed0` | `eabed0:	48 89 f8             	mov    rax,rdi` |
| `0xeabed3` | `eabed3:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]` |
| `0xeabed6` | `eabed6:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]` |
| `0xeabeda` | `eabeda:	48 03 78 08          	add    rdi,QWORD PTR [rax+0x8]` |

## Candidate `+0xa0` method `0x1008f1e` full window

```text
 1008e9e:	31 d2                	xor    edx,edx
 1008ea0:	84 c1                	test   cl,al
 1008ea2:	b8 81 00 00 00       	mov    eax,0x81
 1008ea7:	0f 45 c2             	cmovne eax,edx
 1008eaa:	66 0f 2e c1          	ucomisd xmm0,xmm1
 1008eae:	6a 01                	push   0x1
 1008eb0:	59                   	pop    rcx
 1008eb1:	0f 46 c8             	cmovbe ecx,eax
 1008eb4:	66 0f 2e c8          	ucomisd xmm1,xmm0
 1008eb8:	b8 ff 00 00 00       	mov    eax,0xff
 1008ebd:	0f 46 c1             	cmovbe eax,ecx
 1008ec0:	c3                   	ret
 1008ec1:	b0 ff                	mov    al,0xff
 1008ec3:	c3                   	ret
 1008ec4:	53                   	push   rbx
 1008ec5:	48 89 f0             	mov    rax,rsi
 1008ec8:	48 89 fb             	mov    rbx,rdi
 1008ecb:	6a 6d                	push   0x6d
 1008ecd:	59                   	pop    rcx
 1008ece:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]
 1008ed0:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
 1008ed4:	48 83 c0 70          	add    rax,0x70
 1008ed8:	48 89 c6             	mov    rsi,rax
 1008edb:	e8 de 0b f9 ff       	call   f99abe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x160ed4>
 1008ee0:	48 89 d8             	mov    rax,rbx
 1008ee3:	5b                   	pop    rbx
 1008ee4:	c3                   	ret
 1008ee5:	cc                   	int3
 1008ee6:	53                   	push   rbx
 1008ee7:	48 89 fb             	mov    rbx,rdi
 1008eea:	e8 93 fd ff ff       	call   1008c82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0098>
 1008eef:	48 89 df             	mov    rdi,rbx
 1008ef2:	5b                   	pop    rbx
 1008ef3:	e9 d2 f8 fe ff       	jmp    ff87ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bfbe0>
 1008ef8:	48 8d 05 21 ba 83 00 	lea    rax,[rip+0x83ba21]        # 1844920 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1008>
 1008eff:	48 89 07             	mov    QWORD PTR [rdi],rax
 1008f02:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 1008f06:	e9 7b 55 a9 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 1008f0b:	cc                   	int3
 1008f0c:	53                   	push   rbx
 1008f0d:	48 89 fb             	mov    rbx,rdi
 1008f10:	e8 e3 ff ff ff       	call   1008ef8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d030e>
 1008f15:	48 89 df             	mov    rdi,rbx
 1008f18:	5b                   	pop    rbx
 1008f19:	e9 02 50 7e 00       	jmp    17edf20 <_ZdlPv@plt>
 1008f1e:	53                   	push   rbx
 1008f1f:	48 89 fb             	mov    rbx,rdi
 1008f22:	6a 28                	push   0x28
 1008f24:	5f                   	pop    rdi
 1008f25:	e8 d6 4f 7e 00       	call   17edf00 <_Znwm@plt>
 1008f2a:	48 8d 0d ef b9 83 00 	lea    rcx,[rip+0x83b9ef]        # 1844920 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1008>
 1008f31:	48 89 08             	mov    QWORD PTR [rax],rcx
 1008f34:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
 1008f38:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
 1008f3c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 1008f40:	48 85 c9             	test   rcx,rcx
 1008f43:	74 05                	je     1008f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0360>
 1008f45:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
 1008f4a:	0f 10 43 18          	movups xmm0,XMMWORD PTR [rbx+0x18]
 1008f4e:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
 1008f52:	5b                   	pop    rbx
 1008f53:	c3                   	ret
 1008f54:	48 8d 05 c5 b9 83 00 	lea    rax,[rip+0x83b9c5]        # 1844920 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1008>
 1008f5b:	48 89 06             	mov    QWORD PTR [rsi],rax
 1008f5e:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 1008f62:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 1008f66:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 1008f6a:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 1008f6e:	48 85 c0             	test   rax,rax
 1008f71:	74 05                	je     1008f78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d038e>
 1008f73:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 1008f78:	0f 10 47 18          	movups xmm0,XMMWORD PTR [rdi+0x18]
 1008f7c:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
 1008f80:	c3                   	ret
 1008f81:	cc                   	int3
 1008f82:	55                   	push   rbp
 1008f83:	41 57                	push   r15
 1008f85:	41 56                	push   r14
 1008f87:	41 55                	push   r13
 1008f89:	41 54                	push   r12
 1008f8b:	53                   	push   rbx
 1008f8c:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
 1008f93:	49 89 cf             	mov    r15,rcx
 1008f96:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi
 1008f9b:	48 89 fd             	mov    rbp,rdi
 1008f9e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1008fa5:	00 00
 1008fa7:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
 1008fae:	00
 1008faf:	0f 57 c0             	xorps  xmm0,xmm0
 1008fb2:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
 1008fb7:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
 1008fbd:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
 1008fc1:	48 2b 01             	sub    rax,QWORD PTR [rcx]
 1008fc4:	6a 18                	push   0x18
 1008fc6:	59                   	pop    rcx
 1008fc7:	48 99                	cqo
 1008fc9:	48 f7 f9             	idiv   rcx
 1008fcc:	48 83 f8 01          	cmp    rax,0x1
 1008fd0:	77 1a                	ja     1008fec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0402>
 1008fd2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 1008fd7:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
 1008fdc:	e8 2b 09 b5 ff       	call   b5990c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa68ac>
 1008fe1:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
 1008fe7:	e9 aa 02 00 00       	jmp    1009296 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d06ac>
 1008fec:	48 89 2c 24          	mov    QWORD PTR [rsp],rbp
 1008ff0:	48 8d 94 24 b0 00 00 	lea    rdx,[rsp+0xb0]
 1008ff7:	00
 1008ff8:	48 83 22 00          	and    QWORD PTR [rdx],0x0
 1008ffc:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 1009001:	48 89 c6             	mov    rsi,rax
 1009004:	e8 6d dc fd ff       	call   fe6c76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ae08c>
 1009009:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
 100900c:	49 39 4f 08          	cmp    QWORD PTR [r15+0x8],rcx
 1009010:	0f 84 86 01 00 00    	je     100919c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d05b2>
 1009016:	45 31 f6             	xor    r14d,r14d
 1009019:	4c 8d 64 24 48       	lea    r12,[rsp+0x48]
 100901e:	48 8d 9c 24 98 00 00 	lea    rbx,[rsp+0x98]
 1009025:	00
 1009026:	31 ed                	xor    ebp,ebp
 1009028:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 100902d:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
 1009031:	4a 8b 14 31          	mov    rdx,QWORD PTR [rcx+r14*1]
 1009035:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1009038:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 100903f:	00
 1009040:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1009043:	83 bc 24 b0 00 00 00 	cmp    DWORD PTR [rsp+0xb0],0x0
 100904a:	00
 100904b:	0f 85 1c 01 00 00    	jne    100916d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0583>
 1009051:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
 1009058:	00
 1009059:	48 85 f6             	test   rsi,rsi
 100905c:	0f 84 0b 01 00 00    	je     100916d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0583>
 1009062:	48 81 c6 20 01 00 00 	add    rsi,0x120
 1009069:	4c 89 e7             	mov    rdi,r12
 100906c:	e8 cf 4e 7e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1009071:	4c 89 e7             	mov    rdi,r12
 1009074:	48 8d 35 82 db 33 ff 	lea    rsi,[rip+0xffffffffff33db82]        # 346bfd <_ZTSSt12bad_any_cast@@Base-0x495cb>
 100907b:	31 d2                	xor    edx,edx
 100907d:	e8 18 97 ae ff       	call   af279a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f73a>
 1009082:	48 8d 48 ff          	lea    rcx,[rax-0x1]
 1009086:	48 83 f9 fd          	cmp    rcx,0xfffffffffffffffd
 100908a:	77 23                	ja     10090af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d04c5>
 100908c:	48 89 df             	mov    rdi,rbx
 100908f:	4c 89 e6             	mov    rsi,r12
 1009092:	31 d2                	xor    edx,edx
 1009094:	48 89 c1             	mov    rcx,rax
 1009097:	e8 88 45 ab ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
 100909c:	4c 89 e7             	mov    rdi,r12
 100909f:	48 89 de             	mov    rsi,rbx
 10090a2:	e8 87 29 a7 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 10090a7:	48 89 df             	mov    rdi,rbx
 10090aa:	e8 e1 4d 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10090af:	4c 89 e7             	mov    rdi,r12
 10090b2:	48 8d 35 fc 86 34 ff 	lea    rsi,[rip+0xffffffffff3486fc]        # 3517b5 <_ZTSSt12bad_any_cast@@Base-0x3ea13>
 10090b9:	31 d2                	xor    edx,edx
 10090bb:	e8 da 96 ae ff       	call   af279a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f73a>
 10090c0:	48 8d 48 ff          	lea    rcx,[rax-0x1]
 10090c4:	48 83 f9 fd          	cmp    rcx,0xfffffffffffffffd
 10090c8:	77 23                	ja     10090ed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0503>
 10090ca:	48 89 df             	mov    rdi,rbx
 10090cd:	4c 89 e6             	mov    rsi,r12
 10090d0:	31 d2                	xor    edx,edx
 10090d2:	48 89 c1             	mov    rcx,rax
 10090d5:	e8 4a 45 ab ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
 10090da:	4c 89 e7             	mov    rdi,r12
 10090dd:	48 89 de             	mov    rsi,rbx
 10090e0:	e8 49 29 a7 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 10090e5:	48 89 df             	mov    rdi,rbx
 10090e8:	e8 a3 4d 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10090ed:	4c 89 e7             	mov    rdi,r12
 10090f0:	e8 41 27 a7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10090f5:	0f 57 c0             	xorps  xmm0,xmm0
 10090f8:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 10090fd:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
 1009103:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
 100910a:	00
 100910b:	4c 89 e7             	mov    rdi,r12
 100910e:	48 89 c6             	mov    rsi,rax
 1009111:	e8 8a 4d 7e 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
 1009116:	4d 89 fd             	mov    r13,r15
 1009119:	48 89 df             	mov    rdi,rbx
 100911c:	4c 89 e6             	mov    rsi,r12
 100911f:	e8 a2 21 7d 00       	call   17db2c6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x70e7>
 1009124:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
 1009129:	4c 89 ff             	mov    rdi,r15
 100912c:	48 89 de             	mov    rsi,rbx
 100912f:	e8 fa 28 a7 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 1009134:	48 89 df             	mov    rdi,rbx
 1009137:	e8 54 4d 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 100913c:	4c 89 e7             	mov    rdi,r12
 100913f:	e8 4c 4d 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1009144:	4c 89 ff             	mov    rdi,r15
 1009147:	e8 74 65 a9 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
 100914c:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
 1009151:	48 89 04 e9          	mov    QWORD PTR [rcx+rbp*8],rax
 1009155:	4c 89 ff             	mov    rdi,r15
 1009158:	e8 33 4d 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 100915d:	4c 8d 64 24 48       	lea    r12,[rsp+0x48]
 1009162:	4c 89 e7             	mov    rdi,r12
 1009165:	e8 26 4d 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 100916a:	4d 89 ef             	mov    r15,r13
 100916d:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
 1009174:	00
 1009175:	e8 0c 53 a9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 100917a:	48 ff c5             	inc    rbp
 100917d:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
 1009180:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 1009184:	48 29 c8             	sub    rax,rcx
 1009187:	48 99                	cqo
 1009189:	6a 18                	push   0x18
 100918b:	5e                   	pop    rsi
 100918c:	48 f7 fe             	idiv   rsi
 100918f:	49 83 c6 18          	add    r14,0x18
 1009193:	48 39 c5             	cmp    rbp,rax
 1009196:	0f 82 8c fe ff ff    	jb     1009028 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d043e>
 100919c:	0f 57 c0             	xorps  xmm0,xmm0
 100919f:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
 10091a6:	00
 10091a7:	0f 29 84 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm0
 10091ae:	00
 10091af:	c7 84 24 d0 00 00 00 	mov    DWORD PTR [rsp+0xd0],0x3f800000
 10091b6:	00 00 80 3f
 10091ba:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
 10091bf:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
 10091c4:	4c 39 eb             	cmp    rbx,r13
 10091c7:	0f 84 9c 00 00 00    	je     1009269 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d067f>
 10091cd:	45 31 f6             	xor    r14d,r14d
 10091d0:	4c 8d a4 24 b0 00 00 	lea    r12,[rsp+0xb0]
 10091d7:	00
 10091d8:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
 10091df:	00
 10091e0:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
 10091e7:	00
```
### filtered dataflow rows for `0x1008f1e`

| addr | instruction |
|---:|---|
| `0x1008ec5` | `1008ec5:	48 89 f0             	mov    rax,rsi` |
| `0x1008ec8` | `1008ec8:	48 89 fb             	mov    rbx,rdi` |
| `0x1008ece` | `1008ece:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]` |
| `0x1008ed0` | `1008ed0:	48 8d 7b 70          	lea    rdi,[rbx+0x70]` |
| `0x1008ed8` | `1008ed8:	48 89 c6             	mov    rsi,rax` |
| `0x1008ee7` | `1008ee7:	48 89 fb             	mov    rbx,rdi` |
| `0x1008eef` | `1008eef:	48 89 df             	mov    rdi,rbx` |
| `0x1008eff` | `1008eff:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x1008f02` | `1008f02:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]` |
| `0x1008f0d` | `1008f0d:	48 89 fb             	mov    rbx,rdi` |
| `0x1008f15` | `1008f15:	48 89 df             	mov    rdi,rbx` |
| `0x1008f1f` | `1008f1f:	48 89 fb             	mov    rbx,rdi` |
| `0x1008f24` | `1008f24:	5f                   	pop    rdi` |
| `0x1008f4a` | `1008f4a:	0f 10 43 18          	movups xmm0,XMMWORD PTR [rbx+0x18]` |
| `0x1008f4e` | `1008f4e:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0` |
| `0x1008f5b` | `1008f5b:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0x1008f5e` | `1008f5e:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x1008f62` | `1008f62:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax` |
| `0x1008f66` | `1008f66:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0x1008f6a` | `1008f6a:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax` |
| `0x1008f78` | `1008f78:	0f 10 47 18          	movups xmm0,XMMWORD PTR [rdi+0x18]` |
| `0x1008f7c` | `1008f7c:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0` |
| `0x1008f96` | `1008f96:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi` |
| `0x1008f9b` | `1008f9b:	48 89 fd             	mov    rbp,rdi` |
| `0x1008fd2` | `1008fd2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0x1008fd7` | `1008fd7:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]` |
| `0x1008fe1` | `1008fe1:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0` |
| `0x1008ff0` | `1008ff0:	48 8d 94 24 b0 00 00 	lea    rdx,[rsp+0xb0]` |
| `0x1008ff8` | `1008ff8:	48 83 22 00          	and    QWORD PTR [rdx],0x0` |
| `0x1008ffc` | `1008ffc:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]` |
| `0x1009001` | `1009001:	48 89 c6             	mov    rsi,rax` |
| `0x100902d` | `100902d:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]` |
| `0x1009031` | `1009031:	4a 8b 14 31          	mov    rdx,QWORD PTR [rcx+r14*1]` |
| `0x1009035` | `1009035:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0x1009038` | `1009038:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]` |
| `0x1009040` | `1009040:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x1009051` | `1009051:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]` |
| `0x1009059` | `1009059:	48 85 f6             	test   rsi,rsi` |
| `0x1009062` | `1009062:	48 81 c6 20 01 00 00 	add    rsi,0x120` |
| `0x1009069` | `1009069:	4c 89 e7             	mov    rdi,r12` |
| `0x1009071` | `1009071:	4c 89 e7             	mov    rdi,r12` |
| `0x1009074` | `1009074:	48 8d 35 82 db 33 ff 	lea    rsi,[rip+0xffffffffff33db82]        # 346bfd <_ZTSSt12bad_any_cast@@Base-0x495cb>` |
| `0x100908c` | `100908c:	48 89 df             	mov    rdi,rbx` |
| `0x100908f` | `100908f:	4c 89 e6             	mov    rsi,r12` |
| `0x100909c` | `100909c:	4c 89 e7             	mov    rdi,r12` |
| `0x100909f` | `100909f:	48 89 de             	mov    rsi,rbx` |
| `0x10090a7` | `10090a7:	48 89 df             	mov    rdi,rbx` |
| `0x10090af` | `10090af:	4c 89 e7             	mov    rdi,r12` |
| `0x10090b2` | `10090b2:	48 8d 35 fc 86 34 ff 	lea    rsi,[rip+0xffffffffff3486fc]        # 3517b5 <_ZTSSt12bad_any_cast@@Base-0x3ea13>` |
| `0x10090ca` | `10090ca:	48 89 df             	mov    rdi,rbx` |
| `0x10090cd` | `10090cd:	4c 89 e6             	mov    rsi,r12` |
| `0x10090da` | `10090da:	4c 89 e7             	mov    rdi,r12` |
| `0x10090dd` | `10090dd:	48 89 de             	mov    rsi,rbx` |
| `0x10090e5` | `10090e5:	48 89 df             	mov    rdi,rbx` |
| `0x10090ed` | `10090ed:	4c 89 e7             	mov    rdi,r12` |
| `0x10090f8` | `10090f8:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0` |
| `0x100910b` | `100910b:	4c 89 e7             	mov    rdi,r12` |
| `0x100910e` | `100910e:	48 89 c6             	mov    rsi,rax` |
| `0x1009119` | `1009119:	48 89 df             	mov    rdi,rbx` |
| `0x100911c` | `100911c:	4c 89 e6             	mov    rsi,r12` |
| `0x1009124` | `1009124:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]` |
| `0x1009129` | `1009129:	4c 89 ff             	mov    rdi,r15` |
| `0x100912c` | `100912c:	48 89 de             	mov    rsi,rbx` |
| `0x1009134` | `1009134:	48 89 df             	mov    rdi,rbx` |
| `0x100913c` | `100913c:	4c 89 e7             	mov    rdi,r12` |
| `0x1009144` | `1009144:	4c 89 ff             	mov    rdi,r15` |
| `0x1009155` | `1009155:	4c 89 ff             	mov    rdi,r15` |
| `0x1009162` | `1009162:	4c 89 e7             	mov    rdi,r12` |
| `0x100916d` | `100916d:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]` |
| `0x100918b` | `100918b:	5e                   	pop    rsi` |
| `0x100918c` | `100918c:	48 f7 fe             	idiv   rsi` |
| `0x10091d8` | `10091d8:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]` |
| `0x10091e0` | `10091e0:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]` |

## Candidate `+0xa0` method `0x1009cb0` full window

```text
 1009c1c:	74 1f                	je     1009c3d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1053>
 1009c1e:	49 8d 76 e8          	lea    rsi,[r14-0x18]
 1009c22:	48 89 df             	mov    rdi,rbx
 1009c25:	e8 15 12 67 00       	call   167ae3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2efab>
 1009c2a:	4c 89 f7             	mov    rdi,r14
 1009c2d:	48 89 de             	mov    rsi,rbx
 1009c30:	e8 f9 1d a7 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 1009c35:	48 89 df             	mov    rdi,rbx
 1009c38:	e8 53 42 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1009c3d:	49 8d 46 48          	lea    rax,[r14+0x48]
 1009c41:	49 83 c6 30          	add    r14,0x30
 1009c45:	4d 39 ee             	cmp    r14,r13
 1009c48:	49 89 c6             	mov    r14,rax
 1009c4b:	75 c1                	jne    1009c0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1024>
 1009c4d:	49 83 c7 68          	add    r15,0x68
 1009c51:	4d 39 e7             	cmp    r15,r12
 1009c54:	75 8f                	jne    1009be5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0ffb>
 1009c56:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1009c5b:	e8 fa af eb ff       	call   ec4c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c070>
 1009c60:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1009c65:	e8 1e 17 e0 ff       	call   e0b388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd840e>
 1009c6a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1009c71:	00 00
 1009c73:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
 1009c78:	75 0f                	jne    1009c89 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d109f>
 1009c7a:	48 83 c4 68          	add    rsp,0x68
 1009c7e:	5b                   	pop    rbx
 1009c7f:	41 5c                	pop    r12
 1009c81:	41 5d                	pop    r13
 1009c83:	41 5e                	pop    r14
 1009c85:	41 5f                	pop    r15
 1009c87:	5d                   	pop    rbp
 1009c88:	c3                   	ret
 1009c89:	e8 22 5e 7e 00       	call   17efab0 <__stack_chk_fail@plt>
 1009c8e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 1009c91:	c6 47 58 00          	mov    BYTE PTR [rdi+0x58],0x0
 1009c95:	48 83 c7 60          	add    rdi,0x60
 1009c99:	e9 0a ee b1 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 1009c9e:	53                   	push   rbx
 1009c9f:	48 89 fb             	mov    rbx,rdi
 1009ca2:	e8 a5 01 00 00       	call   1009e4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1262>
 1009ca7:	48 83 c3 28          	add    rbx,0x28
 1009cab:	48 89 d8             	mov    rax,rbx
 1009cae:	5b                   	pop    rbx
 1009caf:	c3                   	ret
 1009cb0:	53                   	push   rbx
 1009cb1:	48 89 fb             	mov    rbx,rdi
 1009cb4:	48 8d 05 ad ac 83 00 	lea    rax,[rip+0x83acad]        # 1844968 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1050>
 1009cbb:	48 89 07             	mov    QWORD PTR [rdi],rax
 1009cbe:	48 83 c7 60          	add    rdi,0x60
 1009cc2:	e8 9f 01 7d 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 1009cc7:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 1009ccb:	e8 e8 c6 eb ff       	call   ec63b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7ce>
 1009cd0:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1009cd4:	e8 fb fe 7c 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 1009cd9:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 1009cdd:	5b                   	pop    rbx
 1009cde:	e9 a3 47 a9 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 1009ce3:	cc                   	int3
 1009ce4:	53                   	push   rbx
 1009ce5:	48 89 fb             	mov    rbx,rdi
 1009ce8:	e8 c3 ff ff ff       	call   1009cb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d10c6>
 1009ced:	48 89 df             	mov    rdi,rbx
 1009cf0:	5b                   	pop    rbx
 1009cf1:	e9 2a 42 7e 00       	jmp    17edf20 <_ZdlPv@plt>
 1009cf6:	41 57                	push   r15
 1009cf8:	41 56                	push   r14
 1009cfa:	41 54                	push   r12
 1009cfc:	53                   	push   rbx
 1009cfd:	48 83 ec 78          	sub    rsp,0x78
 1009d01:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1009d08:	00 00
 1009d0a:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 1009d0f:	80 be 30 09 00 00 00 	cmp    BYTE PTR [rsi+0x930],0x0
 1009d16:	0f 84 db 00 00 00    	je     1009df7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d120d>
 1009d1c:	49 89 f6             	mov    r14,rsi
 1009d1f:	80 be a9 09 00 00 00 	cmp    BYTE PTR [rsi+0x9a9],0x0
 1009d26:	0f 85 cb 00 00 00    	jne    1009df7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d120d>
 1009d2c:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0
 1009d30:	0f 84 c1 00 00 00    	je     1009df7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d120d>
 1009d36:	48 89 fb             	mov    rbx,rdi
 1009d39:	4d 8d be c0 04 00 00 	lea    r15,[r14+0x4c0]
 1009d40:	e8 07 01 00 00       	call   1009e4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1262>
 1009d45:	48 83 7b 50 00       	cmp    QWORD PTR [rbx+0x50],0x0
 1009d4a:	74 2c                	je     1009d78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d118e>
 1009d4c:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
 1009d50:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
 1009d54:	6a 33                	push   0x33
 1009d56:	5e                   	pop    rsi
 1009d57:	31 d2                	xor    edx,edx
 1009d59:	48 f7 f6             	div    rsi
 1009d5c:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
 1009d60:	48 6b ca 50          	imul   rcx,rdx,0x50
 1009d64:	48 8d 3c 08          	lea    rdi,[rax+rcx*1]
 1009d68:	48 83 c7 08          	add    rdi,0x8
 1009d6c:	4c 89 fe             	mov    rsi,r15
 1009d6f:	e8 7a 59 a9 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 1009d74:	84 c0                	test   al,al
 1009d76:	75 7f                	jne    1009df7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d120d>
 1009d78:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
 1009d7d:	4c 89 e7             	mov    rdi,r12
 1009d80:	4c 89 fe             	mov    rsi,r15
 1009d83:	e8 d6 f3 66 00       	call   167915e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d2ca>
 1009d88:	48 89 e7             	mov    rdi,rsp
 1009d8b:	4c 89 e6             	mov    rsi,r12
 1009d8e:	e8 ad 41 7e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1009d93:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
 1009d98:	48 8d 35 b9 26 43 ff 	lea    rsi,[rip+0xffffffffff4326b9]        # 43c458 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2064>
 1009d9f:	4c 89 ff             	mov    rdi,r15
 1009da2:	e8 2d 89 e0 ff       	call   e126d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdf75a>
 1009da7:	84 c0                	test   al,al
 1009da9:	74 1a                	je     1009dc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d11db>
 1009dab:	48 8d 35 a6 26 43 ff 	lea    rsi,[rip+0xffffffffff4326a6]        # 43c458 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2064>
 1009db2:	4c 89 ff             	mov    rdi,r15
 1009db5:	e8 d2 6d 6c 00       	call   16d0b8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84cf8>
 1009dba:	48 89 e7             	mov    rdi,rsp
 1009dbd:	48 89 c6             	mov    rsi,rax
 1009dc0:	e8 bb 42 7e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 1009dc5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 1009dc9:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1009dcc:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
 1009dd1:	48 89 02             	mov    QWORD PTR [rdx],rax
 1009dd4:	c6 42 08 01          	mov    BYTE PTR [rdx+0x8],0x1
 1009dd8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1009ddb:	48 89 e6             	mov    rsi,rsp
 1009dde:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1009de1:	c6 43 58 00          	mov    BYTE PTR [rbx+0x58],0x0
 1009de5:	48 89 e7             	mov    rdi,rsp
 1009de8:	e8 a3 40 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1009ded:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 1009df2:	e8 97 45 0a 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
 1009df7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1009dfe:	00 00
 1009e00:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
 1009e05:	75 40                	jne    1009e47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d125d>
 1009e07:	48 83 c4 78          	add    rsp,0x78
 1009e0b:	5b                   	pop    rbx
 1009e0c:	41 5c                	pop    r12
 1009e0e:	41 5e                	pop    r14
 1009e10:	41 5f                	pop    r15
 1009e12:	c3                   	ret
 1009e13:	eb 00                	jmp    1009e15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d122b>
 1009e15:	48 89 c3             	mov    rbx,rax
 1009e18:	48 89 e7             	mov    rdi,rsp
 1009e1b:	e8 70 40 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1009e20:	eb 03                	jmp    1009e25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d123b>
 1009e22:	48 89 c3             	mov    rbx,rax
 1009e25:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 1009e2a:	e8 5f 45 0a 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
 1009e2f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1009e36:	00 00
 1009e38:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
 1009e3d:	75 08                	jne    1009e47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d125d>
 1009e3f:	48 89 df             	mov    rdi,rbx
 1009e42:	e8 89 5e a6 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1009e47:	e8 64 5c 7e 00       	call   17efab0 <__stack_chk_fail@plt>
 1009e4c:	55                   	push   rbp
 1009e4d:	41 57                	push   r15
 1009e4f:	41 56                	push   r14
 1009e51:	41 55                	push   r13
 1009e53:	41 54                	push   r12
 1009e55:	53                   	push   rbx
 1009e56:	48 81 ec 98 00 00 00 	sub    rsp,0x98
 1009e5d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1009e64:	00 00
 1009e66:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 1009e6d:	00
 1009e6e:	80 7f 58 00          	cmp    BYTE PTR [rdi+0x58],0x0
 1009e72:	0f 85 b6 00 00 00    	jne    1009f2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1344>
 1009e78:	48 89 fb             	mov    rbx,rdi
 1009e7b:	4c 8d 77 28          	lea    r14,[rdi+0x28]
 1009e7f:	4c 89 f7             	mov    rdi,r14
 1009e82:	e8 67 c5 eb ff       	call   ec63ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d804>
 1009e87:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
 1009e8c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
 1009e90:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1009e93:	4c 8d 64 24 78       	lea    r12,[rsp+0x78]
 1009e98:	4c 89 e7             	mov    rdi,r12
 1009e9b:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1009e9e:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
 1009ea2:	49 8b 6c 24 08       	mov    rbp,QWORD PTR [r12+0x8]
 1009ea7:	49 39 ef             	cmp    r15,rbp
 1009eaa:	74 6f                	je     1009f1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1331>
 1009eac:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
 1009eb1:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
 1009eb6:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
 1009ebb:	49 8d 77 08          	lea    rsi,[r15+0x8]
 1009ebf:	4c 89 e7             	mov    rdi,r12
 1009ec2:	e8 79 40 7e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1009ec7:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 1009ecc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1009ed1:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
 1009ed6:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 1009edb:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 1009ee1:	0f 57 c0             	xorps  xmm0,xmm0
 1009ee4:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 1009ee9:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 1009eed:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 1009ef1:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 1009ef4:	4c 89 f7             	mov    rdi,r14
 1009ef7:	4c 89 fe             	mov    rsi,r15
 1009efa:	4c 89 ea             	mov    rdx,r13
 1009efd:	e8 8e 4e fe ff       	call   feed90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b61a6>
 1009f02:	4c 89 ef             	mov    rdi,r13
 1009f05:	e8 84 44 0a 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
 1009f0a:	4c 89 e7             	mov    rdi,r12
 1009f0d:	e8 7e 3f 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1009f12:	49 83 c7 20          	add    r15,0x20
 1009f16:	49 39 ef             	cmp    r15,rbp
 1009f19:	75 a0                	jne    1009ebb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d12d1>
 1009f1b:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 1009f20:	e8 71 65 c9 ff       	call   ca0496 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ed436>
 1009f25:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1009f2a:	c6 40 58 01          	mov    BYTE PTR [rax+0x58],0x1
 1009f2e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1009f35:	00 00
 1009f37:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
 1009f3e:	00
 1009f3f:	75 53                	jne    1009f94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d13aa>
 1009f41:	48 81 c4 98 00 00 00 	add    rsp,0x98
 1009f48:	5b                   	pop    rbx
 1009f49:	41 5c                	pop    r12
 1009f4b:	41 5d                	pop    r13
 1009f4d:	41 5e                	pop    r14
 1009f4f:	41 5f                	pop    r15
 1009f51:	5d                   	pop    rbp
 1009f52:	c3                   	ret
 1009f53:	48 89 c3             	mov    rbx,rax
 1009f56:	eb 17                	jmp    1009f6f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1385>
 1009f58:	48 89 c3             	mov    rbx,rax
 1009f5b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 1009f60:	e8 29 44 0a 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
 1009f65:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 1009f6a:	e8 21 3f 7e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1009f6f:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
```
### filtered dataflow rows for `0x1009cb0`

| addr | instruction |
|---:|---|
| `0x1009c1e` | `1009c1e:	49 8d 76 e8          	lea    rsi,[r14-0x18]` |
| `0x1009c22` | `1009c22:	48 89 df             	mov    rdi,rbx` |
| `0x1009c2a` | `1009c2a:	4c 89 f7             	mov    rdi,r14` |
| `0x1009c2d` | `1009c2d:	48 89 de             	mov    rsi,rbx` |
| `0x1009c35` | `1009c35:	48 89 df             	mov    rdi,rbx` |
| `0x1009c56` | `1009c56:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]` |
| `0x1009c60` | `1009c60:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0x1009c8e` | `1009c8e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0x1009c91` | `1009c91:	c6 47 58 00          	mov    BYTE PTR [rdi+0x58],0x0` |
| `0x1009c95` | `1009c95:	48 83 c7 60          	add    rdi,0x60` |
| `0x1009c9f` | `1009c9f:	48 89 fb             	mov    rbx,rdi` |
| `0x1009cb1` | `1009cb1:	48 89 fb             	mov    rbx,rdi` |
| `0x1009cbb` | `1009cbb:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x1009cbe` | `1009cbe:	48 83 c7 60          	add    rdi,0x60` |
| `0x1009cc7` | `1009cc7:	48 8d 7b 28          	lea    rdi,[rbx+0x28]` |
| `0x1009cd0` | `1009cd0:	48 8d 7b 18          	lea    rdi,[rbx+0x18]` |
| `0x1009cd9` | `1009cd9:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0x1009ce5` | `1009ce5:	48 89 fb             	mov    rbx,rdi` |
| `0x1009ced` | `1009ced:	48 89 df             	mov    rdi,rbx` |
| `0x1009d0f` | `1009d0f:	80 be 30 09 00 00 00 	cmp    BYTE PTR [rsi+0x930],0x0` |
| `0x1009d1c` | `1009d1c:	49 89 f6             	mov    r14,rsi` |
| `0x1009d1f` | `1009d1f:	80 be a9 09 00 00 00 	cmp    BYTE PTR [rsi+0x9a9],0x0` |
| `0x1009d36` | `1009d36:	48 89 fb             	mov    rbx,rdi` |
| `0x1009d4c` | `1009d4c:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]` |
| `0x1009d56` | `1009d56:	5e                   	pop    rsi` |
| `0x1009d59` | `1009d59:	48 f7 f6             	div    rsi` |
| `0x1009d60` | `1009d60:	48 6b ca 50          	imul   rcx,rdx,0x50` |
| `0x1009d64` | `1009d64:	48 8d 3c 08          	lea    rdi,[rax+rcx*1]` |
| `0x1009d68` | `1009d68:	48 83 c7 08          	add    rdi,0x8` |
| `0x1009d6c` | `1009d6c:	4c 89 fe             	mov    rsi,r15` |
| `0x1009d78` | `1009d78:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]` |
| `0x1009d7d` | `1009d7d:	4c 89 e7             	mov    rdi,r12` |
| `0x1009d80` | `1009d80:	4c 89 fe             	mov    rsi,r15` |
| `0x1009d88` | `1009d88:	48 89 e7             	mov    rdi,rsp` |
| `0x1009d8b` | `1009d8b:	4c 89 e6             	mov    rsi,r12` |
| `0x1009d98` | `1009d98:	48 8d 35 b9 26 43 ff 	lea    rsi,[rip+0xffffffffff4326b9]        # 43c458 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2064>` |
| `0x1009d9f` | `1009d9f:	4c 89 ff             	mov    rdi,r15` |
| `0x1009dab` | `1009dab:	48 8d 35 a6 26 43 ff 	lea    rsi,[rip+0xffffffffff4326a6]        # 43c458 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2064>` |
| `0x1009db2` | `1009db2:	4c 89 ff             	mov    rdi,r15` |
| `0x1009dba` | `1009dba:	48 89 e7             	mov    rdi,rsp` |
| `0x1009dbd` | `1009dbd:	48 89 c6             	mov    rsi,rax` |
| `0x1009dc5` | `1009dc5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x1009dcc` | `1009dcc:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]` |
| `0x1009dd1` | `1009dd1:	48 89 02             	mov    QWORD PTR [rdx],rax` |
| `0x1009dd4` | `1009dd4:	c6 42 08 01          	mov    BYTE PTR [rdx+0x8],0x1` |
| `0x1009dd8` | `1009dd8:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1009ddb` | `1009ddb:	48 89 e6             	mov    rsi,rsp` |
| `0x1009dde` | `1009dde:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x1009de5` | `1009de5:	48 89 e7             	mov    rdi,rsp` |
| `0x1009ded` | `1009ded:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0x1009e18` | `1009e18:	48 89 e7             	mov    rdi,rsp` |
| `0x1009e25` | `1009e25:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0x1009e3f` | `1009e3f:	48 89 df             	mov    rdi,rbx` |
| `0x1009e6e` | `1009e6e:	80 7f 58 00          	cmp    BYTE PTR [rdi+0x58],0x0` |
| `0x1009e78` | `1009e78:	48 89 fb             	mov    rbx,rdi` |
| `0x1009e7b` | `1009e7b:	4c 8d 77 28          	lea    r14,[rdi+0x28]` |
| `0x1009e7f` | `1009e7f:	4c 89 f7             	mov    rdi,r14` |
| `0x1009e8c` | `1009e8c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]` |
| `0x1009e90` | `1009e90:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0x1009e98` | `1009e98:	4c 89 e7             	mov    rdi,r12` |
| `0x1009e9b` | `1009e9b:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x1009eb6` | `1009eb6:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]` |
| `0x1009ebb` | `1009ebb:	49 8d 77 08          	lea    rsi,[r15+0x8]` |
| `0x1009ebf` | `1009ebf:	4c 89 e7             	mov    rdi,r12` |
| `0x1009ec7` | `1009ec7:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]` |
| `0x1009ed6` | `1009ed6:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0` |
| `0x1009edb` | `1009edb:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0` |
| `0x1009ee9` | `1009ee9:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0` |
| `0x1009ef4` | `1009ef4:	4c 89 f7             	mov    rdi,r14` |
| `0x1009ef7` | `1009ef7:	4c 89 fe             	mov    rsi,r15` |
| `0x1009efa` | `1009efa:	4c 89 ea             	mov    rdx,r13` |
| `0x1009f02` | `1009f02:	4c 89 ef             	mov    rdi,r13` |
| `0x1009f0a` | `1009f0a:	4c 89 e7             	mov    rdi,r12` |
| `0x1009f1b` | `1009f1b:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]` |
| `0x1009f5b` | `1009f5b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]` |
| `0x1009f65` | `1009f65:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0x1009f6f` | `1009f6f:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]` |

## Candidate `+0xa0` method `0x1635176` full window

```text
 16350df:	48 8d 0d fa b2 25 00 	lea    rcx,[rip+0x25b2fa]        # 18903e0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x90b8>
 16350e6:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]
 16350eb:	48 89 de             	mov    rsi,rbx
 16350ee:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
 16350f1:	83 4b 10 ff          	or     DWORD PTR [rbx+0x10],0xffffffff
 16350f5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 16350fc:	00 00
 16350fe:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 1635103:	75 06                	jne    163510b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30279>
 1635105:	48 83 c4 10          	add    rsp,0x10
 1635109:	5b                   	pop    rbx
 163510a:	c3                   	ret
 163510b:	e8 a0 a9 1b 00       	call   17efab0 <__stack_chk_fail@plt>
 1635110:	48 89 c7             	mov    rdi,rax
 1635113:	e8 8d 49 44 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1635118:	41 56                	push   r14
 163511a:	53                   	push   rbx
 163511b:	50                   	push   rax
 163511c:	49 89 f6             	mov    r14,rsi
 163511f:	48 89 fb             	mov    rbx,rdi
 1635122:	e8 19 8e 1b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1635127:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 163512b:	49 83 c6 18          	add    r14,0x18
 163512f:	4c 89 f6             	mov    rsi,r14
 1635132:	e8 09 8e 1b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1635137:	48 83 c4 08          	add    rsp,0x8
 163513b:	5b                   	pop    rbx
 163513c:	41 5e                	pop    r14
 163513e:	c3                   	ret
 163513f:	49 89 c6             	mov    r14,rax
 1635142:	48 89 df             	mov    rdi,rbx
 1635145:	e8 46 8d 1b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 163514a:	4c 89 f7             	mov    rdi,r14
 163514d:	e8 7e ab 43 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1635152:	53                   	push   rbx
 1635153:	48 89 fb             	mov    rbx,rdi
 1635156:	48 83 c7 70          	add    rdi,0x70
 163515a:	e8 07 4d 1a 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 163515f:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 1635163:	e8 64 96 46 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 1635168:	48 83 c3 10          	add    rbx,0x10
 163516c:	48 89 df             	mov    rdi,rbx
 163516f:	5b                   	pop    rbx
 1635170:	e9 f5 4d 44 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
 1635175:	cc                   	int3
 1635176:	53                   	push   rbx
 1635177:	48 89 fb             	mov    rbx,rdi
 163517a:	e8 d3 ff ff ff       	call   1635152 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302c0>
 163517f:	48 89 df             	mov    rdi,rbx
 1635182:	5b                   	pop    rbx
 1635183:	e9 98 8d 1b 00       	jmp    17edf20 <_ZdlPv@plt>
 1635188:	41 57                	push   r15
 163518a:	41 56                	push   r14
 163518c:	53                   	push   rbx
 163518d:	49 89 f6             	mov    r14,rsi
 1635190:	48 89 fb             	mov    rbx,rdi
 1635193:	4c 8d 7f 40          	lea    r15,[rdi+0x40]
 1635197:	48 89 f7             	mov    rdi,rsi
 163519a:	4c 89 fe             	mov    rsi,r15
 163519d:	e8 4c a5 46 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 16351a2:	84 c0                	test   al,al
 16351a4:	74 17                	je     16351bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3032b>
 16351a6:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 16351aa:	48 8d 73 58          	lea    rsi,[rbx+0x58]
 16351ae:	e8 3b a5 46 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 16351b3:	84 c0                	test   al,al
 16351b5:	74 06                	je     16351bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3032b>
 16351b7:	5b                   	pop    rbx
 16351b8:	41 5e                	pop    r14
 16351ba:	41 5f                	pop    r15
 16351bc:	c3                   	ret
 16351bd:	4c 89 ff             	mov    rdi,r15
 16351c0:	4c 89 f6             	mov    rsi,r14
 16351c3:	e8 b8 8e 1b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 16351c8:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 16351cc:	49 83 c6 18          	add    r14,0x18
 16351d0:	4c 89 f6             	mov    rsi,r14
 16351d3:	e8 a8 8e 1b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 16351d8:	48 83 c3 70          	add    rbx,0x70
 16351dc:	48 89 df             	mov    rdi,rbx
 16351df:	5b                   	pop    rbx
 16351e0:	41 5e                	pop    r14
 16351e2:	41 5f                	pop    r15
 16351e4:	e9 bf 38 4f ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 16351e9:	cc                   	int3
 16351ea:	41 56                	push   r14
 16351ec:	53                   	push   rbx
 16351ed:	50                   	push   rax
 16351ee:	48 89 f3             	mov    rbx,rsi
 16351f1:	49 89 fe             	mov    r14,rdi
 16351f4:	e8 af 35 53 ff       	call   b687a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5748>
 16351f9:	48 8d 05 c0 b2 25 00 	lea    rax,[rip+0x25b2c0]        # 18904c0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9198>
 1635200:	49 89 06             	mov    QWORD PTR [r14],rax
 1635203:	48 8d 05 46 b4 25 00 	lea    rax,[rip+0x25b446]        # 1890650 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9328>
 163520a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 163520e:	48 8d 05 6b b4 25 00 	lea    rax,[rip+0x25b46b]        # 1890680 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9358>
 1635215:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 1635219:	48 8d 05 88 b4 25 00 	lea    rax,[rip+0x25b488]        # 18906a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9380>
 1635220:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 1635224:	48 8d 05 ad b4 25 00 	lea    rax,[rip+0x25b4ad]        # 18906d8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x93b0>
 163522b:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
 163522f:	48 8d 05 e2 b4 25 00 	lea    rax,[rip+0x25b4e2]        # 1890718 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x93f0>
 1635236:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
 163523a:	48 8d 05 1f b5 25 00 	lea    rax,[rip+0x25b51f]        # 1890760 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9438>
 1635241:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 1635245:	48 8d 05 4c b5 25 00 	lea    rax,[rip+0x25b54c]        # 1890798 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9470>
 163524c:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
 1635250:	48 8d 05 71 b5 25 00 	lea    rax,[rip+0x25b571]        # 18907c8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x94a0>
 1635257:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
 163525b:	48 8d 05 9e b5 25 00 	lea    rax,[rip+0x25b59e]        # 1890800 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x94d8>
 1635262:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
 1635266:	48 8d 05 c3 b5 25 00 	lea    rax,[rip+0x25b5c3]        # 1890830 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9508>
 163526d:	49 89 46 50          	mov    QWORD PTR [r14+0x50],rax
 1635271:	48 8d 05 e0 b5 25 00 	lea    rax,[rip+0x25b5e0]        # 1890858 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9530>
 1635278:	49 89 46 58          	mov    QWORD PTR [r14+0x58],rax
 163527c:	48 8d 05 fd b5 25 00 	lea    rax,[rip+0x25b5fd]        # 1890880 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9558>
 1635283:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
 1635287:	48 8d 05 1a b6 25 00 	lea    rax,[rip+0x25b61a]        # 18908a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9580>
 163528e:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
 1635292:	48 8d 05 37 b6 25 00 	lea    rax,[rip+0x25b637]        # 18908d0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x95a8>
 1635299:	49 89 46 70          	mov    QWORD PTR [r14+0x70],rax
 163529d:	48 8d 05 54 b6 25 00 	lea    rax,[rip+0x25b654]        # 18908f8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x95d0>
 16352a4:	49 89 46 78          	mov    QWORD PTR [r14+0x78],rax
 16352a8:	48 8d 05 79 b6 25 00 	lea    rax,[rip+0x25b679]        # 1890928 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9600>
 16352af:	49 89 86 80 00 00 00 	mov    QWORD PTR [r14+0x80],rax
 16352b6:	48 8d 05 93 b6 25 00 	lea    rax,[rip+0x25b693]        # 1890950 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9628>
 16352bd:	49 89 86 88 00 00 00 	mov    QWORD PTR [r14+0x88],rax
 16352c4:	49 81 c6 90 00 00 00 	add    r14,0x90
 16352cb:	4c 89 f7             	mov    rdi,r14
 16352ce:	48 89 de             	mov    rsi,rbx
 16352d1:	48 83 c4 08          	add    rsp,0x8
 16352d5:	5b                   	pop    rbx
 16352d6:	41 5e                	pop    r14
 16352d8:	e9 71 d7 61 ff       	jmp    c52a4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f9ee>
 16352dd:	cc                   	int3
 16352de:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 16352e5:	48 83 c0 50          	add    rax,0x50
 16352e9:	c3                   	ret
 16352ea:	50                   	push   rax
 16352eb:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16352f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16352f5:	ff 50 48             	call   QWORD PTR [rax+0x48]
 16352f8:	48 85 c0             	test   rax,rax
 16352fb:	0f 95 c0             	setne  al
 16352fe:	59                   	pop    rcx
 16352ff:	c3                   	ret
 1635300:	50                   	push   rax
 1635301:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 1635308:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 163530b:	ff 50 58             	call   QWORD PTR [rax+0x58]
 163530e:	48 85 c0             	test   rax,rax
 1635311:	0f 95 c0             	setne  al
 1635314:	59                   	pop    rcx
 1635315:	c3                   	ret
 1635316:	50                   	push   rax
 1635317:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163531e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635321:	ff 50 78             	call   QWORD PTR [rax+0x78]
 1635324:	48 85 c0             	test   rax,rax
 1635327:	0f 95 c0             	setne  al
 163532a:	59                   	pop    rcx
 163532b:	c3                   	ret
 163532c:	50                   	push   rax
 163532d:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 1635334:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635337:	ff 50 38             	call   QWORD PTR [rax+0x38]
 163533a:	48 85 c0             	test   rax,rax
 163533d:	0f 95 c0             	setne  al
 1635340:	59                   	pop    rcx
 1635341:	c3                   	ret
 1635342:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635349:	8b 40 44             	mov    eax,DWORD PTR [rax+0x44]
 163534c:	c3                   	ret
 163534d:	cc                   	int3
 163534e:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635355:	0f b6 40 48          	movzx  eax,BYTE PTR [rax+0x48]
 1635359:	c3                   	ret
 163535a:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635361:	0f b6 40 40          	movzx  eax,BYTE PTR [rax+0x40]
 1635365:	c3                   	ret
 1635366:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163536d:	e9 ce 32 00 00       	jmp    1638640 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ae>
 1635372:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635379:	e9 e2 32 00 00       	jmp    1638660 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ce>
 163537e:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635385:	e9 04 33 00 00       	jmp    163868e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337fc>
 163538a:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635391:	e9 26 33 00 00       	jmp    16386bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3382a>
 1635396:	50                   	push   rax
 1635397:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163539e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353a1:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353a4:	8b 88 d0 00 00 00    	mov    ecx,DWORD PTR [rax+0xd0]
 16353aa:	8d 51 01             	lea    edx,[rcx+0x1]
 16353ad:	31 c0                	xor    eax,eax
 16353af:	83 f9 03             	cmp    ecx,0x3
 16353b2:	0f 42 c2             	cmovb  eax,edx
 16353b5:	59                   	pop    rcx
 16353b6:	c3                   	ret
 16353b7:	cc                   	int3
 16353b8:	53                   	push   rbx
 16353b9:	48 89 fb             	mov    rbx,rdi
 16353bc:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]
 16353c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 16353c6:	31 d2                	xor    edx,edx
 16353c8:	ff 50 10             	call   QWORD PTR [rax+0x10]
 16353cb:	48 89 d8             	mov    rax,rbx
 16353ce:	5b                   	pop    rbx
 16353cf:	c3                   	ret
 16353d0:	50                   	push   rax
 16353d1:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16353d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353db:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353de:	48 8d 88 20 01 00 00 	lea    rcx,[rax+0x120]
 16353e5:	48 85 c0             	test   rax,rax
 16353e8:	48 8d 05 49 66 e0 fe 	lea    rax,[rip+0xfffffffffee06649]        # 43ba38 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1644>
 16353ef:	48 0f 45 c1          	cmovne rax,rcx
 16353f3:	59                   	pop    rcx
 16353f4:	c3                   	ret
 16353f5:	cc                   	int3
 16353f6:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16353fd:	e9 2c 2e 00 00       	jmp    163822e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3339c>
 1635402:	50                   	push   rax
 1635403:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163540a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 163540d:	ff 50 48             	call   QWORD PTR [rax+0x48]
 1635410:	48 8d 88 d8 00 00 00 	lea    rcx,[rax+0xd8]
 1635417:	48 85 c0             	test   rax,rax
 163541a:	48 0f 45 c1          	cmovne rax,rcx
 163541e:	59                   	pop    rcx
 163541f:	c3                   	ret
 1635420:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635427:	e9 3c 2f 00 00       	jmp    1638368 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334d6>
 163542c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635433:	e9 7c 30 00 00       	jmp    16384b4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33622>
```
### filtered dataflow rows for `0x1635176`

| addr | instruction |
|---:|---|
| `0x16350e6` | `16350e6:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]` |
| `0x16350eb` | `16350eb:	48 89 de             	mov    rsi,rbx` |
| `0x16350ee` | `16350ee:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]` |
| `0x1635103` | `1635103:	75 06                	jne    163510b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30279>` |
| `0x1635110` | `1635110:	48 89 c7             	mov    rdi,rax` |
| `0x163511c` | `163511c:	49 89 f6             	mov    r14,rsi` |
| `0x163511f` | `163511f:	48 89 fb             	mov    rbx,rdi` |
| `0x1635127` | `1635127:	48 8d 7b 18          	lea    rdi,[rbx+0x18]` |
| `0x163512f` | `163512f:	4c 89 f6             	mov    rsi,r14` |
| `0x1635142` | `1635142:	48 89 df             	mov    rdi,rbx` |
| `0x163514a` | `163514a:	4c 89 f7             	mov    rdi,r14` |
| `0x1635153` | `1635153:	48 89 fb             	mov    rbx,rdi` |
| `0x1635156` | `1635156:	48 83 c7 70          	add    rdi,0x70` |
| `0x163515f` | `163515f:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0x163516c` | `163516c:	48 89 df             	mov    rdi,rbx` |
| `0x1635170` | `1635170:	e9 f5 4d 44 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0x1635177` | `1635177:	48 89 fb             	mov    rbx,rdi` |
| `0x163517a` | `163517a:	e8 d3 ff ff ff       	call   1635152 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302c0>` |
| `0x163517f` | `163517f:	48 89 df             	mov    rdi,rbx` |
| `0x163518d` | `163518d:	49 89 f6             	mov    r14,rsi` |
| `0x1635190` | `1635190:	48 89 fb             	mov    rbx,rdi` |
| `0x1635193` | `1635193:	4c 8d 7f 40          	lea    r15,[rdi+0x40]` |
| `0x1635197` | `1635197:	48 89 f7             	mov    rdi,rsi` |
| `0x163519a` | `163519a:	4c 89 fe             	mov    rsi,r15` |
| `0x16351a4` | `16351a4:	74 17                	je     16351bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3032b>` |
| `0x16351a6` | `16351a6:	49 8d 7e 18          	lea    rdi,[r14+0x18]` |
| `0x16351aa` | `16351aa:	48 8d 73 58          	lea    rsi,[rbx+0x58]` |
| `0x16351b5` | `16351b5:	74 06                	je     16351bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3032b>` |
| `0x16351bd` | `16351bd:	4c 89 ff             	mov    rdi,r15` |
| `0x16351c0` | `16351c0:	4c 89 f6             	mov    rsi,r14` |
| `0x16351c8` | `16351c8:	48 8d 7b 58          	lea    rdi,[rbx+0x58]` |
| `0x16351d0` | `16351d0:	4c 89 f6             	mov    rsi,r14` |
| `0x16351dc` | `16351dc:	48 89 df             	mov    rdi,rbx` |
| `0x16351ee` | `16351ee:	48 89 f3             	mov    rbx,rsi` |
| `0x16351f1` | `16351f1:	49 89 fe             	mov    r14,rdi` |
| `0x1635220` | `1635220:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x163522b` | `163522b:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax` |
| `0x1635236` | `1635236:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax` |
| `0x1635241` | `1635241:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0x163524c` | `163524c:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax` |
| `0x16352cb` | `16352cb:	4c 89 f7             	mov    rdi,r14` |
| `0x16352ce` | `16352ce:	48 89 de             	mov    rsi,rbx` |
| `0x16352de` | `16352de:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x16352eb` | `16352eb:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16352f2` | `16352f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16352f5` | `16352f5:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x1635301` | `1635301:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x1635308` | `1635308:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x163530b` | `163530b:	ff 50 58             	call   QWORD PTR [rax+0x58]` |
| `0x1635317` | `1635317:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163531e` | `163531e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635321` | `1635321:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x163532d` | `163532d:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x1635334` | `1635334:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635337` | `1635337:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0x1635342` | `1635342:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x163534e` | `163534e:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x163535a` | `163535a:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x1635366` | `1635366:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635372` | `1635372:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163537e` | `163537e:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163538a` | `163538a:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635397` | `1635397:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163539e` | `163539e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16353a1` | `16353a1:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x16353b9` | `16353b9:	48 89 fb             	mov    rbx,rdi` |
| `0x16353bc` | `16353bc:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]` |
| `0x16353c3` | `16353c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0x16353c8` | `16353c8:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x16353d1` | `16353d1:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16353d8` | `16353d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16353db` | `16353db:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x16353f6` | `16353f6:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635403` | `1635403:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163540a` | `163540a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x163540d` | `163540d:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x1635420` | `1635420:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163542c` | `163542c:	48 81 c7 90 00 00 00 	add    rdi,0x90` |

## Candidate `+0xa0` method `0x1635366` full window

```text
 16352de:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 16352e5:	48 83 c0 50          	add    rax,0x50
 16352e9:	c3                   	ret
 16352ea:	50                   	push   rax
 16352eb:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16352f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16352f5:	ff 50 48             	call   QWORD PTR [rax+0x48]
 16352f8:	48 85 c0             	test   rax,rax
 16352fb:	0f 95 c0             	setne  al
 16352fe:	59                   	pop    rcx
 16352ff:	c3                   	ret
 1635300:	50                   	push   rax
 1635301:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 1635308:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 163530b:	ff 50 58             	call   QWORD PTR [rax+0x58]
 163530e:	48 85 c0             	test   rax,rax
 1635311:	0f 95 c0             	setne  al
 1635314:	59                   	pop    rcx
 1635315:	c3                   	ret
 1635316:	50                   	push   rax
 1635317:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163531e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635321:	ff 50 78             	call   QWORD PTR [rax+0x78]
 1635324:	48 85 c0             	test   rax,rax
 1635327:	0f 95 c0             	setne  al
 163532a:	59                   	pop    rcx
 163532b:	c3                   	ret
 163532c:	50                   	push   rax
 163532d:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 1635334:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635337:	ff 50 38             	call   QWORD PTR [rax+0x38]
 163533a:	48 85 c0             	test   rax,rax
 163533d:	0f 95 c0             	setne  al
 1635340:	59                   	pop    rcx
 1635341:	c3                   	ret
 1635342:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635349:	8b 40 44             	mov    eax,DWORD PTR [rax+0x44]
 163534c:	c3                   	ret
 163534d:	cc                   	int3
 163534e:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635355:	0f b6 40 48          	movzx  eax,BYTE PTR [rax+0x48]
 1635359:	c3                   	ret
 163535a:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635361:	0f b6 40 40          	movzx  eax,BYTE PTR [rax+0x40]
 1635365:	c3                   	ret
 1635366:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163536d:	e9 ce 32 00 00       	jmp    1638640 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ae>
 1635372:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635379:	e9 e2 32 00 00       	jmp    1638660 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ce>
 163537e:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635385:	e9 04 33 00 00       	jmp    163868e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337fc>
 163538a:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635391:	e9 26 33 00 00       	jmp    16386bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3382a>
 1635396:	50                   	push   rax
 1635397:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163539e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353a1:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353a4:	8b 88 d0 00 00 00    	mov    ecx,DWORD PTR [rax+0xd0]
 16353aa:	8d 51 01             	lea    edx,[rcx+0x1]
 16353ad:	31 c0                	xor    eax,eax
 16353af:	83 f9 03             	cmp    ecx,0x3
 16353b2:	0f 42 c2             	cmovb  eax,edx
 16353b5:	59                   	pop    rcx
 16353b6:	c3                   	ret
 16353b7:	cc                   	int3
 16353b8:	53                   	push   rbx
 16353b9:	48 89 fb             	mov    rbx,rdi
 16353bc:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]
 16353c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 16353c6:	31 d2                	xor    edx,edx
 16353c8:	ff 50 10             	call   QWORD PTR [rax+0x10]
 16353cb:	48 89 d8             	mov    rax,rbx
 16353ce:	5b                   	pop    rbx
 16353cf:	c3                   	ret
 16353d0:	50                   	push   rax
 16353d1:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16353d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353db:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353de:	48 8d 88 20 01 00 00 	lea    rcx,[rax+0x120]
 16353e5:	48 85 c0             	test   rax,rax
 16353e8:	48 8d 05 49 66 e0 fe 	lea    rax,[rip+0xfffffffffee06649]        # 43ba38 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1644>
 16353ef:	48 0f 45 c1          	cmovne rax,rcx
 16353f3:	59                   	pop    rcx
 16353f4:	c3                   	ret
 16353f5:	cc                   	int3
 16353f6:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16353fd:	e9 2c 2e 00 00       	jmp    163822e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3339c>
 1635402:	50                   	push   rax
 1635403:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163540a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 163540d:	ff 50 48             	call   QWORD PTR [rax+0x48]
 1635410:	48 8d 88 d8 00 00 00 	lea    rcx,[rax+0xd8]
 1635417:	48 85 c0             	test   rax,rax
 163541a:	48 0f 45 c1          	cmovne rax,rcx
 163541e:	59                   	pop    rcx
 163541f:	c3                   	ret
 1635420:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635427:	e9 3c 2f 00 00       	jmp    1638368 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334d6>
 163542c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635433:	e9 7c 30 00 00       	jmp    16384b4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33622>
 1635438:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 163543f:	8a 40 49             	mov    al,BYTE PTR [rax+0x49]
 1635442:	c3                   	ret
 1635443:	cc                   	int3
 1635444:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 163544b:	8b 40 68             	mov    eax,DWORD PTR [rax+0x68]
 163544e:	c3                   	ret
 163544f:	cc                   	int3
 1635450:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635457:	69 40 68 e8 03 00 00 	imul   eax,DWORD PTR [rax+0x68],0x3e8
 163545e:	c3                   	ret
 163545f:	cc                   	int3
 1635460:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635467:	e9 50 31 00 00       	jmp    16385bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3372a>
 163546c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635473:	e9 58 31 00 00       	jmp    16385d0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3373e>
 1635478:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163547f:	e9 60 31 00 00       	jmp    16385e4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33752>
 1635484:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163548b:	e9 68 31 00 00       	jmp    16385f8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33766>
 1635490:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635497:	e9 a2 30 00 00       	jmp    163853e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x336ac>
 163549c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16354a3:	e9 ea 30 00 00       	jmp    1638592 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33700>
 16354a8:	53                   	push   rbx
 16354a9:	48 89 fb             	mov    rbx,rdi
 16354ac:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]
 16354b3:	e8 50 32 00 00       	call   1638708 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33876>
 16354b8:	48 89 d8             	mov    rax,rbx
 16354bb:	5b                   	pop    rbx
 16354bc:	c3                   	ret
 16354bd:	cc                   	int3
 16354be:	50                   	push   rax
 16354bf:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16354c9:	ff 50 30             	call   QWORD PTR [rax+0x30]
 16354cc:	48 85 c0             	test   rax,rax
 16354cf:	74 09                	je     16354da <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30648>
 16354d1:	80 78 28 00          	cmp    BYTE PTR [rax+0x28],0x0
 16354d5:	0f 95 c0             	setne  al
 16354d8:	eb 02                	jmp    16354dc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3064a>
 16354da:	b0 01                	mov    al,0x1
 16354dc:	59                   	pop    rcx
 16354dd:	c3                   	ret
 16354de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354e5:	e9 de 5c 01 00       	jmp    164b1c8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46336>
 16354ea:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354f1:	e9 d8 5a 01 00       	jmp    164afce <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4613c>
 16354f6:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16354fd:	e9 34 32 00 00       	jmp    1638736 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338a4>
 1635502:	41 56                	push   r14
 1635504:	53                   	push   rbx
 1635505:	50                   	push   rax
 1635506:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163550d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635510:	ff 50 78             	call   QWORD PTR [rax+0x78]
 1635513:	48 85 c0             	test   rax,rax
 1635516:	74 4b                	je     1635563 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d1>
 1635518:	49 89 c6             	mov    r14,rax
 163551b:	48 8d b8 58 01 00 00 	lea    rdi,[rax+0x158]
 1635522:	e8 bf 57 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 1635527:	b3 01                	mov    bl,0x1
 1635529:	84 c0                	test   al,al
 163552b:	74 38                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>
 163552d:	49 8d be 80 01 00 00 	lea    rdi,[r14+0x180]
 1635534:	e8 ad 57 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 1635539:	84 c0                	test   al,al
 163553b:	74 28                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>
 163553d:	49 8d be 94 01 00 00 	lea    rdi,[r14+0x194]
 1635544:	e8 9d 57 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 1635549:	84 c0                	test   al,al
 163554b:	74 18                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>
 163554d:	49 81 c6 6c 01 00 00 	add    r14,0x16c
 1635554:	4c 89 f7             	mov    rdi,r14
 1635557:	e8 8a 57 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 163555c:	89 c3                	mov    ebx,eax
 163555e:	80 f3 01             	xor    bl,0x1
 1635561:	eb 02                	jmp    1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>
 1635563:	31 db                	xor    ebx,ebx
 1635565:	89 d8                	mov    eax,ebx
 1635567:	48 83 c4 08          	add    rsp,0x8
 163556b:	5b                   	pop    rbx
 163556c:	41 5e                	pop    r14
 163556e:	c3                   	ret
 163556f:	cc                   	int3
 1635570:	55                   	push   rbp
 1635571:	53                   	push   rbx
 1635572:	50                   	push   rax
 1635573:	89 d5                	mov    ebp,edx
 1635575:	48 89 fb             	mov    rbx,rdi
 1635578:	48 8b be f8 00 00 00 	mov    rdi,QWORD PTR [rsi+0xf8]
 163557f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635582:	ff 50 78             	call   QWORD PTR [rax+0x78]
 1635585:	48 85 c0             	test   rax,rax
 1635588:	74 33                	je     16355bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3072b>
 163558a:	48 89 c7             	mov    rdi,rax
 163558d:	89 ee                	mov    esi,ebp
 163558f:	e8 6a a9 ff ff       	call   162fefe <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b06c>
 1635594:	48 85 c0             	test   rax,rax
 1635597:	74 24                	je     16355bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3072b>
 1635599:	0f 57 c0             	xorps  xmm0,xmm0
 163559c:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 16355a0:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 16355a4:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 16355a7:	c7 43 38 10 00 00 00 	mov    DWORD PTR [rbx+0x38],0x10
 16355ae:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 16355b1:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
 16355b5:	8b 40 10             	mov    eax,DWORD PTR [rax+0x10]
 16355b8:	89 43 50             	mov    DWORD PTR [rbx+0x50],eax
 16355bb:	eb 12                	jmp    16355cf <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3073d>
 16355bd:	83 63 38 00          	and    DWORD PTR [rbx+0x38],0x0
 16355c1:	0f 57 c0             	xorps  xmm0,xmm0
 16355c4:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 16355c7:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 16355cb:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 16355cf:	48 89 d8             	mov    rax,rbx
 16355d2:	48 83 c4 08          	add    rsp,0x8
 16355d6:	5b                   	pop    rbx
 16355d7:	5d                   	pop    rbp
 16355d8:	c3                   	ret
 16355d9:	cc                   	int3
 16355da:	41 56                	push   r14
 16355dc:	53                   	push   rbx
 16355dd:	50                   	push   rax
 16355de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16355e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16355e8:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16355eb:	48 85 c0             	test   rax,rax
 16355ee:	74 4b                	je     163563b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307a9>
 16355f0:	49 89 c6             	mov    r14,rax
 16355f3:	48 8d b8 a8 01 00 00 	lea    rdi,[rax+0x1a8]
 16355fa:	e8 e7 56 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 16355ff:	b3 01                	mov    bl,0x1
 1635601:	84 c0                	test   al,al
 1635603:	74 38                	je     163563d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307ab>
```
### filtered dataflow rows for `0x1635366`

| addr | instruction |
|---:|---|
| `0x16352de` | `16352de:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x16352eb` | `16352eb:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16352f2` | `16352f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16352f5` | `16352f5:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x1635301` | `1635301:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x1635308` | `1635308:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x163530b` | `163530b:	ff 50 58             	call   QWORD PTR [rax+0x58]` |
| `0x1635317` | `1635317:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163531e` | `163531e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635321` | `1635321:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x163532d` | `163532d:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x1635334` | `1635334:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635337` | `1635337:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0x1635342` | `1635342:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x163534e` | `163534e:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x163535a` | `163535a:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x1635366` | `1635366:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635372` | `1635372:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163537e` | `163537e:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163538a` | `163538a:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635397` | `1635397:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163539e` | `163539e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16353a1` | `16353a1:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x16353b9` | `16353b9:	48 89 fb             	mov    rbx,rdi` |
| `0x16353bc` | `16353bc:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]` |
| `0x16353c3` | `16353c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0x16353c8` | `16353c8:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x16353d1` | `16353d1:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16353d8` | `16353d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16353db` | `16353db:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x16353f6` | `16353f6:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635403` | `1635403:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163540a` | `163540a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x163540d` | `163540d:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x1635420` | `1635420:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163542c` | `163542c:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635438` | `1635438:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x1635444` | `1635444:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x1635450` | `1635450:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x1635460` | `1635460:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163546c` | `163546c:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635478` | `1635478:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635484` | `1635484:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635490` | `1635490:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163549c` | `163549c:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x16354a9` | `16354a9:	48 89 fb             	mov    rbx,rdi` |
| `0x16354ac` | `16354ac:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]` |
| `0x16354bf` | `16354bf:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16354c6` | `16354c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16354c9` | `16354c9:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x16354cf` | `16354cf:	74 09                	je     16354da <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30648>` |
| `0x16354d1` | `16354d1:	80 78 28 00          	cmp    BYTE PTR [rax+0x28],0x0` |
| `0x16354d8` | `16354d8:	eb 02                	jmp    16354dc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3064a>` |
| `0x16354de` | `16354de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16354ea` | `16354ea:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16354f6` | `16354f6:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635506` | `1635506:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163550d` | `163550d:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635510` | `1635510:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x1635516` | `1635516:	74 4b                	je     1635563 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d1>` |
| `0x163551b` | `163551b:	48 8d b8 58 01 00 00 	lea    rdi,[rax+0x158]` |
| `0x163552b` | `163552b:	74 38                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>` |
| `0x163552d` | `163552d:	49 8d be 80 01 00 00 	lea    rdi,[r14+0x180]` |
| `0x163553b` | `163553b:	74 28                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>` |
| `0x163553d` | `163553d:	49 8d be 94 01 00 00 	lea    rdi,[r14+0x194]` |
| `0x163554b` | `163554b:	74 18                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>` |
| `0x1635554` | `1635554:	4c 89 f7             	mov    rdi,r14` |
| `0x1635561` | `1635561:	eb 02                	jmp    1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>` |
| `0x1635575` | `1635575:	48 89 fb             	mov    rbx,rdi` |
| `0x1635578` | `1635578:	48 8b be f8 00 00 00 	mov    rdi,QWORD PTR [rsi+0xf8]` |
| `0x163557f` | `163557f:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635582` | `1635582:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x1635588` | `1635588:	74 33                	je     16355bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3072b>` |
| `0x163558a` | `163558a:	48 89 c7             	mov    rdi,rax` |
| `0x1635597` | `1635597:	74 24                	je     16355bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3072b>` |
| `0x163559c` | `163559c:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0` |
| `0x16355a7` | `16355a7:	c7 43 38 10 00 00 00 	mov    DWORD PTR [rbx+0x38],0x10` |
| `0x16355bb` | `16355bb:	eb 12                	jmp    16355cf <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3073d>` |
| `0x16355bd` | `16355bd:	83 63 38 00          	and    DWORD PTR [rbx+0x38],0x0` |
| `0x16355cb` | `16355cb:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0` |
| `0x16355de` | `16355de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16355e5` | `16355e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16355e8` | `16355e8:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x16355ee` | `16355ee:	74 4b                	je     163563b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307a9>` |
| `0x16355f3` | `16355f3:	48 8d b8 a8 01 00 00 	lea    rdi,[rax+0x1a8]` |
| `0x1635603` | `1635603:	74 38                	je     163563d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307ab>` |

## Candidate `+0xa0` method `0x163537e` full window

```text
 16352eb:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16352f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16352f5:	ff 50 48             	call   QWORD PTR [rax+0x48]
 16352f8:	48 85 c0             	test   rax,rax
 16352fb:	0f 95 c0             	setne  al
 16352fe:	59                   	pop    rcx
 16352ff:	c3                   	ret
 1635300:	50                   	push   rax
 1635301:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 1635308:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 163530b:	ff 50 58             	call   QWORD PTR [rax+0x58]
 163530e:	48 85 c0             	test   rax,rax
 1635311:	0f 95 c0             	setne  al
 1635314:	59                   	pop    rcx
 1635315:	c3                   	ret
 1635316:	50                   	push   rax
 1635317:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163531e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635321:	ff 50 78             	call   QWORD PTR [rax+0x78]
 1635324:	48 85 c0             	test   rax,rax
 1635327:	0f 95 c0             	setne  al
 163532a:	59                   	pop    rcx
 163532b:	c3                   	ret
 163532c:	50                   	push   rax
 163532d:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 1635334:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635337:	ff 50 38             	call   QWORD PTR [rax+0x38]
 163533a:	48 85 c0             	test   rax,rax
 163533d:	0f 95 c0             	setne  al
 1635340:	59                   	pop    rcx
 1635341:	c3                   	ret
 1635342:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635349:	8b 40 44             	mov    eax,DWORD PTR [rax+0x44]
 163534c:	c3                   	ret
 163534d:	cc                   	int3
 163534e:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635355:	0f b6 40 48          	movzx  eax,BYTE PTR [rax+0x48]
 1635359:	c3                   	ret
 163535a:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635361:	0f b6 40 40          	movzx  eax,BYTE PTR [rax+0x40]
 1635365:	c3                   	ret
 1635366:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163536d:	e9 ce 32 00 00       	jmp    1638640 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ae>
 1635372:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635379:	e9 e2 32 00 00       	jmp    1638660 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ce>
 163537e:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635385:	e9 04 33 00 00       	jmp    163868e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337fc>
 163538a:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635391:	e9 26 33 00 00       	jmp    16386bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3382a>
 1635396:	50                   	push   rax
 1635397:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163539e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353a1:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353a4:	8b 88 d0 00 00 00    	mov    ecx,DWORD PTR [rax+0xd0]
 16353aa:	8d 51 01             	lea    edx,[rcx+0x1]
 16353ad:	31 c0                	xor    eax,eax
 16353af:	83 f9 03             	cmp    ecx,0x3
 16353b2:	0f 42 c2             	cmovb  eax,edx
 16353b5:	59                   	pop    rcx
 16353b6:	c3                   	ret
 16353b7:	cc                   	int3
 16353b8:	53                   	push   rbx
 16353b9:	48 89 fb             	mov    rbx,rdi
 16353bc:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]
 16353c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 16353c6:	31 d2                	xor    edx,edx
 16353c8:	ff 50 10             	call   QWORD PTR [rax+0x10]
 16353cb:	48 89 d8             	mov    rax,rbx
 16353ce:	5b                   	pop    rbx
 16353cf:	c3                   	ret
 16353d0:	50                   	push   rax
 16353d1:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16353d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353db:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353de:	48 8d 88 20 01 00 00 	lea    rcx,[rax+0x120]
 16353e5:	48 85 c0             	test   rax,rax
 16353e8:	48 8d 05 49 66 e0 fe 	lea    rax,[rip+0xfffffffffee06649]        # 43ba38 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1644>
 16353ef:	48 0f 45 c1          	cmovne rax,rcx
 16353f3:	59                   	pop    rcx
 16353f4:	c3                   	ret
 16353f5:	cc                   	int3
 16353f6:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16353fd:	e9 2c 2e 00 00       	jmp    163822e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3339c>
 1635402:	50                   	push   rax
 1635403:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163540a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 163540d:	ff 50 48             	call   QWORD PTR [rax+0x48]
 1635410:	48 8d 88 d8 00 00 00 	lea    rcx,[rax+0xd8]
 1635417:	48 85 c0             	test   rax,rax
 163541a:	48 0f 45 c1          	cmovne rax,rcx
 163541e:	59                   	pop    rcx
 163541f:	c3                   	ret
 1635420:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635427:	e9 3c 2f 00 00       	jmp    1638368 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334d6>
 163542c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635433:	e9 7c 30 00 00       	jmp    16384b4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33622>
 1635438:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 163543f:	8a 40 49             	mov    al,BYTE PTR [rax+0x49]
 1635442:	c3                   	ret
 1635443:	cc                   	int3
 1635444:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 163544b:	8b 40 68             	mov    eax,DWORD PTR [rax+0x68]
 163544e:	c3                   	ret
 163544f:	cc                   	int3
 1635450:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635457:	69 40 68 e8 03 00 00 	imul   eax,DWORD PTR [rax+0x68],0x3e8
 163545e:	c3                   	ret
 163545f:	cc                   	int3
 1635460:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635467:	e9 50 31 00 00       	jmp    16385bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3372a>
 163546c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635473:	e9 58 31 00 00       	jmp    16385d0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3373e>
 1635478:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163547f:	e9 60 31 00 00       	jmp    16385e4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33752>
 1635484:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163548b:	e9 68 31 00 00       	jmp    16385f8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33766>
 1635490:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635497:	e9 a2 30 00 00       	jmp    163853e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x336ac>
 163549c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16354a3:	e9 ea 30 00 00       	jmp    1638592 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33700>
 16354a8:	53                   	push   rbx
 16354a9:	48 89 fb             	mov    rbx,rdi
 16354ac:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]
 16354b3:	e8 50 32 00 00       	call   1638708 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33876>
 16354b8:	48 89 d8             	mov    rax,rbx
 16354bb:	5b                   	pop    rbx
 16354bc:	c3                   	ret
 16354bd:	cc                   	int3
 16354be:	50                   	push   rax
 16354bf:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16354c9:	ff 50 30             	call   QWORD PTR [rax+0x30]
 16354cc:	48 85 c0             	test   rax,rax
 16354cf:	74 09                	je     16354da <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30648>
 16354d1:	80 78 28 00          	cmp    BYTE PTR [rax+0x28],0x0
 16354d5:	0f 95 c0             	setne  al
 16354d8:	eb 02                	jmp    16354dc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3064a>
 16354da:	b0 01                	mov    al,0x1
 16354dc:	59                   	pop    rcx
 16354dd:	c3                   	ret
 16354de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354e5:	e9 de 5c 01 00       	jmp    164b1c8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46336>
 16354ea:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354f1:	e9 d8 5a 01 00       	jmp    164afce <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4613c>
 16354f6:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16354fd:	e9 34 32 00 00       	jmp    1638736 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338a4>
 1635502:	41 56                	push   r14
 1635504:	53                   	push   rbx
 1635505:	50                   	push   rax
 1635506:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163550d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635510:	ff 50 78             	call   QWORD PTR [rax+0x78]
 1635513:	48 85 c0             	test   rax,rax
 1635516:	74 4b                	je     1635563 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d1>
 1635518:	49 89 c6             	mov    r14,rax
 163551b:	48 8d b8 58 01 00 00 	lea    rdi,[rax+0x158]
 1635522:	e8 bf 57 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 1635527:	b3 01                	mov    bl,0x1
 1635529:	84 c0                	test   al,al
 163552b:	74 38                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>
 163552d:	49 8d be 80 01 00 00 	lea    rdi,[r14+0x180]
 1635534:	e8 ad 57 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 1635539:	84 c0                	test   al,al
 163553b:	74 28                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>
 163553d:	49 8d be 94 01 00 00 	lea    rdi,[r14+0x194]
 1635544:	e8 9d 57 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 1635549:	84 c0                	test   al,al
 163554b:	74 18                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>
 163554d:	49 81 c6 6c 01 00 00 	add    r14,0x16c
 1635554:	4c 89 f7             	mov    rdi,r14
 1635557:	e8 8a 57 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 163555c:	89 c3                	mov    ebx,eax
 163555e:	80 f3 01             	xor    bl,0x1
 1635561:	eb 02                	jmp    1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>
 1635563:	31 db                	xor    ebx,ebx
 1635565:	89 d8                	mov    eax,ebx
 1635567:	48 83 c4 08          	add    rsp,0x8
 163556b:	5b                   	pop    rbx
 163556c:	41 5e                	pop    r14
 163556e:	c3                   	ret
 163556f:	cc                   	int3
 1635570:	55                   	push   rbp
 1635571:	53                   	push   rbx
 1635572:	50                   	push   rax
 1635573:	89 d5                	mov    ebp,edx
 1635575:	48 89 fb             	mov    rbx,rdi
 1635578:	48 8b be f8 00 00 00 	mov    rdi,QWORD PTR [rsi+0xf8]
 163557f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635582:	ff 50 78             	call   QWORD PTR [rax+0x78]
 1635585:	48 85 c0             	test   rax,rax
 1635588:	74 33                	je     16355bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3072b>
 163558a:	48 89 c7             	mov    rdi,rax
 163558d:	89 ee                	mov    esi,ebp
 163558f:	e8 6a a9 ff ff       	call   162fefe <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b06c>
 1635594:	48 85 c0             	test   rax,rax
 1635597:	74 24                	je     16355bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3072b>
 1635599:	0f 57 c0             	xorps  xmm0,xmm0
 163559c:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 16355a0:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 16355a4:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 16355a7:	c7 43 38 10 00 00 00 	mov    DWORD PTR [rbx+0x38],0x10
 16355ae:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 16355b1:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
 16355b5:	8b 40 10             	mov    eax,DWORD PTR [rax+0x10]
 16355b8:	89 43 50             	mov    DWORD PTR [rbx+0x50],eax
 16355bb:	eb 12                	jmp    16355cf <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3073d>
 16355bd:	83 63 38 00          	and    DWORD PTR [rbx+0x38],0x0
 16355c1:	0f 57 c0             	xorps  xmm0,xmm0
 16355c4:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 16355c7:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 16355cb:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 16355cf:	48 89 d8             	mov    rax,rbx
 16355d2:	48 83 c4 08          	add    rsp,0x8
 16355d6:	5b                   	pop    rbx
 16355d7:	5d                   	pop    rbp
 16355d8:	c3                   	ret
 16355d9:	cc                   	int3
 16355da:	41 56                	push   r14
 16355dc:	53                   	push   rbx
 16355dd:	50                   	push   rax
 16355de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16355e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16355e8:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16355eb:	48 85 c0             	test   rax,rax
 16355ee:	74 4b                	je     163563b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307a9>
 16355f0:	49 89 c6             	mov    r14,rax
 16355f3:	48 8d b8 a8 01 00 00 	lea    rdi,[rax+0x1a8]
 16355fa:	e8 e7 56 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 16355ff:	b3 01                	mov    bl,0x1
 1635601:	84 c0                	test   al,al
 1635603:	74 38                	je     163563d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307ab>
 1635605:	49 8d be d0 01 00 00 	lea    rdi,[r14+0x1d0]
 163560c:	e8 d5 56 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
 1635611:	84 c0                	test   al,al
 1635613:	74 28                	je     163563d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307ab>
```
### filtered dataflow rows for `0x163537e`

| addr | instruction |
|---:|---|
| `0x16352eb` | `16352eb:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16352f2` | `16352f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16352f5` | `16352f5:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x1635301` | `1635301:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x1635308` | `1635308:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x163530b` | `163530b:	ff 50 58             	call   QWORD PTR [rax+0x58]` |
| `0x1635317` | `1635317:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163531e` | `163531e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635321` | `1635321:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x163532d` | `163532d:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x1635334` | `1635334:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635337` | `1635337:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0x1635342` | `1635342:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x163534e` | `163534e:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x163535a` | `163535a:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x1635366` | `1635366:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635372` | `1635372:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163537e` | `163537e:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163538a` | `163538a:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635397` | `1635397:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163539e` | `163539e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16353a1` | `16353a1:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x16353b9` | `16353b9:	48 89 fb             	mov    rbx,rdi` |
| `0x16353bc` | `16353bc:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]` |
| `0x16353c3` | `16353c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0x16353c8` | `16353c8:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x16353d1` | `16353d1:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16353d8` | `16353d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16353db` | `16353db:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x16353f6` | `16353f6:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635403` | `1635403:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163540a` | `163540a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x163540d` | `163540d:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x1635420` | `1635420:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163542c` | `163542c:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635438` | `1635438:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x1635444` | `1635444:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x1635450` | `1635450:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]` |
| `0x1635460` | `1635460:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163546c` | `163546c:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635478` | `1635478:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635484` | `1635484:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635490` | `1635490:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x163549c` | `163549c:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x16354a9` | `16354a9:	48 89 fb             	mov    rbx,rdi` |
| `0x16354ac` | `16354ac:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]` |
| `0x16354bf` | `16354bf:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16354c6` | `16354c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16354c9` | `16354c9:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x16354cf` | `16354cf:	74 09                	je     16354da <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30648>` |
| `0x16354d1` | `16354d1:	80 78 28 00          	cmp    BYTE PTR [rax+0x28],0x0` |
| `0x16354d8` | `16354d8:	eb 02                	jmp    16354dc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3064a>` |
| `0x16354de` | `16354de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16354ea` | `16354ea:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16354f6` | `16354f6:	48 81 c7 90 00 00 00 	add    rdi,0x90` |
| `0x1635506` | `1635506:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x163550d` | `163550d:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635510` | `1635510:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x1635516` | `1635516:	74 4b                	je     1635563 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d1>` |
| `0x163551b` | `163551b:	48 8d b8 58 01 00 00 	lea    rdi,[rax+0x158]` |
| `0x163552b` | `163552b:	74 38                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>` |
| `0x163552d` | `163552d:	49 8d be 80 01 00 00 	lea    rdi,[r14+0x180]` |
| `0x163553b` | `163553b:	74 28                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>` |
| `0x163553d` | `163553d:	49 8d be 94 01 00 00 	lea    rdi,[r14+0x194]` |
| `0x163554b` | `163554b:	74 18                	je     1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>` |
| `0x1635554` | `1635554:	4c 89 f7             	mov    rdi,r14` |
| `0x1635561` | `1635561:	eb 02                	jmp    1635565 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d3>` |
| `0x1635575` | `1635575:	48 89 fb             	mov    rbx,rdi` |
| `0x1635578` | `1635578:	48 8b be f8 00 00 00 	mov    rdi,QWORD PTR [rsi+0xf8]` |
| `0x163557f` | `163557f:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1635582` | `1635582:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x1635588` | `1635588:	74 33                	je     16355bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3072b>` |
| `0x163558a` | `163558a:	48 89 c7             	mov    rdi,rax` |
| `0x1635597` | `1635597:	74 24                	je     16355bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3072b>` |
| `0x163559c` | `163559c:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0` |
| `0x16355a7` | `16355a7:	c7 43 38 10 00 00 00 	mov    DWORD PTR [rbx+0x38],0x10` |
| `0x16355bb` | `16355bb:	eb 12                	jmp    16355cf <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3073d>` |
| `0x16355bd` | `16355bd:	83 63 38 00          	and    DWORD PTR [rbx+0x38],0x0` |
| `0x16355cb` | `16355cb:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0` |
| `0x16355de` | `16355de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]` |
| `0x16355e5` | `16355e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x16355e8` | `16355e8:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0x16355ee` | `16355ee:	74 4b                	je     163563b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307a9>` |
| `0x16355f3` | `16355f3:	48 8d b8 a8 01 00 00 	lea    rdi,[rax+0x1a8]` |
| `0x1635603` | `1635603:	74 38                	je     163563d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307ab>` |
| `0x1635605` | `1635605:	49 8d be d0 01 00 00 	lea    rdi,[r14+0x1d0]` |
| `0x1635613` | `1635613:	74 28                	je     163563d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307ab>` |

## Regional mentions of callback package offsets / e99c54 / 17da helpers

| addr | instruction |
|---:|---|
| `0xe916a3` | `e916a3:	e8 ec 90 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe9176d` | `e9176d:	e8 22 90 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe91833` | `e91833:	e8 5c 8f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe918fb` | `e918fb:	e8 94 8e 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe919c7` | `e919c7:	e8 c8 8d 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe91cab` | `e91cab:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax` |
| `0xe91cc1` | `e91cc1:	48 8d 7b 38          	lea    rdi,[rbx+0x38]` |
| `0xe91cec` | `e91cec:	4c 8b 63 28          	mov    r12,QWORD PTR [rbx+0x28]` |
| `0xe91d66` | `e91d66:	e8 29 8a 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe91f74` | `e91f74:	e8 1b 88 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe92383` | `e92383:	e8 0c 84 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe925fb` | `e925fb:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]` |
| `0xe92604` | `e92604:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]` |
| `0xe92eeb` | `e92eeb:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]` |
| `0xe93150` | `e93150:	e8 3f 76 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe93166` | `e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe931e4` | `e931e4:	e8 ab 75 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe933cf` | `e933cf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]` |
| `0xe934cd` | `e934cd:	e8 c2 72 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe934e3` | `e934e3:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe93576` | `e93576:	e8 19 72 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe936f4` | `e936f4:	e8 9b 70 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe937b0` | `e937b0:	4c 89 6b 30          	mov    QWORD PTR [rbx+0x30],r13` |
| `0xe937b4` | `e937b4:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14` |
| `0xe9385e` | `e9385e:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]` |
| `0xe939c0` | `e939c0:	48 8d 43 28          	lea    rax,[rbx+0x28]` |
| `0xe939c8` | `e939c8:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0` |
| `0xe939d1` | `e939d1:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0` |
| `0xe93c60` | `e93c60:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14` |
| `0xe93c64` | `e93c64:	48 8d 7b 38          	lea    rdi,[rbx+0x38]` |
| `0xe93c8d` | `e93c8d:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]` |
| `0xe93cb3` | `e93cb3:	48 89 5b 28          	mov    QWORD PTR [rbx+0x28],rbx` |
| `0xe94017` | `e94017:	e8 78 67 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe94090` | `e94090:	e8 ff 66 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe94141` | `e94141:	e8 4e 66 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe947f1` | `e947f1:	4c 8d 73 30          	lea    r14,[rbx+0x30]` |
| `0xe947f5` | `e947f5:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14` |
| `0xe947f9` | `e947f9:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14` |
| `0xe9488b` | `e9488b:	e8 04 5f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe950d9` | `e950d9:	48 8d 0d 74 4b 00 00 	lea    rcx,[rip+0x4b74]        # e99c54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6106a>` |
| `0xe950ef` | `e950ef:	e8 a0 56 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe95105` | `e95105:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe95246` | `e95246:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0` |
| `0xe9525c` | `e9525c:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12` |
| `0xe9532c` | `e9532c:	e8 63 54 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe953e1` | `e953e1:	e8 ae 53 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe957bf` | `e957bf:	e8 d0 4f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe9593c` | `e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]` |
| `0xe95b03` | `e95b03:	48 8d 43 30          	lea    rax,[rbx+0x30]` |
| `0xe966e1` | `e966e1:	e8 ae 40 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe966f7` | `e966f7:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe9675c` | `e9675c:	e8 33 40 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe96b05` | `e96b05:	e8 8a 3c 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe96b70` | `e96b70:	e8 1f 3c 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe96e33` | `e96e33:	e8 5c 39 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe974c0` | `e974c0:	e8 cf 32 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe9771b` | `e9771b:	e8 74 30 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe977a5` | `e977a5:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0` |
| `0xe977e4` | `e977e4:	e8 ab 2f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe978ed` | `e978ed:	e8 a2 2e 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe97f0a` | `e97f0a:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]` |
| `0xe991b5` | `e991b5:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]` |
| `0xe991be` | `e991be:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]` |
| `0xe991e7` | `e991e7:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]` |
| `0xe991f0` | `e991f0:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]` |
| `0xe99382` | `e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xe99405` | `e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1` |
| `0xe998f4` | `e998f4:	4c 8d 73 38          	lea    r14,[rbx+0x38]` |
| `0xe999cd` | `e999cd:	48 8d 7b 38          	lea    rdi,[rbx+0x38]` |
| `0xe99c54` | `e99c54:	41 56                	push   r14` |
| `0xe9a0f4` | `e9a0f4:	e8 9b 06 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe9a5c7` | `e9a5c7:	e8 c8 01 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe9a7b0` | `e9a7b0:	e8 df ff 93 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x17da449` | `17da449:	4c 8b 63 38          	mov    r12,QWORD PTR [rbx+0x38]` |
| `0x17da717` | `17da717:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]` |
| `0x17da71b` | `17da71b:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0` |
| `0x17da720` | `17da720:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax` |
| `0x17da724` | `17da724:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]` |
| `0x17da728` | `17da728:	48 83 66 30 00       	and    QWORD PTR [rsi+0x30],0x0` |
| `0x17da72d` | `17da72d:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax` |
| `0x17da731` | `17da731:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]` |
| `0x17da735` | `17da735:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax` |
| `0x17da75d` | `17da75d:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax` |
| `0x17da76d` | `17da76d:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax` |
| `0x17da775` | `17da775:	48 89 53 38          	mov    QWORD PTR [rbx+0x38],rdx` |
| `0x17da794` | `17da794:	41 57                	push   r15` |
| `0x17da7b5` | `17da7b5:	48 89 4f 28          	mov    QWORD PTR [rdi+0x28],rcx` |
| `0x17da7ec` | `17da7ec:	e8 11 00 00 00       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>` |
| `0x17da802` | `17da802:	53                   	push   rbx` |
| `0x17da806` | `17da806:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0x17da81a` | `17da81a:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]` |
| `0x17da81e` | `17da81e:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0` |
| `0x17da840` | `17da840:	e8 bd ff ff ff       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>` |
| `0x17da88d` | `17da88d:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax` |
| `0x17da89a` | `17da89a:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax` |
| `0x17da8a2` | `17da8a2:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax` |

## Interpretation guide

The key proof would be a `+0xa0` target that stores or copies the `rdx` package, then a later method invokes `[package+0x28]` with an `original` object. If no target directly invokes it, the package is likely enqueued/stored for later dispatch.
