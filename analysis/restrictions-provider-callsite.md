# Restrictions provider callsite trace

Known target identity: descriptor AP `0x184ca50`, ID `0x9e`, name `RestrictionsSetupImpl`, factory `0x10ab7ae`.
Provider-vector caller FDE: `0x14cdc2a..0x14d4d4c`. The provider factory ABI is `rdi=sret`, `rsi=descriptor`, `rdx=shared setup bundle`, `rcx=registry context`.

## Summary
- Provider-like `+0x28` calls in ranked FDE: 8
- This report is intentionally concise; older huge report was replaced because it was not connector-readable.

## Restrictions descriptor/factory xrefs
- `b60b43:	48 8d 0d 06 bf ce 00 	lea    rcx,[rip+0xcebf06]        # 184ca50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9138>`
- `10ab7ae:	55                   	push   rbp`

## Provider +0x28 callsite table
| # | call | last `rsi` source | last `rdx` source | resolved `rdx` stack base | `bundle+0x30` writes before call |
|---:|---|---|---|---|---|
| 1 | `0x14cfd3d` | `14cfd37:	48 89 de             	mov    rsi,rbx` | `14cfd3a:	4c 89 f2             	mov    rdx,r14` | `rsp+0x2e0` |  |
| 2 | `0x14cfdb2` | `14cfdac:	48 89 de             	mov    rsi,rbx` | `14cfdaf:	4c 89 f2             	mov    rdx,r14` | `rsp+0x2e0` |  |
| 3 | `0x14d06ad` | `14d067c:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]` | `14d06aa:	4c 89 f2             	mov    rdx,r14` | `rsp+0x2e0` |  |
| 4 | `0x14d0cce` | `14d0cc8:	48 89 de             	mov    rsi,rbx` | `14d0ccb:	4c 89 f2             	mov    rdx,r14` | `rsp+0x2e0` |  |
| 5 | `0x14d0d6a` | `14d0d64:	4c 89 f6             	mov    rsi,r14` | `14d0d67:	48 89 da             	mov    rdx,rbx` | `rsp+0x2e0` |  |
| 6 | `0x14d1c49` | `14d1c22:	49 8b b5 a0 00 00 00 	mov    rsi,QWORD PTR [r13+0xa0]` | `14d1c46:	4c 89 f2             	mov    rdx,r14` | `rsp+0x2e0` |  |
| 7 | `0x14d1caf` | `14d1c7d:	49 8b b7 a0 00 00 00 	mov    rsi,QWORD PTR [r15+0xa0]` | `14d1ca1:	48 89 da             	mov    rdx,rbx` | `rsp+0x2e0` |  |
| 8 | `0x14d2a30` | `14d2a2a:	48 89 de             	mov    rsi,rbx` | `14d2a2d:	4c 89 f2             	mov    rdx,r14` | `rsp+0x2e0` |  |

## Expanded callsite contexts
### call #1 `0x14cfd3d`
- resolved rdx stack base: `rsp+0x2e0`
- rsi: `14cfd37:	48 89 de             	mov    rsi,rbx`
- rdx: `14cfd3a:	4c 89 f2             	mov    rdx,r14`

### call #2 `0x14cfdb2`
- resolved rdx stack base: `rsp+0x2e0`
- rsi: `14cfdac:	48 89 de             	mov    rsi,rbx`
- rdx: `14cfdaf:	4c 89 f2             	mov    rdx,r14`

### call #3 `0x14d06ad`
- resolved rdx stack base: `rsp+0x2e0`
- rsi: `14d067c:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]`
- rdx: `14d06aa:	4c 89 f2             	mov    rdx,r14`

### call #4 `0x14d0cce`
- resolved rdx stack base: `rsp+0x2e0`
- rsi: `14d0cc8:	48 89 de             	mov    rsi,rbx`
- rdx: `14d0ccb:	4c 89 f2             	mov    rdx,r14`

### call #5 `0x14d0d6a`
- resolved rdx stack base: `rsp+0x2e0`
- rsi: `14d0d64:	4c 89 f6             	mov    rsi,r14`
- rdx: `14d0d67:	48 89 da             	mov    rdx,rbx`

### call #6 `0x14d1c49`
- resolved rdx stack base: `rsp+0x2e0`
- rsi: `14d1c22:	49 8b b5 a0 00 00 00 	mov    rsi,QWORD PTR [r13+0xa0]`
- rdx: `14d1c46:	4c 89 f2             	mov    rdx,r14`

### call #7 `0x14d1caf`
- resolved rdx stack base: `rsp+0x2e0`
- rsi: `14d1c7d:	49 8b b7 a0 00 00 00 	mov    rsi,QWORD PTR [r15+0xa0]`
- rdx: `14d1ca1:	48 89 da             	mov    rdx,rbx`

### call #8 `0x14d2a30`
- resolved rdx stack base: `rsp+0x2e0`
- rsi: `14d2a2a:	48 89 de             	mov    rsi,rbx`
- rdx: `14d2a2d:	4c 89 f2             	mov    rdx,r14`

## Candidate descriptor vector slot references inside ranked FDE
### `[r13+0xa0]`
- `14d1c22:	49 8b b5 a0 00 00 00 	mov    rsi,QWORD PTR [r13+0xa0]`

### `[r15+0x18]`
- `14cf9dd:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0`
- `14cfd6e:	49 8b 5f 18          	mov    rbx,QWORD PTR [r15+0x18]`
- `14cff0b:	49 8d 6f 18          	lea    rbp,[r15+0x18]`
- `14cff16:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax`
- `14d0298:	49 89 6f 18          	mov    QWORD PTR [r15+0x18],rbp`
- `14d10b4:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax`
- `14d10ff:	4d 8d 67 18          	lea    r12,[r15+0x18]`
- `14d33d4:	49 8d 47 18          	lea    rax,[r15+0x18]`
- `14d33dc:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0`
- `14d4341:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]`

### `[r15+0x30]`
- `14ce511:	49 8b 7f 30          	mov    rdi,QWORD PTR [r15+0x30]`
- `14ce537:	4d 89 7f 30          	mov    QWORD PTR [r15+0x30],r15`
- `14cf00f:	49 8b 5f 30          	mov    rbx,QWORD PTR [r15+0x30]`
- `14cf39a:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]`
- `14cfa05:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax`
- `14d02ba:	49 89 5f 30          	mov    QWORD PTR [r15+0x30],rbx`
- `14d0607:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0`
- `14d06d9:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]`
- `14d10d2:	4d 89 77 30          	mov    QWORD PTR [r15+0x30],r14`
- `14d43cf:	49 8b 7f 30          	mov    rdi,QWORD PTR [r15+0x30]`
- `14d46ff:	49 8b 7f 30          	mov    rdi,QWORD PTR [r15+0x30]`

### `[r15+0x38]`
- `14ce450:	4d 8d 77 38          	lea    r14,[r15+0x38]`
- `14ce454:	f3 41 0f 7f 4f 38    	movdqu XMMWORD PTR [r15+0x38],xmm1`
- `14cfa1a:	41 0f 11 47 38       	movups XMMWORD PTR [r15+0x38],xmm0`
- `14cfcf9:	49 8b 5f 38          	mov    rbx,QWORD PTR [r15+0x38]`
- `14d00f7:	41 0f 11 57 38       	movups XMMWORD PTR [r15+0x38],xmm2`
- `14d02c7:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0`
- `14d0416:	49 8b 7f 38          	mov    rdi,QWORD PTR [r15+0x38]`
- `14d10de:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0`
- `14d4278:	49 8b 7f 38          	mov    rdi,QWORD PTR [r15+0x38]`

### `[r15+0x48]`
- `14ce45a:	f3 41 0f 7f 4f 48    	movdqu XMMWORD PTR [r15+0x48],xmm1`
- `14cf013:	4d 8b 77 48          	mov    r14,QWORD PTR [r15+0x48]`
- `14cf39e:	4d 8b 6f 48          	mov    r13,QWORD PTR [r15+0x48]`
- `14cfa3c:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0`
- `14cfc84:	49 8b 5f 48          	mov    rbx,QWORD PTR [r15+0x48]`
- `14d0115:	41 0f 11 57 48       	movups XMMWORD PTR [r15+0x48],xmm2`
- `14d02de:	49 8d 5f 48          	lea    rbx,[r15+0x48]`
- `14d10e4:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0`
- `14d426f:	49 8b 7f 48          	mov    rdi,QWORD PTR [r15+0x48]`

### `[r15+0x78]`
- `14cfa9c:	f3 41 0f 7f 47 78    	movdqu XMMWORD PTR [r15+0x78],xmm0`
- `14cfbfd:	4d 8b 77 78          	mov    r14,QWORD PTR [r15+0x78]`
- `14cfc6f:	49 8b 7f 78          	mov    rdi,QWORD PTR [r15+0x78]`
- `14d0150:	f3 41 0f 7f 4f 78    	movdqu XMMWORD PTR [r15+0x78],xmm1`
- `14d0304:	f3 41 0f 7f 47 78    	movdqu XMMWORD PTR [r15+0x78],xmm0`
- `14d3cf1:	49 8b 7f 78          	mov    rdi,QWORD PTR [r15+0x78]`
- `14d46ee:	49 8b 7f 78          	mov    rdi,QWORD PTR [r15+0x78]`

### `[rbp+0x98]`
- `14d26cd:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0`
- `14d2881:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]`
- `14d28f9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]`
- `14d2971:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]`
- `14d29e9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]`
- `14d3359:	88 85 98 00 00 00    	mov    BYTE PTR [rbp+0x98],al`

### `[rbp+0x20]`
- `14d0b51:	4c 8d 7d 20          	lea    r15,[rbp+0x20]`
- `14d25f3:	4c 89 65 20          	mov    QWORD PTR [rbp+0x20],r12`
- `14d2c22:	48 8b 5d 20          	mov    rbx,QWORD PTR [rbp+0x20]`
- `14d2e0b:	0f 11 4d 20          	movups XMMWORD PTR [rbp+0x20],xmm1`
- `14d2efd:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]`
- `14d2f0e:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]`
- `14d2f1f:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]`
- `14d2f65:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]`
- `14d2fde:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]`
- `14d333c:	4c 89 75 20          	mov    QWORD PTR [rbp+0x20],r14`

### `[rbp+0x30]`
- `14d2609:	0f 11 45 30          	movups XMMWORD PTR [rbp+0x30],xmm0`
- `14d284a:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]`
- `14d285b:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]`
- `14d286c:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]`
- `14d2a61:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]`
- `14d2add:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]`
- `14d2b59:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]`
- `14d2e28:	0f 11 4d 30          	movups XMMWORD PTR [rbp+0x30],xmm1`
- `14d305a:	4c 8b 75 30          	mov    r14,QWORD PTR [rbp+0x30]`

### `[r12+0x30]`
- `14ce0b6:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]`
- `14ce31c:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]`
- `14ced1d:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]`
- `14d050a:	f3 41 0f 7f 44 24 30 	movdqu XMMWORD PTR [r12+0x30],xmm0`
- `14d0b60:	49 83 64 24 30 00    	and    QWORD PTR [r12+0x30],0x0`
- `14d1d87:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]`
- `14d21fd:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]`
- `14d2222:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]`
- `14d2227:	4d 89 64 24 30       	mov    QWORD PTR [r12+0x30],r12`
- `14d2572:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]`
- `14d3e78:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]`

### `[r12+0x48]`
- `14ce326:	49 8b 44 24 48       	mov    rax,QWORD PTR [r12+0x48]`
- `14ced22:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]`
- `14d0275:	49 8b 5c 24 48       	mov    rbx,QWORD PTR [r12+0x48]`
- `14d046d:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]`
- `14d0527:	49 89 5c 24 48       	mov    QWORD PTR [r12+0x48],rbx`
- `14d1db2:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]`
- `14d1e7d:	41 0f 11 44 24 48    	movups XMMWORD PTR [r12+0x48],xmm0`
- `14d20f3:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]`
- `14d330b:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]`

## Restrictions factory bundle loads
At factory entry, `rdx` is saved as the shared setup bundle alias (`rbx=rdx`). The early field loads are the reason `bundle+0x30` matters:
- `10ab7c2:	48 89 d3             	mov    rbx,rdx`
- `10ab824:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]`
- `10ab82d:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]`
- `10ab836:	48 8b 83 98 00 00 00 	mov    rax,QWORD PTR [rbx+0x98]`
- `10ab842:	48 8b 6b 68          	mov    rbp,QWORD PTR [rbx+0x68]`
