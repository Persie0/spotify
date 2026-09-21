# Smart Skip accessor IDs

## primary b632ca

/tmp/accessids/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>:
  b632ca:	53                   	push   rbx
  b632cb:	48 89 fb             	mov    rbx,rdi
  b632ce:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b632d2:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b632d6:	6a 2f                	push   0x2f
  b632d8:	5a                   	pop    rdx
  b632d9:	e8 00 f0 ff ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b632de:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b632e1:	48 8b 80 78 01 00 00 	mov    rax,QWORD PTR [rax+0x178]
  b632e8:	48 85 c0             	test   rax,rax
  b632eb:	74 02                	je     b632ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb028f>
  b632ed:	5b                   	pop    rbx
  b632ee:	c3                   	ret
  b632ef:	e8 cb 6c f1 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b632f4:	53                   	push   rbx
  b632f5:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  b632f8:	48 89 37             	mov    QWORD PTR [rdi],rsi
  b632fb:	48 85 db             	test   rbx,rbx
  b632fe:	74 13                	je     b63313 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02b3>
  b63300:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b63303:	48 89 df             	mov    rdi,rbx
  b63306:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b63309:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b6330c:	48 89 df             	mov    rdi,rbx
  b6330f:	5b                   	pop    rbx
  b63310:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
  b63313:	5b                   	pop    rbx
  b63314:	c3                   	ret
  b63315:	48 89 c7             	mov    rdi,rax
  b63318:	e8 88 67 f1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b6331d:	cc                   	int3
  b6331e:	31 f6                	xor    esi,esi
  b63320:	e9 cf ff ff ff       	jmp    b632f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0294>
  b63325:	cc                   	int3
  b63326:	48 8d 35 23 c6 83 ff 	lea    rsi,[rip+0xffffffffff83c623]        # 39f950 <_ZTSN5boost9exceptionE@@Base+0x332>
  b6332d:	48 8d 0d 3c c6 83 ff 	lea    rcx,[rip+0xffffffffff83c63c]        # 39f970 <_ZTSN5boost9exceptionE@@Base+0x352>
  b63334:	6a 11                	push   0x11
  b63336:	5a                   	pop    rdx
  b63337:	6a 1b                	push   0x1b
  b63339:	41 58                	pop    r8
  b6333b:	6a 01                	push   0x1
  b6333d:	41 59                	pop    r9
  b6333f:	e9 46 40 a8 00       	jmp    15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>

## fallback b9150c

/tmp/accessids/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>:
  b9150c:	53                   	push   rbx
  b9150d:	48 89 fb             	mov    rbx,rdi
  b91510:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b91514:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b91518:	6a 32                	push   0x32
  b9151a:	5a                   	pop    rdx
  b9151b:	e8 be 0d fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b91520:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b91523:	48 8b 80 90 01 00 00 	mov    rax,QWORD PTR [rax+0x190]
  b9152a:	48 85 c0             	test   rax,rax
  b9152d:	74 02                	je     b91531 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4d1>
  b9152f:	5b                   	pop    rbx
  b91530:	c3                   	ret
  b91531:	e8 89 8a ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b91536:	41 56                	push   r14
  b91538:	53                   	push   rbx
  b91539:	48 83 ec 28          	sub    rsp,0x28
  b9153d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b91544:	00 00 
  b91546:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  b9154b:	48 39 fe             	cmp    rsi,rdi
  b9154e:	0f 84 c2 00 00 00    	je     b91616 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde5b6>
  b91554:	48 89 f3             	mov    rbx,rsi
  b91557:	49 89 fe             	mov    r14,rdi
  b9155a:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  b9155e:	48 8b 4e 20          	mov    rcx,QWORD PTR [rsi+0x20]
  b91562:	48 39 f8             	cmp    rax,rdi
  b91565:	74 12                	je     b91579 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde519>
  b91567:	48 39 d9             	cmp    rcx,rbx
  b9156a:	74 32                	je     b9159e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde53e>
  b9156c:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
  b91570:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  b91574:	e9 9d 00 00 00       	jmp    b91616 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde5b6>
  b91579:	48 39 d9             	cmp    rcx,rbx
  b9157c:	74 44                	je     b915c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde562>
  b9157e:	49 8b 06             	mov    rax,QWORD PTR [r14]
  b91581:	4c 89 f7             	mov    rdi,r14
  b91584:	48 89 de             	mov    rsi,rbx
  b91587:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b9158a:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  b9158e:	48                   	rex.W
  b9158f:	8b                   	.byte 0x8b

## exact direct callers / nearby ID checks
452790-  b623b1:	41 55                	push   r13
452791-  b623b3:	41 54                	push   r12
452792-  b623b5:	53                   	push   rbx
452793-  b623b6:	48 81 ec 88 01 00 00 	sub    rsp,0x188
452794-  b623bd:	49 89 ce             	mov    r14,rcx
452795-  b623c0:	48 89 d3             	mov    rbx,rdx
452796-  b623c3:	48 89 fd             	mov    rbp,rdi
452797-  b623c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
452798-  b623cd:	00 00 
452799-  b623cf:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
452800-  b623d6:	00 
452801-  b623d7:	48 89 cf             	mov    rdi,rcx
452802-  b623da:	e8 95 0e 00 00       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
452803-  b623df:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
452804-  b623e4:	4c 89 f7             	mov    rdi,r14
452805-  b623e7:	e8 b4 0e 00 00       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
452806-  b623ec:	49 89 c7             	mov    r15,rax
452807-  b623ef:	4c 89 f7             	mov    rdi,r14
452808:  b623f2:	e8 d3 0e 00 00       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
452809-  b623f7:	49 89 c6             	mov    r14,rax
452810-  b623fa:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
452811-  b62401:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
452812-  b62406:	4c 8b 63 68          	mov    r12,QWORD PTR [rbx+0x68]
452813-  b6240a:	48 8d 35 9c cb 7f ff 	lea    rsi,[rip+0xffffffffff7fcb9c]        # 35efad <_ZTSSt12bad_any_cast@@Base-0x3121b>
452814-  b62411:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
452815-  b62416:	4c 89 ef             	mov    rdi,r13
452816-  b62419:	e8 60 76 f1 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
452817-  b6241e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
452818-  b62422:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
452819-  b62429:	00 
452820-  b6242a:	4c 89 e6             	mov    rsi,r12
452821-  b6242d:	4c 89 ea             	mov    rdx,r13
452822-  b62430:	ff 50 18             	call   QWORD PTR [rax+0x18]
452823-  b62433:	49 8b 07             	mov    rax,QWORD PTR [r15]
452824-  b62436:	4c 89 ff             	mov    rdi,r15
452825-  b62439:	ff 50 28             	call   QWORD PTR [rax+0x28]
452826-  b6243c:	49 89 c7             	mov    r15,rax
452827-  b6243f:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
452828-  b62443:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
452829-  b62448:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
452830-  b6244c:	49 8b 06             	mov    rax,QWORD PTR [r14]
452831-  b6244f:	4c 89 f7             	mov    rdi,r14
452832-  b62452:	ff 50 40             	call   QWORD PTR [rax+0x40]
452833-  b62455:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
452834-  b6245a:	6a 28                	push   0x28
452835-  b6245c:	5f                   	pop    rdi
452836-  b6245d:	e8 9e ba c8 00       	call   17edf00 <_Znwm@plt>
--
504558-  b91359:	cc                   	int3
504559-  b9135a:	55                   	push   rbp
504560-  b9135b:	41 57                	push   r15
504561-  b9135d:	41 56                	push   r14
504562-  b9135f:	41 55                	push   r13
504563-  b91361:	41 54                	push   r12
504564-  b91363:	53                   	push   rbx
504565-  b91364:	48 83 ec 68          	sub    rsp,0x68
504566-  b91368:	48 89 cb             	mov    rbx,rcx
504567-  b9136b:	49 89 d7             	mov    r15,rdx
504568-  b9136e:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
504569-  b91373:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
504570-  b9137a:	00 00 
504571-  b9137c:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
504572-  b91381:	48 89 cf             	mov    rdi,rcx
504573-  b91384:	e8 35 6c ff ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
504574-  b91389:	49 89 c5             	mov    r13,rax
504575-  b9138c:	48 89 df             	mov    rdi,rbx
504576:  b9138f:	e8 78 01 00 00       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
504577-  b91394:	49 89 c4             	mov    r12,rax
504578-  b91397:	49 8b 5f 30          	mov    rbx,QWORD PTR [r15+0x30]
504579-  b9139b:	49 8b 87 78 01 00 00 	mov    rax,QWORD PTR [r15+0x178]
504580-  b913a2:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
504581-  b913a7:	6a 40                	push   0x40
504582-  b913a9:	5f                   	pop    rdi
504583-  b913aa:	e8 51 cb c5 00       	call   17edf00 <_Znwm@plt>
504584-  b913af:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
504585-  b913b3:	48 8d 0d ee d1 c7 00 	lea    rcx,[rip+0xc7d1ee]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
504586-  b913ba:	48 89 08             	mov    QWORD PTR [rax],rcx
504587-  b913bd:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
504588-  b913c2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
504589-  b913c6:	48 83 c0 10          	add    rax,0x10
504590-  b913ca:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
504591-  b913cf:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
504592-  b913d2:	48 8d 2d 37 ec 80 ff 	lea    rbp,[rip+0xffffffffff80ec37]        # 3a0010 <_ZTSN5boost9exceptionE@@Base+0x9f2>
504593-  b913d9:	48 8d 0d 50 ec 80 ff 	lea    rcx,[rip+0xffffffffff80ec50]        # 3a0030 <_ZTSN5boost9exceptionE@@Base+0xa12>
504594-  b913e0:	6a 16                	push   0x16
504595-  b913e2:	41 5f                	pop    r15
504596-  b913e4:	6a 10                	push   0x10
504597-  b913e6:	41 5e                	pop    r14
504598-  b913e8:	48 89 ee             	mov    rsi,rbp
504599-  b913eb:	4c 89 fa             	mov    rdx,r15
504600-  b913ee:	4d 89 f0             	mov    r8,r14
504601-  b913f1:	45 31 c9             	xor    r9d,r9d
504602-  b913f4:	e8 65 61 a5 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
504603-  b913f9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
504604-  b913fc:	48 89 ee             	mov    rsi,rbp
--
505362-  b91e51:	cc                   	int3
505363-  b91e52:	55                   	push   rbp
505364-  b91e53:	41 57                	push   r15
505365-  b91e55:	41 56                	push   r14
505366-  b91e57:	41 55                	push   r13
505367-  b91e59:	41 54                	push   r12
505368-  b91e5b:	53                   	push   rbx
505369-  b91e5c:	48 83 ec 48          	sub    rsp,0x48
505370-  b91e60:	48 89 cb             	mov    rbx,rcx
505371-  b91e63:	49 89 d7             	mov    r15,rdx
505372-  b91e66:	49 89 fe             	mov    r14,rdi
505373-  b91e69:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
505374-  b91e70:	00 00 
505375-  b91e72:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
505376-  b91e77:	48 89 cf             	mov    rdi,rcx
505377-  b91e7a:	e8 3f 61 ff ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
505378-  b91e7f:	49 89 c5             	mov    r13,rax
505379-  b91e82:	48 89 df             	mov    rdi,rbx
505380:  b91e85:	e8 82 f6 ff ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
505381-  b91e8a:	49 89 c4             	mov    r12,rax
505382-  b91e8d:	49 8b af 78 01 00 00 	mov    rbp,QWORD PTR [r15+0x178]
505383-  b91e94:	6a 40                	push   0x40
505384-  b91e96:	5f                   	pop    rdi
505385-  b91e97:	e8 64 c0 c5 00       	call   17edf00 <_Znwm@plt>
505386-  b91e9c:	49 89 c7             	mov    r15,rax
505387-  b91e9f:	48 89 c3             	mov    rbx,rax
505388-  b91ea2:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
505389-  b91ea6:	48 8d 05 fb c6 c7 00 	lea    rax,[rip+0xc7c6fb]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
505390-  b91ead:	49 89 07             	mov    QWORD PTR [r15],rax
505391-  b91eb0:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
505392-  b91eb4:	4c 89 ef             	mov    rdi,r13
505393-  b91eb7:	ff 50 38             	call   QWORD PTR [rax+0x38]
505394-  b91eba:	49 89 c5             	mov    r13,rax
505395-  b91ebd:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
505396-  b91ec1:	4c 89 e7             	mov    rdi,r12
505397-  b91ec4:	ff 50 28             	call   QWORD PTR [rax+0x28]
505398-  b91ec7:	49 83 c7 10          	add    r15,0x10
505399-  b91ecb:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
505400-  b91ecf:	48 8d 0d 9a c8 c7 00 	lea    rcx,[rip+0xc7c89a]        # 180e770 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4430>
505401-  b91ed6:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
505402-  b91eda:	4c 89 6b 18          	mov    QWORD PTR [rbx+0x18],r13
505403-  b91ede:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
505404-  b91ee2:	4c 89 7b 30          	mov    QWORD PTR [rbx+0x30],r15
505405-  b91ee6:	48 89 e7             	mov    rdi,rsp
505406-  b91ee9:	4c 89 fe             	mov    rsi,r15
505407-  b91eec:	e8 9f 83 ee ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
505408-  b91ef1:	48 89 e2             	mov    rdx,rsp
--
505601-  b9218f:	6a 01                	push   0x1
505602-  b92191:	5a                   	pop    rdx
505603-  b92192:	c3                   	ret
505604-  b92193:	cc                   	int3
505605-  b92194:	55                   	push   rbp
505606-  b92195:	41 57                	push   r15
505607-  b92197:	41 56                	push   r14
505608-  b92199:	41 55                	push   r13
505609-  b9219b:	41 54                	push   r12
505610-  b9219d:	53                   	push   rbx
505611-  b9219e:	48 81 ec 48 02 00 00 	sub    rsp,0x248
505612-  b921a5:	48 89 d3             	mov    rbx,rdx
505613-  b921a8:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
505614-  b921ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
505615-  b921b4:	00 00 
505616-  b921b6:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
505617-  b921bd:	00 
505618-  b921be:	48 89 cf             	mov    rdi,rcx
505619:  b921c1:	e8 04 11 fd ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
505620-  b921c6:	49 89 c6             	mov    r14,rax
505621-  b921c9:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
505622-  b921cd:	48 8d 35 22 3d 7f ff 	lea    rsi,[rip+0xffffffffff7f3d22]        # 385ef6 <_ZTSSt12bad_any_cast@@Base-0xa2d2>
505623-  b921d4:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
505624-  b921d9:	4c 89 e7             	mov    rdi,r12
505625-  b921dc:	e8 9d 78 ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
505626-  b921e1:	49 8b 07             	mov    rax,QWORD PTR [r15]
505627-  b921e4:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
505628-  b921eb:	00 
505629-  b921ec:	4c 89 fe             	mov    rsi,r15
505630-  b921ef:	4c 89 e2             	mov    rdx,r12
505631-  b921f2:	ff 50 18             	call   QWORD PTR [rax+0x18]
505632-  b921f5:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
505633-  b921f9:	4c 8b bb 80 00 00 00 	mov    r15,QWORD PTR [rbx+0x80]
505634-  b92200:	48 8b 07             	mov    rax,QWORD PTR [rdi]
505635-  b92203:	ff 50 10             	call   QWORD PTR [rax+0x10]
505636-  b92206:	48 8b 08             	mov    rcx,QWORD PTR [rax]
505637-  b92209:	48 89 c7             	mov    rdi,rax
505638-  b9220c:	ff 51 28             	call   QWORD PTR [rcx+0x28]
505639-  b9220f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
505640-  b92214:	49 8b 06             	mov    rax,QWORD PTR [r14]
505641-  b92217:	4c 89 f7             	mov    rdi,r14
505642-  b9221a:	ff 50 48             	call   QWORD PTR [rax+0x48]
505643-  b9221d:	49 89 c6             	mov    r14,rax
505644-  b92220:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
505645-  b92224:	4c 8b 6b 40          	mov    r13,QWORD PTR [rbx+0x40]
505646-  b92228:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
505647-  b9222f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
--
561811-  bc736c:	55                   	push   rbp
561812-  bc736d:	41 57                	push   r15
561813-  bc736f:	41 56                	push   r14
561814-  bc7371:	41 55                	push   r13
561815-  bc7373:	41 54                	push   r12
561816-  bc7375:	53                   	push   rbx
561817-  bc7376:	48 81 ec 88 00 00 00 	sub    rsp,0x88
561818-  bc737d:	48 89 cb             	mov    rbx,rcx
561819-  bc7380:	49 89 d6             	mov    r14,rdx
561820-  bc7383:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
561821-  bc7388:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
561822-  bc738f:	00 00 
561823-  bc7391:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
561824-  bc7398:	00 
561825-  bc7399:	48 89 cf             	mov    rdi,rcx
561826-  bc739c:	e8 1d 0c fc ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
561827-  bc73a1:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
561828-  bc73a6:	48 89 df             	mov    rdi,rbx
561829:  bc73a9:	e8 5e a1 fc ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
561830-  bc73ae:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
561831-  bc73b3:	49 8b 5e 30          	mov    rbx,QWORD PTR [r14+0x30]
561832-  bc73b7:	49 8b 86 78 01 00 00 	mov    rax,QWORD PTR [r14+0x178]
561833-  bc73be:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
561834-  bc73c3:	6a 40                	push   0x40
561835-  bc73c5:	5f                   	pop    rdi
561836-  bc73c6:	e8 35 6b c2 00       	call   17edf00 <_Znwm@plt>
561837-  bc73cb:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
561838-  bc73cf:	48 8d 0d d2 71 c4 00 	lea    rcx,[rip+0xc471d2]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
561839-  bc73d6:	48 89 08             	mov    QWORD PTR [rax],rcx
561840-  bc73d9:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
561841-  bc73de:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
561842-  bc73e3:	48 83 c0 10          	add    rax,0x10
561843-  bc73e7:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
561844-  bc73ec:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
561845-  bc73ef:	4c 8d 3d 6a 70 7e ff 	lea    r15,[rip+0xffffffffff7e706a]        # 3ae460 <_ZTSN5boost9exceptionE@@Base+0xee42>
561846-  bc73f6:	4c 8d 2d 83 70 7e ff 	lea    r13,[rip+0xffffffffff7e7083]        # 3ae480 <_ZTSN5boost9exceptionE@@Base+0xee62>
561847-  bc73fd:	6a 16                	push   0x16
561848-  bc73ff:	41 5e                	pop    r14
561849-  bc7401:	6a 11                	push   0x11
561850-  bc7403:	41 5c                	pop    r12
561851-  bc7405:	4c 89 fe             	mov    rsi,r15
561852-  bc7408:	4c 89 f2             	mov    rdx,r14
561853-  bc740b:	4c 89 e9             	mov    rcx,r13
561854-  bc740e:	4d 89 e0             	mov    r8,r12
561855-  bc7411:	45 31 c9             	xor    r9d,r9d
561856-  bc7414:	e8 45 01 a2 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
561857-  bc7419:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
--
562600-  bc7e9d:	cc                   	int3
562601-  bc7e9e:	55                   	push   rbp
562602-  bc7e9f:	41 57                	push   r15
562603-  bc7ea1:	41 56                	push   r14
562604-  bc7ea3:	41 55                	push   r13
562605-  bc7ea5:	41 54                	push   r12
562606-  bc7ea7:	53                   	push   rbx
562607-  bc7ea8:	48 83 ec 48          	sub    rsp,0x48
562608-  bc7eac:	48 89 cb             	mov    rbx,rcx
562609-  bc7eaf:	49 89 d7             	mov    r15,rdx
562610-  bc7eb2:	49 89 fe             	mov    r14,rdi
562611-  bc7eb5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
562612-  bc7ebc:	00 00 
562613-  bc7ebe:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
562614-  bc7ec3:	48 89 cf             	mov    rdi,rcx
562615-  bc7ec6:	e8 f3 00 fc ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
562616-  bc7ecb:	49 89 c5             	mov    r13,rax
562617-  bc7ece:	48 89 df             	mov    rdi,rbx
562618:  bc7ed1:	e8 36 96 fc ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
562619-  bc7ed6:	49 89 c4             	mov    r12,rax
562620-  bc7ed9:	49 8b af 78 01 00 00 	mov    rbp,QWORD PTR [r15+0x178]
562621-  bc7ee0:	6a 40                	push   0x40
562622-  bc7ee2:	5f                   	pop    rdi
562623-  bc7ee3:	e8 18 60 c2 00       	call   17edf00 <_Znwm@plt>
562624-  bc7ee8:	49 89 c7             	mov    r15,rax
562625-  bc7eeb:	48 89 c3             	mov    rbx,rax
562626-  bc7eee:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
562627-  bc7ef2:	48 8d 05 af 66 c4 00 	lea    rax,[rip+0xc466af]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
562628-  bc7ef9:	49 89 07             	mov    QWORD PTR [r15],rax
562629-  bc7efc:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
562630-  bc7f00:	4c 89 ef             	mov    rdi,r13
562631-  bc7f03:	ff 50 38             	call   QWORD PTR [rax+0x38]
562632-  bc7f06:	49 89 c5             	mov    r13,rax
562633-  bc7f09:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
562634-  bc7f0d:	4c 89 e7             	mov    rdi,r12
562635-  bc7f10:	ff 50 28             	call   QWORD PTR [rax+0x28]
562636-  bc7f13:	49 83 c7 10          	add    r15,0x10
562637-  bc7f17:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
562638-  bc7f1b:	48 8d 0d 9e 9b c4 00 	lea    rcx,[rip+0xc49b9e]        # 1811ac0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7780>
562639-  bc7f22:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
562640-  bc7f26:	4c 89 6b 18          	mov    QWORD PTR [rbx+0x18],r13
562641-  bc7f2a:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
562642-  bc7f2e:	4c 89 7b 30          	mov    QWORD PTR [rbx+0x30],r15
562643-  bc7f32:	48 89 e7             	mov    rdi,rsp
562644-  bc7f35:	4c 89 fe             	mov    rsi,r15
562645-  bc7f38:	e8 53 23 eb ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
562646-  bc7f3d:	48 89 e2             	mov    rdx,rsp
--
563269-  bc8848:	55                   	push   rbp
563270-  bc8849:	41 57                	push   r15
563271-  bc884b:	41 56                	push   r14
563272-  bc884d:	41 55                	push   r13
563273-  bc884f:	41 54                	push   r12
563274-  bc8851:	53                   	push   rbx
563275-  bc8852:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
563276-  bc8859:	48 89 cb             	mov    rbx,rcx
563277-  bc885c:	49 89 d6             	mov    r14,rdx
563278-  bc885f:	49 89 fd             	mov    r13,rdi
563279-  bc8862:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
563280-  bc8869:	00 00 
563281-  bc886b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
563282-  bc8872:	00 
563283-  bc8873:	48 89 cf             	mov    rdi,rcx
563284-  bc8876:	e8 43 f7 fb ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
563285-  bc887b:	48 89 c5             	mov    rbp,rax
563286-  bc887e:	48 89 df             	mov    rdi,rbx
563287:  bc8881:	e8 86 8c fc ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
563288-  bc8886:	49 89 c4             	mov    r12,rax
563289-  bc8889:	4d 8b 7e 30          	mov    r15,QWORD PTR [r14+0x30]
563290-  bc888d:	4d 8b b6 78 01 00 00 	mov    r14,QWORD PTR [r14+0x178]
563291-  bc8894:	6a 40                	push   0x40
563292-  bc8896:	5f                   	pop    rdi
563293-  bc8897:	e8 64 56 c2 00       	call   17edf00 <_Znwm@plt>
563294-  bc889c:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
563295-  bc88a0:	48 8d 0d 01 5d c4 00 	lea    rcx,[rip+0xc45d01]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
563296-  bc88a7:	48 89 08             	mov    QWORD PTR [rax],rcx
563297-  bc88aa:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
563298-  bc88af:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
563299-  bc88b4:	48 83 c0 10          	add    rax,0x10
563300-  bc88b8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
563301-  bc88bd:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
563302-  bc88c1:	4c 89 e7             	mov    rdi,r12
563303-  bc88c4:	ff 50 28             	call   QWORD PTR [rax+0x28]
563304-  bc88c7:	48 83 78 28 00       	cmp    QWORD PTR [rax+0x28],0x0
563305-  bc88cc:	0f 84 b0 03 00 00    	je     bc8c82 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x115c22>
563306-  bc88d2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
563307-  bc88d6:	4c 89 e7             	mov    rdi,r12
563308-  bc88d9:	ff 50 28             	call   QWORD PTR [rax+0x28]
563309-  bc88dc:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
563310-  bc88e1:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
563311-  bc88e6:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
563312-  bc88eb:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
563313-  bc88f0:	0f 84 e9 03 00 00    	je     bc8cdf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x115c7f>
563314-  bc88f6:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
563315-  bc88f9:	48 8d 35 20 5c 7e ff 	lea    rsi,[rip+0xffffffffff7e5c20]        # 3ae520 <_ZTSN5boost9exceptionE@@Base+0xef02>
--
568950-  bcdc26:	48 8d 05 38 0a 7e ff 	lea    rax,[rip+0xffffffffff7e0a38]        # 3ae665 <_ZTSN5boost9exceptionE@@Base+0xf047>
568951-  bcdc2d:	6a 01                	push   0x1
568952-  bcdc2f:	5a                   	pop    rdx
568953-  bcdc30:	c3                   	ret
568954-  bcdc31:	cc                   	int3
568955-  bcdc32:	55                   	push   rbp
568956-  bcdc33:	41 57                	push   r15
568957-  bcdc35:	41 56                	push   r14
568958-  bcdc37:	41 55                	push   r13
568959-  bcdc39:	41 54                	push   r12
568960-  bcdc3b:	53                   	push   rbx
568961-  bcdc3c:	48 83 ec 58          	sub    rsp,0x58
568962-  bcdc40:	48 89 d3             	mov    rbx,rdx
568963-  bcdc43:	49 89 fe             	mov    r14,rdi
568964-  bcdc46:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
568965-  bcdc4d:	00 00 
568966-  bcdc4f:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
568967-  bcdc54:	48 89 cf             	mov    rdi,rcx
568968:  bcdc57:	e8 b0 38 fc ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
568969-  bcdc5c:	49 89 c5             	mov    r13,rax
568970-  bcdc5f:	4c 8b bb 78 01 00 00 	mov    r15,QWORD PTR [rbx+0x178]
568971-  bcdc66:	bf 80 00 00 00       	mov    edi,0x80
568972-  bcdc6b:	e8 90 02 c2 00       	call   17edf00 <_Znwm@plt>
568973-  bcdc70:	48 89 c3             	mov    rbx,rax
568974-  bcdc73:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
568975-  bcdc77:	48 8d 05 72 41 c4 00 	lea    rax,[rip+0xc44172]        # 1811df0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7ab0>
568976-  bcdc7e:	48 89 03             	mov    QWORD PTR [rbx],rax
568977-  bcdc81:	48 8d 4b 10          	lea    rcx,[rbx+0x10]
568978-  bcdc85:	0f 57 c0             	xorps  xmm0,xmm0
568979-  bcdc88:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
568980-  bcdc8c:	0f 29 43 20          	movaps XMMWORD PTR [rbx+0x20],xmm0
568981-  bcdc90:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
568982-  bcdc95:	0f 29 43 30          	movaps XMMWORD PTR [rbx+0x30],xmm0
568983-  bcdc99:	48 83 63 70 00       	and    QWORD PTR [rbx+0x70],0x0
568984-  bcdc9e:	49 89 dc             	mov    r12,rbx
568985-  bcdca1:	49 83 c4 50          	add    r12,0x50
568986-  bcdca5:	48 8d 05 7c 41 c4 00 	lea    rax,[rip+0xc4417c]        # 1811e28 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7ae8>
568987-  bcdcac:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
568988-  bcdcb1:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
568989-  bcdcb5:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
568990-  bcdcba:	48 89 4d 08          	mov    QWORD PTR [rbp+0x8],rcx
568991-  bcdcbe:	4c 89 6d 10          	mov    QWORD PTR [rbp+0x10],r13
568992-  bcdcc2:	48 89 6d 20          	mov    QWORD PTR [rbp+0x20],rbp
568993-  bcdcc6:	48 89 ef             	mov    rdi,rbp
568994-  bcdcc9:	4c 89 e6             	mov    rsi,r12
568995-  bcdccc:	e8 65 38 fc ff       	call   b91536 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4d6>
568996-  bcdcd1:	48 89 ef             	mov    rdi,rbp
--
580885-  bd8d13:	6a 01                	push   0x1
580886-  bd8d15:	5a                   	pop    rdx
580887-  bd8d16:	c3                   	ret
580888-  bd8d17:	cc                   	int3
580889-  bd8d18:	55                   	push   rbp
580890-  bd8d19:	41 57                	push   r15
580891-  bd8d1b:	41 56                	push   r14
580892-  bd8d1d:	41 55                	push   r13
580893-  bd8d1f:	41 54                	push   r12
580894-  bd8d21:	53                   	push   rbx
580895-  bd8d22:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
580896-  bd8d29:	48 89 d3             	mov    rbx,rdx
580897-  bd8d2c:	49 89 fe             	mov    r14,rdi
580898-  bd8d2f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
580899-  bd8d36:	00 00 
580900-  bd8d38:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
580901-  bd8d3f:	00 
580902-  bd8d40:	48 89 cf             	mov    rdi,rcx
580903:  bd8d43:	e8 c4 87 fb ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
580904-  bd8d48:	49 89 c4             	mov    r12,rax
580905-  bd8d4b:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
580906-  bd8d4f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
580907-  bd8d54:	48 8b 9b 78 01 00 00 	mov    rbx,QWORD PTR [rbx+0x178]
580908-  bd8d5b:	6a 40                	push   0x40
580909-  bd8d5d:	5f                   	pop    rdi
580910-  bd8d5e:	e8 9d 51 c1 00       	call   17edf00 <_Znwm@plt>
580911-  bd8d63:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
580912-  bd8d67:	48 8d 0d 3a 58 c3 00 	lea    rcx,[rip+0xc3583a]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
580913-  bd8d6e:	48 89 08             	mov    QWORD PTR [rax],rcx
580914-  bd8d71:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
580915-  bd8d76:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
580916-  bd8d7b:	48 83 c0 10          	add    rax,0x10
580917-  bd8d7f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
580918-  bd8d84:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
580919-  bd8d88:	4c 89 e7             	mov    rdi,r12
580920-  bd8d8b:	ff 50 28             	call   QWORD PTR [rax+0x28]
580921-  bd8d8e:	48 83 78 40 00       	cmp    QWORD PTR [rax+0x40],0x0
580922-  bd8d93:	0f 84 a5 03 00 00    	je     bd913e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1260de>
580923-  bd8d99:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
580924-  bd8d9e:	4c 8b 38             	mov    r15,QWORD PTR [rax]
580925-  bd8da1:	48 8d 35 30 31 78 ff 	lea    rsi,[rip+0xffffffffff783130]        # 35bed8 <_ZTSSt12bad_any_cast@@Base-0x342f0>
580926-  bd8da8:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
580927-  bd8dad:	e8 cc 0c ea ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
580928-  bd8db2:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
580929-  bd8db7:	48 8d 35 58 e0 7e ff 	lea    rsi,[rip+0xffffffffff7ee058]        # 3c6e16 <_ZTSN5boost9exceptionE@@Base+0x277f8>
580930-  bd8dbe:	4c 89 ef             	mov    rdi,r13
580931-  bd8dc1:	e8 b8 0c ea ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
--
611980-  bf5a24:	48 8d 05 a4 16 7d ff 	lea    rax,[rip+0xffffffffff7d16a4]        # 3c70cf <_ZTSN5boost9exceptionE@@Base+0x27ab1>
611981-  bf5a2b:	6a 01                	push   0x1
611982-  bf5a2d:	5a                   	pop    rdx
611983-  bf5a2e:	c3                   	ret
611984-  bf5a2f:	cc                   	int3
611985-  bf5a30:	55                   	push   rbp
611986-  bf5a31:	41 57                	push   r15
611987-  bf5a33:	41 56                	push   r14
611988-  bf5a35:	41 55                	push   r13
611989-  bf5a37:	41 54                	push   r12
611990-  bf5a39:	53                   	push   rbx
611991-  bf5a3a:	48 83 ec 68          	sub    rsp,0x68
611992-  bf5a3e:	48 89 d3             	mov    rbx,rdx
611993-  bf5a41:	49 89 ff             	mov    r15,rdi
611994-  bf5a44:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
611995-  bf5a4b:	00 00 
611996-  bf5a4d:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
611997-  bf5a52:	48 89 cf             	mov    rdi,rcx
611998:  bf5a55:	e8 b2 ba f9 ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
611999-  bf5a5a:	49 89 c4             	mov    r12,rax
612000-  bf5a5d:	48 8b ab 78 01 00 00 	mov    rbp,QWORD PTR [rbx+0x178]
612001-  bf5a64:	6a 40                	push   0x40
612002-  bf5a66:	5f                   	pop    rdi
612003-  bf5a67:	e8 94 84 bf 00       	call   17edf00 <_Znwm@plt>
612004-  bf5a6c:	48 89 c3             	mov    rbx,rax
612005-  bf5a6f:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
612006-  bf5a73:	48 8d 05 2e 8b c1 00 	lea    rax,[rip+0xc18b2e]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
612007-  bf5a7a:	48 89 03             	mov    QWORD PTR [rbx],rax
612008-  bf5a7d:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
612009-  bf5a82:	49 89 de             	mov    r14,rbx
612010-  bf5a85:	49 83 c6 10          	add    r14,0x10
612011-  bf5a89:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
612012-  bf5a8d:	4c 89 e7             	mov    rdi,r12
612013-  bf5a90:	ff 50 28             	call   QWORD PTR [rax+0x28]
612014-  bf5a93:	48 83 78 08 00       	cmp    QWORD PTR [rax+0x8],0x0
612015-  bf5a98:	0f 84 98 00 00 00    	je     bf5b36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x142ad6>
612016-  bf5a9e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
612017-  bf5aa2:	4c 89 e7             	mov    rdi,r12
612018-  bf5aa5:	ff 50 28             	call   QWORD PTR [rax+0x28]
612019-  bf5aa8:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
612020-  bf5aac:	48 8d 0d dd d9 c1 00 	lea    rcx,[rip+0xc1d9dd]        # 1813490 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9150>
612021-  bf5ab3:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
612022-  bf5ab8:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
612023-  bf5abc:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
612024-  bf5ac1:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
612025-  bf5ac6:	4c 89 e7             	mov    rdi,r12
612026-  bf5ac9:	4c 89 f6             	mov    rsi,r14
--
697390-  c42ee9:	5a                   	pop    rdx
697391-  c42eea:	c3                   	ret
697392-  c42eeb:	cc                   	int3
697393-  c42eec:	55                   	push   rbp
697394-  c42eed:	41 57                	push   r15
697395-  c42eef:	41 56                	push   r14
697396-  c42ef1:	41 55                	push   r13
697397-  c42ef3:	41 54                	push   r12
697398-  c42ef5:	53                   	push   rbx
697399-  c42ef6:	48 81 ec 78 01 00 00 	sub    rsp,0x178
697400-  c42efd:	49 89 ce             	mov    r14,rcx
697401-  c42f00:	48 89 d3             	mov    rbx,rdx
697402-  c42f03:	49 89 fd             	mov    r13,rdi
697403-  c42f06:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
697404-  c42f0d:	00 00 
697405-  c42f0f:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
697406-  c42f16:	00 
697407-  c42f17:	48 89 cf             	mov    rdi,rcx
697408:  c42f1a:	e8 ab 03 f2 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
697409-  c42f1f:	48 89 c5             	mov    rbp,rax
697410-  c42f22:	4c 89 f7             	mov    rdi,r14
697411-  c42f25:	e8 4a 03 f2 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
697412-  c42f2a:	49 89 c6             	mov    r14,rax
697413-  c42f2d:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
697414-  c42f34:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
697415-  c42f3b:	00 
697416-  c42f3c:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
697417-  c42f40:	48 8d 35 4a ee 6f ff 	lea    rsi,[rip+0xffffffffff6fee4a]        # 341d91 <_ZTSSt12bad_any_cast@@Base-0x4e437>
697418-  c42f47:	4c 8d a4 24 b0 00 00 	lea    r12,[rsp+0xb0]
697419-  c42f4e:	00 
697420-  c42f4f:	4c 89 e7             	mov    rdi,r12
697421-  c42f52:	e8 27 6b e3 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
697422-  c42f57:	49 8b 07             	mov    rax,QWORD PTR [r15]
697423-  c42f5a:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
697424-  c42f61:	00 
697425-  c42f62:	4c 89 fe             	mov    rsi,r15
697426-  c42f65:	4c 89 e2             	mov    rdx,r12
697427-  c42f68:	ff 50 18             	call   QWORD PTR [rax+0x18]
697428-  c42f6b:	49 8b 06             	mov    rax,QWORD PTR [r14]
697429-  c42f6e:	4c 89 f7             	mov    rdi,r14
697430-  c42f71:	ff 50 28             	call   QWORD PTR [rax+0x28]
697431-  c42f74:	49 89 c4             	mov    r12,rax
697432-  c42f77:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
697433-  c42f7b:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
697434-  c42f82:	00 
697435-  c42f83:	4c 8b bb 90 00 00 00 	mov    r15,QWORD PTR [rbx+0x90]
697436-  c42f8a:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
--
716000-  c53694:	55                   	push   rbp
716001-  c53695:	41 57                	push   r15
716002-  c53697:	41 56                	push   r14
716003-  c53699:	41 55                	push   r13
716004-  c5369b:	41 54                	push   r12
716005-  c5369d:	53                   	push   rbx
716006-  c5369e:	48 81 ec 88 00 00 00 	sub    rsp,0x88
716007-  c536a5:	49 89 cf             	mov    r15,rcx
716008-  c536a8:	48 89 d5             	mov    rbp,rdx
716009-  c536ab:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
716010-  c536af:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
716011-  c536b6:	00 00 
716012-  c536b8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
716013-  c536bf:	00 
716014-  c536c0:	48 89 cf             	mov    rdi,rcx
716015-  c536c3:	e8 82 01 00 00       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
716016-  c536c8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
716017-  c536cd:	4c 89 ff             	mov    rdi,r15
716018:  c536d0:	e8 f5 fb f0 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
716019-  c536d5:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
716020-  c536da:	4c 89 ff             	mov    rdi,r15
716021-  c536dd:	e8 92 fb f0 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
716022-  c536e2:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
716023-  c536e7:	4c 89 ff             	mov    rdi,r15
716024-  c536ea:	e8 61 e0 fb ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
716025-  c536ef:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
716026-  c536f4:	4c 89 ff             	mov    rdi,r15
716027-  c536f7:	e8 78 01 00 00       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
716028-  c536fc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
716029-  c53701:	4c 89 ff             	mov    rdi,r15
716030-  c53704:	e8 95 01 00 00       	call   c5389e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a083e>
716031-  c53709:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
716032-  c5370e:	4c 89 ff             	mov    rdi,r15
716033-  c53711:	e8 8a fb f0 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
716034-  c53716:	49 89 c4             	mov    r12,rax
716035-  c53719:	48 8b 45 60          	mov    rax,QWORD PTR [rbp+0x60]
716036-  c5371d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
716037-  c53722:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
716038-  c53729:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
716039-  c5372e:	4c 8b 6d 40          	mov    r13,QWORD PTR [rbp+0x40]
716040-  c53732:	4c 8b b5 80 00 00 00 	mov    r14,QWORD PTR [rbp+0x80]
716041-  c53739:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
716042-  c5373d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
716043-  c53742:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
716044-  c53746:	48 8b 07             	mov    rax,QWORD PTR [rdi]
716045-  c53749:	ff 50 10             	call   QWORD PTR [rax+0x10]
716046-  c5374c:	48 8b 08             	mov    rcx,QWORD PTR [rax]
--
761790-  c7c8e3:	5a                   	pop    rdx
761791-  c7c8e4:	c3                   	ret
761792-  c7c8e5:	cc                   	int3
761793-  c7c8e6:	55                   	push   rbp
761794-  c7c8e7:	41 57                	push   r15
761795-  c7c8e9:	41 56                	push   r14
761796-  c7c8eb:	41 55                	push   r13
761797-  c7c8ed:	41 54                	push   r12
761798-  c7c8ef:	53                   	push   rbx
761799-  c7c8f0:	48 81 ec 98 00 00 00 	sub    rsp,0x98
761800-  c7c8f7:	48 89 cb             	mov    rbx,rcx
761801-  c7c8fa:	49 89 d4             	mov    r12,rdx
761802-  c7c8fd:	49 89 fd             	mov    r13,rdi
761803-  c7c900:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
761804-  c7c907:	00 00 
761805-  c7c909:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
761806-  c7c910:	00 
761807-  c7c911:	48 89 cf             	mov    rdi,rcx
761808:  c7c914:	e8 f3 4b f1 ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
761809-  c7c919:	49 89 c7             	mov    r15,rax
761810-  c7c91c:	6a 6d                	push   0x6d
761811-  c7c91e:	5e                   	pop    rsi
761812-  c7c91f:	48 89 df             	mov    rdi,rbx
761813-  c7c922:	e8 15 02 00 00       	call   c7cb3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9adc>
761814-  c7c927:	49 8b 6c 24 30       	mov    rbp,QWORD PTR [r12+0x30]
761815-  c7c92c:	48 83 c0 10          	add    rax,0x10
761816-  c7c930:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
761817-  c7c935:	48 8d 05 28 fb df ff 	lea    rax,[rip+0xffffffffffdffb28]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
761818-  c7c93c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
761819-  c7c941:	48 8d 05 1e 02 00 00 	lea    rax,[rip+0x21e]        # c7cb66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9b06>
761820-  c7c948:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
761821-  c7c94d:	4d 8b a4 24 78 01 00 	mov    r12,QWORD PTR [r12+0x178]
761822-  c7c954:	00 
761823-  c7c955:	6a 50                	push   0x50
761824-  c7c957:	5f                   	pop    rdi
761825-  c7c958:	e8 a3 15 b7 00       	call   17edf00 <_Znwm@plt>
761826-  c7c95d:	48 89 c3             	mov    rbx,rax
761827-  c7c960:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
761828-  c7c965:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
761829-  c7c96a:	e8 09 02 00 00       	call   c7cb78 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9b18>
761830-  c7c96f:	c6 43 08 00          	mov    BYTE PTR [rbx+0x8],0x0
761831-  c7c973:	48 8d 05 8e f1 b9 00 	lea    rax,[rip+0xb9f18e]        # 181bb08 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x117c8>
761832-  c7c97a:	48 89 03             	mov    QWORD PTR [rbx],rax
761833-  c7c97d:	49 8b 07             	mov    rax,QWORD PTR [r15]
761834-  c7c980:	4c 89 ff             	mov    rdi,r15
761835-  c7c983:	ff 50 28             	call   QWORD PTR [rax+0x28]
761836-  c7c986:	4c 8b 70 18          	mov    r14,QWORD PTR [rax+0x18]
--
762030-  c7cc0b:	53                   	push   rbx
762031-  c7cc0c:	48 83 ec 58          	sub    rsp,0x58
762032-  c7cc10:	48 89 cb             	mov    rbx,rcx
762033-  c7cc13:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
762034-  c7cc18:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
762035-  c7cc1d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
762036-  c7cc24:	00 00 
762037-  c7cc26:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
762038-  c7cc2b:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
762039-  c7cc2f:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
762040-  c7cc33:	6a 2e                	push   0x2e
762041-  c7cc35:	5a                   	pop    rdx
762042-  c7cc36:	e8 a3 56 ee ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
762043-  c7cc3b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
762044-  c7cc3e:	4c 8b a0 70 01 00 00 	mov    r12,QWORD PTR [rax+0x170]
762045-  c7cc45:	4d 85 e4             	test   r12,r12
762046-  c7cc48:	0f 84 f7 00 00 00    	je     c7cd45 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9ce5>
762047-  c7cc4e:	48 89 df             	mov    rdi,rbx
762048:  c7cc51:	e8 74 66 ee ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
762049-  c7cc56:	48 89 c5             	mov    rbp,rax
762050-  c7cc59:	48 89 df             	mov    rdi,rbx
762051-  c7cc5c:	e8 13 6c fd ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
762052-  c7cc61:	49 89 c7             	mov    r15,rax
762053-  c7cc64:	48 89 df             	mov    rdi,rbx
762054-  c7cc67:	e8 32 6c fd ff       	call   c5389e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a083e>
762055-  c7cc6c:	49 89 c6             	mov    r14,rax
762056-  c7cc6f:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
762057-  c7cc74:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
762058-  c7cc79:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
762059-  c7cc7d:	48 89 ef             	mov    rdi,rbp
762060-  c7cc80:	ff 50 48             	call   QWORD PTR [rax+0x48]
762061-  c7cc83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
762062-  c7cc88:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
762063-  c7cc8c:	48 89 ef             	mov    rdi,rbp
762064-  c7cc8f:	ff 50 40             	call   QWORD PTR [rax+0x40]
762065-  c7cc92:	49 89 c5             	mov    r13,rax
762066-  c7cc95:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
762067-  c7cc99:	48 89 ef             	mov    rdi,rbp
762068-  c7cc9c:	ff 50 38             	call   QWORD PTR [rax+0x38]
762069-  c7cc9f:	48 89 c5             	mov    rbp,rax
762070-  c7cca2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
762071-  c7cca7:	48 8b 58 20          	mov    rbx,QWORD PTR [rax+0x20]
762072-  c7ccab:	49 8b 07             	mov    rax,QWORD PTR [r15]
762073-  c7ccae:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
762074-  c7ccb3:	4c 89 e7             	mov    rdi,r12
762075-  c7ccb6:	4c 89 fe             	mov    rsi,r15
762076-  c7ccb9:	ff 50 38             	call   QWORD PTR [rax+0x38]
--
762323-  c7d028:	c3                   	ret
762324-  c7d029:	cc                   	int3
762325-  c7d02a:	48 8d 05 65 f0 74 ff 	lea    rax,[rip+0xffffffffff74f065]        # 3cc096 <_ZTSN5boost9exceptionE@@Base+0x2ca78>
762326-  c7d031:	6a 01                	push   0x1
762327-  c7d033:	5a                   	pop    rdx
762328-  c7d034:	c3                   	ret
762329-  c7d035:	cc                   	int3
762330-  c7d036:	41 57                	push   r15
762331-  c7d038:	41 56                	push   r14
762332-  c7d03a:	41 55                	push   r13
762333-  c7d03c:	41 54                	push   r12
762334-  c7d03e:	53                   	push   rbx
762335-  c7d03f:	48 83 ec 50          	sub    rsp,0x50
762336-  c7d043:	49 89 fe             	mov    r14,rdi
762337-  c7d046:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
762338-  c7d04d:	00 00 
762339-  c7d04f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
762340-  c7d054:	48 89 cf             	mov    rdi,rcx
762341:  c7d057:	e8 6e 62 ee ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
762342-  c7d05c:	48 8b 08             	mov    rcx,QWORD PTR [rax]
762343-  c7d05f:	48 89 c7             	mov    rdi,rax
762344-  c7d062:	ff 51 48             	call   QWORD PTR [rcx+0x48]
762345-  c7d065:	49 89 c4             	mov    r12,rax
762346-  c7d068:	6a 20                	push   0x20
762347-  c7d06a:	5f                   	pop    rdi
762348-  c7d06b:	e8 90 0e b7 00       	call   17edf00 <_Znwm@plt>
762349-  c7d070:	48 89 c3             	mov    rbx,rax
762350-  c7d073:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
762351-  c7d077:	48 8d 05 82 e9 b9 00 	lea    rax,[rip+0xb9e982]        # 181ba00 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x116c0>
762352-  c7d07e:	48 89 03             	mov    QWORD PTR [rbx],rax
762353-  c7d081:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
762354-  c7d086:	4c 89 ef             	mov    rdi,r13
762355-  c7d089:	e8 41 40 e3 ff       	call   ab10cf <JNI_OnUnload@@Base+0x3899c>
762356-  c7d08e:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
762357-  c7d092:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
762358-  c7d097:	49 89 37             	mov    QWORD PTR [r15],rsi
762359-  c7d09a:	48 8d 05 97 c8 b8 00 	lea    rax,[rip+0xb8c897]        # 1809938 <_ZTIN4asio22service_already_existsE@@Base+0xb120>
762360-  c7d0a1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
762361-  c7d0a6:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12
762362-  c7d0ab:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
762363-  c7d0b0:	48 89 e7             	mov    rdi,rsp
762364-  c7d0b3:	e8 a0 9b e2 ff       	call   aa6c58 <JNI_OnUnload@@Base+0x2e525>
762365-  c7d0b8:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
762366-  c7d0bc:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
762367-  c7d0c1:	48 89 df             	mov    rdi,rbx
762368-  c7d0c4:	48 83 c7 18          	add    rdi,0x18
762369-  c7d0c8:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
--
766175-  c80353:	6a 03                	push   0x3
766176-  c80355:	5a                   	pop    rdx
766177-  c80356:	c3                   	ret
766178-  c80357:	cc                   	int3
766179-  c80358:	55                   	push   rbp
766180-  c80359:	41 57                	push   r15
766181-  c8035b:	41 56                	push   r14
766182-  c8035d:	41 55                	push   r13
766183-  c8035f:	41 54                	push   r12
766184-  c80361:	53                   	push   rbx
766185-  c80362:	48 83 ec 58          	sub    rsp,0x58
766186-  c80366:	48 89 cb             	mov    rbx,rcx
766187-  c80369:	49 89 d6             	mov    r14,rdx
766188-  c8036c:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
766189-  c80371:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
766190-  c80378:	00 00 
766191-  c8037a:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
766192-  c8037f:	48 89 cf             	mov    rdi,rcx
766193:  c80382:	e8 43 2f ee ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
766194-  c80387:	48 89 c5             	mov    rbp,rax
766195-  c8038a:	48 89 df             	mov    rdi,rbx
766196-  c8038d:	e8 e2 34 fd ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
766197-  c80392:	49 89 c7             	mov    r15,rax
766198-  c80395:	48 89 df             	mov    rdi,rbx
766199-  c80398:	e8 01 35 fd ff       	call   c5389e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a083e>
766200-  c8039d:	49 89 c4             	mov    r12,rax
766201-  c803a0:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
766202-  c803a7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
766203-  c803ac:	49 8b 86 38 01 00 00 	mov    rax,QWORD PTR [r14+0x138]
766204-  c803b3:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
766205-  c803b8:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
766206-  c803bc:	48 89 ef             	mov    rdi,rbp
766207-  c803bf:	ff 50 40             	call   QWORD PTR [rax+0x40]
766208-  c803c2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
766209-  c803c7:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
766210-  c803cb:	48 89 ef             	mov    rdi,rbp
766211-  c803ce:	ff 50 38             	call   QWORD PTR [rax+0x38]
766212-  c803d1:	48 89 c5             	mov    rbp,rax
766213-  c803d4:	49 8b 5e 20          	mov    rbx,QWORD PTR [r14+0x20]
766214-  c803d8:	49 8b 07             	mov    rax,QWORD PTR [r15]
766215-  c803db:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
766216-  c803e0:	4c 89 ef             	mov    rdi,r13
766217-  c803e3:	4c 89 fe             	mov    rsi,r15
766218-  c803e6:	ff 50 28             	call   QWORD PTR [rax+0x28]
766219-  c803e9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
766220-  c803ed:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
766221-  c803f2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
--
827673-  cb6e5b:	41 57                	push   r15
827674-  cb6e5d:	41 56                	push   r14
827675-  cb6e5f:	41 55                	push   r13
827676-  cb6e61:	41 54                	push   r12
827677-  cb6e63:	53                   	push   rbx
827678-  cb6e64:	48 81 ec f8 02 00 00 	sub    rsp,0x2f8
827679-  cb6e6b:	48 89 cb             	mov    rbx,rcx
827680-  cb6e6e:	49 89 d5             	mov    r13,rdx
827681-  cb6e71:	48 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rdi
827682-  cb6e78:	00 
827683-  cb6e79:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
827684-  cb6e80:	00 00 
827685-  cb6e82:	48 89 84 24 f0 02 00 	mov    QWORD PTR [rsp+0x2f0],rax
827686-  cb6e89:	00 
827687-  cb6e8a:	48 89 cf             	mov    rdi,rcx
827688-  cb6e8d:	e8 b8 c9 f9 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
827689-  cb6e92:	49 89 c6             	mov    r14,rax
827690-  cb6e95:	48 89 df             	mov    rdi,rbx
827691:  cb6e98:	e8 2d c4 ea ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
827692-  cb6e9d:	49 89 c4             	mov    r12,rax
827693-  cb6ea0:	48 89 df             	mov    rdi,rbx
827694-  cb6ea3:	e8 f4 05 00 00       	call   cb749c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20443c>
827695-  cb6ea8:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
827696-  cb6eaf:	00 
827697-  cb6eb0:	48 89 df             	mov    rdi,rbx
827698-  cb6eb3:	e8 98 a8 f5 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
827699-  cb6eb8:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
827700-  cb6ebf:	00 
827701-  cb6ec0:	48 89 df             	mov    rdi,rbx
827702-  cb6ec3:	e8 d8 c3 ea ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
827703-  cb6ec8:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
827704-  cb6ecf:	00 
827705-  cb6ed0:	48 89 df             	mov    rdi,rbx
827706-  cb6ed3:	e8 bc 10 ed ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
827707-  cb6ed8:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
827708-  cb6edf:	00 
827709-  cb6ee0:	48 89 df             	mov    rdi,rbx
827710-  cb6ee3:	e8 d6 10 ed ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
827711-  cb6ee8:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
827712-  cb6eef:	00 
827713-  cb6ef0:	48 89 df             	mov    rdi,rbx
827714-  cb6ef3:	e8 7c c9 f9 ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
827715-  cb6ef8:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
827716-  cb6eff:	00 
827717-  cb6f00:	48 89 df             	mov    rdi,rbx
827718-  cb6f03:	e8 f0 f7 f8 ff       	call   c466f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193698>
827719-  cb6f08:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
827720-  cb6f0f:	00 
827721-  cb6f10:	48 89 df             	mov    rdi,rbx
827722-  cb6f13:	e8 04 54 fc ff       	call   c7c31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c92bc>
827723-  cb6f18:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
827724-  cb6f1f:	00 
827725-  cb6f20:	48 89 df             	mov    rdi,rbx
827726-  cb6f23:	e8 a0 05 00 00       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
827727-  cb6f28:	49 89 c7             	mov    r15,rax
827728-  cb6f2b:	48 89 df             	mov    rdi,rbx
827729:  cb6f2e:	e8 d9 a5 ed ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
827730-  cb6f33:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
827731-  cb6f3a:	00 
827732-  cb6f3b:	48 89 df             	mov    rdi,rbx
827733-  cb6f3e:	e8 af 05 00 00       	call   cb74f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204492>
827734-  cb6f43:	48 89 c5             	mov    rbp,rax
827735-  cb6f46:	48 89 df             	mov    rdi,rbx
827736-  cb6f49:	e8 2c a8 f5 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
827737-  cb6f4e:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
827738-  cb6f55:	00 
827739-  cb6f56:	48 89 df             	mov    rdi,rbx
827740-  cb6f59:	e8 be 05 00 00       	call   cb751c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044bc>
827741-  cb6f5e:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
827742-  cb6f65:	00 
827743-  cb6f66:	48 89 df             	mov    rdi,rbx
827744-  cb6f69:	e8 da 05 00 00       	call   cb7548 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044e8>
827745-  cb6f6e:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
827746-  cb6f75:	00 
827747-  cb6f76:	49 8b 5d 20          	mov    rbx,QWORD PTR [r13+0x20]
827748-  cb6f7a:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
827749-  cb6f7e:	41 0f 10 47 10       	movups xmm0,XMMWORD PTR [r15+0x10]
827750-  cb6f83:	0f 29 84 24 10 02 00 	movaps XMMWORD PTR [rsp+0x210],xmm0
827751-  cb6f8a:	00 
827752-  cb6f8b:	48 85 c0             	test   rax,rax
827753-  cb6f8e:	74 05                	je     cb6f95 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203f35>
827754-  cb6f90:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
827755-  cb6f95:	4d 8b 7d 40          	mov    r15,QWORD PTR [r13+0x40]
827756-  cb6f99:	49 8b 75 38          	mov    rsi,QWORD PTR [r13+0x38]
827757-  cb6f9d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
--
896816-  cf7acc:	55                   	push   rbp
896817-  cf7acd:	41 57                	push   r15
896818-  cf7acf:	41 56                	push   r14
896819-  cf7ad1:	41 55                	push   r13
896820-  cf7ad3:	41 54                	push   r12
896821-  cf7ad5:	53                   	push   rbx
896822-  cf7ad6:	48 81 ec 98 00 00 00 	sub    rsp,0x98
896823-  cf7add:	49 89 cc             	mov    r12,rcx
896824-  cf7ae0:	48 89 d3             	mov    rbx,rdx
896825-  cf7ae3:	48 89 fd             	mov    rbp,rdi
896826-  cf7ae6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
896827-  cf7aed:	00 00 
896828-  cf7aef:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
896829-  cf7af6:	00 
896830-  cf7af7:	48 89 cf             	mov    rdi,rcx
896831-  cf7afa:	e8 75 b7 e6 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
896832-  cf7aff:	49 89 c7             	mov    r15,rax
896833-  cf7b02:	4c 89 e7             	mov    rdi,r12
896834:  cf7b05:	e8 02 9a e9 ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
896835-  cf7b0a:	49 89 c4             	mov    r12,rax
896836-  cf7b0d:	48 8b 73 38          	mov    rsi,QWORD PTR [rbx+0x38]
896837-  cf7b11:	48 8b 06             	mov    rax,QWORD PTR [rsi]
896838-  cf7b14:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
896839-  cf7b19:	ff 50 20             	call   QWORD PTR [rax+0x20]
896840-  cf7b1c:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
896841-  cf7b23:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
896842-  cf7b28:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
896843-  cf7b2c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
896844-  cf7b31:	4c 8b 73 30          	mov    r14,QWORD PTR [rbx+0x30]
896845-  cf7b35:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
896846-  cf7b39:	4c 89 e7             	mov    rdi,r12
896847-  cf7b3c:	ff 50 28             	call   QWORD PTR [rax+0x28]
896848-  cf7b3f:	49 89 c5             	mov    r13,rax
896849-  cf7b42:	48 8b 83 78 01 00 00 	mov    rax,QWORD PTR [rbx+0x178]
896850-  cf7b49:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
896851-  cf7b4e:	6a 50                	push   0x50
896852-  cf7b50:	5f                   	pop    rdi
896853-  cf7b51:	e8 aa 63 af 00       	call   17edf00 <_Znwm@plt>
896854-  cf7b56:	48 89 c3             	mov    rbx,rax
896855-  cf7b59:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
896856-  cf7b5f:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
896857-  cf7b64:	66 0f ef c0          	pxor   xmm0,xmm0
896858-  cf7b68:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
896859-  cf7b6e:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
896860-  cf7b72:	48 8d 05 df 97 b2 00 	lea    rax,[rip+0xb297df]        # 1821358 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17018>
896861-  cf7b79:	48 89 03             	mov    QWORD PTR [rbx],rax
896862-  cf7b7c:	bf 08 01 00 00       	mov    edi,0x108
--
991730-  d4bfc2:	48 81 ec b8 01 00 00 	sub    rsp,0x1b8
991731-  d4bfc9:	48 89 cb             	mov    rbx,rcx
991732-  d4bfcc:	49 89 d5             	mov    r13,rdx
991733-  d4bfcf:	48 89 fd             	mov    rbp,rdi
991734-  d4bfd2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
991735-  d4bfd9:	00 00 
991736-  d4bfdb:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
991737-  d4bfe2:	00 
991738-  d4bfe3:	48 89 cf             	mov    rdi,rcx
991739-  d4bfe6:	e8 b5 72 e1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
991740-  d4bfeb:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
991741-  d4bff0:	48 89 df             	mov    rdi,rbx
991742-  d4bff3:	e8 9c bf e3 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
991743-  d4bff8:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
991744-  d4bffd:	48 89 df             	mov    rdi,rbx
991745-  d4c000:	e8 45 78 f0 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
991746-  d4c005:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
991747-  d4c00a:	48 89 df             	mov    rdi,rbx
991748:  d4c00d:	e8 b8 72 e1 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
991749-  d4c012:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
991750-  d4c019:	00 
991751-  d4c01a:	48 89 df             	mov    rdi,rbx
991752-  d4c01d:	e8 40 9c ef ff       	call   c45c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c02>
991753-  d4c022:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
991754-  d4c029:	00 
991755-  d4c02a:	48 89 df             	mov    rdi,rbx
991756-  d4c02d:	e8 5a 9c ef ff       	call   c45c8c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c2c>
991757-  d4c032:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
991758-  d4c039:	00 
991759-  d4c03a:	48 89 df             	mov    rdi,rbx
991760-  d4c03d:	e8 32 72 e1 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
991761-  d4c042:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
991762-  d4c049:	00 
991763-  d4c04a:	48 89 df             	mov    rdi,rbx
991764-  d4c04d:	e8 22 78 f0 ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
991765-  d4c052:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
991766-  d4c057:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
991767-  d4c05b:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
991768-  d4c05f:	6a 4c                	push   0x4c
991769-  d4c061:	5a                   	pop    rdx
991770-  d4c062:	e8 77 62 e1 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
991771-  d4c067:	48 8b 03             	mov    rax,QWORD PTR [rbx]
991772-  d4c06a:	4c 8b b0 60 02 00 00 	mov    r14,QWORD PTR [rax+0x260]
991773-  d4c071:	4d 85 f6             	test   r14,r14
991774-  d4c074:	0f 84 dd 03 00 00    	je     d4c457 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194dd>
991775-  d4c07a:	48 89 df             	mov    rdi,rbx
991776-  d4c07d:	e8 f8 56 ec ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
--
2247926- 11c70ff:	48 89 cb             	mov    rbx,rcx
2247927- 11c7102:	49 89 d4             	mov    r12,rdx
2247928- 11c7105:	49 89 fe             	mov    r14,rdi
2247929- 11c7108:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2247930- 11c710f:	00 00 
2247931- 11c7111:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
2247932- 11c7118:	00 
2247933- 11c7119:	48 8b 42 30          	mov    rax,QWORD PTR [rdx+0x30]
2247934- 11c711d:	48 8b 38             	mov    rdi,QWORD PTR [rax]
2247935- 11c7120:	48 8d 35 59 ec 26 ff 	lea    rsi,[rip+0xffffffffff26ec59]        # 435d80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7cf>
2247936- 11c7127:	48 8d 0d 66 ec 26 ff 	lea    rcx,[rip+0xffffffffff26ec66]        # 435d94 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7e3>
2247937- 11c712e:	6a 13                	push   0x13
2247938- 11c7130:	5a                   	pop    rdx
2247939- 11c7131:	6a 0a                	push   0xa
2247940- 11c7133:	41 58                	pop    r8
2247941- 11c7135:	45 31 c9             	xor    r9d,r9d
2247942- 11c7138:	e8 21 04 42 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
2247943- 11c713d:	48 89 df             	mov    rdi,rbx
2247944: 11c7140:	e8 85 c1 99 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
2247945- 11c7145:	49 89 c7             	mov    r15,rax
2247946- 11c7148:	48 89 df             	mov    rdi,rbx
2247947: 11c714b:	e8 bc a3 9c ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
2247948- 11c7150:	49 89 c5             	mov    r13,rax
2247949- 11c7153:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
2247950- 11c7158:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
2247951- 11c715d:	49 8b 5c 24 60       	mov    rbx,QWORD PTR [r12+0x60]
2247952- 11c7162:	48 8d 35 be 6e 19 ff 	lea    rsi,[rip+0xffffffffff196ebe]        # 35e027 <_ZTSSt12bad_any_cast@@Base-0x321a1>
2247953- 11c7169:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
2247954- 11c7170:	00 
2247955- 11c7171:	e8 08 29 8b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2247956- 11c7176:	48 8d 2d ff ad 28 ff 	lea    rbp,[rip+0xffffffffff28adff]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
2247957- 11c717d:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
2247958- 11c7184:	00 
2247959- 11c7185:	48 89 ee             	mov    rsi,rbp
2247960- 11c7188:	e8 f1 28 8b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2247961- 11c718d:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
2247962- 11c7192:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
2247963- 11c7197:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
2247964- 11c719a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2247965- 11c71a1:	00 
2247966- 11c71a2:	48 8d 9c 24 90 02 00 	lea    rbx,[rsp+0x290]
2247967- 11c71a9:	00 
2247968- 11c71aa:	4c 8d b4 24 a0 01 00 	lea    r14,[rsp+0x1a0]
2247969- 11c71b1:	00 
2247970- 11c71b2:	48 89 da             	mov    rdx,rbx
2247971- 11c71b5:	4c 89 f1             	mov    rcx,r14
2247972- 11c71b8:	e8 33 be 44 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
2247973- 11c71bd:	4c 89 f7             	mov    rdi,r14
2247974- 11c71c0:	e8 cb 6c 62 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2247975- 11c71c5:	48 89 df             	mov    rdi,rbx
--
2692416- 135c881:	53                   	push   rbx
2692417- 135c882:	48 81 ec 68 03 00 00 	sub    rsp,0x368
2692418- 135c889:	49 89 cf             	mov    r15,rcx
2692419- 135c88c:	48 89 d5             	mov    rbp,rdx
2692420- 135c88f:	48 89 bc 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rdi
2692421- 135c896:	00 
2692422- 135c897:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2692423- 135c89e:	00 00 
2692424- 135c8a0:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
2692425- 135c8a7:	00 
2692426- 135c8a8:	48 89 cf             	mov    rdi,rcx
2692427- 135c8ab:	e8 de a3 95 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
2692428- 135c8b0:	49 89 c4             	mov    r12,rax
2692429- 135c8b3:	4c 89 ff             	mov    rdi,r15
2692430- 135c8b6:	e8 8f 6f 8f ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
2692431- 135c8bb:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
2692432- 135c8c2:	00 
2692433- 135c8c3:	4c 89 ff             	mov    rdi,r15
2692434: 135c8c6:	e8 ff 69 80 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
2692435- 135c8cb:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
2692436- 135c8d2:	00 
2692437- 135c8d3:	4c 89 ff             	mov    rdi,r15
2692438- 135c8d6:	e8 b9 b6 82 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
2692439- 135c8db:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
2692440- 135c8e2:	00 
2692441- 135c8e3:	4c 89 ff             	mov    rdi,r15
2692442- 135c8e6:	e8 d3 b6 82 ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
2692443- 135c8eb:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
2692444- 135c8f2:	00 
2692445- 135c8f3:	4c 89 ff             	mov    rdi,r15
2692446- 135c8f6:	e8 55 4e 8b ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
2692447- 135c8fb:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
2692448- 135c902:	00 
2692449- 135c903:	4c 89 ff             	mov    rdi,r15
2692450- 135c906:	e8 69 6f 8f ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
2692451- 135c90b:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
2692452- 135c912:	00 
2692453- 135c913:	4c 89 ff             	mov    rdi,r15
2692454- 135c916:	e8 ad ab 95 ff       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
2692455- 135c91b:	49 89 c5             	mov    r13,rax
2692456- 135c91e:	4c 89 ff             	mov    rdi,r15
2692457: 135c921:	e8 e6 4b 83 ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
2692458- 135c926:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
2692459- 135c92d:	00 
2692460- 135c92e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
2692461- 135c932:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
2692462- 135c936:	ba b7 00 00 00       	mov    edx,0xb7
2692463- 135c93b:	e8 9e 59 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
2692464- 135c940:	49 8b 07             	mov    rax,QWORD PTR [r15]
2692465- 135c943:	48 8b 80 b8 05 00 00 	mov    rax,QWORD PTR [rax+0x5b8]
2692466- 135c94a:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
2692467- 135c951:	00 
2692468- 135c952:	48 85 c0             	test   rax,rax
2692469- 135c955:	0f 84 f4 05 00 00    	je     135cf4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a24d3>
2692470- 135c95b:	4c 89 ff             	mov    rdi,r15
2692471- 135c95e:	e8 3d 69 80 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2692472- 135c963:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
2692473- 135c96a:	00 
2692474- 135c96b:	4c 89 ff             	mov    rdi,r15
2692475- 135c96e:	e8 07 4e 8b ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
2692476- 135c973:	48 89 c3             	mov    rbx,rax
2692477- 135c976:	4c 89 ff             	mov    rdi,r15
2692478- 135c979:	e8 74 ab 95 ff       	call   cb74f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204492>
2692479- 135c97e:	49 89 c6             	mov    r14,rax
2692480- 135c981:	4c 89 ff             	mov    rdi,r15
2692481- 135c984:	e8 bf ab 95 ff       	call   cb7548 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044e8>
2692482- 135c989:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
2692483- 135c990:	00 
2692484- 135c991:	4c 89 ff             	mov    rdi,r15
2692485- 135c994:	e8 9d a3 95 ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
--
2770670- 13a5df1:	cc                   	int3
2770671- 13a5df2:	55                   	push   rbp
2770672- 13a5df3:	41 57                	push   r15
2770673- 13a5df5:	41 56                	push   r14
2770674- 13a5df7:	41 55                	push   r13
2770675- 13a5df9:	41 54                	push   r12
2770676- 13a5dfb:	53                   	push   rbx
2770677- 13a5dfc:	48 83 ec 68          	sub    rsp,0x68
2770678- 13a5e00:	48 89 cb             	mov    rbx,rcx
2770679- 13a5e03:	49 89 d6             	mov    r14,rdx
2770680- 13a5e06:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
2770681- 13a5e0b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2770682- 13a5e12:	00 00 
2770683- 13a5e14:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
2770684- 13a5e19:	48 89 cf             	mov    rdi,rcx
2770685- 13a5e1c:	e8 9d 21 7e ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
2770686- 13a5e21:	49 89 c4             	mov    r12,rax
2770687- 13a5e24:	48 89 df             	mov    rdi,rbx
2770688: 13a5e27:	e8 e0 b6 7e ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
2770689- 13a5e2c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
2770690- 13a5e31:	4d 8b 7e 30          	mov    r15,QWORD PTR [r14+0x30]
2770691- 13a5e35:	49 8b 86 78 01 00 00 	mov    rax,QWORD PTR [r14+0x178]
2770692- 13a5e3c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2770693- 13a5e41:	bf a0 00 00 00       	mov    edi,0xa0
2770694- 13a5e46:	e8 b5 80 44 00       	call   17edf00 <_Znwm@plt>
2770695- 13a5e4b:	48 89 c3             	mov    rbx,rax
2770696- 13a5e4e:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
2770697- 13a5e52:	48 8d 05 5f 48 4c 00 	lea    rax,[rip+0x4c485f]        # 186a6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26da0>
2770698- 13a5e59:	48 89 03             	mov    QWORD PTR [rbx],rax
2770699- 13a5e5c:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
2770700- 13a5e61:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
2770701- 13a5e66:	4c 8d 6b 10          	lea    r13,[rbx+0x10]
2770702- 13a5e6a:	48 83 a3 90 00 00 00 	and    QWORD PTR [rbx+0x90],0x0
2770703- 13a5e71:	00 
2770704- 13a5e72:	48 8d 6b 40          	lea    rbp,[rbx+0x40]
2770705- 13a5e76:	48 89 d8             	mov    rax,rbx
2770706- 13a5e79:	48 83 c0 70          	add    rax,0x70
2770707- 13a5e7d:	48 89 04 24          	mov    QWORD PTR [rsp],rax
2770708- 13a5e81:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
2770709- 13a5e84:	48 8d 35 65 85 03 ff 	lea    rsi,[rip+0xffffffffff038565]        # 3de3f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3e3f>
2770710- 13a5e8b:	48 8d 0d 7e 85 03 ff 	lea    rcx,[rip+0xffffffffff03857e]        # 3de410 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3e5f>
2770711- 13a5e92:	6a 19                	push   0x19
2770712- 13a5e94:	5a                   	pop    rdx
2770713- 13a5e95:	6a 1f                	push   0x1f
2770714- 13a5e97:	41 58                	pop    r8
2770715- 13a5e99:	45 31 c9             	xor    r9d,r9d
2770716- 13a5e9c:	e8 e9 14 24 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
