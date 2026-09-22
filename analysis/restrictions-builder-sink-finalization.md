# Restrictions builder sink/finalization trace

Purpose: follow the edge below the builder/buffer emit helpers. Previous traces showed `0x165dd40` and branch helpers only write a builder/output buffer. This trace checks the sink/refill interface at `builder+0x18` and later constructor finalization around `0x10aba36`.

## Key sink call in `165c600`

```text
 165c626:	e8 a5 34 19 00       	call   17efad0 <memcpy@plt>
 165c62b:	41 80 7d 00 00       	cmp    BYTE PTR [r13+0x0],0x0
 165c630:	74 41                	je     165c673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107df>
 165c632:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
 165c636:	49 01 c4             	add    r12,rax
 165c639:	29 c3                	sub    ebx,eax
 165c63b:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
 165c63f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 165c642:	4c 89 fe             	mov    rsi,r15
 165c645:	4c 89 f2             	mov    rdx,r14
 165c648:	ff 50 10             	call   QWORD PTR [rax+0x10]
 165c64b:	84 c0                	test   al,al
 165c64d:	75 ca                	jne    165c619 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10785>
 165c64f:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
 165c654:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
 165c659:	41 c6 45 00 00       	mov    BYTE PTR [r13+0x0],0x0
```
Interpretation target: `builder+0x18` is loaded as a sink/interface object, then `[sink.vtable+0x10]` is called with pointers to builder output pointer/capacity fields.

## Summary

| window | refs | writes | calls with tracked args | `+0x18` writes/hits | interpretation |
|---|---:|---:|---:|---:|---|
| `a9ca1a builder/string setup helper` | 5 | 1 | 9 | 0 | builder/string setup candidate |
| `a7b624 cleanup/finalizer helper` | 9 | 3 | 6 | 1 | cleanup/finalizer candidate |
| `165c600 append/copy with sink refill` | 9 | 5 | 3 | 0 | buffer append/copy; sink refill through builder+0x18 when capacity runs out |
| `10aba36 post slot-wrapper calls` | 6 | 0 | 11 | 0 | constructor finalization window |
| `10aba36 later finalization window` | 6 | 7 | 12 | 0 | constructor finalization window |

## `a9ca1a builder/string setup helper`

```text
  a9ca1a:	e9 81 14 d5 00       	jmp    17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  a9ca1f:	40 80 ff 03          	cmp    dil,0x3
  a9ca23:	77 1e                	ja     a9ca43 <JNI_OnUnload@@Base+0x24310>
  a9ca25:	48 8d 05 64 2e 8f ff 	lea    rax,[rip+0xffffffffff8f2e64]        # 38f890 <_ZTSSt12bad_any_cast@@Base-0x938>
  a9ca2c:	40 0f b6 cf          	movzx  ecx,dil
  a9ca30:	48 8b 14 c8          	mov    rdx,QWORD PTR [rax+rcx*8]
  a9ca34:	48 8d 35 89 1e 90 ff 	lea    rsi,[rip+0xffffffffff901e89]        # 39e8c4 <_ZTSNSt6__ndk117bad_function_callE@@Base+0xac>
  a9ca3b:	48 63 04 8e          	movsxd rax,DWORD PTR [rsi+rcx*4]
  a9ca3f:	48 01 f0             	add    rax,rsi
  a9ca42:	c3                   	ret
  a9ca43:	48 8d 05 ce 51 9b ff 	lea    rax,[rip+0xffffffffff9b51ce]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  a9ca4a:	6a 07                	push   0x7
  a9ca4c:	5a                   	pop    rdx
  a9ca4d:	c3                   	ret
  a9ca4e:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
  a9ca55:	49 89 e2             	mov    r10,rsp
  a9ca58:	49 89 4a 18          	mov    QWORD PTR [r10+0x18],rcx
  a9ca5c:	4d 89 42 20          	mov    QWORD PTR [r10+0x20],r8
  a9ca60:	4d 89 4a 28          	mov    QWORD PTR [r10+0x28],r9
  a9ca64:	84 c0                	test   al,al
  a9ca66:	74 31                	je     a9ca99 <JNI_OnUnload@@Base+0x24366>
  a9ca68:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  a9ca6d:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
  a9ca72:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
  a9ca77:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
  a9ca7c:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
  a9ca81:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
  a9ca88:	00
  a9ca89:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
  a9ca90:	00
  a9ca91:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
  a9ca98:	00
  a9ca99:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a9caa0:	00 00
  a9caa2:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
  a9caa9:	00
  a9caaa:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
  a9cab1:	00
  a9cab2:	4c 89 51 10          	mov    QWORD PTR [rcx+0x10],r10
  a9cab6:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
  a9cabd:	00
  a9cabe:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  a9cac2:	48 b8 18 00 00 00 30 	movabs rax,0x3000000018
  a9cac9:	00 00 00
  a9cacc:	48 89 01             	mov    QWORD PTR [rcx],rax
  a9cacf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a9cad2:	ff 90 98 03 00 00    	call   QWORD PTR [rax+0x398]
  a9cad8:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  a9cadf:	00 00
  a9cae1:	48 3b 8c 24 d0 00 00 	cmp    rcx,QWORD PTR [rsp+0xd0]
  a9cae8:	00
  a9cae9:	75 08                	jne    a9caf3 <JNI_OnUnload@@Base+0x243c0>
  a9caeb:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
  a9caf2:	c3                   	ret
  a9caf3:	e8 b8 2f d5 00       	call   17efab0 <__stack_chk_fail@plt>
  a9caf8:	53                   	push   rbx
  a9caf9:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  a9cafd:	48 85 c0             	test   rax,rax
  a9cb00:	74 11                	je     a9cb13 <JNI_OnUnload@@Base+0x243e0>
  a9cb02:	48 89 fb             	mov    rbx,rdi
  a9cb05:	31 ff                	xor    edi,edi
  a9cb07:	48 89 de             	mov    rsi,rbx
  a9cb0a:	31 d2                	xor    edx,edx
  a9cb0c:	ff d0                	call   rax
  a9cb0e:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  a9cb13:	5b                   	pop    rbx
  a9cb14:	c3                   	ret
  a9cb15:	48 89 c7             	mov    rdi,rax
  a9cb18:	e8 88 cf fd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  a9cb1d:	cc                   	int3
  a9cb1e:	53                   	push   rbx
  a9cb1f:	48 89 fb             	mov    rbx,rdi
  a9cb22:	e8 27 00 00 00       	call   a9cb4e <JNI_OnUnload@@Base+0x2441b>
  a9cb27:	48 83 c3 08          	add    rbx,0x8
  a9cb2b:	48 89 df             	mov    rdi,rbx
  a9cb2e:	5b                   	pop    rbx
  a9cb2f:	e9 d8 88 d3 00       	jmp    17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
  a9cb34:	48 89 c7             	mov    rdi,rax
  a9cb37:	e8 69 cf fd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  a9cb3c:	53                   	push   rbx
  a9cb3d:	48 89 fb             	mov    rbx,rdi
  a9cb40:	e8 d9 ff ff ff       	call   a9cb1e <JNI_OnUnload@@Base+0x243eb>
  a9cb45:	48 89 df             	mov    rdi,rbx
  a9cb48:	5b                   	pop    rbx
  a9cb49:	e9 d2 13 d5 00       	jmp    17edf20 <_ZdlPv@plt>
  a9cb4e:	41 57                	push   r15
  a9cb50:	41 56                	push   r14
  a9cb52:	53                   	push   rbx
  a9cb53:	48 83 ec 20          	sub    rsp,0x20
  a9cb57:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a9cb5e:	00 00
  a9cb60:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  a9cb65:	48 83 7f 10 00       	cmp    QWORD PTR [rdi+0x10],0x0
  a9cb6a:	74 6f                	je     a9cbdb <JNI_OnUnload@@Base+0x244a8>
  a9cb6c:	48 89 fb             	mov    rbx,rdi
  a9cb6f:	48 8d 35 ae bf 8a ff 	lea    rsi,[rip+0xffffffffff8abfae]        # 348b24 <_ZTSSt12bad_any_cast@@Base-0x476a4>
  a9cb76:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  a9cb7b:	4c 89 f7             	mov    rdi,r14
  a9cb7e:	e8 11 80 d3 00       	call   17d4b94 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9b5>
```
### Writes/hits of tracked objects
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0xa9cb0e` | `output builder object` | `rbx+0x10` | `a9cb0e:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0xa9ca34` | `rdi=output builder object, rsi=input arg rsi, rdx=input arg rdx` | `a9ca34:	48 8d 35 89 1e 90 ff 	lea    rsi,[rip+0xffffffffff901e89]        # 39e8c4 <_ZTSNSt6__ndk117bad_function_callE@@Base+0xac>` |
| `0xa9cad2` | `rdi=output builder object, rsi=input arg rsi, rdx=input arg rdx, rax=load(output builder object:rdi)` | `a9cad2:	ff 90 98 03 00 00    	call   QWORD PTR [rax+0x398]` |
| `0xa9caf3` | `rdi=output builder object, rsi=input arg rsi, rdx=input arg rdx, rax=load(output builder object:rdi)` | `a9caf3:	e8 b8 2f d5 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xa9cb0c` | `rdi=output builder object, rsi=output builder object, rdx=input arg rdx, rax=load(output builder object:rdi+0x10), rbx=output builder object` | `a9cb0c:	ff d0                	call   rax` |
| `0xa9cb18` | `rdi=load(output builder object:rdi+0x10), rsi=output builder object, rdx=input arg rdx, rax=load(output builder object:rdi+0x10), rbx=output builder object` | `a9cb18:	e8 88 cf fd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xa9cb22` | `rdi=load(output builder object:rdi+0x10), rsi=output builder object, rdx=input arg rdx, rax=load(output builder object:rdi+0x10), rbx=load(output builder object:rdi+0x10)` | `a9cb22:	e8 27 00 00 00       	call   a9cb4e <JNI_OnUnload@@Base+0x2441b>` |
| `0xa9cb37` | `rdi=load(output builder object:rdi+0x10), rsi=output builder object, rdx=input arg rdx, rax=load(output builder object:rdi+0x10), rbx=load(output builder object:rdi+0x10)` | `a9cb37:	e8 69 cf fd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xa9cb40` | `rdi=load(output builder object:rdi+0x10), rsi=output builder object, rdx=input arg rdx, rax=load(output builder object:rdi+0x10), rbx=load(output builder object:rdi+0x10)` | `a9cb40:	e8 d9 ff ff ff       	call   a9cb1e <JNI_OnUnload@@Base+0x243eb>` |
| `0xa9cb7e` | `rdi=load(output builder object:rdi+0x10), rsi=output builder object, rdx=input arg rdx, rax=load(output builder object:rdi+0x10), rbx=load(output builder object:rdi+0x10)` | `a9cb7e:	e8 11 80 d3 00       	call   17d4b94 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9b5>` |

## `a7b624 cleanup/finalizer helper`

```text
  a7b624:	53                   	push   rbx
  a7b625:	48 89 fb             	mov    rbx,rdi
  a7b628:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  a7b62b:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
  a7b62f:	74 11                	je     a7b642 <JNI_OnUnload@@Base+0x2f0f>
  a7b631:	e8 0e 00 00 00       	call   a7b644 <JNI_OnUnload@@Base+0x2f11>
  a7b636:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a7b639:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  a7b63c:	5b                   	pop    rbx
  a7b63d:	e9 de 28 d7 00       	jmp    17edf20 <_ZdlPv@plt>
  a7b642:	5b                   	pop    rbx
  a7b643:	c3                   	ret
  a7b644:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
  a7b647:	e9 00 00 00 00       	jmp    a7b64c <JNI_OnUnload@@Base+0x2f19>
  a7b64c:	41 57                	push   r15
  a7b64e:	41 56                	push   r14
  a7b650:	53                   	push   rbx
  a7b651:	48 89 f3             	mov    rbx,rsi
  a7b654:	49 89 fe             	mov    r14,rdi
  a7b657:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  a7b65b:	49 39 f7             	cmp    r15,rsi
  a7b65e:	74 11                	je     a7b671 <JNI_OnUnload@@Base+0x2f3e>
  a7b660:	49 83 c7 e8          	add    r15,0xffffffffffffffe8
  a7b664:	4c 89 ff             	mov    rdi,r15
  a7b667:	e8 24 28 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a7b66c:	49 39 df             	cmp    r15,rbx
  a7b66f:	75 ef                	jne    a7b660 <JNI_OnUnload@@Base+0x2f2d>
  a7b671:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
  a7b675:	5b                   	pop    rbx
  a7b676:	41 5e                	pop    r14
  a7b678:	41 5f                	pop    r15
  a7b67a:	c3                   	ret
  a7b67b:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
  a7b680:	48 39 d6             	cmp    rsi,rdx
  a7b683:	74 30                	je     a7b6b5 <JNI_OnUnload@@Base+0x2f82>
  a7b685:	0f 57 c0             	xorps  xmm0,xmm0
  a7b688:	48 8d 41 e8          	lea    rax,[rcx-0x18]
  a7b68c:	48 8b 7e f8          	mov    rdi,QWORD PTR [rsi-0x8]
  a7b690:	48 89 79 f8          	mov    QWORD PTR [rcx-0x8],rdi
  a7b694:	0f 10 4e e8          	movups xmm1,XMMWORD PTR [rsi-0x18]
  a7b698:	0f 11 49 e8          	movups XMMWORD PTR [rcx-0x18],xmm1
  a7b69c:	0f 11 46 e8          	movups XMMWORD PTR [rsi-0x18],xmm0
  a7b6a0:	48 83 66 f8 00       	and    QWORD PTR [rsi-0x8],0x0
  a7b6a5:	48 8d 7e e8          	lea    rdi,[rsi-0x18]
  a7b6a9:	48 89 fe             	mov    rsi,rdi
  a7b6ac:	48 89 c1             	mov    rcx,rax
  a7b6af:	48 39 d7             	cmp    rdi,rdx
  a7b6b2:	75 d4                	jne    a7b688 <JNI_OnUnload@@Base+0x2f55>
  a7b6b4:	c3                   	ret
  a7b6b5:	48 89 c8             	mov    rax,rcx
  a7b6b8:	c3                   	ret
  a7b6b9:	53                   	push   rbx
  a7b6ba:	48 b8 ab aa aa aa aa 	movabs rax,0xaaaaaaaaaaaaaab
  a7b6c1:	aa aa 0a
  a7b6c4:	48 39 c7             	cmp    rdi,rax
  a7b6c7:	73 11                	jae    a7b6da <JNI_OnUnload@@Base+0x2fa7>
  a7b6c9:	48 89 fb             	mov    rbx,rdi
  a7b6cc:	48 6b ff 18          	imul   rdi,rdi,0x18
  a7b6d0:	e8 2b 28 d7 00       	call   17edf00 <_Znwm@plt>
  a7b6d5:	48 89 da             	mov    rdx,rbx
  a7b6d8:	5b                   	pop    rbx
  a7b6d9:	c3                   	ret
  a7b6da:	e8 00 00 00 00       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
  a7b6df:	53                   	push   rbx
  a7b6e0:	6a 08                	push   0x8
  a7b6e2:	5f                   	pop    rdi
  a7b6e3:	e8 c8 27 d7 00       	call   17edeb0 <__cxa_allocate_exception@plt>
  a7b6e8:	48 89 c3             	mov    rbx,rax
  a7b6eb:	48 89 c7             	mov    rdi,rax
  a7b6ee:	e8 5d 28 d7 00       	call   17edf50 <_ZNSt20bad_array_new_lengthC1Ev@plt>
  a7b6f3:	48 8b 35 86 63 e3 00 	mov    rsi,QWORD PTR [rip+0xe36386]        # 18b1a80 <_ZTISt20bad_array_new_length@@Base+0xb85a8>
  a7b6fa:	48 8b 15 77 63 e3 00 	mov    rdx,QWORD PTR [rip+0xe36377]        # 18b1a78 <_ZNSt20bad_array_new_lengthD1Ev@@Base+0xed9c98>
```
### Writes/hits of tracked objects
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0xa7b671` | `load(load(wrapper stack object:rbx):rax)` | `r14+0x8` | `a7b671:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx` |
| `0xa7b69c` | `load(load(load(wrapper stack object:rbx):rax):rdi)` | `rsi-0x18` | `a7b69c:	0f 11 46 e8          	movups XMMWORD PTR [rsi-0x18],xmm0` |
| `0xa7b6a0` | `load(load(load(wrapper stack object:rbx):rax):rdi)` | `rsi-0x8` | `a7b6a0:	48 83 66 f8 00       	and    QWORD PTR [rsi-0x8],0x0` |

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0xa7b631` | `rdi=load(wrapper stack object:rdi), rbx=wrapper stack object` | `a7b631:	e8 0e 00 00 00       	call   a7b644 <JNI_OnUnload@@Base+0x2f11>` |
| `0xa7b667` | `rdi=load(load(load(wrapper stack object:rbx):rax):rdi+0x8), rsi=load(load(load(wrapper stack object:rbx):rax):rdi), rax=load(wrapper stack object:rbx), rbx=load(load(load(wrapper stack object:rbx):rax):rdi), r14=load(load(wrapper stack object:rbx):rax), r15=load(load(load(wrapper stack object:rbx):rax):rdi+0x8)` | `a7b667:	e8 24 28 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa7b6d0` | `rdi=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rsi=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rcx=load(wrapper stack object:rbx), rax=load(wrapper stack object:rbx), rbx=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), r14=load(load(wrapper stack object:rbx):rax), r15=load(load(load(wrapper stack object:rbx):rax):rdi+0x8)` | `a7b6d0:	e8 2b 28 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa7b6da` | `rdi=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rsi=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rdx=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rcx=load(wrapper stack object:rbx), rax=load(wrapper stack object:rbx), rbx=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), r14=load(load(wrapper stack object:rbx):rax), r15=load(load(load(wrapper stack object:rbx):rax):rdi+0x8)` | `a7b6da:	e8 00 00 00 00       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>` |
| `0xa7b6e3` | `rdi=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rsi=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rdx=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rcx=load(wrapper stack object:rbx), rax=load(wrapper stack object:rbx), rbx=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), r14=load(load(wrapper stack object:rbx):rax), r15=load(load(load(wrapper stack object:rbx):rax):rdi+0x8)` | `a7b6e3:	e8 c8 27 d7 00       	call   17edeb0 <__cxa_allocate_exception@plt>` |
| `0xa7b6ee` | `rdi=load(wrapper stack object:rbx), rsi=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rdx=addr(load(load(load(wrapper stack object:rbx):rax):rdi):rsi-0x18), rcx=load(wrapper stack object:rbx), rax=load(wrapper stack object:rbx), rbx=load(wrapper stack object:rbx), r14=load(load(wrapper stack object:rbx):rax), r15=load(load(load(wrapper stack object:rbx):rax):rdi+0x8)` | `a7b6ee:	e8 5d 28 d7 00       	call   17edf50 <_ZNSt20bad_array_new_lengthC1Ev@plt>` |

### +0x18 writes/hits
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0xa7b69c` | `load(load(load(wrapper stack object:rbx):rax):rdi)` | `rsi-0x18` | `a7b69c:	0f 11 46 e8          	movups XMMWORD PTR [rsi-0x18],xmm0` |

## `165c600 append/copy with sink refill`

```text
 165c600:	41 57                	push   r15
 165c602:	41 56                	push   r14
 165c604:	41 55                	push   r13
 165c606:	41 54                	push   r12
 165c608:	53                   	push   rbx
 165c609:	89 d3                	mov    ebx,edx
 165c60b:	49 89 f4             	mov    r12,rsi
 165c60e:	49 89 fd             	mov    r13,rdi
 165c611:	4c 8d 77 10          	lea    r14,[rdi+0x10]
 165c615:	4c 8d 7f 08          	lea    r15,[rdi+0x8]
 165c619:	41 8b 16             	mov    edx,DWORD PTR [r14]
 165c61c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
 165c61f:	39 d3                	cmp    ebx,edx
 165c621:	76 3d                	jbe    165c660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107cc>
 165c623:	4c 89 e6             	mov    rsi,r12
 165c626:	e8 a5 34 19 00       	call   17efad0 <memcpy@plt>
 165c62b:	41 80 7d 00 00       	cmp    BYTE PTR [r13+0x0],0x0
 165c630:	74 41                	je     165c673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107df>
 165c632:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
 165c636:	49 01 c4             	add    r12,rax
 165c639:	29 c3                	sub    ebx,eax
 165c63b:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
 165c63f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 165c642:	4c 89 fe             	mov    rsi,r15
 165c645:	4c 89 f2             	mov    rdx,r14
 165c648:	ff 50 10             	call   QWORD PTR [rax+0x10]
 165c64b:	84 c0                	test   al,al
 165c64d:	75 ca                	jne    165c619 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10785>
 165c64f:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
 165c654:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
 165c659:	41 c6 45 00 00       	mov    BYTE PTR [r13+0x0],0x0
 165c65e:	eb 13                	jmp    165c673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107df>
 165c660:	89 da                	mov    edx,ebx
 165c662:	4c 89 e6             	mov    rsi,r12
 165c665:	e8 66 34 19 00       	call   17efad0 <memcpy@plt>
 165c66a:	48 63 c3             	movsxd rax,ebx
 165c66d:	49 01 07             	add    QWORD PTR [r15],rax
 165c670:	41 29 1e             	sub    DWORD PTR [r14],ebx
 165c673:	5b                   	pop    rbx
 165c674:	41 5c                	pop    r12
 165c676:	41 5d                	pop    r13
 165c678:	41 5e                	pop    r14
 165c67a:	41 5f                	pop    r15
 165c67c:	c3                   	ret
 165c67d:	cc                   	int3
```
### Writes/hits of tracked objects
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165c64f` | `builder/output object` | `r13+0x8` | `165c64f:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0` |
| `0x165c654` | `builder/output object` | `r13+0x10` | `165c654:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0` |
| `0x165c659` | `builder/output object` | `r13+0x0` | `165c659:	41 c6 45 00 00       	mov    BYTE PTR [r13+0x0],0x0` |
| `0x165c66d` | `addr(builder/output object:rdi+0x8)` | `r15` | `165c66d:	49 01 07             	add    QWORD PTR [r15],rax` |
| `0x165c670` | `addr(builder/output object:rdi+0x10)` | `r14` | `165c670:	41 29 1e             	sub    DWORD PTR [r14],ebx` |

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0x165c626` | `rdi=load(addr(builder/output object:rdi+0x8):r15), rsi=source bytes, rdx=byte count, r12=source bytes, r13=builder/output object, r14=addr(builder/output object:rdi+0x10), r15=addr(builder/output object:rdi+0x8)` | `165c626:	e8 a5 34 19 00       	call   17efad0 <memcpy@plt>` |
| `0x165c648` | `rdi=load(builder/output object:r13+0x18), rsi=addr(builder/output object:rdi+0x8), rdx=addr(builder/output object:rdi+0x10), rax=load(load(builder/output object:r13+0x18):rdi), r12=source bytes, r13=builder/output object, r14=addr(builder/output object:rdi+0x10), r15=addr(builder/output object:rdi+0x8)` | `165c648:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x165c665` | `rdi=load(builder/output object:r13+0x18), rsi=source bytes, rdx=addr(builder/output object:rdi+0x10), rax=load(load(builder/output object:r13+0x18):rdi), r12=source bytes, r13=builder/output object, r14=addr(builder/output object:rdi+0x10), r15=addr(builder/output object:rdi+0x8)` | `165c665:	e8 66 34 19 00       	call   17efad0 <memcpy@plt>` |

## `10aba36 post slot-wrapper calls`

```text
 10abfc1:	6a 08                	push   0x8
 10abfc3:	e8 c6 b6 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abfc8:	58                   	pop    rax
 10abfc9:	59                   	pop    rcx
 10abfca:	4c 89 ef             	mov    rdi,r13
 10abfcd:	e8 16 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abfd2:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10abfd7:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10abfdb:	48 8d 35 3e b8 32 ff 	lea    rsi,[rip+0xffffffffff32b83e]        # 3d7820 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2405>
 10abfe2:	48 8d 0d 49 b8 32 ff 	lea    rcx,[rip+0xffffffffff32b849]        # 3d7832 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2417>
 10abfe9:	6a 0a                	push   0xa
 10abfeb:	41 58                	pop    r8
 10abfed:	6a 06                	push   0x6
 10abfef:	41 59                	pop    r9
 10abff1:	48 89 ea             	mov    rdx,rbp
 10abff4:	6a 06                	push   0x6
 10abff6:	6a 01                	push   0x1
 10abff8:	e8 f5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10abffd:	48 83 c4 10          	add    rsp,0x10
 10ac001:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac005:	48 8d 35 34 b8 32 ff 	lea    rsi,[rip+0xffffffffff32b834]        # 3d7840 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2425>
 10ac00c:	48 8d 0d 4d b8 32 ff 	lea    rcx,[rip+0xffffffffff32b84d]        # 3d7860 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2445>
 10ac013:	6a 17                	push   0x17
 10ac015:	41 58                	pop    r8
 10ac017:	6a 3c                	push   0x3c
 10ac019:	41 59                	pop    r9
 10ac01b:	48 89 ea             	mov    rdx,rbp
 10ac01e:	4c 89 e5             	mov    rbp,r12
 10ac021:	68 a0 05 00 00       	push   0x5a0
 10ac026:	6a 3c                	push   0x3c
 10ac028:	e8 c5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac02d:	48 83 c4 10          	add    rsp,0x10
 10ac031:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
 10ac035:	48 8d 35 d4 b3 32 ff 	lea    rsi,[rip+0xffffffffff32b3d4]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10ac03c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac043:	00
 10ac044:	e8 35 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac049:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10ac050:	00
 10ac051:	48 8d 35 53 c8 32 ff 	lea    rsi,[rip+0xffffffffff32c853]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac058:	e8 21 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac05d:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]
 10ac064:	00
 10ac065:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10ac06c:	00
 10ac06d:	6a 02                	push   0x2
 10ac06f:	5a                   	pop    rdx
 10ac070:	4c 89 ef             	mov    rdi,r13
 10ac073:	e8 e0 b3 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10ac078:	6a 18                	push   0x18
 10ac07a:	41 5e                	pop    r14
 10ac07c:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ac080:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ac087:	e8 04 1e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac08c:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ac090:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ac094:	75 e6                	jne    10ac07c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273492>
 10ac096:	48 8d 35 13 b4 32 ff 	lea    rsi,[rip+0xffffffffff32b413]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac09d:	48 8d 0d 2c b4 32 ff 	lea    rcx,[rip+0xffffffffff32b42c]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac0a4:	4c 8d 0d ed b5 32 ff 	lea    r9,[rip+0xffffffffff32b5ed]        # 3d7698 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x227d>
 10ac0ab:	6a 11                	push   0x11
 10ac0ad:	41 5e                	pop    r14
 10ac0af:	6a 19                	push   0x19
 10ac0b1:	41 58                	pop    r8
 10ac0b3:	4c 89 e7             	mov    rdi,r12
 10ac0b6:	4c 89 f2             	mov    rdx,r14
 10ac0b9:	41 55                	push   r13
 10ac0bb:	6a 08                	push   0x8
 10ac0bd:	e8 cc b5 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10ac0c2:	58                   	pop    rax
 10ac0c3:	59                   	pop    rcx
 10ac0c4:	4c 89 ef             	mov    rdi,r13
 10ac0c7:	e8 1c f5 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10ac0cc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac0d0:	6a 01                	push   0x1
 10ac0d2:	41 5c                	pop    r12
 10ac0d4:	48 8d 35 d5 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5d5]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac0db:	48 8d 0d ee b5 32 ff 	lea    rcx,[rip+0xffffffffff32b5ee]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac0e2:	6a 12                	push   0x12
 10ac0e4:	41 58                	pop    r8
 10ac0e6:	6a 03                	push   0x3
 10ac0e8:	41 59                	pop    r9
 10ac0ea:	4c 89 f2             	mov    rdx,r14
 10ac0ed:	6a 64                	push   0x64
 10ac0ef:	41 54                	push   r12
 10ac0f1:	e8 fc b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac0f6:	48 83 c4 10          	add    rsp,0x10
 10ac0fa:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac0fe:	48 8d 35 eb b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5eb]        # 3d76f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d5>
 10ac105:	48 8d 0d 04 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b604]        # 3d7710 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f5>
 10ac10c:	6a 1f                	push   0x1f
 10ac10e:	41 58                	pop    r8
 10ac110:	4c 89 f2             	mov    rdx,r14
 10ac113:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac119:	68 80 51 01 00       	push   0x15180
 10ac11e:	41 54                	push   r12
```
### Writes/hits of tracked objects
No tracked writes in scanned window.

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0x10abfc3` | `rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10abfc3:	e8 c6 b6 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abfcd` | `rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10abfcd:	e8 16 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abff8` | `rdi=load(load(bundle30_slot):r12), rdx=bundle30_slot, rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10abff8:	e8 f5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac028` | `rdi=load(load(bundle30_slot):r12), rdx=bundle30_slot, rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10ac028:	e8 c5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac044` | `rdi=load(load(bundle30_slot):r12), rdx=bundle30_slot, rbx=child object, r12=load(load(bundle30_slot):r12), r14=unknown/current object` | `10ac044:	e8 35 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac058` | `rdi=load(load(bundle30_slot):r12), rdx=bundle30_slot, rbx=child object, r12=load(load(bundle30_slot):r12), r14=unknown/current object` | `10ac058:	e8 21 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac073` | `rdi=load(load(bundle30_slot):r12), rdx=bundle30_slot, rbx=child object, r12=load(load(bundle30_slot):r12), r14=unknown/current object` | `10ac073:	e8 e0 b3 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10ac087` | `rdi=addr(unknown/current object:rsp+r14*1), rdx=bundle30_slot, rbx=child object, r12=load(load(bundle30_slot):r12), r14=unknown/current object` | `10ac087:	e8 04 1e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac0bd` | `rdi=load(load(bundle30_slot):r12), rdx=unknown/current object, rbx=child object, r12=load(load(bundle30_slot):r12), r14=unknown/current object` | `10ac0bd:	e8 cc b5 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10ac0c7` | `rdi=load(load(bundle30_slot):r12), rdx=unknown/current object, rbx=child object, r12=load(load(bundle30_slot):r12), r14=unknown/current object` | `10ac0c7:	e8 1c f5 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10ac0f1` | `rdi=load(load(bundle30_slot):rbp+0x0), rdx=unknown/current object, rbx=child object, r12=load(load(bundle30_slot):r12), r14=unknown/current object` | `10ac0f1:	e8 fc b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |

## `10aba36 later finalization window`

```text
 10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac125:	48 83 c4 10          	add    rsp,0x10
 10ac129:	6a 28                	push   0x28
 10ac12b:	5f                   	pop    rdi
 10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac131:	49 89 c6             	mov    r14,rax
 10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10ac13b:	00 00
 10ac13d:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 10ac144:	00 00
 10ac146:	6a 30                	push   0x30
 10ac148:	5f                   	pop    rdi
 10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac14e:	49 89 c4             	mov    r12,rax
 10ac151:	48 89 c7             	mov    rdi,rax
 10ac154:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 10ac15e:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac165:	00
 10ac166:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12
 10ac16a:	48 8d 05 69 78 a1 ff 	lea    rax,[rip+0xffffffffffa17869]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ac175:	48 8d 05 9a 1a 00 00 	lea    rax,[rip+0x1a9a]        # 10adc16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27502c>
 10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10ac187:	49 89 06             	mov    QWORD PTR [r14],rax
 10ac18a:	4c 89 f7             	mov    rdi,r14
 10ac18d:	48 83 c7 08          	add    rdi,0x8
 10ac191:	4c 89 ee             	mov    rsi,r13
 10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 10ac199:	4c 89 ef             	mov    rdi,r13
 10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1a6:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac1ac:	48 85 ff             	test   rdi,rdi
 10ac1af:	74 06                	je     10ac1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2735cd>
 10ac1b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac1b7:	6a 58                	push   0x58
 10ac1b9:	5f                   	pop    rdi
 10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac1bf:	48 8d 0d 9a 20 7d 00 	lea    rcx,[rip+0x7d209a]        # 187e260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a948>
 10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac1c9:	31 ed                	xor    ebp,ebp
 10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl
 10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl
 10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl
 10ac1d7:	0f 57 c0             	xorps  xmm0,xmm0
 10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10ac1e1:	00
 10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1eb:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 10ac1ee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ac1f3:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10ac1f6:	48 8d 15 d3 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b1d3]        # 3d73d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fb5>
 10ac1fd:	4c 8d 05 ec b1 32 ff 	lea    r8,[rip+0xffffffffff32b1ec]        # 3d73f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fd5>
 10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac20b:	00
 10ac20c:	6a 11                	push   0x11
 10ac20e:	59                   	pop    rcx
 10ac20f:	6a 1f                	push   0x1f
 10ac211:	41 59                	pop    r9
 10ac213:	4c 89 f7             	mov    rdi,r14
 10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl
 10ac21f:	74 16                	je     10ac237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27364d>
 10ac221:	48 8d 35 83 c6 32 ff 	lea    rsi,[rip+0xffffffffff32c683]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac22f:	00
 10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac235:	89 c5                	mov    ebp,eax
 10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac23e:	00
 10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac244:	bf 50 01 00 00       	mov    edi,0x150
 10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>
 10ac24e:	48 8d 0d b3 15 7a 00 	lea    rcx,[rip+0x7a15b3]        # 184d808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ef0>
 10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac258:	48 8d 90 90 00 00 00 	lea    rdx,[rax+0x90]
 10ac25f:	0f 57 c0             	xorps  xmm0,xmm0
```
### Writes/hits of tracked objects
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x10ac187` | `unknown/current object` | `r14` | `10ac187:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac1c6` | `load(unknown/current object:rdi)` | `rax` | `10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac1cb` | `load(unknown/current object:rdi)` | `rax+0x8` | `10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl` |
| `0x10ac1cf` | `load(unknown/current object:rdi)` | `rax+0x38` | `10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl` |
| `0x10ac1d3` | `load(unknown/current object:rdi)` | `rax+0x40` | `10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl` |
| `0x10ac1e2` | `load(unknown/current object:rdi)` | `rax+0x48` | `10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0` |
| `0x10ac255` | `load(unknown/current object:rdi)` | `rax` | `10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx` |

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0x10ac120` | `rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac12c` | `rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac149` | `rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac159` | `rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>` |
| `0x10ac194` | `rdi=unknown/current object, rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x10ac19c` | `rdi=unknown/current object, rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ac1b4` | `rdi=unknown/current object, rax=load(unknown/current object:rdi), rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac1ba` | `rdi=unknown/current object, rax=load(unknown/current object:rdi), rbx=child object, r12=load(bundle30_slot), r14=unknown/current object` | `10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac216` | `rdi=unknown/current object, rsi=load(load(unknown/current object:rdi):rax), rax=load(unknown/current object:rdi), rbx=child object, r12=load(bundle30_slot), r13=load(load(unknown/current object:rdi):rax), r14=unknown/current object` | `10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac230` | `rdi=unknown/current object, rsi=load(load(unknown/current object:rdi):rax), rax=load(unknown/current object:rdi), rbx=child object, r12=load(bundle30_slot), r13=load(load(unknown/current object:rdi):rax), r14=unknown/current object` | `10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac23f` | `rdi=unknown/current object, rsi=load(load(unknown/current object:rdi):rax), rax=load(unknown/current object:rdi), rbx=child object, r12=load(bundle30_slot), r13=load(load(unknown/current object:rdi):rax), r14=unknown/current object` | `10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac249` | `rdi=unknown/current object, rsi=load(load(unknown/current object:rdi):rax), rax=load(unknown/current object:rdi), rbx=child object, r12=load(bundle30_slot), r13=load(load(unknown/current object:rdi):rax), r14=unknown/current object` | `10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>` |

## Interpretation

If the sink/finalization windows only touch stack builder objects and buffer pointers, the remaining semantic bridge is after serialization: a later constructor/factory step must wrap or store the materialized output into the object exposed by `b411a4`. Direct writes to `child+0x18` in these windows would close that edge.
