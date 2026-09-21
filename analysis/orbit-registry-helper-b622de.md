# Orbit registry helper b622de


/tmp/reg184/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b621c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf160>:
  b621c0:	04 25                	add    al,0x25
  b621c2:	28 00                	sub    BYTE PTR [rax],al
  b621c4:	00 00                	add    BYTE PTR [rax],al
  b621c6:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  b621cb:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
  b621cf:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
  b621d3:	6a 02                	push   0x2
  b621d5:	5a                   	pop    rdx
  b621d6:	e8 03 01 00 00       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b621db:	49 8b 07             	mov    rax,QWORD PTR [r15]
  b621de:	4c 8b 68 10          	mov    r13,QWORD PTR [rax+0x10]
  b621e2:	4d 85 ed             	test   r13,r13
  b621e5:	0f 84 b1 00 00 00    	je     b6229c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf23c>
  b621eb:	4d 8b be 38 01 00 00 	mov    r15,QWORD PTR [r14+0x138]
  b621f2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  b621f6:	4c 89 ef             	mov    rdi,r13
  b621f9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  b621fc:	49 89 c4             	mov    r12,rax
  b621ff:	49 8b 6e 20          	mov    rbp,QWORD PTR [r14+0x20]
  b62203:	41 8a 45 20          	mov    al,BYTE PTR [r13+0x20]
  b62207:	88 44 24 0f          	mov    BYTE PTR [rsp+0xf],al
  b6220b:	6a 40                	push   0x40
  b6220d:	5f                   	pop    rdi
  b6220e:	e8 ed bc c8 00       	call   17edf00 <_Znwm@plt>
  b62213:	49 89 c6             	mov    r14,rax
  b62216:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  b6221a:	48 8d 05 c7 ef d0 00 	lea    rax,[rip+0xd0efc7]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
  b62221:	49 89 06             	mov    QWORD PTR [r14],rax
  b62224:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  b62229:	4d 8d 6e 10          	lea    r13,[r14+0x10]
  b6222d:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
  b62232:	6a 18                	push   0x18
  b62234:	5f                   	pop    rdi
  b62235:	e8 c6 bc c8 00       	call   17edf00 <_Znwm@plt>
  b6223a:	4c 89 20             	mov    QWORD PTR [rax],r12
  b6223d:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
  b62241:	48 8d 4c 24 0f       	lea    rcx,[rsp+0xf]
  b62246:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
  b6224a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  b6224e:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
  b62255:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  b62259:	48 8d 05 c6 00 00 00 	lea    rax,[rip+0xc6]        # b62326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2c6>
  b62260:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
  b62264:	0f 57 c0             	xorps  xmm0,xmm0
  b62267:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
  b6226c:	4c 89 f7             	mov    rdi,r14
  b6226f:	4c 89 fe             	mov    rsi,r15
  b62272:	e8 cd c9 f6 ff       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
  b62277:	4c 89 33             	mov    QWORD PTR [rbx],r14
  b6227a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b62281:	00 00 
  b62283:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  b62288:	75 4f                	jne    b622d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf279>
  b6228a:	48 89 d8             	mov    rax,rbx
  b6228d:	48 83 c4 18          	add    rsp,0x18
  b62291:	5b                   	pop    rbx
  b62292:	41 5c                	pop    r12
  b62294:	41 5d                	pop    r13
  b62296:	41 5e                	pop    r14
  b62298:	41 5f                	pop    r15
  b6229a:	5d                   	pop    rbp
  b6229b:	c3                   	ret
  b6229c:	e8 1e 7d f1 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b622a1:	48 89 c3             	mov    rbx,rax
  b622a4:	4c 89 f7             	mov    rdi,r14
  b622a7:	e8 d8 17 f6 ff       	call   ac3a84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a24>
  b622ac:	eb 0b                	jmp    b622b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf259>
  b622ae:	48 89 c3             	mov    rbx,rax
  b622b1:	4c 89 ef             	mov    rdi,r13
  b622b4:	e8 ef 17 f6 ff       	call   ac3aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a48>
  b622b9:	4c 89 f7             	mov    rdi,r14
  b622bc:	e8 5f bc c8 00       	call   17edf20 <_ZdlPv@plt>
  b622c1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b622c8:	00 00 
  b622ca:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  b622cf:	75 08                	jne    b622d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf279>
  b622d1:	48 89 df             	mov    rdi,rbx
  b622d4:	e8 f7 d9 f0 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b622d9:	e8 d2 d7 c8 00       	call   17efab0 <__stack_chk_fail@plt>
  b622de:	50                   	push   rax
  b622df:	48 8d 04 37          	lea    rax,[rdi+rsi*1]
  b622e3:	48 85 f6             	test   rsi,rsi
  b622e6:	74 17                	je     b622ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf29f>
  b622e8:	49 89 f0             	mov    r8,rsi
  b622eb:	48 89 f9             	mov    rcx,rdi
  b622ee:	38 11                	cmp    BYTE PTR [rcx],dl
  b622f0:	74 0a                	je     b622fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf29c>
  b622f2:	48 ff c1             	inc    rcx
  b622f5:	49 ff c8             	dec    r8
  b622f8:	75 f4                	jne    b622ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf28e>
  b622fa:	eb 03                	jmp    b622ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf29f>
  b622fc:	48 89 c8             	mov    rax,rcx
  b622ff:	48 29 f8             	sub    rax,rdi
  b62302:	48 39 f0             	cmp    rax,rsi
  b62305:	74 02                	je     b62309 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2a9>
  b62307:	58                   	pop    rax
  b62308:	c3                   	ret
  b62309:	e8 b1 7c f1 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b6230e:	83 ff 01             	cmp    edi,0x1
  b62311:	74 0c                	je     b6231f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2bf>
  b62313:	85 ff                	test   edi,edi
  b62315:	75 0e                	jne    b62325 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2c5>
  b62317:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
  b6231a:	e9 01 bc c8 00       	jmp    17edf20 <_ZdlPv@plt>
  b6231f:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  b62322:	48 89 06             	mov    QWORD PTR [rsi],rax
  b62325:	c3                   	ret
  b62326:	55                   	push   rbp
  b62327:	41 57                	push   r15
  b62329:	41 56                	push   r14
  b6232b:	53                   	push   rbx
  b6232c:	48 83 ec 18          	sub    rsp,0x18
  b62330:	48 89 fb             	mov    rbx,rdi
  b62333:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  b62336:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  b62339:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  b6233d:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
  b62341:	6a 38                	push   0x38
  b62343:	5f                   	pop    rdi
  b62344:	e8 b7 bb c8 00       	call   17edf00 <_Znwm@plt>
  b62349:	49 89 c6             	mov    r14,rax
  b6234c:	41 8a 2f             	mov    bpl,BYTE PTR [r15]
  b6234f:	48 8d 35 e6 9e 7e ff 	lea    rsi,[rip+0xffffffffff7e9ee6]        # 34c23c <_ZTSSt12bad_any_cast@@Base-0x43f8c>
  b62356:	48 89 c7             	mov    rdi,rax
  b62359:	e8 72 18 a8 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
  b6235e:	48 8d 05 5b ac ca 00 	lea    rax,[rip+0xcaac5b]        # 180cfc0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2c80>
  b62365:	49 89 06             	mov    QWORD PTR [r14],rax
  b62368:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  b6236c:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
  b62371:	41 88 6e 30          	mov    BYTE PTR [r14+0x30],bpl
  b62375:	4c 89 33             	mov    QWORD PTR [rbx],r14
  b62378:	48 89 d8             	mov    rax,rbx
  b6237b:	48 83 c4 18          	add    rsp,0x18
  b6237f:	5b                   	pop    rbx
  b62380:	41 5e                	pop    r14
  b62382:	41 5f                	pop    r15
  b62384:	5d                   	pop    rbp
  b62385:	c3                   	ret
  b62386:	eb 00                	jmp    b62388 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf328>
  b62388:	48 89 c7             	mov    rdi,rax
  b6238b:	e8 15 77 f1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b62390:	b0 02                	mov    al,0x2
  b62392:	c3                   	ret
  b62393:	cc                   	int3
  b62394:	48 8d 05 ec 0b 81 ff 	lea    rax,[rip+0xffffffffff810bec]        # 372f87 <_ZTSSt12bad_any_cast@@Base-0x1d241>
  b6239b:	6a 14                	push   0x14
  b6239d:	5a                   	pop    rdx
  b6239e:	c3                   	ret
  b6239f:	cc                   	int3
  b623a0:	48 8d 05 9b d5 83 ff 	lea    rax,[rip+0xffffffffff83d59b]        # 39f942 <_ZTSN5boost9exceptionE@@Base+0x324>
  b623a7:	6a 03                	push   0x3
  b623a9:	5a                   	pop    rdx
  b623aa:	c3                   	ret
  b623ab:	cc                   	int3
  b623ac:	55                   	push   rbp
  b623ad:	41 57                	push   r15
  b623af:	41 56                	push   r14
  b623b1:	41 55                	push   r13
  b623b3:	41 54                	push   r12
  b623b5:	53                   	push   rbx
  b623b6:	48 81 ec 88 01 00 00 	sub    rsp,0x188
  b623bd:	49 89 ce             	mov    r14,rcx
  b623c0:	48 89 d3             	mov    rbx,rdx
  b623c3:	48 89 fd             	mov    rbp,rdi
  b623c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b623cd:	00 00 
  b623cf:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
  b623d6:	00 
  b623d7:	48 89 cf             	mov    rdi,rcx
  b623da:	e8 95 0e 00 00       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
  b623df:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  b623e4:	4c 89 f7             	mov    rdi,r14
  b623e7:	e8 b4 0e 00 00       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
  b623ec:	49 89 c7             	mov    r15,rax
  b623ef:	4c 89 f7             	mov    rdi,r14
  b623f2:	e8 d3 0e 00 00       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
  b623f7:	49 89 c6             	mov    r14,rax
  b623fa:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
  b62401:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  b62406:	4c 8b 63 68          	mov    r12,QWORD PTR [rbx+0x68]
  b6240a:	48 8d 35 9c cb 7f ff 	lea    rsi,[rip+0xffffffffff7fcb9c]        # 35efad <_ZTSSt12bad_any_cast@@Base-0x3121b>
  b62411:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
  b62416:	4c 89 ef             	mov    rdi,r13
  b62419:	e8 60 76 f1 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  b6241e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  b62422:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  b62429:	00 
  b6242a:	4c 89 e6             	mov    rsi,r12
  b6242d:	4c 89 ea             	mov    rdx,r13
  b62430:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b62433:	49 8b 07             	mov    rax,QWORD PTR [r15]
  b62436:	4c 89 ff             	mov    rdi,r15
  b62439:	ff 50 28             	call   QWORD PTR [rax+0x28]
  b6243c:	49 89 c7             	mov    r15,rax
  b6243f:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
  b62443:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  b62448:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
  b6244c:	49 8b 06             	mov    rax,QWORD PTR [r14]
  b6244f:	4c 89 f7             	mov    rdi,r14
  b62452:	ff 50 40             	call   QWORD PTR [rax+0x40]
  b62455:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  b6245a:	6a 28                	push   0x28
  b6245c:	5f                   	pop    rdi
  b6245d:	e8 9e ba c8 00       	call   17edf00 <_Znwm@plt>
  b62462:	31 d2                	xor    edx,edx
  b62464:	88 50 08             	mov    BYTE PTR [rax+0x8],dl
  b62467:	48 8d 0d 4a aa ca 00 	lea    rcx,[rip+0xcaaa4a]        # 180ceb8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2b78>
  b6246e:	48 89 08             	mov    QWORD PTR [rax],rcx
  b62471:	48 8d 58 10          	lea    rbx,[rax+0x10]
  b62475:	48 89 c1             	mov    rcx,rax
  b62478:	48 83 c1 18          	add    rcx,0x18
  b6247c:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
  b62481:	66 0f 57 c0          	xorpd  xmm0,xmm0
  b62485:	66 0f 11 40 10       	movupd XMMWORD PTR [rax+0x10],xmm0
  b6248a:	88 50 20             	mov    BYTE PTR [rax+0x20],dl
  b6248d:	6a 10                	push   0x10
  b6248f:	5f                   	pop    rdi
  b62490:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  b62495:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
  b6249a:	e8 61 ba c8 00       	call   17edf00 <_Znwm@plt>
  b6249f:	49 89 c6             	mov    r14,rax
  b624a2:	48 8d 35 82 70 81 ff 	lea    rsi,[rip+0xffffffffff817082]        # 37952b <_ZTSSt12bad_any_cast@@Base-0x16c9d>
  b624a9:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  b624b0:	00 
  b624b1:	e8 c8 75 f1 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  b624b6:	48 8d 94 24 00 01 00 	lea    rdx,[rsp+0x100]
  b624bd:	00 
  b624be:	48 83 62 20 00       	and    QWORD PTR [rdx+0x20],0x0
  b624c3:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
  b624ca:	00 
  b624cb:	4c 89 f7             	mov    rdi,r14
  b624ce:	e8 51 04 ab 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>
  b624d3:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
  b624d8:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
  b624dd:	4c 8d bc 24 e0 00 00 	lea    r15,[rsp+0xe0]
  b624e4:	00 
  b624e5:	49 83 27 00          	and    QWORD PTR [r15],0x0
  b624e9:	48 89 df             	mov    rdi,rbx
  b624ec:	4c 89 f6             	mov    rsi,r14
  b624ef:	e8 00 0e 00 00       	call   b632f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0294>
  b624f4:	4c 89 ff             	mov    rdi,r15
  b624f7:	e8 22 0e 00 00       	call   b6331e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02be>
  b624fc:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b62503:	00 
  b62504:	e8 61 7a f1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b62509:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  b62510:	00 
  b62511:	e8 7a b9 c8 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b62516:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  b62519:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b6251c:	ff 50 10             	call   QWORD PTR [rax+0x10]
  b6251f:	4c                   	rex.WR

## Calls to helper with id 0xb8
  b284db:	e9 1c 03 00 00       	jmp    b287fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7579c>
  b284e0:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  b284e5:	e8 1a c4 fd ff       	call   b04904 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x518a4>
  b284ea:	48 8d 35 8b 9a 92 ff 	lea    rsi,[rip+0xffffffffff929a8b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  b284f1:	48 8d 0d 50 93 81 ff 	lea    rcx,[rip+0xffffffffff819350]        # 341848 <_ZTSSt12bad_any_cast@@Base-0x4e980>
  b284f8:	31 db                	xor    ebx,ebx
  b284fa:	6a 04                	push   0x4
  b284fc:	5f                   	pop    rdi
  b284fd:	ba b8 00 00 00       	mov    edx,0xb8
  b28502:	31 c0                	xor    eax,eax
  b28504:	e8 c9 e3 ca 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  b28509:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  b2850e:	88 1e                	mov    BYTE PTR [rsi],bl
  b28510:	88 5e 38             	mov    BYTE PTR [rsi+0x38],bl
  b28513:	4c 89 f7             	mov    rdi,r14
  b28516:	e8 37 08 00 00       	call   b28d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75cf2>
  b2851b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  b28520:	e8 df c3 fd ff       	call   b04904 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x518a4>
  b28525:	49 8d be 98 00 00 00 	lea    rdi,[r14+0x98]
  b2852c:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
  b28531:	c6 44 24 38 01       	mov    BYTE PTR [rsp+0x38],0x1
  b28536:	e8 b5 5b cc 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
  b2853b:	49 8b 86 08 01 00 00 	mov    rax,QWORD PTR [r14+0x108]
  b28542:	49 3b 86 10 01 00 00 	cmp    rax,QWORD PTR [r14+0x110]
  b28549:	0f 85 da 00 00 00    	jne    b28629 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x755c9>
  b2854f:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
  b28554:	48 8d 35 21 9a 92 ff 	lea    rsi,[rip+0xffffffffff929a21]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
--
  b6f63c:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
  b6f641:	66 83 60 10 00       	and    WORD PTR [rax+0x10],0x0
  b6f646:	f2 0f 10 44 24 18    	movsd  xmm0,QWORD PTR [rsp+0x18]
  b6f64c:	f2 0f 11 80 b0 00 00 	movsd  QWORD PTR [rax+0xb0],xmm0
  b6f653:	00 
  b6f654:	88 88 b8 00 00 00    	mov    BYTE PTR [rax+0xb8],cl
  b6f65a:	49 89 86 c8 01 00 00 	mov    QWORD PTR [r14+0x1c8],rax
  b6f661:	49 8d be d0 01 00 00 	lea    rdi,[r14+0x1d0]
  b6f668:	ba b8 00 00 00       	mov    edx,0xb8
  b6f66d:	31 f6                	xor    esi,esi
  b6f66f:	e8 1c f5 c7 00       	call   17eeb90 <memset@plt>
  b6f674:	49 8d be 90 02 00 00 	lea    rdi,[r14+0x290]
  b6f67b:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
  b6f680:	e8 55 5d ff ff       	call   b653da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb237a>
  b6f685:	41 83 a6 f8 02 00 00 	and    DWORD PTR [r14+0x2f8],0x0
  b6f68c:	00 
  b6f68d:	41 83 a6 00 03 00 00 	and    DWORD PTR [r14+0x300],0x0
  b6f694:	00 
  b6f695:	49 8d 86 10 03 00 00 	lea    rax,[r14+0x310]
  b6f69c:	0f 57 c0             	xorps  xmm0,xmm0
  b6f69f:	41 0f 11 86 10 03 00 	movups XMMWORD PTR [r14+0x310],xmm0
  b6f6a6:	00 
  b6f6a7:	49 89 86 08 03 00 00 	mov    QWORD PTR [r14+0x308],rax
  b6f6ae:	41 0f 11 86 20 03 00 	movups XMMWORD PTR [r14+0x320],xmm0
  b6f6b5:	00 
  b6f6b6:	41 0f 11 86 30 03 00 	movups XMMWORD PTR [r14+0x330],xmm0
  b6f6bd:	00 
--
  b8f020:	4c 89 ef             	mov    rdi,r13
  b8f023:	e8 a8 0c ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b8f028:	e8 83 0a c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b8f02d:	cc                   	int3
  b8f02e:	53                   	push   rbx
  b8f02f:	48 89 fb             	mov    rbx,rdi
  b8f032:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b8f036:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b8f03a:	ba b8 00 00 00       	mov    edx,0xb8
  b8f03f:	e8 9a 32 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b8f044:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]
  b8f04e:	48 85 c0             	test   rax,rax
  b8f051:	74 02                	je     b8f055 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbff5>
  b8f053:	5b                   	pop    rbx
  b8f054:	c3                   	ret
  b8f055:	e8 65 af ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b8f05a:	48 8d 05 67 f3 c7 00 	lea    rax,[rip+0xc7f367]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
  b8f061:	48 89 07             	mov    QWORD PTR [rdi],rax
  b8f064:	48 83 c7 10          	add    rdi,0x10
  b8f068:	e9 bb ad ee ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
  b8f06d:	cc                   	int3
  b8f06e:	53                   	push   rbx
  b8f06f:	48 89 fb             	mov    rbx,rdi
  b8f072:	e8 e3 ff ff ff       	call   b8f05a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbffa>
  b8f077:	48 89 df             	mov    rdi,rbx
  b8f07a:	5b                   	pop    rbx
--
  c35a7e:	48 39 d8             	cmp    rax,rbx
  c35a81:	75 dc                	jne    c35a5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1829ff>
  c35a83:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
  c35a8a:	00 
  c35a8b:	eb 6a                	jmp    c35af7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x182a97>
  c35a8d:	bf b8 00 00 00       	mov    edi,0xb8
  c35a92:	e8 69 84 bb 00       	call   17edf00 <_Znwm@plt>
  c35a97:	49 89 c6             	mov    r14,rax
  c35a9a:	ba b8 00 00 00       	mov    edx,0xb8
  c35a9f:	48 89 c7             	mov    rdi,rax
  c35aa2:	31 f6                	xor    esi,esi
  c35aa4:	e8 e7 90 bb 00       	call   17eeb90 <memset@plt>
  c35aa9:	48 8d 05 e8 22 be 00 	lea    rax,[rip+0xbe22e8]        # 1817d98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xda58>
  c35ab0:	49 89 06             	mov    QWORD PTR [r14],rax
  c35ab3:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  c35ab7:	e8 7e 2e f1 ff       	call   b4893a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x958da>
  c35abc:	4c 89 f7             	mov    rdi,r14
  c35abf:	48 83 c7 60          	add    rdi,0x60
  c35ac3:	e8 3a 43 ba 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  c35ac8:	48 8b 9c 24 80 00 00 	mov    rbx,QWORD PTR [rsp+0x80]
  c35acf:	00 
  c35ad0:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
  c35ad5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  c35ad8:	4c 89 30             	mov    QWORD PTR [rax],r14
  c35adb:	48 85 ff             	test   rdi,rdi
  c35ade:	0f 84 e8 02 00 00    	je     c35dcc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x182d6c>
  c35ae4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
--
  c64280:	74 07                	je     c64289 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b1229>
  c64282:	4c 8b 44 24 68       	mov    r8,QWORD PTR [rsp+0x68]
  c64287:	eb 05                	jmp    c6428e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b122e>
  c64289:	4c 8d 44 24 59       	lea    r8,[rsp+0x59]
  c6428e:	48 8d 35 e7 dc 7e ff 	lea    rsi,[rip+0xffffffffff7edce7]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  c64295:	48 8d 0d 91 ef 70 ff 	lea    rcx,[rip+0xffffffffff70ef91]        # 37322d <_ZTSSt12bad_any_cast@@Base-0x1cf9b>
  c6429c:	6a 04                	push   0x4
  c6429e:	5f                   	pop    rdi
  c6429f:	ba b8 00 00 00       	mov    edx,0xb8
  c642a4:	31 c0                	xor    eax,eax
  c642a6:	e8 27 26 b7 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  c642ab:	4c 89 f7             	mov    rdi,r14
  c642ae:	e8 dd 9b b8 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c642b3:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
  c642b7:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
  c642bb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c642be:	ff 50 18             	call   QWORD PTR [rax+0x18]
  c642c1:	e9 67 fd ff ff       	jmp    c6402d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b0fcd>
  c642c6:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
  c642cd:	00 
  c642ce:	48 8d 94 24 70 01 00 	lea    rdx,[rsp+0x170]
  c642d5:	00 
  c642d6:	4c 89 fe             	mov    rsi,r15
  c642d9:	e8 70 8c ff ff       	call   c5cf4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a9eee>
  c642de:	4c 8d 74 24 58       	lea    r14,[rsp+0x58]
  c642e3:	4c 8d bc 24 e8 00 00 	lea    r15,[rsp+0xe8]
  c642ea:	00 
--
  e9ffad:	49 8d 9c 24 80 00 00 	lea    rbx,[r12+0x80]
  e9ffb4:	00 
  e9ffb5:	48 89 df             	mov    rdi,rbx
  e9ffb8:	48 8d b4 24 e0 07 00 	lea    rsi,[rsp+0x7e0]
  e9ffbf:	00 
  e9ffc0:	e8 17 df 02 00       	call   ecdedc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952f2>
  e9ffc5:	49 8d bc 24 b0 00 00 	lea    rdi,[r12+0xb0]
  e9ffcc:	00 
  e9ffcd:	ba b8 00 00 00       	mov    edx,0xb8
  e9ffd2:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
  e9ffd9:	00 
  e9ffda:	e8 f1 fa 94 00       	call   17efad0 <memcpy@plt>
  e9ffdf:	48 8b 84 24 d0 08 00 	mov    rax,QWORD PTR [rsp+0x8d0]
  e9ffe6:	00 
  e9ffe7:	0f 10 84 24 c8 08 00 	movups xmm0,XMMWORD PTR [rsp+0x8c8]
  e9ffee:	00 
  e9ffef:	41 0f 11 84 24 68 01 	movups XMMWORD PTR [r12+0x168],xmm0
  e9fff6:	00 00 
  e9fff8:	48 85 c0             	test   rax,rax
  e9fffb:	74 05                	je     ea0002 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67418>
  e9fffd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ea0002:	48 8b 84 24 e0 08 00 	mov    rax,QWORD PTR [rsp+0x8e0]
  ea0009:	00 
  ea000a:	f3 0f 6f 84 24 d8 08 	movdqu xmm0,XMMWORD PTR [rsp+0x8d8]
  ea0011:	00 00 
  ea0013:	f3 41 0f 7f 84 24 78 	movdqu XMMWORD PTR [r12+0x178],xmm0
  ea001a:	01 00 00 
--
  ea0268:	e8 2b dc 02 00       	call   ecde98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952ae>
  ea026d:	4d 8d ac 24 80 00 00 	lea    r13,[r12+0x80]
  ea0274:	00 
  ea0275:	4c 89 ef             	mov    rdi,r13
  ea0278:	4c 89 fe             	mov    rsi,r15
  ea027b:	e8 5c dc 02 00       	call   ecdedc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952f2>
  ea0280:	49 8d bc 24 b0 00 00 	lea    rdi,[r12+0xb0]
  ea0287:	00 
  ea0288:	ba b8 00 00 00       	mov    edx,0xb8
  ea028d:	48 8d b4 24 00 11 00 	lea    rsi,[rsp+0x1100]
  ea0294:	00 
  ea0295:	e8 36 f8 94 00       	call   17efad0 <memcpy@plt>
  ea029a:	48 8b 84 24 c0 11 00 	mov    rax,QWORD PTR [rsp+0x11c0]
  ea02a1:	00 
  ea02a2:	0f 10 84 24 b8 11 00 	movups xmm0,XMMWORD PTR [rsp+0x11b8]
  ea02a9:	00 
  ea02aa:	41 0f 11 84 24 68 01 	movups XMMWORD PTR [r12+0x168],xmm0
  ea02b1:	00 00 
  ea02b3:	48 85 c0             	test   rax,rax
  ea02b6:	74 05                	je     ea02bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676d3>
  ea02b8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ea02bd:	48 8b 84 24 d0 11 00 	mov    rax,QWORD PTR [rsp+0x11d0]
  ea02c4:	00 
  ea02c5:	f3 0f 6f 84 24 c8 11 	movdqu xmm0,XMMWORD PTR [rsp+0x11c8]
  ea02cc:	00 00 
  ea02ce:	f3 41 0f 7f 84 24 78 	movdqu XMMWORD PTR [r12+0x178],xmm0
  ea02d5:	01 00 00 
--
  ee6bc3:	e8 c8 36 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ee6bc8:	4c 8d 63 70          	lea    r12,[rbx+0x70]
  ee6bcc:	49 8d 76 70          	lea    rsi,[r14+0x70]
  ee6bd0:	4c 89 e7             	mov    rdi,r12
  ee6bd3:	e8 b8 36 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ee6bd8:	be a0 00 00 00       	mov    esi,0xa0
  ee6bdd:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
  ee6be1:	4c 01 f6             	add    rsi,r14
  ee6be4:	ba b8 00 00 00       	mov    edx,0xb8
  ee6be9:	e8 e2 8e 90 00       	call   17efad0 <memcpy@plt>
  ee6bee:	49 8b 86 58 01 00 00 	mov    rax,QWORD PTR [r14+0x158]
  ee6bf5:	48 89 83 58 01 00 00 	mov    QWORD PTR [rbx+0x158],rax
  ee6bfc:	49 8b 86 60 01 00 00 	mov    rax,QWORD PTR [r14+0x160]
  ee6c03:	48 89 83 60 01 00 00 	mov    QWORD PTR [rbx+0x160],rax
  ee6c0a:	48 85 c0             	test   rax,rax
  ee6c0d:	74 05                	je     ee6c14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae02a>
  ee6c0f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ee6c14:	49 8b 86 68 01 00 00 	mov    rax,QWORD PTR [r14+0x168]
  ee6c1b:	48 89 83 68 01 00 00 	mov    QWORD PTR [rbx+0x168],rax
  ee6c22:	49 8b 86 70 01 00 00 	mov    rax,QWORD PTR [r14+0x170]
  ee6c29:	48 89 83 70 01 00 00 	mov    QWORD PTR [rbx+0x170],rax
  ee6c30:	48 85 c0             	test   rax,rax
  ee6c33:	74 05                	je     ee6c3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae050>
  ee6c35:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ee6c3a:	be 78 01 00 00       	mov    esi,0x178
  ee6c3f:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
  ee6c43:	4c 01 f6             	add    rsi,r14
--
  ee702d:	e8 5e 32 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ee7032:	4c 8d 63 70          	lea    r12,[rbx+0x70]
  ee7036:	49 8d 76 70          	lea    rsi,[r14+0x70]
  ee703a:	4c 89 e7             	mov    rdi,r12
  ee703d:	e8 4e 32 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ee7042:	be a0 00 00 00       	mov    esi,0xa0
  ee7047:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
  ee704b:	4c 01 f6             	add    rsi,r14
  ee704e:	ba b8 00 00 00       	mov    edx,0xb8
  ee7053:	e8 78 8a 90 00       	call   17efad0 <memcpy@plt>
  ee7058:	49 8b 86 58 01 00 00 	mov    rax,QWORD PTR [r14+0x158]
  ee705f:	48 89 83 58 01 00 00 	mov    QWORD PTR [rbx+0x158],rax
  ee7066:	49 8b 86 60 01 00 00 	mov    rax,QWORD PTR [r14+0x160]
  ee706d:	48 89 83 60 01 00 00 	mov    QWORD PTR [rbx+0x160],rax
  ee7074:	48 85 c0             	test   rax,rax
  ee7077:	74 05                	je     ee707e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae494>
  ee7079:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ee707e:	49 8b 86 68 01 00 00 	mov    rax,QWORD PTR [r14+0x168]
  ee7085:	48 89 83 68 01 00 00 	mov    QWORD PTR [rbx+0x168],rax
  ee708c:	49 8b 86 70 01 00 00 	mov    rax,QWORD PTR [r14+0x170]
  ee7093:	48 89 83 70 01 00 00 	mov    QWORD PTR [rbx+0x170],rax
  ee709a:	48 85 c0             	test   rax,rax
  ee709d:	74 05                	je     ee70a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae4ba>
  ee709f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ee70a4:	be 78 01 00 00       	mov    esi,0x178
  ee70a9:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
  ee70ad:	4c 01 f6             	add    rsi,r14
--
 10d0edb:	48 89 8c 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rcx
 10d0ee2:	00 
 10d0ee3:	48 83 a7 f0 00 00 00 	and    QWORD PTR [rdi+0xf0],0x0
 10d0eea:	00 
 10d0eeb:	48 83 a7 20 01 00 00 	and    QWORD PTR [rdi+0x120],0x0
 10d0ef2:	00 
 10d0ef3:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
 10d0ef8:	88 87 38 01 00 00    	mov    BYTE PTR [rdi+0x138],al
 10d0efe:	ba b8 00 00 00       	mov    edx,0xb8
 10d0f03:	48 89 b4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rsi
 10d0f0a:	00 
 10d0f0b:	48 89 f7             	mov    rdi,rsi
 10d0f0e:	31 f6                	xor    esi,esi
 10d0f10:	e8 7b dc 71 00       	call   17eeb90 <memset@plt>
 10d0f15:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10d0f19:	bb 80 ee 36 00       	mov    ebx,0x36ee80
 10d0f1e:	48 8d 35 db 6d 30 ff 	lea    rsi,[rip+0xffffffffff306ddb]        # 3d7d00 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x28e5>
 10d0f25:	48 8d 0d e4 6d 30 ff 	lea    rcx,[rip+0xffffffffff306de4]        # 3d7d10 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x28f5>
 10d0f2c:	6a 0f                	push   0xf
 10d0f2e:	41 5e                	pop    r14
 10d0f30:	6a 15                	push   0x15
 10d0f32:	41 58                	pop    r8
 10d0f34:	41 bf 10 27 00 00    	mov    r15d,0x2710
 10d0f3a:	4c 89 f2             	mov    rdx,r14
 10d0f3d:	41 b9 10 27 00 00    	mov    r9d,0x2710
 10d0f43:	53                   	push   rbx
 10d0f44:	6a 00                	push   0x0
--
 118010a:	53                   	push   rbx
 118010b:	50                   	push   rax
 118010c:	48 89 f3             	mov    rbx,rsi
 118010f:	49 89 fe             	mov    r14,rdi
 1180112:	48 8d 05 07 7c 71 00 	lea    rax,[rip+0x717c07]        # 1897d20 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4c60>
 1180119:	48 89 07             	mov    QWORD PTR [rdi],rax
 118011c:	48 83 c7 08          	add    rdi,0x8
 1180120:	48 83 c6 08          	add    rsi,0x8
 1180124:	ba b8 00 00 00       	mov    edx,0xb8
 1180129:	e8 a2 f9 66 00       	call   17efad0 <memcpy@plt>
 118012e:	b8 c0 00 00 00       	mov    eax,0xc0
 1180133:	49 01 c6             	add    r14,rax
 1180136:	48 01 c3             	add    rbx,rax
 1180139:	4c 89 f7             	mov    rdi,r14
 118013c:	48 89 de             	mov    rsi,rbx
 118013f:	48 83 c4 08          	add    rsp,0x8
 1180143:	5b                   	pop    rbx
 1180144:	41 5e                	pop    r14
 1180146:	e9 ad 73 95 ff       	jmp    ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
 118014b:	cc                   	int3
 118014c:	83 ff 01             	cmp    edi,0x1
 118014f:	74 22                	je     1180173 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347589>
 1180151:	85 ff                	test   edi,edi
 1180153:	75 24                	jne    1180179 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34758f>
 1180155:	53                   	push   rbx
 1180156:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
 1180159:	48 85 db             	test   rbx,rbx
--
 11ee6a0:	48 89 df             	mov    rdi,rbx
 11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
 11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 11ee6ad:	48 89 df             	mov    rdi,rbx
 11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
 11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
 11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
 11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
 11ee6e0:	48 89 df             	mov    rdi,rbx
 11ee6e3:	e8 2c 99 99 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
 11ee6e8:	49 89 c4             	mov    r12,rax
 11ee6eb:	48 89 df             	mov    rdi,rbx
 11ee6ee:	e8 43 86 ac ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
 11ee6f3:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
 11ee6fa:	00 
 11ee6fb:	48 89 df             	mov    rdi,rbx
 11ee6fe:	e8 c7 6a bf ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
 11ee703:	48 89 c5             	mov    rbp,rax
 11ee706:	48 89 df             	mov    rdi,rbx
 11ee709:	e8 c0 30 a2 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
 11ee70e:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
--
 135c787:	49 89 ce             	mov    r14,rcx
 135c78a:	49 89 d7             	mov    r15,rdx
 135c78d:	48 89 fb             	mov    rbx,rdi
 135c790:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135c797:	00 00 
 135c799:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 135c79e:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
 135c7a2:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
 135c7a6:	ba b8 00 00 00       	mov    edx,0xb8
 135c7ab:	e8 2e 5b 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
 135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]
 135c7ba:	4c 89 f7             	mov    rdi,r14
 135c7bd:	e8 d8 a4 a8 ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
 135c7c2:	49 8b 8f 90 00 00 00 	mov    rcx,QWORD PTR [r15+0x90]
 135c7c9:	49 8b b7 38 01 00 00 	mov    rsi,QWORD PTR [r15+0x138]
 135c7d0:	49 83 c6 20          	add    r14,0x20
 135c7d4:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
 135c7d9:	49 83 20 00          	and    QWORD PTR [r8],0x0
 135c7dd:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 135c7e2:	4c 89 f2             	mov    rdx,r14
 135c7e5:	e8 21 3e 96 ff       	call   cc060b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d5ab>
 135c7ea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 135c7ef:	48 89 03             	mov    QWORD PTR [rbx],rax
 135c7f2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 135c7f7:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
 135c7fd:	48 85 ff             	test   rdi,rdi
--
 14ab8d5:	e8 f8 af 32 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 14ab8da:	e8 e0 e6 5c ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
 14ab8df:	e8 cc 41 34 00       	call   17efab0 <__stack_chk_fail@plt>
 14ab8e4:	49 83 c7 19          	add    r15,0x19
 14ab8e8:	48 8d 35 8d 66 fa fe 	lea    rsi,[rip+0xfffffffffefa668d]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 14ab8ef:	48 8d 0d 86 18 e9 fe 	lea    rcx,[rip+0xfffffffffee91886]        # 33d17c <_ZTSSt12bad_any_cast@@Base-0x5304c>
 14ab8f6:	6a 02                	push   0x2
 14ab8f8:	5f                   	pop    rdi
 14ab8f9:	ba b8 00 00 00       	mov    edx,0xb8
 14ab8fe:	4d 89 f8             	mov    r8,r15
 14ab901:	31 c0                	xor    eax,eax
 14ab903:	e8 ca af 32 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 14ab908:	e8 b2 e6 5c ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
 14ab90d:	48 89 c7             	mov    rdi,rax
 14ab910:	e8 90 e1 5c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 14ab915:	cc                   	int3
 14ab916:	53                   	push   rbx
 14ab917:	48 89 fb             	mov    rbx,rdi
 14ab91a:	48 83 c6 f0          	add    rsi,0xfffffffffffffff0
 14ab91e:	e8 73 f6 ff ff       	call   14aaf96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f051a>
 14ab923:	48 89 d8             	mov    rax,rbx
 14ab926:	5b                   	pop    rbx
 14ab927:	c3                   	ret
 14ab928:	53                   	push   rbx
 14ab929:	48 89 fb             	mov    rbx,rdi
 14ab92c:	48 83 c6 f0          	add    rsi,0xfffffffffffffff0
 14ab930:	e8 19 fa ff ff       	call   14ab34e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f08d2>
--
 16a46c7:	e8 ac af 41 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
 16a46cc:	ba a0 00 00 00       	mov    edx,0xa0
 16a46d1:	49 8d 3c 16          	lea    rdi,[r14+rdx*1]
 16a46d5:	48 01 da             	add    rdx,rbx
 16a46d8:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
 16a46df:	00 
 16a46e0:	31 f6                	xor    esi,esi
 16a46e2:	e8 91 af 41 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
 16a46e7:	ba b8 00 00 00       	mov    edx,0xb8
 16a46ec:	49 8d 3c 16          	lea    rdi,[r14+rdx*1]
 16a46f0:	48 01 da             	add    rdx,rbx
 16a46f3:	48 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rdi
 16a46fa:	00 
 16a46fb:	31 f6                	xor    esi,esi
 16a46fd:	e8 76 af 41 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
 16a4702:	ba d0 00 00 00       	mov    edx,0xd0
 16a4707:	49 8d 3c 16          	lea    rdi,[r14+rdx*1]
 16a470b:	48 01 da             	add    rdx,rbx
 16a470e:	48 89 bc 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rdi
 16a4715:	00 
 16a4716:	31 f6                	xor    esi,esi
 16a4718:	e8 5b af 41 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
 16a471d:	ba e8 00 00 00       	mov    edx,0xe8
 16a4722:	49 8d 3c 16          	lea    rdi,[r14+rdx*1]
 16a4726:	48 01 da             	add    rdx,rbx
 16a4729:	48 89 bc 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rdi
 16a4730:	00 
--
 16b7c28:	e8 4b 7a 40 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
 16b7c2d:	ba a0 00 00 00       	mov    edx,0xa0
 16b7c32:	49 8d 3c 16          	lea    rdi,[r14+rdx*1]
 16b7c36:	4c 01 e2             	add    rdx,r12
 16b7c39:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
 16b7c40:	00 
 16b7c41:	4c 89 ee             	mov    rsi,r13
 16b7c44:	e8 2f 7a 40 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
 16b7c49:	ba b8 00 00 00       	mov    edx,0xb8
 16b7c4e:	49 8d 3c 16          	lea    rdi,[r14+rdx*1]
 16b7c52:	4c 01 e2             	add    rdx,r12
 16b7c55:	48 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rdi
 16b7c5c:	00 
 16b7c5d:	4c 89 ee             	mov    rsi,r13
 16b7c60:	e8 13 7a 40 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
 16b7c65:	ba d0 00 00 00       	mov    edx,0xd0
 16b7c6a:	49 8d 3c 16          	lea    rdi,[r14+rdx*1]
 16b7c6e:	4c 01 e2             	add    rdx,r12
 16b7c71:	48 89 bc 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rdi
 16b7c78:	00 
 16b7c79:	4c 89 ee             	mov    rsi,r13
 16b7c7c:	e8 f7 79 40 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
 16b7c81:	ba e8 00 00 00       	mov    edx,0xe8
 16b7c86:	49 8d 3c 16          	lea    rdi,[r14+rdx*1]
 16b7c8a:	4c 01 e2             	add    rdx,r12
 16b7c8d:	48 89 bc 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rdi
 16b7c94:	00 
--
 1705235:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 170523a:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 170523e:	48 85 ff             	test   rdi,rdi
 1705241:	74 05                	je     1705248 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb93b4>
 1705243:	e8 de c7 08 00       	call   1791a26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x145b92>
 1705248:	4c 89 ef             	mov    rdi,r13
 170524b:	e8 ac f5 ff ff       	call   17047fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb8968>
 1705250:	48 89 c3             	mov    rbx,rax
 1705253:	ba b8 00 00 00       	mov    edx,0xb8
 1705258:	48 89 c7             	mov    rdi,rax
 170525b:	31 f6                	xor    esi,esi
 170525d:	e8 2e 99 0e 00       	call   17eeb90 <memset@plt>
 1705262:	6a 01                	push   0x1
 1705264:	5e                   	pop    rsi
 1705265:	4c 89 ef             	mov    rdi,r13
 1705268:	e8 db ad 01 00       	call   1720048 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd41b4>
 170526d:	49 89 c5             	mov    r13,rax
 1705270:	48 8d 6c 24 08       	lea    rbp,[rsp+0x8]
 1705275:	48 89 ef             	mov    rdi,rbp
 1705278:	4c 89 e6             	mov    rsi,r12
 170527b:	4c 89 fa             	mov    rdx,r15
 170527e:	e8 97 77 39 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 1705283:	4c 89 ef             	mov    rdi,r13
 1705286:	48 89 ee             	mov    rsi,rbp
 1705289:	e8 a0 67 37 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 170528e:	48 89 ef             	mov    rdi,rbp
 1705291:	e8 fa 8b 0e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
