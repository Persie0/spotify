# P-captured callback ec5116

- e94863 stores P into the callback capture.
- e9486d selects callback body 0xec5116.
- This report decodes that body and its direct callees.

## ec5116 FDE 0xec5116..0xec5503
      ec5116:	55                   	push   rbp
      ec5117:	41 57                	push   r15
      ec5119:	41 56                	push   r14
      ec511b:	41 55                	push   r13
      ec511d:	41 54                	push   r12
      ec511f:	53                   	push   rbx
      ec5120:	48 81 ec 98 00 00 00 	sub    rsp,0x98
      ec5127:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec512e:	00 00 
      ec5130:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      ec5137:	00 
      ec5138:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
      ec513b:	0f 57 c0             	xorps  xmm0,xmm0
      ec513e:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
      ec5144:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      ec5149:	4d 8b 6e 70          	mov    r13,QWORD PTR [r14+0x70]
      ec514d:	4d 3b 6e 78          	cmp    r13,QWORD PTR [r14+0x78]
      ec5151:	0f 84 f9 02 00 00    	je     ec5450 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c866>
      ec5157:	49 8d 46 70          	lea    rax,[r14+0x70]
      ec515b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ec5160:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
      ec5165:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      ec516a:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
      ec516f:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ec5172:	48 89 df             	mov    rdi,rbx
      ec5175:	4c 89 f6             	mov    rsi,r14
      ec5178:	4c 89 ea             	mov    rdx,r13
      ec517b:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ec517e:	4c 89 e7             	mov    rdi,r12
      ec5181:	48 89 de             	mov    rsi,rbx
      ec5184:	e8 97 03 00 00       	call   ec5520 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c936>
      ec5189:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      ec518e:	e8 f3 92 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5193:	83 7c 24 70 00       	cmp    DWORD PTR [rsp+0x70],0x0
      ec5198:	75 32                	jne    ec51cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c5e2>
      ec519a:	48 83 7c 24 78 00    	cmp    QWORD PTR [rsp+0x78],0x0
      ec51a0:	74 2a                	je     ec51cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c5e2>
      ec51a2:	49 8d 6d 18          	lea    rbp,[r13+0x18]
      ec51a6:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
      ec51ab:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
      ec51b0:	49 39 cf             	cmp    r15,rcx
      ec51b3:	73 20                	jae    ec51d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c5eb>
      ec51b5:	4c 89 ff             	mov    rdi,r15
      ec51b8:	4c 89 e6             	mov    rsi,r12
      ec51bb:	48 89 ea             	mov    rdx,rbp
      ec51be:	e8 37 04 00 00       	call   ec55fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca10>
      ec51c3:	49 83 c7 30          	add    r15,0x30
      ec51c7:	e9 5f 01 00 00       	jmp    ec532b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c741>
      ec51cc:	49 83 c5 28          	add    r13,0x28
      ec51d0:	e9 be 01 00 00       	jmp    ec5393 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c7a9>
      ec51d5:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      ec51da:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
      ec51df:	49 29 f7             	sub    r15,rsi
      ec51e2:	4c 89 f8             	mov    rax,r15
      ec51e5:	48 99                	cqo
      ec51e7:	6a 30                	push   0x30
      ec51e9:	41 58                	pop    r8
      ec51eb:	49 f7 f8             	idiv   r8
      ec51ee:	4c 8d 78 01          	lea    r15,[rax+0x1]
      ec51f2:	48 bf 55 55 55 55 55 	movabs rdi,0x555555555555555
      ec51f9:	55 55 05 
      ec51fc:	49 39 ff             	cmp    r15,rdi
      ec51ff:	0f 87 7e 02 00 00    	ja     ec5483 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c899>
      ec5205:	49 89 c5             	mov    r13,rax
      ec5208:	48 29 f1             	sub    rcx,rsi
      ec520b:	48 89 c8             	mov    rax,rcx
      ec520e:	48 99                	cqo
      ec5210:	49 f7 f8             	idiv   r8
      ec5213:	48 8d 0c 00          	lea    rcx,[rax+rax*1]
      ec5217:	4c 39 f9             	cmp    rcx,r15
      ec521a:	4c 0f 47 f9          	cmova  r15,rcx
      ec521e:	48 b9 aa aa aa aa aa 	movabs rcx,0x2aaaaaaaaaaaaaa
      ec5225:	aa aa 02 
      ec5228:	48 39 c8             	cmp    rax,rcx
      ec522b:	4c 0f 43 ff          	cmovae r15,rdi
      ec522f:	4d 85 ff             	test   r15,r15
      ec5232:	74 14                	je     ec5248 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c65e>
      ec5234:	49 39 ff             	cmp    r15,rdi
      ec5237:	0f 87 5e 02 00 00    	ja     ec549b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c8b1>
      ec523d:	49 6b ff 30          	imul   rdi,r15,0x30
      ec5241:	e8 ba 8c 92 00       	call   17edf00 <_Znwm@plt>
      ec5246:	eb 02                	jmp    ec524a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c660>
      ec5248:	31 c0                	xor    eax,eax
      ec524a:	49 6b cd 30          	imul   rcx,r13,0x30
      ec524e:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      ec5253:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
      ec5258:	48 8d 1c 08          	lea    rbx,[rax+rcx*1]
      ec525c:	48 89 df             	mov    rdi,rbx
      ec525f:	4c 89 e6             	mov    rsi,r12
      ec5262:	48 89 ea             	mov    rdx,rbp
      ec5265:	e8 90 03 00 00       	call   ec55fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca10>
      ec526a:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]
      ec526f:	48 8b 6c 24 48       	mov    rbp,QWORD PTR [rsp+0x48]
      ec5274:	4c 39 f5             	cmp    rbp,r14
      ec5277:	74 57                	je     ec52d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c6e6>
      ec5279:	4c 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],r15
      ec527e:	45 31 ff             	xor    r15d,r15d
      ec5281:	4e 8d 24 3b          	lea    r12,[rbx+r15*1]
      ec5285:	49 83 c4 d0          	add    r12,0xffffffffffffffd0
      ec5289:	4d 8d 2c 2f          	lea    r13,[r15+rbp*1]
      ec528d:	49 83 c5 d0          	add    r13,0xffffffffffffffd0
      ec5291:	4c 89 e7             	mov    rdi,r12
      ec5294:	4c 89 ee             	mov    rsi,r13
      ec5297:	e8 8a 03 00 00       	call   ec5626 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca3c>
      ec529c:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
      ec52a0:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      ec52a5:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      ec52a9:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      ec52ae:	0f 57 c0             	xorps  xmm0,xmm0
      ec52b1:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
      ec52b6:	49 83 c7 d0          	add    r15,0xffffffffffffffd0
      ec52ba:	4d 39 f5             	cmp    r13,r14
      ec52bd:	75 c2                	jne    ec5281 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c697>
      ec52bf:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]
      ec52c4:	48 8b 6c 24 48       	mov    rbp,QWORD PTR [rsp+0x48]
      ec52c9:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
      ec52ce:	eb 06                	jmp    ec52d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c6ec>
      ec52d0:	49 89 ed             	mov    r13,rbp
      ec52d3:	49 89 dc             	mov    r12,rbx
      ec52d6:	49 6b c7 30          	imul   rax,r15,0x30
      ec52da:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
      ec52df:	48 01 c8             	add    rax,rcx
      ec52e2:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
      ec52e7:	4c 8d 3c 11          	lea    r15,[rcx+rdx*1]
      ec52eb:	49 83 c7 30          	add    r15,0x30
      ec52ef:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      ec52f4:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
      ec52f9:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      ec52fe:	4c 39 ed             	cmp    rbp,r13
      ec5301:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
      ec5306:	74 11                	je     ec5319 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c72f>
      ec5308:	48 83 c5 d0          	add    rbp,0xffffffffffffffd0
      ec530c:	48 89 ef             	mov    rdi,rbp
      ec530f:	e8 36 03 00 00       	call   ec564a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca60>
      ec5314:	4c 39 ed             	cmp    rbp,r13
      ec5317:	75 ef                	jne    ec5308 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c71e>
      ec5319:	4d 85 ed             	test   r13,r13
      ec531c:	74 08                	je     ec5326 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c73c>
      ec531e:	4c 89 ef             	mov    rdi,r13
      ec5321:	e8 fa 8b 92 00       	call   17edf20 <_ZdlPv@plt>
      ec5326:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      ec532b:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
      ec5330:	4c 89 e8             	mov    rax,r13
      ec5333:	48 83 c0 28          	add    rax,0x28
      ec5337:	4d 8b 66 78          	mov    r12,QWORD PTR [r14+0x78]
      ec533b:	4c 89 eb             	mov    rbx,r13
      ec533e:	4c 39 e0             	cmp    rax,r12
      ec5341:	74 39                	je     ec537c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c792>
      ec5343:	4c 89 eb             	mov    rbx,r13
      ec5346:	49 89 df             	mov    r15,rbx
      ec5349:	48 83 c3 28          	add    rbx,0x28
      ec534d:	4c 89 ff             	mov    rdi,r15
      ec5350:	48 89 de             	mov    rsi,rbx
      ec5353:	e8 d6 66 bb ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      ec5358:	41 0f 10 47 40       	movups xmm0,XMMWORD PTR [r15+0x40]
      ec535d:	0f 57 c9             	xorps  xmm1,xmm1
      ec5360:	41 0f 11 4f 40       	movups XMMWORD PTR [r15+0x40],xmm1
      ec5365:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      ec5369:	41 0f 11 47 18       	movups XMMWORD PTR [r15+0x18],xmm0
      ec536e:	e8 3f 91 bd ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      ec5373:	49 83 c7 50          	add    r15,0x50
      ec5377:	4d 39 e7             	cmp    r15,r12
      ec537a:	75 ca                	jne    ec5346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c75c>
      ec537c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ec5381:	48 89 de             	mov    rsi,rbx
      ec5384:	e8 09 2a fe ff       	call   ea7d92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f1a8>
      ec5389:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
      ec538e:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      ec5393:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      ec539a:	00 
      ec539b:	e8 e6 90 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec53a0:	4d 3b 6e 78          	cmp    r13,QWORD PTR [r14+0x78]
      ec53a4:	0f 85 c5 fd ff ff    	jne    ec516f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c585>
      ec53aa:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
      ec53af:	4c 8b 6c 24 48       	mov    r13,QWORD PTR [rsp+0x48]
      ec53b4:	4c 39 eb             	cmp    rbx,r13
      ec53b7:	0f 84 93 00 00 00    	je     ec5450 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c866>
      ec53bd:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
      ec53c2:	44 8b 3b             	mov    r15d,DWORD PTR [rbx]
      ec53c5:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      ec53c9:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      ec53ce:	4c 8b 63 10          	mov    r12,QWORD PTR [rbx+0x10]
      ec53d2:	0f 57 c0             	xorps  xmm0,xmm0
      ec53d5:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
      ec53d9:	48 8b 6b 18          	mov    rbp,QWORD PTR [rbx+0x18]
      ec53dd:	48 83 c3 20          	add    rbx,0x20
      ec53e1:	4c 89 f7             	mov    rdi,r14
      ec53e4:	48 89 de             	mov    rsi,rbx
      ec53e7:	e8 44 5f be ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      ec53ec:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ec53f1:	48 85 ff             	test   rdi,rdi
      ec53f4:	74 34                	je     ec542a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c840>
      ec53f6:	44 89 7c 24 70       	mov    DWORD PTR [rsp+0x70],r15d
      ec53fb:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      ec5400:	0f 11 44 24 78       	movups XMMWORD PTR [rsp+0x78],xmm0
      ec5405:	48 89 ac 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rbp
      ec540c:	00 
      ec540d:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      ec5412:	6a 01                	push   0x1
      ec5414:	5a                   	pop    rdx
      ec5415:	e8 8c 02 00 00       	call   ec56a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cabc>
      ec541a:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      ec5421:	00 
      ec5422:	e8 5f 90 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5427:	45 31 e4             	xor    r12d,r12d
      ec542a:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      ec542f:	e8 52 90 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5434:	4c 89 e7             	mov    rdi,r12
      ec5437:	e8 4a 90 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec543c:	31 ff                	xor    edi,edi
      ec543e:	e8 43 90 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5443:	48 83 c3 10          	add    rbx,0x10
      ec5447:	4c 39 eb             	cmp    rbx,r13
      ec544a:	0f 85 72 ff ff ff    	jne    ec53c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c7d8>
      ec5450:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ec5455:	e8 08 02 00 00       	call   ec5662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca78>
      ec545a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5461:	00 00 
      ec5463:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
      ec546a:	00 
      ec546b:	0f 85 8d 00 00 00    	jne    ec54fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c914>
      ec5471:	48 81 c4 98 00 00 00 	add    rsp,0x98
      ec5478:	5b                   	pop    rbx
      ec5479:	41 5c                	pop    r12
      ec547b:	41 5d                	pop    r13
      ec547d:	41 5e                	pop    r14
      ec547f:	41 5f                	pop    r15
      ec5481:	5d                   	pop    rbp
      ec5482:	c3                   	ret
      ec5483:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec548a:	00 00 
      ec548c:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
      ec5493:	00 
      ec5494:	75 68                	jne    ec54fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c914>
      ec5496:	e8 25 f1 b3 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      ec549b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec54a2:	00 00 
      ec54a4:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
      ec54ab:	00 
      ec54ac:	75 50                	jne    ec54fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c914>
      ec54ae:	e8 2c 62 bb ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
      ec54b3:	eb 00                	jmp    ec54b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c8cb>
      ec54b5:	48 89 c3             	mov    rbx,rax
      ec54b8:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      ec54bf:	00 
      ec54c0:	e8 c1 8f bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec54c5:	eb 12                	jmp    ec54d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c8ef>
      ec54c7:	48 89 c3             	mov    rbx,rax
      ec54ca:	eb 0d                	jmp    ec54d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c8ef>
      ec54cc:	48 89 c3             	mov    rbx,rax
      ec54cf:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      ec54d4:	e8 ad 8f bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec54d9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ec54de:	e8 7f 01 00 00       	call   ec5662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca78>
      ec54e3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec54ea:	00 00 
      ec54ec:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
      ec54f3:	00 
      ec54f4:	75 08                	jne    ec54fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c914>
      ec54f6:	48 89 df             	mov    rdi,rbx
      ec54f9:	e8 d2 a7 ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ec54fe:	e8 ad a5 92 00       	call   17efab0 <__stack_chk_fail@plt>

## Direct callees
- 0xec5520 FDE=0xec5520..0xec55f9
- 0xa9e486 FDE=0xa9e486..0xa9e490
- 0xec55fa FDE=0xec55fa..0xec5626
- 0x17edf00
- 0xec5626 FDE=0xec5626..0xec564a
- 0xec564a FDE=0xec564a..0xec5661
- 0x17edf20
- 0xa7ba2e FDE=0xa7ba2e..0xa7ba61
- 0xa9e4b2 FDE=0xa9e4b2..0xa9e4bc
- 0xea7d92 FDE=0xea7d92..0xea7dc1
- 0xaab330 FDE=0xaab330..0xaab365
- 0xec56a6 FDE=0xec56a6..0xec57dd
- 0xec5662 FDE=0xec5662..0xec56a6
- 0xa045c0 FDE=0xa045c0..0xa045cd
- 0xa7b6df FDE=0xa7b6df..0xa7b709
- 0xa6fcd0 FDE=0xa6fcd0..0xa6fd50
- 0x17efab0

## Callee 0xec5520
      ec5520:	41 56                	push   r14
      ec5522:	53                   	push   rbx
      ec5523:	48 83 ec 18          	sub    rsp,0x18
      ec5527:	48 89 fb             	mov    rbx,rdi
      ec552a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5531:	00 00 
      ec5533:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ec5538:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
      ec553b:	48 85 ff             	test   rdi,rdi
      ec553e:	74 0e                	je     ec554e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c964>
      ec5540:	49 89 f6             	mov    r14,rsi
      ec5543:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ec5546:	ff 50 68             	call   QWORD PTR [rax+0x68]
      ec5549:	48 85 c0             	test   rax,rax
      ec554c:	74 37                	je     ec5585 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c99b>
      ec554e:	c7 03 02 00 00 00    	mov    DWORD PTR [rbx],0x2
      ec5554:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec555b:	00 00 
      ec555d:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      ec5562:	0f 85 8c 00 00 00    	jne    ec55f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca0a>
      ec5568:	48 8d 43 08          	lea    rax,[rbx+0x8]
      ec556c:	48 83 c3 1c          	add    rbx,0x1c
      ec5570:	0f 57 c0             	xorps  xmm0,xmm0
      ec5573:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      ec5576:	83 60 10 00          	and    DWORD PTR [rax+0x10],0x0
      ec557a:	c6 03 01             	mov    BYTE PTR [rbx],0x1
      ec557d:	48 83 c4 18          	add    rsp,0x18
      ec5581:	5b                   	pop    rbx
      ec5582:	41 5e                	pop    r14
      ec5584:	c3                   	ret
      ec5585:	49 8b 36             	mov    rsi,QWORD PTR [r14]
      ec5588:	80 7e 38 00          	cmp    BYTE PTR [rsi+0x38],0x0
      ec558c:	74 3c                	je     ec55ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c9e0>
      ec558e:	49 89 e6             	mov    r14,rsp
      ec5591:	4c 89 f7             	mov    rdi,r14
      ec5594:	e8 cd 81 00 00       	call   ecd766 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x94b7c>
      ec5599:	83 23 00             	and    DWORD PTR [rbx],0x0
      ec559c:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      ec55a0:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
      ec55a4:	31 c0                	xor    eax,eax
      ec55a6:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
      ec55a9:	88 43 1c             	mov    BYTE PTR [rbx+0x1c],al
      ec55ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec55b3:	00 00 
      ec55b5:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      ec55ba:	75 38                	jne    ec55f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca0a>
      ec55bc:	31 ff                	xor    edi,edi
      ec55be:	48 83 c4 18          	add    rsp,0x18
      ec55c2:	5b                   	pop    rbx
      ec55c3:	41 5e                	pop    r14
      ec55c5:	e9 bc 8e bd ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec55ca:	c7 03 01 00 00 00    	mov    DWORD PTR [rbx],0x1
      ec55d0:	c6 43 1c 00          	mov    BYTE PTR [rbx+0x1c],0x0
      ec55d4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec55db:	00 00 
      ec55dd:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      ec55e2:	75 10                	jne    ec55f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca0a>
      ec55e4:	48 83 c3 08          	add    rbx,0x8
      ec55e8:	0f 57 c0             	xorps  xmm0,xmm0
      ec55eb:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      ec55ee:	c6 43 10 00          	mov    BYTE PTR [rbx+0x10],0x0
      ec55f2:	eb 89                	jmp    ec557d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c993>
      ec55f4:	e8 b7 a4 92 00       	call   17efab0 <__stack_chk_fail@plt>

## Callee 0xa9e486
      a9e486:	48 85 ff             	test   rdi,rdi
      a9e489:	0f 85 01 00 00 00    	jne    a9e490 <JNI_OnUnload@@Base+0x25d5d>
      a9e48f:	c3                   	ret

## Callee 0xec55fa
      ec55fa:	41 56                	push   r14
      ec55fc:	53                   	push   rbx
      ec55fd:	50                   	push   rax
      ec55fe:	48 89 d3             	mov    rbx,rdx
      ec5601:	49 89 fe             	mov    r14,rdi
      ec5604:	e8 1d 00 00 00       	call   ec5626 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca3c>
      ec5609:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ec560c:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ec5610:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      ec5614:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      ec5618:	0f 57 c0             	xorps  xmm0,xmm0
      ec561b:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      ec561e:	48 83 c4 08          	add    rsp,0x8
      ec5622:	5b                   	pop    rbx
      ec5623:	41 5e                	pop    r14
      ec5625:	c3                   	ret

## Callee 0xec5626
      ec5626:	8b 06                	mov    eax,DWORD PTR [rsi]
      ec5628:	89 07                	mov    DWORD PTR [rdi],eax
      ec562a:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
      ec562e:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      ec5632:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      ec5636:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ec563a:	0f 57 c0             	xorps  xmm0,xmm0
      ec563d:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
      ec5641:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
      ec5645:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      ec5649:	c3                   	ret

## Callee 0xec564a
      ec564a:	53                   	push   rbx
      ec564b:	48 89 fb             	mov    rbx,rdi
      ec564e:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
      ec5652:	e8 5b 8e bd ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      ec5657:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      ec565b:	5b                   	pop    rbx
      ec565c:	e9 25 8e bd ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

## Callee 0xa7ba2e
      a7ba2e:	41 56                	push   r14
      a7ba30:	53                   	push   rbx
      a7ba31:	50                   	push   rax
      a7ba32:	48 89 f3             	mov    rbx,rsi
      a7ba35:	49 89 fe             	mov    r14,rdi
      a7ba38:	f6 07 01             	test   BYTE PTR [rdi],0x1
      a7ba3b:	74 09                	je     a7ba46 <JNI_OnUnload@@Base+0x3313>
      a7ba3d:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
      a7ba41:	e8 da 24 d7 00       	call   17edf20 <_ZdlPv@plt>
      a7ba46:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      a7ba4a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      a7ba4e:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
      a7ba51:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      a7ba55:	66 83 23 00          	and    WORD PTR [rbx],0x0
      a7ba59:	48 83 c4 08          	add    rsp,0x8
      a7ba5d:	5b                   	pop    rbx
      a7ba5e:	41 5e                	pop    r14
      a7ba60:	c3                   	ret

## Callee 0xa9e4b2
      a9e4b2:	48 85 ff             	test   rdi,rdi
      a9e4b5:	0f 85 35 fb d4 00    	jne    17edff0 <_ZNSt6__ndk119__shared_weak_count14__release_weakEv@plt>
      a9e4bb:	c3                   	ret

## Callee 0xea7d92
      ea7d92:	41 57                	push   r15
      ea7d94:	41 56                	push   r14
      ea7d96:	53                   	push   rbx
      ea7d97:	48 89 f3             	mov    rbx,rsi
      ea7d9a:	49 89 fe             	mov    r14,rdi
      ea7d9d:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
      ea7da1:	49 39 f7             	cmp    r15,rsi
      ea7da4:	74 11                	je     ea7db7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f1cd>
      ea7da6:	49 83 c7 d8          	add    r15,0xffffffffffffffd8
      ea7daa:	4c 89 ff             	mov    rdi,r15
      ea7dad:	e8 aa 01 00 00       	call   ea7f5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f372>
      ea7db2:	49 39 df             	cmp    r15,rbx
      ea7db5:	75 ef                	jne    ea7da6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f1bc>
      ea7db7:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
      ea7dbb:	5b                   	pop    rbx
      ea7dbc:	41 5e                	pop    r14
      ea7dbe:	41 5f                	pop    r15
      ea7dc0:	c3                   	ret

## Callee 0xaab330
      aab330:	41 56                	push   r14
      aab332:	53                   	push   rbx
      aab333:	50                   	push   rax
      aab334:	48 89 fb             	mov    rbx,rdi
      aab337:	0f 57 c0             	xorps  xmm0,xmm0
      aab33a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      aab33d:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
      aab341:	48 85 ff             	test   rdi,rdi
      aab344:	74 17                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
      aab346:	49 89 f6             	mov    r14,rsi
      aab349:	e8 f2 2d d4 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
      aab34e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      aab352:	48 85 c0             	test   rax,rax
      aab355:	74 06                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
      aab357:	49 8b 06             	mov    rax,QWORD PTR [r14]
      aab35a:	48 89 03             	mov    QWORD PTR [rbx],rax
      aab35d:	48 83 c4 08          	add    rsp,0x8
      aab361:	5b                   	pop    rbx
      aab362:	41 5e                	pop    r14
      aab364:	c3                   	ret

## Callee 0xec56a6
      ec56a6:	55                   	push   rbp
      ec56a7:	41 57                	push   r15
      ec56a9:	41 56                	push   r14
      ec56ab:	53                   	push   rbx
      ec56ac:	48 83 ec 18          	sub    rsp,0x18
      ec56b0:	89 d5                	mov    ebp,edx
      ec56b2:	49 89 f6             	mov    r14,rsi
      ec56b5:	48 89 fb             	mov    rbx,rdi
      ec56b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec56bf:	00 00 
      ec56c1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ec56c6:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      ec56c9:	48 85 ff             	test   rdi,rdi
      ec56cc:	74 7a                	je     ec5748 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb5e>
      ec56ce:	48 83 ff fc          	cmp    rdi,0xfffffffffffffffc
      ec56d2:	0f 87 9f 00 00 00    	ja     ec5777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb8d>
      ec56d8:	40 0f b6 d5          	movzx  edx,bpl
      ec56dc:	4c 89 f6             	mov    rsi,r14
      ec56df:	ff 17                	call   QWORD PTR [rdi]
      ec56e1:	40 84 ed             	test   bpl,bpl
      ec56e4:	0f 84 d3 00 00 00    	je     ec57bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cbd3>
      ec56ea:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
      ec56ed:	49 8d 46 ff          	lea    rax,[r14-0x1]
      ec56f1:	48 83 f8 fb          	cmp    rax,0xfffffffffffffffb
      ec56f5:	77 0f                	ja     ec5706 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb1c>
      ec56f7:	4c 89 f7             	mov    rdi,r14
      ec56fa:	41 ff 56 08          	call   QWORD PTR [r14+0x8]
      ec56fe:	4c 89 f7             	mov    rdi,r14
      ec5701:	e8 1a 88 92 00       	call   17edf20 <_ZdlPv@plt>
      ec5706:	0f 57 c0             	xorps  xmm0,xmm0
      ec5709:	49 89 e6             	mov    r14,rsp
      ec570c:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      ec5710:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      ec5714:	4c 89 f6             	mov    rsi,r14
      ec5717:	e8 00 41 bf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ec571c:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      ec5720:	e8 61 8d bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5725:	0f 57 c0             	xorps  xmm0,xmm0
      ec5728:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      ec572c:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      ec5730:	49 89 e6             	mov    r14,rsp
      ec5733:	4c 89 f6             	mov    rsi,r14
      ec5736:	e8 e1 40 bf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ec573b:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      ec573f:	e8 42 8d bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5744:	6a fe                	push   0xfffffffffffffffe
      ec5746:	eb 29                	jmp    ec5771 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb87>
      ec5748:	4c 8d 7b 28          	lea    r15,[rbx+0x28]
      ec574c:	80 7b 48 00          	cmp    BYTE PTR [rbx+0x48],0x0
      ec5750:	74 0d                	je     ec575f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb75>
      ec5752:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      ec5756:	e8 2b 8d bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec575b:	c6 43 48 00          	mov    BYTE PTR [rbx+0x48],0x0
      ec575f:	4c 89 ff             	mov    rdi,r15
      ec5762:	4c 89 f6             	mov    rsi,r14
      ec5765:	e8 74 00 00 00       	call   ec57de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cbf4>
      ec576a:	40 84 ed             	test   bpl,bpl
      ec576d:	74 4e                	je     ec57bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cbd3>
      ec576f:	6a ff                	push   0xffffffffffffffff
      ec5771:	58                   	pop    rax
      ec5772:	48 89 03             	mov    QWORD PTR [rbx],rax
      ec5775:	eb 05                	jmp    ec577c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb92>
      ec5777:	40 84 ed             	test   bpl,bpl
      ec577a:	74 41                	je     ec57bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cbd3>
      ec577c:	0f 57 c0             	xorps  xmm0,xmm0
      ec577f:	49 89 e6             	mov    r14,rsp
      ec5782:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      ec5786:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      ec578a:	4c 89 f6             	mov    rsi,r14
      ec578d:	e8 8a 40 bf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ec5792:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      ec5796:	e8 eb 8c bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec579b:	0f 57 c0             	xorps  xmm0,xmm0
      ec579e:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      ec57a2:	48 83 c3 18          	add    rbx,0x18
      ec57a6:	49 89 e6             	mov    r14,rsp
      ec57a9:	48 89 df             	mov    rdi,rbx
      ec57ac:	4c 89 f6             	mov    rsi,r14
      ec57af:	e8 68 40 bf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ec57b4:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      ec57b8:	e8 c9 8c bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec57bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec57c4:	00 00 
      ec57c6:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      ec57cb:	75 0b                	jne    ec57d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cbee>
      ec57cd:	48 83 c4 18          	add    rsp,0x18
      ec57d1:	5b                   	pop    rbx
      ec57d2:	41 5e                	pop    r14
      ec57d4:	41 5f                	pop    r15
      ec57d6:	5d                   	pop    rbp
      ec57d7:	c3                   	ret
      ec57d8:	e8 d3 a2 92 00       	call   17efab0 <__stack_chk_fail@plt>

## Callee 0xec5662
      ec5662:	41 57                	push   r15
      ec5664:	41 56                	push   r14
      ec5666:	53                   	push   rbx
      ec5667:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
      ec566a:	4d 85 ff             	test   r15,r15
      ec566d:	74 31                	je     ec56a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cab6>
      ec566f:	48 89 fb             	mov    rbx,rdi
      ec5672:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
      ec5676:	4c 89 ff             	mov    rdi,r15
      ec5679:	4d 39 fe             	cmp    r14,r15
      ec567c:	74 14                	je     ec5692 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8caa8>
      ec567e:	49 83 c6 d0          	add    r14,0xffffffffffffffd0
      ec5682:	4c 89 f7             	mov    rdi,r14
      ec5685:	e8 c0 ff ff ff       	call   ec564a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca60>
      ec568a:	4d 39 fe             	cmp    r14,r15
      ec568d:	75 ef                	jne    ec567e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ca94>
      ec568f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      ec5692:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
      ec5696:	5b                   	pop    rbx
      ec5697:	41 5e                	pop    r14
      ec5699:	41 5f                	pop    r15
      ec569b:	e9 80 88 92 00       	jmp    17edf20 <_ZdlPv@plt>
      ec56a0:	5b                   	pop    rbx
      ec56a1:	41 5e                	pop    r14
      ec56a3:	41 5f                	pop    r15
      ec56a5:	c3                   	ret

## Callee 0xa045c0
      a045c0:	50                   	push   rax
      a045c1:	48 8d 3d 93 ad 96 ff 	lea    rdi,[rip+0xffffffffff96ad93]        # 36f35b <_ZTSSt12bad_any_cast@@Base-0x20e6d>
      a045c8:	e8 c3 57 07 00       	call   a79d90 <JNI_OnUnload@@Base+0x165d>

## Callee 0xa7b6df
      a7b6df:	53                   	push   rbx
      a7b6e0:	6a 08                	push   0x8
      a7b6e2:	5f                   	pop    rdi
      a7b6e3:	e8 c8 27 d7 00       	call   17edeb0 <__cxa_allocate_exception@plt>
      a7b6e8:	48 89 c3             	mov    rbx,rax
      a7b6eb:	48 89 c7             	mov    rdi,rax
      a7b6ee:	e8 5d 28 d7 00       	call   17edf50 <_ZNSt20bad_array_new_lengthC1Ev@plt>
      a7b6f3:	48 8b 35 86 63 e3 00 	mov    rsi,QWORD PTR [rip+0xe36386]        # 18b1a80 <_ZTISt20bad_array_new_length@@Base+0xb85a8>
      a7b6fa:	48 8b 15 77 63 e3 00 	mov    rdx,QWORD PTR [rip+0xe36377]        # 18b1a78 <_ZNSt20bad_array_new_lengthD1Ev@@Base+0xed9c98>
      a7b701:	48 89 df             	mov    rdi,rbx
      a7b704:	e8 d7 27 d7 00       	call   17edee0 <__cxa_throw@plt>

## Callee 0xa6fcd0
      a6fcd0:	53                   	push   rbx
      a6fcd1:	48 81 ec b0 01 00 00 	sub    rsp,0x1b0
      a6fcd8:	48 89 fb             	mov    rbx,rdi
      a6fcdb:	48 89 e7             	mov    rdi,rsp
      a6fcde:	e8 1d 3a 00 00       	call   a73700 <__emutls_get_address@@Base+0x44c0>
      a6fce3:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      a6fce7:	48 85 c9             	test   rcx,rcx
      a6fcea:	75 15                	jne    a6fd01 <__emutls_get_address@@Base+0xac1>
      a6fcec:	48 89 e7             	mov    rdi,rsp
      a6fcef:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
      a6fcf6:	00 
      a6fcf7:	48 89 da             	mov    rdx,rbx
      a6fcfa:	e8 c1 fe ff ff       	call   a6fbc0 <__emutls_get_address@@Base+0x980>
      a6fcff:	eb 17                	jmp    a6fd18 <__emutls_get_address@@Base+0xad8>
      a6fd01:	4c 8b 43 18          	mov    r8,QWORD PTR [rbx+0x18]
      a6fd05:	48 89 e7             	mov    rdi,rsp
      a6fd08:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
      a6fd0f:	00 
      a6fd10:	48 89 da             	mov    rdx,rbx
      a6fd13:	e8 38 00 00 00       	call   a6fd50 <__emutls_get_address@@Base+0xb10>
      a6fd18:	bb 30 01 00 00       	mov    ebx,0x130
      a6fd1d:	48 03 1d 54 1f e4 00 	add    rbx,QWORD PTR [rip+0xe41f54]        # 18b1c78 <__sF@LIBC>
      a6fd24:	48 8d 35 0f 6c 8b ff 	lea    rsi,[rip+0xffffffffff8b6c0f]        # 32693a <_ZTSSt12bad_any_cast@@Base-0x6988e>
      a6fd2b:	48 8d 15 90 c5 90 ff 	lea    rdx,[rip+0xffffffffff90c590]        # 37c2c2 <_ZTSSt12bad_any_cast@@Base-0x13f06>
      a6fd32:	48 8d 0d 84 43 8c ff 	lea    rcx,[rip+0xffffffffff8c4384]        # 3340bd <_ZTSSt12bad_any_cast@@Base-0x5c10b>
      a6fd39:	48 89 df             	mov    rdi,rbx
      a6fd3c:	31 c0                	xor    eax,eax
      a6fd3e:	e8 0d f9 d7 00       	call   17ef650 <fprintf@plt>
      a6fd43:	48 89 df             	mov    rdi,rbx
      a6fd46:	e8 a5 fa d7 00       	call   17ef7f0 <fflush@plt>
      a6fd4b:	e8 60 ef d7 00       	call   17eecb0 <abort@plt>

## Callback/callee target-offset accesses
- 0xec513e: and    QWORD PTR [rsp+0x50],0x0
- 0xec5144: movaps XMMWORD PTR [rsp+0x40],xmm0
- 0xec5160: lea    rbx,[rsp+0x60]
- 0xec51a6: mov    r15,QWORD PTR [rsp+0x48]
- 0xec51ab: mov    rcx,QWORD PTR [rsp+0x50]
- 0xec51da: mov    rsi,QWORD PTR [rsp+0x40]
- 0xec524e: mov    QWORD PTR [rsp+0x38],rax
- 0xec526a: mov    r14,QWORD PTR [rsp+0x40]
- 0xec526f: mov    rbp,QWORD PTR [rsp+0x48]
- 0xec52bf: mov    r13,QWORD PTR [rsp+0x40]
- 0xec52c4: mov    rbp,QWORD PTR [rsp+0x48]
- 0xec52da: mov    rcx,QWORD PTR [rsp+0x38]
- 0xec52ef: mov    QWORD PTR [rsp+0x40],r12
- 0xec52f4: mov    QWORD PTR [rsp+0x48],r15
- 0xec52f9: mov    QWORD PTR [rsp+0x50],rax
- 0xec532b: mov    QWORD PTR [rsp+0x48],r15
- 0xec5358: movups xmm0,XMMWORD PTR [r15+0x40]
- 0xec5360: movups XMMWORD PTR [r15+0x40],xmm1
- 0xec5389: lea    rbx,[rsp+0x60]
- 0xec53aa: mov    rbx,QWORD PTR [rsp+0x40]
- 0xec53af: mov    r13,QWORD PTR [rsp+0x48]
- 0xec53bd: lea    r14,[rsp+0x60]
- 0xec53ec: mov    rdi,QWORD PTR [rsp+0x60]
- 0xec5450: lea    rdi,[rsp+0x40]
- 0xec54d9: lea    rdi,[rsp+0x40]
- 0xec5588: cmp    BYTE PTR [rsi+0x38],0x0
- 0xec574c: cmp    BYTE PTR [rbx+0x48],0x0
- 0xec5752: mov    rdi,QWORD PTR [rbx+0x38]
- 0xec575b: mov    BYTE PTR [rbx+0x48],0x0
