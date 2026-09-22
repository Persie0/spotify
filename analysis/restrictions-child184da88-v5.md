# Restrictions child AP `0x184da88` / getter `b411a4` trace

Parallel v5 report. Focus: exact child AP/interface that exposes `b411a4`, plus relation to service AP `0x184ca90` and installed AP `0x184d898`.

## Getter `b411a4` window

```text
  b4116f:	41 5f                	pop    r15
  b41171:	ff e0                	jmp    rax
  b41173:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b4117a:	00 00
  b4117c:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  b41181:	75 0a                	jne    b4118d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e12d>
  b41183:	48 83 c4 20          	add    rsp,0x20
  b41187:	5b                   	pop    rbx
  b41188:	41 5e                	pop    r14
  b4118a:	41 5f                	pop    r15
  b4118c:	c3                   	ret
  b4118d:	e8 1e e9 ca 00       	call   17efab0 <__stack_chk_fail@plt>
  b41192:	53                   	push   rbx
  b41193:	48 89 fb             	mov    rbx,rdi
  b41196:	e8 55 ff ff ff       	call   b410f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e090>
  b4119b:	48 89 df             	mov    rdi,rbx
  b4119e:	5b                   	pop    rbx
  b4119f:	e9 7c cd ca 00       	jmp    17edf20 <_ZdlPv@plt>
  b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  b411a8:	c3                   	ret
  b411a9:	cc                   	int3
  b411aa:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  b411ae:	48 83 c0 20          	add    rax,0x20
  b411b2:	c3                   	ret
  b411b3:	cc                   	int3
  b411b4:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  b411b8:	e9 33 ff ff ff       	jmp    b410f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e090>
  b411bd:	cc                   	int3
  b411be:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  b411c2:	e9 cb ff ff ff       	jmp    b41192 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e132>
  b411c7:	50                   	push   rax
  b411c8:	48 8b 05 81 2c ea 00 	mov    rax,QWORD PTR [rip+0xea2c81]        # 19e3e50 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x880>
  b411cf:	48 85 c0             	test   rax,rax
  b411d2:	74 1d                	je     b411f1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e191>
  b411d4:	48 89 f2             	mov    rdx,rsi
  b411d7:	48 89 fe             	mov    rsi,rdi
  b411da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  b411dd:	e8 8a 66 c8 00       	call   17c786c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b9d8>
  b411e2:	48 85 c0             	test   rax,rax
  b411e5:	74 0f                	je     b411f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e196>
  b411e7:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  b411ea:	48 89 c7             	mov    rdi,rax
  b411ed:	58                   	pop    rax
  b411ee:	ff 61 10             	jmp    QWORD PTR [rcx+0x10]
  b411f1:	e8 c9 8d f3 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b411f6:	e8 c4 8d f3 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b411fb:	cc                   	int3
  b411fc:	85 ff                	test   edi,edi
  b411fe:	74 11                	je     b41211 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e1b1>
  b41200:	83 ff 01             	cmp    edi,0x1
  b41203:	75 17                	jne    b4121c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e1bc>
  b41205:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  b41208:	48 89 06             	mov    QWORD PTR [rsi],rax
  b4120b:	48 83 22 00          	and    QWORD PTR [rdx],0x0
  b4120f:	eb 03                	jmp    b41214 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e1b4>
  b41211:	48 89 f2             	mov    rdx,rsi
  b41214:	48 89 d7             	mov    rdi,rdx
  b41217:	e9 1c a2 f5 ff       	jmp    a9b438 <JNI_OnUnload@@Base+0x22d05>
  b4121c:	c3                   	ret
  b4121d:	cc                   	int3
  b4121e:	e9 01 00 00 00       	jmp    b41224 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e1c4>
  b41223:	cc                   	int3
  b41224:	41 56                	push   r14
  b41226:	53                   	push   rbx
  b41227:	50                   	push   rax
  b41228:	49 89 fe             	mov    r14,rdi
  b4122b:	e8 64 38 c9 00       	call   17d4a94 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x8b5>
  b41230:	48 89 c3             	mov    rbx,rax
  b41233:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  b41236:	48 8b 15 2b 2c ea 00 	mov    rdx,QWORD PTR [rip+0xea2c2b]        # 19e3e68 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x898>
  b4123d:	48 89 c7             	mov    rdi,rax
  b41240:	31 c0                	xor    eax,eax
  b41242:	e8 dd b9 f5 ff       	call   a9cc24 <JNI_OnUnload@@Base+0x244f1>
```
## Text xrefs mentioning `184da88`

| addr | instruction |
|---:|---|
| `0x10ad68d` | `10ad68d:	48 8d 0d f4 03 7a 00 	lea    rcx,[rip+0x7a03f4]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>` |
| `0x10c09ca` | `10c09ca:	48 8d 05 b7 d0 78 00 	lea    rax,[rip+0x78d0b7]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>` |

## Text xrefs mentioning `184ca90`

| addr | instruction |
|---:|---|
| `0x10aba74` | `10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>` |
| `0x10ae15a` | `10ae15a:	48 8d 05 2f e9 79 00 	lea    rax,[rip+0x79e92f]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>` |

## Text xrefs mentioning `b411a4`

| addr | instruction |
|---:|---|
| `0xb411a4` | `b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |

## Text xrefs mentioning `184d898`

| addr | instruction |
|---:|---|
| `0x10ac180` | `10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10bff2c` | `10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |

## Raw data bytes around child AP `0x184da88`

```text
liborbit-jni-spotify.so:     file format elf64-x86-64

Contents of section .data.rel.ro:
 184da88 00000000 00000000 00000000 00000000  ................
 184da98 00000000 00000000 00000000 00000000  ................
 184daa8 00000000 00000000 00000000 00000000  ................
 184dab8 00000000 00000000 00000000 00000000  ................
 184dac8 00000000 00000000 00000000 00000000  ................
 184dad8 00000000 00000000 00000000 00000000  ................
 184dae8 00000000 00000000 00000000 00000000  ................
 184daf8 00000000 00000000 00000000 00000000  ................
 184db08 00000000 00000000 00000000 00000000  ................
 184db18 00000000 00000000 00000000 00000000  ................
 184db28 00000000 00000000 f8ffffff ffffffff  ................
 184db38 00000000 00000000 00000000 00000000  ................
 184db48 00000000 00000000 00000000 00000000  ................
 184db58 00000000 00000000                    ........
```
## Relocations around child AP `0x184da88`

```text
000000000184da88  0000000000000008 R_X86_64_RELATIVE                         10c09c6
000000000184da90  0000000000000008 R_X86_64_RELATIVE                         10c0a66
000000000184da98  0000000000000008 R_X86_64_RELATIVE                         e750be
000000000184daa0  0000000000000008 R_X86_64_RELATIVE                         a55cb0
000000000184daa8  0000000000000008 R_X86_64_RELATIVE                         a7a004
000000000184dab0  0000000000000008 R_X86_64_RELATIVE                         aa7024
000000000184dab8  0000000000000008 R_X86_64_RELATIVE                         bf7896
000000000184dac0  0000000000000008 R_X86_64_RELATIVE                         b411a4
000000000184dac8  0000000000000008 R_X86_64_RELATIVE                         b04950
000000000184dad0  0000000000000008 R_X86_64_RELATIVE                         aa7012
000000000184dae8  0000000000000008 R_X86_64_RELATIVE                         10c0a78
000000000184daf0  0000000000000008 R_X86_64_RELATIVE                         10c0a92
000000000184daf8  0000000000000008 R_X86_64_RELATIVE                         10c0aa4
000000000184db00  0000000000000008 R_X86_64_RELATIVE                         10c0b66
000000000184db08  0000000000000008 R_X86_64_RELATIVE                         10c0bae
000000000184db10  0000000000000008 R_X86_64_RELATIVE                         10c0bf2
000000000184db18  0000000000000008 R_X86_64_RELATIVE                         10c0c3a
000000000184db20  0000000000000008 R_X86_64_RELATIVE                         10c0c7a
000000000184db28  0000000000000008 R_X86_64_RELATIVE                         10c0cba
000000000184db40  0000000000000008 R_X86_64_RELATIVE                         10c0ce6
000000000184db48  0000000000000008 R_X86_64_RELATIVE                         10c0cf0
000000000184db50  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000184db58  0000000000000008 R_X86_64_RELATIVE                         9d7de0
```
