# Skip Ad state virtual family

Corrected table interpretation:
- primary AP = 0x1841fc0
- fd381a at AP+0x70
- fd38d6 at AP+0x128
- fd4a92 at AP+0x1d8
- 0x1842150 is NOT a distinct AP; it is AP+0x190 within same contiguous table

## Aligned code fd47e6..fd4c04
      fd47e6:	41 56                	push   r14
      fd47e8:	53                   	push   rbx
      fd47e9:	50                   	push   rax
      fd47ea:	48 89 fb             	mov    rbx,rdi
      fd47ed:	48 8d 05 cc d7 86 00 	lea    rax,[rip+0x86d7cc]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
      fd47f4:	48 89 07             	mov    QWORD PTR [rdi],rax
      fd47f7:	4c 8d 77 08          	lea    r14,[rdi+0x8]
      fd47fb:	48 8d 05 ae d9 86 00 	lea    rax,[rip+0x86d9ae]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
      fd4802:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      fd4806:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
      fd480a:	e8 77 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd480f:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      fd4813:	e8 6e 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4818:	4c 89 f7             	mov    rdi,r14
      fd481b:	48 83 c4 08          	add    rsp,0x8
      fd481f:	5b                   	pop    rbx
      fd4820:	41 5e                	pop    r14
      fd4822:	e9 79 05 00 00       	jmp    fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
      fd4827:	cc                   	int3
      fd4828:	53                   	push   rbx
      fd4829:	48 89 fb             	mov    rbx,rdi
      fd482c:	e8 b5 ff ff ff       	call   fd47e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbfc>
      fd4831:	48 89 df             	mov    rdi,rbx
      fd4834:	5b                   	pop    rbx
      fd4835:	e9 e6 96 81 00       	jmp    17edf20 <_ZdlPv@plt>
      fd483a:	55                   	push   rbp
      fd483b:	41 57                	push   r15
      fd483d:	41 56                	push   r14
      fd483f:	41 55                	push   r13
      fd4841:	41 54                	push   r12
      fd4843:	53                   	push   rbx
      fd4844:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
      fd484b:	49 89 cd             	mov    r13,rcx
      fd484e:	89 d5                	mov    ebp,edx
      fd4850:	48 89 fb             	mov    rbx,rdi
      fd4853:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd485a:	00 00 
      fd485c:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      fd4863:	00 
      fd4864:	48 83 c6 10          	add    rsi,0x10
      fd4868:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      fd486d:	e8 e8 75 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      fd4872:	66 0f ef c0          	pxor   xmm0,xmm0
      fd4876:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
      fd487b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
      fd4880:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      fd4885:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
      fd488a:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      fd488f:	4c 89 e7             	mov    rdi,r12
      fd4892:	4c 89 fe             	mov    rsi,r15
      fd4895:	4c 89 f2             	mov    rdx,r14
      fd4898:	e8 bd 07 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fd489d:	40 0f b6 d5          	movzx  edx,bpl
      fd48a1:	48 8d ac 24 90 00 00 	lea    rbp,[rsp+0x90]
      fd48a8:	00 
      fd48a9:	48 89 ef             	mov    rdi,rbp
      fd48ac:	4c 89 e6             	mov    rsi,r12
      fd48af:	4c 89 e9             	mov    rcx,r13
      fd48b2:	e8 01 06 00 00       	call   fd4eb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c2ce>
      fd48b7:	4c 8d ac 24 a0 00 00 	lea    r13,[rsp+0xa0]
      fd48be:	00 
      fd48bf:	4c 89 ef             	mov    rdi,r13
      fd48c2:	48 89 ee             	mov    rsi,rbp
      fd48c5:	e8 f0 11 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
      fd48ca:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fd48cf:	4c 89 ee             	mov    rsi,r13
      fd48d2:	e8 7d 07 00 00       	call   fd5054 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c46a>
      fd48d7:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      fd48db:	e8 a6 9b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd48e0:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
      fd48e4:	e8 9d 9b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd48e9:	4c 89 e7             	mov    rdi,r12
      fd48ec:	e8 21 0a f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      fd48f1:	4c 89 f7             	mov    rdi,r14
      fd48f4:	e8 83 76 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd48f9:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      fd48fd:	e8 84 9b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4902:	48 89 df             	mov    rdi,rbx
      fd4905:	e8 8e 08 f4 ff       	call   f15198 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc5ae>
      fd490a:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
      fd490d:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
      fd4912:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
      fd4916:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
      fd491b:	4d 85 f6             	test   r14,r14
      fd491e:	74 0f                	je     fd492f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bd45>
      fd4920:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fd4925:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fd492a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fd492f:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      fd4934:	4d 85 ff             	test   r15,r15
      fd4937:	74 6a                	je     fd49a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bdb9>
      fd4939:	6a 20                	push   0x20
      fd493b:	5f                   	pop    rdi
      fd493c:	e8 bf 95 81 00       	call   17edf00 <_Znwm@plt>
      fd4941:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
      fd4945:	4c 89 70 18          	mov    QWORD PTR [rax+0x18],r14
      fd4949:	48 8d 0d d8 3b f5 ff 	lea    rcx,[rip+0xfffffffffff53bd8]        # f28528 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef93e>
      fd4950:	48 89 08             	mov    QWORD PTR [rax],rcx
      fd4953:	48 8d 0d 5e af b6 ff 	lea    rcx,[rip+0xffffffffffb6af5e]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
      fd495a:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      fd495e:	4c 89 ff             	mov    rdi,r15
      fd4961:	48 89 c6             	mov    rsi,rax
      fd4964:	e8 5b 4e ef ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
      fd4969:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fd496e:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
      fd4972:	66 0f ef c0          	pxor   xmm0,xmm0
      fd4976:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0
      fd497a:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
      fd497f:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0
      fd4985:	4c 89 ee             	mov    rsi,r13
      fd4988:	e8 8f 4e ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fd498d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      fd4991:	e8 f0 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4996:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
      fd499a:	76 15                	jbe    fd49b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bdc7>
      fd499c:	31 c0                	xor    eax,eax
      fd499e:	45 31 ff             	xor    r15d,r15d
      fd49a1:	eb 20                	jmp    fd49c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bdd9>
      fd49a3:	66 0f ef c0          	pxor   xmm0,xmm0
      fd49a7:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
      fd49ac:	4d 89 f7             	mov    r15,r14
      fd49af:	eb 37                	jmp    fd49e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bdfe>
      fd49b1:	4d 85 e4             	test   r12,r12
      fd49b4:	74 0b                	je     fd49c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bdd7>
      fd49b6:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fd49bc:	4c 89 e0             	mov    rax,r12
      fd49bf:	eb 02                	jmp    fd49c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bdd9>
      fd49c1:	31 c0                	xor    eax,eax
      fd49c3:	66 48 0f 6e c0       	movq   xmm0,rax
      fd49c8:	66 49 0f 6e cf       	movq   xmm1,r15
      fd49cd:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      fd49d1:	66 0f 7f 0c 24       	movdqa XMMWORD PTR [rsp],xmm1
      fd49d6:	45 31 ff             	xor    r15d,r15d
      fd49d9:	31 ff                	xor    edi,edi
      fd49db:	e8 a6 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd49e0:	4c 89 e7             	mov    rdi,r12
      fd49e3:	e8 9e 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd49e8:	4c 89 ff             	mov    rdi,r15
      fd49eb:	e8 c2 9a ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fd49f0:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
      fd49f5:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      fd49fa:	4c 89 ff             	mov    rdi,r15
      fd49fd:	e8 2e 69 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      fd4a02:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      fd4a05:	48 85 ff             	test   rdi,rdi
      fd4a08:	74 18                	je     fd4a22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19be38>
      fd4a0a:	48 83 c7 08          	add    rdi,0x8
      fd4a0e:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      fd4a13:	e8 1e a1 b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      fd4a18:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      fd4a1d:	e8 ae ff d4 ff       	call   d249d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271970>
      fd4a22:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      fd4a27:	e8 5a 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4a2c:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      fd4a31:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      fd4a38:	e8 49 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4a3d:	4c 89 f7             	mov    rdi,r14
      fd4a40:	e8 6d 9a ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fd4a45:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      fd4a4a:	e8 63 9a ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fd4a4f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fd4a54:	e8 2d 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4a59:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd4a60:	00 00 
      fd4a62:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
      fd4a69:	00 
      fd4a6a:	75 15                	jne    fd4a81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19be97>
      fd4a6c:	48 89 d8             	mov    rax,rbx
      fd4a6f:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
      fd4a76:	5b                   	pop    rbx
      fd4a77:	41 5c                	pop    r12
      fd4a79:	41 5d                	pop    r13
      fd4a7b:	41 5e                	pop    r14
      fd4a7d:	41 5f                	pop    r15
      fd4a7f:	5d                   	pop    rbp
      fd4a80:	c3                   	ret
      fd4a81:	e8 2a b0 81 00       	call   17efab0 <__stack_chk_fail@plt>
      fd4a86:	eb 02                	jmp    fd4a8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bea0>
      fd4a88:	eb 00                	jmp    fd4a8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bea0>
      fd4a8a:	48 89 c7             	mov    rdi,rax
      fd4a8d:	e8 13 50 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fd4a92:	41 57                	push   r15
      fd4a94:	41 56                	push   r14
      fd4a96:	41 55                	push   r13
      fd4a98:	41 54                	push   r12
      fd4a9a:	53                   	push   rbx
      fd4a9b:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
      fd4aa2:	48 89 fb             	mov    rbx,rdi
      fd4aa5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd4aac:	00 00 
      fd4aae:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
      fd4ab5:	00 
      fd4ab6:	48 83 c6 10          	add    rsi,0x10
      fd4aba:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      fd4abf:	e8 96 73 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      fd4ac4:	0f 57 c0             	xorps  xmm0,xmm0
      fd4ac7:	48 89 e2             	mov    rdx,rsp
      fd4aca:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      fd4acd:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      fd4ad2:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      fd4ad7:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      fd4adc:	4c 89 f7             	mov    rdi,r14
      fd4adf:	e8 76 05 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fd4ae4:	4c 8d bc 24 b8 00 00 	lea    r15,[rsp+0xb8]
      fd4aeb:	00 
      fd4aec:	6a 01                	push   0x1
      fd4aee:	5a                   	pop    rdx
      fd4aef:	4c 89 ff             	mov    rdi,r15
      fd4af2:	4c 89 f6             	mov    rsi,r14
      fd4af5:	e8 0a 01 00 00       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd4afa:	49 8b 37             	mov    rsi,QWORD PTR [r15]
      fd4afd:	80 7e 68 00          	cmp    BYTE PTR [rsi+0x68],0x0
      fd4b01:	74 04                	je     fd4b07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bf1d>
      fd4b03:	c6 46 68 00          	mov    BYTE PTR [rsi+0x68],0x0
      fd4b07:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      fd4b0c:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
      fd4b11:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      fd4b18:	00 
      fd4b19:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      fd4b1e:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      fd4b22:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      fd4b27:	0f 57 c0             	xorps  xmm0,xmm0
      fd4b2a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      fd4b2f:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
      fd4b34:	4c 8b ac 24 c0 00 00 	mov    r13,QWORD PTR [rsp+0xc0]
      fd4b3b:	00 
      fd4b3c:	4c 8d 7c 24 68       	lea    r15,[rsp+0x68]
      fd4b41:	4c 89 ff             	mov    rdi,r15
      fd4b44:	4c 89 ea             	mov    rdx,r13
      fd4b47:	4c 89 e1             	mov    rcx,r12
      fd4b4a:	e8 b5 06 f5 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>
      fd4b4f:	4c 89 e7             	mov    rdi,r12
      fd4b52:	e8 25 74 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd4b57:	4c 89 ef             	mov    rdi,r13
      fd4b5a:	e8 27 99 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4b5f:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      fd4b66:	00 
      fd4b67:	4c 89 e7             	mov    rdi,r12
      fd4b6a:	4c 89 fe             	mov    rsi,r15
      fd4b6d:	e8 8e 01 00 00       	call   fd4d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c116>
      fd4b72:	48 89 df             	mov    rdi,rbx
      fd4b75:	4c 89 e6             	mov    rsi,r12
      fd4b78:	e8 3d 0f f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
      fd4b7d:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fd4b82:	e8 ff 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4b87:	4c 89 ff             	mov    rdi,r15
      fd4b8a:	e8 83 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      fd4b8f:	4c 89 f7             	mov    rdi,r14
      fd4b92:	e8 7b 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      fd4b97:	48 89 e7             	mov    rdi,rsp
      fd4b9a:	e8 dd 73 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd4b9f:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      fd4ba4:	e8 dd 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4ba9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd4bb0:	00 00 
      fd4bb2:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
      fd4bb9:	00 
      fd4bba:	75 14                	jne    fd4bd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bfe6>
      fd4bbc:	48 89 d8             	mov    rax,rbx
      fd4bbf:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
      fd4bc6:	5b                   	pop    rbx
      fd4bc7:	41 5c                	pop    r12
      fd4bc9:	41 5d                	pop    r13
      fd4bcb:	41 5e                	pop    r14
      fd4bcd:	41 5f                	pop    r15
      fd4bcf:	c3                   	ret
      fd4bd0:	e8 db ae 81 00       	call   17efab0 <__stack_chk_fail@plt>
      fd4bd5:	48 89 c7             	mov    rdi,rax
      fd4bd8:	e8 c8 4e aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fd4bdd:	cc                   	int3
      fd4bde:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
      fd4be2:	e9 ff fb ff ff       	jmp    fd47e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbfc>
      fd4be7:	cc                   	int3
      fd4be8:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
      fd4bec:	e9 37 fc ff ff       	jmp    fd4828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bc3e>
      fd4bf1:	cc                   	int3
      fd4bf2:	53                   	push   rbx
      fd4bf3:	48 89 fb             	mov    rbx,rdi
      fd4bf6:	48 83 c6 f8          	add    rsi,0xfffffffffffffff8
      fd4bfa:	e8 93 fe ff ff       	call   fd4a92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bea8>
      fd4bff:	48 89 d8             	mov    rax,rbx
      fd4c02:	5b                   	pop    rbx
      fd4c03:	c3                   	ret

## Exact fd4a92 body
      fd4a92:	41 57                	push   r15
      fd4a94:	41 56                	push   r14
      fd4a96:	41 55                	push   r13
      fd4a98:	41 54                	push   r12
      fd4a9a:	53                   	push   rbx
      fd4a9b:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
      fd4aa2:	48 89 fb             	mov    rbx,rdi
      fd4aa5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd4aac:	00 00 
      fd4aae:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
      fd4ab5:	00 
      fd4ab6:	48 83 c6 10          	add    rsi,0x10
      fd4aba:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      fd4abf:	e8 96 73 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      fd4ac4:	0f 57 c0             	xorps  xmm0,xmm0
      fd4ac7:	48 89 e2             	mov    rdx,rsp
      fd4aca:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      fd4acd:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      fd4ad2:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      fd4ad7:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      fd4adc:	4c 89 f7             	mov    rdi,r14
      fd4adf:	e8 76 05 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fd4ae4:	4c 8d bc 24 b8 00 00 	lea    r15,[rsp+0xb8]
      fd4aeb:	00 
      fd4aec:	6a 01                	push   0x1
      fd4aee:	5a                   	pop    rdx
      fd4aef:	4c 89 ff             	mov    rdi,r15
      fd4af2:	4c 89 f6             	mov    rsi,r14
      fd4af5:	e8 0a 01 00 00       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd4afa:	49 8b 37             	mov    rsi,QWORD PTR [r15]
      fd4afd:	80 7e 68 00          	cmp    BYTE PTR [rsi+0x68],0x0
      fd4b01:	74 04                	je     fd4b07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bf1d>
      fd4b03:	c6 46 68 00          	mov    BYTE PTR [rsi+0x68],0x0
      fd4b07:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      fd4b0c:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
      fd4b11:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      fd4b18:	00 
      fd4b19:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      fd4b1e:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      fd4b22:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      fd4b27:	0f 57 c0             	xorps  xmm0,xmm0
      fd4b2a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      fd4b2f:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
      fd4b34:	4c 8b ac 24 c0 00 00 	mov    r13,QWORD PTR [rsp+0xc0]
      fd4b3b:	00 
      fd4b3c:	4c 8d 7c 24 68       	lea    r15,[rsp+0x68]
      fd4b41:	4c 89 ff             	mov    rdi,r15
      fd4b44:	4c 89 ea             	mov    rdx,r13
      fd4b47:	4c 89 e1             	mov    rcx,r12
      fd4b4a:	e8 b5 06 f5 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>
      fd4b4f:	4c 89 e7             	mov    rdi,r12
      fd4b52:	e8 25 74 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd4b57:	4c 89 ef             	mov    rdi,r13
      fd4b5a:	e8 27 99 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4b5f:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      fd4b66:	00 
      fd4b67:	4c 89 e7             	mov    rdi,r12
      fd4b6a:	4c 89 fe             	mov    rsi,r15
      fd4b6d:	e8 8e 01 00 00       	call   fd4d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c116>
      fd4b72:	48 89 df             	mov    rdi,rbx
      fd4b75:	4c 89 e6             	mov    rsi,r12
      fd4b78:	e8 3d 0f f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
      fd4b7d:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fd4b82:	e8 ff 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4b87:	4c 89 ff             	mov    rdi,r15
      fd4b8a:	e8 83 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      fd4b8f:	4c 89 f7             	mov    rdi,r14
      fd4b92:	e8 7b 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      fd4b97:	48 89 e7             	mov    rdi,rsp
      fd4b9a:	e8 dd 73 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd4b9f:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      fd4ba4:	e8 dd 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4ba9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd4bb0:	00 00 
      fd4bb2:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
      fd4bb9:	00 
      fd4bba:	75 14                	jne    fd4bd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bfe6>
      fd4bbc:	48 89 d8             	mov    rax,rbx
      fd4bbf:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
      fd4bc6:	5b                   	pop    rbx
      fd4bc7:	41 5c                	pop    r12
      fd4bc9:	41 5d                	pop    r13
      fd4bcb:	41 5e                	pop    r14
      fd4bcd:	41 5f                	pop    r15
      fd4bcf:	c3                   	ret

## this-relative field references in fd4a92
      fd4afd:	80 7e 68 00          	cmp    BYTE PTR [rsi+0x68],0x0
      fd4b03:	c6 46 68 00          	mov    BYTE PTR [rsi+0x68],0x0
      fd4b0c:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
      fd4b1e:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      fd4b2a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      fd4b2f:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0

## Primary table slice
- +0x0: 0xfaff70
- +0x8: 0xfb0002
- +0x10: 0xfb00aa
- +0x18: 0xfb0152
- +0x20: 0xfb01ea
- +0x28: 0xfb0282
- +0x30: 0xfb0312
- +0x38: 0xfb03a4
- +0x40: 0xfb043c
- +0x48: 0xfb04e6
- +0x50: 0xfb05dc
- +0x58: 0xfb0674
- +0x60: 0xfb08b0
- +0x68: 0xfb0948
- +0x70: 0xfd381a
- +0x78: 0xfb0792
- +0x80: 0xfb0708
- +0x88: 0xfb0826
- +0x90: 0xfb0a84
- +0x98: 0xfb296a
- +0xa0: 0xfb0c64
- +0xa8: 0xfb0da6
- +0xb0: 0xfb0ece
- +0xb8: 0xfb0fc6
- +0xc0: 0xfb10be
- +0xc8: 0xfb11b6
- +0xd0: 0xfb2a4c
- +0xd8: 0xfb2b60
- +0xe0: 0xfb2b7a
- +0xe8: 0xfb2c84
- +0xf0: 0xfb2c9a
- +0xf8: 0xfb2dae
- +0x100: 0xfb12ae
- +0x108: 0xfb13c0
- +0x110: 0xfb14a6
- +0x118: 0xfb1598
- +0x120: 0xfb16bc
- +0x128: 0xfd38d6
- +0x130: 0xfb1908
- +0x138: 0xfb1a2c
- +0x140: 0xfb1b50
- +0x148: 0xfd39bc
- +0x150: 0xfb0d90
- +0x158: 0xfb1fc0
- +0x160: 0xfb2062
- +0x168: 0xfb2104
- +0x170: 0xfb2584
- +0x178: 0xfb1de8
- +0x180: 0xfb1ece
- +0x188: 0xfb0c4e
- +0x190: 0xfd47e6
- +0x198: 0xfd4828
- +0x1a0: 0x9d7de0
- +0x1a8: 0x9d7de0
- +0x1b0: 0xfb290e
- +0x1b8: 0xfb290e
- +0x1c0: 0xb3d784
- +0x1c8: 0xfd483a
- +0x1d0: 0xf24bfe
- +0x1d8: 0xfd4a92
- +0x1f0: 0xfd4bde
- +0x1f8: 0xfd4be8

## Table header/break evidence around 0x1842140..0x18421c8
- 0x1842130: 0xfb2584
- 0x1842138: 0xfb1de8
- 0x1842140: 0xfb1ece
- 0x1842148: 0xfb0c4e
- 0x1842150: 0xfd47e6
- 0x1842158: 0xfd4828
- 0x1842160: 0x9d7de0
- 0x1842168: 0x9d7de0
- 0x1842170: 0xfb290e
- 0x1842178: 0xfb290e
- 0x1842180: 0xb3d784
- 0x1842188: 0xfd483a
- 0x1842190: 0xf24bfe
- 0x1842198: 0xfd4a92
- 0x18421a0: no RELATIVE relocation
- 0x18421a8: no RELATIVE relocation
- 0x18421b0: 0xfd4bde
- 0x18421b8: 0xfd4be8
- 0x18421c0: 0xfd4bf2
- 0x18421c8: no RELATIVE relocation
