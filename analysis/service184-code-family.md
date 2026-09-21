# Service184 accessor code-family identity

## Relocations targeting b8f000..b90000

## Code 0xb8f080..0xb90000

/tmp/s184fam/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b8f080 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc020>:
  b8f080:	55                   	push   rbp
  b8f081:	41 57                	push   r15
  b8f083:	41 56                	push   r14
  b8f085:	53                   	push   rbx
  b8f086:	48 81 ec e8 14 00 00 	sub    rsp,0x14e8
  b8f08d:	48 89 fb             	mov    rbx,rdi
  b8f090:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f097:	00 00 
  b8f099:	48 89 84 24 e0 14 00 	mov    QWORD PTR [rsp+0x14e0],rax
  b8f0a0:	00 
  b8f0a1:	4c 8d b4 24 ac 00 00 	lea    r14,[rsp+0xac]
  b8f0a8:	00 
  b8f0a9:	4c 89 f7             	mov    rdi,r14
  b8f0ac:	e8 b9 9c f1 ff       	call   aa8d6a <JNI_OnUnload@@Base+0x30637>
  b8f0b1:	4c 89 f7             	mov    rdi,r14
  b8f0b4:	e8 57 f0 c5 00       	call   17ee110 <_ZNSt6__ndk113random_deviceclEv@plt>
  b8f0b9:	89 c6                	mov    esi,eax
  b8f0bb:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
  b8f0c2:	00 
  b8f0c3:	e8 de 39 f6 ff       	call   af2aa6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fa46>
  b8f0c8:	48 b8 01 00 00 00 04 	movabs rax,0x400000001
  b8f0cf:	00 00 00 
  b8f0d2:	48 89 84 24 a4 00 00 	mov    QWORD PTR [rsp+0xa4],rax
  b8f0d9:	00 
  b8f0da:	48 b8 40 42 0f 00 7f 	movabs rax,0x98967f000f4240
  b8f0e1:	96 98 00 
  b8f0e4:	48 89 84 24 9c 00 00 	mov    QWORD PTR [rsp+0x9c],rax
  b8f0eb:	00 
  b8f0ec:	4c 8b 73 10          	mov    r14,QWORD PTR [rbx+0x10]
  b8f0f0:	48 8d 05 0b 0e 81 ff 	lea    rax,[rip+0xffffffffff810e0b]        # 39ff02 <_ZTSN5boost9exceptionE@@Base+0x8e4>
  b8f0f7:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  b8f0fe:	00 
  b8f0ff:	48 89 06             	mov    QWORD PTR [rsi],rax
  b8f102:	c7 46 08 8c 04 25 4c 	mov    DWORD PTR [rsi+0x8],0x4c25048c
  b8f109:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f110:	00 
  b8f111:	e8 94 2c c3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  b8f116:	48 8d 35 5f 2e 8c ff 	lea    rsi,[rip+0xffffffffff8c2e5f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  b8f11d:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f124:	00 
  b8f125:	e8 54 a9 ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  b8f12a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  b8f12d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  b8f134:	00 
  b8f135:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
  b8f13c:	00 
  b8f13d:	4c 8d bc 24 d0 00 00 	lea    r15,[rsp+0xd0]
  b8f144:	00 
  b8f145:	4c 89 f2             	mov    rdx,r14
  b8f148:	4c 89 f9             	mov    rcx,r15
  b8f14b:	e8 16 1e 00 00       	call   b90f66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xddf06>
  b8f150:	4c 89 ff             	mov    rdi,r15
  b8f153:	e8 38 ed c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f158:	4c 89 f7             	mov    rdi,r14
  b8f15b:	e8 30 ed c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f160:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  b8f164:	e8 5a 0f 00 00       	call   b900c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdd063>
  b8f169:	89 c5                	mov    ebp,eax
  b8f16b:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  b8f16f:	e8 2f 15 00 00       	call   b906a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdd643>
  b8f174:	48 8d bc 24 a4 00 00 	lea    rdi,[rsp+0xa4]
  b8f17b:	00 
  b8f17c:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
  b8f183:	00 
  b8f184:	e8 9b 3a f6 ff       	call   af2c24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fbc4>
  b8f189:	40 0f b6 cd          	movzx  ecx,bpl
  b8f18d:	8d 34 41             	lea    esi,[rcx+rax*2]
  b8f190:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f197:	00 
  b8f198:	e8 f3 f5 c5 00       	call   17ee790 <_ZNSt6__ndk19to_stringEi@plt>
  b8f19d:	48 8d bc 24 9c 00 00 	lea    rdi,[rsp+0x9c]
  b8f1a4:	00 
  b8f1a5:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
  b8f1ac:	00 
  b8f1ad:	e8 72 3a f6 ff       	call   af2c24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fbc4>
  b8f1b2:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f1b9:	00 
  b8f1ba:	89 c6                	mov    esi,eax
  b8f1bc:	e8 cf f5 c5 00       	call   17ee790 <_ZNSt6__ndk19to_stringEi@plt>
  b8f1c1:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  b8f1c6:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
  b8f1cd:	00 
  b8f1ce:	48 8d 94 24 d0 00 00 	lea    rdx,[rsp+0xd0]
  b8f1d5:	00 
  b8f1d6:	e8 b5 6f f2 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
  b8f1db:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f1e2:	00 
  b8f1e3:	e8 a8 ec c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f1e8:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f1ef:	00 
  b8f1f0:	e8 9b ec c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f1f5:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  b8f1fa:	48 be 00 78 0e 90 55 	movabs rsi,0x155655900e7800
  b8f201:	56 15 00 
  b8f204:	e8 17 f9 c5 00       	call   17eeb20 <_ZNSt6__ndk19to_stringEl@plt>
  b8f209:	0f b6 b4 24 80 00 00 	movzx  esi,BYTE PTR [rsp+0x80]
  b8f210:	00 
  b8f211:	40 f6 c6 01          	test   sil,0x1
  b8f215:	74 0a                	je     b8f221 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc1c1>
  b8f217:	48 8b b4 24 88 00 00 	mov    rsi,QWORD PTR [rsp+0x88]
  b8f21e:	00 
  b8f21f:	eb 02                	jmp    b8f223 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc1c3>
  b8f221:	d1 ee                	shr    esi,1
  b8f223:	48 83 c6 11          	add    rsi,0x11
  b8f227:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  b8f22c:	e8 ff f8 c5 00       	call   17eeb30 <_ZNSt6__ndk19to_stringEm@plt>
  b8f231:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f238:	00 
  b8f239:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
  b8f23e:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
  b8f243:	e8 b5 1d 00 00       	call   b90ffd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xddf9d>
  b8f248:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  b8f24d:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
  b8f254:	00 
  b8f255:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
  b8f25a:	e8 c7 70 f6 ff       	call   af6326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x432c6>
  b8f25f:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f266:	00 
  b8f267:	e8 24 ec c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f26c:	48 8d 44 24 21       	lea    rax,[rsp+0x21]
  b8f271:	0f b6 48 ff          	movzx  ecx,BYTE PTR [rax-0x1]
  b8f275:	89 ce                	mov    esi,ecx
  b8f277:	d1 ee                	shr    esi,1
  b8f279:	f6 c1 01             	test   cl,0x1
  b8f27c:	48 8b 78 0f          	mov    rdi,QWORD PTR [rax+0xf]
  b8f280:	48 0f 44 f8          	cmove  rdi,rax
  b8f284:	48 0f 45 70 07       	cmovne rsi,QWORD PTR [rax+0x7]
  b8f289:	4c 8d b4 24 44 01 00 	lea    r14,[rsp+0x144]
  b8f290:	00 
  b8f291:	4c 89 f2             	mov    rdx,r14
  b8f294:	e8 b3 6f c1 00       	call   17a624c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a3b8>
  b8f299:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
  b8f2a0:	00 
  b8f2a1:	4c 89 ff             	mov    rdi,r15
  b8f2a4:	4c 89 f6             	mov    rsi,r14
  b8f2a7:	e8 88 8f f1 ff       	call   aa8234 <JNI_OnUnload@@Base+0x2fb01>
  b8f2ac:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
  b8f2b3:	00 
  b8f2b4:	4c 89 f7             	mov    rdi,r14
  b8f2b7:	4c 89 fe             	mov    rsi,r15
  b8f2ba:	e8 89 8f f1 ff       	call   aa8248 <JNI_OnUnload@@Base+0x2fb15>
  b8f2bf:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  b8f2c4:	6a 02                	push   0x2
  b8f2c6:	5a                   	pop    rdx
  b8f2c7:	6a 0a                	push   0xa
  b8f2c9:	59                   	pop    rcx
  b8f2ca:	4c 89 f6             	mov    rsi,r14
  b8f2cd:	e8 52 e3 f2 ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
  b8f2d2:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f2d9:	00 
  b8f2da:	e8 b1 eb c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f2df:	0f 57 c0             	xorps  xmm0,xmm0
  b8f2e2:	0f 11 84 24 08 01 00 	movups XMMWORD PTR [rsp+0x108],xmm0
  b8f2e9:	00 
  b8f2ea:	48 8d 05 4f 5c d0 00 	lea    rax,[rip+0xd05c4f]        # 1894f40 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1e80>
  b8f2f1:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
  b8f2f8:	00 
  b8f2f9:	48 8d 05 f8 04 8b ff 	lea    rax,[rip+0xffffffffff8b04f8]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
  b8f300:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
  b8f307:	00 
  b8f308:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
  b8f30f:	00 
  b8f310:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
  b8f317:	00 
  b8f318:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
  b8f31f:	00 
  b8f320:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
  b8f327:	00 
  b8f328:	48 8d 05 e3 0b 81 ff 	lea    rax,[rip+0xffffffffff810be3]        # 39ff12 <_ZTSN5boost9exceptionE@@Base+0x8f4>
  b8f32f:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  b8f336:	00 
  b8f337:	48 89 06             	mov    QWORD PTR [rsi],rax
  b8f33a:	c7 46 08 1b 31 b3 4a 	mov    DWORD PTR [rsi+0x8],0x4ab3311b
  b8f341:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f348:	00 
  b8f349:	e8 5c 2a c3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  b8f34e:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
  b8f355:	00 
  b8f356:	c7 47 f8 01 00 00 00 	mov    DWORD PTR [rdi-0x8],0x1
  b8f35d:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
  b8f364:	00 
  b8f365:	31 d2                	xor    edx,edx
  b8f367:	e8 7a 64 bd 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
  b8f36c:	4c 8d b4 24 28 01 00 	lea    r14,[rsp+0x128]
  b8f373:	00 
  b8f374:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f37b:	00 
  b8f37c:	e8 0f eb c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f381:	41 80 4e e8 04       	or     BYTE PTR [r14-0x18],0x4
  b8f386:	49 8b 56 e0          	mov    rdx,QWORD PTR [r14-0x20]
  b8f38a:	f6 c2 01             	test   dl,0x1
  b8f38d:	0f 85 3b 01 00 00    	jne    b8f4ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc46e>
  b8f393:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  b8f398:	4c 89 f7             	mov    rdi,r14
  b8f39b:	e8 f2 63 bd 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
  b8f3a0:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  b8f3a7:	00 
  b8f3a8:	80 4f e0 08          	or     BYTE PTR [rdi-0x20],0x8
  b8f3ac:	48 8b 57 d8          	mov    rdx,QWORD PTR [rdi-0x28]
  b8f3b0:	f6 c2 01             	test   dl,0x1
  b8f3b3:	0f 85 21 01 00 00    	jne    b8f4da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc47a>
  b8f3b9:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
  b8f3be:	e8 cf 63 bd 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
  b8f3c3:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  b8f3ca:	00 
  b8f3cb:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
  b8f3cf:	48 8b 57 e8          	mov    rdx,QWORD PTR [rdi-0x18]
  b8f3d3:	f6 c2 01             	test   dl,0x1
  b8f3d6:	0f 85 0a 01 00 00    	jne    b8f4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc486>
  b8f3dc:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
  b8f3e1:	e8 ac 63 bd 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
  b8f3e6:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
  b8f3ed:	00 
  b8f3ee:	80 4f d8 10          	or     BYTE PTR [rdi-0x28],0x10
  b8f3f2:	48 8b 57 d0          	mov    rdx,QWORD PTR [rdi-0x30]
  b8f3f6:	f6 c2 01             	test   dl,0x1
  b8f3f9:	0f 85 f3 00 00 00    	jne    b8f4f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc492>
  b8f3ff:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  b8f404:	e8 89 63 bd 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
  b8f409:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  b8f40d:	31 c0                	xor    eax,eax
  b8f40f:	48 8d 94 24 b0 00 00 	lea    rdx,[rsp+0xb0]
  b8f416:	00 
  b8f417:	88 02                	mov    BYTE PTR [rdx],al
  b8f419:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
  b8f41c:	48 8d 8c 24 d0 00 00 	lea    rcx,[rsp+0xd0]
  b8f423:	00 
  b8f424:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
  b8f429:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
  b8f430:	00 
  b8f431:	e8 ec 59 a9 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
  b8f436:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f43d:	00 
  b8f43e:	e8 27 ab ee ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b8f443:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  b8f44a:	00 
  b8f44b:	e8 e0 78 f1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  b8f450:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f457:	00 
  b8f458:	e8 53 16 f3 ff       	call   ac0ab0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda50>
  b8f45d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  b8f462:	e8 29 ea c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f467:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  b8f46c:	e8 1f ea c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f471:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  b8f476:	e8 15 ea c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f47b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  b8f480:	e8 0b ea c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f485:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  b8f48a:	e8 01 ea c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f48f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  b8f496:	00 
  b8f497:	e8 f4 e9 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f49c:	48 8d bc 24 ac 00 00 	lea    rdi,[rsp+0xac]
  b8f4a3:	00 
  b8f4a4:	e8 77 ec c5 00       	call   17ee120 <_ZNSt6__ndk113random_deviceD1Ev@plt>
  b8f4a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f4b0:	00 00 
  b8f4b2:	48 3b 84 24 e0 14 00 	cmp    rax,QWORD PTR [rsp+0x14e0]
  b8f4b9:	00 
  b8f4ba:	0f 85 4d 01 00 00    	jne    b8f60d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc5ad>
  b8f4c0:	48 81 c4 e8 14 00 00 	add    rsp,0x14e8
  b8f4c7:	5b                   	pop    rbx
  b8f4c8:	41 5e                	pop    r14
  b8f4ca:	41 5f                	pop    r15
  b8f4cc:	5d                   	pop    rbp
  b8f4cd:	c3                   	ret
  b8f4ce:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b8f4d2:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b8f4d5:	e9 b9 fe ff ff       	jmp    b8f393 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc333>
  b8f4da:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b8f4de:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b8f4e1:	e9 d3 fe ff ff       	jmp    b8f3b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc359>
  b8f4e6:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b8f4ea:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b8f4ed:	e9 ea fe ff ff       	jmp    b8f3dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc37c>
  b8f4f2:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b8f4f6:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b8f4f9:	e9 01 ff ff ff       	jmp    b8f3ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc39f>
  b8f4fe:	48 89 c3             	mov    rbx,rax
  b8f501:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f508:	00 
  b8f509:	e8 5c aa ee ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b8f50e:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  b8f515:	00 
  b8f516:	e8 15 78 f1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  b8f51b:	eb 7c                	jmp    b8f599 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc539>
  b8f51d:	48 89 c3             	mov    rbx,rax
  b8f520:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f527:	00 
  b8f528:	e8 63 e9 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f52d:	eb 6a                	jmp    b8f599 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc539>
  b8f52f:	eb 65                	jmp    b8f596 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc536>
  b8f531:	48 89 c3             	mov    rbx,rax
  b8f534:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f53b:	00 
  b8f53c:	eb 6d                	jmp    b8f5ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc54b>
  b8f53e:	48 89 c3             	mov    rbx,rax
  b8f541:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f548:	00 
  b8f549:	eb 6a                	jmp    b8f5b5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc555>
  b8f54b:	48 89 c3             	mov    rbx,rax
  b8f54e:	eb 6a                	jmp    b8f5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc55a>
  b8f550:	48 89 c3             	mov    rbx,rax
  b8f553:	eb 6f                	jmp    b8f5c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc564>
  b8f555:	48 89 c3             	mov    rbx,rax
  b8f558:	eb 74                	jmp    b8f5ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc56e>
  b8f55a:	48 89 c3             	mov    rbx,rax
  b8f55d:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f564:	00 
  b8f565:	e8 26 e9 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f56a:	eb 03                	jmp    b8f56f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc50f>
  b8f56c:	48 89 c3             	mov    rbx,rax
  b8f56f:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f576:	00 
  b8f577:	eb 5a                	jmp    b8f5d3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc573>
  b8f579:	eb 02                	jmp    b8f57d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc51d>
  b8f57b:	eb 00                	jmp    b8f57d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc51d>
  b8f57d:	48 89 c3             	mov    rbx,rax
  b8f580:	eb 56                	jmp    b8f5d8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc578>
  b8f582:	48 89 c3             	mov    rbx,rax
  b8f585:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f58c:	00 
  b8f58d:	eb 51                	jmp    b8f5e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc580>
  b8f58f:	eb 00                	jmp    b8f591 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc531>
  b8f591:	48 89 c3             	mov    rbx,rax
  b8f594:	eb 4f                	jmp    b8f5e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc585>
  b8f596:	48 89 c3             	mov    rbx,rax
  b8f599:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f5a0:	00 
  b8f5a1:	e8 0a 15 f3 ff       	call   ac0ab0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda50>
  b8f5a6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  b8f5ab:	e8 e0 e8 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f5b0:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  b8f5b5:	e8 d6 e8 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f5ba:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  b8f5bf:	e8 cc e8 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f5c4:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  b8f5c9:	e8 c2 e8 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f5ce:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  b8f5d3:	e8 b8 e8 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f5d8:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  b8f5df:	00 
  b8f5e0:	e8 ab e8 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f5e5:	48 8d bc 24 ac 00 00 	lea    rdi,[rsp+0xac]
  b8f5ec:	00 
  b8f5ed:	e8 2e eb c5 00       	call   17ee120 <_ZNSt6__ndk113random_deviceD1Ev@plt>
  b8f5f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f5f9:	00 00 
  b8f5fb:	48 3b 84 24 e0 14 00 	cmp    rax,QWORD PTR [rsp+0x14e0]
  b8f602:	00 
  b8f603:	75 08                	jne    b8f60d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc5ad>
  b8f605:	48 89 df             	mov    rdi,rbx
  b8f608:	e8 c3 06 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b8f60d:	e8 9e 04 c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b8f612:	e9 01 00 00 00       	jmp    b8f618 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc5b8>
  b8f617:	cc                   	int3
  b8f618:	48 85 ff             	test   rdi,rdi
  b8f61b:	74 27                	je     b8f644 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc5e4>
  b8f61d:	53                   	push   rbx
  b8f61e:	48 89 fb             	mov    rbx,rdi
  b8f621:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  b8f624:	e8 ef ff ff ff       	call   b8f618 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc5b8>
  b8f629:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  b8f62d:	e8 e6 ff ff ff       	call   b8f618 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc5b8>
  b8f632:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  b8f636:	e8 4b ee f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8f63b:	48 89 df             	mov    rdi,rbx
  b8f63e:	5b                   	pop    rbx
  b8f63f:	e9 dc e8 c5 00       	jmp    17edf20 <_ZdlPv@plt>
  b8f644:	c3                   	ret
  b8f645:	cc                   	int3
  b8f646:	41 56                	push   r14
  b8f648:	53                   	push   rbx
  b8f649:	48 83 ec 48          	sub    rsp,0x48
  b8f64d:	49 89 f6             	mov    r14,rsi
  b8f650:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f657:	00 00 
  b8f659:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  b8f65e:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  b8f661:	48 8d 05 86 08 81 ff 	lea    rax,[rip+0xffffffffff810886]        # 39feee <_ZTSN5boost9exceptionE@@Base+0x8d0>
  b8f668:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
  b8f66d:	48 89 06             	mov    QWORD PTR [rsi],rax
  b8f670:	c7 46 08 c9 f6 a7 38 	mov    DWORD PTR [rsi+0x8],0x38a7f6c9
  b8f677:	48 89 e7             	mov    rdi,rsp
  b8f67a:	e8 2b 27 c3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  b8f67f:	48 8d 05 6f 08 81 ff 	lea    rax,[rip+0xffffffffff81086f]        # 39fef5 <_ZTSN5boost9exceptionE@@Base+0x8d7>
  b8f686:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b8f68b:	48 89 06             	mov    QWORD PTR [rsi],rax
  b8f68e:	c7 46 08 1d 0c c1 a4 	mov    DWORD PTR [rsi+0x8],0xa4c10c1d
  b8f695:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  b8f69a:	e8 0b 27 c3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  b8f69f:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
  b8f6a3:	48 89 e6             	mov    rsi,rsp
  b8f6a6:	4c 89 f7             	mov    rdi,r14
  b8f6a9:	e8 f8 19 00 00       	call   b910a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde046>
  b8f6ae:	48 85 c0             	test   rax,rax
  b8f6b1:	75 12                	jne    b8f6c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc665>
  b8f6b3:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
  b8f6b8:	4c 89 f7             	mov    rdi,r14
  b8f6bb:	e8 e6 19 00 00       	call   b910a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde046>
  b8f6c0:	48 85 c0             	test   rax,rax
  b8f6c3:	74 08                	je     b8f6cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc66d>
  b8f6c5:	48 89 df             	mov    rdi,rbx
  b8f6c8:	e8 b3 f9 ff ff       	call   b8f080 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc020>
  b8f6cd:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  b8f6d2:	e8 b9 e7 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f6d7:	48 89 e7             	mov    rdi,rsp
  b8f6da:	e8 b1 e7 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f6df:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f6e6:	00 00 
  b8f6e8:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
  b8f6ed:	75 3a                	jne    b8f729 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc6c9>
  b8f6ef:	48 83 c4 48          	add    rsp,0x48
  b8f6f3:	5b                   	pop    rbx
  b8f6f4:	41 5e                	pop    r14
  b8f6f6:	c3                   	ret
  b8f6f7:	48 89 c3             	mov    rbx,rax
  b8f6fa:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  b8f6ff:	e8 8c e7 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f704:	eb 03                	jmp    b8f709 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc6a9>
  b8f706:	48 89 c3             	mov    rbx,rax
  b8f709:	48 89 e7             	mov    rdi,rsp
  b8f70c:	e8 7f e7 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f711:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f718:	00 00 
  b8f71a:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
  b8f71f:	75 08                	jne    b8f729 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc6c9>
  b8f721:	48 89 df             	mov    rdi,rbx
  b8f724:	e8 a7 05 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b8f729:	e8 82 03 c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b8f72e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  b8f731:	e9 00 00 00 00       	jmp    b8f736 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc6d6>
  b8f736:	41 57                	push   r15
  b8f738:	41 56                	push   r14
  b8f73a:	53                   	push   rbx
  b8f73b:	48 83 ec 70          	sub    rsp,0x70
  b8f73f:	49 89 fe             	mov    r14,rdi
  b8f742:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f749:	00 00 
  b8f74b:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  b8f750:	0f 10 47 38          	movups xmm0,XMMWORD PTR [rdi+0x38]
  b8f754:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  b8f758:	48 8b 5f 40          	mov    rbx,QWORD PTR [rdi+0x40]
  b8f75c:	48 85 db             	test   rbx,rbx
  b8f75f:	74 15                	je     b8f776 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc716>
  b8f761:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
  b8f766:	4d 8b 7e 20          	mov    r15,QWORD PTR [r14+0x20]
  b8f76a:	48 8d 44 24 38       	lea    rax,[rsp+0x38]
  b8f76f:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
  b8f774:	eb 09                	jmp    b8f77f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc71f>
  b8f776:	4d 8b 7e 20          	mov    r15,QWORD PTR [r14+0x20]
  b8f77a:	48 8d 44 24 38       	lea    rax,[rsp+0x38]
  b8f77f:	4c 89 74 24 30       	mov    QWORD PTR [rsp+0x30],r14
  b8f784:	48 8d 0d 8d 24 8c ff 	lea    rcx,[rip+0xffffffffff8c248d]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  b8f78b:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
  b8f790:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
  b8f795:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
  b8f79b:	0f 57 c0             	xorps  xmm0,xmm0
  b8f79e:	48 83 64 24 48 00    	and    QWORD PTR [rsp+0x48],0x0
  b8f7a4:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
  b8f7a7:	48 83 64 24 58 00    	and    QWORD PTR [rsp+0x58],0x0
  b8f7ad:	6a 18                	push   0x18
  b8f7af:	5f                   	pop    rdi
  b8f7b0:	e8 4b e7 c5 00       	call   17edf00 <_Znwm@plt>
  b8f7b5:	4c 89 30             	mov    QWORD PTR [rax],r14
  b8f7b8:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  b8f7bc:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  b8f7c0:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
  b8f7c5:	49 89 06             	mov    QWORD PTR [r14],rax
  b8f7c8:	48 8d 05 95 10 fb ff 	lea    rax,[rip+0xfffffffffffb1095]        # b40864 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d804>
  b8f7cf:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  b8f7d3:	48 8d 05 6a 00 00 00 	lea    rax,[rip+0x6a]        # b8f844 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc7e4>
  b8f7da:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  b8f7de:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b8f7e3:	4c 89 ff             	mov    rdi,r15
  b8f7e6:	4c 89 f2             	mov    rdx,r14
  b8f7e9:	e8 9a 1c c3 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
  b8f7ee:	4c 89 f7             	mov    rdi,r14
  b8f7f1:	e8 a8 7a f1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b8f7f6:	31 ff                	xor    edi,edi
  b8f7f8:	e8 e7 fd f4 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
  b8f7fd:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  b8f802:	e8 ab ec f0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  b8f807:	48 89 df             	mov    rdi,rbx
  b8f80a:	e8 a3 ec f0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  b8f80f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f816:	00 00 
  b8f818:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
  b8f81d:	75 0a                	jne    b8f829 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc7c9>
  b8f81f:	48 83 c4 70          	add    rsp,0x70
  b8f823:	5b                   	pop    rbx
  b8f824:	41 5e                	pop    r14
  b8f826:	41 5f                	pop    r15
  b8f828:	c3                   	ret
  b8f829:	e8 82 02 c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b8f82e:	48 89 c3             	mov    rbx,rax
  b8f831:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  b8f836:	e8 63 7a f1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b8f83b:	48 89 df             	mov    rdi,rbx
  b8f83e:	e8 62 a2 ee ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b8f843:	cc                   	int3
  b8f844:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  b8f847:	e9 00 00 00 00       	jmp    b8f84c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc7ec>
  b8f84c:	41 57                	push   r15
  b8f84e:	41 56                	push   r14
  b8f850:	41 54                	push   r12
  b8f852:	53                   	push   rbx
  b8f853:	48 83 ec 58          	sub    rsp,0x58
  b8f857:	49 89 fe             	mov    r14,rdi
  b8f85a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f861:	00 00 
  b8f863:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  b8f868:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  b8f86b:	49 83 c6 08          	add    r14,0x8
  b8f86f:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
  b8f874:	4c 89 ff             	mov    rdi,r15
  b8f877:	4c 89 f6             	mov    rsi,r14
  b8f87a:	e8 b1 ba f1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  b8f87f:	4d 8b 27             	mov    r12,QWORD PTR [r15]
  b8f882:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  b8f886:	e8 fb eb f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8f88b:	4d 85 e4             	test   r12,r12
  b8f88e:	0f 84 e4 00 00 00    	je     b8f978 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc918>
  b8f894:	e8 c7 e8 c5 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
  b8f899:	48 8b 8b a0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xa0]
  b8f8a0:	48 ba 00 00 00 00 00 	movabs rdx,0x8000000000000000
  b8f8a7:	00 00 80 
  b8f8aa:	48 39 d1             	cmp    rcx,rdx
  b8f8ad:	74 16                	je     b8f8c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc865>
  b8f8af:	48 29 c8             	sub    rax,rcx
  b8f8b2:	48 b9 00 50 5c 18 a3 	movabs rcx,0x1a3185c5000
  b8f8b9:	01 00 00 
  b8f8bc:	48 39 c8             	cmp    rax,rcx
  b8f8bf:	0f 8c b3 00 00 00    	jl     b8f978 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc918>
  b8f8c5:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
  b8f8cc:	e8 db 20 c3 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
  b8f8d1:	84 c0                	test   al,al
  b8f8d3:	0f 85 9f 00 00 00    	jne    b8f978 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc918>
  b8f8d9:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
  b8f8dd:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  b8f8e1:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
  b8f8e5:	48 85 c0             	test   rax,rax
  b8f8e8:	74 05                	je     b8f8ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc88f>
  b8f8ea:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  b8f8ef:	48 8d 05 22 23 8c ff 	lea    rax,[rip+0xffffffffff8c2322]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  b8f8f6:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  b8f8fb:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  b8f900:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
  b8f906:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
  b8f90c:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
  b8f912:	6a 18                	push   0x18
  b8f914:	5f                   	pop    rdi
  b8f915:	e8 e6 e5 c5 00       	call   17edf00 <_Znwm@plt>
  b8f91a:	48 89 18             	mov    QWORD PTR [rax],rbx
  b8f91d:	48 81 c3 90 00 00 00 	add    rbx,0x90
  b8f924:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  b8f928:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  b8f92c:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
  b8f931:	49 89 06             	mov    QWORD PTR [r14],rax
  b8f934:	48 8d 05 29 0f fb ff 	lea    rax,[rip+0xfffffffffffb0f29]        # b40864 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d804>
  b8f93b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  b8f93f:	48 8d 05 68 00 00 00 	lea    rax,[rip+0x68]        # b8f9ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc94e>
  b8f946:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  b8f94a:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b8f94f:	b9 fa 00 00 00       	mov    ecx,0xfa
  b8f954:	48 89 df             	mov    rdi,rbx
  b8f957:	4c 89 f2             	mov    rdx,r14
  b8f95a:	45 31 c0             	xor    r8d,r8d
  b8f95d:	e8 6a 1e c3 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
  b8f962:	4c 89 f7             	mov    rdi,r14
  b8f965:	e8 34 79 f1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b8f96a:	31 ff                	xor    edi,edi
  b8f96c:	e8 73 fc f4 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
  b8f971:	31 ff                	xor    edi,edi
  b8f973:	e8 3a eb f0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  b8f978:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f97f:	00 00 
  b8f981:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  b8f986:	75 0c                	jne    b8f994 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc934>
  b8f988:	48 83 c4 58          	add    rsp,0x58
  b8f98c:	5b                   	pop    rbx
  b8f98d:	41 5c                	pop    r12
  b8f98f:	41 5e                	pop    r14
  b8f991:	41 5f                	pop    r15
  b8f993:	c3                   	ret
  b8f994:	e8 17 01 c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b8f999:	48 89 c3             	mov    rbx,rax
  b8f99c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  b8f9a1:	e8 f8 78 f1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  b8f9a6:	48 89 df             	mov    rdi,rbx
  b8f9a9:	e8 f7 a0 ee ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b8f9ae:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  b8f9b1:	e9 00 00 00 00       	jmp    b8f9b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc956>
  b8f9b6:	55                   	push   rbp
  b8f9b7:	41 57                	push   r15
  b8f9b9:	41 56                	push   r14
  b8f9bb:	41 55                	push   r13
  b8f9bd:	41 54                	push   r12
  b8f9bf:	53                   	push   rbx
  b8f9c0:	48 81 ec a8 01 00 00 	sub    rsp,0x1a8
  b8f9c7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f9ce:	00 00 
  b8f9d0:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
  b8f9d7:	00 
  b8f9d8:	48 8b 2f             	mov    rbp,QWORD PTR [rdi]
  b8f9db:	48 8d 77 08          	lea    rsi,[rdi+0x8]
  b8f9df:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]
  b8f9e6:	00 
  b8f9e7:	48 89 df             	mov    rdi,rbx
  b8f9ea:	e8 41 b9 f1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  b8f9ef:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
  b8f9f2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  b8f9f6:	e8 8b ea f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8f9fb:	4d 85 f6             	test   r14,r14
  b8f9fe:	0f 84 00 06 00 00    	je     b90004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcfa4>
  b8fa04:	e8 57 e7 c5 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
  b8fa09:	48 89 85 a0 00 00 00 	mov    QWORD PTR [rbp+0xa0],rax
  b8fa10:	e8 3b e7 c5 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
  b8fa15:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]
  b8fa1c:	00 
  b8fa1d:	48 89 03             	mov    QWORD PTR [rbx],rax
  b8fa20:	48 89 df             	mov    rdi,rbx
  b8fa23:	e8 18 f1 c5 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
  b8fa28:	49 89 c7             	mov    r15,rax
  b8fa2b:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
  b8fa30:	48 8d 05 f1 1c c8 00 	lea    rax,[rip+0xc81cf1]        # 1811728 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x73e8>
  b8fa37:	48 89 03             	mov    QWORD PTR [rbx],rax
  b8fa3a:	48 8d 05 b7 fd 8a ff 	lea    rax,[rip+0xffffffffff8afdb7]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
  b8fa41:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  b8fa45:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  b8fa49:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
  b8fa4e:	0f 57 c0             	xorps  xmm0,xmm0
  b8fa51:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
  b8fa55:	c7 43 28 05 00 00 00 	mov    DWORD PTR [rbx+0x28],0x5
  b8fa5c:	48 c7 43 10 04 00 00 	mov    QWORD PTR [rbx+0x10],0x4
  b8fa63:	00 
  b8fa64:	48 8d 35 d5 e9 81 ff 	lea    rsi,[rip+0xffffffffff81e9d5]        # 3ae440 <_ZTSN5boost9exceptionE@@Base+0xee22>
  b8fa6b:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8fa72:	00 
  b8fa73:	6a 10                	push   0x10
  b8fa75:	5a                   	pop    rdx
  b8fa76:	e8 25 e4 c5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  b8fa7b:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
  b8fa82:	00 
  b8fa83:	80 4f f8 01          	or     BYTE PTR [rdi-0x8],0x1
  b8fa87:	48 8b 57 f0          	mov    rdx,QWORD PTR [rdi-0x10]
  b8fa8b:	f6 c2 01             	test   dl,0x1
  b8fa8e:	0f 85 95 05 00 00    	jne    b90029 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcfc9>
  b8fa94:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
  b8fa9b:	00 
  b8fa9c:	e8 45 5d bd 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
  b8faa1:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8faa8:	00 
  b8faa9:	e8 e2 e3 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8faae:	48 8d 35 c7 24 8c ff 	lea    rsi,[rip+0xffffffffff8c24c7]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  b8fab5:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8fabc:	00 
  b8fabd:	e8 bc 9f ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  b8fac2:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
  b8fac9:	00 
  b8faca:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
  b8face:	48 8b 57 e8          	mov    rdx,QWORD PTR [rdi-0x18]
  b8fad2:	f6 c2 01             	test   dl,0x1
  b8fad5:	0f 85 5a 05 00 00    	jne    b90035 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcfd5>
  b8fadb:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
  b8fae2:	00 
  b8fae3:	e8 fe 5c bd 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
  b8fae8:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8faef:	00 
  b8faf0:	e8 9b e3 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8faf5:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  b8fafc:	00 
  b8fafd:	c7 46 2c 03 00 00 00 	mov    DWORD PTR [rsi+0x2c],0x3
  b8fb04:	c7 46 38 01 00 00 00 	mov    DWORD PTR [rsi+0x38],0x1
  b8fb0b:	4c 89 7e 30          	mov    QWORD PTR [rsi+0x30],r15
  b8fb0f:	80 4e 10 38          	or     BYTE PTR [rsi+0x10],0x38
  b8fb13:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  b8fb1a:	00 
  b8fb1b:	e8 a4 01 bf 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
  b8fb20:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  b8fb27:	00 
  b8fb28:	e8 5f 11 f8 ff       	call   b10c8c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5dc2c>
  b8fb2d:	6a 28                	push   0x28
  b8fb2f:	5f                   	pop    rdi
  b8fb30:	e8 cb e3 c5 00       	call   17edf00 <_Znwm@plt>
  b8fb35:	48 89 c3             	mov    rbx,rax
  b8fb38:	0f 57 c0             	xorps  xmm0,xmm0
  b8fb3b:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  b8fb3f:	48 8d 05 3a 15 c7 00 	lea    rax,[rip+0xc7153a]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
  b8fb46:	48 89 03             	mov    QWORD PTR [rbx],rax
  b8fb49:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
  b8fb4d:	4c 8b 6d 38          	mov    r13,QWORD PTR [rbp+0x38]
  b8fb51:	4c 8b 75 40          	mov    r14,QWORD PTR [rbp+0x40]
  b8fb55:	4d 85 f6             	test   r14,r14
  b8fb58:	74 05                	je     b8fb5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcaff>
  b8fb5a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  b8fb5f:	48 8b 75 28          	mov    rsi,QWORD PTR [rbp+0x28]
  b8fb63:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  b8fb6a:	00 
  b8fb6b:	e8 36 9d a5 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
  b8fb70:	48 8d 05 a8 03 81 ff 	lea    rax,[rip+0xffffffffff8103a8]        # 39ff1f <_ZTSN5boost9exceptionE@@Base+0x901>
  b8fb77:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
  b8fb7e:	00 
  b8fb7f:	48 89 06             	mov    QWORD PTR [rsi],rax
  b8fb82:	c7 46 08 30 66 1e b5 	mov    DWORD PTR [rsi+0x8],0xb51e6630
  b8fb89:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  b8fb8e:	e8 17 22 c3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  b8fb93:	4c 8b 65 10          	mov    r12,QWORD PTR [rbp+0x10]
  b8fb97:	4c 89 e7             	mov    rdi,r12
  b8fb9a:	e8 24 05 00 00       	call   b900c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdd063>
  b8fb9f:	84 c0                	test   al,al
  b8fba1:	74 1e                	je     b8fbc1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcb61>
  b8fba3:	4c 89 e7             	mov    rdi,r12
  b8fba6:	e8 f8 0a 00 00       	call   b906a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdd643>
  b8fbab:	48 8d 35 e1 b1 7e ff 	lea    rsi,[rip+0xffffffffff7eb1e1]        # 37ad93 <_ZTSSt12bad_any_cast@@Base-0x15435>
  b8fbb2:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  b8fbb9:	00 
  b8fbba:	e8 bf 9e ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  b8fbbf:	eb 26                	jmp    b8fbe7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcb87>
  b8fbc1:	48 8d 05 6d 03 81 ff 	lea    rax,[rip+0xffffffffff81036d]        # 39ff35 <_ZTSN5boost9exceptionE@@Base+0x917>
  b8fbc8:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
  b8fbcf:	00 
  b8fbd0:	48 89 06             	mov    QWORD PTR [rsi],rax
  b8fbd3:	c7 46 08 6f 5c b9 90 	mov    DWORD PTR [rsi+0x8],0x90b95c6f
  b8fbda:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  b8fbe1:	00 
  b8fbe2:	e8 c3 21 c3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  b8fbe7:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  b8fbee:	00 
  b8fbef:	4c 89 fe             	mov    rsi,r15
  b8fbf2:	e8 29 ef c5 00       	call   17eeb20 <_ZNSt6__ndk19to_stringEl@plt>
  b8fbf7:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8fbfe:	00 
  b8fbff:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  b8fc06:	00 
  b8fc07:	48 8d 94 24 30 01 00 	lea    rdx,[rsp+0x130]
  b8fc0e:	00 
  b8fc0f:	e8 7c 65 f2 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
  b8fc14:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  b8fc1b:	00 
  b8fc1c:	e8 6f e2 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8fc21:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  b8fc28:	00 
  b8fc29:	e8 62 e2 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8fc2e:	48 8d 84 24 01 01 00 	lea    rax,[rsp+0x101]
  b8fc35:	00 
  b8fc36:	0f b6 48 ff          	movzx  ecx,BYTE PTR [rax-0x1]
  b8fc3a:	89 ce                	mov    esi,ecx
  b8fc3c:	d1 ee                	shr    esi,1
  b8fc3e:	f6 c1 01             	test   cl,0x1
  b8fc41:	48 8b 78 0f          	mov    rdi,QWORD PTR [rax+0xf]
  b8fc45:	48 0f 44 f8          	cmove  rdi,rax
  b8fc49:	48 0f 45 70 07       	cmovne rsi,QWORD PTR [rax+0x7]
  b8fc4e:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]
  b8fc55:	00 
  b8fc56:	4c 89 fa             	mov    rdx,r15
  b8fc59:	e8 ee 65 c1 00       	call   17a624c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a3b8>
  b8fc5e:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]
  b8fc65:	00 
  b8fc66:	4c 89 e7             	mov    rdi,r12
  b8fc69:	4c 89 fe             	mov    rsi,r15
  b8fc6c:	e8 c3 85 f1 ff       	call   aa8234 <JNI_OnUnload@@Base+0x2fb01>
  b8fc71:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
  b8fc76:	4c 89 ff             	mov    rdi,r15
  b8fc79:	4c 89 e6             	mov    rsi,r12
  b8fc7c:	e8 c7 85 f1 ff       	call   aa8248 <JNI_OnUnload@@Base+0x2fb15>
  b8fc81:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8fc88:	00 
  b8fc89:	e8 02 e2 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8fc8e:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  b8fc95:	00 
  b8fc96:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
  b8fc9b:	4c 89 fa             	mov    rdx,r15
  b8fc9e:	e8 ed 64 f2 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
  b8fca3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  b8fcaa:	00 
  b8fcab:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
  b8fcb2:	00 
  b8fcb3:	e8 46 9d a5 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
  b8fcb8:	48 8d 35 61 ad 8a ff 	lea    rsi,[rip+0xffffffffff8aad61]        # 43aa20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x62c>
  b8fcbf:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  b8fcc4:	e8 77 e2 c5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  b8fcc9:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  b8fcd0:	00 
  b8fcd1:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  b8fcd6:	e8 4f 9c a5 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
  b8fcdb:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  b8fce0:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  b8fce7:	00 
  b8fce8:	e8 53 e2 c5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  b8fced:	4c 8d 63 08          	lea    r12,[rbx+0x8]
  b8fcf1:	49 89 df             	mov    r15,rbx
  b8fcf4:	49 83 c7 18          	add    r15,0x18
  b8fcf8:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  b8fcff:	00 
  b8fd00:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
  b8fd05:	e8 50 9e a5 00       	call   15e9b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f0de>
  b8fd0a:	48 8d 84 24 d0 00 00 	lea    rax,[rsp+0xd0]
  b8fd11:	00 
  b8fd12:	48 89 68 f8          	mov    QWORD PTR [rax-0x8],rbp
  b8fd16:	f0 49 ff 04 24       	lock inc QWORD PTR [r12]
  b8fd1b:	4d 85 f6             	test   r14,r14
  b8fd1e:	74 05                	je     b8fd25 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdccc5>
  b8fd20:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  b8fd25:	48 89 ac 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rbp
  b8fd2c:	00 
  b8fd2d:	4c 89 bc 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r15
  b8fd34:	00 
  b8fd35:	48 89 9c 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rbx
  b8fd3c:	00 
  b8fd3d:	0f 57 c0             	xorps  xmm0,xmm0
  b8fd40:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
  b8fd43:	4c 89 ac 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r13
  b8fd4a:	00 
  b8fd4b:	4c 89 b4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r14
  b8fd52:	00 
  b8fd53:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
  b8fd57:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
  b8fd5e:	00 00 
  b8fd60:	6a 30                	push   0x30
  b8fd62:	5f                   	pop    rdi
  b8fd63:	e8 98 e1 c5 00       	call   17edf00 <_Znwm@plt>
  b8fd68:	48 8d 8c 24 08 01 00 	lea    rcx,[rsp+0x108]
  b8fd6f:	00 
  b8fd70:	48 8d 15 61 e7 c7 00 	lea    rdx,[rip+0xc7e761]        # 180e4d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4198>
  b8fd77:	48 89 10             	mov    QWORD PTR [rax],rdx
  b8fd7a:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
  b8fd7e:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
  b8fd82:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
  b8fd86:	0f 57 c0             	xorps  xmm0,xmm0
  b8fd89:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
  b8fd8c:	4c 89 68 20          	mov    QWORD PTR [rax+0x20],r13
  b8fd90:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
  b8fd94:	0f 11 41 10          	movups XMMWORD PTR [rcx+0x10],xmm0
  b8fd98:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]
  b8fd9f:	00 
  b8fda0:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
  b8fda5:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8fdac:	00 
  b8fdad:	e8 9a 0a fb ff       	call   b4084c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d7ec>
  b8fdb2:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
  b8fdb9:	00 
  b8fdba:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b8fdbd:	4c 89 e6             	mov    rsi,r12
  b8fdc0:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
  b8fdc6:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
  b8fdcb:	48 89 68 f8          	mov    QWORD PTR [rax-0x8],rbp
  b8fdcf:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  b8fdd4:	4d 85 f6             	test   r14,r14
  b8fdd7:	74 05                	je     b8fdde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcd7e>
  b8fdd9:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  b8fdde:	48 89 ac 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rbp
  b8fde5:	00 
  b8fde6:	4c 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r15
  b8fded:	00 
  b8fdee:	48 89 9c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rbx
  b8fdf5:	00 
  b8fdf6:	0f 57 c0             	xorps  xmm0,xmm0
  b8fdf9:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
  b8fdfc:	4c 89 ac 24 48 01 00 	mov    QWORD PTR [rsp+0x148],r13
  b8fe03:	00 
  b8fe04:	4c 89 b4 24 50 01 00 	mov    QWORD PTR [rsp+0x150],r14
  b8fe0b:	00 
  b8fe0c:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
  b8fe10:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
  b8fe17:	00 00 
  b8fe19:	6a 30                	push   0x30
  b8fe1b:	5f                   	pop    rdi
  b8fe1c:	e8 df e0 c5 00       	call   17edf00 <_Znwm@plt>
  b8fe21:	48 8d 8c 24 38 01 00 	lea    rcx,[rsp+0x138]
  b8fe28:	00 
  b8fe29:	48 8d 15 f0 e6 c7 00 	lea    rdx,[rip+0xc7e6f0]        # 180e520 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x41e0>
  b8fe30:	48 89 10             	mov    QWORD PTR [rax],rdx
  b8fe33:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
  b8fe37:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
  b8fe3b:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
  b8fe3f:	0f 57 c0             	xorps  xmm0,xmm0
  b8fe42:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
  b8fe45:	4c 89 68 20          	mov    QWORD PTR [rax+0x20],r13
  b8fe49:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
  b8fe4d:	0f 11 41 10          	movups XMMWORD PTR [rcx+0x10],xmm0
  b8fe51:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
  b8fe58:	00 
  b8fe59:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  b8fe5d:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  b8fe64:	00 
  b8fe65:	e8 e2 09 fb ff       	call   b4084c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d7ec>
  b8fe6a:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
  b8fe71:	00 
  b8fe72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b8fe75:	4c 89 ee             	mov    rsi,r13
  b8fe78:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  b8fe7e:	48 8b 75 20          	mov    rsi,QWORD PTR [rbp+0x20]
  b8fe82:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
  b8fe89:	00 
  b8fe8a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b8fe8d:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
  b8fe93:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
  b8fe9a:	00 
  b8fe9b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  b8fe9e:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
  b8fea5:	00 
  b8fea6:	4c 89 e7             	mov    rdi,r12
  b8fea9:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
  b8feaf:	4c 89 ef             	mov    rdi,r13
  b8feb2:	e8 b3 a0 ee ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b8feb7:	48 89 e7             	mov    rdi,rsp
  b8feba:	e8 8d 09 fb ff       	call   b4084c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d7ec>
  b8febf:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  b8fec6:	00 
  b8fec7:	e8 9e a0 ee ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b8fecc:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
  b8fed3:	00 
  b8fed4:	e8 73 09 fb ff       	call   b4084c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d7ec>
  b8fed9:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  b8fede:	e8 ad df c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8fee3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  b8fee8:	e8 a3 df c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8feed:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  b8fef4:	00 
  b8fef5:	e8 96 df c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8fefa:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
  b8feff:	e8 8c df c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8ff04:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  b8ff09:	e8 82 df c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8ff0e:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
  b8ff15:	00 
  b8ff16:	e8 6b e5 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8ff1b:	41 0f 28 04 24       	movaps xmm0,XMMWORD PTR [r12]
  b8ff20:	4c 89 ff             	mov    rdi,r15
  b8ff23:	e8 0e ec f4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  b8ff28:	48 8b 85 80 00 00 00 	mov    rax,QWORD PTR [rbp+0x80]
  b8ff2f:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
  b8ff33:	48 85 c0             	test   rax,rax
  b8ff36:	74 2d                	je     b8ff65 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcf05>
  b8ff38:	49 89 c4             	mov    r12,rax
  b8ff3b:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
  b8ff3f:	49 39 c7             	cmp    r15,rax
  b8ff42:	73 0e                	jae    b8ff52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcef2>
  b8ff44:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  b8ff48:	4d 89 e5             	mov    r13,r12
  b8ff4b:	48 85 c0             	test   rax,rax
  b8ff4e:	75 e8                	jne    b8ff38 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdced8>
  b8ff50:	eb 1d                	jmp    b8ff6f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcf0f>
  b8ff52:	76 7d                	jbe    b8ffd1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcf71>
  b8ff54:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  b8ff59:	48 85 c0             	test   rax,rax
  b8ff5c:	75 da                	jne    b8ff38 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdced8>
  b8ff5e:	4d 8d 6c 24 08       	lea    r13,[r12+0x8]
  b8ff63:	eb 0a                	jmp    b8ff6f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcf0f>
  b8ff65:	4c 8d ad 80 00 00 00 	lea    r13,[rbp+0x80]
  b8ff6c:	4d 89 ec             	mov    r12,r13
  b8ff6f:	6a 30                	push   0x30
  b8ff71:	5f                   	pop    rdi
  b8ff72:	e8 89 df c5 00       	call   17edf00 <_Znwm@plt>
  b8ff77:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
  b8ff7b:	48 8b 8c 24 38 01 00 	mov    rcx,QWORD PTR [rsp+0x138]
  b8ff82:	00 
  b8ff83:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
  b8ff87:	48 85 c9             	test   rcx,rcx
  b8ff8a:	74 05                	je     b8ff91 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcf31>
  b8ff8c:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  b8ff91:	0f 57 c0             	xorps  xmm0,xmm0
  b8ff94:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
  b8ff97:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
  b8ff9b:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  b8ff9f:	48 8b 4d 78          	mov    rcx,QWORD PTR [rbp+0x78]
  b8ffa3:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
  b8ffa6:	48 85 c9             	test   rcx,rcx
  b8ffa9:	74 08                	je     b8ffb3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcf53>
  b8ffab:	48 89 4d 78          	mov    QWORD PTR [rbp+0x78],rcx
  b8ffaf:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  b8ffb3:	48 8b bd 80 00 00 00 	mov    rdi,QWORD PTR [rbp+0x80]
  b8ffba:	48 89 c6             	mov    rsi,rax
  b8ffbd:	e8 5c a0 f1 ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
  b8ffc2:	48 ff 85 88 00 00 00 	inc    QWORD PTR [rbp+0x88]
  b8ffc9:	4c 8b bc 24 30 01 00 	mov    r15,QWORD PTR [rsp+0x130]
  b8ffd0:	00 
  b8ffd1:	49 8b 07             	mov    rax,QWORD PTR [r15]
  b8ffd4:	4c 89 ff             	mov    rdi,r15
  b8ffd7:	ff 50 10             	call   QWORD PTR [rax+0x10]
  b8ffda:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
  b8ffe1:	00 
  b8ffe2:	e8 9f e4 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8ffe7:	4c 89 f7             	mov    rdi,r14
  b8ffea:	e8 c3 e4 f0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  b8ffef:	48 89 df             	mov    rdi,rbx
  b8fff2:	e8 8f e4 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8fff7:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  b8fffe:	00 
  b8ffff:	e8                   	.byte 0xe8
