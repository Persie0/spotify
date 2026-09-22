# Restrictions constructor frame provenance v2

Rebased combined run for `[rsp+0x40]`, `r15`, and `[rsp+0x70]` provenance.

## `rsp+0x40` refs (11)

| addr | instruction |
|---:|---|
| `0x10aba54` | `10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx` |
| `0x10ac372` | `10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac4e4` | `10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acd33` | `10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acdad` | `10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acf8d` | `10acf8d:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al` |
| `0x10ad163` | `10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0x10ad18d` | `10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0x10ad1ed` | `10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0x10ad2a7` | `10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0x10ad8ac` | `10ad8ac:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |

## `rsp+0x70` refs (4)

| addr | instruction |
|---:|---|
| `0x10ac454` | `10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15` |
| `0x10ac47f` | `10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0x10ad69b` | `10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]` |
| `0x10adb4f` | `10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]` |

## `rsp+0x28` refs (6)

| addr | instruction |
|---:|---|
| `0x10ac304` | `10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0x10ac3ab` | `10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` |
| `0x10ac50a` | `10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]` |
| `0x10ad617` | `10ad617:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]` |
| `0x10ad671` | `10ad671:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]` |
| `0x10adb5a` | `10adb5a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]` |

## `rsp+0x60` refs (5)

| addr | instruction |
|---:|---|
| `0x10aba8e` | `10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0x10ac1a1` | `10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac1e6` | `10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ad136` | `10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10adbde` | `10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]` |

## `rsp+0x80` refs (4)

| addr | instruction |
|---:|---|
| `0x10ac1da` | `10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax` |
| `0x10ad5a2` | `10ad5a2:	4c 8b bc 24 80 00 00 	mov    r15,QWORD PTR [rsp+0x80]` |
| `0x10ad6b5` | `10ad6b5:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]` |
| `0x10adb65` | `10adb65:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]` |

## `rsp+0x110` refs (90)

| addr | instruction |
|---:|---|
| `0x10abb14` | `10abb14:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abb3d` | `10abb3d:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abbae` | `10abbae:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abbda` | `10abbda:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abc48` | `10abc48:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abc71` | `10abc71:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abcdf` | `10abcdf:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abd08` | `10abd08:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abd76` | `10abd76:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abd9f` | `10abd9f:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abe0d` | `10abe0d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abe36` | `10abe36:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abea4` | `10abea4:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abecd` | `10abecd:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abf3b` | `10abf3b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abf64` | `10abf64:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10ac03c` | `10ac03c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac065` | `10ac065:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10ac134` | `10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0` |
| `0x10ac15e` | `10ac15e:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac204` | `10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac228` | `10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac237` | `10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac327` | `10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac350` | `10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac365` | `10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac3d1` | `10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac3f8` | `10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac42f` | `10ac42f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac43a` | `10ac43a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac463` | `10ac463:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac499` | `10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac4c2` | `10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac4d7` | `10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac51b` | `10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac545` | `10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac57c` | `10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac587` | `10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac5da` | `10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac610` | `10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac639` | `10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac64e` | `10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac718` | `10ac718:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac875` | `10ac875:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0` |
| `0x10ac8a2` | `10ac8a2:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac908` | `10ac908:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac9a5` | `10ac9a5:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10acac9` | `10acac9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10acb7e` | `10acb7e:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0` |
| `0x10acbab` | `10acbab:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10acc8c` | `10acc8c:	4c 8d bc 24 10 01 00 	lea    r15,[rsp+0x110]` |
| `0x10acd8c` | `10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ace4f` | `10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ace9f` | `10ace9f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10acf32` | `10acf32:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad036` | `10ad036:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad05a` | `10ad05a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad069` | `10ad069:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad088` | `10ad088:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad0ac` | `10ad0ac:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad0c7` | `10ad0c7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad0e6` | `10ad0e6:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad10e` | `10ad10e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad129` | `10ad129:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad2f5` | `10ad2f5:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad363` | `10ad363:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad3a9` | `10ad3a9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad3d8` | `10ad3d8:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad41e` | `10ad41e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad44d` | `10ad44d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad495` | `10ad495:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad502` | `10ad502:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad526` | `10ad526:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad537` | `10ad537:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad568` | `10ad568:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad57c` | `10ad57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ad5ed` | `10ad5ed:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ad61f` | `10ad61f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ad65d` | `10ad65d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad749` | `10ad749:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad772` | `10ad772:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad794` | `10ad794:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad7b5` | `10ad7b5:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad7ef` | `10ad7ef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad82b` | `10ad82b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad885` | `10ad885:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad903` | `10ad903:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad918` | `10ad918:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad95c` | `10ad95c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10adaef` | `10adaef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |

## `r15` refs (107)

| addr | instruction |
|---:|---|
| `0x10aba37` | `10aba37:	41 57                	push   r15` |
| `0x10aba59` | `10aba59:	49 89 f7             	mov    r15,rsi` |
| `0x10ac380` | `10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ac383` | `10ac383:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac389` | `10ac389:	49 89 c7             	mov    r15,rax` |
| `0x10ac3a7` | `10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15` |
| `0x10ac3b4` | `10ac3b4:	49 89 cf             	mov    r15,rcx` |
| `0x10ac3bc` | `10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax` |
| `0x10ac3c0` | `10ac3c0:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx` |
| `0x10ac3c4` | `10ac3c4:	41 c6 47 30 00       	mov    BYTE PTR [r15+0x30],0x0` |
| `0x10ac3c9` | `10ac3c9:	49 8d 7f 38          	lea    rdi,[r15+0x38]` |
| `0x10ac3cd` | `10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac3d9` | `10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15` |
| `0x10ac408` | `10ac408:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac40c` | `10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac425` | `10ac425:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac44a` | `10ac44a:	41 0f 11 47 68       	movups XMMWORD PTR [r15+0x68],xmm0` |
| `0x10ac44f` | `10ac44f:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0` |
| `0x10ac454` | `10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15` |
| `0x10ac459` | `10ac459:	41 c7 47 78 00 00 80 	mov    DWORD PTR [r15+0x78],0x3f800000` |
| `0x10ac53f` | `10ac53f:	49 89 c7             	mov    r15,rax` |
| `0x10ac555` | `10ac555:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac55c` | `10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]` |
| `0x10ac560` | `10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac597` | `10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0` |
| `0x10ac59c` | `10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0` |
| `0x10ac5a1` | `10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0` |
| `0x10ac5a8` | `10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al` |
| `0x10ac5ac` | `10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al` |
| `0x10ac5b0` | `10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al` |
| `0x10ac5b7` | `10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al` |
| `0x10ac5be` | `10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al` |
| `0x10ac5c5` | `10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al` |
| `0x10ac5cc` | `10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15` |
| `0x10ac5d1` | `10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al` |
| `0x10ac6d9` | `10ac6d9:	41 89 c7             	mov    r15d,eax` |
| `0x10ac6e9` | `10ac6e9:	49 63 c7             	movsxd rax,r15d` |
| `0x10ac6f7` | `10ac6f7:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]` |
| `0x10ac6ff` | `10ac6ff:	49 89 57 10          	mov    QWORD PTR [r15+0x10],rdx` |
| `0x10ac70b` | `10ac70b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0` |
| `0x10ac75c` | `10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]` |
| `0x10ac764` | `10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]` |
| `0x10ac76d` | `10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0` |
| `0x10ac772` | `10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1` |
| `0x10ac7cd` | `10ac7cd:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac88f` | `10ac88f:	49 89 c7             	mov    r15,rax` |
| `0x10ac8aa` | `10ac8aa:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10ac958` | `10ac958:	41 89 c7             	mov    r15d,eax` |
| `0x10ac973` | `10ac973:	4d 63 ef             	movsxd r13,r15d` |
| `0x10ac9b9` | `10ac9b9:	4c 6b f8 3c          	imul   r15,rax,0x3c` |
| `0x10aca22` | `10aca22:	49 81 ff 11 0e 00 00 	cmp    r15,0xe11` |
| `0x10aca2e` | `10aca2e:	49 0f 4d c7          	cmovge rax,r15` |
| `0x10acabf` | `10acabf:	4d 89 f8             	mov    r8,r15` |
| `0x10acb98` | `10acb98:	49 89 c7             	mov    r15,rax` |
| `0x10acbb3` | `10acbb3:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10acc0f` | `10acc0f:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0x10acc4f` | `10acc4f:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15` |
| `0x10acc8c` | `10acc8c:	4c 8d bc 24 10 01 00 	lea    r15,[rsp+0x110]` |
| `0x10acc98` | `10acc98:	4c 89 ff             	mov    rdi,r15` |
| `0x10accbe` | `10accbe:	4c 89 fa             	mov    rdx,r15` |
| `0x10accd8` | `10accd8:	4c 89 ff             	mov    rdi,r15` |
| `0x10acdb8` | `10acdb8:	49 89 c7             	mov    r15,rax` |
| `0x10acdee` | `10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15` |
| `0x10ace65` | `10ace65:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ace73` | `10ace73:	4c 89 fe             	mov    rsi,r15` |
| `0x10aceb8` | `10aceb8:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]` |
| `0x10acec0` | `10acec0:	4c 89 ff             	mov    rdi,r15` |
| `0x10acedb` | `10acedb:	4d 8b 2f             	mov    r13,QWORD PTR [r15]` |
| `0x10acefe` | `10acefe:	4d 89 f7             	mov    r15,r14` |
| `0x10acf01` | `10acf01:	49 83 c7 10          	add    r15,0x10` |
| `0x10acf17` | `10acf17:	4c 89 ff             	mov    rdi,r15` |
| `0x10acf22` | `10acf22:	4c 89 ff             	mov    rdi,r15` |
| `0x10ad153` | `10ad153:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0x10ad1cf` | `10ad1cf:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15` |
| `0x10ad2d8` | `10ad2d8:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]` |
| `0x10ad30b` | `10ad30b:	49 8b 37             	mov    rsi,QWORD PTR [r15]` |
| `0x10ad311` | `10ad311:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]` |
| `0x10ad319` | `10ad319:	4c 89 ff             	mov    rdi,r15` |
| `0x10ad325` | `10ad325:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad32d` | `10ad32d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x10ad33e` | `10ad33e:	4c 8b bd 90 00 00 00 	mov    r15,QWORD PTR [rbp+0x90]` |
| `0x10ad345` | `10ad345:	4d 85 ff             	test   r15,r15` |
| `0x10ad379` | `10ad379:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ad384` | `10ad384:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad3b6` | `10ad3b6:	4c 8b 7d 18          	mov    r15,QWORD PTR [rbp+0x18]` |
| `0x10ad3ba` | `10ad3ba:	4d 85 ff             	test   r15,r15` |
| `0x10ad3ee` | `10ad3ee:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ad3f9` | `10ad3f9:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad42b` | `10ad42b:	4c 8b 7d 38          	mov    r15,QWORD PTR [rbp+0x38]` |
| `0x10ad42f` | `10ad42f:	4d 85 ff             	test   r15,r15` |
| `0x10ad463` | `10ad463:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ad46e` | `10ad46e:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad5a2` | `10ad5a2:	4c 8b bc 24 80 00 00 	mov    r15,QWORD PTR [rsp+0x80]` |
| `0x10ad5aa` | `10ad5aa:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ad5b5` | `10ad5b5:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad5fd` | `10ad5fd:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10ad70c` | `10ad70c:	41 5f                	pop    r15` |
| `0x10ad756` | `10ad756:	4d 89 fe             	mov    r14,r15` |
| `0x10ad759` | `10ad759:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]` |
| `0x10ad76c` | `10ad76c:	4d 89 fe             	mov    r14,r15` |
| `0x10ad7a1` | `10ad7a1:	4d 89 fe             	mov    r14,r15` |
| `0x10ad7a4` | `10ad7a4:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0x10ad7af` | `10ad7af:	4d 89 fe             	mov    r14,r15` |
| `0x10ad7dd` | `10ad7dd:	4c 89 ff             	mov    rdi,r15` |
| `0x10ad892` | `10ad892:	49 89 ef             	mov    r15,rbp` |
| `0x10ad895` | `10ad895:	49 81 c7 a0 00 00 00 	add    r15,0xa0` |
| `0x10ad8c0` | `10ad8c0:	4c 89 ff             	mov    rdi,r15` |

## `r14` refs (223)

| addr | instruction |
|---:|---|
| `0x10aba39` | `10aba39:	41 56                	push   r14` |
| `0x10abb09` | `10abb09:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abb91` | `10abb91:	4c 89 f7             	mov    rdi,r14` |
| `0x10abbaa` | `10abbaa:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abc27` | `10abc27:	4c 89 f7             	mov    rdi,r14` |
| `0x10abc3d` | `10abc3d:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abcbe` | `10abcbe:	4c 89 f7             	mov    rdi,r14` |
| `0x10abcd4` | `10abcd4:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abd55` | `10abd55:	4c 89 f7             	mov    rdi,r14` |
| `0x10abd6b` | `10abd6b:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abdec` | `10abdec:	4c 89 f7             	mov    rdi,r14` |
| `0x10abe02` | `10abe02:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abe83` | `10abe83:	4c 89 f7             	mov    rdi,r14` |
| `0x10abe99` | `10abe99:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abf1a` | `10abf1a:	4c 89 f7             	mov    rdi,r14` |
| `0x10abf7e` | `10abf7e:	41 5e                	pop    r14` |
| `0x10abf80` | `10abf80:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10abf90` | `10abf90:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10abf94` | `10abf94:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10abfb4` | `10abfb4:	41 5e                	pop    r14` |
| `0x10abfbc` | `10abfbc:	4d 89 f0             	mov    r8,r14` |
| `0x10ac07a` | `10ac07a:	41 5e                	pop    r14` |
| `0x10ac07c` | `10ac07c:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ac08c` | `10ac08c:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ac090` | `10ac090:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ac0ad` | `10ac0ad:	41 5e                	pop    r14` |
| `0x10ac0b6` | `10ac0b6:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac0ea` | `10ac0ea:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac110` | `10ac110:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac131` | `10ac131:	49 89 c6             	mov    r14,rax` |
| `0x10ac187` | `10ac187:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac18a` | `10ac18a:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac1a9` | `10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac204` | `10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac213` | `10ac213:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac21b` | `10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl` |
| `0x10ac327` | `10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac336` | `10ac336:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac33e` | `10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac37d` | `10ac37d:	49 89 c6             	mov    r14,rax` |
| `0x10ac3a3` | `10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14` |
| `0x10ac3f8` | `10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac400` | `10ac400:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac40c` | `10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac416` | `10ac416:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10ac421` | `10ac421:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x10ac499` | `10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac4a8` | `10ac4a8:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac4b0` | `10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac4ef` | `10ac4ef:	49 89 c6             	mov    r14,rax` |
| `0x10ac506` | `10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ac545` | `10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac54d` | `10ac54d:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac560` | `10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac56a` | `10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10ac575` | `10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x10ac610` | `10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac61f` | `10ac61f:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac627` | `10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac6a1` | `10ac6a1:	41 5e                	pop    r14` |
| `0x10ac6ab` | `10ac6ab:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac6cb` | `10ac6cb:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac6e6` | `10ac6e6:	49 89 c6             	mov    r14,rax` |
| `0x10ac74d` | `10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx` |
| `0x10ac758` | `10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx` |
| `0x10ac760` | `10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx` |
| `0x10ac768` | `10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10ac776` | `10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx` |
| `0x10ac77a` | `10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0x10ac77e` | `10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]` |
| `0x10ac78d` | `10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0` |
| `0x10ac792` | `10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0` |
| `0x10ac797` | `10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0` |
| `0x10ac79c` | `10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]` |
| `0x10ac7a3` | `10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x10ac7ac` | `10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100` |
| `0x10ac7b6` | `10ac7b6:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac7dd` | `10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac824` | `10ac824:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]` |
| `0x10ac82c` | `10ac82c:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax` |
| `0x10ac838` | `10ac838:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac8f1` | `10ac8f1:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac970` | `10ac970:	49 89 c6             	mov    r14,rax` |
| `0x10ac9da` | `10ac9da:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac9e5` | `10ac9e5:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10ac9f1` | `10ac9f1:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax` |
| `0x10ac9fd` | `10ac9fd:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10aca1e` | `10aca1e:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax` |
| `0x10aca32` | `10aca32:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0x10aca36` | `10aca36:	49 8d 7e 38          	lea    rdi,[r14+0x38]` |
| `0x10aca42` | `10aca42:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0` |
| `0x10aca47` | `10aca47:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0` |
| `0x10aca4c` | `10aca4c:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0` |
| `0x10aca51` | `10aca51:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]` |
| `0x10aca58` | `10aca58:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x10aca61` | `10aca61:	41 c6 86 98 00 00 00 	mov    BYTE PTR [r14+0x98],0x0` |
| `0x10aca69` | `10aca69:	4c 89 f7             	mov    rdi,r14` |
| `0x10acaeb` | `10acaeb:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acb2d` | `10acb2d:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]` |
| `0x10acb35` | `10acb35:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax` |
| `0x10acb41` | `10acb41:	4c 89 f7             	mov    rdi,r14` |
| `0x10acbfa` | `10acbfa:	4c 89 f7             	mov    rdi,r14` |
| `0x10acc1c` | `10acc1c:	49 89 c6             	mov    r14,rax` |
| `0x10acc26` | `10acc26:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10acc30` | `10acc30:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10acc3b` | `10acc3b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10acc47` | `10acc47:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12` |
| `0x10acc4b` | `10acc4b:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10acc4f` | `10acc4f:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15` |
| `0x10acc55` | `10acc55:	41 88 5e 30          	mov    BYTE PTR [r14+0x30],bl` |
| `0x10acc59` | `10acc59:	41 88 5e 60          	mov    BYTE PTR [r14+0x60],bl` |
| `0x10acc5d` | `10acc5d:	41 88 5e 68          	mov    BYTE PTR [r14+0x68],bl` |
| `0x10acc61` | `10acc61:	41 88 9e c0 00 00 00 	mov    BYTE PTR [r14+0xc0],bl` |
| `0x10acc6b` | `10acc6b:	41 0f 11 86 c8 00 00 	movups XMMWORD PTR [r14+0xc8],xmm0` |
| `0x10acc7b` | `10acc7b:	4d 89 30             	mov    QWORD PTR [r8],r14` |
| `0x10acca2` | `10acca2:	4d 89 f5             	mov    r13,r14` |
| `0x10acce0` | `10acce0:	41 88 9e e8 00 00 00 	mov    BYTE PTR [r14+0xe8],bl` |
| `0x10accea` | `10accea:	41 0f 11 86 f0 00 00 	movups XMMWORD PTR [r14+0xf0],xmm0` |
| `0x10accf2` | `10accf2:	41 0f 11 86 00 01 00 	movups XMMWORD PTR [r14+0x100],xmm0` |
| `0x10accfa` | `10accfa:	41 c7 86 10 01 00 00 	mov    DWORD PTR [r14+0x110],0x3f800000` |
| `0x10acd05` | `10acd05:	41 0f 11 86 18 01 00 	movups XMMWORD PTR [r14+0x118],xmm0` |
| `0x10acd0d` | `10acd0d:	41 0f 11 86 28 01 00 	movups XMMWORD PTR [r14+0x128],xmm0` |
| `0x10acd15` | `10acd15:	41 0f 11 86 38 01 00 	movups XMMWORD PTR [r14+0x138],xmm0` |
| `0x10acd25` | `10acd25:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acd3e` | `10acd3e:	49 89 c6             	mov    r14,rax` |
| `0x10acd66` | `10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14` |
| `0x10acd8c` | `10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10acd94` | `10acd94:	49 83 26 00          	and    QWORD PTR [r14],0x0` |
| `0x10acda5` | `10acda5:	4c 89 f7             	mov    rdi,r14` |
| `0x10acdd6` | `10acdd6:	49 89 c6             	mov    r14,rax` |
| `0x10acde0` | `10acde0:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10acdea` | `10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10acdee` | `10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15` |
| `0x10acdf2` | `10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13` |
| `0x10acdf6` | `10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10acdfa` | `10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]` |
| `0x10ace01` | `10ace01:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0` |
| `0x10ace06` | `10ace06:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0` |
| `0x10ace0b` | `10ace0b:	41 c7 46 48 00 00 80 	mov    DWORD PTR [r14+0x48],0x3f800000` |
| `0x10ace13` | `10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]` |
| `0x10ace1f` | `10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]` |
| `0x10ace3e` | `10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14` |
| `0x10ace7c` | `10ace7c:	4c 89 f7             	mov    rdi,r14` |
| `0x10acec3` | `10acec3:	4c 89 f6             	mov    rsi,r14` |
| `0x10acee6` | `10acee6:	49 89 c6             	mov    r14,rax` |
| `0x10acef0` | `10acef0:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10acefa` | `10acefa:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10acefe` | `10acefe:	4d 89 f7             	mov    r15,r14` |
| `0x10acf08` | `10acf08:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10acf0d` | `10acf0d:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0` |
| `0x10acf12` | `10acf12:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0` |
| `0x10acf46` | `10acf46:	4c 89 f6             	mov    rsi,r14` |
| `0x10acf7b` | `10acf7b:	41 5e                	pop    r14` |
| `0x10acf82` | `10acf82:	4d 89 f0             	mov    r8,r14` |
| `0x10ad015` | `10ad015:	4d 89 f0             	mov    r8,r14` |
| `0x10ad14b` | `10ad14b:	4c 8b 30             	mov    r14,QWORD PTR [rax]` |
| `0x10ad193` | `10ad193:	4d 8d 6e 08          	lea    r13,[r14+0x8]` |
| `0x10ad197` | `10ad197:	4d 85 f6             	test   r14,r14` |
| `0x10ad19a` | `10ad19a:	4d 0f 44 ee          	cmove  r13,r14` |
| `0x10ad2b1` | `10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]` |
| `0x10ad2b8` | `10ad2b8:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad322` | `10ad322:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad4aa` | `10ad4aa:	49 89 c6             	mov    r14,rax` |
| `0x10ad4b4` | `10ad4b4:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ad4b7` | `10ad4b7:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp` |
| `0x10ad4c6` | `10ad4c6:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10ad4d9` | `10ad4d9:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax` |
| `0x10ad4dd` | `10ad4dd:	49 83 66 48 00       	and    QWORD PTR [r14+0x48],0x0` |
| `0x10ad4e2` | `10ad4e2:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0` |
| `0x10ad4e7` | `10ad4e7:	49 83 66 38 00       	and    QWORD PTR [r14+0x38],0x0` |
| `0x10ad556` | `10ad556:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad697` | `10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad70a` | `10ad70a:	41 5e                	pop    r14` |
| `0x10ad756` | `10ad756:	4d 89 fe             	mov    r14,r15` |
| `0x10ad76c` | `10ad76c:	4d 89 fe             	mov    r14,r15` |
| `0x10ad77f` | `10ad77f:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad7a1` | `10ad7a1:	4d 89 fe             	mov    r14,r15` |
| `0x10ad7af` | `10ad7af:	4d 89 fe             	mov    r14,r15` |
| `0x10ad7c2` | `10ad7c2:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad7d4` | `10ad7d4:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]` |
| `0x10ad814` | `10ad814:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad8a4` | `10ad8a4:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad969` | `10ad969:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad97e` | `10ad97e:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ad98e` | `10ad98e:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ad992` | `10ad992:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ad9a7` | `10ad9a7:	41 5e                	pop    r14` |
| `0x10ad9a9` | `10ad9a9:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ad9b9` | `10ad9b9:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ad9bd` | `10ad9bd:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ad9d2` | `10ad9d2:	41 5e                	pop    r14` |
| `0x10ad9d4` | `10ad9d4:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ad9e4` | `10ad9e4:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ad9e8` | `10ad9e8:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ad9fd` | `10ad9fd:	41 5e                	pop    r14` |
| `0x10ad9ff` | `10ad9ff:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ada0f` | `10ada0f:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ada13` | `10ada13:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ada28` | `10ada28:	41 5e                	pop    r14` |
| `0x10ada2a` | `10ada2a:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ada3a` | `10ada3a:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ada3e` | `10ada3e:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ada53` | `10ada53:	41 5e                	pop    r14` |
| `0x10ada55` | `10ada55:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ada65` | `10ada65:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ada69` | `10ada69:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ada7b` | `10ada7b:	41 5e                	pop    r14` |
| `0x10ada7d` | `10ada7d:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ada8d` | `10ada8d:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ada91` | `10ada91:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10adaa3` | `10adaa3:	41 5e                	pop    r14` |
| `0x10adaa5` | `10adaa5:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10adab5` | `10adab5:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10adab9` | `10adab9:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10adacb` | `10adacb:	41 5e                	pop    r14` |
| `0x10adacd` | `10adacd:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10adadd` | `10adadd:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10adae1` | `10adae1:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10adb2e` | `10adb2e:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10adb31` | `10adb31:	4c 89 f7             	mov    rdi,r14` |
| `0x10adbc4` | `10adbc4:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]` |
| `0x10adbcc` | `10adbcc:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]` |
| `0x10adbd5` | `10adbd5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]` |

## `r13` refs (100)

| addr | instruction |
|---:|---|
| `0x10aba3b` | `10aba3b:	41 55                	push   r13` |
| `0x10abb59` | `10abb59:	41 5d                	pop    r13` |
| `0x10abb5b` | `10abb5b:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]` |
| `0x10abb6b` | `10abb6b:	49 83 c5 e8          	add    r13,0xffffffffffffffe8` |
| `0x10abb6f` | `10abb6f:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8` |
| `0x10abb83` | `10abb83:	4c 8d 2d 86 b8 32 ff 	lea    r13,[rip+0xffffffffff32b886]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>` |
| `0x10abb94` | `10abb94:	4d 89 e9             	mov    r9,r13` |
| `0x10abbb6` | `10abbb6:	4c 89 ee             	mov    rsi,r13` |
| `0x10abbef` | `10abbef:	41 5d                	pop    r13` |
| `0x10abbf1` | `10abbf1:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]` |
| `0x10abc01` | `10abc01:	49 83 c5 e8          	add    r13,0xffffffffffffffe8` |
| `0x10abc05` | `10abc05:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8` |
| `0x10abc86` | `10abc86:	41 5d                	pop    r13` |
| `0x10abc88` | `10abc88:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]` |
| `0x10abc98` | `10abc98:	49 83 c5 e8          	add    r13,0xffffffffffffffe8` |
| `0x10abc9c` | `10abc9c:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8` |
| `0x10abd1d` | `10abd1d:	41 5d                	pop    r13` |
| `0x10abd1f` | `10abd1f:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]` |
| `0x10abd2f` | `10abd2f:	49 83 c5 e8          	add    r13,0xffffffffffffffe8` |
| `0x10abd33` | `10abd33:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8` |
| `0x10abdb4` | `10abdb4:	41 5d                	pop    r13` |
| `0x10abdb6` | `10abdb6:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]` |
| `0x10abdc6` | `10abdc6:	49 83 c5 e8          	add    r13,0xffffffffffffffe8` |
| `0x10abdca` | `10abdca:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8` |
| `0x10abe4b` | `10abe4b:	41 5d                	pop    r13` |
| `0x10abe4d` | `10abe4d:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]` |
| `0x10abe5d` | `10abe5d:	49 83 c5 e8          	add    r13,0xffffffffffffffe8` |
| `0x10abe61` | `10abe61:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8` |
| `0x10abee2` | `10abee2:	41 5d                	pop    r13` |
| `0x10abee4` | `10abee4:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]` |
| `0x10abef4` | `10abef4:	49 83 c5 e8          	add    r13,0xffffffffffffffe8` |
| `0x10abef8` | `10abef8:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8` |
| `0x10abf5c` | `10abf5c:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]` |
| `0x10abf6f` | `10abf6f:	4c 89 ef             	mov    rdi,r13` |
| `0x10abfbf` | `10abfbf:	41 55                	push   r13` |
| `0x10abfca` | `10abfca:	4c 89 ef             	mov    rdi,r13` |
| `0x10ac05d` | `10ac05d:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]` |
| `0x10ac070` | `10ac070:	4c 89 ef             	mov    rdi,r13` |
| `0x10ac0b9` | `10ac0b9:	41 55                	push   r13` |
| `0x10ac0c4` | `10ac0c4:	4c 89 ef             	mov    rdi,r13` |
| `0x10ac15e` | `10ac15e:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac166` | `10ac166:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12` |
| `0x10ac171` | `10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac17c` | `10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac191` | `10ac191:	4c 89 ee             	mov    rsi,r13` |
| `0x10ac199` | `10ac199:	4c 89 ef             	mov    rdi,r13` |
| `0x10ac1eb` | `10ac1eb:	4c 8b 28             	mov    r13,QWORD PTR [rax]` |
| `0x10ac2ee` | `10ac2ee:	4c 89 a8 30 01 00 00 	mov    QWORD PTR [rax+0x130],r13` |
| `0x10ac718` | `10ac718:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac720` | `10ac720:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0` |
| `0x10ac737` | `10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx` |
| `0x10ac742` | `10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx` |
| `0x10ac782` | `10ac782:	4c 89 ee             	mov    rsi,r13` |
| `0x10ac7c5` | `10ac7c5:	4c 89 ef             	mov    rdi,r13` |
| `0x10ac8a2` | `10ac8a2:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac8aa` | `10ac8aa:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10ac8b5` | `10ac8b5:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac8c0` | `10ac8c0:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac8d4` | `10ac8d4:	4c 89 ea             	mov    rdx,r13` |
| `0x10ac8dc` | `10ac8dc:	4c 89 ef             	mov    rdi,r13` |
| `0x10ac973` | `10ac973:	4d 63 ef             	movsxd r13,r15d` |
| `0x10aca0b` | `10aca0b:	49 83 fd 06          	cmp    r13,0x6` |
| `0x10aca12` | `10aca12:	49 0f 42 c5          	cmovb  rax,r13` |
| `0x10aca78` | `10aca78:	41 83 fd 07          	cmp    r13d,0x7` |
| `0x10aca96` | `10aca96:	4d 89 e8             	mov    r8,r13` |
| `0x10acbab` | `10acbab:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10acbb3` | `10acbb3:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10acbbe` | `10acbbe:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10acbc9` | `10acbc9:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10acbdd` | `10acbdd:	4c 89 ea             	mov    rdx,r13` |
| `0x10acbe5` | `10acbe5:	4c 89 ef             	mov    rdi,r13` |
| `0x10acca2` | `10acca2:	4d 89 f5             	mov    r13,r14` |
| `0x10acca5` | `10acca5:	49 81 c5 d8 00 00 00 	add    r13,0xd8` |
| `0x10accc4` | `10accc4:	4c 89 ef             	mov    rdi,r13` |
| `0x10acdc9` | `10acdc9:	49 89 c5             	mov    r13,rax` |
| `0x10acdf2` | `10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13` |
| `0x10ace1f` | `10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]` |
| `0x10ace26` | `10ace26:	4c 89 ef             	mov    rdi,r13` |
| `0x10acedb` | `10acedb:	4d 8b 2f             	mov    r13,QWORD PTR [r15]` |
| `0x10acf25` | `10acf25:	4c 89 ee             	mov    rsi,r13` |
| `0x10acf77` | `10acf77:	41 5d                	pop    r13` |
| `0x10acf7f` | `10acf7f:	4c 89 ea             	mov    rdx,r13` |
| `0x10acfa7` | `10acfa7:	4c 89 ea             	mov    rdx,r13` |
| `0x10acfcc` | `10acfcc:	4c 89 ea             	mov    rdx,r13` |
| `0x10acff1` | `10acff1:	4c 89 ea             	mov    rdx,r13` |
| `0x10ad012` | `10ad012:	4c 89 ea             	mov    rdx,r13` |
| `0x10ad193` | `10ad193:	4d 8d 6e 08          	lea    r13,[r14+0x8]` |
| `0x10ad19a` | `10ad19a:	4d 0f 44 ee          	cmove  r13,r14` |
| `0x10ad1cb` | `10ad1cb:	4c 89 6d 30          	mov    QWORD PTR [rbp+0x30],r13` |
| `0x10ad2c0` | `10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]` |
| `0x10ad2c7` | `10ad2c7:	4c 89 ef             	mov    rdi,r13` |
| `0x10ad395` | `10ad395:	4c 89 ef             	mov    rdi,r13` |
| `0x10ad5ed` | `10ad5ed:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ad5f5` | `10ad5f5:	4c 89 ef             	mov    rdi,r13` |
| `0x10ad5fd` | `10ad5fd:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10ad608` | `10ad608:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ad613` | `10ad613:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ad708` | `10ad708:	41 5d                	pop    r13` |
| `0x10ad7fc` | `10ad7fc:	4c 89 ef             	mov    rdi,r13` |
| `0x10ad89c` | `10ad89c:	4c 89 ef             	mov    rdi,r13` |

## `r12` refs (79)

| addr | instruction |
|---:|---|
| `0x10aba3d` | `10aba3d:	41 54                	push   r12` |
| `0x10abb35` | `10abb35:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0x10abb48` | `10abb48:	4c 89 e7             	mov    rdi,r12` |
| `0x10abb97` | `10abb97:	41 54                	push   r12` |
| `0x10abba2` | `10abba2:	4c 89 e7             	mov    rdi,r12` |
| `0x10abbd2` | `10abbd2:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0x10abbe5` | `10abbe5:	4c 89 e7             	mov    rdi,r12` |
| `0x10abc2a` | `10abc2a:	41 54                	push   r12` |
| `0x10abc35` | `10abc35:	4c 89 e7             	mov    rdi,r12` |
| `0x10abc69` | `10abc69:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0x10abc7c` | `10abc7c:	4c 89 e7             	mov    rdi,r12` |
| `0x10abcc1` | `10abcc1:	41 54                	push   r12` |
| `0x10abccc` | `10abccc:	4c 89 e7             	mov    rdi,r12` |
| `0x10abd00` | `10abd00:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0x10abd13` | `10abd13:	4c 89 e7             	mov    rdi,r12` |
| `0x10abd58` | `10abd58:	41 54                	push   r12` |
| `0x10abd63` | `10abd63:	4c 89 e7             	mov    rdi,r12` |
| `0x10abd97` | `10abd97:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0x10abdaa` | `10abdaa:	4c 89 e7             	mov    rdi,r12` |
| `0x10abdef` | `10abdef:	41 54                	push   r12` |
| `0x10abdfa` | `10abdfa:	4c 89 e7             	mov    rdi,r12` |
| `0x10abe2e` | `10abe2e:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0x10abe41` | `10abe41:	4c 89 e7             	mov    rdi,r12` |
| `0x10abe86` | `10abe86:	41 54                	push   r12` |
| `0x10abe91` | `10abe91:	4c 89 e7             	mov    rdi,r12` |
| `0x10abec5` | `10abec5:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0x10abed8` | `10abed8:	4c 89 e7             	mov    rdi,r12` |
| `0x10abf1d` | `10abf1d:	41 54                	push   r12` |
| `0x10abf28` | `10abf28:	4c 89 e7             	mov    rdi,r12` |
| `0x10abf30` | `10abf30:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]` |
| `0x10abfb6` | `10abfb6:	4c 89 e7             	mov    rdi,r12` |
| `0x10abfd2` | `10abfd2:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]` |
| `0x10abfd7` | `10abfd7:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10ac001` | `10ac001:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10ac01e` | `10ac01e:	4c 89 e5             	mov    rbp,r12` |
| `0x10ac031` | `10ac031:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]` |
| `0x10ac0b3` | `10ac0b3:	4c 89 e7             	mov    rdi,r12` |
| `0x10ac0d2` | `10ac0d2:	41 5c                	pop    r12` |
| `0x10ac0ef` | `10ac0ef:	41 54                	push   r12` |
| `0x10ac11e` | `10ac11e:	41 54                	push   r12` |
| `0x10ac14e` | `10ac14e:	49 89 c4             	mov    r12,rax` |
| `0x10ac166` | `10ac166:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12` |
| `0x10ac310` | `10ac310:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]` |
| `0x10ac315` | `10ac315:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0x10ac487` | `10ac487:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0x10ac5fe` | `10ac5fe:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0x10ac68d` | `10ac68d:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10ac6b5` | `10ac6b5:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10ac817` | `10ac817:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]` |
| `0x10ac94f` | `10ac94f:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10ac95b` | `10ac95b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10acc3f` | `10acc3f:	4c 8b a4 24 e0 01 00 	mov    r12,QWORD PTR [rsp+0x1e0]` |
| `0x10acc47` | `10acc47:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12` |
| `0x10accac` | `10accac:	49 8b 04 24          	mov    rax,QWORD PTR [r12]` |
| `0x10accbb` | `10accbb:	4c 89 e6             	mov    rsi,r12` |
| `0x10acdfa` | `10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]` |
| `0x10acf2d` | `10acf2d:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]` |
| `0x10acf63` | `10acf63:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10acf91` | `10acf91:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10acfb6` | `10acfb6:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10acfdb` | `10acfdb:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10ad000` | `10ad000:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]` |
| `0x10ad024` | `10ad024:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0x10ad076` | `10ad076:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0x10ad0d4` | `10ad0d4:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0x10ad143` | `10ad143:	4c 8b 20             	mov    r12,QWORD PTR [rax]` |
| `0x10ad1bb` | `10ad1bb:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12` |
| `0x10ad1bf` | `10ad1bf:	4c 8d 65 20          	lea    r12,[rbp+0x20]` |
| `0x10ad1c3` | `10ad1c3:	4c 89 e7             	mov    rdi,r12` |
| `0x10ad40a` | `10ad40a:	4c 89 e7             	mov    rdi,r12` |
| `0x10ad5cc` | `10ad5cc:	4c 8b a4 24 a0 00 00 	mov    r12,QWORD PTR [rsp+0xa0]` |
| `0x10ad5d4` | `10ad5d4:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]` |
| `0x10ad5d9` | `10ad5d9:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0` |
| `0x10ad640` | `10ad640:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]` |
| `0x10ad645` | `10ad645:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0` |
| `0x10ad706` | `10ad706:	41 5c                	pop    r12` |
| `0x10ad80c` | `10ad80c:	4c 89 e7             	mov    rdi,r12` |
| `0x10ad8d2` | `10ad8d2:	4c 89 e7             	mov    rdi,r12` |
| `0x10ad94f` | `10ad94f:	4c 89 e7             	mov    rdi,r12` |

## `rbp` refs (88)

| addr | instruction |
|---:|---|
| `0x10aba36` | `10aba36:	55                   	push   rbp` |
| `0x10aba51` | `10aba51:	48 89 cd             	mov    rbp,rcx` |
| `0x10abb09` | `10abb09:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abbaa` | `10abbaa:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abc3d` | `10abc3d:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abcd4` | `10abcd4:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abd6b` | `10abd6b:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abe02` | `10abe02:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abe99` | `10abe99:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abf30` | `10abf30:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]` |
| `0x10abf77` | `10abf77:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp` |
| `0x10abfb1` | `10abfb1:	5d                   	pop    rbp` |
| `0x10abfb9` | `10abfb9:	48 89 ea             	mov    rdx,rbp` |
| `0x10abff1` | `10abff1:	48 89 ea             	mov    rdx,rbp` |
| `0x10ac01b` | `10ac01b:	48 89 ea             	mov    rdx,rbp` |
| `0x10ac01e` | `10ac01e:	4c 89 e5             	mov    rbp,r12` |
| `0x10ac0cc` | `10ac0cc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]` |
| `0x10ac0fa` | `10ac0fa:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]` |
| `0x10ac1c9` | `10ac1c9:	31 ed                	xor    ebp,ebp` |
| `0x10ac235` | `10ac235:	89 c5                	mov    ebp,eax` |
| `0x10ac6b3` | `10ac6b3:	89 c5                	mov    ebp,eax` |
| `0x10ac6ec` | `10ac6ec:	48 63 cd             	movsxd rcx,ebp` |
| `0x10ac964` | `10ac964:	89 c5                	mov    ebp,eax` |
| `0x10ac976` | `10ac976:	48 63 c5             	movsxd rax,ebp` |
| `0x10acaa0` | `10acaa0:	83 fd 3b             	cmp    ebp,0x3b` |
| `0x10accb0` | `10accb0:	48 8d ac 24 f0 00 00 	lea    rbp,[rsp+0xf0]` |
| `0x10accb8` | `10accb8:	48 89 ef             	mov    rdi,rbp` |
| `0x10accc7` | `10accc7:	48 89 ee             	mov    rsi,rbp` |
| `0x10acccf` | `10acccf:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0x10ace13` | `10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]` |
| `0x10ace17` | `10ace17:	48 89 ef             	mov    rdi,rbp` |
| `0x10aced8` | `10aced8:	48 8b 28             	mov    rbp,QWORD PTR [rax]` |
| `0x10acf1a` | `10acf1a:	48 89 ee             	mov    rsi,rbp` |
| `0x10acf7d` | `10acf7d:	31 ed                	xor    ebp,ebp` |
| `0x10ad067` | `10ad067:	89 c5                	mov    ebp,eax` |
| `0x10ad101` | `10ad101:	89 6c 24 10          	mov    DWORD PTR [rsp+0x10],ebp` |
| `0x10ad160` | `10ad160:	48 89 c5             	mov    rbp,rax` |
| `0x10ad1a5` | `10ad1a5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax` |
| `0x10ad1ae` | `10ad1ae:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax` |
| `0x10ad1b7` | `10ad1b7:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax` |
| `0x10ad1bb` | `10ad1bb:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12` |
| `0x10ad1bf` | `10ad1bf:	4c 8d 65 20          	lea    r12,[rbp+0x20]` |
| `0x10ad1cb` | `10ad1cb:	4c 89 6d 30          	mov    QWORD PTR [rbp+0x30],r13` |
| `0x10ad1cf` | `10ad1cf:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15` |
| `0x10ad1d3` | `10ad1d3:	48 8d 7d 40          	lea    rdi,[rbp+0x40]` |
| `0x10ad1e1` | `10ad1e1:	c7 45 50 05 00 00 00 	mov    DWORD PTR [rbp+0x50],0x5` |
| `0x10ad1e8` | `10ad1e8:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0` |
| `0x10ad1f2` | `10ad1f2:	f3 0f 11 45 56       	movss  DWORD PTR [rbp+0x56],xmm0` |
| `0x10ad1fb` | `10ad1fb:	88 45 5a             	mov    BYTE PTR [rbp+0x5a],al` |
| `0x10ad1fe` | `10ad1fe:	c6 45 5b 00          	mov    BYTE PTR [rbp+0x5b],0x0` |
| `0x10ad206` | `10ad206:	88 45 5c             	mov    BYTE PTR [rbp+0x5c],al` |
| `0x10ad20d` | `10ad20d:	88 45 5d             	mov    BYTE PTR [rbp+0x5d],al` |
| `0x10ad214` | `10ad214:	88 45 5e             	mov    BYTE PTR [rbp+0x5e],al` |
| `0x10ad217` | `10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx` |
| `0x10ad223` | `10ad223:	48 89 45 68          	mov    QWORD PTR [rbp+0x68],rax` |
| `0x10ad22f` | `10ad22f:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax` |
| `0x10ad23b` | `10ad23b:	48 89 45 78          	mov    QWORD PTR [rbp+0x78],rax` |
| `0x10ad247` | `10ad247:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax` |
| `0x10ad256` | `10ad256:	48 89 85 88 00 00 00 	mov    QWORD PTR [rbp+0x88],rax` |
| `0x10ad265` | `10ad265:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax` |
| `0x10ad26f` | `10ad26f:	48 83 a5 b8 00 00 00 	and    QWORD PTR [rbp+0xb8],0x0` |
| `0x10ad277` | `10ad277:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0` |
| `0x10ad27e` | `10ad27e:	0f 11 85 a8 00 00 00 	movups XMMWORD PTR [rbp+0xa8],xmm0` |
| `0x10ad285` | `10ad285:	c7 85 c0 00 00 00 00 	mov    DWORD PTR [rbp+0xc0],0x3f800000` |
| `0x10ad28f` | `10ad28f:	48 8d bd c8 00 00 00 	lea    rdi,[rbp+0xc8]` |
| `0x10ad2a0` | `10ad2a0:	48 8d bd 20 01 00 00 	lea    rdi,[rbp+0x120]` |
| `0x10ad2b1` | `10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]` |
| `0x10ad2c0` | `10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]` |
| `0x10ad2cf` | `10ad2cf:	8a 45 5e             	mov    al,BYTE PTR [rbp+0x5e]` |
| `0x10ad2d8` | `10ad2d8:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]` |
| `0x10ad2e4` | `10ad2e4:	49 89 28             	mov    QWORD PTR [r8],rbp` |
| `0x10ad33e` | `10ad33e:	4c 8b bd 90 00 00 00 	mov    r15,QWORD PTR [rbp+0x90]` |
| `0x10ad352` | `10ad352:	49 89 28             	mov    QWORD PTR [r8],rbp` |
| `0x10ad3b6` | `10ad3b6:	4c 8b 7d 18          	mov    r15,QWORD PTR [rbp+0x18]` |
| `0x10ad3c7` | `10ad3c7:	49 89 28             	mov    QWORD PTR [r8],rbp` |
| `0x10ad42b` | `10ad42b:	4c 8b 7d 38          	mov    r15,QWORD PTR [rbp+0x38]` |
| `0x10ad43c` | `10ad43c:	49 89 28             	mov    QWORD PTR [r8],rbp` |
| `0x10ad4b7` | `10ad4b7:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp` |
| `0x10ad562` | `10ad562:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp` |
| `0x10ad66a` | `10ad66a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]` |
| `0x10ad66e` | `10ad66e:	48 89 ef             	mov    rdi,rbp` |
| `0x10ad6a4` | `10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp` |
| `0x10ad70e` | `10ad70e:	5d                   	pop    rbp` |
| `0x10ad804` | `10ad804:	48 89 ef             	mov    rdi,rbp` |
| `0x10ad892` | `10ad892:	49 89 ef             	mov    r15,rbp` |
| `0x10ad8da` | `10ad8da:	48 89 ef             	mov    rdi,rbp` |
| `0x10adb37` | `10adb37:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]` |
| `0x10adb3b` | `10adb3b:	48 89 ef             	mov    rdi,rbp` |

## Chronological combined event stream

| addr | instruction |
|---:|---|
| `0x10aba37` | `10aba37:	41 57                	push   r15` |
| `0x10aba54` | `10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx` |
| `0x10aba59` | `10aba59:	49 89 f7             	mov    r15,rsi` |
| `0x10aba8e` | `10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0x10abac1` | `10abac1:	e8 64 9c ab ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>` |
| `0x10abb14` | `10abb14:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abb1c` | `10abb1c:	e8 5d df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abb30` | `10abb30:	e8 49 df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abb3d` | `10abb3d:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abb4b` | `10abb4b:	e8 08 b9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abb66` | `10abb66:	e8 25 23 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abb9b` | `10abb9b:	e8 ee ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abba5` | `10abba5:	e8 3e fa 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abbae` | `10abbae:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abbb9` | `10abbb9:	e8 c0 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abbcd` | `10abbcd:	e8 ac de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abbda` | `10abbda:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abbe8` | `10abbe8:	e8 6b b8 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abbfc` | `10abbfc:	e8 8f 22 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abc2e` | `10abc2e:	e8 5b ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abc38` | `10abc38:	e8 ab f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abc48` | `10abc48:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abc50` | `10abc50:	e8 29 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abc64` | `10abc64:	e8 15 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abc71` | `10abc71:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abc7f` | `10abc7f:	e8 d4 b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abc93` | `10abc93:	e8 f8 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abcc5` | `10abcc5:	e8 c4 b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abccf` | `10abccf:	e8 14 f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abcdf` | `10abcdf:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abce7` | `10abce7:	e8 92 dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abcfb` | `10abcfb:	e8 7e dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abd08` | `10abd08:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abd16` | `10abd16:	e8 3d b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abd2a` | `10abd2a:	e8 61 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abd5c` | `10abd5c:	e8 2d b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abd66` | `10abd66:	e8 7d f8 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abd76` | `10abd76:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abd7e` | `10abd7e:	e8 fb dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abd92` | `10abd92:	e8 e7 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abd9f` | `10abd9f:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abdad` | `10abdad:	e8 a6 b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abdc1` | `10abdc1:	e8 ca 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abdf3` | `10abdf3:	e8 96 b8 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abdfd` | `10abdfd:	e8 e6 f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abe0d` | `10abe0d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abe15` | `10abe15:	e8 64 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abe29` | `10abe29:	e8 50 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abe36` | `10abe36:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abe44` | `10abe44:	e8 0f b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abe58` | `10abe58:	e8 33 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abe8a` | `10abe8a:	e8 ff b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abe94` | `10abe94:	e8 4f f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abea4` | `10abea4:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abeac` | `10abeac:	e8 cd db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abec0` | `10abec0:	e8 b9 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abecd` | `10abecd:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abedb` | `10abedb:	e8 78 b5 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abeef` | `10abeef:	e8 9c 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abf21` | `10abf21:	e8 68 b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abf2b` | `10abf2b:	e8 b8 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abf3b` | `10abf3b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abf43` | `10abf43:	e8 36 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abf57` | `10abf57:	e8 22 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abf64` | `10abf64:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abf72` | `10abf72:	e8 e1 b4 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abf8b` | `10abf8b:	e8 00 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abfc3` | `10abfc3:	e8 c6 b6 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abfcd` | `10abfcd:	e8 16 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abff8` | `10abff8:	e8 f5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac028` | `10ac028:	e8 c5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac03c` | `10ac03c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac044` | `10ac044:	e8 35 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac058` | `10ac058:	e8 21 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac065` | `10ac065:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10ac073` | `10ac073:	e8 e0 b3 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10ac087` | `10ac087:	e8 04 1e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac0bd` | `10ac0bd:	e8 cc b5 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10ac0c7` | `10ac0c7:	e8 1c f5 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10ac0f1` | `10ac0f1:	e8 fc b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac120` | `10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac12c` | `10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac134` | `10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0` |
| `0x10ac149` | `10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac159` | `10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>` |
| `0x10ac15e` | `10ac15e:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac180` | `10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10ac194` | `10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x10ac19c` | `10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ac1a1` | `10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac1b4` | `10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac1ba` | `10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac1bf` | `10ac1bf:	48 8d 0d 9a 20 7d 00 	lea    rcx,[rip+0x7d209a]        # 187e260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a948>` |
| `0x10ac1da` | `10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax` |
| `0x10ac1e6` | `10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac204` | `10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac216` | `10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac228` | `10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac230` | `10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac237` | `10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac23f` | `10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac249` | `10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac24e` | `10ac24e:	48 8d 0d b3 15 7a 00 	lea    rcx,[rip+0x7a15b3]        # 184d808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ef0>` |
| `0x10ac304` | `10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0x10ac327` | `10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac339` | `10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac350` | `10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac358` | `10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac365` | `10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac36d` | `10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac372` | `10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac37a` | `10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac380` | `10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ac383` | `10ac383:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac386` | `10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac389` | `10ac389:	49 89 c7             	mov    r15,rax` |
| `0x10ac391` | `10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac399` | `10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>` |
| `0x10ac3a7` | `10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15` |
| `0x10ac3ab` | `10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` |
| `0x10ac3b4` | `10ac3b4:	49 89 cf             	mov    r15,rcx` |
| `0x10ac3b7` | `10ac3b7:	e8 54 7d ab ff       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>` |
| `0x10ac3bc` | `10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax` |
| `0x10ac3c0` | `10ac3c0:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx` |
| `0x10ac3c4` | `10ac3c4:	41 c6 47 30 00       	mov    BYTE PTR [r15+0x30],0x0` |
| `0x10ac3c9` | `10ac3c9:	49 8d 7f 38          	lea    rdi,[r15+0x38]` |
| `0x10ac3cd` | `10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac3d1` | `10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac3d9` | `10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15` |
| `0x10ac3f5` | `10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ac3f8` | `10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac403` | `10ac403:	e8 22 19 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac408` | `10ac408:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac40c` | `10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac425` | `10ac425:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac42f` | `10ac42f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac437` | `10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac43a` | `10ac43a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac442` | `10ac442:	e8 e3 18 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac44a` | `10ac44a:	41 0f 11 47 68       	movups XMMWORD PTR [r15+0x68],xmm0` |
| `0x10ac44f` | `10ac44f:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0` |
| `0x10ac454` | `10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15` |
| `0x10ac459` | `10ac459:	41 c7 47 78 00 00 80 	mov    DWORD PTR [r15+0x78],0x3f800000` |
| `0x10ac463` | `10ac463:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac46b` | `10ac46b:	e8 c0 a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac473` | `10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac478` | `10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>` |
| `0x10ac47f` | `10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0x10ac499` | `10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac4ab` | `10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac4c2` | `10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac4ca` | `10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac4d7` | `10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac4df` | `10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac4e4` | `10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac4ec` | `10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac4f7` | `10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac4fc` | `10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>` |
| `0x10ac50a` | `10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]` |
| `0x10ac51b` | `10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac53f` | `10ac53f:	49 89 c7             	mov    r15,rax` |
| `0x10ac542` | `10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]` |
| `0x10ac545` | `10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac550` | `10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac555` | `10ac555:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac55c` | `10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]` |
| `0x10ac560` | `10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac57c` | `10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac584` | `10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac587` | `10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac58f` | `10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac597` | `10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0` |
| `0x10ac59c` | `10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0` |
| `0x10ac5a1` | `10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0` |
| `0x10ac5a8` | `10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al` |
| `0x10ac5ac` | `10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al` |
| `0x10ac5b0` | `10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al` |
| `0x10ac5b7` | `10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al` |
| `0x10ac5be` | `10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al` |
| `0x10ac5c5` | `10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al` |
| `0x10ac5cc` | `10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15` |
| `0x10ac5d1` | `10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al` |
| `0x10ac5da` | `10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac5e2` | `10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac5ea` | `10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac610` | `10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac622` | `10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac639` | `10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac641` | `10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac64e` | `10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac656` | `10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac66a` | `10ac66a:	e8 0f d4 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac688` | `10ac688:	e8 2d 0a a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>` |
| `0x10ac6ae` | `10ac6ae:	e8 77 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>` |
| `0x10ac6d4` | `10ac6d4:	e8 51 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>` |
| `0x10ac6d9` | `10ac6d9:	41 89 c7             	mov    r15d,eax` |
| `0x10ac6e1` | `10ac6e1:	e8 1a 18 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac6e9` | `10ac6e9:	49 63 c7             	movsxd rax,r15d` |
| `0x10ac6f7` | `10ac6f7:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]` |
| `0x10ac6ff` | `10ac6ff:	49 89 57 10          	mov    QWORD PTR [r15+0x10],rdx` |
| `0x10ac70b` | `10ac70b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0` |
| `0x10ac718` | `10ac718:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac75c` | `10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]` |
| `0x10ac764` | `10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]` |
| `0x10ac76d` | `10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0` |
| `0x10ac772` | `10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1` |
| `0x10ac785` | `10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>` |
| `0x10ac7a7` | `10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>` |
| `0x10ac7c0` | `10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10ac7c8` | `10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>` |
| `0x10ac7cd` | `10ac7cd:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac7d0` | `10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac7e8` | `10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac7f3` | `10ac7f3:	e8 98 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac800` | `10ac800:	e8 8b 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac812` | `10ac812:	e8 d1 b6 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>` |
| `0x10ac83b` | `10ac83b:	e8 6c c9 ac ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>` |
| `0x10ac870` | `10ac870:	e8 2b d2 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
| `0x10ac875` | `10ac875:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0` |
| `0x10ac88a` | `10ac88a:	e8 71 16 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac88f` | `10ac88f:	49 89 c7             	mov    r15,rax` |
| `0x10ac89d` | `10ac89d:	e8 fe d1 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
| `0x10ac8a2` | `10ac8a2:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac8aa` | `10ac8aa:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10ac8d7` | `10ac8d7:	e8 ac 4b 71 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>` |
| `0x10ac8df` | `10ac8df:	e8 ba a9 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0x10ac8ec` | `10ac8ec:	e8 3f 61 ae ff       	call   b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>` |
| `0x10ac8f4` | `10ac8f4:	e8 2d 42 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10ac901` | `10ac901:	e8 20 42 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10ac908` | `10ac908:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac910` | `10ac910:	e8 1b a4 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac92c` | `10ac92c:	e8 4d d1 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac94a` | `10ac94a:	e8 6b 07 a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>` |
| `0x10ac953` | `10ac953:	e8 14 99 df ff       	call   ea626c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d682>` |
| `0x10ac958` | `10ac958:	41 89 c7             	mov    r15d,eax` |
| `0x10ac95f` | `10ac95f:	e8 26 99 df ff       	call   ea628a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6a0>` |
| `0x10ac96b` | `10ac96b:	e8 90 15 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac973` | `10ac973:	4d 63 ef             	movsxd r13,r15d` |
| `0x10ac9a5` | `10ac9a5:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10ac9b9` | `10ac9b9:	4c 6b f8 3c          	imul   r15,rax,0x3c` |
| `0x10aca22` | `10aca22:	49 81 ff 11 0e 00 00 	cmp    r15,0xe11` |
| `0x10aca2e` | `10aca2e:	49 0f 4d c7          	cmovge rax,r15` |
| `0x10aca3a` | `10aca3a:	e8 87 3b 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>` |
| `0x10aca5c` | `10aca5c:	e8 61 4c 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>` |
| `0x10aca73` | `10aca73:	e8 16 b8 a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10aca9b` | `10aca9b:	e8 32 9e 72 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0x10acabf` | `10acabf:	4d 89 f8             	mov    r8,r15` |
| `0x10acac4` | `10acac4:	e8 09 9e 72 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0x10acac9` | `10acac9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10acad1` | `10acad1:	e8 66 11 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>` |
| `0x10acade` | `10acade:	e8 ad 13 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10acaf6` | `10acaf6:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10acb01` | `10acb01:	e8 8a 13 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10acb0e` | `10acb0e:	e8 7d 13 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10acb20` | `10acb20:	e8 c3 b3 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>` |
| `0x10acb44` | `10acb44:	e8 63 c6 ac ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>` |
| `0x10acb79` | `10acb79:	e8 22 cf ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
| `0x10acb7e` | `10acb7e:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0` |
| `0x10acb93` | `10acb93:	e8 68 13 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acb98` | `10acb98:	49 89 c7             	mov    r15,rax` |
| `0x10acba6` | `10acba6:	e8 f5 ce ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
| `0x10acbab` | `10acbab:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10acbb3` | `10acbb3:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10acbe0` | `10acbe0:	e8 a3 48 71 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>` |
| `0x10acbe8` | `10acbe8:	e8 b1 a6 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0x10acbf5` | `10acbf5:	e8 36 5e ae ff       	call   b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>` |
| `0x10acbfd` | `10acbfd:	e8 24 3f 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10acc0f` | `10acc0f:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0x10acc17` | `10acc17:	e8 e4 12 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acc4f` | `10acc4f:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15` |
| `0x10acc8c` | `10acc8c:	4c 8d bc 24 10 01 00 	lea    r15,[rsp+0x110]` |
| `0x10acc98` | `10acc98:	4c 89 ff             	mov    rdi,r15` |
| `0x10acc9d` | `10acc9d:	e8 f2 da 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10accbe` | `10accbe:	4c 89 fa             	mov    rdx,r15` |
| `0x10accc1` | `10accc1:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x10accca` | `10accca:	e8 6f cd 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>` |
| `0x10accd3` | `10accd3:	e8 ae 17 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10accd8` | `10accd8:	4c 89 ff             	mov    rdi,r15` |
| `0x10accdb` | `10accdb:	e8 08 db 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10acd30` | `10acd30:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10acd33` | `10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acd3b` | `10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acd4c` | `10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acd8c` | `10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10acda0` | `10acda0:	e8 dd 0e 00 00       	call   10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>` |
| `0x10acda8` | `10acda8:	e8 f5 0e 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>` |
| `0x10acdad` | `10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acdb5` | `10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdb8` | `10acdb8:	49 89 c7             	mov    r15,rax` |
| `0x10acdc6` | `10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdd1` | `10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acdee` | `10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15` |
| `0x10ace1a` | `10ace1a:	e8 e3 03 a1 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>` |
| `0x10ace31` | `10ace31:	e8 8c 48 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>` |
| `0x10ace4f` | `10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ace60` | `10ace60:	e8 2f d9 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ace65` | `10ace65:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ace73` | `10ace73:	4c 89 fe             	mov    rsi,r15` |
| `0x10ace79` | `10ace79:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x10ace91` | `10ace91:	e8 a8 cb 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>` |
| `0x10ace9a` | `10ace9a:	e8 e7 15 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ace9f` | `10ace9f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10acea7` | `10acea7:	e8 3c d9 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10aceb8` | `10aceb8:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]` |
| `0x10acec0` | `10acec0:	4c 89 ff             	mov    rdi,r15` |
| `0x10acec6` | `10acec6:	e8 df 0d 00 00       	call   10adcaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c0>` |
| `0x10acece` | `10acece:	e8 f7 0d 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>` |
| `0x10acedb` | `10acedb:	4d 8b 2f             	mov    r13,QWORD PTR [r15]` |
| `0x10acee1` | `10acee1:	e8 1a 10 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acefe` | `10acefe:	4d 89 f7             	mov    r15,r14` |
| `0x10acf01` | `10acf01:	49 83 c7 10          	add    r15,0x10` |
| `0x10acf17` | `10acf17:	4c 89 ff             	mov    rdi,r15` |
| `0x10acf1d` | `10acf1d:	e8 92 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>` |
| `0x10acf22` | `10acf22:	4c 89 ff             	mov    rdi,r15` |
| `0x10acf28` | `10acf28:	e8 87 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>` |
| `0x10acf32` | `10acf32:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10acf49` | `10acf49:	e8 84 0d 00 00       	call   10adcd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e8>` |
| `0x10acf51` | `10acf51:	e8 9c 0d 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>` |
| `0x10acf5e` | `10acf5e:	e8 c3 3b 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10acf88` | `10acf88:	e8 fd a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10acf8d` | `10acf8d:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al` |
| `0x10acfad` | `10acfad:	e8 d8 a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10acfd2` | `10acfd2:	e8 b3 a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10acff7` | `10acff7:	e8 8e a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10ad01b` | `10ad01b:	e8 6a a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10ad036` | `10ad036:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad048` | `10ad048:	e8 7b a4 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ad05a` | `10ad05a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad062` | `10ad062:	e8 e8 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ad069` | `10ad069:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad071` | `10ad071:	e8 ba 9c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad088` | `10ad088:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad09a` | `10ad09a:	e8 29 a4 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ad0ac` | `10ad0ac:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad0b4` | `10ad0b4:	e8 96 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ad0c7` | `10ad0c7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad0cf` | `10ad0cf:	e8 5c 9c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad0e6` | `10ad0e6:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad0f8` | `10ad0f8:	e8 cb a3 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ad10e` | `10ad10e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad116` | `10ad116:	e8 34 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ad129` | `10ad129:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad131` | `10ad131:	e8 fa 9b 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad136` | `10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ad153` | `10ad153:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0x10ad15b` | `10ad15b:	e8 a0 0d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad163` | `10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0x10ad18d` | `10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0x10ad1c6` | `10ad1c6:	e8 2b c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad1cf` | `10ad1cf:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15` |
| `0x10ad1dc` | `10ad1dc:	e8 15 c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad1ed` | `10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0x10ad29b` | `10ad29b:	e8 ee af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10ad2a7` | `10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0x10ad2ac` | `10ad2ac:	e8 dd af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10ad2bb` | `10ad2bb:	e8 36 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad2ca` | `10ad2ca:	e8 27 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad2d8` | `10ad2d8:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]` |
| `0x10ad2f5` | `10ad2f5:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad306` | `10ad306:	e8 89 d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad30b` | `10ad30b:	49 8b 37             	mov    rsi,QWORD PTR [r15]` |
| `0x10ad311` | `10ad311:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]` |
| `0x10ad319` | `10ad319:	4c 89 ff             	mov    rdi,r15` |
| `0x10ad31f` | `10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ad325` | `10ad325:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad328` | `10ad328:	e8 c5 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad32d` | `10ad32d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x10ad331` | `10ad331:	e8 50 11 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad339` | `10ad339:	e8 aa d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad33e` | `10ad33e:	4c 8b bd 90 00 00 00 	mov    r15,QWORD PTR [rbp+0x90]` |
| `0x10ad345` | `10ad345:	4d 85 ff             	test   r15,r15` |
| `0x10ad363` | `10ad363:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad374` | `10ad374:	e8 1b d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad379` | `10ad379:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ad384` | `10ad384:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad38a` | `10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10ad39b` | `10ad39b:	e8 52 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad3a4` | `10ad3a4:	e8 dd 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad3a9` | `10ad3a9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad3b1` | `10ad3b1:	e8 32 d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad3b6` | `10ad3b6:	4c 8b 7d 18          	mov    r15,QWORD PTR [rbp+0x18]` |
| `0x10ad3ba` | `10ad3ba:	4d 85 ff             	test   r15,r15` |
| `0x10ad3d8` | `10ad3d8:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad3e9` | `10ad3e9:	e8 a6 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad3ee` | `10ad3ee:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ad3f9` | `10ad3f9:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad3ff` | `10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad410` | `10ad410:	e8 dd c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad419` | `10ad419:	e8 68 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad41e` | `10ad41e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad426` | `10ad426:	e8 bd d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad42b` | `10ad42b:	4c 8b 7d 38          	mov    r15,QWORD PTR [rbp+0x38]` |
| `0x10ad42f` | `10ad42f:	4d 85 ff             	test   r15,r15` |
| `0x10ad44d` | `10ad44d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad45e` | `10ad45e:	e8 31 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad463` | `10ad463:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ad46e` | `10ad46e:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad474` | `10ad474:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad487` | `10ad487:	e8 66 c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad490` | `10ad490:	e8 f1 0f 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad495` | `10ad495:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad49d` | `10ad49d:	e8 46 d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad4a5` | `10ad4a5:	e8 56 0a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad502` | `10ad502:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad514` | `10ad514:	e8 af 9f 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ad526` | `10ad526:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad52e` | `10ad52e:	e8 1c e3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ad537` | `10ad537:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad53f` | `10ad53f:	e8 ec 97 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad547` | `10ad547:	e8 b4 09 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad568` | `10ad568:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad570` | `10ad570:	e8 bb 97 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad57c` | `10ad57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ad5a2` | `10ad5a2:	4c 8b bc 24 80 00 00 	mov    r15,QWORD PTR [rsp+0x80]` |
| `0x10ad5aa` | `10ad5aa:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ad5b5` | `10ad5b5:	4c 89 fe             	mov    rsi,r15` |
| `0x10ad5b8` | `10ad5b8:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad5df` | `10ad5df:	e8 a2 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad5e8` | `10ad5e8:	e8 99 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad5ed` | `10ad5ed:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ad5f8` | `10ad5f8:	e8 fd 06 00 00       	call   10adcfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275110>` |
| `0x10ad5fd` | `10ad5fd:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10ad617` | `10ad617:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]` |
| `0x10ad61f` | `10ad61f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ad62a` | `10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad64b` | `10ad64b:	e8 36 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad658` | `10ad658:	e8 29 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad65d` | `10ad65d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad665` | `10ad665:	e8 c0 06 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad671` | `10ad671:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]` |
| `0x10ad676` | `10ad676:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]` |
| `0x10ad682` | `10ad682:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10ad688` | `10ad688:	e8 73 08 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad69b` | `10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]` |
| `0x10ad6b5` | `10ad6b5:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]` |
| `0x10ad6e4` | `10ad6e4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ad70c` | `10ad70c:	41 5f                	pop    r15` |
| `0x10ad73f` | `10ad73f:	e8 4c 07 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad749` | `10ad749:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad751` | `10ad751:	e8 d4 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad756` | `10ad756:	4d 89 fe             	mov    r14,r15` |
| `0x10ad759` | `10ad759:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]` |
| `0x10ad75d` | `10ad75d:	e8 24 0d 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad76c` | `10ad76c:	4d 89 fe             	mov    r14,r15` |
| `0x10ad772` | `10ad772:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad77a` | `10ad77a:	e8 ab 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad782` | `10ad782:	e8 99 07 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad794` | `10ad794:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad79c` | `10ad79c:	e8 89 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad7a1` | `10ad7a1:	4d 89 fe             	mov    r14,r15` |
| `0x10ad7a4` | `10ad7a4:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0x10ad7a8` | `10ad7a8:	e8 d9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad7af` | `10ad7af:	4d 89 fe             	mov    r14,r15` |
| `0x10ad7b5` | `10ad7b5:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad7bd` | `10ad7bd:	e8 68 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad7c5` | `10ad7c5:	e8 56 07 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad7d8` | `10ad7d8:	e8 a9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad7dd` | `10ad7dd:	4c 89 ff             	mov    rdi,r15` |
| `0x10ad7e0` | `10ad7e0:	e8 17 1e 9f ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>` |
| `0x10ad7ef` | `10ad7ef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad7f7` | `10ad7f7:	e8 ec cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad7ff` | `10ad7ff:	e8 42 3f 71 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>` |
| `0x10ad807` | `10ad807:	e8 5a c6 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>` |
| `0x10ad80f` | `10ad80f:	e8 1c 0c 00 00       	call   10ae430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275846>` |
| `0x10ad817` | `10ad817:	e8 04 07 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad82b` | `10ad82b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad833` | `10ad833:	e8 66 9a 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0x10ad83b` | `10ad83b:	e8 65 c2 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x10ad843` | `10ad843:	e8 5d c2 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x10ad85d` | `10ad85d:	e8 2e 06 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad86f` | `10ad86f:	e8 1c 06 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad885` | `10ad885:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad88d` | `10ad88d:	e8 56 cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad892` | `10ad892:	49 89 ef             	mov    r15,rbp` |
| `0x10ad895` | `10ad895:	49 81 c7 a0 00 00 00 	add    r15,0xa0` |
| `0x10ad89f` | `10ad89f:	e8 30 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10ad8a7` | `10ad8a7:	e8 28 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10ad8ac` | `10ad8ac:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ad8b1` | `10ad8b1:	e8 b0 c5 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>` |
| `0x10ad8bb` | `10ad8bb:	e8 a6 c5 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>` |
| `0x10ad8c0` | `10ad8c0:	4c 89 ff             	mov    rdi,r15` |
| `0x10ad8c3` | `10ad8c3:	e8 8e ce 00 00       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>` |
| `0x10ad8cd` | `10ad8cd:	e8 02 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10ad8d5` | `10ad8d5:	e8 fa c2 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10ad8dd` | `10ad8dd:	e8 3e 06 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad903` | `10ad903:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad90b` | `10ad90b:	e8 1a 04 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad918` | `10ad918:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad920` | `10ad920:	e8 d5 03 00 00       	call   10adcfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275110>` |
| `0x10ad952` | `10ad952:	e8 c9 05 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad95c` | `10ad95c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad964` | `10ad964:	e8 e9 42 d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ad96c` | `10ad96c:	e8 af 05 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad989` | `10ad989:	e8 02 05 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad9b4` | `10ad9b4:	e8 d7 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad9df` | `10ad9df:	e8 ac 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ada0a` | `10ada0a:	e8 81 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ada35` | `10ada35:	e8 56 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ada60` | `10ada60:	e8 2b 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ada88` | `10ada88:	e8 03 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10adab0` | `10adab0:	e8 db 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10adad8` | `10adad8:	e8 b3 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10adaef` | `10adaef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10adaf7` | `10adaf7:	e8 94 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10adb11` | `10adb11:	e8 10 30 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10adb2b` | `10adb2b:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10adb34` | `10adb34:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10adb3e` | `10adb3e:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]` |
| `0x10adb4c` | `10adb4c:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10adb4f` | `10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]` |
| `0x10adb57` | `10adb57:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10adb5a` | `10adb5a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]` |
| `0x10adb62` | `10adb62:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10adb65` | `10adb65:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]` |
| `0x10adb70` | `10adb70:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x10adb80` | `10adb80:	e8 6d 01 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>` |
| `0x10adb8d` | `10adb8d:	e8 38 01 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>` |
| `0x10adb97` | `10adb97:	e8 06 01 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>` |
| `0x10adba1` | `10adba1:	e8 82 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>` |
| `0x10adbab` | `10adbab:	e8 78 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>` |
| ... | truncated 16 more |

