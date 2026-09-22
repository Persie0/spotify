# Restrictions installed `this+0x18` object / AP `0x184d898` trace

Parallel v5 report. Focus: the `0x28` object installed into `this+0x18` at `10ac1a9`, whose first word is AP/literal `0x184d898`.

## Install window around `10ac1a9`

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
 10ac262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
 10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10ac26e:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10ac272:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac276:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
 10ac27a:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0
 10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0
 10ac282:	48 8d 0d 57 26 76 00 	lea    rcx,[rip+0x762657]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx
 10ac290:	48 8b 0d 09 58 80 00 	mov    rcx,QWORD PTR [rip+0x805809]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
 10ac297:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx
 10ac29e:	48 89 90 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],rdx
 10ac2a5:	48 89 c2             	mov    rdx,rax
 10ac2a8:	48 81 c2 c0 00 00 00 	add    rdx,0xc0
 10ac2af:	48 8d 0d 2a 26 76 00 	lea    rcx,[rip+0x76262a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac2b6:	48 89 88 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],rcx
 10ac2bd:	48 8b 0d e4 57 80 00 	mov    rcx,QWORD PTR [rip+0x8057e4]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
 10ac2c4:	48 89 88 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],rcx
 10ac2cb:	48 89 90 e0 00 00 00 	mov    QWORD PTR [rax+0xe0],rdx
 10ac2d2:	0f 29 80 f0 00 00 00 	movaps XMMWORD PTR [rax+0xf0],xmm0
 10ac2d9:	0f 29 80 00 01 00 00 	movaps XMMWORD PTR [rax+0x100],xmm0
 10ac2e0:	0f 29 80 10 01 00 00 	movaps XMMWORD PTR [rax+0x110],xmm0
 10ac2e7:	0f 11 80 19 01 00 00 	movups XMMWORD PTR [rax+0x119],xmm0
 10ac2ee:	4c 89 a8 30 01 00 00 	mov    QWORD PTR [rax+0x130],r13
 10ac2f5:	48 8b 8c 24 a0 01 00 	mov    rcx,QWORD PTR [rsp+0x1a0]
 10ac2fc:	00
 10ac2fd:	48 89 88 38 01 00 00 	mov    QWORD PTR [rax+0x138],rcx
 10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10ac309:	40 88 a8 40 01 00 00 	mov    BYTE PTR [rax+0x140],bpl
 10ac310:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10ac315:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac319:	48 8d 15 00 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b100]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
 10ac320:	4c 8d 05 19 b1 32 ff 	lea    r8,[rip+0xffffffffff32b119]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac32e:	00
 10ac32f:	6a 11                	push   0x11
 10ac331:	59                   	pop    rcx
 10ac332:	6a 20                	push   0x20
 10ac334:	41 59                	pop    r9
```
## Text xrefs mentioning `0x184d898`

| addr | instruction |
|---:|---|
| `0x10ac180` | `10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10bff2c` | `10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |

## Raw data bytes around `0x184d898`

```text
liborbit-jni-spotify.so:     file format elf64-x86-64

Contents of section .data.rel.ro:
 184d898 00000000 00000000 00000000 00000000  ................
 184d8a8 00000000 00000000 00000000 00000000  ................
 184d8b8 00000000 00000000 00000000 00000000  ................
 184d8c8 00000000 00000000 00000000 00000000  ................
 184d8d8 00000000 00000000 00000000 00000000  ................
 184d8e8 00000000 00000000 00000000 00000000  ................
 184d8f8 00000000 00000000 00000000 00000000  ................
 184d908 00000000 00000000 00000000 00000000  ................
 184d918 00000000 00000000 00000000 00000000  ................
 184d928 00000000 00000000 00000000 00000000  ................
 184d938 00000000 00000000 00000000 00000000  ................
 184d948 00000000 00000000 00000000 00000000  ................
 184d958 00000000 00000000 00000000 00000000  ................
 184d968 00000000 00000000 00000000 00000000  ................
 184d978 00000000 00000000 00000000 00000000  ................
 184d988 00000000 00000000 00000000 00000000  ................
 184d998 00000000 00000000 00000000 00000000  ................
 184d9a8 00000000 00000000 00000000 00000000  ................
 184d9b8 00000000 00000000 00000000 00000000  ................
 184d9c8 00000000 00000000 00000000 00000000  ................
 184d9d8 00000000 00000000 00000000 00000000  ................
 184d9e8 00000000 00000000 00000000 00000000  ................
 184d9f8 00000000 00000000 00000000 00000000  ................
 184da08 00000000 00000000 00000000 00000000  ................
 184da18 00000000 00000000 00000000 00000000  ................
 184da28 00000000 00000000 00000000 00000000  ................
 184da38 00000000 00000000 00000000 00000000  ................
 184da48 00000000 00000000 00000000 00000000  ................
 184da58 00000000 00000000                    ........
```
## Relocations around `0x184d898`

```text
000000000184d898  0000000000000008 R_X86_64_RELATIVE                         10bff2c
000000000184d8a0  0000000000000008 R_X86_64_RELATIVE                         10bff40
000000000184d8a8  0000000000000008 R_X86_64_RELATIVE                         10bff52
000000000184d8b0  0000000000000008 R_X86_64_RELATIVE                         10bffde
000000000184d8c8  0000000000000008 R_X86_64_RELATIVE                         abfe12
000000000184d8d0  0000000000000008 R_X86_64_RELATIVE                         abfe54
000000000184d8d8  0000000000000008 R_X86_64_RELATIVE                         174ec6a
000000000184d8e0  0000000000000008 R_X86_64_RELATIVE                         174f1dc
000000000184d8e8  0000000000000008 R_X86_64_RELATIVE                         10c01f4
000000000184d8f0  0000000000000008 R_X86_64_RELATIVE                         174ef82
000000000184d908  0000000000000008 R_X86_64_RELATIVE                         10c0192
000000000184d910  0000000000000008 R_X86_64_RELATIVE                         10c01c8
000000000184d918  0000000000000008 R_X86_64_RELATIVE                         174ec6a
000000000184d920  0000000000000008 R_X86_64_RELATIVE                         174f1dc
000000000184d928  0000000000000008 R_X86_64_RELATIVE                         10c01da
000000000184d930  0000000000000008 R_X86_64_RELATIVE                         174ef82
000000000184d948  0000000000000008 R_X86_64_RELATIVE                         10c00bc
000000000184d950  0000000000000008 R_X86_64_RELATIVE                         10c00e4
000000000184d958  0000000000000008 R_X86_64_RELATIVE                         174ec6a
000000000184d960  0000000000000008 R_X86_64_RELATIVE                         174f1dc
000000000184d968  0000000000000008 R_X86_64_RELATIVE                         10c00f6
000000000184d970  0000000000000008 R_X86_64_RELATIVE                         174ef82
000000000184d980  0000000000000008 R_X86_64_RELATIVE                         18f9058
000000000184d988  0000000000000008 R_X86_64_RELATIVE                         18f9080
000000000184d990  0000000000000008 R_X86_64_RELATIVE                         18f90e0
000000000184d9a8  0000000000000008 R_X86_64_RELATIVE                         10c0806
000000000184d9b0  0000000000000008 R_X86_64_RELATIVE                         10c0854
000000000184d9b8  0000000000000008 R_X86_64_RELATIVE                         10c086a
000000000184d9c0  0000000000000008 R_X86_64_RELATIVE                         1066da0
000000000184d9c8  0000000000000008 R_X86_64_RELATIVE                         10c0872
000000000184d9d0  0000000000000008 R_X86_64_RELATIVE                         10c0902
000000000184d9d8  0000000000000008 R_X86_64_RELATIVE                         10c094a
000000000184d9e0  0000000000000008 R_X86_64_RELATIVE                         10c0962
000000000184d9e8  0000000000000008 R_X86_64_RELATIVE                         10c09ae
000000000184da00  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000184da08  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000184da10  0000000000000008 R_X86_64_RELATIVE                         aeb7c0
000000000184da18  0000000000000008 R_X86_64_RELATIVE                         10c0712
000000000184da30  0000000000000008 R_X86_64_RELATIVE                         9d81d0
000000000184da38  0000000000000008 R_X86_64_RELATIVE                         c3aab8
000000000184da40  0000000000000008 R_X86_64_RELATIVE                         10c09c0
000000000184da48  0000000000000008 R_X86_64_RELATIVE                         9d81d0
000000000184da50  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000184da58  0000000000000008 R_X86_64_RELATIVE                         9d7de0
```
## Chronological installed-object and late-use signals

| addr | instruction |
|---:|---|
| `0x10ac1a1` | `10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac1a9` | `10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac1e6` | `10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac37a` | `10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac386` | `10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac4ec` | `10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acc07` | `10acc07:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10acc4b` | `10acc4b:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10acccf` | `10acccf:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0x10acd3b` | `10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acd46` | `10acd46:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10acd6a` | `10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx` |
| `0x10acd6e` | `10acd6e:	48 8b 9c 24 e8 01 00 	mov    rbx,QWORD PTR [rsp+0x1e8]` |
| `0x10acd76` | `10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx` |
| `0x10acdb5` | `10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdc6` | `10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdf6` | `10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10ace4f` | `10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ace5b` | `10ace5b:	48 89 df             	mov    rdi,rbx` |
| `0x10ace76` | `10ace76:	48 89 d9             	mov    rcx,rbx` |
| `0x10ace86` | `10ace86:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]` |
| `0x10ace8e` | `10ace8e:	48 89 de             	mov    rsi,rbx` |
| `0x10ace96` | `10ace96:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10aceac` | `10aceac:	48 8d 9c 24 b8 00 00 	lea    rbx,[rsp+0xb8]` |
| `0x10aceb4` | `10aceb4:	48 83 23 00          	and    QWORD PTR [rbx],0x0` |
| `0x10acecb` | `10acecb:	48 89 df             	mov    rdi,rbx` |
| `0x10acf32` | `10acf32:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10acf3a` | `10acf3a:	48 83 23 00          	and    QWORD PTR [rbx],0x0` |
| `0x10acf4e` | `10acf4e:	48 89 df             	mov    rdi,rbx` |
| `0x10ad036` | `10ad036:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad045` | `10ad045:	48 89 df             	mov    rdi,rbx` |
| `0x10ad04d` | `10ad04d:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0` |
| `0x10ad088` | `10ad088:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad097` | `10ad097:	48 89 df             	mov    rdi,rbx` |
| `0x10ad09f` | `10ad09f:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0` |
| `0x10ad0e6` | `10ad0e6:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad0f5` | `10ad0f5:	48 89 df             	mov    rdi,rbx` |
| `0x10ad0fd` | `10ad0fd:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0` |
| `0x10ad136` | `10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ad13b` | `10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10ad19e` | `10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>` |
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

