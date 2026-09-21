# fd4a92 event carrier producer

Known dispatcher contract:
- d8a5c2: carrier = [rdi]
- state receiver = [carrier+0]
- fd4a92 arg2 = carrier+8
- fd4a92 therefore locks weak pointer at carrier+0x18
- byte carrier+0x20 becomes fd4a92 edx
- carrier+0x50 is consumed after dispatch

## Relocations whose addend is exactly d8a5c2

## Any disassembly line referencing d8a5c2
### 0xd8a4e3; FDE=(14197896, 14198036)
      d8a497:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a49c:	6a 60                	push   0x60
      d8a49e:	5f                   	pop    rdi
      d8a49f:	e8 5c 3a a6 00       	call   17edf00 <_Znwm@plt>
      d8a4a4:	49 89 c6             	mov    r14,rax
      d8a4a7:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d8a4aa:	49 89 06             	mov    QWORD PTR [r14],rax
      d8a4ad:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      d8a4b1:	49 8d 77 08          	lea    rsi,[r15+0x8]
      d8a4b5:	e8 86 3a a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d8a4ba:	41 8a 47 20          	mov    al,BYTE PTR [r15+0x20]
      d8a4be:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
      d8a4c2:	4c 89 f7             	mov    rdi,r14
      d8a4c5:	48 83 c7 30          	add    rdi,0x30
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8a514:	41 57                	push   r15
      d8a516:	41 56                	push   r14
      d8a518:	53                   	push   rbx
      d8a519:	48 89 fb             	mov    rbx,rdi
      d8a51c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a520:	49 89 f6             	mov    r14,rsi
      d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a528:	6a 30                	push   0x30
      d8a52a:	5f                   	pop    rdi
      d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
      d8a530:	49 89 c7             	mov    r15,rax
      d8a533:	48 89 c7             	mov    rdi,rax
      d8a536:	4c 89 f6             	mov    rsi,r14
      d8a539:	e8 7a dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a53e:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      d8a541:	48 8d 05 92 94 d3 ff 	lea    rax,[rip+0xffffffffffd39492]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
      d8a548:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a54c:	48 8d 05 37 00 00 00 	lea    rax,[rip+0x37]        # d8a58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57610>
      d8a553:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a557:	5b                   	pop    rbx
      d8a558:	41 5e                	pop    r14
      d8a55a:	41 5f                	pop    r15
      d8a55c:	c3                   	ret
      d8a55d:	49 89 c6             	mov    r14,rax
      d8a560:	48 89 df             	mov    rdi,rbx
      d8a563:	e8 b8 93 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
      d8a568:	4c 89 f7             	mov    rdi,r14
      d8a56b:	e8 60 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

- ref count=1

## Numeric code refs resolving to 0xd8a5c2
### 0xd8a4e3; FDE=(14197896, 14198036)
      d8a497:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a49c:	6a 60                	push   0x60
      d8a49e:	5f                   	pop    rdi
      d8a49f:	e8 5c 3a a6 00       	call   17edf00 <_Znwm@plt>
      d8a4a4:	49 89 c6             	mov    r14,rax
      d8a4a7:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d8a4aa:	49 89 06             	mov    QWORD PTR [r14],rax
      d8a4ad:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      d8a4b1:	49 8d 77 08          	lea    rsi,[r15+0x8]
      d8a4b5:	e8 86 3a a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d8a4ba:	41 8a 47 20          	mov    al,BYTE PTR [r15+0x20]
      d8a4be:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
      d8a4c2:	4c 89 f7             	mov    rdi,r14
      d8a4c5:	48 83 c7 30          	add    rdi,0x30
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8a514:	41 57                	push   r15
      d8a516:	41 56                	push   r14
      d8a518:	53                   	push   rbx
      d8a519:	48 89 fb             	mov    rbx,rdi
      d8a51c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a520:	49 89 f6             	mov    r14,rsi
      d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a528:	6a 30                	push   0x30
      d8a52a:	5f                   	pop    rdi
      d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
      d8a530:	49 89 c7             	mov    r15,rax
      d8a533:	48 89 c7             	mov    rdi,rax
      d8a536:	4c 89 f6             	mov    rsi,r14
      d8a539:	e8 7a dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a53e:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      d8a541:	48 8d 05 92 94 d3 ff 	lea    rax,[rip+0xffffffffffd39492]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
      d8a548:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a54c:	48 8d 05 37 00 00 00 	lea    rax,[rip+0x37]        # d8a58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57610>
      d8a553:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a557:	5b                   	pop    rbx
      d8a558:	41 5e                	pop    r14
      d8a55a:	41 5f                	pop    r15
      d8a55c:	c3                   	ret
      d8a55d:	49 89 c6             	mov    r14,rax
      d8a560:	48 89 df             	mov    rdi,rbx
      d8a563:	e8 b8 93 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
      d8a568:	4c 89 f7             	mov    rdi,r14
      d8a56b:	e8 60 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

## Refs to sibling callback functions d8a58a/d8a598/d8a5c2
### target 0xd8a58a
- ref 0xd8a54c; FDE=(14198036, 14198128): lea    rax,[rip+0x37]        # d8a58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57610>
      d8a519:	48 89 fb             	mov    rbx,rdi
      d8a51c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a520:	49 89 f6             	mov    r14,rsi
      d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a528:	6a 30                	push   0x30
      d8a52a:	5f                   	pop    rdi
      d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
      d8a530:	49 89 c7             	mov    r15,rax
      d8a533:	48 89 c7             	mov    rdi,rax
      d8a536:	4c 89 f6             	mov    rsi,r14
      d8a539:	e8 7a dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a53e:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      d8a541:	48 8d 05 92 94 d3 ff 	lea    rax,[rip+0xffffffffffd39492]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
      d8a548:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a54c:	48 8d 05 37 00 00 00 	lea    rax,[rip+0x37]        # d8a58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57610>
      d8a553:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a557:	5b                   	pop    rbx
      d8a558:	41 5e                	pop    r14
      d8a55a:	41 5f                	pop    r15
      d8a55c:	c3                   	ret
      d8a55d:	49 89 c6             	mov    r14,rax
      d8a560:	48 89 df             	mov    rdi,rbx
      d8a563:	e8 b8 93 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
      d8a568:	4c 89 f7             	mov    rdi,r14
      d8a56b:	e8 60 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8a570:	53                   	push   rbx
      d8a571:	48 89 fb             	mov    rbx,rdi
      d8a574:	48 83 c7 30          	add    rdi,0x30
      d8a578:	e8 ed f9 ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8a57d:	48 83 c3 08          	add    rbx,0x8
      d8a581:	48 89 df             	mov    rdi,rbx
      d8a584:	5b                   	pop    rbx
      d8a585:	e9 06 39 a6 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d8a58a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d8a58d:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
      d8a591:	31 f6                	xor    esi,esi
      d8a593:	e9 c8 e3 df ff       	jmp    b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
      d8a598:	83 ff 01             	cmp    edi,0x1
      d8a59b:	74 1e                	je     d8a5bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57641>
      d8a59d:	85 ff                	test   edi,edi
      d8a59f:	75 20                	jne    d8a5c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57647>
      d8a5a1:	53                   	push   rbx
      d8a5a2:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]

### target 0xd8a598
- ref 0xd8a4d8; FDE=(14197896, 14198036): lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4a4:	49 89 c6             	mov    r14,rax
      d8a4a7:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d8a4aa:	49 89 06             	mov    QWORD PTR [r14],rax
      d8a4ad:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      d8a4b1:	49 8d 77 08          	lea    rsi,[r15+0x8]
      d8a4b5:	e8 86 3a a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d8a4ba:	41 8a 47 20          	mov    al,BYTE PTR [r15+0x20]
      d8a4be:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
      d8a4c2:	4c 89 f7             	mov    rdi,r14
      d8a4c5:	48 83 c7 30          	add    rdi,0x30
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8a514:	41 57                	push   r15
      d8a516:	41 56                	push   r14
      d8a518:	53                   	push   rbx
      d8a519:	48 89 fb             	mov    rbx,rdi
      d8a51c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a520:	49 89 f6             	mov    r14,rsi
      d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a528:	6a 30                	push   0x30
      d8a52a:	5f                   	pop    rdi
      d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
      d8a530:	49 89 c7             	mov    r15,rax
      d8a533:	48 89 c7             	mov    rdi,rax

### target 0xd8a5c2
- ref 0xd8a4e3; FDE=(14197896, 14198036): lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4aa:	49 89 06             	mov    QWORD PTR [r14],rax
      d8a4ad:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      d8a4b1:	49 8d 77 08          	lea    rsi,[r15+0x8]
      d8a4b5:	e8 86 3a a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d8a4ba:	41 8a 47 20          	mov    al,BYTE PTR [r15+0x20]
      d8a4be:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
      d8a4c2:	4c 89 f7             	mov    rdi,r14
      d8a4c5:	48 83 c7 30          	add    rdi,0x30
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8a514:	41 57                	push   r15
      d8a516:	41 56                	push   r14
      d8a518:	53                   	push   rbx
      d8a519:	48 89 fb             	mov    rbx,rdi
      d8a51c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a520:	49 89 f6             	mov    r14,rsi
      d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a528:	6a 30                	push   0x30
      d8a52a:	5f                   	pop    rdi
      d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
      d8a530:	49 89 c7             	mov    r15,rax
      d8a533:	48 89 c7             	mov    rdi,rax
      d8a536:	4c 89 f6             	mov    rsi,r14
      d8a539:	e8 7a dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>

## d8a4d0..d8a650 full local family
  d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
  d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
  d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
  d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
  d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  d8a4ee:	5b                   	pop    rbx
  d8a4ef:	41 5e                	pop    r14
  d8a4f1:	41 5f                	pop    r15
  d8a4f3:	c3                   	ret
  d8a4f4:	49 89 c7             	mov    r15,rax
  d8a4f7:	4c 89 f7             	mov    rdi,r14
  d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
  d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
  d8a501:	49 89 c7             	mov    r15,rax
  d8a504:	48 89 df             	mov    rdi,rbx
  d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
  d8a50c:	4c 89 ff             	mov    rdi,r15
  d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  d8a514:	41 57                	push   r15
  d8a516:	41 56                	push   r14
  d8a518:	53                   	push   rbx
  d8a519:	48 89 fb             	mov    rbx,rdi
  d8a51c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  d8a520:	49 89 f6             	mov    r14,rsi
  d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
  d8a528:	6a 30                	push   0x30
  d8a52a:	5f                   	pop    rdi
  d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
  d8a530:	49 89 c7             	mov    r15,rax
  d8a533:	48 89 c7             	mov    rdi,rax
  d8a536:	4c 89 f6             	mov    rsi,r14
  d8a539:	e8 7a dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
  d8a53e:	4c 89 3b             	mov    QWORD PTR [rbx],r15
  d8a541:	48 8d 05 92 94 d3 ff 	lea    rax,[rip+0xffffffffffd39492]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  d8a548:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  d8a54c:	48 8d 05 37 00 00 00 	lea    rax,[rip+0x37]        # d8a58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57610>
  d8a553:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  d8a557:	5b                   	pop    rbx
  d8a558:	41 5e                	pop    r14
  d8a55a:	41 5f                	pop    r15
  d8a55c:	c3                   	ret
  d8a55d:	49 89 c6             	mov    r14,rax
  d8a560:	48 89 df             	mov    rdi,rbx
  d8a563:	e8 b8 93 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
  d8a568:	4c 89 f7             	mov    rdi,r14
  d8a56b:	e8 60 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  d8a570:	53                   	push   rbx
  d8a571:	48 89 fb             	mov    rbx,rdi
  d8a574:	48 83 c7 30          	add    rdi,0x30
  d8a578:	e8 ed f9 ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d8a57d:	48 83 c3 08          	add    rbx,0x8
  d8a581:	48 89 df             	mov    rdi,rbx
  d8a584:	5b                   	pop    rbx
  d8a585:	e9 06 39 a6 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d8a58a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d8a58d:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
  d8a591:	31 f6                	xor    esi,esi
  d8a593:	e9 c8 e3 df ff       	jmp    b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
  d8a598:	83 ff 01             	cmp    edi,0x1
  d8a59b:	74 1e                	je     d8a5bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57641>
  d8a59d:	85 ff                	test   edi,edi
  d8a59f:	75 20                	jne    d8a5c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57647>
  d8a5a1:	53                   	push   rbx
  d8a5a2:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
  d8a5a5:	48 85 db             	test   rbx,rbx
  d8a5a8:	74 08                	je     d8a5b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57638>
  d8a5aa:	48 89 df             	mov    rdi,rbx
  d8a5ad:	e8 be ff ff ff       	call   d8a570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x575f6>
  d8a5b2:	48 89 df             	mov    rdi,rbx
  d8a5b5:	5b                   	pop    rbx
  d8a5b6:	e9 65 39 a6 00       	jmp    17edf20 <_ZdlPv@plt>
  d8a5bb:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  d8a5be:	48 89 06             	mov    QWORD PTR [rsi],rax
  d8a5c1:	c3                   	ret
  d8a5c2:	53                   	push   rbx
  d8a5c3:	48 89 f1             	mov    rcx,rsi
  d8a5c6:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  d8a5c9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  d8a5cc:	48 8d 73 08          	lea    rsi,[rbx+0x8]
  d8a5d0:	0f b6 53 20          	movzx  edx,BYTE PTR [rbx+0x20]
  d8a5d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d8a5d7:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
  d8a5dd:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
  d8a5e1:	6a 01                	push   0x1
  d8a5e3:	5e                   	pop    rsi
  d8a5e4:	5b                   	pop    rbx
  d8a5e5:	e9 76 e3 df ff       	jmp    b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
  d8a5ea:	55                   	push   rbp
  d8a5eb:	41 57                	push   r15
  d8a5ed:	41 56                	push   r14
  d8a5ef:	53                   	push   rbx
  d8a5f0:	50                   	push   rax
  d8a5f1:	48 81 c7 e0 04 00 00 	add    rdi,0x4e0
  d8a5f8:	e8 2f f4 ff ff       	call   d89a2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ab2>
  d8a5fd:	31 db                	xor    ebx,ebx
  d8a5ff:	48 85 c0             	test   rax,rax
  d8a602:	74 2d                	je     d8a631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576b7>
  d8a604:	4c 8b 30             	mov    r14,QWORD PTR [rax]
  d8a607:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
  d8a60b:	4d 39 fe             	cmp    r14,r15
  d8a60e:	74 21                	je     d8a631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576b7>
  d8a610:	6a 02                	push   0x2
  d8a612:	5b                   	pop    rbx
  d8a613:	6a 01                	push   0x1
  d8a615:	5d                   	pop    rbp
  d8a616:	4d 39 fe             	cmp    r14,r15
  d8a619:	74 16                	je     d8a631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576b7>
  d8a61b:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  d8a61e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d8a621:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
  d8a627:	49 83 c6 08          	add    r14,0x8
  d8a62b:	84 c0                	test   al,al
  d8a62d:	74 e7                	je     d8a616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5769c>
  d8a62f:	89 eb                	mov    ebx,ebp
  d8a631:	89 d8                	mov    eax,ebx
  d8a633:	48 83 c4 08          	add    rsp,0x8
  d8a637:	5b                   	pop    rbx
  d8a638:	41 5e                	pop    r14
  d8a63a:	41 5f                	pop    r15
  d8a63c:	5d                   	pop    rbp
  d8a63d:	c3                   	ret
  d8a63e:	53                   	push   rbx
  d8a63f:	48 89 fb             	mov    rbx,rdi
  d8a642:	83 7f 38 00          	cmp    DWORD PTR [rdi+0x38],0x0
  d8a646:	74 0c                	je     d8a654 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576da>
  d8a648:	48 89 df             	mov    rdi,rbx
  d8a64b:	e8 ec 64 fe ff       	call   d70b3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dbc2>

## Candidate constructor families
### FDE 0xd8a488..0xd8a514
      d8a497:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a49f:	e8 5c 3a a6 00       	call   17edf00 <_Znwm@plt>
      d8a4ad:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      d8a4b1:	49 8d 77 08          	lea    rsi,[r15+0x8]
      d8a4ba:	41 8a 47 20          	mov    al,BYTE PTR [r15+0x20]
      d8a4be:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax

### FDE 0xd8a514..0xd8a570
      d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
      d8a548:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a553:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax

## Any relocation line containing d8a5c2 hex text
