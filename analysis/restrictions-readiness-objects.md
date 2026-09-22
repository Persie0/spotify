# Restrictions readiness object resolution

Known: registry accessor b88014 validates ID 0x9e and returns table[0x9e] at +0x4f0.
Provider descriptor metadata identifies ID 0x9e as RestrictionsSetupImpl; descriptor factory is 0x10ab7ae.

## RestrictionsSetupImpl factory FDE
('0x10ab7ae', '0x10aba35')
 10ab7ae:	55                   	push   rbp
 10ab7af:	41 57                	push   r15
 10ab7b1:	41 56                	push   r14
 10ab7b3:	41 55                	push   r13
 10ab7b5:	41 54                	push   r12
 10ab7b7:	53                   	push   rbx
 10ab7b8:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
 10ab7bf:	49 89 ce             	mov    r14,rcx
 10ab7c2:	48 89 d3             	mov    rbx,rdx
 10ab7c5:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 10ab7ca:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ab7d1:	00 00 
 10ab7d3:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 10ab7da:	00 
 10ab7db:	48 89 cf             	mov    rdi,rcx
 10ab7de:	e8 b5 30 de ff       	call   e8e898 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55cae>
 10ab7e3:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10ab7e8:	4c 89 f7             	mov    rdi,r14
 10ab7eb:	e8 da 97 b8 ff       	call   c34fca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181f6a>
 10ab7f0:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10ab7f5:	4c 89 f7             	mov    rdi,r14
 10ab7f8:	e8 a3 7a ab ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 10ab7fd:	49 89 c5             	mov    r13,rax
 10ab800:	4c 89 f7             	mov    rdi,r14
 10ab803:	e8 48 5f b6 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
 10ab808:	49 89 c7             	mov    r15,rax
 10ab80b:	4c 89 f7             	mov    rdi,r14
 10ab80e:	e8 67 5f b6 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
 10ab813:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 10ab817:	4c 89 f7             	mov    rdi,r14
 10ab81a:	e8 07 5f b6 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
 10ab81f:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10ab824:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
 10ab828:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10ab82d:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
 10ab831:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 10ab836:	48 8b 83 98 00 00 00 	mov    rax,QWORD PTR [rbx+0x98]
 10ab83d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ab842:	48 8b 6b 68          	mov    rbp,QWORD PTR [rbx+0x68]
 10ab846:	48 8d 35 0a 4a 2b ff 	lea    rsi,[rip+0xffffffffff2b4a0a]        # 360257 <_ZTSSt12bad_any_cast@@Base-0x2ff71>
 10ab84d:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
 10ab852:	4c 89 e7             	mov    rdi,r12
 10ab855:	e8 24 e2 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ab85a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10ab85e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 10ab865:	00 
 10ab866:	48 89 ee             	mov    rsi,rbp
 10ab869:	4c 89 e2             	mov    rdx,r12
 10ab86c:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ab86f:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 10ab873:	4c 89 ef             	mov    rdi,r13
 10ab876:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ab879:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 10ab87e:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 10ab882:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10ab887:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ab88a:	4c 89 ff             	mov    rdi,r15
 10ab88d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ab890:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10ab895:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
 10ab899:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ab89e:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 10ab8a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ab8a5:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10ab8a8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10ab8ab:	48 89 c7             	mov    rdi,rax
 10ab8ae:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
 10ab8b4:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 10ab8b8:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
 10ab8bf:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10ab8c4:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10ab8c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ab8cc:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ab8cf:	48 89 c5             	mov    rbp,rax
 10ab8d2:	4c 89 f7             	mov    rdi,r14
 10ab8d5:	e8 b4 b3 c0 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
 10ab8da:	49 89 c7             	mov    r15,rax
 10ab8dd:	4c 89 f7             	mov    rdi,r14
 10ab8e0:	e8 bb 79 ab ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 10ab8e5:	49 89 c4             	mov    r12,rax
 10ab8e8:	4c 89 f7             	mov    rdi,r14
 10ab8eb:	e8 3e a4 ff ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
 10ab8f0:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10ab8f3:	48 89 c7             	mov    rdi,rax
 10ab8f6:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 10ab8f9:	49 89 c5             	mov    r13,rax
 10ab8fc:	4c 89 f7             	mov    rdi,r14
 10ab8ff:	e8 b8 a0 fc ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
 10ab904:	49 89 c6             	mov    r14,rax
 10ab907:	bf 80 00 00 00       	mov    edi,0x80
 10ab90c:	e8 ef 25 74 00       	call   17edf00 <_Znwm@plt>
 10ab911:	48 89 c3             	mov    rbx,rax
 10ab914:	49 83 c6 10          	add    r14,0x10
 10ab918:	48 8d 05 99 59 78 00 	lea    rax,[rip+0x785999]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
 10ab91f:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
 10ab926:	00 
 10ab927:	49 89 00             	mov    QWORD PTR [r8],rax
 10ab92a:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10ab92f:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
 10ab933:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
 10ab937:	41 0f b6 47 11       	movzx  eax,BYTE PTR [r15+0x11]
 10ab93c:	48 89 df             	mov    rdi,rbx
 10ab93f:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
 10ab944:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
 10ab949:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
 10ab94e:	4c 8b 4c 24 48       	mov    r9,QWORD PTR [rsp+0x48]
 10ab953:	41 56                	push   r14
 10ab955:	41 55                	push   r13
 10ab957:	41 54                	push   r12
 10ab959:	50                   	push   rax
 10ab95a:	55                   	push   rbp
 10ab95b:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
 10ab95f:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
 10ab963:	ff 74 24 48          	push   QWORD PTR [rsp+0x48]
 10ab967:	ff 74 24 58          	push   QWORD PTR [rsp+0x58]
 10ab96b:	ff 74 24 68          	push   QWORD PTR [rsp+0x68]
 10ab96f:	ff b4 24 88 00 00 00 	push   QWORD PTR [rsp+0x88]
 10ab976:	48 8d 84 24 d8 00 00 	lea    rax,[rsp+0xd8]
 10ab97d:	00 
 10ab97e:	50                   	push   rax
 10ab97f:	e8 b2 00 00 00       	call   10aba36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e4c>
 10ab984:	48 83 c4 60          	add    rsp,0x60
 10ab988:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 10ab98f:	00 
 10ab990:	e8 d5 e5 9c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10ab995:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 10ab99a:	48 89 18             	mov    QWORD PTR [rax],rbx
 10ab99d:	48 89 c3             	mov    rbx,rax
 10ab9a0:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10ab9a7:	00 
 10ab9a8:	e8 d9 2a 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ab9ad:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 10ab9b2:	e8 d9 24 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ab9b7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ab9be:	00 00 
 10ab9c0:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
 10ab9c7:	00 
 10ab9c8:	75 66                	jne    10aba30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e46>
 10ab9ca:	48 89 d8             	mov    rax,rbx
 10ab9cd:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
 10ab9d4:	5b                   	pop    rbx
 10ab9d5:	41 5c                	pop    r12
 10ab9d7:	41 5d                	pop    r13
 10ab9d9:	41 5e                	pop    r14
 10ab9db:	41 5f                	pop    r15
 10ab9dd:	5d                   	pop    rbp
 10ab9de:	c3                   	ret
 10ab9df:	49 89 c6             	mov    r14,rax
 10ab9e2:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 10ab9e9:	00 
 10ab9ea:	e8 7b e5 9c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10ab9ef:	48 89 df             	mov    rdi,rbx
 10ab9f2:	e8 29 25 74 00       	call   17edf20 <_ZdlPv@plt>
 10ab9f7:	eb 05                	jmp    10ab9fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e14>
 10ab9f9:	eb 00                	jmp    10ab9fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e11>
 10ab9fb:	49 89 c6             	mov    r14,rax
 10ab9fe:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10aba05:	00 
 10aba06:	e8 7b 2a 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10aba0b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 10aba10:	e8 7b 24 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10aba15:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba1c:	00 00 
 10aba1e:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
 10aba25:	00 
 10aba26:	75 08                	jne    10aba30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e46>
 10aba28:	4c 89 f7             	mov    rdi,r14
 10aba2b:	e8 a0 42 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10aba30:	e8 7b 40 74 00       	call   17efab0 <__stack_chk_fail@plt>

## Factory allocations and AP materializations
### 0x10ab90c: call   17edf00 <_Znwm@plt>
     10ab8e0:	e8 bb 79 ab ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     10ab8e5:	49 89 c4             	mov    r12,rax
     10ab8e8:	4c 89 f7             	mov    rdi,r14
     10ab8eb:	e8 3e a4 ff ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
     10ab8f0:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10ab8f3:	48 89 c7             	mov    rdi,rax
     10ab8f6:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10ab8f9:	49 89 c5             	mov    r13,rax
     10ab8fc:	4c 89 f7             	mov    rdi,r14
     10ab8ff:	e8 b8 a0 fc ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
     10ab904:	49 89 c6             	mov    r14,rax
     10ab907:	bf 80 00 00 00       	mov    edi,0x80
     10ab90c:	e8 ef 25 74 00       	call   17edf00 <_Znwm@plt>
     10ab911:	48 89 c3             	mov    rbx,rax
     10ab914:	49 83 c6 10          	add    r14,0x10
     10ab918:	48 8d 05 99 59 78 00 	lea    rax,[rip+0x785999]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
     10ab91f:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
     10ab926:	00 
     10ab927:	49 89 00             	mov    QWORD PTR [r8],rax
     10ab92a:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     10ab92f:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
     10ab933:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
     10ab937:	41 0f b6 47 11       	movzx  eax,BYTE PTR [r15+0x11]
     10ab93c:	48 89 df             	mov    rdi,rbx
     10ab93f:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
     10ab944:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
     10ab949:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     10ab94e:	4c 8b 4c 24 48       	mov    r9,QWORD PTR [rsp+0x48]
     10ab953:	41 56                	push   r14
     10ab955:	41 55                	push   r13
     10ab957:	41 54                	push   r12

### 0x10ab918: lea    rax,[rip+0x785999]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
     10ab8eb:	e8 3e a4 ff ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
     10ab8f0:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10ab8f3:	48 89 c7             	mov    rdi,rax
     10ab8f6:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10ab8f9:	49 89 c5             	mov    r13,rax
     10ab8fc:	4c 89 f7             	mov    rdi,r14
     10ab8ff:	e8 b8 a0 fc ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
     10ab904:	49 89 c6             	mov    r14,rax
     10ab907:	bf 80 00 00 00       	mov    edi,0x80
     10ab90c:	e8 ef 25 74 00       	call   17edf00 <_Znwm@plt>
     10ab911:	48 89 c3             	mov    rbx,rax
     10ab914:	49 83 c6 10          	add    r14,0x10
     10ab918:	48 8d 05 99 59 78 00 	lea    rax,[rip+0x785999]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
     10ab91f:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
     10ab926:	00 
     10ab927:	49 89 00             	mov    QWORD PTR [r8],rax
     10ab92a:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     10ab92f:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
     10ab933:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
     10ab937:	41 0f b6 47 11       	movzx  eax,BYTE PTR [r15+0x11]
     10ab93c:	48 89 df             	mov    rdi,rbx
     10ab93f:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
     10ab944:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
     10ab949:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     10ab94e:	4c 8b 4c 24 48       	mov    r9,QWORD PTR [rsp+0x48]
     10ab953:	41 56                	push   r14
     10ab955:	41 55                	push   r13
     10ab957:	41 54                	push   r12
     10ab959:	50                   	push   rax
     10ab95a:	55                   	push   rbp
     10ab95b:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]

## Caller rsp+0xc0 writes before e8cc2b
### 0xe8c843: mov    QWORD PTR [rsp+0xc0],rax
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

## All rsp+0xc0 references before final +0x30 call
### 0xe8c843: mov    QWORD PTR [rsp+0xc0],rax
  e8c812:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
  e8c819:	00 
  e8c81a:	48 85 c0             	test   rax,rax
  e8c81d:	0f 84 7f 1a 00 00    	je     e8e2a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556b8>
  e8c823:	48 89 9c 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rbx
  e8c82a:	00 
  e8c82b:	4c 89 ef             	mov    rdi,r13
  e8c82e:	e8 8f 20 00 00       	call   e8e8c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55cd8>
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

## Direct producer bodies for rsp+0xc0
### 0xc05c6e FDE=('0xc05c6e', '0xc05c98')
  c05c6e:	53                   	push   rbx
  c05c6f:	48 89 fb             	mov    rbx,rdi
  c05c72:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  c05c76:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  c05c7a:	6a 11                	push   0x11
  c05c7c:	5a                   	pop    rdx
  c05c7d:	e8 5c c6 f5 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  c05c82:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  c05c85:	48 8b 80 88 00 00 00 	mov    rax,QWORD PTR [rax+0x88]
  c05c8c:	48 85 c0             	test   rax,rax
  c05c8f:	74 02                	je     c05c93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152c33>
  c05c91:	5b                   	pop    rbx
  c05c92:	c3                   	ret
  c05c93:	e8 27 43 e7 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>

## AP-like constants materialized in Restrictions factory
### candidate AP 0x18312b8
- +0x0: 0x9d7de0
- +0x8: 0xa50370
- +0x10: 0xe8eab8
- +0x18: 0xe8ead8
- +0x20: 0x9d7de0
- +0x28: 0xa50370
- +0x30: 0xb48808
- +0x38: NO_RELOC
- +0x40: NO_RELOC
- +0x48: 0xe8f66e
- +0x50: 0xe8f6a2
- +0x58: 0x9d7de0
- +0x60: 0x9d7de0
- +0x68: 0xe8f6b4
- +0x70: 0xca5c00
- +0x78: 0xe8f874
- +0x80: NO_RELOC
- +0x88: NO_RELOC

