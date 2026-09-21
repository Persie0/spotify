# Real service184 vtable ABI ranking

Only proven real-service constraints are used:
- +0x28: one-argument C++ method (rdi=this), returns persistent pointer dependency
- +0x30: one-argument C++ method (rdi=this), returns pointer
- +0x38: sret method (rdi=destination, rsi=this)
The previously assumed +0x20 constraint is excluded because it came from an unrelated raw +0x5c0 offset collision.

## score=109 address-point=0x18228d8
- +0x28 -> 0xd17212; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(13726226, 13726234)
      d17212:	48 8d 87 18 02 00 00 	lea    rax,[rdi+0x218]
      d17219:	c3                   	ret
- +0x30 -> 0xd1721a; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(13726234, 13726305)
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
- +0x38 -> 0xd17262; score=30; reads-this-rsi;writes-dest-rdi;saves-this-rsi;saves-dest-rdi; FDE=(13726306, 13726538)
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
- +0x68 -> 0xcc23d0 FDE=(13378512, 13378620)

## score=109 address-point=0x1821448
- +0x28 -> 0xb7d2ca; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12047050, 12047060)
      b7d2ca:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b7d2ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b7d2d1:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
- +0x30 -> 0xbd7f6a; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12418922, 12418932)
      bd7f6a:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd7f6e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd7f71:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
- +0x38 -> 0xcfa730; score=30; reads-this-rsi;writes-dest-rdi;saves-this-rsi;saves-dest-rdi; FDE=(13608752, 13608949)
      cfa730:	41 57                	push   r15
      cfa732:	41 56                	push   r14
      cfa734:	53                   	push   rbx
      cfa735:	48 83 ec 20          	sub    rsp,0x20
      cfa739:	48 89 f3             	mov    rbx,rsi
      cfa73c:	49 89 fe             	mov    r14,rdi
      cfa73f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cfa746:	00 00 
      cfa748:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      cfa74d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cfa750:	48 89 87 00 01 00 00 	mov    QWORD PTR [rdi+0x100],rax
      cfa757:	48 83 c7 10          	add    rdi,0x10
      cfa75b:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      cfa760:	c6 44 24 10 01       	mov    BYTE PTR [rsp+0x10],0x1
      cfa765:	e8 86 39 af 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
      cfa76a:	49 8b be f0 00 00 00 	mov    rdi,QWORD PTR [r14+0xf0]
      cfa771:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cfa774:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      cfa77a:	41 80 be e8 00 00 00 	cmp    BYTE PTR [r14+0xe8],0x0
      cfa781:	00 
      cfa782:	74 16                	je     cfa79a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24773a>
      cfa784:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
      cfa787:	49 8d be b8 00 00 00 	lea    rdi,[r14+0xb8]
      cfa78e:	e8 85 5f e7 ff       	call   b70718 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd6b8>
- +0x68 -> 0x123a2d8 FDE=(19112664, 19112674)

## score=106 address-point=0x1822988
- +0x28 -> 0xd1a440; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(13739072, 13739108)
      d1a440:	48 8b 87 08 04 00 00 	mov    rax,QWORD PTR [rdi+0x408]
      d1a447:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
      d1a44b:	48 85 ff             	test   rdi,rdi
      d1a44e:	74 13                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
      d1a450:	80 bf 98 00 00 00 00 	cmp    BYTE PTR [rdi+0x98],0x0
      d1a457:	74 0a                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
      d1a459:	80 7f 15 00          	cmp    BYTE PTR [rdi+0x15],0x0
      d1a45d:	0f 85 91 a5 00 00    	jne    d249f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271994>
      d1a463:	c3                   	ret
- +0x30 -> 0xaf6576; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(11494774, 11494779)
      af6576:	48 8d 47 08          	lea    rax,[rdi+0x8]
      af657a:	c3                   	ret
- +0x38 -> 0xd1a464; score=27; reads-this-rsi;writes-dest-rdi;saves-this-rsi; FDE=(13739108, 13741320)
      d1a464:	55                   	push   rbp
      d1a465:	41 57                	push   r15
      d1a467:	41 56                	push   r14
      d1a469:	41 55                	push   r13
      d1a46b:	41 54                	push   r12
      d1a46d:	53                   	push   rbx
      d1a46e:	48 81 ec 98 01 00 00 	sub    rsp,0x198
      d1a475:	48 89 54 24 48       	mov    QWORD PTR [rsp+0x48],rdx
      d1a47a:	48 89 f3             	mov    rbx,rsi
      d1a47d:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      d1a482:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d1a489:	00 00 
      d1a48b:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
      d1a492:	00 
      d1a493:	0f 57 c0             	xorps  xmm0,xmm0
      d1a496:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      d1a49d:	00 
      d1a49e:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      d1a4a1:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d1a4a6:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      d1a4aa:	48 2b 33             	sub    rsi,QWORD PTR [rbx]
      d1a4ad:	48 c1 fe 03          	sar    rsi,0x3
      d1a4b1:	e8 26 2f 00 00       	call   d1d3dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26a37c>
      d1a4b6:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
- +0x68 -> 0xd1b64a FDE=(13743690, 13743867)

## score=104 address-point=0x1886a60
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c56da; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22828762, 22828947)
     15c56da:	41 57                	push   r15
     15c56dc:	41 56                	push   r14
     15c56de:	41 55                	push   r13
     15c56e0:	41 54                	push   r12
     15c56e2:	53                   	push   rbx
     15c56e3:	48 83 ec 20          	sub    rsp,0x20
     15c56e7:	4d 89 c6             	mov    r14,r8
     15c56ea:	49 89 cf             	mov    r15,rcx
     15c56ed:	49 89 d4             	mov    r12,rdx
     15c56f0:	49 89 f5             	mov    r13,rsi
     15c56f3:	48 89 fb             	mov    rbx,rdi
     15c56f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c56fd:	00 00 
     15c56ff:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     15c5704:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     15c5709:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     15c570e:	8b 7e 48             	mov    edi,DWORD PTR [rsi+0x48]
     15c5711:	48 8b 76 58          	mov    rsi,QWORD PTR [rsi+0x58]
     15c5715:	e8 94 e2 0b 00       	call   16839ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b1a>
     15c571a:	84 c0                	test   al,al
     15c571c:	74 37                	je     15c5755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40acd9>
     15c571e:	49 8b 85 d8 00 00 00 	mov    rax,QWORD PTR [r13+0xd8]
     15c5725:	49 81 c5 e0 00 00 00 	add    r13,0xe0
     15c572c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=104 address-point=0x1886720
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c56da; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22828762, 22828947)
     15c56da:	41 57                	push   r15
     15c56dc:	41 56                	push   r14
     15c56de:	41 55                	push   r13
     15c56e0:	41 54                	push   r12
     15c56e2:	53                   	push   rbx
     15c56e3:	48 83 ec 20          	sub    rsp,0x20
     15c56e7:	4d 89 c6             	mov    r14,r8
     15c56ea:	49 89 cf             	mov    r15,rcx
     15c56ed:	49 89 d4             	mov    r12,rdx
     15c56f0:	49 89 f5             	mov    r13,rsi
     15c56f3:	48 89 fb             	mov    rbx,rdi
     15c56f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c56fd:	00 00 
     15c56ff:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     15c5704:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     15c5709:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     15c570e:	8b 7e 48             	mov    edi,DWORD PTR [rsi+0x48]
     15c5711:	48 8b 76 58          	mov    rsi,QWORD PTR [rsi+0x58]
     15c5715:	e8 94 e2 0b 00       	call   16839ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b1a>
     15c571a:	84 c0                	test   al,al
     15c571c:	74 37                	je     15c5755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40acd9>
     15c571e:	49 8b 85 d8 00 00 00 	mov    rax,QWORD PTR [r13+0xd8]
     15c5725:	49 81 c5 e0 00 00 00 	add    r13,0xe0
     15c572c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=104 address-point=0x1886498
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15d1ed4; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22879956, 22880057)
     15d1ed4:	41 57                	push   r15
     15d1ed6:	41 56                	push   r14
     15d1ed8:	41 55                	push   r13
     15d1eda:	41 54                	push   r12
     15d1edc:	53                   	push   rbx
     15d1edd:	4d 89 c4             	mov    r12,r8
     15d1ee0:	49 89 ce             	mov    r14,rcx
     15d1ee3:	49 89 d7             	mov    r15,rdx
     15d1ee6:	49 89 f5             	mov    r13,rsi
     15d1ee9:	48 89 fb             	mov    rbx,rdi
     15d1eec:	8b 7e 48             	mov    edi,DWORD PTR [rsi+0x48]
     15d1eef:	48 8b 76 58          	mov    rsi,QWORD PTR [rsi+0x58]
     15d1ef3:	e8 b6 1a 0b 00       	call   16839ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b1a>
     15d1ef8:	84 c0                	test   al,al
     15d1efa:	74 18                	je     15d1f14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x417498>
     15d1efc:	49 8b 75 40          	mov    rsi,QWORD PTR [r13+0x40]
     15d1f00:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15d1f03:	48 89 df             	mov    rdi,rbx
     15d1f06:	4c 89 fa             	mov    rdx,r15
     15d1f09:	4c 89 f1             	mov    rcx,r14
     15d1f0c:	4d 89 e0             	mov    r8,r12
     15d1f0f:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15d1f12:	eb 18                	jmp    15d1f2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4174b0>
     15d1f14:	48 8d 0d 61 00 e8 fe 	lea    rcx,[rip+0xfffffffffee80061]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=104 address-point=0x1885d70
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c56da; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22828762, 22828947)
     15c56da:	41 57                	push   r15
     15c56dc:	41 56                	push   r14
     15c56de:	41 55                	push   r13
     15c56e0:	41 54                	push   r12
     15c56e2:	53                   	push   rbx
     15c56e3:	48 83 ec 20          	sub    rsp,0x20
     15c56e7:	4d 89 c6             	mov    r14,r8
     15c56ea:	49 89 cf             	mov    r15,rcx
     15c56ed:	49 89 d4             	mov    r12,rdx
     15c56f0:	49 89 f5             	mov    r13,rsi
     15c56f3:	48 89 fb             	mov    rbx,rdi
     15c56f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c56fd:	00 00 
     15c56ff:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     15c5704:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     15c5709:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     15c570e:	8b 7e 48             	mov    edi,DWORD PTR [rsi+0x48]
     15c5711:	48 8b 76 58          	mov    rsi,QWORD PTR [rsi+0x58]
     15c5715:	e8 94 e2 0b 00       	call   16839ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b1a>
     15c571a:	84 c0                	test   al,al
     15c571c:	74 37                	je     15c5755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40acd9>
     15c571e:	49 8b 85 d8 00 00 00 	mov    rax,QWORD PTR [r13+0xd8]
     15c5725:	49 81 c5 e0 00 00 00 	add    r13,0xe0
     15c572c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=104 address-point=0x1885890
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c56da; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22828762, 22828947)
     15c56da:	41 57                	push   r15
     15c56dc:	41 56                	push   r14
     15c56de:	41 55                	push   r13
     15c56e0:	41 54                	push   r12
     15c56e2:	53                   	push   rbx
     15c56e3:	48 83 ec 20          	sub    rsp,0x20
     15c56e7:	4d 89 c6             	mov    r14,r8
     15c56ea:	49 89 cf             	mov    r15,rcx
     15c56ed:	49 89 d4             	mov    r12,rdx
     15c56f0:	49 89 f5             	mov    r13,rsi
     15c56f3:	48 89 fb             	mov    rbx,rdi
     15c56f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c56fd:	00 00 
     15c56ff:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     15c5704:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     15c5709:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     15c570e:	8b 7e 48             	mov    edi,DWORD PTR [rsi+0x48]
     15c5711:	48 8b 76 58          	mov    rsi,QWORD PTR [rsi+0x58]
     15c5715:	e8 94 e2 0b 00       	call   16839ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b1a>
     15c571a:	84 c0                	test   al,al
     15c571c:	74 37                	je     15c5755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40acd9>
     15c571e:	49 8b 85 d8 00 00 00 	mov    rax,QWORD PTR [r13+0xd8]
     15c5725:	49 81 c5 e0 00 00 00 	add    r13,0xe0
     15c572c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=104 address-point=0x1885470
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c56da; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22828762, 22828947)
     15c56da:	41 57                	push   r15
     15c56dc:	41 56                	push   r14
     15c56de:	41 55                	push   r13
     15c56e0:	41 54                	push   r12
     15c56e2:	53                   	push   rbx
     15c56e3:	48 83 ec 20          	sub    rsp,0x20
     15c56e7:	4d 89 c6             	mov    r14,r8
     15c56ea:	49 89 cf             	mov    r15,rcx
     15c56ed:	49 89 d4             	mov    r12,rdx
     15c56f0:	49 89 f5             	mov    r13,rsi
     15c56f3:	48 89 fb             	mov    rbx,rdi
     15c56f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c56fd:	00 00 
     15c56ff:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     15c5704:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     15c5709:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     15c570e:	8b 7e 48             	mov    edi,DWORD PTR [rsi+0x48]
     15c5711:	48 8b 76 58          	mov    rsi,QWORD PTR [rsi+0x58]
     15c5715:	e8 94 e2 0b 00       	call   16839ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b1a>
     15c571a:	84 c0                	test   al,al
     15c571c:	74 37                	je     15c5755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40acd9>
     15c571e:	49 8b 85 d8 00 00 00 	mov    rax,QWORD PTR [r13+0xd8]
     15c5725:	49 81 c5 e0 00 00 00 	add    r13,0xe0
     15c572c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=104 address-point=0x1884ed8
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c56da; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22828762, 22828947)
     15c56da:	41 57                	push   r15
     15c56dc:	41 56                	push   r14
     15c56de:	41 55                	push   r13
     15c56e0:	41 54                	push   r12
     15c56e2:	53                   	push   rbx
     15c56e3:	48 83 ec 20          	sub    rsp,0x20
     15c56e7:	4d 89 c6             	mov    r14,r8
     15c56ea:	49 89 cf             	mov    r15,rcx
     15c56ed:	49 89 d4             	mov    r12,rdx
     15c56f0:	49 89 f5             	mov    r13,rsi
     15c56f3:	48 89 fb             	mov    rbx,rdi
     15c56f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c56fd:	00 00 
     15c56ff:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     15c5704:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     15c5709:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     15c570e:	8b 7e 48             	mov    edi,DWORD PTR [rsi+0x48]
     15c5711:	48 8b 76 58          	mov    rsi,QWORD PTR [rsi+0x58]
     15c5715:	e8 94 e2 0b 00       	call   16839ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b1a>
     15c571a:	84 c0                	test   al,al
     15c571c:	74 37                	je     15c5755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40acd9>
     15c571e:	49 8b 85 d8 00 00 00 	mov    rax,QWORD PTR [r13+0xd8]
     15c5725:	49 81 c5 e0 00 00 00 	add    r13,0xe0
     15c572c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=104 address-point=0x1884c80
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c56da; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22828762, 22828947)
     15c56da:	41 57                	push   r15
     15c56dc:	41 56                	push   r14
     15c56de:	41 55                	push   r13
     15c56e0:	41 54                	push   r12
     15c56e2:	53                   	push   rbx
     15c56e3:	48 83 ec 20          	sub    rsp,0x20
     15c56e7:	4d 89 c6             	mov    r14,r8
     15c56ea:	49 89 cf             	mov    r15,rcx
     15c56ed:	49 89 d4             	mov    r12,rdx
     15c56f0:	49 89 f5             	mov    r13,rsi
     15c56f3:	48 89 fb             	mov    rbx,rdi
     15c56f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c56fd:	00 00 
     15c56ff:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     15c5704:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     15c5709:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     15c570e:	8b 7e 48             	mov    edi,DWORD PTR [rsi+0x48]
     15c5711:	48 8b 76 58          	mov    rsi,QWORD PTR [rsi+0x58]
     15c5715:	e8 94 e2 0b 00       	call   16839ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b1a>
     15c571a:	84 c0                	test   al,al
     15c571c:	74 37                	je     15c5755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40acd9>
     15c571e:	49 8b 85 d8 00 00 00 	mov    rax,QWORD PTR [r13+0xd8]
     15c5725:	49 81 c5 e0 00 00 00 	add    r13,0xe0
     15c572c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=104 address-point=0x181f788
- +0x28 -> 0xcc4eea; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(13389546, 13389554)
      cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
      cc4ef1:	c3                   	ret
- +0x30 -> 0xcc4eea; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(13389546, 13389554)
      cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
      cc4ef1:	c3                   	ret
- +0x38 -> 0xcc4ef2; score=25; reads-this-rsi;writes-dest-rdi;saves-dest-rdi; FDE=(13389554, 13389787)
      cc4ef2:	41 56                	push   r14
      cc4ef4:	53                   	push   rbx
      cc4ef5:	48 81 ec d8 02 00 00 	sub    rsp,0x2d8
      cc4efc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4f03:	00 00 
      cc4f05:	48 89 84 24 d0 02 00 	mov    QWORD PTR [rsp+0x2d0],rax
      cc4f0c:	00 
      cc4f0d:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
      cc4f10:	89 87 a0 06 00 00    	mov    DWORD PTR [rdi+0x6a0],eax
      cc4f16:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc4f19:	48 89 87 98 06 00 00 	mov    QWORD PTR [rdi+0x698],rax
      cc4f20:	48 8b b7 e0 05 00 00 	mov    rsi,QWORD PTR [rdi+0x5e0]
      cc4f27:	48 85 f6             	test   rsi,rsi
      cc4f2a:	74 52                	je     cc4f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211f1e>
      cc4f2c:	48 89 fb             	mov    rbx,rdi
      cc4f2f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc4f32:	4c 8d b4 24 70 01 00 	lea    r14,[rsp+0x170]
      cc4f39:	00 
      cc4f3a:	6a ff                	push   0xffffffffffffffff
      cc4f3c:	5a                   	pop    rdx
      cc4f3d:	4c 89 f7             	mov    rdi,r14
      cc4f40:	ff 90 50 01 00 00    	call   QWORD PTR [rax+0x150]
      cc4f46:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      cc4f4b:	4c 89 f6             	mov    rsi,r14
- +0x68 -> 0xcc56b2 FDE=(13391538, 13391567)

## score=103 address-point=0x1850330
- +0x28 -> 0x155e8c6; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407366, 22407375)
     155e8c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8c9:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
     155e8cd:	ff e0                	jmp    rax
- +0x30 -> 0x155e8d0; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407376, 22407385)
     155e8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8d3:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
     155e8d7:	ff e0                	jmp    rax
- +0x38 -> 0x10f78dc; score=25; reads-this-rsi;writes-dest-rdi;saves-dest-rdi; FDE=(17791196, 17791740)
     10f78dc:	41 57                	push   r15
     10f78de:	41 56                	push   r14
     10f78e0:	41 54                	push   r12
     10f78e2:	53                   	push   rbx
     10f78e3:	48 81 ec 88 00 00 00 	sub    rsp,0x88
     10f78ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10f78f1:	00 00 
     10f78f3:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     10f78fa:	00 
     10f78fb:	80 bf 0b 09 00 00 00 	cmp    BYTE PTR [rdi+0x90b],0x0
     10f7902:	0f 84 76 01 00 00    	je     10f7a7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bee94>
     10f7908:	49 89 cf             	mov    r15,rcx
     10f790b:	49 89 d6             	mov    r14,rdx
     10f790e:	48 89 fb             	mov    rbx,rdi
     10f7911:	0f 57 c0             	xorps  xmm0,xmm0
     10f7914:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     10f7919:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     10f791c:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     10f7921:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
     10f7926:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     10f792b:	80 be 30 09 00 00 00 	cmp    BYTE PTR [rsi+0x930],0x0
     10f7932:	74 11                	je     10f7945 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bed5b>
     10f7934:	48 81 c6 c0 04 00 00 	add    rsi,0x4c0
     10f793b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
- +0x68 -> 0x9d7de0 FDE=(10321376, 10321377)

## score=101 address-point=0x187b208
- +0x28 -> 0xbd80cc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12419276, 12419292)
      bd80cc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80d3:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
      bd80da:	ff e0                	jmp    rax
- +0x30 -> 0xbd80dc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12419292, 12419305)
      bd80dc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80e3:	ff a0 a0 00 00 00    	jmp    QWORD PTR [rax+0xa0]
- +0x38 -> 0xaf657c; score=22; reads-this-rsi;writes-dest-rdi; FDE=(11494780, 11494805)
      af657c:	48 89 f8             	mov    rax,rdi
      af657f:	48 8b 4e 40          	mov    rcx,QWORD PTR [rsi+0x40]
      af6583:	0f 10 46 38          	movups xmm0,XMMWORD PTR [rsi+0x38]
      af6587:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      af658a:	48 85 c9             	test   rcx,rcx
      af658d:	74 05                	je     af6594 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x43534>
      af658f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      af6594:	c3                   	ret
- +0x68 -> 0xa5bbf0 FDE=(10861552, 10861557)

## score=101 address-point=0x1870480
- +0x28 -> 0x1425caa; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(21126314, 21126324)
     1425caa:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1425cae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1425cb1:	ff 60 78             	jmp    QWORD PTR [rax+0x78]
- +0x30 -> 0x1425cb4; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(21126324, 21126337)
     1425cb4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1425cb8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1425cbb:	ff a0 80 00 00 00    	jmp    QWORD PTR [rax+0x80]
- +0x38 -> 0xadd7ba; score=22; reads-this-rsi;writes-dest-rdi; FDE=(11392954, 11392979)
      add7ba:	48 89 f8             	mov    rax,rdi
      add7bd:	48 8b 4e 20          	mov    rcx,QWORD PTR [rsi+0x20]
      add7c1:	0f 10 46 18          	movups xmm0,XMMWORD PTR [rsi+0x18]
      add7c5:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      add7c8:	48 85 c9             	test   rcx,rcx
      add7cb:	74 05                	je     add7d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2a772>
      add7cd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      add7d2:	c3                   	ret
- +0x68 -> 0x1425d10 FDE=(21126416, 21126429)

## score=101 address-point=0x186a870
- +0x28 -> 0xbd80cc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12419276, 12419292)
      bd80cc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80d3:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
      bd80da:	ff e0                	jmp    rax
- +0x30 -> 0xbd80dc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12419292, 12419305)
      bd80dc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80e3:	ff a0 a0 00 00 00    	jmp    QWORD PTR [rax+0xa0]
- +0x38 -> 0x13a6e60; score=22; reads-this-rsi;writes-dest-rdi; FDE=(20606560, 20606585)
     13a6e60:	48 89 f8             	mov    rax,rdi
     13a6e63:	48 8b 4e 60          	mov    rcx,QWORD PTR [rsi+0x60]
     13a6e67:	0f 10 46 58          	movups xmm0,XMMWORD PTR [rsi+0x58]
     13a6e6b:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     13a6e6e:	48 85 c9             	test   rcx,rcx
     13a6e71:	74 05                	je     13a6e78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ec3fc>
     13a6e73:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     13a6e78:	c3                   	ret
- +0x68 -> 0xa5bbf0 FDE=(10861552, 10861557)

## score=101 address-point=0x1867b28
- +0x28 -> 0xb00302; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(11535106, 11535111)
      b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
      b00306:	c3                   	ret
- +0x30 -> 0x11ca6fe; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(18654974, 18654982)
     11ca6fe:	48 8d 87 d0 00 00 00 	lea    rax,[rdi+0xd0]
     11ca705:	c3                   	ret
- +0x38 -> 0x135c758; score=22; reads-this-rsi;writes-dest-rdi; FDE=(20301656, 20301681)
     135c758:	48 89 f8             	mov    rax,rdi
     135c75b:	48 8b 4e 48          	mov    rcx,QWORD PTR [rsi+0x48]
     135c75f:	0f 28 46 40          	movaps xmm0,XMMWORD PTR [rsi+0x40]
     135c763:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     135c766:	48 85 c9             	test   rcx,rcx
     135c769:	74 05                	je     135c770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1cf4>
     135c76b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135c770:	c3                   	ret
- +0x68 -> 0x135c5c4 FDE=(20301252, 20301270)

## score=101 address-point=0x18664b8
- +0x28 -> 0x131bd46; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(20036934, 20037576)
     131bd46:	41 57                	push   r15
     131bd48:	41 56                	push   r14
     131bd4a:	53                   	push   rbx
     131bd4b:	48 83 ec 60          	sub    rsp,0x60
     131bd4f:	48 89 fb             	mov    rbx,rdi
     131bd52:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131bd59:	00 00 
     131bd5b:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     131bd60:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131bd64:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131bd67:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131bd6a:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131bd6d:	e8 93 e9 ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131bd72:	83 f8 08             	cmp    eax,0x8
     131bd75:	0f 87 db 01 00 00    	ja     131bf56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1614da>
     131bd7b:	89 c0                	mov    eax,eax
     131bd7d:	48 8d 0d 28 c0 07 ff 	lea    rcx,[rip+0xffffffffff07c028]        # 397dac <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x498d>
     131bd84:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
     131bd88:	48 01 c8             	add    rax,rcx
     131bd8b:	ff e0                	jmp    rax
     131bd8d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131bd94:	00 00 
     131bd96:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     131bd9b:	0f 85 22 02 00 00    	jne    131bfc3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161547>
- +0x30 -> 0x131bfc8; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(20037576, 20038394)
     131bfc8:	55                   	push   rbp
     131bfc9:	41 57                	push   r15
     131bfcb:	41 56                	push   r14
     131bfcd:	41 54                	push   r12
     131bfcf:	53                   	push   rbx
     131bfd0:	48 83 ec 50          	sub    rsp,0x50
     131bfd4:	48 89 fb             	mov    rbx,rdi
     131bfd7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131bfde:	00 00 
     131bfe0:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     131bfe5:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131bfe9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131bfec:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131bfef:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131bff2:	e8 0e e7 ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131bff7:	83 f8 08             	cmp    eax,0x8
     131bffa:	0f 87 68 02 00 00    	ja     131c268 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617ec>
     131c000:	89 c0                	mov    eax,eax
     131c002:	48 8d 0d c7 bd 07 ff 	lea    rcx,[rip+0xffffffffff07bdc7]        # 397dd0 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x49b1>
     131c009:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
     131c00d:	48 01 c8             	add    rax,rcx
     131c010:	ff e0                	jmp    rax
     131c012:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c016:	48 8b 07             	mov    rax,QWORD PTR [rdi]
- +0x38 -> 0x131c2fa; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(20038394, 20039106)
     131c2fa:	55                   	push   rbp
     131c2fb:	41 57                	push   r15
     131c2fd:	41 56                	push   r14
     131c2ff:	53                   	push   rbx
     131c300:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     131c307:	89 d5                	mov    ebp,edx
     131c309:	49 89 f6             	mov    r14,rsi
     131c30c:	48 89 fb             	mov    rbx,rdi
     131c30f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131c316:	00 00 
     131c318:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     131c31f:	00 
     131c320:	89 54 24 54          	mov    DWORD PTR [rsp+0x54],edx
     131c324:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
     131c328:	4c 8b 7e 18          	mov    r15,QWORD PTR [rsi+0x18]
     131c32c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c32f:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c332:	4c 89 ff             	mov    rdi,r15
     131c335:	48 89 c6             	mov    rsi,rax
     131c338:	e8 03 9f c6 ff       	call   f86240 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d656>
     131c33d:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
     131c341:	84 c0                	test   al,al
     131c343:	75 27                	jne    131c36c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1618f0>
     131c345:	48 8b 06             	mov    rax,QWORD PTR [rsi]
- +0x68 -> 0x131d02a FDE=(20041770, 20042090)

## score=101 address-point=0x184f8e8
- +0x28 -> 0x10e581a; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(17717274, 17717282)
     10e581a:	48 8d 87 80 06 00 00 	lea    rax,[rdi+0x680]
     10e5821:	c3                   	ret
- +0x30 -> 0xa7a004; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(10985476, 10985481)
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
- +0x38 -> 0x10e5822; score=22; reads-this-rsi;writes-dest-rdi; FDE=(17717282, 17717313)
     10e5822:	48 89 f8             	mov    rax,rdi
     10e5825:	48 8b 8e 00 08 00 00 	mov    rcx,QWORD PTR [rsi+0x800]
     10e582c:	0f 10 86 f8 07 00 00 	movups xmm0,XMMWORD PTR [rsi+0x7f8]
     10e5833:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     10e5836:	48 85 c9             	test   rcx,rcx
     10e5839:	74 05                	je     10e5840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2acc56>
     10e583b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     10e5840:	c3                   	ret
- +0x68 -> 0x10e5898 FDE=(17717400, 17717412)

## score=101 address-point=0x18214b0
- +0x28 -> 0xbd80cc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12419276, 12419292)
      bd80cc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80d3:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
      bd80da:	ff e0                	jmp    rax
- +0x30 -> 0xbd80dc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12419292, 12419305)
      bd80dc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80e3:	ff a0 a0 00 00 00    	jmp    QWORD PTR [rax+0xa0]
- +0x38 -> 0xcfa7f6; score=22; reads-this-rsi;writes-dest-rdi; FDE=(13608950, 13608981)
      cfa7f6:	48 89 f8             	mov    rax,rdi
      cfa7f9:	48 8b 8e f8 00 00 00 	mov    rcx,QWORD PTR [rsi+0xf8]
      cfa800:	0f 10 86 f0 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xf0]
      cfa807:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      cfa80a:	48 85 c9             	test   rcx,rcx
      cfa80d:	74 05                	je     cfa814 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2477b4>
      cfa80f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      cfa814:	c3                   	ret
- +0x68 -> 0xa5bbf0 FDE=(10861552, 10861557)

## score=101 address-point=0x18133c8
- +0x28 -> 0xbf5576; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12539254, 12539270)
      bf5576:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      bf557a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf557d:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
      bf5584:	ff e0                	jmp    rax
- +0x30 -> 0xbf5586; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12539270, 12539283)
      bf5586:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      bf558a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf558d:	ff a0 a0 00 00 00    	jmp    QWORD PTR [rax+0xa0]
- +0x38 -> 0xbf5594; score=22; reads-this-rsi;writes-dest-rdi; FDE=(12539284, 12539309)
      bf5594:	48 89 f8             	mov    rax,rdi
      bf5597:	48 8b 4e 58          	mov    rcx,QWORD PTR [rsi+0x58]
      bf559b:	0f 10 46 50          	movups xmm0,XMMWORD PTR [rsi+0x50]
      bf559f:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      bf55a2:	48 85 c9             	test   rcx,rcx
      bf55a5:	74 05                	je     bf55ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x14254c>
      bf55a7:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      bf55ac:	c3                   	ret
- +0x68 -> 0xa5bbf0 FDE=(10861552, 10861557)

## score=101 address-point=0x18128f8
- +0x28 -> 0xbd80cc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12419276, 12419292)
      bd80cc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80d3:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
      bd80da:	ff e0                	jmp    rax
- +0x30 -> 0xbd80dc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12419292, 12419305)
      bd80dc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80e3:	ff a0 a0 00 00 00    	jmp    QWORD PTR [rax+0xa0]
- +0x38 -> 0xbd80ea; score=22; reads-this-rsi;writes-dest-rdi; FDE=(12419306, 12419331)
      bd80ea:	48 89 f8             	mov    rax,rdi
      bd80ed:	48 8b 4e 50          	mov    rcx,QWORD PTR [rsi+0x50]
      bd80f1:	0f 10 46 48          	movups xmm0,XMMWORD PTR [rsi+0x48]
      bd80f5:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      bd80f8:	48 85 c9             	test   rcx,rcx
      bd80fb:	74 05                	je     bd8102 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1250a2>
      bd80fd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      bd8102:	c3                   	ret
- +0x68 -> 0xa5bbf0 FDE=(10861552, 10861557)

## score=100 address-point=0x182b850
- +0x28 -> 0xdf3062; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(14626914, 14626922)
      df3062:	48 8d 87 e0 00 00 00 	lea    rax,[rdi+0xe0]
      df3069:	c3                   	ret
- +0x30 -> 0xc44ebc; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(12865212, 12865220)
      c44ebc:	48 8d 87 80 00 00 00 	lea    rax,[rdi+0x80]
      c44ec3:	c3                   	ret
- +0x38 -> 0xdf306a; score=22; reads-this-rsi;writes-dest-rdi; FDE=(14626922, 14626968)
      df306a:	48 89 f8             	mov    rax,rdi
      df306d:	48 8b 8e 10 01 00 00 	mov    rcx,QWORD PTR [rsi+0x110]
      df3074:	48 8d 51 08          	lea    rdx,[rcx+0x8]
      df3078:	48 85 c9             	test   rcx,rcx
      df307b:	48 0f 44 d1          	cmove  rdx,rcx
      df307f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      df3082:	48 8b 8e 18 01 00 00 	mov    rcx,QWORD PTR [rsi+0x118]
      df3089:	48 89 4f 08          	mov    QWORD PTR [rdi+0x8],rcx
      df308d:	48 85 c9             	test   rcx,rcx
      df3090:	74 05                	je     df3097 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc011d>
      df3092:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      df3097:	c3                   	ret
- +0x68 -> none FDE=None

## score=100 address-point=0x181ef90
- +0x28 -> 0xcc0394; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(13370260, 13370276)
      cc0394:	48 8b bf b8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb8]
      cc039b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc039e:	ff a0 78 01 00 00    	jmp    QWORD PTR [rax+0x178]
- +0x30 -> 0xc94fd2; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(13193170, 13193178)
      c94fd2:	48 8b 87 98 00 00 00 	mov    rax,QWORD PTR [rdi+0x98]
      c94fd9:	c3                   	ret
- +0x38 -> 0xcc03a4; score=22; reads-this-rsi;writes-dest-rdi; FDE=(13370276, 13370307)
      cc03a4:	48 89 f8             	mov    rax,rdi
      cc03a7:	48 8b 8e a8 00 00 00 	mov    rcx,QWORD PTR [rsi+0xa8]
      cc03ae:	0f 28 86 a0 00 00 00 	movaps xmm0,XMMWORD PTR [rsi+0xa0]
      cc03b5:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      cc03b8:	48 85 c9             	test   rcx,rcx
      cc03bb:	74 05                	je     cc03c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d362>
      cc03bd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      cc03c2:	c3                   	ret
- +0x68 -> none FDE=None

## score=100 address-point=0x1817068
- +0x28 -> 0xa7a004; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(10985476, 10985481)
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
- +0x30 -> 0xb411a4; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(11800996, 11801001)
      b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      b411a8:	c3                   	ret
- +0x38 -> 0xc2e940; score=22; reads-this-rsi;writes-dest-rdi; FDE=(12773696, 12773727)
      c2e940:	48 89 f8             	mov    rax,rdi
      c2e943:	48 8b 8e b8 00 00 00 	mov    rcx,QWORD PTR [rsi+0xb8]
      c2e94a:	0f 28 86 b0 00 00 00 	movaps xmm0,XMMWORD PTR [rsi+0xb0]
      c2e951:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      c2e954:	48 85 c9             	test   rcx,rcx
      c2e957:	74 05                	je     c2e95e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b8fe>
      c2e959:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      c2e95e:	c3                   	ret
- +0x68 -> 0x9d7de0 FDE=(10321376, 10321377)

## score=100 address-point=0x180dce8
- +0x28 -> 0xb89634; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(12097076, 12097084)
      b89634:	48 8d 87 70 02 00 00 	lea    rax,[rdi+0x270]
      b8963b:	c3                   	ret
- +0x30 -> 0xb8963c; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(12097084, 12097092)
      b8963c:	48 8d 87 f0 02 00 00 	lea    rax,[rdi+0x2f0]
      b89643:	c3                   	ret
- +0x38 -> 0xb89644; score=22; reads-this-rsi;writes-dest-rdi; FDE=(12097092, 12097123)
      b89644:	48 89 f8             	mov    rax,rdi
      b89647:	48 8b 8e 28 03 00 00 	mov    rcx,QWORD PTR [rsi+0x328]
      b8964e:	0f 28 86 20 03 00 00 	movaps xmm0,XMMWORD PTR [rsi+0x320]
      b89655:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      b89658:	48 85 c9             	test   rcx,rcx
      b8965b:	74 05                	je     b89662 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6602>
      b8965d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b89662:	c3                   	ret
- +0x68 -> 0x9d7de0 FDE=(10321376, 10321377)

## score=100 address-point=0x1802fc8
- +0x28 -> 0xaf6576; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(11494774, 11494779)
      af6576:	48 8d 47 08          	lea    rax,[rdi+0x8]
      af657a:	c3                   	ret
- +0x30 -> 0xa4b870; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(10795120, 10795125)
      a4b870:	48 8d 47 20          	lea    rax,[rdi+0x20]
      a4b874:	c3                   	ret
- +0x38 -> 0xaf657c; score=22; reads-this-rsi;writes-dest-rdi; FDE=(11494780, 11494805)
      af657c:	48 89 f8             	mov    rax,rdi
      af657f:	48 8b 4e 40          	mov    rcx,QWORD PTR [rsi+0x40]
      af6583:	0f 10 46 38          	movups xmm0,XMMWORD PTR [rsi+0x38]
      af6587:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      af658a:	48 85 c9             	test   rcx,rcx
      af658d:	74 05                	je     af6594 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x43534>
      af658f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      af6594:	c3                   	ret
- +0x68 -> 0x9d7de0 FDE=(10321376, 10321377)

## score=99 address-point=0x1886bf0
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c520c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(22827532, 22827559)
     15c520c:	53                   	push   rbx
     15c520d:	48 89 fb             	mov    rbx,rdi
     15c5210:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     15c5214:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     15c5218:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15c521c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c521f:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15c5222:	48 89 d8             	mov    rax,rbx
     15c5225:	5b                   	pop    rbx
     15c5226:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1886b28
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x116672c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245420, 18245439)
     116672c:	53                   	push   rbx
     116672d:	48 89 fb             	mov    rbx,rdi
     1166730:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166734:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166737:	ff 50 70             	call   QWORD PTR [rax+0x70]
     116673a:	48 89 d8             	mov    rax,rbx
     116673d:	5b                   	pop    rbx
     116673e:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x18868b0
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c520c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(22827532, 22827559)
     15c520c:	53                   	push   rbx
     15c520d:	48 89 fb             	mov    rbx,rdi
     15c5210:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     15c5214:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     15c5218:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15c521c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c521f:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15c5222:	48 89 d8             	mov    rax,rbx
     15c5225:	5b                   	pop    rbx
     15c5226:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x18867e8
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x116672c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245420, 18245439)
     116672c:	53                   	push   rbx
     116672d:	48 89 fb             	mov    rbx,rdi
     1166730:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166734:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166737:	ff 50 70             	call   QWORD PTR [rax+0x70]
     116673a:	48 89 d8             	mov    rax,rbx
     116673d:	5b                   	pop    rbx
     116673e:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x18863a0
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x116672c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245420, 18245439)
     116672c:	53                   	push   rbx
     116672d:	48 89 fb             	mov    rbx,rdi
     1166730:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166734:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166737:	ff 50 70             	call   QWORD PTR [rax+0x70]
     116673a:	48 89 d8             	mov    rax,rbx
     116673d:	5b                   	pop    rbx
     116673e:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1886070
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c520c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(22827532, 22827559)
     15c520c:	53                   	push   rbx
     15c520d:	48 89 fb             	mov    rbx,rdi
     15c5210:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     15c5214:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     15c5218:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15c521c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c521f:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15c5222:	48 89 d8             	mov    rax,rbx
     15c5225:	5b                   	pop    rbx
     15c5226:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1885fa8
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x116672c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245420, 18245439)
     116672c:	53                   	push   rbx
     116672d:	48 89 fb             	mov    rbx,rdi
     1166730:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166734:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166737:	ff 50 70             	call   QWORD PTR [rax+0x70]
     116673a:	48 89 d8             	mov    rax,rbx
     116673d:	5b                   	pop    rbx
     116673e:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1885be0
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x116672c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245420, 18245439)
     116672c:	53                   	push   rbx
     116672d:	48 89 fb             	mov    rbx,rdi
     1166730:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166734:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166737:	ff 50 70             	call   QWORD PTR [rax+0x70]
     116673a:	48 89 d8             	mov    rax,rbx
     116673d:	5b                   	pop    rbx
     116673e:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1885958
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c520c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(22827532, 22827559)
     15c520c:	53                   	push   rbx
     15c520d:	48 89 fb             	mov    rbx,rdi
     15c5210:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     15c5214:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     15c5218:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15c521c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c521f:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15c5222:	48 89 d8             	mov    rax,rbx
     15c5225:	5b                   	pop    rbx
     15c5226:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1885600
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c520c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(22827532, 22827559)
     15c520c:	53                   	push   rbx
     15c520d:	48 89 fb             	mov    rbx,rdi
     15c5210:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     15c5214:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     15c5218:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15c521c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c521f:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15c5222:	48 89 d8             	mov    rax,rbx
     15c5225:	5b                   	pop    rbx
     15c5226:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1885538
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x116672c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245420, 18245439)
     116672c:	53                   	push   rbx
     116672d:	48 89 fb             	mov    rbx,rdi
     1166730:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166734:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166737:	ff 50 70             	call   QWORD PTR [rax+0x70]
     116673a:	48 89 d8             	mov    rax,rbx
     116673d:	5b                   	pop    rbx
     116673e:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x18851f8
- +0x28 -> 0x142720e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(21131790, 21131803)
     142720e:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     1427212:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1427215:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     1427219:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c5a2c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(22829612, 22829631)
     15c5a2c:	53                   	push   rbx
     15c5a2d:	48 89 fb             	mov    rbx,rdi
     15c5a30:	48 8b 76 28          	mov    rsi,QWORD PTR [rsi+0x28]
     15c5a34:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c5a37:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15c5a3a:	48 89 d8             	mov    rax,rbx
     15c5a3d:	5b                   	pop    rbx
     15c5a3e:	c3                   	ret
- +0x68 -> 0x15c5a72 FDE=(22829682, 22829700)

## score=99 address-point=0x1885068
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c520c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(22827532, 22827559)
     15c520c:	53                   	push   rbx
     15c520d:	48 89 fb             	mov    rbx,rdi
     15c5210:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     15c5214:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     15c5218:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15c521c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c521f:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15c5222:	48 89 d8             	mov    rax,rbx
     15c5225:	5b                   	pop    rbx
     15c5226:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1884fa0
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x116672c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245420, 18245439)
     116672c:	53                   	push   rbx
     116672d:	48 89 fb             	mov    rbx,rdi
     1166730:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166734:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166737:	ff 50 70             	call   QWORD PTR [rax+0x70]
     116673a:	48 89 d8             	mov    rax,rbx
     116673d:	5b                   	pop    rbx
     116673e:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1884e10
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x15c520c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(22827532, 22827559)
     15c520c:	53                   	push   rbx
     15c520d:	48 89 fb             	mov    rbx,rdi
     15c5210:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     15c5214:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     15c5218:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15c521c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c521f:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15c5222:	48 89 d8             	mov    rax,rbx
     15c5225:	5b                   	pop    rbx
     15c5226:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1884d48
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x116672c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245420, 18245439)
     116672c:	53                   	push   rbx
     116672d:	48 89 fb             	mov    rbx,rdi
     1166730:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166734:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166737:	ff 50 70             	call   QWORD PTR [rax+0x70]
     116673a:	48 89 d8             	mov    rax,rbx
     116673d:	5b                   	pop    rbx
     116673e:	c3                   	ret
- +0x68 -> 0x15c5280 FDE=(22827648, 22827800)

## score=99 address-point=0x1858840
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x11991cc; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18452940, 18453255)
     11991cc:	41 57                	push   r15
     11991ce:	41 56                	push   r14
     11991d0:	53                   	push   rbx
     11991d1:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
     11991d8:	4d 89 c6             	mov    r14,r8
     11991db:	48 89 fb             	mov    rbx,rdi
     11991de:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11991e5:	00 00 
     11991e7:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     11991ee:	00 
     11991ef:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     11991f4:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     11991f9:	0f 57 c0             	xorps  xmm0,xmm0
     11991fc:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1199200:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1199204:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1199207:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     119920c:	ff 50 70             	call   QWORD PTR [rax+0x70]
     119920f:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1199214:	48 85 f6             	test   rsi,rsi
     1199217:	74 0a                	je     1199223 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x360639>
     1199219:	48 89 df             	mov    rdi,rbx
     119921c:	e8 47 2e af ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1199221:	eb 56                	jmp    1199279 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36068f>
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x1858600
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x1197800; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18446336, 18446690)
     1197800:	41 57                	push   r15
     1197802:	41 56                	push   r14
     1197804:	53                   	push   rbx
     1197805:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
     119780c:	4d 89 c6             	mov    r14,r8
     119780f:	48 89 fb             	mov    rbx,rdi
     1197812:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1197819:	00 00 
     119781b:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     1197822:	00 
     1197823:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     1197828:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     119782d:	0f 57 c0             	xorps  xmm0,xmm0
     1197830:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1197834:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1197838:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     119783b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1197840:	ff 50 70             	call   QWORD PTR [rax+0x70]
     1197843:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1197848:	48 85 f6             	test   rsi,rsi
     119784b:	74 0a                	je     1197857 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ec6d>
     119784d:	48 89 df             	mov    rdi,rbx
     1197850:	e8 13 48 af ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1197855:	eb 7d                	jmp    11978d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ecea>
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x18583a8
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x1196024; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18440228, 18440543)
     1196024:	41 57                	push   r15
     1196026:	41 56                	push   r14
     1196028:	53                   	push   rbx
     1196029:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
     1196030:	4d 89 c6             	mov    r14,r8
     1196033:	48 89 fb             	mov    rbx,rdi
     1196036:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     119603d:	00 00 
     119603f:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     1196046:	00 
     1196047:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     119604c:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     1196051:	0f 57 c0             	xorps  xmm0,xmm0
     1196054:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1196058:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     119605c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     119605f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1196064:	ff 50 70             	call   QWORD PTR [rax+0x70]
     1196067:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     119606c:	48 85 f6             	test   rsi,rsi
     119606f:	74 0a                	je     119607b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d491>
     1196071:	48 89 df             	mov    rdi,rbx
     1196074:	e8 ef 5f af ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1196079:	eb 56                	jmp    11960d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d4e7>
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x1858278
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x1193ab0; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18430640, 18430955)
     1193ab0:	41 57                	push   r15
     1193ab2:	41 56                	push   r14
     1193ab4:	53                   	push   rbx
     1193ab5:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     1193abc:	4d 89 c6             	mov    r14,r8
     1193abf:	48 89 fb             	mov    rbx,rdi
     1193ac2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1193ac9:	00 00 
     1193acb:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     1193ad2:	00 
     1193ad3:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     1193ad8:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     1193add:	0f 57 c0             	xorps  xmm0,xmm0
     1193ae0:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1193ae4:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1193ae8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1193aeb:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1193af0:	ff 50 70             	call   QWORD PTR [rax+0x70]
     1193af3:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1193af8:	48 85 f6             	test   rsi,rsi
     1193afb:	74 0a                	je     1193b07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35af1d>
     1193afd:	48 89 df             	mov    rdi,rbx
     1193b00:	e8 63 85 af ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1193b05:	eb 56                	jmp    1193b5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35af73>
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x1857f90
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x118b79c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18397084, 18397399)
     118b79c:	41 57                	push   r15
     118b79e:	41 56                	push   r14
     118b7a0:	53                   	push   rbx
     118b7a1:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
     118b7a8:	4d 89 c6             	mov    r14,r8
     118b7ab:	48 89 fb             	mov    rbx,rdi
     118b7ae:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     118b7b5:	00 00 
     118b7b7:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     118b7be:	00 
     118b7bf:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     118b7c4:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     118b7c9:	0f 57 c0             	xorps  xmm0,xmm0
     118b7cc:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     118b7d0:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     118b7d4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     118b7d7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     118b7dc:	ff 50 70             	call   QWORD PTR [rax+0x70]
     118b7df:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     118b7e4:	48 85 f6             	test   rsi,rsi
     118b7e7:	74 0a                	je     118b7f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352c09>
     118b7e9:	48 89 df             	mov    rdi,rbx
     118b7ec:	e8 77 08 b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     118b7f1:	eb 56                	jmp    118b849 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352c5f>
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x1857b50
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x118755e; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18380126, 18380441)
     118755e:	41 57                	push   r15
     1187560:	41 56                	push   r14
     1187562:	53                   	push   rbx
     1187563:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     118756a:	4d 89 c6             	mov    r14,r8
     118756d:	48 89 fb             	mov    rbx,rdi
     1187570:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1187577:	00 00 
     1187579:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     1187580:	00 
     1187581:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     1187586:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     118758b:	0f 57 c0             	xorps  xmm0,xmm0
     118758e:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1187592:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1187596:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1187599:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     118759e:	ff 50 70             	call   QWORD PTR [rax+0x70]
     11875a1:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     11875a6:	48 85 f6             	test   rsi,rsi
     11875a9:	74 0a                	je     11875b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e9cb>
     11875ab:	48 89 df             	mov    rdi,rbx
     11875ae:	e8 b5 4a b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     11875b3:	eb 56                	jmp    118760b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ea21>
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x18576c0
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x1184b0e; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18369294, 18369648)
     1184b0e:	41 57                	push   r15
     1184b10:	41 56                	push   r14
     1184b12:	53                   	push   rbx
     1184b13:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
     1184b1a:	4d 89 c6             	mov    r14,r8
     1184b1d:	48 89 fb             	mov    rbx,rdi
     1184b20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1184b27:	00 00 
     1184b29:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     1184b30:	00 
     1184b31:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     1184b36:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     1184b3b:	0f 57 c0             	xorps  xmm0,xmm0
     1184b3e:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1184b42:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1184b46:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1184b49:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1184b4e:	ff 50 70             	call   QWORD PTR [rax+0x70]
     1184b51:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1184b56:	48 85 f6             	test   rsi,rsi
     1184b59:	74 0a                	je     1184b65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34bf7b>
     1184b5b:	48 89 df             	mov    rdi,rbx
     1184b5e:	e8 05 75 b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1184b63:	eb 7d                	jmp    1184be2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34bff8>
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x1857480
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x1182f9a; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18362266, 18362615)
     1182f9a:	41 57                	push   r15
     1182f9c:	41 56                	push   r14
     1182f9e:	53                   	push   rbx
     1182f9f:	48 81 ec 90 00 00 00 	sub    rsp,0x90
     1182fa6:	4d 89 c6             	mov    r14,r8
     1182fa9:	48 89 fb             	mov    rbx,rdi
     1182fac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1182fb3:	00 00 
     1182fb5:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     1182fbc:	00 
     1182fbd:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     1182fc2:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     1182fc7:	0f 57 c0             	xorps  xmm0,xmm0
     1182fca:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1182fce:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1182fd2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1182fd5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1182fda:	ff 50 70             	call   QWORD PTR [rax+0x70]
     1182fdd:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1182fe2:	48 85 f6             	test   rsi,rsi
     1182fe5:	74 0a                	je     1182ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a407>
     1182fe7:	48 89 df             	mov    rdi,rbx
     1182fea:	e8 79 90 b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1182fef:	eb 78                	jmp    1183069 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a47f>
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x1857350
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x1181486; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18355334, 18355670)
     1181486:	41 57                	push   r15
     1181488:	41 56                	push   r14
     118148a:	53                   	push   rbx
     118148b:	48 81 ec 80 00 00 00 	sub    rsp,0x80
     1181492:	4d 89 c6             	mov    r14,r8
     1181495:	48 89 fb             	mov    rbx,rdi
     1181498:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     118149f:	00 00 
     11814a1:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     11814a6:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     11814ab:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     11814b0:	0f 57 c0             	xorps  xmm0,xmm0
     11814b3:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     11814b7:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     11814bb:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11814be:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11814c3:	ff 50 70             	call   QWORD PTR [rax+0x70]
     11814c6:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     11814cb:	48 85 f6             	test   rsi,rsi
     11814ce:	74 0a                	je     11814da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3488f0>
     11814d0:	48 89 df             	mov    rdi,rbx
     11814d3:	e8 90 ab b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     11814d8:	eb 74                	jmp    118154e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348964>
     11814da:	0f 57 c0             	xorps  xmm0,xmm0
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x1857220
- +0x28 -> 0x1166710; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245392, 18245405)
     1166710:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166714:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166717:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
     116671b:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x11803ca; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18351050, 18351400)
     11803ca:	41 57                	push   r15
     11803cc:	41 56                	push   r14
     11803ce:	53                   	push   rbx
     11803cf:	48 81 ec 90 00 00 00 	sub    rsp,0x90
     11803d6:	4d 89 c6             	mov    r14,r8
     11803d9:	48 89 fb             	mov    rbx,rdi
     11803dc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11803e3:	00 00 
     11803e5:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     11803ec:	00 
     11803ed:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     11803f2:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     11803f7:	0f 57 c0             	xorps  xmm0,xmm0
     11803fa:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     11803fe:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1180402:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1180405:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     118040a:	ff 50 70             	call   QWORD PTR [rax+0x70]
     118040d:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1180412:	48 85 f6             	test   rsi,rsi
     1180415:	74 0a                	je     1180421 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347837>
     1180417:	48 89 df             	mov    rdi,rbx
     118041a:	e8 49 bc b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     118041f:	eb 79                	jmp    118049a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3478b0>
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=99 address-point=0x1855bd8
- +0x28 -> 0x116671e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245406, 18245419)
     116671e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166722:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166725:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     1166729:	ff e0                	jmp    rax
- +0x30 -> 0x11359de; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(18045406, 18045440)
     11359de:	53                   	push   rbx
     11359df:	48 89 fb             	mov    rbx,rdi
     11359e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11359e5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11359e8:	84 c0                	test   al,al
     11359ea:	74 10                	je     11359fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fce12>
     11359ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11359ef:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     11359f3:	6a ff                	push   0xffffffffffffffff
     11359f5:	5e                   	pop    rsi
     11359f6:	48 89 df             	mov    rdi,rbx
     11359f9:	5b                   	pop    rbx
     11359fa:	ff e0                	jmp    rax
     11359fc:	31 c0                	xor    eax,eax
     11359fe:	5b                   	pop    rbx
     11359ff:	c3                   	ret
- +0x38 -> 0x116672c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245420, 18245439)
     116672c:	53                   	push   rbx
     116672d:	48 89 fb             	mov    rbx,rdi
     1166730:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166734:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166737:	ff 50 70             	call   QWORD PTR [rax+0x70]
     116673a:	48 89 d8             	mov    rax,rbx
     116673d:	5b                   	pop    rbx
     116673e:	c3                   	ret
- +0x68 -> 0x116676e FDE=(18245486, 18245502)

## score=98 address-point=0x181a610
- +0x28 -> 0xc68570; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(13010288, 13011310)
      c68570:	55                   	push   rbp
      c68571:	41 57                	push   r15
      c68573:	41 56                	push   r14
      c68575:	41 55                	push   r13
      c68577:	41 54                	push   r12
      c68579:	53                   	push   rbx
      c6857a:	48 81 ec 98 00 00 00 	sub    rsp,0x98
      c68581:	48 89 fb             	mov    rbx,rdi
      c68584:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c6858b:	00 00 
      c6858d:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      c68594:	00 
      c68595:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      c68599:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c6859c:	ff 50 40             	call   QWORD PTR [rax+0x40]
      c6859f:	41 89 c7             	mov    r15d,eax
      c685a2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      c685a6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c685a9:	ff 50 50             	call   QWORD PTR [rax+0x50]
      c685ac:	89 c5                	mov    ebp,eax
      c685ae:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      c685b2:	4c 8b 60 50          	mov    r12,QWORD PTR [rax+0x50]
      c685b6:	4d 85 e4             	test   r12,r12
      c685b9:	0f 84 2f 03 00 00    	je     c688ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b588e>
- +0x30 -> 0xc6896e; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(13011310, 13014808)
      c6896e:	55                   	push   rbp
      c6896f:	41 57                	push   r15
      c68971:	41 56                	push   r14
      c68973:	41 55                	push   r13
      c68975:	41 54                	push   r12
      c68977:	53                   	push   rbx
      c68978:	48 81 ec b8 01 00 00 	sub    rsp,0x1b8
      c6897f:	48 89 fd             	mov    rbp,rdi
      c68982:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c68989:	00 00 
      c6898b:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
      c68992:	00 
      c68993:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      c68997:	e8 40 31 ff ff       	call   c5badc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8a7c>
      c6899c:	84 c0                	test   al,al
      c6899e:	0f 84 d7 06 00 00    	je     c6907b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b601b>
      c689a4:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
      c689a8:	80 b8 c9 01 00 00 00 	cmp    BYTE PTR [rax+0x1c9],0x0
      c689af:	0f 85 c6 06 00 00    	jne    c6907b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b601b>
      c689b5:	83 7d 60 00          	cmp    DWORD PTR [rbp+0x60],0x0
      c689b9:	0f 84 bc 06 00 00    	je     c6907b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b601b>
      c689bf:	48 8b 78 50          	mov    rdi,QWORD PTR [rax+0x50]
      c689c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c689c6:	ff 50 30             	call   QWORD PTR [rax+0x30]
- +0x38 -> 0xc69718; score=15; writes-dest-rdi;saves-dest-rdi; FDE=(13014808, 13014924)
      c69718:	53                   	push   rbx
      c69719:	48 89 fb             	mov    rbx,rdi
      c6971c:	48 8d 05 15 0f bb 00 	lea    rax,[rip+0xbb0f15]        # 181a638 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x102f8>
      c69723:	48 89 07             	mov    QWORD PTR [rdi],rax
      c69726:	48 81 c7 88 01 00 00 	add    rdi,0x188
      c6972d:	e8 f6 06 e1 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
      c69732:	48 8d bb 60 01 00 00 	lea    rdi,[rbx+0x160]
      c69739:	e8 34 25 ff ff       	call   c5bc72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8c12>
      c6973e:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
      c69745:	e8 20 08 e1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c6974a:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
      c69751:	e8 b2 e8 ff ff       	call   c68008 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4fa8>
      c69756:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
      c6975d:	e8 24 4d e3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c69762:	48 8d bb e8 00 00 00 	lea    rdi,[rbx+0xe8]
      c69769:	e8 e8 dd e4 ff       	call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
      c6976e:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      c69775:	e8 b4 bb a5 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c6977a:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
      c6977e:	e8 ab bb a5 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c69783:	48 89 df             	mov    rdi,rbx
      c69786:	5b                   	pop    rbx
      c69787:	e9 40 25 ff ff       	jmp    c5bccc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8c6c>
- +0x68 -> 0xc68466 FDE=(13010022, 13010054)

## score=98 address-point=0x1812b38
- +0x28 -> 0xbddb90; score=35; no-extra-incoming-args;rax<-this-field;few-calls;compact; FDE=(12442512, 12442632)
      bddb90:	53                   	push   rbx
      bddb91:	48 83 ec 10          	sub    rsp,0x10
      bddb95:	48 89 fb             	mov    rbx,rdi
      bddb98:	48 8b 87 28 01 00 00 	mov    rax,QWORD PTR [rdi+0x128]
      bddb9f:	48 3b 87 30 01 00 00 	cmp    rax,QWORD PTR [rdi+0x130]
      bddba6:	74 4b                	je     bddbf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12ab93>
      bddba8:	f2 0f 10 15 78 12 7b 	movsd  xmm2,QWORD PTR [rip+0xffffffffff7b1278]        # 38ee28 <_ZTSSt12bad_any_cast@@Base-0x13a0>
      bddbaf:	ff 
      bddbb0:	f2 0f 58 d0          	addsd  xmm2,xmm0
      bddbb4:	66 0f 54 15 04 ed 7a 	andpd  xmm2,XMMWORD PTR [rip+0xffffffffff7aed04]        # 38c8c0 <_ZTSSt12bad_any_cast@@Base-0x3908>
      bddbbb:	ff 
      bddbbc:	f2 0f 10 0d 54 14 7b 	movsd  xmm1,QWORD PTR [rip+0xffffffffff7b1454]        # 38f018 <_ZTSSt12bad_any_cast@@Base-0x11b0>
      bddbc3:	ff 
      bddbc4:	66 0f 2e ca          	ucomisd xmm1,xmm2
      bddbc8:	77 29                	ja     bddbf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12ab93>
      bddbca:	48 8d 35 ab 43 87 ff 	lea    rsi,[rip+0xffffffffff8743ab]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      bddbd1:	48 8d 0d fe 79 77 ff 	lea    rcx,[rip+0xffffffffff7779fe]        # 3555d6 <_ZTSSt12bad_any_cast@@Base-0x3abf2>
      bddbd8:	6a 03                	push   0x3
      bddbda:	5f                   	pop    rdi
      bddbdb:	ba 99 01 00 00       	mov    edx,0x199
      bddbe0:	b0 01                	mov    al,0x1
      bddbe2:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
      bddbe8:	e8 e5 8c bf 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      bddbed:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
- +0x30 -> 0xbddc08; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12442632, 12442645)
      bddc08:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
      bddc0c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bddc0f:	ff a0 a0 00 00 00    	jmp    QWORD PTR [rax+0xa0]
- +0x38 -> 0xbddc16; score=22; reads-this-rsi;writes-dest-rdi; FDE=(12442646, 12442677)
      bddc16:	48 89 f8             	mov    rax,rdi
      bddc19:	48 8b 8e a0 00 00 00 	mov    rcx,QWORD PTR [rsi+0xa0]
      bddc20:	0f 10 86 98 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0x98]
      bddc27:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      bddc2a:	48 85 c9             	test   rcx,rcx
      bddc2d:	74 05                	je     bddc34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12abd4>
      bddc2f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      bddc34:	c3                   	ret
- +0x68 -> 0xa5bbf0 FDE=(10861552, 10861557)

## score=98 address-point=0x1800790
- +0x28 -> 0xac9b5a; score=35; no-extra-incoming-args;rax<-this-field;few-calls;compact; FDE=(11311962, 11311983)
      ac9b5a:	50                   	push   rax
      ac9b5b:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      ac9b5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ac9b62:	ff 50 38             	call   QWORD PTR [rax+0x38]
      ac9b65:	59                   	pop    rcx
      ac9b66:	c3                   	ret
      ac9b67:	48 89 c7             	mov    rdi,rax
      ac9b6a:	e8 36 ff fa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
- +0x30 -> 0xac9b70; score=33; no-extra-incoming-args;rax<-this-field;compact; FDE=(11311984, 11312081)
      ac9b70:	41 56                	push   r14
      ac9b72:	53                   	push   rbx
      ac9b73:	48 83 ec 28          	sub    rsp,0x28
      ac9b77:	48 89 fb             	mov    rbx,rdi
      ac9b7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ac9b81:	00 00 
      ac9b83:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ac9b88:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
      ac9b8d:	4c 89 f7             	mov    rdi,r14
      ac9b90:	e8 e8 b8 d0 00       	call   17d547d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x129e>
      ac9b95:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ac9b99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ac9b9c:	4c 89 f6             	mov    rsi,r14
      ac9b9f:	ff 50 40             	call   QWORD PTR [rax+0x40]
      ac9ba2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ac9ba7:	e8 e4 42 d2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ac9bac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ac9bb3:	00 00 
      ac9bb5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ac9bba:	75 08                	jne    ac9bc4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16b64>
      ac9bbc:	48 83 c4 28          	add    rsp,0x28
      ac9bc0:	5b                   	pop    rbx
      ac9bc1:	41 5e                	pop    r14
      ac9bc3:	c3                   	ret
- +0x38 -> 0xac9bd2; score=27; reads-this-rsi;writes-dest-rdi;saves-this-rsi; FDE=(11312082, 11312339)
      ac9bd2:	41 57                	push   r15
      ac9bd4:	41 56                	push   r14
      ac9bd6:	41 55                	push   r13
      ac9bd8:	41 54                	push   r12
      ac9bda:	53                   	push   rbx
      ac9bdb:	48 83 ec 40          	sub    rsp,0x40
      ac9bdf:	48 89 f3             	mov    rbx,rsi
      ac9be2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ac9be9:	00 00 
      ac9beb:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      ac9bf0:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
      ac9bf4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ac9bf7:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ac9bfc:	ff 50 48             	call   QWORD PTR [rax+0x48]
      ac9bff:	48 8b 35 72 a3 f1 00 	mov    rsi,QWORD PTR [rip+0xf1a372]        # 19e3f78 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9a8>
      ac9c06:	48 8b 15 53 a3 f1 00 	mov    rdx,QWORD PTR [rip+0xf1a353]        # 19e3f60 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x990>
      ac9c0d:	48 89 df             	mov    rdi,rbx
      ac9c10:	31 c0                	xor    eax,eax
      ac9c12:	e8 25 a0 fe ff       	call   ab3c3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdc>
      ac9c17:	49 89 c6             	mov    r14,rax
      ac9c1a:	48 89 df             	mov    rdi,rbx
      ac9c1d:	e8 c6 af d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ac9c22:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      ac9c27:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
- +0x68 -> 0xac8b20 FDE=(11307808, 11308431)

## score=97 address-point=0x18ae118
- +0x28 -> 0x17cc230; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(24953392, 24953429)
     17cc230:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
     17cc234:	48 8d 48 08          	lea    rcx,[rax+0x8]
     17cc238:	48 3b 4f 28          	cmp    rcx,QWORD PTR [rdi+0x28]
     17cc23c:	76 05                	jbe    17cc243 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1803af>
     17cc23e:	31 d2                	xor    edx,edx
     17cc240:	31 c0                	xor    eax,eax
     17cc242:	c3                   	ret
     17cc243:	48 8b 57 20          	mov    rdx,QWORD PTR [rdi+0x20]
     17cc247:	48 8b 04 02          	mov    rax,QWORD PTR [rdx+rax*1]
     17cc24b:	48 0f c8             	bswap  rax
     17cc24e:	48 89 4f 30          	mov    QWORD PTR [rdi+0x30],rcx
     17cc252:	b2 01                	mov    dl,0x1
     17cc254:	c3                   	ret
- +0x30 -> 0x17cc20c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(24953356, 24953392)
     17cc20c:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
     17cc210:	48 8d 48 04          	lea    rcx,[rax+0x4]
     17cc214:	48 3b 4f 28          	cmp    rcx,QWORD PTR [rdi+0x28]
     17cc218:	76 03                	jbe    17cc21d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180389>
     17cc21a:	31 c0                	xor    eax,eax
     17cc21c:	c3                   	ret
     17cc21d:	48 8b 57 20          	mov    rdx,QWORD PTR [rdi+0x20]
     17cc221:	8b 04 02             	mov    eax,DWORD PTR [rdx+rax*1]
     17cc224:	0f c8                	bswap  eax
     17cc226:	48 89 4f 30          	mov    QWORD PTR [rdi+0x30],rcx
     17cc22a:	48 0f ba e8 20       	bts    rax,0x20
     17cc22f:	c3                   	ret
- +0x38 -> 0x17cc256; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(24953430, 24953499)
     17cc256:	41 57                	push   r15
     17cc258:	41 56                	push   r14
     17cc25a:	53                   	push   rbx
     17cc25b:	49 89 f7             	mov    r15,rsi
     17cc25e:	48 89 fb             	mov    rbx,rdi
     17cc261:	48 8b 76 30          	mov    rsi,QWORD PTR [rsi+0x30]
     17cc265:	48 8d 04 16          	lea    rax,[rsi+rdx*1]
     17cc269:	49 3b 47 28          	cmp    rax,QWORD PTR [r15+0x28]
     17cc26d:	76 0d                	jbe    17cc27c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1803e8>
     17cc26f:	0f 57 c0             	xorps  xmm0,xmm0
     17cc272:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     17cc275:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     17cc27a:	eb 16                	jmp    17cc292 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1803fe>
     17cc27c:	49 89 d6             	mov    r14,rdx
     17cc27f:	49 03 77 20          	add    rsi,QWORD PTR [r15+0x20]
     17cc283:	48 01 f2             	add    rdx,rsi
     17cc286:	48 89 df             	mov    rdi,rbx
     17cc289:	e8 d4 8a 43 ff       	call   c04d62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151d02>
     17cc28e:	4d 01 77 30          	add    QWORD PTR [r15+0x30],r14
     17cc292:	48 89 d8             	mov    rax,rbx
     17cc295:	5b                   	pop    rbx
     17cc296:	41 5e                	pop    r14
     17cc298:	41 5f                	pop    r15
     17cc29a:	c3                   	ret
- +0x68 -> 0x17d1456 FDE=(24974422, 24974815)

## score=97 address-point=0x1899fe8
- +0x28 -> 0x16992c8; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23696072, 23696087)
     16992c8:	48 8b 87 80 00 00 00 	mov    rax,QWORD PTR [rdi+0x80]
     16992cf:	48 8b 97 88 00 00 00 	mov    rdx,QWORD PTR [rdi+0x88]
     16992d6:	c3                   	ret
- +0x30 -> 0x16992d8; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23696088, 23696098)
     16992d8:	48 8b 7f 70          	mov    rdi,QWORD PTR [rdi+0x70]
     16992dc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     16992df:	ff 60 48             	jmp    QWORD PTR [rax+0x48]
- +0x38 -> 0x16992e2; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(23696098, 23696263)
     16992e2:	41 57                	push   r15
     16992e4:	41 56                	push   r14
     16992e6:	53                   	push   rbx
     16992e7:	48 83 ec 10          	sub    rsp,0x10
     16992eb:	49 89 f6             	mov    r14,rsi
     16992ee:	48 89 fb             	mov    rbx,rdi
     16992f1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     16992f8:	00 00 
     16992fa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     16992ff:	48 8b 76 50          	mov    rsi,QWORD PTR [rsi+0x50]
     1699303:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1699306:	49 89 e7             	mov    r15,rsp
     1699309:	4c 89 ff             	mov    rdi,r15
     169930c:	ff 50 50             	call   QWORD PTR [rax+0x50]
     169930f:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     1699312:	4c 89 ff             	mov    rdi,r15
     1699315:	e8 d2 d3 41 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     169931a:	4d 85 ff             	test   r15,r15
     169931d:	74 0f                	je     169932e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d49a>
     169931f:	49 8b 76 50          	mov    rsi,QWORD PTR [r14+0x50]
     1699323:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1699326:	48 89 df             	mov    rdi,rbx
     1699329:	ff 50 50             	call   QWORD PTR [rax+0x50]
     169932c:	eb 37                	jmp    1699365 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d4d1>
- +0x68 -> 0x1699792 FDE=(23697298, 23697546)

## score=97 address-point=0x1891030
- +0x28 -> 0xd1b904; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(13744388, 13744396)
      d1b904:	48 8d 87 98 00 00 00 	lea    rax,[rdi+0x98]
      d1b90b:	c3                   	ret
- +0x30 -> 0xc44ec4; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(12865220, 12865228)
      c44ec4:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
      c44ecb:	c3                   	ret
- +0x38 -> 0x16362ea; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(23290602, 23290778)
     16362ea:	41 57                	push   r15
     16362ec:	41 56                	push   r14
     16362ee:	53                   	push   rbx
     16362ef:	48 83 ec 40          	sub    rsp,0x40
     16362f3:	49 89 f6             	mov    r14,rsi
     16362f6:	48 89 fb             	mov    rbx,rdi
     16362f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1636300:	00 00 
     1636302:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1636307:	48 8b 76 78          	mov    rsi,QWORD PTR [rsi+0x78]
     163630b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1636310:	e8 2b 7c 1b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1636315:	49 8b 7e 78          	mov    rdi,QWORD PTR [r14+0x78]
     1636319:	e8 7a 67 09 00       	call   16cca98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80c04>
     163631e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1636323:	48 89 c6             	mov    rsi,rax
     1636326:	e8 15 7c 1b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     163632b:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1636330:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     1636335:	48 89 df             	mov    rdi,rbx
     1636338:	4c 89 f6             	mov    rsi,r14
     163633b:	4c 89 fa             	mov    rdx,r15
     163633e:	e8 0b 37 09 00       	call   16c9a4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dbba>
     1636343:	4c 89 ff             	mov    rdi,r15
- +0x68 -> 0x1636406 FDE=(23290886, 23290978)

## score=97 address-point=0x188ff70
- +0x28 -> 0x162cda4; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23252388, 23252414)
     162cda4:	48 8b 87 80 01 00 00 	mov    rax,QWORD PTR [rdi+0x180]
     162cdab:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
     162cdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cdb5:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
     162cdbc:	ff e0                	jmp    rax
- +0x30 -> 0x162cdbe; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23252414, 23252440)
     162cdbe:	48 8b 87 80 01 00 00 	mov    rax,QWORD PTR [rdi+0x180]
     162cdc5:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
     162cdcc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cdcf:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
     162cdd6:	ff e0                	jmp    rax
- +0x38 -> 0x162cdd8; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(23252440, 23252732)
     162cdd8:	55                   	push   rbp
     162cdd9:	41 57                	push   r15
     162cddb:	41 56                	push   r14
     162cddd:	41 55                	push   r13
     162cddf:	41 54                	push   r12
     162cde1:	53                   	push   rbx
     162cde2:	48 83 ec 38          	sub    rsp,0x38
     162cde6:	49 89 ce             	mov    r14,rcx
     162cde9:	49 89 d7             	mov    r15,rdx
     162cdec:	48 89 fb             	mov    rbx,rdi
     162cdef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162cdf6:	00 00 
     162cdf8:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     162cdfd:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     162ce02:	48 8d 04 0a          	lea    rax,[rdx+rcx*1]
     162ce06:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     162ce0b:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
     162ce10:	8b 86 88 01 00 00    	mov    eax,DWORD PTR [rsi+0x188]
     162ce16:	48 8d 0c 02          	lea    rcx,[rdx+rax*1]
     162ce1a:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     162ce1f:	4c 39 f0             	cmp    rax,r14
     162ce22:	0f 8d 95 00 00 00    	jge    162cebd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2802b>
     162ce28:	4d 89 c4             	mov    r12,r8
     162ce2b:	49 89 f5             	mov    r13,rsi
- +0x68 -> 0x162c3c8 FDE=(23249864, 23249877)

## score=97 address-point=0x18851b0
- +0x28 -> 0x1427118; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(21131544, 21131554)
     1427118:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     142711c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     142711f:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
- +0x30 -> 0x142710e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(21131534, 21131544)
     142710e:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     1427112:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1427115:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
- +0x38 -> 0x15c5958; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22829400, 22829548)
     15c5958:	41 56                	push   r14
     15c595a:	53                   	push   rbx
     15c595b:	48 83 ec 18          	sub    rsp,0x18
     15c595f:	49 89 f6             	mov    r14,rsi
     15c5962:	48 89 fb             	mov    rbx,rdi
     15c5965:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c596c:	00 00 
     15c596e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     15c5973:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     15c5977:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15c597a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15c597d:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     15c5981:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15c5984:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15c5987:	84 c0                	test   al,al
     15c5989:	74 44                	je     15c59cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40af53>
     15c598b:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     15c598f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15c5992:	ff 50 40             	call   QWORD PTR [rax+0x40]
     15c5995:	48 89 e6             	mov    rsi,rsp
     15c5998:	48 89 06             	mov    QWORD PTR [rsi],rax
     15c599b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     15c599f:	4c 89 f2             	mov    rdx,r14
     15c59a2:	e8 75 d3 0b 00       	call   1682d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e88>
- +0x68 -> 0x15c5a1e FDE=(22829598, 22829611)

## score=97 address-point=0x1881c88
- +0x28 -> 0x1586db0; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22572464, 22572472)
     1586db0:	48 8b 87 a0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1a0]
     1586db7:	c3                   	ret
- +0x30 -> 0x1586db8; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22572472, 22572480)
     1586db8:	48 8b 87 a8 01 00 00 	mov    rax,QWORD PTR [rdi+0x1a8]
     1586dbf:	c3                   	ret
- +0x38 -> 0x1586dc0; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22572480, 22572924)
     1586dc0:	41 57                	push   r15
     1586dc2:	41 56                	push   r14
     1586dc4:	41 55                	push   r13
     1586dc6:	41 54                	push   r12
     1586dc8:	53                   	push   rbx
     1586dc9:	48 81 ec 20 01 00 00 	sub    rsp,0x120
     1586dd0:	49 89 d7             	mov    r15,rdx
     1586dd3:	49 89 f6             	mov    r14,rsi
     1586dd6:	48 89 fb             	mov    rbx,rdi
     1586dd9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1586de0:	00 00 
     1586de2:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
     1586de9:	00 
     1586dea:	4c 8d 6e 18          	lea    r13,[rsi+0x18]
     1586dee:	48 81 c6 10 01 00 00 	add    rsi,0x110
     1586df5:	41 80 be c0 01 00 00 	cmp    BYTE PTR [r14+0x1c0],0x0
     1586dfc:	00 
     1586dfd:	0f 84 89 00 00 00    	je     1586e8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc410>
     1586e03:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1586e08:	e8 31 fd ff ff       	call   1586b3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc0c2>
     1586e0d:	4c 8d 64 24 78       	lea    r12,[rsp+0x78]
     1586e12:	4c 89 e7             	mov    rdi,r12
     1586e15:	4c 89 ee             	mov    rsi,r13
     1586e18:	e8 49 30 14 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
- +0x68 -> 0x15876cc FDE=(22574796, 22574817)

## score=97 address-point=0x1870680
- +0x28 -> 0x14272cc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(21131980, 21131993)
     14272cc:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
     14272d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14272d3:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     14272d7:	ff e0                	jmp    rax
- +0x30 -> 0x13dafaa; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(20819882, 20819895)
     13dafaa:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
     13dafae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13dafb1:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
     13dafb5:	ff e0                	jmp    rax
- +0x38 -> 0x14272da; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(21131994, 21132122)
     14272da:	41 56                	push   r14
     14272dc:	53                   	push   rbx
     14272dd:	48 83 ec 48          	sub    rsp,0x48
     14272e1:	49 89 f6             	mov    r14,rsi
     14272e4:	48 89 fb             	mov    rbx,rdi
     14272e7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14272ee:	00 00 
     14272f0:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14272f5:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
     14272f9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14272fc:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14272ff:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1427302:	48 85 c0             	test   rax,rax
     1427305:	74 33                	je     142733a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c8be>
     1427307:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
     142730b:	0f 10 40 18          	movups xmm0,XMMWORD PTR [rax+0x18]
     142730f:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1427314:	8a 40 28             	mov    al,BYTE PTR [rax+0x28]
     1427317:	88 44 24 30          	mov    BYTE PTR [rsp+0x30],al
     142731b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     142731e:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     1427323:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     1427328:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     142732d:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
- +0x68 -> 0x14276ec FDE=(21133036, 21133197)

## score=97 address-point=0x18704c8
- +0x28 -> 0xabd11a; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(11260186, 11260199)
      abd11a:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      abd11e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      abd121:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      abd125:	ff e0                	jmp    rax
- +0x30 -> 0xabd128; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(11260200, 11260213)
      abd128:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      abd12c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      abd12f:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
      abd133:	ff e0                	jmp    rax
- +0x38 -> 0x1425d1e; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(21126430, 21127215)
     1425d1e:	55                   	push   rbp
     1425d1f:	41 57                	push   r15
     1425d21:	41 56                	push   r14
     1425d23:	41 55                	push   r13
     1425d25:	41 54                	push   r12
     1425d27:	53                   	push   rbx
     1425d28:	48 81 ec 98 00 00 00 	sub    rsp,0x98
     1425d2f:	49 89 f6             	mov    r14,rsi
     1425d32:	48 89 fb             	mov    rbx,rdi
     1425d35:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1425d3c:	00 00 
     1425d3e:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     1425d45:	00 
     1425d46:	8b 46 38             	mov    eax,DWORD PTR [rsi+0x38]
     1425d49:	83 f8 02             	cmp    eax,0x2
     1425d4c:	0f 84 18 01 00 00    	je     1425e6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b3ee>
     1425d52:	49 89 cf             	mov    r15,rcx
     1425d55:	49 89 d4             	mov    r12,rdx
     1425d58:	83 f8 01             	cmp    eax,0x1
     1425d5b:	74 1e                	je     1425d7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b2ff>
     1425d5d:	85 c0                	test   eax,eax
     1425d5f:	0f 85 d1 00 00 00    	jne    1425e36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b3ba>
     1425d65:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
     1425d69:	49 8d 76 28          	lea    rsi,[r14+0x28]
- +0x68 -> 0x14263d2 FDE=(21128146, 21128307)

## score=97 address-point=0x185e8f8
- +0x28 -> 0x125bd8e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(19250574, 19250584)
     125bd8e:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     125bd92:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     125bd95:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
- +0x30 -> 0x125bd98; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(19250584, 19250594)
     125bd98:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     125bd9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     125bd9f:	ff 60 40             	jmp    QWORD PTR [rax+0x40]
- +0x38 -> 0x125bda2; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(19250594, 19251143)
     125bda2:	41 57                	push   r15
     125bda4:	41 56                	push   r14
     125bda6:	41 55                	push   r13
     125bda8:	41 54                	push   r12
     125bdaa:	53                   	push   rbx
     125bdab:	48 81 ec 90 00 00 00 	sub    rsp,0x90
     125bdb2:	49 89 f6             	mov    r14,rsi
     125bdb5:	48 89 fb             	mov    rbx,rdi
     125bdb8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125bdbf:	00 00 
     125bdc1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     125bdc8:	00 
     125bdc9:	48 8b 77 18          	mov    rsi,QWORD PTR [rdi+0x18]
     125bdcd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     125bdd0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     125bdd5:	4c 89 ff             	mov    rdi,r15
     125bdd8:	ff 50 28             	call   QWORD PTR [rax+0x28]
     125bddb:	4c 89 f7             	mov    rdi,r14
     125bdde:	4c 89 fe             	mov    rsi,r15
     125bde1:	e8 48 fc 81 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     125bde6:	4c 89 ff             	mov    rdi,r15
     125bde9:	e8 a2 20 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     125bdee:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
     125bdf2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
- +0x68 -> 0xcd99c8 FDE=(13474248, 13474256)

## score=97 address-point=0x1855b90
- +0x28 -> 0x116662c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245164, 18245174)
     116662c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166630:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166633:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
- +0x30 -> 0x1166636; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245174, 18245184)
     1166636:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     116663a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     116663d:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
- +0x38 -> 0x1166640; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(18245184, 18245332)
     1166640:	41 56                	push   r14
     1166642:	53                   	push   rbx
     1166643:	48 83 ec 18          	sub    rsp,0x18
     1166647:	49 89 f6             	mov    r14,rsi
     116664a:	48 89 fb             	mov    rbx,rdi
     116664d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1166654:	00 00 
     1166656:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     116665b:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     116665f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166662:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1166665:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1166669:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     116666c:	ff 50 10             	call   QWORD PTR [rax+0x10]
     116666f:	84 c0                	test   al,al
     1166671:	74 44                	je     11666b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32dacd>
     1166673:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1166677:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     116667a:	ff 50 40             	call   QWORD PTR [rax+0x40]
     116667d:	48 89 e6             	mov    rsi,rsp
     1166680:	48 89 06             	mov    QWORD PTR [rsi],rax
     1166683:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     1166687:	4c 89 f2             	mov    rdx,r14
     116668a:	e8 8d c6 51 00       	call   1682d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e88>
- +0x68 -> 0x1166710 FDE=(18245392, 18245405)

## score=97 address-point=0x184eb30
- +0x28 -> 0xbf7896; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12548246, 12548251)
      bf7896:	48 8b 47 28          	mov    rax,QWORD PTR [rdi+0x28]
      bf789a:	c3                   	ret
- +0x30 -> 0xa68320; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(10912544, 10912554)
      a68320:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
      a68324:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a68327:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
- +0x38 -> 0x10d560a; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(17651210, 17651360)
     10d560a:	41 56                	push   r14
     10d560c:	53                   	push   rbx
     10d560d:	48 83 ec 28          	sub    rsp,0x28
     10d5611:	48 89 f3             	mov    rbx,rsi
     10d5614:	49 89 fe             	mov    r14,rdi
     10d5617:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10d561e:	00 00 
     10d5620:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10d5625:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     10d5629:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10d562c:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10d562f:	48 89 e6             	mov    rsi,rsp
     10d5632:	4c 89 36             	mov    QWORD PTR [rsi],r14
     10d5635:	48 89 5e 08          	mov    QWORD PTR [rsi+0x8],rbx
     10d5639:	48 8d 0d 04 86 a0 ff 	lea    rcx,[rip+0xffffffffffa08604]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
     10d5640:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
     10d5644:	48 8d 0d 71 00 00 00 	lea    rcx,[rip+0x71]        # 10d56bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29cad2>
     10d564b:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
     10d564f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10d5652:	48 89 c7             	mov    rdi,rax
     10d5655:	ff 51 18             	call   QWORD PTR [rcx+0x18]
     10d5658:	48 89 e7             	mov    rdi,rsp
     10d565b:	e8 ea 00 00 00       	call   10d574a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29cb60>
     10d5660:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
- +0x68 -> 0xb43750 FDE=(11810640, 11810648)

## score=97 address-point=0x184c738
- +0x28 -> 0x10a8da4; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(17468836, 17468844)
     10a8da4:	48 8d 87 90 10 00 00 	lea    rax,[rdi+0x1090]
     10a8dab:	c3                   	ret
- +0x30 -> 0x10a8dac; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(17468844, 17468852)
     10a8dac:	48 8d 87 58 14 00 00 	lea    rax,[rdi+0x1458]
     10a8db3:	c3                   	ret
- +0x38 -> 0x10a8db4; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(17468852, 17469101)
     10a8db4:	41 57                	push   r15
     10a8db6:	41 56                	push   r14
     10a8db8:	53                   	push   rbx
     10a8db9:	48 83 ec 50          	sub    rsp,0x50
     10a8dbd:	49 89 d7             	mov    r15,rdx
     10a8dc0:	49 89 f6             	mov    r14,rsi
     10a8dc3:	48 89 fb             	mov    rbx,rdi
     10a8dc6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a8dcd:	00 00 
     10a8dcf:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10a8dd4:	48 8b 7e 28          	mov    rdi,QWORD PTR [rsi+0x28]
     10a8dd8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a8ddb:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     10a8de1:	84 c0                	test   al,al
     10a8de3:	74 13                	je     10a8df8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27020e>
     10a8de5:	48 8d 43 08          	lea    rax,[rbx+0x8]
     10a8de9:	0f 57 c0             	xorps  xmm0,xmm0
     10a8dec:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     10a8df0:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a8df3:	e9 8b 00 00 00       	jmp    10a8e83 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270299>
     10a8df8:	49 8d be e8 05 00 00 	lea    rdi,[r14+0x5e8]
     10a8dff:	4c 89 fe             	mov    rsi,r15
     10a8e02:	e8 e7 68 9f ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     10a8e07:	84 c0                	test   al,al
- +0x68 -> 0x10a9298 FDE=(17470104, 17470133)

## score=97 address-point=0x1844158
- +0x28 -> 0xffc864; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(16762980, 16762988)
      ffc864:	48 8d 87 50 10 00 00 	lea    rax,[rdi+0x1050]
      ffc86b:	c3                   	ret
- +0x30 -> 0xffc86c; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(16762988, 16762996)
      ffc86c:	48 8d 87 f8 0d 00 00 	lea    rax,[rdi+0xdf8]
      ffc873:	c3                   	ret
- +0x38 -> 0xffc874; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(16762996, 16763293)
      ffc874:	41 57                	push   r15
      ffc876:	41 56                	push   r14
      ffc878:	53                   	push   rbx
      ffc879:	48 83 ec 50          	sub    rsp,0x50
      ffc87d:	49 89 d7             	mov    r15,rdx
      ffc880:	49 89 f6             	mov    r14,rsi
      ffc883:	48 89 fb             	mov    rbx,rdi
      ffc886:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ffc88d:	00 00 
      ffc88f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      ffc894:	48 8b 86 78 0f 00 00 	mov    rax,QWORD PTR [rsi+0xf78]
      ffc89b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      ffc8a0:	48 8b 8e 80 0f 00 00 	mov    rcx,QWORD PTR [rsi+0xf80]
      ffc8a7:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
      ffc8ac:	48 85 c9             	test   rcx,rcx
      ffc8af:	74 05                	je     ffc8b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3ccc>
      ffc8b1:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ffc8b6:	c6 44 24 40 01       	mov    BYTE PTR [rsp+0x40],0x1
      ffc8bb:	f0 ff 40 10          	lock inc DWORD PTR [rax+0x10]
      ffc8bf:	41 83 3f 01          	cmp    DWORD PTR [r15],0x1
      ffc8c3:	74 29                	je     ffc8ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3d04>
      ffc8c5:	41 80 be c8 21 00 00 	cmp    BYTE PTR [r14+0x21c8],0x0
      ffc8cc:	00 
      ffc8cd:	74 17                	je     ffc8e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3cfc>
- +0x68 -> 0xffd326 FDE=(16765734, 16765741)

## score=97 address-point=0x182cef0
- +0x28 -> 0xe0266a; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(14689898, 14689908)
      e0266a:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      e0266e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e02671:	ff 60 50             	jmp    QWORD PTR [rax+0x50]
- +0x30 -> 0xe02674; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(14689908, 14689918)
      e02674:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      e02678:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e0267b:	ff 60 58             	jmp    QWORD PTR [rax+0x58]
- +0x38 -> 0xe0267e; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(14689918, 14692393)
      e0267e:	55                   	push   rbp
      e0267f:	41 57                	push   r15
      e02681:	41 56                	push   r14
      e02683:	41 55                	push   r13
      e02685:	41 54                	push   r12
      e02687:	53                   	push   rbx
      e02688:	48 81 ec 58 09 00 00 	sub    rsp,0x958
      e0268f:	4d 89 c7             	mov    r15,r8
      e02692:	49 89 cd             	mov    r13,rcx
      e02695:	49 89 d6             	mov    r14,rdx
      e02698:	48 89 f5             	mov    rbp,rsi
      e0269b:	48 89 fb             	mov    rbx,rdi
      e0269e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e026a5:	00 00 
      e026a7:	48 89 84 24 50 09 00 	mov    QWORD PTR [rsp+0x950],rax
      e026ae:	00 
      e026af:	48 83 7f 58 00       	cmp    QWORD PTR [rdi+0x58],0x0
      e026b4:	0f 84 4a 07 00 00    	je     e02e04 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfe8a>
      e026ba:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
      e026be:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e026c1:	4c 8d a4 24 48 03 00 	lea    r12,[rsp+0x348]
      e026c8:	00 
      e026c9:	4c 89 e7             	mov    rdi,r12
      e026cc:	4c 89 f2             	mov    rdx,r14
- +0x68 -> 0xe037c6 FDE=(14694342, 14694516)

## score=97 address-point=0x182ce90
- +0x28 -> 0xe02290; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(14688912, 14688925)
      e02290:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
      e02294:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e02297:	ff a0 08 01 00 00    	jmp    QWORD PTR [rax+0x108]
- +0x30 -> 0xe0229e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(14688926, 14688939)
      e0229e:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      e022a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e022a5:	ff a0 90 00 00 00    	jmp    QWORD PTR [rax+0x90]
- +0x38 -> 0xe022ac; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(14688940, 14689152)
      e022ac:	55                   	push   rbp
      e022ad:	41 57                	push   r15
      e022af:	41 56                	push   r14
      e022b1:	53                   	push   rbx
      e022b2:	48 81 ec f8 05 00 00 	sub    rsp,0x5f8
      e022b9:	49 89 f6             	mov    r14,rsi
      e022bc:	48 89 fb             	mov    rbx,rdi
      e022bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e022c6:	00 00 
      e022c8:	48 89 84 24 f0 05 00 	mov    QWORD PTR [rsp+0x5f0],rax
      e022cf:	00 
      e022d0:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
      e022d4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e022d7:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      e022dc:	4c 89 ff             	mov    rdi,r15
      e022df:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      e022e5:	41 80 bf 00 03 00 00 	cmp    BYTE PTR [r15+0x300],0x0
      e022ec:	00 
      e022ed:	74 37                	je     e02326 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf3ac>
      e022ef:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e022f2:	48 8d bc 24 10 03 00 	lea    rdi,[rsp+0x310]
      e022f9:	00 
      e022fa:	48 89 de             	mov    rsi,rbx
      e022fd:	ff 50 78             	call   QWORD PTR [rax+0x78]
- +0x68 -> 0xe02652 FDE=(14689874, 14689887)

## score=97 address-point=0x1826ce8
- +0x28 -> 0xd88662; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(14190178, 14190191)
      d88662:	48 8b bf c0 03 00 00 	mov    rdi,QWORD PTR [rdi+0x3c0]
      d88669:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d8866c:	ff 60 28             	jmp    QWORD PTR [rax+0x28]
- +0x30 -> 0xd88670; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(14190192, 14190200)
      d88670:	48 8b 87 90 00 00 00 	mov    rax,QWORD PTR [rdi+0x90]
      d88677:	c3                   	ret
- +0x38 -> 0xd88678; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(14190200, 14190284)
      d88678:	41 56                	push   r14
      d8867a:	53                   	push   rbx
      d8867b:	50                   	push   rax
      d8867c:	49 89 f6             	mov    r14,rsi
      d8867f:	48 89 fb             	mov    rbx,rdi
      d88682:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d88685:	48 89 f7             	mov    rdi,rsi
      d88688:	ff 50 70             	call   QWORD PTR [rax+0x70]
      d8868b:	8b 40 38             	mov    eax,DWORD PTR [rax+0x38]
      d8868e:	83 f8 64             	cmp    eax,0x64
      d88691:	74 05                	je     d88698 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5571e>
      d88693:	83 f8 04             	cmp    eax,0x4
      d88696:	75 12                	jne    d886aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55730>
      d88698:	48 81 c3 d8 02 00 00 	add    rbx,0x2d8
      d8869f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d886a2:	48 83 c4 08          	add    rsp,0x8
      d886a6:	5b                   	pop    rbx
      d886a7:	41 5e                	pop    r14
      d886a9:	c3                   	ret
      d886aa:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d886ad:	4c 89 f7             	mov    rdi,r14
      d886b0:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
      d886b6:	84 c0                	test   al,al
      d886b8:	74 09                	je     d886c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55749>
- +0x68 -> 0xd886fa FDE=(14190330, 14190338)

## score=97 address-point=0x181ff80
- +0x28 -> 0xcdc1b6; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(13484470, 13484486)
      cdc1b6:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      cdc1ba:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cdc1bd:	48 8b 80 b0 01 00 00 	mov    rax,QWORD PTR [rax+0x1b0]
      cdc1c4:	ff e0                	jmp    rax
- +0x30 -> 0xcdc1c6; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(13484486, 13484499)
      cdc1c6:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      cdc1ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cdc1cd:	ff a0 f0 00 00 00    	jmp    QWORD PTR [rax+0xf0]
- +0x38 -> 0xcdc1d4; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(13484500, 13484693)
      cdc1d4:	41 57                	push   r15
      cdc1d6:	41 56                	push   r14
      cdc1d8:	41 54                	push   r12
      cdc1da:	53                   	push   rbx
      cdc1db:	48 83 ec 48          	sub    rsp,0x48
      cdc1df:	49 89 f6             	mov    r14,rsi
      cdc1e2:	49 89 ff             	mov    r15,rdi
      cdc1e5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cdc1ec:	00 00 
      cdc1ee:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      cdc1f3:	48 8b 47 28          	mov    rax,QWORD PTR [rdi+0x28]
      cdc1f7:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
      cdc1fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cdc1fe:	ff 50 10             	call   QWORD PTR [rax+0x10]
      cdc201:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      cdc204:	0f 10 48 10          	movups xmm1,XMMWORD PTR [rax+0x10]
      cdc208:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      cdc20d:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      cdc212:	41 0f 29 4c 24 10    	movaps XMMWORD PTR [r12+0x10],xmm1
      cdc218:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
      cdc21c:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      cdc221:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]
      cdc225:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      cdc228:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
- +0x68 -> 0xb89270 FDE=(12096112, 12096122)

## score=97 address-point=0x181fb38
- +0x28 -> 0xcd37ae; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(13449134, 13449147)
      cd37ae:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      cd37b2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd37b5:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]
      cd37b9:	ff e0                	jmp    rax
- +0x30 -> 0xab593c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(11229500, 11229513)
      ab593c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      ab5940:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ab5943:	48 8b 40 30          	mov    rax,QWORD PTR [rax+0x30]
      ab5947:	ff e0                	jmp    rax
- +0x38 -> 0xcd37bc; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(13449148, 13449644)
      cd37bc:	41 56                	push   r14
      cd37be:	53                   	push   rbx
      cd37bf:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
      cd37c6:	49 89 f6             	mov    r14,rsi
      cd37c9:	48 89 fb             	mov    rbx,rdi
      cd37cc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cd37d3:	00 00 
      cd37d5:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      cd37dc:	00 
      cd37dd:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      cd37e2:	e8 0b 03 00 00       	call   cd3af2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x220a92>
      cd37e7:	48 8b 7b 60          	mov    rdi,QWORD PTR [rbx+0x60]
      cd37eb:	e8 72 6c da ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      cd37f0:	c6 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],0x20
      cd37f7:	20 
      cd37f8:	48 89 84 24 81 00 00 	mov    QWORD PTR [rsp+0x81],rax
      cd37ff:	00 
      cd3800:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      cd3805:	80 4f e0 08          	or     BYTE PTR [rdi-0x20],0x8
      cd3809:	48 89 94 24 89 00 00 	mov    QWORD PTR [rsp+0x89],rdx
      cd3810:	00 
      cd3811:	c6 84 24 91 00 00 00 	mov    BYTE PTR [rsp+0x91],0x0
      cd3818:	00 
      cd3819:	48 8b 57 d8          	mov    rdx,QWORD PTR [rdi-0x28]
- +0x68 -> 0xcd39ac FDE=(13449644, 13449810)

## score=96 address-point=0x1883358
- +0x28 -> 0x159defa; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22667002, 22667052)
     159defa:	48 8b 87 00 01 00 00 	mov    rax,QWORD PTR [rdi+0x100]
     159df01:	48 85 c0             	test   rax,rax
     159df04:	48 8d 0d f5 9c 42 00 	lea    rcx,[rip+0x429cf5]        # 19c7c00 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x90848>
     159df0b:	48 0f 45 c8          	cmovne rcx,rax
     159df0f:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     159df13:	48 85 c0             	test   rax,rax
     159df16:	48 8d 15 f3 9b 42 00 	lea    rdx,[rip+0x429bf3]        # 19c7b10 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x90758>
     159df1d:	48 0f 45 d0          	cmovne rdx,rax
     159df21:	31 c0                	xor    eax,eax
     159df23:	f6 41 10 01          	test   BYTE PTR [rcx+0x10],0x1
     159df27:	48 0f 45 c2          	cmovne rax,rdx
     159df2b:	c3                   	ret
- +0x30 -> 0x159df2c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22667052, 22667087)
     159df2c:	48 8b 87 08 01 00 00 	mov    rax,QWORD PTR [rdi+0x108]
     159df33:	48 85 c0             	test   rax,rax
     159df36:	48 8d 0d 13 9b 42 00 	lea    rcx,[rip+0x429b13]        # 19c7a50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x90698>
     159df3d:	48 0f 45 c8          	cmovne rcx,rax
     159df41:	31 c0                	xor    eax,eax
     159df43:	f6 87 f8 00 00 00 02 	test   BYTE PTR [rdi+0xf8],0x2
     159df4a:	48 0f 45 c1          	cmovne rax,rcx
     159df4e:	c3                   	ret
- +0x38 -> 0x159df50; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(22667088, 22667486)
     159df50:	55                   	push   rbp
     159df51:	41 57                	push   r15
     159df53:	41 56                	push   r14
     159df55:	41 55                	push   r13
     159df57:	41 54                	push   r12
     159df59:	53                   	push   rbx
     159df5a:	50                   	push   rax
     159df5b:	48 89 fb             	mov    rbx,rdi
     159df5e:	4c 8d be d8 01 00 00 	lea    r15,[rsi+0x1d8]
     159df65:	80 be 40 02 00 00 00 	cmp    BYTE PTR [rsi+0x240],0x0
     159df6c:	74 10                	je     159df7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e3502>
     159df6e:	48 89 df             	mov    rdi,rbx
     159df71:	4c 89 fe             	mov    rsi,r15
     159df74:	e8 c7 5a fc ff       	call   1563a40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a8fc4>
     159df79:	e9 37 01 00 00       	jmp    159e0b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e3639>
     159df7e:	49 89 f6             	mov    r14,rsi
     159df81:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     159df84:	48 89 f7             	mov    rdi,rsi
     159df87:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
     159df8d:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
     159df90:	4c 89 f7             	mov    rdi,r14
     159df93:	48 89 c6             	mov    rsi,rax
     159df96:	ff 91 c0 00 00 00    	call   QWORD PTR [rcx+0xc0]
     159df9c:	89 c5                	mov    ebp,eax
- +0x68 -> none FDE=None

## score=96 address-point=0x186d348
- +0x28 -> 0x13e4140; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(20857152, 20857174)
     13e4140:	53                   	push   rbx
     13e4141:	48 89 fb             	mov    rbx,rdi
     13e4144:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13e4147:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
     13e414d:	48 8b 83 e0 00 00 00 	mov    rax,QWORD PTR [rbx+0xe0]
     13e4154:	5b                   	pop    rbx
     13e4155:	c3                   	ret
- +0x30 -> 0x13e4156; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(20857174, 20857196)
     13e4156:	53                   	push   rbx
     13e4157:	48 89 fb             	mov    rbx,rdi
     13e415a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13e415d:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
     13e4163:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
     13e416a:	5b                   	pop    rbx
     13e416b:	c3                   	ret
- +0x38 -> 0x13e2fa2; score=3; saves-dest-rdi; FDE=(20852642, 20852821)
     13e2fa2:	55                   	push   rbp
     13e2fa3:	41 57                	push   r15
     13e2fa5:	41 56                	push   r14
     13e2fa7:	53                   	push   rbx
     13e2fa8:	48 83 ec 18          	sub    rsp,0x18
     13e2fac:	49 89 fe             	mov    r14,rdi
     13e2faf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13e2fb6:	00 00 
     13e2fb8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     13e2fbd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13e2fc0:	6a 01                	push   0x1
     13e2fc2:	5e                   	pop    rsi
     13e2fc3:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     13e2fc8:	48 89 e1             	mov    rcx,rsp
     13e2fcb:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     13e2fd1:	89 c3                	mov    ebx,eax
     13e2fd3:	66 0f 57 c0          	xorpd  xmm0,xmm0
     13e2fd7:	85 c0                	test   eax,eax
     13e2fd9:	75 58                	jne    13e3033 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2285b7>
     13e2fdb:	41 8b 6e 5c          	mov    ebp,DWORD PTR [r14+0x5c]
     13e2fdf:	31 c0                	xor    eax,eax
     13e2fe1:	85 ed                	test   ebp,ebp
     13e2fe3:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
     13e2fe6:	0f 95 c0             	setne  al
- +0x68 -> 0xb00260 FDE=(11534944, 11534952)

## score=96 address-point=0x1869b58
- +0x28 -> 0x13901f6; score=30; no-extra-incoming-args;rax<-this-field; FDE=(20513270, 20513424)
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
- +0x30 -> 0x1390290; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(20513424, 20513437)
     1390290:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
     1390294:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390297:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     139029b:	ff e0                	jmp    rax
- +0x38 -> 0x139029e; score=25; reads-this-rsi;writes-dest-rdi;saves-dest-rdi; FDE=(20513438, 20514065)
     139029e:	41 56                	push   r14
     13902a0:	53                   	push   rbx
     13902a1:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     13902a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13902af:	00 00 
     13902b1:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     13902b8:	00 
     13902b9:	83 bf c8 09 00 00 01 	cmp    DWORD PTR [rdi+0x9c8],0x1
     13902c0:	0f 85 d2 01 00 00    	jne    1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902c6:	48 89 fb             	mov    rbx,rdi
     13902c9:	48 8b bf a8 08 00 00 	mov    rdi,QWORD PTR [rdi+0x8a8]
     13902d0:	48 85 ff             	test   rdi,rdi
     13902d3:	0f 84 bf 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902d9:	48 83 bb b8 08 00 00 	cmp    QWORD PTR [rbx+0x8b8],0x0
     13902e0:	00 
     13902e1:	0f 84 b1 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13902ea:	ff 50 30             	call   QWORD PTR [rax+0x30]
     13902ed:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
     13902f1:	8b b0 80 00 00 00    	mov    esi,DWORD PTR [rax+0x80]
     13902f7:	e8 43 e9 24 00       	call   15dec3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4241c3>
     13902fc:	89 c1                	mov    ecx,eax
     13902fe:	48 89 c2             	mov    rdx,rax
     1390301:	48 c1 ea 20          	shr    rdx,0x20
- +0x68 -> 0xa3fa60 FDE=(10746464, 10746467)

## score=96 address-point=0x18664d0
- +0x28 -> 0x131c5c2; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(20039106, 20040246)
     131c5c2:	55                   	push   rbp
     131c5c3:	41 57                	push   r15
     131c5c5:	41 56                	push   r14
     131c5c7:	41 55                	push   r13
     131c5c9:	41 54                	push   r12
     131c5cb:	53                   	push   rbx
     131c5cc:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
     131c5d3:	48 89 fb             	mov    rbx,rdi
     131c5d6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131c5dd:	00 00 
     131c5df:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     131c5e6:	00 
     131c5e7:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131c5eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c5ee:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c5f1:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131c5f4:	e8 0c e1 ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131c5f9:	31 c9                	xor    ecx,ecx
     131c5fb:	31 d2                	xor    edx,edx
     131c5fd:	83 f8 0a             	cmp    eax,0xa
     131c600:	0f 87 d6 02 00 00    	ja     131c8dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e60>
     131c606:	89 c0                	mov    eax,eax
     131c608:	48 8d 35 11 b8 07 ff 	lea    rsi,[rip+0xffffffffff07b811]        # 397e20 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x4a01>
     131c60f:	48 63 04 86          	movsxd rax,DWORD PTR [rsi+rax*4]
- +0x30 -> 0x131ca36; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(20040246, 20040999)
     131ca36:	41 57                	push   r15
     131ca38:	41 56                	push   r14
     131ca3a:	53                   	push   rbx
     131ca3b:	48 81 ec f0 00 00 00 	sub    rsp,0xf0
     131ca42:	49 89 fe             	mov    r14,rdi
     131ca45:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131ca4c:	00 00 
     131ca4e:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     131ca55:	00 
     131ca56:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131ca5a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131ca5d:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131ca60:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131ca63:	e8 9d dc ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131ca68:	8d 48 fb             	lea    ecx,[rax-0x5]
     131ca6b:	83 f9 06             	cmp    ecx,0x6
     131ca6e:	73 58                	jae    131cac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16204c>
     131ca70:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     131ca74:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     131ca77:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     131ca7b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131ca7e:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131ca81:	4c 8d b4 24 98 00 00 	lea    r14,[rsp+0x98]
     131ca88:	00 
- +0x38 -> 0x131cd28; score=13; reads-this-rsi;saves-dest-rdi; FDE=(20041000, 20041329)
     131cd28:	41 56                	push   r14
     131cd2a:	53                   	push   rbx
     131cd2b:	48 83 ec 38          	sub    rsp,0x38
     131cd2f:	48 89 fb             	mov    rbx,rdi
     131cd32:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131cd39:	00 00 
     131cd3b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     131cd40:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131cd44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131cd47:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131cd4a:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131cd4d:	e8 b3 d9 ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131cd52:	8d 48 fb             	lea    ecx,[rax-0x5]
     131cd55:	83 f9 06             	cmp    ecx,0x6
     131cd58:	73 70                	jae    131cdca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16234e>
     131cd5a:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131cd5e:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131cd61:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131cd65:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131cd68:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131cd6b:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
     131cd70:	48 89 df             	mov    rdi,rbx
     131cd73:	48 89 c6             	mov    rsi,rax
     131cd76:	e8 af d7 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
- +0x68 -> 0x1345d9c FDE=(20209052, 20209305)

## score=96 address-point=0x1862b60
- +0x28 -> 0x12e0c10; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(19794960, 19794968)
     12e0c10:	48 8d 87 38 01 00 00 	lea    rax,[rdi+0x138]
     12e0c17:	c3                   	ret
- +0x30 -> 0x12e0c18; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(19794968, 19794976)
     12e0c18:	48 8d 87 00 05 00 00 	lea    rax,[rdi+0x500]
     12e0c1f:	c3                   	ret
- +0x38 -> 0x12e0c20; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(19794976, 19795518)
     12e0c20:	41 57                	push   r15
     12e0c22:	41 56                	push   r14
     12e0c24:	41 54                	push   r12
     12e0c26:	53                   	push   rbx
     12e0c27:	48 81 ec 98 00 00 00 	sub    rsp,0x98
     12e0c2e:	49 89 f6             	mov    r14,rsi
     12e0c31:	48 89 fb             	mov    rbx,rdi
     12e0c34:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12e0c3b:	00 00 
     12e0c3d:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     12e0c44:	00 
     12e0c45:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12e0c48:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     12e0c4d:	4c 89 ff             	mov    rdi,r15
     12e0c50:	48 89 de             	mov    rsi,rbx
     12e0c53:	ff 50 28             	call   QWORD PTR [rax+0x28]
     12e0c56:	4c 89 f7             	mov    rdi,r14
     12e0c59:	4c 89 fe             	mov    rsi,r15
     12e0c5c:	e8 cd ad 79 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12e0c61:	4c 89 ff             	mov    rdi,r15
     12e0c64:	e8 27 d2 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e0c69:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12e0c6c:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     12e0c71:	4c 89 ff             	mov    rdi,r15
- +0x68 -> none FDE=None

## score=96 address-point=0x1861f68
- +0x28 -> 0x12bd492; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(19649682, 19651774)
     12bd492:	55                   	push   rbp
     12bd493:	41 57                	push   r15
     12bd495:	41 56                	push   r14
     12bd497:	41 55                	push   r13
     12bd499:	41 54                	push   r12
     12bd49b:	53                   	push   rbx
     12bd49c:	48 81 ec 18 01 00 00 	sub    rsp,0x118
     12bd4a3:	48 89 fb             	mov    rbx,rdi
     12bd4a6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12bd4ad:	00 00 
     12bd4af:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     12bd4b6:	00 
     12bd4b7:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
     12bd4bb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12bd4be:	ff 50 38             	call   QWORD PTR [rax+0x38]
     12bd4c1:	84 c0                	test   al,al
     12bd4c3:	74 2e                	je     12bd4f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102a77>
     12bd4c5:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
     12bd4c9:	48 8d 35 78 54 07 ff 	lea    rsi,[rip+0xffffffffff075478]        # 332948 <_ZTSSt12bad_any_cast@@Base-0x5d880>
     12bd4d0:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     12bd4d7:	00 
     12bd4d8:	4c 89 f7             	mov    rdi,r14
     12bd4db:	e8 9e c5 7b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12bd4e0:	48 8b 03             	mov    rax,QWORD PTR [rbx]
- +0x30 -> 0x12bc552; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(19645778, 19647725)
     12bc552:	55                   	push   rbp
     12bc553:	41 57                	push   r15
     12bc555:	41 56                	push   r14
     12bc557:	41 55                	push   r13
     12bc559:	41 54                	push   r12
     12bc55b:	53                   	push   rbx
     12bc55c:	48 81 ec 58 02 00 00 	sub    rsp,0x258
     12bc563:	48 89 fd             	mov    rbp,rdi
     12bc566:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12bc56d:	00 00 
     12bc56f:	48 89 84 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rax
     12bc576:	00 
     12bc577:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
     12bc57b:	0f b6 75 69          	movzx  esi,BYTE PTR [rbp+0x69]
     12bc57f:	e8 2a fe ff ff       	call   12bc3ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101932>
     12bc584:	84 c0                	test   al,al
     12bc586:	0f 85 5f 06 00 00    	jne    12bcbeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10216f>
     12bc58c:	80 7d 6b 00          	cmp    BYTE PTR [rbp+0x6b],0x0
     12bc590:	0f 84 55 06 00 00    	je     12bcbeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10216f>
     12bc596:	80 7d 6c 00          	cmp    BYTE PTR [rbp+0x6c],0x0
     12bc59a:	0f 84 4b 06 00 00    	je     12bcbeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10216f>
     12bc5a0:	48 83 a4 24 e8 00 00 	and    QWORD PTR [rsp+0xe8],0x0
     12bc5a7:	00 00 
     12bc5a9:	48 8d 05 90 73 5e 00 	lea    rax,[rip+0x5e7390]        # 18a3940 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x10880>
- +0x38 -> 0x12bc2c6; score=13; reads-this-rsi;saves-dest-rdi; FDE=(19645126, 19645311)
     12bc2c6:	41 56                	push   r14
     12bc2c8:	53                   	push   rbx
     12bc2c9:	48 83 ec 28          	sub    rsp,0x28
     12bc2cd:	48 89 fb             	mov    rbx,rdi
     12bc2d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12bc2d7:	00 00 
     12bc2d9:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     12bc2de:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
     12bc2e1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12bc2e4:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12bc2e7:	84 c0                	test   al,al
     12bc2e9:	74 4b                	je     12bc336 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1018ba>
     12bc2eb:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
     12bc2ef:	48 8d 35 a5 c5 06 ff 	lea    rsi,[rip+0xffffffffff06c5a5]        # 32889b <_ZTSSt12bad_any_cast@@Base-0x6792d>
     12bc2f6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     12bc2fb:	4c 89 f7             	mov    rdi,r14
     12bc2fe:	e8 7b d7 7b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12bc303:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12bc306:	48 89 df             	mov    rdi,rbx
     12bc309:	be 93 01 00 00       	mov    esi,0x193
     12bc30e:	4c 89 f2             	mov    rdx,r14
     12bc311:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12bc314:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     12bc319:	e8 72 1b 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- +0x68 -> 0x12be0e2 FDE=(19652834, 19652843)

## score=96 address-point=0x185ca70
- +0x28 -> 0x1217f1e; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(18972446, 18972454)
     1217f1e:	48 8d 87 e8 01 00 00 	lea    rax,[rdi+0x1e8]
     1217f25:	c3                   	ret
- +0x30 -> 0x1217f26; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(18972454, 18972462)
     1217f26:	48 8d 87 10 02 00 00 	lea    rax,[rdi+0x210]
     1217f2d:	c3                   	ret
- +0x38 -> 0x1217314; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(18969364, 18971614)
     1217314:	55                   	push   rbp
     1217315:	41 57                	push   r15
     1217317:	41 56                	push   r14
     1217319:	41 55                	push   r13
     121731b:	41 54                	push   r12
     121731d:	53                   	push   rbx
     121731e:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
     1217325:	48 89 f3             	mov    rbx,rsi
     1217328:	49 89 fd             	mov    r13,rdi
     121732b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1217332:	00 00 
     1217334:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     121733b:	00 
     121733c:	31 c0                	xor    eax,eax
     121733e:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1217343:	80 7e 28 00          	cmp    BYTE PTR [rsi+0x28],0x0
     1217347:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi
     121734c:	74 42                	je     1217390 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c914>
     121734e:	48 89 df             	mov    rdi,rbx
     1217351:	e8 88 08 00 00       	call   1217bde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d162>
     1217356:	4d 8d 7d 18          	lea    r15,[r13+0x18]
     121735a:	4c 89 ff             	mov    rdi,r15
     121735d:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1217362:	48 89 de             	mov    rsi,rbx
- +0x68 -> 0x9d81d0 FDE=(10322384, 10322387)

## score=96 address-point=0x185a348
- +0x28 -> 0x11c1398; score=28; no-extra-incoming-args;rax<-saved-this; FDE=(18617240, 18617461)
     11c1398:	55                   	push   rbp
     11c1399:	41 57                	push   r15
     11c139b:	41 56                	push   r14
     11c139d:	53                   	push   rbx
     11c139e:	50                   	push   rax
     11c139f:	80 7f 48 00          	cmp    BYTE PTR [rdi+0x48],0x0
     11c13a3:	0f 84 a3 00 00 00    	je     11c144c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69d0>
     11c13a9:	48 89 fb             	mov    rbx,rdi
     11c13ac:	c6 47 48 00          	mov    BYTE PTR [rdi+0x48],0x0
     11c13b0:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
     11c13b7:	e8 6a d5 8e ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
     11c13bc:	4c 8d 73 50          	lea    r14,[rbx+0x50]
     11c13c0:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     11c13c4:	4c 8d 7b 58          	lea    r15,[rbx+0x58]
     11c13c8:	4c 39 f8             	cmp    rax,r15
     11c13cb:	74 1c                	je     11c13e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x696d>
     11c13cd:	80 b8 b0 00 00 00 00 	cmp    BYTE PTR [rax+0xb0],0x0
     11c13d4:	40 0f 94 c5          	sete   bpl
     11c13d8:	75 12                	jne    11c13ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6970>
     11c13da:	48 89 c7             	mov    rdi,rax
     11c13dd:	e8 00 d4 8d ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     11c13e2:	4c 39 f8             	cmp    rax,r15
     11c13e5:	75 e6                	jne    11c13cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6951>
     11c13e7:	eb 03                	jmp    11c13ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6970>
- +0x30 -> 0x11c161c; score=35; no-extra-incoming-args;rax<-this-field;few-calls;compact; FDE=(18617884, 18617978)
     11c161c:	41 57                	push   r15
     11c161e:	41 56                	push   r14
     11c1620:	53                   	push   rbx
     11c1621:	80 7f 48 00          	cmp    BYTE PTR [rdi+0x48],0x0
     11c1625:	74 34                	je     11c165b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6bdf>
     11c1627:	48 89 fb             	mov    rbx,rdi
     11c162a:	4c 8d 77 50          	lea    r14,[rdi+0x50]
     11c162e:	48 8b 47 50          	mov    rax,QWORD PTR [rdi+0x50]
     11c1632:	4c 8d 7f 58          	lea    r15,[rdi+0x58]
     11c1636:	4c 39 f8             	cmp    rax,r15
     11c1639:	74 13                	je     11c164e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6bd2>
     11c163b:	80 b8 b0 00 00 00 00 	cmp    BYTE PTR [rax+0xb0],0x0
     11c1642:	75 1d                	jne    11c1661 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6be5>
     11c1644:	48 89 c7             	mov    rdi,rax
     11c1647:	e8 96 d1 8d ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     11c164c:	eb e8                	jmp    11c1636 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6bba>
     11c164e:	4c 89 f7             	mov    rdi,r14
     11c1651:	5b                   	pop    rbx
     11c1652:	41 5e                	pop    r14
     11c1654:	41 5f                	pop    r15
     11c1656:	e9 5f fe ff ff       	jmp    11c14ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a3e>
     11c165b:	5b                   	pop    rbx
     11c165c:	41 5e                	pop    r14
     11c165e:	41 5f                	pop    r15
- +0x38 -> 0x11c167a; score=30; reads-this-rsi;writes-dest-rdi;saves-this-rsi;saves-dest-rdi; FDE=(18617978, 18618700)
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
     11c16a2:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     11c16a7:	0f 57 c0             	xorps  xmm0,xmm0
     11c16aa:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     11c16ad:	48 8b 7e 50          	mov    rdi,QWORD PTR [rsi+0x50]
     11c16b1:	49 83 c6 58          	add    r14,0x58
     11c16b5:	4c 89 f6             	mov    rsi,r14
     11c16b8:	e8 8f 02 00 00       	call   11c194c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ed0>
     11c16bd:	4c 39 f0             	cmp    rax,r14
     11c16c0:	0f 84 c3 01 00 00    	je     11c1889 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e0d>
     11c16c6:	48 89 c5             	mov    rbp,rax
     11c16c9:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
- +0x68 -> 0x11c1fa2 FDE=(18620322, 18620374)

## score=96 address-point=0x1850698
- +0x28 -> 0x155e8c6; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407366, 22407375)
     155e8c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8c9:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
     155e8cd:	ff e0                	jmp    rax
- +0x30 -> 0x155e8d0; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407376, 22407385)
     155e8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8d3:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
     155e8d7:	ff e0                	jmp    rax
- +0x38 -> 0x10fbdf6; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(17808886, 17809165)
     10fbdf6:	41 57                	push   r15
     10fbdf8:	41 56                	push   r14
     10fbdfa:	41 54                	push   r12
     10fbdfc:	53                   	push   rbx
     10fbdfd:	48 83 ec 48          	sub    rsp,0x48
     10fbe01:	49 89 ce             	mov    r14,rcx
     10fbe04:	49 89 d4             	mov    r12,rdx
     10fbe07:	49 89 f7             	mov    r15,rsi
     10fbe0a:	48 89 fb             	mov    rbx,rdi
     10fbe0d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10fbe14:	00 00 
     10fbe16:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     10fbe1b:	0f 57 c0             	xorps  xmm0,xmm0
     10fbe1e:	48 89 e1             	mov    rcx,rsp
     10fbe21:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     10fbe24:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     10fbe29:	48 81 c6 b0 0d 00 00 	add    rsi,0xdb0
     10fbe30:	4c 89 fa             	mov    rdx,r15
     10fbe33:	e8 36 13 00 00       	call   10fd16e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c4584>
     10fbe38:	48 89 e1             	mov    rcx,rsp
     10fbe3b:	48 89 df             	mov    rdi,rbx
     10fbe3e:	4c 89 e6             	mov    rsi,r12
     10fbe41:	4c 89 fa             	mov    rdx,r15
     10fbe44:	e8 25 13 00 00       	call   10fd16e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c4584>
- +0x68 -> 0x9d7de0 FDE=(10321376, 10321377)

## score=96 address-point=0x1839690
- +0x28 -> 0x155e8c6; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407366, 22407375)
     155e8c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8c9:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
     155e8cd:	ff e0                	jmp    rax
- +0x30 -> 0x155e8d0; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407376, 22407385)
     155e8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8d3:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
     155e8d7:	ff e0                	jmp    rax
- +0x38 -> 0xf1f2d0; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(15856336, 15856869)
      f1f2d0:	55                   	push   rbp
      f1f2d1:	41 57                	push   r15
      f1f2d3:	41 56                	push   r14
      f1f2d5:	41 55                	push   r13
      f1f2d7:	41 54                	push   r12
      f1f2d9:	53                   	push   rbx
      f1f2da:	48 81 ec 98 00 00 00 	sub    rsp,0x98
      f1f2e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f1f2e8:	00 00 
      f1f2ea:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      f1f2f1:	00 
      f1f2f2:	48 8b 87 10 02 00 00 	mov    rax,QWORD PTR [rdi+0x210]
      f1f2f9:	48 0b 87 28 02 00 00 	or     rax,QWORD PTR [rdi+0x228]
      f1f300:	0f 84 b5 01 00 00    	je     f1f4bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe68d1>
      f1f306:	49 89 f4             	mov    r12,rsi
      f1f309:	48 89 fb             	mov    rbx,rdi
      f1f30c:	48 89 14 24          	mov    QWORD PTR [rsp],rdx
      f1f310:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      f1f315:	4c 8d b6 b0 0d 00 00 	lea    r14,[rsi+0xdb0]
      f1f31c:	4c 89 f7             	mov    rdi,r14
      f1f31f:	e8 e6 cd ee ff       	call   e0c10a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9190>
      f1f324:	49 89 c5             	mov    r13,rax
      f1f327:	48 89 d5             	mov    rbp,rdx
      f1f32a:	4c 89 f7             	mov    rdi,r14
- +0x68 -> 0x9d7de0 FDE=(10321376, 10321377)

## score=96 address-point=0x18370c8
- +0x28 -> 0x155e8c6; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407366, 22407375)
     155e8c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8c9:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
     155e8cd:	ff e0                	jmp    rax
- +0x30 -> 0x155e8d0; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407376, 22407385)
     155e8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8d3:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
     155e8d7:	ff e0                	jmp    rax
- +0x38 -> 0xf04446; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(15746118, 15746709)
      f04446:	55                   	push   rbp
      f04447:	41 57                	push   r15
      f04449:	41 56                	push   r14
      f0444b:	41 55                	push   r13
      f0444d:	41 54                	push   r12
      f0444f:	53                   	push   rbx
      f04450:	48 81 ec 98 00 00 00 	sub    rsp,0x98
      f04457:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f0445e:	00 00 
      f04460:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      f04467:	00 
      f04468:	8a 87 18 02 00 00    	mov    al,BYTE PTR [rdi+0x218]
      f0446e:	0a 87 19 02 00 00    	or     al,BYTE PTR [rdi+0x219]
      f04474:	0f 84 f1 01 00 00    	je     f0466b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcba81>
      f0447a:	49 89 f4             	mov    r12,rsi
      f0447d:	48 89 fb             	mov    rbx,rdi
      f04480:	48 89 14 24          	mov    QWORD PTR [rsp],rdx
      f04484:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      f04489:	4c 8d b6 b0 0d 00 00 	lea    r14,[rsi+0xdb0]
      f04490:	4c 89 f7             	mov    rdi,r14
      f04493:	e8 72 7c f0 ff       	call   e0c10a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9190>
      f04498:	49 89 c5             	mov    r13,rax
      f0449b:	48 89 d5             	mov    rbp,rdx
      f0449e:	4c 89 f7             	mov    rdi,r14
- +0x68 -> 0x9d7de0 FDE=(10321376, 10321377)

## score=96 address-point=0x1836ab0
- +0x28 -> 0x155e8c6; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407366, 22407375)
     155e8c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8c9:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
     155e8cd:	ff e0                	jmp    rax
- +0x30 -> 0x155e8d0; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407376, 22407385)
     155e8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8d3:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
     155e8d7:	ff e0                	jmp    rax
- +0x38 -> 0xf02fbe; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(15740862, 15741065)
      f02fbe:	55                   	push   rbp
      f02fbf:	41 57                	push   r15
      f02fc1:	41 56                	push   r14
      f02fc3:	41 55                	push   r13
      f02fc5:	41 54                	push   r12
      f02fc7:	53                   	push   rbx
      f02fc8:	48 83 ec 28          	sub    rsp,0x28
      f02fcc:	48 89 cb             	mov    rbx,rcx
      f02fcf:	49 89 d7             	mov    r15,rdx
      f02fd2:	49 89 f4             	mov    r12,rsi
      f02fd5:	49 89 fe             	mov    r14,rdi
      f02fd8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f02fdf:	00 00 
      f02fe1:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      f02fe6:	e8 31 ff ff ff       	call   f02f1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca332>
      f02feb:	84 c0                	test   al,al
      f02fed:	74 76                	je     f03065 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca47b>
      f02fef:	41 80 bc 24 30 09 00 	cmp    BYTE PTR [r12+0x930],0x0
      f02ff6:	00 00 
      f02ff8:	74 33                	je     f0302d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca443>
      f02ffa:	4d 8d ac 24 c0 04 00 	lea    r13,[r12+0x4c0]
      f03001:	00 
      f03002:	4c 89 ef             	mov    rdi,r13
      f03005:	e8 95 4a 07 00       	call   f77a9f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eeb5>
- +0x68 -> 0x9d7de0 FDE=(10321376, 10321377)

## score=96 address-point=0x1834920
- +0x28 -> 0x155e8c6; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407366, 22407375)
     155e8c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8c9:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
     155e8cd:	ff e0                	jmp    rax
- +0x30 -> 0x155e8d0; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22407376, 22407385)
     155e8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     155e8d3:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
     155e8d7:	ff e0                	jmp    rax
- +0x38 -> 0xee8c0a; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(15633418, 15633730)
      ee8c0a:	55                   	push   rbp
      ee8c0b:	41 57                	push   r15
      ee8c0d:	41 56                	push   r14
      ee8c0f:	41 55                	push   r13
      ee8c11:	41 54                	push   r12
      ee8c13:	53                   	push   rbx
      ee8c14:	48 83 ec 28          	sub    rsp,0x28
      ee8c18:	49 89 f6             	mov    r14,rsi
      ee8c1b:	48 89 fb             	mov    rbx,rdi
      ee8c1e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ee8c25:	00 00 
      ee8c27:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ee8c2c:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
      ee8c32:	0f 57 c0             	xorps  xmm0,xmm0
      ee8c35:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      ee8c39:	80 be 30 09 00 00 00 	cmp    BYTE PTR [rsi+0x930],0x0
      ee8c40:	74 2d                	je     ee8c6f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb0085>
      ee8c42:	4d 8d be c0 04 00 00 	lea    r15,[r14+0x4c0]
      ee8c49:	4c 89 ff             	mov    rdi,r15
      ee8c4c:	e8 19 02 00 00       	call   ee8e6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb0280>
      ee8c51:	84 c0                	test   al,al
      ee8c53:	74 1a                	je     ee8c6f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb0085>
      ee8c55:	48 89 df             	mov    rdi,rbx
      ee8c58:	4c 89 fe             	mov    rsi,r15
- +0x68 -> 0x9d7de0 FDE=(10321376, 10321377)

## score=96 address-point=0x1813528
- +0x28 -> 0xbf553c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12539196, 12539206)
      bf553c:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      bf5540:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf5543:	ff 60 78             	jmp    QWORD PTR [rax+0x78]
- +0x30 -> 0xbf5546; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(12539206, 12539222)
      bf5546:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      bf554a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf554d:	48 8b 80 80 00 00 00 	mov    rax,QWORD PTR [rax+0x80]
      bf5554:	ff e0                	jmp    rax
- +0x38 -> 0xbf71ea; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(12546538, 12546667)
      bf71ea:	55                   	push   rbp
      bf71eb:	41 57                	push   r15
      bf71ed:	41 56                	push   r14
      bf71ef:	53                   	push   rbx
      bf71f0:	48 83 ec 18          	sub    rsp,0x18
      bf71f4:	48 89 f3             	mov    rbx,rsi
      bf71f7:	49 89 fe             	mov    r14,rdi
      bf71fa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bf7201:	00 00 
      bf7203:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      bf7208:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bf720b:	48 3b 46 08          	cmp    rax,QWORD PTR [rsi+0x8]
      bf720f:	74 2a                	je     bf723b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1441db>
      bf7211:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      bf7215:	49 89 e7             	mov    r15,rsp
      bf7218:	49 89 3f             	mov    QWORD PTR [r15],rdi
      bf721b:	40 b5 01             	mov    bpl,0x1
      bf721e:	41 88 6f 08          	mov    BYTE PTR [r15+0x8],bpl
      bf7222:	e8 c9 6e bf 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
      bf7227:	41 88 6e 78          	mov    BYTE PTR [r14+0x78],bpl
      bf722b:	41 c7 46 70 00 00 80 	mov    DWORD PTR [r14+0x70],0x3f800000
      bf7232:	3f 
      bf7233:	4c 89 ff             	mov    rdi,r15
      bf7236:	e8 f5 4b eb ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
- +0x68 -> 0x9d81d0 FDE=(10322384, 10322387)

## score=95 address-point=0x18699c0
- +0x28 -> 0x13901f6; score=30; no-extra-incoming-args;rax<-this-field; FDE=(20513270, 20513424)
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
- +0x30 -> 0x1390290; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(20513424, 20513437)
     1390290:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
     1390294:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390297:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     139029b:	ff e0                	jmp    rax
- +0x38 -> 0x139029e; score=25; reads-this-rsi;writes-dest-rdi;saves-dest-rdi; FDE=(20513438, 20514065)
     139029e:	41 56                	push   r14
     13902a0:	53                   	push   rbx
     13902a1:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     13902a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13902af:	00 00 
     13902b1:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     13902b8:	00 
     13902b9:	83 bf c8 09 00 00 01 	cmp    DWORD PTR [rdi+0x9c8],0x1
     13902c0:	0f 85 d2 01 00 00    	jne    1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902c6:	48 89 fb             	mov    rbx,rdi
     13902c9:	48 8b bf a8 08 00 00 	mov    rdi,QWORD PTR [rdi+0x8a8]
     13902d0:	48 85 ff             	test   rdi,rdi
     13902d3:	0f 84 bf 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902d9:	48 83 bb b8 08 00 00 	cmp    QWORD PTR [rbx+0x8b8],0x0
     13902e0:	00 
     13902e1:	0f 84 b1 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13902ea:	ff 50 30             	call   QWORD PTR [rax+0x30]
     13902ed:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
     13902f1:	8b b0 80 00 00 00    	mov    esi,DWORD PTR [rax+0x80]
     13902f7:	e8 43 e9 24 00       	call   15dec3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4241c3>
     13902fc:	89 c1                	mov    ecx,eax
     13902fe:	48 89 c2             	mov    rdx,rax
     1390301:	48 c1 ea 20          	shr    rdx,0x20
- +0x68 -> 0x9d81d0 FDE=(10322384, 10322387)

## score=95 address-point=0x1869808
- +0x28 -> 0x13901f6; score=30; no-extra-incoming-args;rax<-this-field; FDE=(20513270, 20513424)
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
- +0x30 -> 0x1390290; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(20513424, 20513437)
     1390290:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
     1390294:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390297:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     139029b:	ff e0                	jmp    rax
- +0x38 -> 0x139029e; score=25; reads-this-rsi;writes-dest-rdi;saves-dest-rdi; FDE=(20513438, 20514065)
     139029e:	41 56                	push   r14
     13902a0:	53                   	push   rbx
     13902a1:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     13902a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13902af:	00 00 
     13902b1:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     13902b8:	00 
     13902b9:	83 bf c8 09 00 00 01 	cmp    DWORD PTR [rdi+0x9c8],0x1
     13902c0:	0f 85 d2 01 00 00    	jne    1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902c6:	48 89 fb             	mov    rbx,rdi
     13902c9:	48 8b bf a8 08 00 00 	mov    rdi,QWORD PTR [rdi+0x8a8]
     13902d0:	48 85 ff             	test   rdi,rdi
     13902d3:	0f 84 bf 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902d9:	48 83 bb b8 08 00 00 	cmp    QWORD PTR [rbx+0x8b8],0x0
     13902e0:	00 
     13902e1:	0f 84 b1 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13902ea:	ff 50 30             	call   QWORD PTR [rax+0x30]
     13902ed:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
     13902f1:	8b b0 80 00 00 00    	mov    esi,DWORD PTR [rax+0x80]
     13902f7:	e8 43 e9 24 00       	call   15dec3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4241c3>
     13902fc:	89 c1                	mov    ecx,eax
     13902fe:	48 89 c2             	mov    rdx,rax
     1390301:	48 c1 ea 20          	shr    rdx,0x20
- +0x68 -> 0x9d81d0 FDE=(10322384, 10322387)

## score=95 address-point=0x1869600
- +0x28 -> 0x13901f6; score=30; no-extra-incoming-args;rax<-this-field; FDE=(20513270, 20513424)
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
- +0x30 -> 0x1390290; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(20513424, 20513437)
     1390290:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
     1390294:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390297:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     139029b:	ff e0                	jmp    rax
- +0x38 -> 0x139029e; score=25; reads-this-rsi;writes-dest-rdi;saves-dest-rdi; FDE=(20513438, 20514065)
     139029e:	41 56                	push   r14
     13902a0:	53                   	push   rbx
     13902a1:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     13902a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13902af:	00 00 
     13902b1:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     13902b8:	00 
     13902b9:	83 bf c8 09 00 00 01 	cmp    DWORD PTR [rdi+0x9c8],0x1
     13902c0:	0f 85 d2 01 00 00    	jne    1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902c6:	48 89 fb             	mov    rbx,rdi
     13902c9:	48 8b bf a8 08 00 00 	mov    rdi,QWORD PTR [rdi+0x8a8]
     13902d0:	48 85 ff             	test   rdi,rdi
     13902d3:	0f 84 bf 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902d9:	48 83 bb b8 08 00 00 	cmp    QWORD PTR [rbx+0x8b8],0x0
     13902e0:	00 
     13902e1:	0f 84 b1 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13902ea:	ff 50 30             	call   QWORD PTR [rax+0x30]
     13902ed:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
     13902f1:	8b b0 80 00 00 00    	mov    esi,DWORD PTR [rax+0x80]
     13902f7:	e8 43 e9 24 00       	call   15dec3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4241c3>
     13902fc:	89 c1                	mov    ecx,eax
     13902fe:	48 89 c2             	mov    rdx,rax
     1390301:	48 c1 ea 20          	shr    rdx,0x20
- +0x68 -> 0x9d81d0 FDE=(10322384, 10322387)

## score=95 address-point=0x1869450
- +0x28 -> 0x13901f6; score=30; no-extra-incoming-args;rax<-this-field; FDE=(20513270, 20513424)
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
- +0x30 -> 0x1390290; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(20513424, 20513437)
     1390290:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
     1390294:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390297:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     139029b:	ff e0                	jmp    rax
- +0x38 -> 0x139029e; score=25; reads-this-rsi;writes-dest-rdi;saves-dest-rdi; FDE=(20513438, 20514065)
     139029e:	41 56                	push   r14
     13902a0:	53                   	push   rbx
     13902a1:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     13902a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13902af:	00 00 
     13902b1:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     13902b8:	00 
     13902b9:	83 bf c8 09 00 00 01 	cmp    DWORD PTR [rdi+0x9c8],0x1
     13902c0:	0f 85 d2 01 00 00    	jne    1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902c6:	48 89 fb             	mov    rbx,rdi
     13902c9:	48 8b bf a8 08 00 00 	mov    rdi,QWORD PTR [rdi+0x8a8]
     13902d0:	48 85 ff             	test   rdi,rdi
     13902d3:	0f 84 bf 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902d9:	48 83 bb b8 08 00 00 	cmp    QWORD PTR [rbx+0x8b8],0x0
     13902e0:	00 
     13902e1:	0f 84 b1 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13902ea:	ff 50 30             	call   QWORD PTR [rax+0x30]
     13902ed:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
     13902f1:	8b b0 80 00 00 00    	mov    esi,DWORD PTR [rax+0x80]
     13902f7:	e8 43 e9 24 00       	call   15dec3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4241c3>
     13902fc:	89 c1                	mov    ecx,eax
     13902fe:	48 89 c2             	mov    rdx,rax
     1390301:	48 c1 ea 20          	shr    rdx,0x20
- +0x68 -> 0x9d81d0 FDE=(10322384, 10322387)

## score=95 address-point=0x1868da0
- +0x28 -> 0x13901f6; score=30; no-extra-incoming-args;rax<-this-field; FDE=(20513270, 20513424)
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
- +0x30 -> 0x1390290; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(20513424, 20513437)
     1390290:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
     1390294:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390297:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     139029b:	ff e0                	jmp    rax
- +0x38 -> 0x139029e; score=25; reads-this-rsi;writes-dest-rdi;saves-dest-rdi; FDE=(20513438, 20514065)
     139029e:	41 56                	push   r14
     13902a0:	53                   	push   rbx
     13902a1:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     13902a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13902af:	00 00 
     13902b1:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     13902b8:	00 
     13902b9:	83 bf c8 09 00 00 01 	cmp    DWORD PTR [rdi+0x9c8],0x1
     13902c0:	0f 85 d2 01 00 00    	jne    1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902c6:	48 89 fb             	mov    rbx,rdi
     13902c9:	48 8b bf a8 08 00 00 	mov    rdi,QWORD PTR [rdi+0x8a8]
     13902d0:	48 85 ff             	test   rdi,rdi
     13902d3:	0f 84 bf 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902d9:	48 83 bb b8 08 00 00 	cmp    QWORD PTR [rbx+0x8b8],0x0
     13902e0:	00 
     13902e1:	0f 84 b1 01 00 00    	je     1390498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5a1c>
     13902e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13902ea:	ff 50 30             	call   QWORD PTR [rax+0x30]
     13902ed:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
     13902f1:	8b b0 80 00 00 00    	mov    esi,DWORD PTR [rax+0x80]
     13902f7:	e8 43 e9 24 00       	call   15dec3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4241c3>
     13902fc:	89 c1                	mov    ecx,eax
     13902fe:	48 89 c2             	mov    rdx,rax
     1390301:	48 c1 ea 20          	shr    rdx,0x20
- +0x68 -> 0x9d81d0 FDE=(10322384, 10322387)

## score=95 address-point=0x17feed0
- +0x28 -> 0xabd136; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(11260214, 11260227)
      abd136:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      abd13a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      abd13d:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
      abd141:	ff e0                	jmp    rax
- +0x30 -> 0xabd144; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(11260228, 11260238)
      abd144:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      abd148:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      abd14b:	ff 60 28             	jmp    QWORD PTR [rax+0x28]
- +0x38 -> 0x1787f76; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(24674166, 24675436)
     1787f76:	55                   	push   rbp
     1787f77:	41 57                	push   r15
     1787f79:	41 56                	push   r14
     1787f7b:	41 55                	push   r13
     1787f7d:	41 54                	push   r12
     1787f7f:	53                   	push   rbx
     1787f80:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     1787f87:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1787f8e:	00 00 
     1787f90:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     1787f97:	00 
     1787f98:	48 89 74 24 78       	mov    QWORD PTR [rsp+0x78],rsi
     1787f9d:	89 54 24 74          	mov    DWORD PTR [rsp+0x74],edx
     1787fa1:	85 d2                	test   edx,edx
     1787fa3:	7e 31                	jle    1787fd6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13c142>
     1787fa5:	49 89 f6             	mov    r14,rsi
     1787fa8:	48 89 fb             	mov    rbx,rdi
     1787fab:	41 89 d4             	mov    r12d,edx
     1787fae:	44 8b 2e             	mov    r13d,DWORD PTR [rsi]
     1787fb1:	4c 8b 7e 08          	mov    r15,QWORD PTR [rsi+0x8]
     1787fb5:	44 89 ef             	mov    edi,r13d
     1787fb8:	4c 89 fe             	mov    rsi,r15
     1787fbb:	e8 24 4d fb ff       	call   173cce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf0e50>
     1787fc0:	84 c0                	test   al,al
- +0x68 -> 0xabd2b6 FDE=(11260598, 11260705)

## score=94 address-point=0x1879980
- +0x28 -> 0x14e1d4a; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(21896522, 21896540)
     14e1d4a:	48 8b 87 98 00 00 00 	mov    rax,QWORD PTR [rdi+0x98]
     14e1d51:	48 3b 87 a0 00 00 00 	cmp    rax,QWORD PTR [rdi+0xa0]
     14e1d58:	0f 95 c0             	setne  al
     14e1d5b:	c3                   	ret
- +0x30 -> 0x14e1d5c; score=43; no-extra-incoming-args;rax<-this-field;rax<-saved-this;compact; FDE=(21896540, 21896603)
     14e1d5c:	80 7f 48 00          	cmp    BYTE PTR [rdi+0x48],0x0
     14e1d60:	74 04                	je     14e1d66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3272ea>
     14e1d62:	6a 04                	push   0x4
     14e1d64:	58                   	pop    rax
     14e1d65:	c3                   	ret
     14e1d66:	53                   	push   rbx
     14e1d67:	48 89 fb             	mov    rbx,rdi
     14e1d6a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e1d6d:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14e1d70:	84 c0                	test   al,al
     14e1d72:	74 04                	je     14e1d78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3272fc>
     14e1d74:	6a 02                	push   0x2
     14e1d76:	eb 0f                	jmp    14e1d87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32730b>
     14e1d78:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14e1d7b:	48 89 df             	mov    rdi,rbx
     14e1d7e:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14e1d81:	84 c0                	test   al,al
     14e1d83:	74 05                	je     14e1d8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32730e>
     14e1d85:	6a 01                	push   0x1
     14e1d87:	58                   	pop    rax
     14e1d88:	eb 0f                	jmp    14e1d99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32731d>
     14e1d8a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14e1d8d:	48 89 df             	mov    rdi,rbx
     14e1d90:	ff 50 58             	call   QWORD PTR [rax+0x58]
- +0x38 -> 0x14e1d9c; score=10; reads-this-rsi; FDE=(21896604, 21896982)
     14e1d9c:	55                   	push   rbp
     14e1d9d:	41 57                	push   r15
     14e1d9f:	41 56                	push   r14
     14e1da1:	41 55                	push   r13
     14e1da3:	41 54                	push   r12
     14e1da5:	53                   	push   rbx
     14e1da6:	48 83 ec 18          	sub    rsp,0x18
     14e1daa:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     14e1dae:	48 8b 86 80 00 00 00 	mov    rax,QWORD PTR [rsi+0x80]
     14e1db5:	48 8b 8e 88 00 00 00 	mov    rcx,QWORD PTR [rsi+0x88]
     14e1dbc:	48 39 c8             	cmp    rax,rcx
     14e1dbf:	74 21                	je     14e1de2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327366>
     14e1dc1:	45 31 ff             	xor    r15d,r15d
     14e1dc4:	45 31 f6             	xor    r14d,r14d
     14e1dc7:	8b 50 48             	mov    edx,DWORD PTR [rax+0x48]
     14e1dca:	83 fa 04             	cmp    edx,0x4
     14e1dcd:	4c 0f 44 f8          	cmove  r15,rax
     14e1dd1:	85 d2                	test   edx,edx
     14e1dd3:	4c 0f 44 f0          	cmove  r14,rax
     14e1dd7:	48 83 c0 50          	add    rax,0x50
     14e1ddb:	48 39 c8             	cmp    rax,rcx
     14e1dde:	75 e7                	jne    14e1dc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32734b>
     14e1de0:	eb 06                	jmp    14e1de8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32736c>
     14e1de2:	45 31 f6             	xor    r14d,r14d
- +0x68 -> 0x14e2174 FDE=(21897588, 21897652)

## score=94 address-point=0x1864980
- +0x28 -> 0x1318ba8; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(20024232, 20024240)
     1318ba8:	48 8b 87 18 02 00 00 	mov    rax,QWORD PTR [rdi+0x218]
     1318baf:	c3                   	ret
- +0x30 -> 0x1318ba8; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(20024232, 20024240)
     1318ba8:	48 8b 87 18 02 00 00 	mov    rax,QWORD PTR [rdi+0x218]
     1318baf:	c3                   	ret
- +0x38 -> 0x1318bb0; score=15; reads-this-rsi;saves-this-rsi; FDE=(20024240, 20025603)
     1318bb0:	55                   	push   rbp
     1318bb1:	41 57                	push   r15
     1318bb3:	41 56                	push   r14
     1318bb5:	41 55                	push   r13
     1318bb7:	41 54                	push   r12
     1318bb9:	53                   	push   rbx
     1318bba:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     1318bc1:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     1318bc6:	49 89 f6             	mov    r14,rsi
     1318bc9:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     1318bce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1318bd5:	00 00 
     1318bd7:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     1318bde:	00 
     1318bdf:	48 8b be d8 00 00 00 	mov    rdi,QWORD PTR [rsi+0xd8]
     1318be6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1318be9:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1318bec:	48 85 c0             	test   rax,rax
     1318bef:	75 0e                	jne    1318bff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e183>
     1318bf1:	41 80 be b0 01 00 00 	cmp    BYTE PTR [r14+0x1b0],0x0
     1318bf8:	00 
     1318bf9:	75 04                	jne    1318bff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e183>
     1318bfb:	31 c0                	xor    eax,eax
     1318bfd:	eb 6b                	jmp    1318c6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e1ee>
- +0x68 -> 0x13191b2 FDE=(20025778, 20025795)

## score=94 address-point=0x1862590
- +0x28 -> 0x12cf4c0; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(19723456, 19728531)
     12cf4c0:	55                   	push   rbp
     12cf4c1:	41 57                	push   r15
     12cf4c3:	41 56                	push   r14
     12cf4c5:	41 55                	push   r13
     12cf4c7:	41 54                	push   r12
     12cf4c9:	53                   	push   rbx
     12cf4ca:	48 81 ec c8 02 00 00 	sub    rsp,0x2c8
     12cf4d1:	48 89 fd             	mov    rbp,rdi
     12cf4d4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12cf4db:	00 00 
     12cf4dd:	48 89 84 24 c0 02 00 	mov    QWORD PTR [rsp+0x2c0],rax
     12cf4e4:	00 
     12cf4e5:	e8 90 cc ff ff       	call   12cc17a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1116fe>
     12cf4ea:	84 c0                	test   al,al
     12cf4ec:	0f 84 e8 0f 00 00    	je     12d04da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x115a5e>
     12cf4f2:	48 8b bd 28 02 00 00 	mov    rdi,QWORD PTR [rbp+0x228]
     12cf4f9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12cf4fc:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     12cf502:	83 f8 01             	cmp    eax,0x1
     12cf505:	0f 85 96 01 00 00    	jne    12cf6a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x114c25>
     12cf50b:	48 83 a4 24 37 02 00 	and    QWORD PTR [rsp+0x237],0x0
     12cf512:	00 00 
     12cf514:	48 83 a4 24 30 02 00 	and    QWORD PTR [rsp+0x230],0x0
     12cf51b:	00 00 
- +0x30 -> 0xa4b870; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(10795120, 10795125)
      a4b870:	48 8d 47 20          	lea    rax,[rdi+0x20]
      a4b874:	c3                   	ret
- +0x38 -> 0x12d0894; score=13; reads-this-rsi;saves-dest-rdi; FDE=(19728532, 19728743)
     12d0894:	41 57                	push   r15
     12d0896:	41 56                	push   r14
     12d0898:	53                   	push   rbx
     12d0899:	48 83 ec 20          	sub    rsp,0x20
     12d089d:	4d 89 c6             	mov    r14,r8
     12d08a0:	48 89 fb             	mov    rbx,rdi
     12d08a3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12d08aa:	00 00 
     12d08ac:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     12d08b1:	48 8b 86 d8 00 00 00 	mov    rax,QWORD PTR [rsi+0xd8]
     12d08b8:	48 8b 96 e0 00 00 00 	mov    rdx,QWORD PTR [rsi+0xe0]
     12d08bf:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     12d08c4:	4c 89 ff             	mov    rdi,r15
     12d08c7:	48 89 c6             	mov    rsi,rax
     12d08ca:	e8 fb ab 2d 00       	call   15ab4ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f0a4e>
     12d08cf:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     12d08d2:	4d 85 ff             	test   r15,r15
     12d08d5:	74 43                	je     12d091a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x115e9e>
     12d08d7:	48 8b bb 38 02 00 00 	mov    rdi,QWORD PTR [rbx+0x238]
     12d08de:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d08e1:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     12d08e7:	4d 85 f6             	test   r14,r14
     12d08ea:	74 2e                	je     12d091a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x115e9e>
     12d08ec:	49 39 c7             	cmp    r15,rax
- +0x68 -> 0x12d0ae6 FDE=(19729126, 19729135)

## score=94 address-point=0x1858638
- +0x28 -> 0x116675e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245470, 18245486)
     116675e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166762:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166765:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
     116676c:	ff e0                	jmp    rax
- +0x30 -> 0x116676e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245486, 18245502)
     116676e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166772:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166775:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
     116677c:	ff e0                	jmp    rax
- +0x38 -> 0x1197962; score=15; reads-this-rsi;saves-this-rsi; FDE=(18446690, 18446900)
     1197962:	55                   	push   rbp
     1197963:	41 56                	push   r14
     1197965:	53                   	push   rbx
     1197966:	48 83 ec 70          	sub    rsp,0x70
     119796a:	48 89 f3             	mov    rbx,rsi
     119796d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1197974:	00 00 
     1197976:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     119797b:	0f 57 c0             	xorps  xmm0,xmm0
     119797e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     1197983:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
     1197987:	48 8d 05 1a fd 6e 00 	lea    rax,[rip+0x6efd1a]        # 18876a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x380>
     119798e:	48 89 06             	mov    QWORD PTR [rsi],rax
     1197991:	48 8d 05 60 7e 2a ff 	lea    rax,[rip+0xffffffffff2a7e60]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1197998:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     119799c:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     11979a0:	48 89 46 28          	mov    QWORD PTR [rsi+0x28],rax
     11979a4:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     11979a9:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     11979ad:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11979b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11979b4:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     11979ba:	89 c5                	mov    ebp,eax
     11979bc:	84 c0                	test   al,al
- +0x68 -> 0x1197c80 FDE=(18447488, 18447710)

## score=94 address-point=0x18576f8
- +0x28 -> 0x116675e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245470, 18245486)
     116675e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166762:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166765:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
     116676c:	ff e0                	jmp    rax
- +0x30 -> 0x116676e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245486, 18245502)
     116676e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166772:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166775:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
     116677c:	ff e0                	jmp    rax
- +0x38 -> 0x1184c70; score=15; reads-this-rsi;saves-this-rsi; FDE=(18369648, 18369867)
     1184c70:	55                   	push   rbp
     1184c71:	41 56                	push   r14
     1184c73:	53                   	push   rbx
     1184c74:	48 81 ec 80 00 00 00 	sub    rsp,0x80
     1184c7b:	48 89 f3             	mov    rbx,rsi
     1184c7e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1184c85:	00 00 
     1184c87:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     1184c8c:	0f 57 c0             	xorps  xmm0,xmm0
     1184c8f:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     1184c94:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
     1184c98:	48 8d 05 e9 47 6d 00 	lea    rax,[rip+0x6d47e9]        # 1859488 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15b70>
     1184c9f:	48 89 06             	mov    QWORD PTR [rsi],rax
     1184ca2:	48 8d 05 4f ab 2b ff 	lea    rax,[rip+0xffffffffff2bab4f]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1184ca9:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     1184cad:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     1184cb1:	48 89 46 28          	mov    QWORD PTR [rsi+0x28],rax
     1184cb5:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     1184cb9:	0f 11 46 3c          	movups XMMWORD PTR [rsi+0x3c],xmm0
     1184cbd:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1184cc1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1184cc4:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     1184cca:	89 c5                	mov    ebp,eax
     1184ccc:	84 c0                	test   al,al
- +0x68 -> 0xabf4bc FDE=(11269308, 11269324)

## score=94 address-point=0x18574b8
- +0x28 -> 0x116675e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245470, 18245486)
     116675e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166762:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166765:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
     116676c:	ff e0                	jmp    rax
- +0x30 -> 0x116676e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245486, 18245502)
     116676e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166772:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166775:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
     116677c:	ff e0                	jmp    rax
- +0x38 -> 0x11830f8; score=15; reads-this-rsi;saves-this-rsi; FDE=(18362616, 18362825)
     11830f8:	55                   	push   rbp
     11830f9:	41 56                	push   r14
     11830fb:	53                   	push   rbx
     11830fc:	48 83 ec 70          	sub    rsp,0x70
     1183100:	48 89 f3             	mov    rbx,rsi
     1183103:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     118310a:	00 00 
     118310c:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     1183111:	0f 57 c0             	xorps  xmm0,xmm0
     1183114:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     1183119:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
     118311d:	48 8d 05 04 46 70 00 	lea    rax,[rip+0x704604]        # 1887728 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x400>
     1183124:	48 89 06             	mov    QWORD PTR [rsi],rax
     1183127:	48 8d 05 ca c6 2b ff 	lea    rax,[rip+0xffffffffff2bc6ca]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     118312e:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     1183132:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     1183136:	48 89 46 28          	mov    QWORD PTR [rsi+0x28],rax
     118313a:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     118313e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1183142:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1183145:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     118314b:	89 c5                	mov    ebp,eax
     118314d:	84 c0                	test   al,al
     118314f:	74 27                	je     1183178 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a58e>
- +0x68 -> 0x118347a FDE=(18363514, 18363776)

## score=94 address-point=0x1857258
- +0x28 -> 0x116675e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245470, 18245486)
     116675e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166762:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166765:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
     116676c:	ff e0                	jmp    rax
- +0x30 -> 0x116676e; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245486, 18245502)
     116676e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1166772:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166775:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
     116677c:	ff e0                	jmp    rax
- +0x38 -> 0x1180528; score=15; reads-this-rsi;saves-this-rsi; FDE=(18351400, 18351610)
     1180528:	55                   	push   rbp
     1180529:	41 56                	push   r14
     118052b:	53                   	push   rbx
     118052c:	48 83 ec 70          	sub    rsp,0x70
     1180530:	48 89 f3             	mov    rbx,rsi
     1180533:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     118053a:	00 00 
     118053c:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     1180541:	0f 57 c0             	xorps  xmm0,xmm0
     1180544:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     1180549:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
     118054d:	48 8d 05 54 72 70 00 	lea    rax,[rip+0x707254]        # 18877a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x480>
     1180554:	48 89 06             	mov    QWORD PTR [rsi],rax
     1180557:	48 8d 05 9a f2 2b ff 	lea    rax,[rip+0xffffffffff2bf29a]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     118055e:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     1180562:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     1180566:	48 83 66 38 00       	and    QWORD PTR [rsi+0x38],0x0
     118056b:	0f 11 46 28          	movups XMMWORD PTR [rsi+0x28],xmm0
     118056f:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1180573:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1180576:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     118057c:	89 c5                	mov    ebp,eax
     118057e:	84 c0                	test   al,al
     1180580:	74 27                	je     11805a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3479bf>
- +0x68 -> 0x118085e FDE=(18352222, 18352250)

## score=94 address-point=0x1845290
- +0x28 -> 0x101b38c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(16888716, 16888726)
     101b38c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     101b38f:	48 8b 00             	mov    rax,QWORD PTR [rax]
     101b392:	8a 40 2b             	mov    al,BYTE PTR [rax+0x2b]
     101b395:	c3                   	ret
- +0x30 -> 0x101b3b4; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(16888756, 16888766)
     101b3b4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     101b3b7:	48 8b 00             	mov    rax,QWORD PTR [rax]
     101b3ba:	8a 40 28             	mov    al,BYTE PTR [rax+0x28]
     101b3bd:	c3                   	ret
- +0x38 -> 0x101ae4a; score=15; reads-this-rsi;saves-this-rsi; FDE=(16887370, 16887505)
     101ae4a:	41 56                	push   r14
     101ae4c:	53                   	push   rbx
     101ae4d:	50                   	push   rax
     101ae4e:	48 83 66 08 00       	and    QWORD PTR [rsi+0x8],0x0
     101ae53:	48 8d 05 66 27 88 00 	lea    rax,[rip+0x882766]        # 189d5c0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xa500>
     101ae5a:	48 89 06             	mov    QWORD PTR [rsi],rax
     101ae5d:	0f 57 c0             	xorps  xmm0,xmm0
     101ae60:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
     101ae64:	0f 11 46 1f          	movups XMMWORD PTR [rsi+0x1f],xmm0
     101ae68:	48 39 d6             	cmp    rsi,rdx
     101ae6b:	74 4b                	je     101aeb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e22ce>
     101ae6d:	48 89 f3             	mov    rbx,rsi
     101ae70:	49 89 d6             	mov    r14,rdx
     101ae73:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
     101ae77:	a8 01                	test   al,0x1
     101ae79:	75 45                	jne    101aec0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e22d6>
     101ae7b:	48 85 c0             	test   rax,rax
     101ae7e:	74 0d                	je     101ae8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e22a3>
     101ae80:	48 89 df             	mov    rdi,rbx
     101ae83:	4c 89 f6             	mov    rsi,r14
     101ae86:	e8 d5 3b 73 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
     101ae8b:	eb 2b                	jmp    101aeb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e22ce>
     101ae8d:	0f 18 0d 74 81 97 00 	prefetcht0 BYTE PTR [rip+0x978174]        # 1993008 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x5bc50>
     101ae94:	48 8d 3d 6d 81 97 00 	lea    rdi,[rip+0x97816d]        # 1993008 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x5bc50>
- +0x68 -> 0x101b17a FDE=(16888186, 16888321)

## score=94 address-point=0x1826038
- +0x28 -> 0xd1b8f0; score=38; no-extra-incoming-args;rax<-this-relative;leaf;compact; FDE=(13744368, 13744373)
      d1b8f0:	48 8d 47 48          	lea    rax,[rdi+0x48]
      d1b8f4:	c3                   	ret
- +0x30 -> 0xd600c8; score=35; no-extra-incoming-args;rax<-this-field;few-calls;compact; FDE=(14024904, 14024923)
      d600c8:	50                   	push   rax
      d600c9:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      d600cd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d600d0:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d600d3:	48 85 c0             	test   rax,rax
      d600d6:	0f 95 c0             	setne  al
      d600d9:	59                   	pop    rcx
      d600da:	c3                   	ret
- +0x38 -> 0xd600dc; score=18; reads-this-rsi;saves-this-rsi;saves-dest-rdi; FDE=(14024924, 14025465)
      d600dc:	41 57                	push   r15
      d600de:	41 56                	push   r14
      d600e0:	41 54                	push   r12
      d600e2:	53                   	push   rbx
      d600e3:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
      d600ea:	49 89 f7             	mov    r15,rsi
      d600ed:	49 89 fc             	mov    r12,rdi
      d600f0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d600f7:	00 00 
      d600f9:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      d60100:	00 
      d60101:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d60104:	ff 50 18             	call   QWORD PTR [rax+0x18]
      d60107:	84 c0                	test   al,al
      d60109:	74 1c                	je     d60127 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1ad>
      d6010b:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
      d60112:	00 
      d60113:	c7 06 ad 01 00 00    	mov    DWORD PTR [rsi],0x1ad
      d60119:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      d6011d:	e8 6e dc d5 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      d60122:	e9 33 01 00 00       	jmp    d6025a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d2e0>
      d60127:	48 83 64 24 58 00    	and    QWORD PTR [rsp+0x58],0x0
      d6012d:	48 8d 05 94 94 b2 00 	lea    rax,[rip+0xb29494]        # 18895c8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x22a0>
      d60134:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
- +0x68 -> 0xd60b08 FDE=(14027528, 14027546)

## score=93 address-point=0x1890268
- +0x28 -> 0x162d7e4; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23255012, 23255038)
     162d7e4:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
     162d7eb:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
     162d7f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d7f5:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
     162d7fc:	ff e0                	jmp    rax
- +0x30 -> 0x162d7fe; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23255038, 23255064)
     162d7fe:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
     162d805:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
     162d80c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d80f:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
     162d816:	ff e0                	jmp    rax
- +0x38 -> 0x162d818; score=15; reads-this-rsi;saves-this-rsi; FDE=(23255064, 23255457)
     162d818:	55                   	push   rbp
     162d819:	41 57                	push   r15
     162d81b:	41 56                	push   r14
     162d81d:	41 55                	push   r13
     162d81f:	41 54                	push   r12
     162d821:	53                   	push   rbx
     162d822:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     162d829:	4c 89 44 24 08       	mov    QWORD PTR [rsp+0x8],r8
     162d82e:	49 89 ce             	mov    r14,rcx
     162d831:	49 89 d7             	mov    r15,rdx
     162d834:	49 89 f5             	mov    r13,rsi
     162d837:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     162d83b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162d842:	00 00 
     162d844:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     162d84b:	00 
     162d84c:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
     162d851:	48 89 55 00          	mov    QWORD PTR [rbp+0x0],rdx
     162d855:	48 89 4d 08          	mov    QWORD PTR [rbp+0x8],rcx
     162d859:	4c 8d 66 40          	lea    r12,[rsi+0x40]
     162d85d:	48 83 c6 58          	add    rsi,0x58
     162d861:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
     162d866:	48 89 df             	mov    rdi,rbx
     162d869:	e8 22 cb 52 ff       	call   b5a390 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa7330>
- +0x68 -> 0x9d81d0 FDE=(10322384, 10322387)

## score=93 address-point=0x186d610
- +0x28 -> 0x13e4140; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(20857152, 20857174)
     13e4140:	53                   	push   rbx
     13e4141:	48 89 fb             	mov    rbx,rdi
     13e4144:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13e4147:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
     13e414d:	48 8b 83 e0 00 00 00 	mov    rax,QWORD PTR [rbx+0xe0]
     13e4154:	5b                   	pop    rbx
     13e4155:	c3                   	ret
- +0x30 -> 0x13e4156; score=45; no-extra-incoming-args;rax<-this-field;rax<-saved-this;few-calls;compact; FDE=(20857174, 20857196)
     13e4156:	53                   	push   rbx
     13e4157:	48 89 fb             	mov    rbx,rdi
     13e415a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13e415d:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
     13e4163:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
     13e416a:	5b                   	pop    rbx
     13e416b:	c3                   	ret
- +0x38 -> 0x13e4f4a; score=0; ; FDE=(20860746, 20860762)
     13e4f4a:	48 8b bf 40 01 00 00 	mov    rdi,QWORD PTR [rdi+0x140]
     13e4f51:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13e4f54:	ff a0 b8 00 00 00    	jmp    QWORD PTR [rax+0xb8]
- +0x68 -> 0x13e4fd8 FDE=(20860888, 20860904)

## score=93 address-point=0x18664d8
- +0x28 -> 0x131ca36; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(20040246, 20040999)
     131ca36:	41 57                	push   r15
     131ca38:	41 56                	push   r14
     131ca3a:	53                   	push   rbx
     131ca3b:	48 81 ec f0 00 00 00 	sub    rsp,0xf0
     131ca42:	49 89 fe             	mov    r14,rdi
     131ca45:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131ca4c:	00 00 
     131ca4e:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     131ca55:	00 
     131ca56:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131ca5a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131ca5d:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131ca60:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131ca63:	e8 9d dc ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131ca68:	8d 48 fb             	lea    ecx,[rax-0x5]
     131ca6b:	83 f9 06             	cmp    ecx,0x6
     131ca6e:	73 58                	jae    131cac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16204c>
     131ca70:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     131ca74:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     131ca77:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     131ca7b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131ca7e:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131ca81:	4c 8d b4 24 98 00 00 	lea    r14,[rsp+0x98]
     131ca88:	00 
- +0x30 -> 0x131cd28; score=40; no-extra-incoming-args;rax<-this-field;rax<-saved-this; FDE=(20041000, 20041329)
     131cd28:	41 56                	push   r14
     131cd2a:	53                   	push   rbx
     131cd2b:	48 83 ec 38          	sub    rsp,0x38
     131cd2f:	48 89 fb             	mov    rbx,rdi
     131cd32:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131cd39:	00 00 
     131cd3b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     131cd40:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131cd44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131cd47:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131cd4a:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131cd4d:	e8 b3 d9 ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131cd52:	8d 48 fb             	lea    ecx,[rax-0x5]
     131cd55:	83 f9 06             	cmp    ecx,0x6
     131cd58:	73 70                	jae    131cdca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16234e>
     131cd5a:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131cd5e:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131cd61:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131cd65:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131cd68:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131cd6b:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
     131cd70:	48 89 df             	mov    rdi,rbx
     131cd73:	48 89 c6             	mov    rsi,rax
     131cd76:	e8 af d7 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
- +0x38 -> 0x131ce72; score=10; reads-this-rsi; FDE=(20041330, 20041482)
     131ce72:	41 56                	push   r14
     131ce74:	53                   	push   rbx
     131ce75:	48 83 ec 28          	sub    rsp,0x28
     131ce79:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     131ce80:	00 00 
     131ce82:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     131ce87:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     131ce8b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     131ce8e:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     131ce92:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     131ce95:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     131ce9a:	4c 89 f7             	mov    rdi,r14
     131ce9d:	ff 50 48             	call   QWORD PTR [rax+0x48]
     131cea0:	48 89 df             	mov    rdi,rbx
     131cea3:	4c 89 f6             	mov    rsi,r14
     131cea6:	e8 7d 06 00 00       	call   131d528 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162aac>
     131ceab:	48 89 c3             	mov    rbx,rax
     131ceae:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131ceb3:	e8 d8 0f 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131ceb8:	48 85 db             	test   rbx,rbx
     131cebb:	74 09                	je     131cec6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16244a>
     131cebd:	83 7b 38 00          	cmp    DWORD PTR [rbx+0x38],0x0
     131cec1:	0f 9f c0             	setg   al
     131cec4:	eb 02                	jmp    131cec8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16244c>
- +0x68 -> 0x1345e9a FDE=(20209306, 20209324)

## score=92 address-point=0x1899818
- +0x28 -> 0x162d5cc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23254476, 23254492)
     162d5cc:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d5d3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d5d6:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     162d5da:	ff e0                	jmp    rax
- +0x30 -> 0x162d5dc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23254492, 23254505)
     162d5dc:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d5e6:	ff 60 40             	jmp    QWORD PTR [rax+0x40]
- +0x38 -> 0x162d5ea; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23254506, 23254528)
     162d5ea:	53                   	push   rbx
     162d5eb:	48 89 fb             	mov    rbx,rdi
     162d5ee:	48 8b b6 b0 00 00 00 	mov    rsi,QWORD PTR [rsi+0xb0]
     162d5f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162d5f8:	ff 50 70             	call   QWORD PTR [rax+0x70]
     162d5fb:	48 89 d8             	mov    rax,rbx
     162d5fe:	5b                   	pop    rbx
     162d5ff:	c3                   	ret
- +0x68 -> 0x1682948 FDE=(23603528, 23603540)

## score=92 address-point=0x18997d8
- +0x28 -> 0x162d54c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23254348, 23254361)
     162d54c:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d553:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d556:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
- +0x30 -> 0x162d55a; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23254362, 23254375)
     162d55a:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d561:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d564:	ff 60 48             	jmp    QWORD PTR [rax+0x48]
- +0x38 -> 0x16828da; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23603418, 23603440)
     16828da:	53                   	push   rbx
     16828db:	48 89 fb             	mov    rbx,rdi
     16828de:	48 8b b6 b0 00 00 00 	mov    rsi,QWORD PTR [rsi+0xb0]
     16828e5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     16828e8:	ff 50 50             	call   QWORD PTR [rax+0x50]
     16828eb:	48 89 d8             	mov    rax,rbx
     16828ee:	5b                   	pop    rbx
     16828ef:	c3                   	ret
- +0x68 -> 0x162d5cc FDE=(23254476, 23254492)

## score=92 address-point=0x1899368
- +0x28 -> 0xab5b36; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(11230006, 11230022)
      ab5b36:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      ab5b3a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ab5b3d:	48 8b 80 88 00 00 00 	mov    rax,QWORD PTR [rax+0x88]
      ab5b44:	ff e0                	jmp    rax
- +0x30 -> 0xab5b46; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(11230022, 11230038)
      ab5b46:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      ab5b4a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ab5b4d:	48 8b 80 90 00 00 00 	mov    rax,QWORD PTR [rax+0x90]
      ab5b54:	ff e0                	jmp    rax
- +0x38 -> 0xab5b56; score=13; reads-this-rsi;saves-dest-rdi; FDE=(11230038, 11230060)
      ab5b56:	53                   	push   rbx
      ab5b57:	48 89 fb             	mov    rbx,rdi
      ab5b5a:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      ab5b5e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ab5b61:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      ab5b67:	48 89 d8             	mov    rax,rbx
      ab5b6a:	5b                   	pop    rbx
      ab5b6b:	c3                   	ret
- +0x68 -> 0xa3fa60 FDE=(10746464, 10746467)

## score=92 address-point=0x1896f90
- +0x28 -> 0x166231c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23470876, 23470890)
     166231c:	48 8b 87 90 00 00 00 	mov    rax,QWORD PTR [rdi+0x90]
     1662323:	8a 80 56 01 00 00    	mov    al,BYTE PTR [rax+0x156]
     1662329:	c3                   	ret
- +0x30 -> 0x1662336; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23470902, 23470916)
     1662336:	48 8b 87 90 00 00 00 	mov    rax,QWORD PTR [rdi+0x90]
     166233d:	8a 80 57 01 00 00    	mov    al,BYTE PTR [rax+0x157]
     1662343:	c3                   	ret
- +0x38 -> 0x1662350; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23470928, 23470993)
     1662350:	41 57                	push   r15
     1662352:	41 56                	push   r14
     1662354:	53                   	push   rbx
     1662355:	48 89 fb             	mov    rbx,rdi
     1662358:	83 27 00             	and    DWORD PTR [rdi],0x0
     166235b:	49 89 d6             	mov    r14,rdx
     166235e:	4c 8b be 90 00 00 00 	mov    r15,QWORD PTR [rsi+0x90]
     1662365:	49 83 c7 78          	add    r15,0x78
     1662369:	48 89 d7             	mov    rdi,rdx
     166236c:	e8 21 f3 ff ff       	call   1661692 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157fe>
     1662371:	49 81 c6 08 0a 00 00 	add    r14,0xa08
     1662378:	4c 89 ff             	mov    rdi,r15
     166237b:	48 89 de             	mov    rsi,rbx
     166237e:	89 c2                	mov    edx,eax
     1662380:	4c 89 f1             	mov    rcx,r14
     1662383:	e8 bf f4 ff ff       	call   1661847 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x159b3>
     1662388:	48 89 d8             	mov    rax,rbx
     166238b:	5b                   	pop    rbx
     166238c:	41 5e                	pop    r14
     166238e:	41 5f                	pop    r15
     1662390:	c3                   	ret
- +0x68 -> 0x1662590 FDE=(23471504, 23471613)

## score=92 address-point=0x1891ac8
- +0x28 -> 0x1637104; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23294212, 23294230)
     1637104:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     1637108:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
     163710c:	48 83 c7 20          	add    rdi,0x20
     1637110:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
     1637114:	ff e0                	jmp    rax
- +0x30 -> 0x1637116; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23294230, 23294248)
     1637116:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     163711a:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
     163711e:	48 83 c7 20          	add    rdi,0x20
     1637122:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     1637126:	ff e0                	jmp    rax
- +0x38 -> 0x1637128; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23294248, 23294272)
     1637128:	53                   	push   rbx
     1637129:	48 89 fb             	mov    rbx,rdi
     163712c:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
     1637130:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
     1637134:	48 83 c6 20          	add    rsi,0x20
     1637138:	ff 50 30             	call   QWORD PTR [rax+0x30]
     163713b:	48 89 d8             	mov    rax,rbx
     163713e:	5b                   	pop    rbx
     163713f:	c3                   	ret
- +0x68 -> 0xa50370 FDE=(10814320, 10814325)

## score=92 address-point=0x1890968
- +0x28 -> 0x15d8f94; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(22908820, 22908829)
     15d8f94:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     15d8f98:	48 83 c0 40          	add    rax,0x40
     15d8f9c:	c3                   	ret
- +0x30 -> 0x1635a4c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23288396, 23288405)
     1635a4c:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     1635a50:	48 83 c0 21          	add    rax,0x21
     1635a54:	c3                   	ret
- +0x38 -> 0x1635a56; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23288406, 23288424)
     1635a56:	53                   	push   rbx
     1635a57:	48 89 fb             	mov    rbx,rdi
     1635a5a:	48 8b 76 10          	mov    rsi,QWORD PTR [rsi+0x10]
     1635a5e:	e8 d9 94 ff ff       	call   162ef3c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a0aa>
     1635a63:	48 89 d8             	mov    rax,rbx
     1635a66:	5b                   	pop    rbx
     1635a67:	c3                   	ret
- +0x68 -> 0x16647e6 FDE=(23480294, 23480383)

## score=92 address-point=0x18901a0
- +0x28 -> 0x162d5cc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23254476, 23254492)
     162d5cc:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d5d3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d5d6:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     162d5da:	ff e0                	jmp    rax
- +0x30 -> 0x162d5dc; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23254492, 23254505)
     162d5dc:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d5e6:	ff 60 40             	jmp    QWORD PTR [rax+0x40]
- +0x38 -> 0x162d5ea; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23254506, 23254528)
     162d5ea:	53                   	push   rbx
     162d5eb:	48 89 fb             	mov    rbx,rdi
     162d5ee:	48 8b b6 b0 00 00 00 	mov    rsi,QWORD PTR [rsi+0xb0]
     162d5f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162d5f8:	ff 50 70             	call   QWORD PTR [rax+0x70]
     162d5fb:	48 89 d8             	mov    rax,rbx
     162d5fe:	5b                   	pop    rbx
     162d5ff:	c3                   	ret
- +0x68 -> 0x162d658 FDE=(23254616, 23254628)

## score=92 address-point=0x1890160
- +0x28 -> 0x162d54c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23254348, 23254361)
     162d54c:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d553:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d556:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
- +0x30 -> 0x162d55a; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23254362, 23254375)
     162d55a:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d561:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d564:	ff 60 48             	jmp    QWORD PTR [rax+0x48]
- +0x38 -> 0x162d568; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23254376, 23254426)
     162d568:	53                   	push   rbx
     162d569:	48 89 fb             	mov    rbx,rdi
     162d56c:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
     162d573:	48 85 c0             	test   rax,rax
     162d576:	74 0d                	je     162d585 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286f3>
     162d578:	48 89 df             	mov    rdi,rbx
     162d57b:	48 89 c6             	mov    rsi,rax
     162d57e:	e8 e5 ea 65 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     162d583:	eb 10                	jmp    162d595 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28703>
     162d585:	48 8b b6 b0 00 00 00 	mov    rsi,QWORD PTR [rsi+0xb0]
     162d58c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162d58f:	48 89 df             	mov    rdi,rbx
     162d592:	ff 50 50             	call   QWORD PTR [rax+0x50]
     162d595:	48 89 d8             	mov    rax,rbx
     162d598:	5b                   	pop    rbx
     162d599:	c3                   	ret
- +0x68 -> 0x162d5cc FDE=(23254476, 23254492)

## score=92 address-point=0x188fff8
- +0x28 -> 0x162c454; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23250004, 23250017)
     162c454:	48 8b bf 90 00 00 00 	mov    rdi,QWORD PTR [rdi+0x90]
     162c45b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c45e:	ff 60 40             	jmp    QWORD PTR [rax+0x40]
- +0x30 -> 0x162c462; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23250018, 23250031)
     162c462:	48 8b bf 90 00 00 00 	mov    rdi,QWORD PTR [rdi+0x90]
     162c469:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c46c:	ff 60 48             	jmp    QWORD PTR [rax+0x48]
- +0x38 -> 0x162c470; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23250032, 23250054)
     162c470:	53                   	push   rbx
     162c471:	48 89 fb             	mov    rbx,rdi
     162c474:	48 8b b6 90 00 00 00 	mov    rsi,QWORD PTR [rsi+0x90]
     162c47b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162c47e:	ff 50 70             	call   QWORD PTR [rax+0x70]
     162c481:	48 89 d8             	mov    rax,rbx
     162c484:	5b                   	pop    rbx
     162c485:	c3                   	ret
- +0x68 -> 0x162d07a FDE=(23253114, 23253132)

## score=92 address-point=0x188bf80
- +0x28 -> 0x16105ee; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23135726, 23135742)
     16105ee:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     16105f2:	48 8b b8 60 01 00 00 	mov    rdi,QWORD PTR [rax+0x160]
     16105f9:	e9 64 9e 46 ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
- +0x30 -> 0xa10b90; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(10554256, 10554262)
      a10b90:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a10b93:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
- +0x38 -> 0x16105fe; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23135742, 23135911)
     16105fe:	41 56                	push   r14
     1610600:	53                   	push   rbx
     1610601:	50                   	push   rax
     1610602:	48 89 fb             	mov    rbx,rdi
     1610605:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
     1610609:	e8 6c 14 1b 00       	call   17c1a7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175be6>
     161060e:	84 c0                	test   al,al
     1610610:	74 7a                	je     161068c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb7fa>
     1610612:	e8 2f a6 1c 00       	call   17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>
     1610617:	49 8b 8e b8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1b8]
     161061e:	48 89 c2             	mov    rdx,rax
     1610621:	48 87 51 28          	xchg   QWORD PTR [rcx+0x28],rdx
     1610625:	48 29 d0             	sub    rax,rdx
     1610628:	48 85 d2             	test   rdx,rdx
     161062b:	48 0f 44 c2          	cmove  rax,rdx
     161062f:	49 8b 8e b8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1b8]
     1610636:	31 d2                	xor    edx,edx
     1610638:	48 87 11             	xchg   QWORD PTR [rcx],rdx
     161063b:	49 8b 8e b8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1b8]
     1610642:	31 f6                	xor    esi,esi
     1610644:	48 87 71 08          	xchg   QWORD PTR [rcx+0x8],rsi
     1610648:	31 c9                	xor    ecx,ecx
     161064a:	49 8b be b8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1b8]
     1610651:	45 31 c0             	xor    r8d,r8d
- +0x68 -> 0x16107ae FDE=(23136174, 23136422)

## score=92 address-point=0x188b600
- +0x28 -> 0x15fd75c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23058268, 23058284)
     15fd75c:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
     15fd760:	48 85 ff             	test   rdi,rdi
     15fd763:	74 06                	je     15fd76b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x442cef>
     15fd765:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15fd768:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
     15fd76b:	c3                   	ret
- +0x30 -> 0x15fd76c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23058284, 23058300)
     15fd76c:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
     15fd770:	48 85 ff             	test   rdi,rdi
     15fd773:	74 06                	je     15fd77b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x442cff>
     15fd775:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15fd778:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
     15fd77b:	c3                   	ret
- +0x38 -> 0x15fd77c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23058300, 23058468)
     15fd77c:	53                   	push   rbx
     15fd77d:	48 89 fb             	mov    rbx,rdi
     15fd780:	48 8b 76 50          	mov    rsi,QWORD PTR [rsi+0x50]
     15fd784:	48 85 f6             	test   rsi,rsi
     15fd787:	74 0e                	je     15fd797 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x442d1b>
     15fd789:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15fd78c:	48 89 df             	mov    rdi,rbx
     15fd78f:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15fd792:	e9 88 00 00 00       	jmp    15fd81f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x442da3>
     15fd797:	48 8d 43 78          	lea    rax,[rbx+0x78]
     15fd79b:	0f 57 c0             	xorps  xmm0,xmm0
     15fd79e:	0f 11 43 78          	movups XMMWORD PTR [rbx+0x78],xmm0
     15fd7a2:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     15fd7a5:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
     15fd7a9:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     15fd7ad:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     15fd7b1:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
     15fd7b5:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
     15fd7b9:	0f 11 43 5c          	movups XMMWORD PTR [rbx+0x5c],xmm0
     15fd7bd:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     15fd7c1:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
     15fd7c8:	e8 11 f4 5f ff       	call   bfcbde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x149b7e>
     15fd7cd:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     15fd7d4:	00 
- +0x68 -> 0x160137e FDE=(23073662, 23073709)

## score=92 address-point=0x188b0b8
- +0x28 -> 0x15fd75c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23058268, 23058284)
     15fd75c:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
     15fd760:	48 85 ff             	test   rdi,rdi
     15fd763:	74 06                	je     15fd76b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x442cef>
     15fd765:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15fd768:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
     15fd76b:	c3                   	ret
- +0x30 -> 0x15fd76c; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(23058284, 23058300)
     15fd76c:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
     15fd770:	48 85 ff             	test   rdi,rdi
     15fd773:	74 06                	je     15fd77b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x442cff>
     15fd775:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15fd778:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
     15fd77b:	c3                   	ret
- +0x38 -> 0x15fd77c; score=13; reads-this-rsi;saves-dest-rdi; FDE=(23058300, 23058468)
     15fd77c:	53                   	push   rbx
     15fd77d:	48 89 fb             	mov    rbx,rdi
     15fd780:	48 8b 76 50          	mov    rsi,QWORD PTR [rsi+0x50]
     15fd784:	48 85 f6             	test   rsi,rsi
     15fd787:	74 0e                	je     15fd797 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x442d1b>
     15fd789:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15fd78c:	48 89 df             	mov    rdi,rbx
     15fd78f:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15fd792:	e9 88 00 00 00       	jmp    15fd81f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x442da3>
     15fd797:	48 8d 43 78          	lea    rax,[rbx+0x78]
     15fd79b:	0f 57 c0             	xorps  xmm0,xmm0
     15fd79e:	0f 11 43 78          	movups XMMWORD PTR [rbx+0x78],xmm0
     15fd7a2:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     15fd7a5:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
     15fd7a9:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     15fd7ad:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     15fd7b1:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
     15fd7b5:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
     15fd7b9:	0f 11 43 5c          	movups XMMWORD PTR [rbx+0x5c],xmm0
     15fd7bd:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     15fd7c1:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
     15fd7c8:	e8 11 f4 5f ff       	call   bfcbde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x149b7e>
     15fd7cd:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     15fd7d4:	00 
- +0x68 -> 0x15fd666 FDE=(23058022, 23058182)

## score=92 address-point=0x1886bd0
- +0x28 -> 0x11666e8; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245352, 18245362)
     11666e8:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666ef:	ff 60 40             	jmp    QWORD PTR [rax+0x40]
- +0x30 -> 0x11666f2; score=38; no-extra-incoming-args;rax<-this-field;leaf;compact; FDE=(18245362, 18245372)
     11666f2:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666f9:	ff 60 48             	jmp    QWORD PTR [rax+0x48]
- +0x38 -> 0x11666fc; score=13; reads-this-rsi;saves-dest-rdi; FDE=(18245372, 18245391)
     11666fc:	53                   	push   rbx
     11666fd:	48 89 fb             	mov    rbx,rdi
     1166700:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
     1166704:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1166707:	ff 50 50             	call   QWORD PTR [rax+0x50]
     116670a:	48 89 d8             	mov    rax,rbx
     116670d:	5b                   	pop    rbx
     116670e:	c3                   	ret
- +0x68 -> 0x116674e FDE=(18245454, 18245470)

## Materialization sites for top 30 candidate address points
### vptr 0x1817068 @0xc2c5ff, FDE=(12764448, 12771716)
      c2c5cc:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      c2c5d1:	48 89 df             	mov    rdi,rbx
      c2c5d4:	e8 77 52 fe ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
      c2c5d9:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      c2c5e0:	00 
      c2c5e1:	48 89 df             	mov    rdi,rbx
      c2c5e4:	e8 bb 52 fe ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
      c2c5e9:	48 89 c5             	mov    rbp,rax
      c2c5ec:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
      c2c5f1:	bf f0 00 00 00       	mov    edi,0xf0
      c2c5f6:	e8 05 19 bc 00       	call   17edf00 <_Znwm@plt>
      c2c5fb:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      c2c5ff:	48 8d 0d 62 aa be 00 	lea    rcx,[rip+0xbeaa62]        # 1817068 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcd28>
      c2c606:	48 89 08             	mov    QWORD PTR [rax],rcx
      c2c609:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
      c2c60e:	48 83 60 60 00       	and    QWORD PTR [rax+0x60],0x0
      c2c613:	48 8d 48 10          	lea    rcx,[rax+0x10]
      c2c617:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
      c2c61c:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
      c2c621:	48 8d 48 18          	lea    rcx,[rax+0x18]
      c2c625:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
      c2c62a:	48 83 a0 a0 00 00 00 	and    QWORD PTR [rax+0xa0],0x0
      c2c631:	00 
      c2c632:	48 8d 48 30          	lea    rcx,[rax+0x30]
      c2c636:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
      c2c63b:	48 8d 48 70          	lea    rcx,[rax+0x70]
      c2c63f:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      c2c644:	48 8d 88 c0 00 00 00 	lea    rcx,[rax+0xc0]
      c2c64b:	48 89 4c 24 78       	mov    QWORD PTR [rsp+0x78],rcx
      c2c650:	66 0f ef c0          	pxor   xmm0,xmm0
      c2c654:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
      c2c659:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
      c2c65e:	66 0f 7f 80 b0 00 00 	movdqa XMMWORD PTR [rax+0xb0],xmm0
      c2c665:	00 
      c2c666:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c2c66b:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
      c2c672:	00 
      c2c673:	6a 18                	push   0x18

### vptr 0x1817068 @0xc2e8c2, FDE=(12773566, 12773677)
      c2e8a3:	75 0c                	jne    c2e8b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b851>
      c2e8a5:	48 83 c4 38          	add    rsp,0x38
      c2e8a9:	5b                   	pop    rbx
      c2e8aa:	41 5c                	pop    r12
      c2e8ac:	41 5e                	pop    r14
      c2e8ae:	41 5f                	pop    r15
      c2e8b0:	c3                   	ret
      c2e8b1:	e8 fa 11 bc 00       	call   17efab0 <__stack_chk_fail@plt>
      c2e8b6:	48 89 c7             	mov    rdi,rax
      c2e8b9:	e8 e7 b1 e4 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c2e8be:	53                   	push   rbx
      c2e8bf:	48 89 fb             	mov    rbx,rdi
      c2e8c2:	48 8d 05 9f 87 be 00 	lea    rax,[rip+0xbe879f]        # 1817068 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcd28>
      c2e8c9:	48 89 07             	mov    QWORD PTR [rdi],rax
      c2e8cc:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
      c2e8d3:	e8 a4 08 f4 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
      c2e8d8:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
      c2e8df:	e8 44 b5 e4 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
      c2e8e4:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
      c2e8eb:	e8 38 b5 e4 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
      c2e8f0:	48 8b bb b8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb8]
      c2e8f7:	e8 8a fb e6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c2e8fc:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
      c2e900:	e8 85 fb ff ff       	call   c2e48a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b42a>
      c2e905:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      c2e909:	e8 32 fc ff ff       	call   c2e540 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b4e0>
      c2e90e:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      c2e912:	e8 41 fc ff ff       	call   c2e558 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b4f8>
      c2e917:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      c2e91b:	e8 08 b5 e4 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
      c2e920:	48 83 c3 10          	add    rbx,0x10
      c2e924:	48 89 df             	mov    rdi,rbx
      c2e927:	5b                   	pop    rbx
      c2e928:	e9 fb b4 e4 ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
      c2e92d:	cc                   	int3
      c2e92e:	53                   	push   rbx
      c2e92f:	48 89 fb             	mov    rbx,rdi
      c2e932:	e8 87 ff ff ff       	call   c2e8be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b85e>

### vptr 0x1867b28 @0x135a7e1, FDE=(20293452, 20300282)
     135a7ac:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
     135a7b1:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     135a7b6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     135a7bd:	00 
     135a7be:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     135a7c5:	00 
     135a7c6:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
     135a7cd:	00 
     135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
     135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
     135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
     135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
     135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     135a80e:	00 
     135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     135a816:	00 
     135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135a81e:	00 
     135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
     135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
     135a82d:	00 
     135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
     135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135a842:	f3 0f 7f 40 58       	movdqu XMMWORD PTR [rax+0x58],xmm0
     135a847:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a84b:	48 83 ec 10          	sub    rsp,0x10
     135a84f:	83 24 24 00          	and    DWORD PTR [rsp],0x0
     135a853:	bb 10 27 00 00       	mov    ebx,0x2710

### vptr 0x1867b28 @0x135c710, FDE=(20301580, 20301637)
     135c6ed:	41 5f                	pop    r15
     135c6ef:	5d                   	pop    rbp
     135c6f0:	c3                   	ret
     135c6f1:	48 89 c3             	mov    rbx,rax
     135c6f4:	4c 89 f7             	mov    rdi,r14
     135c6f7:	e8 14 19 49 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     135c6fc:	4c 89 f7             	mov    rdi,r14
     135c6ff:	e8 18 1d 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135c704:	48 89 df             	mov    rdi,rbx
     135c707:	e8 c4 35 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135c70c:	53                   	push   rbx
     135c70d:	48 89 fb             	mov    rbx,rdi
     135c710:	48 8d 05 11 b4 50 00 	lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135c717:	48 89 07             	mov    QWORD PTR [rdi],rax
     135c71a:	48 81 c7 d0 00 00 00 	add    rdi,0xd0
     135c721:	e8 58 fb ff ff       	call   135c27e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1802>
     135c726:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     135c72a:	e8 3f bb 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
     135c72f:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     135c733:	e8 d8 63 79 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     135c738:	48 83 c3 28          	add    rbx,0x28
     135c73c:	48 89 df             	mov    rdi,rbx
     135c73f:	5b                   	pop    rbx
     135c740:	e9 e7 fa ff ff       	jmp    135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>
     135c745:	cc                   	int3
     135c746:	53                   	push   rbx
     135c747:	48 89 fb             	mov    rbx,rdi
     135c74a:	e8 bd ff ff ff       	call   135c70c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1c90>
     135c74f:	48 89 df             	mov    rdi,rbx
     135c752:	5b                   	pop    rbx
     135c753:	e9 c8 17 49 00       	jmp    17edf20 <_ZdlPv@plt>
     135c758:	48 89 f8             	mov    rax,rdi
     135c75b:	48 8b 4e 48          	mov    rcx,QWORD PTR [rsi+0x48]
     135c75f:	0f 28 46 40          	movaps xmm0,XMMWORD PTR [rsi+0x40]
     135c763:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     135c766:	48 85 c9             	test   rcx,rcx
     135c769:	74 05                	je     135c770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1cf4>
     135c76b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]

