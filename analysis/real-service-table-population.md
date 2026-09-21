# Real service-table population scan

Generated accessor fingerprints:
- service ID 47 -> table offset +0x178
- service ID 81 -> table offset +0x288
- service ID 178 -> table offset +0x590
- service ID 184 -> table offset +0x5c0

A strong population candidate should store to multiple offsets above using the same table-base register in one FDE.

## Multi-slot writer candidates
### touches=3/4 stores=3 FDE=0x12cb106..0x12cbc74 base=rbx
- service 81 +0x288:
     12cb4ac:	48 89 93 88 02 00 00 	mov    QWORD PTR [rbx+0x288],rdx
- service 178 +0x590:
     12cb7ee:	89 83 90 05 00 00    	mov    DWORD PTR [rbx+0x590],eax
- service 184 +0x5c0:
     12cb808:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0
#### Full FDE
     12cb106:	55                   	push   rbp
     12cb107:	41 57                	push   r15
     12cb109:	41 56                	push   r14
     12cb10b:	41 55                	push   r13
     12cb10d:	41 54                	push   r12
     12cb10f:	53                   	push   rbx
     12cb110:	48 81 ec 28 01 00 00 	sub    rsp,0x128
     12cb117:	4d 89 ce             	mov    r14,r9
     12cb11a:	4c 89 44 24 38       	mov    QWORD PTR [rsp+0x38],r8
     12cb11f:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
     12cb124:	48 89 54 24 28       	mov    QWORD PTR [rsp+0x28],rdx
     12cb129:	48 89 74 24 20       	mov    QWORD PTR [rsp+0x20],rsi
     12cb12e:	48 89 fb             	mov    rbx,rdi
     12cb131:	48 8b 94 24 98 01 00 	mov    rdx,QWORD PTR [rsp+0x198]
     12cb138:	00 
     12cb139:	4c 8b bc 24 90 01 00 	mov    r15,QWORD PTR [rsp+0x190]
     12cb140:	00 
     12cb141:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
     12cb148:	00 
     12cb149:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     12cb150:	00 00 
     12cb152:	48 89 8c 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rcx
     12cb159:	00 
     12cb15a:	48 8d 0d 3f 74 59 00 	lea    rcx,[rip+0x59743f]        # 18625a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ec88>
     12cb161:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     12cb164:	48 8d 0d 85 74 59 00 	lea    rcx,[rip+0x597485]        # 18625f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ecd8>
     12cb16b:	48 89 4f 08          	mov    QWORD PTR [rdi+0x8],rcx
     12cb16f:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx
     12cb173:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     12cb177:	49 8b 07             	mov    rax,QWORD PTR [r15]
     12cb17a:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     12cb17e:	41 8a 47 08          	mov    al,BYTE PTR [r15+0x8]
     12cb182:	88 47 28             	mov    BYTE PTR [rdi+0x28],al
     12cb185:	48 83 c7 30          	add    rdi,0x30
     12cb189:	49 8d 77 10          	lea    rsi,[r15+0x10]
     12cb18d:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     12cb192:	e8 03 67 b1 ff       	call   de189a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae920>
     12cb197:	4c 8d a3 c8 00 00 00 	lea    r12,[rbx+0xc8]
     12cb19e:	49 8d af a8 00 00 00 	lea    rbp,[r15+0xa8]
     12cb1a5:	4c 89 e7             	mov    rdi,r12
     12cb1a8:	48 89 ee             	mov    rsi,rbp
     12cb1ab:	e8 9a 01 a4 ff       	call   d0b34a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2582ea>
     12cb1b0:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
     12cb1b5:	4c 8d ab 10 01 00 00 	lea    r13,[rbx+0x110]
     12cb1bc:	49 8d b7 f0 00 00 00 	lea    rsi,[r15+0xf0]
     12cb1c3:	4c 89 ef             	mov    rdi,r13
     12cb1c6:	e8 fd f9 fc ff       	call   129abc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe014c>
     12cb1cb:	4c 8d b3 60 01 00 00 	lea    r14,[rbx+0x160]
     12cb1d2:	49 8d b7 40 01 00 00 	lea    rsi,[r15+0x140]
     12cb1d9:	4c 89 f7             	mov    rdi,r14
     12cb1dc:	e8 f1 f9 fc ff       	call   129abd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0156>
     12cb1e1:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
     12cb1e8:	49 8d b7 98 01 00 00 	lea    rsi,[r15+0x198]
     12cb1ef:	e8 2e 4a fb ff       	call   127fc22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc51a6>
     12cb1f4:	49 8b 87 b0 01 00 00 	mov    rax,QWORD PTR [r15+0x1b0]
     12cb1fb:	48 89 83 d0 01 00 00 	mov    QWORD PTR [rbx+0x1d0],rax
     12cb202:	4c 8d ab d8 01 00 00 	lea    r13,[rbx+0x1d8]
     12cb209:	4c 89 ef             	mov    rdi,r13
     12cb20c:	48 89 ee             	mov    rsi,rbp
     12cb20f:	e8 36 01 a4 ff       	call   d0b34a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2582ea>
     12cb214:	4c 89 ef             	mov    rdi,r13
     12cb217:	e8 f2 fc ff ff       	call   12caf0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110492>
     12cb21c:	49 8b 97 c0 00 00 00 	mov    rdx,QWORD PTR [r15+0xc0]
     12cb223:	48 85 d2             	test   rdx,rdx
     12cb226:	4c 8d 35 bb 3c 70 00 	lea    r14,[rip+0x703cbb]        # 19ceee8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x97b30>
     12cb22d:	49 0f 44 d6          	cmove  rdx,r14
     12cb231:	b1 01                	mov    cl,0x1
     12cb233:	80 7a 2a 00          	cmp    BYTE PTR [rdx+0x2a],0x0
     12cb237:	4c 8d 25 ea 04 70 00 	lea    r12,[rip+0x7004ea]        # 19cb728 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x94370>
     12cb23e:	75 11                	jne    12cb251 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1107d5>
     12cb240:	49 8b 8f 78 01 00 00 	mov    rcx,QWORD PTR [r15+0x178]
     12cb247:	48 85 c9             	test   rcx,rcx
     12cb24a:	49 0f 44 cc          	cmove  rcx,r12
     12cb24e:	8a 49 18             	mov    cl,BYTE PTR [rcx+0x18]
     12cb251:	88 48 2a             	mov    BYTE PTR [rax+0x2a],cl
     12cb254:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
     12cb258:	4c 89 ef             	mov    rdi,r13
     12cb25b:	e8 ae fc ff ff       	call   12caf0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110492>
     12cb260:	49 8b 97 c0 00 00 00 	mov    rdx,QWORD PTR [r15+0xc0]
     12cb267:	48 85 d2             	test   rdx,rdx
     12cb26a:	49 0f 44 d6          	cmove  rdx,r14
     12cb26e:	b1 01                	mov    cl,0x1
     12cb270:	80 7a 32 00          	cmp    BYTE PTR [rdx+0x32],0x0
     12cb274:	b2 01                	mov    dl,0x1
     12cb276:	75 13                	jne    12cb28b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11080f>
     12cb278:	49 8b 97 78 01 00 00 	mov    rdx,QWORD PTR [r15+0x178]
     12cb27f:	48 85 d2             	test   rdx,rdx
     12cb282:	4c 0f 45 e2          	cmovne r12,rdx
     12cb286:	41 8a 54 24 1a       	mov    dl,BYTE PTR [r12+0x1a]
     12cb28b:	88 50 32             	mov    BYTE PTR [rax+0x32],dl
     12cb28e:	80 48 11 04          	or     BYTE PTR [rax+0x11],0x4
     12cb292:	41 80 bf e7 00 00 00 	cmp    BYTE PTR [r15+0xe7],0x0
     12cb299:	00 
     12cb29a:	4c 8d 25 67 04 70 00 	lea    r12,[rip+0x700467]        # 19cb708 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x94350>
     12cb2a1:	75 11                	jne    12cb2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110838>
     12cb2a3:	49 8b 87 70 01 00 00 	mov    rax,QWORD PTR [r15+0x170]
     12cb2aa:	48 85 c0             	test   rax,rax
     12cb2ad:	49 0f 44 c4          	cmove  rax,r12
     12cb2b1:	8a 48 18             	mov    cl,BYTE PTR [rax+0x18]
     12cb2b4:	88 8b 17 02 00 00    	mov    BYTE PTR [rbx+0x217],cl
     12cb2ba:	80 8b e9 01 00 00 08 	or     BYTE PTR [rbx+0x1e9],0x8
     12cb2c1:	4c 89 ef             	mov    rdi,r13
     12cb2c4:	e8 45 fc ff ff       	call   12caf0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110492>
     12cb2c9:	49 8b 97 c0 00 00 00 	mov    rdx,QWORD PTR [r15+0xc0]
     12cb2d0:	48 85 d2             	test   rdx,rdx
     12cb2d3:	49 0f 44 d6          	cmove  rdx,r14
     12cb2d7:	b1 01                	mov    cl,0x1
     12cb2d9:	80 7a 2e 00          	cmp    BYTE PTR [rdx+0x2e],0x0
     12cb2dd:	75 13                	jne    12cb2f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110876>
     12cb2df:	49 8b 8f 70 01 00 00 	mov    rcx,QWORD PTR [r15+0x170]
     12cb2e6:	48 85 c9             	test   rcx,rcx
     12cb2e9:	4c 0f 45 e1          	cmovne r12,rcx
     12cb2ed:	41 8a 4c 24 1a       	mov    cl,BYTE PTR [r12+0x1a]
     12cb2f2:	88 48 2e             	mov    BYTE PTR [rax+0x2e],cl
     12cb2f5:	80 48 10 40          	or     BYTE PTR [rax+0x10],0x40
     12cb2f9:	4c 89 ef             	mov    rdi,r13
     12cb2fc:	e8 0d fc ff ff       	call   12caf0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110492>
     12cb301:	49 8b 8f c0 00 00 00 	mov    rcx,QWORD PTR [r15+0xc0]
     12cb308:	48 85 c9             	test   rcx,rcx
     12cb30b:	4c 0f 45 f1          	cmovne r14,rcx
     12cb30f:	b1 01                	mov    cl,0x1
     12cb311:	41 80 7e 3a 00       	cmp    BYTE PTR [r14+0x3a],0x0
     12cb316:	75 18                	jne    12cb330 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1108b4>
     12cb318:	49 8b 8f 80 01 00 00 	mov    rcx,QWORD PTR [r15+0x180]
     12cb31f:	48 85 c9             	test   rcx,rcx
     12cb322:	48 8d 15 3f 04 70 00 	lea    rdx,[rip+0x70043f]        # 19cb768 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x943b0>
     12cb329:	48 0f 45 d1          	cmovne rdx,rcx
     12cb32d:	8a 4a 18             	mov    cl,BYTE PTR [rdx+0x18]
     12cb330:	88 48 3a             	mov    BYTE PTR [rax+0x3a],cl
     12cb333:	80 48 12 04          	or     BYTE PTR [rax+0x12],0x4
     12cb337:	41 8a 87 91 01 00 00 	mov    al,BYTE PTR [r15+0x191]
     12cb33e:	41 8a 8f e2 00 00 00 	mov    cl,BYTE PTR [r15+0xe2]
     12cb345:	08 c1                	or     cl,al
     12cb347:	0f 95 83 12 02 00 00 	setne  BYTE PTR [rbx+0x212]
     12cb34e:	41 0a 87 e5 00 00 00 	or     al,BYTE PTR [r15+0xe5]
     12cb355:	0f 95 83 15 02 00 00 	setne  BYTE PTR [rbx+0x215]
     12cb35c:	81 8b e8 01 00 00 40 	or     DWORD PTR [rbx+0x1e8],0x240
     12cb363:	02 00 00 
     12cb366:	48 8d bb 20 02 00 00 	lea    rdi,[rbx+0x220]
     12cb36d:	4c 8b a4 24 98 01 00 	mov    r12,QWORD PTR [rsp+0x198]
     12cb374:	00 
     12cb375:	49 8b 94 24 e8 00 00 	mov    rdx,QWORD PTR [r12+0xe8]
     12cb37c:	00 
     12cb37d:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
     12cb384:	00 
     12cb385:	49 89 1e             	mov    QWORD PTR [r14],rbx
     12cb388:	48 8d 05 d5 10 7b ff 	lea    rax,[rip+0xffffffffff7b10d5]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     12cb38f:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     12cb393:	48 8d 05 70 0c 00 00 	lea    rax,[rip+0xc70]        # 12cc00a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11158e>
     12cb39a:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     12cb39e:	48 8b b3 d0 01 00 00 	mov    rsi,QWORD PTR [rbx+0x1d0]
     12cb3a5:	6a 01                	push   0x1
     12cb3a7:	41 58                	pop    r8
     12cb3a9:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     12cb3ae:	4c 89 f1             	mov    rcx,r14
     12cb3b1:	e8 a4 ea 07 00       	call   1349e5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f3de>
     12cb3b6:	4c 89 f7             	mov    rdi,r14
     12cb3b9:	e8 e0 be 7d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     12cb3be:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     12cb3c3:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     12cb3c6:	48 89 83 28 02 00 00 	mov    QWORD PTR [rbx+0x228],rax
     12cb3cd:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     12cb3d1:	48 89 83 30 02 00 00 	mov    QWORD PTR [rbx+0x230],rax
     12cb3d8:	48 85 c0             	test   rax,rax
     12cb3db:	74 05                	je     12cb3e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110966>
     12cb3dd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     12cb3e2:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     12cb3e7:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     12cb3ea:	48 89 83 38 02 00 00 	mov    QWORD PTR [rbx+0x238],rax
     12cb3f1:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     12cb3f5:	48 89 83 40 02 00 00 	mov    QWORD PTR [rbx+0x240],rax
     12cb3fc:	48 85 c0             	test   rax,rax
     12cb3ff:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     12cb404:	74 05                	je     12cb40b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11098f>
     12cb406:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     12cb40b:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     12cb410:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     12cb413:	48 89 83 48 02 00 00 	mov    QWORD PTR [rbx+0x248],rax
     12cb41a:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     12cb41e:	48 89 83 50 02 00 00 	mov    QWORD PTR [rbx+0x250],rax
     12cb425:	48 85 c0             	test   rax,rax
     12cb428:	74 05                	je     12cb42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1109b3>
     12cb42a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     12cb42f:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
     12cb434:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     12cb437:	48 89 83 58 02 00 00 	mov    QWORD PTR [rbx+0x258],rax
     12cb43e:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     12cb442:	48 89 83 60 02 00 00 	mov    QWORD PTR [rbx+0x260],rax
     12cb449:	48 85 c0             	test   rax,rax
     12cb44c:	74 05                	je     12cb453 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1109d7>
     12cb44e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     12cb453:	48 8b 84 24 60 01 00 	mov    rax,QWORD PTR [rsp+0x160]
     12cb45a:	00 
     12cb45b:	48 8b 0a             	mov    rcx,QWORD PTR [rdx]
     12cb45e:	48 89 8b 68 02 00 00 	mov    QWORD PTR [rbx+0x268],rcx
     12cb465:	48 8b 4a 08          	mov    rcx,QWORD PTR [rdx+0x8]
     12cb469:	48 89 8b 70 02 00 00 	mov    QWORD PTR [rbx+0x270],rcx
     12cb470:	48 85 c9             	test   rcx,rcx
     12cb473:	74 05                	je     12cb47a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1109fe>
     12cb475:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     12cb47a:	48 8b 8c 24 68 01 00 	mov    rcx,QWORD PTR [rsp+0x168]
     12cb481:	00 
     12cb482:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     12cb485:	48 89 93 78 02 00 00 	mov    QWORD PTR [rbx+0x278],rdx
     12cb48c:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     12cb490:	48 89 83 80 02 00 00 	mov    QWORD PTR [rbx+0x280],rax
     12cb497:	48 85 c0             	test   rax,rax
     12cb49a:	74 05                	je     12cb4a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110a25>
     12cb49c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     12cb4a1:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
     12cb4a8:	00 
     12cb4a9:	48 8b 11             	mov    rdx,QWORD PTR [rcx]
     12cb4ac:	48 89 93 88 02 00 00 	mov    QWORD PTR [rbx+0x288],rdx
     12cb4b3:	48 8b 49 08          	mov    rcx,QWORD PTR [rcx+0x8]
     12cb4b7:	48 89 8b 90 02 00 00 	mov    QWORD PTR [rbx+0x290],rcx
     12cb4be:	48 85 c9             	test   rcx,rcx
     12cb4c1:	74 05                	je     12cb4c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110a4c>
     12cb4c3:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     12cb4c8:	48 8b 8c 24 78 01 00 	mov    rcx,QWORD PTR [rsp+0x178]
     12cb4cf:	00 
     12cb4d0:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     12cb4d3:	48 89 93 98 02 00 00 	mov    QWORD PTR [rbx+0x298],rdx
     12cb4da:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     12cb4de:	48 89 83 a0 02 00 00 	mov    QWORD PTR [rbx+0x2a0],rax
     12cb4e5:	48 85 c0             	test   rax,rax
     12cb4e8:	74 05                	je     12cb4ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110a73>
     12cb4ea:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     12cb4ef:	48 8b 84 24 80 01 00 	mov    rax,QWORD PTR [rsp+0x180]
     12cb4f6:	00 
     12cb4f7:	48 8b 11             	mov    rdx,QWORD PTR [rcx]
     12cb4fa:	48 89 93 a8 02 00 00 	mov    QWORD PTR [rbx+0x2a8],rdx
     12cb501:	48 8b 49 08          	mov    rcx,QWORD PTR [rcx+0x8]
     12cb505:	48 89 8b b0 02 00 00 	mov    QWORD PTR [rbx+0x2b0],rcx
     12cb50c:	48 85 c9             	test   rcx,rcx
     12cb50f:	74 05                	je     12cb516 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110a9a>
     12cb511:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     12cb516:	48 8b 8c 24 88 01 00 	mov    rcx,QWORD PTR [rsp+0x188]
     12cb51d:	00 
     12cb51e:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     12cb521:	48 89 93 b8 02 00 00 	mov    QWORD PTR [rbx+0x2b8],rdx
     12cb528:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     12cb52c:	48 89 83 c0 02 00 00 	mov    QWORD PTR [rbx+0x2c0],rax
     12cb533:	48 85 c0             	test   rax,rax
     12cb536:	74 05                	je     12cb53d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110ac1>
     12cb538:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     12cb53d:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
     12cb542:	0f 57 c0             	xorps  xmm0,xmm0
     12cb545:	0f 11 83 c8 02 00 00 	movups XMMWORD PTR [rbx+0x2c8],xmm0
     12cb54c:	48 89 8b d8 02 00 00 	mov    QWORD PTR [rbx+0x2d8],rcx
     12cb553:	48 8d bb e0 02 00 00 	lea    rdi,[rbx+0x2e0]
     12cb55a:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
     12cb55f:	e8 92 e4 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb564:	31 c0                	xor    eax,eax
     12cb566:	88 83 f0 02 00 00    	mov    BYTE PTR [rbx+0x2f0],al
     12cb56c:	88 83 00 03 00 00    	mov    BYTE PTR [rbx+0x300],al
     12cb572:	48 8d bb 08 03 00 00 	lea    rdi,[rbx+0x308]
     12cb579:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     12cb57e:	e8 73 e4 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb583:	48 8d bb 18 03 00 00 	lea    rdi,[rbx+0x318]
     12cb58a:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     12cb58f:	e8 62 e4 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb594:	48 8d bb 28 03 00 00 	lea    rdi,[rbx+0x328]
     12cb59b:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     12cb5a0:	e8 51 e4 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb5a5:	48 8d bb 38 03 00 00 	lea    rdi,[rbx+0x338]
     12cb5ac:	48 89 bc 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rdi
     12cb5b3:	00 
     12cb5b4:	e8 3d e4 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb5b9:	48 8d bb 48 03 00 00 	lea    rdi,[rbx+0x348]
     12cb5c0:	48 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rdi
     12cb5c7:	00 
     12cb5c8:	e8 29 e4 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb5cd:	48 8d bb 58 03 00 00 	lea    rdi,[rbx+0x358]
     12cb5d4:	48 89 bc 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rdi
     12cb5db:	00 
     12cb5dc:	e8 15 e4 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb5e1:	48 8d bb 68 03 00 00 	lea    rdi,[rbx+0x368]
     12cb5e8:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
     12cb5ef:	00 
     12cb5f0:	e8 01 e4 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb5f5:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
     12cb5fc:	48 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rdi
     12cb603:	00 
     12cb604:	e8 ed e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb609:	48 8d bb 88 03 00 00 	lea    rdi,[rbx+0x388]
     12cb610:	48 89 bc 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rdi
     12cb617:	00 
     12cb618:	e8 d9 e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb61d:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
     12cb624:	48 89 bc 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rdi
     12cb62b:	00 
     12cb62c:	e8 c5 e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb631:	48 8d bb a8 03 00 00 	lea    rdi,[rbx+0x3a8]
     12cb638:	48 89 bc 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rdi
     12cb63f:	00 
     12cb640:	e8 b1 e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb645:	48 8d bb b8 03 00 00 	lea    rdi,[rbx+0x3b8]
     12cb64c:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
     12cb653:	00 
     12cb654:	e8 9d e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb659:	48 8d bb c8 03 00 00 	lea    rdi,[rbx+0x3c8]
     12cb660:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
     12cb667:	00 
     12cb668:	e8 89 e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb66d:	48 8d bb d8 03 00 00 	lea    rdi,[rbx+0x3d8]
     12cb674:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
     12cb67b:	00 
     12cb67c:	e8 75 e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb681:	48 8d bb e8 03 00 00 	lea    rdi,[rbx+0x3e8]
     12cb688:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     12cb68f:	00 
     12cb690:	e8 61 e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb695:	48 8d bb f8 03 00 00 	lea    rdi,[rbx+0x3f8]
     12cb69c:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     12cb6a3:	00 
     12cb6a4:	e8 4d e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb6a9:	48 8d bb 08 04 00 00 	lea    rdi,[rbx+0x408]
     12cb6b0:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     12cb6b7:	00 
     12cb6b8:	e8 39 e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb6bd:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
     12cb6c4:	48 89 bc 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rdi
     12cb6cb:	00 
     12cb6cc:	e8 25 e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb6d1:	48 8d bb 28 04 00 00 	lea    rdi,[rbx+0x428]
     12cb6d8:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     12cb6df:	00 
     12cb6e0:	e8 11 e3 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb6e5:	0f 57 c0             	xorps  xmm0,xmm0
     12cb6e8:	0f 11 83 38 04 00 00 	movups XMMWORD PTR [rbx+0x438],xmm0
     12cb6ef:	48 83 a3 48 04 00 00 	and    QWORD PTR [rbx+0x448],0x0
     12cb6f6:	00 
     12cb6f7:	48 8d bb 50 04 00 00 	lea    rdi,[rbx+0x450]
     12cb6fe:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     12cb703:	e8 ee e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb708:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
     12cb70f:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     12cb714:	e8 dd e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb719:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     12cb720:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     12cb725:	e8 cc e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb72a:	48 8d bb 80 04 00 00 	lea    rdi,[rbx+0x480]
     12cb731:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
     12cb736:	e8 bb e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb73b:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
     12cb742:	00 
     12cb743:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
     12cb74a:	00 
     12cb74b:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
     12cb752:	00 
     12cb753:	48 83 a3 18 05 00 00 	and    QWORD PTR [rbx+0x518],0x0
     12cb75a:	00 
     12cb75b:	48 83 a3 28 05 00 00 	and    QWORD PTR [rbx+0x528],0x0
     12cb762:	00 
     12cb763:	0f 57 c0             	xorps  xmm0,xmm0
     12cb766:	0f 11 83 90 04 00 00 	movups XMMWORD PTR [rbx+0x490],xmm0
     12cb76d:	0f 11 83 a0 04 00 00 	movups XMMWORD PTR [rbx+0x4a0],xmm0
     12cb774:	0f 11 83 b0 04 00 00 	movups XMMWORD PTR [rbx+0x4b0],xmm0
     12cb77b:	0f 11 83 c0 04 00 00 	movups XMMWORD PTR [rbx+0x4c0],xmm0
     12cb782:	0f 11 83 d0 04 00 00 	movups XMMWORD PTR [rbx+0x4d0],xmm0
     12cb789:	4d 8b 74 24 78       	mov    r14,QWORD PTR [r12+0x78]
     12cb78e:	6a 10                	push   0x10
     12cb790:	5f                   	pop    rdi
     12cb791:	e8 6a 27 52 00       	call   17edf00 <_Znwm@plt>
     12cb796:	48 8b ac 24 a8 01 00 	mov    rbp,QWORD PTR [rsp+0x1a8]
     12cb79d:	00 
     12cb79e:	48 8d 0d 1b 76 59 00 	lea    rcx,[rip+0x59761b]        # 1862dc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f4a8>
     12cb7a5:	48 89 08             	mov    QWORD PTR [rax],rcx
     12cb7a8:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     12cb7ac:	48 89 83 38 05 00 00 	mov    QWORD PTR [rbx+0x538],rax
     12cb7b3:	0f 57 c0             	xorps  xmm0,xmm0
     12cb7b6:	0f 11 83 48 05 00 00 	movups XMMWORD PTR [rbx+0x548],xmm0
     12cb7bd:	0f 11 83 58 05 00 00 	movups XMMWORD PTR [rbx+0x558],xmm0
     12cb7c4:	83 a3 40 05 00 00 00 	and    DWORD PTR [rbx+0x540],0x0
     12cb7cb:	45 31 f6             	xor    r14d,r14d
     12cb7ce:	44 88 b3 44 05 00 00 	mov    BYTE PTR [rbx+0x544],r14b
     12cb7d5:	b8 00 00 80 3f       	mov    eax,0x3f800000
     12cb7da:	89 83 68 05 00 00    	mov    DWORD PTR [rbx+0x568],eax
     12cb7e0:	0f 11 83 70 05 00 00 	movups XMMWORD PTR [rbx+0x570],xmm0
     12cb7e7:	0f 11 83 80 05 00 00 	movups XMMWORD PTR [rbx+0x580],xmm0
     12cb7ee:	89 83 90 05 00 00    	mov    DWORD PTR [rbx+0x590],eax
     12cb7f4:	0f 11 83 98 05 00 00 	movups XMMWORD PTR [rbx+0x598],xmm0
     12cb7fb:	0f 11 83 a8 05 00 00 	movups XMMWORD PTR [rbx+0x5a8],xmm0
     12cb802:	89 83 b8 05 00 00    	mov    DWORD PTR [rbx+0x5b8],eax
     12cb808:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0
     12cb80f:	0f 11 83 d0 05 00 00 	movups XMMWORD PTR [rbx+0x5d0],xmm0
     12cb816:	89 83 e0 05 00 00    	mov    DWORD PTR [rbx+0x5e0],eax
     12cb81c:	66 83 a3 e8 05 00 00 	and    WORD PTR [rbx+0x5e8],0x0
     12cb823:	00 
     12cb824:	48 8d 8b 38 05 00 00 	lea    rcx,[rbx+0x538]
     12cb82b:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     12cb830:	0f 11 83 00 06 00 00 	movups XMMWORD PTR [rbx+0x600],xmm0
     12cb837:	0f 11 83 f0 05 00 00 	movups XMMWORD PTR [rbx+0x5f0],xmm0
     12cb83e:	89 83 10 06 00 00    	mov    DWORD PTR [rbx+0x610],eax
     12cb844:	44 88 b3 18 06 00 00 	mov    BYTE PTR [rbx+0x618],r14b
     12cb84b:	83 a3 1c 06 00 00 00 	and    DWORD PTR [rbx+0x61c],0x0
     12cb852:	48 8d 8b 48 05 00 00 	lea    rcx,[rbx+0x548]
     12cb859:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
     12cb85e:	66 83 a3 20 06 00 00 	and    WORD PTR [rbx+0x620],0x0
     12cb865:	00 
     12cb866:	48 8d 8b 70 05 00 00 	lea    rcx,[rbx+0x570]
     12cb86d:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     12cb872:	48 8d 8b f0 05 00 00 	lea    rcx,[rbx+0x5f0]
     12cb879:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
     12cb87e:	48 8d 8b 28 06 00 00 	lea    rcx,[rbx+0x628]
     12cb885:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
     12cb88a:	0f 11 83 38 06 00 00 	movups XMMWORD PTR [rbx+0x638],xmm0
     12cb891:	0f 11 83 28 06 00 00 	movups XMMWORD PTR [rbx+0x628],xmm0
     12cb898:	89 83 48 06 00 00    	mov    DWORD PTR [rbx+0x648],eax
     12cb89e:	4c 8d bb 50 06 00 00 	lea    r15,[rbx+0x650]
     12cb8a5:	49 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [r12+0xe8]
     12cb8ac:	00 
     12cb8ad:	4c 89 ff             	mov    rdi,r15
     12cb8b0:	e8 0d 5e 4f 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     12cb8b5:	44 88 b3 a8 06 00 00 	mov    BYTE PTR [rbx+0x6a8],r14b
     12cb8bc:	4c 8d ab b0 06 00 00 	lea    r13,[rbx+0x6b0]
     12cb8c3:	0f 57 c0             	xorps  xmm0,xmm0
     12cb8c6:	0f 11 83 60 06 00 00 	movups XMMWORD PTR [rbx+0x660],xmm0
     12cb8cd:	0f 11 83 70 06 00 00 	movups XMMWORD PTR [rbx+0x670],xmm0
     12cb8d4:	44 88 b3 80 06 00 00 	mov    BYTE PTR [rbx+0x680],r14b
     12cb8db:	49 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [r12+0xe8]
     12cb8e2:	00 
     12cb8e3:	4c 89 ef             	mov    rdi,r13
     12cb8e6:	e8 d7 5d 4f 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     12cb8eb:	0f 57 c0             	xorps  xmm0,xmm0
     12cb8ee:	0f 11 83 c0 06 00 00 	movups XMMWORD PTR [rbx+0x6c0],xmm0
     12cb8f5:	48 83 a3 d0 06 00 00 	and    QWORD PTR [rbx+0x6d0],0x0
     12cb8fc:	00 
     12cb8fd:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     12cb901:	48 89 83 c0 06 00 00 	mov    QWORD PTR [rbx+0x6c0],rax
     12cb908:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     12cb90c:	48 89 83 c8 06 00 00 	mov    QWORD PTR [rbx+0x6c8],rax
     12cb913:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
     12cb917:	48 89 83 d0 06 00 00 	mov    QWORD PTR [rbx+0x6d0],rax
     12cb91e:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
     12cb923:	4c 8d b3 c0 06 00 00 	lea    r14,[rbx+0x6c0]
     12cb92a:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
     12cb92e:	0f 11 83 d8 06 00 00 	movups XMMWORD PTR [rbx+0x6d8],xmm0
     12cb935:	48 8d bb e8 06 00 00 	lea    rdi,[rbx+0x6e8]
     12cb93c:	e8 e9 9d 89 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     12cb941:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12cb948:	00 00 
     12cb94a:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     12cb951:	00 
     12cb952:	0f 85 17 03 00 00    	jne    12cbc6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1111f3>
     12cb958:	48 81 c4 28 01 00 00 	add    rsp,0x128
     12cb95f:	5b                   	pop    rbx
     12cb960:	41 5c                	pop    r12
     12cb962:	41 5d                	pop    r13
     12cb964:	41 5e                	pop    r14
     12cb966:	41 5f                	pop    r15
     12cb968:	5d                   	pop    rbp
     12cb969:	c3                   	ret
     12cb96a:	48 89 c5             	mov    rbp,rax
     12cb96d:	4c 8d a3 80 06 00 00 	lea    r12,[rbx+0x680]
     12cb974:	48 8b bb e0 06 00 00 	mov    rdi,QWORD PTR [rbx+0x6e0]
     12cb97b:	e8 06 2b 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cb980:	4c 89 f7             	mov    rdi,r14
     12cb983:	e8 60 fc 7a ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     12cb988:	4c 89 ef             	mov    rdi,r13
     12cb98b:	e8 b6 5d 4f 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     12cb990:	4c 89 e7             	mov    rdi,r12
     12cb993:	e8 86 06 00 00       	call   12cc01e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1115a2>
     12cb998:	48 8b bb 78 06 00 00 	mov    rdi,QWORD PTR [rbx+0x678]
     12cb99f:	e8 e2 2a 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cb9a4:	48 8b bb 68 06 00 00 	mov    rdi,QWORD PTR [rbx+0x668]
     12cb9ab:	e8 d6 2a 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cb9b0:	4c 89 ff             	mov    rdi,r15
     12cb9b3:	e8 8e 5d 4f 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     12cb9b8:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     12cb9bd:	e8 66 34 db ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
     12cb9c2:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     12cb9c7:	e8 4c 74 94 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
     12cb9cc:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     12cb9d1:	e8 54 06 00 00       	call   12cc02a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1115ae>
     12cb9d6:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     12cb9db:	e8 aa a3 dc ff       	call   1095d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25d1a0>
     12cb9e0:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12cb9e5:	e8 3e e4 7a ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     12cb9ea:	eb 03                	jmp    12cb9ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110f73>
     12cb9ec:	48 89 c5             	mov    rbp,rax
     12cb9ef:	48 8d 83 f0 02 00 00 	lea    rax,[rbx+0x2f0]
     12cb9f6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     12cb9fb:	4c 8d bb 38 04 00 00 	lea    r15,[rbx+0x438]
     12cba02:	4c 8d b3 90 04 00 00 	lea    r14,[rbx+0x490]
     12cba09:	4c 8d a3 d8 04 00 00 	lea    r12,[rbx+0x4d8]
     12cba10:	4c 8d ab f8 04 00 00 	lea    r13,[rbx+0x4f8]
     12cba17:	48 8d bb 18 05 00 00 	lea    rdi,[rbx+0x518]
     12cba1e:	e8 27 06 00 00       	call   12cc04a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1115ce>
     12cba23:	4c 89 ef             	mov    rdi,r13
     12cba26:	e8 45 06 00 00       	call   12cc070 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1115f4>
     12cba2b:	4c 89 e7             	mov    rdi,r12
     12cba2e:	e8 63 06 00 00       	call   12cc096 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11161a>
     12cba33:	4c 89 f7             	mov    rdi,r14
     12cba36:	e8 31 45 95 ff       	call   c1ff6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16cf0c>
     12cba3b:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     12cba40:	e8 8f e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cba45:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     12cba4a:	e8 85 e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cba4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     12cba54:	e8 7b e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cba59:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     12cba5e:	e8 71 e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cba63:	4c 89 ff             	mov    rdi,r15
     12cba66:	e8 f3 f3 dc ff       	call   109ae5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262274>
     12cba6b:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     12cba72:	00 
     12cba73:	e8 5c e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cba78:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     12cba7f:	00 
     12cba80:	e8 4f e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cba85:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     12cba8c:	00 
     12cba8d:	e8 42 e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cba92:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     12cba99:	00 
     12cba9a:	e8 35 e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cba9f:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     12cbaa6:	00 
     12cbaa7:	e8 28 e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbaac:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     12cbab3:	00 
     12cbab4:	e8 1b e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbab9:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
     12cbac0:	00 
     12cbac1:	e8 0e e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbac6:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     12cbacd:	00 
     12cbace:	e8 01 e1 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbad3:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     12cbada:	00 
     12cbadb:	e8 f4 e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbae0:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     12cbae7:	00 
     12cbae8:	e8 e7 e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbaed:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     12cbaf4:	00 
     12cbaf5:	e8 da e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbafa:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     12cbb01:	00 
     12cbb02:	e8 cd e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbb07:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     12cbb0e:	00 
     12cbb0f:	e8 c0 e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbb14:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     12cbb1b:	00 
     12cbb1c:	e8 b3 e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbb21:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
     12cbb28:	00 
     12cbb29:	e8 a6 e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbb2e:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     12cbb35:	00 
     12cbb36:	e8 99 e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbb3b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     12cbb40:	e8 8f e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbb45:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12cbb4a:	e8 85 e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbb4f:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     12cbb54:	e8 7b e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbb59:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12cbb5e:	e8 fb f9 8a ff       	call   b7b55e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc84fe>
     12cbb63:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     12cbb68:	e8 67 e0 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cbb6d:	48 8b bb d0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2d0]
     12cbb74:	e8 0d 29 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbb79:	48 8b bb c0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2c0]
     12cbb80:	e8 01 29 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbb85:	48 8b bb b0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2b0]
     12cbb8c:	e8 f5 28 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbb91:	48 8b bb a0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2a0]
     12cbb98:	e8 e9 28 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbb9d:	48 8b bb 90 02 00 00 	mov    rdi,QWORD PTR [rbx+0x290]
     12cbba4:	e8 dd 28 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbba9:	48 8b bb 80 02 00 00 	mov    rdi,QWORD PTR [rbx+0x280]
     12cbbb0:	e8 d1 28 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbbb5:	48 8b bb 70 02 00 00 	mov    rdi,QWORD PTR [rbx+0x270]
     12cbbbc:	e8 c5 28 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbbc1:	48 8b bb 60 02 00 00 	mov    rdi,QWORD PTR [rbx+0x260]
     12cbbc8:	e8 b9 28 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbbcd:	48 8b bb 50 02 00 00 	mov    rdi,QWORD PTR [rbx+0x250]
     12cbbd4:	e8 ad 28 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbbd9:	48 8b bb 40 02 00 00 	mov    rdi,QWORD PTR [rbx+0x240]
     12cbbe0:	e8 a1 28 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbbe5:	48 8b bb 30 02 00 00 	mov    rdi,QWORD PTR [rbx+0x230]
     12cbbec:	e8 95 28 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cbbf1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12cbbf6:	e8 f1 e2 07 00       	call   1349eec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f470>
     12cbbfb:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     12cbc00:	eb 41                	jmp    12cbc43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1111c7>
     12cbc02:	48 89 c5             	mov    rbp,rax
     12cbc05:	eb 41                	jmp    12cbc48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1111cc>
     12cbc07:	48 89 c5             	mov    rbp,rax
     12cbc0a:	4c 89 f7             	mov    rdi,r14
     12cbc0d:	e8 fe 6f 3f 00       	call   16c2c10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76d7c>
     12cbc12:	eb 03                	jmp    12cbc17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11119b>
     12cbc14:	48 89 c5             	mov    rbp,rax
     12cbc17:	4c 89 ef             	mov    rdi,r13
     12cbc1a:	e8 05 7a 3f 00       	call   16c3624 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77790>
     12cbc1f:	eb 03                	jmp    12cbc24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1111a8>
     12cbc21:	48 89 c5             	mov    rbp,rax
     12cbc24:	4c 89 e7             	mov    rdi,r12
     12cbc27:	e8 f6 7b 3f 00       	call   16c3822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7798e>
     12cbc2c:	eb 03                	jmp    12cbc31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1111b5>
     12cbc2e:	48 89 c5             	mov    rbp,rax
     12cbc31:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12cbc36:	e8 69 75 3f 00       	call   16c31a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77310>
     12cbc3b:	eb 17                	jmp    12cbc54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1111d8>
     12cbc3d:	48 89 c5             	mov    rbp,rax
     12cbc40:	4c 89 ef             	mov    rdi,r13
     12cbc43:	e8 da 7b 3f 00       	call   16c3822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7798e>
     12cbc48:	48 83 c3 20          	add    rbx,0x20
     12cbc4c:	48 89 df             	mov    rdi,rbx
     12cbc4f:	e8 88 ef fc ff       	call   129abdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0160>
     12cbc54:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12cbc5b:	00 00 
     12cbc5d:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     12cbc64:	00 
     12cbc65:	75 08                	jne    12cbc6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1111f3>
     12cbc67:	48 89 ef             	mov    rdi,rbp
     12cbc6a:	e8 61 40 7a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     12cbc6f:	e8 3c 3e 52 00       	call   17efab0 <__stack_chk_fail@plt>

### touches=2/4 stores=4 FDE=0xee55c2..0xee6102 base=rdi
- service 47 +0x178:
      ee5979:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
      ee598f:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- service 81 +0x288:
      ee5c57:	48 83 a7 88 02 00 00 	and    QWORD PTR [rdi+0x288],0x0
      ee5c89:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax

### touches=2/4 stores=4 FDE=0x1421d56..0x1422627 base=rdi
- service 47 +0x178:
     14220f2:	48 83 a7 78 01 00 00 	and    QWORD PTR [rdi+0x178],0x0
     142211d:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- service 81 +0x288:
     142244b:	0f 11 87 88 02 00 00 	movups XMMWORD PTR [rdi+0x288],xmm0
     1422461:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax

### touches=2/4 stores=3 FDE=0xcec92c..0xced213 base=rdi
- service 47 +0x178:
      ceccfb:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- service 81 +0x288:
      cecfef:	48 83 a7 88 02 00 00 	and    QWORD PTR [rdi+0x288],0x0
      ced021:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax

### touches=2/4 stores=3 FDE=0x107a02c..0x107e484 base=r15
- service 47 +0x178:
     107bbe0:	49 83 a7 78 01 00 00 	and    QWORD PTR [r15+0x178],0x0
     107c6b7:	45 89 a7 78 01 00 00 	mov    DWORD PTR [r15+0x178],r12d
- service 81 +0x288:
     107bd08:	f3 41 0f 7f 87 88 02 	movdqu XMMWORD PTR [r15+0x288],xmm0

### touches=2/4 stores=3 FDE=0x1089d9e..0x1089f9e base=rbx
- service 178 +0x590:
     1089e0d:	48 83 a3 90 05 00 00 	and    QWORD PTR [rbx+0x590],0x0
     1089e3f:	48 89 83 90 05 00 00 	mov    QWORD PTR [rbx+0x590],rax
- service 184 +0x5c0:
     1089ea6:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax

### touches=2/4 stores=2 FDE=0xbd9b4a..0xbdc4b7 base=r14
- service 47 +0x178:
      bdb6c3:	49 89 86 78 01 00 00 	mov    QWORD PTR [r14+0x178],rax
- service 81 +0x288:
      bd9e8d:	41 c7 86 88 02 00 00 	mov    DWORD PTR [r14+0x288],0x11

### touches=2/4 stores=2 FDE=0xe67eee..0xe6853a base=r12
- service 47 +0x178:
      e68033:	41 0f 11 84 24 78 01 	movups XMMWORD PTR [r12+0x178],xmm0
- service 81 +0x288:
      e681b3:	f3 41 0f 7f 84 24 88 	movdqu XMMWORD PTR [r12+0x288],xmm0

### touches=2/4 stores=2 FDE=0xee55c2..0xee6102 base=rsi
- service 47 +0x178:
      ee59ba:	0f 11 86 78 01 00 00 	movups XMMWORD PTR [rsi+0x178],xmm0
- service 81 +0x288:
      ee5c97:	48 83 a6 88 02 00 00 	and    QWORD PTR [rsi+0x288],0x0

### touches=2/4 stores=2 FDE=0x10668f2..0x10669da base=rbx
- service 178 +0x590:
     106694a:	48 83 a3 90 05 00 00 	and    QWORD PTR [rbx+0x590],0x0
- service 184 +0x5c0:
     1066952:	48 83 a3 c0 05 00 00 	and    QWORD PTR [rbx+0x5c0],0x0

### touches=2/4 stores=2 FDE=0x1089d9e..0x1089f9e base=r14
- service 178 +0x590:
     1089e4e:	49 83 a6 90 05 00 00 	and    QWORD PTR [r14+0x590],0x0
- service 184 +0x5c0:
     1089ebc:	49 83 a6 c0 05 00 00 	and    QWORD PTR [r14+0x5c0],0x0

### touches=2/4 stores=2 FDE=0x10d0e58..0x10d4cf6 base=rbp
- service 47 +0x178:
     10d2230:	4c 89 ad 78 01 00 00 	mov    QWORD PTR [rbp+0x178],r13
- service 81 +0x288:
     10d240c:	88 85 88 02 00 00    	mov    BYTE PTR [rbp+0x288],al

### touches=2/4 stores=2 FDE=0x1144dce..0x1145447 base=rax
- service 47 +0x178:
     1144e60:	88 88 78 01 00 00    	mov    BYTE PTR [rax+0x178],cl
- service 81 +0x288:
     1144ece:	88 88 88 02 00 00    	mov    BYTE PTR [rax+0x288],cl

### touches=2/4 stores=2 FDE=0x11ce3e2..0x11ce7f1 base=rbx
- service 47 +0x178:
     11ce47e:	89 93 78 01 00 00    	mov    DWORD PTR [rbx+0x178],edx
- service 81 +0x288:
     11ce570:	89 93 88 02 00 00    	mov    DWORD PTR [rbx+0x288],edx

### touches=2/4 stores=2 FDE=0x1332e00..0x1334bda base=rbx
- service 81 +0x288:
     1333345:	f3 0f 7f 83 88 02 00 	movdqu XMMWORD PTR [rbx+0x288],xmm0
- service 184 +0x5c0:
     1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax

### touches=2/4 stores=2 FDE=0x1391aee..0x1392698 base=rbx
- service 47 +0x178:
     1392000:	48 89 8b 78 01 00 00 	mov    QWORD PTR [rbx+0x178],rcx
- service 81 +0x288:
     139221c:	0f 11 8b 88 02 00 00 	movups XMMWORD PTR [rbx+0x288],xmm1

### touches=2/4 stores=2 FDE=0x13ab8aa..0x13ac1ed base=rbx
- service 47 +0x178:
     13abc58:	c6 83 78 01 00 00 01 	mov    BYTE PTR [rbx+0x178],0x1
- service 81 +0x288:
     13abd38:	48 c7 83 88 02 00 00 	mov    QWORD PTR [rbx+0x288],0xc8

### touches=2/4 stores=2 FDE=0x13ac372..0x13adc94 base=rbx
- service 47 +0x178:
     13aca5c:	0f 11 83 78 01 00 00 	movups XMMWORD PTR [rbx+0x178],xmm0
- service 81 +0x288:
     13acb62:	48 83 a3 88 02 00 00 	and    QWORD PTR [rbx+0x288],0x0

### touches=2/4 stores=2 FDE=0x1421d56..0x1422627 base=rsi
- service 47 +0x178:
     1422124:	48 83 a6 78 01 00 00 	and    QWORD PTR [rsi+0x178],0x0
- service 81 +0x288:
     142248c:	0f 11 86 88 02 00 00 	movups XMMWORD PTR [rsi+0x288],xmm0

### touches=2/4 stores=2 FDE=0x14a487c..0x14a4c7b base=rbx
- service 47 +0x178:
     14a4ab8:	48 89 83 78 01 00 00 	mov    QWORD PTR [rbx+0x178],rax
- service 81 +0x288:
     14a4c0e:	48 89 83 88 02 00 00 	mov    QWORD PTR [rbx+0x288],rax

### touches=2/4 stores=2 FDE=0x1511570..0x15117dd base=rdi
- service 47 +0x178:
     1511638:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
- service 81 +0x288:
     15116ee:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax

### touches=2/4 stores=2 FDE=0x1653d8c..0x1653f8d base=rdi
- service 47 +0x178:
     1653e89:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- service 81 +0x288:
     1653f70:	0f 11 87 88 02 00 00 	movups XMMWORD PTR [rdi+0x288],xmm0

### touches=2/4 stores=2 FDE=0x1654a42..0x1654c43 base=rdi
- service 47 +0x178:
     1654b3f:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- service 81 +0x288:
     1654c26:	0f 11 87 88 02 00 00 	movups XMMWORD PTR [rdi+0x288],xmm0

### touches=2/4 stores=2 FDE=0x16b21f0..0x16b245d base=rdi
- service 47 +0x178:
     16b22b8:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
- service 81 +0x288:
     16b2383:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax

### touches=2/4 stores=2 FDE=0x16b7702..0x16b796f base=rdi
- service 47 +0x178:
     16b77ca:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
- service 81 +0x288:
     16b7895:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax

## All concrete stores to service184 offset +0x5c0
### 0xd6ba55 FDE=0xd6aa99..0xd6f087 base=r15
      d6b9fd:	66 0f ef c0          	pxor   xmm0,xmm0
      d6ba01:	66 41 0f 7f 87 f0 04 	movdqa XMMWORD PTR [r15+0x4f0],xmm0
      d6ba08:	00 00 
      d6ba0a:	66 41 0f 7f 87 e0 04 	movdqa XMMWORD PTR [r15+0x4e0],xmm0
      d6ba11:	00 00 
      d6ba13:	41 89 9f 00 05 00 00 	mov    DWORD PTR [r15+0x500],ebx
      d6ba1a:	f3 41 0f 7f 87 08 05 	movdqu XMMWORD PTR [r15+0x508],xmm0
      d6ba21:	00 00 
      d6ba23:	f3 41 0f 7f 87 18 05 	movdqu XMMWORD PTR [r15+0x518],xmm0
      d6ba2a:	00 00 
      d6ba2c:	41 89 9f 28 05 00 00 	mov    DWORD PTR [r15+0x528],ebx
      d6ba33:	66 41 0f 7f 87 30 05 	movdqa XMMWORD PTR [r15+0x530],xmm0
      d6ba3a:	00 00 
      d6ba3c:	66 41 0f 7f 87 40 05 	movdqa XMMWORD PTR [r15+0x540],xmm0
      d6ba43:	00 00 
      d6ba45:	41 89 9f 50 05 00 00 	mov    DWORD PTR [r15+0x550],ebx
      d6ba4c:	31 c0                	xor    eax,eax
      d6ba4e:	41 88 87 58 05 00 00 	mov    BYTE PTR [r15+0x558],al
      d6ba55:	41 88 87 c0 05 00 00 	mov    BYTE PTR [r15+0x5c0],al
      d6ba5c:	41 83 a7 d8 05 00 00 	and    DWORD PTR [r15+0x5d8],0x0
      d6ba63:	00 
      d6ba64:	f3 41 0f 7f 87 c8 05 	movdqu XMMWORD PTR [r15+0x5c8],xmm0
      d6ba6b:	00 00 
      d6ba6d:	41 83 a7 28 06 00 00 	and    DWORD PTR [r15+0x628],0x0
      d6ba74:	00 
      d6ba75:	f3 41 0f 7f 87 48 06 	movdqu XMMWORD PTR [r15+0x648],xmm0
      d6ba7c:	00 00 
      d6ba7e:	f3 41 0f 7f 87 58 06 	movdqu XMMWORD PTR [r15+0x658],xmm0
      d6ba85:	00 00 
      d6ba87:	f3 41 0f 7f 87 68 06 	movdqu XMMWORD PTR [r15+0x668],xmm0
      d6ba8e:	00 00 
      d6ba90:	49 83 a7 98 06 00 00 	and    QWORD PTR [r15+0x698],0x0
      d6ba97:	00 
      d6ba98:	f3 41 0f 7f 87 78 06 	movdqu XMMWORD PTR [r15+0x678],xmm0
      d6ba9f:	00 00 
      d6baa1:	f3 41 0f 7f 87 88 06 	movdqu XMMWORD PTR [r15+0x688],xmm0
      d6baa8:	00 00 
      d6baaa:	66 41 0f 7f 87 10 06 	movdqa XMMWORD PTR [r15+0x610],xmm0
      d6bab1:	00 00 
      d6bab3:	66 41 0f 7f 87 00 06 	movdqa XMMWORD PTR [r15+0x600],xmm0
      d6baba:	00 00 
      d6babc:	66 41 0f 7f 87 f0 05 	movdqa XMMWORD PTR [r15+0x5f0],xmm0
      d6bac3:	00 00 
      d6bac5:	66 41 0f 7f 87 e0 05 	movdqa XMMWORD PTR [r15+0x5e0],xmm0
      d6bacc:	00 00 
      d6bace:	41 89 9f a0 06 00 00 	mov    DWORD PTR [r15+0x6a0],ebx

### 0xd784ab FDE=0xd7830a..0xd78532 base=rbx
      d78467:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d7846a:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      d7846f:	89 46 58             	mov    DWORD PTR [rsi+0x58],eax
      d78472:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d78475:	48 89 df             	mov    rdi,rbx
      d78478:	ff 90 c8 02 00 00    	call   QWORD PTR [rax+0x2c8]
      d7847e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d78483:	e8 a6 ce 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d78488:	eb 4c                	jmp    d784d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4555c>
      d7848a:	48 89 df             	mov    rdi,rbx
      d7848d:	e8 40 ee ff ff       	call   d772d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44358>
      d78492:	48 85 c0             	test   rax,rax
      d78495:	74 3f                	je     d784d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4555c>
      d78497:	49 89 c6             	mov    r14,rax
      d7849a:	80 bb c0 05 00 00 00 	cmp    BYTE PTR [rbx+0x5c0],0x0
      d784a1:	74 0f                	je     d784b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45538>
      d784a3:	4c 89 ff             	mov    rdi,r15
      d784a6:	e8 83 ce 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d784ab:	c6 83 c0 05 00 00 00 	mov    BYTE PTR [rbx+0x5c0],0x0
      d784b2:	48 8d 05 5f 97 6d ff 	lea    rax,[rip+0xffffffffff6d975f]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      d784b9:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      d784be:	48 89 06             	mov    QWORD PTR [rsi],rax
      d784c1:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d784c5:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      d784ca:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d784cd:	4c 89 f7             	mov    rdi,r14
      d784d0:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
      d784d6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d784dd:	00 00 
      d784df:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
      d784e4:	75 47                	jne    d7852d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x455b3>
      d784e6:	48 83 c4 78          	add    rsp,0x78
      d784ea:	5b                   	pop    rbx
      d784eb:	41 5c                	pop    r12
      d784ed:	41 5d                	pop    r13
      d784ef:	41 5e                	pop    r14
      d784f1:	41 5f                	pop    r15
      d784f3:	5d                   	pop    rbp
      d784f4:	c3                   	ret
      d784f5:	eb 02                	jmp    d784f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4557f>
      d784f7:	eb 00                	jmp    d784f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4557f>
      d784f9:	48 89 c3             	mov    rbx,rax
      d784fc:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d78501:	e8 28 ce 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d78506:	eb 0d                	jmp    d78515 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4559b>
      d78508:	48 89 c3             	mov    rbx,rax

### 0x1066952 FDE=0x10668f2..0x10669da base=rbx
     1066907:	49 89 fe             	mov    r14,rdi
     106690a:	bf e0 05 00 00       	mov    edi,0x5e0
     106690f:	e8 ec 75 78 00       	call   17edf00 <_Znwm@plt>
     1066914:	48 89 c3             	mov    rbx,rax
     1066917:	0f 57 c0             	xorps  xmm0,xmm0
     106691a:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     106691e:	48 8d 05 a3 44 7a 00 	lea    rax,[rip+0x7a44a3]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     1066925:	48 89 03             	mov    QWORD PTR [rbx],rax
     1066928:	4c 8d 6b 20          	lea    r13,[rbx+0x20]
     106692c:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
     1066930:	48 8d 05 91 1b 7e 00 	lea    rax,[rip+0x7e1b91]        # 18484c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4bb0>
     1066937:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     106693b:	31 ed                	xor    ebp,ebp
     106693d:	40 88 6b 38          	mov    BYTE PTR [rbx+0x38],bpl
     1066941:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     1066945:	e8 2a 26 ff ff       	call   1058f74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22038a>
     106694a:	48 83 a3 90 05 00 00 	and    QWORD PTR [rbx+0x590],0x0
     1066951:	00 
     1066952:	48 83 a3 c0 05 00 00 	and    QWORD PTR [rbx+0x5c0],0x0
     1066959:	00 
     106695a:	40 88 ab d0 05 00 00 	mov    BYTE PTR [rbx+0x5d0],bpl
     1066961:	44 89 a3 d4 05 00 00 	mov    DWORD PTR [rbx+0x5d4],r12d
     1066968:	40 88 ab d8 05 00 00 	mov    BYTE PTR [rbx+0x5d8],bpl
     106696f:	44 88 bb 60 05 00 00 	mov    BYTE PTR [rbx+0x560],r15b
     1066976:	44 88 7b 68          	mov    BYTE PTR [rbx+0x68],r15b
     106697a:	8b 44 24 04          	mov    eax,DWORD PTR [rsp+0x4]
     106697e:	88 83 61 05 00 00    	mov    BYTE PTR [rbx+0x561],al
     1066984:	4d 89 2e             	mov    QWORD PTR [r14],r13
     1066987:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     106698b:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     106698f:	48 85 ff             	test   rdi,rdi
     1066992:	74 19                	je     10669ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ddc3>
     1066994:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     1066998:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     106699c:	74 0f                	je     10669ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ddc3>
     106699e:	48 83 c4 08          	add    rsp,0x8
     10669a2:	5b                   	pop    rbx
     10669a3:	41 5c                	pop    r12
     10669a5:	41 5d                	pop    r13
     10669a7:	41 5e                	pop    r14
     10669a9:	41 5f                	pop    r15
     10669ab:	5d                   	pop    rbp
     10669ac:	c3                   	ret
     10669ad:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     10669b2:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     10669b7:	4c 89 6b 28          	mov    QWORD PTR [rbx+0x28],r13

### 0x1089ea6 FDE=0x1089d9e..0x1089f9e base=rbx
     1089e46:	41 0f 11 8e 80 05 00 	movups XMMWORD PTR [r14+0x580],xmm1
     1089e4d:	00 
     1089e4e:	49 83 a6 90 05 00 00 	and    QWORD PTR [r14+0x590],0x0
     1089e55:	00 
     1089e56:	0f 11 8b 98 05 00 00 	movups XMMWORD PTR [rbx+0x598],xmm1
     1089e5d:	48 83 a3 a8 05 00 00 	and    QWORD PTR [rbx+0x5a8],0x0
     1089e64:	00 
     1089e65:	49 8b 86 98 05 00 00 	mov    rax,QWORD PTR [r14+0x598]
     1089e6c:	48 89 83 98 05 00 00 	mov    QWORD PTR [rbx+0x598],rax
     1089e73:	49 8b 86 a0 05 00 00 	mov    rax,QWORD PTR [r14+0x5a0]
     1089e7a:	48 89 83 a0 05 00 00 	mov    QWORD PTR [rbx+0x5a0],rax
     1089e81:	49 8b 86 a8 05 00 00 	mov    rax,QWORD PTR [r14+0x5a8]
     1089e88:	48 89 83 a8 05 00 00 	mov    QWORD PTR [rbx+0x5a8],rax
     1089e8f:	49 83 a6 a8 05 00 00 	and    QWORD PTR [r14+0x5a8],0x0
     1089e96:	00 
     1089e97:	41 0f 11 8e 98 05 00 	movups XMMWORD PTR [r14+0x598],xmm1
     1089e9e:	00 
     1089e9f:	49 8b 86 c0 05 00 00 	mov    rax,QWORD PTR [r14+0x5c0]
     1089ea6:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     1089ead:	41 0f 10 86 b0 05 00 	movups xmm0,XMMWORD PTR [r14+0x5b0]
     1089eb4:	00 
     1089eb5:	0f 11 83 b0 05 00 00 	movups XMMWORD PTR [rbx+0x5b0],xmm0
     1089ebc:	49 83 a6 c0 05 00 00 	and    QWORD PTR [r14+0x5c0],0x0
     1089ec3:	00 
     1089ec4:	41 0f 11 8e b0 05 00 	movups XMMWORD PTR [r14+0x5b0],xmm1
     1089ecb:	00 
     1089ecc:	be c8 05 00 00       	mov    esi,0x5c8
     1089ed1:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1089ed5:	4c 01 f6             	add    rsi,r14
     1089ed8:	e8 a1 3d 00 00       	call   108dc7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255094>
     1089edd:	49 8b 86 f8 05 00 00 	mov    rax,QWORD PTR [r14+0x5f8]
     1089ee4:	48 89 83 f8 05 00 00 	mov    QWORD PTR [rbx+0x5f8],rax
     1089eeb:	b8 00 06 00 00       	mov    eax,0x600
     1089ef0:	48 8d 0c 03          	lea    rcx,[rbx+rax*1]
     1089ef4:	49 8b 96 00 06 00 00 	mov    rdx,QWORD PTR [r14+0x600]
     1089efb:	48 89 93 00 06 00 00 	mov    QWORD PTR [rbx+0x600],rdx
     1089f02:	49 8b b6 08 06 00 00 	mov    rsi,QWORD PTR [r14+0x608]
     1089f09:	48 89 b3 08 06 00 00 	mov    QWORD PTR [rbx+0x608],rsi
     1089f10:	48 85 f6             	test   rsi,rsi
     1089f13:	74 16                	je     1089f2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251341>
     1089f15:	4c 01 f0             	add    rax,r14
     1089f18:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
     1089f1c:	49 89 86 f8 05 00 00 	mov    QWORD PTR [r14+0x5f8],rax
     1089f23:	0f 57 c0             	xorps  xmm0,xmm0
     1089f26:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1089f29:	eb 07                	jmp    1089f32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251348>

### 0x1089ebc FDE=0x1089d9e..0x1089f9e base=r14
     1089e56:	0f 11 8b 98 05 00 00 	movups XMMWORD PTR [rbx+0x598],xmm1
     1089e5d:	48 83 a3 a8 05 00 00 	and    QWORD PTR [rbx+0x5a8],0x0
     1089e64:	00 
     1089e65:	49 8b 86 98 05 00 00 	mov    rax,QWORD PTR [r14+0x598]
     1089e6c:	48 89 83 98 05 00 00 	mov    QWORD PTR [rbx+0x598],rax
     1089e73:	49 8b 86 a0 05 00 00 	mov    rax,QWORD PTR [r14+0x5a0]
     1089e7a:	48 89 83 a0 05 00 00 	mov    QWORD PTR [rbx+0x5a0],rax
     1089e81:	49 8b 86 a8 05 00 00 	mov    rax,QWORD PTR [r14+0x5a8]
     1089e88:	48 89 83 a8 05 00 00 	mov    QWORD PTR [rbx+0x5a8],rax
     1089e8f:	49 83 a6 a8 05 00 00 	and    QWORD PTR [r14+0x5a8],0x0
     1089e96:	00 
     1089e97:	41 0f 11 8e 98 05 00 	movups XMMWORD PTR [r14+0x598],xmm1
     1089e9e:	00 
     1089e9f:	49 8b 86 c0 05 00 00 	mov    rax,QWORD PTR [r14+0x5c0]
     1089ea6:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     1089ead:	41 0f 10 86 b0 05 00 	movups xmm0,XMMWORD PTR [r14+0x5b0]
     1089eb4:	00 
     1089eb5:	0f 11 83 b0 05 00 00 	movups XMMWORD PTR [rbx+0x5b0],xmm0
     1089ebc:	49 83 a6 c0 05 00 00 	and    QWORD PTR [r14+0x5c0],0x0
     1089ec3:	00 
     1089ec4:	41 0f 11 8e b0 05 00 	movups XMMWORD PTR [r14+0x5b0],xmm1
     1089ecb:	00 
     1089ecc:	be c8 05 00 00       	mov    esi,0x5c8
     1089ed1:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1089ed5:	4c 01 f6             	add    rsi,r14
     1089ed8:	e8 a1 3d 00 00       	call   108dc7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255094>
     1089edd:	49 8b 86 f8 05 00 00 	mov    rax,QWORD PTR [r14+0x5f8]
     1089ee4:	48 89 83 f8 05 00 00 	mov    QWORD PTR [rbx+0x5f8],rax
     1089eeb:	b8 00 06 00 00       	mov    eax,0x600
     1089ef0:	48 8d 0c 03          	lea    rcx,[rbx+rax*1]
     1089ef4:	49 8b 96 00 06 00 00 	mov    rdx,QWORD PTR [r14+0x600]
     1089efb:	48 89 93 00 06 00 00 	mov    QWORD PTR [rbx+0x600],rdx
     1089f02:	49 8b b6 08 06 00 00 	mov    rsi,QWORD PTR [r14+0x608]
     1089f09:	48 89 b3 08 06 00 00 	mov    QWORD PTR [rbx+0x608],rsi
     1089f10:	48 85 f6             	test   rsi,rsi
     1089f13:	74 16                	je     1089f2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251341>
     1089f15:	4c 01 f0             	add    rax,r14
     1089f18:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
     1089f1c:	49 89 86 f8 05 00 00 	mov    QWORD PTR [r14+0x5f8],rax
     1089f23:	0f 57 c0             	xorps  xmm0,xmm0
     1089f26:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1089f29:	eb 07                	jmp    1089f32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251348>
     1089f2b:	48 89 8b f8 05 00 00 	mov    QWORD PTR [rbx+0x5f8],rcx
     1089f32:	49 8b 86 10 06 00 00 	mov    rax,QWORD PTR [r14+0x610]
     1089f39:	48 89 83 10 06 00 00 	mov    QWORD PTR [rbx+0x610],rax
     1089f40:	b8 18 06 00 00       	mov    eax,0x618

### 0x11a365a FDE=0x11a318c..0x11a382e base=rbx
     11a3609:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
     11a360f:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     11a3614:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     11a3619:	48 85 c0             	test   rax,rax
     11a361c:	74 05                	je     11a3623 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36aa39>
     11a361e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     11a3623:	48 8b bb b8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5b8]
     11a362a:	0f 29 83 b0 05 00 00 	movaps XMMWORD PTR [rbx+0x5b0],xmm0
     11a3631:	e8 50 ae 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11a3636:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     11a363a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11a363d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a3642:	6a 05                	push   0x5
     11a3644:	5a                   	pop    rdx
     11a3645:	ff 50 40             	call   QWORD PTR [rax+0x40]
     11a3648:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11a364d:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     11a3653:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     11a365a:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     11a3661:	48 85 ff             	test   rdi,rdi
     11a3664:	74 1c                	je     11a3682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36aa98>
     11a3666:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a3669:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11a366c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     11a3671:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     11a3677:	48 85 ff             	test   rdi,rdi
     11a367a:	74 06                	je     11a3682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36aa98>
     11a367c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a367f:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11a3682:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     11a3689:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a368c:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11a368f:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
     11a3696:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a3699:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11a369c:	48 89 83 30 06 00 00 	mov    QWORD PTR [rbx+0x630],rax
     11a36a3:	48 8b b3 e8 04 00 00 	mov    rsi,QWORD PTR [rbx+0x4e8]
     11a36aa:	48 8b 83 f8 04 00 00 	mov    rax,QWORD PTR [rbx+0x4f8]
     11a36b1:	48 29 f0             	sub    rax,rsi
     11a36b4:	48 99                	cqo
     11a36b6:	49 f7 fd             	idiv   r13
     11a36b9:	4c 39 e0             	cmp    rax,r12
     11a36bc:	73 51                	jae    11a370f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab25>
     11a36be:	48 b8 8f e3 38 8e e3 	movabs rax,0x38e38e38e38e38f
     11a36c5:	38 8e 03 
     11a36c8:	49 39 c4             	cmp    r12,rax

### 0x122ad5d FDE=0x122acda..0x122adf6 base=rbx
     122acf8:	e8 4d b4 e7 ff       	call   10a614a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d560>
     122acfd:	83 a3 f0 03 00 00 00 	and    DWORD PTR [rbx+0x3f0],0x0
     122ad04:	83 a3 48 04 00 00 00 	and    DWORD PTR [rbx+0x448],0x0
     122ad0b:	66 83 a3 50 04 00 00 	and    WORD PTR [rbx+0x450],0x0
     122ad12:	00 
     122ad13:	48 8d 83 60 04 00 00 	lea    rax,[rbx+0x460]
     122ad1a:	0f 57 c0             	xorps  xmm0,xmm0
     122ad1d:	0f 11 83 60 04 00 00 	movups XMMWORD PTR [rbx+0x460],xmm0
     122ad24:	48 89 83 58 04 00 00 	mov    QWORD PTR [rbx+0x458],rax
     122ad2b:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     122ad32:	40 88 ab 38 05 00 00 	mov    BYTE PTR [rbx+0x538],bpl
     122ad39:	40 88 ab 50 05 00 00 	mov    BYTE PTR [rbx+0x550],bpl
     122ad40:	ba c4 00 00 00       	mov    edx,0xc4
     122ad45:	31 f6                	xor    esi,esi
     122ad47:	e8 44 3e 5c 00       	call   17eeb90 <memset@plt>
     122ad4c:	40 88 ab b8 05 00 00 	mov    BYTE PTR [rbx+0x5b8],bpl
     122ad53:	40 88 ab f0 05 00 00 	mov    BYTE PTR [rbx+0x5f0],bpl
     122ad5a:	0f 57 c0             	xorps  xmm0,xmm0
     122ad5d:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0
     122ad64:	0f 11 83 c9 05 00 00 	movups XMMWORD PTR [rbx+0x5c9],xmm0
     122ad6b:	83 a3 f8 05 00 00 00 	and    DWORD PTR [rbx+0x5f8],0x0
     122ad72:	40 88 ab 00 06 00 00 	mov    BYTE PTR [rbx+0x600],bpl
     122ad79:	40 88 ab 18 06 00 00 	mov    BYTE PTR [rbx+0x618],bpl
     122ad80:	40 88 ab 20 06 00 00 	mov    BYTE PTR [rbx+0x620],bpl
     122ad87:	40 88 ab 40 06 00 00 	mov    BYTE PTR [rbx+0x640],bpl
     122ad8e:	48 83 a3 68 06 00 00 	and    QWORD PTR [rbx+0x668],0x0
     122ad95:	00 
     122ad96:	0f 11 83 48 06 00 00 	movups XMMWORD PTR [rbx+0x648],xmm0
     122ad9d:	0f 11 83 58 06 00 00 	movups XMMWORD PTR [rbx+0x658],xmm0
     122ada4:	0f 11 83 58 05 00 00 	movups XMMWORD PTR [rbx+0x558],xmm0
     122adab:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
     122adb2:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
     122adb9:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
     122adc0:	0f 11 83 91 05 00 00 	movups XMMWORD PTR [rbx+0x591],xmm0
     122adc7:	c7 83 70 06 00 00 00 	mov    DWORD PTR [rbx+0x670],0x3f800000
     122adce:	00 80 3f 
     122add1:	40 88 ab 80 06 00 00 	mov    BYTE PTR [rbx+0x680],bpl
     122add8:	48 83 a3 78 06 00 00 	and    QWORD PTR [rbx+0x678],0x0
     122addf:	00 
     122ade0:	0f 11 83 88 06 00 00 	movups XMMWORD PTR [rbx+0x688],xmm0
     122ade7:	48 83 a3 98 06 00 00 	and    QWORD PTR [rbx+0x698],0x0
     122adee:	00 
     122adef:	48 83 c4 08          	add    rsp,0x8
     122adf3:	5b                   	pop    rbx
     122adf4:	5d                   	pop    rbp
     122adf5:	c3                   	ret

### 0x12cb808 FDE=0x12cb106..0x12cbc74 base=rbx
     12cb79e:	48 8d 0d 1b 76 59 00 	lea    rcx,[rip+0x59761b]        # 1862dc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f4a8>
     12cb7a5:	48 89 08             	mov    QWORD PTR [rax],rcx
     12cb7a8:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     12cb7ac:	48 89 83 38 05 00 00 	mov    QWORD PTR [rbx+0x538],rax
     12cb7b3:	0f 57 c0             	xorps  xmm0,xmm0
     12cb7b6:	0f 11 83 48 05 00 00 	movups XMMWORD PTR [rbx+0x548],xmm0
     12cb7bd:	0f 11 83 58 05 00 00 	movups XMMWORD PTR [rbx+0x558],xmm0
     12cb7c4:	83 a3 40 05 00 00 00 	and    DWORD PTR [rbx+0x540],0x0
     12cb7cb:	45 31 f6             	xor    r14d,r14d
     12cb7ce:	44 88 b3 44 05 00 00 	mov    BYTE PTR [rbx+0x544],r14b
     12cb7d5:	b8 00 00 80 3f       	mov    eax,0x3f800000
     12cb7da:	89 83 68 05 00 00    	mov    DWORD PTR [rbx+0x568],eax
     12cb7e0:	0f 11 83 70 05 00 00 	movups XMMWORD PTR [rbx+0x570],xmm0
     12cb7e7:	0f 11 83 80 05 00 00 	movups XMMWORD PTR [rbx+0x580],xmm0
     12cb7ee:	89 83 90 05 00 00    	mov    DWORD PTR [rbx+0x590],eax
     12cb7f4:	0f 11 83 98 05 00 00 	movups XMMWORD PTR [rbx+0x598],xmm0
     12cb7fb:	0f 11 83 a8 05 00 00 	movups XMMWORD PTR [rbx+0x5a8],xmm0
     12cb802:	89 83 b8 05 00 00    	mov    DWORD PTR [rbx+0x5b8],eax
     12cb808:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0
     12cb80f:	0f 11 83 d0 05 00 00 	movups XMMWORD PTR [rbx+0x5d0],xmm0
     12cb816:	89 83 e0 05 00 00    	mov    DWORD PTR [rbx+0x5e0],eax
     12cb81c:	66 83 a3 e8 05 00 00 	and    WORD PTR [rbx+0x5e8],0x0
     12cb823:	00 
     12cb824:	48 8d 8b 38 05 00 00 	lea    rcx,[rbx+0x538]
     12cb82b:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     12cb830:	0f 11 83 00 06 00 00 	movups XMMWORD PTR [rbx+0x600],xmm0
     12cb837:	0f 11 83 f0 05 00 00 	movups XMMWORD PTR [rbx+0x5f0],xmm0
     12cb83e:	89 83 10 06 00 00    	mov    DWORD PTR [rbx+0x610],eax
     12cb844:	44 88 b3 18 06 00 00 	mov    BYTE PTR [rbx+0x618],r14b
     12cb84b:	83 a3 1c 06 00 00 00 	and    DWORD PTR [rbx+0x61c],0x0
     12cb852:	48 8d 8b 48 05 00 00 	lea    rcx,[rbx+0x548]
     12cb859:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
     12cb85e:	66 83 a3 20 06 00 00 	and    WORD PTR [rbx+0x620],0x0
     12cb865:	00 
     12cb866:	48 8d 8b 70 05 00 00 	lea    rcx,[rbx+0x570]
     12cb86d:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     12cb872:	48 8d 8b f0 05 00 00 	lea    rcx,[rbx+0x5f0]
     12cb879:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
     12cb87e:	48 8d 8b 28 06 00 00 	lea    rcx,[rbx+0x628]
     12cb885:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
     12cb88a:	0f 11 83 38 06 00 00 	movups XMMWORD PTR [rbx+0x638],xmm0
     12cb891:	0f 11 83 28 06 00 00 	movups XMMWORD PTR [rbx+0x628],xmm0
     12cb898:	89 83 48 06 00 00    	mov    DWORD PTR [rbx+0x648],eax
     12cb89e:	4c 8d bb 50 06 00 00 	lea    r15,[rbx+0x650]
     12cb8a5:	49 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [r12+0xe8]
     12cb8ac:	00 

### 0x1333835 FDE=0x1332e00..0x1334bda base=rbx
     13337db:	48 8d 83 f8 04 00 00 	lea    rax,[rbx+0x4f8]
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

### 0x135f6af FDE=0x135d056..0x1360c1b base=r14
     135f65e:	74 1e                	je     135f67e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4c02>
     135f660:	48 8d 8c 24 90 05 00 	lea    rcx,[rsp+0x590]
     135f667:	00 
     135f668:	49 89 86 30 02 00 00 	mov    QWORD PTR [r14+0x230],rax
     135f66f:	eb 07                	jmp    135f678 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4bfc>
     135f671:	49 8d 8e 30 02 00 00 	lea    rcx,[r14+0x230]
     135f678:	48 83 21 00          	and    QWORD PTR [rcx],0x0
     135f67c:	eb 15                	jmp    135f693 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4c17>
     135f67e:	49 89 b6 30 02 00 00 	mov    QWORD PTR [r14+0x230],rsi
     135f685:	48 8d bc 24 70 05 00 	lea    rdi,[rsp+0x570]
     135f68c:	00 
     135f68d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f690:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135f693:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     135f698:	49 89 86 40 02 00 00 	mov    QWORD PTR [r14+0x240],rax
     135f69f:	31 db                	xor    ebx,ebx
     135f6a1:	41 88 9e 48 02 00 00 	mov    BYTE PTR [r14+0x248],bl
     135f6a8:	41 88 9e b8 05 00 00 	mov    BYTE PTR [r14+0x5b8],bl
     135f6af:	66 41 83 a6 c0 05 00 	and    WORD PTR [r14+0x5c0],0x0
     135f6b6:	00 00 
     135f6b8:	4d 8d 6e 10          	lea    r13,[r14+0x10]
     135f6bc:	49 8d 6e 18          	lea    rbp,[r14+0x18]
     135f6c0:	66 0f ef c0          	pxor   xmm0,xmm0
     135f6c4:	f3 41 0f 7f 86 c8 05 	movdqu XMMWORD PTR [r14+0x5c8],xmm0
     135f6cb:	00 00 
     135f6cd:	f3 41 0f 7f 86 d4 05 	movdqu XMMWORD PTR [r14+0x5d4],xmm0
     135f6d4:	00 00 
     135f6d6:	48 8d 05 bb a6 50 00 	lea    rax,[rip+0x50a6bb]        # 1869d98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26480>
     135f6dd:	49 89 86 e8 05 00 00 	mov    QWORD PTR [r14+0x5e8],rax
     135f6e4:	49 8d be f0 05 00 00 	lea    rdi,[r14+0x5f0]
     135f6eb:	e8 06 a3 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135f6f0:	41 c6 86 00 06 00 00 	mov    BYTE PTR [r14+0x600],0x1
     135f6f7:	01 
     135f6f8:	41 c7 86 04 06 00 00 	mov    DWORD PTR [r14+0x604],0x1
     135f6ff:	01 00 00 00 
     135f703:	49 83 a6 08 06 00 00 	and    QWORD PTR [r14+0x608],0x0
     135f70a:	00 
     135f70b:	49 83 a6 18 06 00 00 	and    QWORD PTR [r14+0x618],0x0
     135f712:	00 
     135f713:	49 83 a6 28 06 00 00 	and    QWORD PTR [r14+0x628],0x0
     135f71a:	00 
     135f71b:	48 8d 05 ae a5 50 00 	lea    rax,[rip+0x50a5ae]        # 1869cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x263b8>
     135f722:	49 89 86 30 06 00 00 	mov    QWORD PTR [r14+0x630],rax
     135f729:	49 8d 86 40 06 00 00 	lea    rax,[r14+0x640]
     135f730:	66 0f ef c0          	pxor   xmm0,xmm0
     135f734:	66 41 0f 7f 86 40 06 	movdqa XMMWORD PTR [r14+0x640],xmm0

### 0x1367cc8 FDE=0x1367b56..0x1367dcc base=r14
     1367c7c:	00 
     1367c7d:	0f 11 84 24 d0 00 00 	movups XMMWORD PTR [rsp+0xd0],xmm0
     1367c84:	00 
     1367c85:	48 8d 05 54 01 67 ff 	lea    rax,[rip+0xffffffffff670154]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     1367c8c:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     1367c93:	00 
     1367c94:	48 8d 05 07 e1 01 00 	lea    rax,[rip+0x1e107]        # 1385da2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb326>
     1367c9b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     1367ca2:	00 
     1367ca3:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
     1367ca9:	74 10                	je     1367cbb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad23f>
     1367cab:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1367cb0:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     1367cb7:	00 
     1367cb8:	ff 57 18             	call   QWORD PTR [rdi+0x18]
     1367cbb:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1367cc2:	00 
     1367cc3:	e8 18 f6 ff ff       	call   13672e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac864>
     1367cc8:	41 c6 86 c0 05 00 00 	mov    BYTE PTR [r14+0x5c0],0x0
     1367ccf:	00 
     1367cd0:	49 8d be 48 02 00 00 	lea    rdi,[r14+0x248]
     1367cd7:	e8 1a e9 fe ff       	call   13565f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb7a>
     1367cdc:	49 8d be 68 06 00 00 	lea    rdi,[r14+0x668]
     1367ce3:	e8 0e c9 9b ff       	call   d245f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271596>
     1367ce8:	49 8d be 80 06 00 00 	lea    rdi,[r14+0x680]
     1367cef:	e8 32 6c 74 ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
     1367cf4:	49 8d be b8 06 00 00 	lea    rdi,[r14+0x6b8]
     1367cfb:	e8 5e 06 00 00       	call   136835e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad8e2>
     1367d00:	41 80 be a8 09 00 00 	cmp    BYTE PTR [r14+0x9a8],0x0
     1367d07:	00 
     1367d08:	74 14                	je     1367d1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad2a2>
     1367d0a:	49 8d be 58 09 00 00 	lea    rdi,[r14+0x958]
     1367d11:	e8 ea a5 eb ff       	call   1222300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67884>
     1367d16:	41 c6 86 a8 09 00 00 	mov    BYTE PTR [r14+0x9a8],0x0
     1367d1d:	00 
     1367d1e:	4c 89 f7             	mov    rdi,r14
     1367d21:	e8 20 39 00 00       	call   136b646 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b0bca>
     1367d26:	84 db                	test   bl,bl
     1367d28:	75 13                	jne    1367d3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad2c1>
     1367d2a:	48 83 7c 24 60 00    	cmp    QWORD PTR [rsp+0x60],0x0
     1367d30:	74 0b                	je     1367d3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad2c1>
     1367d32:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1367d37:	6a 04                	push   0x4
     1367d39:	5e                   	pop    rsi
     1367d3a:	ff 57 18             	call   QWORD PTR [rdi+0x18]
     1367d3d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### 0x136f412 FDE=0x136efea..0x136f65c base=rbx
     136f3c8:	00 
     136f3c9:	48 8d 05 94 d0 70 ff 	lea    rax,[rip+0xffffffffff70d094]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     136f3d0:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
     136f3d7:	00 
     136f3d8:	48 8d 05 e1 68 01 00 	lea    rax,[rip+0x168e1]        # 1385cc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb244>
     136f3df:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
     136f3e6:	00 
     136f3e7:	48 83 bc 24 98 00 00 	cmp    QWORD PTR [rsp+0x98],0x0
     136f3ee:	00 00 
     136f3f0:	74 13                	je     136f405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4989>
     136f3f2:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     136f3f9:	00 
     136f3fa:	48 8d b4 24 e8 00 00 	lea    rsi,[rsp+0xe8]
     136f401:	00 
     136f402:	ff 57 18             	call   QWORD PTR [rdi+0x18]
     136f405:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
     136f40c:	00 
     136f40d:	e8 ce 7e ff ff       	call   13672e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac864>
     136f412:	c6 83 c0 05 00 00 01 	mov    BYTE PTR [rbx+0x5c0],0x1
     136f419:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]
     136f420:	00 
     136f421:	41 c7 06 01 00 00 00 	mov    DWORD PTR [r14],0x1
     136f428:	41 83 66 68 00       	and    DWORD PTR [r14+0x68],0x0
     136f42d:	48 8d b4 24 68 02 00 	lea    rsi,[rsp+0x268]
     136f434:	00 
     136f435:	48 8d 8c 24 e8 00 00 	lea    rcx,[rsp+0xe8]
     136f43c:	00 
     136f43d:	48 89 df             	mov    rdi,rbx
     136f440:	44 89 ea             	mov    edx,r13d
     136f443:	e8 f8 7e ff ff       	call   1367340 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac8c4>
     136f448:	4c 89 f7             	mov    rdi,r14
     136f44b:	e8 1c 72 fe ff       	call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
     136f450:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     136f457:	00 
     136f458:	48 89 df             	mov    rdi,rbx
     136f45b:	e8 22 22 01 00       	call   1381682 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6c06>
     136f460:	80 bb a8 09 00 00 00 	cmp    BYTE PTR [rbx+0x9a8],0x0
     136f467:	0f 84 d5 00 00 00    	je     136f542 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4ac6>
     136f46d:	80 bb b8 05 00 00 00 	cmp    BYTE PTR [rbx+0x5b8],0x0
     136f474:	0f 84 c8 00 00 00    	je     136f542 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4ac6>
     136f47a:	4c 8b b3 d0 00 00 00 	mov    r14,QWORD PTR [rbx+0xd0]
     136f481:	80 bb a0 09 00 00 00 	cmp    BYTE PTR [rbx+0x9a0],0x0
     136f488:	48 8d 05 f7 b6 00 ff 	lea    rax,[rip+0xffffffffff00b6f7]        # 37ab86 <_ZTSSt12bad_any_cast@@Base-0x15642>
     136f48f:	48 8d 35 df d5 fc fe 	lea    rsi,[rip+0xfffffffffefcd5df]        # 33ca75 <_ZTSSt12bad_any_cast@@Base-0x53753>
     136f496:	48 0f 44 f0          	cmove  rsi,rax
     136f49a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### 0x151fe88 FDE=0x151f0d6..0x15219ce base=rsi
     151fe40:	48 8b 9d 38 f8 ff ff 	mov    rbx,QWORD PTR [rbp-0x7c8]
     151fe47:	41 38 85 14 01 00 00 	cmp    BYTE PTR [r13+0x114],al
     151fe4e:	74 19                	je     151fe69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3653ed>
     151fe50:	48 8d 35 c4 73 e3 fe 	lea    rsi,[rip+0xfffffffffee373c4]        # 35721b <_ZTSSt12bad_any_cast@@Base-0x38fad>
     151fe57:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     151fe5e:	00 
     151fe5f:	6a 28                	push   0x28
     151fe61:	5a                   	pop    rdx
     151fe62:	e8 b3 cb 57 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     151fe67:	eb 14                	jmp    151fe7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365401>
     151fe69:	0f 57 c0             	xorps  xmm0,xmm0
     151fe6c:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
     151fe73:	00 
     151fe74:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
     151fe7b:	00 00 
     151fe7d:	48 8d b4 24 a0 0c 00 	lea    rsi,[rsp+0xca0]
     151fe84:	00 
     151fe85:	0f 28 06             	movaps xmm0,XMMWORD PTR [rsi]
     151fe88:	0f 29 86 c0 05 00 00 	movaps XMMWORD PTR [rsi+0x5c0],xmm0
     151fe8f:	80 7e 40 00          	cmp    BYTE PTR [rsi+0x40],0x0
     151fe93:	74 0a                	je     151fe9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365423>
     151fe95:	48 8d bc 24 68 11 00 	lea    rdi,[rsp+0x1168]
     151fe9c:	00 
     151fe9d:	eb 08                	jmp    151fea7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36542b>
     151fe9f:	48 8d bc 24 c8 0e 00 	lea    rdi,[rsp+0xec8]
     151fea6:	00 
     151fea7:	80 8f 35 fe ff ff 10 	or     BYTE PTR [rdi-0x1cb],0x10
     151feae:	48 8b 8f 28 fe ff ff 	mov    rcx,QWORD PTR [rdi-0x1d8]
     151feb5:	f6 c1 01             	test   cl,0x1
     151feb8:	0f 85 c3 13 00 00    	jne    1521281 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366805>
     151febe:	6a 10                	push   0x10
     151fec0:	5a                   	pop    rdx
     151fec1:	e8 96 58 24 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
     151fec6:	80 bc 24 e0 0c 00 00 	cmp    BYTE PTR [rsp+0xce0],0x0
     151fecd:	00 
     151fece:	74 0a                	je     151feda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36545e>
     151fed0:	48 8d 84 24 9c 0f 00 	lea    rax,[rsp+0xf9c]
     151fed7:	00 
     151fed8:	eb 08                	jmp    151fee2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365466>
     151feda:	48 8d 84 24 fc 0c 00 	lea    rax,[rsp+0xcfc]
     151fee1:	00 
     151fee2:	48 b9 00 78 0e 90 55 	movabs rcx,0x155655900e7800
     151fee9:	56 15 00 
     151feec:	48 89 88 54 02 00 00 	mov    QWORD PTR [rax+0x254],rcx
     151fef3:	80 48 03 20          	or     BYTE PTR [rax+0x3],0x20
     151fef7:	48 8d 35 02 02 4d 00 	lea    rsi,[rip+0x4d0202]        # 19f0100 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1830>

### 0x167af53 FDE=0x167af20..0x167aff6 base=rdi
     167af09:	5b                   	pop    rbx
     167af0a:	41 5e                	pop    r14
     167af0c:	c3                   	ret
     167af0d:	49 89 c6             	mov    r14,rax
     167af10:	48 89 df             	mov    rdi,rbx
     167af13:	e8 78 2f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     167af18:	4c 89 f7             	mov    rdi,r14
     167af1b:	e8 b0 4d 3f ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     167af20:	31 c0                	xor    eax,eax
     167af22:	88 07                	mov    BYTE PTR [rdi],al
     167af24:	88 87 70 05 00 00    	mov    BYTE PTR [rdi+0x570],al
     167af2a:	88 87 98 05 00 00    	mov    BYTE PTR [rdi+0x598],al
     167af30:	88 87 a0 05 00 00    	mov    BYTE PTR [rdi+0x5a0],al
     167af36:	88 87 a8 05 00 00    	mov    BYTE PTR [rdi+0x5a8],al
     167af3c:	0f 57 c0             	xorps  xmm0,xmm0
     167af3f:	0f 11 87 18 06 00 00 	movups XMMWORD PTR [rdi+0x618],xmm0
     167af46:	88 87 28 06 00 00    	mov    BYTE PTR [rdi+0x628],al
     167af4c:	0f 11 87 b0 05 00 00 	movups XMMWORD PTR [rdi+0x5b0],xmm0
     167af53:	0f 11 87 c0 05 00 00 	movups XMMWORD PTR [rdi+0x5c0],xmm0
     167af5a:	0f 11 87 d0 05 00 00 	movups XMMWORD PTR [rdi+0x5d0],xmm0
     167af61:	0f 11 87 e0 05 00 00 	movups XMMWORD PTR [rdi+0x5e0],xmm0
     167af68:	0f 11 87 f0 05 00 00 	movups XMMWORD PTR [rdi+0x5f0],xmm0
     167af6f:	0f 11 87 00 06 00 00 	movups XMMWORD PTR [rdi+0x600],xmm0
     167af76:	66 83 a7 10 06 00 00 	and    WORD PTR [rdi+0x610],0x0
     167af7d:	00 
     167af7e:	88 87 30 06 00 00    	mov    BYTE PTR [rdi+0x630],al
     167af84:	66 83 a7 38 06 00 00 	and    WORD PTR [rdi+0x638],0x0
     167af8b:	00 
     167af8c:	88 87 3a 06 00 00    	mov    BYTE PTR [rdi+0x63a],al
     167af92:	88 87 3c 06 00 00    	mov    BYTE PTR [rdi+0x63c],al
     167af98:	88 87 40 06 00 00    	mov    BYTE PTR [rdi+0x640],al
     167af9e:	0f 11 87 58 06 00 00 	movups XMMWORD PTR [rdi+0x658],xmm0
     167afa5:	0f 11 87 48 06 00 00 	movups XMMWORD PTR [rdi+0x648],xmm0
     167afac:	0f 11 87 81 05 00 00 	movups XMMWORD PTR [rdi+0x581],xmm0
     167afb3:	0f 11 87 78 05 00 00 	movups XMMWORD PTR [rdi+0x578],xmm0
     167afba:	c7 87 68 06 00 00 00 	mov    DWORD PTR [rdi+0x668],0x3f800000
     167afc1:	00 80 3f 
     167afc4:	88 87 b0 06 00 00    	mov    BYTE PTR [rdi+0x6b0],al
     167afca:	0f 11 87 b8 06 00 00 	movups XMMWORD PTR [rdi+0x6b8],xmm0
     167afd1:	48 83 a7 c8 06 00 00 	and    QWORD PTR [rdi+0x6c8],0x0
     167afd8:	00 
     167afd9:	0f 11 87 99 06 00 00 	movups XMMWORD PTR [rdi+0x699],xmm0
     167afe0:	0f 11 87 90 06 00 00 	movups XMMWORD PTR [rdi+0x690],xmm0
     167afe7:	0f 11 87 7c 06 00 00 	movups XMMWORD PTR [rdi+0x67c],xmm0
     167afee:	0f 11 87 70 06 00 00 	movups XMMWORD PTR [rdi+0x670],xmm0
     167aff5:	c3                   	ret

## FDE-level multi-slot writers regardless of base alias
### touches=3/4 FDE=0xd6aa99..0xd6f087
- +0x178 service=47 base=r12:   d6b2f3:	f3 41 0f 7f 84 24 78 	movdqu XMMWORD PTR [r12+0x178],xmm0
- +0x288 service=81 base=rbx:   d6b4b7:	48 89 83 88 02 00 00 	mov    QWORD PTR [rbx+0x288],rax
- +0x5c0 service=184 base=r15:   d6ba55:	41 88 87 c0 05 00 00 	mov    BYTE PTR [r15+0x5c0],al

### touches=3/4 FDE=0x12cb106..0x12cbc74
- +0x288 service=81 base=rbx:  12cb4ac:	48 89 93 88 02 00 00 	mov    QWORD PTR [rbx+0x288],rdx
- +0x590 service=178 base=rbx:  12cb7ee:	89 83 90 05 00 00    	mov    DWORD PTR [rbx+0x590],eax
- +0x5c0 service=184 base=rbx:  12cb808:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0

### touches=2/4 FDE=0xaa1418..0xaa6ad6
- +0x178 service=47 base=rcx:   aa3dc3:	48 89 81 78 01 00 00 	mov    QWORD PTR [rcx+0x178],rax
- +0x288 service=81 base=r15:   aa3f4c:	f3 41 0f 7f 87 88 02 	movdqu XMMWORD PTR [r15+0x288],xmm0
- +0x288 service=81 base=r13:   aa41d5:	49 89 8d 88 02 00 00 	mov    QWORD PTR [r13+0x288],rcx
- +0x288 service=81 base=rbx:   aa4e59:	f3 0f 7f 83 88 02 00 	movdqu XMMWORD PTR [rbx+0x288],xmm0

### touches=2/4 FDE=0xbd9b4a..0xbdc4b7
- +0x178 service=47 base=r14:   bdb6c3:	49 89 86 78 01 00 00 	mov    QWORD PTR [r14+0x178],rax
- +0x288 service=81 base=r14:   bd9e8d:	41 c7 86 88 02 00 00 	mov    DWORD PTR [r14+0x288],0x11

### touches=2/4 FDE=0xc5391a..0xc571cb
- +0x178 service=47 base=rbx:   c56321:	0f 11 83 78 01 00 00 	movups XMMWORD PTR [rbx+0x178],xmm0
- +0x288 service=81 base=r12:   c55f05:	41 83 a4 24 88 02 00 	and    DWORD PTR [r12+0x288],0x0

### touches=2/4 FDE=0xcec92c..0xced213
- +0x178 service=47 base=rdi:   ceccfb:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- +0x288 service=81 base=rdi:   cecfef:	48 83 a7 88 02 00 00 	and    QWORD PTR [rdi+0x288],0x0
- +0x288 service=81 base=rdi:   ced021:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax
- +0x288 service=81 base=rsi:   ced02f:	48 83 a6 88 02 00 00 	and    QWORD PTR [rsi+0x288],0x0

### touches=2/4 FDE=0xe67eee..0xe6853a
- +0x178 service=47 base=r12:   e68033:	41 0f 11 84 24 78 01 	movups XMMWORD PTR [r12+0x178],xmm0
- +0x288 service=81 base=r12:   e681b3:	f3 41 0f 7f 84 24 88 	movdqu XMMWORD PTR [r12+0x288],xmm0

### touches=2/4 FDE=0xee55c2..0xee6102
- +0x178 service=47 base=rdi:   ee5979:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
- +0x178 service=47 base=rdi:   ee598f:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- +0x178 service=47 base=rsi:   ee59ba:	0f 11 86 78 01 00 00 	movups XMMWORD PTR [rsi+0x178],xmm0
- +0x288 service=81 base=rdi:   ee5c57:	48 83 a7 88 02 00 00 	and    QWORD PTR [rdi+0x288],0x0
- +0x288 service=81 base=rdi:   ee5c89:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax
- +0x288 service=81 base=rsi:   ee5c97:	48 83 a6 88 02 00 00 	and    QWORD PTR [rsi+0x288],0x0

### touches=2/4 FDE=0x10668f2..0x10669da
- +0x590 service=178 base=rbx:  106694a:	48 83 a3 90 05 00 00 	and    QWORD PTR [rbx+0x590],0x0
- +0x5c0 service=184 base=rbx:  1066952:	48 83 a3 c0 05 00 00 	and    QWORD PTR [rbx+0x5c0],0x0

### touches=2/4 FDE=0x107a02c..0x107e484
- +0x178 service=47 base=r14:  107a6e2:	f3 41 0f 7f 86 78 01 	movdqu XMMWORD PTR [r14+0x178],xmm0
- +0x178 service=47 base=r15:  107bbe0:	49 83 a7 78 01 00 00 	and    QWORD PTR [r15+0x178],0x0
- +0x178 service=47 base=r15:  107c6b7:	45 89 a7 78 01 00 00 	mov    DWORD PTR [r15+0x178],r12d
- +0x288 service=81 base=r15:  107bd08:	f3 41 0f 7f 87 88 02 	movdqu XMMWORD PTR [r15+0x288],xmm0

### touches=2/4 FDE=0x1089d9e..0x1089f9e
- +0x590 service=178 base=rbx:  1089e0d:	48 83 a3 90 05 00 00 	and    QWORD PTR [rbx+0x590],0x0
- +0x590 service=178 base=rbx:  1089e3f:	48 89 83 90 05 00 00 	mov    QWORD PTR [rbx+0x590],rax
- +0x590 service=178 base=r14:  1089e4e:	49 83 a6 90 05 00 00 	and    QWORD PTR [r14+0x590],0x0
- +0x5c0 service=184 base=rbx:  1089ea6:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
- +0x5c0 service=184 base=r14:  1089ebc:	49 83 a6 c0 05 00 00 	and    QWORD PTR [r14+0x5c0],0x0

### touches=2/4 FDE=0x10d0e58..0x10d4cf6
- +0x178 service=47 base=rbp:  10d2230:	4c 89 ad 78 01 00 00 	mov    QWORD PTR [rbp+0x178],r13
- +0x288 service=81 base=rbp:  10d240c:	88 85 88 02 00 00    	mov    BYTE PTR [rbp+0x288],al

### touches=2/4 FDE=0x1144dce..0x1145447
- +0x178 service=47 base=rax:  1144e60:	88 88 78 01 00 00    	mov    BYTE PTR [rax+0x178],cl
- +0x288 service=81 base=rax:  1144ece:	88 88 88 02 00 00    	mov    BYTE PTR [rax+0x288],cl

### touches=2/4 FDE=0x11a318c..0x11a382e
- +0x178 service=47 base=r13:  11a347c:	41 c7 85 78 01 00 00 	mov    DWORD PTR [r13+0x178],0x3f800000
- +0x5c0 service=184 base=rbx:  11a365a:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax

### touches=2/4 FDE=0x11ce3e2..0x11ce7f1
- +0x178 service=47 base=rbx:  11ce47e:	89 93 78 01 00 00    	mov    DWORD PTR [rbx+0x178],edx
- +0x288 service=81 base=rbx:  11ce570:	89 93 88 02 00 00    	mov    DWORD PTR [rbx+0x288],edx

### touches=2/4 FDE=0x1332e00..0x1334bda
- +0x288 service=81 base=rbx:  1333345:	f3 0f 7f 83 88 02 00 	movdqu XMMWORD PTR [rbx+0x288],xmm0
- +0x5c0 service=184 base=rbx:  1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax

### touches=2/4 FDE=0x1391aee..0x1392698
- +0x178 service=47 base=rbx:  1392000:	48 89 8b 78 01 00 00 	mov    QWORD PTR [rbx+0x178],rcx
- +0x288 service=81 base=rbx:  139221c:	0f 11 8b 88 02 00 00 	movups XMMWORD PTR [rbx+0x288],xmm1

### touches=2/4 FDE=0x13ab8aa..0x13ac1ed
- +0x178 service=47 base=rbx:  13abc58:	c6 83 78 01 00 00 01 	mov    BYTE PTR [rbx+0x178],0x1
- +0x288 service=81 base=rbx:  13abd38:	48 c7 83 88 02 00 00 	mov    QWORD PTR [rbx+0x288],0xc8

### touches=2/4 FDE=0x13ac372..0x13adc94
- +0x178 service=47 base=rbx:  13aca5c:	0f 11 83 78 01 00 00 	movups XMMWORD PTR [rbx+0x178],xmm0
- +0x288 service=81 base=rbx:  13acb62:	48 83 a3 88 02 00 00 	and    QWORD PTR [rbx+0x288],0x0

### touches=2/4 FDE=0x1421d56..0x1422627
- +0x178 service=47 base=rdi:  14220f2:	48 83 a7 78 01 00 00 	and    QWORD PTR [rdi+0x178],0x0
- +0x178 service=47 base=rdi:  142211d:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- +0x178 service=47 base=rsi:  1422124:	48 83 a6 78 01 00 00 	and    QWORD PTR [rsi+0x178],0x0
- +0x288 service=81 base=rdi:  142244b:	0f 11 87 88 02 00 00 	movups XMMWORD PTR [rdi+0x288],xmm0
- +0x288 service=81 base=rdi:  1422461:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax
- +0x288 service=81 base=rsi:  142248c:	0f 11 86 88 02 00 00 	movups XMMWORD PTR [rsi+0x288],xmm0

### touches=2/4 FDE=0x14a487c..0x14a4c7b
- +0x178 service=47 base=rbx:  14a4ab8:	48 89 83 78 01 00 00 	mov    QWORD PTR [rbx+0x178],rax
- +0x288 service=81 base=rbx:  14a4c0e:	48 89 83 88 02 00 00 	mov    QWORD PTR [rbx+0x288],rax
- +0x288 service=81 base=r14:  14a4c27:	49 83 a6 88 02 00 00 	and    QWORD PTR [r14+0x288],0x0

### touches=2/4 FDE=0x1511570..0x15117dd
- +0x178 service=47 base=rdi:  1511638:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
- +0x288 service=81 base=rdi:  15116ee:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax

### touches=2/4 FDE=0x151f0d6..0x15219ce
- +0x288 service=81 base=r15:  1520624:	49 89 87 88 02 00 00 	mov    QWORD PTR [r15+0x288],rax
- +0x5c0 service=184 base=rsi:  151fe88:	0f 29 86 c0 05 00 00 	movaps XMMWORD PTR [rsi+0x5c0],xmm0

### touches=2/4 FDE=0x1653d8c..0x1653f8d
- +0x178 service=47 base=rdi:  1653e89:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- +0x288 service=81 base=rdi:  1653f70:	0f 11 87 88 02 00 00 	movups XMMWORD PTR [rdi+0x288],xmm0

### touches=2/4 FDE=0x1654a42..0x1654c43
- +0x178 service=47 base=rdi:  1654b3f:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
- +0x288 service=81 base=rdi:  1654c26:	0f 11 87 88 02 00 00 	movups XMMWORD PTR [rdi+0x288],xmm0

### touches=2/4 FDE=0x16b21f0..0x16b245d
- +0x178 service=47 base=rdi:  16b22b8:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
- +0x288 service=81 base=rdi:  16b2383:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax

### touches=2/4 FDE=0x16b7702..0x16b796f
- +0x178 service=47 base=rdi:  16b77ca:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
- +0x288 service=81 base=rdi:  16b7895:	48 89 87 88 02 00 00 	mov    QWORD PTR [rdi+0x288],rax

## Indexed pointer stores near immediate service ID 0xb8
### store 0xb5c1b6 FDE=0xb5adfe..0xb5c934
      b5c161:	00 
      b5c162:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      b5c169:	00 
      b5c16a:	48 8b 94 24 d8 00 00 	mov    rdx,QWORD PTR [rsp+0xd8]
      b5c171:	00 
      b5c172:	48 89 94 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdx
      b5c179:	00 
      b5c17a:	8b 8c 24 e0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xe0]
      b5c181:	89 8c 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],ecx
      b5c188:	b1 01                	mov    cl,0x1
      b5c18a:	48 85 d2             	test   rdx,rdx
      b5c18d:	74 36                	je     b5c1c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa9165>
      b5c18f:	4c 8d 84 24 a0 00 00 	lea    r8,[rsp+0xa0]
      b5c196:	00 
      b5c197:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      b5c19b:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
      b5c19f:	48 85 d7             	test   rdi,rdx
      b5c1a2:	75 05                	jne    b5c1a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa9149>
      b5c1a4:	48 21 d0             	and    rax,rdx
      b5c1a7:	eb 0d                	jmp    b5c1b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa9156>
      b5c1a9:	48 39 f8             	cmp    rax,rdi
      b5c1ac:	72 08                	jb     b5c1b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa9156>
      b5c1ae:	31 d2                	xor    edx,edx
      b5c1b0:	48 f7 f7             	div    rdi
      b5c1b3:	48 89 d0             	mov    rax,rdx
      b5c1b6:	4c 89 04 c6          	mov    QWORD PTR [rsi+rax*8],r8
      b5c1ba:	48 8d 84 24 d0 00 00 	lea    rax,[rsp+0xd0]
      b5c1c1:	00 
      b5c1c2:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      b5c1c5:	88 8c 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],cl
      b5c1cc:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      b5c1d1:	e8 b0 22 f4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b5c1d6:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      b5c1dd:	00 
      b5c1de:	e8 83 64 f8 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
      b5c1e3:	80 bc 24 b8 00 00 00 	cmp    BYTE PTR [rsp+0xb8],0x0
      b5c1ea:	00 

### store 0xcaab86 FDE=0xcaa7dc..0xcab16a
      caab26:	0f 84 8a 01 00 00    	je     caacb6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7c56>
      caab2c:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
      caab30:	f3 49 0f b8 f4       	popcnt rsi,r12
      caab35:	48 83 fe 01          	cmp    rsi,0x1
      caab39:	77 2b                	ja     caab66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7b06>
      caab3b:	49 8d 44 24 ff       	lea    rax,[r12-0x1]
      caab40:	48 21 c1             	and    rcx,rax
      caab43:	eb 31                	jmp    caab76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7b16>
      caab45:	0f 83 6b 01 00 00    	jae    caacb6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7c56>
      caab4b:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
      caab52:	00 
      caab53:	48 85 c0             	test   rax,rax
      caab56:	0f 88 b4 00 00 00    	js     caac10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7bb0>
      caab5c:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
      caab61:	e9 bf 00 00 00       	jmp    caac25 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7bc5>
      caab66:	4c 39 e1             	cmp    rcx,r12
      caab69:	72 0b                	jb     caab76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7b16>
      caab6b:	48 89 c8             	mov    rax,rcx
      caab6e:	31 d2                	xor    edx,edx
      caab70:	49 f7 f4             	div    r12
      caab73:	48 89 d1             	mov    rcx,rdx
      caab76:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      caab7d:	00 
      caab7e:	48 8d 94 24 b0 00 00 	lea    rdx,[rsp+0xb0]
      caab85:	00 
      caab86:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
      caab8a:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
      caab8d:	4d 85 c0             	test   r8,r8
      caab90:	0f 84 20 01 00 00    	je     caacb6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7c56>
      caab96:	4d 8d 4c 24 ff       	lea    r9,[r12-0x1]
      caab9b:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
      caab9f:	83 fe 01             	cmp    esi,0x1
      caaba2:	77 05                	ja     caaba9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7b49>
      caaba4:	4c 21 c8             	and    rax,r9
      caaba7:	eb 0d                	jmp    caabb6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7b56>
      caaba9:	4c 39 e0             	cmp    rax,r12
      caabac:	72 08                	jb     caabb6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f7b56>

### store 0xe817d1 FDE=0xe814a6..0xe81905
      e8177d:	4c 39 fb             	cmp    rbx,r15
      e81780:	72 0b                	jb     e8178d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48ba3>
      e81782:	48 89 d8             	mov    rax,rbx
      e81785:	31 d2                	xor    edx,edx
      e81787:	49 f7 f7             	div    r15
      e8178a:	48 89 d3             	mov    rbx,rdx
      e8178d:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      e81794:	00 
      e81795:	48 8b 04 d8          	mov    rax,QWORD PTR [rax+rbx*8]
      e81799:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
      e817a0:	00 
      e817a1:	48 85 c0             	test   rax,rax
      e817a4:	74 08                	je     e817ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bc4>
      e817a6:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      e817a9:	48 89 11             	mov    QWORD PTR [rcx],rdx
      e817ac:	eb 5a                	jmp    e81808 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48c1e>
      e817ae:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      e817b5:	00 
      e817b6:	48 89 01             	mov    QWORD PTR [rcx],rax
      e817b9:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e817c0:	00 
      e817c1:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      e817c8:	00 
      e817c9:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
      e817d0:	00 
      e817d1:	48 89 14 d8          	mov    QWORD PTR [rax+rbx*8],rdx
      e817d5:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      e817d8:	48 85 c0             	test   rax,rax
      e817db:	74 2e                	je     e8180b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48c21>
      e817dd:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e817e1:	49 8d 57 ff          	lea    rdx,[r15-0x1]
      e817e5:	49 85 d7             	test   r15,rdx
      e817e8:	75 05                	jne    e817ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48c05>
      e817ea:	48 21 d0             	and    rax,rdx
      e817ed:	eb 0d                	jmp    e817fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48c12>
      e817ef:	4c 39 f8             	cmp    rax,r15
      e817f2:	72 08                	jb     e817fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48c12>

### store 0xedb017 FDE=0xedab0e..0xedb101
      edafcd:	49 8d 45 ff          	lea    rax,[r13-0x1]
      edafd1:	49 85 c5             	test   r13,rax
      edafd4:	75 05                	jne    edafdb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa23f1>
      edafd6:	49 21 c7             	and    r15,rax
      edafd9:	eb 10                	jmp    edafeb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa2401>
      edafdb:	4d 39 ef             	cmp    r15,r13
      edafde:	72 0b                	jb     edafeb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa2401>
      edafe0:	4c 89 f8             	mov    rax,r15
      edafe3:	31 d2                	xor    edx,edx
      edafe5:	49 f7 f5             	div    r13
      edafe8:	49 89 d7             	mov    r15,rdx
      edafeb:	49 8b 06             	mov    rax,QWORD PTR [r14]
      edafee:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
      edaff2:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
      edaff9:	00 
      edaffa:	48 85 c0             	test   rax,rax
      edaffd:	74 08                	je     edb007 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa241d>
      edafff:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      edb002:	48 89 11             	mov    QWORD PTR [rcx],rdx
      edb005:	eb 42                	jmp    edb049 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa245f>
      edb007:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
      edb00b:	48 8b 02             	mov    rax,QWORD PTR [rdx]
      edb00e:	48 89 01             	mov    QWORD PTR [rcx],rax
      edb011:	48 89 0a             	mov    QWORD PTR [rdx],rcx
      edb014:	49 8b 06             	mov    rax,QWORD PTR [r14]
      edb017:	4a 89 14 f8          	mov    QWORD PTR [rax+r15*8],rdx
      edb01b:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      edb01e:	48 85 c0             	test   rax,rax
      edb021:	74 29                	je     edb04c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa2462>
      edb023:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      edb027:	49 8d 55 ff          	lea    rdx,[r13-0x1]
      edb02b:	49 85 d5             	test   r13,rdx
      edb02e:	75 05                	jne    edb035 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa244b>
      edb030:	48 21 d0             	and    rax,rdx
      edb033:	eb 0d                	jmp    edb042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa2458>
      edb035:	4c 39 e8             	cmp    rax,r13
      edb038:	72 08                	jb     edb042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa2458>

### store 0x1018c95 FDE=0x101873e..0x1018f54
     1018c41:	4d 39 f5             	cmp    r13,r14
     1018c44:	72 0b                	jb     1018c51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0067>
     1018c46:	4c 89 e8             	mov    rax,r13
     1018c49:	31 d2                	xor    edx,edx
     1018c4b:	49 f7 f6             	div    r14
     1018c4e:	49 89 d5             	mov    r13,rdx
     1018c51:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     1018c58:	00 
     1018c59:	4a 8b 04 e8          	mov    rax,QWORD PTR [rax+r13*8]
     1018c5d:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
     1018c64:	00 
     1018c65:	48 85 c0             	test   rax,rax
     1018c68:	74 08                	je     1018c72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0088>
     1018c6a:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     1018c6d:	48 89 11             	mov    QWORD PTR [rcx],rdx
     1018c70:	eb 5a                	jmp    1018ccc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e00e2>
     1018c72:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     1018c79:	00 
     1018c7a:	48 89 01             	mov    QWORD PTR [rcx],rax
     1018c7d:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     1018c84:	00 
     1018c85:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     1018c8c:	00 
     1018c8d:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     1018c94:	00 
     1018c95:	4a 89 14 e8          	mov    QWORD PTR [rax+r13*8],rdx
     1018c99:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     1018c9c:	48 85 c0             	test   rax,rax
     1018c9f:	74 2e                	je     1018ccf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e00e5>
     1018ca1:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1018ca5:	49 8d 56 ff          	lea    rdx,[r14-0x1]
     1018ca9:	49 85 d6             	test   r14,rdx
     1018cac:	75 05                	jne    1018cb3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e00c9>
     1018cae:	48 21 d0             	and    rax,rdx
     1018cb1:	eb 0d                	jmp    1018cc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e00d6>
     1018cb3:	4c 39 f0             	cmp    rax,r14
     1018cb6:	72 08                	jb     1018cc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e00d6>

### store 0x106fff7 FDE=0x106fb32..0x10701e6
     106ff9f:	31 f6                	xor    esi,esi
     106ffa1:	e8 f0 f7 a2 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     106ffa6:	49 83 a6 b8 00 00 00 	and    QWORD PTR [r14+0xb8],0x0
     106ffad:	00 
     106ffae:	4d 8b ae b8 00 00 00 	mov    r13,QWORD PTR [r14+0xb8]
     106ffb5:	49 8d 45 ff          	lea    rax,[r13-0x1]
     106ffb9:	49 85 c5             	test   r13,rax
     106ffbc:	75 57                	jne    1070015 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23742b>
     106ffbe:	4c 89 fa             	mov    rdx,r15
     106ffc1:	48 21 c2             	and    rdx,rax
     106ffc4:	8b 6c 24 04          	mov    ebp,DWORD PTR [rsp+0x4]
     106ffc8:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     106ffcc:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
     106ffd0:	48 8b 9c 24 90 00 00 	mov    rbx,QWORD PTR [rsp+0x90]
     106ffd7:	00 
     106ffd8:	48 85 c0             	test   rax,rax
     106ffdb:	74 08                	je     106ffe5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2373fb>
     106ffdd:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     106ffe0:	48 89 0b             	mov    QWORD PTR [rbx],rcx
     106ffe3:	eb 5b                	jmp    1070040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237456>
     106ffe5:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     106ffea:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     106ffed:	48 89 03             	mov    QWORD PTR [rbx],rax
     106fff0:	48 89 19             	mov    QWORD PTR [rcx],rbx
     106fff3:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     106fff7:	48 89 0c d0          	mov    QWORD PTR [rax+rdx*8],rcx
     106fffb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     106fffe:	48 85 c0             	test   rax,rax
     1070001:	74 40                	je     1070043 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237459>
     1070003:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1070007:	49 8d 4d ff          	lea    rcx,[r13-0x1]
     107000b:	49 85 cd             	test   r13,rcx
     107000e:	75 1b                	jne    107002b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237441>
     1070010:	48 21 c8             	and    rax,rcx
     1070013:	eb 23                	jmp    1070038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23744e>
     1070015:	4c 89 fa             	mov    rdx,r15
     1070018:	4d 39 ef             	cmp    r15,r13

### store 0x10784af FDE=0x1077eae..0x10790ae
     107844b:	49 89 be b8 00 00 00 	mov    QWORD PTR [r14+0xb8],rdi
     1078452:	48 8b 84 24 30 01 00 	mov    rax,QWORD PTR [rsp+0x130]
     1078459:	00 
     107845a:	49 89 86 c0 00 00 00 	mov    QWORD PTR [r14+0xc0],rax
     1078461:	48 8b 94 24 38 01 00 	mov    rdx,QWORD PTR [rsp+0x138]
     1078468:	00 
     1078469:	49 89 96 c8 00 00 00 	mov    QWORD PTR [r14+0xc8],rdx
     1078470:	44 8b 84 24 40 01 00 	mov    r8d,DWORD PTR [rsp+0x140]
     1078477:	00 
     1078478:	45 89 86 d0 00 00 00 	mov    DWORD PTR [r14+0xd0],r8d
     107847f:	48 85 d2             	test   rdx,rdx
     1078482:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     1078487:	74 3a                	je     10784c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23f8d9>
     1078489:	4d 8d 86 c0 00 00 00 	lea    r8,[r14+0xc0]
     1078490:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1078494:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
     1078498:	48 85 d7             	test   rdi,rdx
     107849b:	75 05                	jne    10784a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23f8b8>
     107849d:	48 21 d0             	and    rax,rdx
     10784a0:	eb 0d                	jmp    10784af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23f8c5>
     10784a2:	48 39 f8             	cmp    rax,rdi
     10784a5:	72 08                	jb     10784af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23f8c5>
     10784a7:	31 d2                	xor    edx,edx
     10784a9:	48 f7 f7             	div    rdi
     10784ac:	48 89 d0             	mov    rax,rdx
     10784af:	4c 89 04 c1          	mov    QWORD PTR [rcx+rax*8],r8
     10784b3:	66 0f ef c0          	pxor   xmm0,xmm0
     10784b7:	48 8d 84 24 30 01 00 	lea    rax,[rsp+0x130]
     10784be:	00 
     10784bf:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     10784c3:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     10784ca:	00 
     10784cb:	8a 44 24 28          	mov    al,BYTE PTR [rsp+0x28]
     10784cf:	41 88 86 d8 00 00 00 	mov    BYTE PTR [r14+0xd8],al
     10784d6:	8a 44 24 60          	mov    al,BYTE PTR [rsp+0x60]
     10784da:	41 88 86 d9 00 00 00 	mov    BYTE PTR [r14+0xd9],al
     10784e1:	49 8d be 00 01 00 00 	lea    rdi,[r14+0x100]

### store 0x10bcb9b FDE=0x10bc716..0x10bcfda
     10bcb39:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     10bcb3c:	48 85 ff             	test   rdi,rdi
     10bcb3f:	0f 84 e2 01 00 00    	je     10bcd27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28413d>
     10bcb45:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     10bcb49:	f3 48 0f b8 f3       	popcnt rsi,rbx
     10bcb4e:	48 83 fe 01          	cmp    rsi,0x1
     10bcb52:	77 2e                	ja     10bcb82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f98>
     10bcb54:	48 8d 43 ff          	lea    rax,[rbx-0x1]
     10bcb58:	48 21 c1             	and    rcx,rax
     10bcb5b:	eb 35                	jmp    10bcb92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283fa8>
     10bcb5d:	0f 83 c4 01 00 00    	jae    10bcd27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28413d>
     10bcb63:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     10bcb68:	48 8b 80 b8 00 00 00 	mov    rax,QWORD PTR [rax+0xb8]
     10bcb6f:	48 85 c0             	test   rax,rax
     10bcb72:	0f 88 07 01 00 00    	js     10bcc7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284095>
     10bcb78:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     10bcb7d:	e9 12 01 00 00       	jmp    10bcc94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2840aa>
     10bcb82:	48 39 d9             	cmp    rcx,rbx
     10bcb85:	72 0b                	jb     10bcb92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283fa8>
     10bcb87:	48 89 c8             	mov    rax,rcx
     10bcb8a:	31 d2                	xor    edx,edx
     10bcb8c:	48 f7 f3             	div    rbx
     10bcb8f:	48 89 d1             	mov    rcx,rdx
     10bcb92:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     10bcb96:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     10bcb9b:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
     10bcb9f:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
     10bcba2:	4d 85 c0             	test   r8,r8
     10bcba5:	0f 84 7c 01 00 00    	je     10bcd27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28413d>
     10bcbab:	4c 8d 4b ff          	lea    r9,[rbx-0x1]
     10bcbaf:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
     10bcbb3:	83 fe 01             	cmp    esi,0x1
     10bcbb6:	77 05                	ja     10bcbbd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283fd3>
     10bcbb8:	4c 21 c8             	and    rax,r9
     10bcbbb:	eb 0d                	jmp    10bcbca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283fe0>
     10bcbbd:	48 39 d8             	cmp    rax,rbx
     10bcbc0:	72 08                	jb     10bcbca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283fe0>

### store 0x110457b FDE=0x1104020..0x11046fd
     1104527:	4c 39 f5             	cmp    rbp,r14
     110452a:	72 0b                	jb     1104537 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb94d>
     110452c:	48 89 e8             	mov    rax,rbp
     110452f:	31 d2                	xor    edx,edx
     1104531:	49 f7 f6             	div    r14
     1104534:	48 89 d5             	mov    rbp,rdx
     1104537:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     110453e:	00 
     110453f:	48 8b 04 e8          	mov    rax,QWORD PTR [rax+rbp*8]
     1104543:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
     110454a:	00 
     110454b:	48 85 c0             	test   rax,rax
     110454e:	74 08                	je     1104558 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb96e>
     1104550:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     1104553:	48 89 11             	mov    QWORD PTR [rcx],rdx
     1104556:	eb 5a                	jmp    11045b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb9c8>
     1104558:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     110455f:	00 
     1104560:	48 89 01             	mov    QWORD PTR [rcx],rax
     1104563:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     110456a:	00 
     110456b:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     1104572:	00 
     1104573:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     110457a:	00 
     110457b:	48 89 14 e8          	mov    QWORD PTR [rax+rbp*8],rdx
     110457f:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     1104582:	48 85 c0             	test   rax,rax
     1104585:	74 2e                	je     11045b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb9cb>
     1104587:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     110458b:	49 8d 56 ff          	lea    rdx,[r14-0x1]
     110458f:	49 85 d6             	test   r14,rdx
     1104592:	75 05                	jne    1104599 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb9af>
     1104594:	48 21 d0             	and    rax,rdx
     1104597:	eb 0d                	jmp    11045a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb9bc>
     1104599:	4c 39 f0             	cmp    rax,r14
     110459c:	72 08                	jb     11045a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb9bc>

### store 0x117e31a FDE=0x117dd70..0x117e719
     117e2b7:	48 85 ff             	test   rdi,rdi
     117e2ba:	0f 84 7e 01 00 00    	je     117e43e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345854>
     117e2c0:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     117e2c4:	f3 49 0f b8 f4       	popcnt rsi,r12
     117e2c9:	48 83 fe 01          	cmp    rsi,0x1
     117e2cd:	77 2f                	ja     117e2fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345714>
     117e2cf:	49 8d 44 24 ff       	lea    rax,[r12-0x1]
     117e2d4:	48 21 c1             	and    rcx,rax
     117e2d7:	eb 35                	jmp    117e30e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345724>
     117e2d9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     117e2de:	0f 83 5a 01 00 00    	jae    117e43e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345854>
     117e2e4:	48 8b 85 b8 00 00 00 	mov    rax,QWORD PTR [rbp+0xb8]
     117e2eb:	48 85 c0             	test   rax,rax
     117e2ee:	0f 88 a5 00 00 00    	js     117e399 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3457af>
     117e2f4:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     117e2f9:	e9 b0 00 00 00       	jmp    117e3ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3457c4>
     117e2fe:	4c 39 e1             	cmp    rcx,r12
     117e301:	72 0b                	jb     117e30e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345724>
     117e303:	48 89 c8             	mov    rax,rcx
     117e306:	31 d2                	xor    edx,edx
     117e308:	49 f7 f4             	div    r12
     117e30b:	48 89 d1             	mov    rcx,rdx
     117e30e:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     117e312:	48 8b 00             	mov    rax,QWORD PTR [rax]
     117e315:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     117e31a:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
     117e31e:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
     117e321:	4d 85 c0             	test   r8,r8
     117e324:	0f 84 14 01 00 00    	je     117e43e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345854>
     117e32a:	4d 8d 4c 24 ff       	lea    r9,[r12-0x1]
     117e32f:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
     117e333:	83 fe 01             	cmp    esi,0x1
     117e336:	77 05                	ja     117e33d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345753>
     117e338:	4c 21 c8             	and    rax,r9
     117e33b:	eb 0d                	jmp    117e34a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345760>
     117e33d:	4c 39 e0             	cmp    rax,r12
     117e340:	72 08                	jb     117e34a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345760>

### store 0x121fcaf FDE=0x121fc00..0x121ffd1
     121fc47:	00 
     121fc48:	49 8b 86 b0 00 00 00 	mov    rax,QWORD PTR [r14+0xb0]
     121fc4f:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     121fc56:	49 8b 8e b8 00 00 00 	mov    rcx,QWORD PTR [r14+0xb8]
     121fc5d:	48 89 8b b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rcx
     121fc64:	41 8b 96 c0 00 00 00 	mov    edx,DWORD PTR [r14+0xc0]
     121fc6b:	89 93 c0 00 00 00    	mov    DWORD PTR [rbx+0xc0],edx
     121fc71:	48 85 c9             	test   rcx,rcx
     121fc74:	74 43                	je     121fcb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6523d>
     121fc76:	b9 b0 00 00 00       	mov    ecx,0xb0
     121fc7b:	48 8d 34 0b          	lea    rsi,[rbx+rcx*1]
     121fc7f:	4c 01 f1             	add    rcx,r14
     121fc82:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     121fc86:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
     121fc8d:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
     121fc91:	48 85 d7             	test   rdi,rdx
     121fc94:	75 05                	jne    121fc9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6521f>
     121fc96:	48 21 d0             	and    rax,rdx
     121fc99:	eb 0d                	jmp    121fca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6522c>
     121fc9b:	48 39 f8             	cmp    rax,rdi
     121fc9e:	72 08                	jb     121fca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6522c>
     121fca0:	31 d2                	xor    edx,edx
     121fca2:	48 f7 f7             	div    rdi
     121fca5:	48 89 d0             	mov    rax,rdx
     121fca8:	48 8b 93 a0 00 00 00 	mov    rdx,QWORD PTR [rbx+0xa0]
     121fcaf:	48 89 34 c2          	mov    QWORD PTR [rdx+rax*8],rsi
     121fcb3:	0f 57 c0             	xorps  xmm0,xmm0
     121fcb6:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     121fcb9:	be c8 00 00 00       	mov    esi,0xc8
     121fcbe:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     121fcc2:	4c 01 f6             	add    rsi,r14
     121fcc5:	e8 72 f3 91 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
     121fcca:	be f0 00 00 00       	mov    esi,0xf0
     121fccf:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     121fcd3:	4c 01 f6             	add    rsi,r14
     121fcd6:	e8 61 f3 91 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
     121fcdb:	49 8b 86 18 01 00 00 	mov    rax,QWORD PTR [r14+0x118]

### store 0x12200d1 FDE=0x121ffd2..0x12204ae
     1220071:	48 89 8b b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rcx
     1220078:	f3 41 0f 10 86 c0 00 	movss  xmm0,DWORD PTR [r14+0xc0]
     122007f:	00 00 
     1220081:	f3 0f 11 83 c0 00 00 	movss  DWORD PTR [rbx+0xc0],xmm0
     1220088:	00 
     1220089:	49 8b 86 b0 00 00 00 	mov    rax,QWORD PTR [r14+0xb0]
     1220090:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     1220097:	48 85 c9             	test   rcx,rcx
     122009a:	74 3f                	je     12200db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6565f>
     122009c:	be b0 00 00 00       	mov    esi,0xb0
     12200a1:	49 8d 0c 36          	lea    rcx,[r14+rsi*1]
     12200a5:	48 01 de             	add    rsi,rbx
     12200a8:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     12200ac:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
     12200b3:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
     12200b7:	48 85 d7             	test   rdi,rdx
     12200ba:	75 05                	jne    12200c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65645>
     12200bc:	48 21 d0             	and    rax,rdx
     12200bf:	eb 0d                	jmp    12200ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65652>
     12200c1:	48 39 f8             	cmp    rax,rdi
     12200c4:	72 08                	jb     12200ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65652>
     12200c6:	31 d2                	xor    edx,edx
     12200c8:	48 f7 f7             	div    rdi
     12200cb:	48 89 d0             	mov    rax,rdx
     12200ce:	49 8b 17             	mov    rdx,QWORD PTR [r15]
     12200d1:	48 89 34 c2          	mov    QWORD PTR [rdx+rax*8],rsi
     12200d5:	0f 57 c0             	xorps  xmm0,xmm0
     12200d8:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     12200db:	be c8 00 00 00       	mov    esi,0xc8
     12200e0:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     12200e4:	4c 01 f6             	add    rsi,r14
     12200e7:	e8 08 48 00 00       	call   12248f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69e78>
     12200ec:	be f0 00 00 00       	mov    esi,0xf0
     12200f1:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     12200f5:	4c 01 f6             	add    rsi,r14
     12200f8:	e8 b3 48 00 00       	call   12249b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69f34>
     12200fd:	4c 8d bb 18 01 00 00 	lea    r15,[rbx+0x118]

### store 0x1240a74 FDE=0x123c81c..0x1240fd8
     1240a17:	48 8b 94 24 c0 00 00 	mov    rdx,QWORD PTR [rsp+0xc0]
     1240a1e:	00 
     1240a1f:	48 89 93 28 09 00 00 	mov    QWORD PTR [rbx+0x928],rdx
     1240a26:	f3 0f 10 84 24 c8 00 	movss  xmm0,DWORD PTR [rsp+0xc8]
     1240a2d:	00 00 
     1240a2f:	f3 0f 11 83 30 09 00 	movss  DWORD PTR [rbx+0x930],xmm0
     1240a36:	00 
     1240a37:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     1240a3e:	00 
     1240a3f:	48 89 83 20 09 00 00 	mov    QWORD PTR [rbx+0x920],rax
     1240a46:	48 85 d2             	test   rdx,rdx
     1240a49:	74 35                	je     1240a80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86004>
     1240a4b:	48 81 c3 20 09 00 00 	add    rbx,0x920
     1240a52:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1240a56:	48 8d 51 ff          	lea    rdx,[rcx-0x1]
     1240a5a:	48 85 d1             	test   rcx,rdx
     1240a5d:	75 05                	jne    1240a64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85fe8>
     1240a5f:	48 21 d0             	and    rax,rdx
     1240a62:	eb 0d                	jmp    1240a71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85ff5>
     1240a64:	48 39 c8             	cmp    rax,rcx
     1240a67:	72 08                	jb     1240a71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85ff5>
     1240a69:	31 d2                	xor    edx,edx
     1240a6b:	48 f7 f1             	div    rcx
     1240a6e:	48 89 d0             	mov    rax,rdx
     1240a71:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
     1240a74:	48 89 1c c1          	mov    QWORD PTR [rcx+rax*8],rbx
     1240a78:	0f 57 c0             	xorps  xmm0,xmm0
     1240a7b:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     1240a80:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1240a87:	00 
     1240a88:	e8 cf c1 fe ff       	call   122cc5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x721e0>
     1240a8d:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1240a94:	00 
     1240a95:	e8 c2 c1 fe ff       	call   122cc5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x721e0>
     1240a9a:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     1240a9f:	e9 fb f9 ff ff       	jmp    124049f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85a23>
     1240aa4:	eb 00                	jmp    1240aa6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8602a>

### store 0x1291475 FDE=0x1290ebb..0x1291a0f
     1291416:	0f 84 92 01 00 00    	je     12915ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd6b32>
     129141c:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     1291420:	f3 49 0f b8 f7       	popcnt rsi,r15
     1291425:	48 83 fe 01          	cmp    rsi,0x1
     1291429:	77 2a                	ja     1291455 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd69d9>
     129142b:	49 8d 47 ff          	lea    rax,[r15-0x1]
     129142f:	48 21 c1             	and    rcx,rax
     1291432:	eb 31                	jmp    1291465 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd69e9>
     1291434:	0f 83 74 01 00 00    	jae    12915ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd6b32>
     129143a:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     1291441:	00 
     1291442:	48 85 c0             	test   rax,rax
     1291445:	0f 88 bd 00 00 00    	js     1291508 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd6a8c>
     129144b:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     1291450:	e9 c8 00 00 00       	jmp    129151d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd6aa1>
     1291455:	4c 39 f9             	cmp    rcx,r15
     1291458:	72 0b                	jb     1291465 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd69e9>
     129145a:	48 89 c8             	mov    rax,rcx
     129145d:	31 d2                	xor    edx,edx
     129145f:	49 f7 f7             	div    r15
     1291462:	48 89 d1             	mov    rcx,rdx
     1291465:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     129146c:	00 
     129146d:	48 8d 94 24 b0 00 00 	lea    rdx,[rsp+0xb0]
     1291474:	00 
     1291475:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
     1291479:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
     129147c:	4d 85 c0             	test   r8,r8
     129147f:	0f 84 29 01 00 00    	je     12915ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd6b32>
     1291485:	4d 8d 4f ff          	lea    r9,[r15-0x1]
     1291489:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
     129148d:	83 fe 01             	cmp    esi,0x1
     1291490:	77 05                	ja     1291497 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd6a1b>
     1291492:	4c 21 c8             	and    rax,r9
     1291495:	eb 0d                	jmp    12914a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd6a28>
     1291497:	4c 39 f8             	cmp    rax,r15
     129149a:	72 08                	jb     12914a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd6a28>

### store 0x12d8f3c FDE=0x12d8d24..0x12d90a9
     12d8edf:	48 89 8b b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rcx
     12d8ee6:	f3 0f 10 84 24 c8 00 	movss  xmm0,DWORD PTR [rsp+0xc8]
     12d8eed:	00 00 
     12d8eef:	f3 0f 11 83 b8 05 00 	movss  DWORD PTR [rbx+0x5b8],xmm0
     12d8ef6:	00 
     12d8ef7:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     12d8efe:	00 
     12d8eff:	48 89 83 a8 05 00 00 	mov    QWORD PTR [rbx+0x5a8],rax
     12d8f06:	48 85 c9             	test   rcx,rcx
     12d8f09:	74 3b                	je     12d8f46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e4ca>
     12d8f0b:	48 8d 8c 24 b8 00 00 	lea    rcx,[rsp+0xb8]
     12d8f12:	00 
     12d8f13:	48 8d b3 a8 05 00 00 	lea    rsi,[rbx+0x5a8]
     12d8f1a:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     12d8f1e:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
     12d8f22:	48 85 d7             	test   rdi,rdx
     12d8f25:	75 05                	jne    12d8f2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e4b0>
     12d8f27:	48 21 d0             	and    rax,rdx
     12d8f2a:	eb 0d                	jmp    12d8f39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e4bd>
     12d8f2c:	48 39 f8             	cmp    rax,rdi
     12d8f2f:	72 08                	jb     12d8f39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e4bd>
     12d8f31:	31 d2                	xor    edx,edx
     12d8f33:	48 f7 f7             	div    rdi
     12d8f36:	48 89 d0             	mov    rax,rdx
     12d8f39:	49 8b 16             	mov    rdx,QWORD PTR [r14]
     12d8f3c:	48 89 34 c2          	mov    QWORD PTR [rdx+rax*8],rsi
     12d8f40:	0f 57 c0             	xorps  xmm0,xmm0
     12d8f43:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     12d8f46:	4c 8d b3 c0 05 00 00 	lea    r14,[rbx+0x5c0]
     12d8f4d:	48 83 bb d8 05 00 00 	cmp    QWORD PTR [rbx+0x5d8],0x0
     12d8f54:	00 
     12d8f55:	74 3a                	je     12d8f91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e515>
     12d8f57:	48 8b bb d0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5d0]
     12d8f5e:	e8 8b 95 80 ff       	call   ae24ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f48e>
     12d8f63:	48 83 a3 d0 05 00 00 	and    QWORD PTR [rbx+0x5d0],0x0
     12d8f6a:	00 
     12d8f6b:	48 8b 83 c8 05 00 00 	mov    rax,QWORD PTR [rbx+0x5c8]

### store 0x1317daf FDE=0x131798e..0x1317e8e
     1317d61:	48 89 e9             	mov    rcx,rbp
     1317d64:	48 85 c3             	test   rbx,rax
     1317d67:	75 05                	jne    1317d6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d2f2>
     1317d69:	49 21 c7             	and    r15,rax
     1317d6c:	eb 10                	jmp    1317d7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d302>
     1317d6e:	49 39 df             	cmp    r15,rbx
     1317d71:	72 0b                	jb     1317d7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d302>
     1317d73:	4c 89 f8             	mov    rax,r15
     1317d76:	31 d2                	xor    edx,edx
     1317d78:	48 f7 f3             	div    rbx
     1317d7b:	49 89 d7             	mov    r15,rdx
     1317d7e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1317d81:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     1317d85:	48 8b ac 24 b8 00 00 	mov    rbp,QWORD PTR [rsp+0xb8]
     1317d8c:	00 
     1317d8d:	48 85 c0             	test   rax,rax
     1317d90:	74 0e                	je     1317da0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d324>
     1317d92:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1317d95:	48 89 4d 00          	mov    QWORD PTR [rbp+0x0],rcx
     1317d99:	44 8b 7c 24 04       	mov    r15d,DWORD PTR [rsp+0x4]
     1317d9e:	eb 47                	jmp    1317de7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d36b>
     1317da0:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1317da4:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1317da8:	49 89 6e 10          	mov    QWORD PTR [r14+0x10],rbp
     1317dac:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1317daf:	4a 89 0c f8          	mov    QWORD PTR [rax+r15*8],rcx
     1317db3:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1317db7:	48 85 c0             	test   rax,rax
     1317dba:	44 8b 7c 24 04       	mov    r15d,DWORD PTR [rsp+0x4]
     1317dbf:	74 29                	je     1317dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d36e>
     1317dc1:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1317dc5:	48 8d 4b ff          	lea    rcx,[rbx-0x1]
     1317dc9:	48 85 cb             	test   rbx,rcx
     1317dcc:	75 05                	jne    1317dd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d357>
     1317dce:	48 21 c8             	and    rax,rcx
     1317dd1:	eb 0d                	jmp    1317de0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d364>
     1317dd3:	48 39 d8             	cmp    rax,rbx

### store 0x1322c0b FDE=0x1322354..0x1322edc
     1322bb5:	49 85 cf             	test   r15,rcx
     1322bb8:	75 7b                	jne    1322c35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681b9>
     1322bba:	48 21 c8             	and    rax,rcx
     1322bbd:	e9 80 00 00 00       	jmp    1322c42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681c6>
     1322bc2:	4c 39 fd             	cmp    rbp,r15
     1322bc5:	72 0b                	jb     1322bd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168156>
     1322bc7:	48 89 e8             	mov    rax,rbp
     1322bca:	31 d2                	xor    edx,edx
     1322bcc:	49 f7 f7             	div    r15
     1322bcf:	48 89 d5             	mov    rbp,rdx
     1322bd2:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
     1322bd9:	00 
     1322bda:	48 8b 04 e9          	mov    rax,QWORD PTR [rcx+rbp*8]
     1322bde:	48 85 c0             	test   rax,rax
     1322be1:	74 0c                	je     1322bef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168173>
     1322be3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1322be6:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
     1322bea:	e9 dc 00 00 00       	jmp    1322ccb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16824f>
     1322bef:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     1322bf6:	00 
     1322bf7:	49 89 04 24          	mov    QWORD PTR [r12],rax
     1322bfb:	4c 89 a4 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],r12
     1322c02:	00 
     1322c03:	48 8d 84 24 c8 00 00 	lea    rax,[rsp+0xc8]
     1322c0a:	00 
     1322c0b:	48 89 04 e9          	mov    QWORD PTR [rcx+rbp*8],rax
     1322c0f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1322c13:	48 85 c0             	test   rax,rax
     1322c16:	0f 84 b2 00 00 00    	je     1322cce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168252>
     1322c1c:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1322c20:	49 8d 4f ff          	lea    rcx,[r15-0x1]
     1322c24:	49 85 cf             	test   r15,rcx
     1322c27:	0f 85 85 00 00 00    	jne    1322cb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168236>
     1322c2d:	48 21 c8             	and    rax,rcx
     1322c30:	e9 8a 00 00 00       	jmp    1322cbf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168243>
     1322c35:	4c 39 f8             	cmp    rax,r15
     1322c38:	72 08                	jb     1322c42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681c6>

### store 0x13505f0 FDE=0x135000c..0x13506fa
     13505a6:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     13505aa:	48 85 c5             	test   rbp,rax
     13505ad:	75 05                	jne    13505b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b38>
     13505af:	49 21 c7             	and    r15,rax
     13505b2:	eb 10                	jmp    13505c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b48>
     13505b4:	49 39 ef             	cmp    r15,rbp
     13505b7:	72 0b                	jb     13505c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b48>
     13505b9:	4c 89 f8             	mov    rax,r15
     13505bc:	31 d2                	xor    edx,edx
     13505be:	48 f7 f5             	div    rbp
     13505c1:	49 89 d7             	mov    r15,rdx
     13505c4:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13505c7:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     13505cb:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
     13505d2:	00 
     13505d3:	48 85 c0             	test   rax,rax
     13505d6:	74 08                	je     13505e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b64>
     13505d8:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     13505db:	48 89 11             	mov    QWORD PTR [rcx],rdx
     13505de:	eb 42                	jmp    1350622 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195ba6>
     13505e0:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
     13505e4:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     13505e7:	48 89 01             	mov    QWORD PTR [rcx],rax
     13505ea:	48 89 0a             	mov    QWORD PTR [rdx],rcx
     13505ed:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13505f0:	4a 89 14 f8          	mov    QWORD PTR [rax+r15*8],rdx
     13505f4:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     13505f7:	48 85 c0             	test   rax,rax
     13505fa:	74 29                	je     1350625 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195ba9>
     13505fc:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1350600:	48 8d 55 ff          	lea    rdx,[rbp-0x1]
     1350604:	48 85 d5             	test   rbp,rdx
     1350607:	75 05                	jne    135060e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b92>
     1350609:	48 21 d0             	and    rax,rdx
     135060c:	eb 0d                	jmp    135061b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b9f>
     135060e:	48 39 e8             	cmp    rax,rbp
     1350611:	72 08                	jb     135061b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b9f>

### store 0x14018fa FDE=0x1401885..0x1401941
     14018a0:	e8 eb d2 3e 00       	call   17eeb90 <memset@plt>
     14018a5:	4c 89 73 68          	mov    QWORD PTR [rbx+0x68],r14
     14018a9:	48 83 63 70 00       	and    QWORD PTR [rbx+0x70],0x0
     14018ae:	41 83 3e 00          	cmp    DWORD PTR [r14],0x0
     14018b2:	74 7e                	je     1401932 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246eb6>
     14018b4:	6a 01                	push   0x1
     14018b6:	41 5e                	pop    r14
     14018b8:	be 88 00 00 00       	mov    esi,0x88
     14018bd:	4c 89 f7             	mov    rdi,r14
     14018c0:	e8 fb d2 3e 00       	call   17eebc0 <calloc@plt>
     14018c5:	49 89 c7             	mov    r15,rax
     14018c8:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     14018cf:	c7 40 08 00 3c 1c c6 	mov    DWORD PTR [rax+0x8],0xc61c3c00
     14018d6:	48 83 c3 08          	add    rbx,0x8
     14018da:	31 ed                	xor    ebp,ebp
     14018dc:	6a 28                	push   0x28
     14018de:	41 5c                	pop    r12
     14018e0:	48 83 fd 07          	cmp    rbp,0x7
     14018e4:	74 1b                	je     1401901 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246e85>
     14018e6:	48 83 fd 0f          	cmp    rbp,0xf
     14018ea:	74 46                	je     1401932 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246eb6>
     14018ec:	4c 89 f7             	mov    rdi,r14
     14018ef:	4c 89 e6             	mov    rsi,r12
     14018f2:	e8 c9 d2 3e 00       	call   17eebc0 <calloc@plt>
     14018f7:	49 89 c5             	mov    r13,rax
     14018fa:	49 89 44 ef 10       	mov    QWORD PTR [r15+rbp*8+0x10],rax
     14018ff:	eb 07                	jmp    1401908 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246e8c>
     1401901:	49 89 5f 48          	mov    QWORD PTR [r15+0x48],rbx
     1401905:	49 89 dd             	mov    r13,rbx
     1401908:	0f 57 c0             	xorps  xmm0,xmm0
     140190b:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     1401910:	bf 00 01 00 00       	mov    edi,0x100
     1401915:	e8 e6 d2 3e 00       	call   17eec00 <malloc@plt>
     140191a:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
     140191e:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     1401922:	c6 00 00             	mov    BYTE PTR [rax],0x0
     1401925:	49 c7 45 20 00 01 00 	mov    QWORD PTR [r13+0x20],0x100

### store 0x157cc35 FDE=0x157c6d8..0x157d029
     157cbdf:	72 0b                	jb     157cbec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c2170>
     157cbe1:	4c 89 e0             	mov    rax,r12
     157cbe4:	31 d2                	xor    edx,edx
     157cbe6:	49 f7 f7             	div    r15
     157cbe9:	49 89 d4             	mov    r12,rdx
     157cbec:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     157cbf3:	00 
     157cbf4:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
     157cbf8:	4c 8b b4 24 b8 00 00 	mov    r14,QWORD PTR [rsp+0xb8]
     157cbff:	00 
     157cc00:	48 85 c0             	test   rax,rax
     157cc03:	74 0d                	je     157cc12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c2196>
     157cc05:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     157cc08:	49 89 0e             	mov    QWORD PTR [r14],rcx
     157cc0b:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
     157cc10:	eb 5f                	jmp    157cc71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c21f5>
     157cc12:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
     157cc19:	00 
     157cc1a:	49 89 06             	mov    QWORD PTR [r14],rax
     157cc1d:	4c 89 b4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r14
     157cc24:	00 
     157cc25:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     157cc2c:	00 
     157cc2d:	48 8d 8c 24 e0 00 00 	lea    rcx,[rsp+0xe0]
     157cc34:	00 
     157cc35:	4a 89 0c e0          	mov    QWORD PTR [rax+r12*8],rcx
     157cc39:	49 8b 06             	mov    rax,QWORD PTR [r14]
     157cc3c:	48 85 c0             	test   rax,rax
     157cc3f:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
     157cc44:	74 2e                	je     157cc74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c21f8>
     157cc46:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     157cc4a:	49 8d 4f ff          	lea    rcx,[r15-0x1]
     157cc4e:	49 85 cf             	test   r15,rcx
     157cc51:	75 05                	jne    157cc58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c21dc>
     157cc53:	48 21 c8             	and    rax,rcx
     157cc56:	eb 0d                	jmp    157cc65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c21e9>
     157cc58:	4c 39 f8             	cmp    rax,r15

### store 0x1655911 FDE=0x1655624..0x1655c05
     16558af:	41 89 4e 78          	mov    DWORD PTR [r14+0x78],ecx
     16558b3:	4c 8b 3c f0          	mov    r15,QWORD PTR [rax+rsi*8]
     16558b7:	4c 89 ff             	mov    rdi,r15
     16558ba:	48 89 de             	mov    rsi,rbx
     16558bd:	e8 c4 4a 00 00       	call   165a386 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4f2>
     16558c2:	84 c0                	test   al,al
     16558c4:	75 cb                	jne    1655891 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99fd>
     16558c6:	e9 f7 fd ff ff       	jmp    16556c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x982e>
     16558cb:	41 3b 76 7c          	cmp    esi,DWORD PTR [r14+0x7c]
     16558cf:	75 13                	jne    16558e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a50>
     16558d1:	ff c6                	inc    esi
     16558d3:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     16558d8:	e8 bb 04 6c ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>
     16558dd:	41 8b 86 80 00 00 00 	mov    eax,DWORD PTR [r14+0x80]
     16558e4:	ff c0                	inc    eax
     16558e6:	41 89 86 80 00 00 00 	mov    DWORD PTR [r14+0x80],eax
     16558ed:	bf 90 00 00 00       	mov    edi,0x90
     16558f2:	e8 09 86 19 00       	call   17edf00 <_Znwm@plt>
     16558f7:	49 89 c7             	mov    r15,rax
     16558fa:	48 89 c7             	mov    rdi,rax
     16558fd:	e8 8a 0a 00 00       	call   165638c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4f8>
     1655902:	49 8b 46 70          	mov    rax,QWORD PTR [r14+0x70]
     1655906:	41 8b 4e 78          	mov    ecx,DWORD PTR [r14+0x78]
     165590a:	8d 51 01             	lea    edx,[rcx+0x1]
     165590d:	41 89 56 78          	mov    DWORD PTR [r14+0x78],edx
     1655911:	4c 89 3c c8          	mov    QWORD PTR [rax+rcx*8],r15
     1655915:	eb a0                	jmp    16558b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a23>
     1655917:	48 89 df             	mov    rdi,rbx
     165591a:	6a 04                	push   0x4
     165591c:	5e                   	pop    rsi
     165591d:	e8 36 68 00 00       	call   165c158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102c4>
     1655922:	89 c5                	mov    ebp,eax
     1655924:	ff c5                	inc    ebp
     1655926:	ff cd                	dec    ebp
     1655928:	0f 8e 94 fd ff ff    	jle    16556c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x982e>
     165592e:	41 8b b6 b0 00 00 00 	mov    esi,DWORD PTR [r14+0xb0]
     1655935:	41 8b 86 b8 00 00 00 	mov    eax,DWORD PTR [r14+0xb8]

### store 0x16559bb FDE=0x1655624..0x1655c05
     165594a:	41 89 8e b0 00 00 00 	mov    DWORD PTR [r14+0xb0],ecx
     1655951:	4c 8b 3c f0          	mov    r15,QWORD PTR [rax+rsi*8]
     1655955:	4c 89 ff             	mov    rdi,r15
     1655958:	48 89 de             	mov    rsi,rbx
     165595b:	e8 0e 44 00 00       	call   1659d6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdeda>
     1655960:	84 c0                	test   al,al
     1655962:	75 c2                	jne    1655926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a92>
     1655964:	e9 59 fd ff ff       	jmp    16556c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x982e>
     1655969:	41 3b b6 b4 00 00 00 	cmp    esi,DWORD PTR [r14+0xb4]
     1655970:	75 13                	jne    1655985 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9af1>
     1655972:	ff c6                	inc    esi
     1655974:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1655979:	e8 1a 04 6c ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>
     165597e:	41 8b 86 b8 00 00 00 	mov    eax,DWORD PTR [r14+0xb8]
     1655985:	ff c0                	inc    eax
     1655987:	41 89 86 b8 00 00 00 	mov    DWORD PTR [r14+0xb8],eax
     165598e:	bf 28 01 00 00       	mov    edi,0x128
     1655993:	e8 68 85 19 00       	call   17edf00 <_Znwm@plt>
     1655998:	49 89 c7             	mov    r15,rax
     165599b:	48 89 c7             	mov    rdi,rax
     165599e:	e8 47 0a 00 00       	call   16563ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa556>
     16559a3:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
     16559aa:	41 8b 8e b0 00 00 00 	mov    ecx,DWORD PTR [r14+0xb0]
     16559b1:	8d 51 01             	lea    edx,[rcx+0x1]
     16559b4:	41 89 96 b0 00 00 00 	mov    DWORD PTR [r14+0xb0],edx
     16559bb:	4c 89 3c c8          	mov    QWORD PTR [rax+rcx*8],r15
     16559bf:	eb 94                	jmp    1655955 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ac1>
     16559c1:	48 89 df             	mov    rdi,rbx
     16559c4:	6a 04                	push   0x4
     16559c6:	5e                   	pop    rsi
     16559c7:	e8 8c 67 00 00       	call   165c158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102c4>
     16559cc:	89 c5                	mov    ebp,eax
     16559ce:	ff c5                	inc    ebp
     16559d0:	ff cd                	dec    ebp
     16559d2:	0f 8e ea fc ff ff    	jle    16556c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x982e>
     16559d8:	41 8b b6 e8 00 00 00 	mov    esi,DWORD PTR [r14+0xe8]
     16559df:	41 8b 86 f0 00 00 00 	mov    eax,DWORD PTR [r14+0xf0]

### store 0x1655fbd FDE=0x1655e66..0x165638b
     1655f4e:	4a 8b 34 f8          	mov    rsi,QWORD PTR [rax+r15*8]
     1655f52:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1655f55:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1655f58:	49 ff c7             	inc    r15
     1655f5b:	8b 43 78             	mov    eax,DWORD PTR [rbx+0x78]
     1655f5e:	49 39 c7             	cmp    r15,rax
     1655f61:	72 d6                	jb     1655f39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0a5>
     1655f63:	49 8d be a8 00 00 00 	lea    rdi,[r14+0xa8]
     1655f6a:	8b ab b0 00 00 00    	mov    ebp,DWORD PTR [rbx+0xb0]
     1655f70:	41 03 ae b0 00 00 00 	add    ebp,DWORD PTR [r14+0xb0]
     1655f77:	89 ee                	mov    esi,ebp
     1655f79:	e8 1a fe 6b ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>
     1655f7e:	41 39 ae b0 00 00 00 	cmp    DWORD PTR [r14+0xb0],ebp
     1655f85:	73 3c                	jae    1655fc3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa12f>
     1655f87:	41 39 ae b8 00 00 00 	cmp    DWORD PTR [r14+0xb8],ebp
     1655f8e:	73 58                	jae    1655fe8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa154>
     1655f90:	bf 28 01 00 00       	mov    edi,0x128
     1655f95:	e8 66 7f 19 00       	call   17edf00 <_Znwm@plt>
     1655f9a:	49 89 c7             	mov    r15,rax
     1655f9d:	48 89 c7             	mov    rdi,rax
     1655fa0:	e8 45 04 00 00       	call   16563ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa556>
     1655fa5:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
     1655fac:	41 8b 8e b8 00 00 00 	mov    ecx,DWORD PTR [r14+0xb8]
     1655fb3:	8d 51 01             	lea    edx,[rcx+0x1]
     1655fb6:	41 89 96 b8 00 00 00 	mov    DWORD PTR [r14+0xb8],edx
     1655fbd:	4c 89 3c c8          	mov    QWORD PTR [rax+rcx*8],r15
     1655fc1:	eb c4                	jmp    1655f87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0f3>
     1655fc3:	74 23                	je     1655fe8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa154>
     1655fc5:	41 89 ef             	mov    r15d,ebp
     1655fc8:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
     1655fcf:	44 89 f9             	mov    ecx,r15d
     1655fd2:	48 8b 3c c8          	mov    rdi,QWORD PTR [rax+rcx*8]
     1655fd6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1655fd9:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1655fdc:	41 ff c7             	inc    r15d
     1655fdf:	45 3b be b0 00 00 00 	cmp    r15d,DWORD PTR [r14+0xb0]
     1655fe6:	75 e0                	jne    1655fc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa134>

### store 0x1706d5d FDE=0x1705cc6..0x1707cdc
     1706cfd:	00 
     1706cfe:	49 89 5e 70          	mov    QWORD PTR [r14+0x70],rbx
     1706d02:	48 89 e8             	mov    rax,rbp
     1706d05:	48 81 c5 a8 00 00 00 	add    rbp,0xa8
     1706d0c:	83 b8 b0 00 00 00 00 	cmp    DWORD PTR [rax+0xb0],0x0
     1706d13:	0f 8e 11 01 00 00    	jle    1706e2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbaf96>
     1706d19:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1706d1e:	48 05 00 01 00 00    	add    rax,0x100
     1706d24:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1706d29:	6a 08                	push   0x8
     1706d2b:	41 5c                	pop    r12
     1706d2d:	31 db                	xor    ebx,ebx
     1706d2f:	6a 01                	push   0x1
     1706d31:	41 5e                	pop    r14
     1706d33:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1706d37:	a8 01                	test   al,0x1
     1706d39:	4a 8d 44 20 ff       	lea    rax,[rax+r12*1-0x1]
     1706d3e:	48 0f 44 c5          	cmove  rax,rbp
     1706d42:	4c 8b 28             	mov    r13,QWORD PTR [rax]
     1706d45:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     1706d4c:	00 
     1706d4d:	4c 8b 78 70          	mov    r15,QWORD PTR [rax+0x70]
     1706d51:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
     1706d58:	00 
     1706d59:	41 8b 45 18          	mov    eax,DWORD PTR [r13+0x18]
     1706d5d:	41 89 04 df          	mov    DWORD PTR [r15+rbx*8],eax
     1706d61:	41 8b 4d 1c          	mov    ecx,DWORD PTR [r13+0x1c]
     1706d65:	41 89 4c df 04       	mov    DWORD PTR [r15+rbx*8+0x4],ecx
     1706d6a:	85 c0                	test   eax,eax
     1706d6c:	7f 5f                	jg     1706dcd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbaf39>
     1706d6e:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1706d73:	48 8d b4 24 08 01 00 	lea    rsi,[rsp+0x108]
     1706d7a:	00 
     1706d7b:	e8 02 e8 01 00       	call   1725582 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd96ee>
     1706d80:	41 8b 14 df          	mov    edx,DWORD PTR [r15+rbx*8]
     1706d84:	41 8b 4c df 04       	mov    ecx,DWORD PTR [r15+rbx*8+0x4]
     1706d89:	48 89 c7             	mov    rdi,rax

### store 0x1706d65 FDE=0x1705cc6..0x1707cdc
     1706d02:	48 89 e8             	mov    rax,rbp
     1706d05:	48 81 c5 a8 00 00 00 	add    rbp,0xa8
     1706d0c:	83 b8 b0 00 00 00 00 	cmp    DWORD PTR [rax+0xb0],0x0
     1706d13:	0f 8e 11 01 00 00    	jle    1706e2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbaf96>
     1706d19:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1706d1e:	48 05 00 01 00 00    	add    rax,0x100
     1706d24:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1706d29:	6a 08                	push   0x8
     1706d2b:	41 5c                	pop    r12
     1706d2d:	31 db                	xor    ebx,ebx
     1706d2f:	6a 01                	push   0x1
     1706d31:	41 5e                	pop    r14
     1706d33:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1706d37:	a8 01                	test   al,0x1
     1706d39:	4a 8d 44 20 ff       	lea    rax,[rax+r12*1-0x1]
     1706d3e:	48 0f 44 c5          	cmove  rax,rbp
     1706d42:	4c 8b 28             	mov    r13,QWORD PTR [rax]
     1706d45:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     1706d4c:	00 
     1706d4d:	4c 8b 78 70          	mov    r15,QWORD PTR [rax+0x70]
     1706d51:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
     1706d58:	00 
     1706d59:	41 8b 45 18          	mov    eax,DWORD PTR [r13+0x18]
     1706d5d:	41 89 04 df          	mov    DWORD PTR [r15+rbx*8],eax
     1706d61:	41 8b 4d 1c          	mov    ecx,DWORD PTR [r13+0x1c]
     1706d65:	41 89 4c df 04       	mov    DWORD PTR [r15+rbx*8+0x4],ecx
     1706d6a:	85 c0                	test   eax,eax
     1706d6c:	7f 5f                	jg     1706dcd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbaf39>
     1706d6e:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1706d73:	48 8d b4 24 08 01 00 	lea    rsi,[rsp+0x108]
     1706d7a:	00 
     1706d7b:	e8 02 e8 01 00       	call   1725582 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd96ee>
     1706d80:	41 8b 14 df          	mov    edx,DWORD PTR [r15+rbx*8]
     1706d84:	41 8b 4c df 04       	mov    ecx,DWORD PTR [r15+rbx*8+0x4]
     1706d89:	48 89 c7             	mov    rdi,rax
     1706d8c:	4c 89 ee             	mov    rsi,r13
     1706d8f:	e8 60 e9 01 00       	call   17256f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9860>

