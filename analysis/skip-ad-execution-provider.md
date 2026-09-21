# Skip Ad lower execution provider trace

Proven chain:
0x11ee6b0: b8f02e(rbx) -> provider
0x11ee8f7..0x11ee902: provider->vtable[+0x28]() -> dependency
dependency becomes callee arg9 -> secondary dispatcher object+0x20
0x12044eb..f2: dependency->vtable[+0x68]() on exact "skip-ad"

## Provider getter b8f02e
FDE: 0xb8f02e..0xb8f05a size=0x2c
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

## Direct callers of b8f02e
### caller 0xb8ec45, FDE=(12119050, 12120109)
      b8ec0d:	41 56                	push   r14
      b8ec0f:	41 55                	push   r13
      b8ec11:	41 54                	push   r12
      b8ec13:	53                   	push   rbx
      b8ec14:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
      b8ec1b:	49 89 ce             	mov    r14,rcx
      b8ec1e:	49 89 d7             	mov    r15,rdx
      b8ec21:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
      b8ec26:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ec2d:	00 00 
      b8ec2f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      b8ec36:	00 
      b8ec37:	48 89 cf             	mov    rdi,rcx
      b8ec3a:	e8 03 93 ff ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
      b8ec3f:	48 89 c3             	mov    rbx,rax
      b8ec42:	4c 89 f7             	mov    rdi,r14
      b8ec45:	e8 e4 03 00 00       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      b8ec4a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b8ec4d:	48 89 c7             	mov    rdi,rax
      b8ec50:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      b8ec53:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b8ec58:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      b8ec5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b8ec60:	49 8b 6f 60          	mov    rbp,QWORD PTR [r15+0x60]
      b8ec64:	4d 8b af 80 00 00 00 	mov    r13,QWORD PTR [r15+0x80]
      b8ec6b:	4d 8b 77 68          	mov    r14,QWORD PTR [r15+0x68]
      b8ec6f:	48 8d 35 8a 91 7a ff 	lea    rsi,[rip+0xffffffffff7a918a]        # 337e00 <_ZTSSt12bad_any_cast@@Base-0x583c8>
      b8ec76:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      b8ec7b:	4c 89 ff             	mov    rdi,r15
      b8ec7e:	e8 fb ad ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b8ec83:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b8ec86:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      b8ec8b:	4c 89 f6             	mov    rsi,r14
      b8ec8e:	4c 89 fa             	mov    rdx,r15
      b8ec91:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8ec94:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b8ec97:	48 89 df             	mov    rdi,rbx
      b8ec9a:	ff 50 40             	call   QWORD PTR [rax+0x40]
      b8ec9d:	49 89 c7             	mov    r15,rax

### caller 0xc7d490, FDE=(13096030, 13096412)
      c7d45e:	55                   	push   rbp
      c7d45f:	41 57                	push   r15
      c7d461:	41 56                	push   r14
      c7d463:	41 55                	push   r13
      c7d465:	41 54                	push   r12
      c7d467:	53                   	push   rbx
      c7d468:	48 83 ec 28          	sub    rsp,0x28
      c7d46c:	49 89 cf             	mov    r15,rcx
      c7d46f:	49 89 d6             	mov    r14,rdx
      c7d472:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      c7d477:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c7d47e:	00 00 
      c7d480:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c7d485:	48 89 cf             	mov    rdi,rcx
      c7d488:	e8 4f 01 00 00       	call   c7d5dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca57c>
      c7d48d:	4c 89 ff             	mov    rdi,r15
      c7d490:	e8 99 1b f1 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      c7d495:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      c7d498:	48 89 c7             	mov    rdi,rax
      c7d49b:	ff 51 30             	call   QWORD PTR [rcx+0x30]
      c7d49e:	49 89 c4             	mov    r12,rax
      c7d4a1:	4c 89 ff             	mov    rdi,r15
      c7d4a4:	e8 f7 5e fd ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
      c7d4a9:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      c7d4ac:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      c7d4b1:	48 89 c6             	mov    rsi,rax
      c7d4b4:	ff 51 48             	call   QWORD PTR [rcx+0x48]
      c7d4b7:	4d 8b ae 80 00 00 00 	mov    r13,QWORD PTR [r14+0x80]
      c7d4be:	4d 8b be 38 01 00 00 	mov    r15,QWORD PTR [r14+0x138]
      c7d4c5:	6a 78                	push   0x78
      c7d4c7:	5f                   	pop    rdi
      c7d4c8:	e8 33 0a b7 00       	call   17edf00 <_Znwm@plt>
      c7d4cd:	49 89 c6             	mov    r14,rax
      c7d4d0:	48 8d 68 10          	lea    rbp,[rax+0x10]
      c7d4d4:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      c7d4d9:	0f 57 c9             	xorps  xmm1,xmm1
      c7d4dc:	0f 29 4c 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm1
      c7d4e1:	31 db                	xor    ebx,ebx
      c7d4e3:	88 58 08             	mov    BYTE PTR [rax+0x8],bl

### caller 0xe8c9d1, FDE=(15255132, 15263896)
      e8c994:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e8c997:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
      e8c99a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
      e8c99e:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
      e8c9a5:	00 
      e8c9a6:	e8 73 da 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
      e8c9ab:	48 8b bc 24 48 06 00 	mov    rdi,QWORD PTR [rsp+0x648]
      e8c9b2:	00 
      e8c9b3:	e8 ce 1a c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8c9b8:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e8c9bb:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e8c9c2:	00 
      e8c9c3:	4c 89 fe             	mov    rsi,r15
      e8c9c6:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e8c9c9:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
      e8c9ce:	4c 89 ef             	mov    rdi,r13
      e8c9d1:	e8 58 26 d0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      e8c9d6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8c9d9:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
      e8c9e0:	00 
      e8c9e1:	48 89 c6             	mov    rsi,rax
      e8c9e4:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      e8c9e7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      e8c9ec:	48 8b 75 58          	mov    rsi,QWORD PTR [rbp+0x58]
      e8c9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e8c9f3:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
      e8c9fa:	00 
      e8c9fb:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8c9fe:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
      e8ca02:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
      e8ca09:	00 
      e8ca0a:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
      e8ca0e:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e8ca13:	48 8b 45 68          	mov    rax,QWORD PTR [rbp+0x68]
      e8ca17:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e8ca1c:	48 8b 45 60          	mov    rax,QWORD PTR [rbp+0x60]
      e8ca20:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
      e8ca27:	00 
      e8ca28:	f3 0f 6f 85 d8 00 00 	movdqu xmm0,XMMWORD PTR [rbp+0xd8]

### caller 0x10885e3, FDE=(17335610, 17338257)
     10885ac:	49 89 c5             	mov    r13,rax
     10885af:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     10885b3:	48 89 ef             	mov    rdi,rbp
     10885b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10885b9:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     10885be:	48 89 df             	mov    rdi,rbx
     10885c1:	e8 34 92 b8 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
     10885c6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10885c9:	48 89 c7             	mov    rdi,rax
     10885cc:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10885cf:	48 89 c5             	mov    rbp,rax
     10885d2:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10885d5:	4c 89 f7             	mov    rdi,r14
     10885d8:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10885db:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10885e0:	48 89 df             	mov    rdi,rbx
     10885e3:	e8 46 6a b0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     10885e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10885eb:	48 89 c7             	mov    rdi,rax
     10885ee:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10885f1:	49 89 c6             	mov    r14,rax
     10885f4:	6a 28                	push   0x28
     10885f6:	5f                   	pop    rdi
     10885f7:	e8 04 59 76 00       	call   17edf00 <_Znwm@plt>
     10885fc:	48 89 c3             	mov    rbx,rax
     10885ff:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
     1088603:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1088608:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     108860c:	48 85 c0             	test   rax,rax
     108860f:	74 05                	je     1088616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24fa2c>
     1088611:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1088616:	41 0f 28 87 40 01 00 	movaps xmm0,XMMWORD PTR [r15+0x140]
     108861d:	00 
     108861e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1088623:	49 8b 87 48 01 00 00 	mov    rax,QWORD PTR [r15+0x148]
     108862a:	48 85 c0             	test   rax,rax
     108862d:	74 05                	je     1088634 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24fa4a>
     108862f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1088634:	41 8a 84 24 b8 00 00 	mov    al,BYTE PTR [r12+0xb8]

### caller 0x11ee6b0, FDE=(18802184, 18804775)
     11ee66e:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
     11ee675:	00 
     11ee676:	48 89 df             	mov    rdi,rbx
     11ee679:	e8 28 05 e8 ff       	call   106eba6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235fbc>
     11ee67e:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11ee683:	48 89 df             	mov    rdi,rbx
     11ee686:	e8 15 4d a6 ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
     11ee68b:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     11ee692:	00 
     11ee693:	48 89 df             	mov    rdi,rbx
     11ee696:	e8 05 4c 97 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     11ee69b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
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

### caller 0x1442026, FDE=(21241846, 21243183)
     1441ff5:	cc                   	int3
     1441ff6:	55                   	push   rbp
     1441ff7:	41 57                	push   r15
     1441ff9:	41 56                	push   r14
     1441ffb:	41 55                	push   r13
     1441ffd:	41 54                	push   r12
     1441fff:	53                   	push   rbx
     1442000:	48 81 ec 68 01 00 00 	sub    rsp,0x168
     1442007:	49 89 ce             	mov    r14,rcx
     144200a:	48 89 d3             	mov    rbx,rdx
     144200d:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
     1442012:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1442019:	00 00 
     144201b:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     1442022:	00 
     1442023:	48 89 cf             	mov    rdi,rcx
     1442026:	e8 03 d0 74 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     144202b:	49 89 c7             	mov    r15,rax
     144202e:	4c 89 f7             	mov    rdi,r14
     1442031:	e8 e6 a2 83 ff       	call   c7c31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c92bc>
     1442036:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     144203a:	4c 89 f7             	mov    rdi,r14
     144203d:	e8 d2 5f 74 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
     1442042:	49 89 c4             	mov    r12,rax
     1442045:	4c 89 f7             	mov    rdi,r14
     1442048:	e8 f5 5e 74 ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
     144204d:	49 89 c5             	mov    r13,rax
     1442050:	4c 89 f7             	mov    rdi,r14
     1442053:	e8 64 39 c3 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
     1442058:	48 89 c5             	mov    rbp,rax
     144205b:	49 8b 07             	mov    rax,QWORD PTR [r15]
     144205e:	4c 89 ff             	mov    rdi,r15
     1442061:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1442064:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1442069:	48 8b 83 50 01 00 00 	mov    rax,QWORD PTR [rbx+0x150]
     1442070:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1442075:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1442079:	4c 89 e7             	mov    rdi,r12
     144207c:	ff 50 40             	call   QWORD PTR [rax+0x40]

## Field-offset clues inside b8f02e
      b8f032:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b8f036:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]

## Indirect +0x28 calls near construction family
### 0x11e85fe; FDE=(18777460, 18777783)
     11e85d5:	48 39 f0             	cmp    rax,rsi
     11e85d8:	74 0a                	je     11e85e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2db68>
     11e85da:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     11e85df:	e8 fc 74 60 00       	call   17efae0 <memmove@plt>
     11e85e4:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     11e85e8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11e85eb:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
     11e85f0:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
     11e85f5:	6a 10                	push   0x10
     11e85f7:	59                   	pop    rcx
     11e85f8:	4c 89 ee             	mov    rsi,r13
     11e85fb:	48 89 ea             	mov    rdx,rbp
     11e85fe:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11e8601:	48 8d 44 24 2f       	lea    rax,[rsp+0x2f]
     11e8606:	c6 00 00             	mov    BYTE PTR [rax],0x0
     11e8609:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11e860e:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
     11e8613:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12
     11e8618:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
     11e861d:	4d 8b 67 20          	mov    r12,QWORD PTR [r15+0x20]
     11e8621:	4d 8b 6f 28          	mov    r13,QWORD PTR [r15+0x28]
     11e8625:	4d 39 ec             	cmp    r12,r13
     11e8628:	74 6f                	je     11e8699 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dc1d>
     11e862a:	31 c0                	xor    eax,eax
     11e862c:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     11e8631:	41 8b 2c 24          	mov    ebp,DWORD PTR [r12]
     11e8635:	41 8b 54 24 04       	mov    edx,DWORD PTR [r12+0x4]
     11e863a:	48 01 c5             	add    rbp,rax
     11e863d:	48 8d 04 2a          	lea    rax,[rdx+rbp*1]
     11e8641:	48 39 d8             	cmp    rax,rbx
     11e8644:	77 27                	ja     11e866d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dbf1>

### 0x11e870e; FDE=(18777784, 18777927)
     11e86ef:	59                   	pop    rcx
     11e86f0:	85 c9                	test   ecx,ecx
     11e86f2:	78 09                	js     11e86fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dc81>
     11e86f4:	89 ca                	mov    edx,ecx
     11e86f6:	ff c9                	dec    ecx
     11e86f8:	fe 04 10             	inc    BYTE PTR [rax+rdx*1]
     11e86fb:	74 f3                	je     11e86f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dc74>
     11e86fd:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     11e8701:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     11e8705:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
     11e8709:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11e870c:	89 e9                	mov    ecx,ebp
     11e870e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11e8711:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11e8714:	c6 00 00             	mov    BYTE PTR [rax],0x0
     11e8717:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11e871a:	8a 08                	mov    cl,BYTE PTR [rax]
     11e871c:	49 8b 57 18          	mov    rdx,QWORD PTR [r15+0x18]
     11e8720:	8d 71 01             	lea    esi,[rcx+0x1]
     11e8723:	40 88 30             	mov    BYTE PTR [rax],sil
     11e8726:	0f b6 c1             	movzx  eax,cl
     11e8729:	8a 04 02             	mov    al,BYTE PTR [rdx+rax*1]
     11e872c:	43 30 04 2e          	xor    BYTE PTR [r14+r13*1],al
     11e8730:	49 ff c5             	inc    r13
     11e8733:	49 39 dd             	cmp    r13,rbx
     11e8736:	75 a7                	jne    11e86df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dc63>
     11e8738:	48 83 c4 08          	add    rsp,0x8
     11e873c:	5b                   	pop    rbx
     11e873d:	41 5c                	pop    r12
     11e873f:	41 5d                	pop    r13
     11e8741:	41 5e                	pop    r14

### 0x11e8c27; FDE=(18779136, 18779188)
     11e8c01:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11e8c04:	48 85 c0             	test   rax,rax
     11e8c07:	75 21                	jne    11e8c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e1ae>
     11e8c09:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     11e8c0d:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     11e8c11:	48 29 cf             	sub    rdi,rcx
     11e8c14:	48 c1 ff 03          	sar    rdi,0x3
     11e8c18:	48 89 f0             	mov    rax,rsi
     11e8c1b:	31 d2                	xor    edx,edx
     11e8c1d:	48 f7 f7             	div    rdi
     11e8c20:	48 8b 3c d1          	mov    rdi,QWORD PTR [rcx+rdx*8]
     11e8c24:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11e8c27:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11e8c2a:	59                   	pop    rcx
     11e8c2b:	c3                   	ret
     11e8c2c:	48 89 c7             	mov    rdi,rax
     11e8c2f:	e8 71 0e 89 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     11e8c34:	55                   	push   rbp
     11e8c35:	41 57                	push   r15
     11e8c37:	41 56                	push   r14
     11e8c39:	41 55                	push   r13
     11e8c3b:	41 54                	push   r12
     11e8c3d:	53                   	push   rbx
     11e8c3e:	48 83 ec 38          	sub    rsp,0x38
     11e8c42:	4c 89 04 24          	mov    QWORD PTR [rsp],r8
     11e8c46:	49 89 cc             	mov    r12,rcx
     11e8c49:	49 89 d5             	mov    r13,rdx
     11e8c4c:	49 89 f6             	mov    r14,rsi
     11e8c4f:	49 89 ff             	mov    r15,rdi
     11e8c52:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11e8c59:	00 00 

### 0x11e99ef; FDE=(18782368, 18783427)
     11e99c2:	66 0f 29 44 24 60    	movapd XMMWORD PTR [rsp+0x60],xmm0
     11e99c8:	eb 0e                	jmp    11e99d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ef5c>
     11e99ca:	66 0f 29 54 24 60    	movapd XMMWORD PTR [rsp+0x60],xmm2
     11e99d0:	f2 0f 10 05 70 56 1a 	movsd  xmm0,QWORD PTR [rip+0xffffffffff1a5670]        # 38f048 <_ZTSSt12bad_any_cast@@Base-0x1180>
     11e99d7:	ff 
     11e99d8:	66 0f 29 44 24 50    	movapd XMMWORD PTR [rsp+0x50],xmm0
     11e99de:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     11e99e1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11e99e4:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11e99e7:	89 c3                	mov    ebx,eax
     11e99e9:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     11e99ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11e99ef:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11e99f2:	39 c3                	cmp    ebx,eax
     11e99f4:	0f 47 c3             	cmova  eax,ebx
     11e99f7:	85 c0                	test   eax,eax
     11e99f9:	66 0f 28 54 24 60    	movapd xmm2,XMMWORD PTR [rsp+0x60]
     11e99ff:	66 0f 28 5c 24 50    	movapd xmm3,XMMWORD PTR [rsp+0x50]
     11e9a05:	0f 84 92 01 00 00    	je     11e9b9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f121>
     11e9a0b:	f2 48 0f 2a c5       	cvtsi2sd xmm0,rbp
     11e9a10:	f2 0f 5e 05 c8 59 1a 	divsd  xmm0,QWORD PTR [rip+0xffffffffff1a59c8]        # 38f3e0 <_ZTSSt12bad_any_cast@@Base-0xde8>
     11e9a17:	ff 
     11e9a18:	89 c0                	mov    eax,eax
     11e9a1a:	f2 48 0f 2a c8       	cvtsi2sd xmm1,rax
     11e9a1f:	f2 0f 59 c8          	mulsd  xmm1,xmm0
     11e9a23:	f2 0f 59 0d e5 55 1a 	mulsd  xmm1,QWORD PTR [rip+0xffffffffff1a55e5]        # 38f010 <_ZTSSt12bad_any_cast@@Base-0x11b8>
     11e9a2a:	ff 
     11e9a2b:	f2 0f 5c ca          	subsd  xmm1,xmm2
     11e9a2f:	f2 0f 5f d9          	maxsd  xmm3,xmm1
     11e9a33:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     11e9a38:	66 0f 57 c0          	xorpd  xmm0,xmm0

### 0x11edefe; FDE=(18800286, 18800463)
     11eded2:	4d 8d 67 30          	lea    r12,[r15+0x30]
     11eded6:	4c 89 e7             	mov    rdi,r12
     11eded9:	e8 12 02 60 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     11edede:	4d 8b bf a8 00 00 00 	mov    r15,QWORD PTR [r15+0xa8]
     11edee5:	4c 89 e7             	mov    rdi,r12
     11edee8:	e8 13 02 60 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
     11edeed:	4d 85 ff             	test   r15,r15
     11edef0:	74 0f                	je     11edf01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33485>
     11edef2:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11edef5:	4c 89 ff             	mov    rdi,r15
     11edef8:	4c 89 f6             	mov    rsi,r14
     11edefb:	48 89 da             	mov    rdx,rbx
     11edefe:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11edf01:	48 89 e7             	mov    rdi,rsp
     11edf04:	e8 27 df 8b ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     11edf09:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11edf10:	00 00 
     11edf12:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     11edf17:	75 31                	jne    11edf4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334ce>
     11edf19:	48 83 c4 18          	add    rsp,0x18
     11edf1d:	5b                   	pop    rbx
     11edf1e:	41 5c                	pop    r12
     11edf20:	41 5e                	pop    r14
     11edf22:	41 5f                	pop    r15
     11edf24:	c3                   	ret
     11edf25:	eb 00                	jmp    11edf27 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334ab>
     11edf27:	48 89 c3             	mov    rbx,rax
     11edf2a:	48 89 e7             	mov    rdi,rsp
     11edf2d:	e8 fe de 8b ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     11edf32:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11edf39:	00 00 

### 0x11ee8ad; FDE=(18802184, 18804775)
     11ee87b:	48 89 df             	mov    rdi,rbx
     11ee87e:	e8 69 00 ca ff       	call   e8e8ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d02>
     11ee883:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11ee888:	48 89 df             	mov    rdi,rbx
     11ee88b:	e8 c0 2e a2 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
     11ee890:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11ee895:	48 89 df             	mov    rdi,rbx
     11ee898:	e8 1f 71 e8 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
     11ee89d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     11ee8a4:	00 
     11ee8a5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     11ee8aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ad:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8b0:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     11ee8b7:	00 
     11ee8b8:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     11ee8bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8c0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8c3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11ee8ca:	00 
     11ee8cb:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     11ee8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8d3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8d6:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ee8db:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     11ee8e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8e3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ee8e6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ee8e9:	48 89 c7             	mov    rdi,rax
     11ee8ec:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
     11ee8f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax

### 0x11ee8c0; FDE=(18802184, 18804775)
     11ee890:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11ee895:	48 89 df             	mov    rdi,rbx
     11ee898:	e8 1f 71 e8 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
     11ee89d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     11ee8a4:	00 
     11ee8a5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     11ee8aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ad:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8b0:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     11ee8b7:	00 
     11ee8b8:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     11ee8bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8c0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8c3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11ee8ca:	00 
     11ee8cb:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     11ee8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8d3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8d6:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ee8db:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     11ee8e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8e3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ee8e6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ee8e9:	48 89 c7             	mov    rdi,rax
     11ee8ec:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
     11ee8f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11ee8f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     11ee8fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee902:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee907:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]

### 0x11ee8d3; FDE=(18802184, 18804775)
     11ee8a5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     11ee8aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ad:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8b0:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     11ee8b7:	00 
     11ee8b8:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     11ee8bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8c0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8c3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11ee8ca:	00 
     11ee8cb:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     11ee8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8d3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8d6:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ee8db:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     11ee8e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8e3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ee8e6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ee8e9:	48 89 c7             	mov    rdi,rax
     11ee8ec:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
     11ee8f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11ee8f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     11ee8fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee902:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee907:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
     11ee90b:	48 8d 35 4d 8d 19 ff 	lea    rsi,[rip+0xffffffffff198d4d]        # 38765f <_ZTSSt12bad_any_cast@@Base-0x8b69>
     11ee912:	4c 8d bc 24 38 02 00 	lea    r15,[rsp+0x238]
     11ee919:	00 
     11ee91a:	4c 89 ff             	mov    rdi,r15
     11ee91d:	e8 5c b1 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>

### 0x11ee8ff; FDE=(18802184, 18804775)
     11ee8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8d3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8d6:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ee8db:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     11ee8e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8e3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ee8e6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ee8e9:	48 89 c7             	mov    rdi,rax
     11ee8ec:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
     11ee8f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11ee8f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     11ee8fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee902:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee907:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
     11ee90b:	48 8d 35 4d 8d 19 ff 	lea    rsi,[rip+0xffffffffff198d4d]        # 38765f <_ZTSSt12bad_any_cast@@Base-0x8b69>
     11ee912:	4c 8d bc 24 38 02 00 	lea    r15,[rsp+0x238]
     11ee919:	00 
     11ee91a:	4c 89 ff             	mov    rdi,r15
     11ee91d:	e8 5c b1 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11ee922:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee925:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     11ee92c:	00 
     11ee92d:	48 89 de             	mov    rsi,rbx
     11ee930:	4c 89 fa             	mov    rdx,r15
     11ee933:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11ee936:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
     11ee93d:	4d 8b bd 98 00 00 00 	mov    r15,QWORD PTR [r13+0x98]
     11ee944:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee948:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     11ee94f:	00 

### 0x11ee953; FDE=(18802184, 18804775)
     11ee922:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee925:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     11ee92c:	00 
     11ee92d:	48 89 de             	mov    rsi,rbx
     11ee930:	4c 89 fa             	mov    rdx,r15
     11ee933:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11ee936:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
     11ee93d:	4d 8b bd 98 00 00 00 	mov    r15,QWORD PTR [r13+0x98]
     11ee944:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee948:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     11ee94f:	00 
     11ee950:	48 89 ee             	mov    rsi,rbp
     11ee953:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee956:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee95a:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     11ee961:	00 
     11ee962:	48 89 ee             	mov    rsi,rbp
     11ee965:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11ee968:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     11ee96d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee970:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee973:	48 89 c5             	mov    rbp,rax
     11ee976:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     11ee97b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee97e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee981:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee986:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]
     11ee98a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11ee98f:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
     11ee993:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee998:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]

### 0x11ee970; FDE=(18802184, 18804775)
     11ee944:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee948:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     11ee94f:	00 
     11ee950:	48 89 ee             	mov    rsi,rbp
     11ee953:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee956:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee95a:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     11ee961:	00 
     11ee962:	48 89 ee             	mov    rsi,rbp
     11ee965:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11ee968:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     11ee96d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee970:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee973:	48 89 c5             	mov    rbp,rax
     11ee976:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     11ee97b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee97e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee981:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee986:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]
     11ee98a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11ee98f:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
     11ee993:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee998:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     11ee99d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9a0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9a3:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11ee9a8:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     11ee9ac:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     11ee9b3:	00 
     11ee9b4:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
     11ee9bb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax

### 0x11ee97e; FDE=(18802184, 18804775)
     11ee953:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee956:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee95a:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     11ee961:	00 
     11ee962:	48 89 ee             	mov    rsi,rbp
     11ee965:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11ee968:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     11ee96d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee970:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee973:	48 89 c5             	mov    rbp,rax
     11ee976:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     11ee97b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee97e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee981:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee986:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]
     11ee98a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11ee98f:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
     11ee993:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee998:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     11ee99d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9a0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9a3:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11ee9a8:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     11ee9ac:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     11ee9b3:	00 
     11ee9b4:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
     11ee9bb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee9c0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     11ee9c5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ee9c8:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     11ee9cf:	00 

### 0x11ee9a0; FDE=(18802184, 18804775)
     11ee970:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee973:	48 89 c5             	mov    rbp,rax
     11ee976:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     11ee97b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee97e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee981:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee986:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]
     11ee98a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11ee98f:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
     11ee993:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee998:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     11ee99d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9a0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9a3:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11ee9a8:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     11ee9ac:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     11ee9b3:	00 
     11ee9b4:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
     11ee9bb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee9c0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     11ee9c5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ee9c8:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     11ee9cf:	00 
     11ee9d0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9d6:	4c 89 f7             	mov    rdi,r14
     11ee9d9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9dc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee9e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9e4:	4c 89 f7             	mov    rdi,r14
     11ee9e7:	ff 50 28             	call   QWORD PTR [rax+0x28]

### 0x11ee9d0; FDE=(18802184, 18804775)
     11ee99d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9a0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9a3:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11ee9a8:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     11ee9ac:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     11ee9b3:	00 
     11ee9b4:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
     11ee9bb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee9c0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     11ee9c5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ee9c8:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     11ee9cf:	00 
     11ee9d0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9d6:	4c 89 f7             	mov    rdi,r14
     11ee9d9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9dc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee9e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9e4:	4c 89 f7             	mov    rdi,r14
     11ee9e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9ea:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     11ee9f1:	00 
     11ee9f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     11ee9f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9fa:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9fd:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11eea02:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
     11eea09:	00 
     11eea0a:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     11eea11:	00 
     11eea12:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]

### 0x11ee9d9; FDE=(18802184, 18804775)
     11ee9a8:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     11ee9ac:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     11ee9b3:	00 
     11ee9b4:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
     11ee9bb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee9c0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     11ee9c5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ee9c8:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     11ee9cf:	00 
     11ee9d0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9d6:	4c 89 f7             	mov    rdi,r14
     11ee9d9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9dc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee9e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9e4:	4c 89 f7             	mov    rdi,r14
     11ee9e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9ea:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     11ee9f1:	00 
     11ee9f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     11ee9f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9fa:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9fd:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11eea02:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
     11eea09:	00 
     11eea0a:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     11eea11:	00 
     11eea12:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11eea17:	48 8b 88 b0 00 00 00 	mov    rcx,QWORD PTR [rax+0xb0]
     11eea1e:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     11eea25:	00 

### 0x11ee9e7; FDE=(18802184, 18804775)
     11ee9bb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee9c0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     11ee9c5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ee9c8:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     11ee9cf:	00 
     11ee9d0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9d6:	4c 89 f7             	mov    rdi,r14
     11ee9d9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9dc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee9e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9e4:	4c 89 f7             	mov    rdi,r14
     11ee9e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9ea:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     11ee9f1:	00 
     11ee9f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     11ee9f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9fa:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9fd:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11eea02:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
     11eea09:	00 
     11eea0a:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     11eea11:	00 
     11eea12:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11eea17:	48 8b 88 b0 00 00 00 	mov    rcx,QWORD PTR [rax+0xb0]
     11eea1e:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     11eea25:	00 
     11eea26:	48 8b 80 b8 00 00 00 	mov    rax,QWORD PTR [rax+0xb8]
     11eea2d:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     11eea32:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
     11eea36:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax

### 0x11ee9fa; FDE=(18802184, 18804775)
     11ee9d0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9d6:	4c 89 f7             	mov    rdi,r14
     11ee9d9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9dc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee9e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9e4:	4c 89 f7             	mov    rdi,r14
     11ee9e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9ea:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     11ee9f1:	00 
     11ee9f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     11ee9f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9fa:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9fd:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11eea02:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
     11eea09:	00 
     11eea0a:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     11eea11:	00 
     11eea12:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11eea17:	48 8b 88 b0 00 00 00 	mov    rcx,QWORD PTR [rax+0xb0]
     11eea1e:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     11eea25:	00 
     11eea26:	48 8b 80 b8 00 00 00 	mov    rax,QWORD PTR [rax+0xb8]
     11eea2d:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     11eea32:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
     11eea36:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     11eea3d:	00 
     11eea3e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11eea42:	4c 89 e7             	mov    rdi,r12
     11eea45:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11eea48:	49 89 c6             	mov    r14,rax

### 0x11eea5a; FDE=(18802184, 18804775)
     11eea2d:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     11eea32:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
     11eea36:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     11eea3d:	00 
     11eea3e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11eea42:	4c 89 e7             	mov    rdi,r12
     11eea45:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11eea48:	49 89 c6             	mov    r14,rax
     11eea4b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11eea4f:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11eea56:	00 
     11eea57:	4c 89 e6             	mov    rsi,r12
     11eea5a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eea5d:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
     11eea64:	bf 10 02 00 00       	mov    edi,0x210
     11eea69:	e8 92 f4 5f 00       	call   17edf00 <_Znwm@plt>
     11eea6e:	49 89 c7             	mov    r15,rax
     11eea71:	48 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rbp
     11eea78:	00 
     11eea79:	0f 57 c0             	xorps  xmm0,xmm0
     11eea7c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     11eea80:	48 8d 05 89 ce 66 00 	lea    rax,[rip+0x66ce89]        # 185b910 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17ff8>
     11eea87:	49 89 07             	mov    QWORD PTR [r15],rax
     11eea8a:	4d 8d 67 18          	lea    r12,[r15+0x18]
     11eea8e:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     11eea95:	00 
     11eea96:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
     11eea9d:	00 
     11eea9e:	ba b0 00 00 00       	mov    edx,0xb0
     11eeaa3:	e8 28 10 60 00       	call   17efad0 <memcpy@plt>
     11eeaa8:	4c 89 24 24          	mov    QWORD PTR [rsp],r12

### 0x11eebbb; FDE=(18802184, 18804775)
     11eeb83:	41 c7 87 f0 01 00 00 	mov    DWORD PTR [r15+0x1f0],0x3
     11eeb8a:	03 00 00 00 
     11eeb8e:	49 c7 87 f8 01 00 00 	mov    QWORD PTR [r15+0x1f8],0x5
     11eeb95:	05 00 00 00 
     11eeb99:	49 8d bf 00 02 00 00 	lea    rdi,[r15+0x200]
     11eeba0:	e8 85 6b 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     11eeba5:	31 ff                	xor    edi,edi
     11eeba7:	e8 70 f8 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11eebac:	49 8b 75 58          	mov    rsi,QWORD PTR [r13+0x58]
     11eebb0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11eebb3:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eebba:	00 
     11eebbb:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebbe:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11eebc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebc9:	49 89 c6             	mov    r14,rax
     11eebcc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eebd1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebd4:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebd7:	49 89 c4             	mov    r12,rax
     11eebda:	bf c0 5d 00 00       	mov    edi,0x5dc0
     11eebdf:	e8 1c f3 5f 00       	call   17edf00 <_Znwm@plt>
     11eebe4:	48 89 c7             	mov    rdi,rax
     11eebe7:	66 49 0f 6e c7       	movq   xmm0,r15
     11eebec:	f3 0f 7e 0c 24       	movq   xmm1,QWORD PTR [rsp]
     11eebf1:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     11eebf5:	48 8b 8c 24 28 02 00 	mov    rcx,QWORD PTR [rsp+0x228]
     11eebfc:	00 
     11eebfd:	0f 28 84 24 20 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x220]
     11eec04:	00 

### 0x11eebc6; FDE=(18802184, 18804775)
     11eeb95:	05 00 00 00 
     11eeb99:	49 8d bf 00 02 00 00 	lea    rdi,[r15+0x200]
     11eeba0:	e8 85 6b 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     11eeba5:	31 ff                	xor    edi,edi
     11eeba7:	e8 70 f8 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11eebac:	49 8b 75 58          	mov    rsi,QWORD PTR [r13+0x58]
     11eebb0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11eebb3:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eebba:	00 
     11eebbb:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebbe:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11eebc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebc9:	49 89 c6             	mov    r14,rax
     11eebcc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eebd1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebd4:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebd7:	49 89 c4             	mov    r12,rax
     11eebda:	bf c0 5d 00 00       	mov    edi,0x5dc0
     11eebdf:	e8 1c f3 5f 00       	call   17edf00 <_Znwm@plt>
     11eebe4:	48 89 c7             	mov    rdi,rax
     11eebe7:	66 49 0f 6e c7       	movq   xmm0,r15
     11eebec:	f3 0f 7e 0c 24       	movq   xmm1,QWORD PTR [rsp]
     11eebf1:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     11eebf5:	48 8b 8c 24 28 02 00 	mov    rcx,QWORD PTR [rsp+0x228]
     11eebfc:	00 
     11eebfd:	0f 28 84 24 20 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x220]
     11eec04:	00 
     11eec05:	0f 29 84 24 a0 02 00 	movaps XMMWORD PTR [rsp+0x2a0],xmm0
     11eec0c:	00 
     11eec0d:	0f 57 c0             	xorps  xmm0,xmm0

### 0x11eebd4; FDE=(18802184, 18804775)
     11eeba7:	e8 70 f8 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11eebac:	49 8b 75 58          	mov    rsi,QWORD PTR [r13+0x58]
     11eebb0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11eebb3:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eebba:	00 
     11eebbb:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebbe:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11eebc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebc9:	49 89 c6             	mov    r14,rax
     11eebcc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eebd1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebd4:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebd7:	49 89 c4             	mov    r12,rax
     11eebda:	bf c0 5d 00 00       	mov    edi,0x5dc0
     11eebdf:	e8 1c f3 5f 00       	call   17edf00 <_Znwm@plt>
     11eebe4:	48 89 c7             	mov    rdi,rax
     11eebe7:	66 49 0f 6e c7       	movq   xmm0,r15
     11eebec:	f3 0f 7e 0c 24       	movq   xmm1,QWORD PTR [rsp]
     11eebf1:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     11eebf5:	48 8b 8c 24 28 02 00 	mov    rcx,QWORD PTR [rsp+0x228]
     11eebfc:	00 
     11eebfd:	0f 28 84 24 20 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x220]
     11eec04:	00 
     11eec05:	0f 29 84 24 a0 02 00 	movaps XMMWORD PTR [rsp+0x2a0],xmm0
     11eec0c:	00 
     11eec0d:	0f 57 c0             	xorps  xmm0,xmm0
     11eec10:	0f 29 84 24 20 02 00 	movaps XMMWORD PTR [rsp+0x220],xmm0
     11eec17:	00 
     11eec18:	48 8b 94 24 18 02 00 	mov    rdx,QWORD PTR [rsp+0x218]
     11eec1f:	00 

### 0x11ef3d5; FDE=(18805556, 18832116)
     11ef39c:	48 8d 05 d7 3a 96 ff 	lea    rax,[rip+0xffffffffff963ad7]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11ef3a3:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     11ef3a7:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
     11ef3ab:	48 8d 05 16 c7 66 00 	lea    rax,[rip+0x66c716]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
     11ef3b2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     11ef3bd:	00 
     11ef3be:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     11ef3c7:	48 8b 86 fc 00 00 00 	mov    rax,QWORD PTR [rsi+0xfc]
     11ef3ce:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
     11ef3d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ef3d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ef3d8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ef3db:	48 89 c7             	mov    rdi,rax
     11ef3de:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11ef3e1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ef3e6:	48 83 a4 24 c0 04 00 	and    QWORD PTR [rsp+0x4c0],0x0
     11ef3ed:	00 00 
     11ef3ef:	48 8d 05 ea 89 7e ff 	lea    rax,[rip+0xffffffffff7e89ea]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11ef3f6:	48 89 84 24 d0 04 00 	mov    QWORD PTR [rsp+0x4d0],rax
     11ef3fd:	00 
     11ef3fe:	48 8d 05 45 1e a8 ff 	lea    rax,[rip+0xffffffffffa81e45]        # c7124a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be1ea>
     11ef405:	48 89 84 24 d8 04 00 	mov    QWORD PTR [rsp+0x4d8],rax
     11ef40c:	00 
     11ef40d:	48 8d 35 76 e8 17 ff 	lea    rsi,[rip+0xffffffffff17e876]        # 36dc8a <_ZTSSt12bad_any_cast@@Base-0x2253e>
     11ef414:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     11ef41b:	00 
     11ef41c:	e8 5d a6 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11ef421:	48 8b b4 24 78 06 00 	mov    rsi,QWORD PTR [rsp+0x678]
     11ef428:	00 

### 0x11efda9; FDE=(18805556, 18832116)
     11efd7d:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
     11efd84:	00 
     11efd85:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11efd88:	48 8b 84 24 88 06 00 	mov    rax,QWORD PTR [rsp+0x688]
     11efd8f:	00 
     11efd90:	48 8b 8c 24 80 06 00 	mov    rcx,QWORD PTR [rsp+0x680]
     11efd97:	00 
     11efd98:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11efd9f:	00 
     11efda0:	4c 8b 21             	mov    r12,QWORD PTR [rcx]
     11efda3:	4c 8b 28             	mov    r13,QWORD PTR [rax]
     11efda6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11efda9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11efdac:	48 8b 94 24 c0 06 00 	mov    rdx,QWORD PTR [rsp+0x6c0]
     11efdb3:	00 
     11efdb4:	44 0f b7 b3 fc 03 00 	movzx  r14d,WORD PTR [rbx+0x3fc]
     11efdbb:	00 
     11efdbc:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11efdc1:	44 8a 79 02          	mov    r15b,BYTE PTR [rcx+0x2]
     11efdc5:	48 8d 0d 84 ee 66 00 	lea    rcx,[rip+0x66ee84]        # 185ec50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b338>
     11efdcc:	48 89 8b 00 04 00 00 	mov    QWORD PTR [rbx+0x400],rcx
     11efdd3:	48 8b 8c 24 40 02 00 	mov    rcx,QWORD PTR [rsp+0x240]
     11efdda:	00 
     11efddb:	48 89 8b 18 04 00 00 	mov    QWORD PTR [rbx+0x418],rcx
     11efde2:	66 0f 6f 84 24 30 02 	movdqa xmm0,XMMWORD PTR [rsp+0x230]
     11efde9:	00 00 
     11efdeb:	f3 0f 7f 83 08 04 00 	movdqu XMMWORD PTR [rbx+0x408],xmm0
     11efdf2:	00 
     11efdf3:	66 0f ef c0          	pxor   xmm0,xmm0
     11efdf7:	66 0f 7f 84 24 30 02 	movdqa XMMWORD PTR [rsp+0x230],xmm0
     11efdfe:	00 00 

### 0x11f02a6; FDE=(18805556, 18832116)
     11f027c:	4c 89 ff             	mov    rdi,r15
     11f027f:	e8 2a 59 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f0284:	4c 89 e7             	mov    rdi,r12
     11f0287:	e8 22 59 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f028c:	4c 8b bc 24 70 06 00 	mov    r15,QWORD PTR [rsp+0x670]
     11f0293:	00 
     11f0294:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11f0297:	4c 89 ff             	mov    rdi,r15
     11f029a:	4c 89 f6             	mov    rsi,r14
     11f029d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11f02a0:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11f02a3:	4c 89 ff             	mov    rdi,r15
     11f02a6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f02a9:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f02b0:	00 
     11f02b1:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     11f02b5:	48 8d 0d 7c 3c 67 00 	lea    rcx,[rip+0x673c7c]        # 1863f38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20620>
     11f02bc:	48 89 8b 90 05 00 00 	mov    QWORD PTR [rbx+0x590],rcx
     11f02c3:	48 89 83 98 05 00 00 	mov    QWORD PTR [rbx+0x598],rax
     11f02ca:	4c 89 b3 a0 05 00 00 	mov    QWORD PTR [rbx+0x5a0],r14
     11f02d1:	e8 fe 58 00 00       	call   11f5bd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b158>
     11f02d6:	48 8d 05 9b eb 66 00 	lea    rax,[rip+0x66eb9b]        # 185ee78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b560>
     11f02dd:	48 89 83 a8 05 00 00 	mov    QWORD PTR [rbx+0x5a8],rax
     11f02e4:	4c 8d b3 b0 05 00 00 	lea    r14,[rbx+0x5b0]
     11f02eb:	4c 89 f7             	mov    rdi,r14
     11f02ee:	e8 0f 9b 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     11f02f3:	4c 8d a3 08 06 00 00 	lea    r12,[rbx+0x608]
     11f02fa:	66 0f ef c0          	pxor   xmm0,xmm0
     11f02fe:	f3 0f 7f 83 28 06 00 	movdqu XMMWORD PTR [rbx+0x628],xmm0
     11f0305:	00 
     11f0306:	f3 0f 7f 83 18 06 00 	movdqu XMMWORD PTR [rbx+0x618],xmm0

### 0x11f041d; FDE=(18805556, 18832116)
     11f03ec:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
     11f03f3:	00 
     11f03f4:	4c 89 f6             	mov    rsi,r14
     11f03f7:	e8 42 96 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f03fc:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f0400:	e8 81 e0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0405:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     11f040c:	00 
     11f040d:	e8 d6 a3 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0412:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f0419:	00 
     11f041a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f041d:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f0420:	4c 8b b4 24 90 06 00 	mov    r14,QWORD PTR [rsp+0x690]
     11f0427:	00 
     11f0428:	48 8d 93 60 06 00 00 	lea    rdx,[rbx+0x660]
     11f042f:	48 8d 0d ca c5 66 00 	lea    rcx,[rip+0x66c5ca]        # 185ca00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x190e8>
     11f0436:	48 89 8b d0 06 00 00 	mov    QWORD PTR [rbx+0x6d0],rcx
     11f043d:	48 89 83 d8 06 00 00 	mov    QWORD PTR [rbx+0x6d8],rax
     11f0444:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
     11f044b:	00 
     11f044c:	48 89 93 e0 06 00 00 	mov    QWORD PTR [rbx+0x6e0],rdx
     11f0453:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f0456:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f045d:	00 
     11f045e:	4c 89 f6             	mov    rsi,r14
     11f0461:	ff 50 58             	call   QWORD PTR [rax+0x58]
     11f0464:	4c 8b a4 24 20 05 00 	mov    r12,QWORD PTR [rsp+0x520]
     11f046b:	00 
     11f046c:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     11f0473:	00 

### 0x11f0c21; FDE=(18805556, 18832116)
     11f0bef:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f0bf6:	00 
     11f0bf7:	e8 7a 85 00 00       	call   11f9176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6fa>
     11f0bfc:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f0c03:	00 
     11f0c04:	e8 87 d2 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f0c09:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f0c10:	00 
     11f0c11:	e8 7a d2 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f0c16:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f0c1d:	00 
     11f0c1e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f0c21:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f0c24:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11f0c27:	48 89 c7             	mov    rdi,rax
     11f0c2a:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11f0c2d:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
     11f0c34:	00 
     11f0c35:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     11f0c39:	48 8d 0d a0 71 7e ff 	lea    rcx,[rip+0xffffffffff7e71a0]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11f0c40:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
     11f0c44:	48 83 a4 24 e0 04 00 	and    QWORD PTR [rsp+0x4e0],0x0
     11f0c4b:	00 00 
     11f0c4d:	48 8d 0d 8c 57 00 00 	lea    rcx,[rip+0x578c]        # 11f63e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b964>
     11f0c54:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
     11f0c58:	48 8d 0d 81 71 7e ff 	lea    rcx,[rip+0xffffffffff7e7181]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11f0c5f:	48 89 8c 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rcx
     11f0c66:	00 
     11f0c67:	48 8d 0d 60 65 07 00 	lea    rcx,[rip+0x76560]        # 12671ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac752>
     11f0c6e:	48 83 a4 24 50 05 00 	and    QWORD PTR [rsp+0x550],0x0
     11f0c75:	00 00 

### 0x11f14ff; FDE=(18805556, 18832116)
     11f14cb:	48 8b 84 24 30 07 00 	mov    rax,QWORD PTR [rsp+0x730]
     11f14d2:	00 
     11f14d3:	48 8b 8b 78 13 00 00 	mov    rcx,QWORD PTR [rbx+0x1378]
     11f14da:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
     11f14df:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     11f14e3:	66 0f 7f 84 24 a0 00 	movdqa XMMWORD PTR [rsp+0xa0],xmm0
     11f14ea:	00 00 
     11f14ec:	66 0f ef c0          	pxor   xmm0,xmm0
     11f14f0:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     11f14f4:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f14fb:	00 
     11f14fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f14ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f1502:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11f1505:	48 89 c7             	mov    rdi,rax
     11f1508:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11f150b:	49 89 c5             	mov    r13,rax
     11f150e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f1513:	48 8b 68 70          	mov    rbp,QWORD PTR [rax+0x70]
     11f1517:	44 8a b8 dc 00 00 00 	mov    r15b,BYTE PTR [rax+0xdc]
     11f151e:	44 8a a0 f8 00 00 00 	mov    r12b,BYTE PTR [rax+0xf8]
     11f1525:	48 8d 05 8c bb 66 00 	lea    rax,[rip+0x66bb8c]        # 185d0b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197a0>
     11f152c:	48 89 83 c0 18 00 00 	mov    QWORD PTR [rbx+0x18c0],rax
     11f1533:	48 8b 84 24 f8 06 00 	mov    rax,QWORD PTR [rsp+0x6f8]
     11f153a:	00 
     11f153b:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     11f1540:	48 89 8b c8 18 00 00 	mov    QWORD PTR [rbx+0x18c8],rcx
     11f1547:	48 8b 4c 24 68       	mov    rcx,QWORD PTR [rsp+0x68]
     11f154c:	48 89 8b d0 18 00 00 	mov    QWORD PTR [rbx+0x18d0],rcx
     11f1553:	48 8b 8c 24 40 06 00 	mov    rcx,QWORD PTR [rsp+0x640]
     11f155a:	00 

### 0x11f16c8; FDE=(18805556, 18832116)
     11f168b:	48 89 83 b0 19 00 00 	mov    QWORD PTR [rbx+0x19b0],rax
     11f1692:	4c 89 ab b8 19 00 00 	mov    QWORD PTR [rbx+0x19b8],r13
     11f1699:	48 89 ab c0 19 00 00 	mov    QWORD PTR [rbx+0x19c0],rbp
     11f16a0:	44 88 bb c8 19 00 00 	mov    BYTE PTR [rbx+0x19c8],r15b
     11f16a7:	44 88 a3 c9 19 00 00 	mov    BYTE PTR [rbx+0x19c9],r12b
     11f16ae:	31 ff                	xor    edi,edi
     11f16b0:	e8 d1 cd 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f16b5:	4c 89 f7             	mov    rdi,r14
     11f16b8:	e8 ad 88 88 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11f16bd:	48 8b bc 24 a8 06 00 	mov    rdi,QWORD PTR [rsp+0x6a8]
     11f16c4:	00 
     11f16c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f16c8:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f16cb:	48 8d 0d 06 b9 66 00 	lea    rcx,[rip+0x66b906]        # 185cfd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x196c0>
     11f16d2:	48 89 8b d0 19 00 00 	mov    QWORD PTR [rbx+0x19d0],rcx
     11f16d9:	48 89 83 d8 19 00 00 	mov    QWORD PTR [rbx+0x19d8],rax
     11f16e0:	48 8b 84 24 b0 06 00 	mov    rax,QWORD PTR [rsp+0x6b0]
     11f16e7:	00 
     11f16e8:	48 89 83 e0 19 00 00 	mov    QWORD PTR [rbx+0x19e0],rax
     11f16ef:	48 8b 84 24 d8 06 00 	mov    rax,QWORD PTR [rsp+0x6d8]
     11f16f6:	00 
     11f16f7:	48 89 83 e8 19 00 00 	mov    QWORD PTR [rbx+0x19e8],rax
     11f16fe:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     11f1703:	8a 82 98 00 00 00    	mov    al,BYTE PTR [rdx+0x98]
     11f1709:	48 8d 0d 60 cc 66 00 	lea    rcx,[rip+0x66cc60]        # 185e370 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1aa58>
     11f1710:	48 89 8b f0 19 00 00 	mov    QWORD PTR [rbx+0x19f0],rcx
     11f1717:	48 8b b4 24 00 07 00 	mov    rsi,QWORD PTR [rsp+0x700]
     11f171e:	00 
     11f171f:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
     11f1722:	48 89 8b f8 19 00 00 	mov    QWORD PTR [rbx+0x19f8],rcx
     11f1729:	48 8b 4e 08          	mov    rcx,QWORD PTR [rsi+0x8]

### 0x11f1782; FDE=(18805556, 18832116)
     11f1746:	48 89 8b 08 1a 00 00 	mov    QWORD PTR [rbx+0x1a08],rcx
     11f174d:	48 8b 8c 24 48 07 00 	mov    rcx,QWORD PTR [rsp+0x748]
     11f1754:	00 
     11f1755:	48 89 8b 10 1a 00 00 	mov    QWORD PTR [rbx+0x1a10],rcx
     11f175c:	48 83 a3 18 1a 00 00 	and    QWORD PTR [rbx+0x1a18],0x0
     11f1763:	00 
     11f1764:	88 83 20 1a 00 00    	mov    BYTE PTR [rbx+0x1a20],al
     11f176a:	80 ba a9 00 00 00 00 	cmp    BYTE PTR [rdx+0xa9],0x0
     11f1771:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f1778:	00 
     11f1779:	0f 84 56 01 00 00    	je     11f18d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e59>
     11f177f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f1782:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f1785:	49 89 c5             	mov    r13,rax
     11f1788:	bf f0 00 00 00       	mov    edi,0xf0
     11f178d:	e8 6e c7 5f 00       	call   17edf00 <_Znwm@plt>
     11f1792:	49 89 c6             	mov    r14,rax
     11f1795:	48 8d 05 84 d2 66 00 	lea    rax,[rip+0x66d284]        # 185ea20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b108>
     11f179c:	49 89 06             	mov    QWORD PTR [r14],rax
     11f179f:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
     11f17a4:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp
     11f17a8:	4d 89 6e 10          	mov    QWORD PTR [r14+0x10],r13
     11f17ac:	4d 8d 66 18          	lea    r12,[r14+0x18]
     11f17b0:	4c 89 e7             	mov    rdi,r12
     11f17b3:	e8 3e 82 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11f17b8:	4d 8d 7e 28          	lea    r15,[r14+0x28]
     11f17bc:	4c 89 ff             	mov    rdi,r15
     11f17bf:	e8 32 82 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11f17c4:	49 8d 7e 38          	lea    rdi,[r14+0x38]
     11f17c8:	e8 35 ba 8c ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
     11f17cd:	4c 89 f7             	mov    rdi,r14

### 0x11f19f2; FDE=(18805556, 18832116)
     11f19bb:	00 
     11f19bc:	48 89 83 c0 1a 00 00 	mov    QWORD PTR [rbx+0x1ac0],rax
     11f19c3:	48 8d bb c8 1a 00 00 	lea    rdi,[rbx+0x1ac8]
     11f19ca:	e8 77 65 97 ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>
     11f19cf:	66 0f ef c0          	pxor   xmm0,xmm0
     11f19d3:	66 0f 7f 83 d0 1a 00 	movdqa XMMWORD PTR [rbx+0x1ad0],xmm0
     11f19da:	00 
     11f19db:	48 8d bb e0 1a 00 00 	lea    rdi,[rbx+0x1ae0]
     11f19e2:	e8 a7 68 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f19e7:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f19ee:	00 
     11f19ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f19f2:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f19f5:	49 89 c4             	mov    r12,rax
     11f19f8:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f19ff:	00 
     11f1a00:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f1a03:	ff 50 40             	call   QWORD PTR [rax+0x40]
     11f1a06:	48 89 c5             	mov    rbp,rax
     11f1a09:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f1a10:	00 
     11f1a11:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f1a14:	ff 50 60             	call   QWORD PTR [rax+0x60]
     11f1a17:	49 89 c5             	mov    r13,rax
     11f1a1a:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f1a1f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f1a22:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f1a29:	00 
     11f1a2a:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f1a2d:	4c 8b bc 24 20 05 00 	mov    r15,QWORD PTR [rsp+0x520]
     11f1a34:	00 

### 0x11f1bec; FDE=(18805556, 18832116)
     11f1bc4:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
     11f1bcb:	00 
     11f1bcc:	6a 08                	push   0x8
     11f1bce:	41 59                	pop    r9
     11f1bd0:	4c 89 f7             	mov    rdi,r14
     11f1bd3:	31 d2                	xor    edx,edx
     11f1bd5:	e8 ba 8b 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11f1bda:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11f1bde:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f1be5:	00 
     11f1be6:	4c 89 ee             	mov    rsi,r13
     11f1be9:	4c 89 f2             	mov    rdx,r14
     11f1bec:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f1bef:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     11f1bf4:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     11f1bf9:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f1c00:	00 
     11f1c01:	4c 89 f6             	mov    rsi,r14
     11f1c04:	e8 35 7e 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f1c09:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f1c0d:	e8 74 c8 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f1c12:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f1c19:	00 
     11f1c1a:	e8 c9 8b 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f1c1f:	4c 89 e7             	mov    rdi,r12
     11f1c22:	48 83 c7 20          	add    rdi,0x20
     11f1c26:	e8 63 66 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f1c2b:	4c 89 a4 24 80 05 00 	mov    QWORD PTR [rsp+0x580],r12
     11f1c32:	00 
     11f1c33:	bf 88 00 00 00       	mov    edi,0x88
     11f1c38:	e8 c3 c2 5f 00       	call   17edf00 <_Znwm@plt>

### 0x11f23b3; FDE=(18805556, 18832116)
     11f2381:	e8 1c 45 00 00       	call   11f68a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3be26>
     11f2386:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     11f238d:	00 
     11f238e:	e8 bb 43 00 00       	call   11f674e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bcd2>
     11f2393:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
     11f239a:	00 
     11f239b:	e8 40 43 00 00       	call   11f66e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bc64>
     11f23a0:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
     11f23a7:	00 
     11f23a8:	e8 d9 c0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f23ad:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f23b0:	4c 89 f7             	mov    rdi,r14
     11f23b3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f23b6:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     11f23bb:	4c 8b b3 e8 19 00 00 	mov    r14,QWORD PTR [rbx+0x19e8]
     11f23c2:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f23c9:	00 
     11f23ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f23cd:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f23d0:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f23d5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f23d8:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f23df:	00 
     11f23e0:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f23e3:	48 8b ac 24 20 05 00 	mov    rbp,QWORD PTR [rsp+0x520]
     11f23ea:	00 
     11f23eb:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f23f0:	8a 88 b2 00 00 00    	mov    cl,BYTE PTR [rax+0xb2]
     11f23f6:	88 4c 24 40          	mov    BYTE PTR [rsp+0x40],cl
     11f23fa:	f3 0f 6f 80 b8 00 00 	movdqu xmm0,XMMWORD PTR [rax+0xb8]
     11f2401:	00 

### 0x11f23cd; FDE=(18805556, 18832116)
     11f239b:	e8 40 43 00 00       	call   11f66e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bc64>
     11f23a0:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
     11f23a7:	00 
     11f23a8:	e8 d9 c0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f23ad:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f23b0:	4c 89 f7             	mov    rdi,r14
     11f23b3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f23b6:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     11f23bb:	4c 8b b3 e8 19 00 00 	mov    r14,QWORD PTR [rbx+0x19e8]
     11f23c2:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f23c9:	00 
     11f23ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f23cd:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f23d0:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f23d5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f23d8:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f23df:	00 
     11f23e0:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f23e3:	48 8b ac 24 20 05 00 	mov    rbp,QWORD PTR [rsp+0x520]
     11f23ea:	00 
     11f23eb:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f23f0:	8a 88 b2 00 00 00    	mov    cl,BYTE PTR [rax+0xb2]
     11f23f6:	88 4c 24 40          	mov    BYTE PTR [rsp+0x40],cl
     11f23fa:	f3 0f 6f 80 b8 00 00 	movdqu xmm0,XMMWORD PTR [rax+0xb8]
     11f2401:	00 
     11f2402:	66 0f 7f 84 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm0
     11f2409:	00 00 
     11f240b:	48 8b 80 c8 00 00 00 	mov    rax,QWORD PTR [rax+0xc8]
     11f2412:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     11f2419:	00 
     11f241a:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]

### 0x11f2425; FDE=(18805556, 18832116)
     11f23f0:	8a 88 b2 00 00 00    	mov    cl,BYTE PTR [rax+0xb2]
     11f23f6:	88 4c 24 40          	mov    BYTE PTR [rsp+0x40],cl
     11f23fa:	f3 0f 6f 80 b8 00 00 	movdqu xmm0,XMMWORD PTR [rax+0xb8]
     11f2401:	00 
     11f2402:	66 0f 7f 84 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm0
     11f2409:	00 00 
     11f240b:	48 8b 80 c8 00 00 00 	mov    rax,QWORD PTR [rax+0xc8]
     11f2412:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     11f2419:	00 
     11f241a:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f2421:	00 
     11f2422:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f2425:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f2428:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11f242b:	48 89 c7             	mov    rdi,rax
     11f242e:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11f2431:	49 89 c7             	mov    r15,rax
     11f2434:	4c 8b 6b 60          	mov    r13,QWORD PTR [rbx+0x60]
     11f2438:	bf 28 01 00 00       	mov    edi,0x128
     11f243d:	e8 be ba 5f 00       	call   17edf00 <_Znwm@plt>
     11f2442:	49 89 c4             	mov    r12,rax
     11f2445:	4c 89 ac 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r13
     11f244c:	00 
     11f244d:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
     11f2452:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
     11f2457:	48 8d 05 b2 bc 66 00 	lea    rax,[rip+0x66bcb2]        # 185e110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a7f8>
     11f245e:	49 89 04 24          	mov    QWORD PTR [r12],rax
     11f2462:	48 8d 05 e7 bc 66 00 	lea    rax,[rip+0x66bce7]        # 185e150 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a838>
     11f2469:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
     11f246e:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
     11f2475:	00 

### 0x11f2fbd; FDE=(18805556, 18832116)
     11f2f8b:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     11f2f92:	00 
     11f2f93:	e8 ac 39 00 00       	call   11f6944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bec8>
     11f2f98:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
     11f2f9f:	00 
     11f2fa0:	e8 bf 39 00 00       	call   11f6964 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bee8>
     11f2fa5:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
     11f2fac:	00 
     11f2fad:	e8 d4 b4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f2fb2:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f2fb9:	00 
     11f2fba:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f2fbd:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f2fc0:	48 8d 0d 49 bc 66 00 	lea    rcx,[rip+0x66bc49]        # 185ec10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b2f8>
     11f2fc7:	48 89 8b 68 1c 00 00 	mov    QWORD PTR [rbx+0x1c68],rcx
     11f2fce:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
     11f2fd3:	48 89 8b 70 1c 00 00 	mov    QWORD PTR [rbx+0x1c70],rcx
     11f2fda:	48 89 83 78 1c 00 00 	mov    QWORD PTR [rbx+0x1c78],rax
     11f2fe1:	83 a3 9c 1c 00 00 00 	and    DWORD PTR [rbx+0x1c9c],0x0
     11f2fe8:	66 83 a3 a0 1c 00 00 	and    WORD PTR [rbx+0x1ca0],0x0
     11f2fef:	00 
     11f2ff0:	83 a3 a4 1c 00 00 00 	and    DWORD PTR [rbx+0x1ca4],0x0
     11f2ff7:	48 8d bb a8 1c 00 00 	lea    rdi,[rbx+0x1ca8]
     11f2ffe:	66 0f ef c0          	pxor   xmm0,xmm0
     11f3002:	66 0f 7f 83 80 1c 00 	movdqa XMMWORD PTR [rbx+0x1c80],xmm0
     11f3009:	00 
     11f300a:	f3 0f 7f 83 8a 1c 00 	movdqu XMMWORD PTR [rbx+0x1c8a],xmm0
     11f3011:	00 
     11f3012:	e8 eb 6d 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     11f3017:	4c 8d a3 68 1c 00 00 	lea    r12,[rbx+0x1c68]
     11f301e:	4c 8b b3 70 1c 00 00 	mov    r14,QWORD PTR [rbx+0x1c70]

### 0x11f311b; FDE=(18805556, 18832116)
     11f30eb:	4c 89 fa             	mov    rdx,r15
     11f30ee:	ff 90 00 01 00 00    	call   QWORD PTR [rax+0x100]
     11f30f4:	4c 89 e7             	mov    rdi,r12
     11f30f7:	4c 89 ee             	mov    rsi,r13
     11f30fa:	e8 3f 69 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f30ff:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     11f3103:	e8 7e b3 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f3108:	4c 89 ff             	mov    rdi,r15
     11f310b:	e8 d8 76 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f3110:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f3117:	00 
     11f3118:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f311b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f311e:	49 89 c4             	mov    r12,rax
     11f3121:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
     11f3128:	00 
     11f3129:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
     11f3130:	00 
     11f3131:	e8 5a 71 88 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     11f3136:	48 8d 05 13 7e 62 00 	lea    rax,[rip+0x627e13]        # 181af50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10c10>
     11f313d:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
     11f3144:	00 
     11f3145:	48 89 01             	mov    QWORD PTR [rcx],rax
     11f3148:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     11f314c:	48 8d 35 d1 02 17 ff 	lea    rsi,[rip+0xffffffffff1702d1]        # 363424 <_ZTSSt12bad_any_cast@@Base-0x2cda4>
     11f3153:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
     11f315a:	00 
     11f315b:	e8 1e 69 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11f3160:	48 8b b4 24 78 06 00 	mov    rsi,QWORD PTR [rsp+0x678]
     11f3167:	00 
     11f3168:	48 8b 06             	mov    rax,QWORD PTR [rsi]

### 0x11f34ee; FDE=(18805556, 18832116)
     11f34c0:	4c 89 f2             	mov    rdx,r14
     11f34c3:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11f34c6:	4c 89 ff             	mov    rdi,r15
     11f34c9:	4c 89 e6             	mov    rsi,r12
     11f34cc:	e8 6d 65 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f34d1:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     11f34d6:	e8 ab af 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f34db:	4c 89 f7             	mov    rdi,r14
     11f34de:	e8 05 73 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f34e3:	48 8b bc 24 a0 06 00 	mov    rdi,QWORD PTR [rsp+0x6a0]
     11f34ea:	00 
     11f34eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f34ee:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f34f1:	48 8d 0d a8 b5 66 00 	lea    rcx,[rip+0x66b5a8]        # 185eaa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b188>
     11f34f8:	48 89 8b d0 1e 00 00 	mov    QWORD PTR [rbx+0x1ed0],rcx
     11f34ff:	48 89 83 d8 1e 00 00 	mov    QWORD PTR [rbx+0x1ed8],rax
     11f3506:	44 88 ab e0 1e 00 00 	mov    BYTE PTR [rbx+0x1ee0],r13b
     11f350d:	44 88 ab 10 1f 00 00 	mov    BYTE PTR [rbx+0x1f10],r13b
     11f3514:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f351b:	00 
     11f351c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f351f:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f3522:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11f3527:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f352e:	00 
     11f352f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f3532:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f3535:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11f3538:	48 89 c7             	mov    rdi,rax
     11f353b:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11f353e:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax

### 0x11f351f; FDE=(18805556, 18832116)
     11f34e3:	48 8b bc 24 a0 06 00 	mov    rdi,QWORD PTR [rsp+0x6a0]
     11f34ea:	00 
     11f34eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f34ee:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f34f1:	48 8d 0d a8 b5 66 00 	lea    rcx,[rip+0x66b5a8]        # 185eaa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b188>
     11f34f8:	48 89 8b d0 1e 00 00 	mov    QWORD PTR [rbx+0x1ed0],rcx
     11f34ff:	48 89 83 d8 1e 00 00 	mov    QWORD PTR [rbx+0x1ed8],rax
     11f3506:	44 88 ab e0 1e 00 00 	mov    BYTE PTR [rbx+0x1ee0],r13b
     11f350d:	44 88 ab 10 1f 00 00 	mov    BYTE PTR [rbx+0x1f10],r13b
     11f3514:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f351b:	00 
     11f351c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f351f:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f3522:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11f3527:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f352e:	00 
     11f352f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f3532:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f3535:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11f3538:	48 89 c7             	mov    rdi,rax
     11f353b:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11f353e:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     11f3545:	00 
     11f3546:	48 83 a4 24 e0 04 00 	and    QWORD PTR [rsp+0x4e0],0x0
     11f354d:	00 00 
     11f354f:	48 8d 05 8a 48 7e ff 	lea    rax,[rip+0xffffffffff7e488a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11f3556:	48 89 84 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rax
     11f355d:	00 
     11f355e:	48 8d 05 1f 34 00 00 	lea    rax,[rip+0x341f]        # 11f6984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bf08>
     11f3565:	48 89 84 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rax
     11f356c:	00 

### 0x11f3532; FDE=(18805556, 18832116)
     11f34f8:	48 89 8b d0 1e 00 00 	mov    QWORD PTR [rbx+0x1ed0],rcx
     11f34ff:	48 89 83 d8 1e 00 00 	mov    QWORD PTR [rbx+0x1ed8],rax
     11f3506:	44 88 ab e0 1e 00 00 	mov    BYTE PTR [rbx+0x1ee0],r13b
     11f350d:	44 88 ab 10 1f 00 00 	mov    BYTE PTR [rbx+0x1f10],r13b
     11f3514:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f351b:	00 
     11f351c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f351f:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f3522:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11f3527:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f352e:	00 
     11f352f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f3532:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f3535:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11f3538:	48 89 c7             	mov    rdi,rax
     11f353b:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11f353e:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     11f3545:	00 
     11f3546:	48 83 a4 24 e0 04 00 	and    QWORD PTR [rsp+0x4e0],0x0
     11f354d:	00 00 
     11f354f:	48 8d 05 8a 48 7e ff 	lea    rax,[rip+0xffffffffff7e488a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11f3556:	48 89 84 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rax
     11f355d:	00 
     11f355e:	48 8d 05 1f 34 00 00 	lea    rax,[rip+0x341f]        # 11f6984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bf08>
     11f3565:	48 89 84 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rax
     11f356c:	00 
     11f356d:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f3572:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f3575:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f357c:	00 
     11f357d:	ff 50 30             	call   QWORD PTR [rax+0x30]

### 0x11f35bd; FDE=(18805556, 18832116)
     11f3587:	00 
     11f3588:	48 8d ab c0 18 00 00 	lea    rbp,[rbx+0x18c0]
     11f358f:	4c 8d bb d0 19 00 00 	lea    r15,[rbx+0x19d0]
     11f3596:	48 8d 83 d0 1e 00 00 	lea    rax,[rbx+0x1ed0]
     11f359d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11f35a2:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
     11f35a9:	00 
     11f35aa:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11f35af:	4c 8b b4 24 a0 06 00 	mov    r14,QWORD PTR [rsp+0x6a0]
     11f35b6:	00 
     11f35b7:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f35ba:	4c 89 f7             	mov    rdi,r14
     11f35bd:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f35c0:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     11f35c7:	00 
     11f35c8:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f35cb:	4c 89 f7             	mov    rdi,r14
     11f35ce:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f35d1:	49 89 c4             	mov    r12,rax
     11f35d4:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11f35d9:	8a 41 04             	mov    al,BYTE PTR [rcx+0x4]
     11f35dc:	4c 8d b4 24 50 03 00 	lea    r14,[rsp+0x350]
     11f35e3:	00 
     11f35e4:	41 88 46 d0          	mov    BYTE PTR [r14-0x30],al
     11f35e8:	0f 10 81 e0 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0xe0]
     11f35ef:	41 0f 11 46 d4       	movups XMMWORD PTR [r14-0x2c],xmm0
     11f35f4:	41 c7 46 e4 05 00 00 	mov    DWORD PTR [r14-0x1c],0x5
     11f35fb:	00 
     11f35fc:	49 c7 46 e8 88 13 00 	mov    QWORD PTR [r14-0x18],0x1388
     11f3603:	00 
     11f3604:	48 8b 41 70          	mov    rax,QWORD PTR [rcx+0x70]

### 0x11f403a; FDE=(18805556, 18832116)
     11f4010:	00 
     11f4011:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f4014:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
     11f401b:	00 
     11f401c:	4c 89 f7             	mov    rdi,r14
     11f401f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     11f4024:	ff 50 48             	call   QWORD PTR [rax+0x48]
     11f4027:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f402e:	00 
     11f402f:	e8 08 24 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
     11f4034:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f4037:	4c 89 f7             	mov    rdi,r14
     11f403a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f403d:	49 89 c6             	mov    r14,rax
     11f4040:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f4045:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f4048:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
     11f404f:	00 
     11f4050:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f4053:	4c 8b ac 24 80 05 00 	mov    r13,QWORD PTR [rsp+0x580]
     11f405a:	00 
     11f405b:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f4062:	00 
     11f4063:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4066:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f4069:	49 89 c7             	mov    r15,rax
     11f406c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f4073:	00 
     11f4074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax

### 0x11f4066; FDE=(18805556, 18832116)
     11f403a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f403d:	49 89 c6             	mov    r14,rax
     11f4040:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f4045:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f4048:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
     11f404f:	00 
     11f4050:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f4053:	4c 8b ac 24 80 05 00 	mov    r13,QWORD PTR [rsp+0x580]
     11f405a:	00 
     11f405b:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f4062:	00 
     11f4063:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4066:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f4069:	49 89 c7             	mov    r15,rax
     11f406c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f4073:	00 
     11f4074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11f407f:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     11f4084:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
     11f408b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11f4090:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
     11f4097:	00 00 
     11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11f40a0:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
     11f40a7:	00 
     11f40a8:	48 8d 05 cb ed 95 ff 	lea    rax,[rip+0xffffffffff95edcb]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11f40af:	48 89 84 24 38 05 00 	mov    QWORD PTR [rsp+0x538],rax
     11f40b6:	00 
     11f40b7:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]

### 0x11f46d1; FDE=(18805556, 18832116)
     11f4698:	4c 8d a3 e8 4a 00 00 	lea    r12,[rbx+0x4ae8]
     11f469f:	4c 89 b3 e8 4a 00 00 	mov    QWORD PTR [rbx+0x4ae8],r14
     11f46a6:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f46ad:	00 
     11f46ae:	e8 fb 14 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f46b3:	eb 11                	jmp    11f46c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39c4a>
     11f46b5:	4c 8d a3 e8 4a 00 00 	lea    r12,[rbx+0x4ae8]
     11f46bc:	66 0f ef c0          	pxor   xmm0,xmm0
     11f46c0:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0
     11f46c6:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     11f46cd:	00 
     11f46ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f46d1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f46d4:	4c 8d b3 f0 4a 00 00 	lea    r14,[rbx+0x4af0]
     11f46db:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
     11f46df:	48 85 c9             	test   rcx,rcx
     11f46e2:	74 16                	je     11f46fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39c7e>
     11f46e4:	48 89 8c 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rcx
     11f46eb:	00 
     11f46ec:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     11f46f0:	48 89 8c 24 c8 05 00 	mov    QWORD PTR [rsp+0x5c8],rcx
     11f46f7:	00 
     11f46f8:	eb 18                	jmp    11f4712 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39c96>
     11f46fa:	48 8b 8b d8 4a 00 00 	mov    rcx,QWORD PTR [rbx+0x4ad8]
     11f4701:	66 0f 6f 83 d0 4a 00 	movdqa xmm0,XMMWORD PTR [rbx+0x4ad0]
     11f4708:	00 
     11f4709:	66 0f 7f 84 24 c0 05 	movdqa XMMWORD PTR [rsp+0x5c0],xmm0
     11f4710:	00 00 
     11f4712:	48 85 c9             	test   rcx,rcx
     11f4715:	74 05                	je     11f471c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39ca0>
     11f4717:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]

### 0x11f4b8c; FDE=(18805556, 18832116)
     11f4b5c:	48 8b bc 24 c8 05 00 	mov    rdi,QWORD PTR [rsp+0x5c8]
     11f4b63:	00 
     11f4b64:	e8 1d 99 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f4b69:	4c 8b a4 24 a0 06 00 	mov    r12,QWORD PTR [rsp+0x6a0]
     11f4b70:	00 
     11f4b71:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11f4b75:	4c 89 e7             	mov    rdi,r12
     11f4b78:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f4b7b:	49 89 c6             	mov    r14,rax
     11f4b7e:	4c 8b bb d0 0e 00 00 	mov    r15,QWORD PTR [rbx+0xed0]
     11f4b85:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11f4b89:	4c 89 e7             	mov    rdi,r12
     11f4b8c:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f4b8f:	48 89 ab 20 5d 00 00 	mov    QWORD PTR [rbx+0x5d20],rbp
     11f4b96:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
     11f4b9b:	48 89 8b 28 5d 00 00 	mov    QWORD PTR [rbx+0x5d28],rcx
     11f4ba2:	4c 89 b3 30 5d 00 00 	mov    QWORD PTR [rbx+0x5d30],r14
     11f4ba9:	4c 89 bb 38 5d 00 00 	mov    QWORD PTR [rbx+0x5d38],r15
     11f4bb0:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     11f4bb7:	00 
     11f4bb8:	48 89 8b 40 5d 00 00 	mov    QWORD PTR [rbx+0x5d40],rcx
     11f4bbf:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
     11f4bc4:	48 89 8b 48 5d 00 00 	mov    QWORD PTR [rbx+0x5d48],rcx
     11f4bcb:	48 8b 4c 24 68       	mov    rcx,QWORD PTR [rsp+0x68]
     11f4bd0:	48 89 8b 50 5d 00 00 	mov    QWORD PTR [rbx+0x5d50],rcx
     11f4bd7:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
     11f4bde:	00 
     11f4bdf:	48 89 8b 58 5d 00 00 	mov    QWORD PTR [rbx+0x5d58],rcx
     11f4be6:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11f4beb:	48 89 8b 60 5d 00 00 	mov    QWORD PTR [rbx+0x5d60],rcx
     11f4bf2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]

### 0x11f6495; FDE=(18834514, 18834798)
     11f6463:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11f646a:	00 00 
     11f646c:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11f6471:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f6474:	48 8b b0 88 5d 00 00 	mov    rsi,QWORD PTR [rax+0x5d88]
     11f647b:	48 85 f6             	test   rsi,rsi
     11f647e:	0f 84 95 00 00 00    	je     11f6519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ba9d>
     11f6484:	49 89 ce             	mov    r14,rcx
     11f6487:	49 89 d7             	mov    r15,rdx
     11f648a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f648d:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     11f6492:	4c 89 e7             	mov    rdi,r12
     11f6495:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f6498:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     11f649d:	4c 89 ef             	mov    rdi,r13
     11f64a0:	4c 89 e6             	mov    rsi,r12
     11f64a3:	e8 88 4e 8b ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     11f64a8:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     11f64ad:	e8 00 80 8a ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     11f64b2:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
     11f64b6:	4d 85 e4             	test   r12,r12
     11f64b9:	74 4b                	je     11f6506 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ba8a>
     11f64bb:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11f64bf:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11f64c4:	4c 89 e6             	mov    rsi,r12
     11f64c7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f64ca:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     11f64cf:	4c 89 ef             	mov    rdi,r13
     11f64d2:	e8 5f 53 88 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     11f64d7:	48 89 d1             	mov    rcx,rdx
     11f64da:	4c 89 ff             	mov    rdi,r15

### 0x11f64c7; FDE=(18834514, 18834798)
     11f6498:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     11f649d:	4c 89 ef             	mov    rdi,r13
     11f64a0:	4c 89 e6             	mov    rsi,r12
     11f64a3:	e8 88 4e 8b ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     11f64a8:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     11f64ad:	e8 00 80 8a ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     11f64b2:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
     11f64b6:	4d 85 e4             	test   r12,r12
     11f64b9:	74 4b                	je     11f6506 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ba8a>
     11f64bb:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11f64bf:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11f64c4:	4c 89 e6             	mov    rsi,r12
     11f64c7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f64ca:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     11f64cf:	4c 89 ef             	mov    rdi,r13
     11f64d2:	e8 5f 53 88 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     11f64d7:	48 89 d1             	mov    rcx,rdx
     11f64da:	4c 89 ff             	mov    rdi,r15
     11f64dd:	4c 89 f6             	mov    rsi,r14
     11f64e0:	48 89 c2             	mov    rdx,rax
     11f64e3:	e8 98 53 88 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
     11f64e8:	89 c5                	mov    ebp,eax
     11f64ea:	4c 89 ef             	mov    rdi,r13
     11f64ed:	e8 9e 79 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f64f2:	40 84 ed             	test   bpl,bpl
     11f64f5:	74 0f                	je     11f6506 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ba8a>
     11f64f7:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11f64fb:	48 89 df             	mov    rdi,rbx
     11f64fe:	4c 89 e6             	mov    rsi,r12
     11f6501:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f6504:	eb 07                	jmp    11f650d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ba91>

### 0x11f65b1; FDE=(18834798, 18835095)
     11f657f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11f6586:	00 00 
     11f6588:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11f658d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f6590:	48 8b b0 88 5d 00 00 	mov    rsi,QWORD PTR [rax+0x5d88]
     11f6597:	48 85 f6             	test   rsi,rsi
     11f659a:	0f 84 a2 00 00 00    	je     11f6642 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bbc6>
     11f65a0:	49 89 ce             	mov    r14,rcx
     11f65a3:	49 89 d7             	mov    r15,rdx
     11f65a6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f65a9:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     11f65ae:	4c 89 e7             	mov    rdi,r12
     11f65b1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f65b4:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     11f65b9:	4c 89 ef             	mov    rdi,r13
     11f65bc:	4c 89 e6             	mov    rsi,r12
     11f65bf:	e8 6c 4d 8b ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     11f65c4:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     11f65c9:	e8 e4 7e 8a ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     11f65ce:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
     11f65d2:	4d 85 e4             	test   r12,r12
     11f65d5:	74 56                	je     11f662d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bbb1>
     11f65d7:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11f65db:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11f65e0:	4c 89 e6             	mov    rsi,r12
     11f65e3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f65e6:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     11f65eb:	4c 89 ef             	mov    rdi,r13
     11f65ee:	e8 43 52 88 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     11f65f3:	48 89 d1             	mov    rcx,rdx
     11f65f6:	4c 89 ff             	mov    rdi,r15

### 0x11f65e3; FDE=(18834798, 18835095)
     11f65b4:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     11f65b9:	4c 89 ef             	mov    rdi,r13
     11f65bc:	4c 89 e6             	mov    rsi,r12
     11f65bf:	e8 6c 4d 8b ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     11f65c4:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     11f65c9:	e8 e4 7e 8a ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     11f65ce:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
     11f65d2:	4d 85 e4             	test   r12,r12
     11f65d5:	74 56                	je     11f662d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bbb1>
     11f65d7:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11f65db:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11f65e0:	4c 89 e6             	mov    rsi,r12
     11f65e3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f65e6:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     11f65eb:	4c 89 ef             	mov    rdi,r13
     11f65ee:	e8 43 52 88 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     11f65f3:	48 89 d1             	mov    rcx,rdx
     11f65f6:	4c 89 ff             	mov    rdi,r15
     11f65f9:	4c 89 f6             	mov    rsi,r14
     11f65fc:	48 89 c2             	mov    rdx,rax
     11f65ff:	e8 7c 52 88 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
     11f6604:	89 c5                	mov    ebp,eax
     11f6606:	4c 89 ef             	mov    rdi,r13
     11f6609:	e8 82 78 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f660e:	40 84 ed             	test   bpl,bpl
     11f6611:	74 1a                	je     11f662d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bbb1>
     11f6613:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11f6617:	4c 89 e7             	mov    rdi,r12
     11f661a:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11f661d:	40 b5 01             	mov    bpl,0x1
     11f6620:	48 89 df             	mov    rdi,rbx

### 0x11f6c58; FDE=(18836492, 18841437)
     11f6c20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11f6c27:	00 00 
     11f6c29:	48 89 84 24 10 04 00 	mov    QWORD PTR [rsp+0x410],rax
     11f6c30:	00 
     11f6c31:	48 8b bf 28 5d 00 00 	mov    rdi,QWORD PTR [rdi+0x5d28]
     11f6c38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f6c3b:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     11f6c41:	48 8b bb 30 5d 00 00 	mov    rdi,QWORD PTR [rbx+0x5d30]
     11f6c48:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f6c4b:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11f6c4e:	48 8b bb 38 5d 00 00 	mov    rdi,QWORD PTR [rbx+0x5d38]
     11f6c55:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f6c58:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f6c5b:	48 8b bb 40 5d 00 00 	mov    rdi,QWORD PTR [rbx+0x5d40]
     11f6c62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f6c65:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11f6c68:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
     11f6c6d:	4c 8b a3 48 5d 00 00 	mov    r12,QWORD PTR [rbx+0x5d48]
     11f6c74:	49 8b 74 24 70       	mov    rsi,QWORD PTR [r12+0x70]
     11f6c79:	41 8b 7c 24 68       	mov    edi,DWORD PTR [r12+0x68]
     11f6c7e:	e8 9d 4b 88 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     11f6c83:	84 c0                	test   al,al
     11f6c85:	0f 85 81 0b 00 00    	jne    11f780c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cd90>
     11f6c8b:	0f 57 c0             	xorps  xmm0,xmm0
     11f6c8e:	48 8d b4 24 f0 03 00 	lea    rsi,[rsp+0x3f0]
     11f6c95:	00 
     11f6c96:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     11f6c99:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     11f6c9e:	49 8d 7c 24 28       	lea    rdi,[r12+0x28]
     11f6ca3:	41 ff 54 24 40       	call   QWORD PTR [r12+0x40]
     11f6ca8:	84 c0                	test   al,al

### 0x11fc137; FDE=(18858040, 18858447)
     11fc10a:	e8 13 8d 42 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
     11fc10f:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     11fc116:	00 
     11fc117:	e8 4e de 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11fc11c:	48 89 e7             	mov    rdi,rsp
     11fc11f:	e8 0c ac 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11fc124:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     11fc128:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11fc12b:	4c 89 e6             	mov    rsi,r12
     11fc12e:	4c 89 fa             	mov    rdx,r15
     11fc131:	4c 89 f1             	mov    rcx,r14
     11fc134:	49 89 d8             	mov    r8,rbx
     11fc137:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11fc13a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11fc13f:	e8 ca 3e 45 00       	call   165000e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x417a>
     11fc144:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fc14b:	00 00 
     11fc14d:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
     11fc154:	00 
     11fc155:	75 73                	jne    11fc1ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4174e>
     11fc157:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
     11fc15e:	5b                   	pop    rbx
     11fc15f:	41 5c                	pop    r12
     11fc161:	41 5d                	pop    r13
     11fc163:	41 5e                	pop    r14
     11fc165:	41 5f                	pop    r15
     11fc167:	c3                   	ret
     11fc168:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     11fc16c:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     11fc16f:	e9 6b ff ff ff       	jmp    11fc0df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41663>
     11fc174:	48 89 c3             	mov    rbx,rax

## Relocation vtable candidates around +0x28 getters
### table-base 0x17f4008 slot+0x28 -> 0x9d8970 FDE=0x9d8970..0x9d899c
      9d8970:	0f 10 87 b0 00 00 00 	movups xmm0,XMMWORD PTR [rdi+0xb0]
      9d8977:	0f 10 8f c0 00 00 00 	movups xmm1,XMMWORD PTR [rdi+0xc0]
      9d897e:	0f 10 97 d0 00 00 00 	movups xmm2,XMMWORD PTR [rdi+0xd0]
      9d8985:	0f 10 9f e0 00 00 00 	movups xmm3,XMMWORD PTR [rdi+0xe0]
      9d898c:	0f 11 5e 30          	movups XMMWORD PTR [rsi+0x30],xmm3
      9d8990:	0f 11 56 20          	movups XMMWORD PTR [rsi+0x20],xmm2
      9d8994:	0f 11 4e 10          	movups XMMWORD PTR [rsi+0x10],xmm1
      9d8998:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
      9d899b:	c3                   	ret
  ref @0x9d8129: lea    rsi,[rip+0xe1bed8]        # 17f4008 <pthread_rwlock_wrlock@plt+0x3248>; FDE=(10322192, 10322265)
  ref @0x9d81f6: lea    rax,[rip+0xe1be2b]        # 17f4028 <pthread_rwlock_wrlock@plt+0x3268>; FDE=(10322400, 10323397)

### table-base 0x17f4010 slot+0x28 -> 0x9d89a0 FDE=0x9d89a0..0x9d8a2c
      9d89a0:	41 57                	push   r15
      9d89a2:	41 56                	push   r14
      9d89a4:	41 54                	push   r12
      9d89a6:	53                   	push   rbx
      9d89a7:	50                   	push   rax
      9d89a8:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      9d89ab:	0f 10 4e 10          	movups xmm1,XMMWORD PTR [rsi+0x10]
      9d89af:	0f 10 56 20          	movups xmm2,XMMWORD PTR [rsi+0x20]
      9d89b3:	0f 10 5e 30          	movups xmm3,XMMWORD PTR [rsi+0x30]
      9d89b7:	0f 11 9f e0 00 00 00 	movups XMMWORD PTR [rdi+0xe0],xmm3
      9d89be:	0f 11 97 d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm2
      9d89c5:	0f 11 8f c0 00 00 00 	movups XMMWORD PTR [rdi+0xc0],xmm1
      9d89cc:	0f 11 87 b0 00 00 00 	movups XMMWORD PTR [rdi+0xb0],xmm0
      9d89d3:	4c 8b 7f 18          	mov    r15,QWORD PTR [rdi+0x18]
      9d89d7:	4c 8b 67 20          	mov    r12,QWORD PTR [rdi+0x20]
      9d89db:	43 81 3c 27 ef be ad 	cmp    DWORD PTR [r15+r12*1],0xdeadbeef
      9d89e2:	de 
      9d89e3:	74 3b                	je     9d8a20 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x850>
      9d89e5:	41 89 c8             	mov    r8d,ecx
      9d89e8:	48 89 d1             	mov    rcx,rdx
      9d89eb:	48 89 fb             	mov    rbx,rdi
      9d89ee:	4c 8d 35 80 ec 95 ff 	lea    r14,[rip+0xffffffffff95ec80]        # 337675 <_ZTSSt12bad_any_cast@@Base-0x58b53>
      9d89f5:	31 ff                	xor    edi,edi
      9d89f7:	be 0a 00 00 00       	mov    esi,0xa
      9d89fc:	ba 04 00 00 00       	mov    edx,0x4
      9d8a01:	4d 89 f1             	mov    r9,r14
      9d8a04:	31 c0                	xor    eax,eax
      9d8a06:	e8 55 ed ff ff       	call   9d7760 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x1f0>
      9d8a0b:	48 89 df             	mov    rdi,rbx
      9d8a0e:	4c 89 f6             	mov    rsi,r14
      9d8a11:	31 c0                	xor    eax,eax
      9d8a13:	e8 f8 f5 ff ff       	call   9d8010 <_ZNSt13bad_exceptionD1Ev@@Base+0x230>
      9d8a18:	43 c7 04 27 ef be ad 	mov    DWORD PTR [r15+r12*1],0xdeadbeef
      9d8a1f:	de 
      9d8a20:	48 83 c4 08          	add    rsp,0x8
      9d8a24:	5b                   	pop    rbx
      9d8a25:	41 5c                	pop    r12
      9d8a27:	41 5e                	pop    r14
      9d8a29:	41 5f                	pop    r15
      9d8a2b:	c3                   	ret
  ref @0x9d81f6: lea    rax,[rip+0xe1be2b]        # 17f4028 <pthread_rwlock_wrlock@plt+0x3268>; FDE=(10322400, 10323397)

### table-base 0x17f4018 slot+0x28 -> 0x9d8a30 FDE=0x9d8a30..0x9d8a9c
      9d8a30:	48 89 f0             	mov    rax,rsi
      9d8a33:	48 8d 8f 30 01 00 00 	lea    rcx,[rdi+0x130]
      9d8a3a:	48 81 c7 60 01 00 00 	add    rdi,0x160
      9d8a41:	31 f6                	xor    esi,esi
      9d8a43:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]
      9d8a4a:	00 00 00 
      9d8a4d:	0f 1f 00             	nop    DWORD PTR [rax]
      9d8a50:	48 83 7f d0 00       	cmp    QWORD PTR [rdi-0x30],0x0
      9d8a55:	74 35                	je     9d8a8c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8bc>
      9d8a57:	48 83 7f e0 00       	cmp    QWORD PTR [rdi-0x20],0x0
      9d8a5c:	74 1e                	je     9d8a7c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8ac>
      9d8a5e:	48 83 7f f0 00       	cmp    QWORD PTR [rdi-0x10],0x0
      9d8a63:	74 1d                	je     9d8a82 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8b2>
      9d8a65:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
      9d8a69:	74 1d                	je     9d8a88 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8b8>
      9d8a6b:	48 83 c6 04          	add    rsi,0x4
      9d8a6f:	48 83 c7 40          	add    rdi,0x40
      9d8a73:	48 83 fe 40          	cmp    rsi,0x40
      9d8a77:	75 d7                	jne    9d8a50 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x880>
      9d8a79:	31 c0                	xor    eax,eax
      9d8a7b:	c3                   	ret
      9d8a7c:	48 83 c6 01          	add    rsi,0x1
      9d8a80:	eb 0a                	jmp    9d8a8c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8bc>
      9d8a82:	48 83 c6 02          	add    rsi,0x2
      9d8a86:	eb 04                	jmp    9d8a8c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8bc>
      9d8a88:	48 83 c6 03          	add    rsi,0x3
      9d8a8c:	89 f6                	mov    esi,esi
      9d8a8e:	48 c1 e6 04          	shl    rsi,0x4
      9d8a92:	48 89 04 31          	mov    QWORD PTR [rcx+rsi*1],rax
      9d8a96:	48 89 54 31 08       	mov    QWORD PTR [rcx+rsi*1+0x8],rdx
      9d8a9b:	c3                   	ret
  ref @0x9d81f6: lea    rax,[rip+0xe1be2b]        # 17f4028 <pthread_rwlock_wrlock@plt+0x3268>; FDE=(10322400, 10323397)

### table-base 0x17f47a0 slot+0x28 -> 0x9e2d20 FDE=0x9e2d20..0x9e2d82
      9e2d20:	53                   	push   rbx
      9e2d21:	83 7a 08 00          	cmp    DWORD PTR [rdx+0x8],0x0
      9e2d25:	7e 4c                	jle    9e2d73 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaba3>
      9e2d27:	f3 0f 10 42 0c       	movss  xmm0,DWORD PTR [rdx+0xc]
      9e2d2c:	0f 57 c9             	xorps  xmm1,xmm1
      9e2d2f:	0f 2e c1             	ucomiss xmm0,xmm1
      9e2d32:	76 3f                	jbe    9e2d73 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaba3>
      9e2d34:	83 7a 04 00          	cmp    DWORD PTR [rdx+0x4],0x0
      9e2d38:	7e 39                	jle    9e2d73 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaba3>
      9e2d3a:	83 3a 00             	cmp    DWORD PTR [rdx],0x0
      9e2d3d:	7e 34                	jle    9e2d73 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaba3>
      9e2d3f:	48 89 f3             	mov    rbx,rsi
      9e2d42:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      9e2d45:	4c 8d 15 f9 79 95 ff 	lea    r10,[rip+0xffffffffff9579f9]        # 33a745 <_ZTSSt12bad_any_cast@@Base-0x55a83>
      9e2d4c:	ba 01 00 00 00       	mov    edx,0x1
      9e2d51:	b9 50 00 00 00       	mov    ecx,0x50
      9e2d56:	31 f6                	xor    esi,esi
      9e2d58:	41 b8 02 00 00 00    	mov    r8d,0x2
      9e2d5e:	41 b9 01 00 00 00    	mov    r9d,0x1
      9e2d64:	6a 00                	push   0x0
      9e2d66:	41 52                	push   r10
      9e2d68:	ff 10                	call   QWORD PTR [rax]
      9e2d6a:	48 83 c4 10          	add    rsp,0x10
      9e2d6e:	48 89 03             	mov    QWORD PTR [rbx],rax
      9e2d71:	5b                   	pop    rbx
      9e2d72:	c3                   	ret
      9e2d73:	48 8d 35 de 11 95 ff 	lea    rsi,[rip+0xffffffffff9511de]        # 333f58 <_ZTSSt12bad_any_cast@@Base-0x5c270>
      9e2d7a:	31 c0                	xor    eax,eax
      9e2d7c:	5b                   	pop    rbx
      9e2d7d:	e9 8e 52 ff ff       	jmp    9d8010 <_ZNSt13bad_exceptionD1Ev@@Base+0x230>
  ref @0x9e2cd6: lea    rax,[rip+0xe11ad3]        # 17f47b0 <pthread_rwlock_wrlock@plt+0x39f0>; FDE=(10366160, 10366234)

### table-base 0x17f47a8 slot+0x28 -> 0x9e2d90 FDE=0x9e2d90..0x9e2e0b
      9e2d90:	48 83 ec 28          	sub    rsp,0x28
      9e2d94:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9e2d9b:	00 00 
      9e2d9d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      9e2da2:	b8 0a 00 00 00       	mov    eax,0xa
      9e2da7:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      9e2dab:	7e 44                	jle    9e2df1 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac21>
      9e2dad:	83 3e 00             	cmp    DWORD PTR [rsi],0x0
      9e2db0:	7e 3f                	jle    9e2df1 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac21>
      9e2db2:	83 7e 04 00          	cmp    DWORD PTR [rsi+0x4],0x0
      9e2db6:	7e 39                	jle    9e2df1 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac21>
      9e2db8:	f3 0f 10 46 0c       	movss  xmm0,DWORD PTR [rsi+0xc]
      9e2dbd:	0f 57 c9             	xorps  xmm1,xmm1
      9e2dc0:	0f 2e c1             	ucomiss xmm0,xmm1
      9e2dc3:	76 2c                	jbe    9e2df1 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac21>
      9e2dc5:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      9e2dc8:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      9e2dcc:	0f 57 c0             	xorps  xmm0,xmm0
      9e2dcf:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      9e2dd4:	48 8d 05 65 1a e1 00 	lea    rax,[rip+0xe11a65]        # 17f4840 <pthread_rwlock_wrlock@plt+0x3a80>
      9e2ddb:	48 89 07             	mov    QWORD PTR [rdi],rax
      9e2dde:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      9e2de2:	0f 28 4c 24 10       	movaps xmm1,XMMWORD PTR [rsp+0x10]
      9e2de7:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
      9e2deb:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
      9e2def:	31 c0                	xor    eax,eax
      9e2df1:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      9e2df8:	00 00 
      9e2dfa:	48 3b 4c 24 20       	cmp    rcx,QWORD PTR [rsp+0x20]
      9e2dff:	75 05                	jne    9e2e06 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac36>
      9e2e01:	48 83 c4 28          	add    rsp,0x28
      9e2e05:	c3                   	ret
      9e2e06:	e8 a5 cc e0 00       	call   17efab0 <__stack_chk_fail@plt>
  ref @0x9e2d12: lea    rax,[rip+0xe11aaf]        # 17f47c8 <pthread_rwlock_wrlock@plt+0x3a08>; FDE=(10366160, 10366234)

### table-base 0x17f4800 slot+0x28 -> 0x9ee7c0 FDE=0x9ee7c0..0x9ee822
      9ee7c0:	53                   	push   rbx
      9ee7c1:	83 7a 08 00          	cmp    DWORD PTR [rdx+0x8],0x0
      9ee7c5:	7e 4c                	jle    9ee813 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6c63>
      9ee7c7:	f3 0f 10 42 0c       	movss  xmm0,DWORD PTR [rdx+0xc]
      9ee7cc:	0f 57 c9             	xorps  xmm1,xmm1
      9ee7cf:	0f 2e c1             	ucomiss xmm0,xmm1
      9ee7d2:	76 3f                	jbe    9ee813 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6c63>
      9ee7d4:	83 7a 04 00          	cmp    DWORD PTR [rdx+0x4],0x0
      9ee7d8:	7e 39                	jle    9ee813 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6c63>
      9ee7da:	83 3a 00             	cmp    DWORD PTR [rdx],0x0
      9ee7dd:	7e 34                	jle    9ee813 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6c63>
      9ee7df:	48 89 f3             	mov    rbx,rsi
      9ee7e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      9ee7e5:	4c 8d 15 59 bf 94 ff 	lea    r10,[rip+0xffffffffff94bf59]        # 33a745 <_ZTSSt12bad_any_cast@@Base-0x55a83>
      9ee7ec:	ba 01 00 00 00       	mov    edx,0x1
      9ee7f1:	b9 58 00 00 00       	mov    ecx,0x58
      9ee7f6:	31 f6                	xor    esi,esi
      9ee7f8:	41 b8 02 00 00 00    	mov    r8d,0x2
      9ee7fe:	41 b9 01 00 00 00    	mov    r9d,0x1
      9ee804:	6a 00                	push   0x0
      9ee806:	41 52                	push   r10
      9ee808:	ff 10                	call   QWORD PTR [rax]
      9ee80a:	48 83 c4 10          	add    rsp,0x10
      9ee80e:	48 89 03             	mov    QWORD PTR [rbx],rax
      9ee811:	5b                   	pop    rbx
      9ee812:	c3                   	ret
      9ee813:	48 8d 35 b9 70 99 ff 	lea    rsi,[rip+0xffffffffff9970b9]        # 3858d3 <_ZTSSt12bad_any_cast@@Base-0xa8f5>
      9ee81a:	31 c0                	xor    eax,eax
      9ee81c:	5b                   	pop    rbx
      9ee81d:	e9 ee 97 fe ff       	jmp    9d8010 <_ZNSt13bad_exceptionD1Ev@@Base+0x230>
  ref @0x9e2d02: lea    rax,[rip+0xe11b07]        # 17f4810 <pthread_rwlock_wrlock@plt+0x3a50>; FDE=(10366160, 10366234)

### table-base 0x17f4808 slot+0x28 -> 0x9ee830 FDE=0x9ee830..0x9ee89e
      9ee830:	48 83 ec 18          	sub    rsp,0x18
      9ee834:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9ee83b:	00 00 
      9ee83d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      9ee842:	b8 0a 00 00 00       	mov    eax,0xa
      9ee847:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      9ee84b:	7e 37                	jle    9ee884 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6cd4>
      9ee84d:	83 3e 00             	cmp    DWORD PTR [rsi],0x0
      9ee850:	7e 32                	jle    9ee884 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6cd4>
      9ee852:	83 7e 04 00          	cmp    DWORD PTR [rsi+0x4],0x0
      9ee856:	7e 2c                	jle    9ee884 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6cd4>
      9ee858:	f3 0f 10 46 0c       	movss  xmm0,DWORD PTR [rsi+0xc]
      9ee85d:	0f 57 c9             	xorps  xmm1,xmm1
      9ee860:	0f 2e c1             	ucomiss xmm0,xmm1
      9ee863:	76 1f                	jbe    9ee884 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6cd4>
      9ee865:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      9ee868:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      9ee86c:	48 8d 05 0d 65 e0 00 	lea    rax,[rip+0xe0650d]        # 17f4d80 <pthread_rwlock_wrlock@plt+0x3fc0>
      9ee873:	48 89 07             	mov    QWORD PTR [rdi],rax
      9ee876:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      9ee87a:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
      9ee87e:	c6 47 18 00          	mov    BYTE PTR [rdi+0x18],0x0
      9ee882:	31 c0                	xor    eax,eax
      9ee884:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      9ee88b:	00 00 
      9ee88d:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
      9ee892:	75 05                	jne    9ee899 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6ce9>
      9ee894:	48 83 c4 18          	add    rsp,0x18
      9ee898:	c3                   	ret
      9ee899:	e8 12 12 e0 00       	call   17efab0 <__stack_chk_fail@plt>
  ref @0x9e2cef: lea    rax,[rip+0xe11b32]        # 17f4828 <pthread_rwlock_wrlock@plt+0x3a68>; FDE=(10366160, 10366234)

### table-base 0x17f4818 slot+0x28 -> 0x9e2e10 FDE=0x9e2e10..0x9e2e24
      9e2e10:	b8 02 00 00 00       	mov    eax,0x2
      9e2e15:	39 f2                	cmp    edx,esi
      9e2e17:	75 0a                	jne    9e2e23 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac53>
      9e2e19:	39 77 08             	cmp    DWORD PTR [rdi+0x8],esi
      9e2e1c:	7c 05                	jl     9e2e23 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac53>
      9e2e1e:	89 77 48             	mov    DWORD PTR [rdi+0x48],esi
      9e2e21:	31 c0                	xor    eax,eax
      9e2e23:	c3                   	ret
  ref @0x9e2cef: lea    rax,[rip+0xe11b32]        # 17f4828 <pthread_rwlock_wrlock@plt+0x3a68>; FDE=(10366160, 10366234)

### table-base 0x17f4820 slot+0x28 -> 0x9e2e30 FDE=0x9e2e30..0x9e2ec7
      9e2e30:	41 57                	push   r15
      9e2e32:	41 56                	push   r14
      9e2e34:	53                   	push   rbx
      9e2e35:	c6 47 44 01          	mov    BYTE PTR [rdi+0x44],0x1
      9e2e39:	80 7f 2d 00          	cmp    BYTE PTR [rdi+0x2d],0x0
      9e2e3d:	74 30                	je     9e2e6f <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac9f>
      9e2e3f:	49 89 f7             	mov    r15,rsi
      9e2e42:	49 89 fe             	mov    r14,rdi
      9e2e45:	f3 0f 10 47 3c       	movss  xmm0,DWORD PTR [rdi+0x3c]
      9e2e4a:	f3 0f 10 4f 40       	movss  xmm1,DWORD PTR [rdi+0x40]
      9e2e4f:	0f 2e c8             	ucomiss xmm1,xmm0
      9e2e52:	75 02                	jne    9e2e56 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac86>
      9e2e54:	7b 21                	jnp    9e2e77 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaca7>
      9e2e56:	4c 89 ff             	mov    rdi,r15
      9e2e59:	be 18 00 00 00       	mov    esi,0x18
      9e2e5e:	e8 4d f2 ff ff       	call   9e20b0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x9ee0>
      9e2e63:	f3 41 0f 10 46 40    	movss  xmm0,DWORD PTR [r14+0x40]
      9e2e69:	f3 41 0f 11 46 3c    	movss  DWORD PTR [r14+0x3c],xmm0
      9e2e6f:	31 c0                	xor    eax,eax
      9e2e71:	5b                   	pop    rbx
      9e2e72:	41 5e                	pop    r14
      9e2e74:	41 5f                	pop    r15
      9e2e76:	c3                   	ret
      9e2e77:	41 83 3f 00          	cmp    DWORD PTR [r15],0x0
      9e2e7b:	0f 8e ee ff ff ff    	jle    9e2e6f <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac9f>
      9e2e81:	31 db                	xor    ebx,ebx
      9e2e83:	e9 2d 00 00 00       	jmp    9e2eb5 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xace5>
      9e2e88:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
      9e2e8f:	00 
      9e2e90:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
      9e2e94:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]
      9e2e98:	41 8b 57 04          	mov    edx,DWORD PTR [r15+0x4]
      9e2e9c:	48 89 fe             	mov    rsi,rdi
      9e2e9f:	b9 18 00 00 00       	mov    ecx,0x18
      9e2ea4:	e8 77 ed ff ff       	call   9e1c20 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x9a50>
      9e2ea9:	48 83 c3 01          	add    rbx,0x1
      9e2ead:	49 63 07             	movsxd rax,DWORD PTR [r15]
      9e2eb0:	48 39 c3             	cmp    rbx,rax
      9e2eb3:	7d ba                	jge    9e2e6f <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xac9f>
      9e2eb5:	0f 57 c0             	xorps  xmm0,xmm0
      9e2eb8:	41 80 7e 2c 00       	cmp    BYTE PTR [r14+0x2c],0x0
      9e2ebd:	75 d1                	jne    9e2e90 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xacc0>
      9e2ebf:	f3 41 0f 10 46 3c    	movss  xmm0,DWORD PTR [r14+0x3c]
      9e2ec5:	eb c9                	jmp    9e2e90 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xacc0>
  ref @0x9e2dd4: lea    rax,[rip+0xe11a65]        # 17f4840 <pthread_rwlock_wrlock@plt+0x3a80>; FDE=(10366352, 10366475)

### table-base 0x17f4828 slot+0x28 -> 0x9d81d0 FDE=0x9d81d0..0x9d81d3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
  ref @0x9e2cef: lea    rax,[rip+0xe11b32]        # 17f4828 <pthread_rwlock_wrlock@plt+0x3a68>; FDE=(10366160, 10366234)
  ref @0x9e2dd4: lea    rax,[rip+0xe11a65]        # 17f4840 <pthread_rwlock_wrlock@plt+0x3a80>; FDE=(10366352, 10366475)

### table-base 0x17f4830 slot+0x28 -> 0x9d81d0 FDE=0x9d81d0..0x9d81d3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
  ref @0x9e2dd4: lea    rax,[rip+0xe11a65]        # 17f4840 <pthread_rwlock_wrlock@plt+0x3a80>; FDE=(10366352, 10366475)

### table-base 0x17f4838 slot+0x28 -> 0x9e2ed0 FDE=0x9e2ed0..0x9e2f9f
      9e2ed0:	41 57                	push   r15
      9e2ed2:	41 56                	push   r14
      9e2ed4:	53                   	push   rbx
      9e2ed5:	48 83 ec 30          	sub    rsp,0x30
      9e2ed9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9e2ee0:	00 00 
      9e2ee2:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      9e2ee7:	b8 e7 03 00 00       	mov    eax,0x3e7
      9e2eec:	81 fe fd ff ff 7f    	cmp    esi,0x7ffffffd
      9e2ef2:	0f 85 88 00 00 00    	jne    9e2f80 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xadb0>
      9e2ef8:	49 89 fe             	mov    r14,rdi
      9e2efb:	89 c8                	mov    eax,ecx
      9e2efd:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      9e2f02:	4c 89 ff             	mov    rdi,r15
      9e2f05:	48 89 d6             	mov    rsi,rdx
      9e2f08:	48 89 c2             	mov    rdx,rax
      9e2f0b:	e8 c0 02 00 00       	call   9e31d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xb000>
      9e2f10:	49 8d 5e 28          	lea    rbx,[r14+0x28]
      9e2f14:	48 8d 35 85 19 e1 00 	lea    rsi,[rip+0xe11985]        # 17f48a0 <pthread_rwlock_wrlock@plt+0x3ae0>
      9e2f1b:	4c 89 ff             	mov    rdi,r15
      9e2f1e:	48 89 da             	mov    rdx,rbx
      9e2f21:	e8 ea 0b 00 00       	call   9e3b10 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xb940>
      9e2f26:	89 c1                	mov    ecx,eax
      9e2f28:	b8 08 00 00 00       	mov    eax,0x8
      9e2f2d:	84 c9                	test   cl,cl
      9e2f2f:	74 4f                	je     9e2f80 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xadb0>
      9e2f31:	80 7b 06 00          	cmp    BYTE PTR [rbx+0x6],0x0
      9e2f35:	74 20                	je     9e2f57 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xad87>
      9e2f37:	41 8b 4e 30          	mov    ecx,DWORD PTR [r14+0x30]
      9e2f3b:	41 83 7e 34 00       	cmp    DWORD PTR [r14+0x34],0x0
      9e2f40:	7e 0c                	jle    9e2f4e <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xad7e>
      9e2f42:	31 c0                	xor    eax,eax
      9e2f44:	85 c9                	test   ecx,ecx
      9e2f46:	0f 94 c0             	sete   al
      9e2f49:	83 c8 06             	or     eax,0x6
      9e2f4c:	eb 32                	jmp    9e2f80 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xadb0>
      9e2f4e:	b8 06 00 00 00       	mov    eax,0x6
      9e2f53:	85 c9                	test   ecx,ecx
      9e2f55:	75 29                	jne    9e2f80 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xadb0>
      9e2f57:	f3 41 0f 10 46 28    	movss  xmm0,DWORD PTR [r14+0x28]
      9e2f5d:	e8 fe 00 00 00       	call   9e3060 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae90>
      9e2f62:	f3 41 0f 11 46 40    	movss  DWORD PTR [r14+0x40],xmm0
      9e2f68:	41 80 7e 2c 00       	cmp    BYTE PTR [r14+0x2c],0x0
      9e2f6d:	74 08                	je     9e2f77 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xada7>
      9e2f6f:	f3 41 0f 11 46 3c    	movss  DWORD PTR [r14+0x3c],xmm0
      9e2f75:	eb 07                	jmp    9e2f7e <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xadae>
      9e2f77:	41 80 7e 44 00       	cmp    BYTE PTR [r14+0x44],0x0
      9e2f7c:	74 f1                	je     9e2f6f <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xad9f>
      9e2f7e:	31 c0                	xor    eax,eax
      9e2f80:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      9e2f87:	00 00 
      9e2f89:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
      9e2f8e:	75 0a                	jne    9e2f9a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xadca>
      9e2f90:	48 83 c4 30          	add    rsp,0x30
      9e2f94:	5b                   	pop    rbx
      9e2f95:	41 5e                	pop    r14
      9e2f97:	41 5f                	pop    r15
      9e2f99:	c3                   	ret
      9e2f9a:	e8 11 cb e0 00       	call   17efab0 <__stack_chk_fail@plt>

### table-base 0x17f4840 slot+0x28 -> 0x9e2fa0 FDE=0x9e2fa0..0x9e2faa
      9e2fa0:	48 c7 06 00 00 00 00 	mov    QWORD PTR [rsi],0x0
      9e2fa7:	31 c0                	xor    eax,eax
      9e2fa9:	c3                   	ret
  ref @0x9e2dd4: lea    rax,[rip+0xe11a65]        # 17f4840 <pthread_rwlock_wrlock@plt+0x3a80>; FDE=(10366352, 10366475)

### table-base 0x17f4848 slot+0x28 -> 0x9e2fb0 FDE=0x9e2fb0..0x9e3041
      9e2fb0:	55                   	push   rbp
      9e2fb1:	41 56                	push   r14
      9e2fb3:	53                   	push   rbx
      9e2fb4:	48 83 ec 10          	sub    rsp,0x10
      9e2fb8:	f3 0f 11 44 24 0c    	movss  DWORD PTR [rsp+0xc],xmm0
      9e2fbe:	89 f5                	mov    ebp,esi
      9e2fc0:	49 89 fe             	mov    r14,rdi
      9e2fc3:	89 f7                	mov    edi,esi
      9e2fc5:	e8 c6 00 00 00       	call   9e3090 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaec0>
      9e2fca:	89 c3                	mov    ebx,eax
      9e2fcc:	89 ef                	mov    edi,ebp
      9e2fce:	e8 ad 00 00 00       	call   9e3080 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaeb0>
      9e2fd3:	89 c1                	mov    ecx,eax
      9e2fd5:	b8 02 00 00 00       	mov    eax,0x2
      9e2fda:	85 db                	test   ebx,ebx
      9e2fdc:	75 5a                	jne    9e3038 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae68>
      9e2fde:	f3 0f 10 44 24 0c    	movss  xmm0,DWORD PTR [rsp+0xc]
      9e2fe4:	83 f9 01             	cmp    ecx,0x1
      9e2fe7:	74 18                	je     9e3001 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae31>
      9e2fe9:	83 f9 02             	cmp    ecx,0x2
      9e2fec:	74 3c                	je     9e302a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae5a>
      9e2fee:	83 f9 03             	cmp    ecx,0x3
      9e2ff1:	75 45                	jne    9e3038 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae68>
      9e2ff3:	0f 2e 05 fa b7 9a ff 	ucomiss xmm0,DWORD PTR [rip+0xffffffffff9ab7fa]        # 38e7f4 <_ZTSSt12bad_any_cast@@Base-0x19d4>
      9e2ffa:	41 0f 97 46 2d       	seta   BYTE PTR [r14+0x2d]
      9e2fff:	eb 35                	jmp    9e3036 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae66>
      9e3001:	f3 41 0f 11 46 28    	movss  DWORD PTR [r14+0x28],xmm0
      9e3007:	e8 54 00 00 00       	call   9e3060 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae90>
      9e300c:	f3 41 0f 11 46 40    	movss  DWORD PTR [r14+0x40],xmm0
      9e3012:	41 80 7e 2c 00       	cmp    BYTE PTR [r14+0x2c],0x0
      9e3017:	75 09                	jne    9e3022 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae52>
      9e3019:	31 c0                	xor    eax,eax
      9e301b:	41 80 7e 44 00       	cmp    BYTE PTR [r14+0x44],0x0
      9e3020:	75 16                	jne    9e3038 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae68>
      9e3022:	f3 41 0f 11 46 3c    	movss  DWORD PTR [r14+0x3c],xmm0
      9e3028:	eb 0c                	jmp    9e3036 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae66>
      9e302a:	0f 2e 05 c3 b7 9a ff 	ucomiss xmm0,DWORD PTR [rip+0xffffffffff9ab7c3]        # 38e7f4 <_ZTSSt12bad_any_cast@@Base-0x19d4>
      9e3031:	41 0f 97 46 2c       	seta   BYTE PTR [r14+0x2c]
      9e3036:	31 c0                	xor    eax,eax
      9e3038:	48 83 c4 10          	add    rsp,0x10
      9e303c:	5b                   	pop    rbx
      9e303d:	41 5e                	pop    r14
      9e303f:	5d                   	pop    rbp
      9e3040:	c3                   	ret

### table-base 0x17f4850 slot+0x28 -> 0x9e3050 FDE=0x9e3050..0x9e3056
      9e3050:	b8 19 00 00 00       	mov    eax,0x19
      9e3055:	c3                   	ret

### table-base 0x17f4858 slot+0x28 -> 0x9d81d0 FDE=0x9d81d0..0x9d81d3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret

### table-base 0x17f4908 slot+0x28 -> 0x9e6700 FDE=0x9e6700..0x9e67b7
      9e6700:	55                   	push   rbp
      9e6701:	41 57                	push   r15
      9e6703:	41 56                	push   r14
      9e6705:	53                   	push   rbx
      9e6706:	50                   	push   rax
      9e6707:	f3 0f 11 44 24 04    	movss  DWORD PTR [rsp+0x4],xmm0
      9e670d:	89 f3                	mov    ebx,esi
      9e670f:	49 89 ff             	mov    r15,rdi
      9e6712:	89 f7                	mov    edi,esi
      9e6714:	31 f6                	xor    esi,esi
      9e6716:	e8 85 c9 ff ff       	call   9e30a0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaed0>
      9e671b:	41 89 c6             	mov    r14d,eax
      9e671e:	89 df                	mov    edi,ebx
      9e6720:	be 01 00 00 00       	mov    esi,0x1
      9e6725:	e8 76 c9 ff ff       	call   9e30a0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaed0>
      9e672a:	89 c5                	mov    ebp,eax
      9e672c:	89 df                	mov    edi,ebx
      9e672e:	e8 4d c9 ff ff       	call   9e3080 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaeb0>
      9e6733:	89 c1                	mov    ecx,eax
      9e6735:	41 8b b7 68 01 00 00 	mov    esi,DWORD PTR [r15+0x168]
      9e673c:	b8 e7 03 00 00       	mov    eax,0x3e7
      9e6741:	85 f6                	test   esi,esi
      9e6743:	7e 67                	jle    9e67ac <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe5dc>
      9e6745:	83 c5 ff             	add    ebp,0xffffffff
      9e6748:	83 c1 ff             	add    ecx,0xffffffff
      9e674b:	49 8b 97 60 01 00 00 	mov    rdx,QWORD PTR [r15+0x160]
      9e6752:	48 83 c2 18          	add    rdx,0x18
      9e6756:	31 ff                	xor    edi,edi
      9e6758:	f3 0f 10 44 24 04    	movss  xmm0,DWORD PTR [rsp+0x4]
      9e675e:	eb 0d                	jmp    9e676d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe59d>
      9e6760:	48 83 c7 01          	add    rdi,0x1
      9e6764:	48 83 c2 1c          	add    rdx,0x1c
      9e6768:	48 39 fe             	cmp    rsi,rdi
      9e676b:	74 3f                	je     9e67ac <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe5dc>
      9e676d:	39 6a e8             	cmp    DWORD PTR [rdx-0x18],ebp
      9e6770:	75 ee                	jne    9e6760 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe590>
      9e6772:	39 4a ec             	cmp    DWORD PTR [rdx-0x14],ecx
      9e6775:	75 e9                	jne    9e6760 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe590>
      9e6777:	85 ff                	test   edi,edi
      9e6779:	78 31                	js     9e67ac <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe5dc>
      9e677b:	41 83 fe 02          	cmp    r14d,0x2
      9e677f:	74 1d                	je     9e679e <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe5ce>
      9e6781:	41 83 fe 01          	cmp    r14d,0x1
      9e6785:	75 25                	jne    9e67ac <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe5dc>
      9e6787:	f3 0f 11 02          	movss  DWORD PTR [rdx],xmm0
      9e678b:	31 c0                	xor    eax,eax
      9e678d:	41 80 bf 7c 01 00 00 	cmp    BYTE PTR [r15+0x17c],0x0
      9e6794:	00 
      9e6795:	75 15                	jne    9e67ac <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe5dc>
      9e6797:	f3 0f 11 42 fc       	movss  DWORD PTR [rdx-0x4],xmm0
      9e679c:	eb 0e                	jmp    9e67ac <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe5dc>
      9e679e:	f3 0f 11 42 f4       	movss  DWORD PTR [rdx-0xc],xmm0
      9e67a3:	c7 42 f8 01 00 00 00 	mov    DWORD PTR [rdx-0x8],0x1
      9e67aa:	31 c0                	xor    eax,eax
      9e67ac:	48 83 c4 08          	add    rsp,0x8
      9e67b0:	5b                   	pop    rbx
      9e67b1:	41 5e                	pop    r14
      9e67b3:	41 5f                	pop    r15
      9e67b5:	5d                   	pop    rbp
      9e67b6:	c3                   	ret

### table-base 0x17f4910 slot+0x28 -> 0x9e67c0 FDE=0x9e67c0..0x9e67c6
      9e67c0:	b8 16 00 00 00       	mov    eax,0x16
      9e67c5:	c3                   	ret

### table-base 0x17f4918 slot+0x28 -> 0x9d81d0 FDE=0x9d81d0..0x9d81d3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret

### table-base 0x17f4938 slot+0x28 -> 0x9e50f0 FDE=0x9e50f0..0x9e5137
      9e50f0:	83 7a 24 10          	cmp    DWORD PTR [rdx+0x24],0x10
      9e50f4:	75 3e                	jne    9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50f6:	48 8b 42 38          	mov    rax,QWORD PTR [rdx+0x38]
      9e50fa:	48 85 c0             	test   rax,rax
      9e50fd:	74 35                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50ff:	48 85 ff             	test   rdi,rdi
      9e5102:	74 14                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e5104:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5107:	48 85 c9             	test   rcx,rcx
      9e510a:	74 0c                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e510c:	48 83 c0 08          	add    rax,0x8
      9e5110:	48 89 d6             	mov    rsi,rdx
      9e5113:	48 89 c2             	mov    rdx,rax
      9e5116:	ff e1                	jmp    rcx
      9e5118:	48 85 f6             	test   rsi,rsi
      9e511b:	74 17                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e511d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5120:	48 85 c9             	test   rcx,rcx
      9e5123:	74 0f                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e5125:	48 83 c0 08          	add    rax,0x8
      9e5129:	48 89 f7             	mov    rdi,rsi
      9e512c:	48 89 d6             	mov    rsi,rdx
      9e512f:	48 89 c2             	mov    rdx,rax
      9e5132:	ff e1                	jmp    rcx
      9e5134:	b0 01                	mov    al,0x1
      9e5136:	c3                   	ret
  ref @0x9e680a: lea    rsi,[rip+0xe0e137]        # 17f4948 <pthread_rwlock_wrlock@plt+0x3b88>; FDE=(10381264, 10381378)

### table-base 0x17f4a00 slot+0x28 -> 0x9e50f0 FDE=0x9e50f0..0x9e5137
      9e50f0:	83 7a 24 10          	cmp    DWORD PTR [rdx+0x24],0x10
      9e50f4:	75 3e                	jne    9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50f6:	48 8b 42 38          	mov    rax,QWORD PTR [rdx+0x38]
      9e50fa:	48 85 c0             	test   rax,rax
      9e50fd:	74 35                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50ff:	48 85 ff             	test   rdi,rdi
      9e5102:	74 14                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e5104:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5107:	48 85 c9             	test   rcx,rcx
      9e510a:	74 0c                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e510c:	48 83 c0 08          	add    rax,0x8
      9e5110:	48 89 d6             	mov    rsi,rdx
      9e5113:	48 89 c2             	mov    rdx,rax
      9e5116:	ff e1                	jmp    rcx
      9e5118:	48 85 f6             	test   rsi,rsi
      9e511b:	74 17                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e511d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5120:	48 85 c9             	test   rcx,rcx
      9e5123:	74 0f                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e5125:	48 83 c0 08          	add    rax,0x8
      9e5129:	48 89 f7             	mov    rdi,rsi
      9e512c:	48 89 d6             	mov    rsi,rdx
      9e512f:	48 89 c2             	mov    rdx,rax
      9e5132:	ff e1                	jmp    rcx
      9e5134:	b0 01                	mov    al,0x1
      9e5136:	c3                   	ret
  ref @0x9e6313: lea    rsi,[rip+0xe0e6f6]        # 17f4a10 <pthread_rwlock_wrlock@plt+0x3c50>; FDE=(10379888, 10380330)

### table-base 0x17f4a18 slot+0x28 -> 0x9e7220 FDE=0x9e7220..0x9e7232
      9e7220:	39 d6                	cmp    esi,edx
      9e7222:	75 08                	jne    9e722c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf05c>
      9e7224:	89 77 48             	mov    DWORD PTR [rdi+0x48],esi
      9e7227:	e9 94 09 00 00       	jmp    9e7bc0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x10>
      9e722c:	b8 02 00 00 00       	mov    eax,0x2
      9e7231:	c3                   	ret

### table-base 0x17f4a28 slot+0x28 -> 0x9e7820 FDE=0x9e7820..0x9e7864
      9e7820:	41 56                	push   r14
      9e7822:	53                   	push   rbx
      9e7823:	50                   	push   rax
      9e7824:	49 89 fe             	mov    r14,rdi
      9e7827:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
      9e782b:	7e 1d                	jle    9e784a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf67a>
      9e782d:	31 db                	xor    ebx,ebx
      9e782f:	90                   	nop
      9e7830:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
      9e7834:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]
      9e7838:	e8 63 08 00 00       	call   9e80a0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x4f0>
      9e783d:	48 83 c3 01          	add    rbx,0x1
      9e7841:	49 63 46 08          	movsxd rax,DWORD PTR [r14+0x8]
      9e7845:	48 39 c3             	cmp    rbx,rax
      9e7848:	7c e6                	jl     9e7830 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf660>
      9e784a:	41 c7 46 78 00 00 00 	mov    DWORD PTR [r14+0x78],0x0
      9e7851:	00 
      9e7852:	41 c7 46 4c 00 00 00 	mov    DWORD PTR [r14+0x4c],0x0
      9e7859:	00 
      9e785a:	31 c0                	xor    eax,eax
      9e785c:	48 83 c4 08          	add    rsp,0x8
      9e7860:	5b                   	pop    rbx
      9e7861:	41 5e                	pop    r14
      9e7863:	c3                   	ret
  ref @0x9e714f: lea    rax,[rip+0xe0d8ea]        # 17f4a40 <pthread_rwlock_wrlock@plt+0x3c80>; FDE=(10383328, 10383898)

### table-base 0x17f4a40 slot+0x28 -> 0x9e79f0 FDE=0x9e79f0..0x9e7a06
      9e79f0:	48 c7 06 00 00 00 00 	mov    QWORD PTR [rsi],0x0
      9e79f7:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
      9e79fb:	74 06                	je     9e7a03 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf833>
      9e79fd:	8b 47 68             	mov    eax,DWORD PTR [rdi+0x68]
      9e7a00:	89 46 04             	mov    DWORD PTR [rsi+0x4],eax
      9e7a03:	31 c0                	xor    eax,eax
      9e7a05:	c3                   	ret
  ref @0x9e714f: lea    rax,[rip+0xe0d8ea]        # 17f4a40 <pthread_rwlock_wrlock@plt+0x3c80>; FDE=(10383328, 10383898)

### table-base 0x17f4a50 slot+0x28 -> 0x9e7bb0 FDE=0x9e7bb0..0x9e7bb6
      9e7bb0:	b8 04 00 00 00       	mov    eax,0x4
      9e7bb5:	c3                   	ret

### table-base 0x17f4a58 slot+0x28 -> 0x9d81d0 FDE=0x9d81d0..0x9d81d3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret

### table-base 0x17f4ac0 slot+0x28 -> 0x9e50f0 FDE=0x9e50f0..0x9e5137
      9e50f0:	83 7a 24 10          	cmp    DWORD PTR [rdx+0x24],0x10
      9e50f4:	75 3e                	jne    9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50f6:	48 8b 42 38          	mov    rax,QWORD PTR [rdx+0x38]
      9e50fa:	48 85 c0             	test   rax,rax
      9e50fd:	74 35                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50ff:	48 85 ff             	test   rdi,rdi
      9e5102:	74 14                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e5104:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5107:	48 85 c9             	test   rcx,rcx
      9e510a:	74 0c                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e510c:	48 83 c0 08          	add    rax,0x8
      9e5110:	48 89 d6             	mov    rsi,rdx
      9e5113:	48 89 c2             	mov    rdx,rax
      9e5116:	ff e1                	jmp    rcx
      9e5118:	48 85 f6             	test   rsi,rsi
      9e511b:	74 17                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e511d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5120:	48 85 c9             	test   rcx,rcx
      9e5123:	74 0f                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e5125:	48 83 c0 08          	add    rax,0x8
      9e5129:	48 89 f7             	mov    rdi,rsi
      9e512c:	48 89 d6             	mov    rsi,rdx
      9e512f:	48 89 c2             	mov    rdx,rax
      9e5132:	ff e1                	jmp    rcx
      9e5134:	b0 01                	mov    al,0x1
      9e5136:	c3                   	ret
  ref @0x9e956e: lea    rsi,[rip+0xe0b55b]        # 17f4ad0 <pthread_rwlock_wrlock@plt+0x3d10>; FDE=(10392880, 10393295)
  ref @0x9e95f2: lea    rsi,[rip+0xe0b4d7]        # 17f4ad0 <pthread_rwlock_wrlock@plt+0x3d10>; FDE=(10392880, 10393295)
  ref @0x9e967d: lea    rsi,[rip+0xe0b44c]        # 17f4ad0 <pthread_rwlock_wrlock@plt+0x3d10>; FDE=(10392880, 10393295)
  ref @0x9e97e3: lea    rsi,[rip+0xe0b2e6]        # 17f4ad0 <pthread_rwlock_wrlock@plt+0x3d10>; FDE=(10393536, 10393631)
  ref @0x9e9843: lea    rsi,[rip+0xe0b286]        # 17f4ad0 <pthread_rwlock_wrlock@plt+0x3d10>; FDE=(10393632, 10393731)

### table-base 0x17f4b00 slot+0x28 -> 0x9e50f0 FDE=0x9e50f0..0x9e5137
      9e50f0:	83 7a 24 10          	cmp    DWORD PTR [rdx+0x24],0x10
      9e50f4:	75 3e                	jne    9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50f6:	48 8b 42 38          	mov    rax,QWORD PTR [rdx+0x38]
      9e50fa:	48 85 c0             	test   rax,rax
      9e50fd:	74 35                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50ff:	48 85 ff             	test   rdi,rdi
      9e5102:	74 14                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e5104:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5107:	48 85 c9             	test   rcx,rcx
      9e510a:	74 0c                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e510c:	48 83 c0 08          	add    rax,0x8
      9e5110:	48 89 d6             	mov    rsi,rdx
      9e5113:	48 89 c2             	mov    rdx,rax
      9e5116:	ff e1                	jmp    rcx
      9e5118:	48 85 f6             	test   rsi,rsi
      9e511b:	74 17                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e511d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5120:	48 85 c9             	test   rcx,rcx
      9e5123:	74 0f                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e5125:	48 83 c0 08          	add    rax,0x8
      9e5129:	48 89 f7             	mov    rdi,rsi
      9e512c:	48 89 d6             	mov    rsi,rdx
      9e512f:	48 89 c2             	mov    rdx,rax
      9e5132:	ff e1                	jmp    rcx
      9e5134:	b0 01                	mov    al,0x1
      9e5136:	c3                   	ret
  ref @0x9e9218: lea    rsi,[rip+0xe0b8f1]        # 17f4b10 <pthread_rwlock_wrlock@plt+0x3d50>; FDE=(10392032, 10392134)
  ref @0x9e9306: lea    rsi,[rip+0xe0b803]        # 17f4b10 <pthread_rwlock_wrlock@plt+0x3d50>; FDE=(10392288, 10392369)
  ref @0x9e9407: lea    rsi,[rip+0xe0b702]        # 17f4b10 <pthread_rwlock_wrlock@plt+0x3d50>; FDE=(10392528, 10392629)

### table-base 0x17f4b40 slot+0x28 -> 0x9e50f0 FDE=0x9e50f0..0x9e5137
      9e50f0:	83 7a 24 10          	cmp    DWORD PTR [rdx+0x24],0x10
      9e50f4:	75 3e                	jne    9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50f6:	48 8b 42 38          	mov    rax,QWORD PTR [rdx+0x38]
      9e50fa:	48 85 c0             	test   rax,rax
      9e50fd:	74 35                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50ff:	48 85 ff             	test   rdi,rdi
      9e5102:	74 14                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e5104:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5107:	48 85 c9             	test   rcx,rcx
      9e510a:	74 0c                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e510c:	48 83 c0 08          	add    rax,0x8
      9e5110:	48 89 d6             	mov    rsi,rdx
      9e5113:	48 89 c2             	mov    rdx,rax
      9e5116:	ff e1                	jmp    rcx
      9e5118:	48 85 f6             	test   rsi,rsi
      9e511b:	74 17                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e511d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5120:	48 85 c9             	test   rcx,rcx
      9e5123:	74 0f                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e5125:	48 83 c0 08          	add    rax,0x8
      9e5129:	48 89 f7             	mov    rdi,rsi
      9e512c:	48 89 d6             	mov    rsi,rdx
      9e512f:	48 89 c2             	mov    rdx,rax
      9e5132:	ff e1                	jmp    rcx
      9e5134:	b0 01                	mov    al,0x1
      9e5136:	c3                   	ret
  ref @0x9e9197: lea    rsi,[rip+0xe0b9b2]        # 17f4b50 <pthread_rwlock_wrlock@plt+0x3d90>; FDE=(10391856, 10392021)
  ref @0x9e9296: lea    rsi,[rip+0xe0b8b3]        # 17f4b50 <pthread_rwlock_wrlock@plt+0x3d90>; FDE=(10392144, 10392277)
  ref @0x9e9388: lea    rsi,[rip+0xe0b7c1]        # 17f4b50 <pthread_rwlock_wrlock@plt+0x3d90>; FDE=(10392384, 10392519)

### table-base 0x17f4bd8 slot+0x28 -> 0x9e9cb0 FDE=0x9e9cb0..0x9e9cd6
      9e9cb0:	39 57 0c             	cmp    DWORD PTR [rdi+0xc],edx
      9e9cb3:	7c 05                	jl     9e9cba <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x210a>
      9e9cb5:	39 77 08             	cmp    DWORD PTR [rdi+0x8],esi
      9e9cb8:	7d 06                	jge    9e9cc0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2110>
      9e9cba:	b8 02 00 00 00       	mov    eax,0x2
      9e9cbf:	c3                   	ret
      9e9cc0:	89 77 34             	mov    DWORD PTR [rdi+0x34],esi
      9e9cc3:	89 57 38             	mov    DWORD PTR [rdi+0x38],edx
      9e9cc6:	c7 47 60 00 00 00 00 	mov    DWORD PTR [rdi+0x60],0x0
      9e9ccd:	c6 47 78 01          	mov    BYTE PTR [rdi+0x78],0x1
      9e9cd1:	e9 ca 05 00 00       	jmp    9ea2a0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x26f0>

### table-base 0x17f4c00 slot+0x28 -> 0x9ea040 FDE=0x9ea040..0x9ea113
      9ea040:	41 57                	push   r15
      9ea042:	41 56                	push   r14
      9ea044:	53                   	push   rbx
      9ea045:	48 83 ec 50          	sub    rsp,0x50
      9ea049:	49 89 f6             	mov    r14,rsi
      9ea04c:	48 89 fb             	mov    rbx,rdi
      9ea04f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9ea056:	00 00 
      9ea058:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      9ea05d:	48 c7 06 00 00 00 00 	mov    QWORD PTR [rsi],0x0
      9ea064:	8b 47 10             	mov    eax,DWORD PTR [rdi+0x10]
      9ea067:	8d 0c 00             	lea    ecx,[rax+rax*1]
      9ea06a:	89 4c 24 20          	mov    DWORD PTR [rsp+0x20],ecx
      9ea06e:	8b 4f 18             	mov    ecx,DWORD PTR [rdi+0x18]
      9ea071:	89 4c 24 24          	mov    DWORD PTR [rsp+0x24],ecx
      9ea075:	8b 4f 08             	mov    ecx,DWORD PTR [rdi+0x8]
      9ea078:	89 4c 24 28          	mov    DWORD PTR [rsp+0x28],ecx
      9ea07c:	8b 4f 0c             	mov    ecx,DWORD PTR [rdi+0xc]
      9ea07f:	89 4c 24 2c          	mov    DWORD PTR [rsp+0x2c],ecx
      9ea083:	8b 4f 20             	mov    ecx,DWORD PTR [rdi+0x20]
      9ea086:	89 4c 24 30          	mov    DWORD PTR [rsp+0x30],ecx
      9ea08a:	c6 44 24 34 00       	mov    BYTE PTR [rsp+0x34],0x0
      9ea08f:	80 7f 24 00          	cmp    BYTE PTR [rdi+0x24],0x0
      9ea093:	0f 95 c1             	setne  cl
      9ea096:	80 7f 25 00          	cmp    BYTE PTR [rdi+0x25],0x0
      9ea09a:	0f 94 c2             	sete   dl
      9ea09d:	20 ca                	and    dl,cl
      9ea09f:	88 54 24 35          	mov    BYTE PTR [rsp+0x35],dl
      9ea0a3:	89 44 24 38          	mov    DWORD PTR [rsp+0x38],eax
      9ea0a7:	c7 44 24 3c 00 00 00 	mov    DWORD PTR [rsp+0x3c],0x0
      9ea0ae:	00 
      9ea0af:	48 c7 44 24 40 00 00 	mov    QWORD PTR [rsp+0x40],0x0
      9ea0b6:	00 00 
      9ea0b8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      9ea0bd:	e8 0e 0b 00 00       	call   9eabd0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x3020>
      9ea0c2:	41 89 06             	mov    DWORD PTR [r14],eax
      9ea0c5:	48 8b 73 70          	mov    rsi,QWORD PTR [rbx+0x70]
      9ea0c9:	49 89 e7             	mov    r15,rsp
      9ea0cc:	4c 89 ff             	mov    rdi,r15
      9ea0cf:	e8 8c 41 00 00       	call   9ee260 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x66b0>
      9ea0d4:	f3 0f 2c 73 14       	cvttss2si esi,DWORD PTR [rbx+0x14]
      9ea0d9:	4c 89 ff             	mov    rdi,r15
      9ea0dc:	e8 9f 41 00 00       	call   9ee280 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x66d0>
      9ea0e1:	48 85 c0             	test   rax,rax
      9ea0e4:	74 0c                	je     9ea0f2 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2542>
      9ea0e6:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      9ea0eb:	8b 40 0c             	mov    eax,DWORD PTR [rax+0xc]
      9ea0ee:	41 89 46 04          	mov    DWORD PTR [r14+0x4],eax
      9ea0f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9ea0f9:	00 00 
      9ea0fb:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      9ea100:	75 0c                	jne    9ea10e <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x255e>
      9ea102:	31 c0                	xor    eax,eax
      9ea104:	48 83 c4 50          	add    rsp,0x50
      9ea108:	5b                   	pop    rbx
      9ea109:	41 5e                	pop    r14
      9ea10b:	41 5f                	pop    r15
      9ea10d:	c3                   	ret
      9ea10e:	e8 9d 59 e0 00       	call   17efab0 <__stack_chk_fail@plt>
  ref @0x9e9c50: lea    rax,[rip+0xe0afa9]        # 17f4c00 <pthread_rwlock_wrlock@plt+0x3e40>; FDE=(10394448, 10394798)

### table-base 0x17f4c10 slot+0x28 -> 0x9ea290 FDE=0x9ea290..0x9ea296
      9ea290:	b8 05 00 00 00       	mov    eax,0x5
      9ea295:	c3                   	ret

### table-base 0x17f4c18 slot+0x28 -> 0x9d81d0 FDE=0x9d81d0..0x9d81d3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret

### table-base 0x17f4c38 slot+0x28 -> 0x9e50f0 FDE=0x9e50f0..0x9e5137
      9e50f0:	83 7a 24 10          	cmp    DWORD PTR [rdx+0x24],0x10
      9e50f4:	75 3e                	jne    9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50f6:	48 8b 42 38          	mov    rax,QWORD PTR [rdx+0x38]
      9e50fa:	48 85 c0             	test   rax,rax
      9e50fd:	74 35                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50ff:	48 85 ff             	test   rdi,rdi
      9e5102:	74 14                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e5104:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5107:	48 85 c9             	test   rcx,rcx
      9e510a:	74 0c                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e510c:	48 83 c0 08          	add    rax,0x8
      9e5110:	48 89 d6             	mov    rsi,rdx
      9e5113:	48 89 c2             	mov    rdx,rax
      9e5116:	ff e1                	jmp    rcx
      9e5118:	48 85 f6             	test   rsi,rsi
      9e511b:	74 17                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e511d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5120:	48 85 c9             	test   rcx,rcx
      9e5123:	74 0f                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e5125:	48 83 c0 08          	add    rax,0x8
      9e5129:	48 89 f7             	mov    rdi,rsi
      9e512c:	48 89 d6             	mov    rsi,rdx
      9e512f:	48 89 c2             	mov    rdx,rax
      9e5132:	ff e1                	jmp    rcx
      9e5134:	b0 01                	mov    al,0x1
      9e5136:	c3                   	ret
  ref @0x9ee6e6: lea    rsi,[rip+0xe0655b]        # 17f4c48 <pthread_rwlock_wrlock@plt+0x3e88>; FDE=(10413680, 10413932)

### table-base 0x17f4c80 slot+0x28 -> 0x9e50f0 FDE=0x9e50f0..0x9e5137
      9e50f0:	83 7a 24 10          	cmp    DWORD PTR [rdx+0x24],0x10
      9e50f4:	75 3e                	jne    9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50f6:	48 8b 42 38          	mov    rax,QWORD PTR [rdx+0x38]
      9e50fa:	48 85 c0             	test   rax,rax
      9e50fd:	74 35                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50ff:	48 85 ff             	test   rdi,rdi
      9e5102:	74 14                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e5104:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5107:	48 85 c9             	test   rcx,rcx
      9e510a:	74 0c                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e510c:	48 83 c0 08          	add    rax,0x8
      9e5110:	48 89 d6             	mov    rsi,rdx
      9e5113:	48 89 c2             	mov    rdx,rax
      9e5116:	ff e1                	jmp    rcx
      9e5118:	48 85 f6             	test   rsi,rsi
      9e511b:	74 17                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e511d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5120:	48 85 c9             	test   rcx,rcx
      9e5123:	74 0f                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e5125:	48 83 c0 08          	add    rax,0x8
      9e5129:	48 89 f7             	mov    rdi,rsi
      9e512c:	48 89 d6             	mov    rsi,rdx
      9e512f:	48 89 c2             	mov    rdx,rax
      9e5132:	ff e1                	jmp    rcx
      9e5134:	b0 01                	mov    al,0x1
      9e5136:	c3                   	ret
  ref @0x9ee5ae: lea    rsi,[rip+0xe066db]        # 17f4c90 <pthread_rwlock_wrlock@plt+0x3ed0>; FDE=(10413344, 10413570)

### table-base 0x17f4cc0 slot+0x28 -> 0x9e50f0 FDE=0x9e50f0..0x9e5137
      9e50f0:	83 7a 24 10          	cmp    DWORD PTR [rdx+0x24],0x10
      9e50f4:	75 3e                	jne    9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50f6:	48 8b 42 38          	mov    rax,QWORD PTR [rdx+0x38]
      9e50fa:	48 85 c0             	test   rax,rax
      9e50fd:	74 35                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50ff:	48 85 ff             	test   rdi,rdi
      9e5102:	74 14                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e5104:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5107:	48 85 c9             	test   rcx,rcx
      9e510a:	74 0c                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e510c:	48 83 c0 08          	add    rax,0x8
      9e5110:	48 89 d6             	mov    rsi,rdx
      9e5113:	48 89 c2             	mov    rdx,rax
      9e5116:	ff e1                	jmp    rcx
      9e5118:	48 85 f6             	test   rsi,rsi
      9e511b:	74 17                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e511d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5120:	48 85 c9             	test   rcx,rcx
      9e5123:	74 0f                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e5125:	48 83 c0 08          	add    rax,0x8
      9e5129:	48 89 f7             	mov    rdi,rsi
      9e512c:	48 89 d6             	mov    rsi,rdx
      9e512f:	48 89 c2             	mov    rdx,rax
      9e5132:	ff e1                	jmp    rcx
      9e5134:	b0 01                	mov    al,0x1
      9e5136:	c3                   	ret
  ref @0x9ee38b: lea    rsi,[rip+0xe0693e]        # 17f4cd0 <pthread_rwlock_wrlock@plt+0x3f10>; FDE=(10412720, 10413045)
  ref @0x9ee4b5: lea    rsi,[rip+0xe06814]        # 17f4cd0 <pthread_rwlock_wrlock@plt+0x3f10>; FDE=(10413056, 10413334)

### table-base 0x17f4d58 slot+0x28 -> 0x9ee8a0 FDE=0x9ee8a0..0x9ee8ba
      9ee8a0:	b8 02 00 00 00       	mov    eax,0x2
      9ee8a5:	39 d6                	cmp    esi,edx
      9ee8a7:	75 10                	jne    9ee8b9 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6d09>
      9ee8a9:	0f 57 c0             	xorps  xmm0,xmm0
      9ee8ac:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
      9ee8b0:	c7 47 50 db 4a 05 00 	mov    DWORD PTR [rdi+0x50],0x54adb
      9ee8b7:	31 c0                	xor    eax,eax
      9ee8b9:	c3                   	ret

### table-base 0x17f4d80 slot+0x28 -> 0x9e2fa0 FDE=0x9e2fa0..0x9e2faa
      9e2fa0:	48 c7 06 00 00 00 00 	mov    QWORD PTR [rsi],0x0
      9e2fa7:	31 c0                	xor    eax,eax
      9e2fa9:	c3                   	ret
  ref @0x9ee86c: lea    rax,[rip+0xe0650d]        # 17f4d80 <pthread_rwlock_wrlock@plt+0x3fc0>; FDE=(10414128, 10414238)

### table-base 0x17f4d88 slot+0x28 -> 0x9eeca0 FDE=0x9eeca0..0x9eed30
      9eeca0:	55                   	push   rbp
      9eeca1:	41 56                	push   r14
      9eeca3:	53                   	push   rbx
      9eeca4:	48 83 ec 10          	sub    rsp,0x10
      9eeca8:	f3 0f 11 44 24 0c    	movss  DWORD PTR [rsp+0xc],xmm0
      9eecae:	89 f3                	mov    ebx,esi
      9eecb0:	49 89 fe             	mov    r14,rdi
      9eecb3:	89 f7                	mov    edi,esi
      9eecb5:	e8 d6 43 ff ff       	call   9e3090 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaec0>
      9eecba:	89 c5                	mov    ebp,eax
      9eecbc:	89 df                	mov    edi,ebx
      9eecbe:	e8 bd 43 ff ff       	call   9e3080 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaeb0>
      9eecc3:	89 c1                	mov    ecx,eax
      9eecc5:	b8 02 00 00 00       	mov    eax,0x2
      9eecca:	83 fd 01             	cmp    ebp,0x1
      9eeccd:	74 27                	je     9eecf6 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7146>
      9eeccf:	85 ed                	test   ebp,ebp
      9eecd1:	75 54                	jne    9eed27 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7177>
      9eecd3:	83 f9 03             	cmp    ecx,0x3
      9eecd6:	74 37                	je     9eed0f <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x715f>
      9eecd8:	83 f9 02             	cmp    ecx,0x2
      9eecdb:	74 3e                	je     9eed1b <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x716b>
      9eecdd:	83 f9 01             	cmp    ecx,0x1
      9eece0:	75 45                	jne    9eed27 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7177>
      9eece2:	f3 0f 10 44 24 0c    	movss  xmm0,DWORD PTR [rsp+0xc]
      9eece8:	0f 2e 05 05 fb 99 ff 	ucomiss xmm0,DWORD PTR [rip+0xffffffffff99fb05]        # 38e7f4 <_ZTSSt12bad_any_cast@@Base-0x19d4>
      9eecef:	41 0f 97 46 1c       	seta   BYTE PTR [r14+0x1c]
      9eecf4:	eb 2f                	jmp    9eed25 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7175>
      9eecf6:	83 c1 ff             	add    ecx,0xffffffff
      9eecf9:	41 3b 4e 20          	cmp    ecx,DWORD PTR [r14+0x20]
      9eecfd:	7f 28                	jg     9eed27 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7177>
      9eecff:	f3 0f 2c 44 24 0c    	cvttss2si eax,DWORD PTR [rsp+0xc]
      9eed05:	48 63 c9             	movsxd rcx,ecx
      9eed08:	41 89 44 8e 24       	mov    DWORD PTR [r14+rcx*4+0x24],eax
      9eed0d:	eb 16                	jmp    9eed25 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7175>
      9eed0f:	f3 0f 2c 44 24 0c    	cvttss2si eax,DWORD PTR [rsp+0xc]
      9eed15:	41 89 46 34          	mov    DWORD PTR [r14+0x34],eax
      9eed19:	eb 0a                	jmp    9eed25 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7175>
      9eed1b:	f3 0f 2c 44 24 0c    	cvttss2si eax,DWORD PTR [rsp+0xc]
      9eed21:	41 89 46 30          	mov    DWORD PTR [r14+0x30],eax
      9eed25:	31 c0                	xor    eax,eax
      9eed27:	48 83 c4 10          	add    rsp,0x10
      9eed2b:	5b                   	pop    rbx
      9eed2c:	41 5e                	pop    r14
      9eed2e:	5d                   	pop    rbp
      9eed2f:	c3                   	ret

### table-base 0x17f4d90 slot+0x28 -> 0x9d81d0 FDE=0x9d81d0..0x9d81d3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret

### table-base 0x17f4d98 slot+0x28 -> 0x9d81d0 FDE=0x9d81d0..0x9d81d3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret

### table-base 0x17f4de8 slot+0x28 -> 0x9ef100 FDE=0x9ef100..0x9ef127
      9ef100:	50                   	push   rax
      9ef101:	b8 02 00 00 00       	mov    eax,0x2
      9ef106:	39 d6                	cmp    esi,edx
      9ef108:	75 1b                	jne    9ef125 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7575>
      9ef10a:	89 77 08             	mov    DWORD PTR [rdi+0x8],esi
      9ef10d:	89 77 0c             	mov    DWORD PTR [rdi+0xc],esi
      9ef110:	39 77 20             	cmp    DWORD PTR [rdi+0x20],esi
      9ef113:	7c 10                	jl     9ef125 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7575>
      9ef115:	39 77 24             	cmp    DWORD PTR [rdi+0x24],esi
      9ef118:	7c 0b                	jl     9ef125 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7575>
      9ef11a:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
      9ef11e:	e8 dd 07 00 00       	call   9ef900 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7d50>
      9ef123:	31 c0                	xor    eax,eax
      9ef125:	59                   	pop    rcx
      9ef126:	c3                   	ret

### table-base 0x17f4e10 slot+0x28 -> 0x9ef300 FDE=0x9ef300..0x9ef36f
      9ef300:	53                   	push   rbx
      9ef301:	48 83 ec 20          	sub    rsp,0x20
      9ef305:	48 89 f3             	mov    rbx,rsi
      9ef308:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9ef30f:	00 00 
      9ef311:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      9ef316:	48 c7 06 00 00 00 00 	mov    QWORD PTR [rsi],0x0
      9ef31d:	8b 47 20             	mov    eax,DWORD PTR [rdi+0x20]
      9ef320:	89 04 24             	mov    DWORD PTR [rsp],eax
      9ef323:	8b 47 28             	mov    eax,DWORD PTR [rdi+0x28]
      9ef326:	89 44 24 04          	mov    DWORD PTR [rsp+0x4],eax
      9ef32a:	f3 0f 10 47 30       	movss  xmm0,DWORD PTR [rdi+0x30]
      9ef32f:	f3 0f 11 44 24 08    	movss  DWORD PTR [rsp+0x8],xmm0
      9ef335:	f3 0f 10 47 2c       	movss  xmm0,DWORD PTR [rdi+0x2c]
      9ef33a:	f3 0f 11 44 24 0c    	movss  DWORD PTR [rsp+0xc],xmm0
      9ef340:	c7 44 24 10 10 00 00 	mov    DWORD PTR [rsp+0x10],0x10
      9ef347:	00 
      9ef348:	48 89 e7             	mov    rdi,rsp
      9ef34b:	e8 00 03 00 00       	call   9ef650 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7aa0>
      9ef350:	89 03                	mov    DWORD PTR [rbx],eax
      9ef352:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9ef359:	00 00 
      9ef35b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      9ef360:	75 08                	jne    9ef36a <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x77ba>
      9ef362:	31 c0                	xor    eax,eax
      9ef364:	48 83 c4 20          	add    rsp,0x20
      9ef368:	5b                   	pop    rbx
      9ef369:	c3                   	ret
      9ef36a:	e8 41 07 e0 00       	call   17efab0 <__stack_chk_fail@plt>
  ref @0x9eefd8: lea    rdx,[rip+0xe05e31]        # 17f4e10 <pthread_rwlock_wrlock@plt+0x4050>; FDE=(10415840, 10416377)

### table-base 0x17f4e20 slot+0x28 -> 0x9ec5e0 FDE=0x9ec5e0..0x9ec5e6
      9ec5e0:	b8 10 00 00 00       	mov    eax,0x10
      9ec5e5:	c3                   	ret

### table-base 0x17f4e28 slot+0x28 -> 0x9ef4f0 FDE=0x9ef4f0..0x9ef501
      9ef4f0:	50                   	push   rax
      9ef4f1:	48 81 c7 88 00 00 00 	add    rdi,0x88
      9ef4f8:	e8 f3 17 00 00       	call   9f0cf0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x9140>
      9ef4fd:	31 c0                	xor    eax,eax
      9ef4ff:	59                   	pop    rcx
      9ef500:	c3                   	ret

### table-base 0x17f4f90 slot+0x28 -> 0x9e50f0 FDE=0x9e50f0..0x9e5137
      9e50f0:	83 7a 24 10          	cmp    DWORD PTR [rdx+0x24],0x10
      9e50f4:	75 3e                	jne    9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50f6:	48 8b 42 38          	mov    rax,QWORD PTR [rdx+0x38]
      9e50fa:	48 85 c0             	test   rax,rax
      9e50fd:	74 35                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e50ff:	48 85 ff             	test   rdi,rdi
      9e5102:	74 14                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e5104:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5107:	48 85 c9             	test   rcx,rcx
      9e510a:	74 0c                	je     9e5118 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf48>
      9e510c:	48 83 c0 08          	add    rax,0x8
      9e5110:	48 89 d6             	mov    rsi,rdx
      9e5113:	48 89 c2             	mov    rdx,rax
      9e5116:	ff e1                	jmp    rcx
      9e5118:	48 85 f6             	test   rsi,rsi
      9e511b:	74 17                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e511d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      9e5120:	48 85 c9             	test   rcx,rcx
      9e5123:	74 0f                	je     9e5134 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xcf64>
      9e5125:	48 83 c0 08          	add    rax,0x8
      9e5129:	48 89 f7             	mov    rdi,rsi
      9e512c:	48 89 d6             	mov    rsi,rdx
      9e512f:	48 89 c2             	mov    rdx,rax
      9e5132:	ff e1                	jmp    rcx
      9e5134:	b0 01                	mov    al,0x1
      9e5136:	c3                   	ret
  ref @0x9f1579: lea    rsi,[rip+0xe03a20]        # 17f4fa0 <pthread_rwlock_wrlock@plt+0x41e0>; FDE=(10425600, 10425781)

### table-base 0x17f5048 slot+0x28 -> 0xa01fd0 FDE=0xa01fd0..0xa01fe2
      a01fd0:	53                   	push   rbx
      a01fd1:	48 89 fb             	mov    rbx,rdi
      a01fd4:	e8 07 d0 de 00       	call   17eefe0 <_ZNSt8bad_castD2Ev@plt>
      a01fd9:	48 89 df             	mov    rdi,rbx
      a01fdc:	5b                   	pop    rbx
      a01fdd:	e9 3e bf de 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5118 slot+0x28 -> 0xa02530 FDE=0xa02530..0xa02544
      a02530:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      a02534:	f6 40 30 01          	test   BYTE PTR [rax+0x30],0x1
      a02538:	74 05                	je     a0253f <_ZNSt6__ndk14__fs10filesystem16filesystem_error13__create_whatEi@@Base+0xef>
      a0253a:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]
      a0253e:	c3                   	ret
      a0253f:	48 83 c0 31          	add    rax,0x31
      a02543:	c3                   	ret

### table-base 0x17f52a8 slot+0x28 -> 0xa0da20 FDE=0xa0da20..0xa0da32
      a0da20:	53                   	push   rbx
      a0da21:	48 89 fb             	mov    rbx,rdi
      a0da24:	e8 77 07 de 00       	call   17ee1a0 <_ZNSt6__ndk114error_categoryD2Ev@plt>
      a0da29:	48 89 df             	mov    rdi,rbx
      a0da2c:	5b                   	pop    rbx
      a0da2d:	e9 ee 04 de 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f52b0 slot+0x28 -> 0xa0d0f0 FDE=0xa0d0f0..0xa0d0f8
      a0d0f0:	48 8d 05 d6 c0 97 ff 	lea    rax,[rip+0xffffffffff97c0d6]        # 3891cd <_ZTSSt12bad_any_cast@@Base-0x6ffb>
      a0d0f7:	c3                   	ret

### table-base 0x17f52d0 slot+0x28 -> 0xa0d100 FDE=0xa0d100..0xa0d15a
      a0d100:	53                   	push   rbx
      a0d101:	48 89 fb             	mov    rbx,rdi
      a0d104:	81 fa 00 10 00 00    	cmp    edx,0x1000
      a0d10a:	7c 41                	jl     a0d14d <_ZNSt6__ndk110to_wstringEg@@Base+0xb8d>
      a0d10c:	bf 30 00 00 00       	mov    edi,0x30
      a0d111:	e8 ea 0d de 00       	call   17edf00 <_Znwm@plt>
      a0d116:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a0d11a:	48 c7 03 31 00 00 00 	mov    QWORD PTR [rbx],0x31
      a0d121:	48 c7 43 08 22 00 00 	mov    QWORD PTR [rbx+0x8],0x22
      a0d128:	00 
      a0d129:	0f 10 05 bb a6 92 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff92a6bb]        # 3377eb <_ZTSSt12bad_any_cast@@Base-0x589dd>
      a0d130:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      a0d134:	0f 10 05 a0 a6 92 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff92a6a0]        # 3377db <_ZTSSt12bad_any_cast@@Base-0x589ed>
      a0d13b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      a0d13e:	66 c7 40 20 6f 72    	mov    WORD PTR [rax+0x20],0x726f
      a0d144:	c6 40 22 00          	mov    BYTE PTR [rax+0x22],0x0
      a0d148:	48 89 d8             	mov    rax,rbx
      a0d14b:	5b                   	pop    rbx
      a0d14c:	c3                   	ret
      a0d14d:	48 89 df             	mov    rdi,rbx
      a0d150:	e8 9b fe ff ff       	call   a0cff0 <_ZNSt6__ndk110to_wstringEg@@Base+0xa30>
      a0d155:	48 89 d8             	mov    rax,rbx
      a0d158:	5b                   	pop    rbx
      a0d159:	c3                   	ret

### table-base 0x17f52f0 slot+0x28 -> 0xa0da20 FDE=0xa0da20..0xa0da32
      a0da20:	53                   	push   rbx
      a0da21:	48 89 fb             	mov    rbx,rdi
      a0da24:	e8 77 07 de 00       	call   17ee1a0 <_ZNSt6__ndk114error_categoryD2Ev@plt>
      a0da29:	48 89 df             	mov    rdi,rbx
      a0da2c:	5b                   	pop    rbx
      a0da2d:	e9 ee 04 de 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f52f8 slot+0x28 -> 0xa0d1a0 FDE=0xa0d1a0..0xa0d1a8
      a0d1a0:	48 8d 05 ec ef 96 ff 	lea    rax,[rip+0xffffffffff96efec]        # 37c193 <_ZTSSt12bad_any_cast@@Base-0x14035>
      a0d1a7:	c3                   	ret

### table-base 0x17f5318 slot+0x28 -> 0xa0d1b0 FDE=0xa0d1b0..0xa0d206
      a0d1b0:	53                   	push   rbx
      a0d1b1:	48 89 fb             	mov    rbx,rdi
      a0d1b4:	81 fa 00 10 00 00    	cmp    edx,0x1000
      a0d1ba:	7c 3d                	jl     a0d1f9 <_ZNSt6__ndk116generic_categoryEv@@Base+0x99>
      a0d1bc:	bf 30 00 00 00       	mov    edi,0x30
      a0d1c1:	e8 3a 0d de 00       	call   17edf00 <_Znwm@plt>
      a0d1c6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a0d1ca:	48 c7 03 31 00 00 00 	mov    QWORD PTR [rbx],0x31
      a0d1d1:	48 c7 43 08 21 00 00 	mov    QWORD PTR [rbx+0x8],0x21
      a0d1d8:	00 
      a0d1d9:	0f 10 05 82 63 91 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff916382]        # 323562 <_ZTSSt12bad_any_cast@@Base-0x6cc66>
      a0d1e0:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      a0d1e4:	0f 10 05 67 63 91 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff916367]        # 323552 <_ZTSSt12bad_any_cast@@Base-0x6cc76>
      a0d1eb:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      a0d1ee:	66 c7 40 20 72 00    	mov    WORD PTR [rax+0x20],0x72
      a0d1f4:	48 89 d8             	mov    rax,rbx
      a0d1f7:	5b                   	pop    rbx
      a0d1f8:	c3                   	ret
      a0d1f9:	48 89 df             	mov    rdi,rbx
      a0d1fc:	e8 ef fd ff ff       	call   a0cff0 <_ZNSt6__ndk110to_wstringEg@@Base+0xa30>
      a0d201:	48 89 d8             	mov    rax,rbx
      a0d204:	5b                   	pop    rbx
      a0d205:	c3                   	ret

### table-base 0x17f53c0 slot+0x28 -> 0xa0da50 FDE=0xa0da50..0xa0da62
      a0da50:	53                   	push   rbx
      a0da51:	48 89 fb             	mov    rbx,rdi
      a0da54:	e8 d7 04 de 00       	call   17edf30 <_ZNSt9exceptionD2Ev@plt>
      a0da59:	48 89 df             	mov    rdi,rbx
      a0da5c:	5b                   	pop    rbx
      a0da5d:	e9 be 04 de 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5400 slot+0x28 -> 0xa0da20 FDE=0xa0da20..0xa0da32
      a0da20:	53                   	push   rbx
      a0da21:	48 89 fb             	mov    rbx,rdi
      a0da24:	e8 77 07 de 00       	call   17ee1a0 <_ZNSt6__ndk114error_categoryD2Ev@plt>
      a0da29:	48 89 df             	mov    rdi,rbx
      a0da2c:	5b                   	pop    rbx
      a0da2d:	e9 ee 04 de 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5408 slot+0x28 -> 0xa0e260 FDE=0xa0e260..0xa0e268
      a0e260:	48 8d 05 cc ff 92 ff 	lea    rax,[rip+0xffffffffff92ffcc]        # 33e233 <_ZTSSt12bad_any_cast@@Base-0x51f95>
      a0e267:	c3                   	ret

### table-base 0x17f5480 slot+0x28 -> 0x12774b2 FDE=0x12774b2..0x12774e8
     12774b2:	53                   	push   rbx
     12774b3:	48 89 fb             	mov    rbx,rdi
     12774b6:	48 8b 05 33 a9 63 00 	mov    rax,QWORD PTR [rip+0x63a933]        # 18b1df0 <_ZTVNSt6__ndk117__assoc_sub_stateE@@Base+0xbc958>
     12774bd:	48 83 c0 10          	add    rax,0x10
     12774c1:	48 89 07             	mov    QWORD PTR [rdi],rax
     12774c4:	48 83 c7 40          	add    rdi,0x40
     12774c8:	e8 b3 76 57 00       	call   17eeb80 <_ZNSt6__ndk118condition_variableD1Ev@plt>
     12774cd:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     12774d1:	e8 7a 6b 57 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
     12774d6:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     12774da:	e8 b1 6e 57 00       	call   17ee390 <_ZNSt13exception_ptrD1Ev@plt>
     12774df:	48 89 df             	mov    rdi,rbx
     12774e2:	5b                   	pop    rbx
     12774e3:	e9 b8 7c 57 00       	jmp    17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>

### table-base 0x17f5488 slot+0x28 -> 0xa0eea0 FDE=0xa0eea0..0xa0eede
      a0eea0:	53                   	push   rbx
      a0eea1:	48 89 fb             	mov    rbx,rdi
      a0eea4:	48 8b 05 45 2f ea 00 	mov    rax,QWORD PTR [rip+0xea2f45]        # 18b1df0 <_ZTVNSt6__ndk117__assoc_sub_stateE@@Base+0xbc958>
      a0eeab:	48 83 c0 10          	add    rax,0x10
      a0eeaf:	48 89 07             	mov    QWORD PTR [rdi],rax
      a0eeb2:	48 83 c7 40          	add    rdi,0x40
      a0eeb6:	e8 c5 fc dd 00       	call   17eeb80 <_ZNSt6__ndk118condition_variableD1Ev@plt>
      a0eebb:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      a0eebf:	e8 8c f1 dd 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
      a0eec4:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      a0eec8:	e8 c3 f4 dd 00       	call   17ee390 <_ZNSt13exception_ptrD1Ev@plt>
      a0eecd:	48 89 df             	mov    rdi,rbx
      a0eed0:	e8 cb 02 de 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a0eed5:	48 89 df             	mov    rdi,rbx
      a0eed8:	5b                   	pop    rbx
      a0eed9:	e9 42 f0 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f54e8 slot+0x28 -> 0xa0da20 FDE=0xa0da20..0xa0da32
      a0da20:	53                   	push   rbx
      a0da21:	48 89 fb             	mov    rbx,rdi
      a0da24:	e8 77 07 de 00       	call   17ee1a0 <_ZNSt6__ndk114error_categoryD2Ev@plt>
      a0da29:	48 89 df             	mov    rdi,rbx
      a0da2c:	5b                   	pop    rbx
      a0da2d:	e9 ee 04 de 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f54f0 slot+0x28 -> 0xa0fe00 FDE=0xa0fe00..0xa0fe08
      a0fe00:	48 8d 05 17 2d 96 ff 	lea    rax,[rip+0xffffffffff962d17]        # 372b1e <_ZTSSt12bad_any_cast@@Base-0x1d6aa>
      a0fe07:	c3                   	ret

### table-base 0x17f5510 slot+0x28 -> 0xa0fe10 FDE=0xa0fe10..0xa0fe70
      a0fe10:	53                   	push   rbx
      a0fe11:	48 89 fb             	mov    rbx,rdi
      a0fe14:	83 fa 01             	cmp    edx,0x1
      a0fe17:	74 15                	je     a0fe2e <_ZNKSt6__ndk113random_device7entropyEv@@Base+0x6e>
      a0fe19:	81 fa ff 0f 00 00    	cmp    edx,0xfff
      a0fe1f:	7f 0d                	jg     a0fe2e <_ZNKSt6__ndk113random_device7entropyEv@@Base+0x6e>
      a0fe21:	48 89 df             	mov    rdi,rbx
      a0fe24:	e8 c7 d1 ff ff       	call   a0cff0 <_ZNSt6__ndk110to_wstringEg@@Base+0xa30>
      a0fe29:	48 89 d8             	mov    rax,rbx
      a0fe2c:	5b                   	pop    rbx
      a0fe2d:	c3                   	ret
      a0fe2e:	bf 30 00 00 00       	mov    edi,0x30
      a0fe33:	e8 c8 e0 dd 00       	call   17edf00 <_Znwm@plt>
      a0fe38:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a0fe3c:	48 c7 03 31 00 00 00 	mov    QWORD PTR [rbx],0x31
      a0fe43:	48 c7 43 08 23 00 00 	mov    QWORD PTR [rbx+0x8],0x23
      a0fe4a:	00 
      a0fe4b:	0f 10 05 2c f4 96 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff96f42c]        # 37f27e <_ZTSSt12bad_any_cast@@Base-0x10f4a>
      a0fe52:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      a0fe56:	0f 10 05 11 f4 96 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff96f411]        # 37f26e <_ZTSSt12bad_any_cast@@Base-0x10f5a>
      a0fe5d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      a0fe60:	c7 40 1f 72 72 6f 72 	mov    DWORD PTR [rax+0x1f],0x726f7272
      a0fe67:	c6 40 23 00          	mov    BYTE PTR [rax+0x23],0x0
      a0fe6b:	48 89 d8             	mov    rax,rbx
      a0fe6e:	5b                   	pop    rbx
      a0fe6f:	c3                   	ret

### table-base 0x17f58e0 slot+0x28 -> 0xabda18 FDE=0xabda18..0xabda3c
      abda18:	53                   	push   rbx
      abda19:	48 89 fb             	mov    rbx,rdi
      abda1c:	48 8b 05 8d 41 df 00 	mov    rax,QWORD PTR [rip+0xdf418d]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      abda23:	48 83 c0 10          	add    rax,0x10
      abda27:	48 89 07             	mov    QWORD PTR [rdi],rax
      abda2a:	48 83 c7 40          	add    rdi,0x40
      abda2e:	e8 5d 04 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      abda33:	48 89 df             	mov    rdi,rbx
      abda36:	5b                   	pop    rbx
      abda37:	e9 a4 0b d3 00       	jmp    17ee5e0 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEED2Ev@plt>

### table-base 0x17f58e8 slot+0x28 -> 0xa1b770 FDE=0xa1b770..0xa1b7b1
      a1b770:	53                   	push   rbx
      a1b771:	48 89 fb             	mov    rbx,rdi
      a1b774:	48 8b 05 35 64 e9 00 	mov    rax,QWORD PTR [rip+0xe96435]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1b77b:	48 83 c0 10          	add    rax,0x10
      a1b77f:	48 89 07             	mov    QWORD PTR [rdi],rax
      a1b782:	f6 47 40 01          	test   BYTE PTR [rdi+0x40],0x1
      a1b786:	74 09                	je     a1b791 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x121>
      a1b788:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
      a1b78c:	e8 8f 27 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1b791:	48 8b 05 d0 67 e9 00 	mov    rax,QWORD PTR [rip+0xe967d0]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1b798:	48 83 c0 10          	add    rax,0x10
      a1b79c:	48 89 03             	mov    QWORD PTR [rbx],rax
      a1b79f:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      a1b7a3:	e8 88 2e dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1b7a8:	48 89 df             	mov    rdi,rbx
      a1b7ab:	5b                   	pop    rbx
      a1b7ac:	e9 6f 27 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5908 slot+0x28 -> 0xa1b7c0 FDE=0xa1b7c0..0xa1b7ce
      a1b7c0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1b7c3:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
      a1b7c7:	48 89 d6             	mov    rsi,rdx
      a1b7ca:	31 d2                	xor    edx,edx
      a1b7cc:	ff e0                	jmp    rax

### table-base 0x17f5c08 slot+0x28 -> 0xaf7744 FDE=0xaf7744..0xaf7797
      af7744:	41 56                	push   r14
      af7746:	53                   	push   rbx
      af7747:	50                   	push   rax
      af7748:	48 89 fb             	mov    rbx,rdi
      af774b:	4c 8b 35 de a4 db 00 	mov    r14,QWORD PTR [rip+0xdba4de]        # 18b1c30 <_ZTTNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbbfa0>
      af7752:	49 8b 06             	mov    rax,QWORD PTR [r14]
      af7755:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
      af7759:	48 89 07             	mov    QWORD PTR [rdi],rax
      af775c:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      af7760:	48 89 0c 07          	mov    QWORD PTR [rdi+rax*1],rcx
      af7764:	49 8b 46 48          	mov    rax,QWORD PTR [r14+0x48]
      af7768:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      af776c:	48 83 c7 18          	add    rdi,0x18
      af7770:	e8 a3 62 fc ff       	call   abda18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa9b8>
      af7775:	49 83 c6 08          	add    r14,0x8
      af7779:	48 89 df             	mov    rdi,rbx
      af777c:	4c 89 f6             	mov    rsi,r14
      af777f:	e8 ac 71 cf 00       	call   17ee930 <_ZNSt6__ndk114basic_iostreamIcNS_11char_traitsIcEEED2Ev@plt>
      af7784:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
      af7788:	48 89 df             	mov    rdi,rbx
      af778b:	48 83 c4 08          	add    rsp,0x8
      af778f:	5b                   	pop    rbx
      af7790:	41 5e                	pop    r14
      af7792:	e9 29 6e cf 00       	jmp    17ee5c0 <_ZNSt6__ndk19basic_iosIcNS_11char_traitsIcEEED2Ev@plt>

### table-base 0x17f5c10 slot+0x28 -> 0xa1b7d0 FDE=0xa1b7d0..0xa1b84c
      a1b7d0:	41 56                	push   r14
      a1b7d2:	53                   	push   rbx
      a1b7d3:	50                   	push   rax
      a1b7d4:	48 89 fb             	mov    rbx,rdi
      a1b7d7:	48 8b 05 4a 64 e9 00 	mov    rax,QWORD PTR [rip+0xe9644a]        # 18b1c28 <_ZTVNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc010>
      a1b7de:	48 8d 48 18          	lea    rcx,[rax+0x18]
      a1b7e2:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      a1b7e5:	4c 8d b7 80 00 00 00 	lea    r14,[rdi+0x80]
      a1b7ec:	48 8d 48 68          	lea    rcx,[rax+0x68]
      a1b7f0:	48 89 8f 80 00 00 00 	mov    QWORD PTR [rdi+0x80],rcx
      a1b7f7:	48 83 c0 40          	add    rax,0x40
      a1b7fb:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      a1b7ff:	48 8b 05 aa 63 e9 00 	mov    rax,QWORD PTR [rip+0xe963aa]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1b806:	48 83 c0 10          	add    rax,0x10
      a1b80a:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      a1b80e:	f6 47 58 01          	test   BYTE PTR [rdi+0x58],0x1
      a1b812:	74 09                	je     a1b81d <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x1ad>
      a1b814:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
      a1b818:	e8 03 27 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1b81d:	48 8b 05 44 67 e9 00 	mov    rax,QWORD PTR [rip+0xe96744]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1b824:	48 83 c0 10          	add    rax,0x10
      a1b828:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      a1b82c:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      a1b830:	e8 fb 2d dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1b835:	4c 89 f7             	mov    rdi,r14
      a1b838:	e8 e3 46 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1b83d:	48 89 df             	mov    rdi,rbx
      a1b840:	48 83 c4 08          	add    rsp,0x8
      a1b844:	5b                   	pop    rbx
      a1b845:	41 5e                	pop    r14
      a1b847:	e9 d4 26 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5c30 slot+0x28 -> 0xa1b850 FDE=0xa1b850..0xa1b8c4
      a1b850:	41 56                	push   r14
      a1b852:	53                   	push   rbx
      a1b853:	50                   	push   rax
      a1b854:	48 8b 05 cd 63 e9 00 	mov    rax,QWORD PTR [rip+0xe963cd]        # 18b1c28 <_ZTVNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc010>
      a1b85b:	48 8d 48 18          	lea    rcx,[rax+0x18]
      a1b85f:	48 89 4f f0          	mov    QWORD PTR [rdi-0x10],rcx
      a1b863:	48 8d 5f 70          	lea    rbx,[rdi+0x70]
      a1b867:	48 8d 48 68          	lea    rcx,[rax+0x68]
      a1b86b:	48 89 4f 70          	mov    QWORD PTR [rdi+0x70],rcx
      a1b86f:	48 83 c0 40          	add    rax,0x40
      a1b873:	48 89 07             	mov    QWORD PTR [rdi],rax
      a1b876:	48 8b 05 33 63 e9 00 	mov    rax,QWORD PTR [rip+0xe96333]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1b87d:	48 83 c0 10          	add    rax,0x10
      a1b881:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      a1b885:	f6 47 48 01          	test   BYTE PTR [rdi+0x48],0x1
      a1b889:	74 12                	je     a1b89d <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x22d>
      a1b88b:	48 8b 47 58          	mov    rax,QWORD PTR [rdi+0x58]
      a1b88f:	49 89 fe             	mov    r14,rdi
      a1b892:	48 89 c7             	mov    rdi,rax
      a1b895:	e8 86 26 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1b89a:	4c 89 f7             	mov    rdi,r14
      a1b89d:	48 8b 05 c4 66 e9 00 	mov    rax,QWORD PTR [rip+0xe966c4]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1b8a4:	48 83 c0 10          	add    rax,0x10
      a1b8a8:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      a1b8ac:	48 83 c7 10          	add    rdi,0x10
      a1b8b0:	e8 7b 2d dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1b8b5:	48 89 df             	mov    rdi,rbx
      a1b8b8:	48 83 c4 08          	add    rsp,0x8
      a1b8bc:	5b                   	pop    rbx
      a1b8bd:	41 5e                	pop    r14
      a1b8bf:	e9 5c 46 dd 00       	jmp    17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>

### table-base 0x17f5c38 slot+0x28 -> 0xa1b8d0 FDE=0xa1b8d0..0xa1b94f
      a1b8d0:	41 57                	push   r15
      a1b8d2:	41 56                	push   r14
      a1b8d4:	53                   	push   rbx
      a1b8d5:	48 8d 5f f0          	lea    rbx,[rdi-0x10]
      a1b8d9:	48 8b 05 48 63 e9 00 	mov    rax,QWORD PTR [rip+0xe96348]        # 18b1c28 <_ZTVNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc010>
      a1b8e0:	48 8d 48 18          	lea    rcx,[rax+0x18]
      a1b8e4:	48 89 4f f0          	mov    QWORD PTR [rdi-0x10],rcx
      a1b8e8:	4c 8d 77 70          	lea    r14,[rdi+0x70]
      a1b8ec:	48 8d 48 68          	lea    rcx,[rax+0x68]
      a1b8f0:	48 89 4f 70          	mov    QWORD PTR [rdi+0x70],rcx
      a1b8f4:	48 83 c0 40          	add    rax,0x40
      a1b8f8:	48 89 07             	mov    QWORD PTR [rdi],rax
      a1b8fb:	48 8b 05 ae 62 e9 00 	mov    rax,QWORD PTR [rip+0xe962ae]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1b902:	48 83 c0 10          	add    rax,0x10
      a1b906:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      a1b90a:	f6 47 48 01          	test   BYTE PTR [rdi+0x48],0x1
      a1b90e:	74 12                	je     a1b922 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x2b2>
      a1b910:	48 8b 47 58          	mov    rax,QWORD PTR [rdi+0x58]
      a1b914:	49 89 ff             	mov    r15,rdi
      a1b917:	48 89 c7             	mov    rdi,rax
      a1b91a:	e8 01 26 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1b91f:	4c 89 ff             	mov    rdi,r15
      a1b922:	48 8b 05 3f 66 e9 00 	mov    rax,QWORD PTR [rip+0xe9663f]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1b929:	48 83 c0 10          	add    rax,0x10
      a1b92d:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      a1b931:	48 83 c7 10          	add    rdi,0x10
      a1b935:	e8 f6 2c dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1b93a:	4c 89 f7             	mov    rdi,r14
      a1b93d:	e8 de 45 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1b942:	48 89 df             	mov    rdi,rbx
      a1b945:	5b                   	pop    rbx
      a1b946:	41 5e                	pop    r14
      a1b948:	41 5f                	pop    r15
      a1b94a:	e9 d1 25 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5c58 slot+0x28 -> 0xa1b950 FDE=0xa1b950..0xa1b9d8
      a1b950:	41 56                	push   r14
      a1b952:	53                   	push   rbx
      a1b953:	50                   	push   rax
      a1b954:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1b957:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1b95b:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1b95f:	48 8b 0d c2 62 e9 00 	mov    rcx,QWORD PTR [rip+0xe962c2]        # 18b1c28 <_ZTVNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc010>
      a1b966:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1b96a:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1b96e:	4c 8d 34 07          	lea    r14,[rdi+rax*1]
      a1b972:	49 81 c6 80 00 00 00 	add    r14,0x80
      a1b979:	48 8d 51 68          	lea    rdx,[rcx+0x68]
      a1b97d:	48 89 94 07 80 00 00 	mov    QWORD PTR [rdi+rax*1+0x80],rdx
      a1b984:	00 
      a1b985:	48 83 c1 40          	add    rcx,0x40
      a1b989:	48 89 4c 07 10       	mov    QWORD PTR [rdi+rax*1+0x10],rcx
      a1b98e:	48 8b 0d 1b 62 e9 00 	mov    rcx,QWORD PTR [rip+0xe9621b]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1b995:	48 83 c1 10          	add    rcx,0x10
      a1b999:	48 89 4c 07 18       	mov    QWORD PTR [rdi+rax*1+0x18],rcx
      a1b99e:	f6 44 07 58 01       	test   BYTE PTR [rdi+rax*1+0x58],0x1
      a1b9a3:	74 09                	je     a1b9ae <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x33e>
      a1b9a5:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
      a1b9a9:	e8 72 25 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1b9ae:	48 8b 05 b3 65 e9 00 	mov    rax,QWORD PTR [rip+0xe965b3]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1b9b5:	48 83 c0 10          	add    rax,0x10
      a1b9b9:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      a1b9bd:	48 83 c3 20          	add    rbx,0x20
      a1b9c1:	48 89 df             	mov    rdi,rbx
      a1b9c4:	e8 67 2c dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1b9c9:	4c 89 f7             	mov    rdi,r14
      a1b9cc:	48 83 c4 08          	add    rsp,0x8
      a1b9d0:	5b                   	pop    rbx
      a1b9d1:	41 5e                	pop    r14
      a1b9d3:	e9 48 45 dd 00       	jmp    17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>

### table-base 0x17f5c60 slot+0x28 -> 0xa1b9e0 FDE=0xa1b9e0..0xa1ba6d
      a1b9e0:	41 56                	push   r14
      a1b9e2:	53                   	push   rbx
      a1b9e3:	50                   	push   rax
      a1b9e4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1b9e7:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1b9eb:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1b9ef:	48 8b 0d 32 62 e9 00 	mov    rcx,QWORD PTR [rip+0xe96232]        # 18b1c28 <_ZTVNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc010>
      a1b9f6:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1b9fa:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1b9fe:	4c 8d 34 07          	lea    r14,[rdi+rax*1]
      a1ba02:	49 81 c6 80 00 00 00 	add    r14,0x80
      a1ba09:	48 8d 51 68          	lea    rdx,[rcx+0x68]
      a1ba0d:	48 89 94 07 80 00 00 	mov    QWORD PTR [rdi+rax*1+0x80],rdx
      a1ba14:	00 
      a1ba15:	48 83 c1 40          	add    rcx,0x40
      a1ba19:	48 89 4c 07 10       	mov    QWORD PTR [rdi+rax*1+0x10],rcx
      a1ba1e:	48 8b 0d 8b 61 e9 00 	mov    rcx,QWORD PTR [rip+0xe9618b]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1ba25:	48 83 c1 10          	add    rcx,0x10
      a1ba29:	48 89 4c 07 18       	mov    QWORD PTR [rdi+rax*1+0x18],rcx
      a1ba2e:	f6 44 07 58 01       	test   BYTE PTR [rdi+rax*1+0x58],0x1
      a1ba33:	74 09                	je     a1ba3e <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x3ce>
      a1ba35:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
      a1ba39:	e8 e2 24 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1ba3e:	48 8b 05 23 65 e9 00 	mov    rax,QWORD PTR [rip+0xe96523]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1ba45:	48 83 c0 10          	add    rax,0x10
      a1ba49:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      a1ba4d:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      a1ba51:	e8 da 2b dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1ba56:	4c 89 f7             	mov    rdi,r14
      a1ba59:	e8 c2 44 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1ba5e:	48 89 df             	mov    rdi,rbx
      a1ba61:	48 83 c4 08          	add    rsp,0x8
      a1ba65:	5b                   	pop    rbx
      a1ba66:	41 5e                	pop    r14
      a1ba68:	e9 b3 24 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5e00 slot+0x28 -> 0xabd9cc FDE=0xabd9cc..0xabda17
      abd9cc:	41 56                	push   r14
      abd9ce:	53                   	push   rbx
      abd9cf:	50                   	push   rax
      abd9d0:	48 89 fb             	mov    rbx,rdi
      abd9d3:	4c 8b 35 ce 41 df 00 	mov    r14,QWORD PTR [rip+0xdf41ce]        # 18b1ba8 <_ZTTNSt6__ndk119basic_ostringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbbd48>
      abd9da:	49 8b 06             	mov    rax,QWORD PTR [r14]
      abd9dd:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
      abd9e1:	48 89 07             	mov    QWORD PTR [rdi],rax
      abd9e4:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      abd9e8:	48 89 0c 07          	mov    QWORD PTR [rdi+rax*1],rcx
      abd9ec:	48 83 c7 08          	add    rdi,0x8
      abd9f0:	e8 23 00 00 00       	call   abda18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa9b8>
      abd9f5:	49 83 c6 08          	add    r14,0x8
      abd9f9:	48 89 df             	mov    rdi,rbx
      abd9fc:	4c 89 f6             	mov    rsi,r14
      abd9ff:	e8 cc 0b d3 00       	call   17ee5d0 <_ZNSt6__ndk113basic_ostreamIcNS_11char_traitsIcEEED2Ev@plt>
      abda04:	48 83 c3 70          	add    rbx,0x70
      abda08:	48 89 df             	mov    rdi,rbx
      abda0b:	48 83 c4 08          	add    rsp,0x8
      abda0f:	5b                   	pop    rbx
      abda10:	41 5e                	pop    r14
      abda12:	e9 a9 0b d3 00       	jmp    17ee5c0 <_ZNSt6__ndk19basic_iosIcNS_11char_traitsIcEEED2Ev@plt>

### table-base 0x17f5e08 slot+0x28 -> 0xa1ba70 FDE=0xa1ba70..0xa1bade
      a1ba70:	41 56                	push   r14
      a1ba72:	53                   	push   rbx
      a1ba73:	50                   	push   rax
      a1ba74:	48 89 fb             	mov    rbx,rdi
      a1ba77:	48 8b 05 22 61 e9 00 	mov    rax,QWORD PTR [rip+0xe96122]        # 18b1ba0 <_ZTVNSt6__ndk119basic_ostringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbbd90>
      a1ba7e:	48 8d 48 18          	lea    rcx,[rax+0x18]
      a1ba82:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      a1ba85:	4c 8d 77 70          	lea    r14,[rdi+0x70]
      a1ba89:	48 83 c0 40          	add    rax,0x40
      a1ba8d:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
      a1ba91:	48 8b 05 18 61 e9 00 	mov    rax,QWORD PTR [rip+0xe96118]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1ba98:	48 83 c0 10          	add    rax,0x10
      a1ba9c:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      a1baa0:	f6 47 48 01          	test   BYTE PTR [rdi+0x48],0x1
      a1baa4:	74 09                	je     a1baaf <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x43f>
      a1baa6:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      a1baaa:	e8 71 24 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1baaf:	48 8b 05 b2 64 e9 00 	mov    rax,QWORD PTR [rip+0xe964b2]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1bab6:	48 83 c0 10          	add    rax,0x10
      a1baba:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      a1babe:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      a1bac2:	e8 69 2b dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1bac7:	4c 89 f7             	mov    rdi,r14
      a1baca:	e8 51 44 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1bacf:	48 89 df             	mov    rdi,rbx
      a1bad2:	48 83 c4 08          	add    rsp,0x8
      a1bad6:	5b                   	pop    rbx
      a1bad7:	41 5e                	pop    r14
      a1bad9:	e9 42 24 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5e28 slot+0x28 -> 0xa1bae0 FDE=0xa1bae0..0xa1bb59
      a1bae0:	41 56                	push   r14
      a1bae2:	53                   	push   rbx
      a1bae3:	50                   	push   rax
      a1bae4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1bae7:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1baeb:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1baef:	48 8b 0d aa 60 e9 00 	mov    rcx,QWORD PTR [rip+0xe960aa]        # 18b1ba0 <_ZTVNSt6__ndk119basic_ostringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbbd90>
      a1baf6:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1bafa:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1bafe:	4c 8d 34 07          	lea    r14,[rdi+rax*1]
      a1bb02:	49 83 c6 70          	add    r14,0x70
      a1bb06:	48 83 c1 40          	add    rcx,0x40
      a1bb0a:	48 89 4c 07 70       	mov    QWORD PTR [rdi+rax*1+0x70],rcx
      a1bb0f:	48 8b 0d 9a 60 e9 00 	mov    rcx,QWORD PTR [rip+0xe9609a]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1bb16:	48 83 c1 10          	add    rcx,0x10
      a1bb1a:	48 89 4c 07 08       	mov    QWORD PTR [rdi+rax*1+0x8],rcx
      a1bb1f:	f6 44 07 48 01       	test   BYTE PTR [rdi+rax*1+0x48],0x1
      a1bb24:	74 09                	je     a1bb2f <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x4bf>
      a1bb26:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      a1bb2a:	e8 f1 23 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1bb2f:	48 8b 05 32 64 e9 00 	mov    rax,QWORD PTR [rip+0xe96432]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1bb36:	48 83 c0 10          	add    rax,0x10
      a1bb3a:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      a1bb3e:	48 83 c3 10          	add    rbx,0x10
      a1bb42:	48 89 df             	mov    rdi,rbx
      a1bb45:	e8 e6 2a dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1bb4a:	4c 89 f7             	mov    rdi,r14
      a1bb4d:	48 83 c4 08          	add    rsp,0x8
      a1bb51:	5b                   	pop    rbx
      a1bb52:	41 5e                	pop    r14
      a1bb54:	e9 c7 43 dd 00       	jmp    17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>

### table-base 0x17f5e30 slot+0x28 -> 0xa1bb60 FDE=0xa1bb60..0xa1bbde
      a1bb60:	41 56                	push   r14
      a1bb62:	53                   	push   rbx
      a1bb63:	50                   	push   rax
      a1bb64:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1bb67:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1bb6b:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1bb6f:	48 8b 0d 2a 60 e9 00 	mov    rcx,QWORD PTR [rip+0xe9602a]        # 18b1ba0 <_ZTVNSt6__ndk119basic_ostringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbbd90>
      a1bb76:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1bb7a:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1bb7e:	4c 8d 34 07          	lea    r14,[rdi+rax*1]
      a1bb82:	49 83 c6 70          	add    r14,0x70
      a1bb86:	48 83 c1 40          	add    rcx,0x40
      a1bb8a:	48 89 4c 07 70       	mov    QWORD PTR [rdi+rax*1+0x70],rcx
      a1bb8f:	48 8b 0d 1a 60 e9 00 	mov    rcx,QWORD PTR [rip+0xe9601a]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1bb96:	48 83 c1 10          	add    rcx,0x10
      a1bb9a:	48 89 4c 07 08       	mov    QWORD PTR [rdi+rax*1+0x8],rcx
      a1bb9f:	f6 44 07 48 01       	test   BYTE PTR [rdi+rax*1+0x48],0x1
      a1bba4:	74 09                	je     a1bbaf <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x53f>
      a1bba6:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      a1bbaa:	e8 71 23 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1bbaf:	48 8b 05 b2 63 e9 00 	mov    rax,QWORD PTR [rip+0xe963b2]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1bbb6:	48 83 c0 10          	add    rax,0x10
      a1bbba:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      a1bbbe:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      a1bbc2:	e8 69 2a dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1bbc7:	4c 89 f7             	mov    rdi,r14
      a1bbca:	e8 51 43 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1bbcf:	48 89 df             	mov    rdi,rbx
      a1bbd2:	48 83 c4 08          	add    rsp,0x8
      a1bbd6:	5b                   	pop    rbx
      a1bbd7:	41 5e                	pop    r14
      a1bbd9:	e9 42 23 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5ed8 slot+0x28 -> 0x1091c28 FDE=0x1091c28..0x1091c73
     1091c28:	41 56                	push   r14
     1091c2a:	53                   	push   rbx
     1091c2b:	50                   	push   rax
     1091c2c:	48 89 fb             	mov    rbx,rdi
     1091c2f:	4c 8b 35 8a 01 82 00 	mov    r14,QWORD PTR [rip+0x82018a]        # 18b1dc0 <_ZTTNSt6__ndk119basic_istringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbbe88>
     1091c36:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1091c39:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
     1091c3d:	48 89 07             	mov    QWORD PTR [rdi],rax
     1091c40:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
     1091c44:	48 89 0c 07          	mov    QWORD PTR [rdi+rax*1],rcx
     1091c48:	48 83 c7 10          	add    rdi,0x10
     1091c4c:	e8 c7 bd a2 ff       	call   abda18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa9b8>
     1091c51:	49 83 c6 08          	add    r14,0x8
     1091c55:	48 89 df             	mov    rdi,rbx
     1091c58:	4c 89 f6             	mov    rsi,r14
     1091c5b:	e8 00 cc 75 00       	call   17ee860 <_ZNSt6__ndk113basic_istreamIcNS_11char_traitsIcEEED2Ev@plt>
     1091c60:	48 83 c3 78          	add    rbx,0x78
     1091c64:	48 89 df             	mov    rdi,rbx
     1091c67:	48 83 c4 08          	add    rsp,0x8
     1091c6b:	5b                   	pop    rbx
     1091c6c:	41 5e                	pop    r14
     1091c6e:	e9 4d c9 75 00       	jmp    17ee5c0 <_ZNSt6__ndk19basic_iosIcNS_11char_traitsIcEEED2Ev@plt>

### table-base 0x17f5ee0 slot+0x28 -> 0xa1bbe0 FDE=0xa1bbe0..0xa1bc4e
      a1bbe0:	41 56                	push   r14
      a1bbe2:	53                   	push   rbx
      a1bbe3:	50                   	push   rax
      a1bbe4:	48 89 fb             	mov    rbx,rdi
      a1bbe7:	48 8b 05 ca 61 e9 00 	mov    rax,QWORD PTR [rip+0xe961ca]        # 18b1db8 <_ZTVNSt6__ndk119basic_istringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbbed0>
      a1bbee:	48 8d 48 18          	lea    rcx,[rax+0x18]
      a1bbf2:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      a1bbf5:	4c 8d 77 78          	lea    r14,[rdi+0x78]
      a1bbf9:	48 83 c0 40          	add    rax,0x40
      a1bbfd:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
      a1bc01:	48 8b 05 a8 5f e9 00 	mov    rax,QWORD PTR [rip+0xe95fa8]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1bc08:	48 83 c0 10          	add    rax,0x10
      a1bc0c:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      a1bc10:	f6 47 50 01          	test   BYTE PTR [rdi+0x50],0x1
      a1bc14:	74 09                	je     a1bc1f <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x5af>
      a1bc16:	48 8b 7b 60          	mov    rdi,QWORD PTR [rbx+0x60]
      a1bc1a:	e8 01 23 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1bc1f:	48 8b 05 42 63 e9 00 	mov    rax,QWORD PTR [rip+0xe96342]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1bc26:	48 83 c0 10          	add    rax,0x10
      a1bc2a:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a1bc2e:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      a1bc32:	e8 f9 29 dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1bc37:	4c 89 f7             	mov    rdi,r14
      a1bc3a:	e8 e1 42 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1bc3f:	48 89 df             	mov    rdi,rbx
      a1bc42:	48 83 c4 08          	add    rsp,0x8
      a1bc46:	5b                   	pop    rbx
      a1bc47:	41 5e                	pop    r14
      a1bc49:	e9 d2 22 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5f00 slot+0x28 -> 0xa1bc50 FDE=0xa1bc50..0xa1bcc9
      a1bc50:	41 56                	push   r14
      a1bc52:	53                   	push   rbx
      a1bc53:	50                   	push   rax
      a1bc54:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1bc57:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1bc5b:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1bc5f:	48 8b 0d 52 61 e9 00 	mov    rcx,QWORD PTR [rip+0xe96152]        # 18b1db8 <_ZTVNSt6__ndk119basic_istringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbbed0>
      a1bc66:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1bc6a:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1bc6e:	4c 8d 34 07          	lea    r14,[rdi+rax*1]
      a1bc72:	49 83 c6 78          	add    r14,0x78
      a1bc76:	48 83 c1 40          	add    rcx,0x40
      a1bc7a:	48 89 4c 07 78       	mov    QWORD PTR [rdi+rax*1+0x78],rcx
      a1bc7f:	48 8b 0d 2a 5f e9 00 	mov    rcx,QWORD PTR [rip+0xe95f2a]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1bc86:	48 83 c1 10          	add    rcx,0x10
      a1bc8a:	48 89 4c 07 10       	mov    QWORD PTR [rdi+rax*1+0x10],rcx
      a1bc8f:	f6 44 07 50 01       	test   BYTE PTR [rdi+rax*1+0x50],0x1
      a1bc94:	74 09                	je     a1bc9f <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x62f>
      a1bc96:	48 8b 7b 60          	mov    rdi,QWORD PTR [rbx+0x60]
      a1bc9a:	e8 81 22 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1bc9f:	48 8b 05 c2 62 e9 00 	mov    rax,QWORD PTR [rip+0xe962c2]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1bca6:	48 83 c0 10          	add    rax,0x10
      a1bcaa:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a1bcae:	48 83 c3 18          	add    rbx,0x18
      a1bcb2:	48 89 df             	mov    rdi,rbx
      a1bcb5:	e8 76 29 dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1bcba:	4c 89 f7             	mov    rdi,r14
      a1bcbd:	48 83 c4 08          	add    rsp,0x8
      a1bcc1:	5b                   	pop    rbx
      a1bcc2:	41 5e                	pop    r14
      a1bcc4:	e9 57 42 dd 00       	jmp    17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>

### table-base 0x17f5f08 slot+0x28 -> 0xa1bcd0 FDE=0xa1bcd0..0xa1bd4e
      a1bcd0:	41 56                	push   r14
      a1bcd2:	53                   	push   rbx
      a1bcd3:	50                   	push   rax
      a1bcd4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1bcd7:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1bcdb:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1bcdf:	48 8b 0d d2 60 e9 00 	mov    rcx,QWORD PTR [rip+0xe960d2]        # 18b1db8 <_ZTVNSt6__ndk119basic_istringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbbed0>
      a1bce6:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1bcea:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1bcee:	4c 8d 34 07          	lea    r14,[rdi+rax*1]
      a1bcf2:	49 83 c6 78          	add    r14,0x78
      a1bcf6:	48 83 c1 40          	add    rcx,0x40
      a1bcfa:	48 89 4c 07 78       	mov    QWORD PTR [rdi+rax*1+0x78],rcx
      a1bcff:	48 8b 0d aa 5e e9 00 	mov    rcx,QWORD PTR [rip+0xe95eaa]        # 18b1bb0 <_ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbc2b8>
      a1bd06:	48 83 c1 10          	add    rcx,0x10
      a1bd0a:	48 89 4c 07 10       	mov    QWORD PTR [rdi+rax*1+0x10],rcx
      a1bd0f:	f6 44 07 50 01       	test   BYTE PTR [rdi+rax*1+0x50],0x1
      a1bd14:	74 09                	je     a1bd1f <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x6af>
      a1bd16:	48 8b 7b 60          	mov    rdi,QWORD PTR [rbx+0x60]
      a1bd1a:	e8 01 22 dd 00       	call   17edf20 <_ZdlPv@plt>
      a1bd1f:	48 8b 05 42 62 e9 00 	mov    rax,QWORD PTR [rip+0xe96242]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1bd26:	48 83 c0 10          	add    rax,0x10
      a1bd2a:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a1bd2e:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      a1bd32:	e8 f9 28 dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
      a1bd37:	4c 89 f7             	mov    rdi,r14
      a1bd3a:	e8 e1 41 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1bd3f:	48 89 df             	mov    rdi,rbx
      a1bd42:	48 83 c4 08          	add    rsp,0x8
      a1bd46:	5b                   	pop    rbx
      a1bd47:	41 5e                	pop    r14
      a1bd49:	e9 d2 21 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5fb0 slot+0x28 -> 0xaf6118 FDE=0xaf6118..0xaf6166
      af6118:	41 56                	push   r14
      af611a:	53                   	push   rbx
      af611b:	50                   	push   rax
      af611c:	48 89 fb             	mov    rbx,rdi
      af611f:	4c 8b 35 fa ba db 00 	mov    r14,QWORD PTR [rip+0xdbbafa]        # 18b1c20 <_ZTTNSt6__ndk114basic_ifstreamIcNS_11char_traitsIcEEEE@@Base+0xbbc10>
      af6126:	49 8b 06             	mov    rax,QWORD PTR [r14]
      af6129:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
      af612d:	48 89 07             	mov    QWORD PTR [rdi],rax
      af6130:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      af6134:	48 89 0c 07          	mov    QWORD PTR [rdi+rax*1],rcx
      af6138:	48 83 c7 10          	add    rdi,0x10
      af613c:	e8 0f 87 cf 00       	call   17ee850 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEED1Ev@plt>
      af6141:	49 83 c6 08          	add    r14,0x8
      af6145:	48 89 df             	mov    rdi,rbx
      af6148:	4c 89 f6             	mov    rsi,r14
      af614b:	e8 10 87 cf 00       	call   17ee860 <_ZNSt6__ndk113basic_istreamIcNS_11char_traitsIcEEED2Ev@plt>
      af6150:	48 81 c3 b8 00 00 00 	add    rbx,0xb8
      af6157:	48 89 df             	mov    rdi,rbx
      af615a:	48 83 c4 08          	add    rsp,0x8
      af615e:	5b                   	pop    rbx
      af615f:	41 5e                	pop    r14
      af6161:	e9 5a 84 cf 00       	jmp    17ee5c0 <_ZNSt6__ndk19basic_iosIcNS_11char_traitsIcEEED2Ev@plt>

### table-base 0x17f5fb8 slot+0x28 -> 0xa1bd50 FDE=0xa1bd50..0xa1bd97
      a1bd50:	41 56                	push   r14
      a1bd52:	53                   	push   rbx
      a1bd53:	50                   	push   rax
      a1bd54:	48 89 fb             	mov    rbx,rdi
      a1bd57:	48 8b 05 ba 5e e9 00 	mov    rax,QWORD PTR [rip+0xe95eba]        # 18b1c18 <_ZTVNSt6__ndk114basic_ifstreamIcNS_11char_traitsIcEEEE@@Base+0xbbc58>
      a1bd5e:	48 8d 48 18          	lea    rcx,[rax+0x18]
      a1bd62:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      a1bd65:	4c 8d b7 b8 00 00 00 	lea    r14,[rdi+0xb8]
      a1bd6c:	48 83 c0 40          	add    rax,0x40
      a1bd70:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
      a1bd77:	48 83 c7 10          	add    rdi,0x10
      a1bd7b:	e8 d0 2a dd 00       	call   17ee850 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEED1Ev@plt>
      a1bd80:	4c 89 f7             	mov    rdi,r14
      a1bd83:	e8 98 41 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1bd88:	48 89 df             	mov    rdi,rbx
      a1bd8b:	48 83 c4 08          	add    rsp,0x8
      a1bd8f:	5b                   	pop    rbx
      a1bd90:	41 5e                	pop    r14
      a1bd92:	e9 89 21 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f5fd8 slot+0x28 -> 0xa1bda0 FDE=0xa1bda0..0xa1bde3
      a1bda0:	53                   	push   rbx
      a1bda1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1bda4:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1bda8:	48 8b 0d 69 5e e9 00 	mov    rcx,QWORD PTR [rip+0xe95e69]        # 18b1c18 <_ZTVNSt6__ndk114basic_ifstreamIcNS_11char_traitsIcEEEE@@Base+0xbbc58>
      a1bdaf:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1bdb3:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1bdb7:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1bdbb:	48 81 c3 b8 00 00 00 	add    rbx,0xb8
      a1bdc2:	48 83 c1 40          	add    rcx,0x40
      a1bdc6:	48 89 8c 07 b8 00 00 	mov    QWORD PTR [rdi+rax*1+0xb8],rcx
      a1bdcd:	00 
      a1bdce:	48 01 c7             	add    rdi,rax
      a1bdd1:	48 83 c7 10          	add    rdi,0x10
      a1bdd5:	e8 76 2a dd 00       	call   17ee850 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEED1Ev@plt>
      a1bdda:	48 89 df             	mov    rdi,rbx
      a1bddd:	5b                   	pop    rbx
      a1bdde:	e9 3d 41 dd 00       	jmp    17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>

### table-base 0x17f5fe0 slot+0x28 -> 0xa1bdf0 FDE=0xa1bdf0..0xa1be48
      a1bdf0:	41 56                	push   r14
      a1bdf2:	53                   	push   rbx
      a1bdf3:	50                   	push   rax
      a1bdf4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1bdf7:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1bdfb:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1bdff:	48 8b 0d 12 5e e9 00 	mov    rcx,QWORD PTR [rip+0xe95e12]        # 18b1c18 <_ZTVNSt6__ndk114basic_ifstreamIcNS_11char_traitsIcEEEE@@Base+0xbbc58>
      a1be06:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1be0a:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1be0e:	4c 8d 34 07          	lea    r14,[rdi+rax*1]
      a1be12:	49 81 c6 b8 00 00 00 	add    r14,0xb8
      a1be19:	48 83 c1 40          	add    rcx,0x40
      a1be1d:	48 89 8c 07 b8 00 00 	mov    QWORD PTR [rdi+rax*1+0xb8],rcx
      a1be24:	00 
      a1be25:	48 01 c7             	add    rdi,rax
      a1be28:	48 83 c7 10          	add    rdi,0x10
      a1be2c:	e8 1f 2a dd 00       	call   17ee850 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEED1Ev@plt>
      a1be31:	4c 89 f7             	mov    rdi,r14
      a1be34:	e8 e7 40 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1be39:	48 89 df             	mov    rdi,rbx
      a1be3c:	48 83 c4 08          	add    rsp,0x8
      a1be40:	5b                   	pop    rbx
      a1be41:	41 5e                	pop    r14
      a1be43:	e9 d8 20 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f6088 slot+0x28 -> 0xb5957c FDE=0xb5957c..0xb595ca
      b5957c:	41 56                	push   r14
      b5957e:	53                   	push   rbx
      b5957f:	50                   	push   rax
      b59580:	48 89 fb             	mov    rbx,rdi
      b59583:	4c 8b 35 ce 86 d5 00 	mov    r14,QWORD PTR [rip+0xd586ce]        # 18b1c58 <_ZTTNSt6__ndk114basic_ofstreamIcNS_11char_traitsIcEEEE@@Base+0xbbb70>
      b5958a:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b5958d:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
      b59591:	48 89 07             	mov    QWORD PTR [rdi],rax
      b59594:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      b59598:	48 89 0c 07          	mov    QWORD PTR [rdi+rax*1],rcx
      b5959c:	48 83 c7 08          	add    rdi,0x8
      b595a0:	e8 ab 52 c9 00       	call   17ee850 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEED1Ev@plt>
      b595a5:	49 83 c6 08          	add    r14,0x8
      b595a9:	48 89 df             	mov    rdi,rbx
      b595ac:	4c 89 f6             	mov    rsi,r14
      b595af:	e8 1c 50 c9 00       	call   17ee5d0 <_ZNSt6__ndk113basic_ostreamIcNS_11char_traitsIcEEED2Ev@plt>
      b595b4:	48 81 c3 b0 00 00 00 	add    rbx,0xb0
      b595bb:	48 89 df             	mov    rdi,rbx
      b595be:	48 83 c4 08          	add    rsp,0x8
      b595c2:	5b                   	pop    rbx
      b595c3:	41 5e                	pop    r14
      b595c5:	e9 f6 4f c9 00       	jmp    17ee5c0 <_ZNSt6__ndk19basic_iosIcNS_11char_traitsIcEEED2Ev@plt>

### table-base 0x17f6090 slot+0x28 -> 0xa1be50 FDE=0xa1be50..0xa1be97
      a1be50:	41 56                	push   r14
      a1be52:	53                   	push   rbx
      a1be53:	50                   	push   rax
      a1be54:	48 89 fb             	mov    rbx,rdi
      a1be57:	48 8b 05 f2 5d e9 00 	mov    rax,QWORD PTR [rip+0xe95df2]        # 18b1c50 <_ZTVNSt6__ndk114basic_ofstreamIcNS_11char_traitsIcEEEE@@Base+0xbbbb8>
      a1be5e:	48 8d 48 18          	lea    rcx,[rax+0x18]
      a1be62:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      a1be65:	4c 8d b7 b0 00 00 00 	lea    r14,[rdi+0xb0]
      a1be6c:	48 83 c0 40          	add    rax,0x40
      a1be70:	48 89 87 b0 00 00 00 	mov    QWORD PTR [rdi+0xb0],rax
      a1be77:	48 83 c7 08          	add    rdi,0x8
      a1be7b:	e8 d0 29 dd 00       	call   17ee850 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEED1Ev@plt>
      a1be80:	4c 89 f7             	mov    rdi,r14
      a1be83:	e8 98 40 dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1be88:	48 89 df             	mov    rdi,rbx
      a1be8b:	48 83 c4 08          	add    rsp,0x8
      a1be8f:	5b                   	pop    rbx
      a1be90:	41 5e                	pop    r14
      a1be92:	e9 89 20 dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f60b0 slot+0x28 -> 0xa1bea0 FDE=0xa1bea0..0xa1bee3
      a1bea0:	53                   	push   rbx
      a1bea1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1bea4:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1bea8:	48 8b 0d a1 5d e9 00 	mov    rcx,QWORD PTR [rip+0xe95da1]        # 18b1c50 <_ZTVNSt6__ndk114basic_ofstreamIcNS_11char_traitsIcEEEE@@Base+0xbbbb8>
      a1beaf:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1beb3:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1beb7:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1bebb:	48 81 c3 b0 00 00 00 	add    rbx,0xb0
      a1bec2:	48 83 c1 40          	add    rcx,0x40
      a1bec6:	48 89 8c 07 b0 00 00 	mov    QWORD PTR [rdi+rax*1+0xb0],rcx
      a1becd:	00 
      a1bece:	48 01 c7             	add    rdi,rax
      a1bed1:	48 83 c7 08          	add    rdi,0x8
      a1bed5:	e8 76 29 dd 00       	call   17ee850 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEED1Ev@plt>
      a1beda:	48 89 df             	mov    rdi,rbx
      a1bedd:	5b                   	pop    rbx
      a1bede:	e9 3d 40 dd 00       	jmp    17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>

### table-base 0x17f60b8 slot+0x28 -> 0xa1bef0 FDE=0xa1bef0..0xa1bf48
      a1bef0:	41 56                	push   r14
      a1bef2:	53                   	push   rbx
      a1bef3:	50                   	push   rax
      a1bef4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1bef7:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
      a1befb:	48 8d 1c 07          	lea    rbx,[rdi+rax*1]
      a1beff:	48 8b 0d 4a 5d e9 00 	mov    rcx,QWORD PTR [rip+0xe95d4a]        # 18b1c50 <_ZTVNSt6__ndk114basic_ofstreamIcNS_11char_traitsIcEEEE@@Base+0xbbbb8>
      a1bf06:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a1bf0a:	48 89 14 07          	mov    QWORD PTR [rdi+rax*1],rdx
      a1bf0e:	4c 8d 34 07          	lea    r14,[rdi+rax*1]
      a1bf12:	49 81 c6 b0 00 00 00 	add    r14,0xb0
      a1bf19:	48 83 c1 40          	add    rcx,0x40
      a1bf1d:	48 89 8c 07 b0 00 00 	mov    QWORD PTR [rdi+rax*1+0xb0],rcx
      a1bf24:	00 
      a1bf25:	48 01 c7             	add    rdi,rax
      a1bf28:	48 83 c7 08          	add    rdi,0x8
      a1bf2c:	e8 1f 29 dd 00       	call   17ee850 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEED1Ev@plt>
      a1bf31:	4c 89 f7             	mov    rdi,r14
      a1bf34:	e8 e7 3f dd 00       	call   17eff20 <_ZNSt6__ndk18ios_baseD2Ev@plt>
      a1bf39:	48 89 df             	mov    rdi,rbx
      a1bf3c:	48 83 c4 08          	add    rsp,0x8
      a1bf40:	5b                   	pop    rbx
      a1bf41:	41 5e                	pop    r14
      a1bf43:	e9 d8 1f dd 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f6178 slot+0x28 -> 0xa1c660 FDE=0xa1c660..0xa1c672
      a1c660:	53                   	push   rbx
      a1c661:	48 89 fb             	mov    rbx,rdi
      a1c664:	e8 77 1f dd 00       	call   17ee5e0 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEED2Ev@plt>
      a1c669:	48 89 df             	mov    rdi,rbx
      a1c66c:	5b                   	pop    rbx
      a1c66d:	e9 ae 18 dd 00       	jmp    17edf20 <_ZdlPv@plt>
  ref @0xa1bf6a: lea    rax,[rip+0xdda227]        # 17f6198 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEED2Ev@@Base+0xde56d8>; FDE=(10600272, 10601900)

### table-base 0x17f6180 slot+0x28 -> 0xa1c680 FDE=0xa1c680..0xa1c6c7
      a1c680:	53                   	push   rbx
      a1c681:	48 89 f0             	mov    rax,rsi
      a1c684:	48 89 fb             	mov    rbx,rdi
      a1c687:	48 8b 35 3a 59 e9 00 	mov    rsi,QWORD PTR [rip+0xe9593a]        # 18b1fc8 <_ZNSt6__ndk17codecvtIcc9mbstate_tE2idE@@Base-0x12dbf0>
      a1c68e:	48 89 c7             	mov    rdi,rax
      a1c691:	e8 da 1f dd 00       	call   17ee670 <_ZNKSt6__ndk16locale9use_facetERNS0_2idE@plt>
      a1c696:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      a1c69a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a1c69d:	48 89 c7             	mov    rdi,rax
      a1c6a0:	ff 51 30             	call   QWORD PTR [rcx+0x30]
      a1c6a3:	89 43 58             	mov    DWORD PTR [rbx+0x58],eax
      a1c6a6:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
      a1c6aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1c6ad:	ff 50 38             	call   QWORD PTR [rax+0x38]
      a1c6b0:	88 43 61             	mov    BYTE PTR [rbx+0x61],al
      a1c6b3:	83 7b 58 09          	cmp    DWORD PTR [rbx+0x58],0x9
      a1c6b7:	7d 02                	jge    a1c6bb <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0xcb>
      a1c6b9:	5b                   	pop    rbx
      a1c6ba:	c3                   	ret
      a1c6bb:	48 8d 3d e3 8a 94 ff 	lea    rdi,[rip+0xffffffffff948ae3]        # 3651a5 <_ZTSSt12bad_any_cast@@Base-0x2b023>
      a1c6c2:	e8 99 35 dd 00       	call   17efc60 <_ZNSt6__ndk121__throw_runtime_errorEPKc@plt>
  ref @0xa1bf6a: lea    rax,[rip+0xdda227]        # 17f6198 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEED2Ev@@Base+0xde56d8>; FDE=(10600272, 10601900)

### table-base 0x17f6210 slot+0x28 -> 0xa1c660 FDE=0xa1c660..0xa1c672
      a1c660:	53                   	push   rbx
      a1c661:	48 89 fb             	mov    rbx,rdi
      a1c664:	e8 77 1f dd 00       	call   17ee5e0 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEED2Ev@plt>
      a1c669:	48 89 df             	mov    rdi,rbx
      a1c66c:	5b                   	pop    rbx
      a1c66d:	e9 ae 18 dd 00       	jmp    17edf20 <_ZdlPv@plt>
  ref @0xa1c028: lea    rax,[rip+0xdda201]        # 17f6230 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEED2Ev@@Base+0xde5770>; FDE=(10600272, 10601900)
  ref @0xa1c0ef: lea    rax,[rip+0xdda13a]        # 17f6230 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEED2Ev@@Base+0xde5770>; FDE=(10600272, 10601900)

### table-base 0x17f6218 slot+0x28 -> 0xa1c9c0 FDE=0xa1c9c0..0xa1c9f8
      a1c9c0:	41 56                	push   r14
      a1c9c2:	53                   	push   rbx
      a1c9c3:	50                   	push   rax
      a1c9c4:	48 89 f3             	mov    rbx,rsi
      a1c9c7:	49 89 fe             	mov    r14,rdi
      a1c9ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1c9cd:	ff 50 30             	call   QWORD PTR [rax+0x30]
      a1c9d0:	48 8b 35 f1 55 e9 00 	mov    rsi,QWORD PTR [rip+0xe955f1]        # 18b1fc8 <_ZNSt6__ndk17codecvtIcc9mbstate_tE2idE@@Base-0x12dbf0>
      a1c9d7:	48 89 df             	mov    rdi,rbx
      a1c9da:	e8 91 1c dd 00       	call   17ee670 <_ZNKSt6__ndk16locale9use_facetERNS0_2idE@plt>
      a1c9df:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
      a1c9e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a1c9e6:	48 89 c7             	mov    rdi,rax
      a1c9e9:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      a1c9ec:	41 88 46 58          	mov    BYTE PTR [r14+0x58],al
      a1c9f0:	48 83 c4 08          	add    rsp,0x8
      a1c9f4:	5b                   	pop    rbx
      a1c9f5:	41 5e                	pop    r14
      a1c9f7:	c3                   	ret
  ref @0xa1c028: lea    rax,[rip+0xdda201]        # 17f6230 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEED2Ev@@Base+0xde5770>; FDE=(10600272, 10601900)
  ref @0xa1c0ef: lea    rax,[rip+0xdda13a]        # 17f6230 <_ZNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEED2Ev@@Base+0xde5770>; FDE=(10600272, 10601900)

### table-base 0x17f6238 slot+0x28 -> 0xa1ca00 FDE=0xa1ca00..0xa1ca8c
      a1ca00:	55                   	push   rbp
      a1ca01:	41 57                	push   r15
      a1ca03:	41 56                	push   r14
      a1ca05:	41 55                	push   r13
      a1ca07:	41 54                	push   r12
      a1ca09:	53                   	push   rbx
      a1ca0a:	48 83 ec 18          	sub    rsp,0x18
      a1ca0e:	48 89 fb             	mov    rbx,rdi
      a1ca11:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
      a1ca16:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
      a1ca1b:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
      a1ca20:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
      a1ca24:	48 8b 73 50          	mov    rsi,QWORD PTR [rbx+0x50]
      a1ca28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1ca2b:	4c 89 fa             	mov    rdx,r15
      a1ca2e:	4c 89 f1             	mov    rcx,r14
      a1ca31:	4d 89 e0             	mov    r8,r12
      a1ca34:	ff 50 28             	call   QWORD PTR [rax+0x28]
      a1ca37:	89 c5                	mov    ebp,eax
      a1ca39:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      a1ca3e:	4d 29 fd             	sub    r13,r15
      a1ca41:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      a1ca45:	be 01 00 00 00       	mov    esi,0x1
      a1ca4a:	4c 89 ff             	mov    rdi,r15
      a1ca4d:	4c 89 ea             	mov    rdx,r13
      a1ca50:	e8 fb 20 dd 00       	call   17eeb50 <fwrite@plt>
      a1ca55:	48 89 c1             	mov    rcx,rax
      a1ca58:	b8 ff ff ff ff       	mov    eax,0xffffffff
      a1ca5d:	4c 39 e9             	cmp    rcx,r13
      a1ca60:	75 1b                	jne    a1ca7d <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x48d>
      a1ca62:	83 fd 01             	cmp    ebp,0x1
      a1ca65:	74 b9                	je     a1ca20 <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x430>
      a1ca67:	83 fd 02             	cmp    ebp,0x2
      a1ca6a:	74 11                	je     a1ca7d <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x48d>
      a1ca6c:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      a1ca70:	e8 7b 2d dd 00       	call   17ef7f0 <fflush@plt>
      a1ca75:	89 c1                	mov    ecx,eax
      a1ca77:	31 c0                	xor    eax,eax
      a1ca79:	f7 d9                	neg    ecx
      a1ca7b:	19 c0                	sbb    eax,eax
      a1ca7d:	48 83 c4 18          	add    rsp,0x18
      a1ca81:	5b                   	pop    rbx
      a1ca82:	41 5c                	pop    r12
      a1ca84:	41 5d                	pop    r13
      a1ca86:	41 5e                	pop    r14
      a1ca88:	41 5f                	pop    r15
      a1ca8a:	5d                   	pop    rbp
      a1ca8b:	c3                   	ret

### table-base 0x17f6268 slot+0x28 -> 0xa1ca90 FDE=0xa1ca90..0xa1cafe
      a1ca90:	41 57                	push   r15
      a1ca92:	41 56                	push   r14
      a1ca94:	41 54                	push   r12
      a1ca96:	53                   	push   rbx
      a1ca97:	50                   	push   rax
      a1ca98:	48 89 d3             	mov    rbx,rdx
      a1ca9b:	49 89 f6             	mov    r14,rsi
      a1ca9e:	49 89 fc             	mov    r12,rdi
      a1caa1:	80 7f 58 00          	cmp    BYTE PTR [rdi+0x58],0x0
      a1caa5:	74 20                	je     a1cac7 <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x4d7>
      a1caa7:	49 8b 4c 24 40       	mov    rcx,QWORD PTR [r12+0x40]
      a1caac:	be 01 00 00 00       	mov    esi,0x1
      a1cab1:	4c 89 f7             	mov    rdi,r14
      a1cab4:	48 89 da             	mov    rdx,rbx
      a1cab7:	48 83 c4 08          	add    rsp,0x8
      a1cabb:	5b                   	pop    rbx
      a1cabc:	41 5c                	pop    r12
      a1cabe:	41 5e                	pop    r14
      a1cac0:	41 5f                	pop    r15
      a1cac2:	e9 89 20 dd 00       	jmp    17eeb50 <fwrite@plt>
      a1cac7:	45 31 ff             	xor    r15d,r15d
      a1caca:	48 85 db             	test   rbx,rbx
      a1cacd:	7e 20                	jle    a1caef <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x4ff>
      a1cacf:	90                   	nop
      a1cad0:	43 0f b6 34 3e       	movzx  esi,BYTE PTR [r14+r15*1]
      a1cad5:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      a1cad9:	4c 89 e7             	mov    rdi,r12
      a1cadc:	ff 50 68             	call   QWORD PTR [rax+0x68]
      a1cadf:	83 f8 ff             	cmp    eax,0xffffffff
      a1cae2:	74 0b                	je     a1caef <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x4ff>
      a1cae4:	49 ff c7             	inc    r15
      a1cae7:	4c 39 fb             	cmp    rbx,r15
      a1caea:	75 e4                	jne    a1cad0 <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x4e0>
      a1caec:	49 89 df             	mov    r15,rbx
      a1caef:	4c 89 f8             	mov    rax,r15
      a1caf2:	48 83 c4 08          	add    rsp,0x8
      a1caf6:	5b                   	pop    rbx
      a1caf7:	41 5c                	pop    r12
      a1caf9:	41 5e                	pop    r14
      a1cafb:	41 5f                	pop    r15
      a1cafd:	c3                   	ret

### table-base 0x17f62a8 slot+0x28 -> 0xa1cc20 FDE=0xa1cc20..0xa1cc32
      a1cc20:	53                   	push   rbx
      a1cc21:	48 89 fb             	mov    rbx,rdi
      a1cc24:	e8 c7 33 dd 00       	call   17efff0 <_ZNSt6__ndk115basic_streambufIwNS_11char_traitsIwEEED2Ev@plt>
      a1cc29:	48 89 df             	mov    rdi,rbx
      a1cc2c:	5b                   	pop    rbx
      a1cc2d:	e9 ee 12 dd 00       	jmp    17edf20 <_ZdlPv@plt>
  ref @0xa1c215: lea    rax,[rip+0xdda0ac]        # 17f62c8 <_ZNSt6__ndk115basic_streambufIwNS_11char_traitsIwEEED2Ev@@Base+0xde1238>; FDE=(10600272, 10601900)

### table-base 0x17f62b0 slot+0x28 -> 0xa1cc40 FDE=0xa1cc40..0xa1cc87
      a1cc40:	53                   	push   rbx
      a1cc41:	48 89 f0             	mov    rax,rsi
      a1cc44:	48 89 fb             	mov    rbx,rdi
      a1cc47:	48 8b 35 a2 53 e9 00 	mov    rsi,QWORD PTR [rip+0xe953a2]        # 18b1ff0 <_ZNSt6__ndk17codecvtIwc9mbstate_tE2idE@@Base-0x12dbd8>
      a1cc4e:	48 89 c7             	mov    rdi,rax
      a1cc51:	e8 1a 1a dd 00       	call   17ee670 <_ZNKSt6__ndk16locale9use_facetERNS0_2idE@plt>
      a1cc56:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      a1cc5a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a1cc5d:	48 89 c7             	mov    rdi,rax
      a1cc60:	ff 51 30             	call   QWORD PTR [rcx+0x30]
      a1cc63:	89 43 58             	mov    DWORD PTR [rbx+0x58],eax
      a1cc66:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
      a1cc6a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1cc6d:	ff 50 38             	call   QWORD PTR [rax+0x38]
      a1cc70:	88 43 61             	mov    BYTE PTR [rbx+0x61],al
      a1cc73:	83 7b 58 09          	cmp    DWORD PTR [rbx+0x58],0x9
      a1cc77:	7d 02                	jge    a1cc7b <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x68b>
      a1cc79:	5b                   	pop    rbx
      a1cc7a:	c3                   	ret
      a1cc7b:	48 8d 3d 23 85 94 ff 	lea    rdi,[rip+0xffffffffff948523]        # 3651a5 <_ZTSSt12bad_any_cast@@Base-0x2b023>
      a1cc82:	e8 d9 2f dd 00       	call   17efc60 <_ZNSt6__ndk121__throw_runtime_errorEPKc@plt>
  ref @0xa1c215: lea    rax,[rip+0xdda0ac]        # 17f62c8 <_ZNSt6__ndk115basic_streambufIwNS_11char_traitsIwEEED2Ev@@Base+0xde1238>; FDE=(10600272, 10601900)

### table-base 0x17f6340 slot+0x28 -> 0xa1cc20 FDE=0xa1cc20..0xa1cc32
      a1cc20:	53                   	push   rbx
      a1cc21:	48 89 fb             	mov    rbx,rdi
      a1cc24:	e8 c7 33 dd 00       	call   17efff0 <_ZNSt6__ndk115basic_streambufIwNS_11char_traitsIwEEED2Ev@plt>
      a1cc29:	48 89 df             	mov    rdi,rbx
      a1cc2c:	5b                   	pop    rbx
      a1cc2d:	e9 ee 12 dd 00       	jmp    17edf20 <_ZdlPv@plt>
  ref @0xa1c2d3: lea    rax,[rip+0xdda086]        # 17f6360 <_ZNSt6__ndk115basic_streambufIwNS_11char_traitsIwEEED2Ev@@Base+0xde12d0>; FDE=(10600272, 10601900)
  ref @0xa1c39a: lea    rax,[rip+0xdd9fbf]        # 17f6360 <_ZNSt6__ndk115basic_streambufIwNS_11char_traitsIwEEED2Ev@@Base+0xde12d0>; FDE=(10600272, 10601900)

### table-base 0x17f6348 slot+0x28 -> 0xa1cf80 FDE=0xa1cf80..0xa1cfb8
      a1cf80:	41 56                	push   r14
      a1cf82:	53                   	push   rbx
      a1cf83:	50                   	push   rax
      a1cf84:	48 89 f3             	mov    rbx,rsi
      a1cf87:	49 89 fe             	mov    r14,rdi
      a1cf8a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1cf8d:	ff 50 30             	call   QWORD PTR [rax+0x30]
      a1cf90:	48 8b 35 59 50 e9 00 	mov    rsi,QWORD PTR [rip+0xe95059]        # 18b1ff0 <_ZNSt6__ndk17codecvtIwc9mbstate_tE2idE@@Base-0x12dbd8>
      a1cf97:	48 89 df             	mov    rdi,rbx
      a1cf9a:	e8 d1 16 dd 00       	call   17ee670 <_ZNKSt6__ndk16locale9use_facetERNS0_2idE@plt>
      a1cf9f:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
      a1cfa3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a1cfa6:	48 89 c7             	mov    rdi,rax
      a1cfa9:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      a1cfac:	41 88 46 58          	mov    BYTE PTR [r14+0x58],al
      a1cfb0:	48 83 c4 08          	add    rsp,0x8
      a1cfb4:	5b                   	pop    rbx
      a1cfb5:	41 5e                	pop    r14
      a1cfb7:	c3                   	ret
  ref @0xa1c2d3: lea    rax,[rip+0xdda086]        # 17f6360 <_ZNSt6__ndk115basic_streambufIwNS_11char_traitsIwEEED2Ev@@Base+0xde12d0>; FDE=(10600272, 10601900)
  ref @0xa1c39a: lea    rax,[rip+0xdd9fbf]        # 17f6360 <_ZNSt6__ndk115basic_streambufIwNS_11char_traitsIwEEED2Ev@@Base+0xde12d0>; FDE=(10600272, 10601900)

### table-base 0x17f6368 slot+0x28 -> 0xa1ca00 FDE=0xa1ca00..0xa1ca8c
      a1ca00:	55                   	push   rbp
      a1ca01:	41 57                	push   r15
      a1ca03:	41 56                	push   r14
      a1ca05:	41 55                	push   r13
      a1ca07:	41 54                	push   r12
      a1ca09:	53                   	push   rbx
      a1ca0a:	48 83 ec 18          	sub    rsp,0x18
      a1ca0e:	48 89 fb             	mov    rbx,rdi
      a1ca11:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
      a1ca16:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
      a1ca1b:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
      a1ca20:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
      a1ca24:	48 8b 73 50          	mov    rsi,QWORD PTR [rbx+0x50]
      a1ca28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1ca2b:	4c 89 fa             	mov    rdx,r15
      a1ca2e:	4c 89 f1             	mov    rcx,r14
      a1ca31:	4d 89 e0             	mov    r8,r12
      a1ca34:	ff 50 28             	call   QWORD PTR [rax+0x28]
      a1ca37:	89 c5                	mov    ebp,eax
      a1ca39:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      a1ca3e:	4d 29 fd             	sub    r13,r15
      a1ca41:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      a1ca45:	be 01 00 00 00       	mov    esi,0x1
      a1ca4a:	4c 89 ff             	mov    rdi,r15
      a1ca4d:	4c 89 ea             	mov    rdx,r13
      a1ca50:	e8 fb 20 dd 00       	call   17eeb50 <fwrite@plt>
      a1ca55:	48 89 c1             	mov    rcx,rax
      a1ca58:	b8 ff ff ff ff       	mov    eax,0xffffffff
      a1ca5d:	4c 39 e9             	cmp    rcx,r13
      a1ca60:	75 1b                	jne    a1ca7d <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x48d>
      a1ca62:	83 fd 01             	cmp    ebp,0x1
      a1ca65:	74 b9                	je     a1ca20 <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x430>
      a1ca67:	83 fd 02             	cmp    ebp,0x2
      a1ca6a:	74 11                	je     a1ca7d <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0x48d>
      a1ca6c:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      a1ca70:	e8 7b 2d dd 00       	call   17ef7f0 <fflush@plt>
      a1ca75:	89 c1                	mov    ecx,eax
      a1ca77:	31 c0                	xor    eax,eax
      a1ca79:	f7 d9                	neg    ecx
      a1ca7b:	19 c0                	sbb    eax,eax
      a1ca7d:	48 83 c4 18          	add    rsp,0x18
      a1ca81:	5b                   	pop    rbx
      a1ca82:	41 5c                	pop    r12
      a1ca84:	41 5d                	pop    r13
      a1ca86:	41 5e                	pop    r14
      a1ca88:	41 5f                	pop    r15
      a1ca8a:	5d                   	pop    rbp
      a1ca8b:	c3                   	ret

### table-base 0x17f6398 slot+0x28 -> 0xa1cfc0 FDE=0xa1cfc0..0xa1d02d
      a1cfc0:	41 57                	push   r15
      a1cfc2:	41 56                	push   r14
      a1cfc4:	41 54                	push   r12
      a1cfc6:	53                   	push   rbx
      a1cfc7:	50                   	push   rax
      a1cfc8:	48 89 d3             	mov    rbx,rdx
      a1cfcb:	49 89 f6             	mov    r14,rsi
      a1cfce:	49 89 fc             	mov    r12,rdi
      a1cfd1:	80 7f 58 00          	cmp    BYTE PTR [rdi+0x58],0x0
      a1cfd5:	74 20                	je     a1cff7 <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0xa07>
      a1cfd7:	49 8b 4c 24 40       	mov    rcx,QWORD PTR [r12+0x40]
      a1cfdc:	be 04 00 00 00       	mov    esi,0x4
      a1cfe1:	4c 89 f7             	mov    rdi,r14
      a1cfe4:	48 89 da             	mov    rdx,rbx
      a1cfe7:	48 83 c4 08          	add    rsp,0x8
      a1cfeb:	5b                   	pop    rbx
      a1cfec:	41 5c                	pop    r12
      a1cfee:	41 5e                	pop    r14
      a1cff0:	41 5f                	pop    r15
      a1cff2:	e9 59 1b dd 00       	jmp    17eeb50 <fwrite@plt>
      a1cff7:	45 31 ff             	xor    r15d,r15d
      a1cffa:	48 85 db             	test   rbx,rbx
      a1cffd:	7e 1f                	jle    a1d01e <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0xa2e>
      a1cfff:	90                   	nop
      a1d000:	43 8b 34 be          	mov    esi,DWORD PTR [r14+r15*4]
      a1d004:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      a1d008:	4c 89 e7             	mov    rdi,r12
      a1d00b:	ff 50 68             	call   QWORD PTR [rax+0x68]
      a1d00e:	83 f8 ff             	cmp    eax,0xffffffff
      a1d011:	74 0b                	je     a1d01e <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0xa2e>
      a1d013:	49 ff c7             	inc    r15
      a1d016:	4c 39 fb             	cmp    rbx,r15
      a1d019:	75 e5                	jne    a1d000 <_ZNSt6__ndk18ios_base4InitC1Ev@@Base+0xa10>
      a1d01b:	49 89 df             	mov    r15,rbx
      a1d01e:	4c 89 f8             	mov    rax,r15
      a1d021:	48 83 c4 08          	add    rsp,0x8
      a1d025:	5b                   	pop    rbx
      a1d026:	41 5c                	pop    r12
      a1d028:	41 5e                	pop    r14
      a1d02a:	41 5f                	pop    r15
      a1d02c:	c3                   	ret

### table-base 0x17f63d0 slot+0x28 -> 0xa3c750 FDE=0xa3c750..0xa3c802
      a3c750:	55                   	push   rbp
      a3c751:	53                   	push   rbx
      a3c752:	50                   	push   rax
      a3c753:	48 89 fb             	mov    rbx,rdi
      a3c756:	48 8d 05 9b 9c db 00 	lea    rax,[rip+0xdb9c9b]        # 17f63f8 <_ZTINSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0x288>
      a3c75d:	48 89 07             	mov    QWORD PTR [rdi],rax
      a3c760:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      a3c764:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
      a3c768:	48 39 cf             	cmp    rdi,rcx
      a3c76b:	74 4e                	je     a3c7bb <_ZNSt6__ndk16locale7classicEv@@Base+0x492b>
      a3c76d:	bd 01 00 00 00       	mov    ebp,0x1
      a3c772:	31 c0                	xor    eax,eax
      a3c774:	48 89 cf             	mov    rdi,rcx
      a3c777:	eb 1f                	jmp    a3c798 <_ZNSt6__ndk16locale7classicEv@@Base+0x4908>
      a3c779:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
      a3c780:	89 e8                	mov    eax,ebp
      a3c782:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      a3c786:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      a3c78a:	48 29 f9             	sub    rcx,rdi
      a3c78d:	48 c1 f9 03          	sar    rcx,0x3
      a3c791:	ff c5                	inc    ebp
      a3c793:	48 39 c1             	cmp    rcx,rax
      a3c796:	76 23                	jbe    a3c7bb <_ZNSt6__ndk16locale7classicEv@@Base+0x492b>
      a3c798:	48 8b 3c c7          	mov    rdi,QWORD PTR [rdi+rax*8]
      a3c79c:	48 85 ff             	test   rdi,rdi
      a3c79f:	74 df                	je     a3c780 <_ZNSt6__ndk16locale7classicEv@@Base+0x48f0>
      a3c7a1:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a3c7a8:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a3c7ae:	48 85 c0             	test   rax,rax
      a3c7b1:	75 cd                	jne    a3c780 <_ZNSt6__ndk16locale7classicEv@@Base+0x48f0>
      a3c7b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a3c7b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
      a3c7b9:	eb c5                	jmp    a3c780 <_ZNSt6__ndk16locale7classicEv@@Base+0x48f0>
      a3c7bb:	f6 83 20 01 00 00 01 	test   BYTE PTR [rbx+0x120],0x1
      a3c7c2:	74 10                	je     a3c7d4 <_ZNSt6__ndk16locale7classicEv@@Base+0x4944>
      a3c7c4:	48 8b bb 30 01 00 00 	mov    rdi,QWORD PTR [rbx+0x130]
      a3c7cb:	e8 50 17 db 00       	call   17edf20 <_ZdlPv@plt>
      a3c7d0:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      a3c7d4:	48 85 ff             	test   rdi,rdi
      a3c7d7:	74 1b                	je     a3c7f4 <_ZNSt6__ndk16locale7classicEv@@Base+0x4964>
      a3c7d9:	48 89 7b 18          	mov    QWORD PTR [rbx+0x18],rdi
      a3c7dd:	48 8d 43 28          	lea    rax,[rbx+0x28]
      a3c7e1:	48 39 c7             	cmp    rdi,rax
      a3c7e4:	74 07                	je     a3c7ed <_ZNSt6__ndk16locale7classicEv@@Base+0x495d>
      a3c7e6:	e8 35 17 db 00       	call   17edf20 <_ZdlPv@plt>
      a3c7eb:	eb 07                	jmp    a3c7f4 <_ZNSt6__ndk16locale7classicEv@@Base+0x4964>
      a3c7ed:	c6 87 f0 00 00 00 00 	mov    BYTE PTR [rdi+0xf0],0x0
      a3c7f4:	48 89 df             	mov    rdi,rbx
      a3c7f7:	48 83 c4 08          	add    rsp,0x8
      a3c7fb:	5b                   	pop    rbx
      a3c7fc:	5d                   	pop    rbp
      a3c7fd:	e9 9e 29 db 00       	jmp    17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>

### table-base 0x17f63d8 slot+0x28 -> 0xa3c810 FDE=0xa3c810..0xa3c8ca
      a3c810:	55                   	push   rbp
      a3c811:	53                   	push   rbx
      a3c812:	50                   	push   rax
      a3c813:	48 89 fb             	mov    rbx,rdi
      a3c816:	48 8d 05 db 9b db 00 	lea    rax,[rip+0xdb9bdb]        # 17f63f8 <_ZTINSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0x288>
      a3c81d:	48 89 07             	mov    QWORD PTR [rdi],rax
      a3c820:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      a3c824:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
      a3c828:	48 39 cf             	cmp    rdi,rcx
      a3c82b:	74 4e                	je     a3c87b <_ZNSt6__ndk16locale7classicEv@@Base+0x49eb>
      a3c82d:	bd 01 00 00 00       	mov    ebp,0x1
      a3c832:	31 c0                	xor    eax,eax
      a3c834:	48 89 cf             	mov    rdi,rcx
      a3c837:	eb 1f                	jmp    a3c858 <_ZNSt6__ndk16locale7classicEv@@Base+0x49c8>
      a3c839:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
      a3c840:	89 e8                	mov    eax,ebp
      a3c842:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      a3c846:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      a3c84a:	48 29 f9             	sub    rcx,rdi
      a3c84d:	48 c1 f9 03          	sar    rcx,0x3
      a3c851:	ff c5                	inc    ebp
      a3c853:	48 39 c1             	cmp    rcx,rax
      a3c856:	76 23                	jbe    a3c87b <_ZNSt6__ndk16locale7classicEv@@Base+0x49eb>
      a3c858:	48 8b 3c c7          	mov    rdi,QWORD PTR [rdi+rax*8]
      a3c85c:	48 85 ff             	test   rdi,rdi
      a3c85f:	74 df                	je     a3c840 <_ZNSt6__ndk16locale7classicEv@@Base+0x49b0>
      a3c861:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a3c868:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a3c86e:	48 85 c0             	test   rax,rax
      a3c871:	75 cd                	jne    a3c840 <_ZNSt6__ndk16locale7classicEv@@Base+0x49b0>
      a3c873:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a3c876:	ff 50 10             	call   QWORD PTR [rax+0x10]
      a3c879:	eb c5                	jmp    a3c840 <_ZNSt6__ndk16locale7classicEv@@Base+0x49b0>
      a3c87b:	f6 83 20 01 00 00 01 	test   BYTE PTR [rbx+0x120],0x1
      a3c882:	74 10                	je     a3c894 <_ZNSt6__ndk16locale7classicEv@@Base+0x4a04>
      a3c884:	48 8b bb 30 01 00 00 	mov    rdi,QWORD PTR [rbx+0x130]
      a3c88b:	e8 90 16 db 00       	call   17edf20 <_ZdlPv@plt>
      a3c890:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      a3c894:	48 85 ff             	test   rdi,rdi
      a3c897:	74 1b                	je     a3c8b4 <_ZNSt6__ndk16locale7classicEv@@Base+0x4a24>
      a3c899:	48 89 7b 18          	mov    QWORD PTR [rbx+0x18],rdi
      a3c89d:	48 8d 43 28          	lea    rax,[rbx+0x28]
      a3c8a1:	48 39 c7             	cmp    rdi,rax
      a3c8a4:	74 07                	je     a3c8ad <_ZNSt6__ndk16locale7classicEv@@Base+0x4a1d>
      a3c8a6:	e8 75 16 db 00       	call   17edf20 <_ZdlPv@plt>
      a3c8ab:	eb 07                	jmp    a3c8b4 <_ZNSt6__ndk16locale7classicEv@@Base+0x4a24>
      a3c8ad:	c6 87 f0 00 00 00 00 	mov    BYTE PTR [rdi+0xf0],0x0
      a3c8b4:	48 89 df             	mov    rdi,rbx
      a3c8b7:	e8 e4 28 db 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a3c8bc:	48 89 df             	mov    rdi,rbx
      a3c8bf:	48 83 c4 08          	add    rsp,0x8
      a3c8c3:	5b                   	pop    rbx
      a3c8c4:	5d                   	pop    rbp
      a3c8c5:	e9 56 16 db 00       	jmp    17edf20 <_ZdlPv@plt>
  ref @0xa3527f: lea    rax,[rip+0xdc1172]        # 17f63f8 <_ZTINSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0x288>; FDE=(10703472, 10705312)
  ref @0xa377b5: lea    rax,[rip+0xdbec3c]        # 17f63f8 <_ZTINSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0x288>; FDE=(10712992, 10714756)
  ref @0xa3985e: lea    rax,[rip+0xdbcb93]        # 17f63f8 <_ZTINSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0x288>; FDE=(10721344, 10723050)
  ref @0xa39f0e: lea    rax,[rip+0xdbc4e3]        # 17f63f8 <_ZTINSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0x288>; FDE=(10723056, 10723994)
  ref @0xa3c47c: lea    rax,[rip+0xdb9f75]        # 17f63f8 <_ZTINSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0x288>; FDE=(10732640, 10733383)
  ref @0xa3c756: lea    rax,[rip+0xdb9c9b]        # 17f63f8 <_ZTINSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0x288>; FDE=(10733392, 10733570)
  ref @0xa3c816: lea    rax,[rip+0xdb9bdb]        # 17f63f8 <_ZTINSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0x288>; FDE=(10733584, 10733770)

### table-base 0x17f6d70 slot+0x28 -> 0xa4b700 FDE=0xa4b700..0xa4b712
      a4b700:	53                   	push   rbx
      a4b701:	48 89 fb             	mov    rbx,rdi
      a4b704:	e8 57 4c da 00       	call   17f0360 <_ZNSt6__ndk17codecvtIwc9mbstate_tED2Ev@plt>
      a4b709:	48 89 df             	mov    rdi,rbx
      a4b70c:	5b                   	pop    rbx
      a4b70d:	e9 0e 28 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f6e20 slot+0x28 -> 0xa4b720 FDE=0xa4b720..0xa4b732
      a4b720:	53                   	push   rbx
      a4b721:	48 89 fb             	mov    rbx,rdi
      a4b724:	e8 57 4c da 00       	call   17f0380 <_ZNSt6__ndk17codecvtIDsc9mbstate_tED2Ev@plt>
      a4b729:	48 89 df             	mov    rdi,rbx
      a4b72c:	5b                   	pop    rbx
      a4b72d:	e9 ee 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f6e98 slot+0x28 -> 0xa4b740 FDE=0xa4b740..0xa4b752
      a4b740:	53                   	push   rbx
      a4b741:	48 89 fb             	mov    rbx,rdi
      a4b744:	e8 57 4c da 00       	call   17f03a0 <_ZNSt6__ndk17codecvtIDic9mbstate_tED2Ev@plt>
      a4b749:	48 89 df             	mov    rdi,rbx
      a4b74c:	5b                   	pop    rbx
      a4b74d:	e9 ce 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f6f10 slot+0x28 -> 0xa4b700 FDE=0xa4b700..0xa4b712
      a4b700:	53                   	push   rbx
      a4b701:	48 89 fb             	mov    rbx,rdi
      a4b704:	e8 57 4c da 00       	call   17f0360 <_ZNSt6__ndk17codecvtIwc9mbstate_tED2Ev@plt>
      a4b709:	48 89 df             	mov    rdi,rbx
      a4b70c:	5b                   	pop    rbx
      a4b70d:	e9 0e 28 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f6f88 slot+0x28 -> 0xa4b700 FDE=0xa4b700..0xa4b712
      a4b700:	53                   	push   rbx
      a4b701:	48 89 fb             	mov    rbx,rdi
      a4b704:	e8 57 4c da 00       	call   17f0360 <_ZNSt6__ndk17codecvtIwc9mbstate_tED2Ev@plt>
      a4b709:	48 89 df             	mov    rdi,rbx
      a4b70c:	5b                   	pop    rbx
      a4b70d:	e9 0e 28 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7000 slot+0x28 -> 0xa4b720 FDE=0xa4b720..0xa4b732
      a4b720:	53                   	push   rbx
      a4b721:	48 89 fb             	mov    rbx,rdi
      a4b724:	e8 57 4c da 00       	call   17f0380 <_ZNSt6__ndk17codecvtIDsc9mbstate_tED2Ev@plt>
      a4b729:	48 89 df             	mov    rdi,rbx
      a4b72c:	5b                   	pop    rbx
      a4b72d:	e9 ee 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7078 slot+0x28 -> 0xa4b720 FDE=0xa4b720..0xa4b732
      a4b720:	53                   	push   rbx
      a4b721:	48 89 fb             	mov    rbx,rdi
      a4b724:	e8 57 4c da 00       	call   17f0380 <_ZNSt6__ndk17codecvtIDsc9mbstate_tED2Ev@plt>
      a4b729:	48 89 df             	mov    rdi,rbx
      a4b72c:	5b                   	pop    rbx
      a4b72d:	e9 ee 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f70f0 slot+0x28 -> 0xa4b740 FDE=0xa4b740..0xa4b752
      a4b740:	53                   	push   rbx
      a4b741:	48 89 fb             	mov    rbx,rdi
      a4b744:	e8 57 4c da 00       	call   17f03a0 <_ZNSt6__ndk17codecvtIDic9mbstate_tED2Ev@plt>
      a4b749:	48 89 df             	mov    rdi,rbx
      a4b74c:	5b                   	pop    rbx
      a4b74d:	e9 ce 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7168 slot+0x28 -> 0xa4b740 FDE=0xa4b740..0xa4b752
      a4b740:	53                   	push   rbx
      a4b741:	48 89 fb             	mov    rbx,rdi
      a4b744:	e8 57 4c da 00       	call   17f03a0 <_ZNSt6__ndk17codecvtIDic9mbstate_tED2Ev@plt>
      a4b749:	48 89 df             	mov    rdi,rbx
      a4b74c:	5b                   	pop    rbx
      a4b74d:	e9 ce 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f71e0 slot+0x28 -> 0xa4b700 FDE=0xa4b700..0xa4b712
      a4b700:	53                   	push   rbx
      a4b701:	48 89 fb             	mov    rbx,rdi
      a4b704:	e8 57 4c da 00       	call   17f0360 <_ZNSt6__ndk17codecvtIwc9mbstate_tED2Ev@plt>
      a4b709:	48 89 df             	mov    rdi,rbx
      a4b70c:	5b                   	pop    rbx
      a4b70d:	e9 0e 28 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7258 slot+0x28 -> 0xa4b740 FDE=0xa4b740..0xa4b752
      a4b740:	53                   	push   rbx
      a4b741:	48 89 fb             	mov    rbx,rdi
      a4b744:	e8 57 4c da 00       	call   17f03a0 <_ZNSt6__ndk17codecvtIDic9mbstate_tED2Ev@plt>
      a4b749:	48 89 df             	mov    rdi,rbx
      a4b74c:	5b                   	pop    rbx
      a4b74d:	e9 ce 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f72d0 slot+0x28 -> 0xa4b720 FDE=0xa4b720..0xa4b732
      a4b720:	53                   	push   rbx
      a4b721:	48 89 fb             	mov    rbx,rdi
      a4b724:	e8 57 4c da 00       	call   17f0380 <_ZNSt6__ndk17codecvtIDsc9mbstate_tED2Ev@plt>
      a4b729:	48 89 df             	mov    rdi,rbx
      a4b72c:	5b                   	pop    rbx
      a4b72d:	e9 ee 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7508 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f75f8 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f76d8 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f77b0 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7878 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7988 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7a88 slot+0x28 -> 0xa4b840 FDE=0xa4b840..0xa4b85e
      a4b840:	53                   	push   rbx
      a4b841:	48 89 fb             	mov    rbx,rdi
      a4b844:	48 83 c7 18          	add    rdi,0x18
      a4b848:	e8 c3 22 00 00       	call   a4db10 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x23b0>
      a4b84d:	48 89 df             	mov    rdi,rbx
      a4b850:	e8 4b 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b855:	48 89 df             	mov    rdi,rbx
      a4b858:	5b                   	pop    rbx
      a4b859:	e9 c2 26 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7ad0 slot+0x28 -> 0xa4b870 FDE=0xa4b870..0xa4b875
      a4b870:	48 8d 47 20          	lea    rax,[rdi+0x20]
      a4b874:	c3                   	ret

### table-base 0x17f7ad8 slot+0x28 -> 0xa4b880 FDE=0xa4b880..0xa4b888
      a4b880:	48 8d 87 70 01 00 00 	lea    rax,[rdi+0x170]
      a4b887:	c3                   	ret

### table-base 0x17f7ae0 slot+0x28 -> 0xa4b890 FDE=0xa4b890..0xa4b898
      a4b890:	48 8d 87 b0 03 00 00 	lea    rax,[rdi+0x3b0]
      a4b897:	c3                   	ret

### table-base 0x17f7ae8 slot+0x28 -> 0xa4b8a0 FDE=0xa4b8a0..0xa4b8a8
      a4b8a0:	48 8d 87 e0 03 00 00 	lea    rax,[rdi+0x3e0]
      a4b8a7:	c3                   	ret

### table-base 0x17f7af0 slot+0x28 -> 0xa4b8b0 FDE=0xa4b8b0..0xa4b8b8
      a4b8b0:	48 8d 87 f8 03 00 00 	lea    rax,[rdi+0x3f8]
      a4b8b7:	c3                   	ret

### table-base 0x17f7af8 slot+0x28 -> 0xa4b8c0 FDE=0xa4b8c0..0xa4b8c8
      a4b8c0:	48 8d 87 10 04 00 00 	lea    rax,[rdi+0x410]
      a4b8c7:	c3                   	ret

### table-base 0x17f7b00 slot+0x28 -> 0xa4b8d0 FDE=0xa4b8d0..0xa4b8d8
      a4b8d0:	48 8d 87 28 04 00 00 	lea    rax,[rdi+0x428]
      a4b8d7:	c3                   	ret

### table-base 0x17f7b18 slot+0x28 -> 0xa4b8e0 FDE=0xa4b8e0..0xa4b8e5
      a4b8e0:	48 8d 47 10          	lea    rax,[rdi+0x10]
      a4b8e4:	c3                   	ret

### table-base 0x17f7b20 slot+0x28 -> 0xa4b8f0 FDE=0xa4b8f0..0xa4b8f8
      a4b8f0:	48 8d 87 60 01 00 00 	lea    rax,[rdi+0x160]
      a4b8f7:	c3                   	ret

### table-base 0x17f7b28 slot+0x28 -> 0xa4b900 FDE=0xa4b900..0xa4b908
      a4b900:	48 8d 87 a0 03 00 00 	lea    rax,[rdi+0x3a0]
      a4b907:	c3                   	ret

### table-base 0x17f7b38 slot+0x28 -> 0xa4b920 FDE=0xa4b920..0xa4b928
      a4b920:	48 8d 87 e8 03 00 00 	lea    rax,[rdi+0x3e8]
      a4b927:	c3                   	ret

### table-base 0x17f7b40 slot+0x28 -> 0xa4b930 FDE=0xa4b930..0xa4b938
      a4b930:	48 8d 87 00 04 00 00 	lea    rax,[rdi+0x400]
      a4b937:	c3                   	ret

### table-base 0x17f7b48 slot+0x28 -> 0xa4b940 FDE=0xa4b940..0xa4b948
      a4b940:	48 8d 87 18 04 00 00 	lea    rax,[rdi+0x418]
      a4b947:	c3                   	ret

### table-base 0x17f7bc8 slot+0x28 -> 0xa4b970 FDE=0xa4b970..0xa4b98e
      a4b970:	53                   	push   rbx
      a4b971:	48 89 fb             	mov    rbx,rdi
      a4b974:	48 83 c7 18          	add    rdi,0x18
      a4b978:	e8 03 28 00 00       	call   a4e180 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x2a20>
      a4b97d:	48 89 df             	mov    rdi,rbx
      a4b980:	e8 1b 38 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b985:	48 89 df             	mov    rdi,rbx
      a4b988:	5b                   	pop    rbx
      a4b989:	e9 92 25 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7c10 slot+0x28 -> 0xa4b870 FDE=0xa4b870..0xa4b875
      a4b870:	48 8d 47 20          	lea    rax,[rdi+0x20]
      a4b874:	c3                   	ret

### table-base 0x17f7c18 slot+0x28 -> 0xa4b880 FDE=0xa4b880..0xa4b888
      a4b880:	48 8d 87 70 01 00 00 	lea    rax,[rdi+0x170]
      a4b887:	c3                   	ret

### table-base 0x17f7c20 slot+0x28 -> 0xa4b890 FDE=0xa4b890..0xa4b898
      a4b890:	48 8d 87 b0 03 00 00 	lea    rax,[rdi+0x3b0]
      a4b897:	c3                   	ret

### table-base 0x17f7c28 slot+0x28 -> 0xa4b8a0 FDE=0xa4b8a0..0xa4b8a8
      a4b8a0:	48 8d 87 e0 03 00 00 	lea    rax,[rdi+0x3e0]
      a4b8a7:	c3                   	ret

### table-base 0x17f7c30 slot+0x28 -> 0xa4b8b0 FDE=0xa4b8b0..0xa4b8b8
      a4b8b0:	48 8d 87 f8 03 00 00 	lea    rax,[rdi+0x3f8]
      a4b8b7:	c3                   	ret

### table-base 0x17f7c38 slot+0x28 -> 0xa4b8c0 FDE=0xa4b8c0..0xa4b8c8
      a4b8c0:	48 8d 87 10 04 00 00 	lea    rax,[rdi+0x410]
      a4b8c7:	c3                   	ret

### table-base 0x17f7c40 slot+0x28 -> 0xa4b8d0 FDE=0xa4b8d0..0xa4b8d8
      a4b8d0:	48 8d 87 28 04 00 00 	lea    rax,[rdi+0x428]
      a4b8d7:	c3                   	ret

### table-base 0x17f7c58 slot+0x28 -> 0xa4b8e0 FDE=0xa4b8e0..0xa4b8e5
      a4b8e0:	48 8d 47 10          	lea    rax,[rdi+0x10]
      a4b8e4:	c3                   	ret

### table-base 0x17f7c60 slot+0x28 -> 0xa4b8f0 FDE=0xa4b8f0..0xa4b8f8
      a4b8f0:	48 8d 87 60 01 00 00 	lea    rax,[rdi+0x160]
      a4b8f7:	c3                   	ret

### table-base 0x17f7c68 slot+0x28 -> 0xa4b900 FDE=0xa4b900..0xa4b908
      a4b900:	48 8d 87 a0 03 00 00 	lea    rax,[rdi+0x3a0]
      a4b907:	c3                   	ret

### table-base 0x17f7c78 slot+0x28 -> 0xa4b920 FDE=0xa4b920..0xa4b928
      a4b920:	48 8d 87 e8 03 00 00 	lea    rax,[rdi+0x3e8]
      a4b927:	c3                   	ret

### table-base 0x17f7c80 slot+0x28 -> 0xa4b930 FDE=0xa4b930..0xa4b938
      a4b930:	48 8d 87 00 04 00 00 	lea    rax,[rdi+0x400]
      a4b937:	c3                   	ret

### table-base 0x17f7c88 slot+0x28 -> 0xa4b940 FDE=0xa4b940..0xa4b948
      a4b940:	48 8d 87 18 04 00 00 	lea    rax,[rdi+0x418]
      a4b947:	c3                   	ret

### table-base 0x17f7cf8 slot+0x28 -> 0xa4b9a0 FDE=0xa4b9a0..0xa4b9be
      a4b9a0:	53                   	push   rbx
      a4b9a1:	48 89 fb             	mov    rbx,rdi
      a4b9a4:	48 83 c7 10          	add    rdi,0x10
      a4b9a8:	e8 b3 4f da 00       	call   17f0960 <_ZNSt6__ndk110__time_putD2Ev@plt>
      a4b9ad:	48 89 df             	mov    rdi,rbx
      a4b9b0:	e8 eb 37 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b9b5:	48 89 df             	mov    rdi,rbx
      a4b9b8:	5b                   	pop    rbx
      a4b9b9:	e9 62 25 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7d70 slot+0x28 -> 0xa4b9a0 FDE=0xa4b9a0..0xa4b9be
      a4b9a0:	53                   	push   rbx
      a4b9a1:	48 89 fb             	mov    rbx,rdi
      a4b9a4:	48 83 c7 10          	add    rdi,0x10
      a4b9a8:	e8 b3 4f da 00       	call   17f0960 <_ZNSt6__ndk110__time_putD2Ev@plt>
      a4b9ad:	48 89 df             	mov    rdi,rbx
      a4b9b0:	e8 eb 37 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b9b5:	48 89 df             	mov    rdi,rbx
      a4b9b8:	5b                   	pop    rbx
      a4b9b9:	e9 62 25 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7dd8 slot+0x28 -> 0xa4b9a0 FDE=0xa4b9a0..0xa4b9be
      a4b9a0:	53                   	push   rbx
      a4b9a1:	48 89 fb             	mov    rbx,rdi
      a4b9a4:	48 83 c7 10          	add    rdi,0x10
      a4b9a8:	e8 b3 4f da 00       	call   17f0960 <_ZNSt6__ndk110__time_putD2Ev@plt>
      a4b9ad:	48 89 df             	mov    rdi,rbx
      a4b9b0:	e8 eb 37 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b9b5:	48 89 df             	mov    rdi,rbx
      a4b9b8:	5b                   	pop    rbx
      a4b9b9:	e9 62 25 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7e18 slot+0x28 -> 0xa4b9c0 FDE=0xa4b9c0..0xa4b9d6
      a4b9c0:	53                   	push   rbx
      a4b9c1:	48 89 fb             	mov    rbx,rdi
      a4b9c4:	48 83 c7 10          	add    rdi,0x10
      a4b9c8:	e8 93 4f da 00       	call   17f0960 <_ZNSt6__ndk110__time_putD2Ev@plt>
      a4b9cd:	48 89 df             	mov    rdi,rbx
      a4b9d0:	5b                   	pop    rbx
      a4b9d1:	e9 ca 37 da 00       	jmp    17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>

### table-base 0x17f7e20 slot+0x28 -> 0xa4b9a0 FDE=0xa4b9a0..0xa4b9be
      a4b9a0:	53                   	push   rbx
      a4b9a1:	48 89 fb             	mov    rbx,rdi
      a4b9a4:	48 83 c7 10          	add    rdi,0x10
      a4b9a8:	e8 b3 4f da 00       	call   17f0960 <_ZNSt6__ndk110__time_putD2Ev@plt>
      a4b9ad:	48 89 df             	mov    rdi,rbx
      a4b9b0:	e8 eb 37 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b9b5:	48 89 df             	mov    rdi,rbx
      a4b9b8:	5b                   	pop    rbx
      a4b9b9:	e9 62 25 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7e68 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7f20 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f7fc8 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f8070 slot+0x28 -> 0xa4b800 FDE=0xa4b800..0xa4b812
      a4b800:	53                   	push   rbx
      a4b801:	48 89 fb             	mov    rbx,rdi
      a4b804:	e8 97 39 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4b809:	48 89 df             	mov    rdi,rbx
      a4b80c:	5b                   	pop    rbx
      a4b80d:	e9 0e 27 da 00       	jmp    17edf20 <_ZdlPv@plt>

### table-base 0x17f8118 slot+0x28 -> 0xa4ba60 FDE=0xa4ba60..0xa4bad3
      a4ba60:	53                   	push   rbx
      a4ba61:	48 89 fb             	mov    rbx,rdi
      a4ba64:	48 8b 05 8d 67 e6 00 	mov    rax,QWORD PTR [rip+0xe6678d]        # 18b21f8 <_ZTVNSt6__ndk117moneypunct_bynameIcLb0EEE@@Base+0xba0d0>
      a4ba6b:	48 83 c0 10          	add    rax,0x10
      a4ba6f:	48 89 07             	mov    QWORD PTR [rdi],rax
      a4ba72:	f6 47 60 01          	test   BYTE PTR [rdi+0x60],0x1
      a4ba76:	75 2c                	jne    a4baa4 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x344>
      a4ba78:	f6 43 48 01          	test   BYTE PTR [rbx+0x48],0x1
      a4ba7c:	75 35                	jne    a4bab3 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x353>
      a4ba7e:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
      a4ba82:	75 3e                	jne    a4bac2 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x362>
      a4ba84:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
      a4ba88:	74 09                	je     a4ba93 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x333>
      a4ba8a:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      a4ba8e:	e8 8d 24 da 00       	call   17edf20 <_ZdlPv@plt>
      a4ba93:	48 89 df             	mov    rdi,rbx
      a4ba96:	e8 05 37 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4ba9b:	48 89 df             	mov    rdi,rbx
      a4ba9e:	5b                   	pop    rbx
      a4ba9f:	e9 7c 24 da 00       	jmp    17edf20 <_ZdlPv@plt>
      a4baa4:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
      a4baa8:	e8 73 24 da 00       	call   17edf20 <_ZdlPv@plt>
      a4baad:	f6 43 48 01          	test   BYTE PTR [rbx+0x48],0x1
      a4bab1:	74 cb                	je     a4ba7e <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x31e>
      a4bab3:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      a4bab7:	e8 64 24 da 00       	call   17edf20 <_ZdlPv@plt>
      a4babc:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
      a4bac0:	74 c2                	je     a4ba84 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x324>
      a4bac2:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      a4bac6:	e8 55 24 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bacb:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
      a4bacf:	75 b9                	jne    a4ba8a <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x32a>
      a4bad1:	eb c0                	jmp    a4ba93 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x333>

### table-base 0x17f8198 slot+0x28 -> 0xa4bae0 FDE=0xa4bae0..0xa4bb52
      a4bae0:	53                   	push   rbx
      a4bae1:	48 89 fb             	mov    rbx,rdi
      a4bae4:	48 8b 05 15 67 e6 00 	mov    rax,QWORD PTR [rip+0xe66715]        # 18b2200 <_ZTVNSt6__ndk117moneypunct_bynameIcLb1EEE@@Base+0xba050>
      a4baeb:	48 83 c0 10          	add    rax,0x10
      a4baef:	48 89 07             	mov    QWORD PTR [rdi],rax
      a4baf2:	f6 47 60 01          	test   BYTE PTR [rdi+0x60],0x1
      a4baf6:	75 1b                	jne    a4bb13 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x3b3>
      a4baf8:	f6 43 48 01          	test   BYTE PTR [rbx+0x48],0x1
      a4bafc:	75 24                	jne    a4bb22 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x3c2>
      a4bafe:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
      a4bb02:	75 2d                	jne    a4bb31 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x3d1>
      a4bb04:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
      a4bb08:	75 36                	jne    a4bb40 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x3e0>
      a4bb0a:	48 89 df             	mov    rdi,rbx
      a4bb0d:	5b                   	pop    rbx
      a4bb0e:	e9 8d 36 da 00       	jmp    17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4bb13:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
      a4bb17:	e8 04 24 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bb1c:	f6 43 48 01          	test   BYTE PTR [rbx+0x48],0x1
      a4bb20:	74 dc                	je     a4bafe <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x39e>
      a4bb22:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      a4bb26:	e8 f5 23 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bb2b:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
      a4bb2f:	74 d3                	je     a4bb04 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x3a4>
      a4bb31:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      a4bb35:	e8 e6 23 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bb3a:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
      a4bb3e:	74 ca                	je     a4bb0a <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x3aa>
      a4bb40:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      a4bb44:	e8 d7 23 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bb49:	48 89 df             	mov    rdi,rbx
      a4bb4c:	5b                   	pop    rbx
      a4bb4d:	e9 4e 36 da 00       	jmp    17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>

### table-base 0x17f81a0 slot+0x28 -> 0xa4bb60 FDE=0xa4bb60..0xa4bbd3
      a4bb60:	53                   	push   rbx
      a4bb61:	48 89 fb             	mov    rbx,rdi
      a4bb64:	48 8b 05 95 66 e6 00 	mov    rax,QWORD PTR [rip+0xe66695]        # 18b2200 <_ZTVNSt6__ndk117moneypunct_bynameIcLb1EEE@@Base+0xba050>
      a4bb6b:	48 83 c0 10          	add    rax,0x10
      a4bb6f:	48 89 07             	mov    QWORD PTR [rdi],rax
      a4bb72:	f6 47 60 01          	test   BYTE PTR [rdi+0x60],0x1
      a4bb76:	75 2c                	jne    a4bba4 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x444>
      a4bb78:	f6 43 48 01          	test   BYTE PTR [rbx+0x48],0x1
      a4bb7c:	75 35                	jne    a4bbb3 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x453>
      a4bb7e:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
      a4bb82:	75 3e                	jne    a4bbc2 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x462>
      a4bb84:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
      a4bb88:	74 09                	je     a4bb93 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x433>
      a4bb8a:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      a4bb8e:	e8 8d 23 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bb93:	48 89 df             	mov    rdi,rbx
      a4bb96:	e8 05 36 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4bb9b:	48 89 df             	mov    rdi,rbx
      a4bb9e:	5b                   	pop    rbx
      a4bb9f:	e9 7c 23 da 00       	jmp    17edf20 <_ZdlPv@plt>
      a4bba4:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
      a4bba8:	e8 73 23 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bbad:	f6 43 48 01          	test   BYTE PTR [rbx+0x48],0x1
      a4bbb1:	74 cb                	je     a4bb7e <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x41e>
      a4bbb3:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      a4bbb7:	e8 64 23 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bbbc:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
      a4bbc0:	74 c2                	je     a4bb84 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x424>
      a4bbc2:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      a4bbc6:	e8 55 23 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bbcb:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
      a4bbcf:	75 b9                	jne    a4bb8a <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x42a>
      a4bbd1:	eb c0                	jmp    a4bb93 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x433>

### table-base 0x17f8220 slot+0x28 -> 0xa4bbe0 FDE=0xa4bbe0..0xa4bc52
      a4bbe0:	53                   	push   rbx
      a4bbe1:	48 89 fb             	mov    rbx,rdi
      a4bbe4:	48 8b 05 1d 66 e6 00 	mov    rax,QWORD PTR [rip+0xe6661d]        # 18b2208 <_ZTVNSt6__ndk117moneypunct_bynameIwLb0EEE@@Base+0xb9fd0>
      a4bbeb:	48 83 c0 10          	add    rax,0x10
      a4bbef:	48 89 07             	mov    QWORD PTR [rdi],rax
      a4bbf2:	f6 47 60 01          	test   BYTE PTR [rdi+0x60],0x1
      a4bbf6:	75 1b                	jne    a4bc13 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x4b3>
      a4bbf8:	f6 43 48 01          	test   BYTE PTR [rbx+0x48],0x1
      a4bbfc:	75 24                	jne    a4bc22 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x4c2>
      a4bbfe:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
      a4bc02:	75 2d                	jne    a4bc31 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x4d1>
      a4bc04:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
      a4bc08:	75 36                	jne    a4bc40 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x4e0>
      a4bc0a:	48 89 df             	mov    rdi,rbx
      a4bc0d:	5b                   	pop    rbx
      a4bc0e:	e9 8d 35 da 00       	jmp    17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a4bc13:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
      a4bc17:	e8 04 23 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bc1c:	f6 43 48 01          	test   BYTE PTR [rbx+0x48],0x1
      a4bc20:	74 dc                	je     a4bbfe <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x49e>
      a4bc22:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      a4bc26:	e8 f5 22 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bc2b:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
      a4bc2f:	74 d3                	je     a4bc04 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x4a4>
      a4bc31:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      a4bc35:	e8 e6 22 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bc3a:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
      a4bc3e:	74 ca                	je     a4bc0a <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x4aa>
      a4bc40:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      a4bc44:	e8 d7 22 da 00       	call   17edf20 <_ZdlPv@plt>
      a4bc49:	48 89 df             	mov    rdi,rbx
      a4bc4c:	5b                   	pop    rbx
      a4bc4d:	e9 4e 35 da 00       	jmp    17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>

## Exact downstream execution branch
     12044d8:	48 8d 35 ab 2b 14 ff 	lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
     12044df:	48 89 df             	mov    rdi,rbx
     12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12044e7:	84 c0                	test   al,al
     12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
     12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     1204501:	00 
     1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1204511:	0f 57 c0             	xorps  xmm0,xmm0
     1204514:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1204517:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     120451b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1204520:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     1204524:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     120452b:	00 
     120452c:	e8 5f 98 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1204531:	e9 53 fe ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
     1204536:	48 8d 35 01 84 13 ff 	lea    rsi,[rip+0xffffffffff138401]        # 33c93e <_ZTSSt12bad_any_cast@@Base-0x5388a>
