# ef91cc large source-state builder

Why this FDE matters:
- ef91cc later tests source+0x1b5 and reads source+0x10
- this builder writes local +0x1b5/+0x1b7 from r15+0xb5/+0xb6
- resolving local +0x10 and the completed object output can identify the real readiness receiver source

## Full FDE 0xcea164..0xceabe2
      cea164:	55                   	push   rbp
      cea165:	41 57                	push   r15
      cea167:	41 56                	push   r14
      cea169:	41 55                	push   r13
      cea16b:	41 54                	push   r12
      cea16d:	53                   	push   rbx
      cea16e:	48 81 ec 38 04 00 00 	sub    rsp,0x438
      cea175:	49 89 cf             	mov    r15,rcx
      cea178:	48 89 d5             	mov    rbp,rdx
      cea17b:	48 89 f1             	mov    rcx,rsi
      cea17e:	48 89 fb             	mov    rbx,rdi
      cea181:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cea188:	00 00 
      cea18a:	48 89 84 24 30 04 00 	mov    QWORD PTR [rsp+0x430],rax
      cea191:	00 
      cea192:	83 7f 18 00          	cmp    DWORD PTR [rdi+0x18],0x0
      cea196:	74 10                	je     cea1a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237148>
      cea198:	45 31 ed             	xor    r13d,r13d
      cea19b:	80 bb 90 00 00 00 00 	cmp    BYTE PTR [rbx+0x90],0x0
      cea1a2:	0f 84 77 09 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea1a8:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
      cea1ad:	44 89 44 24 0c       	mov    DWORD PTR [rsp+0xc],r8d
      cea1b2:	0f 10 41 68          	movups xmm0,XMMWORD PTR [rcx+0x68]
      cea1b6:	0f 29 84 24 20 04 00 	movaps XMMWORD PTR [rsp+0x420],xmm0
      cea1bd:	00 
      cea1be:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea1c5:	00 
      cea1c6:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea1c9:	49 89 cd             	mov    r13,rcx
      cea1cc:	f3 0f 6f 41 68       	movdqu xmm0,XMMWORD PTR [rcx+0x68]
      cea1d1:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea1d6:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea1da:	6a ff                	push   0xffffffffffffffff
      cea1dc:	5a                   	pop    rdx
      cea1dd:	31 ff                	xor    edi,edi
      cea1df:	e8 d0 30 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea1e4:	4c 8d b4 24 88 04 00 	lea    r14,[rsp+0x488]
      cea1eb:	00 
      cea1ec:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      cea1f0:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea1f7:	00 
      cea1f8:	e8 93 3c b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea1fd:	f3 41 0f 6f 87 18 01 	movdqu xmm0,XMMWORD PTR [r15+0x118]
      cea204:	00 00 
      cea206:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      cea20b:	41 8a 56 10          	mov    dl,BYTE PTR [r14+0x10]
      cea20f:	84 d2                	test   dl,dl
      cea211:	74 0d                	je     cea220 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2371c0>
      cea213:	48 8d 43 70          	lea    rax,[rbx+0x70]
      cea217:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea21c:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      cea220:	4d 8d b7 18 01 00 00 	lea    r14,[r15+0x118]
      cea227:	41 8b 34 24          	mov    esi,DWORD PTR [r12]
      cea22b:	85 f6                	test   esi,esi
      cea22d:	0f 84 e9 00 00 00    	je     cea31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2372bc>
      cea233:	6a 14                	push   0x14
      cea235:	5f                   	pop    rdi
      cea236:	e8 13 2f 84 00       	call   152d14e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3726d2>
      cea23b:	80 bb 90 00 00 00 00 	cmp    BYTE PTR [rbx+0x90],0x0
      cea242:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea247:	66 0f 6f c8          	movdqa xmm1,xmm0
      cea24b:	74 08                	je     cea255 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2371f5>
      cea24d:	66 0f 6f 8b 80 00 00 	movdqa xmm1,XMMWORD PTR [rbx+0x80]
      cea254:	00 
      cea255:	74 0c                	je     cea263 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237203>
      cea257:	c6 83 90 00 00 00 00 	mov    BYTE PTR [rbx+0x90],0x0
      cea25e:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea263:	66 49 0f 3a 16 ce 01 	pextrq r14,xmm1,0x1
      cea26a:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      cea270:	66 49 0f 7e cc       	movq   r12,xmm1
      cea275:	66 48 0f 7e c7       	movq   rdi,xmm0
      cea27a:	66 48 0f 3a 16 c6 01 	pextrq rsi,xmm0,0x1
      cea281:	4c 89 e2             	mov    rdx,r12
      cea284:	4c 89 f1             	mov    rcx,r14
      cea287:	e8 be f4 fe ff       	call   cd974a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2266ea>
      cea28c:	45 31 ed             	xor    r13d,r13d
      cea28f:	84 c0                	test   al,al
      cea291:	0f 84 88 08 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea297:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea29e:	00 
      cea29f:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea2a2:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea2a9:	00 00 
      cea2ab:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea2b0:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea2b4:	6a 01                	push   0x1
      cea2b6:	5f                   	pop    rdi
      cea2b7:	6a ff                	push   0xffffffffffffffff
      cea2b9:	5a                   	pop    rdx
      cea2ba:	e8 f5 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea2bf:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
      cea2c6:	00 
      cea2c7:	4c 89 ef             	mov    rdi,r13
      cea2ca:	e8 c1 3b b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea2cf:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      cea2d5:	66 0f 7f 43 70       	movdqa XMMWORD PTR [rbx+0x70],xmm0
      cea2da:	49 8b af 18 01 00 00 	mov    rbp,QWORD PTR [r15+0x118]
      cea2e1:	4d 8b bf 20 01 00 00 	mov    r15,QWORD PTR [r15+0x120]
      cea2e8:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
      cea2ef:	e8 6e 01 d9 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cea2f4:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      cea2f8:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
      cea2fc:	6a 01                	push   0x1
      cea2fe:	41 59                	pop    r9
      cea300:	48 89 df             	mov    rdi,rbx
      cea303:	4c 89 e6             	mov    rsi,r12
      cea306:	4c 89 f2             	mov    rdx,r14
      cea309:	48 89 e9             	mov    rcx,rbp
      cea30c:	4d 89 f8             	mov    r8,r15
      cea30f:	e8 ca 16 00 00       	call   ceb9de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23897e>
      cea314:	41 89 c5             	mov    r13d,eax
      cea317:	e9 03 08 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea31c:	80 7b 69 00          	cmp    BYTE PTR [rbx+0x69],0x0
      cea320:	74 40                	je     cea362 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237302>
      cea322:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea329:	00 
      cea32a:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea32d:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea334:	00 00 
      cea336:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea33b:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea33f:	6a 04                	push   0x4
      cea341:	5f                   	pop    rdi
      cea342:	6a ff                	push   0xffffffffffffffff
      cea344:	5a                   	pop    rdx
      cea345:	e8 6a 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea34a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea351:	00 
      cea352:	e8 39 3b b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea357:	41 bd 48 1f 00 00    	mov    r13d,0x1f48
      cea35d:	e9 bd 07 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea362:	88 54 24 0b          	mov    BYTE PTR [rsp+0xb],dl
      cea366:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
      cea36b:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
      cea370:	45 31 e4             	xor    r12d,r12d
      cea373:	44 88 a4 24 64 02 00 	mov    BYTE PTR [rsp+0x264],r12b
      cea37a:	00 
      cea37b:	44 88 a4 24 68 02 00 	mov    BYTE PTR [rsp+0x268],r12b
      cea382:	00 
      cea383:	44 88 a4 24 b8 02 00 	mov    BYTE PTR [rsp+0x2b8],r12b
      cea38a:	00 
      cea38b:	44 88 a4 24 f0 02 00 	mov    BYTE PTR [rsp+0x2f0],r12b
      cea392:	00 
      cea393:	44 88 a4 24 f8 02 00 	mov    BYTE PTR [rsp+0x2f8],r12b
      cea39a:	00 
      cea39b:	44 88 a4 24 10 03 00 	mov    BYTE PTR [rsp+0x310],r12b
      cea3a2:	00 
      cea3a3:	44 88 a4 24 18 03 00 	mov    BYTE PTR [rsp+0x318],r12b
      cea3aa:	00 
      cea3ab:	44 88 a4 24 30 03 00 	mov    BYTE PTR [rsp+0x330],r12b
      cea3b2:	00 
      cea3b3:	44 88 a4 24 38 03 00 	mov    BYTE PTR [rsp+0x338],r12b
      cea3ba:	00 
      cea3bb:	44 88 a4 24 50 03 00 	mov    BYTE PTR [rsp+0x350],r12b
      cea3c2:	00 
      cea3c3:	44 88 a4 24 58 03 00 	mov    BYTE PTR [rsp+0x358],r12b
      cea3ca:	00 
      cea3cb:	44 88 a4 24 68 03 00 	mov    BYTE PTR [rsp+0x368],r12b
      cea3d2:	00 
      cea3d3:	44 88 a4 24 6c 03 00 	mov    BYTE PTR [rsp+0x36c],r12b
      cea3da:	00 
      cea3db:	44 88 a4 24 70 03 00 	mov    BYTE PTR [rsp+0x370],r12b
      cea3e2:	00 
      cea3e3:	44 88 a4 24 78 03 00 	mov    BYTE PTR [rsp+0x378],r12b
      cea3ea:	00 
      cea3eb:	44 88 a4 24 90 03 00 	mov    BYTE PTR [rsp+0x390],r12b
      cea3f2:	00 
      cea3f3:	44 88 a4 24 98 03 00 	mov    BYTE PTR [rsp+0x398],r12b
      cea3fa:	00 
      cea3fb:	44 88 a4 24 18 04 00 	mov    BYTE PTR [rsp+0x418],r12b
      cea402:	00 
      cea403:	ba 94 00 00 00       	mov    edx,0x94
      cea408:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea40f:	00 
      cea410:	31 f6                	xor    esi,esi
      cea412:	e8 79 47 b0 00       	call   17eeb90 <memset@plt>
      cea417:	66 0f ef c0          	pxor   xmm0,xmm0
      cea41b:	f3 0f 7f 84 24 18 01 	movdqu XMMWORD PTR [rsp+0x118],xmm0
      cea422:	00 00 
      cea424:	f3 0f 7f 84 24 28 01 	movdqu XMMWORD PTR [rsp+0x128],xmm0
      cea42b:	00 00 
      cea42d:	f3 0f 7f 84 24 38 01 	movdqu XMMWORD PTR [rsp+0x138],xmm0
      cea434:	00 00 
      cea436:	83 a4 24 48 01 00 00 	and    DWORD PTR [rsp+0x148],0x0
      cea43d:	00 
      cea43e:	f3 0f 7f 84 24 50 01 	movdqu XMMWORD PTR [rsp+0x150],xmm0
      cea445:	00 00 
      cea447:	f3 0f 7f 84 24 60 01 	movdqu XMMWORD PTR [rsp+0x160],xmm0
      cea44e:	00 00 
      cea450:	f3 0f 7f 84 24 70 01 	movdqu XMMWORD PTR [rsp+0x170],xmm0
      cea457:	00 00 
      cea459:	f3 0f 7f 84 24 80 01 	movdqu XMMWORD PTR [rsp+0x180],xmm0
      cea460:	00 00 
      cea462:	f3 0f 7f 84 24 90 01 	movdqu XMMWORD PTR [rsp+0x190],xmm0
      cea469:	00 00 
      cea46b:	f3 0f 7f 84 24 a0 01 	movdqu XMMWORD PTR [rsp+0x1a0],xmm0
      cea472:	00 00 
      cea474:	f3 0f 7f 84 24 a9 01 	movdqu XMMWORD PTR [rsp+0x1a9],xmm0
      cea47b:	00 00 
      cea47d:	f3 0f 7f 84 24 c0 01 	movdqu XMMWORD PTR [rsp+0x1c0],xmm0
      cea484:	00 00 
      cea486:	f3 0f 7f 84 24 cc 01 	movdqu XMMWORD PTR [rsp+0x1cc],xmm0
      cea48d:	00 00 
      cea48f:	f3 0f 7f 84 24 e0 01 	movdqu XMMWORD PTR [rsp+0x1e0],xmm0
      cea496:	00 00 
      cea498:	83 a4 24 ef 01 00 00 	and    DWORD PTR [rsp+0x1ef],0x0
      cea49f:	00 
      cea4a0:	f3 0f 7f 84 24 53 02 	movdqu XMMWORD PTR [rsp+0x253],xmm0
      cea4a7:	00 00 
      cea4a9:	f3 0f 7f 84 24 48 02 	movdqu XMMWORD PTR [rsp+0x248],xmm0
      cea4b0:	00 00 
      cea4b2:	f3 0f 7f 84 24 38 02 	movdqu XMMWORD PTR [rsp+0x238],xmm0
      cea4b9:	00 00 
      cea4bb:	f3 0f 7f 84 24 28 02 	movdqu XMMWORD PTR [rsp+0x228],xmm0
      cea4c2:	00 00 
      cea4c4:	f3 0f 7f 84 24 18 02 	movdqu XMMWORD PTR [rsp+0x218],xmm0
      cea4cb:	00 00 
      cea4cd:	f3 0f 7f 84 24 08 02 	movdqu XMMWORD PTR [rsp+0x208],xmm0
      cea4d4:	00 00 
      cea4d6:	f3 0f 7f 84 24 f8 01 	movdqu XMMWORD PTR [rsp+0x1f8],xmm0
      cea4dd:	00 00 
      cea4df:	44 88 a4 24 a0 02 00 	mov    BYTE PTR [rsp+0x2a0],r12b
      cea4e6:	00 
      cea4e7:	f3 0f 7f 84 24 90 02 	movdqu XMMWORD PTR [rsp+0x290],xmm0
      cea4ee:	00 00 
      cea4f0:	f3 0f 7f 84 24 80 02 	movdqu XMMWORD PTR [rsp+0x280],xmm0
      cea4f7:	00 00 
      cea4f9:	f3 0f 7f 84 24 70 02 	movdqu XMMWORD PTR [rsp+0x270],xmm0
      cea500:	00 00 
      cea502:	f3 0f 7f 84 24 c9 02 	movdqu XMMWORD PTR [rsp+0x2c9],xmm0
      cea509:	00 00 
      cea50b:	f3 0f 7f 84 24 c0 02 	movdqu XMMWORD PTR [rsp+0x2c0],xmm0
      cea512:	00 00 
      cea514:	4d 89 ee             	mov    r14,r13
      cea517:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
      cea51b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cea51e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea523:	31 d2                	xor    edx,edx
      cea525:	ff 50 18             	call   QWORD PTR [rax+0x18]
      cea528:	49 8d 46 68          	lea    rax,[r14+0x68]
      cea52c:	4c 8d ac 24 98 00 00 	lea    r13,[rsp+0x98]
      cea533:	00 
      cea534:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      cea537:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea53c:	41 0f 11 44 24 01    	movups XMMWORD PTR [r12+0x1],xmm0
      cea542:	b0 20                	mov    al,0x20
      cea544:	41 88 04 24          	mov    BYTE PTR [r12],al
      cea548:	31 c0                	xor    eax,eax
      cea54a:	41 88 44 24 11       	mov    BYTE PTR [r12+0x11],al
      cea54f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea556:	00 
      cea557:	4c 89 e6             	mov    rsi,r12
      cea55a:	e8 cf 14 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea55f:	4c 89 e7             	mov    rdi,r12
      cea562:	e8 29 39 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea567:	4c 89 ef             	mov    rdi,r13
      cea56a:	41 c7 45 78 01 00 00 	mov    DWORD PTR [r13+0x78],0x1
      cea571:	00 
      cea572:	4d 89 f5             	mov    r13,r14
      cea575:	f3 41 0f 6f 46 78    	movdqu xmm0,XMMWORD PTR [r14+0x78]
      cea57b:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea582:	b0 20                	mov    al,0x20
      cea584:	41 88 04 24          	mov    BYTE PTR [r12],al
      cea588:	31 c0                	xor    eax,eax
      cea58a:	41 88 44 24 11       	mov    BYTE PTR [r12+0x11],al
      cea58f:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea594:	4c 89 e6             	mov    rsi,r12
      cea597:	e8 92 14 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea59c:	4c 89 e7             	mov    rdi,r12
      cea59f:	e8 ec 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea5a4:	41 0f b6 47 18       	movzx  eax,BYTE PTR [r15+0x18]
      cea5a9:	a8 01                	test   al,0x1
      cea5ab:	74 06                	je     cea5b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237553>
      cea5ad:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      cea5b1:	eb 02                	jmp    cea5b5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237555>
      cea5b3:	d1 e8                	shr    eax,1
      cea5b5:	48 85 c0             	test   rax,rax
      cea5b8:	4d 89 ee             	mov    r14,r13
      cea5bb:	74 10                	je     cea5cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23756d>
      cea5bd:	49 8d 77 18          	lea    rsi,[r15+0x18]
      cea5c1:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5c6:	e8 75 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea5cb:	eb 11                	jmp    cea5de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23757e>
      cea5cd:	48 8d 35 44 76 76 ff 	lea    rsi,[rip+0xffffffffff767644]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      cea5d4:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5d9:	e8 a0 f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea5de:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      cea5e5:	00 
      cea5e6:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea5eb:	e8 90 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea5f0:	4c 8d a4 24 e0 00 00 	lea    r12,[rsp+0xe0]
      cea5f7:	00 
      cea5f8:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5fd:	e8 8e 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea602:	4c 89 e7             	mov    rdi,r12
      cea605:	48 89 ee             	mov    rsi,rbp
      cea608:	e8 73 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea60d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea612:	48 89 ee             	mov    rsi,rbp
      cea615:	e8 d4 50 db ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      cea61a:	84 c0                	test   al,al
      cea61c:	74 13                	je     cea631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375d1>
      cea61e:	48 8d 35 57 79 76 ff 	lea    rsi,[rip+0xffffffffff767957]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cea625:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea62a:	e8 4f f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea62f:	eb 0f                	jmp    cea640 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375e0>
      cea631:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea636:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      cea63b:	e8 00 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea640:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
      cea647:	00 
      cea648:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea64d:	e8 2e 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea652:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea657:	e8 34 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea65c:	49 8d b7 b0 08 00 00 	lea    rsi,[r15+0x8b0]
      cea663:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea668:	b9 00 04 00 00       	mov    ecx,0x400
      cea66d:	31 d2                	xor    edx,edx
      cea66f:	e8 b0 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea674:	bd 98 00 00 00       	mov    ebp,0x98
      cea679:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea680:	00 
      cea681:	48 01 ef             	add    rdi,rbp
      cea684:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea689:	4c 89 e6             	mov    rsi,r12
      cea68c:	e8 9d 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea691:	4c 89 e7             	mov    rdi,r12
      cea694:	e8 f7 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea699:	49 8d 77 48          	lea    rsi,[r15+0x48]
      cea69d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea6a2:	b9 00 04 00 00       	mov    ecx,0x400
      cea6a7:	31 d2                	xor    edx,edx
      cea6a9:	e8 76 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea6ae:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      cea6b5:	00 
      cea6b6:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea6bb:	4c 89 e6             	mov    rsi,r12
      cea6be:	e8 6b 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea6c3:	4c 89 e7             	mov    rdi,r12
      cea6c6:	e8 c5 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea6cb:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
      cea6d2:	e8 8b fd d8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cea6d7:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      cea6de:	00 
      cea6df:	48 89 47 80          	mov    QWORD PTR [rdi-0x80],rax
      cea6e3:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      cea6e8:	e8 73 da e5 ff       	call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
      cea6ed:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
      cea6f4:	00 
      cea6f5:	49 8d b7 e0 08 00 00 	lea    rsi,[r15+0x8e0]
      cea6fc:	e8 59 ad de ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
      cea701:	41 8b 87 2c 01 00 00 	mov    eax,DWORD PTR [r15+0x12c]
      cea708:	a9 fb ff ff ff       	test   eax,0xfffffffb
      cea70d:	75 07                	jne    cea716 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376b6>
      cea70f:	89 84 24 48 01 00 00 	mov    DWORD PTR [rsp+0x148],eax
      cea716:	41 0f b6 87 98 00 00 	movzx  eax,BYTE PTR [r15+0x98]
      cea71d:	00 
      cea71e:	a8 01                	test   al,0x1
      cea720:	74 09                	je     cea72b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376cb>
      cea722:	49 8b 87 a0 00 00 00 	mov    rax,QWORD PTR [r15+0xa0]
      cea729:	eb 02                	jmp    cea72d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376cd>
      cea72b:	d1 e8                	shr    eax,1
      cea72d:	48 85 c0             	test   rax,rax
      cea730:	74 12                	je     cea744 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376e4>
      cea732:	4c 01 fd             	add    rbp,r15
      cea735:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea73a:	48 89 ee             	mov    rsi,rbp
      cea73d:	e8 fe 37 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea742:	eb 11                	jmp    cea755 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376f5>
      cea744:	48 8d 35 cd cb 64 ff 	lea    rsi,[rip+0xffffffffff64cbcd]        # 337318 <_ZTSSt12bad_any_cast@@Base-0x58eb0>
      cea74b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea750:	e8 29 f3 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea755:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      cea75c:	00 
      cea75d:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea762:	e8 19 39 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea767:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea76c:	e8 1f 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea771:	49 81 c6 98 00 00 00 	add    r14,0x98
      cea778:	48 8d 35 69 f3 74 ff 	lea    rsi,[rip+0xffffffffff74f369]        # 439ae8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f537>
      cea77f:	4c 89 f7             	mov    rdi,r14
      cea782:	e8 e5 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea787:	48 85 c0             	test   rax,rax
      cea78a:	74 10                	je     cea79c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23773c>
      cea78c:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      cea793:	00 
      cea794:	48 89 c6             	mov    rsi,rax
      cea797:	e8 e4 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea79c:	48 8d 35 2d f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32d]        # 439ad0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f51f>
      cea7a3:	4c 89 f7             	mov    rdi,r14
      cea7a6:	e8 c1 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7ab:	48 85 c0             	test   rax,rax
      cea7ae:	74 10                	je     cea7c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237760>
      cea7b0:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      cea7b7:	00 
      cea7b8:	48 89 c6             	mov    rsi,rax
      cea7bb:	e8 c0 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7c0:	48 8d 35 91 63 d0 00 	lea    rsi,[rip+0xd06391]        # 19f0b58 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2288>
      cea7c7:	4c 89 f7             	mov    rdi,r14
      cea7ca:	e8 9d 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7cf:	48 85 c0             	test   rax,rax
      cea7d2:	74 10                	je     cea7e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237784>
      cea7d4:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
      cea7db:	00 
      cea7dc:	48 89 c6             	mov    rsi,rax
      cea7df:	e8 9c 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7e4:	41 80 bf 18 09 00 00 	cmp    BYTE PTR [r15+0x918],0x0
      cea7eb:	00 
      cea7ec:	74 14                	je     cea802 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377a2>
      cea7ee:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
      cea7f5:	00 
      cea7f6:	49 8d b7 00 09 00 00 	lea    rsi,[r15+0x900]
      cea7fd:	e8 7e 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea802:	48 8d 35 2f f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32f]        # 439b38 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f587>
      cea809:	4c 89 f7             	mov    rdi,r14
      cea80c:	e8 5b 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea811:	48 85 c0             	test   rax,rax
      cea814:	74 10                	je     cea826 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377c6>
      cea816:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      cea81d:	00 
      cea81e:	48 89 c6             	mov    rsi,rax
      cea821:	e8 5a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea826:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
      cea82d:	00 
      cea82e:	4c 89 fe             	mov    rsi,r15
      cea831:	e8 4a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea836:	4c 8d ac 24 70 04 00 	lea    r13,[rsp+0x470]
      cea83d:	00 
      cea83e:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      cea842:	e8 ef 0f d9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      cea847:	48 89 c7             	mov    rdi,rax
      cea84a:	48 89 d6             	mov    rsi,rdx
      cea84d:	e8 1b 17 84 00       	call   152bf6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3714f1>
      cea852:	89 84 24 b0 01 00 00 	mov    DWORD PTR [rsp+0x1b0],eax
      cea859:	41 8a 87 b4 00 00 00 	mov    al,BYTE PTR [r15+0xb4]
      cea860:	88 84 24 b4 01 00 00 	mov    BYTE PTR [rsp+0x1b4],al
      cea867:	41 0f b6 87 b5 00 00 	movzx  eax,BYTE PTR [r15+0xb5]
      cea86e:	00 
      cea86f:	b9 00 01 00 00       	mov    ecx,0x100
      cea874:	09 c8                	or     eax,ecx
      cea876:	66 89 84 24 b5 01 00 	mov    WORD PTR [rsp+0x1b5],ax
      cea87d:	00 
      cea87e:	41 0f b6 87 b6 00 00 	movzx  eax,BYTE PTR [r15+0xb6]
      cea885:	00 
      cea886:	09 c8                	or     eax,ecx
      cea888:	66 89 84 24 b7 01 00 	mov    WORD PTR [rsp+0x1b7],ax
      cea88f:	00 
      cea890:	41 80 7d 14 00       	cmp    BYTE PTR [r13+0x14],0x0
      cea895:	74 3e                	je     cea8d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237875>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea8a3:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea8a8:	41 89 44 24 11       	mov    DWORD PTR [r12+0x11],eax
      cea8ad:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      cea8b3:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea8ba:	41 c6 04 24 28       	mov    BYTE PTR [r12],0x28
      cea8bf:	41 c6 44 24 15 00    	mov    BYTE PTR [r12+0x15],0x0
      cea8c5:	4c 89 e6             	mov    rsi,r12
      cea8c8:	e8 61 11 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea8cd:	4c 89 e7             	mov    rdi,r12
      cea8d0:	e8 bb 35 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea8d5:	4d 89 f5             	mov    r13,r14
      cea8d8:	83 a4 24 d8 01 00 00 	and    DWORD PTR [rsp+0x1d8],0x0
      cea8df:	00 
      cea8e0:	49 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [r15+0xb8]
      cea8e7:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      cea8ee:	00 
      cea8ef:	49 69 87 18 01 00 00 	imul   rax,QWORD PTR [r15+0x118],0x3e8
      cea8f6:	e8 03 00 00 
      cea8fa:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
      cea8ff:	f2 49 0f 2a 8f 20 01 	cvtsi2sd xmm1,QWORD PTR [r15+0x120]
      cea906:	00 00 
      cea908:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea90c:	e8 ff 63 b0 00       	call   17f0d10 <llround@plt>
      cea911:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
      cea918:	00 
      cea919:	80 7b 60 00          	cmp    BYTE PTR [rbx+0x60],0x0
      cea91d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      cea922:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      cea926:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
      cea92b:	75 04                	jne    cea931 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2378d1>
      cea92d:	c6 43 60 01          	mov    BYTE PTR [rbx+0x60],0x1
      cea931:	4c 8d bc 24 88 02 00 	lea    r15,[rsp+0x288]
      cea938:	00 
      cea939:	80 7c 24 0b 00       	cmp    BYTE PTR [rsp+0xb],0x0
      cea93e:	48 8d 8c 24 88 04 00 	lea    rcx,[rsp+0x488]
      cea945:	00 
      cea946:	74 35                	je     cea97d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23791d>
      cea948:	48 69 01 e8 03 00 00 	imul   rax,QWORD PTR [rcx],0x3e8
      cea94f:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
      cea954:	4c 8d 63 50          	lea    r12,[rbx+0x50]
      cea958:	f2 48 0f 2a 49 08    	cvtsi2sd xmm1,QWORD PTR [rcx+0x8]
      cea95e:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea962:	49 89 ce             	mov    r14,rcx
      cea965:	e8 a6 63 b0 00       	call   17f0d10 <llround@plt>
      cea96a:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
      cea971:	00 
      cea972:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea977:	f3 41 0f 7f 04 24    	movdqu XMMWORD PTR [r12],xmm0
      cea97d:	c6 84 24 f0 01 00 00 	mov    BYTE PTR [rsp+0x1f0],0x0
      cea984:	00 
      cea985:	8b 44 24 0c          	mov    eax,DWORD PTR [rsp+0xc]
      cea989:	88 84 24 f1 01 00 00 	mov    BYTE PTR [rsp+0x1f1],al
      cea990:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      cea994:	8a 00                	mov    al,BYTE PTR [rax]
      cea996:	24 01                	and    al,0x1
      cea998:	88 84 24 f2 01 00 00 	mov    BYTE PTR [rsp+0x1f2],al
      cea99f:	48 8d b3 b8 03 00 00 	lea    rsi,[rbx+0x3b8]
      cea9a6:	4c 89 ff             	mov    rdi,r15
      cea9a9:	e8 d2 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9ae:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14
      ceaa08:	e8 5f 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      ceaa0d:	48 85 c0             	test   rax,rax
      ceaa10:	74 10                	je     ceaa22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2379c2>
      ceaa12:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
      ceaa19:	00 
      ceaa1a:	48 89 c6             	mov    rsi,rax
      ceaa1d:	e8 18 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      ceaa22:	31 c0                	xor    eax,eax
      ceaa24:	88 84 24 62 02 00 00 	mov    BYTE PTR [rsp+0x262],al
      ceaa2b:	c7 84 24 6c 03 00 00 	mov    DWORD PTR [rsp+0x36c],0x2
      ceaa32:	02 00 00 00 
      ceaa36:	c6 84 24 70 03 00 00 	mov    BYTE PTR [rsp+0x370],0x1
      ceaa3d:	01 
      ceaa3e:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ceaa43:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaa46:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaa4d:	00 00 
      ceaa4f:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaa54:	88 46 11             	mov    BYTE PTR [rsi+0x11],al
      ceaa57:	6a 02                	push   0x2
      ceaa59:	5f                   	pop    rdi
      ceaa5a:	6a ff                	push   0xffffffffffffffff
      ceaa5c:	5a                   	pop    rdx
      ceaa5d:	e8 52 28 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      ceab3d:	44 89 e8             	mov    eax,r13d
      ceab40:	48 81 c4 38 04 00 00 	add    rsp,0x438
      ceab47:	5b                   	pop    rbx
      ceab48:	41 5c                	pop    r12
      ceab4a:	41 5d                	pop    r13
      ceab4c:	41 5e                	pop    r14
      ceab4e:	41 5f                	pop    r15
      ceab50:	5d                   	pop    rbp
      ceab51:	c3                   	ret
      ceab52:	48 89 c3             	mov    rbx,rax
      ceab55:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceab5a:	eb 28                	jmp    ceab84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b24>
      ceab5c:	eb 38                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab5e:	eb 36                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab60:	eb 34                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab62:	eb 32                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab64:	eb 30                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab66:	eb 2e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab68:	eb 2c                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6a:	eb 2a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6c:	eb 0e                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab6e:	eb 0c                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab70:	eb 24                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab72:	eb 22                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab74:	eb 20                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab76:	eb 1e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab78:	eb 02                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab7a:	eb 1a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab7c:	48 89 c3             	mov    rbx,rax
      ceab7f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceab84:	e8 07 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab89:	eb 0e                	jmp    ceab99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b39>
      ceab8b:	eb 09                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab8d:	48 89 c3             	mov    rbx,rax
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx
      ceabd8:	e8 f3 50 d8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceabdd:	e8 ce 4e b0 00       	call   17efab0 <__stack_chk_fail@plt>

## Stack object references at key source offsets
### +0x8
- 0xcea1be: lea    rsi,[rsp+0x80]
      cea1a2:	0f 84 77 09 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea1a8:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
      cea1ad:	44 89 44 24 0c       	mov    DWORD PTR [rsp+0xc],r8d
      cea1b2:	0f 10 41 68          	movups xmm0,XMMWORD PTR [rcx+0x68]
      cea1b6:	0f 29 84 24 20 04 00 	movaps XMMWORD PTR [rsp+0x420],xmm0
      cea1bd:	00 
      cea1be:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea1c5:	00 
      cea1c6:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea1c9:	49 89 cd             	mov    r13,rcx
      cea1cc:	f3 0f 6f 41 68       	movdqu xmm0,XMMWORD PTR [rcx+0x68]
      cea1d1:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea1d6:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea1da:	6a ff                	push   0xffffffffffffffff
      cea1dc:	5a                   	pop    rdx
      cea1dd:	31 ff                	xor    edi,edi
      cea1df:	e8 d0 30 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
- 0xcea1f0: lea    rdi,[rsp+0x80]
      cea1dc:	5a                   	pop    rdx
      cea1dd:	31 ff                	xor    edi,edi
      cea1df:	e8 d0 30 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea1e4:	4c 8d b4 24 88 04 00 	lea    r14,[rsp+0x488]
      cea1eb:	00 
      cea1ec:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      cea1f0:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea1f7:	00 
      cea1f8:	e8 93 3c b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea1fd:	f3 41 0f 6f 87 18 01 	movdqu xmm0,XMMWORD PTR [r15+0x118]
      cea204:	00 00 
      cea206:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      cea20b:	41 8a 56 10          	mov    dl,BYTE PTR [r14+0x10]
      cea20f:	84 d2                	test   dl,dl
      cea211:	74 0d                	je     cea220 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2371c0>
      cea213:	48 8d 43 70          	lea    rax,[rbx+0x70]
      cea217:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
- 0xcea297: lea    rsi,[rsp+0x80]
      cea281:	4c 89 e2             	mov    rdx,r12
      cea284:	4c 89 f1             	mov    rcx,r14
      cea287:	e8 be f4 fe ff       	call   cd974a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2266ea>
      cea28c:	45 31 ed             	xor    r13d,r13d
      cea28f:	84 c0                	test   al,al
      cea291:	0f 84 88 08 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea297:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea29e:	00 
      cea29f:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea2a2:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea2a9:	00 00 
      cea2ab:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea2b0:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea2b4:	6a 01                	push   0x1
      cea2b6:	5f                   	pop    rdi
      cea2b7:	6a ff                	push   0xffffffffffffffff
      cea2b9:	5a                   	pop    rdx
- 0xcea2bf: lea    r13,[rsp+0x80]
      cea2b0:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea2b4:	6a 01                	push   0x1
      cea2b6:	5f                   	pop    rdi
      cea2b7:	6a ff                	push   0xffffffffffffffff
      cea2b9:	5a                   	pop    rdx
      cea2ba:	e8 f5 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea2bf:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
      cea2c6:	00 
      cea2c7:	4c 89 ef             	mov    rdi,r13
      cea2ca:	e8 c1 3b b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea2cf:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      cea2d5:	66 0f 7f 43 70       	movdqa XMMWORD PTR [rbx+0x70],xmm0
      cea2da:	49 8b af 18 01 00 00 	mov    rbp,QWORD PTR [r15+0x118]
      cea2e1:	4d 8b bf 20 01 00 00 	mov    r15,QWORD PTR [r15+0x120]
      cea2e8:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
      cea2ef:	e8 6e 01 d9 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cea2f4:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
- 0xcea322: lea    rsi,[rsp+0x80]
      cea30c:	4d 89 f8             	mov    r8,r15
      cea30f:	e8 ca 16 00 00       	call   ceb9de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23897e>
      cea314:	41 89 c5             	mov    r13d,eax
      cea317:	e9 03 08 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea31c:	80 7b 69 00          	cmp    BYTE PTR [rbx+0x69],0x0
      cea320:	74 40                	je     cea362 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237302>
      cea322:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea329:	00 
      cea32a:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea32d:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea334:	00 00 
      cea336:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea33b:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea33f:	6a 04                	push   0x4
      cea341:	5f                   	pop    rdi
      cea342:	6a ff                	push   0xffffffffffffffff
      cea344:	5a                   	pop    rdx
- 0xcea34a: lea    rdi,[rsp+0x80]
      cea33b:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea33f:	6a 04                	push   0x4
      cea341:	5f                   	pop    rdi
      cea342:	6a ff                	push   0xffffffffffffffff
      cea344:	5a                   	pop    rdx
      cea345:	e8 6a 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea34a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea351:	00 
      cea352:	e8 39 3b b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea357:	41 bd 48 1f 00 00    	mov    r13d,0x1f48
      cea35d:	e9 bd 07 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea362:	88 54 24 0b          	mov    BYTE PTR [rsp+0xb],dl
      cea366:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
      cea36b:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
      cea370:	45 31 e4             	xor    r12d,r12d
      cea373:	44 88 a4 24 64 02 00 	mov    BYTE PTR [rsp+0x264],r12b
      cea37a:	00 
- 0xcea408: lea    rdi,[rsp+0x80]
      cea3f2:	00 
      cea3f3:	44 88 a4 24 98 03 00 	mov    BYTE PTR [rsp+0x398],r12b
      cea3fa:	00 
      cea3fb:	44 88 a4 24 18 04 00 	mov    BYTE PTR [rsp+0x418],r12b
      cea402:	00 
      cea403:	ba 94 00 00 00       	mov    edx,0x94
      cea408:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea40f:	00 
      cea410:	31 f6                	xor    esi,esi
      cea412:	e8 79 47 b0 00       	call   17eeb90 <memset@plt>
      cea417:	66 0f ef c0          	pxor   xmm0,xmm0
      cea41b:	f3 0f 7f 84 24 18 01 	movdqu XMMWORD PTR [rsp+0x118],xmm0
      cea422:	00 00 
      cea424:	f3 0f 7f 84 24 28 01 	movdqu XMMWORD PTR [rsp+0x128],xmm0
      cea42b:	00 00 
      cea42d:	f3 0f 7f 84 24 38 01 	movdqu XMMWORD PTR [rsp+0x138],xmm0
      cea434:	00 00 
- 0xcea54f: lea    rdi,[rsp+0x80]
      cea537:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea53c:	41 0f 11 44 24 01    	movups XMMWORD PTR [r12+0x1],xmm0
      cea542:	b0 20                	mov    al,0x20
      cea544:	41 88 04 24          	mov    BYTE PTR [r12],al
      cea548:	31 c0                	xor    eax,eax
      cea54a:	41 88 44 24 11       	mov    BYTE PTR [r12+0x11],al
      cea54f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea556:	00 
      cea557:	4c 89 e6             	mov    rsi,r12
      cea55a:	e8 cf 14 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea55f:	4c 89 e7             	mov    rdi,r12
      cea562:	e8 29 39 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea567:	4c 89 ef             	mov    rdi,r13
      cea56a:	41 c7 45 78 01 00 00 	mov    DWORD PTR [r13+0x78],0x1
      cea571:	00 
      cea572:	4d 89 f5             	mov    r13,r14
      cea575:	f3 41 0f 6f 46 78    	movdqu xmm0,XMMWORD PTR [r14+0x78]
- 0xcea679: lea    rdi,[rsp+0x80]
      cea65c:	49 8d b7 b0 08 00 00 	lea    rsi,[r15+0x8b0]
      cea663:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea668:	b9 00 04 00 00       	mov    ecx,0x400
      cea66d:	31 d2                	xor    edx,edx
      cea66f:	e8 b0 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea674:	bd 98 00 00 00       	mov    ebp,0x98
      cea679:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea680:	00 
      cea681:	48 01 ef             	add    rdi,rbp
      cea684:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea689:	4c 89 e6             	mov    rsi,r12
      cea68c:	e8 9d 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea691:	4c 89 e7             	mov    rdi,r12
      cea694:	e8 f7 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea699:	49 8d 77 48          	lea    rsi,[r15+0x48]
      cea69d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea6a2:	b9 00 04 00 00       	mov    ecx,0x400
- 0xceaa78: lea    rdx,[rsp+0x80]
      ceaa5d:	e8 52 28 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0xceaaa7: lea    rdi,[rsp+0x80]
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
- 0xceab12: lea    rdi,[rsp+0x80]
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      ceab3d:	44 89 e8             	mov    eax,r13d
      ceab40:	48 81 c4 38 04 00 00 	add    rsp,0x438
- 0xceaba3: lea    rdi,[rsp+0x80]
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
- 0xceabb5: lea    rdi,[rsp+0x80]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx
      ceabd8:	e8 f3 50 d8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceabdd:	e8 ce 4e b0 00       	call   17efab0 <__stack_chk_fail@plt>

### +0x10
- 0xcea1a8: mov    QWORD PTR [rsp+0x10],r9
      cea191:	00 
      cea192:	83 7f 18 00          	cmp    DWORD PTR [rdi+0x18],0x0
      cea196:	74 10                	je     cea1a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237148>
      cea198:	45 31 ed             	xor    r13d,r13d
      cea19b:	80 bb 90 00 00 00 00 	cmp    BYTE PTR [rbx+0x90],0x0
      cea1a2:	0f 84 77 09 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea1a8:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
      cea1ad:	44 89 44 24 0c       	mov    DWORD PTR [rsp+0xc],r8d
      cea1b2:	0f 10 41 68          	movups xmm0,XMMWORD PTR [rcx+0x68]
      cea1b6:	0f 29 84 24 20 04 00 	movaps XMMWORD PTR [rsp+0x420],xmm0
      cea1bd:	00 
      cea1be:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea1c5:	00 
      cea1c6:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea1c9:	49 89 cd             	mov    r13,rcx
      cea1cc:	f3 0f 6f 41 68       	movdqu xmm0,XMMWORD PTR [rcx+0x68]
      cea1d1:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
- 0xcea26a: movdqa XMMWORD PTR [rsp+0x10],xmm1
      cea24d:	66 0f 6f 8b 80 00 00 	movdqa xmm1,XMMWORD PTR [rbx+0x80]
      cea254:	00 
      cea255:	74 0c                	je     cea263 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237203>
      cea257:	c6 83 90 00 00 00 00 	mov    BYTE PTR [rbx+0x90],0x0
      cea25e:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea263:	66 49 0f 3a 16 ce 01 	pextrq r14,xmm1,0x1
      cea26a:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      cea270:	66 49 0f 7e cc       	movq   r12,xmm1
      cea275:	66 48 0f 7e c7       	movq   rdi,xmm0
      cea27a:	66 48 0f 3a 16 c6 01 	pextrq rsi,xmm0,0x1
      cea281:	4c 89 e2             	mov    rdx,r12
      cea284:	4c 89 f1             	mov    rcx,r14
      cea287:	e8 be f4 fe ff       	call   cd974a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2266ea>
      cea28c:	45 31 ed             	xor    r13d,r13d
      cea28f:	84 c0                	test   al,al
      cea291:	0f 84 88 08 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea297:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
- 0xcea2cf: movdqa xmm0,XMMWORD PTR [rsp+0x10]
      cea2b9:	5a                   	pop    rdx
      cea2ba:	e8 f5 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea2bf:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
      cea2c6:	00 
      cea2c7:	4c 89 ef             	mov    rdi,r13
      cea2ca:	e8 c1 3b b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea2cf:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      cea2d5:	66 0f 7f 43 70       	movdqa XMMWORD PTR [rbx+0x70],xmm0
      cea2da:	49 8b af 18 01 00 00 	mov    rbp,QWORD PTR [r15+0x118]
      cea2e1:	4d 8b bf 20 01 00 00 	mov    r15,QWORD PTR [r15+0x120]
      cea2e8:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
      cea2ef:	e8 6e 01 d9 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cea2f4:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      cea2f8:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
      cea2fc:	6a 01                	push   0x1
      cea2fe:	41 59                	pop    r9
      cea300:	48 89 df             	mov    rdi,rbx
- 0xcea6e3: mov    rsi,QWORD PTR [rsp+0x10]
      cea6c6:	e8 c5 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea6cb:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
      cea6d2:	e8 8b fd d8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cea6d7:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      cea6de:	00 
      cea6df:	48 89 47 80          	mov    QWORD PTR [rdi-0x80],rax
      cea6e3:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      cea6e8:	e8 73 da e5 ff       	call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
      cea6ed:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
      cea6f4:	00 
      cea6f5:	49 8d b7 e0 08 00 00 	lea    rsi,[r15+0x8e0]
      cea6fc:	e8 59 ad de ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
      cea701:	41 8b 87 2c 01 00 00 	mov    eax,DWORD PTR [r15+0x12c]
      cea708:	a9 fb ff ff ff       	test   eax,0xfffffffb
      cea70d:	75 07                	jne    cea716 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376b6>
      cea70f:	89 84 24 48 01 00 00 	mov    DWORD PTR [rsp+0x148],eax
      cea716:	41 0f b6 87 98 00 00 	movzx  eax,BYTE PTR [r15+0x98]

### +0x18
- 0xcea459: movdqu XMMWORD PTR [rsp+0x180],xmm0
      cea43e:	f3 0f 7f 84 24 50 01 	movdqu XMMWORD PTR [rsp+0x150],xmm0
      cea445:	00 00 
      cea447:	f3 0f 7f 84 24 60 01 	movdqu XMMWORD PTR [rsp+0x160],xmm0
      cea44e:	00 00 
      cea450:	f3 0f 7f 84 24 70 01 	movdqu XMMWORD PTR [rsp+0x170],xmm0
      cea457:	00 00 
      cea459:	f3 0f 7f 84 24 80 01 	movdqu XMMWORD PTR [rsp+0x180],xmm0
      cea460:	00 00 
      cea462:	f3 0f 7f 84 24 90 01 	movdqu XMMWORD PTR [rsp+0x190],xmm0
      cea469:	00 00 
      cea46b:	f3 0f 7f 84 24 a0 01 	movdqu XMMWORD PTR [rsp+0x1a0],xmm0
      cea472:	00 00 
      cea474:	f3 0f 7f 84 24 a9 01 	movdqu XMMWORD PTR [rsp+0x1a9],xmm0
      cea47b:	00 00 
      cea47d:	f3 0f 7f 84 24 c0 01 	movdqu XMMWORD PTR [rsp+0x1c0],xmm0
      cea484:	00 00 
      cea486:	f3 0f 7f 84 24 cc 01 	movdqu XMMWORD PTR [rsp+0x1cc],xmm0
- 0xcea7b0: lea    rdi,[rsp+0x180]
      cea797:	e8 e4 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea79c:	48 8d 35 2d f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32d]        # 439ad0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f51f>
      cea7a3:	4c 89 f7             	mov    rdi,r14
      cea7a6:	e8 c1 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7ab:	48 85 c0             	test   rax,rax
      cea7ae:	74 10                	je     cea7c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237760>
      cea7b0:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      cea7b7:	00 
      cea7b8:	48 89 c6             	mov    rsi,rax
      cea7bb:	e8 c0 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7c0:	48 8d 35 91 63 d0 00 	lea    rsi,[rip+0xd06391]        # 19f0b58 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2288>
      cea7c7:	4c 89 f7             	mov    rdi,r14
      cea7ca:	e8 9d 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7cf:	48 85 c0             	test   rax,rax
      cea7d2:	74 10                	je     cea7e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237784>
      cea7d4:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
      cea7db:	00 

### +0x20
- 0xcea4cd: movdqu XMMWORD PTR [rsp+0x208],xmm0
      cea4b2:	f3 0f 7f 84 24 38 02 	movdqu XMMWORD PTR [rsp+0x238],xmm0
      cea4b9:	00 00 
      cea4bb:	f3 0f 7f 84 24 28 02 	movdqu XMMWORD PTR [rsp+0x228],xmm0
      cea4c2:	00 00 
      cea4c4:	f3 0f 7f 84 24 18 02 	movdqu XMMWORD PTR [rsp+0x218],xmm0
      cea4cb:	00 00 
      cea4cd:	f3 0f 7f 84 24 08 02 	movdqu XMMWORD PTR [rsp+0x208],xmm0
      cea4d4:	00 00 
      cea4d6:	f3 0f 7f 84 24 f8 01 	movdqu XMMWORD PTR [rsp+0x1f8],xmm0
      cea4dd:	00 00 
      cea4df:	44 88 a4 24 a0 02 00 	mov    BYTE PTR [rsp+0x2a0],r12b
      cea4e6:	00 
      cea4e7:	f3 0f 7f 84 24 90 02 	movdqu XMMWORD PTR [rsp+0x290],xmm0
      cea4ee:	00 00 
      cea4f0:	f3 0f 7f 84 24 80 02 	movdqu XMMWORD PTR [rsp+0x280],xmm0
      cea4f7:	00 00 
      cea4f9:	f3 0f 7f 84 24 70 02 	movdqu XMMWORD PTR [rsp+0x270],xmm0

### +0x150
- 0xcea43e: movdqu XMMWORD PTR [rsp+0x150],xmm0
      cea424:	f3 0f 7f 84 24 28 01 	movdqu XMMWORD PTR [rsp+0x128],xmm0
      cea42b:	00 00 
      cea42d:	f3 0f 7f 84 24 38 01 	movdqu XMMWORD PTR [rsp+0x138],xmm0
      cea434:	00 00 
      cea436:	83 a4 24 48 01 00 00 	and    DWORD PTR [rsp+0x148],0x0
      cea43d:	00 
      cea43e:	f3 0f 7f 84 24 50 01 	movdqu XMMWORD PTR [rsp+0x150],xmm0
      cea445:	00 00 
      cea447:	f3 0f 7f 84 24 60 01 	movdqu XMMWORD PTR [rsp+0x160],xmm0
      cea44e:	00 00 
      cea450:	f3 0f 7f 84 24 70 01 	movdqu XMMWORD PTR [rsp+0x170],xmm0
      cea457:	00 00 
      cea459:	f3 0f 7f 84 24 80 01 	movdqu XMMWORD PTR [rsp+0x180],xmm0
      cea460:	00 00 
      cea462:	f3 0f 7f 84 24 90 01 	movdqu XMMWORD PTR [rsp+0x190],xmm0
      cea469:	00 00 
      cea46b:	f3 0f 7f 84 24 a0 01 	movdqu XMMWORD PTR [rsp+0x1a0],xmm0
- 0xcea755: lea    rdi,[rsp+0x150]
      cea73a:	48 89 ee             	mov    rsi,rbp
      cea73d:	e8 fe 37 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea742:	eb 11                	jmp    cea755 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376f5>
      cea744:	48 8d 35 cd cb 64 ff 	lea    rsi,[rip+0xffffffffff64cbcd]        # 337318 <_ZTSSt12bad_any_cast@@Base-0x58eb0>
      cea74b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea750:	e8 29 f3 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea755:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      cea75c:	00 
      cea75d:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea762:	e8 19 39 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea767:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea76c:	e8 1f 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea771:	49 81 c6 98 00 00 00 	add    r14,0x98
      cea778:	48 8d 35 69 f3 74 ff 	lea    rsi,[rip+0xffffffffff74f369]        # 439ae8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f537>
      cea77f:	4c 89 f7             	mov    rdi,r14
      cea782:	e8 e5 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea787:	48 85 c0             	test   rax,rax

### +0x1b0
- 0xcea852: mov    DWORD PTR [rsp+0x1b0],eax
      cea83d:	00 
      cea83e:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      cea842:	e8 ef 0f d9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      cea847:	48 89 c7             	mov    rdi,rax
      cea84a:	48 89 d6             	mov    rsi,rdx
      cea84d:	e8 1b 17 84 00       	call   152bf6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3714f1>
      cea852:	89 84 24 b0 01 00 00 	mov    DWORD PTR [rsp+0x1b0],eax
      cea859:	41 8a 87 b4 00 00 00 	mov    al,BYTE PTR [r15+0xb4]
      cea860:	88 84 24 b4 01 00 00 	mov    BYTE PTR [rsp+0x1b4],al
      cea867:	41 0f b6 87 b5 00 00 	movzx  eax,BYTE PTR [r15+0xb5]
      cea86e:	00 
      cea86f:	b9 00 01 00 00       	mov    ecx,0x100
      cea874:	09 c8                	or     eax,ecx
      cea876:	66 89 84 24 b5 01 00 	mov    WORD PTR [rsp+0x1b5],ax
      cea87d:	00 
      cea87e:	41 0f b6 87 b6 00 00 	movzx  eax,BYTE PTR [r15+0xb6]
      cea885:	00 

### +0x1b4
- 0xcea860: mov    BYTE PTR [rsp+0x1b4],al
      cea842:	e8 ef 0f d9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      cea847:	48 89 c7             	mov    rdi,rax
      cea84a:	48 89 d6             	mov    rsi,rdx
      cea84d:	e8 1b 17 84 00       	call   152bf6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3714f1>
      cea852:	89 84 24 b0 01 00 00 	mov    DWORD PTR [rsp+0x1b0],eax
      cea859:	41 8a 87 b4 00 00 00 	mov    al,BYTE PTR [r15+0xb4]
      cea860:	88 84 24 b4 01 00 00 	mov    BYTE PTR [rsp+0x1b4],al
      cea867:	41 0f b6 87 b5 00 00 	movzx  eax,BYTE PTR [r15+0xb5]
      cea86e:	00 
      cea86f:	b9 00 01 00 00       	mov    ecx,0x100
      cea874:	09 c8                	or     eax,ecx
      cea876:	66 89 84 24 b5 01 00 	mov    WORD PTR [rsp+0x1b5],ax
      cea87d:	00 
      cea87e:	41 0f b6 87 b6 00 00 	movzx  eax,BYTE PTR [r15+0xb6]
      cea885:	00 
      cea886:	09 c8                	or     eax,ecx
      cea888:	66 89 84 24 b7 01 00 	mov    WORD PTR [rsp+0x1b7],ax

### +0x1b5
- 0xcea876: mov    WORD PTR [rsp+0x1b5],ax
      cea859:	41 8a 87 b4 00 00 00 	mov    al,BYTE PTR [r15+0xb4]
      cea860:	88 84 24 b4 01 00 00 	mov    BYTE PTR [rsp+0x1b4],al
      cea867:	41 0f b6 87 b5 00 00 	movzx  eax,BYTE PTR [r15+0xb5]
      cea86e:	00 
      cea86f:	b9 00 01 00 00       	mov    ecx,0x100
      cea874:	09 c8                	or     eax,ecx
      cea876:	66 89 84 24 b5 01 00 	mov    WORD PTR [rsp+0x1b5],ax
      cea87d:	00 
      cea87e:	41 0f b6 87 b6 00 00 	movzx  eax,BYTE PTR [r15+0xb6]
      cea885:	00 
      cea886:	09 c8                	or     eax,ecx
      cea888:	66 89 84 24 b7 01 00 	mov    WORD PTR [rsp+0x1b7],ax
      cea88f:	00 
      cea890:	41 80 7d 14 00       	cmp    BYTE PTR [r13+0x14],0x0
      cea895:	74 3e                	je     cea8d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237875>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 

### +0x1b7
- 0xcea888: mov    WORD PTR [rsp+0x1b7],ax
      cea874:	09 c8                	or     eax,ecx
      cea876:	66 89 84 24 b5 01 00 	mov    WORD PTR [rsp+0x1b5],ax
      cea87d:	00 
      cea87e:	41 0f b6 87 b6 00 00 	movzx  eax,BYTE PTR [r15+0xb6]
      cea885:	00 
      cea886:	09 c8                	or     eax,ecx
      cea888:	66 89 84 24 b7 01 00 	mov    WORD PTR [rsp+0x1b7],ax
      cea88f:	00 
      cea890:	41 80 7d 14 00       	cmp    BYTE PTR [r13+0x14],0x0
      cea895:	74 3e                	je     cea8d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237875>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea8a3:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea8a8:	41 89 44 24 11       	mov    DWORD PTR [r12+0x11],eax
      cea8ad:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      cea8b3:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0

### +0x350
- 0xcea3bb: mov    BYTE PTR [rsp+0x350],r12b
      cea3a3:	44 88 a4 24 18 03 00 	mov    BYTE PTR [rsp+0x318],r12b
      cea3aa:	00 
      cea3ab:	44 88 a4 24 30 03 00 	mov    BYTE PTR [rsp+0x330],r12b
      cea3b2:	00 
      cea3b3:	44 88 a4 24 38 03 00 	mov    BYTE PTR [rsp+0x338],r12b
      cea3ba:	00 
      cea3bb:	44 88 a4 24 50 03 00 	mov    BYTE PTR [rsp+0x350],r12b
      cea3c2:	00 
      cea3c3:	44 88 a4 24 58 03 00 	mov    BYTE PTR [rsp+0x358],r12b
      cea3ca:	00 
      cea3cb:	44 88 a4 24 68 03 00 	mov    BYTE PTR [rsp+0x368],r12b
      cea3d2:	00 
      cea3d3:	44 88 a4 24 6c 03 00 	mov    BYTE PTR [rsp+0x36c],r12b
      cea3da:	00 
      cea3db:	44 88 a4 24 70 03 00 	mov    BYTE PTR [rsp+0x370],r12b
      cea3e2:	00 
      cea3e3:	44 88 a4 24 78 03 00 	mov    BYTE PTR [rsp+0x378],r12b

## Writes to local +0x10 / nearby head
### 0xcea1a8: mov    QWORD PTR [rsp+0x10],r9
      cea17e:	48 89 fb             	mov    rbx,rdi
      cea181:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cea188:	00 00 
      cea18a:	48 89 84 24 30 04 00 	mov    QWORD PTR [rsp+0x430],rax
      cea191:	00 
      cea192:	83 7f 18 00          	cmp    DWORD PTR [rdi+0x18],0x0
      cea196:	74 10                	je     cea1a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237148>
      cea198:	45 31 ed             	xor    r13d,r13d
      cea19b:	80 bb 90 00 00 00 00 	cmp    BYTE PTR [rbx+0x90],0x0
      cea1a2:	0f 84 77 09 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea1a8:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
      cea1ad:	44 89 44 24 0c       	mov    DWORD PTR [rsp+0xc],r8d
      cea1b2:	0f 10 41 68          	movups xmm0,XMMWORD PTR [rcx+0x68]
      cea1b6:	0f 29 84 24 20 04 00 	movaps XMMWORD PTR [rsp+0x420],xmm0
      cea1bd:	00 
      cea1be:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea1c5:	00 
      cea1c6:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea1c9:	49 89 cd             	mov    r13,rcx
      cea1cc:	f3 0f 6f 41 68       	movdqu xmm0,XMMWORD PTR [rcx+0x68]
      cea1d1:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea1d6:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea1da:	6a ff                	push   0xffffffffffffffff
      cea1dc:	5a                   	pop    rdx
      cea1dd:	31 ff                	xor    edi,edi
      cea1df:	e8 d0 30 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea1e4:	4c 8d b4 24 88 04 00 	lea    r14,[rsp+0x488]
      cea1eb:	00 

### 0xcea26a: movdqa XMMWORD PTR [rsp+0x10],xmm1
      cea23b:	80 bb 90 00 00 00 00 	cmp    BYTE PTR [rbx+0x90],0x0
      cea242:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea247:	66 0f 6f c8          	movdqa xmm1,xmm0
      cea24b:	74 08                	je     cea255 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2371f5>
      cea24d:	66 0f 6f 8b 80 00 00 	movdqa xmm1,XMMWORD PTR [rbx+0x80]
      cea254:	00 
      cea255:	74 0c                	je     cea263 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237203>
      cea257:	c6 83 90 00 00 00 00 	mov    BYTE PTR [rbx+0x90],0x0
      cea25e:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea263:	66 49 0f 3a 16 ce 01 	pextrq r14,xmm1,0x1
      cea26a:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      cea270:	66 49 0f 7e cc       	movq   r12,xmm1
      cea275:	66 48 0f 7e c7       	movq   rdi,xmm0
      cea27a:	66 48 0f 3a 16 c6 01 	pextrq rsi,xmm0,0x1
      cea281:	4c 89 e2             	mov    rdx,r12
      cea284:	4c 89 f1             	mov    rcx,r14
      cea287:	e8 be f4 fe ff       	call   cd974a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2266ea>
      cea28c:	45 31 ed             	xor    r13d,r13d
      cea28f:	84 c0                	test   al,al
      cea291:	0f 84 88 08 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea297:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea29e:	00 
      cea29f:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea2a2:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea2a9:	00 00 
      cea2ab:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea2b0:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea2b4:	6a 01                	push   0x1

### 0xcea366: mov    QWORD PTR [rsp+0x28],r14
      cea341:	5f                   	pop    rdi
      cea342:	6a ff                	push   0xffffffffffffffff
      cea344:	5a                   	pop    rdx
      cea345:	e8 6a 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea34a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea351:	00 
      cea352:	e8 39 3b b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea357:	41 bd 48 1f 00 00    	mov    r13d,0x1f48
      cea35d:	e9 bd 07 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea362:	88 54 24 0b          	mov    BYTE PTR [rsp+0xb],dl
      cea366:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
      cea36b:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
      cea370:	45 31 e4             	xor    r12d,r12d
      cea373:	44 88 a4 24 64 02 00 	mov    BYTE PTR [rsp+0x264],r12b
      cea37a:	00 
      cea37b:	44 88 a4 24 68 02 00 	mov    BYTE PTR [rsp+0x268],r12b
      cea382:	00 
      cea383:	44 88 a4 24 b8 02 00 	mov    BYTE PTR [rsp+0x2b8],r12b
      cea38a:	00 
      cea38b:	44 88 a4 24 f0 02 00 	mov    BYTE PTR [rsp+0x2f0],r12b
      cea392:	00 
      cea393:	44 88 a4 24 f8 02 00 	mov    BYTE PTR [rsp+0x2f8],r12b
      cea39a:	00 
      cea39b:	44 88 a4 24 10 03 00 	mov    BYTE PTR [rsp+0x310],r12b
      cea3a2:	00 
      cea3a3:	44 88 a4 24 18 03 00 	mov    BYTE PTR [rsp+0x318],r12b
      cea3aa:	00 
      cea3ab:	44 88 a4 24 30 03 00 	mov    BYTE PTR [rsp+0x330],r12b

### 0xcea36b: mov    QWORD PTR [rsp+0x30],r12
      cea342:	6a ff                	push   0xffffffffffffffff
      cea344:	5a                   	pop    rdx
      cea345:	e8 6a 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea34a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea351:	00 
      cea352:	e8 39 3b b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea357:	41 bd 48 1f 00 00    	mov    r13d,0x1f48
      cea35d:	e9 bd 07 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea362:	88 54 24 0b          	mov    BYTE PTR [rsp+0xb],dl
      cea366:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
      cea36b:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
      cea370:	45 31 e4             	xor    r12d,r12d
      cea373:	44 88 a4 24 64 02 00 	mov    BYTE PTR [rsp+0x264],r12b
      cea37a:	00 
      cea37b:	44 88 a4 24 68 02 00 	mov    BYTE PTR [rsp+0x268],r12b
      cea382:	00 
      cea383:	44 88 a4 24 b8 02 00 	mov    BYTE PTR [rsp+0x2b8],r12b
      cea38a:	00 
      cea38b:	44 88 a4 24 f0 02 00 	mov    BYTE PTR [rsp+0x2f0],r12b
      cea392:	00 
      cea393:	44 88 a4 24 f8 02 00 	mov    BYTE PTR [rsp+0x2f8],r12b
      cea39a:	00 
      cea39b:	44 88 a4 24 10 03 00 	mov    BYTE PTR [rsp+0x310],r12b
      cea3a2:	00 
      cea3a3:	44 88 a4 24 18 03 00 	mov    BYTE PTR [rsp+0x318],r12b
      cea3aa:	00 
      cea3ab:	44 88 a4 24 30 03 00 	mov    BYTE PTR [rsp+0x330],r12b
      cea3b2:	00 

## r15 provenance and all r15 field reads
### r15 definition 0xcea175: mov    r15,rcx
      cea164:	55                   	push   rbp
      cea165:	41 57                	push   r15
      cea167:	41 56                	push   r14
      cea169:	41 55                	push   r13
      cea16b:	41 54                	push   r12
      cea16d:	53                   	push   rbx
      cea16e:	48 81 ec 38 04 00 00 	sub    rsp,0x438
      cea175:	49 89 cf             	mov    r15,rcx
      cea178:	48 89 d5             	mov    rbp,rdx
      cea17b:	48 89 f1             	mov    rcx,rsi
      cea17e:	48 89 fb             	mov    rbx,rdi
      cea181:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cea188:	00 00 
      cea18a:	48 89 84 24 30 04 00 	mov    QWORD PTR [rsp+0x430],rax
      cea191:	00 
      cea192:	83 7f 18 00          	cmp    DWORD PTR [rdi+0x18],0x0
      cea196:	74 10                	je     cea1a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237148>
      cea198:	45 31 ed             	xor    r13d,r13d
      cea19b:	80 bb 90 00 00 00 00 	cmp    BYTE PTR [rbx+0x90],0x0
      cea1a2:	0f 84 77 09 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea1a8:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
      cea1ad:	44 89 44 24 0c       	mov    DWORD PTR [rsp+0xc],r8d
      cea1b2:	0f 10 41 68          	movups xmm0,XMMWORD PTR [rcx+0x68]
      cea1b6:	0f 29 84 24 20 04 00 	movaps XMMWORD PTR [rsp+0x420],xmm0
      cea1bd:	00 
      cea1be:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea1c5:	00 
      cea1c6:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea1c9:	49 89 cd             	mov    r13,rcx
      cea1cc:	f3 0f 6f 41 68       	movdqu xmm0,XMMWORD PTR [rcx+0x68]
      cea1d1:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea1d6:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea1da:	6a ff                	push   0xffffffffffffffff
      cea1dc:	5a                   	pop    rdx
      cea1dd:	31 ff                	xor    edi,edi
      cea1df:	e8 d0 30 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea1e4:	4c 8d b4 24 88 04 00 	lea    r14,[rsp+0x488]
      cea1eb:	00 
      cea1ec:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      cea1f0:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea1f7:	00 
      cea1f8:	e8 93 3c b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### r15 definition 0xcea2e1: mov    r15,QWORD PTR [r15+0x120]
      cea291:	0f 84 88 08 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea297:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea29e:	00 
      cea29f:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea2a2:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea2a9:	00 00 
      cea2ab:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea2b0:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea2b4:	6a 01                	push   0x1
      cea2b6:	5f                   	pop    rdi
      cea2b7:	6a ff                	push   0xffffffffffffffff
      cea2b9:	5a                   	pop    rdx
      cea2ba:	e8 f5 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea2bf:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
      cea2c6:	00 
      cea2c7:	4c 89 ef             	mov    rdi,r13
      cea2ca:	e8 c1 3b b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea2cf:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      cea2d5:	66 0f 7f 43 70       	movdqa XMMWORD PTR [rbx+0x70],xmm0
      cea2da:	49 8b af 18 01 00 00 	mov    rbp,QWORD PTR [r15+0x118]
      cea2e1:	4d 8b bf 20 01 00 00 	mov    r15,QWORD PTR [r15+0x120]
      cea2e8:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
      cea2ef:	e8 6e 01 d9 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cea2f4:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      cea2f8:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
      cea2fc:	6a 01                	push   0x1
      cea2fe:	41 59                	pop    r9
      cea300:	48 89 df             	mov    rdi,rbx
      cea303:	4c 89 e6             	mov    rsi,r12
      cea306:	4c 89 f2             	mov    rdx,r14
      cea309:	48 89 e9             	mov    rcx,rbp
      cea30c:	4d 89 f8             	mov    r8,r15
      cea30f:	e8 ca 16 00 00       	call   ceb9de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23897e>
      cea314:	41 89 c5             	mov    r13d,eax
      cea317:	e9 03 08 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea31c:	80 7b 69 00          	cmp    BYTE PTR [rbx+0x69],0x0
      cea320:	74 40                	je     cea362 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237302>
      cea322:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea329:	00 
      cea32a:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea32d:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea334:	00 00 
      cea336:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea33b:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea33f:	6a 04                	push   0x4
      cea341:	5f                   	pop    rdi
      cea342:	6a ff                	push   0xffffffffffffffff
      cea344:	5a                   	pop    rdx
      cea345:	e8 6a 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea34a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea351:	00 
      cea352:	e8 39 3b b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea357:	41 bd 48 1f 00 00    	mov    r13d,0x1f48
      cea35d:	e9 bd 07 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea362:	88 54 24 0b          	mov    BYTE PTR [rsp+0xb],dl

### r15 definition 0xcea931: lea    r15,[rsp+0x288]
      cea8d8:	83 a4 24 d8 01 00 00 	and    DWORD PTR [rsp+0x1d8],0x0
      cea8df:	00 
      cea8e0:	49 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [r15+0xb8]
      cea8e7:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      cea8ee:	00 
      cea8ef:	49 69 87 18 01 00 00 	imul   rax,QWORD PTR [r15+0x118],0x3e8
      cea8f6:	e8 03 00 00 
      cea8fa:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
      cea8ff:	f2 49 0f 2a 8f 20 01 	cvtsi2sd xmm1,QWORD PTR [r15+0x120]
      cea906:	00 00 
      cea908:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea90c:	e8 ff 63 b0 00       	call   17f0d10 <llround@plt>
      cea911:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
      cea918:	00 
      cea919:	80 7b 60 00          	cmp    BYTE PTR [rbx+0x60],0x0
      cea91d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      cea922:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      cea926:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
      cea92b:	75 04                	jne    cea931 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2378d1>
      cea92d:	c6 43 60 01          	mov    BYTE PTR [rbx+0x60],0x1
      cea931:	4c 8d bc 24 88 02 00 	lea    r15,[rsp+0x288]
      cea938:	00 
      cea939:	80 7c 24 0b 00       	cmp    BYTE PTR [rsp+0xb],0x0
      cea93e:	48 8d 8c 24 88 04 00 	lea    rcx,[rsp+0x488]
      cea945:	00 
      cea946:	74 35                	je     cea97d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23791d>
      cea948:	48 69 01 e8 03 00 00 	imul   rax,QWORD PTR [rcx],0x3e8
      cea94f:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
      cea954:	4c 8d 63 50          	lea    r12,[rbx+0x50]
      cea958:	f2 48 0f 2a 49 08    	cvtsi2sd xmm1,QWORD PTR [rcx+0x8]
      cea95e:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea962:	49 89 ce             	mov    r14,rcx
      cea965:	e8 a6 63 b0 00       	call   17f0d10 <llround@plt>
      cea96a:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
      cea971:	00 
      cea972:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea977:	f3 41 0f 7f 04 24    	movdqu XMMWORD PTR [r12],xmm0
      cea97d:	c6 84 24 f0 01 00 00 	mov    BYTE PTR [rsp+0x1f0],0x0
      cea984:	00 
      cea985:	8b 44 24 0c          	mov    eax,DWORD PTR [rsp+0xc]
      cea989:	88 84 24 f1 01 00 00 	mov    BYTE PTR [rsp+0x1f1],al
      cea990:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      cea994:	8a 00                	mov    al,BYTE PTR [rax]
      cea996:	24 01                	and    al,0x1
      cea998:	88 84 24 f2 01 00 00 	mov    BYTE PTR [rsp+0x1f2],al
      cea99f:	48 8d b3 b8 03 00 00 	lea    rsi,[rbx+0x3b8]
      cea9a6:	4c 89 ff             	mov    rdi,r15
      cea9a9:	e8 d2 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9ae:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>

### r15 definition 0xcea9ae: mov    r15,QWORD PTR [rsp+0x30]
      cea954:	4c 8d 63 50          	lea    r12,[rbx+0x50]
      cea958:	f2 48 0f 2a 49 08    	cvtsi2sd xmm1,QWORD PTR [rcx+0x8]
      cea95e:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea962:	49 89 ce             	mov    r14,rcx
      cea965:	e8 a6 63 b0 00       	call   17f0d10 <llround@plt>
      cea96a:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
      cea971:	00 
      cea972:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea977:	f3 41 0f 7f 04 24    	movdqu XMMWORD PTR [r12],xmm0
      cea97d:	c6 84 24 f0 01 00 00 	mov    BYTE PTR [rsp+0x1f0],0x0
      cea984:	00 
      cea985:	8b 44 24 0c          	mov    eax,DWORD PTR [rsp+0xc]
      cea989:	88 84 24 f1 01 00 00 	mov    BYTE PTR [rsp+0x1f1],al
      cea990:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      cea994:	8a 00                	mov    al,BYTE PTR [rax]
      cea996:	24 01                	and    al,0x1
      cea998:	88 84 24 f2 01 00 00 	mov    BYTE PTR [rsp+0x1f2],al
      cea99f:	48 8d b3 b8 03 00 00 	lea    rsi,[rbx+0x3b8]
      cea9a6:	4c 89 ff             	mov    rdi,r15
      cea9a9:	e8 d2 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9ae:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14
      ceaa08:	e8 5f 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      ceaa0d:	48 85 c0             	test   rax,rax
      ceaa10:	74 10                	je     ceaa22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2379c2>
      ceaa12:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
      ceaa19:	00 
      ceaa1a:	48 89 c6             	mov    rsi,rax
      ceaa1d:	e8 18 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      ceaa22:	31 c0                	xor    eax,eax
      ceaa24:	88 84 24 62 02 00 00 	mov    BYTE PTR [rsp+0x262],al
      ceaa2b:	c7 84 24 6c 03 00 00 	mov    DWORD PTR [rsp+0x36c],0x2
      ceaa32:	02 00 00 00 
      ceaa36:	c6 84 24 70 03 00 00 	mov    BYTE PTR [rsp+0x370],0x1
      ceaa3d:	01 

### r15 definition 0xceab4e: pop    r15
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      ceab3d:	44 89 e8             	mov    eax,r13d
      ceab40:	48 81 c4 38 04 00 00 	add    rsp,0x438
      ceab47:	5b                   	pop    rbx
      ceab48:	41 5c                	pop    r12
      ceab4a:	41 5d                	pop    r13
      ceab4c:	41 5e                	pop    r14
      ceab4e:	41 5f                	pop    r15
      ceab50:	5d                   	pop    rbp
      ceab51:	c3                   	ret
      ceab52:	48 89 c3             	mov    rbx,rax
      ceab55:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceab5a:	eb 28                	jmp    ceab84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b24>
      ceab5c:	eb 38                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab5e:	eb 36                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab60:	eb 34                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab62:	eb 32                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab64:	eb 30                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab66:	eb 2e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab68:	eb 2c                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6a:	eb 2a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6c:	eb 0e                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab6e:	eb 0c                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab70:	eb 24                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab72:	eb 22                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab74:	eb 20                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab76:	eb 1e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab78:	eb 02                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab7a:	eb 1a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab7c:	48 89 c3             	mov    rbx,rax
      ceab7f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceab84:	e8 07 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab89:	eb 0e                	jmp    ceab99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b39>
      ceab8b:	eb 09                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab8d:	48 89 c3             	mov    rbx,rax
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]

- r15 field @0xcea1fd: movdqu xmm0,XMMWORD PTR [r15+0x118]
- r15 field @0xcea220: lea    r14,[r15+0x118]
- r15 field @0xcea2da: mov    rbp,QWORD PTR [r15+0x118]
- r15 field @0xcea2e1: mov    r15,QWORD PTR [r15+0x120]
- r15 field @0xcea5a4: movzx  eax,BYTE PTR [r15+0x18]
- r15 field @0xcea5ad: mov    rax,QWORD PTR [r15+0x20]
- r15 field @0xcea5bd: lea    rsi,[r15+0x18]
- r15 field @0xcea65c: lea    rsi,[r15+0x8b0]
- r15 field @0xcea699: lea    rsi,[r15+0x48]
- r15 field @0xcea6f5: lea    rsi,[r15+0x8e0]
- r15 field @0xcea701: mov    eax,DWORD PTR [r15+0x12c]
- r15 field @0xcea716: movzx  eax,BYTE PTR [r15+0x98]
- r15 field @0xcea722: mov    rax,QWORD PTR [r15+0xa0]
- r15 field @0xcea7e4: cmp    BYTE PTR [r15+0x918],0x0
- r15 field @0xcea7f6: lea    rsi,[r15+0x900]
- r15 field @0xcea83e: lea    rdi,[r15+0x30]
- r15 field @0xcea859: mov    al,BYTE PTR [r15+0xb4]
- r15 field @0xcea867: movzx  eax,BYTE PTR [r15+0xb5]
- r15 field @0xcea87e: movzx  eax,BYTE PTR [r15+0xb6]
- r15 field @0xcea8e0: mov    rax,QWORD PTR [r15+0xb8]
- r15 field @0xcea8ef: imul   rax,QWORD PTR [r15+0x118],0x3e8
- r15 field @0xcea8ff: cvtsi2sd xmm1,QWORD PTR [r15+0x120]
- r15 field @0xceaa87: mov    DWORD PTR [r15+0x10],eax

## Incoming argument saves / provenance
      cea175:	49 89 cf             	mov    r15,rcx
      cea178:	48 89 d5             	mov    rbp,rdx
      cea17b:	48 89 f1             	mov    rcx,rsi
      cea17e:	48 89 fb             	mov    rbx,rdi
      cea192:	83 7f 18 00          	cmp    DWORD PTR [rdi+0x18],0x0
      cea1a8:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
      cea1b2:	0f 10 41 68          	movups xmm0,XMMWORD PTR [rcx+0x68]
      cea1be:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea1c6:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea1c9:	49 89 cd             	mov    r13,rcx
      cea1cc:	f3 0f 6f 41 68       	movdqu xmm0,XMMWORD PTR [rcx+0x68]
      cea1d1:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea1d6:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea1dc:	5a                   	pop    rdx
      cea1f0:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea235:	5f                   	pop    rdi
      cea275:	66 48 0f 7e c7       	movq   rdi,xmm0
      cea27a:	66 48 0f 3a 16 c6 01 	pextrq rsi,xmm0,0x1
      cea281:	4c 89 e2             	mov    rdx,r12
      cea284:	4c 89 f1             	mov    rcx,r14
      cea297:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea29f:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea2ab:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea2b0:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea2b6:	5f                   	pop    rdi
      cea2b9:	5a                   	pop    rdx
      cea2c7:	4c 89 ef             	mov    rdi,r13
      cea2e8:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]

## Calls after +0x1b5/+0x1b7 construction
### 0xcea8c8: call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea890:	41 80 7d 14 00       	cmp    BYTE PTR [r13+0x14],0x0
      cea895:	74 3e                	je     cea8d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237875>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea8a3:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea8a8:	41 89 44 24 11       	mov    DWORD PTR [r12+0x11],eax
      cea8ad:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      cea8b3:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea8ba:	41 c6 04 24 28       	mov    BYTE PTR [r12],0x28
      cea8bf:	41 c6 44 24 15 00    	mov    BYTE PTR [r12+0x15],0x0
      cea8c5:	4c 89 e6             	mov    rsi,r12
      cea8c8:	e8 61 11 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea8cd:	4c 89 e7             	mov    rdi,r12
      cea8d0:	e8 bb 35 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea8d5:	4d 89 f5             	mov    r13,r14
      cea8d8:	83 a4 24 d8 01 00 00 	and    DWORD PTR [rsp+0x1d8],0x0
      cea8df:	00 
      cea8e0:	49 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [r15+0xb8]
      cea8e7:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      cea8ee:	00 
      cea8ef:	49 69 87 18 01 00 00 	imul   rax,QWORD PTR [r15+0x118],0x3e8
      cea8f6:	e8 03 00 00 
      cea8fa:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
      cea8ff:	f2 49 0f 2a 8f 20 01 	cvtsi2sd xmm1,QWORD PTR [r15+0x120]
      cea906:	00 00 
      cea908:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea90c:	e8 ff 63 b0 00       	call   17f0d10 <llround@plt>
      cea911:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
      cea918:	00 
      cea919:	80 7b 60 00          	cmp    BYTE PTR [rbx+0x60],0x0
      cea91d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      cea922:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]

### 0xcea8d0: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea8a3:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea8a8:	41 89 44 24 11       	mov    DWORD PTR [r12+0x11],eax
      cea8ad:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      cea8b3:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea8ba:	41 c6 04 24 28       	mov    BYTE PTR [r12],0x28
      cea8bf:	41 c6 44 24 15 00    	mov    BYTE PTR [r12+0x15],0x0
      cea8c5:	4c 89 e6             	mov    rsi,r12
      cea8c8:	e8 61 11 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea8cd:	4c 89 e7             	mov    rdi,r12
      cea8d0:	e8 bb 35 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea8d5:	4d 89 f5             	mov    r13,r14
      cea8d8:	83 a4 24 d8 01 00 00 	and    DWORD PTR [rsp+0x1d8],0x0
      cea8df:	00 
      cea8e0:	49 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [r15+0xb8]
      cea8e7:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      cea8ee:	00 
      cea8ef:	49 69 87 18 01 00 00 	imul   rax,QWORD PTR [r15+0x118],0x3e8
      cea8f6:	e8 03 00 00 
      cea8fa:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
      cea8ff:	f2 49 0f 2a 8f 20 01 	cvtsi2sd xmm1,QWORD PTR [r15+0x120]
      cea906:	00 00 
      cea908:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea90c:	e8 ff 63 b0 00       	call   17f0d10 <llround@plt>
      cea911:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
      cea918:	00 
      cea919:	80 7b 60 00          	cmp    BYTE PTR [rbx+0x60],0x0
      cea91d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      cea922:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      cea926:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
      cea92b:	75 04                	jne    cea931 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2378d1>

### 0xcea90c: call   17f0d10 <llround@plt>
      cea8d5:	4d 89 f5             	mov    r13,r14
      cea8d8:	83 a4 24 d8 01 00 00 	and    DWORD PTR [rsp+0x1d8],0x0
      cea8df:	00 
      cea8e0:	49 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [r15+0xb8]
      cea8e7:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      cea8ee:	00 
      cea8ef:	49 69 87 18 01 00 00 	imul   rax,QWORD PTR [r15+0x118],0x3e8
      cea8f6:	e8 03 00 00 
      cea8fa:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
      cea8ff:	f2 49 0f 2a 8f 20 01 	cvtsi2sd xmm1,QWORD PTR [r15+0x120]
      cea906:	00 00 
      cea908:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea90c:	e8 ff 63 b0 00       	call   17f0d10 <llround@plt>
      cea911:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
      cea918:	00 
      cea919:	80 7b 60 00          	cmp    BYTE PTR [rbx+0x60],0x0
      cea91d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      cea922:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      cea926:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
      cea92b:	75 04                	jne    cea931 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2378d1>
      cea92d:	c6 43 60 01          	mov    BYTE PTR [rbx+0x60],0x1
      cea931:	4c 8d bc 24 88 02 00 	lea    r15,[rsp+0x288]
      cea938:	00 
      cea939:	80 7c 24 0b 00       	cmp    BYTE PTR [rsp+0xb],0x0
      cea93e:	48 8d 8c 24 88 04 00 	lea    rcx,[rsp+0x488]
      cea945:	00 
      cea946:	74 35                	je     cea97d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23791d>
      cea948:	48 69 01 e8 03 00 00 	imul   rax,QWORD PTR [rcx],0x3e8
      cea94f:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
      cea954:	4c 8d 63 50          	lea    r12,[rbx+0x50]
      cea958:	f2 48 0f 2a 49 08    	cvtsi2sd xmm1,QWORD PTR [rcx+0x8]
      cea95e:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea962:	49 89 ce             	mov    r14,rcx

### 0xcea965: call   17f0d10 <llround@plt>
      cea931:	4c 8d bc 24 88 02 00 	lea    r15,[rsp+0x288]
      cea938:	00 
      cea939:	80 7c 24 0b 00       	cmp    BYTE PTR [rsp+0xb],0x0
      cea93e:	48 8d 8c 24 88 04 00 	lea    rcx,[rsp+0x488]
      cea945:	00 
      cea946:	74 35                	je     cea97d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23791d>
      cea948:	48 69 01 e8 03 00 00 	imul   rax,QWORD PTR [rcx],0x3e8
      cea94f:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
      cea954:	4c 8d 63 50          	lea    r12,[rbx+0x50]
      cea958:	f2 48 0f 2a 49 08    	cvtsi2sd xmm1,QWORD PTR [rcx+0x8]
      cea95e:	f2 0f 5e c1          	divsd  xmm0,xmm1
      cea962:	49 89 ce             	mov    r14,rcx
      cea965:	e8 a6 63 b0 00       	call   17f0d10 <llround@plt>
      cea96a:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
      cea971:	00 
      cea972:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea977:	f3 41 0f 7f 04 24    	movdqu XMMWORD PTR [r12],xmm0
      cea97d:	c6 84 24 f0 01 00 00 	mov    BYTE PTR [rsp+0x1f0],0x0
      cea984:	00 
      cea985:	8b 44 24 0c          	mov    eax,DWORD PTR [rsp+0xc]
      cea989:	88 84 24 f1 01 00 00 	mov    BYTE PTR [rsp+0x1f1],al
      cea990:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      cea994:	8a 00                	mov    al,BYTE PTR [rax]
      cea996:	24 01                	and    al,0x1
      cea998:	88 84 24 f2 01 00 00 	mov    BYTE PTR [rsp+0x1f2],al
      cea99f:	48 8d b3 b8 03 00 00 	lea    rsi,[rbx+0x3b8]
      cea9a6:	4c 89 ff             	mov    rdi,r15
      cea9a9:	e8 d2 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9ae:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>

### 0xcea9a9: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea972:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea977:	f3 41 0f 7f 04 24    	movdqu XMMWORD PTR [r12],xmm0
      cea97d:	c6 84 24 f0 01 00 00 	mov    BYTE PTR [rsp+0x1f0],0x0
      cea984:	00 
      cea985:	8b 44 24 0c          	mov    eax,DWORD PTR [rsp+0xc]
      cea989:	88 84 24 f1 01 00 00 	mov    BYTE PTR [rsp+0x1f1],al
      cea990:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      cea994:	8a 00                	mov    al,BYTE PTR [rax]
      cea996:	24 01                	and    al,0x1
      cea998:	88 84 24 f2 01 00 00 	mov    BYTE PTR [rsp+0x1f2],al
      cea99f:	48 8d b3 b8 03 00 00 	lea    rsi,[rbx+0x3b8]
      cea9a6:	4c 89 ff             	mov    rdi,r15
      cea9a9:	e8 d2 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9ae:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>

### 0xcea9c0: call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea989:	88 84 24 f1 01 00 00 	mov    BYTE PTR [rsp+0x1f1],al
      cea990:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      cea994:	8a 00                	mov    al,BYTE PTR [rax]
      cea996:	24 01                	and    al,0x1
      cea998:	88 84 24 f2 01 00 00 	mov    BYTE PTR [rsp+0x1f2],al
      cea99f:	48 8d b3 b8 03 00 00 	lea    rsi,[rbx+0x3b8]
      cea9a6:	4c 89 ff             	mov    rdi,r15
      cea9a9:	e8 d2 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9ae:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14
      ceaa08:	e8 5f 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      ceaa0d:	48 85 c0             	test   rax,rax
      ceaa10:	74 10                	je     ceaa22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2379c2>

### 0xcea9d5: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9a6:	4c 89 ff             	mov    rdi,r15
      cea9a9:	e8 d2 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9ae:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14
      ceaa08:	e8 5f 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      ceaa0d:	48 85 c0             	test   rax,rax
      ceaa10:	74 10                	je     ceaa22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2379c2>
      ceaa12:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
      ceaa19:	00 
      ceaa1a:	48 89 c6             	mov    rsi,rax
      ceaa1d:	e8 18 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      ceaa22:	31 c0                	xor    eax,eax
      ceaa24:	88 84 24 62 02 00 00 	mov    BYTE PTR [rsp+0x262],al

### 0xcea9e4: call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14
      ceaa08:	e8 5f 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      ceaa0d:	48 85 c0             	test   rax,rax
      ceaa10:	74 10                	je     ceaa22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2379c2>
      ceaa12:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
      ceaa19:	00 
      ceaa1a:	48 89 c6             	mov    rsi,rax
      ceaa1d:	e8 18 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      ceaa22:	31 c0                	xor    eax,eax
      ceaa24:	88 84 24 62 02 00 00 	mov    BYTE PTR [rsp+0x262],al
      ceaa2b:	c7 84 24 6c 03 00 00 	mov    DWORD PTR [rsp+0x36c],0x2
      ceaa32:	02 00 00 00 
      ceaa36:	c6 84 24 70 03 00 00 	mov    BYTE PTR [rsp+0x370],0x1

### 0xcea9f9: call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14
      ceaa08:	e8 5f 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      ceaa0d:	48 85 c0             	test   rax,rax
      ceaa10:	74 10                	je     ceaa22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2379c2>
      ceaa12:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
      ceaa19:	00 
      ceaa1a:	48 89 c6             	mov    rsi,rax
      ceaa1d:	e8 18 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      ceaa22:	31 c0                	xor    eax,eax
      ceaa24:	88 84 24 62 02 00 00 	mov    BYTE PTR [rsp+0x262],al
      ceaa2b:	c7 84 24 6c 03 00 00 	mov    DWORD PTR [rsp+0x36c],0x2
      ceaa32:	02 00 00 00 
      ceaa36:	c6 84 24 70 03 00 00 	mov    BYTE PTR [rsp+0x370],0x1
      ceaa3d:	01 
      ceaa3e:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ceaa43:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaa46:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaa4d:	00 00 
      ceaa4f:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0

### 0xceaa08: call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14
      ceaa08:	e8 5f 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      ceaa0d:	48 85 c0             	test   rax,rax
      ceaa10:	74 10                	je     ceaa22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2379c2>
      ceaa12:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
      ceaa19:	00 
      ceaa1a:	48 89 c6             	mov    rsi,rax
      ceaa1d:	e8 18 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      ceaa22:	31 c0                	xor    eax,eax
      ceaa24:	88 84 24 62 02 00 00 	mov    BYTE PTR [rsp+0x262],al
      ceaa2b:	c7 84 24 6c 03 00 00 	mov    DWORD PTR [rsp+0x36c],0x2
      ceaa32:	02 00 00 00 
      ceaa36:	c6 84 24 70 03 00 00 	mov    BYTE PTR [rsp+0x370],0x1
      ceaa3d:	01 
      ceaa3e:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ceaa43:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaa46:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaa4d:	00 00 
      ceaa4f:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaa54:	88 46 11             	mov    BYTE PTR [rsi+0x11],al
      ceaa57:	6a 02                	push   0x2
      ceaa59:	5f                   	pop    rdi

### 0xceaa1d: call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14
      ceaa08:	e8 5f 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      ceaa0d:	48 85 c0             	test   rax,rax
      ceaa10:	74 10                	je     ceaa22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2379c2>
      ceaa12:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
      ceaa19:	00 
      ceaa1a:	48 89 c6             	mov    rsi,rax
      ceaa1d:	e8 18 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      ceaa22:	31 c0                	xor    eax,eax
      ceaa24:	88 84 24 62 02 00 00 	mov    BYTE PTR [rsp+0x262],al
      ceaa2b:	c7 84 24 6c 03 00 00 	mov    DWORD PTR [rsp+0x36c],0x2
      ceaa32:	02 00 00 00 
      ceaa36:	c6 84 24 70 03 00 00 	mov    BYTE PTR [rsp+0x370],0x1
      ceaa3d:	01 
      ceaa3e:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ceaa43:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaa46:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaa4d:	00 00 
      ceaa4f:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaa54:	88 46 11             	mov    BYTE PTR [rsi+0x11],al
      ceaa57:	6a 02                	push   0x2
      ceaa59:	5f                   	pop    rdi
      ceaa5a:	6a ff                	push   0xffffffffffffffff
      ceaa5c:	5a                   	pop    rdx
      ceaa5d:	e8 52 28 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]

### 0xceaa5d: call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa36:	c6 84 24 70 03 00 00 	mov    BYTE PTR [rsp+0x370],0x1
      ceaa3d:	01 
      ceaa3e:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ceaa43:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaa46:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaa4d:	00 00 
      ceaa4f:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaa54:	88 46 11             	mov    BYTE PTR [rsi+0x11],al
      ceaa57:	6a 02                	push   0x2
      ceaa59:	5f                   	pop    rdi
      ceaa5a:	6a ff                	push   0xffffffffffffffff
      ceaa5c:	5a                   	pop    rdx
      ceaa5d:	e8 52 28 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d

### 0xceaa67: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa3e:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ceaa43:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaa46:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaa4d:	00 00 
      ceaa4f:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaa54:	88 46 11             	mov    BYTE PTR [rsi+0x11],al
      ceaa57:	6a 02                	push   0x2
      ceaa59:	5f                   	pop    rdi
      ceaa5a:	6a ff                	push   0xffffffffffffffff
      ceaa5c:	5a                   	pop    rdx
      ceaa5d:	e8 52 28 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]

### 0xceaa80: call   QWORD PTR [rax+0x18]
      ceaa57:	6a 02                	push   0x2
      ceaa59:	5f                   	pop    rdi
      ceaa5a:	6a ff                	push   0xffffffffffffffff
      ceaa5c:	5a                   	pop    rdx
      ceaa5d:	e8 52 28 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3

### 0xceaaa2: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]

### 0xceaaaf: call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]

### 0xceaad9: call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>

### 0xceaae3: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      ceab3d:	44 89 e8             	mov    eax,r13d
      ceab40:	48 81 c4 38 04 00 00 	add    rsp,0x438

### 0xceaaf3: call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      ceab3d:	44 89 e8             	mov    eax,r13d
      ceab40:	48 81 c4 38 04 00 00 	add    rsp,0x438
      ceab47:	5b                   	pop    rbx
      ceab48:	41 5c                	pop    r12
      ceab4a:	41 5d                	pop    r13

### 0xceab00: call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      ceab3d:	44 89 e8             	mov    eax,r13d
      ceab40:	48 81 c4 38 04 00 00 	add    rsp,0x438
      ceab47:	5b                   	pop    rbx
      ceab48:	41 5c                	pop    r12
      ceab4a:	41 5d                	pop    r13
      ceab4c:	41 5e                	pop    r14
      ceab4e:	41 5f                	pop    r15
      ceab50:	5d                   	pop    rbp

### 0xceab0d: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      ceab3d:	44 89 e8             	mov    eax,r13d
      ceab40:	48 81 c4 38 04 00 00 	add    rsp,0x438
      ceab47:	5b                   	pop    rbx
      ceab48:	41 5c                	pop    r12
      ceab4a:	41 5d                	pop    r13
      ceab4c:	41 5e                	pop    r14
      ceab4e:	41 5f                	pop    r15
      ceab50:	5d                   	pop    rbp
      ceab51:	c3                   	ret
      ceab52:	48 89 c3             	mov    rbx,rax
      ceab55:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]

### 0xceab1a: call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      ceab3d:	44 89 e8             	mov    eax,r13d
      ceab40:	48 81 c4 38 04 00 00 	add    rsp,0x438
      ceab47:	5b                   	pop    rbx
      ceab48:	41 5c                	pop    r12
      ceab4a:	41 5d                	pop    r13
      ceab4c:	41 5e                	pop    r14
      ceab4e:	41 5f                	pop    r15
      ceab50:	5d                   	pop    rbp
      ceab51:	c3                   	ret
      ceab52:	48 89 c3             	mov    rbx,rax
      ceab55:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceab5a:	eb 28                	jmp    ceab84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b24>
      ceab5c:	eb 38                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab5e:	eb 36                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>

### 0xceab84: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab68:	eb 2c                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6a:	eb 2a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6c:	eb 0e                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab6e:	eb 0c                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab70:	eb 24                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab72:	eb 22                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab74:	eb 20                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab76:	eb 1e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab78:	eb 02                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab7a:	eb 1a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab7c:	48 89 c3             	mov    rbx,rax
      ceab7f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceab84:	e8 07 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab89:	eb 0e                	jmp    ceab99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b39>
      ceab8b:	eb 09                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab8d:	48 89 c3             	mov    rbx,rax
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]

### 0xceab9e: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab7a:	eb 1a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab7c:	48 89 c3             	mov    rbx,rax
      ceab7f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceab84:	e8 07 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab89:	eb 0e                	jmp    ceab99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b39>
      ceab8b:	eb 09                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab8d:	48 89 c3             	mov    rbx,rax
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx
      ceabd8:	e8 f3 50 d8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceabdd:	e8 ce 4e b0 00       	call   17efab0 <__stack_chk_fail@plt>
      ceabe2:	55                   	push   rbp
      ceabe3:	41 57                	push   r15
      ceabe5:	41 56                	push   r14
      ceabe7:	41 54                	push   r12

### 0xceabab: call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab84:	e8 07 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab89:	eb 0e                	jmp    ceab99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b39>
      ceab8b:	eb 09                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab8d:	48 89 c3             	mov    rbx,rax
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx
      ceabd8:	e8 f3 50 d8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceabdd:	e8 ce 4e b0 00       	call   17efab0 <__stack_chk_fail@plt>
      ceabe2:	55                   	push   rbp
      ceabe3:	41 57                	push   r15
      ceabe5:	41 56                	push   r14
      ceabe7:	41 54                	push   r12
      ceabe9:	53                   	push   rbx
      ceabea:	44 89 c5             	mov    ebp,r8d
      ceabed:	41 89 ce             	mov    r14d,ecx

### 0xceabbd: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx
      ceabd8:	e8 f3 50 d8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceabdd:	e8 ce 4e b0 00       	call   17efab0 <__stack_chk_fail@plt>
      ceabe2:	55                   	push   rbp
      ceabe3:	41 57                	push   r15
      ceabe5:	41 56                	push   r14
      ceabe7:	41 54                	push   r12
      ceabe9:	53                   	push   rbx
      ceabea:	44 89 c5             	mov    ebp,r8d
      ceabed:	41 89 ce             	mov    r14d,ecx
      ceabf0:	41 89 d7             	mov    r15d,edx
      ceabf3:	49 89 f4             	mov    r12,rsi
      ceabf6:	48 89 fb             	mov    rbx,rdi
      ceabf9:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]
      ceabfc:	6a 15                	push   0x15

### 0xceabd8: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx
      ceabd8:	e8 f3 50 d8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceabdd:	e8 ce 4e b0 00       	call   17efab0 <__stack_chk_fail@plt>
      ceabe2:	55                   	push   rbp
      ceabe3:	41 57                	push   r15
      ceabe5:	41 56                	push   r14
      ceabe7:	41 54                	push   r12
      ceabe9:	53                   	push   rbx
      ceabea:	44 89 c5             	mov    ebp,r8d
      ceabed:	41 89 ce             	mov    r14d,ecx
      ceabf0:	41 89 d7             	mov    r15d,edx
      ceabf3:	49 89 f4             	mov    r12,rsi
      ceabf6:	48 89 fb             	mov    rbx,rdi
      ceabf9:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]
      ceabfc:	6a 15                	push   0x15
      ceabfe:	5f                   	pop    rdi
      ceabff:	e8 4a 25 84 00       	call   152d14e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3726d2>
      ceac04:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      ceac08:	4c 89 e6             	mov    rsi,r12
      ceac0b:	e8 70 34 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ceac10:	44 89 7b 48          	mov    DWORD PTR [rbx+0x48],r15d
      ceac14:	44 89 73 4c          	mov    DWORD PTR [rbx+0x4c],r14d

### 0xceabdd: call   17efab0 <__stack_chk_fail@plt>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx
      ceabd8:	e8 f3 50 d8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceabdd:	e8 ce 4e b0 00       	call   17efab0 <__stack_chk_fail@plt>
      ceabe2:	55                   	push   rbp
      ceabe3:	41 57                	push   r15
      ceabe5:	41 56                	push   r14
      ceabe7:	41 54                	push   r12
      ceabe9:	53                   	push   rbx
      ceabea:	44 89 c5             	mov    ebp,r8d
      ceabed:	41 89 ce             	mov    r14d,ecx
      ceabf0:	41 89 d7             	mov    r15d,edx
      ceabf3:	49 89 f4             	mov    r12,rsi
      ceabf6:	48 89 fb             	mov    rbx,rdi
      ceabf9:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]
      ceabfc:	6a 15                	push   0x15
      ceabfe:	5f                   	pop    rdi
      ceabff:	e8 4a 25 84 00       	call   152d14e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3726d2>
      ceac04:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      ceac08:	4c 89 e6             	mov    rsi,r12
      ceac0b:	e8 70 34 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ceac10:	44 89 7b 48          	mov    DWORD PTR [rbx+0x48],r15d
      ceac14:	44 89 73 4c          	mov    DWORD PTR [rbx+0x4c],r14d
      ceac18:	40 88 6b 68          	mov    BYTE PTR [rbx+0x68],bpl

## Potential completed-object consumers
### call 0xcea1df: call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea198:	45 31 ed             	xor    r13d,r13d
      cea19b:	80 bb 90 00 00 00 00 	cmp    BYTE PTR [rbx+0x90],0x0
      cea1a2:	0f 84 77 09 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea1a8:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
      cea1ad:	44 89 44 24 0c       	mov    DWORD PTR [rsp+0xc],r8d
      cea1b2:	0f 10 41 68          	movups xmm0,XMMWORD PTR [rcx+0x68]
      cea1b6:	0f 29 84 24 20 04 00 	movaps XMMWORD PTR [rsp+0x420],xmm0
      cea1bd:	00 
      cea1be:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea1c5:	00 
      cea1c6:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea1c9:	49 89 cd             	mov    r13,rcx
      cea1cc:	f3 0f 6f 41 68       	movdqu xmm0,XMMWORD PTR [rcx+0x68]
      cea1d1:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea1d6:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea1da:	6a ff                	push   0xffffffffffffffff
      cea1dc:	5a                   	pop    rdx
      cea1dd:	31 ff                	xor    edi,edi

### call 0xcea1f8: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea1b6:	0f 29 84 24 20 04 00 	movaps XMMWORD PTR [rsp+0x420],xmm0
      cea1bd:	00 
      cea1be:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea1c5:	00 
      cea1c6:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea1c9:	49 89 cd             	mov    r13,rcx
      cea1cc:	f3 0f 6f 41 68       	movdqu xmm0,XMMWORD PTR [rcx+0x68]
      cea1d1:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea1d6:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea1da:	6a ff                	push   0xffffffffffffffff
      cea1dc:	5a                   	pop    rdx
      cea1dd:	31 ff                	xor    edi,edi
      cea1df:	e8 d0 30 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea1e4:	4c 8d b4 24 88 04 00 	lea    r14,[rsp+0x488]
      cea1eb:	00 
      cea1ec:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      cea1f0:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea1f7:	00 

### call 0xcea236: call   152d14e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3726d2>
      cea1f0:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea1f7:	00 
      cea1f8:	e8 93 3c b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea1fd:	f3 41 0f 6f 87 18 01 	movdqu xmm0,XMMWORD PTR [r15+0x118]
      cea204:	00 00 
      cea206:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      cea20b:	41 8a 56 10          	mov    dl,BYTE PTR [r14+0x10]
      cea20f:	84 d2                	test   dl,dl
      cea211:	74 0d                	je     cea220 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2371c0>
      cea213:	48 8d 43 70          	lea    rax,[rbx+0x70]
      cea217:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      cea21c:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      cea220:	4d 8d b7 18 01 00 00 	lea    r14,[r15+0x118]
      cea227:	41 8b 34 24          	mov    esi,DWORD PTR [r12]
      cea22b:	85 f6                	test   esi,esi
      cea22d:	0f 84 e9 00 00 00    	je     cea31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2372bc>
      cea233:	6a 14                	push   0x14
      cea235:	5f                   	pop    rdi

### call 0xcea2ba: call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea27a:	66 48 0f 3a 16 c6 01 	pextrq rsi,xmm0,0x1
      cea281:	4c 89 e2             	mov    rdx,r12
      cea284:	4c 89 f1             	mov    rcx,r14
      cea287:	e8 be f4 fe ff       	call   cd974a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2266ea>
      cea28c:	45 31 ed             	xor    r13d,r13d
      cea28f:	84 c0                	test   al,al
      cea291:	0f 84 88 08 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea297:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea29e:	00 
      cea29f:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea2a2:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea2a9:	00 00 
      cea2ab:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea2b0:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea2b4:	6a 01                	push   0x1
      cea2b6:	5f                   	pop    rdi
      cea2b7:	6a ff                	push   0xffffffffffffffff
      cea2b9:	5a                   	pop    rdx

### call 0xcea2ca: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea28c:	45 31 ed             	xor    r13d,r13d
      cea28f:	84 c0                	test   al,al
      cea291:	0f 84 88 08 00 00    	je     ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea297:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea29e:	00 
      cea29f:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea2a2:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea2a9:	00 00 
      cea2ab:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea2b0:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea2b4:	6a 01                	push   0x1
      cea2b6:	5f                   	pop    rdi
      cea2b7:	6a ff                	push   0xffffffffffffffff
      cea2b9:	5a                   	pop    rdx
      cea2ba:	e8 f5 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea2bf:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
      cea2c6:	00 
      cea2c7:	4c 89 ef             	mov    rdi,r13

### call 0xcea345: call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea309:	48 89 e9             	mov    rcx,rbp
      cea30c:	4d 89 f8             	mov    r8,r15
      cea30f:	e8 ca 16 00 00       	call   ceb9de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23897e>
      cea314:	41 89 c5             	mov    r13d,eax
      cea317:	e9 03 08 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea31c:	80 7b 69 00          	cmp    BYTE PTR [rbx+0x69],0x0
      cea320:	74 40                	je     cea362 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237302>
      cea322:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea329:	00 
      cea32a:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea32d:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea334:	00 00 
      cea336:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea33b:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea33f:	6a 04                	push   0x4
      cea341:	5f                   	pop    rdi
      cea342:	6a ff                	push   0xffffffffffffffff
      cea344:	5a                   	pop    rdx

### call 0xcea352: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea314:	41 89 c5             	mov    r13d,eax
      cea317:	e9 03 08 00 00       	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      cea31c:	80 7b 69 00          	cmp    BYTE PTR [rbx+0x69],0x0
      cea320:	74 40                	je     cea362 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237302>
      cea322:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      cea329:	00 
      cea32a:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      cea32d:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      cea334:	00 00 
      cea336:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      cea33b:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      cea33f:	6a 04                	push   0x4
      cea341:	5f                   	pop    rdi
      cea342:	6a ff                	push   0xffffffffffffffff
      cea344:	5a                   	pop    rdx
      cea345:	e8 6a 2f 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      cea34a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea351:	00 

### call 0xcea412: call   17eeb90 <memset@plt>
      cea3cb:	44 88 a4 24 68 03 00 	mov    BYTE PTR [rsp+0x368],r12b
      cea3d2:	00 
      cea3d3:	44 88 a4 24 6c 03 00 	mov    BYTE PTR [rsp+0x36c],r12b
      cea3da:	00 
      cea3db:	44 88 a4 24 70 03 00 	mov    BYTE PTR [rsp+0x370],r12b
      cea3e2:	00 
      cea3e3:	44 88 a4 24 78 03 00 	mov    BYTE PTR [rsp+0x378],r12b
      cea3ea:	00 
      cea3eb:	44 88 a4 24 90 03 00 	mov    BYTE PTR [rsp+0x390],r12b
      cea3f2:	00 
      cea3f3:	44 88 a4 24 98 03 00 	mov    BYTE PTR [rsp+0x398],r12b
      cea3fa:	00 
      cea3fb:	44 88 a4 24 18 04 00 	mov    BYTE PTR [rsp+0x418],r12b
      cea402:	00 
      cea403:	ba 94 00 00 00       	mov    edx,0x94
      cea408:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea40f:	00 
      cea410:	31 f6                	xor    esi,esi

### call 0xcea525: call   QWORD PTR [rax+0x18]
      cea4dd:	00 00 
      cea4df:	44 88 a4 24 a0 02 00 	mov    BYTE PTR [rsp+0x2a0],r12b
      cea4e6:	00 
      cea4e7:	f3 0f 7f 84 24 90 02 	movdqu XMMWORD PTR [rsp+0x290],xmm0
      cea4ee:	00 00 
      cea4f0:	f3 0f 7f 84 24 80 02 	movdqu XMMWORD PTR [rsp+0x280],xmm0
      cea4f7:	00 00 
      cea4f9:	f3 0f 7f 84 24 70 02 	movdqu XMMWORD PTR [rsp+0x270],xmm0
      cea500:	00 00 
      cea502:	f3 0f 7f 84 24 c9 02 	movdqu XMMWORD PTR [rsp+0x2c9],xmm0
      cea509:	00 00 
      cea50b:	f3 0f 7f 84 24 c0 02 	movdqu XMMWORD PTR [rsp+0x2c0],xmm0
      cea512:	00 00 
      cea514:	4d 89 ee             	mov    r14,r13
      cea517:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
      cea51b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cea51e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea523:	31 d2                	xor    edx,edx

### call 0xcea55a: call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea517:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
      cea51b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cea51e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea523:	31 d2                	xor    edx,edx
      cea525:	ff 50 18             	call   QWORD PTR [rax+0x18]
      cea528:	49 8d 46 68          	lea    rax,[r14+0x68]
      cea52c:	4c 8d ac 24 98 00 00 	lea    r13,[rsp+0x98]
      cea533:	00 
      cea534:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      cea537:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea53c:	41 0f 11 44 24 01    	movups XMMWORD PTR [r12+0x1],xmm0
      cea542:	b0 20                	mov    al,0x20
      cea544:	41 88 04 24          	mov    BYTE PTR [r12],al
      cea548:	31 c0                	xor    eax,eax
      cea54a:	41 88 44 24 11       	mov    BYTE PTR [r12+0x11],al
      cea54f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea556:	00 
      cea557:	4c 89 e6             	mov    rsi,r12

### call 0xcea562: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea51e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea523:	31 d2                	xor    edx,edx
      cea525:	ff 50 18             	call   QWORD PTR [rax+0x18]
      cea528:	49 8d 46 68          	lea    rax,[r14+0x68]
      cea52c:	4c 8d ac 24 98 00 00 	lea    r13,[rsp+0x98]
      cea533:	00 
      cea534:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      cea537:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea53c:	41 0f 11 44 24 01    	movups XMMWORD PTR [r12+0x1],xmm0
      cea542:	b0 20                	mov    al,0x20
      cea544:	41 88 04 24          	mov    BYTE PTR [r12],al
      cea548:	31 c0                	xor    eax,eax
      cea54a:	41 88 44 24 11       	mov    BYTE PTR [r12+0x11],al
      cea54f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea556:	00 
      cea557:	4c 89 e6             	mov    rsi,r12
      cea55a:	e8 cf 14 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea55f:	4c 89 e7             	mov    rdi,r12

### call 0xcea597: call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea54f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea556:	00 
      cea557:	4c 89 e6             	mov    rsi,r12
      cea55a:	e8 cf 14 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea55f:	4c 89 e7             	mov    rdi,r12
      cea562:	e8 29 39 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea567:	4c 89 ef             	mov    rdi,r13
      cea56a:	41 c7 45 78 01 00 00 	mov    DWORD PTR [r13+0x78],0x1
      cea571:	00 
      cea572:	4d 89 f5             	mov    r13,r14
      cea575:	f3 41 0f 6f 46 78    	movdqu xmm0,XMMWORD PTR [r14+0x78]
      cea57b:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea582:	b0 20                	mov    al,0x20
      cea584:	41 88 04 24          	mov    BYTE PTR [r12],al
      cea588:	31 c0                	xor    eax,eax
      cea58a:	41 88 44 24 11       	mov    BYTE PTR [r12+0x11],al
      cea58f:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea594:	4c 89 e6             	mov    rsi,r12

### call 0xcea5c6: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea588:	31 c0                	xor    eax,eax
      cea58a:	41 88 44 24 11       	mov    BYTE PTR [r12+0x11],al
      cea58f:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea594:	4c 89 e6             	mov    rsi,r12
      cea597:	e8 92 14 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea59c:	4c 89 e7             	mov    rdi,r12
      cea59f:	e8 ec 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea5a4:	41 0f b6 47 18       	movzx  eax,BYTE PTR [r15+0x18]
      cea5a9:	a8 01                	test   al,0x1
      cea5ab:	74 06                	je     cea5b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237553>
      cea5ad:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      cea5b1:	eb 02                	jmp    cea5b5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237555>
      cea5b3:	d1 e8                	shr    eax,1
      cea5b5:	48 85 c0             	test   rax,rax
      cea5b8:	4d 89 ee             	mov    r14,r13
      cea5bb:	74 10                	je     cea5cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23756d>
      cea5bd:	49 8d 77 18          	lea    rsi,[r15+0x18]
      cea5c1:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### call 0xcea5d9: call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea597:	e8 92 14 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea59c:	4c 89 e7             	mov    rdi,r12
      cea59f:	e8 ec 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea5a4:	41 0f b6 47 18       	movzx  eax,BYTE PTR [r15+0x18]
      cea5a9:	a8 01                	test   al,0x1
      cea5ab:	74 06                	je     cea5b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237553>
      cea5ad:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      cea5b1:	eb 02                	jmp    cea5b5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237555>
      cea5b3:	d1 e8                	shr    eax,1
      cea5b5:	48 85 c0             	test   rax,rax
      cea5b8:	4d 89 ee             	mov    r14,r13
      cea5bb:	74 10                	je     cea5cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23756d>
      cea5bd:	49 8d 77 18          	lea    rsi,[r15+0x18]
      cea5c1:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5c6:	e8 75 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea5cb:	eb 11                	jmp    cea5de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23757e>
      cea5cd:	48 8d 35 44 76 76 ff 	lea    rsi,[rip+0xffffffffff767644]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      cea5d4:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### call 0xcea5eb: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea5a9:	a8 01                	test   al,0x1
      cea5ab:	74 06                	je     cea5b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237553>
      cea5ad:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      cea5b1:	eb 02                	jmp    cea5b5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237555>
      cea5b3:	d1 e8                	shr    eax,1
      cea5b5:	48 85 c0             	test   rax,rax
      cea5b8:	4d 89 ee             	mov    r14,r13
      cea5bb:	74 10                	je     cea5cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23756d>
      cea5bd:	49 8d 77 18          	lea    rsi,[r15+0x18]
      cea5c1:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5c6:	e8 75 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea5cb:	eb 11                	jmp    cea5de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23757e>
      cea5cd:	48 8d 35 44 76 76 ff 	lea    rsi,[rip+0xffffffffff767644]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      cea5d4:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5d9:	e8 a0 f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea5de:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      cea5e5:	00 
      cea5e6:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]

### call 0xcea5fd: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea5b3:	d1 e8                	shr    eax,1
      cea5b5:	48 85 c0             	test   rax,rax
      cea5b8:	4d 89 ee             	mov    r14,r13
      cea5bb:	74 10                	je     cea5cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23756d>
      cea5bd:	49 8d 77 18          	lea    rsi,[r15+0x18]
      cea5c1:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5c6:	e8 75 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea5cb:	eb 11                	jmp    cea5de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23757e>
      cea5cd:	48 8d 35 44 76 76 ff 	lea    rsi,[rip+0xffffffffff767644]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      cea5d4:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5d9:	e8 a0 f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea5de:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      cea5e5:	00 
      cea5e6:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea5eb:	e8 90 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea5f0:	4c 8d a4 24 e0 00 00 	lea    r12,[rsp+0xe0]
      cea5f7:	00 
      cea5f8:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### call 0xcea608: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea5bb:	74 10                	je     cea5cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23756d>
      cea5bd:	49 8d 77 18          	lea    rsi,[r15+0x18]
      cea5c1:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5c6:	e8 75 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea5cb:	eb 11                	jmp    cea5de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23757e>
      cea5cd:	48 8d 35 44 76 76 ff 	lea    rsi,[rip+0xffffffffff767644]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      cea5d4:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5d9:	e8 a0 f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea5de:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      cea5e5:	00 
      cea5e6:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea5eb:	e8 90 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea5f0:	4c 8d a4 24 e0 00 00 	lea    r12,[rsp+0xe0]
      cea5f7:	00 
      cea5f8:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5fd:	e8 8e 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea602:	4c 89 e7             	mov    rdi,r12
      cea605:	48 89 ee             	mov    rsi,rbp

### call 0xcea615: call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      cea5c6:	e8 75 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea5cb:	eb 11                	jmp    cea5de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23757e>
      cea5cd:	48 8d 35 44 76 76 ff 	lea    rsi,[rip+0xffffffffff767644]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      cea5d4:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5d9:	e8 a0 f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea5de:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      cea5e5:	00 
      cea5e6:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea5eb:	e8 90 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea5f0:	4c 8d a4 24 e0 00 00 	lea    r12,[rsp+0xe0]
      cea5f7:	00 
      cea5f8:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5fd:	e8 8e 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea602:	4c 89 e7             	mov    rdi,r12
      cea605:	48 89 ee             	mov    rsi,rbp
      cea608:	e8 73 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea60d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea612:	48 89 ee             	mov    rsi,rbp

### call 0xcea62a: call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea5de:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      cea5e5:	00 
      cea5e6:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea5eb:	e8 90 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea5f0:	4c 8d a4 24 e0 00 00 	lea    r12,[rsp+0xe0]
      cea5f7:	00 
      cea5f8:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5fd:	e8 8e 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea602:	4c 89 e7             	mov    rdi,r12
      cea605:	48 89 ee             	mov    rsi,rbp
      cea608:	e8 73 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea60d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea612:	48 89 ee             	mov    rsi,rbp
      cea615:	e8 d4 50 db ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      cea61a:	84 c0                	test   al,al
      cea61c:	74 13                	je     cea631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375d1>
      cea61e:	48 8d 35 57 79 76 ff 	lea    rsi,[rip+0xffffffffff767957]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cea625:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### call 0xcea63b: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea5f0:	4c 8d a4 24 e0 00 00 	lea    r12,[rsp+0xe0]
      cea5f7:	00 
      cea5f8:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea5fd:	e8 8e 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea602:	4c 89 e7             	mov    rdi,r12
      cea605:	48 89 ee             	mov    rsi,rbp
      cea608:	e8 73 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea60d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea612:	48 89 ee             	mov    rsi,rbp
      cea615:	e8 d4 50 db ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      cea61a:	84 c0                	test   al,al
      cea61c:	74 13                	je     cea631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375d1>
      cea61e:	48 8d 35 57 79 76 ff 	lea    rsi,[rip+0xffffffffff767957]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cea625:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea62a:	e8 4f f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea62f:	eb 0f                	jmp    cea640 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375e0>
      cea631:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea636:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]

### call 0xcea64d: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea602:	4c 89 e7             	mov    rdi,r12
      cea605:	48 89 ee             	mov    rsi,rbp
      cea608:	e8 73 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea60d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea612:	48 89 ee             	mov    rsi,rbp
      cea615:	e8 d4 50 db ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      cea61a:	84 c0                	test   al,al
      cea61c:	74 13                	je     cea631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375d1>
      cea61e:	48 8d 35 57 79 76 ff 	lea    rsi,[rip+0xffffffffff767957]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cea625:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea62a:	e8 4f f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea62f:	eb 0f                	jmp    cea640 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375e0>
      cea631:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea636:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      cea63b:	e8 00 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea640:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
      cea647:	00 
      cea648:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]

### call 0xcea657: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea608:	e8 73 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea60d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cea612:	48 89 ee             	mov    rsi,rbp
      cea615:	e8 d4 50 db ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      cea61a:	84 c0                	test   al,al
      cea61c:	74 13                	je     cea631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375d1>
      cea61e:	48 8d 35 57 79 76 ff 	lea    rsi,[rip+0xffffffffff767957]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cea625:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea62a:	e8 4f f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea62f:	eb 0f                	jmp    cea640 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375e0>
      cea631:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea636:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      cea63b:	e8 00 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea640:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
      cea647:	00 
      cea648:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea64d:	e8 2e 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea652:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### call 0xcea66f: call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea61c:	74 13                	je     cea631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375d1>
      cea61e:	48 8d 35 57 79 76 ff 	lea    rsi,[rip+0xffffffffff767957]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cea625:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea62a:	e8 4f f4 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea62f:	eb 0f                	jmp    cea640 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2375e0>
      cea631:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea636:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      cea63b:	e8 00 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea640:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
      cea647:	00 
      cea648:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea64d:	e8 2e 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea652:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea657:	e8 34 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea65c:	49 8d b7 b0 08 00 00 	lea    rsi,[r15+0x8b0]
      cea663:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea668:	b9 00 04 00 00       	mov    ecx,0x400
      cea66d:	31 d2                	xor    edx,edx

### call 0xcea68c: call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea63b:	e8 00 39 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea640:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
      cea647:	00 
      cea648:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea64d:	e8 2e 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea652:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea657:	e8 34 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea65c:	49 8d b7 b0 08 00 00 	lea    rsi,[r15+0x8b0]
      cea663:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea668:	b9 00 04 00 00       	mov    ecx,0x400
      cea66d:	31 d2                	xor    edx,edx
      cea66f:	e8 b0 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea674:	bd 98 00 00 00       	mov    ebp,0x98
      cea679:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea680:	00 
      cea681:	48 01 ef             	add    rdi,rbp
      cea684:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea689:	4c 89 e6             	mov    rsi,r12

### call 0xcea694: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea647:	00 
      cea648:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea64d:	e8 2e 3a b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea652:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea657:	e8 34 38 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea65c:	49 8d b7 b0 08 00 00 	lea    rsi,[r15+0x8b0]
      cea663:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea668:	b9 00 04 00 00       	mov    ecx,0x400
      cea66d:	31 d2                	xor    edx,edx
      cea66f:	e8 b0 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea674:	bd 98 00 00 00       	mov    ebp,0x98
      cea679:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea680:	00 
      cea681:	48 01 ef             	add    rdi,rbp
      cea684:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea689:	4c 89 e6             	mov    rsi,r12
      cea68c:	e8 9d 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea691:	4c 89 e7             	mov    rdi,r12

### call 0xcea6a9: call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea65c:	49 8d b7 b0 08 00 00 	lea    rsi,[r15+0x8b0]
      cea663:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea668:	b9 00 04 00 00       	mov    ecx,0x400
      cea66d:	31 d2                	xor    edx,edx
      cea66f:	e8 b0 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea674:	bd 98 00 00 00       	mov    ebp,0x98
      cea679:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea680:	00 
      cea681:	48 01 ef             	add    rdi,rbp
      cea684:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea689:	4c 89 e6             	mov    rsi,r12
      cea68c:	e8 9d 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea691:	4c 89 e7             	mov    rdi,r12
      cea694:	e8 f7 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea699:	49 8d 77 48          	lea    rsi,[r15+0x48]
      cea69d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea6a2:	b9 00 04 00 00       	mov    ecx,0x400
      cea6a7:	31 d2                	xor    edx,edx

### call 0xcea6be: call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea674:	bd 98 00 00 00       	mov    ebp,0x98
      cea679:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cea680:	00 
      cea681:	48 01 ef             	add    rdi,rbp
      cea684:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea689:	4c 89 e6             	mov    rsi,r12
      cea68c:	e8 9d 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea691:	4c 89 e7             	mov    rdi,r12
      cea694:	e8 f7 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea699:	49 8d 77 48          	lea    rsi,[r15+0x48]
      cea69d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea6a2:	b9 00 04 00 00       	mov    ecx,0x400
      cea6a7:	31 d2                	xor    edx,edx
      cea6a9:	e8 76 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea6ae:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      cea6b5:	00 
      cea6b6:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea6bb:	4c 89 e6             	mov    rsi,r12

### call 0xcea6c6: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea680:	00 
      cea681:	48 01 ef             	add    rdi,rbp
      cea684:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea689:	4c 89 e6             	mov    rsi,r12
      cea68c:	e8 9d 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea691:	4c 89 e7             	mov    rdi,r12
      cea694:	e8 f7 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea699:	49 8d 77 48          	lea    rsi,[r15+0x48]
      cea69d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea6a2:	b9 00 04 00 00       	mov    ecx,0x400
      cea6a7:	31 d2                	xor    edx,edx
      cea6a9:	e8 76 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea6ae:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      cea6b5:	00 
      cea6b6:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea6bb:	4c 89 e6             	mov    rsi,r12
      cea6be:	e8 6b 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea6c3:	4c 89 e7             	mov    rdi,r12

### call 0xcea6d2: call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cea684:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea689:	4c 89 e6             	mov    rsi,r12
      cea68c:	e8 9d 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea691:	4c 89 e7             	mov    rdi,r12
      cea694:	e8 f7 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea699:	49 8d 77 48          	lea    rsi,[r15+0x48]
      cea69d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea6a2:	b9 00 04 00 00       	mov    ecx,0x400
      cea6a7:	31 d2                	xor    edx,edx
      cea6a9:	e8 76 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea6ae:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      cea6b5:	00 
      cea6b6:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea6bb:	4c 89 e6             	mov    rsi,r12
      cea6be:	e8 6b 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea6c3:	4c 89 e7             	mov    rdi,r12
      cea6c6:	e8 c5 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea6cb:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]

### call 0xcea6e8: call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
      cea699:	49 8d 77 48          	lea    rsi,[r15+0x48]
      cea69d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea6a2:	b9 00 04 00 00       	mov    ecx,0x400
      cea6a7:	31 d2                	xor    edx,edx
      cea6a9:	e8 76 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea6ae:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      cea6b5:	00 
      cea6b6:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea6bb:	4c 89 e6             	mov    rsi,r12
      cea6be:	e8 6b 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea6c3:	4c 89 e7             	mov    rdi,r12
      cea6c6:	e8 c5 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea6cb:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
      cea6d2:	e8 8b fd d8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cea6d7:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      cea6de:	00 
      cea6df:	48 89 47 80          	mov    QWORD PTR [rdi-0x80],rax
      cea6e3:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]

### call 0xcea6fc: call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
      cea6a9:	e8 76 2f dd ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      cea6ae:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      cea6b5:	00 
      cea6b6:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea6bb:	4c 89 e6             	mov    rsi,r12
      cea6be:	e8 6b 13 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea6c3:	4c 89 e7             	mov    rdi,r12
      cea6c6:	e8 c5 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea6cb:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
      cea6d2:	e8 8b fd d8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cea6d7:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      cea6de:	00 
      cea6df:	48 89 47 80          	mov    QWORD PTR [rdi-0x80],rax
      cea6e3:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      cea6e8:	e8 73 da e5 ff       	call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
      cea6ed:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
      cea6f4:	00 
      cea6f5:	49 8d b7 e0 08 00 00 	lea    rsi,[r15+0x8e0]

### call 0xcea73d: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea6f5:	49 8d b7 e0 08 00 00 	lea    rsi,[r15+0x8e0]
      cea6fc:	e8 59 ad de ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
      cea701:	41 8b 87 2c 01 00 00 	mov    eax,DWORD PTR [r15+0x12c]
      cea708:	a9 fb ff ff ff       	test   eax,0xfffffffb
      cea70d:	75 07                	jne    cea716 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376b6>
      cea70f:	89 84 24 48 01 00 00 	mov    DWORD PTR [rsp+0x148],eax
      cea716:	41 0f b6 87 98 00 00 	movzx  eax,BYTE PTR [r15+0x98]
      cea71d:	00 
      cea71e:	a8 01                	test   al,0x1
      cea720:	74 09                	je     cea72b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376cb>
      cea722:	49 8b 87 a0 00 00 00 	mov    rax,QWORD PTR [r15+0xa0]
      cea729:	eb 02                	jmp    cea72d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376cd>
      cea72b:	d1 e8                	shr    eax,1
      cea72d:	48 85 c0             	test   rax,rax
      cea730:	74 12                	je     cea744 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376e4>
      cea732:	4c 01 fd             	add    rbp,r15
      cea735:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea73a:	48 89 ee             	mov    rsi,rbp

### call 0xcea750: call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea70d:	75 07                	jne    cea716 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376b6>
      cea70f:	89 84 24 48 01 00 00 	mov    DWORD PTR [rsp+0x148],eax
      cea716:	41 0f b6 87 98 00 00 	movzx  eax,BYTE PTR [r15+0x98]
      cea71d:	00 
      cea71e:	a8 01                	test   al,0x1
      cea720:	74 09                	je     cea72b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376cb>
      cea722:	49 8b 87 a0 00 00 00 	mov    rax,QWORD PTR [r15+0xa0]
      cea729:	eb 02                	jmp    cea72d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376cd>
      cea72b:	d1 e8                	shr    eax,1
      cea72d:	48 85 c0             	test   rax,rax
      cea730:	74 12                	je     cea744 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376e4>
      cea732:	4c 01 fd             	add    rbp,r15
      cea735:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea73a:	48 89 ee             	mov    rsi,rbp
      cea73d:	e8 fe 37 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea742:	eb 11                	jmp    cea755 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376f5>
      cea744:	48 8d 35 cd cb 64 ff 	lea    rsi,[rip+0xffffffffff64cbcd]        # 337318 <_ZTSSt12bad_any_cast@@Base-0x58eb0>
      cea74b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### call 0xcea762: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea71e:	a8 01                	test   al,0x1
      cea720:	74 09                	je     cea72b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376cb>
      cea722:	49 8b 87 a0 00 00 00 	mov    rax,QWORD PTR [r15+0xa0]
      cea729:	eb 02                	jmp    cea72d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376cd>
      cea72b:	d1 e8                	shr    eax,1
      cea72d:	48 85 c0             	test   rax,rax
      cea730:	74 12                	je     cea744 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376e4>
      cea732:	4c 01 fd             	add    rbp,r15
      cea735:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea73a:	48 89 ee             	mov    rsi,rbp
      cea73d:	e8 fe 37 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea742:	eb 11                	jmp    cea755 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376f5>
      cea744:	48 8d 35 cd cb 64 ff 	lea    rsi,[rip+0xffffffffff64cbcd]        # 337318 <_ZTSSt12bad_any_cast@@Base-0x58eb0>
      cea74b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea750:	e8 29 f3 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea755:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      cea75c:	00 
      cea75d:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]

### call 0xcea76c: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea722:	49 8b 87 a0 00 00 00 	mov    rax,QWORD PTR [r15+0xa0]
      cea729:	eb 02                	jmp    cea72d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376cd>
      cea72b:	d1 e8                	shr    eax,1
      cea72d:	48 85 c0             	test   rax,rax
      cea730:	74 12                	je     cea744 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376e4>
      cea732:	4c 01 fd             	add    rbp,r15
      cea735:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea73a:	48 89 ee             	mov    rsi,rbp
      cea73d:	e8 fe 37 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea742:	eb 11                	jmp    cea755 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376f5>
      cea744:	48 8d 35 cd cb 64 ff 	lea    rsi,[rip+0xffffffffff64cbcd]        # 337318 <_ZTSSt12bad_any_cast@@Base-0x58eb0>
      cea74b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea750:	e8 29 f3 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea755:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      cea75c:	00 
      cea75d:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea762:	e8 19 39 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea767:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### call 0xcea782: call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea730:	74 12                	je     cea744 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376e4>
      cea732:	4c 01 fd             	add    rbp,r15
      cea735:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea73a:	48 89 ee             	mov    rsi,rbp
      cea73d:	e8 fe 37 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cea742:	eb 11                	jmp    cea755 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2376f5>
      cea744:	48 8d 35 cd cb 64 ff 	lea    rsi,[rip+0xffffffffff64cbcd]        # 337318 <_ZTSSt12bad_any_cast@@Base-0x58eb0>
      cea74b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea750:	e8 29 f3 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea755:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      cea75c:	00 
      cea75d:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea762:	e8 19 39 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea767:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea76c:	e8 1f 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea771:	49 81 c6 98 00 00 00 	add    r14,0x98
      cea778:	48 8d 35 69 f3 74 ff 	lea    rsi,[rip+0xffffffffff74f369]        # 439ae8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f537>
      cea77f:	4c 89 f7             	mov    rdi,r14

### call 0xcea797: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea744:	48 8d 35 cd cb 64 ff 	lea    rsi,[rip+0xffffffffff64cbcd]        # 337318 <_ZTSSt12bad_any_cast@@Base-0x58eb0>
      cea74b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea750:	e8 29 f3 d8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cea755:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      cea75c:	00 
      cea75d:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea762:	e8 19 39 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea767:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea76c:	e8 1f 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea771:	49 81 c6 98 00 00 00 	add    r14,0x98
      cea778:	48 8d 35 69 f3 74 ff 	lea    rsi,[rip+0xffffffffff74f369]        # 439ae8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f537>
      cea77f:	4c 89 f7             	mov    rdi,r14
      cea782:	e8 e5 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea787:	48 85 c0             	test   rax,rax
      cea78a:	74 10                	je     cea79c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23773c>
      cea78c:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      cea793:	00 
      cea794:	48 89 c6             	mov    rsi,rax

### call 0xcea7a6: call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea755:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      cea75c:	00 
      cea75d:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      cea762:	e8 19 39 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea767:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      cea76c:	e8 1f 37 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea771:	49 81 c6 98 00 00 00 	add    r14,0x98
      cea778:	48 8d 35 69 f3 74 ff 	lea    rsi,[rip+0xffffffffff74f369]        # 439ae8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f537>
      cea77f:	4c 89 f7             	mov    rdi,r14
      cea782:	e8 e5 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea787:	48 85 c0             	test   rax,rax
      cea78a:	74 10                	je     cea79c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23773c>
      cea78c:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      cea793:	00 
      cea794:	48 89 c6             	mov    rsi,rax
      cea797:	e8 e4 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea79c:	48 8d 35 2d f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32d]        # 439ad0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f51f>
      cea7a3:	4c 89 f7             	mov    rdi,r14

### call 0xcea7bb: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea771:	49 81 c6 98 00 00 00 	add    r14,0x98
      cea778:	48 8d 35 69 f3 74 ff 	lea    rsi,[rip+0xffffffffff74f369]        # 439ae8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f537>
      cea77f:	4c 89 f7             	mov    rdi,r14
      cea782:	e8 e5 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea787:	48 85 c0             	test   rax,rax
      cea78a:	74 10                	je     cea79c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23773c>
      cea78c:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      cea793:	00 
      cea794:	48 89 c6             	mov    rsi,rax
      cea797:	e8 e4 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea79c:	48 8d 35 2d f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32d]        # 439ad0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f51f>
      cea7a3:	4c 89 f7             	mov    rdi,r14
      cea7a6:	e8 c1 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7ab:	48 85 c0             	test   rax,rax
      cea7ae:	74 10                	je     cea7c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237760>
      cea7b0:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      cea7b7:	00 
      cea7b8:	48 89 c6             	mov    rsi,rax

### call 0xcea7ca: call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea782:	e8 e5 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea787:	48 85 c0             	test   rax,rax
      cea78a:	74 10                	je     cea79c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23773c>
      cea78c:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      cea793:	00 
      cea794:	48 89 c6             	mov    rsi,rax
      cea797:	e8 e4 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea79c:	48 8d 35 2d f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32d]        # 439ad0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f51f>
      cea7a3:	4c 89 f7             	mov    rdi,r14
      cea7a6:	e8 c1 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7ab:	48 85 c0             	test   rax,rax
      cea7ae:	74 10                	je     cea7c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237760>
      cea7b0:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      cea7b7:	00 
      cea7b8:	48 89 c6             	mov    rsi,rax
      cea7bb:	e8 c0 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7c0:	48 8d 35 91 63 d0 00 	lea    rsi,[rip+0xd06391]        # 19f0b58 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2288>
      cea7c7:	4c 89 f7             	mov    rdi,r14

### call 0xcea7df: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea797:	e8 e4 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea79c:	48 8d 35 2d f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32d]        # 439ad0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f51f>
      cea7a3:	4c 89 f7             	mov    rdi,r14
      cea7a6:	e8 c1 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7ab:	48 85 c0             	test   rax,rax
      cea7ae:	74 10                	je     cea7c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237760>
      cea7b0:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      cea7b7:	00 
      cea7b8:	48 89 c6             	mov    rsi,rax
      cea7bb:	e8 c0 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7c0:	48 8d 35 91 63 d0 00 	lea    rsi,[rip+0xd06391]        # 19f0b58 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2288>
      cea7c7:	4c 89 f7             	mov    rdi,r14
      cea7ca:	e8 9d 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7cf:	48 85 c0             	test   rax,rax
      cea7d2:	74 10                	je     cea7e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237784>
      cea7d4:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
      cea7db:	00 
      cea7dc:	48 89 c6             	mov    rsi,rax

### call 0xcea7fd: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7b7:	00 
      cea7b8:	48 89 c6             	mov    rsi,rax
      cea7bb:	e8 c0 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7c0:	48 8d 35 91 63 d0 00 	lea    rsi,[rip+0xd06391]        # 19f0b58 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2288>
      cea7c7:	4c 89 f7             	mov    rdi,r14
      cea7ca:	e8 9d 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7cf:	48 85 c0             	test   rax,rax
      cea7d2:	74 10                	je     cea7e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237784>
      cea7d4:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
      cea7db:	00 
      cea7dc:	48 89 c6             	mov    rsi,rax
      cea7df:	e8 9c 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7e4:	41 80 bf 18 09 00 00 	cmp    BYTE PTR [r15+0x918],0x0
      cea7eb:	00 
      cea7ec:	74 14                	je     cea802 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377a2>
      cea7ee:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
      cea7f5:	00 
      cea7f6:	49 8d b7 00 09 00 00 	lea    rsi,[r15+0x900]

### call 0xcea80c: call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7c0:	48 8d 35 91 63 d0 00 	lea    rsi,[rip+0xd06391]        # 19f0b58 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2288>
      cea7c7:	4c 89 f7             	mov    rdi,r14
      cea7ca:	e8 9d 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea7cf:	48 85 c0             	test   rax,rax
      cea7d2:	74 10                	je     cea7e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237784>
      cea7d4:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
      cea7db:	00 
      cea7dc:	48 89 c6             	mov    rsi,rax
      cea7df:	e8 9c 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7e4:	41 80 bf 18 09 00 00 	cmp    BYTE PTR [r15+0x918],0x0
      cea7eb:	00 
      cea7ec:	74 14                	je     cea802 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377a2>
      cea7ee:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
      cea7f5:	00 
      cea7f6:	49 8d b7 00 09 00 00 	lea    rsi,[r15+0x900]
      cea7fd:	e8 7e 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea802:	48 8d 35 2f f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32f]        # 439b38 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f587>
      cea809:	4c 89 f7             	mov    rdi,r14

### call 0xcea821: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7db:	00 
      cea7dc:	48 89 c6             	mov    rsi,rax
      cea7df:	e8 9c 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7e4:	41 80 bf 18 09 00 00 	cmp    BYTE PTR [r15+0x918],0x0
      cea7eb:	00 
      cea7ec:	74 14                	je     cea802 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377a2>
      cea7ee:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
      cea7f5:	00 
      cea7f6:	49 8d b7 00 09 00 00 	lea    rsi,[r15+0x900]
      cea7fd:	e8 7e 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea802:	48 8d 35 2f f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32f]        # 439b38 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f587>
      cea809:	4c 89 f7             	mov    rdi,r14
      cea80c:	e8 5b 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea811:	48 85 c0             	test   rax,rax
      cea814:	74 10                	je     cea826 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377c6>
      cea816:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      cea81d:	00 
      cea81e:	48 89 c6             	mov    rsi,rax

### call 0xcea831: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea7eb:	00 
      cea7ec:	74 14                	je     cea802 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377a2>
      cea7ee:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
      cea7f5:	00 
      cea7f6:	49 8d b7 00 09 00 00 	lea    rsi,[r15+0x900]
      cea7fd:	e8 7e 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea802:	48 8d 35 2f f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32f]        # 439b38 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f587>
      cea809:	4c 89 f7             	mov    rdi,r14
      cea80c:	e8 5b 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea811:	48 85 c0             	test   rax,rax
      cea814:	74 10                	je     cea826 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377c6>
      cea816:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      cea81d:	00 
      cea81e:	48 89 c6             	mov    rsi,rax
      cea821:	e8 5a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea826:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
      cea82d:	00 
      cea82e:	4c 89 fe             	mov    rsi,r15

### call 0xcea842: call   a7b836 <JNI_OnUnload@@Base+0x3103>
      cea7f6:	49 8d b7 00 09 00 00 	lea    rsi,[r15+0x900]
      cea7fd:	e8 7e 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea802:	48 8d 35 2f f3 74 ff 	lea    rsi,[rip+0xffffffffff74f32f]        # 439b38 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f587>
      cea809:	4c 89 f7             	mov    rdi,r14
      cea80c:	e8 5b 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea811:	48 85 c0             	test   rax,rax
      cea814:	74 10                	je     cea826 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377c6>
      cea816:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      cea81d:	00 
      cea81e:	48 89 c6             	mov    rsi,rax
      cea821:	e8 5a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea826:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
      cea82d:	00 
      cea82e:	4c 89 fe             	mov    rsi,r15
      cea831:	e8 4a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea836:	4c 8d ac 24 70 04 00 	lea    r13,[rsp+0x470]
      cea83d:	00 
      cea83e:	49 8d 7f 30          	lea    rdi,[r15+0x30]

### call 0xcea84d: call   152bf6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3714f1>
      cea809:	4c 89 f7             	mov    rdi,r14
      cea80c:	e8 5b 0c f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea811:	48 85 c0             	test   rax,rax
      cea814:	74 10                	je     cea826 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377c6>
      cea816:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      cea81d:	00 
      cea81e:	48 89 c6             	mov    rsi,rax
      cea821:	e8 5a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea826:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
      cea82d:	00 
      cea82e:	4c 89 fe             	mov    rsi,r15
      cea831:	e8 4a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea836:	4c 8d ac 24 70 04 00 	lea    r13,[rsp+0x470]
      cea83d:	00 
      cea83e:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      cea842:	e8 ef 0f d9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      cea847:	48 89 c7             	mov    rdi,rax
      cea84a:	48 89 d6             	mov    rsi,rdx

### call 0xcea8c8: call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea87d:	00 
      cea87e:	41 0f b6 87 b6 00 00 	movzx  eax,BYTE PTR [r15+0xb6]
      cea885:	00 
      cea886:	09 c8                	or     eax,ecx
      cea888:	66 89 84 24 b7 01 00 	mov    WORD PTR [rsp+0x1b7],ax
      cea88f:	00 
      cea890:	41 80 7d 14 00       	cmp    BYTE PTR [r13+0x14],0x0
      cea895:	74 3e                	je     cea8d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237875>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea8a3:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea8a8:	41 89 44 24 11       	mov    DWORD PTR [r12+0x11],eax
      cea8ad:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      cea8b3:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea8ba:	41 c6 04 24 28       	mov    BYTE PTR [r12],0x28
      cea8bf:	41 c6 44 24 15 00    	mov    BYTE PTR [r12+0x15],0x0
      cea8c5:	4c 89 e6             	mov    rsi,r12

### call 0xcea8d0: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea885:	00 
      cea886:	09 c8                	or     eax,ecx
      cea888:	66 89 84 24 b7 01 00 	mov    WORD PTR [rsp+0x1b7],ax
      cea88f:	00 
      cea890:	41 80 7d 14 00       	cmp    BYTE PTR [r13+0x14],0x0
      cea895:	74 3e                	je     cea8d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237875>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea8a3:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea8a8:	41 89 44 24 11       	mov    DWORD PTR [r12+0x11],eax
      cea8ad:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      cea8b3:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea8ba:	41 c6 04 24 28       	mov    BYTE PTR [r12],0x28
      cea8bf:	41 c6 44 24 15 00    	mov    BYTE PTR [r12+0x15],0x0
      cea8c5:	4c 89 e6             	mov    rsi,r12
      cea8c8:	e8 61 11 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea8cd:	4c 89 e7             	mov    rdi,r12

### call 0xcea9d5: call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea989:	88 84 24 f1 01 00 00 	mov    BYTE PTR [rsp+0x1f1],al
      cea990:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      cea994:	8a 00                	mov    al,BYTE PTR [rax]
      cea996:	24 01                	and    al,0x1
      cea998:	88 84 24 f2 01 00 00 	mov    BYTE PTR [rsp+0x1f2],al
      cea99f:	48 8d b3 b8 03 00 00 	lea    rsi,[rbx+0x3b8]
      cea9a6:	4c 89 ff             	mov    rdi,r15
      cea9a9:	e8 d2 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9ae:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax

### call 0xcea9e4: call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea996:	24 01                	and    al,0x1
      cea998:	88 84 24 f2 01 00 00 	mov    BYTE PTR [rsp+0x1f2],al
      cea99f:	48 8d b3 b8 03 00 00 	lea    rsi,[rbx+0x3b8]
      cea9a6:	4c 89 ff             	mov    rdi,r15
      cea9a9:	e8 d2 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9ae:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14

### call 0xcea9f9: call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9b3:	4d 89 ee             	mov    r14,r13
      cea9b6:	48 8d 35 63 f1 74 ff 	lea    rsi,[rip+0xffffffffff74f163]        # 439b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f56f>
      cea9bd:	4c 89 ef             	mov    rdi,r13
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax

### call 0xceaa08: call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c0:	e8 a7 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9c5:	48 85 c0             	test   rax,rax
      cea9c8:	74 10                	je     cea9da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23797a>
      cea9ca:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      cea9d1:	00 
      cea9d2:	48 89 c6             	mov    rsi,rax
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14

### call 0xceaa1d: call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9d5:	e8 a6 36 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea9da:	48 8d 35 a7 61 d0 00 	lea    rsi,[rip+0xd061a7]        # 19f0b88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x22b8>
      cea9e1:	4c 89 f7             	mov    rdi,r14
      cea9e4:	e8 83 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      cea9e9:	48 85 c0             	test   rax,rax
      cea9ec:	74 10                	je     cea9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23799e>
      cea9ee:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      cea9f5:	00 
      cea9f6:	48 89 c6             	mov    rsi,rax
      cea9f9:	e8 3c 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      cea9fe:	48 8d 35 4b f1 74 ff 	lea    rsi,[rip+0xffffffffff74f14b]        # 439b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f59f>
      ceaa05:	4c 89 f7             	mov    rdi,r14
      ceaa08:	e8 5f 0a f7 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      ceaa0d:	48 85 c0             	test   rax,rax
      ceaa10:	74 10                	je     ceaa22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2379c2>
      ceaa12:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
      ceaa19:	00 
      ceaa1a:	48 89 c6             	mov    rsi,rax

### call 0xceaa5d: call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa1a:	48 89 c6             	mov    rsi,rax
      ceaa1d:	e8 18 79 e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      ceaa22:	31 c0                	xor    eax,eax
      ceaa24:	88 84 24 62 02 00 00 	mov    BYTE PTR [rsp+0x262],al
      ceaa2b:	c7 84 24 6c 03 00 00 	mov    DWORD PTR [rsp+0x36c],0x2
      ceaa32:	02 00 00 00 
      ceaa36:	c6 84 24 70 03 00 00 	mov    BYTE PTR [rsp+0x370],0x1
      ceaa3d:	01 
      ceaa3e:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ceaa43:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaa46:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaa4d:	00 00 
      ceaa4f:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaa54:	88 46 11             	mov    BYTE PTR [rsi+0x11],al
      ceaa57:	6a 02                	push   0x2
      ceaa59:	5f                   	pop    rdi
      ceaa5a:	6a ff                	push   0xffffffffffffffff
      ceaa5c:	5a                   	pop    rdx

### call 0xceaa67: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa22:	31 c0                	xor    eax,eax
      ceaa24:	88 84 24 62 02 00 00 	mov    BYTE PTR [rsp+0x262],al
      ceaa2b:	c7 84 24 6c 03 00 00 	mov    DWORD PTR [rsp+0x36c],0x2
      ceaa32:	02 00 00 00 
      ceaa36:	c6 84 24 70 03 00 00 	mov    BYTE PTR [rsp+0x370],0x1
      ceaa3d:	01 
      ceaa3e:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ceaa43:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaa46:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaa4d:	00 00 
      ceaa4f:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaa54:	88 46 11             	mov    BYTE PTR [rsi+0x11],al
      ceaa57:	6a 02                	push   0x2
      ceaa59:	5f                   	pop    rdi
      ceaa5a:	6a ff                	push   0xffffffffffffffff
      ceaa5c:	5a                   	pop    rdx
      ceaa5d:	e8 52 28 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### call 0xceaa80: call   QWORD PTR [rax+0x18]
      ceaa3e:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ceaa43:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaa46:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaa4d:	00 00 
      ceaa4f:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaa54:	88 46 11             	mov    BYTE PTR [rsi+0x11],al
      ceaa57:	6a 02                	push   0x2
      ceaa59:	5f                   	pop    rdi
      ceaa5a:	6a ff                	push   0xffffffffffffffff
      ceaa5c:	5a                   	pop    rdx
      ceaa5d:	e8 52 28 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 

### call 0xceaaa2: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa5a:	6a ff                	push   0xffffffffffffffff
      ceaa5c:	5a                   	pop    rdx
      ceaa5d:	e8 52 28 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]

### call 0xceaaaf: call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 

### call 0xceaad9: call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx

### call 0xceaae3: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]

### call 0xceaaf3: call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]

### call 0xceab00: call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]

### call 0xceab0d: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]

### call 0xceab1a: call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 

### call 0xceab84: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab5c:	eb 38                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab5e:	eb 36                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab60:	eb 34                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab62:	eb 32                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab64:	eb 30                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab66:	eb 2e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab68:	eb 2c                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6a:	eb 2a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6c:	eb 0e                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab6e:	eb 0c                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab70:	eb 24                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab72:	eb 22                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab74:	eb 20                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab76:	eb 1e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab78:	eb 02                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab7a:	eb 1a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab7c:	48 89 c3             	mov    rbx,rax
      ceab7f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### call 0xceab9e: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab6e:	eb 0c                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab70:	eb 24                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab72:	eb 22                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab74:	eb 20                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab76:	eb 1e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab78:	eb 02                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab7a:	eb 1a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab7c:	48 89 c3             	mov    rbx,rax
      ceab7f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceab84:	e8 07 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab89:	eb 0e                	jmp    ceab99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b39>
      ceab8b:	eb 09                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab8d:	48 89 c3             	mov    rbx,rax
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]

### call 0xceabab: call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab74:	eb 20                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab76:	eb 1e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab78:	eb 02                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab7a:	eb 1a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab7c:	48 89 c3             	mov    rbx,rax
      ceab7f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceab84:	e8 07 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab89:	eb 0e                	jmp    ceab99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b39>
      ceab8b:	eb 09                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab8d:	48 89 c3             	mov    rbx,rax
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 

### call 0xceabbd: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab7f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceab84:	e8 07 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab89:	eb 0e                	jmp    ceab99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b39>
      ceab8b:	eb 09                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab8d:	48 89 c3             	mov    rbx,rax
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 

### call 0xceabd8: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx

### call 0xceabdd: call   17efab0 <__stack_chk_fail@plt>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx
      ceabd8:	e8 f3 50 d8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

## Final 0x180 bytes / return path
      ceaa62:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa67:	e8 24 34 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaa6c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      ceaa70:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ceaa73:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceaa78:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      ceaa7f:	00 
      ceaa80:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ceaa83:	8b 44 24 7c          	mov    eax,DWORD PTR [rsp+0x7c]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
      ceaa8b:	f3 0f 6f 44 24 6c    	movdqu xmm0,XMMWORD PTR [rsp+0x6c]
      ceaa91:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      ceaa96:	83 7c 24 68 01       	cmp    DWORD PTR [rsp+0x68],0x1
      ceaa9b:	75 1c                	jne    ceaab9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237a59>
      ceaa9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceaaa2:	e8 e9 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaaa7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceaaae:	00 
      ceaaaf:	e8 2e 16 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceaab4:	45 31 ed             	xor    r13d,r13d
      ceaab7:	eb 66                	jmp    ceab1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237abf>
      ceaab9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      ceaabe:	c6 06 20             	mov    BYTE PTR [rsi],0x20
      ceaac1:	66 0f 6f 84 24 20 04 	movdqa xmm0,XMMWORD PTR [rsp+0x420]
      ceaac8:	00 00 
      ceaaca:	f3 0f 7f 46 01       	movdqu XMMWORD PTR [rsi+0x1],xmm0
      ceaacf:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
      ceaad3:	6a 03                	push   0x3
      ceaad5:	5f                   	pop    rdi
      ceaad6:	6a ff                	push   0xffffffffffffffff
      ceaad8:	5a                   	pop    rdx
      ceaad9:	e8 d6 27 84 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
      ceaade:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceaae3:	e8 a8 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaae8:	8b 74 24 68          	mov    esi,DWORD PTR [rsp+0x68]
      ceaaec:	0f b6 bb 99 00 00 00 	movzx  edi,BYTE PTR [rbx+0x99]
      ceaaf3:	e8 ae 11 00 00       	call   cebca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238c46>
      ceaaf8:	c6 43 69 01          	mov    BYTE PTR [rbx+0x69],0x1
      ceaafc:	8b 7c 24 68          	mov    edi,DWORD PTR [rsp+0x68]
      ceab00:	e8 bd 10 00 00       	call   cebbc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238b62>
      ceab05:	41 89 c5             	mov    r13d,eax
      ceab08:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab0d:	e8 7e 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab12:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceab19:	00 
      ceab1a:	e8 c3 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceab1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceab26:	00 00 
      ceab28:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceab2f:	00 
      ceab30:	0f 85 a7 00 00 00    	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceab36:	48 8d 15 8b cf c4 00 	lea    rdx,[rip+0xc4cf8b]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      ceab3d:	44 89 e8             	mov    eax,r13d
      ceab40:	48 81 c4 38 04 00 00 	add    rsp,0x438
      ceab47:	5b                   	pop    rbx
      ceab48:	41 5c                	pop    r12
      ceab4a:	41 5d                	pop    r13
      ceab4c:	41 5e                	pop    r14
      ceab4e:	41 5f                	pop    r15
      ceab50:	5d                   	pop    rbp
      ceab51:	c3                   	ret
      ceab52:	48 89 c3             	mov    rbx,rax
      ceab55:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ceab5a:	eb 28                	jmp    ceab84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b24>
      ceab5c:	eb 38                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab5e:	eb 36                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab60:	eb 34                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab62:	eb 32                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab64:	eb 30                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab66:	eb 2e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab68:	eb 2c                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6a:	eb 2a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab6c:	eb 0e                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab6e:	eb 0c                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab70:	eb 24                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab72:	eb 22                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab74:	eb 20                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab76:	eb 1e                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab78:	eb 02                	jmp    ceab7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b1c>
      ceab7a:	eb 1a                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab7c:	48 89 c3             	mov    rbx,rax
      ceab7f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ceab84:	e8 07 33 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceab89:	eb 0e                	jmp    ceab99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b39>
      ceab8b:	eb 09                	jmp    ceab96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b36>
      ceab8d:	48 89 c3             	mov    rbx,rax
      ceab90:	eb 11                	jmp    ceaba3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b43>
      ceab92:	eb 1e                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab94:	eb 1c                	jmp    ceabb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b52>
      ceab96:	48 89 c3             	mov    rbx,rax
      ceab99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ceab9e:	e8 ed 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceaba3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabaa:	00 
      ceabab:	e8 32 15 00 00       	call   cec0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x239082>
      ceabb0:	eb 10                	jmp    ceabc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b62>
      ceabb2:	48 89 c3             	mov    rbx,rax
      ceabb5:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ceabbc:	00 
      ceabbd:	e8 ce 32 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ceabc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ceabc9:	00 00 
      ceabcb:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      ceabd2:	00 
      ceabd3:	75 08                	jne    ceabdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237b7d>
      ceabd5:	48 89 df             	mov    rdi,rbx
      ceabd8:	e8 f3 50 d8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ceabdd:	e8 ce 4e b0 00       	call   17efab0 <__stack_chk_fail@plt>

## Direct callers of 0xcea164
## Direct refs to nearby entry addresses
- target 0xcea164: 0 refs
- target 0xcea190: 0 refs
- target 0xcea2a0: 0 refs
