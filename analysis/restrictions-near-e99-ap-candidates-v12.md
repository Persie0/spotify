# Restrictions near-e99 AP candidates v12

Focus: inspect the near-`e99` AP/vtable candidates from v11 and bind their `+0x78` and `+0x10` entries where possible. Static provenance only.

## Candidate AP entry table

| AP base | +0x00 | +0x10 | +0x78 | +0x80 | note |
|---:|---:|---:|---:|---:|---|
| `0x1831968` | `10814320` | `15361384` | `15307426` | `15307446` | `near-e99` |
| `0x1831980` | `10321376` | `15361404` | `15307624` | `11363440` | `near-e99` |
| `0x18319e0` | `15307426` | `15307464` | `15307418` | `-` | `near-e99` |
| `0x1831938` | `10321376` | `15361582` | `15307676` | `15307694` | `near-e99` |
| `0x188bd68` | `23118108` | `23118146` | `15307650` | `-` | `near-e99` |
| `0x1831a00` | `11363440` | `15307650` | `15380316` | `15380334` | `near-e99` |
| `0x1831a48` | `10321376` | `15307418` | `15383414` | `15383630` | `near-e99` |

## AP candidate `0x1831968` relocation slice

```text
0000000001831968  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831970  0000000000000008 R_X86_64_RELATIVE                         ea6548
0000000001831978  0000000000000008 R_X86_64_RELATIVE                         ea6568
0000000001831980  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831988  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831990  0000000000000008 R_X86_64_RELATIVE                         ea657c
00000000018319a8  0000000000000008 R_X86_64_RELATIVE                         e9938c
00000000018319b0  0000000000000008 R_X86_64_RELATIVE                         e9939c
00000000018319b8  0000000000000008 R_X86_64_RELATIVE                         e993ae
00000000018319c8  0000000000000008 R_X86_64_RELATIVE                         a50370
00000000018319e0  0000000000000008 R_X86_64_RELATIVE                         e992a2
00000000018319e8  0000000000000008 R_X86_64_RELATIVE                         e992b6
00000000018319f0  0000000000000008 R_X86_64_RELATIVE                         e992c8
00000000018319f8  0000000000000008 R_X86_64_RELATIVE                         e99368
0000000001831a00  0000000000000008 R_X86_64_RELATIVE                         ad6470
0000000001831a08  0000000000000008 R_X86_64_RELATIVE                         ad647a
0000000001831a10  0000000000000008 R_X86_64_RELATIVE                         e99382
0000000001831a28  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a30  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831a38  0000000000000008 R_X86_64_RELATIVE                         e9926a
0000000001831a40  0000000000000008 R_X86_64_RELATIVE                         e99288
0000000001831a48  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a50  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831a58  0000000000000008 R_X86_64_RELATIVE                         e9929a
```
## AP candidate `0x1831980` relocation slice

```text
0000000001831980  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831988  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831990  0000000000000008 R_X86_64_RELATIVE                         ea657c
00000000018319a8  0000000000000008 R_X86_64_RELATIVE                         e9938c
00000000018319b0  0000000000000008 R_X86_64_RELATIVE                         e9939c
00000000018319b8  0000000000000008 R_X86_64_RELATIVE                         e993ae
00000000018319c8  0000000000000008 R_X86_64_RELATIVE                         a50370
00000000018319e0  0000000000000008 R_X86_64_RELATIVE                         e992a2
00000000018319e8  0000000000000008 R_X86_64_RELATIVE                         e992b6
00000000018319f0  0000000000000008 R_X86_64_RELATIVE                         e992c8
00000000018319f8  0000000000000008 R_X86_64_RELATIVE                         e99368
0000000001831a00  0000000000000008 R_X86_64_RELATIVE                         ad6470
0000000001831a08  0000000000000008 R_X86_64_RELATIVE                         ad647a
0000000001831a10  0000000000000008 R_X86_64_RELATIVE                         e99382
0000000001831a28  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a30  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831a38  0000000000000008 R_X86_64_RELATIVE                         e9926a
0000000001831a40  0000000000000008 R_X86_64_RELATIVE                         e99288
0000000001831a48  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a50  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831a58  0000000000000008 R_X86_64_RELATIVE                         e9929a
0000000001831a70  0000000000000008 R_X86_64_RELATIVE                         eaaf4c
0000000001831a78  0000000000000008 R_X86_64_RELATIVE                         eaaf5c
```
## AP candidate `0x18319e0` relocation slice

```text
00000000018319e0  0000000000000008 R_X86_64_RELATIVE                         e992a2
00000000018319e8  0000000000000008 R_X86_64_RELATIVE                         e992b6
00000000018319f0  0000000000000008 R_X86_64_RELATIVE                         e992c8
00000000018319f8  0000000000000008 R_X86_64_RELATIVE                         e99368
0000000001831a00  0000000000000008 R_X86_64_RELATIVE                         ad6470
0000000001831a08  0000000000000008 R_X86_64_RELATIVE                         ad647a
0000000001831a10  0000000000000008 R_X86_64_RELATIVE                         e99382
0000000001831a28  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a30  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831a38  0000000000000008 R_X86_64_RELATIVE                         e9926a
0000000001831a40  0000000000000008 R_X86_64_RELATIVE                         e99288
0000000001831a48  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a50  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831a58  0000000000000008 R_X86_64_RELATIVE                         e9929a
0000000001831a70  0000000000000008 R_X86_64_RELATIVE                         eaaf4c
0000000001831a78  0000000000000008 R_X86_64_RELATIVE                         eaaf5c
0000000001831a80  0000000000000008 R_X86_64_RELATIVE                         eaaf6e
0000000001831a90  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831aa8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831ab0  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831ab8  0000000000000008 R_X86_64_RELATIVE                         eaba9e
0000000001831ac0  0000000000000008 R_X86_64_RELATIVE                         eabb76
0000000001831ac8  0000000000000008 R_X86_64_RELATIVE                         eabc4e
```
## AP candidate `0x1831938` relocation slice

```text
0000000001831938  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831940  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831948  0000000000000008 R_X86_64_RELATIVE                         ea662e
0000000001831960  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831968  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831970  0000000000000008 R_X86_64_RELATIVE                         ea6548
0000000001831978  0000000000000008 R_X86_64_RELATIVE                         ea6568
0000000001831980  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831988  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831990  0000000000000008 R_X86_64_RELATIVE                         ea657c
00000000018319a8  0000000000000008 R_X86_64_RELATIVE                         e9938c
00000000018319b0  0000000000000008 R_X86_64_RELATIVE                         e9939c
00000000018319b8  0000000000000008 R_X86_64_RELATIVE                         e993ae
00000000018319c8  0000000000000008 R_X86_64_RELATIVE                         a50370
00000000018319e0  0000000000000008 R_X86_64_RELATIVE                         e992a2
00000000018319e8  0000000000000008 R_X86_64_RELATIVE                         e992b6
00000000018319f0  0000000000000008 R_X86_64_RELATIVE                         e992c8
00000000018319f8  0000000000000008 R_X86_64_RELATIVE                         e99368
0000000001831a00  0000000000000008 R_X86_64_RELATIVE                         ad6470
0000000001831a08  0000000000000008 R_X86_64_RELATIVE                         ad647a
0000000001831a10  0000000000000008 R_X86_64_RELATIVE                         e99382
0000000001831a28  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a30  0000000000000008 R_X86_64_RELATIVE                         a50370
```
## AP candidate `0x188bd68` relocation slice

```text
000000000188bd68  0000000000000008 R_X86_64_RELATIVE                         160c11c
000000000188bd70  0000000000000008 R_X86_64_RELATIVE                         160c130
000000000188bd78  0000000000000008 R_X86_64_RELATIVE                         160c142
000000000188bd80  0000000000000008 R_X86_64_RELATIVE                         160c1e2
000000000188bd88  0000000000000008 R_X86_64_RELATIVE                         160c1fc
000000000188bd90  0000000000000008 R_X86_64_RELATIVE                         160c206
000000000188bd98  0000000000000008 R_X86_64_RELATIVE                         160c21c
000000000188bdb0  0000000000000008 R_X86_64_RELATIVE                         160ac86
000000000188bdb8  0000000000000008 R_X86_64_RELATIVE                         160ac9a
000000000188bdc0  0000000000000008 R_X86_64_RELATIVE                         160acac
000000000188bdc8  0000000000000008 R_X86_64_RELATIVE                         160ad4c
000000000188bdd0  0000000000000008 R_X86_64_RELATIVE                         ad6470
000000000188bdd8  0000000000000008 R_X86_64_RELATIVE                         ad647a
000000000188bde0  0000000000000008 R_X86_64_RELATIVE                         e99382
000000000188bdf8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000188be00  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000188be08  0000000000000008 R_X86_64_RELATIVE                         160ac44
000000000188be10  0000000000000008 R_X86_64_RELATIVE                         160ac64
000000000188be18  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000188be20  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000188be28  0000000000000008 R_X86_64_RELATIVE                         160ac78
000000000188be40  0000000000000008 R_X86_64_RELATIVE                         160cf52
000000000188be48  0000000000000008 R_X86_64_RELATIVE                         160d01a
000000000188be50  0000000000000008 R_X86_64_RELATIVE                         160d02c
000000000188be58  0000000000000008 R_X86_64_RELATIVE                         160d4dc
000000000188be60  0000000000000008 R_X86_64_RELATIVE                         160d4e2
```
## AP candidate `0x1831a00` relocation slice

```text
0000000001831a00  0000000000000008 R_X86_64_RELATIVE                         ad6470
0000000001831a08  0000000000000008 R_X86_64_RELATIVE                         ad647a
0000000001831a10  0000000000000008 R_X86_64_RELATIVE                         e99382
0000000001831a28  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a30  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831a38  0000000000000008 R_X86_64_RELATIVE                         e9926a
0000000001831a40  0000000000000008 R_X86_64_RELATIVE                         e99288
0000000001831a48  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a50  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831a58  0000000000000008 R_X86_64_RELATIVE                         e9929a
0000000001831a70  0000000000000008 R_X86_64_RELATIVE                         eaaf4c
0000000001831a78  0000000000000008 R_X86_64_RELATIVE                         eaaf5c
0000000001831a80  0000000000000008 R_X86_64_RELATIVE                         eaaf6e
0000000001831a90  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831aa8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831ab0  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831ab8  0000000000000008 R_X86_64_RELATIVE                         eaba9e
0000000001831ac0  0000000000000008 R_X86_64_RELATIVE                         eabb76
0000000001831ac8  0000000000000008 R_X86_64_RELATIVE                         eabc4e
0000000001831ae0  0000000000000008 R_X86_64_RELATIVE                         eaba70
0000000001831ae8  0000000000000008 R_X86_64_RELATIVE                         eaba80
0000000001831af0  0000000000000008 R_X86_64_RELATIVE                         eaba92
```
## AP candidate `0x1831a48` relocation slice

```text
0000000001831a48  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831a50  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831a58  0000000000000008 R_X86_64_RELATIVE                         e9929a
0000000001831a70  0000000000000008 R_X86_64_RELATIVE                         eaaf4c
0000000001831a78  0000000000000008 R_X86_64_RELATIVE                         eaaf5c
0000000001831a80  0000000000000008 R_X86_64_RELATIVE                         eaaf6e
0000000001831a90  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831aa8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001831ab0  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831ab8  0000000000000008 R_X86_64_RELATIVE                         eaba9e
0000000001831ac0  0000000000000008 R_X86_64_RELATIVE                         eabb76
0000000001831ac8  0000000000000008 R_X86_64_RELATIVE                         eabc4e
0000000001831ae0  0000000000000008 R_X86_64_RELATIVE                         eaba70
0000000001831ae8  0000000000000008 R_X86_64_RELATIVE                         eaba80
0000000001831af0  0000000000000008 R_X86_64_RELATIVE                         eaba92
0000000001831b00  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001831b18  0000000000000008 R_X86_64_RELATIVE                         eab9f2
0000000001831b20  0000000000000008 R_X86_64_RELATIVE                         eaba06
0000000001831b28  0000000000000008 R_X86_64_RELATIVE                         eaba18
0000000001831b30  0000000000000008 R_X86_64_RELATIVE                         eaba4c
0000000001831b38  0000000000000008 R_X86_64_RELATIVE                         aae9b2
0000000001831b40  0000000000000008 R_X86_64_RELATIVE                         aae9bc
```
## Target windows for candidate entries

### target `0x9d7de0`

```text
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
```
### target `0xa50370`

```text
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
```
### target `0xad6470`

```text
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
```
### target `0xe9929a`

```text
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
```
### target `0xe992a2`

```text
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
```
### target `0xe992b6`

```text
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
```
### target `0xe992c8`

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
```
### target `0xe99368`

```text
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
```
### target `0xe99382`

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
```
### target `0xe9939c`

```text
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
```
### target `0xe993ae`

```text
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
```
### target `0xea6568`

```text
  ea650c:	48 85 d2             	test   rdx,rdx
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
```
### target `0xea657c`

```text
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
```
### target `0xea662e`

```text
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
```
### target `0xeaaf5c`

```text
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
```
### target `0xeaaf6e`

```text
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
```
### target `0xeabb76`

```text
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
```
### target `0xeabc4e`

```text
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
```
### target `0x160c11c`

```text
 160c0b2:	48 81 c4 08 01 00 00 	add    rsp,0x108
 160c0b9:	5b                   	pop    rbx
 160c0ba:	41 5c                	pop    r12
 160c0bc:	41 5d                	pop    r13
 160c0be:	41 5e                	pop    r14
 160c0c0:	41 5f                	pop    r15
 160c0c2:	5d                   	pop    rbp
 160c0c3:	c3                   	ret
 160c0c4:	e8 e7 39 1e 00       	call   17efab0 <__stack_chk_fail@plt>
 160c0c9:	cc                   	int3
 160c0ca:	66 83 a7 8c 00 00 00 	and    WORD PTR [rdi+0x8c],0x0
 160c0d1:	00
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
```
### target `0x160c142`

```text
 160c0d1:	00
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
```
## Text mentions/materializations of candidate APs/targets

| addr | instruction |
|---:|---|
| `0x9d7960` | `9d7960:	e8 7b 04 00 00       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x9d7ae7` | `9d7ae7:	e8 f4 02 00 00       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x9d7b97` | `9d7b97:	e8 44 02 00 00       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x9d7de0` | `9d7de0:	c3                   	ret` |
| `0x9e8032` | `9e8032:	e8 a9 fd fe ff       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xa50370` | `a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>` |
| `0xa556e7` | `a556e7:	48 8d 05 f2 26 f8 ff 	lea    rax,[rip+0xfffffffffff826f2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xa8fee1` | `a8fee1:	48 8d 05 f8 7e f4 ff 	lea    rax,[rip+0xfffffffffff47ef8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xac2256` | `ac2256:	48 8d 05 83 5b f1 ff 	lea    rax,[rip+0xfffffffffff15b83]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xac2278` | `ac2278:	48 8d 05 61 5b f1 ff 	lea    rax,[rip+0xfffffffffff15b61]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xac2367` | `ac2367:	48 8d 15 02 41 01 00 	lea    rdx,[rip+0x14102]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0xad0343` | `ad0343:	48 8d 0d 96 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a96]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xad0352` | `ad0352:	48 8d 0d 87 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a87]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xad036a` | `ad036a:	48 8d 0d 6f 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a6f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xad0379` | `ad0379:	48 8d 0d 60 7a f0 ff 	lea    rcx,[rip+0xfffffffffff07a60]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xad6470` | `ad6470:	48 83 c7 10          	add    rdi,0x10` |
| `0xadee9c` | `adee9c:	48 8d 05 3d 8f ef ff 	lea    rax,[rip+0xffffffffffef8f3d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xb32f8b` | `b32f8b:	48 8d 05 4e 4e ea ff 	lea    rax,[rip+0xffffffffffea4e4e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xb3e88b` | `b3e88b:	48 8d 05 4e 95 e9 ff 	lea    rax,[rip+0xffffffffffe9954e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xb3e896` | `b3e896:	48 8d 05 43 95 e9 ff 	lea    rax,[rip+0xffffffffffe99543]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xb42652` | `b42652:	48 8d 05 87 57 e9 ff 	lea    rax,[rip+0xffffffffffe95787]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xb637f5` | `b637f5:	48 8d 05 e4 45 e7 ff 	lea    rax,[rip+0xffffffffffe745e4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xb63b4b` | `b63b4b:	48 8d 05 8e 42 e7 ff 	lea    rax,[rip+0xffffffffffe7428e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xb63d70` | `b63d70:	48 8d 05 69 40 e7 ff 	lea    rax,[rip+0xffffffffffe74069]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xb6401e` | `b6401e:	48 8d 05 bb 3d e7 ff 	lea    rax,[rip+0xffffffffffe73dbb]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xc11aa1` | `c11aa1:	48 8d 15 c8 49 ec ff 	lea    rdx,[rip+0xffffffffffec49c8]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0xc46aea` | `c46aea:	48 8d 05 ef 12 d9 ff 	lea    rax,[rip+0xffffffffffd912ef]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xc4f8ae` | `c4f8ae:	48 8d 05 2b 85 d8 ff 	lea    rax,[rip+0xffffffffffd8852b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xc64cc7` | `c64cc7:	48 8d 3d 12 31 d7 ff 	lea    rdi,[rip+0xffffffffffd73112]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xc84978` | `c84978:	48 8d 05 61 34 d5 ff 	lea    rax,[rip+0xffffffffffd53461]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xcad1e9` | `cad1e9:	48 8d 05 f0 ab d2 ff 	lea    rax,[rip+0xffffffffffd2abf0]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xcad1f5` | `cad1f5:	48 8d 05 e4 ab d2 ff 	lea    rax,[rip+0xffffffffffd2abe4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xcb18bc` | `cb18bc:	48 8d 0d 1d 65 d2 ff 	lea    rcx,[rip+0xffffffffffd2651d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xcb18c8` | `cb18c8:	48 8d 15 11 65 d2 ff 	lea    rdx,[rip+0xffffffffffd26511]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xcb54cc` | `cb54cc:	48 8d 05 0d 29 d2 ff 	lea    rax,[rip+0xffffffffffd2290d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xd1a32e` | `d1a32e:	48 8d 05 ab da cb ff 	lea    rax,[rip+0xffffffffffcbdaab]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xd512dd` | `d512dd:	48 8d 05 fc 6a c8 ff 	lea    rax,[rip+0xffffffffffc86afc]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xd512e8` | `d512e8:	48 8d 05 f1 6a c8 ff 	lea    rax,[rip+0xffffffffffc86af1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xdb5642` | `db5642:	e8 29 0e d2 ff       	call   ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0xdb7925` | `db7925:	e8 46 eb d1 ff       	call   ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0xdc3596` | `dc3596:	48 8d 35 43 48 c1 ff 	lea    rsi,[rip+0xffffffffffc14843]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xde80b7` | `de80b7:	48 8d 3d 22 fd be ff 	lea    rdi,[rip+0xffffffffffbefd22]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xdebe6b` | `debe6b:	48 8d 05 6e bf be ff 	lea    rax,[rip+0xffffffffffbebf6e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xdf3c07` | `df3c07:	48 8d 05 d2 41 be ff 	lea    rax,[rip+0xffffffffffbe41d2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xdf47e4` | `df47e4:	48 8d 05 f5 35 be ff 	lea    rax,[rip+0xffffffffffbe35f5]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xdf4a8a` | `df4a8a:	48 8d 05 4f 33 be ff 	lea    rax,[rip+0xffffffffffbe334f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xdf4d0a` | `df4d0a:	48 8d 05 cf 30 be ff 	lea    rax,[rip+0xffffffffffbe30cf]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe19dfc` | `e19dfc:	48 8d 05 dd df bb ff 	lea    rax,[rip+0xffffffffffbbdfdd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe1a95f` | `e1a95f:	48 8d 05 7a d4 bb ff 	lea    rax,[rip+0xffffffffffbbd47a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe1abea` | `e1abea:	48 8d 05 ef d1 bb ff 	lea    rax,[rip+0xffffffffffbbd1ef]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe239e4` | `e239e4:	48 8d 05 f5 43 bb ff 	lea    rax,[rip+0xffffffffffbb43f5]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe69447` | `e69447:	48 8d 05 92 e9 b6 ff 	lea    rax,[rip+0xffffffffffb6e992]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe69452` | `e69452:	48 8d 05 87 e9 b6 ff 	lea    rax,[rip+0xffffffffffb6e987]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe74165` | `e74165:	48 8d 05 74 3c b6 ff 	lea    rax,[rip+0xffffffffffb63c74]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe74170` | `e74170:	48 8d 05 69 3c b6 ff 	lea    rax,[rip+0xffffffffffb63c69]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe7430c` | `e7430c:	48 8d 05 cd 3a b6 ff 	lea    rax,[rip+0xffffffffffb63acd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe74317` | `e74317:	48 8d 05 c2 3a b6 ff 	lea    rax,[rip+0xffffffffffb63ac2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe7445c` | `e7445c:	48 8d 05 7d 39 b6 ff 	lea    rax,[rip+0xffffffffffb6397d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe80062` | `e80062:	48 8d 15 07 64 c5 ff 	lea    rdx,[rip+0xffffffffffc56407]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0xe857e8` | `e857e8:	48 8d 05 f1 25 b5 ff 	lea    rax,[rip+0xffffffffffb525f1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe8f7c6` | `e8f7c6:	48 8d 05 13 86 b4 ff 	lea    rax,[rip+0xffffffffffb48613]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xe9207e` | `e9207e:	48 8d 05 5b f9 99 00 	lea    rax,[rip+0x99f95b]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>` |
| `0xe9929a` | `e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0` |
| `0xe992a2` | `e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>` |
| `0xe992b6` | `e992b6:	53                   	push   rbx` |
| `0xe992ba` | `e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>` |
| `0xe992c8` | `e992c8:	41 56                	push   r14` |
| `0xe99303` | `e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>` |
| `0xe99368` | `e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0xe9936c` | `e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>` |
| `0xe99382` | `e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xe9939c` | `e9939c:	53                   	push   rbx` |
| `0xe993ae` | `e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]` |
| `0xea6568` | `ea6568:	48 8d 05 f1 b3 98 00 	lea    rax,[rip+0x98b3f1]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>` |
| `0xea657c` | `ea657c:	53                   	push   rbx` |
| `0xea662e` | `ea662e:	53                   	push   rbx` |
| `0xeaaf5c` | `eaaf5c:	53                   	push   rbx` |
| `0xeaaf6e` | `eaaf6e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xeabb76` | `eabb76:	41 57                	push   r15` |
| `0xeabc4e` | `eabc4e:	53                   	push   rbx` |
| `0xead1cf` | `ead1cf:	48 8d 05 0a ac b2 ff 	lea    rax,[rip+0xffffffffffb2ac0a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xeb429e` | `eb429e:	48 8d 05 3b 3b b2 ff 	lea    rax,[rip+0xffffffffffb23b3b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xeb4347` | `eb4347:	48 8d 05 92 3a b2 ff 	lea    rax,[rip+0xffffffffffb23a92]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xebf8ca` | `ebf8ca:	48 8d 05 0f 85 b1 ff 	lea    rax,[rip+0xffffffffffb1850f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xec06bd` | `ec06bd:	48 8d 05 1c 77 b1 ff 	lea    rax,[rip+0xffffffffffb1771c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xec484f` | `ec484f:	48 8d 05 8a 35 b1 ff 	lea    rax,[rip+0xffffffffffb1358a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xef78c1` | `ef78c1:	48 8d 05 18 05 ae ff 	lea    rax,[rip+0xffffffffffae0518]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xef7fb4` | `ef7fb4:	48 8d 05 25 fe ad ff 	lea    rax,[rip+0xffffffffffadfe25]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xf1bf65` | `f1bf65:	48 8d 0d 74 be ab ff 	lea    rcx,[rip+0xffffffffffabbe74]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xf1c200` | `f1c200:	48 8d 0d d9 bb ab ff 	lea    rcx,[rip+0xffffffffffabbbd9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xf1c3d1` | `f1c3d1:	48 8d 0d 08 ba ab ff 	lea    rcx,[rip+0xffffffffffabba08]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xfe018e` | `fe018e:	48 8d 05 4b 7c 9f ff 	lea    rax,[rip+0xffffffffff9f7c4b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xfe241e` | `fe241e:	48 8d 0d bb 59 9f ff 	lea    rcx,[rip+0xffffffffff9f59bb]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xfe2a86` | `fe2a86:	48 8d 0d 53 53 9f ff 	lea    rcx,[rip+0xffffffffff9f5353]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xfe2a90` | `fe2a90:	48 8d 0d 49 53 9f ff 	lea    rcx,[rip+0xffffffffff9f5349]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0xfe7d31` | `fe7d31:	48 8d 0d a8 00 9f ff 	lea    rcx,[rip+0xffffffffff9f00a8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10005f6` | `10005f6:	48 8d 05 e3 77 9d ff 	lea    rax,[rip+0xffffffffff9d77e3]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x100f91c` | `100f91c:	48 8d 0d bd 84 9c ff 	lea    rcx,[rip+0xffffffffff9c84bd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1013574` | `1013574:	48 8d 0d 65 48 9c ff 	lea    rcx,[rip+0xffffffffff9c4865]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x101ee03` | `101ee03:	48 8d 05 d6 8f 9b ff 	lea    rax,[rip+0xffffffffff9b8fd6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1021a0d` | `1021a0d:	48 8d 0d cc 63 9b ff 	lea    rcx,[rip+0xffffffffff9b63cc]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1033321` | `1033321:	48 8d 0d b8 4a 9a ff 	lea    rcx,[rip+0xffffffffff9a4ab8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1045bad` | `1045bad:	48 8d 05 2c 22 99 ff 	lea    rax,[rip+0xffffffffff99222c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10624c6` | `10624c6:	48 8d 05 13 59 97 ff 	lea    rax,[rip+0xffffffffff975913]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x106dfb0` | `106dfb0:	48 8d 05 29 9e 96 ff 	lea    rax,[rip+0xffffffffff969e29]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1070ea9` | `1070ea9:	48 8d 05 30 6f 96 ff 	lea    rax,[rip+0xffffffffff966f30]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1075464` | `1075464:	4c 8d 3d 75 29 96 ff 	lea    r15,[rip+0xffffffffff962975]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1077765` | `1077765:	48 8d 15 04 ed a5 ff 	lea    rdx,[rip+0xffffffffffa5ed04]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x1077837` | `1077837:	48 8d 15 32 ec a5 ff 	lea    rdx,[rip+0xffffffffffa5ec32]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x1077909` | `1077909:	48 8d 15 60 eb a5 ff 	lea    rdx,[rip+0xffffffffffa5eb60]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x1081458` | `1081458:	48 8d 05 81 69 95 ff 	lea    rax,[rip+0xffffffffff956981]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10816f2` | `10816f2:	48 8d 05 e7 66 95 ff 	lea    rax,[rip+0xffffffffff9566e7]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1081a14` | `1081a14:	48 8d 05 c5 63 95 ff 	lea    rax,[rip+0xffffffffff9563c5]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1081c89` | `1081c89:	48 8d 05 50 61 95 ff 	lea    rax,[rip+0xffffffffff956150]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10886bb` | `10886bb:	48 8d 05 1e f7 94 ff 	lea    rax,[rip+0xffffffffff94f71e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1091dc1` | `1091dc1:	48 8d 05 18 60 94 ff 	lea    rax,[rip+0xffffffffff946018]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1091f44` | `1091f44:	48 8d 05 95 5e 94 ff 	lea    rax,[rip+0xffffffffff945e95]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1099f4b` | `1099f4b:	48 8d 15 1e c5 a3 ff 	lea    rdx,[rip+0xffffffffffa3c51e]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x10a2452` | `10a2452:	48 8d 05 87 59 93 ff 	lea    rax,[rip+0xffffffffff935987]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10a245e` | `10a245e:	48 8d 05 7b 59 93 ff 	lea    rax,[rip+0xffffffffff93597b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10ac730` | `10ac730:	48 8d 15 a9 b6 92 ff 	lea    rdx,[rip+0xffffffffff92b6a9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10ac9bd` | `10ac9bd:	48 8d 05 1c b4 92 ff 	lea    rax,[rip+0xffffffffff92b41c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c1a5a` | `10c1a5a:	48 8d 05 7f 63 91 ff 	lea    rax,[rip+0xffffffffff91637f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c1aba` | `10c1aba:	48 8d 05 1f 63 91 ff 	lea    rax,[rip+0xffffffffff91631f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c1c38` | `10c1c38:	48 8d 05 a1 61 91 ff 	lea    rax,[rip+0xffffffffff9161a1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c1f48` | `10c1f48:	48 8d 05 91 5e 91 ff 	lea    rax,[rip+0xffffffffff915e91]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c1fb9` | `10c1fb9:	48 8d 05 20 5e 91 ff 	lea    rax,[rip+0xffffffffff915e20]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c202a` | `10c202a:	48 8d 05 af 5d 91 ff 	lea    rax,[rip+0xffffffffff915daf]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c401e` | `10c401e:	48 8d 05 bb 3d 91 ff 	lea    rax,[rip+0xffffffffff913dbb]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c4a55` | `10c4a55:	48 8d 05 84 33 91 ff 	lea    rax,[rip+0xffffffffff913384]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c5196` | `10c5196:	48 8d 05 43 2c 91 ff 	lea    rax,[rip+0xffffffffff912c43]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c5d6f` | `10c5d6f:	48 8d 05 6a 20 91 ff 	lea    rax,[rip+0xffffffffff91206a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c6265` | `10c6265:	48 8d 05 74 1b 91 ff 	lea    rax,[rip+0xffffffffff911b74]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c6ad1` | `10c6ad1:	48 8d 05 08 13 91 ff 	lea    rax,[rip+0xffffffffff911308]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c747e` | `10c747e:	48 8d 05 5b 09 91 ff 	lea    rax,[rip+0xffffffffff91095b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c81c2` | `10c81c2:	48 8d 05 17 fc 90 ff 	lea    rax,[rip+0xffffffffff90fc17]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c8895` | `10c8895:	48 8d 05 44 f5 90 ff 	lea    rax,[rip+0xffffffffff90f544]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c8fbc` | `10c8fbc:	48 8d 05 1d ee 90 ff 	lea    rax,[rip+0xffffffffff90ee1d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10c964e` | `10c964e:	48 8d 05 8b e7 90 ff 	lea    rax,[rip+0xffffffffff90e78b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10ca1b4` | `10ca1b4:	48 8d 05 25 dc 90 ff 	lea    rax,[rip+0xffffffffff90dc25]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10d3228` | `10d3228:	48 8d 05 b1 4b 90 ff 	lea    rax,[rip+0xffffffffff904bb1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10d32f3` | `10d32f3:	48 8d 0d e6 4a 90 ff 	lea    rcx,[rip+0xffffffffff904ae6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10d3cfa` | `10d3cfa:	48 8d 05 df 40 90 ff 	lea    rax,[rip+0xffffffffff9040df]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10d3e4a` | `10d3e4a:	48 8d 05 8f 3f 90 ff 	lea    rax,[rip+0xffffffffff903f8f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10db8b3` | `10db8b3:	48 8d 35 26 c5 8f ff 	lea    rsi,[rip+0xffffffffff8fc526]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10db8be` | `10db8be:	48 8d 35 1b c5 8f ff 	lea    rsi,[rip+0xffffffffff8fc51b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10e12eb` | `10e12eb:	48 8d 35 ee 6a 8f ff 	lea    rsi,[rip+0xffffffffff8f6aee]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10e12f6` | `10e12f6:	48 8d 35 e3 6a 8f ff 	lea    rsi,[rip+0xffffffffff8f6ae3]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10e20a6` | `10e20a6:	48 8d 35 33 5d 8f ff 	lea    rsi,[rip+0xffffffffff8f5d33]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10e20b1` | `10e20b1:	48 8d 35 28 5d 8f ff 	lea    rsi,[rip+0xffffffffff8f5d28]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10ef3cb` | `10ef3cb:	48 8d 05 0e 8a 8e ff 	lea    rax,[rip+0xffffffffff8e8a0e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10ef3d6` | `10ef3d6:	48 8d 05 03 8a 8e ff 	lea    rax,[rip+0xffffffffff8e8a03]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10efcf7` | `10efcf7:	48 8d 05 e2 80 8e ff 	lea    rax,[rip+0xffffffffff8e80e2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10efd02` | `10efd02:	48 8d 05 d7 80 8e ff 	lea    rax,[rip+0xffffffffff8e80d7]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x10fa7db` | `10fa7db:	48 8d 05 fe d5 8d ff 	lea    rax,[rip+0xffffffffff8dd5fe]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x111b3ab` | `111b3ab:	48 8d 15 be b0 9b ff 	lea    rdx,[rip+0xffffffffff9bb0be]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x111bd69` | `111bd69:	48 8d 05 70 c0 8b ff 	lea    rax,[rip+0xffffffffff8bc070]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x111cc94` | `111cc94:	48 8d 05 45 b1 8b ff 	lea    rax,[rip+0xffffffffff8bb145]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1125da0` | `1125da0:	48 8d 05 39 20 8b ff 	lea    rax,[rip+0xffffffffff8b2039]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1125dab` | `1125dab:	48 8d 05 2e 20 8b ff 	lea    rax,[rip+0xffffffffff8b202e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x113c288` | `113c288:	48 8d 05 51 bb 89 ff 	lea    rax,[rip+0xffffffffff89bb51]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x113c4dc` | `113c4dc:	48 8d 05 fd b8 89 ff 	lea    rax,[rip+0xffffffffff89b8fd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1142c71` | `1142c71:	48 8d 05 68 51 89 ff 	lea    rax,[rip+0xffffffffff895168]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1150663` | `1150663:	48 8d 05 76 77 88 ff 	lea    rax,[rip+0xffffffffff887776]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1153f99` | `1153f99:	48 8d 05 40 3e 88 ff 	lea    rax,[rip+0xffffffffff883e40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1157c36` | `1157c36:	48 8d 05 a3 01 88 ff 	lea    rax,[rip+0xffffffffff8801a3]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1157d26` | `1157d26:	48 8d 05 b3 00 88 ff 	lea    rax,[rip+0xffffffffff8800b3]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1158546` | `1158546:	48 8d 05 93 f8 87 ff 	lea    rax,[rip+0xffffffffff87f893]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1174317` | `1174317:	48 8d 05 c2 3a 86 ff 	lea    rax,[rip+0xffffffffff863ac2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11764d9` | `11764d9:	48 8d 15 00 19 86 ff 	lea    rdx,[rip+0xffffffffff861900]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11764e4` | `11764e4:	48 8d 15 f5 18 86 ff 	lea    rdx,[rip+0xffffffffff8618f5]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x117b411` | `117b411:	48 8d 15 58 b0 95 ff 	lea    rdx,[rip+0xffffffffff95b058]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x117b4b9` | `117b4b9:	48 8d 15 b0 af 95 ff 	lea    rdx,[rip+0xffffffffff95afb0]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x119cb89` | `119cb89:	48 8d 05 50 b2 83 ff 	lea    rax,[rip+0xffffffffff83b250]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11a290b` | `11a290b:	48 8d 05 ce 54 83 ff 	lea    rax,[rip+0xffffffffff8354ce]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11a29fe` | `11a29fe:	48 8d 05 db 53 83 ff 	lea    rax,[rip+0xffffffffff8353db]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11a4d3c` | `11a4d3c:	48 8d 05 9d 30 83 ff 	lea    rax,[rip+0xffffffffff83309d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11a5381` | `11a5381:	48 8d 05 58 2a 83 ff 	lea    rax,[rip+0xffffffffff832a58]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11a7e00` | `11a7e00:	48 8d 05 d9 ff 82 ff 	lea    rax,[rip+0xffffffffff82ffd9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11bf19f` | `11bf19f:	48 8d 05 3a 8c 81 ff 	lea    rax,[rip+0xffffffffff818c3a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11c7212` | `11c7212:	48 8d 0d c7 0b 81 ff 	lea    rcx,[rip+0xffffffffff810bc7]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11c884d` | `11c884d:	48 8d 2d 1c 7b 88 ff 	lea    rbp,[rip+0xffffffffff887b1c]        # a50370 <_ZdaPv@@Base>` |
| `0x11c940b` | `11c940b:	48 8d 05 ce e9 80 ff 	lea    rax,[rip+0xffffffffff80e9ce]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11ca767` | `11ca767:	48 8d 05 72 d6 80 ff 	lea    rax,[rip+0xffffffffff80d672]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11caa97` | `11caa97:	48 8d 05 42 d3 80 ff 	lea    rax,[rip+0xffffffffff80d342]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11caaa5` | `11caaa5:	48 8d 05 34 d3 80 ff 	lea    rax,[rip+0xffffffffff80d334]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11cad17` | `11cad17:	48 8d 05 c2 d0 80 ff 	lea    rax,[rip+0xffffffffff80d0c2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11cad25` | `11cad25:	48 8d 05 b4 d0 80 ff 	lea    rax,[rip+0xffffffffff80d0b4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11dbb18` | `11dbb18:	48 8d 05 c1 c2 7f ff 	lea    rax,[rip+0xffffffffff7fc2c1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11dbb37` | `11dbb37:	48 8d 05 a2 c2 7f ff 	lea    rax,[rip+0xffffffffff7fc2a2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11dffee` | `11dffee:	48 8d 05 eb 7d 7f ff 	lea    rax,[rip+0xffffffffff7f7deb]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11dfff9` | `11dfff9:	48 8d 05 e0 7d 7f ff 	lea    rax,[rip+0xffffffffff7f7de0]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11e000c` | `11e000c:	48 8d 05 cd 7d 7f ff 	lea    rax,[rip+0xffffffffff7f7dcd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11e001a` | `11e001a:	48 8d 05 bf 7d 7f ff 	lea    rax,[rip+0xffffffffff7f7dbf]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11e0030` | `11e0030:	48 8d 05 a9 7d 7f ff 	lea    rax,[rip+0xffffffffff7f7da9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11e003e` | `11e003e:	48 8d 05 9b 7d 7f ff 	lea    rax,[rip+0xffffffffff7f7d9b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11e0054` | `11e0054:	48 8d 05 85 7d 7f ff 	lea    rax,[rip+0xffffffffff7f7d85]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11e0062` | `11e0062:	48 8d 05 77 7d 7f ff 	lea    rax,[rip+0xffffffffff7f7d77]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11ef391` | `11ef391:	48 8d 05 48 8a 7e ff 	lea    rax,[rip+0xffffffffff7e8a48]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11ef3ef` | `11ef3ef:	48 8d 05 ea 89 7e ff 	lea    rax,[rip+0xffffffffff7e89ea]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11ef473` | `11ef473:	48 8d 05 66 89 7e ff 	lea    rax,[rip+0xffffffffff7e8966]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11f0202` | `11f0202:	48 8d 05 d7 7b 7e ff 	lea    rax,[rip+0xffffffffff7e7bd7]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11f0c39` | `11f0c39:	48 8d 0d a0 71 7e ff 	lea    rcx,[rip+0xffffffffff7e71a0]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11f0c58` | `11f0c58:	48 8d 0d 81 71 7e ff 	lea    rcx,[rip+0xffffffffff7e7181]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11f0c7f` | `11f0c7f:	48 8d 0d 5a 71 7e ff 	lea    rcx,[rip+0xffffffffff7e715a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11f354f` | `11f354f:	48 8d 05 8a 48 7e ff 	lea    rax,[rip+0xffffffffff7e488a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11f4099` | `11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x11f45c5` | `11f45c5:	48 8d 05 14 38 7e ff 	lea    rax,[rip+0xffffffffff7e3814]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1200414` | `1200414:	48 8d 05 c5 79 7d ff 	lea    rax,[rip+0xffffffffff7d79c5]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x120041f` | `120041f:	48 8d 05 ba 79 7d ff 	lea    rax,[rip+0xffffffffff7d79ba]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12039bb` | `12039bb:	48 8d 05 1e 44 7d ff 	lea    rax,[rip+0xffffffffff7d441e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12039c6` | `12039c6:	48 8d 05 13 44 7d ff 	lea    rax,[rip+0xffffffffff7d4413]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12080a8` | `12080a8:	48 8d 05 31 fd 7c ff 	lea    rax,[rip+0xffffffffff7cfd31]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1208360` | `1208360:	48 8d 05 79 fa 7c ff 	lea    rax,[rip+0xffffffffff7cfa79]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12084b9` | `12084b9:	48 8d 05 20 f9 7c ff 	lea    rax,[rip+0xffffffffff7cf920]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12141eb` | `12141eb:	48 8d 05 ee 3b 7c ff 	lea    rax,[rip+0xffffffffff7c3bee]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1296d24` | `1296d24:	48 8d 05 b5 10 74 ff 	lea    rax,[rip+0xffffffffff7410b5]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1297c13` | `1297c13:	48 8d 05 c6 01 74 ff 	lea    rax,[rip+0xffffffffff7401c6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x129d2ce` | `129d2ce:	48 8d 05 0b ab 73 ff 	lea    rax,[rip+0xffffffffff73ab0b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x129d2d9` | `129d2d9:	48 8d 05 00 ab 73 ff 	lea    rax,[rip+0xffffffffff73ab00]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x129d2f1` | `129d2f1:	48 8d 05 e8 aa 73 ff 	lea    rax,[rip+0xffffffffff73aae8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x129d2fd` | `129d2fd:	48 8d 05 dc aa 73 ff 	lea    rax,[rip+0xffffffffff73aadc]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x129fd7b` | `129fd7b:	48 8d 05 5e 80 73 ff 	lea    rax,[rip+0xffffffffff73805e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12a2225` | `12a2225:	48 8d 05 b4 5b 73 ff 	lea    rax,[rip+0xffffffffff735bb4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12a3838` | `12a3838:	48 8d 05 a1 45 73 ff 	lea    rax,[rip+0xffffffffff7345a1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12aa2c5` | `12aa2c5:	48 8d 05 14 db 72 ff 	lea    rax,[rip+0xffffffffff72db14]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12aa2d0` | `12aa2d0:	48 8d 05 09 db 72 ff 	lea    rax,[rip+0xffffffffff72db09]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12aef94` | `12aef94:	48 8d 05 d5 74 82 ff 	lea    rax,[rip+0xffffffffff8274d5]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x12af05d` | `12af05d:	48 8d 05 7c 8d 72 ff 	lea    rax,[rip+0xffffffffff728d7c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12af6a0` | `12af6a0:	48 8d 05 c9 6d 82 ff 	lea    rax,[rip+0xffffffffff826dc9]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x12bbb41` | `12bbb41:	48 8d 0d 98 c2 71 ff 	lea    rcx,[rip+0xffffffffff71c298]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x12c6c72` | `12c6c72:	48 8d 05 67 11 71 ff 	lea    rax,[rip+0xffffffffff711167]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1309b10` | `1309b10:	48 8d 05 c9 e2 6c ff 	lea    rax,[rip+0xffffffffff6ce2c9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1309ee3` | `1309ee3:	48 8d 05 f6 de 6c ff 	lea    rax,[rip+0xffffffffff6cdef6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x130a0a3` | `130a0a3:	48 8d 05 36 dd 6c ff 	lea    rax,[rip+0xffffffffff6cdd36]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13281c1` | `13281c1:	48 8d 05 18 fc 6a ff 	lea    rax,[rip+0xffffffffff6afc18]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x132ddae` | `132ddae:	48 8d 05 2b a0 6a ff 	lea    rax,[rip+0xffffffffff6aa02b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x134ef37` | `134ef37:	48 8d 05 a2 8e 68 ff 	lea    rax,[rip+0xffffffffff688ea2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x134f177` | `134f177:	48 8d 0d 62 8c 68 ff 	lea    rcx,[rip+0xffffffffff688c62]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13676bc` | `13676bc:	48 8d 05 1d 07 67 ff 	lea    rax,[rip+0xffffffffff67071d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13676c7` | `13676c7:	48 8d 05 12 07 67 ff 	lea    rax,[rip+0xffffffffff670712]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13676db` | `13676db:	48 8d 0d fe 06 67 ff 	lea    rcx,[rip+0xffffffffff6706fe]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13676e6` | `13676e6:	48 8d 0d f3 06 67 ff 	lea    rcx,[rip+0xffffffffff6706f3]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1367bd4` | `1367bd4:	48 8d 05 05 02 67 ff 	lea    rax,[rip+0xffffffffff670205]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1367bdf` | `1367bdf:	48 8d 05 fa 01 67 ff 	lea    rax,[rip+0xffffffffff6701fa]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1367bf3` | `1367bf3:	48 8d 0d e6 01 67 ff 	lea    rcx,[rip+0xffffffffff6701e6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1367bfe` | `1367bfe:	48 8d 0d db 01 67 ff 	lea    rcx,[rip+0xffffffffff6701db]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1367c85` | `1367c85:	48 8d 05 54 01 67 ff 	lea    rax,[rip+0xffffffffff670154]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1370a36` | `1370a36:	48 8d 05 a3 73 66 ff 	lea    rax,[rip+0xffffffffff6673a3]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1370a41` | `1370a41:	48 8d 05 98 73 66 ff 	lea    rax,[rip+0xffffffffff667398]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1370a58` | `1370a58:	48 8d 0d 81 73 66 ff 	lea    rcx,[rip+0xffffffffff667381]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1370a63` | `1370a63:	48 8d 0d 76 73 66 ff 	lea    rcx,[rip+0xffffffffff667376]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137121a` | `137121a:	48 8d 05 bf 6b 66 ff 	lea    rax,[rip+0xffffffffff666bbf]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1371225` | `1371225:	48 8d 05 b4 6b 66 ff 	lea    rax,[rip+0xffffffffff666bb4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137123c` | `137123c:	48 8d 0d 9d 6b 66 ff 	lea    rcx,[rip+0xffffffffff666b9d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1371247` | `1371247:	48 8d 0d 92 6b 66 ff 	lea    rcx,[rip+0xffffffffff666b92]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137134a` | `137134a:	48 8d 05 8f 6a 66 ff 	lea    rax,[rip+0xffffffffff666a8f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1371355` | `1371355:	48 8d 05 84 6a 66 ff 	lea    rax,[rip+0xffffffffff666a84]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137534a` | `137534a:	48 8d 0d 8f 2a 66 ff 	lea    rcx,[rip+0xffffffffff662a8f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1375355` | `1375355:	48 8d 0d 84 2a 66 ff 	lea    rcx,[rip+0xffffffffff662a84]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1378f7e` | `1378f7e:	48 8d 05 5b ee 65 ff 	lea    rax,[rip+0xffffffffff65ee5b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1378f89` | `1378f89:	48 8d 05 50 ee 65 ff 	lea    rax,[rip+0xffffffffff65ee50]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1378f9d` | `1378f9d:	48 8d 0d 3c ee 65 ff 	lea    rcx,[rip+0xffffffffff65ee3c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1378fa8` | `1378fa8:	48 8d 0d 31 ee 65 ff 	lea    rcx,[rip+0xffffffffff65ee31]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137a99a` | `137a99a:	48 8d 0d 3f d4 65 ff 	lea    rcx,[rip+0xffffffffff65d43f]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137a9a5` | `137a9a5:	48 8d 0d 34 d4 65 ff 	lea    rcx,[rip+0xffffffffff65d434]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137ab4c` | `137ab4c:	48 8d 05 8d d2 65 ff 	lea    rax,[rip+0xffffffffff65d28d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137ab57` | `137ab57:	48 8d 05 82 d2 65 ff 	lea    rax,[rip+0xffffffffff65d282]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137ab6e` | `137ab6e:	48 8d 0d 6b d2 65 ff 	lea    rcx,[rip+0xffffffffff65d26b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137ab79` | `137ab79:	48 8d 0d 60 d2 65 ff 	lea    rcx,[rip+0xffffffffff65d260]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137c797` | `137c797:	48 8d 05 42 b6 65 ff 	lea    rax,[rip+0xffffffffff65b642]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137c7a2` | `137c7a2:	48 8d 05 37 b6 65 ff 	lea    rax,[rip+0xffffffffff65b637]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137c7b6` | `137c7b6:	48 8d 15 23 b6 65 ff 	lea    rdx,[rip+0xffffffffff65b623]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137c7c1` | `137c7c1:	48 8d 15 18 b6 65 ff 	lea    rdx,[rip+0xffffffffff65b618]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137cf11` | `137cf11:	48 8d 05 c8 ae 65 ff 	lea    rax,[rip+0xffffffffff65aec8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137cf1c` | `137cf1c:	48 8d 05 bd ae 65 ff 	lea    rax,[rip+0xffffffffff65aebd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137cf33` | `137cf33:	48 8d 0d a6 ae 65 ff 	lea    rcx,[rip+0xffffffffff65aea6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137cf3e` | `137cf3e:	48 8d 0d 9b ae 65 ff 	lea    rcx,[rip+0xffffffffff65ae9b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137e8a7` | `137e8a7:	48 8d 05 32 95 65 ff 	lea    rax,[rip+0xffffffffff659532]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137e8b2` | `137e8b2:	48 8d 05 27 95 65 ff 	lea    rax,[rip+0xffffffffff659527]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137e8c9` | `137e8c9:	48 8d 0d 10 95 65 ff 	lea    rcx,[rip+0xffffffffff659510]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137e8d4` | `137e8d4:	48 8d 0d 05 95 65 ff 	lea    rcx,[rip+0xffffffffff659505]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137f778` | `137f778:	48 8d 0d 61 86 65 ff 	lea    rcx,[rip+0xffffffffff658661]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137f783` | `137f783:	48 8d 0d 56 86 65 ff 	lea    rcx,[rip+0xffffffffff658656]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137f801` | `137f801:	48 8d 05 d8 85 65 ff 	lea    rax,[rip+0xffffffffff6585d8]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137f80c` | `137f80c:	48 8d 05 cd 85 65 ff 	lea    rax,[rip+0xffffffffff6585cd]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137f823` | `137f823:	48 8d 0d b6 85 65 ff 	lea    rcx,[rip+0xffffffffff6585b6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x137f82e` | `137f82e:	48 8d 0d ab 85 65 ff 	lea    rcx,[rip+0xffffffffff6585ab]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13800f0` | `13800f0:	48 8d 0d e9 7c 65 ff 	lea    rcx,[rip+0xffffffffff657ce9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13800fb` | `13800fb:	48 8d 0d de 7c 65 ff 	lea    rcx,[rip+0xffffffffff657cde]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1385d2a` | `1385d2a:	48 8d 05 af 20 65 ff 	lea    rax,[rip+0xffffffffff6520af]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x139673d` | `139673d:	48 8d 05 9c 16 64 ff 	lea    rax,[rip+0xffffffffff64169c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1396748` | `1396748:	48 8d 05 91 16 64 ff 	lea    rax,[rip+0xffffffffff641691]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x139675c` | `139675c:	48 8d 0d 7d 16 64 ff 	lea    rcx,[rip+0xffffffffff64167d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1396767` | `1396767:	48 8d 0d 72 16 64 ff 	lea    rcx,[rip+0xffffffffff641672]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13b98e8` | `13b98e8:	48 8d 15 81 cb 71 ff 	lea    rdx,[rip+0xffffffffff71cb81]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x13d66c0` | `13d66c0:	48 8d 05 19 17 60 ff 	lea    rax,[rip+0xffffffffff601719]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13d66cb` | `13d66cb:	48 8d 05 0e 17 60 ff 	lea    rax,[rip+0xffffffffff60170e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13d6748` | `13d6748:	48 8d 0d 91 16 60 ff 	lea    rcx,[rip+0xffffffffff601691]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13d6ffe` | `13d6ffe:	48 8d 05 db 0d 60 ff 	lea    rax,[rip+0xffffffffff600ddb]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13d7009` | `13d7009:	48 8d 05 d0 0d 60 ff 	lea    rax,[rip+0xffffffffff600dd0]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13d7086` | `13d7086:	48 8d 0d 53 0d 60 ff 	lea    rcx,[rip+0xffffffffff600d53]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13dd735` | `13dd735:	48 8d 05 a4 a6 5f ff 	lea    rax,[rip+0xffffffffff5fa6a4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x13eb525` | `13eb525:	48 8d 05 b4 c8 5e ff 	lea    rax,[rip+0xffffffffff5ec8b4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x144fe80` | `144fe80:	48 8d 05 59 7f 58 ff 	lea    rax,[rip+0xffffffffff587f59]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1472094` | `1472094:	48 8d 05 45 5d 56 ff 	lea    rax,[rip+0xffffffffff565d45]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x147210d` | `147210d:	48 8d 05 cc 5c 56 ff 	lea    rax,[rip+0xffffffffff565ccc]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14737bc` | `14737bc:	48 8d 05 1d 46 56 ff 	lea    rax,[rip+0xffffffffff56461d]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1473825` | `1473825:	48 8d 05 b4 45 56 ff 	lea    rax,[rip+0xffffffffff5645b4]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14758a3` | `14758a3:	48 8d 0d 36 25 56 ff 	lea    rcx,[rip+0xffffffffff562536]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14be5d9` | `14be5d9:	48 8d 0d 00 98 51 ff 	lea    rcx,[rip+0xffffffffff519800]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14e9468` | `14e9468:	48 8d 15 01 d0 5e ff 	lea    rdx,[rip+0xffffffffff5ed001]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x14ea303` | `14ea303:	48 8d 05 d6 da 4e ff 	lea    rax,[rip+0xffffffffff4edad6]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14ea30e` | `14ea30e:	48 8d 05 cb da 4e ff 	lea    rax,[rip+0xffffffffff4edacb]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14ea327` | `14ea327:	48 8d 05 b2 da 4e ff 	lea    rax,[rip+0xffffffffff4edab2]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14ea332` | `14ea332:	48 8d 05 a7 da 4e ff 	lea    rax,[rip+0xffffffffff4edaa7]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14ea34b` | `14ea34b:	48 8d 05 8e da 4e ff 	lea    rax,[rip+0xffffffffff4eda8e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14ea359` | `14ea359:	48 8d 05 80 da 4e ff 	lea    rax,[rip+0xffffffffff4eda80]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14ea36f` | `14ea36f:	48 8d 05 6a da 4e ff 	lea    rax,[rip+0xffffffffff4eda6a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x14ea37d` | `14ea37d:	48 8d 05 5c da 4e ff 	lea    rax,[rip+0xffffffffff4eda5c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1537d2e` | `1537d2e:	48 8d 05 ab 00 4a ff 	lea    rax,[rip+0xffffffffff4a00ab]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x15b8b91` | `15b8b91:	48 8d 0d 48 f2 41 ff 	lea    rcx,[rip+0xffffffffff41f248]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x15e0799` | `15e0799:	48 8d 3d d0 5c 4f ff 	lea    rdi,[rip+0xffffffffff4f5cd0]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>` |
| `0x15e174d` | `15e174d:	48 8d 05 8c 66 3f ff 	lea    rax,[rip+0xffffffffff3f668c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x15e1758` | `15e1758:	48 8d 05 81 66 3f ff 	lea    rax,[rip+0xffffffffff3f6681]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x160bad8` | `160bad8:	48 8d 35 89 02 28 00 	lea    rsi,[rip+0x280289]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>` |
| `0x160c11c` | `160c11c:	48 8d 05 45 fc 27 00 	lea    rax,[rip+0x27fc45]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>` |
| `0x160c134` | `160c134:	e8 e3 ff ff ff       	call   160c11c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x728a>` |
| `0x160c142` | `160c142:	41 56                	push   r14` |
| `0x160c17d` | `160c17d:	48 8d 05 e4 fb 27 00 	lea    rax,[rip+0x27fbe4]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>` |
| `0x160c1e6` | `160c1e6:	48 8d 0d 7b fb 27 00 	lea    rcx,[rip+0x27fb7b]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>` |
| `0x164eb2d` | `164eb2d:	48 8d 05 ac 92 38 ff 	lea    rax,[rip+0xffffffffff3892ac]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x164eb38` | `164eb38:	48 8d 05 a1 92 38 ff 	lea    rax,[rip+0xffffffffff3892a1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x16cf1a3` | `16cf1a3:	48 8d 05 36 8c 30 ff 	lea    rax,[rip+0xffffffffff308c36]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x16cf1ae` | `16cf1ae:	48 8d 05 2b 8c 30 ff 	lea    rax,[rip+0xffffffffff308c2b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x16d84e8` | `16d84e8:	48 8d 05 f1 f8 2f ff 	lea    rax,[rip+0xffffffffff2ff8f1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1738c79` | `1738c79:	e8 f2 76 31 ff       	call   a50370 <_ZdaPv@@Base>` |
| `0x174855b` | `174855b:	e8 10 7e 30 ff       	call   a50370 <_ZdaPv@@Base>` |
| `0x178c13a` | `178c13a:	e9 a1 bc 24 ff       	jmp    9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x178e302` | `178e302:	e8 d9 9a 24 ff       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
| `0x1790d3b` | `1790d3b:	e8 a0 70 24 ff       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>` |
