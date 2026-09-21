# d8a5c2 receiver source

Known: d8a488 clones source rsp+0x160; source[0] becomes carrier[0]; d8a5c2 loads receiver=carrier[0] and calls receiver vtable +0x1d8.

## Full caller FDE d85524..d85885

/tmp/d8src/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000d85524 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x525aa>:
  d85524:	55                   	push   rbp
  d85525:	41 57                	push   r15
  d85527:	41 56                	push   r14
  d85529:	41 55                	push   r13
  d8552b:	41 54                	push   r12
  d8552d:	53                   	push   rbx
  d8552e:	48 81 ec e8 01 00 00 	sub    rsp,0x1e8
  d85535:	4d 89 c6             	mov    r14,r8
  d85538:	48 89 fb             	mov    rbx,rdi
  d8553b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d85542:	00 00 
  d85544:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
  d8554b:	00 
  d8554c:	80 be 10 02 00 00 00 	cmp    BYTE PTR [rsi+0x210],0x0
  d85553:	0f 84 32 01 00 00    	je     d8568b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52711>
  d85559:	89 cd                	mov    ebp,ecx
  d8555b:	49 89 d7             	mov    r15,rdx
  d8555e:	49 89 f4             	mov    r12,rsi
  d85561:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
  d85566:	44 0f b6 ed          	movzx  r13d,bpl
  d8556a:	48 8d bc 24 cc 01 00 	lea    rdi,[rsp+0x1cc]
  d85571:	00 
  d85572:	48 89 d6             	mov    rsi,rdx
  d85575:	44 89 ea             	mov    edx,r13d
  d85578:	e8 b3 37 00 00       	call   d88d30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55db6>
  d8557d:	48 8d 9c 24 68 01 00 	lea    rbx,[rsp+0x168]
  d85584:	00 
  d85585:	4c 89 63 f8          	mov    QWORD PTR [rbx-0x8],r12
  d85589:	48 89 df             	mov    rdi,rbx
  d8558c:	4c 89 fe             	mov    rsi,r15
  d8558f:	e8 ac 89 a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d85594:	44 88 6b 18          	mov    BYTE PTR [rbx+0x18],r13b
  d85598:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
  d8559f:	00 
  d855a0:	4c 89 f6             	mov    rsi,r14
  d855a3:	e8 e8 4c cf ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d855a8:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  d855af:	00 
  d855b0:	4c 89 f6             	mov    rsi,r14
  d855b3:	e8 d8 4c cf ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d855b8:	40 84 ed             	test   bpl,bpl
  d855bb:	0f 84 f7 00 00 00    	je     d856b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5273e>
  d855c1:	41 83 fd 01          	cmp    r13d,0x1
  d855c5:	0f 85 ae 01 00 00    	jne    d85779 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x527ff>
  d855cb:	4d 8b b4 24 58 02 00 	mov    r14,QWORD PTR [r12+0x258]
  d855d2:	00 
  d855d3:	8b 84 24 dc 01 00 00 	mov    eax,DWORD PTR [rsp+0x1dc]
  d855da:	89 84 24 90 00 00 00 	mov    DWORD PTR [rsp+0x90],eax
  d855e1:	0f 10 84 24 cc 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1cc]
  d855e8:	00 
  d855e9:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
  d855f0:	00 
  d855f1:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
  d855f8:	00 00 
  d855fa:	83 a4 24 a0 00 00 00 	and    DWORD PTR [rsp+0xa0],0x0
  d85601:	00 
  d85602:	31 c0                	xor    eax,eax
  d85604:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
  d85608:	88 44 24 78          	mov    BYTE PTR [rsp+0x78],al
  d8560c:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  d85611:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d85618:	00 
  d85619:	e8 6a 4e 00 00       	call   d8a488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5750e>
  d8561e:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  d85623:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  d85628:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
  d8562f:	00 
  d85630:	e8 df 4e 00 00       	call   d8a514 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5759a>
  d85635:	49 8b 06             	mov    rax,QWORD PTR [r14]
  d85638:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  d8563c:	8a 4c 24 78          	mov    cl,BYTE PTR [rsp+0x78]
  d85640:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
  d85644:	0f 10 44 24 68       	movups xmm0,XMMWORD PTR [rsp+0x68]
  d85649:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  d8564d:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
  d85654:	00 
  d85655:	6a 01                	push   0x1
  d85657:	59                   	pop    rcx
  d85658:	4c 8d 44 24 48       	lea    r8,[rsp+0x48]
  d8565d:	4c 8d 4c 24 28       	lea    r9,[rsp+0x28]
  d85662:	48 89 df             	mov    rdi,rbx
  d85665:	4c 89 f6             	mov    rsi,r14
  d85668:	ff d0                	call   rax
  d8566a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  d8566f:	e8 ac e2 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
  d85674:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  d85679:	e8 76 e3 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
  d8567e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  d85685:	00 
  d85686:	e9 e7 00 00 00       	jmp    d85772 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x527f8>
  d8568b:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  d8568f:	31 f6                	xor    esi,esi
  d85691:	e8 ca 32 e0 ff       	call   b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
  d85696:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d8569d:	00 00 
  d8569f:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
  d856a6:	00 
  d856a7:	0f 85 d3 01 00 00    	jne    d85880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52906>
  d856ad:	0f 57 c0             	xorps  xmm0,xmm0
  d856b0:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  d856b3:	e9 08 01 00 00       	jmp    d857c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52846>
  d856b8:	4d 8b b4 24 58 02 00 	mov    r14,QWORD PTR [r12+0x258]
  d856bf:	00 
  d856c0:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
  d856c7:	00 
  d856c8:	4c 89 fe             	mov    rsi,r15
  d856cb:	e8 00 ca ed ff       	call   c620d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1af070>
  d856d0:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  d856d5:	31 c0                	xor    eax,eax
  d856d7:	88 84 24 f0 00 00 00 	mov    BYTE PTR [rsp+0xf0],al
  d856de:	88 84 24 00 01 00 00 	mov    BYTE PTR [rsp+0x100],al
  d856e5:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  d856ec:	00 
  d856ed:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d856f4:	00 
  d856f5:	e8 8e 4d 00 00       	call   d8a488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5750e>
  d856fa:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  d85701:	00 
  d85702:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
  d85709:	00 
  d8570a:	e8 05 4e 00 00       	call   d8a514 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5759a>
  d8570f:	49 8b 06             	mov    rax,QWORD PTR [r14]
  d85712:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  d85716:	8a 8c 24 00 01 00 00 	mov    cl,BYTE PTR [rsp+0x100]
  d8571d:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
  d85721:	0f 10 84 24 f0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xf0]
  d85728:	00 
  d85729:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  d8572d:	48 8d 94 24 08 01 00 	lea    rdx,[rsp+0x108]
  d85734:	00 
  d85735:	6a 01                	push   0x1
  d85737:	59                   	pop    rcx
  d85738:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
  d8573f:	00 
  d85740:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
  d85747:	00 
  d85748:	48 89 df             	mov    rdi,rbx
  d8574b:	4c 89 f6             	mov    rsi,r14
  d8574e:	ff d0                	call   rax
  d85750:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  d85757:	00 
  d85758:	e8 c3 e1 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
  d8575d:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  d85764:	00 
  d85765:	e8 8a e2 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
  d8576a:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
  d85771:	00 
  d85772:	e8 39 ce ed ff       	call   c625b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1af550>
  d85777:	eb 16                	jmp    d8578f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52815>
  d85779:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  d8577d:	31 f6                	xor    esi,esi
  d8577f:	e8 dc 31 e0 ff       	call   b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
  d85784:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  d85789:	0f 57 c0             	xorps  xmm0,xmm0
  d8578c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  d8578f:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  d85796:	00 
  d85797:	e8 ce 47 cf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d8579c:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d857a3:	00 
  d857a4:	e8 c7 4d 00 00       	call   d8a570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x575f6>
  d857a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d857b0:	00 00 
  d857b2:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
  d857b9:	00 
  d857ba:	0f 85 c0 00 00 00    	jne    d85880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52906>
  d857c0:	48 89 d8             	mov    rax,rbx
  d857c3:	48 81 c4 e8 01 00 00 	add    rsp,0x1e8
  d857ca:	5b                   	pop    rbx
  d857cb:	41 5c                	pop    r12
  d857cd:	41 5d                	pop    r13
  d857cf:	41 5e                	pop    r14
  d857d1:	41 5f                	pop    r15
  d857d3:	5d                   	pop    rbp
  d857d4:	c3                   	ret
  d857d5:	49 89 c6             	mov    r14,rax
  d857d8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  d857df:	00 
  d857e0:	e8 3b e1 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
  d857e5:	eb 03                	jmp    d857ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52870>
  d857e7:	49 89 c6             	mov    r14,rax
  d857ea:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  d857f1:	00 
  d857f2:	e8 fd e1 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
  d857f7:	eb 12                	jmp    d8580b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52891>
  d857f9:	49 89 c6             	mov    r14,rax
  d857fc:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  d85801:	e8 1a e1 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
  d85806:	eb 10                	jmp    d85818 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5289e>
  d85808:	49 89 c6             	mov    r14,rax
  d8580b:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
  d85812:	00 
  d85813:	eb 1a                	jmp    d8582f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528b5>
  d85815:	49 89 c6             	mov    r14,rax
  d85818:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  d8581d:	e8 d2 e1 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
  d85822:	eb 03                	jmp    d85827 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528ad>
  d85824:	49 89 c6             	mov    r14,rax
  d85827:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  d8582e:	00 
  d8582f:	e8 7c cd ed ff       	call   c625b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1af550>
  d85834:	eb 03                	jmp    d85839 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528bf>
  d85836:	49 89 c6             	mov    r14,rax
  d85839:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  d85840:	00 
  d85841:	e8 24 47 cf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d85846:	eb 03                	jmp    d8584b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528d1>
  d85848:	49 89 c6             	mov    r14,rax
  d8584b:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d85852:	00 
  d85853:	e8 18 4d 00 00       	call   d8a570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x575f6>
  d85858:	eb 0b                	jmp    d85865 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528eb>
  d8585a:	49 89 c6             	mov    r14,rax
  d8585d:	48 89 df             	mov    rdi,rbx
  d85860:	e8 2b 86 a6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d85865:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d8586c:	00 00 
  d8586e:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
  d85875:	00 
  d85876:	75 08                	jne    d85880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52906>
  d85878:	4c 89 f7             	mov    rdi,r14
  d8587b:	e8 50 a4 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  d85880:	e8 2b a2 a6 00       	call   17efab0 <__stack_chk_fail@plt>

## Exact rsp+0x160 references

## Writes covering rsp+0x160..0x180 in caller FDE
  d8557d:	48 8d 9c 24 68 01 00 	lea    rbx,[rsp+0x168]
  d85611:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d856ed:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d8579c:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d8584b:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]

## Potential producer calls before first d8a488
  d8554b:	00 
  d8554c:	80 be 10 02 00 00 00 	cmp    BYTE PTR [rsi+0x210],0x0
  d85553:	0f 84 32 01 00 00    	je     d8568b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52711>
  d85559:	89 cd                	mov    ebp,ecx
  d8555b:	49 89 d7             	mov    r15,rdx
  d8555e:	49 89 f4             	mov    r12,rsi
  d85561:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
  d85566:	44 0f b6 ed          	movzx  r13d,bpl
  d8556a:	48 8d bc 24 cc 01 00 	lea    rdi,[rsp+0x1cc]
  d85571:	00 
  d85572:	48 89 d6             	mov    rsi,rdx
  d85575:	44 89 ea             	mov    edx,r13d
  d85578:	e8 b3 37 00 00       	call   d88d30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55db6>
  d8557d:	48 8d 9c 24 68 01 00 	lea    rbx,[rsp+0x168]
  d85584:	00 
  d85585:	4c 89 63 f8          	mov    QWORD PTR [rbx-0x8],r12
  d85589:	48 89 df             	mov    rdi,rbx
  d8558c:	4c 89 fe             	mov    rsi,r15
  d8558f:	e8 ac 89 a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d85594:	44 88 6b 18          	mov    BYTE PTR [rbx+0x18],r13b
  d85598:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
  d8559f:	00 
  d855a0:	4c 89 f6             	mov    rsi,r14
  d855a3:	e8 e8 4c cf ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d855a8:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  d855af:	00 
  d855b0:	4c 89 f6             	mov    rsi,r14
  d855b3:	e8 d8 4c cf ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d855b8:	40 84 ed             	test   bpl,bpl
  d855bb:	0f 84 f7 00 00 00    	je     d856b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5273e>
  d855c1:	41 83 fd 01          	cmp    r13d,0x1
  d855c5:	0f 85 ae 01 00 00    	jne    d85779 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x527ff>
  d855cb:	4d 8b b4 24 58 02 00 	mov    r14,QWORD PTR [r12+0x258]
  d855d2:	00 
  d855d3:	8b 84 24 dc 01 00 00 	mov    eax,DWORD PTR [rsp+0x1dc]
  d855da:	89 84 24 90 00 00 00 	mov    DWORD PTR [rsp+0x90],eax
  d855e1:	0f 10 84 24 cc 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1cc]
  d855e8:	00 
  d855e9:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
  d855f0:	00 
  d855f1:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
  d855f8:	00 00 
  d855fa:	83 a4 24 a0 00 00 00 	and    DWORD PTR [rsp+0xa0],0x0
  d85601:	00 
  d85602:	31 c0                	xor    eax,eax
  d85604:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al

## Receiver-vptr consumers via +0x1d8 in this FDE
