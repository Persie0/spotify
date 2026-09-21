# Service184 embedded dependency vptr validation

Candidate service address point: 0x18228d8
Candidate +0x28 method: 0xd17212 -> returns this+0x218
Invariant to prove: object at this+0x218 must itself become polymorphic because Skip Ad later executes [dep] then dep-vtable+0x68.

## Candidate owner getter and method family
### 0xd1710c FDE=(13725964, 13726226)
      d1710c:	41 57                	push   r15
      d1710e:	41 56                	push   r14
      d17110:	41 54                	push   r12
      d17112:	53                   	push   rbx
      d17113:	48 81 ec 88 00 00 00 	sub    rsp,0x88
      d1711a:	48 89 fb             	mov    rbx,rdi
      d1711d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d17124:	00 00 
      d17126:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      d1712d:	00 
      d1712e:	0f 57 c0             	xorps  xmm0,xmm0
      d17131:	48 89 e7             	mov    rdi,rsp
      d17134:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
      d17138:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      d1713b:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
      d17142:	48 8b 83 20 02 00 00 	mov    rax,QWORD PTR [rbx+0x220]
      d17149:	48 2b 83 18 02 00 00 	sub    rax,QWORD PTR [rbx+0x218]
      d17150:	6a 30                	push   0x30
      d17152:	59                   	pop    rcx
      d17153:	48 99                	cqo
      d17155:	48 f7 f9             	idiv   rcx
      d17158:	48 89 c6             	mov    rsi,rax
      d1715b:	e8 92 8a f3 ff       	call   c4fbf2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb92>
      d17160:	4c 8b bb 18 02 00 00 	mov    r15,QWORD PTR [rbx+0x218]
      d17167:	4c 8b a3 20 02 00 00 	mov    r12,QWORD PTR [rbx+0x220]
      d1716e:	4d 39 e7             	cmp    r15,r12
      d17171:	74 32                	je     d171a5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264145>
      d17173:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
      d17178:	49 89 e6             	mov    r14,rsp
      d1717b:	49 8b 37             	mov    rsi,QWORD PTR [r15]
      d1717e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d17181:	48 89 df             	mov    rdi,rbx
      d17184:	31 d2                	xor    edx,edx
      d17186:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d17189:	4c 89 f7             	mov    rdi,r14
      d1718c:	48 89 de             	mov    rsi,rbx
      d1718f:	e8 26 a0 f3 ff       	call   c511ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e15a>
      d17194:	48 89 df             	mov    rdi,rbx
      d17197:	e8 92 e1 9a 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d1719c:	49 83 c7 30          	add    r15,0x30
      d171a0:	4d 39 e7             	cmp    r15,r12
      d171a3:	75 d6                	jne    d1717b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26411b>
      d171a5:	48 89 e7             	mov    rdi,rsp
      d171a8:	48 8b 5f 18          	mov    rbx,QWORD PTR [rdi+0x18]
      d171ac:	e8 67 bc ef ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d171b1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d171b8:	00 00 
      d171ba:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      d171c1:	00 
      d171c2:	75 49                	jne    d1720d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2641ad>
      d171c4:	48 89 d8             	mov    rax,rbx
      d171c7:	48 81 c4 88 00 00 00 	add    rsp,0x88
      d171ce:	5b                   	pop    rbx
      d171cf:	41 5c                	pop    r12
      d171d1:	41 5e                	pop    r14
      d171d3:	41 5f                	pop    r15
      d171d5:	c3                   	ret
      d171d6:	eb 00                	jmp    d171d8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264178>
      d171d8:	48 89 c3             	mov    rbx,rax
      d171db:	eb 0d                	jmp    d171ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26418a>
      d171dd:	48 89 c3             	mov    rbx,rax
      d171e0:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d171e5:	e8 44 e1 9a 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d171ea:	48 89 e7             	mov    rdi,rsp
      d171ed:	e8 26 bc ef ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d171f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d171f9:	00 00 
      d171fb:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      d17202:	00 
      d17203:	75 08                	jne    d1720d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2641ad>
      d17205:	48 89 df             	mov    rdi,rbx
      d17208:	e8 c3 8a d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d1720d:	e8 9e 88 ad 00       	call   17efab0 <__stack_chk_fail@plt>

### 0xd17212 FDE=(13726226, 13726234)
      d17212:	48 8d 87 18 02 00 00 	lea    rax,[rdi+0x218]
      d17219:	c3                   	ret

### 0xd1721a FDE=(13726234, 13726305)
      d1721a:	48 8b 87 38 02 00 00 	mov    rax,QWORD PTR [rdi+0x238]
      d17221:	8a 97 40 02 00 00    	mov    dl,BYTE PTR [rdi+0x240]
      d17227:	48 8b 8f 18 02 00 00 	mov    rcx,QWORD PTR [rdi+0x218]
      d1722e:	48 8b b7 20 02 00 00 	mov    rsi,QWORD PTR [rdi+0x220]
      d17235:	48 39 f1             	cmp    rcx,rsi
      d17238:	74 26                	je     d17260 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264200>
      d1723a:	6a 01                	push   0x1
      d1723c:	5f                   	pop    rdi
      d1723d:	4c 8b 41 10          	mov    r8,QWORD PTR [rcx+0x10]
      d17241:	4c 39 c0             	cmp    rax,r8
      d17244:	49 0f 4e c0          	cmovle rax,r8
      d17248:	84 d2                	test   dl,dl
      d1724a:	49 0f 44 c0          	cmove  rax,r8
      d1724e:	0f b6 d2             	movzx  edx,dl
      d17251:	80 fa 02             	cmp    dl,0x2
      d17254:	0f 42 d7             	cmovb  edx,edi
      d17257:	48 83 c1 30          	add    rcx,0x30
      d1725b:	48 39 f1             	cmp    rcx,rsi
      d1725e:	75 dd                	jne    d1723d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2641dd>
      d17260:	c3                   	ret

### 0xd17262 FDE=(13726306, 13726538)
      d17262:	55                   	push   rbp
      d17263:	41 57                	push   r15
      d17265:	41 56                	push   r14
      d17267:	41 54                	push   r12
      d17269:	53                   	push   rbx
      d1726a:	48 83 ec 20          	sub    rsp,0x20
      d1726e:	48 89 fb             	mov    rbx,rdi
      d17271:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d17278:	00 00 
      d1727a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      d1727f:	0f 57 c0             	xorps  xmm0,xmm0
      d17282:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d17287:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      d1728a:	48 8b 8e 18 02 00 00 	mov    rcx,QWORD PTR [rsi+0x218]
      d17291:	48 39 8e 20 02 00 00 	cmp    QWORD PTR [rsi+0x220],rcx
      d17298:	74 5e                	je     d172f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264298>
      d1729a:	49 89 f6             	mov    r14,rsi
      d1729d:	6a 01                	push   0x1
      d1729f:	5d                   	pop    rbp
      d172a0:	31 f6                	xor    esi,esi
      d172a2:	49 89 e7             	mov    r15,rsp
      d172a5:	6a 30                	push   0x30
      d172a7:	41 5c                	pop    r12
      d172a9:	48 6b d6 30          	imul   rdx,rsi,0x30
      d172ad:	48 8b 44 11 08       	mov    rax,QWORD PTR [rcx+rdx*1+0x8]
      d172b2:	0f 10 04 11          	movups xmm0,XMMWORD PTR [rcx+rdx*1]
      d172b6:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      d172ba:	48 85 c0             	test   rax,rax
      d172bd:	74 05                	je     d172c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264264>
      d172bf:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      d172c4:	48 89 df             	mov    rdi,rbx
      d172c7:	4c 89 fe             	mov    rsi,r15
      d172ca:	e8 6b c5 00 00       	call   d2383a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2707da>
      d172cf:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d172d4:	e8 ad 71 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d172d9:	89 ee                	mov    esi,ebp
      d172db:	49 8b 8e 18 02 00 00 	mov    rcx,QWORD PTR [r14+0x218]
      d172e2:	49 8b 86 20 02 00 00 	mov    rax,QWORD PTR [r14+0x220]
      d172e9:	48 29 c8             	sub    rax,rcx
      d172ec:	48 99                	cqo
      d172ee:	49 f7 fc             	idiv   r12
      d172f1:	ff c5                	inc    ebp
      d172f3:	48 39 f0             	cmp    rax,rsi
      d172f6:	77 b1                	ja     d172a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264249>
      d172f8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d172ff:	00 00 
      d17301:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      d17306:	75 3d                	jne    d17345 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2642e5>
      d17308:	48 89 d8             	mov    rax,rbx
      d1730b:	48 83 c4 20          	add    rsp,0x20
      d1730f:	5b                   	pop    rbx
      d17310:	41 5c                	pop    r12
      d17312:	41 5e                	pop    r14
      d17314:	41 5f                	pop    r15
      d17316:	5d                   	pop    rbp
      d17317:	c3                   	ret
      d17318:	49 89 c6             	mov    r14,rax
      d1731b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d17320:	e8 61 71 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d17325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d1732c:	00 00 
      d1732e:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      d17333:	75 10                	jne    d17345 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2642e5>
      d17335:	48 89 df             	mov    rdi,rbx
      d17338:	e8 19 02 da ff       	call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
      d1733d:	4c 89 f7             	mov    rdi,r14
      d17340:	e8 8b 89 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d17345:	e8 66 87 ad 00       	call   17efab0 <__stack_chk_fail@plt>

### 0xd1734a FDE=(13726538, 13726914)
      d1734a:	41 57                	push   r15
      d1734c:	41 56                	push   r14
      d1734e:	41 55                	push   r13
      d17350:	41 54                	push   r12
      d17352:	53                   	push   rbx
      d17353:	48 81 ec 80 00 00 00 	sub    rsp,0x80
      d1735a:	49 89 ce             	mov    r14,rcx
      d1735d:	49 89 f7             	mov    r15,rsi
      d17360:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d17367:	00 00 
      d17369:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
      d1736e:	0f b6 0a             	movzx  ecx,BYTE PTR [rdx]
      d17371:	48 8d 42 01          	lea    rax,[rdx+0x1]
      d17375:	89 ce                	mov    esi,ecx
      d17377:	d1 ee                	shr    esi,1
      d17379:	f6 c1 01             	test   cl,0x1
      d1737c:	48 0f 45 42 10       	cmovne rax,QWORD PTR [rdx+0x10]
      d17381:	48 89 fb             	mov    rbx,rdi
      d17384:	48 0f 45 72 08       	cmovne rsi,QWORD PTR [rdx+0x8]
      d17389:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
      d1738e:	48 89 c7             	mov    rdi,rax
      d17391:	4c 89 e2             	mov    rdx,r12
      d17394:	e8 1b ef a8 00       	call   17a62b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a420>
      d17399:	49 89 e5             	mov    r13,rsp
      d1739c:	4c 89 ef             	mov    rdi,r13
      d1739f:	4c 89 fe             	mov    rsi,r15
      d173a2:	e8 df d7 ff ff       	call   d14b86 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x261b26>
      d173a7:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
      d173ab:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      d173b0:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
      d173b5:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      d173ba:	0f 57 c0             	xorps  xmm0,xmm0
      d173bd:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      d173c2:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
      d173c7:	4c 89 ef             	mov    rdi,r13
      d173ca:	e8 c1 6a ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d173cf:	41 80 3c 24 2f       	cmp    BYTE PTR [r12],0x2f
      d173d4:	75 0f                	jne    d173e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264385>
      d173d6:	f6 44 24 20 01       	test   BYTE PTR [rsp+0x20],0x1
      d173db:	75 25                	jne    d17402 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2643a2>
      d173dd:	66 83 64 24 20 00    	and    WORD PTR [rsp+0x20],0x0
      d173e3:	eb 2b                	jmp    d17410 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2643b0>
      d173e5:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d173ea:	e8 3f 0f d9 ff       	call   aa832e <JNI_OnUnload@@Base+0x2fbfb>
      d173ef:	84 c0                	test   al,al
      d173f1:	74 1d                	je     d17410 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2643b0>
      d173f3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d173f8:	6a 2f                	push   0x2f
      d173fa:	5e                   	pop    rsi
      d173fb:	e8 b0 6c ad 00       	call   17ee0b0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc@plt>
      d17400:	eb 0e                	jmp    d17410 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2643b0>
      d17402:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      d17407:	c6 00 00             	mov    BYTE PTR [rax],0x0
      d1740a:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
      d17410:	48 8d 54 24 3f       	lea    rdx,[rsp+0x3f]
      d17415:	80 7a 01 00          	cmp    BYTE PTR [rdx+0x1],0x0
      d17419:	48 8d 52 01          	lea    rdx,[rdx+0x1]
      d1741d:	75 f6                	jne    d17415 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2643b5>
      d1741f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d17424:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      d17429:	e8 d8 08 d9 ff       	call   aa7d06 <JNI_OnUnload@@Base+0x2f5d3>
      d1742e:	48 89 e7             	mov    rdi,rsp
      d17431:	4c 89 f6             	mov    rsi,r14
      d17434:	e8 63 08 d9 ff       	call   aa7c9c <JNI_OnUnload@@Base+0x2f569>
      d17439:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d1743e:	48 89 e6             	mov    rsi,rsp
      d17441:	e8 ba 7a ad 00       	call   17eef00 <_ZNSt6__ndk14__fs10filesystem4path17replace_extensionERKS2_@plt>
      d17446:	48 89 e7             	mov    rdi,rsp
      d17449:	e8 42 6a ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d1744e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      d17453:	48 89 df             	mov    rdi,rbx
      d17456:	e8 e5 6a ad 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d1745b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d17460:	e8 2b 6a ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d17465:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d1746c:	00 00 
      d1746e:	48 3b 44 24 78       	cmp    rax,QWORD PTR [rsp+0x78]
      d17473:	75 48                	jne    d174bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26445d>
      d17475:	48 89 d8             	mov    rax,rbx
      d17478:	48 81 c4 80 00 00 00 	add    rsp,0x80
      d1747f:	5b                   	pop    rbx
      d17480:	41 5c                	pop    r12
      d17482:	41 5d                	pop    r13
      d17484:	41 5e                	pop    r14
      d17486:	41 5f                	pop    r15
      d17488:	c3                   	ret
      d17489:	48 89 c3             	mov    rbx,rax
      d1748c:	48 89 e7             	mov    rdi,rsp
      d1748f:	e8 fc 69 ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d17494:	eb 05                	jmp    d1749b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26443b>
      d17496:	eb 00                	jmp    d17498 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264438>
      d17498:	48 89 c3             	mov    rbx,rax
      d1749b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d174a0:	e8 eb 69 ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d174a5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d174ac:	00 00 
      d174ae:	48 3b 44 24 78       	cmp    rax,QWORD PTR [rsp+0x78]
      d174b3:	75 08                	jne    d174bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26445d>
      d174b5:	48 89 df             	mov    rdi,rbx
      d174b8:	e8 13 88 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d174bd:	e8 ee 85 ad 00       	call   17efab0 <__stack_chk_fail@plt>

## Relocations containing candidate owner address point / nearby vtable

## Writes to owner+0x218 with nearby high-address materialization
### 0xc2969c: movups XMMWORD PTR [rsp+0x218],xmm0; FDE=(12747912, 12754236); high refs=['1816358']
      c2966b:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      c2966f:	48 8d 2d 82 61 81 ff 	lea    rbp,[rip+0xffffffffff816182]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      c29676:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
      c2967a:	49 83 c4 30          	add    r12,0x30
      c2967e:	4c 89 e7             	mov    rdi,r12
      c29681:	e8 b0 21 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      c29686:	4c 89 ef             	mov    rdi,r13
      c29689:	48 89 c6             	mov    rsi,rax
      c2968c:	e8 c1 61 b5 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      c29691:	0f 57 c0             	xorps  xmm0,xmm0
      c29694:	84 c0                	test   al,al
      c29696:	0f 84 4a 01 00 00    	je     c297e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x176786>
      c2969c:	0f 11 84 24 18 02 00 	movups XMMWORD PTR [rsp+0x218],xmm0
      c296a3:	00 
      c296a4:	48 8d 05 ad cc be 00 	lea    rax,[rip+0xbeccad]        # 1816358 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xc018>
      c296ab:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
      c296b2:	00 
      c296b3:	48 89 ac 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rbp
      c296ba:	00 
      c296bb:	48 8b 84 24 80 06 00 	mov    rax,QWORD PTR [rsp+0x680]
      c296c2:	00 
      c296c3:	a8 01                	test   al,0x1
      c296c5:	0f 85 48 06 00 00    	jne    c29d13 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x176cb3>
      c296cb:	48 85 c0             	test   rax,rax
      c296ce:	0f 84 3d 05 00 00    	je     c29c11 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x176bb1>

### 0xc76236: mov    QWORD PTR [rsp+0x218],rax; FDE=(13063558, 13068958); high refs=['18958d8']
      c761fd:	49 89 d6             	mov    r14,rdx
      c76200:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
      c76205:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      c7620a:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
      c7620f:	48 83 a4 24 08 02 00 	and    QWORD PTR [rsp+0x208],0x0
      c76216:	00 00 
      c76218:	48 8d 05 b9 f6 c1 00 	lea    rax,[rip+0xc1f6b9]        # 18958d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x2818>
      c7621f:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
      c76226:	00 
      c76227:	83 a4 24 14 02 00 00 	and    DWORD PTR [rsp+0x214],0x0
      c7622e:	00 
      c7622f:	48 8d 05 c2 95 7c ff 	lea    rax,[rip+0xffffffffff7c95c2]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      c76236:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
      c7623d:	00 
      c7623e:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
      c76245:	00 
      c76246:	0f 57 c0             	xorps  xmm0,xmm0
      c76249:	0f 11 47 58          	movups XMMWORD PTR [rdi+0x58],xmm0
      c7624d:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
      c76251:	0f 11 47 38          	movups XMMWORD PTR [rdi+0x38],xmm0
      c76255:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
      c76259:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
      c7625d:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
      c76261:	48 8b b4 24 58 01 00 	mov    rsi,QWORD PTR [rsp+0x158]
      c76268:	00 

### 0xcb69cc: mov    QWORD PTR [rsp+0x218],r12; FDE=(13328284, 13331598); high refs=['1820f80', '1820fc8']
      cb6996:	48 8d 05 e3 a5 b6 00 	lea    rax,[rip+0xb6a5e3]        # 1820f80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16c40>
      cb699d:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
      cb69a4:	00 
      cb69a5:	4c 89 a4 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],r12
      cb69ac:	00 
      cb69ad:	48 8d 9c 24 d0 01 00 	lea    rbx,[rsp+0x1d0]
      cb69b4:	00 
      cb69b5:	48 89 9c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rbx
      cb69bc:	00 
      cb69bd:	48 8d 05 04 a6 b6 00 	lea    rax,[rip+0xb6a604]        # 1820fc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16c88>
      cb69c4:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
      cb69cb:	00 
      cb69cc:	4c 89 a4 24 18 02 00 	mov    QWORD PTR [rsp+0x218],r12
      cb69d3:	00 
      cb69d4:	4c 8d ac 24 10 02 00 	lea    r13,[rsp+0x210]
      cb69db:	00 
      cb69dc:	4c 89 ac 24 30 02 00 	mov    QWORD PTR [rsp+0x230],r13
      cb69e3:	00 
      cb69e4:	4c 8d bc 24 40 02 00 	lea    r15,[rsp+0x240]
      cb69eb:	00 
      cb69ec:	4c 89 ff             	mov    rdi,r15
      cb69ef:	48 89 de             	mov    rsi,rbx
      cb69f2:	e8 45 0c df ff       	call   aa763c <JNI_OnUnload@@Base+0x2ef09>
      cb69f7:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      cb69fe:	00 

### 0xcdeded: mov    DWORD PTR [rsp+0x218],eax; FDE=(13495564, 13496341); high refs=['1895e38']
      cdedba:	48 8d 05 77 70 bb 00 	lea    rax,[rip+0xbb7077]        # 1895e38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x2d78>
      cdedc1:	48 89 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],rax
      cdedc8:	00 
      cdedc9:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      cdedce:	40 f6 c6 01          	test   sil,0x1
      cdedd2:	74 15                	je     cdede9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22bd89>
      cdedd4:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
      cdeddb:	00 
      cdeddc:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
      cdede0:	48 83 c6 08          	add    rsi,0x8
      cdede4:	e8 17 f7 a6 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
      cdede9:	8b 44 24 30          	mov    eax,DWORD PTR [rsp+0x30]
      cdeded:	89 84 24 18 02 00 00 	mov    DWORD PTR [rsp+0x218],eax
      cdedf4:	83 a4 24 1c 02 00 00 	and    DWORD PTR [rsp+0x21c],0x0
      cdedfb:	00 
      cdedfc:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      cdee01:	31 f6                	xor    esi,esi
      cdee03:	e8 fe be dc ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
      cdee08:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
      cdee0f:	00 
      cdee10:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      cdee15:	31 f6                	xor    esi,esi
      cdee17:	e8 ea be dc ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
      cdee1c:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
      cdee23:	00 

### 0xec8c1d: movups XMMWORD PTR [rbx+0x218],xmm0; FDE=(15502176, 15502626); high refs=['1833168']
      ec8bdb:	e8 12 de ff ff       	call   ec69f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de08>
      ec8be0:	48 8d 05 81 a5 96 00 	lea    rax,[rip+0x96a581]        # 1833168 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5100>
      ec8be7:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      ec8beb:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      ec8bf0:	0f 11 83 e0 01 00 00 	movups XMMWORD PTR [rbx+0x1e0],xmm0
      ec8bf7:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      ec8bfb:	0f 11 83 f0 01 00 00 	movups XMMWORD PTR [rbx+0x1f0],xmm0
      ec8c02:	40 88 ab 00 02 00 00 	mov    BYTE PTR [rbx+0x200],bpl
      ec8c09:	49 89 dc             	mov    r12,rbx
      ec8c0c:	49 81 c4 60 02 00 00 	add    r12,0x260
      ec8c13:	0f 57 c0             	xorps  xmm0,xmm0
      ec8c16:	0f 11 83 08 02 00 00 	movups XMMWORD PTR [rbx+0x208],xmm0
      ec8c1d:	0f 11 83 18 02 00 00 	movups XMMWORD PTR [rbx+0x218],xmm0
      ec8c24:	0f 11 83 23 02 00 00 	movups XMMWORD PTR [rbx+0x223],xmm0
      ec8c2b:	0f 11 83 38 02 00 00 	movups XMMWORD PTR [rbx+0x238],xmm0
      ec8c32:	0f 11 83 48 02 00 00 	movups XMMWORD PTR [rbx+0x248],xmm0
      ec8c39:	48 83 a3 58 02 00 00 	and    QWORD PTR [rbx+0x258],0x0
      ec8c40:	00 
      ec8c41:	4c 89 e7             	mov    rdi,r12
      ec8c44:	e8 ad 0d 91 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ec8c49:	48 8b ab e8 01 00 00 	mov    rbp,QWORD PTR [rbx+0x1e8]
      ec8c50:	4c 8d 44 24 28       	lea    r8,[rsp+0x28]
      ec8c55:	4d 89 38             	mov    QWORD PTR [r8],r15
      ec8c58:	48 8d 35 32 44 bd ff 	lea    rsi,[rip+0xffffffffffbd4432]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      ec8c5f:	48 8d 0d 2e e4 ff ff 	lea    rcx,[rip+0xffffffffffffe42e]        # ec7094 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e4aa>

### 0xeede54: mov    DWORD PTR [rbx+0x218],0x3f800000; FDE=(15654342, 15654578); high refs=['19e5c08', '1835838']
      eede0d:	48 8d 35 f4 7d af 00 	lea    rsi,[rip+0xaf7df4]        # 19e5c08 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1f8>
      eede14:	4c 89 e7             	mov    rdi,r12
      eede17:	e8 d6 8b fd ff       	call   ec69f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de08>
      eede1c:	48 8d 05 15 7a 94 00 	lea    rax,[rip+0x947a15]        # 1835838 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x77d0>
      eede23:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      eede27:	4c 89 ab e0 01 00 00 	mov    QWORD PTR [rbx+0x1e0],r13
      eede2e:	4c 89 bb e8 01 00 00 	mov    QWORD PTR [rbx+0x1e8],r15
      eede35:	40 88 ab f0 01 00 00 	mov    BYTE PTR [rbx+0x1f0],bpl
      eede3c:	c6 83 f1 01 00 00 01 	mov    BYTE PTR [rbx+0x1f1],0x1
      eede43:	0f 57 c0             	xorps  xmm0,xmm0
      eede46:	0f 11 83 f8 01 00 00 	movups XMMWORD PTR [rbx+0x1f8],xmm0
      eede4d:	0f 11 83 08 02 00 00 	movups XMMWORD PTR [rbx+0x208],xmm0
      eede54:	c7 83 18 02 00 00 00 	mov    DWORD PTR [rbx+0x218],0x3f800000
      eede5b:	00 80 3f 
      eede5e:	31 c0                	xor    eax,eax
      eede60:	88 83 20 02 00 00    	mov    BYTE PTR [rbx+0x220],al
      eede66:	88 83 90 06 00 00    	mov    BYTE PTR [rbx+0x690],al
      eede6c:	31 ff                	xor    edi,edi
      eede6e:	e8 13 06 bb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      eede73:	4d 89 26             	mov    QWORD PTR [r14],r12
      eede76:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
      eede7a:	31 ff                	xor    edi,edi
      eede7c:	48 83 c4 08          	add    rsp,0x8
      eede80:	5b                   	pop    rbx
      eede81:	41 5c                	pop    r12

### 0xef1547: movups XMMWORD PTR [rbx+0x218],xmm0; FDE=(15668448, 15668625); high refs=['1835ea0']
      ef1509:	49 83 c7 18          	add    r15,0x18
      ef150d:	48 8d 35 64 33 4e ff 	lea    rsi,[rip+0xffffffffff4e3364]        # 3d4878 <_ZTSN5boost17bad_function_callE@@Base+0x1bbe>
      ef1514:	4c 89 ff             	mov    rdi,r15
      ef1517:	e8 d6 54 fd ff       	call   ec69f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de08>
      ef151c:	48 8d 05 7d 49 94 00 	lea    rax,[rip+0x94497d]        # 1835ea0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7e38>
      ef1523:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      ef1527:	66 83 a3 e0 01 00 00 	and    WORD PTR [rbx+0x1e0],0x0
      ef152e:	00 
      ef152f:	0f 57 c0             	xorps  xmm0,xmm0
      ef1532:	0f 11 83 e8 01 00 00 	movups XMMWORD PTR [rbx+0x1e8],xmm0
      ef1539:	0f 11 83 f8 01 00 00 	movups XMMWORD PTR [rbx+0x1f8],xmm0
      ef1540:	0f 11 83 08 02 00 00 	movups XMMWORD PTR [rbx+0x208],xmm0
      ef1547:	0f 11 83 18 02 00 00 	movups XMMWORD PTR [rbx+0x218],xmm0
      ef154e:	0f 11 83 28 02 00 00 	movups XMMWORD PTR [rbx+0x228],xmm0
      ef1555:	c7 83 38 02 00 00 00 	mov    DWORD PTR [rbx+0x238],0x3f800000
      ef155c:	00 80 3f 
      ef155f:	31 ff                	xor    edi,edi
      ef1561:	e8 b6 ce ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef1566:	4d 89 3e             	mov    QWORD PTR [r14],r15
      ef1569:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
      ef156d:	4c 89 f0             	mov    rax,r14
      ef1570:	5b                   	pop    rbx
      ef1571:	41 5e                	pop    r14
      ef1573:	41 5f                	pop    r15
      ef1575:	c3                   	ret

### 0x1082eb8: mov    QWORD PTR [rsp+0x218],rax; FDE=(17313342, 17315020); high refs=['184a2a0']
     1082e7f:	c7 43 68 01 00 00 00 	mov    DWORD PTR [rbx+0x68],0x1
     1082e86:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
     1082e8d:	00 00 
     1082e8f:	48 8d 05 0a 74 7c 00 	lea    rax,[rip+0x7c740a]        # 184a2a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6988>
     1082e96:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
     1082e9d:	00 
     1082e9e:	0f 57 c0             	xorps  xmm0,xmm0
     1082ea1:	0f 11 84 24 f8 01 00 	movups XMMWORD PTR [rsp+0x1f8],xmm0
     1082ea8:	00 
     1082ea9:	0f 11 84 24 08 02 00 	movups XMMWORD PTR [rsp+0x208],xmm0
     1082eb0:	00 
     1082eb1:	48 8d 05 40 c9 3b ff 	lea    rax,[rip+0xffffffffff3bc940]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1082eb8:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
     1082ebf:	00 
     1082ec0:	83 a4 24 20 02 00 00 	and    DWORD PTR [rsp+0x220],0x0
     1082ec7:	00 
     1082ec8:	48 8b 73 50          	mov    rsi,QWORD PTR [rbx+0x50]
     1082ecc:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     1082ed3:	00 
     1082ed4:	e8 13 d6 5f 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
     1082ed9:	4c 8d b4 24 18 02 00 	lea    r14,[rsp+0x218]
     1082ee0:	00 
     1082ee1:	48 8b 94 24 a8 00 00 	mov    rdx,QWORD PTR [rsp+0xa8]
     1082ee8:	00 
     1082ee9:	48 85 d2             	test   rdx,rdx

### 0x10f3d2f: movups XMMWORD PTR [rsp+0x218],xmm0; FDE=(17775868, 17778444); high refs=['1850148']
     10f3d03:	41 54                	push   r12
     10f3d05:	53                   	push   rbx
     10f3d06:	48 81 ec c8 02 00 00 	sub    rsp,0x2c8
     10f3d0d:	48 89 4c 24 78       	mov    QWORD PTR [rsp+0x78],rcx
     10f3d12:	49 89 d7             	mov    r15,rdx
     10f3d15:	48 89 f3             	mov    rbx,rsi
     10f3d18:	49 89 fe             	mov    r14,rdi
     10f3d1b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10f3d22:	00 00 
     10f3d24:	48 89 84 24 c0 02 00 	mov    QWORD PTR [rsp+0x2c0],rax
     10f3d2b:	00 
     10f3d2c:	0f 57 c0             	xorps  xmm0,xmm0
     10f3d2f:	0f 11 84 24 18 02 00 	movups XMMWORD PTR [rsp+0x218],xmm0
     10f3d36:	00 
     10f3d37:	48 8d 05 0a c4 75 00 	lea    rax,[rip+0x75c40a]        # 1850148 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xc830>
     10f3d3e:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     10f3d45:	00 
     10f3d46:	83 a4 24 28 02 00 00 	and    DWORD PTR [rsp+0x228],0x0
     10f3d4d:	00 
     10f3d4e:	4c 8b 6a 18          	mov    r13,QWORD PTR [rdx+0x18]
     10f3d52:	49 83 e5 fc          	and    r13,0xfffffffffffffffc
     10f3d56:	49 8b 75 08          	mov    rsi,QWORD PTR [r13+0x8]
     10f3d5a:	41 8b 7d 00          	mov    edi,DWORD PTR [r13+0x0]
     10f3d5e:	e8 bd 7a 98 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     10f3d63:	84 c0                	test   al,al

### 0x111ba48: mov    BYTE PTR [rsp+0x218],0x1; FDE=(17938670, 17939757); high refs=['18fe490']
     111ba14:	78 12                	js     111ba28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e2e3e>
     111ba16:	31 c9                	xor    ecx,ecx
     111ba18:	88 8c 24 e8 01 00 00 	mov    BYTE PTR [rsp+0x1e8],cl
     111ba1f:	88 8c 24 18 02 00 00 	mov    BYTE PTR [rsp+0x218],cl
     111ba26:	eb 2d                	jmp    111ba55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e2e6b>
     111ba28:	49 8b 44 24 50       	mov    rax,QWORD PTR [r12+0x50]
     111ba2d:	48 85 c0             	test   rax,rax
     111ba30:	48 8d 35 59 2a 7e 00 	lea    rsi,[rip+0x7e2a59]        # 18fe490 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x458a0>
     111ba37:	48 0f 45 f0          	cmovne rsi,rax
     111ba3b:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     111ba42:	00 
     111ba43:	e8 e2 94 00 00       	call   1124f2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec340>
     111ba48:	c6 84 24 18 02 00 00 	mov    BYTE PTR [rsp+0x218],0x1
     111ba4f:	01 
     111ba50:	41 8b 44 24 10       	mov    eax,DWORD PTR [r12+0x10]
     111ba55:	44 88 7c 24 0b       	mov    BYTE PTR [rsp+0xb],r15b
     111ba5a:	0f ba e0 08          	bt     eax,0x8
     111ba5e:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
     111ba63:	72 0a                	jb     111ba6f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e2e85>
     111ba65:	c6 44 24 78 00       	mov    BYTE PTR [rsp+0x78],0x0
     111ba6a:	45 31 ff             	xor    r15d,r15d
     111ba6d:	eb 20                	jmp    111ba8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e2ea5>
     111ba6f:	49 8b 44 24 58       	mov    rax,QWORD PTR [r12+0x58]
     111ba74:	48 85 c0             	test   rax,rax
     111ba77:	48 8d 35 32 29 7e 00 	lea    rsi,[rip+0x7e2932]        # 18fe3b0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x457c0>

### 0x113a544: movups XMMWORD PTR [rsp+0x218],xmm0; FDE=(18064614, 18065095); high refs=['1898098']
     113a50c:	89 b3 b0 00 00 00    	mov    DWORD PTR [rbx+0xb0],esi
     113a512:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
     113a519:	48 89 de             	mov    rsi,rbx
     113a51c:	e8 e5 fe 58 00       	call   16ca406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e572>
     113a521:	48 83 a4 24 00 02 00 	and    QWORD PTR [rsp+0x200],0x0
     113a528:	00 00 
     113a52a:	48 8d 05 67 db 75 00 	lea    rax,[rip+0x75db67]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     113a531:	48 89 84 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rax
     113a538:	00 
     113a539:	0f 57 c0             	xorps  xmm0,xmm0
     113a53c:	0f 11 84 24 08 02 00 	movups XMMWORD PTR [rsp+0x208],xmm0
     113a543:	00 
     113a544:	0f 11 84 24 18 02 00 	movups XMMWORD PTR [rsp+0x218],xmm0
     113a54b:	00 
     113a54c:	48 8d 05 a5 52 30 ff 	lea    rax,[rip+0xffffffffff3052a5]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     113a553:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
     113a55a:	00 
     113a55b:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
     113a562:	00 
     113a563:	48 89 84 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rax
     113a56a:	00 
     113a56b:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
     113a572:	00 00 
     113a574:	49 8b 07             	mov    rax,QWORD PTR [r15]
     113a577:	49 83 c6 08          	add    r14,0x8

### 0x11460bf: mov    QWORD PTR [rsp+0x218],rbp; FDE=(18111626, 18115152); high refs=['1854ba0']
     114608d:	48 89 c6             	mov    rsi,rax
     1146090:	e8 bd 97 63 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     1146095:	0f 57 c0             	xorps  xmm0,xmm0
     1146098:	84 c0                	test   al,al
     114609a:	0f 84 b6 05 00 00    	je     1146656 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30da6c>
     11460a0:	0f 11 84 24 00 02 00 	movups XMMWORD PTR [rsp+0x200],xmm0
     11460a7:	00 
     11460a8:	48 8d 05 f1 ea 70 00 	lea    rax,[rip+0x70eaf1]        # 1854ba0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11288>
     11460af:	48 89 84 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rax
     11460b6:	00 
     11460b7:	48 89 ac 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rbp
     11460be:	00 
     11460bf:	48 89 ac 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rbp
     11460c6:	00 
     11460c7:	0f 11 84 24 20 02 00 	movups XMMWORD PTR [rsp+0x220],xmm0
     11460ce:	00 
     11460cf:	83 a4 24 50 02 00 00 	and    DWORD PTR [rsp+0x250],0x0
     11460d6:	00 
     11460d7:	0f 11 84 24 30 02 00 	movups XMMWORD PTR [rsp+0x230],xmm0
     11460de:	00 
     11460df:	0f 11 84 24 40 02 00 	movups XMMWORD PTR [rsp+0x240],xmm0
     11460e6:	00 
     11460e7:	48 8b 84 24 a0 04 00 	mov    rax,QWORD PTR [rsp+0x4a0]
     11460ee:	00 
     11460ef:	a8 01                	test   al,0x1

### 0x11619fe: mov    QWORD PTR [rsp+0x218],rax; FDE=(18224770, 18237631); high refs=['1856b40']
     11619c8:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     11619cf:	00 
     11619d0:	e8 9b c3 01 00       	call   117dd70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345186>
     11619d5:	0f 57 c0             	xorps  xmm0,xmm0
     11619d8:	0f 11 84 24 00 02 00 	movups XMMWORD PTR [rsp+0x200],xmm0
     11619df:	00 
     11619e0:	48 8d 05 59 51 6f 00 	lea    rax,[rip+0x6f5159]        # 1856b40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x13228>
     11619e7:	48 89 84 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rax
     11619ee:	00 
     11619ef:	48 8d 05 02 de 2d ff 	lea    rax,[rip+0xffffffffff2dde02]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     11619f6:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     11619fd:	00 
     11619fe:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
     1161a05:	00 
     1161a06:	0f 11 84 24 20 02 00 	movups XMMWORD PTR [rsp+0x220],xmm0
     1161a0d:	00 
     1161a0e:	0f 11 84 24 30 02 00 	movups XMMWORD PTR [rsp+0x230],xmm0
     1161a15:	00 
     1161a16:	0f 11 84 24 3c 02 00 	movups XMMWORD PTR [rsp+0x23c],xmm0
     1161a1d:	00 
     1161a1e:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
     1161a25:	00 
     1161a26:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     1161a2b:	4d 89 6d f8          	mov    QWORD PTR [r13-0x8],r13
     1161a2f:	48 8d 15 ae a1 1c ff 	lea    rdx,[rip+0xffffffffff1ca1ae]        # 32bbe4 <_ZTSSt12bad_any_cast@@Base-0x645e4>

### 0x122ea2e: mov    WORD PTR [rbx+0x218],ax; FDE=(19063258, 19073670); high refs=['185d420']
     122ea00:	74 1d                	je     122ea1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73fa3>
     122ea02:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     122ea09:	00 
     122ea0a:	4c 89 3f             	mov    QWORD PTR [rdi],r15
     122ea0d:	48 8d 0d 0c ea 62 00 	lea    rcx,[rip+0x62ea0c]        # 185d420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19b08>
     122ea14:	4c 89 fe             	mov    rsi,r15
     122ea17:	4c 89 f2             	mov    rdx,r14
     122ea1a:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
     122ea1d:	eb 08                	jmp    122ea27 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73fab>
     122ea1f:	4c 89 ff             	mov    rdi,r15
     122ea22:	e8 4f a1 fc ff       	call   11f8b76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0fa>
     122ea27:	0f b7 85 00 05 00 00 	movzx  eax,WORD PTR [rbp+0x500]
     122ea2e:	66 89 83 18 02 00 00 	mov    WORD PTR [rbx+0x218],ax
     122ea35:	4d 39 f7             	cmp    r15,r14
     122ea38:	0f 84 2d 02 00 00    	je     122ec6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x741ef>
     122ea3e:	4c 8d bb 20 02 00 00 	lea    r15,[rbx+0x220]
     122ea45:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     122ea4a:	4c 8b b0 08 05 00 00 	mov    r14,QWORD PTR [rax+0x508]
     122ea51:	48 8d a8 10 05 00 00 	lea    rbp,[rax+0x510]
     122ea58:	48 83 bb 30 02 00 00 	cmp    QWORD PTR [rbx+0x230],0x0
     122ea5f:	00 
     122ea60:	0f 84 93 01 00 00    	je     122ebf9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7417d>
     122ea66:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     122ea6d:	00 
     122ea6e:	4d 89 3c 24          	mov    QWORD PTR [r12],r15

### 0x12ee064: mov    QWORD PTR [rsp+0x218],rbp; FDE=(19846624, 19850807); high refs=['18a34f0']
     12ee032:	48 89 c6             	mov    rsi,rax
     12ee035:	e8 18 18 49 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     12ee03a:	0f 57 c0             	xorps  xmm0,xmm0
     12ee03d:	84 c0                	test   al,al
     12ee03f:	0f 84 e9 01 00 00    	je     12ee22e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1337b2>
     12ee045:	0f 11 84 24 00 02 00 	movups XMMWORD PTR [rsp+0x200],xmm0
     12ee04c:	00 
     12ee04d:	48 8d 05 9c 54 5b 00 	lea    rax,[rip+0x5b549c]        # 18a34f0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x10430>
     12ee054:	48 89 84 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rax
     12ee05b:	00 
     12ee05c:	48 89 ac 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rbp
     12ee063:	00 
     12ee064:	48 89 ac 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rbp
     12ee06b:	00 
     12ee06c:	48 8b 84 24 38 01 00 	mov    rax,QWORD PTR [rsp+0x138]
     12ee073:	00 
     12ee074:	a8 01                	test   al,0x1
     12ee076:	0f 85 98 05 00 00    	jne    12ee614 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133b98>
     12ee07c:	48 85 c0             	test   rax,rax
     12ee07f:	0f 84 8c 04 00 00    	je     12ee511 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133a95>
     12ee085:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
     12ee08c:	00 
     12ee08d:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     12ee094:	00 
     12ee095:	e8 c6 09 46 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>

### 0x13acb1f: movups XMMWORD PTR [rbx+0x218],xmm0; FDE=(20628338, 20634772); high refs=['186b0c0', '186b138']
     13acadb:	48 8d 0d de e5 4b 00 	lea    rcx,[rip+0x4be5de]        # 186b0c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x277a8>
     13acae2:	48 89 8b f8 01 00 00 	mov    QWORD PTR [rbx+0x1f8],rcx
     13acae9:	48 85 ed             	test   rbp,rbp
     13acaec:	48 0f 45 c5          	cmovne rax,rbp
     13acaf0:	48 89 83 00 02 00 00 	mov    QWORD PTR [rbx+0x200],rax
     13acaf7:	48 8d 83 08 02 00 00 	lea    rax,[rbx+0x208]
     13acafe:	48 8d 0d 33 e6 4b 00 	lea    rcx,[rip+0x4be633]        # 186b138 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x27820>
     13acb05:	48 89 8b 08 02 00 00 	mov    QWORD PTR [rbx+0x208],rcx
     13acb0c:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     13acb11:	48 85 c9             	test   rcx,rcx
     13acb14:	48 0f 45 c1          	cmovne rax,rcx
     13acb18:	48 89 83 10 02 00 00 	mov    QWORD PTR [rbx+0x210],rax
     13acb1f:	0f 11 83 18 02 00 00 	movups XMMWORD PTR [rbx+0x218],xmm0
     13acb26:	48 83 a3 28 02 00 00 	and    QWORD PTR [rbx+0x228],0x0
     13acb2d:	00 
     13acb2e:	48 8d ab 30 02 00 00 	lea    rbp,[rbx+0x230]
     13acb35:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     13acb3c:	00 
     13acb3d:	48 89 ef             	mov    rdi,rbp
     13acb40:	e8 27 3b 92 ff       	call   cd066c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d60c>
     13acb45:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     13acb4a:	48 89 83 60 02 00 00 	mov    QWORD PTR [rbx+0x260],rax
     13acb51:	0f 57 c0             	xorps  xmm0,xmm0
     13acb54:	0f 11 83 68 02 00 00 	movups XMMWORD PTR [rbx+0x268],xmm0
     13acb5b:	0f 11 83 78 02 00 00 	movups XMMWORD PTR [rbx+0x278],xmm0

### 0x13e2139: mov    QWORD PTR [rbx+0x218],rax; FDE=(20848826, 20849257); high refs=['186d410', '19ee590']
     13e20f7:	0f 11 83 30 01 00 00 	movups XMMWORD PTR [rbx+0x130],xmm0
     13e20fe:	0f 11 83 40 01 00 00 	movups XMMWORD PTR [rbx+0x140],xmm0
     13e2105:	0f 11 83 50 01 00 00 	movups XMMWORD PTR [rbx+0x150],xmm0
     13e210c:	0f 11 83 5c 01 00 00 	movups XMMWORD PTR [rbx+0x15c],xmm0
     13e2113:	66 83 a3 78 01 00 00 	and    WORD PTR [rbx+0x178],0x0
     13e211a:	00 
     13e211b:	48 83 a3 80 01 00 00 	and    QWORD PTR [rbx+0x180],0x0
     13e2122:	00 
     13e2123:	4c 8d b3 88 01 00 00 	lea    r14,[rbx+0x188]
     13e212a:	4c 89 f7             	mov    rdi,r14
     13e212d:	e8 7e d1 40 00       	call   17ef2b0 <_ZNSt6__ndk119__shared_mutex_baseC1Ev@plt>
     13e2132:	48 8d 05 d7 b2 48 00 	lea    rax,[rip+0x48b2d7]        # 186d410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x29af8>
     13e2139:	48 89 83 18 02 00 00 	mov    QWORD PTR [rbx+0x218],rax
     13e2140:	48 8d 3d 49 c4 60 00 	lea    rdi,[rip+0x60c449]        # 19ee590 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51c8>
     13e2147:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     13e214b:	c6 44 24 08 01       	mov    BYTE PTR [rsp+0x8],0x1
     13e2150:	e8 9b bf 40 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     13e2155:	48 8b 05 24 c4 60 00 	mov    rax,QWORD PTR [rip+0x60c424]        # 19ee580 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51b8>
     13e215c:	48 85 c0             	test   rax,rax
     13e215f:	74 27                	je     13e2188 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22770c>
     13e2161:	49 89 c7             	mov    r15,rax
     13e2164:	48 39 58 20          	cmp    QWORD PTR [rax+0x20],rbx
     13e2168:	76 0d                	jbe    13e2177 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2276fb>
     13e216a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     13e216d:	4d 89 fc             	mov    r12,r15

### 0x14f54b3: mov    QWORD PTR [rsp+0x218],0x1; FDE=(21973500, 21978000); high refs=['187a6e0']
     14f5489:	00 
     14f548a:	e8 35 09 00 00       	call   14f5dc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33b348>
     14f548f:	48 83 a4 24 b0 02 00 	and    QWORD PTR [rsp+0x2b0],0x0
     14f5496:	00 00 
     14f5498:	6a 60                	push   0x60
     14f549a:	5f                   	pop    rdi
     14f549b:	e8 60 8a 2f 00       	call   17edf00 <_Znwm@plt>
     14f54a0:	49 89 c6             	mov    r14,rax
     14f54a3:	48 89 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],rax
     14f54aa:	00 
     14f54ab:	48 89 ac 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rbp
     14f54b2:	00 
     14f54b3:	48 c7 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],0x1
     14f54ba:	00 01 00 00 00 
     14f54bf:	48 8d 05 1a 52 38 00 	lea    rax,[rip+0x38521a]        # 187a6e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36dc8>
     14f54c6:	49 89 06             	mov    QWORD PTR [r14],rax
     14f54c9:	4c 89 f7             	mov    rdi,r14
     14f54cc:	48 83 c7 08          	add    rdi,0x8
     14f54d0:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     14f54d7:	00 
     14f54d8:	e8 e7 08 00 00       	call   14f5dc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33b348>
     14f54dd:	4c 8d a4 24 08 02 00 	lea    r12,[rsp+0x208]
     14f54e4:	00 
     14f54e5:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     14f54ea:	48 8d ac 24 90 02 00 	lea    rbp,[rsp+0x290]

### 0x15d4138: movups XMMWORD PTR [rsp+0x218],xmm0; FDE=(22888628, 22890194); high refs=['1887490']
     15d4102:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     15d4107:	0f 57 c0             	xorps  xmm0,xmm0
     15d410a:	0f 11 84 24 f8 01 00 	movups XMMWORD PTR [rsp+0x1f8],xmm0
     15d4111:	00 
     15d4112:	48 8d 05 77 33 2b 00 	lea    rax,[rip+0x2b3377]        # 1887490 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x168>
     15d4119:	48 89 84 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rax
     15d4120:	00 
     15d4121:	48 8d 05 d0 b6 e6 fe 	lea    rax,[rip+0xfffffffffee6b6d0]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     15d4128:	48 89 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],rax
     15d412f:	00 
     15d4130:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     15d4137:	00 
     15d4138:	0f 11 84 24 18 02 00 	movups XMMWORD PTR [rsp+0x218],xmm0
     15d413f:	00 
     15d4140:	c6 84 24 28 02 00 00 	mov    BYTE PTR [rsp+0x228],0x0
     15d4147:	00 
     15d4148:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     15d414f:	00 
     15d4150:	48 8d 0d d1 35 2b 00 	lea    rcx,[rip+0x2b35d1]        # 1887728 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x400>
     15d4157:	48 89 8c 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rcx
     15d415e:	00 
     15d415f:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
     15d4166:	00 
     15d4167:	0f 11 84 24 70 01 00 	movups XMMWORD PTR [rsp+0x170],xmm0
     15d416e:	00 

### 0x1680dfa: movups XMMWORD PTR [rbx+0x218],xmm0; FDE=(23596350, 23596643); high refs=['1899910']
     1680dc6:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1680dc9:	48 89 83 00 02 00 00 	mov    QWORD PTR [rbx+0x200],rax
     1680dd0:	66 83 a3 08 02 00 00 	and    WORD PTR [rbx+0x208],0x0
     1680dd7:	00 
     1680dd8:	4c 8d ab 00 02 00 00 	lea    r13,[rbx+0x200]
     1680ddf:	48 8d bb 10 02 00 00 	lea    rdi,[rbx+0x210]
     1680de6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1680de9:	48 89 c6             	mov    rsi,rax
     1680dec:	ff 51 50             	call   QWORD PTR [rcx+0x50]
     1680def:	48 83 a3 28 02 00 00 	and    QWORD PTR [rbx+0x228],0x0
     1680df6:	00 
     1680df7:	0f 57 c0             	xorps  xmm0,xmm0
     1680dfa:	0f 11 83 18 02 00 00 	movups XMMWORD PTR [rbx+0x218],xmm0
     1680e01:	48 8d 05 08 8b 21 00 	lea    rax,[rip+0x218b08]        # 1899910 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x6850>
     1680e08:	48 89 83 30 02 00 00 	mov    QWORD PTR [rbx+0x230],rax
     1680e0f:	48 83 c4 08          	add    rsp,0x8
     1680e13:	5b                   	pop    rbx
     1680e14:	41 5c                	pop    r12
     1680e16:	41 5d                	pop    r13
     1680e18:	41 5e                	pop    r14
     1680e1a:	41 5f                	pop    r15
     1680e1c:	5d                   	pop    rbp
     1680e1d:	c3                   	ret
     1680e1e:	49 89 c4             	mov    r12,rax
     1680e21:	4c 89 ef             	mov    rdi,r13

### 0x170cc92: mov    QWORD PTR [rsp+0x218],rax; FDE=(24167410, 24176494); high refs=['18ab8e0']
     170cc5f:	49 89 c4             	mov    r12,rax
     170cc62:	48 8d ac 24 68 01 00 	lea    rbp,[rsp+0x168]
     170cc69:	00 
     170cc6a:	48 89 ac 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbp
     170cc71:	00 
     170cc72:	48 8d 84 24 58 01 00 	lea    rax,[rsp+0x158]
     170cc79:	00 
     170cc7a:	48 89 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],rax
     170cc81:	00 
     170cc82:	48 83 a4 24 10 02 00 	and    QWORD PTR [rsp+0x210],0x0
     170cc89:	00 00 
     170cc8b:	48 8d 05 4e ec 19 00 	lea    rax,[rip+0x19ec4e]        # 18ab8e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x18820>
     170cc92:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
     170cc99:	00 
     170cc9a:	48 8d 84 24 00 02 00 	lea    rax,[rsp+0x200]
     170cca1:	00 
     170cca2:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
     170cca9:	00 
     170ccaa:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]
     170ccb1:	00 
     170ccb2:	66 0f 57 c0          	xorpd  xmm0,xmm0
     170ccb6:	66 0f 11 00          	movupd XMMWORD PTR [rax],xmm0
     170ccba:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     170ccbf:	48 8d 84 24 60 02 00 	lea    rax,[rsp+0x260]
     170ccc6:	00 

## Alias-derived first-word stores after lea alias=[owner+0x218]
### alias rdi formed @0xa8d836; FDE=(11061369, 11074699)

### alias rsi formed @0xa8d848; FDE=(11061369, 11074699)

### alias rdi formed @0xa8dd48; FDE=(11061369, 11074699)

### alias rdi formed @0xa8e6b5; FDE=(11061369, 11074699)

### alias rcx formed @0xaa422f; FDE=(11146264, 11168470)
      aa4237:	48 89 01             	mov    QWORD PTR [rcx],rax
      aa421f:	e8 62 a2 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      aa4224:	48 8d 84 24 28 02 00 	lea    rax,[rsp+0x228]
      aa422b:	00 
      aa422c:	48 89 18             	mov    QWORD PTR [rax],rbx
      aa422f:	48 8d 8c 24 18 02 00 	lea    rcx,[rsp+0x218]
      aa4236:	00 
      aa4237:	48 89 01             	mov    QWORD PTR [rcx],rax
      aa423a:	48 8d 05 f5 08 01 00 	lea    rax,[rip+0x108f5]        # ab4b36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ad6>
      aa4241:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      aa4245:	49 89 8d 80 02 00 00 	mov    QWORD PTR [r13+0x280],rcx
      aa424c:	4d 8b 65 18          	mov    r12,QWORD PTR [r13+0x18]
      aa4250:	4d 8b 75 20          	mov    r14,QWORD PTR [r13+0x20]
      aa4254:	6a 10                	push   0x10
      aa4256:	5f                   	pop    rdi
      aa4257:	e8 a4 9c d4 00       	call   17edf00 <_Znwm@plt>

### alias rbp formed @0xac2e21; FDE=(11278045, 11286889)

### alias rdi formed @0xac75f3; FDE=(11299442, 11307271)

### alias rsi formed @0xac7613; FDE=(11299442, 11307271)
      ac76f8:	48 89 06             	mov    QWORD PTR [rsi],rax
      ac76dc:	48 8d 94 24 a0 01 00 	lea    rdx,[rsp+0x1a0]
      ac76e3:	00 
      ac76e4:	e8 a7 ea fe ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
      ac76e9:	48 8d 05 a3 78 8d ff 	lea    rax,[rip+0xffffffffff8d78a3]        # 39ef93 <_ZTSN4asio22service_already_existsE@@Base+0x560>
      ac76f0:	48 8d b4 24 68 03 00 	lea    rsi,[rsp+0x368]
      ac76f7:	00 
      ac76f8:	48 89 06             	mov    QWORD PTR [rsi],rax
      ac76fb:	c7 46 08 5c e1 a4 98 	mov    DWORD PTR [rsi+0x8],0x98a4e15c
      ac7702:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
      ac7709:	00 
      ac770a:	e8 9b a6 cf 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
      ac770f:	48 8d bc 24 d0 14 00 	lea    rdi,[rsp+0x14d0]
      ac7716:	00 
      ac7717:	48 8d b4 24 c0 03 00 	lea    rsi,[rsp+0x3c0]
      ac771e:	00 

### alias rdi formed @0xac77a1; FDE=(11299442, 11307271)

### alias rdi formed @0xac8642; FDE=(11299442, 11307271)

### alias rax formed @0xacc266; FDE=(11321222, 11322021)
      acc280:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      acc264:	74 37                	je     acc29d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1923d>
      acc266:	48 8d 83 18 02 00 00 	lea    rax,[rbx+0x218]
      acc26d:	49 8b 8e 28 02 00 00 	mov    rcx,QWORD PTR [r14+0x228]
      acc274:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      acc278:	41 0f 10 86 18 02 00 	movups xmm0,XMMWORD PTR [r14+0x218]
      acc27f:	00 
      acc280:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      acc283:	0f 57 c0             	xorps  xmm0,xmm0
      acc286:	41 0f 11 86 18 02 00 	movups XMMWORD PTR [r14+0x218],xmm0
      acc28d:	00 
      acc28e:	49 83 a6 28 02 00 00 	and    QWORD PTR [r14+0x228],0x0
      acc295:	00 
      acc296:	c6 83 30 02 00 00 01 	mov    BYTE PTR [rbx+0x230],0x1
      acc29d:	48 83 c4 08          	add    rsp,0x8
      acc2a1:	5b                   	pop    rbx

### alias rax formed @0xb0469b; FDE=(11550686, 11552953)

### alias rdi formed @0xb67c2d; FDE=(11958660, 11960039)
      b67c94:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b67c79:	41 8b 47 10          	mov    eax,DWORD PTR [r15+0x10]
      b67c7d:	41 89 44 24 10       	mov    DWORD PTR [r12+0x10],eax
      b67c82:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
      b67c86:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
      b67c8b:	e9 d6 00 00 00       	jmp    b67d66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4d06>
      b67c90:	49 8b 7e 70          	mov    rdi,QWORD PTR [r14+0x70]
      b67c94:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b67c97:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b67c9a:	e9 64 01 00 00       	jmp    b67e03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4da3>
      b67c9f:	4c 8d bc 24 58 02 00 	lea    r15,[rsp+0x258]
      b67ca6:	00 
      b67ca7:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      b67cac:	4c 89 ff             	mov    rdi,r15
      b67caf:	e8 be 09 00 00       	call   b68672 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5612>
      b67cb4:	4c 89 ff             	mov    rdi,r15
      b67cdf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b67ccc:	44 89 ef             	mov    edi,r13d
      b67ccf:	4c 89 e6             	mov    rsi,r12
      b67cd2:	e8 49 3b f1 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
      b67cd7:	84 c0                	test   al,al
      b67cd9:	74 0f                	je     b67cea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4c8a>
      b67cdb:	49 8b 7e 70          	mov    rdi,QWORD PTR [r14+0x70]
      b67cdf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b67ce2:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b67ce5:	e9 0c 01 00 00       	jmp    b67df6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4d96>
      b67cea:	48 8d ac 24 b0 03 00 	lea    rbp,[rsp+0x3b0]
      b67cf1:	00 
      b67cf2:	48 89 ef             	mov    rdi,rbp
      b67cf5:	e8 2a d2 c3 00       	call   17a4f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x159090>
      b67cfa:	4c 89 fe             	mov    rsi,r15
      b67cfd:	48 ff c6             	inc    rsi
      b67de3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b67dcd:	48 8b bc 24 10 04 00 	mov    rdi,QWORD PTR [rsp+0x410]
      b67dd4:	00 
      b67dd5:	48 83 a4 24 10 04 00 	and    QWORD PTR [rsp+0x410],0x0
      b67ddc:	00 00 
      b67dde:	48 85 ff             	test   rdi,rdi
      b67de1:	74 06                	je     b67de9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4d89>
      b67de3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b67de6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b67de9:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
      b67df0:	00 
      b67df1:	e8 6e 09 00 00       	call   b68764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5704>
      b67df6:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      b67dfd:	00 
      b67dfe:	e8 77 09 00 00       	call   b6877a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb571a>
      b67e03:	80 7c 24 58 00       	cmp    BYTE PTR [rsp+0x58],0x0

### alias rdi formed @0xb8c36b; FDE=(12104738, 12113141)

### alias r15 formed @0xb8c7d5; FDE=(12104738, 12113141)

### alias rdi formed @0xb8ca9b; FDE=(12104738, 12113141)

### alias rdi formed @0xb8cecd; FDE=(12104738, 12113141)

### alias rdi formed @0xb8d413; FDE=(12104738, 12113141)

### alias rdi formed @0xc2d20c; FDE=(12764448, 12771716)

### alias r15 formed @0xc5f541; FDE=(12972618, 12978686)

### alias rdi formed @0xc6cb4d; FDE=(13025418, 13033601)
      c6cd21:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c6cd0d:	48 89 74 24 48       	mov    QWORD PTR [rsp+0x48],rsi
      c6cd12:	74 13                	je     c6cd27 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b9cc7>
      c6cd14:	48 8d 84 24 00 04 00 	lea    rax,[rsp+0x400]
      c6cd1b:	00 
      c6cd1c:	48 39 c7             	cmp    rdi,rax
      c6cd1f:	74 0f                	je     c6cd30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b9cd0>
      c6cd21:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c6cd24:	ff 50 10             	call   QWORD PTR [rax+0x10]
      c6cd27:	49 89 85 70 03 00 00 	mov    QWORD PTR [r13+0x370],rax
      c6cd2e:	eb 15                	jmp    c6cd45 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b9ce5>
      c6cd30:	49 89 b5 70 03 00 00 	mov    QWORD PTR [r13+0x370],rsi
      c6cd37:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
      c6cd3e:	00 
      c6cd3f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c6cd42:	ff 50 18             	call   QWORD PTR [rax+0x18]
      c6cd3f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c6cd24:	ff 50 10             	call   QWORD PTR [rax+0x10]
      c6cd27:	49 89 85 70 03 00 00 	mov    QWORD PTR [r13+0x370],rax
      c6cd2e:	eb 15                	jmp    c6cd45 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b9ce5>
      c6cd30:	49 89 b5 70 03 00 00 	mov    QWORD PTR [r13+0x370],rsi
      c6cd37:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
      c6cd3e:	00 
      c6cd3f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c6cd42:	ff 50 18             	call   QWORD PTR [rax+0x18]
      c6cd45:	4d 8d b5 40 02 00 00 	lea    r14,[r13+0x240]
      c6cd4c:	31 ed                	xor    ebp,ebp
      c6cd4e:	4c 8d a4 24 90 02 00 	lea    r12,[rsp+0x290]
      c6cd55:	00 
      c6cd56:	48 8d 05 eb f2 75 ff 	lea    rax,[rip+0xffffffffff75f2eb]        # 3cc048 <_ZTSN5boost9exceptionE@@Base+0x2ca2a>
      c6cd5d:	44 0f b6 7c 05 00    	movzx  r15d,BYTE PTR [rbp+rax*1+0x0]
      c6cd63:	6a 28                	push   0x28

### alias rdi formed @0xc7623e; FDE=(13063558, 13068958)

### alias rdi formed @0xc775d6; FDE=(13071602, 13071930)

### alias rdi formed @0xc864f5; FDE=(13131102, 13135445)

### alias rsi formed @0xc86b7c; FDE=(13131102, 13135445)

### alias rdx formed @0xc86baf; FDE=(13131102, 13135445)

### alias r14 formed @0xcb6795; FDE=(13328284, 13331598)

### alias r13 formed @0xcb80da; FDE=(13335072, 13355319)

### alias rdi formed @0xcbad96; FDE=(13335072, 13355319)

### alias rdi formed @0xcbbd27; FDE=(13335072, 13355319)

### alias rdi formed @0xcbc7a5; FDE=(13335072, 13355319)

### alias rdi formed @0xcc1c8b; FDE=(13376236, 13376743)

### alias r14 formed @0xcc7c1b; FDE=(13399724, 13404900)

### alias r8 formed @0xcc7e8f; FDE=(13399724, 13404900)
      cc7e97:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7e7f:	ff 50 30             	call   QWORD PTR [rax+0x30]
      cc7e82:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
      cc7e87:	49 8b 9c 24 e0 05 00 	mov    rbx,QWORD PTR [r12+0x5e0]
      cc7e8e:	00 
      cc7e8f:	4c 8d 84 24 18 02 00 	lea    r8,[rsp+0x218]
      cc7e96:	00 
      cc7e97:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7e9a:	4d 89 68 08          	mov    QWORD PTR [r8+0x8],r13
      cc7e9e:	48 8d 35 ec 51 dd ff 	lea    rsi,[rip+0xffffffffffdd51ec]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      cc7ea5:	48 8d 0d e4 11 00 00 	lea    rcx,[rip+0x11e4]        # cc9090 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216030>
      cc7eac:	4c 8d bc 24 28 02 00 	lea    r15,[rsp+0x228]
      cc7eb3:	00 
      cc7eb4:	6a 10                	push   0x10
      cc7eb6:	41 59                	pop    r9
      cc7eb8:	4c 89 ff             	mov    rdi,r15
      cc7ee6:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7ed0:	4c 89 fa             	mov    rdx,r15
      cc7ed3:	ff 50 38             	call   QWORD PTR [rax+0x38]
      cc7ed6:	49 8b 9c 24 e0 05 00 	mov    rbx,QWORD PTR [r12+0x5e0]
      cc7edd:	00 
      cc7ede:	4c 8d 84 24 c8 01 00 	lea    r8,[rsp+0x1c8]
      cc7ee5:	00 
      cc7ee6:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7ee9:	4d 89 68 08          	mov    QWORD PTR [r8+0x8],r13
      cc7eed:	48 8d 35 9d 51 dd ff 	lea    rsi,[rip+0xffffffffffdd519d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      cc7ef4:	48 8d 0d b5 11 00 00 	lea    rcx,[rip+0x11b5]        # cc90b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216050>
      cc7efb:	4c 8d bc 24 d8 01 00 	lea    r15,[rsp+0x1d8]
      cc7f02:	00 
      cc7f03:	6a 10                	push   0x10
      cc7f05:	41 59                	pop    r9
      cc7f07:	4c 89 ff             	mov    rdi,r15
      cc7f35:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7f1f:	4c 89 fa             	mov    rdx,r15
      cc7f22:	ff 50 40             	call   QWORD PTR [rax+0x40]
      cc7f25:	49 8b 9c 24 e0 05 00 	mov    rbx,QWORD PTR [r12+0x5e0]
      cc7f2c:	00 
      cc7f2d:	4c 8d 84 24 78 01 00 	lea    r8,[rsp+0x178]
      cc7f34:	00 
      cc7f35:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7f38:	4d 89 68 08          	mov    QWORD PTR [r8+0x8],r13
      cc7f3c:	48 8d 35 4e 51 dd ff 	lea    rsi,[rip+0xffffffffffdd514e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      cc7f43:	48 8d 0d 86 11 00 00 	lea    rcx,[rip+0x1186]        # cc90d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216070>
      cc7f4a:	4c 8d bc 24 88 01 00 	lea    r15,[rsp+0x188]
      cc7f51:	00 
      cc7f52:	6a 10                	push   0x10
      cc7f54:	41 59                	pop    r9
      cc7f56:	4c 89 ff             	mov    rdi,r15
      cc7f84:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7f6e:	4c 89 fa             	mov    rdx,r15
      cc7f71:	ff 50 48             	call   QWORD PTR [rax+0x48]
      cc7f74:	49 8b 9c 24 e0 05 00 	mov    rbx,QWORD PTR [r12+0x5e0]
      cc7f7b:	00 
      cc7f7c:	4c 8d 84 24 28 01 00 	lea    r8,[rsp+0x128]
      cc7f83:	00 
      cc7f84:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7f87:	4d 89 68 08          	mov    QWORD PTR [r8+0x8],r13
      cc7f8b:	48 8d 35 ff 50 dd ff 	lea    rsi,[rip+0xffffffffffdd50ff]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      cc7f92:	48 8d 0d e7 11 00 00 	lea    rcx,[rip+0x11e7]        # cc9180 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216120>
      cc7f99:	4c 8d bc 24 38 01 00 	lea    r15,[rsp+0x138]
      cc7fa0:	00 
      cc7fa1:	6a 10                	push   0x10
      cc7fa3:	41 59                	pop    r9
      cc7fa5:	4c 89 ff             	mov    rdi,r15
      cc7fdb:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7fc3:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
      cc7fca:	00 
      cc7fcb:	49 8b 9c 24 e0 05 00 	mov    rbx,QWORD PTR [r12+0x5e0]
      cc7fd2:	00 
      cc7fd3:	4c 8d 84 24 d8 00 00 	lea    r8,[rsp+0xd8]
      cc7fda:	00 
      cc7fdb:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc7fde:	4d 89 68 08          	mov    QWORD PTR [r8+0x8],r13
      cc7fe2:	48 8d 35 a8 50 dd ff 	lea    rsi,[rip+0xffffffffffdd50a8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      cc7fe9:	48 8d 0d b0 11 00 00 	lea    rcx,[rip+0x11b0]        # cc91a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216140>
      cc7ff0:	4c 8d bc 24 e8 00 00 	lea    r15,[rsp+0xe8]
      cc7ff7:	00 
      cc7ff8:	6a 10                	push   0x10
      cc7ffa:	41 59                	pop    r9
      cc7ffc:	4c 89 ff             	mov    rdi,r15
      cc802d:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc8015:	4c 8d b4 24 b0 03 00 	lea    r14,[rsp+0x3b0]
      cc801c:	00 
      cc801d:	49 8b 9c 24 e0 05 00 	mov    rbx,QWORD PTR [r12+0x5e0]
      cc8024:	00 
      cc8025:	4c 8d 84 24 88 00 00 	lea    r8,[rsp+0x88]
      cc802c:	00 
      cc802d:	4d 89 20             	mov    QWORD PTR [r8],r12
      cc8030:	4d 89 68 08          	mov    QWORD PTR [r8+0x8],r13
      cc8034:	48 8d 35 56 50 dd ff 	lea    rsi,[rip+0xffffffffffdd5056]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      cc803b:	48 8d 0d 1a 12 00 00 	lea    rcx,[rip+0x121a]        # cc925c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2161fc>
      cc8042:	4c 8d bc 24 98 00 00 	lea    r15,[rsp+0x98]
      cc8049:	00 
      cc804a:	6a 10                	push   0x10
      cc804c:	41 59                	pop    r9
      cc804e:	4c 89 ff             	mov    rdi,r15

### alias rdi formed @0xcc8d33; FDE=(13405390, 13405621)

### alias rsi formed @0xcd5ef4; FDE=(13458692, 13460003)

### alias rdi formed @0xcd62cc; FDE=(13460036, 13460437)

### alias rdi formed @0xce9a7e; FDE=(13537014, 13541732)

### alias r13 formed @0xce9cf2; FDE=(13537014, 13541732)

### alias rdi formed @0xcf26b1; FDE=(13575838, 13575987)

### alias rdi formed @0xd084c8; FDE=(13662166, 13668602)

### alias rax formed @0xd08e6d; FDE=(13662166, 13668602)

### alias rdi formed @0xd150d0; FDE=(13717652, 13720368)
      d152b9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d152a5:	45 31 f6             	xor    r14d,r14d
      d152a8:	31 d2                	xor    edx,edx
      d152aa:	31 db                	xor    ebx,ebx
      d152ac:	48 6b c2 30          	imul   rax,rdx,0x30
      d152b0:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      d152b5:	48 8b 3c 01          	mov    rdi,QWORD PTR [rcx+rax*1]
      d152b9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d152bc:	ff 50 60             	call   QWORD PTR [rax+0x60]
      d152bf:	49 89 c4             	mov    r12,rax
      d152c2:	48 8b 00             	mov    rax,QWORD PTR [rax]
      d152c5:	4c 89 e7             	mov    rdi,r12
      d152c8:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      d152ce:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d152d1:	48 3b 48 08          	cmp    rcx,QWORD PTR [rax+0x8]
      d152d5:	0f 84 1e 03 00 00    	je     d155f9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262599>

### alias rdi formed @0xd167e7; FDE=(13723022, 13723828)

### alias rax formed @0xd17212; FDE=(13726226, 13726234)

### alias rax formed @0xd189ff; FDE=(13731858, 13738390)
      d18a62:	48 8b 00             	mov    rax,QWORD PTR [rax]
      d18a4c:	48 89 ee             	mov    rsi,rbp
      d18a4f:	e8 9e 38 94 00       	call   165c2f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1045e>
      d18a54:	84 c0                	test   al,al
      d18a56:	74 c9                	je     d18a21 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2659c1>
      d18a58:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
      d18a5d:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      d18a62:	48 8b 00             	mov    rax,QWORD PTR [rax]
      d18a65:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      d18a6a:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      d18a6d:	48 29 c8             	sub    rax,rcx
      d18a70:	48 99                	cqo
      d18a72:	6a 30                	push   0x30
      d18a74:	5f                   	pop    rdi
      d18a75:	48 f7 ff             	idiv   rdi
      d18a78:	48 39 f0             	cmp    rax,rsi

### alias r12 formed @0xd1cf9b; FDE=(13750004, 13751259)
      d1cfb1:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
      d1cf96:	e8 15 c7 d9 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
      d1cf9b:	4d 8d a5 18 02 00 00 	lea    r12,[r13+0x218]
      d1cfa2:	4a 8d 2c b5 00 00 00 	lea    rbp,[r14*4+0x0]
      d1cfa9:	00 
      d1cfaa:	45 31 f6             	xor    r14d,r14d
      d1cfad:	43 8b 04 37          	mov    eax,DWORD PTR [r15+r14*1]
      d1cfb1:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
      d1cfb5:	48 6b c0 30          	imul   rax,rax,0x30
      d1cfb9:	4c 8b 6c 01 08       	mov    r13,QWORD PTR [rcx+rax*1+0x8]
      d1cfbe:	f3 0f 6f 04 01       	movdqu xmm0,XMMWORD PTR [rcx+rax*1]
      d1cfc3:	66 0f 7f 44 24 60    	movdqa XMMWORD PTR [rsp+0x60],xmm0
      d1cfc9:	4d 85 ed             	test   r13,r13
      d1cfcc:	74 05                	je     d1cfd3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x269f73>
      d1cfce:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      d1cfd3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]

### alias r12 formed @0xd1d0ab; FDE=(13750004, 13751259)

### alias rdi formed @0xd2fd2c; FDE=(13827188, 13827789)
      d2fe38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d2fe14:	48 8d 05 55 38 af 00 	lea    rax,[rip+0xaf3855]        # 1823670 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x19330>
      d2fe1b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      d2fe20:	0f 11 44 24 18       	movups XMMWORD PTR [rsp+0x18],xmm0
      d2fe25:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
      d2fe2a:	48 8d 8b d8 02 00 00 	lea    rcx,[rbx+0x2d8]
      d2fe31:	48 81 c3 b8 01 00 00 	add    rbx,0x1b8
      d2fe38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d2fe3b:	48 89 de             	mov    rsi,rbx
      d2fe3e:	4c 89 f2             	mov    rdx,r14
      d2fe41:	4d 89 e0             	mov    r8,r12
      d2fe44:	ff 50 30             	call   QWORD PTR [rax+0x30]
      d2fe47:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d2fe4c:	e8 19 a1 d4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d2fe51:	31 ff                	xor    edi,edi
      d2fe53:	e8 5a e6 d6 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>

### alias rcx formed @0xd3d887; FDE=(13883388, 13883643)

### alias rdi formed @0xd5a5cf; FDE=(13997032, 14004414)

### alias rdx formed @0xd5a622; FDE=(13997032, 14004414)

### alias rdi formed @0xd5a647; FDE=(13997032, 14004414)

### alias r14 formed @0xd9b22a; FDE=(14266572, 14269634)

### alias rdi formed @0xd9b356; FDE=(14266572, 14269634)

### alias rdi formed @0xd9b679; FDE=(14266572, 14269634)
      d9b7a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b78f:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
      d9b796:	00 
      d9b797:	e8 f4 26 a5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d9b79c:	8b 6c 24 14          	mov    ebp,DWORD PTR [rsp+0x14]
      d9b7a0:	44 8b 74 24 18       	mov    r14d,DWORD PTR [rsp+0x18]
      d9b7a5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7ac:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b7af:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
      d9b7b4:	0f 8e f2 00 00 00    	jle    d9b8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68932>
      d9b7ba:	44 89 74 24 18       	mov    DWORD PTR [rsp+0x18],r14d
      d9b7bf:	89 6c 24 14          	mov    DWORD PTR [rsp+0x14],ebp
      d9b7c3:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      d9b7c8:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7af:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
      d9b7b4:	0f 8e f2 00 00 00    	jle    d9b8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68932>
      d9b7ba:	44 89 74 24 18       	mov    DWORD PTR [rsp+0x18],r14d
      d9b7bf:	89 6c 24 14          	mov    DWORD PTR [rsp+0x14],ebp
      d9b7c3:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      d9b7c8:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7d2:	ff 50 50             	call   QWORD PTR [rax+0x50]
      d9b7d5:	49 89 c6             	mov    r14,rax
      d9b7d8:	48 8d b8 d0 09 00 00 	lea    rdi,[rax+0x9d0]
      d9b7df:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
      d9b7e5:	48 89 c5             	mov    rbp,rax
      d9b7e8:	4d 8b b6 00 0a 00 00 	mov    r14,QWORD PTR [r14+0xa00]
      d9b7ef:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7d5:	49 89 c6             	mov    r14,rax
      d9b7d8:	48 8d b8 d0 09 00 00 	lea    rdi,[rax+0x9d0]
      d9b7df:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
      d9b7e5:	48 89 c5             	mov    rbp,rax
      d9b7e8:	4d 8b b6 00 0a 00 00 	mov    r14,QWORD PTR [r14+0xa00]
      d9b7ef:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f6:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b7f9:	4c 03 70 10          	add    r14,QWORD PTR [rax+0x10]
      d9b7fd:	4d 69 ee e8 03 00 00 	imul   r13,r14,0x3e8
      d9b804:	49 01 ed             	add    r13,rbp
      d9b807:	4d 89 ef             	mov    r15,r13
      d9b80a:	49 c1 ef 08          	shr    r15,0x8
      d9b80e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f9:	4c 03 70 10          	add    r14,QWORD PTR [rax+0x10]
      d9b7fd:	4d 69 ee e8 03 00 00 	imul   r13,r14,0x3e8
      d9b804:	49 01 ed             	add    r13,rbp
      d9b807:	4d 89 ef             	mov    r15,r13
      d9b80a:	49 c1 ef 08          	shr    r15,0x8
      d9b80e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b815:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b818:	b1 01                	mov    cl,0x1
      d9b81a:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
      d9b81f:	80 78 51 00          	cmp    BYTE PTR [rax+0x51],0x0
      d9b823:	0f 84 90 00 00 00    	je     d9b8b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6893f>
      d9b829:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
      d9b82d:	4c 8d b4 24 18 02 00 	lea    r14,[rsp+0x218]
      d9b834:	00 

### alias rdi formed @0xd9b6d4; FDE=(14266572, 14269634)
      d9b7a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b78f:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
      d9b796:	00 
      d9b797:	e8 f4 26 a5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d9b79c:	8b 6c 24 14          	mov    ebp,DWORD PTR [rsp+0x14]
      d9b7a0:	44 8b 74 24 18       	mov    r14d,DWORD PTR [rsp+0x18]
      d9b7a5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7ac:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b7af:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
      d9b7b4:	0f 8e f2 00 00 00    	jle    d9b8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68932>
      d9b7ba:	44 89 74 24 18       	mov    DWORD PTR [rsp+0x18],r14d
      d9b7bf:	89 6c 24 14          	mov    DWORD PTR [rsp+0x14],ebp
      d9b7c3:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      d9b7c8:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7af:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
      d9b7b4:	0f 8e f2 00 00 00    	jle    d9b8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68932>
      d9b7ba:	44 89 74 24 18       	mov    DWORD PTR [rsp+0x18],r14d
      d9b7bf:	89 6c 24 14          	mov    DWORD PTR [rsp+0x14],ebp
      d9b7c3:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      d9b7c8:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7d2:	ff 50 50             	call   QWORD PTR [rax+0x50]
      d9b7d5:	49 89 c6             	mov    r14,rax
      d9b7d8:	48 8d b8 d0 09 00 00 	lea    rdi,[rax+0x9d0]
      d9b7df:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
      d9b7e5:	48 89 c5             	mov    rbp,rax
      d9b7e8:	4d 8b b6 00 0a 00 00 	mov    r14,QWORD PTR [r14+0xa00]
      d9b7ef:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7d5:	49 89 c6             	mov    r14,rax
      d9b7d8:	48 8d b8 d0 09 00 00 	lea    rdi,[rax+0x9d0]
      d9b7df:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
      d9b7e5:	48 89 c5             	mov    rbp,rax
      d9b7e8:	4d 8b b6 00 0a 00 00 	mov    r14,QWORD PTR [r14+0xa00]
      d9b7ef:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f6:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b7f9:	4c 03 70 10          	add    r14,QWORD PTR [rax+0x10]
      d9b7fd:	4d 69 ee e8 03 00 00 	imul   r13,r14,0x3e8
      d9b804:	49 01 ed             	add    r13,rbp
      d9b807:	4d 89 ef             	mov    r15,r13
      d9b80a:	49 c1 ef 08          	shr    r15,0x8
      d9b80e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f9:	4c 03 70 10          	add    r14,QWORD PTR [rax+0x10]
      d9b7fd:	4d 69 ee e8 03 00 00 	imul   r13,r14,0x3e8
      d9b804:	49 01 ed             	add    r13,rbp
      d9b807:	4d 89 ef             	mov    r15,r13
      d9b80a:	49 c1 ef 08          	shr    r15,0x8
      d9b80e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b815:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b818:	b1 01                	mov    cl,0x1
      d9b81a:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
      d9b81f:	80 78 51 00          	cmp    BYTE PTR [rax+0x51],0x0
      d9b823:	0f 84 90 00 00 00    	je     d9b8b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6893f>
      d9b829:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
      d9b82d:	4c 8d b4 24 18 02 00 	lea    r14,[rsp+0x218]
      d9b834:	00 

### alias rdi formed @0xd9b724; FDE=(14266572, 14269634)
      d9b7a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b78f:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
      d9b796:	00 
      d9b797:	e8 f4 26 a5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d9b79c:	8b 6c 24 14          	mov    ebp,DWORD PTR [rsp+0x14]
      d9b7a0:	44 8b 74 24 18       	mov    r14d,DWORD PTR [rsp+0x18]
      d9b7a5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7ac:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b7af:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
      d9b7b4:	0f 8e f2 00 00 00    	jle    d9b8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68932>
      d9b7ba:	44 89 74 24 18       	mov    DWORD PTR [rsp+0x18],r14d
      d9b7bf:	89 6c 24 14          	mov    DWORD PTR [rsp+0x14],ebp
      d9b7c3:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      d9b7c8:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7af:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
      d9b7b4:	0f 8e f2 00 00 00    	jle    d9b8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68932>
      d9b7ba:	44 89 74 24 18       	mov    DWORD PTR [rsp+0x18],r14d
      d9b7bf:	89 6c 24 14          	mov    DWORD PTR [rsp+0x14],ebp
      d9b7c3:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      d9b7c8:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7d2:	ff 50 50             	call   QWORD PTR [rax+0x50]
      d9b7d5:	49 89 c6             	mov    r14,rax
      d9b7d8:	48 8d b8 d0 09 00 00 	lea    rdi,[rax+0x9d0]
      d9b7df:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
      d9b7e5:	48 89 c5             	mov    rbp,rax
      d9b7e8:	4d 8b b6 00 0a 00 00 	mov    r14,QWORD PTR [r14+0xa00]
      d9b7ef:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7d5:	49 89 c6             	mov    r14,rax
      d9b7d8:	48 8d b8 d0 09 00 00 	lea    rdi,[rax+0x9d0]
      d9b7df:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
      d9b7e5:	48 89 c5             	mov    rbp,rax
      d9b7e8:	4d 8b b6 00 0a 00 00 	mov    r14,QWORD PTR [r14+0xa00]
      d9b7ef:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f6:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b7f9:	4c 03 70 10          	add    r14,QWORD PTR [rax+0x10]
      d9b7fd:	4d 69 ee e8 03 00 00 	imul   r13,r14,0x3e8
      d9b804:	49 01 ed             	add    r13,rbp
      d9b807:	4d 89 ef             	mov    r15,r13
      d9b80a:	49 c1 ef 08          	shr    r15,0x8
      d9b80e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f9:	4c 03 70 10          	add    r14,QWORD PTR [rax+0x10]
      d9b7fd:	4d 69 ee e8 03 00 00 	imul   r13,r14,0x3e8
      d9b804:	49 01 ed             	add    r13,rbp
      d9b807:	4d 89 ef             	mov    r15,r13
      d9b80a:	49 c1 ef 08          	shr    r15,0x8
      d9b80e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b815:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b818:	b1 01                	mov    cl,0x1
      d9b81a:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
      d9b81f:	80 78 51 00          	cmp    BYTE PTR [rax+0x51],0x0
      d9b823:	0f 84 90 00 00 00    	je     d9b8b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6893f>
      d9b829:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
      d9b82d:	4c 8d b4 24 18 02 00 	lea    r14,[rsp+0x218]
      d9b834:	00 

### alias rdi formed @0xd9b78f; FDE=(14266572, 14269634)
      d9b7a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b78f:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
      d9b796:	00 
      d9b797:	e8 f4 26 a5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d9b79c:	8b 6c 24 14          	mov    ebp,DWORD PTR [rsp+0x14]
      d9b7a0:	44 8b 74 24 18       	mov    r14d,DWORD PTR [rsp+0x18]
      d9b7a5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7ac:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b7af:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
      d9b7b4:	0f 8e f2 00 00 00    	jle    d9b8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68932>
      d9b7ba:	44 89 74 24 18       	mov    DWORD PTR [rsp+0x18],r14d
      d9b7bf:	89 6c 24 14          	mov    DWORD PTR [rsp+0x14],ebp
      d9b7c3:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      d9b7c8:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7af:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
      d9b7b4:	0f 8e f2 00 00 00    	jle    d9b8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68932>
      d9b7ba:	44 89 74 24 18       	mov    DWORD PTR [rsp+0x18],r14d
      d9b7bf:	89 6c 24 14          	mov    DWORD PTR [rsp+0x14],ebp
      d9b7c3:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      d9b7c8:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      d9b7cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7d2:	ff 50 50             	call   QWORD PTR [rax+0x50]
      d9b7d5:	49 89 c6             	mov    r14,rax
      d9b7d8:	48 8d b8 d0 09 00 00 	lea    rdi,[rax+0x9d0]
      d9b7df:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
      d9b7e5:	48 89 c5             	mov    rbp,rax
      d9b7e8:	4d 8b b6 00 0a 00 00 	mov    r14,QWORD PTR [r14+0xa00]
      d9b7ef:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7d5:	49 89 c6             	mov    r14,rax
      d9b7d8:	48 8d b8 d0 09 00 00 	lea    rdi,[rax+0x9d0]
      d9b7df:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
      d9b7e5:	48 89 c5             	mov    rbp,rax
      d9b7e8:	4d 8b b6 00 0a 00 00 	mov    r14,QWORD PTR [r14+0xa00]
      d9b7ef:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b7f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f6:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b7f9:	4c 03 70 10          	add    r14,QWORD PTR [rax+0x10]
      d9b7fd:	4d 69 ee e8 03 00 00 	imul   r13,r14,0x3e8
      d9b804:	49 01 ed             	add    r13,rbp
      d9b807:	4d 89 ef             	mov    r15,r13
      d9b80a:	49 c1 ef 08          	shr    r15,0x8
      d9b80e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b7f9:	4c 03 70 10          	add    r14,QWORD PTR [rax+0x10]
      d9b7fd:	4d 69 ee e8 03 00 00 	imul   r13,r14,0x3e8
      d9b804:	49 01 ed             	add    r13,rbp
      d9b807:	4d 89 ef             	mov    r15,r13
      d9b80a:	49 c1 ef 08          	shr    r15,0x8
      d9b80e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d9b812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9b815:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d9b818:	b1 01                	mov    cl,0x1
      d9b81a:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
      d9b81f:	80 78 51 00          	cmp    BYTE PTR [rax+0x51],0x0
      d9b823:	0f 84 90 00 00 00    	je     d9b8b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6893f>
      d9b829:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
      d9b82d:	4c 8d b4 24 18 02 00 	lea    r14,[rsp+0x218]
      d9b834:	00 

### alias r14 formed @0xd9b82d; FDE=(14266572, 14269634)
      d9b83d:	45 8a 26             	mov    r12b,BYTE PTR [r14]
      d9b823:	0f 84 90 00 00 00    	je     d9b8b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6893f>
      d9b829:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
      d9b82d:	4c 8d b4 24 18 02 00 	lea    r14,[rsp+0x218]
      d9b834:	00 
      d9b835:	4c 89 f7             	mov    rdi,r14
      d9b838:	e8 ed ec 92 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      d9b83d:	45 8a 26             	mov    r12b,BYTE PTR [r14]
      d9b840:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
      d9b844:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      d9b849:	48 8b 68 08          	mov    rbp,QWORD PTR [rax+0x8]
      d9b84d:	8b 40 04             	mov    eax,DWORD PTR [rax+0x4]
      d9b850:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d9b855:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
      d9b85c:	00 
      d9b85d:	6a 01                	push   0x1

### alias rdi formed @0xd9b965; FDE=(14266572, 14269634)

### alias rcx formed @0xd9b9c3; FDE=(14266572, 14269634)

### alias rdi formed @0xd9bbc5; FDE=(14266572, 14269634)

### alias rax formed @0xdb12a1; FDE=(14355474, 14361896)
      db1305:	48 89 08             	mov    QWORD PTR [rax],rcx
      db12e7:	88 94 24 11 02 00 00 	mov    BYTE PTR [rsp+0x211],dl
      db12ee:	41 8a 96 63 02 00 00 	mov    dl,BYTE PTR [r14+0x263]
      db12f5:	88 94 24 12 02 00 00 	mov    BYTE PTR [rsp+0x212],dl
      db12fc:	8a 51 08             	mov    dl,BYTE PTR [rcx+0x8]
      db12ff:	88 50 08             	mov    BYTE PTR [rax+0x8],dl
      db1302:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      db1305:	48 89 08             	mov    QWORD PTR [rax],rcx
      db1308:	4d 8b be 90 01 00 00 	mov    r15,QWORD PTR [r14+0x190]
      db130f:	bf d0 09 00 00       	mov    edi,0x9d0
      db1314:	e8 e7 cb a3 00       	call   17edf00 <_Znwm@plt>
      db1319:	49 89 c4             	mov    r12,rax
      db131c:	48 8b 9c 24 c8 05 00 	mov    rbx,QWORD PTR [rsp+0x5c8]
      db1323:	00 
      db1324:	66 0f ef c0          	pxor   xmm0,xmm0
      db1328:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      db13d4:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      db13bf:	00 
      db13c0:	48 8b 11             	mov    rdx,QWORD PTR [rcx]
      db13c3:	48 89 54 24 20       	mov    QWORD PTR [rsp+0x20],rdx
      db13c8:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      db13cc:	48 8b 9c 24 c0 05 00 	mov    rbx,QWORD PTR [rsp+0x5c0]
      db13d3:	00 
      db13d4:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      db13d7:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
      db13dc:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      db13e0:	48 85 c0             	test   rax,rax
      db13e3:	74 05                	je     db13ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e470>
      db13e5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      db13ea:	48 8d 05 9f 7e a7 00 	lea    rax,[rip+0xa77e9f]        # 1829290 <_ZTIN4asio2ip16bad_address_castE@@Base+0x58c0>
      db13f1:	48 8d 8c 24 c0 02 00 	lea    rcx,[rsp+0x2c0]
      db13f8:	00 

### alias rdi formed @0xdbc35b; FDE=(14400956, 14404741)
      dbc3a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc38e:	00 
      dbc38f:	48 8d b4 24 e8 00 00 	lea    rsi,[rsp+0xe8]
      dbc396:	00 
      dbc397:	48 89 df             	mov    rdi,rbx
      dbc39a:	e8 5d d7 82 00       	call   15e9afc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f080>
      dbc39f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3a5:	be 30 75 00 00       	mov    esi,0x7530
      dbc3aa:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      dbc3b0:	41 0f b6 b6 82 01 00 	movzx  esi,BYTE PTR [r14+0x182]
      dbc3b7:	00 
      dbc3b8:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3bb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3be:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      dbc3c4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3bb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3a5:	be 30 75 00 00       	mov    esi,0x7530
      dbc3aa:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      dbc3b0:	41 0f b6 b6 82 01 00 	movzx  esi,BYTE PTR [r14+0x182]
      dbc3b7:	00 
      dbc3b8:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3bb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3be:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      dbc3c4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3c7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3ca:	be b8 0b 00 00       	mov    esi,0xbb8
      dbc3cf:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      dbc3d5:	49 8b b6 58 02 00 00 	mov    rsi,QWORD PTR [r14+0x258]
      dbc3dc:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3c7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3b0:	41 0f b6 b6 82 01 00 	movzx  esi,BYTE PTR [r14+0x182]
      dbc3b7:	00 
      dbc3b8:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3bb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3be:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      dbc3c4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3c7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3ca:	be b8 0b 00 00       	mov    esi,0xbb8
      dbc3cf:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      dbc3d5:	49 8b b6 58 02 00 00 	mov    rsi,QWORD PTR [r14+0x258]
      dbc3dc:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3e2:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dbc3e8:	48 8d 05 29 d1 a6 00 	lea    rax,[rip+0xa6d129]        # 1829518 <_ZTIN4asio2ip16bad_address_castE@@Base+0x5b48>
      dbc3ef:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
      dbc3df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3c4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3c7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3ca:	be b8 0b 00 00       	mov    esi,0xbb8
      dbc3cf:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      dbc3d5:	49 8b b6 58 02 00 00 	mov    rsi,QWORD PTR [r14+0x258]
      dbc3dc:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc3df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3e2:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dbc3e8:	48 8d 05 29 d1 a6 00 	lea    rax,[rip+0xa6d129]        # 1829518 <_ZTIN4asio2ip16bad_address_castE@@Base+0x5b48>
      dbc3ef:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
      dbc3f6:	00 
      dbc3f7:	48 89 06             	mov    QWORD PTR [rsi],rax
      dbc3fa:	4c 89 76 08          	mov    QWORD PTR [rsi+0x8],r14
      dbc3fe:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      dbc402:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc405:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc3ef:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
      dbc3f6:	00 
      dbc3f7:	48 89 06             	mov    QWORD PTR [rsi],rax
      dbc3fa:	4c 89 76 08          	mov    QWORD PTR [rsi+0x8],r14
      dbc3fe:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      dbc402:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc405:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc408:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
      dbc40e:	48 8d 05 4b d1 a6 00 	lea    rax,[rip+0xa6d14b]        # 1829560 <_ZTIN4asio2ip16bad_address_castE@@Base+0x5b90>
      dbc415:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]
      dbc41c:	00 
      dbc41d:	48 89 06             	mov    QWORD PTR [rsi],rax
      dbc420:	4c 89 76 08          	mov    QWORD PTR [rsi+0x8],r14
      dbc424:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      dbc428:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc42b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc415:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]
      dbc41c:	00 
      dbc41d:	48 89 06             	mov    QWORD PTR [rsi],rax
      dbc420:	4c 89 76 08          	mov    QWORD PTR [rsi+0x8],r14
      dbc424:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      dbc428:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc42b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc42e:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      dbc434:	48 8d 05 6d d1 a6 00 	lea    rax,[rip+0xa6d16d]        # 18295a8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x5bd8>
      dbc43b:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
      dbc442:	00 
      dbc443:	48 89 06             	mov    QWORD PTR [rsi],rax
      dbc446:	4c 89 76 08          	mov    QWORD PTR [rsi+0x8],r14
      dbc44a:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      dbc44e:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc451:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc43b:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
      dbc442:	00 
      dbc443:	48 89 06             	mov    QWORD PTR [rsi],rax
      dbc446:	4c 89 76 08          	mov    QWORD PTR [rsi+0x8],r14
      dbc44a:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      dbc44e:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc451:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc454:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      dbc45a:	4d 85 ed             	test   r13,r13
      dbc45d:	74 05                	je     dbc464 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x894ea>
      dbc45f:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      dbc464:	6a 30                	push   0x30
      dbc466:	5b                   	pop    rbx
      dbc467:	48 89 df             	mov    rdi,rbx
      dbc46a:	e8 91 1a a3 00       	call   17edf00 <_Znwm@plt>
      dbc4c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc4b1:	89 50 2c             	mov    DWORD PTR [rax+0x2c],edx
      dbc4b4:	4c 8d a4 24 10 01 00 	lea    r12,[rsp+0x110]
      dbc4bb:	00 
      dbc4bc:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      dbc4c1:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
      dbc4c8:	00 
      dbc4c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc4cc:	4c 89 e6             	mov    rsi,r12
      dbc4cf:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      dbc4d5:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
      dbc4dc:	00 
      dbc4dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc4e0:	6a 01                	push   0x1
      dbc4e2:	5e                   	pop    rsi
      dbc4e3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dbc4dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc4c8:	00 
      dbc4c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc4cc:	4c 89 e6             	mov    rsi,r12
      dbc4cf:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      dbc4d5:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
      dbc4dc:	00 
      dbc4dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc4e0:	6a 01                	push   0x1
      dbc4e2:	5e                   	pop    rsi
      dbc4e3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dbc4e9:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      dbc4f0:	00 00 
      dbc4f2:	66 0f 7f 84 24 90 00 	movdqa XMMWORD PTR [rsp+0x90],xmm0
      dbc4f9:	00 00 
      dbc4fb:	66 0f ef c0          	pxor   xmm0,xmm0

### alias rdi formed @0xdce71e; FDE=(14474318, 14478530)

### alias rdi formed @0xdce798; FDE=(14474318, 14478530)
      dce955:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dce93b:	e8 2a b6 ca ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dce940:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      dce947:	00 
      dce948:	e8 1d b6 ca ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dce94d:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      dce954:	00 
      dce955:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dce958:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
      dce95c:	48 8d b4 24 98 00 00 	lea    rsi,[rsp+0x98]
      dce963:	00 
      dce964:	4c 89 3e             	mov    QWORD PTR [rsi],r15
      dce967:	ff d0                	call   rax
      dce969:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
      dce970:	00 
      dce971:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
      dce97f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dce969:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
      dce970:	00 
      dce971:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
      dce978:	00 00 
      dce97a:	48 85 ff             	test   rdi,rdi
      dce97d:	74 06                	je     dce985 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ba0b>
      dce97f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dce982:	ff 50 08             	call   QWORD PTR [rax+0x8]
      dce985:	31 ff                	xor    edi,edi
      dce987:	e8 fa fa cc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dce98c:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      dce991:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
      dce995:	48 89 03             	mov    QWORD PTR [rbx],rax
      dce998:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      dce99f:	00 

### alias rbp formed @0xdce7ac; FDE=(14474318, 14478530)

### alias rdi formed @0xdcff25; FDE=(14482796, 14483474)

### alias rdi formed @0xdcffa9; FDE=(14482796, 14483474)

### alias rdi formed @0xde2b5e; FDE=(14559994, 14561359)
      de2c3c:	48 89 07             	mov    QWORD PTR [rdi],rax
      de2c20:	0f 11 4f d0          	movups XMMWORD PTR [rdi-0x30],xmm1
      de2c24:	48 89 47 e0          	mov    QWORD PTR [rdi-0x20],rax
      de2c28:	48 83 67 e8 00       	and    QWORD PTR [rdi-0x18],0x0
      de2c2d:	48 8d 05 c4 cb 65 ff 	lea    rax,[rip+0xffffffffff65cbc4]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      de2c34:	48 89 47 f0          	mov    QWORD PTR [rdi-0x10],rax
      de2c38:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
      de2c3c:	48 89 07             	mov    QWORD PTR [rdi],rax
      de2c3f:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      de2c43:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      de2c48:	c7 87 f8 fe ff ff 04 	mov    DWORD PTR [rdi-0x108],0x4
      de2c4f:	00 00 00 
      de2c52:	4c 89 ee             	mov    rsi,r13
      de2c55:	31 d2                	xor    edx,edx
      de2c57:	e8 36 2b 98 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      de2c5c:	48 8d bc 24 08 02 00 	lea    rdi,[rsp+0x208]

### alias rcx formed @0xde8090; FDE=(14579182, 14583796)

### alias rdi formed @0xdebaa0; FDE=(14596108, 14619287)

### alias rdi formed @0xdf23c4; FDE=(14623668, 14623775)

### alias rdi formed @0xdf2ee4; FDE=(14626494, 14626833)

### alias rdi formed @0xdf83e6; FDE=(14645486, 14651961)

### alias rdi formed @0xdf8e6f; FDE=(14645486, 14651961)

### alias rdx formed @0xdf8ec2; FDE=(14645486, 14651961)

### alias rdi formed @0xdf8ee7; FDE=(14645486, 14651961)

### alias rdi formed @0xe18071; FDE=(14778092, 14778667)
      e180c1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e180a8:	e8 27 1b 9c 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e180ad:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
      e180b4:	48 83 a3 b8 01 00 00 	and    QWORD PTR [rbx+0x1b8],0x0
      e180bb:	00 
      e180bc:	48 85 ff             	test   rdi,rdi
      e180bf:	74 06                	je     e180c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe514d>
      e180c1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e180c4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e180c7:	48 8b bb b0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b0]
      e180ce:	e8 b3 63 c8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e180d3:	48 8b bb a0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a0]
      e180da:	e8 a7 63 c8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e180df:	48 8b bb 90 01 00 00 	mov    rdi,QWORD PTR [rbx+0x190]
      e180e6:	e8 9b 63 c8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e180eb:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]

### alias r14 formed @0xe181bb; FDE=(14778686, 14781201)

### alias rdi formed @0xe28f32; FDE=(14840202, 14850050)
      e290a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e2908f:	48 89 ac 24 f8 14 00 	mov    QWORD PTR [rsp+0x14f8],rbp
      e29096:	00 
      e29097:	89 84 24 00 15 00 00 	mov    DWORD PTR [rsp+0x1500],eax
      e2909e:	48 89 9c 24 10 15 00 	mov    QWORD PTR [rsp+0x1510],rbx
      e290a5:	00 
      e290a6:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      e290a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e290ac:	48 89 de             	mov    rsi,rbx
      e290af:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      e290b5:	41 8b 84 24 2c 12 00 	mov    eax,DWORD PTR [r12+0x122c]
      e290bc:	00 
      e290bd:	48 8d 0d 4c 48 a0 00 	lea    rcx,[rip+0xa0484c]        # 182d910 <_ZTIN4asio2ip16bad_address_castE@@Base+0x9f40>
      e290c4:	49 89 0e             	mov    QWORD PTR [r14],rcx
      e290c7:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp
      e290cb:	41 89 46 10          	mov    DWORD PTR [r14+0x10],eax
      e290d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e290bd:	48 8d 0d 4c 48 a0 00 	lea    rcx,[rip+0xa0484c]        # 182d910 <_ZTIN4asio2ip16bad_address_castE@@Base+0x9f40>
      e290c4:	49 89 0e             	mov    QWORD PTR [r14],rcx
      e290c7:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp
      e290cb:	41 89 46 10          	mov    DWORD PTR [r14+0x10],eax
      e290cf:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
      e290d3:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      e290d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e290d9:	4c 89 f6             	mov    rsi,r14
      e290dc:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      e290e2:	48 8b 75 08          	mov    rsi,QWORD PTR [rbp+0x8]
      e290e6:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      e290e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e290ec:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      e290f2:	0f 10 85 f8 04 00 00 	movups xmm0,XMMWORD PTR [rbp+0x4f8]
      e290f9:	48 8b 85 00 05 00 00 	mov    rax,QWORD PTR [rbp+0x500]
      e290e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e290d3:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      e290d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e290d9:	4c 89 f6             	mov    rsi,r14
      e290dc:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      e290e2:	48 8b 75 08          	mov    rsi,QWORD PTR [rbp+0x8]
      e290e6:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      e290e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e290ec:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      e290f2:	0f 10 85 f8 04 00 00 	movups xmm0,XMMWORD PTR [rbp+0x4f8]
      e290f9:	48 8b 85 00 05 00 00 	mov    rax,QWORD PTR [rbp+0x500]
      e29100:	48 85 c0             	test   rax,rax
      e29103:	74 05                	je     e2910a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf6190>
      e29105:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      e2910a:	48 8d 9c 24 b8 00 00 	lea    rbx,[rsp+0xb8]
      e29111:	00 

### alias rdx formed @0xe2f8fc; FDE=(14874371, 14875679)

### alias rdi formed @0xe31cc4; FDE=(14880116, 14885978)

### alias r13 formed @0xe363c9; FDE=(14900738, 14903022)

### alias rbx formed @0xe4bf98; FDE=(14990078, 14996782)
      e4bfec:	0f 10 0b             	movups xmm1,XMMWORD PTR [rbx]
      e4bfd7:	00 
      e4bfd8:	48 89 84 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rax
      e4bfdf:	00 
      e4bfe0:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      e4bfe4:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
      e4bfeb:	00 
      e4bfec:	0f 10 0b             	movups xmm1,XMMWORD PTR [rbx]
      e4bfef:	0f 29 8c 24 50 02 00 	movaps XMMWORD PTR [rsp+0x250],xmm1
      e4bff6:	00 
      e4bff7:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      e4bffa:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      e4bfff:	49 8b 85 b0 02 00 00 	mov    rax,QWORD PTR [r13+0x2b0]
      e4c006:	41 0f 10 85 a8 02 00 	movups xmm0,XMMWORD PTR [r13+0x2a8]
      e4c00d:	00 
      e4c00e:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
      e4bff7:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      e4bfe0:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      e4bfe4:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
      e4bfeb:	00 
      e4bfec:	0f 10 0b             	movups xmm1,XMMWORD PTR [rbx]
      e4bfef:	0f 29 8c 24 50 02 00 	movaps XMMWORD PTR [rsp+0x250],xmm1
      e4bff6:	00 
      e4bff7:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      e4bffa:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      e4bfff:	49 8b 85 b0 02 00 00 	mov    rax,QWORD PTR [r13+0x2b0]
      e4c006:	41 0f 10 85 a8 02 00 	movups xmm0,XMMWORD PTR [r13+0x2a8]
      e4c00d:	00 
      e4c00e:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
      e4c015:	00 
      e4c016:	48 85 c0             	test   rax,rax
      e4c019:	74 05                	je     e4c020 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13436>

### alias rdi formed @0xe4c1c0; FDE=(14990078, 14996782)

### alias r14 formed @0xe63c40; FDE=(15087042, 15089533)
      e63cce:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e63cbe:	4d 89 e5             	mov    r13,r12
      e63cc1:	eb 0b                	jmp    e63cce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b0e4>
      e63cc3:	4c 89 e0             	mov    rax,r12
      e63cc6:	31 d2                	xor    edx,edx
      e63cc8:	48 f7 f3             	div    rbx
      e63ccb:	49 89 d5             	mov    r13,rdx
      e63cce:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e63cd1:	4a 8b 04 e8          	mov    rax,QWORD PTR [rax+r13*8]
      e63cd5:	48 85 c0             	test   rax,rax
      e63cd8:	74 70                	je     e63d4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b160>
      e63cda:	4c 8b 38             	mov    r15,QWORD PTR [rax]
      e63cdd:	4d 85 ff             	test   r15,r15
      e63ce0:	74 68                	je     e63d4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b160>
      e63ce2:	48 8d 43 ff          	lea    rax,[rbx-0x1]
      e63ce6:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e63d7d:	49 8b 16             	mov    rdx,QWORD PTR [r14]
      e63d67:	49 83 a5 28 02 00 00 	and    QWORD PTR [r13+0x228],0x0
      e63d6e:	00 
      e63d6f:	49 8b 85 20 02 00 00 	mov    rax,QWORD PTR [r13+0x220]
      e63d76:	48 85 c0             	test   rax,rax
      e63d79:	74 12                	je     e63d8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b1a3>
      e63d7b:	31 c9                	xor    ecx,ecx
      e63d7d:	49 8b 16             	mov    rdx,QWORD PTR [r14]
      e63d80:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      e63d85:	48 ff c1             	inc    rcx
      e63d88:	48 39 c8             	cmp    rax,rcx
      e63d8b:	75 f0                	jne    e63d7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b193>
      e63d8d:	49 83 a5 30 02 00 00 	and    QWORD PTR [r13+0x230],0x0
      e63d94:	00 
      e63d95:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
      e63d9a:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0

### alias rsi formed @0xe64366; FDE=(15090376, 15090720)
      e643b4:	48 89 06             	mov    QWORD PTR [rsi],rax
      e6439d:	5f                   	pop    rdi
      e6439e:	ba 92 00 00 00       	mov    edx,0x92
      e643a3:	31 c0                	xor    eax,eax
      e643a5:	e8 28 25 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e643aa:	48 8d 05 67 d8 5e ff 	lea    rax,[rip+0xffffffffff5ed867]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e643b1:	48 89 e6             	mov    rsi,rsp
      e643b4:	48 89 06             	mov    QWORD PTR [rsi],rax
      e643b7:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e643bb:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e643c0:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
      e643c5:	49 89 1f             	mov    QWORD PTR [r15],rbx
      e643c8:	48 8d 05 95 80 c1 ff 	lea    rax,[rip+0xffffffffffc18095]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e643cf:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      e643d3:	48 8d 05 54 00 00 00 	lea    rax,[rip+0x54]        # e6442e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b844>
      e643da:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax

### alias rdi formed @0xe66965; FDE=(15099730, 15101293)
      e66993:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66976:	49 8b bf 28 02 00 00 	mov    rdi,QWORD PTR [r15+0x228]
      e6697d:	e8 9c 31 97 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
      e66982:	48 8b 6c 24 28       	mov    rbp,QWORD PTR [rsp+0x28]
      e66987:	49 8b bf 10 02 00 00 	mov    rdi,QWORD PTR [r15+0x210]
      e6698e:	48 85 ff             	test   rdi,rdi
      e66991:	74 24                	je     e669b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddcd>
      e66993:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66996:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e66999:	eb 4e                	jmp    e669e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddff>
      e6699b:	83 f8 06             	cmp    eax,0x6
      e6699e:	0f 8c 7f 03 00 00    	jl     e66d23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e139>
      e669a4:	41 f6 06 01          	test   BYTE PTR [r14],0x1
      e669a8:	0f 84 2a 02 00 00    	je     e66bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfee>
      e669ae:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
      e669b2:	e9 24 02 00 00       	jmp    e66bdb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dff1>
      e669de:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e669c2:	e8 e6 3a fd ff       	call   e3a4ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18c3>
      e669c7:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e669cb:	49 8b bf 10 02 00 00 	mov    rdi,QWORD PTR [r15+0x210]
      e669d2:	49 89 87 10 02 00 00 	mov    QWORD PTR [r15+0x210],rax
      e669d9:	48 85 ff             	test   rdi,rdi
      e669dc:	74 06                	je     e669e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddfa>
      e669de:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e669e1:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e669e4:	48 8b 6c 24 28       	mov    rbp,QWORD PTR [rsp+0x28]
      e669e9:	44 89 a4 24 b0 04 00 	mov    DWORD PTR [rsp+0x4b0],r12d
      e669f0:	00 
      e669f1:	4d 89 e2             	mov    r10,r12
      e669f4:	49 c1 ea 20          	shr    r10,0x20
      e669f8:	66 44 89 94 24 b4 04 	mov    WORD PTR [rsp+0x4b4],r10w
      e669ff:	00 00 

### alias rdi formed @0xe66dc0; FDE=(15101294, 15101910)
      e66de9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66dcc:	e8 67 ab 95 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
      e66dd1:	48 8b bb 28 02 00 00 	mov    rdi,QWORD PTR [rbx+0x228]
      e66dd8:	e8 41 2d 97 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
      e66ddd:	48 8b bb 10 02 00 00 	mov    rdi,QWORD PTR [rbx+0x210]
      e66de4:	48 85 ff             	test   rdi,rdi
      e66de7:	74 08                	je     e66df1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e207>
      e66de9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66dec:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e66def:	eb 2b                	jmp    e66e1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e232>
      e66df1:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      e66df6:	e8 b2 36 fd ff       	call   e3a4ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18c3>
      e66dfb:	48 8d 44 24 70       	lea    rax,[rsp+0x70]
      e66e00:	48 8b 00             	mov    rax,QWORD PTR [rax]
      e66e03:	48 8b bb 10 02 00 00 	mov    rdi,QWORD PTR [rbx+0x210]
      e66e0a:	48 89 83 10 02 00 00 	mov    QWORD PTR [rbx+0x210],rax
      e66e16:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66dfb:	48 8d 44 24 70       	lea    rax,[rsp+0x70]
      e66e00:	48 8b 00             	mov    rax,QWORD PTR [rax]
      e66e03:	48 8b bb 10 02 00 00 	mov    rdi,QWORD PTR [rbx+0x210]
      e66e0a:	48 89 83 10 02 00 00 	mov    QWORD PTR [rbx+0x210],rax
      e66e11:	48 85 ff             	test   rdi,rdi
      e66e14:	74 06                	je     e66e1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e232>
      e66e16:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66e19:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e66e1c:	44 89 7c 24 50       	mov    DWORD PTR [rsp+0x50],r15d
      e66e21:	4d 89 fa             	mov    r10,r15
      e66e24:	49 c1 ea 20          	shr    r10,0x20
      e66e28:	66 44 89 54 24 54    	mov    WORD PTR [rsp+0x54],r10w
      e66e2e:	4c 89 74 24 58       	mov    QWORD PTR [rsp+0x58],r14
      e66e33:	4c 89 6c 24 60       	mov    QWORD PTR [rsp+0x60],r13
      e66e38:	66 89 6c 24 68       	mov    WORD PTR [rsp+0x68],bp
      e66f32:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66f14:	e8 d9 2c 97 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e66f19:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e66f1e:	e8 63 75 c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e66f23:	4c 89 f7             	mov    rdi,r14
      e66f26:	e8 bd 38 97 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e66f2b:	48 8b bb 10 02 00 00 	mov    rdi,QWORD PTR [rbx+0x210]
      e66f32:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66f35:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      e66f3a:	ff 10                	call   QWORD PTR [rax]
      e66f3c:	48 8d 05 d5 ac 5e ff 	lea    rax,[rip+0xffffffffff5eacd5]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e66f43:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e66f47:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      e66f4c:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
      e66f52:	49 89 1e             	mov    QWORD PTR [r14],rbx
      e66f55:	48 8d 05 08 55 c1 ff 	lea    rax,[rip+0xffffffffffc15508]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e66f96:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66f7f:	4c 89 f2             	mov    rdx,r14
      e66f82:	45 31 c0             	xor    r8d,r8d
      e66f85:	e8 42 a8 95 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
      e66f8a:	4c 89 f7             	mov    rdi,r14
      e66f8d:	e8 0c 03 c4 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      e66f92:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e66f96:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e66f99:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e66f9c:	4c 89 ff             	mov    rdi,r15
      e66f9f:	e8 ec 6e 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e66fa4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e66fab:	00 00 
      e66fad:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
      e66fb4:	00 
      e66fb5:	75 12                	jne    e66fc9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e3df>

### alias rdi formed @0xe670a3; FDE=(15101910, 15102182)
      e670ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e670b7:	00 
      e670b8:	e8 61 2a 97 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
      e670bd:	49 8b bc 24 10 02 00 	mov    rdi,QWORD PTR [r12+0x210]
      e670c4:	00 
      e670c5:	48 85 ff             	test   rdi,rdi
      e670c8:	0f 84 76 ff ff ff    	je     e67044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e45a>
      e670ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e670d1:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e670d4:	e9 6b ff ff ff       	jmp    e67044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e45a>
      e670d9:	e8 d2 89 98 00       	call   17efab0 <__stack_chk_fail@plt>
      e670de:	48 89 c7             	mov    rdi,rax
      e670e1:	e8 bf 29 c1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e670e6:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      e670e9:	e9 00 00 00 00       	jmp    e670ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e504>
      e670ee:	53                   	push   rbx

### alias rdi formed @0xe67cde; FDE=(15105026, 15105391)
      e67d02:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e67ce5:	e8 4e 9c 95 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
      e67cea:	48 8b bb 28 02 00 00 	mov    rdi,QWORD PTR [rbx+0x228]
      e67cf1:	e8 28 1e 97 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
      e67cf6:	48 8b bb 10 02 00 00 	mov    rdi,QWORD PTR [rbx+0x210]
      e67cfd:	48 85 ff             	test   rdi,rdi
      e67d00:	74 06                	je     e67d08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f11e>
      e67d02:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e67d05:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e67d08:	49 83 c6 28          	add    r14,0x28
      e67d0c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e67d11:	4c 89 f6             	mov    rsi,r14
      e67d14:	e8 35 ce f9 ff       	call   e04b4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1bd4>
      e67d19:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
      e67d1e:	48 89 df             	mov    rdi,rbx
      e67d21:	4c 89 f6             	mov    rsi,r14

### alias r13 formed @0xe680ba; FDE=(15105774, 15107386)

### alias rdi formed @0xe6b6c8; FDE=(15119940, 15120159)

### alias r14 formed @0xe712f5; FDE=(15143106, 15145030)
      e7146b:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      e7144e:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      e71451:	0f 11 83 d8 00 00 00 	movups XMMWORD PTR [rbx+0xd8],xmm0
      e71458:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
      e7145b:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
      e71460:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      e71464:	48 89 83 00 01 00 00 	mov    QWORD PTR [rbx+0x100],rax
      e7146b:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      e7146f:	0f 11 83 f0 00 00 00 	movups XMMWORD PTR [rbx+0xf0],xmm0
      e71476:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
      e7147a:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e7147f:	0f 28 45 00          	movaps xmm0,XMMWORD PTR [rbp+0x0]
      e71483:	0f 11 83 08 01 00 00 	movups XMMWORD PTR [rbx+0x108],xmm0
      e7148a:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
      e7148e:	48 89 83 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rax
      e71495:	0f 11 4d 00          	movups XMMWORD PTR [rbp+0x0],xmm1
      e71476:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
      e71458:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
      e7145b:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
      e71460:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      e71464:	48 89 83 00 01 00 00 	mov    QWORD PTR [rbx+0x100],rax
      e7146b:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      e7146f:	0f 11 83 f0 00 00 00 	movups XMMWORD PTR [rbx+0xf0],xmm0
      e71476:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
      e7147a:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e7147f:	0f 28 45 00          	movaps xmm0,XMMWORD PTR [rbp+0x0]
      e71483:	0f 11 83 08 01 00 00 	movups XMMWORD PTR [rbx+0x108],xmm0
      e7148a:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
      e7148e:	48 89 83 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rax
      e71495:	0f 11 4d 00          	movups XMMWORD PTR [rbp+0x0],xmm1
      e71499:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
      e7149e:	0f 10 45 18          	movups xmm0,XMMWORD PTR [rbp+0x18]

### alias rax formed @0xe8da16; FDE=(15255132, 15263896)

### alias rax formed @0xeb23e9; FDE=(15409478, 15413917)

### alias rsi formed @0xecd9ab; FDE=(15521638, 15523238)

### alias r14 formed @0xecf84d; FDE=(15525244, 15530574)

### alias rdi formed @0xecfdba; FDE=(15531134, 15531543)

### alias rdi formed @0xed0460; FDE=(15532920, 15533405)

### alias rbp formed @0xed0ee0; FDE=(15534704, 15539299)

### alias r14 formed @0xee19c9; FDE=(15600356, 15615021)

### alias r14 formed @0xee1bb9; FDE=(15600356, 15615021)

### alias r14 formed @0xee1c79; FDE=(15600356, 15615021)

### alias rdi formed @0xee806d; FDE=(15630244, 15631251)

### alias rdi formed @0xee842e; FDE=(15631354, 15631487)

### alias rdi formed @0xf048ac; FDE=(15747214, 15747320)

### alias rdi formed @0xf08b00; FDE=(15764018, 15765918)

### alias rdi formed @0xf0d698; FDE=(15783374, 15784703)

### alias rdi formed @0xf10dcd; FDE=(15797192, 15797935)

### alias rdi formed @0xf10e4c; FDE=(15797192, 15797935)

### alias rdi formed @0xf11ab0; FDE=(15800504, 15801234)

### alias rdi formed @0xf11b2f; FDE=(15800504, 15801234)

### alias rdi formed @0xf19a58; FDE=(15833648, 15833733)

### alias r13 formed @0xf19ea5; FDE=(15834400, 15835006)

### alias rdi formed @0xf1a057; FDE=(15835178, 15835309)

### alias rbx formed @0xf1ec5b; FDE=(15854290, 15855193)
      f1ed84:	48 89 03             	mov    QWORD PTR [rbx],rax
      f1ed6c:	31 ff                	xor    edi,edi
      f1ed6e:	e8 13 f7 b7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f1ed73:	31 ff                	xor    edi,edi
      f1ed75:	e8 a2 f6 b7 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      f1ed7a:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      f1ed7f:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
      f1ed84:	48 89 03             	mov    QWORD PTR [rbx],rax
      f1ed87:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      f1ed8c:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      f1ed90:	31 ff                	xor    edi,edi
      f1ed92:	e8 ef f6 b7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f1ed97:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f1ed9e:	00 00 
      f1eda0:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
      f1eda7:	00 

### alias rdi formed @0xf1f569; FDE=(15856870, 15857406)

### alias rax formed @0xf370ce; FDE=(15954092, 15955173)
      f370e8:	48 89 08             	mov    QWORD PTR [rax],rcx
      f370ce:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
      f370d5:	00 
      f370d6:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
      f370db:	49 89 f6             	mov    r14,rsi
      f370de:	48 89 fb             	mov    rbx,rdi
      f370e1:	48 8d 0d 50 52 96 00 	lea    rcx,[rip+0x965250]        # 189c338 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x9278>
      f370e8:	48 89 08             	mov    QWORD PTR [rax],rcx
      f370eb:	0f 57 c0             	xorps  xmm0,xmm0
      f370ee:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      f370f2:	48 8d 0d 9f 62 a5 00 	lea    rcx,[rip+0xa5629f]        # 198d398 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x55fe0>
      f370f9:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      f370fd:	0f 28 0d cc 6b 45 ff 	movaps xmm1,XMMWORD PTR [rip+0xffffffffff456bcc]        # 38dcd0 <_ZTSSt12bad_any_cast@@Base-0x24f8>
      f37104:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
      f37108:	48 8d 0d b9 84 50 ff 	lea    rcx,[rip+0xffffffffff5084b9]        # 43f5c8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x51d4>
      f3710f:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx

### alias rdi formed @0xf37163; FDE=(15954092, 15955173)

### alias rsi formed @0xf3719c; FDE=(15954092, 15955173)

### alias rdi formed @0xf373f2; FDE=(15954092, 15955173)

### alias rdi formed @0xf374b8; FDE=(15954092, 15955173)

### alias rbp formed @0xf49375; FDE=(16027814, 16029283)

### alias rdx formed @0xf5a243; FDE=(16097346, 16098886)

### alias rdi formed @0xf77456; FDE=(16216922, 16217665)

### alias rdx formed @0xf7748b; FDE=(16216922, 16217665)

### alias rdi formed @0xf7749f; FDE=(16216922, 16217665)

### alias rdi formed @0xf77541; FDE=(16216922, 16217665)

### alias rsi formed @0xf77556; FDE=(16216922, 16217665)

### alias rdi formed @0xf77582; FDE=(16216922, 16217665)

### alias rdi formed @0xf775c8; FDE=(16216922, 16217665)

### alias rdi formed @0xf775eb; FDE=(16216922, 16217665)

### alias rdi formed @0xf86a85; FDE=(16279924, 16281816)

### alias r15 formed @0xf86b3b; FDE=(16279924, 16281816)

### alias rdi formed @0xf86fad; FDE=(16279924, 16281816)

### alias rdi formed @0xf8b569; FDE=(16299194, 16299998)
      f8b643:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      f8b631:	e8 2c ee ae ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      f8b636:	84 c0                	test   al,al
      f8b638:	74 05                	je     f8b63f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152a55>
      f8b63a:	45 31 ed             	xor    r13d,r13d
      f8b63d:	eb 0d                	jmp    f8b64c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152a62>
      f8b63f:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      f8b643:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      f8b646:	ff 50 20             	call   QWORD PTR [rax+0x20]
      f8b649:	41 89 c5             	mov    r13d,eax
      f8b64c:	41 b4 01             	mov    r12b,0x1
      f8b64f:	41 80 be b0 00 00 00 	cmp    BYTE PTR [r14+0xb0],0x0
      f8b656:	00 
      f8b657:	75 33                	jne    f8b68c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152aa2>
      f8b659:	44 89 6c 24 04       	mov    DWORD PTR [rsp+0x4],r13d
      f8b65e:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]

### alias rsi formed @0xf8b57e; FDE=(16299194, 16299998)
      f8b662:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f8b64c:	41 b4 01             	mov    r12b,0x1
      f8b64f:	41 80 be b0 00 00 00 	cmp    BYTE PTR [r14+0xb0],0x0
      f8b656:	00 
      f8b657:	75 33                	jne    f8b68c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152aa2>
      f8b659:	44 89 6c 24 04       	mov    DWORD PTR [rsp+0x4],r13d
      f8b65e:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]
      f8b662:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f8b665:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      f8b66a:	ff 10                	call   QWORD PTR [rax]
      f8b66c:	4c 8d 6c 24 28       	lea    r13,[rsp+0x28]
      f8b671:	4c 89 f7             	mov    rdi,r14
      f8b674:	4c 89 ee             	mov    rsi,r13
      f8b677:	e8 d8 14 00 00       	call   f8cb54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x153f6a>
      f8b67c:	41 89 c4             	mov    r12d,eax
      f8b67f:	4c 89 ef             	mov    rdi,r13

### alias rdi formed @0xf8b5e2; FDE=(16299194, 16299998)
      f8b643:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      f8b631:	e8 2c ee ae ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      f8b636:	84 c0                	test   al,al
      f8b638:	74 05                	je     f8b63f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152a55>
      f8b63a:	45 31 ed             	xor    r13d,r13d
      f8b63d:	eb 0d                	jmp    f8b64c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152a62>
      f8b63f:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      f8b643:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      f8b646:	ff 50 20             	call   QWORD PTR [rax+0x20]
      f8b649:	41 89 c5             	mov    r13d,eax
      f8b64c:	41 b4 01             	mov    r12b,0x1
      f8b64f:	41 80 be b0 00 00 00 	cmp    BYTE PTR [r14+0xb0],0x0
      f8b656:	00 
      f8b657:	75 33                	jne    f8b68c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152aa2>
      f8b659:	44 89 6c 24 04       	mov    DWORD PTR [rsp+0x4],r13d
      f8b65e:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]

### alias r14 formed @0xf8b6ea; FDE=(16299194, 16299998)

### alias r14 formed @0xf8b726; FDE=(16299194, 16299998)

### alias rdi formed @0xff1233; FDE=(16714646, 16717160)

### alias rbx formed @0xff29f6; FDE=(16722286, 16727061)
      ff2a0a:	48 89 03             	mov    QWORD PTR [rbx],rax
      ff29f0:	00 
      ff29f1:	e8 9a b4 7f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ff29f6:	48 8d 9c 24 18 02 00 	lea    rbx,[rsp+0x218]
      ff29fd:	00 
      ff29fe:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
      ff2a03:	48 8d 05 7e e2 8a 00 	lea    rax,[rip+0x8ae27e]        # 18a0c88 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xdbc8>
      ff2a0a:	48 89 03             	mov    QWORD PTR [rbx],rax
      ff2a0d:	66 0f ef c0          	pxor   xmm0,xmm0
      ff2a11:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
      ff2a16:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
      ff2a1b:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
      ff2a20:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
      ff2a25:	48 83 63 50 00       	and    QWORD PTR [rbx+0x50],0x0
      ff2a2a:	4c 89 ef             	mov    rdi,r13
      ff2a2d:	e8 04 8e a8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>

### alias rdi formed @0xff2a45; FDE=(16722286, 16727061)

### alias rdi formed @0xff2a55; FDE=(16722286, 16727061)

### alias rdi formed @0xff2a65; FDE=(16722286, 16727061)

### alias rdi formed @0xff3369; FDE=(16722286, 16727061)

### alias rdi formed @0xff346e; FDE=(16722286, 16727061)

### alias rdi formed @0xff39a0; FDE=(16722286, 16727061)

### alias rdi formed @0xff3bdb; FDE=(16722286, 16727061)

### alias rsi formed @0xff46e9; FDE=(16729166, 16730056)

### alias rdi formed @0xff48b8; FDE=(16730258, 16730447)

### alias rdi formed @0xff4b22; FDE=(16730638, 16732818)
      ff4ba3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ff4b8a:	31 c9                	xor    ecx,ecx
      ff4b8c:	e8 eb ae 00 00       	call   fffa7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6e92>
      ff4b91:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ff4b98:	00 
      ff4b99:	e8 e8 98 aa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ff4b9e:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
      ff4ba3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ff4ba6:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      ff4bac:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
      ff4bb1:	49 8d 5c 24 30       	lea    rbx,[r12+0x30]
      ff4bb6:	48 83 b8 48 0b 00 00 	cmp    QWORD PTR [rax+0xb48],0x0
      ff4bbd:	00 
      ff4bbe:	0f 85 07 05 00 00    	jne    ff50cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc4e1>
      ff4bc4:	49 83 7c 24 28 00    	cmp    QWORD PTR [r12+0x28],0x0
      ff4bca:	0f 84 fb 04 00 00    	je     ff50cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc4e1>

### alias rbx formed @0xff519c; FDE=(16730638, 16732818)

### alias rdi formed @0xff765b; FDE=(16741830, 16742529)

### alias rdx formed @0xff766d; FDE=(16741830, 16742529)

### alias rdi formed @0xff7687; FDE=(16741830, 16742529)

### alias rdi formed @0xff7842; FDE=(16741830, 16742529)

### alias rdi formed @0x1023dc9; FDE=(16922382, 16924853)

### alias rdi formed @0x1024b46; FDE=(16927312, 16930243)

### alias rdi formed @0x1024b6c; FDE=(16927312, 16930243)

### alias rdi formed @0x1024bef; FDE=(16927312, 16930243)

### alias rdi formed @0x1024c6d; FDE=(16927312, 16930243)

### alias rdi formed @0x1024c8c; FDE=(16927312, 16930243)

### alias rsi formed @0x1024e11; FDE=(16927312, 16930243)

### alias rdi formed @0x1024e6e; FDE=(16927312, 16930243)

### alias rdi formed @0x1024e93; FDE=(16927312, 16930243)
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102506e:	e8 13 94 a7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1025073:	41 8b 7c 24 04       	mov    edi,DWORD PTR [r12+0x4]
     1025078:	e8 cb 99 a8 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     102507d:	48 8d 05 fd 76 ff ff 	lea    rax,[rip+0xffffffffffff76fd]        # 101c781 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3b97>
     1025084:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     102508b:	00 
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102508f:	41 8b 44 24 04       	mov    eax,DWORD PTR [r12+0x4]
     1025094:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1025099:	48 39 c8             	cmp    rax,rcx
     102509c:	48 0f 45 d8          	cmovne rbx,rax
     10250a0:	48 8d 05 49 0b 82 00 	lea    rax,[rip+0x820b49]        # 1845bf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d8>
     10250a7:	4c 89 e6             	mov    rsi,r12
     10250aa:	ff 14 d8             	call   QWORD PTR [rax+rbx*8]
     10250ad:	6a 0f                	push   0xf

### alias rdi formed @0x1024f15; FDE=(16927312, 16930243)
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102506e:	e8 13 94 a7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1025073:	41 8b 7c 24 04       	mov    edi,DWORD PTR [r12+0x4]
     1025078:	e8 cb 99 a8 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     102507d:	48 8d 05 fd 76 ff ff 	lea    rax,[rip+0xffffffffffff76fd]        # 101c781 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3b97>
     1025084:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     102508b:	00 
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102508f:	41 8b 44 24 04       	mov    eax,DWORD PTR [r12+0x4]
     1025094:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1025099:	48 39 c8             	cmp    rax,rcx
     102509c:	48 0f 45 d8          	cmovne rbx,rax
     10250a0:	48 8d 05 49 0b 82 00 	lea    rax,[rip+0x820b49]        # 1845bf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d8>
     10250a7:	4c 89 e6             	mov    rsi,r12
     10250aa:	ff 14 d8             	call   QWORD PTR [rax+rbx*8]
     10250ad:	6a 0f                	push   0xf

### alias rdi formed @0x1024f93; FDE=(16927312, 16930243)
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102506e:	e8 13 94 a7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1025073:	41 8b 7c 24 04       	mov    edi,DWORD PTR [r12+0x4]
     1025078:	e8 cb 99 a8 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     102507d:	48 8d 05 fd 76 ff ff 	lea    rax,[rip+0xffffffffffff76fd]        # 101c781 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3b97>
     1025084:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     102508b:	00 
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102508f:	41 8b 44 24 04       	mov    eax,DWORD PTR [r12+0x4]
     1025094:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1025099:	48 39 c8             	cmp    rax,rcx
     102509c:	48 0f 45 d8          	cmovne rbx,rax
     10250a0:	48 8d 05 49 0b 82 00 	lea    rax,[rip+0x820b49]        # 1845bf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d8>
     10250a7:	4c 89 e6             	mov    rsi,r12
     10250aa:	ff 14 d8             	call   QWORD PTR [rax+rbx*8]
     10250ad:	6a 0f                	push   0xf

### alias rdi formed @0x1024fb2; FDE=(16927312, 16930243)
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102506e:	e8 13 94 a7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1025073:	41 8b 7c 24 04       	mov    edi,DWORD PTR [r12+0x4]
     1025078:	e8 cb 99 a8 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     102507d:	48 8d 05 fd 76 ff ff 	lea    rax,[rip+0xffffffffffff76fd]        # 101c781 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3b97>
     1025084:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     102508b:	00 
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102508f:	41 8b 44 24 04       	mov    eax,DWORD PTR [r12+0x4]
     1025094:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1025099:	48 39 c8             	cmp    rax,rcx
     102509c:	48 0f 45 d8          	cmovne rbx,rax
     10250a0:	48 8d 05 49 0b 82 00 	lea    rax,[rip+0x820b49]        # 1845bf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d8>
     10250a7:	4c 89 e6             	mov    rsi,r12
     10250aa:	ff 14 d8             	call   QWORD PTR [rax+rbx*8]
     10250ad:	6a 0f                	push   0xf

### alias rdi formed @0x102503e; FDE=(16927312, 16930243)
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102506e:	e8 13 94 a7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1025073:	41 8b 7c 24 04       	mov    edi,DWORD PTR [r12+0x4]
     1025078:	e8 cb 99 a8 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     102507d:	48 8d 05 fd 76 ff ff 	lea    rax,[rip+0xffffffffffff76fd]        # 101c781 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3b97>
     1025084:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     102508b:	00 
     102508c:	48 89 07             	mov    QWORD PTR [rdi],rax
     102508f:	41 8b 44 24 04       	mov    eax,DWORD PTR [r12+0x4]
     1025094:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1025099:	48 39 c8             	cmp    rax,rcx
     102509c:	48 0f 45 d8          	cmovne rbx,rax
     10250a0:	48 8d 05 49 0b 82 00 	lea    rax,[rip+0x820b49]        # 1845bf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d8>
     10250a7:	4c 89 e6             	mov    rsi,r12
     10250aa:	ff 14 d8             	call   QWORD PTR [rax+rbx*8]
     10250ad:	6a 0f                	push   0xf

### alias rsi formed @0x102510c; FDE=(16927312, 16930243)

### alias rdi formed @0x10252d2; FDE=(16927312, 16930243)

### alias rsi formed @0x1025341; FDE=(16927312, 16930243)

### alias rdi formed @0x1025396; FDE=(16927312, 16930243)

### alias rdi formed @0x10254d9; FDE=(16927312, 16930243)

### alias rdi formed @0x1025551; FDE=(16927312, 16930243)

### alias rdi formed @0x1025587; FDE=(16927312, 16930243)

### alias rdi formed @0x1048275; FDE=(17072538, 17077875)

### alias r15 formed @0x10733cf; FDE=(17248756, 17253227)
     1073589:	41 88 07             	mov    BYTE PTR [r15],al
     1073571:	e8 ae b7 ff ff       	call   106ed24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23613a>
     1073576:	4c 8d bc 24 00 02 00 	lea    r15,[rsp+0x200]
     107357d:	00 
     107357e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1073582:	e8 ff ae a2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1073587:	31 c0                	xor    eax,eax
     1073589:	41 88 07             	mov    BYTE PTR [r15],al
     107358c:	48 8b 6c 24 60       	mov    rbp,QWORD PTR [rsp+0x60]
     1073591:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     1073595:	48 8d 35 e4 43 97 00 	lea    rsi,[rip+0x9743e4]        # 19e7980 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1f70>
     107359c:	4c 89 fa             	mov    rdx,r15
     107359f:	e8 ba a1 b1 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     10735a4:	88 44 24 06          	mov    BYTE PTR [rsp+0x6],al
     10735a8:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     10735ad:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]

### alias r14 formed @0x1082ed9; FDE=(17313342, 17315020)
     1082fbe:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1082fa5:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     1082fac:	00 00 
     1082fae:	0f 57 c0             	xorps  xmm0,xmm0
     1082fb1:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     1082fb6:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]
     1082fbd:	00 
     1082fbe:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1082fc1:	4c 89 f7             	mov    rdi,r14
     1082fc4:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1082fc7:	4d 8b 06             	mov    r8,QWORD PTR [r14]
     1082fca:	4c 89 f7             	mov    rdi,r14
     1082fcd:	48 89 c6             	mov    rsi,rax
     1082fd0:	48 89 e9             	mov    rcx,rbp
     1082fd3:	41 ff 90 a0 00 00 00 	call   QWORD PTR [r8+0xa0]
     1082fda:	4c 8b b3 90 00 00 00 	mov    r14,QWORD PTR [rbx+0x90]
     1082fc7:	4d 8b 06             	mov    r8,QWORD PTR [r14]
     1082fb1:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     1082fb6:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]
     1082fbd:	00 
     1082fbe:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1082fc1:	4c 89 f7             	mov    rdi,r14
     1082fc4:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1082fc7:	4d 8b 06             	mov    r8,QWORD PTR [r14]
     1082fca:	4c 89 f7             	mov    rdi,r14
     1082fcd:	48 89 c6             	mov    rsi,rax
     1082fd0:	48 89 e9             	mov    rcx,rbp
     1082fd3:	41 ff 90 a0 00 00 00 	call   QWORD PTR [r8+0xa0]
     1082fda:	4c 8b b3 90 00 00 00 	mov    r14,QWORD PTR [rbx+0x90]
     1082fe1:	48 89 ef             	mov    rdi,rbp
     1082fe4:	e8 4d 88 9f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1082fe9:	49 89 d0             	mov    r8,rdx
     1082fec:	4d 8b 16             	mov    r10,QWORD PTR [r14]
     1082fd0:	48 89 e9             	mov    rcx,rbp
     1082fd3:	41 ff 90 a0 00 00 00 	call   QWORD PTR [r8+0xa0]
     1082fda:	4c 8b b3 90 00 00 00 	mov    r14,QWORD PTR [rbx+0x90]
     1082fe1:	48 89 ef             	mov    rdi,rbp
     1082fe4:	e8 4d 88 9f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1082fe9:	49 89 d0             	mov    r8,rdx
     1082fec:	4d 8b 16             	mov    r10,QWORD PTR [r14]
     1082fef:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     1082ff6:	00 
     1082ff7:	4c 89 f6             	mov    rsi,r14
     1082ffa:	6a 0b                	push   0xb
     1082ffc:	5a                   	pop    rdx
     1082ffd:	48 89 c1             	mov    rcx,rax
     1083000:	4c 8d 8c 24 08 01 00 	lea    r9,[rsp+0x108]
     1083007:	00 

### alias rdi formed @0x10832cd; FDE=(17313342, 17315020)
     1083363:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     108334d:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1083354:	00 
     1083355:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     108335c:	00 00 
     108335e:	48 85 ff             	test   rdi,rdi
     1083361:	74 06                	je     1083369 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24a77f>
     1083363:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1083366:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1083369:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
     1083370:	00 
     1083371:	e8 10 b1 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1083376:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     108337d:	00 
     108337e:	e8 b5 4a 00 00       	call   1087e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24f24e>
     1083383:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108348c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1083476:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     108347d:	00 
     108347e:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     1083485:	00 00 
     1083487:	48 85 ff             	test   rdi,rdi
     108348a:	74 06                	je     1083492 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24a8a8>
     108348c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     108348f:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1083492:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
     1083499:	00 
     108349a:	e8 e7 af a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     108349f:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     10834a6:	00 
     10834a7:	e8 8c 49 00 00       	call   1087e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24f24e>
     10834ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### alias rax formed @0x10a62ea; FDE=(17457482, 17458259)

### alias rdi formed @0x10dc74d; FDE=(17680068, 17681503)

### alias rdi formed @0x10dc8a3; FDE=(17680068, 17681503)
     10dca17:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10dca06:	59                   	pop    rcx
     10dca07:	4c 89 f2             	mov    rdx,r14
     10dca0a:	ff 50 40             	call   QWORD PTR [rax+0x40]
     10dca0d:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     10dca12:	48 85 ff             	test   rdi,rdi
     10dca15:	74 0a                	je     10dca21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a3e37>
     10dca17:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10dca1a:	ff 50 30             	call   QWORD PTR [rax+0x30]
     10dca1d:	84 c0                	test   al,al
     10dca1f:	74 23                	je     10dca44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a3e5a>
     10dca21:	83 65 00 00          	and    DWORD PTR [rbp+0x0],0x0
     10dca25:	c6 85 20 01 00 00 00 	mov    BYTE PTR [rbp+0x120],0x0
     10dca2c:	e9 1a 01 00 00       	jmp    10dcb4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a3f61>
     10dca31:	c7 45 00 01 00 00 00 	mov    DWORD PTR [rbp+0x0],0x1
     10dca38:	c6 85 20 01 00 00 00 	mov    BYTE PTR [rbp+0x120],0x0

### alias rdi formed @0x10ee6f3; FDE=(17752996, 17754780)

### alias rdi formed @0x10ee70e; FDE=(17752996, 17754780)

### alias rdi formed @0x10f3e70; FDE=(17775868, 17778444)

### alias rdi formed @0x111940b; FDE=(17929126, 17929411)

### alias rdi formed @0x1143f53; FDE=(18103188, 18104924)

### alias rbx formed @0x11629dd; FDE=(18224770, 18237631)

### alias rdi formed @0x118408e; FDE=(18365028, 18367310)
     11840f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11840dd:	e8 41 90 4a 00       	call   162d123 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28291>
     11840e2:	48 8b 9c 24 b0 00 00 	mov    rbx,QWORD PTR [rsp+0xb0]
     11840e9:	00 
     11840ea:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     11840ef:	48 85 ff             	test   rdi,rdi
     11840f2:	74 06                	je     11840fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b510>
     11840f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11840f7:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11840fa:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     1184101:	00 
     1184102:	48 85 ff             	test   rdi,rdi
     1184105:	74 06                	je     118410d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b523>
     1184107:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118410a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     118410d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1184107:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11840f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11840f7:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11840fa:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     1184101:	00 
     1184102:	48 85 ff             	test   rdi,rdi
     1184105:	74 06                	je     118410d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b523>
     1184107:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118410a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     118410d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1184114:	00 
     1184115:	48 85 ff             	test   rdi,rdi
     1184118:	74 06                	je     1184120 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b536>
     118411a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118411d:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1184120:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     118411a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184107:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118410a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     118410d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1184114:	00 
     1184115:	48 85 ff             	test   rdi,rdi
     1184118:	74 06                	je     1184120 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b536>
     118411a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118411d:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1184120:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     1184127:	00 
     1184128:	48 85 ff             	test   rdi,rdi
     118412b:	74 06                	je     1184133 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b549>
     118412d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184130:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1184133:	48 8d 35 d4 83 1b ff 	lea    rsi,[rip+0xffffffffff1b83d4]        # 33c50e <_ZTSSt12bad_any_cast@@Base-0x53cba>
     118412d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118411a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118411d:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1184120:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     1184127:	00 
     1184128:	48 85 ff             	test   rdi,rdi
     118412b:	74 06                	je     1184133 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b549>
     118412d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184130:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1184133:	48 8d 35 d4 83 1b ff 	lea    rsi,[rip+0xffffffffff1b83d4]        # 33c50e <_ZTSSt12bad_any_cast@@Base-0x53cba>
     118413a:	48 8d 15 a5 33 20 ff 	lea    rdx,[rip+0xffffffffff2033a5]        # 3874e6 <_ZTSSt12bad_any_cast@@Base-0x8ce2>
     1184141:	48 8d 0d 6d 27 1a ff 	lea    rcx,[rip+0xffffffffff1a276d]        # 3268b5 <_ZTSSt12bad_any_cast@@Base-0x69913>
     1184148:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     118414f:	00 
     1184150:	6a 01                	push   0x1
     1184152:	41 58                	pop    r8
     118422c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118421a:	eb 4b                	jmp    1184267 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b67d>
     118421c:	49 89 c6             	mov    r14,rax
     118421f:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     1184226:	00 
     1184227:	48 85 ff             	test   rdi,rdi
     118422a:	74 0b                	je     1184237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b64d>
     118422c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118422f:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1184232:	eb 03                	jmp    1184237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b64d>
     1184234:	49 89 c6             	mov    r14,rax
     1184237:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     118423e:	00 
     118423f:	48 85 ff             	test   rdi,rdi
     1184242:	74 0b                	je     118424f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b665>
     1184244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184232:	eb 03                	jmp    1184237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b64d>
     1184234:	49 89 c6             	mov    r14,rax
     1184237:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     118423e:	00 
     118423f:	48 85 ff             	test   rdi,rdi
     1184242:	74 0b                	je     118424f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b665>
     1184244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184247:	ff 50 08             	call   QWORD PTR [rax+0x8]
     118424a:	eb 03                	jmp    118424f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b665>
     118424c:	49 89 c6             	mov    r14,rax
     118424f:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     1184256:	00 
     1184257:	48 85 ff             	test   rdi,rdi
     118425a:	74 06                	je     1184262 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b678>
     118425c:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### alias rdi formed @0x1184203; FDE=(18365028, 18367310)
     118422c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118421a:	eb 4b                	jmp    1184267 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b67d>
     118421c:	49 89 c6             	mov    r14,rax
     118421f:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     1184226:	00 
     1184227:	48 85 ff             	test   rdi,rdi
     118422a:	74 0b                	je     1184237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b64d>
     118422c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118422f:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1184232:	eb 03                	jmp    1184237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b64d>
     1184234:	49 89 c6             	mov    r14,rax
     1184237:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     118423e:	00 
     118423f:	48 85 ff             	test   rdi,rdi
     1184242:	74 0b                	je     118424f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b665>
     1184244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184232:	eb 03                	jmp    1184237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b64d>
     1184234:	49 89 c6             	mov    r14,rax
     1184237:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     118423e:	00 
     118423f:	48 85 ff             	test   rdi,rdi
     1184242:	74 0b                	je     118424f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b665>
     1184244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184247:	ff 50 08             	call   QWORD PTR [rax+0x8]
     118424a:	eb 03                	jmp    118424f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b665>
     118424c:	49 89 c6             	mov    r14,rax
     118424f:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     1184256:	00 
     1184257:	48 85 ff             	test   rdi,rdi
     118425a:	74 06                	je     1184262 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b678>
     118425c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118425c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118424a:	eb 03                	jmp    118424f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b665>
     118424c:	49 89 c6             	mov    r14,rax
     118424f:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     1184256:	00 
     1184257:	48 85 ff             	test   rdi,rdi
     118425a:	74 06                	je     1184262 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b678>
     118425c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     118425f:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1184262:	48 8b 5c 24 38       	mov    rbx,QWORD PTR [rsp+0x38]
     1184267:	48 85 db             	test   rbx,rbx
     118426a:	0f 84 bf 00 00 00    	je     118432f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b745>
     1184270:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1184273:	48 89 df             	mov    rdi,rbx
     1184276:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1184279:	e9 b1 00 00 00       	jmp    118432f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b745>

### alias r12 formed @0x11913d1; FDE=(18420584, 18421909)
     119141e:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
     1191403:	4c 89 e6             	mov    rsi,r12
     1191406:	e8 1f 91 53 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     119140b:	4c 8b a3 a8 00 00 00 	mov    r12,QWORD PTR [rbx+0xa8]
     1191412:	48 8b 9b b0 00 00 00 	mov    rbx,QWORD PTR [rbx+0xb0]
     1191419:	49 39 dc             	cmp    r12,rbx
     119141c:	74 26                	je     1191444 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35885a>
     119141e:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
     1191422:	4c 89 ef             	mov    rdi,r13
     1191425:	e8 0c a4 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     119142a:	4d 8b 06             	mov    r8,QWORD PTR [r14]
     119142d:	4c 89 f7             	mov    rdi,r14
     1191430:	48 89 c6             	mov    rsi,rax
     1191433:	6a 09                	push   0x9
     1191435:	59                   	pop    rcx
     1191436:	41 ff 50 10          	call   QWORD PTR [r8+0x10]
     1191462:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
     119144f:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
     1191456:	00 
     1191457:	6a 01                	push   0x1
     1191459:	41 58                	pop    r8
     119145b:	e8 a0 77 45 00       	call   15e8c00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42e184>
     1191460:	eb 24                	jmp    1191486 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35889c>
     1191462:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
     1191466:	4c 89 ef             	mov    rdi,r13
     1191469:	e8 c8 a3 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     119146e:	4d 8b 0e             	mov    r9,QWORD PTR [r14]
     1191471:	4c 89 f7             	mov    rdi,r14
     1191474:	48 89 c6             	mov    rsi,rax
     1191477:	6a 09                	push   0x9
     1191479:	59                   	pop    rcx
     119147a:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
     119150b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11914f6:	4c 89 f6             	mov    rsi,r14
     11914f9:	e8 2c 90 53 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     11914fe:	31 d2                	xor    edx,edx
     1191500:	41 83 bf a0 00 00 00 	cmp    DWORD PTR [r15+0xa0],0x2
     1191507:	02 
     1191508:	0f 95 c2             	setne  dl
     119150b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     119150f:	c1 e2 03             	shl    edx,0x3
     1191512:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1191517:	4c 89 e6             	mov    rsi,r12
     119151a:	ff 50 18             	call   QWORD PTR [rax+0x18]
     119151d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1191521:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1191526:	4c 89 e6             	mov    rsi,r12
     1191529:	6a 05                	push   0x5
     119151d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1191508:	0f 95 c2             	setne  dl
     119150b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     119150f:	c1 e2 03             	shl    edx,0x3
     1191512:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1191517:	4c 89 e6             	mov    rsi,r12
     119151a:	ff 50 18             	call   QWORD PTR [rax+0x18]
     119151d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1191521:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1191526:	4c 89 e6             	mov    rsi,r12
     1191529:	6a 05                	push   0x5
     119152b:	5a                   	pop    rdx
     119152c:	ff 50 18             	call   QWORD PTR [rax+0x18]
     119152f:	48 8b 5c 24 50       	mov    rbx,QWORD PTR [rsp+0x50]
     1191534:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1191539:	e8 f8 a2 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>

### alias rdi formed @0x11ce94e; FDE=(18671740, 18672009)

### alias rax formed @0x11ef88e; FDE=(18805556, 18832116)

### alias r13 formed @0x1212b19; FDE=(18949088, 18958079)

### alias rdi formed @0x1212dae; FDE=(18949088, 18958079)
     1212e2c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1212e14:	45 85 ed             	test   r13d,r13d
     1212e17:	0f 84 a1 00 00 00    	je     1212ebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58442>
     1212e1d:	4c 89 f7             	mov    rdi,r14
     1212e20:	41 ff 57 50          	call   QWORD PTR [r15+0x50]
     1212e24:	49 89 c6             	mov    r14,rax
     1212e27:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     1212e2c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1212e2f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1212e32:	48 8d bc 24 50 0c 00 	lea    rdi,[rsp+0xc50]
     1212e39:	00 
     1212e3a:	4c 89 f6             	mov    rsi,r14
     1212e3d:	4c 89 e2             	mov    rdx,r12
     1212e40:	48 89 c1             	mov    rcx,rax
     1212e43:	4c 8b 44 24 60       	mov    r8,QWORD PTR [rsp+0x60]
     1212e48:	44 8b 8c 24 90 00 00 	mov    r9d,DWORD PTR [rsp+0x90]
     1212f0e:	f3 0f 11 07          	movss  DWORD PTR [rdi],xmm0
     1212ef5:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1212ef8:	48 89 df             	mov    rdi,rbx
     1212efb:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
     1212f01:	f3 0f 10 40 10       	movss  xmm0,DWORD PTR [rax+0x10]
     1212f06:	48 8d bc 24 50 0c 00 	lea    rdi,[rsp+0xc50]
     1212f0d:	00 
     1212f0e:	f3 0f 11 07          	movss  DWORD PTR [rdi],xmm0
     1212f12:	4c 89 e6             	mov    rsi,r12
     1212f15:	e8 16 41 00 00       	call   1217030 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c5b4>
     1212f1a:	48 8d 9c 24 30 03 00 	lea    rbx,[rsp+0x330]
     1212f21:	00 
     1212f22:	f3 0f 11 83 f8 00 00 	movss  DWORD PTR [rbx+0xf8],xmm0
     1212f29:	00 
     1212f2a:	c6 83 fc 00 00 00 01 	mov    BYTE PTR [rbx+0xfc],0x1
     1212f31:	31 c0                	xor    eax,eax

### alias rdi formed @0x12172b8; FDE=(18969256, 18969342)

### alias rsi formed @0x12178d0; FDE=(18969364, 18971614)
     1217a8f:	48 89 06             	mov    QWORD PTR [rsi],rax
     1217a75:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     1217a7a:	4c 89 ee             	mov    rsi,r13
     1217a7d:	e8 88 29 5c 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
     1217a82:	48 8d 84 24 ac 00 00 	lea    rax,[rsp+0xac]
     1217a89:	00 
     1217a8a:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     1217a8f:	48 89 06             	mov    QWORD PTR [rsi],rax
     1217a92:	48 8b 54 24 78       	mov    rdx,QWORD PTR [rsp+0x78]
     1217a97:	48 8b 9c 24 80 00 00 	mov    rbx,QWORD PTR [rsp+0x80]
     1217a9e:	00 
     1217a9f:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1217aa6:	00 
     1217aa7:	48 89 d9             	mov    rcx,rbx
     1217aaa:	e8 2b 3b af ff       	call   d0b5da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25857a>
     1217aaf:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]

### alias rsi formed @0x1217a16; FDE=(18969364, 18971614)
     1217a8f:	48 89 06             	mov    QWORD PTR [rsi],rax
     1217a75:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     1217a7a:	4c 89 ee             	mov    rsi,r13
     1217a7d:	e8 88 29 5c 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
     1217a82:	48 8d 84 24 ac 00 00 	lea    rax,[rsp+0xac]
     1217a89:	00 
     1217a8a:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     1217a8f:	48 89 06             	mov    QWORD PTR [rsi],rax
     1217a92:	48 8b 54 24 78       	mov    rdx,QWORD PTR [rsp+0x78]
     1217a97:	48 8b 9c 24 80 00 00 	mov    rbx,QWORD PTR [rsp+0x80]
     1217a9e:	00 
     1217a9f:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1217aa6:	00 
     1217aa7:	48 89 d9             	mov    rcx,rbx
     1217aaa:	e8 2b 3b af ff       	call   d0b5da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25857a>
     1217aaf:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]

### alias rcx formed @0x123e802; FDE=(19122204, 19140568)
     123e80a:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     123e7f3:	e8 a4 e5 fe ff       	call   122cd9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72320>
     123e7f8:	0f 57 c0             	xorps  xmm0,xmm0
     123e7fb:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
     123e7ff:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     123e802:	48 8d 8c 24 18 02 00 	lea    rcx,[rsp+0x218]
     123e809:	00 
     123e80a:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     123e80d:	48 8d 05 44 72 63 00 	lea    rax,[rip+0x637244]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>
     123e814:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
     123e818:	83 61 10 00          	and    DWORD PTR [rcx+0x10],0x0
     123e81c:	c7 43 20 00 00 80 3f 	mov    DWORD PTR [rbx+0x20],0x3f800000
     123e823:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     123e828:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
     123e82c:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     123e830:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax

### alias rdi formed @0x123ebec; FDE=(19122204, 19140568)

### alias r14 formed @0x123f4e9; FDE=(19122204, 19140568)
     123f4f1:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     123f4d9:	0f 29 84 24 90 02 00 	movaps XMMWORD PTR [rsp+0x290],xmm0
     123f4e0:	00 
     123f4e1:	0f 29 84 24 80 02 00 	movaps XMMWORD PTR [rsp+0x280],xmm0
     123f4e8:	00 
     123f4e9:	4c 8d b4 24 18 02 00 	lea    r14,[rsp+0x218]
     123f4f0:	00 
     123f4f1:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     123f4f5:	48 8d 05 84 e8 61 00 	lea    rax,[rip+0x61e884]        # 185dd80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a468>
     123f4fc:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     123f500:	41 83 66 10 00       	and    DWORD PTR [r14+0x10],0x0
     123f505:	c7 84 24 a0 02 00 00 	mov    DWORD PTR [rsp+0x2a0],0x3f800000
     123f50c:	00 00 80 3f 
     123f510:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     123f515:	4c 8b 68 08          	mov    r13,QWORD PTR [rax+0x8]
     123f519:	48 8b 68 10          	mov    rbp,QWORD PTR [rax+0x10]

### alias r14 formed @0x123fd5f; FDE=(19122204, 19140568)
     123fd6a:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     123fd55:	4d 39 f7             	cmp    r15,r14
     123fd58:	75 e0                	jne    123fd3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x852be>
     123fd5a:	e9 f1 00 00 00       	jmp    123fe50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x853d4>
     123fd5f:	4c 8d b4 24 18 02 00 	lea    r14,[rsp+0x218]
     123fd66:	00 
     123fd67:	0f 57 c0             	xorps  xmm0,xmm0
     123fd6a:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     123fd6e:	48 8d 05 5b 3c 64 00 	lea    rax,[rip+0x643c5b]        # 18839d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x400b8>
     123fd75:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     123fd79:	41 83 66 10 00       	and    DWORD PTR [r14+0x10],0x0
     123fd7e:	41 80 7f 48 00       	cmp    BYTE PTR [r15+0x48],0x0
     123fd83:	0f 84 bf 00 00 00    	je     123fe48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x853cc>
     123fd89:	49 8b 7f 38          	mov    rdi,QWORD PTR [r15+0x38]
     123fd8d:	49 8b 77 40          	mov    rsi,QWORD PTR [r15+0x40]
     123fd91:	48 8d 94 24 10 02 00 	lea    rdx,[rsp+0x210]

### alias rdi formed @0x1240dfa; FDE=(19122204, 19140568)

### alias r15 formed @0x125cc6b; FDE=(19254178, 19255891)

### alias r14 formed @0x126a1fb; FDE=(19308926, 19309309)

### alias r12 formed @0x126c0d7; FDE=(19316088, 19317734)
     126c135:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     126c11f:	73 14                	jae    126c135 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb16b9>
     126c121:	4c 89 ef             	mov    rdi,r13
     126c124:	4c 89 f6             	mov    rsi,r14
     126c127:	e8 ee 98 fd ff       	call   1245a1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8af9e>
     126c12c:	49 83 c5 48          	add    r13,0x48
     126c130:	e9 94 00 00 00       	jmp    126c1c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb174d>
     126c135:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     126c139:	49 29 fd             	sub    r13,rdi
     126c13c:	4c 89 e8             	mov    rax,r13
     126c13f:	48 99                	cqo
     126c141:	6a 48                	push   0x48
     126c143:	59                   	pop    rcx
     126c144:	48 f7 f9             	idiv   rcx
     126c147:	48 8d 50 01          	lea    rdx,[rax+0x1]
     126c14b:	e8 c0 e7 9c ff       	call   c3a910 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1878b0>

### alias rdi formed @0x127349e; FDE=(19345684, 19347661)
     12734d7:	48 89 07             	mov    QWORD PTR [rdi],rax
     12734ba:	0f 83 cf 02 00 00    	jae    127378f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb8d13>
     12734c0:	44 89 fd             	mov    ebp,r15d
     12734c3:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     12734ca:	00 
     12734cb:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
     12734d0:	48 8d 05 b1 83 60 00 	lea    rax,[rip+0x6083b1]        # 187b888 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37f70>
     12734d7:	48 89 07             	mov    QWORD PTR [rdi],rax
     12734da:	0f 57 c0             	xorps  xmm0,xmm0
     12734dd:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     12734e1:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
     12734e5:	48 83 67 30 00       	and    QWORD PTR [rdi+0x30],0x0
     12734ea:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     12734ef:	48 8b 58 18          	mov    rbx,QWORD PTR [rax+0x18]
     12734f3:	e8 5a c1 bf ff       	call   e6f652 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a68>
     12734f8:	48 85 db             	test   rbx,rbx
     1273620:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1273609:	00 
     127360a:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
     127360e:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     1273615:	00 
     1273616:	e8 4f 69 80 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     127361b:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     1273620:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1273623:	4c 89 ee             	mov    rsi,r13
     1273626:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     127362c:	4c 8d a4 24 10 01 00 	lea    r12,[rsp+0x110]
     1273633:	00 
     1273634:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1273639:	49 89 44 24 f0       	mov    QWORD PTR [r12-0x10],rax
     127363e:	4c 89 e7             	mov    rdi,r12
     1273641:	48 89 de             	mov    rsi,rbx

### alias rdi formed @0x127f7fd; FDE=(19396400, 19397141)
     127f917:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     127f8fb:	e8 f2 a2 55 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     127f900:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     127f904:	e8 7d eb 81 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     127f909:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     127f90e:	e8 d5 ae 55 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     127f913:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     127f917:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     127f91a:	ff 50 50             	call   QWORD PTR [rax+0x50]
     127f91d:	84 c0                	test   al,al
     127f91f:	74 0c                	je     127f92d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4eb1>
     127f921:	31 db                	xor    ebx,ebx
     127f923:	eb 15                	jmp    127f93a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4ebe>
     127f925:	31 db                	xor    ebx,ebx
     127f927:	eb 32                	jmp    127f95b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4edf>
     127f929:	31 db                	xor    ebx,ebx

### alias rsi formed @0x127f83c; FDE=(19396400, 19397141)
     127f87f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     127f868:	00 
     127f869:	e8 24 4f df ff       	call   1074792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23bba8>
     127f86e:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     127f875:	00 
     127f876:	e8 b3 5a 44 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     127f87b:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     127f87f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     127f882:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     127f887:	48 8d 94 24 70 02 00 	lea    rdx,[rsp+0x270]
     127f88e:	00 
     127f88f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     127f892:	80 bc 24 88 00 00 00 	cmp    BYTE PTR [rsp+0x88],0x0
     127f899:	00 
     127f89a:	0f 84 81 00 00 00    	je     127f921 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4ea5>
     127f8a0:	48 8d 7b 28          	lea    rdi,[rbx+0x28]

### alias rdi formed @0x127f86e; FDE=(19396400, 19397141)
     127f917:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     127f8fb:	e8 f2 a2 55 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     127f900:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     127f904:	e8 7d eb 81 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     127f909:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     127f90e:	e8 d5 ae 55 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     127f913:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     127f917:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     127f91a:	ff 50 50             	call   QWORD PTR [rax+0x50]
     127f91d:	84 c0                	test   al,al
     127f91f:	74 0c                	je     127f92d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4eb1>
     127f921:	31 db                	xor    ebx,ebx
     127f923:	eb 15                	jmp    127f93a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4ebe>
     127f925:	31 db                	xor    ebx,ebx
     127f927:	eb 32                	jmp    127f95b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4edf>
     127f929:	31 db                	xor    ebx,ebx

### alias rdi formed @0x127f9d7; FDE=(19396400, 19397141)

### alias rdi formed @0x1283fc3; FDE=(19412762, 19415636)

### alias rsi formed @0x12b8f61; FDE=(19631493, 19633314)

### alias rdi formed @0x12f3bf5; FDE=(19872427, 19880907)

### alias rsi formed @0x12f3c25; FDE=(19872427, 19880907)
     12f3d6e:	48 89 06             	mov    QWORD PTR [rsi],rax
     12f3d52:	00 00 
     12f3d54:	48 85 c0             	test   rax,rax
     12f3d57:	48 8d 0d 8a f8 6a 00 	lea    rcx,[rip+0x6af88a]        # 19a35e8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x6c230>
     12f3d5e:	48 0f 45 c8          	cmovne rcx,rax
     12f3d62:	48 8d 05 9f fb 56 00 	lea    rax,[rip+0x56fb9f]        # 1863908 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fff0>
     12f3d69:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     12f3d6e:	48 89 06             	mov    QWORD PTR [rsi],rax
     12f3d71:	4c 89 76 08          	mov    QWORD PTR [rsi+0x8],r14
     12f3d75:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
     12f3d79:	48 89 56 18          	mov    QWORD PTR [rsi+0x18],rdx
     12f3d7d:	48 8d 84 24 c0 02 00 	lea    rax,[rsp+0x2c0]
     12f3d84:	00 
     12f3d85:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     12f3d89:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
     12f3d90:	00 

### alias rdx formed @0x12f40c4; FDE=(19872427, 19880907)

### alias rdi formed @0x12f41ce; FDE=(19872427, 19880907)
     12f4290:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     12f4274:	e8 a7 19 f7 ff       	call   1265c20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xab1a4>
     12f4279:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12f427e:	8b 40 48             	mov    eax,DWORD PTR [rax+0x48]
     12f4281:	48 8d 0d e0 fa 56 00 	lea    rcx,[rip+0x56fae0]        # 1863d68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20450>
     12f4288:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     12f428f:	00 
     12f4290:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     12f4293:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     12f4296:	e8 d9 cf 00 00       	call   1301274 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1467f8>
     12f429b:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
     12f42a2:	00 
     12f42a3:	89 47 74             	mov    DWORD PTR [rdi+0x74],eax
     12f42a6:	80 4f 11 10          	or     BYTE PTR [rdi+0x11],0x10
     12f42aa:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     12f42af:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]

### alias rsi formed @0x12f41fc; FDE=(19872427, 19880907)

### alias rdi formed @0x12f4209; FDE=(19872427, 19880907)
     12f4290:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     12f4274:	e8 a7 19 f7 ff       	call   1265c20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xab1a4>
     12f4279:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12f427e:	8b 40 48             	mov    eax,DWORD PTR [rax+0x48]
     12f4281:	48 8d 0d e0 fa 56 00 	lea    rcx,[rip+0x56fae0]        # 1863d68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20450>
     12f4288:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     12f428f:	00 
     12f4290:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     12f4293:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     12f4296:	e8 d9 cf 00 00       	call   1301274 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1467f8>
     12f429b:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
     12f42a2:	00 
     12f42a3:	89 47 74             	mov    DWORD PTR [rdi+0x74],eax
     12f42a6:	80 4f 11 10          	or     BYTE PTR [rdi+0x11],0x10
     12f42aa:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     12f42af:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]

### alias rdi formed @0x12f4288; FDE=(19872427, 19880907)
     12f4290:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     12f4274:	e8 a7 19 f7 ff       	call   1265c20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xab1a4>
     12f4279:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12f427e:	8b 40 48             	mov    eax,DWORD PTR [rax+0x48]
     12f4281:	48 8d 0d e0 fa 56 00 	lea    rcx,[rip+0x56fae0]        # 1863d68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20450>
     12f4288:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     12f428f:	00 
     12f4290:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     12f4293:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     12f4296:	e8 d9 cf 00 00       	call   1301274 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1467f8>
     12f429b:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
     12f42a2:	00 
     12f42a3:	89 47 74             	mov    DWORD PTR [rdi+0x74],eax
     12f42a6:	80 4f 11 10          	or     BYTE PTR [rdi+0x11],0x10
     12f42aa:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     12f42af:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]

### alias rdi formed @0x12f530d; FDE=(19872427, 19880907)

### alias rdi formed @0x12f5824; FDE=(19872427, 19880907)

### alias rdi formed @0x12f5b91; FDE=(19872427, 19880907)

### alias rcx formed @0x12fa135; FDE=(19898258, 19899038)

### alias rbx formed @0x1303a43; FDE=(19937174, 19938842)

### alias rax formed @0x1331eb4; FDE=(20126670, 20131289)

### alias rdi formed @0x1345e42; FDE=(20209052, 20209305)

### alias rsi formed @0x135b535; FDE=(20293452, 20300282)

### alias rdx formed @0x135b559; FDE=(20293452, 20300282)

### alias rdi formed @0x135bac5; FDE=(20293452, 20300282)

### alias r15 formed @0x135bd45; FDE=(20293452, 20300282)

### alias rdi formed @0x135bf76; FDE=(20293452, 20300282)

### alias rdi formed @0x135cb17; FDE=(20301944, 20303957)
     135cbae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cb92:	e8 45 ac 95 ff       	call   cb77dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20477c>
     135cb97:	48 8b 85 50 01 00 00 	mov    rax,QWORD PTR [rbp+0x150]
     135cb9e:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
     135cba5:	00 
     135cba6:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
     135cbad:	00 
     135cbae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbb1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135cbb4:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
     135cbbb:	00 
     135cbbc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135cbbf:	48 89 df             	mov    rdi,rbx
     135cbc2:	ff 50 58             	call   QWORD PTR [rax+0x58]
     135cbc5:	49 89 c6             	mov    r14,rax
     135cbc8:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
     135cbd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbbc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135cbbf:	48 89 df             	mov    rdi,rbx
     135cbc2:	ff 50 58             	call   QWORD PTR [rax+0x58]
     135cbc5:	49 89 c6             	mov    r14,rax
     135cbc8:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
     135cbcf:	00 
     135cbd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbd3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135cbd6:	49 89 c4             	mov    r12,rax
     135cbd9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135cbdc:	48 89 df             	mov    rdi,rbx
     135cbdf:	ff 50 50             	call   QWORD PTR [rax+0x50]
     135cbe2:	49 89 c5             	mov    r13,rax
     135cbe5:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
     135cbec:	00 
     135cbed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbd9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135cbdc:	48 89 df             	mov    rdi,rbx
     135cbdf:	ff 50 50             	call   QWORD PTR [rax+0x50]
     135cbe2:	49 89 c5             	mov    r13,rax
     135cbe5:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
     135cbec:	00 
     135cbed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbf0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135cbf3:	48 89 c3             	mov    rbx,rax
     135cbf6:	48 8d 84 24 d0 01 00 	lea    rax,[rsp+0x1d0]
     135cbfd:	00 
     135cbfe:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     135cc03:	0f 57 c0             	xorps  xmm0,xmm0
     135cc06:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     135cc09:	48 89 84 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rax

### alias rdi formed @0x135cf09; FDE=(20301944, 20303957)

### alias rdi formed @0x135d01b; FDE=(20301944, 20303957)

### alias r10 formed @0x136ac66; FDE=(20359860, 20360789)

### alias rax formed @0x136cb04; FDE=(20367874, 20368496)
     136cb25:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     136cb04:	48 8d 85 18 02 00 00 	lea    rax,[rbp+0x218]
     136cb0b:	48 81 c5 00 01 00 00 	add    rbp,0x100
     136cb12:	48 3b 6c 24 30       	cmp    rbp,QWORD PTR [rsp+0x30]
     136cb17:	48 89 c5             	mov    rbp,rax
     136cb1a:	0f 85 58 ff ff ff    	jne    136ca78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1ffc>
     136cb20:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     136cb25:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     136cb28:	48 8b 68 08          	mov    rbp,QWORD PTR [rax+0x8]
     136cb2c:	48 39 eb             	cmp    rbx,rbp
     136cb2f:	0f 84 9e 00 00 00    	je     136cbd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2157>
     136cb35:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
     136cb3a:	48 81 c3 00 01 00 00 	add    rbx,0x100
     136cb41:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
     136cb46:	48 8d 7b 88          	lea    rdi,[rbx-0x78]
     136cb4a:	e8 f3 af 15 00       	call   14c7b42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d0c6>
     136cbd8:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     136cbb9:	48 8d 83 18 02 00 00 	lea    rax,[rbx+0x218]
     136cbc0:	48 81 c3 18 01 00 00 	add    rbx,0x118
     136cbc7:	48 39 eb             	cmp    rbx,rbp
     136cbca:	48 89 c3             	mov    rbx,rax
     136cbcd:	0f 85 73 ff ff ff    	jne    136cb46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b20ca>
     136cbd3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     136cbd8:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     136cbdb:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
     136cbdf:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     136cbe3:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     136cbe8:	e8 d1 f2 ff ff       	call   136bebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1442>
     136cbed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     136cbf4:	00 00 
     136cbf6:	48 3b 84 24 80 02 00 	cmp    rax,QWORD PTR [rsp+0x280]
     136cbfd:	00 

### alias rax formed @0x136cbb9; FDE=(20367874, 20368496)
     136cbd8:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     136cbb9:	48 8d 83 18 02 00 00 	lea    rax,[rbx+0x218]
     136cbc0:	48 81 c3 18 01 00 00 	add    rbx,0x118
     136cbc7:	48 39 eb             	cmp    rbx,rbp
     136cbca:	48 89 c3             	mov    rbx,rax
     136cbcd:	0f 85 73 ff ff ff    	jne    136cb46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b20ca>
     136cbd3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     136cbd8:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     136cbdb:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
     136cbdf:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     136cbe3:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     136cbe8:	e8 d1 f2 ff ff       	call   136bebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1442>
     136cbed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     136cbf4:	00 00 
     136cbf6:	48 3b 84 24 80 02 00 	cmp    rax,QWORD PTR [rsp+0x280]
     136cbfd:	00 

### alias rcx formed @0x137435c; FDE=(20398626, 20400104)
     137438f:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     1374378:	48 83 61 f8 00       	and    QWORD PTR [rcx-0x8],0x0
     137437d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1374380:	0f 57 c9             	xorps  xmm1,xmm1
     1374383:	0f 29 49 e8          	movaps XMMWORD PTR [rcx-0x18],xmm1
     1374387:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
     137438b:	48 89 70 28          	mov    QWORD PTR [rax+0x28],rsi
     137438f:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     1374392:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     1374397:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
     137439b:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
     137439e:	8a 4a 20             	mov    cl,BYTE PTR [rdx+0x20]
     13743a1:	88 48 50             	mov    BYTE PTR [rax+0x50],cl
     13743a4:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
     13743a7:	0f 10 4a 10          	movups xmm1,XMMWORD PTR [rdx+0x10]
     13743ab:	0f 11 48 40          	movups XMMWORD PTR [rax+0x40],xmm1
     137439b:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
     1374383:	0f 29 49 e8          	movaps XMMWORD PTR [rcx-0x18],xmm1
     1374387:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
     137438b:	48 89 70 28          	mov    QWORD PTR [rax+0x28],rsi
     137438f:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     1374392:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     1374397:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
     137439b:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
     137439e:	8a 4a 20             	mov    cl,BYTE PTR [rdx+0x20]
     13743a1:	88 48 50             	mov    BYTE PTR [rax+0x50],cl
     13743a4:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
     13743a7:	0f 10 4a 10          	movups xmm1,XMMWORD PTR [rdx+0x10]
     13743ab:	0f 11 48 40          	movups XMMWORD PTR [rax+0x40],xmm1
     13743af:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     13743b3:	8a 4a 38             	mov    cl,BYTE PTR [rdx+0x38]
     13743b6:	88 48 68             	mov    BYTE PTR [rax+0x68],cl

### alias rax formed @0x137a66a; FDE=(20424172, 20427213)
     137a825:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     137a80e:	48 8b 84 24 38 03 00 	mov    rax,QWORD PTR [rsp+0x338]
     137a815:	00 
     137a816:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
     137a81b:	74 3f                	je     137a85c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bfde0>
     137a81d:	48 8d 84 24 20 03 00 	lea    rax,[rsp+0x320]
     137a824:	00 
     137a825:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     137a828:	48 8d 94 24 00 01 00 	lea    rdx,[rsp+0x100]
     137a82f:	00 
     137a830:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     137a833:	66 83 62 10 00       	and    WORD PTR [rdx+0x10],0x0
     137a838:	0f b6 84 24 10 02 00 	movzx  eax,BYTE PTR [rsp+0x210]
     137a83f:	00 
     137a840:	0d 00 01 00 00       	or     eax,0x100
     137a845:	66 89 42 12          	mov    WORD PTR [rdx+0x12],ax

### alias rsi formed @0x138591e; FDE=(20469806, 20470210)

### alias rdi formed @0x138592c; FDE=(20469806, 20470210)

### alias rdi formed @0x1385969; FDE=(20469806, 20470210)

### alias rsi formed @0x1385afe; FDE=(20470286, 20470690)

### alias rdi formed @0x1385b0c; FDE=(20470286, 20470690)

### alias rdi formed @0x1385b49; FDE=(20470286, 20470690)

### alias r14 formed @0x13868d5; FDE=(20473934, 20474171)

### alias r14 formed @0x13869ac; FDE=(20474172, 20474481)
     1386a19:	49 89 1e             	mov    QWORD PTR [r14],rbx
     13869fe:	48 8d 05 13 b2 0c ff 	lea    rax,[rip+0xffffffffff0cb213]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     1386a05:	48 89 e6             	mov    rsi,rsp
     1386a08:	48 89 06             	mov    QWORD PTR [rsi],rax
     1386a0b:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     1386a0f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1386a14:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     1386a19:	49 89 1e             	mov    QWORD PTR [r14],rbx
     1386a1c:	48 81 c3 40 02 00 00 	add    rbx,0x240
     1386a23:	48 8d 05 3a 5a 6f ff 	lea    rax,[rip+0xffffffffff6f5a3a]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     1386a2a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1386a2e:	48 8d 05 69 1d 00 00 	lea    rax,[rip+0x1d69]        # 138879e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cdd22>
     1386a35:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     1386a39:	48 89 df             	mov    rdi,rbx
     1386a3c:	4c 89 f2             	mov    rdx,r14
     1386a3f:	31 c9                	xor    ecx,ecx

### alias rax formed @0x1388833; FDE=(20481982, 20482640)

### alias r14 formed @0x13888e1; FDE=(20481982, 20482640)

### alias rsi formed @0x1388aa5; FDE=(20482656, 20486668)

### alias rdi formed @0x138ed9c; FDE=(20508020, 20508133)

### alias rdi formed @0x1394f69; FDE=(20530858, 20534050)
     1394fbe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1394fa4:	00 
     1394fa5:	e8 84 03 33 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1394faa:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1394fb1:	00 
     1394fb2:	e8 6f bb 70 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1394fb7:	48 8b bb f8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f8]
     1394fbe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1394fc1:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
     1394fc7:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1394fca:	48 89 c7             	mov    rdi,rax
     1394fcd:	ff 51 18             	call   QWORD PTR [rcx+0x18]
     1394fd0:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
     1394fd7:	00 
     1394fd8:	88 94 24 58 01 00 00 	mov    BYTE PTR [rsp+0x158],dl
     1394fdf:	84 d2                	test   dl,dl
     1395002:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1394fea:	00 
     1394feb:	4c 89 f7             	mov    rdi,r14
     1394fee:	48 89 de             	mov    rsi,rbx
     1394ff1:	e8 36 12 00 00       	call   139622c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1db7b0>
     1394ff6:	e9 42 fa ff ff       	jmp    1394a3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d9fc1>
     1394ffb:	48 8b bb f8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f8]
     1395002:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1395005:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
     139500b:	49 89 c7             	mov    r15,rax
     139500e:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1395015:	00 
     1395016:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     139501d:	00 
     139501e:	e8 89 41 7e ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     1395023:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]

### alias rdi formed @0x1397c3d; FDE=(20543606, 20545753)

### alias rdi formed @0x1397ec4; FDE=(20543606, 20545753)

### alias rdi formed @0x13abcf0; FDE=(20625578, 20627949)
     13abd82:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13abd6a:	49 8b bd 50 02 00 00 	mov    rdi,QWORD PTR [r13+0x250]
     13abd71:	48 85 ff             	test   rdi,rdi
     13abd74:	74 14                	je     13abd8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f130e>
     13abd76:	49 8d 85 30 02 00 00 	lea    rax,[r13+0x230]
     13abd7d:	48 39 c7             	cmp    rdi,rax
     13abd80:	74 13                	je     13abd95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f1319>
     13abd82:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13abd85:	ff 50 10             	call   QWORD PTR [rax+0x10]
     13abd88:	eb 02                	jmp    13abd8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f1310>
     13abd8a:	31 c0                	xor    eax,eax
     13abd8c:	48 89 83 e0 02 00 00 	mov    QWORD PTR [rbx+0x2e0],rax
     13abd93:	eb 13                	jmp    13abda8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f132c>
     13abd95:	48 89 ab e0 02 00 00 	mov    QWORD PTR [rbx+0x2e0],rbp
     13abd9c:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13abd9f:	48 89 c7             	mov    rdi,rax

### alias r15 formed @0x13adaf4; FDE=(20628338, 20634772)

### alias rsi formed @0x13b026e; FDE=(20644346, 20644801)

### alias rdi formed @0x13b0307; FDE=(20644346, 20644801)

### alias rdi formed @0x13b78a7; FDE=(20674524, 20674830)
     13b78c8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13b78b1:	e8 ca 67 43 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     13b78b6:	6a 01                	push   0x1
     13b78b8:	5e                   	pop    rsi
     13b78b9:	4c 89 ff             	mov    rdi,r15
     13b78bc:	e8 79 7c 7a ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13b78c1:	49 8b be 00 02 00 00 	mov    rdi,QWORD PTR [r14+0x200]
     13b78c8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13b78cb:	48 89 de             	mov    rsi,rbx
     13b78ce:	ff 50 28             	call   QWORD PTR [rax+0x28]
     13b78d1:	e9 70 ff ff ff       	jmp    13b7846 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fcdca>
     13b78d6:	49 89 c6             	mov    r14,rax
     13b78d9:	6a 01                	push   0x1
     13b78db:	5e                   	pop    rsi
     13b78dc:	4c 89 ff             	mov    rdi,r15
     13b78df:	e8 56 7c 7a ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>

### alias rdi formed @0x13b87ed; FDE=(20677358, 20678942)
     13b88d8:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
     13b88bc:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     13b88c1:	48 8d 35 04 af f8 fe 	lea    rsi,[rip+0xfffffffffef8af04]        # 3437cc <_ZTSSt12bad_any_cast@@Base-0x4c9fc>
     13b88c8:	4c 89 f7             	mov    rdi,r14
     13b88cb:	e8 22 d7 41 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
     13b88d0:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     13b88d7:	00 
     13b88d8:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
     13b88df:	48 8d 05 6d f5 fb fe 	lea    rax,[rip+0xfffffffffefbf56d]        # 377e53 <_ZTSSt12bad_any_cast@@Base-0x18375>
     13b88e6:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     13b88ea:	48 8d 05 62 a1 fb fe 	lea    rax,[rip+0xfffffffffefba162]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
     13b88f1:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     13b88f5:	c7 47 18 45 01 00 00 	mov    DWORD PTR [rdi+0x18],0x145
     13b88fc:	4c 89 f6             	mov    rsi,r14
     13b88ff:	e8 a4 13 6f ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
     13b8904:	4c 89 f7             	mov    rdi,r14

### alias rax formed @0x13e26d3; FDE=(20849610, 20851183)

### alias rdi formed @0x1427fed; FDE=(21135270, 21135524)

### alias r15 formed @0x143a771; FDE=(21210932, 21212520)

### alias r15 formed @0x143a87e; FDE=(21210932, 21212520)

### alias r14 formed @0x143a931; FDE=(21210932, 21212520)
     143a9b5:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     143a993:	e9 de 02 00 00       	jmp    143ac76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2801fa>
     143a998:	c7 03 01 00 00 00    	mov    DWORD PTR [rbx],0x1
     143a99e:	48 8d 05 db 4b 4e 00 	lea    rax,[rip+0x4e4bdb]        # 191f580 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66990>
     143a9a5:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     143a9a9:	c6 83 80 01 00 00 00 	mov    BYTE PTR [rbx+0x180],0x0
     143a9b0:	e9 a7 02 00 00       	jmp    143ac5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2801e0>
     143a9b5:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     143a9b8:	48 83 ee 80          	sub    rsi,0xffffffffffffff80
     143a9bc:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     143a9c3:	00 
     143a9c4:	e8 bf 03 00 00       	call   143ad88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28030c>
     143a9c9:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
     143a9d0:	00 
     143a9d1:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     143a9d8:	00 
     143aa09:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     143a9f3:	00 00 
     143a9f5:	0f 29 84 24 00 01 00 	movaps XMMWORD PTR [rsp+0x100],xmm0
     143a9fc:	00 
     143a9fd:	83 a4 24 b8 00 00 00 	and    DWORD PTR [rsp+0xb8],0x0
     143aa04:	00 
     143aa05:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     143aa09:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     143aa0d:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
     143aa14:	00 
     143aa15:	48 85 c0             	test   rax,rax
     143aa18:	74 05                	je     143aa1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ffa3>
     143aa1a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     143aa1f:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     143aa26:	00 
     143aa27:	48 89 df             	mov    rdi,rbx

### alias rdi formed @0x143aa47; FDE=(21210932, 21212520)

### alias r15 formed @0x143aa59; FDE=(21210932, 21212520)

### alias r14 formed @0x143ac01; FDE=(21210932, 21212520)

### alias rdi formed @0x143ad0a; FDE=(21210932, 21212520)

### alias rdi formed @0x143ad29; FDE=(21210932, 21212520)

### alias rcx formed @0x14461ea; FDE=(21258654, 21258971)
     14461f9:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
     14461df:	74 09                	je     14461ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28b76e>
     14461e1:	80 b8 38 02 00 00 00 	cmp    BYTE PTR [rax+0x238],0x0
     14461e8:	75 24                	jne    144620e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28b792>
     14461ea:	49 8d 8c 24 18 02 00 	lea    rcx,[r12+0x218]
     14461f1:	00 
     14461f2:	48 8d 2d 0f f5 fe fe 	lea    rbp,[rip+0xfffffffffefef50f]        # 435708 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b157>
     14461f9:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
     14461fc:	48 85 c9             	test   rcx,rcx
     14461ff:	74 14                	je     1446215 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28b799>
     1446201:	48 8b 41 20          	mov    rax,QWORD PTR [rcx+0x20]
     1446205:	80 b8 38 02 00 00 00 	cmp    BYTE PTR [rax+0x238],0x0
     144620c:	74 eb                	je     14461f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28b77d>
     144620e:	48 83 c0 58          	add    rax,0x58
     1446212:	48 89 c5             	mov    rbp,rax
     1446215:	49 8b 5c 24 68       	mov    rbx,QWORD PTR [r12+0x68]

### alias r14 formed @0x144a4fd; FDE=(21275184, 21277588)

### alias r15 formed @0x144b770; FDE=(21280572, 21281114)

### alias rsi formed @0x144b7e5; FDE=(21280572, 21281114)
     144b81a:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
     144b800:	e8 dd df ff ff       	call   14497e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28ed66>
     144b805:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
     144b80c:	00 
     144b80d:	e8 7c ad f0 ff       	call   135658e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb12>
     144b812:	48 8d b4 24 18 02 00 	lea    rsi,[rsp+0x218]
     144b819:	00 
     144b81a:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
     144b81d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     144b822:	e8 2d ac f0 ff       	call   1356454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b9d8>
     144b827:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     144b82c:	c6 82 00 01 00 00 01 	mov    BYTE PTR [rdx+0x100],0x1
     144b833:	4c 8d 84 24 90 03 00 	lea    r8,[rsp+0x390]
     144b83a:	00 
     144b83b:	48 89 df             	mov    rdi,rbx
     144b83e:	4c 89 fe             	mov    rsi,r15

### alias rsi formed @0x144b812; FDE=(21280572, 21281114)
     144b81a:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
     144b800:	e8 dd df ff ff       	call   14497e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28ed66>
     144b805:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
     144b80c:	00 
     144b80d:	e8 7c ad f0 ff       	call   135658e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb12>
     144b812:	48 8d b4 24 18 02 00 	lea    rsi,[rsp+0x218]
     144b819:	00 
     144b81a:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
     144b81d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     144b822:	e8 2d ac f0 ff       	call   1356454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b9d8>
     144b827:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     144b82c:	c6 82 00 01 00 00 01 	mov    BYTE PTR [rdx+0x100],0x1
     144b833:	4c 8d 84 24 90 03 00 	lea    r8,[rsp+0x390]
     144b83a:	00 
     144b83b:	48 89 df             	mov    rdi,rbx
     144b83e:	4c 89 fe             	mov    rsi,r15

### alias rdi formed @0x144b89d; FDE=(21280572, 21281114)

### alias rdi formed @0x144b91b; FDE=(21280572, 21281114)

### alias rdi formed @0x144b92d; FDE=(21280572, 21281114)

### alias rsi formed @0x14795e0; FDE=(21467989, 21474425)

### alias r12 formed @0x14852dc; FDE=(21516721, 21523052)

### alias r13 formed @0x1489057; FDE=(21532705, 21532951)

### alias r13 formed @0x148914d; FDE=(21532951, 21533197)

### alias r14 formed @0x148db9a; FDE=(21551929, 21552245)

### alias rdi formed @0x14979ad; FDE=(21591706, 21596010)

### alias rsi formed @0x14979c5; FDE=(21591706, 21596010)
     14979e6:	66 0f 29 06          	movapd XMMWORD PTR [rsi],xmm0
     14979cd:	f2 0f 10 05 63 79 ef 	movsd  xmm0,QWORD PTR [rip+0xfffffffffeef7963]        # 38f338 <_ZTSSt12bad_any_cast@@Base-0xe90>
     14979d4:	fe 
     14979d5:	e8 0a 29 ff ff       	call   148a2e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf868>
     14979da:	66 0f 57 c0          	xorpd  xmm0,xmm0
     14979de:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
     14979e5:	00 
     14979e6:	66 0f 29 06          	movapd XMMWORD PTR [rsi],xmm0
     14979ea:	f2 0f 10 05 56 76 ef 	movsd  xmm0,QWORD PTR [rip+0xfffffffffeef7656]        # 38f048 <_ZTSSt12bad_any_cast@@Base-0x1180>
     14979f1:	fe 
     14979f2:	66 0f 29 46 10       	movapd XMMWORD PTR [rsi+0x10],xmm0
     14979f7:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     14979fe:	00 
     14979ff:	6a 02                	push   0x2
     1497a01:	5a                   	pop    rdx
     1497a02:	e8 2b 11 ff ff       	call   1488b32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce0b6>
     1497a85:	66 0f 29 06          	movapd XMMWORD PTR [rsi],xmm0
     1497a6c:	f2 0f 10 05 cc 76 ef 	movsd  xmm0,QWORD PTR [rip+0xfffffffffeef76cc]        # 38f140 <_ZTSSt12bad_any_cast@@Base-0x1088>
     1497a73:	fe 
     1497a74:	e8 6b 28 ff ff       	call   148a2e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf868>
     1497a79:	66 0f 57 c0          	xorpd  xmm0,xmm0
     1497a7d:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
     1497a84:	00 
     1497a85:	66 0f 29 06          	movapd XMMWORD PTR [rsi],xmm0
     1497a89:	f2 0f 10 05 b7 75 ef 	movsd  xmm0,QWORD PTR [rip+0xfffffffffeef75b7]        # 38f048 <_ZTSSt12bad_any_cast@@Base-0x1180>
     1497a90:	fe 
     1497a91:	66 0f 29 46 10       	movapd XMMWORD PTR [rsi+0x10],xmm0
     1497a96:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     1497a9d:	00 
     1497a9e:	6a 02                	push   0x2
     1497aa0:	5a                   	pop    rdx
     1497aa1:	e8 8c 10 ff ff       	call   1488b32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce0b6>

### alias rdi formed @0x1497af2; FDE=(21591706, 21596010)

### alias rdi formed @0x14986c8; FDE=(21591706, 21596010)

### alias rsi formed @0x149cfc9; FDE=(21614393, 21616107)

### alias rdi formed @0x14bbfd7; FDE=(21741214, 21741807)

### alias rdi formed @0x14bc446; FDE=(21742528, 21742743)

### alias rbx formed @0x14f5018; FDE=(21973500, 21978000)
     14f5028:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
     14f500a:	49 81 c5 08 01 00 00 	add    r13,0x108
     14f5011:	4c 8d b8 20 01 00 00 	lea    r15,[rax+0x120]
     14f5018:	48 8d 9c 24 18 02 00 	lea    rbx,[rsp+0x218]
     14f501f:	00 
     14f5020:	4c 8d b4 24 f8 01 00 	lea    r14,[rsp+0x1f8]
     14f5027:	00 
     14f5028:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
     14f502b:	48 85 db             	test   rbx,rbx
     14f502e:	74 0e                	je     14f503e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33a5c2>
     14f5030:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     14f5034:	4c 89 f7             	mov    rdi,r14
     14f5037:	e8 a4 8d 93 ff       	call   e2dde0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfae66>
     14f503c:	eb ea                	jmp    14f5028 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33a5ac>
     14f503e:	4c 8d b4 24 60 02 00 	lea    r14,[rsp+0x260]
     14f5045:	00 

### alias r14 formed @0x14f5531; FDE=(21973500, 21978000)
     14f55c5:	49 89 06             	mov    QWORD PTR [r14],rax
     14f55a9:	00 
     14f55aa:	48 89 9c 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rbx
     14f55b1:	00 
     14f55b2:	48 c7 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],0x1
     14f55b9:	00 01 00 00 00 
     14f55be:	48 8d 05 63 51 38 00 	lea    rax,[rip+0x385163]        # 187a728 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36e10>
     14f55c5:	49 89 06             	mov    QWORD PTR [r14],rax
     14f55c8:	4c 89 f7             	mov    rdi,r14
     14f55cb:	48 83 c7 08          	add    rdi,0x8
     14f55cf:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     14f55d6:	00 
     14f55d7:	e8 78 08 00 00       	call   14f5e54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33b3d8>
     14f55dc:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     14f55e3:	00 
     14f55e4:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     14f56fe:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     14f56e5:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
     14f56ec:	00 
     14f56ed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14f56f0:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     14f56f6:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     14f56fa:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     14f56fe:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     14f5702:	48 85 c0             	test   rax,rax
     14f5705:	74 05                	je     14f570c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33ac90>
     14f5707:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14f570c:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     14f5711:	4c 8d b4 24 80 01 00 	lea    r14,[rsp+0x180]
     14f5718:	00 
     14f5719:	4c 89 ff             	mov    rdi,r15
     14f571c:	4c 89 f6             	mov    rsi,r14

### alias r12 formed @0x15050e1; FDE=(22040482, 22042746)
     150525e:	66 41 0f 6f 04 24    	movdqa xmm0,XMMWORD PTR [r12]
     1505248:	48 8d ac 24 b0 00 00 	lea    rbp,[rsp+0xb0]
     150524f:	00 
     1505250:	4c 89 e7             	mov    rdi,r12
     1505253:	4c 89 ee             	mov    rsi,r13
     1505256:	48 89 ea             	mov    rdx,rbp
     1505259:	e8 0a 48 0e 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
     150525e:	66 41 0f 6f 04 24    	movdqa xmm0,XMMWORD PTR [r12]
     1505264:	66 0f 7f 84 24 40 01 	movdqa XMMWORD PTR [rsp+0x140],xmm0
     150526b:	00 00 
     150526d:	66 0f ef c0          	pxor   xmm0,xmm0
     1505271:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
     1505277:	48 89 ef             	mov    rdi,rbp
     150527a:	e8 11 8c 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150527f:	4c 89 ef             	mov    rdi,r13
     1505282:	e8 09 8c 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1505271:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
     1505256:	48 89 ea             	mov    rdx,rbp
     1505259:	e8 0a 48 0e 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
     150525e:	66 41 0f 6f 04 24    	movdqa xmm0,XMMWORD PTR [r12]
     1505264:	66 0f 7f 84 24 40 01 	movdqa XMMWORD PTR [rsp+0x140],xmm0
     150526b:	00 00 
     150526d:	66 0f ef c0          	pxor   xmm0,xmm0
     1505271:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
     1505277:	48 89 ef             	mov    rdi,rbp
     150527a:	e8 11 8c 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150527f:	4c 89 ef             	mov    rdi,r13
     1505282:	e8 09 8c 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1505287:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     150528e:	00 
     150528f:	e8 fc 8b 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1505294:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]

### alias rdi formed @0x151af7d; FDE=(22130198, 22137156)
     151afa4:	48 89 07             	mov    QWORD PTR [rdi],rax
     151af85:	48 83 67 e0 00       	and    QWORD PTR [rdi-0x20],0x0
     151af8a:	48 8d 05 b7 b5 37 00 	lea    rax,[rip+0x37b5b7]        # 1896548 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3488>
     151af91:	48 89 47 d8          	mov    QWORD PTR [rdi-0x28],rax
     151af95:	48 8d 05 5c 48 f2 fe 	lea    rax,[rip+0xfffffffffef2485c]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     151af9c:	48 89 47 f0          	mov    QWORD PTR [rdi-0x10],rax
     151afa0:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
     151afa4:	48 89 07             	mov    QWORD PTR [rdi],rax
     151afa7:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     151afab:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     151afaf:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     151afb3:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     151afb7:	0f 57 c0             	xorps  xmm0,xmm0
     151afba:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
     151afbe:	0f 11 47 38          	movups XMMWORD PTR [rdi+0x38],xmm0
     151afc2:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0

### alias rax formed @0x151bd47; FDE=(22130198, 22137156)
     151bd4f:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     151bd38:	48 89 ef             	mov    rdi,rbp
     151bd3b:	48 83 c7 18          	add    rdi,0x18
     151bd3f:	4c 89 f6             	mov    rsi,r14
     151bd42:	e8 f9 21 2d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     151bd47:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
     151bd4e:	00 
     151bd4f:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     151bd52:	0f 10 48 09          	movups xmm1,XMMWORD PTR [rax+0x9]
     151bd56:	0f 11 4d 39          	movups XMMWORD PTR [rbp+0x39],xmm1
     151bd5a:	0f 11 45 30          	movups XMMWORD PTR [rbp+0x30],xmm0
     151bd5e:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     151bd65:	00 
     151bd66:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     151bd6a:	48 89 ac 24 30 03 00 	mov    QWORD PTR [rsp+0x330],rbp
     151bd71:	00 
     151beae:	8b 10                	mov    edx,DWORD PTR [rax]
     151be99:	40 0f b6 c5          	movzx  eax,bpl
     151be9d:	41 0f b7 de          	movzx  ebx,r14w
     151bea1:	09 c3                	or     ebx,eax
     151bea3:	66 81 fb ff 00       	cmp    bx,0xff
     151bea8:	77 16                	ja     151bec0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361444>
     151beaa:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     151beae:	8b 10                	mov    edx,DWORD PTR [rax]
     151beb0:	6a 12                	push   0x12
     151beb2:	5f                   	pop    rdi
     151beb3:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     151beba:	00 
     151bebb:	e8 f4 13 01 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
     151bec0:	31 c0                	xor    eax,eax
     151bec2:	66 85 db             	test   bx,bx
     151bec5:	0f 94 c0             	sete   al

### alias rax formed @0x151c14d; FDE=(22130198, 22137156)
     151c155:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     151c13e:	48 89 ef             	mov    rdi,rbp
     151c141:	48 83 c7 18          	add    rdi,0x18
     151c145:	4c 89 fe             	mov    rsi,r15
     151c148:	e8 f3 1d 2d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     151c14d:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
     151c154:	00 
     151c155:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     151c158:	0f 10 48 09          	movups xmm1,XMMWORD PTR [rax+0x9]
     151c15c:	0f 11 4d 39          	movups XMMWORD PTR [rbp+0x39],xmm1
     151c160:	0f 11 45 30          	movups XMMWORD PTR [rbp+0x30],xmm0
     151c164:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     151c16b:	00 
     151c16c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     151c170:	48 89 ac 24 30 03 00 	mov    QWORD PTR [rsp+0x330],rbp
     151c177:	00 
     151c269:	8b 30                	mov    esi,DWORD PTR [rax]
     151c252:	00 
     151c253:	e8 38 1c 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     151c258:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     151c25f:	00 
     151c260:	e8 01 64 5c ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     151c265:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     151c269:	8b 30                	mov    esi,DWORD PTR [rax]
     151c26b:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     151c270:	e8 ad 5b 00 00       	call   1521e22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3673a6>
     151c275:	41 8d 45 fd          	lea    eax,[r13-0x3]
     151c279:	83 f8 03             	cmp    eax,0x3
     151c27c:	6a 04                	push   0x4
     151c27e:	5d                   	pop    rbp
     151c27f:	0f 82 c2 02 00 00    	jb     151c547 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361acb>
     151c285:	45 85 ed             	test   r13d,r13d
     151c2f2:	8b 10                	mov    edx,DWORD PTR [rax]
     151c2d7:	c7 47 18 76 01 00 00 	mov    DWORD PTR [rdi+0x18],0x176
     151c2de:	48 89 de             	mov    rsi,rbx
     151c2e1:	e8 c2 d9 58 ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
     151c2e6:	48 89 df             	mov    rdi,rbx
     151c2e9:	e8 a2 1b 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     151c2ee:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     151c2f2:	8b 10                	mov    edx,DWORD PTR [rax]
     151c2f4:	6a 13                	push   0x13
     151c2f6:	5f                   	pop    rdi
     151c2f7:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
     151c2fc:	e8 b3 0f 01 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
     151c301:	6a 01                	push   0x1
     151c303:	5d                   	pop    rbp
     151c304:	e8 cb 0e 01 00       	call   152d1d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372758>
     151c309:	84 c0                	test   al,al

### alias rdi formed @0x15279ad; FDE=(22180939, 22182694)

### alias rdi formed @0x1528e6f; FDE=(22187386, 22188581)

### alias r15 formed @0x154a7eb; FDE=(22323203, 22326403)
     154a819:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     154a802:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     154a806:	0f 57 c0             	xorps  xmm0,xmm0
     154a809:	0f 29 84 24 00 02 00 	movaps XMMWORD PTR [rsp+0x200],xmm0
     154a810:	00 
     154a811:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
     154a815:	48 89 6b 20          	mov    QWORD PTR [rbx+0x20],rbp
     154a819:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     154a81d:	48 89 df             	mov    rdi,rbx
     154a820:	e8 4b 77 0b 00       	call   1601f70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4474f4>
     154a825:	48 89 df             	mov    rdi,rbx
     154a828:	e8 3d 78 0b 00       	call   160206a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4475ee>
     154a82d:	e9 a0 00 00 00       	jmp    154a8d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38fe56>
     154a832:	48 8d 84 24 a0 01 00 	lea    rax,[rsp+0x1a0]
     154a839:	00 
     154a83a:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
     154a88b:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     154a874:	4c 89 68 20          	mov    QWORD PTR [rax+0x20],r13
     154a878:	0f 57 c0             	xorps  xmm0,xmm0
     154a87b:	0f 29 84 24 00 02 00 	movaps XMMWORD PTR [rsp+0x200],xmm0
     154a882:	00 
     154a883:	4c 89 60 30          	mov    QWORD PTR [rax+0x30],r12
     154a887:	48 89 68 38          	mov    QWORD PTR [rax+0x38],rbp
     154a88b:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     154a88f:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
     154a896:	00 
     154a897:	48 8b 94 24 a0 01 00 	mov    rdx,QWORD PTR [rsp+0x1a0]
     154a89e:	00 
     154a89f:	48 89 d1             	mov    rcx,rdx
     154a8a2:	48 83 e1 fc          	and    rcx,0xfffffffffffffffc
     154a8a6:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
     154a8aa:	83 e2 02             	and    edx,0x2

### alias r14 formed @0x156bd67; FDE=(22461506, 22464600)

### alias rsi formed @0x156bde8; FDE=(22461506, 22464600)

### alias rsi formed @0x156be54; FDE=(22461506, 22464600)

### alias rdi formed @0x156c74f; FDE=(22461506, 22464600)

### alias rdi formed @0x156c825; FDE=(22461506, 22464600)

### alias rdi formed @0x156fcd0; FDE=(22477648, 22478812)
     156fe5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     156fe4e:	74 26                	je     156fe76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b53fa>
     156fe50:	45 31 ed             	xor    r13d,r13d
     156fe53:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     156fe56:	4a 8b 3c e8          	mov    rdi,QWORD PTR [rax+r13*8]
     156fe5a:	48 85 ff             	test   rdi,rdi
     156fe5d:	74 0f                	je     156fe6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b53f2>
     156fe5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     156fe62:	4c 89 e6             	mov    rsi,r12
     156fe65:	48 89 ea             	mov    rdx,rbp
     156fe68:	4c 89 f9             	mov    rcx,r15
     156fe6b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     156fe6e:	49 ff c5             	inc    r13
     156fe71:	4d 39 ee             	cmp    r14,r13
     156fe74:	75 dd                	jne    156fe53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b53d7>
     156fe76:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]

### alias rdi formed @0x1592d90; FDE=(22621328, 22622252)

### alias rsi formed @0x1592e4c; FDE=(22621328, 22622252)

### alias rdi formed @0x1592eac; FDE=(22621328, 22622252)

### alias rdi formed @0x1592f93; FDE=(22621328, 22622252)

### alias rsi formed @0x15cc787; FDE=(22857588, 22857661)

### alias rdi formed @0x15f9e5a; FDE=(23043172, 23043782)
     15f9ea1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15f9e8a:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     15f9e8e:	e8 0b 77 00 00       	call   160159e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x446b22>
     15f9e93:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     15f9e97:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
     15f9e9c:	48 85 ff             	test   rdi,rdi
     15f9e9f:	74 06                	je     15f9ea7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43f42b>
     15f9ea1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15f9ea4:	ff 50 18             	call   QWORD PTR [rax+0x18]
     15f9ea7:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     15f9eab:	48 83 c4 08          	add    rsp,0x8
     15f9eaf:	5b                   	pop    rbx
     15f9eb0:	41 5c                	pop    r12
     15f9eb2:	41 5d                	pop    r13
     15f9eb4:	41 5e                	pop    r14
     15f9eb6:	41 5f                	pop    r15

### alias r14 formed @0x15f9fbe; FDE=(23043996, 23044255)

### alias r12 formed @0x15fa9fe; FDE=(23046608, 23046842)

### alias rbx formed @0x15faaef; FDE=(23046842, 23047728)

### alias rbx formed @0x15fb361; FDE=(23049018, 23049445)

### alias r14 formed @0x15fb636; FDE=(23049728, 23050118)

### alias r15 formed @0x15fbbbe; FDE=(23050594, 23051792)

### alias rax formed @0x16149eb; FDE=(23153006, 23160158)

### alias r12 formed @0x1616618; FDE=(23160219, 23160469)
     1616668:	49 89 04 24          	mov    QWORD PTR [r12],rax
     161664f:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1616653:	49 8b 76 68          	mov    rsi,QWORD PTR [r14+0x68]
     1616657:	8b 14 24             	mov    edx,DWORD PTR [rsp]
     161665a:	29 f2                	sub    edx,esi
     161665c:	41 ff 96 b0 00 00 00 	call   QWORD PTR [r14+0xb0]
     1616663:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1616668:	49 89 04 24          	mov    QWORD PTR [r12],rax
     161666c:	83 fd 01             	cmp    ebp,0x1
     161666f:	77 b5                	ja     1616626 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11794>
     1616671:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1616678:	00 00 
     161667a:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     161667f:	75 0f                	jne    1616690 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117fe>
     1616681:	48 83 c4 18          	add    rsp,0x18
     1616685:	5b                   	pop    rbx

### alias r14 formed @0x1617c60; FDE=(23165963, 23170503)
     1617c79:	49 89 0e             	mov    QWORD PTR [r14],rcx
     1617c60:	4d 8d b4 24 18 02 00 	lea    r14,[r12+0x218]
     1617c67:	00 
     1617c68:	49 8d 94 24 20 02 00 	lea    rdx,[r12+0x220]
     1617c6f:	00 
     1617c70:	48 89 54 24 38       	mov    QWORD PTR [rsp+0x38],rdx
     1617c75:	89 74 24 2c          	mov    DWORD PTR [rsp+0x2c],esi
     1617c79:	49 89 0e             	mov    QWORD PTR [r14],rcx
     1617c7c:	49 8d 8c 24 08 03 00 	lea    rcx,[r12+0x308]
     1617c83:	00 
     1617c84:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     1617c89:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1617c8e:	48 05 a0 00 00 00    	add    rax,0xa0
     1617c94:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1617c99:	48 8d 6c 24 58       	lea    rbp,[rsp+0x58]
     1617c9e:	48 8d 1d a7 1d d8 fe 	lea    rbx,[rip+0xfffffffffed81da7]        # 399a4c <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x662d>

### alias r13 formed @0x1619de1; FDE=(23174548, 23175169)

### alias rdi formed @0x1630ed7; FDE=(23265392, 23274560)

### alias rcx formed @0x1677ef7; FDE=(23558367, 23560344)

### alias r14 formed @0x16816f8; FDE=(23598796, 23599261)
     1681860:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1681844:	48 8b b3 00 02 00 00 	mov    rsi,QWORD PTR [rbx+0x200]
     168184b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     168184e:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     1681853:	4c 89 f7             	mov    rdi,r14
     1681856:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1681859:	48 8b bb 10 02 00 00 	mov    rdi,QWORD PTR [rbx+0x210]
     1681860:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1681863:	48 89 83 10 02 00 00 	mov    QWORD PTR [rbx+0x210],rax
     168186a:	49 89 3e             	mov    QWORD PTR [r14],rdi
     168186d:	e8 7a 4e 43 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1681872:	eb 07                	jmp    168187b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x359e7>
     1681874:	c6 83 08 02 00 00 00 	mov    BYTE PTR [rbx+0x208],0x0
     168187b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1681882:	00 00 
     1681884:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     168186a:	49 89 3e             	mov    QWORD PTR [r14],rdi
     168184e:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     1681853:	4c 89 f7             	mov    rdi,r14
     1681856:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1681859:	48 8b bb 10 02 00 00 	mov    rdi,QWORD PTR [rbx+0x210]
     1681860:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1681863:	48 89 83 10 02 00 00 	mov    QWORD PTR [rbx+0x210],rax
     168186a:	49 89 3e             	mov    QWORD PTR [r14],rdi
     168186d:	e8 7a 4e 43 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1681872:	eb 07                	jmp    168187b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x359e7>
     1681874:	c6 83 08 02 00 00 00 	mov    BYTE PTR [rbx+0x208],0x0
     168187b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1681882:	00 00 
     1681884:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     1681889:	75 0d                	jne    1681898 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35a04>
     168188b:	48 83 c4 30          	add    rsp,0x30

### alias rdi formed @0x168508e; FDE=(23612546, 23618154)
     168524d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     168523a:	00 
     168523b:	e9 f1 fe ff ff       	jmp    1685131 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3929d>
     1685240:	48 8b bc 24 68 02 00 	mov    rdi,QWORD PTR [rsp+0x268]
     1685247:	00 
     1685248:	48 85 ff             	test   rdi,rdi
     168524b:	74 06                	je     1685253 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x393bf>
     168524d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1685250:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1685253:	48 b8 00 00 00 00 00 	movabs rax,0x4000000000000000
     168525a:	00 00 40 
     168525d:	48 89 84 24 70 02 00 	mov    QWORD PTR [rsp+0x270],rax
     1685264:	00 
     1685265:	48 8d 84 24 71 02 00 	lea    rax,[rsp+0x271]
     168526c:	00 
     168526d:	0f 57 c0             	xorps  xmm0,xmm0

### alias r12 formed @0x168515a; FDE=(23612546, 23618154)

### alias rdi formed @0x1685397; FDE=(23612546, 23618154)

### alias rbx formed @0x168593c; FDE=(23612546, 23618154)

### alias rdi formed @0x1685b03; FDE=(23612546, 23618154)

### alias r15 formed @0x1685e2d; FDE=(23612546, 23618154)
     1685e48:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1685e34:	00 
     1685e35:	4c 89 ff             	mov    rdi,r15
     1685e38:	4c 89 f6             	mov    rsi,r14
     1685e3b:	e8 0c af 00 00       	call   1690d4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44eb8>
     1685e40:	48 8b bc 24 00 02 00 	mov    rdi,QWORD PTR [rsp+0x200]
     1685e47:	00 
     1685e48:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1685e4b:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
     1685e52:	00 
     1685e53:	e8 94 08 43 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1685e58:	48 89 df             	mov    rdi,rbx
     1685e5b:	e8 30 80 16 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1685e60:	48 83 bc 24 00 02 00 	cmp    QWORD PTR [rsp+0x200],0x0
     1685e67:	00 00 
     1685e69:	75 34                	jne    1685e9f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a00b>
     1685fd4:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1685fc0:	4c 89 ff             	mov    rdi,r15
     1685fc3:	48 89 de             	mov    rsi,rbx
     1685fc6:	4c 89 f1             	mov    rcx,r14
     1685fc9:	ff 50 70             	call   QWORD PTR [rax+0x70]
     1685fcc:	48 8b bc 24 00 02 00 	mov    rdi,QWORD PTR [rsp+0x200]
     1685fd3:	00 
     1685fd4:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1685fd7:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
     1685fde:	00 
     1685fdf:	49 89 3f             	mov    QWORD PTR [r15],rdi
     1685fe2:	e8 05 07 43 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1685fe7:	4c 89 f7             	mov    rdi,r14
     1685fea:	e8 a1 7e 16 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1685fef:	48 83 bc 24 00 02 00 	cmp    QWORD PTR [rsp+0x200],0x0
     1685ff6:	00 00 
     1685fdf:	49 89 3f             	mov    QWORD PTR [r15],rdi
     1685fc9:	ff 50 70             	call   QWORD PTR [rax+0x70]
     1685fcc:	48 8b bc 24 00 02 00 	mov    rdi,QWORD PTR [rsp+0x200]
     1685fd3:	00 
     1685fd4:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1685fd7:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
     1685fde:	00 
     1685fdf:	49 89 3f             	mov    QWORD PTR [r15],rdi
     1685fe2:	e8 05 07 43 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1685fe7:	4c 89 f7             	mov    rdi,r14
     1685fea:	e8 a1 7e 16 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1685fef:	48 83 bc 24 00 02 00 	cmp    QWORD PTR [rsp+0x200],0x0
     1685ff6:	00 00 
     1685ff8:	74 23                	je     168601d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a189>
     1685ffa:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
     1685fff:	48 8b 06             	mov    rax,QWORD PTR [rsi]

### alias rsi formed @0x168b32f; FDE=(23635304, 23643831)

### alias r13 formed @0x168bec9; FDE=(23635304, 23643831)

### alias rdi formed @0x168bf84; FDE=(23635304, 23643831)
     168c0fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     168c0e5:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     168c0ea:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     168c0ee:	48 8b bc 24 80 02 00 	mov    rdi,QWORD PTR [rsp+0x280]
     168c0f5:	00 
     168c0f6:	48 85 ff             	test   rdi,rdi
     168c0f9:	74 0e                	je     168c109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40275>
     168c0fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     168c0fe:	ff 50 08             	call   QWORD PTR [rax+0x8]
     168c101:	48 8b 8c 24 88 01 00 	mov    rcx,QWORD PTR [rsp+0x188]
     168c108:	00 
     168c109:	49 ff cc             	dec    r12
     168c10c:	4c 39 64 24 40       	cmp    QWORD PTR [rsp+0x40],r12
     168c111:	4c 8d ac 24 28 02 00 	lea    r13,[rsp+0x228]
     168c118:	00 
     168c119:	0f 85 b3 00 00 00    	jne    168c1d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4033e>

### alias rdi formed @0x168c03e; FDE=(23635304, 23643831)
     168c0fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     168c0e5:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     168c0ea:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     168c0ee:	48 8b bc 24 80 02 00 	mov    rdi,QWORD PTR [rsp+0x280]
     168c0f5:	00 
     168c0f6:	48 85 ff             	test   rdi,rdi
     168c0f9:	74 0e                	je     168c109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40275>
     168c0fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     168c0fe:	ff 50 08             	call   QWORD PTR [rax+0x8]
     168c101:	48 8b 8c 24 88 01 00 	mov    rcx,QWORD PTR [rsp+0x188]
     168c108:	00 
     168c109:	49 ff cc             	dec    r12
     168c10c:	4c 39 64 24 40       	cmp    QWORD PTR [rsp+0x40],r12
     168c111:	4c 8d ac 24 28 02 00 	lea    r13,[rsp+0x228]
     168c118:	00 
     168c119:	0f 85 b3 00 00 00    	jne    168c1d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4033e>

### alias rcx formed @0x168c165; FDE=(23635304, 23643831)

### alias rdi formed @0x168c1ec; FDE=(23635304, 23643831)

### alias rdx formed @0x16d12ce; FDE=(23924914, 23925566)

### alias rax formed @0x16d14de; FDE=(23925566, 23926322)

### alias rax formed @0x170cce0; FDE=(24167410, 24176494)

### alias rdi formed @0x1758761; FDE=(24477424, 24483693)

### alias rdi formed @0x175884c; FDE=(24477424, 24483693)

### alias rdi formed @0x1758941; FDE=(24477424, 24483693)

### alias rdi formed @0x1758c71; FDE=(24477424, 24483693)

## High-address materializations in owner-family code
### 0xd1621a: lea    rcx,[rip+0xb0cb0f]        # 1822d30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189f0>; FDE=(13722126, 13722158)
      d1620e:	53                   	push   rbx
      d1620f:	48 89 fb             	mov    rbx,rdi
      d16212:	6a 10                	push   0x10
      d16214:	5f                   	pop    rdi
      d16215:	e8 e6 7c ad 00       	call   17edf00 <_Znwm@plt>
      d1621a:	48 8d 0d 0f cb b0 00 	lea    rcx,[rip+0xb0cb0f]        # 1822d30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189f0>
      d16221:	48 89 08             	mov    QWORD PTR [rax],rcx
      d16224:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      d16228:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      d1622c:	5b                   	pop    rbx
      d1622d:	c3                   	ret
      d1622e:	48 8d 05 fb ca b0 00 	lea    rax,[rip+0xb0cafb]        # 1822d30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189f0>
      d16235:	48 89 06             	mov    QWORD PTR [rsi],rax
      d16238:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]

### 0xd1622e: lea    rax,[rip+0xb0cafb]        # 1822d30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189f0>; FDE=(13722158, 13722177)
      d16221:	48 89 08             	mov    QWORD PTR [rax],rcx
      d16224:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      d16228:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      d1622c:	5b                   	pop    rbx
      d1622d:	c3                   	ret
      d1622e:	48 8d 05 fb ca b0 00 	lea    rax,[rip+0xb0cafb]        # 1822d30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189f0>
      d16235:	48 89 06             	mov    QWORD PTR [rsi],rax
      d16238:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      d1623c:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d16240:	c3                   	ret
      d16241:	cc                   	int3
      d16242:	41 56                	push   r14
      d16244:	53                   	push   rbx
      d16245:	48 83 ec 18          	sub    rsp,0x18

### 0xd1628c: lea    rsi,[rip+0xcdf6a5]        # 19f5938 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f7>; FDE=(13722178, 13722346)
      d1627f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d16282:	48 89 df             	mov    rdi,rbx
      d16285:	31 d2                	xor    edx,edx
      d16287:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d1628a:	eb 0f                	jmp    d1629b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26323b>
      d1628c:	48 8d 35 a5 f6 cd 00 	lea    rsi,[rip+0xcdf6a5]        # 19f5938 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f7>
      d16293:	48 89 df             	mov    rdi,rbx
      d16296:	e8 cb 3b 9b 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
      d1629b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d162a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d162a7:	00 00 
      d162a9:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      d162ae:	75 35                	jne    d162e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263285>
      d162b0:	e8 d1 81 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0xd162f6: lea    rcx,[rip+0xb0c9eb]        # 1822ce8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189a8>; FDE=(13722346, 13722378)
      d162ea:	53                   	push   rbx
      d162eb:	48 89 fb             	mov    rbx,rdi
      d162ee:	6a 10                	push   0x10
      d162f0:	5f                   	pop    rdi
      d162f1:	e8 0a 7c ad 00       	call   17edf00 <_Znwm@plt>
      d162f6:	48 8d 0d eb c9 b0 00 	lea    rcx,[rip+0xb0c9eb]        # 1822ce8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189a8>
      d162fd:	48 89 08             	mov    QWORD PTR [rax],rcx
      d16300:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      d16304:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      d16308:	5b                   	pop    rbx
      d16309:	c3                   	ret
      d1630a:	48 8d 05 d7 c9 b0 00 	lea    rax,[rip+0xb0c9d7]        # 1822ce8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189a8>
      d16311:	48 89 06             	mov    QWORD PTR [rsi],rax
      d16314:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]

### 0xd1630a: lea    rax,[rip+0xb0c9d7]        # 1822ce8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189a8>; FDE=(13722378, 13722397)
      d162fd:	48 89 08             	mov    QWORD PTR [rax],rcx
      d16300:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      d16304:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      d16308:	5b                   	pop    rbx
      d16309:	c3                   	ret
      d1630a:	48 8d 05 d7 c9 b0 00 	lea    rax,[rip+0xb0c9d7]        # 1822ce8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x189a8>
      d16311:	48 89 06             	mov    QWORD PTR [rsi],rax
      d16314:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      d16318:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d1631c:	c3                   	ret
      d1631d:	cc                   	int3
      d1631e:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      d16322:	8a 80 00 07 00 00    	mov    al,BYTE PTR [rax+0x700]
      d16328:	24 01                	and    al,0x1

### 0xd16338: lea    rcx,[rip+0xb0c961]        # 1822ca0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18960>; FDE=(13722412, 13722444)
      d1632c:	53                   	push   rbx
      d1632d:	48 89 fb             	mov    rbx,rdi
      d16330:	6a 10                	push   0x10
      d16332:	5f                   	pop    rdi
      d16333:	e8 c8 7b ad 00       	call   17edf00 <_Znwm@plt>
      d16338:	48 8d 0d 61 c9 b0 00 	lea    rcx,[rip+0xb0c961]        # 1822ca0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18960>
      d1633f:	48 89 08             	mov    QWORD PTR [rax],rcx
      d16342:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      d16346:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      d1634a:	5b                   	pop    rbx
      d1634b:	c3                   	ret
      d1634c:	48 8d 05 4d c9 b0 00 	lea    rax,[rip+0xb0c94d]        # 1822ca0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18960>
      d16353:	48 89 06             	mov    QWORD PTR [rsi],rax
      d16356:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]

### 0xd1634c: lea    rax,[rip+0xb0c94d]        # 1822ca0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18960>; FDE=(13722444, 13722463)
      d1633f:	48 89 08             	mov    QWORD PTR [rax],rcx
      d16342:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      d16346:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      d1634a:	5b                   	pop    rbx
      d1634b:	c3                   	ret
      d1634c:	48 8d 05 4d c9 b0 00 	lea    rax,[rip+0xb0c94d]        # 1822ca0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18960>
      d16353:	48 89 06             	mov    QWORD PTR [rsi],rax
      d16356:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      d1635a:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d1635e:	c3                   	ret
      d1635f:	cc                   	int3
      d16360:	41 56                	push   r14
      d16362:	53                   	push   rbx
      d16363:	48 81 ec 88 00 00 00 	sub    rsp,0x88

### 0xd1639a: lea    rax,[rip+0xb7de67]        # 1894208 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1148>; FDE=(13722464, 13722777)
      d16386:	00 
      d16387:	0f 84 a1 00 00 00    	je     d1642e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2633ce>
      d1638d:	48 89 d3             	mov    rbx,rdx
      d16390:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      d16395:	48 83 67 f0 00       	and    QWORD PTR [rdi-0x10],0x0
      d1639a:	48 8d 05 67 de b7 00 	lea    rax,[rip+0xb7de67]        # 1894208 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1148>
      d163a1:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      d163a5:	83 67 fc 00          	and    DWORD PTR [rdi-0x4],0x0
      d163a9:	48 8d 05 48 94 72 ff 	lea    rax,[rip+0xffffffffff729448]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d163b0:	48 89 07             	mov    QWORD PTR [rdi],rax
      d163b3:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d163b7:	48 63 06             	movsxd rax,DWORD PTR [rsi]
      d163ba:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      d163be:	c7 47 f8 05 00 00 00 	mov    DWORD PTR [rdi-0x8],0x5

### 0xd164a6: lea    rcx,[rip+0xb0c71b]        # 1822bc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18888>; FDE=(13722778, 13722810)
      d1649a:	53                   	push   rbx
      d1649b:	48 89 fb             	mov    rbx,rdi
      d1649e:	6a 10                	push   0x10
      d164a0:	5f                   	pop    rdi
      d164a1:	e8 5a 7a ad 00       	call   17edf00 <_Znwm@plt>
      d164a6:	48 8d 0d 1b c7 b0 00 	lea    rcx,[rip+0xb0c71b]        # 1822bc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18888>
      d164ad:	48 89 08             	mov    QWORD PTR [rax],rcx
      d164b0:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      d164b4:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      d164b8:	5b                   	pop    rbx
      d164b9:	c3                   	ret
      d164ba:	48 8d 05 07 c7 b0 00 	lea    rax,[rip+0xb0c707]        # 1822bc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18888>
      d164c1:	48 89 06             	mov    QWORD PTR [rsi],rax
      d164c4:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]

### 0xd164ba: lea    rax,[rip+0xb0c707]        # 1822bc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18888>; FDE=(13722810, 13722829)
      d164ad:	48 89 08             	mov    QWORD PTR [rax],rcx
      d164b0:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      d164b4:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      d164b8:	5b                   	pop    rbx
      d164b9:	c3                   	ret
      d164ba:	48 8d 05 07 c7 b0 00 	lea    rax,[rip+0xb0c707]        # 1822bc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18888>
      d164c1:	48 89 06             	mov    QWORD PTR [rsi],rax
      d164c4:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      d164c8:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d164cc:	c3                   	ret
      d164cd:	cc                   	int3
      d164ce:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      d164d1:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      d164d5:	48 8b b8 08 04 00 00 	mov    rdi,QWORD PTR [rax+0x408]

### 0xd16a1b: lea    rax,[rip+0xb7d8be]        # 18942e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1220>; FDE=(13724132, 13724469)
      d16a07:	83 ca 0a             	or     edx,0xa
      d16a0a:	e8 5f 81 00 00       	call   d1eb6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26bb0e>
      d16a0f:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d16a14:	48 83 67 f0 00       	and    QWORD PTR [rdi-0x10],0x0
      d16a19:	89 c3                	mov    ebx,eax
      d16a1b:	48 8d 05 be d8 b7 00 	lea    rax,[rip+0xb7d8be]        # 18942e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1220>
      d16a22:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      d16a26:	48 8d 05 cb 8d 72 ff 	lea    rax,[rip+0xffffffffff728dcb]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d16a2d:	48 89 07             	mov    QWORD PTR [rdi],rax
      d16a30:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d16a34:	48 c7 47 f8 01 00 00 	mov    QWORD PTR [rdi-0x8],0x1
      d16a3b:	00 
      d16a3c:	4c 89 fe             	mov    rsi,r15
      d16a3f:	31 d2                	xor    edx,edx

### 0xd178cb: lea    rax,[rip+0xb7ca0e]        # 18942e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1220>; FDE=(13726914, 13728354)
      d178b3:	80 7c 24 0f 00       	cmp    BYTE PTR [rsp+0xf],0x0
      d178b8:	0f 84 b9 00 00 00    	je     d17977 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264917>
      d178be:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      d178c5:	00 
      d178c6:	48 83 67 f0 00       	and    QWORD PTR [rdi-0x10],0x0
      d178cb:	48 8d 05 0e ca b7 00 	lea    rax,[rip+0xb7ca0e]        # 18942e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1220>
      d178d2:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      d178d6:	48 8d 05 1b 7f 72 ff 	lea    rax,[rip+0xffffffffff727f1b]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d178dd:	48 89 07             	mov    QWORD PTR [rdi],rax
      d178e0:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d178e4:	48 c7 47 f8 01 00 00 	mov    QWORD PTR [rdi-0x8],0x1
      d178eb:	00 
      d178ec:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      d178f1:	31 d2                	xor    edx,edx

### 0xd18200: lea    rax,[rip+0xb7c0d9]        # 18942e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1220>; FDE=(13730106, 13730882)
      d181e9:	4c 0f 44 44 24 10    	cmove  r8,QWORD PTR [rsp+0x10]
      d181ef:	4c 89 44 24 18       	mov    QWORD PTR [rsp+0x18],r8
      d181f4:	0f 94 41 15          	sete   BYTE PTR [rcx+0x15]
      d181f8:	0f 57 c0             	xorps  xmm0,xmm0
      d181fb:	0f 11 44 24 50       	movups XMMWORD PTR [rsp+0x50],xmm0
      d18200:	48 8d 05 d9 c0 b7 00 	lea    rax,[rip+0xb7c0d9]        # 18942e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1220>
      d18207:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      d1820c:	48 8d 05 e5 75 72 ff 	lea    rax,[rip+0xffffffffff7275e5]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d18213:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      d18218:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      d1821d:	44 89 e6             	mov    esi,r12d
      d18220:	e8 0f 71 00 00       	call   d1f334 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c2d4>
      d18225:	80 4c 24 58 01       	or     BYTE PTR [rsp+0x58],0x1
      d1822a:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]

### 0xd18969: lea    rax,[rip+0xb7e038]        # 18969a8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x38e8>; FDE=(13731858, 13738390)
      d18952:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
      d18957:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d1895b:	48 8d 6c 24 68       	lea    rbp,[rsp+0x68]
      d18960:	48 83 65 00 00       	and    QWORD PTR [rbp+0x0],0x0
      d18965:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
      d18969:	48 8d 05 38 e0 b7 00 	lea    rax,[rip+0xb7e038]        # 18969a8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x38e8>
      d18970:	48 8d 8c 24 80 02 00 	lea    rcx,[rsp+0x280]
      d18977:	00 
      d18978:	48 89 81 60 ff ff ff 	mov    QWORD PTR [rcx-0xa0],rax
      d1897f:	66 0f ef c0          	pxor   xmm0,xmm0
      d18983:	f3 0f 7f 81 70 ff ff 	movdqu XMMWORD PTR [rcx-0x90],xmm0
      d1898a:	ff 
      d1898b:	f3 0f 7f 41 80       	movdqu XMMWORD PTR [rcx-0x80],xmm0
      d18990:	f3 0f 7f 41 90       	movdqu XMMWORD PTR [rcx-0x70],xmm0

### 0xd190b1: lea    rax,[rip+0xb7b150]        # 1894208 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1148>; FDE=(13731858, 13738390)
      d1909d:	31 c0                	xor    eax,eax
      d1909f:	e8 2e d8 ab 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      d190a4:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
      d190ab:	00 
      d190ac:	48 83 67 f0 00       	and    QWORD PTR [rdi-0x10],0x0
      d190b1:	48 8d 05 50 b1 b7 00 	lea    rax,[rip+0xb7b150]        # 1894208 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1148>
      d190b8:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      d190bc:	48 8d 05 35 67 72 ff 	lea    rax,[rip+0xffffffffff726735]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d190c3:	48 89 07             	mov    QWORD PTR [rdi],rax
      d190c6:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d190ca:	48 c7 47 10 02 00 00 	mov    QWORD PTR [rdi+0x10],0x2
      d190d1:	00 
      d190d2:	48 c7 47 f8 05 00 00 	mov    QWORD PTR [rdi-0x8],0x5
      d190d9:	00 

### 0xd19149: lea    rax,[rip+0xb09f98]        # 18230e8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18da8>; FDE=(13731858, 13738390)
      d19136:	00 
      d19137:	e8 a8 58 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d1913c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      d19143:	00 
      d19144:	e8 df 65 a9 00       	call   17af728 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163894>
      d19149:	48 8d 05 98 9f b0 00 	lea    rax,[rip+0xb09f98]        # 18230e8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18da8>
      d19150:	48 8d 8c 24 10 02 00 	lea    rcx,[rsp+0x210]
      d19157:	00 
      d19158:	48 89 41 d0          	mov    QWORD PTR [rcx-0x30],rax
      d1915c:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
      d19161:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
      d19165:	4c 89 71 f0          	mov    QWORD PTR [rcx-0x10],r14
      d19169:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0
      d1916d:	48 8d 84 24 48 02 00 	lea    rax,[rsp+0x248]

### 0xd19323: mov    rdi,QWORD PTR [rip+0xbcdac6]        # 18e6df0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e200>; FDE=(13731858, 13738390)
      d19315:	00 
      d19316:	48 8b bc 24 a8 02 00 	mov    rdi,QWORD PTR [rsp+0x2a8]
      d1931d:	00 
      d1931e:	48 85 ff             	test   rdi,rdi
      d19321:	75 2b                	jne    d1934e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2662ee>
      d19323:	48 8b 3d c6 da bc 00 	mov    rdi,QWORD PTR [rip+0xbcdac6]        # 18e6df0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e200>
      d1932a:	48 85 ff             	test   rdi,rdi
      d1932d:	75 1f                	jne    d1934e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2662ee>
      d1932f:	48 8d 3d 82 da bc 00 	lea    rdi,[rip+0xbcda82]        # 18e6db8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1c8>
      d19336:	ff 15 a4 da bc 00    	call   QWORD PTR [rip+0xbcdaa4]        # 18e6de0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1f0>
      d1933c:	48 89 c7             	mov    rdi,rax
      d1933f:	48 89 05 aa da bc 00 	mov    QWORD PTR [rip+0xbcdaaa],rax        # 18e6df0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e200>
      d19346:	49 8b 84 24 00 04 00 	mov    rax,QWORD PTR [r12+0x400]
      d1934d:	00 

### 0xd1932f: lea    rdi,[rip+0xbcda82]        # 18e6db8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1c8>; FDE=(13731858, 13738390)
      d1931e:	48 85 ff             	test   rdi,rdi
      d19321:	75 2b                	jne    d1934e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2662ee>
      d19323:	48 8b 3d c6 da bc 00 	mov    rdi,QWORD PTR [rip+0xbcdac6]        # 18e6df0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e200>
      d1932a:	48 85 ff             	test   rdi,rdi
      d1932d:	75 1f                	jne    d1934e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2662ee>
      d1932f:	48 8d 3d 82 da bc 00 	lea    rdi,[rip+0xbcda82]        # 18e6db8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1c8>
      d19336:	ff 15 a4 da bc 00    	call   QWORD PTR [rip+0xbcdaa4]        # 18e6de0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1f0>
      d1933c:	48 89 c7             	mov    rdi,rax
      d1933f:	48 89 05 aa da bc 00 	mov    QWORD PTR [rip+0xbcdaaa],rax        # 18e6df0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e200>
      d19346:	49 8b 84 24 00 04 00 	mov    rax,QWORD PTR [r12+0x400]
      d1934d:	00 
      d1934e:	48 89 c6             	mov    rsi,rax
      d19351:	e8 35 56 00 00       	call   d1e98b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26b92b>
      d19356:	4c 89 e7             	mov    rdi,r12

### 0xd19336: call   QWORD PTR [rip+0xbcdaa4]        # 18e6de0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1f0>; FDE=(13731858, 13738390)
      d19321:	75 2b                	jne    d1934e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2662ee>
      d19323:	48 8b 3d c6 da bc 00 	mov    rdi,QWORD PTR [rip+0xbcdac6]        # 18e6df0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e200>
      d1932a:	48 85 ff             	test   rdi,rdi
      d1932d:	75 1f                	jne    d1934e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2662ee>
      d1932f:	48 8d 3d 82 da bc 00 	lea    rdi,[rip+0xbcda82]        # 18e6db8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1c8>
      d19336:	ff 15 a4 da bc 00    	call   QWORD PTR [rip+0xbcdaa4]        # 18e6de0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1f0>
      d1933c:	48 89 c7             	mov    rdi,rax
      d1933f:	48 89 05 aa da bc 00 	mov    QWORD PTR [rip+0xbcdaaa],rax        # 18e6df0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e200>
      d19346:	49 8b 84 24 00 04 00 	mov    rax,QWORD PTR [r12+0x400]
      d1934d:	00 
      d1934e:	48 89 c6             	mov    rsi,rax
      d19351:	e8 35 56 00 00       	call   d1e98b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26b92b>
      d19356:	4c 89 e7             	mov    rdi,r12
      d19359:	e8 00 57 00 00       	call   d1ea5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26b9fe>

### 0xd1933f: mov    QWORD PTR [rip+0xbcdaaa],rax        # 18e6df0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e200>; FDE=(13731858, 13738390)
      d1932a:	48 85 ff             	test   rdi,rdi
      d1932d:	75 1f                	jne    d1934e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2662ee>
      d1932f:	48 8d 3d 82 da bc 00 	lea    rdi,[rip+0xbcda82]        # 18e6db8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1c8>
      d19336:	ff 15 a4 da bc 00    	call   QWORD PTR [rip+0xbcdaa4]        # 18e6de0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e1f0>
      d1933c:	48 89 c7             	mov    rdi,rax
      d1933f:	48 89 05 aa da bc 00 	mov    QWORD PTR [rip+0xbcdaaa],rax        # 18e6df0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2e200>
      d19346:	49 8b 84 24 00 04 00 	mov    rax,QWORD PTR [r12+0x400]
      d1934d:	00 
      d1934e:	48 89 c6             	mov    rsi,rax
      d19351:	e8 35 56 00 00       	call   d1e98b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26b92b>
      d19356:	4c 89 e7             	mov    rdi,r12
      d19359:	e8 00 57 00 00       	call   d1ea5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26b9fe>
      d1935e:	83 bc 24 00 02 00 00 	cmp    DWORD PTR [rsp+0x200],0x0
      d19365:	00 

### 0xd195f6: lea    rax,[rip+0xb7ace3]        # 18942e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1220>; FDE=(13731858, 13738390)
      d195e5:	5e                   	pop    rsi
      d195e6:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d195e9:	66 0f ef c0          	pxor   xmm0,xmm0
      d195ed:	f3 0f 7f 84 24 78 01 	movdqu XMMWORD PTR [rsp+0x178],xmm0
      d195f4:	00 00 
      d195f6:	48 8d 05 e3 ac b7 00 	lea    rax,[rip+0xb7ace3]        # 18942e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1220>
      d195fd:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
      d19604:	00 
      d19605:	4c 89 b4 24 88 01 00 	mov    QWORD PTR [rsp+0x188],r14
      d1960c:	00 
      d1960d:	4c 89 b4 24 90 01 00 	mov    QWORD PTR [rsp+0x190],r14
      d19614:	00 
      d19615:	4c 89 ef             	mov    rdi,r13
      d19618:	44 89 e6             	mov    esi,r12d

### 0xd19afc: lea    rax,[rip+0xb7a705]        # 1894208 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1148>; FDE=(13731858, 13738390)
      d19ae5:	48 8d 0d 85 48 61 ff 	lea    rcx,[rip+0xffffffffff614885]        # 32e371 <_ZTSSt12bad_any_cast@@Base-0x61e57>
      d19aec:	31 c0                	xor    eax,eax
      d19aee:	e8 df cd ab 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      d19af3:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
      d19afa:	00 00 
      d19afc:	48 8d 05 05 a7 b7 00 	lea    rax,[rip+0xb7a705]        # 1894208 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1148>
      d19b03:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      d19b0a:	00 
      d19b0b:	48 8d 05 e6 5c 72 ff 	lea    rax,[rip+0xffffffffff725ce6]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d19b12:	48 89 84 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rax
      d19b19:	00 
      d19b1a:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
      d19b21:	00 
      d19b22:	48 c7 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],0x21

## Direct calls to getter 0xd17212 and immediate result use
## Candidate dependency-vtable address points by +0x68 callable shape
- address point 0x1800098: codeSlots=9, +0x68=0xaaab0e, FDE=(11184910, 11184933)
- address point 0x18000a0: codeSlots=10, +0x68=0xaaab26, FDE=(11184934, 11184952)
- address point 0x18000a8: codeSlots=11, +0x68=0x174ec6a, FDE=(24439914, 24439919)
- address point 0x18000c0: codeSlots=12, +0x68=0x174ef82, FDE=(24440706, 24441307)
- address point 0x18000d8: codeSlots=12, +0x68=0xaaa9b2, FDE=(11184562, 11184571)
- address point 0x18000e0: codeSlots=12, +0x68=0xaaa9bc, FDE=(11184572, 11184594)
- address point 0x18000e8: codeSlots=12, +0x68=0x174ec6a, FDE=(24439914, 24439919)
- address point 0x1800100: codeSlots=12, +0x68=0x174ef82, FDE=(24440706, 24441307)
- address point 0x1800118: codeSlots=12, +0x68=0xabe9e4, FDE=(11266532, 11266564)
- address point 0x1800120: codeSlots=12, +0x68=0xabea04, FDE=(11266564, 11266582)
- address point 0x1800128: codeSlots=12, +0x68=0x174ec6a, FDE=(24439914, 24439919)
- address point 0x1800140: codeSlots=12, +0x68=0x174ef82, FDE=(24440706, 24441307)
- address point 0x1800158: codeSlots=12, +0x68=0xaaab0e, FDE=(11184910, 11184933)
- address point 0x1800160: codeSlots=12, +0x68=0xaaab26, FDE=(11184934, 11184952)
- address point 0x1800168: codeSlots=12, +0x68=0x174ec6a, FDE=(24439914, 24439919)
- address point 0x1800180: codeSlots=12, +0x68=0x174ef82, FDE=(24440706, 24441307)
- address point 0x1800198: codeSlots=12, +0x68=0xac10b0, FDE=(11276464, 11276561)
- address point 0x18001a0: codeSlots=12, +0x68=0xac1112, FDE=(11276562, 11276580)
- address point 0x18001a8: codeSlots=12, +0x68=0x174ec6a, FDE=(24439914, 24439919)
- address point 0x18001c0: codeSlots=12, +0x68=0x174ef82, FDE=(24440706, 24441307)
- address point 0x1800300: codeSlots=8, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800328: codeSlots=9, +0x68=0xac3ba0, FDE=(11287456, 11287564)
- address point 0x1800330: codeSlots=10, +0x68=0xac3c0c, FDE=(11287564, 11287582)
- address point 0x1800338: codeSlots=10, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800340: codeSlots=11, +0x68=0xac3c1e, FDE=(11287582, 11287590)
- address point 0x1800348: codeSlots=12, +0x68=0xac3c26, FDE=(11287590, 11287834)
- address point 0x1800370: codeSlots=12, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800378: codeSlots=12, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800390: codeSlots=14, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800398: codeSlots=13, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x18003a0: codeSlots=12, +0x68=0xac3b8a, FDE=(11287434, 11287456)
- address point 0x18003b8: codeSlots=12, +0x68=0xac3ae6, FDE=(11287270, 11287285)
- address point 0x18003c0: codeSlots=11, +0x68=0xac3af6, FDE=(11287286, 11287304)
- address point 0x18003d8: codeSlots=11, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x18003f0: codeSlots=11, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x18003f8: codeSlots=11, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800400: codeSlots=11, +0x68=0xac4414, FDE=(11289620, 11289641)
- address point 0x1800408: codeSlots=11, +0x68=0xac442a, FDE=(11289642, 11289653)
- address point 0x1800420: codeSlots=11, +0x68=0xac4436, FDE=(11289654, 11290539)
- address point 0x1800438: codeSlots=11, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800440: codeSlots=12, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800458: codeSlots=14, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800460: codeSlots=13, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800468: codeSlots=12, +0x68=0xac4408, FDE=(11289608, 11289620)
- address point 0x1800480: codeSlots=12, +0x68=0xaa0bd8, FDE=(11144152, 11144157)
- address point 0x1800488: codeSlots=12, +0x68=0xaa0bde, FDE=(11144158, 11144176)
- address point 0x18004a0: codeSlots=14, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x18004a8: codeSlots=13, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x18004b0: codeSlots=12, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x18004c8: codeSlots=12, +0x68=0xaa0ca6, FDE=(11144358, 11144367)
- address point 0x18004d0: codeSlots=12, +0x68=0xaa0cb0, FDE=(11144368, 11144377)
- address point 0x18004e8: codeSlots=13, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x18004f0: codeSlots=12, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800508: codeSlots=12, +0x68=0xac487c, FDE=(11290748, 11290763)
- address point 0x1800510: codeSlots=11, +0x68=0xac488c, FDE=(11290764, 11290782)
- address point 0x1800518: codeSlots=11, +0x68=0xac489e, FDE=(11290782, 11290791)
- address point 0x1800540: codeSlots=11, +0x68=0xac4e58, FDE=(11292248, 11292463)
- address point 0x1800548: codeSlots=11, +0x68=0xac4f30, FDE=(11292464, 11292482)
- address point 0x1800550: codeSlots=11, +0x68=0xac4f42, FDE=(11292482, 11292596)
- address point 0x1800558: codeSlots=10, +0x68=0xac4fb4, FDE=(11292596, 11292794)
- address point 0x1800578: codeSlots=11, +0x68=0xac50e4, FDE=(11292900, 11292909)
- address point 0x1800580: codeSlots=11, +0x68=0xac50ee, FDE=(11292910, 11292919)
- address point 0x1800588: codeSlots=10, +0x68=0xac50f8, FDE=(11292920, 11292929)
- address point 0x1800590: codeSlots=10, +0x68=0xac5102, FDE=(11292930, 11292948)
- address point 0x18005a8: codeSlots=12, +0x68=0xac4c26, FDE=(11291686, 11291705)
- address point 0x18005b0: codeSlots=12, +0x68=0xac4c3a, FDE=(11291706, 11291724)
- address point 0x18005b8: codeSlots=11, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x18005c0: codeSlots=10, +0x68=0xac4c4c, FDE=(11291724, 11291853)
- address point 0x18005e0: codeSlots=12, +0x68=0xac5248, FDE=(11293256, 11293274)
- address point 0x18005e8: codeSlots=12, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x18005f0: codeSlots=12, +0x68=0xac525a, FDE=(11293274, 11293375)
- address point 0x18005f8: codeSlots=11, +0x68=0xac52c0, FDE=(11293376, 11293631)
- address point 0x1800618: codeSlots=12, +0x68=0xac5e98, FDE=(11296408, 11296623)
- address point 0x1800620: codeSlots=12, +0x68=0xac5f70, FDE=(11296624, 11296642)
- address point 0x1800628: codeSlots=12, +0x68=0xac5f82, FDE=(11296642, 11296756)
- address point 0x1800650: codeSlots=12, +0x68=0xac60ba, FDE=(11296954, 11296963)
- address point 0x1800658: codeSlots=12, +0x68=0xac60c4, FDE=(11296964, 11296973)
- address point 0x1800660: codeSlots=11, +0x68=0xac60ce, FDE=(11296974, 11296983)
- address point 0x1800668: codeSlots=10, +0x68=0xac5102, FDE=(11292930, 11292948)
- address point 0x1800680: codeSlots=12, +0x68=0xac5ca8, FDE=(11295912, 11295931)
- address point 0x1800688: codeSlots=12, +0x68=0xac5cbc, FDE=(11295932, 11295950)
- address point 0x1800690: codeSlots=11, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800698: codeSlots=10, +0x68=0xac5cce, FDE=(11295950, 11296079)
- address point 0x18006b8: codeSlots=12, +0x68=0xac6156, FDE=(11297110, 11297128)
- address point 0x18006c0: codeSlots=12, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x18006c8: codeSlots=12, +0x68=0xac6168, FDE=(11297128, 11297229)
- address point 0x18006d0: codeSlots=11, +0x68=0xac61ce, FDE=(11297230, 11297485)
- address point 0x18006f8: codeSlots=9, +0x68=0xac6a72, FDE=(11299442, 11307271)
- address point 0x1800718: codeSlots=11, +0x68=0xac97ea, FDE=(11311082, 11311100)
- address point 0x1800720: codeSlots=11, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800728: codeSlots=11, +0x68=0xac97fc, FDE=(11311100, 11311504)
- address point 0x1800730: codeSlots=11, +0x68=0xac9990, FDE=(11311504, 11311525)
- address point 0x1800738: codeSlots=11, +0x68=0xac99a6, FDE=(11311526, 11311700)
- address point 0x1800740: codeSlots=11, +0x68=0xac9a54, FDE=(11311700, 11311856)
- address point 0x1800750: codeSlots=12, +0x68=0xac9b5a, FDE=(11311962, 11311983)
- address point 0x1800758: codeSlots=12, +0x68=0xac9b70, FDE=(11311984, 11312081)
- address point 0x1800760: codeSlots=12, +0x68=0xac9bd2, FDE=(11312082, 11312339)
- address point 0x1800778: codeSlots=14, +0x68=0xaa0bd8, FDE=(11144152, 11144157)
- address point 0x1800780: codeSlots=14, +0x68=0xaa0bde, FDE=(11144158, 11144176)
- address point 0x1800788: codeSlots=14, +0x68=0xac8a1e, FDE=(11307550, 11307807)
- address point 0x1800790: codeSlots=14, +0x68=0xac8b20, FDE=(11307808, 11308431)
- address point 0x1800798: codeSlots=14, +0x68=0xac8d90, FDE=(11308432, 11308584)
- address point 0x18007a0: codeSlots=14, +0x68=0xac8e28, FDE=(11308584, 11308958)
- address point 0x18007a8: codeSlots=14, +0x68=0xac8f9e, FDE=(11308958, 11309240)
- address point 0x18007b0: codeSlots=14, +0x68=0xac90b8, FDE=(11309240, 11309460)
- address point 0x18007b8: codeSlots=14, +0x68=0xac9194, FDE=(11309460, 11309627)
- address point 0x18007c0: codeSlots=13, +0x68=0xac923c, FDE=(11309628, 11309843)
- address point 0x18007c8: codeSlots=12, +0x68=0xac9314, FDE=(11309844, 11310514)
- address point 0x18007e0: codeSlots=14, +0x68=0xaa0ca6, FDE=(11144358, 11144367)
- address point 0x18007e8: codeSlots=14, +0x68=0xaa0cb0, FDE=(11144368, 11144377)
- address point 0x18007f0: codeSlots=14, +0x68=0xac95b2, FDE=(11310514, 11310523)
- address point 0x18007f8: codeSlots=14, +0x68=0xac95bc, FDE=(11310524, 11310533)
- address point 0x1800800: codeSlots=14, +0x68=0xac95c6, FDE=(11310534, 11310552)
- address point 0x1800808: codeSlots=14, +0x68=0xac95d8, FDE=(11310552, 11310561)
- address point 0x1800810: codeSlots=14, +0x68=0xac95e2, FDE=(11310562, 11310571)
- address point 0x1800818: codeSlots=14, +0x68=0xac95ec, FDE=(11310572, 11310581)
- address point 0x1800820: codeSlots=13, +0x68=0xac95f6, FDE=(11310582, 11310591)
- address point 0x1800828: codeSlots=12, +0x68=0xac9600, FDE=(11310592, 11310610)
- address point 0x1800848: codeSlots=13, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800850: codeSlots=12, +0x68=0xac9d46, FDE=(11312454, 11320510)
- address point 0x1800868: codeSlots=12, +0x68=0xacc7aa, FDE=(11323306, 11323321)
- address point 0x1800870: codeSlots=11, +0x68=0xacc7ba, FDE=(11323322, 11323340)
- address point 0x1800878: codeSlots=11, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800888: codeSlots=9, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x18008a8: codeSlots=11, +0x68=0xacc504, FDE=(11322628, 11322646)
- address point 0x18008b0: codeSlots=11, +0x68=0xacc516, FDE=(11322646, 11322654)
- address point 0x18008b8: codeSlots=11, +0x68=0xacc51e, FDE=(11322654, 11322662)
- address point 0x18008d0: codeSlots=13, +0x68=0xacc64a, FDE=(11322954, 11322962)
- address point 0x18008d8: codeSlots=13, +0x68=0xacc652, FDE=(11322962, 11323087)
- address point 0x18008e0: codeSlots=13, +0x68=0xacc6d0, FDE=(11323088, 11323153)
- address point 0x18008e8: codeSlots=13, +0x68=0xacc712, FDE=(11323154, 11323183)
- address point 0x18008f0: codeSlots=14, +0x68=0xacc730, FDE=(11323184, 11323202)
- address point 0x1800908: codeSlots=14, +0x68=0xacc730, FDE=(11323184, 11323202)
- address point 0x1800920: codeSlots=13, +0x68=0xacc752, FDE=(11323218, 11323227)
- address point 0x1800928: codeSlots=12, +0x68=0xacc75c, FDE=(11323228, 11323237)
- address point 0x1800940: codeSlots=12, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800948: codeSlots=11, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800950: codeSlots=10, +0x68=0xacc824, FDE=(11323428, 11332417)
- address point 0x1800968: codeSlots=10, +0x68=0xacf0e4, FDE=(11333860, 11333952)
- address point 0x1800970: codeSlots=10, +0x68=0xacf140, FDE=(11333952, 11333970)
- address point 0x1800988: codeSlots=12, +0x68=0xacf158, FDE=(11333976, 11333981)
- address point 0x1800990: codeSlots=11, +0x68=0xacf15e, FDE=(11333982, 11334091)
- address point 0x18009b0: codeSlots=11, +0x68=0xacf22c, FDE=(11334188, 11334197)
- address point 0x18009b8: codeSlots=10, +0x68=0xacf236, FDE=(11334198, 11334207)
- address point 0x18009d0: codeSlots=12, +0x68=0xacef58, FDE=(11333464, 11333483)
- address point 0x18009d8: codeSlots=12, +0x68=0xacef6c, FDE=(11333484, 11333502)
- address point 0x18009e0: codeSlots=12, +0x68=0xacef7e, FDE=(11333502, 11333662)
- address point 0x18009e8: codeSlots=12, +0x68=0xacf01e, FDE=(11333662, 11333688)
- address point 0x18009f0: codeSlots=12, +0x68=0xacef26, FDE=(11333414, 11333423)
- address point 0x18009f8: codeSlots=11, +0x68=0xacef30, FDE=(11333424, 11333446)
- address point 0x1800a00: codeSlots=10, +0x68=0xacef46, FDE=(11333446, 11333464)
- address point 0x1800a18: codeSlots=12, +0x68=0xacee46, FDE=(11333190, 11333209)
- address point 0x1800a20: codeSlots=12, +0x68=0xacee5a, FDE=(11333210, 11333228)
- address point 0x1800a38: codeSlots=14, +0x68=0xacef26, FDE=(11333414, 11333423)
- address point 0x1800a40: codeSlots=13, +0x68=0xacef30, FDE=(11333424, 11333446)
- address point 0x1800a48: codeSlots=12, +0x68=0xacef46, FDE=(11333446, 11333464)
- address point 0x1800a60: codeSlots=12, +0x68=0xad09a6, FDE=(11340198, 11340295)
- address point 0x1800a68: codeSlots=12, +0x68=0xad0a08, FDE=(11340296, 11340314)
- address point 0x1800a80: codeSlots=14, +0x68=0xad0a32, FDE=(11340338, 11340664)
- address point 0x1800a88: codeSlots=14, +0x68=0xad0b78, FDE=(11340664, 11340707)
- address point 0x1800a90: codeSlots=14, +0x68=0xad0ba4, FDE=(11340708, 11340856)
- address point 0x1800a98: codeSlots=13, +0x68=0xaa712a, FDE=(11170090, 11170095)
- address point 0x1800aa0: codeSlots=12, +0x68=0xad0c38, FDE=(11340856, 11340979)
- address point 0x1800ad8: codeSlots=12, +0x68=0xad0f6a, FDE=(11341674, 11341689)
- address point 0x1800ae0: codeSlots=11, +0x68=0xad0f7a, FDE=(11341690, 11341708)
- address point 0x1800ae8: codeSlots=11, +0x68=0xad0f8c, FDE=(11341708, 11341717)
- address point 0x1800af8: codeSlots=9, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800b20: codeSlots=11, +0x68=0xad0f0c, FDE=(11341580, 11341626)
- address point 0x1800b28: codeSlots=11, +0x68=0xad0f3a, FDE=(11341626, 11341663)
- address point 0x1800b40: codeSlots=11, +0x68=0xad0f60, FDE=(11341664, 11341673)
- address point 0x1800b58: codeSlots=11, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800b60: codeSlots=11, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800b80: codeSlots=12, +0x68=0xaa0bd8, FDE=(11144152, 11144157)
- address point 0x1800b88: codeSlots=12, +0x68=0xaa0bde, FDE=(11144158, 11144176)
- address point 0x1800b90: codeSlots=12, +0x68=0xad1048, FDE=(11341896, 11341926)
- address point 0x1800b98: codeSlots=11, +0x68=0xad1066, FDE=(11341926, 11342231)
- address point 0x1800ba0: codeSlots=10, +0x68=0xad1198, FDE=(11342232, 11342261)
- address point 0x1800bc0: codeSlots=12, +0x68=0xaa0cb0, FDE=(11144368, 11144377)
- address point 0x1800bc8: codeSlots=12, +0x68=0xad11b6, FDE=(11342262, 11342271)
- address point 0x1800bd0: codeSlots=11, +0x68=0xad11c0, FDE=(11342272, 11342281)
- address point 0x1800bf0: codeSlots=12, +0x68=0xad11de, FDE=(11342302, 11342321)
- address point 0x1800bf8: codeSlots=12, +0x68=0xad11f2, FDE=(11342322, 11342340)
- address point 0x1800c00: codeSlots=11, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800c08: codeSlots=10, +0x68=0xad1204, FDE=(11342340, 11342349)
- address point 0x1800c28: codeSlots=9, +0x68=0xad178a, FDE=(11343754, 11343773)
- address point 0x1800cf0: codeSlots=8, +0x68=0xad5bf8, FDE=(11361272, 11361294)
- address point 0x1800cf8: codeSlots=8, +0x68=0xad5c0e, FDE=(11361294, 11361306)
- address point 0x1800d00: codeSlots=9, +0x68=0xad5c1a, FDE=(11361306, 11361316)
- address point 0x1800d08: codeSlots=10, +0x68=0xad5c24, FDE=(11361316, 11361351)
- address point 0x1800d10: codeSlots=10, +0x68=0xad5c48, FDE=(11361352, 11361481)
- address point 0x1800d18: codeSlots=11, +0x68=0xad5cca, FDE=(11361482, 11361611)
- address point 0x1800d20: codeSlots=12, +0x68=0xad5d4c, FDE=(11361612, 11361637)
- address point 0x1800d28: codeSlots=12, +0x68=0xad5d66, FDE=(11361638, 11361673)
- address point 0x1800d30: codeSlots=13, +0x68=0xad5d8a, FDE=(11361674, 11361703)
- address point 0x1800d38: codeSlots=14, +0x68=0xad5da8, FDE=(11361704, 11361716)
- address point 0x1800d50: codeSlots=15, +0x68=0xad5dcc, FDE=(11361740, 11361770)
- address point 0x1800d58: codeSlots=14, +0x68=0xad5dea, FDE=(11361770, 11361861)
- address point 0x1800d70: codeSlots=14, +0x68=0xad55fe, FDE=(11359742, 11359761)
- address point 0x1800d78: codeSlots=14, +0x68=0xad5612, FDE=(11359762, 11359780)
- address point 0x1800d80: codeSlots=14, +0x68=0xad5624, FDE=(11359780, 11359826)
- address point 0x1800d88: codeSlots=14, +0x68=0xad5652, FDE=(11359826, 11359863)
- address point 0x1800d90: codeSlots=14, +0x68=0xaae9b2, FDE=(11200946, 11200955)
- address point 0x1800d98: codeSlots=13, +0x68=0xaae9bc, FDE=(11200956, 11200978)
- address point 0x1800da0: codeSlots=12, +0x68=0xad5678, FDE=(11359864, 11359882)
- address point 0x1800db8: codeSlots=12, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800dc0: codeSlots=12, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800dd8: codeSlots=14, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800de0: codeSlots=13, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800de8: codeSlots=12, +0x68=0xad5bd6, FDE=(11361238, 11361243)
- address point 0x1800e00: codeSlots=12, +0x68=0xad5b66, FDE=(11361126, 11361141)
- address point 0x1800e08: codeSlots=11, +0x68=0xad5b76, FDE=(11361142, 11361160)
- address point 0x1800e20: codeSlots=13, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800e28: codeSlots=13, +0x68=0xad5ab2, FDE=(11360946, 11360954)
- address point 0x1800e30: codeSlots=13, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800e38: codeSlots=13, +0x68=0xad5aba, FDE=(11360954, 11361007)
- address point 0x1800e40: codeSlots=13, +0x68=0xad5af0, FDE=(11361008, 11361048)
- address point 0x1800e48: codeSlots=13, +0x68=0xad5b18, FDE=(11361048, 11361079)
- address point 0x1800e50: codeSlots=13, +0x68=0xad5b38, FDE=(11361080, 11361115)
- address point 0x1800e78: codeSlots=13, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800e80: codeSlots=13, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800e88: codeSlots=14, +0x68=0xad55bc, FDE=(11359676, 11359708)
- address point 0x1800e90: codeSlots=14, +0x68=0xad55dc, FDE=(11359708, 11359727)
- address point 0x1800e98: codeSlots=14, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800ea0: codeSlots=13, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800ea8: codeSlots=12, +0x68=0xad55f0, FDE=(11359728, 11359741)
- address point 0x1800ec0: codeSlots=12, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800ec8: codeSlots=12, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800ee0: codeSlots=14, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800ee8: codeSlots=13, +0x68=0xa50370, FDE=(10814320, 10814325)
- address point 0x1800ef0: codeSlots=12, +0x68=0xad5592, FDE=(11359634, 11359676)
- address point 0x1800f08: codeSlots=12, +0x68=0xad6390, FDE=(11363216, 11363235)
- address point 0x1800f10: codeSlots=12, +0x68=0xad63a4, FDE=(11363236, 11363254)
- address point 0x1800f28: codeSlots=14, +0x68=0xad6470, FDE=(11363440, 11363449)
- address point 0x1800f30: codeSlots=14, +0x68=0xad647a, FDE=(11363450, 11363472)
- address point 0x1800f38: codeSlots=14, +0x68=0xad6490, FDE=(11363472, 11363845)
- address point 0x1800f40: codeSlots=14, +0x68=0xad73c2, FDE=(11367362, 11367373)
- address point 0x1800f48: codeSlots=14, +0x68=0x9d7de0, FDE=(10321376, 10321377)
- address point 0x1800f50: codeSlots=14, +0x68=0xad73ce, FDE=(11367374, 11367385)
- address point 0x1800f58: codeSlots=14, +0x68=0xad73da, FDE=(11367386, 11367487)
- address point 0x1800f70: codeSlots=15, +0x68=0xad7458, FDE=(11367512, 11367523)
- address point 0x1800f78: codeSlots=14, +0x68=0xad7464, FDE=(11367524, 11367575)
- address point 0x1800f90: codeSlots=14, +0x68=0xad6894, FDE=(11364500, 11364519)
- address point 0x1800f98: codeSlots=14, +0x68=0xad68a8, FDE=(11364520, 11364538)
- address point 0x1800fa0: codeSlots=14, +0x68=0xad68ba, FDE=(11364538, 11364698)
- address point 0x1800fa8: codeSlots=14, +0x68=0xad695a, FDE=(11364698, 11364724)
- address point 0x1800fb0: codeSlots=14, +0x68=0xad6974, FDE=(11364724, 11364733)
- address point 0x1800fb8: codeSlots=14, +0x68=0xad697e, FDE=(11364734, 11364756)
- address point 0x1800fc0: codeSlots=14, +0x68=0xad6994, FDE=(11364756, 11367180)
- address point 0x1800fc8: codeSlots=14, +0x68=0xad7934, FDE=(11368756, 11369101)
- address point 0x1800fd0: codeSlots=14, +0x68=0x9d7de0, FDE=(10321376, 10321377)
