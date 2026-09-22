# Readiness registry-service resolution

## b88014 exact body
  b88014:	53                   	push   rbx
  b88015:	48 89 fb             	mov    rbx,rdi
  b88018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b8801c:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b88020:	ba 9e 00 00 00       	mov    edx,0x9e
  b88025:	e8 b4 a2 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b8802a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b8802d:	48 8b 80 f0 04 00 00 	mov    rax,QWORD PTR [rax+0x4f0]
  b88034:	48 85 c0             	test   rax,rax
  b88037:	74 02                	je     b8803b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fdb>
  b88039:	5b                   	pop    rbx
  b8803a:	c3                   	ret
  b8803b:	e8 7f 1f ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b88040:	50                   	push   rax
  b88041:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  b88044:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b88047:	ff 50 40             	call   QWORD PTR [rax+0x40]
  b8804a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  b8804d:	48 89 c7             	mov    rdi,rax
  b88050:	58                   	pop    rax
  b88051:	ff a1 18 01 00 00    	jmp    QWORD PTR [rcx+0x118]
  b88057:	cc                   	int3
  b88058:	53                   	push   rbx
  b88059:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  b8805d:	48 85 c0             	test   rax,rax
  b88060:	74 11                	je     b88073 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5013>
  b88062:	48 89 fb             	mov    rbx,rdi
  b88065:	31 ff                	xor    edi,edi
  b88067:	48 89 de             	mov    rsi,rbx
  b8806a:	31 d2                	xor    edx,edx
  b8806c:	ff d0                	call   rax
  b8806e:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  b88073:	5b                   	pop    rbx
  b88074:	c3                   	ret
  b88075:	48 89 c7             	mov    rdi,rax
  b88078:	e8 28 1a ef ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b8807d:	cc                   	int3
  b8807e:	53                   	push   rbx
  b8807f:	48 89 fb             	mov    rbx,rdi

## Direct rsp+0xe0 references in caller e8c65c..e8d9ad
### 0xe8c7d2: mov    QWORD PTR [rsp+0xe0],rax
  e8c789:	4c 89 ef             	mov    rdi,r13
  e8c78c:	e8 95 4f d8 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
  e8c791:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
  e8c798:	00 
  e8c799:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e8c79d:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
  e8c7a1:	6a 23                	push   0x23
  e8c7a3:	5a                   	pop    rdx
  e8c7a4:	e8 35 5b cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  e8c7a9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8c7ad:	4c 8b a0 18 01 00 00 	mov    r12,QWORD PTR [rax+0x118]
  e8c7b4:	4d 85 e4             	test   r12,r12
  e8c7b7:	0f 84 e0 1a 00 00    	je     e8e29d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556b3>
  e8c7bd:	4c 89 ef             	mov    rdi,r13
  e8c7c0:	e8 b5 4f d8 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
  e8c7c5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e8c7ca:	4c 89 ef             	mov    rdi,r13
  e8c7cd:	e8 22 c0 f5 ff       	call   de87f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb587a>
  e8c7d2:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  e8c7d9:	00 
  e8c7da:	4c 89 ef             	mov    rdi,r13
  e8c7dd:	e8 3a ad e2 ff       	call   cb751c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044bc>
  e8c7e2:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
  e8c7e9:	00 
  e8c7ea:	4c 89 ef             	mov    rdi,r13
  e8c7ed:	e8 d8 89 f5 ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
  e8c7f2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e8c7f7:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e8c7fb:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
  e8c7ff:	6a 74                	push   0x74
  e8c801:	5a                   	pop    rdx
  e8c802:	e8 d7 5a cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  e8c807:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8c80b:	48 8b 80 a0 03 00 00 	mov    rax,QWORD PTR [rax+0x3a0]
  e8c812:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
  e8c819:	00 
  e8c81a:	48 85 c0             	test   rax,rax
  e8c81d:	0f 84 7f 1a 00 00    	je     e8e2a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556b8>
  e8c823:	48 89 9c 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rbx
  e8c82a:	00 
  e8c82b:	4c 89 ef             	mov    rdi,r13
  e8c82e:	e8 8f 20 00 00       	call   e8e8c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55cd8>

### 0xe8cba8: mov    rdi,QWORD PTR [rsp+0xe0]
  e8cb65:	5a                   	pop    rdx
  e8cb66:	e8 01 1e 00 00       	call   e8e96c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d82>
  e8cb6b:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  e8cb70:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8cb73:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8cb76:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8cb79:	48 89 c7             	mov    rdi,rax
  e8cb7c:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
  e8cb82:	49 89 c6             	mov    r14,rax
  e8cb85:	6a 10                	push   0x10
  e8cb87:	5f                   	pop    rdi
  e8cb88:	e8 73 13 96 00       	call   17edf00 <_Znwm@plt>
  e8cb8d:	49 89 c4             	mov    r12,rax
  e8cb90:	48 8d 05 79 b9 a0 00 	lea    rax,[rip+0xa0b979]        # 1898510 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5450>
  e8cb97:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e8cb9b:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14
  e8cba0:	4c 89 a4 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],r12
  e8cba7:	00 
  e8cba8:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
  e8cbaf:	00 
  e8cbb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8cbb3:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cbb6:	49 89 c5             	mov    r13,rax
  e8cbb9:	48 8b b4 24 d8 00 00 	mov    rsi,QWORD PTR [rsp+0xd8]
  e8cbc0:	00 
  e8cbc1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8cbc4:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
  e8cbcb:	00 
  e8cbcc:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cbcf:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  e8cbd4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8cbd7:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cbda:	49 89 c6             	mov    r14,rax
  e8cbdd:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8cbe0:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
  e8cbe7:	00 
  e8cbe8:	4c 89 fe             	mov    rsi,r15
  e8cbeb:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cbee:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8cbf1:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
  e8cbf8:	00 
  e8cbf9:	4c 89 fe             	mov    rsi,r15

### 0xe8cc4d: mov    QWORD PTR [rsp+0xe0],rax
  e8cc11:	00 
  e8cc12:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc15:	48 8b b4 24 c8 00 00 	mov    rsi,QWORD PTR [rsp+0xc8]
  e8cc1c:	00 
  e8cc1d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8cc20:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
  e8cc27:	00 
  e8cc28:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc2b:	4c 8b bc 24 c0 00 00 	mov    r15,QWORD PTR [rsp+0xc0]
  e8cc32:	00 
  e8cc33:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8cc36:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  e8cc3d:	00 
  e8cc3e:	4c 89 fe             	mov    rsi,r15
  e8cc41:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc44:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8cc47:	4c 89 ff             	mov    rdi,r15
  e8cc4a:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8cc4d:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  e8cc54:	00 
  e8cc55:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  e8cc5c:	00 
  e8cc5d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8cc60:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
  e8cc67:	00 
  e8cc68:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc6b:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
  e8cc72:	00 
  e8cc73:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8cc76:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc79:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
  e8cc80:	00 
  e8cc81:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14
  e8cc88:	00 
  e8cc89:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  e8cc8e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8cc91:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
  e8cc98:	00 
  e8cc99:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8cc9c:	48 89 e8             	mov    rax,rbp
  e8cc9f:	48 8b ad 70 01 00 00 	mov    rbp,QWORD PTR [rbp+0x170]
  e8cca6:	48 8b 80 90 01 00 00 	mov    rax,QWORD PTR [rax+0x190]

## Writes to rsp+0xe0 only
### 0xe8c7d2: mov    QWORD PTR [rsp+0xe0],rax
  e8c779:	4c 89 ef             	mov    rdi,r13
  e8c77c:	e8 d9 f1 fe ff       	call   e7b95a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42d70>
  e8c781:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
  e8c788:	00 
  e8c789:	4c 89 ef             	mov    rdi,r13
  e8c78c:	e8 95 4f d8 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
  e8c791:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
  e8c798:	00 
  e8c799:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e8c79d:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
  e8c7a1:	6a 23                	push   0x23
  e8c7a3:	5a                   	pop    rdx
  e8c7a4:	e8 35 5b cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  e8c7a9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8c7ad:	4c 8b a0 18 01 00 00 	mov    r12,QWORD PTR [rax+0x118]
  e8c7b4:	4d 85 e4             	test   r12,r12
  e8c7b7:	0f 84 e0 1a 00 00    	je     e8e29d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556b3>
  e8c7bd:	4c 89 ef             	mov    rdi,r13
  e8c7c0:	e8 b5 4f d8 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
  e8c7c5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e8c7ca:	4c 89 ef             	mov    rdi,r13
  e8c7cd:	e8 22 c0 f5 ff       	call   de87f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb587a>
  e8c7d2:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  e8c7d9:	00 
  e8c7da:	4c 89 ef             	mov    rdi,r13
  e8c7dd:	e8 3a ad e2 ff       	call   cb751c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044bc>
  e8c7e2:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
  e8c7e9:	00 
  e8c7ea:	4c 89 ef             	mov    rdi,r13
  e8c7ed:	e8 d8 89 f5 ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
  e8c7f2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e8c7f7:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e8c7fb:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
  e8c7ff:	6a 74                	push   0x74
  e8c801:	5a                   	pop    rdx
  e8c802:	e8 d7 5a cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  e8c807:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8c80b:	48 8b 80 a0 03 00 00 	mov    rax,QWORD PTR [rax+0x3a0]
  e8c812:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
  e8c819:	00 

### 0xe8cc4d: mov    QWORD PTR [rsp+0xe0],rax
  e8cbff:	48 8b b4 24 d0 00 00 	mov    rsi,QWORD PTR [rsp+0xd0]
  e8cc06:	00 
  e8cc07:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8cc0a:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
  e8cc11:	00 
  e8cc12:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc15:	48 8b b4 24 c8 00 00 	mov    rsi,QWORD PTR [rsp+0xc8]
  e8cc1c:	00 
  e8cc1d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8cc20:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
  e8cc27:	00 
  e8cc28:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc2b:	4c 8b bc 24 c0 00 00 	mov    r15,QWORD PTR [rsp+0xc0]
  e8cc32:	00 
  e8cc33:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8cc36:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  e8cc3d:	00 
  e8cc3e:	4c 89 fe             	mov    rsi,r15
  e8cc41:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc44:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8cc47:	4c 89 ff             	mov    rdi,r15
  e8cc4a:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8cc4d:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  e8cc54:	00 
  e8cc55:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  e8cc5c:	00 
  e8cc5d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8cc60:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
  e8cc67:	00 
  e8cc68:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc6b:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
  e8cc72:	00 
  e8cc73:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8cc76:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8cc79:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
  e8cc80:	00 
  e8cc81:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14
  e8cc88:	00 
  e8cc89:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  e8cc8e:	48 8b 06             	mov    rax,QWORD PTR [rsi]

## Early registry-accessor result stores e8c680..e8c780
  e8c686:	00 
  e8c687:	48 89 cf             	mov    rdi,rcx
  e8c68a:	e8 93 14 ff ff       	call   e7db22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44f38>
  e8c68f:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  e8c694:	4c 89 ef             	mov    rdi,r13
  e8c697:	e8 f8 b8 cf ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
  e8c69c:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8c6a3:	00 
  e8c6a4:	4c 89 ef             	mov    rdi,r13
  e8c6a7:	e8 f4 6b cd ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
  e8c6ac:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  e8c6b1:	4c 89 ef             	mov    rdi,r13
  e8c6b4:	e8 89 b8 cf ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
  e8c6b9:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  e8c6c0:	00 
  e8c6c1:	4c 89 ef             	mov    rdi,r13
  e8c6c4:	e8 b5 98 cf ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
  e8c6c9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  e8c6ce:	4c 89 ef             	mov    rdi,r13
  e8c6d1:	e8 10 ed cf ff       	call   b8b3e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd8386>
  e8c6d6:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
  e8c6dd:	00 
  e8c6de:	4c 89 ef             	mov    rdi,r13
  e8c6e1:	e8 6a 50 d8 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
  e8c6e6:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8c6ed:	00 
  e8c6ee:	4c 89 ef             	mov    rdi,r13
  e8c6f1:	e8 a2 21 00 00       	call   e8e898 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55cae>
  e8c6f6:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
  e8c6fb:	4c 89 ef             	mov    rdi,r13
  e8c6fe:	e8 11 b9 cf ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
  e8c703:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
  e8c70a:	00 
  e8c70b:	4c 89 ef             	mov    rdi,r13
  e8c70e:	e8 bb 50 d8 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
  e8c713:	49 89 c7             	mov    r15,rax
  e8c716:	4c 89 ef             	mov    rdi,r13
  e8c719:	e8 82 6c dc ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
  e8c71e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e8c723:	4c 89 ef             	mov    rdi,r13
  e8c726:	e8 4f 51 d8 ff       	call   c1187a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e81a>
  e8c72b:	48 89 c5             	mov    rbp,rax
  e8c72e:	4c 89 ef             	mov    rdi,r13
  e8c731:	e8 6e 51 d8 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
  e8c736:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e8c73b:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e8c73f:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
  e8c743:	ba 8b 00 00 00       	mov    edx,0x8b
  e8c748:	e8 91 5b cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  e8c74d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8c751:	48 8b 80 58 04 00 00 	mov    rax,QWORD PTR [rax+0x458]
  e8c758:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
  e8c75f:	00 
  e8c760:	48 85 c0             	test   rax,rax
  e8c763:	0f 84 2f 1b 00 00    	je     e8e298 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556ae>
  e8c769:	4c 89 ef             	mov    rdi,r13
  e8c76c:	e8 47 87 f5 ff       	call   de4eb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1f3e>
  e8c771:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
  e8c778:	00 
  e8c779:	4c 89 ef             	mov    rdi,r13
  e8c77c:	e8 d9 f1 fe ff       	call   e7b95a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42d70>

## Direct-call producer bodies for rsp+0xe0
### producer 0xde87f4
  de87f4:	53                   	push   rbx
  de87f5:	48 89 fb             	mov    rbx,rdi
  de87f8:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  de87fc:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  de8800:	ba bf 00 00 00       	mov    edx,0xbf
  de8805:	e8 d4 9a d7 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  de880a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  de880d:	48 8b 80 f8 05 00 00 	mov    rax,QWORD PTR [rax+0x5f8]
  de8814:	48 85 c0             	test   rax,rax
  de8817:	74 02                	je     de881b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb58a1>
  de8819:	5b                   	pop    rbx
  de881a:	c3                   	ret
  de881b:	e8 9f 17 c9 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  de8820:	53                   	push   rbx
  de8821:	48 89 fb             	mov    rbx,rdi
  de8824:	48 81 c7 78 01 00 00 	add    rdi,0x178
  de882b:	e8 00 e5 cb ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  de8830:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]
  de8837:	e8 be 07 00 00       	call   de8ffa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb6080>
  de883c:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
  de8843:	e8 48 56 a0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  de8848:	48 8d bb 08 01 00 00 	lea    rdi,[rbx+0x108]
  de884f:	e8 94 2d c9 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  de8854:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
  de885b:	e8 30 56 a0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  de8860:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]

## All tiny registry accessors around b87f00..b8b500
### b622de caller near 0xb85f8d
  b85f78:	e8 33 9b c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b85f7d:	cc                   	int3
  b85f7e:	53                   	push   rbx
  b85f7f:	48 89 fb             	mov    rbx,rdi
  b85f82:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b85f86:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b85f8a:	6a 04                	push   0x4
  b85f8c:	5a                   	pop    rdx
  b85f8d:	e8 4c c3 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b85f92:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b85f95:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
  b85f99:	48 85 c0             	test   rax,rax
  b85f9c:	74 02                	je     b85fa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f40>
  b85f9e:	5b                   	pop    rbx
  b85f9f:	c3                   	ret
  b85fa0:	e8 1a 40 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b85fa5:	cc                   	int3
  b85fa6:	53                   	push   rbx
  b85fa7:	48 8d 05 62 7c c8 00 	lea    rax,[rip+0xc87c62]        # 180dc10 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x38d0>
  b85fae:	48 89 07             	mov    QWORD PTR [rdi],rax

### b622de caller near 0xb87f51
  b87f38:	e8 93 7d ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b87f3d:	e8 6e 7b c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b87f42:	53                   	push   rbx
  b87f43:	48 89 fb             	mov    rbx,rdi
  b87f46:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87f4a:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b87f4e:	6a 0c                	push   0xc
  b87f50:	5a                   	pop    rdx
  b87f51:	e8 88 a3 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b87f56:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b87f59:	48 8b 40 60          	mov    rax,QWORD PTR [rax+0x60]
  b87f5d:	48 85 c0             	test   rax,rax
  b87f60:	74 02                	je     b87f64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f04>
  b87f62:	5b                   	pop    rbx
  b87f63:	c3                   	ret
  b87f64:	e8 56 20 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87f69:	cc                   	int3
  b87f6a:	53                   	push   rbx
  b87f6b:	48 89 fb             	mov    rbx,rdi
  b87f6e:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]

### b622de caller near 0xb87f79
  b87f64:	e8 56 20 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87f69:	cc                   	int3
  b87f6a:	53                   	push   rbx
  b87f6b:	48 89 fb             	mov    rbx,rdi
  b87f6e:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87f72:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b87f76:	6a 2a                	push   0x2a
  b87f78:	5a                   	pop    rdx
  b87f79:	e8 60 a3 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b87f7e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b87f81:	48 8b 80 50 01 00 00 	mov    rax,QWORD PTR [rax+0x150]
  b87f88:	48 85 c0             	test   rax,rax
  b87f8b:	74 02                	je     b87f8f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f2f>
  b87f8d:	5b                   	pop    rbx
  b87f8e:	c3                   	ret
  b87f8f:	e8 2b 20 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87f94:	53                   	push   rbx
  b87f95:	48 89 fb             	mov    rbx,rdi
  b87f98:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87f9c:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]

### b622de caller near 0xb87fa3
  b87f8e:	c3                   	ret
  b87f8f:	e8 2b 20 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87f94:	53                   	push   rbx
  b87f95:	48 89 fb             	mov    rbx,rdi
  b87f98:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87f9c:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b87fa0:	6a 55                	push   0x55
  b87fa2:	5a                   	pop    rdx
  b87fa3:	e8 36 a3 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b87fa8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b87fab:	48 8b 80 a8 02 00 00 	mov    rax,QWORD PTR [rax+0x2a8]
  b87fb2:	48 85 c0             	test   rax,rax
  b87fb5:	74 02                	je     b87fb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f59>
  b87fb7:	5b                   	pop    rbx
  b87fb8:	c3                   	ret
  b87fb9:	e8 01 20 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87fbe:	53                   	push   rbx
  b87fbf:	48 89 fb             	mov    rbx,rdi
  b87fc2:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87fc6:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]

### b622de caller near 0xb87fcd
  b87fb8:	c3                   	ret
  b87fb9:	e8 01 20 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87fbe:	53                   	push   rbx
  b87fbf:	48 89 fb             	mov    rbx,rdi
  b87fc2:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87fc6:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b87fca:	6a 72                	push   0x72
  b87fcc:	5a                   	pop    rdx
  b87fcd:	e8 0c a3 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b87fd2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b87fd5:	48 8b 80 90 03 00 00 	mov    rax,QWORD PTR [rax+0x390]
  b87fdc:	48 85 c0             	test   rax,rax
  b87fdf:	74 02                	je     b87fe3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f83>
  b87fe1:	5b                   	pop    rbx
  b87fe2:	c3                   	ret
  b87fe3:	e8 d7 1f ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87fe8:	53                   	push   rbx
  b87fe9:	48 89 fb             	mov    rbx,rdi
  b87fec:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87ff0:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]

### b622de caller near 0xb87ff9
  b87fe1:	5b                   	pop    rbx
  b87fe2:	c3                   	ret
  b87fe3:	e8 d7 1f ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87fe8:	53                   	push   rbx
  b87fe9:	48 89 fb             	mov    rbx,rdi
  b87fec:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87ff0:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b87ff4:	ba 8f 00 00 00       	mov    edx,0x8f
  b87ff9:	e8 e0 a2 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b87ffe:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b88001:	48 8b 80 78 04 00 00 	mov    rax,QWORD PTR [rax+0x478]
  b88008:	48 85 c0             	test   rax,rax
  b8800b:	74 02                	je     b8800f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4faf>
  b8800d:	5b                   	pop    rbx
  b8800e:	c3                   	ret
  b8800f:	e8 ab 1f ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b88014:	53                   	push   rbx
  b88015:	48 89 fb             	mov    rbx,rdi
  b88018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b8801c:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]

### b622de caller near 0xb88025
  b8800d:	5b                   	pop    rbx
  b8800e:	c3                   	ret
  b8800f:	e8 ab 1f ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b88014:	53                   	push   rbx
  b88015:	48 89 fb             	mov    rbx,rdi
  b88018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b8801c:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b88020:	ba 9e 00 00 00       	mov    edx,0x9e
  b88025:	e8 b4 a2 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b8802a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b8802d:	48 8b 80 f0 04 00 00 	mov    rax,QWORD PTR [rax+0x4f0]
  b88034:	48 85 c0             	test   rax,rax
  b88037:	74 02                	je     b8803b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fdb>
  b88039:	5b                   	pop    rbx
  b8803a:	c3                   	ret
  b8803b:	e8 7f 1f ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b88040:	50                   	push   rax
  b88041:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  b88044:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b88047:	ff 50 40             	call   QWORD PTR [rax+0x40]

### b622de caller near 0xb8b28d
  b8b272:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  b8b277:	48 89 cf             	mov    rdi,rcx
  b8b27a:	e8 67 01 00 00       	call   b8b3e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd8386>
  b8b27f:	49 89 c5             	mov    r13,rax
  b8b282:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  b8b286:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
  b8b28a:	6a 03                	push   0x3
  b8b28c:	5a                   	pop    rdx
  b8b28d:	e8 4c 70 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b8b292:	49 8b 07             	mov    rax,QWORD PTR [r15]
  b8b295:	4c 8b 60 18          	mov    r12,QWORD PTR [rax+0x18]
  b8b299:	4d 85 e4             	test   r12,r12
  b8b29c:	0f 84 0c 01 00 00    	je     b8b3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd834e>
  b8b2a2:	4d 8b be 38 01 00 00 	mov    r15,QWORD PTR [r14+0x138]
  b8b2a9:	6a 10                	push   0x10
  b8b2ab:	5f                   	pop    rdi
  b8b2ac:	e8 4f 2c c6 00       	call   17edf00 <_Znwm@plt>
  b8b2b1:	49 89 c6             	mov    r14,rax
  b8b2b4:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  b8b2b8:	48 8d 05 11 2f c8 00 	lea    rax,[rip+0xc82f11]        # 180e1d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e90>

### b622de caller near 0xb8b3f7
  b8b3db:	e8 f0 48 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b8b3e0:	e8 cb 46 c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b8b3e5:	cc                   	int3
  b8b3e6:	53                   	push   rbx
  b8b3e7:	48 89 fb             	mov    rbx,rdi
  b8b3ea:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b8b3ee:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b8b3f2:	ba 89 00 00 00       	mov    edx,0x89
  b8b3f7:	e8 e2 6e fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b8b3fc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b8b3ff:	48 8b 80 48 04 00 00 	mov    rax,QWORD PTR [rax+0x448]
  b8b406:	48 85 c0             	test   rax,rax
  b8b409:	74 02                	je     b8b40d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd83ad>
  b8b40b:	5b                   	pop    rbx
  b8b40c:	c3                   	ret
  b8b40d:	e8 ad eb ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b8b412:	b0 05                	mov    al,0x5
  b8b414:	c3                   	ret
  b8b415:	cc                   	int3
  b8b416:	48 8d 05 39 40 7c ff 	lea    rax,[rip+0xffffffffff7c4039]        # 34f456 <_ZTSSt12bad_any_cast@@Base-0x40d72>

