# Restrictions provider/consumer binding candidates v13

Focus: bind provider `+0x78` and consumer `+0x10` candidates for the object copied by `aab330`. Static provenance only.

## Candidate AP table with key entries

| AP | +0x00 | +0x08 | +0x10 | +0x78 | +0x80 |
|---:|---:|---:|---:|---:|---:|
| `0x1831968` | `0xa50370` | `0xea6548` | `0xea6568` | `0xe992a2` | `0xe992b6` |
| `0x1831980` | `0x9d7de0` | `0xa50370` | `0xea657c` | `0xe99368` | `0xad6470` |
| `0x18319e0` | `0xe992a2` | `0xe992b6` | `0xe992c8` | `0xe9929a` | `-` |
| `0x1831938` | `0x9d7de0` | `0xa50370` | `0xea662e` | `0xe9939c` | `0xe993ae` |
| `0x188bd68` | `0x160c11c` | `0x160c130` | `0x160c142` | `0xe99382` | `-` |
| `0x1831a00` | `0xad6470` | `0xad647a` | `0xe99382` | `0xeaaf5c` | `0xeaaf6e` |
| `0x1831a48` | `0x9d7de0` | `0xa50370` | `0xe9929a` | `0xeabb76` | `0xeabc4e` |

## Target `0x9d7de0` tags: shared-ptr/object wrapper-like

```text
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
```
## Target `0xa50370` tags: -

```text
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
```
## Target `0xad6470` tags: -

```text
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
```
## Target `0xad647a` tags: -

```text
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
```
## Target `0xe9929a` tags: calls +0x78, shared-ptr/object wrapper-like

```text
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
```
## Target `0xe992a2` tags: calls +0x78, shared-ptr/object wrapper-like

```text
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
```
## Target `0xe992b6` tags: calls +0x78, shared-ptr/object wrapper-like

```text
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
```
## Target `0xe992c8` tags: calls +0x78, shared-ptr/object wrapper-like

```text
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
```
## Target `0xe99368` tags: calls +0x78, shared-ptr/object wrapper-like

```text
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
```
## Target `0xe99382` tags: calls +0x78, shared-ptr/object wrapper-like

```text
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
```
## Target `0xe9939c` tags: calls +0x78, shared-ptr/object wrapper-like

```text
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
```
## Target `0xe993ae` tags: calls +0x78, shared-ptr/object wrapper-like

```text
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
```
## Target `0xea6548` tags: shared-ptr/object wrapper-like

```text
  ea650f:	74 0f                	je     ea6520 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d936>
  ea6511:	48 8d 4e 20          	lea    rcx,[rsi+0x20]
  ea6515:	48 39 f2             	cmp    rdx,rsi
  ea6518:	74 13                	je     ea652d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d943>
  ea651a:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
  ea651e:	eb 07                	jmp    ea6527 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d93d>
  ea6520:	48 83 c0 20          	add    rax,0x20
  ea6524:	48 89 c1             	mov    rcx,rax
  ea6527:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  ea652b:	eb 10                	jmp    ea653d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d953>
  ea652d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
  ea6531:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  ea6534:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6537:	48 89 c6             	mov    rsi,rax
  ea653a:	ff 51 18             	call   QWORD PTR [rcx+0x18]
  ea653d:	58                   	pop    rax
  ea653e:	c3                   	ret
  ea653f:	48 89 c7             	mov    rdi,rax
  ea6542:	e8 5e 35 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea6547:	cc                   	int3
  ea6548:	53                   	push   rbx
  ea6549:	48 89 fb             	mov    rbx,rdi
  ea654c:	6a 10                	push   0x10
  ea654e:	5f                   	pop    rdi
  ea654f:	e8 ac 79 94 00       	call   17edf00 <_Znwm@plt>
  ea6554:	48 8d 0d 05 b4 98 00 	lea    rcx,[rip+0x98b405]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea655b:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea655e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6562:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6566:	5b                   	pop    rbx
  ea6567:	c3                   	ret
  ea6568:	48 8d 05 f1 b3 98 00 	lea    rax,[rip+0x98b3f1]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea656f:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6572:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6576:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea657a:	c3                   	ret
  ea657b:	cc                   	int3
  ea657c:	53                   	push   rbx
  ea657d:	48 83 ec 60          	sub    rsp,0x60
  ea6581:	4d 89 ca             	mov    r10,r9
  ea6584:	48 89 f0             	mov    rax,rsi
  ea6587:	48 89 fb             	mov    rbx,rdi
  ea658a:	4c 8b 4c 24 70       	mov    r9,QWORD PTR [rsp+0x70]
  ea658f:	0f 10 44 24 78       	movups xmm0,XMMWORD PTR [rsp+0x78]
  ea6594:	0f 10 8c 24 88 00 00 	movups xmm1,XMMWORD PTR [rsp+0x88]
  ea659b:	00
  ea659c:	0f 10 94 24 98 00 00 	movups xmm2,XMMWORD PTR [rsp+0x98]
  ea65a3:	00
  ea65a4:	0f 10 9c 24 a8 00 00 	movups xmm3,XMMWORD PTR [rsp+0xa8]
  ea65ab:	00
  ea65ac:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  ea65b3:	00
  ea65b4:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
  ea65bb:	00
  ea65bc:	0f 10 27             	movups xmm4,XMMWORD PTR [rdi]
  ea65bf:	0f 11 64 24 50       	movups XMMWORD PTR [rsp+0x50],xmm4
  ea65c4:	0f 10 26             	movups xmm4,XMMWORD PTR [rsi]
  ea65c7:	0f 11 64 24 40       	movups XMMWORD PTR [rsp+0x40],xmm4
  ea65cc:	0f 11 5c 24 30       	movups XMMWORD PTR [rsp+0x30],xmm3
  ea65d1:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
  ea65d6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
  ea65db:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  ea65df:	48 89 df             	mov    rdi,rbx
  ea65e2:	48 89 d6             	mov    rsi,rdx
  ea65e5:	48 89 ca             	mov    rdx,rcx
  ea65e8:	4c 89 c1             	mov    rcx,r8
  ea65eb:	4d 89 d0             	mov    r8,r10
  ea65ee:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea65f1:	48 89 d8             	mov    rax,rbx
  ea65f4:	48 83 c4 60          	add    rsp,0x60
  ea65f8:	5b                   	pop    rbx
  ea65f9:	c3                   	ret
  ea65fa:	53                   	push   rbx
  ea65fb:	48 89 fb             	mov    rbx,rdi
  ea65fe:	6a 10                	push   0x10
  ea6600:	5f                   	pop    rdi
  ea6601:	e8 fa 78 94 00       	call   17edf00 <_Znwm@plt>
  ea6606:	48 8d 0d 0b b3 98 00 	lea    rcx,[rip+0x98b30b]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea660d:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea6610:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6614:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6618:	5b                   	pop    rbx
  ea6619:	c3                   	ret
  ea661a:	48 8d 05 f7 b2 98 00 	lea    rax,[rip+0x98b2f7]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea6621:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6624:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6628:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea662c:	c3                   	ret
  ea662d:	cc                   	int3
  ea662e:	53                   	push   rbx
  ea662f:	48 83 ec 10          	sub    rsp,0x10
  ea6633:	4d 89 ca             	mov    r10,r9
  ea6636:	48 89 f0             	mov    rax,rsi
  ea6639:	48 89 fb             	mov    rbx,rdi
  ea663c:	4c 8b 4c 24 20       	mov    r9,QWORD PTR [rsp+0x20]
  ea6641:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
  ea6646:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
  ea664a:	48 89 d6             	mov    rsi,rdx
  ea664d:	48 89 ca             	mov    rdx,rcx
  ea6650:	4c 89 c1             	mov    rcx,r8
  ea6653:	4d 89 d0             	mov    r8,r10
  ea6656:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea6659:	48 89 d8             	mov    rax,rbx
  ea665c:	48 83 c4 10          	add    rsp,0x10
  ea6660:	5b                   	pop    rbx
  ea6661:	c3                   	ret
  ea6662:	48 8d 05 77 b2 98 00 	lea    rax,[rip+0x98b277]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
  ea6669:	48 89 07             	mov    QWORD PTR [rdi],rax
  ea666c:	e9 9f 79 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ea6671:	cc                   	int3
  ea6672:	53                   	push   rbx
  ea6673:	48 89 fb             	mov    rbx,rdi
  ea6676:	e8 e7 ff ff ff       	call   ea6662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6da78>
  ea667b:	48 89 df             	mov    rdi,rbx
  ea667e:	5b                   	pop    rbx
  ea667f:	e9 9c 78 94 00       	jmp    17edf20 <_ZdlPv@plt>
  ea6684:	53                   	push   rbx
  ea6685:	48 89 fb             	mov    rbx,rdi
  ea6688:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
  ea668f:	e8 f2 7d bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ea6694:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
  ea669b:	e8 f0 77 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ea66a0:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
  ea66a7:	e8 1a 00 00 00       	call   ea66c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dadc>
  ea66ac:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
  ea66b3:	e8 f0 65 ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
  ea66b8:	48 83 c3 30          	add    rbx,0x30
  ea66bc:	48 89 df             	mov    rdi,rbx
  ea66bf:	5b                   	pop    rbx
  ea66c0:	e9 a1 37 93 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ea66c5:	cc                   	int3
  ea66c6:	41 57                	push   r15
  ea66c8:	41 56                	push   r14
  ea66ca:	53                   	push   rbx
  ea66cb:	48 89 fb             	mov    rbx,rdi
  ea66ce:	4c 8b 77 28          	mov    r14,QWORD PTR [rdi+0x28]
  ea66d2:	4d 85 f6             	test   r14,r14
  ea66d5:	74 1c                	je     ea66f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db09>
  ea66d7:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  ea66da:	49 8d 7e 10          	lea    rdi,[r14+0x10]
  ea66de:	e8 77 00 00 00       	call   ea675a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db70>
  ea66e3:	4c 89 f7             	mov    rdi,r14
  ea66e6:	e8 35 78 94 00       	call   17edf20 <_ZdlPv@plt>
  ea66eb:	4d 89 fe             	mov    r14,r15
  ea66ee:	4d 85 ff             	test   r15,r15
  ea66f1:	75 e4                	jne    ea66d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6daed>
  ea66f3:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  ea66f7:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
  ea66fc:	48 85 ff             	test   rdi,rdi
  ea66ff:	74 05                	je     ea6706 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db1c>
  ea6701:	e8 1a 78 94 00       	call   17edf20 <_ZdlPv@plt>
  ea6706:	48 89 df             	mov    rdi,rbx
  ea6709:	5b                   	pop    rbx
  ea670a:	41 5e                	pop    r14
  ea670c:	41 5f                	pop    r15
  ea670e:	e9 01 00 00 00       	jmp    ea6714 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db2a>
  ea6713:	cc                   	int3
  ea6714:	48 83 7f 10 00       	cmp    QWORD PTR [rdi+0x10],0x0
  ea6719:	74 3e                	je     ea6759 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db6f>
  ea671b:	41 56                	push   r14
  ea671d:	53                   	push   rbx
  ea671e:	50                   	push   rax
  ea671f:	48 89 fb             	mov    rbx,rdi
  ea6722:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ea6725:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  ea6729:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  ea672d:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6730:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  ea6734:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6737:	48 89 08             	mov    QWORD PTR [rax],rcx
```
## Target `0xea6568` tags: shared-ptr/object wrapper-like

```text
  ea6531:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  ea6534:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6537:	48 89 c6             	mov    rsi,rax
  ea653a:	ff 51 18             	call   QWORD PTR [rcx+0x18]
  ea653d:	58                   	pop    rax
  ea653e:	c3                   	ret
  ea653f:	48 89 c7             	mov    rdi,rax
  ea6542:	e8 5e 35 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea6547:	cc                   	int3
  ea6548:	53                   	push   rbx
  ea6549:	48 89 fb             	mov    rbx,rdi
  ea654c:	6a 10                	push   0x10
  ea654e:	5f                   	pop    rdi
  ea654f:	e8 ac 79 94 00       	call   17edf00 <_Znwm@plt>
  ea6554:	48 8d 0d 05 b4 98 00 	lea    rcx,[rip+0x98b405]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea655b:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea655e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6562:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6566:	5b                   	pop    rbx
  ea6567:	c3                   	ret
  ea6568:	48 8d 05 f1 b3 98 00 	lea    rax,[rip+0x98b3f1]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea656f:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6572:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6576:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea657a:	c3                   	ret
  ea657b:	cc                   	int3
  ea657c:	53                   	push   rbx
  ea657d:	48 83 ec 60          	sub    rsp,0x60
  ea6581:	4d 89 ca             	mov    r10,r9
  ea6584:	48 89 f0             	mov    rax,rsi
  ea6587:	48 89 fb             	mov    rbx,rdi
  ea658a:	4c 8b 4c 24 70       	mov    r9,QWORD PTR [rsp+0x70]
  ea658f:	0f 10 44 24 78       	movups xmm0,XMMWORD PTR [rsp+0x78]
  ea6594:	0f 10 8c 24 88 00 00 	movups xmm1,XMMWORD PTR [rsp+0x88]
  ea659b:	00
  ea659c:	0f 10 94 24 98 00 00 	movups xmm2,XMMWORD PTR [rsp+0x98]
  ea65a3:	00
  ea65a4:	0f 10 9c 24 a8 00 00 	movups xmm3,XMMWORD PTR [rsp+0xa8]
  ea65ab:	00
  ea65ac:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  ea65b3:	00
  ea65b4:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
  ea65bb:	00
  ea65bc:	0f 10 27             	movups xmm4,XMMWORD PTR [rdi]
  ea65bf:	0f 11 64 24 50       	movups XMMWORD PTR [rsp+0x50],xmm4
  ea65c4:	0f 10 26             	movups xmm4,XMMWORD PTR [rsi]
  ea65c7:	0f 11 64 24 40       	movups XMMWORD PTR [rsp+0x40],xmm4
  ea65cc:	0f 11 5c 24 30       	movups XMMWORD PTR [rsp+0x30],xmm3
  ea65d1:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
  ea65d6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
  ea65db:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  ea65df:	48 89 df             	mov    rdi,rbx
  ea65e2:	48 89 d6             	mov    rsi,rdx
  ea65e5:	48 89 ca             	mov    rdx,rcx
  ea65e8:	4c 89 c1             	mov    rcx,r8
  ea65eb:	4d 89 d0             	mov    r8,r10
  ea65ee:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea65f1:	48 89 d8             	mov    rax,rbx
  ea65f4:	48 83 c4 60          	add    rsp,0x60
  ea65f8:	5b                   	pop    rbx
  ea65f9:	c3                   	ret
  ea65fa:	53                   	push   rbx
  ea65fb:	48 89 fb             	mov    rbx,rdi
  ea65fe:	6a 10                	push   0x10
  ea6600:	5f                   	pop    rdi
  ea6601:	e8 fa 78 94 00       	call   17edf00 <_Znwm@plt>
  ea6606:	48 8d 0d 0b b3 98 00 	lea    rcx,[rip+0x98b30b]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea660d:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea6610:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6614:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6618:	5b                   	pop    rbx
  ea6619:	c3                   	ret
  ea661a:	48 8d 05 f7 b2 98 00 	lea    rax,[rip+0x98b2f7]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea6621:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6624:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6628:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea662c:	c3                   	ret
  ea662d:	cc                   	int3
  ea662e:	53                   	push   rbx
  ea662f:	48 83 ec 10          	sub    rsp,0x10
  ea6633:	4d 89 ca             	mov    r10,r9
  ea6636:	48 89 f0             	mov    rax,rsi
  ea6639:	48 89 fb             	mov    rbx,rdi
  ea663c:	4c 8b 4c 24 20       	mov    r9,QWORD PTR [rsp+0x20]
  ea6641:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
  ea6646:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
  ea664a:	48 89 d6             	mov    rsi,rdx
  ea664d:	48 89 ca             	mov    rdx,rcx
  ea6650:	4c 89 c1             	mov    rcx,r8
  ea6653:	4d 89 d0             	mov    r8,r10
  ea6656:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea6659:	48 89 d8             	mov    rax,rbx
  ea665c:	48 83 c4 10          	add    rsp,0x10
  ea6660:	5b                   	pop    rbx
  ea6661:	c3                   	ret
  ea6662:	48 8d 05 77 b2 98 00 	lea    rax,[rip+0x98b277]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
  ea6669:	48 89 07             	mov    QWORD PTR [rdi],rax
  ea666c:	e9 9f 79 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ea6671:	cc                   	int3
  ea6672:	53                   	push   rbx
  ea6673:	48 89 fb             	mov    rbx,rdi
  ea6676:	e8 e7 ff ff ff       	call   ea6662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6da78>
  ea667b:	48 89 df             	mov    rdi,rbx
  ea667e:	5b                   	pop    rbx
  ea667f:	e9 9c 78 94 00       	jmp    17edf20 <_ZdlPv@plt>
  ea6684:	53                   	push   rbx
  ea6685:	48 89 fb             	mov    rbx,rdi
  ea6688:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
  ea668f:	e8 f2 7d bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ea6694:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
  ea669b:	e8 f0 77 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ea66a0:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
  ea66a7:	e8 1a 00 00 00       	call   ea66c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dadc>
  ea66ac:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
  ea66b3:	e8 f0 65 ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
  ea66b8:	48 83 c3 30          	add    rbx,0x30
  ea66bc:	48 89 df             	mov    rdi,rbx
  ea66bf:	5b                   	pop    rbx
  ea66c0:	e9 a1 37 93 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ea66c5:	cc                   	int3
  ea66c6:	41 57                	push   r15
  ea66c8:	41 56                	push   r14
  ea66ca:	53                   	push   rbx
  ea66cb:	48 89 fb             	mov    rbx,rdi
  ea66ce:	4c 8b 77 28          	mov    r14,QWORD PTR [rdi+0x28]
  ea66d2:	4d 85 f6             	test   r14,r14
  ea66d5:	74 1c                	je     ea66f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db09>
  ea66d7:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  ea66da:	49 8d 7e 10          	lea    rdi,[r14+0x10]
  ea66de:	e8 77 00 00 00       	call   ea675a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db70>
  ea66e3:	4c 89 f7             	mov    rdi,r14
  ea66e6:	e8 35 78 94 00       	call   17edf20 <_ZdlPv@plt>
  ea66eb:	4d 89 fe             	mov    r14,r15
  ea66ee:	4d 85 ff             	test   r15,r15
  ea66f1:	75 e4                	jne    ea66d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6daed>
  ea66f3:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  ea66f7:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
  ea66fc:	48 85 ff             	test   rdi,rdi
  ea66ff:	74 05                	je     ea6706 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db1c>
  ea6701:	e8 1a 78 94 00       	call   17edf20 <_ZdlPv@plt>
  ea6706:	48 89 df             	mov    rdi,rbx
  ea6709:	5b                   	pop    rbx
  ea670a:	41 5e                	pop    r14
  ea670c:	41 5f                	pop    r15
  ea670e:	e9 01 00 00 00       	jmp    ea6714 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db2a>
  ea6713:	cc                   	int3
  ea6714:	48 83 7f 10 00       	cmp    QWORD PTR [rdi+0x10],0x0
  ea6719:	74 3e                	je     ea6759 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db6f>
  ea671b:	41 56                	push   r14
  ea671d:	53                   	push   rbx
  ea671e:	50                   	push   rax
  ea671f:	48 89 fb             	mov    rbx,rdi
  ea6722:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ea6725:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  ea6729:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  ea672d:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6730:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  ea6734:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6737:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea673a:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  ea673f:	48 39 df             	cmp    rdi,rbx
  ea6742:	74 0e                	je     ea6752 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db68>
  ea6744:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
  ea6748:	e8 cf 08 df ff       	call   c9701c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3fbc>
  ea674d:	4c 89 f7             	mov    rdi,r14
  ea6750:	eb ed                	jmp    ea673f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db55>
  ea6752:	48 83 c4 08          	add    rsp,0x8
  ea6756:	5b                   	pop    rbx
  ea6757:	41 5e                	pop    r14
  ea6759:	c3                   	ret
```
## Target `0xea657c` tags: shared-ptr/object wrapper-like

```text
  ea653f:	48 89 c7             	mov    rdi,rax
  ea6542:	e8 5e 35 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea6547:	cc                   	int3
  ea6548:	53                   	push   rbx
  ea6549:	48 89 fb             	mov    rbx,rdi
  ea654c:	6a 10                	push   0x10
  ea654e:	5f                   	pop    rdi
  ea654f:	e8 ac 79 94 00       	call   17edf00 <_Znwm@plt>
  ea6554:	48 8d 0d 05 b4 98 00 	lea    rcx,[rip+0x98b405]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea655b:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea655e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6562:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6566:	5b                   	pop    rbx
  ea6567:	c3                   	ret
  ea6568:	48 8d 05 f1 b3 98 00 	lea    rax,[rip+0x98b3f1]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea656f:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6572:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6576:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea657a:	c3                   	ret
  ea657b:	cc                   	int3
  ea657c:	53                   	push   rbx
  ea657d:	48 83 ec 60          	sub    rsp,0x60
  ea6581:	4d 89 ca             	mov    r10,r9
  ea6584:	48 89 f0             	mov    rax,rsi
  ea6587:	48 89 fb             	mov    rbx,rdi
  ea658a:	4c 8b 4c 24 70       	mov    r9,QWORD PTR [rsp+0x70]
  ea658f:	0f 10 44 24 78       	movups xmm0,XMMWORD PTR [rsp+0x78]
  ea6594:	0f 10 8c 24 88 00 00 	movups xmm1,XMMWORD PTR [rsp+0x88]
  ea659b:	00
  ea659c:	0f 10 94 24 98 00 00 	movups xmm2,XMMWORD PTR [rsp+0x98]
  ea65a3:	00
  ea65a4:	0f 10 9c 24 a8 00 00 	movups xmm3,XMMWORD PTR [rsp+0xa8]
  ea65ab:	00
  ea65ac:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  ea65b3:	00
  ea65b4:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
  ea65bb:	00
  ea65bc:	0f 10 27             	movups xmm4,XMMWORD PTR [rdi]
  ea65bf:	0f 11 64 24 50       	movups XMMWORD PTR [rsp+0x50],xmm4
  ea65c4:	0f 10 26             	movups xmm4,XMMWORD PTR [rsi]
  ea65c7:	0f 11 64 24 40       	movups XMMWORD PTR [rsp+0x40],xmm4
  ea65cc:	0f 11 5c 24 30       	movups XMMWORD PTR [rsp+0x30],xmm3
  ea65d1:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
  ea65d6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
  ea65db:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  ea65df:	48 89 df             	mov    rdi,rbx
  ea65e2:	48 89 d6             	mov    rsi,rdx
  ea65e5:	48 89 ca             	mov    rdx,rcx
  ea65e8:	4c 89 c1             	mov    rcx,r8
  ea65eb:	4d 89 d0             	mov    r8,r10
  ea65ee:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea65f1:	48 89 d8             	mov    rax,rbx
  ea65f4:	48 83 c4 60          	add    rsp,0x60
  ea65f8:	5b                   	pop    rbx
  ea65f9:	c3                   	ret
  ea65fa:	53                   	push   rbx
  ea65fb:	48 89 fb             	mov    rbx,rdi
  ea65fe:	6a 10                	push   0x10
  ea6600:	5f                   	pop    rdi
  ea6601:	e8 fa 78 94 00       	call   17edf00 <_Znwm@plt>
  ea6606:	48 8d 0d 0b b3 98 00 	lea    rcx,[rip+0x98b30b]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea660d:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea6610:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6614:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6618:	5b                   	pop    rbx
  ea6619:	c3                   	ret
  ea661a:	48 8d 05 f7 b2 98 00 	lea    rax,[rip+0x98b2f7]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea6621:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6624:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6628:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea662c:	c3                   	ret
  ea662d:	cc                   	int3
  ea662e:	53                   	push   rbx
  ea662f:	48 83 ec 10          	sub    rsp,0x10
  ea6633:	4d 89 ca             	mov    r10,r9
  ea6636:	48 89 f0             	mov    rax,rsi
  ea6639:	48 89 fb             	mov    rbx,rdi
  ea663c:	4c 8b 4c 24 20       	mov    r9,QWORD PTR [rsp+0x20]
  ea6641:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
  ea6646:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
  ea664a:	48 89 d6             	mov    rsi,rdx
  ea664d:	48 89 ca             	mov    rdx,rcx
  ea6650:	4c 89 c1             	mov    rcx,r8
  ea6653:	4d 89 d0             	mov    r8,r10
  ea6656:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea6659:	48 89 d8             	mov    rax,rbx
  ea665c:	48 83 c4 10          	add    rsp,0x10
  ea6660:	5b                   	pop    rbx
  ea6661:	c3                   	ret
  ea6662:	48 8d 05 77 b2 98 00 	lea    rax,[rip+0x98b277]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
  ea6669:	48 89 07             	mov    QWORD PTR [rdi],rax
  ea666c:	e9 9f 79 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ea6671:	cc                   	int3
  ea6672:	53                   	push   rbx
  ea6673:	48 89 fb             	mov    rbx,rdi
  ea6676:	e8 e7 ff ff ff       	call   ea6662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6da78>
  ea667b:	48 89 df             	mov    rdi,rbx
  ea667e:	5b                   	pop    rbx
  ea667f:	e9 9c 78 94 00       	jmp    17edf20 <_ZdlPv@plt>
  ea6684:	53                   	push   rbx
  ea6685:	48 89 fb             	mov    rbx,rdi
  ea6688:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
  ea668f:	e8 f2 7d bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ea6694:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
  ea669b:	e8 f0 77 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ea66a0:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
  ea66a7:	e8 1a 00 00 00       	call   ea66c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dadc>
  ea66ac:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
  ea66b3:	e8 f0 65 ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
  ea66b8:	48 83 c3 30          	add    rbx,0x30
  ea66bc:	48 89 df             	mov    rdi,rbx
  ea66bf:	5b                   	pop    rbx
  ea66c0:	e9 a1 37 93 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ea66c5:	cc                   	int3
  ea66c6:	41 57                	push   r15
  ea66c8:	41 56                	push   r14
  ea66ca:	53                   	push   rbx
  ea66cb:	48 89 fb             	mov    rbx,rdi
  ea66ce:	4c 8b 77 28          	mov    r14,QWORD PTR [rdi+0x28]
  ea66d2:	4d 85 f6             	test   r14,r14
  ea66d5:	74 1c                	je     ea66f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db09>
  ea66d7:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  ea66da:	49 8d 7e 10          	lea    rdi,[r14+0x10]
  ea66de:	e8 77 00 00 00       	call   ea675a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db70>
  ea66e3:	4c 89 f7             	mov    rdi,r14
  ea66e6:	e8 35 78 94 00       	call   17edf20 <_ZdlPv@plt>
  ea66eb:	4d 89 fe             	mov    r14,r15
  ea66ee:	4d 85 ff             	test   r15,r15
  ea66f1:	75 e4                	jne    ea66d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6daed>
  ea66f3:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  ea66f7:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
  ea66fc:	48 85 ff             	test   rdi,rdi
  ea66ff:	74 05                	je     ea6706 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db1c>
  ea6701:	e8 1a 78 94 00       	call   17edf20 <_ZdlPv@plt>
  ea6706:	48 89 df             	mov    rdi,rbx
  ea6709:	5b                   	pop    rbx
  ea670a:	41 5e                	pop    r14
  ea670c:	41 5f                	pop    r15
  ea670e:	e9 01 00 00 00       	jmp    ea6714 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db2a>
  ea6713:	cc                   	int3
  ea6714:	48 83 7f 10 00       	cmp    QWORD PTR [rdi+0x10],0x0
  ea6719:	74 3e                	je     ea6759 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db6f>
  ea671b:	41 56                	push   r14
  ea671d:	53                   	push   rbx
  ea671e:	50                   	push   rax
  ea671f:	48 89 fb             	mov    rbx,rdi
  ea6722:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ea6725:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  ea6729:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  ea672d:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6730:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  ea6734:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6737:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea673a:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  ea673f:	48 39 df             	cmp    rdi,rbx
  ea6742:	74 0e                	je     ea6752 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db68>
  ea6744:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
  ea6748:	e8 cf 08 df ff       	call   c9701c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3fbc>
  ea674d:	4c 89 f7             	mov    rdi,r14
  ea6750:	eb ed                	jmp    ea673f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db55>
  ea6752:	48 83 c4 08          	add    rsp,0x8
  ea6756:	5b                   	pop    rbx
  ea6757:	41 5e                	pop    r14
  ea6759:	c3                   	ret
  ea675a:	53                   	push   rbx
  ea675b:	48 89 fb             	mov    rbx,rdi
  ea675e:	48 83 c7 28          	add    rdi,0x28
  ea6762:	e8 c1 4f bd ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
  ea6767:	48 89 df             	mov    rdi,rbx
  ea676a:	5b                   	pop    rbx
```
## Target `0xea662e` tags: shared-ptr/object wrapper-like

```text
  ea65f4:	48 83 c4 60          	add    rsp,0x60
  ea65f8:	5b                   	pop    rbx
  ea65f9:	c3                   	ret
  ea65fa:	53                   	push   rbx
  ea65fb:	48 89 fb             	mov    rbx,rdi
  ea65fe:	6a 10                	push   0x10
  ea6600:	5f                   	pop    rdi
  ea6601:	e8 fa 78 94 00       	call   17edf00 <_Znwm@plt>
  ea6606:	48 8d 0d 0b b3 98 00 	lea    rcx,[rip+0x98b30b]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea660d:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea6610:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6614:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6618:	5b                   	pop    rbx
  ea6619:	c3                   	ret
  ea661a:	48 8d 05 f7 b2 98 00 	lea    rax,[rip+0x98b2f7]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea6621:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6624:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6628:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea662c:	c3                   	ret
  ea662d:	cc                   	int3
  ea662e:	53                   	push   rbx
  ea662f:	48 83 ec 10          	sub    rsp,0x10
  ea6633:	4d 89 ca             	mov    r10,r9
  ea6636:	48 89 f0             	mov    rax,rsi
  ea6639:	48 89 fb             	mov    rbx,rdi
  ea663c:	4c 8b 4c 24 20       	mov    r9,QWORD PTR [rsp+0x20]
  ea6641:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
  ea6646:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
  ea664a:	48 89 d6             	mov    rsi,rdx
  ea664d:	48 89 ca             	mov    rdx,rcx
  ea6650:	4c 89 c1             	mov    rcx,r8
  ea6653:	4d 89 d0             	mov    r8,r10
  ea6656:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea6659:	48 89 d8             	mov    rax,rbx
  ea665c:	48 83 c4 10          	add    rsp,0x10
  ea6660:	5b                   	pop    rbx
  ea6661:	c3                   	ret
  ea6662:	48 8d 05 77 b2 98 00 	lea    rax,[rip+0x98b277]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
  ea6669:	48 89 07             	mov    QWORD PTR [rdi],rax
  ea666c:	e9 9f 79 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ea6671:	cc                   	int3
  ea6672:	53                   	push   rbx
  ea6673:	48 89 fb             	mov    rbx,rdi
  ea6676:	e8 e7 ff ff ff       	call   ea6662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6da78>
  ea667b:	48 89 df             	mov    rdi,rbx
  ea667e:	5b                   	pop    rbx
  ea667f:	e9 9c 78 94 00       	jmp    17edf20 <_ZdlPv@plt>
  ea6684:	53                   	push   rbx
  ea6685:	48 89 fb             	mov    rbx,rdi
  ea6688:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
  ea668f:	e8 f2 7d bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ea6694:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
  ea669b:	e8 f0 77 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ea66a0:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
  ea66a7:	e8 1a 00 00 00       	call   ea66c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dadc>
  ea66ac:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
  ea66b3:	e8 f0 65 ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
  ea66b8:	48 83 c3 30          	add    rbx,0x30
  ea66bc:	48 89 df             	mov    rdi,rbx
  ea66bf:	5b                   	pop    rbx
  ea66c0:	e9 a1 37 93 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ea66c5:	cc                   	int3
  ea66c6:	41 57                	push   r15
  ea66c8:	41 56                	push   r14
  ea66ca:	53                   	push   rbx
  ea66cb:	48 89 fb             	mov    rbx,rdi
  ea66ce:	4c 8b 77 28          	mov    r14,QWORD PTR [rdi+0x28]
  ea66d2:	4d 85 f6             	test   r14,r14
  ea66d5:	74 1c                	je     ea66f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db09>
  ea66d7:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  ea66da:	49 8d 7e 10          	lea    rdi,[r14+0x10]
  ea66de:	e8 77 00 00 00       	call   ea675a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db70>
  ea66e3:	4c 89 f7             	mov    rdi,r14
  ea66e6:	e8 35 78 94 00       	call   17edf20 <_ZdlPv@plt>
  ea66eb:	4d 89 fe             	mov    r14,r15
  ea66ee:	4d 85 ff             	test   r15,r15
  ea66f1:	75 e4                	jne    ea66d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6daed>
  ea66f3:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  ea66f7:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
  ea66fc:	48 85 ff             	test   rdi,rdi
  ea66ff:	74 05                	je     ea6706 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db1c>
  ea6701:	e8 1a 78 94 00       	call   17edf20 <_ZdlPv@plt>
  ea6706:	48 89 df             	mov    rdi,rbx
  ea6709:	5b                   	pop    rbx
  ea670a:	41 5e                	pop    r14
  ea670c:	41 5f                	pop    r15
  ea670e:	e9 01 00 00 00       	jmp    ea6714 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db2a>
  ea6713:	cc                   	int3
  ea6714:	48 83 7f 10 00       	cmp    QWORD PTR [rdi+0x10],0x0
  ea6719:	74 3e                	je     ea6759 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db6f>
  ea671b:	41 56                	push   r14
  ea671d:	53                   	push   rbx
  ea671e:	50                   	push   rax
  ea671f:	48 89 fb             	mov    rbx,rdi
  ea6722:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ea6725:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  ea6729:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  ea672d:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6730:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  ea6734:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6737:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea673a:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  ea673f:	48 39 df             	cmp    rdi,rbx
  ea6742:	74 0e                	je     ea6752 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db68>
  ea6744:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
  ea6748:	e8 cf 08 df ff       	call   c9701c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3fbc>
  ea674d:	4c 89 f7             	mov    rdi,r14
  ea6750:	eb ed                	jmp    ea673f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db55>
  ea6752:	48 83 c4 08          	add    rsp,0x8
  ea6756:	5b                   	pop    rbx
  ea6757:	41 5e                	pop    r14
  ea6759:	c3                   	ret
  ea675a:	53                   	push   rbx
  ea675b:	48 89 fb             	mov    rbx,rdi
  ea675e:	48 83 c7 28          	add    rdi,0x28
  ea6762:	e8 c1 4f bd ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
  ea6767:	48 89 df             	mov    rdi,rbx
  ea676a:	5b                   	pop    rbx
  ea676b:	e9 20 77 94 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ea6770:	48 8d 05 31 b1 98 00 	lea    rax,[rip+0x98b131]        # 18318a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3840>
  ea6777:	48 89 07             	mov    QWORD PTR [rdi],rax
  ea677a:	e9 91 78 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ea677f:	cc                   	int3
  ea6780:	53                   	push   rbx
  ea6781:	48 89 fb             	mov    rbx,rdi
  ea6784:	e8 e7 ff ff ff       	call   ea6770 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db86>
  ea6789:	48 89 df             	mov    rdi,rbx
  ea678c:	5b                   	pop    rbx
  ea678d:	e9 8e 77 94 00       	jmp    17edf20 <_ZdlPv@plt>
  ea6792:	53                   	push   rbx
  ea6793:	48 89 fb             	mov    rbx,rdi
  ea6796:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
  ea679d:	e8 e4 7c bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ea67a2:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
  ea67a9:	e8 e2 76 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ea67ae:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
  ea67b5:	e8 1a 00 00 00       	call   ea67d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dbea>
  ea67ba:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
  ea67c1:	e8 e2 64 ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
  ea67c6:	48 83 c3 30          	add    rbx,0x30
  ea67ca:	48 89 df             	mov    rdi,rbx
  ea67cd:	5b                   	pop    rbx
  ea67ce:	e9 93 36 93 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ea67d3:	cc                   	int3
  ea67d4:	41 57                	push   r15
  ea67d6:	41 56                	push   r14
  ea67d8:	53                   	push   rbx
  ea67d9:	48 89 fb             	mov    rbx,rdi
  ea67dc:	4c 8b 77 28          	mov    r14,QWORD PTR [rdi+0x28]
  ea67e0:	4d 85 f6             	test   r14,r14
  ea67e3:	74 1c                	je     ea6801 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dc17>
  ea67e5:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  ea67e8:	49 8d 7e 10          	lea    rdi,[r14+0x10]
  ea67ec:	e8 31 00 00 00       	call   ea6822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dc38>
  ea67f1:	4c 89 f7             	mov    rdi,r14
  ea67f4:	e8 27 77 94 00       	call   17edf20 <_ZdlPv@plt>
  ea67f9:	4d 89 fe             	mov    r14,r15
  ea67fc:	4d 85 ff             	test   r15,r15
  ea67ff:	75 e4                	jne    ea67e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dbfb>
  ea6801:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  ea6805:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
  ea680a:	48 85 ff             	test   rdi,rdi
  ea680d:	74 05                	je     ea6814 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dc2a>
  ea680f:	e8 0c 77 94 00       	call   17edf20 <_ZdlPv@plt>
  ea6814:	48 89 df             	mov    rdi,rbx
  ea6817:	5b                   	pop    rbx
  ea6818:	41 5e                	pop    r14
  ea681a:	41 5f                	pop    r15
  ea681c:	e9 f3 fe ff ff       	jmp    ea6714 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db2a>
  ea6821:	cc                   	int3
```
## Target `0xeaaf5c` tags: shared-ptr/object wrapper-like

```text
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
```
## Target `0xeaaf6e` tags: shared-ptr/object wrapper-like

```text
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
```
## Target `0xeabb76` tags: -

```text
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
```
## Target `0xeabc4e` tags: stack-output field +0x70

```text
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
```
## Target `0x160c11c` tags: shared-ptr/object wrapper-like

```text
 160c0d2:	89 b7 98 00 00 00    	mov    DWORD PTR [rdi+0x98],esi
 160c0d8:	c6 87 95 00 00 00 01 	mov    BYTE PTR [rdi+0x95],0x1
 160c0df:	e9 32 e4 ff ff       	jmp    160a516 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5684>
 160c0e4:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 160c0e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 160c0eb:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
 160c0ef:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
 160c0f3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 160c0f6:	48 89 0a             	mov    QWORD PTR [rdx],rcx
 160c0f9:	48 ff 4f 10          	dec    QWORD PTR [rdi+0x10]
 160c0fd:	48 89 c7             	mov    rdi,rax
 160c100:	e9 1b 1e 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c105:	cc                   	int3
 160c106:	53                   	push   rbx
 160c107:	48 89 fb             	mov    rbx,rdi
 160c10a:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
 160c10e:	e8 9f 23 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160c113:	48 89 df             	mov    rdi,rbx
 160c116:	5b                   	pop    rbx
 160c117:	e9 60 31 fe ff       	jmp    15ef27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x434800>
 160c11c:	48 8d 05 45 fc 27 00 	lea    rax,[rip+0x27fc45]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c123:	48 89 07             	mov    QWORD PTR [rdi],rax
 160c126:	48 83 c7 08          	add    rdi,0x8
 160c12a:	e9 d7 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c12f:	cc                   	int3
 160c130:	53                   	push   rbx
 160c131:	48 89 fb             	mov    rbx,rdi
 160c134:	e8 e3 ff ff ff       	call   160c11c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x728a>
 160c139:	48 89 df             	mov    rdi,rbx
 160c13c:	5b                   	pop    rbx
 160c13d:	e9 de 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c142:	41 56                	push   r14
 160c144:	53                   	push   rbx
 160c145:	48 83 ec 28          	sub    rsp,0x28
 160c149:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c150:	00 00
 160c152:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 160c157:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 160c15b:	6a 40                	push   0x40
 160c15d:	5f                   	pop    rdi
 160c15e:	e8 9d 1d 1e 00       	call   17edf00 <_Znwm@plt>
 160c163:	48 89 c3             	mov    rbx,rax
 160c166:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 160c16a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
 160c16f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c174:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
 160c17b:	00 00
 160c17d:	48 8d 05 e4 fb 27 00 	lea    rax,[rip+0x27fbe4]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c184:	48 89 03             	mov    QWORD PTR [rbx],rax
 160c187:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 160c18b:	4c 89 f6             	mov    rsi,r14
 160c18e:	e8 f7 05 00 00       	call   160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c193:	48 89 e7             	mov    rdi,rsp
 160c196:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 160c19a:	e8 2b e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c19f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1a6:	00 00
 160c1a8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1ad:	75 2e                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1af:	48 89 d8             	mov    rax,rbx
 160c1b2:	48 83 c4 28          	add    rsp,0x28
 160c1b6:	5b                   	pop    rbx
 160c1b7:	41 5e                	pop    r14
 160c1b9:	c3                   	ret
 160c1ba:	48 89 c3             	mov    rbx,rax
 160c1bd:	48 89 e7             	mov    rdi,rsp
 160c1c0:	e8 05 e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c1c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1cc:	00 00
 160c1ce:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1d3:	75 08                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1d5:	48 89 df             	mov    rdi,rbx
 160c1d8:	e8 f3 3a 46 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 160c1dd:	e8 ce 38 1e 00       	call   17efab0 <__stack_chk_fail@plt>
 160c1e2:	48 8d 47 08          	lea    rax,[rdi+0x8]
 160c1e6:	48 8d 0d 7b fb 27 00 	lea    rcx,[rip+0x27fb7b]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c1ed:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 160c1f0:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
 160c1f4:	48 89 c6             	mov    rsi,rax
 160c1f7:	e9 8e 05 00 00       	jmp    160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c1fc:	48 83 c7 08          	add    rdi,0x8
 160c200:	e9 01 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c205:	cc                   	int3
 160c206:	53                   	push   rbx
 160c207:	48 89 fb             	mov    rbx,rdi
 160c20a:	48 83 c7 08          	add    rdi,0x8
 160c20e:	e8 f3 fe ff ff       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c213:	48 89 df             	mov    rdi,rbx
 160c216:	5b                   	pop    rbx
 160c217:	e9 04 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c21c:	41 57                	push   r15
 160c21e:	41 56                	push   r14
 160c220:	41 55                	push   r13
 160c222:	41 54                	push   r12
 160c224:	53                   	push   rbx
 160c225:	48 81 ec 90 01 00 00 	sub    rsp,0x190
 160c22c:	49 89 f4             	mov    r12,rsi
 160c22f:	49 89 ff             	mov    r15,rdi
 160c232:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c239:	00 00
 160c23b:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
 160c242:	00
 160c243:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
 160c247:	48 8b 57 10          	mov    rdx,QWORD PTR [rdi+0x10]
 160c24b:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 160c250:	48 89 df             	mov    rdi,rbx
 160c253:	e8 52 bd 1c 00       	call   17d7faa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3dcb>
 160c258:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 160c25c:	0f 84 38 01 00 00    	je     160c39a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7508>
 160c262:	4d 8b 6f 20          	mov    r13,QWORD PTR [r15+0x20]
 160c266:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 160c26a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
 160c26e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 160c271:	ff 50 28             	call   QWORD PTR [rax+0x28]
 160c274:	49 89 c6             	mov    r14,rax
 160c277:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
 160c27c:	4c 89 6b f8          	mov    QWORD PTR [rbx-0x8],r13
 160c280:	48 89 df             	mov    rdi,rbx
 160c283:	4c 89 e6             	mov    rsi,r12
 160c286:	e8 a9 07 ff ff       	call   15fca34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441fb8>
 160c28b:	41 8b 47 28          	mov    eax,DWORD PTR [r15+0x28]
 160c28f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 160c294:	89 46 48             	mov    DWORD PTR [rsi+0x48],eax
 160c297:	0f 57 c0             	xorps  xmm0,xmm0
 160c29a:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 160c2a1:	00
 160c2a2:	0f 29 47 e8          	movaps XMMWORD PTR [rdi-0x18],xmm0
 160c2a6:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
 160c2ab:	e8 a4 01 00 00       	call   160c454 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75c2>
 160c2b0:	49 83 c7 30          	add    r15,0x30
 160c2b4:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
 160c2bb:	00
 160c2bc:	4c 89 e7             	mov    rdi,r12
 160c2bf:	4c 89 fe             	mov    rsi,r15
 160c2c2:	e8 81 80 58 ff       	call   b94348 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12e8>
 160c2c7:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 160c2ce:	00
 160c2cf:	4c 89 e6             	mov    rsi,r12
 160c2d2:	e8 87 4c 56 ff       	call   b70f5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdefe>
 160c2d7:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
 160c2de:	00
 160c2df:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 160c2e3:	e8 ca 21 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160c2e8:	48 8d 05 29 59 e4 fe 	lea    rax,[rip+0xfffffffffee45929]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 160c2ef:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c2f4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 160c2f9:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 160c2ff:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 160c306:	00
 160c307:	4c 89 ff             	mov    rdi,r15
 160c30a:	e8 71 01 00 00       	call   160c480 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75ee>
 160c30f:	48 83 a4 24 68 01 00 	and    QWORD PTR [rsp+0x168],0x0
 160c316:	00 00
 160c318:	48 83 a4 24 78 01 00 	and    QWORD PTR [rsp+0x178],0x0
 160c31f:	00 00
 160c321:	6a 68                	push   0x68
 160c323:	5f                   	pop    rdi
 160c324:	e8 d7 1b 1e 00       	call   17edf00 <_Znwm@plt>
 160c329:	49 89 c7             	mov    r15,rax
 160c32c:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
 160c333:	00
 160c334:	48 89 c7             	mov    rdi,rax
 160c337:	e8 44 01 00 00       	call   160c480 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75ee>
 160c33c:	4c 8d a4 24 68 01 00 	lea    r12,[rsp+0x168]
 160c343:	00
 160c344:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
 160c348:	48 8d 05 b7 08 ff ff 	lea    rax,[rip+0xffffffffffff08b7]        # 15fcc06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44218a>
 160c34f:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
 160c354:	48 8d 05 7d 01 00 00 	lea    rax,[rip+0x17d]        # 160c4d8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7646>
 160c35b:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
```
## Target `0x160c130` tags: shared-ptr/object wrapper-like

```text
 160c0eb:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
 160c0ef:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
 160c0f3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 160c0f6:	48 89 0a             	mov    QWORD PTR [rdx],rcx
 160c0f9:	48 ff 4f 10          	dec    QWORD PTR [rdi+0x10]
 160c0fd:	48 89 c7             	mov    rdi,rax
 160c100:	e9 1b 1e 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c105:	cc                   	int3
 160c106:	53                   	push   rbx
 160c107:	48 89 fb             	mov    rbx,rdi
 160c10a:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
 160c10e:	e8 9f 23 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160c113:	48 89 df             	mov    rdi,rbx
 160c116:	5b                   	pop    rbx
 160c117:	e9 60 31 fe ff       	jmp    15ef27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x434800>
 160c11c:	48 8d 05 45 fc 27 00 	lea    rax,[rip+0x27fc45]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c123:	48 89 07             	mov    QWORD PTR [rdi],rax
 160c126:	48 83 c7 08          	add    rdi,0x8
 160c12a:	e9 d7 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c12f:	cc                   	int3
 160c130:	53                   	push   rbx
 160c131:	48 89 fb             	mov    rbx,rdi
 160c134:	e8 e3 ff ff ff       	call   160c11c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x728a>
 160c139:	48 89 df             	mov    rdi,rbx
 160c13c:	5b                   	pop    rbx
 160c13d:	e9 de 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c142:	41 56                	push   r14
 160c144:	53                   	push   rbx
 160c145:	48 83 ec 28          	sub    rsp,0x28
 160c149:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c150:	00 00
 160c152:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 160c157:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 160c15b:	6a 40                	push   0x40
 160c15d:	5f                   	pop    rdi
 160c15e:	e8 9d 1d 1e 00       	call   17edf00 <_Znwm@plt>
 160c163:	48 89 c3             	mov    rbx,rax
 160c166:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 160c16a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
 160c16f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c174:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
 160c17b:	00 00
 160c17d:	48 8d 05 e4 fb 27 00 	lea    rax,[rip+0x27fbe4]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c184:	48 89 03             	mov    QWORD PTR [rbx],rax
 160c187:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 160c18b:	4c 89 f6             	mov    rsi,r14
 160c18e:	e8 f7 05 00 00       	call   160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c193:	48 89 e7             	mov    rdi,rsp
 160c196:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 160c19a:	e8 2b e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c19f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1a6:	00 00
 160c1a8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1ad:	75 2e                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1af:	48 89 d8             	mov    rax,rbx
 160c1b2:	48 83 c4 28          	add    rsp,0x28
 160c1b6:	5b                   	pop    rbx
 160c1b7:	41 5e                	pop    r14
 160c1b9:	c3                   	ret
 160c1ba:	48 89 c3             	mov    rbx,rax
 160c1bd:	48 89 e7             	mov    rdi,rsp
 160c1c0:	e8 05 e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c1c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1cc:	00 00
 160c1ce:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1d3:	75 08                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1d5:	48 89 df             	mov    rdi,rbx
 160c1d8:	e8 f3 3a 46 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 160c1dd:	e8 ce 38 1e 00       	call   17efab0 <__stack_chk_fail@plt>
 160c1e2:	48 8d 47 08          	lea    rax,[rdi+0x8]
 160c1e6:	48 8d 0d 7b fb 27 00 	lea    rcx,[rip+0x27fb7b]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c1ed:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 160c1f0:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
 160c1f4:	48 89 c6             	mov    rsi,rax
 160c1f7:	e9 8e 05 00 00       	jmp    160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c1fc:	48 83 c7 08          	add    rdi,0x8
 160c200:	e9 01 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c205:	cc                   	int3
 160c206:	53                   	push   rbx
 160c207:	48 89 fb             	mov    rbx,rdi
 160c20a:	48 83 c7 08          	add    rdi,0x8
 160c20e:	e8 f3 fe ff ff       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c213:	48 89 df             	mov    rdi,rbx
 160c216:	5b                   	pop    rbx
 160c217:	e9 04 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c21c:	41 57                	push   r15
 160c21e:	41 56                	push   r14
 160c220:	41 55                	push   r13
 160c222:	41 54                	push   r12
 160c224:	53                   	push   rbx
 160c225:	48 81 ec 90 01 00 00 	sub    rsp,0x190
 160c22c:	49 89 f4             	mov    r12,rsi
 160c22f:	49 89 ff             	mov    r15,rdi
 160c232:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c239:	00 00
 160c23b:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
 160c242:	00
 160c243:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
 160c247:	48 8b 57 10          	mov    rdx,QWORD PTR [rdi+0x10]
 160c24b:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 160c250:	48 89 df             	mov    rdi,rbx
 160c253:	e8 52 bd 1c 00       	call   17d7faa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3dcb>
 160c258:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 160c25c:	0f 84 38 01 00 00    	je     160c39a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7508>
 160c262:	4d 8b 6f 20          	mov    r13,QWORD PTR [r15+0x20]
 160c266:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 160c26a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
 160c26e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 160c271:	ff 50 28             	call   QWORD PTR [rax+0x28]
 160c274:	49 89 c6             	mov    r14,rax
 160c277:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
 160c27c:	4c 89 6b f8          	mov    QWORD PTR [rbx-0x8],r13
 160c280:	48 89 df             	mov    rdi,rbx
 160c283:	4c 89 e6             	mov    rsi,r12
 160c286:	e8 a9 07 ff ff       	call   15fca34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441fb8>
 160c28b:	41 8b 47 28          	mov    eax,DWORD PTR [r15+0x28]
 160c28f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 160c294:	89 46 48             	mov    DWORD PTR [rsi+0x48],eax
 160c297:	0f 57 c0             	xorps  xmm0,xmm0
 160c29a:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 160c2a1:	00
 160c2a2:	0f 29 47 e8          	movaps XMMWORD PTR [rdi-0x18],xmm0
 160c2a6:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
 160c2ab:	e8 a4 01 00 00       	call   160c454 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75c2>
 160c2b0:	49 83 c7 30          	add    r15,0x30
 160c2b4:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
 160c2bb:	00
 160c2bc:	4c 89 e7             	mov    rdi,r12
 160c2bf:	4c 89 fe             	mov    rsi,r15
 160c2c2:	e8 81 80 58 ff       	call   b94348 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12e8>
 160c2c7:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 160c2ce:	00
 160c2cf:	4c 89 e6             	mov    rsi,r12
 160c2d2:	e8 87 4c 56 ff       	call   b70f5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdefe>
 160c2d7:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
 160c2de:	00
 160c2df:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 160c2e3:	e8 ca 21 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160c2e8:	48 8d 05 29 59 e4 fe 	lea    rax,[rip+0xfffffffffee45929]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 160c2ef:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c2f4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 160c2f9:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 160c2ff:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 160c306:	00
 160c307:	4c 89 ff             	mov    rdi,r15
 160c30a:	e8 71 01 00 00       	call   160c480 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75ee>
 160c30f:	48 83 a4 24 68 01 00 	and    QWORD PTR [rsp+0x168],0x0
 160c316:	00 00
 160c318:	48 83 a4 24 78 01 00 	and    QWORD PTR [rsp+0x178],0x0
 160c31f:	00 00
 160c321:	6a 68                	push   0x68
 160c323:	5f                   	pop    rdi
 160c324:	e8 d7 1b 1e 00       	call   17edf00 <_Znwm@plt>
 160c329:	49 89 c7             	mov    r15,rax
 160c32c:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
 160c333:	00
 160c334:	48 89 c7             	mov    rdi,rax
 160c337:	e8 44 01 00 00       	call   160c480 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75ee>
 160c33c:	4c 8d a4 24 68 01 00 	lea    r12,[rsp+0x168]
 160c343:	00
 160c344:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
 160c348:	48 8d 05 b7 08 ff ff 	lea    rax,[rip+0xffffffffffff08b7]        # 15fcc06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44218a>
 160c34f:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
 160c354:	48 8d 05 7d 01 00 00 	lea    rax,[rip+0x17d]        # 160c4d8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7646>
 160c35b:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
 160c360:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 160c365:	4c 89 f7             	mov    rdi,r14
 160c368:	4c 89 e2             	mov    rdx,r12
 160c36b:	e8 18 51 1b 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
 160c370:	4c 89 e7             	mov    rdi,r12
```
## Target `0x160c142` tags: shared-ptr/object wrapper-like

```text
 160c100:	e9 1b 1e 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c105:	cc                   	int3
 160c106:	53                   	push   rbx
 160c107:	48 89 fb             	mov    rbx,rdi
 160c10a:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
 160c10e:	e8 9f 23 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160c113:	48 89 df             	mov    rdi,rbx
 160c116:	5b                   	pop    rbx
 160c117:	e9 60 31 fe ff       	jmp    15ef27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x434800>
 160c11c:	48 8d 05 45 fc 27 00 	lea    rax,[rip+0x27fc45]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c123:	48 89 07             	mov    QWORD PTR [rdi],rax
 160c126:	48 83 c7 08          	add    rdi,0x8
 160c12a:	e9 d7 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c12f:	cc                   	int3
 160c130:	53                   	push   rbx
 160c131:	48 89 fb             	mov    rbx,rdi
 160c134:	e8 e3 ff ff ff       	call   160c11c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x728a>
 160c139:	48 89 df             	mov    rdi,rbx
 160c13c:	5b                   	pop    rbx
 160c13d:	e9 de 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c142:	41 56                	push   r14
 160c144:	53                   	push   rbx
 160c145:	48 83 ec 28          	sub    rsp,0x28
 160c149:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c150:	00 00
 160c152:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 160c157:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 160c15b:	6a 40                	push   0x40
 160c15d:	5f                   	pop    rdi
 160c15e:	e8 9d 1d 1e 00       	call   17edf00 <_Znwm@plt>
 160c163:	48 89 c3             	mov    rbx,rax
 160c166:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 160c16a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
 160c16f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c174:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
 160c17b:	00 00
 160c17d:	48 8d 05 e4 fb 27 00 	lea    rax,[rip+0x27fbe4]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c184:	48 89 03             	mov    QWORD PTR [rbx],rax
 160c187:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 160c18b:	4c 89 f6             	mov    rsi,r14
 160c18e:	e8 f7 05 00 00       	call   160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c193:	48 89 e7             	mov    rdi,rsp
 160c196:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 160c19a:	e8 2b e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c19f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1a6:	00 00
 160c1a8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1ad:	75 2e                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1af:	48 89 d8             	mov    rax,rbx
 160c1b2:	48 83 c4 28          	add    rsp,0x28
 160c1b6:	5b                   	pop    rbx
 160c1b7:	41 5e                	pop    r14
 160c1b9:	c3                   	ret
 160c1ba:	48 89 c3             	mov    rbx,rax
 160c1bd:	48 89 e7             	mov    rdi,rsp
 160c1c0:	e8 05 e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c1c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1cc:	00 00
 160c1ce:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1d3:	75 08                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1d5:	48 89 df             	mov    rdi,rbx
 160c1d8:	e8 f3 3a 46 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 160c1dd:	e8 ce 38 1e 00       	call   17efab0 <__stack_chk_fail@plt>
 160c1e2:	48 8d 47 08          	lea    rax,[rdi+0x8]
 160c1e6:	48 8d 0d 7b fb 27 00 	lea    rcx,[rip+0x27fb7b]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c1ed:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 160c1f0:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
 160c1f4:	48 89 c6             	mov    rsi,rax
 160c1f7:	e9 8e 05 00 00       	jmp    160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c1fc:	48 83 c7 08          	add    rdi,0x8
 160c200:	e9 01 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c205:	cc                   	int3
 160c206:	53                   	push   rbx
 160c207:	48 89 fb             	mov    rbx,rdi
 160c20a:	48 83 c7 08          	add    rdi,0x8
 160c20e:	e8 f3 fe ff ff       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c213:	48 89 df             	mov    rdi,rbx
 160c216:	5b                   	pop    rbx
 160c217:	e9 04 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c21c:	41 57                	push   r15
 160c21e:	41 56                	push   r14
 160c220:	41 55                	push   r13
 160c222:	41 54                	push   r12
 160c224:	53                   	push   rbx
 160c225:	48 81 ec 90 01 00 00 	sub    rsp,0x190
 160c22c:	49 89 f4             	mov    r12,rsi
 160c22f:	49 89 ff             	mov    r15,rdi
 160c232:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c239:	00 00
 160c23b:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
 160c242:	00
 160c243:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
 160c247:	48 8b 57 10          	mov    rdx,QWORD PTR [rdi+0x10]
 160c24b:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 160c250:	48 89 df             	mov    rdi,rbx
 160c253:	e8 52 bd 1c 00       	call   17d7faa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3dcb>
 160c258:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 160c25c:	0f 84 38 01 00 00    	je     160c39a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7508>
 160c262:	4d 8b 6f 20          	mov    r13,QWORD PTR [r15+0x20]
 160c266:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 160c26a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
 160c26e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 160c271:	ff 50 28             	call   QWORD PTR [rax+0x28]
 160c274:	49 89 c6             	mov    r14,rax
 160c277:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
 160c27c:	4c 89 6b f8          	mov    QWORD PTR [rbx-0x8],r13
 160c280:	48 89 df             	mov    rdi,rbx
 160c283:	4c 89 e6             	mov    rsi,r12
 160c286:	e8 a9 07 ff ff       	call   15fca34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441fb8>
 160c28b:	41 8b 47 28          	mov    eax,DWORD PTR [r15+0x28]
 160c28f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 160c294:	89 46 48             	mov    DWORD PTR [rsi+0x48],eax
 160c297:	0f 57 c0             	xorps  xmm0,xmm0
 160c29a:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 160c2a1:	00
 160c2a2:	0f 29 47 e8          	movaps XMMWORD PTR [rdi-0x18],xmm0
 160c2a6:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
 160c2ab:	e8 a4 01 00 00       	call   160c454 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75c2>
 160c2b0:	49 83 c7 30          	add    r15,0x30
 160c2b4:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
 160c2bb:	00
 160c2bc:	4c 89 e7             	mov    rdi,r12
 160c2bf:	4c 89 fe             	mov    rsi,r15
 160c2c2:	e8 81 80 58 ff       	call   b94348 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12e8>
 160c2c7:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 160c2ce:	00
 160c2cf:	4c 89 e6             	mov    rsi,r12
 160c2d2:	e8 87 4c 56 ff       	call   b70f5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdefe>
 160c2d7:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
 160c2de:	00
 160c2df:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 160c2e3:	e8 ca 21 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160c2e8:	48 8d 05 29 59 e4 fe 	lea    rax,[rip+0xfffffffffee45929]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 160c2ef:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c2f4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 160c2f9:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 160c2ff:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 160c306:	00
 160c307:	4c 89 ff             	mov    rdi,r15
 160c30a:	e8 71 01 00 00       	call   160c480 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75ee>
 160c30f:	48 83 a4 24 68 01 00 	and    QWORD PTR [rsp+0x168],0x0
 160c316:	00 00
 160c318:	48 83 a4 24 78 01 00 	and    QWORD PTR [rsp+0x178],0x0
 160c31f:	00 00
 160c321:	6a 68                	push   0x68
 160c323:	5f                   	pop    rdi
 160c324:	e8 d7 1b 1e 00       	call   17edf00 <_Znwm@plt>
 160c329:	49 89 c7             	mov    r15,rax
 160c32c:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
 160c333:	00
 160c334:	48 89 c7             	mov    rdi,rax
 160c337:	e8 44 01 00 00       	call   160c480 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75ee>
 160c33c:	4c 8d a4 24 68 01 00 	lea    r12,[rsp+0x168]
 160c343:	00
 160c344:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
 160c348:	48 8d 05 b7 08 ff ff 	lea    rax,[rip+0xffffffffffff08b7]        # 15fcc06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44218a>
 160c34f:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
 160c354:	48 8d 05 7d 01 00 00 	lea    rax,[rip+0x17d]        # 160c4d8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7646>
 160c35b:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
 160c360:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 160c365:	4c 89 f7             	mov    rdi,r14
 160c368:	4c 89 e2             	mov    rdx,r12
 160c36b:	e8 18 51 1b 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
 160c370:	4c 89 e7             	mov    rdi,r12
 160c373:	e8 26 af 49 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 160c378:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
 160c37f:	00
 160c380:	e8 b3 08 ff ff       	call   15fcc38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4421bc>
 160c385:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 160c38c:	00
```
## Text references to candidate method targets

### ref at `0x9d7960`

```text
  9d7914:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  9d7919:	4c 89 f2             	mov    rdx,r14
  9d791c:	e8 9f 16 00 00       	call   9d8fc0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xdf0>
  9d7921:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  9d7926:	48 8d 15 22 3a 98 ff 	lea    rdx,[rip+0xffffffffff983a22]        # 35b34f <_ZTSSt12bad_any_cast@@Base-0x34e79>
  9d792d:	4c 89 ee             	mov    rsi,r13
  9d7930:	b9 39 00 00 00       	mov    ecx,0x39
  9d7935:	e8 96 04 00 00       	call   9d7dd0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x860>
  9d793a:	48 8d 15 25 47 9a ff 	lea    rdx,[rip+0xffffffffff9a4725]        # 37c066 <_ZTSSt12bad_any_cast@@Base-0x14162>
  9d7941:	48 89 df             	mov    rdi,rbx
  9d7944:	48 89 ee             	mov    rsi,rbp
  9d7947:	b9 40 00 00 00       	mov    ecx,0x40
  9d794c:	e8 7f 04 00 00       	call   9d7dd0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x860>
  9d7951:	48 89 df             	mov    rdi,rbx
  9d7954:	e8 97 04 00 00       	call   9d7df0 <_ZNSt13bad_exceptionD1Ev@@Base+0x10>
  9d7959:	84 c0                	test   al,al
  9d795b:	74 44                	je     9d79a1 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x431>
  9d795d:	48 89 df             	mov    rdi,rbx
  9d7960:	e8 7b 04 00 00       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  9d7965:	48 8d 9c 24 f8 00 00 	lea    rbx,[rsp+0xf8]
  9d796c:	00
  9d796d:	48 89 df             	mov    rdi,rbx
  9d7970:	be 01 00 00 00       	mov    esi,0x1
  9d7975:	e8 56 0c 00 00       	call   9d85d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x400>
  9d797a:	48 89 df             	mov    rdi,rbx
  9d797d:	e8 9e 0c 00 00       	call   9d8620 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x450>
  9d7982:	48 8b 8c 24 20 01 00 	mov    rcx,QWORD PTR [rsp+0x120]
  9d7989:	00
  9d798a:	48 01 c8             	add    rax,rcx
  9d798d:	48 83 c0 ff          	add    rax,0xffffffffffffffff
  9d7991:	48 f7 d9             	neg    rcx
  9d7994:	48 21 c1             	and    rcx,rax
  9d7997:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  9d799c:	48 89 08             	mov    QWORD PTR [rax],rcx
  9d799f:	eb 50                	jmp    9d79f1 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x481>
  9d79a1:	ba 80 00 00 00       	mov    edx,0x80
  9d79a6:	31 ff                	xor    edi,edi
  9d79a8:	4c 89 ee             	mov    rsi,r13
  9d79ab:	e8 60 04 00 00       	call   9d7e10 <_ZNSt13bad_exceptionD1Ev@@Base+0x30>
  9d79b0:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
  9d79b4:	48 8d 0d 94 39 98 ff 	lea    rcx,[rip+0xffffffffff983994]        # 35b34f <_ZTSSt12bad_any_cast@@Base-0x34e79>
  9d79bb:	4c 8d 0d 0c d3 97 ff 	lea    r9,[rip+0xffffffffff97d30c]        # 354cce <_ZTSSt12bad_any_cast@@Base-0x3b4fa>
  9d79c2:	4c 89 ff             	mov    rdi,r15
  9d79c5:	be 0a 00 00 00       	mov    esi,0xa
  9d79ca:	ba 01 00 00 00       	mov    edx,0x1
  9d79cf:	41 b8 44 00 00 00    	mov    r8d,0x44
  9d79d5:	31 c0                	xor    eax,eax
  9d79d7:	e8 84 fd ff ff       	call   9d7760 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x1f0>
  9d79dc:	48 89 df             	mov    rdi,rbx
  9d79df:	e8 1c 05 00 00       	call   9d7f00 <_ZNSt13bad_exceptionD1Ev@@Base+0x120>
```
### ref at `0x9d7ae7`

```text
  9d7a99:	4c 89 fe             	mov    rsi,r15
  9d7a9c:	4c 89 f2             	mov    rdx,r14
  9d7a9f:	e8 1c 15 00 00       	call   9d8fc0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xdf0>
  9d7aa4:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  9d7aa9:	48 8d 15 9f 38 98 ff 	lea    rdx,[rip+0xffffffffff98389f]        # 35b34f <_ZTSSt12bad_any_cast@@Base-0x34e79>
  9d7ab0:	4c 89 ee             	mov    rsi,r13
  9d7ab3:	b9 39 00 00 00       	mov    ecx,0x39
  9d7ab8:	e8 13 03 00 00       	call   9d7dd0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x860>
  9d7abd:	48 8d 15 a2 45 9a ff 	lea    rdx,[rip+0xffffffffff9a45a2]        # 37c066 <_ZTSSt12bad_any_cast@@Base-0x14162>
  9d7ac4:	48 89 df             	mov    rdi,rbx
  9d7ac7:	48 89 ee             	mov    rsi,rbp
  9d7aca:	b9 63 00 00 00       	mov    ecx,0x63
  9d7acf:	e8 fc 02 00 00       	call   9d7dd0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x860>
  9d7ad4:	48 89 df             	mov    rdi,rbx
  9d7ad7:	e8 14 03 00 00       	call   9d7df0 <_ZNSt13bad_exceptionD1Ev@@Base+0x10>
  9d7adc:	84 c0                	test   al,al
  9d7ade:	0f 84 e4 00 00 00    	je     9d7bc8 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x658>
  9d7ae4:	48 89 df             	mov    rdi,rbx
  9d7ae7:	e8 f4 02 00 00       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  9d7aec:	48 8d 9c 24 48 01 00 	lea    rbx,[rsp+0x148]
  9d7af3:	00
  9d7af4:	48 89 df             	mov    rdi,rbx
  9d7af7:	be 01 00 00 00       	mov    esi,0x1
  9d7afc:	e8 cf 0a 00 00       	call   9d85d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x400>
  9d7b01:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
  9d7b06:	48 89 df             	mov    rdi,rbx
  9d7b09:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
  9d7b0e:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
  9d7b13:	e8 f8 05 00 00       	call   9d8110 <_ZNSt13bad_exceptionD1Ev@@Base+0x330>
  9d7b18:	48 89 c3             	mov    rbx,rax
  9d7b1b:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
  9d7b20:	48 89 c7             	mov    rdi,rax
  9d7b23:	4c 89 ee             	mov    rsi,r13
  9d7b26:	e8 95 02 00 00       	call   9d7dc0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x850>
  9d7b2b:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
  9d7b30:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
  9d7b35:	48 8d ac 24 c0 00 00 	lea    rbp,[rsp+0xc0]
  9d7b3c:	00
  9d7b3d:	48 89 df             	mov    rdi,rbx
  9d7b40:	48 89 ee             	mov    rsi,rbp
  9d7b43:	e8 78 02 00 00       	call   9d7dc0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x850>
  9d7b48:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  9d7b4d:	4c 89 fe             	mov    rsi,r15
  9d7b50:	4c 89 f2             	mov    rdx,r14
  9d7b53:	e8 68 14 00 00       	call   9d8fc0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xdf0>
  9d7b58:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  9d7b5d:	48 8d 15 eb 37 98 ff 	lea    rdx,[rip+0xffffffffff9837eb]        # 35b34f <_ZTSSt12bad_any_cast@@Base-0x34e79>
  9d7b64:	48 89 ee             	mov    rsi,rbp
  9d7b67:	b9 39 00 00 00       	mov    ecx,0x39
  9d7b6c:	e8 5f 02 00 00       	call   9d7dd0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x860>
```
### ref at `0x9d7b97`

```text
  9d7b4d:	4c 89 fe             	mov    rsi,r15
  9d7b50:	4c 89 f2             	mov    rdx,r14
  9d7b53:	e8 68 14 00 00       	call   9d8fc0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xdf0>
  9d7b58:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  9d7b5d:	48 8d 15 eb 37 98 ff 	lea    rdx,[rip+0xffffffffff9837eb]        # 35b34f <_ZTSSt12bad_any_cast@@Base-0x34e79>
  9d7b64:	48 89 ee             	mov    rsi,rbp
  9d7b67:	b9 39 00 00 00       	mov    ecx,0x39
  9d7b6c:	e8 5f 02 00 00       	call   9d7dd0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x860>
  9d7b71:	48 8d 15 ee 44 9a ff 	lea    rdx,[rip+0xffffffffff9a44ee]        # 37c066 <_ZTSSt12bad_any_cast@@Base-0x14162>
  9d7b78:	48 89 df             	mov    rdi,rbx
  9d7b7b:	4c 89 ee             	mov    rsi,r13
  9d7b7e:	b9 71 00 00 00       	mov    ecx,0x71
  9d7b83:	e8 48 02 00 00       	call   9d7dd0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x860>
  9d7b88:	48 89 df             	mov    rdi,rbx
  9d7b8b:	e8 60 02 00 00       	call   9d7df0 <_ZNSt13bad_exceptionD1Ev@@Base+0x10>
  9d7b90:	84 c0                	test   al,al
  9d7b92:	74 6a                	je     9d7bfe <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x68e>
  9d7b94:	48 89 df             	mov    rdi,rbx
  9d7b97:	e8 44 02 00 00       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  9d7b9c:	49 8b 17             	mov    rdx,QWORD PTR [r15]
  9d7b9f:	4c 89 a4 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],r12
  9d7ba6:	00
  9d7ba7:	48 c7 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],0x0
  9d7bae:	00 00 00 00 00
  9d7bb3:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  9d7bba:	00
  9d7bbb:	4c 89 f6             	mov    rsi,r14
  9d7bbe:	e8 5d 1b 00 00       	call   9d9720 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1550>
  9d7bc3:	e9 86 00 00 00       	jmp    9d7c4e <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x6de>
  9d7bc8:	ba 80 00 00 00       	mov    edx,0x80
  9d7bcd:	31 ff                	xor    edi,edi
  9d7bcf:	4c 89 ee             	mov    rsi,r13
  9d7bd2:	e8 39 02 00 00       	call   9d7e10 <_ZNSt13bad_exceptionD1Ev@@Base+0x30>
  9d7bd7:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
  9d7bdb:	48 8d 0d 6d 37 98 ff 	lea    rcx,[rip+0xffffffffff98376d]        # 35b34f <_ZTSSt12bad_any_cast@@Base-0x34e79>
  9d7be2:	4c 8d 0d e5 d0 97 ff 	lea    r9,[rip+0xffffffffff97d0e5]        # 354cce <_ZTSSt12bad_any_cast@@Base-0x3b4fa>
  9d7be9:	4c 89 e7             	mov    rdi,r12
  9d7bec:	be 0a 00 00 00       	mov    esi,0xa
  9d7bf1:	ba 01 00 00 00       	mov    edx,0x1
  9d7bf6:	41 b8 67 00 00 00    	mov    r8d,0x67
  9d7bfc:	eb 34                	jmp    9d7c32 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x6c2>
  9d7bfe:	ba 80 00 00 00       	mov    edx,0x80
  9d7c03:	31 ff                	xor    edi,edi
  9d7c05:	48 89 ee             	mov    rsi,rbp
  9d7c08:	e8 03 02 00 00       	call   9d7e10 <_ZNSt13bad_exceptionD1Ev@@Base+0x30>
  9d7c0d:	48 89 2c 24          	mov    QWORD PTR [rsp],rbp
  9d7c11:	48 8d 0d 37 37 98 ff 	lea    rcx,[rip+0xffffffffff983737]        # 35b34f <_ZTSSt12bad_any_cast@@Base-0x34e79>
  9d7c18:	4c 8d 0d af d0 97 ff 	lea    r9,[rip+0xffffffffff97d0af]        # 354cce <_ZTSSt12bad_any_cast@@Base-0x3b4fa>
  9d7c1f:	4c 89 e7             	mov    rdi,r12
  9d7c22:	be 0a 00 00 00       	mov    esi,0xa
```
### ref at `0x9d7de0`

```text
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
```
### ref at `0x9e8032`

```text
  9e8016:	cc                   	int3
  9e8017:	cc                   	int3
  9e8018:	cc                   	int3
  9e8019:	cc                   	int3
  9e801a:	cc                   	int3
  9e801b:	cc                   	int3
  9e801c:	cc                   	int3
  9e801d:	cc                   	int3
  9e801e:	cc                   	int3
  9e801f:	cc                   	int3
  9e8020:	55                   	push   rbp
  9e8021:	41 56                	push   r14
  9e8023:	53                   	push   rbx
  9e8024:	41 89 ce             	mov    r14d,ecx
  9e8027:	89 f5                	mov    ebp,esi
  9e8029:	48 89 fb             	mov    rbx,rdi
  9e802c:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  9e8030:	89 d6                	mov    esi,edx
  9e8032:	e8 a9 fd fe ff       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  9e8037:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  9e803a:	89 ee                	mov    esi,ebp
  9e803c:	e8 1f 01 00 00       	call   9e8160 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x5b0>
  9e8041:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  9e8044:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  9e8048:	44 89 f2             	mov    edx,r14d
  9e804b:	5b                   	pop    rbx
  9e804c:	41 5e                	pop    r14
  9e804e:	5d                   	pop    rbp
  9e804f:	e9 5c 03 00 00       	jmp    9e83b0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x800>
  9e8054:	cc                   	int3
  9e8055:	cc                   	int3
  9e8056:	cc                   	int3
  9e8057:	cc                   	int3
  9e8058:	cc                   	int3
  9e8059:	cc                   	int3
  9e805a:	cc                   	int3
  9e805b:	cc                   	int3
  9e805c:	cc                   	int3
  9e805d:	cc                   	int3
  9e805e:	cc                   	int3
  9e805f:	cc                   	int3
  9e8060:	55                   	push   rbp
  9e8061:	41 56                	push   r14
  9e8063:	53                   	push   rbx
  9e8064:	89 cd                	mov    ebp,ecx
  9e8066:	49 89 d6             	mov    r14,rdx
  9e8069:	48 89 fb             	mov    rbx,rdi
  9e806c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  9e8070:	e8 0b 05 00 00       	call   9e8580 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x9d0>
  9e8075:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
```
### ref at `0xa50370`

```text
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
```
### ref at `0xa556e7`

```text
  a556a0:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
  a556a4:	eb 1c                	jmp    a556c2 <_ZNSt6__ndk14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE@@Base+0xc72>
  a556a6:	48 8b 35 eb 25 e6 00 	mov    rsi,QWORD PTR [rip+0xe625eb]        # 18b7c98 <__cxa_unexpected_handler@@Base+0x8>
  a556ad:	48 8d 3d 53 f7 8f ff 	lea    rdi,[rip+0xffffffffff8ff753]        # 354e07 <_ZTSSt12bad_any_cast@@Base-0x3b3c1>
  a556b4:	31 c0                	xor    eax,eax
  a556b6:	e8 e5 07 00 00       	call   a55ea0 <_ZNKSt10bad_typeid4whatEv@@Base+0x10>
  a556bb:	49 8d 86 80 00 00 00 	lea    rax,[r14+0x80]
  a556c2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  a556c7:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
  a556cb:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
  a556cf:	4c 89 ff             	mov    rdi,r15
  a556d2:	31 f6                	xor    esi,esi
  a556d4:	31 d2                	xor    edx,edx
  a556d6:	31 c9                	xor    ecx,ecx
  a556d8:	e8 83 b4 d9 00       	call   17f0b60 <__cxa_demangle@plt>
  a556dd:	48 89 c3             	mov    rbx,rax
  a556e0:	48 85 c0             	test   rax,rax
  a556e3:	49 0f 44 df          	cmove  rbx,r15
  a556e7:	48 8d 05 f2 26 f8 ff 	lea    rax,[rip+0xfffffffffff826f2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  a556ee:	4c 8d 3d fb 00 00 00 	lea    r15,[rip+0xfb]        # a557f0 <_ZdlPv@@Base>
  a556f5:	4c 0f 44 f8          	cmove  r15,rax
  a556f9:	48 8b 3d 70 c3 e5 00 	mov    rdi,QWORD PTR [rip+0xe5c370]        # 18b1a70 <_ZTISt9exception@@Base+0xb8600>
  a55700:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a55703:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
  a55708:	4c 89 f6             	mov    rsi,r14
  a5570b:	ff 50 20             	call   QWORD PTR [rax+0x20]
  a5570e:	84 c0                	test   al,al
  a55710:	74 29                	je     a5573b <_ZNSt6__ndk14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE@@Base+0xceb>
  a55712:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  a55717:	4c 8b 35 7a 25 e6 00 	mov    r14,QWORD PTR [rip+0xe6257a]        # 18b7c98 <__cxa_unexpected_handler@@Base+0x8>
  a5571e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a55721:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a55724:	48 8d 3d 4d d4 91 ff 	lea    rdi,[rip+0xffffffffff91d44d]        # 372b78 <_ZTSSt12bad_any_cast@@Base-0x1d650>
  a5572b:	4c 89 f6             	mov    rsi,r14
  a5572e:	48 89 da             	mov    rdx,rbx
  a55731:	48 89 c1             	mov    rcx,rax
  a55734:	31 c0                	xor    eax,eax
  a55736:	e8 65 07 00 00       	call   a55ea0 <_ZNKSt10bad_typeid4whatEv@@Base+0x10>
  a5573b:	48 8b 35 56 25 e6 00 	mov    rsi,QWORD PTR [rip+0xe62556]        # 18b7c98 <__cxa_unexpected_handler@@Base+0x8>
  a55742:	48 8d 3d 1c 33 8f ff 	lea    rdi,[rip+0xffffffffff8f331c]        # 348a65 <_ZTSSt12bad_any_cast@@Base-0x47763>
  a55749:	48 89 da             	mov    rdx,rbx
  a5574c:	31 c0                	xor    eax,eax
  a5574e:	e8 4d 07 00 00       	call   a55ea0 <_ZNKSt10bad_typeid4whatEv@@Base+0x10>
  a55753:	49 89 c6             	mov    r14,rax
  a55756:	48 85 db             	test   rbx,rbx
  a55759:	75 0a                	jne    a55765 <_ZNSt6__ndk14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE@@Base+0xd15>
  a5575b:	eb 0e                	jmp    a5576b <_ZNSt6__ndk14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE@@Base+0xd1b>
  a5575d:	49 89 c6             	mov    r14,rax
  a55760:	48 85 db             	test   rbx,rbx
  a55763:	74 06                	je     a5576b <_ZNSt6__ndk14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE@@Base+0xd1b>
```
### ref at `0xa8fee1`

```text
  a8fe97:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx
  a8fe9b:	4c 89 f7             	mov    rdi,r14
  a8fe9e:	e8 93 b9 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  a8fea3:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
  a8fea7:	49 89 57 38          	mov    QWORD PTR [r15+0x38],rdx
  a8feab:	4c 8d 35 46 b0 f5 00 	lea    r14,[rip+0xf5b046]        # 19eaef8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1b30>
  a8feb2:	6a 04                	push   0x4
  a8feb4:	5a                   	pop    rdx
  a8feb5:	4c 89 f7             	mov    rdi,r14
  a8feb8:	4c 89 fe             	mov    rsi,r15
  a8febb:	e8 f2 61 77 00       	call   12060b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b636>
  a8fec0:	48 8d 3d 65 41 2b 00 	lea    rdi,[rip+0x2b4165]        # d4402c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110b2>
  a8fec7:	4c 89 f6             	mov    rsi,r14
  a8feca:	48 89 da             	mov    rdx,rbx
  a8fecd:	e8 8e df d5 00       	call   17ede60 <__cxa_atexit@plt>
  a8fed2:	48 83 25 ee b1 f5 00 	and    QWORD PTR [rip+0xf5b1ee],0x0        # 19eb0c8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1d00>
  a8fed9:	00
  a8feda:	48 8d 35 e7 b1 f5 00 	lea    rsi,[rip+0xf5b1e7]        # 19eb0c8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1d00>
  a8fee1:	48 8d 05 f8 7e f4 ff 	lea    rax,[rip+0xfffffffffff47ef8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  a8fee8:	48 89 05 e9 b1 f5 00 	mov    QWORD PTR [rip+0xf5b1e9],rax        # 19eb0d8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1d10>
  a8feef:	48 8d 05 da 82 f4 ff 	lea    rax,[rip+0xfffffffffff482da]        # 9d81d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base>
  a8fef6:	48 89 05 e3 b1 f5 00 	mov    QWORD PTR [rip+0xf5b1e3],rax        # 19eb0e0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1d18>
  a8fefd:	48 8d 3d 5a 65 89 00 	lea    rdi,[rip+0x89655a]        # 132645e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b9e2>
  a8ff04:	48 89 da             	mov    rdx,rbx
  a8ff07:	e8 54 df d5 00       	call   17ede60 <__cxa_atexit@plt>
  a8ff0c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a8ff13:	00 00
  a8ff15:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
  a8ff1a:	75 0a                	jne    a8ff26 <JNI_OnUnload@@Base+0x177f3>
  a8ff1c:	48 83 c4 50          	add    rsp,0x50
  a8ff20:	5b                   	pop    rbx
  a8ff21:	41 5e                	pop    r14
  a8ff23:	41 5f                	pop    r15
  a8ff25:	c3                   	ret
  a8ff26:	e8 85 fb d5 00       	call   17efab0 <__stack_chk_fail@plt>
  a8ff2b:	41 57                	push   r15
  a8ff2d:	41 56                	push   r14
  a8ff2f:	53                   	push   rbx
  a8ff30:	48 83 ec 50          	sub    rsp,0x50
  a8ff34:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a8ff3b:	00 00
  a8ff3d:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  a8ff42:	e8 53 08 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a8ff47:	e8 95 08 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a8ff4c:	e8 d7 08 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a8ff51:	e8 19 09 02 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a8ff56:	4c 8d 35 c3 af f5 00 	lea    r14,[rip+0xf5afc3]        # 19eaf20 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1b58>
  a8ff5d:	48 8d 35 00 10 8f ff 	lea    rsi,[rip+0xffffffffff8f1000]        # 380f64 <_ZTSSt12bad_any_cast@@Base-0xf264>
  a8ff64:	4c 89 f7             	mov    rdi,r14
  a8ff67:	e8 12 9b fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
```
### ref at `0xac2256`

```text
  ac2204:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  ac220b:	00
  ac220c:	e8 7f bc d2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ac2211:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  ac2218:	00
  ac2219:	e8 72 bc d2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ac221e:	48 8d 05 cb aa d4 00 	lea    rax,[rip+0xd4aacb]        # 180ccf0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x29b0>
  ac2225:	49 89 44 24 70       	mov    QWORD PTR [r12+0x70],rax
  ac222a:	bf 30 01 00 00       	mov    edi,0x130
  ac222f:	e8 cc bc d2 00       	call   17edf00 <_Znwm@plt>
  ac2234:	49 89 c6             	mov    r14,rax
  ac2237:	66 0f ef c0          	pxor   xmm0,xmm0
  ac223b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  ac2240:	48 8d 05 b9 ab d4 00 	lea    rax,[rip+0xd4abb9]        # 180ce00 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2ac0>
  ac2247:	48 8d 9c 24 80 01 00 	lea    rbx,[rsp+0x180]
  ac224e:	00
  ac224f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  ac2253:	49 89 06             	mov    QWORD PTR [r14],rax
  ac2256:	48 8d 05 83 5b f1 ff 	lea    rax,[rip+0xfffffffffff15b83]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ac225d:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  ac2261:	48 8d 05 74 39 01 00 	lea    rax,[rip+0x13974]        # ad5bdc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22b7c>
  ac2268:	4c 8d bc 24 40 01 00 	lea    r15,[rsp+0x140]
  ac226f:	00
  ac2270:	49 83 27 00          	and    QWORD PTR [r15],0x0
  ac2274:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  ac2278:	48 8d 05 61 5b f1 ff 	lea    rax,[rip+0xfffffffffff15b61]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ac227f:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  ac2283:	48 8d 05 00 d4 09 00 	lea    rax,[rip+0x9d400]        # b5f68a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac62a>
  ac228a:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  ac228e:	48 8d 05 0b ab d4 00 	lea    rax,[rip+0xd4ab0b]        # 180cda0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2a60>
  ac2295:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  ac2299:	49 8d 7e 20          	lea    rdi,[r14+0x20]
  ac229d:	e8 e2 cd 09 00       	call   b5f084 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac024>
  ac22a2:	49 83 66 48 00       	and    QWORD PTR [r14+0x48],0x0
  ac22a7:	31 c0                	xor    eax,eax
  ac22a9:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
  ac22ad:	41 88 46 58          	mov    BYTE PTR [r14+0x58],al
  ac22b1:	41 83 66 60 00       	and    DWORD PTR [r14+0x60],0x0
  ac22b6:	41 c6 46 64 01       	mov    BYTE PTR [r14+0x64],0x1
  ac22bb:	41 83 66 68 00       	and    DWORD PTR [r14+0x68],0x0
  ac22c0:	41 88 46 6c          	mov    BYTE PTR [r14+0x6c],al
  ac22c4:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
  ac22c8:	49 8d 7e 78          	lea    rdi,[r14+0x78]
  ac22cc:	48 89 de             	mov    rsi,rbx
  ac22cf:	e8 c0 cd 09 00       	call   b5f094 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac034>
  ac22d4:	49 8d be 98 00 00 00 	lea    rdi,[r14+0x98]
  ac22db:	4c 89 fe             	mov    rsi,r15
  ac22de:	e8 b1 cd 09 00       	call   b5f094 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac034>
  ac22e3:	49 83 a6 b8 00 00 00 	and    QWORD PTR [r14+0xb8],0x0
  ac22ea:	00
```
### ref at `0xac2278`

```text
  ac2225:	49 89 44 24 70       	mov    QWORD PTR [r12+0x70],rax
  ac222a:	bf 30 01 00 00       	mov    edi,0x130
  ac222f:	e8 cc bc d2 00       	call   17edf00 <_Znwm@plt>
  ac2234:	49 89 c6             	mov    r14,rax
  ac2237:	66 0f ef c0          	pxor   xmm0,xmm0
  ac223b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  ac2240:	48 8d 05 b9 ab d4 00 	lea    rax,[rip+0xd4abb9]        # 180ce00 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2ac0>
  ac2247:	48 8d 9c 24 80 01 00 	lea    rbx,[rsp+0x180]
  ac224e:	00
  ac224f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  ac2253:	49 89 06             	mov    QWORD PTR [r14],rax
  ac2256:	48 8d 05 83 5b f1 ff 	lea    rax,[rip+0xfffffffffff15b83]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ac225d:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  ac2261:	48 8d 05 74 39 01 00 	lea    rax,[rip+0x13974]        # ad5bdc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22b7c>
  ac2268:	4c 8d bc 24 40 01 00 	lea    r15,[rsp+0x140]
  ac226f:	00
  ac2270:	49 83 27 00          	and    QWORD PTR [r15],0x0
  ac2274:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  ac2278:	48 8d 05 61 5b f1 ff 	lea    rax,[rip+0xfffffffffff15b61]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ac227f:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  ac2283:	48 8d 05 00 d4 09 00 	lea    rax,[rip+0x9d400]        # b5f68a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac62a>
  ac228a:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  ac228e:	48 8d 05 0b ab d4 00 	lea    rax,[rip+0xd4ab0b]        # 180cda0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2a60>
  ac2295:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  ac2299:	49 8d 7e 20          	lea    rdi,[r14+0x20]
  ac229d:	e8 e2 cd 09 00       	call   b5f084 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac024>
  ac22a2:	49 83 66 48 00       	and    QWORD PTR [r14+0x48],0x0
  ac22a7:	31 c0                	xor    eax,eax
  ac22a9:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
  ac22ad:	41 88 46 58          	mov    BYTE PTR [r14+0x58],al
  ac22b1:	41 83 66 60 00       	and    DWORD PTR [r14+0x60],0x0
  ac22b6:	41 c6 46 64 01       	mov    BYTE PTR [r14+0x64],0x1
  ac22bb:	41 83 66 68 00       	and    DWORD PTR [r14+0x68],0x0
  ac22c0:	41 88 46 6c          	mov    BYTE PTR [r14+0x6c],al
  ac22c4:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
  ac22c8:	49 8d 7e 78          	lea    rdi,[r14+0x78]
  ac22cc:	48 89 de             	mov    rsi,rbx
  ac22cf:	e8 c0 cd 09 00       	call   b5f094 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac034>
  ac22d4:	49 8d be 98 00 00 00 	lea    rdi,[r14+0x98]
  ac22db:	4c 89 fe             	mov    rsi,r15
  ac22de:	e8 b1 cd 09 00       	call   b5f094 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac034>
  ac22e3:	49 83 a6 b8 00 00 00 	and    QWORD PTR [r14+0xb8],0x0
  ac22ea:	00
  ac22eb:	49 83 a6 c8 00 00 00 	and    QWORD PTR [r14+0xc8],0x0
  ac22f2:	00
  ac22f3:	49 8d be d8 00 00 00 	lea    rdi,[r14+0xd8]
  ac22fa:	e8 03 7b d1 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ac22ff:	4c 89 f3             	mov    rbx,r14
  ac2302:	48 83 c3 18          	add    rbx,0x18
  ac2306:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
```
### ref at `0xac2367`

```text
  ac231b:	e8 44 d3 09 00       	call   b5f664 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac604>
  ac2320:	49 89 5c 24 78       	mov    QWORD PTR [r12+0x78],rbx
  ac2325:	4d 89 b4 24 80 00 00 	mov    QWORD PTR [r12+0x80],r14
  ac232c:	00
  ac232d:	4d 8b 64 24 40       	mov    r12,QWORD PTR [r12+0x40]
  ac2332:	6a 40                	push   0x40
  ac2334:	5f                   	pop    rdi
  ac2335:	4c 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],r13
  ac233a:	e8 c1 bb d2 00       	call   17edf00 <_Znwm@plt>
  ac233f:	49 89 c6             	mov    r14,rax
  ac2342:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
  ac2347:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
  ac234e:	00
  ac234f:	4d 89 67 f0          	mov    QWORD PTR [r15-0x10],r12
  ac2353:	4c 89 ff             	mov    rdi,r15
  ac2356:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
  ac235b:	e8 30 7f fb ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ac2360:	48 8d 35 35 81 fb ff 	lea    rsi,[rip+0xfffffffffffb8135]        # a7a49c <JNI_OnUnload@@Base+0x1d69>
  ac2367:	48 8d 15 02 41 01 00 	lea    rdx,[rip+0x14102]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
  ac236e:	48 8d 0d 87 cc 09 00 	lea    rcx,[rip+0x9cc87]        # b5effc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xabf9c>
  ac2375:	4c 8d a4 24 80 01 00 	lea    r12,[rsp+0x180]
  ac237c:	00
  ac237d:	4c 8d 84 24 40 01 00 	lea    r8,[rsp+0x140]
  ac2384:	00
  ac2385:	6a 40                	push   0x40
  ac2387:	41 59                	pop    r9
  ac2389:	4c 89 e7             	mov    rdi,r12
  ac238c:	e8 03 84 d1 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  ac2391:	4d 89 f5             	mov    r13,r14
  ac2394:	49 83 c5 30          	add    r13,0x30
  ac2398:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  ac239b:	48 8d ac 24 10 01 00 	lea    rbp,[rsp+0x110]
  ac23a2:	00
  ac23a3:	48 89 ef             	mov    rdi,rbp
  ac23a6:	48 89 de             	mov    rsi,rbx
  ac23a9:	4c 89 e2             	mov    rdx,r12
  ac23ac:	ff 50 10             	call   QWORD PTR [rax+0x10]
  ac23af:	4c 89 ef             	mov    rdi,r13
  ac23b2:	48 89 ee             	mov    rsi,rbp
  ac23b5:	e8 84 76 d1 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  ac23ba:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
  ac23be:	e8 c3 c0 fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ac23c3:	4c 89 e7             	mov    rdi,r12
  ac23c6:	e8 1d 84 d1 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  ac23cb:	4c 89 ff             	mov    rdi,r15
  ac23ce:	e8 97 7b fb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ac23d3:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
  ac23d8:	4d 89 b4 24 88 00 00 	mov    QWORD PTR [r12+0x88],r14
  ac23df:	00
  ac23e0:	4d 8b 74 24 78       	mov    r14,QWORD PTR [r12+0x78]
```
### ref at `0xad0343`

```text
  ad02f1:	40 88 6b 08          	mov    BYTE PTR [rbx+0x8],bpl
  ad02f5:	bf f8 00 00 00       	mov    edi,0xf8
  ad02fa:	e8 01 dc d1 00       	call   17edf00 <_Znwm@plt>
  ad02ff:	49 89 c7             	mov    r15,rax
  ad0302:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
  ad0309:	00
  ad030a:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
  ad0311:	00 00
  ad0313:	4c 8d ac 24 00 02 00 	lea    r13,[rsp+0x200]
  ad031a:	00
  ad031b:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  ad031f:	41 c6 45 08 01       	mov    BYTE PTR [r13+0x8],0x1
  ad0324:	48 8d 05 91 7d 07 00 	lea    rax,[rip+0x77d91]        # b480bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9505c>
  ad032b:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
  ad032f:	48 8d 0d 8a 0b f4 ff 	lea    rcx,[rip+0xfffffffffff40b8a]        # a10ec0 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEE6setbufEPcl@@Base>
  ad0336:	49 89 4d 18          	mov    QWORD PTR [r13+0x18],rcx
  ad033a:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
  ad0341:	00 00
  ad0343:	48 8d 0d 96 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a96]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad034a:	48 89 8c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rcx
  ad0351:	00
  ad0352:	48 8d 0d 87 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a87]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0359:	48 89 8c 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rcx
  ad0360:	00
  ad0361:	48 83 a4 24 c0 01 00 	and    QWORD PTR [rsp+0x1c0],0x0
  ad0368:	00 00
  ad036a:	48 8d 0d 6f 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a6f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0371:	48 89 8c 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rcx
  ad0378:	00
  ad0379:	48 8d 0d 60 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a60]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0380:	48 89 8c 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],rcx
  ad0387:	00
  ad0388:	48 8d 0d a1 ba d3 00 	lea    rcx,[rip+0xd3baa1]        # 180be30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x1af0>
  ad038f:	49 89 0f             	mov    QWORD PTR [r15],rcx
  ad0392:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
  ad0396:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
  ad039b:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
  ad039f:	4d 8d 67 18          	lea    r12,[r15+0x18]
  ad03a3:	49 83 67 18 00       	and    QWORD PTR [r15+0x18],0x0
  ad03a8:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
  ad03ac:	6a 01                	push   0x1
  ad03ae:	5f                   	pop    rdi
  ad03af:	4c 89 e6             	mov    rsi,r12
  ad03b2:	4c 89 ea             	mov    rdx,r13
  ad03b5:	e8 02 7d 07 00       	call   b480bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9505c>
  ad03ba:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
  ad03be:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
  ad03c2:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
  ad03c7:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
  ad03ce:	00
```
### ref at `0xad0352`

```text
  ad02ff:	49 89 c7             	mov    r15,rax
  ad0302:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
  ad0309:	00
  ad030a:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
  ad0311:	00 00
  ad0313:	4c 8d ac 24 00 02 00 	lea    r13,[rsp+0x200]
  ad031a:	00
  ad031b:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  ad031f:	41 c6 45 08 01       	mov    BYTE PTR [r13+0x8],0x1
  ad0324:	48 8d 05 91 7d 07 00 	lea    rax,[rip+0x77d91]        # b480bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9505c>
  ad032b:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
  ad032f:	48 8d 0d 8a 0b f4 ff 	lea    rcx,[rip+0xfffffffffff40b8a]        # a10ec0 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEE6setbufEPcl@@Base>
  ad0336:	49 89 4d 18          	mov    QWORD PTR [r13+0x18],rcx
  ad033a:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
  ad0341:	00 00
  ad0343:	48 8d 0d 96 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a96]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad034a:	48 89 8c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rcx
  ad0351:	00
  ad0352:	48 8d 0d 87 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a87]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0359:	48 89 8c 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rcx
  ad0360:	00
  ad0361:	48 83 a4 24 c0 01 00 	and    QWORD PTR [rsp+0x1c0],0x0
  ad0368:	00 00
  ad036a:	48 8d 0d 6f 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a6f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0371:	48 89 8c 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rcx
  ad0378:	00
  ad0379:	48 8d 0d 60 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a60]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0380:	48 89 8c 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],rcx
  ad0387:	00
  ad0388:	48 8d 0d a1 ba d3 00 	lea    rcx,[rip+0xd3baa1]        # 180be30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x1af0>
  ad038f:	49 89 0f             	mov    QWORD PTR [r15],rcx
  ad0392:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
  ad0396:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
  ad039b:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
  ad039f:	4d 8d 67 18          	lea    r12,[r15+0x18]
  ad03a3:	49 83 67 18 00       	and    QWORD PTR [r15+0x18],0x0
  ad03a8:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
  ad03ac:	6a 01                	push   0x1
  ad03ae:	5f                   	pop    rdi
  ad03af:	4c 89 e6             	mov    rsi,r12
  ad03b2:	4c 89 ea             	mov    rdx,r13
  ad03b5:	e8 02 7d 07 00       	call   b480bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9505c>
  ad03ba:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
  ad03be:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
  ad03c2:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
  ad03c7:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
  ad03ce:	00
  ad03cf:	4d 8d 6f 38          	lea    r13,[r15+0x38]
  ad03d3:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
  ad03d8:	49 83 67 48 00       	and    QWORD PTR [r15+0x48],0x0
```
### ref at `0xad036a`

```text
  ad0313:	4c 8d ac 24 00 02 00 	lea    r13,[rsp+0x200]
  ad031a:	00
  ad031b:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  ad031f:	41 c6 45 08 01       	mov    BYTE PTR [r13+0x8],0x1
  ad0324:	48 8d 05 91 7d 07 00 	lea    rax,[rip+0x77d91]        # b480bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9505c>
  ad032b:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
  ad032f:	48 8d 0d 8a 0b f4 ff 	lea    rcx,[rip+0xfffffffffff40b8a]        # a10ec0 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEE6setbufEPcl@@Base>
  ad0336:	49 89 4d 18          	mov    QWORD PTR [r13+0x18],rcx
  ad033a:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
  ad0341:	00 00
  ad0343:	48 8d 0d 96 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a96]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad034a:	48 89 8c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rcx
  ad0351:	00
  ad0352:	48 8d 0d 87 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a87]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0359:	48 89 8c 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rcx
  ad0360:	00
  ad0361:	48 83 a4 24 c0 01 00 	and    QWORD PTR [rsp+0x1c0],0x0
  ad0368:	00 00
  ad036a:	48 8d 0d 6f 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a6f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0371:	48 89 8c 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rcx
  ad0378:	00
  ad0379:	48 8d 0d 60 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a60]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0380:	48 89 8c 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],rcx
  ad0387:	00
  ad0388:	48 8d 0d a1 ba d3 00 	lea    rcx,[rip+0xd3baa1]        # 180be30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x1af0>
  ad038f:	49 89 0f             	mov    QWORD PTR [r15],rcx
  ad0392:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
  ad0396:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
  ad039b:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
  ad039f:	4d 8d 67 18          	lea    r12,[r15+0x18]
  ad03a3:	49 83 67 18 00       	and    QWORD PTR [r15+0x18],0x0
  ad03a8:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
  ad03ac:	6a 01                	push   0x1
  ad03ae:	5f                   	pop    rdi
  ad03af:	4c 89 e6             	mov    rsi,r12
  ad03b2:	4c 89 ea             	mov    rdx,r13
  ad03b5:	e8 02 7d 07 00       	call   b480bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9505c>
  ad03ba:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
  ad03be:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
  ad03c2:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
  ad03c7:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
  ad03ce:	00
  ad03cf:	4d 8d 6f 38          	lea    r13,[r15+0x38]
  ad03d3:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
  ad03d8:	49 83 67 48 00       	and    QWORD PTR [r15+0x48],0x0
  ad03dd:	48 85 c0             	test   rax,rax
  ad03e0:	74 29                	je     ad040b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3ab>
  ad03e2:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
  ad03e6:	6a 01                	push   0x1
  ad03e8:	5f                   	pop    rdi
```
### ref at `0xad0379`

```text
  ad031f:	41 c6 45 08 01       	mov    BYTE PTR [r13+0x8],0x1
  ad0324:	48 8d 05 91 7d 07 00 	lea    rax,[rip+0x77d91]        # b480bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9505c>
  ad032b:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
  ad032f:	48 8d 0d 8a 0b f4 ff 	lea    rcx,[rip+0xfffffffffff40b8a]        # a10ec0 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEE6setbufEPcl@@Base>
  ad0336:	49 89 4d 18          	mov    QWORD PTR [r13+0x18],rcx
  ad033a:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
  ad0341:	00 00
  ad0343:	48 8d 0d 96 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a96]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad034a:	48 89 8c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rcx
  ad0351:	00
  ad0352:	48 8d 0d 87 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a87]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0359:	48 89 8c 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rcx
  ad0360:	00
  ad0361:	48 83 a4 24 c0 01 00 	and    QWORD PTR [rsp+0x1c0],0x0
  ad0368:	00 00
  ad036a:	48 8d 0d 6f 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a6f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0371:	48 89 8c 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rcx
  ad0378:	00
  ad0379:	48 8d 0d 60 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a60]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ad0380:	48 89 8c 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],rcx
  ad0387:	00
  ad0388:	48 8d 0d a1 ba d3 00 	lea    rcx,[rip+0xd3baa1]        # 180be30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x1af0>
  ad038f:	49 89 0f             	mov    QWORD PTR [r15],rcx
  ad0392:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
  ad0396:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
  ad039b:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
  ad039f:	4d 8d 67 18          	lea    r12,[r15+0x18]
  ad03a3:	49 83 67 18 00       	and    QWORD PTR [r15+0x18],0x0
  ad03a8:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
  ad03ac:	6a 01                	push   0x1
  ad03ae:	5f                   	pop    rdi
  ad03af:	4c 89 e6             	mov    rsi,r12
  ad03b2:	4c 89 ea             	mov    rdx,r13
  ad03b5:	e8 02 7d 07 00       	call   b480bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9505c>
  ad03ba:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
  ad03be:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
  ad03c2:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
  ad03c7:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
  ad03ce:	00
  ad03cf:	4d 8d 6f 38          	lea    r13,[r15+0x38]
  ad03d3:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
  ad03d8:	49 83 67 48 00       	and    QWORD PTR [r15+0x48],0x0
  ad03dd:	48 85 c0             	test   rax,rax
  ad03e0:	74 29                	je     ad040b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3ab>
  ad03e2:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
  ad03e6:	6a 01                	push   0x1
  ad03e8:	5f                   	pop    rdi
  ad03e9:	48 8d 94 24 e0 01 00 	lea    rdx,[rsp+0x1e0]
  ad03f0:	00
  ad03f1:	4c 89 ee             	mov    rsi,r13
```
### ref at `0xad6470`

```text
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
```
### ref at `0xad647a`

```text
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
```
### ref at `0xadee9c`

```text
  adee52:	4c 89 f6             	mov    rsi,r14
  adee55:	48 89 ea             	mov    rdx,rbp
  adee58:	4c 89 e9             	mov    rcx,r13
  adee5b:	ff 50 10             	call   QWORD PTR [rax+0x10]
  adee5e:	4c 89 ef             	mov    rdi,r13
  adee61:	e8 e8 00 00 00       	call   adef4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2beee>
  adee66:	4c 89 e7             	mov    rdi,r12
  adee69:	e8 fc b0 f9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  adee6e:	48 89 ef             	mov    rdi,rbp
  adee71:	e8 aa ab c5 00       	call   1739a20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedb8c>
  adee76:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  adee7b:	4c 89 fe             	mov    rsi,r15
  adee7e:	e8 0f 02 00 00       	call   adf092 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c032>
  adee83:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
  adee88:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
  adee8d:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  adee91:	48 8d 05 5c fa fc ff 	lea    rax,[rip+0xfffffffffffcfa5c]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  adee98:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  adee9c:	48 8d 05 3d 8f ef ff 	lea    rax,[rip+0xffffffffffef8f3d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  adeea3:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  adeea7:	48 89 df             	mov    rdi,rbx
  adeeaa:	4c 89 f6             	mov    rsi,r14
  adeead:	e8 04 fb b6 00       	call   164e9b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b22>
  adeeb2:	4c 89 f7             	mov    rdi,r14
  adeeb5:	e8 e4 83 fc ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  adeeba:	31 ff                	xor    edi,edi
  adeebc:	e8 c5 f5 fb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  adeec1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  adeec6:	e8 bb f5 fb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  adeecb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  adeed2:	00 00
  adeed4:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
  adeedb:	00
  adeedc:	75 60                	jne    adef3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bede>
  adeede:	48 89 d8             	mov    rax,rbx
  adeee1:	48 81 c4 98 00 00 00 	add    rsp,0x98
  adeee8:	5b                   	pop    rbx
  adeee9:	41 5c                	pop    r12
  adeeeb:	41 5d                	pop    r13
  adeeed:	41 5e                	pop    r14
  adeeef:	41 5f                	pop    r15
  adeef1:	5d                   	pop    rbp
  adeef2:	c3                   	ret
  adeef3:	48 89 c3             	mov    rbx,rax
  adeef6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  adeefb:	e8 86 f5 fb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  adef00:	eb 21                	jmp    adef23 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bec3>
  adef02:	48 89 c3             	mov    rbx,rax
  adef05:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  adef0a:	e8 3f 00 00 00       	call   adef4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2beee>
```
### ref at `0xb32f8b`

```text
  b32f47:	49 89 07             	mov    QWORD PTR [r15],rax
  b32f4a:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
  b32f4f:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
  b32f53:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  b32f56:	49 89 e6             	mov    r14,rsp
  b32f59:	4c 89 f7             	mov    rdi,r14
  b32f5c:	4c 89 fa             	mov    rdx,r15
  b32f5f:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b32f62:	4c 89 ff             	mov    rdi,r15
  b32f65:	e8 00 70 f4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b32f6a:	31 ff                	xor    edi,edi
  b32f6c:	e8 15 b5 f6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b32f71:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
  b32f75:	0f 57 c9             	xorps  xmm1,xmm1
  b32f78:	41 0f 29 0e          	movaps XMMWORD PTR [r14],xmm1
  b32f7c:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  b32f80:	48 8d 05 6d b9 f7 ff 	lea    rax,[rip+0xfffffffffff7b96d]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  b32f87:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  b32f8b:	48 8d 05 4e 4e ea ff 	lea    rax,[rip+0xffffffffffea4e4e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b32f92:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  b32f96:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
  b32f9b:	48 89 df             	mov    rdi,rbx
  b32f9e:	4c 89 fe             	mov    rsi,r15
  b32fa1:	e8 e8 e7 aa 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  b32fa6:	4c 89 ff             	mov    rdi,r15
  b32fa9:	e8 f0 42 f7 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b32fae:	31 ff                	xor    edi,edi
  b32fb0:	e8 d1 b4 f6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b32fb5:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  b32fb9:	e8 c8 b4 f6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b32fbe:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b32fc5:	00 00
  b32fc7:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
  b32fcc:	75 0d                	jne    b32fdb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7ff7b>
  b32fce:	48 89 d8             	mov    rax,rbx
  b32fd1:	48 83 c4 50          	add    rsp,0x50
  b32fd5:	5b                   	pop    rbx
  b32fd6:	41 5e                	pop    r14
  b32fd8:	41 5f                	pop    r15
  b32fda:	c3                   	ret
  b32fdb:	e8 d0 ca cb 00       	call   17efab0 <__stack_chk_fail@plt>
  b32fe0:	48 8d 05 e1 69 cd 00 	lea    rax,[rip+0xcd69e1]        # 18099c8 <_ZTIN4asio22service_already_existsE@@Base+0xb1b0>
  b32fe7:	48 89 07             	mov    QWORD PTR [rdi],rax
  b32fea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  b32fee:	e9 93 b4 f6 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  b32ff3:	cc                   	int3
  b32ff4:	53                   	push   rbx
  b32ff5:	48 89 fb             	mov    rbx,rdi
  b32ff8:	e8 e3 ff ff ff       	call   b32fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7ff80>
  b32ffd:	48 89 df             	mov    rdi,rbx
```
### ref at `0xb3e88b`

```text
  b3e853:	31 ff                	xor    edi,edi
  b3e855:	48 89 de             	mov    rsi,rbx
  b3e858:	31 d2                	xor    edx,edx
  b3e85a:	ff d0                	call   rax
  b3e85c:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  b3e861:	5b                   	pop    rbx
  b3e862:	c3                   	ret
  b3e863:	48 89 c7             	mov    rdi,rax
  b3e866:	e8 3a b2 f3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b3e86b:	cc                   	int3
  b3e86c:	48 83 ec 28          	sub    rsp,0x28
  b3e870:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b3e877:	00 00
  b3e879:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  b3e87e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b3e881:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  b3e884:	48 89 e6             	mov    rsi,rsp
  b3e887:	48 83 26 00          	and    QWORD PTR [rsi],0x0
  b3e88b:	48 8d 05 4e 95 e9 ff 	lea    rax,[rip+0xffffffffffe9954e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b3e892:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  b3e896:	48 8d 05 43 95 e9 ff 	lea    rax,[rip+0xffffffffffe99543]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b3e89d:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
  b3e8a1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b3e8a4:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b3e8a7:	48 89 e7             	mov    rdi,rsp
  b3e8aa:	e8 f5 f2 ff ff       	call   b3dba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8ab44>
  b3e8af:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b3e8b6:	00 00
  b3e8b8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  b3e8bd:	75 05                	jne    b3e8c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b864>
  b3e8bf:	48 83 c4 28          	add    rsp,0x28
  b3e8c3:	c3                   	ret
  b3e8c4:	e8 e7 11 cb 00       	call   17efab0 <__stack_chk_fail@plt>
  b3e8c9:	48 89 c7             	mov    rdi,rax
  b3e8cc:	e8 d4 b1 f3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b3e8d1:	48 8d 05 80 dd da 00 	lea    rax,[rip+0xdadd80]        # 18ec658 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x33a68>
  b3e8d8:	48 39 c6             	cmp    rsi,rax
  b3e8db:	75 09                	jne    b3e8e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b886>
  b3e8dd:	83 ff 01             	cmp    edi,0x1
  b3e8e0:	75 04                	jne    b3e8e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b886>
  b3e8e2:	6a 01                	push   0x1
  b3e8e4:	eb 1a                	jmp    b3e900 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b8a0>
  b3e8e6:	48 39 c6             	cmp    rsi,rax
  b3e8e9:	75 09                	jne    b3e8f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b894>
  b3e8eb:	83 ff 02             	cmp    edi,0x2
  b3e8ee:	75 04                	jne    b3e8f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b894>
  b3e8f0:	6a 02                	push   0x2
  b3e8f2:	eb 0c                	jmp    b3e900 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b8a0>
  b3e8f4:	48 39 c6             	cmp    rsi,rax
  b3e8f7:	75 09                	jne    b3e902 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b8a2>
```
### ref at `0xb3e896`

```text
  b3e858:	31 d2                	xor    edx,edx
  b3e85a:	ff d0                	call   rax
  b3e85c:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  b3e861:	5b                   	pop    rbx
  b3e862:	c3                   	ret
  b3e863:	48 89 c7             	mov    rdi,rax
  b3e866:	e8 3a b2 f3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b3e86b:	cc                   	int3
  b3e86c:	48 83 ec 28          	sub    rsp,0x28
  b3e870:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b3e877:	00 00
  b3e879:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  b3e87e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b3e881:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  b3e884:	48 89 e6             	mov    rsi,rsp
  b3e887:	48 83 26 00          	and    QWORD PTR [rsi],0x0
  b3e88b:	48 8d 05 4e 95 e9 ff 	lea    rax,[rip+0xffffffffffe9954e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b3e892:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  b3e896:	48 8d 05 43 95 e9 ff 	lea    rax,[rip+0xffffffffffe99543]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b3e89d:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
  b3e8a1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b3e8a4:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b3e8a7:	48 89 e7             	mov    rdi,rsp
  b3e8aa:	e8 f5 f2 ff ff       	call   b3dba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8ab44>
  b3e8af:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b3e8b6:	00 00
  b3e8b8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  b3e8bd:	75 05                	jne    b3e8c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b864>
  b3e8bf:	48 83 c4 28          	add    rsp,0x28
  b3e8c3:	c3                   	ret
  b3e8c4:	e8 e7 11 cb 00       	call   17efab0 <__stack_chk_fail@plt>
  b3e8c9:	48 89 c7             	mov    rdi,rax
  b3e8cc:	e8 d4 b1 f3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b3e8d1:	48 8d 05 80 dd da 00 	lea    rax,[rip+0xdadd80]        # 18ec658 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x33a68>
  b3e8d8:	48 39 c6             	cmp    rsi,rax
  b3e8db:	75 09                	jne    b3e8e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b886>
  b3e8dd:	83 ff 01             	cmp    edi,0x1
  b3e8e0:	75 04                	jne    b3e8e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b886>
  b3e8e2:	6a 01                	push   0x1
  b3e8e4:	eb 1a                	jmp    b3e900 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b8a0>
  b3e8e6:	48 39 c6             	cmp    rsi,rax
  b3e8e9:	75 09                	jne    b3e8f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b894>
  b3e8eb:	83 ff 02             	cmp    edi,0x2
  b3e8ee:	75 04                	jne    b3e8f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b894>
  b3e8f0:	6a 02                	push   0x2
  b3e8f2:	eb 0c                	jmp    b3e900 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b8a0>
  b3e8f4:	48 39 c6             	cmp    rsi,rax
  b3e8f7:	75 09                	jne    b3e902 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b8a2>
  b3e8f9:	83 ff 03             	cmp    edi,0x3
  b3e8fc:	75 04                	jne    b3e902 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b8a2>
```
### ref at `0xb42652`

```text
  b42607:	31 ff                	xor    edi,edi
  b42609:	e8 78 be f5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b4260e:	4d 8b 76 28          	mov    r14,QWORD PTR [r14+0x28]
  b42612:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
  b42617:	4c 89 e7             	mov    rdi,r12
  b4261a:	4c 89 fe             	mov    rsi,r15
  b4261d:	e8 96 08 00 00       	call   b42eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8fe58>
  b42622:	48 89 e7             	mov    rdi,rsp
  b42625:	4c 89 f6             	mov    rsi,r14
  b42628:	4c 89 e2             	mov    rdx,r12
  b4262b:	e8 d0 08 00 00       	call   b42f00 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8fea0>
  b42630:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  b42635:	e8 3a fe f9 ff       	call   ae2474 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f414>
  b4263a:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  b4263e:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
  b42643:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  b42647:	48 8d 05 a6 c2 f6 ff 	lea    rax,[rip+0xfffffffffff6c2a6]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  b4264e:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  b42652:	48 8d 05 87 57 e9 ff 	lea    rax,[rip+0xffffffffffe95787]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b42659:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  b4265d:	48 89 df             	mov    rdi,rbx
  b42660:	4c 89 f6             	mov    rsi,r14
  b42663:	e8 26 f1 a9 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  b42668:	4c 89 f7             	mov    rdi,r14
  b4266b:	e8 2e 4c f6 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b42670:	31 ff                	xor    edi,edi
  b42672:	e8 0f be f5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b42677:	31 ff                	xor    edi,edi
  b42679:	e8 08 be f5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b4267e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  b42683:	e8 ec fd f9 ff       	call   ae2474 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f414>
  b42688:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b4268f:	00 00
  b42691:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
  b42696:	75 0f                	jne    b426a7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8f647>
  b42698:	48 89 d8             	mov    rax,rbx
  b4269b:	48 83 c4 78          	add    rsp,0x78
  b4269f:	5b                   	pop    rbx
  b426a0:	41 5c                	pop    r12
  b426a2:	41 5e                	pop    r14
  b426a4:	41 5f                	pop    r15
  b426a6:	c3                   	ret
  b426a7:	e8 04 d4 ca 00       	call   17efab0 <__stack_chk_fail@plt>
  b426ac:	48 89 c7             	mov    rdi,rax
  b426af:	e8 f1 73 f3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b426b4:	55                   	push   rbp
  b426b5:	41 57                	push   r15
  b426b7:	41 56                	push   r14
  b426b9:	41 55                	push   r13
  b426bb:	41 54                	push   r12
```
### ref at `0xb637f5`

```text
  b637aa:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  b637af:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
  b637b6:	00
  b637b7:	e8 72 0c 00 00       	call   b6442e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13ce>
  b637bc:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
  b637c1:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  b637c7:	6a 28                	push   0x28
  b637c9:	5f                   	pop    rdi
  b637ca:	e8 31 a7 c8 00       	call   17edf00 <_Znwm@plt>
  b637cf:	49 89 c6             	mov    r14,rax
  b637d2:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
  b637d7:	48 89 c7             	mov    rdi,rax
  b637da:	4c 89 fe             	mov    rsi,r15
  b637dd:	e8 4c 0c 00 00       	call   b6442e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13ce>
  b637e2:	49 89 e4             	mov    r12,rsp
  b637e5:	4d 89 34 24          	mov    QWORD PTR [r12],r14
  b637e9:	48 8d 05 56 0c 00 00 	lea    rax,[rip+0xc56]        # b64446 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13e6>
  b637f0:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  b637f5:	48 8d 05 e4 45 e7 ff 	lea    rax,[rip+0xffffffffffe745e4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b637fc:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  b63801:	48 89 df             	mov    rdi,rbx
  b63804:	4c 89 e6             	mov    rsi,r12
  b63807:	e8 82 df a7 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  b6380c:	4c 89 e7             	mov    rdi,r12
  b6380f:	e8 8a 3a f4 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b63814:	4c 89 ff             	mov    rdi,r15
  b63817:	e8 54 0c 00 00       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
  b6381c:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b63823:	00
  b63824:	e8 47 0c 00 00       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
  b63829:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  b63830:	00
  b63831:	e8 f8 1a b6 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  b63836:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b6383d:	00 00
  b6383f:	48 3b 84 24 70 01 00 	cmp    rax,QWORD PTR [rsp+0x170]
  b63846:	00
  b63847:	75 12                	jne    b6385b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb07fb>
  b63849:	48 89 d8             	mov    rax,rbx
  b6384c:	48 81 c4 78 01 00 00 	add    rsp,0x178
  b63853:	5b                   	pop    rbx
  b63854:	41 5c                	pop    r12
  b63856:	41 5e                	pop    r14
  b63858:	41 5f                	pop    r15
  b6385a:	c3                   	ret
  b6385b:	e8 50 c2 c8 00       	call   17efab0 <__stack_chk_fail@plt>
  b63860:	48 89 c3             	mov    rbx,rax
  b63863:	48 89 e7             	mov    rdi,rsp
  b63866:	e8 33 3a f4 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b6386b:	eb 03                	jmp    b63870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0810>
```
### ref at `0xb63b4b`

```text
  b63aff:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  b63b04:	48 8d b4 24 28 01 00 	lea    rsi,[rsp+0x128]
  b63b0b:	00
  b63b0c:	e8 1d 09 00 00       	call   b6442e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13ce>
  b63b11:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
  b63b17:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
  b63b1d:	6a 28                	push   0x28
  b63b1f:	5f                   	pop    rdi
  b63b20:	e8 db a3 c8 00       	call   17edf00 <_Znwm@plt>
  b63b25:	48 89 c3             	mov    rbx,rax
  b63b28:	4c 8d 74 24 68       	lea    r14,[rsp+0x68]
  b63b2d:	48 89 c7             	mov    rdi,rax
  b63b30:	4c 89 f6             	mov    rsi,r14
  b63b33:	e8 f6 08 00 00       	call   b6442e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13ce>
  b63b38:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
  b63b3d:	49 89 1f             	mov    QWORD PTR [r15],rbx
  b63b40:	48 8d 05 ff 08 00 00 	lea    rax,[rip+0x8ff]        # b64446 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13e6>
  b63b47:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  b63b4b:	48 8d 05 8e 42 e7 ff 	lea    rax,[rip+0xffffffffffe7428e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b63b52:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  b63b56:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
  b63b5a:	48 89 df             	mov    rdi,rbx
  b63b5d:	4c 89 fe             	mov    rsi,r15
  b63b60:	e8 29 dc a7 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  b63b65:	4c 89 ff             	mov    rdi,r15
  b63b68:	e8 31 37 f4 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b63b6d:	4c 89 f7             	mov    rdi,r14
  b63b70:	e8 fb 08 00 00       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
  b63b75:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
  b63b7c:	00
  b63b7d:	e8 ee 08 00 00       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
  b63b82:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
  b63b89:	00
  b63b8a:	e8 77 0d 00 00       	call   b64906 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb18a6>
  b63b8f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  b63b94:	e8 8f 7b f1 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
  b63b99:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b63ba0:	00 00
  b63ba2:	48 3b 84 24 d0 01 00 	cmp    rax,QWORD PTR [rsp+0x1d0]
  b63ba9:	00
  b63baa:	75 15                	jne    b63bc1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0b61>
  b63bac:	48 89 d8             	mov    rax,rbx
  b63baf:	48 81 c4 d8 01 00 00 	add    rsp,0x1d8
  b63bb6:	5b                   	pop    rbx
  b63bb7:	41 5c                	pop    r12
  b63bb9:	41 5d                	pop    r13
  b63bbb:	41 5e                	pop    r14
  b63bbd:	41 5f                	pop    r15
  b63bbf:	5d                   	pop    rbp
  b63bc0:	c3                   	ret
```
### ref at `0xb63d70`

```text
  b63d25:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  b63d2a:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  b63d31:	00
  b63d32:	e8 f7 06 00 00       	call   b6442e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13ce>
  b63d37:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
  b63d3c:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  b63d42:	6a 28                	push   0x28
  b63d44:	5f                   	pop    rdi
  b63d45:	e8 b6 a1 c8 00       	call   17edf00 <_Znwm@plt>
  b63d4a:	49 89 c6             	mov    r14,rax
  b63d4d:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
  b63d52:	48 89 c7             	mov    rdi,rax
  b63d55:	4c 89 fe             	mov    rsi,r15
  b63d58:	e8 d1 06 00 00       	call   b6442e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13ce>
  b63d5d:	49 89 e4             	mov    r12,rsp
  b63d60:	4d 89 34 24          	mov    QWORD PTR [r12],r14
  b63d64:	48 8d 05 db 06 00 00 	lea    rax,[rip+0x6db]        # b64446 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13e6>
  b63d6b:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  b63d70:	48 8d 05 69 40 e7 ff 	lea    rax,[rip+0xffffffffffe74069]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b63d77:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  b63d7c:	48 89 df             	mov    rdi,rbx
  b63d7f:	4c 89 e6             	mov    rsi,r12
  b63d82:	e8 07 da a7 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  b63d87:	4c 89 e7             	mov    rdi,r12
  b63d8a:	e8 0f 35 f4 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b63d8f:	4c 89 ff             	mov    rdi,r15
  b63d92:	e8 d9 06 00 00       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
  b63d97:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  b63d9e:	00
  b63d9f:	e8 cc 06 00 00       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
  b63da4:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b63dab:	00
  b63dac:	e8 7d 15 b6 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  b63db1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b63db8:	00 00
  b63dba:	48 3b 84 24 70 01 00 	cmp    rax,QWORD PTR [rsp+0x170]
  b63dc1:	00
  b63dc2:	75 15                	jne    b63dd9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0d79>
  b63dc4:	48 89 d8             	mov    rax,rbx
  b63dc7:	48 81 c4 78 01 00 00 	add    rsp,0x178
  b63dce:	5b                   	pop    rbx
  b63dcf:	41 5c                	pop    r12
  b63dd1:	41 5d                	pop    r13
  b63dd3:	41 5e                	pop    r14
  b63dd5:	41 5f                	pop    r15
  b63dd7:	5d                   	pop    rbp
  b63dd8:	c3                   	ret
  b63dd9:	e8 d2 bc c8 00       	call   17efab0 <__stack_chk_fail@plt>
  b63dde:	48 89 c3             	mov    rbx,rax
  b63de1:	48 89 e7             	mov    rdi,rsp
```
### ref at `0xb6401e`

```text
  b63fd5:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
  b63fdc:	00
  b63fdd:	e8 4c 04 00 00       	call   b6442e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13ce>
  b63fe2:	49 83 26 00          	and    QWORD PTR [r14],0x0
  b63fe6:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  b63feb:	6a 28                	push   0x28
  b63fed:	5f                   	pop    rdi
  b63fee:	e8 0d 9f c8 00       	call   17edf00 <_Znwm@plt>
  b63ff3:	49 89 c6             	mov    r14,rax
  b63ff6:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
  b63ffb:	48 89 c7             	mov    rdi,rax
  b63ffe:	4c 89 fe             	mov    rsi,r15
  b64001:	e8 28 04 00 00       	call   b6442e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13ce>
  b64006:	4c 8d a4 24 98 00 00 	lea    r12,[rsp+0x98]
  b6400d:	00
  b6400e:	4d 89 34 24          	mov    QWORD PTR [r12],r14
  b64012:	48 8d 05 2d 04 00 00 	lea    rax,[rip+0x42d]        # b64446 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb13e6>
  b64019:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  b6401e:	48 8d 05 bb 3d e7 ff 	lea    rax,[rip+0xffffffffffe73dbb]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  b64025:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  b6402a:	48 89 df             	mov    rdi,rbx
  b6402d:	4c 89 e6             	mov    rsi,r12
  b64030:	e8 59 d7 a7 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  b64035:	4c 89 e7             	mov    rdi,r12
  b64038:	e8 61 32 f4 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b6403d:	4c 89 ff             	mov    rdi,r15
  b64040:	e8 2b 04 00 00       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
  b64045:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
  b6404c:	00
  b6404d:	e8 1e 04 00 00       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
  b64052:	48 89 e7             	mov    rdi,rsp
  b64055:	e8 36 9e c8 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b6405a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  b6405f:	e8 2c 9e c8 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b64064:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
  b6406b:	00
  b6406c:	e8 bd 12 b6 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  b64071:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b64078:	00 00
  b6407a:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
  b64081:	00
  b64082:	75 15                	jne    b64099 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1039>
  b64084:	48 89 d8             	mov    rax,rbx
  b64087:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
  b6408e:	5b                   	pop    rbx
  b6408f:	41 5c                	pop    r12
  b64091:	41 5d                	pop    r13
  b64093:	41 5e                	pop    r14
  b64095:	41 5f                	pop    r15
  b64097:	5d                   	pop    rbp
```
### ref at `0xc11aa1`

```text
  c11a58:	49 89 ce             	mov    r14,rcx
  c11a5b:	49 89 d7             	mov    r15,rdx
  c11a5e:	49 89 f4             	mov    r12,rsi
  c11a61:	48 89 fb             	mov    rbx,rdi
  c11a64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c11a6b:	00 00
  c11a6d:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  c11a74:	00
  c11a75:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
  c11a79:	e8 8f 00 00 00       	call   c11b0d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15eaad>
  c11a7e:	41 89 06             	mov    DWORD PTR [r14],eax
  c11a81:	4d 8b 64 24 08       	mov    r12,QWORD PTR [r12+0x8]
  c11a86:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
  c11a8b:	4d 89 66 f0          	mov    QWORD PTR [r14-0x10],r12
  c11a8f:	4c 89 f7             	mov    rdi,r14
  c11a92:	4c 89 fe             	mov    rsi,r15
  c11a95:	e8 f6 87 e6 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  c11a9a:	48 8d 35 fb 89 e6 ff 	lea    rsi,[rip+0xffffffffffe689fb]        # a7a49c <JNI_OnUnload@@Base+0x1d69>
  c11aa1:	48 8d 15 c8 49 ec ff 	lea    rdx,[rip+0xffffffffffec49c8]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
  c11aa8:	48 8d 0d d1 00 00 00 	lea    rcx,[rip+0xd1]        # c11b80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15eb20>
  c11aaf:	49 89 e7             	mov    r15,rsp
  c11ab2:	4c 8d 44 24 40       	lea    r8,[rsp+0x40]
  c11ab7:	6a 40                	push   0x40
  c11ab9:	41 59                	pop    r9
  c11abb:	4c 89 ff             	mov    rdi,r15
  c11abe:	e8 d1 8c bc 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  c11ac3:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
  c11ac7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  c11aca:	48 89 df             	mov    rdi,rbx
  c11acd:	4c 89 fa             	mov    rdx,r15
  c11ad0:	ff 50 10             	call   QWORD PTR [rax+0x10]
  c11ad3:	4c 89 ff             	mov    rdi,r15
  c11ad6:	e8 0d 8d bc 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  c11adb:	4c 89 f7             	mov    rdi,r14
  c11ade:	e8 87 84 e6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  c11ae3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c11aea:	00 00
  c11aec:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  c11af3:	00
  c11af4:	75 12                	jne    c11b08 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15eaa8>
  c11af6:	48 89 d8             	mov    rax,rbx
  c11af9:	48 81 c4 88 00 00 00 	add    rsp,0x88
  c11b00:	5b                   	pop    rbx
  c11b01:	41 5c                	pop    r12
  c11b03:	41 5e                	pop    r14
  c11b05:	41 5f                	pop    r15
  c11b07:	c3                   	ret
  c11b08:	e8 a3 df bd 00       	call   17efab0 <__stack_chk_fail@plt>
  c11b0d:	55                   	push   rbp
  c11b0e:	41 56                	push   r14
```
### ref at `0xc46aea`

```text
  c46a9e:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
  c46aa3:	48 8d 54 24 48       	lea    rdx,[rsp+0x48]
  c46aa8:	4c 89 e7             	mov    rdi,r12
  c46aab:	ff 50 10             	call   QWORD PTR [rax+0x10]
  c46aae:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  c46ab3:	e8 b2 34 e3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  c46ab8:	31 ff                	xor    edi,edi
  c46aba:	e8 f3 79 e5 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  c46abf:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  c46ac4:	e8 c7 73 ba 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c46ac9:	4d 85 ff             	test   r15,r15
  c46acc:	74 05                	je     c46ad3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193a73>
  c46ace:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  c46ad3:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
  c46ad8:	49 89 1e             	mov    QWORD PTR [r14],rbx
  c46adb:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
  c46adf:	48 8d 05 0e 7e e6 ff 	lea    rax,[rip+0xffffffffffe67e0e]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  c46ae6:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  c46aea:	48 8d 05 ef 12 d9 ff 	lea    rax,[rip+0xffffffffffd912ef]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  c46af1:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  c46af5:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
  c46afa:	48 89 df             	mov    rdi,rbx
  c46afd:	4c 89 f6             	mov    rsi,r14
  c46b00:	e8 89 ac 99 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  c46b05:	4c 89 f7             	mov    rdi,r14
  c46b08:	e8 91 07 e6 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  c46b0d:	31 ff                	xor    edi,edi
  c46b0f:	e8 72 79 e5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c46b14:	4c 89 ff             	mov    rdi,r15
  c46b17:	e8 6a 79 e5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c46b1c:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  c46b21:	e8 6a 73 ba 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c46b26:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c46b2d:	00 00
  c46b2f:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
  c46b36:	00
  c46b37:	75 21                	jne    c46b5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193afa>
  c46b39:	48 89 d8             	mov    rax,rbx
  c46b3c:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
  c46b43:	5b                   	pop    rbx
  c46b44:	41 5c                	pop    r12
  c46b46:	41 5d                	pop    r13
  c46b48:	41 5e                	pop    r14
  c46b4a:	41 5f                	pop    r15
  c46b4c:	5d                   	pop    rbp
  c46b4d:	c3                   	ret
  c46b4e:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
  c46b52:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
  c46b55:	e9 6e fd ff ff       	jmp    c468c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193868>
  c46b5a:	e8 51 8f ba 00       	call   17efab0 <__stack_chk_fail@plt>
```
### ref at `0xc4f8ae`

```text
  c4f85e:	e8 8f 89 f1 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
  c4f863:	4c 89 e7             	mov    rdi,r12
  c4f866:	e8 bb 12 e5 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
  c4f86b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  c4f870:	e8 c7 89 f1 ff       	call   b6823c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb51dc>
  c4f875:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  c4f87a:	e8 a7 12 e5 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
  c4f87f:	eb 0e                	jmp    c4f88f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19c82f>
  c4f881:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
  c4f885:	e8 52 04 00 00       	call   c4fcdc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cc7c>
  c4f88a:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
  c4f88f:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
  c4f894:	4c 8d b4 24 98 00 00 	lea    r14,[rsp+0x98]
  c4f89b:	00
  c4f89c:	49 89 1e             	mov    QWORD PTR [r14],rbx
  c4f89f:	4d 89 6e 08          	mov    QWORD PTR [r14+0x8],r13
  c4f8a3:	48 8d 05 4a f0 e5 ff 	lea    rax,[rip+0xffffffffffe5f04a]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  c4f8aa:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  c4f8ae:	48 8d 05 2b 85 d8 ff 	lea    rax,[rip+0xffffffffffd8852b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  c4f8b5:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  c4f8b9:	48 8b 5c 24 38       	mov    rbx,QWORD PTR [rsp+0x38]
  c4f8be:	48 89 df             	mov    rdi,rbx
  c4f8c1:	4c 89 f6             	mov    rsi,r14
  c4f8c4:	e8 c5 1e 99 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  c4f8c9:	4c 89 f7             	mov    rdi,r14
  c4f8cc:	e8 cd 79 e5 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  c4f8d1:	31 ff                	xor    edi,edi
  c4f8d3:	e8 ae eb e4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c4f8d8:	4c 89 ef             	mov    rdi,r13
  c4f8db:	e8 a6 eb e4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c4f8e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c4f8e7:	00 00
  c4f8e9:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
  c4f8f0:	00
  c4f8f1:	75 15                	jne    c4f908 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19c8a8>
  c4f8f3:	48 89 d8             	mov    rax,rbx
  c4f8f6:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
  c4f8fd:	5b                   	pop    rbx
  c4f8fe:	41 5c                	pop    r12
  c4f900:	41 5d                	pop    r13
  c4f902:	41 5e                	pop    r14
  c4f904:	41 5f                	pop    r15
  c4f906:	5d                   	pop    rbp
  c4f907:	c3                   	ret
  c4f908:	e8 a3 01 ba 00       	call   17efab0 <__stack_chk_fail@plt>
  c4f90d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  c4f912:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
  c4f917:	e8 6a eb e4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c4f91c:	eb 07                	jmp    c4f925 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19c8c5>
  c4f91e:	eb 00                	jmp    c4f920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19c8c0>
```
### ref at `0xc64cc7`

```text
  c64c7b:	48 89 84 24 f0 05 00 	mov    QWORD PTR [rsp+0x5f0],rax
  c64c82:	00
  c64c83:	48 01 97 30 05 00 00 	add    QWORD PTR [rdi+0x530],rdx
  c64c8a:	80 bf 38 05 00 00 00 	cmp    BYTE PTR [rdi+0x538],0x0
  c64c91:	0f 95 c0             	setne  al
  c64c94:	08 c8                	or     al,cl
  c64c96:	88 87 38 05 00 00    	mov    BYTE PTR [rdi+0x538],al
  c64c9c:	0f b6 0e             	movzx  ecx,BYTE PTR [rsi]
  c64c9f:	48 8d 46 01          	lea    rax,[rsi+0x1]
  c64ca3:	89 ca                	mov    edx,ecx
  c64ca5:	d1 ea                	shr    edx,1
  c64ca7:	f6 c1 01             	test   cl,0x1
  c64caa:	48 0f 45 46 10       	cmovne rax,QWORD PTR [rsi+0x10]
  c64caf:	48 0f 45 56 08       	cmovne rdx,QWORD PTR [rsi+0x8]
  c64cb4:	48 8d 8c 24 b0 01 00 	lea    rcx,[rsp+0x1b0]
  c64cbb:	00
  c64cbc:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  c64cc0:	48 8d b7 10 01 00 00 	lea    rsi,[rdi+0x110]
  c64cc7:	48 8d 3d 12 31 d7 ff 	lea    rdi,[rip+0xffffffffffd73112]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  c64cce:	48 89 79 10          	mov    QWORD PTR [rcx+0x10],rdi
  c64cd2:	48 8d 3d 65 0b 00 00 	lea    rdi,[rip+0xb65]        # c6583e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b27de>
  c64cd9:	48 89 79 18          	mov    QWORD PTR [rcx+0x18],rdi
  c64cdd:	4c 8d 84 24 90 01 00 	lea    r8,[rsp+0x190]
  c64ce4:	00
  c64ce5:	49 89 30             	mov    QWORD PTR [r8],rsi
  c64ce8:	48 8d 35 75 77 e1 ff 	lea    rsi,[rip+0xffffffffffe17775]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  c64cef:	49 89 70 10          	mov    QWORD PTR [r8+0x10],rsi
  c64cf3:	48 8d 35 70 0b 00 00 	lea    rsi,[rip+0xb70]        # c6586a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b280a>
  c64cfa:	49 89 70 18          	mov    QWORD PTR [r8+0x18],rsi
  c64cfe:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
  c64d05:	00
  c64d06:	48 89 c6             	mov    rsi,rax
  c64d09:	e8 99 53 58 00       	call   11ea0a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f62b>
  c64d0e:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
  c64d15:	00
  c64d16:	e8 af 0b 00 00       	call   c658ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b286a>
  c64d1b:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
  c64d22:	00
  c64d23:	e8 04 2a fa ff       	call   c0772c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1546cc>
  c64d28:	80 bc 24 f8 04 00 00 	cmp    BYTE PTR [rsp+0x4f8],0x0
  c64d2f:	00
  c64d30:	74 14                	je     c64d46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b1ce6>
  c64d32:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  c64d37:	48 8d b4 24 d0 03 00 	lea    rsi,[rsp+0x3d0]
  c64d3e:	00
  c64d3f:	e8 ac 0b 00 00       	call   c658f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b2890>
  c64d44:	eb 0d                	jmp    c64d53 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b1cf3>
  c64d46:	31 c0                	xor    eax,eax
  c64d48:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
  c64d4c:	88 84 24 88 01 00 00 	mov    BYTE PTR [rsp+0x188],al
```
### ref at `0xc84978`

```text
  c8492b:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
  c84930:	44 8b 44 24 04       	mov    r8d,DWORD PTR [rsp+0x4]
  c84935:	4d 89 e9             	mov    r9,r13
  c84938:	ff 50 10             	call   QWORD PTR [rax+0x10]
  c8493b:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
  c84940:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  c84945:	e8 20 56 df ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  c8494a:	31 ff                	xor    edi,edi
  c8494c:	e8 35 9b e1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c84951:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
  c84956:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
  c8495b:	48 85 c0             	test   rax,rax
  c8495e:	74 05                	je     c84965 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d1905>
  c84960:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  c84965:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
  c8496a:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
  c8496d:	48 8d 05 80 9f e2 ff 	lea    rax,[rip+0xffffffffffe29f80]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  c84974:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  c84978:	48 8d 05 61 34 d5 ff 	lea    rax,[rip+0xffffffffffd53461]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  c8497f:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  c84983:	4c 89 f7             	mov    rdi,r14
  c84986:	48 89 de             	mov    rsi,rbx
  c84989:	e8 00 ce 95 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  c8498e:	48 89 df             	mov    rdi,rbx
  c84991:	e8 08 29 e2 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  c84996:	31 ff                	xor    edi,edi
  c84998:	e8 e9 9a e1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c8499d:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  c849a2:	e8 df 9a e1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c849a7:	e9 a7 00 00 00       	jmp    c84a53 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d19f3>
  c849ac:	49 83 c8 01          	or     r8,0x1
  c849b0:	48 8d 35 c5 d5 7c ff 	lea    rsi,[rip+0xffffffffff7cd5c5]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  c849b7:	48 8d 0d da 82 6e ff 	lea    rcx,[rip+0xffffffffff6e82da]        # 36cc98 <_ZTSSt12bad_any_cast@@Base-0x23530>
  c849be:	6a 02                	push   0x2
  c849c0:	5f                   	pop    rdi
  c849c1:	ba b2 01 00 00       	mov    edx,0x1b2
  c849c6:	eb 2e                	jmp    c849f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d1996>
  c849c8:	4d 8b 47 18          	mov    r8,QWORD PTR [r15+0x18]
  c849cc:	49 83 e0 fc          	and    r8,0xfffffffffffffffc
  c849d0:	41 f6 00 01          	test   BYTE PTR [r8],0x1
  c849d4:	74 06                	je     c849dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d197c>
  c849d6:	4d 8b 40 10          	mov    r8,QWORD PTR [r8+0x10]
  c849da:	eb 04                	jmp    c849e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d1980>
  c849dc:	49 83 c8 01          	or     r8,0x1
  c849e0:	48 8d 35 95 d5 7c ff 	lea    rsi,[rip+0xffffffffff7cd595]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  c849e7:	48 8d 0d 33 ac 6c ff 	lea    rcx,[rip+0xffffffffff6cac33]        # 34f621 <_ZTSSt12bad_any_cast@@Base-0x40ba7>
  c849ee:	6a 02                	push   0x2
  c849f0:	5f                   	pop    rdi
  c849f1:	ba c4 01 00 00       	mov    edx,0x1c4
  c849f6:	31 c0                	xor    eax,eax
```
### ref at `0xcad1e9`

```text
  cad19e:	4c 3b 74 24 18       	cmp    r14,QWORD PTR [rsp+0x18]
  cad1a3:	75 8b                	jne    cad130 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fa0d0>
  cad1a5:	bf c0 00 00 00       	mov    edi,0xc0
  cad1aa:	e8 51 0d b4 00       	call   17edf00 <_Znwm@plt>
  cad1af:	49 89 c6             	mov    r14,rax
  cad1b2:	0f 57 c0             	xorps  xmm0,xmm0
  cad1b5:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  cad1b9:	48 8d 05 40 13 b7 00 	lea    rax,[rip+0xb71340]        # 181e500 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x141c0>
  cad1c0:	49 89 06             	mov    QWORD PTR [r14],rax
  cad1c3:	4d 8d 6e 18          	lea    r13,[r14+0x18]
  cad1c7:	48 8d 9c 24 a8 00 00 	lea    rbx,[rsp+0xa8]
  cad1ce:	00
  cad1cf:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  cad1d4:	48 89 df             	mov    rdi,rbx
  cad1d7:	e8 60 1e e9 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  cad1dc:	4c 8d a4 24 88 00 00 	lea    r12,[rsp+0x88]
  cad1e3:	00
  cad1e4:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
  cad1e9:	48 8d 05 f0 ab d2 ff 	lea    rax,[rip+0xffffffffffd2abf0]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  cad1f0:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  cad1f5:	48 8d 05 e4 ab d2 ff 	lea    rax,[rip+0xffffffffffd2abe4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  cad1fc:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  cad201:	4c 89 ef             	mov    rdi,r13
  cad204:	48 89 de             	mov    rsi,rbx
  cad207:	e8 30 1e e9 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  cad20c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  cad211:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
  cad215:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  cad21a:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
  cad21e:	8a 04 24             	mov    al,BYTE PTR [rsp]
  cad221:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
  cad225:	4d 8d 7e 58          	lea    r15,[r14+0x58]
  cad229:	4c 89 ff             	mov    rdi,r15
  cad22c:	4c 89 e6             	mov    rsi,r12
  cad22f:	e8 16 23 eb ff       	call   b5f54a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4ea>
  cad234:	41 c6 46 78 00       	mov    BYTE PTR [r14+0x78],0x0
  cad239:	49 8d be a8 00 00 00 	lea    rdi,[r14+0xa8]
  cad240:	0f 57 c0             	xorps  xmm0,xmm0
  cad243:	41 0f 11 86 80 00 00 	movups XMMWORD PTR [r14+0x80],xmm0
  cad24a:	00
  cad24b:	41 0f 11 86 90 00 00 	movups XMMWORD PTR [r14+0x90],xmm0
  cad252:	00
  cad253:	49 83 a6 a0 00 00 00 	and    QWORD PTR [r14+0xa0],0x0
  cad25a:	00
  cad25b:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
  cad260:	e8 e1 ac eb ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>
  cad265:	0f 57 c0             	xorps  xmm0,xmm0
  cad268:	41 0f 11 86 b0 00 00 	movups XMMWORD PTR [r14+0xb0],xmm0
  cad26f:	00
  cad270:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
```
### ref at `0xcad1f5`

```text
  cad1a5:	bf c0 00 00 00       	mov    edi,0xc0
  cad1aa:	e8 51 0d b4 00       	call   17edf00 <_Znwm@plt>
  cad1af:	49 89 c6             	mov    r14,rax
  cad1b2:	0f 57 c0             	xorps  xmm0,xmm0
  cad1b5:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  cad1b9:	48 8d 05 40 13 b7 00 	lea    rax,[rip+0xb71340]        # 181e500 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x141c0>
  cad1c0:	49 89 06             	mov    QWORD PTR [r14],rax
  cad1c3:	4d 8d 6e 18          	lea    r13,[r14+0x18]
  cad1c7:	48 8d 9c 24 a8 00 00 	lea    rbx,[rsp+0xa8]
  cad1ce:	00
  cad1cf:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  cad1d4:	48 89 df             	mov    rdi,rbx
  cad1d7:	e8 60 1e e9 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  cad1dc:	4c 8d a4 24 88 00 00 	lea    r12,[rsp+0x88]
  cad1e3:	00
  cad1e4:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
  cad1e9:	48 8d 05 f0 ab d2 ff 	lea    rax,[rip+0xffffffffffd2abf0]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  cad1f0:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  cad1f5:	48 8d 05 e4 ab d2 ff 	lea    rax,[rip+0xffffffffffd2abe4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  cad1fc:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  cad201:	4c 89 ef             	mov    rdi,r13
  cad204:	48 89 de             	mov    rsi,rbx
  cad207:	e8 30 1e e9 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  cad20c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  cad211:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
  cad215:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  cad21a:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
  cad21e:	8a 04 24             	mov    al,BYTE PTR [rsp]
  cad221:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
  cad225:	4d 8d 7e 58          	lea    r15,[r14+0x58]
  cad229:	4c 89 ff             	mov    rdi,r15
  cad22c:	4c 89 e6             	mov    rsi,r12
  cad22f:	e8 16 23 eb ff       	call   b5f54a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4ea>
  cad234:	41 c6 46 78 00       	mov    BYTE PTR [r14+0x78],0x0
  cad239:	49 8d be a8 00 00 00 	lea    rdi,[r14+0xa8]
  cad240:	0f 57 c0             	xorps  xmm0,xmm0
  cad243:	41 0f 11 86 80 00 00 	movups XMMWORD PTR [r14+0x80],xmm0
  cad24a:	00
  cad24b:	41 0f 11 86 90 00 00 	movups XMMWORD PTR [r14+0x90],xmm0
  cad252:	00
  cad253:	49 83 a6 a0 00 00 00 	and    QWORD PTR [r14+0xa0],0x0
  cad25a:	00
  cad25b:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
  cad260:	e8 e1 ac eb ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>
  cad265:	0f 57 c0             	xorps  xmm0,xmm0
  cad268:	41 0f 11 86 b0 00 00 	movups XMMWORD PTR [r14+0xb0],xmm0
  cad26f:	00
  cad270:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  cad277:	00
  cad278:	e8 1d 3f df ff       	call   aa119a <JNI_OnUnload@@Base+0x28a67>
```
### ref at `0xcb18bc`

```text
  cb186a:	ff e0                	jmp    rax
  cb186c:	41 56                	push   r14
  cb186e:	53                   	push   rbx
  cb186f:	48 83 ec 38          	sub    rsp,0x38
  cb1873:	48 89 fb             	mov    rbx,rdi
  cb1876:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  cb187d:	00 00
  cb187f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  cb1884:	48 81 c7 e0 00 00 00 	add    rdi,0xe0
  cb188b:	e8 14 03 00 00       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
  cb1890:	48 8d bb d0 00 00 00 	lea    rdi,[rbx+0xd0]
  cb1897:	e8 8a d0 df ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
  cb189c:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
  cb18a3:	e8 90 00 b1 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
  cb18a8:	48 8b bb 88 00 00 00 	mov    rdi,QWORD PTR [rbx+0x88]
  cb18af:	48 89 de             	mov    rsi,rbx
  cb18b2:	e8 29 03 00 00       	call   cb1be0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb80>
  cb18b7:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
  cb18bc:	48 8d 0d 1d 65 d2 ff 	lea    rcx,[rip+0xffffffffffd2651d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  cb18c3:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
  cb18c8:	48 8d 15 11 65 d2 ff 	lea    rdx,[rip+0xffffffffffd26511]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  cb18cf:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
  cb18d4:	48 8b 83 c0 00 00 00 	mov    rax,QWORD PTR [rbx+0xc0]
  cb18db:	48 85 c0             	test   rax,rax
  cb18de:	74 41                	je     cb1921 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe8c1>
  cb18e0:	4c 8d b3 b0 00 00 00 	lea    r14,[rbx+0xb0]
  cb18e7:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
  cb18ed:	6a 01                	push   0x1
  cb18ef:	5f                   	pop    rdi
  cb18f0:	48 89 e6             	mov    rsi,rsp
  cb18f3:	4c 89 f2             	mov    rdx,r14
  cb18f6:	ff d0                	call   rax
  cb18f8:	6a 01                	push   0x1
  cb18fa:	5f                   	pop    rdi
  cb18fb:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
  cb1900:	4c 89 f6             	mov    rsi,r14
  cb1903:	ff 54 24 10          	call   QWORD PTR [rsp+0x10]
  cb1907:	0f 10 83 c0 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xc0]
  cb190e:	0f 10 4c 24 10       	movups xmm1,XMMWORD PTR [rsp+0x10]
  cb1913:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
  cb1918:	0f 11 8b c0 00 00 00 	movups XMMWORD PTR [rbx+0xc0],xmm1
  cb191f:	eb 14                	jmp    cb1935 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe8d5>
  cb1921:	48 89 8b c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],rcx
  cb1928:	48 89 93 c8 00 00 00 	mov    QWORD PTR [rbx+0xc8],rdx
  cb192f:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  cb1935:	48 89 e7             	mov    rdi,rsp
  cb1938:	e8 d7 e3 ff ff       	call   cafd14 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fccb4>
  cb193d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  cb1944:	00 00
  cb1946:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
```
### ref at `0xcb18c8`

```text
  cb186e:	53                   	push   rbx
  cb186f:	48 83 ec 38          	sub    rsp,0x38
  cb1873:	48 89 fb             	mov    rbx,rdi
  cb1876:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  cb187d:	00 00
  cb187f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  cb1884:	48 81 c7 e0 00 00 00 	add    rdi,0xe0
  cb188b:	e8 14 03 00 00       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
  cb1890:	48 8d bb d0 00 00 00 	lea    rdi,[rbx+0xd0]
  cb1897:	e8 8a d0 df ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
  cb189c:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
  cb18a3:	e8 90 00 b1 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
  cb18a8:	48 8b bb 88 00 00 00 	mov    rdi,QWORD PTR [rbx+0x88]
  cb18af:	48 89 de             	mov    rsi,rbx
  cb18b2:	e8 29 03 00 00       	call   cb1be0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb80>
  cb18b7:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
  cb18bc:	48 8d 0d 1d 65 d2 ff 	lea    rcx,[rip+0xffffffffffd2651d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  cb18c3:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
  cb18c8:	48 8d 15 11 65 d2 ff 	lea    rdx,[rip+0xffffffffffd26511]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  cb18cf:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
  cb18d4:	48 8b 83 c0 00 00 00 	mov    rax,QWORD PTR [rbx+0xc0]
  cb18db:	48 85 c0             	test   rax,rax
  cb18de:	74 41                	je     cb1921 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe8c1>
  cb18e0:	4c 8d b3 b0 00 00 00 	lea    r14,[rbx+0xb0]
  cb18e7:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
  cb18ed:	6a 01                	push   0x1
  cb18ef:	5f                   	pop    rdi
  cb18f0:	48 89 e6             	mov    rsi,rsp
  cb18f3:	4c 89 f2             	mov    rdx,r14
  cb18f6:	ff d0                	call   rax
  cb18f8:	6a 01                	push   0x1
  cb18fa:	5f                   	pop    rdi
  cb18fb:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
  cb1900:	4c 89 f6             	mov    rsi,r14
  cb1903:	ff 54 24 10          	call   QWORD PTR [rsp+0x10]
  cb1907:	0f 10 83 c0 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xc0]
  cb190e:	0f 10 4c 24 10       	movups xmm1,XMMWORD PTR [rsp+0x10]
  cb1913:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
  cb1918:	0f 11 8b c0 00 00 00 	movups XMMWORD PTR [rbx+0xc0],xmm1
  cb191f:	eb 14                	jmp    cb1935 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe8d5>
  cb1921:	48 89 8b c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],rcx
  cb1928:	48 89 93 c8 00 00 00 	mov    QWORD PTR [rbx+0xc8],rdx
  cb192f:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  cb1935:	48 89 e7             	mov    rdi,rsp
  cb1938:	e8 d7 e3 ff ff       	call   cafd14 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fccb4>
  cb193d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  cb1944:	00 00
  cb1946:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
  cb194b:	75 08                	jne    cb1955 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe8f5>
  cb194d:	48 83 c4 38          	add    rsp,0x38
```
### ref at `0xcb54cc`

```text
  cb5482:	ff 50 10             	call   QWORD PTR [rax+0x10]
  cb5485:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
  cb548c:	00
  cb548d:	e8 48 fb ff ff       	call   cb4fda <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x201f7a>
  cb5492:	31 ff                	xor    edi,edi
  cb5494:	e8 ed 8f de ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  cb5499:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  cb549e:	e8 0d 02 00 00       	call   cb56b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x202650>
  cb54a3:	0f 28 84 24 b0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xb0]
  cb54aa:	00
  cb54ab:	0f 57 c9             	xorps  xmm1,xmm1
  cb54ae:	0f 29 8c 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm1
  cb54b5:	00
  cb54b6:	48 8d 9c 24 70 01 00 	lea    rbx,[rsp+0x170]
  cb54bd:	00
  cb54be:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
  cb54c1:	48 8d 05 2c 94 df ff 	lea    rax,[rip+0xffffffffffdf942c]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  cb54c8:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  cb54cc:	48 8d 05 0d 29 d2 ff 	lea    rax,[rip+0xffffffffffd2290d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  cb54d3:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  cb54d7:	4c 89 f7             	mov    rdi,r14
  cb54da:	48 89 de             	mov    rsi,rbx
  cb54dd:	e8 ac c2 92 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  cb54e2:	48 89 df             	mov    rdi,rbx
  cb54e5:	e8 b4 1d df ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  cb54ea:	31 ff                	xor    edi,edi
  cb54ec:	e8 95 8f de ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  cb54f1:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
  cb54f8:	00
  cb54f9:	e8 88 8f de ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  cb54fe:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  cb5505:	00
  cb5506:	e8 a5 01 00 00       	call   cb56b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x202650>
  cb550b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  cb5512:	00 00
  cb5514:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
  cb551b:	00
  cb551c:	75 45                	jne    cb5563 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x202503>
  cb551e:	4c 89 f0             	mov    rax,r14
  cb5521:	48 81 c4 a8 01 00 00 	add    rsp,0x1a8
  cb5528:	5b                   	pop    rbx
  cb5529:	41 5c                	pop    r12
  cb552b:	41 5d                	pop    r13
  cb552d:	41 5e                	pop    r14
  cb552f:	41 5f                	pop    r15
  cb5531:	5d                   	pop    rbp
  cb5532:	c3                   	ret
  cb5533:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  cb553a:	00 00
  cb553c:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
```
### ref at `0xd1a32e`

```text
  d1a2e7:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
  d1a2ea:	4d 85 ff             	test   r15,r15
  d1a2ed:	0f 84 d0 00 00 00    	je     d1a3c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267363>
  d1a2f3:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
  d1a2f8:	48 85 db             	test   rbx,rbx
  d1a2fb:	74 05                	je     d1a302 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2672a2>
  d1a2fd:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  d1a302:	49 8b 07             	mov    rax,QWORD PTR [r15]
  d1a305:	4c 89 ff             	mov    rdi,r15
  d1a308:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
  d1a30e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  d1a311:	48 3b 48 08          	cmp    rcx,QWORD PTR [rax+0x8]
  d1a315:	0f 84 9e 00 00 00    	je     d1a3b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267359>
  d1a31b:	48 85 db             	test   rbx,rbx
  d1a31e:	74 05                	je     d1a325 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2672c5>
  d1a320:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  d1a325:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  d1a32a:	48 83 26 00          	and    QWORD PTR [rsi],0x0
  d1a32e:	48 8d 05 ab da cb ff 	lea    rax,[rip+0xffffffffffcbdaab]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  d1a335:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  d1a339:	48 8d 05 72 45 00 00 	lea    rax,[rip+0x4572]        # d1e8b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26b852>
  d1a340:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
  d1a344:	49 8b 07             	mov    rax,QWORD PTR [r15]
  d1a347:	4c 89 ff             	mov    rdi,r15
  d1a34a:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
  d1a350:	66 48 0f 6e c3       	movq   xmm0,rbx
  d1a355:	66 49 0f 6e cf       	movq   xmm1,r15
  d1a35a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  d1a35e:	66 0f 7f 0c 24       	movdqa XMMWORD PTR [rsp],xmm1
  d1a363:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
  d1a368:	4c 89 ff             	mov    rdi,r15
  d1a36b:	e8 1a be ff ff       	call   d1618a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26312a>
  d1a370:	48 89 df             	mov    rdi,rbx
  d1a373:	e8 0e 41 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  d1a378:	41 c6 86 12 04 00 00 	mov    BYTE PTR [r14+0x412],0x1
  d1a37f:	01
  d1a380:	49 8b 86 b0 01 00 00 	mov    rax,QWORD PTR [r14+0x1b0]
  d1a387:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  d1a38b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  d1a38f:	48 85 db             	test   rbx,rbx
  d1a392:	74 05                	je     d1a399 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267339>
  d1a394:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  d1a399:	48 8b 00             	mov    rax,QWORD PTR [rax]
  d1a39c:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
  d1a3a3:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  d1a3a8:	31 d2                	xor    edx,edx
  d1a3aa:	e8 b1 32 92 00       	call   163d660 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387ce>
  d1a3af:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  d1a3b4:	e8 cd 40 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  d1a3b9:	48 89 df             	mov    rdi,rbx
```
### ref at `0xd512dd`

```text
  d5128f:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
  d51294:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  d51299:	4c 89 ff             	mov    rdi,r15
  d5129c:	ff 50 70             	call   QWORD PTR [rax+0x70]
  d5129f:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
  d512a4:	4c 89 ff             	mov    rdi,r15
  d512a7:	e8 e4 cb a9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d512ac:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  d512b0:	49 83 67 08 00       	and    QWORD PTR [r15+0x8],0x0
  d512b5:	41 83 67 10 00       	and    DWORD PTR [r15+0x10],0x0
  d512ba:	48 8d 05 77 7a b5 00 	lea    rax,[rip+0xb57a77]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
  d512c1:	49 89 07             	mov    QWORD PTR [r15],rax
  d512c4:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
  d512c9:	4c 89 f6             	mov    rsi,r14
  d512cc:	e8 8b 05 89 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
  d512d1:	4c 89 f7             	mov    rdi,r14
  d512d4:	e8 47 87 9e 00       	call   1739a20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedb8c>
  d512d9:	49 83 26 00          	and    QWORD PTR [r14],0x0
  d512dd:	48 8d 05 fc 6a c8 ff 	lea    rax,[rip+0xffffffffffc86afc]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  d512e4:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  d512e8:	48 8d 05 f1 6a c8 ff 	lea    rax,[rip+0xffffffffffc86af1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  d512ef:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  d512f3:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
  d512f8:	48 89 df             	mov    rdi,rbx
  d512fb:	4c 89 f6             	mov    rsi,r14
  d512fe:	e8 8b 04 89 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  d51303:	4c 89 f7             	mov    rdi,r14
  d51306:	e8 93 5f d5 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  d5130b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  d51310:	e8 3d 58 f2 ff       	call   c76b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c3af2>
  d51315:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  d5131a:	e8 0f 40 97 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  d5131f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d51326:	00 00
  d51328:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
  d5132f:	00
  d51330:	75 15                	jne    d51347 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3cd>
  d51332:	48 89 d8             	mov    rax,rbx
  d51335:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
  d5133c:	5b                   	pop    rbx
  d5133d:	41 5c                	pop    r12
  d5133f:	41 5d                	pop    r13
  d51341:	41 5e                	pop    r14
  d51343:	41 5f                	pop    r15
  d51345:	5d                   	pop    rbp
  d51346:	c3                   	ret
  d51347:	e8 64 e7 a9 00       	call   17efab0 <__stack_chk_fail@plt>
  d5134c:	eb 00                	jmp    d5134e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3d4>
  d5134e:	48 89 c7             	mov    rdi,rax
  d51351:	e8 4f 87 d2 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
```
### ref at `0xd512e8`

```text
  d51299:	4c 89 ff             	mov    rdi,r15
  d5129c:	ff 50 70             	call   QWORD PTR [rax+0x70]
  d5129f:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
  d512a4:	4c 89 ff             	mov    rdi,r15
  d512a7:	e8 e4 cb a9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d512ac:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  d512b0:	49 83 67 08 00       	and    QWORD PTR [r15+0x8],0x0
  d512b5:	41 83 67 10 00       	and    DWORD PTR [r15+0x10],0x0
  d512ba:	48 8d 05 77 7a b5 00 	lea    rax,[rip+0xb57a77]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
  d512c1:	49 89 07             	mov    QWORD PTR [r15],rax
  d512c4:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
  d512c9:	4c 89 f6             	mov    rsi,r14
  d512cc:	e8 8b 05 89 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
  d512d1:	4c 89 f7             	mov    rdi,r14
  d512d4:	e8 47 87 9e 00       	call   1739a20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedb8c>
  d512d9:	49 83 26 00          	and    QWORD PTR [r14],0x0
  d512dd:	48 8d 05 fc 6a c8 ff 	lea    rax,[rip+0xffffffffffc86afc]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  d512e4:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  d512e8:	48 8d 05 f1 6a c8 ff 	lea    rax,[rip+0xffffffffffc86af1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  d512ef:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  d512f3:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
  d512f8:	48 89 df             	mov    rdi,rbx
  d512fb:	4c 89 f6             	mov    rsi,r14
  d512fe:	e8 8b 04 89 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  d51303:	4c 89 f7             	mov    rdi,r14
  d51306:	e8 93 5f d5 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  d5130b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  d51310:	e8 3d 58 f2 ff       	call   c76b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c3af2>
  d51315:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  d5131a:	e8 0f 40 97 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  d5131f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d51326:	00 00
  d51328:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
  d5132f:	00
  d51330:	75 15                	jne    d51347 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3cd>
  d51332:	48 89 d8             	mov    rax,rbx
  d51335:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
  d5133c:	5b                   	pop    rbx
  d5133d:	41 5c                	pop    r12
  d5133f:	41 5d                	pop    r13
  d51341:	41 5e                	pop    r14
  d51343:	41 5f                	pop    r15
  d51345:	5d                   	pop    rbp
  d51346:	c3                   	ret
  d51347:	e8 64 e7 a9 00       	call   17efab0 <__stack_chk_fail@plt>
  d5134c:	eb 00                	jmp    d5134e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3d4>
  d5134e:	48 89 c7             	mov    rdi,rax
  d51351:	e8 4f 87 d2 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  d51356:	55                   	push   rbp
  d51357:	41 57                	push   r15
```
### ref at `0xdb5642`

```text
  db55f9:	00
  db55fa:	48 89 c7             	mov    rdi,rax
  db55fd:	4c 89 e6             	mov    rsi,r12
  db5600:	e8 dd 22 00 00       	call   db78e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84968>
  db5605:	4c 8d ac 24 d8 00 00 	lea    r13,[rsp+0xd8]
  db560c:	00
  db560d:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
  db5611:	48 8d 05 f8 22 00 00 	lea    rax,[rip+0x22f8]        # db7910 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84996>
  db5618:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
  db561c:	48 8d 05 17 23 00 00 	lea    rax,[rip+0x2317]        # db793a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x849c0>
  db5623:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
  db5627:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  db562c:	4c 89 ff             	mov    rdi,r15
  db562f:	4c 89 ea             	mov    rdx,r13
  db5632:	e8 51 be a0 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
  db5637:	4c 89 ef             	mov    rdi,r13
  db563a:	e8 5f 1c cf ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  db563f:	4c 89 e7             	mov    rdi,r12
  db5642:	e8 29 0e d2 ff       	call   ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
  db5647:	48 89 df             	mov    rdi,rbx
  db564a:	e8 1b 49 cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  db564f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  db5656:	00 00
  db5658:	48 3b 84 24 f8 00 00 	cmp    rax,QWORD PTR [rsp+0xf8]
  db565f:	00
  db5660:	75 11                	jne    db5673 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x826f9>
  db5662:	48 81 c4 00 01 00 00 	add    rsp,0x100
  db5669:	5b                   	pop    rbx
  db566a:	41 5c                	pop    r12
  db566c:	41 5d                	pop    r13
  db566e:	41 5e                	pop    r14
  db5670:	41 5f                	pop    r15
  db5672:	c3                   	ret
  db5673:	e8 38 a4 a3 00       	call   17efab0 <__stack_chk_fail@plt>
  db5678:	48 89 c3             	mov    rbx,rax
  db567b:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  db5682:	00
  db5683:	e8 16 1c cf ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  db5688:	48 89 df             	mov    rdi,rbx
  db568b:	e8 15 44 cc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  db5690:	53                   	push   rbx
  db5691:	48 83 ec 50          	sub    rsp,0x50
  db5695:	48 89 fb             	mov    rbx,rdi
  db5698:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  db569f:	00 00
  db56a1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  db56a6:	48 8b bf f8 08 00 00 	mov    rdi,QWORD PTR [rdi+0x8f8]
  db56ad:	e8 fa c2 a0 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
  db56b2:	84 c0                	test   al,al
  db56b4:	75 5d                	jne    db5713 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82799>
```
### ref at `0xdb7925`

```text
  db78f2:	48 83 c7 10          	add    rdi,0x10
  db78f6:	48 83 c6 10          	add    rsi,0x10
  db78fa:	e8 2d 01 00 00       	call   db7a2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84ab2>
  db78ff:	0f 28 43 40          	movaps xmm0,XMMWORD PTR [rbx+0x40]
  db7903:	41 0f 29 46 40       	movaps XMMWORD PTR [r14+0x40],xmm0
  db7908:	48 83 c4 08          	add    rsp,0x8
  db790c:	5b                   	pop    rbx
  db790d:	41 5e                	pop    r14
  db790f:	c3                   	ret
  db7910:	83 ff 01             	cmp    edi,0x1
  db7913:	74 1e                	je     db7933 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x849b9>
  db7915:	85 ff                	test   edi,edi
  db7917:	75 20                	jne    db7939 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x849bf>
  db7919:	53                   	push   rbx
  db791a:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
  db791d:	48 85 db             	test   rbx,rbx
  db7920:	74 08                	je     db792a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x849b0>
  db7922:	48 89 df             	mov    rdi,rbx
  db7925:	e8 46 eb d1 ff       	call   ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
  db792a:	48 89 df             	mov    rdi,rbx
  db792d:	5b                   	pop    rbx
  db792e:	e9 ed 65 a3 00       	jmp    17edf20 <_ZdlPv@plt>
  db7933:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  db7936:	48 89 06             	mov    QWORD PTR [rsi],rax
  db7939:	c3                   	ret
  db793a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  db793d:	e9 00 00 00 00       	jmp    db7942 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x849c8>
  db7942:	48 83 ec 38          	sub    rsp,0x38
  db7946:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  db794d:	00 00
  db794f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  db7954:	48 8b 17             	mov    rdx,QWORD PTR [rdi]
  db7957:	0f 57 c0             	xorps  xmm0,xmm0
  db795a:	8b 4f 08             	mov    ecx,DWORD PTR [rdi+0x8]
  db795d:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  db7962:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
  db7966:	4c 8d 4f 40          	lea    r9,[rdi+0x40]
  db796a:	0f 28 4c 24 20       	movaps xmm1,XMMWORD PTR [rsp+0x20]
  db796f:	0f 11 0c 24          	movups XMMWORD PTR [rsp],xmm1
  db7973:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
  db7978:	6a 01                	push   0x1
  db797a:	41 58                	pop    r8
  db797c:	48 89 c7             	mov    rdi,rax
  db797f:	31 f6                	xor    esi,esi
  db7981:	e8 22 00 00 00       	call   db79a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a2e>
  db7986:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  db798d:	00 00
  db798f:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
  db7994:	75 05                	jne    db799b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a21>
  db7996:	48 83 c4 38          	add    rsp,0x38
```
### ref at `0xdc3596`

```text
  dc3556:	c3                   	ret
  dc3557:	48 89 c7             	mov    rdi,rax
  dc355a:	e8 46 65 cb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  dc355f:	cc                   	int3
  dc3560:	53                   	push   rbx
  dc3561:	48 83 ec 50          	sub    rsp,0x50
  dc3565:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  dc356c:	00 00
  dc356e:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  dc3573:	0f b6 0e             	movzx  ecx,BYTE PTR [rsi]
  dc3576:	48 8d 46 01          	lea    rax,[rsi+0x1]
  dc357a:	41 89 c9             	mov    r9d,ecx
  dc357d:	41 d1 e9             	shr    r9d,1
  dc3580:	f6 c1 01             	test   cl,0x1
  dc3583:	48 0f 45 46 10       	cmovne rax,QWORD PTR [rsi+0x10]
  dc3588:	4c 0f 45 4e 08       	cmovne r9,QWORD PTR [rsi+0x8]
  dc358d:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
  dc3592:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  dc3596:	48 8d 35 43 48 c1 ff 	lea    rsi,[rip+0xffffffffffc14843]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  dc359d:	48 89 71 10          	mov    QWORD PTR [rcx+0x10],rsi
  dc35a1:	48 8d 35 96 22 ea ff 	lea    rsi,[rip+0xffffffffffea2296]        # c6583e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b27de>
  dc35a8:	48 89 71 18          	mov    QWORD PTR [rcx+0x18],rsi
  dc35ac:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
  dc35b1:	49 89 10             	mov    QWORD PTR [r8],rdx
  dc35b4:	48 8d 15 a9 8e cb ff 	lea    rdx,[rip+0xffffffffffcb8ea9]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  dc35bb:	49 89 50 10          	mov    QWORD PTR [r8+0x10],rdx
  dc35bf:	48 8d 15 a4 22 ea ff 	lea    rdx,[rip+0xffffffffffea22a4]        # c6586a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b280a>
  dc35c6:	49 89 50 18          	mov    QWORD PTR [r8+0x18],rdx
  dc35ca:	48 89 c6             	mov    rsi,rax
  dc35cd:	4c 89 ca             	mov    rdx,r9
  dc35d0:	e8 d2 6a 42 00       	call   11ea0a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f62b>
  dc35d5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  dc35da:	e8 eb 22 ea ff       	call   c658ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b286a>
  dc35df:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  dc35e4:	e8 43 41 e4 ff       	call   c0772c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1546cc>
  dc35e9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  dc35f0:	00 00
  dc35f2:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
  dc35f7:	75 35                	jne    dc362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906b4>
  dc35f9:	48 83 c4 50          	add    rsp,0x50
  dc35fd:	5b                   	pop    rbx
  dc35fe:	c3                   	ret
  dc35ff:	48 89 c3             	mov    rbx,rax
  dc3602:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  dc3607:	e8 be 22 ea ff       	call   c658ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b286a>
  dc360c:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  dc3611:	e8 16 41 e4 ff       	call   c0772c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1546cc>
  dc3616:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  dc361d:	00 00
  dc361f:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
```
### ref at `0xde80b7`

```text
  de8070:	e8 3b 86 ee ff       	call   cd06b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d650>
  de8075:	4c 8d b4 24 60 0a 00 	lea    r14,[rsp+0xa60]
  de807c:	00
  de807d:	4c 89 f7             	mov    rdi,r14
  de8080:	4c 89 e6             	mov    rsi,r12
  de8083:	e8 68 fe ce ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  de8088:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
  de808f:	00
  de8090:	48 8d 8c 24 18 02 00 	lea    rcx,[rsp+0x218]
  de8097:	00
  de8098:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  de809c:	48 8d 94 24 10 02 00 	lea    rdx,[rsp+0x210]
  de80a3:	00
  de80a4:	48 83 22 00          	and    QWORD PTR [rdx],0x0
  de80a8:	48 8d b4 24 40 0a 00 	lea    rsi,[rsp+0xa40]
  de80af:	00
  de80b0:	48 83 26 00          	and    QWORD PTR [rsi],0x0
  de80b4:	48 89 28             	mov    QWORD PTR [rax],rbp
  de80b7:	48 8d 3d 22 fd be ff 	lea    rdi,[rip+0xffffffffffbefd22]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  de80be:	48 89 7e 10          	mov    QWORD PTR [rsi+0x10],rdi
  de80c2:	48 8d 3d 53 36 00 00 	lea    rdi,[rip+0x3653]        # deb71c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb87a2>
  de80c9:	48 89 7e 18          	mov    QWORD PTR [rsi+0x18],rdi
  de80cd:	48 8d 3d e6 ea 81 00 	lea    rdi,[rip+0x81eae6]        # 1606bba <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d28>
  de80d4:	4c 8d 84 24 20 0a 00 	lea    r8,[rsp+0xa20]
  de80db:	00
  de80dc:	49 89 38             	mov    QWORD PTR [r8],rdi
  de80df:	48 8d 3d 7e 43 c9 ff 	lea    rdi,[rip+0xffffffffffc9437e]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  de80e6:	49 89 78 10          	mov    QWORD PTR [r8+0x10],rdi
  de80ea:	48 8d 3d e1 36 00 00 	lea    rdi,[rip+0x36e1]        # deb7d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb8858>
  de80f1:	49 89 78 18          	mov    QWORD PTR [r8+0x18],rdi
  de80f5:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
  de80fc:	00
  de80fd:	0f 28 84 24 10 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x110]
  de8104:	00
  de8105:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  de8108:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
  de810f:	00 00
  de8111:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
  de8118:	4c 8b 8c 24 18 08 00 	mov    r9,QWORD PTR [rsp+0x818]
  de811f:	00
  de8120:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
  de8125:	f3 0f 6f 84 24 08 08 	movdqu xmm0,XMMWORD PTR [rsp+0x808]
  de812c:	00 00
  de812e:	f3 0f 7f 04 24       	movdqu XMMWORD PTR [rsp],xmm0
  de8133:	48 89 bc 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rdi
  de813a:	00
  de813b:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
  de8142:	00
  de8143:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
  de814a:	00
```
### ref at `0xdebe6b`

```text
  debe1d:	41 89 84 24 80 00 00 	mov    DWORD PTR [r12+0x80],eax
  debe24:	00
  debe25:	f3 41 0f 7f 84 24 88 	movdqu XMMWORD PTR [r12+0x88],xmm0
  debe2c:	00 00 00
  debe2f:	49 83 a4 24 98 00 00 	and    QWORD PTR [r12+0x98],0x0
  debe36:	00 00
  debe38:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]
  debe3f:	00
  debe40:	e8 cc 2c 86 00       	call   164eb11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7d>
  debe45:	66 49 0f 6e c4       	movq   xmm0,r12
  debe4a:	48 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],rbp
  debe4f:	66 48 0f 6e cd       	movq   xmm1,rbp
  debe54:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  debe58:	66 0f 7f 8c 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm1
  debe5f:	00 00
  debe61:	31 ff                	xor    edi,edi
  debe63:	e8 1e 26 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  debe68:	48 85 db             	test   rbx,rbx
  debe6b:	48 8d 05 6e bf be ff 	lea    rax,[rip+0xffffffffffbebf6e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  debe72:	48 8d 0d eb 05 c9 ff 	lea    rcx,[rip+0xffffffffffc905eb]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  debe79:	48 0f 44 c8          	cmove  rcx,rax
  debe7d:	48 8d 05 4c c3 be ff 	lea    rax,[rip+0xffffffffffbec34c]        # 9d81d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base>
  debe84:	48 8d 15 65 54 00 00 	lea    rdx,[rip+0x5465]        # df12f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe376>
  debe8b:	48 0f 44 d0          	cmove  rdx,rax
  debe8f:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
  debe96:	00
  debe97:	48 8b 28             	mov    rbp,QWORD PTR [rax]
  debe9a:	48 89 9c 24 50 13 00 	mov    QWORD PTR [rsp+0x1350],rbx
  debea1:	00
  debea2:	48 89 8c 24 60 13 00 	mov    QWORD PTR [rsp+0x1360],rcx
  debea9:	00
  debeaa:	48 89 94 24 68 13 00 	mov    QWORD PTR [rsp+0x1368],rdx
  debeb1:	00
  debeb2:	48 8d bc 24 a0 07 00 	lea    rdi,[rsp+0x7a0]
  debeb9:	00
  debeba:	4c 89 f6             	mov    rsi,r14
  debebd:	e8 43 54 00 00       	call   df1305 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe38b>
  debec2:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
  debec9:	00
  debeca:	bf d8 05 00 00       	mov    edi,0x5d8
  debecf:	e8 2c 20 a0 00       	call   17edf00 <_Znwm@plt>
  debed4:	49 89 c6             	mov    r14,rax
  debed7:	48 8b b4 24 b8 14 00 	mov    rsi,QWORD PTR [rsp+0x14b8]
  debede:	00
  debedf:	4c 8d bc 24 d0 11 00 	lea    r15,[rsp+0x11d0]
  debee6:	00
  debee7:	48 8b 9c 24 a8 00 00 	mov    rbx,QWORD PTR [rsp+0xa8]
  debeee:	00
  debeef:	49 89 1f             	mov    QWORD PTR [r15],rbx
  debef2:	48 8d 05 6b 05 c9 ff 	lea    rax,[rip+0xffffffffffc9056b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
```
### ref at `0xdf3c07`

```text
  df3bbc:	4c 89 ea             	mov    rdx,r13
  df3bbf:	48 89 e9             	mov    rcx,rbp
  df3bc2:	4d 89 f0             	mov    r8,r14
  df3bc5:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
  df3bcb:	4c 89 f7             	mov    rdi,r14
  df3bce:	e8 97 63 c8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  df3bd3:	48 89 e7             	mov    rdi,rsp
  df3bd6:	e8 c3 11 00 00       	call   df4d9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e24>
  df3bdb:	48 89 ef             	mov    rdi,rbp
  df3bde:	e8 ad a2 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  df3be3:	4c 89 ef             	mov    rdi,r13
  df3be6:	e8 a5 a2 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  df3beb:	4c 89 e7             	mov    rdi,r12
  df3bee:	e8 c3 11 00 00       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  df3bf3:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
  df3bf8:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  df3bfc:	48 8d 05 f1 ac cb ff 	lea    rax,[rip+0xffffffffffcbacf1]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  df3c03:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  df3c07:	48 8d 05 d2 41 be ff 	lea    rax,[rip+0xffffffffffbe41d2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  df3c0e:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  df3c12:	4c 8d b4 24 c0 01 00 	lea    r14,[rsp+0x1c0]
  df3c19:	00
  df3c1a:	48 89 df             	mov    rdi,rbx
  df3c1d:	4c 89 f6             	mov    rsi,r14
  df3c20:	e8 69 db 7e 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  df3c25:	4c 89 f7             	mov    rdi,r14
  df3c28:	e8 71 36 cb ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  df3c2d:	45 31 f6             	xor    r14d,r14d
  df3c30:	31 ff                	xor    edi,edi
  df3c32:	e8 4f a8 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  df3c37:	eb 72                	jmp    df3cab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0d31>
  df3c39:	83 3d 78 5d b3 00 06 	cmp    DWORD PTR [rip+0xb35d78],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
  df3c40:	7c 1d                	jl     df3c5f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0ce5>
  df3c42:	48 8d 35 33 e3 65 ff 	lea    rsi,[rip+0xffffffffff65e333]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  df3c49:	48 8d 0d fe e9 55 ff 	lea    rcx,[rip+0xffffffffff55e9fe]        # 35264e <_ZTSSt12bad_any_cast@@Base-0x3db7a>
  df3c50:	6a 06                	push   0x6
  df3c52:	5f                   	pop    rdi
  df3c53:	ba b2 02 00 00       	mov    edx,0x2b2
  df3c58:	31 c0                	xor    eax,eax
  df3c5a:	e8 73 2c 9e 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  df3c5f:	4c 8d bc 24 c8 01 00 	lea    r15,[rsp+0x1c8]
  df3c66:	00
  df3c67:	49 83 27 00          	and    QWORD PTR [r15],0x0
  df3c6b:	48 8d 05 46 27 a8 00 	lea    rax,[rip+0xa82746]        # 18763b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32aa0>
  df3c72:	49 89 47 f8          	mov    QWORD PTR [r15-0x8],rax
  df3c76:	41 c7 47 10 24 00 00 	mov    DWORD PTR [r15+0x10],0x24
  df3c7d:	00
  df3c7e:	49 c7 47 08 01 00 00 	mov    QWORD PTR [r15+0x8],0x1
  df3c85:	00
  df3c86:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
```
### ref at `0xdf47e4`

```text
  df4799:	4c 89 ea             	mov    rdx,r13
  df479c:	48 89 e9             	mov    rcx,rbp
  df479f:	4d 89 f8             	mov    r8,r15
  df47a2:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
  df47a8:	4c 89 ff             	mov    rdi,r15
  df47ab:	e8 ba 57 c8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  df47b0:	48 89 e7             	mov    rdi,rsp
  df47b3:	e8 e6 05 00 00       	call   df4d9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e24>
  df47b8:	48 89 ef             	mov    rdi,rbp
  df47bb:	e8 d0 96 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  df47c0:	4c 89 ef             	mov    rdi,r13
  df47c3:	e8 c8 96 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  df47c8:	4c 89 e7             	mov    rdi,r12
  df47cb:	e8 e6 05 00 00       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  df47d0:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
  df47d5:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  df47d9:	48 8d 05 14 a1 cb ff 	lea    rax,[rip+0xffffffffffcba114]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  df47e0:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  df47e4:	48 8d 05 f5 35 be ff 	lea    rax,[rip+0xffffffffffbe35f5]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  df47eb:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  df47ef:	4c 8d b4 24 c0 01 00 	lea    r14,[rsp+0x1c0]
  df47f6:	00
  df47f7:	48 89 df             	mov    rdi,rbx
  df47fa:	4c 89 f6             	mov    rsi,r14
  df47fd:	e8 8c cf 7e 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  df4802:	4c 89 f7             	mov    rdi,r14
  df4805:	e8 94 2a cb ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  df480a:	31 ff                	xor    edi,edi
  df480c:	e8 75 9c ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  df4811:	31 ff                	xor    edi,edi
  df4813:	e8 6e 9c ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  df4818:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  df481f:	00 00
  df4821:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
  df4828:	00
  df4829:	75 15                	jne    df4840 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc18c6>
  df482b:	48 89 d8             	mov    rax,rbx
  df482e:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
  df4835:	5b                   	pop    rbx
  df4836:	41 5c                	pop    r12
  df4838:	41 5d                	pop    r13
  df483a:	41 5e                	pop    r14
  df483c:	41 5f                	pop    r15
  df483e:	5d                   	pop    rbp
  df483f:	c3                   	ret
  df4840:	e8 6b b2 9f 00       	call   17efab0 <__stack_chk_fail@plt>
  df4845:	eb 00                	jmp    df4847 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc18cd>
  df4847:	83 fa 02             	cmp    edx,0x2
  df484a:	75 14                	jne    df4860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc18e6>
  df484c:	48 89 c7             	mov    rdi,rax
```
### ref at `0xdf4a8a`

```text
  df4a3f:	4c 89 ea             	mov    rdx,r13
  df4a42:	48 89 e9             	mov    rcx,rbp
  df4a45:	4d 89 f8             	mov    r8,r15
  df4a48:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
  df4a4e:	4c 89 ff             	mov    rdi,r15
  df4a51:	e8 14 55 c8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  df4a56:	48 89 e7             	mov    rdi,rsp
  df4a59:	e8 40 03 00 00       	call   df4d9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e24>
  df4a5e:	48 89 ef             	mov    rdi,rbp
  df4a61:	e8 2a 94 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  df4a66:	4c 89 ef             	mov    rdi,r13
  df4a69:	e8 22 94 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  df4a6e:	4c 89 e7             	mov    rdi,r12
  df4a71:	e8 40 03 00 00       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  df4a76:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
  df4a7b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  df4a7f:	48 8d 05 6e 9e cb ff 	lea    rax,[rip+0xffffffffffcb9e6e]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  df4a86:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  df4a8a:	48 8d 05 4f 33 be ff 	lea    rax,[rip+0xffffffffffbe334f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  df4a91:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  df4a95:	4c 8d b4 24 c0 01 00 	lea    r14,[rsp+0x1c0]
  df4a9c:	00
  df4a9d:	48 89 df             	mov    rdi,rbx
  df4aa0:	4c 89 f6             	mov    rsi,r14
  df4aa3:	e8 e6 cc 7e 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  df4aa8:	4c 89 f7             	mov    rdi,r14
  df4aab:	e8 ee 27 cb ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  df4ab0:	31 ff                	xor    edi,edi
  df4ab2:	e8 cf 99 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  df4ab7:	31 ff                	xor    edi,edi
  df4ab9:	e8 c8 99 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  df4abe:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  df4ac5:	00 00
  df4ac7:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
  df4ace:	00
  df4acf:	75 15                	jne    df4ae6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1b6c>
  df4ad1:	48 89 d8             	mov    rax,rbx
  df4ad4:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
  df4adb:	5b                   	pop    rbx
  df4adc:	41 5c                	pop    r12
  df4ade:	41 5d                	pop    r13
  df4ae0:	41 5e                	pop    r14
  df4ae2:	41 5f                	pop    r15
  df4ae4:	5d                   	pop    rbp
  df4ae5:	c3                   	ret
  df4ae6:	e8 c5 af 9f 00       	call   17efab0 <__stack_chk_fail@plt>
  df4aeb:	eb 00                	jmp    df4aed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1b73>
  df4aed:	83 fa 02             	cmp    edx,0x2
  df4af0:	75 14                	jne    df4b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1b8c>
  df4af2:	48 89 c7             	mov    rdi,rax
```
### ref at `0xdf4d0a`

```text
  df4cbf:	4c 8d 6c 24 28       	lea    r13,[rsp+0x28]
  df4cc4:	4c 89 f7             	mov    rdi,r14
  df4cc7:	4c 89 e6             	mov    rsi,r12
  df4cca:	4c 89 ea             	mov    rdx,r13
  df4ccd:	4c 89 f9             	mov    rcx,r15
  df4cd0:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]
  df4cd6:	4c 89 ff             	mov    rdi,r15
  df4cd9:	e8 8c 52 c8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  df4cde:	48 89 e7             	mov    rdi,rsp
  df4ce1:	e8 b8 00 00 00       	call   df4d9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e24>
  df4ce6:	4c 89 ef             	mov    rdi,r13
  df4ce9:	e8 a2 91 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  df4cee:	4c 89 e7             	mov    rdi,r12
  df4cf1:	e8 c0 00 00 00       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  df4cf6:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
  df4cfb:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  df4cff:	48 8d 05 ee 9b cb ff 	lea    rax,[rip+0xffffffffffcb9bee]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
  df4d06:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  df4d0a:	48 8d 05 cf 30 be ff 	lea    rax,[rip+0xffffffffffbe30cf]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  df4d11:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  df4d15:	4c 8d b4 24 b0 01 00 	lea    r14,[rsp+0x1b0]
  df4d1c:	00
  df4d1d:	48 89 df             	mov    rdi,rbx
  df4d20:	4c 89 f6             	mov    rsi,r14
  df4d23:	e8 66 ca 7e 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  df4d28:	4c 89 f7             	mov    rdi,r14
  df4d2b:	e8 6e 25 cb ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  df4d30:	31 ff                	xor    edi,edi
  df4d32:	e8 4f 97 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  df4d37:	31 ff                	xor    edi,edi
  df4d39:	e8 48 97 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  df4d3e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  df4d45:	00 00
  df4d47:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
  df4d4e:	00
  df4d4f:	75 15                	jne    df4d66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1dec>
  df4d51:	48 89 d8             	mov    rax,rbx
  df4d54:	48 81 c4 e8 01 00 00 	add    rsp,0x1e8
  df4d5b:	5b                   	pop    rbx
  df4d5c:	41 5c                	pop    r12
  df4d5e:	41 5d                	pop    r13
  df4d60:	41 5e                	pop    r14
  df4d62:	41 5f                	pop    r15
  df4d64:	5d                   	pop    rbp
  df4d65:	c3                   	ret
  df4d66:	e8 45 ad 9f 00       	call   17efab0 <__stack_chk_fail@plt>
  df4d6b:	eb 00                	jmp    df4d6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1df3>
  df4d6d:	83 fa 02             	cmp    edx,0x2
  df4d70:	75 14                	jne    df4d86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e0c>
  df4d72:	48 89 c7             	mov    rdi,rax
```
### ref at `0xe19dfc`

```text
  e19daa:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
  e19dad:	0f 57 c0             	xorps  xmm0,xmm0
  e19db0:	0f 11 86 a0 00 00 00 	movups XMMWORD PTR [rsi+0xa0],xmm0
  e19db7:	88 86 b0 00 00 00    	mov    BYTE PTR [rsi+0xb0],al
  e19dbd:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
  e19dc1:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
  e19dc5:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
  e19dc9:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
  e19dcd:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
  e19dd1:	66 83 a6 98 00 00 00 	and    WORD PTR [rsi+0x98],0x0
  e19dd8:	00
  e19dd9:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
  e19de0:	48 83 a6 c8 00 00 00 	and    QWORD PTR [rsi+0xc8],0x0
  e19de7:	00
  e19de8:	0f 11 86 b8 00 00 00 	movups XMMWORD PTR [rsi+0xb8],xmm0
  e19def:	48 8d 05 6a 76 a1 00 	lea    rax,[rip+0xa1766a]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  e19df6:	48 89 e2             	mov    rdx,rsp
  e19df9:	48 89 02             	mov    QWORD PTR [rdx],rax
  e19dfc:	48 8d 05 dd df bb ff 	lea    rax,[rip+0xffffffffffbbdfdd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e19e03:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
  e19e07:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
  e19e0b:	e8 4c ca fe ff       	call   e0685c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd38e2>
  e19e10:	48 89 e7             	mov    rdi,rsp
  e19e13:	e8 52 01 c6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e19e18:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e19e1d:	e8 78 d2 84 00       	call   166709a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b206>
  e19e22:	48 8b bb e0 11 00 00 	mov    rdi,QWORD PTR [rbx+0x11e0]
  e19e29:	e8 fc b7 04 00       	call   e6562a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca40>
  e19e2e:	48 8d bb b0 13 00 00 	lea    rdi,[rbx+0x13b0]
  e19e35:	e8 fe 7a 9a 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
  e19e3a:	48 8b bb a8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a8]
  e19e41:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e19e44:	6a 01                	push   0x1
  e19e46:	5e                   	pop    rsi
  e19e47:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e19e4a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e19e51:	00 00
  e19e53:	48 3b 84 24 08 01 00 	cmp    rax,QWORD PTR [rsp+0x108]
  e19e5a:	00
  e19e5b:	75 09                	jne    e19e66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe6eec>
  e19e5d:	48 81 c4 10 01 00 00 	add    rsp,0x110
  e19e64:	5b                   	pop    rbx
  e19e65:	c3                   	ret
  e19e66:	e8 45 5c 9d 00       	call   17efab0 <__stack_chk_fail@plt>
  e19e6b:	48 89 c7             	mov    rdi,rax
  e19e6e:	e8 32 fc c5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e19e73:	cc                   	int3
  e19e74:	53                   	push   rbx
  e19e75:	48 89 fb             	mov    rbx,rdi
  e19e78:	48 8b 07             	mov    rax,QWORD PTR [rdi]
```
### ref at `0xe1a95f`

```text
  e1a90b:	0f 57 c0             	xorps  xmm0,xmm0
  e1a90e:	0f 11 86 a0 00 00 00 	movups XMMWORD PTR [rsi+0xa0],xmm0
  e1a915:	88 86 b0 00 00 00    	mov    BYTE PTR [rsi+0xb0],al
  e1a91b:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
  e1a91f:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
  e1a923:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
  e1a927:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
  e1a92b:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
  e1a92f:	66 83 a6 98 00 00 00 	and    WORD PTR [rsi+0x98],0x0
  e1a936:	00
  e1a937:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
  e1a93e:	48 83 a6 c8 00 00 00 	and    QWORD PTR [rsi+0xc8],0x0
  e1a945:	00
  e1a946:	0f 11 86 b8 00 00 00 	movups XMMWORD PTR [rsi+0xb8],xmm0
  e1a94d:	48 8d 05 0c 6b a1 00 	lea    rax,[rip+0xa16b0c]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  e1a954:	48 8d 94 24 60 14 00 	lea    rdx,[rsp+0x1460]
  e1a95b:	00
  e1a95c:	48 89 02             	mov    QWORD PTR [rdx],rax
  e1a95f:	48 8d 05 7a d4 bb ff 	lea    rax,[rip+0xffffffffffbbd47a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e1a966:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
  e1a96a:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
  e1a96e:	e8 e9 be fe ff       	call   e0685c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd38e2>
  e1a973:	48 8d bc 24 60 14 00 	lea    rdi,[rsp+0x1460]
  e1a97a:	00
  e1a97b:	e8 ea f5 c5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e1a980:	48 8d bc 24 90 13 00 	lea    rdi,[rsp+0x1390]
  e1a987:	00
  e1a988:	e8 0d c7 84 00       	call   166709a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b206>
  e1a98d:	48 8b 83 98 01 00 00 	mov    rax,QWORD PTR [rbx+0x198]
  e1a994:	8a 80 e8 02 00 00    	mov    al,BYTE PTR [rax+0x2e8]
  e1a99a:	a8 01                	test   al,0x1
  e1a99c:	0f 85 28 01 00 00    	jne    e1aaca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7b50>
  e1a9a2:	48 8b 83 98 01 00 00 	mov    rax,QWORD PTR [rbx+0x198]
  e1a9a9:	8a 80 e8 02 00 00    	mov    al,BYTE PTR [rax+0x2e8]
  e1a9af:	a8 01                	test   al,0x1
  e1a9b1:	0f 85 c1 07 00 00    	jne    e1b178 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe81fe>
  e1a9b7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e1a9ba:	4c 8d a4 24 60 14 00 	lea    r12,[rsp+0x1460]
  e1a9c1:	00
  e1a9c2:	4c 89 e7             	mov    rdi,r12
  e1a9c5:	48 89 de             	mov    rsi,rbx
  e1a9c8:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
  e1a9ce:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  e1a9d3:	4c 89 e6             	mov    rsi,r12
  e1a9d6:	e8 2a 73 00 00       	call   e21d05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeed8b>
  e1a9db:	84 c0                	test   al,al
  e1a9dd:	0f 84 4f 02 00 00    	je     e1ac32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cb8>
  e1a9e3:	40 8a 6c 24 44       	mov    bpl,BYTE PTR [rsp+0x44]
  e1a9e8:	48 8d bc 24 60 14 00 	lea    rdi,[rsp+0x1460]
  e1a9ef:	00
```
### ref at `0xe1abea`

```text
  e1ab95:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
  e1ab99:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
  e1ab9d:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
  e1aba1:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
  e1aba8:	66 83 a6 98 00 00 00 	and    WORD PTR [rsi+0x98],0x0
  e1abaf:	00
  e1abb0:	0f 11 86 b8 00 00 00 	movups XMMWORD PTR [rsi+0xb8],xmm0
  e1abb7:	89 56 14             	mov    DWORD PTR [rsi+0x14],edx
  e1abba:	c6 86 b0 00 00 00 01 	mov    BYTE PTR [rsi+0xb0],0x1
  e1abc1:	4c 8b a0 40 03 00 00 	mov    r12,QWORD PTR [rax+0x340]
  e1abc8:	4c 8d ac 24 d0 03 00 	lea    r13,[rsp+0x3d0]
  e1abcf:	00
  e1abd0:	4c 89 ef             	mov    rdi,r13
  e1abd3:	e8 b0 d1 84 00       	call   1667d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bef4>
  e1abd8:	48 8d 05 81 68 a1 00 	lea    rax,[rip+0xa16881]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  e1abdf:	48 8d 94 24 f0 23 00 	lea    rdx,[rsp+0x23f0]
  e1abe6:	00
  e1abe7:	48 89 02             	mov    QWORD PTR [rdx],rax
  e1abea:	48 8d 05 ef d1 bb ff 	lea    rax,[rip+0xffffffffffbbd1ef]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e1abf1:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
  e1abf5:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
  e1abf9:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e1abfd:	4c 89 e7             	mov    rdi,r12
  e1ac00:	4c 89 ee             	mov    rsi,r13
  e1ac03:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e1ac06:	48 8d bc 24 f0 23 00 	lea    rdi,[rsp+0x23f0]
  e1ac0d:	00
  e1ac0e:	e8 57 f3 c5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e1ac13:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
  e1ac1a:	00
  e1ac1b:	e8 c0 d1 84 00       	call   1667de0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf4c>
  e1ac20:	48 8d bc 24 60 14 00 	lea    rdi,[rsp+0x1460]
  e1ac27:	00
  e1ac28:	e8 b3 d1 84 00       	call   1667de0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf4c>
  e1ac2d:	e9 70 fd ff ff       	jmp    e1a9a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7a28>
  e1ac32:	48 8d bc 24 60 14 00 	lea    rdi,[rsp+0x1460]
  e1ac39:	00
  e1ac3a:	e8 51 ae fd ff       	call   df5a90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b16>
  e1ac3f:	4c 8d b4 24 e8 03 00 	lea    r14,[rsp+0x3e8]
  e1ac46:	00
  e1ac47:	31 c0                	xor    eax,eax
  e1ac49:	41 88 06             	mov    BYTE PTR [r14],al
  e1ac4c:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
  e1ac50:	0f 57 c0             	xorps  xmm0,xmm0
  e1ac53:	41 0f 29 46 e8       	movaps XMMWORD PTR [r14-0x18],xmm0
  e1ac58:	41 83 66 f8 00       	and    DWORD PTR [r14-0x8],0x0
  e1ac5d:	41 c7 46 e8 01 00 00 	mov    DWORD PTR [r14-0x18],0x1
  e1ac64:	00
  e1ac65:	48 8d 35 d6 3b 51 ff 	lea    rsi,[rip+0xffffffffff513bd6]        # 32e842 <_ZTSSt12bad_any_cast@@Base-0x61986>
  e1ac6c:	4c 8d bc 24 60 14 00 	lea    r15,[rsp+0x1460]
```
### ref at `0xe239e4`

```text
  e23993:	0f 84 ca 00 00 00    	je     e23a63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf0ae9>
  e23999:	80 bc 24 0b 02 00 00 	cmp    BYTE PTR [rsp+0x20b],0x0
  e239a0:	00
  e239a1:	0f 85 dd 00 00 00    	jne    e23a84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf0b0a>
  e239a7:	83 bc 24 e8 01 00 00 	cmp    DWORD PTR [rsp+0x1e8],0x0
  e239ae:	00
  e239af:	0f 84 cf 00 00 00    	je     e23a84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf0b0a>
  e239b5:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
  e239b9:	4c 89 f7             	mov    rdi,r14
  e239bc:	e8 d5 03 00 00       	call   e23d96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf0e1c>
  e239c1:	49 89 c5             	mov    r13,rax
  e239c4:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  e239c9:	4c 89 e6             	mov    rsi,r12
  e239cc:	e8 7d 11 fe ff       	call   e04b4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1bd4>
  e239d1:	45 8b 86 10 22 00 00 	mov    r8d,DWORD PTR [r14+0x2210]
  e239d8:	4c 8d b4 24 b0 04 00 	lea    r14,[rsp+0x4b0]
  e239df:	00
  e239e0:	49 83 26 00          	and    QWORD PTR [r14],0x0
  e239e4:	48 8d 05 f5 43 bb ff 	lea    rax,[rip+0xffffffffffbb43f5]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e239eb:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  e239ef:	48 8d 05 68 11 00 00 	lea    rax,[rip+0x1168]        # e24b5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf1be4>
  e239f6:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  e239fa:	31 c0                	xor    eax,eax
  e239fc:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
  e23a01:	41 88 04 24          	mov    BYTE PTR [r12],al
  e23a05:	41 88 44 24 18       	mov    BYTE PTR [r12+0x18],al
  e23a0a:	48 8d 6c 24 08       	lea    rbp,[rsp+0x8]
  e23a0f:	88 45 00             	mov    BYTE PTR [rbp+0x0],al
  e23a12:	88 45 18             	mov    BYTE PTR [rbp+0x18],al
  e23a15:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e23a18:	48 83 ec 08          	sub    rsp,0x8
  e23a1c:	48 8d 94 24 b0 01 00 	lea    rdx,[rsp+0x1b0]
  e23a23:	00
  e23a24:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
  e23a29:	4c 89 ff             	mov    rdi,r15
  e23a2c:	4c 89 ee             	mov    rsi,r13
  e23a2f:	49 89 cf             	mov    r15,rcx
  e23a32:	41 89 d9             	mov    r9d,ebx
  e23a35:	55                   	push   rbp
  e23a36:	41 54                	push   r12
  e23a38:	41 56                	push   r14
  e23a3a:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e23a3d:	48 83 c4 20          	add    rsp,0x20
  e23a41:	48 89 ef             	mov    rdi,rbp
  e23a44:	e8 e7 32 c8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e23a49:	4c 89 e7             	mov    rdi,r12
  e23a4c:	e8 df 32 c8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e23a51:	4c 89 f7             	mov    rdi,r14
  e23a54:	e8 63 0c fe ff       	call   e046bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1742>
  e23a59:	4c 89 ff             	mov    rdi,r15
```
### ref at `0xe69447`

```text
  e693ff:	4c 89 fe             	mov    rsi,r15
  e69402:	e8 15 04 c5 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  e69407:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  e6940b:	e8 76 50 c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e69410:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  e69414:	48 8d b4 24 88 03 00 	lea    rsi,[rsp+0x388]
  e6941b:	00
  e6941c:	48 8d 94 24 58 03 00 	lea    rdx,[rsp+0x358]
  e69423:	00
  e69424:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e69429:	0f 29 84 24 20 06 00 	movaps XMMWORD PTR [rsp+0x620],xmm0
  e69430:	00
  e69431:	4d 85 f6             	test   r14,r14
  e69434:	74 05                	je     e6943b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30851>
  e69436:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  e6943b:	4c 8d bc 24 88 06 00 	lea    r15,[rsp+0x688]
  e69442:	00
  e69443:	49 83 27 00          	and    QWORD PTR [r15],0x0
  e69447:	48 8d 05 92 e9 b6 ff 	lea    rax,[rip+0xffffffffffb6e992]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e6944e:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  e69452:	48 8d 05 87 e9 b6 ff 	lea    rax,[rip+0xffffffffffb6e987]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e69459:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  e6945d:	4c 8d a4 24 e8 07 00 	lea    r12,[rsp+0x7e8]
  e69464:	00
  e69465:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
  e69469:	48 8d 05 f4 2f c1 ff 	lea    rax,[rip+0xffffffffffc12ff4]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  e69470:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  e69475:	48 8d 05 bc 08 00 00 	lea    rax,[rip+0x8bc]        # e69d38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3114e>
  e6947c:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  e69481:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e69484:	48 8d 9c 24 20 06 00 	lea    rbx,[rsp+0x620]
  e6948b:	00
  e6948c:	48 89 d9             	mov    rcx,rbx
  e6948f:	4d 89 f8             	mov    r8,r15
  e69492:	4d 89 e1             	mov    r9,r12
  e69495:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e69498:	4c 89 e7             	mov    rdi,r12
  e6949b:	e8 2e b4 fd ff       	call   e448ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbce4>
  e694a0:	4c 89 ff             	mov    rdi,r15
  e694a3:	e8 4c b4 fd ff       	call   e448f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbd0a>
  e694a8:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e694ac:	e8 01 50 c3 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e694b1:	4c 89 f7             	mov    rdi,r14
  e694b4:	e8 cd 4f c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e694b9:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  e694be:	e8 cd c5 f8 ff       	call   df5a90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b16>
  e694c3:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
  e694ca:	00
  e694cb:	e8 08 93 f8 ff       	call   df27d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf85e>
  e694d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
```
### ref at `0xe69452`

```text
  e69407:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  e6940b:	e8 76 50 c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e69410:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  e69414:	48 8d b4 24 88 03 00 	lea    rsi,[rsp+0x388]
  e6941b:	00
  e6941c:	48 8d 94 24 58 03 00 	lea    rdx,[rsp+0x358]
  e69423:	00
  e69424:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e69429:	0f 29 84 24 20 06 00 	movaps XMMWORD PTR [rsp+0x620],xmm0
  e69430:	00
  e69431:	4d 85 f6             	test   r14,r14
  e69434:	74 05                	je     e6943b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30851>
  e69436:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  e6943b:	4c 8d bc 24 88 06 00 	lea    r15,[rsp+0x688]
  e69442:	00
  e69443:	49 83 27 00          	and    QWORD PTR [r15],0x0
  e69447:	48 8d 05 92 e9 b6 ff 	lea    rax,[rip+0xffffffffffb6e992]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e6944e:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  e69452:	48 8d 05 87 e9 b6 ff 	lea    rax,[rip+0xffffffffffb6e987]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e69459:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  e6945d:	4c 8d a4 24 e8 07 00 	lea    r12,[rsp+0x7e8]
  e69464:	00
  e69465:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
  e69469:	48 8d 05 f4 2f c1 ff 	lea    rax,[rip+0xffffffffffc12ff4]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  e69470:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  e69475:	48 8d 05 bc 08 00 00 	lea    rax,[rip+0x8bc]        # e69d38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3114e>
  e6947c:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  e69481:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e69484:	48 8d 9c 24 20 06 00 	lea    rbx,[rsp+0x620]
  e6948b:	00
  e6948c:	48 89 d9             	mov    rcx,rbx
  e6948f:	4d 89 f8             	mov    r8,r15
  e69492:	4d 89 e1             	mov    r9,r12
  e69495:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e69498:	4c 89 e7             	mov    rdi,r12
  e6949b:	e8 2e b4 fd ff       	call   e448ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbce4>
  e694a0:	4c 89 ff             	mov    rdi,r15
  e694a3:	e8 4c b4 fd ff       	call   e448f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbd0a>
  e694a8:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e694ac:	e8 01 50 c3 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e694b1:	4c 89 f7             	mov    rdi,r14
  e694b4:	e8 cd 4f c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e694b9:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  e694be:	e8 cd c5 f8 ff       	call   df5a90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b16>
  e694c3:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
  e694ca:	00
  e694cb:	e8 08 93 f8 ff       	call   df27d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf85e>
  e694d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e694d7:	00 00
  e694d9:	48 3b 84 24 d0 0a 00 	cmp    rax,QWORD PTR [rsp+0xad0]
```
### ref at `0xe74165`

```text
  e74118:	e8 2b 00 00 00       	call   e74148 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b55e>
  e7411d:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
  e74124:	e8 3d 5d 96 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  e74129:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
  e7412d:	e8 34 5d 96 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  e74132:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e74136:	e8 2b 5d 96 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  e7413b:	48 83 c3 08          	add    rbx,0x8
  e7413f:	48 89 df             	mov    rdi,rbx
  e74142:	5b                   	pop    rbx
  e74143:	e9 e0 5c c0 ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
  e74148:	48 83 ec 28          	sub    rsp,0x28
  e7414c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e74153:	00 00
  e74155:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e7415a:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  e7415e:	48 89 e6             	mov    rsi,rsp
  e74161:	48 83 26 00          	and    QWORD PTR [rsi],0x0
  e74165:	48 8d 05 74 3c b6 ff 	lea    rax,[rip+0xffffffffffb63c74]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e7416c:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  e74170:	48 8d 05 69 3c b6 ff 	lea    rax,[rip+0xffffffffffb63c69]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e74177:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
  e7417b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e7417e:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e74181:	48 89 e7             	mov    rdi,rsp
  e74184:	e8 1b 9a cc ff       	call   b3dba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8ab44>
  e74189:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e74190:	00 00
  e74192:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e74197:	75 05                	jne    e7419e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b5b4>
  e74199:	48 83 c4 28          	add    rsp,0x28
  e7419d:	c3                   	ret
  e7419e:	e8 0d b9 97 00       	call   17efab0 <__stack_chk_fail@plt>
  e741a3:	48 89 c7             	mov    rdi,rax
  e741a6:	e8 fa 58 c0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e741ab:	cc                   	int3
  e741ac:	53                   	push   rbx
  e741ad:	48 89 fb             	mov    rbx,rdi
  e741b0:	e8 5f ff ff ff       	call   e74114 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b52a>
  e741b5:	48 89 df             	mov    rdi,rbx
  e741b8:	5b                   	pop    rbx
  e741b9:	e9 62 9d 97 00       	jmp    17edf20 <_ZdlPv@plt>
  e741be:	55                   	push   rbp
  e741bf:	41 57                	push   r15
  e741c1:	41 56                	push   r14
  e741c3:	53                   	push   rbx
  e741c4:	48 81 ec 28 01 00 00 	sub    rsp,0x128
  e741cb:	89 d5                	mov    ebp,edx
  e741cd:	49 89 f7             	mov    r15,rsi
  e741d0:	48 89 fb             	mov    rbx,rdi
```
### ref at `0xe74170`

```text
  e74124:	e8 3d 5d 96 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  e74129:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
  e7412d:	e8 34 5d 96 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  e74132:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e74136:	e8 2b 5d 96 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  e7413b:	48 83 c3 08          	add    rbx,0x8
  e7413f:	48 89 df             	mov    rdi,rbx
  e74142:	5b                   	pop    rbx
  e74143:	e9 e0 5c c0 ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
  e74148:	48 83 ec 28          	sub    rsp,0x28
  e7414c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e74153:	00 00
  e74155:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e7415a:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  e7415e:	48 89 e6             	mov    rsi,rsp
  e74161:	48 83 26 00          	and    QWORD PTR [rsi],0x0
  e74165:	48 8d 05 74 3c b6 ff 	lea    rax,[rip+0xffffffffffb63c74]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e7416c:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  e74170:	48 8d 05 69 3c b6 ff 	lea    rax,[rip+0xffffffffffb63c69]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e74177:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
  e7417b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e7417e:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e74181:	48 89 e7             	mov    rdi,rsp
  e74184:	e8 1b 9a cc ff       	call   b3dba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8ab44>
  e74189:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e74190:	00 00
  e74192:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e74197:	75 05                	jne    e7419e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b5b4>
  e74199:	48 83 c4 28          	add    rsp,0x28
  e7419d:	c3                   	ret
  e7419e:	e8 0d b9 97 00       	call   17efab0 <__stack_chk_fail@plt>
  e741a3:	48 89 c7             	mov    rdi,rax
  e741a6:	e8 fa 58 c0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e741ab:	cc                   	int3
  e741ac:	53                   	push   rbx
  e741ad:	48 89 fb             	mov    rbx,rdi
  e741b0:	e8 5f ff ff ff       	call   e74114 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b52a>
  e741b5:	48 89 df             	mov    rdi,rbx
  e741b8:	5b                   	pop    rbx
  e741b9:	e9 62 9d 97 00       	jmp    17edf20 <_ZdlPv@plt>
  e741be:	55                   	push   rbp
  e741bf:	41 57                	push   r15
  e741c1:	41 56                	push   r14
  e741c3:	53                   	push   rbx
  e741c4:	48 81 ec 28 01 00 00 	sub    rsp,0x128
  e741cb:	89 d5                	mov    ebp,edx
  e741cd:	49 89 f7             	mov    r15,rsi
  e741d0:	48 89 fb             	mov    rbx,rdi
  e741d3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e741da:	00 00
```
### ref at `0xe7430c`

```text
  e742bb:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
  e742be:	48 8d 8c 24 00 01 00 	lea    rcx,[rsp+0x100]
  e742c5:	00
  e742c6:	48 89 19             	mov    QWORD PTR [rcx],rbx
  e742c9:	48 8d 05 94 81 c0 ff 	lea    rax,[rip+0xffffffffffc08194]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  e742d0:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  e742d4:	48 8d 05 31 02 00 00 	lea    rax,[rip+0x231]        # e7450c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b922>
  e742db:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
  e742df:	4c 8d 84 24 e0 00 00 	lea    r8,[rsp+0xe0]
  e742e6:	00
  e742e7:	49 89 18             	mov    QWORD PTR [r8],rbx
  e742ea:	48 8d 05 73 81 c0 ff 	lea    rax,[rip+0xffffffffffc08173]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  e742f1:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
  e742f5:	4c 8d 8c 24 c0 00 00 	lea    r9,[rsp+0xc0]
  e742fc:	00
  e742fd:	49 83 21 00          	and    QWORD PTR [r9],0x0
  e74301:	48 8d 05 10 04 00 00 	lea    rax,[rip+0x410]        # e74718 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bb2e>
  e74308:	49 89 40 18          	mov    QWORD PTR [r8+0x18],rax
  e7430c:	48 8d 05 cd 3a b6 ff 	lea    rax,[rip+0xffffffffffb63acd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e74313:	49 89 41 10          	mov    QWORD PTR [r9+0x10],rax
  e74317:	48 8d 05 c2 3a b6 ff 	lea    rax,[rip+0xffffffffffb63ac2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e7431e:	49 89 41 18          	mov    QWORD PTR [r9+0x18],rax
  e74322:	0f 57 c0             	xorps  xmm0,xmm0
  e74325:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
  e7432c:	00
  e7432d:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
  e74330:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
  e74334:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e74337:	4c 8b 56 10          	mov    r10,QWORD PTR [rsi+0x10]
  e7433b:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e7433f:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  e74344:	4c 89 f7             	mov    rdi,r14
  e74347:	41 ff d2             	call   r10
  e7434a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  e74351:	00
  e74352:	e8 4d 98 cc ff       	call   b3dba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8ab44>
  e74357:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  e7435e:	00
  e7435f:	e8 bc a4 cc ff       	call   b3e820 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b7c0>
  e74364:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  e7436b:	00
  e7436c:	e8 d5 a4 cc ff       	call   b3e846 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b7e6>
  e74371:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  e74378:	00
  e74379:	e8 26 98 cc ff       	call   b3dba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8ab44>
  e7437e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  e74385:	00
  e74386:	e8 a5 29 c3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e7438b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  e74390:	e8 fb 9a 97 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
```
### ref at `0xe74317`

```text
  e742c5:	00
  e742c6:	48 89 19             	mov    QWORD PTR [rcx],rbx
  e742c9:	48 8d 05 94 81 c0 ff 	lea    rax,[rip+0xffffffffffc08194]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  e742d0:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  e742d4:	48 8d 05 31 02 00 00 	lea    rax,[rip+0x231]        # e7450c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b922>
  e742db:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
  e742df:	4c 8d 84 24 e0 00 00 	lea    r8,[rsp+0xe0]
  e742e6:	00
  e742e7:	49 89 18             	mov    QWORD PTR [r8],rbx
  e742ea:	48 8d 05 73 81 c0 ff 	lea    rax,[rip+0xffffffffffc08173]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  e742f1:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
  e742f5:	4c 8d 8c 24 c0 00 00 	lea    r9,[rsp+0xc0]
  e742fc:	00
  e742fd:	49 83 21 00          	and    QWORD PTR [r9],0x0
  e74301:	48 8d 05 10 04 00 00 	lea    rax,[rip+0x410]        # e74718 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bb2e>
  e74308:	49 89 40 18          	mov    QWORD PTR [r8+0x18],rax
  e7430c:	48 8d 05 cd 3a b6 ff 	lea    rax,[rip+0xffffffffffb63acd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e74313:	49 89 41 10          	mov    QWORD PTR [r9+0x10],rax
  e74317:	48 8d 05 c2 3a b6 ff 	lea    rax,[rip+0xffffffffffb63ac2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e7431e:	49 89 41 18          	mov    QWORD PTR [r9+0x18],rax
  e74322:	0f 57 c0             	xorps  xmm0,xmm0
  e74325:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
  e7432c:	00
  e7432d:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
  e74330:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
  e74334:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e74337:	4c 8b 56 10          	mov    r10,QWORD PTR [rsi+0x10]
  e7433b:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e7433f:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  e74344:	4c 89 f7             	mov    rdi,r14
  e74347:	41 ff d2             	call   r10
  e7434a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  e74351:	00
  e74352:	e8 4d 98 cc ff       	call   b3dba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8ab44>
  e74357:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  e7435e:	00
  e7435f:	e8 bc a4 cc ff       	call   b3e820 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b7c0>
  e74364:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  e7436b:	00
  e7436c:	e8 d5 a4 cc ff       	call   b3e846 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8b7e6>
  e74371:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  e74378:	00
  e74379:	e8 26 98 cc ff       	call   b3dba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8ab44>
  e7437e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  e74385:	00
  e74386:	e8 a5 29 c3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e7438b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  e74390:	e8 fb 9a 97 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e74395:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e7439c:	00 00
```
### ref at `0xe7445c`

```text
  e74421:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e74424:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e74427:	8b 0d 8b 55 ab 00    	mov    ecx,DWORD PTR [rip+0xab558b]        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
  e7442d:	84 c0                	test   al,al
  e7442f:	74 6a                	je     e7449b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b8b1>
  e74431:	83 f9 06             	cmp    ecx,0x6
  e74434:	7c 1b                	jl     e74451 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b867>
  e74436:	48 8d 35 3f db 5d ff 	lea    rsi,[rip+0xffffffffff5ddb3f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  e7443d:	48 8d 0d d1 14 4c ff 	lea    rcx,[rip+0xffffffffff4c14d1]        # 335915 <_ZTSSt12bad_any_cast@@Base-0x5a8b3>
  e74444:	6a 06                	push   0x6
  e74446:	5f                   	pop    rdi
  e74447:	6a 42                	push   0x42
  e74449:	5a                   	pop    rdx
  e7444a:	31 c0                	xor    eax,eax
  e7444c:	e8 81 24 96 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  e74451:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  e74455:	48 89 e2             	mov    rdx,rsp
  e74458:	48 83 22 00          	and    QWORD PTR [rdx],0x0
  e7445c:	48 8d 05 7d 39 b6 ff 	lea    rax,[rip+0xffffffffffb6397d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e74463:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
  e74467:	48 8d 05 72 00 00 00 	lea    rax,[rip+0x72]        # e744e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b8f6>
  e7446e:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
  e74472:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e74475:	48 89 de             	mov    rsi,rbx
  e74478:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e7447b:	48 89 e7             	mov    rdi,rsp
  e7447e:	e8 21 97 cc ff       	call   b3dba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8ab44>
  e74483:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e7448a:	00 00
  e7448c:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e74491:	75 3f                	jne    e744d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b8e8>
  e74493:	48 83 c4 28          	add    rsp,0x28
  e74497:	5b                   	pop    rbx
  e74498:	41 5e                	pop    r14
  e7449a:	c3                   	ret
  e7449b:	83 f9 06             	cmp    ecx,0x6
  e7449e:	7c e3                	jl     e74483 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b899>
  e744a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e744a7:	00 00
  e744a9:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e744ae:	75 22                	jne    e744d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b8e8>
  e744b0:	48 8d 35 c5 da 5d ff 	lea    rsi,[rip+0xffffffffff5ddac5]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  e744b7:	48 8d 0d 8e b0 4c ff 	lea    rcx,[rip+0xffffffffff4cb08e]        # 33f54c <_ZTSSt12bad_any_cast@@Base-0x50c7c>
  e744be:	6a 06                	push   0x6
  e744c0:	5f                   	pop    rdi
  e744c1:	6a 3e                	push   0x3e
  e744c3:	5a                   	pop    rdx
  e744c4:	31 c0                	xor    eax,eax
  e744c6:	48 83 c4 28          	add    rsp,0x28
  e744ca:	5b                   	pop    rbx
```
### ref at `0xe80062`

```text
  e80017:	49 89 c6             	mov    r14,rax
  e8001a:	ff 40 18             	inc    DWORD PTR [rax+0x18]
  e8001d:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
  e80022:	4c 89 e7             	mov    rdi,r12
  e80025:	48 89 c6             	mov    rsi,rax
  e80028:	e8 d1 fd 84 00       	call   16cfdfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83f6a>
  e8002d:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
  e80031:	4c 89 e6             	mov    rsi,r12
  e80034:	e8 57 dd c3 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e80039:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  e8003e:	e8 a1 fd 84 00       	call   16cfde4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83f50>
  e80043:	4c 8d a4 24 c0 00 00 	lea    r12,[rsp+0xc0]
  e8004a:	00
  e8004b:	4d 89 74 24 f0       	mov    QWORD PTR [r12-0x10],r14
  e80050:	4c 89 e7             	mov    rdi,r12
  e80053:	4c 89 fe             	mov    rsi,r15
  e80056:	e8 35 a2 bf ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8005b:	48 8d 35 3a a4 bf ff 	lea    rsi,[rip+0xffffffffffbfa43a]        # a7a49c <JNI_OnUnload@@Base+0x1d69>
  e80062:	48 8d 15 07 64 c5 ff 	lea    rdx,[rip+0xffffffffffc56407]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
  e80069:	48 8d 0d f0 00 00 00 	lea    rcx,[rip+0xf0]        # e80160 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47576>
  e80070:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
  e80075:	4c 8d ac 24 b0 00 00 	lea    r13,[rsp+0xb0]
  e8007c:	00
  e8007d:	6a 40                	push   0x40
  e8007f:	41 59                	pop    r9
  e80081:	48 89 ef             	mov    rdi,rbp
  e80084:	4d 89 e8             	mov    r8,r13
  e80087:	e8 08 a7 95 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e8008c:	49 83 c6 20          	add    r14,0x20
  e80090:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
  e80095:	4c 89 ff             	mov    rdi,r15
  e80098:	4c 89 f6             	mov    rsi,r14
  e8009b:	48 89 ea             	mov    rdx,rbp
  e8009e:	e8 27 9f 95 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
  e800a3:	48 89 ef             	mov    rdi,rbp
  e800a6:	e8 3d a7 95 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e800ab:	4c 89 e7             	mov    rdi,r12
  e800ae:	e8 b7 9e bf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e800b3:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e800b8:	4c 89 f7             	mov    rdi,r14
  e800bb:	4c 89 fe             	mov    rsi,r15
  e800be:	e8 7b 99 95 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e800c3:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
  e800c8:	4c 8d a4 24 b0 00 00 	lea    r12,[rsp+0xb0]
  e800cf:	00
  e800d0:	4c 89 e7             	mov    rdi,r12
  e800d3:	4c 89 f6             	mov    rsi,r14
  e800d6:	e8 63 99 95 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e800db:	48 8d 05 d0 79 cc ff 	lea    rax,[rip+0xffffffffffcc79d0]        # b47ab2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x94a52>
  e800e2:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
```
### ref at `0xe857e8`

```text
  e857a2:	5f                   	pop    rdi
  e857a3:	e8 58 87 96 00       	call   17edf00 <_Znwm@plt>
  e857a8:	49 89 c4             	mov    r12,rax
  e857ab:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e857b0:	4c 8d ac 24 d0 00 00 	lea    r13,[rsp+0xd0]
  e857b7:	00
  e857b8:	48 89 c7             	mov    rdi,rax
  e857bb:	4c 89 ee             	mov    rsi,r13
  e857be:	e8 7b 42 95 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e857c3:	4c 89 e7             	mov    rdi,r12
  e857c6:	48 83 c7 10          	add    rdi,0x10
  e857ca:	4c 89 fe             	mov    rsi,r15
  e857cd:	e8 6c 42 95 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e857d2:	4c 8d bc 24 18 01 00 	lea    r15,[rsp+0x118]
  e857d9:	00
  e857da:	4d 89 27             	mov    QWORD PTR [r15],r12
  e857dd:	48 8d 05 d4 47 00 00 	lea    rax,[rip+0x47d4]        # e89fb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x513ce>
  e857e4:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  e857e8:	48 8d 05 f1 25 b5 ff 	lea    rax,[rip+0xffffffffffb525f1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e857ef:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  e857f3:	48 89 df             	mov    rdi,rbx
  e857f6:	4c 89 fe             	mov    rsi,r15
  e857f9:	e8 90 bf 75 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  e857fe:	4c 89 ff             	mov    rdi,r15
  e85801:	e8 98 1a c2 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  e85806:	4c 89 ef             	mov    rdi,r13
  e85809:	e8 d4 47 00 00       	call   e89fe2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x513f8>
  e8580e:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
  e85813:	e8 6e 8c c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e85818:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  e8581d:	e8 c6 4f 95 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e85822:	4c 89 f7             	mov    rdi,r14
  e85825:	e8 aa c7 f6 ff       	call   df1fd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf05a>
  e8582a:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
  e85831:	00
  e85832:	e8 4f 8c c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e85837:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  e8583e:	00
  e8583f:	e8 a4 4f 95 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e85844:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  e8584b:	00
  e8584c:	e8 83 c7 f6 ff       	call   df1fd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf05a>
  e85851:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e85858:	00 00
  e8585a:	48 3b 84 24 38 01 00 	cmp    rax,QWORD PTR [rsp+0x138]
  e85861:	00
  e85862:	75 14                	jne    e85878 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4cc8e>
  e85864:	48 89 d8             	mov    rax,rbx
  e85867:	48 81 c4 40 01 00 00 	add    rsp,0x140
  e8586e:	5b                   	pop    rbx
```
### ref at `0xe8f7c6`

```text
  e8f76e:	0f 11 86 a0 00 00 00 	movups XMMWORD PTR [rsi+0xa0],xmm0
  e8f775:	88 86 b0 00 00 00    	mov    BYTE PTR [rsi+0xb0],al
  e8f77b:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
  e8f77f:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
  e8f783:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
  e8f787:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
  e8f78b:	66 83 a6 98 00 00 00 	and    WORD PTR [rsi+0x98],0x0
  e8f792:	00
  e8f793:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
  e8f797:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
  e8f79e:	0f 11 86 b8 00 00 00 	movups XMMWORD PTR [rsi+0xb8],xmm0
  e8f7a5:	c7 46 14 02 00 00 00 	mov    DWORD PTR [rsi+0x14],0x2
  e8f7ac:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
  e8f7b1:	4c 89 ff             	mov    rdi,r15
  e8f7b4:	e8 cf 85 7d 00       	call   1667d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bef4>
  e8f7b9:	48 8d 05 a0 1c 9a 00 	lea    rax,[rip+0x9a1ca0]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  e8f7c0:	48 89 e2             	mov    rdx,rsp
  e8f7c3:	48 89 02             	mov    QWORD PTR [rdx],rax
  e8f7c6:	48 8d 05 13 86 b4 ff 	lea    rax,[rip+0xffffffffffb48613]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  e8f7cd:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
  e8f7d1:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
  e8f7d5:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e8f7d8:	4c 89 f7             	mov    rdi,r14
  e8f7db:	4c 89 fe             	mov    rsi,r15
  e8f7de:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8f7e1:	48 89 e7             	mov    rdi,rsp
  e8f7e4:	e8 81 a7 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8f7e9:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e8f7ee:	e8 ed 85 7d 00       	call   1667de0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf4c>
  e8f7f3:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  e8f7fa:	00
  e8f7fb:	e8 e0 85 7d 00       	call   1667de0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf4c>
  e8f800:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
  e8f807:	48 85 ff             	test   rdi,rdi
  e8f80a:	74 06                	je     e8f812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56c28>
  e8f80c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8f80f:	ff 50 50             	call   QWORD PTR [rax+0x50]
  e8f812:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e8f819:	00 00
  e8f81b:	48 3b 84 24 c8 01 00 	cmp    rax,QWORD PTR [rsp+0x1c8]
  e8f822:	00
  e8f823:	75 4a                	jne    e8f86f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56c85>
  e8f825:	48 81 c4 d0 01 00 00 	add    rsp,0x1d0
  e8f82c:	5b                   	pop    rbx
  e8f82d:	41 5e                	pop    r14
  e8f82f:	41 5f                	pop    r15
  e8f831:	c3                   	ret
  e8f832:	48 89 c3             	mov    rbx,rax
  e8f835:	48 89 e7             	mov    rdi,rsp
  e8f838:	e8 2d a7 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
```
### ref at `0xe9929a`

```text
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
```
### ref at `0xe992a2`

```text
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
```
### ref at `0xe992b6`

```text
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
```
### ref at `0xe992ba`

```text
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
```
### ref at `0xe992c8`

```text
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
```
### ref at `0xe99368`

```text
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
```
### ref at `0xe99382`

```text
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
```
### ref at `0xe9939c`

```text
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
```
### ref at `0xe993ae`

```text
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
```
### ref at `0xea6548`

```text
  ea6515:	48 39 f2             	cmp    rdx,rsi
  ea6518:	74 13                	je     ea652d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d943>
  ea651a:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
  ea651e:	eb 07                	jmp    ea6527 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d93d>
  ea6520:	48 83 c0 20          	add    rax,0x20
  ea6524:	48 89 c1             	mov    rcx,rax
  ea6527:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  ea652b:	eb 10                	jmp    ea653d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d953>
  ea652d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
  ea6531:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  ea6534:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  ea6537:	48 89 c6             	mov    rsi,rax
  ea653a:	ff 51 18             	call   QWORD PTR [rcx+0x18]
  ea653d:	58                   	pop    rax
  ea653e:	c3                   	ret
  ea653f:	48 89 c7             	mov    rdi,rax
  ea6542:	e8 5e 35 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea6547:	cc                   	int3
  ea6548:	53                   	push   rbx
  ea6549:	48 89 fb             	mov    rbx,rdi
  ea654c:	6a 10                	push   0x10
  ea654e:	5f                   	pop    rdi
  ea654f:	e8 ac 79 94 00       	call   17edf00 <_Znwm@plt>
  ea6554:	48 8d 0d 05 b4 98 00 	lea    rcx,[rip+0x98b405]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea655b:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea655e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6562:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6566:	5b                   	pop    rbx
  ea6567:	c3                   	ret
  ea6568:	48 8d 05 f1 b3 98 00 	lea    rax,[rip+0x98b3f1]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea656f:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6572:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6576:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea657a:	c3                   	ret
  ea657b:	cc                   	int3
  ea657c:	53                   	push   rbx
  ea657d:	48 83 ec 60          	sub    rsp,0x60
  ea6581:	4d 89 ca             	mov    r10,r9
  ea6584:	48 89 f0             	mov    rax,rsi
  ea6587:	48 89 fb             	mov    rbx,rdi
  ea658a:	4c 8b 4c 24 70       	mov    r9,QWORD PTR [rsp+0x70]
  ea658f:	0f 10 44 24 78       	movups xmm0,XMMWORD PTR [rsp+0x78]
  ea6594:	0f 10 8c 24 88 00 00 	movups xmm1,XMMWORD PTR [rsp+0x88]
  ea659b:	00
  ea659c:	0f 10 94 24 98 00 00 	movups xmm2,XMMWORD PTR [rsp+0x98]
  ea65a3:	00
  ea65a4:	0f 10 9c 24 a8 00 00 	movups xmm3,XMMWORD PTR [rsp+0xa8]
  ea65ab:	00
  ea65ac:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  ea65b3:	00
```
### ref at `0xea6568`

```text
  ea6537:	48 89 c6             	mov    rsi,rax
  ea653a:	ff 51 18             	call   QWORD PTR [rcx+0x18]
  ea653d:	58                   	pop    rax
  ea653e:	c3                   	ret
  ea653f:	48 89 c7             	mov    rdi,rax
  ea6542:	e8 5e 35 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea6547:	cc                   	int3
  ea6548:	53                   	push   rbx
  ea6549:	48 89 fb             	mov    rbx,rdi
  ea654c:	6a 10                	push   0x10
  ea654e:	5f                   	pop    rdi
  ea654f:	e8 ac 79 94 00       	call   17edf00 <_Znwm@plt>
  ea6554:	48 8d 0d 05 b4 98 00 	lea    rcx,[rip+0x98b405]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea655b:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea655e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6562:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6566:	5b                   	pop    rbx
  ea6567:	c3                   	ret
  ea6568:	48 8d 05 f1 b3 98 00 	lea    rax,[rip+0x98b3f1]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea656f:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6572:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6576:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea657a:	c3                   	ret
  ea657b:	cc                   	int3
  ea657c:	53                   	push   rbx
  ea657d:	48 83 ec 60          	sub    rsp,0x60
  ea6581:	4d 89 ca             	mov    r10,r9
  ea6584:	48 89 f0             	mov    rax,rsi
  ea6587:	48 89 fb             	mov    rbx,rdi
  ea658a:	4c 8b 4c 24 70       	mov    r9,QWORD PTR [rsp+0x70]
  ea658f:	0f 10 44 24 78       	movups xmm0,XMMWORD PTR [rsp+0x78]
  ea6594:	0f 10 8c 24 88 00 00 	movups xmm1,XMMWORD PTR [rsp+0x88]
  ea659b:	00
  ea659c:	0f 10 94 24 98 00 00 	movups xmm2,XMMWORD PTR [rsp+0x98]
  ea65a3:	00
  ea65a4:	0f 10 9c 24 a8 00 00 	movups xmm3,XMMWORD PTR [rsp+0xa8]
  ea65ab:	00
  ea65ac:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  ea65b3:	00
  ea65b4:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
  ea65bb:	00
  ea65bc:	0f 10 27             	movups xmm4,XMMWORD PTR [rdi]
  ea65bf:	0f 11 64 24 50       	movups XMMWORD PTR [rsp+0x50],xmm4
  ea65c4:	0f 10 26             	movups xmm4,XMMWORD PTR [rsi]
  ea65c7:	0f 11 64 24 40       	movups XMMWORD PTR [rsp+0x40],xmm4
  ea65cc:	0f 11 5c 24 30       	movups XMMWORD PTR [rsp+0x30],xmm3
  ea65d1:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
  ea65d6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
  ea65db:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  ea65df:	48 89 df             	mov    rdi,rbx
```
### ref at `0xea657c`

```text
  ea6547:	cc                   	int3
  ea6548:	53                   	push   rbx
  ea6549:	48 89 fb             	mov    rbx,rdi
  ea654c:	6a 10                	push   0x10
  ea654e:	5f                   	pop    rdi
  ea654f:	e8 ac 79 94 00       	call   17edf00 <_Znwm@plt>
  ea6554:	48 8d 0d 05 b4 98 00 	lea    rcx,[rip+0x98b405]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea655b:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea655e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6562:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6566:	5b                   	pop    rbx
  ea6567:	c3                   	ret
  ea6568:	48 8d 05 f1 b3 98 00 	lea    rax,[rip+0x98b3f1]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea656f:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6572:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6576:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea657a:	c3                   	ret
  ea657b:	cc                   	int3
  ea657c:	53                   	push   rbx
  ea657d:	48 83 ec 60          	sub    rsp,0x60
  ea6581:	4d 89 ca             	mov    r10,r9
  ea6584:	48 89 f0             	mov    rax,rsi
  ea6587:	48 89 fb             	mov    rbx,rdi
  ea658a:	4c 8b 4c 24 70       	mov    r9,QWORD PTR [rsp+0x70]
  ea658f:	0f 10 44 24 78       	movups xmm0,XMMWORD PTR [rsp+0x78]
  ea6594:	0f 10 8c 24 88 00 00 	movups xmm1,XMMWORD PTR [rsp+0x88]
  ea659b:	00
  ea659c:	0f 10 94 24 98 00 00 	movups xmm2,XMMWORD PTR [rsp+0x98]
  ea65a3:	00
  ea65a4:	0f 10 9c 24 a8 00 00 	movups xmm3,XMMWORD PTR [rsp+0xa8]
  ea65ab:	00
  ea65ac:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  ea65b3:	00
  ea65b4:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
  ea65bb:	00
  ea65bc:	0f 10 27             	movups xmm4,XMMWORD PTR [rdi]
  ea65bf:	0f 11 64 24 50       	movups XMMWORD PTR [rsp+0x50],xmm4
  ea65c4:	0f 10 26             	movups xmm4,XMMWORD PTR [rsi]
  ea65c7:	0f 11 64 24 40       	movups XMMWORD PTR [rsp+0x40],xmm4
  ea65cc:	0f 11 5c 24 30       	movups XMMWORD PTR [rsp+0x30],xmm3
  ea65d1:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
  ea65d6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
  ea65db:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  ea65df:	48 89 df             	mov    rdi,rbx
  ea65e2:	48 89 d6             	mov    rsi,rdx
  ea65e5:	48 89 ca             	mov    rdx,rcx
  ea65e8:	4c 89 c1             	mov    rcx,r8
  ea65eb:	4d 89 d0             	mov    r8,r10
  ea65ee:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea65f1:	48 89 d8             	mov    rax,rbx
```
### ref at `0xea662e`

```text
  ea65f9:	c3                   	ret
  ea65fa:	53                   	push   rbx
  ea65fb:	48 89 fb             	mov    rbx,rdi
  ea65fe:	6a 10                	push   0x10
  ea6600:	5f                   	pop    rdi
  ea6601:	e8 fa 78 94 00       	call   17edf00 <_Znwm@plt>
  ea6606:	48 8d 0d 0b b3 98 00 	lea    rcx,[rip+0x98b30b]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea660d:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea6610:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6614:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6618:	5b                   	pop    rbx
  ea6619:	c3                   	ret
  ea661a:	48 8d 05 f7 b2 98 00 	lea    rax,[rip+0x98b2f7]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea6621:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6624:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6628:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea662c:	c3                   	ret
  ea662d:	cc                   	int3
  ea662e:	53                   	push   rbx
  ea662f:	48 83 ec 10          	sub    rsp,0x10
  ea6633:	4d 89 ca             	mov    r10,r9
  ea6636:	48 89 f0             	mov    rax,rsi
  ea6639:	48 89 fb             	mov    rbx,rdi
  ea663c:	4c 8b 4c 24 20       	mov    r9,QWORD PTR [rsp+0x20]
  ea6641:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
  ea6646:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
  ea664a:	48 89 d6             	mov    rsi,rdx
  ea664d:	48 89 ca             	mov    rdx,rcx
  ea6650:	4c 89 c1             	mov    rcx,r8
  ea6653:	4d 89 d0             	mov    r8,r10
  ea6656:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea6659:	48 89 d8             	mov    rax,rbx
  ea665c:	48 83 c4 10          	add    rsp,0x10
  ea6660:	5b                   	pop    rbx
  ea6661:	c3                   	ret
  ea6662:	48 8d 05 77 b2 98 00 	lea    rax,[rip+0x98b277]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
  ea6669:	48 89 07             	mov    QWORD PTR [rdi],rax
  ea666c:	e9 9f 79 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ea6671:	cc                   	int3
  ea6672:	53                   	push   rbx
  ea6673:	48 89 fb             	mov    rbx,rdi
  ea6676:	e8 e7 ff ff ff       	call   ea6662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6da78>
  ea667b:	48 89 df             	mov    rdi,rbx
  ea667e:	5b                   	pop    rbx
  ea667f:	e9 9c 78 94 00       	jmp    17edf20 <_ZdlPv@plt>
  ea6684:	53                   	push   rbx
  ea6685:	48 89 fb             	mov    rbx,rdi
  ea6688:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
  ea668f:	e8 f2 7d bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ea6694:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
```
### ref at `0xeaaf5c`

```text
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
```
### ref at `0xeaaf6e`

```text
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
```
### ref at `0xeabb76`

```text
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
```
### ref at `0xeabc4e`

```text
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
```
### ref at `0xead1cf`

```text
  ead180:	44 88 69 10          	mov    BYTE PTR [rcx+0x10],r13b
  ead184:	44 88 69 18          	mov    BYTE PTR [rcx+0x18],r13b
  ead188:	0f 57 c0             	xorps  xmm0,xmm0
  ead18b:	0f 11 81 88 00 00 00 	movups XMMWORD PTR [rcx+0x88],xmm0
  ead192:	44 88 a9 98 00 00 00 	mov    BYTE PTR [rcx+0x98],r13b
  ead199:	0f 11 41 20          	movups XMMWORD PTR [rcx+0x20],xmm0
  ead19d:	0f 11 41 30          	movups XMMWORD PTR [rcx+0x30],xmm0
  ead1a1:	0f 11 41 40          	movups XMMWORD PTR [rcx+0x40],xmm0
  ead1a5:	0f 11 41 50          	movups XMMWORD PTR [rcx+0x50],xmm0
  ead1a9:	0f 11 41 60          	movups XMMWORD PTR [rcx+0x60],xmm0
  ead1ad:	0f 11 41 70          	movups XMMWORD PTR [rcx+0x70],xmm0
  ead1b1:	66 83 a1 80 00 00 00 	and    WORD PTR [rcx+0x80],0x0
  ead1b8:	00
  ead1b9:	4b 8d 3c 3c          	lea    rdi,[r12+r15*1]
  ead1bd:	48 8d 05 9c 42 98 00 	lea    rax,[rip+0x98429c]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  ead1c4:	4c 8d 84 24 a0 00 00 	lea    r8,[rsp+0xa0]
  ead1cb:	00
  ead1cc:	49 89 00             	mov    QWORD PTR [r8],rax
  ead1cf:	48 8d 05 0a ac b2 ff 	lea    rax,[rip+0xffffffffffb2ac0a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ead1d6:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
  ead1da:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
  ead1de:	4b 8b 04 3c          	mov    rax,QWORD PTR [r12+r15*1]
  ead1e2:	48 8d 94 24 30 0d 00 	lea    rdx,[rsp+0xd30]
  ead1e9:	00
  ead1ea:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  ead1f1:	00
  ead1f2:	ff 50 30             	call   QWORD PTR [rax+0x30]
  ead1f5:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  ead1fc:	00
  ead1fd:	e8 68 cd bc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ead202:	48 89 e7             	mov    rdi,rsp
  ead205:	e8 ce ed 7b 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  ead20a:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  ead211:	00
  ead212:	e8 b3 a0 7b 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  ead217:	49 8b be b8 00 00 00 	mov    rdi,QWORD PTR [r14+0xb8]
  ead21e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ead221:	ff 50 18             	call   QWORD PTR [rax+0x18]
  ead224:	48 89 df             	mov    rdi,rbx
  ead227:	e8 be e0 c4 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
  ead22c:	48 8d bc 24 80 0d 00 	lea    rdi,[rsp+0xd80]
  ead233:	00
  ead234:	e8 8b 00 00 00       	call   ead2c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x746da>
  ead239:	eb 02                	jmp    ead23d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x74653>
  ead23b:	31 ed                	xor    ebp,ebp
  ead23d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ead244:	00 00
  ead246:	48 3b 84 24 e0 19 00 	cmp    rax,QWORD PTR [rsp+0x19e0]
  ead24d:	00
  ead24e:	75 6e                	jne    ead2be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x746d4>
```
### ref at `0xeb429e`

```text
  eb424a:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
  eb424d:	0f 57 c0             	xorps  xmm0,xmm0
  eb4250:	0f 11 86 a0 00 00 00 	movups XMMWORD PTR [rsi+0xa0],xmm0
  eb4257:	88 86 b0 00 00 00    	mov    BYTE PTR [rsi+0xb0],al
  eb425d:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
  eb4261:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
  eb4265:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
  eb4269:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
  eb426d:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
  eb4271:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
  eb4278:	66 83 a6 98 00 00 00 	and    WORD PTR [rsi+0x98],0x0
  eb427f:	00
  eb4280:	0f 11 86 b8 00 00 00 	movups XMMWORD PTR [rsi+0xb8],xmm0
  eb4287:	48 83 a6 c8 00 00 00 	and    QWORD PTR [rsi+0xc8],0x0
  eb428e:	00
  eb428f:	48 8d 05 ca d1 97 00 	lea    rax,[rip+0x97d1ca]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  eb4296:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
  eb429d:	00
  eb429e:	48 8d 05 3b 3b b2 ff 	lea    rax,[rip+0xffffffffffb23b3b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  eb42a5:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
  eb42ac:	00
  eb42ad:	4c 89 b4 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],r14
  eb42b4:	00
  eb42b5:	48 89 df             	mov    rdi,rbx
  eb42b8:	4c 89 f2             	mov    rdx,r14
  eb42bb:	e8 8e b4 ff ff       	call   eaf74e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76b64>
  eb42c0:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
  eb42c7:	00
  eb42c8:	e8 9d 5c bc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  eb42cd:	48 89 e7             	mov    rdi,rsp
  eb42d0:	e8 c5 2d 7b 00       	call   166709a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b206>
  eb42d5:	e9 a9 00 00 00       	jmp    eb4383 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7b799>
  eb42da:	31 c0                	xor    eax,eax
  eb42dc:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
  eb42e3:	00
  eb42e4:	88 46 13             	mov    BYTE PTR [rsi+0x13],al
  eb42e7:	83 26 00             	and    DWORD PTR [rsi],0x0
  eb42ea:	88 46 18             	mov    BYTE PTR [rsi+0x18],al
  eb42ed:	88 46 20             	mov    BYTE PTR [rsi+0x20],al
  eb42f0:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
  eb42f3:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
  eb42f6:	0f 57 c0             	xorps  xmm0,xmm0
  eb42f9:	0f 11 86 a0 00 00 00 	movups XMMWORD PTR [rsi+0xa0],xmm0
  eb4300:	88 86 b0 00 00 00    	mov    BYTE PTR [rsi+0xb0],al
  eb4306:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
  eb430a:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
  eb430e:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
  eb4312:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
  eb4316:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
  eb431a:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
```
### ref at `0xeb4347`

```text
  eb42f3:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
  eb42f6:	0f 57 c0             	xorps  xmm0,xmm0
  eb42f9:	0f 11 86 a0 00 00 00 	movups XMMWORD PTR [rsi+0xa0],xmm0
  eb4300:	88 86 b0 00 00 00    	mov    BYTE PTR [rsi+0xb0],al
  eb4306:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
  eb430a:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
  eb430e:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
  eb4312:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
  eb4316:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
  eb431a:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
  eb4321:	66 83 a6 98 00 00 00 	and    WORD PTR [rsi+0x98],0x0
  eb4328:	00
  eb4329:	0f 11 86 b8 00 00 00 	movups XMMWORD PTR [rsi+0xb8],xmm0
  eb4330:	48 83 a6 c8 00 00 00 	and    QWORD PTR [rsi+0xc8],0x0
  eb4337:	00
  eb4338:	48 8d 05 21 d1 97 00 	lea    rax,[rip+0x97d121]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  eb433f:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
  eb4346:	00
  eb4347:	48 8d 05 92 3a b2 ff 	lea    rax,[rip+0xffffffffffb23a92]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  eb434e:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
  eb4355:	00
  eb4356:	4c 89 b4 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],r14
  eb435d:	00
  eb435e:	48 89 df             	mov    rdi,rbx
  eb4361:	4c 89 f2             	mov    rdx,r14
  eb4364:	e8 53 b2 ff ff       	call   eaf5bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x769d2>
  eb4369:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
  eb4370:	00
  eb4371:	e8 f4 5b bc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  eb4376:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  eb437d:	00
  eb437e:	e8 17 2d 7b 00       	call   166709a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b206>
  eb4383:	48 8d bc 24 18 06 00 	lea    rdi,[rsp+0x618]
  eb438a:	00
  eb438b:	e8 ce 34 ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  eb4390:	48 8d bc 24 40 0b 00 	lea    rdi,[rsp+0xb40]
  eb4397:	00
  eb4398:	e8 7b 01 00 00       	call   eb4518 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7b92e>
  eb439d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eb43a4:	00 00
  eb43a6:	48 3b 84 24 90 0b 00 	cmp    rax,QWORD PTR [rsp+0xb90]
  eb43ad:	00
  eb43ae:	0f 85 9a 00 00 00    	jne    eb444e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7b864>
  eb43b4:	48 81 c4 98 0b 00 00 	add    rsp,0xb98
  eb43bb:	5b                   	pop    rbx
  eb43bc:	41 5e                	pop    r14
  eb43be:	41 5f                	pop    r15
  eb43c0:	5d                   	pop    rbp
  eb43c1:	c3                   	ret
  eb43c2:	48 89 c3             	mov    rbx,rax
```
### ref at `0xebf8ca`

```text
  ebf872:	0f 11 86 a0 00 00 00 	movups XMMWORD PTR [rsi+0xa0],xmm0
  ebf879:	88 86 b0 00 00 00    	mov    BYTE PTR [rsi+0xb0],al
  ebf87f:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
  ebf883:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
  ebf887:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
  ebf88b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
  ebf88f:	66 83 a6 98 00 00 00 	and    WORD PTR [rsi+0x98],0x0
  ebf896:	00
  ebf897:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
  ebf89b:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
  ebf8a2:	0f 11 86 b8 00 00 00 	movups XMMWORD PTR [rsi+0xb8],xmm0
  ebf8a9:	c7 46 14 03 00 00 00 	mov    DWORD PTR [rsi+0x14],0x3
  ebf8b0:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
  ebf8b5:	4c 89 ff             	mov    rdi,r15
  ebf8b8:	e8 cb 84 7a 00       	call   1667d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bef4>
  ebf8bd:	48 8d 05 9c 1b 97 00 	lea    rax,[rip+0x971b9c]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  ebf8c4:	48 89 e2             	mov    rdx,rsp
  ebf8c7:	48 89 02             	mov    QWORD PTR [rdx],rax
  ebf8ca:	48 8d 05 0f 85 b1 ff 	lea    rax,[rip+0xffffffffffb1850f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ebf8d1:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
  ebf8d5:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
  ebf8d9:	4c 89 f7             	mov    rdi,r14
  ebf8dc:	4c 89 fe             	mov    rsi,r15
  ebf8df:	e8 46 fb fe ff       	call   eaf42a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76840>
  ebf8e4:	48 89 e7             	mov    rdi,rsp
  ebf8e7:	e8 7e a6 bb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ebf8ec:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  ebf8f1:	e8 ea 84 7a 00       	call   1667de0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf4c>
  ebf8f6:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  ebf8fd:	00
  ebf8fe:	e8 dd 84 7a 00       	call   1667de0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf4c>
  ebf903:	eb 2a                	jmp    ebf92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86d45>
  ebf905:	49 81 c7 68 05 00 00 	add    r15,0x568
  ebf90c:	48 8d 35 fd cf 57 ff 	lea    rsi,[rip+0xffffffffff57cffd]        # 43c910 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x251c>
  ebf913:	4c 89 ff             	mov    rdi,r15
  ebf916:	e8 69 ad fc ff       	call   e8a684 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a9a>
  ebf91b:	84 c0                	test   al,al
  ebf91d:	74 10                	je     ebf92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86d45>
  ebf91f:	49 8b be 28 01 00 00 	mov    rdi,QWORD PTR [r14+0x128]
  ebf926:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ebf929:	6a 0d                	push   0xd
  ebf92b:	5e                   	pop    rsi
  ebf92c:	ff 50 20             	call   QWORD PTR [rax+0x20]
  ebf92f:	49 83 c6 18          	add    r14,0x18
  ebf933:	4c 89 f7             	mov    rdi,r14
  ebf936:	48 89 de             	mov    rsi,rbx
  ebf939:	e8 84 b6 f4 ff       	call   e0afc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8048>
  ebf93e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ebf945:	00 00
  ebf947:	48 3b 84 24 c8 01 00 	cmp    rax,QWORD PTR [rsp+0x1c8]
```
### ref at `0xec06bd`

```text
  ec0664:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
  ec066b:	88 86 c0 00 00 00    	mov    BYTE PTR [rsi+0xc0],al
  ec0671:	88 86 c4 00 00 00    	mov    BYTE PTR [rsi+0xc4],al
  ec0677:	0f 11 86 c8 00 00 00 	movups XMMWORD PTR [rsi+0xc8],xmm0
  ec067e:	0f 11 86 d8 00 00 00 	movups XMMWORD PTR [rsi+0xd8],xmm0
  ec0685:	48 83 26 00          	and    QWORD PTR [rsi],0x0
  ec0689:	66 83 66 08 00       	and    WORD PTR [rsi+0x8],0x0
  ec068e:	c7 86 e8 00 00 00 00 	mov    DWORD PTR [rsi+0xe8],0x3f800000
  ec0695:	00 80 3f
  ec0698:	c7 06 00 01 00 01    	mov    DWORD PTR [rsi],0x1000100
  ec069e:	b0 01                	mov    al,0x1
  ec06a0:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  ec06a3:	88 46 06             	mov    BYTE PTR [rsi+0x6],al
  ec06a6:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  ec06ab:	e8 42 6e 7a 00       	call   16674f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b65e>
  ec06b0:	48 8d 05 a9 0d 97 00 	lea    rax,[rip+0x970da9]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  ec06b7:	48 89 e2             	mov    rdx,rsp
  ec06ba:	48 89 02             	mov    QWORD PTR [rdx],rax
  ec06bd:	48 8d 05 1c 77 b1 ff 	lea    rax,[rip+0xffffffffffb1771c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ec06c4:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
  ec06c8:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
  ec06cc:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
  ec06d1:	48 89 df             	mov    rdi,rbx
  ec06d4:	e8 21 01 ff ff       	call   eb07fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77c10>
  ec06d9:	48 89 e7             	mov    rdi,rsp
  ec06dc:	e8 89 98 bb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ec06e1:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  ec06e6:	e8 e9 6d 7a 00       	call   16674d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b640>
  ec06eb:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
  ec06f2:	00
  ec06f3:	e8 dc 6d 7a 00       	call   16674d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b640>
  ec06f8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ec06ff:	00 00
  ec0701:	48 3b 84 24 18 02 00 	cmp    rax,QWORD PTR [rsp+0x218]
  ec0708:	00
  ec0709:	75 4b                	jne    ec0756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87b6c>
  ec070b:	48 81 c4 20 02 00 00 	add    rsp,0x220
  ec0712:	5b                   	pop    rbx
  ec0713:	c3                   	ret
  ec0714:	48 89 c3             	mov    rbx,rax
  ec0717:	48 89 e7             	mov    rdi,rsp
  ec071a:	e8 4b 98 bb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ec071f:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  ec0724:	e8 ab 6d 7a 00       	call   16674d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b640>
  ec0729:	eb 03                	jmp    ec072e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87b44>
  ec072b:	48 89 c3             	mov    rbx,rax
  ec072e:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
  ec0735:	00
  ec0736:	e8 99 6d 7a 00       	call   16674d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b640>
  ec073b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
```
### ref at `0xec484f`

```text
  ec4802:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  ec4807:	4c 89 f6             	mov    rsi,r14
  ec480a:	e8 2f bb 80 00       	call   16d033e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844aa>
  ec480f:	4c 89 f7             	mov    rdi,r14
  ec4812:	e8 79 bb 80 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
  ec4817:	48 8d bc 24 20 09 00 	lea    rdi,[rsp+0x920]
  ec481e:	00
  ec481f:	48 89 de             	mov    rsi,rbx
  ec4822:	e8 59 98 92 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  ec4827:	48 8b 5d 08          	mov    rbx,QWORD PTR [rbp+0x8]
  ec482b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  ec4830:	48 8d b4 24 08 05 00 	lea    rsi,[rsp+0x508]
  ec4837:	00
  ec4838:	e8 0b 39 7a 00       	call   1668148 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2b4>
  ec483d:	48 8d 05 1c cc 96 00 	lea    rax,[rip+0x96cc1c]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
  ec4844:	48 8d 94 24 f0 09 00 	lea    rdx,[rsp+0x9f0]
  ec484b:	00
  ec484c:	48 89 02             	mov    QWORD PTR [rdx],rax
  ec484f:	48 8d 05 8a 35 b1 ff 	lea    rax,[rip+0xffffffffffb1358a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ec4856:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
  ec485a:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
  ec485e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  ec4861:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  ec4866:	48 89 df             	mov    rdi,rbx
  ec4869:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
  ec486f:	48 8d bc 24 f0 09 00 	lea    rdi,[rsp+0x9f0]
  ec4876:	00
  ec4877:	e8 ee 56 bb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ec487c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  ec4881:	e8 90 38 7a 00       	call   1668116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c282>
  ec4886:	48 8d bc 24 08 05 00 	lea    rdi,[rsp+0x508]
  ec488d:	00
  ec488e:	e8 83 38 7a 00       	call   1668116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c282>
  ec4893:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  ec4898:	e8 f3 95 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ec489d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ec48a4:	00 00
  ec48a6:	48 3b 84 24 20 0a 00 	cmp    rax,QWORD PTR [rsp+0xa20]
  ec48ad:	00
  ec48ae:	75 70                	jne    ec4920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8bd36>
  ec48b0:	48 81 c4 28 0a 00 00 	add    rsp,0xa28
  ec48b7:	5b                   	pop    rbx
  ec48b8:	41 5c                	pop    r12
  ec48ba:	41 5d                	pop    r13
  ec48bc:	41 5e                	pop    r14
  ec48be:	41 5f                	pop    r15
  ec48c0:	5d                   	pop    rbp
  ec48c1:	c3                   	ret
  ec48c2:	eb 04                	jmp    ec48c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8bcde>
  ec48c4:	eb 02                	jmp    ec48c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8bcde>
```
### ref at `0xef78c1`

```text
  ef7880:	49 01 ed             	add    r13,rbp
  ef7883:	49 01 df             	add    r15,rbx
  ef7886:	49 83 c7 30          	add    r15,0x30
  ef788a:	4c 89 ed             	mov    rbp,r13
  ef788d:	4d 85 ed             	test   r13,r13
  ef7890:	75 d4                	jne    ef7866 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbec7c>
  ef7892:	4d 39 f7             	cmp    r15,r14
  ef7895:	74 13                	je     ef78aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbecc0>
  ef7897:	4c 89 e7             	mov    rdi,r12
  ef789a:	4c 89 fe             	mov    rsi,r15
  ef789d:	e8 17 43 c0 ff       	call   afbbb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48b59>
  ef78a2:	84 c0                	test   al,al
  ef78a4:	0f 89 b1 00 00 00    	jns    ef795b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbed71>
  ef78aa:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
  ef78af:	49 c7 46 f8 04 00 00 	mov    QWORD PTR [r14-0x8],0x4
  ef78b6:	00
  ef78b7:	48 8d 05 8c 99 44 ff 	lea    rax,[rip+0xffffffffff44998c]        # 34124a <_ZTSSt12bad_any_cast@@Base-0x4ef7e>
  ef78be:	49 89 06             	mov    QWORD PTR [r14],rax
  ef78c1:	48 8d 05 18 05 ae ff 	lea    rax,[rip+0xffffffffffae0518]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ef78c8:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  ef78cc:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  ef78d1:	4c 89 e6             	mov    rsi,r12
  ef78d4:	e8 67 66 8f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  ef78d9:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  ef78de:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  ef78e3:	e8 ba 06 00 00       	call   ef7fa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf3b8>
  ef78e8:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  ef78ed:	4c 8b 38             	mov    r15,QWORD PTR [rax]
  ef78f0:	48 8b 68 08          	mov    rbp,QWORD PTR [rax+0x8]
  ef78f4:	48 85 ed             	test   rbp,rbp
  ef78f7:	74 34                	je     ef792d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbed43>
  ef78f9:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
  ef78fe:	49 89 ed             	mov    r13,rbp
  ef7901:	49 d1 ed             	shr    r13,1
  ef7904:	49 6b dd 30          	imul   rbx,r13,0x30
  ef7908:	49 8d 34 1f          	lea    rsi,[r15+rbx*1]
  ef790c:	4c 89 e7             	mov    rdi,r12
  ef790f:	e8 a5 42 c0 ff       	call   afbbb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48b59>
  ef7914:	84 c0                	test   al,al
  ef7916:	78 0d                	js     ef7925 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbed3b>
  ef7918:	49 f7 d5             	not    r13
  ef791b:	49 01 ed             	add    r13,rbp
  ef791e:	49 01 df             	add    r15,rbx
  ef7921:	49 83 c7 30          	add    r15,0x30
  ef7925:	4c 89 ed             	mov    rbp,r13
  ef7928:	4d 85 ed             	test   r13,r13
  ef792b:	75 d4                	jne    ef7901 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbed17>
  ef792d:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
  ef7932:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  ef7937:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
```
### ref at `0xef7fb4`

```text
  ef7f78:	48 83 c6 18          	add    rsi,0x18
  ef7f7c:	e9 21 00 00 00       	jmp    ef7fa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf3b8>
  ef7f81:	cc                   	int3
  ef7f82:	53                   	push   rbx
  ef7f83:	48 89 fb             	mov    rbx,rdi
  ef7f86:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  ef7f89:	48 3b 7b 08          	cmp    rdi,QWORD PTR [rbx+0x8]
  ef7f8d:	74 11                	je     ef7fa0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf3b6>
  ef7f8f:	e8 d0 3a f8 ff       	call   e7ba64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42e7a>
  ef7f94:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  ef7f97:	48 83 c7 30          	add    rdi,0x30
  ef7f9b:	48 89 3b             	mov    QWORD PTR [rbx],rdi
  ef7f9e:	eb e9                	jmp    ef7f89 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf39f>
  ef7fa0:	5b                   	pop    rbx
  ef7fa1:	c3                   	ret
  ef7fa2:	48 c7 07 04 00 00 00 	mov    QWORD PTR [rdi],0x4
  ef7fa9:	48 8d 05 9a 92 44 ff 	lea    rax,[rip+0xffffffffff44929a]        # 34124a <_ZTSSt12bad_any_cast@@Base-0x4ef7e>
  ef7fb0:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  ef7fb4:	48 8d 05 25 fe ad ff 	lea    rax,[rip+0xffffffffffadfe25]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  ef7fbb:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  ef7fbf:	e9 36 57 8c 00       	jmp    17bd6fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171866>
  ef7fc4:	41 56                	push   r14
  ef7fc6:	53                   	push   rbx
  ef7fc7:	50                   	push   rax
  ef7fc8:	48 89 f3             	mov    rbx,rsi
  ef7fcb:	49 89 fe             	mov    r14,rdi
  ef7fce:	e8 5b 3a b8 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
  ef7fd3:	48 83 c3 18          	add    rbx,0x18
  ef7fd7:	49 8d 7e 18          	lea    rdi,[r14+0x18]
  ef7fdb:	48 89 de             	mov    rsi,rbx
  ef7fde:	e8 17 57 8c 00       	call   17bd6fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171866>
  ef7fe3:	4c 89 f0             	mov    rax,r14
  ef7fe6:	48 83 c4 08          	add    rsp,0x8
  ef7fea:	5b                   	pop    rbx
  ef7feb:	41 5e                	pop    r14
  ef7fed:	c3                   	ret
  ef7fee:	41 57                	push   r15
  ef7ff0:	41 56                	push   r14
  ef7ff2:	53                   	push   rbx
  ef7ff3:	48 83 ec 30          	sub    rsp,0x30
  ef7ff7:	49 89 f6             	mov    r14,rsi
  ef7ffa:	48 89 fb             	mov    rbx,rdi
  ef7ffd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ef8004:	00 00
  ef8006:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  ef800b:	49 89 e7             	mov    r15,rsp
  ef800e:	4c 89 ff             	mov    rdi,r15
  ef8011:	e8 54 55 8c 00       	call   17bd56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1716d6>
  ef8016:	4c 89 ff             	mov    rdi,r15
  ef8019:	4c 89 f6             	mov    rsi,r14
```
### ref at `0xf1bf65`

```text
  f1bf23:	48 89 41 40          	mov    QWORD PTR [rcx+0x40],rax
  f1bf27:	0f 29 8c 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm1
  f1bf2e:	00
  f1bf2f:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
  f1bf36:	00 00
  f1bf38:	49 8b 06             	mov    rax,QWORD PTR [r14]
  f1bf3b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f1bf40:	4c 89 f6             	mov    rsi,r14
  f1bf43:	4c 89 fa             	mov    rdx,r15
  f1bf46:	ff 50 10             	call   QWORD PTR [rax+0x10]
  f1bf49:	4c 8b 74 24 50       	mov    r14,QWORD PTR [rsp+0x50]
  f1bf4e:	4d 85 f6             	test   r14,r14
  f1bf51:	74 62                	je     f1bfb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe33cb>
  f1bf53:	6a 18                	push   0x18
  f1bf55:	5f                   	pop    rdi
  f1bf56:	e8 a5 1f 8d 00       	call   17edf00 <_Znwm@plt>
  f1bf5b:	48 8d 0d 0c 0e 00 00 	lea    rcx,[rip+0xe0c]        # f1cd6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4184>
  f1bf62:	48 89 08             	mov    QWORD PTR [rax],rcx
  f1bf65:	48 8d 0d 74 be ab ff 	lea    rcx,[rip+0xffffffffffabbe74]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  f1bf6c:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  f1bf70:	4c 89 f7             	mov    rdi,r14
  f1bf73:	48 89 c6             	mov    rsi,rax
  f1bf76:	e8 49 d8 fa ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
  f1bf7b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f1bf80:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
  f1bf83:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
  f1bf87:	0f 57 c0             	xorps  xmm0,xmm0
  f1bf8a:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  f1bf8d:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
  f1bf92:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  f1bf96:	4c 89 fe             	mov    rsi,r15
  f1bf99:	e8 7e d8 b9 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  f1bf9e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  f1bfa2:	e8 df 24 b8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f1bfa7:	49 83 3c 24 fd       	cmp    QWORD PTR [r12],0xfffffffffffffffd
  f1bfac:	76 11                	jbe    f1bfbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe33d5>
  f1bfae:	31 c0                	xor    eax,eax
  f1bfb0:	45 31 e4             	xor    r12d,r12d
  f1bfb3:	eb 1b                	jmp    f1bfd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe33e6>
  f1bfb5:	0f 57 c0             	xorps  xmm0,xmm0
  f1bfb8:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
  f1bfbd:	eb 2a                	jmp    f1bfe9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe33ff>
  f1bfbf:	4d 85 f6             	test   r14,r14
  f1bfc2:	74 0a                	je     f1bfce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe33e4>
  f1bfc4:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  f1bfc9:	4c 89 f0             	mov    rax,r14
  f1bfcc:	eb 02                	jmp    f1bfd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe33e6>
  f1bfce:	31 c0                	xor    eax,eax
  f1bfd0:	4c 89 64 24 60       	mov    QWORD PTR [rsp+0x60],r12
  f1bfd5:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
```
### ref at `0xf1c200`

```text
  f1c1ba:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  f1c1c1:	00
  f1c1c2:	48 8d 94 24 80 06 00 	lea    rdx,[rsp+0x680]
  f1c1c9:	00
  f1c1ca:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]
  f1c1cf:	4c 8d 84 24 28 06 00 	lea    r8,[rsp+0x628]
  f1c1d6:	00
  f1c1d7:	4c 89 e6             	mov    rsi,r12
  f1c1da:	ff 50 18             	call   QWORD PTR [rax+0x18]
  f1c1dd:	4c 8b b4 24 80 00 00 	mov    r14,QWORD PTR [rsp+0x80]
  f1c1e4:	00
  f1c1e5:	4d 85 f6             	test   r14,r14
  f1c1e8:	0f 84 12 01 00 00    	je     f1c300 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3716>
  f1c1ee:	6a 18                	push   0x18
  f1c1f0:	5f                   	pop    rdi
  f1c1f1:	e8 0a 1d 8d 00       	call   17edf00 <_Znwm@plt>
  f1c1f6:	48 8d 0d 29 07 00 00 	lea    rcx,[rip+0x729]        # f1c926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3d3c>
  f1c1fd:	48 89 08             	mov    QWORD PTR [rax],rcx
  f1c200:	48 8d 0d d9 bb ab ff 	lea    rcx,[rip+0xffffffffffabbbd9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  f1c207:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  f1c20b:	4c 89 f7             	mov    rdi,r14
  f1c20e:	48 89 c6             	mov    rsi,rax
  f1c211:	e8 ae d5 fa ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
  f1c216:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  f1c21d:	00
  f1c21e:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
  f1c221:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
  f1c225:	0f 57 c0             	xorps  xmm0,xmm0
  f1c228:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  f1c22b:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
  f1c230:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  f1c234:	4c 89 fe             	mov    rsi,r15
  f1c237:	e8 e0 d5 b9 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  f1c23c:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  f1c240:	e8 41 22 b8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f1c245:	49 83 3c 24 fd       	cmp    QWORD PTR [r12],0xfffffffffffffffd
  f1c24a:	0f 86 c0 00 00 00    	jbe    f1c310 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3726>
  f1c250:	31 c0                	xor    eax,eax
  f1c252:	45 31 e4             	xor    r12d,r12d
  f1c255:	e9 f5 01 00 00       	jmp    f1c44f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3865>
  f1c25a:	48 8d 35 df 8d 4b ff 	lea    rsi,[rip+0xffffffffff4b8ddf]        # 3d5040 <_ZTSN5boost17bad_function_callE@@Base+0x2386>
  f1c261:	4c 89 f7             	mov    rdi,r14
  f1c264:	e8 85 34 b8 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
  f1c269:	84 c0                	test   al,al
  f1c26b:	0f 84 01 03 00 00    	je     f1c572 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3988>
  f1c271:	48 8d bc 24 18 05 00 	lea    rdi,[rsp+0x518]
  f1c278:	00
  f1c279:	48 8d b4 24 c8 05 00 	lea    rsi,[rsp+0x5c8]
  f1c280:	00
  f1c281:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
```
### ref at `0xf1c3d1`

```text
  f1c38c:	48 89 de             	mov    rsi,rbx
  f1c38f:	e8 c6 03 00 00       	call   f1c75a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3b70>
  f1c394:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  f1c398:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  f1c39d:	48 8d 94 24 28 06 00 	lea    rdx,[rsp+0x628]
  f1c3a4:	00
  f1c3a5:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
  f1c3aa:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
  f1c3af:	4c 89 e6             	mov    rsi,r12
  f1c3b2:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f1c3b5:	4c 8b 74 24 70       	mov    r14,QWORD PTR [rsp+0x70]
  f1c3ba:	4d 85 f6             	test   r14,r14
  f1c3bd:	74 68                	je     f1c427 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe383d>
  f1c3bf:	6a 18                	push   0x18
  f1c3c1:	5f                   	pop    rdi
  f1c3c2:	e8 39 1b 8d 00       	call   17edf00 <_Znwm@plt>
  f1c3c7:	48 8d 0d fc 05 00 00 	lea    rcx,[rip+0x5fc]        # f1c9ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3de0>
  f1c3ce:	48 89 08             	mov    QWORD PTR [rax],rcx
  f1c3d1:	48 8d 0d 08 ba ab ff 	lea    rcx,[rip+0xffffffffffabba08]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  f1c3d8:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  f1c3dc:	4c 89 f7             	mov    rdi,r14
  f1c3df:	48 89 c6             	mov    rsi,rax
  f1c3e2:	e8 dd d3 fa ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
  f1c3e7:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  f1c3ec:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
  f1c3ef:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
  f1c3f3:	0f 57 c0             	xorps  xmm0,xmm0
  f1c3f6:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  f1c3f9:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
  f1c400:	00
  f1c401:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  f1c405:	4c 89 fe             	mov    rsi,r15
  f1c408:	e8 0f d4 b9 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  f1c40d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  f1c411:	e8 70 20 b8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f1c416:	49 83 3c 24 fd       	cmp    QWORD PTR [r12],0xfffffffffffffffd
  f1c41b:	76 1a                	jbe    f1c437 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe384d>
  f1c41d:	31 c0                	xor    eax,eax
  f1c41f:	45 31 e4             	xor    r12d,r12d
  f1c422:	e9 b7 00 00 00       	jmp    f1c4de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe38f4>
  f1c427:	0f 57 c0             	xorps  xmm0,xmm0
  f1c42a:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
  f1c431:	00
  f1c432:	e9 c6 00 00 00       	jmp    f1c4fd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3913>
  f1c437:	4d 85 f6             	test   r14,r14
  f1c43a:	0f 84 9c 00 00 00    	je     f1c4dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe38f2>
  f1c440:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  f1c445:	4c 89 f0             	mov    rax,r14
  f1c448:	e9 91 00 00 00       	jmp    f1c4de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe38f4>
  f1c44d:	31 c0                	xor    eax,eax
```
### ref at `0xfe018e`

```text
  fe0144:	48 89 03             	mov    QWORD PTR [rbx],rax
  fe0147:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
  fe014b:	49 89 9f e0 00 00 00 	mov    QWORD PTR [r15+0xe0],rbx
  fe0152:	49 ff 87 f0 00 00 00 	inc    QWORD PTR [r15+0xf0]
  fe0159:	4c 89 ef             	mov    rdi,r13
  fe015c:	4c 89 e6             	mov    rsi,r12
  fe015f:	e8 16 03 6f 00       	call   16d047a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x845e6>
  fe0164:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
  fe0167:	4d 85 ed             	test   r13,r13
  fe016a:	0f 84 a2 00 00 00    	je     fe0212 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7628>
  fe0170:	6a 20                	push   0x20
  fe0172:	5f                   	pop    rdi
  fe0173:	e8 88 dd 80 00       	call   17edf00 <_Znwm@plt>
  fe0178:	49 89 c4             	mov    r12,rax
  fe017b:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
  fe017f:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
  fe0183:	48 8d 05 82 07 00 00 	lea    rax,[rip+0x782]        # fe090c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7d22>
  fe018a:	49 89 04 24          	mov    QWORD PTR [r12],rax
  fe018e:	48 8d 05 4b 7c 9f ff 	lea    rax,[rip+0xffffffffff9f7c4b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  fe0195:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
  fe019a:	41 80 7d 40 00       	cmp    BYTE PTR [r13+0x40],0x0
  fe019f:	74 33                	je     fe01d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a75ea>
  fe01a1:	49 8d 75 28          	lea    rsi,[r13+0x28]
  fe01a5:	4d 8b 7d 00          	mov    r15,QWORD PTR [r13+0x0]
  fe01a9:	31 d2                	xor    edx,edx
  fe01ab:	49 83 ff fe          	cmp    r15,0xfffffffffffffffe
  fe01af:	0f 93 c2             	setae  dl
  fe01b2:	4c 89 e7             	mov    rdi,r12
  fe01b5:	e8 52 07 00 00       	call   fe090c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7d22>
  fe01ba:	49 83 ff fe          	cmp    r15,0xfffffffffffffffe
  fe01be:	72 14                	jb     fe01d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a75ea>
  fe01c0:	4c 89 e7             	mov    rdi,r12
  fe01c3:	41 ff 54 24 08       	call   QWORD PTR [r12+0x8]
  fe01c8:	4c 89 e7             	mov    rdi,r12
  fe01cb:	e8 50 dd 80 00       	call   17edf20 <_ZdlPv@plt>
  fe01d0:	6a fe                	push   0xfffffffffffffffe
  fe01d2:	41 5c                	pop    r12
  fe01d4:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12
  fe01d8:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
  fe01db:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
  fe01df:	0f 57 c0             	xorps  xmm0,xmm0
  fe01e2:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
  fe01e6:	49 89 e4             	mov    r12,rsp
  fe01e9:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
  fe01ee:	4c 89 f7             	mov    rdi,r14
  fe01f1:	4c 89 e6             	mov    rsi,r12
  fe01f4:	e8 23 96 ad ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fe01f9:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  fe01fe:	e8 83 e2 ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fe0203:	49 83 7d 00 fd       	cmp    QWORD PTR [r13+0x0],0xfffffffffffffffd
```
### ref at `0xfe241e`

```text
  fe23d6:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
  fe23db:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
  fe23df:	49 8d 74 24 30       	lea    rsi,[r12+0x30]
  fe23e4:	e8 ab 0a e5 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
  fe23e9:	41 8a 44 24 58       	mov    al,BYTE PTR [r12+0x58]
  fe23ee:	88 43 78             	mov    BYTE PTR [rbx+0x78],al
  fe23f1:	41 0f 10 44 24 48    	movups xmm0,XMMWORD PTR [r12+0x48]
  fe23f7:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
  fe23fb:	4d 8b 75 00          	mov    r14,QWORD PTR [r13+0x0]
  fe23ff:	4d 85 f6             	test   r14,r14
  fe2402:	74 6c                	je     fe2470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9886>
  fe2404:	6a 20                	push   0x20
  fe2406:	5f                   	pop    rdi
  fe2407:	e8 f4 ba 80 00       	call   17edf00 <_Znwm@plt>
  fe240c:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
  fe2410:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
  fe2414:	48 8d 0d 69 03 00 00 	lea    rcx,[rip+0x369]        # fe2784 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9b9a>
  fe241b:	48 89 08             	mov    QWORD PTR [rax],rcx
  fe241e:	48 8d 0d bb 59 9f ff 	lea    rcx,[rip+0xffffffffff9f59bb]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  fe2425:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  fe2429:	4c 89 f7             	mov    rdi,r14
  fe242c:	48 89 c6             	mov    rsi,rax
  fe242f:	e8 c8 04 00 00       	call   fe28fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9d12>
  fe2434:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  fe2438:	4d 8b 7d 08          	mov    r15,QWORD PTR [r13+0x8]
  fe243c:	0f 57 c0             	xorps  xmm0,xmm0
  fe243f:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
  fe2444:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  fe2449:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  fe244d:	4c 89 ef             	mov    rdi,r13
  fe2450:	4c 89 f6             	mov    rsi,r14
  fe2453:	e8 c4 73 ad ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fe2458:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fe245c:	e8 25 c0 ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fe2461:	49 83 3c 24 fd       	cmp    QWORD PTR [r12],0xfffffffffffffffd
  fe2466:	76 0d                	jbe    fe2475 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a988b>
  fe2468:	45 31 f6             	xor    r14d,r14d
  fe246b:	45 31 e4             	xor    r12d,r12d
  fe246e:	eb 17                	jmp    fe2487 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a989d>
  fe2470:	45 31 f6             	xor    r14d,r14d
  fe2473:	eb 48                	jmp    fe24bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a98d3>
  fe2475:	4d 85 ff             	test   r15,r15
  fe2478:	74 0a                	je     fe2484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a989a>
  fe247a:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  fe247f:	4d 89 fe             	mov    r14,r15
  fe2482:	eb 03                	jmp    fe2487 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a989d>
  fe2484:	45 31 f6             	xor    r14d,r14d
  fe2487:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
  fe248c:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
  fe2491:	31 ff                	xor    edi,edi
```
### ref at `0xfe2a86`

```text
  fe2a44:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
  fe2a4b:	00
  fe2a4c:	49 8b 76 40          	mov    rsi,QWORD PTR [r14+0x40]
  fe2a50:	48 85 f6             	test   rsi,rsi
  fe2a53:	0f 84 8f 09 00 00    	je     fe33e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa7fe>
  fe2a59:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fe2a5c:	48 89 ef             	mov    rdi,rbp
  fe2a5f:	4c 89 e2             	mov    rdx,r12
  fe2a62:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
  fe2a69:	00
  fe2a6a:	ff 50 30             	call   QWORD PTR [rax+0x30]
  fe2a6d:	4c 8b bc 24 20 01 00 	mov    r15,QWORD PTR [rsp+0x120]
  fe2a74:	00
  fe2a75:	4d 85 ff             	test   r15,r15
  fe2a78:	0f 84 ff 00 00 00    	je     fe2b7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9f93>
  fe2a7e:	6a 18                	push   0x18
  fe2a80:	5f                   	pop    rdi
  fe2a81:	e8 7a b4 80 00       	call   17edf00 <_Znwm@plt>
  fe2a86:	48 8d 0d 53 53 9f ff 	lea    rcx,[rip+0xffffffffff9f5353]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  fe2a8d:	48 89 08             	mov    QWORD PTR [rax],rcx
  fe2a90:	48 8d 0d 49 53 9f ff 	lea    rcx,[rip+0xffffffffff9f5349]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  fe2a97:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  fe2a9b:	4c 89 ff             	mov    rdi,r15
  fe2a9e:	48 89 c6             	mov    rsi,rax
  fe2aa1:	e8 04 31 f9 ff       	call   f75baa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13cfc0>
  fe2aa6:	4c 8b bc 24 20 01 00 	mov    r15,QWORD PTR [rsp+0x120]
  fe2aad:	00
  fe2aae:	4c 8b ac 24 28 01 00 	mov    r13,QWORD PTR [rsp+0x128]
  fe2ab5:	00
  fe2ab6:	66 0f ef c0          	pxor   xmm0,xmm0
  fe2aba:	66 0f 7f 84 24 20 01 	movdqa XMMWORD PTR [rsp+0x120],xmm0
  fe2ac1:	00 00
  fe2ac3:	66 0f 7f 84 24 20 02 	movdqa XMMWORD PTR [rsp+0x220],xmm0
  fe2aca:	00 00
  fe2acc:	48 89 ef             	mov    rdi,rbp
  fe2acf:	48 8d b4 24 20 02 00 	lea    rsi,[rsp+0x220]
  fe2ad6:	00
  fe2ad7:	e8 40 6d ad ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fe2adc:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
  fe2ae3:	00
  fe2ae4:	e8 9d b9 ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fe2ae9:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
  fe2aed:	0f 86 99 00 00 00    	jbe    fe2b8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9fa2>
  fe2af3:	31 c0                	xor    eax,eax
  fe2af5:	45 31 ff             	xor    r15d,r15d
  fe2af8:	e9 4b 01 00 00       	jmp    fe2c48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa05e>
  fe2afd:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fe2b02:	e8 87 be db ff       	call   d9e98e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ba14>
  fe2b07:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0
  fe2b0c:	0f 84 18 06 00 00    	je     fe312a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa540>
```
### ref at `0xfe2a90`

```text
  fe2a4c:	49 8b 76 40          	mov    rsi,QWORD PTR [r14+0x40]
  fe2a50:	48 85 f6             	test   rsi,rsi
  fe2a53:	0f 84 8f 09 00 00    	je     fe33e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa7fe>
  fe2a59:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fe2a5c:	48 89 ef             	mov    rdi,rbp
  fe2a5f:	4c 89 e2             	mov    rdx,r12
  fe2a62:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
  fe2a69:	00
  fe2a6a:	ff 50 30             	call   QWORD PTR [rax+0x30]
  fe2a6d:	4c 8b bc 24 20 01 00 	mov    r15,QWORD PTR [rsp+0x120]
  fe2a74:	00
  fe2a75:	4d 85 ff             	test   r15,r15
  fe2a78:	0f 84 ff 00 00 00    	je     fe2b7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9f93>
  fe2a7e:	6a 18                	push   0x18
  fe2a80:	5f                   	pop    rdi
  fe2a81:	e8 7a b4 80 00       	call   17edf00 <_Znwm@plt>
  fe2a86:	48 8d 0d 53 53 9f ff 	lea    rcx,[rip+0xffffffffff9f5353]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  fe2a8d:	48 89 08             	mov    QWORD PTR [rax],rcx
  fe2a90:	48 8d 0d 49 53 9f ff 	lea    rcx,[rip+0xffffffffff9f5349]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  fe2a97:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  fe2a9b:	4c 89 ff             	mov    rdi,r15
  fe2a9e:	48 89 c6             	mov    rsi,rax
  fe2aa1:	e8 04 31 f9 ff       	call   f75baa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13cfc0>
  fe2aa6:	4c 8b bc 24 20 01 00 	mov    r15,QWORD PTR [rsp+0x120]
  fe2aad:	00
  fe2aae:	4c 8b ac 24 28 01 00 	mov    r13,QWORD PTR [rsp+0x128]
  fe2ab5:	00
  fe2ab6:	66 0f ef c0          	pxor   xmm0,xmm0
  fe2aba:	66 0f 7f 84 24 20 01 	movdqa XMMWORD PTR [rsp+0x120],xmm0
  fe2ac1:	00 00
  fe2ac3:	66 0f 7f 84 24 20 02 	movdqa XMMWORD PTR [rsp+0x220],xmm0
  fe2aca:	00 00
  fe2acc:	48 89 ef             	mov    rdi,rbp
  fe2acf:	48 8d b4 24 20 02 00 	lea    rsi,[rsp+0x220]
  fe2ad6:	00
  fe2ad7:	e8 40 6d ad ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fe2adc:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
  fe2ae3:	00
  fe2ae4:	e8 9d b9 ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fe2ae9:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
  fe2aed:	0f 86 99 00 00 00    	jbe    fe2b8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9fa2>
  fe2af3:	31 c0                	xor    eax,eax
  fe2af5:	45 31 ff             	xor    r15d,r15d
  fe2af8:	e9 4b 01 00 00       	jmp    fe2c48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa05e>
  fe2afd:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fe2b02:	e8 87 be db ff       	call   d9e98e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ba14>
  fe2b07:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0
  fe2b0c:	0f 84 18 06 00 00    	je     fe312a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa540>
  fe2b12:	48 8b b4 24 d8 00 00 	mov    rsi,QWORD PTR [rsp+0xd8]
  fe2b19:	00
```
### ref at `0xfe7d31`

```text
  fe7cea:	4c 8b 51 10          	mov    r10,QWORD PTR [rcx+0x10]
  fe7cee:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  fe7cf2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  fe7cf7:	48 8d 4c 24 68       	lea    rcx,[rsp+0x68]
  fe7cfc:	4c 89 fe             	mov    rsi,r15
  fe7cff:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
  fe7d04:	4c 8b 44 24 20       	mov    r8,QWORD PTR [rsp+0x20]
  fe7d09:	4c 8b 4c 24 10       	mov    r9,QWORD PTR [rsp+0x10]
  fe7d0e:	41 ff d2             	call   r10
  fe7d11:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
  fe7d16:	4d 85 ff             	test   r15,r15
  fe7d19:	74 66                	je     fe7d81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af197>
  fe7d1b:	6a 18                	push   0x18
  fe7d1d:	5f                   	pop    rdi
  fe7d1e:	e8 dd 61 80 00       	call   17edf00 <_Znwm@plt>
  fe7d23:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
  fe7d27:	48 8d 0d b2 01 00 00 	lea    rcx,[rip+0x1b2]        # fe7ee0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af2f6>
  fe7d2e:	48 89 08             	mov    QWORD PTR [rax],rcx
  fe7d31:	48 8d 0d a8 00 9f ff 	lea    rcx,[rip+0xffffffffff9f00a8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  fe7d38:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  fe7d3c:	4c 89 ff             	mov    rdi,r15
  fe7d3f:	48 89 c6             	mov    rsi,rax
  fe7d42:	e8 a7 54 f5 ff       	call   f3d1ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104604>
  fe7d47:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  fe7d4c:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  fe7d4f:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  fe7d53:	0f 57 c0             	xorps  xmm0,xmm0
  fe7d56:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  fe7d59:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
  fe7d5e:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
  fe7d63:	4c 89 e6             	mov    rsi,r12
  fe7d66:	e8 b1 1a ad ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fe7d6b:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  fe7d70:	e8 11 67 ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fe7d75:	48 83 3b fd          	cmp    QWORD PTR [rbx],0xfffffffffffffffd
  fe7d79:	76 10                	jbe    fe7d8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af1a1>
  fe7d7b:	31 c0                	xor    eax,eax
  fe7d7d:	31 db                	xor    ebx,ebx
  fe7d7f:	eb 1b                	jmp    fe7d9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af1b2>
  fe7d81:	0f 57 c0             	xorps  xmm0,xmm0
  fe7d84:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
  fe7d89:	eb 2a                	jmp    fe7db5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af1cb>
  fe7d8b:	4d 85 ff             	test   r15,r15
  fe7d8e:	74 0a                	je     fe7d9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af1b0>
  fe7d90:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  fe7d95:	4c 89 f8             	mov    rax,r15
  fe7d98:	eb 02                	jmp    fe7d9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af1b2>
  fe7d9a:	31 c0                	xor    eax,eax
  fe7d9c:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
  fe7da1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
```
### ref at `0x10005f6`

```text
 100059f:	88 46 38             	mov    BYTE PTR [rsi+0x38],al
 10005a2:	88 46 40             	mov    BYTE PTR [rsi+0x40],al
 10005a5:	0f 57 c0             	xorps  xmm0,xmm0
 10005a8:	0f 11 86 b0 00 00 00 	movups XMMWORD PTR [rsi+0xb0],xmm0
 10005af:	88 86 c0 00 00 00    	mov    BYTE PTR [rsi+0xc0],al
 10005b5:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
 10005b9:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
 10005bd:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
 10005c1:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
 10005c5:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
 10005cc:	0f 11 86 98 00 00 00 	movups XMMWORD PTR [rsi+0x98],xmm0
 10005d3:	66 83 a6 a8 00 00 00 	and    WORD PTR [rsi+0xa8],0x0
 10005da:	00
 10005db:	88 86 c8 00 00 00    	mov    BYTE PTR [rsi+0xc8],al
 10005e1:	88 86 d0 00 00 00    	mov    BYTE PTR [rsi+0xd0],al
 10005e7:	48 8d 05 72 0e 83 00 	lea    rax,[rip+0x830e72]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
 10005ee:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
 10005f3:	48 89 02             	mov    QWORD PTR [rdx],rax
 10005f6:	48 8d 05 e3 77 9d ff 	lea    rax,[rip+0xffffffffff9d77e3]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10005fd:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
 1000601:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
 1000605:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1000608:	ff 50 60             	call   QWORD PTR [rax+0x60]
 100060b:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
 1000610:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 1000615:	e8 50 99 a7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 100061a:	48 89 df             	mov    rdi,rbx
 100061d:	e8 b6 b9 66 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
 1000622:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1000627:	e8 5a de a9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 100062c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1000633:	00 00
 1000635:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
 100063c:	00
 100063d:	75 0b                	jne    100064a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7a60>
 100063f:	48 81 c4 28 01 00 00 	add    rsp,0x128
 1000646:	5b                   	pop    rbx
 1000647:	41 5e                	pop    r14
 1000649:	c3                   	ret
 100064a:	e8 61 f4 7e 00       	call   17efab0 <__stack_chk_fail@plt>
 100064f:	48 89 c7             	mov    rdi,rax
 1000652:	e8 4e 94 a7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1000657:	cc                   	int3
 1000658:	55                   	push   rbp
 1000659:	41 57                	push   r15
 100065b:	41 56                	push   r14
 100065d:	41 55                	push   r13
 100065f:	41 54                	push   r12
 1000661:	53                   	push   rbx
 1000662:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
```
### ref at `0x100f91c`

```text
 100f8de:	eb 0a                	jmp    100f8ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d00>
 100f8e0:	4c 89 ef             	mov    rdi,r13
 100f8e3:	31 f6                	xor    esi,esi
 100f8e5:	e8 10 04 00 00       	call   100fcfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d7110>
 100f8ea:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 100f8ee:	49 83 c4 18          	add    r12,0x18
 100f8f2:	4c 89 e6             	mov    rsi,r12
 100f8f5:	e8 fc 06 00 00       	call   100fff6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d740c>
 100f8fa:	4d 8b 26             	mov    r12,QWORD PTR [r14]
 100f8fd:	4d 85 e4             	test   r12,r12
 100f900:	74 6c                	je     100f96e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d84>
 100f902:	6a 20                	push   0x20
 100f904:	5f                   	pop    rdi
 100f905:	e8 f6 e5 7d 00       	call   17edf00 <_Znwm@plt>
 100f90a:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
 100f90e:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 100f912:	48 8d 0d fd 06 00 00 	lea    rcx,[rip+0x6fd]        # 1010016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d742c>
 100f919:	48 89 08             	mov    QWORD PTR [rax],rcx
 100f91c:	48 8d 0d bd 84 9c ff 	lea    rcx,[rip+0xffffffffff9c84bd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 100f923:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 100f927:	4c 89 e7             	mov    rdi,r12
 100f92a:	48 89 c6             	mov    rsi,rax
 100f92d:	e8 f4 83 fa ff       	call   fb7d26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f13c>
 100f932:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
 100f935:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
 100f939:	0f 57 c0             	xorps  xmm0,xmm0
 100f93c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 100f940:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
 100f945:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
 100f94a:	4c 89 f7             	mov    rdi,r14
 100f94d:	4c 89 e6             	mov    rsi,r12
 100f950:	e8 c7 9e aa ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 100f955:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 100f95a:	e8 27 eb a8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 100f95f:	49 83 7d 00 fd       	cmp    QWORD PTR [r13+0x0],0xfffffffffffffffd
 100f964:	76 0d                	jbe    100f973 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d89>
 100f966:	45 31 f6             	xor    r14d,r14d
 100f969:	45 31 ed             	xor    r13d,r13d
 100f96c:	eb 17                	jmp    100f985 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d9b>
 100f96e:	45 31 f6             	xor    r14d,r14d
 100f971:	eb 48                	jmp    100f9bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6dd1>
 100f973:	4d 85 ff             	test   r15,r15
 100f976:	74 0a                	je     100f982 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d98>
 100f978:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
 100f97d:	4d 89 fe             	mov    r14,r15
 100f980:	eb 03                	jmp    100f985 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d9b>
 100f982:	45 31 f6             	xor    r14d,r14d
 100f985:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
 100f98a:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
 100f98f:	31 ff                	xor    edi,edi
```
### ref at `0x1013574`

```text
 1013536:	eb 0a                	jmp    1013542 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da958>
 1013538:	4c 89 ef             	mov    rdi,r13
 101353b:	31 f6                	xor    esi,esi
 101353d:	e8 e2 02 00 00       	call   1013824 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dac3a>
 1013542:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 1013546:	49 83 c4 18          	add    r12,0x18
 101354a:	4c 89 e6             	mov    rsi,r12
 101354d:	e8 a4 ca ff ff       	call   100fff6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d740c>
 1013552:	4d 8b 26             	mov    r12,QWORD PTR [r14]
 1013555:	4d 85 e4             	test   r12,r12
 1013558:	74 6c                	je     10135c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da9dc>
 101355a:	6a 20                	push   0x20
 101355c:	5f                   	pop    rdi
 101355d:	e8 9e a9 7d 00       	call   17edf00 <_Znwm@plt>
 1013562:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
 1013566:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 101356a:	48 8d 0d fd 03 00 00 	lea    rcx,[rip+0x3fd]        # 101396e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dad84>
 1013571:	48 89 08             	mov    QWORD PTR [rax],rcx
 1013574:	48 8d 0d 65 48 9c ff 	lea    rcx,[rip+0xffffffffff9c4865]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 101357b:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 101357f:	4c 89 e7             	mov    rdi,r12
 1013582:	48 89 c6             	mov    rsi,rax
 1013585:	e8 9c 47 fa ff       	call   fb7d26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f13c>
 101358a:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
 101358d:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
 1013591:	0f 57 c0             	xorps  xmm0,xmm0
 1013594:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 1013598:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
 101359d:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
 10135a2:	4c 89 f7             	mov    rdi,r14
 10135a5:	4c 89 e6             	mov    rsi,r12
 10135a8:	e8 6f 62 aa ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 10135ad:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 10135b2:	e8 cf ae a8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10135b7:	49 83 7d 00 fd       	cmp    QWORD PTR [r13+0x0],0xfffffffffffffffd
 10135bc:	76 0d                	jbe    10135cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da9e1>
 10135be:	45 31 f6             	xor    r14d,r14d
 10135c1:	45 31 ed             	xor    r13d,r13d
 10135c4:	eb 17                	jmp    10135dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da9f3>
 10135c6:	45 31 f6             	xor    r14d,r14d
 10135c9:	eb 48                	jmp    1013613 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1daa29>
 10135cb:	4d 85 ff             	test   r15,r15
 10135ce:	74 0a                	je     10135da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da9f0>
 10135d0:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
 10135d5:	4d 89 fe             	mov    r14,r15
 10135d8:	eb 03                	jmp    10135dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da9f3>
 10135da:	45 31 f6             	xor    r14d,r14d
 10135dd:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
 10135e2:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
 10135e7:	31 ff                	xor    edi,edi
```
### ref at `0x101ee03`

```text
 101edc2:	4c 89 ee             	mov    rsi,r13
 101edc5:	48 89 ea             	mov    rdx,rbp
 101edc8:	e8 29 06 00 00       	call   101f3f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e680c>
 101edcd:	eb 0a                	jmp    101edd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e61ef>
 101edcf:	4c 89 e7             	mov    rdi,r12
 101edd2:	31 f6                	xor    esi,esi
 101edd4:	e8 ed 05 00 00       	call   101f3c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e67dc>
 101edd9:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
 101eddc:	4d 85 ed             	test   r13,r13
 101eddf:	0f 84 a2 00 00 00    	je     101ee87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e629d>
 101ede5:	6a 20                	push   0x20
 101ede7:	5f                   	pop    rdi
 101ede8:	e8 13 f1 7c 00       	call   17edf00 <_Znwm@plt>
 101eded:	49 89 c4             	mov    r12,rax
 101edf0:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
 101edf4:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 101edf8:	48 8d 05 39 06 00 00 	lea    rax,[rip+0x639]        # 101f438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e684e>
 101edff:	49 89 04 24          	mov    QWORD PTR [r12],rax
 101ee03:	48 8d 05 d6 8f 9b ff 	lea    rax,[rip+0xffffffffff9b8fd6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 101ee0a:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
 101ee0f:	41 80 7d 58 00       	cmp    BYTE PTR [r13+0x58],0x0
 101ee14:	74 33                	je     101ee49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e625f>
 101ee16:	49 8d 75 28          	lea    rsi,[r13+0x28]
 101ee1a:	4d 8b 7d 00          	mov    r15,QWORD PTR [r13+0x0]
 101ee1e:	31 d2                	xor    edx,edx
 101ee20:	49 83 ff fe          	cmp    r15,0xfffffffffffffffe
 101ee24:	0f 93 c2             	setae  dl
 101ee27:	4c 89 e7             	mov    rdi,r12
 101ee2a:	e8 09 06 00 00       	call   101f438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e684e>
 101ee2f:	49 83 ff fe          	cmp    r15,0xfffffffffffffffe
 101ee33:	72 14                	jb     101ee49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e625f>
 101ee35:	4c 89 e7             	mov    rdi,r12
 101ee38:	41 ff 54 24 08       	call   QWORD PTR [r12+0x8]
 101ee3d:	4c 89 e7             	mov    rdi,r12
 101ee40:	e8 db f0 7c 00       	call   17edf20 <_ZdlPv@plt>
 101ee45:	6a fe                	push   0xfffffffffffffffe
 101ee47:	41 5c                	pop    r12
 101ee49:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12
 101ee4d:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
 101ee50:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
 101ee54:	0f 57 c0             	xorps  xmm0,xmm0
 101ee57:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 101ee5b:	49 89 e4             	mov    r12,rsp
 101ee5e:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
 101ee63:	4c 89 f7             	mov    rdi,r14
 101ee66:	4c 89 e6             	mov    rsi,r12
 101ee69:	e8 ae a9 a9 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 101ee6e:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 101ee73:	e8 0e f6 a7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 101ee78:	49 83 7d 00 fd       	cmp    QWORD PTR [r13+0x0],0xfffffffffffffffd
```
### ref at `0x1021a0d`

```text
 10219cd:	e8 16 03 00 00       	call   1021ce8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e90fe>
 10219d2:	eb 17                	jmp    10219eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e01>
 10219d4:	4c 89 e7             	mov    rdi,r12
 10219d7:	48 89 ca             	mov    rdx,rcx
 10219da:	e8 71 02 00 00       	call   1021c50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e9066>
 10219df:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 10219e3:	48 89 c6             	mov    rsi,rax
 10219e6:	e8 25 cc ff ff       	call   101e610 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e5a26>
 10219eb:	4d 8b 26             	mov    r12,QWORD PTR [r14]
 10219ee:	4d 85 e4             	test   r12,r12
 10219f1:	74 6c                	je     1021a5f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e75>
 10219f3:	6a 20                	push   0x20
 10219f5:	5f                   	pop    rdi
 10219f6:	e8 05 c5 7c 00       	call   17edf00 <_Znwm@plt>
 10219fb:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
 10219ff:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 1021a03:	48 8d 0d 0e 03 00 00 	lea    rcx,[rip+0x30e]        # 1021d18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e912e>
 1021a0a:	48 89 08             	mov    QWORD PTR [rax],rcx
 1021a0d:	48 8d 0d cc 63 9b ff 	lea    rcx,[rip+0xffffffffff9b63cc]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 1021a14:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 1021a18:	4c 89 e7             	mov    rdi,r12
 1021a1b:	48 89 c6             	mov    rsi,rax
 1021a1e:	e8 03 63 f9 ff       	call   fb7d26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f13c>
 1021a23:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
 1021a26:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
 1021a2a:	0f 57 c0             	xorps  xmm0,xmm0
 1021a2d:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 1021a31:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
 1021a36:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
 1021a3b:	4c 89 f7             	mov    rdi,r14
 1021a3e:	4c 89 e6             	mov    rsi,r12
 1021a41:	e8 d6 7d a9 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 1021a46:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 1021a4b:	e8 36 ca a7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1021a50:	49 83 7d 00 fd       	cmp    QWORD PTR [r13+0x0],0xfffffffffffffffd
 1021a55:	76 0d                	jbe    1021a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e7a>
 1021a57:	45 31 f6             	xor    r14d,r14d
 1021a5a:	45 31 ed             	xor    r13d,r13d
 1021a5d:	eb 17                	jmp    1021a76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e8c>
 1021a5f:	45 31 f6             	xor    r14d,r14d
 1021a62:	eb 48                	jmp    1021aac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8ec2>
 1021a64:	4d 85 ff             	test   r15,r15
 1021a67:	74 0a                	je     1021a73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e89>
 1021a69:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
 1021a6e:	4d 89 fe             	mov    r14,r15
 1021a71:	eb 03                	jmp    1021a76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e8c>
 1021a73:	45 31 f6             	xor    r14d,r14d
 1021a76:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
 1021a7b:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
 1021a80:	31 ff                	xor    edi,edi
```
### ref at `0x1033321`

```text
 10332e4:	48 29 f2             	sub    rdx,rsi
 10332e7:	74 12                	je     10332fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa711>
 10332e9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 10332ed:	e8 ee c7 7b 00       	call   17efae0 <memmove@plt>
 10332f2:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
 10332f7:	eb 02                	jmp    10332fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa711>
 10332f9:	31 c0                	xor    eax,eax
 10332fb:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 10332ff:	4d 8b 26             	mov    r12,QWORD PTR [r14]
 1033302:	4d 85 e4             	test   r12,r12
 1033305:	74 6a                	je     1033371 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa787>
 1033307:	6a 20                	push   0x20
 1033309:	5f                   	pop    rdi
 103330a:	e8 f1 ab 7b 00       	call   17edf00 <_Znwm@plt>
 103330f:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
 1033313:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 1033317:	48 8d 0d 86 02 00 00 	lea    rcx,[rip+0x286]        # 10335a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa9ba>
 103331e:	48 89 08             	mov    QWORD PTR [rax],rcx
 1033321:	48 8d 0d b8 4a 9a ff 	lea    rcx,[rip+0xffffffffff9a4ab8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 1033328:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 103332c:	4c 89 e7             	mov    rdi,r12
 103332f:	48 89 c6             	mov    rsi,rax
 1033332:	e8 47 90 ef ff       	call   f2c37e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3794>
 1033337:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
 103333a:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
 103333e:	0f 57 c0             	xorps  xmm0,xmm0
 1033341:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 1033345:	49 89 e4             	mov    r12,rsp
 1033348:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
 103334d:	4c 89 f7             	mov    rdi,r14
 1033350:	4c 89 e6             	mov    rsi,r12
 1033353:	e8 c4 64 a8 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 1033358:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 103335d:	e8 24 b1 a6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1033362:	49 83 7d 00 fd       	cmp    QWORD PTR [r13+0x0],0xfffffffffffffffd
 1033367:	76 0d                	jbe    1033376 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa78c>
 1033369:	45 31 f6             	xor    r14d,r14d
 103336c:	45 31 ed             	xor    r13d,r13d
 103336f:	eb 17                	jmp    1033388 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa79e>
 1033371:	45 31 f6             	xor    r14d,r14d
 1033374:	eb 45                	jmp    10333bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa7d1>
 1033376:	4d 85 ff             	test   r15,r15
 1033379:	74 0a                	je     1033385 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa79b>
 103337b:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
 1033380:	4d 89 fe             	mov    r14,r15
 1033383:	eb 03                	jmp    1033388 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa79e>
 1033385:	45 31 f6             	xor    r14d,r14d
 1033388:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
 103338c:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 1033391:	31 ff                	xor    edi,edi
```
### ref at `0x1045bad`

```text
 1045b68:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 1045b6d:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1045b70:	4c 89 f6             	mov    rsi,r14
 1045b73:	4c 89 e2             	mov    rdx,r12
 1045b76:	4c 89 f9             	mov    rcx,r15
 1045b79:	4d 89 e8             	mov    r8,r13
 1045b7c:	41 89 e9             	mov    r9d,ebp
 1045b7f:	e8 06 18 5a 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 1045b84:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 1045b89:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1045b8c:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1045b8f:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 1045b94:	bf 78 01 00 00       	mov    edi,0x178
 1045b99:	e8 62 83 7a 00       	call   17edf00 <_Znwm@plt>
 1045b9e:	49 89 c7             	mov    r15,rax
 1045ba1:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]
 1045ba8:	00
 1045ba9:	48 83 21 00          	and    QWORD PTR [rcx],0x0
 1045bad:	48 8d 05 2c 22 99 ff 	lea    rax,[rip+0xffffffffff99222c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 1045bb4:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 1045bb8:	48 8d 05 8b b6 c2 ff 	lea    rax,[rip+0xffffffffffc2b68b]        # c7124a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be1ea>
 1045bbf:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 1045bc3:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
 1045bc8:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 1045bcc:	4c 8d 2d 6d fa 38 ff 	lea    r13,[rip+0xffffffffff38fa6d]        # 3d5640 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x225>
 1045bd3:	48 8d 0d 86 fa 38 ff 	lea    rcx,[rip+0xffffffffff38fa86]        # 3d5660 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x245>
 1045bda:	6a 17                	push   0x17
 1045bdc:	5d                   	pop    rbp
 1045bdd:	6a 19                	push   0x19
 1045bdf:	5b                   	pop    rbx
 1045be0:	6a 14                	push   0x14
 1045be2:	41 5e                	pop    r14
 1045be4:	4c 89 ee             	mov    rsi,r13
 1045be7:	48 89 ea             	mov    rdx,rbp
 1045bea:	49 89 d8             	mov    r8,rbx
 1045bed:	45 89 f1             	mov    r9d,r14d
 1045bf0:	e8 35 18 5a 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 1045bf5:	89 44 24 24          	mov    DWORD PTR [rsp+0x24],eax
 1045bf9:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 1045bfd:	6a 64                	push   0x64
 1045bff:	58                   	pop    rax
 1045c00:	4c 89 ee             	mov    rsi,r13
 1045c03:	48 89 ea             	mov    rdx,rbp
 1045c06:	48 8d 0d 53 fa 38 ff 	lea    rcx,[rip+0xffffffffff38fa53]        # 3d5660 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x245>
 1045c0d:	49 89 d8             	mov    r8,rbx
 1045c10:	45 89 f1             	mov    r9d,r14d
 1045c13:	50                   	push   rax
 1045c14:	6a 00                	push   0x0
 1045c16:	e8 d7 19 5a 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 1045c1b:	48 83 c4 10          	add    rsp,0x10
```
### ref at `0x10624c6`

```text
 106247b:	83 bc 24 80 00 00 00 	cmp    DWORD PTR [rsp+0x80],0x3f
 1062482:	3f
 1062483:	74 2a                	je     10624af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2298c5>
 1062485:	4c 89 ff             	mov    rdi,r15
 1062488:	e8 6b e5 ff ff       	call   10609f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x227e0e>
 106248d:	84 c0                	test   al,al
 106248f:	75 1e                	jne    10624af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2298c5>
 1062491:	49 81 c6 80 01 00 00 	add    r14,0x180
 1062498:	48 8d 35 d1 a4 3d ff 	lea    rsi,[rip+0xffffffffff3da4d1]        # 43c970 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x257c>
 106249f:	4c 89 f7             	mov    rdi,r14
 10624a2:	e8 dd 81 e2 ff       	call   e8a684 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a9a>
 10624a7:	84 c0                	test   al,al
 10624a9:	0f 84 ba 00 00 00    	je     1062569 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22997f>
 10624af:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
 10624b4:	49 c7 46 f8 04 00 00 	mov    QWORD PTR [r14-0x8],0x4
 10624bb:	00
 10624bc:	48 8d 05 87 ed 2d ff 	lea    rax,[rip+0xffffffffff2ded87]        # 34124a <_ZTSSt12bad_any_cast@@Base-0x4ef7e>
 10624c3:	49 89 06             	mov    QWORD PTR [r14],rax
 10624c6:	48 8d 05 13 59 97 ff 	lea    rax,[rip+0xffffffffff975913]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10624cd:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10624d1:	48 81 c3 d0 00 00 00 	add    rbx,0xd0
 10624d8:	48 8d 35 d9 96 3d ff 	lea    rsi,[rip+0xffffffffff3d96d9]        # 43bbb8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17c4>
 10624df:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
 10624e4:	48 89 df             	mov    rdi,rbx
 10624e7:	e8 f0 70 b7 ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
 10624ec:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10624ef:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
 10624f3:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10624f8:	e8 49 1b e4 ff       	call   ea4046 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b45c>
 10624fd:	4c 89 f7             	mov    rdi,r14
 1062500:	e8 67 6e 16 00       	call   11c936c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe8f0>
 1062505:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 106250a:	f2 0f 10 05 36 cb 32 	movsd  xmm0,QWORD PTR [rip+0xffffffffff32cb36]        # 38f048 <_ZTSSt12bad_any_cast@@Base-0x1180>
 1062511:	ff
 1062512:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
 1062518:	48 85 f6             	test   rsi,rsi
 106251b:	74 10                	je     106252d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x229943>
 106251d:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 1062522:	e8 56 08 00 00       	call   1062d7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a193>
 1062527:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
 106252d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 1062532:	e8 35 6e 16 00       	call   11c936c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe8f0>
 1062537:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 106253c:	e8 ed 2d 66 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1062541:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1062548:	00 00
 106254a:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
 1062551:	00
 1062552:	75 6c                	jne    10625c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2299d6>
 1062554:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
```
### ref at `0x106dfb0`

```text
 106df67:	40 80 c5 f0          	add    bpl,0xf0
 106df6b:	48 bb 01 01 01 00 00 	movabs rbx,0x10000010101
 106df72:	01 00 00
 106df75:	89 e9                	mov    ecx,ebp
 106df77:	48 d3 eb             	shr    rbx,cl
 106df7a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 106df7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 106df82:	ff 50 28             	call   QWORD PTR [rax+0x28]
 106df85:	49 89 c7             	mov    r15,rax
 106df88:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 106df8d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 106df90:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 106df95:	ff 50 30             	call   QWORD PTR [rax+0x30]
 106df98:	4c 8b 74 24 30       	mov    r14,QWORD PTR [rsp+0x30]
 106df9d:	bf e8 00 00 00       	mov    edi,0xe8
 106dfa2:	e8 59 ff 77 00       	call   17edf00 <_Znwm@plt>
 106dfa7:	49 89 c4             	mov    r12,rax
 106dfaa:	48 83 64 24 48 00    	and    QWORD PTR [rsp+0x48],0x0
 106dfb0:	48 8d 05 29 9e 96 ff 	lea    rax,[rip+0xffffffffff969e29]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 106dfb7:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 106dfbc:	48 8d 05 7d 02 00 00 	lea    rax,[rip+0x27d]        # 106e240 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235656>
 106dfc3:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 106dfc8:	48 8d 05 a1 ae 7d 00 	lea    rax,[rip+0x7daea1]        # 1848e70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5558>
 106dfcf:	49 89 04 24          	mov    QWORD PTR [r12],rax
 106dfd3:	48 8d 05 26 af 7d 00 	lea    rax,[rip+0x7daf26]        # 1848f00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x55e8>
 106dfda:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
 106dfdf:	66 41 89 5c 24 10    	mov    WORD PTR [r12+0x10],bx
 106dfe5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 106dfea:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
 106dfef:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
 106dff3:	41 0f 10 47 10       	movups xmm0,XMMWORD PTR [r15+0x10]
 106dff8:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
 106dffe:	48 85 c0             	test   rax,rax
 106e001:	74 05                	je     106e008 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23541e>
 106e003:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 106e008:	4d 89 74 24 30       	mov    QWORD PTR [r12+0x30],r14
 106e00d:	4d 8d 7c 24 38       	lea    r15,[r12+0x38]
 106e012:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
 106e017:	4c 89 ff             	mov    rdi,r15
 106e01a:	e8 0b 36 00 00       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 106e01f:	4d 8d 74 24 58       	lea    r14,[r12+0x58]
 106e024:	0f 57 c0             	xorps  xmm0,xmm0
 106e027:	41 0f 11 44 24 68    	movups XMMWORD PTR [r12+0x68],xmm0
 106e02d:	41 0f 11 44 24 58    	movups XMMWORD PTR [r12+0x58],xmm0
 106e033:	bb 00 00 80 3f       	mov    ebx,0x3f800000
 106e038:	41 89 5c 24 78       	mov    DWORD PTR [r12+0x78],ebx
 106e03d:	4d 8d ac 24 a0 00 00 	lea    r13,[r12+0xa0]
 106e044:	00
 106e045:	41 0f 11 84 24 80 00 	movups XMMWORD PTR [r12+0x80],xmm0
 106e04c:	00 00
```
### ref at `0x1070ea9`

```text
 1070e5a:	e8 b3 71 5f 00       	call   1668012 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c17e>
 1070e5f:	4c 89 ef             	mov    rdi,r13
 1070e62:	48 8d b4 24 c8 05 00 	lea    rsi,[rsp+0x5c8]
 1070e69:	00
 1070e6a:	e8 0b f6 65 00       	call   16d047a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x845e6>
 1070e6f:	48 8d bc 24 f8 04 00 	lea    rdi,[rsp+0x4f8]
 1070e76:	00
 1070e77:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
 1070e7c:	e8 ff d1 77 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 1070e81:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1070e86:	4c 8b 70 20          	mov    r14,QWORD PTR [rax+0x20]
 1070e8a:	48 8d bc 24 18 0a 00 	lea    rdi,[rsp+0xa18]
 1070e91:	00
 1070e92:	4c 89 ee             	mov    rsi,r13
 1070e95:	e8 ae 72 5f 00       	call   1668148 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c2b4>
 1070e9a:	48 8d 05 bf 05 7c 00 	lea    rax,[rip+0x7c05bf]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
 1070ea1:	48 89 84 24 e0 09 00 	mov    QWORD PTR [rsp+0x9e0],rax
 1070ea8:	00
 1070ea9:	48 8d 05 30 6f 96 ff 	lea    rax,[rip+0xffffffffff966f30]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 1070eb0:	48 89 84 24 e8 09 00 	mov    QWORD PTR [rsp+0x9e8],rax
 1070eb7:	00
 1070eb8:	48 8d 9c 24 e0 09 00 	lea    rbx,[rsp+0x9e0]
 1070ebf:	00
 1070ec0:	48 89 9c 24 00 0a 00 	mov    QWORD PTR [rsp+0xa00],rbx
 1070ec7:	00
 1070ec8:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1070ecb:	4c 89 f7             	mov    rdi,r14
 1070ece:	4c 8d b4 24 18 0a 00 	lea    r14,[rsp+0xa18]
 1070ed5:	00
 1070ed6:	4c 89 f6             	mov    rsi,r14
 1070ed9:	48 89 da             	mov    rdx,rbx
 1070edc:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 1070ee2:	48 89 df             	mov    rdi,rbx
 1070ee5:	e8 80 90 a0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 1070eea:	4c 89 f7             	mov    rdi,r14
 1070eed:	e8 24 72 5f 00       	call   1668116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c282>
 1070ef2:	4c 89 ef             	mov    rdi,r13
 1070ef5:	e8 1c 72 5f 00       	call   1668116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c282>
 1070efa:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 1070f01:	00
 1070f02:	e8 89 cf 77 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1070f07:	48 8d bc 24 c8 05 00 	lea    rdi,[rsp+0x5c8]
 1070f0e:	00
 1070f0f:	e8 7c f4 65 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
 1070f14:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 1070f19:	e8 72 cf 77 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1070f1e:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 1070f23:	e8 5e d5 a2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1070f28:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
 1070f2c:	4d 85 e4             	test   r12,r12
```
### ref at `0x1075464`

```text
 107541a:	48 85 c0             	test   rax,rax
 107541d:	74 05                	je     1075424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23c83a>
 107541f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 1075424:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1075429:	4c 89 fd             	mov    rbp,r15
 107542c:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
 1075433:	00
 1075434:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
 107543b:	00
 107543c:	e8 9d 06 00 00       	call   1075ade <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cef4>
 1075441:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
 1075448:	00 00
 107544a:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
 1075451:	4d 85 f6             	test   r14,r14
 1075454:	74 05                	je     107545b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23c871>
 1075456:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
 107545b:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
 1075462:	00 00
 1075464:	4c 8d 3d 75 29 96 ff 	lea    r15,[rip+0xffffffffff962975]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 107546b:	4c 89 bc 24 50 02 00 	mov    QWORD PTR [rsp+0x250],r15
 1075472:	00
 1075473:	48 8d 05 a8 06 00 00 	lea    rax,[rip+0x6a8]        # 1075b22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cf38>
 107547a:	48 89 84 24 58 02 00 	mov    QWORD PTR [rsp+0x258],rax
 1075481:	00
 1075482:	48 8d 05 e7 3f 7d 00 	lea    rax,[rip+0x7d3fe7]        # 1849470 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5b58>
 1075489:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
 1075490:	00
 1075491:	48 8d 84 24 10 02 00 	lea    rax,[rsp+0x210]
 1075498:	00
 1075499:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
 10754a0:	00
 10754a1:	48 8d 05 60 c6 7e 00 	lea    rax,[rip+0x7ec660]        # 1861b08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e1f0>
 10754a8:	49 89 04 24          	mov    QWORD PTR [r12],rax
 10754ac:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
 10754b1:	41 0f 11 44 24 08    	movups XMMWORD PTR [r12+0x8],xmm0
 10754b7:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
 10754be:	00
 10754bf:	41 0f 11 44 24 18    	movups XMMWORD PTR [r12+0x18],xmm0
 10754c5:	4d 89 6c 24 28       	mov    QWORD PTR [r12+0x28],r13
 10754ca:	49 89 6c 24 30       	mov    QWORD PTR [r12+0x30],rbp
 10754cf:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10754d4:	49 89 44 24 38       	mov    QWORD PTR [r12+0x38],rax
 10754d9:	49 89 5c 24 40       	mov    QWORD PTR [r12+0x40],rbx
 10754de:	49 8d 7c 24 50       	lea    rdi,[r12+0x50]
 10754e3:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
 10754ea:	00
 10754eb:	e8 ee 05 00 00       	call   1075ade <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cef4>
 10754f0:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 10754f5:	49 89 84 24 80 00 00 	mov    QWORD PTR [r12+0x80],rax
 10754fc:	00
```
### ref at `0x1077765`

```text
 107771e:	49 89 ce             	mov    r14,rcx
 1077721:	49 89 d7             	mov    r15,rdx
 1077724:	49 89 f4             	mov    r12,rsi
 1077727:	48 89 fb             	mov    rbx,rdi
 107772a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1077731:	00 00
 1077733:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 107773a:	00
 107773b:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
 107773e:	e8 a2 03 00 00       	call   1077ae5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23eefb>
 1077743:	41 89 06             	mov    DWORD PTR [r14],eax
 1077746:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
 107774a:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
 107774f:	4d 89 66 f0          	mov    QWORD PTR [r14-0x10],r12
 1077753:	4c 89 f7             	mov    rdi,r14
 1077756:	4c 89 fe             	mov    rsi,r15
 1077759:	e8 32 2b a0 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 107775e:	48 8d 35 37 2d a0 ff 	lea    rsi,[rip+0xffffffffffa02d37]        # a7a49c <JNI_OnUnload@@Base+0x1d69>
 1077765:	48 8d 15 04 ed a5 ff 	lea    rdx,[rip+0xffffffffffa5ed04]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
 107776c:	48 8d 0d e5 03 00 00 	lea    rcx,[rip+0x3e5]        # 1077b58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23ef6e>
 1077773:	49 89 e7             	mov    r15,rsp
 1077776:	4c 8d 44 24 40       	lea    r8,[rsp+0x40]
 107777b:	6a 40                	push   0x40
 107777d:	41 59                	pop    r9
 107777f:	4c 89 ff             	mov    rdi,r15
 1077782:	e8 0d 30 76 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1077787:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 107778b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 107778e:	48 89 df             	mov    rdi,rbx
 1077791:	4c 89 fa             	mov    rdx,r15
 1077794:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1077797:	4c 89 ff             	mov    rdi,r15
 107779a:	e8 49 30 76 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 107779f:	4c 89 f7             	mov    rdi,r14
 10777a2:	e8 c3 27 a0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10777a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10777ae:	00 00
 10777b0:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 10777b7:	00
 10777b8:	75 12                	jne    10777cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23ebe2>
 10777ba:	48 89 d8             	mov    rax,rbx
 10777bd:	48 81 c4 88 00 00 00 	add    rsp,0x88
 10777c4:	5b                   	pop    rbx
 10777c5:	41 5c                	pop    r12
 10777c7:	41 5e                	pop    r14
 10777c9:	41 5f                	pop    r15
 10777cb:	c3                   	ret
 10777cc:	e8 df 82 77 00       	call   17efab0 <__stack_chk_fail@plt>
 10777d1:	cc                   	int3
 10777d2:	41 57                	push   r15
```
### ref at `0x1077837`

```text
 10777ec:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10777f3:	00 00
 10777f5:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10777fc:	00
 10777fd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1077800:	48 89 e2             	mov    rdx,rsp
 1077803:	c6 02 00             	mov    BYTE PTR [rdx],0x0
 1077806:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1077809:	48 8d 35 f0 01 97 00 	lea    rsi,[rip+0x9701f0]        # 19e7a00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1ff0>
 1077810:	e8 49 5f b1 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 1077815:	41 88 06             	mov    BYTE PTR [r14],al
 1077818:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
 107781c:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
 1077821:	4d 89 66 f0          	mov    QWORD PTR [r14-0x10],r12
 1077825:	4c 89 f7             	mov    rdi,r14
 1077828:	4c 89 fe             	mov    rsi,r15
 107782b:	e8 60 2a a0 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1077830:	48 8d 35 65 2c a0 ff 	lea    rsi,[rip+0xffffffffffa02c65]        # a7a49c <JNI_OnUnload@@Base+0x1d69>
 1077837:	48 8d 15 32 ec a5 ff 	lea    rdx,[rip+0xffffffffffa5ec32]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
 107783e:	48 8d 0d 33 02 00 00 	lea    rcx,[rip+0x233]        # 1077a78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23ee8e>
 1077845:	49 89 e7             	mov    r15,rsp
 1077848:	4c 8d 44 24 40       	lea    r8,[rsp+0x40]
 107784d:	6a 40                	push   0x40
 107784f:	41 59                	pop    r9
 1077851:	4c 89 ff             	mov    rdi,r15
 1077854:	e8 3b 2f 76 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1077859:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 107785d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1077860:	48 89 df             	mov    rdi,rbx
 1077863:	4c 89 fa             	mov    rdx,r15
 1077866:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1077869:	4c 89 ff             	mov    rdi,r15
 107786c:	e8 77 2f 76 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1077871:	4c 89 f7             	mov    rdi,r14
 1077874:	e8 f1 26 a0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 1077879:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1077880:	00 00
 1077882:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 1077889:	00
 107788a:	75 12                	jne    107789e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23ecb4>
 107788c:	48 89 d8             	mov    rax,rbx
 107788f:	48 81 c4 88 00 00 00 	add    rsp,0x88
 1077896:	5b                   	pop    rbx
 1077897:	41 5c                	pop    r12
 1077899:	41 5e                	pop    r14
 107789b:	41 5f                	pop    r15
 107789d:	c3                   	ret
 107789e:	e8 0d 82 77 00       	call   17efab0 <__stack_chk_fail@plt>
 10778a3:	cc                   	int3
 10778a4:	41 57                	push   r15
```
### ref at `0x1077909`

```text
 10778be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10778c5:	00 00
 10778c7:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10778ce:	00
 10778cf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10778d2:	48 89 e2             	mov    rdx,rsp
 10778d5:	c6 02 00             	mov    BYTE PTR [rdx],0x0
 10778d8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10778db:	48 8d 35 36 01 97 00 	lea    rsi,[rip+0x970136]        # 19e7a18 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2008>
 10778e2:	e8 77 5e b1 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 10778e7:	41 88 06             	mov    BYTE PTR [r14],al
 10778ea:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
 10778ee:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
 10778f3:	4d 89 66 f0          	mov    QWORD PTR [r14-0x10],r12
 10778f7:	4c 89 f7             	mov    rdi,r14
 10778fa:	4c 89 fe             	mov    rsi,r15
 10778fd:	e8 8e 29 a0 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1077902:	48 8d 35 93 2b a0 ff 	lea    rsi,[rip+0xffffffffffa02b93]        # a7a49c <JNI_OnUnload@@Base+0x1d69>
 1077909:	48 8d 15 60 eb a5 ff 	lea    rdx,[rip+0xffffffffffa5eb60]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
 1077910:	48 8d 0d f3 00 00 00 	lea    rcx,[rip+0xf3]        # 1077a0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23ee20>
 1077917:	49 89 e7             	mov    r15,rsp
 107791a:	4c 8d 44 24 40       	lea    r8,[rsp+0x40]
 107791f:	6a 40                	push   0x40
 1077921:	41 59                	pop    r9
 1077923:	4c 89 ff             	mov    rdi,r15
 1077926:	e8 69 2e 76 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 107792b:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 107792f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1077932:	48 89 df             	mov    rdi,rbx
 1077935:	4c 89 fa             	mov    rdx,r15
 1077938:	ff 50 10             	call   QWORD PTR [rax+0x10]
 107793b:	4c 89 ff             	mov    rdi,r15
 107793e:	e8 a5 2e 76 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1077943:	4c 89 f7             	mov    rdi,r14
 1077946:	e8 1f 26 a0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 107794b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1077952:	00 00
 1077954:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 107795b:	00
 107795c:	75 12                	jne    1077970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23ed86>
 107795e:	48 89 d8             	mov    rax,rbx
 1077961:	48 81 c4 88 00 00 00 	add    rsp,0x88
 1077968:	5b                   	pop    rbx
 1077969:	41 5c                	pop    r12
 107796b:	41 5e                	pop    r14
 107796d:	41 5f                	pop    r15
 107796f:	c3                   	ret
 1077970:	e8 3b 81 77 00       	call   17efab0 <__stack_chk_fail@plt>
 1077975:	cc                   	int3
 1077976:	41 56                	push   r14
```
### ref at `0x1081458`

```text
 108140d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1081412:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1081415:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1081418:	4c 89 f7             	mov    rdi,r14
 108141b:	48 81 c7 b0 00 00 00 	add    rdi,0xb0
 1081422:	e8 cf 85 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1081427:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 108142c:	48 89 df             	mov    rdi,rbx
 108142f:	e8 36 8b 9f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 1081434:	31 ff                	xor    edi,edi
 1081436:	e8 4b d0 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 108143b:	31 ff                	xor    edi,edi
 108143d:	e8 44 d0 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1081442:	4c 89 f7             	mov    rdi,r14
 1081445:	e8 80 c9 2c 00       	call   134ddca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19334e>
 108144a:	4c 89 33             	mov    QWORD PTR [rbx],r14
 108144d:	48 8d 05 38 14 00 00 	lea    rax,[rip+0x1438]        # 108288c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249ca2>
 1081454:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 1081458:	48 8d 05 81 69 95 ff 	lea    rax,[rip+0xffffffffff956981]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 108145f:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1081463:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 1081468:	4c 89 ff             	mov    rdi,r15
 108146b:	48 89 de             	mov    rsi,rbx
 108146e:	e8 1b 03 56 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
 1081473:	48 89 df             	mov    rdi,rbx
 1081476:	e8 23 5e a2 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 108147b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1081482:	00 00
 1081484:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
 1081489:	75 12                	jne    108149d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2488b3>
 108148b:	4c 89 f8             	mov    rax,r15
 108148e:	48 83 c4 78          	add    rsp,0x78
 1081492:	5b                   	pop    rbx
 1081493:	41 5c                	pop    r12
 1081495:	41 5d                	pop    r13
 1081497:	41 5e                	pop    r14
 1081499:	41 5f                	pop    r15
 108149b:	5d                   	pop    rbp
 108149c:	c3                   	ret
 108149d:	e8 0e e6 76 00       	call   17efab0 <__stack_chk_fail@plt>
 10814a2:	48 89 c3             	mov    rbx,rax
 10814a5:	49 8b 7e 78          	mov    rdi,QWORD PTR [r14+0x78]
 10814a9:	e8 d8 cf a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10814ae:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 10814b2:	e8 35 8a 2c 00       	call   1349eec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f470>
 10814b7:	49 8b 7e 58          	mov    rdi,QWORD PTR [r14+0x58]
 10814bb:	e8 c6 cf a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10814c0:	4c 89 f7             	mov    rdi,r14
 10814c3:	e8 5a 45 b9 ff       	call   c15a22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1629c2>
 10814c8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
```
### ref at `0x10816f2`

```text
 10816a3:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10816a6:	49 8d be e0 00 00 00 	lea    rdi,[r14+0xe0]
 10816ad:	e8 44 83 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10816b2:	4c 89 f7             	mov    rdi,r14
 10816b5:	48 81 c7 f0 00 00 00 	add    rdi,0xf0
 10816bc:	e8 35 83 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10816c1:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
 10816c6:	48 89 df             	mov    rdi,rbx
 10816c9:	e8 9c 88 9f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10816ce:	31 ff                	xor    edi,edi
 10816d0:	e8 b1 cd a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10816d5:	31 ff                	xor    edi,edi
 10816d7:	e8 aa cd a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10816dc:	4c 89 f7             	mov    rdi,r14
 10816df:	e8 e6 c6 2c 00       	call   134ddca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19334e>
 10816e4:	4c 89 33             	mov    QWORD PTR [rbx],r14
 10816e7:	48 8d 05 9e 11 00 00 	lea    rax,[rip+0x119e]        # 108288c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249ca2>
 10816ee:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10816f2:	48 8d 05 e7 66 95 ff 	lea    rax,[rip+0xffffffffff9566e7]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10816f9:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 10816fd:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
 1081702:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
 1081707:	4c 89 f7             	mov    rdi,r14
 108170a:	48 89 de             	mov    rsi,rbx
 108170d:	e8 7c 00 56 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
 1081712:	48 89 df             	mov    rdi,rbx
 1081715:	e8 84 5b a2 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 108171a:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
 108171f:	e8 62 cd a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1081724:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 108172b:	00 00
 108172d:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
 1081734:	00
 1081735:	75 15                	jne    108174c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248b62>
 1081737:	4c 89 f0             	mov    rax,r14
 108173a:	48 81 c4 98 00 00 00 	add    rsp,0x98
 1081741:	5b                   	pop    rbx
 1081742:	41 5c                	pop    r12
 1081744:	41 5d                	pop    r13
 1081746:	41 5e                	pop    r14
 1081748:	41 5f                	pop    r15
 108174a:	5d                   	pop    rbp
 108174b:	c3                   	ret
 108174c:	e8 5f e3 76 00       	call   17efab0 <__stack_chk_fail@plt>
 1081751:	48 89 c3             	mov    rbx,rax
 1081754:	49 8b be 88 00 00 00 	mov    rdi,QWORD PTR [r14+0x88]
 108175b:	e8 26 cd a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1081760:	49 8b 7e 78          	mov    rdi,QWORD PTR [r14+0x78]
 1081764:	e8 1d cd a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1081769:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
```
### ref at `0x1081a14`

```text
 10819ca:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
 10819cf:	4c 89 ef             	mov    rdi,r13
 10819d2:	48 89 de             	mov    rsi,rbx
 10819d5:	4c 89 e2             	mov    rdx,r12
 10819d8:	e8 ed 3e 00 00       	call   10858ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cce0>
 10819dd:	4c 89 ff             	mov    rdi,r15
 10819e0:	4c 89 ee             	mov    rsi,r13
 10819e3:	e8 0a 82 75 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10819e8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
 10819ec:	e8 95 ca a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10819f1:	4c 89 e7             	mov    rdi,r12
 10819f4:	e8 ef 8d 75 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10819f9:	4c 89 f7             	mov    rdi,r14
 10819fc:	e8 c7 1c 00 00       	call   10836c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24aade>
 1081a01:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
 1081a06:	4c 89 33             	mov    QWORD PTR [rbx],r14
 1081a09:	48 8d 05 7c 0e 00 00 	lea    rax,[rip+0xe7c]        # 108288c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249ca2>
 1081a10:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 1081a14:	48 8d 05 c5 63 95 ff 	lea    rax,[rip+0xffffffffff9563c5]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 1081a1b:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1081a1f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1081a24:	48 89 de             	mov    rsi,rbx
 1081a27:	e8 62 fd 55 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
 1081a2c:	48 89 df             	mov    rdi,rbx
 1081a2f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
 1081a34:	e8 65 58 a2 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 1081a39:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1081a40:	00 00
 1081a42:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
 1081a49:	00
 1081a4a:	75 15                	jne    1081a61 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248e77>
 1081a4c:	48 89 d8             	mov    rax,rbx
 1081a4f:	48 81 c4 98 00 00 00 	add    rsp,0x98
 1081a56:	5b                   	pop    rbx
 1081a57:	41 5c                	pop    r12
 1081a59:	41 5d                	pop    r13
 1081a5b:	41 5e                	pop    r14
 1081a5d:	41 5f                	pop    r15
 1081a5f:	5d                   	pop    rbp
 1081a60:	c3                   	ret
 1081a61:	e8 4a e0 76 00       	call   17efab0 <__stack_chk_fail@plt>
 1081a66:	48 89 c3             	mov    rbx,rax
 1081a69:	4c 89 e7             	mov    rdi,r12
 1081a6c:	e8 1f c4 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1081a71:	eb 03                	jmp    1081a76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248e8c>
 1081a73:	48 89 c3             	mov    rbx,rax
 1081a76:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
 1081a7a:	e8 07 ca a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1081a7f:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 1081a84:	e8 63 84 2c 00       	call   1349eec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f470>
```
### ref at `0x1081c89`

```text
 1081c3f:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
 1081c44:	4c 89 ef             	mov    rdi,r13
 1081c47:	48 89 de             	mov    rsi,rbx
 1081c4a:	4c 89 e2             	mov    rdx,r12
 1081c4d:	e8 78 3c 00 00       	call   10858ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cce0>
 1081c52:	4c 89 ff             	mov    rdi,r15
 1081c55:	4c 89 ee             	mov    rsi,r13
 1081c58:	e8 95 7f 75 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1081c5d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
 1081c61:	e8 20 c8 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1081c66:	4c 89 e7             	mov    rdi,r12
 1081c69:	e8 7a 8b 75 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1081c6e:	4c 89 f7             	mov    rdi,r14
 1081c71:	e8 56 0c 00 00       	call   10828cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249ce2>
 1081c76:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
 1081c7b:	4c 89 33             	mov    QWORD PTR [rbx],r14
 1081c7e:	48 8d 05 07 0c 00 00 	lea    rax,[rip+0xc07]        # 108288c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249ca2>
 1081c85:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 1081c89:	48 8d 05 50 61 95 ff 	lea    rax,[rip+0xffffffffff956150]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 1081c90:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1081c94:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
 1081c99:	4c 89 f7             	mov    rdi,r14
 1081c9c:	48 89 de             	mov    rsi,rbx
 1081c9f:	e8 ea fa 55 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
 1081ca4:	48 89 df             	mov    rdi,rbx
 1081ca7:	e8 f2 55 a2 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 1081cac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1081cb3:	00 00
 1081cb5:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 1081cbc:	00
 1081cbd:	75 15                	jne    1081cd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2490ea>
 1081cbf:	4c 89 f0             	mov    rax,r14
 1081cc2:	48 81 c4 88 00 00 00 	add    rsp,0x88
 1081cc9:	5b                   	pop    rbx
 1081cca:	41 5c                	pop    r12
 1081ccc:	41 5d                	pop    r13
 1081cce:	41 5e                	pop    r14
 1081cd0:	41 5f                	pop    r15
 1081cd2:	5d                   	pop    rbp
 1081cd3:	c3                   	ret
 1081cd4:	e8 d7 dd 76 00       	call   17efab0 <__stack_chk_fail@plt>
 1081cd9:	48 89 c3             	mov    rbx,rax
 1081cdc:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
 1081ce0:	e8 a1 c7 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1081ce5:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 1081ce9:	e8 fe 81 2c 00       	call   1349eec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f470>
 1081cee:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 1081cf2:	e8 8f c7 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1081cf7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1081cfc:	e8 69 82 9f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
```
### ref at `0x10886bb`

```text
 1088676:	6a 1e                	push   0x1e
 1088678:	5a                   	pop    rdx
 1088679:	4c 89 fe             	mov    rsi,r15
 108867c:	31 c0                	xor    eax,eax
 108867e:	e8 4f e2 74 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 1088683:	4d 85 f6             	test   r14,r14
 1088686:	0f 84 7d 06 00 00    	je     1088d09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25011f>
 108868c:	bf 98 08 00 00       	mov    edi,0x898
 1088691:	e8 6a 58 76 00       	call   17edf00 <_Znwm@plt>
 1088696:	48 89 c5             	mov    rbp,rax
 1088699:	0f 57 c0             	xorps  xmm0,xmm0
 108869c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10886a0:	48 8d 05 c1 4d 77 00 	lea    rax,[rip+0x774dc1]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
 10886a7:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 10886ab:	4c 8d 65 18          	lea    r12,[rbp+0x18]
 10886af:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
 10886b6:	00
 10886b7:	48 83 26 00          	and    QWORD PTR [rsi],0x0
 10886bb:	48 8d 05 1e f7 94 ff 	lea    rax,[rip+0xffffffffff94f71e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10886c2:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 10886c6:	48 8d 05 7d 8b be ff 	lea    rax,[rip+0xffffffffffbe8b7d]        # c7124a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be1ea>
 10886cd:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 10886d1:	48 8d 05 c8 20 7c 00 	lea    rax,[rip+0x7c20c8]        # 184a7a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6e88>
 10886d8:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
 10886dc:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10886e1:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
 10886e5:	4c 89 75 28          	mov    QWORD PTR [rbp+0x28],r14
 10886e9:	48 8d 7d 30          	lea    rdi,[rbp+0x30]
 10886ed:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
 10886f4:	00
 10886f5:	e8 80 ba c1 ff       	call   ca417a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f111a>
 10886fa:	48 c7 45 50 1e 00 00 	mov    QWORD PTR [rbp+0x50],0x1e
 1088701:	00
 1088702:	48 c7 45 58 32 00 00 	mov    QWORD PTR [rbp+0x58],0x32
 1088709:	00
 108870a:	48 8d 7d 60          	lea    rdi,[rbp+0x60]
 108870e:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
 1088713:	e8 de 12 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1088718:	48 8d 7d 70          	lea    rdi,[rbp+0x70]
 108871c:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
 1088721:	e8 d0 12 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1088726:	48 8d bd 80 00 00 00 	lea    rdi,[rbp+0x80]
 108872d:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
 1088732:	e8 57 fb a9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 1088737:	48 8d bd d8 00 00 00 	lea    rdi,[rbp+0xd8]
 108873e:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 1088743:	e8 88 08 00 00       	call   1088fd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2503e6>
 1088748:	0f 57 c0             	xorps  xmm0,xmm0
 108874b:	0f 11 85 40 07 00 00 	movups XMMWORD PTR [rbp+0x740],xmm0
 1088752:	0f 11 85 30 07 00 00 	movups XMMWORD PTR [rbp+0x730],xmm0
```
### ref at `0x1091dc1`

```text
 1091d6e:	48 89 e6             	mov    rsi,rsp
 1091d71:	e8 f5 56 ab ff       	call   b4746b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9440b>
 1091d76:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1091d7b:	e8 06 c7 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1091d80:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 1091d85:	e8 5e 8a 74 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1091d8a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 1091d8f:	e8 e4 0f 00 00       	call   1092d78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a18e>
 1091d94:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
 1091d99:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
 1091d9e:	4d 85 f6             	test   r14,r14
 1091da1:	74 0a                	je     1091dad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2591c3>
 1091da3:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
 1091da8:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
 1091dad:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
 1091db2:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 1091db6:	48 8d 05 37 cb a1 ff 	lea    rax,[rip+0xffffffffffa1cb37]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
 1091dbd:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 1091dc1:	48 8d 05 18 60 94 ff 	lea    rax,[rip+0xffffffffff946018]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 1091dc8:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 1091dcc:	48 89 df             	mov    rdi,rbx
 1091dcf:	4c 89 fe             	mov    rsi,r15
 1091dd2:	e8 b7 f9 54 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
 1091dd7:	4c 89 ff             	mov    rdi,r15
 1091dda:	e8 bf 54 a1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 1091ddf:	31 ff                	xor    edi,edi
 1091de1:	e8 a0 c6 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1091de6:	4c 89 f7             	mov    rdi,r14
 1091de9:	e8 98 c6 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1091dee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1091df5:	00 00
 1091df7:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 1091dfe:	00
 1091dff:	75 15                	jne    1091e16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25922c>
 1091e01:	48 89 d8             	mov    rax,rbx
 1091e04:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
 1091e0b:	5b                   	pop    rbx
 1091e0c:	41 5c                	pop    r12
 1091e0e:	41 5d                	pop    r13
 1091e10:	41 5e                	pop    r14
 1091e12:	41 5f                	pop    r15
 1091e14:	5d                   	pop    rbp
 1091e15:	c3                   	ret
 1091e16:	e8 95 dc 75 00       	call   17efab0 <__stack_chk_fail@plt>
 1091e1b:	48 89 c7             	mov    rdi,rax
 1091e1e:	e8 82 7c 9e ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1091e23:	cc                   	int3
 1091e24:	55                   	push   rbp
 1091e25:	41 57                	push   r15
 1091e27:	41 56                	push   r14
```
### ref at `0x1091f44`

```text
 1091ef1:	48 89 e6             	mov    rsi,rsp
 1091ef4:	e8 72 55 ab ff       	call   b4746b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9440b>
 1091ef9:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1091efe:	e8 83 c5 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1091f03:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 1091f08:	e8 db 88 74 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1091f0d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1091f12:	e8 45 0d 00 00       	call   1092c5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a072>
 1091f17:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
 1091f1c:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
 1091f21:	4d 85 f6             	test   r14,r14
 1091f24:	74 0a                	je     1091f30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259346>
 1091f26:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
 1091f2b:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
 1091f30:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
 1091f35:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 1091f39:	48 8d 05 b4 c9 a1 ff 	lea    rax,[rip+0xffffffffffa1c9b4]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
 1091f40:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 1091f44:	48 8d 05 95 5e 94 ff 	lea    rax,[rip+0xffffffffff945e95]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 1091f4b:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 1091f4f:	48 89 df             	mov    rdi,rbx
 1091f52:	4c 89 fe             	mov    rsi,r15
 1091f55:	e8 34 f8 54 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
 1091f5a:	4c 89 ff             	mov    rdi,r15
 1091f5d:	e8 3c 53 a1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 1091f62:	31 ff                	xor    edi,edi
 1091f64:	e8 1d c5 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1091f69:	4c 89 f7             	mov    rdi,r14
 1091f6c:	e8 15 c5 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1091f71:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1091f78:	00 00
 1091f7a:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
 1091f81:	00
 1091f82:	75 15                	jne    1091f99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2593af>
 1091f84:	48 89 d8             	mov    rax,rbx
 1091f87:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
 1091f8e:	5b                   	pop    rbx
 1091f8f:	41 5c                	pop    r12
 1091f91:	41 5d                	pop    r13
 1091f93:	41 5e                	pop    r14
 1091f95:	41 5f                	pop    r15
 1091f97:	5d                   	pop    rbp
 1091f98:	c3                   	ret
 1091f99:	e8 12 db 75 00       	call   17efab0 <__stack_chk_fail@plt>
 1091f9e:	48 89 c7             	mov    rdi,rax
 1091fa1:	e8 ff 7a 9e ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1091fa6:	41 57                	push   r15
 1091fa8:	41 56                	push   r14
 1091faa:	53                   	push   rbx
 1091fab:	48 83 ec 50          	sub    rsp,0x50
```
### ref at `0x1099f4b`

```text
 1099f02:	49 89 ce             	mov    r14,rcx
 1099f05:	49 89 d7             	mov    r15,rdx
 1099f08:	49 89 f4             	mov    r12,rsi
 1099f0b:	48 89 fb             	mov    rbx,rdi
 1099f0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1099f15:	00 00
 1099f17:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 1099f1e:	00
 1099f1f:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
 1099f23:	e8 8f 00 00 00       	call   1099fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2613cd>
 1099f28:	41 89 06             	mov    DWORD PTR [r14],eax
 1099f2b:	4d 8b 64 24 08       	mov    r12,QWORD PTR [r12+0x8]
 1099f30:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
 1099f35:	4d 89 66 f0          	mov    QWORD PTR [r14-0x10],r12
 1099f39:	4c 89 f7             	mov    rdi,r14
 1099f3c:	4c 89 fe             	mov    rsi,r15
 1099f3f:	e8 4c 03 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1099f44:	48 8d 35 51 05 9e ff 	lea    rsi,[rip+0xffffffffff9e0551]        # a7a49c <JNI_OnUnload@@Base+0x1d69>
 1099f4b:	48 8d 15 1e c5 a3 ff 	lea    rdx,[rip+0xffffffffffa3c51e]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
 1099f52:	48 8d 0d d1 00 00 00 	lea    rcx,[rip+0xd1]        # 109a02a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261440>
 1099f59:	49 89 e7             	mov    r15,rsp
 1099f5c:	4c 8d 44 24 40       	lea    r8,[rsp+0x40]
 1099f61:	6a 40                	push   0x40
 1099f63:	41 59                	pop    r9
 1099f65:	4c 89 ff             	mov    rdi,r15
 1099f68:	e8 27 08 74 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1099f6d:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 1099f71:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1099f74:	48 89 df             	mov    rdi,rbx
 1099f77:	4c 89 fa             	mov    rdx,r15
 1099f7a:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1099f7d:	4c 89 ff             	mov    rdi,r15
 1099f80:	e8 63 08 74 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1099f85:	4c 89 f7             	mov    rdi,r14
 1099f88:	e8 dd ff 9d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 1099f8d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1099f94:	00 00
 1099f96:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 1099f9d:	00
 1099f9e:	75 12                	jne    1099fb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2613c8>
 1099fa0:	48 89 d8             	mov    rax,rbx
 1099fa3:	48 81 c4 88 00 00 00 	add    rsp,0x88
 1099faa:	5b                   	pop    rbx
 1099fab:	41 5c                	pop    r12
 1099fad:	41 5e                	pop    r14
 1099faf:	41 5f                	pop    r15
 1099fb1:	c3                   	ret
 1099fb2:	e8 f9 5a 75 00       	call   17efab0 <__stack_chk_fail@plt>
 1099fb7:	55                   	push   rbp
 1099fb8:	41 56                	push   r14
```
### ref at `0x10a2452`

```text
 10a23fc:	e8 29 33 ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 10a2401:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 10a2408:	00
 10a2409:	e8 4e 36 b7 ff       	call   c15a5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1629fc>
 10a240e:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
 10a2415:	00
 10a2416:	e8 a9 15 00 00       	call   10a39c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26adda>
 10a241b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10a2420:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
 10a2424:	4c 89 7b 58          	mov    QWORD PTR [rbx+0x58],r15
 10a2428:	31 ff                	xor    edi,edi
 10a242a:	e8 ed bf 9f ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 10a242f:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
 10a2434:	48 8d 05 29 a0 9d ff 	lea    rax,[rip+0xffffffffff9da029]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10a243b:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 10a2440:	48 8d 05 8d 09 00 00 	lea    rax,[rip+0x98d]        # 10a2dd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a1ea>
 10a2447:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 10a244c:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
 10a2452:	48 8d 05 87 59 93 ff 	lea    rax,[rip+0xffffffffff935987]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10a2459:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10a245e:	48 8d 05 7b 59 93 ff 	lea    rax,[rip+0xffffffffff93597b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10a2465:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10a246a:	4d 8b b6 88 03 00 00 	mov    r14,QWORD PTR [r14+0x388]
 10a2471:	6a 48                	push   0x48
 10a2473:	5f                   	pop    rdi
 10a2474:	e8 87 ba 74 00       	call   17edf00 <_Znwm@plt>
 10a2479:	49 89 c7             	mov    r15,rax
 10a247c:	0f 57 c0             	xorps  xmm0,xmm0
 10a247f:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
 10a2482:	0f 29 40 20          	movaps XMMWORD PTR [rax+0x20],xmm0
 10a2486:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
 10a248a:	48 8d 05 57 a0 7a 00 	lea    rax,[rip+0x7aa057]        # 184c4e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8bd0>
 10a2491:	49 89 07             	mov    QWORD PTR [r15],rax
 10a2494:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
 10a2499:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
 10a249e:	6a 48                	push   0x48
 10a24a0:	5f                   	pop    rdi
 10a24a1:	e8 5a ba 74 00       	call   17edf00 <_Znwm@plt>
 10a24a6:	49 89 c4             	mov    r12,rax
 10a24a9:	48 8d 68 48          	lea    rbp,[rax+0x48]
 10a24ad:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
 10a24b4:	00
 10a24b5:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 10a24ba:	4c 89 ef             	mov    rdi,r13
 10a24bd:	e8 44 0f 00 00       	call   10a3406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a81c>
 10a24c2:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
 10a24c6:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
 10a24cb:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
 10a24d0:	e8 79 0f 00 00       	call   10a344e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a864>
 10a24d5:	49 8d 7c 24 28       	lea    rdi,[r12+0x28]
```
### ref at `0x10a245e`

```text
 10a2408:	00
 10a2409:	e8 4e 36 b7 ff       	call   c15a5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1629fc>
 10a240e:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
 10a2415:	00
 10a2416:	e8 a9 15 00 00       	call   10a39c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26adda>
 10a241b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10a2420:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
 10a2424:	4c 89 7b 58          	mov    QWORD PTR [rbx+0x58],r15
 10a2428:	31 ff                	xor    edi,edi
 10a242a:	e8 ed bf 9f ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 10a242f:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
 10a2434:	48 8d 05 29 a0 9d ff 	lea    rax,[rip+0xffffffffff9da029]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10a243b:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 10a2440:	48 8d 05 8d 09 00 00 	lea    rax,[rip+0x98d]        # 10a2dd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a1ea>
 10a2447:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 10a244c:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
 10a2452:	48 8d 05 87 59 93 ff 	lea    rax,[rip+0xffffffffff935987]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10a2459:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10a245e:	48 8d 05 7b 59 93 ff 	lea    rax,[rip+0xffffffffff93597b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10a2465:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10a246a:	4d 8b b6 88 03 00 00 	mov    r14,QWORD PTR [r14+0x388]
 10a2471:	6a 48                	push   0x48
 10a2473:	5f                   	pop    rdi
 10a2474:	e8 87 ba 74 00       	call   17edf00 <_Znwm@plt>
 10a2479:	49 89 c7             	mov    r15,rax
 10a247c:	0f 57 c0             	xorps  xmm0,xmm0
 10a247f:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
 10a2482:	0f 29 40 20          	movaps XMMWORD PTR [rax+0x20],xmm0
 10a2486:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
 10a248a:	48 8d 05 57 a0 7a 00 	lea    rax,[rip+0x7aa057]        # 184c4e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8bd0>
 10a2491:	49 89 07             	mov    QWORD PTR [r15],rax
 10a2494:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
 10a2499:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
 10a249e:	6a 48                	push   0x48
 10a24a0:	5f                   	pop    rdi
 10a24a1:	e8 5a ba 74 00       	call   17edf00 <_Znwm@plt>
 10a24a6:	49 89 c4             	mov    r12,rax
 10a24a9:	48 8d 68 48          	lea    rbp,[rax+0x48]
 10a24ad:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
 10a24b4:	00
 10a24b5:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 10a24ba:	4c 89 ef             	mov    rdi,r13
 10a24bd:	e8 44 0f 00 00       	call   10a3406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a81c>
 10a24c2:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
 10a24c6:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
 10a24cb:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
 10a24d0:	e8 79 0f 00 00       	call   10a344e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a864>
 10a24d5:	49 8d 7c 24 28       	lea    rdi,[r12+0x28]
 10a24da:	4c 89 ee             	mov    rsi,r13
 10a24dd:	e8 24 0f 00 00       	call   10a3406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a81c>
```
### ref at `0x10ac730`

```text
 10ac6e9:	49 63 c7             	movsxd rax,r15d
 10ac6ec:	48 63 cd             	movsxd rcx,ebp
 10ac6ef:	48 8b 94 24 e0 00 00 	mov    rdx,QWORD PTR [rsp+0xe0]
 10ac6f6:	00
 10ac6f7:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
 10ac6fe:	00
 10ac6ff:	49 89 57 10          	mov    QWORD PTR [r15+0x10],rdx
 10ac703:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
 10ac70a:	00
 10ac70b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 10ac70f:	48 83 a4 24 e0 00 00 	and    QWORD PTR [rsp+0xe0],0x0
 10ac716:	00 00
 10ac718:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac71f:	00
 10ac720:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
 10ac725:	0f 57 c9             	xorps  xmm1,xmm1
 10ac728:	0f 29 8c 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm1
 10ac72f:	00
 10ac730:	48 8d 15 a9 b6 92 ff 	lea    rdx,[rip+0xffffffffff92b6a9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx
 10ac73b:	48 8d 15 ea 14 00 00 	lea    rdx,[rip+0x14ea]        # 10adc2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275042>
 10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx
 10ac746:	48 8d 15 43 06 7a 00 	lea    rdx,[rip+0x7a0643]        # 184cd90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9478>
 10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx
 10ac750:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
 10ac757:	00
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
```
