# Service184 embedded +0x578 object trace

## Initializer 0x121e20e

/tmp/s184obj/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000121e180 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63704>:
 121e180:	00 00                	add    BYTE PTR [rax],al
 121e182:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
 121e186:	49 01 c6             	add    r14,rax
 121e189:	4c 89 f6             	mov    rsi,r14
 121e18c:	e8 d3 75 8b ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
 121e191:	48 89 d8             	mov    rax,rbx
 121e194:	48 83 c4 08          	add    rsp,0x8
 121e198:	5b                   	pop    rbx
 121e199:	41 5e                	pop    r14
 121e19b:	c3                   	ret
 121e19c:	41 56                	push   r14
 121e19e:	53                   	push   rbx
 121e19f:	50                   	push   rax
 121e1a0:	48 89 f3             	mov    rbx,rsi
 121e1a3:	49 89 fe             	mov    r14,rdi
 121e1a6:	e8 83 d8 85 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 121e1ab:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 121e1af:	e8 7a 46 d4 ff       	call   f6282e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x129c44>
 121e1b4:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
 121e1b8:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 121e1bc:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 121e1c0:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
 121e1c4:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
 121e1c8:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
 121e1cc:	0f 57 c0             	xorps  xmm0,xmm0
 121e1cf:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
 121e1d3:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
 121e1d8:	4c 89 f0             	mov    rax,r14
 121e1db:	48 83 c4 08          	add    rsp,0x8
 121e1df:	5b                   	pop    rbx
 121e1e0:	41 5e                	pop    r14
 121e1e2:	c3                   	ret
 121e1e3:	cc                   	int3
 121e1e4:	41 56                	push   r14
 121e1e6:	53                   	push   rbx
 121e1e7:	50                   	push   rax
 121e1e8:	48 89 f3             	mov    rbx,rsi
 121e1eb:	49 89 fe             	mov    r14,rdi
 121e1ee:	e8 37 00 00 00       	call   121e22a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x637ae>
 121e1f3:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 121e1f7:	48 83 c3 38          	add    rbx,0x38
 121e1fb:	48 89 de             	mov    rsi,rbx
 121e1fe:	e8 27 00 00 00       	call   121e22a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x637ae>
 121e203:	4c 89 f0             	mov    rax,r14
 121e206:	48 83 c4 08          	add    rsp,0x8
 121e20a:	5b                   	pop    rbx
 121e20b:	41 5e                	pop    r14
 121e20d:	c3                   	ret
 121e20e:	53                   	push   rbx
 121e20f:	48 89 fb             	mov    rbx,rdi
 121e212:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 121e215:	48 89 07             	mov    QWORD PTR [rdi],rax
 121e218:	48 83 c7 08          	add    rdi,0x8
 121e21c:	48 83 c6 08          	add    rsi,0x8
 121e220:	e8 c1 7f c0 ff       	call   e261e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf326c>
 121e225:	48 89 d8             	mov    rax,rbx
 121e228:	5b                   	pop    rbx
 121e229:	c3                   	ret
 121e22a:	41 56                	push   r14
 121e22c:	53                   	push   rbx
 121e22d:	50                   	push   rax
 121e22e:	48 89 f3             	mov    rbx,rsi
 121e231:	49 89 fe             	mov    r14,rdi
 121e234:	e8 49 b5 ff ff       	call   1219782 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ed06>
 121e239:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 121e23c:	49 89 06             	mov    QWORD PTR [r14],rax
 121e23f:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 121e243:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 121e247:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
 121e24b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 121e24f:	0f 57 c0             	xorps  xmm0,xmm0
 121e252:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 121e255:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 121e25a:	0f 10 43 18          	movups xmm0,XMMWORD PTR [rbx+0x18]
 121e25e:	0f 10 4b 21          	movups xmm1,XMMWORD PTR [rbx+0x21]
 121e262:	41 0f 11 4e 21       	movups XMMWORD PTR [r14+0x21],xmm1
 121e267:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
 121e26c:	4c 89 f0             	mov    rax,r14
 121e26f:	48 83 c4 08          	add    rsp,0x8
 121e273:	5b                   	pop    rbx
 121e274:	41 5e                	pop    r14
 121e276:	c3                   	ret
 121e277:	cc                   	int3
 121e278:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 121e27b:	e9 50 00 00 00       	jmp    121e2d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63854>
 121e280:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 121e283:	e9 00 00 00 00       	jmp    121e288 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6380c>
 121e288:	83 7f 58 01          	cmp    DWORD PTR [rdi+0x58],0x1
 121e28c:	75 0b                	jne    121e299 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6381d>
 121e28e:	48 89 f7             	mov    rdi,rsi
 121e291:	48 89 d6             	mov    rsi,rdx
 121e294:	e9 df 22 cb ff       	jmp    ed0578 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9798e>
 121e299:	48 89 d6             	mov    rsi,rdx
 121e29c:	e9 01 00 00 00       	jmp    121e2a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63826>
 121e2a1:	cc                   	int3
 121e2a2:	41 56                	push   r14
 121e2a4:	53                   	push   rbx
 121e2a5:	50                   	push   rax
 121e2a6:	48 89 f3             	mov    rbx,rsi
 121e2a9:	49 89 fe             	mov    r14,rdi
 121e2ac:	e8 c5 a8 fd ff       	call   11f8b76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0fa>
 121e2b1:	4c 89 f7             	mov    rdi,r14
 121e2b4:	48 89 de             	mov    rsi,rbx
 121e2b7:	e8 28 23 cb ff       	call   ed05e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x979fa>
 121e2bc:	41 c7 46 58 01 00 00 	mov    DWORD PTR [r14+0x58],0x1
 121e2c3:	00 
 121e2c4:	4c 89 f0             	mov    rax,r14
 121e2c7:	48 83 c4 08          	add    rsp,0x8
 121e2cb:	5b                   	pop    rbx
 121e2cc:	41 5e                	pop    r14
 121e2ce:	c3                   	ret
 121e2cf:	cc                   	int3
 121e2d0:	41 56                	push   r14
 121e2d2:	53                   	push   rbx
 121e2d3:	50                   	push   rax
 121e2d4:	48 89 d3             	mov    rbx,rdx
 121e2d7:	83 7f 58 00          	cmp    DWORD PTR [rdi+0x58],0x0
 121e2db:	74 14                	je     121e2f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63875>
 121e2dd:	49 89 fe             	mov    r14,rdi
 121e2e0:	e8 91 a8 fd ff       	call   11f8b76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0fa>
 121e2e5:	8b 03                	mov    eax,DWORD PTR [rbx]
 121e2e7:	41 89 06             	mov    DWORD PTR [r14],eax
 121e2ea:	41 83 66 58 00       	and    DWORD PTR [r14+0x58],0x0
 121e2ef:	eb 04                	jmp    121e2f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63879>
 121e2f1:	8b 03                	mov    eax,DWORD PTR [rbx]
 121e2f3:	89 06                	mov    DWORD PTR [rsi],eax
 121e2f5:	48 83 c4 08          	add    rsp,0x8
 121e2f9:	5b                   	pop    rbx
 121e2fa:	41 5e                	pop    r14
 121e2fc:	c3                   	ret
 121e2fd:	cc                   	int3
 121e2fe:	41 57                	push   r15
 121e300:	41 56                	push   r14
 121e302:	41 54                	push   r12
 121e304:	53                   	push   rbx
 121e305:	48 83 ec 38          	sub    rsp,0x38
 121e309:	48 89 fb             	mov    rbx,rdi
 121e30c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 121e313:	00 00 
 121e315:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 121e31a:	49 89 e4             	mov    r12,rsp
 121e31d:	4c 89 e7             	mov    rdi,r12
 121e320:	e8 65 6c ff ff       	call   1214f8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a50e>
 121e325:	49 8b 4c 24 10       	mov    rcx,QWORD PTR [r12+0x10]
 121e32a:	49 89 df             	mov    r15,rbx
 121e32d:	4d 89 fe             	mov    r14,r15
 121e330:	4d 89 e7             	mov    r15,r12
 121e333:	48 85 c9             	test   rcx,rcx
 121e336:	74 55                	je     121e38d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63911>
 121e338:	48 89 c8             	mov    rax,rcx
 121e33b:	49 83 7e 10 00       	cmp    QWORD PTR [r14+0x10],0x0
 121e340:	b9 00 00 00 00       	mov    ecx,0x0
 121e345:	4d 89 f4             	mov    r12,r14
 121e348:	74 e3                	je     121e32d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x638b1>
 121e34a:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 121e34f:	48 83 26 00          	and    QWORD PTR [rsi],0x0
 121e353:	6a 01                	push   0x1
 121e355:	5f                   	pop    rdi
 121e356:	4c 89 fa             	mov    rdx,r15
 121e359:	ff d0                	call   rax
 121e35b:	6a 01                	push   0x1
 121e35d:	5f                   	pop    rdi
 121e35e:	4c 89 fe             	mov    rsi,r15
 121e361:	4c 89 f2             	mov    rdx,r14
 121e364:	41 ff 56 10          	call   QWORD PTR [r14+0x10]
 121e368:	6a 01                	push   0x1
 121e36a:	5f                   	pop    rdi
 121e36b:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
 121e370:	4c 89 f6             	mov    rsi,r14
 121e373:	41 ff 57 10          	call   QWORD PTR [r15+0x10]
 121e377:	41 0f 10 46 10       	movups xmm0,XMMWORD PTR [r14+0x10]
 121e37c:	41 0f 10 4f 10       	movups xmm1,XMMWORD PTR [r15+0x10]
 121e381:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
 121e386:	41 0f 11 4e 10       	movups XMMWORD PTR [r14+0x10],xmm1
 121e38b:	eb 23                	jmp    121e3b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63934>
 121e38d:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 121e391:	48 85 c0             	test   rax,rax
 121e394:	74 1a                	je     121e3b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63934>
 121e396:	6a 01                	push   0x1
 121e398:	5f                   	pop    rdi
 121e399:	4c 89 fe             	mov    rsi,r15
 121e39c:	4c 89 f2             	mov    rdx,r14
 121e39f:	ff                   	.byte 0xff

## Destructor/helper ae2666

/tmp/s184obj/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000ae25e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f580>:
  ae25e0:	a4                   	movs   BYTE PTR es:[rdi],BYTE PTR ds:[rsi]
  ae25e1:	00 00                	add    BYTE PTR [rax],al
  ae25e3:	00 64 48 8b          	add    BYTE PTR [rax+rcx*2-0x75],ah
  ae25e7:	04 25                	add    al,0x25
  ae25e9:	28 00                	sub    BYTE PTR [rax],al
  ae25eb:	00 00                	add    BYTE PTR [rax],al
  ae25ed:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  ae25f2:	75 05                	jne    ae25f9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f599>
  ae25f4:	48 83 c4 18          	add    rsp,0x18
  ae25f8:	c3                   	ret
  ae25f9:	e8 b2 d4 d0 00       	call   17efab0 <__stack_chk_fail@plt>
  ae25fe:	41 56                	push   r14
  ae2600:	53                   	push   rbx
  ae2601:	50                   	push   rax
  ae2602:	48 89 fb             	mov    rbx,rdi
  ae2605:	48 81 c3 f0 00 00 00 	add    rbx,0xf0
  ae260c:	49 c7 c6 98 fe ff ff 	mov    r14,0xfffffffffffffe98
  ae2613:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
  ae2617:	e8 3a ff ff ff       	call   ae2556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f4f6>
  ae261c:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
  ae2620:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
  ae2625:	48 85 ff             	test   rdi,rdi
  ae2628:	74 05                	je     ae262f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f5cf>
  ae262a:	e8 f1 b8 d0 00       	call   17edf20 <_ZdlPv@plt>
  ae262f:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
  ae2633:	e8 1e ff ff ff       	call   ae2556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f4f6>
  ae2638:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  ae263c:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
  ae2641:	48 85 ff             	test   rdi,rdi
  ae2644:	74 05                	je     ae264b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f5eb>
  ae2646:	e8 d5 b8 d0 00       	call   17edf20 <_ZdlPv@plt>
  ae264b:	48 89 df             	mov    rdi,rbx
  ae264e:	e8 6f ff ff ff       	call   ae25c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f562>
  ae2653:	48 83 c3 88          	add    rbx,0xffffffffffffff88
  ae2657:	49 83 c6 78          	add    r14,0x78
  ae265b:	75 b6                	jne    ae2613 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f5b3>
  ae265d:	48 83 c4 08          	add    rsp,0x8
  ae2661:	5b                   	pop    rbx
  ae2662:	41 5e                	pop    r14
  ae2664:	c3                   	ret
  ae2665:	cc                   	int3
  ae2666:	53                   	push   rbx
  ae2667:	48 89 fb             	mov    rbx,rdi
  ae266a:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  ae266e:	e8 7b fe ff ff       	call   ae24ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f48e>
  ae2673:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  ae2676:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  ae267a:	48 85 ff             	test   rdi,rdi
  ae267d:	74 06                	je     ae2685 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f625>
  ae267f:	5b                   	pop    rbx
  ae2680:	e9 9b b8 d0 00       	jmp    17edf20 <_ZdlPv@plt>
  ae2685:	5b                   	pop    rbx
  ae2686:	c3                   	ret
  ae2687:	cc                   	int3
  ae2688:	53                   	push   rbx
  ae2689:	48 89 fb             	mov    rbx,rdi
  ae268c:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  ae268f:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
  ae2693:	74 11                	je     ae26a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f646>
  ae2695:	e8 0e 00 00 00       	call   ae26a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f648>
  ae269a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  ae269d:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  ae26a0:	5b                   	pop    rbx
  ae26a1:	e9 7a b8 d0 00       	jmp    17edf20 <_ZdlPv@plt>
  ae26a6:	5b                   	pop    rbx
  ae26a7:	c3                   	ret
  ae26a8:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
  ae26ab:	e9 00 00 00 00       	jmp    ae26b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f650>
  ae26b0:	41 57                	push   r15
  ae26b2:	41 56                	push   r14
  ae26b4:	53                   	push   rbx
  ae26b5:	48 89 f3             	mov    rbx,rsi
  ae26b8:	49 89 fe             	mov    r14,rdi
  ae26bb:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  ae26bf:	48 39 f7             	cmp    rdi,rsi
  ae26c2:	74 15                	je     ae26d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f679>
  ae26c4:	4c 8d 7f e0          	lea    r15,[rdi-0x20]
  ae26c8:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
  ae26cc:	e8 bf b7 d0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ae26d1:	4c 89 ff             	mov    rdi,r15
  ae26d4:	49 39 df             	cmp    r15,rbx
  ae26d7:	75 eb                	jne    ae26c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f664>
  ae26d9:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
  ae26dd:	5b                   	pop    rbx
  ae26de:	41 5e                	pop    r14
  ae26e0:	41 5f                	pop    r15
  ae26e2:	c3                   	ret
  ae26e3:	cc                   	int3
  ae26e4:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
  ae26e8:	74 1d                	je     ae2707 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f6a7>
  ae26ea:	53                   	push   rbx
  ae26eb:	48 89 fb             	mov    rbx,rdi
  ae26ee:	e8 b5 ff ff ff       	call   ae26a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f648>
  ae26f3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  ae26f6:	e8 25 b8 d0 00       	call   17edf20 <_ZdlPv@plt>
  ae26fb:	0f 57 c0             	xorps  xmm0,xmm0
  ae26fe:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  ae2701:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  ae2706:	5b                   	pop    rbx
  ae2707:	c3                   	ret
  ae2708:	41 57                	push   r15
  ae270a:	41 56                	push   r14
  ae270c:	53                   	push   rbx
  ae270d:	48 83 ec 50          	sub    rsp,0x50
  ae2711:	49 89 f6             	mov    r14,rsi
  ae2714:	48 89 fb             	mov    rbx,rdi
  ae2717:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ae271e:	00 00 
  ae2720:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  ae2725:	49 81 c6 d0 00 00 00 	add    r14,0xd0
  ae272c:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
  ae2731:	4c 89 ff             	mov    rdi,r15
  ae2734:	48 89 d6             	mov    rsi,rdx
  ae2737:	e8 fe 7f cf 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  ae273c:	48 89 df             	mov    rdi,rbx
  ae273f:	4c 89 f6             	mov    rsi,r14
  ae2742:	4c 89 fa             	mov    rdx,r15
  ae2745:	e8 80 78 cf 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
  ae274a:	4c 89 ff             	mov    rdi,r15
  ae274d:	e8 96 80 cf 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  ae2752:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ae2759:	00 00 
  ae275b:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
  ae2760:	75 0d                	jne    ae276f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f70f>
  ae2762:	48 89 d8             	mov    rax,rbx
  ae2765:	48 83 c4 50          	add    rsp,0x50
  ae2769:	5b                   	pop    rbx
  ae276a:	41 5e                	pop    r14
  ae276c:	41 5f                	pop    r15
  ae276e:	c3                   	ret
  ae276f:	e8 3c d3 d0 00       	call   17efab0 <__stack_chk_fail@plt>
  ae2774:	53                   	push   rbx
  ae2775:	48 89 fb             	mov    rbx,rdi
  ae2778:	48 81 c7 c8 02 00 00 	add    rdi,0x2c8
  ae277f:	e8                   	.byte 0xe8

## Root service install and immediate virtual use

/tmp/s184obj/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013337e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178d64>:
 13337e0:	00 00                	add    BYTE PTR [rax],al
 13337e2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 13337e7:	48 8d 83 18 05 00 00 	lea    rax,[rbx+0x518]
 13337ee:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
 13337f5:	00 
 13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
 13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 1333806:	48 89 ef             	mov    rdi,rbp
 1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
 1333810:	00 
 1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
 1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
 133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
 1333822:	00 00 
 1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
 1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
 133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
 1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
 133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
 1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
 133386b:	34 01                	xor    al,0x1
 133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
 1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
 133387a:	00 
 133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
 1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
 1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133389f:	00 
 13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
 13338ac:	00 
 13338ad:	41 c6 04 24 00       	mov    BYTE PTR [r12],0x0
 13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 13338b7:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 13338ba:	4c 8d b4 24 10 04 00 	lea    r14,[rsp+0x410]
 13338c1:	00 
 13338c2:	4c 89 f6             	mov    rsi,r14
 13338c5:	4c 89 e2             	mov    rdx,r12
 13338c8:	e8 91 9e 85 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 13338cd:	89 c5                	mov    ebp,eax
 13338cf:	4c 89 f7             	mov    rdi,r14
 13338d2:	e8 b9 a5 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13338d7:	40 88 ab 00 06 00 00 	mov    BYTE PTR [rbx+0x600],bpl
 13338de:	48                   	rex.W
 13338df:	8b                   	.byte 0x8b

## Candidate record population

/tmp/s184obj/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001339270 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e7f4>:
 1339270:	00 00                	add    BYTE PTR [rax],al
 1339272:	48 8d 83 68 05 00 00 	lea    rax,[rbx+0x568]
 1339279:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 133927e:	48 83 a3 68 05 00 00 	and    QWORD PTR [rbx+0x568],0x0
 1339285:	00 
 1339286:	4c 8d bc 24 98 00 00 	lea    r15,[rsp+0x98]
 133928d:	00 
 133928e:	0f 57 c0             	xorps  xmm0,xmm0
 1339291:	49 83 67 18 00       	and    QWORD PTR [r15+0x18],0x0
 1339296:	41 0f 29 47 08       	movaps XMMWORD PTR [r15+0x8],xmm0
 133929b:	41 0f 29 47 f8       	movaps XMMWORD PTR [r15-0x8],xmm0
 13392a0:	41 c7 47 20 00 00 80 	mov    DWORD PTR [r15+0x20],0x3f800000
 13392a7:	3f 
 13392a8:	48 8d bb 70 05 00 00 	lea    rdi,[rbx+0x570]
 13392af:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 13392b6:	00 
 13392b7:	e8 52 4f ee ff       	call   121e20e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63792>
 13392bc:	4c 89 ff             	mov    rdi,r15
 13392bf:	e8 a2 93 7a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 13392c4:	48 8d 05 a5 cc 52 00 	lea    rax,[rip+0x52cca5]        # 1865f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22658>
 13392cb:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
 13392d2:	00 
 13392d3:	48 89 01             	mov    QWORD PTR [rcx],rax
 13392d6:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
 13392da:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
 13392de:	48 8b b3 48 04 00 00 	mov    rsi,QWORD PTR [rbx+0x448]
 13392e5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13392e8:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
 13392ef:	00 
 13392f0:	4c 89 ff             	mov    rdi,r15
 13392f3:	ff 50 18             	call   QWORD PTR [rax+0x18]
 13392f6:	41 8b 07             	mov    eax,DWORD PTR [r15]
 13392f9:	ff c8                	dec    eax
 13392fb:	8b 8b d0 01 00 00    	mov    ecx,DWORD PTR [rbx+0x1d0]
 1339301:	89 ca                	mov    edx,ecx
 1339303:	80 e2 ef             	and    dl,0xef
 1339306:	83 f8 fe             	cmp    eax,0xfffffffe
 1339309:	0f b6 ea             	movzx  ebp,dl
 133930c:	0f 43 e9             	cmovae ebp,ecx
 133930f:	41 f6 47 0c 01       	test   BYTE PTR [r15+0xc],0x1
 1339314:	0f 44 e9             	cmove  ebp,ecx
 1339317:	4c 8d bc 24 a8 00 00 	lea    r15,[rsp+0xa8]
 133931e:	00 
 133931f:	4c 89 ff             	mov    rdi,r15
 1339322:	e8 01 24 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1339327:	8a 83 61 03 00 00    	mov    al,BYTE PTR [rbx+0x361]
 133932d:	88 44 24 04          	mov    BYTE PTR [rsp+0x4],al
 1339331:	8a 83 60 03 00 00    	mov    al,BYTE PTR [rbx+0x360]
 1339337:	88 44 24 20          	mov    BYTE PTR [rsp+0x20],al
 133933b:	8a 83 63 03 00 00    	mov    al,BYTE PTR [rbx+0x363]
 1339341:	88 44 24 03          	mov    BYTE PTR [rsp+0x3],al
 1339345:	8a 83 41 02 00 00    	mov    al,BYTE PTR [rbx+0x241]
 133934b:	88 44 24 02          	mov    BYTE PTR [rsp+0x2],al
 133934f:	4c 8b 83 70 01 00 00 	mov    r8,QWORD PTR [rbx+0x170]
 1339356:	4c 8b 8b 78 01 00 00 	mov    r9,QWORD PTR [rbx+0x178]
 133935d:	4d 29 c1             	sub    r9,r8
 1339360:	49 c1 f9 02          	sar    r9,0x2
 1339364:	8b 83 70 02 00 00    	mov    eax,DWORD PTR [rbx+0x270]
 133936a:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
 133936e:	8b 83 50 02 00 00    	mov    eax,DWORD PTR [rbx+0x250]
 1339374:	89 44 24 08          	mov    DWORD PTR [rsp+0x8],eax
 1339378:	48 8b 83 a0 05 00 00 	mov    rax,QWORD PTR [rbx+0x5a0]
 133937f:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 1339384:	48 8b 83 b0 05 00 00 	mov    rax,QWORD PTR [rbx+0x5b0]
 133938b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 1339390:	4c 8d 93 18 05 00 00 	lea    r10,[rbx+0x518]
 1339397:	31 ff                	xor    edi,edi
 1339399:	80 bb 38 05 00 00 00 	cmp    BYTE PTR [rbx+0x538],0x0
 13393a0:	4c 0f 44 d7          	cmove  r10,rdi
 13393a4:	80 bb 60 05 00 00 00 	cmp    BYTE PTR [rbx+0x560],0x0
 13393ab:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
 13393b2:	48 0f 44 c7          	cmove  rax,rdi
 13393b6:	40 8a b3 00 06 00 00 	mov    sil,BYTE PTR [rbx+0x600]
 13393bd:	0f 10 83 08 06 00 00 	movups xmm0,XMMWORD PTR [rbx+0x608]
 13393c4:	44 8a 9b 65 03 00 00 	mov    r11b,BYTE PTR [rbx+0x365]
 13393cb:	48 8b 93 40 04 00 00 	mov    rdx,QWORD PTR [rbx+0x440]
 13393d2:	4c 8b a3 48 04 00 00 	mov    r12,QWORD PTR [rbx+0x448]
 13393d9:	4c 8b ab d0 02 00 00 	mov    r13,QWORD PTR [rbx+0x2d0]
 13393e0:	48 8b 8b 28 01 00 00 	mov    rcx,QWORD PTR [rbx+0x128]
 13393e7:	48 8b bb 30 01 00 00 	mov    rdi,QWORD PTR [rbx+0x130]
 13393ee:	44 8a 74 24 04       	mov    r14b,BYTE PTR [rsp+0x4]
 13393f3:	45 88 77 e8          	mov    BYTE PTR [r15-0x18],r14b
 13393f7:	44 8a 74 24 20       	mov    r14b,BYTE PTR [rsp+0x20]
 13393fc:	45 88 77 e9          	mov    BYTE PTR [r15-0x17],r14b
 1339400:	44 8a 74 24 03       	mov    r14b,BYTE PTR [rsp+0x3]
 1339405:	45 88 77 ea          	mov    BYTE PTR [r15-0x16],r14b
 1339409:	44 8a 74 24 02       	mov    r14b,BYTE PTR [rsp+0x2]
 133940e:	45 88 77 eb          	mov    BYTE PTR [r15-0x15],r14b
 1339412:	4d 89 47 f0          	mov    QWORD PTR [r15-0x10],r8
 1339416:	4d 89 4f f8          	mov    QWORD PTR [r15-0x8],r9
 133941a:	44 8b 44 24 0c       	mov    r8d,DWORD PTR [rsp+0xc]
 133941f:	45 89 07             	mov    DWORD PTR [r15],r8d
 1339422:	44 8b 44 24 08       	mov    r8d,DWORD PTR [rsp+0x8]
 1339427:	45 89 47 04          	mov    DWORD PTR [r15+0x4],r8d
 133942b:	89 6c 24 04          	mov    DWORD PTR [rsp+0x4],ebp
 133942f:	41 88 6f 08          	mov    BYTE PTR [r15+0x8],bpl
 1339433:	4c 8b 44 24 50       	mov    r8,QWORD PTR [rsp+0x50]
 1339438:	4d 89 47 10          	mov    QWORD PTR [r15+0x10],r8
 133943c:	4c 8b 44 24 48       	mov    r8,QWORD PTR [rsp+0x48]
 1339441:	4d 89 47 18          	mov    QWORD PTR [r15+0x18],r8
 1339445:	49 89 57 20          	mov    QWORD PTR [r15+0x20],rdx
 1339449:	41 88 77 28          	mov    BYTE PTR [r15+0x28],sil
 133944d:	49 89 4f 30          	mov    QWORD PTR [r15+0x30],rcx
 1339451:	4d 89 67 38          	mov    QWORD PTR [r15+0x38],r12
 1339455:	4d 89 6f 40          	mov    QWORD PTR [r15+0x40],r13
 1339459:	49 89 7f 48          	mov    QWORD PTR [r15+0x48],rdi
 133945d:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
 1339462:	45 88 5f 60          	mov    BYTE PTR [r15+0x60],r11b
 1339466:	48 8d 8b d8 04 00 00 	lea    rcx,[rbx+0x4d8]
 133946d:	49 89 4f 68          	mov    QWORD PTR [r15+0x68],rcx
 1339471:	48 8d 8b f8 04 00 00 	lea    rcx,[rbx+0x4f8]
 1339478:	49 89 4f 70          	mov    QWORD PTR [r15+0x70],rcx
 133947c:	4d 89 57 78          	mov    QWORD PTR [r15+0x78],r10
 1339480:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
 1339487:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
 133948e:	00 
 133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
 1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
 133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
 13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
 13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
 13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
 13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
 13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
 13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]
 13394da:	0f 11 84 24 0c 02 00 	movups XMMWORD PTR [rsp+0x20c],xmm0
 13394e1:	00 
 13394e2:	f2 41 0f 10 07       	movsd  xmm0,QWORD PTR [r15]
 13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 13394ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13394ef:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
 13394f5:	48 85 c0             	test   rax,rax
 13394f8:	74 06                	je     1339500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea84>
 13394fa:	44 8a 68 5b          	mov    r13b,BYTE PTR [rax+0x5b]
 13394fe:	eb 03                	jmp    1339503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea87>

## Candidate destruction

/tmp/s184obj/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000133a030 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f5b4>:
 133a030:	a0 fb 49 00 49 8d be 	movabs al,ds:0x5f0be8d490049fb
 133a037:	f0 05 
 133a039:	00 00                	add    BYTE PTR [rax],al
 133a03b:	e8 06 77 48 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 133a040:	49 8d be d0 05 00 00 	lea    rdi,[r14+0x5d0]
 133a047:	e8 88 fb 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 133a04c:	49 8b be c8 05 00 00 	mov    rdi,QWORD PTR [r14+0x5c8]
 133a053:	e8 2e 44 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 133a058:	49 8d be b8 05 00 00 	lea    rdi,[r14+0x5b8]
 133a05f:	e8 a6 02 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 133a064:	49 8b be a8 05 00 00 	mov    rdi,QWORD PTR [r14+0x5a8]
 133a06b:	e8 16 44 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 133a070:	49 8d be 78 05 00 00 	lea    rdi,[r14+0x578]
 133a077:	e8 ea 85 7a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 133a07c:	49 8d be 40 05 00 00 	lea    rdi,[r14+0x540]
 133a083:	e8 2a ea ff ff       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
 133a088:	49 8d be 18 05 00 00 	lea    rdi,[r14+0x518]
 133a08f:	e8 1e ea ff ff       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
 133a094:	49 8d be f8 04 00 00 	lea    rdi,[r14+0x4f8]
 133a09b:	e8 e4 20 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>

## Direct callsites of 0x121e20e

## Direct callsites of ae2666 near player construction regions
