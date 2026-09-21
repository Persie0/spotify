# Readiness carrier + P method decode

## carrier_1843bf8 real six-slot table
- +0x0: 0xfec460
- +0x8: 0xfec690
- +0x10: 0xfec736
- +0x18: 0xb8854e
- +0x20: 0xfec7dc
- +0x28: 0xfec806

## P_1832be8 real six-slot table
- +0x0: 0xec57ee
- +0x8: 0xec5afe
- +0x10: 0xec5b7c
- +0x18: 0xde01ca
- +0x20: 0xec5d0e
- +0x28: 0xec5d44

## Method 0xb8854e
      b8854e:	53                   	push   rbx
      b8854f:	48 89 fb             	mov    rbx,rdi
      b88552:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      b88556:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b88559:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8855c:	48 89 d8             	mov    rax,rbx
      b8855f:	5b                   	pop    rbx
      b88560:	c3                   	ret

### direct callers/xrefs (0)

## Method 0xde01ca
      de01ca:	53                   	push   rbx
      de01cb:	48 89 fb             	mov    rbx,rdi
      de01ce:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      de01d2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      de01d5:	ff 50 30             	call   QWORD PTR [rax+0x30]
      de01d8:	48 89 d8             	mov    rax,rbx
      de01db:	5b                   	pop    rbx
      de01dc:	c3                   	ret

### direct callers/xrefs (0)

## Method 0xec57ee
      ec57ee:	55                   	push   rbp
      ec57ef:	41 57                	push   r15
      ec57f1:	41 56                	push   r14
      ec57f3:	41 55                	push   r13
      ec57f5:	41 54                	push   r12
      ec57f7:	53                   	push   rbx
      ec57f8:	48 83 ec 58          	sub    rsp,0x58
      ec57fc:	49 89 d7             	mov    r15,rdx
      ec57ff:	49 89 f6             	mov    r14,rsi
      ec5802:	48 89 fb             	mov    rbx,rdi
      ec5805:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec580c:	00 00 
      ec580e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      ec5813:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ec5816:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      ec581b:	4c 89 e7             	mov    rdi,r12
      ec581e:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ec5821:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ec5826:	4c 89 e6             	mov    rsi,r12
      ec5829:	e8 f2 fc ff ff       	call   ec5520 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c936>
      ec582e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      ec5833:	e8 4e 8c bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5838:	83 7c 24 20 01       	cmp    DWORD PTR [rsp+0x20],0x1
      ec583d:	75 5c                	jne    ec589b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ccb1>
      ec583f:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ec5844:	e8 3d 8c bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5849:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      ec584e:	e8 d6 05 00 00       	call   ec5e29 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d23f>
      ec5853:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      ec5858:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
      ec585d:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      ec5862:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      ec5866:	48 85 ed             	test   rbp,rbp
      ec5869:	74 05                	je     ec5870 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cc86>
      ec586b:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
      ec5870:	4d 8b 66 78          	mov    r12,QWORD PTR [r14+0x78]
      ec5874:	49 8b 8e 80 00 00 00 	mov    rcx,QWORD PTR [r14+0x80]
      ec587b:	49 39 cc             	cmp    r12,rcx
      ec587e:	73 39                	jae    ec58b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cccf>
      ec5880:	48 89 e2             	mov    rdx,rsp
      ec5883:	4c 89 e7             	mov    rdi,r12
      ec5886:	4c 89 fe             	mov    rsi,r15
      ec5889:	e8 18 30 fe ff       	call   ea88a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fcbc>
      ec588e:	49 83 c4 28          	add    r12,0x28
      ec5892:	4d 89 66 78          	mov    QWORD PTR [r14+0x78],r12
      ec5896:	e9 6b 01 00 00       	jmp    ec5a06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ce1c>
      ec589b:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
      ec58a0:	48 89 df             	mov    rdi,rbx
      ec58a3:	4c 89 f6             	mov    rsi,r14
      ec58a6:	e8 ab 04 00 00       	call   ec5d56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d16c>
      ec58ab:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
      ec58af:	e8 d2 8b bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec58b4:	e9 ab 01 00 00       	jmp    ec5a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ce7a>
      ec58b9:	48 be 66 66 66 66 66 	movabs rsi,0x666666666666666
      ec58c0:	66 66 06 
      ec58c3:	49 8b 7e 70          	mov    rdi,QWORD PTR [r14+0x70]
      ec58c7:	49 29 fc             	sub    r12,rdi
      ec58ca:	6a 28                	push   0x28
      ec58cc:	41 58                	pop    r8
      ec58ce:	4c 89 e0             	mov    rax,r12
      ec58d1:	48 99                	cqo
      ec58d3:	49 f7 f8             	idiv   r8
      ec58d6:	4c 8d 68 01          	lea    r13,[rax+0x1]
      ec58da:	49 39 f5             	cmp    r13,rsi
      ec58dd:	0f 87 a3 01 00 00    	ja     ec5a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ce9c>
      ec58e3:	49 89 c4             	mov    r12,rax
      ec58e6:	48 29 f9             	sub    rcx,rdi
      ec58e9:	48 89 c8             	mov    rax,rcx
      ec58ec:	48 99                	cqo
      ec58ee:	49 f7 f8             	idiv   r8
      ec58f1:	48 8d 0c 00          	lea    rcx,[rax+rax*1]
      ec58f5:	4c 39 e9             	cmp    rcx,r13
      ec58f8:	4c 0f 47 e9          	cmova  r13,rcx
      ec58fc:	49 8d 8e 80 00 00 00 	lea    rcx,[r14+0x80]
      ec5903:	48 ba 33 33 33 33 33 	movabs rdx,0x333333333333333
      ec590a:	33 33 03 
      ec590d:	48 39 d0             	cmp    rax,rdx
      ec5910:	4c 0f 43 ee          	cmovae r13,rsi
      ec5914:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
      ec5919:	4d 85 ed             	test   r13,r13
      ec591c:	74 14                	je     ec5932 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cd48>
      ec591e:	49 39 f5             	cmp    r13,rsi
      ec5921:	0f 87 74 01 00 00    	ja     ec5a9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ceb1>
      ec5927:	49 6b fd 28          	imul   rdi,r13,0x28
      ec592b:	e8 d0 85 92 00       	call   17edf00 <_Znwm@plt>
      ec5930:	eb 02                	jmp    ec5934 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cd4a>
      ec5932:	31 c0                	xor    eax,eax
      ec5934:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ec5939:	49 6b fc 28          	imul   rdi,r12,0x28
      ec593d:	48 01 c7             	add    rdi,rax
      ec5940:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
      ec5945:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
      ec594a:	49 6b cd 28          	imul   rcx,r13,0x28
      ec594e:	48 01 c1             	add    rcx,rax
      ec5951:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
      ec5956:	48 89 e2             	mov    rdx,rsp
      ec5959:	4c 89 fe             	mov    rsi,r15
      ec595c:	e8 45 2f fe ff       	call   ea88a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fcbc>
      ec5961:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
      ec5966:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
      ec596b:	49 8b 56 70          	mov    rdx,QWORD PTR [r14+0x70]
      ec596f:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
      ec5973:	48 39 d0             	cmp    rax,rdx
      ec5976:	74 4a                	je     ec59c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cdd8>
      ec5978:	0f 57 c0             	xorps  xmm0,xmm0
      ec597b:	48 8b 70 e8          	mov    rsi,QWORD PTR [rax-0x18]
      ec597f:	48 89 71 e8          	mov    QWORD PTR [rcx-0x18],rsi
      ec5983:	0f 10 48 d8          	movups xmm1,XMMWORD PTR [rax-0x28]
      ec5987:	0f 11 49 d8          	movups XMMWORD PTR [rcx-0x28],xmm1
      ec598b:	0f 11 40 d8          	movups XMMWORD PTR [rax-0x28],xmm0
      ec598f:	48 83 60 e8 00       	and    QWORD PTR [rax-0x18],0x0
      ec5994:	48 8b 70 f0          	mov    rsi,QWORD PTR [rax-0x10]
      ec5998:	48 89 71 f0          	mov    QWORD PTR [rcx-0x10],rsi
      ec599c:	48 8b 70 f8          	mov    rsi,QWORD PTR [rax-0x8]
      ec59a0:	48 89 71 f8          	mov    QWORD PTR [rcx-0x8],rsi
      ec59a4:	48 83 c1 d8          	add    rcx,0xffffffffffffffd8
      ec59a8:	0f 11 40 f0          	movups XMMWORD PTR [rax-0x10],xmm0
      ec59ac:	48 8d 70 d8          	lea    rsi,[rax-0x28]
      ec59b0:	48 89 f0             	mov    rax,rsi
      ec59b3:	48 39 d6             	cmp    rsi,rdx
      ec59b6:	75 c3                	jne    ec597b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cd91>
      ec59b8:	49 8b 56 70          	mov    rdx,QWORD PTR [r14+0x70]
      ec59bc:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
      ec59c0:	eb 03                	jmp    ec59c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cddb>
      ec59c2:	48 89 c2             	mov    rdx,rax
      ec59c5:	49 83 c4 28          	add    r12,0x28
      ec59c9:	49 89 4e 70          	mov    QWORD PTR [r14+0x70],rcx
      ec59cd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ec59d2:	48 89 57 08          	mov    QWORD PTR [rdi+0x8],rdx
      ec59d6:	4d 89 66 78          	mov    QWORD PTR [r14+0x78],r12
      ec59da:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ec59de:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
      ec59e5:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      ec59e9:	49 89 8e 80 00 00 00 	mov    QWORD PTR [r14+0x80],rcx
      ec59f0:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      ec59f4:	48 89 17             	mov    QWORD PTR [rdi],rdx
      ec59f7:	e8 da 2e fe ff       	call   ea88d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fcec>
      ec59fc:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      ec5a01:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      ec5a06:	4d 89 66 78          	mov    QWORD PTR [r14+0x78],r12
      ec5a0a:	48 89 ef             	mov    rdi,rbp
      ec5a0d:	e8 a0 8a bd ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      ec5a12:	49 83 7d 08 00       	cmp    QWORD PTR [r13+0x8],0x0
      ec5a17:	75 30                	jne    ec5a49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ce5f>
      ec5a19:	49 83 7d 00 fd       	cmp    QWORD PTR [r13+0x0],0xfffffffffffffffd
      ec5a1e:	77 29                	ja     ec5a49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ce5f>
      ec5a20:	49 83 c5 08          	add    r13,0x8
      ec5a24:	0f 57 c0             	xorps  xmm0,xmm0
      ec5a27:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
      ec5a2c:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      ec5a30:	4c 89 ef             	mov    rdi,r13
      ec5a33:	4c 89 f6             	mov    rsi,r14
      ec5a36:	e8 e1 3d bf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ec5a3b:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      ec5a3f:	e8 42 8a bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5a44:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      ec5a49:	4c 89 2b             	mov    QWORD PTR [rbx],r13
      ec5a4c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      ec5a51:	48 89 7b 08          	mov    QWORD PTR [rbx+0x8],rdi
      ec5a55:	48 85 ff             	test   rdi,rdi
      ec5a58:	74 05                	je     ec5a5f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ce75>
      ec5a5a:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      ec5a5f:	e8 22 8a bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5a64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5a6b:	00 00 
      ec5a6d:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
      ec5a72:	75 79                	jne    ec5aed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cf03>
      ec5a74:	48 89 d8             	mov    rax,rbx
      ec5a77:	48 83 c4 58          	add    rsp,0x58
      ec5a7b:	5b                   	pop    rbx
      ec5a7c:	41 5c                	pop    r12
      ec5a7e:	41 5d                	pop    r13
      ec5a80:	41 5e                	pop    r14
      ec5a82:	41 5f                	pop    r15
      ec5a84:	5d                   	pop    rbp
      ec5a85:	c3                   	ret

### direct callers/xrefs (0)

## Method 0xec5afe
      ec5afe:	41 56                	push   r14
      ec5b00:	53                   	push   rbx
      ec5b01:	48 83 ec 18          	sub    rsp,0x18
      ec5b05:	48 89 fb             	mov    rbx,rdi
      ec5b08:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5b0f:	00 00 
      ec5b11:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ec5b16:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ec5b19:	49 89 e6             	mov    r14,rsp
      ec5b1c:	4c 89 f7             	mov    rdi,r14
      ec5b1f:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ec5b22:	48 89 df             	mov    rdi,rbx
      ec5b25:	4c 89 f6             	mov    rsi,r14
      ec5b28:	e8 f3 f9 ff ff       	call   ec5520 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c936>
      ec5b2d:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      ec5b32:	e8 4f 89 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5b37:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5b3e:	00 00 
      ec5b40:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      ec5b45:	75 30                	jne    ec5b77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cf8d>
      ec5b47:	48 89 d8             	mov    rax,rbx
      ec5b4a:	48 83 c4 18          	add    rsp,0x18
      ec5b4e:	5b                   	pop    rbx
      ec5b4f:	41 5e                	pop    r14
      ec5b51:	c3                   	ret

### direct callers/xrefs (0)

## Method 0xec5b7c
      ec5b7c:	41 57                	push   r15
      ec5b7e:	41 56                	push   r14
      ec5b80:	41 54                	push   r12
      ec5b82:	53                   	push   rbx
      ec5b83:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
      ec5b8a:	49 89 d7             	mov    r15,rdx
      ec5b8d:	49 89 f4             	mov    r12,rsi
      ec5b90:	48 89 fb             	mov    rbx,rdi
      ec5b93:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5b9a:	00 00 
      ec5b9c:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      ec5ba3:	00 
      ec5ba4:	0f 57 c0             	xorps  xmm0,xmm0
      ec5ba7:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ec5baa:	4c 8d 76 18          	lea    r14,[rsi+0x18]
      ec5bae:	4c 89 f7             	mov    rdi,r14
      ec5bb1:	48 89 d6             	mov    rsi,rdx
      ec5bb4:	e8 21 cf ff ff       	call   ec2ada <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89ef0>
      ec5bb9:	48 85 c0             	test   rax,rax
      ec5bbc:	74 28                	je     ec5be6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cffc>
      ec5bbe:	0f 10 40 28          	movups xmm0,XMMWORD PTR [rax+0x28]
      ec5bc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5bc9:	00 00 
      ec5bcb:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
      ec5bd2:	00 
      ec5bd3:	0f 85 30 01 00 00    	jne    ec5d09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d11f>
      ec5bd9:	48 89 df             	mov    rdi,rbx
      ec5bdc:	e8 55 8f c1 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      ec5be1:	e9 c5 00 00 00       	jmp    ec5cab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d0c1>
      ec5be6:	4d 8b 64 24 08       	mov    r12,QWORD PTR [r12+0x8]
      ec5beb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ec5bf0:	4c 89 fe             	mov    rsi,r15
      ec5bf3:	e8 48 83 92 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ec5bf8:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      ec5bfd:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
      ec5c02:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
      ec5c06:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      ec5c0b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      ec5c0e:	0f 57 c0             	xorps  xmm0,xmm0
      ec5c11:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      ec5c16:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      ec5c1c:	0f 11 42 18          	movups XMMWORD PTR [rdx+0x18],xmm0
      ec5c20:	0f 11 42 28          	movups XMMWORD PTR [rdx+0x28],xmm0
      ec5c24:	0f 11 42 38          	movups XMMWORD PTR [rdx+0x38],xmm0
      ec5c28:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      ec5c2c:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      ec5c33:	00 
      ec5c34:	4c 89 e6             	mov    rsi,r12
      ec5c37:	ff 50 20             	call   QWORD PTR [rax+0x20]
      ec5c3a:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
      ec5c41:	00 
      ec5c42:	48 89 df             	mov    rdi,rbx
      ec5c45:	4c 89 e6             	mov    rsi,r12
      ec5c48:	e8 cf 3b bf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ec5c4d:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      ec5c52:	e8 2f 88 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5c57:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ec5c5c:	e8 2d 87 1e 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
      ec5c61:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ec5c66:	e8 25 82 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ec5c6b:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
      ec5c6f:	74 27                	je     ec5c98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d0ae>
      ec5c71:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec5c76:	4c 89 fe             	mov    rsi,r15
      ec5c79:	e8 c2 82 92 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ec5c7e:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      ec5c83:	4c 89 f7             	mov    rdi,r14
      ec5c86:	48 89 da             	mov    rdx,rbx
      ec5c89:	e8 6e ba ff ff       	call   ec16fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88b12>
      ec5c8e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec5c93:	e8 f8 81 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ec5c98:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5c9f:	00 00 
      ec5ca1:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
      ec5ca8:	00 
      ec5ca9:	75 5e                	jne    ec5d09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d11f>
      ec5cab:	48 89 d8             	mov    rax,rbx
      ec5cae:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
      ec5cb5:	5b                   	pop    rbx
      ec5cb6:	41 5c                	pop    r12
      ec5cb8:	41 5e                	pop    r14
      ec5cba:	41 5f                	pop    r15
      ec5cbc:	c3                   	ret

### direct callers/xrefs (0)

## Method 0xec5d0e
      ec5d0e:	53                   	push   rbx
      ec5d0f:	48 89 fb             	mov    rbx,rdi
      ec5d12:	48 8d 05 cf ce 96 00 	lea    rax,[rip+0x96cecf]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
      ec5d19:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec5d1c:	48 81 c7 88 00 00 00 	add    rdi,0x88
      ec5d23:	e8 ac 3e 91 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      ec5d28:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
      ec5d2c:	e8 d3 f7 ff ff       	call   ec5504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c91a>
      ec5d31:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      ec5d35:	e8 aa cf ff ff       	call   ec2ce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a0fa>
      ec5d3a:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      ec5d3e:	5b                   	pop    rbx
      ec5d3f:	e9 42 87 bd ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5d44:	53                   	push   rbx
      ec5d45:	48 89 fb             	mov    rbx,rdi
      ec5d48:	e8 c1 ff ff ff       	call   ec5d0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d124>
      ec5d4d:	48 89 df             	mov    rdi,rbx
      ec5d50:	5b                   	pop    rbx
      ec5d51:	e9 ca 81 92 00       	jmp    17edf20 <_ZdlPv@plt>
      ec5d56:	41 57                	push   r15
      ec5d58:	41 56                	push   r14
      ec5d5a:	41 54                	push   r12
      ec5d5c:	53                   	push   rbx
      ec5d5d:	48 83 ec 28          	sub    rsp,0x28
      ec5d61:	49 89 f4             	mov    r12,rsi
      ec5d64:	48 89 fb             	mov    rbx,rdi
      ec5d67:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5d6e:	00 00 
      ec5d70:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ec5d75:	6a 68                	push   0x68
      ec5d77:	5f                   	pop    rdi
      ec5d78:	e8 83 81 92 00       	call   17edf00 <_Znwm@plt>
      ec5d7d:	49 89 c6             	mov    r14,rax
      ec5d80:	0f 57 c0             	xorps  xmm0,xmm0
      ec5d83:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      ec5d87:	48 8d 05 9a ce 96 00 	lea    rax,[rip+0x96ce9a]        # 1832c28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bc0>
      ec5d8e:	49 89 06             	mov    QWORD PTR [r14],rax
      ec5d91:	4d 89 f7             	mov    r15,r14
      ec5d94:	49 83 c7 18          	add    r15,0x18
      ec5d98:	41 8b 04 24          	mov    eax,DWORD PTR [r12]
      ec5d9c:	41 0f 10 4c 24 08    	movups xmm1,XMMWORD PTR [r12+0x8]
      ec5da2:	41 0f 11 44 24 08    	movups XMMWORD PTR [r12+0x8],xmm0
      ec5da8:	49 8b 4c 24 18       	mov    rcx,QWORD PTR [r12+0x18]
      ec5dad:	41 c6 46 60 00       	mov    BYTE PTR [r14+0x60],0x0
      ec5db2:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
      ec5db7:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
      ec5dbc:	41 0f 11 46 31       	movups XMMWORD PTR [r14+0x31],xmm0
      ec5dc1:	49 89 e4             	mov    r12,rsp
      ec5dc4:	41 89 04 24          	mov    DWORD PTR [r12],eax
      ec5dc8:	41 0f 11 4c 24 08    	movups XMMWORD PTR [r12+0x8],xmm1
      ec5dce:	49 89 4c 24 18       	mov    QWORD PTR [r12+0x18],rcx
      ec5dd3:	6a 01                	push   0x1
      ec5dd5:	5a                   	pop    rdx
      ec5dd6:	4c 89 ff             	mov    rdi,r15
      ec5dd9:	4c 89 e6             	mov    rsi,r12
      ec5ddc:	e8 c5 f8 ff ff       	call   ec56a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cabc>
      ec5de1:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]
      ec5de6:	e8 9b 86 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5deb:	31 ff                	xor    edi,edi
      ec5ded:	e8 94 86 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5df2:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      ec5df5:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
      ec5df9:	31 ff                	xor    edi,edi
      ec5dfb:	e8 1c 86 bd ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ec5e00:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5e07:	00 00 
      ec5e09:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ec5e0e:	75 0c                	jne    ec5e1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d232>
      ec5e10:	48 83 c4 28          	add    rsp,0x28
      ec5e14:	5b                   	pop    rbx
      ec5e15:	41 5c                	pop    r12
      ec5e17:	41 5e                	pop    r14
      ec5e19:	41 5f                	pop    r15
      ec5e1b:	c3                   	ret

### direct callers/xrefs (1)
- 0xec5d48: call   ec5d0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d124>

## Method 0xec5d44
      ec5d44:	53                   	push   rbx
      ec5d45:	48 89 fb             	mov    rbx,rdi
      ec5d48:	e8 c1 ff ff ff       	call   ec5d0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d124>
      ec5d4d:	48 89 df             	mov    rdi,rbx
      ec5d50:	5b                   	pop    rbx
      ec5d51:	e9 ca 81 92 00       	jmp    17edf20 <_ZdlPv@plt>
      ec5d56:	41 57                	push   r15
      ec5d58:	41 56                	push   r14
      ec5d5a:	41 54                	push   r12
      ec5d5c:	53                   	push   rbx
      ec5d5d:	48 83 ec 28          	sub    rsp,0x28
      ec5d61:	49 89 f4             	mov    r12,rsi
      ec5d64:	48 89 fb             	mov    rbx,rdi
      ec5d67:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5d6e:	00 00 
      ec5d70:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ec5d75:	6a 68                	push   0x68
      ec5d77:	5f                   	pop    rdi
      ec5d78:	e8 83 81 92 00       	call   17edf00 <_Znwm@plt>
      ec5d7d:	49 89 c6             	mov    r14,rax
      ec5d80:	0f 57 c0             	xorps  xmm0,xmm0
      ec5d83:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      ec5d87:	48 8d 05 9a ce 96 00 	lea    rax,[rip+0x96ce9a]        # 1832c28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bc0>
      ec5d8e:	49 89 06             	mov    QWORD PTR [r14],rax
      ec5d91:	4d 89 f7             	mov    r15,r14
      ec5d94:	49 83 c7 18          	add    r15,0x18
      ec5d98:	41 8b 04 24          	mov    eax,DWORD PTR [r12]
      ec5d9c:	41 0f 10 4c 24 08    	movups xmm1,XMMWORD PTR [r12+0x8]
      ec5da2:	41 0f 11 44 24 08    	movups XMMWORD PTR [r12+0x8],xmm0
      ec5da8:	49 8b 4c 24 18       	mov    rcx,QWORD PTR [r12+0x18]
      ec5dad:	41 c6 46 60 00       	mov    BYTE PTR [r14+0x60],0x0
      ec5db2:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
      ec5db7:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
      ec5dbc:	41 0f 11 46 31       	movups XMMWORD PTR [r14+0x31],xmm0
      ec5dc1:	49 89 e4             	mov    r12,rsp
      ec5dc4:	41 89 04 24          	mov    DWORD PTR [r12],eax
      ec5dc8:	41 0f 11 4c 24 08    	movups XMMWORD PTR [r12+0x8],xmm1
      ec5dce:	49 89 4c 24 18       	mov    QWORD PTR [r12+0x18],rcx
      ec5dd3:	6a 01                	push   0x1
      ec5dd5:	5a                   	pop    rdx
      ec5dd6:	4c 89 ff             	mov    rdi,r15
      ec5dd9:	4c 89 e6             	mov    rsi,r12
      ec5ddc:	e8 c5 f8 ff ff       	call   ec56a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cabc>
      ec5de1:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]
      ec5de6:	e8 9b 86 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5deb:	31 ff                	xor    edi,edi
      ec5ded:	e8 94 86 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5df2:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      ec5df5:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
      ec5df9:	31 ff                	xor    edi,edi
      ec5dfb:	e8 1c 86 bd ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ec5e00:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5e07:	00 00 
      ec5e09:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ec5e0e:	75 0c                	jne    ec5e1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d232>
      ec5e10:	48 83 c4 28          	add    rsp,0x28
      ec5e14:	5b                   	pop    rbx
      ec5e15:	41 5c                	pop    r12
      ec5e17:	41 5e                	pop    r14
      ec5e19:	41 5f                	pop    r15
      ec5e1b:	c3                   	ret

### direct callers/xrefs (0)

## Method 0xfec460
      fec460:	55                   	push   rbp
      fec461:	41 57                	push   r15
      fec463:	41 56                	push   r14
      fec465:	41 55                	push   r13
      fec467:	41 54                	push   r12
      fec469:	53                   	push   rbx
      fec46a:	48 83 ec 58          	sub    rsp,0x58
      fec46e:	49 89 d4             	mov    r12,rdx
      fec471:	49 89 f5             	mov    r13,rsi
      fec474:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      fec479:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec480:	00 00 
      fec482:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      fec487:	48 8d 6e 18          	lea    rbp,[rsi+0x18]
      fec48b:	48 8d 5e 30          	lea    rbx,[rsi+0x30]
      fec48f:	6a 58                	push   0x58
      fec491:	5f                   	pop    rdi
      fec492:	e8 69 1a 80 00       	call   17edf00 <_Znwm@plt>
      fec497:	49 89 c6             	mov    r14,rax
      fec49a:	0f 57 c0             	xorps  xmm0,xmm0
      fec49d:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fec4a1:	48 8d 05 90 77 85 00 	lea    rax,[rip+0x857790]        # 1843c38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320>
      fec4a8:	49 89 06             	mov    QWORD PTR [r14],rax
      fec4ab:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      fec4af:	48 89 ef             	mov    rdi,rbp
      fec4b2:	e8 7f f3 a8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      fec4b7:	48 8d 0d 35 a8 37 ff 	lea    rcx,[rip+0xffffffffff37a835]        # 366cf3 <_ZTSSt12bad_any_cast@@Base-0x294d5>
      fec4be:	6a 12                	push   0x12
      fec4c0:	41 58                	pop    r8
      fec4c2:	4c 89 ff             	mov    rdi,r15
      fec4c5:	48 89 c6             	mov    rsi,rax
      fec4c8:	49 89 d9             	mov    r9,rbx
      fec4cb:	e8 f4 f7 67 00       	call   166bcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fe30>
      fec4d0:	31 ff                	xor    edi,edi
      fec4d2:	e8 45 1f ab ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      fec4d7:	49 8b 75 08          	mov    rsi,QWORD PTR [r13+0x8]
      fec4db:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fec4de:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fec4e3:	4c 89 e2             	mov    rdx,r12
      fec4e6:	ff 10                	call   QWORD PTR [rax]
      fec4e8:	4c 89 f0             	mov    rax,r14
      fec4eb:	48 83 c0 08          	add    rax,0x8
      fec4ef:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      fec4f3:	48 83 7c 24 10 00    	cmp    QWORD PTR [rsp+0x10],0x0
      fec4f9:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      fec4fe:	74 3a                	je     fec53a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3950>
      fec500:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      fec505:	e8 1f 99 ed ff       	call   ec5e29 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d23f>
      fec50a:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
      fec50f:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fec513:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      fec518:	e8 19 26 af ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      fec51d:	4c 8b 64 24 48       	mov    r12,QWORD PTR [rsp+0x48]
      fec522:	4d 85 e4             	test   r12,r12
      fec525:	74 1f                	je     fec546 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b395c>
      fec527:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      fec52d:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      fec532:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      fec538:	eb 11                	jmp    fec54b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3961>
      fec53a:	0f 57 c0             	xorps  xmm0,xmm0
      fec53d:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
      fec541:	e9 c7 00 00 00       	jmp    fec60d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3a23>
      fec546:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      fec54b:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
      fec550:	4c 89 64 24 28       	mov    QWORD PTR [rsp+0x28],r12
      fec555:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      fec55a:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
      fec55f:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      fec564:	6a 30                	push   0x30
      fec566:	5f                   	pop    rdi
      fec567:	e8 94 19 80 00       	call   17edf00 <_Znwm@plt>
      fec56c:	48 8d 4c 24 30       	lea    rcx,[rsp+0x30]
      fec571:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
      fec575:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
      fec579:	4d 85 e4             	test   r12,r12
      fec57c:	74 06                	je     fec584 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b399a>
      fec57e:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      fec584:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
      fec588:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      fec58c:	0f 57 c0             	xorps  xmm0,xmm0
      fec58f:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
      fec592:	48 8d 0d 7f 02 00 00 	lea    rcx,[rip+0x27f]        # fec818 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3c2e>
      fec599:	48 89 08             	mov    QWORD PTR [rax],rcx
      fec59c:	48 8d 0d 4d c9 f2 ff 	lea    rcx,[rip+0xfffffffffff2c94d]        # f18ef0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0306>
      fec5a3:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      fec5a7:	4c 89 ef             	mov    rdi,r13
      fec5aa:	48 89 c6             	mov    rsi,rax
      fec5ad:	e8 fe ae f3 ff       	call   f274b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee8c6>
      fec5b2:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
      fec5b7:	48 89 df             	mov    rdi,rbx
      fec5ba:	e8 05 e3 e0 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
      fec5bf:	0f 57 c0             	xorps  xmm0,xmm0
      fec5c2:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
      fec5c5:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fec5ca:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
      fec5cf:	48 89 de             	mov    rsi,rbx
      fec5d2:	e8 45 d2 ac ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fec5d7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      fec5db:	e8 a6 1e ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec5e0:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
      fec5e5:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
      fec5ea:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
      fec5ee:	4d 85 ff             	test   r15,r15
      fec5f1:	74 0a                	je     fec5fd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3a13>
      fec5f3:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      fec5f8:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
      fec5fd:	4c 89 e7             	mov    rdi,r12
      fec600:	e8 ad 1e ab ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fec605:	4c 89 ff             	mov    rdi,r15
      fec608:	e8 79 1e ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec60d:	4c 89 f7             	mov    rdi,r14
      fec610:	e8 71 1e ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec615:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fec61a:	e8 67 1e ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec61f:	4c 89 f7             	mov    rdi,r14
      fec622:	e8 5f 1e ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec627:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec62e:	00 00 
      fec630:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
      fec635:	75 54                	jne    fec68b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3aa1>
      fec637:	48 89 e8             	mov    rax,rbp
      fec63a:	48 83 c4 58          	add    rsp,0x58
      fec63e:	5b                   	pop    rbx
      fec63f:	41 5c                	pop    r12
      fec641:	41 5d                	pop    r13
      fec643:	41 5e                	pop    r14
      fec645:	41 5f                	pop    r15
      fec647:	5d                   	pop    rbp
      fec648:	c3                   	ret

### direct callers/xrefs (0)

## Method 0xfec690
      fec690:	41 57                	push   r15
      fec692:	41 56                	push   r14
      fec694:	53                   	push   rbx
      fec695:	48 83 ec 50          	sub    rsp,0x50
      fec699:	49 89 d6             	mov    r14,rdx
      fec69c:	49 89 f7             	mov    r15,rsi
      fec69f:	48 89 fb             	mov    rbx,rdi
      fec6a2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec6a9:	00 00 
      fec6ab:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      fec6b0:	48 8d 7e 18          	lea    rdi,[rsi+0x18]
      fec6b4:	e8 7d f1 a8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      fec6b9:	4d 8d 4f 30          	lea    r9,[r15+0x30]
      fec6bd:	48 8d 0d 8a e3 39 ff 	lea    rcx,[rip+0xffffffffff39e38a]        # 38aa4e <_ZTSSt12bad_any_cast@@Base-0x577a>
      fec6c4:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fec6c9:	6a 12                	push   0x12
      fec6cb:	41 58                	pop    r8
      fec6cd:	48 89 c6             	mov    rsi,rax
      fec6d0:	e8 ef f5 67 00       	call   166bcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fe30>
      fec6d5:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
      fec6d9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fec6dc:	48 89 df             	mov    rdi,rbx
      fec6df:	4c 89 f2             	mov    rdx,r14
      fec6e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      fec6e5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fec6ea:	e8 e1 f6 67 00       	call   166bdd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff3c>
      fec6ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec6f6:	00 00 
      fec6f8:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      fec6fd:	75 32                	jne    fec731 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3b47>
      fec6ff:	48 89 d8             	mov    rax,rbx
      fec702:	48 83 c4 50          	add    rsp,0x50
      fec706:	5b                   	pop    rbx
      fec707:	41 5e                	pop    r14
      fec709:	41 5f                	pop    r15
      fec70b:	c3                   	ret

### direct callers/xrefs (0)

## Method 0xfec736
      fec736:	41 57                	push   r15
      fec738:	41 56                	push   r14
      fec73a:	53                   	push   rbx
      fec73b:	48 83 ec 50          	sub    rsp,0x50
      fec73f:	49 89 d6             	mov    r14,rdx
      fec742:	49 89 f7             	mov    r15,rsi
      fec745:	48 89 fb             	mov    rbx,rdi
      fec748:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec74f:	00 00 
      fec751:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      fec756:	48 8d 7e 18          	lea    rdi,[rsi+0x18]
      fec75a:	e8 d7 f0 a8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      fec75f:	4d 8d 4f 30          	lea    r9,[r15+0x30]
      fec763:	48 8d 0d 21 65 36 ff 	lea    rcx,[rip+0xffffffffff366521]        # 352c8b <_ZTSSt12bad_any_cast@@Base-0x3d53d>
      fec76a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fec76f:	6a 10                	push   0x10
      fec771:	41 58                	pop    r8
      fec773:	48 89 c6             	mov    rsi,rax
      fec776:	e8 49 f5 67 00       	call   166bcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fe30>
      fec77b:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
      fec77f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fec782:	48 89 df             	mov    rdi,rbx
      fec785:	4c 89 f2             	mov    rdx,r14
      fec788:	ff 50 10             	call   QWORD PTR [rax+0x10]
      fec78b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fec790:	e8 3b f6 67 00       	call   166bdd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff3c>
      fec795:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec79c:	00 00 
      fec79e:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      fec7a3:	75 32                	jne    fec7d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3bed>
      fec7a5:	48 89 d8             	mov    rax,rbx
      fec7a8:	48 83 c4 50          	add    rsp,0x50
      fec7ac:	5b                   	pop    rbx
      fec7ad:	41 5e                	pop    r14
      fec7af:	41 5f                	pop    r15
      fec7b1:	c3                   	ret

### direct callers/xrefs (0)

## Method 0xfec7dc
      fec7dc:	53                   	push   rbx
      fec7dd:	48 89 fb             	mov    rbx,rdi
      fec7e0:	48 8d 05 11 74 85 00 	lea    rax,[rip+0x857411]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      fec7e7:	48 89 07             	mov    QWORD PTR [rdi],rax
      fec7ea:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
      fec7ee:	e8 93 1c ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec7f3:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      fec7f7:	e8 94 16 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fec7fc:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      fec800:	5b                   	pop    rbx
      fec801:	e9 80 1c ab ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec806:	53                   	push   rbx
      fec807:	48 89 fb             	mov    rbx,rdi
      fec80a:	e8 cd ff ff ff       	call   fec7dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3bf2>
      fec80f:	48 89 df             	mov    rdi,rbx
      fec812:	5b                   	pop    rbx
      fec813:	e9 08 17 80 00       	jmp    17edf20 <_ZdlPv@plt>
      fec818:	55                   	push   rbp
      fec819:	41 57                	push   r15
      fec81b:	41 56                	push   r14
      fec81d:	41 55                	push   r13
      fec81f:	41 54                	push   r12
      fec821:	53                   	push   rbx
      fec822:	48 83 ec 48          	sub    rsp,0x48
      fec826:	89 d5                	mov    ebp,edx
      fec828:	49 89 f7             	mov    r15,rsi
      fec82b:	49 89 fe             	mov    r14,rdi
      fec82e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec835:	00 00 
      fec837:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      fec83c:	49 83 c6 10          	add    r14,0x10
      fec840:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
      fec845:	48 89 df             	mov    rdi,rbx
      fec848:	4c 89 f6             	mov    rsi,r14
      fec84b:	e8 e0 ea ab ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      fec850:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
      fec853:	48 85 db             	test   rbx,rbx
      fec856:	0f 84 2e 01 00 00    	je     fec98a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3da0>
      fec85c:	40 84 ed             	test   bpl,bpl
      fec85f:	74 23                	je     fec884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3c9a>
      fec861:	0f 57 c0             	xorps  xmm0,xmm0
      fec864:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
      fec869:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      fec86e:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fec872:	4c 89 e6             	mov    rsi,r12
      fec875:	e8 a2 cf ac ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fec87a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fec87f:	e8 02 1c ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec884:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fec889:	4c 89 fe             	mov    rsi,r15
      fec88c:	e8 c5 94 ed ff       	call   ec5d56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d16c>
      fec891:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      fec895:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      fec899:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
      fec89d:	4d 85 f6             	test   r14,r14
      fec8a0:	74 05                	je     fec8a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3cbd>
      fec8a2:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8a7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      fec8ac:	4d 85 ff             	test   r15,r15
      fec8af:	74 75                	je     fec926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d3c>
      fec8b1:	6a 28                	push   0x28
      fec8b3:	5f                   	pop    rdi
      fec8b4:	e8 47 16 80 00       	call   17edf00 <_Znwm@plt>
      fec8b9:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      fec8bd:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      fec8c1:	4d 85 f6             	test   r14,r14
      fec8c4:	74 05                	je     fec8cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3ce1>
      fec8c6:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8cb:	40 88 68 20          	mov    BYTE PTR [rax+0x20],bpl
      fec8cf:	48 8d 0d ea 00 00 00 	lea    rcx,[rip+0xea]        # fec9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3dd6>
      fec8d6:	48 89 08             	mov    QWORD PTR [rax],rcx
      fec8d9:	48 8d 0d d8 2f b5 ff 	lea    rcx,[rip+0xffffffffffb52fd8]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
      fec8e0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      fec8e4:	4c 89 ff             	mov    rdi,r15
      fec8e7:	48 89 c6             	mov    rsi,rax
      fec8ea:	e8 c1 ab f3 ff       	call   f274b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee8c6>
      fec8ef:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fec8f4:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
      fec8f8:	0f 57 c0             	xorps  xmm0,xmm0
      fec8fb:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      fec8fe:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
      fec903:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      fec908:	4c 89 ee             	mov    rsi,r13
      fec90b:	e8 0c cf ac ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fec910:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      fec914:	e8 6d 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec919:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
      fec91d:	76 11                	jbe    fec930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d46>
      fec91f:	31 c0                	xor    eax,eax
      fec921:	45 31 ff             	xor    r15d,r15d
      fec924:	eb 1c                	jmp    fec942 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d58>
      fec926:	0f 57 c0             	xorps  xmm0,xmm0
      fec929:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      fec92e:	eb 2b                	jmp    fec95b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d71>
      fec930:	4d 85 e4             	test   r12,r12
      fec933:	74 0b                	je     fec940 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d56>
      fec935:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fec93b:	4c 89 e0             	mov    rax,r12
      fec93e:	eb 02                	jmp    fec942 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d58>
      fec940:	31 c0                	xor    eax,eax
      fec942:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      fec947:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      fec94c:	31 ff                	xor    edi,edi
      fec94e:	e8 33 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec953:	4c 89 e7             	mov    rdi,r12
      fec956:	e8 2b 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec95b:	48 83 c3 18          	add    rbx,0x18
      fec95f:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
      fec964:	48 89 df             	mov    rdi,rbx
      fec967:	4c 89 fe             	mov    rsi,r15
      fec96a:	e8 ad ce ac ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fec96f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      fec973:	e8 0e 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec978:	4c 89 f7             	mov    rdi,r14
      fec97b:	e8 32 1b ab ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fec980:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fec985:	e8 fc 1a ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec98a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      fec98f:	e8 f2 1a ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec994:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec99b:	00 00 
      fec99d:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      fec9a2:	75 0f                	jne    fec9b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3dc9>
      fec9a4:	48 83 c4 48          	add    rsp,0x48
      fec9a8:	5b                   	pop    rbx
      fec9a9:	41 5c                	pop    r12
      fec9ab:	41 5d                	pop    r13
      fec9ad:	41 5e                	pop    r14
      fec9af:	41 5f                	pop    r15
      fec9b1:	5d                   	pop    rbp
      fec9b2:	c3                   	ret

### direct callers/xrefs (1)
- 0xfec80a: call   fec7dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3bf2>

## Method 0xfec806
      fec806:	53                   	push   rbx
      fec807:	48 89 fb             	mov    rbx,rdi
      fec80a:	e8 cd ff ff ff       	call   fec7dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3bf2>
      fec80f:	48 89 df             	mov    rdi,rbx
      fec812:	5b                   	pop    rbx
      fec813:	e9 08 17 80 00       	jmp    17edf20 <_ZdlPv@plt>
      fec818:	55                   	push   rbp
      fec819:	41 57                	push   r15
      fec81b:	41 56                	push   r14
      fec81d:	41 55                	push   r13
      fec81f:	41 54                	push   r12
      fec821:	53                   	push   rbx
      fec822:	48 83 ec 48          	sub    rsp,0x48
      fec826:	89 d5                	mov    ebp,edx
      fec828:	49 89 f7             	mov    r15,rsi
      fec82b:	49 89 fe             	mov    r14,rdi
      fec82e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec835:	00 00 
      fec837:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      fec83c:	49 83 c6 10          	add    r14,0x10
      fec840:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
      fec845:	48 89 df             	mov    rdi,rbx
      fec848:	4c 89 f6             	mov    rsi,r14
      fec84b:	e8 e0 ea ab ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      fec850:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
      fec853:	48 85 db             	test   rbx,rbx
      fec856:	0f 84 2e 01 00 00    	je     fec98a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3da0>
      fec85c:	40 84 ed             	test   bpl,bpl
      fec85f:	74 23                	je     fec884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3c9a>
      fec861:	0f 57 c0             	xorps  xmm0,xmm0
      fec864:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
      fec869:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      fec86e:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fec872:	4c 89 e6             	mov    rsi,r12
      fec875:	e8 a2 cf ac ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fec87a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fec87f:	e8 02 1c ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec884:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fec889:	4c 89 fe             	mov    rsi,r15
      fec88c:	e8 c5 94 ed ff       	call   ec5d56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d16c>
      fec891:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      fec895:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      fec899:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
      fec89d:	4d 85 f6             	test   r14,r14
      fec8a0:	74 05                	je     fec8a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3cbd>
      fec8a2:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8a7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      fec8ac:	4d 85 ff             	test   r15,r15
      fec8af:	74 75                	je     fec926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d3c>
      fec8b1:	6a 28                	push   0x28
      fec8b3:	5f                   	pop    rdi
      fec8b4:	e8 47 16 80 00       	call   17edf00 <_Znwm@plt>
      fec8b9:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      fec8bd:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      fec8c1:	4d 85 f6             	test   r14,r14
      fec8c4:	74 05                	je     fec8cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3ce1>
      fec8c6:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8cb:	40 88 68 20          	mov    BYTE PTR [rax+0x20],bpl
      fec8cf:	48 8d 0d ea 00 00 00 	lea    rcx,[rip+0xea]        # fec9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3dd6>
      fec8d6:	48 89 08             	mov    QWORD PTR [rax],rcx
      fec8d9:	48 8d 0d d8 2f b5 ff 	lea    rcx,[rip+0xffffffffffb52fd8]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
      fec8e0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      fec8e4:	4c 89 ff             	mov    rdi,r15
      fec8e7:	48 89 c6             	mov    rsi,rax
      fec8ea:	e8 c1 ab f3 ff       	call   f274b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee8c6>
      fec8ef:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fec8f4:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
      fec8f8:	0f 57 c0             	xorps  xmm0,xmm0
      fec8fb:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      fec8fe:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
      fec903:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      fec908:	4c 89 ee             	mov    rsi,r13
      fec90b:	e8 0c cf ac ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fec910:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      fec914:	e8 6d 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec919:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
      fec91d:	76 11                	jbe    fec930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d46>
      fec91f:	31 c0                	xor    eax,eax
      fec921:	45 31 ff             	xor    r15d,r15d
      fec924:	eb 1c                	jmp    fec942 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d58>
      fec926:	0f 57 c0             	xorps  xmm0,xmm0
      fec929:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      fec92e:	eb 2b                	jmp    fec95b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d71>
      fec930:	4d 85 e4             	test   r12,r12
      fec933:	74 0b                	je     fec940 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d56>
      fec935:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fec93b:	4c 89 e0             	mov    rax,r12
      fec93e:	eb 02                	jmp    fec942 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d58>
      fec940:	31 c0                	xor    eax,eax
      fec942:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      fec947:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      fec94c:	31 ff                	xor    edi,edi
      fec94e:	e8 33 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec953:	4c 89 e7             	mov    rdi,r12
      fec956:	e8 2b 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec95b:	48 83 c3 18          	add    rbx,0x18
      fec95f:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
      fec964:	48 89 df             	mov    rdi,rbx
      fec967:	4c 89 fe             	mov    rsi,r15
      fec96a:	e8 ad ce ac ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fec96f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      fec973:	e8 0e 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec978:	4c 89 f7             	mov    rdi,r14
      fec97b:	e8 32 1b ab ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fec980:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fec985:	e8 fc 1a ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec98a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      fec98f:	e8 f2 1a ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec994:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec99b:	00 00 
      fec99d:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      fec9a2:	75 0f                	jne    fec9b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3dc9>
      fec9a4:	48 83 c4 48          	add    rsp,0x48
      fec9a8:	5b                   	pop    rbx
      fec9a9:	41 5c                	pop    r12
      fec9ab:	41 5d                	pop    r13
      fec9ad:	41 5e                	pop    r14
      fec9af:	41 5f                	pop    r15
      fec9b1:	5d                   	pop    rbp
      fec9b2:	c3                   	ret

### direct callers/xrefs (0)

## Carrier methods: accesses relative to this
### slot +0x0 target 0xfec460
      fec4ab:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      fec4d7:	49 8b 75 08          	mov    rsi,QWORD PTR [r13+0x8]
      fec50f:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fec527:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      fec532:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      fec55f:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      fec57e:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      fec5d7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      fec5f3:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      fec6b9:	4d 8d 4f 30          	lea    r9,[r15+0x30]
      fec6d5:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]

### slot +0x8 target 0xfec690
      fec6b9:	4d 8d 4f 30          	lea    r9,[r15+0x30]
      fec6d5:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
      fec75f:	4d 8d 4f 30          	lea    r9,[r15+0x30]
      fec77b:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
      fec7ea:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
      fec7f3:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      fec7fc:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      fec86e:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fec87a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fec899:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
      fec8a2:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8c6:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8f4:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
      fec910:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]

### slot +0x10 target 0xfec736
      fec75f:	4d 8d 4f 30          	lea    r9,[r15+0x30]
      fec77b:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
      fec7ea:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
      fec7f3:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      fec7fc:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      fec86e:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fec87a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fec899:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
      fec8a2:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8c6:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8f4:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
      fec910:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      fec935:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fec96f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]

### slot +0x18 target 0xb8854e

### slot +0x20 target 0xfec7dc
      fec7ea:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
      fec7f3:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      fec7fc:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      fec86e:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fec87a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fec899:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
      fec8a2:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8c6:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8f4:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
      fec910:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      fec935:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fec96f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      fec9e1:	48 8d 77 10          	lea    rsi,[rdi+0x10]
      feca05:	41 0f 10 47 08       	movups xmm0,XMMWORD PTR [r15+0x8]
      feca0a:	41 0f 11 44 24 08    	movups XMMWORD PTR [r12+0x8],xmm0
      feca13:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
      feca18:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
      feca1c:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      feca21:	41 80 7e 20 00       	cmp    BYTE PTR [r14+0x20],0x0
      feca36:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]

### slot +0x28 target 0xfec806
      fec86e:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fec87a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fec899:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
      fec8a2:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8c6:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      fec8f4:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
      fec910:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      fec935:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fec96f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      fec9e1:	48 8d 77 10          	lea    rsi,[rdi+0x10]
      feca05:	41 0f 10 47 08       	movups xmm0,XMMWORD PTR [r15+0x8]
      feca0a:	41 0f 11 44 24 08    	movups XMMWORD PTR [r12+0x8],xmm0
      feca13:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
      feca18:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
      feca1c:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      feca21:	41 80 7e 20 00       	cmp    BYTE PTR [r14+0x20],0x0
      feca36:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]

## P methods: accesses to this+0x40 / outer+0x58
### slot +0x0 target 0xec57ee
      ec5914:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx

### slot +0x8 target 0xec5afe
      ec5bfd:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
      ec5c57:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ec5ccc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]

### slot +0x10 target 0xec5b7c
      ec5bfd:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
      ec5c57:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ec5ccc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ec5e5a:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0

### slot +0x18 target 0xde01ca

### slot +0x20 target 0xec5d0e
      ec5e5a:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0

### slot +0x28 target 0xec5d44
      ec5e5a:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0

## Indirect calls at carrier six slot offsets in giant factory e92f2c..e98f3b
### 0xe930da: call   QWORD PTR [rax+0x28]
      e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
      e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
      e93098:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e9309c:	48 8d 1d 3d b8 97 00 	lea    rbx,[rip+0x97b83d]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e930a3:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
      e930a8:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      e930ad:	0f 85 ca 01 00 00    	jne    e9327d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a693>
      e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]
      e930ba:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e930c1:	00 
      e930c2:	48 89 1e             	mov    QWORD PTR [rsi],rbx
      e930c5:	48 8b 05 d4 e9 a1 00 	mov    rax,QWORD PTR [rip+0xa1e9d4]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e930cc:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e930d0:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      e930d4:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e930d7:	4c 89 ff             	mov    rdi,r15
      e930da:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
      e930e4:	00 
      e930e5:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]
      e930ec:	00 
      e930ed:	48 85 c0             	test   rax,rax
      e930f0:	74 0f                	je     e93101 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a517>
      e930f2:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      e930f7:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      e930fc:	48 89 c3             	mov    rbx,rax
      e930ff:	eb 02                	jmp    e93103 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a519>
      e93101:	31 db                	xor    ebx,ebx
      e93103:	66 0f ef c0          	pxor   xmm0,xmm0
      e93107:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
      e9310e:	00 00 
      e93110:	48 83 a4 24 60 10 00 	and    QWORD PTR [rsp+0x1060],0x0
      e93117:	00 00 
      e93119:	4c 8d 84 24 10 0e 00 	lea    r8,[rsp+0xe10]
      e93120:	00 
      e93121:	4d 89 30             	mov    QWORD PTR [r8],r14
      e93124:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
      e93128:	4d 89 78 10          	mov    QWORD PTR [r8+0x10],r15

### 0xe9370a: call   QWORD PTR [rax+0x10]
      e936d1:	00 
      e936d2:	4d 89 28             	mov    QWORD PTR [r8],r13
      e936d5:	48 8d 35 b5 99 c0 ff 	lea    rsi,[rip+0xffffffffffc099b5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e936dc:	48 8d 0d ab 65 17 00 	lea    rcx,[rip+0x1765ab]        # 1009c8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d10a4>
      e936e3:	4c 8d a4 24 e0 0b 00 	lea    r12,[rsp+0xbe0]
      e936ea:	00 
      e936eb:	6a 08                	push   0x8
      e936ed:	41 59                	pop    r9
      e936ef:	4c 89 e7             	mov    rdi,r12
      e936f2:	31 d2                	xor    edx,edx
      e936f4:	e8 9b 70 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e936f9:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e936fc:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e93703:	00 
      e93704:	4c 89 fe             	mov    rsi,r15
      e93707:	4c 89 e2             	mov    rdx,r12
      e9370a:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e9370d:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      e93711:	4c 8d bc 24 30 0a 00 	lea    r15,[rsp+0xa30]
      e93718:	00 
      e93719:	4c 89 fe             	mov    rsi,r15
      e9371c:	e8 1d 63 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e93721:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e93725:	e8 5c ad c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9372a:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93731:	00 
      e93732:	e8 b1 70 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e93737:	49 8d 7e 78          	lea    rdi,[r14+0x78]
      e9373b:	66 0f ef c0          	pxor   xmm0,xmm0
      e9373f:	f3 41 0f 7f 46 60    	movdqu XMMWORD PTR [r14+0x60],xmm0
      e93745:	f3 41 0f 7f 46 50    	movdqu XMMWORD PTR [r14+0x50],xmm0
      e9374b:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
      e93751:	41 c6 46 70 00       	mov    BYTE PTR [r14+0x70],0x0
      e93756:	e8 33 4b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e9375b:	48 89 df             	mov    rdi,rbx
      e9375e:	e8 23 ad c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93763:	31 ff                	xor    edi,edi
      e93765:	e8 b2 ac c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>

### 0xe93832: call   QWORD PTR [rax+0x8]
      e937f4:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
      e937fb:	00 
      e937fc:	e8 8d 4a c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93801:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e93808:	00 
      e93809:	4c 89 26             	mov    QWORD PTR [rsi],r12
      e9380c:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
      e93810:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e93817:	00 
      e93818:	48 89 ef             	mov    rdi,rbp
      e9381b:	e8 c2 b0 15 00       	call   fee8e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b5cf8>
      e93820:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e93824:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e9382b:	00 
      e9382c:	4c 89 ee             	mov    rsi,r13
      e9382f:	48 89 ea             	mov    rdx,rbp
      e93832:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e93835:	4c 8d ac 24 30 0a 00 	lea    r13,[rsp+0xa30]
      e9383c:	00 
      e9383d:	4c 89 f7             	mov    rdi,r14
      e93840:	4c 89 ee             	mov    rsi,r13
      e93843:	e8 aa 63 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e93848:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      e9384c:	e8 35 ac c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93851:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93858:	00 
      e93859:	e8 8a 6f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9385e:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
      e93862:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e93869:	00 
      e9386a:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e93871:	00 
      e93872:	48 89 ef             	mov    rdi,rbp
      e93875:	e8 68 b0 15 00       	call   fee8e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b5cf8>
      e9387a:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e9387e:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e93885:	00 
      e93886:	4c 89 ee             	mov    rsi,r13

### 0xe9388c: call   QWORD PTR [rax+0x8]
      e9384c:	e8 35 ac c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93851:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93858:	00 
      e93859:	e8 8a 6f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9385e:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
      e93862:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e93869:	00 
      e9386a:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e93871:	00 
      e93872:	48 89 ef             	mov    rdi,rbp
      e93875:	e8 68 b0 15 00       	call   fee8e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b5cf8>
      e9387a:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e9387e:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e93885:	00 
      e93886:	4c 89 ee             	mov    rsi,r13
      e93889:	48 89 ea             	mov    rdx,rbp
      e9388c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e9388f:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e93896:	00 
      e93897:	4c 89 ff             	mov    rdi,r15
      e9389a:	4c 89 f6             	mov    rsi,r14
      e9389d:	e8 50 63 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e938a2:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      e938a6:	e8 db ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e938ab:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e938b2:	00 
      e938b3:	e8 30 6f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e938b8:	31 ff                	xor    edi,edi
      e938ba:	e8 c7 ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e938bf:	31 ff                	xor    edi,edi
      e938c1:	e8 c0 ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e938c6:	31 ff                	xor    edi,edi
      e938c8:	e8 4f ab c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e938cd:	6a 48                	push   0x48
      e938cf:	5f                   	pop    rdi
      e938d0:	e8 2b a6 95 00       	call   17edf00 <_Znwm@plt>
      e938d5:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      e938da:	49 89 c6             	mov    r14,rax

### 0xe9402e: call   QWORD PTR [rax+0x10]
      e93ff0:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
      e93ff5:	4d 89 28             	mov    QWORD PTR [r8],r13
      e93ff8:	48 8d 35 92 90 c0 ff 	lea    rsi,[rip+0xffffffffffc09092]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e93fff:	48 8d 0d a2 8c 15 00 	lea    rcx,[rip+0x158ca2]        # fecca8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b40be>
      e94006:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e9400d:	00 
      e9400e:	6a 08                	push   0x8
      e94010:	41 59                	pop    r9
      e94012:	48 89 df             	mov    rdi,rbx
      e94015:	31 d2                	xor    edx,edx
      e94017:	e8 78 67 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e9401c:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
      e94020:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e94027:	00 
      e94028:	4c 89 f6             	mov    rsi,r14
      e9402b:	48 89 da             	mov    rdx,rbx
      e9402e:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e94031:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
      e94038:	00 
      e94039:	4c 8b 7c 24 50       	mov    r15,QWORD PTR [rsp+0x50]
      e9403e:	4c 89 ff             	mov    rdi,r15
      e94041:	48 89 de             	mov    rsi,rbx
      e94044:	e8 a9 5b 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e94049:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e9404d:	e8 34 a4 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94052:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e94059:	00 
      e9405a:	e8 89 67 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9405f:	48 8b 9d 38 01 00 00 	mov    rbx,QWORD PTR [rbp+0x138]
      e94066:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
      e9406d:	00 
      e9406e:	4d 89 28             	mov    QWORD PTR [r8],r13
      e94071:	48 8d 35 19 90 c0 ff 	lea    rsi,[rip+0xffffffffffc09019]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e94078:	48 8d 0d 07 8e 15 00 	lea    rcx,[rip+0x158e07]        # fece86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b429c>
      e9407f:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94086:	00 
      e94087:	6a 08                	push   0x8
      e94089:	41 59                	pop    r9

### 0xe940ae: call   QWORD PTR [rax+0x18]
      e94071:	48 8d 35 19 90 c0 ff 	lea    rsi,[rip+0xffffffffffc09019]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e94078:	48 8d 0d 07 8e 15 00 	lea    rcx,[rip+0x158e07]        # fece86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b429c>
      e9407f:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94086:	00 
      e94087:	6a 08                	push   0x8
      e94089:	41 59                	pop    r9
      e9408b:	4c 89 f7             	mov    rdi,r14
      e9408e:	31 d2                	xor    edx,edx
      e94090:	e8 ff 66 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e94095:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e94098:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e9409f:	00 
      e940a0:	48 89 de             	mov    rsi,rbx
      e940a3:	4c 89 f2             	mov    rdx,r14
      e940a6:	4c 8b a4 24 f8 00 00 	mov    r12,QWORD PTR [rsp+0xf8]
      e940ad:	00 
      e940ae:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e940b1:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
      e940b8:	00 
      e940b9:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e940be:	48 89 de             	mov    rsi,rbx
      e940c1:	e8 2c 5b 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e940c6:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e940ca:	e8 b7 a3 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e940cf:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e940d6:	00 
      e940d7:	e8 0c 67 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e940dc:	48 8b bd d0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xd0]
      e940e3:	e8 7a 63 be ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e940e8:	83 bd 50 01 00 00 00 	cmp    DWORD PTR [rbp+0x150],0x0
      e940ef:	0f 95 c1             	setne  cl
      e940f2:	20 c8                	and    al,cl
      e940f4:	3c 01                	cmp    al,0x1
      e940f6:	75 10                	jne    e94108 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b51e>
      e940f8:	48 8b bd 48 01 00 00 	mov    rdi,QWORD PTR [rbp+0x148]
      e940ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e94102:	6a 01                	push   0x1
      e94104:	5e                   	pop    rsi

### 0xe94105: call   QWORD PTR [rax+0x10]
      e940c6:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e940ca:	e8 b7 a3 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e940cf:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e940d6:	00 
      e940d7:	e8 0c 67 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e940dc:	48 8b bd d0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xd0]
      e940e3:	e8 7a 63 be ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e940e8:	83 bd 50 01 00 00 00 	cmp    DWORD PTR [rbp+0x150],0x0
      e940ef:	0f 95 c1             	setne  cl
      e940f2:	20 c8                	and    al,cl
      e940f4:	3c 01                	cmp    al,0x1
      e940f6:	75 10                	jne    e94108 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b51e>
      e940f8:	48 8b bd 48 01 00 00 	mov    rdi,QWORD PTR [rbp+0x148]
      e940ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e94102:	6a 01                	push   0x1
      e94104:	5e                   	pop    rsi
      e94105:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e94108:	49 8d 44 24 18       	lea    rax,[r12+0x18]
      e9410d:	4c 8b b5 98 00 00 00 	mov    r14,QWORD PTR [rbp+0x98]
      e94114:	48 89 c5             	mov    rbp,rax
      e94117:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
      e9411e:	00 
      e9411f:	4d 89 28             	mov    QWORD PTR [r8],r13
      e94122:	48 8d 35 68 8f c0 ff 	lea    rsi,[rip+0xffffffffffc08f68]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e94129:	48 8d 0d fa 8d 15 00 	lea    rcx,[rip+0x158dfa]        # fecf2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4340>
      e94130:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e94137:	00 
      e94138:	6a 08                	push   0x8
      e9413a:	41 59                	pop    r9
      e9413c:	48 89 df             	mov    rdi,rbx
      e9413f:	31 d2                	xor    edx,edx
      e94141:	e8 4e 66 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e94146:	49 8b 36             	mov    rsi,QWORD PTR [r14]
      e94149:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e9414c:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]
      e94153:	00 
      e94154:	4c 89 f7             	mov    rdi,r14
      e94157:	48 89 da             	mov    rdx,rbx

### 0xe9415a: call   QWORD PTR [rax+0x10]
      e9411f:	4d 89 28             	mov    QWORD PTR [r8],r13
      e94122:	48 8d 35 68 8f c0 ff 	lea    rsi,[rip+0xffffffffffc08f68]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e94129:	48 8d 0d fa 8d 15 00 	lea    rcx,[rip+0x158dfa]        # fecf2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4340>
      e94130:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e94137:	00 
      e94138:	6a 08                	push   0x8
      e9413a:	41 59                	pop    r9
      e9413c:	48 89 df             	mov    rdi,rbx
      e9413f:	31 d2                	xor    edx,edx
      e94141:	e8 4e 66 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e94146:	49 8b 36             	mov    rsi,QWORD PTR [r14]
      e94149:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e9414c:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]
      e94153:	00 
      e94154:	4c 89 f7             	mov    rdi,r14
      e94157:	48 89 da             	mov    rdx,rbx
      e9415a:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e9415d:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e94162:	4c 89 f6             	mov    rsi,r14
      e94165:	e8 88 5a 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e9416a:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      e9416e:	e8 13 a3 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94173:	48 89 df             	mov    rdi,rbx
      e94176:	e8 6d 66 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9417b:	31 ff                	xor    edi,edi
      e9417d:	e8 04 a3 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94182:	31 ff                	xor    edi,edi
      e94184:	e8 fd a2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94189:	31 ff                	xor    edi,edi
      e9418b:	e8 f6 a2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94190:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e94197:	00 
      e94198:	e8 cd 5d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9419d:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      e941a4:	00 
      e941a5:	e8 dc a2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e941aa:	31 ff                	xor    edi,edi
      e941ac:	e8 6b a2 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>

### 0xe941b8: call   QWORD PTR [rax+0x10]
      e9417b:	31 ff                	xor    edi,edi
      e9417d:	e8 04 a3 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94182:	31 ff                	xor    edi,edi
      e94184:	e8 fd a2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94189:	31 ff                	xor    edi,edi
      e9418b:	e8 f6 a2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94190:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e94197:	00 
      e94198:	e8 cd 5d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9419d:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      e941a4:	00 
      e941a5:	e8 dc a2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e941aa:	31 ff                	xor    edi,edi
      e941ac:	e8 6b a2 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e941b1:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e941b5:	48 89 ef             	mov    rdi,rbp
      e941b8:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e941bb:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e941c2:	00 
      e941c3:	48 89 c6             	mov    rsi,rax
      e941c6:	e8 15 57 00 00       	call   e998e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60cf6>
      e941cb:	31 c0                	xor    eax,eax
      e941cd:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e941d4:	00 
      e941d5:	88 86 20 01 00 00    	mov    BYTE PTR [rsi+0x120],al
      e941db:	88 86 28 01 00 00    	mov    BYTE PTR [rsi+0x128],al
      e941e1:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e941e5:	48 89 ef             	mov    rdi,rbp
      e941e8:	ff 50 70             	call   QWORD PTR [rax+0x70]
      e941eb:	49 8d 5c 24 08       	lea    rbx,[r12+0x8]
      e941f0:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e941f7:	00 
      e941f8:	4c 89 f7             	mov    rdi,r14
      e941fb:	e8 a8 57 00 00       	call   e999a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60dbe>
      e94200:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      e94207:	00 00 
      e94209:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      e94210:	48 85 c0             	test   rax,rax

### 0xe94799: call   QWORD PTR [rax+0x10]
      e9474e:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e94755:	00 
      e94756:	e8 0f 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9475b:	49 8b 85 28 04 00 00 	mov    rax,QWORD PTR [r13+0x428]
      e94762:	49 8b 8d 98 05 00 00 	mov    rcx,QWORD PTR [r13+0x598]
      e94769:	48 8d 15 c8 3c 9e 00 	lea    rdx,[rip+0x9e3cc8]        # 1878438 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b20>
      e94770:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
      e94777:	00 
      e94778:	48 89 16             	mov    QWORD PTR [rsi],rdx
      e9477b:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e9477f:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
      e94783:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      e94787:	49 8b b5 b8 03 00 00 	mov    rsi,QWORD PTR [r13+0x3b8]
      e9478e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e94791:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e94798:	00 
      e94799:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e9479c:	48 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbp
      e947a3:	00 
      e947a4:	4d 8b bd 70 05 00 00 	mov    r15,QWORD PTR [r13+0x570]
      e947ab:	bf b0 00 00 00       	mov    edi,0xb0
      e947b0:	e8 4b 97 95 00       	call   17edf00 <_Znwm@plt>
      e947b5:	48 89 c3             	mov    rbx,rax
      e947b8:	66 0f ef c0          	pxor   xmm0,xmm0
      e947bc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e947c1:	48 8d 05 a8 d2 99 00 	lea    rax,[rip+0x99d2a8]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e947c8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e947cb:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      e947cf:	48 8d 05 12 e4 99 00 	lea    rax,[rip+0x99e412]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
      e947d6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e947da:	66 0f 6f 8c 24 30 0a 	movdqa xmm1,XMMWORD PTR [rsp+0xa30]
      e947e1:	00 00 
      e947e3:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
      e947e8:	66 0f 7f 84 24 30 0a 	movdqa XMMWORD PTR [rsp+0xa30],xmm0
      e947ef:	00 00 
      e947f1:	4c 8d 73 30          	lea    r14,[rbx+0x30]
      e947f5:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
      e947f9:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14

### 0xe94ffe: call   QWORD PTR [rax+0x20]
      e94fbc:	4c 89 f6             	mov    rsi,r14
      e94fbf:	e8 3a 3b 17 00       	call   1008afe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cff14>
      e94fc4:	4c 89 f7             	mov    rdi,r14
      e94fc7:	e8 9e 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94fcc:	49 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [r12+0xb8]
      e94fd3:	00 
      e94fd4:	48 8d 05 fd f8 9a 00 	lea    rax,[rip+0x9af8fd]        # 18448d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xfc0>
      e94fdb:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e94fe2:	00 
      e94fe3:	4c 89 ac 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r13
      e94fea:	00 
      e94feb:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e94ff2:	00 
      e94ff3:	48 89 b4 24 50 0a 00 	mov    QWORD PTR [rsp+0xa50],rsi
      e94ffa:	00 
      e94ffb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e94ffe:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e95001:	49 8d 6c 24 08       	lea    rbp,[r12+0x8]
      e95006:	48 8d 9c 24 30 0a 00 	lea    rbx,[rsp+0xa30]
      e9500d:	00 
      e9500e:	48 89 df             	mov    rdi,rbx
      e95011:	e8 54 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e95016:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]
      e9501d:	00 
      e9501e:	4c 89 f7             	mov    rdi,r14
      e95021:	e8 44 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e95026:	66 49 0f 6e c4       	movq   xmm0,r12
      e9502b:	66 49 0f 6e cd       	movq   xmm1,r13
      e95030:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e95034:	66 0f 7f 4c 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm1
      e9503a:	31 ff                	xor    edi,edi
      e9503c:	e8 db 93 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95041:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
      e95046:	0f 29 84 24 20 03 00 	movaps XMMWORD PTR [rsp+0x320],xmm0
      e9504d:	00 
      e9504e:	31 ff                	xor    edi,edi
      e95050:	e8 31 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95055:	31 ff                	xor    edi,edi

### 0xe95343: call   QWORD PTR [rax+0x8]
      e95309:	00 
      e9530a:	4d 89 28             	mov    QWORD PTR [r8],r13
      e9530d:	48 8d 35 7d 7d c0 ff 	lea    rsi,[rip+0xffffffffffc07d7d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e95314:	48 8d 0d 95 10 03 00 	lea    rcx,[rip+0x31095]        # ec63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7c6>
      e9531b:	48 8d 9c 24 d0 0f 00 	lea    rbx,[rsp+0xfd0]
      e95322:	00 
      e95323:	6a 08                	push   0x8
      e95325:	41 59                	pop    r9
      e95327:	48 89 df             	mov    rdi,rbx
      e9532a:	31 d2                	xor    edx,edx
      e9532c:	e8 63 54 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e95331:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e95335:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9533c:	00 
      e9533d:	4c 89 e6             	mov    rsi,r12
      e95340:	48 89 da             	mov    rdx,rbx
      e95343:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e95346:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e9534b:	4c 8d 60 78          	lea    r12,[rax+0x78]
      e9534f:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e95356:	00 
      e95357:	4c 89 e7             	mov    rdi,r12
      e9535a:	48 89 de             	mov    rsi,rbx
      e9535d:	e8 dc 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e95362:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e95366:	e8 1b 91 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9536b:	40 84 ed             	test   bpl,bpl
      e9536e:	74 0f                	je     e9537f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c795>
      e95370:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
      e95377:	00 
      e95378:	e8 57 48 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e9537d:	eb 0d                	jmp    e9538c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7a2>
      e9537f:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
      e95386:	00 
      e95387:	e8 5c 54 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9538c:	41 8a 6e 01          	mov    bpl,BYTE PTR [r14+0x1]
      e95390:	40 84 ed             	test   bpl,bpl
      e95393:	74 22                	je     e953b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7cd>

### 0xe953fc: call   QWORD PTR [rax+0x28]
      e953bf:	4d 89 28             	mov    QWORD PTR [r8],r13
      e953c2:	48 8d 35 c8 7c c0 ff 	lea    rsi,[rip+0xffffffffffc07cc8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e953c9:	48 8d 0d e0 0f 03 00 	lea    rcx,[rip+0x30fe0]        # ec63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7c6>
      e953d0:	48 8d 9c 24 90 0f 00 	lea    rbx,[rsp+0xf90]
      e953d7:	00 
      e953d8:	6a 08                	push   0x8
      e953da:	41 59                	pop    r9
      e953dc:	48 89 df             	mov    rdi,rbx
      e953df:	31 d2                	xor    edx,edx
      e953e1:	e8 ae 53 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e953e6:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
      e953ed:	00 
      e953ee:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e953f1:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e953f8:	00 
      e953f9:	48 89 da             	mov    rdx,rbx
      e953fc:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e953ff:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95404:	48 8d b8 88 00 00 00 	lea    rdi,[rax+0x88]
      e9540b:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e95412:	00 
      e95413:	48 89 de             	mov    rsi,rbx
      e95416:	e8 23 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e9541b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e9541f:	e8 62 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95424:	40 84 ed             	test   bpl,bpl
      e95427:	74 0f                	je     e95438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c84e>
      e95429:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e95430:	00 
      e95431:	e8 9e 47 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e95436:	eb 0d                	jmp    e95445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c85b>
      e95438:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e9543f:	00 
      e95440:	e8 a3 53 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e95445:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]
      e9544a:	4c 8b b4 24 c0 00 00 	mov    r14,QWORD PTR [rsp+0xc0]
      e95451:	00 
      e95452:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]

### 0xe9561a: call   QWORD PTR [rax+0x10]
      e955d5:	e8 ac 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e955da:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e955de:	75 ed                	jne    e955cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c9e3>
      e955e0:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
      e955e5:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e955e9:	49 8b bf 98 00 00 00 	mov    rdi,QWORD PTR [r15+0x98]
      e955f0:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      e955f7:	00 00 
      e955f9:	f3 41 0f 7f 87 90 00 	movdqu XMMWORD PTR [r15+0x90],xmm0
      e95600:	00 00 
      e95602:	e8 7f 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95607:	49 8b b4 24 b8 03 00 	mov    rsi,QWORD PTR [r12+0x3b8]
      e9560e:	00 
      e9560f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e95612:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e95619:	00 
      e9561a:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e9561d:	4d 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [r12+0xe8]
      e95624:	00 
      e95625:	bf 00 01 00 00       	mov    edi,0x100
      e9562a:	e8 d1 88 95 00       	call   17edf00 <_Znwm@plt>
      e9562f:	49 89 c4             	mov    r12,rax
      e95632:	48 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbp
      e95639:	00 
      e9563a:	4c 89 ac 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],r13
      e95641:	00 
      e95642:	66 0f ef c9          	pxor   xmm1,xmm1
      e95646:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      e9564b:	48 8d 05 16 7e 96 00 	lea    rax,[rip+0x967e16]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e95652:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e95656:	66 0f 6f 84 24 10 0e 	movdqa xmm0,XMMWORD PTR [rsp+0xe10]
      e9565d:	00 00 
      e9565f:	66 0f 7f 8c 24 10 0e 	movdqa XMMWORD PTR [rsp+0xe10],xmm1
      e95666:	00 00 
      e95668:	48 8d 05 99 d4 99 00 	lea    rax,[rip+0x99d499]        # 1832b08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4aa0>
      e9566f:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e95674:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e9567b:	4d 89 74 24 30       	mov    QWORD PTR [r12+0x30],r14

### 0xe95d8a: call   QWORD PTR [rax+0x8]
      e95d46:	e8 3b 87 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95d4b:	48 8b bc 24 d8 02 00 	mov    rdi,QWORD PTR [rsp+0x2d8]
      e95d52:	00 
      e95d53:	e8 2e 87 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95d58:	66 0f 6f 84 24 c0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1c0]
      e95d5f:	00 00 
      e95d61:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e95d68:	e8 19 87 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95d6d:	48 8b bc 24 e8 02 00 	mov    rdi,QWORD PTR [rsp+0x2e8]
      e95d74:	00 
      e95d75:	e8 0c 87 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95d7a:	48 8b bc 24 10 10 00 	mov    rdi,QWORD PTR [rsp+0x1010]
      e95d81:	00 
      e95d82:	48 85 ff             	test   rdi,rdi
      e95d85:	74 06                	je     e95d8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d1a3>
      e95d87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e95d8a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e95d8d:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
      e95d94:	00 
      e95d95:	e8 d0 41 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e95d9a:	48 8d bc 24 e0 0d 00 	lea    rdi,[rsp+0xde0]
      e95da1:	00 
      e95da2:	e8 c3 41 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e95da7:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95dae:	00 
      e95daf:	e8 b6 41 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e95db4:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
      e95dbb:	00 
      e95dbc:	e8 c5 86 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95dc1:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
      e95dc8:	00 
      e95dc9:	e8 b8 86 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95dce:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      e95dd3:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95dd8:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e95ddb:	48 8d 15 8c d6 53 ff 	lea    rdx,[rip+0xffffffffff53d68c]        # 3d346e <_ZTSN5boost17bad_function_callE@@Base+0x7b4>
      e95de2:	4c 8d 05 97 d6 53 ff 	lea    r8,[rip+0xffffffffff53d697]        # 3d3480 <_ZTSN5boost17bad_function_callE@@Base+0x7c6>
      e95de9:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]

### 0xe96676: call   QWORD PTR [rax+0x10]
      e9663a:	4c 89 f7             	mov    rdi,r14
      e9663d:	e8 4e 3c be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e96642:	48 8d b5 70 01 00 00 	lea    rsi,[rbp+0x170]
      e96649:	48 8b bc 24 20 08 00 	mov    rdi,QWORD PTR [rsp+0x820]
      e96650:	00 
      e96651:	48 85 ff             	test   rdi,rdi
      e96654:	4c 89 b4 24 50 01 00 	mov    QWORD PTR [rsp+0x150],r14
      e9665b:	00 
      e9665c:	48 89 b4 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rsi
      e96663:	00 
      e96664:	74 15                	je     e9667b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da91>
      e96666:	48 8d 84 24 00 08 00 	lea    rax,[rsp+0x800]
      e9666d:	00 
      e9666e:	48 39 c7             	cmp    rdi,rax
      e96671:	74 13                	je     e96686 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da9c>
      e96673:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96676:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e96679:	eb 02                	jmp    e9667d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da93>
      e9667b:	31 c0                	xor    eax,eax
      e9667d:	48 89 85 90 01 00 00 	mov    QWORD PTR [rbp+0x190],rax
      e96684:	eb 15                	jmp    e9669b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dab1>
      e96686:	48 89 b5 90 01 00 00 	mov    QWORD PTR [rbp+0x190],rsi
      e9668d:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e96694:	00 
      e96695:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96698:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e9669b:	48 8d bd a0 01 00 00 	lea    rdi,[rbp+0x1a0]
      e966a2:	48 8d b4 24 20 06 00 	lea    rsi,[rsp+0x620]
      e966a9:	00 
      e966aa:	48 89 bc 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rdi
      e966b1:	00 
      e966b2:	e8 d9 3b be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e966b7:	4c 8d 84 24 d0 03 00 	lea    r8,[rsp+0x3d0]
      e966be:	00 
      e966bf:	49 89 28             	mov    QWORD PTR [r8],rbp
      e966c2:	48 8d 35 c8 69 c0 ff 	lea    rsi,[rip+0xffffffffffc069c8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e966c9:	48 8d 0d f2 90 02 00 	lea    rcx,[rip+0x290f2]        # ebf7c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86bd8>
      e966d0:	4c 8d b4 24 50 10 00 	lea    r14,[rsp+0x1050]

### 0xe96698: call   QWORD PTR [rax+0x18]
      e96663:	00 
      e96664:	74 15                	je     e9667b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da91>
      e96666:	48 8d 84 24 00 08 00 	lea    rax,[rsp+0x800]
      e9666d:	00 
      e9666e:	48 39 c7             	cmp    rdi,rax
      e96671:	74 13                	je     e96686 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da9c>
      e96673:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96676:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e96679:	eb 02                	jmp    e9667d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5da93>
      e9667b:	31 c0                	xor    eax,eax
      e9667d:	48 89 85 90 01 00 00 	mov    QWORD PTR [rbp+0x190],rax
      e96684:	eb 15                	jmp    e9669b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dab1>
      e96686:	48 89 b5 90 01 00 00 	mov    QWORD PTR [rbp+0x190],rsi
      e9668d:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e96694:	00 
      e96695:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96698:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e9669b:	48 8d bd a0 01 00 00 	lea    rdi,[rbp+0x1a0]
      e966a2:	48 8d b4 24 20 06 00 	lea    rsi,[rsp+0x620]
      e966a9:	00 
      e966aa:	48 89 bc 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rdi
      e966b1:	00 
      e966b2:	e8 d9 3b be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e966b7:	4c 8d 84 24 d0 03 00 	lea    r8,[rsp+0x3d0]
      e966be:	00 
      e966bf:	49 89 28             	mov    QWORD PTR [r8],rbp
      e966c2:	48 8d 35 c8 69 c0 ff 	lea    rsi,[rip+0xffffffffffc069c8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e966c9:	48 8d 0d f2 90 02 00 	lea    rcx,[rip+0x290f2]        # ebf7c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86bd8>
      e966d0:	4c 8d b4 24 50 10 00 	lea    r14,[rsp+0x1050]
      e966d7:	00 
      e966d8:	6a 08                	push   0x8
      e966da:	41 59                	pop    r9
      e966dc:	4c 89 f7             	mov    rdi,r14
      e966df:	31 d2                	xor    edx,edx
      e966e1:	e8 ae 40 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e966e6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e966e9:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e966f0:	00 

### 0xe96cb8: call   QWORD PTR [rax+0x10]
      e96c74:	e8 f1 32 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96c79:	48 8d 05 e8 bc 99 00 	lea    rax,[rip+0x99bce8]        # 1832968 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4900>
      e96c80:	48 89 84 24 10 10 00 	mov    QWORD PTR [rsp+0x1010],rax
      e96c87:	00 
      e96c88:	48 89 ac 24 18 10 00 	mov    QWORD PTR [rsp+0x1018],rbp
      e96c8f:	00 
      e96c90:	4c 89 b4 24 30 10 00 	mov    QWORD PTR [rsp+0x1030],r14
      e96c97:	00 
      e96c98:	4c 89 f7             	mov    rdi,r14
      e96c9b:	4c 89 e6             	mov    rsi,r12
      e96c9e:	e8 91 97 02 00       	call   ec0434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8784a>
      e96ca3:	4c 89 f7             	mov    rdi,r14
      e96ca6:	e8 bf 32 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96cab:	48 8b bd 28 01 00 00 	mov    rdi,QWORD PTR [rbp+0x128]
      e96cb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96cb5:	4c 89 ee             	mov    rsi,r13
      e96cb8:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e96cbb:	4c 8d b4 24 50 10 00 	lea    r14,[rsp+0x1050]
      e96cc2:	00 
      e96cc3:	4c 89 f7             	mov    rdi,r14
      e96cc6:	e8 09 d4 d6 ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
      e96ccb:	49 89 2e             	mov    QWORD PTR [r14],rbp
      e96cce:	6a 20                	push   0x20
      e96cd0:	5f                   	pop    rdi
      e96cd1:	4c 8b 64 24 68       	mov    r12,QWORD PTR [rsp+0x68]
      e96cd6:	e8 25 72 95 00       	call   17edf00 <_Znwm@plt>
      e96cdb:	49 89 c6             	mov    r14,rax
      e96cde:	49 89 c5             	mov    r13,rax
      e96ce1:	66 0f ef c0          	pxor   xmm0,xmm0
      e96ce5:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      e96ceb:	48 8d 05 26 b4 99 00 	lea    rax,[rip+0x99b426]        # 1832118 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe5a338>
      e96cf2:	49 89 06             	mov    QWORD PTR [r14],rax
      e96cf5:	49 89 6e 18          	mov    QWORD PTR [r14+0x18],rbp
      e96cf9:	66 49 0f 6e c6       	movq   xmm0,r14
      e96cfe:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e96d05:	00 00 
      e96d07:	66 48 0f 6e cd       	movq   xmm1,rbp
      e96d0c:	66 0f 6c c8          	punpcklqdq xmm1,xmm0

### 0xe96ec5: call   QWORD PTR [rax+0x20]
      e96e84:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e8a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      e96e90:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e96e94:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e96e98:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      e96e9d:	4c 8b a4 24 f0 01 00 	mov    r12,QWORD PTR [rsp+0x1f0]
      e96ea4:	00 
      e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12
      e96ea9:	74 30                	je     e96edb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e2f1>
      e96eab:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]

### 0xe96efa: call   QWORD PTR [rax+0x20]
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]

### 0xe96f0c: call   QWORD PTR [rax+0x18]
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15

### 0xe96f1b: call   QWORD PTR [rax+0x20]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi

### 0xe96f39: call   QWORD PTR [rax+0x18]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]

### 0xe96f47: call   QWORD PTR [rax+0x20]
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]

### 0xe96f95: call   QWORD PTR [rax+0x18]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96fc0:	00 
      e96fc1:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96fc4:	48 8b bc 24 50 10 00 	mov    rdi,QWORD PTR [rsp+0x1050]
      e96fcb:	00 
      e96fcc:	48 85 ff             	test   rdi,rdi
      e96fcf:	74 66                	je     e97037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e44d>
      e96fd1:	48 8b 9c 24 18 01 00 	mov    rbx,QWORD PTR [rsp+0x118]
      e96fd8:	00 
      e96fd9:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fde:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fe3:	48 8d 05 96 ad 99 00 	lea    rax,[rip+0x99ad96]        # 1831d80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d18>
      e96fea:	4c 8d a4 24 f0 05 00 	lea    r12,[rsp+0x5f0]
      e96ff1:	00 

### 0xe96fc1: call   QWORD PTR [rax+0x20]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96fc0:	00 
      e96fc1:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96fc4:	48 8b bc 24 50 10 00 	mov    rdi,QWORD PTR [rsp+0x1050]
      e96fcb:	00 
      e96fcc:	48 85 ff             	test   rdi,rdi
      e96fcf:	74 66                	je     e97037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e44d>
      e96fd1:	48 8b 9c 24 18 01 00 	mov    rbx,QWORD PTR [rsp+0x118]
      e96fd8:	00 
      e96fd9:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fde:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fe3:	48 8d 05 96 ad 99 00 	lea    rax,[rip+0x99ad96]        # 1831d80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d18>
      e96fea:	4c 8d a4 24 f0 05 00 	lea    r12,[rsp+0x5f0]
      e96ff1:	00 
      e96ff2:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e96ff6:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
      e96ffd:	00 
      e96ffe:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      e97003:	49 89 5c 24 10       	mov    QWORD PTR [r12+0x10],rbx
      e97008:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      e9700d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e97010:	4c 89 e6             	mov    rsi,r12
      e97013:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e97016:	4c 89 e7             	mov    rdi,r12

### 0xe97013: call   QWORD PTR [rax+0x10]
      e96fcf:	74 66                	je     e97037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e44d>
      e96fd1:	48 8b 9c 24 18 01 00 	mov    rbx,QWORD PTR [rsp+0x118]
      e96fd8:	00 
      e96fd9:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fde:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fe3:	48 8d 05 96 ad 99 00 	lea    rax,[rip+0x99ad96]        # 1831d80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d18>
      e96fea:	4c 8d a4 24 f0 05 00 	lea    r12,[rsp+0x5f0]
      e96ff1:	00 
      e96ff2:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e96ff6:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
      e96ffd:	00 
      e96ffe:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      e97003:	49 89 5c 24 10       	mov    QWORD PTR [r12+0x10],rbx
      e97008:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      e9700d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e97010:	4c 89 e6             	mov    rsi,r12
      e97013:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e97016:	4c 89 e7             	mov    rdi,r12
      e97019:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e9701e:	e8 47 2f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e97023:	31 ff                	xor    edi,edi
      e97025:	e8 88 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9702a:	48 89 df             	mov    rdi,rbx
      e9702d:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e97032:	e8 7b 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e97037:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
      e9703e:	00 
      e9703f:	e8 42 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97044:	48 8b bc 24 20 03 00 	mov    rdi,QWORD PTR [rsp+0x320]
      e9704b:	00 
      e9704c:	48 85 ff             	test   rdi,rdi
      e9704f:	74 30                	je     e97081 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e497>
      e97051:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e97058:	00 
      e97059:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e9705f:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
      e97065:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e97069:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xe9706f: call   QWORD PTR [rax+0x28]
      e9702d:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e97032:	e8 7b 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e97037:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
      e9703e:	00 
      e9703f:	e8 42 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97044:	48 8b bc 24 20 03 00 	mov    rdi,QWORD PTR [rsp+0x320]
      e9704b:	00 
      e9704c:	48 85 ff             	test   rdi,rdi
      e9704f:	74 30                	je     e97081 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e497>
      e97051:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e97058:	00 
      e97059:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e9705f:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
      e97065:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e97069:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e9706c:	4c 89 e6             	mov    rsi,r12
      e9706f:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e97072:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e97077:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e9707c:	e8 05 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97081:	48 8d 35 60 fa 4a ff 	lea    rsi,[rip+0xffffffffff4afa60]        # 346ae8 <_ZTSSt12bad_any_cast@@Base-0x496e0>
      e97088:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e9708f:	00 
      e97090:	e8 e9 29 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e97095:	bf e0 00 00 00       	mov    edi,0xe0
      e9709a:	e8 61 6e 95 00       	call   17edf00 <_Znwm@plt>
      e9709f:	49 89 c6             	mov    r14,rax
      e970a2:	66 0f ef c0          	pxor   xmm0,xmm0
      e970a6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e970ab:	48 8d 05 16 3d 97 00 	lea    rax,[rip+0x973d16]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e970b2:	49 89 06             	mov    QWORD PTR [r14],rax
      e970b5:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
      e970ba:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e970bf:	48 8d 05 1a 78 97 00 	lea    rax,[rip+0x97781a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e970c6:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
      e970cd:	00 
      e970ce:	48 8d 05 a9 cb 5e 00 	lea    rax,[rip+0x5ecba9]        # 1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
      e970d5:	48 89 84 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rax

### 0xe9823f: call   QWORD PTR [rax+0x8]
      e98205:	00 
      e98206:	e8 5f 1d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9820b:	4c 89 e7             	mov    rdi,r12
      e9820e:	e8 fd 5d 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98213:	4c 89 e7             	mov    rdi,r12
      e98216:	e8 01 62 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9821b:	45 31 ff             	xor    r15d,r15d
      e9821e:	eb 0a                	jmp    e9822a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f640>
      e98220:	e9 bc 00 00 00       	jmp    e982e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f6f7>
      e98225:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9822a:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e9822f:	e8 52 62 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98234:	4d 85 ff             	test   r15,r15
      e98237:	74 09                	je     e98242 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f658>
      e98239:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e9823c:	4c 89 ff             	mov    rdi,r15
      e9823f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e98242:	31 ff                	xor    edi,edi
      e98244:	eb 08                	jmp    e9824e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f664>
      e98246:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9824b:	4c 89 e7             	mov    rdi,r12
      e9824e:	e8 33 62 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98253:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e9825a:	00 
      e9825b:	e8 be 19 00 00       	call   e99c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61034>
      e98260:	eb 05                	jmp    e98267 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f67d>
      e98262:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98267:	48 8d bc 24 90 0e 00 	lea    rdi,[rsp+0xe90]
      e9826e:	00 
      e9826f:	e8 f6 1c be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98274:	45 31 e4             	xor    r12d,r12d
      e98277:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      e9827e:	00 
      e9827f:	e8 02 62 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98284:	e9 32 05 00 00       	jmp    e987bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbd1>
      e98289:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9828e:	45 31 e4             	xor    r12d,r12d
      e98291:	e9 25 05 00 00       	jmp    e987bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbd1>

### 0xe98b62: call   QWORD PTR [rax+0x8]
      e98b1e:	e8 63 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98b23:	48 8b bc 24 d8 02 00 	mov    rdi,QWORD PTR [rsp+0x2d8]
      e98b2a:	00 
      e98b2b:	e8 56 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98b30:	66 0f 6f 84 24 c0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1c0]
      e98b37:	00 00 
      e98b39:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e98b40:	e8 41 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98b45:	48 8b bc 24 e8 02 00 	mov    rdi,QWORD PTR [rsp+0x2e8]
      e98b4c:	00 
      e98b4d:	e8 34 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98b52:	48 8b bc 24 10 10 00 	mov    rdi,QWORD PTR [rsp+0x1010]
      e98b59:	00 
      e98b5a:	48 85 ff             	test   rdi,rdi
      e98b5d:	74 0d                	je     e98b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ff82>
      e98b5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e98b62:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e98b65:	eb 05                	jmp    e98b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ff82>
      e98b67:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b6c:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
      e98b73:	00 
      e98b74:	e8 f1 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98b79:	4c 8b b4 24 58 10 00 	mov    r14,QWORD PTR [rsp+0x1058]
      e98b80:	00 
      e98b81:	4c 8b bc 24 38 0a 00 	mov    r15,QWORD PTR [rsp+0xa38]
      e98b88:	00 
      e98b89:	eb 0a                	jmp    e98b95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ffab>
      e98b8b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b90:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      e98b95:	48 8d bc 24 e0 0d 00 	lea    rdi,[rsp+0xde0]
      e98b9c:	00 
      e98b9d:	e8 c8 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98ba2:	eb 0a                	jmp    e98bae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ffc4>
      e98ba4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ba9:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      e98bae:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98bb5:	00 
      e98bb6:	e8 af 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

