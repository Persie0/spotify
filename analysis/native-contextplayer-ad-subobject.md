# ContextPlayer +0x418 ad/restriction subobject trace

ContextPlayer init passes this+0x418 to helper 0xb28aa8.
Within that subobject: ContextPlayer+0x438 = +0x20, +0x470 = +0x58, +0x598 = +0x180.

## ContextPlayer init handoff: 0x10a157b
Function: 0x10a1440..0x10a1585

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

## subobject helper: 0xb28aa8
Function: 0xb28aa8..0xb28bc1

      b28aa8:	53                   	push   rbx
      b28aa9:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
      b28ab0:	48 89 fe             	mov    rsi,rdi
      b28ab3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b28aba:	00 00 
      b28abc:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
      b28ac3:	00 
      b28ac4:	0f 57 c0             	xorps  xmm0,xmm0
      b28ac7:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      b28ace:	00 
      b28acf:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      b28ad2:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      b28ad7:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      b28adc:	e8 29 19 cb 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
      b28ae1:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
      b28ae6:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      b28aeb:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b28af0:	48 8d 74 24 67       	lea    rsi,[rsp+0x67]
      b28af5:	48 89 d9             	mov    rcx,rbx
      b28af8:	e8 c4 00 00 00       	call   b28bc1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75b61>
      b28afd:	48 89 e7             	mov    rdi,rsp
      b28b00:	48 8d 74 24 67       	lea    rsi,[rsp+0x67]
      b28b05:	48 89 da             	mov    rdx,rbx
      b28b08:	48 89 d9             	mov    rcx,rbx
      b28b0b:	e8 b1 00 00 00       	call   b28bc1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75b61>
      b28b10:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b28b15:	48 89 e6             	mov    rsi,rsp
      b28b18:	e8 9f 3f f9 ff       	call   abcabc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a5c>
      b28b1d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b28b22:	e8 5f 59 f7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b28b27:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      b28b2c:	e8 55 59 f7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b28b31:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      b28b36:	e8 29 40 f9 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
      b28b3b:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b28b42:	00 
      b28b43:	e8 1c 40 f9 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
      b28b48:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b28b4f:	00 00 
      b28b51:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
      b28b58:	00 
      b28b59:	75 61                	jne    b28bbc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75b5c>
      b28b5b:	48 81 c4 a0 00 00 00 	add    rsp,0xa0
      b28b62:	5b                   	pop    rbx
      b28b63:	c3                   	ret
      b28b64:	48 89 c3             	mov    rbx,rax
      b28b67:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b28b6c:	e8 15 59 f7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b28b71:	eb 03                	jmp    b28b76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75b16>
      b28b73:	48 89 c3             	mov    rbx,rax
      b28b76:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      b28b7b:	e8 06 59 f7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b28b80:	eb 03                	jmp    b28b85 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75b25>
      b28b82:	48 89 c3             	mov    rbx,rax
      b28b85:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      b28b8a:	e8 d5 3f f9 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
      b28b8f:	eb 03                	jmp    b28b94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75b34>
      b28b91:	48 89 c3             	mov    rbx,rax
      b28b94:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b28b9b:	00 
      b28b9c:	e8 c3 3f f9 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
      b28ba1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b28ba8:	00 00 
      b28baa:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
      b28bb1:	00 
      b28bb2:	75 08                	jne    b28bbc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75b5c>
      b28bb4:	48 89 df             	mov    rdi,rbx
      b28bb7:	e8 14 71 f4 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b28bbc:	e8 ef 6e cc 00       	call   17efab0 <__stack_chk_fail@plt>

## ad restriction event: 0x10a9668
Function: 0x10a9668..0x10a969c

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

## restriction builder: 0x10a6464
Function: 0x10a6464..0x10a7f52

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

## Direct call/jump xrefs to subobject helper 0xb28aa8

### 0xb28a76 from 0xb28a44..0xb28aa7
      b28a45:	48 83 ec 20          	sub    rsp,0x20
      b28a49:	48 89 fe             	mov    rsi,rdi
      b28a4c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b28a53:	00 00 
      b28a55:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      b28a5a:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
      b28a5f:	48 89 df             	mov    rdi,rbx
      b28a62:	e8 c9 28 f8 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      b28a67:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      b28a6a:	48 85 ff             	test   rdi,rdi
      b28a6d:	74 0c                	je     b28a7b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a1b>
      b28a6f:	48 81 c7 90 01 00 00 	add    rdi,0x190
      b28a76:	e8 2d 00 00 00       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      b28a7b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      b28a80:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b28a87:	00 00 
      b28a89:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      b28a8e:	75 0a                	jne    b28a9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a3a>
      b28a90:	48 83 c4 20          	add    rsp,0x20
      b28a94:	5b                   	pop    rbx
      b28a95:	e9 ec 59 f7 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      b28a9a:	e8 11 70 cc 00       	call   17efab0 <__stack_chk_fail@plt>
      b28a9f:	48 89 c7             	mov    rdi,rax
      b28aa2:	e8 fe 0f f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      b28aa7:	cc                   	int3
      b28aa8:	53                   	push   rbx

### 0xb4873d from 0xb4872c..0xb48759
      b4871d:	48 83 c4 50          	add    rsp,0x50
      b48721:	5b                   	pop    rbx
      b48722:	41 5e                	pop    r14
      b48724:	41 5f                	pop    r15
      b48726:	c3                   	ret
      b48727:	e8 84 73 ca 00       	call   17efab0 <__stack_chk_fail@plt>
      b4872c:	41 56                	push   r14
      b4872e:	53                   	push   rbx
      b4872f:	50                   	push   rax
      b48730:	48 89 f3             	mov    rbx,rsi
      b48733:	49 89 fe             	mov    r14,rdi
      b48736:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
      b4873d:	e8 66 03 fe ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      b48742:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
      b48746:	49 83 c6 38          	add    r14,0x38
      b4874a:	4c 89 f7             	mov    rdi,r14
      b4874d:	48 89 de             	mov    rsi,rbx
      b48750:	48 83 c4 08          	add    rsp,0x8
      b48754:	5b                   	pop    rbx
      b48755:	41 5e                	pop    r14
      b48757:	ff e0                	jmp    rax
      b48759:	cc                   	int3
      b4875a:	48 89 f8             	mov    rax,rdi
      b4875d:	48 83 c7 18          	add    rdi,0x18
      b48761:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
      b48764:	53                   	push   rbx

### 0xb89c67 from 0xb89c60..0xb89c6c
      b89c3a:	e8 f7 00 00 00       	call   b89d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6cd6>
      b89c3f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b89c46:	00 00 
      b89c48:	48 3b 84 24 58 01 00 	cmp    rax,QWORD PTR [rsp+0x158]
      b89c4f:	00 
      b89c50:	75 08                	jne    b89c5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6bfa>
      b89c52:	48 89 df             	mov    rdi,rbx
      b89c55:	e8 76 60 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b89c5a:	e8 51 5e c6 00       	call   17efab0 <__stack_chk_fail@plt>
      b89c5f:	cc                   	int3
      b89c60:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      b89c63:	48 83 c7 68          	add    rdi,0x68
      b89c67:	e9 3c ee f9 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      b89c6c:	e9 01 00 00 00       	jmp    b89c72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c12>
      b89c71:	cc                   	int3
      b89c72:	48 85 ff             	test   rdi,rdi
      b89c75:	74 27                	je     b89c9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c3e>
      b89c77:	53                   	push   rbx
      b89c78:	48 89 fb             	mov    rbx,rdi
      b89c7b:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      b89c7e:	e8 ef ff ff ff       	call   b89c72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c12>
      b89c83:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      b89c87:	e8 e6 ff ff ff       	call   b89c72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c12>
      b89c8c:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      b89c90:	e8 79 da f2 ff       	call   ab770e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46ae>
      b89c95:	48 89 df             	mov    rdi,rbx

### 0xb8dc35 from 0xb8dbf2..0xb8dc85
      b8dc0f:	4c 89 f7             	mov    rdi,r14
      b8dc12:	e8 19 d7 f1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      b8dc17:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      b8dc1a:	48 85 ff             	test   rdi,rdi
      b8dc1d:	74 1b                	je     b8dc3a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdabda>
      b8dc1f:	ff cb                	dec    ebx
      b8dc21:	31 c0                	xor    eax,eax
      b8dc23:	83 fb 02             	cmp    ebx,0x2
      b8dc26:	0f 92 c0             	setb   al
      b8dc29:	01 c0                	add    eax,eax
      b8dc2b:	87 87 88 00 00 00    	xchg   DWORD PTR [rdi+0x88],eax
      b8dc31:	48 83 c7 20          	add    rdi,0x20
      b8dc35:	e8 6e ae f9 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      b8dc3a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      b8dc3f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8dc46:	00 00 
      b8dc48:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      b8dc4d:	75 31                	jne    b8dc80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdac20>
      b8dc4f:	48 83 c4 18          	add    rsp,0x18
      b8dc53:	5b                   	pop    rbx
      b8dc54:	41 5e                	pop    r14
      b8dc56:	e9 2b 08 f1 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8dc5b:	48 89 c3             	mov    rbx,rax
      b8dc5e:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      b8dc63:	e8 1e 08 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8dc68:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0xb8dec0 from 0xb8deb4..0xb8dec5
      b8de93:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8de9a:	00 00 
      b8de9c:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]
      b8dea3:	00 
      b8dea4:	75 08                	jne    b8deae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdae4e>
      b8dea6:	4c 89 f7             	mov    rdi,r14
      b8dea9:	e8 22 1e ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b8deae:	e8 fd 1b c6 00       	call   17efab0 <__stack_chk_fail@plt>
      b8deb3:	cc                   	int3
      b8deb4:	b0 01                	mov    al,0x1
      b8deb6:	86 87 8c 00 00 00    	xchg   BYTE PTR [rdi+0x8c],al
      b8debc:	48 83 c7 20          	add    rdi,0x20
      b8dec0:	e9 e3 ab f9 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      b8dec5:	cc                   	int3
      b8dec6:	41 57                	push   r15
      b8dec8:	41 56                	push   r14
      b8deca:	53                   	push   rbx
      b8decb:	48 83 ec 50          	sub    rsp,0x50
      b8decf:	49 89 f6             	mov    r14,rsi
      b8ded2:	48 89 fb             	mov    rbx,rdi
      b8ded5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8dedc:	00 00 
      b8dede:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b8dee3:	49 83 c6 20          	add    r14,0x20
      b8dee7:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b8deec:	4c 89 ff             	mov    rdi,r15

### 0xc34cb6 from 0xc34cae..0xc34cbb
      c34c90:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      c34c94:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      c34c98:	5b                   	pop    rbx
      c34c99:	c3                   	ret
      c34c9a:	48 8d 05 a7 29 be 00 	lea    rax,[rip+0xbe29a7]        # 1817648 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd308>
      c34ca1:	48 89 06             	mov    QWORD PTR [rsi],rax
      c34ca4:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      c34ca8:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      c34cac:	c3                   	ret
      c34cad:	cc                   	int3
      c34cae:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      c34cb2:	48 83 c7 08          	add    rdi,0x8
      c34cb6:	e9 ed 3d ef ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      c34cbb:	cc                   	int3
      c34cbc:	53                   	push   rbx
      c34cbd:	48 89 fb             	mov    rbx,rdi
      c34cc0:	48 8d 05 49 29 be 00 	lea    rax,[rip+0xbe2949]        # 1817610 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd2d0>
      c34cc7:	48 89 07             	mov    QWORD PTR [rdi],rax
      c34cca:	48 83 c7 60          	add    rdi,0x60
      c34cce:	e8 db 01 00 00       	call   c34eae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181e4e>
      c34cd3:	48 83 c3 08          	add    rbx,0x8
      c34cd7:	48 89 df             	mov    rdi,rbx
      c34cda:	5b                   	pop    rbx
      c34cdb:	e9 86 51 ba 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      c34ce0:	53                   	push   rbx
      c34ce1:	48 89 fb             	mov    rbx,rdi

### 0xc3ae95 from 0xc3ae90..0xc3aea4
      c3ae71:	75 08                	jne    c3ae7b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187e1b>
      c3ae73:	48 83 c4 48          	add    rsp,0x48
      c3ae77:	5b                   	pop    rbx
      c3ae78:	41 5e                	pop    r14
      c3ae7a:	c3                   	ret
      c3ae7b:	e8 30 4c bb 00       	call   17efab0 <__stack_chk_fail@plt>
      c3ae80:	48 89 c7             	mov    rdi,rax
      c3ae83:	e8 1d ec e3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c3ae88:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      c3ae8b:	e9 00 00 00 00       	jmp    c3ae90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187e30>
      c3ae90:	50                   	push   rax
      c3ae91:	48 83 c7 18          	add    rdi,0x18
      c3ae95:	e8 0e dc ee ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      c3ae9a:	58                   	pop    rax
      c3ae9b:	c3                   	ret
      c3ae9c:	48 89 c7             	mov    rdi,rax
      c3ae9f:	e8 01 ec e3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c3aea4:	53                   	push   rbx
      c3aea5:	48 89 fb             	mov    rbx,rdi
      c3aea8:	48 8d 05 81 cf bd 00 	lea    rax,[rip+0xbdcf81]        # 1817e30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xdaf0>
      c3aeaf:	48 89 07             	mov    QWORD PTR [rdi],rax
      c3aeb2:	48 83 c7 38          	add    rdi,0x38
      c3aeb6:	e8 ab ef b9 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      c3aebb:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
      c3aebf:	e8 10 ed b9 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      c3aec4:	48 83 c3 10          	add    rbx,0x10

### 0xc3b038 from 0xc3aff8..0xc3b049
      c3b016:	4c 89 fe             	mov    rsi,r15
      c3b019:	e8 24 90 ef ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
      c3b01e:	49 83 c7 18          	add    r15,0x18
      c3b022:	84 c0                	test   al,al
      c3b024:	74 e8                	je     c3b00e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187fae>
      c3b026:	48 83 c3 38          	add    rbx,0x38
      c3b02a:	48 89 df             	mov    rdi,rbx
      c3b02d:	48 83 c4 08          	add    rsp,0x8
      c3b031:	5b                   	pop    rbx
      c3b032:	41 5c                	pop    r12
      c3b034:	41 5e                	pop    r14
      c3b036:	41 5f                	pop    r15
      c3b038:	e9 6b da ee ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      c3b03d:	48 83 c4 08          	add    rsp,0x8
      c3b041:	5b                   	pop    rbx
      c3b042:	41 5c                	pop    r12
      c3b044:	41 5e                	pop    r14
      c3b046:	41 5f                	pop    r15
      c3b048:	c3                   	ret
      c3b049:	cc                   	int3
      c3b04a:	53                   	push   rbx
      c3b04b:	48 89 fb             	mov    rbx,rdi
      c3b04e:	48 8d 05 03 ce bd 00 	lea    rax,[rip+0xbdce03]        # 1817e58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xdb18>
      c3b055:	48 89 07             	mov    QWORD PTR [rdi],rax
      c3b058:	48 83 c7 20          	add    rdi,0x20
      c3b05c:	e8 09 ef e3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0xc72c14 from 0xc72c0c..0xc72c23
      c72be8:	c3                   	ret
      c72be9:	e8 c2 ce b7 00       	call   17efab0 <__stack_chk_fail@plt>
      c72bee:	48 89 c3             	mov    rbx,rax
      c72bf1:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      c72bf6:	e8 a3 46 e3 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      c72bfb:	48 89 df             	mov    rdi,rbx
      c72bfe:	e8 a2 6e e0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c72c03:	cc                   	int3
      c72c04:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      c72c07:	e9 00 00 00 00       	jmp    c72c0c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bfbac>
      c72c0c:	50                   	push   rax
      c72c0d:	48 81 c7 58 01 00 00 	add    rdi,0x158
      c72c14:	e8 8f 5e eb ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      c72c19:	58                   	pop    rax
      c72c1a:	c3                   	ret
      c72c1b:	48 89 c7             	mov    rdi,rax
      c72c1e:	e8 82 6e e0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c72c23:	cc                   	int3
      c72c24:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      c72c27:	e9 00 00 00 00       	jmp    c72c2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bfbcc>
      c72c2c:	41 57                	push   r15
      c72c2e:	41 56                	push   r14
      c72c30:	53                   	push   rbx
      c72c31:	49 89 fe             	mov    r14,rdi
      c72c34:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
      c72c37:	49 8d 9f d8 01 00 00 	lea    rbx,[r15+0x1d8]

### 0xc89d75 from 0xc89d6a..0xc89d7a
      c89d51:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      c89d56:	75 0d                	jne    c89d65 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d6d05>
      c89d58:	48 89 d8             	mov    rax,rbx
      c89d5b:	48 83 c4 50          	add    rsp,0x50
      c89d5f:	5b                   	pop    rbx
      c89d60:	41 5e                	pop    r14
      c89d62:	41 5f                	pop    r15
      c89d64:	c3                   	ret
      c89d65:	e8 46 5d b6 00       	call   17efab0 <__stack_chk_fail@plt>
      c89d6a:	b8 88 00 00 00       	mov    eax,0x88
      c89d6f:	48 03 07             	add    rax,QWORD PTR [rdi]
      c89d72:	48 89 c7             	mov    rdi,rax
      c89d75:	e9 2e ed e9 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      c89d7a:	31 f6                	xor    esi,esi
      c89d7c:	e9 75 00 00 00       	jmp    c89df6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d6d96>
      c89d81:	cc                   	int3
      c89d82:	41 57                	push   r15
      c89d84:	41 56                	push   r14
      c89d86:	53                   	push   rbx
      c89d87:	48 89 fb             	mov    rbx,rdi
      c89d8a:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
      c89d8e:	4d 85 f6             	test   r14,r14
      c89d91:	74 1c                	je     c89daf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d6d4f>
      c89d93:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
      c89d96:	49 8d 7e 10          	lea    rdi,[r14+0x10]
      c89d9a:	e8 41 00 00 00       	call   c89de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d6d80>

### 0xc8c95b from 0xc8c8d4..0xc8c9ac
      c8c92a:	4c 8d 44 24 09       	lea    r8,[rsp+0x9]
      c8c92f:	48 8d 35 46 56 7c ff 	lea    rsi,[rip+0xffffffffff7c5646]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      c8c936:	48 8d 0d f6 5a 6d ff 	lea    rcx,[rip+0xffffffffff6d5af6]        # 362433 <_ZTSSt12bad_any_cast@@Base-0x2dd95>
      c8c93d:	6a 03                	push   0x3
      c8c93f:	5f                   	pop    rdi
      c8c940:	ba a4 01 00 00       	mov    edx,0x1a4
      c8c945:	31 c0                	xor    eax,eax
      c8c947:	e8 86 9f b4 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      c8c94c:	4c 89 f7             	mov    rdi,r14
      c8c94f:	e8 3c 15 b6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c8c954:	48 83 c3 08          	add    rbx,0x8
      c8c958:	48 89 df             	mov    rdi,rbx
      c8c95b:	e8 48 c1 e9 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      c8c960:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      c8c965:	e8 82 9d e2 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
      c8c96a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c8c971:	00 00 
      c8c973:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      c8c978:	75 2d                	jne    c8c9a7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9947>
      c8c97a:	48 83 c4 38          	add    rsp,0x38
      c8c97e:	5b                   	pop    rbx
      c8c97f:	41 5e                	pop    r14
      c8c981:	c3                   	ret
      c8c982:	48 89 c3             	mov    rbx,rax
      c8c985:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      c8c98a:	e8 5d 9d e2 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>

### 0xc94fcc from 0xc94faa..0xc94fd1
      c94fa1:	48 89 df             	mov    rdi,rbx
      c94fa4:	5b                   	pop    rbx
      c94fa5:	e9 76 8f b5 00       	jmp    17edf20 <_ZdlPv@plt>
      c94faa:	53                   	push   rbx
      c94fab:	48 89 fb             	mov    rbx,rdi
      c94fae:	48 8b bf a8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xa8]
      c94fb5:	0f 57 c0             	xorps  xmm0,xmm0
      c94fb8:	0f 11 83 a0 00 00 00 	movups XMMWORD PTR [rbx+0xa0],xmm0
      c94fbf:	e8 c2 94 e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c94fc4:	48 83 c3 10          	add    rbx,0x10
      c94fc8:	48 89 df             	mov    rdi,rbx
      c94fcb:	5b                   	pop    rbx
      c94fcc:	e9 d7 3a e9 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      c94fd1:	cc                   	int3
      c94fd2:	48 8b 87 98 00 00 00 	mov    rax,QWORD PTR [rdi+0x98]
      c94fd9:	c3                   	ret
      c94fda:	55                   	push   rbp
      c94fdb:	41 57                	push   r15
      c94fdd:	41 56                	push   r14
      c94fdf:	41 55                	push   r13
      c94fe1:	41 54                	push   r12
      c94fe3:	53                   	push   rbx
      c94fe4:	48 83 ec 18          	sub    rsp,0x18
      c94fe8:	4c 8b bf a0 00 00 00 	mov    r15,QWORD PTR [rdi+0xa0]
      c94fef:	0f 10 0e             	movups xmm1,XMMWORD PTR [rsi]
      c94ff2:	66 0f ef c0          	pxor   xmm0,xmm0

### 0xcc9cdc from 0xcc9cd0..0xcc9ce1
      cc9cb6:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      cc9cba:	5b                   	pop    rbx
      cc9cbb:	c3                   	ret
      cc9cbc:	48 8d 05 ed 5b b5 00 	lea    rax,[rip+0xb55bed]        # 181f8b0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15570>
      cc9cc3:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc9cc6:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      cc9cca:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      cc9cce:	c3                   	ret
      cc9ccf:	cc                   	int3
      cc9cd0:	b8 30 05 00 00       	mov    eax,0x530
      cc9cd5:	48 03 47 08          	add    rax,QWORD PTR [rdi+0x8]
      cc9cd9:	48 89 c7             	mov    rdi,rax
      cc9cdc:	e9 c7 ed e5 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cc9ce1:	cc                   	int3
      cc9ce2:	41 57                	push   r15
      cc9ce4:	41 56                	push   r14
      cc9ce6:	53                   	push   rbx
      cc9ce7:	49 89 f6             	mov    r14,rsi
      cc9cea:	48 89 fb             	mov    rbx,rdi
      cc9ced:	4c 8b 7e 08          	mov    r15,QWORD PTR [rsi+0x8]
      cc9cf1:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      cc9cf5:	4c 89 7f 08          	mov    QWORD PTR [rdi+0x8],r15
      cc9cf9:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      cc9cfe:	4d 85 ff             	test   r15,r15
      cc9d01:	74 14                	je     cc9d17 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216cb7>
      cc9d03:	4c 89 ff             	mov    rdi,r15

### 0xcde2d0 from 0xcdd740..0xcde705
      cde2a0:	89 06                	mov    DWORD PTR [rsi],eax
      cde2a2:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cde2a6:	48 89 df             	mov    rdi,rbx
      cde2a9:	e8 5e 0a 00 00       	call   cded0c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22bcac>
      cde2ae:	eb 48                	jmp    cde2f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22b298>
      cde2b0:	48 83 bb 38 04 00 00 	cmp    QWORD PTR [rbx+0x438],0x0
      cde2b7:	00 
      cde2b8:	74 1d                	je     cde2d7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22b277>
      cde2ba:	48 8d bb 20 1e 00 00 	lea    rdi,[rbx+0x1e20]
      cde2c1:	4c 89 f6             	mov    rsi,r14
      cde2c4:	e8 b7 fd b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cde2c9:	48 8d bb 38 1e 00 00 	lea    rdi,[rbx+0x1e38]
      cde2d0:	e8 d3 a7 e4 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cde2d5:	eb 21                	jmp    cde2f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22b298>
      cde2d7:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
      cde2de:	00 
      cde2df:	c7 06 33 00 00 00    	mov    DWORD PTR [rsi],0x33
      cde2e5:	48 8d 05 dc 97 c5 00 	lea    rax,[rip+0xc597dc]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      cde2ec:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      cde2f0:	48 89 df             	mov    rdi,rbx
      cde2f3:	e8 14 0a 00 00       	call   cded0c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22bcac>
      cde2f8:	48 83 bb 38 04 00 00 	cmp    QWORD PTR [rbx+0x438],0x0
      cde2ff:	00 
      cde300:	0f 84 fa 00 00 00    	je     cde400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22b3a0>
      cde306:	80 bb 60 15 00 00 00 	cmp    BYTE PTR [rbx+0x1560],0x0
      cde30d:	74 72                	je     cde381 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22b321>

### 0xce42fa from 0xce42b4..0xce432d
      ce42cc:	48 8d 77 08          	lea    rsi,[rdi+0x8]
      ce42d0:	49 89 e6             	mov    r14,rsp
      ce42d3:	4c 89 f7             	mov    rdi,r14
      ce42d6:	e8 55 70 dc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      ce42db:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0
      ce42df:	74 1e                	je     ce42ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23129f>
      ce42e1:	48 8d 73 18          	lea    rsi,[rbx+0x18]
      ce42e5:	bf 20 1e 00 00       	mov    edi,0x1e20
      ce42ea:	48 03 3b             	add    rdi,QWORD PTR [rbx]
      ce42ed:	e8 8e 9d b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ce42f2:	bf 38 1e 00 00       	mov    edi,0x1e38
      ce42f7:	48 03 3b             	add    rdi,QWORD PTR [rbx]
      ce42fa:	e8 a9 47 e4 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ce42ff:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      ce4304:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ce430b:	00 00 
      ce430d:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      ce4312:	75 0c                	jne    ce4320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2312c0>
      ce4314:	48 83 c4 18          	add    rsp,0x18
      ce4318:	5b                   	pop    rbx
      ce4319:	41 5e                	pop    r14
      ce431b:	e9 66 a1 db ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      ce4320:	e8 8b b7 b0 00       	call   17efab0 <__stack_chk_fail@plt>
      ce4325:	48 89 c7             	mov    rdi,rax
      ce4328:	e8 78 57 d9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ce432d:	cc                   	int3

### 0xcf178e from 0xcf16ee..0xcf1fc1
      cf1756:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      cf175d:	00 
      cf175e:	e8 cd 55 db ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cf1763:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cf1768:	e8 23 c7 af 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cf176d:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
      cf1772:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      cf1777:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
      cf177c:	e8 6d df da ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      cf1781:	84 c0                	test   al,al
      cf1783:	0f 85 2c 07 00 00    	jne    cf1eb5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23ee55>
      cf1789:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
      cf178e:	e8 15 73 e3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf1793:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      cf1798:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      cf179d:	e8 4c df da ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      cf17a2:	84 c0                	test   al,al
      cf17a4:	0f 85 ed 06 00 00    	jne    cf1e97 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23ee37>
      cf17aa:	48 8d 35 32 b6 67 ff 	lea    rsi,[rip+0xffffffffff67b632]        # 36cde3 <_ZTSSt12bad_any_cast@@Base-0x233e5>
      cf17b1:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
      cf17b8:	00 
      cf17b9:	e8 04 08 00 00       	call   cf1fc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23ef62>
      cf17be:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
      cf17c5:	00 
      cf17c6:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      cf17cb:	48 8d 94 24 98 01 00 	lea    rdx,[rsp+0x198]

### 0xcf1eb0 from 0xcf16ee..0xcf1fc1
      cf1e7a:	00 
      cf1e7b:	e8 4c c9 da ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      cf1e80:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
      cf1e87:	00 
      cf1e88:	e8 3f c9 da ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      cf1e8d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      cf1e92:	41 89 44 24 08       	mov    DWORD PTR [r12+0x8],eax
      cf1e97:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      cf1e9c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      cf1ea1:	e8 da c1 af 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cf1ea6:	49 81 c4 98 00 00 00 	add    r12,0x98
      cf1ead:	4c 89 e7             	mov    rdi,r12
      cf1eb0:	e8 f3 6b e3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf1eb5:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      cf1eba:	e8 d1 bf af 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cf1ebf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cf1ec6:	00 00 
      cf1ec8:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
      cf1ecf:	00 
      cf1ed0:	0f 85 e6 00 00 00    	jne    cf1fbc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23ef5c>
      cf1ed6:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
      cf1edd:	5b                   	pop    rbx
      cf1ede:	41 5c                	pop    r12
      cf1ee0:	41 5d                	pop    r13
      cf1ee2:	41 5e                	pop    r14
      cf1ee4:	41 5f                	pop    r15

### 0xcf2653 from 0xcf2636..0xcf2672
      cf262e:	41 5f                	pop    r15
      cf2630:	c3                   	ret
      cf2631:	e8 7a d4 af 00       	call   17efab0 <__stack_chk_fail@plt>
      cf2636:	41 56                	push   r14
      cf2638:	53                   	push   rbx
      cf2639:	50                   	push   rax
      cf263a:	89 f3                	mov    ebx,esi
      cf263c:	49 89 fe             	mov    r14,rdi
      cf263f:	48 83 c7 18          	add    rdi,0x18
      cf2643:	48 8d 35 32 f9 75 ff 	lea    rsi,[rip+0xffffffffff75f932]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cf264a:	e8 31 b9 af 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
      cf264f:	49 8d 7e 40          	lea    rdi,[r14+0x40]
      cf2653:	e8 50 64 e3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf2658:	41 89 5e 08          	mov    DWORD PTR [r14+0x8],ebx
      cf265c:	49 81 c6 98 00 00 00 	add    r14,0x98
      cf2663:	4c 89 f7             	mov    rdi,r14
      cf2666:	48 83 c4 08          	add    rsp,0x8
      cf266a:	5b                   	pop    rbx
      cf266b:	41 5e                	pop    r14
      cf266d:	e9 36 64 e3 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf2672:	48 8d 05 c7 e6 b2 00 	lea    rax,[rip+0xb2e6c7]        # 1820d40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16a00>
      cf2679:	48 89 07             	mov    QWORD PTR [rdi],rax
      cf267c:	e9 8f b9 af 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      cf2681:	cc                   	int3
      cf2682:	53                   	push   rbx
      cf2683:	48 89 fb             	mov    rbx,rdi

### 0xcf266d from 0xcf2636..0xcf2672
      cf263c:	49 89 fe             	mov    r14,rdi
      cf263f:	48 83 c7 18          	add    rdi,0x18
      cf2643:	48 8d 35 32 f9 75 ff 	lea    rsi,[rip+0xffffffffff75f932]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cf264a:	e8 31 b9 af 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
      cf264f:	49 8d 7e 40          	lea    rdi,[r14+0x40]
      cf2653:	e8 50 64 e3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf2658:	41 89 5e 08          	mov    DWORD PTR [r14+0x8],ebx
      cf265c:	49 81 c6 98 00 00 00 	add    r14,0x98
      cf2663:	4c 89 f7             	mov    rdi,r14
      cf2666:	48 83 c4 08          	add    rsp,0x8
      cf266a:	5b                   	pop    rbx
      cf266b:	41 5e                	pop    r14
      cf266d:	e9 36 64 e3 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf2672:	48 8d 05 c7 e6 b2 00 	lea    rax,[rip+0xb2e6c7]        # 1820d40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16a00>
      cf2679:	48 89 07             	mov    QWORD PTR [rdi],rax
      cf267c:	e9 8f b9 af 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      cf2681:	cc                   	int3
      cf2682:	53                   	push   rbx
      cf2683:	48 89 fb             	mov    rbx,rdi
      cf2686:	e8 e7 ff ff ff       	call   cf2672 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23f612>
      cf268b:	48 89 df             	mov    rdi,rbx
      cf268e:	5b                   	pop    rbx
      cf268f:	e9 8c b8 af 00       	jmp    17edf20 <_ZdlPv@plt>
      cf2694:	48 83 c7 18          	add    rdi,0x18
      cf2698:	e9 79 fe ff ff       	jmp    cf2516 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23f4b6>
      cf269d:	cc                   	int3

### 0xcf28cc from 0xcf2744..0xcf28fb
      cf289a:	48 8d 35 82 39 67 ff 	lea    rsi,[rip+0xffffffffff673982]        # 366223 <_ZTSSt12bad_any_cast@@Base-0x29fa5>
      cf28a1:	48 8d 0d 32 8d 64 ff 	lea    rcx,[rip+0xffffffffff648d32]        # 33b5da <_ZTSSt12bad_any_cast@@Base-0x54bee>
      cf28a8:	6a 06                	push   0x6
      cf28aa:	5f                   	pop    rdi
      cf28ab:	ba ed 00 00 00       	mov    edx,0xed
      cf28b0:	31 c0                	xor    eax,eax
      cf28b2:	e8 1b 40 ae 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cf28b7:	4c 89 ff             	mov    rdi,r15
      cf28ba:	48 89 de             	mov    rsi,rbx
      cf28bd:	e8 2a 32 00 00       	call   cf5aec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x242a8c>
      cf28c2:	49 81 c6 98 01 00 00 	add    r14,0x198
      cf28c9:	4c 89 f7             	mov    rdi,r14
      cf28cc:	e8 d7 61 e3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf28d1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cf28d8:	00 00 
      cf28da:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
      cf28df:	75 0d                	jne    cf28ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23f88e>
      cf28e1:	48 83 c4 30          	add    rsp,0x30
      cf28e5:	5b                   	pop    rbx
      cf28e6:	41 5c                	pop    r12
      cf28e8:	41 5e                	pop    r14
      cf28ea:	41 5f                	pop    r15
      cf28ec:	5d                   	pop    rbp
      cf28ed:	c3                   	ret
      cf28ee:	e8 bd d1 af 00       	call   17efab0 <__stack_chk_fail@plt>
      cf28f3:	48 89 c7             	mov    rdi,rax

### 0xcf2da1 from 0xcf2d06..0xcf2f49
      cf2d72:	74 5b                	je     cf2dcf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fd6f>
      cf2d74:	4d 8b 47 18          	mov    r8,QWORD PTR [r15+0x18]
      cf2d78:	eb 59                	jmp    cf2dd3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fd73>
      cf2d7a:	48 8d 35 a2 34 67 ff 	lea    rsi,[rip+0xffffffffff6734a2]        # 366223 <_ZTSSt12bad_any_cast@@Base-0x29fa5>
      cf2d81:	48 8d 0d f6 1f 64 ff 	lea    rcx,[rip+0xffffffffff641ff6]        # 334d7e <_ZTSSt12bad_any_cast@@Base-0x5b44a>
      cf2d88:	6a 03                	push   0x3
      cf2d8a:	5f                   	pop    rdi
      cf2d8b:	ba 87 00 00 00       	mov    edx,0x87
      cf2d90:	31 c0                	xor    eax,eax
      cf2d92:	e8 3b 3b ae 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cf2d97:	48 81 c3 98 01 00 00 	add    rbx,0x198
      cf2d9e:	48 89 df             	mov    rdi,rbx
      cf2da1:	e8 02 5d e3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf2da6:	e9 55 01 00 00       	jmp    cf2f00 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fea0>
      cf2dab:	83 f8 06             	cmp    eax,0x6
      cf2dae:	7c 57                	jl     cf2e07 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fda7>
      cf2db0:	48 8d 35 6c 34 67 ff 	lea    rsi,[rip+0xffffffffff67346c]        # 366223 <_ZTSSt12bad_any_cast@@Base-0x29fa5>
      cf2db7:	48 8d 0d 32 73 69 ff 	lea    rcx,[rip+0xffffffffff697332]        # 38a0f0 <_ZTSSt12bad_any_cast@@Base-0x60d8>
      cf2dbe:	6a 06                	push   0x6
      cf2dc0:	5f                   	pop    rdi
      cf2dc1:	ba 8f 00 00 00       	mov    edx,0x8f
      cf2dc6:	31 c0                	xor    eax,eax
      cf2dc8:	e8 05 3b ae 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cf2dcd:	eb 38                	jmp    cf2e07 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fda7>
      cf2dcf:	4d 8d 47 09          	lea    r8,[r15+0x9]
      cf2dd3:	41 80 7f 23 00       	cmp    BYTE PTR [r15+0x23],0x0

### 0xcf2edf from 0xcf2d06..0xcf2f49
      cf2eae:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
      cf2eb3:	41 88 45 00          	mov    BYTE PTR [r13+0x0],al
      cf2eb7:	41 88 45 28          	mov    BYTE PTR [r13+0x28],al
      cf2ebb:	4c 89 e7             	mov    rdi,r12
      cf2ebe:	4c 89 ee             	mov    rsi,r13
      cf2ec1:	e8 24 2b 00 00       	call   cf59ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24298a>
      cf2ec6:	4c 89 ef             	mov    rdi,r13
      cf2ec9:	e8 66 f8 ff ff       	call   cf2734 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23f6d4>
      cf2ece:	41 80 7f 28 00       	cmp    BYTE PTR [r15+0x28],0x0
      cf2ed3:	75 0f                	jne    cf2ee4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fe84>
      cf2ed5:	48 81 c3 98 01 00 00 	add    rbx,0x198
      cf2edc:	48 89 df             	mov    rdi,rbx
      cf2edf:	e8 c4 5b e3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf2ee4:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      cf2ee8:	48 85 ff             	test   rdi,rdi
      cf2eeb:	74 37                	je     cf2f24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fec4>
      cf2eed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cf2ef0:	4c 89 e6             	mov    rsi,r12
      cf2ef3:	ff 50 30             	call   QWORD PTR [rax+0x30]
      cf2ef6:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cf2efb:	e8 34 f8 ff ff       	call   cf2734 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23f6d4>
      cf2f00:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cf2f07:	00 00 
      cf2f09:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
      cf2f10:	00 
      cf2f11:	75 29                	jne    cf2f3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fedc>

### 0xcf3585 from 0xcf3516..0xcf359a
      cf3551:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
      cf3558:	e8 d9 82 d8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      cf355d:	4c 89 f7             	mov    rdi,r14
      cf3560:	48 89 c6             	mov    rsi,rax
      cf3563:	e8 f6 25 00 00       	call   cf5b5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x242afe>
      cf3568:	80 bb 48 02 00 00 00 	cmp    BYTE PTR [rbx+0x248],0x0
      cf356f:	74 0a                	je     cf357b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24051b>
      cf3571:	48 89 df             	mov    rdi,rbx
      cf3574:	31 f6                	xor    esi,esi
      cf3576:	e8 d9 fa ff ff       	call   cf3054 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23fff4>
      cf357b:	48 81 c3 98 01 00 00 	add    rbx,0x198
      cf3582:	48 89 df             	mov    rdi,rbx
      cf3585:	e8 1e 55 e3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      cf358a:	48 83 c4 08          	add    rsp,0x8
      cf358e:	5b                   	pop    rbx
      cf358f:	41 5e                	pop    r14
      cf3591:	c3                   	ret
      cf3592:	48 89 c7             	mov    rdi,rax
      cf3595:	e8 0b 65 d8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      cf359a:	53                   	push   rbx
      cf359b:	48 89 fb             	mov    rbx,rdi
      cf359e:	e8 fb f0 ff ff       	call   cf269e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23f63e>
      cf35a3:	48 89 df             	mov    rdi,rbx
      cf35a6:	5b                   	pop    rbx
      cf35a7:	e9 74 a9 af 00       	jmp    17edf20 <_ZdlPv@plt>
      cf35ac:	41 57                	push   r15

### 0xd16ab0 from 0xd169e4..0xd16b35
      d16a79:	88 02                	mov    BYTE PTR [rdx],al
      d16a7b:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d16a7e:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      d16a83:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d16a88:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      d16a8d:	e8 90 e3 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d16a92:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d16a97:	e8 ce 34 d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d16a9c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d16aa1:	e8 8a 02 d9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d16aa6:	49 81 c6 c8 04 00 00 	add    r14,0x4c8
      d16aad:	4c 89 f7             	mov    rdi,r14
      d16ab0:	e8 f3 1f e1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d16ab5:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d16aba:	e8 25 7f da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d16abf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d16ac6:	00 00 
      d16ac8:	48 3b 84 24 88 00 00 	cmp    rax,QWORD PTR [rsp+0x88]
      d16acf:	00 
      d16ad0:	75 5e                	jne    d16b30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263ad0>
      d16ad2:	89 d8                	mov    eax,ebx
      d16ad4:	48 81 c4 90 00 00 00 	add    rsp,0x90
      d16adb:	5b                   	pop    rbx
      d16adc:	41 5e                	pop    r14
      d16ade:	41 5f                	pop    r15
      d16ae0:	c3                   	ret

### 0xd17968 from 0xd174c2..0xd17a62
      d17930:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d17933:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
      d1793a:	00 
      d1793b:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d17940:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      d17945:	e8 d8 d4 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d1794a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      d17951:	00 
      d17952:	e8 13 26 d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d17957:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d1795c:	e8 cf f3 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d17961:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
      d17968:	e8 3b 11 e1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d1796d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      d17972:	e8 6d 70 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d17977:	48 89 df             	mov    rdi,rbx
      d1797a:	e8 21 e7 ff ff       	call   d160a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263040>
      d1797f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      d17984:	e8 07 65 ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d17989:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d17990:	00 00 
      d17992:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
      d17999:	00 
      d1799a:	0f 85 bd 00 00 00    	jne    d17a5d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2649fd>
      d179a0:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
      d179a7:	5b                   	pop    rbx

### 0xd183c1 from 0xd1813a..0xd18442
      d18393:	45 31 f6             	xor    r14d,r14d
      d18396:	a8 01                	test   al,0x1
      d18398:	74 2c                	je     d183c6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x265366>
      d1839a:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
      d1839e:	48 8b bb 08 04 00 00 	mov    rdi,QWORD PTR [rbx+0x408]
      d183a5:	31 f6                	xor    esi,esi
      d183a7:	e8 ae 6f 00 00       	call   d1f35a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c2fa>
      d183ac:	48 89 df             	mov    rdi,rbx
      d183af:	4c 89 f6             	mov    rsi,r14
      d183b2:	e8 f3 dc ff ff       	call   d160aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26304a>
      d183b7:	48 81 c3 c8 04 00 00 	add    rbx,0x4c8
      d183be:	48 89 df             	mov    rdi,rbx
      d183c1:	e8 e2 06 e1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d183c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d183cd:	00 00 
      d183cf:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
      d183d6:	00 
      d183d7:	75 64                	jne    d1843d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2653dd>
      d183d9:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
      d183e0:	5b                   	pop    rbx
      d183e1:	41 5c                	pop    r12
      d183e3:	41 5d                	pop    r13
      d183e5:	41 5e                	pop    r14
      d183e7:	41 5f                	pop    r15
      d183e9:	5d                   	pop    rbp
      d183ea:	c3                   	ret

### 0xd19751 from 0xd18812..0xd1a196
      d19723:	41 80 bc 24 40 02 00 	cmp    BYTE PTR [r12+0x240],0x0
      d1972a:	00 00 
      d1972c:	75 09                	jne    d19737 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2666d7>
      d1972e:	41 c6 84 24 40 02 00 	mov    BYTE PTR [r12+0x240],0x1
      d19735:	00 01 
      d19737:	49 89 84 24 38 02 00 	mov    QWORD PTR [r12+0x238],rax
      d1973e:	00 
      d1973f:	4c 89 e7             	mov    rdi,r12
      d19742:	31 f6                	xor    esi,esi
      d19744:	e8 61 c9 ff ff       	call   d160aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26304a>
      d19749:	49 8d bc 24 c8 04 00 	lea    rdi,[r12+0x4c8]
      d19750:	00 
      d19751:	e8 52 f3 e0 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d19756:	49 8b bc 24 48 02 00 	mov    rdi,QWORD PTR [r12+0x248]
      d1975d:	00 
      d1975e:	48 85 ff             	test   rdi,rdi
      d19761:	74 06                	je     d19769 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x266709>
      d19763:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d19766:	ff 50 28             	call   QWORD PTR [rax+0x28]
      d19769:	83 a4 24 e0 00 00 00 	and    DWORD PTR [rsp+0xe0],0x0
      d19770:	00 
      d19771:	48 83 a4 24 e8 00 00 	and    QWORD PTR [rsp+0xe8],0x0
      d19778:	00 00 
      d1977a:	83 a4 24 f0 00 00 00 	and    DWORD PTR [rsp+0xf0],0x0
      d19781:	00 
      d19782:	66 0f ef c0          	pxor   xmm0,xmm0

### 0xd2fc27 from 0xd2fc04..0xd2fc35
      d2fbfa:	e8 d1 00 d4 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d2fbff:	e8 ac fe ab 00       	call   17efab0 <__stack_chk_fail@plt>
      d2fc04:	53                   	push   rbx
      d2fc05:	48 89 fb             	mov    rbx,rdi
      d2fc08:	83 7f 48 01          	cmp    DWORD PTR [rdi+0x48],0x1
      d2fc0c:	75 1e                	jne    d2fc2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27cbcc>
      d2fc0e:	c7 43 48 02 00 00 00 	mov    DWORD PTR [rbx+0x48],0x2
      d2fc15:	48 89 df             	mov    rdi,rbx
      d2fc18:	e8 57 00 00 00       	call   d2fc74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27cc14>
      d2fc1d:	bf 70 01 00 00       	mov    edi,0x170
      d2fc22:	48 03 7b 30          	add    rdi,QWORD PTR [rbx+0x30]
      d2fc26:	5b                   	pop    rbx
      d2fc27:	e9 7c 8e df ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d2fc2c:	48 89 df             	mov    rdi,rbx
      d2fc2f:	5b                   	pop    rbx
      d2fc30:	e9 01 00 00 00       	jmp    d2fc36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27cbd6>
      d2fc35:	cc                   	int3
      d2fc36:	53                   	push   rbx
      d2fc37:	48 89 fb             	mov    rbx,rdi
      d2fc3a:	8b 47 48             	mov    eax,DWORD PTR [rdi+0x48]
      d2fc3d:	83 f8 03             	cmp    eax,0x3
      d2fc40:	75 1e                	jne    d2fc60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27cc00>
      d2fc42:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
      d2fc46:	48 8d 35 f4 70 64 ff 	lea    rsi,[rip+0xffffffffff6470f4]        # 376d41 <_ZTSSt12bad_any_cast@@Base-0x19487>
      d2fc4d:	6a 13                	push   0x13
      d2fc4f:	5a                   	pop    rdx

### 0xd2ffda from 0xd2ff48..0xd3013f
      d2ffa7:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
      d2ffac:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
      d2ffb1:	48 8b 83 f0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2f0]
      d2ffb8:	4e 8b 2c f8          	mov    r13,QWORD PTR [rax+r15*8]
      d2ffbc:	41 8b 45 18          	mov    eax,DWORD PTR [r13+0x18]
      d2ffc0:	83 f8 04             	cmp    eax,0x4
      d2ffc3:	74 1f                	je     d2ffe4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27cf84>
      d2ffc5:	83 f8 01             	cmp    eax,0x1
      d2ffc8:	0f 85 da 00 00 00    	jne    d300a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27d048>
      d2ffce:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
      d2ffd2:	b8 70 01 00 00       	mov    eax,0x170
      d2ffd7:	48 01 c7             	add    rdi,rax
      d2ffda:	e8 c9 8a df ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d2ffdf:	e9 c4 00 00 00       	jmp    d300a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27d048>
      d2ffe4:	49 8d 75 20          	lea    rsi,[r13+0x20]
      d2ffe8:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d2ffed:	e8 4e df ab 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d2fff2:	49 83 c5 40          	add    r13,0x40
      d2fff6:	48 89 ef             	mov    rdi,rbp
      d2fff9:	4c 89 ee             	mov    rsi,r13
      d2fffc:	e8 3f df ab 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d30001:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
      d30005:	4c 8b 70 40          	mov    r14,QWORD PTR [rax+0x40]
      d30009:	4c 8b 68 48          	mov    r13,QWORD PTR [rax+0x48]
      d3000d:	4d 39 ee             	cmp    r14,r13
      d30010:	0f 84 80 00 00 00    	je     d30096 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27d036>

### 0xd621c3 from 0xd62166..0xd62210
      d6219a:	48 89 df             	mov    rdi,rbx
      d6219d:	4c 89 f6             	mov    rsi,r14
      d621a0:	4c 89 e2             	mov    rdx,r12
      d621a3:	e8 22 7e a7 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      d621a8:	4c 89 e7             	mov    rdi,r12
      d621ab:	e8 38 86 a7 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      d621b0:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      d621b4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d621b7:	ff 50 58             	call   QWORD PTR [rax+0x58]
      d621ba:	83 78 20 00          	cmp    DWORD PTR [rax+0x20],0x0
      d621be:	7e 08                	jle    d621c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f24e>
      d621c0:	4c 89 f7             	mov    rdi,r14
      d621c3:	e8 e0 68 dc ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d621c8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d621cf:	00 00 
      d621d1:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      d621d6:	75 33                	jne    d6220b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f291>
      d621d8:	48 89 d8             	mov    rax,rbx
      d621db:	48 83 c4 48          	add    rsp,0x48
      d621df:	5b                   	pop    rbx
      d621e0:	41 5c                	pop    r12
      d621e2:	41 5e                	pop    r14
      d621e4:	41 5f                	pop    r15
      d621e6:	c3                   	ret
      d621e7:	49 89 c6             	mov    r14,rax
      d621ea:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]

### 0xd63d8c from 0xd63cfe..0xd63e10
      d63d60:	89 06                	mov    DWORD PTR [rsi],eax
      d63d62:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      d63d66:	e8 25 a0 d5 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      d63d6b:	eb 59                	jmp    d63dc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e4c>
      d63d6d:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      d63d71:	49 63 76 50          	movsxd rsi,DWORD PTR [r14+0x50]
      d63d75:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d63d78:	ff 50 68             	call   QWORD PTR [rax+0x68]
      d63d7b:	41 80 7e 54 00       	cmp    BYTE PTR [r14+0x54],0x0
      d63d80:	74 0f                	je     d63d91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e17>
      d63d82:	49 81 c7 f0 00 00 00 	add    r15,0xf0
      d63d89:	4c 89 ff             	mov    rdi,r15
      d63d8c:	e8 17 4d dc ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d63d91:	45 8b 46 50          	mov    r8d,DWORD PTR [r14+0x50]
      d63d95:	48 8d 35 e0 e1 6e ff 	lea    rsi,[rip+0xffffffffff6ee1e0]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      d63d9c:	48 8d 0d e8 c1 61 ff 	lea    rcx,[rip+0xffffffffff61c1e8]        # 37ff8b <_ZTSSt12bad_any_cast@@Base-0x1023d>
      d63da3:	6a 04                	push   0x4
      d63da5:	5f                   	pop    rdi
      d63da6:	ba 05 01 00 00       	mov    edx,0x105
      d63dab:	31 c0                	xor    eax,eax
      d63dad:	e8 20 2b a7 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      d63db2:	48 8d 74 24 24       	lea    rsi,[rsp+0x24]
      d63db7:	c7 06 cc 00 00 00    	mov    DWORD PTR [rsi],0xcc
      d63dbd:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      d63dc1:	e8 ca 9f d5 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      d63dc6:	48 89 df             	mov    rdi,rbx

### 0xd64948 from 0xd64886..0xd649b4
      d64919:	41 8d 46 ff          	lea    eax,[r14-0x1]
      d6491d:	31 c9                	xor    ecx,ecx
      d6491f:	83 f8 07             	cmp    eax,0x7
      d64922:	41 0f 42 ce          	cmovb  ecx,r14d
      d64926:	41 89 4f 24          	mov    DWORD PTR [r15+0x24],ecx
      d6492a:	41 80 4f 10 04       	or     BYTE PTR [r15+0x10],0x4
      d6492f:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
      d64933:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d64936:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      d6493b:	ff 50 60             	call   QWORD PTR [rax+0x60]
      d6493e:	48 81 c3 f0 00 00 00 	add    rbx,0xf0
      d64945:	48 89 df             	mov    rdi,rbx
      d64948:	e8 5b 41 dc ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d6494d:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      d64952:	e8 dd 13 88 00       	call   15e5d34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42b2b8>
      d64957:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d6495e:	00 00 
      d64960:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      d64965:	75 48                	jne    d649af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a35>
      d64967:	48 83 c4 60          	add    rsp,0x60
      d6496b:	5b                   	pop    rbx
      d6496c:	41 5c                	pop    r12
      d6496e:	41 5e                	pop    r14
      d64970:	41 5f                	pop    r15
      d64972:	5d                   	pop    rbp
      d64973:	c3                   	ret

### 0xd711ec from 0xd70fde..0xd71310
      d711bd:	e8 ee f8 ff ff       	call   d70ab0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3db36>
      d711c2:	48 89 df             	mov    rdi,rbx
      d711c5:	4c 89 e6             	mov    rsi,r12
      d711c8:	e8 df 01 00 00       	call   d713ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e432>
      d711cd:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d711d2:	4c 89 f6             	mov    rsi,r14
      d711d5:	e8 b6 03 00 00       	call   d71590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e616>
      d711da:	49 89 c6             	mov    r14,rax
      d711dd:	48 83 bb 78 04 00 00 	cmp    QWORD PTR [rbx+0x478],0x0
      d711e4:	00 
      d711e5:	75 0a                	jne    d711f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e277>
      d711e7:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d711ec:	e8 b7 78 db ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d711f1:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      d711f6:	e8 95 cc a7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d711fb:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d71200:	e8 8b cc a7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d71205:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      d7120a:	e8 81 cc a7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d7120f:	41 b4 01             	mov    r12b,0x1
      d71212:	eb 03                	jmp    d71217 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e29d>
      d71214:	4d 8b 36             	mov    r14,QWORD PTR [r14]
      d71217:	4d 85 f6             	test   r14,r14
      d7121a:	0f 85 18 fe ff ff    	jne    d71038 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0be>
      d71220:	41 f6 c4 01          	test   r12b,0x1
      d71224:	74 7c                	je     d712a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e328>

### 0xd76c4c from 0xd758e4..0xd772d2
      d76c13:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      d76c1a:	00 
      d76c1b:	e8 44 5f d4 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
      d76c20:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d76c25:	e8 3a 5f d4 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
      d76c2a:	83 bb 28 06 00 00 00 	cmp    DWORD PTR [rbx+0x628],0x0
      d76c31:	0f 95 c0             	setne  al
      d76c34:	38 83 14 02 00 00    	cmp    BYTE PTR [rbx+0x214],al
      d76c3a:	74 15                	je     d76c51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43cd7>
      d76c3c:	88 83 14 02 00 00    	mov    BYTE PTR [rbx+0x214],al
      d76c42:	48 81 c3 48 09 00 00 	add    rbx,0x948
      d76c49:	48 89 df             	mov    rdi,rbx
      d76c4c:	e8 57 1e db ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d76c51:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d76c58:	00 00 
      d76c5a:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]
      d76c61:	00 
      d76c62:	0f 85 65 06 00 00    	jne    d772cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44353>
      d76c68:	48 81 c4 98 01 00 00 	add    rsp,0x198
      d76c6f:	5b                   	pop    rbx
      d76c70:	41 5c                	pop    r12
      d76c72:	41 5d                	pop    r13
      d76c74:	41 5e                	pop    r14
      d76c76:	41 5f                	pop    r15
      d76c78:	5d                   	pop    rbp
      d76c79:	c3                   	ret

### 0xd7e710 from 0xd7e33e..0xd7eb7e
      d7e6de:	49 8b 55 00          	mov    rdx,QWORD PTR [r13+0x0]
      d7e6e2:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      d7e6e7:	48 ff c1             	inc    rcx
      d7e6ea:	48 39 c8             	cmp    rax,rcx
      d7e6ed:	75 ef                	jne    d7e6de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b764>
      d7e6ef:	48 83 a3 20 05 00 00 	and    QWORD PTR [rbx+0x520],0x0
      d7e6f6:	00 
      d7e6f7:	48 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],rbp
      d7e6fc:	48 89 df             	mov    rdi,rbx
      d7e6ff:	e8 d0 2f ff ff       	call   d716d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e75a>
      d7e704:	48 8d bb 50 0a 00 00 	lea    rdi,[rbx+0xa50]
      d7e70b:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
      d7e710:	e8 93 a3 da ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d7e715:	48 8b ac 24 80 00 00 	mov    rbp,QWORD PTR [rsp+0x80]
      d7e71c:	00 
      d7e71d:	4c 8b a4 24 88 00 00 	mov    r12,QWORD PTR [rsp+0x88]
      d7e724:	00 
      d7e725:	4c 8d b3 e8 07 00 00 	lea    r14,[rbx+0x7e8]
      d7e72c:	4c 39 e5             	cmp    rbp,r12
      d7e72f:	74 38                	je     d7e769 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b7ef>
      d7e731:	4c 89 f7             	mov    rdi,r14
      d7e734:	48 89 ee             	mov    rsi,rbp
      d7e737:	e8 24 d5 fa ff       	call   d2bc60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x278c00>
      d7e73c:	48 83 c5 58          	add    rbp,0x58
      d7e740:	4c 39 e5             	cmp    rbp,r12
      d7e743:	75 ec                	jne    d7e731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b7b7>

### 0xd7f056 from 0xd7ef42..0xd7fb79
      d7f021:	75 da                	jne    d7effd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c083>
      d7f023:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
      d7f028:	89 7c 24 2c          	mov    DWORD PTR [rsp+0x2c],edi
      d7f02c:	44 89 7c 24 3c       	mov    DWORD PTR [rsp+0x3c],r15d
      d7f031:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
      d7f038:	4c 8b b3 78 04 00 00 	mov    r14,QWORD PTR [rbx+0x478]
      d7f03f:	4c 89 e6             	mov    rsi,r12
      d7f042:	e8 6b a7 fe ff       	call   d697b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36838>
      d7f047:	49 89 c5             	mov    r13,rax
      d7f04a:	4d 85 f6             	test   r14,r14
      d7f04d:	75 0c                	jne    d7f05b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c0e1>
      d7f04f:	48 8d bb 50 0a 00 00 	lea    rdi,[rbx+0xa50]
      d7f056:	e8 4d 9a da ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d7f05b:	48 8b bb b8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb8]
      d7f062:	4c 89 ee             	mov    rsi,r13
      d7f065:	e8 5e d2 00 00       	call   d8c2c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5934e>
      d7f06a:	41 8b 45 38          	mov    eax,DWORD PTR [r13+0x38]
      d7f06e:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
      d7f072:	85 c0                	test   eax,eax
      d7f074:	4c 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],r13
      d7f079:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
      d7f07e:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      d7f083:	0f 84 d6 01 00 00    	je     d7f25f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c2e5>
      d7f089:	49 8d 7d 58          	lea    rdi,[r13+0x58]
      d7f08d:	e8 5c 06 d2 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      d7f092:	84 c0                	test   al,al

### 0xd80ca9 from 0xd80a68..0xd80e75
      d80c7b:	e8 42 84 de ff       	call   b690c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6062>
      d80c80:	48 85 c0             	test   rax,rax
      d80c83:	74 0b                	je     d80c90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4dd16>
      d80c85:	4c 89 ff             	mov    rdi,r15
      d80c88:	48 89 c6             	mov    rsi,rax
      d80c8b:	e8 00 09 ff ff       	call   d71590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e616>
      d80c90:	48 89 df             	mov    rdi,rbx
      d80c93:	e8 3c 0a ff ff       	call   d716d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e75a>
      d80c98:	48 83 bb 78 04 00 00 	cmp    QWORD PTR [rbx+0x478],0x0
      d80c9f:	00 
      d80ca0:	75 0c                	jne    d80cae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4dd34>
      d80ca2:	48 8d bb 50 0a 00 00 	lea    rdi,[rbx+0xa50]
      d80ca9:	e8 fa 7d da ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d80cae:	48 8d 35 66 ec 5c ff 	lea    rsi,[rip+0xffffffffff5cec66]        # 34f91b <_ZTSSt12bad_any_cast@@Base-0x408ad>
      d80cb5:	6a 0c                	push   0xc
      d80cb7:	5a                   	pop    rdx
      d80cb8:	48 89 df             	mov    rdi,rbx
      d80cbb:	e8 da 0a ff ff       	call   d7179a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e820>
      d80cc0:	80 bb f1 01 00 00 00 	cmp    BYTE PTR [rbx+0x1f1],0x0
      d80cc7:	b8 e0 93 04 00       	mov    eax,0x493e0
      d80ccc:	b9 f4 01 00 00       	mov    ecx,0x1f4
      d80cd1:	48 0f 44 c8          	cmove  rcx,rax
      d80cd5:	48 8d 05 3c 0f 6d ff 	lea    rax,[rip+0xffffffffff6d0f3c]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      d80cdc:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      d80ce1:	48 89 06             	mov    QWORD PTR [rsi],rax
      d80ce4:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax

### 0xd8333c from 0xd8322a..0xd83369
      d83306:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
      d8330b:	88 0a                	mov    BYTE PTR [rdx],cl
      d8330d:	88 4a 10             	mov    BYTE PTR [rdx+0x10],cl
      d83310:	48 89 e6             	mov    rsi,rsp
      d83313:	4c 89 26             	mov    QWORD PTR [rsi],r12
      d83316:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d8331a:	48 8b bb 60 07 00 00 	mov    rdi,QWORD PTR [rbx+0x760]
      d83321:	e8 6a aa d3 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      d83326:	48 8d bb 70 0d 00 00 	lea    rdi,[rbx+0xd70]
      d8332d:	e8 c6 f8 fe ff       	call   d72bf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fc7e>
      d83332:	48 81 c3 50 0a 00 00 	add    rbx,0xa50
      d83339:	48 89 df             	mov    rdi,rbx
      d8333c:	e8 67 57 da ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d83341:	45 84 ff             	test   r15b,r15b
      d83344:	0f 95 c0             	setne  al
      d83347:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      d8334e:	00 00 
      d83350:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
      d83355:	75 0d                	jne    d83364 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x503ea>
      d83357:	48 83 c4 30          	add    rsp,0x30
      d8335b:	5b                   	pop    rbx
      d8335c:	41 5c                	pop    r12
      d8335e:	41 5e                	pop    r14
      d83360:	41 5f                	pop    r15
      d83362:	5d                   	pop    rbp
      d83363:	c3                   	ret

### 0xd85a10 from 0xd85900..0xd85a40
      d859d7:	74 30                	je     d85a09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52a8f>
      d859d9:	80 bb e9 01 00 00 00 	cmp    BYTE PTR [rbx+0x1e9],0x0
      d859e0:	74 09                	je     d859eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52a71>
      d859e2:	80 bb ea 01 00 00 00 	cmp    BYTE PTR [rbx+0x1ea],0x0
      d859e9:	75 1e                	jne    d85a09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52a8f>
      d859eb:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      d859f0:	c7 06 24 00 00 00    	mov    DWORD PTR [rsi],0x24
      d859f6:	48 8d 05 1b 1c b6 00 	lea    rax,[rip+0xb61c1b]        # 18e7618 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2ea28>
      d859fd:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d85a01:	48 89 df             	mov    rdi,rbx
      d85a04:	e8 51 f1 fe ff       	call   d74b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41be0>
      d85a09:	48 8d bb 50 0a 00 00 	lea    rdi,[rbx+0xa50]
      d85a10:	e8 93 30 da ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d85a15:	45 84 f6             	test   r14b,r14b
      d85a18:	74 08                	je     d85a22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52aa8>
      d85a1a:	48 89 df             	mov    rdi,rbx
      d85a1d:	e8 2a 3f ff ff       	call   d7994c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x469d2>
      d85a22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d85a29:	00 00 
      d85a2b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      d85a30:	75 09                	jne    d85a3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52ac1>
      d85a32:	48 83 c4 20          	add    rsp,0x20
      d85a36:	5b                   	pop    rbx
      d85a37:	41 5e                	pop    r14
      d85a39:	5d                   	pop    rbp
      d85a3a:	c3                   	ret

### 0xd97e1a from 0xd97e0e..0xd97e1f
      d97df2:	45 89 f0             	mov    r8d,r14d
      d97df5:	41 89 c1             	mov    r9d,eax
      d97df8:	b0 01                	mov    al,0x1
      d97dfa:	e8 d3 ea a3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      d97dff:	48 89 df             	mov    rdi,rbx
      d97e02:	48 83 c4 08          	add    rsp,0x8
      d97e06:	5b                   	pop    rbx
      d97e07:	41 5e                	pop    r14
      d97e09:	e9 80 00 00 00       	jmp    d97e8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64f14>
      d97e0e:	48 83 a7 48 01 00 00 	and    QWORD PTR [rdi+0x148],0x0
      d97e15:	00 
      d97e16:	48 83 c7 50          	add    rdi,0x50
      d97e1a:	e9 89 0c d9 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d97e1f:	cc                   	int3
      d97e20:	53                   	push   rbx
      d97e21:	48 89 fb             	mov    rbx,rdi
      d97e24:	48 83 a7 48 01 00 00 	and    QWORD PTR [rdi+0x148],0x0
      d97e2b:	00 
      d97e2c:	48 83 c7 50          	add    rdi,0x50
      d97e30:	e8 73 0c d9 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d97e35:	80 7b 28 00          	cmp    BYTE PTR [rbx+0x28],0x0
      d97e39:	74 04                	je     d97e3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64ec5>
      d97e3b:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
      d97e3f:	5b                   	pop    rbx
      d97e40:	c3                   	ret
      d97e41:	cc                   	int3

### 0xd97e30 from 0xd97e20..0xd97e41
      d97e07:	41 5e                	pop    r14
      d97e09:	e9 80 00 00 00       	jmp    d97e8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64f14>
      d97e0e:	48 83 a7 48 01 00 00 	and    QWORD PTR [rdi+0x148],0x0
      d97e15:	00 
      d97e16:	48 83 c7 50          	add    rdi,0x50
      d97e1a:	e9 89 0c d9 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d97e1f:	cc                   	int3
      d97e20:	53                   	push   rbx
      d97e21:	48 89 fb             	mov    rbx,rdi
      d97e24:	48 83 a7 48 01 00 00 	and    QWORD PTR [rdi+0x148],0x0
      d97e2b:	00 
      d97e2c:	48 83 c7 50          	add    rdi,0x50
      d97e30:	e8 73 0c d9 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d97e35:	80 7b 28 00          	cmp    BYTE PTR [rbx+0x28],0x0
      d97e39:	74 04                	je     d97e3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64ec5>
      d97e3b:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
      d97e3f:	5b                   	pop    rbx
      d97e40:	c3                   	ret
      d97e41:	cc                   	int3
      d97e42:	e9 47 00 00 00       	jmp    d97e8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64f14>
      d97e47:	cc                   	int3
      d97e48:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
      d97e4c:	e9 f9 fe ff ff       	jmp    d97d4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64dd0>
      d97e51:	cc                   	int3
      d97e52:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
      d97e56:	e9 07 ff ff ff       	jmp    d97d62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64de8>

### 0xd97f2f from 0xd97f2a..0xd97f3e
      d97f0c:	00 00 
      d97f0e:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      d97f13:	75 08                	jne    d97f1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64fa3>
      d97f15:	48 83 c4 48          	add    rsp,0x48
      d97f19:	5b                   	pop    rbx
      d97f1a:	41 5e                	pop    r14
      d97f1c:	c3                   	ret
      d97f1d:	e8 8e 7b a5 00       	call   17efab0 <__stack_chk_fail@plt>
      d97f22:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      d97f25:	e9 00 00 00 00       	jmp    d97f2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64fb0>
      d97f2a:	50                   	push   rax
      d97f2b:	48 83 c7 50          	add    rdi,0x50
      d97f2f:	e8 74 0b d9 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d97f34:	58                   	pop    rax
      d97f35:	c3                   	ret
      d97f36:	48 89 c7             	mov    rdi,rax
      d97f39:	e8 67 1b ce ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      d97f3e:	41 57                	push   r15
      d97f40:	41 56                	push   r14
      d97f42:	41 54                	push   r12
      d97f44:	53                   	push   rbx
      d97f45:	50                   	push   rax
      d97f46:	48 39 f7             	cmp    rdi,rsi
      d97f49:	74 26                	je     d97f71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64ff7>
      d97f4b:	49 89 d6             	mov    r14,rdx
      d97f4e:	49 89 f4             	mov    r12,rsi

### 0xdd0f59 from 0xdd0cca..0xdd348d
      dd0f24:	75 d9                	jne    dd0eff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9df85>
      dd0f26:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
      dd0f2a:	49 8b 97 10 02 00 00 	mov    rdx,QWORD PTR [r15+0x210]
      dd0f31:	48 89 df             	mov    rdi,rbx
      dd0f34:	4c 89 f6             	mov    rsi,r14
      dd0f37:	e8 dc 60 e4 ff       	call   c17018 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163fb8>
      dd0f3c:	49 8b 87 10 02 00 00 	mov    rax,QWORD PTR [r15+0x210]
      dd0f43:	49 2b 87 08 02 00 00 	sub    rax,QWORD PTR [r15+0x208]
      dd0f4a:	4c 39 e8             	cmp    rax,r13
      dd0f4d:	74 0f                	je     dd0f5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dfe4>
      dd0f4f:	49 81 c7 d0 00 00 00 	add    r15,0xd0
      dd0f56:	4c 89 ff             	mov    rdi,r15
      dd0f59:	e8 4a 7b d5 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dd0f5e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      dd0f65:	00 
      dd0f66:	e8 ad 1e e4 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      dd0f6b:	e9 84 fd ff ff       	jmp    dd0cf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dd7a>
      dd0f70:	48 8d 94 24 70 01 00 	lea    rdx,[rsp+0x170]
      dd0f77:	00 
      dd0f78:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      dd0f7b:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      dd0f80:	48 8d 35 69 3f c2 00 	lea    rsi,[rip+0xc23f69]        # 19f4ef0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2faf>
      dd0f87:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
      dd0f8e:	00 
      dd0f8f:	e8 76 94 a0 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
      dd0f94:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]

### 0xdd3022 from 0xdd0cca..0xdd348d
      dd2ff5:	00 
      dd2ff6:	48 89 de             	mov    rsi,rbx
      dd2ff9:	e8 c4 13 00 00       	call   dd43c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1448>
      dd2ffe:	48 89 df             	mov    rdi,rbx
      dd3001:	e8 06 04 e4 ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
      dd3006:	48 8d 35 27 e9 57 ff 	lea    rsi,[rip+0xffffffffff57e927]        # 351934 <_ZTSSt12bad_any_cast@@Base-0x3e894>
      dd300d:	6a 07                	push   0x7
      dd300f:	5a                   	pop    rdx
      dd3010:	4c 89 e7             	mov    rdi,r12
      dd3013:	e8 0c 14 00 00       	call   dd4424 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa14aa>
      dd3018:	49 81 c4 d0 00 00 00 	add    r12,0xd0
      dd301f:	4c 89 e7             	mov    rdi,r12
      dd3022:	e8 81 5a d5 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dd3027:	e9 c9 00 00 00       	jmp    dd30f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa017b>
      dd302c:	48 89 df             	mov    rdi,rbx
      dd302f:	e8 5a 04 00 00       	call   dd348e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0514>
      dd3034:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
      dd303b:	00 
      dd303c:	41 0f 11 84 24 e0 01 	movups XMMWORD PTR [r12+0x1e0],xmm0
      dd3043:	00 00 
      dd3045:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      dd304c:	00 
      dd304d:	49 89 84 24 f0 01 00 	mov    QWORD PTR [r12+0x1f0],rax
      dd3054:	00 
      dd3055:	0f 57 c0             	xorps  xmm0,xmm0
      dd3058:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0

### 0xdd473b from 0xdd4558..0xdd47bb
      dd470d:	48 8d 05 20 d2 57 ff 	lea    rax,[rip+0xffffffffff57d220]        # 351934 <_ZTSSt12bad_any_cast@@Base-0x3e894>
      dd4714:	48 8d 35 71 b9 5a ff 	lea    rsi,[rip+0xffffffffff5ab971]        # 38008c <_ZTSSt12bad_any_cast@@Base-0x1013c>
      dd471b:	48 0f 44 f0          	cmove  rsi,rax
      dd471f:	6a 07                	push   0x7
      dd4721:	58                   	pop    rax
      dd4722:	6a 0e                	push   0xe
      dd4724:	5a                   	pop    rdx
      dd4725:	48 0f 44 d0          	cmove  rdx,rax
      dd4729:	48 89 df             	mov    rdi,rbx
      dd472c:	e8 f3 fc ff ff       	call   dd4424 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa14aa>
      dd4731:	48 81 c3 d0 00 00 00 	add    rbx,0xd0
      dd4738:	48 89 df             	mov    rdi,rbx
      dd473b:	e8 68 43 d5 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dd4740:	eb 0d                	jmp    dd474f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa17d5>
      dd4742:	45 85 f6             	test   r14d,r14d
      dd4745:	75 08                	jne    dd474f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa17d5>
      dd4747:	48 89 df             	mov    rdi,rbx
      dd474a:	e8 5f fb ff ff       	call   dd42ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1334>
      dd474f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dd4756:	00 00 
      dd4758:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
      dd475f:	00 
      dd4760:	75 12                	jne    dd4774 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa17fa>
      dd4762:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
      dd4769:	5b                   	pop    rbx
      dd476a:	41 5c                	pop    r12

### 0xddf6a7 from 0xddf69c..0xddf6ac
      ddf682:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ddf685:	8b 40 0c             	mov    eax,DWORD PTR [rax+0xc]
      ddf688:	85 c0                	test   eax,eax
      ddf68a:	74 03                	je     ddf68f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac715>
      ddf68c:	89 07                	mov    DWORD PTR [rdi],eax
      ddf68e:	c3                   	ret
      ddf68f:	48 8d 15 f1 79 55 ff 	lea    rdx,[rip+0xffffffffff5579f1]        # 337087 <_ZTSSt12bad_any_cast@@Base-0x59141>
      ddf696:	e9 19 d1 89 00       	jmp    167c7b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30920>
      ddf69b:	cc                   	int3
      ddf69c:	b8 98 00 00 00       	mov    eax,0x98
      ddf6a1:	48 03 07             	add    rax,QWORD PTR [rdi]
      ddf6a4:	48 89 c7             	mov    rdi,rax
      ddf6a7:	e9 fc 93 d4 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ddf6ac:	53                   	push   rbx
      ddf6ad:	48 89 fb             	mov    rbx,rdi
      ddf6b0:	6a 10                	push   0x10
      ddf6b2:	5f                   	pop    rdi
      ddf6b3:	e8 48 e8 a0 00       	call   17edf00 <_Znwm@plt>
      ddf6b8:	48 8d 0d 99 b8 a4 00 	lea    rcx,[rip+0xa4b899]        # 182af58 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7588>
      ddf6bf:	48 89 08             	mov    QWORD PTR [rax],rcx
      ddf6c2:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      ddf6c6:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      ddf6ca:	5b                   	pop    rbx
      ddf6cb:	c3                   	ret
      ddf6cc:	48 8d 05 85 b8 a4 00 	lea    rax,[rip+0xa4b885]        # 182af58 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7588>
      ddf6d3:	48 89 06             	mov    QWORD PTR [rsi],rax

### 0xddf6ec from 0xddf6e0..0xddf6f1
      ddf6c6:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      ddf6ca:	5b                   	pop    rbx
      ddf6cb:	c3                   	ret
      ddf6cc:	48 8d 05 85 b8 a4 00 	lea    rax,[rip+0xa4b885]        # 182af58 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7588>
      ddf6d3:	48 89 06             	mov    QWORD PTR [rsi],rax
      ddf6d6:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      ddf6da:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      ddf6de:	c3                   	ret
      ddf6df:	cc                   	int3
      ddf6e0:	b8 98 00 00 00       	mov    eax,0x98
      ddf6e5:	48 03 47 08          	add    rax,QWORD PTR [rdi+0x8]
      ddf6e9:	48 89 c7             	mov    rdi,rax
      ddf6ec:	e9 b7 93 d4 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ddf6f1:	cc                   	int3
      ddf6f2:	53                   	push   rbx
      ddf6f3:	48 89 fb             	mov    rbx,rdi
      ddf6f6:	48 81 c7 f0 00 00 00 	add    rdi,0xf0
      ddf6fd:	e8 26 a7 c9 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
      ddf702:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
      ddf709:	e8 58 a7 9f 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ddf70e:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
      ddf715:	e8 ba a4 9f 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      ddf71a:	48 83 c3 10          	add    rbx,0x10
      ddf71e:	48 89 df             	mov    rdi,rbx
      ddf721:	5b                   	pop    rbx
      ddf722:	e9 87 57 e5 ff       	jmp    c34eae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181e4e>

### 0xdfd1b6 from 0xdfd19c..0xdfd1c5
      dfd18f:	eb 02                	jmp    dfd193 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca219>
      dfd191:	eb 00                	jmp    dfd193 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca219>
      dfd193:	48 89 c7             	mov    rdi,rax
      dfd196:	e8 0a c9 c7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      dfd19b:	cc                   	int3
      dfd19c:	53                   	push   rbx
      dfd19d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      dfd1a0:	bf 90 00 00 00       	mov    edi,0x90
      dfd1a5:	48 03 7b 08          	add    rdi,QWORD PTR [rbx+0x8]
      dfd1a9:	e8 e4 1a 00 00       	call   dfec92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcbd18>
      dfd1ae:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      dfd1b2:	48 83 c7 18          	add    rdi,0x18
      dfd1b6:	e8 ed b8 d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfd1bb:	5b                   	pop    rbx
      dfd1bc:	c3                   	ret
      dfd1bd:	48 89 c7             	mov    rdi,rax
      dfd1c0:	e8 e0 c8 c7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      dfd1c5:	cc                   	int3
      dfd1c6:	50                   	push   rax
      dfd1c7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dfd1ca:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      dfd1ce:	48 83 c7 18          	add    rdi,0x18
      dfd1d2:	e8 d1 b8 d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfd1d7:	58                   	pop    rax
      dfd1d8:	c3                   	ret
      dfd1d9:	48 89 c7             	mov    rdi,rax

### 0xdfd1d2 from 0xdfd1c6..0xdfd1e1
      dfd1ae:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      dfd1b2:	48 83 c7 18          	add    rdi,0x18
      dfd1b6:	e8 ed b8 d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfd1bb:	5b                   	pop    rbx
      dfd1bc:	c3                   	ret
      dfd1bd:	48 89 c7             	mov    rdi,rax
      dfd1c0:	e8 e0 c8 c7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      dfd1c5:	cc                   	int3
      dfd1c6:	50                   	push   rax
      dfd1c7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dfd1ca:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      dfd1ce:	48 83 c7 18          	add    rdi,0x18
      dfd1d2:	e8 d1 b8 d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfd1d7:	58                   	pop    rax
      dfd1d8:	c3                   	ret
      dfd1d9:	48 89 c7             	mov    rdi,rax
      dfd1dc:	e8 c4 c8 c7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      dfd1e1:	cc                   	int3
      dfd1e2:	41 56                	push   r14
      dfd1e4:	53                   	push   rbx
      dfd1e5:	48 83 ec 48          	sub    rsp,0x48
      dfd1e9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dfd1f0:	00 00 
      dfd1f2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      dfd1f7:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
      dfd1fa:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]

### 0xdfd37d from 0xdfd2e0..0xdfd394
      dfd34c:	49 8b 56 50          	mov    rdx,QWORD PTR [r14+0x50]
      dfd350:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      dfd355:	48 ff c1             	inc    rcx
      dfd358:	48 39 c8             	cmp    rax,rcx
      dfd35b:	75 ef                	jne    dfd34c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca3d2>
      dfd35d:	49 83 66 68 00       	and    QWORD PTR [r14+0x68],0x0
      dfd362:	4c 89 f7             	mov    rdi,r14
      dfd365:	e8 96 0d 9f 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
      dfd36a:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      dfd36e:	c6 80 51 01 00 00 01 	mov    BYTE PTR [rax+0x151],0x1
      dfd375:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      dfd379:	48 83 c7 18          	add    rdi,0x18
      dfd37d:	e8 26 b7 d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfd382:	48 83 c4 08          	add    rsp,0x8
      dfd386:	5b                   	pop    rbx
      dfd387:	41 5e                	pop    r14
      dfd389:	c3                   	ret
      dfd38a:	eb 00                	jmp    dfd38c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca412>
      dfd38c:	48 89 c7             	mov    rdi,rax
      dfd38f:	e8 11 c7 c7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      dfd394:	48 8d 05 f5 f3 a2 00 	lea    rax,[rip+0xa2f3f5]        # 182c790 <_ZTIN4asio2ip16bad_address_castE@@Base+0x8dc0>
      dfd39b:	48 89 07             	mov    QWORD PTR [rdi],rax
      dfd39e:	e9 6d 0c 9f 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      dfd3a3:	cc                   	int3
      dfd3a4:	53                   	push   rbx
      dfd3a5:	48 89 fb             	mov    rbx,rdi

### 0xdfdb0a from 0xdfd7e6..0xdfdb8d
      dfdadb:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      dfdade:	48 85 c9             	test   rcx,rcx
      dfdae1:	74 07                	je     dfdaea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcab70>
      dfdae3:	48 89 0a             	mov    QWORD PTR [rdx],rcx
      dfdae6:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      dfdaea:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      dfdaee:	48 89 c6             	mov    rsi,rax
      dfdaf1:	e8 28 c5 ca ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
      dfdaf6:	49 ff 84 24 10 01 00 	inc    QWORD PTR [r12+0x110]
      dfdafd:	00 
      dfdafe:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      dfdb03:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
      dfdb0a:	e8 99 af d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfdb0f:	66 49 0f 6e c7       	movq   xmm0,r15
      dfdb14:	f3 0f 7e 4c 24 10    	movq   xmm1,QWORD PTR [rsp+0x10]
      dfdb1a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      dfdb1e:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      dfdb23:	f3 0f 7f 0b          	movdqu XMMWORD PTR [rbx],xmm1
      dfdb27:	31 ff                	xor    edi,edi
      dfdb29:	e8 84 09 ca ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      dfdb2e:	4c 89 ff             	mov    rdi,r15
      dfdb31:	e8 50 09 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dfdb36:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      dfdb3b:	e8 1c a8 ca ff       	call   aa835c <JNI_OnUnload@@Base+0x2fc29>
      dfdb40:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dfdb47:	00 00 

### 0xdfdc9e from 0xdfdb8e..0xdfdcb0
      dfdc6e:	eb 81                	jmp    dfdbf1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcac77>
      dfdc70:	49 83 c7 09          	add    r15,0x9
      dfdc74:	48 8d 35 37 a7 57 ff 	lea    rsi,[rip+0xffffffffff57a737]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      dfdc7b:	48 8d 0d 6e 14 54 ff 	lea    rcx,[rip+0xffffffffff54146e]        # 33f0f0 <_ZTSSt12bad_any_cast@@Base-0x510d8>
      dfdc82:	6a 06                	push   0x6
      dfdc84:	5f                   	pop    rdi
      dfdc85:	ba 8b 00 00 00       	mov    edx,0x8b
      dfdc8a:	4d 89 f9             	mov    r9,r15
      dfdc8d:	31 c0                	xor    eax,eax
      dfdc8f:	e8 3e 8c 9d 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      dfdc94:	49 81 c6 a8 00 00 00 	add    r14,0xa8
      dfdc9b:	4c 89 f7             	mov    rdi,r14
      dfdc9e:	e8 05 ae d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfdca3:	e9 49 ff ff ff       	jmp    dfdbf1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcac77>
      dfdca8:	48 89 c7             	mov    rdi,rax
      dfdcab:	e8 f5 bd c7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      dfdcb0:	55                   	push   rbp
      dfdcb1:	41 57                	push   r15
      dfdcb3:	41 56                	push   r14
      dfdcb5:	41 55                	push   r13
      dfdcb7:	41 54                	push   r12
      dfdcb9:	53                   	push   rbx
      dfdcba:	48 81 ec 98 02 00 00 	sub    rsp,0x298
      dfdcc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dfdcc8:	00 00 
      dfdcca:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax

### 0xdfded6 from 0xdfdcb0..0xdfe3f9
      dfdea2:	4c 89 ee             	mov    rsi,r13
      dfdea5:	e8 70 0c 00 00       	call   dfeb1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcbba0>
      dfdeaa:	49 89 c5             	mov    r13,rax
      dfdead:	b0 01                	mov    al,0x1
      dfdeaf:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
      dfdeb3:	4c 3b 6c 24 28       	cmp    r13,QWORD PTR [rsp+0x28]
      dfdeb8:	0f 85 8b fe ff ff    	jne    dfdd49 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcadcf>
      dfdebe:	f6 44 24 0c 01       	test   BYTE PTR [rsp+0xc],0x1
      dfdec3:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      dfdec8:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      dfdecd:	74 0c                	je     dfdedb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcaf61>
      dfdecf:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
      dfded6:	e8 cd ab d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfdedb:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      dfdedf:	80 b8 51 01 00 00 00 	cmp    BYTE PTR [rax+0x151],0x0
      dfdee6:	0f 84 9b 04 00 00    	je     dfe387 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb40d>
      dfdeec:	48 8b 88 80 00 00 00 	mov    rcx,QWORD PTR [rax+0x80]
      dfdef3:	80 79 30 00          	cmp    BYTE PTR [rcx+0x30],0x0
      dfdef7:	0f 85 8a 04 00 00    	jne    dfe387 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb40d>
      dfdefd:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      dfdf02:	4c 8b 38             	mov    r15,QWORD PTR [rax]
      dfdf05:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
      dfdf0c:	00 00 
      dfdf0e:	48 8d 05 03 ea a2 00 	lea    rax,[rip+0xa2ea03]        # 182c918 <_ZTIN4asio2ip16bad_address_castE@@Base+0x8f48>
      dfdf15:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      dfdf1c:	00 

### 0xdfe636 from 0xdfe568..0xdfe645
      dfe612:	4d 39 e6             	cmp    r14,r12
      dfe615:	75 e7                	jne    dfe5fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb684>
      dfe617:	bf 90 00 00 00       	mov    edi,0x90
      dfe61c:	48 03 7b 08          	add    rdi,QWORD PTR [rbx+0x8]
      dfe620:	e8 6d 06 00 00       	call   dfec92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcbd18>
      dfe625:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      dfe629:	48 83 c7 18          	add    rdi,0x18
      dfe62d:	5b                   	pop    rbx
      dfe62e:	41 5c                	pop    r12
      dfe630:	41 5d                	pop    r13
      dfe632:	41 5e                	pop    r14
      dfe634:	41 5f                	pop    r15
      dfe636:	e9 6d a4 d2 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfe63b:	5b                   	pop    rbx
      dfe63c:	41 5c                	pop    r12
      dfe63e:	41 5d                	pop    r13
      dfe640:	41 5e                	pop    r14
      dfe642:	41 5f                	pop    r15
      dfe644:	c3                   	ret
      dfe645:	53                   	push   rbx
      dfe646:	48 89 d3             	mov    rbx,rdx
      dfe649:	48 89 f7             	mov    rdi,rsi
      dfe64c:	e8 05 00 00 00       	call   dfe656 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb6dc>
      dfe651:	48 89 03             	mov    QWORD PTR [rbx],rax
      dfe654:	5b                   	pop    rbx
      dfe655:	c3                   	ret

### 0xdfea74 from 0xdfea02..0xdfea89
      dfea4b:	49 83 c6 11          	add    r14,0x11
      dfea4f:	48 8d 35 5c 99 57 ff 	lea    rsi,[rip+0xffffffffff57995c]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      dfea56:	48 8d 0d 9f 3a 54 ff 	lea    rcx,[rip+0xffffffffff543a9f]        # 3424fc <_ZTSSt12bad_any_cast@@Base-0x4dccc>
      dfea5d:	6a 06                	push   0x6
      dfea5f:	5f                   	pop    rdi
      dfea60:	6a 47                	push   0x47
      dfea62:	5a                   	pop    rdx
      dfea63:	4d 89 f1             	mov    r9,r14
      dfea66:	31 c0                	xor    eax,eax
      dfea68:	e8 65 7e 9d 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      dfea6d:	48 83 c3 18          	add    rbx,0x18
      dfea71:	48 89 df             	mov    rdi,rbx
      dfea74:	e8 2f a0 d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      dfea79:	48 83 c4 08          	add    rsp,0x8
      dfea7d:	5b                   	pop    rbx
      dfea7e:	41 5e                	pop    r14
      dfea80:	c3                   	ret
      dfea81:	48 89 c7             	mov    rdi,rax
      dfea84:	e8 1c b0 c7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      dfea89:	cc                   	int3
      dfea8a:	53                   	push   rbx
      dfea8b:	48 89 fb             	mov    rbx,rdi
      dfea8e:	e8 1d 00 00 00       	call   dfeab0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcbb36>
      dfea93:	48 8d 4b 08          	lea    rcx,[rbx+0x8]
      dfea97:	48 39 c8             	cmp    rax,rcx
      dfea9a:	74 10                	je     dfeaac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcbb32>

### 0xe00ca2 from 0xe00b3a..0xe00d14
      e00c7a:	74 1f                	je     e00c9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdd21>
      e00c7c:	49 c1 e7 03          	shl    r15,0x3
      e00c80:	45 31 e4             	xor    r12d,r12d
      e00c83:	4a 8b 34 23          	mov    rsi,QWORD PTR [rbx+r12*1]
      e00c87:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e00c8a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e00c8d:	e8 2e e1 ff ff       	call   dfedc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcbe46>
      e00c92:	49 83 c4 08          	add    r12,0x8
      e00c96:	4d 39 e7             	cmp    r15,r12
      e00c99:	75 e8                	jne    e00c83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdd09>
      e00c9b:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      e00c9e:	48 83 c7 10          	add    rdi,0x10
      e00ca2:	e8 01 7e d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e00ca7:	eb 3a                	jmp    e00ce3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdd69>
      e00ca9:	83 f9 06             	cmp    ecx,0x6
      e00cac:	7c 35                	jl     e00ce3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdd69>
      e00cae:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e00cb1:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
      e00cb5:	44 0f b6 00          	movzx  r8d,BYTE PTR [rax]
      e00cb9:	41 f6 c0 01          	test   r8b,0x1
      e00cbd:	74 06                	je     e00cc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdd4b>
      e00cbf:	4c 8b 40 08          	mov    r8,QWORD PTR [rax+0x8]
      e00cc3:	eb 03                	jmp    e00cc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdd4e>
      e00cc5:	41 d1 e8             	shr    r8d,1
      e00cc8:	48 8d 35 ad 12 65 ff 	lea    rsi,[rip+0xffffffffff6512ad]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e00ccf:	48 8d 0d 5b ba 55 ff 	lea    rcx,[rip+0xffffffffff55ba5b]        # 35c731 <_ZTSSt12bad_any_cast@@Base-0x33a97>

### 0xe00e7c from 0xe00d14..0xe00eee
      e00e54:	74 1f                	je     e00e75 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdefb>
      e00e56:	49 c1 e7 03          	shl    r15,0x3
      e00e5a:	45 31 e4             	xor    r12d,r12d
      e00e5d:	4a 8b 34 23          	mov    rsi,QWORD PTR [rbx+r12*1]
      e00e61:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e00e64:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e00e67:	e8 3a ec ff ff       	call   dffaa6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xccb2c>
      e00e6c:	49 83 c4 08          	add    r12,0x8
      e00e70:	4d 39 e7             	cmp    r15,r12
      e00e73:	75 e8                	jne    e00e5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdee3>
      e00e75:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      e00e78:	48 83 c7 10          	add    rdi,0x10
      e00e7c:	e8 27 7c d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e00e81:	eb 3a                	jmp    e00ebd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdf43>
      e00e83:	83 f9 06             	cmp    ecx,0x6
      e00e86:	7c 35                	jl     e00ebd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdf43>
      e00e88:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e00e8b:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
      e00e8f:	44 0f b6 00          	movzx  r8d,BYTE PTR [rax]
      e00e93:	41 f6 c0 01          	test   r8b,0x1
      e00e97:	74 06                	je     e00e9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdf25>
      e00e99:	4c 8b 40 08          	mov    r8,QWORD PTR [rax+0x8]
      e00e9d:	eb 03                	jmp    e00ea2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcdf28>
      e00e9f:	41 d1 e8             	shr    r8d,1
      e00ea2:	48 8d 35 d3 10 65 ff 	lea    rsi,[rip+0xffffffffff6510d3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e00ea9:	48 8d 0d 15 d8 52 ff 	lea    rcx,[rip+0xffffffffff52d815]        # 32e6c5 <_ZTSSt12bad_any_cast@@Base-0x61b03>

### 0xe020b7 from 0xe020b2..0xe020c6
      e02091:	48 83 63 50 00       	and    QWORD PTR [rbx+0x50],0x0
      e02096:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e0209b:	83 63 58 00          	and    DWORD PTR [rbx+0x58],0x0
      e0209f:	5b                   	pop    rbx
      e020a0:	c3                   	ret
      e020a1:	cc                   	int3
      e020a2:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      e020a5:	e9 1c 00 00 00       	jmp    e020c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf14c>
      e020aa:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      e020ad:	e9 00 00 00 00       	jmp    e020b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf138>
      e020b2:	50                   	push   rax
      e020b3:	48 83 c7 60          	add    rdi,0x60
      e020b7:	e8 ec 69 d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e020bc:	58                   	pop    rax
      e020bd:	c3                   	ret
      e020be:	48 89 c7             	mov    rdi,rax
      e020c1:	e8 df 79 c7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e020c6:	53                   	push   rbx
      e020c7:	48 89 fb             	mov    rbx,rdi
      e020ca:	48 8d 35 e1 62 57 ff 	lea    rsi,[rip+0xffffffffff5762e1]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      e020d1:	48 8d 0d 1f 7f 56 ff 	lea    rcx,[rip+0xffffffffff567f1f]        # 369ff7 <_ZTSSt12bad_any_cast@@Base-0x261d1>
      e020d8:	6a 04                	push   0x4
      e020da:	5f                   	pop    rdi
      e020db:	6a 5f                	push   0x5f
      e020dd:	5a                   	pop    rdx
      e020de:	31 c0                	xor    eax,eax

### 0xe02da3 from 0xe0267e..0xe03029
      e02d71:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
      e02d75:	8b 77 1c             	mov    esi,DWORD PTR [rdi+0x1c]
      e02d78:	48 81 c7 38 03 00 00 	add    rdi,0x338
      e02d7f:	e8 5a 20 00 00       	call   e04dde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1e64>
      e02d84:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e02d87:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
      e02d8b:	0f b7 56 18          	movzx  edx,WORD PTR [rsi+0x18]
      e02d8f:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e02d93:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e02d96:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e02d99:	49 81 c6 80 01 00 00 	add    r14,0x180
      e02da0:	4c 89 f7             	mov    rdi,r14
      e02da3:	e8 00 5d d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e02da8:	48 8d bc 24 08 03 00 	lea    rdi,[rsp+0x308]
      e02daf:	00 
      e02db0:	e8 9d 26 ff ff       	call   df5452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc24d8>
      e02db5:	48 8d bc 24 28 03 00 	lea    rdi,[rsp+0x328]
      e02dbc:	00 
      e02dbd:	e8 f6 1f 00 00       	call   e04db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1e3e>
      e02dc2:	48 89 df             	mov    rdi,rbx
      e02dc5:	e8 ec 1f ff ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
      e02dca:	b3 01                	mov    bl,0x1
      e02dcc:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
      e02dd3:	00 
      e02dd4:	e8 ff f9 fe ff       	call   df27d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf85e>
      e02dd9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0xe05e46 from 0xe05942..0xe05f64
      e05e15:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      e05e19:	e9 68 fd ff ff       	jmp    e05b86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd2c0c>
      e05e1e:	48 8b bb 40 03 00 00 	mov    rdi,QWORD PTR [rbx+0x340]
      e05e25:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e05e28:	48 8d 8c 24 00 04 00 	lea    rcx,[rsp+0x400]
      e05e2f:	00 
      e05e30:	4c 89 e6             	mov    rsi,r12
      e05e33:	4c 89 fa             	mov    rdx,r15
      e05e36:	4d 89 f0             	mov    r8,r14
      e05e39:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e05e3c:	48 81 c3 78 01 00 00 	add    rbx,0x178
      e05e43:	48 89 df             	mov    rdi,rbx
      e05e46:	e8 5d 2c d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e05e4b:	eb 47                	jmp    e05e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd2f1a>
      e05e4d:	e8 75 4a 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
      e05e52:	48 8d 84 24 b8 02 00 	lea    rax,[rsp+0x2b8]
      e05e59:	00 
      e05e5a:	c7 40 e8 04 00 00 00 	mov    DWORD PTR [rax-0x18],0x4
      e05e61:	48 8d 0d e8 cf b7 00 	lea    rcx,[rip+0xb7cfe8]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
      e05e68:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
      e05e6c:	0f 57 c0             	xorps  xmm0,xmm0
      e05e6f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      e05e72:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
      e05e76:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
      e05e7a:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
      e05e81:	00 

### 0xe063f0 from 0xe05f64..0xe06521
      e063c2:	48 8d 8c 24 58 02 00 	lea    rcx,[rsp+0x258]
      e063c9:	00 
      e063ca:	4c 89 ef             	mov    rdi,r13
      e063cd:	48 89 ee             	mov    rsi,rbp
      e063d0:	4c 89 fa             	mov    rdx,r15
      e063d3:	4d 89 f0             	mov    r8,r14
      e063d6:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e063d9:	48 8d bc 24 98 05 00 	lea    rdi,[rsp+0x598]
      e063e0:	00 
      e063e1:	e8 e4 0e 86 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
      e063e6:	48 81 c3 78 01 00 00 	add    rbx,0x178
      e063ed:	48 89 df             	mov    rdi,rbx
      e063f0:	e8 b3 26 d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e063f5:	eb 47                	jmp    e0643e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd34c4>
      e063f7:	e8 cb 44 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
      e063fc:	48 8d 84 24 78 05 00 	lea    rax,[rsp+0x578]
      e06403:	00 
      e06404:	c7 40 e8 04 00 00 00 	mov    DWORD PTR [rax-0x18],0x4
      e0640b:	48 8d 0d 3e ca b7 00 	lea    rcx,[rip+0xb7ca3e]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
      e06412:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
      e06416:	0f 57 c0             	xorps  xmm0,xmm0
      e06419:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      e0641c:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
      e06420:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
      e06424:	48 8d b4 24 60 05 00 	lea    rsi,[rsp+0x560]
      e0642b:	00 

### 0xe06ebe from 0xe06c12..0xe06fd9
      e06e8f:	4c 89 fe             	mov    rsi,r15
      e06e92:	e8 a9 01 86 00       	call   1667040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1ac>
      e06e97:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e06e9b:	4c 89 e7             	mov    rdi,r12
      e06e9e:	4c 89 ee             	mov    rsi,r13
      e06ea1:	4c 89 f2             	mov    rdx,r14
      e06ea4:	ff 50 48             	call   QWORD PTR [rax+0x48]
      e06ea7:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      e06eae:	00 
      e06eaf:	e8 e6 01 86 00       	call   166709a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b206>
      e06eb4:	48 81 c3 78 01 00 00 	add    rbx,0x178
      e06ebb:	48 89 df             	mov    rdi,rbx
      e06ebe:	e8 e5 1b d2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e06ec3:	eb 47                	jmp    e06f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3f92>
      e06ec5:	e8 fd 39 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
      e06eca:	48 8d 84 24 98 03 00 	lea    rax,[rsp+0x398]
      e06ed1:	00 
      e06ed2:	c7 40 e8 08 00 00 00 	mov    DWORD PTR [rax-0x18],0x8
      e06ed9:	48 8d 0d 70 bf b7 00 	lea    rcx,[rip+0xb7bf70]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
      e06ee0:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
      e06ee4:	0f 57 c0             	xorps  xmm0,xmm0
      e06ee7:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      e06eea:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
      e06eee:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
      e06ef2:	48 8d b4 24 80 03 00 	lea    rsi,[rsp+0x380]
      e06ef9:	00 

### 0xe0b527 from 0xe0b500..0xe0b5f4
      e0b4fe:	c3                   	ret
      e0b4ff:	cc                   	int3
      e0b500:	53                   	push   rbx
      e0b501:	48 83 ec 20          	sub    rsp,0x20
      e0b505:	48 89 fb             	mov    rbx,rdi
      e0b508:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e0b50f:	00 00 
      e0b511:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      e0b516:	8a 87 e8 02 00 00    	mov    al,BYTE PTR [rdi+0x2e8]
      e0b51c:	a8 01                	test   al,0x1
      e0b51e:	75 4a                	jne    e0b56a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd85f0>
      e0b520:	48 8d bb 30 02 00 00 	lea    rdi,[rbx+0x230]
      e0b527:	e8 7c d5 d1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e0b52c:	b0 01                	mov    al,0x1
      e0b52e:	86 83 e8 02 00 00    	xchg   BYTE PTR [rbx+0x2e8],al
      e0b534:	80 bb c8 02 00 00 00 	cmp    BYTE PTR [rbx+0x2c8],0x0
      e0b53b:	74 12                	je     e0b54f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd85d5>
      e0b53d:	c6 83 c8 02 00 00 00 	mov    BYTE PTR [rbx+0x2c8],0x0
      e0b544:	48 8b 83 b8 02 00 00 	mov    rax,QWORD PTR [rbx+0x2b8]
      e0b54b:	f0 ff 48 10          	lock dec DWORD PTR [rax+0x10]
      e0b54f:	80 bb e0 02 00 00 00 	cmp    BYTE PTR [rbx+0x2e0],0x0
      e0b556:	74 12                	je     e0b56a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd85f0>
      e0b558:	c6 83 e0 02 00 00 00 	mov    BYTE PTR [rbx+0x2e0],0x0
      e0b55f:	48 8b 83 d0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2d0]
      e0b566:	f0 ff 48 10          	lock dec DWORD PTR [rax+0x10]
      e0b56a:	48 8b 83 88 02 00 00 	mov    rax,QWORD PTR [rbx+0x288]

### 0xe0caee from 0xe0cae6..0xe0cafd
      e0cac8:	4c 89 f7             	mov    rdi,r14
      e0cacb:	e8 00 32 c6 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e0cad0:	53                   	push   rbx
      e0cad1:	48 89 fb             	mov    rbx,rdi
      e0cad4:	48 83 c7 18          	add    rdi,0x18
      e0cad8:	e8 55 06 ca ff       	call   aad132 <JNI_OnUnload@@Base+0x349ff>
      e0cadd:	48 89 df             	mov    rdi,rbx
      e0cae0:	5b                   	pop    rbx
      e0cae1:	e9 4c 06 ca ff       	jmp    aad132 <JNI_OnUnload@@Base+0x349ff>
      e0cae6:	50                   	push   rax
      e0cae7:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      e0caea:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e0caee:	e8 b5 bf d1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e0caf3:	58                   	pop    rax
      e0caf4:	c3                   	ret
      e0caf5:	48 89 c7             	mov    rdi,rax
      e0caf8:	e8 a8 cf c6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e0cafd:	cc                   	int3
      e0cafe:	55                   	push   rbp
      e0caff:	41 57                	push   r15
      e0cb01:	41 56                	push   r14
      e0cb03:	41 55                	push   r13
      e0cb05:	41 54                	push   r12
      e0cb07:	53                   	push   rbx
      e0cb08:	48 81 ec b8 02 00 00 	sub    rsp,0x2b8
      e0cb0f:	49 89 d6             	mov    r14,rdx

### 0xe0d2dc from 0xe0d236..0xe0d327
      e0d2b3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e0d2b6:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      e0d2bb:	4c 89 ff             	mov    rdi,r15
      e0d2be:	ff 50 70             	call   QWORD PTR [rax+0x70]
      e0d2c1:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e0d2c4:	4c 89 f7             	mov    rdi,r14
      e0d2c7:	4c 89 fe             	mov    rsi,r15
      e0d2ca:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e0d2cd:	4c 89 ff             	mov    rdi,r15
      e0d2d0:	e8 5b f5 ff ff       	call   e0c830 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd98b6>
      e0d2d5:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
      e0d2d9:	48 89 df             	mov    rdi,rbx
      e0d2dc:	e8 c7 b7 d1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e0d2e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e0d2e8:	00 00 
      e0d2ea:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      e0d2ef:	75 31                	jne    e0d322 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda3a8>
      e0d2f1:	48 83 c4 28          	add    rsp,0x28
      e0d2f5:	5b                   	pop    rbx
      e0d2f6:	41 5c                	pop    r12
      e0d2f8:	41 5e                	pop    r14
      e0d2fa:	41 5f                	pop    r15
      e0d2fc:	c3                   	ret
      e0d2fd:	48 89 c3             	mov    rbx,rax
      e0d300:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      e0d305:	e8 86 0b 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0xe0d4de from 0xe0d446..0xe0d50b
      e0d4b0:	74 19                	je     e0d4cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda551>
      e0d4b2:	c6 83 c0 03 00 00 01 	mov    BYTE PTR [rbx+0x3c0],0x1
      e0d4b9:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
      e0d4bd:	48 85 ff             	test   rdi,rdi
      e0d4c0:	74 09                	je     e0d4cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda551>
      e0d4c2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e0d4c5:	4c 89 f6             	mov    rsi,r14
      e0d4c8:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e0d4cb:	48 8b bb c8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3c8]
      e0d4d2:	e8 01 01 05 00       	call   e5d5d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249ee>
      e0d4d7:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
      e0d4db:	48 89 df             	mov    rdi,rbx
      e0d4de:	e8 c5 b5 d1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e0d4e3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e0d4ea:	00 00 
      e0d4ec:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      e0d4f1:	75 0b                	jne    e0d4fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda584>
      e0d4f3:	48 83 c4 38          	add    rsp,0x38
      e0d4f7:	5b                   	pop    rbx
      e0d4f8:	41 5e                	pop    r14
      e0d4fa:	41 5f                	pop    r15
      e0d4fc:	5d                   	pop    rbp
      e0d4fd:	c3                   	ret
      e0d4fe:	e8 ad 25 9e 00       	call   17efab0 <__stack_chk_fail@plt>
      e0d503:	48 89 c7             	mov    rdi,rax
      e0d506:	e8 9a c5 c6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### 0xe108e3 from 0xe108de..0xe108f2
      e108c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e108c6:	ff 50 50             	call   QWORD PTR [rax+0x50]
      e108c9:	48 8b bb 70 02 00 00 	mov    rdi,QWORD PTR [rbx+0x270]
      e108d0:	48 85 ff             	test   rdi,rdi
      e108d3:	74 06                	je     e108db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdd961>
      e108d5:	5b                   	pop    rbx
      e108d6:	e9 f7 16 ff ff       	jmp    e01fd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf058>
      e108db:	5b                   	pop    rbx
      e108dc:	c3                   	ret
      e108dd:	cc                   	int3
      e108de:	50                   	push   rax
      e108df:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e108e3:	e8 c0 81 d1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e108e8:	58                   	pop    rax
      e108e9:	c3                   	ret
      e108ea:	48 89 c7             	mov    rdi,rax
      e108ed:	e8 b3 91 c6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e108f2:	55                   	push   rbp
      e108f3:	41 57                	push   r15
      e108f5:	41 56                	push   r14
      e108f7:	41 55                	push   r13
      e108f9:	41 54                	push   r12
      e108fb:	53                   	push   rbx
      e108fc:	48 81 ec 98 00 00 00 	sub    rsp,0x98
      e10903:	49 89 d7             	mov    r15,rdx
      e10906:	49 89 f6             	mov    r14,rsi

### 0xe10e0c from 0xe108f2..0xe10f5b
      e10dd9:	48 89 d1             	mov    rcx,rdx
      e10ddc:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      e10ddf:	48 8d 35 3a 21 5c ff 	lea    rsi,[rip+0xffffffffff5c213a]        # 3d2f20 <_ZTSN5boost17bad_function_callE@@Base+0x266>
      e10de6:	48 89 c2             	mov    rdx,rax
      e10de9:	e8 8a 01 9b 00       	call   17c0f78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1750e4>
      e10dee:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      e10df3:	e8 98 d0 9d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e10df8:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      e10dfd:	e8 22 26 9b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
      e10e02:	49 83 ef 80          	sub    r15,0xffffffffffffff80
      e10e06:	4c 89 ff             	mov    rdi,r15
      e10e09:	40 b5 01             	mov    bpl,0x1
      e10e0c:	e8 97 7c d1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e10e11:	e9 80 fb ff ff       	jmp    e10996 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdda1c>
      e10e16:	41 83 fc 01          	cmp    r12d,0x1
      e10e1a:	77 07                	ja     e10e23 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xddea9>
      e10e1c:	4c 23 74 24 10       	and    r14,QWORD PTR [rsp+0x10]
      e10e21:	eb 10                	jmp    e10e33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xddeb9>
      e10e23:	4d 39 ee             	cmp    r14,r13
      e10e26:	72 0b                	jb     e10e33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xddeb9>
      e10e28:	4c 89 f0             	mov    rax,r14
      e10e2b:	31 d2                	xor    edx,edx
      e10e2d:	49 f7 f5             	div    r13
      e10e30:	49 89 d6             	mov    r14,rdx
      e10e33:	4a 8b 04 f3          	mov    rax,QWORD PTR [rbx+r14*8]
      e10e37:	48 89 c1             	mov    rcx,rax

### 0xe1466c from 0xe14664..0xe1467b
      e14647:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e1464e:	00 00 
      e14650:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
      e14655:	75 08                	jne    e1465f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe16e5>
      e14657:	48 83 c4 58          	add    rsp,0x58
      e1465b:	5b                   	pop    rbx
      e1465c:	41 5e                	pop    r14
      e1465e:	c3                   	ret
      e1465f:	e8 4c b4 9d 00       	call   17efab0 <__stack_chk_fail@plt>
      e14664:	50                   	push   rax
      e14665:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      e14668:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e1466c:	e8 37 44 d1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e14671:	58                   	pop    rax
      e14672:	c3                   	ret
      e14673:	48 89 c7             	mov    rdi,rax
      e14676:	e8 2a 54 c6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e1467b:	cc                   	int3
      e1467c:	53                   	push   rbx
      e1467d:	48 89 fb             	mov    rbx,rdi
      e14680:	48 83 c7 28          	add    rdi,0x28
      e14684:	e8 41 e5 ff ff       	call   e12bca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfc50>
      e14689:	48 83 c3 08          	add    rbx,0x8
      e1468d:	48 89 df             	mov    rdi,rbx
      e14690:	5b                   	pop    rbx
      e14691:	e9 fa 97 9d 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0xe1766a from 0xe1741c..0xe17790
      e1762f:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
      e17634:	c6 83 88 01 00 00 01 	mov    BYTE PTR [rbx+0x188],0x1
      e1763b:	48 8b 84 24 d8 01 00 	mov    rax,QWORD PTR [rsp+0x1d8]
      e17642:	00 
      e17643:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e1764a:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
      e17651:	00 
      e17652:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e17656:	48 89 9c 24 d0 05 00 	mov    QWORD PTR [rsp+0x5d0],rbx
      e1765d:	00 
      e1765e:	e8 67 2c c6 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e17663:	49 8d bd 30 02 00 00 	lea    rdi,[r13+0x230]
      e1766a:	e8 39 14 d1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e1766f:	b0 01                	mov    al,0x1
      e17671:	41 86 85 e8 02 00 00 	xchg   BYTE PTR [r13+0x2e8],al
      e17678:	41 80 bd c8 02 00 00 	cmp    BYTE PTR [r13+0x2c8],0x0
      e1767f:	00 
      e17680:	74 13                	je     e17695 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe471b>
      e17682:	41 c6 85 c8 02 00 00 	mov    BYTE PTR [r13+0x2c8],0x0
      e17689:	00 
      e1768a:	49 8b 85 b8 02 00 00 	mov    rax,QWORD PTR [r13+0x2b8]
      e17691:	f0 ff 48 10          	lock dec DWORD PTR [rax+0x10]
      e17695:	41 80 bd e0 02 00 00 	cmp    BYTE PTR [r13+0x2e0],0x0
      e1769c:	00 
      e1769d:	74 13                	je     e176b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4738>
      e1769f:	41 c6 85 e0 02 00 00 	mov    BYTE PTR [r13+0x2e0],0x0

### 0xe18b84 from 0xe18b5a..0xe18bda
      e18b51:	c3                   	ret
      e18b52:	48 89 c7             	mov    rdi,rax
      e18b55:	e8 4b 0f c6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e18b5a:	53                   	push   rbx
      e18b5b:	48 89 fb             	mov    rbx,rdi
      e18b5e:	80 bf 10 02 00 00 00 	cmp    BYTE PTR [rdi+0x210],0x0
      e18b65:	75 12                	jne    e18b79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe5bff>
      e18b67:	c6 83 10 02 00 00 01 	mov    BYTE PTR [rbx+0x210],0x1
      e18b6e:	48 8b 83 00 02 00 00 	mov    rax,QWORD PTR [rbx+0x200]
      e18b75:	f0 ff 40 10          	lock inc DWORD PTR [rax+0x10]
      e18b79:	c6 83 c9 12 00 00 00 	mov    BYTE PTR [rbx+0x12c9],0x0
      e18b80:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
      e18b84:	e8 1f ff d0 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e18b89:	48 8b bb e0 11 00 00 	mov    rdi,QWORD PTR [rbx+0x11e0]
      e18b90:	e8 a1 c9 04 00       	call   e65536 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c94c>
      e18b95:	84 d2                	test   dl,dl
      e18b97:	74 10                	je     e18ba9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe5c2f>
      e18b99:	6a 04                	push   0x4
      e18b9b:	5e                   	pop    rsi
      e18b9c:	6a 01                	push   0x1
      e18b9e:	59                   	pop    rcx
      e18b9f:	48 89 df             	mov    rdi,rbx
      e18ba2:	31 d2                	xor    edx,edx
      e18ba4:	e8 cd c0 ff ff       	call   e14c76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1cfc>
      e18ba9:	48 8b bb e0 11 00 00 	mov    rdi,QWORD PTR [rbx+0x11e0]
      e18bb0:	e8 75 ca 04 00       	call   e6562a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca40>

### 0xe1f22a from 0xe1f128..0xe1f25a
      e1f1f6:	83 3d bb a7 b0 00 06 	cmp    DWORD PTR [rip+0xb0a7bb],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e1f1fd:	7c 1d                	jl     e1f21c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec2a2>
      e1f1ff:	48 8d 35 ac 91 55 ff 	lea    rsi,[rip+0xffffffffff5591ac]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      e1f206:	48 8d 0d 51 e1 54 ff 	lea    rcx,[rip+0xffffffffff54e151]        # 36d35e <_ZTSSt12bad_any_cast@@Base-0x22e6a>
      e1f20d:	6a 06                	push   0x6
      e1f20f:	5f                   	pop    rdi
      e1f210:	ba ed 02 00 00       	mov    edx,0x2ed
      e1f215:	31 c0                	xor    eax,eax
      e1f217:	e8 b6 76 9b 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e1f21c:	c6 83 c9 12 00 00 00 	mov    BYTE PTR [rbx+0x12c9],0x0
      e1f223:	48 83 c3 28          	add    rbx,0x28
      e1f227:	48 89 df             	mov    rdi,rbx
      e1f22a:	e8 79 98 d0 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e1f22f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e1f236:	00 00 
      e1f238:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
      e1f23d:	75 0e                	jne    e1f24d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec2d3>
      e1f23f:	48 83 c4 40          	add    rsp,0x40
      e1f243:	5b                   	pop    rbx
      e1f244:	41 5c                	pop    r12
      e1f246:	41 5d                	pop    r13
      e1f248:	41 5e                	pop    r14
      e1f24a:	41 5f                	pop    r15
      e1f24c:	c3                   	ret
      e1f24d:	e8 5e 08 9d 00       	call   17efab0 <__stack_chk_fail@plt>
      e1f252:	48 89 c7             	mov    rdi,rax

### 0xe1f398 from 0xe1f262..0xe1f59c
      e1f35f:	80 b8 a9 09 00 00 00 	cmp    BYTE PTR [rax+0x9a9],0x0
      e1f366:	75 09                	jne    e1f371 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec3f7>
      e1f368:	80 b8 a8 09 00 00 00 	cmp    BYTE PTR [rax+0x9a8],0x0
      e1f36f:	75 1c                	jne    e1f38d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec413>
      e1f371:	48 8b bb e0 11 00 00 	mov    rdi,QWORD PTR [rbx+0x11e0]
      e1f378:	e8 b9 61 04 00       	call   e65536 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c94c>
      e1f37d:	84 d2                	test   dl,dl
      e1f37f:	74 0c                	je     e1f38d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec413>
      e1f381:	48 8b bb e0 11 00 00 	mov    rdi,QWORD PTR [rbx+0x11e0]
      e1f388:	e8 9d 62 04 00       	call   e6562a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca40>
      e1f38d:	c6 83 c9 12 00 00 00 	mov    BYTE PTR [rbx+0x12c9],0x0
      e1f394:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
      e1f398:	e8 0b 97 d0 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e1f39d:	80 bb 02 15 00 00 00 	cmp    BYTE PTR [rbx+0x1502],0x0
      e1f3a4:	74 13                	je     e1f3b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec43f>
      e1f3a6:	48 8d bb 10 12 00 00 	lea    rdi,[rbx+0x1210]
      e1f3ad:	48 8b b3 a8 01 00 00 	mov    rsi,QWORD PTR [rbx+0x1a8]
      e1f3b4:	e8 91 b2 ff ff       	call   e1a64a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe76d0>
      e1f3b9:	c6 83 c8 12 00 00 00 	mov    BYTE PTR [rbx+0x12c8],0x0
      e1f3c0:	48 89 df             	mov    rdi,rbx
      e1f3c3:	e8 34 6f ff ff       	call   e162fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3382>
      e1f3c8:	48 8b bb a8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a8]
      e1f3cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e1f3d2:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
      e1f3d8:	49 89 c6             	mov    r14,rax
      e1f3db:	48 8d 35 9a 2b 63 ff 	lea    rsi,[rip+0xffffffffff632b9a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>

### 0xe40bb2 from 0xe40af4..0xe40bea
      e40b82:	4d 85 f6             	test   r14,r14
      e40b85:	74 21                	je     e40ba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7fbe>
      e40b87:	49 8b b6 a0 00 00 00 	mov    rsi,QWORD PTR [r14+0xa0]
      e40b8e:	41 8b be 98 00 00 00 	mov    edi,DWORD PTR [r14+0x98]
      e40b95:	e8 90 2b e3 ff       	call   c7372a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c06ca>
      e40b9a:	84 c0                	test   al,al
      e40b9c:	74 0a                	je     e40ba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7fbe>
      e40b9e:	4c 89 f7             	mov    rdi,r14
      e40ba1:	31 f6                	xor    esi,esi
      e40ba3:	e8 f2 cd ff ff       	call   e3d99a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4db0>
      e40ba8:	48 81 c3 e0 01 00 00 	add    rbx,0x1e0
      e40baf:	48 89 df             	mov    rdi,rbx
      e40bb2:	e8 f1 7e ce ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e40bb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      e40bbc:	e8 4f 0c 00 00       	call   e41810 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c26>
      e40bc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e40bc8:	00 00 
      e40bca:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
      e40bcf:	75 0c                	jne    e40bdd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7ff3>
      e40bd1:	48 83 c4 58          	add    rsp,0x58
      e40bd5:	5b                   	pop    rbx
      e40bd6:	41 5c                	pop    r12
      e40bd8:	41 5e                	pop    r14
      e40bda:	41 5f                	pop    r15
      e40bdc:	c3                   	ret
      e40bdd:	e8 ce ee 9a 00       	call   17efab0 <__stack_chk_fail@plt>

### 0xe41427 from 0xe413f4..0xe4142c
      e413ff:	48 85 ff             	test   rdi,rdi
      e41402:	74 06                	je     e4140a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8820>
      e41404:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41407:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e4140a:	48 8b bb 80 01 00 00 	mov    rdi,QWORD PTR [rbx+0x180]
      e41411:	48 85 ff             	test   rdi,rdi
      e41414:	74 06                	je     e4141c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8832>
      e41416:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41419:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e4141c:	48 81 c3 e0 01 00 00 	add    rbx,0x1e0
      e41423:	48 89 df             	mov    rdi,rbx
      e41426:	5b                   	pop    rbx
      e41427:	e9 7c 76 ce ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e4142c:	53                   	push   rbx
      e4142d:	48 89 fb             	mov    rbx,rdi
      e41430:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e41437:	48 85 ff             	test   rdi,rdi
      e4143a:	74 16                	je     e41452 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8868>
      e4143c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e4143f:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e41442:	48 81 c3 e0 01 00 00 	add    rbx,0x1e0
      e41449:	48 89 df             	mov    rdi,rbx
      e4144c:	5b                   	pop    rbx
      e4144d:	e9 56 76 ce ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e41452:	5b                   	pop    rbx
      e41453:	c3                   	ret

### 0xe4144d from 0xe4142c..0xe41454
      e41426:	5b                   	pop    rbx
      e41427:	e9 7c 76 ce ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e4142c:	53                   	push   rbx
      e4142d:	48 89 fb             	mov    rbx,rdi
      e41430:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e41437:	48 85 ff             	test   rdi,rdi
      e4143a:	74 16                	je     e41452 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8868>
      e4143c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e4143f:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e41442:	48 81 c3 e0 01 00 00 	add    rbx,0x1e0
      e41449:	48 89 df             	mov    rdi,rbx
      e4144c:	5b                   	pop    rbx
      e4144d:	e9 56 76 ce ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e41452:	5b                   	pop    rbx
      e41453:	c3                   	ret
      e41454:	53                   	push   rbx
      e41455:	48 89 fb             	mov    rbx,rdi
      e41458:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e4145f:	48 85 ff             	test   rdi,rdi
      e41462:	74 06                	je     e4146a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8880>
      e41464:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41467:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e4146a:	48 8b bb 80 01 00 00 	mov    rdi,QWORD PTR [rbx+0x180]
      e41471:	48 85 ff             	test   rdi,rdi
      e41474:	74 07                	je     e4147d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8893>
      e41476:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xe41f44 from 0xe41e5a..0xe41f58
      e41f24:	5b                   	pop    rbx
      e41f25:	41 5c                	pop    r12
      e41f27:	41 5d                	pop    r13
      e41f29:	41 5e                	pop    r14
      e41f2b:	41 5f                	pop    r15
      e41f2d:	5d                   	pop    rbp
      e41f2e:	c3                   	ret
      e41f2f:	48 89 e6             	mov    rsi,rsp
      e41f32:	4c 89 f7             	mov    rdi,r14
      e41f35:	e8 36 00 00 00       	call   e41f70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9386>
      e41f3a:	49 81 c6 e0 01 00 00 	add    r14,0x1e0
      e41f41:	4c 89 f7             	mov    rdi,r14
      e41f44:	e8 5f 6b ce ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e41f49:	eb bd                	jmp    e41f08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x931e>
      e41f4b:	e8 60 db 9a 00       	call   17efab0 <__stack_chk_fail@plt>
      e41f50:	48 89 c7             	mov    rdi,rax
      e41f53:	e8 4d 7b c3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e41f58:	53                   	push   rbx
      e41f59:	48 89 fb             	mov    rbx,rdi
      e41f5c:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
      e41f60:	e8 4d c5 c5 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e41f65:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e41f69:	5b                   	pop    rbx
      e41f6a:	e9 43 c5 c5 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e41f6f:	cc                   	int3
      e41f70:	55                   	push   rbp

### 0xe4248e from 0xe42448..0xe424af
      e42464:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      e42468:	4d 39 fe             	cmp    r14,r15
      e4246b:	74 14                	je     e42481 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9897>
      e4246d:	48 89 df             	mov    rdi,rbx
      e42470:	4c 89 f6             	mov    rsi,r14
      e42473:	e8 f8 fa ff ff       	call   e41f70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9386>
      e42478:	40 08 c5             	or     bpl,al
      e4247b:	49 83 c6 10          	add    r14,0x10
      e4247f:	eb e7                	jmp    e42468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x987e>
      e42481:	40 f6 c5 01          	test   bpl,0x1
      e42485:	74 0c                	je     e42493 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x98a9>
      e42487:	48 8d bb e0 01 00 00 	lea    rdi,[rbx+0x1e0]
      e4248e:	e8 15 66 ce ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e42493:	48 89 df             	mov    rdi,rbx
      e42496:	31 f6                	xor    esi,esi
      e42498:	48 83 c4 08          	add    rsp,0x8
      e4249c:	5b                   	pop    rbx
      e4249d:	41 5e                	pop    r14
      e4249f:	41 5f                	pop    r15
      e424a1:	5d                   	pop    rbp
      e424a2:	e9 c1 f7 ff ff       	jmp    e41c68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x907e>
      e424a7:	48 89 c7             	mov    rdi,rax
      e424aa:	e8 f6 75 c3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e424af:	cc                   	int3
      e424b0:	53                   	push   rbx
      e424b1:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]

### 0xe426cf from 0xe424d6..0xe42714
      e42699:	49 8b 16             	mov    rdx,QWORD PTR [r14]
      e4269c:	48 8d 72 18          	lea    rsi,[rdx+0x18]
      e426a0:	41 8b 4d 00          	mov    ecx,DWORD PTR [r13+0x0]
      e426a4:	4c 89 ff             	mov    rdi,r15
      e426a7:	e8 2c 01 00 00       	call   e427d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9bee>
      e426ac:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      e426b1:	e8 da b7 9a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e426b6:	49 83 c6 10          	add    r14,0x10
      e426ba:	4c 3b 74 24 20       	cmp    r14,QWORD PTR [rsp+0x20]
      e426bf:	0f 85 5f fe ff ff    	jne    e42524 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x993a>
      e426c5:	49 81 c7 e0 01 00 00 	add    r15,0x1e0
      e426cc:	4c 89 ff             	mov    rdi,r15
      e426cf:	e8 d4 63 ce ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e426d4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e426db:	00 00 
      e426dd:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
      e426e2:	75 0f                	jne    e426f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9b09>
      e426e4:	48 83 c4 58          	add    rsp,0x58
      e426e8:	5b                   	pop    rbx
      e426e9:	41 5c                	pop    r12
      e426eb:	41 5d                	pop    r13
      e426ed:	41 5e                	pop    r14
      e426ef:	41 5f                	pop    r15
      e426f1:	5d                   	pop    rbp
      e426f2:	c3                   	ret
      e426f3:	e8 b8 d3 9a 00       	call   17efab0 <__stack_chk_fail@plt>

### 0xe44a85 from 0xe44944..0xe44ad5
      e44a59:	6a 02                	push   0x2
      e44a5b:	5e                   	pop    rsi
      e44a5c:	e8 1d 0f 66 00       	call   14a597e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eaf02>
      e44a61:	49 8b be c8 02 00 00 	mov    rdi,QWORD PTR [r14+0x2c8]
      e44a68:	be e0 00 00 00       	mov    esi,0xe0
      e44a6d:	49 03 74 24 40       	add    rsi,QWORD PTR [r12+0x40]
      e44a72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e44a75:	ff 10                	call   QWORD PTR [rax]
      e44a77:	6a 0f                	push   0xf
      e44a79:	41 5d                	pop    r13
      e44a7b:	49 81 c6 e0 01 00 00 	add    r14,0x1e0
      e44a82:	4c 89 f7             	mov    rdi,r14
      e44a85:	e8 1e 40 ce ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e44a8a:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      e44a8f:	44 89 2a             	mov    DWORD PTR [rdx],r13d
      e44a92:	89 6a 04             	mov    DWORD PTR [rdx+0x4],ebp
      e44a95:	49 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [r12+0x80]
      e44a9c:	00 
      e44a9d:	31 f6                	xor    esi,esi
      e44a9f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      e44aa4:	e8 a7 b0 ff ff       	call   e3fb50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f66>
      e44aa9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e44ab0:	00 00 
      e44ab2:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      e44ab7:	75 0f                	jne    e44ac8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbede>
      e44ab9:	48 83 c4 48          	add    rsp,0x48

### 0xe5e644 from 0xe5e19c..0xe5e6d5
      e5e612:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      e5e617:	e8 74 f8 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e5e61c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      e5e621:	31 f6                	xor    esi,esi
      e5e623:	e8 38 f9 ff ff       	call   e5df60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25376>
      e5e628:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e5e62d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e5e630:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e5e634:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e5e637:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e5e63a:	48 81 c3 80 01 00 00 	add    rbx,0x180
      e5e641:	48 89 df             	mov    rdi,rbx
      e5e644:	e8 5f a4 cc ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e5e649:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e5e650:	00 00 
      e5e652:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]
      e5e659:	00 
      e5e65a:	75 66                	jne    e5e6c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ad8>
      e5e65c:	48 81 c4 48 01 00 00 	add    rsp,0x148
      e5e663:	5b                   	pop    rbx
      e5e664:	41 5c                	pop    r12
      e5e666:	41 5d                	pop    r13
      e5e668:	41 5e                	pop    r14
      e5e66a:	41 5f                	pop    r15
      e5e66c:	5d                   	pop    rbp
      e5e66d:	c3                   	ret

### 0xe6561a from 0xe655c8..0xe65629
      e655f0:	75 13                	jne    e65605 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca1b>
      e655f2:	c6 43 50 01          	mov    BYTE PTR [rbx+0x50],0x1
      e655f6:	e8 55 8b 98 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
      e655fb:	b9 e8 03 00 00       	mov    ecx,0x3e8
      e65600:	48 99                	cqo
      e65602:	48 f7 f9             	idiv   rcx
      e65605:	80 7b 38 00          	cmp    BYTE PTR [rbx+0x38],0x0
      e65609:	75 04                	jne    e6560f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca25>
      e6560b:	c6 43 38 01          	mov    BYTE PTR [rbx+0x38],0x1
      e6560f:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      e65613:	48 83 c3 58          	add    rbx,0x58
      e65617:	48 89 df             	mov    rdi,rbx
      e6561a:	e8 89 34 cc ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e6561f:	5b                   	pop    rbx
      e65620:	c3                   	ret
      e65621:	48 89 c7             	mov    rdi,rax
      e65624:	e8 7c 44 c1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e65629:	cc                   	int3
      e6562a:	50                   	push   rax
      e6562b:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
      e6562f:	74 04                	je     e65635 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca4b>
      e65631:	c6 47 38 00          	mov    BYTE PTR [rdi+0x38],0x0
      e65635:	80 7f 48 00          	cmp    BYTE PTR [rdi+0x48],0x0
      e65639:	74 04                	je     e6563f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca55>
      e6563b:	c6 47 48 00          	mov    BYTE PTR [rdi+0x48],0x0
      e6563f:	66 83 67 50 00       	and    WORD PTR [rdi+0x50],0x0

### 0xe65648 from 0xe6562a..0xe65657
      e65621:	48 89 c7             	mov    rdi,rax
      e65624:	e8 7c 44 c1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e65629:	cc                   	int3
      e6562a:	50                   	push   rax
      e6562b:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
      e6562f:	74 04                	je     e65635 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca4b>
      e65631:	c6 47 38 00          	mov    BYTE PTR [rdi+0x38],0x0
      e65635:	80 7f 48 00          	cmp    BYTE PTR [rdi+0x48],0x0
      e65639:	74 04                	je     e6563f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca55>
      e6563b:	c6 47 48 00          	mov    BYTE PTR [rdi+0x48],0x0
      e6563f:	66 83 67 50 00       	and    WORD PTR [rdi+0x50],0x0
      e65644:	48 83 c7 58          	add    rdi,0x58
      e65648:	e8 5b 34 cc ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e6564d:	58                   	pop    rax
      e6564e:	c3                   	ret
      e6564f:	48 89 c7             	mov    rdi,rax
      e65652:	e8 4e 44 c1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e65657:	cc                   	int3
      e65658:	80 7f 51 00          	cmp    BYTE PTR [rdi+0x51],0x0
      e6565c:	74 1a                	je     e65678 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca8e>
      e6565e:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
      e65662:	48 39 f0             	cmp    rax,rsi
      e65665:	48 0f 4f f0          	cmovg  rsi,rax
      e65669:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
      e6566d:	75 04                	jne    e65673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca89>
      e6566f:	c6 47 38 01          	mov    BYTE PTR [rdi+0x38],0x1

### 0xe71f6c from 0xe71a4e..0xe71fed
      e71f3a:	e8 e1 bf 97 00       	call   17edf20 <_ZdlPv@plt>
      e71f3f:	4d 89 f5             	mov    r13,r14
      e71f42:	4c 89 ab 60 01 00 00 	mov    QWORD PTR [rbx+0x160],r13
      e71f49:	31 ff                	xor    edi,edi
      e71f4b:	e8 36 c5 c2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e71f50:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      e71f55:	e8 ca 14 95 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
      e71f5a:	40 84 ed             	test   bpl,bpl
      e71f5d:	74 14                	je     e71f73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39389>
      e71f5f:	48 81 c3 70 01 00 00 	add    rbx,0x170
      e71f66:	40 b5 01             	mov    bpl,0x1
      e71f69:	48 89 df             	mov    rdi,rbx
      e71f6c:	e8 37 6b cb ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e71f71:	eb 02                	jmp    e71f75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3938b>
      e71f73:	31 ed                	xor    ebp,ebp
      e71f75:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e71f7c:	00 00 
      e71f7e:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
      e71f83:	75 3b                	jne    e71fc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x393d6>
      e71f85:	89 e8                	mov    eax,ebp
      e71f87:	48 83 c4 68          	add    rsp,0x68
      e71f8b:	5b                   	pop    rbx
      e71f8c:	41 5c                	pop    r12
      e71f8e:	41 5d                	pop    r13
      e71f90:	41 5e                	pop    r14
      e71f92:	41 5f                	pop    r15

### 0xe7206d from 0xe71fee..0xe7208a
      e72041:	e8 40 c4 c2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e72046:	49 83 c5 10          	add    r13,0x10
      e7204a:	49 39 dd             	cmp    r13,rbx
      e7204d:	75 dc                	jne    e7202b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39441>
      e7204f:	49 83 c5 f0          	add    r13,0xfffffffffffffff0
      e72053:	eb 03                	jmp    e72058 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3946e>
      e72055:	4d 89 fd             	mov    r13,r15
      e72058:	4c 89 e7             	mov    rdi,r12
      e7205b:	4c 89 ee             	mov    rsi,r13
      e7205e:	e8 15 55 c4 ff       	call   ab7578 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4518>
      e72063:	49 81 c6 70 01 00 00 	add    r14,0x170
      e7206a:	4c 89 f7             	mov    rdi,r14
      e7206d:	e8 36 6a cb ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e72072:	49 39 df             	cmp    r15,rbx
      e72075:	0f 95 c0             	setne  al
      e72078:	5b                   	pop    rbx
      e72079:	41 5c                	pop    r12
      e7207b:	41 5d                	pop    r13
      e7207d:	41 5e                	pop    r14
      e7207f:	41 5f                	pop    r15
      e72081:	c3                   	ret
      e72082:	48 89 c7             	mov    rdi,rax
      e72085:	e8 1b 7a c0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e7208a:	41 57                	push   r15
      e7208c:	41 56                	push   r14
      e7208e:	41 54                	push   r12

### 0xe746a2 from 0xe7450c..0xe74718
      e7467b:	83 f8 06             	cmp    eax,0x6
      e7467e:	7c 1b                	jl     e7469b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bab1>
      e74680:	48 8d 35 f5 d8 5d ff 	lea    rsi,[rip+0xffffffffff5dd8f5]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e74687:	48 8d 0d c5 c6 4f ff 	lea    rcx,[rip+0xffffffffff4fc6c5]        # 370d53 <_ZTSSt12bad_any_cast@@Base-0x1f475>
      e7468e:	6a 06                	push   0x6
      e74690:	5f                   	pop    rdi
      e74691:	6a 2a                	push   0x2a
      e74693:	5a                   	pop    rdx
      e74694:	31 c0                	xor    eax,eax
      e74696:	e8 37 22 96 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e7469b:	48 83 c3 68          	add    rbx,0x68
      e7469f:	48 89 df             	mov    rdi,rbx
      e746a2:	e8 01 44 cb ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e746a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e746ae:	00 00 
      e746b0:	48 3b 84 24 08 01 00 	cmp    rax,QWORD PTR [rsp+0x108]
      e746b7:	00 
      e746b8:	75 09                	jne    e746c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bad9>
      e746ba:	48 81 c4 10 01 00 00 	add    rsp,0x110
      e746c1:	5b                   	pop    rbx
      e746c2:	c3                   	ret
      e746c3:	e8 e8 b3 97 00       	call   17efab0 <__stack_chk_fail@plt>
      e746c8:	48 89 c3             	mov    rbx,rax
      e746cb:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e746d0:	e8 b1 9d c2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e746d5:	eb 03                	jmp    e746da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3baf0>

### 0xe7fa2e from 0xe7f9da..0xe7fa38
      e7fa05:	48 89 c7             	mov    rdi,rax
      e7fa08:	4c 89 f6             	mov    rsi,r14
      e7fa0b:	e8 98 65 c6 ff       	call   ae5fa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32f48>
      e7fa10:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e7fa17:	00 00 
      e7fa19:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      e7fa1e:	75 13                	jne    e7fa33 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46e49>
      e7fa20:	48 83 c3 20          	add    rbx,0x20
      e7fa24:	48 89 df             	mov    rdi,rbx
      e7fa27:	48 83 c4 18          	add    rsp,0x18
      e7fa2b:	5b                   	pop    rbx
      e7fa2c:	41 5e                	pop    r14
      e7fa2e:	e9 75 90 ca ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e7fa33:	e8 78 00 97 00       	call   17efab0 <__stack_chk_fail@plt>
      e7fa38:	55                   	push   rbp
      e7fa39:	41 57                	push   r15
      e7fa3b:	41 56                	push   r14
      e7fa3d:	41 55                	push   r13
      e7fa3f:	41 54                	push   r12
      e7fa41:	53                   	push   rbx
      e7fa42:	48 83 ec 38          	sub    rsp,0x38
      e7fa46:	49 89 f4             	mov    r12,rsi
      e7fa49:	48 89 fb             	mov    rbx,rdi
      e7fa4c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e7fa53:	00 00 
      e7fa55:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax

### 0xea8b07 from 0xea8a08..0xea8baa
      ea8adb:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      ea8adf:	e8 76 07 00 00       	call   ea925a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70670>
      ea8ae4:	40 0f b6 ed          	movzx  ebp,bpl
      ea8ae8:	84 c0                	test   al,al
      ea8aea:	41 0f 45 ec          	cmovne ebp,r12d
      ea8aee:	4c 89 f7             	mov    rdi,r14
      ea8af1:	e8 9a 86 da ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      ea8af6:	eb bc                	jmp    ea8ab4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6feca>
      ea8af8:	40 f6 c5 01          	test   bpl,0x1
      ea8afc:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      ea8b01:	74 09                	je     ea8b0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ff22>
      ea8b03:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      ea8b07:	e8 9c ff c7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ea8b0c:	4d 8b b6 e8 00 00 00 	mov    r14,QWORD PTR [r14+0xe8]
      ea8b13:	4d 85 f6             	test   r14,r14
      ea8b16:	74 54                	je     ea8b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ff82>
      ea8b18:	48 83 c3 20          	add    rbx,0x20
      ea8b1c:	48 89 df             	mov    rdi,rbx
      ea8b1f:	e8 12 2d bd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ea8b24:	48 89 d1             	mov    rcx,rdx
      ea8b27:	6a 01                	push   0x1
      ea8b29:	5e                   	pop    rsi
      ea8b2a:	4c 89 f7             	mov    rdi,r14
      ea8b2d:	48 89 c2             	mov    rdx,rax
      ea8b30:	45 31 c0             	xor    r8d,r8d
      ea8b33:	45 31 c9             	xor    r9d,r9d

### 0xea9f9f from 0xea9ea0..0xeaa042
      ea9f73:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      ea9f77:	e8 de f2 ff ff       	call   ea925a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70670>
      ea9f7c:	40 0f b6 ed          	movzx  ebp,bpl
      ea9f80:	84 c0                	test   al,al
      ea9f82:	41 0f 45 ec          	cmovne ebp,r12d
      ea9f86:	4c 89 f7             	mov    rdi,r14
      ea9f89:	e8 02 72 da ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      ea9f8e:	eb bc                	jmp    ea9f4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x71362>
      ea9f90:	40 f6 c5 01          	test   bpl,0x1
      ea9f94:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      ea9f99:	74 09                	je     ea9fa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x713ba>
      ea9f9b:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      ea9f9f:	e8 04 eb c7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ea9fa4:	4d 8b b6 e8 00 00 00 	mov    r14,QWORD PTR [r14+0xe8]
      ea9fab:	4d 85 f6             	test   r14,r14
      ea9fae:	74 54                	je     eaa004 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7141a>
      ea9fb0:	48 83 c3 20          	add    rbx,0x20
      ea9fb4:	48 89 df             	mov    rdi,rbx
      ea9fb7:	e8 7a 18 bd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ea9fbc:	48 89 d1             	mov    rcx,rdx
      ea9fbf:	6a 01                	push   0x1
      ea9fc1:	5e                   	pop    rsi
      ea9fc2:	4c 89 f7             	mov    rdi,r14
      ea9fc5:	48 89 c2             	mov    rdx,rax
      ea9fc8:	45 31 c0             	xor    r8d,r8d
      ea9fcb:	45 31 c9             	xor    r9d,r9d

### 0xeaae17 from 0xeaad18..0xeaaeba
      eaadeb:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      eaadef:	e8 66 e4 ff ff       	call   ea925a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70670>
      eaadf4:	40 0f b6 ed          	movzx  ebp,bpl
      eaadf8:	84 c0                	test   al,al
      eaadfa:	41 0f 45 ec          	cmovne ebp,r12d
      eaadfe:	4c 89 f7             	mov    rdi,r14
      eaae01:	e8 8a 63 da ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      eaae06:	eb bc                	jmp    eaadc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x721da>
      eaae08:	40 f6 c5 01          	test   bpl,0x1
      eaae0c:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      eaae11:	74 09                	je     eaae1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72232>
      eaae13:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      eaae17:	e8 8c dc c7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      eaae1c:	4d 8b b6 e8 00 00 00 	mov    r14,QWORD PTR [r14+0xe8]
      eaae23:	4d 85 f6             	test   r14,r14
      eaae26:	74 54                	je     eaae7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72292>
      eaae28:	48 83 c3 20          	add    rbx,0x20
      eaae2c:	48 89 df             	mov    rdi,rbx
      eaae2f:	e8 02 0a bd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      eaae34:	48 89 d1             	mov    rcx,rdx
      eaae37:	6a 01                	push   0x1
      eaae39:	5e                   	pop    rsi
      eaae3a:	4c 89 f7             	mov    rdi,r14
      eaae3d:	48 89 c2             	mov    rdx,rax
      eaae40:	45 31 c0             	xor    r8d,r8d
      eaae43:	45 31 c9             	xor    r9d,r9d

### 0xeabebc from 0xeabeb8..0xeabec1
      eabe97:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      eabe9a:	ff 50 20             	call   QWORD PTR [rax+0x20]
      eabe9d:	eb 02                	jmp    eabea1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x732b7>
      eabe9f:	31 db                	xor    ebx,ebx
      eabea1:	48 89 df             	mov    rdi,rbx
      eabea4:	48 83 c4 08          	add    rsp,0x8
      eabea8:	5b                   	pop    rbx
      eabea9:	41 5e                	pop    r14
      eabeab:	e9 d6 25 bf ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      eabeb0:	48 89 c7             	mov    rdi,rax
      eabeb3:	e8 ed db bc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      eabeb8:	48 83 c7 20          	add    rdi,0x20
      eabebc:	e9 e7 cb c7 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      eabec1:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      eabec5:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      eabec9:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      eabecc:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      eabecf:	c3                   	ret
      eabed0:	48 89 f8             	mov    rax,rdi
      eabed3:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
      eabed6:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      eabeda:	48 03 78 08          	add    rdi,QWORD PTR [rax+0x8]
      eabede:	f6 c1 01             	test   cl,0x1
      eabee1:	74 08                	je     eabeeb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73301>
      eabee3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      eabee6:	48 8b 4c 08 ff       	mov    rcx,QWORD PTR [rax+rcx*1-0x1]

### 0xec139d from 0xec1396..0xec13a2
      ec1376:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ec137a:	48 85 c0             	test   rax,rax
      ec137d:	74 05                	je     ec1384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8879a>
      ec137f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ec1384:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
      ec1388:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      ec138c:	0f 10 46 18          	movups xmm0,XMMWORD PTR [rsi+0x18]
      ec1390:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
      ec1394:	c3                   	ret
      ec1395:	cc                   	int3
      ec1396:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      ec1399:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      ec139d:	e9 06 77 c6 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ec13a2:	53                   	push   rbx
      ec13a3:	48 89 fb             	mov    rbx,rdi
      ec13a6:	48 8d 05 23 17 97 00 	lea    rax,[rip+0x971723]        # 1832ad0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4a68>
      ec13ad:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec13b0:	48 81 c7 e8 00 00 00 	add    rdi,0xe8
      ec13b7:	e8 28 19 00 00       	call   ec2ce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a0fa>
      ec13bc:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
      ec13c3:	e8 0c 88 91 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      ec13c8:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      ec13cf:	e8 92 8a 91 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ec13d4:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
      ec13d8:	e8 f7 87 91 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      ec13dd:	48 8d 7b 60          	lea    rdi,[rbx+0x60]

### 0xec2eeb from 0xec2d3a..0xec2ef5
      ec2ec7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec2ece:	00 00 
      ec2ed0:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      ec2ed5:	75 19                	jne    ec2ef0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a306>
      ec2ed7:	48 83 c3 68          	add    rbx,0x68
      ec2edb:	48 89 df             	mov    rdi,rbx
      ec2ede:	48 83 c4 20          	add    rsp,0x20
      ec2ee2:	5b                   	pop    rbx
      ec2ee3:	41 5c                	pop    r12
      ec2ee5:	41 5d                	pop    r13
      ec2ee7:	41 5e                	pop    r14
      ec2ee9:	41 5f                	pop    r15
      ec2eeb:	e9 b8 5b c6 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ec2ef0:	e8 bb cb 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ec2ef5:	cc                   	int3
      ec2ef6:	41 57                	push   r15
      ec2ef8:	41 56                	push   r14
      ec2efa:	53                   	push   rbx
      ec2efb:	48 89 fb             	mov    rbx,rdi
      ec2efe:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
      ec2f02:	4d 85 f6             	test   r14,r14
      ec2f05:	74 1c                	je     ec2f23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a339>
      ec2f07:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
      ec2f0a:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
      ec2f0e:	e8 73 b5 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec2f13:	4c 89 f7             	mov    rdi,r14

### 0xec6653 from 0xec649e..0xec669c
      ec662a:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ec662d:	49 83 c4 50          	add    r12,0x50
      ec6631:	4c 89 e0             	mov    rax,r12
      ec6634:	49 2b 07             	sub    rax,QWORD PTR [r15]
      ec6637:	48 3d f0 0f 00 00    	cmp    rax,0xff0
      ec663d:	75 08                	jne    ec6647 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8da5d>
      ec663f:	4d 8b 67 08          	mov    r12,QWORD PTR [r15+0x8]
      ec6643:	49 83 c7 08          	add    r15,0x8
      ec6647:	4d 39 f4             	cmp    r12,r14
      ec664a:	75 d2                	jne    ec661e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8da34>
      ec664c:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
      ec6650:	48 89 df             	mov    rdi,rbx
      ec6653:	e8 50 24 c6 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ec6658:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec665f:	00 00 
      ec6661:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      ec6666:	75 2f                	jne    ec6697 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8daad>
      ec6668:	48 83 c4 38          	add    rsp,0x38
      ec666c:	5b                   	pop    rbx
      ec666d:	41 5c                	pop    r12
      ec666f:	41 5e                	pop    r14
      ec6671:	41 5f                	pop    r15
      ec6673:	c3                   	ret
      ec6674:	48 89 c3             	mov    rbx,rax
      ec6677:	48 89 e7             	mov    rdi,rsp
      ec667a:	e8 71 5a f4 ff       	call   e0c0f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9176>

### 0xec7d39 from 0xec7d32..0xec7d3e
      ec7d08:	e8 79 67 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec7d0d:	48 89 df             	mov    rdi,rbx
      ec7d10:	e8 51 21 91 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ec7d15:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec7d1c:	00 00 
      ec7d1e:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      ec7d23:	75 08                	jne    ec7d2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f143>
      ec7d25:	4c 89 e7             	mov    rdi,r12
      ec7d28:	e8 a3 7f ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ec7d2d:	e8 7e 7d 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ec7d32:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      ec7d35:	48 83 c7 08          	add    rdi,0x8
      ec7d39:	e9 6a 0d c6 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ec7d3e:	53                   	push   rbx
      ec7d3f:	48 89 fb             	mov    rbx,rdi
      ec7d42:	48 8d 05 df b3 96 00 	lea    rax,[rip+0x96b3df]        # 1833128 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x50c0>
      ec7d49:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec7d4c:	48 83 c7 70          	add    rdi,0x70
      ec7d50:	e8 7f 1e 91 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      ec7d55:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
      ec7d59:	e8 28 67 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec7d5e:	48 83 c3 08          	add    rbx,0x8
      ec7d62:	48 89 df             	mov    rdi,rbx
      ec7d65:	5b                   	pop    rbx
      ec7d66:	e9 fb 20 91 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ec7d6b:	cc                   	int3

### 0xed611d from 0xed5ebe..0xed61a0
      ed60ea:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ed60ef:	e8 9c 7d 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed60f4:	4c 89 e7             	mov    rdi,r12
      ed60f7:	e8 b4 a9 be ff       	call   ac0ab0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda50>
      ed60fc:	40 b5 01             	mov    bpl,0x1
      ed60ff:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ed6104:	e8 87 b0 d7 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      ed6109:	e9 31 ff ff ff       	jmp    ed603f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d455>
      ed610e:	40 f6 c5 01          	test   bpl,0x1
      ed6112:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      ed6117:	74 09                	je     ed6122 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d538>
      ed6119:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      ed611d:	e8 86 29 c5 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ed6122:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
      ed6129:	eb 07                	jmp    ed6132 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d548>
      ed612b:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
      ed6132:	4d 85 f6             	test   r14,r14
      ed6135:	74 23                	je     ed615a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d570>
      ed6137:	48 83 c3 20          	add    rbx,0x20
      ed613b:	48 89 df             	mov    rdi,rbx
      ed613e:	e8 f3 56 ba ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ed6143:	48 89 d1             	mov    rcx,rdx
      ed6146:	6a 01                	push   0x1
      ed6148:	5e                   	pop    rsi
      ed6149:	4c 89 f7             	mov    rdi,r14
      ed614c:	48 89 c2             	mov    rdx,rax

### 0xed6e0f from 0xed6b8a..0xed6e92
      ed6ddc:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      ed6de1:	e8 aa 70 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed6de6:	4c 89 e7             	mov    rdi,r12
      ed6de9:	e8 66 29 71 00       	call   15e9754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ecd8>
      ed6dee:	41 b6 01             	mov    r14b,0x1
      ed6df1:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      ed6df6:	e8 95 a3 d7 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      ed6dfb:	e9 12 ff ff ff       	jmp    ed6d12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e128>
      ed6e00:	41 f6 c6 01          	test   r14b,0x1
      ed6e04:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      ed6e09:	74 09                	je     ed6e14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e22a>
      ed6e0b:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      ed6e0f:	e8 94 1c c5 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ed6e14:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
      ed6e1b:	eb 07                	jmp    ed6e24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e23a>
      ed6e1d:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
      ed6e24:	4d 85 f6             	test   r14,r14
      ed6e27:	74 23                	je     ed6e4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e262>
      ed6e29:	48 83 c3 20          	add    rbx,0x20
      ed6e2d:	48 89 df             	mov    rdi,rbx
      ed6e30:	e8 01 4a ba ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ed6e35:	48 89 d1             	mov    rcx,rdx
      ed6e38:	6a 01                	push   0x1
      ed6e3a:	5e                   	pop    rsi
      ed6e3b:	4c 89 f7             	mov    rdi,r14
      ed6e3e:	48 89 c2             	mov    rdx,rax

### 0xed7ddc from 0xed7b42..0xed7e5f
      ed7dab:	e8 e0 60 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed7db0:	4c 89 ef             	mov    rdi,r13
      ed7db3:	e8 f6 55 6d 00       	call   15ad3ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f2932>
      ed7db8:	41 b6 01             	mov    r14b,0x1
      ed7dbb:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      ed7dc2:	00 
      ed7dc3:	e8 c8 93 d7 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      ed7dc8:	e9 fa fe ff ff       	jmp    ed7cc7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f0dd>
      ed7dcd:	41 f6 c6 01          	test   r14b,0x1
      ed7dd1:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      ed7dd6:	74 09                	je     ed7de1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f1f7>
      ed7dd8:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      ed7ddc:	e8 c7 0c c5 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ed7de1:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
      ed7de8:	eb 07                	jmp    ed7df1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f207>
      ed7dea:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
      ed7df1:	4d 85 f6             	test   r14,r14
      ed7df4:	74 23                	je     ed7e19 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f22f>
      ed7df6:	48 83 c3 20          	add    rbx,0x20
      ed7dfa:	48 89 df             	mov    rdi,rbx
      ed7dfd:	e8 34 3a ba ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ed7e02:	48 89 d1             	mov    rcx,rdx
      ed7e05:	6a 01                	push   0x1
      ed7e07:	5e                   	pop    rsi
      ed7e08:	4c 89 f7             	mov    rdi,r14
      ed7e0b:	48 89 c2             	mov    rdx,rax

### 0xed89ee from 0xed8768..0xed8a71
      ed89bb:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      ed89c0:	e8 cb 54 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed89c5:	4c 89 e7             	mov    rdi,r12
      ed89c8:	e8 3b 20 bd ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
      ed89cd:	40 b5 01             	mov    bpl,0x1
      ed89d0:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      ed89d5:	e8 b6 87 d7 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      ed89da:	e9 10 ff ff ff       	jmp    ed88ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9fd05>
      ed89df:	40 f6 c5 01          	test   bpl,0x1
      ed89e3:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      ed89e8:	74 09                	je     ed89f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9fe09>
      ed89ea:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      ed89ee:	e8 b5 00 c5 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ed89f3:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
      ed89fa:	eb 07                	jmp    ed8a03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9fe19>
      ed89fc:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
      ed8a03:	4d 85 f6             	test   r14,r14
      ed8a06:	74 23                	je     ed8a2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9fe41>
      ed8a08:	48 83 c3 20          	add    rbx,0x20
      ed8a0c:	48 89 df             	mov    rdi,rbx
      ed8a0f:	e8 22 2e ba ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ed8a14:	48 89 d1             	mov    rcx,rdx
      ed8a17:	6a 01                	push   0x1
      ed8a19:	5e                   	pop    rsi
      ed8a1a:	4c 89 f7             	mov    rdi,r14
      ed8a1d:	48 89 c2             	mov    rdx,rax

### 0xed93ee from 0xed915a..0xed9471
      ed93bb:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      ed93c0:	e8 cb 4a 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed93c5:	4c 89 ef             	mov    rdi,r13
      ed93c8:	e8 d9 6b d3 ff       	call   c0ffa6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15cf46>
      ed93cd:	41 b6 01             	mov    r14b,0x1
      ed93d0:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      ed93d5:	e8 b6 7d d7 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      ed93da:	e9 0c ff ff ff       	jmp    ed92eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0701>
      ed93df:	41 f6 c6 01          	test   r14b,0x1
      ed93e3:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      ed93e8:	74 09                	je     ed93f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0809>
      ed93ea:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      ed93ee:	e8 b5 f6 c4 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ed93f3:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
      ed93fa:	eb 07                	jmp    ed9403 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0819>
      ed93fc:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
      ed9403:	4d 85 f6             	test   r14,r14
      ed9406:	74 23                	je     ed942b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0841>
      ed9408:	48 83 c3 20          	add    rbx,0x20
      ed940c:	48 89 df             	mov    rdi,rbx
      ed940f:	e8 22 24 ba ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ed9414:	48 89 d1             	mov    rcx,rdx
      ed9417:	6a 01                	push   0x1
      ed9419:	5e                   	pop    rsi
      ed941a:	4c 89 f7             	mov    rdi,r14
      ed941d:	48 89 c2             	mov    rdx,rax

### 0xed9f32 from 0xed9ca0..0xed9fb5
      ed9eff:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ed9f04:	e8 87 3f 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed9f09:	4c 89 ef             	mov    rdi,r13
      ed9f0c:	e8 95 60 d3 ff       	call   c0ffa6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15cf46>
      ed9f11:	40 b5 01             	mov    bpl,0x1
      ed9f14:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ed9f19:	e8 72 72 d7 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      ed9f1e:	e9 04 ff ff ff       	jmp    ed9e27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa123d>
      ed9f23:	40 f6 c5 01          	test   bpl,0x1
      ed9f27:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      ed9f2c:	74 09                	je     ed9f37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa134d>
      ed9f2e:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      ed9f32:	e8 71 eb c4 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ed9f37:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
      ed9f3e:	eb 07                	jmp    ed9f47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa135d>
      ed9f40:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
      ed9f47:	4d 85 f6             	test   r14,r14
      ed9f4a:	74 23                	je     ed9f6f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1385>
      ed9f4c:	48 83 c3 20          	add    rbx,0x20
      ed9f50:	48 89 df             	mov    rdi,rbx
      ed9f53:	e8 de 18 ba ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ed9f58:	48 89 d1             	mov    rcx,rdx
      ed9f5b:	6a 01                	push   0x1
      ed9f5d:	5e                   	pop    rsi
      ed9f5e:	4c 89 f7             	mov    rdi,r14
      ed9f61:	48 89 c2             	mov    rdx,rax

### 0xedaa8b from 0xeda7d4..0xedab0e
      edaa5a:	e8 31 34 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      edaa5f:	4c 89 e7             	mov    rdi,r12
      edaa62:	e8 3f 2a 6d 00       	call   15ad4a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f2a2a>
      edaa67:	40 b5 01             	mov    bpl,0x1
      edaa6a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      edaa71:	00 
      edaa72:	e8 19 67 d7 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      edaa77:	e9 eb fe ff ff       	jmp    eda967 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1d7d>
      edaa7c:	40 f6 c5 01          	test   bpl,0x1
      edaa80:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      edaa85:	74 09                	je     edaa90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1ea6>
      edaa87:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      edaa8b:	e8 18 e0 c4 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      edaa90:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
      edaa97:	eb 07                	jmp    edaaa0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1eb6>
      edaa99:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
      edaaa0:	4d 85 f6             	test   r14,r14
      edaaa3:	74 23                	je     edaac8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1ede>
      edaaa5:	48 83 c3 20          	add    rbx,0x20
      edaaa9:	48 89 df             	mov    rdi,rbx
      edaaac:	e8 85 0d ba ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      edaab1:	48 89 d1             	mov    rcx,rdx
      edaab4:	6a 01                	push   0x1
      edaab6:	5e                   	pop    rsi
      edaab7:	4c 89 f7             	mov    rdi,r14
      edaaba:	48 89 c2             	mov    rdx,rax

### 0xedb7ca from 0xedb526..0xedb84d
      edb797:	e8 f4 26 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      edb79c:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
      edb7a3:	00 
      edb7a4:	e8 c3 1a 6d 00       	call   15ad26c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f27f0>
      edb7a9:	41 b6 01             	mov    r14b,0x1
      edb7ac:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      edb7b1:	e8 da 59 d7 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      edb7b6:	e9 ed fe ff ff       	jmp    edb6a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa2abe>
      edb7bb:	41 f6 c6 01          	test   r14b,0x1
      edb7bf:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      edb7c4:	74 09                	je     edb7cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa2be5>
      edb7c6:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      edb7ca:	e8 d9 d2 c4 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      edb7cf:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
      edb7d6:	eb 07                	jmp    edb7df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa2bf5>
      edb7d8:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
      edb7df:	4d 85 f6             	test   r14,r14
      edb7e2:	74 23                	je     edb807 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa2c1d>
      edb7e4:	48 83 c3 20          	add    rbx,0x20
      edb7e8:	48 89 df             	mov    rdi,rbx
      edb7eb:	e8 46 00 ba ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      edb7f0:	48 89 d1             	mov    rcx,rdx
      edb7f3:	6a 01                	push   0x1
      edb7f5:	5e                   	pop    rsi
      edb7f6:	4c 89 f7             	mov    rdi,r14
      edb7f9:	48 89 c2             	mov    rdx,rax

### 0xedcb2b from 0xedc89c..0xedcbae
      edcafa:	e8 91 13 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      edcaff:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
      edcb06:	00 
      edcb07:	e8 fc de bc ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
      edcb0c:	41 b5 01             	mov    r13b,0x1
      edcb0f:	4c 89 f7             	mov    rdi,r14
      edcb12:	e8 79 46 d7 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
      edcb17:	e9 00 ff ff ff       	jmp    edca1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa3e32>
      edcb1c:	41 f6 c5 01          	test   r13b,0x1
      edcb20:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      edcb25:	74 09                	je     edcb30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa3f46>
      edcb27:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      edcb2b:	e8 78 bf c4 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      edcb30:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
      edcb37:	eb 07                	jmp    edcb40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa3f56>
      edcb39:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
      edcb40:	4d 85 f6             	test   r14,r14
      edcb43:	74 23                	je     edcb68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa3f7e>
      edcb45:	48 83 c3 20          	add    rbx,0x20
      edcb49:	48 89 df             	mov    rdi,rbx
      edcb4c:	e8 e5 ec b9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      edcb51:	48 89 d1             	mov    rcx,rdx
      edcb54:	6a 01                	push   0x1
      edcb56:	5e                   	pop    rsi
      edcb57:	4c 89 f7             	mov    rdi,r14
      edcb5a:	48 89 c2             	mov    rdx,rax

### 0xfee90e from 0xfee906..0xfee913
      fee8e1:	cc                   	int3
      fee8e2:	49 89 f0             	mov    r8,rsi
      fee8e5:	48 8d 35 a5 e7 aa ff 	lea    rsi,[rip+0xffffffffffaae7a5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      fee8ec:	48 8d 0d 0b 00 00 00 	lea    rcx,[rip+0xb]        # fee8fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b5d14>
      fee8f3:	6a 08                	push   0x8
      fee8f5:	41 59                	pop    r9
      fee8f7:	31 d2                	xor    edx,edx
      fee8f9:	e9 96 be 7e 00       	jmp    17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      fee8fe:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      fee901:	e9 00 00 00 00       	jmp    fee906 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b5d1c>
      fee906:	c6 47 78 00          	mov    BYTE PTR [rdi+0x78],0x0
      fee90a:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      fee90e:	e9 95 a1 b3 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      fee913:	cc                   	int3
      fee914:	53                   	push   rbx
      fee915:	48 89 fb             	mov    rbx,rdi
      fee918:	e8 25 0e 00 00       	call   fef742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b6b58>
      fee91d:	48 83 c3 48          	add    rbx,0x48
      fee921:	48 89 d8             	mov    rax,rbx
      fee924:	5b                   	pop    rbx
      fee925:	c3                   	ret
      fee926:	53                   	push   rbx
      fee927:	48 89 fb             	mov    rbx,rdi
      fee92a:	48 8d 05 5f 55 85 00 	lea    rax,[rip+0x85555f]        # 1843e90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x578>
      fee931:	48 89 07             	mov    QWORD PTR [rdi],rax
      fee934:	48 81 c7 80 00 00 00 	add    rdi,0x80

### 0xfef78e from 0xfef742..0xfef793
      fef769:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      fef76c:	ff 10                	call   QWORD PTR [rax]
      fef76e:	48 89 df             	mov    rdi,rbx
      fef771:	4c 89 f6             	mov    rsi,r14
      fef774:	48 89 c2             	mov    rdx,rax
      fef777:	e8 a8 f6 ff ff       	call   feee24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b623a>
      fef77c:	c6 43 78 01          	mov    BYTE PTR [rbx+0x78],0x1
      fef780:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
      fef784:	48 89 df             	mov    rdi,rbx
      fef787:	48 83 c4 08          	add    rsp,0x8
      fef78b:	5b                   	pop    rbx
      fef78c:	41 5e                	pop    r14
      fef78e:	e9 15 93 b3 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      fef793:	cc                   	int3
      fef794:	48 83 ec 18          	sub    rsp,0x18
      fef798:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fef79f:	00 00 
      fef7a1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      fef7a6:	48 8d 15 24 00 00 00 	lea    rdx,[rip+0x24]        # fef7d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b6be7>
      fef7ad:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
      fef7b2:	e8 1f 97 ae ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>
      fef7b7:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      fef7be:	00 00 
      fef7c0:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
      fef7c5:	75 05                	jne    fef7cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b6be2>
      fef7c7:	48 83 c4 18          	add    rsp,0x18

### 0xfefc7c from 0xfef8be..0xfefd04
      fefc49:	bf f0 0f 00 00       	mov    edi,0xff0
      fefc4e:	48 03 78 f8          	add    rdi,QWORD PTR [rax-0x8]
      fefc52:	48 83 c7 b0          	add    rdi,0xffffffffffffffb0
      fefc56:	49 8b 36             	mov    rsi,QWORD PTR [r14]
      fefc59:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      fefc5e:	e8 c7 fa ff ff       	call   fef72a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b6b40>
      fefc63:	f3 0f 6f 43 28       	movdqu xmm0,XMMWORD PTR [rbx+0x28]
      fefc68:	66 0f d4 05 00 d2 39 	paddq  xmm0,XMMWORD PTR [rip+0xffffffffff39d200]        # 38ce70 <_ZTSSt12bad_any_cast@@Base-0x3358>
      fefc6f:	ff 
      fefc70:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
      fefc75:	48 83 c3 38          	add    rbx,0x38
      fefc79:	48 89 df             	mov    rdi,rbx
      fefc7c:	e8 27 8e b3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      fefc81:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      fefc86:	e8 03 e7 0b 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
      fefc8b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fefc92:	00 00 
      fefc94:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
      fefc9b:	00 
      fefc9c:	75 61                	jne    fefcff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7115>
      fefc9e:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
      fefca5:	5b                   	pop    rbx
      fefca6:	41 5c                	pop    r12
      fefca8:	41 5d                	pop    r13
      fefcaa:	41 5e                	pop    r14
      fefcac:	41 5f                	pop    r15

### 0xff58ab from 0xff58a8..0xff58b0
      ff5883:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff588a:	00 00 
      ff588c:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ff5891:	75 08                	jne    ff589b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bccb1>
      ff5893:	48 83 c4 28          	add    rsp,0x28
      ff5897:	5b                   	pop    rbx
      ff5898:	41 5e                	pop    r14
      ff589a:	c3                   	ret
      ff589b:	e8 10 a2 7f 00       	call   17efab0 <__stack_chk_fail@plt>
      ff58a0:	48 89 c7             	mov    rdi,rax
      ff58a3:	e8 fd 41 a8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ff58a8:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      ff58ab:	e9 f8 31 b3 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ff58b0:	55                   	push   rbp
      ff58b1:	41 57                	push   r15
      ff58b3:	41 56                	push   r14
      ff58b5:	53                   	push   rbx
      ff58b6:	48 81 ec f8 0e 00 00 	sub    rsp,0xef8
      ff58bd:	49 89 fe             	mov    r14,rdi
      ff58c0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff58c7:	00 00 
      ff58c9:	48 89 84 24 f0 0e 00 	mov    QWORD PTR [rsp+0xef0],rax
      ff58d0:	00 
      ff58d1:	83 fa 01             	cmp    edx,0x1
      ff58d4:	75 09                	jne    ff58df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bccf5>
      ff58d6:	49 63 5e 38          	movsxd rbx,DWORD PTR [r14+0x38]

### 0xff64b3 from 0xff6314..0xff6529
      ff6487:	84 c0                	test   al,al
      ff6489:	75 2d                	jne    ff64b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bd8ce>
      ff648b:	40 84 ed             	test   bpl,bpl
      ff648e:	74 07                	je     ff6497 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bd8ad>
      ff6490:	c6 83 38 25 00 00 01 	mov    BYTE PTR [rbx+0x2538],0x1
      ff6497:	48 89 df             	mov    rdi,rbx
      ff649a:	e8 c7 0e 00 00       	call   ff7366 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be77c>
      ff649f:	48 83 bb 48 10 00 00 	cmp    QWORD PTR [rbx+0x1048],0x0
      ff64a6:	00 
      ff64a7:	75 0f                	jne    ff64b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bd8ce>
      ff64a9:	48 81 c3 f0 0f 00 00 	add    rbx,0xff0
      ff64b0:	48 89 df             	mov    rdi,rbx
      ff64b3:	e8 f0 25 b3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      ff64b8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ff64bd:	e8 10 38 7e 00       	call   17d9cd2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5af3>
      ff64c2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff64c9:	00 00 
      ff64cb:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
      ff64d0:	75 52                	jne    ff6524 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bd93a>
      ff64d2:	48 83 c4 40          	add    rsp,0x40
      ff64d6:	5b                   	pop    rbx
      ff64d7:	41 5e                	pop    r14
      ff64d9:	5d                   	pop    rbp
      ff64da:	c3                   	ret
      ff64db:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff64e2:	00 00 

### 0x100027b from 0x1000276..0x100028a
     100024c:	c6 47 58 00          	mov    BYTE PTR [rdi+0x58],0x0
     1000250:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
     1000257:	e8 dc 16 7c 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     100025c:	80 bb a0 00 00 00 00 	cmp    BYTE PTR [rbx+0xa0],0x0
     1000263:	74 07                	je     100026c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7682>
     1000265:	c6 83 a0 00 00 00 00 	mov    BYTE PTR [rbx+0xa0],0x0
     100026c:	5b                   	pop    rbx
     100026d:	c3                   	ret
     100026e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1000271:	e9 00 00 00 00       	jmp    1000276 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c768c>
     1000276:	50                   	push   rax
     1000277:	c6 47 58 01          	mov    BYTE PTR [rdi+0x58],0x1
     100027b:	e8 28 88 b2 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1000280:	58                   	pop    rax
     1000281:	c3                   	ret
     1000282:	48 89 c7             	mov    rdi,rax
     1000285:	e8 1b 98 a7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     100028a:	41 57                	push   r15
     100028c:	41 56                	push   r14
     100028e:	53                   	push   rbx
     100028f:	48 83 ec 20          	sub    rsp,0x20
     1000293:	48 89 fb             	mov    rbx,rdi
     1000296:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     100029d:	00 00 
     100029f:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     10002a4:	4c 8b 37             	mov    r14,QWORD PTR [rdi]

### 0x1009c99 from 0x1009c8e..0x1009c9e
     1009c7a:	48 83 c4 68          	add    rsp,0x68
     1009c7e:	5b                   	pop    rbx
     1009c7f:	41 5c                	pop    r12
     1009c81:	41 5d                	pop    r13
     1009c83:	41 5e                	pop    r14
     1009c85:	41 5f                	pop    r15
     1009c87:	5d                   	pop    rbp
     1009c88:	c3                   	ret
     1009c89:	e8 22 5e 7e 00       	call   17efab0 <__stack_chk_fail@plt>
     1009c8e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1009c91:	c6 47 58 00          	mov    BYTE PTR [rdi+0x58],0x0
     1009c95:	48 83 c7 60          	add    rdi,0x60
     1009c99:	e9 0a ee b1 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1009c9e:	53                   	push   rbx
     1009c9f:	48 89 fb             	mov    rbx,rdi
     1009ca2:	e8 a5 01 00 00       	call   1009e4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1262>
     1009ca7:	48 83 c3 28          	add    rbx,0x28
     1009cab:	48 89 d8             	mov    rax,rbx
     1009cae:	5b                   	pop    rbx
     1009caf:	c3                   	ret
     1009cb0:	53                   	push   rbx
     1009cb1:	48 89 fb             	mov    rbx,rdi
     1009cb4:	48 8d 05 ad ac 83 00 	lea    rax,[rip+0x83acad]        # 1844968 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1050>
     1009cbb:	48 89 07             	mov    QWORD PTR [rdi],rax
     1009cbe:	48 83 c7 60          	add    rdi,0x60
     1009cc2:	e8 9f 01 7d 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>

### 0x1041c11 from 0x10419ac..0x1041c94
     1041bde:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1041be3:	e8 a8 c2 7a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1041be8:	4c 89 e7             	mov    rdi,r12
     1041beb:	e8 b6 e3 bc ff       	call   c0ffa6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15cf46>
     1041bf0:	41 b5 01             	mov    r13b,0x1
     1041bf3:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1041bf8:	e8 93 f5 c0 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
     1041bfd:	e9 2c ff ff ff       	jmp    1041b2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208f44>
     1041c02:	41 f6 c5 01          	test   r13b,0x1
     1041c06:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     1041c0b:	74 09                	je     1041c16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20902c>
     1041c0d:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     1041c11:	e8 92 6e ae ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1041c16:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
     1041c1d:	eb 07                	jmp    1041c26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20903c>
     1041c1f:	4d 8b b5 18 01 00 00 	mov    r14,QWORD PTR [r13+0x118]
     1041c26:	4d 85 f6             	test   r14,r14
     1041c29:	74 23                	je     1041c4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x209064>
     1041c2b:	48 83 c3 20          	add    rbx,0x20
     1041c2f:	48 89 df             	mov    rdi,rbx
     1041c32:	e8 ff 9b a3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1041c37:	48 89 d1             	mov    rcx,rdx
     1041c3a:	6a 01                	push   0x1
     1041c3c:	5e                   	pop    rsi
     1041c3d:	4c 89 f7             	mov    rdi,r14
     1041c40:	48 89 c2             	mov    rdx,rax

### 0x104278d from 0x1042530..0x1042810
     104275c:	e8 2f b7 7a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1042761:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     1042768:	00 
     1042769:	e8 9a 82 a6 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     104276e:	41 b4 01             	mov    r12b,0x1
     1042771:	4c 89 f7             	mov    rdi,r14
     1042774:	e8 17 ea c0 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
     1042779:	e9 2d ff ff ff       	jmp    10426ab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x209ac1>
     104277e:	41 f6 c4 01          	test   r12b,0x1
     1042782:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     1042787:	74 09                	je     1042792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x209ba8>
     1042789:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     104278d:	e8 16 63 ae ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1042792:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
     1042799:	eb 07                	jmp    10427a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x209bb8>
     104279b:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
     10427a2:	4d 85 f6             	test   r14,r14
     10427a5:	74 23                	je     10427ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x209be0>
     10427a7:	48 83 c3 20          	add    rbx,0x20
     10427ab:	48 89 df             	mov    rdi,rbx
     10427ae:	e8 83 90 a3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10427b3:	48 89 d1             	mov    rcx,rdx
     10427b6:	6a 01                	push   0x1
     10427b8:	5e                   	pop    rsi
     10427b9:	4c 89 f7             	mov    rdi,r14
     10427bc:	48 89 c2             	mov    rdx,rax

### 0x1047af2 from 0x1047a64..0x1047b0c
     1047ac0:	49 ff 4e 38          	dec    QWORD PTR [r14+0x38]
     1047ac4:	4c 89 e7             	mov    rdi,r12
     1047ac7:	4c 89 fe             	mov    rsi,r15
     1047aca:	e8 83 22 a6 ff       	call   aa9d52 <JNI_OnUnload@@Base+0x3161f>
     1047acf:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]
     1047ad3:	e8 9e 6c a5 ff       	call   a9e776 <JNI_OnUnload@@Base+0x26043>
     1047ad8:	4c 89 ff             	mov    rdi,r15
     1047adb:	e8 40 64 7a 00       	call   17edf20 <_ZdlPv@plt>
     1047ae0:	48 83 a3 80 00 00 00 	and    QWORD PTR [rbx+0x80],0x0
     1047ae7:	00 
     1047ae8:	48 81 c3 b0 00 00 00 	add    rbx,0xb0
     1047aef:	48 89 df             	mov    rdi,rbx
     1047af2:	e8 b1 0f ae ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1047af7:	4d 85 f6             	test   r14,r14
     1047afa:	0f 95 c0             	setne  al
     1047afd:	48 83 c4 08          	add    rsp,0x8
     1047b01:	5b                   	pop    rbx
     1047b02:	41 5c                	pop    r12
     1047b04:	41 5d                	pop    r13
     1047b06:	41 5e                	pop    r14
     1047b08:	41 5f                	pop    r15
     1047b0a:	5d                   	pop    rbp
     1047b0b:	c3                   	ret
     1047b0c:	55                   	push   rbp
     1047b0d:	41 57                	push   r15
     1047b0f:	41 56                	push   r14

### 0x1048c33 from 0x104819a..0x1049673
     1048bff:	e8 de 5b a5 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     1048c04:	49 89 c6             	mov    r14,rax
     1048c07:	48 8d 84 24 d0 00 00 	lea    rax,[rsp+0xd0]
     1048c0e:	00 
     1048c0f:	4c 39 f0             	cmp    rax,r14
     1048c12:	0f 85 fc fa ff ff    	jne    1048714 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20fb2a>
     1048c18:	f6 44 24 40 01       	test   BYTE PTR [rsp+0x40],0x1
     1048c1d:	0f 94 c3             	sete   bl
     1048c20:	f6 44 24 44 01       	test   BYTE PTR [rsp+0x44],0x1
     1048c25:	74 15                	je     1048c3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x210052>
     1048c27:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1048c2c:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     1048c33:	e8 70 fe ad ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1048c38:	eb 02                	jmp    1048c3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x210052>
     1048c3a:	b3 01                	mov    bl,0x1
     1048c3c:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1048c41:	4d 8d 77 30          	lea    r14,[r15+0x30]
     1048c45:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0
     1048c49:	0f 84 04 08 00 00    	je     1049453 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x210869>
     1048c4f:	48 8b 94 24 50 01 00 	mov    rdx,QWORD PTR [rsp+0x150]
     1048c56:	00 
     1048c57:	48 8b 8c 24 58 01 00 	mov    rcx,QWORD PTR [rsp+0x158]
     1048c5e:	00 
     1048c5f:	4c 89 ff             	mov    rdi,r15
     1048c62:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]
     1048c67:	e8 90 12 00 00       	call   1049efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211312>

### 0x104a9c1 from 0x104a2aa..0x104aab8
     104a992:	00 
     104a993:	e9 9c fa ff ff       	jmp    104a434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21184a>
     104a998:	48 8b 94 24 80 01 00 	mov    rdx,QWORD PTR [rsp+0x180]
     104a99f:	00 
     104a9a0:	48 8b 8c 24 88 01 00 	mov    rcx,QWORD PTR [rsp+0x188]
     104a9a7:	00 
     104a9a8:	4c 89 ef             	mov    rdi,r13
     104a9ab:	4c 89 e6             	mov    rsi,r12
     104a9ae:	e8 49 f5 ff ff       	call   1049efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211312>
     104a9b3:	f6 44 24 1c 01       	test   BYTE PTR [rsp+0x1c],0x1
     104a9b8:	74 0c                	je     104a9c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211ddc>
     104a9ba:	49 8d bd 08 01 00 00 	lea    rdi,[r13+0x108]
     104a9c1:	e8 e2 e0 ad ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     104a9c6:	80 7c 24 17 00       	cmp    BYTE PTR [rsp+0x17],0x0
     104a9cb:	74 17                	je     104a9e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211dfa>
     104a9cd:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
     104a9d1:	24 01                	and    al,0x1
     104a9d3:	74 0f                	je     104a9e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211dfa>
     104a9d5:	49 81 c5 b0 00 00 00 	add    r13,0xb0
     104a9dc:	4c 89 ef             	mov    rdi,r13
     104a9df:	e8 c4 e0 ad ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     104a9e4:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     104a9eb:	00 
     104a9ec:	e8 eb f5 ff ff       	call   1049fdc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2113f2>
     104a9f1:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
     104a9f7:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1

### 0x104a9df from 0x104a2aa..0x104aab8
     104a9ae:	e8 49 f5 ff ff       	call   1049efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211312>
     104a9b3:	f6 44 24 1c 01       	test   BYTE PTR [rsp+0x1c],0x1
     104a9b8:	74 0c                	je     104a9c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211ddc>
     104a9ba:	49 8d bd 08 01 00 00 	lea    rdi,[r13+0x108]
     104a9c1:	e8 e2 e0 ad ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     104a9c6:	80 7c 24 17 00       	cmp    BYTE PTR [rsp+0x17],0x0
     104a9cb:	74 17                	je     104a9e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211dfa>
     104a9cd:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
     104a9d1:	24 01                	and    al,0x1
     104a9d3:	74 0f                	je     104a9e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211dfa>
     104a9d5:	49 81 c5 b0 00 00 00 	add    r13,0xb0
     104a9dc:	4c 89 ef             	mov    rdi,r13
     104a9df:	e8 c4 e0 ad ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     104a9e4:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     104a9eb:	00 
     104a9ec:	e8 eb f5 ff ff       	call   1049fdc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2113f2>
     104a9f1:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
     104a9f7:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     104a9fe:	e8 83 3a a5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     104aa03:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     104aa0a:	00 00 
     104aa0c:	48 3b 84 24 20 02 00 	cmp    rax,QWORD PTR [rsp+0x220]
     104aa13:	00 
     104aa14:	75 12                	jne    104aa28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211e3e>
     104aa16:	48 81 c4 28 02 00 00 	add    rsp,0x228
     104aa1d:	5b                   	pop    rbx

### 0x1051a95 from 0x105199a..0x1051ab7
     1051a6a:	e8 e3 82 a5 ff       	call   aa9d52 <JNI_OnUnload@@Base+0x3161f>
     1051a6f:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     1051a73:	e8 0e ca a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1051a78:	4c 89 f7             	mov    rdi,r14
     1051a7b:	e8 a0 c4 79 00       	call   17edf20 <_ZdlPv@plt>
     1051a80:	40 b5 01             	mov    bpl,0x1
     1051a83:	4d 89 fe             	mov    r14,r15
     1051a86:	4d 39 e7             	cmp    r15,r12
     1051a89:	75 a5                	jne    1051a30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x218e46>
     1051a8b:	40 f6 c5 01          	test   bpl,0x1
     1051a8f:	74 09                	je     1051a9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x218eb0>
     1051a91:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     1051a95:	e8 0e 70 ad ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1051a9a:	48 81 c3 98 00 00 00 	add    rbx,0x98
     1051aa1:	48 89 df             	mov    rdi,rbx
     1051aa4:	48 83 c4 08          	add    rsp,0x8
     1051aa8:	5b                   	pop    rbx
     1051aa9:	41 5c                	pop    r12
     1051aab:	41 5d                	pop    r13
     1051aad:	41 5e                	pop    r14
     1051aaf:	41 5f                	pop    r15
     1051ab1:	5d                   	pop    rbp
     1051ab2:	e9 f1 6f ad ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1051ab7:	cc                   	int3
     1051ab8:	41 57                	push   r15
     1051aba:	41 56                	push   r14

### 0x1051ab2 from 0x105199a..0x1051ab7
     1051a8f:	74 09                	je     1051a9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x218eb0>
     1051a91:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     1051a95:	e8 0e 70 ad ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1051a9a:	48 81 c3 98 00 00 00 	add    rbx,0x98
     1051aa1:	48 89 df             	mov    rdi,rbx
     1051aa4:	48 83 c4 08          	add    rsp,0x8
     1051aa8:	5b                   	pop    rbx
     1051aa9:	41 5c                	pop    r12
     1051aab:	41 5d                	pop    r13
     1051aad:	41 5e                	pop    r14
     1051aaf:	41 5f                	pop    r15
     1051ab1:	5d                   	pop    rbp
     1051ab2:	e9 f1 6f ad ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1051ab7:	cc                   	int3
     1051ab8:	41 57                	push   r15
     1051aba:	41 56                	push   r14
     1051abc:	41 54                	push   r12
     1051abe:	53                   	push   rbx
     1051abf:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
     1051ac6:	49 89 f6             	mov    r14,rsi
     1051ac9:	48 89 fb             	mov    rbx,rdi
     1051acc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1051ad3:	00 00 
     1051ad5:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     1051adc:	00 
     1051add:	48 8b 36             	mov    rsi,QWORD PTR [rsi]

### 0x1052e3f from 0x1052e34..0x1052e44
     1052e0f:	e8 72 b6 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1052e14:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1052e1b:	00 00 
     1052e1d:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     1052e24:	00 
     1052e25:	75 08                	jne    1052e2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21a245>
     1052e27:	48 89 df             	mov    rdi,rbx
     1052e2a:	e8 a1 ce a1 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1052e2f:	e8 7c cc 79 00       	call   17efab0 <__stack_chk_fail@plt>
     1052e34:	b8 e0 00 00 00       	mov    eax,0xe0
     1052e39:	48 03 07             	add    rax,QWORD PTR [rdi]
     1052e3c:	48 89 c7             	mov    rdi,rax
     1052e3f:	e9 64 5c ad ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1052e44:	53                   	push   rbx
     1052e45:	48 89 fb             	mov    rbx,rdi
     1052e48:	6a 10                	push   0x10
     1052e4a:	5f                   	pop    rdi
     1052e4b:	e8 b0 b0 79 00       	call   17edf00 <_Znwm@plt>
     1052e50:	48 8d 0d 89 4d 7f 00 	lea    rcx,[rip+0x7f4d89]        # 1847be0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42c8>
     1052e57:	48 89 08             	mov    QWORD PTR [rax],rcx
     1052e5a:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     1052e5e:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1052e62:	5b                   	pop    rbx
     1052e63:	c3                   	ret
     1052e64:	48 8d 05 75 4d 7f 00 	lea    rax,[rip+0x7f4d75]        # 1847be0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42c8>
     1052e6b:	48 89 06             	mov    QWORD PTR [rsi],rax

### 0x1052e84 from 0x1052e78..0x1052e89
     1052e5e:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1052e62:	5b                   	pop    rbx
     1052e63:	c3                   	ret
     1052e64:	48 8d 05 75 4d 7f 00 	lea    rax,[rip+0x7f4d75]        # 1847be0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42c8>
     1052e6b:	48 89 06             	mov    QWORD PTR [rsi],rax
     1052e6e:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     1052e72:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     1052e76:	c3                   	ret
     1052e77:	cc                   	int3
     1052e78:	b8 88 00 00 00       	mov    eax,0x88
     1052e7d:	48 03 47 08          	add    rax,QWORD PTR [rdi+0x8]
     1052e81:	48 89 c7             	mov    rdi,rax
     1052e84:	e9 1f 5c ad ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1052e89:	cc                   	int3
     1052e8a:	53                   	push   rbx
     1052e8b:	48 89 fb             	mov    rbx,rdi
     1052e8e:	48 8d 05 f3 4c 7f 00 	lea    rax,[rip+0x7f4cf3]        # 1847b88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4270>
     1052e95:	48 89 07             	mov    QWORD PTR [rdi],rax
     1052e98:	48 81 c7 38 01 00 00 	add    rdi,0x138
     1052e9f:	e8 30 6d 78 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1052ea4:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
     1052eab:	e8 b6 6f 78 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1052eb0:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
     1052eb7:	e8 aa 6f 78 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1052ebc:	48 83 c3 10          	add    rbx,0x10
     1052ec0:	48 89 df             	mov    rdi,rbx

### 0x10597f9 from 0x105940e..0x105988c
     10597ba:	41 8a 86 d1 05 00 00 	mov    al,BYTE PTR [r14+0x5d1]
     10597c1:	41 88 86 00 0d 00 00 	mov    BYTE PTR [r14+0xd00],al
     10597c8:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     10597cd:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
     10597d2:	48 8d 15 4a ea 2c ff 	lea    rdx,[rip+0xffffffffff2cea4a]        # 328223 <_ZTSSt12bad_any_cast@@Base-0x67fa5>
     10597d9:	e8 7e 57 ae ff       	call   b3ef5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8befc>
     10597de:	48 89 c7             	mov    rdi,rax
     10597e1:	31 f6                	xor    esi,esi
     10597e3:	e8 b6 a8 76 00       	call   17c409e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17820a>
     10597e8:	41 88 86 d2 05 00 00 	mov    BYTE PTR [r14+0x5d2],al
     10597ef:	49 81 c6 00 06 00 00 	add    r14,0x600
     10597f6:	4c 89 f7             	mov    rdi,r14
     10597f9:	e8 aa f2 ac ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10597fe:	c7 03 cc 00 00 00    	mov    DWORD PTR [rbx],0xcc
     1059804:	0f 57 c0             	xorps  xmm0,xmm0
     1059807:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     105980b:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
     105980f:	c7 43 28 00 00 80 3f 	mov    DWORD PTR [rbx+0x28],0x3f800000
     1059816:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     105981a:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
     105981f:	eb 28                	jmp    1059849 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x220c5f>
     1059821:	48 8d 35 5f 48 31 ff 	lea    rsi,[rip+0xffffffffff31485f]        # 36e087 <_ZTSSt12bad_any_cast@@Base-0x22141>
     1059828:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     105982d:	e8 4c 02 a2 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1059832:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     1059837:	48 89 df             	mov    rdi,rbx

### 0x105c082 from 0x105bad0..0x105c186
     105c04e:	e8 af f1 61 00       	call   167b202 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f36e>
     105c053:	48 8d 35 22 5f 3f ff 	lea    rsi,[rip+0xffffffffff3f5f22]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     105c05a:	48 8d 0d 83 ad 30 ff 	lea    rcx,[rip+0xffffffffff30ad83]        # 366de4 <_ZTSSt12bad_any_cast@@Base-0x293e4>
     105c061:	6a 04                	push   0x4
     105c063:	5f                   	pop    rdi
     105c064:	ba c5 02 00 00       	mov    edx,0x2c5
     105c069:	31 c0                	xor    eax,eax
     105c06b:	e8 62 a8 77 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     105c070:	4c 89 f7             	mov    rdi,r14
     105c073:	e8 b4 32 a7 ff       	call   acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
     105c078:	48 81 c3 00 06 00 00 	add    rbx,0x600
     105c07f:	48 89 df             	mov    rdi,rbx
     105c082:	e8 21 ca ac ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     105c087:	48 89 e7             	mov    rdi,rsp
     105c08a:	e8 01 1e 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105c08f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     105c094:	e8 c7 26 79 00       	call   17ee760 <free@plt>
     105c099:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     105c0a0:	00 
     105c0a1:	e8 5c f1 61 00       	call   167b202 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f36e>
     105c0a6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105c0ad:	00 00 
     105c0af:	48 3b 84 24 40 0e 00 	cmp    rax,QWORD PTR [rsp+0xe40]
     105c0b6:	00 
     105c0b7:	0f 85 c4 00 00 00    	jne    105c181 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223597>
     105c0bd:	48 81 c4 48 0e 00 00 	add    rsp,0xe48

### 0x1060ed4 from 0x1060dba..0x1060f85
     1060e9f:	84 c0                	test   al,al
     1060ea1:	74 2a                	je     1060ecd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2282e3>
     1060ea3:	8a 83 68 14 00 00    	mov    al,BYTE PTR [rbx+0x1468]
     1060ea9:	3a 84 24 28 05 00 00 	cmp    al,BYTE PTR [rsp+0x528]
     1060eb0:	75 1b                	jne    1060ecd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2282e3>
     1060eb2:	8a 83 69 14 00 00    	mov    al,BYTE PTR [rbx+0x1469]
     1060eb8:	3a 84 24 29 05 00 00 	cmp    al,BYTE PTR [rsp+0x529]
     1060ebf:	75 0c                	jne    1060ecd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2282e3>
     1060ec1:	8a 83 70 0f 00 00    	mov    al,BYTE PTR [rbx+0xf70]
     1060ec7:	3a 44 24 30          	cmp    al,BYTE PTR [rsp+0x30]
     1060ecb:	74 63                	je     1060f30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x228346>
     1060ecd:	48 8d bb 10 15 00 00 	lea    rdi,[rbx+0x1510]
     1060ed4:	e8 cf 7b ac ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1060ed9:	48 8d bb 48 0f 00 00 	lea    rdi,[rbx+0xf48]
     1060ee0:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     1060ee5:	e8 da 7f fa ff       	call   1008ec4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d02da>
     1060eea:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     1060ef1:	00 
     1060ef2:	0f 10 46 e0          	movups xmm0,XMMWORD PTR [rsi-0x20]
     1060ef6:	0f 10 4e f0          	movups xmm1,XMMWORD PTR [rsi-0x10]
     1060efa:	0f 11 8b e0 0f 00 00 	movups XMMWORD PTR [rbx+0xfe0],xmm1
     1060f01:	0f 11 83 d0 0f 00 00 	movups XMMWORD PTR [rbx+0xfd0],xmm0
     1060f08:	48 8d bb f0 0f 00 00 	lea    rdi,[rbx+0xff0]
     1060f0f:	e8 ca 4d e0 ff       	call   e65cde <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d0f4>
     1060f14:	8a 84 24 2a 05 00 00 	mov    al,BYTE PTR [rsp+0x52a]
     1060f1b:	88 83 6a 14 00 00    	mov    BYTE PTR [rbx+0x146a],al

### 0x10669f2 from 0x10669da..0x10669f7
     10669ce:	41 5d                	pop    r13
     10669d0:	41 5e                	pop    r14
     10669d2:	41 5f                	pop    r15
     10669d4:	5d                   	pop    rbp
     10669d5:	e9 ac 7a a3 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     10669da:	48 89 f8             	mov    rax,rdi
     10669dd:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10669e0:	48 8b 8f 50 01 00 00 	mov    rcx,QWORD PTR [rdi+0x150]
     10669e7:	48 3b 48 08          	cmp    rcx,QWORD PTR [rax+0x8]
     10669eb:	74 01                	je     10669ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22de04>
     10669ed:	c3                   	ret
     10669ee:	48 83 c7 40          	add    rdi,0x40
     10669f2:	e9 b1 20 ac ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10669f7:	cc                   	int3
     10669f8:	41 57                	push   r15
     10669fa:	41 56                	push   r14
     10669fc:	53                   	push   rbx
     10669fd:	48 83 ec 10          	sub    rsp,0x10
     1066a01:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1066a05:	48 89 fb             	mov    rbx,rdi
     1066a08:	4c 8d 7f 08          	lea    r15,[rdi+0x8]
     1066a0c:	6a 30                	push   0x30
     1066a0e:	5f                   	pop    rdi
     1066a0f:	e8 ec 74 78 00       	call   17edf00 <_Znwm@plt>
     1066a14:	49 89 c6             	mov    r14,rax
     1066a17:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]

### 0x108975b from 0x1089040..0x10898aa
     1089729:	31 ff                	xor    edi,edi
     108972b:	e8 56 4d a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1089730:	48 8d bc 24 c8 07 00 	lea    rdi,[rsp+0x7c8]
     1089737:	00 
     1089738:	e8 b5 ea ad ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     108973d:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     1089742:	e8 f5 ea ad ff       	call   b6823c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb51dc>
     1089747:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     108974e:	00 
     108974f:	e8 18 55 c0 ff       	call   c8ec6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dbc0c>
     1089754:	48 83 c5 68          	add    rbp,0x68
     1089758:	48 89 ef             	mov    rdi,rbp
     108975b:	e8 48 f3 a9 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1089760:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1089767:	00 
     1089768:	e8 d1 01 00 00       	call   108993e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250d54>
     108976d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1089774:	00 00 
     1089776:	48 3b 84 24 20 08 00 	cmp    rax,QWORD PTR [rsp+0x820]
     108977d:	00 
     108977e:	0f 85 21 01 00 00    	jne    10898a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250cbb>
     1089784:	48 81 c4 28 08 00 00 	add    rsp,0x828
     108978b:	5b                   	pop    rbx
     108978c:	41 5c                	pop    r12
     108978e:	41 5d                	pop    r13
     1089790:	41 5e                	pop    r14

### 0x108be5a from 0x108bdb2..0x108be9b
     108be31:	e8 1c 1b d1 ff       	call   d9d952 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a9d8>
     108be36:	4c 89 f7             	mov    rdi,r14
     108be39:	e8 8e 8d 5d 00       	call   1664bcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18d38>
     108be3e:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     108be42:	4d 85 e4             	test   r12,r12
     108be45:	75 b3                	jne    108bdfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253210>
     108be47:	48 89 df             	mov    rdi,rbx
     108be4a:	e8 05 e8 ff ff       	call   108a654 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251a6a>
     108be4f:	84 c0                	test   al,al
     108be51:	74 0c                	je     108be5f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253275>
     108be53:	48 83 c3 68          	add    rbx,0x68
     108be57:	48 89 df             	mov    rdi,rbx
     108be5a:	e8 49 cc a9 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     108be5f:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
     108be64:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     108be6b:	e8 16 26 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     108be70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108be77:	00 00 
     108be79:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     108be7e:	75 0c                	jne    108be8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2532a2>
     108be80:	48 83 c4 68          	add    rsp,0x68
     108be84:	5b                   	pop    rbx
     108be85:	41 5c                	pop    r12
     108be87:	41 5e                	pop    r14
     108be89:	41 5f                	pop    r15
     108be8b:	c3                   	ret

### 0x108ebdd from 0x108eb9a..0x108ebe9
     108ebb6:	74 08                	je     108ebc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255fd6>
     108ebb8:	48 89 df             	mov    rdi,rbx
     108ebbb:	e8 0c ff ff ff       	call   108eacc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255ee2>
     108ebc0:	83 fd 10             	cmp    ebp,0x10
     108ebc3:	72 08                	jb     108ebcd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255fe3>
     108ebc5:	48 89 df             	mov    rdi,rbx
     108ebc8:	e8 cb 00 00 00       	call   108ec98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2560ae>
     108ebcd:	48 81 c3 88 00 00 00 	add    rbx,0x88
     108ebd4:	48 89 df             	mov    rdi,rbx
     108ebd7:	48 83 c4 08          	add    rsp,0x8
     108ebdb:	5b                   	pop    rbx
     108ebdc:	5d                   	pop    rbp
     108ebdd:	e9 c6 9e a9 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     108ebe2:	48 83 c4 08          	add    rsp,0x8
     108ebe6:	5b                   	pop    rbx
     108ebe7:	5d                   	pop    rbp
     108ebe8:	c3                   	ret
     108ebe9:	cc                   	int3
     108ebea:	53                   	push   rbx
     108ebeb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     108ebee:	48 89 df             	mov    rdi,rbx
     108ebf1:	e8 a2 00 00 00       	call   108ec98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2560ae>
     108ebf6:	48 89 df             	mov    rdi,rbx
     108ebf9:	5b                   	pop    rbx
     108ebfa:	e9 6d 10 00 00       	jmp    108fc6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x257082>
     108ebff:	cc                   	int3

### 0x108fcab from 0x108fc6c..0x108fcb0
     108fc86:	48 89 83 58 01 00 00 	mov    QWORD PTR [rbx+0x158],rax
     108fc8d:	4c 39 f0             	cmp    rax,r14
     108fc90:	75 08                	jne    108fc9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2570b0>
     108fc92:	48 83 c4 08          	add    rsp,0x8
     108fc96:	5b                   	pop    rbx
     108fc97:	41 5e                	pop    r14
     108fc99:	c3                   	ret
     108fc9a:	48 81 c3 88 00 00 00 	add    rbx,0x88
     108fca1:	48 89 df             	mov    rdi,rbx
     108fca4:	48 83 c4 08          	add    rsp,0x8
     108fca8:	5b                   	pop    rbx
     108fca9:	41 5e                	pop    r14
     108fcab:	e9 f8 8d a9 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     108fcb0:	55                   	push   rbp
     108fcb1:	41 57                	push   r15
     108fcb3:	41 56                	push   r14
     108fcb5:	41 55                	push   r13
     108fcb7:	41 54                	push   r12
     108fcb9:	53                   	push   rbx
     108fcba:	48 81 ec 68 01 00 00 	sub    rsp,0x168
     108fcc1:	48 89 74 24 18       	mov    QWORD PTR [rsp+0x18],rsi
     108fcc6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108fccd:	00 00 
     108fccf:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     108fcd6:	00 
     108fcd7:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]

### 0x10a157b from 0x10a1440..0x10a1585
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
     10a1585:	cc                   	int3
     10a1586:	53                   	push   rbx
     10a1587:	48 89 fb             	mov    rbx,rdi
     10a158a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10a158d:	e8 c2 00 00 00       	call   10a1654 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268a6a>
     10a1592:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     10a1596:	5b                   	pop    rbx
     10a1597:	e9 ea ce 9f ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a159c:	48 89 c7             	mov    rdi,rax
     10a159f:	e8 01 85 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a15a4:	53                   	push   rbx
     10a15a5:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]

### 0x10a17d7 from 0x10a1740..0x10a1838
     10a17ae:	84 c0                	test   al,al
     10a17b0:	74 2a                	je     10a17dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268bf2>
     10a17b2:	48 8d bb f8 01 00 00 	lea    rdi,[rbx+0x1f8]
     10a17b9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a17be:	6a 01                	push   0x1
     10a17c0:	5a                   	pop    rdx
     10a17c1:	4c 89 f9             	mov    rcx,r15
     10a17c4:	e8 91 64 54 00       	call   15e7c5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42d1de>
     10a17c9:	84 c0                	test   al,al
     10a17cb:	74 0f                	je     10a17dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268bf2>
     10a17cd:	48 81 c3 70 04 00 00 	add    rbx,0x470
     10a17d4:	48 89 df             	mov    rdi,rbx
     10a17d7:	e8 cc 72 a8 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10a17dc:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a17e1:	e8 48 3b 62 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a17e6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     10a17eb:	e8 96 cc 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a17f0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a17f7:	00 00 
     10a17f9:	48 3b 44 24 78       	cmp    rax,QWORD PTR [rsp+0x78]
     10a17fe:	75 0d                	jne    10a180d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268c23>
     10a1800:	48 81 c4 80 00 00 00 	add    rsp,0x80
     10a1807:	5b                   	pop    rbx
     10a1808:	41 5e                	pop    r14
     10a180a:	41 5f                	pop    r15
     10a180c:	c3                   	ret

### 0x10a1f1e from 0x10a1e90..0x10a1f8d
     10a1ef5:	84 c0                	test   al,al
     10a1ef7:	74 2a                	je     10a1f23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269339>
     10a1ef9:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
     10a1f00:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a1f05:	6a 01                	push   0x1
     10a1f07:	5a                   	pop    rdx
     10a1f08:	4c 89 f9             	mov    rcx,r15
     10a1f0b:	e8 4a 5d 54 00       	call   15e7c5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42d1de>
     10a1f10:	84 c0                	test   al,al
     10a1f12:	74 0f                	je     10a1f23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269339>
     10a1f14:	48 81 c3 18 04 00 00 	add    rbx,0x418
     10a1f1b:	48 89 df             	mov    rdi,rbx
     10a1f1e:	e8 85 6b a8 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10a1f23:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a1f28:	e8 01 34 62 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a1f2d:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     10a1f32:	e8 4f c5 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a1f37:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a1f3e:	00 00 
     10a1f40:	48 3b 44 24 78       	cmp    rax,QWORD PTR [rsp+0x78]
     10a1f45:	75 41                	jne    10a1f88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26939e>
     10a1f47:	48 81 c4 80 00 00 00 	add    rsp,0x80
     10a1f4e:	5b                   	pop    rbx
     10a1f4f:	41 5e                	pop    r14
     10a1f51:	41 5f                	pop    r15
     10a1f53:	c3                   	ret

### 0x10a32a6 from 0x10a2dd4..0x10a3405
     10a3274:	48 f7 fd             	idiv   rbp
     10a3277:	48 89 c2             	mov    rdx,rax
     10a327a:	e8 db 49 54 00       	call   15e7c5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42d1de>
     10a327f:	84 c0                	test   al,al
     10a3281:	74 09                	je     10a328c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a6a2>
     10a3283:	c6 83 80 03 00 00 01 	mov    BYTE PTR [rbx+0x380],0x1
     10a328a:	eb 10                	jmp    10a329c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a6b2>
     10a328c:	80 bb 80 03 00 00 00 	cmp    BYTE PTR [rbx+0x380],0x0
     10a3293:	c6 83 80 03 00 00 01 	mov    BYTE PTR [rbx+0x380],0x1
     10a329a:	75 0f                	jne    10a32ab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a6c1>
     10a329c:	48 81 c3 18 04 00 00 	add    rbx,0x418
     10a32a3:	48 89 df             	mov    rdi,rbx
     10a32a6:	e8 fd 57 a8 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10a32ab:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     10a32b2:	00 
     10a32b3:	e8 ce b1 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a32b8:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     10a32bd:	e8 8e ec b8 ff       	call   c31f50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17eef0>
     10a32c2:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     10a32c7:	e8 42 78 a0 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
     10a32cc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10a32d1:	e8 f8 0b 00 00       	call   10a3ece <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b2e4>
     10a32d6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a32dd:	00 00 
     10a32df:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]
     10a32e6:	00 

### 0x10adec3 from 0x10add50..0x10adf46
     10ade9b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10ade9e:	48 89 df             	mov    rdi,rbx
     10adea1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10adea4:	89 c5                	mov    ebp,eax
     10adea6:	48 89 df             	mov    rdi,rbx
     10adea9:	e8 a4 2a 00 00       	call   10b0952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d68>
     10adeae:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10adeb1:	48 89 df             	mov    rdi,rbx
     10adeb4:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10adeb7:	40 38 c5             	cmp    bpl,al
     10adeba:	74 0c                	je     10adec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2752de>
     10adebc:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     10adec3:	e8 e0 ab a7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10adec8:	48 89 df             	mov    rdi,rbx
     10adecb:	e8 b6 2b 00 00       	call   10b0a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277e9c>
     10aded0:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     10aded5:	e8 4e 38 00 00       	call   10b1728 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278b3e>
     10adeda:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10adedf:	e8 ac ff 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10adee4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10adeeb:	00 00 
     10adeed:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     10adef4:	00 
     10adef5:	75 12                	jne    10adf09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27531f>
     10adef7:	48 81 c4 88 00 00 00 	add    rsp,0x88
     10adefe:	5b                   	pop    rbx

### 0x10ae0d0 from 0x10adf46..0x10ae155
     10ae0a3:	e8 28 72 db ff       	call   e652d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6e6>
     10ae0a8:	4c 89 f7             	mov    rdi,r14
     10ae0ab:	e8 74 6e db ff       	call   e64f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c33a>
     10ae0b0:	48 89 df             	mov    rdi,rbx
     10ae0b3:	e8 9a 28 00 00       	call   10b0952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d68>
     10ae0b8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10ae0bb:	48 89 df             	mov    rdi,rbx
     10ae0be:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10ae0c1:	8a 4c 24 0f          	mov    cl,BYTE PTR [rsp+0xf]
     10ae0c5:	38 c1                	cmp    cl,al
     10ae0c7:	74 0c                	je     10ae0d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2754eb>
     10ae0c9:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     10ae0d0:	e8 d3 a9 a7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ae0d5:	48 89 df             	mov    rdi,rbx
     10ae0d8:	e8 67 34 00 00       	call   10b1544 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27895a>
     10ae0dd:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10ae0e2:	e8 95 35 00 00       	call   10b167c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278a92>
     10ae0e7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     10ae0ec:	e8 9f fd 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10ae0f1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ae0f8:	00 00 
     10ae0fa:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
     10ae101:	00 
     10ae102:	75 12                	jne    10ae116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27552c>
     10ae104:	48 81 c4 98 00 00 00 	add    rsp,0x98
     10ae10b:	5b                   	pop    rbx

### 0x10b0744 from 0x10b06fc..0x10b0750
     10b071a:	e8 8d 12 71 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
     10b071f:	84 c0                	test   al,al
     10b0721:	74 0c                	je     10b072f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b45>
     10b0723:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
     10b072a:	e8 09 12 71 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     10b072f:	40 84 ed             	test   bpl,bpl
     10b0732:	74 15                	je     10b0749 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b5f>
     10b0734:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
     10b073b:	48 89 df             	mov    rdi,rbx
     10b073e:	48 83 c4 08          	add    rsp,0x8
     10b0742:	5b                   	pop    rbx
     10b0743:	5d                   	pop    rbp
     10b0744:	e9 5f 83 a7 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10b0749:	48 83 c4 08          	add    rsp,0x8
     10b074d:	5b                   	pop    rbx
     10b074e:	5d                   	pop    rbp
     10b074f:	c3                   	ret
     10b0750:	55                   	push   rbp
     10b0751:	41 57                	push   r15
     10b0753:	41 56                	push   r14
     10b0755:	41 55                	push   r13
     10b0757:	41 54                	push   r12
     10b0759:	53                   	push   rbx
     10b075a:	48 83 ec 78          	sub    rsp,0x78
     10b075e:	49 89 fe             	mov    r14,rdi
     10b0761:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x10b08f1 from 0x10b0750..0x10b0952
     10b08c9:	e8 5a 0e 00 00       	call   10b1728 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278b3e>
     10b08ce:	4c 89 f7             	mov    rdi,r14
     10b08d1:	e8 b0 01 00 00       	call   10b0a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277e9c>
     10b08d6:	84 db                	test   bl,bl
     10b08d8:	75 1c                	jne    10b08f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d0c>
     10b08da:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10b08dd:	4c 89 f7             	mov    rdi,r14
     10b08e0:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10b08e3:	84 c0                	test   al,al
     10b08e5:	74 0f                	je     10b08f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d0c>
     10b08e7:	49 81 c6 a0 00 00 00 	add    r14,0xa0
     10b08ee:	4c 89 f7             	mov    rdi,r14
     10b08f1:	e8 b2 81 a7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10b08f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10b08fd:	00 00 
     10b08ff:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     10b0904:	75 47                	jne    10b094d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d63>
     10b0906:	48 83 c4 78          	add    rsp,0x78
     10b090a:	5b                   	pop    rbx
     10b090b:	41 5c                	pop    r12
     10b090d:	41 5d                	pop    r13
     10b090f:	41 5e                	pop    r14
     10b0911:	41 5f                	pop    r15
     10b0913:	5d                   	pop    rbp
     10b0914:	c3                   	ret
     10b0915:	48 89 c3             	mov    rbx,rax

### 0x10b0ba3 from 0x10b0b78..0x10b0bbe
     10b0b7b:	48 89 fb             	mov    rbx,rdi
     10b0b7e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10b0b81:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10b0b84:	89 c5                	mov    ebp,eax
     10b0b86:	48 89 df             	mov    rdi,rbx
     10b0b89:	e8 c4 fd ff ff       	call   10b0952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d68>
     10b0b8e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10b0b91:	48 89 df             	mov    rdi,rbx
     10b0b94:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10b0b97:	40 38 c5             	cmp    bpl,al
     10b0b9a:	74 0c                	je     10b0ba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277fbe>
     10b0b9c:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     10b0ba3:	e8 00 7f a7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10b0ba8:	48 89 df             	mov    rdi,rbx
     10b0bab:	48 83 c4 08          	add    rsp,0x8
     10b0baf:	5b                   	pop    rbx
     10b0bb0:	5d                   	pop    rbp
     10b0bb1:	e9 d0 fe ff ff       	jmp    10b0a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277e9c>
     10b0bb6:	48 89 c7             	mov    rdi,rax
     10b0bb9:	e8 e7 8e 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10b0bbe:	53                   	push   rbx
     10b0bbf:	48 89 d3             	mov    rbx,rdx
     10b0bc2:	48 89 f7             	mov    rdi,rsi
     10b0bc5:	e8 06 00 00 00       	call   10b0bd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277fe6>
     10b0bca:	48 89 03             	mov    QWORD PTR [rbx],rax
     10b0bcd:	5b                   	pop    rbx

### 0x10b131b from 0x10b127e..0x10b133c
     10b12f4:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10b12f7:	84 c0                	test   al,al
     10b12f9:	74 25                	je     10b1320 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278736>
     10b12fb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10b1302:	00 00 
     10b1304:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     10b1309:	75 2c                	jne    10b1337 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27874d>
     10b130b:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
     10b1312:	48 89 df             	mov    rdi,rbx
     10b1315:	48 83 c4 18          	add    rsp,0x18
     10b1319:	5b                   	pop    rbx
     10b131a:	5d                   	pop    rbp
     10b131b:	e9 88 77 a7 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10b1320:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10b1327:	00 00 
     10b1329:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     10b132e:	75 07                	jne    10b1337 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27874d>
     10b1330:	48 83 c4 18          	add    rsp,0x18
     10b1334:	5b                   	pop    rbx
     10b1335:	5d                   	pop    rbp
     10b1336:	c3                   	ret
     10b1337:	e8 74 e7 73 00       	call   17efab0 <__stack_chk_fail@plt>
     10b133c:	53                   	push   rbx
     10b133d:	40 38 b7 99 00 00 00 	cmp    BYTE PTR [rdi+0x99],sil
     10b1344:	74 0f                	je     10b1355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27876b>
     10b1346:	48 89 fb             	mov    rbx,rdi

### 0x10b1661 from 0x10b1636..0x10b167c
     10b1639:	48 89 fb             	mov    rbx,rdi
     10b163c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10b163f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10b1642:	89 c5                	mov    ebp,eax
     10b1644:	48 89 df             	mov    rdi,rbx
     10b1647:	e8 06 f3 ff ff       	call   10b0952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d68>
     10b164c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10b164f:	48 89 df             	mov    rdi,rbx
     10b1652:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10b1655:	40 38 c5             	cmp    bpl,al
     10b1658:	74 0c                	je     10b1666 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278a7c>
     10b165a:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     10b1661:	e8 42 74 a7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10b1666:	48 89 df             	mov    rdi,rbx
     10b1669:	48 83 c4 08          	add    rsp,0x8
     10b166d:	5b                   	pop    rbx
     10b166e:	5d                   	pop    rbp
     10b166f:	e9 d0 fe ff ff       	jmp    10b1544 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27895a>
     10b1674:	48 89 c7             	mov    rdi,rax
     10b1677:	e8 29 84 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10b167c:	53                   	push   rbx
     10b167d:	48 89 fb             	mov    rbx,rdi
     10b1680:	48 83 c7 08          	add    rdi,0x8
     10b1684:	e8 7f 93 9f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     10b1689:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0
     10b168e:	74 0c                	je     10b169c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278ab2>

### 0x10ba67d from 0x10ba5d0..0x10ba735
     10ba649:	4c 89 f7             	mov    rdi,r14
     10ba64c:	e8 f1 99 a7 ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
     10ba651:	84 c0                	test   al,al
     10ba653:	74 4c                	je     10ba6a1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ab7>
     10ba655:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10ba65a:	e8 31 38 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10ba65f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10ba664:	e8 27 38 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10ba669:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     10ba66e:	e8 1d 38 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10ba673:	48 81 c3 c8 00 00 00 	add    rbx,0xc8
     10ba67a:	48 89 df             	mov    rdi,rbx
     10ba67d:	e8 26 e4 a6 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ba682:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ba689:	00 00 
     10ba68b:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     10ba690:	0f 85 9a 00 00 00    	jne    10ba730 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b46>
     10ba696:	48 83 c4 68          	add    rsp,0x68
     10ba69a:	5b                   	pop    rbx
     10ba69b:	41 5e                	pop    r14
     10ba69d:	41 5f                	pop    r15
     10ba69f:	5d                   	pop    rbp
     10ba6a0:	c3                   	ret
     10ba6a1:	48 8d 35 60 db 92 00 	lea    rsi,[rip+0x92db60]        # 19e8208 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27f8>
     10ba6a8:	48 89 e7             	mov    rdi,rsp
     10ba6ab:	e8 fa 76 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>

### 0x10ba741 from 0x10ba736..0x10ba746
     10ba713:	e8 78 37 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10ba718:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ba71f:	00 00 
     10ba721:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     10ba726:	75 08                	jne    10ba730 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b46>
     10ba728:	48 89 df             	mov    rdi,rbx
     10ba72b:	e8 a0 55 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10ba730:	e8 7b 53 73 00       	call   17efab0 <__stack_chk_fail@plt>
     10ba735:	cc                   	int3
     10ba736:	b8 c8 00 00 00       	mov    eax,0xc8
     10ba73b:	48 03 07             	add    rax,QWORD PTR [rdi]
     10ba73e:	48 89 c7             	mov    rdi,rax
     10ba741:	e9 62 e3 a6 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ba746:	b8 20 01 00 00       	mov    eax,0x120
     10ba74b:	48 03 07             	add    rax,QWORD PTR [rdi]
     10ba74e:	48 89 c7             	mov    rdi,rax
     10ba751:	e9 52 e3 a6 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ba756:	41 57                	push   r15
     10ba758:	41 56                	push   r14
     10ba75a:	53                   	push   rbx
     10ba75b:	48 89 fb             	mov    rbx,rdi
     10ba75e:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
     10ba762:	4d 85 f6             	test   r14,r14
     10ba765:	74 1c                	je     10ba783 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b99>
     10ba767:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
     10ba76a:	49 8d 7e 18          	lea    rdi,[r14+0x18]

### 0x10ba751 from 0x10ba746..0x10ba756
     10ba726:	75 08                	jne    10ba730 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b46>
     10ba728:	48 89 df             	mov    rdi,rbx
     10ba72b:	e8 a0 55 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10ba730:	e8 7b 53 73 00       	call   17efab0 <__stack_chk_fail@plt>
     10ba735:	cc                   	int3
     10ba736:	b8 c8 00 00 00       	mov    eax,0xc8
     10ba73b:	48 03 07             	add    rax,QWORD PTR [rdi]
     10ba73e:	48 89 c7             	mov    rdi,rax
     10ba741:	e9 62 e3 a6 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ba746:	b8 20 01 00 00       	mov    eax,0x120
     10ba74b:	48 03 07             	add    rax,QWORD PTR [rdi]
     10ba74e:	48 89 c7             	mov    rdi,rax
     10ba751:	e9 52 e3 a6 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ba756:	41 57                	push   r15
     10ba758:	41 56                	push   r14
     10ba75a:	53                   	push   rbx
     10ba75b:	48 89 fb             	mov    rbx,rdi
     10ba75e:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
     10ba762:	4d 85 f6             	test   r14,r14
     10ba765:	74 1c                	je     10ba783 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b99>
     10ba767:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
     10ba76a:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     10ba76e:	e8 2d 00 00 00       	call   10ba7a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281bb6>
     10ba773:	4c 89 f7             	mov    rdi,r14
     10ba776:	e8 a5 37 73 00       	call   17edf20 <_ZdlPv@plt>
     10ba77b:	4d 89 fe             	mov    r14,r15

### 0x10baf90 from 0x10baf5c..0x10baf95
     10baf6d:	48 85 ff             	test   rdi,rdi
     10baf70:	74 13                	je     10baf85 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28239b>
     10baf72:	83 e6 fe             	and    esi,0xfffffffe
     10baf75:	31 c0                	xor    eax,eax
     10baf77:	83 fe 02             	cmp    esi,0x2
     10baf7a:	0f 94 c0             	sete   al
     10baf7d:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     10baf80:	89 c6                	mov    esi,eax
     10baf82:	ff 51 30             	call   QWORD PTR [rcx+0x30]
     10baf85:	48 81 c3 20 01 00 00 	add    rbx,0x120
     10baf8c:	48 89 df             	mov    rdi,rbx
     10baf8f:	5b                   	pop    rbx
     10baf90:	e9 13 db a6 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10baf95:	cc                   	int3
     10baf96:	41 57                	push   r15
     10baf98:	41 56                	push   r14
     10baf9a:	53                   	push   rbx
     10baf9b:	48 83 ec 50          	sub    rsp,0x50
     10baf9f:	49 89 f6             	mov    r14,rsi
     10bafa2:	48 89 fb             	mov    rbx,rdi
     10bafa5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10bafac:	00 00 
     10bafae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10bafb3:	49 81 c6 20 01 00 00 	add    r14,0x120
     10bafba:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     10bafbf:	4c 89 ff             	mov    rdi,r15

### 0x10ddf9b from 0x10ddf44..0x10ddfbe
     10ddf73:	48 8d 3d c6 a5 2f ff 	lea    rdi,[rip+0xffffffffff2fa5c6]        # 3d8540 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3125>
     10ddf7a:	6a 1c                	push   0x1c
     10ddf7c:	5e                   	pop    rsi
     10ddf7d:	48 89 c2             	mov    rdx,rax
     10ddf80:	e8 fb d8 99 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
     10ddf85:	89 c5                	mov    ebp,eax
     10ddf87:	4c 89 f7             	mov    rdi,r14
     10ddf8a:	e8 01 ff 70 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10ddf8f:	40 84 ed             	test   bpl,bpl
     10ddf92:	74 0c                	je     10ddfa0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a53b6>
     10ddf94:	48 83 c3 18          	add    rbx,0x18
     10ddf98:	48 89 df             	mov    rdi,rbx
     10ddf9b:	e8 08 ab a4 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ddfa0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ddfa7:	00 00 
     10ddfa9:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     10ddfae:	75 09                	jne    10ddfb9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a53cf>
     10ddfb0:	48 83 c4 20          	add    rsp,0x20
     10ddfb4:	5b                   	pop    rbx
     10ddfb5:	41 5e                	pop    r14
     10ddfb7:	5d                   	pop    rbp
     10ddfb8:	c3                   	ret
     10ddfb9:	e8 f2 1a 71 00       	call   17efab0 <__stack_chk_fail@plt>
     10ddfbe:	55                   	push   rbp
     10ddfbf:	41 57                	push   r15
     10ddfc1:	41 56                	push   r14

### 0x10e539e from 0x10e5338..0x10e53f9
     10e536d:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     10e5370:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     10e5374:	0f 29 0c 24          	movaps XMMWORD PTR [rsp],xmm1
     10e5378:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     10e537e:	e8 1f 46 00 00       	call   10e99a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b0db8>
     10e5383:	89 c5                	mov    ebp,eax
     10e5385:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10e538a:	e8 51 5d ff ff       	call   10db0e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a24f6>
     10e538f:	40 84 ed             	test   bpl,bpl
     10e5392:	74 0f                	je     10e53a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ac7b9>
     10e5394:	48 81 c3 c8 06 00 00 	add    rbx,0x6c8
     10e539b:	48 89 df             	mov    rdi,rbx
     10e539e:	e8 05 37 a4 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10e53a3:	48 89 e7             	mov    rdi,rsp
     10e53a6:	e8 35 5d ff ff       	call   10db0e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a24f6>
     10e53ab:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10e53b2:	00 00 
     10e53b4:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     10e53b9:	75 39                	jne    10e53f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ac80a>
     10e53bb:	48 83 c4 48          	add    rsp,0x48
     10e53bf:	5b                   	pop    rbx
     10e53c0:	5d                   	pop    rbp
     10e53c1:	c3                   	ret
     10e53c2:	48 89 c3             	mov    rbx,rax
     10e53c5:	eb 0d                	jmp    10e53d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ac7ea>
     10e53c7:	48 89 c3             	mov    rbx,rax

### 0x10ee5da from 0x10ee3a4..0x10eea9c
     10ee5a4:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     10ee5a9:	e8 32 cb fe ff       	call   10db0e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a24f6>
     10ee5ae:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
     10ee5b5:	00 
     10ee5b6:	e8 c5 73 fe ff       	call   10d5980 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29cd96>
     10ee5bb:	41 8b 85 b8 00 00 00 	mov    eax,DWORD PTR [r13+0xb8]
     10ee5c2:	41 3b 85 bc 00 00 00 	cmp    eax,DWORD PTR [r13+0xbc]
     10ee5c9:	7c 14                	jl     10ee5df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b59f5>
     10ee5cb:	41 83 a5 b8 00 00 00 	and    DWORD PTR [r13+0xb8],0x0
     10ee5d2:	00 
     10ee5d3:	49 83 c5 60          	add    r13,0x60
     10ee5d7:	4c 89 ef             	mov    rdi,r13
     10ee5da:	e8 c9 a4 a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ee5df:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     10ee5e6:	00 
     10ee5e7:	e8 98 d2 ff ff       	call   10eb884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b2c9a>
     10ee5ec:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     10ee5f3:	00 
     10ee5f4:	e8 73 a0 17 00       	call   126866c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadbf0>
     10ee5f9:	48 8d bc 24 08 02 00 	lea    rdi,[rsp+0x208]
     10ee600:	00 
     10ee601:	e8 28 6d 5d 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10ee606:	e9 5f 03 00 00       	jmp    10ee96a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5d80>
     10ee60b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     10ee60e:	48 8d 35 a4 d4 23 ff 	lea    rsi,[rip+0xffffffffff23d4a4]        # 32bab9 <_ZTSSt12bad_any_cast@@Base-0x6470f>
     10ee615:	e8 58 41 a0 ff       	call   af2772 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f712>

### 0x10ee965 from 0x10ee3a4..0x10eea9c
     10ee92e:	e8 17 9f 17 00       	call   126884a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaddce>
     10ee933:	48 83 c3 18          	add    rbx,0x18
     10ee937:	48 3b 5c 24 18       	cmp    rbx,QWORD PTR [rsp+0x18]
     10ee93c:	0f 85 3e fd ff ff    	jne    10ee680 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5a96>
     10ee942:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
     10ee946:	41 8b 85 b8 00 00 00 	mov    eax,DWORD PTR [r13+0xb8]
     10ee94d:	41 3b 85 bc 00 00 00 	cmp    eax,DWORD PTR [r13+0xbc]
     10ee954:	7c 14                	jl     10ee96a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5d80>
     10ee956:	41 83 a5 b8 00 00 00 	and    DWORD PTR [r13+0xb8],0x0
     10ee95d:	00 
     10ee95e:	49 83 c5 60          	add    r13,0x60
     10ee962:	4c 89 ef             	mov    rdi,r13
     10ee965:	e8 3e a1 a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ee96a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ee971:	00 00 
     10ee973:	48 3b 84 24 60 02 00 	cmp    rax,QWORD PTR [rsp+0x260]
     10ee97a:	00 
     10ee97b:	0f 85 16 01 00 00    	jne    10eea97 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5ead>
     10ee981:	48 81 c4 68 02 00 00 	add    rsp,0x268
     10ee988:	5b                   	pop    rbx
     10ee989:	41 5c                	pop    r12
     10ee98b:	41 5d                	pop    r13
     10ee98d:	41 5e                	pop    r14
     10ee98f:	41 5f                	pop    r15
     10ee991:	5d                   	pop    rbp
     10ee992:	c3                   	ret

### 0x10ef140 from 0x10ef096..0x10ef1aa
     10ef111:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     10ef115:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     10ef11a:	4c 89 e7             	mov    rdi,r12
     10ef11d:	4c 89 fe             	mov    rsi,r15
     10ef120:	89 d9                	mov    ecx,ebx
     10ef122:	ff 50 20             	call   QWORD PTR [rax+0x20]
     10ef125:	4c 89 ef             	mov    rdi,r13
     10ef128:	e8 53 68 fe ff       	call   10d5980 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29cd96>
     10ef12d:	49 8d be a0 00 00 00 	lea    rdi,[r14+0xa0]
     10ef134:	4c 89 fe             	mov    rsi,r15
     10ef137:	e8 24 cb c3 ff       	call   d2bc60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x278c00>
     10ef13c:	49 8d 7e 48          	lea    rdi,[r14+0x48]
     10ef140:	e8 63 99 a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ef145:	31 d2                	xor    edx,edx
     10ef147:	85 db                	test   ebx,ebx
     10ef149:	0f 94 c2             	sete   dl
     10ef14c:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     10ef150:	41 0f b6 76 31       	movzx  esi,BYTE PTR [r14+0x31]
     10ef155:	e8 7c 0b 00 00       	call   10efcd6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b70ec>
     10ef15a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ef161:	00 00 
     10ef163:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     10ef16a:	00 
     10ef16b:	75 38                	jne    10ef1a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b65bb>
     10ef16d:	48 81 c4 88 00 00 00 	add    rsp,0x88
     10ef174:	5b                   	pop    rbx

### 0x10ef267 from 0x10ef1b8..0x10ef2d9
     10ef237:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     10ef23c:	4c 89 e6             	mov    rsi,r12
     10ef23f:	ff 50 40             	call   QWORD PTR [rax+0x40]
     10ef242:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     10ef246:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10ef249:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     10ef24e:	4c 89 e6             	mov    rsi,r12
     10ef251:	ff 50 38             	call   QWORD PTR [rax+0x38]
     10ef254:	49 8d be a0 00 00 00 	lea    rdi,[r14+0xa0]
     10ef25b:	4c 89 e6             	mov    rsi,r12
     10ef25e:	e8 fd c9 c3 ff       	call   d2bc60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x278c00>
     10ef263:	49 8d 7e 48          	lea    rdi,[r14+0x48]
     10ef267:	e8 3c 98 a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ef26c:	31 d2                	xor    edx,edx
     10ef26e:	85 db                	test   ebx,ebx
     10ef270:	0f 94 c2             	sete   dl
     10ef273:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     10ef277:	41 0f b6 76 31       	movzx  esi,BYTE PTR [r14+0x31]
     10ef27c:	e8 55 0a 00 00       	call   10efcd6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b70ec>
     10ef281:	4c 89 ff             	mov    rdi,r15
     10ef284:	e8 f7 66 fe ff       	call   10d5980 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29cd96>
     10ef289:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ef290:	00 00 
     10ef292:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     10ef299:	00 
     10ef29a:	75 38                	jne    10ef2d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b66ea>

### 0x10ef456 from 0x10ef452..0x10ef45b
     10ef431:	cc                   	int3
     10ef432:	80 7f 31 00          	cmp    BYTE PTR [rdi+0x31],0x0
     10ef436:	40 88 77 31          	mov    BYTE PTR [rdi+0x31],sil
     10ef43a:	75 09                	jne    10ef445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b685b>
     10ef43c:	40 84 f6             	test   sil,sil
     10ef43f:	0f 85 15 01 00 00    	jne    10ef55a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6970>
     10ef445:	c3                   	ret
     10ef446:	e9 0f 01 00 00       	jmp    10ef55a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6970>
     10ef44b:	cc                   	int3
     10ef44c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10ef44f:	ff 60 60             	jmp    QWORD PTR [rax+0x60]
     10ef452:	48 83 c7 48          	add    rdi,0x48
     10ef456:	e9 4d 96 a3 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ef45b:	cc                   	int3
     10ef45c:	53                   	push   rbx
     10ef45d:	48 83 ec 30          	sub    rsp,0x30
     10ef461:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ef468:	00 00 
     10ef46a:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     10ef46f:	80 7f 31 00          	cmp    BYTE PTR [rdi+0x31],0x0
     10ef473:	74 35                	je     10ef4aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b68c0>
     10ef475:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     10ef479:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     10ef47e:	48 89 3e             	mov    QWORD PTR [rsi],rdi
     10ef481:	48 8d 0d dc cf 98 ff 	lea    rcx,[rip+0xffffffffff98cfdc]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     10ef488:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx

### 0x10ef54a from 0x10ef546..0x10ef54f
     10ef525:	cc                   	int3
     10ef526:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10ef52a:	e9 03 ff ff ff       	jmp    10ef432 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6848>
     10ef52f:	cc                   	int3
     10ef530:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10ef534:	e9 21 00 00 00       	jmp    10ef55a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6970>
     10ef539:	cc                   	int3
     10ef53a:	48 8b 47 f8          	mov    rax,QWORD PTR [rdi-0x8]
     10ef53e:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10ef542:	ff 60 60             	jmp    QWORD PTR [rax+0x60]
     10ef545:	cc                   	int3
     10ef546:	48 83 c7 40          	add    rdi,0x40
     10ef54a:	e9 59 95 a3 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ef54f:	cc                   	int3
     10ef550:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10ef554:	e9 03 ff ff ff       	jmp    10ef45c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6872>
     10ef559:	cc                   	int3
     10ef55a:	53                   	push   rbx
     10ef55b:	48 83 ec 30          	sub    rsp,0x30
     10ef55f:	48 89 fb             	mov    rbx,rdi
     10ef562:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ef569:	00 00 
     10ef56b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     10ef570:	80 7f 31 00          	cmp    BYTE PTR [rdi+0x31],0x0
     10ef574:	74 5d                	je     10ef5d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b69e9>
     10ef576:	80 7b 34 00          	cmp    BYTE PTR [rbx+0x34],0x0

### 0x10ef7a1 from 0x10ef778..0x10ef7b0
     10ef779:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     10ef77c:	80 7b 34 00          	cmp    BYTE PTR [rbx+0x34],0x0
     10ef780:	75 18                	jne    10ef79a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6bb0>
     10ef782:	48 8b bb 08 01 00 00 	mov    rdi,QWORD PTR [rbx+0x108]
     10ef789:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10ef78c:	ff 50 38             	call   QWORD PTR [rax+0x38]
     10ef78f:	6a 01                	push   0x1
     10ef791:	5e                   	pop    rsi
     10ef792:	48 89 df             	mov    rdi,rbx
     10ef795:	e8 82 fe ff ff       	call   10ef61c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6a32>
     10ef79a:	48 83 c3 48          	add    rbx,0x48
     10ef79e:	48 89 df             	mov    rdi,rbx
     10ef7a1:	e8 02 93 a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10ef7a6:	5b                   	pop    rbx
     10ef7a7:	c3                   	ret
     10ef7a8:	48 89 c7             	mov    rdi,rax
     10ef7ab:	e8 f5 a2 98 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10ef7b0:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10ef7b3:	e9 00 00 00 00       	jmp    10ef7b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6bce>
     10ef7b8:	55                   	push   rbp
     10ef7b9:	41 57                	push   r15
     10ef7bb:	41 56                	push   r14
     10ef7bd:	41 55                	push   r13
     10ef7bf:	41 54                	push   r12
     10ef7c1:	53                   	push   rbx
     10ef7c2:	48 81 ec 58 01 00 00 	sub    rsp,0x158

### 0x10efbf2 from 0x10efbea..0x10efc01
     10efbcd:	e8 36 ae 9b ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     10efbd2:	eb 03                	jmp    10efbd7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6fed>
     10efbd4:	48 89 c3             	mov    rbx,rax
     10efbd7:	48 89 df             	mov    rdi,rbx
     10efbda:	e8 c6 9e 98 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10efbdf:	eb 00                	jmp    10efbe1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b6ff7>
     10efbe1:	48 89 c7             	mov    rdi,rax
     10efbe4:	e8 bc 9e 98 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10efbe9:	cc                   	int3
     10efbea:	50                   	push   rax
     10efbeb:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10efbee:	48 83 c7 48          	add    rdi,0x48
     10efbf2:	e8 b1 8e a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10efbf7:	58                   	pop    rax
     10efbf8:	c3                   	ret
     10efbf9:	48 89 c7             	mov    rdi,rax
     10efbfc:	e8 a4 9e 98 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10efc01:	cc                   	int3
     10efc02:	41 57                	push   r15
     10efc04:	41 56                	push   r14
     10efc06:	53                   	push   rbx
     10efc07:	48 83 ec 20          	sub    rsp,0x20
     10efc0b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10efc12:	00 00 
     10efc14:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     10efc19:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]

### 0x10efc48 from 0x10efc02..0x10efcd6
     10efc19:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     10efc1c:	80 7b 30 00          	cmp    BYTE PTR [rbx+0x30],0x0
     10efc20:	0f 84 87 00 00 00    	je     10efcad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b70c3>
     10efc26:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     10efc2a:	4c 8b b3 08 01 00 00 	mov    r14,QWORD PTR [rbx+0x108]
     10efc31:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10efc34:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10efc37:	48 8b 70 18          	mov    rsi,QWORD PTR [rax+0x18]
     10efc3b:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10efc3e:	4c 89 f7             	mov    rdi,r14
     10efc41:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10efc44:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     10efc48:	e8 5b 8e a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10efc4d:	c6 43 32 01          	mov    BYTE PTR [rbx+0x32],0x1
     10efc51:	80 7b 33 00          	cmp    BYTE PTR [rbx+0x33],0x0
     10efc55:	74 0e                	je     10efc65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b707b>
     10efc57:	c6 43 33 00          	mov    BYTE PTR [rbx+0x33],0x0
     10efc5b:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     10efc5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10efc62:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10efc65:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
     10efc69:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     10efc6c:	48 89 e7             	mov    rdi,rsp
     10efc6f:	ff 50 48             	call   QWORD PTR [rax+0x48]
     10efc72:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     10efc76:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]

### 0x10f093b from 0x10f0144..0x10f0a5b
     10f090e:	00 
     10f090f:	49 8d 7e 40          	lea    rdi,[r14+0x40]
     10f0913:	4c 8d 44 24 60       	lea    r8,[rsp+0x60]
     10f0918:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     10f091d:	4c 89 fa             	mov    rdx,r15
     10f0920:	89 e9                	mov    ecx,ebp
     10f0922:	e8 35 0a 00 00       	call   10f135c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b8772>
     10f0927:	41 80 bf 80 00 00 00 	cmp    BYTE PTR [r15+0x80],0x0
     10f092e:	00 
     10f092f:	75 0f                	jne    10f0940 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b7d56>
     10f0931:	49 81 c6 98 00 00 00 	add    r14,0x98
     10f0938:	4c 89 f7             	mov    rdi,r14
     10f093b:	e8 68 81 a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10f0940:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10f0947:	00 00 
     10f0949:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]
     10f0950:	00 
     10f0951:	0f 85 ff 00 00 00    	jne    10f0a56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b7e6c>
     10f0957:	4c 89 e8             	mov    rax,r13
     10f095a:	48 81 c4 98 01 00 00 	add    rsp,0x198
     10f0961:	5b                   	pop    rbx
     10f0962:	41 5c                	pop    r12
     10f0964:	41 5d                	pop    r13
     10f0966:	41 5e                	pop    r14
     10f0968:	41 5f                	pop    r15
     10f096a:	5d                   	pop    rbp

### 0x10f0b25 from 0x10f0a5c..0x10f0b6f
     10f0afb:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     10f0b00:	41 88 00             	mov    BYTE PTR [r8],al
     10f0b03:	41 88 40 08          	mov    BYTE PTR [r8+0x8],al
     10f0b07:	6a 03                	push   0x3
     10f0b09:	59                   	pop    rcx
     10f0b0a:	4c 89 f7             	mov    rdi,r14
     10f0b0d:	48 89 de             	mov    rsi,rbx
     10f0b10:	4c 89 fa             	mov    rdx,r15
     10f0b13:	eb 31                	jmp    10f0b46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b7f5c>
     10f0b15:	31 ed                	xor    ebp,ebp
     10f0b17:	41 88 af 80 00 00 00 	mov    BYTE PTR [r15+0x80],bpl
     10f0b1e:	49 8d be 98 00 00 00 	lea    rdi,[r14+0x98]
     10f0b25:	e8 7e 7f a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10f0b2a:	49 83 c6 40          	add    r14,0x40
     10f0b2e:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     10f0b33:	41 88 28             	mov    BYTE PTR [r8],bpl
     10f0b36:	41 88 68 08          	mov    BYTE PTR [r8+0x8],bpl
     10f0b3a:	4c 89 f7             	mov    rdi,r14
     10f0b3d:	48 89 de             	mov    rsi,rbx
     10f0b40:	4c 89 fa             	mov    rdx,r15
     10f0b43:	44 89 e1             	mov    ecx,r12d
     10f0b46:	e8 11 08 00 00       	call   10f135c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b8772>
     10f0b4b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10f0b52:	00 00 
     10f0b54:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     10f0b59:	75 0f                	jne    10f0b6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b7f80>

### 0x10f0c71 from 0x10f0b70..0x10f0c9a
     10f0c43:	74 31                	je     10f0c76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b808c>
     10f0c45:	41 c6 84 24 e8 00 00 	mov    BYTE PTR [r12+0xe8],0x0
     10f0c4c:	00 00 
     10f0c4e:	49 8d 7e 40          	lea    rdi,[r14+0x40]
     10f0c52:	6a 05                	push   0x5
     10f0c54:	59                   	pop    rcx
     10f0c55:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     10f0c5a:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     10f0c5f:	4c 89 fa             	mov    rdx,r15
     10f0c62:	e8 f5 06 00 00       	call   10f135c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b8772>
     10f0c67:	49 81 c6 98 00 00 00 	add    r14,0x98
     10f0c6e:	4c 89 f7             	mov    rdi,r14
     10f0c71:	e8 32 7e a3 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10f0c76:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10f0c7d:	00 00 
     10f0c7f:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     10f0c84:	75 0f                	jne    10f0c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b80ab>
     10f0c86:	48 83 c4 28          	add    rsp,0x28
     10f0c8a:	5b                   	pop    rbx
     10f0c8b:	41 5c                	pop    r12
     10f0c8d:	41 5d                	pop    r13
     10f0c8f:	41 5e                	pop    r14
     10f0c91:	41 5f                	pop    r15
     10f0c93:	5d                   	pop    rbp
     10f0c94:	c3                   	ret
     10f0c95:	e8 16 ee 6f 00       	call   17efab0 <__stack_chk_fail@plt>

### 0x10f0d23 from 0x10f0c9a..0x10f0d28
     10f0cfe:	41 c6 45 70 01       	mov    BYTE PTR [r13+0x70],0x1
     10f0d03:	41 c6 87 e8 00 00 00 	mov    BYTE PTR [r15+0xe8],0x0
     10f0d0a:	00 
     10f0d0b:	48 81 c3 98 00 00 00 	add    rbx,0x98
     10f0d12:	48 89 df             	mov    rdi,rbx
     10f0d15:	48 83 c4 08          	add    rsp,0x8
     10f0d19:	5b                   	pop    rbx
     10f0d1a:	41 5c                	pop    r12
     10f0d1c:	41 5d                	pop    r13
     10f0d1e:	41 5e                	pop    r14
     10f0d20:	41 5f                	pop    r15
     10f0d22:	5d                   	pop    rbp
     10f0d23:	e9 80 7d a3 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     10f0d28:	50                   	push   rax
     10f0d29:	48 83 c7 08          	add    rdi,0x8
     10f0d2d:	e8 bc 56 b3 ff       	call   c263ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17338e>
     10f0d32:	48 85 c0             	test   rax,rax
     10f0d35:	74 07                	je     10f0d3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b8154>
     10f0d37:	c6 80 e8 00 00 00 01 	mov    BYTE PTR [rax+0xe8],0x1
     10f0d3e:	58                   	pop    rax
     10f0d3f:	c3                   	ret
     10f0d40:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
     10f0d44:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     10f0d47:	75 04                	jne    10f0d4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b8163>
     10f0d49:	c6 47 38 01          	mov    BYTE PTR [rdi+0x38],0x1
     10f0d4d:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax

### 0x1149b18 from 0x1149a92..0x1149b28
     1149af7:	4c 89 ff             	mov    rdi,r15
     1149afa:	4c 89 f6             	mov    rsi,r14
     1149afd:	e8 7e 45 6a 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1149b02:	40 84 ed             	test   bpl,bpl
     1149b05:	74 16                	je     1149b1d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x310f33>
     1149b07:	48 83 c3 48          	add    rbx,0x48
     1149b0b:	48 89 df             	mov    rdi,rbx
     1149b0e:	48 83 c4 08          	add    rsp,0x8
     1149b12:	5b                   	pop    rbx
     1149b13:	41 5e                	pop    r14
     1149b15:	41 5f                	pop    r15
     1149b17:	5d                   	pop    rbp
     1149b18:	e9 8b ef 9d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1149b1d:	48 83 c4 08          	add    rsp,0x8
     1149b21:	5b                   	pop    rbx
     1149b22:	41 5e                	pop    r14
     1149b24:	41 5f                	pop    r15
     1149b26:	5d                   	pop    rbp
     1149b27:	c3                   	ret
     1149b28:	53                   	push   rbx
     1149b29:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1149b2c:	48 89 37             	mov    QWORD PTR [rdi],rsi
     1149b2f:	48 85 db             	test   rbx,rbx
     1149b32:	74 12                	je     1149b46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x310f5c>
     1149b34:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     1149b38:	e8 ad 00 00 00       	call   1149bea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x311000>

### 0x1175f9d from 0x1175f60..0x1175fe2
     1175f74:	00 00 
     1175f76:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1175f7b:	48 8d 44 24 0f       	lea    rax,[rsp+0xf]
     1175f80:	c6 00 00             	mov    BYTE PTR [rax],0x0
     1175f83:	4c 8b 02             	mov    r8,QWORD PTR [rdx]
     1175f86:	48 89 d6             	mov    rsi,rdx
     1175f89:	48 89 c2             	mov    rdx,rax
     1175f8c:	41 ff 50 20          	call   QWORD PTR [r8+0x20]
     1175f90:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     1175f94:	75 0c                	jne    1175fa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d3b8>
     1175f96:	49 83 c6 48          	add    r14,0x48
     1175f9a:	4c 89 f7             	mov    rdi,r14
     1175f9d:	e8 06 2b 9b ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1175fa2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1175fa9:	00 00 
     1175fab:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1175fb0:	75 2b                	jne    1175fdd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d3f3>
     1175fb2:	48 83 c4 18          	add    rsp,0x18
     1175fb6:	5b                   	pop    rbx
     1175fb7:	41 5e                	pop    r14
     1175fb9:	c3                   	ret
     1175fba:	49 89 c6             	mov    r14,rax
     1175fbd:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1175fc0:	e8 27 07 94 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1175fc5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1175fcc:	00 00 

### 0x11c0e18 from 0x11c0d78..0x11c0e65
     11c0df0:	e8 f1 49 5a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     11c0df5:	8b 44 24 04          	mov    eax,DWORD PTR [rsp+0x4]
     11c0df9:	83 f8 0b             	cmp    eax,0xb
     11c0dfc:	6a 0b                	push   0xb
     11c0dfe:	59                   	pop    rcx
     11c0dff:	0f 42 c8             	cmovb  ecx,eax
     11c0e02:	89 4c 24 44          	mov    DWORD PTR [rsp+0x44],ecx
     11c0e06:	80 4c 24 30 04       	or     BYTE PTR [rsp+0x30],0x4
     11c0e0b:	80 3c 24 00          	cmp    BYTE PTR [rsp],0x0
     11c0e0f:	74 0c                	je     11c0e1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63a1>
     11c0e11:	49 83 c6 30          	add    r14,0x30
     11c0e15:	4c 89 f7             	mov    rdi,r14
     11c0e18:	e8 8b 7c 96 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     11c0e1d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     11c0e21:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     11c0e26:	4c 89 f6             	mov    rsi,r14
     11c0e29:	e8 2e 0a 42 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
     11c0e2e:	4c 89 f7             	mov    rdi,r14
     11c0e31:	e8 d8 9c 8e ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
     11c0e36:	48 89 df             	mov    rdi,rbx
     11c0e39:	e8 52 d0 62 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11c0e3e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11c0e45:	00 00 
     11c0e47:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     11c0e4c:	75 0a                	jne    11c0e58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63dc>
     11c0e4e:	48 83 c4 50          	add    rsp,0x50

### 0x11c0f06 from 0x11c0e66..0x11c0f53
     11c0ede:	e8 03 49 5a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     11c0ee3:	8b 44 24 04          	mov    eax,DWORD PTR [rsp+0x4]
     11c0ee7:	83 f8 0b             	cmp    eax,0xb
     11c0eea:	6a 0b                	push   0xb
     11c0eec:	59                   	pop    rcx
     11c0eed:	0f 42 c8             	cmovb  ecx,eax
     11c0ef0:	89 4c 24 44          	mov    DWORD PTR [rsp+0x44],ecx
     11c0ef4:	80 4c 24 30 04       	or     BYTE PTR [rsp+0x30],0x4
     11c0ef9:	80 3c 24 00          	cmp    BYTE PTR [rsp],0x0
     11c0efd:	74 0c                	je     11c0f0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x648f>
     11c0eff:	49 83 c6 30          	add    r14,0x30
     11c0f03:	4c 89 f7             	mov    rdi,r14
     11c0f06:	e8 9d 7b 96 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     11c0f0b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     11c0f0f:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     11c0f14:	4c 89 f6             	mov    rsi,r14
     11c0f17:	e8 40 09 42 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
     11c0f1c:	4c 89 f7             	mov    rdi,r14
     11c0f1f:	e8 ea 9b 8e ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
     11c0f24:	48 89 df             	mov    rdi,rbx
     11c0f27:	e8 64 cf 62 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11c0f2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11c0f33:	00 00 
     11c0f35:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     11c0f3a:	75 0a                	jne    11c0f46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64ca>
     11c0f3c:	48 83 c4 50          	add    rsp,0x50

### 0x11c142f from 0x11c1398..0x11c1475
     11c1408:	0f 29 43 70          	movaps XMMWORD PTR [rbx+0x70],xmm0
     11c140c:	4c 8b 73 40          	mov    r14,QWORD PTR [rbx+0x40]
     11c1410:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
     11c1415:	4d 85 f6             	test   r14,r14
     11c1418:	74 09                	je     11c1423 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a7>
     11c141a:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11c141d:	4c 89 f7             	mov    rdi,r14
     11c1420:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11c1423:	40 84 ed             	test   bpl,bpl
     11c1426:	75 0c                	jne    11c1434 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69b8>
     11c1428:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
     11c142c:	48 89 df             	mov    rdi,rbx
     11c142f:	e8 74 76 96 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     11c1434:	4d 85 f6             	test   r14,r14
     11c1437:	74 13                	je     11c144c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69d0>
     11c1439:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11c143c:	4c 89 f7             	mov    rdi,r14
     11c143f:	48 83 c4 08          	add    rsp,0x8
     11c1443:	5b                   	pop    rbx
     11c1444:	41 5e                	pop    r14
     11c1446:	41 5f                	pop    r15
     11c1448:	5d                   	pop    rbp
     11c1449:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
     11c144c:	48 83 c4 08          	add    rsp,0x8
     11c1450:	5b                   	pop    rbx
     11c1451:	41 5e                	pop    r14

### 0x11c1675 from 0x11c161c..0x11c167a
     11c1656:	e9 5f fe ff ff       	jmp    11c14ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a3e>
     11c165b:	5b                   	pop    rbx
     11c165c:	41 5e                	pop    r14
     11c165e:	41 5f                	pop    r15
     11c1660:	c3                   	ret
     11c1661:	4c 89 f7             	mov    rdi,r14
     11c1664:	e8 51 fe ff ff       	call   11c14ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a3e>
     11c1669:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
     11c166d:	48 89 df             	mov    rdi,rbx
     11c1670:	5b                   	pop    rbx
     11c1671:	41 5e                	pop    r14
     11c1673:	41 5f                	pop    r15
     11c1675:	e9 2e 74 96 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     11c167a:	55                   	push   rbp
     11c167b:	41 57                	push   r15
     11c167d:	41 56                	push   r14
     11c167f:	41 55                	push   r13
     11c1681:	41 54                	push   r12
     11c1683:	53                   	push   rbx
     11c1684:	48 81 ec 88 00 00 00 	sub    rsp,0x88
     11c168b:	49 89 f6             	mov    r14,rsi
     11c168e:	49 89 fc             	mov    r12,rdi
     11c1691:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11c1698:	00 00 
     11c169a:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     11c16a1:	00 

### 0x11c1e94 from 0x11c1d40..0x11c1ef1
     11c1e6a:	e8 1f fd 93 ff       	call   b01b8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4eb2e>
     11c1e6f:	4c 39 e8             	cmp    rax,r13
     11c1e72:	74 0b                	je     11c1e7f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7403>
     11c1e74:	4c 89 ff             	mov    rdi,r15
     11c1e77:	48 89 c6             	mov    rsi,rax
     11c1e7a:	e8 bb 00 00 00       	call   11c1f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x74be>
     11c1e7f:	49 83 c6 18          	add    r14,0x18
     11c1e83:	4d 39 e6             	cmp    r14,r12
     11c1e86:	75 dc                	jne    11c1e64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73e8>
     11c1e88:	40 84 ed             	test   bpl,bpl
     11c1e8b:	75 0c                	jne    11c1e99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x741d>
     11c1e8d:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
     11c1e94:	e8 0f 6c 96 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     11c1e99:	48 89 e7             	mov    rdi,rsp
     11c1e9c:	e8 47 97 8b ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     11c1ea1:	48 89 df             	mov    rdi,rbx
     11c1ea4:	e8 2b fb ff ff       	call   11c19d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f58>
     11c1ea9:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11c1eae:	e8 67 f6 9a ff       	call   b7151a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbe4ba>
     11c1eb3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11c1eba:	00 00 
     11c1ebc:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     11c1ec1:	75 0f                	jne    11c1ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7456>
     11c1ec3:	48 83 c4 48          	add    rsp,0x48
     11c1ec7:	5b                   	pop    rbx
     11c1ec8:	41 5c                	pop    r12

### 0x11c32ac from 0x11c2bda..0x11c332e
     11c3281:	c6 83 b0 00 00 00 01 	mov    BYTE PTR [rbx+0xb0],0x1
     11c3288:	b0 01                	mov    al,0x1
     11c328a:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
     11c328e:	48 89 df             	mov    rdi,rbx
     11c3291:	e8 4c b5 8d ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     11c3296:	48 89 c3             	mov    rbx,rax
     11c3299:	48 39 e8             	cmp    rax,rbp
     11c329c:	75 94                	jne    11c3232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87b6>
     11c329e:	f6 44 24 0c 01       	test   BYTE PTR [rsp+0xc],0x1
     11c32a3:	74 0c                	je     11c32b1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8835>
     11c32a5:	49 83 ec 80          	sub    r12,0xffffffffffffff80
     11c32a9:	4c 89 e7             	mov    rdi,r12
     11c32ac:	e8 f7 57 96 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     11c32b1:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     11c32b6:	e8 5f e2 9a ff       	call   b7151a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbe4ba>
     11c32bb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11c32c2:	00 00 
     11c32c4:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     11c32cb:	00 
     11c32cc:	75 12                	jne    11c32e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8864>
     11c32ce:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     11c32d5:	5b                   	pop    rbx
     11c32d6:	41 5c                	pop    r12
     11c32d8:	41 5d                	pop    r13
     11c32da:	41 5e                	pop    r14
     11c32dc:	41 5f                	pop    r15

### 0x1249bd7 from 0x12497e6..0x1249c62
     1249b97:	e8 c6 00 00 00       	call   1249c62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f1e6>
     1249b9c:	c7 43 08 01 00 00 00 	mov    DWORD PTR [rbx+0x8],0x1
     1249ba3:	c6 83 08 02 00 00 01 	mov    BYTE PTR [rbx+0x208],0x1
     1249baa:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1249bad:	48 89 83 f8 01 00 00 	mov    QWORD PTR [rbx+0x1f8],rax
     1249bb4:	41 8a 46 08          	mov    al,BYTE PTR [r14+0x8]
     1249bb8:	88 83 00 02 00 00    	mov    BYTE PTR [rbx+0x200],al
     1249bbe:	c6 83 09 02 00 00 00 	mov    BYTE PTR [rbx+0x209],0x0
     1249bc5:	66 83 a3 0c 02 00 00 	and    WORD PTR [rbx+0x20c],0x0
     1249bcc:	00 
     1249bcd:	48 81 c3 58 01 00 00 	add    rbx,0x158
     1249bd4:	48 89 df             	mov    rdi,rbx
     1249bd7:	e8 cc ee 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1249bdc:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1249be1:	e8 90 06 fb ff       	call   11fa276 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f7fa>
     1249be6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1249bed:	00 00 
     1249bef:	48 3b 84 24 70 01 00 	cmp    rax,QWORD PTR [rsp+0x170]
     1249bf6:	00 
     1249bf7:	75 64                	jne    1249c5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f1e1>
     1249bf9:	48 81 c4 78 01 00 00 	add    rsp,0x178
     1249c00:	5b                   	pop    rbx
     1249c01:	41 5c                	pop    r12
     1249c03:	41 5d                	pop    r13
     1249c05:	41 5e                	pop    r14
     1249c07:	41 5f                	pop    r15

### 0x1249e56 from 0x1249d64..0x1249e81
     1249e18:	74 13                	je     1249e2d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f3b1>
     1249e1a:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
     1249e21:	e8 6a 40 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1249e26:	c6 83 50 01 00 00 00 	mov    BYTE PTR [rbx+0x150],0x0
     1249e2d:	80 bb 00 02 00 00 00 	cmp    BYTE PTR [rbx+0x200],0x0
     1249e34:	74 07                	je     1249e3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f3c1>
     1249e36:	c6 83 00 02 00 00 00 	mov    BYTE PTR [rbx+0x200],0x0
     1249e3d:	66 83 a3 0b 02 00 00 	and    WORD PTR [rbx+0x20b],0x0
     1249e44:	00 
     1249e45:	c6 83 0d 02 00 00 00 	mov    BYTE PTR [rbx+0x20d],0x0
     1249e4c:	48 81 c3 58 01 00 00 	add    rbx,0x158
     1249e53:	48 89 df             	mov    rdi,rbx
     1249e56:	e8 4d ec 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1249e5b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1249e62:	00 00 
     1249e64:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     1249e6b:	00 
     1249e6c:	75 0e                	jne    1249e7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f400>
     1249e6e:	48 81 c4 28 01 00 00 	add    rsp,0x128
     1249e75:	5b                   	pop    rbx
     1249e76:	41 5e                	pop    r14
     1249e78:	41 5f                	pop    r15
     1249e7a:	5d                   	pop    rbp
     1249e7b:	c3                   	ret
     1249e7c:	e8 2f 5c 5a 00       	call   17efab0 <__stack_chk_fail@plt>
     1249e81:	cc                   	int3

### 0x124d81c from 0x124d7ea..0x124d821
     124d7f1:	49 89 fe             	mov    r14,rdi
     124d7f4:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     124d7f8:	e8 bf 05 00 00       	call   124ddbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93340>
     124d7fd:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
     124d801:	48 89 de             	mov    rsi,rbx
     124d804:	e8 1b 03 00 00       	call   124db24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x930a8>
     124d809:	41 c6 46 58 00       	mov    BYTE PTR [r14+0x58],0x0
     124d80e:	49 83 c6 60          	add    r14,0x60
     124d812:	4c 89 f7             	mov    rdi,r14
     124d815:	48 83 c4 08          	add    rsp,0x8
     124d819:	5b                   	pop    rbx
     124d81a:	41 5e                	pop    r14
     124d81c:	e9 87 b2 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     124d821:	cc                   	int3
     124d822:	53                   	push   rbx
     124d823:	48 89 fb             	mov    rbx,rdi
     124d826:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     124d82a:	e8 2f 09 00 00       	call   124e15e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x936e2>
     124d82f:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     124d833:	31 c9                	xor    ecx,ecx
     124d835:	88 48 58             	mov    BYTE PTR [rax+0x58],cl
     124d838:	88 4b 58             	mov    BYTE PTR [rbx+0x58],cl
     124d83b:	48 83 c3 60          	add    rbx,0x60
     124d83f:	48 89 df             	mov    rdi,rbx
     124d842:	5b                   	pop    rbx
     124d843:	e9 60 b2 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>

### 0x124d843 from 0x124d822..0x124d848
     124d821:	cc                   	int3
     124d822:	53                   	push   rbx
     124d823:	48 89 fb             	mov    rbx,rdi
     124d826:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     124d82a:	e8 2f 09 00 00       	call   124e15e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x936e2>
     124d82f:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     124d833:	31 c9                	xor    ecx,ecx
     124d835:	88 48 58             	mov    BYTE PTR [rax+0x58],cl
     124d838:	88 4b 58             	mov    BYTE PTR [rbx+0x58],cl
     124d83b:	48 83 c3 60          	add    rbx,0x60
     124d83f:	48 89 df             	mov    rdi,rbx
     124d842:	5b                   	pop    rbx
     124d843:	e9 60 b2 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     124d848:	53                   	push   rbx
     124d849:	48 89 fb             	mov    rbx,rdi
     124d84c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     124d850:	e8 a1 09 00 00       	call   124e1f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9377a>
     124d855:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     124d859:	31 c9                	xor    ecx,ecx
     124d85b:	88 48 58             	mov    BYTE PTR [rax+0x58],cl
     124d85e:	88 4b 58             	mov    BYTE PTR [rbx+0x58],cl
     124d861:	5b                   	pop    rbx
     124d862:	c3                   	ret
     124d863:	cc                   	int3
     124d864:	41 57                	push   r15
     124d866:	41 56                	push   r14

### 0x124dba5 from 0x124db24..0x124dbc7
     124db7b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     124db7f:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
     124db83:	49 83 c6 18          	add    r14,0x18
     124db87:	48 89 e2             	mov    rdx,rsp
     124db8a:	48 89 02             	mov    QWORD PTR [rdx],rax
     124db8d:	c6 42 08 01          	mov    BYTE PTR [rdx+0x8],0x1
     124db91:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     124db94:	4c 89 f6             	mov    rsi,r14
     124db97:	ff 50 20             	call   QWORD PTR [rax+0x20]
     124db9a:	c6 43 58 00          	mov    BYTE PTR [rbx+0x58],0x0
     124db9e:	48 83 c3 60          	add    rbx,0x60
     124dba2:	48 89 df             	mov    rdi,rbx
     124dba5:	e8 fe ae 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     124dbaa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124dbb1:	00 00 
     124dbb3:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     124dbb8:	75 08                	jne    124dbc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93146>
     124dbba:	48 83 c4 18          	add    rsp,0x18
     124dbbe:	5b                   	pop    rbx
     124dbbf:	41 5e                	pop    r14
     124dbc1:	c3                   	ret
     124dbc2:	e8 e9 1e 5a 00       	call   17efab0 <__stack_chk_fail@plt>
     124dbc7:	cc                   	int3
     124dbc8:	c6 47 58 00          	mov    BYTE PTR [rdi+0x58],0x0
     124dbcc:	c3                   	ret
     124dbcd:	cc                   	int3

### 0x124e11d from 0x124ddbc..0x124e15d
     124e0f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124e0fd:	00 00 
     124e0ff:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     124e104:	75 52                	jne    124e158 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x936dc>
     124e106:	48 81 c3 38 01 00 00 	add    rbx,0x138
     124e10d:	48 89 df             	mov    rdi,rbx
     124e110:	48 83 c4 50          	add    rsp,0x50
     124e114:	5b                   	pop    rbx
     124e115:	41 5c                	pop    r12
     124e117:	41 5d                	pop    r13
     124e119:	41 5e                	pop    r14
     124e11b:	41 5f                	pop    r15
     124e11d:	e9 86 a9 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     124e122:	eb 05                	jmp    124e129 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x936ad>
     124e124:	48 89 c3             	mov    rbx,rax
     124e127:	eb 0d                	jmp    124e136 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x936ba>
     124e129:	48 89 c3             	mov    rbx,rax
     124e12c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     124e131:	e8 94 c1 82 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     124e136:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     124e13b:	e8 5e 18 85 ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
     124e140:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124e147:	00 00 
     124e149:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     124e14e:	75 08                	jne    124e158 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x936dc>
     124e150:	48 89 df             	mov    rdi,rbx

### 0x124e1ec from 0x124e15e..0x124e1f6
     124e1be:	e8 75 37 57 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     124e1c3:	48 89 df             	mov    rdi,rbx
     124e1c6:	e8 e9 07 00 00       	call   124e9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93f38>
     124e1cb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124e1d2:	00 00 
     124e1d4:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     124e1d9:	75 16                	jne    124e1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93775>
     124e1db:	48 81 c3 38 01 00 00 	add    rbx,0x138
     124e1e2:	48 89 df             	mov    rdi,rbx
     124e1e5:	48 83 c4 38          	add    rsp,0x38
     124e1e9:	5b                   	pop    rbx
     124e1ea:	41 5e                	pop    r14
     124e1ec:	e9 b7 a8 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     124e1f1:	e8 ba 18 5a 00       	call   17efab0 <__stack_chk_fail@plt>
     124e1f6:	55                   	push   rbp
     124e1f7:	41 57                	push   r15
     124e1f9:	41 56                	push   r14
     124e1fb:	41 55                	push   r13
     124e1fd:	41 54                	push   r12
     124e1ff:	53                   	push   rbx
     124e200:	48 81 ec 48 01 00 00 	sub    rsp,0x148
     124e207:	48 89 fb             	mov    rbx,rdi
     124e20a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124e211:	00 00 
     124e213:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
     124e21a:	00 

### 0x124e690 from 0x124e1f6..0x124e7c5
     124e659:	49 83 c7 08          	add    r15,0x8
     124e65d:	4c 39 64 24 10       	cmp    QWORD PTR [rsp+0x10],r12
     124e662:	0f 85 32 fe ff ff    	jne    124e49a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93a1e>
     124e668:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     124e66d:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
     124e671:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     124e676:	4c 89 f6             	mov    rsi,r14
     124e679:	e8 48 01 00 00       	call   124e7c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93d4a>
     124e67e:	4c 89 f7             	mov    rdi,r14
     124e681:	e8 82 aa fa ff       	call   11f9108 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e68c>
     124e686:	48 81 c3 38 01 00 00 	add    rbx,0x138
     124e68d:	48 89 df             	mov    rdi,rbx
     124e690:	e8 13 a4 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     124e695:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     124e69a:	e8 77 08 00 00       	call   124ef16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9449a>
     124e69f:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     124e6a4:	e8 e7 f7 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124e6a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124e6b0:	00 00 
     124e6b2:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]
     124e6b9:	00 
     124e6ba:	0f 85 f8 00 00 00    	jne    124e7b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93d3c>
     124e6c0:	48 81 c4 48 01 00 00 	add    rsp,0x148
     124e6c7:	5b                   	pop    rbx
     124e6c8:	41 5c                	pop    r12
     124e6ca:	41 5d                	pop    r13

### 0x124f0d8 from 0x124f0d0..0x124f0e7
     124f0b3:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     124f0b7:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     124f0bb:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     124f0c0:	48 83 c4 08          	add    rsp,0x8
     124f0c4:	5b                   	pop    rbx
     124f0c5:	41 5e                	pop    r14
     124f0c7:	c3                   	ret
     124f0c8:	48 89 c7             	mov    rdi,rax
     124f0cb:	e8 d5 a9 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     124f0d0:	50                   	push   rax
     124f0d1:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     124f0d4:	48 83 c7 18          	add    rdi,0x18
     124f0d8:	e8 cb 99 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     124f0dd:	58                   	pop    rax
     124f0de:	c3                   	ret
     124f0df:	48 89 c7             	mov    rdi,rax
     124f0e2:	e8 be a9 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     124f0e7:	cc                   	int3
     124f0e8:	50                   	push   rax
     124f0e9:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     124f0ec:	48 83 c7 18          	add    rdi,0x18
     124f0f0:	31 d2                	xor    edx,edx
     124f0f2:	e8 e5 5d 57 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
     124f0f7:	59                   	pop    rcx
     124f0f8:	c3                   	ret
     124f0f9:	48 89 c7             	mov    rdi,rax

### 0x124fd2e from 0x124fc72..0x124fd79
     124fcf7:	e8 76 3b 35 00       	call   15a3872 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8df6>
     124fcfc:	4c 89 f7             	mov    rdi,r14
     124fcff:	e8 3e ee 9d ff       	call   c2eb42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17bae2>
     124fd04:	41 80 3c 24 00       	cmp    BYTE PTR [r12],0x0
     124fd09:	74 28                	je     124fd33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952b7>
     124fd0b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     124fd10:	80 bb 10 01 00 00 00 	cmp    BYTE PTR [rbx+0x110],0x0
     124fd17:	75 07                	jne    124fd20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952a4>
     124fd19:	c6 83 10 01 00 00 01 	mov    BYTE PTR [rbx+0x110],0x1
     124fd20:	48 89 83 08 01 00 00 	mov    QWORD PTR [rbx+0x108],rax
     124fd27:	48 83 c3 20          	add    rbx,0x20
     124fd2b:	48 89 df             	mov    rdi,rbx
     124fd2e:	e8 75 8d 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     124fd33:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124fd3a:	00 00 
     124fd3c:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     124fd41:	75 31                	jne    124fd74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952f8>
     124fd43:	48 83 c4 38          	add    rsp,0x38
     124fd47:	5b                   	pop    rbx
     124fd48:	41 5c                	pop    r12
     124fd4a:	41 5e                	pop    r14
     124fd4c:	41 5f                	pop    r15
     124fd4e:	c3                   	ret
     124fd4f:	48 89 c3             	mov    rbx,rax
     124fd52:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     124fd57:	e8 e6 ed 9d ff       	call   c2eb42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17bae2>

### 0x125028f from 0x1250288..0x1250294
     125025f:	48 39 c8             	cmp    rax,rcx
     1250262:	75 ec                	jne    1250250 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x957d4>
     1250264:	48 83 a3 f8 00 00 00 	and    QWORD PTR [rbx+0xf8],0x0
     125026b:	00 
     125026c:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
     1250273:	e8 b4 f0 87 ff       	call   acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
     1250278:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
     125027f:	48 89 df             	mov    rdi,rbx
     1250282:	5b                   	pop    rbx
     1250283:	e9 a4 f0 87 ff       	jmp    acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
     1250288:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     125028b:	48 83 c7 40          	add    rdi,0x40
     125028f:	e9 14 88 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1250294:	53                   	push   rbx
     1250295:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1250298:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     125029c:	48 85 db             	test   rbx,rbx
     125029f:	74 11                	je     12502b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95836>
     12502a1:	48 89 df             	mov    rdi,rbx
     12502a4:	e8 55 34 48 00       	call   16d36fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8786a>
     12502a9:	48 89 df             	mov    rdi,rbx
     12502ac:	5b                   	pop    rbx
     12502ad:	e9 6e dc 59 00       	jmp    17edf20 <_ZdlPv@plt>
     12502b2:	5b                   	pop    rbx
     12502b3:	c3                   	ret
     12502b4:	53                   	push   rbx

### 0x1250a98 from 0x1250a90..0x1250aa7
     1250a6b:	e8 46 3b 86 ff       	call   ab45b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1556>
     1250a70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1250a77:	00 00 
     1250a79:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
     1250a80:	00 
     1250a81:	75 08                	jne    1250a8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9600f>
     1250a83:	4c 89 e7             	mov    rdi,r12
     1250a86:	e8 45 f2 81 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1250a8b:	e8 20 f0 59 00       	call   17efab0 <__stack_chk_fail@plt>
     1250a90:	50                   	push   rax
     1250a91:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1250a94:	48 83 c7 40          	add    rdi,0x40
     1250a98:	e8 0b 80 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1250a9d:	58                   	pop    rax
     1250a9e:	c3                   	ret
     1250a9f:	48 89 c7             	mov    rdi,rax
     1250aa2:	e8 fe 8f 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1250aa7:	cc                   	int3
     1250aa8:	50                   	push   rax
     1250aa9:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1250aac:	48 83 c7 40          	add    rdi,0x40
     1250ab0:	e8 f3 7f 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1250ab5:	58                   	pop    rax
     1250ab6:	c3                   	ret
     1250ab7:	48 89 c7             	mov    rdi,rax
     1250aba:	e8 e6 8f 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### 0x1250ab0 from 0x1250aa8..0x1250abf
     1250a90:	50                   	push   rax
     1250a91:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1250a94:	48 83 c7 40          	add    rdi,0x40
     1250a98:	e8 0b 80 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1250a9d:	58                   	pop    rax
     1250a9e:	c3                   	ret
     1250a9f:	48 89 c7             	mov    rdi,rax
     1250aa2:	e8 fe 8f 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1250aa7:	cc                   	int3
     1250aa8:	50                   	push   rax
     1250aa9:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1250aac:	48 83 c7 40          	add    rdi,0x40
     1250ab0:	e8 f3 7f 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1250ab5:	58                   	pop    rax
     1250ab6:	c3                   	ret
     1250ab7:	48 89 c7             	mov    rdi,rax
     1250aba:	e8 e6 8f 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1250abf:	cc                   	int3
     1250ac0:	53                   	push   rbx
     1250ac1:	48 89 fb             	mov    rbx,rdi
     1250ac4:	e8 59 93 fa ff       	call   11f9e22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f3a6>
     1250ac9:	48 89 df             	mov    rdi,rbx
     1250acc:	5b                   	pop    rbx
     1250acd:	e9 4e d4 59 00       	jmp    17edf20 <_ZdlPv@plt>
     1250ad2:	55                   	push   rbp
     1250ad3:	41 57                	push   r15

### 0x1254664 from 0x1254638..0x1254669
     1254645:	77 18                	ja     125465f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99be3>
     1254647:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     125464a:	80 7e 30 00          	cmp    BYTE PTR [rsi+0x30],0x0
     125464e:	74 10                	je     1254660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99be4>
     1254650:	f6 46 0c 01          	test   BYTE PTR [rsi+0xc],0x1
     1254654:	74 0a                	je     1254660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99be4>
     1254656:	8b 06                	mov    eax,DWORD PTR [rsi]
     1254658:	ff c8                	dec    eax
     125465a:	83 f8 fe             	cmp    eax,0xfffffffe
     125465d:	73 01                	jae    1254660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99be4>
     125465f:	c3                   	ret
     1254660:	48 83 c7 40          	add    rdi,0x40
     1254664:	e9 3f 44 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1254669:	cc                   	int3
     125466a:	53                   	push   rbx
     125466b:	48 89 fb             	mov    rbx,rdi
     125466e:	e8 d3 57 fa ff       	call   11f9e46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f3ca>
     1254673:	48 89 df             	mov    rdi,rbx
     1254676:	5b                   	pop    rbx
     1254677:	e9 a4 98 59 00       	jmp    17edf20 <_ZdlPv@plt>
     125467c:	41 57                	push   r15
     125467e:	41 56                	push   r14
     1254680:	41 55                	push   r13
     1254682:	41 54                	push   r12
     1254684:	53                   	push   rbx
     1254685:	48 83 ec 60          	sub    rsp,0x60

### 0x12547ec from 0x12547e0..0x12547fb
     12547d0:	75 09                	jne    12547db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99d5f>
     12547d2:	48 83 c4 40          	add    rsp,0x40
     12547d6:	5b                   	pop    rbx
     12547d7:	41 5e                	pop    r14
     12547d9:	5d                   	pop    rbp
     12547da:	c3                   	ret
     12547db:	e8 d0 b2 59 00       	call   17efab0 <__stack_chk_fail@plt>
     12547e0:	50                   	push   rax
     12547e1:	85 f6                	test   esi,esi
     12547e3:	75 0c                	jne    12547f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99d75>
     12547e5:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     12547e8:	48 83 c7 40          	add    rdi,0x40
     12547ec:	e8 b7 42 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12547f1:	58                   	pop    rax
     12547f2:	c3                   	ret
     12547f3:	48 89 c7             	mov    rdi,rax
     12547f6:	e8 aa 52 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12547fb:	cc                   	int3
     12547fc:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     12547ff:	48 83 c7 78          	add    rdi,0x78
     1254803:	e9 a0 42 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1254808:	53                   	push   rbx
     1254809:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     125480c:	48 8b 58 18          	mov    rbx,QWORD PTR [rax+0x18]
     1254810:	48 85 db             	test   rbx,rbx
     1254813:	74 3a                	je     125484f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99dd3>

### 0x1254803 from 0x12547fc..0x1254808
     12547e1:	85 f6                	test   esi,esi
     12547e3:	75 0c                	jne    12547f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99d75>
     12547e5:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     12547e8:	48 83 c7 40          	add    rdi,0x40
     12547ec:	e8 b7 42 8d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12547f1:	58                   	pop    rax
     12547f2:	c3                   	ret
     12547f3:	48 89 c7             	mov    rdi,rax
     12547f6:	e8 aa 52 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12547fb:	cc                   	int3
     12547fc:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     12547ff:	48 83 c7 78          	add    rdi,0x78
     1254803:	e9 a0 42 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1254808:	53                   	push   rbx
     1254809:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     125480c:	48 8b 58 18          	mov    rbx,QWORD PTR [rax+0x18]
     1254810:	48 85 db             	test   rbx,rbx
     1254813:	74 3a                	je     125484f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99dd3>
     1254815:	48 83 7b 18 00       	cmp    QWORD PTR [rbx+0x18],0x0
     125481a:	74 2e                	je     125484a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99dce>
     125481c:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1254820:	e8 bb 00 00 00       	call   12548e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99e64>
     1254825:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     125482a:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     125482e:	48 85 c0             	test   rax,rax
     1254831:	74 12                	je     1254845 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99dc9>

### 0x1258128 from 0x1258114..0x125812e
     12580f5:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     12580fc:	00 
     12580fd:	75 08                	jne    1258107 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d68b>
     12580ff:	48 89 df             	mov    rdi,rbx
     1258102:	e8 c9 7b 81 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1258107:	e8 a4 79 59 00       	call   17efab0 <__stack_chk_fail@plt>
     125810c:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     125810f:	e9 44 00 00 00       	jmp    1258158 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d6dc>
     1258114:	80 bf 80 00 00 00 00 	cmp    BYTE PTR [rdi+0x80],0x0
     125811b:	74 10                	je     125812d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d6b1>
     125811d:	c6 87 80 00 00 00 00 	mov    BYTE PTR [rdi+0x80],0x0
     1258124:	48 83 c7 28          	add    rdi,0x28
     1258128:	e9 7b 09 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     125812d:	c3                   	ret
     125812e:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     1258132:	e9 73 f8 ff ff       	jmp    12579aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf2e>
     1258137:	cc                   	int3
     1258138:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     125813c:	e9 b9 f8 ff ff       	jmp    12579fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf7e>
     1258141:	cc                   	int3
     1258142:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     1258146:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     1258149:	e9 0a 00 00 00       	jmp    1258158 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d6dc>
     125814e:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     1258152:	e9 bd ff ff ff       	jmp    1258114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d698>
     1258157:	cc                   	int3

### 0x125817d from 0x1258158..0x1258182
     1258159:	48 89 fb             	mov    rbx,rdi
     125815c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     125815f:	48 89 f7             	mov    rdi,rsi
     1258162:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     1258168:	84 c0                	test   al,al
     125816a:	74 09                	je     1258175 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d6f9>
     125816c:	c6 83 80 00 00 00 01 	mov    BYTE PTR [rbx+0x80],0x1
     1258173:	5b                   	pop    rbx
     1258174:	c3                   	ret
     1258175:	48 83 c3 28          	add    rbx,0x28
     1258179:	48 89 df             	mov    rdi,rbx
     125817c:	5b                   	pop    rbx
     125817d:	e9 26 09 8d ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1258182:	53                   	push   rbx
     1258183:	48 83 ec 60          	sub    rsp,0x60
     1258187:	48 89 fb             	mov    rbx,rdi
     125818a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1258191:	00 00 
     1258193:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     1258198:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
     125819b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     125819e:	48 89 e7             	mov    rdi,rsp
     12581a1:	31 d2                	xor    edx,edx
     12581a3:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12581a6:	8b 44 24 38          	mov    eax,DWORD PTR [rsp+0x38]
     12581aa:	83 f8 09             	cmp    eax,0x9

### 0x1258bb2 from 0x1258baa..0x1258bc1
     1258b97:	41 5c                	pop    r12
     1258b99:	41 5d                	pop    r13
     1258b9b:	41 5e                	pop    r14
     1258b9d:	41 5f                	pop    r15
     1258b9f:	5d                   	pop    rbp
     1258ba0:	c3                   	ret
     1258ba1:	48 89 c7             	mov    rdi,rax
     1258ba4:	e8 fc 0e 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1258ba9:	cc                   	int3
     1258baa:	50                   	push   rax
     1258bab:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1258bae:	48 83 c7 08          	add    rdi,0x8
     1258bb2:	e8 f1 fe 8c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1258bb7:	58                   	pop    rax
     1258bb8:	c3                   	ret
     1258bb9:	48 89 c7             	mov    rdi,rax
     1258bbc:	e8 e4 0e 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1258bc1:	cc                   	int3
     1258bc2:	53                   	push   rbx
     1258bc3:	48 89 fb             	mov    rbx,rdi
     1258bc6:	e8 87 04 fa ff       	call   11f9052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e5d6>
     1258bcb:	48 89 df             	mov    rdi,rbx
     1258bce:	5b                   	pop    rbx
     1258bcf:	e9 4c 53 59 00       	jmp    17edf20 <_ZdlPv@plt>
     1258bd4:	41 56                	push   r14
     1258bd6:	53                   	push   rbx

### 0x1258c8e from 0x1258c82..0x1258c9d
     1258c6b:	00 00 
     1258c6d:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     1258c72:	75 08                	jne    1258c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e200>
     1258c74:	48 89 df             	mov    rdi,rbx
     1258c77:	e8 54 70 81 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1258c7c:	e8 2f 6e 59 00       	call   17efab0 <__stack_chk_fail@plt>
     1258c81:	cc                   	int3
     1258c82:	50                   	push   rax
     1258c83:	85 d2                	test   edx,edx
     1258c85:	74 0c                	je     1258c93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e217>
     1258c87:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1258c8a:	48 83 c7 58          	add    rdi,0x58
     1258c8e:	e8 15 fe 8c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1258c93:	58                   	pop    rax
     1258c94:	c3                   	ret
     1258c95:	48 89 c7             	mov    rdi,rax
     1258c98:	e8 08 0e 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1258c9d:	cc                   	int3
     1258c9e:	53                   	push   rbx
     1258c9f:	48 89 fb             	mov    rbx,rdi
     1258ca2:	e8 65 03 fa ff       	call   11f900c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e590>
     1258ca7:	48 89 df             	mov    rdi,rbx
     1258caa:	5b                   	pop    rbx
     1258cab:	e9 70 52 59 00       	jmp    17edf20 <_ZdlPv@plt>
     1258cb0:	41 57                	push   r15
     1258cb2:	41 56                	push   r14

### 0x12590f6 from 0x12590ee..0x1259105
     12590d3:	48 81 c4 c0 03 00 00 	add    rsp,0x3c0
     12590da:	5b                   	pop    rbx
     12590db:	41 5e                	pop    r14
     12590dd:	41 5f                	pop    r15
     12590df:	c3                   	ret
     12590e0:	e8 cb 69 59 00       	call   17efab0 <__stack_chk_fail@plt>
     12590e5:	48 89 c7             	mov    rdi,rax
     12590e8:	e8 b8 09 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12590ed:	cc                   	int3
     12590ee:	50                   	push   rax
     12590ef:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     12590f2:	48 83 c7 20          	add    rdi,0x20
     12590f6:	e8 ad f9 8c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12590fb:	58                   	pop    rax
     12590fc:	c3                   	ret
     12590fd:	48 89 c7             	mov    rdi,rax
     1259100:	e8 a0 09 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1259105:	cc                   	int3
     1259106:	53                   	push   rbx
     1259107:	48 89 fb             	mov    rbx,rdi
     125910a:	e8 29 ff f9 ff       	call   11f9038 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e5bc>
     125910f:	48 89 df             	mov    rdi,rbx
     1259112:	5b                   	pop    rbx
     1259113:	e9 08 4e 59 00       	jmp    17edf20 <_ZdlPv@plt>
     1259118:	41 57                	push   r15
     125911a:	41 56                	push   r14

### 0x125b7bf from 0x125b7b0..0x125b7ce
     125b795:	00 00 
     125b797:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     125b79c:	75 05                	jne    125b7a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0d27>
     125b79e:	48 83 c4 18          	add    rsp,0x18
     125b7a2:	c3                   	ret
     125b7a3:	e8 08 43 59 00       	call   17efab0 <__stack_chk_fail@plt>
     125b7a8:	48 89 c7             	mov    rdi,rax
     125b7ab:	e8 f5 e2 81 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     125b7b0:	50                   	push   rax
     125b7b1:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     125b7b4:	c6 47 58 01          	mov    BYTE PTR [rdi+0x58],0x1
     125b7b8:	48 81 c7 88 00 00 00 	add    rdi,0x88
     125b7bf:	e8 e4 d2 8c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     125b7c4:	58                   	pop    rax
     125b7c5:	c3                   	ret
     125b7c6:	48 89 c7             	mov    rdi,rax
     125b7c9:	e8 d7 e2 81 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     125b7ce:	66 0f 38 35 06       	pmovzxdq xmm0,QWORD PTR [rsi]
     125b7d3:	66 0f 38 35 0a       	pmovzxdq xmm1,QWORD PTR [rdx]
     125b7d8:	66 0f ef c8          	pxor   xmm1,xmm0
     125b7dc:	66 0f 38 17 c9       	ptest  xmm1,xmm1
     125b7e1:	0f 94 c0             	sete   al
     125b7e4:	c3                   	ret
     125b7e5:	cc                   	int3
     125b7e6:	55                   	push   rbp
     125b7e7:	41 57                	push   r15

### 0x125caa5 from 0x125ca94..0x125cab4
     125ca7f:	eb e7                	jmp    125ca68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1fec>
     125ca81:	c3                   	ret
     125ca82:	53                   	push   rbx
     125ca83:	48 89 fb             	mov    rbx,rdi
     125ca86:	e8 b1 d8 f9 ff       	call   11fa33c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8c0>
     125ca8b:	48 89 df             	mov    rdi,rbx
     125ca8e:	5b                   	pop    rbx
     125ca8f:	e9 8c 14 59 00       	jmp    17edf20 <_ZdlPv@plt>
     125ca94:	50                   	push   rax
     125ca95:	80 bf e8 00 00 00 00 	cmp    BYTE PTR [rdi+0xe8],0x0
     125ca9c:	74 0c                	je     125caaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa202e>
     125ca9e:	48 81 c7 90 00 00 00 	add    rdi,0x90
     125caa5:	e8 fe bf 8c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     125caaa:	58                   	pop    rax
     125caab:	c3                   	ret
     125caac:	48 89 c7             	mov    rdi,rax
     125caaf:	e8 f1 cf 81 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     125cab4:	41 56                	push   r14
     125cab6:	53                   	push   rbx
     125cab7:	48 83 ec 38          	sub    rsp,0x38
     125cabb:	48 89 fb             	mov    rbx,rdi
     125cabe:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125cac5:	00 00 
     125cac7:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     125cacc:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     125cad0:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]

### 0x1260407 from 0x12601ac..0x126047c
     12603d0:	41 c7 46 08 01 00 00 	mov    DWORD PTR [r14+0x8],0x1
     12603d7:	00 
     12603d8:	41 c6 86 80 01 00 00 	mov    BYTE PTR [r14+0x180],0x1
     12603df:	01 
     12603e0:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12603e3:	49 89 86 70 01 00 00 	mov    QWORD PTR [r14+0x170],rax
     12603ea:	8a 43 08             	mov    al,BYTE PTR [rbx+0x8]
     12603ed:	41 88 86 78 01 00 00 	mov    BYTE PTR [r14+0x178],al
     12603f4:	66 41 83 a6 83 01 00 	and    WORD PTR [r14+0x183],0x0
     12603fb:	00 00 
     12603fd:	49 81 c6 d0 00 00 00 	add    r14,0xd0
     1260404:	4c 89 f7             	mov    rdi,r14
     1260407:	e8 9c 86 8c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     126040c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1260411:	e8 be 9e f9 ff       	call   11fa2d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f858>
     1260416:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     126041d:	00 00 
     126041f:	48 3b 84 24 d8 00 00 	cmp    rax,QWORD PTR [rsp+0xd8]
     1260426:	00 
     1260427:	75 4e                	jne    1260477 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa59fb>
     1260429:	48 81 c4 e0 00 00 00 	add    rsp,0xe0
     1260430:	5b                   	pop    rbx
     1260431:	41 5c                	pop    r12
     1260433:	41 5d                	pop    r13
     1260435:	41 5e                	pop    r14
     1260437:	41 5f                	pop    r15

### 0x1260620 from 0x1260544..0x1260649
     12605e2:	74 13                	je     12605f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa5b7b>
     12605e4:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
     12605eb:	e8 a0 d8 58 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12605f0:	c6 83 c8 00 00 00 00 	mov    BYTE PTR [rbx+0xc8],0x0
     12605f7:	80 bb 78 01 00 00 00 	cmp    BYTE PTR [rbx+0x178],0x0
     12605fe:	74 07                	je     1260607 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa5b8b>
     1260600:	c6 83 78 01 00 00 00 	mov    BYTE PTR [rbx+0x178],0x0
     1260607:	66 83 a3 82 01 00 00 	and    WORD PTR [rbx+0x182],0x0
     126060e:	00 
     126060f:	c6 83 84 01 00 00 00 	mov    BYTE PTR [rbx+0x184],0x0
     1260616:	48 81 c3 d0 00 00 00 	add    rbx,0xd0
     126061d:	48 89 df             	mov    rdi,rbx
     1260620:	e8 83 84 8c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1260625:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     126062c:	00 00 
     126062e:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
     1260635:	00 
     1260636:	75 0c                	jne    1260644 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa5bc8>
     1260638:	48 81 c4 a0 00 00 00 	add    rsp,0xa0
     126063f:	5b                   	pop    rbx
     1260640:	41 5e                	pop    r14
     1260642:	5d                   	pop    rbp
     1260643:	c3                   	ret
     1260644:	e8 67 f4 58 00       	call   17efab0 <__stack_chk_fail@plt>
     1260649:	cc                   	int3
     126064a:	41 57                	push   r15

### 0x1266030 from 0x1265fbe..0x1266052
     1265ffa:	49 89 3e             	mov    QWORD PTR [r14],rdi
     1265ffd:	48 8d 05 60 64 81 ff 	lea    rax,[rip+0xffffffffff816460]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     1266004:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1266008:	48 8d 05 43 00 00 00 	lea    rax,[rip+0x43]        # 1266052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xab5d6>
     126600f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     1266013:	4c 89 f2             	mov    rdx,r14
     1266016:	45 31 c0             	xor    r8d,r8d
     1266019:	e8 ae b7 55 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
     126601e:	4c 89 f7             	mov    rdi,r14
     1266021:	e8 78 12 84 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     1266026:	48 81 c3 88 00 00 00 	add    rbx,0x88
     126602d:	48 89 df             	mov    rdi,rbx
     1266030:	e8 73 2a 8c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1266035:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     126603c:	00 00 
     126603e:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     1266043:	75 08                	jne    126604d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xab5d1>
     1266045:	48 83 c4 48          	add    rsp,0x48
     1266049:	5b                   	pop    rbx
     126604a:	41 5e                	pop    r14
     126604c:	c3                   	ret
     126604d:	e8 5e 9a 58 00       	call   17efab0 <__stack_chk_fail@plt>
     1266052:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1266055:	e9 00 00 00 00       	jmp    126605a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xab5de>
     126605a:	55                   	push   rbp
     126605b:	41 57                	push   r15

### 0x1268d51 from 0x1268d32..0x1268d5f
     1268d2c:	e9 2f 00 00 00       	jmp    1268d60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae2e4>
     1268d31:	cc                   	int3
     1268d32:	53                   	push   rbx
     1268d33:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1268d36:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1268d3a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     1268d3d:	e8 0e 3c 00 00       	call   126c950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1ed4>
     1268d42:	84 c0                	test   al,al
     1268d44:	74 10                	je     1268d56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae2da>
     1268d46:	48 81 c3 98 00 00 00 	add    rbx,0x98
     1268d4d:	48 89 df             	mov    rdi,rbx
     1268d50:	5b                   	pop    rbx
     1268d51:	e9 52 fd 8b ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1268d56:	c6 83 20 01 00 00 01 	mov    BYTE PTR [rbx+0x120],0x1
     1268d5d:	5b                   	pop    rbx
     1268d5e:	c3                   	ret
     1268d5f:	cc                   	int3
     1268d60:	53                   	push   rbx
     1268d61:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
     1268d68:	48 89 f3             	mov    rbx,rsi
     1268d6b:	48 89 fe             	mov    rsi,rdi
     1268d6e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1268d75:	00 00 
     1268d77:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     1268d7e:	00 
     1268d7f:	0f 57 c0             	xorps  xmm0,xmm0

### 0x1268fb1 from 0x1268e80..0x1269698
     1268f77:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     1268f7c:	4c 89 f7             	mov    rdi,r14
     1268f7f:	e8 de a3 fc ff       	call   1233362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x788e6>
     1268f84:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1268f89:	48 8d 78 40          	lea    rdi,[rax+0x40]
     1268f8d:	4c 89 f6             	mov    rsi,r14
     1268f90:	e8 cb fd ff ff       	call   1268d60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae2e4>
     1268f95:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1268f9a:	80 bf 20 01 00 00 00 	cmp    BYTE PTR [rdi+0x120],0x0
     1268fa1:	74 13                	je     1268fb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae53a>
     1268fa3:	c6 87 20 01 00 00 00 	mov    BYTE PTR [rdi+0x120],0x0
     1268faa:	48 81 c7 98 00 00 00 	add    rdi,0x98
     1268fb1:	e8 f2 fa 8b ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1268fb6:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1268fbb:	e8 48 fe b7 ff       	call   de8e08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5e8e>
     1268fc0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1268fc7:	00 00 
     1268fc9:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
     1268fd0:	00 
     1268fd1:	0f 85 bc 06 00 00    	jne    1269693 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaec17>
     1268fd7:	48 81 c4 18 01 00 00 	add    rsp,0x118
     1268fde:	5b                   	pop    rbx
     1268fdf:	41 5c                	pop    r12
     1268fe1:	41 5d                	pop    r13
     1268fe3:	41 5e                	pop    r14
     1268fe5:	41 5f                	pop    r15

### 0x126ae78 from 0x126ae6c..0x126ae87
     126ae4f:	48 89 08             	mov    QWORD PTR [rax],rcx
     126ae52:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     126ae57:	48 8d 0d 9a 49 1d ff 	lea    rcx,[rip+0xffffffffff1d499a]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     126ae5e:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     126ae62:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     126ae66:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     126ae6a:	5b                   	pop    rbx
     126ae6b:	c3                   	ret
     126ae6c:	50                   	push   rax
     126ae6d:	b8 58 01 00 00       	mov    eax,0x158
     126ae72:	48 03 07             	add    rax,QWORD PTR [rdi]
     126ae75:	48 89 c7             	mov    rdi,rax
     126ae78:	e8 2b dc 8b ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     126ae7d:	58                   	pop    rax
     126ae7e:	c3                   	ret
     126ae7f:	48 89 c7             	mov    rdi,rax
     126ae82:	e8 1e ec 80 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     126ae87:	cc                   	int3
     126ae88:	55                   	push   rbp
     126ae89:	41 57                	push   r15
     126ae8b:	41 56                	push   r14
     126ae8d:	41 55                	push   r13
     126ae8f:	41 54                	push   r12
     126ae91:	53                   	push   rbx
     126ae92:	48 81 ec 08 01 00 00 	sub    rsp,0x108
     126ae99:	49 89 d4             	mov    r12,rdx

### 0x126bc6c from 0x126bbe0..0x126bc97
     126bc3a:	5f                   	pop    rdi
     126bc3b:	ba 1d 02 00 00       	mov    edx,0x21d
     126bc40:	41 89 e8             	mov    r8d,ebp
     126bc43:	31 c0                	xor    eax,eax
     126bc45:	e8 88 ac 56 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     126bc4a:	48 89 e7             	mov    rdi,rsp
     126bc4d:	e8 3e 22 58 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     126bc52:	80 bb 10 02 00 00 01 	cmp    BYTE PTR [rbx+0x210],0x1
     126bc59:	74 07                	je     126bc62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb11e6>
     126bc5b:	c6 83 10 02 00 00 02 	mov    BYTE PTR [rbx+0x210],0x2
     126bc62:	48 81 c3 58 01 00 00 	add    rbx,0x158
     126bc69:	48 89 df             	mov    rdi,rbx
     126bc6c:	e8 37 ce 8b ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     126bc71:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     126bc78:	00 00 
     126bc7a:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     126bc7f:	75 09                	jne    126bc8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb120e>
     126bc81:	48 83 c4 20          	add    rsp,0x20
     126bc85:	5b                   	pop    rbx
     126bc86:	41 5e                	pop    r14
     126bc88:	5d                   	pop    rbp
     126bc89:	c3                   	ret
     126bc8a:	e8 21 3e 58 00       	call   17efab0 <__stack_chk_fail@plt>
     126bc8f:	48 89 c7             	mov    rdi,rax
     126bc92:	e8 0e de 80 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     126bc97:	cc                   	int3

### 0x126c063 from 0x126bd78..0x126c3e6
     126c023:	49 0f 4c d6          	cmovl  rdx,r14
     126c027:	48 69 ca 00 ca 9a 3b 	imul   rcx,rdx,0x3b9aca00
     126c02e:	48 01 c1             	add    rcx,rax
     126c031:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     126c036:	48 89 88 40 02 00 00 	mov    QWORD PTR [rax+0x240],rcx
     126c03d:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     126c042:	80 b8 10 02 00 00 01 	cmp    BYTE PTR [rax+0x210],0x1
     126c049:	74 0c                	je     126c057 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb15db>
     126c04b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     126c050:	c6 80 10 02 00 00 02 	mov    BYTE PTR [rax+0x210],0x2
     126c057:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     126c05c:	48 81 c7 58 01 00 00 	add    rdi,0x158
     126c063:	e8 40 ca 8b ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     126c068:	e9 eb 01 00 00       	jmp    126c258 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb17dc>
     126c06d:	31 c0                	xor    eax,eax
     126c06f:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
     126c073:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al
     126c07a:	40 b5 01             	mov    bpl,0x1
     126c07d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     126c082:	e8 71 f7 88 ff       	call   afb7f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48798>
     126c087:	40 84 ed             	test   bpl,bpl
     126c08a:	0f 85 a3 01 00 00    	jne    126c233 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb17b7>
     126c090:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     126c095:	48 8d b8 c8 01 00 00 	lea    rdi,[rax+0x1c8]
     126c09c:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     126c0a1:	e8 b4 93 86 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>

### 0x126c23f from 0x126bd78..0x126c3e6
     126c205:	75 0e                	jne    126c215 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1799>
     126c207:	eb 16                	jmp    126c21f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb17a3>
     126c209:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     126c20e:	c6 80 30 02 00 00 01 	mov    BYTE PTR [rax+0x230],0x1
     126c215:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     126c21a:	e8 a9 e8 ff ff       	call   126aac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb004c>
     126c21f:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     126c224:	83 a0 38 02 00 00 00 	and    DWORD PTR [rax+0x238],0x0
     126c22b:	48 83 a0 40 02 00 00 	and    QWORD PTR [rax+0x240],0x0
     126c232:	00 
     126c233:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     126c238:	48 81 c7 58 01 00 00 	add    rdi,0x158
     126c23f:	e8 64 c8 8b ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     126c244:	80 bc 24 a8 00 00 00 	cmp    BYTE PTR [rsp+0xa8],0x0
     126c24b:	00 
     126c24c:	74 0a                	je     126c258 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb17dc>
     126c24e:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     126c253:	e8 8e 01 00 00       	call   126c3e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb196a>
     126c258:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     126c25f:	00 00 
     126c261:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     126c268:	00 
     126c269:	0f 85 dc 00 00 00    	jne    126c34b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb18cf>
     126c26f:	48 81 c4 08 01 00 00 	add    rsp,0x108
     126c276:	5b                   	pop    rbx
     126c277:	41 5c                	pop    r12

### 0x126c668 from 0x126c65c..0x126c677
     126c648:	84 c0                	test   al,al
     126c64a:	75 06                	jne    126c652 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1bd6>
     126c64c:	48 89 df             	mov    rdi,rbx
     126c64f:	ff 53 18             	call   QWORD PTR [rbx+0x18]
     126c652:	5b                   	pop    rbx
     126c653:	c3                   	ret
     126c654:	48 89 c7             	mov    rdi,rax
     126c657:	e8 49 d4 80 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     126c65c:	50                   	push   rax
     126c65d:	b8 58 01 00 00       	mov    eax,0x158
     126c662:	48 03 07             	add    rax,QWORD PTR [rdi]
     126c665:	48 89 c7             	mov    rdi,rax
     126c668:	e8 3b c4 8b ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     126c66d:	58                   	pop    rax
     126c66e:	c3                   	ret
     126c66f:	48 89 c7             	mov    rdi,rax
     126c672:	e8 2e d4 80 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     126c677:	cc                   	int3
     126c678:	e9 b1 8c 45 00       	jmp    16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     126c67d:	cc                   	int3
     126c67e:	55                   	push   rbp
     126c67f:	41 57                	push   r15
     126c681:	41 56                	push   r14
     126c683:	53                   	push   rbx
     126c684:	48 81 ec 58 04 00 00 	sub    rsp,0x458
     126c68b:	48 89 fb             	mov    rbx,rdi

### 0x126c937 from 0x126c930..0x126c93c
     126c90a:	e8 1f 8a 45 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     126c90f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     126c916:	00 00 
     126c918:	48 3b 84 24 50 04 00 	cmp    rax,QWORD PTR [rsp+0x450]
     126c91f:	00 
     126c920:	75 08                	jne    126c92a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1eae>
     126c922:	48 89 df             	mov    rdi,rbx
     126c925:	e8 a6 33 80 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     126c92a:	e8 81 31 58 00       	call   17efab0 <__stack_chk_fail@plt>
     126c92f:	cc                   	int3
     126c930:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     126c933:	48 83 c7 50          	add    rdi,0x50
     126c937:	e9 6c c1 8b ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     126c93c:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
     126c940:	0f 84 4a 15 58 00    	je     17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     126c946:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     126c94a:	e9 37 1b 83 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     126c94f:	cc                   	int3
     126c950:	48 85 ff             	test   rdi,rdi
     126c953:	74 0e                	je     126c963 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1ee7>
     126c955:	50                   	push   rax
     126c956:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     126c959:	ff 50 50             	call   QWORD PTR [rax+0x50]
     126c95c:	34 01                	xor    al,0x1
     126c95e:	48 83 c4 08          	add    rsp,0x8
     126c962:	c3                   	ret

### 0x127fbca from 0x127fb84..0x127fbea
     127fbaa:	84 c0                	test   al,al
     127fbac:	74 08                	je     127fbb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc513a>
     127fbae:	48 83 c4 08          	add    rsp,0x8
     127fbb2:	5b                   	pop    rbx
     127fbb3:	41 5e                	pop    r14
     127fbb5:	c3                   	ret
     127fbb6:	4c 8d 73 48          	lea    r14,[rbx+0x48]
     127fbba:	48 89 df             	mov    rdi,rbx
     127fbbd:	e8 28 00 00 00       	call   127fbea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc516e>
     127fbc2:	84 c0                	test   al,al
     127fbc4:	75 09                	jne    127fbcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5153>
     127fbc6:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
     127fbca:	e8 d9 8e 8a ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     127fbcf:	4c 89 f7             	mov    rdi,r14
     127fbd2:	e8 83 8a 82 ff       	call   aa865a <JNI_OnUnload@@Base+0x2ff27>
     127fbd7:	48 83 c3 60          	add    rbx,0x60
     127fbdb:	48 89 df             	mov    rdi,rbx
     127fbde:	48 83 c4 08          	add    rsp,0x8
     127fbe2:	5b                   	pop    rbx
     127fbe3:	41 5e                	pop    r14
     127fbe5:	e9 70 8a 82 ff       	jmp    aa865a <JNI_OnUnload@@Base+0x2ff27>
     127fbea:	41 56                	push   r14
     127fbec:	53                   	push   rbx
     127fbed:	50                   	push   rax
     127fbee:	49 89 fe             	mov    r14,rdi
     127fbf1:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]

### 0x128309d from 0x1283096..0x12830a2
     1283084:	83 fe 09             	cmp    esi,0x9
     1283087:	74 f3                	je     128307c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8600>
     1283089:	83 fe 64             	cmp    esi,0x64
     128308c:	74 ee                	je     128307c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8600>
     128308e:	31 c0                	xor    eax,eax
     1283090:	c3                   	ret
     1283091:	cc                   	int3
     1283092:	6a 17                	push   0x17
     1283094:	58                   	pop    rax
     1283095:	c3                   	ret
     1283096:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1283099:	48 83 c7 20          	add    rdi,0x20
     128309d:	e9 06 5a 8a ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12830a2:	6a 05                	push   0x5
     12830a4:	58                   	pop    rax
     12830a5:	c3                   	ret
     12830a6:	55                   	push   rbp
     12830a7:	41 57                	push   r15
     12830a9:	41 56                	push   r14
     12830ab:	41 55                	push   r13
     12830ad:	41 54                	push   r12
     12830af:	53                   	push   rbx
     12830b0:	48 81 ec 28 07 00 00 	sub    rsp,0x728
     12830b7:	49 89 d6             	mov    r14,rdx
     12830ba:	49 89 f7             	mov    r15,rsi
     12830bd:	48 89 fb             	mov    rbx,rdi

### 0x1288fd3 from 0x1288fc2..0x1288fd8
     1288fb7:	c3                   	ret
     1288fb8:	e8 f3 6a 56 00       	call   17efab0 <__stack_chk_fail@plt>
     1288fbd:	cc                   	int3
     1288fbe:	6a 16                	push   0x16
     1288fc0:	58                   	pop    rax
     1288fc1:	c3                   	ret
     1288fc2:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1288fc5:	80 7f 78 00          	cmp    BYTE PTR [rdi+0x78],0x0
     1288fc9:	74 04                	je     1288fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xce553>
     1288fcb:	ff 47 7c             	inc    DWORD PTR [rdi+0x7c]
     1288fce:	c3                   	ret
     1288fcf:	48 83 c7 20          	add    rdi,0x20
     1288fd3:	e9 d0 fa 89 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1288fd8:	41 57                	push   r15
     1288fda:	41 56                	push   r14
     1288fdc:	41 54                	push   r12
     1288fde:	53                   	push   rbx
     1288fdf:	48 81 ec c8 06 00 00 	sub    rsp,0x6c8
     1288fe6:	49 89 d6             	mov    r14,rdx
     1288fe9:	49 89 f7             	mov    r15,rsi
     1288fec:	48 89 fb             	mov    rbx,rdi
     1288fef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1288ff6:	00 00 
     1288ff8:	48 89 84 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rax
     1288fff:	00 
     1289000:	c6 46 78 01          	mov    BYTE PTR [rsi+0x78],0x1

### 0x12ca217 from 0x12c9cba..0x12ca49d
     12ca1da:	e8 d9 02 00 00       	call   12ca4b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10fa3c>
     12ca1df:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
     12ca1e4:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12ca1e9:	48 89 ee             	mov    rsi,rbp
     12ca1ec:	e8 15 03 00 00       	call   12ca506 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10fa8a>
     12ca1f1:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     12ca1f6:	e8 cb 04 00 00       	call   12ca6c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10fc4a>
     12ca1fb:	eb 1f                	jmp    12ca21c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10f7a0>
     12ca1fd:	48 8d bd a8 04 00 00 	lea    rdi,[rbp+0x4a8]
     12ca204:	e8 af 02 00 00       	call   12ca4b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10fa3c>
     12ca209:	c6 85 f9 04 00 00 00 	mov    BYTE PTR [rbp+0x4f9],0x0
     12ca210:	48 8d bd 40 04 00 00 	lea    rdi,[rbp+0x440]
     12ca217:	e8 8c e8 85 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12ca21c:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     12ca221:	e8 48 89 da ff       	call   1072b6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x239f84>
     12ca226:	4c 8b bd a8 04 00 00 	mov    r15,QWORD PTR [rbp+0x4a8]
     12ca22d:	4c 8b a5 b0 04 00 00 	mov    r12,QWORD PTR [rbp+0x4b0]
     12ca234:	4d 39 e7             	cmp    r15,r12
     12ca237:	0f 84 a9 01 00 00    	je     12ca3e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10f96a>
     12ca23d:	31 db                	xor    ebx,ebx
     12ca23f:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     12ca242:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12ca245:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12ca248:	49 89 c6             	mov    r14,rax
     12ca24b:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     12ca24e:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x12ca41f from 0x12c9cba..0x12ca49d
     12ca3f6:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     12ca3fd:	00 
     12ca3fe:	0f 85 94 00 00 00    	jne    12ca498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10fa1c>
     12ca404:	48 81 c5 40 04 00 00 	add    rbp,0x440
     12ca40b:	48 89 ef             	mov    rdi,rbp
     12ca40e:	48 81 c4 28 01 00 00 	add    rsp,0x128
     12ca415:	5b                   	pop    rbx
     12ca416:	41 5c                	pop    r12
     12ca418:	41 5d                	pop    r13
     12ca41a:	41 5e                	pop    r14
     12ca41c:	41 5f                	pop    r15
     12ca41e:	5d                   	pop    rbp
     12ca41f:	e9 84 e6 85 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12ca424:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12ca42b:	00 00 
     12ca42d:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     12ca434:	00 
     12ca435:	75 61                	jne    12ca498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10fa1c>
     12ca437:	e8 a3 12 7b ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
     12ca43c:	eb 28                	jmp    12ca466 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10f9ea>
     12ca43e:	48 89 c3             	mov    rbx,rax
     12ca441:	eb 30                	jmp    12ca473 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10f9f7>
     12ca443:	eb 0f                	jmp    12ca454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10f9d8>
     12ca445:	48 89 c3             	mov    rbx,rax
     12ca448:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     12ca44d:	e8 28 ed bb ff       	call   e8917a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50590>

### 0x12cf16e from 0x12cd240..0x12cf4c0
     12cf140:	00 
     12cf141:	48 89 ef             	mov    rdi,rbp
     12cf144:	48 89 de             	mov    rsi,rbx
     12cf147:	e8 d0 a6 7e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     12cf14c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     12cf150:	e8 31 f3 7c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cf155:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     12cf15c:	00 
     12cf15d:	e8 90 90 89 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     12cf162:	eb 0f                	jmp    12cf173 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1146f7>
     12cf164:	48 81 c5 98 00 00 00 	add    rbp,0x98
     12cf16b:	48 89 ef             	mov    rdi,rbp
     12cf16e:	e8 35 99 85 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12cf173:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     12cf17a:	00 
     12cf17b:	e8 10 ed 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12cf180:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     12cf187:	00 
     12cf188:	e8 af 90 89 ff       	call   b6823c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb51dc>
     12cf18d:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12cf192:	e8 ef f2 7c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cf197:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     12cf19c:	e8 e5 f2 7c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cf1a1:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     12cf1a8:	00 00 
     12cf1aa:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1

### 0x12dd410 from 0x12dd404..0x12dd41f
     12dd3eb:	00 
     12dd3ec:	75 08                	jne    12dd3f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12297a>
     12dd3ee:	4c 89 f7             	mov    rdi,r14
     12dd3f1:	e8 da 28 79 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     12dd3f6:	e8 b5 26 51 00       	call   17efab0 <__stack_chk_fail@plt>
     12dd3fb:	cc                   	int3
     12dd3fc:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     12dd3ff:	e9 9a 03 00 00       	jmp    12dd79e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x122d22>
     12dd404:	50                   	push   rax
     12dd405:	b8 a8 00 00 00       	mov    eax,0xa8
     12dd40a:	48 03 07             	add    rax,QWORD PTR [rdi]
     12dd40d:	48 89 c7             	mov    rdi,rax
     12dd410:	e8 93 b6 84 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12dd415:	58                   	pop    rax
     12dd416:	c3                   	ret
     12dd417:	48 89 c7             	mov    rdi,rax
     12dd41a:	e8 86 c6 79 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12dd41f:	cc                   	int3
     12dd420:	53                   	push   rbx
     12dd421:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     12dd424:	48 89 37             	mov    QWORD PTR [rdi],rsi
     12dd427:	48 85 db             	test   rbx,rbx
     12dd42a:	74 11                	je     12dd43d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1229c1>
     12dd42c:	48 89 df             	mov    rdi,rbx
     12dd42f:	e8 b8 ca 06 00       	call   1349eec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f470>
     12dd434:	48 89 df             	mov    rdi,rbx

### 0x12df9a2 from 0x12df95e..0x12df9bd
     12df979:	4c 8d b3 a8 00 00 00 	lea    r14,[rbx+0xa8]
     12df980:	4c 89 f7             	mov    rdi,r14
     12df983:	e8 b6 a5 4f 00       	call   17d9f3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d5f>
     12df988:	84 c0                	test   al,al
     12df98a:	74 1b                	je     12df9a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124f2b>
     12df98c:	4c 89 f7             	mov    rdi,r14
     12df98f:	eb 0a                	jmp    12df99b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124f1f>
     12df991:	48 81 c3 a8 00 00 00 	add    rbx,0xa8
     12df998:	48 89 df             	mov    rdi,rbx
     12df99b:	48 83 c4 08          	add    rsp,0x8
     12df99f:	5b                   	pop    rbx
     12df9a0:	41 5e                	pop    r14
     12df9a2:	e9 01 91 84 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12df9a7:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
     12df9ae:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     12df9b1:	48 83 c4 08          	add    rsp,0x8
     12df9b5:	5b                   	pop    rbx
     12df9b6:	41 5e                	pop    r14
     12df9b8:	e9 b3 a6 06 00       	jmp    134a070 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f5f4>
     12df9bd:	cc                   	int3
     12df9be:	31 f6                	xor    esi,esi
     12df9c0:	e9 4f 32 3d 00       	jmp    16b2c14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66d80>
     12df9c5:	41 57                	push   r15
     12df9c7:	41 56                	push   r14
     12df9c9:	53                   	push   rbx
     12df9ca:	48 83 ec 30          	sub    rsp,0x30

### 0x12e3cb9 from 0x12e3c6a..0x12e3cbe
     12e3c7b:	48 8d 35 b6 1c 71 00 	lea    rsi,[rip+0x711cb6]        # 19f5938 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f7>
     12e3c82:	e8 7f 67 3e 00       	call   16ca406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e572>
     12e3c87:	c6 83 e8 00 00 00 00 	mov    BYTE PTR [rbx+0xe8],0x0
     12e3c8e:	80 bb e9 00 00 00 00 	cmp    BYTE PTR [rbx+0xe9],0x0
     12e3c95:	74 17                	je     12e3cae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x129232>
     12e3c97:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
     12e3c9e:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
     12e3ca2:	e8 b1 02 00 00       	call   12e3f58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1294dc>
     12e3ca7:	c6 83 e9 00 00 00 00 	mov    BYTE PTR [rbx+0xe9],0x0
     12e3cae:	48 81 c3 90 00 00 00 	add    rbx,0x90
     12e3cb5:	48 89 df             	mov    rdi,rbx
     12e3cb8:	5b                   	pop    rbx
     12e3cb9:	e9 ea 4d 84 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12e3cbe:	41 56                	push   r14
     12e3cc0:	53                   	push   rbx
     12e3cc1:	50                   	push   rax
     12e3cc2:	48 89 d3             	mov    rbx,rdx
     12e3cc5:	49 89 fe             	mov    r14,rdi
     12e3cc8:	48 83 c7 30          	add    rdi,0x30
     12e3ccc:	e8 35 67 3e 00       	call   16ca406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e572>
     12e3cd1:	49 89 9e 88 00 00 00 	mov    QWORD PTR [r14+0x88],rbx
     12e3cd8:	49 81 c6 90 00 00 00 	add    r14,0x90
     12e3cdf:	4c 89 f7             	mov    rdi,r14
     12e3ce2:	48 83 c4 08          	add    rsp,0x8
     12e3ce6:	5b                   	pop    rbx
     12e3ce7:	41 5e                	pop    r14

### 0x12e3ce9 from 0x12e3cbe..0x12e3cee
     12e3cc0:	53                   	push   rbx
     12e3cc1:	50                   	push   rax
     12e3cc2:	48 89 d3             	mov    rbx,rdx
     12e3cc5:	49 89 fe             	mov    r14,rdi
     12e3cc8:	48 83 c7 30          	add    rdi,0x30
     12e3ccc:	e8 35 67 3e 00       	call   16ca406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e572>
     12e3cd1:	49 89 9e 88 00 00 00 	mov    QWORD PTR [r14+0x88],rbx
     12e3cd8:	49 81 c6 90 00 00 00 	add    r14,0x90
     12e3cdf:	4c 89 f7             	mov    rdi,r14
     12e3ce2:	48 83 c4 08          	add    rsp,0x8
     12e3ce6:	5b                   	pop    rbx
     12e3ce7:	41 5e                	pop    r14
     12e3ce9:	e9 ba 4d 84 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12e3cee:	55                   	push   rbp
     12e3cef:	41 57                	push   r15
     12e3cf1:	41 56                	push   r14
     12e3cf3:	41 55                	push   r13
     12e3cf5:	41 54                	push   r12
     12e3cf7:	53                   	push   rbx
     12e3cf8:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     12e3cff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12e3d06:	00 00 
     12e3d08:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     12e3d0f:	00 
     12e3d10:	83 7e 38 00          	cmp    DWORD PTR [rsi+0x38],0x0
     12e3d14:	0f 84 7a 01 00 00    	je     12e3e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x129418>

### 0x12e524b from 0x12e51d0..0x12e5250
     12e5232:	41 5c                	pop    r12
     12e5234:	41 5d                	pop    r13
     12e5236:	41 5e                	pop    r14
     12e5238:	41 5f                	pop    r15
     12e523a:	c3                   	ret
     12e523b:	48 83 c3 20          	add    rbx,0x20
     12e523f:	48 89 df             	mov    rdi,rbx
     12e5242:	5b                   	pop    rbx
     12e5243:	41 5c                	pop    r12
     12e5245:	41 5d                	pop    r13
     12e5247:	41 5e                	pop    r14
     12e5249:	41 5f                	pop    r15
     12e524b:	e9 58 38 84 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12e5250:	55                   	push   rbp
     12e5251:	41 57                	push   r15
     12e5253:	41 56                	push   r14
     12e5255:	41 55                	push   r13
     12e5257:	41 54                	push   r12
     12e5259:	53                   	push   rbx
     12e525a:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     12e5261:	4c 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],r9
     12e5266:	4d 89 c5             	mov    r13,r8
     12e5269:	89 4c 24 0c          	mov    DWORD PTR [rsp+0xc],ecx
     12e526d:	49 89 d6             	mov    r14,rdx
     12e5270:	49 89 f7             	mov    r15,rsi
     12e5273:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi

### 0x12e6780 from 0x12e6646..0x12e682d
     12e6759:	41 8b 3f             	mov    edi,DWORD PTR [r15]
     12e675c:	e8 bf 50 79 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12e6761:	84 c0                	test   al,al
     12e6763:	75 0b                	jne    12e6770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12bcf4>
     12e6765:	4c 89 f7             	mov    rdi,r14
     12e6768:	4c 89 fe             	mov    rsi,r15
     12e676b:	e8 14 14 9c ff       	call   ca7b84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f4b24>
     12e6770:	48 83 c5 08          	add    rbp,0x8
     12e6774:	49 39 ed             	cmp    r13,rbp
     12e6777:	75 d0                	jne    12e6749 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12bccd>
     12e6779:	48 83 c3 20          	add    rbx,0x20
     12e677d:	48 89 df             	mov    rdi,rbx
     12e6780:	e8 23 23 84 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12e6785:	eb 6e                	jmp    12e67f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12bd79>
     12e6787:	48 89 df             	mov    rdi,rbx
     12e678a:	e8 b7 fb ff ff       	call   12e6346 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12b8ca>
     12e678f:	41 8b 2e             	mov    ebp,DWORD PTR [r14]
     12e6792:	48 8d 35 55 cb 06 ff 	lea    rsi,[rip+0xffffffffff06cb55]        # 3532ee <_ZTSSt12bad_any_cast@@Base-0x3ceda>
     12e6799:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     12e679e:	e8 db 32 79 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12e67a3:	48 83 c3 78          	add    rbx,0x78
     12e67a7:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
     12e67ac:	48 89 df             	mov    rdi,rbx
     12e67af:	89 ee                	mov    esi,ebp
     12e67b1:	e8 5a fc ff ff       	call   12e6410 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12b994>
     12e67b6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]

### 0x1303102 from 0x13030b6..0x130311e
     13030d8:	84 c0                	test   al,al
     13030da:	74 0e                	je     13030ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14866e>
     13030dc:	41 80 7e 40 00       	cmp    BYTE PTR [r14+0x40],0x0
     13030e1:	74 18                	je     13030fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14867f>
     13030e3:	41 c6 46 40 00       	mov    BYTE PTR [r14+0x40],0x0
     13030e8:	eb 11                	jmp    13030fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14867f>
     13030ea:	41 8a 47 10          	mov    al,BYTE PTR [r15+0x10]
     13030ee:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
     13030f2:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     13030f6:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
     13030fb:	49 83 c6 48          	add    r14,0x48
     13030ff:	4c 89 f7             	mov    rdi,r14
     1303102:	e8 a1 59 82 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1303107:	48 8d 43 08          	lea    rax,[rbx+0x8]
     130310b:	0f 57 c0             	xorps  xmm0,xmm0
     130310e:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     1303112:	48 89 03             	mov    QWORD PTR [rbx],rax
     1303115:	48 89 d8             	mov    rax,rbx
     1303118:	5b                   	pop    rbx
     1303119:	41 5e                	pop    r14
     130311b:	41 5f                	pop    r15
     130311d:	c3                   	ret
     130311e:	80 7f 40 00          	cmp    BYTE PTR [rdi+0x40],0x0
     1303122:	74 09                	je     130312d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1486b1>
     1303124:	48 8d 77 30          	lea    rsi,[rdi+0x30]
     1303128:	e9 03 00 00 00       	jmp    1303130 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1486b4>

### 0x1308969 from 0x13088e6..0x13089db
     1308939:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
     130893f:	74 1f                	je     1308960 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14dee4>
     1308941:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     1308946:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     130894b:	4c 89 f7             	mov    rdi,r14
     130894e:	e8 73 23 39 00       	call   169acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ee32>
     1308953:	41 f6 06 01          	test   BYTE PTR [r14],0x1
     1308957:	74 17                	je     1308970 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14def4>
     1308959:	4c 8b 44 24 18       	mov    r8,QWORD PTR [rsp+0x18]
     130895e:	eb 15                	jmp    1308975 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14def9>
     1308960:	bf e8 00 00 00       	mov    edi,0xe8
     1308965:	48 03 7b 40          	add    rdi,QWORD PTR [rbx+0x40]
     1308969:	e8 3a 01 82 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     130896e:	eb 28                	jmp    1308998 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14df1c>
     1308970:	4c 8d 44 24 09       	lea    r8,[rsp+0x9]
     1308975:	48 8d 35 00 96 14 ff 	lea    rsi,[rip+0xffffffffff149600]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     130897c:	48 8d 0d d6 21 07 ff 	lea    rcx,[rip+0xffffffffff0721d6]        # 37ab59 <_ZTSSt12bad_any_cast@@Base-0x1566f>
     1308983:	6a 02                	push   0x2
     1308985:	5f                   	pop    rdi
     1308986:	6a 1f                	push   0x1f
     1308988:	5a                   	pop    rdx
     1308989:	31 c0                	xor    eax,eax
     130898b:	e8 42 df 4c 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     1308990:	4c 89 f7             	mov    rdi,r14
     1308993:	e8 f8 54 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1308998:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]

### 0x130aa85 from 0x130aa7a..0x130aa8a
     130aa57:	ff 50 08             	call   QWORD PTR [rax+0x8]
     130aa5a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     130aa61:	00 00 
     130aa63:	48 3b 84 24 60 04 00 	cmp    rax,QWORD PTR [rsp+0x460]
     130aa6a:	00 
     130aa6b:	75 08                	jne    130aa75 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fff9>
     130aa6d:	48 89 df             	mov    rdi,rbx
     130aa70:	e8 5b 52 76 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     130aa75:	e8 36 50 4e 00       	call   17efab0 <__stack_chk_fail@plt>
     130aa7a:	b8 a8 00 00 00       	mov    eax,0xa8
     130aa7f:	48 03 07             	add    rax,QWORD PTR [rdi]
     130aa82:	48 89 c7             	mov    rdi,rax
     130aa85:	e9 1e e0 81 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     130aa8a:	41 56                	push   r14
     130aa8c:	53                   	push   rbx
     130aa8d:	50                   	push   rax
     130aa8e:	48 89 fb             	mov    rbx,rdi
     130aa91:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     130aa95:	4c 89 f7             	mov    rdi,r14
     130aa98:	e8 ad 00 00 00       	call   130ab4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1500ce>
     130aa9d:	49 81 c6 58 01 00 00 	add    r14,0x158
     130aaa4:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     130aaa8:	48 83 c4 08          	add    rsp,0x8
     130aaac:	5b                   	pop    rbx
     130aaad:	41 5e                	pop    r14
     130aaaf:	c3                   	ret

### 0x13186ef from 0x13186c4..0x13186f5
     13186cf:	ff c8                	dec    eax
     13186d1:	83 f8 fe             	cmp    eax,0xfffffffe
     13186d4:	0f 92 c0             	setb   al
     13186d7:	22 46 0c             	and    al,BYTE PTR [rsi+0xc]
     13186da:	8b 0a                	mov    ecx,DWORD PTR [rdx]
     13186dc:	ff c9                	dec    ecx
     13186de:	83 f9 fe             	cmp    ecx,0xfffffffe
     13186e1:	0f 92 c1             	setb   cl
     13186e4:	22 4a 0c             	and    cl,BYTE PTR [rdx+0xc]
     13186e7:	38 c8                	cmp    al,cl
     13186e9:	74 09                	je     13186f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15dc78>
     13186eb:	48 83 c7 08          	add    rdi,0x8
     13186ef:	e9 b4 03 81 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     13186f4:	c3                   	ret
     13186f5:	cc                   	int3
     13186f6:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     13186fa:	e9 01 00 00 00       	jmp    1318700 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15dc84>
     13186ff:	cc                   	int3
     1318700:	53                   	push   rbx
     1318701:	48 89 fb             	mov    rbx,rdi
     1318704:	48 85 ff             	test   rdi,rdi
     1318707:	74 09                	je     1318712 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15dc96>
     1318709:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131870d:	e8 74 5d 78 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1318712:	48 89 df             	mov    rdi,rbx
     1318715:	5b                   	pop    rbx

### 0x131968d from 0x1319680..0x131969c
     131966d:	48 89 df             	mov    rdi,rbx
     1319670:	e8 83 34 2a 00       	call   15bcaf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40207c>
     1319675:	48 89 df             	mov    rdi,rbx
     1319678:	5b                   	pop    rbx
     1319679:	e9 a2 48 4d 00       	jmp    17edf20 <_ZdlPv@plt>
     131967e:	5b                   	pop    rbx
     131967f:	c3                   	ret
     1319680:	50                   	push   rax
     1319681:	83 fe 01             	cmp    esi,0x1
     1319684:	77 0c                	ja     1319692 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ec16>
     1319686:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1319689:	48 83 c7 60          	add    rdi,0x60
     131968d:	e8 16 f4 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1319692:	58                   	pop    rax
     1319693:	c3                   	ret
     1319694:	48 89 c7             	mov    rdi,rax
     1319697:	e8 09 04 76 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     131969c:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     131969f:	e9 7c a6 02 00       	jmp    1343d20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1892a4>
     13196a4:	53                   	push   rbx
     13196a5:	48 89 fb             	mov    rbx,rdi
     13196a8:	48 8d 05 89 b2 54 00 	lea    rax,[rip+0x54b289]        # 1864938 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21020>
     13196af:	48 89 07             	mov    QWORD PTR [rdi],rax
     13196b2:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     13196b9:	48 83 a3 b0 00 00 00 	and    QWORD PTR [rbx+0xb0],0x0
     13196c0:	00 

### 0x131f240 from 0x131f232..0x131f246
     131f21c:	e9 6d 00 00 00       	jmp    131f28e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164812>
     131f221:	cc                   	int3
     131f222:	f6 47 18 08          	test   BYTE PTR [rdi+0x18],0x8
     131f226:	75 01                	jne    131f229 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1647ad>
     131f228:	c3                   	ret
     131f229:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     131f22c:	e9 5d 00 00 00       	jmp    131f28e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164812>
     131f231:	cc                   	int3
     131f232:	80 7f 30 00          	cmp    BYTE PTR [rdi+0x30],0x0
     131f236:	74 0d                	je     131f245 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1647c9>
     131f238:	c6 47 30 00          	mov    BYTE PTR [rdi+0x30],0x0
     131f23c:	48 83 c7 38          	add    rdi,0x38
     131f240:	e9 63 98 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     131f245:	c3                   	ret
     131f246:	f6 47 18 10          	test   BYTE PTR [rdi+0x18],0x10
     131f24a:	75 01                	jne    131f24d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1647d1>
     131f24c:	c3                   	ret
     131f24d:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     131f250:	e9 39 00 00 00       	jmp    131f28e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164812>
     131f255:	cc                   	int3
     131f256:	f6 47 18 20          	test   BYTE PTR [rdi+0x18],0x20
     131f25a:	75 01                	jne    131f25d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1647e1>
     131f25c:	c3                   	ret
     131f25d:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     131f260:	e9 29 00 00 00       	jmp    131f28e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164812>
     131f265:	cc                   	int3

### 0x131f2b0 from 0x131f28e..0x131f2b5
     131f28f:	48 89 fb             	mov    rbx,rdi
     131f292:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     131f295:	48 89 f7             	mov    rdi,rsi
     131f298:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     131f29e:	84 c0                	test   al,al
     131f2a0:	74 06                	je     131f2a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16482c>
     131f2a2:	c6 43 30 01          	mov    BYTE PTR [rbx+0x30],0x1
     131f2a6:	5b                   	pop    rbx
     131f2a7:	c3                   	ret
     131f2a8:	48 83 c3 38          	add    rbx,0x38
     131f2ac:	48 89 df             	mov    rdi,rbx
     131f2af:	5b                   	pop    rbx
     131f2b0:	e9 f3 97 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     131f2b5:	cc                   	int3
     131f2b6:	41 57                	push   r15
     131f2b8:	41 56                	push   r14
     131f2ba:	53                   	push   rbx
     131f2bb:	48 83 ec 50          	sub    rsp,0x50
     131f2bf:	48 89 f3             	mov    rbx,rsi
     131f2c2:	49 89 fe             	mov    r14,rdi
     131f2c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131f2cc:	00 00 
     131f2ce:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     131f2d3:	48 83 c3 38          	add    rbx,0x38
     131f2d7:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     131f2dc:	4c 89 ff             	mov    rdi,r15

### 0x131f3a0 from 0x131f386..0x131f3a5
     131f385:	cc                   	int3
     131f386:	53                   	push   rbx
     131f387:	48 89 fb             	mov    rbx,rdi
     131f38a:	48 83 c3 38          	add    rbx,0x38
     131f38e:	48 89 df             	mov    rdi,rbx
     131f391:	e8 a8 ab 4b 00       	call   17d9f3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d5f>
     131f396:	84 c0                	test   al,al
     131f398:	74 02                	je     131f39c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164920>
     131f39a:	5b                   	pop    rbx
     131f39b:	c3                   	ret
     131f39c:	48 89 df             	mov    rdi,rbx
     131f39f:	5b                   	pop    rbx
     131f3a0:	e9 03 97 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     131f3a5:	cc                   	int3
     131f3a6:	41 57                	push   r15
     131f3a8:	41 56                	push   r14
     131f3aa:	41 54                	push   r12
     131f3ac:	53                   	push   rbx
     131f3ad:	48 83 ec 78          	sub    rsp,0x78
     131f3b1:	49 89 fe             	mov    r14,rdi
     131f3b4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131f3bb:	00 00 
     131f3bd:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     131f3c2:	48 8d 5f 38          	lea    rbx,[rdi+0x38]
     131f3c6:	48 89 df             	mov    rdi,rbx
     131f3c9:	e8 70 ab 4b 00       	call   17d9f3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d5f>

### 0x131f3eb from 0x131f3a6..0x131f589
     131f3bd:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     131f3c2:	48 8d 5f 38          	lea    rbx,[rdi+0x38]
     131f3c6:	48 89 df             	mov    rdi,rbx
     131f3c9:	e8 70 ab 4b 00       	call   17d9f3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d5f>
     131f3ce:	84 c0                	test   al,al
     131f3d0:	0f 85 44 01 00 00    	jne    131f51a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164a9e>
     131f3d6:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     131f3da:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131f3dd:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     131f3e3:	48 85 c0             	test   rax,rax
     131f3e6:	74 08                	je     131f3f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164974>
     131f3e8:	48 89 df             	mov    rdi,rbx
     131f3eb:	e8 b8 96 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     131f3f0:	49 8d be e8 00 00 00 	lea    rdi,[r14+0xe8]
     131f3f7:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     131f3fb:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     131f400:	48 89 06             	mov    QWORD PTR [rsi],rax
     131f403:	4c 89 f2             	mov    rdx,r14
     131f406:	e8 01 24 99 ff       	call   cb180c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe7ac>
     131f40b:	4d 8b 66 08          	mov    r12,QWORD PTR [r14+0x8]
     131f40f:	49 8b 5e 10          	mov    rbx,QWORD PTR [r14+0x10]
     131f413:	48 85 db             	test   rbx,rbx
     131f416:	74 05                	je     131f41d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1649a1>
     131f418:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     131f41d:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     131f421:	4d 8b 7e 28          	mov    r15,QWORD PTR [r14+0x28]

### 0x131f983 from 0x131f97c..0x131f988
     131f952:	48 89 c3             	mov    rbx,rax
     131f955:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131f95a:	e8 89 ae 4b 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     131f95f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131f966:	00 00 
     131f968:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     131f96d:	75 08                	jne    131f977 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164efb>
     131f96f:	48 89 df             	mov    rdi,rbx
     131f972:	e8 59 03 75 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     131f977:	e8 34 01 4d 00       	call   17efab0 <__stack_chk_fail@plt>
     131f97c:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     131f97f:	48 83 c7 18          	add    rdi,0x18
     131f983:	e9 20 91 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     131f988:	41 56                	push   r14
     131f98a:	53                   	push   rbx
     131f98b:	50                   	push   rax
     131f98c:	48 89 fb             	mov    rbx,rdi
     131f98f:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
     131f993:	48 85 ff             	test   rdi,rdi
     131f996:	4c 8d 35 2b e1 6a 00 	lea    r14,[rip+0x6ae12b]        # 19cdac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x96710>
     131f99d:	49 0f 44 fe          	cmove  rdi,r14
     131f9a1:	e8 f9 d7 02 00       	call   134d19f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192723>
     131f9a6:	48 8b 53 30          	mov    rdx,QWORD PTR [rbx+0x30]
     131f9aa:	48 85 d2             	test   rdx,rdx
     131f9ad:	49 0f 44 d6          	cmove  rdx,r14
     131f9b1:	31 c9                	xor    ecx,ecx

### 0x1321b85 from 0x1321ac6..0x1321bd1
     1321b62:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1321b69:	00 00 
     1321b6b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1321b70:	75 5a                	jne    1321bcc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167150>
     1321b72:	48 83 c3 68          	add    rbx,0x68
     1321b76:	48 89 df             	mov    rdi,rbx
     1321b79:	48 83 c4 20          	add    rsp,0x20
     1321b7d:	5b                   	pop    rbx
     1321b7e:	41 5c                	pop    r12
     1321b80:	41 5e                	pop    r14
     1321b82:	41 5f                	pop    r15
     1321b84:	5d                   	pop    rbp
     1321b85:	e9 1e 6f 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1321b8a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1321b91:	00 00 
     1321b93:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1321b98:	75 32                	jne    1321bcc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167150>
     1321b9a:	48 83 c4 20          	add    rsp,0x20
     1321b9e:	5b                   	pop    rbx
     1321b9f:	41 5c                	pop    r12
     1321ba1:	41 5e                	pop    r14
     1321ba3:	41 5f                	pop    r15
     1321ba5:	5d                   	pop    rbp
     1321ba6:	c3                   	ret
     1321ba7:	48 89 c3             	mov    rbx,rax
     1321baa:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### 0x1324888 from 0x13247b0..0x13248b5
     1324866:	48 83 c4 78          	add    rsp,0x78
     132486a:	5b                   	pop    rbx
     132486b:	41 5e                	pop    r14
     132486d:	c3                   	ret
     132486e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1324875:	00 00 
     1324877:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     132487c:	75 32                	jne    13248b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169e34>
     132487e:	4c 89 f7             	mov    rdi,r14
     1324881:	48 83 c4 78          	add    rsp,0x78
     1324885:	5b                   	pop    rbx
     1324886:	41 5e                	pop    r14
     1324888:	e9 1b 42 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     132488d:	48 89 c3             	mov    rbx,rax
     1324890:	48 89 e7             	mov    rdi,rsp
     1324893:	e8 96 0a 3a 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1324898:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     132489f:	00 00 
     13248a1:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     13248a6:	75 08                	jne    13248b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169e34>
     13248a8:	48 89 df             	mov    rdi,rbx
     13248ab:	e8 20 b4 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13248b0:	e8 fb b1 4c 00       	call   17efab0 <__stack_chk_fail@plt>
     13248b5:	cc                   	int3
     13248b6:	55                   	push   rbp
     13248b7:	41 57                	push   r15

### 0x132490f from 0x13248b6..0x132491d
     13248ef:	eb 13                	jmp    1324904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169e88>
     13248f1:	41 f7 d6             	not    r14d
     13248f4:	44 21 f5             	and    ebp,r14d
     13248f7:	40 f6 c5 01          	test   bpl,0x1
     13248fb:	74 17                	je     1324914 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169e98>
     13248fd:	48 81 c3 c8 00 00 00 	add    rbx,0xc8
     1324904:	48 89 df             	mov    rdi,rbx
     1324907:	5b                   	pop    rbx
     1324908:	41 5c                	pop    r12
     132490a:	41 5e                	pop    r14
     132490c:	41 5f                	pop    r15
     132490e:	5d                   	pop    rbp
     132490f:	e9 94 41 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1324914:	5b                   	pop    rbx
     1324915:	41 5c                	pop    r12
     1324917:	41 5e                	pop    r14
     1324919:	41 5f                	pop    r15
     132491b:	5d                   	pop    rbp
     132491c:	c3                   	ret
     132491d:	cc                   	int3
     132491e:	53                   	push   rbx
     132491f:	48 89 fb             	mov    rbx,rdi
     1324922:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
     1324925:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1324928:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     132492e:	84 c0                	test   al,al

### 0x1324946 from 0x132491e..0x132494b
     132491f:	48 89 fb             	mov    rbx,rdi
     1324922:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
     1324925:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1324928:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     132492e:	84 c0                	test   al,al
     1324930:	74 09                	je     132493b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169ebf>
     1324932:	c6 83 78 01 00 00 01 	mov    BYTE PTR [rbx+0x178],0x1
     1324939:	5b                   	pop    rbx
     132493a:	c3                   	ret
     132493b:	48 81 c3 20 01 00 00 	add    rbx,0x120
     1324942:	48 89 df             	mov    rdi,rbx
     1324945:	5b                   	pop    rbx
     1324946:	e9 5d 41 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     132494b:	cc                   	int3
     132494c:	53                   	push   rbx
     132494d:	80 7f 55 00          	cmp    BYTE PTR [rdi+0x55],0x0
     1324951:	74 1a                	je     132496d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169ef1>
     1324953:	48 89 fb             	mov    rbx,rdi
     1324956:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
     1324959:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     132495c:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     1324962:	84 c0                	test   al,al
     1324964:	74 09                	je     132496f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169ef3>
     1324966:	c6 83 78 01 00 00 01 	mov    BYTE PTR [rbx+0x178],0x1
     132496d:	5b                   	pop    rbx
     132496e:	c3                   	ret

### 0x132497a from 0x132494c..0x132497f
     1324953:	48 89 fb             	mov    rbx,rdi
     1324956:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
     1324959:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     132495c:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     1324962:	84 c0                	test   al,al
     1324964:	74 09                	je     132496f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169ef3>
     1324966:	c6 83 78 01 00 00 01 	mov    BYTE PTR [rbx+0x178],0x1
     132496d:	5b                   	pop    rbx
     132496e:	c3                   	ret
     132496f:	48 81 c3 20 01 00 00 	add    rbx,0x120
     1324976:	48 89 df             	mov    rdi,rbx
     1324979:	5b                   	pop    rbx
     132497a:	e9 29 41 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     132497f:	cc                   	int3
     1324980:	80 bf 78 01 00 00 00 	cmp    BYTE PTR [rdi+0x178],0x0
     1324987:	74 13                	je     132499c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169f20>
     1324989:	c6 87 78 01 00 00 00 	mov    BYTE PTR [rdi+0x178],0x0
     1324990:	48 81 c7 20 01 00 00 	add    rdi,0x120
     1324997:	e9 0c 41 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     132499c:	c3                   	ret
     132499d:	cc                   	int3
     132499e:	53                   	push   rbx
     132499f:	48 89 fb             	mov    rbx,rdi
     13249a2:	48 8d 05 67 0e 54 00 	lea    rax,[rip+0x540e67]        # 1865810 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21ef8>
     13249a9:	48 89 07             	mov    QWORD PTR [rdi],rax
     13249ac:	48 81 c7 20 01 00 00 	add    rdi,0x120

### 0x1324997 from 0x1324980..0x132499d
     1324966:	c6 83 78 01 00 00 01 	mov    BYTE PTR [rbx+0x178],0x1
     132496d:	5b                   	pop    rbx
     132496e:	c3                   	ret
     132496f:	48 81 c3 20 01 00 00 	add    rbx,0x120
     1324976:	48 89 df             	mov    rdi,rbx
     1324979:	5b                   	pop    rbx
     132497a:	e9 29 41 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     132497f:	cc                   	int3
     1324980:	80 bf 78 01 00 00 00 	cmp    BYTE PTR [rdi+0x178],0x0
     1324987:	74 13                	je     132499c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169f20>
     1324989:	c6 87 78 01 00 00 00 	mov    BYTE PTR [rdi+0x178],0x0
     1324990:	48 81 c7 20 01 00 00 	add    rdi,0x120
     1324997:	e9 0c 41 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     132499c:	c3                   	ret
     132499d:	cc                   	int3
     132499e:	53                   	push   rbx
     132499f:	48 89 fb             	mov    rbx,rdi
     13249a2:	48 8d 05 67 0e 54 00 	lea    rax,[rip+0x540e67]        # 1865810 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21ef8>
     13249a9:	48 89 07             	mov    QWORD PTR [rdi],rax
     13249ac:	48 81 c7 20 01 00 00 	add    rdi,0x120
     13249b3:	e8 ae 54 4b 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     13249b8:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
     13249bf:	e8 a2 54 4b 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     13249c4:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
     13249cb:	e8 34 d5 98 ff       	call   cb1f04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feea4>
     13249d0:	48 8d 7b 20          	lea    rdi,[rbx+0x20]

### 0x1324c6f from 0x13249f6..0x1324d4c
     1324c3b:	4c 89 f7             	mov    rdi,r14
     1324c3e:	e8 af 35 84 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     1324c43:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     1324c48:	e8 d9 be 77 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1324c4d:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
     1324c54:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     1324c58:	49 89 06             	mov    QWORD PTR [r14],rax
     1324c5b:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     1324c60:	48 89 da             	mov    rdx,rbx
     1324c63:	e8 a4 cb 98 ff       	call   cb180c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe7ac>
     1324c68:	eb 0a                	jmp    1324c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a1f8>
     1324c6a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1324c6f:	e8 34 3e 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1324c74:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1324c79:	e8 be 35 84 ff       	call   b6823c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb51dc>
     1324c7e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1324c83:	e8 9e be 77 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1324c88:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1324c8f:	00 00 
     1324c91:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
     1324c98:	00 
     1324c99:	0f 85 a8 00 00 00    	jne    1324d47 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a2cb>
     1324c9f:	48 81 c4 98 00 00 00 	add    rsp,0x98
     1324ca6:	5b                   	pop    rbx
     1324ca7:	41 5c                	pop    r12
     1324ca9:	41 5d                	pop    r13

### 0x1324da7 from 0x1324d4c..0x1324deb
     1324d7e:	75 38                	jne    1324db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a33c>
     1324d80:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
     1324d85:	66 48 0f 7e c0       	movq   rax,xmm0
     1324d8a:	48 85 c0             	test   rax,rax
     1324d8d:	74 14                	je     1324da3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a327>
     1324d8f:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     1324d92:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     1324d96:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1324d9b:	6a 0f                	push   0xf
     1324d9d:	59                   	pop    rcx
     1324d9e:	e8 b7 75 35 00       	call   167c35a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x304c6>
     1324da3:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     1324da7:	e8 fc 3c 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1324dac:	48 83 c3 30          	add    rbx,0x30
     1324db0:	48 89 df             	mov    rdi,rbx
     1324db3:	e8 6e 9b 78 ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
     1324db8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1324dbf:	00 00 
     1324dc1:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     1324dc6:	75 16                	jne    1324dde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a362>
     1324dc8:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
     1324dcd:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     1324dd4:	48 83 c4 50          	add    rsp,0x50
     1324dd8:	5b                   	pop    rbx
     1324dd9:	e9 a8 96 77 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     1324dde:	e8 cd ac 4c 00       	call   17efab0 <__stack_chk_fail@plt>

### 0x1324e66 from 0x1324e4a..0x1324e88
     1324e3c:	e8 ab ff ff ff       	call   1324dec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a370>
     1324e41:	48 89 df             	mov    rdi,rbx
     1324e44:	5b                   	pop    rbx
     1324e45:	e9 d6 90 4c 00       	jmp    17edf20 <_ZdlPv@plt>
     1324e4a:	48 83 ec 18          	sub    rsp,0x18
     1324e4e:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
     1324e51:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1324e55:	0f 57 c0             	xorps  xmm0,xmm0
     1324e58:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
     1324e5b:	b8 98 00 00 00       	mov    eax,0x98
     1324e60:	48 03 07             	add    rax,QWORD PTR [rdi]
     1324e63:	48 89 c7             	mov    rdi,rax
     1324e66:	e8 3d 3c 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1324e6b:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
     1324e70:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     1324e77:	48 83 c4 18          	add    rsp,0x18
     1324e7b:	e9 06 96 77 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     1324e80:	48 89 c7             	mov    rdi,rax
     1324e83:	e8 1d 4c 75 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1324e88:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1324e8b:	6a 01                	push   0x1
     1324e8d:	5e                   	pop    rsi
     1324e8e:	e9 01 00 00 00       	jmp    1324e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a418>
     1324e93:	cc                   	int3
     1324e94:	41 57                	push   r15
     1324e96:	41 56                	push   r14

### 0x1325130 from 0x1324f28..0x13253e5
     13250f3:	74 0e                	je     1325103 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a687>
     13250f5:	e8 76 24 79 ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
     13250fa:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
     1325101:	eb 23                	jmp    1325126 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6aa>
     1325103:	4c 8b b3 a0 00 00 00 	mov    r14,QWORD PTR [rbx+0xa0]
     132510a:	4c 8b bb a8 00 00 00 	mov    r15,QWORD PTR [rbx+0xa8]
     1325111:	e8 5a 24 79 ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
     1325116:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
     132511d:	4d 39 fe             	cmp    r14,r15
     1325120:	0f 84 cb 01 00 00    	je     13252f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a875>
     1325126:	48 81 c3 10 01 00 00 	add    rbx,0x110
     132512d:	48 89 df             	mov    rdi,rbx
     1325130:	e8 73 39 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1325135:	e9 b7 01 00 00       	jmp    13252f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a875>
     132513a:	48 39 f8             	cmp    rax,rdi
     132513d:	72 08                	jb     1325147 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6cb>
     132513f:	31 d2                	xor    edx,edx
     1325141:	48 f7 f7             	div    rdi
     1325144:	48 89 d0             	mov    rax,rdx
     1325147:	49 8b 17             	mov    rdx,QWORD PTR [r15]
     132514a:	48 89 34 c2          	mov    QWORD PTR [rdx+rax*8],rsi
     132514e:	0f 57 c0             	xorps  xmm0,xmm0
     1325151:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     1325154:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1325159:	4c 89 f6             	mov    rsi,r14
     132515c:	e8 4b 40 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>

### 0x1325df7 from 0x1325b42..0x1325e87
     1325dbc:	0f 85 04 ff ff ff    	jne    1325cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b24a>
     1325dc2:	eb d9                	jmp    1325d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b321>
     1325dc4:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
     1325dcb:	48 2b 83 a0 00 00 00 	sub    rax,QWORD PTR [rbx+0xa0]
     1325dd2:	48 c1 f8 04          	sar    rax,0x4
     1325dd6:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1325ddb:	73 09                	jae    1325de6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b36a>
     1325ddd:	80 bb fa 00 00 00 00 	cmp    BYTE PTR [rbx+0xfa],0x0
     1325de4:	74 3b                	je     1325e21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b3a5>
     1325de6:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
     1325ded:	48 81 c3 10 01 00 00 	add    rbx,0x110
     1325df4:	48 89 df             	mov    rdi,rbx
     1325df7:	e8 ac 2c 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1325dfc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1325e03:	00 00 
     1325e05:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     1325e0c:	00 
     1325e0d:	75 73                	jne    1325e82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b406>
     1325e0f:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     1325e16:	5b                   	pop    rbx
     1325e17:	41 5c                	pop    r12
     1325e19:	41 5d                	pop    r13
     1325e1b:	41 5e                	pop    r14
     1325e1d:	41 5f                	pop    r15
     1325e1f:	5d                   	pop    rbp
     1325e20:	c3                   	ret

### 0x1326007 from 0x1325f88..0x1326116
     1325fdf:	80 bb f8 00 00 00 00 	cmp    BYTE PTR [rbx+0xf8],0x0
     1325fe6:	74 cb                	je     1325fb3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b537>
     1325fe8:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
     1325fef:	48 81 c3 10 01 00 00 	add    rbx,0x110
     1325ff6:	48 89 df             	mov    rdi,rbx
     1325ff9:	48 83 c4 08          	add    rsp,0x8
     1325ffd:	5b                   	pop    rbx
     1325ffe:	41 5c                	pop    r12
     1326000:	41 5d                	pop    r13
     1326002:	41 5e                	pop    r14
     1326004:	41 5f                	pop    r15
     1326006:	5d                   	pop    rbp
     1326007:	e9 9c 2a 80 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     132600c:	4c 8d a3 b8 00 00 00 	lea    r12,[rbx+0xb8]
     1326013:	4d 39 ec             	cmp    r12,r13
     1326016:	0f 84 d5 00 00 00    	je     13260f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b675>
     132601c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1326020:	49 8b 6d 08          	mov    rbp,QWORD PTR [r13+0x8]
     1326024:	49 89 ed             	mov    r13,rbp
     1326027:	49 29 fd             	sub    r13,rdi
     132602a:	49 c1 fd 04          	sar    r13,0x4
     132602e:	48 8b 93 b8 00 00 00 	mov    rdx,QWORD PTR [rbx+0xb8]
     1326035:	48 8b 83 c8 00 00 00 	mov    rax,QWORD PTR [rbx+0xc8]
     132603c:	48 29 d0             	sub    rax,rdx
     132603f:	48 c1 f8 04          	sar    rax,0x4
     1326043:	4c 39 e8             	cmp    rax,r13

### 0x1338cea from 0x1338c8e..0x1338d91
     1338cb4:	48 85 db             	test   rbx,rbx
     1338cb7:	74 0a                	je     1338cc3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e247>
     1338cb9:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     1338cbe:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     1338cc3:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1338cc7:	49 8d 86 68 06 00 00 	lea    rax,[r14+0x668]
     1338cce:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1338cd3:	41 c6 86 68 06 00 00 	mov    BYTE PTR [r14+0x668],0x1
     1338cda:	01 
     1338cdb:	41 c6 86 b8 00 00 00 	mov    BYTE PTR [r14+0xb8],0x0
     1338ce2:	00 
     1338ce3:	49 8d be c0 00 00 00 	lea    rdi,[r14+0xc0]
     1338cea:	e8 b9 fd 7e ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1338cef:	48 85 db             	test   rbx,rbx
     1338cf2:	74 46                	je     1338d3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e2be>
     1338cf4:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1338cf8:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     1338cfc:	74 3c                	je     1338d3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e2be>
     1338cfe:	41 c6 86 68 06 00 00 	mov    BYTE PTR [r14+0x668],0x0
     1338d05:	00 
     1338d06:	41 80 be 69 06 00 00 	cmp    BYTE PTR [r14+0x669],0x0
     1338d0d:	00 
     1338d0e:	74 2a                	je     1338d3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e2be>
     1338d10:	41 c6 86 69 06 00 00 	mov    BYTE PTR [r14+0x669],0x0
     1338d17:	00 
     1338d18:	49 8b be 30 01 00 00 	mov    rdi,QWORD PTR [r14+0x130]

### 0x1340fa0 from 0x1340f86..0x1340fa5
     1340f85:	c3                   	ret
     1340f86:	53                   	push   rbx
     1340f87:	48 89 fb             	mov    rbx,rdi
     1340f8a:	48 83 c3 28          	add    rbx,0x28
     1340f8e:	48 89 df             	mov    rdi,rbx
     1340f91:	e8 a8 8f 49 00       	call   17d9f3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d5f>
     1340f96:	84 c0                	test   al,al
     1340f98:	74 02                	je     1340f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186520>
     1340f9a:	5b                   	pop    rbx
     1340f9b:	c3                   	ret
     1340f9c:	48 89 df             	mov    rdi,rbx
     1340f9f:	5b                   	pop    rbx
     1340fa0:	e9 03 7b 7e ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1340fa5:	cc                   	int3
     1340fa6:	53                   	push   rbx
     1340fa7:	48 89 fb             	mov    rbx,rdi
     1340faa:	48 8d 05 c7 51 52 00 	lea    rax,[rip+0x5251c7]        # 1866178 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22860>
     1340fb1:	48 89 07             	mov    QWORD PTR [rdi],rax
     1340fb4:	48 81 c7 80 00 00 00 	add    rdi,0x80
     1340fbb:	e8 44 0f 97 ff       	call   cb1f04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feea4>
     1340fc0:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     1340fc4:	e8 9d 8e 49 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1340fc9:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     1340fcd:	e8 b4 d4 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1340fd2:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1340fd6:	5b                   	pop    rbx

### 0x1343270 from 0x1343258..0x1343285
     1343244:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     1343249:	75 08                	jne    1343253 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1887d7>
     134324b:	48 89 df             	mov    rdi,rbx
     134324e:	e8 7d ca 72 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1343253:	e8 58 c8 4a 00       	call   17efab0 <__stack_chk_fail@plt>
     1343258:	48 83 bf 90 02 00 00 	cmp    QWORD PTR [rdi+0x290],0x0
     134325f:	00 
     1343260:	74 01                	je     1343263 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1887e7>
     1343262:	c3                   	ret
     1343263:	80 bf 4a 02 00 00 00 	cmp    BYTE PTR [rdi+0x24a],0x0
     134326a:	74 09                	je     1343275 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1887f9>
     134326c:	48 83 c7 68          	add    rdi,0x68
     1343270:	e9 33 58 7e ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1343275:	c6 87 4a 02 00 00 01 	mov    BYTE PTR [rdi+0x24a],0x1
     134327c:	48 83 c7 10          	add    rdi,0x10
     1343280:	e9 23 58 7e ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1343285:	cc                   	int3
     1343286:	8b 86 80 02 00 00    	mov    eax,DWORD PTR [rsi+0x280]
     134328c:	f7 d0                	not    eax
     134328e:	21 d0                	and    eax,edx
     1343290:	a8 01                	test   al,0x1
     1343292:	0f 85 60 f6 ff ff    	jne    13428f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187e7c>
     1343298:	c3                   	ret
     1343299:	cc                   	int3
     134329a:	41 57                	push   r15
     134329c:	41 56                	push   r14

### 0x1343280 from 0x1343258..0x1343285
     134324e:	e8 7d ca 72 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1343253:	e8 58 c8 4a 00       	call   17efab0 <__stack_chk_fail@plt>
     1343258:	48 83 bf 90 02 00 00 	cmp    QWORD PTR [rdi+0x290],0x0
     134325f:	00 
     1343260:	74 01                	je     1343263 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1887e7>
     1343262:	c3                   	ret
     1343263:	80 bf 4a 02 00 00 00 	cmp    BYTE PTR [rdi+0x24a],0x0
     134326a:	74 09                	je     1343275 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1887f9>
     134326c:	48 83 c7 68          	add    rdi,0x68
     1343270:	e9 33 58 7e ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1343275:	c6 87 4a 02 00 00 01 	mov    BYTE PTR [rdi+0x24a],0x1
     134327c:	48 83 c7 10          	add    rdi,0x10
     1343280:	e9 23 58 7e ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1343285:	cc                   	int3
     1343286:	8b 86 80 02 00 00    	mov    eax,DWORD PTR [rsi+0x280]
     134328c:	f7 d0                	not    eax
     134328e:	21 d0                	and    eax,edx
     1343290:	a8 01                	test   al,0x1
     1343292:	0f 85 60 f6 ff ff    	jne    13428f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187e7c>
     1343298:	c3                   	ret
     1343299:	cc                   	int3
     134329a:	41 57                	push   r15
     134329c:	41 56                	push   r14
     134329e:	53                   	push   rbx
     134329f:	48 81 ec 80 00 00 00 	sub    rsp,0x80
     13432a6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x13451e2 from 0x1344ca8..0x1345268
     13451b0:	74 1d                	je     13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
     13451b2:	49 83 c6 08          	add    r14,0x8
     13451b6:	48 8d 75 08          	lea    rsi,[rbp+0x8]
     13451ba:	4c 89 f7             	mov    rdi,r14
     13451bd:	e8 5a 46 77 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     13451c2:	48 83 c5 18          	add    rbp,0x18
     13451c6:	49 83 c6 18          	add    r14,0x18
     13451ca:	48 39 dd             	cmp    rbp,rbx
     13451cd:	75 e7                	jne    13451b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a73a>
     13451cf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     13451d4:	c6 87 b8 00 00 00 00 	mov    BYTE PTR [rdi+0xb8],0x0
     13451db:	48 81 c7 c0 00 00 00 	add    rdi,0xc0
     13451e2:	e8 c1 38 7e ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     13451e7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     13451ec:	e8 95 92 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13451f1:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     13451f6:	e8 4b 39 ff ff       	call   1338b46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e0ca>
     13451fb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1345202:	00 00 
     1345204:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
     134520b:	00 
     134520c:	75 55                	jne    1345263 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a7e7>
     134520e:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
     1345215:	5b                   	pop    rbx
     1345216:	41 5c                	pop    r12
     1345218:	41 5d                	pop    r13

### 0x1346331 from 0x134628a..0x1346391
     13462fd:	66 c7 83 34 02 00 00 	mov    WORD PTR [rbx+0x234],0x101
     1346304:	01 01 
     1346306:	eb 2e                	jmp    1346336 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b8ba>
     1346308:	b1 01                	mov    cl,0x1
     134630a:	31 c0                	xor    eax,eax
     134630c:	88 8b b8 00 00 00    	mov    BYTE PTR [rbx+0xb8],cl
     1346312:	88 83 37 02 00 00    	mov    BYTE PTR [rbx+0x237],al
     1346318:	88 83 38 02 00 00    	mov    BYTE PTR [rbx+0x238],al
     134631e:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     1346322:	e8 4d 29 ff ff       	call   1338c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e1f8>
     1346327:	48 81 c3 c0 00 00 00 	add    rbx,0xc0
     134632e:	48 89 df             	mov    rdi,rbx
     1346331:	e8 72 27 7e ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1346336:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     134633b:	e8 e6 a7 75 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1346340:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1346347:	00 00 
     1346349:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     134634e:	75 3c                	jne    134638c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b910>
     1346350:	48 83 c4 20          	add    rsp,0x20
     1346354:	5b                   	pop    rbx
     1346355:	41 5c                	pop    r12
     1346357:	41 5e                	pop    r14
     1346359:	41 5f                	pop    r15
     134635b:	5d                   	pop    rbp
     134635c:	c3                   	ret

### 0x134676e from 0x1346766..0x134677d
     1346744:	48 8d 0d 35 66 09 ff 	lea    rcx,[rip+0xffffffffff096635]        # 3dcd80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x27cf>
     134674b:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
     134674f:	48 01 c8             	add    rax,rcx
     1346752:	c3                   	ret
     1346753:	48 8d 05 0d 9f fe fe 	lea    rax,[rip+0xfffffffffefe9f0d]        # 330667 <_ZTSSt12bad_any_cast@@Base-0x5fb61>
     134675a:	6a 01                	push   0x1
     134675c:	5a                   	pop    rdx
     134675d:	c3                   	ret
     134675e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1346761:	e9 00 00 00 00       	jmp    1346766 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18bcea>
     1346766:	50                   	push   rax
     1346767:	48 81 c7 f8 01 00 00 	add    rdi,0x1f8
     134676e:	e8 35 23 7e ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1346773:	58                   	pop    rax
     1346774:	c3                   	ret
     1346775:	48 89 c7             	mov    rdi,rax
     1346778:	e8 28 33 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     134677d:	cc                   	int3
     134677e:	53                   	push   rbx
     134677f:	48 89 fb             	mov    rbx,rdi
     1346782:	6a 10                	push   0x10
     1346784:	5f                   	pop    rdi
     1346785:	e8 76 77 4a 00       	call   17edf00 <_Znwm@plt>
     134678a:	48 8d 0d 07 03 52 00 	lea    rcx,[rip+0x520307]        # 1866a98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23180>
     1346791:	48 89 08             	mov    QWORD PTR [rax],rcx
     1346794:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]

### 0x13467bf from 0x13467b2..0x13467ce
     134679c:	5b                   	pop    rbx
     134679d:	c3                   	ret
     134679e:	48 8d 05 f3 02 52 00 	lea    rax,[rip+0x5202f3]        # 1866a98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23180>
     13467a5:	48 89 06             	mov    QWORD PTR [rsi],rax
     13467a8:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     13467ac:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     13467b0:	c3                   	ret
     13467b1:	cc                   	int3
     13467b2:	50                   	push   rax
     13467b3:	b8 f8 01 00 00       	mov    eax,0x1f8
     13467b8:	48 03 47 08          	add    rax,QWORD PTR [rdi+0x8]
     13467bc:	48 89 c7             	mov    rdi,rax
     13467bf:	e8 e4 22 7e ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     13467c4:	58                   	pop    rax
     13467c5:	c3                   	ret
     13467c6:	48 89 c7             	mov    rdi,rax
     13467c9:	e8 d7 32 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     13467ce:	53                   	push   rbx
     13467cf:	48 89 fb             	mov    rbx,rdi
     13467d2:	6a 10                	push   0x10
     13467d4:	5f                   	pop    rdi
     13467d5:	e8 26 77 4a 00       	call   17edf00 <_Znwm@plt>
     13467da:	48 8d 0d 6f 02 52 00 	lea    rcx,[rip+0x52026f]        # 1866a50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23138>
     13467e1:	48 89 08             	mov    QWORD PTR [rax],rcx
     13467e4:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     13467e8:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx

### 0x134680f from 0x1346802..0x134681e
     13467ec:	5b                   	pop    rbx
     13467ed:	c3                   	ret
     13467ee:	48 8d 05 5b 02 52 00 	lea    rax,[rip+0x52025b]        # 1866a50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23138>
     13467f5:	48 89 06             	mov    QWORD PTR [rsi],rax
     13467f8:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     13467fc:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     1346800:	c3                   	ret
     1346801:	cc                   	int3
     1346802:	50                   	push   rax
     1346803:	b8 f8 01 00 00       	mov    eax,0x1f8
     1346808:	48 03 47 08          	add    rax,QWORD PTR [rdi+0x8]
     134680c:	48 89 c7             	mov    rdi,rax
     134680f:	e8 94 22 7e ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1346814:	58                   	pop    rax
     1346815:	c3                   	ret
     1346816:	48 89 c7             	mov    rdi,rax
     1346819:	e8 87 32 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     134681e:	53                   	push   rbx
     134681f:	48 89 fb             	mov    rbx,rdi
     1346822:	48 8d 05 9f 01 52 00 	lea    rax,[rip+0x52019f]        # 18669c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x230b0>
     1346829:	48 89 07             	mov    QWORD PTR [rdi],rax
     134682c:	48 81 c7 80 02 00 00 	add    rdi,0x280
     1346833:	e8 0e af 47 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     1346838:	48 8d bb 60 02 00 00 	lea    rdi,[rbx+0x260]
     134683f:	e8 4c 7a 8e ff       	call   c2e290 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b230>
     1346844:	48 8d bb 50 02 00 00 	lea    rdi,[rbx+0x250]

### 0x1346ef5 from 0x1346c2a..0x1347076
     1346ec7:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     1346ecc:	e8 b5 75 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1346ed1:	4d 85 ff             	test   r15,r15
     1346ed4:	0f 85 78 fd ff ff    	jne    1346c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18c1d6>
     1346eda:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     1346ede:	49 8b 7f 38          	mov    rdi,QWORD PTR [r15+0x38]
     1346ee2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1346ee5:	48 89 de             	mov    rsi,rbx
     1346ee8:	4c 89 f2             	mov    rdx,r14
     1346eeb:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1346eee:	49 83 c7 48          	add    r15,0x48
     1346ef2:	4c 89 ff             	mov    rdi,r15
     1346ef5:	e8 ae 1b 7e ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1346efa:	e9 e6 00 00 00       	jmp    1346fe5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18c569>
     1346eff:	49 83 c7 10          	add    r15,0x10
     1346f03:	4c 89 ff             	mov    rdi,r15
     1346f06:	e8 db b3 27 00       	call   15c22e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40786a>
     1346f0b:	49 89 c6             	mov    r14,rax
     1346f0e:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     1346f12:	48 89 de             	mov    rsi,rbx
     1346f15:	e8 38 c2 26 00       	call   15b3152 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f86d6>
     1346f1a:	89 c1                	mov    ecx,eax
     1346f1c:	b0 01                	mov    al,0x1
     1346f1e:	84 c9                	test   cl,cl
     1346f20:	0f 84 2e fd ff ff    	je     1346c54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18c1d8>
     1346f26:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]

### 0x13484eb from 0x13484e0..0x13484f0
     13484b9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     13484be:	e8 cd 59 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13484c3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13484ca:	00 00 
     13484cc:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     13484d1:	75 08                	jne    13484db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18da5f>
     13484d3:	48 89 df             	mov    rdi,rbx
     13484d6:	e8 f5 77 72 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13484db:	e8 d0 75 4a 00       	call   17efab0 <__stack_chk_fail@plt>
     13484e0:	b8 f8 01 00 00       	mov    eax,0x1f8
     13484e5:	48 03 07             	add    rax,QWORD PTR [rdi]
     13484e8:	48 89 c7             	mov    rdi,rax
     13484eb:	e9 b8 05 7e ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     13484f0:	53                   	push   rbx
     13484f1:	48 89 fb             	mov    rbx,rdi
     13484f4:	48 8d 05 15 e6 51 00 	lea    rax,[rip+0x51e615]        # 1866b10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x231f8>
     13484fb:	48 89 07             	mov    QWORD PTR [rdi],rax
     13484fe:	48 83 c7 48          	add    rdi,0x48
     1348502:	e8 75 6c 82 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     1348507:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     134850b:	e8 52 76 90 ff       	call   c4fb62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb02>
     1348510:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1348514:	5b                   	pop    rbx
     1348515:	e9 6c 5f 75 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     134851a:	53                   	push   rbx
     134851b:	48 89 fb             	mov    rbx,rdi

### 0x134958d from 0x1349584..0x134959c
     134956a:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     134956e:	5b                   	pop    rbx
     134956f:	c3                   	ret
     1349570:	48 8d 05 59 d6 51 00 	lea    rax,[rip+0x51d659]        # 1866bd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x232b8>
     1349577:	48 89 06             	mov    QWORD PTR [rsi],rax
     134957a:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     134957e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     1349582:	c3                   	ret
     1349583:	cc                   	int3
     1349584:	50                   	push   rax
     1349585:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     1349589:	48 83 c7 48          	add    rdi,0x48
     134958d:	e8 16 f5 7d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1349592:	58                   	pop    rax
     1349593:	c3                   	ret
     1349594:	48 89 c7             	mov    rdi,rax
     1349597:	e8 09 05 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     134959c:	48 83 7f 18 00       	cmp    QWORD PTR [rdi+0x18],0x0
     13495a1:	74 33                	je     13495d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18eb5a>
     13495a3:	53                   	push   rbx
     13495a4:	48 89 fb             	mov    rbx,rdi
     13495a7:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     13495ab:	e8 70 ff ff ff       	call   1349520 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18eaa4>
     13495b0:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     13495b5:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     13495b9:	48 85 c0             	test   rax,rax

### 0x1349a6b from 0x1349686..0x1349b18
     1349a45:	40 84 ed             	test   bpl,bpl
     1349a48:	40 0f 95 c5          	setne  bpl
     1349a4c:	74 12                	je     1349a60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18efe4>
     1349a4e:	49 8b 7f 38          	mov    rdi,QWORD PTR [r15+0x38]
     1349a52:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1349a55:	4c 89 f6             	mov    rsi,r14
     1349a58:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
     1349a5d:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1349a60:	84 db                	test   bl,bl
     1349a62:	74 0c                	je     1349a70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18eff4>
     1349a64:	49 83 c7 48          	add    r15,0x48
     1349a68:	4c 89 ff             	mov    rdi,r15
     1349a6b:	e8 38 f0 7d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1349a70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1349a77:	00 00 
     1349a79:	48 3b 84 24 30 02 00 	cmp    rax,QWORD PTR [rsp+0x230]
     1349a80:	00 
     1349a81:	0f 85 8c 00 00 00    	jne    1349b13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f097>
     1349a87:	89 e8                	mov    eax,ebp
     1349a89:	48 81 c4 38 02 00 00 	add    rsp,0x238
     1349a90:	5b                   	pop    rbx
     1349a91:	41 5c                	pop    r12
     1349a93:	41 5d                	pop    r13
     1349a95:	41 5e                	pop    r14
     1349a97:	41 5f                	pop    r15
     1349a99:	5d                   	pop    rbp

### 0x134ebe9 from 0x134ebba..0x134ec1e
     134ebc9:	ff c8                	dec    eax
     134ebcb:	83 f8 fe             	cmp    eax,0xfffffffe
     134ebce:	0f 92 c0             	setb   al
     134ebd1:	22 46 0c             	and    al,BYTE PTR [rsi+0xc]
     134ebd4:	8b 0a                	mov    ecx,DWORD PTR [rdx]
     134ebd6:	ff c9                	dec    ecx
     134ebd8:	83 f9 fe             	cmp    ecx,0xfffffffe
     134ebdb:	0f 92 c1             	setb   cl
     134ebde:	22 4a 0c             	and    cl,BYTE PTR [rdx+0xc]
     134ebe1:	38 c8                	cmp    al,cl
     134ebe3:	74 31                	je     134ec16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19419a>
     134ebe5:	49 8d 7e 28          	lea    rdi,[r14+0x28]
     134ebe9:	e8 ba 9e 7d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     134ebee:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     134ebf2:	e8 61 f5 2f 00       	call   164e158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c4>
     134ebf7:	89 c3                	mov    ebx,eax
     134ebf9:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     134ebfd:	e8 ba f5 2f 00       	call   164e1bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2328>
     134ec02:	41 39 5e 10          	cmp    DWORD PTR [r14+0x10],ebx
     134ec06:	75 06                	jne    134ec0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194192>
     134ec08:	41 39 46 14          	cmp    DWORD PTR [r14+0x14],eax
     134ec0c:	74 08                	je     134ec16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19419a>
     134ec0e:	41 89 5e 10          	mov    DWORD PTR [r14+0x10],ebx
     134ec12:	41 89 46 14          	mov    DWORD PTR [r14+0x14],eax
     134ec16:	48 83 c4 08          	add    rsp,0x8
     134ec1a:	5b                   	pop    rbx

### 0x1350af1 from 0x135087a..0x1350b74
     1350ac0:	e8 cb d3 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1350ac5:	4c 89 e7             	mov    rdi,r12
     1350ac8:	e8 a5 bc 36 00       	call   16bc772 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x708de>
     1350acd:	40 b5 01             	mov    bpl,0x1
     1350ad0:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1350ad7:	00 
     1350ad8:	e8 b3 06 90 ff       	call   c51190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e130>
     1350add:	e9 2b ff ff ff       	jmp    1350a0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195f91>
     1350ae2:	40 f6 c5 01          	test   bpl,0x1
     1350ae6:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     1350aeb:	74 09                	je     1350af6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19607a>
     1350aed:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     1350af1:	e8 b2 7f 7d ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1350af6:	4d 8b b6 18 01 00 00 	mov    r14,QWORD PTR [r14+0x118]
     1350afd:	eb 07                	jmp    1350b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19608a>
     1350aff:	4c 8b b5 18 01 00 00 	mov    r14,QWORD PTR [rbp+0x118]
     1350b06:	4d 85 f6             	test   r14,r14
     1350b09:	74 23                	je     1350b2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1960b2>
     1350b0b:	48 83 c3 20          	add    rbx,0x20
     1350b0f:	48 89 df             	mov    rdi,rbx
     1350b12:	e8 1f ad 72 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1350b17:	48 89 d1             	mov    rcx,rdx
     1350b1a:	6a 01                	push   0x1
     1350b1c:	5e                   	pop    rsi
     1350b1d:	4c 89 f7             	mov    rdi,r14
     1350b20:	48 89 c2             	mov    rdx,rax

### 0x13a9cc9 from 0x13a9cc2..0x13a9cce
     13a9c9b:	5e                   	pop    rsi
     13a9c9c:	48 89 df             	mov    rdi,rbx
     13a9c9f:	e8 96 58 7b ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13a9ca4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a9cab:	00 00 
     13a9cad:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     13a9cb2:	75 08                	jne    13a9cbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ef240>
     13a9cb4:	4c 89 f7             	mov    rdi,r14
     13a9cb7:	e8 14 60 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13a9cbc:	e8 ef 5d 44 00       	call   17efab0 <__stack_chk_fail@plt>
     13a9cc1:	cc                   	int3
     13a9cc2:	48 81 c7 c8 00 00 00 	add    rdi,0xc8
     13a9cc9:	e9 da ed 77 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     13a9cce:	41 57                	push   r15
     13a9cd0:	41 56                	push   r14
     13a9cd2:	53                   	push   rbx
     13a9cd3:	48 89 fb             	mov    rbx,rdi
     13a9cd6:	48 8b bf c0 01 00 00 	mov    rdi,QWORD PTR [rdi+0x1c0]
     13a9cdd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13a9ce0:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     13a9ce6:	49 89 c7             	mov    r15,rax
     13a9ce9:	4c 8d 73 08          	lea    r14,[rbx+0x8]
     13a9ced:	4c 89 f7             	mov    rdi,r14
     13a9cf0:	e8 0d 10 00 00       	call   13aad02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f0286>
     13a9cf5:	80 bb 34 01 00 00 00 	cmp    BYTE PTR [rbx+0x134],0x0
     13a9cfc:	74 38                	je     13a9d36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ef2ba>

### 0x13d2252 from 0x13d21d3..0x13d2303
     13d2227:	48 8d 35 40 72 f6 fe 	lea    rsi,[rip+0xfffffffffef67240]        # 33946e <_ZTSSt12bad_any_cast@@Base-0x56d5a>
     13d222e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13d2233:	e8 5c 29 40 00       	call   17d4b94 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9b5>
     13d2238:	49 81 c6 18 03 00 00 	add    r14,0x318
     13d223f:	6a 64                	push   0x64
     13d2241:	41 5f                	pop    r15
     13d2243:	48 85 db             	test   rbx,rbx
     13d2246:	74 07                	je     13d224f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2177d3>
     13d2248:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     13d224b:	a8 01                	test   al,0x1
     13d224d:	75 12                	jne    13d2261 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2177e5>
     13d224f:	4c 89 f7             	mov    rdi,r14
     13d2252:	e8 51 68 75 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     13d2257:	4c 89 ff             	mov    rdi,r15
     13d225a:	e8 31 07 00 00       	call   13d2990 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x217f14>
     13d225f:	eb e2                	jmp    13d2243 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2177c7>
     13d2261:	0f b6 74 24 11       	movzx  esi,BYTE PTR [rsp+0x11]
     13d2266:	8b 7c 24 10          	mov    edi,DWORD PTR [rsp+0x10]
     13d226a:	e8 57 29 40 00       	call   17d4bc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9e7>
     13d226f:	48 89 df             	mov    rdi,rbx
     13d2272:	e8 b7 00 00 00       	call   13d232e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2178b2>
     13d2277:	48 89 df             	mov    rdi,rbx
     13d227a:	e8 af 00 00 00       	call   13d232e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2178b2>
     13d227f:	31 ff                	xor    edi,edi
     13d2281:	e8 a8 00 00 00       	call   13d232e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2178b2>
     13d2286:	48 89 e7             	mov    rdi,rsp

### 0x13d9b6e from 0x13d95b2..0x13d9c8b
     13d9b3e:	5e                   	pop    rsi
     13d9b3f:	e8 74 39 6e ff       	call   abd4b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa458>
     13d9b44:	f3 0f 10 44 24 0c    	movss  xmm0,DWORD PTR [rsp+0xc]
     13d9b4a:	0f 2e 05 0b 4c fb fe 	ucomiss xmm0,DWORD PTR [rip+0xfffffffffefb4c0b]        # 38e75c <_ZTSSt12bad_any_cast@@Base-0x1a6c>
     13d9b51:	75 02                	jne    13d9b55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21f0d9>
     13d9b53:	7b 0f                	jnp    13d9b64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21f0e8>
     13d9b55:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
     13d9b5c:	6a 01                	push   0x1
     13d9b5e:	5e                   	pop    rsi
     13d9b5f:	e8 ca a3 a5 ff       	call   e33f2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x100fb4>
     13d9b64:	48 81 c3 d0 16 00 00 	add    rbx,0x16d0
     13d9b6b:	48 89 df             	mov    rdi,rbx
     13d9b6e:	e8 35 ef 74 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     13d9b73:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     13d9b7a:	00 
     13d9b7b:	e8 a2 96 a8 ff       	call   e63222 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a638>
     13d9b80:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13d9b87:	00 00 
     13d9b89:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
     13d9b90:	00 
     13d9b91:	75 12                	jne    13d9ba5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21f129>
     13d9b93:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
     13d9b9a:	5b                   	pop    rbx
     13d9b9b:	41 5c                	pop    r12
     13d9b9d:	41 5d                	pop    r13
     13d9b9f:	41 5e                	pop    r14

### 0x145f7a8 from 0x145f79e..0x145f7ad
     145f77d:	00 
     145f77e:	75 08                	jne    145f788 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a4d0c>
     145f780:	48 89 df             	mov    rdi,rbx
     145f783:	e8 48 05 61 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     145f788:	e8 23 03 39 00       	call   17efab0 <__stack_chk_fail@plt>
     145f78d:	cc                   	int3
     145f78e:	b8 00 01 00 00       	mov    eax,0x100
     145f793:	48 03 07             	add    rax,QWORD PTR [rdi]
     145f796:	48 89 c7             	mov    rdi,rax
     145f799:	e9 8a 7f 65 ff       	jmp    ab7728 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46c8>
     145f79e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     145f7a1:	48 8b b8 18 01 00 00 	mov    rdi,QWORD PTR [rax+0x118]
     145f7a8:	e9 fb 92 6c ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     145f7ad:	cc                   	int3
     145f7ae:	41 56                	push   r14
     145f7b0:	53                   	push   rbx
     145f7b1:	48 81 ec 98 00 00 00 	sub    rsp,0x98
     145f7b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     145f7bf:	00 00 
     145f7c1:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     145f7c8:	00 
     145f7c9:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
     145f7cc:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     145f7d1:	e8 6c 90 6e ff       	call   b48842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x957e2>
     145f7d6:	49 8b 5e 70          	mov    rbx,QWORD PTR [r14+0x70]
     145f7da:	48 8d 35 f7 20 f1 fe 	lea    rsi,[rip+0xfffffffffef120f7]        # 3718d8 <_ZTSSt12bad_any_cast@@Base-0x1e8f0>

### 0x145fb9e from 0x145fb94..0x145fba3
     145fb6e:	e8 83 d5 ff ff       	call   145d0f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a267a>
     145fb73:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     145fb7a:	00 00 
     145fb7c:	48 3b 84 24 e8 05 00 	cmp    rax,QWORD PTR [rsp+0x5e8]
     145fb83:	00 
     145fb84:	75 08                	jne    145fb8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a5112>
     145fb86:	48 89 df             	mov    rdi,rbx
     145fb89:	e8 42 01 61 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     145fb8e:	e8 1d ff 38 00       	call   17efab0 <__stack_chk_fail@plt>
     145fb93:	cc                   	int3
     145fb94:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     145fb97:	48 8b b8 20 01 00 00 	mov    rdi,QWORD PTR [rax+0x120]
     145fb9e:	e9 05 8f 6c ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     145fba3:	cc                   	int3
     145fba4:	55                   	push   rbp
     145fba5:	41 56                	push   r14
     145fba7:	53                   	push   rbx
     145fba8:	48 81 ec d0 06 00 00 	sub    rsp,0x6d0
     145fbaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     145fbb6:	00 00 
     145fbb8:	48 89 84 24 c8 06 00 	mov    QWORD PTR [rsp+0x6c8],rax
     145fbbf:	00 
     145fbc0:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     145fbc3:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     145fbc8:	e8 6d 1d 00 00       	call   146193a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6ebe>
     145fbcd:	48 8d 35 2c 86 fd fe 	lea    rsi,[rip+0xfffffffffefd862c]        # 438200 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dc4f>

### 0x148cdd2 from 0x148b1f6..0x148cfee
     148cdaa:	49 29 d0             	sub    r8,rdx
     148cdad:	49 c1 f8 04          	sar    r8,0x4
     148cdb1:	4d 01 84 24 a0 00 00 	add    QWORD PTR [r12+0xa0],r8
     148cdb8:	00 
     148cdb9:	48 39 c8             	cmp    rax,rcx
     148cdbc:	74 0d                	je     148cdcb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d234f>
     148cdbe:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     148cdc2:	48 83 c0 08          	add    rax,0x8
     148cdc6:	48 39 f2             	cmp    rdx,rsi
     148cdc9:	75 9b                	jne    148cd66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d22ea>
     148cdcb:	48 83 c5 40          	add    rbp,0x40
     148cdcf:	48 89 ef             	mov    rdi,rbp
     148cdd2:	e8 d1 bc 69 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     148cdd7:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     148cdde:	00 
     148cddf:	e8 06 08 00 00       	call   148d5ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d2b6e>
     148cde4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     148cdeb:	00 00 
     148cded:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
     148cdf4:	00 
     148cdf5:	0f 85 ee 01 00 00    	jne    148cfe9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d256d>
     148cdfb:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
     148ce02:	5b                   	pop    rbx
     148ce03:	41 5c                	pop    r12
     148ce05:	41 5d                	pop    r13
     148ce07:	41 5e                	pop    r14

### 0x14b7250 from 0x14b7238..0x14b7255
     14b7228:	e9 97 f3 00 00       	jmp    14c65c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30bb48>
     14b722d:	cc                   	int3
     14b722e:	48 83 c7 08          	add    rdi,0x8
     14b7232:	e9 21 f2 00 00       	jmp    14c6458 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30b9dc>
     14b7237:	cc                   	int3
     14b7238:	53                   	push   rbx
     14b7239:	48 89 fb             	mov    rbx,rdi
     14b723c:	48 83 c7 08          	add    rdi,0x8
     14b7240:	e8 ed f5 00 00       	call   14c6832 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30bdb6>
     14b7245:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b724c:	48 89 df             	mov    rdi,rbx
     14b724f:	5b                   	pop    rbx
     14b7250:	e9 53 18 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7255:	cc                   	int3
     14b7256:	53                   	push   rbx
     14b7257:	48 89 fb             	mov    rbx,rdi
     14b725a:	48 83 c7 08          	add    rdi,0x8
     14b725e:	e8 63 f8 00 00       	call   14c6ac6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c04a>
     14b7263:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b726a:	48 89 df             	mov    rdi,rbx
     14b726d:	5b                   	pop    rbx
     14b726e:	e9 35 18 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7273:	cc                   	int3
     14b7274:	53                   	push   rbx
     14b7275:	48 89 fb             	mov    rbx,rdi
     14b7278:	83 39 00             	cmp    DWORD PTR [rcx],0x0

### 0x14b726e from 0x14b7256..0x14b7273
     14b7245:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b724c:	48 89 df             	mov    rdi,rbx
     14b724f:	5b                   	pop    rbx
     14b7250:	e9 53 18 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7255:	cc                   	int3
     14b7256:	53                   	push   rbx
     14b7257:	48 89 fb             	mov    rbx,rdi
     14b725a:	48 83 c7 08          	add    rdi,0x8
     14b725e:	e8 63 f8 00 00       	call   14c6ac6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c04a>
     14b7263:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b726a:	48 89 df             	mov    rdi,rbx
     14b726d:	5b                   	pop    rbx
     14b726e:	e9 35 18 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7273:	cc                   	int3
     14b7274:	53                   	push   rbx
     14b7275:	48 89 fb             	mov    rbx,rdi
     14b7278:	83 39 00             	cmp    DWORD PTR [rcx],0x0
     14b727b:	74 09                	je     14b7286 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc80a>
     14b727d:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     14b7284:	eb 11                	jmp    14b7297 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc81b>
     14b7286:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     14b728d:	48 03 3a             	add    rdi,QWORD PTR [rdx]
     14b7290:	48 89 bb 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rdi
     14b7297:	48 8d 53 08          	lea    rdx,[rbx+0x8]
     14b729b:	be 80 cb a4 00       	mov    esi,0xa4cb80
     14b72a0:	e8 e7 f8 00 00       	call   14c6b8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c110>

### 0x14b730a from 0x14b7274..0x14b730f
     14b72ca:	e8 bd f8 00 00       	call   14c6b8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c110>
     14b72cf:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     14b72d6:	48 8d 93 b0 00 00 00 	lea    rdx,[rbx+0xb0]
     14b72dd:	be 80 cb a4 00       	mov    esi,0xa4cb80
     14b72e2:	e8 a5 f8 00 00       	call   14c6b8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c110>
     14b72e7:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     14b72ee:	48 8d 93 e8 00 00 00 	lea    rdx,[rbx+0xe8]
     14b72f5:	be 80 ee 36 00       	mov    esi,0x36ee80
     14b72fa:	e8 1f f9 00 00       	call   14c6c1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c1a2>
     14b72ff:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b7306:	48 89 df             	mov    rdi,rbx
     14b7309:	5b                   	pop    rbx
     14b730a:	e9 99 17 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b730f:	cc                   	int3
     14b7310:	53                   	push   rbx
     14b7311:	48 89 f0             	mov    rax,rsi
     14b7314:	48 89 fb             	mov    rbx,rdi
     14b7317:	48 8d 77 08          	lea    rsi,[rdi+0x8]
     14b731b:	48 89 87 18 01 00 00 	mov    QWORD PTR [rdi+0x118],rax
     14b7322:	48 89 c7             	mov    rdi,rax
     14b7325:	e8 6e f9 00 00       	call   14c6c98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c21c>
     14b732a:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     14b7331:	48 8d 73 40          	lea    rsi,[rbx+0x40]
     14b7335:	e8 5e f9 00 00       	call   14c6c98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c21c>
     14b733a:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     14b7341:	48 8d 73 78          	lea    rsi,[rbx+0x78]

### 0x14b737b from 0x14b7310..0x14b7380
     14b733a:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     14b7341:	48 8d 73 78          	lea    rsi,[rbx+0x78]
     14b7345:	e8 4e f9 00 00       	call   14c6c98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c21c>
     14b734a:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     14b7351:	48 8d b3 b0 00 00 00 	lea    rsi,[rbx+0xb0]
     14b7358:	e8 3b f9 00 00       	call   14c6c98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c21c>
     14b735d:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     14b7364:	48 8d b3 e8 00 00 00 	lea    rsi,[rbx+0xe8]
     14b736b:	e8 62 f9 00 00       	call   14c6cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c256>
     14b7370:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b7377:	48 89 df             	mov    rdi,rbx
     14b737a:	5b                   	pop    rbx
     14b737b:	e9 28 17 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7380:	48 83 c7 08          	add    rdi,0x8
     14b7384:	e9 0b 00 01 00       	jmp    14c7394 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c918>
     14b7389:	cc                   	int3
     14b738a:	55                   	push   rbp
     14b738b:	41 57                	push   r15
     14b738d:	41 56                	push   r14
     14b738f:	41 55                	push   r13
     14b7391:	41 54                	push   r12
     14b7393:	53                   	push   rbx
     14b7394:	48 83 ec 48          	sub    rsp,0x48
     14b7398:	49 89 f6             	mov    r14,rsi
     14b739b:	48 89 fb             	mov    rbx,rdi
     14b739e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x14b751a from 0x14b738a..0x14b7524
     14b74f9:	00 00 
     14b74fb:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     14b7500:	75 1d                	jne    14b751f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fcaa3>
     14b7502:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b7509:	48 89 df             	mov    rdi,rbx
     14b750c:	48 83 c4 48          	add    rsp,0x48
     14b7510:	5b                   	pop    rbx
     14b7511:	41 5c                	pop    r12
     14b7513:	41 5d                	pop    r13
     14b7515:	41 5e                	pop    r14
     14b7517:	41 5f                	pop    r15
     14b7519:	5d                   	pop    rbp
     14b751a:	e9 89 15 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b751f:	e8 8c 85 33 00       	call   17efab0 <__stack_chk_fail@plt>
     14b7524:	53                   	push   rbx
     14b7525:	48 89 fb             	mov    rbx,rdi
     14b7528:	48 81 c7 e8 00 00 00 	add    rdi,0xe8
     14b752f:	e8 1c 00 00 00       	call   14b7550 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fcad4>
     14b7534:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
     14b753b:	e8 68 15 67 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7540:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b7547:	48 89 df             	mov    rdi,rbx
     14b754a:	5b                   	pop    rbx
     14b754b:	e9 58 15 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7550:	55                   	push   rbp
     14b7551:	41 57                	push   r15

### 0x14b753b from 0x14b7524..0x14b7550
     14b7511:	41 5c                	pop    r12
     14b7513:	41 5d                	pop    r13
     14b7515:	41 5e                	pop    r14
     14b7517:	41 5f                	pop    r15
     14b7519:	5d                   	pop    rbp
     14b751a:	e9 89 15 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b751f:	e8 8c 85 33 00       	call   17efab0 <__stack_chk_fail@plt>
     14b7524:	53                   	push   rbx
     14b7525:	48 89 fb             	mov    rbx,rdi
     14b7528:	48 81 c7 e8 00 00 00 	add    rdi,0xe8
     14b752f:	e8 1c 00 00 00       	call   14b7550 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fcad4>
     14b7534:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
     14b753b:	e8 68 15 67 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7540:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b7547:	48 89 df             	mov    rdi,rbx
     14b754a:	5b                   	pop    rbx
     14b754b:	e9 58 15 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7550:	55                   	push   rbp
     14b7551:	41 57                	push   r15
     14b7553:	41 56                	push   r14
     14b7555:	41 55                	push   r13
     14b7557:	41 54                	push   r12
     14b7559:	53                   	push   rbx
     14b755a:	48 83 ec 28          	sub    rsp,0x28
     14b755e:	48 89 fb             	mov    rbx,rdi
     14b7561:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x14b754b from 0x14b7524..0x14b7550
     14b7519:	5d                   	pop    rbp
     14b751a:	e9 89 15 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b751f:	e8 8c 85 33 00       	call   17efab0 <__stack_chk_fail@plt>
     14b7524:	53                   	push   rbx
     14b7525:	48 89 fb             	mov    rbx,rdi
     14b7528:	48 81 c7 e8 00 00 00 	add    rdi,0xe8
     14b752f:	e8 1c 00 00 00       	call   14b7550 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fcad4>
     14b7534:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
     14b753b:	e8 68 15 67 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7540:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b7547:	48 89 df             	mov    rdi,rbx
     14b754a:	5b                   	pop    rbx
     14b754b:	e9 58 15 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b7550:	55                   	push   rbp
     14b7551:	41 57                	push   r15
     14b7553:	41 56                	push   r14
     14b7555:	41 55                	push   r13
     14b7557:	41 54                	push   r12
     14b7559:	53                   	push   rbx
     14b755a:	48 83 ec 28          	sub    rsp,0x28
     14b755e:	48 89 fb             	mov    rbx,rdi
     14b7561:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14b7568:	00 00 
     14b756a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14b756f:	48 39 f7             	cmp    rdi,rsi
     14b7572:	0f 84 f8 00 00 00    	je     14b7670 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fcbf4>

### 0x14b77f4 from 0x14b7764..0x14b780f
     14b77a4:	48 8d bb e8 00 00 00 	lea    rdi,[rbx+0xe8]
     14b77ab:	49 8d b6 e0 00 00 00 	lea    rsi,[r14+0xe0]
     14b77b2:	e8 99 fd ff ff       	call   14b7550 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fcad4>
     14b77b7:	49 8b 86 10 01 00 00 	mov    rax,QWORD PTR [r14+0x110]
     14b77be:	48 89 83 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rax
     14b77c5:	41 8a 86 18 01 00 00 	mov    al,BYTE PTR [r14+0x118]
     14b77cc:	88 83 20 01 00 00    	mov    BYTE PTR [rbx+0x120],al
     14b77d2:	49 8b 86 20 01 00 00 	mov    rax,QWORD PTR [r14+0x120]
     14b77d9:	48 89 83 28 01 00 00 	mov    QWORD PTR [rbx+0x128],rax
     14b77e0:	41 8a 86 28 01 00 00 	mov    al,BYTE PTR [r14+0x128]
     14b77e7:	88 83 30 01 00 00    	mov    BYTE PTR [rbx+0x130],al
     14b77ed:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
     14b77f4:	e8 af 12 67 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b77f9:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b7800:	48 89 df             	mov    rdi,rbx
     14b7803:	48 83 c4 08          	add    rsp,0x8
     14b7807:	5b                   	pop    rbx
     14b7808:	41 5e                	pop    r14
     14b780a:	e9 99 12 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b780f:	cc                   	int3
     14b7810:	55                   	push   rbp
     14b7811:	41 57                	push   r15
     14b7813:	41 56                	push   r14
     14b7815:	41 55                	push   r13
     14b7817:	41 54                	push   r12
     14b7819:	53                   	push   rbx

### 0x14b780a from 0x14b7764..0x14b780f
     14b77cc:	88 83 20 01 00 00    	mov    BYTE PTR [rbx+0x120],al
     14b77d2:	49 8b 86 20 01 00 00 	mov    rax,QWORD PTR [r14+0x120]
     14b77d9:	48 89 83 28 01 00 00 	mov    QWORD PTR [rbx+0x128],rax
     14b77e0:	41 8a 86 28 01 00 00 	mov    al,BYTE PTR [r14+0x128]
     14b77e7:	88 83 30 01 00 00    	mov    BYTE PTR [rbx+0x130],al
     14b77ed:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
     14b77f4:	e8 af 12 67 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b77f9:	48 81 c3 90 01 00 00 	add    rbx,0x190
     14b7800:	48 89 df             	mov    rdi,rbx
     14b7803:	48 83 c4 08          	add    rsp,0x8
     14b7807:	5b                   	pop    rbx
     14b7808:	41 5e                	pop    r14
     14b780a:	e9 99 12 67 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14b780f:	cc                   	int3
     14b7810:	55                   	push   rbp
     14b7811:	41 57                	push   r15
     14b7813:	41 56                	push   r14
     14b7815:	41 55                	push   r13
     14b7817:	41 54                	push   r12
     14b7819:	53                   	push   rbx
     14b781a:	48 83 ec 38          	sub    rsp,0x38
     14b781e:	48 89 fb             	mov    rbx,rdi
     14b7821:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14b7828:	00 00 
     14b782a:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14b782f:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi

### 0x14c3928 from 0x14c2dd4..0x14c39aa
     14c38fe:	49 8b b5 60 01 00 00 	mov    rsi,QWORD PTR [r13+0x160]
     14c3905:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14c3908:	4c 89 f7             	mov    rdi,r14
     14c390b:	48 89 da             	mov    rdx,rbx
     14c390e:	4c 89 e1             	mov    rcx,r12
     14c3911:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14c3914:	4c 89 f7             	mov    rdi,r14
     14c3917:	e8 1e c6 ff ff       	call   14bff3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3054be>
     14c391c:	48 83 c3 48          	add    rbx,0x48
     14c3920:	4c 39 fb             	cmp    rbx,r15
     14c3923:	75 d9                	jne    14c38fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x308e82>
     14c3925:	4c 89 ef             	mov    rdi,r13
     14c3928:	e8 7b 51 66 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14c392d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c3934:	00 00 
     14c3936:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
     14c393d:	00 
     14c393e:	75 12                	jne    14c3952 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x308ed6>
     14c3940:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
     14c3947:	5b                   	pop    rbx
     14c3948:	41 5c                	pop    r12
     14c394a:	41 5d                	pop    r13
     14c394c:	41 5e                	pop    r14
     14c394e:	41 5f                	pop    r15
     14c3950:	5d                   	pop    rbp
     14c3951:	c3                   	ret

### 0x14dce06 from 0x14dcdee..0x14dce0b
     14dcdd0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14dcdd7:	00 00 
     14dcdd9:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     14dcdde:	75 08                	jne    14dcde8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32236c>
     14dcde0:	48 89 df             	mov    rdi,rbx
     14dcde3:	e8 e8 2e 59 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14dcde8:	e8 c3 2c 31 00       	call   17efab0 <__stack_chk_fail@plt>
     14dcded:	cc                   	int3
     14dcdee:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     14dcdf1:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
     14dcdf8:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     14dcdff:	48 81 c7 60 01 00 00 	add    rdi,0x160
     14dce06:	e9 9d bc 64 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14dce0b:	cc                   	int3
     14dce0c:	49 89 f0             	mov    r8,rsi
     14dce0f:	48 8d 35 7b 02 5c ff 	lea    rsi,[rip+0xffffffffff5c027b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14dce16:	48 8d 0d 0b 00 00 00 	lea    rcx,[rip+0xb]        # 14dce28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3223ac>
     14dce1d:	6a 08                	push   0x8
     14dce1f:	41 59                	pop    r9
     14dce21:	31 d2                	xor    edx,edx
     14dce23:	e9 6c d9 2f 00       	jmp    17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14dce28:	55                   	push   rbp
     14dce29:	41 57                	push   r15
     14dce2b:	41 56                	push   r14
     14dce2d:	41 55                	push   r13
     14dce2f:	41 54                	push   r12

### 0x14de2e4 from 0x14de2ce..0x14de30f
     14de2c4:	e8 95 6e 67 ff       	call   b5515e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa20fe>
     14de2c9:	b0 01                	mov    al,0x1
     14de2cb:	eb d3                	jmp    14de2a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x323824>
     14de2cd:	cc                   	int3
     14de2ce:	41 56                	push   r14
     14de2d0:	53                   	push   rbx
     14de2d1:	50                   	push   rax
     14de2d2:	49 89 f6             	mov    r14,rsi
     14de2d5:	48 89 fb             	mov    rbx,rdi
     14de2d8:	48 8b be 90 00 00 00 	mov    rdi,QWORD PTR [rsi+0x90]
     14de2df:	48 85 ff             	test   rdi,rdi
     14de2e2:	74 05                	je     14de2e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32386d>
     14de2e4:	e8 bf a7 64 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14de2e9:	49 8d be 78 01 00 00 	lea    rdi,[r14+0x178]
     14de2f0:	e8 b3 a7 64 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14de2f5:	49 83 c6 08          	add    r14,0x8
     14de2f9:	48 89 df             	mov    rdi,rbx
     14de2fc:	4c 89 f6             	mov    rsi,r14
     14de2ff:	e8 1e 0d 00 00       	call   14df022 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3245a6>
     14de304:	48 89 d8             	mov    rax,rbx
     14de307:	48 83 c4 08          	add    rsp,0x8
     14de30b:	5b                   	pop    rbx
     14de30c:	41 5e                	pop    r14
     14de30e:	c3                   	ret
     14de30f:	cc                   	int3
     14de310:	41 56                	push   r14

### 0x14de2f0 from 0x14de2ce..0x14de30f
     14de2cb:	eb d3                	jmp    14de2a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x323824>
     14de2cd:	cc                   	int3
     14de2ce:	41 56                	push   r14
     14de2d0:	53                   	push   rbx
     14de2d1:	50                   	push   rax
     14de2d2:	49 89 f6             	mov    r14,rsi
     14de2d5:	48 89 fb             	mov    rbx,rdi
     14de2d8:	48 8b be 90 00 00 00 	mov    rdi,QWORD PTR [rsi+0x90]
     14de2df:	48 85 ff             	test   rdi,rdi
     14de2e2:	74 05                	je     14de2e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32386d>
     14de2e4:	e8 bf a7 64 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14de2e9:	49 8d be 78 01 00 00 	lea    rdi,[r14+0x178]
     14de2f0:	e8 b3 a7 64 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14de2f5:	49 83 c6 08          	add    r14,0x8
     14de2f9:	48 89 df             	mov    rdi,rbx
     14de2fc:	4c 89 f6             	mov    rsi,r14
     14de2ff:	e8 1e 0d 00 00       	call   14df022 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3245a6>
     14de304:	48 89 d8             	mov    rax,rbx
     14de307:	48 83 c4 08          	add    rsp,0x8
     14de30b:	5b                   	pop    rbx
     14de30c:	41 5e                	pop    r14
     14de30e:	c3                   	ret
     14de30f:	cc                   	int3
     14de310:	41 56                	push   r14
     14de312:	53                   	push   rbx
     14de313:	48 83 ec 58          	sub    rsp,0x58

### 0x14ec271 from 0x14ec248..0x14ec2aa
     14ec24e:	53                   	push   rbx
     14ec24f:	50                   	push   rax
     14ec250:	49 89 ff             	mov    r15,rdi
     14ec253:	48 8d 5f 20          	lea    rbx,[rdi+0x20]
     14ec257:	4c 8b 77 20          	mov    r14,QWORD PTR [rdi+0x20]
     14ec25b:	49 83 c7 28          	add    r15,0x28
     14ec25f:	4d 39 fe             	cmp    r14,r15
     14ec262:	74 2d                	je     14ec291 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x331815>
     14ec264:	49 89 f4             	mov    r12,rsi
     14ec267:	4d 39 66 20          	cmp    QWORD PTR [r14+0x20],r12
     14ec26b:	7f 1c                	jg     14ec289 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33180d>
     14ec26d:	49 8d 7e 28          	lea    rdi,[r14+0x28]
     14ec271:	e8 32 c8 63 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14ec276:	4c 89 f7             	mov    rdi,r14
     14ec279:	e8 64 25 5b ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     14ec27e:	49 89 c6             	mov    r14,rax
     14ec281:	4c 39 f8             	cmp    rax,r15
     14ec284:	75 e1                	jne    14ec267 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3317eb>
     14ec286:	4d 89 fe             	mov    r14,r15
     14ec289:	4c 89 f2             	mov    rdx,r14
     14ec28c:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
     14ec28f:	eb 03                	jmp    14ec294 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x331818>
     14ec291:	4c 89 f2             	mov    rdx,r14
     14ec294:	48 89 df             	mov    rdi,rbx
     14ec297:	4c 89 f6             	mov    rsi,r14
     14ec29a:	48 83 c4 08          	add    rsp,0x8

### 0x14ec450 from 0x14ec432..0x14ec4a7
     14ec42c:	e9 01 00 00 00       	jmp    14ec432 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3319b6>
     14ec431:	cc                   	int3
     14ec432:	41 57                	push   r15
     14ec434:	41 56                	push   r14
     14ec436:	53                   	push   rbx
     14ec437:	49 89 fe             	mov    r14,rdi
     14ec43a:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
     14ec43d:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     14ec441:	49 8d 5f 20          	lea    rbx,[r15+0x20]
     14ec445:	48 89 df             	mov    rdi,rbx
     14ec448:	e8 2d fd ff ff       	call   14ec17a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3316fe>
     14ec44d:	48 89 c7             	mov    rdi,rax
     14ec450:	e8 53 c6 63 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14ec455:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
     14ec459:	48 85 c0             	test   rax,rax
     14ec45c:	74 2e                	je     14ec48c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x331a10>
     14ec45e:	49 83 c7 28          	add    r15,0x28
     14ec462:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
     14ec466:	4c 89 fe             	mov    rsi,r15
     14ec469:	48 8d 50 08          	lea    rdx,[rax+0x8]
     14ec46d:	48 39 48 20          	cmp    QWORD PTR [rax+0x20],rcx
     14ec471:	48 0f 4d d0          	cmovge rdx,rax
     14ec475:	48 0f 4d f0          	cmovge rsi,rax
     14ec479:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     14ec47c:	48 85 c0             	test   rax,rax
     14ec47f:	75 e8                	jne    14ec469 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3319ed>

### 0x14edb8f from 0x14edb7a..0x14edb94
     14edb6a:	48 83 c4 50          	add    rsp,0x50
     14edb6e:	5b                   	pop    rbx
     14edb6f:	41 5e                	pop    r14
     14edb71:	41 5f                	pop    r15
     14edb73:	c3                   	ret
     14edb74:	e8 37 1f 30 00       	call   17efab0 <__stack_chk_fail@plt>
     14edb79:	cc                   	int3
     14edb7a:	40 38 b7 c0 00 00 00 	cmp    BYTE PTR [rdi+0xc0],sil
     14edb81:	75 01                	jne    14edb84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333108>
     14edb83:	c3                   	ret
     14edb84:	40 88 b7 c0 00 00 00 	mov    BYTE PTR [rdi+0xc0],sil
     14edb8b:	48 83 c7 68          	add    rdi,0x68
     14edb8f:	e9 14 af 63 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14edb94:	53                   	push   rbx
     14edb95:	48 89 fb             	mov    rbx,rdi
     14edb98:	6a 10                	push   0x10
     14edb9a:	5f                   	pop    rdi
     14edb9b:	e8 60 03 30 00       	call   17edf00 <_Znwm@plt>
     14edba0:	48 8d 0d 99 c6 38 00 	lea    rcx,[rip+0x38c699]        # 187a240 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36928>
     14edba7:	48 89 08             	mov    QWORD PTR [rax],rcx
     14edbaa:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     14edbae:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     14edbb2:	5b                   	pop    rbx
     14edbb3:	c3                   	ret
     14edbb4:	48 8d 05 85 c6 38 00 	lea    rax,[rip+0x38c685]        # 187a240 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36928>
     14edbbb:	48 89 06             	mov    QWORD PTR [rsi],rax

### 0x14edc04 from 0x14edbc8..0x14edc11
     14edbdd:	e8 6d dc 58 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     14edbe2:	84 c0                	test   al,al
     14edbe4:	74 23                	je     14edc09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33318d>
     14edbe6:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     14edbea:	48 85 c0             	test   rax,rax
     14edbed:	74 1a                	je     14edc09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33318d>
     14edbef:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     14edbf6:	48 83 c3 68          	add    rbx,0x68
     14edbfa:	48 89 df             	mov    rdi,rbx
     14edbfd:	48 83 c4 08          	add    rsp,0x8
     14edc01:	5b                   	pop    rbx
     14edc02:	41 5e                	pop    r14
     14edc04:	e9 9f ae 63 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14edc09:	48 83 c4 08          	add    rsp,0x8
     14edc0d:	5b                   	pop    rbx
     14edc0e:	41 5e                	pop    r14
     14edc10:	c3                   	ret
     14edc11:	cc                   	int3
     14edc12:	53                   	push   rbx
     14edc13:	48 89 fb             	mov    rbx,rdi
     14edc16:	48 8d 05 f3 c5 38 00 	lea    rax,[rip+0x38c5f3]        # 187a210 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x368f8>
     14edc1d:	48 89 07             	mov    QWORD PTR [rdi],rax
     14edc20:	48 83 c7 68          	add    rdi,0x68
     14edc24:	e8 3d c2 2e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     14edc29:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     14edc2d:	e8 a2 bf 2e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>

### 0x14ee51e from 0x14ee4e4..0x14ee803
     14ee4f2:	44 89 cd             	mov    ebp,r9d
     14ee4f5:	4d 89 c6             	mov    r14,r8
     14ee4f8:	49 89 cc             	mov    r12,rcx
     14ee4fb:	49 89 d5             	mov    r13,rdx
     14ee4fe:	48 89 f3             	mov    rbx,rsi
     14ee501:	49 89 ff             	mov    r15,rdi
     14ee504:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee50b:	00 00 
     14ee50d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14ee512:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14ee516:	bf 60 01 00 00       	mov    edi,0x160
     14ee51b:	48 03 38             	add    rdi,QWORD PTR [rax]
     14ee51e:	e8 85 a5 63 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14ee523:	41 80 7f 50 00       	cmp    BYTE PTR [r15+0x50],0x0
     14ee528:	0f 84 dd 00 00 00    	je     14ee60b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b8f>
     14ee52e:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     14ee532:	48 85 ff             	test   rdi,rdi
     14ee535:	0f 84 d0 00 00 00    	je     14ee60b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b8f>
     14ee53b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ee53e:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14ee541:	84 c0                	test   al,al
     14ee543:	0f 84 c2 00 00 00    	je     14ee60b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b8f>
     14ee549:	48 8d 43 58          	lea    rax,[rbx+0x58]
     14ee54d:	41 80 7c 24 08 00    	cmp    BYTE PTR [r12+0x8],0x0
     14ee553:	74 65                	je     14ee5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b3e>
     14ee555:	41 80 7e 08 00       	cmp    BYTE PTR [r14+0x8],0x0

### 0x14ee832 from 0x14ee804..0x14ee96a
     14ee808:	41 55                	push   r13
     14ee80a:	41 54                	push   r12
     14ee80c:	53                   	push   rbx
     14ee80d:	48 81 ec 80 00 00 00 	sub    rsp,0x80
     14ee814:	49 89 d7             	mov    r15,rdx
     14ee817:	48 89 f3             	mov    rbx,rsi
     14ee81a:	49 89 fe             	mov    r14,rdi
     14ee81d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee824:	00 00 
     14ee826:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     14ee82b:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14ee82f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ee832:	e8 71 a2 63 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14ee837:	4d 8b 6e 48          	mov    r13,QWORD PTR [r14+0x48]
     14ee83b:	4d 8d 65 10          	lea    r12,[r13+0x10]
     14ee83f:	48 8d 35 aa a7 f4 fe 	lea    rsi,[rip+0xfffffffffef4a7aa]        # 438ff0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ea3f>
     14ee846:	4c 89 e7             	mov    rdi,r12
     14ee849:	e8 ca b2 65 ff       	call   b49b18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96ab8>
     14ee84e:	48 89 c7             	mov    rdi,rax
     14ee851:	48 89 de             	mov    rsi,rbx
     14ee854:	e8 27 f8 2f 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14ee859:	48 8d 35 a8 a7 f4 fe 	lea    rsi,[rip+0xfffffffffef4a7a8]        # 439008 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ea57>
     14ee860:	4c 89 e7             	mov    rdi,r12
     14ee863:	e8 b0 b2 65 ff       	call   b49b18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96ab8>
     14ee868:	48 89 c7             	mov    rdi,rax
     14ee86b:	4c 89 fe             	mov    rsi,r15

### 0x14ee99b from 0x14ee96a..0x14eea3b
     14ee970:	53                   	push   rbx
     14ee971:	48 83 ec 28          	sub    rsp,0x28
     14ee975:	4d 89 c6             	mov    r14,r8
     14ee978:	49 89 cc             	mov    r12,rcx
     14ee97b:	48 89 f3             	mov    rbx,rsi
     14ee97e:	49 89 ff             	mov    r15,rdi
     14ee981:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee988:	00 00 
     14ee98a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14ee98f:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14ee993:	bf b0 00 00 00       	mov    edi,0xb0
     14ee998:	48 03 38             	add    rdi,QWORD PTR [rax]
     14ee99b:	e8 08 a1 63 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14ee9a0:	41 80 7f 50 00       	cmp    BYTE PTR [r15+0x50],0x0
     14ee9a5:	74 50                	je     14ee9f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333f7b>
     14ee9a7:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     14ee9ab:	48 85 ff             	test   rdi,rdi
     14ee9ae:	74 47                	je     14ee9f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333f7b>
     14ee9b0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ee9b3:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14ee9b6:	84 c0                	test   al,al
     14ee9b8:	74 3d                	je     14ee9f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333f7b>
     14ee9ba:	48 8d 53 58          	lea    rdx,[rbx+0x58]
     14ee9be:	48 83 c3 68          	add    rbx,0x68
     14ee9c2:	48 89 e0             	mov    rax,rsp
     14ee9c5:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0

### 0x14eea6c from 0x14eea3c..0x14eeb0c
     14eea42:	53                   	push   rbx
     14eea43:	48 83 ec 28          	sub    rsp,0x28
     14eea47:	4d 89 c6             	mov    r14,r8
     14eea4a:	49 89 cc             	mov    r12,rcx
     14eea4d:	48 89 f3             	mov    rbx,rsi
     14eea50:	49 89 ff             	mov    r15,rdi
     14eea53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14eea5a:	00 00 
     14eea5c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14eea61:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14eea65:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14eea68:	48 83 c7 58          	add    rdi,0x58
     14eea6c:	e8 37 a0 63 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14eea71:	41 80 7f 50 00       	cmp    BYTE PTR [r15+0x50],0x0
     14eea76:	74 50                	je     14eeac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33404c>
     14eea78:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     14eea7c:	48 85 ff             	test   rdi,rdi
     14eea7f:	74 47                	je     14eeac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33404c>
     14eea81:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14eea84:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14eea87:	84 c0                	test   al,al
     14eea89:	74 3d                	je     14eeac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33404c>
     14eea8b:	48 8d 53 58          	lea    rdx,[rbx+0x58]
     14eea8f:	48 83 c3 68          	add    rbx,0x68
     14eea93:	48 89 e0             	mov    rax,rsp
     14eea96:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0

### 0x150be48 from 0x150bdac..0x150be5a
     150be1c:	66 0f 28 4c 24 10    	movapd xmm1,XMMWORD PTR [rsp+0x10]
     150be22:	66 0f 2e c8          	ucomisd xmm1,xmm0
     150be26:	75 08                	jne    150be30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3513b4>
     150be28:	7a 06                	jp     150be30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3513b4>
     150be2a:	48 83 c3 70          	add    rbx,0x70
     150be2e:	eb 15                	jmp    150be45 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3513c9>
     150be30:	f2 0f 10 4c 24 08    	movsd  xmm1,QWORD PTR [rsp+0x8]
     150be36:	66 0f 2e c8          	ucomisd xmm1,xmm0
     150be3a:	75 11                	jne    150be4d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3513d1>
     150be3c:	7a 0f                	jp     150be4d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3513d1>
     150be3e:	48 81 c3 c8 00 00 00 	add    rbx,0xc8
     150be45:	48 89 df             	mov    rdi,rbx
     150be48:	e8 5b cc 61 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     150be4d:	40 80 e5 01          	and    bpl,0x1
     150be51:	89 e8                	mov    eax,ebp
     150be53:	48 83 c4 28          	add    rsp,0x28
     150be57:	5b                   	pop    rbx
     150be58:	5d                   	pop    rbp
     150be59:	c3                   	ret
     150be5a:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     150be5e:	8a 57 10             	mov    dl,BYTE PTR [rdi+0x10]
     150be61:	c3                   	ret
     150be62:	41 57                	push   r15
     150be64:	41 56                	push   r14
     150be66:	53                   	push   rbx
     150be67:	48 83 ec 50          	sub    rsp,0x50

### 0x15b7c16 from 0x15b7c0e..0x15b7c25
     15b7bef:	00 
     15b7bf0:	75 0a                	jne    15b7bfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fd180>
     15b7bf2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     15b7bf7:	e8 d4 80 4b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     15b7bfc:	e8 af 7e 23 00       	call   17efab0 <__stack_chk_fail@plt>
     15b7c01:	cc                   	int3
     15b7c02:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     15b7c05:	48 83 c7 48          	add    rdi,0x48
     15b7c09:	e9 5c e8 ff ff       	jmp    15b646a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb9ee>
     15b7c0e:	50                   	push   rax
     15b7c0f:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     15b7c12:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
     15b7c16:	e8 8d 0e 57 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     15b7c1b:	58                   	pop    rax
     15b7c1c:	c3                   	ret
     15b7c1d:	48 89 c7             	mov    rdi,rax
     15b7c20:	e8 80 1e 4c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     15b7c25:	cc                   	int3
     15b7c26:	53                   	push   rbx
     15b7c27:	48 89 fb             	mov    rbx,rdi
     15b7c2a:	48 8d 05 97 cb 2c 00 	lea    rax,[rip+0x2ccb97]        # 18847c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40eb0>
     15b7c31:	48 89 07             	mov    QWORD PTR [rdi],rax
     15b7c34:	48 81 c7 80 00 00 00 	add    rdi,0x80
     15b7c3b:	e8 26 22 22 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     15b7c40:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
     15b7c44:	48 83 63 78 00       	and    QWORD PTR [rbx+0x78],0x0

### 0x16351e4 from 0x1635188..0x16351e9
     16351bd:	4c 89 ff             	mov    rdi,r15
     16351c0:	4c 89 f6             	mov    rsi,r14
     16351c3:	e8 b8 8e 1b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     16351c8:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     16351cc:	49 83 c6 18          	add    r14,0x18
     16351d0:	4c 89 f6             	mov    rsi,r14
     16351d3:	e8 a8 8e 1b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     16351d8:	48 83 c3 70          	add    rbx,0x70
     16351dc:	48 89 df             	mov    rdi,rbx
     16351df:	5b                   	pop    rbx
     16351e0:	41 5e                	pop    r14
     16351e2:	41 5f                	pop    r15
     16351e4:	e9 bf 38 4f ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     16351e9:	cc                   	int3
     16351ea:	41 56                	push   r14
     16351ec:	53                   	push   rbx
     16351ed:	50                   	push   rax
     16351ee:	48 89 f3             	mov    rbx,rsi
     16351f1:	49 89 fe             	mov    r14,rdi
     16351f4:	e8 af 35 53 ff       	call   b687a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5748>
     16351f9:	48 8d 05 c0 b2 25 00 	lea    rax,[rip+0x25b2c0]        # 18904c0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9198>
     1635200:	49 89 06             	mov    QWORD PTR [r14],rax
     1635203:	48 8d 05 46 b4 25 00 	lea    rax,[rip+0x25b446]        # 1890650 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9328>
     163520a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     163520e:	48 8d 05 6b b4 25 00 	lea    rax,[rip+0x25b46b]        # 1890680 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9358>
     1635215:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax

### 0x164166e from 0x1641666..0x164167d
     1641648:	00 00 
     164164a:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     164164f:	75 08                	jne    1641659 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c7c7>
     1641651:	48 83 c4 48          	add    rsp,0x48
     1641655:	5b                   	pop    rbx
     1641656:	41 5e                	pop    r14
     1641658:	c3                   	ret
     1641659:	e8 52 e4 1a 00       	call   17efab0 <__stack_chk_fail@plt>
     164165e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1641661:	e9 00 00 00 00       	jmp    1641666 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c7d4>
     1641666:	50                   	push   rax
     1641667:	48 81 c7 00 01 00 00 	add    rdi,0x100
     164166e:	e8 35 74 4e ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1641673:	58                   	pop    rax
     1641674:	c3                   	ret
     1641675:	48 89 c7             	mov    rdi,rax
     1641678:	e8 28 84 43 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     164167d:	cc                   	int3
     164167e:	55                   	push   rbp
     164167f:	41 57                	push   r15
     1641681:	41 56                	push   r14
     1641683:	41 55                	push   r13
     1641685:	41 54                	push   r12
     1641687:	53                   	push   rbx
     1641688:	48 83 ec 28          	sub    rsp,0x28
     164168c:	48 89 fb             	mov    rbx,rdi

### 0x1668713 from 0x16686d6..0x166873c
     16686ea:	e8 51 5a 18 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
     16686ef:	48 85 c0             	test   rax,rax
     16686f2:	74 26                	je     166871a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c886>
     16686f4:	48 89 c3             	mov    rbx,rax
     16686f7:	4d 8b 7f 10          	mov    r15,QWORD PTR [r15+0x10]
     16686fb:	4d 85 ff             	test   r15,r15
     16686fe:	74 1c                	je     166871c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c888>
     1668700:	49 8d 7f 68          	lea    rdi,[r15+0x68]
     1668704:	4c 89 f6             	mov    rsi,r14
     1668707:	e8 ac 1e 98 ff       	call   fea5b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b19ce>
     166870c:	49 83 c7 10          	add    r15,0x10
     1668710:	4c 89 ff             	mov    rdi,r15
     1668713:	e8 90 03 4c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     1668718:	eb 02                	jmp    166871c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c888>
     166871a:	31 db                	xor    ebx,ebx
     166871c:	48 89 df             	mov    rdi,rbx
     166871f:	5b                   	pop    rbx
     1668720:	41 5e                	pop    r14
     1668722:	41 5f                	pop    r15
     1668724:	e9 5d 5d 43 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     1668729:	49 89 c6             	mov    r14,rax
     166872c:	48 89 df             	mov    rdi,rbx
     166872f:	e8 52 5d 43 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1668734:	4c 89 f7             	mov    rdi,r14
     1668737:	e8 69 13 41 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     166873c:	8a 06                	mov    al,BYTE PTR [rsi]


## Compact subobject field accesses

## Candidate ContextPlayer gate writers

### 0xcb7a20..0xcbc937, base=r15, offsets=['438', '470']
- 0xcba836: +0x438 :: movdqu XMMWORD PTR [r15+0x438],xmm0
- 0xcba8e9: +0x470 WRITE :: mov    BYTE PTR [r15+0x470],dil

### 0xce0ce6..0xce0ed3, base=rbx, offsets=['438', '598']
- 0xce0dc0: +0x598 :: lea    rcx,[rbx+0x598]
- 0xce0e3a: +0x438 :: cmp    QWORD PTR [rbx+0x438],0x0
- 0xce0e56: +0x438 :: mov    rdi,QWORD PTR [rbx+0x438]

### 0xce5328..0xce5720, base=rbx, offsets=['438', '598']
- 0xce53ee: +0x598 :: lea    rdi,[rbx+0x598]
- 0xce562c: +0x438 :: cmp    QWORD PTR [rbx+0x438],0x0
- 0xce5663: +0x438 :: mov    r13,QWORD PTR [rbx+0x438]
- 0xce56bd: +0x438 :: mov    rdi,QWORD PTR [rbx+0x438]

### 0xdb0c12..0xdb2528, base=r12, offsets=['438', '470']
- 0xdb22d0: +0x470 :: lea    rdi,[r12+0x470]
- 0xdb22dd: +0x438 :: lea    rdi,[r12+0x438]

### 0xdbbdbc..0xdbcc85, base=r14, offsets=['438', '470']
- 0xdbbfb1: +0x438 :: mov    rax,QWORD PTR [r14+0x438]
- 0xdbc9bc: +0x470 :: mov    rsi,QWORD PTR [r14+0x470]
- 0xdbca43: +0x470 :: mov    rcx,QWORD PTR [r14+0x470]

### 0xe92f2c..0xe98f3b, base=r13, offsets=['470', '598']
- 0xe94762: +0x598 :: mov    rcx,QWORD PTR [r13+0x598]
- 0xe94945: +0x470 :: lea    rcx,[r13+0x470]
- 0xe961a4: +0x598 :: mov    rax,QWORD PTR [r13+0x598]
- 0xe96505: +0x470 :: movaps xmm0,XMMWORD PTR [r13+0x470]

### 0x10a6464..0x10a7f52, base=r14, offsets=['438', '470', '598']
- 0x10a67ca: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a6ba8: +0x598 :: mov    r15b,BYTE PTR [r14+0x598]
- 0x10a6dc2: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a703a: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a731c: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a73a4: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a7492: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a74a0: +0x470 :: cmp    BYTE PTR [r14+0x470],0x0
- 0x10a7582: +0x438 :: mov    rdi,QWORD PTR [r14+0x438]
- 0x10a75d0: +0x438 :: mov    rdi,QWORD PTR [r14+0x438]
- 0x10a761e: +0x438 :: mov    rdi,QWORD PTR [r14+0x438]
- 0x10a7ae7: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0

### 0x10a9668..0x10a969c, base=rdi, offsets=['438', '470', '598']
- 0x10a966e: +0x598 :: cmp    BYTE PTR [rdi+0x598],0x0
- 0x10a9677: +0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0x10a9680: +0x438 :: mov    rax,QWORD PTR [rdi+0x438]

### 0x11ef334..0x11f5af4, base=rbx, offsets=['438', '470', '598']
- 0x11efe1e: +0x438 WRITE :: mov    QWORD PTR [rbx+0x438],rax
- 0x11efe54: +0x470 :: lea    rdi,[rbx+0x470]
- 0x11f0098: +0x438 :: mov    r13,QWORD PTR [rbx+0x438]
- 0x11f02c3: +0x598 WRITE :: mov    QWORD PTR [rbx+0x598],rax

### 0x122ba2e..0x122c594, base=r13, offsets=['438', '470']
- 0x122c072: +0x438 WRITE :: mov    DWORD PTR [r13+0x438],ebp
- 0x122c079: +0x470 :: movdqu XMMWORD PTR [r13+0x470],xmm0

### 0x12cb106..0x12cbc74, base=rbx, offsets=['438', '470', '598']
- 0x12cb6e8: +0x438 :: movups XMMWORD PTR [rbx+0x438],xmm0
- 0x12cb719: +0x470 :: lea    rdi,[rbx+0x470]
- 0x12cb7f4: +0x598 :: movups XMMWORD PTR [rbx+0x598],xmm0
- 0x12cb9fb: +0x438 :: lea    r15,[rbx+0x438]

### 0x12ccf68..0x12cd22e, base=rbx, offsets=['438', '470']
- 0x12cd059: +0x470 :: lea    rdi,[rbx+0x470]
- 0x12cd07d: +0x438 :: lea    rdi,[rbx+0x438]

### 0x12cd240..0x12cf4c0, base=rbx, offsets=['438', '470']
- 0x12cdf18: +0x438 :: lea    rdi,[rbx+0x438]
- 0x12cdf95: +0x470 :: lea    rdi,[rbx+0x470]

### 0x13ac372..0x13adc94, base=rbx, offsets=['470', '598']
- 0x13acd5e: +0x470 :: lea    rdi,[rbx+0x470]
- 0x13ace52: +0x598 WRITE :: mov    BYTE PTR [rbx+0x598],cl

### 0x13bbbc2..0x13bc0d5, base=rbx, offsets=['438', '470', '598']
- 0x13bbcb5: +0x438 WRITE :: mov    BYTE PTR [rbx+0x438],bpl
- 0x13bbced: +0x470 WRITE :: and    DWORD PTR [rbx+0x470],0x0
- 0x13bbdfe: +0x598 WRITE :: mov    BYTE PTR [rbx+0x598],0x1

### 0x13bd65e..0x13be0db, base=r14, offsets=['438', '598']
- 0x13bd78f: +0x438 :: lea    rax,[r14+0x438]
- 0x13bd959: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x13bd9a0: +0x598 WRITE :: mov    BYTE PTR [r14+0x598],al
- 0x13bdb3a: +0x438 WRITE :: mov    QWORD PTR [r14+0x438],rcx

### 0x15229bc..0x1523550, base=r14, offsets=['438', '470']
- 0x15231a9: +0x438 :: mov    rdi,QWORD PTR [r14+0x438]
- 0x152323c: +0x470 :: mov    rdi,QWORD PTR [r14+0x470]

### 0x15229bc..0x1523550, base=rbx, offsets=['438', '470']
- 0x15231b7: +0x438 WRITE :: mov    QWORD PTR [rbx+0x438],rax
- 0x152324a: +0x470 WRITE :: mov    QWORD PTR [rbx+0x470],rax

## Known skip-next restriction condition

Native builder 0x10a6464 inserts ad_disallow into r14+0x14a0 (skip-next) only when:
    ContextPlayer[+0x598] != 0
    ContextPlayer[+0x470] != 0
The purpose of this report is to identify where those two bytes originate/change.
