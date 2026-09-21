# Service184 type-erased table trace

## e261e6 (+0x578 member copy/assignment)

/tmp/s184erase/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000e260f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3176>:
  e260f0:	e8 ed 86 c7 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
  e260f5:	49 89 06             	mov    QWORD PTR [r14],rax
  e260f8:	49 ff 4e 10          	dec    QWORD PTR [r14+0x10]
  e260fc:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  e26100:	48 89 de             	mov    rsi,rbx
  e26103:	e8 4a 3c c8 ff       	call   aa9d52 <JNI_OnUnload@@Base+0x3161f>
  e26108:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  e2610c:	e8 0f 00 00 00       	call   e26120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf31a6>
  e26111:	48 89 df             	mov    rdi,rbx
  e26114:	48 83 c4 08          	add    rsp,0x8
  e26118:	5b                   	pop    rbx
  e26119:	41 5e                	pop    r14
  e2611b:	e9 00 7e 9c 00       	jmp    17edf20 <_ZdlPv@plt>
  e26120:	53                   	push   rbx
  e26121:	48 89 fb             	mov    rbx,rdi
  e26124:	48 83 c7 20          	add    rdi,0x20
  e26128:	e8 8d fd ff ff       	call   e25eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2f40>
  e2612d:	48 89 df             	mov    rdi,rbx
  e26130:	5b                   	pop    rbx
  e26131:	e9 5a 7d 9c 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e26136:	53                   	push   rbx
  e26137:	48 89 fb             	mov    rbx,rdi
  e2613a:	e8 c1 46 84 00       	call   166a800 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e96c>
  e2613f:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e26143:	5b                   	pop    rbx
  e26144:	c3                   	ret
  e26145:	cc                   	int3
  e26146:	48 89 f2             	mov    rdx,rsi
  e26149:	80 3f 07             	cmp    BYTE PTR [rdi],0x7
  e2614c:	48 8d 05 fd ba 62 ff 	lea    rax,[rip+0xffffffffff62bafd]        # 451c50 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1785c>
  e26153:	48 0f 44 c7          	cmove  rax,rdi
  e26157:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
  e2615b:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
  e2615f:	e9 f8 8d d1 ff       	jmp    b3ef5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8befc>
  e26164:	41 57                	push   r15
  e26166:	41 56                	push   r14
  e26168:	41 54                	push   r12
  e2616a:	53                   	push   rbx
  e2616b:	48 81 ec 68 01 00 00 	sub    rsp,0x168
  e26172:	48 89 f3             	mov    rbx,rsi
  e26175:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e2617c:	00 00 
  e2617e:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
  e26185:	00 
  e26186:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
  e26189:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  e2618c:	49 8d 76 40          	lea    rsi,[r14+0x40]
  e26190:	49 89 e4             	mov    r12,rsp
  e26193:	4c 89 e7             	mov    rdi,r12
  e26196:	e8 81 e2 fd ff       	call   e0441c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd14a2>
  e2619b:	49 8b 96 a0 01 00 00 	mov    rdx,QWORD PTR [r14+0x1a0]
  e261a2:	49 83 c6 10          	add    r14,0x10
  e261a6:	4c 89 ff             	mov    rdi,r15
  e261a9:	4c 89 e6             	mov    rsi,r12
  e261ac:	48 89 d9             	mov    rcx,rbx
  e261af:	4d 89 f0             	mov    r8,r14
  e261b2:	e8 c3 eb ff ff       	call   e24d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf1e00>
  e261b7:	4c 89 e7             	mov    rdi,r12
  e261ba:	e8 f7 eb fc ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e261bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e261c6:	00 00 
  e261c8:	48 3b 84 24 60 01 00 	cmp    rax,QWORD PTR [rsp+0x160]
  e261cf:	00 
  e261d0:	75 0f                	jne    e261e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3267>
  e261d2:	48 81 c4 68 01 00 00 	add    rsp,0x168
  e261d9:	5b                   	pop    rbx
  e261da:	41 5c                	pop    r12
  e261dc:	41 5e                	pop    r14
  e261de:	41 5f                	pop    r15
  e261e0:	c3                   	ret
  e261e1:	e8 ca 98 9c 00       	call   17efab0 <__stack_chk_fail@plt>
  e261e6:	41 56                	push   r14
  e261e8:	53                   	push   rbx
  e261e9:	50                   	push   rax
  e261ea:	48 89 f3             	mov    rbx,rsi
  e261ed:	49 89 fe             	mov    r14,rdi
  e261f0:	e8 51 28 e8 ff       	call   ca8a46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59e6>
  e261f5:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  e261f8:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  e261fc:	4c 89 f7             	mov    rdi,r14
  e261ff:	e8 92 95 c7 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
  e26204:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  e26208:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  e2620c:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
  e26211:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
  e26215:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
  e26219:	f3 0f 10 43 20       	movss  xmm0,DWORD PTR [rbx+0x20]
  e2621e:	f3 41 0f 11 46 20    	movss  DWORD PTR [r14+0x20],xmm0
  e26224:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
  e26228:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  e2622c:	48 85 c9             	test   rcx,rcx
  e2622f:	74 38                	je     e26269 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf32ef>
  e26231:	48 83 c3 10          	add    rbx,0x10
  e26235:	49 8d 4e 10          	lea    rcx,[r14+0x10]
  e26239:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  e2623d:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
  e26241:	48 8d 56 ff          	lea    rdx,[rsi-0x1]
  e26245:	48 85 d6             	test   rsi,rdx
  e26248:	75 05                	jne    e2624f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf32d5>
  e2624a:	48 21 d0             	and    rax,rdx
  e2624d:	eb 0d                	jmp    e2625c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf32e2>
  e2624f:	48 39 f0             	cmp    rax,rsi
  e26252:	72 08                	jb     e2625c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf32e2>
  e26254:	31 d2                	xor    edx,edx
  e26256:	48 f7 f6             	div    rsi
  e26259:	48 89 d0             	mov    rax,rdx
  e2625c:	49 8b 16             	mov    rdx,QWORD PTR [r14]
  e2625f:	48 89 0c c2          	mov    QWORD PTR [rdx+rax*8],rcx
  e26263:	0f 57 c0             	xorps  xmm0,xmm0
  e26266:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  e26269:	48 83 c4 08          	add    rsp,0x8
  e2626d:	5b                   	pop    rbx
  e2626e:	41 5e                	pop    r14
  e26270:	c3                   	ret
  e26271:	cc                   	int3
  e26272:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  e26275:	e9 a0 08 00 00       	jmp    e26b1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3ba0>
  e2627a:	55                   	push   rbp
  e2627b:	41 57                	push   r15
  e2627d:	41 56                	push   r14
  e2627f:	41 55                	push   r13
  e26281:	41 54                	push   r12
  e26283:	53                   	push   rbx
  e26284:	50                   	push   rax
  e26285:	48 89 fb             	mov    rbx,rdi
  e26288:	48 83 c7 30          	add    rdi,0x30
  e2628c:	4c 8d b3 b8 0f 00 00 	lea    r14,[rbx+0xfb8]
  e26293:	80 bb b0 0f 00 00 00 	cmp    BYTE PTR [rbx+0xfb0],0x0
  e2629a:	74 3a                	je     e262d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf335c>
  e2629c:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e2629f:	48 3b 07             	cmp    rax,QWORD PTR [rdi]
  e262a2:	0f 8c f3 01 00 00    	jl     e2649b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3521>
  e262a8:	80 bb 38 1f 00 00 00 	cmp    BYTE PTR [rbx+0x1f38],0x0
  e262af:	74 3f                	je     e262f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3376>
  e262b1:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
  e262b5:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
  e262b9:	48 8d b3 c0 0f 00 00 	lea    rsi,[rbx+0xfc0]
  e262c0:	8a 43 50             	mov    al,BYTE PTR [rbx+0x50]
  e262c3:	3a 83 d8 0f 00 00    	cmp    al,BYTE PTR [rbx+0xfd8]
  e262c9:	75 36                	jne    e26301 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3387>
  e262cb:	84 c0                	test   al,al
  e262cd:	74 42                	je     e26311 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3397>
  e262cf:	e8 ac 7d 9c 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e262d4:	eb 3b                	jmp    e26311 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3397>
  e262d6:	80 bb 38 1f 00 00 00 	cmp    BYTE PTR [rbx+0x1f38],0x0
  e262dd:	0f 84 52 01 00 00    	je     e26435 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf34bb>
  e262e3:	4c 89 f6             	mov    rsi,r14
  e262e6:	e8 83 04 ff ff       	call   e1676e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe37f4>
  e262eb:	e9 45 01 00 00       	jmp    e26435 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf34bb>
  e262f0:	e8 47 04 ff ff       	call   e1673c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe37c2>
  e262f5:	c6 83 b0 0f 00 00 00 	mov    BYTE PTR [rbx+0xfb0],0x0
  e262fc:	e9 84 01 00 00       	jmp    e26485 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf350b>
  e26301:	84 c0                	test   al,al
  e26303:	74 07                	je     e2630c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3392>
  e26305:	e8 22 90 ca ff       	call   acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
  e2630a:	eb 05                	jmp    e26311 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3397>
  e2630c:	e8 89 64 ca ff       	call   acc79a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1973a>
  e26311:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
  e26315:	48 8d b3 e0 0f 00 00 	lea    rsi,[rbx+0xfe0]
  e2631c:	e8 57 50 84 00       	call   166b378 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f4e4>
  e26321:	4c 8d ab 48 0f 00 00 	lea    r13,[rbx+0xf48]
  e26328:	4c 8b bb d0 1e 00 00 	mov    r15,QWORD PTR [rbx+0x1ed0]
  e2632f:	4c 8b a3 d8 1e 00 00 	mov    r12,QWORD PTR [rbx+0x1ed8]
  e26336:	4c 89 e0             	mov    rax,r12
  e26339:	4c 29 f8             	sub    rax,r15
  e2633c:	be 00 03 00 00       	mov    esi,0x300
  e26341:	48 99                	cqo
  e26343:	48 f7 fe             	idiv   rsi
  e26346:	48 89 c5             	mov    rbp,rax
  e26349:	48 8b 8b 48 0f 00 00 	mov    rcx,QWORD PTR [rbx+0xf48]
  e26350:	48 8b 83 58 0f 00 00 	mov    rax,QWORD PTR [rbx+0xf58]
  e26357:	48 29 c8             	sub    rax,rcx
  e2635a:	48 99                	cqo
  e2635c:	48 f7 fe             	idiv   rsi
  e2635f:	48 39 e8             	cmp    rax,rbp
  e26362:	73 2b                	jae    e2638f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3415>
  e26364:	4c 89 ef             	mov    rdi,r13
  e26367:	e8 6a c2 ff ff       	call   e225d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef65c>
  e2636c:	48 8b bb 48 0f 00 00 	mov    rdi,QWORD PTR [rbx+0xf48]
  e26373:	48 8b b3 58 0f 00 00 	mov    rsi,QWORD PTR [rbx+0xf58]
  e2637a:	48 89 ea             	mov    rdx,rbp
  e2637d:	e8                   	.byte 0xe8
  e2637e:	8c 01                	mov    WORD PTR [rcx],es

## Source builder 133999a

/tmp/s184erase/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013398d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ee54>:
 13398d0:	5b                   	pop    rbx
 13398d1:	41 5c                	pop    r12
 13398d3:	41 5d                	pop    r13
 13398d5:	41 5e                	pop    r14
 13398d7:	41 5f                	pop    r15
 13398d9:	5d                   	pop    rbp
 13398da:	c3                   	ret
 13398db:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 13398e2:	00 00 
 13398e4:	48 3b 84 24 50 02 00 	cmp    rax,QWORD PTR [rsp+0x250]
 13398eb:	00 
 13398ec:	0f 85 a2 00 00 00    	jne    1339994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef18>
 13398f2:	e8 7c 0b 74 ff       	call   a7a473 <JNI_OnUnload@@Base+0x1d40>
 13398f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 13398fe:	00 00 
 1339900:	48 3b 84 24 50 02 00 	cmp    rax,QWORD PTR [rsp+0x250]
 1339907:	00 
 1339908:	0f 85 86 00 00 00    	jne    1339994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef18>
 133990e:	e8 ad ac 6c ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 1339913:	48 89 c3             	mov    rbx,rax
 1339916:	eb 4a                	jmp    1339962 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17eee6>
 1339918:	48 89 c3             	mov    rbx,rax
 133991b:	eb 52                	jmp    133996f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17eef3>
 133991d:	48 89 c3             	mov    rbx,rax
 1339920:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
 1339927:	00 
 1339928:	e8 ab 00 00 00       	call   13399d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef5c>
 133992d:	eb 4a                	jmp    1339979 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17eefd>
 133992f:	48 89 c3             	mov    rbx,rax
 1339932:	eb 21                	jmp    1339955 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17eed9>
 1339934:	48 89 c3             	mov    rbx,rax
 1339937:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
 133993e:	00 
 133993f:	e8 4c 45 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1339944:	eb 05                	jmp    133994b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17eecf>
 1339946:	eb 00                	jmp    1339948 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17eecc>
 1339948:	48 89 c3             	mov    rbx,rax
 133994b:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 1339950:	e8 33 01 00 00       	call   1339a88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f00c>
 1339955:	48 8b bc 24 10 02 00 	mov    rdi,QWORD PTR [rsp+0x210]
 133995c:	00 
 133995d:	e8 24 4b 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1339962:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
 1339969:	00 
 133996a:	e8 fb 05 74 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 133996f:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 1339974:	e8 cd f1 ff ff       	call   1338b46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e0ca>
 1339979:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1339980:	00 00 
 1339982:	48 3b 84 24 50 02 00 	cmp    rax,QWORD PTR [rsp+0x250]
 1339989:	00 
 133998a:	75 08                	jne    1339994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef18>
 133998c:	48 89 df             	mov    rdi,rbx
 133998f:	e8 3c 63 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1339994:	e8 17 61 4b 00       	call   17efab0 <__stack_chk_fail@plt>
 1339999:	cc                   	int3
 133999a:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 133999e:	74 01                	je     13399a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef25>
 13399a0:	c3                   	ret
 13399a1:	41 56                	push   r14
 13399a3:	53                   	push   rbx
 13399a4:	50                   	push   rax
 13399a5:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 13399a9:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
 13399ad:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
 13399b0:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 13399b3:	4c 39 f3             	cmp    rbx,r14
 13399b6:	74 18                	je     13399d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef54>
 13399b8:	48 83 c3 e8          	add    rbx,0xffffffffffffffe8
 13399bc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 13399bf:	48 89 df             	mov    rdi,rbx
 13399c2:	ff 10                	call   QWORD PTR [rax]
 13399c4:	48 8d 43 e8          	lea    rax,[rbx-0x18]
 13399c8:	4c 39 f3             	cmp    rbx,r14
 13399cb:	48 89 c3             	mov    rbx,rax
 13399ce:	75 ec                	jne    13399bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef40>
 13399d0:	48 83 c4 08          	add    rsp,0x8
 13399d4:	5b                   	pop    rbx
 13399d5:	41 5e                	pop    r14
 13399d7:	c3                   	ret
 13399d8:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
 13399dc:	0f 84 a0 f1 ff ff    	je     1338b82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e106>
 13399e2:	c3                   	ret
 13399e3:	cc                   	int3
 13399e4:	41 56                	push   r14
 13399e6:	53                   	push   rbx
 13399e7:	48 83 ec 38          	sub    rsp,0x38
 13399eb:	48 89 fb             	mov    rbx,rdi
 13399ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 13399f5:	00 00 
 13399f7:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 13399fc:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 13399ff:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
 1339a03:	48 29 f8             	sub    rax,rdi
 1339a06:	6a 18                	push   0x18
 1339a08:	41 58                	pop    r8
 1339a0a:	48 99                	cqo
 1339a0c:	49 f7 f8             	idiv   r8
 1339a0f:	48 39 f0             	cmp    rax,rsi
 1339a12:	73 42                	jae    1339a56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17efda>
 1339a14:	48 b8 ab aa aa aa aa 	movabs rax,0xaaaaaaaaaaaaaab
 1339a1b:	aa aa 0a 
 1339a1e:	48                   	rex.W
 1339a1f:	39                   	.byte 0x39

## Neighbor helpers 13399d8 / 13399e4

/tmp/s184erase/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013399b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef34>:
 13399b0:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 13399b3:	4c 39 f3             	cmp    rbx,r14
 13399b6:	74 18                	je     13399d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef54>
 13399b8:	48 83 c3 e8          	add    rbx,0xffffffffffffffe8
 13399bc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 13399bf:	48 89 df             	mov    rdi,rbx
 13399c2:	ff 10                	call   QWORD PTR [rax]
 13399c4:	48 8d 43 e8          	lea    rax,[rbx-0x18]
 13399c8:	4c 39 f3             	cmp    rbx,r14
 13399cb:	48 89 c3             	mov    rbx,rax
 13399ce:	75 ec                	jne    13399bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef40>
 13399d0:	48 83 c4 08          	add    rsp,0x8
 13399d4:	5b                   	pop    rbx
 13399d5:	41 5e                	pop    r14
 13399d7:	c3                   	ret
 13399d8:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
 13399dc:	0f 84 a0 f1 ff ff    	je     1338b82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e106>
 13399e2:	c3                   	ret
 13399e3:	cc                   	int3
 13399e4:	41 56                	push   r14
 13399e6:	53                   	push   rbx
 13399e7:	48 83 ec 38          	sub    rsp,0x38
 13399eb:	48 89 fb             	mov    rbx,rdi
 13399ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 13399f5:	00 00 
 13399f7:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 13399fc:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 13399ff:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
 1339a03:	48 29 f8             	sub    rax,rdi
 1339a06:	6a 18                	push   0x18
 1339a08:	41 58                	pop    r8
 1339a0a:	48 99                	cqo
 1339a0c:	49 f7 f8             	idiv   r8
 1339a0f:	48 39 f0             	cmp    rax,rsi
 1339a12:	73 42                	jae    1339a56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17efda>
 1339a14:	48 b8 ab aa aa aa aa 	movabs rax,0xaaaaaaaaaaaaaab
 1339a1b:	aa aa 0a 
 1339a1e:	48 39 c6             	cmp    rsi,rax
 1339a21:	73 4b                	jae    1339a6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17eff2>
 1339a23:	48 8d 4b 10          	lea    rcx,[rbx+0x10]
 1339a27:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 1339a2b:	48 29 f8             	sub    rax,rdi
 1339a2e:	48 99                	cqo
 1339a30:	49 f7 f8             	idiv   r8
 1339a33:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 1339a38:	4c 89 f7             	mov    rdi,r14
 1339a3b:	48 89 c2             	mov    rdx,rax
 1339a3e:	e8 79 1a 74 ff       	call   a7b4bc <JNI_OnUnload@@Base+0x2d89>
 1339a43:	48 89 df             	mov    rdi,rbx
 1339a46:	4c 89 f6             	mov    rsi,r14
 1339a49:	e8 5e 01 00 00       	call   1339bac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f130>
 1339a4e:	4c 89 f7             	mov    rdi,r14
 1339a51:	e8 ea 01 00 00       	call   1339c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f1c4>
 1339a56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1339a5d:	00 00 
 1339a5f:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 1339a64:	75 1d                	jne    1339a83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f007>
 1339a66:	48 83 c4 38          	add    rsp,0x38
 1339a6a:	5b                   	pop    rbx
 1339a6b:	41 5e                	pop    r14
 1339a6d:	c3                   	ret
 1339a6e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1339a75:	00 00 
 1339a77:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 1339a7c:	75 05                	jne    1339a83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f007>
 1339a7e:	e8                   	.byte 0xe8
 1339a7f:	3d                   	.byte 0x3d

## Calls to e261e6

## Calls to 133999a

## Vptr/table materializations near source builder
 1339a66:	48 83 c4 38          	add    rsp,0x38
 1339a6a:	5b                   	pop    rbx
 1339a6b:	41 5e                	pop    r14
 1339a6d:	c3                   	ret
 1339a6e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1339a75:	00 00 
 1339a77:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 1339a7c:	75 05                	jne    1339a83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f007>
 1339a7e:	e8 3d ab 6c ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 1339a83:	e8 28 60 4b 00       	call   17efab0 <__stack_chk_fail@plt>
 1339a88:	48 8d 05 51 ce 52 00 	lea    rax,[rip+0x52ce51]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
 1339a8f:	48 89 07             	mov    QWORD PTR [rdi],rax
 1339a92:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 1339a96:	e9 eb 49 76 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 1339a9b:	cc                   	int3
 1339a9c:	53                   	push   rbx
 1339a9d:	48 89 fb             	mov    rbx,rdi
 1339aa0:	6a 10                	push   0x10
 1339aa2:	5f                   	pop    rdi
 1339aa3:	e8 58 44 4b 00       	call   17edf00 <_Znwm@plt>
 1339aa8:	48 8d 0d c1 c4 52 00 	lea    rcx,[rip+0x52c4c1]        # 1865f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22658>
 1339aaf:	48 89 08             	mov    QWORD PTR [rax],rcx
 1339ab2:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 1339ab6:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 1339aba:	5b                   	pop    rbx
 1339abb:	c3                   	ret
 1339abc:	48 8d 05 ad c4 52 00 	lea    rax,[rip+0x52c4ad]        # 1865f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22658>
 1339ac3:	48 89 06             	mov    QWORD PTR [rsi],rax
 1339ac6:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 1339aca:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 1339ace:	c3                   	ret
 1339acf:	cc                   	int3
 1339ad0:	55                   	push   rbp
 1339ad1:	41 57                	push   r15
 1339ad3:	41 56                	push   r14
 1339ad5:	41 55                	push   r13
 1339ad7:	41 54                	push   r12
 1339ad9:	53                   	push   rbx
 1339ada:	48 83 ec 28          	sub    rsp,0x28
 1339ade:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1339ae5:	00 00 
 1339ae7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1339aec:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 1339af0:	4c 8b b0 58 02 00 00 	mov    r14,QWORD PTR [rax+0x258]
 1339af7:	4c 8b a8 60 02 00 00 	mov    r13,QWORD PTR [rax+0x260]
