# ad_skip readiness propagation: +0x1b8 -> player readiness state

Known anchor:
- subtype 6 writes adObject+0x1b8 = 1 at 0x10a968c
- 0x1352544 calls a service +0x28 and 0x1352547 reads [returned+0x1b8]
- that byte is saved to [rsp+0xe]

## b85f7e accessor FDE=(12083070, 12083109)
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

## Direct callers of b85f7e
### 0xb8560f; FDE=(12080612, 12083069)
      b855df:	6a 01                	push   0x1
      b855e1:	5a                   	pop    rdx
      b855e2:	c3                   	ret
      b855e3:	cc                   	int3
      b855e4:	55                   	push   rbp
      b855e5:	41 57                	push   r15
      b855e7:	41 56                	push   r14
      b855e9:	41 55                	push   r13
      b855eb:	41 54                	push   r12
      b855ed:	53                   	push   rbx
      b855ee:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
      b855f5:	48 89 d3             	mov    rbx,rdx
      b855f8:	49 89 fe             	mov    r14,rdi
      b855fb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b85602:	00 00 
      b85604:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      b8560b:	00 
      b8560c:	48 89 cf             	mov    rdi,rcx
      b8560f:	e8 6a 09 00 00       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
      b85614:	49 89 c4             	mov    r12,rax
      b85617:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
      b8561b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      b85620:	4c 8b bb 38 01 00 00 	mov    r15,QWORD PTR [rbx+0x138]
      b85627:	6a 18                	push   0x18
      b85629:	5f                   	pop    rdi
      b8562a:	e8 d1 88 c6 00       	call   17edf00 <_Znwm@plt>
      b8562f:	48 89 c3             	mov    rbx,rax
      b85632:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      b85636:	48 8d 05 d3 85 c8 00 	lea    rax,[rip+0xc885d3]        # 180dc10 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x38d0>
      b8563d:	48 89 03             	mov    QWORD PTR [rbx],rax
      b85640:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b85644:	4c 89 e7             	mov    rdi,r12
      b85647:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b8564a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b8564f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b85653:	4c 89 e7             	mov    rdi,r12
      b85656:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b85659:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b8565d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b85661:	4c 89 e7             	mov    rdi,r12
      b85664:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b85667:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b8566c:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b85670:	4c 89 e7             	mov    rdi,r12
      b85673:	ff 50 28             	call   QWORD PTR [rax+0x28]

### 0xe8c6c4; FDE=(15255132, 15263896)
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

### 0x1050f81; FDE=(17108806, 17109712)
     1050f46:	55                   	push   rbp
     1050f47:	41 57                	push   r15
     1050f49:	41 56                	push   r14
     1050f4b:	41 55                	push   r13
     1050f4d:	41 54                	push   r12
     1050f4f:	53                   	push   rbx
     1050f50:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     1050f57:	49 89 ce             	mov    r14,rcx
     1050f5a:	48 89 d3             	mov    rbx,rdx
     1050f5d:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     1050f62:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1050f69:	00 00 
     1050f6b:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     1050f72:	00 
     1050f73:	48 89 cf             	mov    rdi,rcx
     1050f76:	e8 19 70 b3 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
     1050f7b:	49 89 c7             	mov    r15,rax
     1050f7e:	4c 89 f7             	mov    rdi,r14
     1050f81:	e8 f8 4f b3 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     1050f86:	49 89 c4             	mov    r12,rax
     1050f89:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1050f8c:	4c 89 ff             	mov    rdi,r15
     1050f8f:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1050f92:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1050f97:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1050f9a:	4c 89 ff             	mov    rdi,r15
     1050f9d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1050fa0:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1050fa5:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1050fa8:	4c 89 ff             	mov    rdi,r15
     1050fab:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1050fae:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1050fb3:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1050fb7:	4c 89 e7             	mov    rdi,r12
     1050fba:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1050fbd:	49 89 c4             	mov    r12,rax
     1050fc0:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     1050fc4:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
     1050fcb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1050fd0:	6a 18                	push   0x18
     1050fd2:	5f                   	pop    rdi
     1050fd3:	e8 28 cf 79 00       	call   17edf00 <_Znwm@plt>
     1050fd8:	49 89 c7             	mov    r15,rax
     1050fdb:	48 89 c3             	mov    rbx,rax
     1050fde:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]

### 0x10a57dd; FDE=(17454986, 17456429)
     10a5794:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
     10a579b:	49 89 cf             	mov    r15,rcx
     10a579e:	49 89 d6             	mov    r14,rdx
     10a57a1:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
     10a57a6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a57ad:	00 00 
     10a57af:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     10a57b6:	00 
     10a57b7:	48 89 cf             	mov    rdi,rcx
     10a57ba:	e8 55 28 ae ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
     10a57bf:	48 89 c3             	mov    rbx,rax
     10a57c2:	4c 89 ff             	mov    rdi,r15
     10a57c5:	e8 00 f8 b8 ff       	call   c34fca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181f6a>
     10a57ca:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     10a57cf:	4c 89 ff             	mov    rdi,r15
     10a57d2:	e8 57 05 00 00       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
     10a57d7:	49 89 c5             	mov    r13,rax
     10a57da:	4c 89 ff             	mov    rdi,r15
     10a57dd:	e8 9c 07 ae ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     10a57e2:	49 89 c4             	mov    r12,rax
     10a57e5:	4c 89 ff             	mov    rdi,r15
     10a57e8:	e8 a1 14 c1 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     10a57ed:	49 89 c7             	mov    r15,rax
     10a57f0:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     10a57f4:	4c 89 ef             	mov    rdi,r13
     10a57f7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10a57fa:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     10a57ff:	49 8b 6e 60          	mov    rbp,QWORD PTR [r14+0x60]
     10a5803:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
     10a580a:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     10a580f:	6a 40                	push   0x40
     10a5811:	5f                   	pop    rdi
     10a5812:	e8 e9 86 74 00       	call   17edf00 <_Znwm@plt>
     10a5817:	49 89 c5             	mov    r13,rax
     10a581a:	45 8a 77 11          	mov    r14b,BYTE PTR [r15+0x11]
     10a581e:	49 8b 8f 0c 01 00 00 	mov    rcx,QWORD PTR [r15+0x10c]
     10a5825:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
     10a582a:	49 89 c7             	mov    r15,rax
     10a582d:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     10a5831:	48 8d 05 b0 6e 7a 00 	lea    rax,[rip+0x7a6eb0]        # 184c6e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8dd0>
     10a5838:	49 89 07             	mov    QWORD PTR [r15],rax
     10a583b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10a583e:	48 89 df             	mov    rdi,rbx
     10a5841:	ff 50 30             	call   QWORD PTR [rax+0x30]
     10a5844:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax

### 0x11ee805; FDE=(18802184, 18804775)
     11ee7ba:	00 
     11ee7bb:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee7bf:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee7c3:	ba c2 00 00 00       	mov    edx,0xc2
     11ee7c8:	e8 11 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee7cd:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee7d0:	48 8b 80 10 06 00 00 	mov    rax,QWORD PTR [rax+0x610]
     11ee7d7:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     11ee7de:	00 
     11ee7df:	48 85 c0             	test   rax,rax
     11ee7e2:	0f 84 4b 07 00 00    	je     11eef33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344b7>
     11ee7e8:	48 89 df             	mov    rdi,rbx
     11ee7eb:	e8 6a d1 c8 ff       	call   e7b95a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42d70>
     11ee7f0:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee7f5:	48 89 df             	mov    rdi,rbx
     11ee7f8:	e8 1f 8d ac ff       	call   cb751c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044bc>
     11ee7fd:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee802:	48 89 df             	mov    rdi,rbx
     11ee805:	e8 74 77 99 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     11ee80a:	49 89 c6             	mov    r14,rax
     11ee80d:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee811:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee815:	6a 7a                	push   0x7a
     11ee817:	5a                   	pop    rdx
     11ee818:	e8 c1 3a 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee81d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee820:	48 8b 80 d0 03 00 00 	mov    rax,QWORD PTR [rax+0x3d0]
     11ee827:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11ee82c:	48 85 c0             	test   rax,rax
     11ee82f:	0f 84 03 07 00 00    	je     11eef38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344bc>
     11ee835:	4c 89 a4 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r12
     11ee83c:	00 
     11ee83d:	4c 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r15
     11ee844:	00 
     11ee845:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee849:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee84d:	6a 7a                	push   0x7a
     11ee84f:	5a                   	pop    rdx
     11ee850:	e8 89 3a 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee858:	48 8b 80 d0 03 00 00 	mov    rax,QWORD PTR [rax+0x3d0]
     11ee85f:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     11ee866:	00 
     11ee867:	48 85 c0             	test   rax,rax
     11ee86a:	0f 84 cd 06 00 00    	je     11eef3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344c1>

### 0x13524d7; FDE=(20260004, 20264020)
     13524a2:	c3                   	ret
     13524a3:	cc                   	int3
     13524a4:	55                   	push   rbp
     13524a5:	41 57                	push   r15
     13524a7:	41 56                	push   r14
     13524a9:	41 55                	push   r13
     13524ab:	41 54                	push   r12
     13524ad:	53                   	push   rbx
     13524ae:	48 81 ec 98 01 00 00 	sub    rsp,0x198
     13524b5:	49 89 ce             	mov    r14,rcx
     13524b8:	48 89 d3             	mov    rbx,rdx
     13524bb:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     13524c2:	00 
     13524c3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13524ca:	00 00 
     13524cc:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
     13524d3:	00 
     13524d4:	48 89 cf             	mov    rdi,rcx
     13524d7:	e8 a2 3a 83 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     13524dc:	49 89 c4             	mov    r12,rax
     13524df:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     13524e3:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
     13524e7:	ba 89 00 00 00       	mov    edx,0x89
     13524ec:	e8 ed fd 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     13524f1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13524f4:	4c 8b a8 48 04 00 00 	mov    r13,QWORD PTR [rax+0x448]
     13524fb:	4d 85 ed             	test   r13,r13
     13524fe:	0f 84 ee 0c 00 00    	je     13531f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198776>
     1352504:	4c 89 f7             	mov    rdi,r14
     1352507:	e8 94 0d 81 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     135250c:	49 89 c7             	mov    r15,rax
     135250f:	4c 89 f7             	mov    rdi,r14
     1352512:	e8 77 47 96 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     1352517:	8a 88 88 00 00 00    	mov    cl,BYTE PTR [rax+0x88]
     135251d:	88 4c 24 28          	mov    BYTE PTR [rsp+0x28],cl
     1352521:	8a 88 89 00 00 00    	mov    cl,BYTE PTR [rax+0x89]
     1352527:	88 4c 24 0f          	mov    BYTE PTR [rsp+0xf],cl
     135252b:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
     1352530:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
     1352534:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
     1352541:	4c 89 e7             	mov    rdi,r12
     1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]

### 0x135a77f; FDE=(20293452, 20300282)
     135a74a:	c3                   	ret
     135a74b:	cc                   	int3
     135a74c:	55                   	push   rbp
     135a74d:	41 57                	push   r15
     135a74f:	41 56                	push   r14
     135a751:	41 55                	push   r13
     135a753:	41 54                	push   r12
     135a755:	53                   	push   rbx
     135a756:	48 81 ec 18 0d 00 00 	sub    rsp,0xd18
     135a75d:	48 89 cb             	mov    rbx,rcx
     135a760:	49 89 d4             	mov    r12,rdx
     135a763:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     135a76a:	00 
     135a76b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135a772:	00 00 
     135a774:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
     135a77b:	00 
     135a77c:	48 89 cf             	mov    rdi,rcx
     135a77f:	e8 fa b7 82 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     135a784:	49 89 c6             	mov    r14,rax
     135a787:	48 89 df             	mov    rdi,rbx
     135a78a:	e8 11 8b 80 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     135a78f:	49 8b 4c 24 20       	mov    rcx,QWORD PTR [r12+0x20]
     135a794:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
     135a799:	4d 8b 7c 24 68       	mov    r15,QWORD PTR [r12+0x68]
     135a79e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     135a7a1:	48 89 c7             	mov    rdi,rax
     135a7a4:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     135a7a7:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     135a7ac:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
     135a7b1:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     135a7b6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     135a7bd:	00 
     135a7be:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     135a7c5:	00 
     135a7c6:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
     135a7cd:	00 
     135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
     135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0

### 0x144e04d; FDE=(21291026, 21291578)
     144e012:	55                   	push   rbp
     144e013:	41 57                	push   r15
     144e015:	41 56                	push   r14
     144e017:	41 55                	push   r13
     144e019:	41 54                	push   r12
     144e01b:	53                   	push   rbx
     144e01c:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     144e023:	49 89 cf             	mov    r15,rcx
     144e026:	49 89 d6             	mov    r14,rdx
     144e029:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     144e02e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     144e035:	00 00 
     144e037:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     144e03e:	00 
     144e03f:	48 89 cf             	mov    rdi,rcx
     144e042:	e8 47 8c 86 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     144e047:	49 89 c4             	mov    r12,rax
     144e04a:	4c 89 ff             	mov    rdi,r15
     144e04d:	e8 2c 7f 73 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     144e052:	49 89 c5             	mov    r13,rax
     144e055:	4c 89 ff             	mov    rdi,r15
     144e058:	e8 11 7c 7b ff       	call   c05c6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152c0e>
     144e05d:	49 89 c7             	mov    r15,rax
     144e060:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
     144e064:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     144e069:	49 8b 86 90 00 00 00 	mov    rax,QWORD PTR [r14+0x90]
     144e070:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     144e075:	f2 41 0f 10 44 24 18 	movsd  xmm0,QWORD PTR [r12+0x18]
     144e07c:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     144e081:	49 8b 84 24 90 00 00 	mov    rax,QWORD PTR [r12+0x90]
     144e088:	00 
     144e089:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     144e08e:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     144e092:	4c 89 ef             	mov    rdi,r13
     144e095:	ff 50 28             	call   QWORD PTR [rax+0x28]
     144e098:	44 8a a8 b8 01 00 00 	mov    r13b,BYTE PTR [rax+0x1b8]
     144e09f:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     144e0a3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     144e0a6:	48 8d 35 b2 79 fe fe 	lea    rsi,[rip+0xfffffffffefe79b2]        # 435a5f <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ae>
     144e0ad:	48 8d 0d bc 79 fe fe 	lea    rcx,[rip+0xfffffffffefe79bc]        # 435a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4bf>
     144e0b4:	6a 08                	push   0x8
     144e0b6:	41 5c                	pop    r12
     144e0b8:	6a 16                	push   0x16
     144e0ba:	41 58                	pop    r8
     144e0bc:	4c 89 e2             	mov    rdx,r12

## Factory containing +0x1b8 read; FDE=(20260004, 20264020)
     13524a4:	55                   	push   rbp
     13524a5:	41 57                	push   r15
     13524a7:	41 56                	push   r14
     13524a9:	41 55                	push   r13
     13524ab:	41 54                	push   r12
     13524ad:	53                   	push   rbx
     13524ae:	48 81 ec 98 01 00 00 	sub    rsp,0x198
     13524b5:	49 89 ce             	mov    r14,rcx
     13524b8:	48 89 d3             	mov    rbx,rdx
     13524bb:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     13524c2:	00 
     13524c3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13524ca:	00 00 
     13524cc:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
     13524d3:	00 
     13524d4:	48 89 cf             	mov    rdi,rcx
     13524d7:	e8 a2 3a 83 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     13524dc:	49 89 c4             	mov    r12,rax
     13524df:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     13524e3:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
     13524e7:	ba 89 00 00 00       	mov    edx,0x89
     13524ec:	e8 ed fd 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     13524f1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13524f4:	4c 8b a8 48 04 00 00 	mov    r13,QWORD PTR [rax+0x448]
     13524fb:	4d 85 ed             	test   r13,r13
     13524fe:	0f 84 ee 0c 00 00    	je     13531f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198776>
     1352504:	4c 89 f7             	mov    rdi,r14
     1352507:	e8 94 0d 81 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     135250c:	49 89 c7             	mov    r15,rax
     135250f:	4c 89 f7             	mov    rdi,r14
     1352512:	e8 77 47 96 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     1352517:	8a 88 88 00 00 00    	mov    cl,BYTE PTR [rax+0x88]
     135251d:	88 4c 24 28          	mov    BYTE PTR [rsp+0x28],cl
     1352521:	8a 88 89 00 00 00    	mov    cl,BYTE PTR [rax+0x89]
     1352527:	88 4c 24 0f          	mov    BYTE PTR [rsp+0xf],cl
     135252b:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
     1352530:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
     1352534:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
     1352541:	4c 89 e7             	mov    rdi,r12
     1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
     135254d:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
     1352551:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
     1352558:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135255d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1352560:	4c 89 ff             	mov    rdi,r15
     1352563:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1352566:	49 89 c7             	mov    r15,rax
     1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     135256d:	6a 60                	push   0x60
     135256f:	5f                   	pop    rdi
     1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>
     1352575:	48 89 c3             	mov    rbx,rax
     1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
     1352586:	66 0f ef c0          	pxor   xmm0,xmm0
     135258a:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     135258f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     1352594:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     1352599:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     135259e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     13525a3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525a7:	48 8d 35 19 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a819]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     13525ae:	48 8d 0d 1b a8 08 ff 	lea    rcx,[rip+0xffffffffff08a81b]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     13525b5:	6a 08                	push   0x8
     13525b7:	41 5e                	pop    r14
     13525b9:	6a 24                	push   0x24
     13525bb:	41 58                	pop    r8
     13525bd:	4c 89 f2             	mov    rdx,r14
     13525c0:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     13525c6:	68 10 27 00 00       	push   0x2710
     13525cb:	6a 64                	push   0x64
     13525cd:	e8 20 50 29 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     13525d2:	48 83 c4 10          	add    rsp,0x10
     13525d6:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525da:	48 8d 35 14 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a814]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
     13525e1:	48 8d 0d 18 a8 08 ff 	lea    rcx,[rip+0xffffffffff08a818]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
     13525e8:	6a 18                	push   0x18
     13525ea:	41 58                	pop    r8
     13525ec:	6a 0a                	push   0xa
     13525ee:	41 59                	pop    r9
     13525f0:	4c 89 f2             	mov    rdx,r14
     13525f3:	6a 0a                	push   0xa
     13525f5:	6a 01                	push   0x1
     13525f7:	e8 f6 4f 29 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     13525fc:	58                   	pop    rax
     13525fd:	59                   	pop    rcx
     13525fe:	40 84 ed             	test   bpl,bpl
     1352601:	0f 84 b7 0b 00 00    	je     13531be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198742>
     1352607:	48 8d 43 10          	lea    rax,[rbx+0x10]
     135260b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1352610:	48 8d 43 18          	lea    rax,[rbx+0x18]
     1352614:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     1352619:	48 8d 43 20          	lea    rax,[rbx+0x20]
     135261d:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1352622:	48 8d 43 28          	lea    rax,[rbx+0x28]
     1352626:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135262b:	48 8d 43 30          	lea    rax,[rbx+0x30]
     135262f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1352634:	48 8d 43 38          	lea    rax,[rbx+0x38]
     1352638:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     135263d:	48 8d 43 40          	lea    rax,[rbx+0x40]
     1352641:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1352646:	48 8d 43 48          	lea    rax,[rbx+0x48]
     135264a:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     135264f:	48 89 d8             	mov    rax,rbx
     1352652:	48 83 c0 50          	add    rax,0x50
     1352656:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     135265b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     135265f:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     1352666:	00 
     1352667:	4c 89 e6             	mov    rsi,r12
     135266a:	ff 50 58             	call   QWORD PTR [rax+0x58]
     135266d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1352671:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352678:	00 
     1352679:	4c 89 e6             	mov    rsi,r12
     135267c:	ff 50 60             	call   QWORD PTR [rax+0x60]
     135267f:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
     1352684:	6a 18                	push   0x18
     1352686:	5f                   	pop    rdi
     1352687:	e8 74 b8 49 00       	call   17edf00 <_Znwm@plt>
     135268c:	49 89 c6             	mov    r14,rax
     135268f:	48 8d 05 22 4d 51 00 	lea    rax,[rip+0x514d22]        # 18673b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23aa0>
     1352696:	49 89 06             	mov    QWORD PTR [r14],rax
     1352699:	48 8b bc 24 50 01 00 	mov    rdi,QWORD PTR [rsp+0x150]
     13526a0:	00 
     13526a1:	49 89 7e 08          	mov    QWORD PTR [r14+0x8],rdi
     13526a5:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
     13526ac:	00 
     13526ad:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     13526b1:	48 85 c0             	test   rax,rax
     13526b4:	74 05                	je     13526bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197c3f>
     13526b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     13526bb:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     13526c2:	00 
     13526c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13526c6:	6a 01                	push   0x1
     13526c8:	5e                   	pop    rsi
     13526c9:	ff 50 50             	call   QWORD PTR [rax+0x50]
     13526cc:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]
     13526d3:	00 
     13526d4:	49 83 27 00          	and    QWORD PTR [r15],0x0
     13526d8:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     13526dd:	4c 89 f6             	mov    rsi,r14
     13526e0:	e8 cd 29 dd ff       	call   11250b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec4c8>
     13526e5:	4c 89 ff             	mov    rdi,r15
     13526e8:	e8 55 29 dd ff       	call   1125042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec458>
     13526ed:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     13526f4:	00 
     13526f5:	e8 8c bd 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13526fa:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     13526fe:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     1352702:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
     1352707:	0f 84 fd 01 00 00    	je     135290a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e8e>
     135270d:	4c 89 e7             	mov    rdi,r12
     1352710:	ff d0                	call   rax
     1352712:	49 89 c6             	mov    r14,rax
     1352715:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1352719:	48 8d 35 a7 a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6a7]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     1352720:	48 8d 0d a9 a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6a9]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     1352727:	6a 08                	push   0x8
     1352729:	41 5f                	pop    r15
     135272b:	6a 24                	push   0x24
     135272d:	41 58                	pop    r8
     135272f:	4c 89 fa             	mov    rdx,r15
     1352732:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     1352738:	e8 ed 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     135273d:	89 c5                	mov    ebp,eax
     135273f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1352743:	48 8d 35 ab a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6ab]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
     135274a:	48 8d 0d af a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6af]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
     1352751:	6a 18                	push   0x18
     1352753:	41 58                	pop    r8
     1352755:	6a 0a                	push   0xa
     1352757:	41 59                	pop    r9
     1352759:	4c 89 fa             	mov    rdx,r15
     135275c:	e8 c9 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     1352761:	41 89 c5             	mov    r13d,eax
     1352764:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1352768:	4c 89 e7             	mov    rdi,r12
     135276b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135276e:	49 89 c7             	mov    r15,rax
     1352771:	bf 90 00 00 00       	mov    edi,0x90
     1352776:	e8 85 b7 49 00       	call   17edf00 <_Znwm@plt>
     135277b:	48 63 cd             	movsxd rcx,ebp
     135277e:	49 63 d5             	movsxd rdx,r13d
     1352781:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352784:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
     1352788:	48 89 50 10          	mov    QWORD PTR [rax+0x10],rdx
     135278c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352791:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     1352795:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
     135279c:	41 0f 28 86 d0 01 00 	movaps xmm0,XMMWORD PTR [r14+0x1d0]
     13527a3:	00 
     13527a4:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     13527a8:	48 85 c9             	test   rcx,rcx
     13527ab:	74 05                	je     13527b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d36>
     13527ad:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     13527b2:	49 8b 8f c8 01 00 00 	mov    rcx,QWORD PTR [r15+0x1c8]
     13527b9:	66 41 0f 6f 87 c0 01 	movdqa xmm0,XMMWORD PTR [r15+0x1c0]
     13527c0:	00 00 
     13527c2:	f3 0f 7f 40 30       	movdqu XMMWORD PTR [rax+0x30],xmm0
     13527c7:	48 85 c9             	test   rcx,rcx
     13527ca:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
     13527cf:	74 05                	je     13527d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d5a>
     13527d1:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     13527d6:	66 0f ef c0          	pxor   xmm0,xmm0
     13527da:	f3 0f 7f 40 50       	movdqu XMMWORD PTR [rax+0x50],xmm0
     13527df:	f3 0f 7f 40 40       	movdqu XMMWORD PTR [rax+0x40],xmm0
     13527e4:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     13527eb:	31 c9                	xor    ecx,ecx
     13527ed:	88 48 68             	mov    BYTE PTR [rax+0x68],cl
     13527f0:	88 88 80 00 00 00    	mov    BYTE PTR [rax+0x80],cl
     13527f6:	88 88 88 00 00 00    	mov    BYTE PTR [rax+0x88],cl
     13527fc:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1352803:	00 
     1352804:	49 83 27 00          	and    QWORD PTR [r15],0x0
     1352808:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
     135280d:	4c 89 e7             	mov    rdi,r12
     1352810:	48 89 c6             	mov    rsi,rax
     1352813:	e8 3c 0c 00 00       	call   1353454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d8>
     1352818:	4c 89 ff             	mov    rdi,r15
     135281b:	e8 aa 0c 00 00       	call   13534ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a4e>
     1352820:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
     1352824:	6a 10                	push   0x10
     1352826:	5f                   	pop    rdi
     1352827:	e8 d4 b6 49 00       	call   17edf00 <_Znwm@plt>
     135282c:	48 8d 0d c5 50 51 00 	lea    rcx,[rip+0x5150c5]        # 18678f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23fe0>
     1352833:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352836:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
     135283a:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     135283f:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352842:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352845:	48 85 ff             	test   rdi,rdi
     1352848:	74 06                	je     1352850 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197dd4>
     135284a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135284d:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352850:	6a 38                	push   0x38
     1352852:	5f                   	pop    rdi
     1352853:	e8 a8 b6 49 00       	call   17edf00 <_Znwm@plt>
     1352858:	48 8d 0d 11 50 51 00 	lea    rcx,[rip+0x515011]        # 1867870 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23f58>
     135285f:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352862:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
     1352869:	66 41 0f 6f 86 d0 01 	movdqa xmm0,XMMWORD PTR [r14+0x1d0]
     1352870:	00 00 
     1352872:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     1352877:	48 85 c9             	test   rcx,rcx
     135287a:	74 05                	je     1352881 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e05>
     135287c:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352881:	66 0f ef c0          	pxor   xmm0,xmm0
     1352885:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     135288a:	48 83 60 28 00       	and    QWORD PTR [rax+0x28],0x0
     135288f:	c6 40 30 01          	mov    BYTE PTR [rax+0x30],0x1
     1352893:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]
     135289a:	00 
     135289b:	49 83 26 00          	and    QWORD PTR [r14],0x0
     135289f:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     13528a4:	48 89 c6             	mov    rsi,rax
     13528a7:	e8 26 0c 00 00       	call   13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
     13528ac:	4c 89 f7             	mov    rdi,r14
     13528af:	e8 3e 0c 00 00       	call   13534f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a76>
     13528b4:	80 7c 24 28 00       	cmp    BYTE PTR [rsp+0x28],0x0
     13528b9:	0f 84 a9 00 00 00    	je     1352968 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197eec>
     13528bf:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13528c6:	00 
     13528c7:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     13528cc:	e8 43 68 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
     13528d1:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     13528d8:	00 
     13528d9:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     13528e0:	00 00 
     13528e2:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     13528e7:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     13528ea:	48 89 01             	mov    QWORD PTR [rcx],rax
     13528ed:	48 85 ff             	test   rdi,rdi
     13528f0:	74 06                	je     13528f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e7c>
     13528f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13528f5:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13528f8:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13528ff:	00 

## All reads/writes of stack byte [rsp+0xe] in containing FDE
### WRITE 0x135254d: mov    BYTE PTR [rsp+0xe],al
     13524f4:	4c 8b a8 48 04 00 00 	mov    r13,QWORD PTR [rax+0x448]
     13524fb:	4d 85 ed             	test   r13,r13
     13524fe:	0f 84 ee 0c 00 00    	je     13531f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198776>
     1352504:	4c 89 f7             	mov    rdi,r14
     1352507:	e8 94 0d 81 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     135250c:	49 89 c7             	mov    r15,rax
     135250f:	4c 89 f7             	mov    rdi,r14
     1352512:	e8 77 47 96 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     1352517:	8a 88 88 00 00 00    	mov    cl,BYTE PTR [rax+0x88]
     135251d:	88 4c 24 28          	mov    BYTE PTR [rsp+0x28],cl
     1352521:	8a 88 89 00 00 00    	mov    cl,BYTE PTR [rax+0x89]
     1352527:	88 4c 24 0f          	mov    BYTE PTR [rsp+0xf],cl
     135252b:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
     1352530:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
     1352534:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
     1352541:	4c 89 e7             	mov    rdi,r12
     1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
     135254d:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
     1352551:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
     1352558:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135255d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1352560:	4c 89 ff             	mov    rdi,r15
     1352563:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1352566:	49 89 c7             	mov    r15,rax
     1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     135256d:	6a 60                	push   0x60
     135256f:	5f                   	pop    rdi
     1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>
     1352575:	48 89 c3             	mov    rbx,rax
     1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
     1352586:	66 0f ef c0          	pxor   xmm0,xmm0
     135258a:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     135258f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     1352594:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     1352599:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     135259e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     13525a3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525a7:	48 8d 35 19 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a819]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     13525ae:	48 8d 0d 1b a8 08 ff 	lea    rcx,[rip+0xffffffffff08a81b]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     13525b5:	6a 08                	push   0x8
     13525b7:	41 5e                	pop    r14
     13525b9:	6a 24                	push   0x24
     13525bb:	41 58                	pop    r8
     13525bd:	4c 89 f2             	mov    rdx,r14
     13525c0:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     13525c6:	68 10 27 00 00       	push   0x2710
     13525cb:	6a 64                	push   0x64
     13525cd:	e8 20 50 29 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     13525d2:	48 83 c4 10          	add    rsp,0x10
     13525d6:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]

### WRITE 0x1352702: cmp    BYTE PTR [rsp+0xe],0x0
     13526b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     13526bb:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     13526c2:	00 
     13526c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13526c6:	6a 01                	push   0x1
     13526c8:	5e                   	pop    rsi
     13526c9:	ff 50 50             	call   QWORD PTR [rax+0x50]
     13526cc:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]
     13526d3:	00 
     13526d4:	49 83 27 00          	and    QWORD PTR [r15],0x0
     13526d8:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     13526dd:	4c 89 f6             	mov    rsi,r14
     13526e0:	e8 cd 29 dd ff       	call   11250b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec4c8>
     13526e5:	4c 89 ff             	mov    rdi,r15
     13526e8:	e8 55 29 dd ff       	call   1125042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec458>
     13526ed:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     13526f4:	00 
     13526f5:	e8 8c bd 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13526fa:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     13526fe:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     1352702:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
     1352707:	0f 84 fd 01 00 00    	je     135290a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e8e>
     135270d:	4c 89 e7             	mov    rdi,r12
     1352710:	ff d0                	call   rax
     1352712:	49 89 c6             	mov    r14,rax
     1352715:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1352719:	48 8d 35 a7 a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6a7]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     1352720:	48 8d 0d a9 a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6a9]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     1352727:	6a 08                	push   0x8
     1352729:	41 5f                	pop    r15
     135272b:	6a 24                	push   0x24
     135272d:	41 58                	pop    r8
     135272f:	4c 89 fa             	mov    rdx,r15
     1352732:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     1352738:	e8 ed 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     135273d:	89 c5                	mov    ebp,eax
     135273f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1352743:	48 8d 35 ab a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6ab]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
     135274a:	48 8d 0d af a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6af]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
     1352751:	6a 18                	push   0x18
     1352753:	41 58                	pop    r8
     1352755:	6a 0a                	push   0xa
     1352757:	41 59                	pop    r9
     1352759:	4c 89 fa             	mov    rdx,r15
     135275c:	e8 c9 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     1352761:	41 89 c5             	mov    r13d,eax
     1352764:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1352768:	4c 89 e7             	mov    rdi,r12
     135276b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135276e:	49 89 c7             	mov    r15,rax
     1352771:	bf 90 00 00 00       	mov    edi,0x90
     1352776:	e8 85 b7 49 00       	call   17edf00 <_Znwm@plt>
     135277b:	48 63 cd             	movsxd rcx,ebp
     135277e:	49 63 d5             	movsxd rdx,r13d
     1352781:	48 89 08             	mov    QWORD PTR [rax],rcx

### WRITE 0x1352d48: cmp    BYTE PTR [rsp+0xe],0x0
     1352d02:	00 
     1352d03:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
     1352d0a:	00 00 
     1352d0c:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     1352d11:	48 85 c9             	test   rcx,rcx
     1352d14:	74 05                	je     1352d1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19829f>
     1352d16:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352d1b:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352d20:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352d23:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352d26:	48 85 ff             	test   rdi,rdi
     1352d29:	74 06                	je     1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352d2b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352d2e:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352d31:	48 8d 35 8c a0 08 ff 	lea    rsi,[rip+0xffffffffff08a08c]        # 3dcdc4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2813>
     1352d38:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d3f:	00 
     1352d40:	6a 02                	push   0x2
     1352d42:	5a                   	pop    rdx
     1352d43:	e8 e4 6c d5 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     1352d48:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
     1352d4d:	74 6d                	je     1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
     1352d4f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d56:	00 
     1352d57:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1352d5e:	00 
     1352d5f:	6a 04                	push   0x4
     1352d61:	5a                   	pop    rdx
     1352d62:	e8 3d 6e d5 ff       	call   10a9ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270fba>
     1352d67:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     1352d6b:	75 4f                	jne    1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
     1352d6d:	49 89 c6             	mov    r14,rax
     1352d70:	6a 20                	push   0x20
     1352d72:	5f                   	pop    rdi
     1352d73:	e8 88 b1 49 00       	call   17edf00 <_Znwm@plt>
     1352d78:	48 8d 8c 24 c8 00 00 	lea    rcx,[rsp+0xc8]
     1352d7f:	00 
     1352d80:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1352d87:	00 
     1352d88:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     1352d8c:	c6 40 19 04          	mov    BYTE PTR [rax+0x19],0x4
     1352d90:	41 c6 47 10 01       	mov    BYTE PTR [r15+0x10],0x1
     1352d95:	48 8b b4 24 30 01 00 	mov    rsi,QWORD PTR [rsp+0x130]
     1352d9c:	00 
     1352d9d:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352da4:	00 
     1352da5:	4c 89 f2             	mov    rdx,r14
     1352da8:	48 89 c1             	mov    rcx,rax
     1352dab:	e8 bc cd 78 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     1352db0:	49 83 27 00          	and    QWORD PTR [r15],0x0
     1352db4:	4c 89 ff             	mov    rdi,r15
     1352db7:	e8 0e 75 72 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     1352dbc:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1352dc1:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1352dc4:	4c 8d b4 24 58 01 00 	lea    r14,[rsp+0x158]

## Forward dataflow from reads of [rsp+0xe]
## Heap object constructions after +0x1b8 capture
### allocation 0x1352570
     135252b:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
     1352530:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
     1352534:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
     1352541:	4c 89 e7             	mov    rdi,r12
     1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
     135254d:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
     1352551:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
     1352558:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135255d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1352560:	4c 89 ff             	mov    rdi,r15
     1352563:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1352566:	49 89 c7             	mov    r15,rax
     1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     135256d:	6a 60                	push   0x60
     135256f:	5f                   	pop    rdi
     1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>
     1352575:	48 89 c3             	mov    rbx,rax
     1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
     1352586:	66 0f ef c0          	pxor   xmm0,xmm0
     135258a:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     135258f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     1352594:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     1352599:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     135259e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     13525a3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525a7:	48 8d 35 19 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a819]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     13525ae:	48 8d 0d 1b a8 08 ff 	lea    rcx,[rip+0xffffffffff08a81b]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     13525b5:	6a 08                	push   0x8
     13525b7:	41 5e                	pop    r14
     13525b9:	6a 24                	push   0x24
     13525bb:	41 58                	pop    r8
     13525bd:	4c 89 f2             	mov    rdx,r14
     13525c0:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     13525c6:	68 10 27 00 00       	push   0x2710
     13525cb:	6a 64                	push   0x64
     13525cd:	e8 20 50 29 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     13525d2:	48 83 c4 10          	add    rsp,0x10
     13525d6:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525da:	48 8d 35 14 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a814]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
     13525e1:	48 8d 0d 18 a8 08 ff 	lea    rcx,[rip+0xffffffffff08a818]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
     13525e8:	6a 18                	push   0x18
     13525ea:	41 58                	pop    r8
     13525ec:	6a 0a                	push   0xa
     13525ee:	41 59                	pop    r9
     13525f0:	4c 89 f2             	mov    rdx,r14
     13525f3:	6a 0a                	push   0xa
     13525f5:	6a 01                	push   0x1
     13525f7:	e8 f6 4f 29 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     13525fc:	58                   	pop    rax
     13525fd:	59                   	pop    rcx
     13525fe:	40 84 ed             	test   bpl,bpl
     1352601:	0f 84 b7 0b 00 00    	je     13531be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198742>
     1352607:	48 8d 43 10          	lea    rax,[rbx+0x10]
     135260b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1352610:	48 8d 43 18          	lea    rax,[rbx+0x18]
     1352614:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     1352619:	48 8d 43 20          	lea    rax,[rbx+0x20]
     135261d:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1352622:	48 8d 43 28          	lea    rax,[rbx+0x28]
     1352626:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135262b:	48 8d 43 30          	lea    rax,[rbx+0x30]
     135262f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1352634:	48 8d 43 38          	lea    rax,[rbx+0x38]
     1352638:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     135263d:	48 8d 43 40          	lea    rax,[rbx+0x40]
     1352641:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1352646:	48 8d 43 48          	lea    rax,[rbx+0x48]
     135264a:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax

### allocation 0x1352687
     1352646:	48 8d 43 48          	lea    rax,[rbx+0x48]
     135264a:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     135264f:	48 89 d8             	mov    rax,rbx
     1352652:	48 83 c0 50          	add    rax,0x50
     1352656:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     135265b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     135265f:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     1352666:	00 
     1352667:	4c 89 e6             	mov    rsi,r12
     135266a:	ff 50 58             	call   QWORD PTR [rax+0x58]
     135266d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1352671:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352678:	00 
     1352679:	4c 89 e6             	mov    rsi,r12
     135267c:	ff 50 60             	call   QWORD PTR [rax+0x60]
     135267f:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
     1352684:	6a 18                	push   0x18
     1352686:	5f                   	pop    rdi
     1352687:	e8 74 b8 49 00       	call   17edf00 <_Znwm@plt>
     135268c:	49 89 c6             	mov    r14,rax
     135268f:	48 8d 05 22 4d 51 00 	lea    rax,[rip+0x514d22]        # 18673b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23aa0>
     1352696:	49 89 06             	mov    QWORD PTR [r14],rax
     1352699:	48 8b bc 24 50 01 00 	mov    rdi,QWORD PTR [rsp+0x150]
     13526a0:	00 
     13526a1:	49 89 7e 08          	mov    QWORD PTR [r14+0x8],rdi
     13526a5:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
     13526ac:	00 
     13526ad:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     13526b1:	48 85 c0             	test   rax,rax
     13526b4:	74 05                	je     13526bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197c3f>
     13526b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     13526bb:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     13526c2:	00 
     13526c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13526c6:	6a 01                	push   0x1
     13526c8:	5e                   	pop    rsi
     13526c9:	ff 50 50             	call   QWORD PTR [rax+0x50]
     13526cc:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]
     13526d3:	00 
     13526d4:	49 83 27 00          	and    QWORD PTR [r15],0x0
     13526d8:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     13526dd:	4c 89 f6             	mov    rsi,r14
     13526e0:	e8 cd 29 dd ff       	call   11250b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec4c8>
     13526e5:	4c 89 ff             	mov    rdi,r15
     13526e8:	e8 55 29 dd ff       	call   1125042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec458>
     13526ed:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     13526f4:	00 
     13526f5:	e8 8c bd 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13526fa:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     13526fe:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     1352702:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
     1352707:	0f 84 fd 01 00 00    	je     135290a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e8e>
     135270d:	4c 89 e7             	mov    rdi,r12
     1352710:	ff d0                	call   rax
     1352712:	49 89 c6             	mov    r14,rax
     1352715:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1352719:	48 8d 35 a7 a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6a7]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     1352720:	48 8d 0d a9 a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6a9]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     1352727:	6a 08                	push   0x8
     1352729:	41 5f                	pop    r15
     135272b:	6a 24                	push   0x24
     135272d:	41 58                	pop    r8
     135272f:	4c 89 fa             	mov    rdx,r15
     1352732:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     1352738:	e8 ed 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     135273d:	89 c5                	mov    ebp,eax
     135273f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1352743:	48 8d 35 ab a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6ab]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
     135274a:	48 8d 0d af a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6af]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
     1352751:	6a 18                	push   0x18
     1352753:	41 58                	pop    r8
     1352755:	6a 0a                	push   0xa
     1352757:	41 59                	pop    r9

### allocation 0x1352776
     1352732:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     1352738:	e8 ed 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     135273d:	89 c5                	mov    ebp,eax
     135273f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1352743:	48 8d 35 ab a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6ab]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
     135274a:	48 8d 0d af a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6af]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
     1352751:	6a 18                	push   0x18
     1352753:	41 58                	pop    r8
     1352755:	6a 0a                	push   0xa
     1352757:	41 59                	pop    r9
     1352759:	4c 89 fa             	mov    rdx,r15
     135275c:	e8 c9 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     1352761:	41 89 c5             	mov    r13d,eax
     1352764:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1352768:	4c 89 e7             	mov    rdi,r12
     135276b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135276e:	49 89 c7             	mov    r15,rax
     1352771:	bf 90 00 00 00       	mov    edi,0x90
     1352776:	e8 85 b7 49 00       	call   17edf00 <_Znwm@plt>
     135277b:	48 63 cd             	movsxd rcx,ebp
     135277e:	49 63 d5             	movsxd rdx,r13d
     1352781:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352784:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
     1352788:	48 89 50 10          	mov    QWORD PTR [rax+0x10],rdx
     135278c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352791:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     1352795:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
     135279c:	41 0f 28 86 d0 01 00 	movaps xmm0,XMMWORD PTR [r14+0x1d0]
     13527a3:	00 
     13527a4:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     13527a8:	48 85 c9             	test   rcx,rcx
     13527ab:	74 05                	je     13527b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d36>
     13527ad:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     13527b2:	49 8b 8f c8 01 00 00 	mov    rcx,QWORD PTR [r15+0x1c8]
     13527b9:	66 41 0f 6f 87 c0 01 	movdqa xmm0,XMMWORD PTR [r15+0x1c0]
     13527c0:	00 00 
     13527c2:	f3 0f 7f 40 30       	movdqu XMMWORD PTR [rax+0x30],xmm0
     13527c7:	48 85 c9             	test   rcx,rcx
     13527ca:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
     13527cf:	74 05                	je     13527d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d5a>
     13527d1:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     13527d6:	66 0f ef c0          	pxor   xmm0,xmm0
     13527da:	f3 0f 7f 40 50       	movdqu XMMWORD PTR [rax+0x50],xmm0
     13527df:	f3 0f 7f 40 40       	movdqu XMMWORD PTR [rax+0x40],xmm0
     13527e4:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     13527eb:	31 c9                	xor    ecx,ecx
     13527ed:	88 48 68             	mov    BYTE PTR [rax+0x68],cl
     13527f0:	88 88 80 00 00 00    	mov    BYTE PTR [rax+0x80],cl
     13527f6:	88 88 88 00 00 00    	mov    BYTE PTR [rax+0x88],cl
     13527fc:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1352803:	00 
     1352804:	49 83 27 00          	and    QWORD PTR [r15],0x0
     1352808:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
     135280d:	4c 89 e7             	mov    rdi,r12
     1352810:	48 89 c6             	mov    rsi,rax
     1352813:	e8 3c 0c 00 00       	call   1353454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d8>
     1352818:	4c 89 ff             	mov    rdi,r15
     135281b:	e8 aa 0c 00 00       	call   13534ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a4e>
     1352820:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
     1352824:	6a 10                	push   0x10
     1352826:	5f                   	pop    rdi
     1352827:	e8 d4 b6 49 00       	call   17edf00 <_Znwm@plt>
     135282c:	48 8d 0d c5 50 51 00 	lea    rcx,[rip+0x5150c5]        # 18678f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23fe0>
     1352833:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352836:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
     135283a:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     135283f:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352842:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352845:	48 85 ff             	test   rdi,rdi
     1352848:	74 06                	je     1352850 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197dd4>
     135284a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135284d:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352850:	6a 38                	push   0x38

### allocation 0x1352827
     13527df:	f3 0f 7f 40 40       	movdqu XMMWORD PTR [rax+0x40],xmm0
     13527e4:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     13527eb:	31 c9                	xor    ecx,ecx
     13527ed:	88 48 68             	mov    BYTE PTR [rax+0x68],cl
     13527f0:	88 88 80 00 00 00    	mov    BYTE PTR [rax+0x80],cl
     13527f6:	88 88 88 00 00 00    	mov    BYTE PTR [rax+0x88],cl
     13527fc:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1352803:	00 
     1352804:	49 83 27 00          	and    QWORD PTR [r15],0x0
     1352808:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
     135280d:	4c 89 e7             	mov    rdi,r12
     1352810:	48 89 c6             	mov    rsi,rax
     1352813:	e8 3c 0c 00 00       	call   1353454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d8>
     1352818:	4c 89 ff             	mov    rdi,r15
     135281b:	e8 aa 0c 00 00       	call   13534ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a4e>
     1352820:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
     1352824:	6a 10                	push   0x10
     1352826:	5f                   	pop    rdi
     1352827:	e8 d4 b6 49 00       	call   17edf00 <_Znwm@plt>
     135282c:	48 8d 0d c5 50 51 00 	lea    rcx,[rip+0x5150c5]        # 18678f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23fe0>
     1352833:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352836:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
     135283a:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     135283f:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352842:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352845:	48 85 ff             	test   rdi,rdi
     1352848:	74 06                	je     1352850 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197dd4>
     135284a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135284d:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352850:	6a 38                	push   0x38
     1352852:	5f                   	pop    rdi
     1352853:	e8 a8 b6 49 00       	call   17edf00 <_Znwm@plt>
     1352858:	48 8d 0d 11 50 51 00 	lea    rcx,[rip+0x515011]        # 1867870 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23f58>
     135285f:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352862:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
     1352869:	66 41 0f 6f 86 d0 01 	movdqa xmm0,XMMWORD PTR [r14+0x1d0]
     1352870:	00 00 
     1352872:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     1352877:	48 85 c9             	test   rcx,rcx
     135287a:	74 05                	je     1352881 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e05>
     135287c:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352881:	66 0f ef c0          	pxor   xmm0,xmm0
     1352885:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     135288a:	48 83 60 28 00       	and    QWORD PTR [rax+0x28],0x0
     135288f:	c6 40 30 01          	mov    BYTE PTR [rax+0x30],0x1
     1352893:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]
     135289a:	00 
     135289b:	49 83 26 00          	and    QWORD PTR [r14],0x0
     135289f:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     13528a4:	48 89 c6             	mov    rsi,rax
     13528a7:	e8 26 0c 00 00       	call   13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
     13528ac:	4c 89 f7             	mov    rdi,r14
     13528af:	e8 3e 0c 00 00       	call   13534f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a76>
     13528b4:	80 7c 24 28 00       	cmp    BYTE PTR [rsp+0x28],0x0
     13528b9:	0f 84 a9 00 00 00    	je     1352968 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197eec>
     13528bf:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13528c6:	00 
     13528c7:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     13528cc:	e8 43 68 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
     13528d1:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     13528d8:	00 
     13528d9:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     13528e0:	00 00 
     13528e2:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     13528e7:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     13528ea:	48 89 01             	mov    QWORD PTR [rcx],rax
     13528ed:	48 85 ff             	test   rdi,rdi
     13528f0:	74 06                	je     13528f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e7c>
     13528f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13528f5:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13528f8:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13528ff:	00 
     1352900:	e8 f5 0b 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>

### allocation 0x1352853
     1352818:	4c 89 ff             	mov    rdi,r15
     135281b:	e8 aa 0c 00 00       	call   13534ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a4e>
     1352820:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
     1352824:	6a 10                	push   0x10
     1352826:	5f                   	pop    rdi
     1352827:	e8 d4 b6 49 00       	call   17edf00 <_Znwm@plt>
     135282c:	48 8d 0d c5 50 51 00 	lea    rcx,[rip+0x5150c5]        # 18678f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23fe0>
     1352833:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352836:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
     135283a:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     135283f:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352842:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352845:	48 85 ff             	test   rdi,rdi
     1352848:	74 06                	je     1352850 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197dd4>
     135284a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135284d:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352850:	6a 38                	push   0x38
     1352852:	5f                   	pop    rdi
     1352853:	e8 a8 b6 49 00       	call   17edf00 <_Znwm@plt>
     1352858:	48 8d 0d 11 50 51 00 	lea    rcx,[rip+0x515011]        # 1867870 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23f58>
     135285f:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352862:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
     1352869:	66 41 0f 6f 86 d0 01 	movdqa xmm0,XMMWORD PTR [r14+0x1d0]
     1352870:	00 00 
     1352872:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     1352877:	48 85 c9             	test   rcx,rcx
     135287a:	74 05                	je     1352881 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e05>
     135287c:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352881:	66 0f ef c0          	pxor   xmm0,xmm0
     1352885:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     135288a:	48 83 60 28 00       	and    QWORD PTR [rax+0x28],0x0
     135288f:	c6 40 30 01          	mov    BYTE PTR [rax+0x30],0x1
     1352893:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]
     135289a:	00 
     135289b:	49 83 26 00          	and    QWORD PTR [r14],0x0
     135289f:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     13528a4:	48 89 c6             	mov    rsi,rax
     13528a7:	e8 26 0c 00 00       	call   13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
     13528ac:	4c 89 f7             	mov    rdi,r14
     13528af:	e8 3e 0c 00 00       	call   13534f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a76>
     13528b4:	80 7c 24 28 00       	cmp    BYTE PTR [rsp+0x28],0x0
     13528b9:	0f 84 a9 00 00 00    	je     1352968 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197eec>
     13528bf:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13528c6:	00 
     13528c7:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     13528cc:	e8 43 68 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
     13528d1:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     13528d8:	00 
     13528d9:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     13528e0:	00 00 
     13528e2:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     13528e7:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     13528ea:	48 89 01             	mov    QWORD PTR [rcx],rax
     13528ed:	48 85 ff             	test   rdi,rdi
     13528f0:	74 06                	je     13528f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e7c>
     13528f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13528f5:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13528f8:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13528ff:	00 
     1352900:	e8 f5 0b 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352905:	e9 7f 01 00 00       	jmp    1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     135290a:	4c 89 e7             	mov    rdi,r12
     135290d:	ff d0                	call   rax
     135290f:	0f 28 40 60          	movaps xmm0,XMMWORD PTR [rax+0x60]
     1352913:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     135291a:	00 
     135291b:	4c 8b 68 68          	mov    r13,QWORD PTR [rax+0x68]
     135291f:	4d 85 ed             	test   r13,r13
     1352922:	74 05                	je     1352929 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197ead>
     1352924:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     1352929:	6a 38                	push   0x38
     135292b:	5f                   	pop    rdi
     135292c:	e8 cf b5 49 00       	call   17edf00 <_Znwm@plt>

### allocation 0x135292c
     13528f0:	74 06                	je     13528f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e7c>
     13528f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13528f5:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13528f8:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13528ff:	00 
     1352900:	e8 f5 0b 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352905:	e9 7f 01 00 00       	jmp    1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     135290a:	4c 89 e7             	mov    rdi,r12
     135290d:	ff d0                	call   rax
     135290f:	0f 28 40 60          	movaps xmm0,XMMWORD PTR [rax+0x60]
     1352913:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     135291a:	00 
     135291b:	4c 8b 68 68          	mov    r13,QWORD PTR [rax+0x68]
     135291f:	4d 85 ed             	test   r13,r13
     1352922:	74 05                	je     1352929 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197ead>
     1352924:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     1352929:	6a 38                	push   0x38
     135292b:	5f                   	pop    rdi
     135292c:	e8 cf b5 49 00       	call   17edf00 <_Znwm@plt>
     1352931:	49 89 c7             	mov    r15,rax
     1352934:	49 89 c6             	mov    r14,rax
     1352937:	48 8d 05 02 4b 51 00 	lea    rax,[rip+0x514b02]        # 1867440 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23b28>
     135293e:	49 89 07             	mov    QWORD PTR [r15],rax
     1352941:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     1352948:	00 00 
     135294a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
     1352950:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
     1352957:	4d 85 e4             	test   r12,r12
     135295a:	74 52                	je     13529ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f32>
     135295c:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     1352962:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1352966:	eb 4b                	jmp    13529b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f37>
     1352968:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135296d:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352970:	6a 18                	push   0x18
     1352972:	5f                   	pop    rdi
     1352973:	e8 88 b5 49 00       	call   17edf00 <_Znwm@plt>
     1352978:	48 8d 0d d9 eb 51 00 	lea    rcx,[rip+0x51ebd9]        # 1871558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc40>
     135297f:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352982:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352987:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     135298b:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     135298f:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1352994:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352997:	48 89 01             	mov    QWORD PTR [rcx],rax
     135299a:	48 85 ff             	test   rdi,rdi
     135299d:	0f 84 e6 00 00 00    	je     1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     13529a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529a6:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13529a9:	e9 db 00 00 00       	jmp    1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     13529ae:	66 48 0f 7e c7       	movq   rdi,xmm0
     13529b3:	49 83 c7 18          	add    r15,0x18
     13529b7:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
     13529bc:	66 0f ef c0          	pxor   xmm0,xmm0
     13529c0:	f3 41 0f 7f 46 18    	movdqu XMMWORD PTR [r14+0x18],xmm0
     13529c6:	41 c6 46 30 01       	mov    BYTE PTR [r14+0x30],0x1
     13529cb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529ce:	31 f6                	xor    esi,esi
     13529d0:	ff 50 70             	call   QWORD PTR [rax+0x70]
     13529d3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13529d8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     13529db:	4c 89 30             	mov    QWORD PTR [rax],r14
     13529de:	48 85 ff             	test   rdi,rdi
     13529e1:	74 06                	je     13529e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f6d>
     13529e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13529e9:	80 7c 24 28 00       	cmp    BYTE PTR [rsp+0x28],0x0
     13529ee:	74 48                	je     1352a38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fbc>
     13529f0:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13529f7:	00 
     13529f8:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     13529fd:	e8 12 67 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
     1352a02:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]

### allocation 0x1352973
     135292c:	e8 cf b5 49 00       	call   17edf00 <_Znwm@plt>
     1352931:	49 89 c7             	mov    r15,rax
     1352934:	49 89 c6             	mov    r14,rax
     1352937:	48 8d 05 02 4b 51 00 	lea    rax,[rip+0x514b02]        # 1867440 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23b28>
     135293e:	49 89 07             	mov    QWORD PTR [r15],rax
     1352941:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     1352948:	00 00 
     135294a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
     1352950:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
     1352957:	4d 85 e4             	test   r12,r12
     135295a:	74 52                	je     13529ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f32>
     135295c:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     1352962:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1352966:	eb 4b                	jmp    13529b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f37>
     1352968:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135296d:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352970:	6a 18                	push   0x18
     1352972:	5f                   	pop    rdi
     1352973:	e8 88 b5 49 00       	call   17edf00 <_Znwm@plt>
     1352978:	48 8d 0d d9 eb 51 00 	lea    rcx,[rip+0x51ebd9]        # 1871558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc40>
     135297f:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352982:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352987:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     135298b:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     135298f:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1352994:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352997:	48 89 01             	mov    QWORD PTR [rcx],rax
     135299a:	48 85 ff             	test   rdi,rdi
     135299d:	0f 84 e6 00 00 00    	je     1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     13529a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529a6:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13529a9:	e9 db 00 00 00       	jmp    1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     13529ae:	66 48 0f 7e c7       	movq   rdi,xmm0
     13529b3:	49 83 c7 18          	add    r15,0x18
     13529b7:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
     13529bc:	66 0f ef c0          	pxor   xmm0,xmm0
     13529c0:	f3 41 0f 7f 46 18    	movdqu XMMWORD PTR [r14+0x18],xmm0
     13529c6:	41 c6 46 30 01       	mov    BYTE PTR [r14+0x30],0x1
     13529cb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529ce:	31 f6                	xor    esi,esi
     13529d0:	ff 50 70             	call   QWORD PTR [rax+0x70]
     13529d3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13529d8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     13529db:	4c 89 30             	mov    QWORD PTR [rax],r14
     13529de:	48 85 ff             	test   rdi,rdi
     13529e1:	74 06                	je     13529e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f6d>
     13529e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13529e9:	80 7c 24 28 00       	cmp    BYTE PTR [rsp+0x28],0x0
     13529ee:	74 48                	je     1352a38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fbc>
     13529f0:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13529f7:	00 
     13529f8:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     13529fd:	e8 12 67 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
     1352a02:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     1352a09:	00 
     1352a0a:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     1352a11:	00 00 
     1352a13:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1352a18:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352a1b:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352a1e:	48 85 ff             	test   rdi,rdi
     1352a21:	74 06                	je     1352a29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fad>
     1352a23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352a26:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352a29:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352a30:	00 
     1352a31:	e8 c4 0a 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352a36:	eb 49                	jmp    1352a81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198005>
     1352a38:	6a 20                	push   0x20
     1352a3a:	5f                   	pop    rdi
     1352a3b:	e8 c0 b4 49 00       	call   17edf00 <_Znwm@plt>
     1352a40:	48 8d 0d c1 ea 51 00 	lea    rcx,[rip+0x51eac1]        # 1871508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dbf0>

### allocation 0x1352a3b
     13529fd:	e8 12 67 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
     1352a02:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     1352a09:	00 
     1352a0a:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     1352a11:	00 00 
     1352a13:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1352a18:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352a1b:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352a1e:	48 85 ff             	test   rdi,rdi
     1352a21:	74 06                	je     1352a29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fad>
     1352a23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352a26:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352a29:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352a30:	00 
     1352a31:	e8 c4 0a 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352a36:	eb 49                	jmp    1352a81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198005>
     1352a38:	6a 20                	push   0x20
     1352a3a:	5f                   	pop    rdi
     1352a3b:	e8 c0 b4 49 00       	call   17edf00 <_Znwm@plt>
     1352a40:	48 8d 0d c1 ea 51 00 	lea    rcx,[rip+0x51eac1]        # 1871508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dbf0>
     1352a47:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352a4a:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352a4f:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1352a53:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     1352a5a:	00 00 
     1352a5c:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     1352a61:	4d 85 ed             	test   r13,r13
     1352a64:	74 05                	je     1352a6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fef>
     1352a66:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     1352a6b:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1352a70:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352a73:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352a76:	48 85 ff             	test   rdi,rdi
     1352a79:	74 06                	je     1352a81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198005>
     1352a7b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352a7e:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352a81:	4c 89 e7             	mov    rdi,r12
     1352a84:	e8 fd b9 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1352a89:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352a8d:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     1352a94:	00 
     1352a95:	48 89 ee             	mov    rsi,rbp
     1352a98:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1352a9b:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352a9f:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     1352aa6:	00 
     1352aa7:	48 89 ee             	mov    rsi,rbp
     1352aaa:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1352aad:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352ab1:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352ab8:	00 
     1352ab9:	48 89 ee             	mov    rsi,rbp
     1352abc:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1352abf:	bf b8 00 00 00       	mov    edi,0xb8
     1352ac4:	e8 37 b4 49 00       	call   17edf00 <_Znwm@plt>
     1352ac9:	49 89 c6             	mov    r14,rax
     1352acc:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     1352ad1:	49 89 06             	mov    QWORD PTR [r14],rax
     1352ad4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1352ad9:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     1352add:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     1352ae4:	00 
     1352ae5:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
     1352aec:	00 00 
     1352aee:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     1352af4:	48 85 c0             	test   rax,rax
     1352af7:	74 05                	je     1352afe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198082>
     1352af9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1352afe:	4d 8d 7e 20          	lea    r15,[r14+0x20]
     1352b02:	4c 89 ff             	mov    rdi,r15
     1352b05:	e8 ec 6e 48 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1352b0a:	4d 8d 66 30          	lea    r12,[r14+0x30]
     1352b0e:	4c 89 e7             	mov    rdi,r12

### allocation 0x1352ac4
     1352a81:	4c 89 e7             	mov    rdi,r12
     1352a84:	e8 fd b9 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1352a89:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352a8d:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     1352a94:	00 
     1352a95:	48 89 ee             	mov    rsi,rbp
     1352a98:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1352a9b:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352a9f:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     1352aa6:	00 
     1352aa7:	48 89 ee             	mov    rsi,rbp
     1352aaa:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1352aad:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352ab1:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352ab8:	00 
     1352ab9:	48 89 ee             	mov    rsi,rbp
     1352abc:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1352abf:	bf b8 00 00 00       	mov    edi,0xb8
     1352ac4:	e8 37 b4 49 00       	call   17edf00 <_Znwm@plt>
     1352ac9:	49 89 c6             	mov    r14,rax
     1352acc:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     1352ad1:	49 89 06             	mov    QWORD PTR [r14],rax
     1352ad4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1352ad9:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     1352add:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     1352ae4:	00 
     1352ae5:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
     1352aec:	00 00 
     1352aee:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     1352af4:	48 85 c0             	test   rax,rax
     1352af7:	74 05                	je     1352afe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198082>
     1352af9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1352afe:	4d 8d 7e 20          	lea    r15,[r14+0x20]
     1352b02:	4c 89 ff             	mov    rdi,r15
     1352b05:	e8 ec 6e 48 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1352b0a:	4d 8d 66 30          	lea    r12,[r14+0x30]
     1352b0e:	4c 89 e7             	mov    rdi,r12
     1352b11:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1352b16:	e8 a7 eb 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1352b1b:	31 c0                	xor    eax,eax
     1352b1d:	41 88 46 68          	mov    BYTE PTR [r14+0x68],al
     1352b21:	49 8d 4e 70          	lea    rcx,[r14+0x70]
     1352b25:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
     1352b2a:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
     1352b2e:	41 88 86 88 00 00 00 	mov    BYTE PTR [r14+0x88],al
     1352b35:	49 8d 8e 90 00 00 00 	lea    rcx,[r14+0x90]
     1352b3c:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352b41:	41 88 86 90 00 00 00 	mov    BYTE PTR [r14+0x90],al
     1352b48:	41 88 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],al
     1352b4f:	66 0f ef c0          	pxor   xmm0,xmm0
     1352b53:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
     1352b59:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
     1352b5d:	49 8b 6e 10          	mov    rbp,QWORD PTR [r14+0x10]
     1352b61:	4c 8d 84 24 a0 00 00 	lea    r8,[rsp+0xa0]
     1352b68:	00 
     1352b69:	4d 89 30             	mov    QWORD PTR [r8],r14
     1352b6c:	48 8d 35 1e a5 74 ff 	lea    rsi,[rip+0xffffffffff74a51e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     1352b73:	48 8d 0d be b2 0e 00 	lea    rcx,[rip+0xeb2be]        # 143de38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2833bc>
     1352b7a:	4c 8d ac 24 50 01 00 	lea    r13,[rsp+0x150]
     1352b81:	00 
     1352b82:	6a 08                	push   0x8
     1352b84:	41 59                	pop    r9
     1352b86:	4c 89 ef             	mov    rdi,r13
     1352b89:	31 d2                	xor    edx,edx
     1352b8b:	e8 04 7c 48 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     1352b90:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352b94:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1352b9b:	00 
     1352b9c:	48 89 ee             	mov    rsi,rbp
     1352b9f:	4c 89 ea             	mov    rdx,r13
     1352ba2:	ff 50 60             	call   QWORD PTR [rax+0x60]
     1352ba5:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     1352bac:	00 

### allocation 0x1352c07
     1352bc2:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352bc9:	00 
     1352bca:	e8 19 7c 48 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1352bcf:	4c 8d bc 24 20 01 00 	lea    r15,[rsp+0x120]
     1352bd6:	00 
     1352bd7:	49 83 27 00          	and    QWORD PTR [r15],0x0
     1352bdb:	4c 8b 64 24 48       	mov    r12,QWORD PTR [rsp+0x48]
     1352be0:	4c 89 e7             	mov    rdi,r12
     1352be3:	4c 89 f6             	mov    rsi,r14
     1352be6:	e8 2f 09 00 00       	call   135351a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9e>
     1352beb:	4c 89 ff             	mov    rdi,r15
     1352bee:	e8 81 09 00 00       	call   1353574 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198af8>
     1352bf3:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1352bfa:	00 
     1352bfb:	e8 86 b8 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1352c00:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
     1352c04:	6a 38                	push   0x38
     1352c06:	5f                   	pop    rdi
     1352c07:	e8 f4 b2 49 00       	call   17edf00 <_Znwm@plt>
     1352c0c:	48 8d 0d 55 4b 51 00 	lea    rcx,[rip+0x514b55]        # 1867768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23e50>
     1352c13:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352c16:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     1352c1a:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     1352c21:	00 
     1352c22:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
     1352c29:	00 
     1352c2a:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     1352c2e:	48 85 c9             	test   rcx,rcx
     1352c31:	48 8b 94 24 90 00 00 	mov    rdx,QWORD PTR [rsp+0x90]
     1352c38:	00 
     1352c39:	74 05                	je     1352c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1981c4>
     1352c3b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352c40:	48 8b 8c 24 e8 00 00 	mov    rcx,QWORD PTR [rsp+0xe8]
     1352c47:	00 
     1352c48:	66 0f 6f 84 24 e0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xe0]
     1352c4f:	00 00 
     1352c51:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     1352c56:	48 85 c9             	test   rcx,rcx
     1352c59:	74 05                	je     1352c60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1981e4>
     1352c5b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352c60:	48 89 50 30          	mov    QWORD PTR [rax+0x30],rdx
     1352c64:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]
     1352c6b:	00 
     1352c6c:	49 83 26 00          	and    QWORD PTR [r14],0x0
     1352c70:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1352c75:	48 89 c6             	mov    rsi,rax
     1352c78:	e8 ff 08 00 00       	call   135357c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b00>
     1352c7d:	4c 89 f7             	mov    rdi,r14
     1352c80:	e8 17 09 00 00       	call   135359c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b20>
     1352c85:	80 7c 24 0f 00       	cmp    BYTE PTR [rsp+0xf],0x0
     1352c8a:	74 48                	je     1352cd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198258>
     1352c8c:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352c93:	00 
     1352c94:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1352c99:	e8 76 64 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
     1352c9e:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     1352ca5:	00 
     1352ca6:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     1352cad:	00 00 
     1352caf:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352cb4:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352cb7:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352cba:	48 85 ff             	test   rdi,rdi
     1352cbd:	74 06                	je     1352cc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198249>
     1352cbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352cc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352cc5:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352ccc:	00 
     1352ccd:	e8 28 08 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352cd2:	eb 5d                	jmp    1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352cd4:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1352cd9:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352cdc:	6a 28                	push   0x28

### allocation 0x1352cdf
     1352ca5:	00 
     1352ca6:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     1352cad:	00 00 
     1352caf:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352cb4:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352cb7:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352cba:	48 85 ff             	test   rdi,rdi
     1352cbd:	74 06                	je     1352cc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198249>
     1352cbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352cc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352cc5:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352ccc:	00 
     1352ccd:	e8 28 08 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352cd2:	eb 5d                	jmp    1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352cd4:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1352cd9:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352cdc:	6a 28                	push   0x28
     1352cde:	5f                   	pop    rdi
     1352cdf:	e8 1c b2 49 00       	call   17edf00 <_Znwm@plt>
     1352ce4:	48 8d 0d 45 e8 51 00 	lea    rcx,[rip+0x51e845]        # 1871530 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc18>
     1352ceb:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352cee:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352cf3:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1352cf7:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     1352cfb:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     1352d02:	00 
     1352d03:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
     1352d0a:	00 00 
     1352d0c:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     1352d11:	48 85 c9             	test   rcx,rcx
     1352d14:	74 05                	je     1352d1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19829f>
     1352d16:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352d1b:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352d20:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352d23:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352d26:	48 85 ff             	test   rdi,rdi
     1352d29:	74 06                	je     1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352d2b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352d2e:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352d31:	48 8d 35 8c a0 08 ff 	lea    rsi,[rip+0xffffffffff08a08c]        # 3dcdc4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2813>
     1352d38:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d3f:	00 
     1352d40:	6a 02                	push   0x2
     1352d42:	5a                   	pop    rdx
     1352d43:	e8 e4 6c d5 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     1352d48:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
     1352d4d:	74 6d                	je     1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
     1352d4f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d56:	00 
     1352d57:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1352d5e:	00 
     1352d5f:	6a 04                	push   0x4
     1352d61:	5a                   	pop    rdx
     1352d62:	e8 3d 6e d5 ff       	call   10a9ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270fba>
     1352d67:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     1352d6b:	75 4f                	jne    1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
     1352d6d:	49 89 c6             	mov    r14,rax
     1352d70:	6a 20                	push   0x20
     1352d72:	5f                   	pop    rdi
     1352d73:	e8 88 b1 49 00       	call   17edf00 <_Znwm@plt>
     1352d78:	48 8d 8c 24 c8 00 00 	lea    rcx,[rsp+0xc8]
     1352d7f:	00 
     1352d80:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1352d87:	00 
     1352d88:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     1352d8c:	c6 40 19 04          	mov    BYTE PTR [rax+0x19],0x4
     1352d90:	41 c6 47 10 01       	mov    BYTE PTR [r15+0x10],0x1
     1352d95:	48 8b b4 24 30 01 00 	mov    rsi,QWORD PTR [rsp+0x130]
     1352d9c:	00 
     1352d9d:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352da4:	00 
     1352da5:	4c 89 f2             	mov    rdx,r14
     1352da8:	48 89 c1             	mov    rcx,rax

### allocation 0x1352d73
     1352d3f:	00 
     1352d40:	6a 02                	push   0x2
     1352d42:	5a                   	pop    rdx
     1352d43:	e8 e4 6c d5 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     1352d48:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
     1352d4d:	74 6d                	je     1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
     1352d4f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d56:	00 
     1352d57:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1352d5e:	00 
     1352d5f:	6a 04                	push   0x4
     1352d61:	5a                   	pop    rdx
     1352d62:	e8 3d 6e d5 ff       	call   10a9ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270fba>
     1352d67:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     1352d6b:	75 4f                	jne    1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
     1352d6d:	49 89 c6             	mov    r14,rax
     1352d70:	6a 20                	push   0x20
     1352d72:	5f                   	pop    rdi
     1352d73:	e8 88 b1 49 00       	call   17edf00 <_Znwm@plt>
     1352d78:	48 8d 8c 24 c8 00 00 	lea    rcx,[rsp+0xc8]
     1352d7f:	00 
     1352d80:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1352d87:	00 
     1352d88:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     1352d8c:	c6 40 19 04          	mov    BYTE PTR [rax+0x19],0x4
     1352d90:	41 c6 47 10 01       	mov    BYTE PTR [r15+0x10],0x1
     1352d95:	48 8b b4 24 30 01 00 	mov    rsi,QWORD PTR [rsp+0x130]
     1352d9c:	00 
     1352d9d:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352da4:	00 
     1352da5:	4c 89 f2             	mov    rdx,r14
     1352da8:	48 89 c1             	mov    rcx,rax
     1352dab:	e8 bc cd 78 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     1352db0:	49 83 27 00          	and    QWORD PTR [r15],0x0
     1352db4:	4c 89 ff             	mov    rdi,r15
     1352db7:	e8 0e 75 72 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     1352dbc:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1352dc1:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1352dc4:	4c 8d b4 24 58 01 00 	lea    r14,[rsp+0x158]
     1352dcb:	00 
     1352dcc:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     1352dd0:	48 8d 35 ef 9f 08 ff 	lea    rsi,[rip+0xffffffffff089fef]        # 3dcdc6 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2815>
     1352dd7:	6a 01                	push   0x1
     1352dd9:	5a                   	pop    rdx
     1352dda:	4c 89 f7             	mov    rdi,r14
     1352ddd:	e8 4a 6c d5 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     1352de2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     1352de7:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1352dea:	48 8d 84 24 80 01 00 	lea    rax,[rsp+0x180]
     1352df1:	00 
     1352df2:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1352df6:	48 8b 94 24 c0 00 00 	mov    rdx,QWORD PTR [rsp+0xc0]
     1352dfd:	00 
     1352dfe:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     1352e05:	00 
     1352e06:	48 89 50 f8          	mov    QWORD PTR [rax-0x8],rdx
     1352e0a:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352e0d:	48 8b 94 24 d0 00 00 	mov    rdx,QWORD PTR [rsp+0xd0]
     1352e14:	00 
     1352e15:	48 89 50 08          	mov    QWORD PTR [rax+0x8],rdx
     1352e19:	48 85 d2             	test   rdx,rdx
     1352e1c:	74 1a                	je     1352e38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1983bc>
     1352e1e:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
     1352e25:	00 
     1352e26:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     1352e2a:	48 89 52 f8          	mov    QWORD PTR [rdx-0x8],rdx
     1352e2e:	66 0f ef c0          	pxor   xmm0,xmm0
     1352e32:	f3 0f 7f 02          	movdqu XMMWORD PTR [rdx],xmm0
     1352e36:	eb 08                	jmp    1352e40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1983c4>
     1352e38:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
     1352e3f:	00 
     1352e40:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1352e47:	00 00 

### allocation 0x1352fe0
     1352f94:	e8 27 b6 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1352f99:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     1352f9e:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1352fa1:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
     1352fa8:	00 
     1352fa9:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
     1352fad:	66 0f ef c0          	pxor   xmm0,xmm0
     1352fb1:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
     1352fb5:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
     1352fb9:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1352fc0:	00 
     1352fc1:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
     1352fc8:	00 
     1352fc9:	e8 54 06 00 00       	call   1353622 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ba6>
     1352fce:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
     1352fd5:	00 
     1352fd6:	e8 e5 b5 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1352fdb:	bf e8 08 00 00       	mov    edi,0x8e8
     1352fe0:	e8 1b af 49 00       	call   17edf00 <_Znwm@plt>
     1352fe5:	49 89 c6             	mov    r14,rax
     1352fe8:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
     1352fef:	00 
     1352ff0:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1352ff5:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
     1352ffc:	00 
     1352ffd:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     1353004:	00 
     1353005:	0f 57 c0             	xorps  xmm0,xmm0
     1353008:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     135300f:	00 
     1353010:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1353017:	00 00 
     1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
     1353020:	49 89 06             	mov    QWORD PTR [r14],rax
     1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
     135302a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135302e:	49 8d 46 10          	lea    rax,[r14+0x10]
     1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>
     1353039:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
     135303d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1353044:	00 
     1353045:	49 89 7e 18          	mov    QWORD PTR [r14+0x18],rdi
     1353049:	48 8b 8c 24 08 01 00 	mov    rcx,QWORD PTR [rsp+0x108]
     1353050:	00 
     1353051:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
     1353055:	48 85 c9             	test   rcx,rcx
     1353058:	74 05                	je     135305f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1985e3>
     135305a:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135305f:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
     1353064:	4c 89 f1             	mov    rcx,r14
     1353067:	48 83 c1 40          	add    rcx,0x40
     135306b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     1353070:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
     1353074:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
     1353079:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1353080:	00 
     1353081:	49 89 07             	mov    QWORD PTR [r15],rax
     1353084:	48 8d 05 d9 93 72 ff 	lea    rax,[rip+0xffffffffff7293d9]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135308b:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     135308f:	48 8d 05 96 6d 00 00 	lea    rax,[rip+0x6d96]        # 1359e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f3b0>
     1353096:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     135309a:	48 83 c7 30          	add    rdi,0x30
     135309e:	4c 89 fe             	mov    rsi,r15
     13530a1:	e8 8e 6d 00 00       	call   1359e34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f3b8>
     13530a6:	4c 89 ff             	mov    rdi,r15
     13530a9:	e8 aa 4f 83 ff       	call   b88058 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ff8>
     13530ae:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     13530b5:	00 
     13530b6:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
     13530bc:	0f 57 c9             	xorps  xmm1,xmm1
     13530bf:	41 0f 29 0c 24       	movaps XMMWORD PTR [r12],xmm1
     13530c4:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     13530ca:	f3 41 0f 7f 46 58    	movdqu XMMWORD PTR [r14+0x58],xmm0

## b85f7e semantic constants
      b85f82:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b85f86:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      b85f8a:	6a 04                	push   0x4
      b85f8d:	e8 4c c3 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      b85f95:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
      b85f9c:	74 02                	je     b85fa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f40>
      b85fa0:	e8 1a 40 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>

## Other +0x1b8 reads following virtual +0x28
### 0xc03448; FDE=(12595558, 12598550): lea    rsi,[rsp+0x1b8]
      c03410:	0f 84 b9 00 00 00    	je     c034cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15046f>
      c03416:	49 8b 76 38          	mov    rsi,QWORD PTR [r14+0x38]
      c0341a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      c0341d:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
      c03424:	00 
      c03425:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
      c0342c:	00 
      c0342d:	48 89 df             	mov    rdi,rbx
      c03430:	4c 89 f2             	mov    rdx,r14
      c03433:	ff 50 28             	call   QWORD PTR [rax+0x28]
      c03436:	80 7b 40 00          	cmp    BYTE PTR [rbx+0x40],0x0
      c0343a:	0f 84 fc 00 00 00    	je     c0353c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1504dc>
      c03440:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      c03447:	00 
      c03448:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      c0344f:	00 
      c03450:	6a 40                	push   0x40
      c03452:	5a                   	pop    rdx
      c03453:	e8 a2 22 00 00       	call   c056fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15269a>
      c03458:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      c0345d:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      c03462:	6a 2e                	push   0x2e
      c03464:	5a                   	pop    rdx
      c03465:	e8 ac 08 00 00       	call   c03d16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x150cb6>
      c0346a:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      c0346f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      c03476:	00 
      c03477:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      c0347c:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
      c03483:	00 
      c03484:	e8 9d 2e ef ff       	call   af6326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x432c6>
      c03489:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      c03490:	00 
      c03491:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      c03495:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      c03499:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
      c0349c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0

### 0x11a6cd4; FDE=(18507954, 18510638): mov    r9,QWORD PTR [rbx+0x1b8]
     11a6c9e:	48 83 a4 24 88 00 00 	and    QWORD PTR [rsp+0x88],0x0
     11a6ca5:	00 00 
     11a6ca7:	48 85 ff             	test   rdi,rdi
     11a6caa:	74 06                	je     11a6cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e0c8>
     11a6cac:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a6caf:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11a6cb2:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     11a6cb9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a6cbc:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11a6cbf:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     11a6cc6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a6cc9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11a6ccc:	84 c0                	test   al,al
     11a6cce:	0f 84 9c 03 00 00    	je     11a7070 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e486>
     11a6cd4:	4c 8b 8b b8 01 00 00 	mov    r9,QWORD PTR [rbx+0x1b8]
     11a6cdb:	4c 8b bb 00 02 00 00 	mov    r15,QWORD PTR [rbx+0x200]
     11a6ce2:	48 8d 0d 9a d0 1d ff 	lea    rcx,[rip+0xffffffffff1dd09a]        # 383d83 <_ZTSSt12bad_any_cast@@Base-0xc445>
     11a6ce9:	4c 8d 05 06 36 19 ff 	lea    r8,[rip+0xffffffffff193606]        # 33a2f6 <_ZTSSt12bad_any_cast@@Base-0x55ed2>
     11a6cf0:	6a 04                	push   0x4
     11a6cf2:	5f                   	pop    rdi
     11a6cf3:	6a 5f                	push   0x5f
     11a6cf5:	5a                   	pop    rdx
     11a6cf6:	4c 89 e6             	mov    rsi,r12
     11a6cf9:	31 c0                	xor    eax,eax
     11a6cfb:	e8 d2 fb 62 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     11a6d00:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     11a6d07:	00 
     11a6d08:	e8 67 6b 4d 00       	call   167d874 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319e0>
     11a6d0d:	0f 57 c0             	xorps  xmm0,xmm0
     11a6d10:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
     11a6d15:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     11a6d1a:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
     11a6d1f:	66 83 21 00          	and    WORD PTR [rcx],0x0
     11a6d23:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     11a6d26:	48 83 61 08 00       	and    QWORD PTR [rcx+0x8],0x0
     11a6d2b:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11a6d30:	e8 3b f0 4e 00       	call   1695d70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49edc>

### 0x1352547; FDE=(20260004, 20264020): mov    al,BYTE PTR [rax+0x1b8]
     135250c:	49 89 c7             	mov    r15,rax
     135250f:	4c 89 f7             	mov    rdi,r14
     1352512:	e8 77 47 96 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     1352517:	8a 88 88 00 00 00    	mov    cl,BYTE PTR [rax+0x88]
     135251d:	88 4c 24 28          	mov    BYTE PTR [rsp+0x28],cl
     1352521:	8a 88 89 00 00 00    	mov    cl,BYTE PTR [rax+0x89]
     1352527:	88 4c 24 0f          	mov    BYTE PTR [rsp+0xf],cl
     135252b:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
     1352530:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
     1352534:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
     1352541:	4c 89 e7             	mov    rdi,r12
     1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
     135254d:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
     1352551:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
     1352558:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135255d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1352560:	4c 89 ff             	mov    rdi,r15
     1352563:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1352566:	49 89 c7             	mov    r15,rax
     1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     135256d:	6a 60                	push   0x60
     135256f:	5f                   	pop    rdi
     1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>
     1352575:	48 89 c3             	mov    rbx,rax
     1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
     1352586:	66 0f ef c0          	pxor   xmm0,xmm0
     135258a:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     135258f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     1352594:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     1352599:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     135259e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     13525a3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]

### 0x144e098; FDE=(21291026, 21291578): mov    r13b,BYTE PTR [rax+0x1b8]
     144e058:	e8 11 7c 7b ff       	call   c05c6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152c0e>
     144e05d:	49 89 c7             	mov    r15,rax
     144e060:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
     144e064:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     144e069:	49 8b 86 90 00 00 00 	mov    rax,QWORD PTR [r14+0x90]
     144e070:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     144e075:	f2 41 0f 10 44 24 18 	movsd  xmm0,QWORD PTR [r12+0x18]
     144e07c:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     144e081:	49 8b 84 24 90 00 00 	mov    rax,QWORD PTR [r12+0x90]
     144e088:	00 
     144e089:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     144e08e:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     144e092:	4c 89 ef             	mov    rdi,r13
     144e095:	ff 50 28             	call   QWORD PTR [rax+0x28]
     144e098:	44 8a a8 b8 01 00 00 	mov    r13b,BYTE PTR [rax+0x1b8]
     144e09f:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     144e0a3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     144e0a6:	48 8d 35 b2 79 fe fe 	lea    rsi,[rip+0xfffffffffefe79b2]        # 435a5f <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ae>
     144e0ad:	48 8d 0d bc 79 fe fe 	lea    rcx,[rip+0xfffffffffefe79bc]        # 435a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4bf>
     144e0b4:	6a 08                	push   0x8
     144e0b6:	41 5c                	pop    r12
     144e0b8:	6a 16                	push   0x16
     144e0ba:	41 58                	pop    r8
     144e0bc:	4c 89 e2             	mov    rdx,r12
     144e0bf:	45 31 c9             	xor    r9d,r9d
     144e0c2:	e8 63 93 19 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     144e0c7:	89 c5                	mov    ebp,eax
     144e0c9:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     144e0cd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     144e0d0:	48 8d 35 b0 79 fe fe 	lea    rsi,[rip+0xfffffffffefe79b0]        # 435a87 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4d6>
     144e0d7:	48 8d 0d b2 79 fe fe 	lea    rcx,[rip+0xfffffffffefe79b2]        # 435a90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4df>
     144e0de:	6a 1f                	push   0x1f
     144e0e0:	41 58                	pop    r8
     144e0e2:	4c 89 e2             	mov    rdx,r12
     144e0e5:	41 b9 c8 00 00 00    	mov    r9d,0xc8
     144e0eb:	e8 3a 93 19 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     144e0f0:	41 89 c4             	mov    r12d,eax

### 0x159dbdb; FDE=(22666192, 22666254): mov    rdi,QWORD PTR [r14+0x1b8]
     159dbbf:	cc                   	int3
     159dbc0:	50                   	push   rax
     159dbc1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     159dbc4:	ff 50 28             	call   QWORD PTR [rax+0x28]
     159dbc7:	83 e0 20             	and    eax,0x20
     159dbca:	c1 e8 05             	shr    eax,0x5
     159dbcd:	59                   	pop    rcx
     159dbce:	c3                   	ret
     159dbcf:	cc                   	int3
     159dbd0:	41 56                	push   r14
     159dbd2:	53                   	push   rbx
     159dbd3:	50                   	push   rax
     159dbd4:	48 89 fb             	mov    rbx,rdi
     159dbd7:	4c 8b 77 70          	mov    r14,QWORD PTR [rdi+0x70]
     159dbdb:	49 8b be b8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1b8]
     159dbe2:	49 8b b6 c0 01 00 00 	mov    rsi,QWORD PTR [r14+0x1c0]
     159dbe9:	6a 01                	push   0x1
     159dbeb:	5a                   	pop    rdx
     159dbec:	e8 58 a0 6c ff       	call   c67c49 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4be9>
     159dbf1:	84 c0                	test   al,al
     159dbf3:	74 06                	je     159dbfb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e317f>
     159dbf5:	48 83 c3 58          	add    rbx,0x58
     159dbf9:	eb 08                	jmp    159dc03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e3187>
     159dbfb:	49 8b 5e 48          	mov    rbx,QWORD PTR [r14+0x48]
     159dbff:	48 83 e3 fc          	and    rbx,0xfffffffffffffffc
     159dc03:	48 89 d8             	mov    rax,rbx
     159dc06:	48 83 c4 08          	add    rsp,0x8
     159dc0a:	5b                   	pop    rbx
     159dc0b:	41 5e                	pop    r14
     159dc0d:	c3                   	ret
     159dc0e:	41 56                	push   r14
     159dc10:	53                   	push   rbx
     159dc11:	50                   	push   rax
     159dc12:	48 89 fb             	mov    rbx,rdi
     159dc15:	4c 8b 77 70          	mov    r14,QWORD PTR [rdi+0x70]
     159dc19:	49 8b be b8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1b8]
     159dc20:	49 8b b6 c0 01 00 00 	mov    rsi,QWORD PTR [r14+0x1c0]

