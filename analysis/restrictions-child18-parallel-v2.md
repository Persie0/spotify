# Restrictions child+0x18 / b411a4 parallel trace v2

Rebased combined run for the direct child/service side while constructor-tail wrapper tracing runs.

## `0xb411a4` — b411a4 returns [child+0x18]

```text
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
  b41247:	48 89 df             	mov    rdi,rbx
  b4124a:	48 83 c4 08          	add    rsp,0x8
  b4124e:	5b                   	pop    rbx
  b4124f:	41 5e                	pop    r14
  b41251:	e9 92 39 c9 00       	jmp    17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
  b41256:	48 89 c7             	mov    rdi,rax
  b41259:	e8 47 88 f3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b4125e:	50                   	push   rax
  b4125f:	48 8b 05 f2 2b ea 00 	mov    rax,QWORD PTR [rip+0xea2bf2]        # 19e3e58 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x888>
  b41266:	48 85 c0             	test   rax,rax
  b41269:	74 26                	je     b41291 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e231>
  b4126b:	48 89 f2             	mov    rdx,rsi
  b4126e:	48 89 fe             	mov    rsi,rdi
  b41271:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  b41274:	e8 f3 65 c8 00       	call   17c786c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b9d8>
  b41279:	48 85 c0             	test   rax,rax
  b4127c:	74 18                	je     b41296 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e236>
  b4127e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  b41281:	48 89 c7             	mov    rdi,rax
  b41284:	ff 51 10             	call   QWORD PTR [rcx+0x10]
  b41287:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  b4128a:	48 89 c7             	mov    rdi,rax
  b4128d:	58                   	pop    rax
  b4128e:	ff 61 28             	jmp    QWORD PTR [rcx+0x28]
  b41291:	e8 29 8d f3 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b41296:	e8 24 8d f3 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b4129b:	50                   	push   rax
  b4129c:	e8 0b 00 00 00       	call   b412ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e24c>
  b412a1:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  b412a4:	48 89 c7             	mov    rdi,rax
  b412a7:	58                   	pop    rax
  b412a8:	ff 61 10             	jmp    QWORD PTR [rcx+0x10]
  b412ab:	cc                   	int3
  b412ac:	50                   	push   rax
  b412ad:	48 8b 05 bc 2b ea 00 	mov    rax,QWORD PTR [rip+0xea2bbc]        # 19e3e70 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x8a0>
```
## `0x184da88` — child AP/literal

```text
 17f0d80:	ff 25 3a 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d3a]        # 18b3ac0 <exp2@LIBC>
 17f0d86:	68 f3 02 00 00       	push   0x2f3
 17f0d8b:	e9 b0 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0d90:	ff 25 32 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d32]        # 18b3ac8 <dl_iterate_phdr@LIBC>
 17f0d96:	68 f4 02 00 00       	push   0x2f4
 17f0d9b:	e9 a0 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0da0:	ff 25 2a 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d2a]        # 18b3ad0 <pthread_rwlock_unlock@LIBC>
 17f0da6:	68 f5 02 00 00       	push   0x2f5
 17f0dab:	e9 90 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0db0:	ff 25 22 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d22]        # 18b3ad8 <pthread_rwlock_rdlock@LIBC>
 17f0db6:	68 f6 02 00 00       	push   0x2f6
 17f0dbb:	e9 80 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0dc0:	ff 25 1a 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d1a]        # 18b3ae0 <pthread_rwlock_wrlock@LIBC>
 17f0dc6:	68 f7 02 00 00       	push   0x2f7
 17f0dcb:	e9 70 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
```
## `0x184ca90` — service AP/literal

```text
 17f0d80:	ff 25 3a 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d3a]        # 18b3ac0 <exp2@LIBC>
 17f0d86:	68 f3 02 00 00       	push   0x2f3
 17f0d8b:	e9 b0 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0d90:	ff 25 32 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d32]        # 18b3ac8 <dl_iterate_phdr@LIBC>
 17f0d96:	68 f4 02 00 00       	push   0x2f4
 17f0d9b:	e9 a0 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0da0:	ff 25 2a 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d2a]        # 18b3ad0 <pthread_rwlock_unlock@LIBC>
 17f0da6:	68 f5 02 00 00       	push   0x2f5
 17f0dab:	e9 90 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0db0:	ff 25 22 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d22]        # 18b3ad8 <pthread_rwlock_rdlock@LIBC>
 17f0db6:	68 f6 02 00 00       	push   0x2f6
 17f0dbb:	e9 80 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0dc0:	ff 25 1a 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d1a]        # 18b3ae0 <pthread_rwlock_wrlock@LIBC>
 17f0dc6:	68 f7 02 00 00       	push   0x2f7
 17f0dcb:	e9 70 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
```
## `0x10aba36` — constructor

```text
 10ab9fe:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10aba05:	00
 10aba06:	e8 7b 2a 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10aba0b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 10aba10:	e8 7b 24 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10aba15:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba1c:	00 00
 10aba1e:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
 10aba25:	00
 10aba26:	75 08                	jne    10aba30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e46>
 10aba28:	4c 89 f7             	mov    rdi,r14
 10aba2b:	e8 a0 42 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10aba30:	e8 7b 40 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10aba35:	cc                   	int3
 10aba36:	55                   	push   rbp
 10aba37:	41 57                	push   r15
 10aba39:	41 56                	push   r14
 10aba3b:	41 55                	push   r13
 10aba3d:	41 54                	push   r12
 10aba3f:	53                   	push   rbx
 10aba40:	48 81 ec 58 01 00 00 	sub    rsp,0x158
 10aba47:	4c 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],r9
 10aba4c:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
 10aba51:	48 89 cd             	mov    rbp,rcx
 10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx
 10aba59:	49 89 f7             	mov    r15,rsi
 10aba5c:	48 89 fb             	mov    rbx,rdi
 10aba5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba66:	00 00
 10aba68:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
 10aba6f:	00
 10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
 10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax
 10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]
 10aba82:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 10aba89:	00
 10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]
 10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10aba93:	48 8d 47 40          	lea    rax,[rdi+0x40]
 10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10aba9c:	48 83 c7 48          	add    rdi,0x48
 10abaa0:	0f 57 c0             	xorps  xmm0,xmm0
 10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
 10abaaf:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
 10abab4:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 10abab9:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
 10abac0:	00
 10abac1:	e8 64 9c ab ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 10abac6:	48 8d 43 58          	lea    rax,[rbx+0x58]
 10abaca:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10abacf:	48 8d 43 60          	lea    rax,[rbx+0x60]
 10abad3:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 10abad8:	48 8d 43 68          	lea    rax,[rbx+0x68]
 10abadc:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10abae1:	48 8d 43 70          	lea    rax,[rbx+0x70]
 10abae5:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 10abaec:	00
 10abaed:	48 8d 43 78          	lea    rax,[rbx+0x78]
 10abaf1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 10abaf8:	00
 10abaf9:	0f 57 c0             	xorps  xmm0,xmm0
 10abafc:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
 10abb00:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
 10abb04:	48 83 63 78 00       	and    QWORD PTR [rbx+0x78],0x0
 10abb09:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abb0d:	48 8d 35 fc b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8fc]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abb14:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abb1b:	00
 10abb1c:	e8 5d df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abb21:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abb28:	00
 10abb29:	48 8d 35 7b cd 32 ff 	lea    rsi,[rip+0xffffffffff32cd7b]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abb30:	e8 49 df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abb35:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abb3c:	00
 10abb3d:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abb44:	00
 10abb45:	6a 02                	push   0x2
 10abb47:	5a                   	pop    rdx
 10abb48:	4c 89 e7             	mov    rdi,r12
 10abb4b:	e8 08 b9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abb50:	8a 9c 24 d0 01 00 00 	mov    bl,BYTE PTR [rsp+0x1d0]
 10abb57:	6a 18                	push   0x18
 10abb59:	41 5d                	pop    r13
 10abb5b:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abb5f:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abb66:	e8 25 23 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abb6b:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abb6f:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abb73:	75 e6                	jne    10abb5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272f71>
 10abb75:	48 8d 35 a4 b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8a4]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
 10abb7c:	48 8d 0d bd b8 32 ff 	lea    rcx,[rip+0xffffffffff32b8bd]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10abb83:	4c 8d 2d 86 b8 32 ff 	lea    r13,[rip+0xffffffffff32b886]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abb8a:	6a 11                	push   0x11
 10abb8c:	5a                   	pop    rdx
 10abb8d:	6a 20                	push   0x20
 10abb8f:	41 58                	pop    r8
 10abb91:	4c 89 f7             	mov    rdi,r14
 10abb94:	4d 89 e9             	mov    r9,r13
 10abb97:	41 54                	push   r12
 10abb99:	6a 08                	push   0x8
```
## `0x10ab97f` — factory call into constructor

```text
 10ab953:	41 56                	push   r14
 10ab955:	41 55                	push   r13
 10ab957:	41 54                	push   r12
 10ab959:	50                   	push   rax
 10ab95a:	55                   	push   rbp
 10ab95b:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
 10ab95f:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
 10ab963:	ff 74 24 48          	push   QWORD PTR [rsp+0x48]
 10ab967:	ff 74 24 58          	push   QWORD PTR [rsp+0x58]
 10ab96b:	ff 74 24 68          	push   QWORD PTR [rsp+0x68]
 10ab96f:	ff b4 24 88 00 00 00 	push   QWORD PTR [rsp+0x88]
 10ab976:	48 8d 84 24 d8 00 00 	lea    rax,[rsp+0xd8]
 10ab97d:	00
 10ab97e:	50                   	push   rax
 10ab97f:	e8 b2 00 00 00       	call   10aba36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e4c>
 10ab984:	48 83 c4 60          	add    rsp,0x60
 10ab988:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 10ab98f:	00
 10ab990:	e8 d5 e5 9c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10ab995:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 10ab99a:	48 89 18             	mov    QWORD PTR [rax],rbx
 10ab99d:	48 89 c3             	mov    rbx,rax
 10ab9a0:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10ab9a7:	00
 10ab9a8:	e8 d9 2a 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ab9ad:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 10ab9b2:	e8 d9 24 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ab9b7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ab9be:	00 00
 10ab9c0:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
 10ab9c7:	00
 10ab9c8:	75 66                	jne    10aba30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e46>
 10ab9ca:	48 89 d8             	mov    rax,rbx
 10ab9cd:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
 10ab9d4:	5b                   	pop    rbx
 10ab9d5:	41 5c                	pop    r12
 10ab9d7:	41 5d                	pop    r13
 10ab9d9:	41 5e                	pop    r14
 10ab9db:	41 5f                	pop    r15
 10ab9dd:	5d                   	pop    rbp
 10ab9de:	c3                   	ret
 10ab9df:	49 89 c6             	mov    r14,rax
 10ab9e2:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 10ab9e9:	00
 10ab9ea:	e8 7b e5 9c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10ab9ef:	48 89 df             	mov    rdi,rbx
 10ab9f2:	e8 29 25 74 00       	call   17edf20 <_ZdlPv@plt>
 10ab9f7:	eb 05                	jmp    10ab9fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e14>
 10ab9f9:	eb 00                	jmp    10ab9fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e11>
 10ab9fb:	49 89 c6             	mov    r14,rax
 10ab9fe:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10aba05:	00
 10aba06:	e8 7b 2a 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10aba0b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 10aba10:	e8 7b 24 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10aba15:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba1c:	00 00
 10aba1e:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
 10aba25:	00
 10aba26:	75 08                	jne    10aba30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e46>
 10aba28:	4c 89 f7             	mov    rdi,r14
 10aba2b:	e8 a0 42 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10aba30:	e8 7b 40 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10aba35:	cc                   	int3
 10aba36:	55                   	push   rbp
 10aba37:	41 57                	push   r15
 10aba39:	41 56                	push   r14
 10aba3b:	41 55                	push   r13
 10aba3d:	41 54                	push   r12
 10aba3f:	53                   	push   rbx
 10aba40:	48 81 ec 58 01 00 00 	sub    rsp,0x158
 10aba47:	4c 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],r9
 10aba4c:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
 10aba51:	48 89 cd             	mov    rbp,rcx
 10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx
 10aba59:	49 89 f7             	mov    r15,rsi
 10aba5c:	48 89 fb             	mov    rbx,rdi
 10aba5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba66:	00 00
 10aba68:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
 10aba6f:	00
 10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
 10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax
 10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]
 10aba82:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 10aba89:	00
 10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]
 10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10aba93:	48 8d 47 40          	lea    rax,[rdi+0x40]
 10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10aba9c:	48 83 c7 48          	add    rdi,0x48
 10abaa0:	0f 57 c0             	xorps  xmm0,xmm0
 10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
 10abaaf:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
 10abab4:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 10abab9:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
 10abac0:	00
 10abac1:	e8 64 9c ab ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 10abac6:	48 8d 43 58          	lea    rax,[rbx+0x58]
 10abaca:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10abacf:	48 8d 43 60          	lea    rax,[rbx+0x60]
```
## Targeted child/service xrefs

### `b411a4` hits (1)

#### hit `0xb411a4`

```text
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
```
### `184da88` hits (2)

#### hit `0x10ad68d`

```text
 10ad67c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10ad67f:	48 89 df             	mov    rdi,rbx
 10ad682:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ad685:	6a 48                	push   0x48
 10ad687:	5f                   	pop    rdi
 10ad688:	e8 73 08 74 00       	call   17edf00 <_Znwm@plt>
 10ad68d:	48 8d 0d f4 03 7a 00 	lea    rcx,[rip+0x7a03f4]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>
 10ad694:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
 10ad6a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
 10ad6a8:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 10ad6ad:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
 10ad6b1:	48 89 58 28          	mov    QWORD PTR [rax+0x28],rbx
 10ad6b5:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
 10ad6bc:	00
 10ad6bd:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
```
#### hit `0x10c09ca`

```text
 10c09c0:	89 f0                	mov    eax,esi
 10c09c2:	34 01                	xor    al,0x1
 10c09c4:	c3                   	ret
 10c09c5:	cc                   	int3
 10c09c6:	53                   	push   rbx
 10c09c7:	48 89 fb             	mov    rbx,rdi
 10c09ca:	48 8d 05 b7 d0 78 00 	lea    rax,[rip+0x78d0b7]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>
 10c09d1:	48 89 07             	mov    QWORD PTR [rdi],rax
 10c09d4:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
 10c09d8:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
 10c09dd:	48 85 ff             	test   rdi,rdi
 10c09e0:	74 06                	je     10c09e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287dfe>
 10c09e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c09e5:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10c09e8:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
 10c09ec:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
 10c09f1:	48 85 ff             	test   rdi,rdi
 10c09f4:	74 06                	je     10c09fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e12>
```
### `184ca90` hits (2)

#### hit `0x10aba74`

```text
 10aba5c:	48 89 fb             	mov    rbx,rdi
 10aba5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba66:	00 00
 10aba68:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
 10aba6f:	00
 10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
 10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax
 10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]
 10aba82:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 10aba89:	00
 10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]
 10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10aba93:	48 8d 47 40          	lea    rax,[rdi+0x40]
 10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10aba9c:	48 83 c7 48          	add    rdi,0x48
 10abaa0:	0f 57 c0             	xorps  xmm0,xmm0
 10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
```
#### hit `0x10ae15a`

```text
 10ae14a:	48 89 c3             	mov    rbx,rax
 10ae14d:	48 89 df             	mov    rdi,rbx
 10ae150:	e8 50 b9 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10ae155:	cc                   	int3
 10ae156:	53                   	push   rbx
 10ae157:	48 89 fb             	mov    rbx,rdi
 10ae15a:	48 8d 05 2f e9 79 00 	lea    rax,[rip+0x79e92f]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
 10ae161:	48 89 07             	mov    QWORD PTR [rdi],rax
 10ae164:	48 83 c7 78          	add    rdi,0x78
 10ae168:	e8 85 fb ff ff       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>
 10ae16d:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
 10ae171:	e8 54 fb ff ff       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10ae176:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
 10ae17a:	e8 23 fb ff ff       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10ae17f:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 10ae183:	e8 a0 bc 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10ae188:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10ae18c:	e8 97 bc 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
```
### `10aba36` hits (2)

#### hit `0x10ab97f`

```text
 10ab967:	ff 74 24 58          	push   QWORD PTR [rsp+0x58]
 10ab96b:	ff 74 24 68          	push   QWORD PTR [rsp+0x68]
 10ab96f:	ff b4 24 88 00 00 00 	push   QWORD PTR [rsp+0x88]
 10ab976:	48 8d 84 24 d8 00 00 	lea    rax,[rsp+0xd8]
 10ab97d:	00
 10ab97e:	50                   	push   rax
 10ab97f:	e8 b2 00 00 00       	call   10aba36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e4c>
 10ab984:	48 83 c4 60          	add    rsp,0x60
 10ab988:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 10ab98f:	00
 10ab990:	e8 d5 e5 9c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10ab995:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 10ab99a:	48 89 18             	mov    QWORD PTR [rax],rbx
 10ab99d:	48 89 c3             	mov    rbx,rax
 10ab9a0:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10ab9a7:	00
 10ab9a8:	e8 d9 2a 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ab9ad:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
```
#### hit `0x10aba36`

```text
 10aba25:	00
 10aba26:	75 08                	jne    10aba30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e46>
 10aba28:	4c 89 f7             	mov    rdi,r14
 10aba2b:	e8 a0 42 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10aba30:	e8 7b 40 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10aba35:	cc                   	int3
 10aba36:	55                   	push   rbp
 10aba37:	41 57                	push   r15
 10aba39:	41 56                	push   r14
 10aba3b:	41 55                	push   r13
 10aba3d:	41 54                	push   r12
 10aba3f:	53                   	push   rbx
 10aba40:	48 81 ec 58 01 00 00 	sub    rsp,0x158
 10aba47:	4c 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],r9
 10aba4c:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
 10aba51:	48 89 cd             	mov    rbp,rcx
 10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx
 10aba59:	49 89 f7             	mov    r15,rsi
```
### `10ab97f` hits (1)

#### hit `0x10ab97f`

```text
 10ab967:	ff 74 24 58          	push   QWORD PTR [rsp+0x58]
 10ab96b:	ff 74 24 68          	push   QWORD PTR [rsp+0x68]
 10ab96f:	ff b4 24 88 00 00 00 	push   QWORD PTR [rsp+0x88]
 10ab976:	48 8d 84 24 d8 00 00 	lea    rax,[rsp+0xd8]
 10ab97d:	00
 10ab97e:	50                   	push   rax
 10ab97f:	e8 b2 00 00 00       	call   10aba36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e4c>
 10ab984:	48 83 c4 60          	add    rsp,0x60
 10ab988:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 10ab98f:	00
 10ab990:	e8 d5 e5 9c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10ab995:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 10ab99a:	48 89 18             	mov    QWORD PTR [rax],rbx
 10ab99d:	48 89 c3             	mov    rbx,rax
 10ab9a0:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10ab9a7:	00
 10ab9a8:	e8 d9 2a 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ab9ad:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
```
## Child/service related direct hits

| addr | instruction |
|---:|---|
| `0x9d8168` | `9d8168:	48 8b 57 18          	mov    rdx,QWORD PTR [rdi+0x18]` |
| `0x9d89d3` | `9d89d3:	4c 8b 7f 18          	mov    r15,QWORD PTR [rdi+0x18]` |
| `0x9db8a8` | `9db8a8:	4c 89 67 18          	mov    QWORD PTR [rdi+0x18],r12` |
| `0x9dcc21` | `9dcc21:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1` |
| `0x9dcc5a` | `9dcc5a:	0f 10 4f 18          	movups xmm1,XMMWORD PTR [rdi+0x18]` |
| `0x9e2deb` | `9e2deb:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1` |
| `0x9e31e5` | `9e31e5:	48 c7 47 18 00 00 00 	mov    QWORD PTR [rdi+0x18],0x0` |
| `0x9e5091` | `9e5091:	83 57 18 00          	adc    DWORD PTR [rdi+0x18],0x0` |
| `0x9e5612` | `9e5612:	4c 8d 67 18          	lea    r12,[rdi+0x18]` |
| `0x9e6b6a` | `9e6b6a:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax` |
| `0x9e6b8b` | `9e6b8b:	48 63 57 18          	movsxd rdx,DWORD PTR [rdi+0x18]` |
| `0x9e6bad` | `9e6bad:	39 77 18             	cmp    DWORD PTR [rdi+0x18],esi` |
| `0x9e88cf` | `9e88cf:	f3 0f 10 7f 18       	movss  xmm7,DWORD PTR [rdi+0x18]` |
| `0x9ea06e` | `9ea06e:	8b 4f 18             	mov    ecx,DWORD PTR [rdi+0x18]` |
| `0x9eabdd` | `9eabdd:	39 4f 18             	cmp    DWORD PTR [rdi+0x18],ecx` |
| `0x9ee289` | `9ee289:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0x9ee450` | `9ee450:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0x9ee87e` | `9ee87e:	c6 47 18 00          	mov    BYTE PTR [rdi+0x18],0x0` |
| `0x9ef51d` | `9ef51d:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0` |
| `0x9ef535` | `9ef535:	4c 8d 77 18          	lea    r14,[rdi+0x18]` |
| `0x9ef915` | `9ef915:	4c 8d 77 18          	lea    r14,[rdi+0x18]` |
| `0x9efec3` | `9efec3:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0` |
| `0x9effa2` | `9effa2:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0` |
| `0x9f0f06` | `9f0f06:	8b 4f 18             	mov    ecx,DWORD PTR [rdi+0x18]` |
| `0x9f1851` | `9f1851:	48 c7 47 18 00 00 00 	mov    QWORD PTR [rdi+0x18],0x0` |
| `0x9f2671` | `9f2671:	44 8b 67 18          	mov    r12d,DWORD PTR [rdi+0x18]` |
| `0x9ff309` | `9ff309:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0x9ff3df` | `9ff3df:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0x9ffa09` | `9ffa09:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0x9ffadf` | `9ffadf:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0xa00119` | `a00119:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0xa001ef` | `a001ef:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0xa003a9` | `a003a9:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0xa0047f` | `a0047f:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0xa00d6b` | `a00d6b:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0xa00e76` | `a00e76:	48 8d 4f 18          	lea    rcx,[rdi+0x18]` |
| `0xa03fb5` | `a03fb5:	48 89 77 18          	mov    QWORD PTR [rdi+0x18],rsi` |
| `0xa03fce` | `a03fce:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa0411e` | `a0411e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa0427a` | `a0427a:	48 03 47 18          	add    rax,QWORD PTR [rdi+0x18]` |
| `0xa04390` | `a04390:	4c 89 47 18          	mov    QWORD PTR [rdi+0x18],r8` |
| `0xa043a2` | `a043a2:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx` |
| `0xa043ca` | `a043ca:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa04403` | `a04403:	4c 89 47 18          	mov    QWORD PTR [rdi+0x18],r8` |
| `0xa044d7` | `a044d7:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa04580` | `a04580:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa0459a` | `a0459a:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa045a7` | `a045a7:	4c 89 4f 18          	mov    QWORD PTR [rdi+0x18],r9` |
| `0xa045b4` | `a045b4:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa0e53c` | `a0e53c:	48 8d 5f 18          	lea    rbx,[rdi+0x18]` |
| `0xa0e5bc` | `a0e5bc:	48 8d 5f 18          	lea    rbx,[rdi+0x18]` |
| `0xa0e64e` | `a0e64e:	48 8d 5f 18          	lea    rbx,[rdi+0x18]` |
| `0xa0e6de` | `a0e6de:	48 8d 5f 18          	lea    rbx,[rdi+0x18]` |
| `0xa0e767` | `a0e767:	4c 8d 77 18          	lea    r14,[rdi+0x18]` |
| `0xa0e7ac` | `a0e7ac:	4c 8d 77 18          	lea    r14,[rdi+0x18]` |
| `0xa0e90c` | `a0e90c:	4c 8d 77 18          	lea    r14,[rdi+0x18]` |
| `0xa0f8a8` | `a0f8a8:	4c 8b 77 18          	mov    r14,QWORD PTR [rdi+0x18]` |
| `0xa104dd` | `a104dd:	48 c7 47 18 00 00 00 	mov    QWORD PTR [rdi+0x18],0x0` |
| `0xa108af` | `a108af:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa108b7` | `a108b7:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa10ba0` | `a10ba0:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa10bc1` | `a10bc1:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa10bd1` | `a10bd1:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa10c10` | `a10c10:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa10c1e` | `a10c1e:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa10c30` | `a10c30:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa10c60` | `a10c60:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa10c73` | `a10c73:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa10c90` | `a10c90:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa10c9e` | `a10c9e:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa10e83` | `a10e83:	48 01 47 18          	add    QWORD PTR [rdi+0x18],rax` |
| `0xa10e94` | `a10e94:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx` |
| `0xa1153c` | `a1153c:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa1154d` | `a1154d:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa1155d` | `a1155d:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa12503` | `a12503:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa12511` | `a12511:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa126ef` | `a126ef:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa126fc` | `a126fc:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa1272b` | `a1272b:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa128fc` | `a128fc:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa1290d` | `a1290d:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa1291d` | `a1291d:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa12aec` | `a12aec:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa12b25` | `a12b25:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa12b32` | `a12b32:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa12b67` | `a12b67:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa12b74` | `a12b74:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa12cc4` | `a12cc4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa12cd2` | `a12cd2:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa12d21` | `a12d21:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa12d2f` | `a12d2f:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx` |
| `0xa12e13` | `a12e13:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa12fbf` | `a12fbf:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa130ec` | `a130ec:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa130ff` | `a130ff:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa131e4` | `a131e4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa131f1` | `a131f1:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa14f57` | `a14f57:	4c 8d 77 18          	lea    r14,[rdi+0x18]` |
| `0xa14f6d` | `a14f6d:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa150d0` | `a150d0:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa150f1` | `a150f1:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa150ff` | `a150ff:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa1510a` | `a1510a:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa15140` | `a15140:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa1514e` | `a1514e:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa15160` | `a15160:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa15180` | `a15180:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa15193` | `a15193:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa151b0` | `a151b0:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa151be` | `a151be:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa15287` | `a15287:	48 01 47 18          	add    QWORD PTR [rdi+0x18],rax` |
| `0xa1578c` | `a1578c:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa1579e` | `a1579e:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa157ae` | `a157ae:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16753` | `a16753:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16761` | `a16761:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa16940` | `a16940:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa1694e` | `a1694e:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa16963` | `a16963:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16b4c` | `a16b4c:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16b5e` | `a16b5e:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa16b6e` | `a16b6e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16d24` | `a16d24:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa16d3e` | `a16d3e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16d7c` | `a16d7c:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16db8` | `a16db8:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16dc6` | `a16dc6:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa16f1c` | `a16f1c:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16f2a` | `a16f2a:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa16f80` | `a16f80:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa16f8e` | `a16f8e:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa17073` | `a17073:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa1721f` | `a1721f:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa1734c` | `a1734c:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa17360` | `a17360:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa17444` | `a17444:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa17452` | `a17452:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa19baf` | `a19baf:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa19bd4` | `a19bd4:	48 8b 57 18          	mov    rdx,QWORD PTR [rdi+0x18]` |
| `0xa19bf8` | `a19bf8:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa19c0a` | `a19c0a:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx` |
| `0xa19c36` | `a19c36:	4c 8b 67 18          	mov    r12,QWORD PTR [rdi+0x18]` |
| `0xa19e3a` | `a19e3a:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa19e56` | `a19e56:	48 83 7f 18 00       	cmp    QWORD PTR [rdi+0x18],0x0` |
| `0xa19e77` | `a19e77:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx` |
| `0xa1af05` | `a1af05:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx` |
| `0xa1af5c` | `a1af5c:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa1af7e` | `a1af7e:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa1af8c` | `a1af8c:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa1b80a` | `a1b80a:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa1d849` | `a1d849:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa1d8ec` | `a1d8ec:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa1da37` | `a1da37:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa1da49` | `a1da49:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa1dad5` | `a1dad5:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa21f29` | `a21f29:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa21fcf` | `a21fcf:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa22117` | `a22117:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2212a` | `a2212a:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa221b5` | `a221b5:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c053` | `a2c053:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2c062` | `a2c062:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c0fc` | `a2c0fc:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c12b` | `a2c12b:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c15e` | `a2c15e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c38f` | `a2c38f:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c3d5` | `a2c3d5:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c428` | `a2c428:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c453` | `a2c453:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c460` | `a2c460:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2c474` | `a2c474:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c529` | `a2c529:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c598` | `a2c598:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c5d1` | `a2c5d1:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c625` | `a2c625:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c632` | `a2c632:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2c653` | `a2c653:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2c66a` | `a2c66a:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c708` | `a2c708:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c75e` | `a2c75e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2c783` | `a2c783:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2dba4` | `a2dba4:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2dbb3` | `a2dbb3:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2dc29` | `a2dc29:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2dc5e` | `a2dc5e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2dcb5` | `a2dcb5:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2deef` | `a2deef:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2df6b` | `a2df6b:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2df9d` | `a2df9d:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2dfab` | `a2dfab:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2dfbf` | `a2dfbf:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2e069` | `a2e069:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2e0e2` | `a2e0e2:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2e120` | `a2e120:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2e12e` | `a2e12e:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2e174` | `a2e174:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2e18b` | `a2e18b:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2e20d` | `a2e20d:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2e25e` | `a2e25e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2e283` | `a2e283:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2ef88` | `a2ef88:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f105` | `a2f105:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f2a5` | `a2f2a5:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f373` | `a2f373:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2f382` | `a2f382:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f411` | `a2f411:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f5c4` | `a2f5c4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f64c` | `a2f64c:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f6e2` | `a2f6e2:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f7e4` | `a2f7e4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f80a` | `a2f80a:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f81b` | `a2f81b:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2f864` | `a2f864:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f895` | `a2f895:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f8a6` | `a2f8a6:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2f8ed` | `a2f8ed:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2f8fb` | `a2f8fb:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa2f964` | `a2f964:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa2f986` | `a2f986:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2fa11` | `a2fa11:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2fa42` | `a2fa42:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2fca3` | `a2fca3:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2fce0` | `a2fce0:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2fd71` | `a2fd71:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2fd93` | `a2fd93:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2feae` | `a2feae:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2fecf` | `a2fecf:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2ff38` | `a2ff38:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2ff52` | `a2ff52:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2ff5f` | `a2ff5f:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa2ff83` | `a2ff83:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa2ff9a` | `a2ff9a:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa2ffbb` | `a2ffbb:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa30041` | `a30041:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa3007f` | `a3007f:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa30141` | `a30141:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa30170` | `a30170:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa30281` | `a30281:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa302aa` | `a302aa:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa302e3` | `a302e3:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa302f0` | `a302f0:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa30391` | `a30391:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa30863` | `a30863:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa30e6f` | `a30e6f:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa30fe4` | `a30fe4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa311b4` | `a311b4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31294` | `a31294:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa312a2` | `a312a2:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31323` | `a31323:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31509` | `a31509:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa3156b` | `a3156b:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa315ea` | `a315ea:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31646` | `a31646:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa3166e` | `a3166e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31680` | `a31680:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa316c9` | `a316c9:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa316f9` | `a316f9:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa3170b` | `a3170b:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa31751` | `a31751:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa3175f` | `a3175f:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa31784` | `a31784:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa317a3` | `a317a3:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31829` | `a31829:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31861` | `a31861:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31ba4` | `a31ba4:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa31be2` | `a31be2:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31c5d` | `a31c5d:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31c7e` | `a31c7e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31d88` | `a31d88:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31de1` | `a31de1:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31e09` | `a31e09:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31e29` | `a31e29:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31e37` | `a31e37:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa31e64` | `a31e64:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx` |
| `0xa31e82` | `a31e82:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31ee0` | `a31ee0:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa31f0a` | `a31f0a:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa32000` | `a32000:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa3204c` | `a3204c:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0xa32100` | `a32100:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa32161` | `a32161:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa3218b` | `a3218b:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa321b9` | `a321b9:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa321c7` | `a321c7:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa326a1` | `a326a1:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa3530d` | `a3530d:	4c 89 7f 18          	mov    QWORD PTR [rdi+0x18],r15` |
| `0xa37837` | `a37837:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa38c20` | `a38c20:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0` |
| `0xa38df0` | `a38df0:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0` |
| `0xa38fc0` | `a38fc0:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0` |
| `0xa39190` | `a39190:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0` |
| `0xa398e4` | `a398e4:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa39f94` | `a39f94:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0xa3c764` | `a3c764:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]` |
| `0xa3c824` | `a3c824:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]` |
| `0xa3e469` | `a3e469:	88 57 18             	mov    BYTE PTR [rdi+0x18],dl` |
| `0xa3e49b` | `a3e49b:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0` |
| `0xa3ea84` | `a3ea84:	c6 47 18 00          	mov    BYTE PTR [rdi+0x18],0x0` |
| `0xa3eb84` | `a3eb84:	c6 47 18 00          	mov    BYTE PTR [rdi+0x18],0x0` |
| `0xa418f3` | `a418f3:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa41942` | `a41942:	f6 47 18 02          	test   BYTE PTR [rdi+0x18],0x2` |
| `0xa41a5c` | `a41a5c:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]` |
| `0xa41c10` | `a41c10:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]` |
| `0xa41da0` | `a41da0:	0f b6 47 18          	movzx  eax,BYTE PTR [rdi+0x18]` |
| `0xa41de7` | `a41de7:	44 8b 5f 18          	mov    r11d,DWORD PTR [rdi+0x18]` |
| `0xa41e57` | `a41e57:	44 8b 5f 18          	mov    r11d,DWORD PTR [rdi+0x18]` |
| `0xa41ea7` | `a41ea7:	44 8b 47 18          	mov    r8d,DWORD PTR [rdi+0x18]` |
| `0xa41ec0` | `a41ec0:	0f b6 47 18          	movzx  eax,BYTE PTR [rdi+0x18]` |
| `0xa41ef0` | `a41ef0:	4c 8b 5f 18          	mov    r11,QWORD PTR [rdi+0x18]` |
| `0xa42033` | `a42033:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]` |
| `0xa42156` | `a42156:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]` |
| `0xa4223e` | `a4223e:	4c 8b 5f 18          	mov    r11,QWORD PTR [rdi+0x18]` |
| `0xa42373` | `a42373:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]` |
| `0xa42496` | `a42496:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]` |
| `0xa4255f` | `a4255f:	f6 47 18 02          	test   BYTE PTR [rdi+0x18],0x2` |
| `0xa425fc` | `a425fc:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]` |
| `0xa4269f` | `a4269f:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]` |
| `0xa42730` | `a42730:	0f b6 47 18          	movzx  eax,BYTE PTR [rdi+0x18]` |
| `0xa4275f` | `a4275f:	f6 47 18 02          	test   BYTE PTR [rdi+0x18],0x2` |
| `0xa427fc` | `a427fc:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]` |
| `0xa4289f` | `a4289f:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]` |
| `0xa42944` | `a42944:	f6 47 18 02          	test   BYTE PTR [rdi+0x18],0x2` |
| `0xa42a4c` | `a42a4c:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]` |
| `0xa42b6f` | `a42b6f:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]` |
| `0xa42c60` | `a42c60:	0f b6 47 18          	movzx  eax,BYTE PTR [rdi+0x18]` |
| `0xa42c92` | `a42c92:	f6 47 18 02          	test   BYTE PTR [rdi+0x18],0x2` |
| `0xa42d8c` | `a42d8c:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]` |
| `0xa42eaf` | `a42eaf:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]` |
| `0xa43603` | `a43603:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]` |
| `0xa43647` | `a43647:	44 8b 5f 18          	mov    r11d,DWORD PTR [rdi+0x18]` |
| `0xa436b7` | `a436b7:	44 8b 5f 18          	mov    r11d,DWORD PTR [rdi+0x18]` |
| `0xa43707` | `a43707:	44 8b 47 18          	mov    r8d,DWORD PTR [rdi+0x18]` |
| `0xa43747` | `a43747:	44 8b 5f 18          	mov    r11d,DWORD PTR [rdi+0x18]` |
| `0xa437b7` | `a437b7:	44 8b 5f 18          	mov    r11d,DWORD PTR [rdi+0x18]` |
| `0xa4389e` | `a4389e:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0` |
| `0xa438d6` | `a438d6:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0` |
| `0xa438fe` | `a438fe:	f6 47 18 01          	test   BYTE PTR [rdi+0x18],0x1` |
| `0xa4395e` | `a4395e:	f6 47 18 01          	test   BYTE PTR [rdi+0x18],0x1` |
| `0xa43a67` | `a43a67:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0` |
| ... | truncated 4446 more |

## Constructor +0x18/+0x10/+0x20 activity

| addr | instruction |
|---:|---|
| `0x10aba4c` | `10aba4c:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8` |
| `0x10aba7e` | `10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0x10aba8a` | `10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]` |
| `0x10aba97` | `10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0x10abaa3` | `10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0` |
| `0x10abaa7` | `10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0` |
| `0x10abaca` | `10abaca:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0x10abb75` | `10abb75:	48 8d 35 a4 b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8a4]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>` |
| `0x10abb7c` | `10abb7c:	48 8d 0d bd b8 32 ff 	lea    rcx,[rip+0xffffffffff32b8bd]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>` |
| `0x10abc0b` | `10abc0b:	48 8d 35 5e b8 32 ff 	lea    rsi,[rip+0xffffffffff32b85e]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>` |
| `0x10abc12` | `10abc12:	48 8d 0d 77 b8 32 ff 	lea    rcx,[rip+0xffffffffff32b877]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>` |
| `0x10ac096` | `10ac096:	48 8d 35 13 b4 32 ff 	lea    rsi,[rip+0xffffffffff32b413]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>` |
| `0x10ac09d` | `10ac09d:	48 8d 0d 2c b4 32 ff 	lea    rcx,[rip+0xffffffffff32b42c]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>` |
| `0x10ac154` | `10ac154:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]` |
| `0x10ac16a` | `10ac16a:	48 8d 05 69 78 a1 ff 	lea    rax,[rip+0xffffffffffa17869]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>` |
| `0x10ac171` | `10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac17c` | `10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac21b` | `10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl` |
| `0x10ac266` | `10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0` |
| `0x10ac2d9` | `10ac2d9:	0f 29 80 00 01 00 00 	movaps XMMWORD PTR [rax+0x100],xmm0` |
| `0x10ac319` | `10ac319:	48 8d 15 00 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b100]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>` |
| `0x10ac320` | `10ac320:	4c 8d 05 19 b1 32 ff 	lea    r8,[rip+0xffffffffff32b119]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>` |
| `0x10ac33e` | `10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac3a7` | `10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15` |
| `0x10ac3b0` | `10ac3b0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax` |
| `0x10ac3bc` | `10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax` |
| `0x10ac3cd` | `10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac3e3` | `10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax` |
| `0x10ac3ee` | `10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax` |
| `0x10ac3f5` | `10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ac408` | `10ac408:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac416` | `10ac416:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10ac421` | `10ac421:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x10ac437` | `10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac48b` | `10ac48b:	48 8d 15 de af 32 ff 	lea    rdx,[rip+0xffffffffff32afde]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>` |
| `0x10ac492` | `10ac492:	4c 8d 05 f7 af 32 ff 	lea    r8,[rip+0xffffffffff32aff7]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>` |
| `0x10ac4b0` | `10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac50f` | `10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi` |
| `0x10ac513` | `10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0` |
| `0x10ac517` | `10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]` |
| `0x10ac52d` | `10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx` |
| `0x10ac538` | `10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx` |
| `0x10ac542` | `10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]` |
| `0x10ac55c` | `10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]` |
| `0x10ac56a` | `10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10ac575` | `10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x10ac584` | `10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac602` | `10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>` |
| `0x10ac609` | `10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>` |
| `0x10ac627` | `10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac66f` | `10ac66f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]` |
| `0x10ac674` | `10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]` |
| `0x10ac6ff` | `10ac6ff:	49 89 57 10          	mov    QWORD PTR [r15+0x10],rdx` |
| `0x10ac737` | `10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx` |
| `0x10ac742` | `10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx` |
| `0x10ac75c` | `10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]` |
| `0x10ac760` | `10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx` |
| `0x10ac768` | `10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10ac76d` | `10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0` |
| `0x10ac7d5` | `10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ac81c` | `10ac81c:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ac8b5` | `10ac8b5:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac8c0` | `10ac8c0:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac931` | `10ac931:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]` |
| `0x10ac936` | `10ac936:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]` |
| `0x10ac981` | `10ac981:	48 89 8c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rcx` |
| `0x10ac9c4` | `10ac9c4:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax` |
| `0x10ac9cf` | `10ac9cf:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax` |
| `0x10ac9e9` | `10ac9e9:	48 8b 84 24 00 01 00 	mov    rax,QWORD PTR [rsp+0x100]` |
| `0x10ac9f1` | `10ac9f1:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax` |
| `0x10ac9fd` | `10ac9fd:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10aca02` | `10aca02:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0` |
| `0x10acae3` | `10acae3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]` |
| `0x10acb25` | `10acb25:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]` |
| `0x10acbbe` | `10acbbe:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10acbc2` | `10acbc2:	48 8d 05 b1 10 00 00 	lea    rax,[rip+0x10b1]        # 10adc7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275090>` |
| `0x10acbc9` | `10acbc9:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10acc02` | `10acc02:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]` |
| `0x10acc0a` | `10acc0a:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10acc3b` | `10acc3b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10acc47` | `10acc47:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12` |
| `0x10acc4b` | `10acc4b:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10accf2` | `10accf2:	41 0f 11 86 00 01 00 	movups XMMWORD PTR [r14+0x100],xmm0` |
| `0x10acd66` | `10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14` |
| `0x10acd6a` | `10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx` |
| `0x10acd76` | `10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx` |
| `0x10acdee` | `10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15` |
| `0x10acdf2` | `10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13` |
| `0x10acdf6` | `10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10acf08` | `10acf08:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10acf0d` | `10acf0d:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0` |
| `0x10ad028` | `10ad028:	48 8d 15 c1 a4 32 ff 	lea    rdx,[rip+0xffffffffff32a4c1]        # 3d74f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20d5>` |
| `0x10ad02f` | `10ad02f:	4c 8d 05 da a4 32 ff 	lea    r8,[rip+0xffffffffff32a4da]        # 3d7510 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20f5>` |
| `0x10ad04d` | `10ad04d:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0` |
| `0x10ad09f` | `10ad09f:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0` |
| `0x10ad0fd` | `10ad0fd:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0` |
| `0x10ad101` | `10ad101:	89 6c 24 10          	mov    DWORD PTR [rsp+0x10],ebp` |
| `0x10ad13e` | `10ad13e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ad14e` | `10ad14e:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]` |
| `0x10ad1b7` | `10ad1b7:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax` |
| `0x10ad1bb` | `10ad1bb:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12` |
| `0x10ad1bf` | `10ad1bf:	4c 8d 65 20          	lea    r12,[rbp+0x20]` |
| `0x10ad202` | `10ad202:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]` |
| `0x10ad296` | `10ad296:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi` |
| `0x10ad2c0` | `10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]` |
| `0x10ad31f` | `10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ad38a` | `10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10ad3b6` | `10ad3b6:	4c 8b 7d 18          	mov    r15,QWORD PTR [rbp+0x18]` |
| `0x10ad3ff` | `10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad4c6` | `10ad4c6:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10ad4d9` | `10ad4d9:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax` |
| `0x10ad519` | `10ad519:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0` |
| `0x10ad562` | `10ad562:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp` |
| `0x10ad593` | `10ad593:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax` |
| `0x10ad59e` | `10ad59e:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax` |
| `0x10ad5d9` | `10ad5d9:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0` |
| `0x10ad608` | `10ad608:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ad613` | `10ad613:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ad62a` | `10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad6a0` | `10ad6a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx` |
| `0x10ad6a4` | `10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp` |
| `0x10ad6ad` | `10ad6ad:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx` |
| `0x10ad8b6` | `10ad8b6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0x10adb34` | `10adb34:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10adb57` | `10adb57:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10adba6` | `10adba6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]` |
| `0x10adbba` | `10adbba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]` |
| `0x10adc1d` | `10adc1d:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]` |
| `0x10adc3d` | `10adc3d:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0x10adc52` | `10adc52:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |

