# Service184 first-insertion provider 0x15da3b7

Proven caller contract at 0x1334484:
- rdi = rsp+0x2e0 destination
- rsi = pointer to 0x32f434 string/data
- rdx = rsp+0x4f0 source object
- rcx = rsp+0x3a0 source/config
- after return, destination +0x10 is moved into tagged payload and later becomes service184

## Target FDE: (22913975, 22914010)
 15da3b7:	f6 02 01             	test   BYTE PTR [rdx],0x1
 15da3ba:	74 06                	je     15da3c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f946>
 15da3bc:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
 15da3c0:	eb 03                	jmp    15da3c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f949>
 15da3c2:	48 ff c2             	inc    rdx
 15da3c5:	f6 01 01             	test   BYTE PTR [rcx],0x1
 15da3c8:	74 06                	je     15da3d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f954>
 15da3ca:	48 8b 49 10          	mov    rcx,QWORD PTR [rcx+0x10]
 15da3ce:	eb 03                	jmp    15da3d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f957>
 15da3d0:	48 ff c1             	inc    rcx
 15da3d3:	31 c0                	xor    eax,eax
 15da3d5:	e9 c0 18 20 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>

## Writes to destination-shaped first arg within target FDE
## Calls in provider FDE

## High-address constants / vptr-like materializations in provider FDE
## Heap allocations in provider FDE
## Direct callers of provider
### caller 0x12aca98; FDE=(19580904, 19582233)
     12aca43:	41 ff 54 24 20       	call   QWORD PTR [r12+0x20]
     12aca48:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     12aca4d:	48 85 c0             	test   rax,rax
     12aca50:	74 17                	je     12aca69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf1fed>
     12aca52:	0f b6 8c 24 30 02 00 	movzx  ecx,BYTE PTR [rsp+0x230]
     12aca59:	00 
     12aca5a:	f6 c1 01             	test   cl,0x1
     12aca5d:	74 7c                	je     12acadb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf205f>
     12aca5f:	48 8b 8c 24 38 02 00 	mov    rcx,QWORD PTR [rsp+0x238]
     12aca66:	00 
     12aca67:	eb 74                	jmp    12acadd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2061>
     12aca69:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     12aca6e:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     12aca73:	4c 89 f7             	mov    rdi,r14
     12aca76:	e8 af da 41 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     12aca7b:	48 8d 35 b2 29 08 ff 	lea    rsi,[rip+0xffffffffff0829b2]        # 32f434 <_ZTSSt12bad_any_cast@@Base-0x60d94>
     12aca82:	4c 8d bc 24 b0 03 00 	lea    r15,[rsp+0x3b0]
     12aca89:	00 
     12aca8a:	48 8d 8c 24 30 02 00 	lea    rcx,[rsp+0x230]
     12aca91:	00 
     12aca92:	4c 89 ff             	mov    rdi,r15
     12aca95:	4c 89 f2             	mov    rdx,r14
     12aca98:	e8 1a d9 32 00       	call   15da3b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f93b>
     12aca9d:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     12acaa1:	48 89 84 24 b0 02 00 	mov    QWORD PTR [rsp+0x2b0],rax
     12acaa8:	00 
     12acaa9:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
     12acaad:	0f 29 84 24 a0 02 00 	movaps XMMWORD PTR [rsp+0x2a0],xmm0
     12acab4:	00 
     12acab5:	0f 57 c0             	xorps  xmm0,xmm0
     12acab8:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     12acabd:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     12acac1:	83 a4 24 b8 02 00 00 	and    DWORD PTR [rsp+0x2b8],0x0
     12acac8:	00 
     12acac9:	4c 89 ff             	mov    rdi,r15
     12acacc:	e8 bf 13 54 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12acad1:	4c 89 f7             	mov    rdi,r14
     12acad4:	e8 b7 13 54 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12acad9:	eb 43                	jmp    12acb1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf20a2>
     12acadb:	d1 e9                	shr    ecx,1
     12acadd:	48 85 c9             	test   rcx,rcx
     12acae0:	74 40                	je     12acb22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf20a6>
     12acae2:	48 8b 84 24 40 02 00 	mov    rax,QWORD PTR [rsp+0x240]
     12acae9:	00 
     12acaea:	48 89 84 24 b0 02 00 	mov    QWORD PTR [rsp+0x2b0],rax
     12acaf1:	00 
     12acaf2:	0f 28 84 24 30 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x230]
     12acaf9:	00 
     12acafa:	0f 29 84 24 a0 02 00 	movaps XMMWORD PTR [rsp+0x2a0],xmm0
     12acb01:	00 
     12acb02:	0f 57 c0             	xorps  xmm0,xmm0
     12acb05:	0f 29 84 24 30 02 00 	movaps XMMWORD PTR [rsp+0x230],xmm0
     12acb0c:	00 
     12acb0d:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
     12acb14:	00 00 
     12acb16:	83 a4 24 b8 02 00 00 	and    DWORD PTR [rsp+0x2b8],0x0
     12acb1d:	00 

### caller 0x1334484; FDE=(20131328, 20138970)
     133443a:	4c 89 f0             	mov    rax,r14
     133443d:	48 81 c4 38 05 00 00 	add    rsp,0x538
     1334444:	5b                   	pop    rbx
     1334445:	41 5c                	pop    r12
     1334447:	41 5d                	pop    r13
     1334449:	41 5e                	pop    r14
     133444b:	41 5f                	pop    r15
     133444d:	5d                   	pop    rbp
     133444e:	c3                   	ret
     133444f:	48 8d 9c 24 f0 04 00 	lea    rbx,[rsp+0x4f0]
     1334456:	00 
     1334457:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
     133445e:	00 
     133445f:	48 89 df             	mov    rdi,rbx
     1334462:	e8 c3 60 39 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     1334467:	48 8d 35 c6 af ff fe 	lea    rsi,[rip+0xfffffffffeffafc6]        # 32f434 <_ZTSSt12bad_any_cast@@Base-0x60d94>
     133446e:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     1334475:	00 
     1334476:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
     133447d:	00 
     133447e:	4c 89 f7             	mov    rdi,r14
     1334481:	48 89 da             	mov    rdx,rbx
     1334484:	e8 2e 5f 2a 00       	call   15da3b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f93b>
     1334489:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     133448d:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
     1334494:	00 
     1334495:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
     133449a:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
     13344a1:	00 00 
     13344a3:	66 0f ef c0          	pxor   xmm0,xmm0
     13344a7:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     13344ac:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     13344b1:	83 a4 24 a8 02 00 00 	and    DWORD PTR [rsp+0x2a8],0x0
     13344b8:	00 
     13344b9:	4c 89 f7             	mov    rdi,r14
     13344bc:	e8 cf 99 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13344c1:	48 89 df             	mov    rdi,rbx
     13344c4:	e8 c7 99 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13344c9:	eb 47                	jmp    1334512 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a96>
     13344cb:	d1 e9                	shr    ecx,1
     13344cd:	48 85 c9             	test   rcx,rcx
     13344d0:	74 47                	je     1334519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a9d>
     13344d2:	48 8b 84 24 b0 03 00 	mov    rax,QWORD PTR [rsp+0x3b0]
     13344d9:	00 
     13344da:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
     13344e1:	00 
     13344e2:	66 0f 6f 84 24 a0 03 	movdqa xmm0,XMMWORD PTR [rsp+0x3a0]
     13344e9:	00 00 
     13344eb:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
     13344f2:	00 00 
     13344f4:	66 0f ef c0          	pxor   xmm0,xmm0
     13344f8:	66 0f 7f 84 24 a0 03 	movdqa XMMWORD PTR [rsp+0x3a0],xmm0
     13344ff:	00 00 
     1334501:	48 83 a4 24 b0 03 00 	and    QWORD PTR [rsp+0x3b0],0x0
     1334508:	00 00 
     133450a:	83 a4 24 a8 02 00 00 	and    DWORD PTR [rsp+0x2a8],0x0
     1334511:	00 

### caller 0x133652b; FDE=(20144732, 20145944)
     13364d4:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     13364d9:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     13364de:	4c 89 e6             	mov    rsi,r12
     13364e1:	4c 89 f2             	mov    rdx,r14
     13364e4:	41 ff 54 24 18       	call   QWORD PTR [r12+0x18]
     13364e9:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     13364ee:	48 85 c0             	test   rax,rax
     13364f1:	74 11                	je     1336504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ba88>
     13364f3:	0f b6 4c 24 60       	movzx  ecx,BYTE PTR [rsp+0x60]
     13364f8:	f6 c1 01             	test   cl,0x1
     13364fb:	74 71                	je     133656e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17baf2>
     13364fd:	48 8b 4c 24 68       	mov    rcx,QWORD PTR [rsp+0x68]
     1336502:	eb 6c                	jmp    1336570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17baf4>
     1336504:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     1336509:	4c 89 ff             	mov    rdi,r15
     133650c:	4c 89 f6             	mov    rsi,r14
     133650f:	e8 16 40 39 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     1336514:	48 8d 35 19 8f ff fe 	lea    rsi,[rip+0xfffffffffeff8f19]        # 32f434 <_ZTSSt12bad_any_cast@@Base-0x60d94>
     133651b:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
     1336520:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
     1336525:	4c 89 f7             	mov    rdi,r14
     1336528:	4c 89 fa             	mov    rdx,r15
     133652b:	e8 87 3e 2a 00       	call   15da3b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f93b>
     1336530:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1336534:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     133653b:	00 
     133653c:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
     1336540:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     1336547:	00 
     1336548:	0f 57 c0             	xorps  xmm0,xmm0
     133654b:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1336550:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1336554:	83 a4 24 98 00 00 00 	and    DWORD PTR [rsp+0x98],0x0
     133655b:	00 
     133655c:	4c 89 f7             	mov    rdi,r14
     133655f:	e8 2c 79 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1336564:	4c 89 ff             	mov    rdi,r15
     1336567:	e8 24 79 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133656c:	eb 37                	jmp    13365a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bb29>
     133656e:	d1 e9                	shr    ecx,1
     1336570:	48 85 c9             	test   rcx,rcx
     1336573:	74 34                	je     13365a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bb2d>
     1336575:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     133657a:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     1336581:	00 
     1336582:	0f 28 44 24 60       	movaps xmm0,XMMWORD PTR [rsp+0x60]
     1336587:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     133658e:	00 
     133658f:	0f 57 c0             	xorps  xmm0,xmm0
     1336592:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
     1336597:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
     133659d:	83 a4 24 98 00 00 00 	and    DWORD PTR [rsp+0x98],0x0
     13365a4:	00 
     13365a5:	b3 01                	mov    bl,0x1
     13365a7:	eb 70                	jmp    1336619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bb9d>
     13365a9:	48 83 64 24 58 00    	and    QWORD PTR [rsp+0x58],0x0
     13365af:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]

## Direct callees likely returning object pointers
