# ad_skip expiry -> restriction-owner state trace

Known anchors:
- ad delay parser: nested ad-object vtable +0xe8 -> 0x14e24e8
- ad_skip timer/event constructor sites: 0x139ba71 and 0x139be38
- generic schedule helper: 0x139c09a
- subtype-6 owner consumer: 0x10a9668
- restriction rebuild: 0x10a6464
- nested optional reset: 0x1089a72
- lower state copy assignment: 0x1089f9e
- owner wrapper around reset: 0x10a9e38
- owner state copy wrapper: 0x10a9fbe

## Generic event/timer schedule helper 0x139c09a
FDE: 0x139c09a..0x139c1be (size 0x124)
     139c09a:	41 57                	push   r15
     139c09c:	41 56                	push   r14
     139c09e:	41 55                	push   r13
     139c0a0:	41 54                	push   r12
     139c0a2:	53                   	push   rbx
     139c0a3:	48 83 ec 30          	sub    rsp,0x30
     139c0a7:	49 89 f6             	mov    r14,rsi
     139c0aa:	48 89 fb             	mov    rbx,rdi
     139c0ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139c0b4:	00 00 
     139c0b6:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     139c0bb:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
     139c0bf:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
     139c0c3:	49 39 f7             	cmp    r15,rsi
     139c0c6:	73 41                	jae    139c109 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e168d>
     139c0c8:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     139c0cc:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     139c0d0:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     139c0d4:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     139c0d8:	0f 57 c0             	xorps  xmm0,xmm0
     139c0db:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     139c0e0:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     139c0e4:	41 8a 46 38          	mov    al,BYTE PTR [r14+0x38]
     139c0e8:	41 88 47 38          	mov    BYTE PTR [r15+0x38],al
     139c0ec:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
     139c0f1:	41 0f 10 4e 28       	movups xmm1,XMMWORD PTR [r14+0x28]
     139c0f6:	41 0f 11 4f 28       	movups XMMWORD PTR [r15+0x28],xmm1
     139c0fb:	41 0f 11 47 18       	movups XMMWORD PTR [r15+0x18],xmm0
     139c100:	49 83 c7 40          	add    r15,0x40
     139c104:	e9 8e 00 00 00       	jmp    139c197 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e171b>
     139c109:	4c 8d 6b 10          	lea    r13,[rbx+0x10]
     139c10d:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     139c110:	49 29 ff             	sub    r15,rdi
     139c113:	49 c1 ff 06          	sar    r15,0x6
     139c117:	49 ff c7             	inc    r15
     139c11a:	4c 89 fa             	mov    rdx,r15
     139c11d:	e8 20 a9 93 ff       	call   cd6a42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2239e2>
     139c122:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     139c126:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
     139c129:	48 c1 fa 06          	sar    rdx,0x6
     139c12d:	49 89 e4             	mov    r12,rsp
     139c130:	4c 89 e7             	mov    rdi,r12
     139c133:	48 89 c6             	mov    rsi,rax
     139c136:	4c 89 e9             	mov    rcx,r13
     139c139:	e8 7e ef a0 ff       	call   dab0bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78142>
     139c13e:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     139c143:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
     139c147:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     139c14b:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     139c14f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     139c152:	0f 57 c0             	xorps  xmm0,xmm0
     139c155:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     139c159:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     139c15e:	41 8a 4e 38          	mov    cl,BYTE PTR [r14+0x38]
     139c162:	88 48 38             	mov    BYTE PTR [rax+0x38],cl
     139c165:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
     139c16a:	41 0f 10 4e 28       	movups xmm1,XMMWORD PTR [r14+0x28]
     139c16f:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
     139c173:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
     139c177:	48 83 c0 40          	add    rax,0x40
     139c17b:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
     139c180:	48 89 df             	mov    rdi,rbx
     139c183:	4c 89 e6             	mov    rsi,r12
     139c186:	e8 d1 19 ff ff       	call   138db5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d30e0>
     139c18b:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
     139c18f:	4c 89 e7             	mov    rdi,r12
     139c192:	e8 55 f1 d5 ff       	call   10fb2ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c2702>
     139c197:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
     139c19b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139c1a2:	00 00 
     139c1a4:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     139c1a9:	75 0e                	jne    139c1b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e173d>
     139c1ab:	48 83 c4 30          	add    rsp,0x30
     139c1af:	5b                   	pop    rbx
     139c1b0:	41 5c                	pop    r12
     139c1b2:	41 5d                	pop    r13
     139c1b4:	41 5e                	pop    r14
     139c1b6:	41 5f                	pop    r15
     139c1b8:	c3                   	ret
     139c1b9:	e8 f2 38 45 00       	call   17efab0 <__stack_chk_fail@plt>

## Subtype-6 restriction-owner consumer 0x10a9668
FDE: 0x10a9668..0x10a969c (size 0x34)
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret

## Lower owner-state copy assignment 0x1089f9e
FDE: 0x1089f9e..0x108a477 (size 0x4d9)
     1089f9e:	55                   	push   rbp
     1089f9f:	41 57                	push   r15
     1089fa1:	41 56                	push   r14
     1089fa3:	41 55                	push   r13
     1089fa5:	41 54                	push   r12
     1089fa7:	53                   	push   rbx
     1089fa8:	48 83 ec 38          	sub    rsp,0x38
     1089fac:	49 89 f6             	mov    r14,rsi
     1089faf:	48 89 fb             	mov    rbx,rdi
     1089fb2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1089fb9:	00 00 
     1089fbb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1089fc0:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     1089fc3:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     1089fc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1089fcc:	48 83 c7 10          	add    rdi,0x10
     1089fd0:	48 83 c6 10          	add    rsi,0x10
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12
     108a02a:	4c 29 e8             	sub    rax,r13
     108a02d:	bf 50 05 00 00       	mov    edi,0x550
     108a032:	48 99                	cqo
     108a034:	48 f7 ff             	idiv   rdi
     108a037:	48 89 c5             	mov    rbp,rax
     108a03a:	48 8b 8b 68 05 00 00 	mov    rcx,QWORD PTR [rbx+0x568]
     108a041:	48 8b b3 78 05 00 00 	mov    rsi,QWORD PTR [rbx+0x578]
     108a048:	48 89 f0             	mov    rax,rsi
     108a04b:	48 29 c8             	sub    rax,rcx
     108a04e:	48 99                	cqo
     108a050:	48 f7 ff             	idiv   rdi
     108a053:	48 39 e8             	cmp    rax,rbp
     108a056:	73 48                	jae    108a0a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2514b6>
     108a058:	48 85 c9             	test   rcx,rcx
     108a05b:	74 1e                	je     108a07b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251491>
     108a05d:	4c 89 ff             	mov    rdi,r15
     108a060:	e8 45 fc ff ff       	call   1089caa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c0>
     108a065:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     108a068:	e8 b3 3e 76 00       	call   17edf20 <_ZdlPv@plt>
     108a06d:	0f 57 c0             	xorps  xmm0,xmm0
     108a070:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     108a074:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     108a079:	31 f6                	xor    esi,esi
     108a07b:	31 ff                	xor    edi,edi
     108a07d:	48 89 ea             	mov    rdx,rbp
     108a080:	e8 5f 37 00 00       	call   108d7e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254bfa>
     108a085:	4c 89 ff             	mov    rdi,r15
     108a088:	48 89 c6             	mov    rsi,rax
     108a08b:	e8 9c 37 00 00       	call   108d82c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c42>
     108a090:	4c 89 ff             	mov    rdi,r15
     108a093:	4c 89 ee             	mov    rsi,r13
     108a096:	4c 89 e2             	mov    rdx,r12
     108a099:	e8 66 36 00 00       	call   108d704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b1a>
     108a09e:	eb 55                	jmp    108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a0a0:	4c 8b b3 70 05 00 00 	mov    r14,QWORD PTR [rbx+0x570]
     108a0a7:	49 29 ce             	sub    r14,rcx
     108a0aa:	4c 89 f0             	mov    rax,r14
     108a0ad:	48 99                	cqo
     108a0af:	48 f7 ff             	idiv   rdi
     108a0b2:	48 39 e8             	cmp    rax,rbp
     108a0b5:	73 21                	jae    108a0d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2514ee>
     108a0b7:	4d 01 ee             	add    r14,r13
     108a0ba:	4c 89 ef             	mov    rdi,r13
     108a0bd:	4c 89 f6             	mov    rsi,r14
     108a0c0:	48 89 ca             	mov    rdx,rcx
     108a0c3:	e8 fa 35 00 00       	call   108d6c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ad8>
     108a0c8:	4c 89 ff             	mov    rdi,r15
     108a0cb:	4c 89 f6             	mov    rsi,r14
     108a0ce:	4c 89 e2             	mov    rdx,r12
     108a0d1:	e8 2e 36 00 00       	call   108d704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b1a>
     108a0d6:	eb 19                	jmp    108a0f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251507>
     108a0d8:	4c 89 ef             	mov    rdi,r13
     108a0db:	4c 89 e6             	mov    rsi,r12
     108a0de:	48 89 ca             	mov    rdx,rcx
     108a0e1:	e8 dc 35 00 00       	call   108d6c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ad8>
     108a0e6:	4c 89 ff             	mov    rdi,r15
     108a0e9:	48 89 c6             	mov    rsi,rax
     108a0ec:	e8 c1 fb ff ff       	call   1089cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c8>
     108a0f1:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
     108a0f5:	be 80 05 00 00       	mov    esi,0x580
     108a0fa:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108a0fe:	4c 01 f6             	add    rsi,r14
     108a101:	e8 92 25 00 00       	call   108c698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253aae>
     108a106:	be 98 05 00 00       	mov    esi,0x598
     108a10b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108a10f:	4c 01 f6             	add    rsi,r14
     108a112:	e8 81 25 00 00       	call   108c698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253aae>
     108a117:	be b0 05 00 00       	mov    esi,0x5b0
     108a11c:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108a120:	4c 01 f6             	add    rsi,r14
     108a123:	e8 58 3f 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108a128:	be c8 05 00 00       	mov    esi,0x5c8
     108a12d:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108a131:	4c 01 f6             	add    rsi,r14
     108a134:	e8 3f 26 00 00       	call   108c778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b8e>
     108a139:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
     108a13e:	4c 39 f3             	cmp    rbx,r14
     108a141:	0f 84 f1 02 00 00    	je     108a438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25184e>
     108a147:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     108a14c:	4c 8d be f8 05 00 00 	lea    r15,[rsi+0x5f8]
     108a153:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     108a157:	4c 8b a0 f8 05 00 00 	mov    r12,QWORD PTR [rax+0x5f8]
     108a15e:	4c 8d b0 00 06 00 00 	lea    r14,[rax+0x600]
     108a165:	48 83 be 08 06 00 00 	cmp    QWORD PTR [rsi+0x608],0x0
     108a16c:	00 
     108a16d:	0f 84 d4 00 00 00    	je     108a247 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25165d>
     108a173:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     108a178:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     108a17b:	48 8d 86 00 06 00 00 	lea    rax,[rsi+0x600]
     108a182:	48 8b 8e f8 05 00 00 	mov    rcx,QWORD PTR [rsi+0x5f8]
     108a189:	48 8b 96 00 06 00 00 	mov    rdx,QWORD PTR [rsi+0x600]
     108a190:	48 89 86 f8 05 00 00 	mov    QWORD PTR [rsi+0x5f8],rax
     108a197:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     108a19c:	0f 57 c0             	xorps  xmm0,xmm0
     108a19f:	0f 11 86 00 06 00 00 	movups XMMWORD PTR [rsi+0x600],xmm0
     108a1a6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     108a1aa:	48 85 c0             	test   rax,rax
     108a1ad:	48 0f 44 c1          	cmove  rax,rcx
     108a1b1:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     108a1b5:	48 89 df             	mov    rdi,rbx
     108a1b8:	e8 e9 5e a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
     108a1bd:	4c 8b 6b 10          	mov    r13,QWORD PTR [rbx+0x10]
     108a1c1:	4d 85 ed             	test   r13,r13
     108a1c4:	74 58                	je     108a21e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251634>
     108a1c6:	4d 39 f4             	cmp    r12,r14
     108a1c9:	74 53                	je     108a21e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251634>
     108a1cb:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
     108a1d0:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     108a1d5:	41 8b 54 24 1c       	mov    edx,DWORD PTR [r12+0x1c]
     108a1da:	41 89 55 1c          	mov    DWORD PTR [r13+0x1c],edx
     108a1de:	4c 89 ff             	mov    rdi,r15
     108a1e1:	48 89 ee             	mov    rsi,rbp
     108a1e4:	e8 0b 5f a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
     108a1e9:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     108a1ee:	4c 89 ff             	mov    rdi,r15
     108a1f1:	48 89 c2             	mov    rdx,rax
     108a1f4:	4c 89 e9             	mov    rcx,r13
     108a1f7:	e8 70 59 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     108a1fc:	48 89 df             	mov    rdi,rbx
     108a1ff:	e8 a2 5e a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
     108a204:	4c 89 e7             	mov    rdi,r12
     108a207:	e8 d6 45 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     108a20c:	49 89 c4             	mov    r12,rax
     108a20f:	4c 8b 6c 24 28       	mov    r13,QWORD PTR [rsp+0x28]
     108a214:	4d 85 ed             	test   r13,r13
     108a217:	74 05                	je     108a21e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251634>
     108a219:	4d 39 f4             	cmp    r12,r14
     108a21c:	75 b7                	jne    108a1d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2515eb>
     108a21e:	4c 89 ef             	mov    rdi,r13
     108a221:	e8 9a 43 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     108a226:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     108a22b:	48 85 ff             	test   rdi,rdi
     108a22e:	74 17                	je     108a247 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25165d>
     108a230:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     108a234:	48 85 c0             	test   rax,rax
     108a237:	74 09                	je     108a242 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251658>
     108a239:	48 89 c7             	mov    rdi,rax
     108a23c:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     108a240:	eb f2                	jmp    108a234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25164a>
     108a242:	e8 79 43 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     108a247:	4d 39 f4             	cmp    r12,r14
     108a24a:	74 6c                	je     108a2b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2516ce>
     108a24c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     108a251:	4c 8d a8 00 06 00 00 	lea    r13,[rax+0x600]
     108a258:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
     108a25d:	6a 20                	push   0x20
     108a25f:	5f                   	pop    rdi
     108a260:	e8 9b 3c 76 00       	call   17edf00 <_Znwm@plt>
     108a265:	48 89 c3             	mov    rbx,rax
     108a268:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
     108a26d:	41 8b 54 24 1c       	mov    edx,DWORD PTR [r12+0x1c]
     108a272:	89 50 1c             	mov    DWORD PTR [rax+0x1c],edx
     108a275:	c6 44 24 28 01       	mov    BYTE PTR [rsp+0x28],0x1
     108a27a:	4c 89 ff             	mov    rdi,r15
     108a27d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     108a282:	e8 6d 5e a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
     108a287:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     108a28c:	4c 89 ff             	mov    rdi,r15
     108a28f:	48 89 c2             	mov    rdx,rax
     108a292:	48 89 d9             	mov    rcx,rbx
     108a295:	e8 d2 58 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     108a29a:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     108a2a0:	48 89 ef             	mov    rdi,rbp
     108a2a3:	e8 22 00 9f ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     108a2a8:	4c 89 e7             	mov    rdi,r12
     108a2ab:	e8 32 45 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     108a2b0:	49 89 c4             	mov    r12,rax
     108a2b3:	4c 39 f0             	cmp    rax,r14
     108a2b6:	75 a5                	jne    108a25d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251673>
     108a2b8:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     108a2bc:	48 39 44 24 08       	cmp    QWORD PTR [rsp+0x8],rax
     108a2c1:	0f 84 71 01 00 00    	je     108a438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25184e>
     108a2c7:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     108a2cc:	4c 8d be 10 06 00 00 	lea    r15,[rsi+0x610]
     108a2d3:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     108a2d7:	4c 8b a0 10 06 00 00 	mov    r12,QWORD PTR [rax+0x610]
     108a2de:	4c 8d b0 18 06 00 00 	lea    r14,[rax+0x618]
     108a2e5:	48 83 be 20 06 00 00 	cmp    QWORD PTR [rsi+0x620],0x0
     108a2ec:	00 
     108a2ed:	0f 84 d4 00 00 00    	je     108a3c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517dd>
     108a2f3:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     108a2f8:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     108a2fb:	48 8d 86 18 06 00 00 	lea    rax,[rsi+0x618]
     108a302:	48 8b 8e 10 06 00 00 	mov    rcx,QWORD PTR [rsi+0x610]
     108a309:	48 8b 96 18 06 00 00 	mov    rdx,QWORD PTR [rsi+0x618]
     108a310:	48 89 86 10 06 00 00 	mov    QWORD PTR [rsi+0x610],rax
     108a317:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     108a31c:	0f 57 c0             	xorps  xmm0,xmm0
     108a31f:	0f 11 86 18 06 00 00 	movups XMMWORD PTR [rsi+0x618],xmm0
     108a326:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     108a32a:	48 85 c0             	test   rax,rax
     108a32d:	48 0f 44 c1          	cmove  rax,rcx
     108a331:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     108a335:	48 89 df             	mov    rdi,rbx
     108a338:	e8 69 5d a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
     108a33d:	4c 8b 6b 10          	mov    r13,QWORD PTR [rbx+0x10]
     108a341:	4d 85 ed             	test   r13,r13
     108a344:	74 58                	je     108a39e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517b4>
     108a346:	4d 39 f4             	cmp    r12,r14
     108a349:	74 53                	je     108a39e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517b4>
     108a34b:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
     108a350:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     108a355:	41 8b 54 24 1c       	mov    edx,DWORD PTR [r12+0x1c]
     108a35a:	41 89 55 1c          	mov    DWORD PTR [r13+0x1c],edx
     108a35e:	4c 89 ff             	mov    rdi,r15
     108a361:	48 89 ee             	mov    rsi,rbp
     108a364:	e8 8b 5d a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
     108a369:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     108a36e:	4c 89 ff             	mov    rdi,r15
     108a371:	48 89 c2             	mov    rdx,rax
     108a374:	4c 89 e9             	mov    rcx,r13
     108a377:	e8 f0 57 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     108a37c:	48 89 df             	mov    rdi,rbx
     108a37f:	e8 22 5d a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
     108a384:	4c 89 e7             	mov    rdi,r12
     108a387:	e8 56 44 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     108a38c:	49 89 c4             	mov    r12,rax
     108a38f:	4c 8b 6c 24 28       	mov    r13,QWORD PTR [rsp+0x28]
     108a394:	4d 85 ed             	test   r13,r13
     108a397:	74 05                	je     108a39e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517b4>
     108a399:	4d 39 f4             	cmp    r12,r14
     108a39c:	75 b7                	jne    108a355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25176b>
     108a39e:	4c 89 ef             	mov    rdi,r13
     108a3a1:	e8 1a 42 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     108a3a6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     108a3ab:	48 85 ff             	test   rdi,rdi
     108a3ae:	74 17                	je     108a3c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517dd>
     108a3b0:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     108a3b4:	48 85 c0             	test   rax,rax
     108a3b7:	74 09                	je     108a3c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517d8>
     108a3b9:	48 89 c7             	mov    rdi,rax
     108a3bc:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     108a3c0:	eb f2                	jmp    108a3b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517ca>
     108a3c2:	e8 f9 41 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     108a3c7:	4d 39 f4             	cmp    r12,r14
     108a3ca:	74 6c                	je     108a438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25184e>
     108a3cc:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     108a3d1:	4c 8d a8 18 06 00 00 	lea    r13,[rax+0x618]
     108a3d8:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
     108a3dd:	6a 20                	push   0x20
     108a3df:	5f                   	pop    rdi
     108a3e0:	e8 1b 3b 76 00       	call   17edf00 <_Znwm@plt>
     108a3e5:	48 89 c3             	mov    rbx,rax
     108a3e8:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
     108a3ed:	41 8b 54 24 1c       	mov    edx,DWORD PTR [r12+0x1c]
     108a3f2:	89 50 1c             	mov    DWORD PTR [rax+0x1c],edx
     108a3f5:	c6 44 24 28 01       	mov    BYTE PTR [rsp+0x28],0x1
     108a3fa:	4c 89 ff             	mov    rdi,r15
     108a3fd:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     108a402:	e8 ed 5c a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
     108a407:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     108a40c:	4c 89 ff             	mov    rdi,r15
     108a40f:	48 89 c2             	mov    rdx,rax
     108a412:	48 89 d9             	mov    rcx,rbx
     108a415:	e8 52 57 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     108a41a:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     108a420:	48 89 ef             	mov    rdi,rbp
     108a423:	e8 a2 fe 9e ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     108a428:	4c 89 e7             	mov    rdi,r12
     108a42b:	e8 b2 43 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     108a430:	49 89 c4             	mov    r12,rax
     108a433:	4c 39 f0             	cmp    rax,r14
     108a436:	75 a5                	jne    108a3dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517f3>
     108a438:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108a43f:	00 00 
     108a441:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     108a446:	75 2a                	jne    108a472 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251888>
     108a448:	ba 28 06 00 00       	mov    edx,0x628
     108a44d:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     108a452:	48 8d 0c 10          	lea    rcx,[rax+rdx*1]
     108a456:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     108a45a:	48 01 d6             	add    rsi,rdx
     108a45d:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     108a460:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     108a463:	48 83 c4 38          	add    rsp,0x38
     108a467:	5b                   	pop    rbx
     108a468:	41 5c                	pop    r12
     108a46a:	41 5d                	pop    r13
     108a46c:	41 5e                	pop    r14
     108a46e:	41 5f                	pop    r15
     108a470:	5d                   	pop    rbp
     108a471:	c3                   	ret
     108a472:	e8 39 56 76 00       	call   17efab0 <__stack_chk_fail@plt>

## Owner wrapper around lower state copy 0x10a9fbe
FDE: 0x10a9fbe..0x10aa1f1 (size 0x233)
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx
     10a9fc8:	50                   	push   rax
     10a9fc9:	49 89 f6             	mov    r14,rsi
     10a9fcc:	48 89 fb             	mov    rbx,rdi
     10a9fcf:	e8 ca ff fd ff       	call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>
     10a9fd4:	49 8b 86 38 06 00 00 	mov    rax,QWORD PTR [r14+0x638]
     10a9fdb:	48 89 83 38 06 00 00 	mov    QWORD PTR [rbx+0x638],rax
     10a9fe2:	be 40 06 00 00       	mov    esi,0x640
     10a9fe7:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10a9feb:	4c 01 f6             	add    rsi,r14
     10a9fee:	e8 8d 40 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10a9ff3:	be 58 06 00 00       	mov    esi,0x658
     10a9ff8:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10a9ffc:	4c 01 f6             	add    rsi,r14
     10a9fff:	e8 7c 40 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa004:	41 0f 10 86 70 06 00 	movups xmm0,XMMWORD PTR [r14+0x670]
     10aa00b:	00 
     10aa00c:	0f 11 83 70 06 00 00 	movups XMMWORD PTR [rbx+0x670],xmm0
     10aa013:	41 8b 86 7f 06 00 00 	mov    eax,DWORD PTR [r14+0x67f]
     10aa01a:	89 83 7f 06 00 00    	mov    DWORD PTR [rbx+0x67f],eax
     10aa020:	be 88 06 00 00       	mov    esi,0x688
     10aa025:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa029:	4c 01 f6             	add    rsi,r14
     10aa02c:	e8 c1 01 00 00       	call   10aa1f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271608>
     10aa031:	be 48 07 00 00       	mov    esi,0x748
     10aa036:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa03a:	4c 01 f6             	add    rsi,r14
     10aa03d:	e8 3e 40 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa042:	be 60 07 00 00       	mov    esi,0x760
     10aa047:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa04b:	4c 01 f6             	add    rsi,r14
     10aa04e:	e8 2d 40 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa053:	be 78 07 00 00       	mov    esi,0x778
     10aa058:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa05c:	4c 01 f6             	add    rsi,r14
     10aa05f:	e8 f6 b3 a2 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     10aa064:	be 98 07 00 00       	mov    esi,0x798
     10aa069:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa06d:	4c 01 f6             	add    rsi,r14
     10aa070:	e8 e1 01 00 00       	call   10aa256 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27166c>
     10aa075:	41 8a 86 80 08 00 00 	mov    al,BYTE PTR [r14+0x880]
     10aa07c:	88 83 80 08 00 00    	mov    BYTE PTR [rbx+0x880],al
     10aa082:	be 88 08 00 00       	mov    esi,0x888
     10aa087:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa08b:	4c 01 f6             	add    rsi,r14
     10aa08e:	e8 c7 b3 a2 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     10aa093:	41 8b 86 a8 08 00 00 	mov    eax,DWORD PTR [r14+0x8a8]
     10aa09a:	89 83 a8 08 00 00    	mov    DWORD PTR [rbx+0x8a8],eax
     10aa0a0:	be b0 08 00 00       	mov    esi,0x8b0
     10aa0a5:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa0a9:	4c 01 f6             	add    rsi,r14
     10aa0ac:	e8 43 02 00 00       	call   10aa2f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27170a>
     10aa0b1:	be c8 08 00 00       	mov    esi,0x8c8
     10aa0b6:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa0ba:	4c 01 f6             	add    rsi,r14
     10aa0bd:	e8 32 02 00 00       	call   10aa2f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27170a>
     10aa0c2:	be e0 08 00 00       	mov    esi,0x8e0
     10aa0c7:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa0cb:	4c 01 f6             	add    rsi,r14
     10aa0ce:	8a 83 90 0f 00 00    	mov    al,BYTE PTR [rbx+0xf90]
     10aa0d4:	41 3a 86 90 0f 00 00 	cmp    al,BYTE PTR [r14+0xf90]
     10aa0db:	75 0b                	jne    10aa0e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2714fe>
     10aa0dd:	84 c0                	test   al,al
     10aa0df:	74 1e                	je     10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e1:	e8 24 06 00 00       	call   10aa70a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b20>
     10aa0e6:	eb 17                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e8:	84 c0                	test   al,al
     10aa0ea:	74 0e                	je     10aa0fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271510>
     10aa0ec:	e8 47 fd ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10aa0f1:	c6 83 90 0f 00 00 00 	mov    BYTE PTR [rbx+0xf90],0x0
     10aa0f8:	eb 05                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0fa:	e8 bd 06 00 00       	call   10aa7bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271bd2>
     10aa0ff:	4c 39 f3             	cmp    rbx,r14
     10aa102:	0f 84 d7 00 00 00    	je     10aa1df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2715f5>
     10aa108:	4c 8d bb 98 0f 00 00 	lea    r15,[rbx+0xf98]
     10aa10f:	4d 8b a6 98 0f 00 00 	mov    r12,QWORD PTR [r14+0xf98]
     10aa116:	4d 8b b6 a0 0f 00 00 	mov    r14,QWORD PTR [r14+0xfa0]
     10aa11d:	4c 89 f0             	mov    rax,r14
     10aa120:	4c 29 e0             	sub    rax,r12
     10aa123:	bf b0 06 00 00       	mov    edi,0x6b0
     10aa128:	48 99                	cqo
     10aa12a:	48 f7 ff             	idiv   rdi
     10aa12d:	49 89 c5             	mov    r13,rax
     10aa130:	48 8b 8b 98 0f 00 00 	mov    rcx,QWORD PTR [rbx+0xf98]
     10aa137:	48 8b b3 a8 0f 00 00 	mov    rsi,QWORD PTR [rbx+0xfa8]
     10aa13e:	48 89 f0             	mov    rax,rsi
     10aa141:	48 29 c8             	sub    rax,rcx
     10aa144:	48 99                	cqo
     10aa146:	48 f7 ff             	idiv   rdi
     10aa149:	4c 39 e8             	cmp    rax,r13
     10aa14c:	73 40                	jae    10aa18e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2715a4>
     10aa14e:	48 85 c9             	test   rcx,rcx
     10aa151:	74 1e                	je     10aa171 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271587>
     10aa153:	4c 89 ff             	mov    rdi,r15
     10aa156:	e8 17 fd ff ff       	call   10a9e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271288>
     10aa15b:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     10aa15e:	e8 bd 3d 74 00       	call   17edf20 <_ZdlPv@plt>
     10aa163:	0f 57 c0             	xorps  xmm0,xmm0
     10aa166:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     10aa16a:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     10aa16f:	31 f6                	xor    esi,esi
     10aa171:	31 ff                	xor    edi,edi
     10aa173:	4c 89 ea             	mov    rdx,r13
     10aa176:	e8 7b 03 00 00       	call   10aa4f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27190c>
     10aa17b:	4c 89 ff             	mov    rdi,r15
     10aa17e:	48 89 c6             	mov    rsi,rax
     10aa181:	e8 b8 03 00 00       	call   10aa53e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271954>
     10aa186:	4c 89 ff             	mov    rdi,r15
     10aa189:	4c 89 e6             	mov    rsi,r12
     10aa18c:	eb 2e                	jmp    10aa1bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2715d2>
     10aa18e:	48 8b ab a0 0f 00 00 	mov    rbp,QWORD PTR [rbx+0xfa0]
     10aa195:	48 29 cd             	sub    rbp,rcx
     10aa198:	48 89 e8             	mov    rax,rbp
     10aa19b:	48 99                	cqo
     10aa19d:	48 f7 ff             	idiv   rdi
     10aa1a0:	4c 39 e8             	cmp    rax,r13
     10aa1a3:	73 21                	jae    10aa1c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2715dc>
     10aa1a5:	4c 01 e5             	add    rbp,r12
     10aa1a8:	4c 89 e7             	mov    rdi,r12
     10aa1ab:	48 89 ee             	mov    rsi,rbp
     10aa1ae:	48 89 ca             	mov    rdx,rcx
     10aa1b1:	e8 1e 02 00 00       	call   10aa3d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2717ea>
     10aa1b6:	4c 89 ff             	mov    rdi,r15
     10aa1b9:	48 89 ee             	mov    rsi,rbp
     10aa1bc:	4c 89 f2             	mov    rdx,r14
     10aa1bf:	e8 52 02 00 00       	call   10aa416 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27182c>
     10aa1c4:	eb 19                	jmp    10aa1df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2715f5>
     10aa1c6:	4c 89 e7             	mov    rdi,r12
     10aa1c9:	4c 89 f6             	mov    rsi,r14
     10aa1cc:	48 89 ca             	mov    rdx,rcx
     10aa1cf:	e8 00 02 00 00       	call   10aa3d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2717ea>
     10aa1d4:	4c 89 ff             	mov    rdi,r15
     10aa1d7:	48 89 c6             	mov    rsi,rax
     10aa1da:	e8 9b fc ff ff       	call   10a9e7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271290>
     10aa1df:	48 89 d8             	mov    rax,rbx
     10aa1e2:	48 83 c4 08          	add    rsp,0x8
     10aa1e6:	5b                   	pop    rbx
     10aa1e7:	41 5c                	pop    r12
     10aa1e9:	41 5d                	pop    r13
     10aa1eb:	41 5e                	pop    r14
     10aa1ed:	41 5f                	pop    r15
     10aa1ef:	5d                   	pop    rbp
     10aa1f0:	c3                   	ret

## Direct callees of 0x139c09a
- call @0x139c11d -> 0xcd6a42; target FDE=(13462082, 13462142)
- call @0x139c139 -> 0xdab0bc; target FDE=(14332092, 14332167)
- call @0x139c186 -> 0x138db5c; target FDE=(20503388, 20503536)
- call @0x139c192 -> 0x10fb2ec; target FDE=(17806060, 17806123)
- call @0x139c1b9 -> 0x17efab0; target FDE=None

## Relocations/vtable slots targeting subtype-6 consumer 0x10a9668
- slot 0x184c840 in .rela.dyn -> 0x10a9668
    0x184c800: reloc -> 0x10a941c
    0x184c808: reloc -> 0x10a9436
    0x184c810: reloc -> 0x10a9566
    0x184c818: reloc -> 0x10a9584
    0x184c820: reloc -> 0x10a95a2
    0x184c828: reloc -> 0x10a95c0
    0x184c830: reloc -> 0x10a95de
    0x184c838: reloc -> 0x10a95fc
    0x184c840: reloc -> 0x10a9668
    0x184c848: raw 0xfffffffffffffff8
    0x184c850: raw 0x0
    0x184c858: reloc -> 0x10a969c
    0x184c860: reloc -> 0x10a96a6
    0x184c868: reloc -> 0x9d7de0
    0x184c870: reloc -> 0x9d7de0
    0x184c878: reloc -> 0x9d7de0
    0x184c880: reloc -> 0x9d7de0

## Direct callers of owner-state reset/copy helpers
### nested payload destroy/reset 0x1089a72
- caller insn 0x1089cd0; FDE=(17341618, 17341668)
     1089caa:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
     1089cad:	e9 00 00 00 00       	jmp    1089cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c8>
     1089cb2:	41 57                	push   r15
     1089cb4:	41 56                	push   r14
     1089cb6:	53                   	push   rbx
     1089cb7:	48 89 f3             	mov    rbx,rsi
     1089cba:	49 89 fe             	mov    r14,rdi
     1089cbd:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
     1089cc1:	49 39 f7             	cmp    r15,rsi
     1089cc4:	74 14                	je     1089cda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510f0>
     1089cc6:	49 81 c7 b0 fa ff ff 	add    r15,0xfffffffffffffab0
     1089ccd:	4c 89 ff             	mov    rdi,r15
     1089cd0:	e8 9d fd ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089cd5:	49 39 df             	cmp    r15,rbx
     1089cd8:	75 ec                	jne    1089cc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510dc>
     1089cda:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     1089cde:	5b                   	pop    rbx
     1089cdf:	41 5e                	pop    r14
     1089ce1:	41 5f                	pop    r15
     1089ce3:	c3                   	ret
     1089ce4:	53                   	push   rbx
     1089ce5:	48 89 fb             	mov    rbx,rdi
     1089ce8:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1089ceb:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
     1089cef:	74 11                	je     1089d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251118>
     1089cf1:	e8 0e 00 00 00       	call   1089d04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25111a>
     1089cf6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1089cf9:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     1089cfc:	5b                   	pop    rbx
     1089cfd:	e9 1e 42 76 00       	jmp    17edf20 <_ZdlPv@plt>
     1089d02:	5b                   	pop    rbx
- caller insn 0x1089ff2; FDE=(17342366, 17343607)
     1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1089fcc:	48 83 c7 10          	add    rdi,0x10
     1089fd0:	48 83 c6 10          	add    rsi,0x10
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12
     108a02a:	4c 29 e8             	sub    rax,r13
     108a02d:	bf 50 05 00 00       	mov    edi,0x550
     108a032:	48 99                	cqo
     108a034:	48 f7 ff             	idiv   rdi
     108a037:	48 89 c5             	mov    rbp,rax
     108a03a:	48 8b 8b 68 05 00 00 	mov    rcx,QWORD PTR [rbx+0x568]
     108a041:	48 8b b3 78 05 00 00 	mov    rsi,QWORD PTR [rbx+0x578]
     108a048:	48 89 f0             	mov    rax,rsi
- caller insn 0x108da56; FDE=(17357358, 17357413)
     108da34:	c3                   	ret
     108da35:	41 56                	push   r14
     108da37:	53                   	push   rbx
     108da38:	50                   	push   rax
     108da39:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     108da3d:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     108da41:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
     108da44:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     108da47:	4c 39 f3             	cmp    rbx,r14
     108da4a:	74 11                	je     108da5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e73>
     108da4c:	48 81 c3 b0 fa ff ff 	add    rbx,0xfffffffffffffab0
     108da53:	48 89 df             	mov    rdi,rbx
     108da56:	e8 17 c0 ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     108da5b:	eb ea                	jmp    108da47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e5d>
     108da5d:	48 83 c4 08          	add    rsp,0x8
     108da61:	5b                   	pop    rbx
     108da62:	41 5e                	pop    r14
     108da64:	c3                   	ret
     108da65:	cc                   	int3
     108da66:	41 56                	push   r14
     108da68:	53                   	push   rbx
     108da69:	50                   	push   rax
     108da6a:	31 c0                	xor    eax,eax
     108da6c:	88 07                	mov    BYTE PTR [rdi],al
     108da6e:	88 47 38             	mov    BYTE PTR [rdi+0x38],al
     108da71:	38 46 38             	cmp    BYTE PTR [rsi+0x38],al
     108da74:	74 08                	je     108da7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e94>
     108da76:	48 89 fb             	mov    rbx,rdi
     108da79:	e8 1c 00 00 00       	call   108da9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254eb0>
     108da7e:	48 83 c4 08          	add    rsp,0x8
     108da82:	5b                   	pop    rbx
- caller insn 0x10a9e43; FDE=(17473080, 17473105)
     10a9e17:	e8 74 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e1c:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     10a9e20:	e8 6b 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e25:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     10a9e29:	e8 62 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e2e:	48 89 df             	mov    rdi,rbx
     10a9e31:	5b                   	pop    rbx
     10a9e32:	e9 59 40 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e37:	cc                   	int3
     10a9e38:	53                   	push   rbx
     10a9e39:	48 89 fb             	mov    rbx,rdi
     10a9e3c:	48 81 c7 60 01 00 00 	add    rdi,0x160
     10a9e43:	e8 2a fc fd ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     10a9e48:	48 89 df             	mov    rdi,rbx
     10a9e4b:	5b                   	pop    rbx
     10a9e4c:	e9 9d ff ff ff       	jmp    10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
     10a9e51:	cc                   	int3
     10a9e52:	53                   	push   rbx
     10a9e53:	48 89 fb             	mov    rbx,rdi
     10a9e56:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10a9e59:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
     10a9e5d:	74 11                	je     10a9e70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271286>
     10a9e5f:	e8 0e 00 00 00       	call   10a9e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271288>
     10a9e64:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10a9e67:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     10a9e6a:	5b                   	pop    rbx
     10a9e6b:	e9 b0 40 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a9e70:	5b                   	pop    rbx
     10a9e71:	c3                   	ret
     10a9e72:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
     10a9e75:	e9 00 00 00 00       	jmp    10a9e7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271290>
- caller insn 0x1365c94; FDE=(20339234, 20344076)
     1365c69:	84 c0                	test   al,al
     1365c6b:	74 07                	je     1365c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1f8>
     1365c6d:	e8 3e 77 d2 ff       	call   108d3b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2547c6>
     1365c72:	eb 08                	jmp    1365c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab200>
     1365c74:	4c 89 f6             	mov    rsi,r14
     1365c77:	e8 ce 85 d2 ff       	call   108e24a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255660>
     1365c7c:	48 8b 84 24 50 0f 00 	mov    rax,QWORD PTR [rsp+0xf50]
     1365c83:	00 
     1365c84:	48 89 84 24 a0 14 00 	mov    QWORD PTR [rsp+0x14a0],rax
     1365c8b:	00 
     1365c8c:	48 8d bc 24 08 0a 00 	lea    rdi,[rsp+0xa08]
     1365c93:	00 
     1365c94:	e8 d9 3d d2 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1365c99:	48 8b b5 80 06 00 00 	mov    rsi,QWORD PTR [rbp+0x680]
     1365ca0:	48 85 f6             	test   rsi,rsi
     1365ca3:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     1365ca8:	74 2f                	je     1365cd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab25d>
     1365caa:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1365cad:	48 8d bc 24 08 0a 00 	lea    rdi,[rsp+0xa08]
     1365cb4:	00 
     1365cb5:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
     1365cbb:	8a 84 24 18 0a 00 00 	mov    al,BYTE PTR [rsp+0xa18]
     1365cc2:	88 84 24 68 12 00 00 	mov    BYTE PTR [rsp+0x1268],al
     1365cc9:	0f 10 84 24 08 0a 00 	movups xmm0,XMMWORD PTR [rsp+0xa08]
     1365cd0:	00 
     1365cd1:	0f 11 84 24 58 12 00 	movups XMMWORD PTR [rsp+0x1258],xmm0
     1365cd8:	00 
     1365cd9:	48 89 df             	mov    rdi,rbx
     1365cdc:	e8 73 e8 02 00       	call   1394554 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d9ad8>
     1365ce1:	84 c0                	test   al,al
     1365ce3:	74 18                	je     1365cfd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab281>
- caller insn 0x1366122; FDE=(20339234, 20344076)
     13660ee:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     13660f5:	00 
     13660f6:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
     13660fc:	8a 84 24 20 01 00 00 	mov    al,BYTE PTR [rsp+0x120]
     1366103:	41 88 45 10          	mov    BYTE PTR [r13+0x10],al
     1366107:	0f 10 84 24 10 01 00 	movups xmm0,XMMWORD PTR [rsp+0x110]
     136610e:	00 
     136610f:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     1366114:	48 89 ef             	mov    rdi,rbp
     1366117:	4c 89 e6             	mov    rsi,r12
     136611a:	e8 7d 82 00 00       	call   136e39c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3920>
     136611f:	4c 89 e7             	mov    rdi,r12
     1366122:	e8 4b 39 d2 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1366127:	49 83 c6 08          	add    r14,0x8
     136612b:	4d 39 fe             	cmp    r14,r15
     136612e:	75 95                	jne    13660c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab649>
     1366130:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
     1366137:	00 
     1366138:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     136613f:	00 
     1366140:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
     1366145:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     136614a:	75 6f                	jne    13661bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab73f>
     136614c:	48 8b b5 80 06 00 00 	mov    rsi,QWORD PTR [rbp+0x680]
     1366153:	48 85 f6             	test   rsi,rsi
     1366156:	74 63                	je     13661bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab73f>
     1366158:	48 8d bc 24 08 0a 00 	lea    rdi,[rsp+0xa08]
     136615f:	00 
     1366160:	e8 6d 78 00 00       	call   136d9d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2f56>
     1366165:	48 8b b5 80 06 00 00 	mov    rsi,QWORD PTR [rbp+0x680]
     136616c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
- caller insn 0x13661b6; FDE=(20339234, 20344076)
     136617d:	8a 84 24 20 01 00 00 	mov    al,BYTE PTR [rsp+0x120]
     1366184:	48 8d b4 24 08 0a 00 	lea    rsi,[rsp+0xa08]
     136618b:	00 
     136618c:	88 86 10 03 00 00    	mov    BYTE PTR [rsi+0x310],al
     1366192:	0f 10 84 24 10 01 00 	movups xmm0,XMMWORD PTR [rsp+0x110]
     1366199:	00 
     136619a:	0f 11 86 00 03 00 00 	movups XMMWORD PTR [rsi+0x300],xmm0
     13661a1:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     13661a8:	00 
     13661a9:	e8 ee 81 00 00       	call   136e39c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3920>
     13661ae:	48 8d bc 24 08 0a 00 	lea    rdi,[rsp+0xa08]
     13661b5:	00 
     13661b6:	e8 b7 38 d2 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     13661bb:	4d 85 f6             	test   r14,r14
     13661be:	0f 95 c0             	setne  al
     13661c1:	89 04 24             	mov    DWORD PTR [rsp],eax
     13661c4:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     13661cb:	00 00 
     13661cd:	0f 57 c0             	xorps  xmm0,xmm0
     13661d0:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
     13661d6:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     13661db:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     13661e0:	80 bd b8 05 00 00 00 	cmp    BYTE PTR [rbp+0x5b8],0x0
     13661e7:	0f 84 cd 04 00 00    	je     13666ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1abc3e>
     13661ed:	48 8b 9d 78 03 00 00 	mov    rbx,QWORD PTR [rbp+0x378]
     13661f4:	48 03 9d 00 03 00 00 	add    rbx,QWORD PTR [rbp+0x300]
     13661fb:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1366200:	48 89 de             	mov    rsi,rbx
     1366203:	e8 6e 82 00 00       	call   136e476 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b39fa>
     1366208:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     136620d:	48 89 de             	mov    rsi,rbx
- caller insn 0x1366c5f; FDE=(20339234, 20344076)
     1366c34:	48 89 c3             	mov    rbx,rax
     1366c37:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     1366c3e:	00 
     1366c3f:	e8 86 2e d2 ff       	call   1089aca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250ee0>
     1366c44:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1366c49:	e8 42 72 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1366c4e:	eb 1e                	jmp    1366c6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac1f2>
     1366c50:	eb 2b                	jmp    1366c7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac201>
     1366c52:	eb 12                	jmp    1366c66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac1ea>
     1366c54:	48 89 c3             	mov    rbx,rax
     1366c57:	48 8d bc 24 08 0a 00 	lea    rdi,[rsp+0xa08]
     1366c5e:	00 
     1366c5f:	e8 0e 2e d2 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1366c64:	eb 48                	jmp    1366cae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac232>
     1366c66:	48 89 c3             	mov    rbx,rax
     1366c69:	eb 43                	jmp    1366cae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac232>
     1366c6b:	48 89 c3             	mov    rbx,rax
     1366c6e:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
     1366c75:	00 
     1366c76:	e8 51 7b 73 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1366c7b:	eb 03                	jmp    1366c80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac204>
     1366c7d:	48 89 c3             	mov    rbx,rax
     1366c80:	48 8d bc 24 a8 08 00 	lea    rdi,[rsp+0x8a8]
     1366c87:	00 
     1366c88:	e8 dd 97 d4 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1366c8d:	48 8d bc 24 58 09 00 	lea    rdi,[rsp+0x958]
     1366c94:	00 
     1366c95:	e8 d0 97 d4 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1366c9a:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1366c9f:	e8 48 2d d2 ff       	call   10899ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e02>
     1366ca4:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
- caller insn 0x136e379; FDE=(20374362, 20374428)
     136e358:	5d                   	pop    rbp
     136e359:	c3                   	ret
     136e35a:	41 56                	push   r14
     136e35c:	53                   	push   rbx
     136e35d:	50                   	push   rax
     136e35e:	48 89 fb             	mov    rbx,rdi
     136e361:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     136e365:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     136e369:	4c 39 f7             	cmp    rdi,r14
     136e36c:	74 16                	je     136e384 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3908>
     136e36e:	48 81 c7 b0 fa ff ff 	add    rdi,0xfffffffffffffab0
     136e375:	48 89 7b 10          	mov    QWORD PTR [rbx+0x10],rdi
     136e379:	e8 f4 b6 d1 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     136e37e:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     136e382:	eb e5                	jmp    136e369 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b38ed>
     136e384:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     136e387:	48 83 c4 08          	add    rsp,0x8
     136e38b:	48 85 ff             	test   rdi,rdi
     136e38e:	74 08                	je     136e398 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b391c>
     136e390:	5b                   	pop    rbx
     136e391:	41 5e                	pop    r14
     136e393:	e9 88 fb 47 00       	jmp    17edf20 <_ZdlPv@plt>
     136e398:	5b                   	pop    rbx
     136e399:	41 5e                	pop    r14
     136e39b:	c3                   	ret
     136e39c:	55                   	push   rbp
     136e39d:	41 57                	push   r15
     136e39f:	41 56                	push   r14
     136e3a1:	41 55                	push   r13
     136e3a3:	41 54                	push   r12
     136e3a5:	53                   	push   rbx

### nested payload assignment 0x108daf0
- caller insn 0x1089fe7; FDE=(17342366, 17343607)
     1089fbb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1089fc0:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     1089fc3:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     1089fc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1089fcc:	48 83 c7 10          	add    rdi,0x10
     1089fd0:	48 83 c6 10          	add    rsi,0x10
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12
     108a02a:	4c 29 e8             	sub    rax,r13
     108a02d:	bf 50 05 00 00       	mov    edi,0x550
     108a032:	48 99                	cqo
     108a034:	48 f7 ff             	idiv   rdi
- caller insn 0x108d6e4; FDE=(17356482, 17356547)
     108d6c4:	41 56                	push   r14
     108d6c6:	41 54                	push   r12
     108d6c8:	53                   	push   rbx
     108d6c9:	50                   	push   rax
     108d6ca:	48 89 d3             	mov    rbx,rdx
     108d6cd:	48 39 f7             	cmp    rdi,rsi
     108d6d0:	74 22                	je     108d6f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b0a>
     108d6d2:	49 89 f6             	mov    r14,rsi
     108d6d5:	49 89 ff             	mov    r15,rdi
     108d6d8:	41 bc 50 05 00 00    	mov    r12d,0x550
     108d6de:	48 89 df             	mov    rdi,rbx
     108d6e1:	4c 89 fe             	mov    rsi,r15
     108d6e4:	e8 07 04 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     108d6e9:	4d 01 e7             	add    r15,r12
     108d6ec:	4c 01 e3             	add    rbx,r12
     108d6ef:	4d 39 f7             	cmp    r15,r14
     108d6f2:	75 ea                	jne    108d6de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254af4>
     108d6f4:	48 89 d8             	mov    rax,rbx
     108d6f7:	48 83 c4 08          	add    rsp,0x8
     108d6fb:	5b                   	pop    rbx
     108d6fc:	41 5c                	pop    r12
     108d6fe:	41 5e                	pop    r14
     108d700:	41 5f                	pop    r15
     108d702:	c3                   	ret
     108d703:	cc                   	int3
     108d704:	55                   	push   rbp
     108d705:	41 57                	push   r15
     108d707:	41 56                	push   r14
     108d709:	41 55                	push   r13
     108d70b:	41 54                	push   r12
     108d70d:	53                   	push   rbx
- caller insn 0x10aa728; FDE=(17475338, 17475384)
     10aa705:	49 89 c5             	mov    r13,rax
     10aa708:	eb eb                	jmp    10aa6f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b0b>
     10aa70a:	41 56                	push   r14
     10aa70c:	53                   	push   rbx
     10aa70d:	50                   	push   rax
     10aa70e:	48 89 f3             	mov    rbx,rsi
     10aa711:	49 89 fe             	mov    r14,rdi
     10aa714:	e8 1f 00 00 00       	call   10aa738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b4e>
     10aa719:	b8 60 01 00 00       	mov    eax,0x160
     10aa71e:	49 8d 3c 06          	lea    rdi,[r14+rax*1]
     10aa722:	48 01 c3             	add    rbx,rax
     10aa725:	48 89 de             	mov    rsi,rbx
     10aa728:	e8 c3 33 fe ff       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     10aa72d:	4c 89 f0             	mov    rax,r14
     10aa730:	48 83 c4 08          	add    rsp,0x8
     10aa734:	5b                   	pop    rbx
     10aa735:	41 5e                	pop    r14
     10aa737:	c3                   	ret
     10aa738:	41 56                	push   r14
     10aa73a:	53                   	push   rbx
     10aa73b:	50                   	push   rax
     10aa73c:	49 89 f6             	mov    r14,rsi
     10aa73f:	48 89 fb             	mov    rbx,rdi
     10aa742:	e8 39 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa747:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     10aa74b:	49 8d 76 18          	lea    rsi,[r14+0x18]
     10aa74f:	e8 2c 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa754:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     10aa758:	49 8d 76 30          	lea    rsi,[r14+0x30]
     10aa75c:	e8 1f 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa761:	48 8d 7b 48          	lea    rdi,[rbx+0x48]

### nested payload construct 0x108dc54
- caller insn 0x108a000; FDE=(17342366, 17343607)
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12
     108a02a:	4c 29 e8             	sub    rax,r13
     108a02d:	bf 50 05 00 00       	mov    edi,0x550
     108a032:	48 99                	cqo
     108a034:	48 f7 ff             	idiv   rdi
     108a037:	48 89 c5             	mov    rbp,rax
     108a03a:	48 8b 8b 68 05 00 00 	mov    rcx,QWORD PTR [rbx+0x568]
     108a041:	48 8b b3 78 05 00 00 	mov    rsi,QWORD PTR [rbx+0x578]
     108a048:	48 89 f0             	mov    rax,rsi
     108a04b:	48 29 c8             	sub    rax,rcx
     108a04e:	48 99                	cqo
     108a050:	48 f7 ff             	idiv   rdi
- caller insn 0x124a555; FDE=(19178756, 19179710)
     124a529:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     124a52c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124a52f:	48 89 07             	mov    QWORD PTR [rdi],rax
     124a532:	4c 8d 7f 10          	lea    r15,[rdi+0x10]
     124a536:	31 c0                	xor    eax,eax
     124a538:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
     124a53b:	88 87 60 05 00 00    	mov    BYTE PTR [rdi+0x560],al
     124a541:	38 86 60 05 00 00    	cmp    BYTE PTR [rsi+0x560],al
     124a547:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
     124a54c:	74 0c                	je     124a55a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fade>
     124a54e:	48 8d 75 10          	lea    rsi,[rbp+0x10]
     124a552:	4c 89 ff             	mov    rdi,r15
     124a555:	e8 fa 36 e4 ff       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     124a55a:	4d 8d a5 68 05 00 00 	lea    r12,[r13+0x568]
     124a561:	49 83 a5 78 05 00 00 	and    QWORD PTR [r13+0x578],0x0
     124a568:	00 
     124a569:	0f 57 c0             	xorps  xmm0,xmm0
     124a56c:	41 0f 11 85 68 05 00 	movups XMMWORD PTR [r13+0x568],xmm0
     124a573:	00 
     124a574:	48 8b 9d 68 05 00 00 	mov    rbx,QWORD PTR [rbp+0x568]
     124a57b:	4c 8b b5 70 05 00 00 	mov    r14,QWORD PTR [rbp+0x570]
     124a582:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
     124a587:	c6 44 24 50 00       	mov    BYTE PTR [rsp+0x50],0x0
     124a58c:	4c 89 f0             	mov    rax,r14
     124a58f:	48 29 d8             	sub    rax,rbx
     124a592:	74 23                	je     124a5b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fb3b>
     124a594:	b9 50 05 00 00       	mov    ecx,0x550
     124a599:	48 99                	cqo
     124a59b:	48 f7 f9             	idiv   rcx
     124a59e:	4c 89 e7             	mov    rdi,r12
     124a5a1:	48 89 c6             	mov    rsi,rax

### lower state copy assignment 0x1089f9e
- caller insn 0x1089085; FDE=(17338432, 17340586)
     1089054:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108905b:	00 00 
     108905d:	48 89 84 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rax
     1089064:	00 
     1089065:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1089068:	4c 8d bb c0 00 00 00 	lea    r15,[rbx+0xc0]
     108906f:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1089076:	00 
     1089077:	4c 89 fe             	mov    rsi,r15
     108907a:	e8 1f 0d 00 00       	call   1089d9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2511b4>
     108907f:	4c 89 ff             	mov    rdi,r15
     1089082:	4c 89 f6             	mov    rsi,r14
     1089085:	e8 14 0f 00 00       	call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>
     108908a:	48 8d 94 24 08 07 00 	lea    rdx,[rsp+0x708]
     1089091:	00 
     1089092:	48 83 22 00          	and    QWORD PTR [rdx],0x0
     1089096:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     108909d:	00 
     108909e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
     10890a5:	00 
     10890a6:	e8 cc 13 00 00       	call   108a477 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25188d>
     10890ab:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     10890b0:	49 8d 76 10          	lea    rsi,[r14+0x10]
     10890b4:	48 8d bc 24 c8 07 00 	lea    rdi,[rsp+0x7c8]
     10890bb:	00 
     10890bc:	48 8d 94 24 08 07 00 	lea    rdx,[rsp+0x708]
     10890c3:	00 
     10890c4:	e8 ae 13 00 00       	call   108a477 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25188d>
     10890c9:	8a 8c 24 a8 07 00 00 	mov    cl,BYTE PTR [rsp+0x7a8]
     10890d0:	84 c9                	test   cl,cl
     10890d2:	0f 95 c2             	setne  dl
- caller insn 0x10a9fcf; FDE=(17473470, 17474033)
     10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a9fb6:	48 89 c7             	mov    rdi,rax
     10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx
     10a9fc8:	50                   	push   rax
     10a9fc9:	49 89 f6             	mov    r14,rsi
     10a9fcc:	48 89 fb             	mov    rbx,rdi
     10a9fcf:	e8 ca ff fd ff       	call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>
     10a9fd4:	49 8b 86 38 06 00 00 	mov    rax,QWORD PTR [r14+0x638]
     10a9fdb:	48 89 83 38 06 00 00 	mov    QWORD PTR [rbx+0x638],rax
     10a9fe2:	be 40 06 00 00       	mov    esi,0x640
     10a9fe7:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10a9feb:	4c 01 f6             	add    rsi,r14
     10a9fee:	e8 8d 40 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10a9ff3:	be 58 06 00 00       	mov    esi,0x658
     10a9ff8:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10a9ffc:	4c 01 f6             	add    rsi,r14
     10a9fff:	e8 7c 40 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa004:	41 0f 10 86 70 06 00 	movups xmm0,XMMWORD PTR [r14+0x670]
     10aa00b:	00 
     10aa00c:	0f 11 83 70 06 00 00 	movups XMMWORD PTR [rbx+0x670],xmm0
     10aa013:	41 8b 86 7f 06 00 00 	mov    eax,DWORD PTR [r14+0x67f]
     10aa01a:	89 83 7f 06 00 00    	mov    DWORD PTR [rbx+0x67f],eax
     10aa020:	be 88 06 00 00       	mov    esi,0x688
     10aa025:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa029:	4c 01 f6             	add    rsi,r14
- caller insn 0x11f5d90; FDE=(18832526, 18834086)
     11f5d67:	0f b6 c8             	movzx  ecx,al
     11f5d6a:	4c 8d 05 31 a8 16 ff 	lea    r8,[rip+0xffffffffff16a831]        # 3605a2 <_ZTSSt12bad_any_cast@@Base-0x2fc26>
     11f5d71:	6a 0f                	push   0xf
     11f5d73:	41 59                	pop    r9
     11f5d75:	4c 89 f7             	mov    rdi,r14
     11f5d78:	48 89 de             	mov    rsi,rbx
     11f5d7b:	e8 da 86 06 00       	call   125e45a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa39de>
     11f5d80:	41 80 be a8 06 00 00 	cmp    BYTE PTR [r14+0x6a8],0x0
     11f5d87:	00 
     11f5d88:	74 0d                	je     11f5d97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b31b>
     11f5d8a:	4c 89 e7             	mov    rdi,r12
     11f5d8d:	4c 89 fe             	mov    rsi,r15
     11f5d90:	e8 09 42 e9 ff       	call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>
     11f5d95:	eb 13                	jmp    11f5daa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b32e>
     11f5d97:	4c 89 e7             	mov    rdi,r12
     11f5d9a:	4c 89 fe             	mov    rsi,r15
     11f5d9d:	e8 62 47 05 00       	call   124a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fa88>
     11f5da2:	41 c6 86 a8 06 00 00 	mov    BYTE PTR [r14+0x6a8],0x1
     11f5da9:	01 
     11f5daa:	41 80 be 38 07 00 00 	cmp    BYTE PTR [r14+0x738],0x0
     11f5db1:	00 
     11f5db2:	0f 84 b4 03 00 00    	je     11f616c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b6f0>
     11f5db8:	41 80 bf 90 0f 00 00 	cmp    BYTE PTR [r15+0xf90],0x0
     11f5dbf:	00 
     11f5dc0:	0f 84 a6 03 00 00    	je     11f616c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b6f0>
     11f5dc6:	41 83 bf 60 09 00 00 	cmp    DWORD PTR [r15+0x960],0x0
     11f5dcd:	00 
     11f5dce:	0f 85 98 03 00 00    	jne    11f616c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b6f0>
     11f5dd4:	41 80 bf 68 0e 00 00 	cmp    BYTE PTR [r15+0xe68],0x0
     11f5ddb:	00 
     11f5ddc:	0f 85 8a 03 00 00    	jne    11f616c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b6f0>

### owner wrapper reset/destructor path 0x10a9e38
- caller insn 0x10a9e98; FDE=(17473146, 17473196)
     10a9e72:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
     10a9e75:	e9 00 00 00 00       	jmp    10a9e7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271290>
     10a9e7a:	41 57                	push   r15
     10a9e7c:	41 56                	push   r14
     10a9e7e:	53                   	push   rbx
     10a9e7f:	48 89 f3             	mov    rbx,rsi
     10a9e82:	49 89 fe             	mov    r14,rdi
     10a9e85:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
     10a9e89:	49 39 f7             	cmp    r15,rsi
     10a9e8c:	74 14                	je     10a9ea2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712b8>
     10a9e8e:	49 81 c7 50 f9 ff ff 	add    r15,0xfffffffffffff950
     10a9e95:	4c 89 ff             	mov    rdi,r15
     10a9e98:	e8 9b ff ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10a9e9d:	49 39 df             	cmp    r15,rbx
     10a9ea0:	75 ec                	jne    10a9e8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712a4>
     10a9ea2:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     10a9ea6:	5b                   	pop    rbx
     10a9ea7:	41 5e                	pop    r14
     10a9ea9:	41 5f                	pop    r15
     10a9eab:	c3                   	ret
     10a9eac:	41 57                	push   r15
     10a9eae:	41 56                	push   r14
     10a9eb0:	53                   	push   rbx
     10a9eb1:	49 89 f7             	mov    r15,rsi
     10a9eb4:	48 89 fb             	mov    rbx,rdi
     10a9eb7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     10a9eba:	48 89 f7             	mov    rdi,rsi
     10a9ebd:	ff 50 20             	call   QWORD PTR [rax+0x20]
     10a9ec0:	80 78 10 00          	cmp    BYTE PTR [rax+0x10],0x0
     10a9ec4:	74 10                	je     10a9ed6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712ec>
     10a9ec6:	49 89 c6             	mov    r14,rax
- caller insn 0x10aa0ec; FDE=(17473470, 17474033)
     10aa0c2:	be e0 08 00 00       	mov    esi,0x8e0
     10aa0c7:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa0cb:	4c 01 f6             	add    rsi,r14
     10aa0ce:	8a 83 90 0f 00 00    	mov    al,BYTE PTR [rbx+0xf90]
     10aa0d4:	41 3a 86 90 0f 00 00 	cmp    al,BYTE PTR [r14+0xf90]
     10aa0db:	75 0b                	jne    10aa0e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2714fe>
     10aa0dd:	84 c0                	test   al,al
     10aa0df:	74 1e                	je     10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e1:	e8 24 06 00 00       	call   10aa70a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b20>
     10aa0e6:	eb 17                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e8:	84 c0                	test   al,al
     10aa0ea:	74 0e                	je     10aa0fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271510>
     10aa0ec:	e8 47 fd ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10aa0f1:	c6 83 90 0f 00 00 00 	mov    BYTE PTR [rbx+0xf90],0x0
     10aa0f8:	eb 05                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0fa:	e8 bd 06 00 00       	call   10aa7bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271bd2>
     10aa0ff:	4c 39 f3             	cmp    rbx,r14
     10aa102:	0f 84 d7 00 00 00    	je     10aa1df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2715f5>
     10aa108:	4c 8d bb 98 0f 00 00 	lea    r15,[rbx+0xf98]
     10aa10f:	4d 8b a6 98 0f 00 00 	mov    r12,QWORD PTR [r14+0xf98]
     10aa116:	4d 8b b6 a0 0f 00 00 	mov    r14,QWORD PTR [r14+0xfa0]
     10aa11d:	4c 89 f0             	mov    rax,r14
     10aa120:	4c 29 e0             	sub    rax,r12
     10aa123:	bf b0 06 00 00       	mov    edi,0x6b0
     10aa128:	48 99                	cqo
     10aa12a:	48 f7 ff             	idiv   rdi
     10aa12d:	49 89 c5             	mov    r13,rax
     10aa130:	48 8b 8b 98 0f 00 00 	mov    rcx,QWORD PTR [rbx+0xf98]
     10aa137:	48 8b b3 a8 0f 00 00 	mov    rsi,QWORD PTR [rbx+0xfa8]
     10aa13e:	48 89 f0             	mov    rax,rsi
     10aa141:	48 29 c8             	sub    rax,rcx
- caller insn 0x10aa604; FDE=(17475036, 17475091)
     10aa5e2:	c3                   	ret
     10aa5e3:	41 56                	push   r14
     10aa5e5:	53                   	push   rbx
     10aa5e6:	50                   	push   rax
     10aa5e7:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10aa5eb:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     10aa5ef:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
     10aa5f2:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     10aa5f5:	4c 39 f3             	cmp    rbx,r14
     10aa5f8:	74 11                	je     10aa60b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271a21>
     10aa5fa:	48 81 c3 50 f9 ff ff 	add    rbx,0xfffffffffffff950
     10aa601:	48 89 df             	mov    rdi,rbx
     10aa604:	e8 2f f8 ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10aa609:	eb ea                	jmp    10aa5f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271a0b>
     10aa60b:	48 83 c4 08          	add    rsp,0x8
     10aa60f:	5b                   	pop    rbx
     10aa610:	41 5e                	pop    r14
     10aa612:	c3                   	ret
     10aa613:	cc                   	int3
     10aa614:	55                   	push   rbp
     10aa615:	41 57                	push   r15
     10aa617:	41 56                	push   r14
     10aa619:	41 55                	push   r13
     10aa61b:	41 54                	push   r12
     10aa61d:	53                   	push   rbx
     10aa61e:	50                   	push   rax
     10aa61f:	49 89 f5             	mov    r13,rsi
     10aa622:	48 89 fb             	mov    rbx,rdi
     10aa625:	e8 16 39 74 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10aa62a:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     10aa62e:	49 8d 75 18          	lea    rsi,[r13+0x18]
- caller insn 0x1221744; FDE=(19006804, 19014400)
     1221718:	00 
     1221719:	4c 89 ee             	mov    rsi,r13
     122171c:	e8 6b c1 e6 ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     1221721:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     1221728:	00 
     1221729:	48 8d bc 24 60 1c 00 	lea    rdi,[rsp+0x1c60]
     1221730:	00 
     1221731:	48 89 de             	mov    rsi,rbx
     1221734:	e8 93 29 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221739:	c6 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],0x1
     1221740:	01 
     1221741:	48 89 df             	mov    rdi,rbx
     1221744:	e8 ef 86 e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     1221749:	eb 10                	jmp    122175b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66cdf>
     122174b:	31 c0                	xor    eax,eax
     122174d:	88 84 24 60 1c 00 00 	mov    BYTE PTR [rsp+0x1c60],al
     1221754:	88 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],al
     122175b:	48 83 a4 24 28 23 00 	and    QWORD PTR [rsp+0x2328],0x0
     1221762:	00 00 
     1221764:	66 0f ef c0          	pxor   xmm0,xmm0
     1221768:	f3 0f 7f 84 24 18 23 	movdqu XMMWORD PTR [rsp+0x2318],xmm0
     122176f:	00 00 
     1221771:	48 8b 8d 70 05 00 00 	mov    rcx,QWORD PTR [rbp+0x570]
     1221778:	48 8b b5 68 05 00 00 	mov    rsi,QWORD PTR [rbp+0x568]
     122177f:	48 89 c8             	mov    rax,rcx
     1221782:	48 29 f0             	sub    rax,rsi
     1221785:	bf 50 05 00 00       	mov    edi,0x550
     122178a:	48 99                	cqo
     122178c:	48 f7 ff             	idiv   rdi
     122178f:	48 39 f1             	cmp    rcx,rsi
     1221792:	0f 84 ec 01 00 00    	je     1221984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f08>
- caller insn 0x122196a; FDE=(19006804, 19014400)
     122193e:	00 
     122193f:	48 8d bc 24 18 23 00 	lea    rdi,[rsp+0x2318]
     1221946:	00 
     1221947:	4c 89 e6             	mov    rsi,r12
     122194a:	e8 4f 97 02 00       	call   124b09e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90622>
     122194f:	48 8b 9c 24 20 23 00 	mov    rbx,QWORD PTR [rsp+0x2320]
     1221956:	00 
     1221957:	4c 89 e7             	mov    rdi,r12
     122195a:	e8 c1 97 02 00       	call   124b120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906a4>
     122195f:	48 89 9c 24 20 23 00 	mov    QWORD PTR [rsp+0x2320],rbx
     1221966:	00 
     1221967:	4c 89 ff             	mov    rdi,r15
     122196a:	e8 c9 84 e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     122196f:	49 81 c5 50 05 00 00 	add    r13,0x550
     1221976:	49 39 ed             	cmp    r13,rbp
     1221979:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     122197e:	0f 85 af fe ff ff    	jne    1221833 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66db7>
     1221984:	48 8d bc 24 d0 10 00 	lea    rdi,[rsp+0x10d0]
     122198b:	00 
     122198c:	e8 b1 20 00 00       	call   1223a42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fc6>
     1221991:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     1221996:	49 8b 85 00 12 00 00 	mov    rax,QWORD PTR [r13+0x1200]
     122199d:	4c 8d b4 24 28 01 00 	lea    r14,[rsp+0x128]
     12219a4:	00 
     12219a5:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     12219a9:	41 8b bd e0 11 00 00 	mov    edi,DWORD PTR [r13+0x11e0]
     12219b0:	e8 13 64 00 00       	call   1227dc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d34c>
     12219b5:	4c 89 f7             	mov    rdi,r14
     12219b8:	48 89 c6             	mov    rsi,rax
     12219bb:	e8 5a b0 87 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     12219c0:	48 8d 9c 24 40 01 00 	lea    rbx,[rsp+0x140]
- caller insn 0x122220a; FDE=(19006804, 19014400)
     12221de:	e8 ad bc 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12221e3:	e9 e9 00 00 00       	jmp    12222d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67855>
     12221e8:	48 89 c3             	mov    rbx,rax
     12221eb:	e9 e1 00 00 00       	jmp    12222d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67855>
     12221f0:	eb 21                	jmp    1222213 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67797>
     12221f2:	48 89 c3             	mov    rbx,rax
     12221f5:	eb 4b                	jmp    1222242 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x677c6>
     12221f7:	48 89 c3             	mov    rbx,rax
     12221fa:	e9 c5 00 00 00       	jmp    12222c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67848>
     12221ff:	48 89 c3             	mov    rbx,rax
     1222202:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1222209:	00 
     122220a:	e8 29 7c e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     122220f:	eb 17                	jmp    1222228 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x677ac>
     1222211:	eb 00                	jmp    1222213 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67797>
     1222213:	48 89 c3             	mov    rbx,rax
     1222216:	eb 10                	jmp    1222228 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x677ac>
     1222218:	48 89 c3             	mov    rbx,rax
     122221b:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1222222:	00 
     1222223:	e8 c6 7b e8 ff       	call   10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
     1222228:	48 8d bc 24 18 23 00 	lea    rdi,[rsp+0x2318]
     122222f:	00 
     1222230:	e8 39 7a e8 ff       	call   10a9c6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271084>
     1222235:	48 8d bc 24 60 1c 00 	lea    rdi,[rsp+0x1c60]
     122223c:	00 
     122223d:	e8 68 7a e8 ff       	call   10a9caa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2710c0>
     1222242:	48 8d bc 24 48 1c 00 	lea    rdi,[rsp+0x1c48]
     1222249:	00 
     122224a:	e8 69 7a e8 ff       	call   10a9cb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2710ce>
     122224f:	48 8d bc 24 30 1c 00 	lea    rdi,[rsp+0x1c30]
- caller insn 0x124b13f; FDE=(19181856, 19181922)
     124b11e:	5d                   	pop    rbp
     124b11f:	c3                   	ret
     124b120:	41 56                	push   r14
     124b122:	53                   	push   rbx
     124b123:	50                   	push   rax
     124b124:	48 89 fb             	mov    rbx,rdi
     124b127:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     124b12b:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     124b12f:	4c 39 f7             	cmp    rdi,r14
     124b132:	74 16                	je     124b14a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906ce>
     124b134:	48 81 c7 50 f9 ff ff 	add    rdi,0xfffffffffffff950
     124b13b:	48 89 7b 10          	mov    QWORD PTR [rbx+0x10],rdi
     124b13f:	e8 f4 ec e5 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     124b144:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     124b148:	eb e5                	jmp    124b12f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906b3>
     124b14a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     124b14d:	48 83 c4 08          	add    rsp,0x8
     124b151:	48 85 ff             	test   rdi,rdi
     124b154:	74 08                	je     124b15e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906e2>
     124b156:	5b                   	pop    rbx
     124b157:	41 5e                	pop    r14
     124b159:	e9 c2 2d 5a 00       	jmp    17edf20 <_ZdlPv@plt>
     124b15e:	5b                   	pop    rbx
     124b15f:	41 5e                	pop    r14
     124b161:	c3                   	ret
     124b162:	41 57                	push   r15
     124b164:	41 56                	push   r14
     124b166:	41 54                	push   r12
     124b168:	53                   	push   rbx
     124b169:	48 83 ec 68          	sub    rsp,0x68
     124b16d:	49 89 ce             	mov    r14,rcx

### owner wrapper state copy 0x10a9fbe
- caller insn 0x10a9fa6; FDE=(17473438, 17473470)
     10a9f82:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     10a9f87:	75 08                	jne    10a9f91 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713a7>
     10a9f89:	48 83 c4 48          	add    rsp,0x48
     10a9f8d:	5b                   	pop    rbx
     10a9f8e:	41 5e                	pop    r14
     10a9f90:	c3                   	ret
     10a9f91:	e8 1a 5b 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9f96:	48 89 c7             	mov    rdi,rax
     10a9f99:	e8 07 fb 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9f9e:	53                   	push   rbx
     10a9f9f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     10a9fa6:	e8 13 00 00 00       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
     10a9fab:	48 89 df             	mov    rdi,rbx
     10a9fae:	31 f6                	xor    esi,esi
     10a9fb0:	5b                   	pop    rbx
     10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a9fb6:	48 89 c7             	mov    rdi,rax
     10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx
     10a9fc8:	50                   	push   rax
     10a9fc9:	49 89 f6             	mov    r14,rsi
     10a9fcc:	48 89 fb             	mov    rbx,rdi
     10a9fcf:	e8 ca ff fd ff       	call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>
     10a9fd4:	49 8b 86 38 06 00 00 	mov    rax,QWORD PTR [r14+0x638]
     10a9fdb:	48 89 83 38 06 00 00 	mov    QWORD PTR [rbx+0x638],rax
- caller insn 0x1259529; FDE=(19240184, 19240950)
     12594ff:	41 54                	push   r12
     1259501:	53                   	push   rbx
     1259502:	48 83 ec 58          	sub    rsp,0x58
     1259506:	48 89 f5             	mov    rbp,rsi
     1259509:	48 89 fb             	mov    rbx,rdi
     125950c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1259513:	00 00 
     1259515:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     125951a:	80 bf b0 0f 00 00 00 	cmp    BYTE PTR [rdi+0xfb0],0x0
     1259521:	74 10                	je     1259533 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9eab7>
     1259523:	48 89 df             	mov    rdi,rbx
     1259526:	48 89 ee             	mov    rsi,rbp
     1259529:	e8 90 0a e5 ff       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
     125952e:	e9 ca 01 00 00       	jmp    12596fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ec81>
     1259533:	48 89 df             	mov    rdi,rbx
     1259536:	48 89 ee             	mov    rsi,rbp
     1259539:	e8 c6 0f ff ff       	call   124a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fa88>
     125953e:	48 8b 85 38 06 00 00 	mov    rax,QWORD PTR [rbp+0x638]
     1259545:	48 89 83 38 06 00 00 	mov    QWORD PTR [rbx+0x638],rax
     125954c:	be 40 06 00 00       	mov    esi,0x640
     1259551:	4c 8d 34 33          	lea    r14,[rbx+rsi*1]
     1259555:	48 01 ee             	add    rsi,rbp
     1259558:	4c 89 f7             	mov    rdi,r14
     125955b:	e8 e0 49 59 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1259560:	be 58 06 00 00       	mov    esi,0x658
     1259565:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1259569:	48 01 ee             	add    rsi,rbp
     125956c:	e8 cf 49 59 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1259571:	8b 85 7f 06 00 00    	mov    eax,DWORD PTR [rbp+0x67f]
     1259577:	89 83 7f 06 00 00    	mov    DWORD PTR [rbx+0x67f],eax
     125957d:	0f 10 85 70 06 00 00 	movups xmm0,XMMWORD PTR [rbp+0x670]

### owner wrapper payload assignment 0x10aa70a
- caller insn 0x10aa0e1; FDE=(17473470, 17474033)
     10aa0b1:	be c8 08 00 00       	mov    esi,0x8c8
     10aa0b6:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa0ba:	4c 01 f6             	add    rsi,r14
     10aa0bd:	e8 32 02 00 00       	call   10aa2f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27170a>
     10aa0c2:	be e0 08 00 00       	mov    esi,0x8e0
     10aa0c7:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa0cb:	4c 01 f6             	add    rsi,r14
     10aa0ce:	8a 83 90 0f 00 00    	mov    al,BYTE PTR [rbx+0xf90]
     10aa0d4:	41 3a 86 90 0f 00 00 	cmp    al,BYTE PTR [r14+0xf90]
     10aa0db:	75 0b                	jne    10aa0e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2714fe>
     10aa0dd:	84 c0                	test   al,al
     10aa0df:	74 1e                	je     10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e1:	e8 24 06 00 00       	call   10aa70a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b20>
     10aa0e6:	eb 17                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e8:	84 c0                	test   al,al
     10aa0ea:	74 0e                	je     10aa0fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271510>
     10aa0ec:	e8 47 fd ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10aa0f1:	c6 83 90 0f 00 00 00 	mov    BYTE PTR [rbx+0xf90],0x0
     10aa0f8:	eb 05                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0fa:	e8 bd 06 00 00       	call   10aa7bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271bd2>
     10aa0ff:	4c 39 f3             	cmp    rbx,r14
     10aa102:	0f 84 d7 00 00 00    	je     10aa1df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2715f5>
     10aa108:	4c 8d bb 98 0f 00 00 	lea    r15,[rbx+0xf98]
     10aa10f:	4d 8b a6 98 0f 00 00 	mov    r12,QWORD PTR [r14+0xf98]
     10aa116:	4d 8b b6 a0 0f 00 00 	mov    r14,QWORD PTR [r14+0xfa0]
     10aa11d:	4c 89 f0             	mov    rax,r14
     10aa120:	4c 29 e0             	sub    rax,r12
     10aa123:	bf b0 06 00 00       	mov    edi,0x6b0
     10aa128:	48 99                	cqo
     10aa12a:	48 f7 ff             	idiv   rdi
     10aa12d:	49 89 c5             	mov    r13,rax
- caller insn 0x10aa3f6; FDE=(17474516, 17474581)
     10aa3d6:	41 56                	push   r14
     10aa3d8:	41 54                	push   r12
     10aa3da:	53                   	push   rbx
     10aa3db:	50                   	push   rax
     10aa3dc:	48 89 d3             	mov    rbx,rdx
     10aa3df:	48 39 f7             	cmp    rdi,rsi
     10aa3e2:	74 22                	je     10aa406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27181c>
     10aa3e4:	49 89 f6             	mov    r14,rsi
     10aa3e7:	49 89 ff             	mov    r15,rdi
     10aa3ea:	41 bc b0 06 00 00    	mov    r12d,0x6b0
     10aa3f0:	48 89 df             	mov    rdi,rbx
     10aa3f3:	4c 89 fe             	mov    rsi,r15
     10aa3f6:	e8 0f 03 00 00       	call   10aa70a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b20>
     10aa3fb:	4d 01 e7             	add    r15,r12
     10aa3fe:	4c 01 e3             	add    rbx,r12
     10aa401:	4d 39 f7             	cmp    r15,r14
     10aa404:	75 ea                	jne    10aa3f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271806>
     10aa406:	48 89 d8             	mov    rax,rbx
     10aa409:	48 83 c4 08          	add    rsp,0x8
     10aa40d:	5b                   	pop    rbx
     10aa40e:	41 5c                	pop    r12
     10aa410:	41 5e                	pop    r14
     10aa412:	41 5f                	pop    r15
     10aa414:	c3                   	ret
     10aa415:	cc                   	int3
     10aa416:	55                   	push   rbp
     10aa417:	41 57                	push   r15
     10aa419:	41 56                	push   r14
     10aa41b:	41 55                	push   r13
     10aa41d:	41 54                	push   r12
     10aa41f:	53                   	push   rbx

## Concrete optional engagement writes in state-helper / owner clusters
### 0x1088fe3: mov    BYTE PTR [rdi+0x560],al; FDE=(17338320, 17338431)
     1088fd0:	41 56                	push   r14
     1088fd2:	53                   	push   rbx
     1088fd3:	50                   	push   rax
     1088fd4:	48 89 fb             	mov    rbx,rdi
     1088fd7:	c6 07 01             	mov    BYTE PTR [rdi],0x1
     1088fda:	83 67 08 00          	and    DWORD PTR [rdi+0x8],0x0
     1088fde:	31 c0                	xor    eax,eax
     1088fe0:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
     1088fe3:	88 87 60 05 00 00    	mov    BYTE PTR [rdi+0x560],al
     1088fe9:	48 81 c7 68 05 00 00 	add    rdi,0x568
     1088ff0:	4c 8d b3 00 06 00 00 	lea    r14,[rbx+0x600]
     1088ff7:	0f 57 c0             	xorps  xmm0,xmm0
     1088ffa:	0f 11 83 00 06 00 00 	movups XMMWORD PTR [rbx+0x600],xmm0
     1089001:	83 63 01 00          	and    DWORD PTR [rbx+0x1],0x0
     1089005:	ba 90 00 00 00       	mov    edx,0x90
     108900a:	31 f6                	xor    esi,esi
     108900c:	e8 7f 5b 76 00       	call   17eeb90 <memset@plt>
     1089011:	4c 89 b3 f8 05 00 00 	mov    QWORD PTR [rbx+0x5f8],r14
     1089018:	48 8d 83 18 06 00 00 	lea    rax,[rbx+0x618]
     108901f:	0f 57 c0             	xorps  xmm0,xmm0
     1089022:	0f 11 83 18 06 00 00 	movups XMMWORD PTR [rbx+0x618],xmm0

### 0x1089e6c: mov    QWORD PTR [rbx+0x598],rax; FDE=(17341854, 17342366)
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

### 0x1089ff7: mov    BYTE PTR [rbx+0x560],0x0; FDE=(17342366, 17343607)
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12
     108a02a:	4c 29 e8             	sub    rax,r13
     108a02d:	bf 50 05 00 00       	mov    edi,0x550
     108a032:	48 99                	cqo

### 0x108dc5d: mov    BYTE PTR [rbx+0x550],0x1; FDE=(17357908, 17357926)
     108dc48:	e8 f1 86 fc ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     108dc4d:	c6 43 38 00          	mov    BYTE PTR [rbx+0x38],0x0
     108dc51:	5b                   	pop    rbx
     108dc52:	c3                   	ret
     108dc53:	cc                   	int3
     108dc54:	53                   	push   rbx
     108dc55:	48 89 fb             	mov    rbx,rdi
     108dc58:	e8 2f fc ff ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     108dc5d:	c6 83 50 05 00 00 01 	mov    BYTE PTR [rbx+0x550],0x1
     108dc64:	5b                   	pop    rbx
     108dc65:	c3                   	ret
     108dc66:	31 c0                	xor    eax,eax
     108dc68:	88 07                	mov    BYTE PTR [rdi],al
     108dc6a:	88 87 50 05 00 00    	mov    BYTE PTR [rdi+0x550],al
     108dc70:	38 86 50 05 00 00    	cmp    BYTE PTR [rsi+0x550],al
     108dc76:	0f 85 46 00 00 00    	jne    108dcc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550d8>
     108dc7c:	c3                   	ret
     108dc7d:	cc                   	int3
     108dc7e:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     108dc82:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     108dc86:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]

### 0x108dc6a: mov    BYTE PTR [rdi+0x550],al; FDE=(17357926, 17357949)
     108dc54:	53                   	push   rbx
     108dc55:	48 89 fb             	mov    rbx,rdi
     108dc58:	e8 2f fc ff ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     108dc5d:	c6 83 50 05 00 00 01 	mov    BYTE PTR [rbx+0x550],0x1
     108dc64:	5b                   	pop    rbx
     108dc65:	c3                   	ret
     108dc66:	31 c0                	xor    eax,eax
     108dc68:	88 07                	mov    BYTE PTR [rdi],al
     108dc6a:	88 87 50 05 00 00    	mov    BYTE PTR [rdi+0x550],al
     108dc70:	38 86 50 05 00 00    	cmp    BYTE PTR [rsi+0x550],al
     108dc76:	0f 85 46 00 00 00    	jne    108dcc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550d8>
     108dc7c:	c3                   	ret
     108dc7d:	cc                   	int3
     108dc7e:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     108dc82:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     108dc86:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     108dc89:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     108dc8c:	0f 57 c0             	xorps  xmm0,xmm0
     108dc8f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     108dc94:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     108dc97:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0

### 0x108dccb: mov    BYTE PTR [rbx+0x550],0x1; FDE=(17358018, 17358036)
     108dcb0:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     108dcb4:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     108dcb8:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     108dcbc:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     108dcc1:	c3                   	ret
     108dcc2:	53                   	push   rbx
     108dcc3:	48 89 fb             	mov    rbx,rdi
     108dcc6:	e8 09 00 00 00       	call   108dcd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550ea>
     108dccb:	c6 83 50 05 00 00 01 	mov    BYTE PTR [rbx+0x550],0x1
     108dcd2:	5b                   	pop    rbx
     108dcd3:	c3                   	ret
     108dcd4:	41 56                	push   r14
     108dcd6:	53                   	push   rbx
     108dcd7:	50                   	push   rax
     108dcd8:	49 89 f6             	mov    r14,rsi
     108dcdb:	48 89 fb             	mov    rbx,rdi
     108dcde:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     108dce2:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     108dce6:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     108dce9:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     108dcec:	0f 57 c9             	xorps  xmm1,xmm1

### 0x108de74: mov    BYTE PTR [rbx+0x428],al; FDE=(17358036, 17358525)
     108de4e:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
     108de55:	00 
     108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108de5d:	00 
     108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108de6c:	31 c0                	xor    eax,eax
     108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
     108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
     108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
     108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
     108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
     108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     108de96:	be 30 04 00 00       	mov    esi,0x430
     108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108de9f:	4c 01 f6             	add    rsi,r14
     108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
     108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108deae:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108deb5:	48 83 c4 08          	add    rsp,0x8

## All subtype-6 comparisons/writes near known player/event clusters
### 0x10a9668: cmp    BYTE PTR [rsi+0x38],0x6; FDE=(17471080, 17471132)
     10a964d:	00 00 
     10a964f:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     10a9654:	75 0d                	jne    10a9663 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a79>
     10a9656:	48 89 d8             	mov    rax,rbx
     10a9659:	48 83 c4 50          	add    rsp,0x50
     10a965d:	5b                   	pop    rbx
     10a965e:	41 5e                	pop    r14
     10a9660:	41 5f                	pop    r15
     10a9662:	c3                   	ret
     10a9663:	e8 48 64 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3

### 0x10d61ea: cmp    DWORD PTR [rsi+0x38],0x60; FDE=(17654250, 17654258)
     10d61d3:	0f 94 c0             	sete   al
     10d61d6:	20 d0                	and    al,dl
     10d61d8:	c3                   	ret
     10d61d9:	cc                   	int3
     10d61da:	83 7e 38 3e          	cmp    DWORD PTR [rsi+0x38],0x3e
     10d61de:	0f 94 c0             	sete   al
     10d61e1:	c3                   	ret
     10d61e2:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     10d61e6:	0f 94 c0             	sete   al
     10d61e9:	c3                   	ret
     10d61ea:	83 7e 38 60          	cmp    DWORD PTR [rsi+0x38],0x60
     10d61ee:	0f 94 c0             	sete   al
     10d61f1:	c3                   	ret
     10d61f2:	83 7e 38 65          	cmp    DWORD PTR [rsi+0x38],0x65
     10d61f6:	0f 94 c0             	sete   al
     10d61f9:	c3                   	ret
     10d61fa:	83 7e 38 5c          	cmp    DWORD PTR [rsi+0x38],0x5c
     10d61fe:	0f 94 c0             	sete   al
     10d6201:	c3                   	ret
     10d6202:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     10d6205:	0f 10 4e 10          	movups xmm1,XMMWORD PTR [rsi+0x10]
     10d6209:	0f 11 4f 10          	movups XMMWORD PTR [rdi+0x10],xmm1
     10d620d:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     10d6210:	48 83 c7 20          	add    rdi,0x20
     10d6214:	48 83 c6 20          	add    rsi,0x20
     10d6218:	e9 23 7d 71 00       	jmp    17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10d621d:	cc                   	int3

### 0x10d61f2: cmp    DWORD PTR [rsi+0x38],0x65; FDE=(17654258, 17654266)
     10d61d9:	cc                   	int3
     10d61da:	83 7e 38 3e          	cmp    DWORD PTR [rsi+0x38],0x3e
     10d61de:	0f 94 c0             	sete   al
     10d61e1:	c3                   	ret
     10d61e2:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     10d61e6:	0f 94 c0             	sete   al
     10d61e9:	c3                   	ret
     10d61ea:	83 7e 38 60          	cmp    DWORD PTR [rsi+0x38],0x60
     10d61ee:	0f 94 c0             	sete   al
     10d61f1:	c3                   	ret
     10d61f2:	83 7e 38 65          	cmp    DWORD PTR [rsi+0x38],0x65
     10d61f6:	0f 94 c0             	sete   al
     10d61f9:	c3                   	ret
     10d61fa:	83 7e 38 5c          	cmp    DWORD PTR [rsi+0x38],0x5c
     10d61fe:	0f 94 c0             	sete   al
     10d6201:	c3                   	ret
     10d6202:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     10d6205:	0f 10 4e 10          	movups xmm1,XMMWORD PTR [rsi+0x10]
     10d6209:	0f 11 4f 10          	movups XMMWORD PTR [rdi+0x10],xmm1
     10d620d:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     10d6210:	48 83 c7 20          	add    rdi,0x20
     10d6214:	48 83 c6 20          	add    rsi,0x20
     10d6218:	e9 23 7d 71 00       	jmp    17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10d621d:	cc                   	int3
     10d621e:	83 ff 01             	cmp    edi,0x1
     10d6221:	74 1f                	je     10d6242 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d658>
     10d6223:	85 ff                	test   edi,edi

### 0x10df261: cmp    DWORD PTR [r12+0x38],0x60; FDE=(17691092, 17691404)
     10df237:	48 89 ef             	mov    rdi,rbp
     10df23a:	4c 89 e6             	mov    rsi,r12
     10df23d:	e8 e8 b2 5e 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     10df242:	48 8d 54 24 06       	lea    rdx,[rsp+0x6]
     10df247:	66 c7 02 d4 00       	mov    WORD PTR [rdx],0xd4
     10df24c:	4c 89 ef             	mov    rdi,r13
     10df24f:	48 89 ee             	mov    rsi,rbp
     10df252:	e8 3d 7b ff ff       	call   10d6d94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29e1aa>
     10df257:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     10df25c:	e8 2f ec 70 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10df261:	41 83 7c 24 38 60    	cmp    DWORD PTR [r12+0x38],0x60
     10df267:	75 2f                	jne    10df298 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a66ae>
     10df269:	48 8d 6c 24 08       	lea    rbp,[rsp+0x8]
     10df26e:	48 89 ef             	mov    rdi,rbp
     10df271:	4c 89 e6             	mov    rsi,r12
     10df274:	e8 b1 b2 5e 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     10df279:	48 8d 54 24 06       	lea    rdx,[rsp+0x6]
     10df27e:	66 c7 02 f9 00       	mov    WORD PTR [rdx],0xf9
     10df283:	4c 89 ef             	mov    rdi,r13
     10df286:	48 89 ee             	mov    rsi,rbp
     10df289:	e8 06 7b ff ff       	call   10d6d94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29e1aa>
     10df28e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     10df293:	e8 f8 eb 70 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10df298:	31 ff                	xor    edi,edi
     10df29a:	e8 7d f1 9b ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     10df29f:	4d 89 37             	mov    QWORD PTR [r15],r14
     10df2a2:	49 89 5f 08          	mov    QWORD PTR [r15+0x8],rbx

### 0x10df337: cmp    DWORD PTR [rdx+0x38],0x60; FDE=(17691404, 17692391)
     10df313:	41 54                	push   r12
     10df315:	53                   	push   rbx
     10df316:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
     10df31d:	49 89 d6             	mov    r14,rdx
     10df320:	49 89 f7             	mov    r15,rsi
     10df323:	48 89 fb             	mov    rbx,rdi
     10df326:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10df32d:	00 00 
     10df32f:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     10df336:	00 
     10df337:	83 7a 38 60          	cmp    DWORD PTR [rdx+0x38],0x60
     10df33b:	75 36                	jne    10df373 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6789>
     10df33d:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
     10df341:	49 8d 57 38          	lea    rdx,[r15+0x38]
     10df345:	45 0f b6 87 a8 00 00 	movzx  r8d,BYTE PTR [r15+0xa8]
     10df34c:	00 
     10df34d:	4c 89 f7             	mov    rdi,r14
     10df350:	31 c9                	xor    ecx,ecx
     10df352:	45 31 c9             	xor    r9d,r9d
     10df355:	e8 d1 84 ff ff       	call   10d782b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ec41>
     10df35a:	89 c5                	mov    ebp,eax
     10df35c:	31 ff                	xor    edi,edi
     10df35e:	e8 23 f1 9b ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10df363:	40 84 ed             	test   bpl,bpl
     10df366:	74 0b                	je     10df373 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6789>
     10df368:	c7 03 01 00 00 00    	mov    DWORD PTR [rbx],0x1
     10df36e:	e9 ec 01 00 00       	jmp    10df55f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6975>

### 0x10df7fb: cmp    DWORD PTR [rsi+0x38],0x60; FDE=(17692632, 17692878)
     10df7d8:	41 57                	push   r15
     10df7da:	41 56                	push   r14
     10df7dc:	53                   	push   rbx
     10df7dd:	48 81 ec 90 00 00 00 	sub    rsp,0x90
     10df7e4:	49 89 f6             	mov    r14,rsi
     10df7e7:	49 89 ff             	mov    r15,rdi
     10df7ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10df7f1:	00 00 
     10df7f3:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     10df7fa:	00 
     10df7fb:	83 7e 38 60          	cmp    DWORD PTR [rsi+0x38],0x60
     10df7ff:	75 2f                	jne    10df830 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6c46>
     10df801:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
     10df805:	49 8d 57 70          	lea    rdx,[r15+0x70]
     10df809:	45 0f b6 87 a8 00 00 	movzx  r8d,BYTE PTR [r15+0xa8]
     10df810:	00 
     10df811:	4c 89 f7             	mov    rdi,r14
     10df814:	31 c9                	xor    ecx,ecx
     10df816:	45 31 c9             	xor    r9d,r9d
     10df819:	e8 0d 80 ff ff       	call   10d782b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ec41>
     10df81e:	89 c3                	mov    ebx,eax
     10df820:	31 ff                	xor    edi,edi
     10df822:	e8 5f ec 9b ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10df827:	84 db                	test   bl,bl
     10df829:	74 05                	je     10df830 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6c46>
     10df82b:	6a 01                	push   0x1
     10df82d:	5b                   	pop    rbx

### 0x10fa4bc: cmp    DWORD PTR [r14+0x38],0x60; FDE=(17802380, 17802479)
     10fa493:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10fa49a:	00 00 
     10fa49c:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     10fa4a1:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
     10fa4a5:	74 27                	je     10fa4ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c18e4>
     10fa4a7:	e8 8a 13 98 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10fa4ac:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     10fa4b1:	4c 89 f7             	mov    rdi,r14
     10fa4b4:	48 89 c6             	mov    rsi,rax
     10fa4b7:	e8 6c af 5c 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     10fa4bc:	41 83 7e 38 60       	cmp    DWORD PTR [r14+0x38],0x60
     10fa4c1:	0f 94 c3             	sete   bl
     10fa4c4:	4c 89 f7             	mov    rdi,r14
     10fa4c7:	e8 62 ae 5c 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10fa4cc:	eb 02                	jmp    10fa4d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c18e6>
     10fa4ce:	31 db                	xor    ebx,ebx
     10fa4d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10fa4d7:	00 00 
     10fa4d9:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     10fa4de:	75 0a                	jne    10fa4ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1900>
     10fa4e0:	89 d8                	mov    eax,ebx
     10fa4e2:	48 83 c4 68          	add    rsp,0x68
     10fa4e6:	5b                   	pop    rbx
     10fa4e7:	41 5e                	pop    r14
     10fa4e9:	c3                   	ret
     10fa4ea:	e8 c1 55 6f 00       	call   17efab0 <__stack_chk_fail@plt>
     10fa4ef:	41 56                	push   r14

### 0x10fa51f: cmp    DWORD PTR [r14+0x38],0x65; FDE=(17802479, 17802578)
     10fa4f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10fa4fd:	00 00 
     10fa4ff:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     10fa504:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
     10fa508:	74 27                	je     10fa531 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1947>
     10fa50a:	e8 27 13 98 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10fa50f:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     10fa514:	4c 89 f7             	mov    rdi,r14
     10fa517:	48 89 c6             	mov    rsi,rax
     10fa51a:	e8 09 af 5c 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     10fa51f:	41 83 7e 38 65       	cmp    DWORD PTR [r14+0x38],0x65
     10fa524:	0f 94 c3             	sete   bl
     10fa527:	4c 89 f7             	mov    rdi,r14
     10fa52a:	e8 ff ad 5c 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10fa52f:	eb 02                	jmp    10fa533 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1949>
     10fa531:	31 db                	xor    ebx,ebx
     10fa533:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10fa53a:	00 00 
     10fa53c:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     10fa541:	75 0a                	jne    10fa54d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1963>
     10fa543:	89 d8                	mov    eax,ebx
     10fa545:	48 83 c4 68          	add    rsp,0x68
     10fa549:	5b                   	pop    rbx
     10fa54a:	41 5e                	pop    r14
     10fa54c:	c3                   	ret
     10fa54d:	e8 5e 55 6f 00       	call   17efab0 <__stack_chk_fail@plt>
     10fa552:	41 56                	push   r14

### 0x110761f: cmp    DWORD PTR [rdi+0x38],0x64; FDE=(17855966, 17856084)
     1107603:	40 0f 95 c5          	setne  bpl
     1107607:	74 23                	je     110762c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cea42>
     1107609:	45 84 f6             	test   r14b,r14b
     110760c:	74 1e                	je     110762c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cea42>
     110760e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1107611:	48 89 e7             	mov    rdi,rsp
     1107614:	48 89 de             	mov    rsi,rbx
     1107617:	31 d2                	xor    edx,edx
     1107619:	ff 50 10             	call   QWORD PTR [rax+0x10]
     110761c:	48 89 e7             	mov    rdi,rsp
     110761f:	83 7f 38 64          	cmp    DWORD PTR [rdi+0x38],0x64
     1107623:	40 0f 95 c5          	setne  bpl
     1107627:	e8 02 dd 5b 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     110762c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1107633:	00 00 
     1107635:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     110763a:	75 0b                	jne    1107647 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cea5d>
     110763c:	89 e8                	mov    eax,ebp
     110763e:	48 83 c4 60          	add    rsp,0x60
     1107642:	5b                   	pop    rbx
     1107643:	41 5e                	pop    r14
     1107645:	5d                   	pop    rbp
     1107646:	c3                   	ret
     1107647:	e8 64 84 6e 00       	call   17efab0 <__stack_chk_fail@plt>
     110764c:	48 89 c7             	mov    rdi,rax
     110764f:	e8 51 24 97 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1107654:	55                   	push   rbp

### 0x1183491: cmp    DWORD PTR [rdx+0x38],0x66; FDE=(18363514, 18363776)
     1183471:	48 89 df             	mov    rdi,rbx
     1183474:	5b                   	pop    rbx
     1183475:	e9 a6 aa 66 00       	jmp    17edf20 <_ZdlPv@plt>
     118347a:	41 57                	push   r15
     118347c:	41 56                	push   r14
     118347e:	53                   	push   rbx
     118347f:	48 83 ec 70          	sub    rsp,0x70
     1183483:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     118348a:	00 00 
     118348c:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     1183491:	83 7a 38 66          	cmp    DWORD PTR [rdx+0x38],0x66
     1183495:	0f 85 82 00 00 00    	jne    118351d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a933>
     118349b:	48 89 d3             	mov    rbx,rdx
     118349e:	49 89 fe             	mov    r14,rdi
     11834a1:	0f 57 c0             	xorps  xmm0,xmm0
     11834a4:	0f 11 44 24 20       	movups XMMWORD PTR [rsp+0x20],xmm0
     11834a9:	48 8d 05 d8 5f 6d 00 	lea    rax,[rip+0x6d5fd8]        # 1859488 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15b70>
     11834b0:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11834b5:	48 8d 05 3c c3 2b ff 	lea    rax,[rip+0xffffffffff2bc33c]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     11834bc:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11834c1:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11834c6:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11834cb:	0f 11 44 24 48       	movups XMMWORD PTR [rsp+0x48],xmm0
     11834d0:	0f 11 44 24 54       	movups XMMWORD PTR [rsp+0x54],xmm0
     11834d5:	48 8b 87 80 00 00 00 	mov    rax,QWORD PTR [rdi+0x80]
     11834dc:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     11834e0:	48 89 d6             	mov    rsi,rdx

### 0x11838b8: cmp    DWORD PTR [rdx+0x38],0x66; FDE=(18364566, 18364983)
     1183897:	41 57                	push   r15
     1183899:	41 56                	push   r14
     118389b:	41 55                	push   r13
     118389d:	41 54                	push   r12
     118389f:	53                   	push   rbx
     11838a0:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     11838a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11838ae:	00 00 
     11838b0:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     11838b7:	00 
     11838b8:	83 7a 38 66          	cmp    DWORD PTR [rdx+0x38],0x66
     11838bc:	75 25                	jne    11838e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34acf9>
     11838be:	4c 89 cb             	mov    rbx,r9
     11838c1:	49 89 cc             	mov    r12,rcx
     11838c4:	49 89 d6             	mov    r14,rdx
     11838c7:	49 89 fd             	mov    r13,rdi
     11838ca:	6a 06                	push   0x6
     11838cc:	5e                   	pop    rsi
     11838cd:	4c 89 cf             	mov    rdi,r9
     11838d0:	e8 c5 c8 01 00       	call   11a019a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3675b0>
     11838d5:	84 c0                	test   al,al
     11838d7:	74 0a                	je     11838e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34acf9>
     11838d9:	0f b7 43 20          	movzx  eax,WORD PTR [rbx+0x20]
     11838dd:	66 a9 01 08          	test   ax,0x801
     11838e1:	74 2d                	je     1183910 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ad26>
     11838e3:	31 ed                	xor    ebp,ebp
     11838e5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x1197c97: cmp    DWORD PTR [rdx+0x38],0x62; FDE=(18447488, 18447710)
     1197c77:	48 89 df             	mov    rdi,rbx
     1197c7a:	5b                   	pop    rbx
     1197c7b:	e9 a0 62 65 00       	jmp    17edf20 <_ZdlPv@plt>
     1197c80:	41 57                	push   r15
     1197c82:	41 56                	push   r14
     1197c84:	53                   	push   rbx
     1197c85:	48 83 ec 70          	sub    rsp,0x70
     1197c89:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1197c90:	00 00 
     1197c92:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     1197c97:	83 7a 38 62          	cmp    DWORD PTR [rdx+0x38],0x62
     1197c9b:	75 5c                	jne    1197cf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f10f>
     1197c9d:	48 89 d3             	mov    rbx,rdx
     1197ca0:	49 89 fe             	mov    r14,rdi
     1197ca3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1197ca8:	e8 9d 10 00 00       	call   1198d4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x360160>
     1197cad:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
     1197cb4:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     1197cb8:	48 89 de             	mov    rsi,rbx
     1197cbb:	e8 92 b4 41 00       	call   15b3152 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f86d6>
     1197cc0:	84 c0                	test   al,al
     1197cc2:	74 39                	je     1197cfd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f113>
     1197cc4:	4d 8b b6 a0 00 00 00 	mov    r14,QWORD PTR [r14+0xa0]
     1197ccb:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     1197cd0:	4c 89 ff             	mov    rdi,r15
     1197cd3:	48 89 de             	mov    rsi,rbx
     1197cd6:	e8 4f 28 53 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>

### 0x1197fe2: cmp    DWORD PTR [rdx+0x38],0x62; FDE=(18448320, 18448726)
     1197fc1:	41 57                	push   r15
     1197fc3:	41 56                	push   r14
     1197fc5:	41 55                	push   r13
     1197fc7:	41 54                	push   r12
     1197fc9:	53                   	push   rbx
     1197fca:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     1197fd1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1197fd8:	00 00 
     1197fda:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     1197fe1:	00 
     1197fe2:	83 7a 38 62          	cmp    DWORD PTR [rdx+0x38],0x62
     1197fe6:	0f 85 ac 00 00 00    	jne    1198098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f4ae>
     1197fec:	4c 89 cb             	mov    rbx,r9
     1197fef:	49 89 cd             	mov    r13,rcx
     1197ff2:	49 89 d6             	mov    r14,rdx
     1197ff5:	49 89 ff             	mov    r15,rdi
     1197ff8:	6a 06                	push   0x6
     1197ffa:	5e                   	pop    rsi
     1197ffb:	4c 89 cf             	mov    rdi,r9
     1197ffe:	e8 97 81 00 00       	call   11a019a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3675b0>
     1198003:	84 c0                	test   al,al
     1198005:	0f 84 8d 00 00 00    	je     1198098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f4ae>
     119800b:	f6 43 20 01          	test   BYTE PTR [rbx+0x20],0x1
     119800f:	0f 85 83 00 00 00    	jne    1198098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f4ae>
     1198015:	48 89 e5             	mov    rbp,rsp
     1198018:	48 89 ef             	mov    rdi,rbp
     119801b:	4c 89 f6             	mov    rsi,r14

### 0x12d255e: cmp    DWORD PTR [rax+0x38],0x64; FDE=(19729348, 19740878)
     12d2540:	00 
     12d2541:	49 8b 06             	mov    rax,QWORD PTR [r14]
     12d2544:	4c 89 f7             	mov    rdi,r14
     12d2547:	48 89 de             	mov    rsi,rbx
     12d254a:	ff 50 20             	call   QWORD PTR [rax+0x20]
     12d254d:	48 89 df             	mov    rdi,rbx
     12d2550:	e8 65 18 e5 ff       	call   1123dba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eb1d0>
     12d2555:	49 8b 06             	mov    rax,QWORD PTR [r14]
     12d2558:	4c 89 f7             	mov    rdi,r14
     12d255b:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12d255e:	83 78 38 64          	cmp    DWORD PTR [rax+0x38],0x64
     12d2562:	75 7a                	jne    12d25de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117b62>
     12d2564:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12d2569:	e8 a6 3b 00 00       	call   12d6114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11b698>
     12d256e:	48 89 c3             	mov    rbx,rax
     12d2571:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d2576:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d2579:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12d257c:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
     12d2580:	80 b9 07 01 00 00 00 	cmp    BYTE PTR [rcx+0x107],0x0
     12d2587:	74 55                	je     12d25de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117b62>
     12d2589:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
     12d258d:	48 8b 49 10          	mov    rcx,QWORD PTR [rcx+0x10]
     12d2591:	48 8b b9 30 01 00 00 	mov    rdi,QWORD PTR [rcx+0x130]
     12d2598:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     12d259b:	48 89 c6             	mov    rsi,rax
     12d259e:	31 d2                	xor    edx,edx

### 0x12d2baa: cmp    DWORD PTR [rax+0x38],0x64; FDE=(19729348, 19740878)
     12d2b86:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12d2b89:	89 c3                	mov    ebx,eax
     12d2b8b:	4c 89 e7             	mov    rdi,r12
     12d2b8e:	e8 d1 54 a8 ff       	call   d58064 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250ea>
     12d2b93:	84 db                	test   bl,bl
     12d2b95:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d2b99:	0f 85 56 01 00 00    	jne    12d2cf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118279>
     12d2b9f:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d2ba4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d2ba7:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12d2baa:	83 78 38 64          	cmp    DWORD PTR [rax+0x38],0x64
     12d2bae:	0f 85 98 00 00 00    	jne    12d2c4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1181d0>
     12d2bb4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     12d2bb9:	80 78 18 00          	cmp    BYTE PTR [rax+0x18],0x0
     12d2bbd:	74 4e                	je     12d2c0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118191>
     12d2bbf:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d2bc4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d2bc7:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12d2bca:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
     12d2bce:	4c 89 ef             	mov    rdi,r13
     12d2bd1:	48 89 c6             	mov    rsi,rax
     12d2bd4:	31 d2                	xor    edx,edx
     12d2bd6:	ff 91 88 01 00 00    	call   QWORD PTR [rcx+0x188]
     12d2bdc:	48 89 ef             	mov    rdi,rbp
     12d2bdf:	89 c6                	mov    esi,eax
     12d2be1:	e8 28 c1 07 00       	call   134ed0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194292>
     12d2be6:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]

### 0x139ba71: mov    BYTE PTR [rsi+0x38],0x6; FDE=(20560346, 20561320)
     139ba4c:	00 
     139ba4d:	e8 2c e0 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139ba52:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
     139ba59:	00 
     139ba5a:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139ba5e:	49 69 c6 e8 03 00 00 	imul   rax,r14,0x3e8
     139ba65:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139ba69:	31 c0                	xor    eax,eax
     139ba6b:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139ba6e:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139ba71:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139ba75:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     139ba7a:	e8 1b 06 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139ba7f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139ba86:	00 
     139ba87:	e8 04 24 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139ba8c:	31 c0                	xor    eax,eax
     139ba8e:	4c 8d b4 24 c8 00 00 	lea    r14,[rsp+0xc8]
     139ba95:	00 
     139ba96:	41 88 46 f8          	mov    BYTE PTR [r14-0x8],al
     139ba9a:	0f 57 c0             	xorps  xmm0,xmm0
     139ba9d:	41 0f 29 46 d8       	movaps XMMWORD PTR [r14-0x28],xmm0
     139baa2:	41 88 46 e8          	mov    BYTE PTR [r14-0x18],al
     139baa6:	4c 89 f7             	mov    rdi,r14
     139baa9:	4c 89 fe             	mov    rsi,r15
     139baac:	e8 8f ea 9c ff       	call   d6a540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375c6>
     139bab1:	4c 8d a4 24 c0 01 00 	lea    r12,[rsp+0x1c0]

### 0x139be38: mov    BYTE PTR [rsi+0x38],0x6; FDE=(20561320, 20562040)
     139be13:	00 
     139be14:	e8 65 dc 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139be19:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
     139be20:	00 
     139be21:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139be25:	49 69 c7 e8 03 00 00 	imul   rax,r15,0x3e8
     139be2c:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139be30:	31 c0                	xor    eax,eax
     139be32:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139be35:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139be38:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139be3c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     139be41:	e8 54 02 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139be46:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139be4d:	00 
     139be4e:	e8 3d 20 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139be53:	40 8a ab b0 0b 00 00 	mov    bpl,BYTE PTR [rbx+0xbb0]
     139be5a:	f3 0f 10 83 d0 0b 00 	movss  xmm0,DWORD PTR [rbx+0xbd0]
     139be61:	00 
     139be62:	f3 0f 11 44 24 4c    	movss  DWORD PTR [rsp+0x4c],xmm0
     139be68:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     139be6f:	00 
     139be70:	4c 89 f6             	mov    rsi,r14
     139be73:	e8 36 9f fe ff       	call   1385dae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb332>
     139be78:	40 84 ed             	test   bpl,bpl
     139be7b:	74 08                	je     139be85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1409>
     139be7d:	f3 0f 10 4c 24 4c    	movss  xmm1,DWORD PTR [rsp+0x4c]

## Calls from subtype-6 consumer/rebuild neighborhood into state-copy/reset helpers
- 0x10a9696: jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>; FDE=(17471080, 17471132)
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>
     10a96b9:	cc                   	int3
     10a96ba:	41 56                	push   r14
     10a96bc:	53                   	push   rbx
     10a96bd:	48 83 ec 28          	sub    rsp,0x28
     10a96c1:	48 89 fb             	mov    rbx,rdi

- 0x10a96b4: jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>; FDE=(17471152, 17471161)
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>
     10a96b9:	cc                   	int3
     10a96ba:	41 56                	push   r14
     10a96bc:	53                   	push   rbx
     10a96bd:	48 83 ec 28          	sub    rsp,0x28
     10a96c1:	48 89 fb             	mov    rbx,rdi
     10a96c4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a96cb:	00 00 
     10a96cd:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a96d2:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     10a96d7:	4c 89 f7             	mov    rdi,r14
     10a96da:	e8 a5 00 aa ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     10a96df:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10a96e2:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a96e5:	48 8d 43 08          	lea    rax,[rbx+0x8]

- 0x10a9e43: call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>; FDE=(17473080, 17473105)
     10a9e20:	e8 6b 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e25:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     10a9e29:	e8 62 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e2e:	48 89 df             	mov    rdi,rbx
     10a9e31:	5b                   	pop    rbx
     10a9e32:	e9 59 40 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e37:	cc                   	int3
     10a9e38:	53                   	push   rbx
     10a9e39:	48 89 fb             	mov    rbx,rdi
     10a9e3c:	48 81 c7 60 01 00 00 	add    rdi,0x160
     10a9e43:	e8 2a fc fd ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     10a9e48:	48 89 df             	mov    rdi,rbx
     10a9e4b:	5b                   	pop    rbx
     10a9e4c:	e9 9d ff ff ff       	jmp    10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
     10a9e51:	cc                   	int3
     10a9e52:	53                   	push   rbx
     10a9e53:	48 89 fb             	mov    rbx,rdi
     10a9e56:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10a9e59:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
     10a9e5d:	74 11                	je     10a9e70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271286>
     10a9e5f:	e8 0e 00 00 00       	call   10a9e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271288>
     10a9e64:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10a9e67:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     10a9e6a:	5b                   	pop    rbx
     10a9e6b:	e9 b0 40 74 00       	jmp    17edf20 <_ZdlPv@plt>

- 0x10a9e98: call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>; FDE=(17473146, 17473196)
     10a9e7a:	41 57                	push   r15
     10a9e7c:	41 56                	push   r14
     10a9e7e:	53                   	push   rbx
     10a9e7f:	48 89 f3             	mov    rbx,rsi
     10a9e82:	49 89 fe             	mov    r14,rdi
     10a9e85:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
     10a9e89:	49 39 f7             	cmp    r15,rsi
     10a9e8c:	74 14                	je     10a9ea2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712b8>
     10a9e8e:	49 81 c7 50 f9 ff ff 	add    r15,0xfffffffffffff950
     10a9e95:	4c 89 ff             	mov    rdi,r15
     10a9e98:	e8 9b ff ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10a9e9d:	49 39 df             	cmp    r15,rbx
     10a9ea0:	75 ec                	jne    10a9e8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712a4>
     10a9ea2:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     10a9ea6:	5b                   	pop    rbx
     10a9ea7:	41 5e                	pop    r14
     10a9ea9:	41 5f                	pop    r15
     10a9eab:	c3                   	ret
     10a9eac:	41 57                	push   r15
     10a9eae:	41 56                	push   r14
     10a9eb0:	53                   	push   rbx
     10a9eb1:	49 89 f7             	mov    r15,rsi
     10a9eb4:	48 89 fb             	mov    rbx,rdi
     10a9eb7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     10a9eba:	48 89 f7             	mov    rdi,rsi

- 0x10a9fa6: call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>; FDE=(17473438, 17473470)
     10a9f89:	48 83 c4 48          	add    rsp,0x48
     10a9f8d:	5b                   	pop    rbx
     10a9f8e:	41 5e                	pop    r14
     10a9f90:	c3                   	ret
     10a9f91:	e8 1a 5b 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9f96:	48 89 c7             	mov    rdi,rax
     10a9f99:	e8 07 fb 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9f9e:	53                   	push   rbx
     10a9f9f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     10a9fa6:	e8 13 00 00 00       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
     10a9fab:	48 89 df             	mov    rdi,rbx
     10a9fae:	31 f6                	xor    esi,esi
     10a9fb0:	5b                   	pop    rbx
     10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a9fb6:	48 89 c7             	mov    rdi,rax
     10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx
     10a9fc8:	50                   	push   rax
     10a9fc9:	49 89 f6             	mov    r14,rsi

- 0x10a9fb1: jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>; FDE=(17473438, 17473470)
     10a9f91:	e8 1a 5b 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9f96:	48 89 c7             	mov    rdi,rax
     10a9f99:	e8 07 fb 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9f9e:	53                   	push   rbx
     10a9f9f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     10a9fa6:	e8 13 00 00 00       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
     10a9fab:	48 89 df             	mov    rdi,rbx
     10a9fae:	31 f6                	xor    esi,esi
     10a9fb0:	5b                   	pop    rbx
     10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a9fb6:	48 89 c7             	mov    rdi,rax
     10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx
     10a9fc8:	50                   	push   rax
     10a9fc9:	49 89 f6             	mov    r14,rsi
     10a9fcc:	48 89 fb             	mov    rbx,rdi
     10a9fcf:	e8 ca ff fd ff       	call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>
     10a9fd4:	49 8b 86 38 06 00 00 	mov    rax,QWORD PTR [r14+0x638]
     10a9fdb:	48 89 83 38 06 00 00 	mov    QWORD PTR [rbx+0x638],rax

- 0x10a9fcf: call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>; FDE=(17473470, 17474033)
     10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx
     10a9fc8:	50                   	push   rax
     10a9fc9:	49 89 f6             	mov    r14,rsi
     10a9fcc:	48 89 fb             	mov    rbx,rdi
     10a9fcf:	e8 ca ff fd ff       	call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>
     10a9fd4:	49 8b 86 38 06 00 00 	mov    rax,QWORD PTR [r14+0x638]
     10a9fdb:	48 89 83 38 06 00 00 	mov    QWORD PTR [rbx+0x638],rax
     10a9fe2:	be 40 06 00 00       	mov    esi,0x640
     10a9fe7:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10a9feb:	4c 01 f6             	add    rsi,r14
     10a9fee:	e8 8d 40 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10a9ff3:	be 58 06 00 00       	mov    esi,0x658
     10a9ff8:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10a9ffc:	4c 01 f6             	add    rsi,r14
     10a9fff:	e8 7c 40 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa004:	41 0f 10 86 70 06 00 	movups xmm0,XMMWORD PTR [r14+0x670]
     10aa00b:	00 
     10aa00c:	0f 11 83 70 06 00 00 	movups XMMWORD PTR [rbx+0x670],xmm0
     10aa013:	41 8b 86 7f 06 00 00 	mov    eax,DWORD PTR [r14+0x67f]

- 0x10aa0e1: call   10aa70a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b20>; FDE=(17473470, 17474033)
     10aa0ba:	4c 01 f6             	add    rsi,r14
     10aa0bd:	e8 32 02 00 00       	call   10aa2f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27170a>
     10aa0c2:	be e0 08 00 00       	mov    esi,0x8e0
     10aa0c7:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa0cb:	4c 01 f6             	add    rsi,r14
     10aa0ce:	8a 83 90 0f 00 00    	mov    al,BYTE PTR [rbx+0xf90]
     10aa0d4:	41 3a 86 90 0f 00 00 	cmp    al,BYTE PTR [r14+0xf90]
     10aa0db:	75 0b                	jne    10aa0e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2714fe>
     10aa0dd:	84 c0                	test   al,al
     10aa0df:	74 1e                	je     10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e1:	e8 24 06 00 00       	call   10aa70a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b20>
     10aa0e6:	eb 17                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e8:	84 c0                	test   al,al
     10aa0ea:	74 0e                	je     10aa0fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271510>
     10aa0ec:	e8 47 fd ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10aa0f1:	c6 83 90 0f 00 00 00 	mov    BYTE PTR [rbx+0xf90],0x0
     10aa0f8:	eb 05                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0fa:	e8 bd 06 00 00       	call   10aa7bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271bd2>
     10aa0ff:	4c 39 f3             	cmp    rbx,r14
     10aa102:	0f 84 d7 00 00 00    	je     10aa1df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2715f5>
     10aa108:	4c 8d bb 98 0f 00 00 	lea    r15,[rbx+0xf98]
     10aa10f:	4d 8b a6 98 0f 00 00 	mov    r12,QWORD PTR [r14+0xf98]
     10aa116:	4d 8b b6 a0 0f 00 00 	mov    r14,QWORD PTR [r14+0xfa0]
     10aa11d:	4c 89 f0             	mov    rax,r14
     10aa120:	4c 29 e0             	sub    rax,r12

- 0x10aa0ec: call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>; FDE=(17473470, 17474033)
     10aa0cb:	4c 01 f6             	add    rsi,r14
     10aa0ce:	8a 83 90 0f 00 00    	mov    al,BYTE PTR [rbx+0xf90]
     10aa0d4:	41 3a 86 90 0f 00 00 	cmp    al,BYTE PTR [r14+0xf90]
     10aa0db:	75 0b                	jne    10aa0e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2714fe>
     10aa0dd:	84 c0                	test   al,al
     10aa0df:	74 1e                	je     10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e1:	e8 24 06 00 00       	call   10aa70a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b20>
     10aa0e6:	eb 17                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0e8:	84 c0                	test   al,al
     10aa0ea:	74 0e                	je     10aa0fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271510>
     10aa0ec:	e8 47 fd ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10aa0f1:	c6 83 90 0f 00 00 00 	mov    BYTE PTR [rbx+0xf90],0x0
     10aa0f8:	eb 05                	jmp    10aa0ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271515>
     10aa0fa:	e8 bd 06 00 00       	call   10aa7bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271bd2>
     10aa0ff:	4c 39 f3             	cmp    rbx,r14
     10aa102:	0f 84 d7 00 00 00    	je     10aa1df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2715f5>
     10aa108:	4c 8d bb 98 0f 00 00 	lea    r15,[rbx+0xf98]
     10aa10f:	4d 8b a6 98 0f 00 00 	mov    r12,QWORD PTR [r14+0xf98]
     10aa116:	4d 8b b6 a0 0f 00 00 	mov    r14,QWORD PTR [r14+0xfa0]
     10aa11d:	4c 89 f0             	mov    rax,r14
     10aa120:	4c 29 e0             	sub    rax,r12
     10aa123:	bf b0 06 00 00       	mov    edi,0x6b0
     10aa128:	48 99                	cqo
     10aa12a:	48 f7 ff             	idiv   rdi
     10aa12d:	49 89 c5             	mov    r13,rax

- 0x10aa3f6: call   10aa70a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b20>; FDE=(17474516, 17474581)
     10aa3da:	53                   	push   rbx
     10aa3db:	50                   	push   rax
     10aa3dc:	48 89 d3             	mov    rbx,rdx
     10aa3df:	48 39 f7             	cmp    rdi,rsi
     10aa3e2:	74 22                	je     10aa406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27181c>
     10aa3e4:	49 89 f6             	mov    r14,rsi
     10aa3e7:	49 89 ff             	mov    r15,rdi
     10aa3ea:	41 bc b0 06 00 00    	mov    r12d,0x6b0
     10aa3f0:	48 89 df             	mov    rdi,rbx
     10aa3f3:	4c 89 fe             	mov    rsi,r15
     10aa3f6:	e8 0f 03 00 00       	call   10aa70a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b20>
     10aa3fb:	4d 01 e7             	add    r15,r12
     10aa3fe:	4c 01 e3             	add    rbx,r12
     10aa401:	4d 39 f7             	cmp    r15,r14
     10aa404:	75 ea                	jne    10aa3f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271806>
     10aa406:	48 89 d8             	mov    rax,rbx
     10aa409:	48 83 c4 08          	add    rsp,0x8
     10aa40d:	5b                   	pop    rbx
     10aa40e:	41 5c                	pop    r12
     10aa410:	41 5e                	pop    r14
     10aa412:	41 5f                	pop    r15
     10aa414:	c3                   	ret
     10aa415:	cc                   	int3
     10aa416:	55                   	push   rbp
     10aa417:	41 57                	push   r15

- 0x10aa604: call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>; FDE=(17475036, 17475091)
     10aa5e5:	53                   	push   rbx
     10aa5e6:	50                   	push   rax
     10aa5e7:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10aa5eb:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     10aa5ef:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
     10aa5f2:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     10aa5f5:	4c 39 f3             	cmp    rbx,r14
     10aa5f8:	74 11                	je     10aa60b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271a21>
     10aa5fa:	48 81 c3 50 f9 ff ff 	add    rbx,0xfffffffffffff950
     10aa601:	48 89 df             	mov    rdi,rbx
     10aa604:	e8 2f f8 ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10aa609:	eb ea                	jmp    10aa5f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271a0b>
     10aa60b:	48 83 c4 08          	add    rsp,0x8
     10aa60f:	5b                   	pop    rbx
     10aa610:	41 5e                	pop    r14
     10aa612:	c3                   	ret
     10aa613:	cc                   	int3
     10aa614:	55                   	push   rbp
     10aa615:	41 57                	push   r15
     10aa617:	41 56                	push   r14
     10aa619:	41 55                	push   r13
     10aa61b:	41 54                	push   r12
     10aa61d:	53                   	push   rbx
     10aa61e:	50                   	push   rax
     10aa61f:	49 89 f5             	mov    r13,rsi

- 0x10aa728: call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>; FDE=(17475338, 17475384)
     10aa70a:	41 56                	push   r14
     10aa70c:	53                   	push   rbx
     10aa70d:	50                   	push   rax
     10aa70e:	48 89 f3             	mov    rbx,rsi
     10aa711:	49 89 fe             	mov    r14,rdi
     10aa714:	e8 1f 00 00 00       	call   10aa738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b4e>
     10aa719:	b8 60 01 00 00       	mov    eax,0x160
     10aa71e:	49 8d 3c 06          	lea    rdi,[r14+rax*1]
     10aa722:	48 01 c3             	add    rbx,rax
     10aa725:	48 89 de             	mov    rsi,rbx
     10aa728:	e8 c3 33 fe ff       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     10aa72d:	4c 89 f0             	mov    rax,r14
     10aa730:	48 83 c4 08          	add    rsp,0x8
     10aa734:	5b                   	pop    rbx
     10aa735:	41 5e                	pop    r14
     10aa737:	c3                   	ret
     10aa738:	41 56                	push   r14
     10aa73a:	53                   	push   rbx
     10aa73b:	50                   	push   rax
     10aa73c:	49 89 f6             	mov    r14,rsi
     10aa73f:	48 89 fb             	mov    rbx,rdi
     10aa742:	e8 39 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa747:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     10aa74b:	49 8d 76 18          	lea    rsi,[r14+0x18]
     10aa74f:	e8 2c 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>

