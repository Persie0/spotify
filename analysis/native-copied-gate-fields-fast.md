# Lower restriction-owner state copy assignment

Function 0x1089f9e..0x108a477 is called first by 0x10a9fbe, which then copies fields from +0x638 onward.
Destination/source bases are the owner+0x38 state subobjects.
Therefore sub+0x438 = owner+0x470 and sub+0x560 = owner+0x598.


/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>:
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

## Gate-offset references
14- 1089fa8:	48 83 ec 38          	sub    rsp,0x38
15- 1089fac:	49 89 f6             	mov    r14,rsi
16- 1089faf:	48 89 fb             	mov    rbx,rdi
17- 1089fb2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
18- 1089fb9:	00 00 
19- 1089fbb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
20- 1089fc0:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
21- 1089fc3:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
22- 1089fc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
23- 1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
24- 1089fcc:	48 83 c7 10          	add    rdi,0x10
25- 1089fd0:	48 83 c6 10          	add    rsi,0x10
26: 1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
27: 1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
28- 1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
29- 1089fe3:	84 c0                	test   al,al
30- 1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
31- 1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
32- 1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
33- 1089fee:	84 c0                	test   al,al
34- 1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
35- 1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
36: 1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
37- 1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
38- 108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
39- 108a005:	4c 39 f3             	cmp    rbx,r14
40- 108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
41- 108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
42: 108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
43: 108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
44- 108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
45- 108a027:	4c 89 e0             	mov    rax,r12
46- 108a02a:	4c 29 e8             	sub    rax,r13
47- 108a02d:	bf 50 05 00 00       	mov    edi,0x550
48- 108a032:	48 99                	cqo
49- 108a034:	48 f7 ff             	idiv   rdi
50- 108a037:	48 89 c5             	mov    rbp,rax
51: 108a03a:	48 8b 8b 68 05 00 00 	mov    rcx,QWORD PTR [rbx+0x568]
52- 108a041:	48 8b b3 78 05 00 00 	mov    rsi,QWORD PTR [rbx+0x578]
53- 108a048:	48 89 f0             	mov    rax,rsi
54- 108a04b:	48 29 c8             	sub    rax,rcx
55- 108a04e:	48 99                	cqo
56- 108a050:	48 f7 ff             	idiv   rdi
57- 108a053:	48 39 e8             	cmp    rax,rbp
58- 108a056:	73 48                	jae    108a0a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2514b6>
59- 108a058:	48 85 c9             	test   rcx,rcx
60- 108a05b:	74 1e                	je     108a07b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251491>
61- 108a05d:	4c 89 ff             	mov    rdi,r15
62- 108a060:	e8 45 fc ff ff       	call   1089caa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c0>
63- 108a065:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
64- 108a068:	e8 b3 3e 76 00       	call   17edf20 <_ZdlPv@plt>
65- 108a06d:	0f 57 c0             	xorps  xmm0,xmm0
66- 108a070:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
67- 108a074:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0

## Nearby calls
 1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
 1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
 1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
 1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
 108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
 108a060:	e8 45 fc ff ff       	call   1089caa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c0>
 108a068:	e8 b3 3e 76 00       	call   17edf20 <_ZdlPv@plt>
 108a080:	e8 5f 37 00 00       	call   108d7e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254bfa>
 108a08b:	e8 9c 37 00 00       	call   108d82c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c42>
 108a099:	e8 66 36 00 00       	call   108d704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b1a>
 108a09e:	eb 55                	jmp    108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
 108a0c3:	e8 fa 35 00 00       	call   108d6c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ad8>
 108a0d1:	e8 2e 36 00 00       	call   108d704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b1a>
 108a0d6:	eb 19                	jmp    108a0f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251507>
 108a0e1:	e8 dc 35 00 00       	call   108d6c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ad8>
 108a0ec:	e8 c1 fb ff ff       	call   1089cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c8>
 108a101:	e8 92 25 00 00       	call   108c698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253aae>
 108a112:	e8 81 25 00 00       	call   108c698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253aae>
 108a123:	e8 58 3f 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 108a134:	e8 3f 26 00 00       	call   108c778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b8e>
 108a1b8:	e8 e9 5e a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
 108a1e4:	e8 0b 5f a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
 108a1f7:	e8 70 59 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
 108a1ff:	e8 a2 5e a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
 108a207:	e8 d6 45 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
 108a221:	e8 9a 43 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 108a240:	eb f2                	jmp    108a234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25164a>
 108a242:	e8 79 43 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 108a260:	e8 9b 3c 76 00       	call   17edf00 <_Znwm@plt>
 108a282:	e8 6d 5e a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
 108a295:	e8 d2 58 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
 108a2a3:	e8 22 00 9f ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 108a2ab:	e8 32 45 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
 108a338:	e8 69 5d a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
 108a364:	e8 8b 5d a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
 108a377:	e8 f0 57 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
 108a37f:	e8 22 5d a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
 108a387:	e8 56 44 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
 108a3a1:	e8 1a 42 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 108a3c0:	eb f2                	jmp    108a3b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517ca>
 108a3c2:	e8 f9 41 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 108a3e0:	e8 1b 3b 76 00       	call   17edf00 <_Znwm@plt>
 108a402:	e8 ed 5c a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
 108a415:	e8 52 57 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
 108a423:	e8 a2 fe 9e ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 108a42b:	e8 b2 43 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
 108a472:	e8 39 56 76 00       	call   17efab0 <__stack_chk_fail@plt>
