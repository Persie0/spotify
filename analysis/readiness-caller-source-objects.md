# Readiness caller source-object resolution

Caller FDE: ('0xe8c65c', '0xe8e898')
Final constructor call: 0xe8dba7 -> e8fad0

## All r13/r14 definitions before final argument setup
### 0xe8c66d: mov    r13,rcx
      e8c64e:	c3                   	ret
      e8c64f:	cc                   	int3
      e8c650:	48 8d 05 89 6a 54 ff 	lea    rax,[rip+0xffffffffff546a89]        # 3d30e0 <_ZTSN5boost17bad_function_callE@@Base+0x426>
      e8c657:	6a 21                	push   0x21
      e8c659:	5a                   	pop    rdx
      e8c65a:	c3                   	ret
      e8c65b:	cc                   	int3
      e8c65c:	55                   	push   rbp
      e8c65d:	41 57                	push   r15
      e8c65f:	41 56                	push   r14
      e8c661:	41 55                	push   r13
      e8c663:	41 54                	push   r12
      e8c665:	53                   	push   rbx
      e8c666:	48 81 ec c8 07 00 00 	sub    rsp,0x7c8
      e8c66d:	49 89 cd             	mov    r13,rcx
      e8c670:	49 89 d6             	mov    r14,rdx
      e8c673:	48 89 fb             	mov    rbx,rdi
      e8c676:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e8c67d:	00 00 
      e8c67f:	48 89 84 24 c0 07 00 	mov    QWORD PTR [rsp+0x7c0],rax
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

### 0xe8c670: mov    r14,rdx
      e8c64f:	cc                   	int3
      e8c650:	48 8d 05 89 6a 54 ff 	lea    rax,[rip+0xffffffffff546a89]        # 3d30e0 <_ZTSN5boost17bad_function_callE@@Base+0x426>
      e8c657:	6a 21                	push   0x21
      e8c659:	5a                   	pop    rdx
      e8c65a:	c3                   	ret
      e8c65b:	cc                   	int3
      e8c65c:	55                   	push   rbp
      e8c65d:	41 57                	push   r15
      e8c65f:	41 56                	push   r14
      e8c661:	41 55                	push   r13
      e8c663:	41 54                	push   r12
      e8c665:	53                   	push   rbx
      e8c666:	48 81 ec c8 07 00 00 	sub    rsp,0x7c8
      e8c66d:	49 89 cd             	mov    r13,rcx
      e8c670:	49 89 d6             	mov    r14,rdx
      e8c673:	48 89 fb             	mov    rbx,rdi
      e8c676:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e8c67d:	00 00 
      e8c67f:	48 89 84 24 c0 07 00 	mov    QWORD PTR [rsp+0x7c0],rax
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

### 0xe8c8c2: mov    r14,QWORD PTR [rax+0x3c0]
      e8c88c:	e8 b7 ac e2 ff       	call   cb7548 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044e8>
      e8c891:	48 89 c3             	mov    rbx,rax
      e8c894:	4c 89 ef             	mov    rdi,r13
      e8c897:	e8 50 20 00 00       	call   e8e8ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d02>
      e8c89c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e8c8a1:	4c 89 ef             	mov    rdi,r13
      e8c8a4:	e8 e5 a3 e2 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
      e8c8a9:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      e8c8ae:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      e8c8b2:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
      e8c8b6:	6a 78                	push   0x78
      e8c8b8:	5a                   	pop    rdx
      e8c8b9:	e8 20 5a cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      e8c8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8c8c2:	4c 8b b0 c0 03 00 00 	mov    r14,QWORD PTR [rax+0x3c0]
      e8c8c9:	4d 85 f6             	test   r14,r14
      e8c8cc:	0f 84 da 19 00 00    	je     e8e2ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556c2>
      e8c8d2:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      e8c8d6:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
      e8c8da:	6a 6e                	push   0x6e
      e8c8dc:	5a                   	pop    rdx
      e8c8dd:	e8 fc 59 cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      e8c8e2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8c8e6:	48 8b a8 70 03 00 00 	mov    rbp,QWORD PTR [rax+0x370]
      e8c8ed:	48 85 ed             	test   rbp,rbp
      e8c8f0:	0f 84 bb 19 00 00    	je     e8e2b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556c7>
      e8c8f6:	4c 89 ef             	mov    rdi,r13
      e8c8f9:	e8 fe 4d d8 ff       	call   c116fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e69c>
      e8c8fe:	49 89 c7             	mov    r15,rax
      e8c901:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
      e8c908:	00 
      e8c909:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e8c90c:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8c90f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8c912:	48 89 c7             	mov    rdi,rax

### 0xe8caa3: mov    r13,QWORD PTR [rsp+0x30]
      e8ca61:	e8 20 1a c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8ca66:	48 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [rbp+0x80]
      e8ca6d:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
      e8ca74:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
      e8ca7b:	00 
      e8ca7c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e8ca80:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      e8ca87:	00 
      e8ca88:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
      e8ca8c:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
      e8ca93:	00 
      e8ca94:	48 8b 85 98 00 00 00 	mov    rax,QWORD PTR [rbp+0x98]
      e8ca9b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e8caa2:	00 
      e8caa3:	4c 8b 6c 24 30       	mov    r13,QWORD PTR [rsp+0x30]
      e8caa8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8caac:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
      e8cab3:	00 
      e8cab4:	4c 89 ee             	mov    rsi,r13
      e8cab7:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e8caba:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8cabe:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
      e8cac5:	00 
      e8cac6:	4c 89 ee             	mov    rsi,r13
      e8cac9:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8cacc:	48 89 9c 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rbx
      e8cad3:	00 
      e8cad4:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
      e8cadb:	00 
      e8cadc:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      e8cae0:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
      e8cae7:	00 
      e8cae8:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e8caeb:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      e8caf2:	00 

### 0xe8cb82: mov    r14,rax
      e8cb4e:	e8 c3 1d 00 00       	call   e8e916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d2c>
      e8cb53:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
      e8cb5a:	00 
      e8cb5b:	48 8d b4 24 00 05 00 	lea    rsi,[rsp+0x500]
      e8cb62:	00 
      e8cb63:	6a 01                	push   0x1
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

### 0xe8cbb6: mov    r13,rax
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
      e8cbfc:	ff 50 38             	call   QWORD PTR [rax+0x38]

### 0xe8cbda: mov    r14,rax
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
      e8cbfc:	ff 50 38             	call   QWORD PTR [rax+0x38]
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

### 0xe8ccbf: mov    r14,rax
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
      e8ccad:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
      e8ccb4:	00 
      e8ccb5:	bf 50 01 00 00       	mov    edi,0x150
      e8ccba:	e8 41 12 96 00       	call   17edf00 <_Znwm@plt>
      e8ccbf:	49 89 c6             	mov    r14,rax
      e8ccc2:	48 8b 84 24 f0 00 00 	mov    rax,QWORD PTR [rsp+0xf0]
      e8ccc9:	00 
      e8ccca:	8a 80 80 02 00 00    	mov    al,BYTE PTR [rax+0x280]
      e8ccd0:	88 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],al
      e8ccd7:	48 8d 05 da 45 9a 00 	lea    rax,[rip+0x9a45da]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
      e8ccde:	48 8d 8c 24 10 06 00 	lea    rcx,[rsp+0x610]
      e8cce5:	00 
      e8cce6:	48 89 01             	mov    QWORD PTR [rcx],rax
      e8cce9:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      e8ccf0:	00 
      e8ccf1:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      e8ccf5:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      e8ccf9:	48 8b 8c 24 b0 00 00 	mov    rcx,QWORD PTR [rsp+0xb0]
      e8cd00:	00 
      e8cd01:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
      e8cd05:	0f 10 41 10          	movups xmm0,XMMWORD PTR [rcx+0x10]
      e8cd09:	0f 29 84 24 90 03 00 	movaps XMMWORD PTR [rsp+0x390],xmm0
      e8cd10:	00 
      e8cd11:	48 85 c0             	test   rax,rax
      e8cd14:	74 05                	je     e8cd1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54131>

### 0xe8ce23: mov    r13,QWORD PTR [rsp+0xe8]
      e8cde0:	31 f6                	xor    esi,esi
      e8cde2:	e8 a9 1d 96 00       	call   17eeb90 <memset@plt>
      e8cde7:	41 c6 86 08 01 00 00 	mov    BYTE PTR [r14+0x108],0x1
      e8cdee:	01 
      e8cdef:	66 0f ef c0          	pxor   xmm0,xmm0
      e8cdf3:	f3 41 0f 7f 86 10 01 	movdqu XMMWORD PTR [r14+0x110],xmm0
      e8cdfa:	00 00 
      e8cdfc:	f3 41 0f 7f 86 20 01 	movdqu XMMWORD PTR [r14+0x120],xmm0
      e8ce03:	00 00 
      e8ce05:	49 8d ae 30 01 00 00 	lea    rbp,[r14+0x130]
      e8ce0c:	4d 89 a6 30 01 00 00 	mov    QWORD PTR [r14+0x130],r12
      e8ce13:	f3 41 0f 7f 86 38 01 	movdqu XMMWORD PTR [r14+0x138],xmm0
      e8ce1a:	00 00 
      e8ce1c:	4d 89 ae 48 01 00 00 	mov    QWORD PTR [r14+0x148],r13
      e8ce23:	4c 8b ac 24 e8 00 00 	mov    r13,QWORD PTR [rsp+0xe8]
      e8ce2a:	00 
      e8ce2b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e8ce2f:	48 8d 35 da 62 54 ff 	lea    rsi,[rip+0xffffffffff5462da]        # 3d3110 <_ZTSN5boost17bad_function_callE@@Base+0x456>
      e8ce36:	48 8d 0d f3 62 54 ff 	lea    rcx,[rip+0xffffffffff5462f3]        # 3d3130 <_ZTSN5boost17bad_function_callE@@Base+0x476>
      e8ce3d:	6a 13                	push   0x13
      e8ce3f:	5a                   	pop    rdx
      e8ce40:	6a 19                	push   0x19
      e8ce42:	41 58                	pop    r8
      e8ce44:	6a 01                	push   0x1
      e8ce46:	41 59                	pop    r9
      e8ce48:	e8 11 a7 75 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      e8ce4d:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e8ce51:	e8 8c 1e 00 00       	call   e8ece2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x560f8>
      e8ce56:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e8ce5a:	48 8d 35 e9 62 54 ff 	lea    rsi,[rip+0xffffffffff5462e9]        # 3d314a <_ZTSN5boost17bad_function_callE@@Base+0x490>
      e8ce61:	48 8d 0d f8 62 54 ff 	lea    rcx,[rip+0xffffffffff5462f8]        # 3d3160 <_ZTSN5boost17bad_function_callE@@Base+0x4a6>
      e8ce68:	6a 0b                	push   0xb
      e8ce6a:	5a                   	pop    rdx
      e8ce6b:	6a 14                	push   0x14
      e8ce6d:	41 58                	pop    r8

### 0xe8d302: pop    r13
      e8d2cf:	6a 23                	push   0x23
      e8d2d1:	41 59                	pop    r9
      e8d2d3:	4c 89 ff             	mov    rdi,r15
      e8d2d6:	e8 ed a1 75 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
      e8d2db:	41 80 7f 18 00       	cmp    BYTE PTR [r15+0x18],0x0
      e8d2e0:	41 bd 00 00 00 00    	mov    r13d,0x0
      e8d2e6:	74 54                	je     e8d33c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54752>
      e8d2e8:	48 8d 35 d4 d0 4d ff 	lea    rsi,[rip+0xffffffffff4dd0d4]        # 36a3c3 <_ZTSSt12bad_any_cast@@Base-0x25e05>
      e8d2ef:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      e8d2f6:	00 
      e8d2f7:	e8 53 e5 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e8d2fc:	84 c0                	test   al,al
      e8d2fe:	74 06                	je     e8d306 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5471c>
      e8d300:	6a 02                	push   0x2
      e8d302:	41 5d                	pop    r13
      e8d304:	eb 36                	jmp    e8d33c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54752>
      e8d306:	48 8d 35 a7 5e 54 ff 	lea    rsi,[rip+0xffffffffff545ea7]        # 3d31b4 <_ZTSN5boost17bad_function_callE@@Base+0x4fa>
      e8d30d:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      e8d314:	00 
      e8d315:	e8 35 e5 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e8d31a:	41 bd 00 00 00 00    	mov    r13d,0x0
      e8d320:	84 c0                	test   al,al
      e8d322:	75 18                	jne    e8d33c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54752>
      e8d324:	48 8d 35 8e d0 4d ff 	lea    rsi,[rip+0xffffffffff4dd08e]        # 36a3b9 <_ZTSSt12bad_any_cast@@Base-0x25e0f>
      e8d32b:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      e8d332:	00 
      e8d333:	e8 17 e5 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e8d338:	44 0f b6 e8          	movzx  r13d,al
      e8d33c:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      e8d343:	00 
      e8d344:	e8 e7 99 c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e8d349:	48 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [rsp+0xe8]
      e8d350:	00 
      e8d351:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e8d354:	48 8d 15 62 5e 54 ff 	lea    rdx,[rip+0xffffffffff545e62]        # 3d31bd <_ZTSN5boost17bad_function_callE@@Base+0x503>

### 0xe8d4a4: lea    r13,[rsp+0x4e8]
      e8d460:	48 8d 05 49 93 9b 00 	lea    rax,[rip+0x9b9349]        # 18467b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e98>
      e8d467:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e8d46b:	4d 89 7c 24 08       	mov    QWORD PTR [r12+0x8],r15
      e8d470:	49 89 54 24 10       	mov    QWORD PTR [r12+0x10],rdx
      e8d475:	41 0f 94 44 24 19    	sete   BYTE PTR [r12+0x19]
      e8d47b:	89 8c 24 ac 07 00 00 	mov    DWORD PTR [rsp+0x7ac],ecx
      e8d482:	48 8d ac 24 90 07 00 	lea    rbp,[rsp+0x790]
      e8d489:	00 
      e8d48a:	48 89 ac 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rbp
      e8d491:	00 
      e8d492:	41 89 4c 24 1c       	mov    DWORD PTR [r12+0x1c],ecx
      e8d497:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      e8d49c:	4c 8d bc 24 40 06 00 	lea    r15,[rsp+0x640]
      e8d4a3:	00 
      e8d4a4:	4c 8d ac 24 e8 04 00 	lea    r13,[rsp+0x4e8]
      e8d4ab:	00 
      e8d4ac:	4c 89 ff             	mov    rdi,r15
      e8d4af:	4c 89 ee             	mov    rsi,r13
      e8d4b2:	48 89 ea             	mov    rdx,rbp
      e8d4b5:	4c 89 e1             	mov    rcx,r12
      e8d4b8:	e8 89 ac cf ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e8d4bd:	4c 89 e7             	mov    rdi,r12
      e8d4c0:	e8 a5 ca be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e8d4c5:	48 89 ef             	mov    rdi,rbp
      e8d4c8:	e8 9d ca be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e8d4cd:	4c 89 ef             	mov    rdi,r13
      e8d4d0:	e8 bb 09 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8d4d5:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
      e8d4dc:	00 
      e8d4dd:	4c 89 fe             	mov    rsi,r15
      e8d4e0:	e8 13 1c 00 00       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e8d4e5:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      e8d4ec:	00 
      e8d4ed:	e8 7c ad cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e8d4f2:	6a 30                	push   0x30

### 0xe8d505: mov    r13,QWORD PTR [rsp+0x88]
      e8d4d0:	e8 bb 09 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8d4d5:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
      e8d4dc:	00 
      e8d4dd:	4c 89 fe             	mov    rsi,r15
      e8d4e0:	e8 13 1c 00 00       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e8d4e5:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      e8d4ec:	00 
      e8d4ed:	e8 7c ad cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e8d4f2:	6a 30                	push   0x30
      e8d4f4:	5f                   	pop    rdi
      e8d4f5:	48 89 dd             	mov    rbp,rbx
      e8d4f8:	e8 03 0a 96 00       	call   17edf00 <_Znwm@plt>
      e8d4fd:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
      e8d504:	00 
      e8d505:	4c 8b ac 24 88 00 00 	mov    r13,QWORD PTR [rsp+0x88]
      e8d50c:	00 
      e8d50d:	4c 8b a4 24 80 00 00 	mov    r12,QWORD PTR [rsp+0x80]
      e8d514:	00 
      e8d515:	66 0f ef c0          	pxor   xmm0,xmm0
      e8d519:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e8d51e:	48 8d 0d 43 ff 96 00 	lea    rcx,[rip+0x96ff43]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e8d525:	48 89 08             	mov    QWORD PTR [rax],rcx
      e8d528:	48 8d 48 18          	lea    rcx,[rax+0x18]
      e8d52c:	48 8d 15 05 18 9b 00 	lea    rdx,[rip+0x9b1805]        # 183ed38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10cd0>
      e8d533:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e8d537:	48 8b 94 24 38 03 00 	mov    rdx,QWORD PTR [rsp+0x338]
      e8d53e:	00 
      e8d53f:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
      e8d546:	00 
      e8d547:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      e8d54b:	48 85 d2             	test   rdx,rdx
      e8d54e:	74 05                	je     e8d555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5496b>
      e8d550:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      e8d555:	66 48 0f 6e c0       	movq   xmm0,rax
      e8d55a:	66 48 0f 6e c9       	movq   xmm1,rcx

### 0xe8d7b9: mov    r13,rax
      e8d78a:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e8d78d:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
      e8d794:	00 
      e8d795:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e8d798:	48 89 df             	mov    rdi,rbx
      e8d79b:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e8d79e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      e8d7a3:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e8d7a6:	4c 89 ff             	mov    rdi,r15
      e8d7a9:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d7ac:	48 89 c3             	mov    rbx,rax
      e8d7af:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d7b3:	4c 89 ef             	mov    rdi,r13
      e8d7b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d7b9:	49 89 c5             	mov    r13,rax
      e8d7bc:	6a 30                	push   0x30
      e8d7be:	5f                   	pop    rdi
      e8d7bf:	e8 3c 07 96 00       	call   17edf00 <_Znwm@plt>
      e8d7c4:	49 89 c7             	mov    r15,rax
      e8d7c7:	66 0f ef c0          	pxor   xmm0,xmm0
      e8d7cb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e8d7d0:	48 8d 05 91 fc 96 00 	lea    rax,[rip+0x96fc91]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e8d7d7:	49 89 07             	mov    QWORD PTR [r15],rax
      e8d7da:	4c 89 f8             	mov    rax,r15
      e8d7dd:	48 83 c0 18          	add    rax,0x18
      e8d7e1:	48 8d 0d a8 3b 9a 00 	lea    rcx,[rip+0x9a3ba8]        # 1831390 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3328>
      e8d7e8:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
      e8d7ec:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      e8d7f0:	4d 89 6f 28          	mov    QWORD PTR [r15+0x28],r13
      e8d7f4:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
      e8d7fb:	00 
      e8d7fc:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
      e8d803:	00 
      e8d804:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
      e8d80b:	00 

### 0xe8d82d: mov    r13,QWORD PTR [rsp+0xf8]
      e8d7f0:	4d 89 6f 28          	mov    QWORD PTR [r15+0x28],r13
      e8d7f4:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
      e8d7fb:	00 
      e8d7fc:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
      e8d803:	00 
      e8d804:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
      e8d80b:	00 
      e8d80c:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
      e8d813:	00 
      e8d814:	e8 27 07 96 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e8d819:	48 8d 35 be 9c 4e ff 	lea    rsi,[rip+0xffffffffff4e9cbe]        # 3774de <_ZTSSt12bad_any_cast@@Base-0x18cea>
      e8d820:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      e8d827:	00 
      e8d828:	e8 51 c2 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e8d82d:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]
      e8d834:	00 
      e8d835:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
      e8d83a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e8d83d:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
      e8d844:	00 
      e8d845:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
      e8d84c:	00 
      e8d84d:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e8d850:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
      e8d855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e8d858:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
      e8d85f:	00 
      e8d860:	48 89 de             	mov    rsi,rbx
      e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e8d866:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e8d869:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
      e8d870:	00 
      e8d871:	48 89 de             	mov    rsi,rbx
      e8d874:	ff 50 58             	call   QWORD PTR [rax+0x58]
      e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]

## r13 virtual-call cluster e8d880..e8d9ad
  e8d860:	48 89 de             	mov    rsi,rbx
  e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d866:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d869:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
  e8d870:	00 
  e8d871:	48 89 de             	mov    rsi,rbx
  e8d874:	ff 50 58             	call   QWORD PTR [rax+0x58]
  e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d87b:	4c 89 ef             	mov    rdi,r13
  e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d881:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d884:	48 89 c7             	mov    rdi,rax
  e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  e8d88a:	49 89 c4             	mov    r12,rax
  e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d891:	4c 89 ef             	mov    rdi,r13
  e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d89a:	48 89 c7             	mov    rdi,rax
  e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
  e8d8a0:	48 89 c3             	mov    rbx,rax
  e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8a7:	4c 89 ef             	mov    rdi,r13
  e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8b0:	48 89 c7             	mov    rdi,rax
  e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8d8bd:	00 
  e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8c2:	4c 89 ef             	mov    rdi,r13
  e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8cb:	48 89 c7             	mov    rdi,rax
  e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8d8d8:	00 
  e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
  e8d8f3:	00 
  e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
  e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
  e8d902:	00 
  e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
  e8d90a:	00 00 
  e8d90c:	66 0f 7f 84 24 40 04 	movdqa XMMWORD PTR [rsp+0x440],xmm0
  e8d913:	00 00 
  e8d915:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
  e8d91c:	48 85 c0             	test   rax,rax
  e8d91f:	74 05                	je     e8d926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54d3c>
  e8d921:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8d926:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
  e8d92b:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
  e8d932:	00 
  e8d933:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
  e8d93a:	00 
  e8d93b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d93e:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d941:	49 89 c7             	mov    r15,rax
  e8d944:	4c 89 e3             	mov    rbx,r12
  e8d947:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
  e8d94c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d950:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
  e8d957:	00 
  e8d958:	48 89 ee             	mov    rsi,rbp
  e8d95b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d95e:	4c 8b a4 24 30 04 00 	mov    r12,QWORD PTR [rsp+0x430]
  e8d965:	00 
  e8d966:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d96a:	48 89 ee             	mov    rsi,rbp
  e8d96d:	48 8d ac 24 20 04 00 	lea    rbp,[rsp+0x420]
  e8d974:	00 
  e8d975:	48 89 ef             	mov    rdi,rbp
  e8d978:	ff 50 50             	call   QWORD PTR [rax+0x50]
  e8d97b:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
  e8d982:	00 00 
  e8d984:	66 0f 7f 84 24 10 04 	movdqa XMMWORD PTR [rsp+0x410],xmm0
  e8d98b:	00 00 
  e8d98d:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
  e8d994:	48 85 c0             	test   rax,rax
  e8d997:	74 05                	je     e8d99e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54db4>
  e8d999:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8d99e:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e8d9a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d9a7:	4c 89 ef             	mov    rdi,r13
  e8d9aa:	ff 50 68             	call   QWORD PTR [rax+0x68]

## r14 +0x148 references in caller FDE
### 0xe8ce1c: mov    QWORD PTR [r14+0x148],r13
      e8cdab:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      e8cdb2:	00 
      e8cdb3:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
      e8cdb7:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      e8cdbe:	00 
      e8cdbf:	41 c6 46 08 00       	mov    BYTE PTR [r14+0x8],0x0
      e8cdc4:	48 8d 05 35 45 9a 00 	lea    rax,[rip+0x9a4535]        # 1831300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3298>
      e8cdcb:	49 89 06             	mov    QWORD PTR [r14],rax
      e8cdce:	49 89 5e 10          	mov    QWORD PTR [r14+0x10],rbx
      e8cdd2:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      e8cdd6:	ba f0 00 00 00       	mov    edx,0xf0
      e8cddb:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
      e8cde0:	31 f6                	xor    esi,esi
      e8cde2:	e8 a9 1d 96 00       	call   17eeb90 <memset@plt>
      e8cde7:	41 c6 86 08 01 00 00 	mov    BYTE PTR [r14+0x108],0x1
      e8cdee:	01 
      e8cdef:	66 0f ef c0          	pxor   xmm0,xmm0
      e8cdf3:	f3 41 0f 7f 86 10 01 	movdqu XMMWORD PTR [r14+0x110],xmm0
      e8cdfa:	00 00 
      e8cdfc:	f3 41 0f 7f 86 20 01 	movdqu XMMWORD PTR [r14+0x120],xmm0
      e8ce03:	00 00 
      e8ce05:	49 8d ae 30 01 00 00 	lea    rbp,[r14+0x130]
      e8ce0c:	4d 89 a6 30 01 00 00 	mov    QWORD PTR [r14+0x130],r12
      e8ce13:	f3 41 0f 7f 86 38 01 	movdqu XMMWORD PTR [r14+0x138],xmm0
      e8ce1a:	00 00 
      e8ce1c:	4d 89 ae 48 01 00 00 	mov    QWORD PTR [r14+0x148],r13
      e8ce23:	4c 8b ac 24 e8 00 00 	mov    r13,QWORD PTR [rsp+0xe8]
      e8ce2a:	00 
      e8ce2b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e8ce2f:	48 8d 35 da 62 54 ff 	lea    rsi,[rip+0xffffffffff5462da]        # 3d3110 <_ZTSN5boost17bad_function_callE@@Base+0x456>
      e8ce36:	48 8d 0d f3 62 54 ff 	lea    rcx,[rip+0xffffffffff5462f3]        # 3d3130 <_ZTSN5boost17bad_function_callE@@Base+0x476>
      e8ce3d:	6a 13                	push   0x13
      e8ce3f:	5a                   	pop    rdx
      e8ce40:	6a 19                	push   0x19
      e8ce42:	41 58                	pop    r8
      e8ce44:	6a 01                	push   0x1
      e8ce46:	41 59                	pop    r9
      e8ce48:	e8 11 a7 75 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      e8ce4d:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e8ce51:	e8 8c 1e 00 00       	call   e8ece2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x560f8>
      e8ce56:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e8ce5a:	48 8d 35 e9 62 54 ff 	lea    rsi,[rip+0xffffffffff5462e9]        # 3d314a <_ZTSN5boost17bad_function_callE@@Base+0x490>
      e8ce61:	48 8d 0d f8 62 54 ff 	lea    rcx,[rip+0xffffffffff5462f8]        # 3d3160 <_ZTSN5boost17bad_function_callE@@Base+0x4a6>
      e8ce68:	6a 0b                	push   0xb
      e8ce6a:	5a                   	pop    rdx
      e8ce6b:	6a 14                	push   0x14
      e8ce6d:	41 58                	pop    r8
      e8ce6f:	45 31 c9             	xor    r9d,r9d
      e8ce72:	e8 e7 a6 75 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      e8ce77:	49 8b 5d 00          	mov    rbx,QWORD PTR [r13+0x0]
      e8ce7b:	48 8d 35 32 63 54 ff 	lea    rsi,[rip+0xffffffffff546332]        # 3d31b4 <_ZTSN5boost17bad_function_callE@@Base+0x4fa>
      e8ce82:	4c 8d bc 24 40 06 00 	lea    r15,[rsp+0x640]
      e8ce89:	00 
      e8ce8a:	4c 89 ff             	mov    rdi,r15
      e8ce8d:	48 89 ac 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rbp
      e8ce94:	00 
      e8ce95:	e8 e4 cb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e8ce9a:	4c 8d a4 24 58 06 00 	lea    r12,[rsp+0x658]
      e8cea1:	00 
      e8cea2:	48 8d 35 10 d5 4d ff 	lea    rsi,[rip+0xffffffffff4dd510]        # 36a3b9 <_ZTSSt12bad_any_cast@@Base-0x25e0f>
      e8cea9:	4c 89 e7             	mov    rdi,r12

### 0xe8d8f4: mov    rax,QWORD PTR [r14+0x148]
      e8d8a0:	48 89 c3             	mov    rbx,rax
      e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8a7:	4c 89 ef             	mov    rdi,r13
      e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8b0:	48 89 c7             	mov    rdi,rax
      e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      e8d8bd:	00 
      e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8c2:	4c 89 ef             	mov    rdi,r13
      e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8cb:	48 89 c7             	mov    rdi,rax
      e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      e8d8d8:	00 
      e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8dd:	4c 89 ef             	mov    rdi,r13
      e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8e6:	48 89 c7             	mov    rdi,rax
      e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
      e8d8f3:	00 
      e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
      e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
      e8d902:	00 
      e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
      e8d90a:	00 00 
      e8d90c:	66 0f 7f 84 24 40 04 	movdqa XMMWORD PTR [rsp+0x440],xmm0
      e8d913:	00 00 
      e8d915:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      e8d91c:	48 85 c0             	test   rax,rax
      e8d91f:	74 05                	je     e8d926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54d3c>
      e8d921:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e8d926:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
      e8d92b:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
      e8d932:	00 
      e8d933:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
      e8d93a:	00 
      e8d93b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e8d93e:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e8d941:	49 89 c7             	mov    r15,rax
      e8d944:	4c 89 e3             	mov    rbx,r12
      e8d947:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
      e8d94c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e8d950:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
      e8d957:	00 
      e8d958:	48 89 ee             	mov    rsi,rbp
      e8d95b:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d95e:	4c 8b a4 24 30 04 00 	mov    r12,QWORD PTR [rsp+0x430]
      e8d965:	00 
      e8d966:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e8d96a:	48 89 ee             	mov    rsi,rbp
      e8d96d:	48 8d ac 24 20 04 00 	lea    rbp,[rsp+0x420]
      e8d974:	00 
      e8d975:	48 89 ef             	mov    rdi,rbp
      e8d978:	ff 50 50             	call   QWORD PTR [rax+0x50]
      e8d97b:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      e8d982:	00 00 

## Pre-pad direct refs to [rsp+0x88] — arg47 / owner+0x428 producer
### 0xe8c6e6: mov    QWORD PTR [rsp+0x88],rax
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

### 0xe8d505: mov    r13,QWORD PTR [rsp+0x88]
      e8d4b8:	e8 89 ac cf ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e8d4bd:	4c 89 e7             	mov    rdi,r12
      e8d4c0:	e8 a5 ca be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e8d4c5:	48 89 ef             	mov    rdi,rbp
      e8d4c8:	e8 9d ca be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e8d4cd:	4c 89 ef             	mov    rdi,r13
      e8d4d0:	e8 bb 09 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8d4d5:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
      e8d4dc:	00 
      e8d4dd:	4c 89 fe             	mov    rsi,r15
      e8d4e0:	e8 13 1c 00 00       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e8d4e5:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      e8d4ec:	00 
      e8d4ed:	e8 7c ad cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e8d4f2:	6a 30                	push   0x30
      e8d4f4:	5f                   	pop    rdi
      e8d4f5:	48 89 dd             	mov    rbp,rbx
      e8d4f8:	e8 03 0a 96 00       	call   17edf00 <_Znwm@plt>
      e8d4fd:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
      e8d504:	00 
      e8d505:	4c 8b ac 24 88 00 00 	mov    r13,QWORD PTR [rsp+0x88]
      e8d50c:	00 
      e8d50d:	4c 8b a4 24 80 00 00 	mov    r12,QWORD PTR [rsp+0x80]
      e8d514:	00 
      e8d515:	66 0f ef c0          	pxor   xmm0,xmm0
      e8d519:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e8d51e:	48 8d 0d 43 ff 96 00 	lea    rcx,[rip+0x96ff43]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e8d525:	48 89 08             	mov    QWORD PTR [rax],rcx
      e8d528:	48 8d 48 18          	lea    rcx,[rax+0x18]
      e8d52c:	48 8d 15 05 18 9b 00 	lea    rdx,[rip+0x9b1805]        # 183ed38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10cd0>
      e8d533:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e8d537:	48 8b 94 24 38 03 00 	mov    rdx,QWORD PTR [rsp+0x338]
      e8d53e:	00 
      e8d53f:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
      e8d546:	00 
      e8d547:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      e8d54b:	48 85 d2             	test   rdx,rdx
      e8d54e:	74 05                	je     e8d555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5496b>
      e8d550:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      e8d555:	66 48 0f 6e c0       	movq   xmm0,rax
      e8d55a:	66 48 0f 6e c9       	movq   xmm1,rcx
      e8d55f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e8d563:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      e8d568:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e8d56c:	f3 0f 7f 08          	movdqu XMMWORD PTR [rax],xmm1
      e8d570:	e8 11 0f c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8d575:	31 ff                	xor    edi,edi

### 0xe8d8d1: mov    QWORD PTR [rsp+0x88],rax
      e8d891:	4c 89 ef             	mov    rdi,r13
      e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d89a:	48 89 c7             	mov    rdi,rax
      e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
      e8d8a0:	48 89 c3             	mov    rbx,rax
      e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8a7:	4c 89 ef             	mov    rdi,r13
      e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8b0:	48 89 c7             	mov    rdi,rax
      e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      e8d8bd:	00 
      e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8c2:	4c 89 ef             	mov    rdi,r13
      e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8cb:	48 89 c7             	mov    rdi,rax
      e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      e8d8d8:	00 
      e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8dd:	4c 89 ef             	mov    rdi,r13
      e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8e6:	48 89 c7             	mov    rdi,rax
      e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
      e8d8f3:	00 
      e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
      e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
      e8d902:	00 
      e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
      e8d90a:	00 00 
      e8d90c:	66 0f 7f 84 24 40 04 	movdqa XMMWORD PTR [rsp+0x440],xmm0
      e8d913:	00 00 
      e8d915:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      e8d91c:	48 85 c0             	test   rax,rax
      e8d91f:	74 05                	je     e8d926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54d3c>
      e8d921:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e8d926:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
      e8d92b:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
      e8d932:	00 
      e8d933:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
      e8d93a:	00 
      e8d93b:	48 8b 07             	mov    rax,QWORD PTR [rdi]

## Pre-pad direct refs to [rsp+0x140] — arg52 / owner+0x3b8 provider producer
### 0xe8d8fb: mov    QWORD PTR [rsp+0x140],rax
      e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      e8d8bd:	00 
      e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8c2:	4c 89 ef             	mov    rdi,r13
      e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8cb:	48 89 c7             	mov    rdi,rax
      e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      e8d8d8:	00 
      e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8dd:	4c 89 ef             	mov    rdi,r13
      e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8e6:	48 89 c7             	mov    rdi,rax
      e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
      e8d8f3:	00 
      e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
      e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
      e8d902:	00 
      e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
      e8d90a:	00 00 
      e8d90c:	66 0f 7f 84 24 40 04 	movdqa XMMWORD PTR [rsp+0x440],xmm0
      e8d913:	00 00 
      e8d915:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      e8d91c:	48 85 c0             	test   rax,rax
      e8d91f:	74 05                	je     e8d926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54d3c>
      e8d921:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e8d926:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
      e8d92b:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
      e8d932:	00 
      e8d933:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
      e8d93a:	00 
      e8d93b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e8d93e:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e8d941:	49 89 c7             	mov    r15,rax
      e8d944:	4c 89 e3             	mov    rbx,r12
      e8d947:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
      e8d94c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e8d950:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
      e8d957:	00 
      e8d958:	48 89 ee             	mov    rsi,rbp
      e8d95b:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d95e:	4c 8b a4 24 30 04 00 	mov    r12,QWORD PTR [rsp+0x430]
      e8d965:	00 

## Pre-pad direct refs to [rsp+0x50] — arg54 / owner+0x470 source pointer producer
### 0xe8c884: mov    QWORD PTR [rsp+0x50],r14
      e8c833:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
      e8c83a:	00 
      e8c83b:	4c 89 ef             	mov    rdi,r13
      e8c83e:	e8 2b 94 d7 ff       	call   c05c6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152c0e>
      e8c843:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      e8c84a:	00 
      e8c84b:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      e8c84f:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
      e8c853:	6a 76                	push   0x76
      e8c855:	5a                   	pop    rdx
      e8c856:	e8 83 5a cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      e8c85b:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8c85f:	48 8b 80 b0 03 00 00 	mov    rax,QWORD PTR [rax+0x3b0]
      e8c866:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      e8c86d:	00 
      e8c86e:	48 85 c0             	test   rax,rax
      e8c871:	0f 84 30 1a 00 00    	je     e8e2a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556bd>
      e8c877:	48 89 ac 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rbp
      e8c87e:	00 
      e8c87f:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
      e8c884:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e8c889:	4c 89 ef             	mov    rdi,r13
      e8c88c:	e8 b7 ac e2 ff       	call   cb7548 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044e8>
      e8c891:	48 89 c3             	mov    rbx,rax
      e8c894:	4c 89 ef             	mov    rdi,r13
      e8c897:	e8 50 20 00 00       	call   e8e8ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d02>
      e8c89c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e8c8a1:	4c 89 ef             	mov    rdi,r13
      e8c8a4:	e8 e5 a3 e2 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
      e8c8a9:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      e8c8ae:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      e8c8b2:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
      e8c8b6:	6a 78                	push   0x78
      e8c8b8:	5a                   	pop    rdx
      e8c8b9:	e8 20 5a cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      e8c8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8c8c2:	4c 8b b0 c0 03 00 00 	mov    r14,QWORD PTR [rax+0x3c0]
      e8c8c9:	4d 85 f6             	test   r14,r14
      e8c8cc:	0f 84 da 19 00 00    	je     e8e2ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556c2>
      e8c8d2:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      e8c8d6:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
      e8c8da:	6a 6e                	push   0x6e
      e8c8dc:	5a                   	pop    rdx
      e8c8dd:	e8 fc 59 cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      e8c8e2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8c8e6:	48 8b a8 70 03 00 00 	mov    rbp,QWORD PTR [rax+0x370]
      e8c8ed:	48 85 ed             	test   rbp,rbp

### 0xe8c9c9: mov    rbp,QWORD PTR [rsp+0x50]
      e8c97e:	e8 e7 d5 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e8c983:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e8c986:	48 8d 9c 24 40 06 00 	lea    rbx,[rsp+0x640]
      e8c98d:	00 
      e8c98e:	48 89 df             	mov    rdi,rbx
      e8c991:	4c 89 fe             	mov    rsi,r15
      e8c994:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e8c997:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
      e8c99a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
      e8c99e:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
      e8c9a5:	00 
      e8c9a6:	e8 73 da 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
      e8c9ab:	48 8b bc 24 48 06 00 	mov    rdi,QWORD PTR [rsp+0x648]
      e8c9b2:	00 
      e8c9b3:	e8 ce 1a c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8c9b8:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e8c9bb:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e8c9c2:	00 
      e8c9c3:	4c 89 fe             	mov    rsi,r15
      e8c9c6:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e8c9c9:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
      e8c9ce:	4c 89 ef             	mov    rdi,r13
      e8c9d1:	e8 58 26 d0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      e8c9d6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8c9d9:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
      e8c9e0:	00 
      e8c9e1:	48 89 c6             	mov    rsi,rax
      e8c9e4:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      e8c9e7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      e8c9ec:	48 8b 75 58          	mov    rsi,QWORD PTR [rbp+0x58]
      e8c9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e8c9f3:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
      e8c9fa:	00 
      e8c9fb:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8c9fe:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
      e8ca02:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
      e8ca09:	00 
      e8ca0a:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
      e8ca0e:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e8ca13:	48 8b 45 68          	mov    rax,QWORD PTR [rbp+0x68]
      e8ca17:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e8ca1c:	48 8b 45 60          	mov    rax,QWORD PTR [rbp+0x60]
      e8ca20:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
      e8ca27:	00 
      e8ca28:	f3 0f 6f 85 d8 00 00 	movdqu xmm0,XMMWORD PTR [rbp+0xd8]
      e8ca2f:	00 
      e8ca30:	48 8b bd e0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xe0]

### 0xe8cee3: mov    rax,QWORD PTR [rsp+0x50]
      e8ce94:	00 
      e8ce95:	e8 e4 cb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e8ce9a:	4c 8d a4 24 58 06 00 	lea    r12,[rsp+0x658]
      e8cea1:	00 
      e8cea2:	48 8d 35 10 d5 4d ff 	lea    rsi,[rip+0xffffffffff4dd510]        # 36a3b9 <_ZTSSt12bad_any_cast@@Base-0x25e0f>
      e8cea9:	4c 89 e7             	mov    rdi,r12
      e8ceac:	e8 cd cb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e8ceb1:	4c 8d a4 24 70 06 00 	lea    r12,[rsp+0x670]
      e8ceb8:	00 
      e8ceb9:	48 8d 35 03 d5 4d ff 	lea    rsi,[rip+0xffffffffff4dd503]        # 36a3c3 <_ZTSSt12bad_any_cast@@Base-0x25e05>
      e8cec0:	4c 89 e7             	mov    rdi,r12
      e8cec3:	e8 b6 cb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e8cec8:	4c 8d bc 24 90 07 00 	lea    r15,[rsp+0x790]
      e8cecf:	00 
      e8ced0:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e8ced7:	00 
      e8ced8:	6a 03                	push   0x3
      e8ceda:	5a                   	pop    rdx
      e8cedb:	4c 89 ff             	mov    rdi,r15
      e8cede:	e8 75 a5 c1 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
      e8cee3:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      e8cee8:	48 8d 88 f0 00 00 00 	lea    rcx,[rax+0xf0]
      e8ceef:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
      e8cef6:	00 
      e8cef7:	48 81 84 24 f0 00 00 	add    QWORD PTR [rsp+0xf0],0x128
      e8cefe:	00 28 01 00 00 
      e8cf03:	48 05 40 01 00 00    	add    rax,0x140
      e8cf09:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      e8cf0e:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
      e8cf13:	48 83 c0 10          	add    rax,0x10
      e8cf17:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e8cf1e:	00 
      e8cf1f:	49 8d 86 38 01 00 00 	lea    rax,[r14+0x138]
      e8cf26:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      e8cf2b:	6a 30                	push   0x30
      e8cf2d:	41 5c                	pop    r12
      e8cf2f:	4a 8d 3c 24          	lea    rdi,[rsp+r12*1]
      e8cf33:	48 81 c7 40 06 00 00 	add    rdi,0x640
      e8cf3a:	e8 51 0f 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8cf3f:	49 83 c4 e8          	add    r12,0xffffffffffffffe8
      e8cf43:	49 83 fc e8          	cmp    r12,0xffffffffffffffe8
      e8cf47:	75 e6                	jne    e8cf2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54345>
      e8cf49:	48 8d 35 25 62 54 ff 	lea    rsi,[rip+0xffffffffff546225]        # 3d3175 <_ZTSN5boost17bad_function_callE@@Base+0x4bb>
      e8cf50:	48 8d 0d 39 62 54 ff 	lea    rcx,[rip+0xffffffffff546239]        # 3d3190 <_ZTSN5boost17bad_function_callE@@Base+0x4d6>
      e8cf57:	4c 8d 0d 56 62 54 ff 	lea    r9,[rip+0xffffffffff546256]        # 3d31b4 <_ZTSN5boost17bad_function_callE@@Base+0x4fa>
      e8cf5e:	6a 0b                	push   0xb
      e8cf60:	5a                   	pop    rdx

### 0xe8cf09: mov    QWORD PTR [rsp+0x50],rax
      e8ceb1:	4c 8d a4 24 70 06 00 	lea    r12,[rsp+0x670]
      e8ceb8:	00 
      e8ceb9:	48 8d 35 03 d5 4d ff 	lea    rsi,[rip+0xffffffffff4dd503]        # 36a3c3 <_ZTSSt12bad_any_cast@@Base-0x25e05>
      e8cec0:	4c 89 e7             	mov    rdi,r12
      e8cec3:	e8 b6 cb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e8cec8:	4c 8d bc 24 90 07 00 	lea    r15,[rsp+0x790]
      e8cecf:	00 
      e8ced0:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e8ced7:	00 
      e8ced8:	6a 03                	push   0x3
      e8ceda:	5a                   	pop    rdx
      e8cedb:	4c 89 ff             	mov    rdi,r15
      e8cede:	e8 75 a5 c1 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
      e8cee3:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      e8cee8:	48 8d 88 f0 00 00 00 	lea    rcx,[rax+0xf0]
      e8ceef:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
      e8cef6:	00 
      e8cef7:	48 81 84 24 f0 00 00 	add    QWORD PTR [rsp+0xf0],0x128
      e8cefe:	00 28 01 00 00 
      e8cf03:	48 05 40 01 00 00    	add    rax,0x140
      e8cf09:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      e8cf0e:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
      e8cf13:	48 83 c0 10          	add    rax,0x10
      e8cf17:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e8cf1e:	00 
      e8cf1f:	49 8d 86 38 01 00 00 	lea    rax,[r14+0x138]
      e8cf26:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      e8cf2b:	6a 30                	push   0x30
      e8cf2d:	41 5c                	pop    r12
      e8cf2f:	4a 8d 3c 24          	lea    rdi,[rsp+r12*1]
      e8cf33:	48 81 c7 40 06 00 00 	add    rdi,0x640
      e8cf3a:	e8 51 0f 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8cf3f:	49 83 c4 e8          	add    r12,0xffffffffffffffe8
      e8cf43:	49 83 fc e8          	cmp    r12,0xffffffffffffffe8
      e8cf47:	75 e6                	jne    e8cf2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54345>
      e8cf49:	48 8d 35 25 62 54 ff 	lea    rsi,[rip+0xffffffffff546225]        # 3d3175 <_ZTSN5boost17bad_function_callE@@Base+0x4bb>
      e8cf50:	48 8d 0d 39 62 54 ff 	lea    rcx,[rip+0xffffffffff546239]        # 3d3190 <_ZTSN5boost17bad_function_callE@@Base+0x4d6>
      e8cf57:	4c 8d 0d 56 62 54 ff 	lea    r9,[rip+0xffffffffff546256]        # 3d31b4 <_ZTSN5boost17bad_function_callE@@Base+0x4fa>
      e8cf5e:	6a 0b                	push   0xb
      e8cf60:	5a                   	pop    rdx
      e8cf61:	6a 23                	push   0x23
      e8cf63:	41 58                	pop    r8
      e8cf65:	48 89 df             	mov    rdi,rbx
      e8cf68:	41 57                	push   r15
      e8cf6a:	6a 08                	push   0x8
      e8cf6c:	e8 1d a7 75 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
      e8cf71:	58                   	pop    rax

## Pre-pad direct refs to [rsp+0xa0] — arg63 / owner+0x570 dependency producer
### 0xe8ca9b: mov    QWORD PTR [rsp+0xa0],rax
      e8ca3c:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      e8ca41:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      e8ca46:	48 8d 05 23 48 9a 00 	lea    rax,[rip+0x9a4823]        # 1831270 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3208>
      e8ca4d:	48 8d 8c 24 80 05 00 	lea    rcx,[rsp+0x580]
      e8ca54:	00 
      e8ca55:	48 89 01             	mov    QWORD PTR [rcx],rax
      e8ca58:	f3 0f 7f 41 08       	movdqu XMMWORD PTR [rcx+0x8],xmm0
      e8ca5d:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      e8ca61:	e8 20 1a c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8ca66:	48 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [rbp+0x80]
      e8ca6d:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
      e8ca74:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
      e8ca7b:	00 
      e8ca7c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e8ca80:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      e8ca87:	00 
      e8ca88:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
      e8ca8c:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
      e8ca93:	00 
      e8ca94:	48 8b 85 98 00 00 00 	mov    rax,QWORD PTR [rbp+0x98]
      e8ca9b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e8caa2:	00 
      e8caa3:	4c 8b 6c 24 30       	mov    r13,QWORD PTR [rsp+0x30]
      e8caa8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8caac:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
      e8cab3:	00 
      e8cab4:	4c 89 ee             	mov    rsi,r13
      e8cab7:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e8caba:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8cabe:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
      e8cac5:	00 
      e8cac6:	4c 89 ee             	mov    rsi,r13
      e8cac9:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8cacc:	48 89 9c 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rbx
      e8cad3:	00 
      e8cad4:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
      e8cadb:	00 
      e8cadc:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      e8cae0:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
      e8cae7:	00 
      e8cae8:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e8caeb:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      e8caf2:	00 
      e8caf3:	4c 89 f6             	mov    rsi,r14
      e8caf6:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8caf9:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
      e8cb00:	00 

### 0xe8cce9: mov    rax,QWORD PTR [rsp+0xa0]
      e8cc8e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e8cc91:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      e8cc98:	00 
      e8cc99:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e8cc9c:	48 89 e8             	mov    rax,rbp
      e8cc9f:	48 8b ad 70 01 00 00 	mov    rbp,QWORD PTR [rbp+0x170]
      e8cca6:	48 8b 80 90 01 00 00 	mov    rax,QWORD PTR [rax+0x190]
      e8ccad:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
      e8ccb4:	00 
      e8ccb5:	bf 50 01 00 00       	mov    edi,0x150
      e8ccba:	e8 41 12 96 00       	call   17edf00 <_Znwm@plt>
      e8ccbf:	49 89 c6             	mov    r14,rax
      e8ccc2:	48 8b 84 24 f0 00 00 	mov    rax,QWORD PTR [rsp+0xf0]
      e8ccc9:	00 
      e8ccca:	8a 80 80 02 00 00    	mov    al,BYTE PTR [rax+0x280]
      e8ccd0:	88 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],al
      e8ccd7:	48 8d 05 da 45 9a 00 	lea    rax,[rip+0x9a45da]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
      e8ccde:	48 8d 8c 24 10 06 00 	lea    rcx,[rsp+0x610]
      e8cce5:	00 
      e8cce6:	48 89 01             	mov    QWORD PTR [rcx],rax
      e8cce9:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      e8ccf0:	00 
      e8ccf1:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      e8ccf5:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      e8ccf9:	48 8b 8c 24 b0 00 00 	mov    rcx,QWORD PTR [rsp+0xb0]
      e8cd00:	00 
      e8cd01:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
      e8cd05:	0f 10 41 10          	movups xmm0,XMMWORD PTR [rcx+0x10]
      e8cd09:	0f 29 84 24 90 03 00 	movaps XMMWORD PTR [rsp+0x390],xmm0
      e8cd10:	00 
      e8cd11:	48 85 c0             	test   rax,rax
      e8cd14:	74 05                	je     e8cd1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54131>
      e8cd16:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e8cd1b:	48 83 a4 24 e0 02 00 	and    QWORD PTR [rsp+0x2e0],0x0
      e8cd22:	00 00 
      e8cd24:	0f 28 84 24 d0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2d0]
      e8cd2b:	00 
      e8cd2c:	0f 29 84 24 10 01 00 	movaps XMMWORD PTR [rsp+0x110],xmm0
      e8cd33:	00 
      e8cd34:	66 0f ef c9          	pxor   xmm1,xmm1
      e8cd38:	66 0f 7f 8c 24 d0 02 	movdqa XMMWORD PTR [rsp+0x2d0],xmm1
      e8cd3f:	00 00 
      e8cd41:	0f 28 84 24 c0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2c0]
      e8cd48:	00 
      e8cd49:	0f 29 84 24 80 03 00 	movaps XMMWORD PTR [rsp+0x380],xmm0
      e8cd50:	00 
      e8cd51:	66 0f 7f 8c 24 c0 02 	movdqa XMMWORD PTR [rsp+0x2c0],xmm1

### 0xe8cf17: mov    QWORD PTR [rsp+0xa0],rax
      e8cec0:	4c 89 e7             	mov    rdi,r12
      e8cec3:	e8 b6 cb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e8cec8:	4c 8d bc 24 90 07 00 	lea    r15,[rsp+0x790]
      e8cecf:	00 
      e8ced0:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e8ced7:	00 
      e8ced8:	6a 03                	push   0x3
      e8ceda:	5a                   	pop    rdx
      e8cedb:	4c 89 ff             	mov    rdi,r15
      e8cede:	e8 75 a5 c1 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
      e8cee3:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      e8cee8:	48 8d 88 f0 00 00 00 	lea    rcx,[rax+0xf0]
      e8ceef:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
      e8cef6:	00 
      e8cef7:	48 81 84 24 f0 00 00 	add    QWORD PTR [rsp+0xf0],0x128
      e8cefe:	00 28 01 00 00 
      e8cf03:	48 05 40 01 00 00    	add    rax,0x140
      e8cf09:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      e8cf0e:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
      e8cf13:	48 83 c0 10          	add    rax,0x10
      e8cf17:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e8cf1e:	00 
      e8cf1f:	49 8d 86 38 01 00 00 	lea    rax,[r14+0x138]
      e8cf26:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      e8cf2b:	6a 30                	push   0x30
      e8cf2d:	41 5c                	pop    r12
      e8cf2f:	4a 8d 3c 24          	lea    rdi,[rsp+r12*1]
      e8cf33:	48 81 c7 40 06 00 00 	add    rdi,0x640
      e8cf3a:	e8 51 0f 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8cf3f:	49 83 c4 e8          	add    r12,0xffffffffffffffe8
      e8cf43:	49 83 fc e8          	cmp    r12,0xffffffffffffffe8
      e8cf47:	75 e6                	jne    e8cf2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54345>
      e8cf49:	48 8d 35 25 62 54 ff 	lea    rsi,[rip+0xffffffffff546225]        # 3d3175 <_ZTSN5boost17bad_function_callE@@Base+0x4bb>
      e8cf50:	48 8d 0d 39 62 54 ff 	lea    rcx,[rip+0xffffffffff546239]        # 3d3190 <_ZTSN5boost17bad_function_callE@@Base+0x4d6>
      e8cf57:	4c 8d 0d 56 62 54 ff 	lea    r9,[rip+0xffffffffff546256]        # 3d31b4 <_ZTSN5boost17bad_function_callE@@Base+0x4fa>
      e8cf5e:	6a 0b                	push   0xb
      e8cf60:	5a                   	pop    rdx
      e8cf61:	6a 23                	push   0x23
      e8cf63:	41 58                	pop    r8
      e8cf65:	48 89 df             	mov    rdi,rbx
      e8cf68:	41 57                	push   r15
      e8cf6a:	6a 08                	push   0x8
      e8cf6c:	e8 1d a7 75 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
      e8cf71:	58                   	pop    rax
      e8cf72:	59                   	pop    rcx
      e8cf73:	4c 89 ff             	mov    rdi,r15
      e8cf76:	e8 6d e6 be ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>

## Pre-pad direct refs to [rsp+0x148] — neighbor: r13-v+0x28 then +0x40 result
### 0xe8d8ec: mov    QWORD PTR [rsp+0x148],rax
      e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8b0:	48 89 c7             	mov    rdi,rax
      e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      e8d8bd:	00 
      e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8c2:	4c 89 ef             	mov    rdi,r13
      e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8cb:	48 89 c7             	mov    rdi,rax
      e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      e8d8d8:	00 
      e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e8d8dd:	4c 89 ef             	mov    rdi,r13
      e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8d8e6:	48 89 c7             	mov    rdi,rax
      e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
      e8d8f3:	00 
      e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
      e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
      e8d902:	00 
      e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
      e8d90a:	00 00 
      e8d90c:	66 0f 7f 84 24 40 04 	movdqa XMMWORD PTR [rsp+0x440],xmm0
      e8d913:	00 00 
      e8d915:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      e8d91c:	48 85 c0             	test   rax,rax
      e8d91f:	74 05                	je     e8d926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54d3c>
      e8d921:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e8d926:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
      e8d92b:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
      e8d932:	00 
      e8d933:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
      e8d93a:	00 
      e8d93b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e8d93e:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e8d941:	49 89 c7             	mov    r15,rax
      e8d944:	4c 89 e3             	mov    rbx,r12
      e8d947:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
      e8d94c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e8d950:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
      e8d957:	00 
      e8d958:	48 89 ee             	mov    rsi,rbp

## Candidate vptr/address-point materializations near r13/r14 setup
  e8ca46:	48 8d 05 23 48 9a 00 	lea    rax,[rip+0x9a4823]        # 1831270 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3208>
  e8cb90:	48 8d 05 79 b9 a0 00 	lea    rax,[rip+0xa0b979]        # 1898510 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5450>
  e8ccd7:	48 8d 05 da 45 9a 00 	lea    rax,[rip+0x9a45da]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
  e8cdc4:	48 8d 05 35 45 9a 00 	lea    rax,[rip+0x9a4535]        # 1831300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3298>
  e8d16b:	48 8d 05 5e 98 9b 00 	lea    rax,[rip+0x9b985e]        # 18469d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30b8>
  e8d1f2:	48 8d 05 ff 95 9b 00 	lea    rax,[rip+0x9b95ff]        # 18467f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ee0>
  e8d434:	48 8d 05 65 91 9b 00 	lea    rax,[rip+0x9b9165]        # 18465a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c88>
  e8d460:	48 8d 05 49 93 9b 00 	lea    rax,[rip+0x9b9349]        # 18467b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e98>
  e8d52c:	48 8d 15 05 18 9b 00 	lea    rdx,[rip+0x9b1805]        # 183ed38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10cd0>
  e8d59b:	48 8d 15 16 18 9b 00 	lea    rdx,[rip+0x9b1816]        # 183edb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10d50>
  e8d708:	48 8d 05 39 3c 9a 00 	lea    rax,[rip+0x9a3c39]        # 1831348 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x32e0>
  e8d7e1:	48 8d 0d a8 3b 9a 00 	lea    rcx,[rip+0x9a3ba8]        # 1831390 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3328>

## Calls returning values written to the five relevant source slots
- slot 0x88: write 0xe8c6e6 after call 0xe8c6e1 (call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>)
- slot 0x88: write 0xe8d8d1 after call 0xe8d8ce (call   QWORD PTR [rcx+0x38])
- slot 0x140: write 0xe8d8fb after call 0xe8d8e9 (call   QWORD PTR [rcx+0x40])
- slot 0x50: write 0xe8c884 after call 0xe8c856 (call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>)
- slot 0x50: write 0xe8cf09 after call 0xe8cede (call   aa7458 <JNI_OnUnload@@Base+0x2ed25>)
- slot 0xa0: write 0xe8ca9b after call 0xe8ca61 (call   a9e486 <JNI_OnUnload@@Base+0x25d53>)
- slot 0xa0: write 0xe8cf17 after call 0xe8cede (call   aa7458 <JNI_OnUnload@@Base+0x2ed25>)
- slot 0x148: write 0xe8d8ec after call 0xe8d8e9 (call   QWORD PTR [rcx+0x40])
