# Orbit ad runtime object / vtable trace

Goal: connect ContextPlayer+0x438 / object+0x1b8 to the skippable/delay virtual interface.

## Relevant ELF sections

      [11] .rodata           PROGBITS        0000000000323440 323440 17c740 00 AMS  0   0 64
      [16] .text             PROGBITS        00000000009d6e40 9d6e40 e16b50 00  AX  0   0 16
      [19] .data.rel.ro      PROGBITS        00000000017f4000 17f4000 0baba0 00  WA  0   0 16
      [26] .data             PROGBITS        00000000018b7af0 18b3af0 122758 00  WA  0   0 16
      [28] .bss              NOBITS          00000000019da280 19d6260 02a350 00 WAo  0   0 64

## guard ctor/helper: 0xb2828e
Function range: 0xb2828e..0xb2829e

Disassembly:
      b2828e:	50                   	push   rax
      b2828f:	e8 6e 1b cb 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      b28294:	58                   	pop    rax
      b28295:	c3                   	ret
      b28296:	48 89 c7             	mov    rdi,rax
      b28299:	e8 07 18 f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

RIP-relative/comment targets:

## ContextPlayer init tail: 0x10a1440
Function range: 0x10a1440..0x10a1585

Disassembly:
     10a1440:	55                   	push   rbp
     10a1441:	41 57                	push   r15
     10a1443:	41 56                	push   r14
     10a1445:	41 55                	push   r13
     10a1447:	41 54                	push   r12
     10a1449:	53                   	push   rbx
     10a144a:	50                   	push   rax
     10a144b:	48 89 fb             	mov    rbx,rdi
     10a144e:	48 8b af 70 03 00 00 	mov    rbp,QWORD PTR [rdi+0x370]
     10a1455:	48 85 ed             	test   rbp,rbp
     10a1458:	0f 84 05 01 00 00    	je     10a1563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268979>
     10a145e:	48 8b 83 78 03 00 00 	mov    rax,QWORD PTR [rbx+0x378]
     10a1465:	48 8d 48 58          	lea    rcx,[rax+0x58]
     10a1469:	48 8b 50 50          	mov    rdx,QWORD PTR [rax+0x50]
     10a146d:	48 89 95 f0 00 00 00 	mov    QWORD PTR [rbp+0xf0],rdx
     10a1474:	4c 8d b5 f8 00 00 00 	lea    r14,[rbp+0xf8]
     10a147b:	49 39 ce             	cmp    r14,rcx
     10a147e:	0f 84 df 00 00 00    	je     10a1563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268979>
     10a1484:	4c 8b 60 58          	mov    r12,QWORD PTR [rax+0x58]
     10a1488:	4c 8b 78 60          	mov    r15,QWORD PTR [rax+0x60]
     10a148c:	4d 89 fd             	mov    r13,r15
     10a148f:	4d 29 e5             	sub    r13,r12
     10a1492:	49 c1 fd 05          	sar    r13,0x5
     10a1496:	48 8b 95 f8 00 00 00 	mov    rdx,QWORD PTR [rbp+0xf8]
     10a149d:	48 8b b5 08 01 00 00 	mov    rsi,QWORD PTR [rbp+0x108]
     10a14a4:	48 89 f0             	mov    rax,rsi
     10a14a7:	48 29 d0             	sub    rax,rdx
     10a14aa:	48 c1 f8 05          	sar    rax,0x5
     10a14ae:	4c 39 e8             	cmp    rax,r13
     10a14b1:	73 66                	jae    10a1519 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26892f>
     10a14b3:	48 85 d2             	test   rdx,rdx
     10a14b6:	74 1e                	je     10a14d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2688ec>
     10a14b8:	4c 89 f7             	mov    rdi,r14
     10a14bb:	e8 22 11 d5 ff       	call   df25e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf668>
     10a14c0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     10a14c3:	e8 58 ca 74 00       	call   17edf20 <_ZdlPv@plt>
     10a14c8:	0f 57 c0             	xorps  xmm0,xmm0
     10a14cb:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     10a14cf:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     10a14d4:	31 f6                	xor    esi,esi
     10a14d6:	31 ff                	xor    edi,edi
     10a14d8:	4c 89 ea             	mov    rdx,r13
     10a14db:	e8 f2 4c a4 ff       	call   ae61d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x33172>
     10a14e0:	48 89 c1             	mov    rcx,rax
     10a14e3:	48 c1 e9 3b          	shr    rcx,0x3b
     10a14e7:	0f 85 93 00 00 00    	jne    10a1580 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268996>
     10a14ed:	48 89 c7             	mov    rdi,rax
     10a14f0:	e8 ee 4d a4 ff       	call   ae62e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x33283>
     10a14f5:	48 89 85 f8 00 00 00 	mov    QWORD PTR [rbp+0xf8],rax
     10a14fc:	48 89 85 00 01 00 00 	mov    QWORD PTR [rbp+0x100],rax
     10a1503:	48 c1 e2 05          	shl    rdx,0x5
     10a1507:	48 01 c2             	add    rdx,rax
     10a150a:	48 89 95 08 01 00 00 	mov    QWORD PTR [rbp+0x108],rdx
     10a1511:	4c 89 f7             	mov    rdi,r14
     10a1514:	4c 89 e6             	mov    rsi,r12
     10a1517:	eb 2a                	jmp    10a1543 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268959>
     10a1519:	48 8b ad 00 01 00 00 	mov    rbp,QWORD PTR [rbp+0x100]
     10a1520:	48 29 d5             	sub    rbp,rdx
     10a1523:	48 89 e8             	mov    rax,rbp
     10a1526:	48 c1 f8 05          	sar    rax,0x5
     10a152a:	4c 39 e8             	cmp    rax,r13
     10a152d:	73 1e                	jae    10a154d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268963>
     10a152f:	4c 01 e5             	add    rbp,r12
     10a1532:	4c 89 e7             	mov    rdi,r12
     10a1535:	48 89 ee             	mov    rsi,rbp
     10a1538:	e8 6d 2d 00 00       	call   10a42aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b6c0>
     10a153d:	4c 89 f7             	mov    rdi,r14
     10a1540:	48 89 ee             	mov    rsi,rbp
     10a1543:	4c 89 fa             	mov    rdx,r15
     10a1546:	e8 9b 2d 00 00       	call   10a42e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b6fc>
     10a154b:	eb 16                	jmp    10a1563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268979>
     10a154d:	4c 89 e7             	mov    rdi,r12
     10a1550:	4c 89 fe             	mov    rsi,r15
     10a1553:	e8 52 2d 00 00       	call   10a42aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b6c0>
     10a1558:	4c 89 f7             	mov    rdi,r14
     10a155b:	48 89 c6             	mov    rsi,rax
     10a155e:	e8 87 10 d5 ff       	call   df25ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf670>
     10a1563:	48 81 c3 18 04 00 00 	add    rbx,0x418
     10a156a:	48 89 df             	mov    rdi,rbx
     10a156d:	48 83 c4 08          	add    rsp,0x8
     10a1571:	5b                   	pop    rbx
     10a1572:	41 5c                	pop    r12
     10a1574:	41 5d                	pop    r13
     10a1576:	41 5e                	pop    r14
     10a1578:	41 5f                	pop    r15
     10a157a:	5d                   	pop    rbp
     10a157b:	e9 28 75 a8 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10a1580:	e8 3b 30 96 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>

RIP-relative/comment targets:

## restriction builder: 0x10a6464
Function range: 0x10a6464..0x10a7f52

Disassembly:
     10a6464:	55                   	push   rbp
     10a6465:	41 57                	push   r15
     10a6467:	41 56                	push   r14
     10a6469:	41 55                	push   r13
     10a646b:	41 54                	push   r12
     10a646d:	53                   	push   rbx
     10a646e:	48 81 ec 38 08 00 00 	sub    rsp,0x838
     10a6475:	89 f5                	mov    ebp,esi
     10a6477:	49 89 fe             	mov    r14,rdi
     10a647a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a6481:	00 00 
     10a6483:	48 89 84 24 30 08 00 	mov    QWORD PTR [rsp+0x830],rax
     10a648a:	00 
     10a648b:	48 8d 9f 58 14 00 00 	lea    rbx,[rdi+0x1458]
     10a6492:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     10a6497:	48 89 de             	mov    rsi,rbx
     10a649a:	e8 95 e5 c4 ff       	call   cf4a34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2419d4>
     10a649f:	48 8d 84 24 48 04 00 	lea    rax,[rsp+0x448]
     10a64a6:	00 
     10a64a7:	0f 57 c0             	xorps  xmm0,xmm0
     10a64aa:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64ad:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64b1:	48 8d 84 24 60 04 00 	lea    rax,[rsp+0x460]
     10a64b8:	00 
     10a64b9:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64bc:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64c0:	48 8d 84 24 78 04 00 	lea    rax,[rsp+0x478]
     10a64c7:	00 
     10a64c8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64cb:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64cf:	48 8d 84 24 90 04 00 	lea    rax,[rsp+0x490]
     10a64d6:	00 
     10a64d7:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64da:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64de:	48 8d 84 24 a8 04 00 	lea    rax,[rsp+0x4a8]
     10a64e5:	00 
     10a64e6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64e9:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64ed:	48 8d 84 24 c0 04 00 	lea    rax,[rsp+0x4c0]
     10a64f4:	00 
     10a64f5:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64f8:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64fc:	48 8d 84 24 d8 04 00 	lea    rax,[rsp+0x4d8]
     10a6503:	00 
     10a6504:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6507:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a650b:	48 8d 84 24 f0 04 00 	lea    rax,[rsp+0x4f0]
     10a6512:	00 
     10a6513:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6516:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a651a:	48 8d 84 24 08 05 00 	lea    rax,[rsp+0x508]
     10a6521:	00 
     10a6522:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6525:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6529:	48 8d 84 24 20 05 00 	lea    rax,[rsp+0x520]
     10a6530:	00 
     10a6531:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6534:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6538:	48 8d 84 24 38 05 00 	lea    rax,[rsp+0x538]
     10a653f:	00 
     10a6540:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6543:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6547:	48 8d 84 24 50 05 00 	lea    rax,[rsp+0x550]
     10a654e:	00 
     10a654f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6552:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6556:	48 8d 84 24 68 05 00 	lea    rax,[rsp+0x568]
     10a655d:	00 
     10a655e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6561:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6565:	48 8d 84 24 80 05 00 	lea    rax,[rsp+0x580]
     10a656c:	00 
     10a656d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6570:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6574:	48 8d 84 24 98 05 00 	lea    rax,[rsp+0x598]
     10a657b:	00 
     10a657c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a657f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6583:	48 8d 84 24 b0 05 00 	lea    rax,[rsp+0x5b0]
     10a658a:	00 
     10a658b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a658e:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6592:	48 8d 84 24 c8 05 00 	lea    rax,[rsp+0x5c8]
     10a6599:	00 
     10a659a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a659d:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65a1:	48 8d 84 24 e0 05 00 	lea    rax,[rsp+0x5e0]
     10a65a8:	00 
     10a65a9:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65ac:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65b0:	48 8d 84 24 f8 05 00 	lea    rax,[rsp+0x5f8]
     10a65b7:	00 
     10a65b8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65bb:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65bf:	48 8d 84 24 10 06 00 	lea    rax,[rsp+0x610]
     10a65c6:	00 
     10a65c7:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65ca:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65ce:	48 8d 84 24 28 06 00 	lea    rax,[rsp+0x628]
     10a65d5:	00 
     10a65d6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65d9:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65dd:	48 8d 84 24 40 06 00 	lea    rax,[rsp+0x640]
     10a65e4:	00 
     10a65e5:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65e8:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65ec:	48 8d 84 24 58 06 00 	lea    rax,[rsp+0x658]
     10a65f3:	00 
     10a65f4:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65f7:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65fb:	48 8d 84 24 70 06 00 	lea    rax,[rsp+0x670]
     10a6602:	00 
     10a6603:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6606:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a660a:	48 8d 84 24 88 06 00 	lea    rax,[rsp+0x688]
     10a6611:	00 
     10a6612:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6615:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6619:	48 8d 84 24 a0 06 00 	lea    rax,[rsp+0x6a0]
     10a6620:	00 
     10a6621:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6624:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6628:	48 8d 84 24 b8 06 00 	lea    rax,[rsp+0x6b8]
     10a662f:	00 
     10a6630:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6633:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6637:	48 8d 84 24 d0 06 00 	lea    rax,[rsp+0x6d0]
     10a663e:	00 
     10a663f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6642:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6646:	48 8d 84 24 e8 06 00 	lea    rax,[rsp+0x6e8]
     10a664d:	00 
     10a664e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6651:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6655:	48 8d 84 24 00 07 00 	lea    rax,[rsp+0x700]
     10a665c:	00 
     10a665d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6660:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6664:	48 8d 84 24 18 07 00 	lea    rax,[rsp+0x718]
     10a666b:	00 
     10a666c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a666f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6673:	48 8d 84 24 30 07 00 	lea    rax,[rsp+0x730]
     10a667a:	00 
     10a667b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a667e:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6682:	48 8d 84 24 48 07 00 	lea    rax,[rsp+0x748]
     10a6689:	00 
     10a668a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a668d:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6691:	48 8d 84 24 60 07 00 	lea    rax,[rsp+0x760]
     10a6698:	00 
     10a6699:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a669c:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a66a0:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     10a66a4:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     10a66a8:	b9 00 00 80 3f       	mov    ecx,0x3f800000
     10a66ad:	89 48 30             	mov    DWORD PTR [rax+0x30],ecx
     10a66b0:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
     10a66b4:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
     10a66b8:	89 48 58             	mov    DWORD PTR [rax+0x58],ecx
     10a66bb:	48 8d 84 24 c8 07 00 	lea    rax,[rsp+0x7c8]
     10a66c2:	00 
     10a66c3:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a66c6:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a66ca:	48 8d 84 24 e0 07 00 	lea    rax,[rsp+0x7e0]
     10a66d1:	00 
     10a66d2:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a66d5:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a66d9:	48 8d 84 24 f8 07 00 	lea    rax,[rsp+0x7f8]
     10a66e0:	00 
     10a66e1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a66e4:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a66e8:	4c 8d bc 24 40 04 00 	lea    r15,[rsp+0x440]
     10a66ef:	00 
     10a66f0:	48 89 df             	mov    rdi,rbx
     10a66f3:	4c 89 fe             	mov    rsi,r15
     10a66f6:	e8 57 18 00 00       	call   10a7f52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f368>
     10a66fb:	4c 89 ff             	mov    rdi,r15
     10a66fe:	e8 01 e9 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
     10a6703:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     10a6707:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a670a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10a670d:	8b 00                	mov    eax,DWORD PTR [rax]
     10a670f:	48 83 f8 05          	cmp    rax,0x5
     10a6713:	77 0c                	ja     10a6721 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db37>
     10a6715:	48 8d 0d 8c 0c 33 ff 	lea    rcx,[rip+0xffffffffff330c8c]        # 3d73a8 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f8d>
     10a671c:	8b 34 81             	mov    esi,DWORD PTR [rcx+rax*4]
     10a671f:	eb 03                	jmp    10a6724 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db3a>
     10a6721:	6a 05                	push   0x5
     10a6723:	5e                   	pop    rsi
     10a6724:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6728:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a672b:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
     10a6731:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6735:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6738:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
     10a673e:	85 c0                	test   eax,eax
     10a6740:	74 35                	je     10a6777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db8d>
     10a6742:	48 8d 35 5d 57 28 ff 	lea    rsi,[rip+0xffffffffff28575d]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6749:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6750:	00 
     10a6751:	e8 28 33 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6756:	49 8d be b0 16 00 00 	lea    rdi,[r14+0x16b0]
     10a675d:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6764:	00 
     10a6765:	e8 26 73 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a676a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6771:	00 
     10a6772:	e8 19 77 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6777:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10a677a:	4c 89 f7             	mov    rdi,r14
     10a677d:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     10a6783:	84 c0                	test   al,al
     10a6785:	75 35                	jne    10a67bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dbd2>
     10a6787:	48 8d 35 9a 52 28 ff 	lea    rsi,[rip+0xffffffffff28529a]        # 32ba28 <_ZTSSt12bad_any_cast@@Base-0x647a0>
     10a678e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6795:	00 
     10a6796:	e8 e3 32 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a679b:	49 8d be 70 17 00 00 	lea    rdi,[r14+0x1770]
     10a67a2:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a67a9:	00 
     10a67aa:	e8 e1 72 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a67af:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a67b6:	00 
     10a67b7:	e8 d4 76 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a67bc:	41 80 be 58 18 00 00 	cmp    BYTE PTR [r14+0x1858],0x0
     10a67c3:	00 
     10a67c4:	0f 85 de 03 00 00    	jne    10a6ba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfbe>
     10a67ca:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a67d1:	00 
     10a67d2:	74 64                	je     10a6838 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc4e>
     10a67d4:	4c 8d bc 24 40 04 00 	lea    r15,[rsp+0x440]
     10a67db:	00 
     10a67dc:	41 83 67 38 00       	and    DWORD PTR [r15+0x38],0x0
     10a67e1:	0f 57 c0             	xorps  xmm0,xmm0
     10a67e4:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     10a67e8:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
     10a67ed:	41 0f 29 47 20       	movaps XMMWORD PTR [r15+0x20],xmm0
     10a67f2:	49 8d be 90 00 00 00 	lea    rdi,[r14+0x90]
     10a67f9:	e8 38 50 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a67fe:	4c 89 ff             	mov    rdi,r15
     10a6801:	48 89 c6             	mov    rsi,rax
     10a6804:	e8 37 ec 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a6809:	84 c0                	test   al,al
     10a680b:	74 19                	je     10a6826 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3c>
     10a680d:	41 b7 01             	mov    r15b,0x1
     10a6810:	8b 84 24 78 04 00 00 	mov    eax,DWORD PTR [rsp+0x478]
     10a6817:	83 f8 04             	cmp    eax,0x4
     10a681a:	74 0d                	je     10a6829 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3f>
     10a681c:	83 f8 09             	cmp    eax,0x9
     10a681f:	74 08                	je     10a6829 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3f>
     10a6821:	83 f8 64             	cmp    eax,0x64
     10a6824:	74 03                	je     10a6829 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3f>
     10a6826:	45 31 ff             	xor    r15d,r15d
     10a6829:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6830:	00 
     10a6831:	e8 f8 ea 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a6836:	eb 03                	jmp    10a683b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc51>
     10a6838:	45 31 ff             	xor    r15d,r15d
     10a683b:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a683f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6842:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
     10a6848:	45 84 ff             	test   r15b,r15b
     10a684b:	0f 94 c1             	sete   cl
     10a684e:	08 c1                	or     cl,al
     10a6850:	75 35                	jne    10a6887 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc9d>
     10a6852:	48 8d 35 4d 56 28 ff 	lea    rsi,[rip+0xffffffffff28564d]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6859:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6860:	00 
     10a6861:	e8 18 32 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6866:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a686d:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6874:	00 
     10a6875:	e8 16 72 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a687a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6881:	00 
     10a6882:	e8 09 76 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6887:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a688b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a688e:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     10a6894:	84 c0                	test   al,al
     10a6896:	75 35                	jne    10a68cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dce3>
     10a6898:	48 8d 35 07 56 28 ff 	lea    rsi,[rip+0xffffffffff285607]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a689f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a68a6:	00 
     10a68a7:	e8 d2 31 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a68ac:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a68b3:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a68ba:	00 
     10a68bb:	e8 d0 71 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a68c0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a68c7:	00 
     10a68c8:	e8 c3 75 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a68cd:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a68d1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a68d4:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     10a68da:	84 c0                	test   al,al
     10a68dc:	75 35                	jne    10a6913 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dd29>
     10a68de:	48 8d 35 c1 55 28 ff 	lea    rsi,[rip+0xffffffffff2855c1]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a68e5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a68ec:	00 
     10a68ed:	e8 8c 31 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a68f2:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
     10a68f9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6900:	00 
     10a6901:	e8 8a 71 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6906:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a690d:	00 
     10a690e:	e8 7d 75 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6913:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6917:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a691a:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     10a6920:	45 84 ff             	test   r15b,r15b
     10a6923:	0f 94 c1             	sete   cl
     10a6926:	08 c1                	or     cl,al
     10a6928:	75 35                	jne    10a695f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dd75>
     10a692a:	48 8d 35 75 55 28 ff 	lea    rsi,[rip+0xffffffffff285575]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6931:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6938:	00 
     10a6939:	e8 40 31 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a693e:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a6945:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a694c:	00 
     10a694d:	e8 3e 71 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6952:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6959:	00 
     10a695a:	e8 31 75 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a695f:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6963:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6966:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     10a696c:	84 c0                	test   al,al
     10a696e:	75 35                	jne    10a69a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ddbb>
     10a6970:	48 8d 35 2f 55 28 ff 	lea    rsi,[rip+0xffffffffff28552f]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6977:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a697e:	00 
     10a697f:	e8 fa 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6984:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a698b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6992:	00 
     10a6993:	e8 f8 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6998:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a699f:	00 
     10a69a0:	e8 eb 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a69a5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a69a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a69ac:	ff 90 00 01 00 00    	call   QWORD PTR [rax+0x100]
     10a69b2:	84 c0                	test   al,al
     10a69b4:	75 35                	jne    10a69eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26de01>
     10a69b6:	48 8d 35 e9 54 28 ff 	lea    rsi,[rip+0xffffffffff2854e9]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a69bd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a69c4:	00 
     10a69c5:	e8 b4 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a69ca:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a69d1:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a69d8:	00 
     10a69d9:	e8 b2 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a69de:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a69e5:	00 
     10a69e6:	e8 a5 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a69eb:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a69ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a69f2:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     10a69f8:	41 80 be 59 18 00 00 	cmp    BYTE PTR [r14+0x1859],0x0
     10a69ff:	00 
     10a6a00:	0f 94 c1             	sete   cl
     10a6a03:	08 c8                	or     al,cl
     10a6a05:	75 35                	jne    10a6a3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26de52>
     10a6a07:	48 8d 35 98 54 28 ff 	lea    rsi,[rip+0xffffffffff285498]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6a0e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a15:	00 
     10a6a16:	e8 63 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6a1b:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
     10a6a22:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6a29:	00 
     10a6a2a:	e8 61 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6a2f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a36:	00 
     10a6a37:	e8 54 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6a3c:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6a40:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6a43:	ff 50 48             	call   QWORD PTR [rax+0x48]
     10a6a46:	84 c0                	test   al,al
     10a6a48:	0f 85 9f 00 00 00    	jne    10a6aed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26df03>
     10a6a4e:	48 8d 35 51 54 28 ff 	lea    rsi,[rip+0xffffffffff285451]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6a55:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a5c:	00 
     10a6a5d:	e8 1c 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6a62:	49 8d be f0 15 00 00 	lea    rdi,[r14+0x15f0]
     10a6a69:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6a70:	00 
     10a6a71:	e8 1a 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6a76:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a7d:	00 
     10a6a7e:	e8 0d 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6a83:	48 8d 35 1c 54 28 ff 	lea    rsi,[rip+0xffffffffff28541c]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6a8a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a91:	00 
     10a6a92:	e8 e7 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6a97:	49 8d be 20 16 00 00 	lea    rdi,[r14+0x1620]
     10a6a9e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6aa5:	00 
     10a6aa6:	e8 e5 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6aab:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ab2:	00 
     10a6ab3:	e8 d8 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6ab8:	48 8d 35 e7 53 28 ff 	lea    rsi,[rip+0xffffffffff2853e7]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6abf:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ac6:	00 
     10a6ac7:	e8 b2 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6acc:	49 8d be 78 15 00 00 	lea    rdi,[r14+0x1578]
     10a6ad3:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6ada:	00 
     10a6adb:	e8 b0 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6ae0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ae7:	00 
     10a6ae8:	e8 a3 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6aed:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6af1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6af4:	ff 50 58             	call   QWORD PTR [rax+0x58]
     10a6af7:	84 c0                	test   al,al
     10a6af9:	75 6a                	jne    10a6b65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26df7b>
     10a6afb:	48 8d 35 a4 53 28 ff 	lea    rsi,[rip+0xffffffffff2853a4]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6b02:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b09:	00 
     10a6b0a:	e8 6f 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6b0f:	49 8d be 50 16 00 00 	lea    rdi,[r14+0x1650]
     10a6b16:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6b1d:	00 
     10a6b1e:	e8 6d 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6b23:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b2a:	00 
     10a6b2b:	e8 60 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6b30:	48 8d 35 6f 53 28 ff 	lea    rsi,[rip+0xffffffffff28536f]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6b37:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b3e:	00 
     10a6b3f:	e8 3a 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6b44:	49 8d be 68 16 00 00 	lea    rdi,[r14+0x1668]
     10a6b4b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6b52:	00 
     10a6b53:	e8 38 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6b58:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b5f:	00 
     10a6b60:	e8 2b 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6b65:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6b69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6b6c:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10a6b6f:	84 c0                	test   al,al
     10a6b71:	75 35                	jne    10a6ba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfbe>
     10a6b73:	48 8d 35 2c 53 28 ff 	lea    rsi,[rip+0xffffffffff28532c]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6b7a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b81:	00 
     10a6b82:	e8 f7 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6b87:	49 8d be 90 15 00 00 	lea    rdi,[r14+0x1590]
     10a6b8e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6b95:	00 
     10a6b96:	e8 f5 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6b9b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ba2:	00 
     10a6ba3:	e8 e8 72 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6ba8:	45 8a be 98 05 00 00 	mov    r15b,BYTE PTR [r14+0x598]
     10a6baf:	45 84 ff             	test   r15b,r15b
     10a6bb2:	74 19                	je     10a6bcd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfe3>
     10a6bb4:	49 8b 86 b8 05 00 00 	mov    rax,QWORD PTR [r14+0x5b8]
     10a6bbb:	49 3b 86 c0 05 00 00 	cmp    rax,QWORD PTR [r14+0x5c0]
     10a6bc2:	75 43                	jne    10a6c07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e01d>
     10a6bc4:	48 8d 35 1f a4 2d ff 	lea    rsi,[rip+0xffffffffff2da41f]        # 380fea <_ZTSSt12bad_any_cast@@Base-0xf1de>
     10a6bcb:	eb 07                	jmp    10a6bd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfea>
     10a6bcd:	48 8d 35 97 36 2a ff 	lea    rsi,[rip+0xffffffffff2a3697]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a6bd4:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6bdb:	00 
     10a6bdc:	e8 9d 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6be1:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a6be8:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6bef:	00 
     10a6bf0:	e8 9b 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6bf5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6bfc:	00 
     10a6bfd:	e8 8e 72 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6c02:	45 84 ff             	test   r15b,r15b
     10a6c05:	74 5d                	je     10a6c64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e07a>
     10a6c07:	41 80 7e 38 00       	cmp    BYTE PTR [r14+0x38],0x0
     10a6c0c:	74 29                	je     10a6c37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e04d>
     10a6c0e:	48 8d 35 df b8 28 ff 	lea    rsi,[rip+0xffffffffff28b8df]        # 3324f4 <_ZTSSt12bad_any_cast@@Base-0x5dcd4>
     10a6c15:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6c1c:	00 
     10a6c1d:	e8 5c 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6c22:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6c29:	00 
     10a6c2a:	48 89 df             	mov    rdi,rbx
     10a6c2d:	e8 5e 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6c32:	e9 bb 00 00 00       	jmp    10a6cf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e108>
     10a6c37:	48 8d 35 0b 6d 2a ff 	lea    rsi,[rip+0xffffffffff2a6d0b]        # 34d949 <_ZTSSt12bad_any_cast@@Base-0x4287f>
     10a6c3e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6c45:	00 
     10a6c46:	e8 33 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6c4b:	49 8d be 70 14 00 00 	lea    rdi,[r14+0x1470]
     10a6c52:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6c59:	00 
     10a6c5a:	e8 31 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6c5f:	e9 8e 00 00 00       	jmp    10a6cf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e108>
     10a6c64:	48 8d 35 00 36 2a ff 	lea    rsi,[rip+0xffffffffff2a3600]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a6c6b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6c72:	00 
     10a6c73:	e8 06 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6c78:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a6c7f:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6c86:	00 
     10a6c87:	e8 04 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6c8c:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6c93:	00 
     10a6c94:	e8 f7 71 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6c99:	48 8d 35 cb 35 2a ff 	lea    rsi,[rip+0xffffffffff2a35cb]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a6ca0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ca7:	00 
     10a6ca8:	e8 d1 2d 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6cad:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6cb4:	00 
     10a6cb5:	48 89 df             	mov    rdi,rbx
     10a6cb8:	e8 d3 6d d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6cbd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6cc4:	00 
     10a6cc5:	e8 c6 71 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6cca:	48 8d 35 9a 35 2a ff 	lea    rsi,[rip+0xffffffffff2a359a]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a6cd1:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6cd8:	00 
     10a6cd9:	e8 a0 2d 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6cde:	49 8d be 70 14 00 00 	lea    rdi,[r14+0x1470]
     10a6ce5:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6cec:	00 
     10a6ced:	e8 9e 6d d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6cf2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6cf9:	00 
     10a6cfa:	e8 91 71 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6cff:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     10a6d06:	00 
     10a6d07:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     10a6d0d:	0f 57 c0             	xorps  xmm0,xmm0
     10a6d10:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     10a6d15:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
     10a6d1b:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
     10a6d21:	4d 8d be e8 05 00 00 	lea    r15,[r14+0x5e8]
     10a6d28:	4c 89 ff             	mov    rdi,r15
     10a6d2b:	e8 06 4b 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a6d30:	4c 89 e7             	mov    rdi,r12
     10a6d33:	48 89 c6             	mov    rsi,rax
     10a6d36:	e8 05 e7 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a6d3b:	84 c0                	test   al,al
     10a6d3d:	74 36                	je     10a6d75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e18b>
     10a6d3f:	83 bc 24 78 04 00 00 	cmp    DWORD PTR [rsp+0x478],0x3e
     10a6d46:	3e 
     10a6d47:	75 2c                	jne    10a6d75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e18b>
     10a6d49:	48 8d 35 98 80 39 ff 	lea    rsi,[rip+0xffffffffff398098]        # 43ede8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x49f4>
     10a6d50:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6d55:	e8 24 2d 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6d5a:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a6d61:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6d66:	e8 25 6d d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6d6b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6d70:	e8 1b 71 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6d75:	41 80 be c8 0f 00 00 	cmp    BYTE PTR [r14+0xfc8],0x0
     10a6d7c:	00 
     10a6d7d:	74 36                	je     10a6db5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e1cb>
     10a6d7f:	41 83 be 98 09 00 00 	cmp    DWORD PTR [r14+0x998],0x2
     10a6d86:	02 
     10a6d87:	75 2c                	jne    10a6db5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e1cb>
     10a6d89:	48 8d 35 3a 96 28 ff 	lea    rsi,[rip+0xffffffffff28963a]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
     10a6d90:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6d95:	e8 e4 2c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6d9a:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a6da1:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6da6:	e8 e5 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6dab:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6db0:	e8 db 70 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6db5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6dbc:	00 
     10a6dbd:	e8 6c e5 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a6dc2:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a6dc9:	00 
     10a6dca:	0f 84 f0 00 00 00    	je     10a6ec0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e2d6>
     10a6dd0:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     10a6dd7:	00 
     10a6dd8:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     10a6dde:	0f 57 c0             	xorps  xmm0,xmm0
     10a6de1:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     10a6de6:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
     10a6dec:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
     10a6df2:	49 8d be 90 00 00 00 	lea    rdi,[r14+0x90]
     10a6df9:	e8 38 4a 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a6dfe:	4c 89 e7             	mov    rdi,r12
     10a6e01:	48 89 c6             	mov    rsi,rax
     10a6e04:	e8 37 e6 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a6e09:	84 c0                	test   al,al
     10a6e0b:	74 70                	je     10a6e7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e293>
     10a6e0d:	8b 84 24 78 04 00 00 	mov    eax,DWORD PTR [rsp+0x478]
     10a6e14:	83 f8 3f             	cmp    eax,0x3f
     10a6e17:	75 33                	jne    10a6e4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e262>
     10a6e19:	48 8d 35 87 4c 2c ff 	lea    rsi,[rip+0xffffffffff2c4c87]        # 36baa7 <_ZTSSt12bad_any_cast@@Base-0x24721>
     10a6e20:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e25:	e8 54 2c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6e2a:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a6e31:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6e36:	e8 55 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6e3b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e40:	e8 4b 70 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6e45:	8b 84 24 78 04 00 00 	mov    eax,DWORD PTR [rsp+0x478]
     10a6e4c:	83 f8 0c             	cmp    eax,0xc
     10a6e4f:	75 2c                	jne    10a6e7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e293>
     10a6e51:	48 8d 35 ed 6e 2c ff 	lea    rsi,[rip+0xffffffffff2c6eed]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a6e58:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e5d:	e8 1c 2c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6e62:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a6e69:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6e6e:	e8 1d 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6e73:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e78:	e8 13 70 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6e7d:	41 80 be 94 05 00 00 	cmp    BYTE PTR [r14+0x594],0x0
     10a6e84:	00 
     10a6e85:	74 2c                	je     10a6eb3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e2c9>
     10a6e87:	48 8d 35 47 0e 2c ff 	lea    rsi,[rip+0xffffffffff2c0e47]        # 367cd5 <_ZTSSt12bad_any_cast@@Base-0x284f3>
     10a6e8e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e93:	e8 e6 2b 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6e98:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a6e9f:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6ea4:	e8 e7 6b d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6ea9:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6eae:	e8 dd 6f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6eb3:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6eba:	00 
     10a6ebb:	e8 6e e4 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a6ec0:	41 8a 86 c8 0f 00 00 	mov    al,BYTE PTR [r14+0xfc8]
     10a6ec7:	84 c0                	test   al,al
     10a6ec9:	74 46                	je     10a6f11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e327>
     10a6ecb:	41 83 be 98 09 00 00 	cmp    DWORD PTR [r14+0x998],0x2
     10a6ed2:	02 
     10a6ed3:	75 3c                	jne    10a6f11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e327>
     10a6ed5:	48 8d 35 ee 94 28 ff 	lea    rsi,[rip+0xffffffffff2894ee]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
     10a6edc:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ee3:	00 
     10a6ee4:	e8 95 2b 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6ee9:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a6ef0:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6ef7:	00 
     10a6ef8:	e8 93 6b d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6efd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f04:	00 
     10a6f05:	e8 86 6f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6f0a:	41 8a 86 c8 0f 00 00 	mov    al,BYTE PTR [r14+0xfc8]
     10a6f11:	84 c0                	test   al,al
     10a6f13:	0f 84 21 01 00 00    	je     10a703a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e450>
     10a6f19:	41 8b 86 98 09 00 00 	mov    eax,DWORD PTR [r14+0x998]
     10a6f20:	83 e0 fe             	and    eax,0xfffffffe
     10a6f23:	83 f8 04             	cmp    eax,0x4
     10a6f26:	0f 85 0e 01 00 00    	jne    10a703a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e450>
     10a6f2c:	48 8d 35 b5 08 2d ff 	lea    rsi,[rip+0xffffffffff2d08b5]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a6f33:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f3a:	00 
     10a6f3b:	e8 3e 2b 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6f40:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a6f47:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6f4e:	00 
     10a6f4f:	e8 3c 6b d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6f54:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f5b:	00 
     10a6f5c:	e8 2f 6f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6f61:	48 8d 35 80 08 2d ff 	lea    rsi,[rip+0xffffffffff2d0880]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a6f68:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f6f:	00 
     10a6f70:	e8 09 2b 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6f75:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a6f7c:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6f83:	00 
     10a6f84:	e8 07 6b d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6f89:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f90:	00 
     10a6f91:	e8 fa 6e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6f96:	48 8d 35 4b 08 2d ff 	lea    rsi,[rip+0xffffffffff2d084b]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a6f9d:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6fa4:	00 
     10a6fa5:	e8 d4 2a 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6faa:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a6fb1:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6fb8:	00 
     10a6fb9:	e8 d2 6a d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6fbe:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6fc5:	00 
     10a6fc6:	e8 c5 6e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6fcb:	48 8d 35 16 08 2d ff 	lea    rsi,[rip+0xffffffffff2d0816]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a6fd2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6fd9:	00 
     10a6fda:	e8 9f 2a 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6fdf:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a6fe6:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6fed:	00 
     10a6fee:	e8 9d 6a d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6ff3:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ffa:	00 
     10a6ffb:	e8 90 6e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7000:	48 8d 35 e1 07 2d ff 	lea    rsi,[rip+0xffffffffff2d07e1]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a7007:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a700e:	00 
     10a700f:	e8 6a 2a 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7014:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a701b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7022:	00 
     10a7023:	e8 68 6a d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7028:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a702f:	00 
     10a7030:	e8 5b 6e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7035:	e9 cf 00 00 00       	jmp    10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a703a:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7041:	00 
     10a7042:	0f 84 c1 00 00 00    	je     10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a7048:	41 80 be 88 05 00 00 	cmp    BYTE PTR [r14+0x588],0x0
     10a704f:	00 
     10a7050:	0f 84 b3 00 00 00    	je     10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a7056:	49 8d b6 78 04 00 00 	lea    rsi,[r14+0x478]
     10a705d:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     10a7064:	00 
     10a7065:	4c 89 e7             	mov    rdi,r12
     10a7068:	e8 fc 1c 3e 00       	call   1488d69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce2ed>
     10a706d:	41 83 3c 24 09       	cmp    DWORD PTR [r12],0x9
     10a7072:	0f 85 84 00 00 00    	jne    10a70fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e512>
     10a7078:	48 8d 35 69 07 2d ff 	lea    rsi,[rip+0xffffffffff2d0769]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a707f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7084:	e8 f5 29 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7089:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a7090:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7095:	e8 f6 69 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a709a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a709f:	e8 ec 6d 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a70a4:	48 8d 35 3d 07 2d ff 	lea    rsi,[rip+0xffffffffff2d073d]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a70ab:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a70b0:	e8 c9 29 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a70b5:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a70bc:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a70c1:	e8 ca 69 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a70c6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a70cb:	e8 c0 6d 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a70d0:	48 8d 35 11 07 2d ff 	lea    rsi,[rip+0xffffffffff2d0711]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a70d7:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a70dc:	e8 9d 29 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a70e1:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a70e8:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a70ed:	e8 9e 69 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a70f2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a70f7:	e8 94 6d 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a70fc:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
     10a7103:	00 
     10a7104:	e8 e9 89 e2 ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
     10a7109:	41 8a 8e c8 0f 00 00 	mov    cl,BYTE PTR [r14+0xfc8]
     10a7110:	41 8b 86 98 09 00 00 	mov    eax,DWORD PTR [r14+0x998]
     10a7117:	84 c9                	test   cl,cl
     10a7119:	74 48                	je     10a7163 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e579>
     10a711b:	83 f8 02             	cmp    eax,0x2
     10a711e:	75 43                	jne    10a7163 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e579>
     10a7120:	48 8d 35 a3 92 28 ff 	lea    rsi,[rip+0xffffffffff2892a3]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
     10a7127:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a712e:	00 
     10a712f:	e8 4a 29 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7134:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
     10a713b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7142:	00 
     10a7143:	e8 48 69 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7148:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a714f:	00 
     10a7150:	e8 3b 6d 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7155:	41 8a 8e c8 0f 00 00 	mov    cl,BYTE PTR [r14+0xfc8]
     10a715c:	41 8b 86 98 09 00 00 	mov    eax,DWORD PTR [r14+0x998]
     10a7163:	84 c9                	test   cl,cl
     10a7165:	0f 84 b1 01 00 00    	je     10a731c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e732>
     10a716b:	83 f8 06             	cmp    eax,0x6
     10a716e:	0f 85 a8 01 00 00    	jne    10a731c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e732>
     10a7174:	48 8d 35 88 b3 28 ff 	lea    rsi,[rip+0xffffffffff28b388]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a717b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7182:	00 
     10a7183:	e8 f6 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7188:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
     10a718f:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7196:	00 
     10a7197:	e8 f4 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a719c:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a71a3:	00 
     10a71a4:	e8 e7 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a71a9:	48 8d 35 53 b3 28 ff 	lea    rsi,[rip+0xffffffffff28b353]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a71b0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a71b7:	00 
     10a71b8:	e8 c1 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a71bd:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a71c4:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a71cb:	00 
     10a71cc:	e8 bf 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a71d1:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a71d8:	00 
     10a71d9:	e8 b2 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a71de:	48 8d 35 1e b3 28 ff 	lea    rsi,[rip+0xffffffffff28b31e]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a71e5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a71ec:	00 
     10a71ed:	e8 8c 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a71f2:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a71f9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7200:	00 
     10a7201:	e8 8a 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7206:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a720d:	00 
     10a720e:	e8 7d 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7213:	48 8d 35 e9 b2 28 ff 	lea    rsi,[rip+0xffffffffff28b2e9]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a721a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7221:	00 
     10a7222:	e8 57 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7227:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a722e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7235:	00 
     10a7236:	e8 55 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a723b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7242:	00 
     10a7243:	e8 48 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7248:	48 8d 35 b4 b2 28 ff 	lea    rsi,[rip+0xffffffffff28b2b4]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a724f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7256:	00 
     10a7257:	e8 22 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a725c:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a7263:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a726a:	00 
     10a726b:	e8 20 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7270:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7277:	00 
     10a7278:	e8 13 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a727d:	48 8d 35 7f b2 28 ff 	lea    rsi,[rip+0xffffffffff28b27f]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a7284:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a728b:	00 
     10a728c:	e8 ed 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7291:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a7298:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a729f:	00 
     10a72a0:	e8 eb 67 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a72a5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a72ac:	00 
     10a72ad:	e8 de 6b 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a72b2:	48 8d 35 4a b2 28 ff 	lea    rsi,[rip+0xffffffffff28b24a]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a72b9:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a72c0:	00 
     10a72c1:	e8 b8 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a72c6:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
     10a72cd:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a72d4:	00 
     10a72d5:	e8 b6 67 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a72da:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a72e1:	00 
     10a72e2:	e8 a9 6b 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a72e7:	48 8d 35 15 b2 28 ff 	lea    rsi,[rip+0xffffffffff28b215]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a72ee:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a72f5:	00 
     10a72f6:	e8 83 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a72fb:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a7302:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7309:	00 
     10a730a:	e8 81 67 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a730f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7316:	00 
     10a7317:	e8 74 6b 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a731c:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7323:	00 
     10a7324:	74 7e                	je     10a73a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7ba>
     10a7326:	41 80 be 94 05 00 00 	cmp    BYTE PTR [r14+0x594],0x0
     10a732d:	00 
     10a732e:	74 74                	je     10a73a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7ba>
     10a7330:	48 8d 35 9e 09 2c ff 	lea    rsi,[rip+0xffffffffff2c099e]        # 367cd5 <_ZTSSt12bad_any_cast@@Base-0x284f3>
     10a7337:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a733e:	00 
     10a733f:	e8 3a 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7344:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a734b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7352:	00 
     10a7353:	e8 38 67 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7358:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a735f:	00 
     10a7360:	e8 2b 6b 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7365:	41 80 be 39 02 00 00 	cmp    BYTE PTR [r14+0x239],0x0
     10a736c:	00 
     10a736d:	74 35                	je     10a73a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7ba>
     10a736f:	48 8d 35 5f 09 2c ff 	lea    rsi,[rip+0xffffffffff2c095f]        # 367cd5 <_ZTSSt12bad_any_cast@@Base-0x284f3>
     10a7376:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a737d:	00 
     10a737e:	e8 fb 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7383:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a738a:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7391:	00 
     10a7392:	e8 f9 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7397:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a739e:	00 
     10a739f:	e8 ec 6a 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a73a4:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a73ab:	00 
     10a73ac:	74 34                	je     10a73e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7f8>
     10a73ae:	41 80 be 97 05 00 00 	cmp    BYTE PTR [r14+0x597],0x0
     10a73b5:	00 
     10a73b6:	75 5f                	jne    10a7417 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e82d>
     10a73b8:	48 8d 35 8a 44 2c ff 	lea    rsi,[rip+0xffffffffff2c448a]        # 36b849 <_ZTSSt12bad_any_cast@@Base-0x2497f>
     10a73bf:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a73c6:	00 
     10a73c7:	e8 b2 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a73cc:	49 8d be 98 16 00 00 	lea    rdi,[r14+0x1698]
     10a73d3:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a73da:	00 
     10a73db:	e8 b0 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a73e0:	eb 28                	jmp    10a740a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e820>
     10a73e2:	48 8d 35 82 2e 2a ff 	lea    rsi,[rip+0xffffffffff2a2e82]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a73e9:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a73f0:	00 
     10a73f1:	e8 88 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a73f6:	49 8d be 98 16 00 00 	lea    rdi,[r14+0x1698]
     10a73fd:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7404:	00 
     10a7405:	e8 86 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a740a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7411:	00 
     10a7412:	e8 79 6a 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7417:	49 8b be 90 18 00 00 	mov    rdi,QWORD PTR [r14+0x1890]
     10a741e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a7421:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10a7424:	84 c0                	test   al,al
     10a7426:	74 6a                	je     10a7492 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e8a8>
     10a7428:	48 8d 35 16 69 2c ff 	lea    rsi,[rip+0xffffffffff2c6916]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a742f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7436:	00 
     10a7437:	e8 42 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a743c:	49 8d be 00 15 00 00 	lea    rdi,[r14+0x1500]
     10a7443:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a744a:	00 
     10a744b:	e8 40 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7450:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7457:	00 
     10a7458:	e8 33 6a 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a745d:	48 8d 35 e1 68 2c ff 	lea    rsi,[rip+0xffffffffff2c68e1]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a7464:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a746b:	00 
     10a746c:	e8 0d 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7471:	49 8d be 18 15 00 00 	lea    rdi,[r14+0x1518]
     10a7478:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a747f:	00 
     10a7480:	e8 0b 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7485:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a748c:	00 
     10a748d:	e8 fe 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7492:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7499:	00 
     10a749a:	0f 84 cc 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74a0:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
     10a74a7:	00 
     10a74a8:	0f 84 be 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74ae:	48 8d 35 90 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6890]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a74b5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74bc:	00 
     10a74bd:	e8 bc 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a74c2:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a74c9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a74d0:	00 
     10a74d1:	e8 ba 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a74d6:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74dd:	00 
     10a74de:	e8 ad 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a74e3:	48 8d 35 5b 68 2c ff 	lea    rsi,[rip+0xffffffffff2c685b]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a74ea:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74f1:	00 
     10a74f2:	e8 87 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a74f7:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
     10a74fe:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7505:	00 
     10a7506:	e8 85 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a750b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7512:	00 
     10a7513:	e8 78 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7518:	48 8d 35 26 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6826]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a751f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7526:	00 
     10a7527:	e8 52 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a752c:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a7533:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a753a:	00 
     10a753b:	e8 50 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7540:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7547:	00 
     10a7548:	e8 43 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a754d:	48 8d 35 f1 67 2c ff 	lea    rsi,[rip+0xffffffffff2c67f1]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a7554:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a755b:	00 
     10a755c:	e8 1d 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7561:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a7568:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a756f:	00 
     10a7570:	e8 1b 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7575:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a757c:	00 
     10a757d:	e8 0e 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7582:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     10a7589:	48 85 ff             	test   rdi,rdi
     10a758c:	74 0d                	je     10a759b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9b1>
     10a758e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a7591:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     10a7597:	84 c0                	test   al,al
     10a7599:	75 35                	jne    10a75d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9e6>
     10a759b:	48 8d 35 a3 67 2c ff 	lea    rsi,[rip+0xffffffffff2c67a3]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a75a2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75a9:	00 
     10a75aa:	e8 cf 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a75af:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a75b6:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a75bd:	00 
     10a75be:	e8 cd 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a75c3:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75ca:	00 
     10a75cb:	e8 c0 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a75d0:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     10a75d7:	48 85 ff             	test   rdi,rdi
     10a75da:	74 0d                	je     10a75e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9ff>
     10a75dc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a75df:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     10a75e5:	84 c0                	test   al,al
     10a75e7:	75 35                	jne    10a761e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea34>
     10a75e9:	48 8d 35 55 67 2c ff 	lea    rsi,[rip+0xffffffffff2c6755]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a75f0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75f7:	00 
     10a75f8:	e8 81 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a75fd:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a7604:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a760b:	00 
     10a760c:	e8 7f 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7611:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7618:	00 
     10a7619:	e8 72 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a761e:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     10a7625:	48 85 ff             	test   rdi,rdi
     10a7628:	74 0d                	je     10a7637 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea4d>
     10a762a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a762d:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     10a7633:	84 c0                	test   al,al
     10a7635:	75 35                	jne    10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a7637:	48 8d 35 07 67 2c ff 	lea    rsi,[rip+0xffffffffff2c6707]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a763e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7645:	00 
     10a7646:	e8 33 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a764b:	49 8d be a8 15 00 00 	lea    rdi,[r14+0x15a8]
     10a7652:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7659:	00 
     10a765a:	e8 31 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a765f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7666:	00 
     10a7667:	e8 24 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a766c:	41 80 be 78 18 00 00 	cmp    BYTE PTR [r14+0x1878],0x0
     10a7673:	00 
     10a7674:	74 72                	je     10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
     10a7676:	49 8d be 60 18 00 00 	lea    rdi,[r14+0x1860]
     10a767d:	48 8d 35 87 2e 2b ff 	lea    rsi,[rip+0xffffffffff2b2e87]        # 35a50b <_ZTSSt12bad_any_cast@@Base-0x35cbd>
     10a7684:	e8 c6 41 9d ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     10a7689:	84 c0                	test   al,al
     10a768b:	74 5b                	je     10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
     10a768d:	48 8d 35 66 1a 29 ff 	lea    rsi,[rip+0xffffffffff291a66]        # 3390fa <_ZTSSt12bad_any_cast@@Base-0x570ce>
     10a7694:	4c 89 ff             	mov    rdi,r15
     10a7697:	e8 b3 41 9d ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     10a769c:	84 c0                	test   al,al
     10a769e:	75 48                	jne    10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
     10a76a0:	48 8d 35 e6 bc 29 ff 	lea    rsi,[rip+0xffffffffff29bce6]        # 34338d <_ZTSSt12bad_any_cast@@Base-0x4ce3b>
     10a76a7:	4c 89 ff             	mov    rdi,r15
     10a76aa:	e8 c3 b0 a4 ff       	call   af2772 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f712>
     10a76af:	84 c0                	test   al,al
     10a76b1:	75 35                	jne    10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
     10a76b3:	48 8d 35 c2 e5 28 ff 	lea    rsi,[rip+0xffffffffff28e5c2]        # 335c7c <_ZTSSt12bad_any_cast@@Base-0x5a54c>
     10a76ba:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a76c1:	00 
     10a76c2:	e8 b7 23 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a76c7:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a76ce:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a76d5:	00 
     10a76d6:	e8 b5 63 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a76db:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a76e2:	00 
     10a76e3:	e8 a8 67 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a76e8:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a76ef:	49 8b b6 c0 10 00 00 	mov    rsi,QWORD PTR [r14+0x10c0]
     10a76f6:	49 8d 96 c8 10 00 00 	lea    rdx,[r14+0x10c8]
     10a76fd:	e8 d0 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7702:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a7709:	49 8b b6 d8 10 00 00 	mov    rsi,QWORD PTR [r14+0x10d8]
     10a7710:	49 8d 96 e0 10 00 00 	lea    rdx,[r14+0x10e0]
     10a7717:	e8 b6 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a771c:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
     10a7723:	49 8b b6 f0 10 00 00 	mov    rsi,QWORD PTR [r14+0x10f0]
     10a772a:	49 8d 96 f8 10 00 00 	lea    rdx,[r14+0x10f8]
     10a7731:	e8 9c 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7736:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a773d:	49 8b b6 08 11 00 00 	mov    rsi,QWORD PTR [r14+0x1108]
     10a7744:	49 8d 96 10 11 00 00 	lea    rdx,[r14+0x1110]
     10a774b:	e8 82 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7750:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a7757:	49 8b b6 20 11 00 00 	mov    rsi,QWORD PTR [r14+0x1120]
     10a775e:	49 8d 96 28 11 00 00 	lea    rdx,[r14+0x1128]
     10a7765:	e8 68 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a776a:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a7771:	49 8b b6 68 11 00 00 	mov    rsi,QWORD PTR [r14+0x1168]
     10a7778:	49 8d 96 70 11 00 00 	lea    rdx,[r14+0x1170]
     10a777f:	e8 4e 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7784:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a778b:	49 8b b6 80 11 00 00 	mov    rsi,QWORD PTR [r14+0x1180]
     10a7792:	49 8d 96 88 11 00 00 	lea    rdx,[r14+0x1188]
     10a7799:	e8 34 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a779e:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
     10a77a5:	49 8b b6 98 11 00 00 	mov    rsi,QWORD PTR [r14+0x1198]
     10a77ac:	49 8d 96 a0 11 00 00 	lea    rdx,[r14+0x11a0]
     10a77b3:	e8 1a 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a77b8:	49 8d be 78 15 00 00 	lea    rdi,[r14+0x1578]
     10a77bf:	49 8b b6 b0 11 00 00 	mov    rsi,QWORD PTR [r14+0x11b0]
     10a77c6:	49 8d 96 b8 11 00 00 	lea    rdx,[r14+0x11b8]
     10a77cd:	e8 00 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a77d2:	49 8d be 90 15 00 00 	lea    rdi,[r14+0x1590]
     10a77d9:	49 8b b6 c8 11 00 00 	mov    rsi,QWORD PTR [r14+0x11c8]
     10a77e0:	49 8d 96 d0 11 00 00 	lea    rdx,[r14+0x11d0]
     10a77e7:	e8 e6 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a77ec:	49 8d be a8 15 00 00 	lea    rdi,[r14+0x15a8]
     10a77f3:	49 8b b6 e0 11 00 00 	mov    rsi,QWORD PTR [r14+0x11e0]
     10a77fa:	49 8d 96 e8 11 00 00 	lea    rdx,[r14+0x11e8]
     10a7801:	e8 cc 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7806:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a780d:	49 8b b6 f8 11 00 00 	mov    rsi,QWORD PTR [r14+0x11f8]
     10a7814:	49 8d 96 00 12 00 00 	lea    rdx,[r14+0x1200]
     10a781b:	e8 b2 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7820:	49 8d be d8 15 00 00 	lea    rdi,[r14+0x15d8]
     10a7827:	49 8b b6 10 12 00 00 	mov    rsi,QWORD PTR [r14+0x1210]
     10a782e:	49 8d 96 18 12 00 00 	lea    rdx,[r14+0x1218]
     10a7835:	e8 98 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a783a:	49 8d be f0 15 00 00 	lea    rdi,[r14+0x15f0]
     10a7841:	49 8b b6 28 12 00 00 	mov    rsi,QWORD PTR [r14+0x1228]
     10a7848:	49 8d 96 30 12 00 00 	lea    rdx,[r14+0x1230]
     10a784f:	e8 7e 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7854:	49 8d be 08 16 00 00 	lea    rdi,[r14+0x1608]
     10a785b:	49 8b b6 40 12 00 00 	mov    rsi,QWORD PTR [r14+0x1240]
     10a7862:	49 8d 96 48 12 00 00 	lea    rdx,[r14+0x1248]
     10a7869:	e8 64 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a786e:	49 8d be 20 16 00 00 	lea    rdi,[r14+0x1620]
     10a7875:	49 8b b6 58 12 00 00 	mov    rsi,QWORD PTR [r14+0x1258]
     10a787c:	49 8d 96 60 12 00 00 	lea    rdx,[r14+0x1260]
     10a7883:	e8 4a 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7888:	49 8d be 38 16 00 00 	lea    rdi,[r14+0x1638]
     10a788f:	49 8b b6 70 12 00 00 	mov    rsi,QWORD PTR [r14+0x1270]
     10a7896:	49 8d 96 78 12 00 00 	lea    rdx,[r14+0x1278]
     10a789d:	e8 30 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a78a2:	49 8d be 50 16 00 00 	lea    rdi,[r14+0x1650]
     10a78a9:	49 8b b6 88 12 00 00 	mov    rsi,QWORD PTR [r14+0x1288]
     10a78b0:	49 8d 96 90 12 00 00 	lea    rdx,[r14+0x1290]
     10a78b7:	e8 16 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a78bc:	49 8d be 68 16 00 00 	lea    rdi,[r14+0x1668]
     10a78c3:	49 8b b6 a0 12 00 00 	mov    rsi,QWORD PTR [r14+0x12a0]
     10a78ca:	49 8d 96 a8 12 00 00 	lea    rdx,[r14+0x12a8]
     10a78d1:	e8 fc 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a78d6:	49 8d be 80 16 00 00 	lea    rdi,[r14+0x1680]
     10a78dd:	49 8b b6 b8 12 00 00 	mov    rsi,QWORD PTR [r14+0x12b8]
     10a78e4:	49 8d 96 c0 12 00 00 	lea    rdx,[r14+0x12c0]
     10a78eb:	e8 e2 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a78f0:	49 8d be 98 16 00 00 	lea    rdi,[r14+0x1698]
     10a78f7:	49 8b b6 d0 12 00 00 	mov    rsi,QWORD PTR [r14+0x12d0]
     10a78fe:	49 8d 96 d8 12 00 00 	lea    rdx,[r14+0x12d8]
     10a7905:	e8 c8 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a790a:	49 8d be 58 17 00 00 	lea    rdi,[r14+0x1758]
     10a7911:	49 8b b6 90 13 00 00 	mov    rsi,QWORD PTR [r14+0x1390]
     10a7918:	49 8d 96 98 13 00 00 	lea    rdx,[r14+0x1398]
     10a791f:	e8 ae 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7924:	49 8d be c8 16 00 00 	lea    rdi,[r14+0x16c8]
     10a792b:	49 8b b6 00 13 00 00 	mov    rsi,QWORD PTR [r14+0x1300]
     10a7932:	49 8d 96 08 13 00 00 	lea    rdx,[r14+0x1308]
     10a7939:	e8 94 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a793e:	49 8d be e0 16 00 00 	lea    rdi,[r14+0x16e0]
     10a7945:	49 8b b6 18 13 00 00 	mov    rsi,QWORD PTR [r14+0x1318]
     10a794c:	49 8d 96 20 13 00 00 	lea    rdx,[r14+0x1320]
     10a7953:	e8 7a 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7958:	49 8d be f8 16 00 00 	lea    rdi,[r14+0x16f8]
     10a795f:	49 8b b6 30 13 00 00 	mov    rsi,QWORD PTR [r14+0x1330]
     10a7966:	49 8d 96 38 13 00 00 	lea    rdx,[r14+0x1338]
     10a796d:	e8 60 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7972:	49 8d be 10 17 00 00 	lea    rdi,[r14+0x1710]
     10a7979:	49 8b b6 48 13 00 00 	mov    rsi,QWORD PTR [r14+0x1348]
     10a7980:	49 8d 96 50 13 00 00 	lea    rdx,[r14+0x1350]
     10a7987:	e8 46 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a798c:	49 8d be 28 17 00 00 	lea    rdi,[r14+0x1728]
     10a7993:	49 8b b6 60 13 00 00 	mov    rsi,QWORD PTR [r14+0x1360]
     10a799a:	49 8d 96 68 13 00 00 	lea    rdx,[r14+0x1368]
     10a79a1:	e8 2c 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a79a6:	49 8d be 40 17 00 00 	lea    rdi,[r14+0x1740]
     10a79ad:	49 8b b6 78 13 00 00 	mov    rsi,QWORD PTR [r14+0x1378]
     10a79b4:	49 8d 96 80 13 00 00 	lea    rdx,[r14+0x1380]
     10a79bb:	e8 12 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a79c0:	49 8d be 70 17 00 00 	lea    rdi,[r14+0x1770]
     10a79c7:	49 8b b6 a8 13 00 00 	mov    rsi,QWORD PTR [r14+0x13a8]
     10a79ce:	49 8d 96 b0 13 00 00 	lea    rdx,[r14+0x13b0]
     10a79d5:	e8 f8 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a79da:	49 8d be 00 15 00 00 	lea    rdi,[r14+0x1500]
     10a79e1:	49 8b b6 38 11 00 00 	mov    rsi,QWORD PTR [r14+0x1138]
     10a79e8:	49 8d 96 40 11 00 00 	lea    rdx,[r14+0x1140]
     10a79ef:	e8 de 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a79f4:	49 8d be 18 15 00 00 	lea    rdi,[r14+0x1518]
     10a79fb:	49 8b b6 50 11 00 00 	mov    rsi,QWORD PTR [r14+0x1150]
     10a7a02:	49 8d 96 58 11 00 00 	lea    rdx,[r14+0x1158]
     10a7a09:	e8 c4 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7a0e:	4d 8d a6 d8 17 00 00 	lea    r12,[r14+0x17d8]
     10a7a15:	49 8b b6 10 14 00 00 	mov    rsi,QWORD PTR [r14+0x1410]
     10a7a1c:	49 8d 96 18 14 00 00 	lea    rdx,[r14+0x1418]
     10a7a23:	4c 89 e7             	mov    rdi,r12
     10a7a26:	e8 a7 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7a2b:	49 8d be f0 17 00 00 	lea    rdi,[r14+0x17f0]
     10a7a32:	49 8b b6 28 14 00 00 	mov    rsi,QWORD PTR [r14+0x1428]
     10a7a39:	49 8d 96 30 14 00 00 	lea    rdx,[r14+0x1430]
     10a7a40:	e8 8d 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7a45:	49 8d be 08 18 00 00 	lea    rdi,[r14+0x1808]
     10a7a4c:	49 8b b6 40 14 00 00 	mov    rsi,QWORD PTR [r14+0x1440]
     10a7a53:	49 8d 96 48 14 00 00 	lea    rdx,[r14+0x1448]
     10a7a5a:	e8 73 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7a5f:	4d 8b ae d0 13 00 00 	mov    r13,QWORD PTR [r14+0x13d0]
     10a7a66:	4d 85 ed             	test   r13,r13
     10a7a69:	74 1c                	je     10a7a87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ee9d>
     10a7a6b:	4d 8d be 88 17 00 00 	lea    r15,[r14+0x1788]
     10a7a72:	49 8d 75 10          	lea    rsi,[r13+0x10]
     10a7a76:	4c 89 ff             	mov    rdi,r15
     10a7a79:	e8 6e dc c4 ff       	call   cf56ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24268c>
     10a7a7e:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     10a7a82:	4d 85 ed             	test   r13,r13
     10a7a85:	75 eb                	jne    10a7a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ee88>
     10a7a87:	4d 8d be b0 17 00 00 	lea    r15,[r14+0x17b0]
     10a7a8e:	4d 8b ae f8 13 00 00 	mov    r13,QWORD PTR [r14+0x13f8]
     10a7a95:	4d 85 ed             	test   r13,r13
     10a7a98:	74 12                	je     10a7aac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eec2>
     10a7a9a:	49 8d 75 10          	lea    rsi,[r13+0x10]
     10a7a9e:	4c 89 ff             	mov    rdi,r15
     10a7aa1:	e8 1c d9 c4 ff       	call   cf53c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x242362>
     10a7aa6:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     10a7aaa:	eb e9                	jmp    10a7a95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eeab>
     10a7aac:	41 80 be 30 18 00 00 	cmp    BYTE PTR [r14+0x1830],0x0
     10a7ab3:	00 
     10a7ab4:	75 31                	jne    10a7ae7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eefd>
     10a7ab6:	48 8d 35 ad ac 28 ff 	lea    rsi,[rip+0xffffffffff28acad]        # 33276a <_ZTSSt12bad_any_cast@@Base-0x5da5e>
     10a7abd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7ac4:	00 
     10a7ac5:	e8 b4 1f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7aca:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7ad1:	00 
     10a7ad2:	4c 89 e7             	mov    rdi,r12
     10a7ad5:	e8 b6 5f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7ada:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7ae1:	00 
     10a7ae2:	e8 a9 63 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7ae7:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7aee:	00 
     10a7aef:	0f 84 a4 01 00 00    	je     10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
     10a7af5:	49 8b b6 98 00 00 00 	mov    rsi,QWORD PTR [r14+0x98]
     10a7afc:	41 8b be 90 00 00 00 	mov    edi,DWORD PTR [r14+0x90]
     10a7b03:	e8 18 3d 9d ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     10a7b08:	84 c0                	test   al,al
     10a7b0a:	0f 85 89 01 00 00    	jne    10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
     10a7b10:	4d 8d ae 90 00 00 00 	lea    r13,[r14+0x90]
     10a7b17:	4c 89 ef             	mov    rdi,r13
     10a7b1a:	e8 c3 36 4b 00       	call   155b1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0766>
     10a7b1f:	84 c0                	test   al,al
     10a7b21:	0f 84 72 01 00 00    	je     10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
     10a7b27:	4d 8b 66 28          	mov    r12,QWORD PTR [r14+0x28]
     10a7b2b:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7b32:	00 
     10a7b33:	4c 89 ee             	mov    rsi,r13
     10a7b36:	e8 05 64 74 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10a7b3b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7b40:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
     10a7b47:	00 
     10a7b48:	6a 01                	push   0x1
     10a7b4a:	5a                   	pop    rdx
     10a7b4b:	e8 08 f9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
     10a7b50:	48 8d 35 cc b1 29 ff 	lea    rsi,[rip+0xffffffffff29b1cc]        # 342d23 <_ZTSSt12bad_any_cast@@Base-0x4d4a5>
     10a7b57:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7b5c:	e8 1d 1f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7b61:	4d 8d 4e 30          	lea    r9,[r14+0x30]
     10a7b65:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     10a7b69:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7b70:	00 
     10a7b71:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
     10a7b76:	6a 20                	push   0x20
     10a7b78:	59                   	pop    rcx
     10a7b79:	4c 8d 44 24 60       	lea    r8,[rsp+0x60]
     10a7b7e:	4c 89 e6             	mov    rsi,r12
     10a7b81:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]
     10a7b87:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7b8c:	e8 ff 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7b91:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7b96:	e8 4d 3a 9d ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     10a7b9b:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7ba2:	00 
     10a7ba3:	e8 e8 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7ba8:	4c 8b a4 24 40 04 00 	mov    r12,QWORD PTR [rsp+0x440]
     10a7baf:	00 
     10a7bb0:	4c 3b a4 24 48 04 00 	cmp    r12,QWORD PTR [rsp+0x448]
     10a7bb7:	00 
     10a7bb8:	0f 84 ce 00 00 00    	je     10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
     10a7bbe:	41 80 7c 24 15 00    	cmp    BYTE PTR [r12+0x15],0x0
     10a7bc4:	0f 84 c2 00 00 00    	je     10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
     10a7bca:	41 8b 44 24 18       	mov    eax,DWORD PTR [r12+0x18]
     10a7bcf:	83 f8 02             	cmp    eax,0x2
     10a7bd2:	74 50                	je     10a7c24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f03a>
     10a7bd4:	83 f8 01             	cmp    eax,0x1
     10a7bd7:	0f 85 af 00 00 00    	jne    10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
     10a7bdd:	48 8d 35 5e fb 2d ff 	lea    rsi,[rip+0xffffffffff2dfb5e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
     10a7be4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7be9:	e8 90 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7bee:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7bf3:	4c 89 ff             	mov    rdi,r15
     10a7bf6:	e8 91 f9 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
     10a7bfb:	49 89 c7             	mov    r15,rax
     10a7bfe:	48 8d 35 13 a0 3a ff 	lea    rsi,[rip+0xffffffffff3aa013]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     10a7c05:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7c0c:	00 
     10a7c0d:	e8 6c 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7c12:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
     10a7c19:	00 
     10a7c1a:	4c 89 ff             	mov    rdi,r15
     10a7c1d:	e8 6e 5e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7c22:	eb 51                	jmp    10a7c75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f08b>
     10a7c24:	41 80 7c 24 40 00    	cmp    BYTE PTR [r12+0x40],0x0
     10a7c2a:	0f 84 5a 01 00 00    	je     10a7d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f1a0>
     10a7c30:	48 8d 35 0b fb 2d ff 	lea    rsi,[rip+0xffffffffff2dfb0b]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
     10a7c37:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7c3c:	e8 3d 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7c41:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7c46:	4c 89 ff             	mov    rdi,r15
     10a7c49:	e8 3e f9 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
     10a7c4e:	49 89 c7             	mov    r15,rax
     10a7c51:	48 8d 35 98 2e 2b ff 	lea    rsi,[rip+0xffffffffff2b2e98]        # 35aaf0 <_ZTSSt12bad_any_cast@@Base-0x356d8>
     10a7c58:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7c5f:	00 
     10a7c60:	e8 19 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7c65:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
     10a7c6c:	00 
     10a7c6d:	4c 89 ff             	mov    rdi,r15
     10a7c70:	e8 1b 5e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7c75:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7c7c:	00 
     10a7c7d:	e8 0e 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7c82:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7c87:	e8 04 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7c8c:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7c93:	00 
     10a7c94:	e8 71 29 e7 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
     10a7c99:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
     10a7c9e:	48 89 df             	mov    rdi,rbx
     10a7ca1:	e8 3c 05 00 00       	call   10a81e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f5f8>
     10a7ca6:	84 c0                	test   al,al
     10a7ca8:	0f 85 a9 00 00 00    	jne    10a7d57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f16d>
     10a7cae:	49 81 c6 38 10 00 00 	add    r14,0x1038
     10a7cb5:	40 88 2c 24          	mov    BYTE PTR [rsp],bpl
     10a7cb9:	0f 57 c0             	xorps  xmm0,xmm0
     10a7cbc:	48 8d 94 24 10 08 00 	lea    rdx,[rsp+0x810]
     10a7cc3:	00 
     10a7cc4:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     10a7cc7:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     10a7ccc:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7cd1:	4c 89 f6             	mov    rsi,r14
     10a7cd4:	e8 31 27 73 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
     10a7cd9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a7cde:	48 89 1e             	mov    QWORD PTR [rsi],rbx
     10a7ce1:	48 89 e0             	mov    rax,rsp
     10a7ce4:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10a7ce8:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
     10a7ced:	48 8b 5c 24 68       	mov    rbx,QWORD PTR [rsp+0x68]
     10a7cf2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7cf9:	00 
     10a7cfa:	48 89 d9             	mov    rcx,rbx
     10a7cfd:	e8 ca 09 00 00       	call   10a86cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fae2>
     10a7d02:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7d07:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a7d0c:	48 89 da             	mov    rdx,rbx
     10a7d0f:	48 89 d9             	mov    rcx,rbx
     10a7d12:	e8 b5 09 00 00       	call   10a86cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fae2>
     10a7d17:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7d1e:	00 
     10a7d1f:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7d24:	e8 93 4d a1 ff       	call   abcabc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a5c>
     10a7d29:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     10a7d2e:	e8 53 67 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7d33:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
     10a7d3a:	00 
     10a7d3b:	e8 46 67 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7d40:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7d45:	e8 1a 4e a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7d4a:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7d51:	00 
     10a7d52:	e8 0d 4e a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7d57:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     10a7d5c:	e8 a3 d2 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
     10a7d61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a7d68:	00 00 
     10a7d6a:	48 3b 84 24 30 08 00 	cmp    rax,QWORD PTR [rsp+0x830]
     10a7d71:	00 
     10a7d72:	0f 85 be 00 00 00    	jne    10a7e36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f24c>
     10a7d78:	48 81 c4 38 08 00 00 	add    rsp,0x838
     10a7d7f:	5b                   	pop    rbx
     10a7d80:	41 5c                	pop    r12
     10a7d82:	41 5d                	pop    r13
     10a7d84:	41 5e                	pop    r14
     10a7d86:	41 5f                	pop    r15
     10a7d88:	5d                   	pop    rbp
     10a7d89:	c3                   	ret
     10a7d8a:	48 8d 35 b1 f9 2d ff 	lea    rsi,[rip+0xffffffffff2df9b1]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
     10a7d91:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7d96:	e8 e3 1c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7d9b:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7da0:	4c 89 ff             	mov    rdi,r15
     10a7da3:	e8 e4 f7 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
     10a7da8:	49 89 c7             	mov    r15,rax
     10a7dab:	48 8d 35 cc 3c 2d ff 	lea    rsi,[rip+0xffffffffff2d3ccc]        # 37ba7e <_ZTSSt12bad_any_cast@@Base-0x1474a>
     10a7db2:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a7db7:	e8 c2 1c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7dbc:	48 8d 15 e4 33 2b ff 	lea    rdx,[rip+0xffffffffff2b33e4]        # 35b1a7 <_ZTSSt12bad_any_cast@@Base-0x35021>
     10a7dc3:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7dc8:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a7dcd:	e8 6b 36 9f ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
     10a7dd2:	49 83 c4 20          	add    r12,0x20
     10a7dd6:	48 8d 15 9f a1 3a ff 	lea    rdx,[rip+0xffffffffff3aa19f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     10a7ddd:	48 89 e7             	mov    rdi,rsp
     10a7de0:	4c 89 e6             	mov    rsi,r12
     10a7de3:	e8 24 d7 a2 ff       	call   ad550c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224ac>
     10a7de8:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7def:	00 
     10a7df0:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     10a7df5:	48 89 e2             	mov    rdx,rsp
     10a7df8:	e8 93 e3 a0 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
     10a7dfd:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
     10a7e04:	00 
     10a7e05:	4c 89 ff             	mov    rdi,r15
     10a7e08:	e8 83 5c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7e0d:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7e14:	00 
     10a7e15:	e8 76 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e1a:	48 89 e7             	mov    rdi,rsp
     10a7e1d:	e8 6e 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e22:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7e27:	e8 64 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e2c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a7e31:	e9 47 fe ff ff       	jmp    10a7c7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f093>
     10a7e36:	e8 75 7c 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a7e3b:	e9 0a 01 00 00       	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7e40:	e9 cd 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7e45:	e9 d7 00 00 00       	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7e4a:	e9 c3 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7e4f:	e9 cd 00 00 00       	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7e54:	eb 06                	jmp    10a7e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f272>
     10a7e56:	eb 13                	jmp    10a7e6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f281>
     10a7e58:	eb 02                	jmp    10a7e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f272>
     10a7e5a:	eb 0f                	jmp    10a7e6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f281>
     10a7e5c:	48 89 c3             	mov    rbx,rax
     10a7e5f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7e64:	e8 27 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e69:	eb 03                	jmp    10a7e6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f284>
     10a7e6b:	48 89 c3             	mov    rbx,rax
     10a7e6e:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
     10a7e75:	00 
     10a7e76:	e8 77 7c e2 ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
     10a7e7b:	e9 be 00 00 00       	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7e80:	eb 7a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e82:	eb 78                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e84:	eb 76                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e86:	eb 74                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e88:	eb 72                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e8a:	eb 70                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e8c:	eb 6e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e8e:	eb 6c                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e90:	eb 6a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e92:	eb 68                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e94:	eb 66                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e96:	eb 64                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e98:	eb 62                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e9a:	eb 60                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e9c:	eb 5e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e9e:	eb 72                	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7ea0:	eb 7f                	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7ea2:	48 89 c3             	mov    rbx,rax
     10a7ea5:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     10a7eaa:	e8 d7 65 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7eaf:	eb 03                	jmp    10a7eb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2ca>
     10a7eb1:	48 89 c3             	mov    rbx,rax
     10a7eb4:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
     10a7ebb:	00 
     10a7ebc:	e8 c5 65 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7ec1:	eb 03                	jmp    10a7ec6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2dc>
     10a7ec3:	48 89 c3             	mov    rbx,rax
     10a7ec6:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7ecb:	e8 94 4c a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7ed0:	eb 03                	jmp    10a7ed5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2eb>
     10a7ed2:	48 89 c3             	mov    rbx,rax
     10a7ed5:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7edc:	00 
     10a7edd:	e8 82 4c a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7ee2:	eb 5a                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7ee4:	eb 16                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ee6:	eb 14                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ee8:	eb 12                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7eea:	eb 10                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7eec:	eb 0e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7eee:	eb 0c                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef0:	eb 0a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef2:	eb 08                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef4:	eb 06                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef6:	eb 04                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef8:	eb 02                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7efa:	eb 00                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7efc:	48 89 c3             	mov    rbx,rax
     10a7eff:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7f06:	00 
     10a7f07:	e8 84 5f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7f0c:	eb 30                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7f0e:	eb 02                	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7f10:	eb 0f                	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7f12:	48 89 c3             	mov    rbx,rax
     10a7f15:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7f1a:	e8 71 5f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7f1f:	eb 03                	jmp    10a7f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f33a>
     10a7f21:	48 89 c3             	mov    rbx,rax
     10a7f24:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7f2b:	00 
     10a7f2c:	e8 fd d3 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a7f31:	eb 0b                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7f33:	eb 15                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f35:	eb 13                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f37:	eb 02                	jmp    10a7f3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f351>
     10a7f39:	eb 0f                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f3b:	48 89 c3             	mov    rbx,rax
     10a7f3e:	48 89 df             	mov    rdi,rbx
     10a7f41:	e8 5f 1b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a7f46:	eb 02                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f48:	eb 00                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f4a:	48 89 c7             	mov    rdi,rax
     10a7f4d:	e8 53 1b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

RIP-relative/comment targets:
- 0x10a6715 -> 0x3d73a8
- 0x10a6742 -> 0x32bea6
- 0x10a6787 -> 0x32ba28
- 0x10a6852 -> 0x32bea6
- 0x10a6898 -> 0x32bea6
- 0x10a68de -> 0x32bea6
- 0x10a692a -> 0x32bea6
- 0x10a6970 -> 0x32bea6
- 0x10a69b6 -> 0x32bea6
- 0x10a6a07 -> 0x32bea6
- 0x10a6a4e -> 0x32bea6
- 0x10a6a83 -> 0x32bea6
- 0x10a6ab8 -> 0x32bea6
- 0x10a6afb -> 0x32bea6
- 0x10a6b30 -> 0x32bea6
- 0x10a6b73 -> 0x32bea6
- 0x10a6bc4 -> 0x380fea
- 0x10a6bcd -> 0x34a26b
- 0x10a6c0e -> 0x3324f4
- 0x10a6c37 -> 0x34d949
- 0x10a6c64 -> 0x34a26b
- 0x10a6c99 -> 0x34a26b
- 0x10a6cca -> 0x34a26b
- 0x10a6d49 -> 0x43ede8
- 0x10a6d89 -> 0x3303ca
- 0x10a6e19 -> 0x36baa7
- 0x10a6e51 -> 0x36dd45
- 0x10a6e87 -> 0x367cd5
- 0x10a6ed5 -> 0x3303ca
- 0x10a6f2c -> 0x3777e8
- 0x10a6f61 -> 0x3777e8
- 0x10a6f96 -> 0x3777e8
- 0x10a6fcb -> 0x3777e8
- 0x10a7000 -> 0x3777e8
- 0x10a7078 -> 0x3777e8
- 0x10a70a4 -> 0x3777e8
- 0x10a70d0 -> 0x3777e8
- 0x10a7120 -> 0x3303ca
- 0x10a7174 -> 0x332503
- 0x10a71a9 -> 0x332503
- 0x10a71de -> 0x332503
- 0x10a7213 -> 0x332503
- 0x10a7248 -> 0x332503
- 0x10a727d -> 0x332503
- 0x10a72b2 -> 0x332503
- 0x10a72e7 -> 0x332503
- 0x10a7330 -> 0x367cd5
- 0x10a736f -> 0x367cd5
- 0x10a73b8 -> 0x36b849
- 0x10a73e2 -> 0x34a26b
- 0x10a7428 -> 0x36dd45
- 0x10a745d -> 0x36dd45
- 0x10a74ae -> 0x36dd45
- 0x10a74e3 -> 0x36dd45
- 0x10a7518 -> 0x36dd45
- 0x10a754d -> 0x36dd45
- 0x10a759b -> 0x36dd45
- 0x10a75e9 -> 0x36dd45
- 0x10a7637 -> 0x36dd45
- 0x10a767d -> 0x35a50b
- 0x10a768d -> 0x3390fa
- 0x10a76a0 -> 0x34338d
- 0x10a76b3 -> 0x335c7c
- 0x10a7ab6 -> 0x33276a
- 0x10a7b50 -> 0x342d23
- 0x10a7bdd -> 0x387742
- 0x10a7bfe -> 0x451c18
- 0x10a7c30 -> 0x387742
- 0x10a7c51 -> 0x35aaf0
- 0x10a7d8a -> 0x387742
- 0x10a7dab -> 0x37ba7e
- 0x10a7dbc -> 0x35b1a7
- 0x10a7dd6 -> 0x451f7c

## ad-state transition: 0x10a9668
Function range: 0x10a9668..0x10a969c

Disassembly:
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret

RIP-relative/comment targets:

## raw skippable getter: 0x14e2472
Function range: 0x14e2472..0x14e2489

Disassembly:
     14e2472:	48 83 c7 20          	add    rdi,0x20
     14e2476:	48 8d 35 73 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56473]        # 4388f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e33f>
     14e247d:	48 8d 15 9c f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f79c]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e2484:	e9 5e 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>

RIP-relative/comment targets:
- 0x14e2476 -> 0x4388f0
- 0x14e247d -> 0x451c20

## derived skippable predicate: 0x14e248a
Function range: 0x14e248a..0x14e24b8

Disassembly:
     14e248a:	53                   	push   rbx
     14e248b:	b0 01                	mov    al,0x1
     14e248d:	80 bf b8 01 00 00 00 	cmp    BYTE PTR [rdi+0x1b8],0x0
     14e2494:	75 13                	jne    14e24a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2d>
     14e2496:	48 89 fb             	mov    rbx,rdi
     14e2499:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e249c:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     14e24a2:	48 85 c0             	test   rax,rax
     14e24a5:	7e 04                	jle    14e24ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2f>
     14e24a7:	31 c0                	xor    eax,eax
     14e24a9:	5b                   	pop    rbx
     14e24aa:	c3                   	ret
     14e24ab:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14e24ae:	48 89 df             	mov    rdi,rbx
     14e24b1:	5b                   	pop    rbx
     14e24b2:	ff a0 c8 00 00 00    	jmp    QWORD PTR [rax+0xc8]

RIP-relative/comment targets:

## delay parser: 0x14e24e8
Function range: 0x14e24e8..0x14e25cf

Disassembly:
     14e24e8:	41 56                	push   r14
     14e24ea:	53                   	push   rbx
     14e24eb:	48 83 ec 38          	sub    rsp,0x38
     14e24ef:	48 89 fb             	mov    rbx,rdi
     14e24f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e24f9:	00 00 
     14e24fb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14e2500:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e2503:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     14e2509:	84 c0                	test   al,al
     14e250b:	74 7d                	je     14e258a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b0e>
     14e250d:	48 83 c3 20          	add    rbx,0x20
     14e2511:	48 8d 35 75 04 e9 fe 	lea    rsi,[rip+0xfffffffffee90475]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
     14e2518:	49 89 e6             	mov    r14,rsp
     14e251b:	4c 89 f7             	mov    rdi,r14
     14e251e:	e8 5b 75 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14e2523:	48 8d 35 26 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56426]        # 438950 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e39f>
     14e252a:	48 89 df             	mov    rdi,rbx
     14e252d:	4c 89 f2             	mov    rdx,r14
     14e2530:	e8 35 04 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14e2535:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     14e253a:	48 89 c6             	mov    rsi,rax
     14e253d:	e8 fe b9 30 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14e2542:	48 89 e3             	mov    rbx,rsp
     14e2545:	48 89 df             	mov    rdi,rbx
     14e2548:	e8 43 b9 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e254d:	83 23 00             	and    DWORD PTR [rbx],0x0
     14e2550:	48 8d 44 24 19       	lea    rax,[rsp+0x19]
     14e2555:	0f b6 48 ff          	movzx  ecx,BYTE PTR [rax-0x1]
     14e2559:	89 ce                	mov    esi,ecx
     14e255b:	d1 ee                	shr    esi,1
     14e255d:	f6 c1 01             	test   cl,0x1
     14e2560:	48 8b 78 0f          	mov    rdi,QWORD PTR [rax+0xf]
     14e2564:	48 0f 44 f8          	cmove  rdi,rax
     14e2568:	48 0f 45 70 07       	cmovne rsi,QWORD PTR [rax+0x7]
     14e256d:	48 01 fe             	add    rsi,rdi
     14e2570:	48 89 e3             	mov    rbx,rsp
     14e2573:	48 89 da             	mov    rdx,rbx
     14e2576:	e8 08 79 7e ff       	call   cc9e83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216e23>
     14e257b:	48 63 1b             	movsxd rbx,DWORD PTR [rbx]
     14e257e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     14e2583:	e8 08 b9 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e2588:	eb 02                	jmp    14e258c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b10>
     14e258a:	31 db                	xor    ebx,ebx
     14e258c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e2593:	00 00 
     14e2595:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     14e259a:	75 2e                	jne    14e25ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b4e>
     14e259c:	48 89 d8             	mov    rax,rbx
     14e259f:	48 83 c4 38          	add    rsp,0x38
     14e25a3:	5b                   	pop    rbx
     14e25a4:	41 5e                	pop    r14
     14e25a6:	c3                   	ret
     14e25a7:	48 89 c3             	mov    rbx,rax
     14e25aa:	48 89 e7             	mov    rdi,rsp
     14e25ad:	e8 de b8 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e25b2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e25b9:	00 00 
     14e25bb:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     14e25c0:	75 08                	jne    14e25ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b4e>
     14e25c2:	48 89 df             	mov    rdi,rbx
     14e25c5:	e8 06 d7 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14e25ca:	e8 e1 d4 30 00       	call   17efab0 <__stack_chk_fail@plt>

RIP-relative/comment targets:
- 0x14e2511 -> 0x37298d
- 0x14e2523 -> 0x438950

## Direct xrefs to target entrypoints

### guard ctor/helper 0xb2828e: 170
- 0xaa3b66 from 0xaa1418..0xaa6ad6
      aa3b45:	66 0f ef c0          	pxor   xmm0,xmm0
      aa3b49:	f3 0f 7f 43 58       	movdqu XMMWORD PTR [rbx+0x58],xmm0
      aa3b4e:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
      aa3b52:	48 8d 43 70          	lea    rax,[rbx+0x70]
      aa3b56:	66 0f 7f 43 70       	movdqa XMMWORD PTR [rbx+0x70],xmm0
      aa3b5b:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
      aa3b5f:	48 89 df             	mov    rdi,rbx
      aa3b62:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      aa3b66:	e8 23 47 08 00       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      aa3b6b:	66 0f ef c0          	pxor   xmm0,xmm0
      aa3b6f:	f3 0f 7f 83 d8 00 00 	movdqu XMMWORD PTR [rbx+0xd8],xmm0
      aa3b76:	00 
      aa3b77:	48 89 ef             	mov    rdi,rbp
      aa3b7a:	e8 eb 63 fd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      aa3b7f:	49 89 5f 10          	mov    QWORD PTR [r15+0x10],rbx
      aa3b83:	4c 89 f7             	mov    rdi,r14
      aa3b86:	e8 df 63 fd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      aa3b8b:	6a 10                	push   0x10
- 0xace36c from 0xacc824..0xaceb41
      ace34a:	66 0f ef c0          	pxor   xmm0,xmm0
      ace34e:	f3 0f 7f 45 50       	movdqu XMMWORD PTR [rbp+0x50],xmm0
      ace353:	48 83 65 60 00       	and    QWORD PTR [rbp+0x60],0x0
      ace358:	4c 89 7d 68          	mov    QWORD PTR [rbp+0x68],r15
      ace35c:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      ace361:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax
      ace365:	48 89 ef             	mov    rdi,rbp
      ace368:	48 83 c7 78          	add    rdi,0x78
      ace36c:	e8 1d 9f 05 00       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ace371:	4d 89 65 08          	mov    QWORD PTR [r13+0x8],r12
      ace375:	49 89 6d 10          	mov    QWORD PTR [r13+0x10],rbp
      ace379:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
      ace37d:	48 85 ff             	test   rdi,rdi
      ace380:	74 0a                	je     ace38c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b32c>
      ace382:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      ace386:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
      ace38a:	75 1f                	jne    ace3ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b34b>
      ace38c:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
- 0xad052a from 0xacf56e..0xad08ee
      ad0507:	4c 89 f6             	mov    rsi,r14
      ad050a:	e8 2f 95 d0 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      ad050f:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      ad0513:	e8 6e df fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ad0518:	4c 89 e7             	mov    rdi,r12
      ad051b:	e8 c8 a2 d0 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      ad0520:	4c 89 ff             	mov    rdi,r15
      ad0523:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
      ad052a:	e8 5f 7d 05 00       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ad052f:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      ad0536:	00 
      ad0537:	e8 b2 7b 07 00       	call   b480ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9508e>
      ad053c:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
      ad0543:	00 
      ad0544:	e8 cb 7b 07 00       	call   b48114 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x950b4>
      ad0549:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
      ad0550:	00 
      ad0551:	e8 e4 7b 07 00       	call   b4813a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x950da>
- 0xb045bc from 0xb03fde..0xb048b9
      b0459c:	00 
      b0459d:	41 0f 11 87 38 01 00 	movups XMMWORD PTR [r15+0x138],xmm0
      b045a4:	00 
      b045a5:	41 0f 11 87 28 01 00 	movups XMMWORD PTR [r15+0x128],xmm0
      b045ac:	00 
      b045ad:	e8 cc 3c 02 00       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
      b045b2:	4c 89 ff             	mov    rdi,r15
      b045b5:	48 81 c7 b0 01 00 00 	add    rdi,0x1b0
      b045bc:	e8 cd 3c 02 00       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      b045c1:	31 ff                	xor    edi,edi
      b045c3:	e8 be 9e f9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b045c8:	49 89 6e 20          	mov    QWORD PTR [r14+0x20],rbp
      b045cc:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15
      b045d0:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      b045d4:	48 85 ff             	test   rdi,rdi
      b045d7:	74 0a                	je     b045e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x51583>
      b045d9:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      b045dd:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
- 0xb8626c from 0xb86086..0xb87f42
      b86247:	e8 aa 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b8624c:	48 8d 43 70          	lea    rax,[rbx+0x70]
      b86250:	66 0f ef c0          	pxor   xmm0,xmm0
      b86254:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      b86259:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
      b8625d:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      b86264:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
      b8626b:	00 
      b8626c:	e8 1d 20 fa ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      b86271:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
      b86278:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      b8627d:	e8 42 34 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>
      b86282:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
      b86289:	48 89 bc 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rdi
      b86290:	00 
      b86291:	e8 2e 34 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>
      b86296:	48 8d bb 88 01 00 00 	lea    rdi,[rbx+0x188]
      b8629d:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
- 0xb8b1bb from 0xb8b162..0xb8b1f2
      b8b198:	31 f6                	xor    esi,esi
      b8b19a:	e8 f1 39 c6 00       	call   17eeb90 <memset@plt>
      b8b19f:	48 8d 05 aa ff ce 00 	lea    rax,[rip+0xceffaa]        # 187b150 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37838>
      b8b1a6:	49 89 07             	mov    QWORD PTR [r15],rax
      b8b1a9:	41 c6 47 10 00       	mov    BYTE PTR [r15+0x10],0x0
      b8b1ae:	49 8d 7f 18          	lea    rdi,[r15+0x18]
      b8b1b2:	e8 3b 00 00 00       	call   b8b1f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd8192>
      b8b1b7:	49 8d 7f 70          	lea    rdi,[r15+0x70]
      b8b1bb:	e8 ce d0 f9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      b8b1c0:	4c 89 ff             	mov    rdi,r15
      b8b1c3:	48 81 c7 c8 00 00 00 	add    rdi,0xc8
      b8b1ca:	e8 bf d0 f9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      b8b1cf:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
      b8b1d3:	4c 89 33             	mov    QWORD PTR [rbx],r14
      b8b1d6:	48 89 d8             	mov    rax,rbx
      b8b1d9:	5b                   	pop    rbx
      b8b1da:	41 5e                	pop    r14
      b8b1dc:	41 5f                	pop    r15
- 0xb8b1ca from 0xb8b162..0xb8b1f2
      b8b1a6:	49 89 07             	mov    QWORD PTR [r15],rax
      b8b1a9:	41 c6 47 10 00       	mov    BYTE PTR [r15+0x10],0x0
      b8b1ae:	49 8d 7f 18          	lea    rdi,[r15+0x18]
      b8b1b2:	e8 3b 00 00 00       	call   b8b1f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd8192>
      b8b1b7:	49 8d 7f 70          	lea    rdi,[r15+0x70]
      b8b1bb:	e8 ce d0 f9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      b8b1c0:	4c 89 ff             	mov    rdi,r15
      b8b1c3:	48 81 c7 c8 00 00 00 	add    rdi,0xc8
      b8b1ca:	e8 bf d0 f9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      b8b1cf:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
      b8b1d3:	4c 89 33             	mov    QWORD PTR [rbx],r14
      b8b1d6:	48 89 d8             	mov    rax,rbx
      b8b1d9:	5b                   	pop    rbx
      b8b1da:	41 5e                	pop    r14
      b8b1dc:	41 5f                	pop    r15
      b8b1de:	c3                   	ret
      b8b1df:	48 89 c3             	mov    rbx,rax
      b8b1e2:	4c 89 f7             	mov    rdi,r14
- 0xb8b9e5 from 0xb8b422..0xb8d4f5
      b8b9c2:	49 89 06             	mov    QWORD PTR [r14],rax
      b8b9c5:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      b8b9ca:	48 8d 05 27 29 c8 00 	lea    rax,[rip+0xc82927]        # 180e2f8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3fb8>
      b8b9d1:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      b8b9d5:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
      b8b9da:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
      b8b9de:	4d 8d 7e 38          	lea    r15,[r14+0x38]
      b8b9e2:	4c 89 ff             	mov    rdi,r15
      b8b9e5:	e8 a4 c8 f9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      b8b9ea:	4d 8d a6 90 00 00 00 	lea    r12,[r14+0x90]
      b8b9f1:	4c 89 e7             	mov    rdi,r12
      b8b9f4:	e8 fd df c4 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b8b9f9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      b8b9fe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b8ba01:	ff 50 60             	call   QWORD PTR [rax+0x60]
      b8ba04:	ff c8                	dec    eax
      b8ba06:	31 c9                	xor    ecx,ecx
      b8ba08:	83 f8 02             	cmp    eax,0x2
- 0xc2cd21 from 0xc2c520..0xc2e184
      c2ccfe:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      c2cd03:	4c 8b 30             	mov    r14,QWORD PTR [rax]
      c2cd06:	bf d0 00 00 00       	mov    edi,0xd0
      c2cd0b:	e8 f0 11 bc 00       	call   17edf00 <_Znwm@plt>
      c2cd10:	48 89 c3             	mov    rbx,rax
      c2cd13:	48 8d 05 f6 a8 be 00 	lea    rax,[rip+0xbea8f6]        # 1817610 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd2d0>
      c2cd1a:	48 89 03             	mov    QWORD PTR [rbx],rax
      c2cd1d:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      c2cd21:	e8 68 b5 ef ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c2cd26:	48 8d 05 1b a9 be 00 	lea    rax,[rip+0xbea91b]        # 1817648 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd308>
      c2cd2d:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      c2cd34:	00 
      c2cd35:	48 89 9c 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rbx
      c2cd3c:	00 
      c2cd3d:	48 89 ac 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbp
      c2cd44:	00 
      c2cd45:	48 89 df             	mov    rdi,rbx
      c2cd48:	48 83 c7 60          	add    rdi,0x60
- 0xc2cfe5 from 0xc2c520..0xc2e184
      c2cfc1:	f3 0f 7f 83 b0 00 00 	movdqu XMMWORD PTR [rbx+0xb0],xmm0
      c2cfc8:	00 
      c2cfc9:	48 83 a3 c0 00 00 00 	and    QWORD PTR [rbx+0xc0],0x0
      c2cfd0:	00 
      c2cfd1:	48 8d 05 90 0f bf 00 	lea    rax,[rip+0xbf0f90]        # 181df68 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x13c28>
      c2cfd8:	48 89 03             	mov    QWORD PTR [rbx],rax
      c2cfdb:	49 89 5c 24 40       	mov    QWORD PTR [r12+0x40],rbx
      c2cfe0:	49 8d 7c 24 48       	lea    rdi,[r12+0x48]
      c2cfe5:	e8 a4 b2 ef ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c2cfea:	48 8d 05 df 9b c3 00 	lea    rax,[rip+0xc39bdf]        # 1866bd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x232b8>
      c2cff1:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      c2cff8:	00 
      c2cff9:	4c 89 a4 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],r12
      c2d000:	00 
      c2d001:	48 89 ac 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbp
      c2d008:	00 
      c2d009:	4d 89 bc 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],r15
      c2d010:	00 
- 0xc2d213 from 0xc2c520..0xc2e184
      c2d1e8:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
      c2d1ef:	00 00 
      c2d1f1:	4d 89 a7 f0 01 00 00 	mov    QWORD PTR [r15+0x1f0],r12
      c2d1f8:	49 8d bf f8 01 00 00 	lea    rdi,[r15+0x1f8]
      c2d1ff:	48 8d b4 24 c0 01 00 	lea    rsi,[rsp+0x1c0]
      c2d206:	00 
      c2d207:	e8 9a 52 eb ff       	call   ae24a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f446>
      c2d20c:	49 8d bf 18 02 00 00 	lea    rdi,[r15+0x218]
      c2d213:	e8 76 b0 ef ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c2d218:	49 8d bf 70 02 00 00 	lea    rdi,[r15+0x270]
      c2d21f:	e8 d2 c7 ba 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c2d224:	49 83 a7 80 02 00 00 	and    QWORD PTR [r15+0x280],0x0
      c2d22b:	00 
      c2d22c:	49 83 a7 90 02 00 00 	and    QWORD PTR [r15+0x290],0x0
      c2d233:	00 
      c2d234:	48 8b 84 24 40 02 00 	mov    rax,QWORD PTR [rsp+0x240]
      c2d23b:	00 
      c2d23c:	48 85 c0             	test   rax,rax
- 0xc359fb from 0xc350c6..0xc361d0
      c359db:	0f 57 c0             	xorps  xmm0,xmm0
      c359de:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
      c359e3:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
      c359e8:	4d 8d 66 28          	lea    r12,[r14+0x28]
      c359ec:	4c 89 e7             	mov    rdi,r12
      c359ef:	e8 02 40 ba 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c359f4:	49 8d 6e 38          	lea    rbp,[r14+0x38]
      c359f8:	48 89 ef             	mov    rdi,rbp
      c359fb:	e8 8e 28 ef ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c35a00:	4c 8b ac 24 d0 00 00 	mov    r13,QWORD PTR [rsp+0xd0]
      c35a07:	00 
      c35a08:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
      c35a0f:	00 
      c35a10:	48 8d 9c 24 58 01 00 	lea    rbx,[rsp+0x158]
      c35a17:	00 
      c35a18:	4c 89 6b f8          	mov    QWORD PTR [rbx-0x8],r13
      c35a1c:	48 89 3b             	mov    QWORD PTR [rbx],rdi
      c35a1f:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
- 0xc35b53 from 0xc350c6..0xc361d0
      c35b31:	49 89 04 24          	mov    QWORD PTR [r12],rax
      c35b35:	49 c7 44 24 08 0a 00 	mov    QWORD PTR [r12+0x8],0xa
      c35b3c:	00 00 
      c35b3e:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      c35b45:	00 
      c35b46:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      c35b4b:	4d 8d 74 24 18       	lea    r14,[r12+0x18]
      c35b50:	4c 89 f7             	mov    rdi,r14
      c35b53:	e8 36 27 ef ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c35b58:	49 8d 6c 24 70       	lea    rbp,[r12+0x70]
      c35b5d:	48 89 ef             	mov    rdi,rbp
      c35b60:	e8 91 3e ba 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c35b65:	49 8d 9c 24 80 00 00 	lea    rbx,[r12+0x80]
      c35b6c:	00 
      c35b6d:	48 89 df             	mov    rdi,rbx
      c35b70:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      c35b75:	4c 89 ee             	mov    rsi,r13
      c35b78:	e8 45 bb b8 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
- 0xc6cb19 from 0xc6c08a..0xc6e081
      c6caf6:	ff 50 10             	call   QWORD PTR [rax+0x10]
      c6caf9:	48 89 df             	mov    rdi,rbx
      c6cafc:	48 83 c7 08          	add    rdi,0x8
      c6cb00:	48 89 c6             	mov    rsi,rax
      c6cb03:	e8 ba 4b b5 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      c6cb08:	49 89 9d 50 01 00 00 	mov    QWORD PTR [r13+0x150],rbx
      c6cb0f:	49 8d 9d 58 01 00 00 	lea    rbx,[r13+0x158]
      c6cb16:	48 89 df             	mov    rdi,rbx
      c6cb19:	e8 70 b7 eb ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c6cb1e:	0f 57 c0             	xorps  xmm0,xmm0
      c6cb21:	41 0f 29 85 c0 01 00 	movaps XMMWORD PTR [r13+0x1c0],xmm0
      c6cb28:	00 
      c6cb29:	41 0f 29 85 b0 01 00 	movaps XMMWORD PTR [r13+0x1b0],xmm0
      c6cb30:	00 
      c6cb31:	41 c7 85 d0 01 00 00 	mov    DWORD PTR [r13+0x1d0],0x3f800000
      c6cb38:	00 00 80 3f 
      c6cb3c:	49 8d bd d8 01 00 00 	lea    rdi,[r13+0x1d8]
      c6cb43:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
- 0xc8901a from 0xc88e08..0xc895dc
      c88ff3:	e8 36 c3 a3 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c88ff8:	4c 89 e7             	mov    rdi,r12
      c88ffb:	e8 90 4e b6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c89000:	48 8d 7d 30          	lea    rdi,[rbp+0x30]
      c89004:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      c89009:	e8 46 14 a4 00       	call   16ca454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5c0>
      c8900e:	48 8d bd 88 00 00 00 	lea    rdi,[rbp+0x88]
      c89015:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      c8901a:	e8 6f f2 e9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c8901f:	48 8d bd 00 01 00 00 	lea    rdi,[rbp+0x100]
      c89026:	0f 57 c0             	xorps  xmm0,xmm0
      c89029:	0f 11 85 f0 00 00 00 	movups XMMWORD PTR [rbp+0xf0],xmm0
      c89030:	0f 11 85 e0 00 00 00 	movups XMMWORD PTR [rbp+0xe0],xmm0
      c89037:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
      c8903c:	e8 b5 09 b5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c89041:	4c 8d ad 10 01 00 00 	lea    r13,[rbp+0x110]
      c89048:	4c 89 ef             	mov    rdi,r13
      c8904b:	e8 a6 09 b5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
- 0xc8907c from 0xc88e08..0xc895dc
      c89057:	48 89 df             	mov    rdi,rbx
      c8905a:	e8 97 09 b5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c8905f:	bf 88 02 00 00       	mov    edi,0x288
      c89064:	e8 97 4e b6 00       	call   17edf00 <_Znwm@plt>
      c89069:	49 89 c4             	mov    r12,rax
      c8906c:	48 8d 05 25 3b b9 00 	lea    rax,[rip+0xb93b25]        # 181cb98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12858>
      c89073:	49 89 04 24          	mov    QWORD PTR [r12],rax
      c89077:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
      c8907c:	e8 0d f2 e9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c89081:	48 8d 05 e8 38 b9 00 	lea    rax,[rip+0xb938e8]        # 181c970 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12630>
      c89088:	49 89 04 24          	mov    QWORD PTR [r12],rax
      c8908c:	48 8d 05 7d 39 b9 00 	lea    rax,[rip+0xb9397d]        # 181ca10 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x126d0>
      c89093:	49 89 44 24 60       	mov    QWORD PTR [r12+0x60],rax
      c89098:	48 8d 05 f9 39 b9 00 	lea    rax,[rip+0xb939f9]        # 181ca98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12758>
      c8909f:	49 89 44 24 68       	mov    QWORD PTR [r12+0x68],rax
      c890a4:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      c890ab:	00 
      c890ac:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
- 0xc8bee6 from 0xc8be88..0xc8bf63
      c8bec1:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
      c8bec6:	0f 11 4b 20          	movups XMMWORD PTR [rbx+0x20],xmm1
      c8beca:	48 8d 05 5f 97 bd 00 	lea    rax,[rip+0xbd975f]        # 1865630 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d18>
      c8bed1:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      c8bed5:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
      c8bed9:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15
      c8bedd:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
      c8bee2:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      c8bee6:	e8 a3 c3 e9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c8beeb:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
      c8bef2:	e8 87 c3 e9 ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
      c8bef7:	0f 57 c0             	xorps  xmm0,xmm0
      c8befa:	0f 11 83 00 01 00 00 	movups XMMWORD PTR [rbx+0x100],xmm0
      c8bf01:	31 ff                	xor    edi,edi
      c8bf03:	e8 7e 25 e1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c8bf08:	4d 89 2e             	mov    QWORD PTR [r14],r13
      c8bf0b:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
      c8bf0f:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
- 0xc928ca from 0xc92874..0xc94ad1
      c928a9:	00 00 
      c928ab:	48 89 84 24 80 1f 00 	mov    QWORD PTR [rsp+0x1f80],rax
      c928b2:	00 
      c928b3:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
      c928b7:	48 8d 05 12 aa b8 00 	lea    rax,[rip+0xb8aa12]        # 181d2d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12f90>
      c928be:	48 89 07             	mov    QWORD PTR [rdi],rax
      c928c1:	48 83 c7 10          	add    rdi,0x10
      c928c5:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      c928ca:	e8 bf 59 e9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      c928cf:	4d 89 66 68          	mov    QWORD PTR [r14+0x68],r12
      c928d3:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
      c928d6:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      c928db:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      c928df:	48 85 c0             	test   rax,rax
      c928e2:	74 05                	je     c928e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1df889>
      c928e4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      c928e9:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      c928ed:	48 8d 35 43 a0 73 ff 	lea    rsi,[rip+0xffffffffff73a043]        # 3cc937 <_ZTSN5boost9exceptionE@@Base+0x2d319>
- 0xcb671a from 0xcb5f9c..0xcb6c8e
      cb66ef:	e8 f4 40 b2 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      cb66f4:	31 c0                	xor    eax,eax
      cb66f6:	41 88 87 10 01 00 00 	mov    BYTE PTR [r15+0x110],al
      cb66fd:	41 88 87 38 01 00 00 	mov    BYTE PTR [r15+0x138],al
      cb6704:	49 8d bf 40 01 00 00 	lea    rdi,[r15+0x140]
      cb670b:	e8 dc c3 03 00       	call   cf2aec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fa8c>
      cb6710:	4d 8d a7 98 01 00 00 	lea    r12,[r15+0x198]
      cb6717:	4c 89 e7             	mov    rdi,r12
      cb671a:	e8 6f 1b e7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      cb671f:	49 8d 87 f0 01 00 00 	lea    rax,[r15+0x1f0]
      cb6726:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
      cb672b:	49 89 8f f0 01 00 00 	mov    QWORD PTR [r15+0x1f0],rcx
      cb6732:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      cb6737:	49 89 8f f8 01 00 00 	mov    QWORD PTR [r15+0x1f8],rcx
      cb673e:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      cb6743:	4d 89 af 00 02 00 00 	mov    QWORD PTR [r15+0x200],r13
      cb674a:	8a 4c 24 17          	mov    cl,BYTE PTR [rsp+0x17]
      cb674e:	41 88 8f 08 02 00 00 	mov    BYTE PTR [r15+0x208],cl
- 0xcbae54 from 0xcb7a20..0xcbc937
      cbae30:	e8 a5 68 00 00       	call   cc16da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e67a>
      cbae35:	49 8d bc 24 d8 04 00 	lea    rdi,[r12+0x4d8]
      cbae3c:	00 
      cbae3d:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
      cbae42:	e8 c3 68 00 00       	call   cc170a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e6aa>
      cbae47:	49 8d bc 24 30 05 00 	lea    rdi,[r12+0x530]
      cbae4e:	00 
      cbae4f:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      cbae54:	e8 35 d4 e6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      cbae59:	49 8d bc 24 88 05 00 	lea    rdi,[r12+0x588]
      cbae60:	00 
      cbae61:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
      cbae66:	e8 97 ef b1 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      cbae6b:	41 c6 84 24 08 06 00 	mov    BYTE PTR [r12+0x608],0x0
      cbae72:	00 00 
      cbae74:	0f 57 c0             	xorps  xmm0,xmm0
      cbae77:	41 0f 29 84 24 e0 05 	movaps XMMWORD PTR [r12+0x5e0],xmm0
      cbae7e:	00 00 
- 0xcbb3a8 from 0xcb7a20..0xcbc937
      cbb385:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      cbb38a:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
      cbb38e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      cbb393:	4c 8d 7b 48          	lea    r15,[rbx+0x48]
      cbb397:	4c 89 ff             	mov    rdi,r15
      cbb39a:	e8 57 e6 b1 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      cbb39f:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
      cbb3a3:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
      cbb3a8:	e8 e1 ce e6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      cbb3ad:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
      cbb3b4:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
      cbb3bb:	00 
      cbb3bc:	e8 cd ce e6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      cbb3c1:	48 8b 6b 28          	mov    rbp,QWORD PTR [rbx+0x28]
      cbb3c5:	4c 8d 84 24 80 07 00 	lea    r8,[rsp+0x780]
      cbb3cc:	00 
      cbb3cd:	4d 89 28             	mov    QWORD PTR [r8],r13
      cbb3d0:	48 8d 35 ba 1c de ff 	lea    rsi,[rip+0xffffffffffde1cba]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
- 0xcbb3bc from 0xcb7a20..0xcbc937
      cbb397:	4c 89 ff             	mov    rdi,r15
      cbb39a:	e8 57 e6 b1 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      cbb39f:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
      cbb3a3:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
      cbb3a8:	e8 e1 ce e6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      cbb3ad:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
      cbb3b4:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
      cbb3bb:	00 
      cbb3bc:	e8 cd ce e6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      cbb3c1:	48 8b 6b 28          	mov    rbp,QWORD PTR [rbx+0x28]
      cbb3c5:	4c 8d 84 24 80 07 00 	lea    r8,[rsp+0x780]
      cbb3cc:	00 
      cbb3cd:	4d 89 28             	mov    QWORD PTR [r8],r13
      cbb3d0:	48 8d 35 ba 1c de ff 	lea    rsi,[rip+0xffffffffffde1cba]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      cbb3d7:	48 8d 0d 08 63 03 00 	lea    rcx,[rip+0x36308]        # cf16e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23e686>
      cbb3de:	4c 8d b4 24 d0 04 00 	lea    r14,[rsp+0x4d0]
      cbb3e5:	00 
      cbb3e6:	6a 08                	push   0x8
- 0xccdaf2 from 0xcccca6..0xccef9d
      ccdace:	66 0f ef c0          	pxor   xmm0,xmm0
      ccdad2:	66 41 0f 7f 86 20 1e 	movdqa XMMWORD PTR [r14+0x1e20],xmm0
      ccdad9:	00 00 
      ccdadb:	49 83 a6 30 1e 00 00 	and    QWORD PTR [r14+0x1e30],0x0
      ccdae2:	00 
      ccdae3:	49 8d be 38 1e 00 00 	lea    rdi,[r14+0x1e38]
      ccdaea:	48 89 bc 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rdi
      ccdaf1:	00 
      ccdaf2:	e8 97 a7 e5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ccdaf7:	41 83 a6 c8 1e 00 00 	and    DWORD PTR [r14+0x1ec8],0x0
      ccdafe:	00 
      ccdaff:	66 0f ef c0          	pxor   xmm0,xmm0
      ccdb03:	66 41 0f 7f 86 90 1e 	movdqa XMMWORD PTR [r14+0x1e90],xmm0
      ccdb0a:	00 00 
      ccdb0c:	66 41 0f 7f 86 a0 1e 	movdqa XMMWORD PTR [r14+0x1ea0],xmm0
      ccdb13:	00 00 
      ccdb15:	66 41 0f 7f 86 b0 1e 	movdqa XMMWORD PTR [r14+0x1eb0],xmm0
      ccdb1c:	00 00 
- 0xd080d7 from 0xd077d6..0xd090fa
      d080b7:	49 8d 9c 24 18 04 00 	lea    rbx,[r12+0x418]
      d080be:	00 
      d080bf:	48 89 df             	mov    rdi,rbx
      d080c2:	e8 3b 1d ad 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      d080c7:	49 8d bc 24 70 04 00 	lea    rdi,[r12+0x470]
      d080ce:	00 
      d080cf:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
      d080d6:	00 
      d080d7:	e8 b2 01 e2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d080dc:	49 8d bc 24 c8 04 00 	lea    rdi,[r12+0x4c8]
      d080e3:	00 
      d080e4:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
      d080eb:	00 
      d080ec:	e8 9d 01 e2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d080f1:	41 c6 84 24 20 05 00 	mov    BYTE PTR [r12+0x520],0x0
      d080f8:	00 00 
      d080fa:	48 b8 00 00 00 00 01 	movabs rax,0x100000000
      d08101:	00 00 00 
- 0xd080ec from 0xd077d6..0xd090fa
      d080ce:	00 
      d080cf:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
      d080d6:	00 
      d080d7:	e8 b2 01 e2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d080dc:	49 8d bc 24 c8 04 00 	lea    rdi,[r12+0x4c8]
      d080e3:	00 
      d080e4:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
      d080eb:	00 
      d080ec:	e8 9d 01 e2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d080f1:	41 c6 84 24 20 05 00 	mov    BYTE PTR [r12+0x520],0x0
      d080f8:	00 00 
      d080fa:	48 b8 00 00 00 00 01 	movabs rax,0x100000000
      d08101:	00 00 00 
      d08104:	49 89 84 24 24 05 00 	mov    QWORD PTR [r12+0x524],rax
      d0810b:	00 
      d0810c:	8a 44 24 68          	mov    al,BYTE PTR [rsp+0x68]
      d08110:	41 88 84 24 2c 05 00 	mov    BYTE PTR [r12+0x52c],al
      d08117:	00 
- 0xd2c998 from 0xd2c68e..0xd2d691
      d2c974:	00 
      d2c975:	4c 89 ff             	mov    rdi,r15
      d2c978:	e8 c3 15 ac 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d2c97d:	4d 8d a5 60 01 00 00 	lea    r12,[r13+0x160]
      d2c984:	4c 89 e7             	mov    rdi,r12
      d2c987:	e8 6a d0 aa 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      d2c98c:	49 8d bd 70 01 00 00 	lea    rdi,[r13+0x170]
      d2c993:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
      d2c998:	e8 f1 b8 df ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d2c99d:	49 8b 5d 30          	mov    rbx,QWORD PTR [r13+0x30]
      d2c9a1:	4c 8d 84 24 40 01 00 	lea    r8,[rsp+0x140]
      d2c9a8:	00 
      d2c9a9:	4d 89 28             	mov    QWORD PTR [r8],r13
      d2c9ac:	48 8d 35 de 06 d7 ff 	lea    rsi,[rip+0xffffffffffd706de]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d2c9b3:	48 8d 0d 62 1d 00 00 	lea    rcx,[rip+0x1d62]        # d2e71c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27b6bc>
      d2c9ba:	4c 8d b4 24 78 01 00 	lea    r14,[rsp+0x178]
      d2c9c1:	00 
      d2c9c2:	6a 08                	push   0x8
- 0xd49be5 from 0xd498ce..0xd4aa39
      d49bc3:	49 83 a6 90 00 00 00 	and    QWORD PTR [r14+0x90],0x0
      d49bca:	00 
      d49bcb:	49 83 a6 c0 00 00 00 	and    QWORD PTR [r14+0xc0],0x0
      d49bd2:	00 
      d49bd3:	49 83 a6 f0 00 00 00 	and    QWORD PTR [r14+0xf0],0x0
      d49bda:	00 
      d49bdb:	49 8d 9e 00 01 00 00 	lea    rbx,[r14+0x100]
      d49be2:	48 89 df             	mov    rdi,rbx
      d49be5:	e8 a4 e6 dd ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d49bea:	4d 8d ae 58 01 00 00 	lea    r13,[r14+0x158]
      d49bf1:	0f 57 c0             	xorps  xmm0,xmm0
      d49bf4:	41 0f 11 86 68 01 00 	movups XMMWORD PTR [r14+0x168],xmm0
      d49bfb:	00 
      d49bfc:	41 0f 11 86 58 01 00 	movups XMMWORD PTR [r14+0x158],xmm0
      d49c03:	00 
      d49c04:	41 c7 86 78 01 00 00 	mov    DWORD PTR [r14+0x178],0x3f800000
      d49c0b:	00 00 80 3f 
      d49c0f:	be d7 15 00 00       	mov    esi,0x15d7
- 0xd49e94 from 0xd498ce..0xd4aa39
      d49e74:	4c 89 f7             	mov    rdi,r14
      d49e77:	e8 14 04 d3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      d49e7c:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
      d49e80:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
      d49e87:	00 
      d49e88:	e8 8b b2 8e 00       	call   1635118 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30286>
      d49e8d:	48 89 df             	mov    rdi,rbx
      d49e90:	48 83 c7 70          	add    rdi,0x70
      d49e94:	e8 f5 e3 dd ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d49e99:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
      d49ea0:	00 
      d49ea1:	e8 26 49 d5 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      d49ea6:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      d49eaa:	48 8d 35 bf 57 68 ff 	lea    rsi,[rip+0xffffffffff6857bf]        # 3cf670 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4c4>
      d49eb1:	48 8d 0d d8 57 68 ff 	lea    rcx,[rip+0xffffffffff6857d8]        # 3cf690 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4e4>
      d49eb8:	6a 15                	push   0x15
      d49eba:	41 5e                	pop    r14
      d49ebc:	6a 1d                	push   0x1d
- 0xd4e102 from 0xd4c6e4..0xd50266
      d4e0e2:	49 89 77 30          	mov    QWORD PTR [r15+0x30],rsi
      d4e0e6:	4d 8d 77 38          	lea    r14,[r15+0x38]
      d4e0ea:	4c 89 f7             	mov    rdi,r14
      d4e0ed:	e8 d0 35 a7 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      d4e0f2:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      d4e0f7:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
      d4e0fb:	4d 8d 6f 50          	lea    r13,[r15+0x50]
      d4e0ff:	4c 89 ef             	mov    rdi,r13
      d4e102:	e8 87 a1 dd ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d4e107:	49 8d 87 a8 00 00 00 	lea    rax,[r15+0xa8]
      d4e10e:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      d4e113:	66 0f ef c0          	pxor   xmm0,xmm0
      d4e117:	f3 41 0f 7f 87 a8 00 	movdqu XMMWORD PTR [r15+0xa8],xmm0
      d4e11e:	00 00 
      d4e120:	49 83 a7 b8 00 00 00 	and    QWORD PTR [r15+0xb8],0x0
      d4e127:	00 
      d4e128:	4d 01 fc             	add    r12,r15
      d4e12b:	4c 89 e7             	mov    rdi,r12
- 0xd4e54a from 0xd4c6e4..0xd50266
      d4e525:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
      d4e52c:	00 
      d4e52d:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
      d4e532:	66 41 83 a6 e8 00 00 	and    WORD PTR [r14+0xe8],0x0
      d4e539:	00 00 
      d4e53b:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]
      d4e542:	48 89 bc 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rdi
      d4e549:	00 
      d4e54a:	e8 3f 9d dd ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d4e54f:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
      d4e556:	00 
      d4e557:	4d 89 30             	mov    QWORD PTR [r8],r14
      d4e55a:	48 8d 35 30 eb d4 ff 	lea    rsi,[rip+0xffffffffffd4eb30]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d4e561:	48 8d 0d 44 28 01 00 	lea    rcx,[rip+0x12844]        # d60dac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2de32>
      d4e568:	4c 8d bc 24 20 04 00 	lea    r15,[rsp+0x420]
      d4e56f:	00 
      d4e570:	6a 08                	push   0x8
      d4e572:	41 59                	pop    r9
- 0xd6bcea from 0xd6aa99..0xd6f087
      d6bcc2:	e8 f7 c5 dd ff       	call   b482be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9525e>
      d6bcc7:	48 8d bb f0 08 00 00 	lea    rdi,[rbx+0x8f0]
      d6bcce:	48 89 bc 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rdi
      d6bcd5:	00 
      d6bcd6:	e8 27 e1 a6 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      d6bcdb:	48 8d bb 48 09 00 00 	lea    rdi,[rbx+0x948]
      d6bce2:	48 89 bc 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rdi
      d6bce9:	00 
      d6bcea:	e8 9f c5 db ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d6bcef:	48 8d bb a0 09 00 00 	lea    rdi,[rbx+0x9a0]
      d6bcf6:	48 89 bc 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rdi
      d6bcfd:	00 
      d6bcfe:	e8 3f fb fb ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
      d6bd03:	48 8d bb f8 09 00 00 	lea    rdi,[rbx+0x9f8]
      d6bd0a:	48 89 bc 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rdi
      d6bd11:	00 
      d6bd12:	e8 eb e0 a6 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      d6bd17:	48 8d bb 50 0a 00 00 	lea    rdi,[rbx+0xa50]
- 0xd6bd26 from 0xd6aa99..0xd6f087
      d6bcfe:	e8 3f fb fb ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
      d6bd03:	48 8d bb f8 09 00 00 	lea    rdi,[rbx+0x9f8]
      d6bd0a:	48 89 bc 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rdi
      d6bd11:	00 
      d6bd12:	e8 eb e0 a6 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      d6bd17:	48 8d bb 50 0a 00 00 	lea    rdi,[rbx+0xa50]
      d6bd1e:	48 89 bc 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rdi
      d6bd25:	00 
      d6bd26:	e8 63 c5 db ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d6bd2b:	48 8d bb a8 0a 00 00 	lea    rdi,[rbx+0xaa8]
      d6bd32:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
      d6bd37:	48 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [rsp+0x90]
      d6bd3e:	00 
      d6bd3f:	e8 fc 21 a8 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d6bd44:	48 8d bb c0 0a 00 00 	lea    rdi,[rbx+0xac0]
      d6bd4b:	48 89 bc 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rdi
      d6bd52:	00 
      d6bd53:	48 8b b4 24 b0 00 00 	mov    rsi,QWORD PTR [rsp+0xb0]
- 0xdce285 from 0xdcdc4e..0xdcecc2
      dce25d:	41 0f 13 8e 98 00 00 	movlps QWORD PTR [r14+0x98],xmm1
      dce264:	00 
      dce265:	4d 8d a6 a0 00 00 00 	lea    r12,[r14+0xa0]
      dce26c:	4d 89 a6 c0 00 00 00 	mov    QWORD PTR [r14+0xc0],r12
      dce273:	4c 89 e6             	mov    rsi,r12
      dce276:	e8 b3 6d 00 00       	call   dd502e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa20b4>
      dce27b:	49 8d 9e d0 00 00 00 	lea    rbx,[r14+0xd0]
      dce282:	48 89 df             	mov    rdi,rbx
      dce285:	e8 04 a0 d5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      dce28a:	49 8d ae 28 01 00 00 	lea    rbp,[r14+0x128]
      dce291:	48 89 ef             	mov    rdi,rbp
      dce294:	e8 5d b7 a0 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      dce299:	0f 57 c0             	xorps  xmm0,xmm0
      dce29c:	41 0f 11 86 48 01 00 	movups XMMWORD PTR [r14+0x148],xmm0
      dce2a3:	00 
      dce2a4:	41 0f 11 86 38 01 00 	movups XMMWORD PTR [r14+0x138],xmm0
      dce2ab:	00 
      dce2ac:	b8 00 00 80 3f       	mov    eax,0x3f800000
- 0xdd9bfa from 0xdd9950..0xdda4de
      dd9bd4:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      dd9bda:	f3 41 0f 7f 46 18    	movdqu XMMWORD PTR [r14+0x18],xmm0
      dd9be0:	49 83 66 38 00       	and    QWORD PTR [r14+0x38],0x0
      dd9be5:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
      dd9beb:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
      dd9bf2:	3f 
      dd9bf3:	4c 89 f7             	mov    rdi,r14
      dd9bf6:	48 83 c7 48          	add    rdi,0x48
      dd9bfa:	e8 8f e6 d4 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      dd9bff:	4d 89 b4 24 e0 00 00 	mov    QWORD PTR [r12+0xe0],r14
      dd9c06:	00 
      dd9c07:	49 83 a4 24 e8 00 00 	and    QWORD PTR [r12+0xe8],0x0
      dd9c0e:	00 00 
      dd9c10:	49 8d 84 24 e8 00 00 	lea    rax,[r12+0xe8]
      dd9c17:	00 
      dd9c18:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      dd9c1d:	4c 8d 84 24 a8 00 00 	lea    r8,[rsp+0xa8]
      dd9c24:	00 
- 0xddf90e from 0xddf87a..0xddfa0e
      ddf8e6:	4c 89 f7             	mov    rdi,r14
      ddf8e9:	e8 7c a6 c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ddf8ee:	4c 89 a3 80 00 00 00 	mov    QWORD PTR [rbx+0x80],r12
      ddf8f5:	4c 8d a3 88 00 00 00 	lea    r12,[rbx+0x88]
      ddf8fc:	4c 89 e7             	mov    rdi,r12
      ddf8ff:	e8 f2 a0 9f 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ddf904:	4c 8d ab 98 00 00 00 	lea    r13,[rbx+0x98]
      ddf90b:	4c 89 ef             	mov    rdi,r13
      ddf90e:	e8 7b 89 d4 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ddf913:	48 8d 83 f0 00 00 00 	lea    rax,[rbx+0xf0]
      ddf91a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ddf91f:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      ddf923:	48 83 65 00 00       	and    QWORD PTR [rbp+0x0],0x0
      ddf928:	48 89 83 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],rax
      ddf92f:	4c 8b b3 80 00 00 00 	mov    r14,QWORD PTR [rbx+0x80]
      ddf936:	4c 8d 44 24 18       	lea    r8,[rsp+0x18]
      ddf93b:	49 89 18             	mov    QWORD PTR [r8],rbx
      ddf93e:	48 8d 35 4c d7 cb ff 	lea    rsi,[rip+0xffffffffffcbd74c]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
- 0xde15c2 from 0xde155e..0xde160b
      de159c:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      de15a1:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
      de15a5:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      de15a9:	4c 89 fe             	mov    rsi,r15
      de15ac:	e8 e9 02 00 00       	call   de189a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae920>
      de15b1:	0f 57 c0             	xorps  xmm0,xmm0
      de15b4:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
      de15bb:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
      de15c2:	e8 c7 6c d4 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      de15c7:	48 89 df             	mov    rdi,rbx
      de15ca:	48 81 c7 20 01 00 00 	add    rdi,0x120
      de15d1:	e8 b8 6c d4 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      de15d6:	c6 83 78 01 00 00 00 	mov    BYTE PTR [rbx+0x178],0x0
      de15dd:	49 89 1e             	mov    QWORD PTR [r14],rbx
      de15e0:	48 83 c4 08          	add    rsp,0x8
      de15e4:	5b                   	pop    rbx
      de15e5:	41 5c                	pop    r12
      de15e7:	41 5d                	pop    r13
- 0xde15d1 from 0xde155e..0xde160b
      de15a9:	4c 89 fe             	mov    rsi,r15
      de15ac:	e8 e9 02 00 00       	call   de189a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae920>
      de15b1:	0f 57 c0             	xorps  xmm0,xmm0
      de15b4:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
      de15bb:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
      de15c2:	e8 c7 6c d4 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      de15c7:	48 89 df             	mov    rdi,rbx
      de15ca:	48 81 c7 20 01 00 00 	add    rdi,0x120
      de15d1:	e8 b8 6c d4 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      de15d6:	c6 83 78 01 00 00 00 	mov    BYTE PTR [rbx+0x178],0x0
      de15dd:	49 89 1e             	mov    QWORD PTR [r14],rbx
      de15e0:	48 83 c4 08          	add    rsp,0x8
      de15e4:	5b                   	pop    rbx
      de15e5:	41 5c                	pop    r12
      de15e7:	41 5d                	pop    r13
      de15e9:	41 5e                	pop    r14
      de15eb:	41 5f                	pop    r15
      de15ed:	5d                   	pop    rbp
- 0xde1b4b from 0xde1a76..0xde1c3f
      de1b26:	49 83 a4 24 88 00 00 	and    QWORD PTR [r12+0x88],0x0
      de1b2d:	00 00 
      de1b2f:	49 8d 44 24 08       	lea    rax,[r12+0x8]
      de1b34:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      de1b39:	49 8d 6c 24 30       	lea    rbp,[r12+0x30]
      de1b3e:	4d 89 e5             	mov    r13,r12
      de1b41:	49 81 c5 90 00 00 00 	add    r13,0x90
      de1b48:	4c 89 ef             	mov    rdi,r13
      de1b4b:	e8 3e 67 d4 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      de1b50:	66 41 c7 84 24 e8 00 	mov    WORD PTR [r12+0xe8],0x101
      de1b57:	00 00 01 01 
      de1b5b:	48 8d 15 be 90 c0 00 	lea    rdx,[rip+0xc090be]        # 19eac20 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1858>
      de1b62:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      de1b67:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      de1b6c:	e8 cf 00 00 00       	call   de1c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecc6>
      de1b71:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      de1b76:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      de1b7a:	49 89 84 24 00 01 00 	mov    QWORD PTR [r12+0x100],rax
- 0xdecba3 from 0xdeb80c..0xdf1297
      decb7c:	49 8d 7d 30          	lea    rdi,[r13+0x30]
      decb80:	e8 81 85 01 00       	call   e05106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd218c>
      decb85:	49 8d bd e8 00 00 00 	lea    rdi,[r13+0xe8]
      decb8c:	e8 ad 85 01 00       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
      decb91:	4c 01 eb             	add    rbx,r13
      decb94:	48 89 df             	mov    rdi,rbx
      decb97:	e8 a2 85 01 00       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
      decb9c:	49 8d bd 98 01 00 00 	lea    rdi,[r13+0x198]
      decba3:	e8 e6 b6 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      decba8:	49 83 a5 10 02 00 00 	and    QWORD PTR [r13+0x210],0x0
      decbaf:	00 
      decbb0:	49 83 a5 40 02 00 00 	and    QWORD PTR [r13+0x240],0x0
      decbb7:	00 
      decbb8:	49 8d bd 50 02 00 00 	lea    rdi,[r13+0x250]
      decbbf:	e8 ca b6 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      decbc4:	49 8d bd a8 02 00 00 	lea    rdi,[r13+0x2a8]
      decbcb:	e8 26 ce 9e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      decbd0:	49 8d bd b8 02 00 00 	lea    rdi,[r13+0x2b8]
- 0xdecbbf from 0xdeb80c..0xdf1297
      decb97:	e8 a2 85 01 00       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
      decb9c:	49 8d bd 98 01 00 00 	lea    rdi,[r13+0x198]
      decba3:	e8 e6 b6 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      decba8:	49 83 a5 10 02 00 00 	and    QWORD PTR [r13+0x210],0x0
      decbaf:	00 
      decbb0:	49 83 a5 40 02 00 00 	and    QWORD PTR [r13+0x240],0x0
      decbb7:	00 
      decbb8:	49 8d bd 50 02 00 00 	lea    rdi,[r13+0x250]
      decbbf:	e8 ca b6 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      decbc4:	49 8d bd a8 02 00 00 	lea    rdi,[r13+0x2a8]
      decbcb:	e8 26 ce 9e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      decbd0:	49 8d bd b8 02 00 00 	lea    rdi,[r13+0x2b8]
      decbd7:	e8 1a ce 9e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      decbdc:	49 8d bd c8 02 00 00 	lea    rdi,[r13+0x2c8]
      decbe3:	e8 0e ce 9e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      decbe8:	49 8d bd d8 02 00 00 	lea    rdi,[r13+0x2d8]
      decbef:	e8 ce d0 9e 00       	call   17d9cc2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5ae3>
      decbf4:	49 8d bd f0 02 00 00 	lea    rdi,[r13+0x2f0]
- 0xded180 from 0xdeb80c..0xdf1297
      ded158:	41 88 44 24 50       	mov    BYTE PTR [r12+0x50],al
      ded15d:	41 88 44 24 58       	mov    BYTE PTR [r12+0x58],al
      ded162:	41 88 44 24 60       	mov    BYTE PTR [r12+0x60],al
      ded167:	41 88 44 24 68       	mov    BYTE PTR [r12+0x68],al
      ded16c:	66 41 83 64 24 70 00 	and    WORD PTR [r12+0x70],0x0
      ded173:	49 8d 7c 24 78       	lea    rdi,[r12+0x78]
      ded178:	48 89 bc 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rdi
      ded17f:	00 
      ded180:	e8 09 b1 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ded185:	4c 89 ef             	mov    rdi,r13
      ded188:	e8 dd cd c8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ded18d:	31 ff                	xor    edi,edi
      ded18f:	e8 88 12 cb ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ded194:	bf 00 03 00 00       	mov    edi,0x300
      ded199:	4c 89 a4 24 48 01 00 	mov    QWORD PTR [rsp+0x148],r12
      ded1a0:	00 
      ded1a1:	e8 5a 0d a0 00       	call   17edf00 <_Znwm@plt>
      ded1a6:	49 89 c5             	mov    r13,rax
- 0xded33d from 0xdeb80c..0xdf1297
      ded317:	48 8b b4 24 50 14 00 	mov    rsi,QWORD PTR [rsp+0x1450]
      ded31e:	00 
      ded31f:	e8 7e b9 ff ff       	call   de8ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5d28>
      ded324:	48 8d 05 05 00 a4 00 	lea    rax,[rip+0xa40005]        # 182d330 <_ZTIN4asio2ip16bad_address_castE@@Base+0x9960>
      ded32b:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      ded32f:	48 83 65 28 00       	and    QWORD PTR [rbp+0x28],0x0
      ded334:	48 83 65 38 00       	and    QWORD PTR [rbp+0x38],0x0
      ded339:	48 8d 7d 48          	lea    rdi,[rbp+0x48]
      ded33d:	e8 4c af d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ded342:	48 8d bd a0 00 00 00 	lea    rdi,[rbp+0xa0]
      ded349:	48 89 bc 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rdi
      ded350:	00 
      ded351:	e8 ea 75 02 00       	call   e14940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19c6>
      ded356:	48 8d bd f8 00 00 00 	lea    rdi,[rbp+0xf8]
      ded35d:	e8 a0 ca 9e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      ded362:	48 8d bd 50 01 00 00 	lea    rdi,[rbp+0x150]
      ded369:	e8 94 ca 9e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      ded36e:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
- 0xdee254 from 0xdeb80c..0xdf1297
      dee229:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
      dee22e:	48 0f 44 c8          	cmove  rcx,rax
      dee232:	66 0f 7f 8c 24 80 02 	movdqa XMMWORD PTR [rsp+0x280],xmm1
      dee239:	00 00 
      dee23b:	48 89 8d d0 01 00 00 	mov    QWORD PTR [rbp+0x1d0],rcx
      dee242:	48 c7 85 d8 01 00 00 	mov    QWORD PTR [rbp+0x1d8],0x2bf20
      dee249:	20 bf 02 00 
      dee24d:	48 8d bd e0 01 00 00 	lea    rdi,[rbp+0x1e0]
      dee254:	e8 35 a0 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      dee259:	48 8d bd 40 02 00 00 	lea    rdi,[rbp+0x240]
      dee260:	48 8d b4 24 90 13 00 	lea    rsi,[rsp+0x1390]
      dee267:	00 
      dee268:	e8 43 24 ee ff       	call   cd06b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d650>
      dee26d:	48 8d bd 70 02 00 00 	lea    rdi,[rbp+0x270]
      dee274:	48 8d b4 24 50 13 00 	lea    rsi,[rsp+0x1350]
      dee27b:	00 
      dee27c:	e8 6f 9c ce ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      dee281:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
- 0xdeea4d from 0xdeb80c..0xdf1297
      deea27:	48 c7 83 50 01 00 00 	mov    QWORD PTR [rbx+0x150],0x7530
      deea2e:	30 75 00 00 
      deea32:	66 0f ef c0          	pxor   xmm0,xmm0
      deea36:	f3 0f 7f 83 58 01 00 	movdqu XMMWORD PTR [rbx+0x158],xmm0
      deea3d:	00 
      deea3e:	48 83 a3 68 01 00 00 	and    QWORD PTR [rbx+0x168],0x0
      deea45:	00 
      deea46:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      deea4d:	e8 3c 98 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      deea52:	48 8d bb c8 01 00 00 	lea    rdi,[rbx+0x1c8]
      deea59:	e8 c0 d1 cc ff       	call   abbc1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bbe>
      deea5e:	48 8d bb 20 02 00 00 	lea    rdi,[rbx+0x220]
      deea65:	e8 98 b3 9e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      deea6a:	48 8d bb 78 02 00 00 	lea    rdi,[rbx+0x278]
      deea71:	e8 8c b3 9e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      deea76:	48 8b 84 24 30 14 00 	mov    rax,QWORD PTR [rsp+0x1430]
      deea7d:	00 
      deea7e:	48 89 83 d0 02 00 00 	mov    QWORD PTR [rbx+0x2d0],rax
- 0xdeebc1 from 0xdeb80c..0xdf1297
      deeb9a:	4c 89 ee             	mov    rsi,r13
      deeb9d:	e8 20 2b 9d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      deeba2:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      deeba9:	66 0f ef c9          	pxor   xmm1,xmm1
      deebad:	f3 0f 7f 4b 6c       	movdqu XMMWORD PTR [rbx+0x6c],xmm1
      deebb2:	66 0f ef c0          	pxor   xmm0,xmm0
      deebb6:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
      deebbc:	66 0f 7f 4b 60       	movdqa XMMWORD PTR [rbx+0x60],xmm1
      deebc1:	e8 c8 96 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      deebc6:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
      deebcd:	4c 89 ee             	mov    rsi,r13
      deebd0:	e8 ed 2a 9d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      deebd5:	4c 89 ff             	mov    rdi,r15
      deebd8:	e8 8d b3 c8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      deebdd:	66 48 0f 6e c3       	movq   xmm0,rbx
      deebe2:	66 49 0f 6e ce       	movq   xmm1,r14
      deebe7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      deebeb:	66 0f 7f 4c 24 60    	movdqa XMMWORD PTR [rsp+0x60],xmm1
- 0xdeec96 from 0xdeb80c..0xdf1297
      deec71:	48 8b b4 24 30 14 00 	mov    rsi,QWORD PTR [rsp+0x1430]
      deec78:	00 
      deec79:	e8 44 2a 9d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      deec7e:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
      deec82:	48 8b b4 24 50 14 00 	mov    rsi,QWORD PTR [rsp+0x1450]
      deec89:	00 
      deec8a:	e8 13 a0 ff ff       	call   de8ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5d28>
      deec8f:	48 8d bb a0 01 00 00 	lea    rdi,[rbx+0x1a0]
      deec96:	e8 f3 95 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      deec9b:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
      deeca2:	00 
      deeca3:	48 89 83 f8 01 00 00 	mov    QWORD PTR [rbx+0x1f8],rax
      deecaa:	48 8d bb 00 02 00 00 	lea    rdi,[rbx+0x200]
      deecb1:	48 8b b4 24 88 14 00 	mov    rsi,QWORD PTR [rsp+0x1488]
      deecb8:	00 
      deecb9:	e8 d2 b5 c8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      deecbe:	66 48 0f 6e c3       	movq   xmm0,rbx
      deecc3:	48 83 c3 20          	add    rbx,0x20
- 0xdef087 from 0xdeb80c..0xdf1297
      def062:	00 
      def063:	49 89 86 88 00 00 00 	mov    QWORD PTR [r14+0x88],rax
      def06a:	49 8d be 90 00 00 00 	lea    rdi,[r14+0x90]
      def071:	48 89 bc 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rdi
      def078:	00 
      def079:	e8 78 a9 9e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      def07e:	b8 a0 00 00 00       	mov    eax,0xa0
      def083:	49 8d 3c 06          	lea    rdi,[r14+rax*1]
      def087:	e8 02 92 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      def08c:	66 0f ef c0          	pxor   xmm0,xmm0
      def090:	f3 41 0f 7f 86 f8 00 	movdqu XMMWORD PTR [r14+0xf8],xmm0
      def097:	00 00 
      def099:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      def09e:	49 83 a6 08 01 00 00 	and    QWORD PTR [r14+0x108],0x0
      def0a5:	00 
      def0a6:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
      def0ad:	00 
      def0ae:	4c 89 fe             	mov    rsi,r15
- 0xdfcc5e from 0xdfcace..0xdfd19b
      dfcc3f:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      dfcc45:	49 89 c6             	mov    r14,rax
      dfcc48:	49 83 c6 10          	add    r14,0x10
      dfcc4c:	ba 88 00 00 00       	mov    edx,0x88
      dfcc51:	48 89 c7             	mov    rdi,rax
      dfcc54:	31 f6                	xor    esi,esi
      dfcc56:	e8 35 1f 9f 00       	call   17eeb90 <memset@plt>
      dfcc5b:	4c 89 f7             	mov    rdi,r14
      dfcc5e:	e8 2b b6 d2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      dfcc63:	66 0f ef c0          	pxor   xmm0,xmm0
      dfcc67:	f3 41 0f 7f 47 71    	movdqu XMMWORD PTR [r15+0x71],xmm0
      dfcc6d:	f3 41 0f 7f 47 68    	movdqu XMMWORD PTR [r15+0x68],xmm0
      dfcc73:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      dfcc76:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      dfcc7a:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      dfcc7f:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      dfcc83:	e8 fe 17 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dfcc88:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
- 0xdfcddd from 0xdfcace..0xdfd19b
      dfcdbc:	e8 27 da 9d 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      dfcdc1:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      dfcdc8:	00 
      dfcdc9:	e8 c2 10 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dfcdce:	48 89 5d 10          	mov    QWORD PTR [rbp+0x10],rbx
      dfcdd2:	31 ff                	xor    edi,edi
      dfcdd4:	e8 ad 16 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dfcdd9:	48 8d 7d 18          	lea    rdi,[rbp+0x18]
      dfcddd:	e8 ac b4 d2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      dfcde2:	48 8d 35 aa d1 56 ff 	lea    rsi,[rip+0xffffffffff56d1aa]        # 369f93 <_ZTSSt12bad_any_cast@@Base-0x26235>
      dfcde9:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      dfcdf0:	00 
      dfcdf1:	e8 88 cc c7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dfcdf6:	48 8d 7d 70          	lea    rdi,[rbp+0x70]
      dfcdfa:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
      dfce01:	00 
      dfce02:	4c 89 ee             	mov    rsi,r13
      dfce05:	48 89 da             	mov    rdx,rbx
- 0xdfce8e from 0xdfcace..0xdfd19b
      dfce69:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
      dfce6d:	48 85 c0             	test   rax,rax
      dfce70:	74 05                	je     dfce77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9efd>
      dfce72:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      dfce77:	4c 89 ad 90 00 00 00 	mov    QWORD PTR [rbp+0x90],r13
      dfce7e:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
      dfce85:	bb a8 00 00 00       	mov    ebx,0xa8
      dfce8a:	48 8d 3c 2b          	lea    rdi,[rbx+rbp*1]
      dfce8e:	e8 fb b3 d2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      dfce93:	48 8d 85 08 01 00 00 	lea    rax,[rbp+0x108]
      dfce9a:	0f 57 c0             	xorps  xmm0,xmm0
      dfce9d:	0f 11 85 08 01 00 00 	movups XMMWORD PTR [rbp+0x108],xmm0
      dfcea4:	48 89 85 00 01 00 00 	mov    QWORD PTR [rbp+0x100],rax
      dfceab:	31 ff                	xor    edi,edi
      dfcead:	e8 d4 15 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dfceb2:	41 bf 18 01 00 00    	mov    r15d,0x118
      dfceb8:	49 8d 3c 2f          	lea    rdi,[r15+rbp*1]
      dfcebc:	e8 35 cb 9d 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
- 0xe740c5 from 0xe74083..0xe74114
      e740a3:	49 89 c6             	mov    r14,rax
      e740a6:	49 83 27 00          	and    QWORD PTR [r15],0x0
      e740aa:	48 8d 05 2f b5 9b 00 	lea    rax,[rip+0x9bb52f]        # 182f5e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x1578>
      e740b1:	49 89 06             	mov    QWORD PTR [r14],rax
      e740b4:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
      e740b8:	49 8d 7e 10          	lea    rdi,[r14+0x10]
      e740bc:	e8 41 5d 96 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e740c1:	49 8d 7e 68          	lea    rdi,[r14+0x68]
      e740c5:	e8 c4 41 cb ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e740ca:	4c 89 f7             	mov    rdi,r14
      e740cd:	48 81 c7 c0 00 00 00 	add    rdi,0xc0
      e740d4:	e8 29 5d 96 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e740d9:	eb 1e                	jmp    e740f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b50f>
      e740db:	48 8d 35 9a de 5d ff 	lea    rsi,[rip+0xffffffffff5dde9a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e740e2:	48 8d 0d 6b 2a 4f ff 	lea    rcx,[rip+0xffffffffff4f2a6b]        # 366b54 <_ZTSSt12bad_any_cast@@Base-0x29674>
      e740e9:	45 31 f6             	xor    r14d,r14d
      e740ec:	6a 03                	push   0x3
      e740ee:	5f                   	pop    rdi
- 0xe7fb7a from 0xe7fa38..0xe7ff0c
      e7fb54:	41 0f 11 45 78       	movups XMMWORD PTR [r13+0x78],xmm0
      e7fb59:	41 0f 11 45 68       	movups XMMWORD PTR [r13+0x68],xmm0
      e7fb5e:	41 0f 11 45 58       	movups XMMWORD PTR [r13+0x58],xmm0
      e7fb63:	41 0f 11 45 48       	movups XMMWORD PTR [r13+0x48],xmm0
      e7fb68:	41 0f 11 45 38       	movups XMMWORD PTR [r13+0x38],xmm0
      e7fb6d:	41 0f 11 45 28       	movups XMMWORD PTR [r13+0x28],xmm0
      e7fb72:	49 83 a5 98 00 00 00 	and    QWORD PTR [r13+0x98],0x0
      e7fb79:	00 
      e7fb7a:	e8 0f 87 ca ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e7fb7f:	c6 44 24 28 01       	mov    BYTE PTR [rsp+0x28],0x1
      e7fb84:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
      e7fb88:	48 ff c0             	inc    rax
      e7fb8b:	78 07                	js     e7fb94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46faa>
      e7fb8d:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
      e7fb92:	eb 15                	jmp    e7fba9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46fbf>
      e7fb94:	48 89 c1             	mov    rcx,rax
      e7fb97:	48 d1 e9             	shr    rcx,1
      e7fb9a:	83 e0 01             	and    eax,0x1
- 0xe91968 from 0xe8fad0..0xe92c49
      e91945:	e8 8a 82 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e9194a:	eb 0d                	jmp    e91959 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58d6f>
      e9194c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      e91953:	00 
      e91954:	e8 8f 8e 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e91959:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      e9195e:	4d 8d a6 98 00 00 00 	lea    r12,[r14+0x98]
      e91965:	4c 89 e7             	mov    rdi,r12
      e91968:	e8 21 69 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e9196d:	40 8a 6d 01          	mov    bpl,BYTE PTR [rbp+0x1]
      e91971:	40 84 ed             	test   bpl,bpl
      e91974:	74 22                	je     e91998 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58dae>
      e91976:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
      e9197d:	00 
      e9197e:	48 89 df             	mov    rdi,rbx
      e91981:	e8 70 80 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e91986:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e9198d:	00 
- 0xe91cca from 0xe8fad0..0xe92c49
      e91ca6:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
      e91cab:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      e91caf:	66 0f 7f 8c 24 90 09 	movdqa XMMWORD PTR [rsp+0x990],xmm1
      e91cb6:	00 00 
      e91cb8:	48 83 a4 24 a0 09 00 	and    QWORD PTR [rsp+0x9a0],0x0
      e91cbf:	00 00 
      e91cc1:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
      e91cc5:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
      e91cca:	e8 bf 65 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e91ccf:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
      e91cd6:	00 
      e91cd7:	66 0f ef c0          	pxor   xmm0,xmm0
      e91cdb:	f3 0f 7f 83 90 00 00 	movdqu XMMWORD PTR [rbx+0x90],xmm0
      e91ce2:	00 
      e91ce3:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
      e91ce7:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
      e91cec:	4c 8b 63 28          	mov    r12,QWORD PTR [rbx+0x28]
      e91cf0:	4d 39 e5             	cmp    r13,r12
- 0xe9333c from 0xe92f2c..0xe98f3b
      e9331c:	4c 63 ed             	movsxd r13,ebp
      e9331f:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
      e93326:	00 
      e93327:	49 89 1f             	mov    QWORD PTR [r15],rbx
      e9332a:	48 8b 05 6f e7 a1 00 	mov    rax,QWORD PTR [rip+0xa1e76f]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e93331:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e93335:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e93339:	4c 89 f7             	mov    rdi,r14
      e9333c:	e8 4d 4f c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93341:	31 ed                	xor    ebp,ebp
      e93343:	41 88 6e 58          	mov    BYTE PTR [r14+0x58],bpl
      e93347:	49 8d 7e 60          	lea    rdi,[r14+0x60]
      e9334b:	4c 89 fe             	mov    rsi,r15
      e9334e:	e8 9d 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e93353:	4d 89 ae 90 00 00 00 	mov    QWORD PTR [r14+0x90],r13
      e9335a:	41 88 ae 98 00 00 00 	mov    BYTE PTR [r14+0x98],bpl
      e93361:	41 88 ae a0 00 00 00 	mov    BYTE PTR [r14+0xa0],bpl
      e93368:	4c 89 f7             	mov    rdi,r14
- 0xe93756 from 0xe92f2c..0xe98f3b
      e93731:	00 
      e93732:	e8 b1 70 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e93737:	49 8d 7e 78          	lea    rdi,[r14+0x78]
      e9373b:	66 0f ef c0          	pxor   xmm0,xmm0
      e9373f:	f3 41 0f 7f 46 60    	movdqu XMMWORD PTR [r14+0x60],xmm0
      e93745:	f3 41 0f 7f 46 50    	movdqu XMMWORD PTR [r14+0x50],xmm0
      e9374b:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
      e93751:	41 c6 46 70 00       	mov    BYTE PTR [r14+0x70],0x0
      e93756:	e8 33 4b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e9375b:	48 89 df             	mov    rdi,rbx
      e9375e:	e8 23 ad c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93763:	31 ff                	xor    edi,edi
      e93765:	e8 b2 ac c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9376a:	bf f0 00 00 00       	mov    edi,0xf0
      e9376f:	e8 8c a7 95 00       	call   17edf00 <_Znwm@plt>
      e93774:	48 89 c3             	mov    rbx,rax
      e93777:	66 0f ef c9          	pxor   xmm1,xmm1
      e9377b:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
- 0xe937fc from 0xe92f2c..0xe98f3b
      e937d7:	66 0f ef c0          	pxor   xmm0,xmm0
      e937db:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e937e2:	00 
      e937e3:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      e937e8:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
      e937ed:	c6 83 90 00 00 00 00 	mov    BYTE PTR [rbx+0x90],0x0
      e937f4:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
      e937fb:	00 
      e937fc:	e8 8d 4a c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93801:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e93808:	00 
      e93809:	4c 89 26             	mov    QWORD PTR [rsi],r12
      e9380c:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
      e93810:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e93817:	00 
      e93818:	48 89 ef             	mov    rdi,rbp
      e9381b:	e8 c2 b0 15 00       	call   fee8e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b5cf8>
      e93820:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
- 0xe93a72 from 0xe92f2c..0xe98f3b
      e93a49:	f3 0f 7f 83 10 01 00 	movdqu XMMWORD PTR [rbx+0x110],xmm0
      e93a50:	00 
      e93a51:	f3 0f 7f 83 20 01 00 	movdqu XMMWORD PTR [rbx+0x120],xmm0
      e93a58:	00 
      e93a59:	48 c7 83 30 01 00 00 	mov    QWORD PTR [rbx+0x130],0x1
      e93a60:	01 00 00 00 
      e93a64:	c6 83 40 01 00 00 00 	mov    BYTE PTR [rbx+0x140],0x0
      e93a6b:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]
      e93a72:	e8 17 48 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93a77:	48 8d bb a8 01 00 00 	lea    rdi,[rbx+0x1a8]
      e93a7e:	e8 0b 48 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93a83:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e93a88:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e93a8c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e93a8f:	48 8d 35 77 fa 53 ff 	lea    rsi,[rip+0xffffffffff53fa77]        # 3d350d <_ZTSN5boost17bad_function_callE@@Base+0x853>
      e93a96:	48 8d 0d 83 fa 53 ff 	lea    rcx,[rip+0xffffffffff53fa83]        # 3d3520 <_ZTSN5boost17bad_function_callE@@Base+0x866>
      e93a9d:	6a 0b                	push   0xb
      e93a9f:	5a                   	pop    rdx
- 0xe93a7e from 0xe92f2c..0xe98f3b
      e93a51:	f3 0f 7f 83 20 01 00 	movdqu XMMWORD PTR [rbx+0x120],xmm0
      e93a58:	00 
      e93a59:	48 c7 83 30 01 00 00 	mov    QWORD PTR [rbx+0x130],0x1
      e93a60:	01 00 00 00 
      e93a64:	c6 83 40 01 00 00 00 	mov    BYTE PTR [rbx+0x140],0x0
      e93a6b:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]
      e93a72:	e8 17 48 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93a77:	48 8d bb a8 01 00 00 	lea    rdi,[rbx+0x1a8]
      e93a7e:	e8 0b 48 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93a83:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e93a88:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e93a8c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e93a8f:	48 8d 35 77 fa 53 ff 	lea    rsi,[rip+0xffffffffff53fa77]        # 3d350d <_ZTSN5boost17bad_function_callE@@Base+0x853>
      e93a96:	48 8d 0d 83 fa 53 ff 	lea    rcx,[rip+0xffffffffff53fa83]        # 3d3520 <_ZTSN5boost17bad_function_callE@@Base+0x866>
      e93a9d:	6a 0b                	push   0xb
      e93a9f:	5a                   	pop    rdx
      e93aa0:	6a 18                	push   0x18
      e93aa2:	41 58                	pop    r8
- 0xe9545e from 0xe92f2c..0xe98f3b
      e95438:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e9543f:	00 
      e95440:	e8 a3 53 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e95445:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]
      e9544a:	4c 8b b4 24 c0 00 00 	mov    r14,QWORD PTR [rsp+0xc0]
      e95451:	00 
      e95452:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95457:	48 8d b8 98 00 00 00 	lea    rdi,[rax+0x98]
      e9545e:	e8 2b 2e c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95463:	48 8b 9c 24 d0 00 00 	mov    rbx,QWORD PTR [rsp+0xd0]
      e9546a:	00 
      e9546b:	48 89 df             	mov    rdi,rbx
      e9546e:	e8 13 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95473:	31 ff                	xor    edi,edi
      e95475:	e8 a2 8f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9547a:	48 89 df             	mov    rdi,rbx
      e9547d:	e8 04 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95482:	31 ff                	xor    edi,edi
- 0xe95704 from 0xe92f2c..0xe98f3b
      e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
      e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e956ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e956ef:	e8 02 43 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e956fb:	00 
      e956fc:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
      e95703:	00 
      e95704:	e8 85 2b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95709:	4d 89 e6             	mov    r14,r12
      e9570c:	49 81 c6 d8 00 00 00 	add    r14,0xd8
      e95713:	66 0f ef c0          	pxor   xmm0,xmm0
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e9571e:	00 00 00 
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
- 0xe998ce from 0xe99886..0xe998e0
      e998a9:	49 89 06             	mov    QWORD PTR [r14],rax
      e998ac:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      e998b0:	48 8d 05 21 a6 9a 00 	lea    rax,[rip+0x9aa621]        # 1843ed8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5c0>
      e998b7:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e998bb:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      e998c0:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
      e998c5:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
      e998ca:	49 8d 7e 50          	lea    rdi,[r14+0x50]
      e998ce:	e8 bb e9 c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e998d3:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      e998d6:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
      e998da:	5b                   	pop    rbx
      e998db:	41 5e                	pop    r14
      e998dd:	41 5f                	pop    r15
      e998df:	c3                   	ret
      e998e0:	41 57                	push   r15
      e998e2:	41 56                	push   r14
      e998e4:	41 55                	push   r13
- 0xe9a011 from 0xe99d07..0xea1f28
      e99fee:	4c 89 e7             	mov    rdi,r12
      e99ff1:	e8 20 b6 00 00       	call   ea5616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ca2c>
      e99ff6:	66 41 c7 45 30 4c 00 	mov    WORD PTR [r13+0x30],0x4c
      e99ffd:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9a002:	49 89 45 38          	mov    QWORD PTR [r13+0x38],rax
      e9a006:	49 89 5d 40          	mov    QWORD PTR [r13+0x40],rbx
      e9a00a:	49 8d 5d 48          	lea    rbx,[r13+0x48]
      e9a00e:	48 89 df             	mov    rdi,rbx
      e9a011:	e8 78 e2 c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e9a016:	4d 8d b5 a0 00 00 00 	lea    r14,[r13+0xa0]
      e9a01d:	66 0f ef c0          	pxor   xmm0,xmm0
      e9a021:	66 41 0f 7f 85 b0 00 	movdqa XMMWORD PTR [r13+0xb0],xmm0
      e9a028:	00 00 
      e9a02a:	66 41 0f 7f 85 a0 00 	movdqa XMMWORD PTR [r13+0xa0],xmm0
      e9a031:	00 00 
      e9a033:	41 c7 85 c0 00 00 00 	mov    DWORD PTR [r13+0xc0],0x3f800000
      e9a03a:	00 00 80 3f 
      e9a03e:	4d 8d bd d0 00 00 00 	lea    r15,[r13+0xd0]
- 0xe9a4d8 from 0xe99d07..0xea1f28
      e9a4b5:	4c 89 e7             	mov    rdi,r12
      e9a4b8:	e8 ad b5 00 00       	call   ea5a6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ce80>
      e9a4bd:	66 41 c7 46 30 1e 00 	mov    WORD PTR [r14+0x30],0x1e
      e9a4c4:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9a4c9:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
      e9a4cd:	49 89 5e 40          	mov    QWORD PTR [r14+0x40],rbx
      e9a4d1:	49 8d 5e 48          	lea    rbx,[r14+0x48]
      e9a4d5:	48 89 df             	mov    rdi,rbx
      e9a4d8:	e8 b1 dd c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e9a4dd:	4c 89 f5             	mov    rbp,r14
      e9a4e0:	49 81 c6 a0 00 00 00 	add    r14,0xa0
      e9a4e7:	66 0f ef c0          	pxor   xmm0,xmm0
      e9a4eb:	66 41 0f 7f 85 b0 00 	movdqa XMMWORD PTR [r13+0xb0],xmm0
      e9a4f2:	00 00 
      e9a4f4:	66 41 0f 7f 85 a0 00 	movdqa XMMWORD PTR [r13+0xa0],xmm0
      e9a4fb:	00 00 
      e9a4fd:	41 c7 85 c0 00 00 00 	mov    DWORD PTR [r13+0xc0],0x3f800000
      e9a504:	00 00 80 3f 
- 0xe9a6be from 0xe99d07..0xea1f28
      e9a69b:	48 89 de             	mov    rsi,rbx
      e9a69e:	e8 0d b7 00 00       	call   ea5db0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d1c6>
      e9a6a3:	66 41 c7 47 30 0b 00 	mov    WORD PTR [r15+0x30],0xb
      e9a6aa:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9a6af:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
      e9a6b3:	4d 89 77 40          	mov    QWORD PTR [r15+0x40],r14
      e9a6b7:	49 8d 5f 48          	lea    rbx,[r15+0x48]
      e9a6bb:	48 89 df             	mov    rdi,rbx
      e9a6be:	e8 cb db c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e9a6c3:	4d 8d b7 a0 00 00 00 	lea    r14,[r15+0xa0]
      e9a6ca:	66 0f ef c0          	pxor   xmm0,xmm0
      e9a6ce:	66 41 0f 7f 87 b0 00 	movdqa XMMWORD PTR [r15+0xb0],xmm0
      e9a6d5:	00 00 
      e9a6d7:	66 41 0f 7f 87 a0 00 	movdqa XMMWORD PTR [r15+0xa0],xmm0
      e9a6de:	00 00 
      e9a6e0:	41 c7 87 c0 00 00 00 	mov    DWORD PTR [r15+0xc0],0x3f800000
      e9a6e7:	00 00 80 3f 
      e9a6eb:	4c 89 fd             	mov    rbp,r15
- 0xe9fb05 from 0xe99d07..0xea1f28
      e9fae0:	48 8d 05 c1 1d 99 00 	lea    rax,[rip+0x991dc1]        # 18318a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3840>
      e9fae7:	49 89 06             	mov    QWORD PTR [r14],rax
      e9faea:	66 41 c7 46 18 8e 00 	mov    WORD PTR [r14+0x18],0x8e
      e9faf1:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9faf6:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      e9fafa:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15
      e9fafe:	4d 8d 7e 30          	lea    r15,[r14+0x30]
      e9fb02:	4c 89 ff             	mov    rdi,r15
      e9fb05:	e8 84 87 c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e9fb0a:	66 0f ef c0          	pxor   xmm0,xmm0
      e9fb0e:	f3 41 0f 7f 86 98 00 	movdqu XMMWORD PTR [r14+0x98],xmm0
      e9fb15:	00 00 
      e9fb17:	f3 41 0f 7f 86 88 00 	movdqu XMMWORD PTR [r14+0x88],xmm0
      e9fb1e:	00 00 
      e9fb20:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e9fb25:	41 89 86 a8 00 00 00 	mov    DWORD PTR [r14+0xa8],eax
      e9fb2c:	41 c6 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],0x1
      e9fb33:	01 
- 0xe9fc28 from 0xe99d07..0xea1f28
      e9fc03:	48 8d 05 d6 1c 99 00 	lea    rax,[rip+0x991cd6]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
      e9fc0a:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e9fc0e:	66 c7 45 18 da 00    	mov    WORD PTR [rbp+0x18],0xda
      e9fc14:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9fc19:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      e9fc1d:	4c 89 7d 28          	mov    QWORD PTR [rbp+0x28],r15
      e9fc21:	4c 8d 7d 30          	lea    r15,[rbp+0x30]
      e9fc25:	4c 89 ff             	mov    rdi,r15
      e9fc28:	e8 61 86 c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e9fc2d:	66 0f ef c0          	pxor   xmm0,xmm0
      e9fc31:	f3 0f 7f 85 98 00 00 	movdqu XMMWORD PTR [rbp+0x98],xmm0
      e9fc38:	00 
      e9fc39:	f3 0f 7f 85 88 00 00 	movdqu XMMWORD PTR [rbp+0x88],xmm0
      e9fc40:	00 
      e9fc41:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e9fc46:	89 85 a8 00 00 00    	mov    DWORD PTR [rbp+0xa8],eax
      e9fc4c:	c6 85 b0 00 00 00 01 	mov    BYTE PTR [rbp+0xb0],0x1
      e9fc53:	4c 8d a5 b8 00 00 00 	lea    r12,[rbp+0xb8]
- 0xeb223e from 0xeb2146..0xeb329d
      eb221e:	e8 6d 80 bc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      eb2223:	4d 8d ac 24 a0 00 00 	lea    r13,[r12+0xa0]
      eb222a:	00 
      eb222b:	4c 89 ef             	mov    rdi,r13
      eb222e:	e8 63 2f f5 ff       	call   e05196 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd221c>
      eb2233:	49 8d ac 24 f8 00 00 	lea    rbp,[r12+0xf8]
      eb223a:	00 
      eb223b:	48 89 ef             	mov    rdi,rbp
      eb223e:	e8 4b 60 c7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      eb2243:	49 8d bc 24 50 01 00 	lea    rdi,[r12+0x150]
      eb224a:	00 
      eb224b:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
      eb2250:	e8 a1 77 92 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      eb2255:	49 8d bc 24 60 01 00 	lea    rdi,[r12+0x160]
      eb225c:	00 
      eb225d:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
      eb2262:	e8 8f 77 92 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      eb2267:	49 8d bc 24 70 01 00 	lea    rdi,[r12+0x170]
- 0xec6a60 from 0xec6a5c..0xec6a6c
      ec6a47:	48 89 fb             	mov    rbx,rdi
      ec6a4a:	48 83 c7 60          	add    rdi,0x60
      ec6a4e:	e8 bb 0c bf ff       	call   ab770e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46ae>
      ec6a53:	48 89 df             	mov    rdi,rbx
      ec6a56:	5b                   	pop    rbx
      ec6a57:	e9 0a 34 91 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ec6a5c:	53                   	push   rbx
      ec6a5d:	48 89 fb             	mov    rbx,rdi
      ec6a60:	e8 29 18 c6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ec6a65:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
      ec6a6a:	5b                   	pop    rbx
      ec6a6b:	c3                   	ret
      ec6a6c:	53                   	push   rbx
      ec6a6d:	48 89 fb             	mov    rbx,rdi
      ec6a70:	48 8d 05 e1 9e 9b 00 	lea    rax,[rip+0x9b9ee1]        # 1880958 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3d040>
      ec6a77:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec6a7a:	48 81 c7 50 01 00 00 	add    rdi,0x150
      ec6a81:	e8 c0 ff ff ff       	call   ec6a46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de5c>
- 0xec7c4a from 0xec7c18..0xec7d32
      ec7c28:	49 89 fe             	mov    r14,rdi
      ec7c2b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec7c32:	00 00 
      ec7c34:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      ec7c39:	48 8d 05 e8 b4 96 00 	lea    rax,[rip+0x96b4e8]        # 1833128 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x50c0>
      ec7c40:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec7c43:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      ec7c47:	48 89 df             	mov    rdi,rbx
      ec7c4a:	e8 3f 06 c6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ec7c4f:	49 8b 07             	mov    rax,QWORD PTR [r15]
      ec7c52:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ec7c56:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      ec7c5a:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
      ec7c5e:	0f 57 c0             	xorps  xmm0,xmm0
      ec7c61:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      ec7c65:	4d 8d 7e 70          	lea    r15,[r14+0x70]
      ec7c69:	4c 89 ff             	mov    rdi,r15
      ec7c6c:	e8 85 1d 91 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
- 0xece63d from 0xece57c..0xecfa4e
      ece61c:	49 89 c7             	mov    r15,rax
      ece61f:	66 c7 00 7e 00       	mov    WORD PTR [rax],0x7e
      ece624:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ece629:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      ece62d:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
      ece632:	49 89 6f 10          	mov    QWORD PTR [r15+0x10],rbp
      ece636:	4d 8d 6f 18          	lea    r13,[r15+0x18]
      ece63a:	4c 89 ef             	mov    rdi,r13
      ece63d:	e8 4c 9c c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ece642:	49 8d 6f 70          	lea    rbp,[r15+0x70]
      ece646:	0f 57 c0             	xorps  xmm0,xmm0
      ece649:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
      ece650:	00 
      ece651:	41 0f 11 47 70       	movups XMMWORD PTR [r15+0x70],xmm0
      ece656:	b8 00 00 80 3f       	mov    eax,0x3f800000
      ece65b:	41 89 87 90 00 00 00 	mov    DWORD PTR [r15+0x90],eax
      ece662:	41 c6 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],0x1
      ece669:	01 
- 0xece798 from 0xece57c..0xecfa4e
      ece775:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      ece779:	66 c7 45 18 d9 00    	mov    WORD PTR [rbp+0x18],0xd9
      ece77f:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ece784:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      ece788:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      ece78d:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
      ece791:	4c 8d 7d 30          	lea    r15,[rbp+0x30]
      ece795:	4c 89 ff             	mov    rdi,r15
      ece798:	e8 f1 9a c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ece79d:	0f 57 c0             	xorps  xmm0,xmm0
      ece7a0:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
      ece7a7:	0f 11 85 88 00 00 00 	movups XMMWORD PTR [rbp+0x88],xmm0
      ece7ae:	b8 00 00 80 3f       	mov    eax,0x3f800000
      ece7b3:	89 85 a8 00 00 00    	mov    DWORD PTR [rbp+0xa8],eax
      ece7b9:	c6 85 b0 00 00 00 01 	mov    BYTE PTR [rbp+0xb0],0x1
      ece7c0:	4c 8d a5 b8 00 00 00 	lea    r12,[rbp+0xb8]
      ece7c7:	4c 89 a5 b8 00 00 00 	mov    QWORD PTR [rbp+0xb8],r12
      ece7ce:	4c 89 a5 c0 00 00 00 	mov    QWORD PTR [rbp+0xc0],r12
- 0xece8ab from 0xece57c..0xecfa4e
      ece886:	48 8d 05 d3 5d 96 00 	lea    rax,[rip+0x965dd3]        # 1834660 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x65f8>
      ece88d:	49 89 06             	mov    QWORD PTR [r14],rax
      ece890:	66 41 c7 46 18 db 00 	mov    WORD PTR [r14+0x18],0xdb
      ece897:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
      ece89b:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      ece8a0:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      ece8a4:	4d 8d 7e 30          	lea    r15,[r14+0x30]
      ece8a8:	4c 89 ff             	mov    rdi,r15
      ece8ab:	e8 de 99 c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ece8b0:	0f 57 c0             	xorps  xmm0,xmm0
      ece8b3:	41 0f 11 86 98 00 00 	movups XMMWORD PTR [r14+0x98],xmm0
      ece8ba:	00 
      ece8bb:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
      ece8c2:	00 
      ece8c3:	b8 00 00 80 3f       	mov    eax,0x3f800000
      ece8c8:	41 89 86 a8 00 00 00 	mov    DWORD PTR [r14+0xa8],eax
      ece8cf:	41 c6 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],0x1
      ece8d6:	01 
- 0xece9c5 from 0xece57c..0xecfa4e
      ece9a0:	48 8d 05 f1 5c 96 00 	lea    rax,[rip+0x965cf1]        # 1834698 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6630>
      ece9a7:	49 89 06             	mov    QWORD PTR [r14],rax
      ece9aa:	66 41 c7 46 18 de 00 	mov    WORD PTR [r14+0x18],0xde
      ece9b1:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
      ece9b5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      ece9ba:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      ece9be:	4d 8d 7e 30          	lea    r15,[r14+0x30]
      ece9c2:	4c 89 ff             	mov    rdi,r15
      ece9c5:	e8 c4 98 c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ece9ca:	0f 57 c0             	xorps  xmm0,xmm0
      ece9cd:	41 0f 11 86 98 00 00 	movups XMMWORD PTR [r14+0x98],xmm0
      ece9d4:	00 
      ece9d5:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
      ece9dc:	00 
      ece9dd:	b8 00 00 80 3f       	mov    eax,0x3f800000
      ece9e2:	41 89 86 a8 00 00 00 	mov    DWORD PTR [r14+0xa8],eax
      ece9e9:	41 c6 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],0x1
      ece9f0:	01 
- 0xeceaeb from 0xece57c..0xecfa4e
      eceac7:	66 41 c7 44 24 18 06 	mov    WORD PTR [r12+0x18],0x6
      eceace:	00 
      eceacf:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ecead4:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      ecead9:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      eceade:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      eceae3:	4d 8d 74 24 30       	lea    r14,[r12+0x30]
      eceae8:	4c 89 f7             	mov    rdi,r14
      eceaeb:	e8 9e 97 c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      eceaf0:	0f 57 c0             	xorps  xmm0,xmm0
      eceaf3:	41 0f 11 84 24 98 00 	movups XMMWORD PTR [r12+0x98],xmm0
      eceafa:	00 00 
      eceafc:	41 0f 11 84 24 88 00 	movups XMMWORD PTR [r12+0x88],xmm0
      eceb03:	00 00 
      eceb05:	b8 00 00 80 3f       	mov    eax,0x3f800000
      eceb0a:	41 89 84 24 a8 00 00 	mov    DWORD PTR [r12+0xa8],eax
      eceb11:	00 
      eceb12:	41 c6 84 24 b0 00 00 	mov    BYTE PTR [r12+0xb0],0x1
- 0xecee4d from 0xece57c..0xecfa4e
      ecee2d:	0f 57 c0             	xorps  xmm0,xmm0
      ecee30:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
      ecee35:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      ecee39:	49 8d 46 30          	lea    rax,[r14+0x30]
      ecee3d:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
      ecee42:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      ecee46:	4c 89 f7             	mov    rdi,r14
      ecee49:	48 83 c7 40          	add    rdi,0x40
      ecee4d:	e8 3c 94 c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ecee52:	4c 89 b3 28 04 00 00 	mov    QWORD PTR [rbx+0x428],r14
      ecee59:	48 8d bb 30 04 00 00 	lea    rdi,[rbx+0x430]
      ecee60:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      ecee65:	e8 8c ab 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ecee6a:	45 31 f6             	xor    r14d,r14d
      ecee6d:	44 88 b3 40 04 00 00 	mov    BYTE PTR [rbx+0x440],r14b
      ecee74:	48 8d 83 48 04 00 00 	lea    rax,[rbx+0x448]
      ecee7b:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
      ecee82:	00 
- 0xee7163 from 0xee7140..0xee724e
      ee7148:	53                   	push   rbx
      ee7149:	49 89 cf             	mov    r15,rcx
      ee714c:	48 89 fb             	mov    rbx,rdi
      ee714f:	66 c7 07 1b 00       	mov    WORD PTR [rdi],0x1b
      ee7154:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
      ee7158:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx
      ee715c:	4c 8d 77 18          	lea    r14,[rdi+0x18]
      ee7160:	4c 89 f7             	mov    rdi,r14
      ee7163:	e8 26 11 c4 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ee7168:	0f 57 c0             	xorps  xmm0,xmm0
      ee716b:	0f 11 83 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm0
      ee7172:	0f 11 43 70          	movups XMMWORD PTR [rbx+0x70],xmm0
      ee7176:	b8 00 00 80 3f       	mov    eax,0x3f800000
      ee717b:	89 83 90 00 00 00    	mov    DWORD PTR [rbx+0x90],eax
      ee7181:	c6 83 98 00 00 00 01 	mov    BYTE PTR [rbx+0x98],0x1
      ee7188:	4c 8d a3 a0 00 00 00 	lea    r12,[rbx+0xa0]
      ee718f:	4c 89 a3 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],r12
      ee7196:	4c 89 a3 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],r12
- 0xee9fd4 from 0xee9fae..0xeea0bc
      ee9fb7:	4d 89 c5             	mov    r13,r8
      ee9fba:	49 89 cf             	mov    r15,rcx
      ee9fbd:	48 89 fb             	mov    rbx,rdi
      ee9fc0:	66 c7 07 1c 00       	mov    WORD PTR [rdi],0x1c
      ee9fc5:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
      ee9fc9:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx
      ee9fcd:	4c 8d 77 18          	lea    r14,[rdi+0x18]
      ee9fd1:	4c 89 f7             	mov    rdi,r14
      ee9fd4:	e8 b5 e2 c3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ee9fd9:	0f 57 c0             	xorps  xmm0,xmm0
      ee9fdc:	0f 11 83 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm0
      ee9fe3:	0f 11 43 70          	movups XMMWORD PTR [rbx+0x70],xmm0
      ee9fe7:	b8 00 00 80 3f       	mov    eax,0x3f800000
      ee9fec:	89 83 90 00 00 00    	mov    DWORD PTR [rbx+0x90],eax
      ee9ff2:	c6 83 98 00 00 00 01 	mov    BYTE PTR [rbx+0x98],0x1
      ee9ff9:	4c 8d a3 a0 00 00 00 	lea    r12,[rbx+0xa0]
      eea000:	4c 89 a3 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],r12
      eea007:	4c 89 a3 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],r12
- 0xef939e from 0xef91cc..0xefe62b
      ef937c:	4c 89 e6             	mov    rsi,r12
      ef937f:	e8 be f2 3c 00       	call   12c8642 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dbc6>
      ef9384:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]
      ef938b:	00 
      ef938c:	49 89 5d 20          	mov    QWORD PTR [r13+0x20],rbx
      ef9390:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9394:	66 41 0f 7f 47 20    	movdqa XMMWORD PTR [r15+0x20],xmm0
      ef939a:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      ef939e:	e8 eb ee c2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ef93a3:	31 c0                	xor    eax,eax
      ef93a5:	41 88 87 88 00 00 00 	mov    BYTE PTR [r15+0x88],al
      ef93ac:	41 88 87 a0 04 00 00 	mov    BYTE PTR [r15+0x4a0],al
      ef93b3:	4c 89 ff             	mov    rdi,r15
      ef93b6:	48 81 c7 b0 04 00 00 	add    rdi,0x4b0
      ef93bd:	4c 89 ee             	mov    rsi,r13
      ef93c0:	e8 e3 54 00 00       	call   efe8a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5cbe>
      ef93c5:	66 0f ef c0          	pxor   xmm0,xmm0
      ef93c9:	66 41 0f 7f 87 e0 04 	movdqa XMMWORD PTR [r15+0x4e0],xmm0
- 0xfeffb8 from 0xfefefd..0xff028e
      feff8e:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      feff93:	4c 89 f6             	mov    rsi,r14
      feff96:	e8 f5 a2 a8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      feff9b:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
      feffa2:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
      feffa7:	e8 ea 51 e1 ff       	call   e05196 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd221c>
      feffac:	48 8d bb f8 00 00 00 	lea    rdi,[rbx+0xf8]
      feffb3:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      feffb8:	e8 d1 82 b3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      feffbd:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]
      feffc4:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      feffc9:	e8 28 9a 7e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      feffce:	48 8d ab 60 01 00 00 	lea    rbp,[rbx+0x160]
      feffd5:	48 89 ef             	mov    rdi,rbp
      feffd8:	e8 19 9a 7e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      feffdd:	4c 8d b3 70 01 00 00 	lea    r14,[rbx+0x170]
      feffe4:	4c 89 f7             	mov    rdi,r14
      feffe7:	e8 0a 9a 7e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
- 0x1040a95 from 0x10409b6..0x1040cd6
     1040a6b:	31 ff                	xor    edi,edi
     1040a6d:	e8 14 da a5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1040a72:	66 c7 83 00 03 00 00 	mov    WORD PTR [rbx+0x300],0x100
     1040a79:	00 01 
     1040a7b:	4c 89 a3 08 03 00 00 	mov    QWORD PTR [rbx+0x308],r12
     1040a82:	4c 89 b3 10 03 00 00 	mov    QWORD PTR [rbx+0x310],r14
     1040a89:	48 8d bb 18 03 00 00 	lea    rdi,[rbx+0x318]
     1040a90:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     1040a95:	e8 f4 77 ae ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1040a9a:	4c 8d ab 70 03 00 00 	lea    r13,[rbx+0x370]
     1040aa1:	0f 57 c0             	xorps  xmm0,xmm0
     1040aa4:	0f 11 83 80 03 00 00 	movups XMMWORD PTR [rbx+0x380],xmm0
     1040aab:	0f 11 83 70 03 00 00 	movups XMMWORD PTR [rbx+0x370],xmm0
     1040ab2:	b8 00 00 80 3f       	mov    eax,0x3f800000
     1040ab7:	89 83 90 03 00 00    	mov    DWORD PTR [rbx+0x390],eax
     1040abd:	c6 83 98 03 00 00 01 	mov    BYTE PTR [rbx+0x398],0x1
     1040ac4:	48 8d ab a0 03 00 00 	lea    rbp,[rbx+0x3a0]
     1040acb:	48 89 ab a0 03 00 00 	mov    QWORD PTR [rbx+0x3a0],rbp
- 0x10430b7 from 0x104308c..0x1043199
     104309a:	4d 89 c5             	mov    r13,r8
     104309d:	48 89 cd             	mov    rbp,rcx
     10430a0:	48 89 fb             	mov    rbx,rdi
     10430a3:	66 c7 07 f9 00       	mov    WORD PTR [rdi],0xf9
     10430a8:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
     10430ac:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx
     10430b0:	4c 8d 77 18          	lea    r14,[rdi+0x18]
     10430b4:	4c 89 f7             	mov    rdi,r14
     10430b7:	e8 d2 51 ae ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10430bc:	48 8d 43 70          	lea    rax,[rbx+0x70]
     10430c0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     10430c4:	0f 57 c0             	xorps  xmm0,xmm0
     10430c7:	0f 11 83 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm0
     10430ce:	0f 11 43 70          	movups XMMWORD PTR [rbx+0x70],xmm0
     10430d2:	b8 00 00 80 3f       	mov    eax,0x3f800000
     10430d7:	89 83 90 00 00 00    	mov    DWORD PTR [rbx+0x90],eax
     10430dd:	c6 83 98 00 00 00 01 	mov    BYTE PTR [rbx+0x98],0x1
     10430e4:	4c 8d a3 a0 00 00 00 	lea    r12,[rbx+0xa0]
- 0x1045daf from 0x104577a..0x10470ec
     1045d8a:	00 
     1045d8b:	f3 41 0f 7f 87 80 00 	movdqu XMMWORD PTR [r15+0x80],xmm0
     1045d92:	00 00 
     1045d94:	f3 41 0f 7f 87 90 00 	movdqu XMMWORD PTR [r15+0x90],xmm0
     1045d9b:	00 00 
     1045d9d:	41 c7 87 a8 00 00 00 	mov    DWORD PTR [r15+0xa8],0x3f800000
     1045da4:	00 00 80 3f 
     1045da8:	49 8d bf b0 00 00 00 	lea    rdi,[r15+0xb0]
     1045daf:	e8 da 24 ae ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1045db4:	4c 89 ff             	mov    rdi,r15
     1045db7:	48 81 c7 08 01 00 00 	add    rdi,0x108
     1045dbe:	e8 cb 24 ae ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1045dc3:	66 0f ef c0          	pxor   xmm0,xmm0
     1045dc7:	f3 41 0f 7f 87 60 01 	movdqu XMMWORD PTR [r15+0x160],xmm0
     1045dce:	00 00 
     1045dd0:	49 83 a7 70 01 00 00 	and    QWORD PTR [r15+0x170],0x0
     1045dd7:	00 
     1045dd8:	4c 89 f7             	mov    rdi,r14
- 0x1045dbe from 0x104577a..0x10470ec
     1045d94:	f3 41 0f 7f 87 90 00 	movdqu XMMWORD PTR [r15+0x90],xmm0
     1045d9b:	00 00 
     1045d9d:	41 c7 87 a8 00 00 00 	mov    DWORD PTR [r15+0xa8],0x3f800000
     1045da4:	00 00 80 3f 
     1045da8:	49 8d bf b0 00 00 00 	lea    rdi,[r15+0xb0]
     1045daf:	e8 da 24 ae ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1045db4:	4c 89 ff             	mov    rdi,r15
     1045db7:	48 81 c7 08 01 00 00 	add    rdi,0x108
     1045dbe:	e8 cb 24 ae ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1045dc3:	66 0f ef c0          	pxor   xmm0,xmm0
     1045dc7:	f3 41 0f 7f 87 60 01 	movdqu XMMWORD PTR [r15+0x160],xmm0
     1045dce:	00 00 
     1045dd0:	49 83 a7 70 01 00 00 	and    QWORD PTR [r15+0x170],0x0
     1045dd7:	00 
     1045dd8:	4c 89 f7             	mov    rdi,r14
     1045ddb:	e8 d4 db a7 ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
     1045de0:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     1045de7:	00 
- 0x104df85 from 0x104de6c..0x104e14e
     104df64:	bf 30 01 00 00       	mov    edi,0x130
     104df69:	e8 92 ff 79 00       	call   17edf00 <_Znwm@plt>
     104df6e:	48 89 c5             	mov    rbp,rax
     104df71:	66 c7 00 04 00       	mov    WORD PTR [rax],0x4
     104df76:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     104df7a:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
     104df7e:	4c 8d 70 18          	lea    r14,[rax+0x18]
     104df82:	4c 89 f7             	mov    rdi,r14
     104df85:	e8 04 a3 ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     104df8a:	48 8d 45 70          	lea    rax,[rbp+0x70]
     104df8e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     104df93:	0f 57 c0             	xorps  xmm0,xmm0
     104df96:	0f 11 85 80 00 00 00 	movups XMMWORD PTR [rbp+0x80],xmm0
     104df9d:	0f 11 45 70          	movups XMMWORD PTR [rbp+0x70],xmm0
     104dfa1:	b8 00 00 80 3f       	mov    eax,0x3f800000
     104dfa6:	89 85 90 00 00 00    	mov    DWORD PTR [rbp+0x90],eax
     104dfac:	c6 85 98 00 00 00 01 	mov    BYTE PTR [rbp+0x98],0x1
     104dfb3:	4c 8d a5 a0 00 00 00 	lea    r12,[rbp+0xa0]
- 0x10514f8 from 0x1051456..0x10516ad
     10514d7:	74 05                	je     10514de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2188f4>
     10514d9:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     10514de:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     10514e2:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     10514e7:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     10514ec:	e8 63 9e cb ff       	call   d0b354 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2582f4>
     10514f1:	4c 8d 6b 40          	lea    r13,[rbx+0x40]
     10514f5:	4c 89 ef             	mov    rdi,r13
     10514f8:	e8 91 6d ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10514fd:	48 8d ab 98 00 00 00 	lea    rbp,[rbx+0x98]
     1051504:	48 89 ef             	mov    rdi,rbp
     1051507:	e8 82 6d ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     105150c:	4c 8d a3 f8 00 00 00 	lea    r12,[rbx+0xf8]
     1051513:	0f 57 c0             	xorps  xmm0,xmm0
     1051516:	0f 11 83 f8 00 00 00 	movups XMMWORD PTR [rbx+0xf8],xmm0
     105151d:	4c 89 a3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r12
     1051524:	4c 8d b3 10 01 00 00 	lea    r14,[rbx+0x110]
     105152b:	0f 29 83 10 01 00 00 	movaps XMMWORD PTR [rbx+0x110],xmm0
- 0x1051507 from 0x1051456..0x10516ad
     10514e2:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     10514e7:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     10514ec:	e8 63 9e cb ff       	call   d0b354 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2582f4>
     10514f1:	4c 8d 6b 40          	lea    r13,[rbx+0x40]
     10514f5:	4c 89 ef             	mov    rdi,r13
     10514f8:	e8 91 6d ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10514fd:	48 8d ab 98 00 00 00 	lea    rbp,[rbx+0x98]
     1051504:	48 89 ef             	mov    rdi,rbp
     1051507:	e8 82 6d ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     105150c:	4c 8d a3 f8 00 00 00 	lea    r12,[rbx+0xf8]
     1051513:	0f 57 c0             	xorps  xmm0,xmm0
     1051516:	0f 11 83 f8 00 00 00 	movups XMMWORD PTR [rbx+0xf8],xmm0
     105151d:	4c 89 a3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r12
     1051524:	4c 8d b3 10 01 00 00 	lea    r14,[rbx+0x110]
     105152b:	0f 29 83 10 01 00 00 	movaps XMMWORD PTR [rbx+0x110],xmm0
     1051532:	4c 89 b3 08 01 00 00 	mov    QWORD PTR [rbx+0x108],r14
     1051539:	48 8d 83 20 01 00 00 	lea    rax,[rbx+0x120]
     1051540:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
- 0x1052d0c from 0x1052c40..0x1052e34
     1052ce9:	48 89 ea             	mov    rdx,rbp
     1052cec:	31 c9                	xor    ecx,ecx
     1052cee:	e8 bb f5 56 00       	call   15c22ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407832>
     1052cf3:	48 89 ef             	mov    rdi,rbp
     1052cf6:	e8 6f 72 a2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1052cfb:	49 89 9f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rbx
     1052d02:	4d 8d af 88 00 00 00 	lea    r13,[r15+0x88]
     1052d09:	4c 89 ef             	mov    rdi,r13
     1052d0c:	e8 7d 55 ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1052d11:	49 8d af e0 00 00 00 	lea    rbp,[r15+0xe0]
     1052d18:	48 89 ef             	mov    rdi,rbp
     1052d1b:	e8 6e 55 ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1052d20:	49 8b 9f 80 00 00 00 	mov    rbx,QWORD PTR [r15+0x80]
     1052d27:	4c 8d 44 24 28       	lea    r8,[rsp+0x28]
     1052d2c:	4d 89 38             	mov    QWORD PTR [r8],r15
     1052d2f:	48 8d 35 5b a3 a4 ff 	lea    rsi,[rip+0xffffffffffa4a35b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     1052d36:	48 8d 0d f7 00 00 00 	lea    rcx,[rip+0xf7]        # 1052e34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21a24a>
     1052d3d:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
- 0x1052d1b from 0x1052c40..0x1052e34
     1052cf3:	48 89 ef             	mov    rdi,rbp
     1052cf6:	e8 6f 72 a2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1052cfb:	49 89 9f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rbx
     1052d02:	4d 8d af 88 00 00 00 	lea    r13,[r15+0x88]
     1052d09:	4c 89 ef             	mov    rdi,r13
     1052d0c:	e8 7d 55 ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1052d11:	49 8d af e0 00 00 00 	lea    rbp,[r15+0xe0]
     1052d18:	48 89 ef             	mov    rdi,rbp
     1052d1b:	e8 6e 55 ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1052d20:	49 8b 9f 80 00 00 00 	mov    rbx,QWORD PTR [r15+0x80]
     1052d27:	4c 8d 44 24 28       	lea    r8,[rsp+0x28]
     1052d2c:	4d 89 38             	mov    QWORD PTR [r8],r15
     1052d2f:	48 8d 35 5b a3 a4 ff 	lea    rsi,[rip+0xffffffffffa4a35b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     1052d36:	48 8d 0d f7 00 00 00 	lea    rcx,[rip+0xf7]        # 1052e34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21a24a>
     1052d3d:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
     1052d42:	6a 08                	push   0x8
     1052d44:	41 59                	pop    r9
     1052d46:	4c 89 e7             	mov    rdi,r12
- 0x1057e2f from 0x10575d6..0x1058f3c
     1057e05:	48 89 de             	mov    rsi,rbx
     1057e08:	e8 b5 98 76 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1057e0d:	49 8d bd 18 15 00 00 	lea    rdi,[r13+0x1518]
     1057e14:	48 89 de             	mov    rsi,rbx
     1057e17:	e8 a6 98 76 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1057e1c:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     1057e21:	49 89 85 28 15 00 00 	mov    QWORD PTR [r13+0x1528],rax
     1057e28:	49 8d bd 30 15 00 00 	lea    rdi,[r13+0x1530]
     1057e2f:	e8 5a 04 ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1057e34:	4c 89 ef             	mov    rdi,r13
     1057e37:	48 81 c7 88 15 00 00 	add    rdi,0x1588
     1057e3e:	e8 53 d3 da ff       	call   e05196 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd221c>
     1057e43:	4c 89 e7             	mov    rdi,r12
     1057e46:	e8 d3 3b e2 ff       	call   e7ba1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42e34>
     1057e4b:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     1057e52:	00 
     1057e53:	e8 12 21 a2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1057e58:	31 ff                	xor    edi,edi
- 0x1057fc4 from 0x10575d6..0x1058f3c
     1057f9c:	41 c6 87 00 06 00 00 	mov    BYTE PTR [r15+0x600],0x1
     1057fa3:	01 
     1057fa4:	49 8d bf 08 06 00 00 	lea    rdi,[r15+0x608]
     1057fab:	e8 fc 0f 00 00       	call   1058fac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2203c2>
     1057fb0:	41 83 a7 18 06 00 00 	and    DWORD PTR [r15+0x618],0x0
     1057fb7:	00 
     1057fb8:	49 8d bf 20 06 00 00 	lea    rdi,[r15+0x620]
     1057fbf:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1057fc4:	e8 c5 02 ad ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1057fc9:	49 8d bf 78 06 00 00 	lea    rdi,[r15+0x678]
     1057fd0:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
     1057fd5:	e8 bc d1 da ff       	call   e05196 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd221c>
     1057fda:	31 db                	xor    ebx,ebx
     1057fdc:	41 88 9f d0 06 00 00 	mov    BYTE PTR [r15+0x6d0],bl
     1057fe3:	41 88 9f e8 06 00 00 	mov    BYTE PTR [r15+0x6e8],bl
     1057fea:	49 8d bf f0 06 00 00 	lea    rdi,[r15+0x6f0]
     1057ff1:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
     1057ff6:	e8 25 2f 62 00       	call   167af20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f08c>
- 0x105876e from 0x10575d6..0x1058f3c
     105874a:	e8 eb 66 a7 ff       	call   acee3a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bdda>
     105874f:	41 88 5d 40          	mov    BYTE PTR [r13+0x40],bl
     1058753:	49 8d 45 50          	lea    rax,[r13+0x50]
     1058757:	66 0f ef c0          	pxor   xmm0,xmm0
     105875b:	66 41 0f 7f 45 50    	movdqa XMMWORD PTR [r13+0x50],xmm0
     1058761:	49 89 45 48          	mov    QWORD PTR [r13+0x48],rax
     1058765:	49 8d 7d 60          	lea    rdi,[r13+0x60]
     1058769:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     105876e:	e8 1b fb ac ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1058773:	49 8d bd b8 00 00 00 	lea    rdi,[r13+0xb8]
     105877a:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
     105877f:	e8 12 ca da ff       	call   e05196 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd221c>
     1058784:	49 83 a5 30 01 00 00 	and    QWORD PTR [r13+0x130],0x0
     105878b:	00 
     105878c:	49 83 a5 60 01 00 00 	and    QWORD PTR [r13+0x160],0x0
     1058793:	00 
     1058794:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     105879b:	00 
- 0x106f618 from 0x106f5a4..0x106f755
     106f5f3:	4c 89 ff             	mov    rdi,r15
     106f5f6:	e8 5b 01 00 00       	call   106f756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236b6c>
     106f5fb:	4d 8d 66 08          	lea    r12,[r14+0x8]
     106f5ff:	48 8d 05 da 6c 7f 00 	lea    rax,[rip+0x7f6cda]        # 18662e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x229c8>
     106f606:	49 89 06             	mov    QWORD PTR [r14],rax
     106f609:	48 8d 05 b0 6d 7f 00 	lea    rax,[rip+0x7f6db0]        # 18663c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22aa8>
     106f610:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     106f614:	49 8d 7e 10          	lea    rdi,[r14+0x10]
     106f618:	e8 71 8c ab ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     106f61d:	49 8d 7e 68          	lea    rdi,[r14+0x68]
     106f621:	e8 68 8c ab ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     106f626:	49 8d be c0 00 00 00 	lea    rdi,[r14+0xc0]
     106f62d:	4c 89 fe             	mov    rsi,r15
     106f630:	e8 21 01 00 00       	call   106f756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236b6c>
     106f635:	4c 89 f7             	mov    rdi,r14
     106f638:	48 81 c7 a8 01 00 00 	add    rdi,0x1a8
     106f63f:	0f 57 c0             	xorps  xmm0,xmm0
     106f642:	41 0f 11 86 98 01 00 	movups XMMWORD PTR [r14+0x198],xmm0
- 0x106f621 from 0x106f5a4..0x106f755
     106f5fb:	4d 8d 66 08          	lea    r12,[r14+0x8]
     106f5ff:	48 8d 05 da 6c 7f 00 	lea    rax,[rip+0x7f6cda]        # 18662e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x229c8>
     106f606:	49 89 06             	mov    QWORD PTR [r14],rax
     106f609:	48 8d 05 b0 6d 7f 00 	lea    rax,[rip+0x7f6db0]        # 18663c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22aa8>
     106f610:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     106f614:	49 8d 7e 10          	lea    rdi,[r14+0x10]
     106f618:	e8 71 8c ab ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     106f61d:	49 8d 7e 68          	lea    rdi,[r14+0x68]
     106f621:	e8 68 8c ab ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     106f626:	49 8d be c0 00 00 00 	lea    rdi,[r14+0xc0]
     106f62d:	4c 89 fe             	mov    rsi,r15
     106f630:	e8 21 01 00 00       	call   106f756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236b6c>
     106f635:	4c 89 f7             	mov    rdi,r14
     106f638:	48 81 c7 a8 01 00 00 	add    rdi,0x1a8
     106f63f:	0f 57 c0             	xorps  xmm0,xmm0
     106f642:	41 0f 11 86 98 01 00 	movups XMMWORD PTR [r14+0x198],xmm0
     106f649:	00 
     106f64a:	41 0f 11 86 88 01 00 	movups XMMWORD PTR [r14+0x188],xmm0
- 0x107b692 from 0x107a02c..0x107e484
     107b66d:	f3 0f 7f 83 c8 00 00 	movdqu XMMWORD PTR [rbx+0xc8],xmm0
     107b674:	00 
     107b675:	48 83 a3 d8 00 00 00 	and    QWORD PTR [rbx+0xd8],0x0
     107b67c:	00 
     107b67d:	48 8d 05 7c 11 79 00 	lea    rax,[rip+0x79117c]        # 180c800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x24c0>
     107b684:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     107b688:	48 89 df             	mov    rdi,rbx
     107b68b:	48 81 c7 e8 00 00 00 	add    rdi,0xe8
     107b692:	e8 f7 cb aa ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     107b697:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
     107b69e:	00 
     107b69f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     107b6a2:	48 89 18             	mov    QWORD PTR [rax],rbx
     107b6a5:	48 85 ff             	test   rdi,rdi
     107b6a8:	74 06                	je     107b6b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x242ac6>
     107b6aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107b6ad:	ff 50 08             	call   QWORD PTR [rax+0x8]
     107b6b0:	48 8b bc 24 18 04 00 	mov    rdi,QWORD PTR [rsp+0x418]
- 0x1088732 from 0x108853a..0x1088f91
     108870a:	48 8d 7d 60          	lea    rdi,[rbp+0x60]
     108870e:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
     1088713:	e8 de 12 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1088718:	48 8d 7d 70          	lea    rdi,[rbp+0x70]
     108871c:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     1088721:	e8 d0 12 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1088726:	48 8d bd 80 00 00 00 	lea    rdi,[rbp+0x80]
     108872d:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     1088732:	e8 57 fb a9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1088737:	48 8d bd d8 00 00 00 	lea    rdi,[rbp+0xd8]
     108873e:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1088743:	e8 88 08 00 00       	call   1088fd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2503e6>
     1088748:	0f 57 c0             	xorps  xmm0,xmm0
     108874b:	0f 11 85 40 07 00 00 	movups XMMWORD PTR [rbp+0x740],xmm0
     1088752:	0f 11 85 30 07 00 00 	movups XMMWORD PTR [rbp+0x730],xmm0
     1088759:	0f 11 85 20 07 00 00 	movups XMMWORD PTR [rbp+0x720],xmm0
     1088760:	0f 11 85 10 07 00 00 	movups XMMWORD PTR [rbp+0x710],xmm0
     1088767:	48 83 a5 50 07 00 00 	and    QWORD PTR [rbp+0x750],0x0
- 0x1088a57 from 0x108853a..0x1088f91
     1088a2b:	49 8d bf 80 00 00 00 	lea    rdi,[r15+0x80]
     1088a32:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     1088a37:	e8 ba 0f 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1088a3c:	4d 8d b7 90 00 00 00 	lea    r14,[r15+0x90]
     1088a43:	4c 89 f7             	mov    rdi,r14
     1088a46:	e8 ab 0f 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1088a4b:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
     1088a52:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
     1088a57:	e8 32 f8 a9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1088a5c:	0f 57 c0             	xorps  xmm0,xmm0
     1088a5f:	41 0f 11 87 01 01 00 	movups XMMWORD PTR [r15+0x101],xmm0
     1088a66:	00 
     1088a67:	41 0f 11 87 f8 00 00 	movups XMMWORD PTR [r15+0xf8],xmm0
     1088a6e:	00 
     1088a6f:	41 0f 11 87 18 01 00 	movups XMMWORD PTR [r15+0x118],xmm0
     1088a76:	00 
     1088a77:	41 0f 11 87 28 01 00 	movups XMMWORD PTR [r15+0x128],xmm0
     1088a7e:	00 
- 0x10997fc from 0x109917a..0x1099d71
     10997da:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     10997dd:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     10997e2:	e8 a9 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10997e7:	0f 57 c0             	xorps  xmm0,xmm0
     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f1:	00 
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997f9:	48 89 df             	mov    rdi,rbx
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
     1099808:	4c 89 f7             	mov    rdi,r14
     109980b:	e8 7e ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099810:	4d 8d bd c8 04 00 00 	lea    r15,[r13+0x4c8]
     1099817:	4c 89 ff             	mov    rdi,r15
     109981a:	e8 0b bf ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     109981f:	4c 89 ef             	mov    rdi,r13
     1099822:	e8 19 7c 00 00       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     1099827:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
- 0x109980b from 0x109917a..0x1099d71
     10997e7:	0f 57 c0             	xorps  xmm0,xmm0
     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f1:	00 
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997f9:	48 89 df             	mov    rdi,rbx
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
     1099808:	4c 89 f7             	mov    rdi,r14
     109980b:	e8 7e ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099810:	4d 8d bd c8 04 00 00 	lea    r15,[r13+0x4c8]
     1099817:	4c 89 ff             	mov    rdi,r15
     109981a:	e8 0b bf ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     109981f:	4c 89 ef             	mov    rdi,r13
     1099822:	e8 19 7c 00 00       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     1099827:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     109982b:	4c 89 6d 00          	mov    QWORD PTR [rbp+0x0],r13
     109982f:	48 85 ff             	test   rdi,rdi
     1099832:	74 06                	je     109983a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260c50>
- 0x10ac7c0 from 0x10aba36..0x10adc15
     10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
     10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
     10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
     10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
     10ac7b3:	00 00 01 
     10ac7b6:	4c 89 f7             	mov    rdi,r14
     10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
     10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10ac7c5:	4c 89 ef             	mov    rdi,r13
     10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
     10ac7cd:	4c 89 ff             	mov    rdi,r15
     10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
     10ac7e0:	48 85 ff             	test   rdi,rdi
     10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
- 0x10aca73 from 0x10aba36..0x10adc15
     10aca4c:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
     10aca51:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
     10aca58:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
     10aca5c:	e8 61 4c 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     10aca61:	41 c6 86 98 00 00 00 	mov    BYTE PTR [r14+0x98],0x0
     10aca68:	00 
     10aca69:	4c 89 f7             	mov    rdi,r14
     10aca6c:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
     10aca73:	e8 16 b8 a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10aca78:	41 83 fd 07          	cmp    r13d,0x7
     10aca7c:	72 22                	jb     10acaa0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273eb6>
     10aca7e:	48 8d 35 f7 54 3a ff 	lea    rsi,[rip+0xffffffffff3a54f7]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     10aca85:	48 8d 0d eb 74 29 ff 	lea    rcx,[rip+0xffffffffff2974eb]        # 343f77 <_ZTSSt12bad_any_cast@@Base-0x4c251>
     10aca8c:	6a 03                	push   0x3
     10aca8e:	5f                   	pop    rdi
     10aca8f:	6a 4b                	push   0x4b
     10aca91:	5a                   	pop    rdx
     10aca92:	6a 06                	push   0x6
- 0x10ad29b from 0x10aba36..0x10adc15
     10ad26f:	48 83 a5 b8 00 00 00 	and    QWORD PTR [rbp+0xb8],0x0
     10ad276:	00 
     10ad277:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
     10ad27e:	0f 11 85 a8 00 00 00 	movups XMMWORD PTR [rbp+0xa8],xmm0
     10ad285:	c7 85 c0 00 00 00 00 	mov    DWORD PTR [rbp+0xc0],0x3f800000
     10ad28c:	00 80 3f 
     10ad28f:	48 8d bd c8 00 00 00 	lea    rdi,[rbp+0xc8]
     10ad296:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     10ad29b:	e8 ee af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10ad2a0:	48 8d bd 20 01 00 00 	lea    rdi,[rbp+0x120]
     10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
     10ad2ac:	e8 dd af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]
     10ad2b8:	4c 89 f7             	mov    rdi,r14
     10ad2bb:	e8 36 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]
     10ad2c7:	4c 89 ef             	mov    rdi,r13
     10ad2ca:	e8 27 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
- 0x10ad2ac from 0x10aba36..0x10adc15
     10ad27e:	0f 11 85 a8 00 00 00 	movups XMMWORD PTR [rbp+0xa8],xmm0
     10ad285:	c7 85 c0 00 00 00 00 	mov    DWORD PTR [rbp+0xc0],0x3f800000
     10ad28c:	00 80 3f 
     10ad28f:	48 8d bd c8 00 00 00 	lea    rdi,[rbp+0xc8]
     10ad296:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     10ad29b:	e8 ee af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10ad2a0:	48 8d bd 20 01 00 00 	lea    rdi,[rbp+0x120]
     10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
     10ad2ac:	e8 dd af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]
     10ad2b8:	4c 89 f7             	mov    rdi,r14
     10ad2bb:	e8 36 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]
     10ad2c7:	4c 89 ef             	mov    rdi,r13
     10ad2ca:	e8 27 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     10ad2cf:	8a 45 5e             	mov    al,BYTE PTR [rbp+0x5e]
     10ad2d2:	86 05 68 3e 94 00    	xchg   BYTE PTR [rip+0x943e68],al        # 19f1140 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2870>
     10ad2d8:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]
- 0x10d221c from 0x10d0e58..0x10d4cf6
     10d21ef:	88 85 b8 00 00 00    	mov    BYTE PTR [rbp+0xb8],al
     10d21f5:	48 8d bd c0 00 00 00 	lea    rdi,[rbp+0xc0]
     10d21fc:	e8 01 7c 70 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     10d2201:	4c 8d 75 50          	lea    r14,[rbp+0x50]
     10d2205:	4c 8d 6d 58          	lea    r13,[rbp+0x58]
     10d2209:	48 8d 85 80 00 00 00 	lea    rax,[rbp+0x80]
     10d2210:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10d2215:	48 8d bd 18 01 00 00 	lea    rdi,[rbp+0x118]
     10d221c:	e8 6d 60 a5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10d2221:	4c 89 b4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r14
     10d2228:	00 
     10d2229:	4c 89 b5 70 01 00 00 	mov    QWORD PTR [rbp+0x170],r14
     10d2230:	4c 89 ad 78 01 00 00 	mov    QWORD PTR [rbp+0x178],r13
     10d2237:	48 8b 84 24 78 05 00 	mov    rax,QWORD PTR [rsp+0x578]
     10d223e:	00 
     10d223f:	48 89 85 80 01 00 00 	mov    QWORD PTR [rbp+0x180],rax
     10d2246:	44 88 bd 88 01 00 00 	mov    BYTE PTR [rbp+0x188],r15b
     10d224d:	44 89 a5 8c 01 00 00 	mov    DWORD PTR [rbp+0x18c],r12d
- 0x10d27a1 from 0x10d0e58..0x10d4cf6
     10d276d:	8b 9c 24 ac 02 00 00 	mov    ebx,DWORD PTR [rsp+0x2ac]
     10d2774:	48 8d 05 bd d5 77 00 	lea    rax,[rip+0x77d5bd]        # 184fd38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xc420>
     10d277b:	48 89 85 e0 05 00 00 	mov    QWORD PTR [rbp+0x5e0],rax
     10d2782:	48 8d bd e8 05 00 00 	lea    rdi,[rbp+0x5e8]
     10d2789:	e8 74 76 70 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     10d278e:	48 8d 85 e0 05 00 00 	lea    rax,[rbp+0x5e0]
     10d2795:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     10d279a:	48 8d bd 40 06 00 00 	lea    rdi,[rbp+0x640]
     10d27a1:	e8 e8 5a a5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10d27a6:	83 a5 98 06 00 00 00 	and    DWORD PTR [rbp+0x698],0x0
     10d27ad:	89 9d 9c 06 00 00    	mov    DWORD PTR [rbp+0x69c],ebx
     10d27b3:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
     10d27b7:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     10d27bc:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
     10d27c0:	48 8d 0d a9 d5 77 00 	lea    rcx,[rip+0x77d5a9]        # 184fd70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xc458>
     10d27c7:	48 89 8d a0 06 00 00 	mov    QWORD PTR [rbp+0x6a0],rcx
     10d27ce:	48 8d 0d 3b d6 77 00 	lea    rcx,[rip+0x77d63b]        # 184fe10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xc4f8>
     10d27d5:	48 89 8d a8 06 00 00 	mov    QWORD PTR [rbp+0x6a8],rcx
- 0x10d28b7 from 0x10d0e58..0x10d4cf6
     10d2892:	e8 a7 71 70 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     10d2897:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     10d289b:	e8 e6 bb 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d28a0:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
     10d28a7:	00 
     10d28a8:	e8 3b 7f 70 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     10d28ad:	48 8d 9d e8 06 00 00 	lea    rbx,[rbp+0x6e8]
     10d28b4:	48 89 df             	mov    rdi,rbx
     10d28b7:	e8 d2 59 a5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10d28bc:	4c 8d ad 40 07 00 00 	lea    r13,[rbp+0x740]
     10d28c3:	4c 89 ef             	mov    rdi,r13
     10d28c6:	e8 77 8f c5 ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
     10d28cb:	4c 8b bd b8 06 00 00 	mov    r15,QWORD PTR [rbp+0x6b8]
     10d28d2:	4c 8d 84 24 70 03 00 	lea    r8,[rsp+0x370]
     10d28d9:	00 
     10d28da:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     10d28e1:	00 
     10d28e2:	4d 89 20             	mov    QWORD PTR [r8],r12
- 0x10d3217 from 0x10d0e58..0x10d4cf6
     10d31f2:	49 89 06             	mov    QWORD PTR [r14],rax
     10d31f5:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     10d31f9:	48 8d 05 90 bf 77 00 	lea    rax,[rip+0x77bf90]        # 184f190 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb878>
     10d3200:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     10d3204:	48 8d 05 d5 bf 77 00 	lea    rax,[rip+0x77bfd5]        # 184f1e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb8c8>
     10d320b:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     10d320f:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
     10d3213:	49 8d 7e 30          	lea    rdi,[r14+0x30]
     10d3217:	e8 72 50 a5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     10d321c:	48 8d b4 24 50 04 00 	lea    rsi,[rsp+0x450]
     10d3223:	00 
     10d3224:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     10d3228:	48 8d 05 b1 4b 90 ff 	lea    rax,[rip+0xffffffffff904bb1]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     10d322f:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     10d3233:	48 8d 05 1e 31 00 00 	lea    rax,[rip+0x311e]        # 10d6358 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d76e>
     10d323a:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     10d323e:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
     10d3245:	00 
- 0x113bbbd from 0x113b9b4..0x113be72
     113bb9e:	00 00 
     113bba0:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
     113bba5:	0f 29 8c 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm1
     113bbac:	00 
     113bbad:	48 83 a4 24 d0 00 00 	and    QWORD PTR [rsp+0xd0],0x0
     113bbb4:	00 00 
     113bbb6:	48 8d 5d 20          	lea    rbx,[rbp+0x20]
     113bbba:	48 89 df             	mov    rdi,rbx
     113bbbd:	e8 cc c6 9e ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     113bbc2:	48 8d 7d 78          	lea    rdi,[rbp+0x78]
     113bbc6:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     113bbca:	e8 33 e2 69 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     113bbcf:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
     113bbd4:	4c 89 e0             	mov    rax,r12
     113bbd7:	48 83 c0 08          	add    rax,0x8
     113bbdb:	48 89 85 d0 00 00 00 	mov    QWORD PTR [rbp+0xd0],rax
     113bbe2:	66 0f ef c0          	pxor   xmm0,xmm0
     113bbe6:	f3 0f 7f 85 d8 00 00 	movdqu XMMWORD PTR [rbp+0xd8],xmm0
- 0x1173a88 from 0x1173426..0x1173f64
     1173a68:	00 00 
     1173a6a:	49 83 a5 c0 00 00 00 	and    QWORD PTR [r13+0xc0],0x0
     1173a71:	00 
     1173a72:	48 8d 05 87 8d 69 00 	lea    rax,[rip+0x698d87]        # 180c800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x24c0>
     1173a79:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1173a7d:	4d 89 6f 40          	mov    QWORD PTR [r15+0x40],r13
     1173a81:	49 8d 5f 48          	lea    rbx,[r15+0x48]
     1173a85:	48 89 df             	mov    rdi,rbx
     1173a88:	e8 01 48 9b ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1173a8d:	66 41 83 a7 a0 00 00 	and    WORD PTR [r15+0xa0],0x0
     1173a94:	00 00 
     1173a96:	49 8d bf a8 00 00 00 	lea    rdi,[r15+0xa8]
     1173a9d:	e8 88 1c 9f ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     1173aa2:	48 8d 9c 24 e0 01 00 	lea    rbx,[rsp+0x1e0]
     1173aa9:	00 
     1173aaa:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1173aae:	4c 8b 6c 24 48       	mov    r13,QWORD PTR [rsp+0x48]
     1173ab3:	4c 89 ef             	mov    rdi,r13
- 0x11ac473 from 0x11ac42c..0x11ac490
     11ac451:	48 89 c7             	mov    rdi,rax
     11ac454:	e8 77 77 43 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
     11ac459:	48 8d 05 30 de 6a 00 	lea    rax,[rip+0x6ade30]        # 185a290 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16978>
     11ac460:	49 89 06             	mov    QWORD PTR [r14],rax
     11ac463:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
     11ac467:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     11ac46c:	4c 89 f7             	mov    rdi,r14
     11ac46f:	48 83 c7 30          	add    rdi,0x30
     11ac473:	e8 16 be 97 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11ac478:	4c 89 33             	mov    QWORD PTR [rbx],r14
     11ac47b:	48 89 d8             	mov    rax,rbx
     11ac47e:	48 83 c4 18          	add    rsp,0x18
     11ac482:	5b                   	pop    rbx
     11ac483:	41 5e                	pop    r14
     11ac485:	c3                   	ret
     11ac486:	eb 00                	jmp    11ac488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37389e>
     11ac488:	48 89 c7             	mov    rdi,rax
     11ac48b:	e8 15 d6 8c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
- 0x11ef889 from 0x11ef334..0x11f5af4
     11ef867:	00 
     11ef868:	4c 89 f7             	mov    rdi,r14
     11ef86b:	e8 f4 c8 05 00       	call   124c164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x916e8>
     11ef870:	4c 8d bb 68 01 00 00 	lea    r15,[rbx+0x168]
     11ef877:	4c 89 ff             	mov    rdi,r15
     11ef87a:	e8 71 93 07 00       	call   1268bf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae174>
     11ef87f:	4c 8d a3 c0 01 00 00 	lea    r12,[rbx+0x1c0]
     11ef886:	4c 89 e7             	mov    rdi,r12
     11ef889:	e8 00 8a 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11ef88e:	48 8d 83 18 02 00 00 	lea    rax,[rbx+0x218]
     11ef895:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ef89a:	31 c0                	xor    eax,eax
     11ef89c:	88 83 48 02 00 00    	mov    BYTE PTR [rbx+0x248],al
     11ef8a2:	66 0f ef c0          	pxor   xmm0,xmm0
     11ef8a6:	66 0f 7f 83 50 02 00 	movdqa XMMWORD PTR [rbx+0x250],xmm0
     11ef8ad:	00 
     11ef8ae:	66 0f 7f 83 60 02 00 	movdqa XMMWORD PTR [rbx+0x260],xmm0
     11ef8b5:	00 
- 0x11efae8 from 0x11ef334..0x11f5af4
     11efac8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     11efacc:	4d 89 6e 28          	mov    QWORD PTR [r14+0x28],r13
     11efad0:	41 0f 11 4e 30       	movups XMMWORD PTR [r14+0x30],xmm1
     11efad5:	4d 8d 7e 40          	lea    r15,[r14+0x40]
     11efad9:	4c 89 ff             	mov    rdi,r15
     11efadc:	e8 15 9f 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efae1:	4d 8d 66 50          	lea    r12,[r14+0x50]
     11efae5:	4c 89 e7             	mov    rdi,r12
     11efae8:	e8 a1 87 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11efaed:	4c 89 f7             	mov    rdi,r14
     11efaf0:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
     11efaf7:	e8 2e 5c 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     11efafc:	4c 8d bb d0 02 00 00 	lea    r15,[rbx+0x2d0]
     11efb03:	31 ed                	xor    ebp,ebp
     11efb05:	31 ff                	xor    edi,edi
     11efb07:	e8 7a e9 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11efb0c:	48 8d 05 35 fd 66 00 	lea    rax,[rip+0x66fd35]        # 185f848 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1bf30>
     11efb13:	48 89 83 d0 02 00 00 	mov    QWORD PTR [rbx+0x2d0],rax
- 0x11efb69 from 0x11ef334..0x11f5af4
     11efb43:	00 
     11efb44:	f3 0f 7f 83 f9 02 00 	movdqu XMMWORD PTR [rbx+0x2f9],xmm0
     11efb4b:	00 
     11efb4c:	48 8d bb 10 03 00 00 	lea    rdi,[rbx+0x310]
     11efb53:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     11efb58:	e8 93 90 07 00       	call   1268bf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae174>
     11efb5d:	48 8d bb 68 03 00 00 	lea    rdi,[rbx+0x368]
     11efb64:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     11efb69:	e8 20 87 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11efb6e:	48 8d bb c0 03 00 00 	lea    rdi,[rbx+0x3c0]
     11efb75:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     11efb7a:	e8 77 9e 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efb7f:	48 8d bb d0 03 00 00 	lea    rdi,[rbx+0x3d0]
     11efb86:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
     11efb8b:	e8 66 9e 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efb90:	4c 8d a3 e0 03 00 00 	lea    r12,[rbx+0x3e0]
     11efb97:	4c 89 e7             	mov    rdi,r12
     11efb9a:	e8 57 9e 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
- 0x11f026f from 0x11ef334..0x11f5af4
     11f0251:	e8 10 59 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f0256:	41 c7 46 28 3c 00 00 	mov    DWORD PTR [r14+0x28],0x3c
     11f025d:	00 
     11f025e:	31 c0                	xor    eax,eax
     11f0260:	41 88 46 30          	mov    BYTE PTR [r14+0x30],al
     11f0264:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
     11f0268:	4c 89 f7             	mov    rdi,r14
     11f026b:	48 83 c7 48          	add    rdi,0x48
     11f026f:	e8 1a 80 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0274:	4c 89 b4 24 50 05 00 	mov    QWORD PTR [rsp+0x550],r14
     11f027b:	00 
     11f027c:	4c 89 ff             	mov    rdi,r15
     11f027f:	e8 2a 59 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f0284:	4c 89 e7             	mov    rdi,r12
     11f0287:	e8 22 59 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f028c:	4c 8b bc 24 70 06 00 	mov    r15,QWORD PTR [rsp+0x670]
     11f0293:	00 
     11f0294:	49 8b 07             	mov    rax,QWORD PTR [r15]
- 0x11f0848 from 0x11ef334..0x11f5af4
     11f081f:	4c 89 ff             	mov    rdi,r15
     11f0822:	48 81 c7 38 01 00 00 	add    rdi,0x138
     11f0829:	f3 41 0f 7f 47 78    	movdqu XMMWORD PTR [r15+0x78],xmm0
     11f082f:	f3 41 0f 7f 87 88 00 	movdqu XMMWORD PTR [r15+0x88],xmm0
     11f0836:	00 00 
     11f0838:	f3 41 0f 7f 87 98 00 	movdqu XMMWORD PTR [r15+0x98],xmm0
     11f083f:	00 00 
     11f0841:	41 88 87 a8 00 00 00 	mov    BYTE PTR [r15+0xa8],al
     11f0848:	e8 41 7a 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f084d:	4c 89 e7             	mov    rdi,r12
     11f0850:	e8 3b d6 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f0855:	48 89 ef             	mov    rdi,rbp
     11f0858:	e8 f3 88 00 00       	call   11f9150 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6d4>
     11f085d:	4c 89 ef             	mov    rdi,r13
     11f0860:	e8 11 89 00 00       	call   11f9176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6fa>
     11f0865:	4c 89 bc 24 80 05 00 	mov    QWORD PTR [rsp+0x580],r15
     11f086c:	00 
     11f086d:	4c 89 f7             	mov    rdi,r14
- 0x11f0954 from 0x11ef334..0x11f5af4
     11f092d:	e8 b6 9e 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0932:	4c 89 f7             	mov    rdi,r14
     11f0935:	48 83 c7 60          	add    rdi,0x60
     11f0939:	66 0f ef c0          	pxor   xmm0,xmm0
     11f093d:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     11f0943:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
     11f0949:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     11f094f:	41 c6 46 58 00       	mov    BYTE PTR [r14+0x58],0x0
     11f0954:	e8 35 79 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0959:	4c 89 b4 24 98 01 00 	mov    QWORD PTR [rsp+0x198],r14
     11f0960:	00 
     11f0961:	31 ff                	xor    edi,edi
     11f0963:	e8 1e db 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0968:	bf b8 00 00 00       	mov    edi,0xb8
     11f096d:	e8 8e d5 5f 00       	call   17edf00 <_Znwm@plt>
     11f0972:	49 89 c7             	mov    r15,rax
     11f0975:	48 8b 84 24 80 05 00 	mov    rax,QWORD PTR [rsp+0x580]
     11f097c:	00 
- 0x11f0a52 from 0x11ef334..0x11f5af4
     11f0a2b:	e8 b8 9d 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0a30:	4c 89 ff             	mov    rdi,r15
     11f0a33:	48 83 c7 60          	add    rdi,0x60
     11f0a37:	66 0f ef c0          	pxor   xmm0,xmm0
     11f0a3b:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
     11f0a41:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
     11f0a47:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
     11f0a4d:	41 c6 47 58 00       	mov    BYTE PTR [r15+0x58],0x0
     11f0a52:	e8 37 78 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0a57:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f0a5e:	00 
     11f0a5f:	e8 3c 59 00 00       	call   11f63a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b924>
     11f0a64:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f0a6b:	00 
     11f0a6c:	e8 4f 59 00 00       	call   11f63c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b944>
     11f0a71:	4c 89 bb d0 0e 00 00 	mov    QWORD PTR [rbx+0xed0],r15
     11f0a78:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
     11f0a7f:	00 
- 0x11f0deb from 0x11ef334..0x11f5af4
     11f0dc1:	4c 89 fe             	mov    rsi,r15
     11f0dc4:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     11f0dca:	48 8d 83 70 11 00 00 	lea    rax,[rbx+0x1170]
     11f0dd1:	66 0f ef c0          	pxor   xmm0,xmm0
     11f0dd5:	66 0f 7f 83 70 11 00 	movdqa XMMWORD PTR [rbx+0x1170],xmm0
     11f0ddc:	00 
     11f0ddd:	48 89 83 68 11 00 00 	mov    QWORD PTR [rbx+0x1168],rax
     11f0de4:	48 8d bb 80 11 00 00 	lea    rdi,[rbx+0x1180]
     11f0deb:	e8 9e 74 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0df0:	48 8d bb d8 11 00 00 	lea    rdi,[rbx+0x11d8]
     11f0df7:	4c 8d b4 24 70 04 00 	lea    r14,[rsp+0x470]
     11f0dfe:	00 
     11f0dff:	4c 89 f6             	mov    rsi,r14
     11f0e02:	e8 53 e2 05 00       	call   124f05a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x945de>
     11f0e07:	4c 89 f7             	mov    rdi,r14
     11f0e0a:	e8 2d 56 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
     11f0e0f:	48 8d 35 a2 f5 15 ff 	lea    rsi,[rip+0xffffffffff15f5a2]        # 3503b8 <_ZTSSt12bad_any_cast@@Base-0x3fe10>
     11f0e16:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
- 0x11f0f8c from 0x11ef334..0x11f5af4
     11f0f68:	00 00 
     11f0f6a:	66 0f 7f 84 24 50 05 	movdqa XMMWORD PTR [rsp+0x550],xmm0
     11f0f71:	00 00 
     11f0f73:	48 8b 84 24 68 05 00 	mov    rax,QWORD PTR [rsp+0x568]
     11f0f7a:	00 
     11f0f7b:	48 89 83 88 12 00 00 	mov    QWORD PTR [rbx+0x1288],rax
     11f0f82:	4c 8d ab 90 12 00 00 	lea    r13,[rbx+0x1290]
     11f0f89:	4c 89 ef             	mov    rdi,r13
     11f0f8c:	e8 fd 72 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0f91:	48 8d ab e8 12 00 00 	lea    rbp,[rbx+0x12e8]
     11f0f98:	31 c0                	xor    eax,eax
     11f0f9a:	88 83 e8 12 00 00    	mov    BYTE PTR [rbx+0x12e8],al
     11f0fa0:	88 83 00 13 00 00    	mov    BYTE PTR [rbx+0x1300],al
     11f0fa6:	4c 8d a3 08 13 00 00 	lea    r12,[rbx+0x1308]
     11f0fad:	88 83 08 13 00 00    	mov    BYTE PTR [rbx+0x1308],al
     11f0fb3:	88 83 68 13 00 00    	mov    BYTE PTR [rbx+0x1368],al
     11f0fb9:	6a 30                	push   0x30
     11f0fbb:	5f                   	pop    rdi
- 0x11f11af from 0x11ef334..0x11f5af4
     11f118f:	00 
     11f1190:	66 0f 7f 83 f0 15 00 	movdqa XMMWORD PTR [rbx+0x15f0],xmm0
     11f1197:	00 
     11f1198:	66 0f 7f 83 00 16 00 	movdqa XMMWORD PTR [rbx+0x1600],xmm0
     11f119f:	00 
     11f11a0:	44 88 b3 10 16 00 00 	mov    BYTE PTR [rbx+0x1610],r14b
     11f11a7:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     11f11ae:	00 
     11f11af:	e8 da 70 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f11b4:	83 a3 90 16 00 00 00 	and    DWORD PTR [rbx+0x1690],0x0
     11f11bb:	48 89 ab 98 16 00 00 	mov    QWORD PTR [rbx+0x1698],rbp
     11f11c2:	4c 8d a3 a0 16 00 00 	lea    r12,[rbx+0x16a0]
     11f11c9:	4c 89 e7             	mov    rdi,r12
     11f11cc:	48 8b b4 24 60 06 00 	mov    rsi,QWORD PTR [rsp+0x660]
     11f11d3:	00 
     11f11d4:	e8 e9 04 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11f11d9:	4c 8d ab b0 16 00 00 	lea    r13,[rbx+0x16b0]
     11f11e0:	4c 89 ef             	mov    rdi,r13

### ContextPlayer init tail 0x10a1440: 2
- 0x1099822 from 0x109917a..0x1099d71
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
     1099808:	4c 89 f7             	mov    rdi,r14
     109980b:	e8 7e ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099810:	4d 8d bd c8 04 00 00 	lea    r15,[r13+0x4c8]
     1099817:	4c 89 ff             	mov    rdi,r15
     109981a:	e8 0b bf ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     109981f:	4c 89 ef             	mov    rdi,r13
     1099822:	e8 19 7c 00 00       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     1099827:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     109982b:	4c 89 6d 00          	mov    QWORD PTR [rbp+0x0],r13
     109982f:	48 85 ff             	test   rdi,rdi
     1099832:	74 06                	je     109983a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260c50>
     1099834:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1099837:	ff 50 08             	call   QWORD PTR [rax+0x8]
     109983a:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     1099841:	00 
     1099842:	e8 3f 4c a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- 0x10a16fd from 0x10a16f8..0x10a170c
     10a16e4:	48 8d 05 7d ad 7a 00 	lea    rax,[rip+0x7aad7d]        # 184c468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b50>
     10a16eb:	48 89 06             	mov    QWORD PTR [rsi],rax
     10a16ee:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10a16f2:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10a16f6:	c3                   	ret
     10a16f7:	cc                   	int3
     10a16f8:	50                   	push   rax
     10a16f9:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     10a16fd:	e8 3e fd ff ff       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     10a1702:	58                   	pop    rax
     10a1703:	c3                   	ret
     10a1704:	48 89 c7             	mov    rdi,rax
     10a1707:	e8 99 83 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a170c:	53                   	push   rbx
     10a170d:	48 89 fb             	mov    rbx,rdi
     10a1710:	6a 10                	push   0x10
     10a1712:	5f                   	pop    rdi
     10a1713:	e8 e8 c7 74 00       	call   17edf00 <_Znwm@plt>

### restriction builder 0x10a6464: 4
- 0x10a645f from 0x10a645c..0x10a6464
     10a6444:	0f 11 87 b8 03 00 00 	movups XMMWORD PTR [rdi+0x3b8],xmm0
     10a644b:	48 89 87 b0 03 00 00 	mov    QWORD PTR [rdi+0x3b0],rax
     10a6452:	c3                   	ret
     10a6453:	cc                   	int3
     10a6454:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10a6457:	e9 00 00 00 00       	jmp    10a645c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d872>
     10a645c:	6a 01                	push   0x1
     10a645e:	5e                   	pop    rsi
     10a645f:	e9 00 00 00 00       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a6464:	55                   	push   rbp
     10a6465:	41 57                	push   r15
     10a6467:	41 56                	push   r14
     10a6469:	41 55                	push   r13
     10a646b:	41 54                	push   r12
     10a646d:	53                   	push   rbx
     10a646e:	48 81 ec 38 08 00 00 	sub    rsp,0x838
     10a6475:	89 f5                	mov    ebp,esi
     10a6477:	49 89 fe             	mov    r14,rdi
- 0x10a8d97 from 0x10a8aae..0x10a8da4
     10a8d82:	4c 89 f6             	mov    rsi,r14
     10a8d85:	e8 0a a1 d8 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     10a8d8a:	6a 01                	push   0x1
     10a8d8c:	5e                   	pop    rsi
     10a8d8d:	48 89 df             	mov    rdi,rbx
     10a8d90:	48 83 c4 08          	add    rsp,0x8
     10a8d94:	5b                   	pop    rbx
     10a8d95:	41 5e                	pop    r14
     10a8d97:	e9 c8 d6 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a8d9c:	48 89 c7             	mov    rdi,rax
     10a8d9f:	e8 01 0d 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a8da4:	48 8d 87 90 10 00 00 	lea    rax,[rdi+0x1090]
     10a8dab:	c3                   	ret
     10a8dac:	48 8d 87 58 14 00 00 	lea    rax,[rdi+0x1458]
     10a8db3:	c3                   	ret
     10a8db4:	41 57                	push   r15
     10a8db6:	41 56                	push   r14
     10a8db8:	53                   	push   rbx
- 0x10a9696 from 0x10a9668..0x10a969c
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>
- 0x10a9fb1 from 0x10a9f9e..0x10a9fbe
     10a9f99:	e8 07 fb 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9f9e:	53                   	push   rbx
     10a9f9f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     10a9fa6:	e8 13 00 00 00       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
     10a9fab:	48 89 df             	mov    rdi,rbx
     10a9fae:	31 f6                	xor    esi,esi
     10a9fb0:	5b                   	pop    rbx
     10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a9fb6:	48 89 c7             	mov    rdi,rax
     10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx
     10a9fc8:	50                   	push   rax

### ad-state transition 0x10a9668: 1
- 0x10a96b4 from 0x10a96b0..0x10a96b9
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>
     10a96b9:	cc                   	int3
     10a96ba:	41 56                	push   r14
     10a96bc:	53                   	push   rbx
     10a96bd:	48 83 ec 28          	sub    rsp,0x28
     10a96c1:	48 89 fb             	mov    rbx,rdi
     10a96c4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a96cb:	00 00 
     10a96cd:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a96d2:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]

### raw skippable getter 0x14e2472: 0

### derived skippable predicate 0x14e248a: 0

### delay parser 0x14e24e8: 0

## Literal function-pointer table neighborhoods

### raw skippable getter pointer at file+0x162578, VA 0x162578
- slot VA 0x162488: 0x14e1f2e
- slot VA 0x1624a0: 0x14e1fc8
- slot VA 0x1624b8: 0x14e2040
- slot VA 0x1624d0: 0x14e20da
- slot VA 0x1624e8: 0x14e2174
- slot VA 0x162500: 0x14e21b4
- slot VA 0x162518: 0x14e226a
- slot VA 0x162530: 0x14e22a4
- slot VA 0x162548: 0x14e233e
- slot VA 0x162560: 0x14e23d8
- slot VA 0x162578: 0x14e2472 ; raw skippable getter
- slot VA 0x162590: 0x14e248a ; derived skippable predicate
- slot VA 0x1625a8: 0x14e24b8
- slot VA 0x1625c0: 0x14e24d0
- slot VA 0x1625d8: 0x14e24e8 ; delay parser
- slot VA 0x1625f0: 0x14e25d0

### derived skippable predicate pointer at file+0x162590, VA 0x162590
- slot VA 0x162500: 0x14e21b4
- slot VA 0x162518: 0x14e226a
- slot VA 0x162530: 0x14e22a4
- slot VA 0x162548: 0x14e233e
- slot VA 0x162560: 0x14e23d8
- slot VA 0x162578: 0x14e2472 ; raw skippable getter
- slot VA 0x162590: 0x14e248a ; derived skippable predicate
- slot VA 0x1625a8: 0x14e24b8
- slot VA 0x1625c0: 0x14e24d0
- slot VA 0x1625d8: 0x14e24e8 ; delay parser
- slot VA 0x1625f0: 0x14e25d0

### delay parser pointer at file+0x1625d8, VA 0x1625d8
- slot VA 0x162500: 0x14e21b4
- slot VA 0x162518: 0x14e226a
- slot VA 0x162530: 0x14e22a4
- slot VA 0x162548: 0x14e233e
- slot VA 0x162560: 0x14e23d8
- slot VA 0x162578: 0x14e2472 ; raw skippable getter
- slot VA 0x162590: 0x14e248a ; derived skippable predicate
- slot VA 0x1625a8: 0x14e24b8
- slot VA 0x1625c0: 0x14e24d0
- slot VA 0x1625d8: 0x14e24e8 ; delay parser
- slot VA 0x1625f0: 0x14e25d0

## Constructor/init vptr-store candidates

### guard ctor/helper
### ContextPlayer init tail
## Relevant dynamic relocations

    000000000184c840  0000000000000008 R_X86_64_RELATIVE                         10a9668
    0000000001879a18  0000000000000008 R_X86_64_RELATIVE                         14e2472
    0000000001879a20  0000000000000008 R_X86_64_RELATIVE                         14e248a
    0000000001879a38  0000000000000008 R_X86_64_RELATIVE                         14e24e8
