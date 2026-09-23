# Restrictions `aab330` provider-slot internals v12

Focus: identify what `aab330(&stack_slot, original)` stores into `[rsp+0x8]` before the `e99c96` provider virtual `+0x78` call. Static provenance only.

## `aab330` window

```text
  aab22a:	e8 d1 2c d4 00       	call   17edf00 <_Znwm@plt>
  aab22f:	4c 89 68 20          	mov    QWORD PTR [rax+0x20],r13
  aab233:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
  aab239:	4c 89 78 28          	mov    QWORD PTR [rax+0x28],r15
  aab23d:	0f 57 c0             	xorps  xmm0,xmm0
  aab240:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
  aab243:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
  aab247:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
  aab24b:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
  aab24f:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
  aab252:	48 85 c9             	test   rcx,rcx
  aab255:	74 08                	je     aab25f <JNI_OnUnload@@Base+0x32b2c>
  aab257:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
  aab25b:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  aab25f:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  aab263:	48 89 c6             	mov    rsi,rax
  aab266:	e8 b3 ed ff ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
  aab26b:	49 ff 46 48          	inc    QWORD PTR [r14+0x48]
  aab26f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  aab274:	e8 73 0b 00 00       	call   aabdec <JNI_OnUnload@@Base+0x336b9>
  aab279:	4d 89 ef             	mov    r15,r13
  aab27c:	49 c1 ef 08          	shr    r15,0x8
  aab280:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aab285:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
  aab28b:	48 85 ff             	test   rdi,rdi
  aab28e:	74 06                	je     aab296 <JNI_OnUnload@@Base+0x32b63>
  aab290:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aab293:	ff 50 08             	call   QWORD PTR [rax+0x8]
  aab296:	49 c1 e7 08          	shl    r15,0x8
  aab29a:	45 0f b6 e5          	movzx  r12d,r13b
  aab29e:	e9 0b fd ff ff       	jmp    aaafae <JNI_OnUnload@@Base+0x3287b>
  aab2a3:	e8 08 48 d4 00       	call   17efab0 <__stack_chk_fail@plt>
  aab2a8:	48 89 c3             	mov    rbx,rax
  aab2ab:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  aab2b0:	e8 37 0b 00 00       	call   aabdec <JNI_OnUnload@@Base+0x336b9>
  aab2b5:	eb 18                	jmp    aab2cf <JNI_OnUnload@@Base+0x32b9c>
  aab2b7:	48 89 c3             	mov    rbx,rax
  aab2ba:	4c 89 ff             	mov    rdi,r15
  aab2bd:	e8 66 eb fc ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  aab2c2:	4c 89 ff             	mov    rdi,r15
  aab2c5:	e8 56 2c d4 00       	call   17edf20 <_ZdlPv@plt>
  aab2ca:	eb 03                	jmp    aab2cf <JNI_OnUnload@@Base+0x32b9c>
  aab2cc:	48 89 c3             	mov    rbx,rax
  aab2cf:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aab2d4:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
  aab2da:	48 85 ff             	test   rdi,rdi
  aab2dd:	74 0b                	je     aab2ea <JNI_OnUnload@@Base+0x32bb7>
  aab2df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aab2e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
  aab2e5:	eb 03                	jmp    aab2ea <JNI_OnUnload@@Base+0x32bb7>
  aab2e7:	48 89 c3             	mov    rbx,rax
  aab2ea:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  aab2ef:	e8 3c 0b 00 00       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
  aab2f4:	eb 31                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>
  aab2f6:	48 89 c3             	mov    rbx,rax
  aab2f9:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
  aab2fe:	e8 83 31 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab303:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
  aab307:	e8 a6 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab30c:	31 ff                	xor    edi,edi
  aab30e:	e8 9f 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab313:	31 ff                	xor    edi,edi
  aab315:	e8 98 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab31a:	4c 89 f7             	mov    rdi,r14
  aab31d:	e8 fe 2b d4 00       	call   17edf20 <_ZdlPv@plt>
  aab322:	eb 03                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>
  aab324:	48 89 c3             	mov    rbx,rax
  aab327:	48 89 df             	mov    rdi,rbx
  aab32a:	e8 76 e7 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  aab32f:	cc                   	int3
  aab330:	41 56                	push   r14
  aab332:	53                   	push   rbx
  aab333:	50                   	push   rax
  aab334:	48 89 fb             	mov    rbx,rdi
  aab337:	0f 57 c0             	xorps  xmm0,xmm0
  aab33a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  aab33d:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
  aab341:	48 85 ff             	test   rdi,rdi
  aab344:	74 17                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
  aab346:	49 89 f6             	mov    r14,rsi
  aab349:	e8 f2 2d d4 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
  aab34e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  aab352:	48 85 c0             	test   rax,rax
  aab355:	74 06                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
  aab357:	49 8b 06             	mov    rax,QWORD PTR [r14]
  aab35a:	48 89 03             	mov    QWORD PTR [rbx],rax
  aab35d:	48 83 c4 08          	add    rsp,0x8
  aab361:	5b                   	pop    rbx
  aab362:	41 5e                	pop    r14
  aab364:	c3                   	ret
  aab365:	cc                   	int3
  aab366:	48 8b 05 d3 81 f3 00 	mov    rax,QWORD PTR [rip+0xf381d3]        # 19e3540 <__cxa_new_handler@@Base+0x2dd0>
  aab36d:	48 85 c0             	test   rax,rax
  aab370:	74 01                	je     aab373 <JNI_OnUnload@@Base+0x32c40>
  aab372:	c3                   	ret
  aab373:	50                   	push   rax
  aab374:	e8 46 ec fc ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  aab379:	cc                   	int3
  aab37a:	48 83 c7 08          	add    rdi,0x8
  aab37e:	e9 d5 0a 00 00       	jmp    aabe58 <JNI_OnUnload@@Base+0x33725>
  aab383:	cc                   	int3
  aab384:	53                   	push   rbx
  aab385:	48 89 fb             	mov    rbx,rdi
  aab388:	48 83 c7 08          	add    rdi,0x8
  aab38c:	e8 c7 0a 00 00       	call   aabe58 <JNI_OnUnload@@Base+0x33725>
  aab391:	48 89 df             	mov    rdi,rbx
  aab394:	5b                   	pop    rbx
  aab395:	e9 86 2b d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aab39a:	50                   	push   rax
  aab39b:	48 83 c7 28          	add    rdi,0x28
  aab39f:	e8 02 06 00 00       	call   aab9a6 <JNI_OnUnload@@Base+0x33273>
  aab3a4:	59                   	pop    rcx
  aab3a5:	c3                   	ret
  aab3a6:	55                   	push   rbp
  aab3a7:	41 57                	push   r15
  aab3a9:	41 56                	push   r14
  aab3ab:	41 55                	push   r13
  aab3ad:	41 54                	push   r12
  aab3af:	53                   	push   rbx
  aab3b0:	48 83 ec 68          	sub    rsp,0x68
  aab3b4:	45 89 c6             	mov    r14d,r8d
  aab3b7:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx
  aab3bb:	49 89 ff             	mov    r15,rdi
  aab3be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab3c5:	00 00
  aab3c7:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  aab3cc:	48 8d 77 08          	lea    rsi,[rdi+0x8]
  aab3d0:	48 8b 6f 28          	mov    rbp,QWORD PTR [rdi+0x28]
  aab3d4:	48 8b 5f 30          	mov    rbx,QWORD PTR [rdi+0x30]
  aab3d8:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
  aab3dd:	4c 89 e7             	mov    rdi,r12
  aab3e0:	e8 4b ff ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  aab3e5:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]
  aab3e9:	4d 85 ed             	test   r13,r13
  aab3ec:	74 53                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab3ee:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]
  aab3f2:	4d 85 e4             	test   r12,r12
  aab3f5:	74 46                	je     aab43d <JNI_OnUnload@@Base+0x32d0a>
  aab3f7:	48 89 e8             	mov    rax,rbp
  aab3fa:	31 ed                	xor    ebp,ebp
  aab3fc:	48 85 c0             	test   rax,rax
  aab3ff:	74 40                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab401:	48 85 db             	test   rbx,rbx
  aab404:	78 3b                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab406:	49 89 c7             	mov    r15,rax
  aab409:	44 89 f0             	mov    eax,r14d
  aab40c:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]
  aab410:	09 d0                	or     eax,edx
  aab412:	78 2d                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab414:	41 8b 8c 24 e0 13 00 	mov    ecx,DWORD PTR [r12+0x13e0]
  aab41b:	00
  aab41c:	8d 41 fd             	lea    eax,[rcx-0x3]
  aab41f:	83 f8 fe             	cmp    eax,0xfffffffe
  aab422:	72 1d                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab424:	89 d0                	mov    eax,edx
  aab426:	31 ed                	xor    ebp,ebp
  aab428:	48 29 c3             	sub    rbx,rax
  aab42b:	72 14                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab42d:	44 89 f2             	mov    edx,r14d
  aab430:	48 39 d3             	cmp    rbx,rdx
  aab433:	72 0c                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab435:	4c 89 fa             	mov    rdx,r15
  aab438:	4c 01 f8             	add    rax,r15
  aab43b:	73 3c                	jae    aab479 <JNI_OnUnload@@Base+0x32d46>
  aab43d:	31 ed                	xor    ebp,ebp
  aab43f:	eb 00                	jmp    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab441:	4d 85 ed             	test   r13,r13
  aab444:	0f 95 c3             	setne  bl
  aab447:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  aab44c:	e8 35 30 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab451:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab458:	00 00
  aab45a:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
  aab45f:	0f 85 39 01 00 00    	jne    aab59e <JNI_OnUnload@@Base+0x32e6b>
  aab465:	40 20 eb             	and    bl,bpl
  aab468:	89 d8                	mov    eax,ebx
  aab46a:	48 83 c4 68          	add    rsp,0x68
  aab46e:	5b                   	pop    rbx
  aab46f:	41 5c                	pop    r12
  aab471:	41 5d                	pop    r13
  aab473:	41 5e                	pop    r14
  aab475:	41 5f                	pop    r15
  aab477:	5d                   	pop    rbp
  aab478:	c3                   	ret
  aab479:	31 ed                	xor    ebp,ebp
  aab47b:	48 85 c0             	test   rax,rax
  aab47e:	74 c1                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab480:	83 e0 01             	and    eax,0x1
  aab483:	75 bc                	jne    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab485:	01 c9                	add    ecx,ecx
  aab487:	31 ed                	xor    ebp,ebp
  aab489:	44 89 f0             	mov    eax,r14d
  aab48c:	31 d2                	xor    edx,edx
  aab48e:	f7 f1                	div    ecx
  aab490:	85 d2                	test   edx,edx
  aab492:	75 ad                	jne    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab494:	45 85 f6             	test   r14d,r14d
  aab497:	74 47                	je     aab4e0 <JNI_OnUnload@@Base+0x32dad>
  aab499:	49 8b 9c 24 e8 13 00 	mov    rbx,QWORD PTR [r12+0x13e8]
  aab4a0:	00
  aab4a1:	49 83 a4 24 e8 13 00 	and    QWORD PTR [r12+0x13e8],0x0
  aab4a8:	00 00
  aab4aa:	4d 63 f6             	movsxd r14,r14d
  aab4ad:	49 d1 ee             	shr    r14,1
  aab4b0:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
  aab4b5:	48 85 db             	test   rbx,rbx
  aab4b8:	74 2e                	je     aab4e8 <JNI_OnUnload@@Base+0x32db5>
  aab4ba:	6a 01                	push   0x1
  aab4bc:	5a                   	pop    rdx
  aab4bd:	48 89 df             	mov    rdi,rbx
  aab4c0:	4c 89 f6             	mov    rsi,r14
  aab4c3:	e8 fe f5 aa 00       	call   155aac6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a004a>
  aab4c8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  aab4cb:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  aab4cf:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14
  aab4d3:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
  aab4d7:	c7 43 2c 00 00 80 3f 	mov    DWORD PTR [rbx+0x2c],0x3f800000
  aab4de:	eb 66                	jmp    aab546 <JNI_OnUnload@@Base+0x32e13>
  aab4e0:	40 b5 01             	mov    bpl,0x1
  aab4e3:	e9 59 ff ff ff       	jmp    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab4e8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  aab4ed:	4c 89 f6             	mov    rsi,r14
  aab4f0:	e8 0f d7 ff ff       	call   aa8c04 <JNI_OnUnload@@Base+0x304d1>
  aab4f5:	48 8d 54 24 47       	lea    rdx,[rsp+0x47]
  aab4fa:	c6 02 00             	mov    BYTE PTR [rdx],0x0
  aab4fd:	48 8d 4c 24 18       	lea    rcx,[rsp+0x18]
  aab502:	c7 01 00 00 80 3f    	mov    DWORD PTR [rcx],0x3f800000
  aab508:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  aab50d:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
  aab512:	e8 2f d6 ff ff       	call   aa8b46 <JNI_OnUnload@@Base+0x30413>
  aab517:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
  aab51c:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  aab51f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  aab523:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]
  aab528:	48 89 ef             	mov    rdi,rbp
  aab52b:	e8 b4 d6 ff ff       	call   aa8be4 <JNI_OnUnload@@Base+0x304b1>
  aab530:	48 89 df             	mov    rdi,rbx
  aab533:	e8 a4 d6 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  aab538:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  aab53d:	e8 e6 01 fd ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
  aab542:	48 8b 5d 00          	mov    rbx,QWORD PTR [rbp+0x0]
  aab546:	48 63 44 24 04       	movsxd rax,DWORD PTR [rsp+0x4]
  aab54b:	49 01 c7             	add    r15,rax
  aab54e:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  aab553:	4c 89 3f             	mov    QWORD PTR [rdi],r15
  aab556:	4c 89 77 08          	mov    QWORD PTR [rdi+0x8],r14
  aab55a:	0f 10 43 18          	movups xmm0,XMMWORD PTR [rbx+0x18]
  aab55e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  aab563:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
  aab566:	e8 d0 ed aa 00       	call   155a33b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39f8bf>
  aab56b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  aab56f:	48 83 64 24 38 00    	and    QWORD PTR [rsp+0x38],0x0
  aab575:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  aab57a:	48 89 1e             	mov    QWORD PTR [rsi],rbx
  aab57d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aab580:	ff 50 10             	call   QWORD PTR [rax+0x10]
  aab583:	89 c5                	mov    ebp,eax
  aab585:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  aab58a:	e8 4d d6 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  aab58f:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  aab594:	e8 43 d6 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  aab599:	e9 a3 fe ff ff       	jmp    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab59e:	e8 0d 45 d4 00       	call   17efab0 <__stack_chk_fail@plt>
  aab5a3:	48 89 c3             	mov    rbx,rax
  aab5a6:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  aab5ab:	e8 78 01 fd ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
  aab5b0:	eb 14                	jmp    aab5c6 <JNI_OnUnload@@Base+0x32e93>
  aab5b2:	eb 00                	jmp    aab5b4 <JNI_OnUnload@@Base+0x32e81>
  aab5b4:	48 89 c3             	mov    rbx,rax
  aab5b7:	eb 0d                	jmp    aab5c6 <JNI_OnUnload@@Base+0x32e93>
  aab5b9:	48 89 c3             	mov    rbx,rax
  aab5bc:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  aab5c1:	e8 16 d6 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  aab5c6:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  aab5cb:	e8 0c d6 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  aab5d0:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  aab5d5:	e8 ac 2e ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab5da:	48 89 df             	mov    rdi,rbx
  aab5dd:	e8 c3 e4 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  aab5e2:	55                   	push   rbp
  aab5e3:	41 57                	push   r15
  aab5e5:	41 56                	push   r14
  aab5e7:	53                   	push   rbx
  aab5e8:	48 83 ec 28          	sub    rsp,0x28
  aab5ec:	48 89 fb             	mov    rbx,rdi
  aab5ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab5f6:	00 00
  aab5f8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  aab5fd:	48 8d 77 08          	lea    rsi,[rdi+0x8]
  aab601:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  aab606:	4c 89 f7             	mov    rdi,r14
  aab609:	e8 22 fd ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  aab60e:	4d 8b 36             	mov    r14,QWORD PTR [r14]
  aab611:	4d 85 f6             	test   r14,r14
  aab614:	74 42                	je     aab658 <JNI_OnUnload@@Base+0x32f25>
  aab616:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]
  aab61a:	4d 85 ff             	test   r15,r15
  aab61d:	74 3b                	je     aab65a <JNI_OnUnload@@Base+0x32f27>
  aab61f:	40 b5 01             	mov    bpl,0x1
  aab622:	41 80 bf e4 13 00 00 	cmp    BYTE PTR [r15+0x13e4],0x0
  aab629:	00
  aab62a:	75 30                	jne    aab65c <JNI_OnUnload@@Base+0x32f29>
  aab62c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  aab62f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  aab634:	48 83 26 00          	and    QWORD PTR [rsi],0x0
  aab638:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aab63b:	ff 50 10             	call   QWORD PTR [rax+0x10]
  aab63e:	89 c3                	mov    ebx,eax
  aab640:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  aab645:	e8 92 d5 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  aab64a:	84 db                	test   bl,bl
  aab64c:	74 0c                	je     aab65a <JNI_OnUnload@@Base+0x32f27>
  aab64e:	41 c6 87 e4 13 00 00 	mov    BYTE PTR [r15+0x13e4],0x1
  aab655:	01
  aab656:	eb 04                	jmp    aab65c <JNI_OnUnload@@Base+0x32f29>
  aab658:	eb 02                	jmp    aab65c <JNI_OnUnload@@Base+0x32f29>
  aab65a:	31 ed                	xor    ebp,ebp
  aab65c:	4d 85 f6             	test   r14,r14
  aab65f:	0f 95 c3             	setne  bl
  aab662:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  aab667:	e8 1a 2e ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab66c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab673:	00 00
  aab675:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  aab67a:	75 10                	jne    aab68c <JNI_OnUnload@@Base+0x32f59>
  aab67c:	40 20 eb             	and    bl,bpl
  aab67f:	89 d8                	mov    eax,ebx
  aab681:	48 83 c4 28          	add    rsp,0x28
  aab685:	5b                   	pop    rbx
  aab686:	41 5e                	pop    r14
```
## All visible call-site windows for `aab330`

| addr | instruction |
|---:|---|
| `0xa7c4a2` | `a7c4a2:	e8 fe d5 ff ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xa7c4a7` | `a7c4a7:	cc                   	int3` |
| `0xa7c4a8` | `a7c4a8:	31 ff                	xor    edi,edi` |
| `0xa7c4aa` | `a7c4aa:	83 fa 01             	cmp    edx,0x1` |
| `0xa7c4ad` | `a7c4ad:	40 0f 94 c7          	sete   dil` |
| `0xa7c4b1` | `a7c4b1:	e9 9a ac d5 00       	jmp    17d7150 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x2f71>` |
| `0xa7c4b6` | `a7c4b6:	41 56                	push   r14` |
| `0xa7c4b8` | `a7c4b8:	53                   	push   rbx` |
| `0xa7c4b9` | `a7c4b9:	48 83 ec 28          	sub    rsp,0x28` |
| `0xa7c4bd` | `a7c4bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa7c4c4` | `a7c4c4:	00 00` |
| `0xa7c4c6` | `a7c4c6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xa7c4cb` | `a7c4cb:	48 89 e3             	mov    rbx,rsp` |
| `0xa7c4ce` | `a7c4ce:	48 89 df             	mov    rdi,rbx` |
| `0xa7c4d1` | `a7c4d1:	e8 4e 9d d5 00       	call   17d6224 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x2045>` |
| `0xa7c4d6` | `a7c4d6:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]` |
| `0xa7c4db` | `a7c4db:	4c 89 f7             	mov    rdi,r14` |
| `0xa7c4de` | `a7c4de:	48 89 de             	mov    rsi,rbx` |
| `0xa7c4e1` | `a7c4e1:	e8 4a ee 02 00       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xa7c4e6` | `a7c4e6:	49 8b 1e             	mov    rbx,QWORD PTR [r14]` |
| `0xa7c4e9` | `a7c4e9:	48 85 db             	test   rbx,rbx` |
| `0xa7c4ec` | `a7c4ec:	74 49                	je     a7c537 <JNI_OnUnload@@Base+0x3e04>` |
| `0xa7c4ee` | `a7c4ee:	48 89 df             	mov    rdi,rbx` |
| `0xa7c4f1` | `a7c4f1:	e8 b4 a0 d5 00       	call   17d65aa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x23cb>` |
| `0xa7c4f6` | `a7c4f6:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xa7c4fb` | `a7c4fb:	74 2f                	je     a7c52c <JNI_OnUnload@@Base+0x3df9>` |
| `0xa7c4fd` | `a7c4fd:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]` |
| `0xa7c501` | `a7c501:	e8 d8 b1 03 00       	call   ab76de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x467e>` |
| `0xa7c506` | `a7c506:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0` |
| `0xa7c50b` | `a7c50b:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]` |
| `0xa7c50f` | `a7c50f:	48 85 c0             	test   rax,rax` |
| `0xa7c512` | `a7c512:	74 13                	je     a7c527 <JNI_OnUnload@@Base+0x3df4>` |
| `0xa7c514` | `a7c514:	31 c9                	xor    ecx,ecx` |
| `0xa7c516` | `a7c516:	48 8b 53 28          	mov    rdx,QWORD PTR [rbx+0x28]` |
| `0xa7c51a` | `a7c51a:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0` |
| `0xa7c51f` | `a7c51f:	48 ff c1             	inc    rcx` |
| `0xa7c522` | `a7c522:	48 39 c8             	cmp    rax,rcx` |
| `0xa7c525` | `a7c525:	75 ef                	jne    a7c516 <JNI_OnUnload@@Base+0x3de3>` |
| `0xa7c527` | `a7c527:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0xa7c52c` | `a7c52c:	6a 01                	push   0x1` |
| `0xa7c52e` | `a7c52e:	5e                   	pop    rsi` |
| `0xa7c52f` | `a7c52f:	48 89 df             	mov    rdi,rbx` |
| `0xa7c532` | `a7c532:	e8 03 30 0e 00       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>` |
| `0xa7c537` | `a7c537:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]` |
| `0xa7c53c` | `a7c53c:	e8 45 1f 02 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa7c541` | `a7c541:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xa7c546` | `a7c546:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa7c54d` | `a7c54d:	00 00` |
| `0xa7c54f` | `a7c54f:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xa7c554` | `a7c554:	75 0c                	jne    a7c562 <JNI_OnUnload@@Base+0x3e2f>` |
| `0xa7c556` | `a7c556:	48 83 c4 28          	add    rsp,0x28` |
| `0xa7c55a` | `a7c55a:	5b                   	pop    rbx` |
| `0xaaaeff` | `aaaeff:	41 56                	push   r14` |
| `0xaaaf01` | `aaaf01:	41 55                	push   r13` |
| `0xaaaf03` | `aaaf03:	41 54                	push   r12` |
| `0xaaaf05` | `aaaf05:	53                   	push   rbx` |
| `0xaaaf06` | `aaaf06:	48 83 ec 68          	sub    rsp,0x68` |
| `0xaaaf0a` | `aaaf0a:	f3 0f 11 4c 24 04    	movss  DWORD PTR [rsp+0x4],xmm1` |
| `0xaaaf10` | `aaaf10:	f3 0f 11 04 24       	movss  DWORD PTR [rsp],xmm0` |
| `0xaaaf15` | `aaaf15:	45 89 cd             	mov    r13d,r9d` |
| `0xaaaf18` | `aaaf18:	44 89 c5             	mov    ebp,r8d` |
| `0xaaaf1b` | `aaaf1b:	41 89 cc             	mov    r12d,ecx` |
| `0xaaaf1e` | `aaaf1e:	89 d3                	mov    ebx,edx` |
| `0xaaaf20` | `aaaf20:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi` |
| `0xaaaf25` | `aaaf25:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaaaf2c` | `aaaf2c:	00 00` |
| `0xaaaf2e` | `aaaf2e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xaaaf33` | `aaaf33:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaaaf37` | `aaaf37:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]` |
| `0xaaaf3c` | `aaaf3c:	4c 89 f7             	mov    rdi,r14` |
| `0xaaaf3f` | `aaaf3f:	e8 ec 03 00 00       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaaaf44` | `aaaf44:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaaaf47` | `aaaf47:	45 31 ff             	xor    r15d,r15d` |
| `0xaaaf4a` | `aaaf4a:	4d 85 f6             	test   r14,r14` |
| `0xaaaf4d` | `aaaf4d:	0f 84 95 02 00 00    	je     aab1e8 <JNI_OnUnload@@Base+0x32ab5>` |
| `0xaaaf53` | `aaaf53:	84 db                	test   bl,bl` |
| `0xaaaf55` | `aaaf55:	0f 95 44 24 30       	setne  BYTE PTR [rsp+0x30]` |
| `0xaaaf5a` | `aaaf5a:	45 84 ed             	test   r13b,r13b` |
| `0xaaaf5d` | `aaaf5d:	66 0f 6e 44 24 04    	movd   xmm0,DWORD PTR [rsp+0x4]` |
| `0xaaaf63` | `aaaf63:	66 0f 7e c0          	movd   eax,xmm0` |
| `0xaaaf67` | `aaaf67:	44 0f 45 f8          	cmovne r15d,eax` |
| `0xaaaf6b` | `aaaf6b:	44 89 64 24 34       	mov    DWORD PTR [rsp+0x34],r12d` |
| `0xaaaf70` | `aaaf70:	89 6c 24 38          	mov    DWORD PTR [rsp+0x38],ebp` |
| `0xaaaf74` | `aaaf74:	44 89 7c 24 3c       	mov    DWORD PTR [rsp+0x3c],r15d` |
| `0xaaaf79` | `aaaf79:	f3 0f 10 04 24       	movss  xmm0,DWORD PTR [rsp]` |
| `0xaaaf7e` | `aaaf7e:	f3 0f 11 44 24 40    	movss  DWORD PTR [rsp+0x40],xmm0` |
| `0xaaaf84` | `aaaf84:	0f 95 44 24 44       	setne  BYTE PTR [rsp+0x44]` |
| `0xaaaf89` | `aaaf89:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14` |
| `0xaaaf8e` | `aaaf8e:	c6 44 24 58 01       	mov    BYTE PTR [rsp+0x58],0x1` |
| `0xaaaf93` | `aaaf93:	4c 89 f7             	mov    rdi,r14` |
| `0xaaaf96` | `aaaf96:	e8 55 31 d4 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xaaaf9b` | `aaaf9b:	b3 01                	mov    bl,0x1` |
| `0xaaaf9d` | `aaaf9d:	41 80 7e 28 00       	cmp    BYTE PTR [r14+0x28],0x0` |
| `0xaaafa2` | `aaafa2:	0f 84 ab 00 00 00    	je     aab053 <JNI_OnUnload@@Base+0x32920>` |
| `0xaaafa8` | `aaafa8:	45 31 e4             	xor    r12d,r12d` |
| `0xaaafab` | `aaafab:	45 31 ff             	xor    r15d,r15d` |
| `0xaaafae` | `aaafae:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]` |
| `0xaaafb3` | `aaafb3:	e8 78 0e 00 00       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0xaaafb8` | `aaafb8:	84 db                	test   bl,bl` |
| `0xaaafba` | `aaafba:	74 08                	je     aaafc4 <JNI_OnUnload@@Base+0x32891>` |
| `0xaaafbc` | `aaafbc:	45 31 ff             	xor    r15d,r15d` |
| `0xaaafbf` | `aaafbf:	e9 24 02 00 00       	jmp    aab1e8 <JNI_OnUnload@@Base+0x32ab5>` |
| `0xaaafc4` | `aaafc4:	6a 48                	push   0x48` |
| `0xaaafc6` | `aaafc6:	5f                   	pop    rdi` |
| `0xaaafc7` | `aaafc7:	e8 34 2f d4 00       	call   17edf00 <_Znwm@plt>` |
| `0xaaafcc` | `aaafcc:	49 89 c6             	mov    r14,rax` |
| `0xaaafcf` | `aaafcf:	4d 09 e7             	or     r15,r12` |
| `0xaaafd2` | `aaafd2:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]` |
| `0xaaafd7` | `aaafd7:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0xaaafdc` | `aaafdc:	48 85 c0             	test   rax,rax` |
| `0xaaafdf` | `aaafdf:	74 05                	je     aaafe6 <JNI_OnUnload@@Base+0x328b3>` |
| `0xaaafe1` | `aaafe1:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0xaaafe6` | `aaafe6:	48 8d 05 13 2c d5 00 	lea    rax,[rip+0xd52c13]        # 17fdc00 <_ZTINSt6__ndk117bad_function_callE@@Base+0xca0>` |
| `0xaaafed` | `aaafed:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xaaaff0` | `aaaff0:	4c 89 f6             	mov    rsi,r14` |
| `0xaaaff3` | `aaaff3:	48 83 c6 08          	add    rsi,0x8` |
| `0xaaaff7` | `aaaff7:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0` |
| `0xaaaffc` | `aaaffc:	49 83 66 18 00       	and    QWORD PTR [r14+0x18],0x0` |
| `0xaab001` | `aab001:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15` |
| `0xaab005` | `aab005:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]` |
| `0xaab00a` | `aab00a:	48 89 df             	mov    rdi,rbx` |
| `0xaab00d` | `aab00d:	e8 1e 03 00 00       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab012` | `aab012:	4c 8b 23             	mov    r12,QWORD PTR [rbx]` |
| `0xaab015` | `aab015:	4d 85 e4             	test   r12,r12` |
| `0xaab018` | `aab018:	0f 84 49 01 00 00    	je     aab167 <JNI_OnUnload@@Base+0x32a34>` |
| `0xaab01e` | `aab01e:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12` |
| `0xaab023` | `aab023:	c6 44 24 38 01       	mov    BYTE PTR [rsp+0x38],0x1` |
| `0xaab028` | `aab028:	4c 89 e7             	mov    rdi,r12` |
| `0xaab02b` | `aab02b:	e8 c0 30 d4 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xaab030` | `aab030:	49 8d 7c 24 38       	lea    rdi,[r12+0x38]` |
| `0xaab035` | `aab035:	4c 89 fe             	mov    rsi,r15` |
| `0xaab038` | `aab038:	e8 33 ec ff ff       	call   aa9c70 <JNI_OnUnload@@Base+0x3153d>` |
| `0xaab03d` | `aab03d:	49 83 c4 40          	add    r12,0x40` |
| `0xaab041` | `aab041:	4c 39 e0             	cmp    rax,r12` |
| `0xaab044` | `aab044:	0f 84 0d 01 00 00    	je     aab157 <JNI_OnUnload@@Base+0x32a24>` |
| `0xaab04a` | `aab04a:	48 8b 58 28          	mov    rbx,QWORD PTR [rax+0x28]` |
| `0xaab04e` | `aab04e:	e9 06 01 00 00       	jmp    aab159 <JNI_OnUnload@@Base+0x32a26>` |
| `0xaab053` | `aab053:	49 8b 76 50          	mov    rsi,QWORD PTR [r14+0x50]` |
| `0xaab057` | `aab057:	45 31 e4             	xor    r12d,r12d` |
| `0xaab05a` | `aab05a:	48 85 f6             	test   rsi,rsi` |
| `0xaab05d` | `aab05d:	0f 84 48 ff ff ff    	je     aaafab <JNI_OnUnload@@Base+0x32878>` |
| `0xaab063` | `aab063:	b8 c0 e0 ff ff       	mov    eax,0xffffe0c0` |
| `0xaab068` | `aab068:	03 44 24 34          	add    eax,DWORD PTR [rsp+0x34]` |
| `0xaab06c` | `aab06c:	3d c0 ce 02 00       	cmp    eax,0x2cec0` |
| `0xaab071` | `aab071:	0f 87 34 ff ff ff    	ja     aaafab <JNI_OnUnload@@Base+0x32878>` |
| `0xaab077` | `aab077:	8b 44 24 38          	mov    eax,DWORD PTR [rsp+0x38]` |
| `0xaab07b` | `aab07b:	ff c8                	dec    eax` |
| `0xaab07d` | `aab07d:	83 f8 01             	cmp    eax,0x1` |
| `0xaab080` | `aab080:	0f 87 22 ff ff ff    	ja     aaafa8 <JNI_OnUnload@@Base+0x32875>` |
| `0xaab086` | `aab086:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xaab089` | `aab089:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]` |
| `0xaab08e` | `aab08e:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]` |
| `0xaab093` | `aab093:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xaab096` | `aab096:	48 8b 6c 24 28       	mov    rbp,QWORD PTR [rsp+0x28]` |
| `0xaab09b` | `aab09b:	48 85 ed             	test   rbp,rbp` |
| `0xaab2ef` | `aab2ef:	e8 3c 0b 00 00       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0xaab2f4` | `aab2f4:	eb 31                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>` |
| `0xaab2f6` | `aab2f6:	48 89 c3             	mov    rbx,rax` |
| `0xaab2f9` | `aab2f9:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]` |
| `0xaab2fe` | `aab2fe:	e8 83 31 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaab303` | `aab303:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0xaab307` | `aab307:	e8 a6 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xaab30c` | `aab30c:	31 ff                	xor    edi,edi` |
| `0xaab30e` | `aab30e:	e8 9f 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xaab313` | `aab313:	31 ff                	xor    edi,edi` |
| `0xaab315` | `aab315:	e8 98 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xaab31a` | `aab31a:	4c 89 f7             	mov    rdi,r14` |
| `0xaab31d` | `aab31d:	e8 fe 2b d4 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xaab322` | `aab322:	eb 03                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>` |
| `0xaab324` | `aab324:	48 89 c3             	mov    rbx,rax` |
| `0xaab327` | `aab327:	48 89 df             	mov    rdi,rbx` |
| `0xaab32a` | `aab32a:	e8 76 e7 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xaab32f` | `aab32f:	cc                   	int3` |
| `0xaab330` | `aab330:	41 56                	push   r14` |
| `0xaab332` | `aab332:	53                   	push   rbx` |
| `0xaab333` | `aab333:	50                   	push   rax` |
| `0xaab334` | `aab334:	48 89 fb             	mov    rbx,rdi` |
| `0xaab337` | `aab337:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xaab33a` | `aab33a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0xaab33d` | `aab33d:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]` |
| `0xaab341` | `aab341:	48 85 ff             	test   rdi,rdi` |
| `0xaab344` | `aab344:	74 17                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>` |
| `0xaab346` | `aab346:	49 89 f6             	mov    r14,rsi` |
| `0xaab349` | `aab349:	e8 f2 2d d4 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>` |
| `0xaab34e` | `aab34e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0xaab352` | `aab352:	48 85 c0             	test   rax,rax` |
| `0xaab355` | `aab355:	74 06                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>` |
| `0xaab357` | `aab357:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xaab35a` | `aab35a:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xaab35d` | `aab35d:	48 83 c4 08          	add    rsp,0x8` |
| `0xaab361` | `aab361:	5b                   	pop    rbx` |
| `0xaab362` | `aab362:	41 5e                	pop    r14` |
| `0xaab364` | `aab364:	c3                   	ret` |
| `0xaab365` | `aab365:	cc                   	int3` |
| `0xaab366` | `aab366:	48 8b 05 d3 81 f3 00 	mov    rax,QWORD PTR [rip+0xf381d3]        # 19e3540 <__cxa_new_handler@@Base+0x2dd0>` |
| `0xaab36d` | `aab36d:	48 85 c0             	test   rax,rax` |
| `0xaab370` | `aab370:	74 01                	je     aab373 <JNI_OnUnload@@Base+0x32c40>` |
| `0xaab372` | `aab372:	c3                   	ret` |
| `0xaab373` | `aab373:	50                   	push   rax` |
| `0xaab374` | `aab374:	e8 46 ec fc ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>` |
| `0xaab379` | `aab379:	cc                   	int3` |
| `0xaab37a` | `aab37a:	48 83 c7 08          	add    rdi,0x8` |
| `0xaab37e` | `aab37e:	e9 d5 0a 00 00       	jmp    aabe58 <JNI_OnUnload@@Base+0x33725>` |
| `0xaab383` | `aab383:	cc                   	int3` |
| `0xaab384` | `aab384:	53                   	push   rbx` |
| `0xaab385` | `aab385:	48 89 fb             	mov    rbx,rdi` |
| `0xaab388` | `aab388:	48 83 c7 08          	add    rdi,0x8` |
| `0xaab3a6` | `aab3a6:	55                   	push   rbp` |
| `0xaab3a7` | `aab3a7:	41 57                	push   r15` |
| `0xaab3a9` | `aab3a9:	41 56                	push   r14` |
| `0xaab3ab` | `aab3ab:	41 55                	push   r13` |
| `0xaab3ad` | `aab3ad:	41 54                	push   r12` |
| `0xaab3af` | `aab3af:	53                   	push   rbx` |
| `0xaab3b0` | `aab3b0:	48 83 ec 68          	sub    rsp,0x68` |
| `0xaab3b4` | `aab3b4:	45 89 c6             	mov    r14d,r8d` |
| `0xaab3b7` | `aab3b7:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx` |
| `0xaab3bb` | `aab3bb:	49 89 ff             	mov    r15,rdi` |
| `0xaab3be` | `aab3be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab3c5` | `aab3c5:	00 00` |
| `0xaab3c7` | `aab3c7:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xaab3cc` | `aab3cc:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab3d0` | `aab3d0:	48 8b 6f 28          	mov    rbp,QWORD PTR [rdi+0x28]` |
| `0xaab3d4` | `aab3d4:	48 8b 5f 30          	mov    rbx,QWORD PTR [rdi+0x30]` |
| `0xaab3d8` | `aab3d8:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]` |
| `0xaab3dd` | `aab3dd:	4c 89 e7             	mov    rdi,r12` |
| `0xaab3e0` | `aab3e0:	e8 4b ff ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab3e5` | `aab3e5:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]` |
| `0xaab3e9` | `aab3e9:	4d 85 ed             	test   r13,r13` |
| `0xaab3ec` | `aab3ec:	74 53                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab3ee` | `aab3ee:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]` |
| `0xaab3f2` | `aab3f2:	4d 85 e4             	test   r12,r12` |
| `0xaab3f5` | `aab3f5:	74 46                	je     aab43d <JNI_OnUnload@@Base+0x32d0a>` |
| `0xaab3f7` | `aab3f7:	48 89 e8             	mov    rax,rbp` |
| `0xaab3fa` | `aab3fa:	31 ed                	xor    ebp,ebp` |
| `0xaab3fc` | `aab3fc:	48 85 c0             	test   rax,rax` |
| `0xaab3ff` | `aab3ff:	74 40                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab401` | `aab401:	48 85 db             	test   rbx,rbx` |
| `0xaab404` | `aab404:	78 3b                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab406` | `aab406:	49 89 c7             	mov    r15,rax` |
| `0xaab409` | `aab409:	44 89 f0             	mov    eax,r14d` |
| `0xaab40c` | `aab40c:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]` |
| `0xaab410` | `aab410:	09 d0                	or     eax,edx` |
| `0xaab412` | `aab412:	78 2d                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab414` | `aab414:	41 8b 8c 24 e0 13 00 	mov    ecx,DWORD PTR [r12+0x13e0]` |
| `0xaab41b` | `aab41b:	00` |
| `0xaab41c` | `aab41c:	8d 41 fd             	lea    eax,[rcx-0x3]` |
| `0xaab41f` | `aab41f:	83 f8 fe             	cmp    eax,0xfffffffe` |
| `0xaab422` | `aab422:	72 1d                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab424` | `aab424:	89 d0                	mov    eax,edx` |
| `0xaab426` | `aab426:	31 ed                	xor    ebp,ebp` |
| `0xaab428` | `aab428:	48 29 c3             	sub    rbx,rax` |
| `0xaab42b` | `aab42b:	72 14                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab42d` | `aab42d:	44 89 f2             	mov    edx,r14d` |
| `0xaab430` | `aab430:	48 39 d3             	cmp    rbx,rdx` |
| `0xaab433` | `aab433:	72 0c                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab435` | `aab435:	4c 89 fa             	mov    rdx,r15` |
| `0xaab438` | `aab438:	4c 01 f8             	add    rax,r15` |
| `0xaab43b` | `aab43b:	73 3c                	jae    aab479 <JNI_OnUnload@@Base+0x32d46>` |
| `0xaab43d` | `aab43d:	31 ed                	xor    ebp,ebp` |
| `0xaab5c6` | `aab5c6:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]` |
| `0xaab5cb` | `aab5cb:	e8 0c d6 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>` |
| `0xaab5d0` | `aab5d0:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xaab5d5` | `aab5d5:	e8 ac 2e ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaab5da` | `aab5da:	48 89 df             	mov    rdi,rbx` |
| `0xaab5dd` | `aab5dd:	e8 c3 e4 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xaab5e2` | `aab5e2:	55                   	push   rbp` |
| `0xaab5e3` | `aab5e3:	41 57                	push   r15` |
| `0xaab5e5` | `aab5e5:	41 56                	push   r14` |
| `0xaab5e7` | `aab5e7:	53                   	push   rbx` |
| `0xaab5e8` | `aab5e8:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaab5ec` | `aab5ec:	48 89 fb             	mov    rbx,rdi` |
| `0xaab5ef` | `aab5ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab5f6` | `aab5f6:	00 00` |
| `0xaab5f8` | `aab5f8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab5fd` | `aab5fd:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab601` | `aab601:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xaab606` | `aab606:	4c 89 f7             	mov    rdi,r14` |
| `0xaab609` | `aab609:	e8 22 fd ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab60e` | `aab60e:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaab611` | `aab611:	4d 85 f6             	test   r14,r14` |
| `0xaab614` | `aab614:	74 42                	je     aab658 <JNI_OnUnload@@Base+0x32f25>` |
| `0xaab616` | `aab616:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]` |
| `0xaab61a` | `aab61a:	4d 85 ff             	test   r15,r15` |
| `0xaab61d` | `aab61d:	74 3b                	je     aab65a <JNI_OnUnload@@Base+0x32f27>` |
| `0xaab61f` | `aab61f:	40 b5 01             	mov    bpl,0x1` |
| `0xaab622` | `aab622:	41 80 bf e4 13 00 00 	cmp    BYTE PTR [r15+0x13e4],0x0` |
| `0xaab629` | `aab629:	00` |
| `0xaab62a` | `aab62a:	75 30                	jne    aab65c <JNI_OnUnload@@Base+0x32f29>` |
| `0xaab62c` | `aab62c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xaab62f` | `aab62f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xaab634` | `aab634:	48 83 26 00          	and    QWORD PTR [rsi],0x0` |
| `0xaab638` | `aab638:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaab63b` | `aab63b:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xaab63e` | `aab63e:	89 c3                	mov    ebx,eax` |
| `0xaab640` | `aab640:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xaab645` | `aab645:	e8 92 d5 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>` |
| `0xaab64a` | `aab64a:	84 db                	test   bl,bl` |
| `0xaab64c` | `aab64c:	74 0c                	je     aab65a <JNI_OnUnload@@Base+0x32f27>` |
| `0xaab64e` | `aab64e:	41 c6 87 e4 13 00 00 	mov    BYTE PTR [r15+0x13e4],0x1` |
| `0xaab655` | `aab655:	01` |
| `0xaab656` | `aab656:	eb 04                	jmp    aab65c <JNI_OnUnload@@Base+0x32f29>` |
| `0xaab658` | `aab658:	eb 02                	jmp    aab65c <JNI_OnUnload@@Base+0x32f29>` |
| `0xaab65a` | `aab65a:	31 ed                	xor    ebp,ebp` |
| `0xaab65c` | `aab65c:	4d 85 f6             	test   r14,r14` |
| `0xaab65f` | `aab65f:	0f 95 c3             	setne  bl` |
| `0xaab662` | `aab662:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xaab667` | `aab667:	e8 1a 2e ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaab66c` | `aab66c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab673` | `aab673:	00 00` |
| `0xaab675` | `aab675:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xaab67a` | `aab67a:	75 10                	jne    aab68c <JNI_OnUnload@@Base+0x32f59>` |
| `0xaab6ba` | `aab6ba:	59                   	pop    rcx` |
| `0xaab6bb` | `aab6bb:	c3                   	ret` |
| `0xaab6bc` | `aab6bc:	55                   	push   rbp` |
| `0xaab6bd` | `aab6bd:	41 57                	push   r15` |
| `0xaab6bf` | `aab6bf:	41 56                	push   r14` |
| `0xaab6c1` | `aab6c1:	41 55                	push   r13` |
| `0xaab6c3` | `aab6c3:	41 54                	push   r12` |
| `0xaab6c5` | `aab6c5:	53                   	push   rbx` |
| `0xaab6c6` | `aab6c6:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaab6ca` | `aab6ca:	48 89 fb             	mov    rbx,rdi` |
| `0xaab6cd` | `aab6cd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab6d4` | `aab6d4:	00 00` |
| `0xaab6d6` | `aab6d6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab6db` | `aab6db:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab6df` | `aab6df:	4c 8b 7f 38          	mov    r15,QWORD PTR [rdi+0x38]` |
| `0xaab6e3` | `aab6e3:	48 8b 6f 40          	mov    rbp,QWORD PTR [rdi+0x40]` |
| `0xaab6e7` | `aab6e7:	49 89 e6             	mov    r14,rsp` |
| `0xaab6ea` | `aab6ea:	4c 89 f7             	mov    rdi,r14` |
| `0xaab6ed` | `aab6ed:	e8 3e fc ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab6f2` | `aab6f2:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xaab6f6` | `aab6f6:	74 49                	je     aab741 <JNI_OnUnload@@Base+0x3300e>` |
| `0xaab6f8` | `aab6f8:	4c 8b 73 18          	mov    r14,QWORD PTR [rbx+0x18]` |
| `0xaab6fc` | `aab6fc:	31 db                	xor    ebx,ebx` |
| `0xaab6fe` | `aab6fe:	4d 85 f6             	test   r14,r14` |
| `0xaab701` | `aab701:	0f 84 da 00 00 00    	je     aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab707` | `aab707:	48 85 ed             	test   rbp,rbp` |
| `0xaab70a` | `aab70a:	0f 88 d1 00 00 00    	js     aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab710` | `aab710:	74 15                	je     aab727 <JNI_OnUnload@@Base+0x32ff4>` |
| `0xaab712` | `aab712:	4d 85 ff             	test   r15,r15` |
| `0xaab715` | `aab715:	0f 84 c6 00 00 00    	je     aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab71b` | `aab71b:	44 89 f8             	mov    eax,r15d` |
| `0xaab71e` | `aab71e:	83 e0 01             	and    eax,0x1` |
| `0xaab721` | `aab721:	0f 85 ba 00 00 00    	jne    aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab727` | `aab727:	4d 8d ae f0 13 00 00 	lea    r13,[r14+0x13f0]` |
| `0xaab72e` | `aab72e:	4d 8b a6 f0 13 00 00 	mov    r12,QWORD PTR [r14+0x13f0]` |
| `0xaab735` | `aab735:	4d 85 e4             	test   r12,r12` |
| `0xaab738` | `aab738:	74 0e                	je     aab748 <JNI_OnUnload@@Base+0x33015>` |
| `0xaab73a` | `aab73a:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0` |
| `0xaab73f` | `aab73f:	eb 23                	jmp    aab764 <JNI_OnUnload@@Base+0x33031>` |
| `0xaab741` | `aab741:	31 db                	xor    ebx,ebx` |
| `0xaab743` | `aab743:	e9 99 00 00 00       	jmp    aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab748` | `aab748:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xaab74b` | `aab74b:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xaab74e` | `aab74e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xaab753` | `aab753:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0xaab756` | `aab756:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]` |
| `0xaab75b` | `aab75b:	4d 85 e4             	test   r12,r12` |
| `0xaab75e` | `aab75e:	0f 84 a8 00 00 00    	je     aab80c <JNI_OnUnload@@Base+0x330d9>` |
| `0xaab764` | `aab764:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0` |
| `0xaab76a` | `aab76a:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12` |
| `0xaab76f` | `aab76f:	49 8b 54 24 20       	mov    rdx,QWORD PTR [r12+0x20]` |
| `0xaab774` | `aab774:	31 db                	xor    ebx,ebx` |
| `0xaab82c` | `aab82c:	eb 03                	jmp    aab831 <JNI_OnUnload@@Base+0x330fe>` |
| `0xaab82e` | `aab82e:	48 89 c3             	mov    rbx,rax` |
| `0xaab831` | `aab831:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xaab836` | `aab836:	e8 4b 2c ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaab83b` | `aab83b:	48 89 df             	mov    rdi,rbx` |
| `0xaab83e` | `aab83e:	e8 62 e2 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xaab843` | `aab843:	cc                   	int3` |
| `0xaab844` | `aab844:	55                   	push   rbp` |
| `0xaab845` | `aab845:	41 56                	push   r14` |
| `0xaab847` | `aab847:	53                   	push   rbx` |
| `0xaab848` | `aab848:	48 83 ec 20          	sub    rsp,0x20` |
| `0xaab84c` | `aab84c:	48 89 fb             	mov    rbx,rdi` |
| `0xaab84f` | `aab84f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab856` | `aab856:	00 00` |
| `0xaab858` | `aab858:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xaab85d` | `aab85d:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab861` | `aab861:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xaab866` | `aab866:	4c 89 f7             	mov    rdi,r14` |
| `0xaab869` | `aab869:	e8 c2 fa ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab86e` | `aab86e:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaab871` | `aab871:	4d 85 f6             	test   r14,r14` |
| `0xaab874` | `aab874:	74 16                	je     aab88c <JNI_OnUnload@@Base+0x33159>` |
| `0xaab876` | `aab876:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]` |
| `0xaab87a` | `aab87a:	48 85 c0             	test   rax,rax` |
| `0xaab87d` | `aab87d:	74 0f                	je     aab88e <JNI_OnUnload@@Base+0x3315b>` |
| `0xaab87f` | `aab87f:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0xaab882` | `aab882:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaab885` | `aab885:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xaab888` | `aab888:	89 c3                	mov    ebx,eax` |
| `0xaab88a` | `aab88a:	eb 04                	jmp    aab890 <JNI_OnUnload@@Base+0x3315d>` |
| `0xaab88c` | `aab88c:	eb 02                	jmp    aab890 <JNI_OnUnload@@Base+0x3315d>` |
| `0xaab88e` | `aab88e:	31 db                	xor    ebx,ebx` |
| `0xaab890` | `aab890:	4d 85 f6             	test   r14,r14` |
| `0xaab893` | `aab893:	40 0f 95 c5          	setne  bpl` |
| `0xaab897` | `aab897:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xaab89c` | `aab89c:	e8 e5 2b ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaab8a1` | `aab8a1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab8a8` | `aab8a8:	00 00` |
| `0xaab8aa` | `aab8aa:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xaab8af` | `aab8af:	75 0e                	jne    aab8bf <JNI_OnUnload@@Base+0x3318c>` |
| `0xaab8b1` | `aab8b1:	40 20 dd             	and    bpl,bl` |
| `0xaab8b4` | `aab8b4:	89 e8                	mov    eax,ebp` |
| `0xaab8b6` | `aab8b6:	48 83 c4 20          	add    rsp,0x20` |
| `0xaab8ba` | `aab8ba:	5b                   	pop    rbx` |
| `0xaab8bb` | `aab8bb:	41 5e                	pop    r14` |
| `0xaab8bd` | `aab8bd:	5d                   	pop    rbp` |
| `0xaab8be` | `aab8be:	c3                   	ret` |
| `0xaab8bf` | `aab8bf:	e8 ec 41 d4 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xaab8c4` | `aab8c4:	48 89 c3             	mov    rbx,rax` |
| `0xaab8c7` | `aab8c7:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xaab8cc` | `aab8cc:	e8 b5 2b ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaab8d1` | `aab8d1:	48 89 df             	mov    rdi,rbx` |
| `0xaab8d4` | `aab8d4:	e8 cc e1 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xaab8d9` | `aab8d9:	cc                   	int3` |
| `0xaab8da` | `aab8da:	55                   	push   rbp` |
| `0xaab8db` | `aab8db:	41 57                	push   r15` |
| `0xaab8dd` | `aab8dd:	41 56                	push   r14` |
| `0xaab8df` | `aab8df:	53                   	push   rbx` |
| `0xaab8e0` | `aab8e0:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaab8e4` | `aab8e4:	48 89 d3             	mov    rbx,rdx` |
| `0xaab8e7` | `aab8e7:	49 89 fe             	mov    r14,rdi` |
| `0xaab8ea` | `aab8ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab8f1` | `aab8f1:	00 00` |
| `0xaab8f3` | `aab8f3:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab8f8` | `aab8f8:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab8fc` | `aab8fc:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]` |
| `0xaab901` | `aab901:	4c 89 ff             	mov    rdi,r15` |
| `0xaab904` | `aab904:	e8 27 fa ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab909` | `aab909:	4d 8b 3f             	mov    r15,QWORD PTR [r15]` |
| `0xaab90c` | `aab90c:	4d 85 ff             	test   r15,r15` |
| `0xaab90f` | `aab90f:	74 4b                	je     aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab911` | `aab911:	4d 8b 76 18          	mov    r14,QWORD PTR [r14+0x18]` |
| `0xaab915` | `aab915:	31 ed                	xor    ebp,ebp` |
| `0xaab917` | `aab917:	4d 85 f6             	test   r14,r14` |
| `0xaab91a` | `aab91a:	74 40                	je     aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab91c` | `aab91c:	48 85 db             	test   rbx,rbx` |
| `0xaab91f` | `aab91f:	78 3b                	js     aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab921` | `aab921:	49 83 be f0 13 00 00 	cmp    QWORD PTR [r14+0x13f0],0x0` |
| `0xaab928` | `aab928:	00` |
| `0xaab929` | `aab929:	74 13                	je     aab93e <JNI_OnUnload@@Base+0x3320b>` |
| `0xaab92b` | `aab92b:	49 8d b6 f0 13 00 00 	lea    rsi,[r14+0x13f0]` |
| `0xaab932` | `aab932:	49 8d be e8 13 00 00 	lea    rdi,[r14+0x13e8]` |
| `0xaab939` | `aab939:	e8 02 05 00 00       	call   aabe40 <JNI_OnUnload@@Base+0x3370d>` |
| `0xaab93e` | `aab93e:	41 c6 86 e4 13 00 00 	mov    BYTE PTR [r14+0x13e4],0x0` |
| `0xaab945` | `aab945:	00` |
| `0xaab946` | `aab946:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xaab94b` | `aab94b:	48 89 1e             	mov    QWORD PTR [rsi],rbx` |
| `0xaab94e` | `aab94e:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xaab951` | `aab951:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaab954` | `aab954:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0xaab957` | `aab957:	40 b5 01             	mov    bpl,0x1` |
| `0xaab95a` | `aab95a:	eb 00                	jmp    aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab95c` | `aab95c:	4d 85 ff             	test   r15,r15` |
| `0xaab95f` | `aab95f:	0f 95 c3             	setne  bl` |
| `0xaab962` | `aab962:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xaab967` | `aab967:	e8 1a 2b ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaab96c` | `aab96c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab973` | `aab973:	00 00` |
| `0xaab975` | `aab975:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xaab97a` | `aab97a:	75 10                	jne    aab98c <JNI_OnUnload@@Base+0x33259>` |
| `0xaab97c` | `aab97c:	40 20 eb             	and    bl,bpl` |
| `0xaabe47` | `aabe47:	48 83 26 00          	and    QWORD PTR [rsi],0x0` |
| `0xaabe4b` | `aabe4b:	48 89 c6             	mov    rsi,rax` |
| `0xaabe4e` | `aabe4e:	e8 91 cd ff ff       	call   aa8be4 <JNI_OnUnload@@Base+0x304b1>` |
| `0xaabe53` | `aabe53:	48 89 d8             	mov    rax,rbx` |
| `0xaabe56` | `aabe56:	5b                   	pop    rbx` |
| `0xaabe57` | `aabe57:	c3                   	ret` |
| `0xaabe58` | `aabe58:	41 57                	push   r15` |
| `0xaabe5a` | `aabe5a:	41 56                	push   r14` |
| `0xaabe5c` | `aabe5c:	41 54                	push   r12` |
| `0xaabe5e` | `aabe5e:	53                   	push   rbx` |
| `0xaabe5f` | `aabe5f:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaabe63` | `aabe63:	48 89 fb             	mov    rbx,rdi` |
| `0xaabe66` | `aabe66:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaabe6d` | `aabe6d:	00 00` |
| `0xaabe6f` | `aabe6f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaabe74` | `aabe74:	49 89 e6             	mov    r14,rsp` |
| `0xaabe77` | `aabe77:	4c 89 f7             	mov    rdi,r14` |
| `0xaabe7a` | `aabe7a:	48 89 de             	mov    rsi,rbx` |
| `0xaabe7d` | `aabe7d:	e8 ae f4 ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaabe82` | `aabe82:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaabe85` | `aabe85:	4d 85 f6             	test   r14,r14` |
| `0xaabe88` | `aabe88:	74 71                	je     aabefb <JNI_OnUnload@@Base+0x337c8>` |
| `0xaabe8a` | `aabe8a:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]` |
| `0xaabe8e` | `aabe8e:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14` |
| `0xaabe93` | `aabe93:	c6 44 24 18 01       	mov    BYTE PTR [rsp+0x18],0x1` |
| `0xaabe98` | `aabe98:	4c 89 f7             	mov    rdi,r14` |
| `0xaabe9b` | `aabe9b:	e8 50 22 d4 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xaabea0` | `aabea0:	4d 8d 66 38          	lea    r12,[r14+0x38]` |
| `0xaabea4` | `aabea4:	4c 89 e7             	mov    rdi,r12` |
| `0xaabea7` | `aabea7:	4c 89 fe             	mov    rsi,r15` |
| `0xaabeaa` | `aabeaa:	e8 c1 dd ff ff       	call   aa9c70 <JNI_OnUnload@@Base+0x3153d>` |
| `0xaabeaf` | `aabeaf:	49 89 c7             	mov    r15,rax` |
| `0xaabeb2` | `aabeb2:	49 8d 46 40          	lea    rax,[r14+0x40]` |
| `0xaabeb6` | `aabeb6:	49 39 c7             	cmp    r15,rax` |
| `0xaabeb9` | `aabeb9:	74 36                	je     aabef1 <JNI_OnUnload@@Base+0x337be>` |
| `0xaabebb` | `aabebb:	4d 39 3c 24          	cmp    QWORD PTR [r12],r15` |
| `0xaabebf` | `aabebf:	75 0c                	jne    aabecd <JNI_OnUnload@@Base+0x3379a>` |
| `0xaabec1` | `aabec1:	4c 89 ff             	mov    rdi,r15` |
| `0xaabec4` | `aabec4:	e8 19 29 ff ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>` |
| `0xaabec9` | `aabec9:	49 89 04 24          	mov    QWORD PTR [r12],rax` |
| `0xaabecd` | `aabecd:	49 ff 4e 48          	dec    QWORD PTR [r14+0x48]` |
| `0xaabed1` | `aabed1:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xaabed5` | `aabed5:	4c 89 fe             	mov    rsi,r15` |
| `0xaabed8` | `aabed8:	e8 75 de ff ff       	call   aa9d52 <JNI_OnUnload@@Base+0x3161f>` |
| `0xaabedd` | `aabedd:	4c 89 ff             	mov    rdi,r15` |
| `0xaabee0` | `aabee0:	48 83 c7 28          	add    rdi,0x28` |
| `0xaabee4` | `aabee4:	e8 03 ff ff ff       	call   aabdec <JNI_OnUnload@@Base+0x336b9>` |
| `0xaabee9` | `aabee9:	4c 89 ff             	mov    rdi,r15` |
| `0xaabeec` | `aabeec:	e8 2f 20 d4 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xaabef1` | `aabef1:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xaabef6` | `aabef6:	e8 35 ff ff ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0xaabefb` | `aabefb:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xad5fbc` | `ad5fbc:	49 89 c4             	mov    r12,rax` |
| `0xad5fbf` | `ad5fbf:	48 39 d8             	cmp    rax,rbx` |
| `0xad5fc2` | `ad5fc2:	0f 85 ff fe ff ff    	jne    ad5ec7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22e67>` |
| `0xad5fc8` | `ad5fc8:	eb 08                	jmp    ad5fd2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22f72>` |
| `0xad5fca` | `ad5fca:	4c 89 f3             	mov    rbx,r14` |
| `0xad5fcd` | `ad5fcd:	e9 70 ff ff ff       	jmp    ad5f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22ee2>` |
| `0xad5fd2` | `ad5fd2:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]` |
| `0xad5fd7` | `ad5fd7:	e8 54 5e fd ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0xad5fdc` | `ad5fdc:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]` |
| `0xad5fe1` | `ad5fe1:	49 39 ee             	cmp    r14,rbp` |
| `0xad5fe4` | `ad5fe4:	74 74                	je     ad605a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22ffa>` |
| `0xad5fe6` | `ad5fe6:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]` |
| `0xad5feb` | `ad5feb:	4c 8d 25 8a bf 97 ff 	lea    r12,[rip+0xffffffffff97bf8a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>` |
| `0xad5ff2` | `ad5ff2:	4c 8d 2d 9a f0 87 ff 	lea    r13,[rip+0xffffffffff87f09a]        # 355093 <_ZTSSt12bad_any_cast@@Base-0x3b135>` |
| `0xad5ff9` | `ad5ff9:	6a 03                	push   0x3` |
| `0xad5ffb` | `ad5ffb:	5b                   	pop    rbx` |
| `0xad5ffc` | `ad5ffc:	49 8d 76 20          	lea    rsi,[r14+0x20]` |
| `0xad6000` | `ad6000:	4c 89 ff             	mov    rdi,r15` |
| `0xad6003` | `ad6003:	e8 28 53 fd ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xad6008` | `ad6008:	48 83 7c 24 38 00    	cmp    QWORD PTR [rsp+0x38],0x0` |
| `0xad600e` | `ad600e:	74 30                	je     ad6040 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fe0>` |
| `0xad6010` | `ad6010:	41 f6 46 30 01       	test   BYTE PTR [r14+0x30],0x1` |
| `0xad6015` | `ad6015:	74 06                	je     ad601d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fbd>` |
| `0xad6017` | `ad6017:	4d 8b 46 40          	mov    r8,QWORD PTR [r14+0x40]` |
| `0xad601b` | `ad601b:	eb 04                	jmp    ad6021 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fc1>` |
| `0xad601d` | `ad601d:	4d 8d 46 31          	lea    r8,[r14+0x31]` |
| `0xad6021` | `ad6021:	89 df                	mov    edi,ebx` |
| `0xad6023` | `ad6023:	4c 89 e6             	mov    rsi,r12` |
| `0xad6026` | `ad6026:	ba 4f 01 00 00       	mov    edx,0x14f` |
| `0xad602b` | `ad602b:	4c 89 e9             	mov    rcx,r13` |
| `0xad602e` | `ad602e:	31 c0                	xor    eax,eax` |
| `0xad6030` | `ad6030:	e8 9d 08 d0 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xad6035` | `ad6035:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]` |
| `0xad603a` | `ad603a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xad603d` | `ad603d:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0xad6040` | `ad6040:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xad6045` | `ad6045:	e8 3c 84 fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xad604a` | `ad604a:	4c 89 f7             	mov    rdi,r14` |
| `0xad604d` | `ad604d:	e8 90 87 fc ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>` |
| `0xad6052` | `ad6052:	49 89 c6             	mov    r14,rax` |
| `0xad6055` | `ad6055:	48 39 e8             	cmp    rax,rbp` |
| `0xad6058` | `ad6058:	75 a2                	jne    ad5ffc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22f9c>` |
| `0xad605a` | `ad605a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]` |
| `0xad605f` | `ad605f:	e8 f4 01 00 00       	call   ad6258 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x231f8>` |
| `0xad6064` | `ad6064:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]` |
| `0xad6068` | `ad6068:	48 8d bb 80 03 00 00 	lea    rdi,[rbx+0x380]` |
| `0xad606f` | `ad606f:	e8 b4 3d fa ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>` |
| `0xad6074` | `ad6074:	48 8b bb 78 03 00 00 	mov    rdi,QWORD PTR [rbx+0x378]` |
| `0xad607b` | `ad607b:	e8 06 84 fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xad6080` | `ad6080:	48 8b bb 68 03 00 00 	mov    rdi,QWORD PTR [rbx+0x368]` |
| `0xad6087` | `ad6087:	48 83 a3 68 03 00 00 	and    QWORD PTR [rbx+0x368],0x0` |
| `0xad608e` | `ad608e:	00` |
| `0xadb9bd` | `adb9bd:	48 89 fb             	mov    rbx,rdi` |
| `0xadb9c0` | `adb9c0:	48 8b bf 90 00 00 00 	mov    rdi,QWORD PTR [rdi+0x90]` |
| `0xadb9c7` | `adb9c7:	e8 e6 2a fc ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xadb9cc` | `adb9cc:	48 8d 7b 30          	lea    rdi,[rbx+0x30]` |
| `0xadb9d0` | `adb9d0:	e8 9f ae ff ff       	call   ad6874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23814>` |
| `0xadb9d5` | `adb9d5:	48 89 df             	mov    rdi,rbx` |
| `0xadb9d8` | `adb9d8:	5b                   	pop    rbx` |
| `0xadb9d9` | `adb9d9:	e9 8c e5 f9 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xadb9de` | `adb9de:	41 56                	push   r14` |
| `0xadb9e0` | `adb9e0:	53                   	push   rbx` |
| `0xadb9e1` | `adb9e1:	48 83 ec 78          	sub    rsp,0x78` |
| `0xadb9e5` | `adb9e5:	48 89 fb             	mov    rbx,rdi` |
| `0xadb9e8` | `adb9e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadb9ef` | `adb9ef:	00 00` |
| `0xadb9f1` | `adb9f1:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xadb9f6` | `adb9f6:	48 8d b7 88 00 00 00 	lea    rsi,[rdi+0x88]` |
| `0xadb9fd` | `adb9fd:	49 89 e6             	mov    r14,rsp` |
| `0xadba00` | `adba00:	4c 89 f7             	mov    rdi,r14` |
| `0xadba03` | `adba03:	e8 28 f9 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadba08` | `adba08:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xadba0c` | `adba0c:	74 2a                	je     adba38 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x289d8>` |
| `0xadba0e` | `adba0e:	48 8d 73 30          	lea    rsi,[rbx+0x30]` |
| `0xadba12` | `adba12:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadba17` | `adba17:	e8 7c ba ff ff       	call   ad7498 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24438>` |
| `0xadba1c` | `adba1c:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xadba21` | `adba21:	83 66 58 00          	and    DWORD PTR [rsi+0x58],0x0` |
| `0xadba25` | `adba25:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]` |
| `0xadba29` | `adba29:	e8 62 23 fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>` |
| `0xadba2e` | `adba2e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadba33` | `adba33:	e8 30 00 00 00       	call   adba68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x28a08>` |
| `0xadba38` | `adba38:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xadba3d` | `adba3d:	e8 44 2a fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xadba42` | `adba42:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadba49` | `adba49:	00 00` |
| `0xadba4b` | `adba4b:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]` |
| `0xadba50` | `adba50:	75 08                	jne    adba5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x289fa>` |
| `0xadba52` | `adba52:	48 83 c4 78          	add    rsp,0x78` |
| `0xadba56` | `adba56:	5b                   	pop    rbx` |
| `0xadba57` | `adba57:	41 5e                	pop    r14` |
| `0xadba59` | `adba59:	c3                   	ret` |
| `0xadba5a` | `adba5a:	e8 51 40 d1 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xadba5f` | `adba5f:	48 89 c7             	mov    rdi,rax` |
| `0xadba62` | `adba62:	e8 3e e0 f9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xadba67` | `adba67:	cc                   	int3` |
| `0xadba68` | `adba68:	53                   	push   rbx` |
| `0xadba69` | `adba69:	48 83 ec 10          	sub    rsp,0x10` |
| `0xadba6d` | `adba6d:	48 89 fb             	mov    rbx,rdi` |
| `0xadba70` | `adba70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadba77` | `adba77:	00 00` |
| `0xadba79` | `adba79:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax` |
| `0xadba7e` | `adba7e:	8b 47 58             	mov    eax,DWORD PTR [rdi+0x58]` |
| `0xadba81` | `adba81:	b9 ff ff ff ff       	mov    ecx,0xffffffff` |
| `0xadc0df` | `adc0df:	cc                   	int3` |
| `0xadc0e0` | `adc0e0:	53                   	push   rbx` |
| `0xadc0e1` | `adc0e1:	48 89 fb             	mov    rbx,rdi` |
| `0xadc0e4` | `adc0e4:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]` |
| `0xadc0e8` | `adc0e8:	e8 c5 23 fc ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xadc0ed` | `adc0ed:	48 89 df             	mov    rdi,rbx` |
| `0xadc0f0` | `adc0f0:	5b                   	pop    rbx` |
| `0xadc0f1` | `adc0f1:	e9 74 de f9 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xadc0f6` | `adc0f6:	41 56                	push   r14` |
| `0xadc0f8` | `adc0f8:	53                   	push   rbx` |
| `0xadc0f9` | `adc0f9:	48 83 ec 78          	sub    rsp,0x78` |
| `0xadc0fd` | `adc0fd:	48 89 fb             	mov    rbx,rdi` |
| `0xadc100` | `adc100:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadc107` | `adc107:	00 00` |
| `0xadc109` | `adc109:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xadc10e` | `adc10e:	48 8d 77 40          	lea    rsi,[rdi+0x40]` |
| `0xadc112` | `adc112:	49 89 e6             	mov    r14,rsp` |
| `0xadc115` | `adc115:	4c 89 f7             	mov    rdi,r14` |
| `0xadc118` | `adc118:	e8 13 f2 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadc11d` | `adc11d:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xadc121` | `adc121:	74 26                	je     adc149 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x290e9>` |
| `0xadc123` | `adc123:	0f 10 43 30          	movups xmm0,XMMWORD PTR [rbx+0x30]` |
| `0xadc127` | `adc127:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xadc12c` | `adc12c:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0` |
| `0xadc12f` | `adc12f:	c7 46 58 01 00 00 00 	mov    DWORD PTR [rsi+0x58],0x1` |
| `0xadc136` | `adc136:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]` |
| `0xadc13a` | `adc13a:	e8 51 1c fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>` |
| `0xadc13f` | `adc13f:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadc144` | `adc144:	e8 1f f9 ff ff       	call   adba68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x28a08>` |
| `0xadc149` | `adc149:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xadc14e` | `adc14e:	e8 33 23 fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xadc153` | `adc153:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadc15a` | `adc15a:	00 00` |
| `0xadc15c` | `adc15c:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]` |
| `0xadc161` | `adc161:	75 08                	jne    adc16b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2910b>` |
| `0xadc163` | `adc163:	48 83 c4 78          	add    rsp,0x78` |
| `0xadc167` | `adc167:	5b                   	pop    rbx` |
| `0xadc168` | `adc168:	41 5e                	pop    r14` |
| `0xadc16a` | `adc16a:	c3                   	ret` |
| `0xadc16b` | `adc16b:	e8 40 39 d1 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xadc170` | `adc170:	48 89 c7             	mov    rdi,rax` |
| `0xadc173` | `adc173:	e8 2d d9 f9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xadc178` | `adc178:	48 8d 05 a9 50 d2 00 	lea    rax,[rip+0xd250a9]        # 1801228 <_ZTIN4asio22service_already_existsE@@Base+0x2a10>` |
| `0xadc17f` | `adc17f:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xadc182` | `adc182:	e9 89 1e d1 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>` |
| `0xadc187` | `adc187:	cc                   	int3` |
| `0xadc188` | `adc188:	53                   	push   rbx` |
| `0xadc189` | `adc189:	48 89 fb             	mov    rbx,rdi` |
| `0xadc18c` | `adc18c:	e8 e7 ff ff ff       	call   adc178 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29118>` |
| `0xadc191` | `adc191:	48 89 df             	mov    rdi,rbx` |
| `0xadc194` | `adc194:	5b                   	pop    rbx` |
| `0xadc195` | `adc195:	e9 86 1d d1 00       	jmp    17edf20 <_ZdlPv@plt>` |
| `0xadf492` | `adf492:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0xadf496` | `adf496:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax` |
| `0xadf49a` | `adf49a:	48 85 c0             	test   rax,rax` |
| `0xadf49d` | `adf49d:	74 05                	je     adf4a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c444>` |
| `0xadf49f` | `adf49f:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0xadf4a4` | `adf4a4:	c3                   	ret` |
| `0xadf4a5` | `adf4a5:	cc                   	int3` |
| `0xadf4a6` | `adf4a6:	55                   	push   rbp` |
| `0xadf4a7` | `adf4a7:	41 56                	push   r14` |
| `0xadf4a9` | `adf4a9:	53                   	push   rbx` |
| `0xadf4aa` | `adf4aa:	48 83 ec 60          	sub    rsp,0x60` |
| `0xadf4ae` | `adf4ae:	49 89 f6             	mov    r14,rsi` |
| `0xadf4b1` | `adf4b1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadf4b8` | `adf4b8:	00 00` |
| `0xadf4ba` | `adf4ba:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax` |
| `0xadf4bf` | `adf4bf:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xadf4c3` | `adf4c3:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]` |
| `0xadf4c8` | `adf4c8:	48 89 df             	mov    rdi,rbx` |
| `0xadf4cb` | `adf4cb:	e8 60 be fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadf4d0` | `adf4d0:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xadf4d3` | `adf4d3:	48 85 c0             	test   rax,rax` |
| `0xadf4d6` | `adf4d6:	0f 84 96 00 00 00    	je     adf572 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c512>` |
| `0xadf4dc` | `adf4dc:	48 8b 58 10          	mov    rbx,QWORD PTR [rax+0x10]` |
| `0xadf4e0` | `adf4e0:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]` |
| `0xadf4e3` | `adf4e3:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0` |
| `0xadf4e7` | `adf4e7:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]` |
| `0xadf4eb` | `adf4eb:	48 85 c0             	test   rax,rax` |
| `0xadf4ee` | `adf4ee:	74 05                	je     adf4f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c495>` |
| `0xadf4f0` | `adf4f0:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0xadf4f5` | `adf4f5:	41 8a 2e             	mov    bpl,BYTE PTR [r14]` |
| `0xadf4f8` | `adf4f8:	48 8d 05 19 27 97 ff 	lea    rax,[rip+0xffffffffff972719]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>` |
| `0xadf4ff` | `adf4ff:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xadf504` | `adf504:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xadf509` | `adf509:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0` |
| `0xadf50f` | `adf50f:	48 83 64 24 38 00    	and    QWORD PTR [rsp+0x38],0x0` |
| `0xadf515` | `adf515:	48 83 64 24 48 00    	and    QWORD PTR [rsp+0x48],0x0` |
| `0xadf51b` | `adf51b:	6a 18                	push   0x18` |
| `0xadf51d` | `adf51d:	5f                   	pop    rdi` |
| `0xadf51e` | `adf51e:	e8 dd e9 d0 00       	call   17edf00 <_Znwm@plt>` |
| `0xadf523` | `adf523:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]` |
| `0xadf527` | `adf527:	0f 11 00             	movups XMMWORD PTR [rax],xmm0` |
| `0xadf52a` | `adf52a:	40 88 68 10          	mov    BYTE PTR [rax+0x10],bpl` |
| `0xadf52e` | `adf52e:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]` |
| `0xadf533` | `adf533:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xadf536` | `adf536:	48 8d 05 73 00 00 00 	lea    rax,[rip+0x73]        # adf5b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c550>` |
| `0xadf53d` | `adf53d:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0xadf541` | `adf541:	48 8d 05 94 00 00 00 	lea    rax,[rip+0x94]        # adf5dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c57c>` |
| `0xadf548` | `adf548:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0xadf54c` | `adf54c:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]` |
| `0xadf551` | `adf551:	48 89 df             	mov    rdi,rbx` |
| `0xadf554` | `adf554:	4c 89 f2             	mov    rdx,r14` |
| `0xadf557` | `adf557:	e8 2c 1f ce 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>` |
| `0xadf5d4` | `adf5d4:	48 8b 02             	mov    rax,QWORD PTR [rdx]` |
| `0xadf5d7` | `adf5d7:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0xadf5da` | `adf5da:	c3                   	ret` |
| `0xadf5db` | `adf5db:	cc                   	int3` |
| `0xadf5dc` | `adf5dc:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0xadf5df` | `adf5df:	e9 06 00 00 00       	jmp    adf5ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c58a>` |
| `0xadf5e4` | `adf5e4:	e9 c9 ee fb ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xadf5e9` | `adf5e9:	cc                   	int3` |
| `0xadf5ea` | `adf5ea:	41 56                	push   r14` |
| `0xadf5ec` | `adf5ec:	53                   	push   rbx` |
| `0xadf5ed` | `adf5ed:	48 83 ec 78          	sub    rsp,0x78` |
| `0xadf5f1` | `adf5f1:	49 89 fe             	mov    r14,rdi` |
| `0xadf5f4` | `adf5f4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadf5fb` | `adf5fb:	00 00` |
| `0xadf5fd` | `adf5fd:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xadf602` | `adf602:	48 89 e3             	mov    rbx,rsp` |
| `0xadf605` | `adf605:	48 89 df             	mov    rdi,rbx` |
| `0xadf608` | `adf608:	4c 89 f6             	mov    rsi,r14` |
| `0xadf60b` | `adf60b:	e8 20 bd fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadf610` | `adf610:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xadf613` | `adf613:	48 85 db             	test   rbx,rbx` |
| `0xadf616` | `adf616:	0f 84 4b 01 00 00    	je     adf767 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c707>` |
| `0xadf61c` | `adf61c:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0` |
| `0xadf621` | `adf621:	48 8d 05 3c 3f 96 ff 	lea    rax,[rip+0xffffffffff963f3c]        # 443564 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9170>` |
| `0xadf628` | `adf628:	4c 8d 05 31 3f 96 ff 	lea    r8,[rip+0xffffffffff963f31]        # 443560 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x916c>` |
| `0xadf62f` | `adf62f:	4c 0f 44 c0          	cmove  r8,rax` |
| `0xadf633` | `adf633:	48 8d 35 42 29 97 ff 	lea    rsi,[rip+0xffffffffff972942]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>` |
| `0xadf63a` | `adf63a:	48 8d 0d 5b 6b 89 ff 	lea    rcx,[rip+0xffffffffff896b5b]        # 37619c <_ZTSSt12bad_any_cast@@Base-0x1a02c>` |
| `0xadf641` | `adf641:	6a 04                	push   0x4` |
| `0xadf643` | `adf643:	5f                   	pop    rdi` |
| `0xadf644` | `adf644:	ba 86 00 00 00       	mov    edx,0x86` |
| `0xadf649` | `adf649:	31 c0                	xor    eax,eax` |
| `0xadf64b` | `adf64b:	e8 82 72 cf 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xadf650` | `adf650:	80 bb 08 01 00 00 00 	cmp    BYTE PTR [rbx+0x108],0x0` |
| `0xadf657` | `adf657:	0f 85 0a 01 00 00    	jne    adf767 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c707>` |
| `0xadf65d` | `adf65d:	80 bb c0 00 00 00 00 	cmp    BYTE PTR [rbx+0xc0],0x0` |
| `0xadf664` | `adf664:	0f 84 fd 00 00 00    	je     adf767 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c707>` |
| `0xadf66a` | `adf66a:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0` |
| `0xadf66f` | `adf66f:	74 74                	je     adf6e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c685>` |
| `0xadf671` | `adf671:	83 bb b0 00 00 00 01 	cmp    DWORD PTR [rbx+0xb0],0x1` |
| `0xadf678` | `adf678:	0f 85 e9 00 00 00    	jne    adf767 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c707>` |
| `0xadf67e` | `adf67e:	48 8d b3 88 00 00 00 	lea    rsi,[rbx+0x88]` |
| `0xadf685` | `adf685:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadf68a` | `adf68a:	e8 2b 03 00 00       	call   adf9ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c95a>` |
| `0xadf68f` | `adf68f:	8b 83 a8 00 00 00    	mov    eax,DWORD PTR [rbx+0xa8]` |
| `0xadf695` | `adf695:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xadf69a` | `adf69a:	89 46 20             	mov    DWORD PTR [rsi+0x20],eax` |
| `0xadf69d` | `adf69d:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]` |
| `0xadf6a4` | `adf6a4:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax` |
| `0xadf6a8` | `adf6a8:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]` |
| `0xadf6ad` | `adf6ad:	4c 89 f7             	mov    rdi,r14` |
| `0xadf6b0` | `adf6b0:	e8 25 04 00 00       	call   adfada <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2ca7a>` |
| `0xae0608` | `ae0608:	e8 37 fe ff ff       	call   ae0444 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d3e4>` |
| `0xae060d` | `ae060d:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xae0611` | `ae0611:	5b                   	pop    rbx` |
| `0xae0612` | `ae0612:	e9 9b de fb ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xae0617` | `ae0617:	cc                   	int3` |
| `0xae0618` | `ae0618:	41 57                	push   r15` |
| `0xae061a` | `ae061a:	41 56                	push   r14` |
| `0xae061c` | `ae061c:	41 54                	push   r12` |
| `0xae061e` | `ae061e:	53                   	push   rbx` |
| `0xae061f` | `ae061f:	48 81 ec 88 00 00 00 	sub    rsp,0x88` |
| `0xae0626` | `ae0626:	49 89 fe             	mov    r14,rdi` |
| `0xae0629` | `ae0629:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xae0630` | `ae0630:	00 00` |
| `0xae0632` | `ae0632:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax` |
| `0xae0639` | `ae0639:	00` |
| `0xae063a` | `ae063a:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]` |
| `0xae063f` | `ae063f:	48 89 df             	mov    rdi,rbx` |
| `0xae0642` | `ae0642:	4c 89 f6             	mov    rsi,r14` |
| `0xae0645` | `ae0645:	e8 e6 ac fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xae064a` | `ae064a:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xae064d` | `ae064d:	48 85 db             	test   rbx,rbx` |
| `0xae0650` | `ae0650:	0f 84 5c 01 00 00    	je     ae07b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d752>` |
| `0xae0656` | `ae0656:	4d 8d 7e 10          	lea    r15,[r14+0x10]` |
| `0xae065a` | `ae065a:	80 bb c0 00 00 00 00 	cmp    BYTE PTR [rbx+0xc0],0x0` |
| `0xae0661` | `ae0661:	74 40                	je     ae06a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d643>` |
| `0xae0663` | `ae0663:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]` |
| `0xae0667` | `ae0667:	88 83 80 00 00 00    	mov    BYTE PTR [rbx+0x80],al` |
| `0xae066d` | `ae066d:	83 bb b0 00 00 00 ff 	cmp    DWORD PTR [rbx+0xb0],0xffffffff` |
| `0xae0674` | `ae0674:	41 8b 46 40          	mov    eax,DWORD PTR [r14+0x40]` |
| `0xae0678` | `ae0678:	75 05                	jne    ae067f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d61f>` |
| `0xae067a` | `ae067a:	83 f8 ff             	cmp    eax,0xffffffff` |
| `0xae067d` | `ae067d:	74 44                	je     ae06c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d663>` |
| `0xae067f` | `ae067f:	48 8d b3 88 00 00 00 	lea    rsi,[rbx+0x88]` |
| `0xae0686` | `ae0686:	83 f8 ff             	cmp    eax,0xffffffff` |
| `0xae0689` | `ae0689:	74 30                	je     ae06bb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d65b>` |
| `0xae068b` | `ae068b:	49 8d 56 18          	lea    rdx,[r14+0x18]` |
| `0xae068f` | `ae068f:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]` |
| `0xae0694` | `ae0694:	48 89 37             	mov    QWORD PTR [rdi],rsi` |
| `0xae0697` | `ae0697:	48 8d 0d 7a 19 d2 00 	lea    rcx,[rip+0xd2197a]        # 1802018 <_ZTIN4asio22service_already_existsE@@Base+0x3800>` |
| `0xae069e` | `ae069e:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]` |
| `0xae06a1` | `ae06a1:	eb 20                	jmp    ae06c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d663>` |
| `0xae06a3` | `ae06a3:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]` |
| `0xae06aa` | `ae06aa:	4c 89 fe             	mov    rsi,r15` |
| `0xae06ad` | `ae06ad:	e8 26 fe ff ff       	call   ae04d8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d478>` |
| `0xae06b2` | `ae06b2:	c6 83 c0 00 00 00 01 	mov    BYTE PTR [rbx+0xc0],0x1` |
| `0xae06b9` | `ae06b9:	eb 14                	jmp    ae06cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d66f>` |
| `0xae06bb` | `ae06bb:	48 89 f7             	mov    rdi,rsi` |
| `0xae06be` | `ae06be:	e8 81 fd ff ff       	call   ae0444 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d3e4>` |
| `0xae06c3` | `ae06c3:	41 0f b7 46 48       	movzx  eax,WORD PTR [r14+0x48]` |
| `0xae06c8` | `ae06c8:	66 89 83 b8 00 00 00 	mov    WORD PTR [rbx+0xb8],ax` |
| `0xae06cf` | `ae06cf:	41 80 3f 00          	cmp    BYTE PTR [r15],0x0` |
| `0xae06d3` | `ae06d3:	8a 83 08 01 00 00    	mov    al,BYTE PTR [rbx+0x108]` |
| `0xae0c2e` | `ae0c2e:	e8 37 93 f9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xae0c33` | `ae0c33:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xae0c37` | `ae0c37:	5b                   	pop    rbx` |
| `0xae0c38` | `ae0c38:	e9 75 d8 fb ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xae0c3d` | `ae0c3d:	cc                   	int3` |
| `0xae0c3e` | `ae0c3e:	41 57                	push   r15` |
| `0xae0c40` | `ae0c40:	41 56                	push   r14` |
| `0xae0c42` | `ae0c42:	41 55                	push   r13` |
| `0xae0c44` | `ae0c44:	41 54                	push   r12` |
| `0xae0c46` | `ae0c46:	53                   	push   rbx` |
| `0xae0c47` | `ae0c47:	48 83 ec 20          	sub    rsp,0x20` |
| `0xae0c4b` | `ae0c4b:	49 89 fe             	mov    r14,rdi` |
| `0xae0c4e` | `ae0c4e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xae0c55` | `ae0c55:	00 00` |
| `0xae0c57` | `ae0c57:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xae0c5c` | `ae0c5c:	48 89 e3             	mov    rbx,rsp` |
| `0xae0c5f` | `ae0c5f:	48 89 df             	mov    rdi,rbx` |
| `0xae0c62` | `ae0c62:	4c 89 f6             	mov    rsi,r14` |
| `0xae0c65` | `ae0c65:	e8 c6 a6 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xae0c6a` | `ae0c6a:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xae0c6d` | `ae0c6d:	48 85 db             	test   rbx,rbx` |
| `0xae0c70` | `ae0c70:	0f 84 b6 00 00 00    	je     ae0d2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dccc>` |
| `0xae0c76` | `ae0c76:	4c 8d bb 18 01 00 00 	lea    r15,[rbx+0x118]` |
| `0xae0c7d` | `ae0c7d:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]` |
| `0xae0c81` | `ae0c81:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xae0c86` | `ae0c86:	4c 89 ff             	mov    rdi,r15` |
| `0xae0c89` | `ae0c89:	e8 ee 00 00 00       	call   ae0d7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dd1c>` |
| `0xae0c8e` | `ae0c8e:	48 83 38 00          	cmp    QWORD PTR [rax],0x0` |
| `0xae0c92` | `ae0c92:	75 63                	jne    ae0cf7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dc97>` |
| `0xae0c94` | `ae0c94:	49 89 c4             	mov    r12,rax` |
| `0xae0c97` | `ae0c97:	6a 60                	push   0x60` |
| `0xae0c99` | `ae0c99:	5f                   	pop    rdi` |
| `0xae0c9a` | `ae0c9a:	e8 61 d2 d0 00       	call   17edf00 <_Znwm@plt>` |
| `0xae0c9f` | `ae0c9f:	49 89 c5             	mov    r13,rax` |
| `0xae0ca2` | `ae0ca2:	49 8d 76 20          	lea    rsi,[r14+0x20]` |
| `0xae0ca6` | `ae0ca6:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0xae0caa` | `ae0caa:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax` |
| `0xae0cae` | `ae0cae:	4c 89 ef             	mov    rdi,r13` |
| `0xae0cb1` | `ae0cb1:	48 83 c7 30          	add    rdi,0x30` |
| `0xae0cb5` | `ae0cb5:	e8 a4 d2 ff ff       	call   addf5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aefe>` |
| `0xae0cba` | `ae0cba:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]` |
| `0xae0cbf` | `ae0cbf:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xae0cc2` | `ae0cc2:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0` |
| `0xae0cc7` | `ae0cc7:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0xae0ccb` | `ae0ccb:	4d 89 2c 24          	mov    QWORD PTR [r12],r13` |
| `0xae0ccf` | `ae0ccf:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0xae0cd2` | `ae0cd2:	48 8b 00             	mov    rax,QWORD PTR [rax]` |
| `0xae0cd5` | `ae0cd5:	48 85 c0             	test   rax,rax` |
| `0xae0cd8` | `ae0cd8:	74 07                	je     ae0ce1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dc81>` |
| `0xae0cda` | `ae0cda:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0xae0cdd` | `ae0cdd:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]` |
| `0xae0ce1` | `ae0ce1:	48 8b bb 20 01 00 00 	mov    rdi,QWORD PTR [rbx+0x120]` |
| `0xae0e81` | `ae0e81:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]` |
| `0xae0e86` | `ae0e86:	e8 13 64 fc ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0xae0e8b` | `ae0e8b:	48 89 df             	mov    rdi,rbx` |
| `0xae0e8e` | `ae0e8e:	e8 12 8c f9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xae0e93` | `ae0e93:	cc                   	int3` |
| `0xae0e94` | `ae0e94:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0xae0e97` | `ae0e97:	e9 00 00 00 00       	jmp    ae0e9c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2de3c>` |
| `0xae0e9c` | `ae0e9c:	41 57                	push   r15` |
| `0xae0e9e` | `ae0e9e:	41 56                	push   r14` |
| `0xae0ea0` | `ae0ea0:	53                   	push   rbx` |
| `0xae0ea1` | `ae0ea1:	48 83 ec 20          	sub    rsp,0x20` |
| `0xae0ea5` | `ae0ea5:	48 89 fb             	mov    rbx,rdi` |
| `0xae0ea8` | `ae0ea8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xae0eaf` | `ae0eaf:	00 00` |
| `0xae0eb1` | `ae0eb1:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xae0eb6` | `ae0eb6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xae0ebb` | `ae0ebb:	4c 89 f7             	mov    rdi,r14` |
| `0xae0ebe` | `ae0ebe:	48 89 de             	mov    rsi,rbx` |
| `0xae0ec1` | `ae0ec1:	e8 6a a4 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xae0ec6` | `ae0ec6:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| ... | truncated 53147 more |

## Filtered provider-slot relevant instructions inside `aab330`

| addr | instruction |
|---:|---|
| `0xaab33a` | `aab33a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0xaab33d` | `aab33d:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]` |
| `0xaab341` | `aab341:	48 85 ff             	test   rdi,rdi` |
| `0xaab34e` | `aab34e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0xaab352` | `aab352:	48 85 c0             	test   rax,rax` |
| `0xaab35a` | `aab35a:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xaab364` | `aab364:	c3                   	ret` |
| `0xaab36d` | `aab36d:	48 85 c0             	test   rax,rax` |
| `0xaab372` | `aab372:	c3                   	ret` |
| `0xaab3a5` | `aab3a5:	c3                   	ret` |
| `0xaab3c7` | `aab3c7:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xaab3cc` | `aab3cc:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab3d0` | `aab3d0:	48 8b 6f 28          	mov    rbp,QWORD PTR [rdi+0x28]` |
| `0xaab3d4` | `aab3d4:	48 8b 5f 30          	mov    rbx,QWORD PTR [rdi+0x30]` |
| `0xaab3d8` | `aab3d8:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]` |
| `0xaab3e9` | `aab3e9:	4d 85 ed             	test   r13,r13` |
| `0xaab3f2` | `aab3f2:	4d 85 e4             	test   r12,r12` |
| `0xaab3fc` | `aab3fc:	48 85 c0             	test   rax,rax` |
| `0xaab401` | `aab401:	48 85 db             	test   rbx,rbx` |
| `0xaab41c` | `aab41c:	8d 41 fd             	lea    eax,[rcx-0x3]` |
| `0xaab441` | `aab441:	4d 85 ed             	test   r13,r13` |
| `0xaab478` | `aab478:	c3                   	ret` |
| `0xaab47b` | `aab47b:	48 85 c0             	test   rax,rax` |
| `0xaab490` | `aab490:	85 d2                	test   edx,edx` |
| `0xaab494` | `aab494:	45 85 f6             	test   r14d,r14d` |
| `0xaab4b0` | `aab4b0:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx` |
| `0xaab4b5` | `aab4b5:	48 85 db             	test   rbx,rbx` |
| `0xaab4c8` | `aab4c8:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xaab4cb` | `aab4cb:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax` |
| `0xaab4cf` | `aab4cf:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14` |
| `0xaab4d3` | `aab4d3:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0` |
| `0xaab4d7` | `aab4d7:	c7 43 2c 00 00 80 3f 	mov    DWORD PTR [rbx+0x2c],0x3f800000` |
| `0xaab4e8` | `aab4e8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]` |
| `0xaab4f5` | `aab4f5:	48 8d 54 24 47       	lea    rdx,[rsp+0x47]` |
| `0xaab4fd` | `aab4fd:	48 8d 4c 24 18       	lea    rcx,[rsp+0x18]` |
| `0xaab508` | `aab508:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]` |
| `0xaab50d` | `aab50d:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]` |
| `0xaab517` | `aab517:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]` |
| `0xaab51c` | `aab51c:	48 8b 33             	mov    rsi,QWORD PTR [rbx]` |
| `0xaab51f` | `aab51f:	48 83 23 00          	and    QWORD PTR [rbx],0x0` |
| `0xaab523` | `aab523:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]` |
| `0xaab538` | `aab538:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]` |
| `0xaab54e` | `aab54e:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]` |
| `0xaab553` | `aab553:	4c 89 3f             	mov    QWORD PTR [rdi],r15` |
| `0xaab556` | `aab556:	4c 89 77 08          	mov    QWORD PTR [rdi+0x8],r14` |
| `0xaab55a` | `aab55a:	0f 10 43 18          	movups xmm0,XMMWORD PTR [rbx+0x18]` |
| `0xaab55e` | `aab55e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]` |
| `0xaab563` | `aab563:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0` |
| `0xaab575` | `aab575:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xaab57a` | `aab57a:	48 89 1e             	mov    QWORD PTR [rsi],rbx` |
| `0xaab57d` | `aab57d:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaab580` | `aab580:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xaab585` | `aab585:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xaab58f` | `aab58f:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]` |
| `0xaab5a6` | `aab5a6:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]` |
| `0xaab5bc` | `aab5bc:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xaab5c6` | `aab5c6:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]` |
| `0xaab5f8` | `aab5f8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab5fd` | `aab5fd:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab601` | `aab601:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xaab611` | `aab611:	4d 85 f6             	test   r14,r14` |
| `0xaab616` | `aab616:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]` |
| `0xaab61a` | `aab61a:	4d 85 ff             	test   r15,r15` |
| `0xaab62f` | `aab62f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xaab634` | `aab634:	48 83 26 00          	and    QWORD PTR [rsi],0x0` |
| `0xaab638` | `aab638:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaab63b` | `aab63b:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xaab640` | `aab640:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xaab64a` | `aab64a:	84 db                	test   bl,bl` |
| `0xaab65c` | `aab65c:	4d 85 f6             	test   r14,r14` |
| `0xaab68b` | `aab68b:	c3                   	ret` |
| `0xaab694` | `aab694:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xaab6bb` | `aab6bb:	c3                   	ret` |
| `0xaab6d6` | `aab6d6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab6db` | `aab6db:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab6df` | `aab6df:	4c 8b 7f 38          	mov    r15,QWORD PTR [rdi+0x38]` |
| `0xaab6e3` | `aab6e3:	48 8b 6f 40          	mov    rbp,QWORD PTR [rdi+0x40]` |
| `0xaab6f8` | `aab6f8:	4c 8b 73 18          	mov    r14,QWORD PTR [rbx+0x18]` |
| `0xaab6fe` | `aab6fe:	4d 85 f6             	test   r14,r14` |
| `0xaab707` | `aab707:	48 85 ed             	test   rbp,rbp` |
| `0xaab712` | `aab712:	4d 85 ff             	test   r15,r15` |
| `0xaab727` | `aab727:	4d 8d ae f0 13 00 00 	lea    r13,[r14+0x13f0]` |
| `0xaab735` | `aab735:	4d 85 e4             	test   r12,r12` |
| `0xaab74b` | `aab74b:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xaab74e` | `aab74e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xaab753` | `aab753:	ff 50 18             	call   QWORD PTR [rax+0x18]` |

## Relocation entries pointing into the `aab330` helper region

| entry | target | relocation |
|---:|---:|---|
| `0x17fd750` | `0xaaa0dc` | `00000000017fd750  0000000000000008 R_X86_64_RELATIVE                         aaa0dc` |
| `0x17fd770` | `0xaa9110` | `00000000017fd770  0000000000000008 R_X86_64_RELATIVE                         aa9110` |
| `0x17fd778` | `0xaa9206` | `00000000017fd778  0000000000000008 R_X86_64_RELATIVE                         aa9206` |
| `0x17fd780` | `0xaa9590` | `00000000017fd780  0000000000000008 R_X86_64_RELATIVE                         aa9590` |
| `0x17fd788` | `0xaa9a4c` | `00000000017fd788  0000000000000008 R_X86_64_RELATIVE                         aa9a4c` |
| `0x17fd790` | `0xaa9b6e` | `00000000017fd790  0000000000000008 R_X86_64_RELATIVE                         aa9b6e` |
| `0x17fd7a8` | `0xaaa986` | `00000000017fd7a8  0000000000000008 R_X86_64_RELATIVE                         aaa986` |
| `0x17fd7b0` | `0xaaa996` | `00000000017fd7b0  0000000000000008 R_X86_64_RELATIVE                         aaa996` |
| `0x17fd7b8` | `0xaaa9a8` | `00000000017fd7b8  0000000000000008 R_X86_64_RELATIVE                         aaa9a8` |
| `0x17fd7e0` | `0xaaa9b2` | `00000000017fd7e0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17fd7e8` | `0xaaa9bc` | `00000000017fd7e8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17fd800` | `0xaaab86` | `00000000017fd800  0000000000000008 R_X86_64_RELATIVE                         aaab86` |
| `0x17fd820` | `0xaaa9b2` | `00000000017fd820  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17fd828` | `0xaaa9bc` | `00000000017fd828  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17fd840` | `0xaaab52` | `00000000017fd840  0000000000000008 R_X86_64_RELATIVE                         aaab52` |
| `0x17fd860` | `0xaaab0e` | `00000000017fd860  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17fd868` | `0xaaab26` | `00000000017fd868  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17fd880` | `0xaaab38` | `00000000017fd880  0000000000000008 R_X86_64_RELATIVE                         aaab38` |
| `0x17fd8a0` | `0xaaa9b2` | `00000000017fd8a0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17fd8a8` | `0xaaa9bc` | `00000000017fd8a8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17fd8c0` | `0xaaaa46` | `00000000017fd8c0  0000000000000008 R_X86_64_RELATIVE                         aaaa46` |
| `0x17fd8e0` | `0xaaa9b2` | `00000000017fd8e0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17fd8e8` | `0xaaa9bc` | `00000000017fd8e8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17fd900` | `0xaaa9d2` | `00000000017fd900  0000000000000008 R_X86_64_RELATIVE                         aaa9d2` |
| `0x17fd920` | `0xaaa9b2` | `00000000017fd920  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17fd928` | `0xaaa9bc` | `00000000017fd928  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17fd940` | `0xaaaa12` | `00000000017fd940  0000000000000008 R_X86_64_RELATIVE                         aaaa12` |
| `0x17fd960` | `0xaaa9b2` | `00000000017fd960  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17fd968` | `0xaaa9bc` | `00000000017fd968  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17fd980` | `0xaaabf4` | `00000000017fd980  0000000000000008 R_X86_64_RELATIVE                         aaabf4` |
| `0x17fd9a0` | `0xaaa9b2` | `00000000017fd9a0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17fd9a8` | `0xaaa9bc` | `00000000017fd9a8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17fd9c0` | `0xaaac28` | `00000000017fd9c0  0000000000000008 R_X86_64_RELATIVE                         aaac28` |
| `0x17fd9e0` | `0xaaa9b2` | `00000000017fd9e0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17fd9e8` | `0xaaa9bc` | `00000000017fd9e8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17fda00` | `0xaaacec` | `00000000017fda00  0000000000000008 R_X86_64_RELATIVE                         aaacec` |
| `0x17fda20` | `0xaaaa7e` | `00000000017fda20  0000000000000008 R_X86_64_RELATIVE                         aaaa7e` |
| `0x17fda28` | `0xaaaaa6` | `00000000017fda28  0000000000000008 R_X86_64_RELATIVE                         aaaaa6` |
| `0x17fda40` | `0xaaabbc` | `00000000017fda40  0000000000000008 R_X86_64_RELATIVE                         aaabbc` |
| `0x17fda60` | `0xaaaa7e` | `00000000017fda60  0000000000000008 R_X86_64_RELATIVE                         aaaa7e` |
| `0x17fda68` | `0xaaaaa6` | `00000000017fda68  0000000000000008 R_X86_64_RELATIVE                         aaaaa6` |
| `0x17fda80` | `0xaaaab8` | `00000000017fda80  0000000000000008 R_X86_64_RELATIVE                         aaaab8` |
| `0x17fdaa0` | `0xaaac5c` | `00000000017fdaa0  0000000000000008 R_X86_64_RELATIVE                         aaac5c` |
| `0x17fdaa8` | `0xaaac84` | `00000000017fdaa8  0000000000000008 R_X86_64_RELATIVE                         aaac84` |
| `0x17fdac0` | `0xaaac96` | `00000000017fdac0  0000000000000008 R_X86_64_RELATIVE                         aaac96` |
| `0x17fdb50` | `0xaaba5c` | `00000000017fdb50  0000000000000008 R_X86_64_RELATIVE                         aaba5c` |
| `0x17fdb68` | `0xaab9f2` | `00000000017fdb68  0000000000000008 R_X86_64_RELATIVE                         aab9f2` |
| `0x17fdb70` | `0xaaba02` | `00000000017fdb70  0000000000000008 R_X86_64_RELATIVE                         aaba02` |
| `0x17fdb78` | `0xaaba14` | `00000000017fdb78  0000000000000008 R_X86_64_RELATIVE                         aaba14` |
| `0x17fdba0` | `0xaaadb4` | `00000000017fdba0  0000000000000008 R_X86_64_RELATIVE                         aaadb4` |
| `0x17fdba8` | `0xaaadd0` | `00000000017fdba8  0000000000000008 R_X86_64_RELATIVE                         aaadd0` |
| `0x17fdbb0` | `0xaaade2` | `00000000017fdbb0  0000000000000008 R_X86_64_RELATIVE                         aaade2` |
| `0x17fdbb8` | `0xaaaebe` | `00000000017fdbb8  0000000000000008 R_X86_64_RELATIVE                         aaaebe` |
| `0x17fdbd0` | `0xaaaedc` | `00000000017fdbd0  0000000000000008 R_X86_64_RELATIVE                         aaaedc` |
| `0x17fdbd8` | `0xaaaee6` | `00000000017fdbd8  0000000000000008 R_X86_64_RELATIVE                         aaaee6` |
| `0x17fdbe8` | `0xaaaefc` | `00000000017fdbe8  0000000000000008 R_X86_64_RELATIVE                         aaaefc` |
| `0x17fdc00` | `0xaab37a` | `00000000017fdc00  0000000000000008 R_X86_64_RELATIVE                         aab37a` |
| `0x17fdc08` | `0xaab384` | `00000000017fdc08  0000000000000008 R_X86_64_RELATIVE                         aab384` |
| `0x17fdc18` | `0xaab39a` | `00000000017fdc18  0000000000000008 R_X86_64_RELATIVE                         aab39a` |
| `0x17fdc20` | `0xaab3a6` | `00000000017fdc20  0000000000000008 R_X86_64_RELATIVE                         aab3a6` |
| `0x17fdc28` | `0xaab5e2` | `00000000017fdc28  0000000000000008 R_X86_64_RELATIVE                         aab5e2` |
| `0x17fdc30` | `0xaab6b0` | `00000000017fdc30  0000000000000008 R_X86_64_RELATIVE                         aab6b0` |
| `0x17fdc38` | `0xaab6bc` | `00000000017fdc38  0000000000000008 R_X86_64_RELATIVE                         aab6bc` |
| `0x17fdc40` | `0xaab844` | `00000000017fdc40  0000000000000008 R_X86_64_RELATIVE                         aab844` |
| `0x17fdc48` | `0xaab8da` | `00000000017fdc48  0000000000000008 R_X86_64_RELATIVE                         aab8da` |
| `0x17fdc80` | `0xaabaee` | `00000000017fdc80  0000000000000008 R_X86_64_RELATIVE                         aabaee` |
| `0x17fdc98` | `0xaabb38` | `00000000017fdc98  0000000000000008 R_X86_64_RELATIVE                         aabb38` |
| `0x17fdcb0` | `0xaabbc4` | `00000000017fdcb0  0000000000000008 R_X86_64_RELATIVE                         aabbc4` |
| `0x17fdcc8` | `0xaabc0e` | `00000000017fdcc8  0000000000000008 R_X86_64_RELATIVE                         aabc0e` |
| `0x17fdce0` | `0xaabc3a` | `00000000017fdce0  0000000000000008 R_X86_64_RELATIVE                         aabc3a` |
| `0x17fdcf8` | `0xaabc74` | `00000000017fdcf8  0000000000000008 R_X86_64_RELATIVE                         aabc74` |
| `0x17fdd10` | `0xaabc8e` | `00000000017fdd10  0000000000000008 R_X86_64_RELATIVE                         aabc8e` |
| `0x17fdd28` | `0xaabcba` | `00000000017fdd28  0000000000000008 R_X86_64_RELATIVE                         aabcba` |
| `0x17fdd40` | `0xaabce2` | `00000000017fdd40  0000000000000008 R_X86_64_RELATIVE                         aabce2` |
| `0x17fdd58` | `0xaabcfc` | `00000000017fdd58  0000000000000008 R_X86_64_RELATIVE                         aabcfc` |
| `0x17fdf38` | `0xaad69e` | `00000000017fdf38  0000000000000008 R_X86_64_RELATIVE                         aad69e` |
| `0x17fdf40` | `0xaad6be` | `00000000017fdf40  0000000000000008 R_X86_64_RELATIVE                         aad6be` |
| `0x17fdf58` | `0xaad6d2` | `00000000017fdf58  0000000000000008 R_X86_64_RELATIVE                         aad6d2` |
| `0x17fdf90` | `0xaad342` | `00000000017fdf90  0000000000000008 R_X86_64_RELATIVE                         aad342` |
| `0x17fdf98` | `0xaad36a` | `00000000017fdf98  0000000000000008 R_X86_64_RELATIVE                         aad36a` |
| `0x17fdfb0` | `0xaad386` | `00000000017fdfb0  0000000000000008 R_X86_64_RELATIVE                         aad386` |
| `0x17fdfd8` | `0xaad1ba` | `00000000017fdfd8  0000000000000008 R_X86_64_RELATIVE                         aad1ba` |
| `0x17fdfe0` | `0xaad1ea` | `00000000017fdfe0  0000000000000008 R_X86_64_RELATIVE                         aad1ea` |
| `0x17fdff8` | `0xaad20e` | `00000000017fdff8  0000000000000008 R_X86_64_RELATIVE                         aad20e` |
| `0x17fe010` | `0xaacd52` | `00000000017fe010  0000000000000008 R_X86_64_RELATIVE                         aacd52` |
| `0x17ff008` | `0xaaab0e` | `00000000017ff008  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff010` | `0xaaab26` | `00000000017ff010  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ff048` | `0xaaab0e` | `00000000017ff048  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff050` | `0xaaab26` | `00000000017ff050  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ff088` | `0xaaab0e` | `00000000017ff088  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff090` | `0xaaab26` | `00000000017ff090  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ff1c8` | `0xaaab0e` | `00000000017ff1c8  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff1d0` | `0xaaab26` | `00000000017ff1d0  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ff248` | `0xaaab0e` | `00000000017ff248  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff250` | `0xaaab26` | `00000000017ff250  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ff3c8` | `0xaaab0e` | `00000000017ff3c8  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff3d0` | `0xaaab26` | `00000000017ff3d0  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ff488` | `0xaaab0e` | `00000000017ff488  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff490` | `0xaaab26` | `00000000017ff490  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ff880` | `0xaaab0e` | `00000000017ff880  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff888` | `0xaaab26` | `00000000017ff888  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ff900` | `0xaaab0e` | `00000000017ff900  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff908` | `0xaaab26` | `00000000017ff908  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ff940` | `0xaaab0e` | `00000000017ff940  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ff948` | `0xaaab26` | `00000000017ff948  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ffc70` | `0xaaa9b2` | `00000000017ffc70  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17ffc78` | `0xaaa9bc` | `00000000017ffc78  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17ffd30` | `0xaaab0e` | `00000000017ffd30  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x17ffd38` | `0xaaab26` | `00000000017ffd38  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x17ffdf0` | `0xaaa9b2` | `00000000017ffdf0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17ffdf8` | `0xaaa9bc` | `00000000017ffdf8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17ffe30` | `0xaaa9b2` | `00000000017ffe30  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17ffe38` | `0xaaa9bc` | `00000000017ffe38  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x17ffef0` | `0xaaa9b2` | `00000000017ffef0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x17ffef8` | `0xaaa9bc` | `00000000017ffef8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x18000c0` | `0xaaab0e` | `00000000018000c0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x18000c8` | `0xaaab26` | `00000000018000c8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1800100` | `0xaaab0e` | `0000000001800100  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1800108` | `0xaaab26` | `0000000001800108  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1800140` | `0xaaa9b2` | `0000000001800140  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x1800148` | `0xaaa9bc` | `0000000001800148  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x18001c0` | `0xaaab0e` | `00000000018001c0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x18001c8` | `0xaaab26` | `00000000018001c8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801380` | `0xaaaedc` | `0000000001801380  0000000000000008 R_X86_64_RELATIVE                         aaaedc` |
| `0x1801388` | `0xaaaee6` | `0000000001801388  0000000000000008 R_X86_64_RELATIVE                         aaaee6` |
| `0x18013a8` | `0xaaab0e` | `00000000018013a8  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x18013b0` | `0xaaab26` | `00000000018013b0  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801500` | `0xaaab0e` | `0000000001801500  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1801508` | `0xaaab26` | `0000000001801508  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801600` | `0xaaa9b2` | `0000000001801600  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x1801608` | `0xaaa9bc` | `0000000001801608  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x18017a0` | `0xaaab0e` | `00000000018017a0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x18017a8` | `0xaaab26` | `00000000018017a8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x18017e0` | `0xaaab0e` | `00000000018017e0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x18017e8` | `0xaaab26` | `00000000018017e8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801820` | `0xaaab0e` | `0000000001801820  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1801828` | `0xaaab26` | `0000000001801828  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x18018a0` | `0xaaab0e` | `00000000018018a0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x18018a8` | `0xaaab26` | `00000000018018a8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x18018e0` | `0xaaab0e` | `00000000018018e0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x18018e8` | `0xaaab26` | `00000000018018e8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801920` | `0xaaab0e` | `0000000001801920  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1801928` | `0xaaab26` | `0000000001801928  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801960` | `0xaaab0e` | `0000000001801960  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1801968` | `0xaaab26` | `0000000001801968  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x18020b0` | `0xaaaedc` | `00000000018020b0  0000000000000008 R_X86_64_RELATIVE                         aaaedc` |
| `0x18020b8` | `0xaaaee6` | `00000000018020b8  0000000000000008 R_X86_64_RELATIVE                         aaaee6` |
| `0x1802398` | `0xaaa9b2` | `0000000001802398  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x18023a0` | `0xaaa9bc` | `00000000018023a0  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x1802430` | `0xaaa9b2` | `0000000001802430  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x1802438` | `0xaaa9bc` | `0000000001802438  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x1808fa0` | `0xaaaedc` | `0000000001808fa0  0000000000000008 R_X86_64_RELATIVE                         aaaedc` |
| `0x1808fa8` | `0xaaaee6` | `0000000001808fa8  0000000000000008 R_X86_64_RELATIVE                         aaaee6` |
| `0x1809a20` | `0xaaab0e` | `0000000001809a20  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1809a28` | `0xaaab26` | `0000000001809a28  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1809aa0` | `0xaaab0e` | `0000000001809aa0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1809aa8` | `0xaaab26` | `0000000001809aa8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1809b80` | `0xaaa9b2` | `0000000001809b80  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x1809b88` | `0xaaa9bc` | `0000000001809b88  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x1809da0` | `0xaaa9b2` | `0000000001809da0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x1809da8` | `0xaaa9bc` | `0000000001809da8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180a460` | `0xaaab0e` | `000000000180a460  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180a468` | `0xaaab26` | `000000000180a468  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180a4a0` | `0xaaa9b2` | `000000000180a4a0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180a4a8` | `0xaaa9bc` | `000000000180a4a8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180a520` | `0xaaa9b2` | `000000000180a520  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180a528` | `0xaaa9bc` | `000000000180a528  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180a5e0` | `0xaaa9b2` | `000000000180a5e0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180a5e8` | `0xaaa9bc` | `000000000180a5e8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180a660` | `0xaaab0e` | `000000000180a660  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180a668` | `0xaaab26` | `000000000180a668  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180a6a0` | `0xaaa9b2` | `000000000180a6a0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180a6a8` | `0xaaa9bc` | `000000000180a6a8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180abf0` | `0xaaac5c` | `000000000180abf0  0000000000000008 R_X86_64_RELATIVE                         aaac5c` |
| `0x180abf8` | `0xaaac84` | `000000000180abf8  0000000000000008 R_X86_64_RELATIVE                         aaac84` |
| `0x180ac40` | `0xaaab0e` | `000000000180ac40  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180ac48` | `0xaaab26` | `000000000180ac48  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180acd0` | `0xaaa9b2` | `000000000180acd0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180acd8` | `0xaaa9bc` | `000000000180acd8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180ad98` | `0xaaaedc` | `000000000180ad98  0000000000000008 R_X86_64_RELATIVE                         aaaedc` |
| `0x180ada0` | `0xaaaee6` | `000000000180ada0  0000000000000008 R_X86_64_RELATIVE                         aaaee6` |
| `0x180aee0` | `0xaaab0e` | `000000000180aee0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180aee8` | `0xaaab26` | `000000000180aee8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180af28` | `0xaaab0e` | `000000000180af28  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180af30` | `0xaaab26` | `000000000180af30  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180af70` | `0xaaab0e` | `000000000180af70  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180af78` | `0xaaab26` | `000000000180af78  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180b060` | `0xaaab0e` | `000000000180b060  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180b068` | `0xaaab26` | `000000000180b068  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180b438` | `0xaaa9b2` | `000000000180b438  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180b440` | `0xaaa9bc` | `000000000180b440  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180b770` | `0xaaa9b2` | `000000000180b770  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180b778` | `0xaaa9bc` | `000000000180b778  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180b810` | `0xaaab0e` | `000000000180b810  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180b818` | `0xaaab26` | `000000000180b818  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180b850` | `0xaaa9b2` | `000000000180b850  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180b858` | `0xaaa9bc` | `000000000180b858  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180b890` | `0xaaa9b2` | `000000000180b890  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180b898` | `0xaaa9bc` | `000000000180b898  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180bb20` | `0xaaa9b2` | `000000000180bb20  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x180bb28` | `0xaaa9bc` | `000000000180bb28  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x180bd48` | `0xaaab0e` | `000000000180bd48  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180bd50` | `0xaaab26` | `000000000180bd50  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180c690` | `0xaacd52` | `000000000180c690  0000000000000008 R_X86_64_RELATIVE                         aacd52` |
| `0x180c948` | `0xaaab0e` | `000000000180c948  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x180c950` | `0xaaab26` | `000000000180c950  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x180e628` | `0xaad792` | `000000000180e628  0000000000000008 R_X86_64_RELATIVE                         aad792` |
| `0x180e8f0` | `0xaad182` | `000000000180e8f0  0000000000000008 R_X86_64_RELATIVE                         aad182` |
| `0x180e8f8` | `0xaad1a2` | `000000000180e8f8  0000000000000008 R_X86_64_RELATIVE                         aad1a2` |
| `0x180e910` | `0xaad1b6` | `000000000180e910  0000000000000008 R_X86_64_RELATIVE                         aad1b6` |
| `0x1811cb0` | `0xaad4dc` | `0000000001811cb0  0000000000000008 R_X86_64_RELATIVE                         aad4dc` |
| `0x1811cb8` | `0xaad4ec` | `0000000001811cb8  0000000000000008 R_X86_64_RELATIVE                         aad4ec` |
| `0x1811cc0` | `0xaad4fe` | `0000000001811cc0  0000000000000008 R_X86_64_RELATIVE                         aad4fe` |
| `0x1811ce8` | `0xaad508` | `0000000001811ce8  0000000000000008 R_X86_64_RELATIVE                         aad508` |
| `0x1811ef8` | `0xaaa9b2` | `0000000001811ef8  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x1811f00` | `0xaaa9bc` | `0000000001811f00  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x1811f38` | `0xaaa9b2` | `0000000001811f38  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x1811f40` | `0xaaa9bc` | `0000000001811f40  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x1812690` | `0xaaab0e` | `0000000001812690  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1812698` | `0xaaab26` | `0000000001812698  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| ... | ... | truncated 1598 more |

## Current v12 interpretation

This report should distinguish whether `aab330` is a direct provider factory, an optional/shared wrapper extractor, or a stack-slot copier. The decisive evidence is any store through the first argument (`rdi`, the `&stack_slot`) and the source object read from the second argument (`rsi`, the original object).
