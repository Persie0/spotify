# Concrete readiness source +0x58 trace

Proven object:
- allocation 0xb0 @ e947b0
- outer primary AP 0x1831a70 at outer+0
- P = outer+0x18
- P AP 0x1832be8
- final fd381a receiver = P+0x40 = outer+0x58
- constructor initially zeros outer+0x50..0x5f

## P vtable 0x1832be8 through +0x200
- +0x0: 0xec57ee
- +0x8: 0xec5afe
- +0x10: 0xec5b7c
- +0x18: 0xde01ca
- +0x20: 0xec5d0e
- +0x28: 0xec5d44
- +0x30: NO_RELOC
- +0x38: NO_RELOC
- +0x40: 0xec5e6e
- +0x48: 0xec5e7e
- +0x50: 0xec5e90
- +0x58: NO_RELOC
- +0x60: 0xa50370
- +0x68: NO_RELOC
- +0x70: NO_RELOC
- +0x78: 0xacf152
- +0x80: 0xe107aa
- +0x88: 0xec681a
- +0x90: 0xec6862
- +0x98: NO_RELOC
- +0xa0: NO_RELOC
- +0xa8: 0xd20868
- +0xb0: 0xec6874
- +0xb8: 0xec6888
- +0xc0: 0xec689c
- +0xc8: 0xec68ae
- +0xd0: 0xec6910
- +0xd8: 0xec691e
- +0xe0: 0xec69da
- +0xe8: 0xec69e6
- +0xf0: NO_RELOC
- +0xf8: NO_RELOC
- +0x100: 0xec70b0
- +0x108: 0xec70e0
- +0x110: 0xaf6576
- +0x118: 0xec70f2
- +0x120: 0x9d81d0
- +0x128: 0x9d7de0
- +0x130: 0x9d7de0
- +0x138: 0xec7114
- +0x140: 0x9d7de0
- +0x148: 0x9d7de0
- +0x150: 0x9d7de0
- +0x158: 0x155e8c6
- +0x160: 0x155e8d0
- +0x168: 0x9d7de0
- +0x170: 0x9d7de0
- +0x178: 0xd8d19e
- +0x180: 0xec7170
- +0x188: 0x9d7de0
- +0x190: 0x9d7de0
- +0x198: 0x9d7de0
- +0x1a0: 0x9d7de0
- +0x1a8: 0x9d7de0
- +0x1b0: 0x9d7de0
- +0x1b8: 0x9d81d0
- +0x1c0: 0x9d81d0
- +0x1c8: 0x9d81d0
- +0x1d0: 0x9d81d0
- +0x1d8: 0x9d7de0
- +0x1e0: 0xa5bbf0
- +0x1e8: 0x9d7de0
- +0x1f0: 0x9d7de0
- +0x1f8: 0x9d7de0
- +0x200: 0x9d7de0

## Direct AP materializations
### 0xe947cf; FDE=(15281964, 15306555): lea    rax,[rip+0x99e412]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
      e94748:	00 
      e94749:	e8 1c 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
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
      e947fd:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
      e94802:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
      e94807:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
      e9480c:	c7 43 68 00 00 80 3f 	mov    DWORD PTR [rbx+0x68],0x3f800000
      e94813:	b8 10 27 00 00       	mov    eax,0x2710
      e94818:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
      e9481c:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
      e94820:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e94827:	00 
      e94828:	f3 0f 7f 83 90 00 00 	movdqu XMMWORD PTR [rbx+0x90],xmm0
      e9482f:	00 
      e94830:	41 8a 6f 01          	mov    bpl,BYTE PTR [r15+0x1]
      e94834:	40 84 ed             	test   bpl,bpl
      e94837:	74 22                	je     e9485b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bc71>
      e94839:	4c 8d b4 24 50 0f 00 	lea    r14,[rsp+0xf50]
      e94840:	00 
      e94841:	4c 89 f7             	mov    rdi,r14
      e94844:	e8 ad 51 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e94849:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e94850:	00 
      e94851:	4c 89 f6             	mov    rsi,r14
      e94854:	e8 e5 51 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e94859:	eb 51                	jmp    e948ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bcc2>
      e9485b:	4c 8d 84 24 10 0e 00 	lea    r8,[rsp+0xe10]
      e94862:	00 
      e94863:	4d 89 20             	mov    QWORD PTR [r8],r12
      e94866:	48 8d 35 24 88 c0 ff 	lea    rsi,[rip+0xffffffffffc08824]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e9486d:	48 8d 0d a2 08 03 00 	lea    rcx,[rip+0x308a2]        # ec5116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c52c>
      e94874:	4c 8d bc 24 50 0f 00 	lea    r15,[rsp+0xf50]
      e9487b:	00 
      e9487c:	6a 08                	push   0x8
      e9487e:	41 59                	pop    r9
      e94880:	4c 89 ff             	mov    rdi,r15
      e94883:	31 d2                	xor    edx,edx
      e94885:	66 0f 7f 4c 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm1
      e9488b:	e8 04 5f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e94890:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      e94896:	66 48 0f 7e c6       	movq   rsi,xmm0
      e9489b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e9489e:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e948a5:	00 
      e948a6:	4c 89 fa             	mov    rdx,r15
      e948a9:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e948ac:	48 89 df             	mov    rdi,rbx
      e948af:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
      e948b6:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e948bd:	00 
      e948be:	4c 89 f6             	mov    rsi,r14
      e948c1:	e8 78 51 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e948c6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      e948ca:	e8 b7 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0xec5d12; FDE=(15490318, 15490372): lea    rax,[rip+0x96cecf]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
      ec5cab:	48 89 d8             	mov    rax,rbx
      ec5cae:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
      ec5cb5:	5b                   	pop    rbx
      ec5cb6:	41 5c                	pop    r12
      ec5cb8:	41 5e                	pop    r14
      ec5cba:	41 5f                	pop    r15
      ec5cbc:	c3                   	ret
      ec5cbd:	49 89 c6             	mov    r14,rax
      ec5cc0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec5cc5:	eb 14                	jmp    ec5cdb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d0f1>
      ec5cc7:	eb 19                	jmp    ec5ce2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d0f8>
      ec5cc9:	49 89 c6             	mov    r14,rax
      ec5ccc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ec5cd1:	e8 b8 86 1e 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
      ec5cd6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ec5cdb:	e8 b0 81 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ec5ce0:	eb 03                	jmp    ec5ce5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d0fb>
      ec5ce2:	49 89 c6             	mov    r14,rax
      ec5ce5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ec5ce9:	e8 98 87 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5cee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5cf5:	00 00 
      ec5cf7:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
      ec5cfe:	00 
      ec5cff:	75 08                	jne    ec5d09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d11f>
      ec5d01:	4c 89 f7             	mov    rdi,r14
      ec5d04:	e8 c7 9f ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ec5d09:	e8 a2 9d 92 00       	call   17efab0 <__stack_chk_fail@plt>
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

## Exact [base+0x58] references in construction FDE e92xxx..e99xxx
### 0xe9260d; FDE=(15268560, 15281225): mov    rdi,QWORD PTR [rsp+0x58]
      e925c6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e925cb:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      e925d2:	00 
      e925d3:	e8 10 82 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e925d8:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      e925dd:	e8 f2 75 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e925e2:	eb 12                	jmp    e925f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59a0c>
      e925e4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e925e9:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
      e925f0:	00 
      e925f1:	e8 f2 81 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e925f6:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      e925fb:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      e925ff:	e8 82 be c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92604:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      e92608:	e8 79 be c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9260d:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e92612:	e8 6f be c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92617:	48 89 df             	mov    rdi,rbx
      e9261a:	e8 f1 b9 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e9261f:	48 89 df             	mov    rdi,rbx
      e92622:	e8 f5 bd c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e92627:	e9 54 01 00 00       	jmp    e92780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59b96>
      e9262c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e92631:	e9 10 04 00 00       	jmp    e92a46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59e5c>
      e92636:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9263b:	e9 13 04 00 00       	jmp    e92a53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59e69>
      e92640:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e92645:	e9 16 04 00 00       	jmp    e92a60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59e76>
      e9264a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9264f:	e9 69 04 00 00       	jmp    e92abd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59ed3>
      e92654:	e9 06 01 00 00       	jmp    e9275f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59b75>
      e92659:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9265e:	4c 89 ef             	mov    rdi,r13
      e92661:	e8 04 79 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e92666:	eb 05                	jmp    e9266d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59a83>
      e92668:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9266d:	48 89 df             	mov    rdi,rbx
      e92670:	e8 1b b8 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e92675:	eb 05                	jmp    e9267c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59a92>
      e92677:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9267c:	4c 89 f7             	mov    rdi,r14
      e9267f:	e8 c2 f0 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      e92684:	49 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [r12+0xa8]
      e9268b:	00 
      e9268c:	e8 f5 bd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92691:	48 89 ef             	mov    rdi,rbp

### 0xe92bc3; FDE=(15268560, 15281225): mov    rdi,QWORD PTR [rsp+0x58]
      e92b7f:	31 ff                	xor    edi,edi
      e92b81:	e8 00 b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92b86:	e9 9c 00 00 00       	jmp    e92c27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a03d>
      e92b8b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e92b90:	eb 12                	jmp    e92ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59fba>
      e92b92:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e92b97:	48 8b bc 24 38 08 00 	mov    rdi,QWORD PTR [rsp+0x838]
      e92b9e:	00 
      e92b9f:	e8 e2 b8 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92ba4:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e92bab:	00 
      e92bac:	e8 37 7c 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e92bb1:	4c 89 ff             	mov    rdi,r15
      e92bb4:	e8 ab 9f c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
      e92bb9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      e92bbe:	e8 a3 72 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e92bc3:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e92bc8:	e8 55 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bcd:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
      e92bd4:	00 
      e92bd5:	e8 48 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bda:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
      e92bdf:	48 89 df             	mov    rdi,rbx
      e92be2:	e8 29 b4 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e92be7:	48 89 df             	mov    rdi,rbx
      e92bea:	e8 2d b8 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e92bef:	48 8d bc 24 60 09 00 	lea    rdi,[rsp+0x960]
      e92bf6:	00 
      e92bf7:	e8 26 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bfc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e92c01:	e8 80 b8 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92c06:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e92c0b:	e8 a2 b8 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e92c10:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e92c15:	e8 2c 40 62 00       	call   14b6c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc1ca>
      e92c1a:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e92c21:	00 
      e92c22:	e8 43 01 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e92c27:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e92c2e:	00 00 
      e92c30:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e92c37:	00 
      e92c38:	75 0a                	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e92c3a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      e92c3f:	e8 8c d0 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e92c44:	e8 67 ce 95 00       	call   17efab0 <__stack_chk_fail@plt>
      e92c49:	41 57                	push   r15

### 0xe93343; FDE=(15281964, 15306555): mov    BYTE PTR [r14+0x58],bpl
      e93306:	41 59                	pop    r9
      e93308:	e8 1d 41 75 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
      e9330d:	89 c5                	mov    ebp,eax
      e9330f:	bf c0 00 00 00       	mov    edi,0xc0
      e93314:	e8 e7 ab 95 00       	call   17edf00 <_Znwm@plt>
      e93319:	49 89 c6             	mov    r14,rax
      e9331c:	4c 63 ed             	movsxd r13,ebp
      e9331f:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
      e93326:	00 
      e93327:	49 89 1f             	mov    QWORD PTR [r15],rbx
      e9332a:	48 8b 05 6f e7 a1 00 	mov    rax,QWORD PTR [rip+0xa1e76f]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e93331:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e93335:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e93339:	4c 89 f7             	mov    rdi,r14
      e9333c:	e8 4d 4f c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93341:	31 ed                	xor    ebp,ebp
      e93343:	41 88 6e 58          	mov    BYTE PTR [r14+0x58],bpl
      e93347:	49 8d 7e 60          	lea    rdi,[r14+0x60]
      e9334b:	4c 89 fe             	mov    rsi,r15
      e9334e:	e8 9d 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e93353:	4d 89 ae 90 00 00 00 	mov    QWORD PTR [r14+0x90],r13
      e9335a:	41 88 ae 98 00 00 00 	mov    BYTE PTR [r14+0x98],bpl
      e93361:	41 88 ae a0 00 00 00 	mov    BYTE PTR [r14+0xa0],bpl
      e93368:	4c 89 f7             	mov    rdi,r14
      e9336b:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
      e93372:	4c 89 e6             	mov    rsi,r12
      e93375:	e8 48 e3 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e9337a:	4c 89 b4 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],r14
      e93381:	00 
      e93382:	4c 89 ff             	mov    rdi,r15
      e93385:	e8 e0 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9338a:	6a 70                	push   0x70
      e9338c:	5f                   	pop    rdi
      e9338d:	e8 6e ab 95 00       	call   17edf00 <_Znwm@plt>
      e93392:	48 89 c3             	mov    rbx,rax
      e93395:	66 0f ef c0          	pxor   xmm0,xmm0
      e93399:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9339e:	48 8d 05 23 7a 97 00 	lea    rax,[rip+0x977a23]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e933a5:	48 89 03             	mov    QWORD PTR [rbx],rax
      e933a8:	4c 8d 63 20          	lea    r12,[rbx+0x20]
      e933ac:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
      e933b3:	00 
      e933b4:	48 8d b4 24 20 0f 00 	lea    rsi,[rsp+0xf20]
      e933bb:	00 
      e933bc:	4c 89 ff             	mov    rdi,r15
      e933bf:	e8 2c 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e933c4:	48 8d 05 f5 0f 9b 00 	lea    rax,[rip+0x9b0ff5]        # 18443c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaa8>

### 0xe939e4; FDE=(15281964, 15306555): mov    QWORD PTR [rbx+0x58],rax
      e93998:	48 8d 05 c9 9a 96 00 	lea    rax,[rip+0x969ac9]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e9399f:	48 89 03             	mov    QWORD PTR [rbx],rax
      e939a2:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
      e939a9:	ba c8 00 00 00       	mov    edx,0xc8
      e939ae:	31 f6                	xor    esi,esi
      e939b0:	e8 db b1 95 00       	call   17eeb90 <memset@plt>
      e939b5:	48 8d 05 e4 49 9e 00 	lea    rax,[rip+0x9e49e4]        # 18783a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34a88>
      e939bc:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e939c0:	48 8d 43 28          	lea    rax,[rbx+0x28]
      e939c4:	66 0f ef c0          	pxor   xmm0,xmm0
      e939c8:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
      e939cd:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      e939d1:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
      e939d6:	f3 0f 7f 43 48       	movdqu XMMWORD PTR [rbx+0x48],xmm0
      e939db:	48 8d 43 60          	lea    rax,[rbx+0x60]
      e939df:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
      e939e4:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
      e939e8:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      e939ed:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e939f4:	00 
      e939f5:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
      e939fc:	f3 0f 7f 83 98 00 00 	movdqu XMMWORD PTR [rbx+0x98],xmm0
      e93a03:	00 
      e93a04:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
      e93a0b:	f3 0f 7f 83 a8 00 00 	movdqu XMMWORD PTR [rbx+0xa8],xmm0
      e93a12:	00 
      e93a13:	f3 0f 7f 83 b8 00 00 	movdqu XMMWORD PTR [rbx+0xb8],xmm0
      e93a1a:	00 
      e93a1b:	48 8d 83 d0 00 00 00 	lea    rax,[rbx+0xd0]
      e93a22:	f3 0f 7f 83 d0 00 00 	movdqu XMMWORD PTR [rbx+0xd0],xmm0
      e93a29:	00 
      e93a2a:	48 89 83 c8 00 00 00 	mov    QWORD PTR [rbx+0xc8],rax
      e93a31:	f3 0f 7f 83 e0 00 00 	movdqu XMMWORD PTR [rbx+0xe0],xmm0
      e93a38:	00 
      e93a39:	f3 0f 7f 83 f0 00 00 	movdqu XMMWORD PTR [rbx+0xf0],xmm0
      e93a40:	00 
      e93a41:	f3 0f 7f 83 00 01 00 	movdqu XMMWORD PTR [rbx+0x100],xmm0
      e93a48:	00 
      e93a49:	f3 0f 7f 83 10 01 00 	movdqu XMMWORD PTR [rbx+0x110],xmm0
      e93a50:	00 
      e93a51:	f3 0f 7f 83 20 01 00 	movdqu XMMWORD PTR [rbx+0x120],xmm0
      e93a58:	00 
      e93a59:	48 c7 83 30 01 00 00 	mov    QWORD PTR [rbx+0x130],0x1
      e93a60:	01 00 00 00 
      e93a64:	c6 83 40 01 00 00 00 	mov    BYTE PTR [rbx+0x140],0x0
      e93a6b:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]
      e93a72:	e8 17 48 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>

### 0xe93da0; FDE=(15281964, 15306555): mov    DWORD PTR [rsp+0x58],r12d
      e93d66:	84 c0                	test   al,al
      e93d68:	74 06                	je     e93d70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b186>
      e93d6a:	6a 02                	push   0x2
      e93d6c:	41 5c                	pop    r12
      e93d6e:	eb 30                	jmp    e93da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b1b6>
      e93d70:	48 8d 35 bb f4 53 ff 	lea    rsi,[rip+0xffffffffff53f4bb]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
      e93d77:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93d7e:	00 
      e93d7f:	e8 cb 7a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e93d84:	84 c0                	test   al,al
      e93d86:	75 18                	jne    e93da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b1b6>
      e93d88:	48 8d 35 95 84 4a ff 	lea    rsi,[rip+0xffffffffff4a8495]        # 33c224 <_ZTSSt12bad_any_cast@@Base-0x53fa4>
      e93d8f:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93d96:	00 
      e93d97:	e8 b3 7a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e93d9c:	44 0f b6 e0          	movzx  r12d,al
      e93da0:	44 89 64 24 58       	mov    DWORD PTR [rsp+0x58],r12d
      e93da5:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93dac:	00 
      e93dad:	e8 7e 2f c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e93db2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e93db7:	48 8b 00             	mov    rax,QWORD PTR [rax]
      e93dba:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e93dbf:	bf 60 01 00 00       	mov    edi,0x160
      e93dc4:	e8 37 a1 95 00       	call   17edf00 <_Znwm@plt>
      e93dc9:	48 8b 94 24 80 01 00 	mov    rdx,QWORD PTR [rsp+0x180]
      e93dd0:	00 
      e93dd1:	49 89 d4             	mov    r12,rdx
      e93dd4:	49 83 c4 18          	add    r12,0x18
      e93dd8:	48 8b b4 24 70 01 00 	mov    rsi,QWORD PTR [rsp+0x170]
      e93ddf:	00 
      e93de0:	49 89 f6             	mov    r14,rsi
      e93de3:	49 83 c6 18          	add    r14,0x18
      e93de7:	66 0f ef c0          	pxor   xmm0,xmm0
      e93deb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93df0:	48 8d 0d e9 dc 99 00 	lea    rcx,[rip+0x99dce9]        # 1831ae0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a78>
      e93df7:	48 89 08             	mov    QWORD PTR [rax],rcx
      e93dfa:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      e93e01:	00 
      e93e02:	48 83 c0 20          	add    rax,0x20
      e93e06:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      e93e0b:	48 8d 05 06 dd 99 00 	lea    rax,[rip+0x99dd06]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
      e93e12:	45 84 ff             	test   r15b,r15b
      e93e15:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
      e93e1a:	74 27                	je     e93e43 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b259>
      e93e1c:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e93e23:	00 

### 0xe93ee2; FDE=(15281964, 15306555): mov    BYTE PTR [rbp+0x58],al
      e93e9b:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e93ea0:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      e93ea5:	48 8d 05 04 fe 9a 00 	lea    rax,[rip+0x9afe04]        # 1843cb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x398>
      e93eac:	48 8b ac 24 90 00 00 	mov    rbp,QWORD PTR [rsp+0x90]
      e93eb3:	00 
      e93eb4:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      e93eb8:	69 c1 60 ea 00 00    	imul   eax,ecx,0xea60
      e93ebe:	48 98                	cdqe
      e93ec0:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
      e93ec4:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
      e93ec8:	48 89 45 38          	mov    QWORD PTR [rbp+0x38],rax
      e93ecc:	41 69 c5 60 ea 00 00 	imul   eax,r13d,0xea60
      e93ed3:	66 0f 7f 45 40       	movdqa XMMWORD PTR [rbp+0x40],xmm0
      e93ed8:	89 45 50             	mov    DWORD PTR [rbp+0x50],eax
      e93edb:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0
      e93ee0:	31 c0                	xor    eax,eax
      e93ee2:	88 45 58             	mov    BYTE PTR [rbp+0x58],al
      e93ee5:	88 45 60             	mov    BYTE PTR [rbp+0x60],al
      e93ee8:	48 8d 7d 68          	lea    rdi,[rbp+0x68]
      e93eec:	49 89 d5             	mov    r13,rdx
      e93eef:	49 89 f7             	mov    r15,rsi
      e93ef2:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      e93ef7:	e8 fa 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93efc:	48 8d 7d 78          	lea    rdi,[rbp+0x78]
      e93f00:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      e93f05:	e8 ec 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93f0a:	48 8d bd 88 00 00 00 	lea    rdi,[rbp+0x88]
      e93f11:	48 89 bc 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rdi
      e93f18:	00 
      e93f19:	e8 d8 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93f1e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e93f23:	48 89 85 98 00 00 00 	mov    QWORD PTR [rbp+0x98],rax
      e93f2a:	48 8d bd a0 00 00 00 	lea    rdi,[rbp+0xa0]
      e93f31:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e93f36:	e8 bb 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93f3b:	48 8d bd b0 00 00 00 	lea    rdi,[rbp+0xb0]
      e93f42:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e93f47:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e93f4e:	00 
      e93f4f:	e8 a4 52 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      e93f54:	48 63 45 50          	movsxd rax,DWORD PTR [rbp+0x50]
      e93f58:	48 39 45 28          	cmp    QWORD PTR [rbp+0x28],rax
      e93f5c:	0f 9f c0             	setg   al
      e93f5f:	8a 4c 24 48          	mov    cl,BYTE PTR [rsp+0x48]
      e93f63:	20 c1                	and    cl,al
      e93f65:	88 8d e0 00 00 00    	mov    BYTE PTR [rbp+0xe0],cl
      e93f6b:	8a 84 24 90 01 00 00 	mov    al,BYTE PTR [rsp+0x190]

### 0xe93fde; FDE=(15281964, 15306555): mov    eax,DWORD PTR [rsp+0x58]
      e93f84:	f3 0f 7f 85 e8 00 00 	movdqu XMMWORD PTR [rbp+0xe8],xmm0
      e93f8b:	00 
      e93f8c:	f3 0f 7f 85 f1 00 00 	movdqu XMMWORD PTR [rbp+0xf1],xmm0
      e93f93:	00 
      e93f94:	48 8b 84 24 f0 00 00 	mov    rax,QWORD PTR [rsp+0xf0]
      e93f9b:	00 
      e93f9c:	48 89 85 10 01 00 00 	mov    QWORD PTR [rbp+0x110],rax
      e93fa3:	4c 89 a5 18 01 00 00 	mov    QWORD PTR [rbp+0x118],r12
      e93faa:	4c 89 ad 20 01 00 00 	mov    QWORD PTR [rbp+0x120],r13
      e93fb1:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e93fb6:	48 89 85 28 01 00 00 	mov    QWORD PTR [rbp+0x128],rax
      e93fbd:	48 89 9d 30 01 00 00 	mov    QWORD PTR [rbp+0x130],rbx
      e93fc4:	4c 89 b5 38 01 00 00 	mov    QWORD PTR [rbp+0x138],r14
      e93fcb:	4c 89 bd 40 01 00 00 	mov    QWORD PTR [rbp+0x140],r15
      e93fd2:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      e93fd7:	48 89 85 48 01 00 00 	mov    QWORD PTR [rbp+0x148],rax
      e93fde:	8b 44 24 58          	mov    eax,DWORD PTR [rsp+0x58]
      e93fe2:	89 85 50 01 00 00    	mov    DWORD PTR [rbp+0x150],eax
      e93fe8:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
      e93fef:	00 
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

### 0xe9421f; FDE=(15281964, 15306555): mov    QWORD PTR [rsp+0x58],rbx
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
      e94213:	74 05                	je     e9421a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b630>
      e94215:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9421a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      e9421f:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e94224:	f0 48 ff 03          	lock inc QWORD PTR [rbx]
      e94228:	6a 30                	push   0x30
      e9422a:	5b                   	pop    rbx
      e9422b:	48 89 df             	mov    rdi,rbx
      e9422e:	e8 cd 9c 95 00       	call   17edf00 <_Znwm@plt>
      e94233:	49 89 c7             	mov    r15,rax
      e94236:	66 0f ef c0          	pxor   xmm0,xmm0
      e9423a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9423f:	48 8d 05 1a d9 99 00 	lea    rax,[rip+0x99d91a]        # 1831b60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3af8>
      e94246:	49 89 07             	mov    QWORD PTR [r15],rax
      e94249:	49 8d 47 20          	lea    rax,[r15+0x20]
      e9424d:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e94253:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e94257:	6a 48                	push   0x48
      e94259:	5f                   	pop    rdi
      e9425a:	e8 a1 9c 95 00       	call   17edf00 <_Znwm@plt>
      e9425f:	4c 89 f9             	mov    rcx,r15
      e94262:	48 83 c1 18          	add    rcx,0x18
      e94266:	66 0f ef c0          	pxor   xmm0,xmm0
      e9426a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9426f:	48 8d 15 22 d9 99 00 	lea    rdx,[rip+0x99d922]        # 1831b98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3b30>
      e94276:	48 89 10             	mov    QWORD PTR [rax],rdx
      e94279:	48 89 c2             	mov    rdx,rax
      e9427c:	48 83 c2 18          	add    rdx,0x18
      e94280:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e94285:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
      e9428a:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
      e9428f:	48 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [rsp+0x90]
      e94296:	00 
      e94297:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]

### 0xe94ea2; FDE=(15281964, 15306555): and    QWORD PTR [r12+0x58],0x0
      e94e58:	48 8d 05 b9 f9 9a 00 	lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e5f:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
      e94e6a:	00 
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94e8e:	00 f0 3f 
      e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      e94e96:	31 c0                	xor    eax,eax
      e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
      e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e94ebf:	00 
      e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      e94ec5:	4c 89 ee             	mov    rsi,r13
      e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e94ed4:	00 00 
      e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
      e94edd:	00 
      e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
      e94ee5:	00 
      e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
      e94eed:	00 
      e94eee:	48 89 df             	mov    rdi,rbx
      e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
      e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e94f00:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e94f07:	00 
      e94f08:	49 8d 84 24 b0 00 00 	lea    rax,[r12+0xb0]
      e94f0f:	00 
      e94f10:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e94f17:	00 
      e94f18:	49 8d 84 24 b8 00 00 	lea    rax,[r12+0xb8]
      e94f1f:	00 
      e94f20:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      e94f27:	00 

### 0xe955e0; FDE=(15281964, 15306555): mov    rax,QWORD PTR [rsp+0x58]
      e955a2:	4c 89 f6             	mov    rsi,r14
      e955a5:	e8 0a a9 83 00       	call   16cfeb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84020>
      e955aa:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      e955b1:	48 89 de             	mov    rsi,rbx
      e955b4:	e8 63 42 c2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      e955b9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e955bd:	e8 c4 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e955c2:	4c 89 f7             	mov    rdi,r14
      e955c5:	e8 7e f2 c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
      e955ca:	6a 20                	push   0x20
      e955cc:	5b                   	pop    rbx
      e955cd:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e955d4:	00 
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

### 0xe956cd; FDE=(15281964, 15306555): movdqu XMMWORD PTR [r12+0x58],xmm0
      e9568e:	00 
      e9568f:	e8 ea 43 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e95694:	4d 8d 7c 24 18       	lea    r15,[r12+0x18]
      e95699:	49 8d 5c 24 38       	lea    rbx,[r12+0x38]
      e9569e:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e956a5:	00 
      e956a6:	48 89 df             	mov    rdi,rbx
      e956a9:	4c 89 f6             	mov    rsi,r14
      e956ac:	4c 89 ea             	mov    rdx,r13
      e956af:	e8 66 c0 92 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
      e956b4:	4c 89 ef             	mov    rdi,r13
      e956b7:	e8 d4 87 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e956bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e956c1:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e956c8:	00 
      e956c9:	66 0f ef c0          	pxor   xmm0,xmm0
      e956cd:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
      e956d4:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e956db:	bd 00 00 80 3f       	mov    ebp,0x3f800000
      e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
      e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e956ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e956ef:	e8 02 43 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e956fb:	00 
      e956fc:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
      e95703:	00 
      e95704:	e8 85 2b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95709:	4d 89 e6             	mov    r14,r12
      e9570c:	49 81 c6 d8 00 00 00 	add    r14,0xd8
      e95713:	66 0f ef c0          	pxor   xmm0,xmm0
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e9571e:	00 00 00 
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
      e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>

### 0xe95775; FDE=(15281964, 15306555): mov    QWORD PTR [rsp+0x58],rbx
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
      e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>
      e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e95768:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e9576f:	00 
      e95770:	b9 60 ea 00 00       	mov    ecx,0xea60
      e95775:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e9577a:	48 89 df             	mov    rdi,rbx
      e9577d:	4c 89 fb             	mov    rbx,r15
      e95780:	4c 89 ea             	mov    rdx,r13
      e95783:	e8 fc c0 92 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
      e95788:	4c 89 ef             	mov    rdi,r13
      e9578b:	e8 0e 1b c1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      e95790:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
      e95795:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
      e9579c:	00 
      e9579d:	4d 89 38             	mov    QWORD PTR [r8],r15
      e957a0:	48 8d 35 ea 78 c0 ff 	lea    rsi,[rip+0xffffffffffc078ea]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e957a7:	48 8d 0d 8c d5 02 00 	lea    rcx,[rip+0x2d58c]        # ec2d3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a150>
      e957ae:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e957b5:	00 
      e957b6:	6a 08                	push   0x8
      e957b8:	41 59                	pop    r9
      e957ba:	48 89 ef             	mov    rdi,rbp
      e957bd:	31 d2                	xor    edx,edx
      e957bf:	e8 d0 4f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e957c4:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e957c8:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e957cf:	00 
      e957d0:	4c 89 ee             	mov    rsi,r13
      e957d3:	48 89 ea             	mov    rdx,rbp
      e957d6:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e957d9:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e957e0:	00 
      e957e1:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e957e6:	4c 89 f6             	mov    rsi,r14
      e957e9:	e8 04 44 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>

### 0xe958e6; FDE=(15281964, 15306555): mov    QWORD PTR [rsp+0x58],rbp
      e958a5:	00 
      e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e958b9:	00 
      e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      e958c1:	00 
      e958c2:	e8 f7 63 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e958c7:	6a 50                	push   0x50
      e958c9:	5f                   	pop    rdi
      e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
      e958cf:	48 89 c5             	mov    rbp,rax
      e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
      e95963:	00 
      e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]

### 0xe95d41; FDE=(15281964, 15306555): mov    rdi,QWORD PTR [rsp+0x58]
      e95ceb:	ff b4 24 d8 01 00 00 	push   QWORD PTR [rsp+0x1d8]
      e95cf2:	48 8d 84 24 68 04 00 	lea    rax,[rsp+0x468]
      e95cf9:	00 
      e95cfa:	50                   	push   rax
      e95cfb:	ff b4 24 20 02 00 00 	push   QWORD PTR [rsp+0x220]
      e95d02:	ff b4 24 d0 01 00 00 	push   QWORD PTR [rsp+0x1d0]
      e95d09:	ff b4 24 b8 02 00 00 	push   QWORD PTR [rsp+0x2b8]
      e95d10:	ff b4 24 98 03 00 00 	push   QWORD PTR [rsp+0x398]
      e95d17:	ff b4 24 20 02 00 00 	push   QWORD PTR [rsp+0x220]
      e95d1e:	48 8d 84 24 50 05 00 	lea    rax,[rsp+0x550]
      e95d25:	00 
      e95d26:	50                   	push   rax
      e95d27:	ff b4 24 10 02 00 00 	push   QWORD PTR [rsp+0x210]
      e95d2e:	ff b4 24 a0 02 00 00 	push   QWORD PTR [rsp+0x2a0]
      e95d35:	e8 cd 3f 00 00       	call   e99d07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6111d>
      e95d3a:	48 81 c4 80 01 00 00 	add    rsp,0x180
      e95d41:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
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

### 0xe96493; FDE=(15281964, 15306555): mov    rax,QWORD PTR [r14+0x58]
      e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
      e96447:	0f 57 c0             	xorps  xmm0,xmm0
      e9644a:	41 0f 11 46 e8       	movups XMMWORD PTR [r14-0x18],xmm0
      e9644f:	48 89 df             	mov    rdi,rbx
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
      e9651c:	48 85 db             	test   rbx,rbx
      e9651f:	74 05                	je     e96526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d93c>

### 0xe96e98; FDE=(15281964, 15306555): mov    rbx,QWORD PTR [rsp+0x58]
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
      e96e58:	00 
      e96e59:	e8 28 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96e5e:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96e65:	00 
      e96e66:	4c 89 ff             	mov    rdi,r15
      e96e69:	e8 7a 39 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96e6e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
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

### 0xe9714b; FDE=(15281964, 15306555): movups XMMWORD PTR [r14+0x58],xmm0
      e9710d:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
      e97112:	48 85 c0             	test   rax,rax
      e97115:	74 05                	je     e9711c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e532>
      e97117:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9711c:	48 8b 84 24 48 03 00 	mov    rax,QWORD PTR [rsp+0x348]
      e97123:	00 
      e97124:	0f 28 84 24 40 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x340]
      e9712b:	00 
      e9712c:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      e97131:	48 85 c0             	test   rax,rax
      e97134:	74 05                	je     e9713b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e551>
      e97136:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9713b:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e97142:	00 
      e97143:	0f 28 84 24 50 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x350]
      e9714a:	00 
      e9714b:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      e97150:	48 85 c0             	test   rax,rax
      e97153:	74 05                	je     e9715a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e570>
      e97155:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9715a:	48 8b 84 24 68 03 00 	mov    rax,QWORD PTR [rsp+0x368]
      e97161:	00 
      e97162:	0f 28 84 24 60 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x360]
      e97169:	00 
      e9716a:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      e9716f:	48 85 c0             	test   rax,rax
      e97172:	74 05                	je     e97179 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e58f>
      e97174:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e97179:	48 8b 84 24 78 03 00 	mov    rax,QWORD PTR [rsp+0x378]
      e97180:	00 
      e97181:	66 0f 6f 84 24 70 03 	movdqa xmm0,XMMWORD PTR [rsp+0x370]
      e97188:	00 00 
      e9718a:	f3 41 0f 7f 46 78    	movdqu XMMWORD PTR [r14+0x78],xmm0
      e97190:	48 85 c0             	test   rax,rax
      e97193:	74 05                	je     e9719a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e5b0>
      e97195:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9719a:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]
      e971a1:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e971a8:	00 
      e971a9:	4c 89 ff             	mov    rdi,r15
      e971ac:	e8 df 30 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e971b1:	49 8d be c0 00 00 00 	lea    rdi,[r14+0xc0]
      e971b8:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
      e971bf:	00 
      e971c0:	e8 7b 6d 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e971c5:	4d 89 f7             	mov    r15,r14
      e971c8:	49 83 c7 20          	add    r15,0x20

### 0xe97982; FDE=(15281964, 15306555): mov    rdi,QWORD PTR [rsp+0x58]
      e97940:	00 
      e97941:	e8 4a 65 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e97946:	4c 89 ef             	mov    rdi,r13
      e97949:	e8 38 6b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9794e:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e97955:	00 
      e97956:	e8 23 ac 00 00       	call   ea257e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
      e9795b:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e97962:	00 
      e97963:	e8 88 ac 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e97968:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e9796f:	00 
      e97970:	e8 1b 65 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e97975:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e9797c:	00 
      e9797d:	e8 ec 08 cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e97982:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e97987:	e8 fa 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9798c:	48 8b bc 24 f8 02 00 	mov    rdi,QWORD PTR [rsp+0x2f8]
      e97993:	00 
      e97994:	e8 ed 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97999:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e979a0:	00 
      e979a1:	e8 e0 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979a6:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e979ab:	e8 d6 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979b0:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e979b7:	00 
      e979b8:	e8 65 61 c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e979bd:	48 8b bc 24 28 03 00 	mov    rdi,QWORD PTR [rsp+0x328]
      e979c4:	00 
      e979c5:	e8 bc 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979ca:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
      e979d1:	00 
      e979d2:	e8 af 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979d7:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e979dc:	e8 a5 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979e1:	48 8d bc 24 c0 0e 00 	lea    rdi,[rsp+0xec0]
      e979e8:	00 
      e979e9:	e8 7c 25 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e979ee:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
      e979f5:	00 
      e979f6:	e8 6f 25 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e979fb:	66 0f 6f 84 24 90 01 	movdqa xmm0,XMMWORD PTR [rsp+0x190]
      e97a02:	00 00 
      e97a04:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e97a0b:	e8 76 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0xe9877b; FDE=(15281964, 15306555): mov    rdi,QWORD PTR [rsp+0x58]
      e98735:	e8 30 18 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9873a:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      e98741:	00 
      e98742:	e8 a9 9e 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e98747:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e9874e:	00 
      e9874f:	e8 2a 9e 00 00       	call   ea257e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
      e98754:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9875b:	00 
      e9875c:	e8 8f 9e 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e98761:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e98768:	00 
      e98769:	e8 22 57 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9876e:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e98775:	00 
      e98776:	e8 f3 fa ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9877b:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98780:	e8 01 5d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98785:	48 8b bc 24 f8 02 00 	mov    rdi,QWORD PTR [rsp+0x2f8]
      e9878c:	00 
      e9878d:	e8 f4 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98792:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98799:	00 
      e9879a:	e8 e7 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9879f:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e987a4:	e8 db 09 00 00       	call   e99184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6059a>
      e987a9:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e987ae:	e8 d3 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987b3:	4c 8b a4 24 28 03 00 	mov    r12,QWORD PTR [rsp+0x328]
      e987ba:	00 
      e987bb:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e987c2:	00 
      e987c3:	e8 5a 53 c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e987c8:	4c 89 e7             	mov    rdi,r12
      e987cb:	e8 b6 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987d0:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
      e987d7:	00 
      e987d8:	e8 a9 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987dd:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e987e2:	e8 9f 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987e7:	48 8d bc 24 c0 0e 00 	lea    rdi,[rsp+0xec0]
      e987ee:	00 
      e987ef:	e8 76 17 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e987f4:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
      e987fb:	00 
      e987fc:	e8 69 17 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98801:	66 0f 6f 84 24 90 01 	movdqa xmm0,XMMWORD PTR [rsp+0x190]

### 0xe98b19; FDE=(15281964, 15306555): mov    rdi,QWORD PTR [rsp+0x58]
      e98acc:	eb 05                	jmp    e98ad3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fee9>
      e98ace:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ad3:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e98ada:	00 
      e98adb:	48 8b bb b8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb8]
      e98ae2:	e8 9f 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ae7:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
      e98aee:	e8 93 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98af3:	48 89 df             	mov    rdi,rbx
      e98af6:	e8 73 f7 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e98afb:	e9 61 fc ff ff       	jmp    e98761 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb77>
      e98b00:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b05:	e9 57 fc ff ff       	jmp    e98761 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb77>
      e98b0a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b0f:	e9 5a fc ff ff       	jmp    e9876e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb84>
      e98b14:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b19:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
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

### 0xe98c5c; FDE=(15281964, 15306555): mov    rdi,QWORD PTR [rsp+0x58]
      e98c17:	e8 6a 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c1c:	eb 77                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c1e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c23:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98c2a:	00 
      e98c2b:	e8 b8 1b 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98c30:	4c 89 f7             	mov    rdi,r14
      e98c33:	e8 be a2 02 00       	call   ec2ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a30c>
      e98c38:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e98c3f:	00 
      e98c40:	e8 21 12 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e98c45:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98c4a:	e8 85 0f 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98c4f:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98c56:	00 
      e98c57:	e8 e4 a2 02 00       	call   ec2f40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a356>
      e98c5c:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98c61:	e8 e0 8a 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      e98c66:	eb 05                	jmp    e98c6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60083>
      e98c68:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c6d:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      e98c72:	e8 0f 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c77:	31 ff                	xor    edi,edi
      e98c79:	e8 08 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c7e:	4c 89 e7             	mov    rdi,r12
      e98c81:	e8 8a 53 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c86:	4c 89 e7             	mov    rdi,r12
      e98c89:	e8 8e 57 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c8e:	eb 05                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c90:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c95:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e98c9c:	00 
      e98c9d:	e8 e4 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ca2:	e9 f8 fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98ca7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cac:	e9 ee fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cb1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cb6:	6a 20                	push   0x20
      e98cb8:	5b                   	pop    rbx
      e98cb9:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e98cc0:	00 
      e98cc1:	e8 c0 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98cc6:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e98cca:	75 ed                	jne    e98cb9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600cf>
      e98ccc:	e9 ce fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cd1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cd6:	4c 89 ff             	mov    rdi,r15

### 0xe99da7; FDE=(15310087, 15343400): mov    QWORD PTR [r8+0x58],rax
      e99d62:	49 89 f4             	mov    r12,rsi
      e99d65:	41 c7 40 f4 00 01 00 	mov    DWORD PTR [r8-0xc],0x100
      e99d6c:	00 
      e99d6d:	48 8d 05 4c 40 96 00 	lea    rax,[rip+0x96404c]        # 17fddc0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe60>
      e99d74:	49 89 00             	mov    QWORD PTR [r8],rax
      e99d77:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
      e99d7b:	49 83 60 30 00       	and    QWORD PTR [r8+0x30],0x0
      e99d80:	49 89 ff             	mov    r15,rdi
      e99d83:	41 83 60 37 00       	and    DWORD PTR [r8+0x37],0x0
      e99d88:	48 8b b4 24 68 13 00 	mov    rsi,QWORD PTR [rsp+0x1368]
      e99d8f:	00 
      e99d90:	49 c7 40 40 96 00 00 	mov    QWORD PTR [r8+0x40],0x96
      e99d97:	00 
      e99d98:	41 c6 40 48 01       	mov    BYTE PTR [r8+0x48],0x1
      e99d9d:	48 b8 00 00 00 00 0a 	movabs rax,0xa00000000
      e99da4:	00 00 00 
      e99da7:	49 89 40 58          	mov    QWORD PTR [r8+0x58],rax
      e99dab:	41 83 60 50 00       	and    DWORD PTR [r8+0x50],0x0
      e99db0:	31 c0                	xor    eax,eax
      e99db2:	41 88 40 54          	mov    BYTE PTR [r8+0x54],al
      e99db6:	41 88 40 60          	mov    BYTE PTR [r8+0x60],al
      e99dba:	49 c7 40 68 50 00 00 	mov    QWORD PTR [r8+0x68],0x50
      e99dc1:	00 
      e99dc2:	49 83 60 70 00       	and    QWORD PTR [r8+0x70],0x0
      e99dc7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e99dca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e99dd1:	00 
      e99dd2:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e99dd5:	4c 89 a4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r12
      e99ddc:	00 
      e99ddd:	6a 38                	push   0x38
      e99ddf:	5f                   	pop    rdi
      e99de0:	e8 1b 41 95 00       	call   17edf00 <_Znwm@plt>
      e99de5:	4c 8b a4 24 58 12 00 	mov    r12,QWORD PTR [rsp+0x1258]
      e99dec:	00 
      e99ded:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e99df4:	00 
      e99df5:	66 0f ef c9          	pxor   xmm1,xmm1
      e99df9:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      e99dfe:	48 8d 0d 7b 72 96 00 	lea    rcx,[rip+0x96727b]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
      e99e05:	48 89 08             	mov    QWORD PTR [rax],rcx
      e99e08:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
      e99e0f:	00 
      e99e10:	66 0f 7f 8c 24 70 07 	movdqa XMMWORD PTR [rsp+0x770],xmm1
      e99e17:	00 00 
      e99e19:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      e99e1d:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14

## Functions referencing AP and +0x58
### FDE 0xe92f2c..0xe98f3b
- 0xe93343: mov    BYTE PTR [r14+0x58],bpl
      e93314:	e8 e7 ab 95 00       	call   17edf00 <_Znwm@plt>
      e93319:	49 89 c6             	mov    r14,rax
      e9331c:	4c 63 ed             	movsxd r13,ebp
      e9331f:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
      e93326:	00 
      e93327:	49 89 1f             	mov    QWORD PTR [r15],rbx
      e9332a:	48 8b 05 6f e7 a1 00 	mov    rax,QWORD PTR [rip+0xa1e76f]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e93331:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e93335:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e93339:	4c 89 f7             	mov    rdi,r14
      e9333c:	e8 4d 4f c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93341:	31 ed                	xor    ebp,ebp
      e93343:	41 88 6e 58          	mov    BYTE PTR [r14+0x58],bpl
      e93347:	49 8d 7e 60          	lea    rdi,[r14+0x60]
      e9334b:	4c 89 fe             	mov    rsi,r15
      e9334e:	e8 9d 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e93353:	4d 89 ae 90 00 00 00 	mov    QWORD PTR [r14+0x90],r13
      e9335a:	41 88 ae 98 00 00 00 	mov    BYTE PTR [r14+0x98],bpl
      e93361:	41 88 ae a0 00 00 00 	mov    BYTE PTR [r14+0xa0],bpl
      e93368:	4c 89 f7             	mov    rdi,r14
      e9336b:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
      e93372:	4c 89 e6             	mov    rsi,r12
      e93375:	e8 48 e3 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e9337a:	4c 89 b4 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],r14
      e93381:	00 
      e93382:	4c 89 ff             	mov    rdi,r15
      e93385:	e8 e0 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9338a:	6a 70                	push   0x70
      e9338c:	5f                   	pop    rdi
      e9338d:	e8 6e ab 95 00       	call   17edf00 <_Znwm@plt>
      e93392:	48 89 c3             	mov    rbx,rax
      e93395:	66 0f ef c0          	pxor   xmm0,xmm0
      e93399:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
- 0xe939e4: mov    QWORD PTR [rbx+0x58],rax
      e939ae:	31 f6                	xor    esi,esi
      e939b0:	e8 db b1 95 00       	call   17eeb90 <memset@plt>
      e939b5:	48 8d 05 e4 49 9e 00 	lea    rax,[rip+0x9e49e4]        # 18783a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34a88>
      e939bc:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e939c0:	48 8d 43 28          	lea    rax,[rbx+0x28]
      e939c4:	66 0f ef c0          	pxor   xmm0,xmm0
      e939c8:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
      e939cd:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      e939d1:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
      e939d6:	f3 0f 7f 43 48       	movdqu XMMWORD PTR [rbx+0x48],xmm0
      e939db:	48 8d 43 60          	lea    rax,[rbx+0x60]
      e939df:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
      e939e4:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
      e939e8:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      e939ed:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e939f4:	00 
      e939f5:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
      e939fc:	f3 0f 7f 83 98 00 00 	movdqu XMMWORD PTR [rbx+0x98],xmm0
      e93a03:	00 
      e93a04:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
      e93a0b:	f3 0f 7f 83 a8 00 00 	movdqu XMMWORD PTR [rbx+0xa8],xmm0
      e93a12:	00 
      e93a13:	f3 0f 7f 83 b8 00 00 	movdqu XMMWORD PTR [rbx+0xb8],xmm0
      e93a1a:	00 
      e93a1b:	48 8d 83 d0 00 00 00 	lea    rax,[rbx+0xd0]
      e93a22:	f3 0f 7f 83 d0 00 00 	movdqu XMMWORD PTR [rbx+0xd0],xmm0
      e93a29:	00 
      e93a2a:	48 89 83 c8 00 00 00 	mov    QWORD PTR [rbx+0xc8],rax
      e93a31:	f3 0f 7f 83 e0 00 00 	movdqu XMMWORD PTR [rbx+0xe0],xmm0
      e93a38:	00 
      e93a39:	f3 0f 7f 83 f0 00 00 	movdqu XMMWORD PTR [rbx+0xf0],xmm0
      e93a40:	00 
      e93a41:	f3 0f 7f 83 00 01 00 	movdqu XMMWORD PTR [rbx+0x100],xmm0
- 0xe93da0: mov    DWORD PTR [rsp+0x58],r12d
      e93d6e:	eb 30                	jmp    e93da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b1b6>
      e93d70:	48 8d 35 bb f4 53 ff 	lea    rsi,[rip+0xffffffffff53f4bb]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
      e93d77:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93d7e:	00 
      e93d7f:	e8 cb 7a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e93d84:	84 c0                	test   al,al
      e93d86:	75 18                	jne    e93da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b1b6>
      e93d88:	48 8d 35 95 84 4a ff 	lea    rsi,[rip+0xffffffffff4a8495]        # 33c224 <_ZTSSt12bad_any_cast@@Base-0x53fa4>
      e93d8f:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93d96:	00 
      e93d97:	e8 b3 7a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e93d9c:	44 0f b6 e0          	movzx  r12d,al
      e93da0:	44 89 64 24 58       	mov    DWORD PTR [rsp+0x58],r12d
      e93da5:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93dac:	00 
      e93dad:	e8 7e 2f c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e93db2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e93db7:	48 8b 00             	mov    rax,QWORD PTR [rax]
      e93dba:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e93dbf:	bf 60 01 00 00       	mov    edi,0x160
      e93dc4:	e8 37 a1 95 00       	call   17edf00 <_Znwm@plt>
      e93dc9:	48 8b 94 24 80 01 00 	mov    rdx,QWORD PTR [rsp+0x180]
      e93dd0:	00 
      e93dd1:	49 89 d4             	mov    r12,rdx
      e93dd4:	49 83 c4 18          	add    r12,0x18
      e93dd8:	48 8b b4 24 70 01 00 	mov    rsi,QWORD PTR [rsp+0x170]
      e93ddf:	00 
      e93de0:	49 89 f6             	mov    r14,rsi
      e93de3:	49 83 c6 18          	add    r14,0x18
      e93de7:	66 0f ef c0          	pxor   xmm0,xmm0
      e93deb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93df0:	48 8d 0d e9 dc 99 00 	lea    rcx,[rip+0x99dce9]        # 1831ae0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a78>
      e93df7:	48 89 08             	mov    QWORD PTR [rax],rcx
- 0xe93ee2: mov    BYTE PTR [rbp+0x58],al
      e93eb3:	00 
      e93eb4:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      e93eb8:	69 c1 60 ea 00 00    	imul   eax,ecx,0xea60
      e93ebe:	48 98                	cdqe
      e93ec0:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
      e93ec4:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
      e93ec8:	48 89 45 38          	mov    QWORD PTR [rbp+0x38],rax
      e93ecc:	41 69 c5 60 ea 00 00 	imul   eax,r13d,0xea60
      e93ed3:	66 0f 7f 45 40       	movdqa XMMWORD PTR [rbp+0x40],xmm0
      e93ed8:	89 45 50             	mov    DWORD PTR [rbp+0x50],eax
      e93edb:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0
      e93ee0:	31 c0                	xor    eax,eax
      e93ee2:	88 45 58             	mov    BYTE PTR [rbp+0x58],al
      e93ee5:	88 45 60             	mov    BYTE PTR [rbp+0x60],al
      e93ee8:	48 8d 7d 68          	lea    rdi,[rbp+0x68]
      e93eec:	49 89 d5             	mov    r13,rdx
      e93eef:	49 89 f7             	mov    r15,rsi
      e93ef2:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      e93ef7:	e8 fa 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93efc:	48 8d 7d 78          	lea    rdi,[rbp+0x78]
      e93f00:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      e93f05:	e8 ec 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93f0a:	48 8d bd 88 00 00 00 	lea    rdi,[rbp+0x88]
      e93f11:	48 89 bc 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rdi
      e93f18:	00 
      e93f19:	e8 d8 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93f1e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e93f23:	48 89 85 98 00 00 00 	mov    QWORD PTR [rbp+0x98],rax
      e93f2a:	48 8d bd a0 00 00 00 	lea    rdi,[rbp+0xa0]
      e93f31:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e93f36:	e8 bb 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93f3b:	48 8d bd b0 00 00 00 	lea    rdi,[rbp+0xb0]
      e93f42:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
- 0xe93fde: mov    eax,DWORD PTR [rsp+0x58]
      e93f94:	48 8b 84 24 f0 00 00 	mov    rax,QWORD PTR [rsp+0xf0]
      e93f9b:	00 
      e93f9c:	48 89 85 10 01 00 00 	mov    QWORD PTR [rbp+0x110],rax
      e93fa3:	4c 89 a5 18 01 00 00 	mov    QWORD PTR [rbp+0x118],r12
      e93faa:	4c 89 ad 20 01 00 00 	mov    QWORD PTR [rbp+0x120],r13
      e93fb1:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e93fb6:	48 89 85 28 01 00 00 	mov    QWORD PTR [rbp+0x128],rax
      e93fbd:	48 89 9d 30 01 00 00 	mov    QWORD PTR [rbp+0x130],rbx
      e93fc4:	4c 89 b5 38 01 00 00 	mov    QWORD PTR [rbp+0x138],r14
      e93fcb:	4c 89 bd 40 01 00 00 	mov    QWORD PTR [rbp+0x140],r15
      e93fd2:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      e93fd7:	48 89 85 48 01 00 00 	mov    QWORD PTR [rbp+0x148],rax
      e93fde:	8b 44 24 58          	mov    eax,DWORD PTR [rsp+0x58]
      e93fe2:	89 85 50 01 00 00    	mov    DWORD PTR [rbp+0x150],eax
      e93fe8:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
      e93fef:	00 
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
- 0xe9421f: mov    QWORD PTR [rsp+0x58],rbx
      e941eb:	49 8d 5c 24 08       	lea    rbx,[r12+0x8]
      e941f0:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e941f7:	00 
      e941f8:	4c 89 f7             	mov    rdi,r14
      e941fb:	e8 a8 57 00 00       	call   e999a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60dbe>
      e94200:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      e94207:	00 00 
      e94209:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      e94210:	48 85 c0             	test   rax,rax
      e94213:	74 05                	je     e9421a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b630>
      e94215:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9421a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      e9421f:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e94224:	f0 48 ff 03          	lock inc QWORD PTR [rbx]
      e94228:	6a 30                	push   0x30
      e9422a:	5b                   	pop    rbx
      e9422b:	48 89 df             	mov    rdi,rbx
      e9422e:	e8 cd 9c 95 00       	call   17edf00 <_Znwm@plt>
      e94233:	49 89 c7             	mov    r15,rax
      e94236:	66 0f ef c0          	pxor   xmm0,xmm0
      e9423a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9423f:	48 8d 05 1a d9 99 00 	lea    rax,[rip+0x99d91a]        # 1831b60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3af8>
      e94246:	49 89 07             	mov    QWORD PTR [r15],rax
      e94249:	49 8d 47 20          	lea    rax,[r15+0x20]
      e9424d:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e94253:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e94257:	6a 48                	push   0x48
      e94259:	5f                   	pop    rdi
      e9425a:	e8 a1 9c 95 00       	call   17edf00 <_Znwm@plt>
      e9425f:	4c 89 f9             	mov    rcx,r15
      e94262:	48 83 c1 18          	add    rcx,0x18
      e94266:	66 0f ef c0          	pxor   xmm0,xmm0
      e9426a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
- 0xe94ea2: and    QWORD PTR [r12+0x58],0x0
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94e8e:	00 f0 3f 
      e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      e94e96:	31 c0                	xor    eax,eax
      e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
      e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e94ebf:	00 
      e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      e94ec5:	4c 89 ee             	mov    rsi,r13
      e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e94ed4:	00 00 
      e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
      e94edd:	00 
      e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
      e94ee5:	00 
      e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
      e94eed:	00 
      e94eee:	48 89 df             	mov    rdi,rbx
      e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
      e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]
- 0xe955e0: mov    rax,QWORD PTR [rsp+0x58]
      e955b4:	e8 63 42 c2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      e955b9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e955bd:	e8 c4 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e955c2:	4c 89 f7             	mov    rdi,r14
      e955c5:	e8 7e f2 c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
      e955ca:	6a 20                	push   0x20
      e955cc:	5b                   	pop    rbx
      e955cd:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e955d4:	00 
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
- 0xe956cd: movdqu XMMWORD PTR [r12+0x58],xmm0
      e9569e:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e956a5:	00 
      e956a6:	48 89 df             	mov    rdi,rbx
      e956a9:	4c 89 f6             	mov    rsi,r14
      e956ac:	4c 89 ea             	mov    rdx,r13
      e956af:	e8 66 c0 92 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
      e956b4:	4c 89 ef             	mov    rdi,r13
      e956b7:	e8 d4 87 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e956bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e956c1:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e956c8:	00 
      e956c9:	66 0f ef c0          	pxor   xmm0,xmm0
      e956cd:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
      e956d4:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e956db:	bd 00 00 80 3f       	mov    ebp,0x3f800000
      e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
      e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e956ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e956ef:	e8 02 43 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e956fb:	00 
      e956fc:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
      e95703:	00 
      e95704:	e8 85 2b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95709:	4d 89 e6             	mov    r14,r12
      e9570c:	49 81 c6 d8 00 00 00 	add    r14,0xd8
      e95713:	66 0f ef c0          	pxor   xmm0,xmm0
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e9571e:	00 00 00 
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
- 0xe95775: mov    QWORD PTR [rsp+0x58],rbx
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>
      e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e95768:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e9576f:	00 
      e95770:	b9 60 ea 00 00       	mov    ecx,0xea60
      e95775:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e9577a:	48 89 df             	mov    rdi,rbx
      e9577d:	4c 89 fb             	mov    rbx,r15
      e95780:	4c 89 ea             	mov    rdx,r13
      e95783:	e8 fc c0 92 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
      e95788:	4c 89 ef             	mov    rdi,r13
      e9578b:	e8 0e 1b c1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      e95790:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
      e95795:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
      e9579c:	00 
      e9579d:	4d 89 38             	mov    QWORD PTR [r8],r15
      e957a0:	48 8d 35 ea 78 c0 ff 	lea    rsi,[rip+0xffffffffffc078ea]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e957a7:	48 8d 0d 8c d5 02 00 	lea    rcx,[rip+0x2d58c]        # ec2d3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a150>
      e957ae:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e957b5:	00 
      e957b6:	6a 08                	push   0x8
      e957b8:	41 59                	pop    r9
      e957ba:	48 89 ef             	mov    rdi,rbp
      e957bd:	31 d2                	xor    edx,edx
      e957bf:	e8 d0 4f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e957c4:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
- 0xe958e6: mov    QWORD PTR [rsp+0x58],rbp
      e958b9:	00 
      e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      e958c1:	00 
      e958c2:	e8 f7 63 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e958c7:	6a 50                	push   0x50
      e958c9:	5f                   	pop    rdi
      e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
      e958cf:	48 89 c5             	mov    rbp,rax
      e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
- 0xe95d41: mov    rdi,QWORD PTR [rsp+0x58]
      e95cfb:	ff b4 24 20 02 00 00 	push   QWORD PTR [rsp+0x220]
      e95d02:	ff b4 24 d0 01 00 00 	push   QWORD PTR [rsp+0x1d0]
      e95d09:	ff b4 24 b8 02 00 00 	push   QWORD PTR [rsp+0x2b8]
      e95d10:	ff b4 24 98 03 00 00 	push   QWORD PTR [rsp+0x398]
      e95d17:	ff b4 24 20 02 00 00 	push   QWORD PTR [rsp+0x220]
      e95d1e:	48 8d 84 24 50 05 00 	lea    rax,[rsp+0x550]
      e95d25:	00 
      e95d26:	50                   	push   rax
      e95d27:	ff b4 24 10 02 00 00 	push   QWORD PTR [rsp+0x210]
      e95d2e:	ff b4 24 a0 02 00 00 	push   QWORD PTR [rsp+0x2a0]
      e95d35:	e8 cd 3f 00 00       	call   e99d07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6111d>
      e95d3a:	48 81 c4 80 01 00 00 	add    rsp,0x180
      e95d41:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
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
- 0xe96493: mov    rax,QWORD PTR [r14+0x58]
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
- 0xe96e98: mov    rbx,QWORD PTR [rsp+0x58]
      e96e5e:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96e65:	00 
      e96e66:	4c 89 ff             	mov    rdi,r15
      e96e69:	e8 7a 39 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96e6e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
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
- 0xe9714b: movups XMMWORD PTR [r14+0x58],xmm0
      e9711c:	48 8b 84 24 48 03 00 	mov    rax,QWORD PTR [rsp+0x348]
      e97123:	00 
      e97124:	0f 28 84 24 40 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x340]
      e9712b:	00 
      e9712c:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      e97131:	48 85 c0             	test   rax,rax
      e97134:	74 05                	je     e9713b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e551>
      e97136:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9713b:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e97142:	00 
      e97143:	0f 28 84 24 50 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x350]
      e9714a:	00 
      e9714b:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      e97150:	48 85 c0             	test   rax,rax
      e97153:	74 05                	je     e9715a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e570>
      e97155:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9715a:	48 8b 84 24 68 03 00 	mov    rax,QWORD PTR [rsp+0x368]
      e97161:	00 
      e97162:	0f 28 84 24 60 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x360]
      e97169:	00 
      e9716a:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      e9716f:	48 85 c0             	test   rax,rax
      e97172:	74 05                	je     e97179 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e58f>
      e97174:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e97179:	48 8b 84 24 78 03 00 	mov    rax,QWORD PTR [rsp+0x378]
      e97180:	00 
      e97181:	66 0f 6f 84 24 70 03 	movdqa xmm0,XMMWORD PTR [rsp+0x370]
      e97188:	00 00 
      e9718a:	f3 41 0f 7f 46 78    	movdqu XMMWORD PTR [r14+0x78],xmm0
      e97190:	48 85 c0             	test   rax,rax
      e97193:	74 05                	je     e9719a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e5b0>
      e97195:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9719a:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]
- 0xe97982: mov    rdi,QWORD PTR [rsp+0x58]
      e9794e:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e97955:	00 
      e97956:	e8 23 ac 00 00       	call   ea257e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
      e9795b:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e97962:	00 
      e97963:	e8 88 ac 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e97968:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e9796f:	00 
      e97970:	e8 1b 65 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e97975:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e9797c:	00 
      e9797d:	e8 ec 08 cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e97982:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e97987:	e8 fa 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9798c:	48 8b bc 24 f8 02 00 	mov    rdi,QWORD PTR [rsp+0x2f8]
      e97993:	00 
      e97994:	e8 ed 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97999:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e979a0:	00 
      e979a1:	e8 e0 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979a6:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e979ab:	e8 d6 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979b0:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e979b7:	00 
      e979b8:	e8 65 61 c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e979bd:	48 8b bc 24 28 03 00 	mov    rdi,QWORD PTR [rsp+0x328]
      e979c4:	00 
      e979c5:	e8 bc 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979ca:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
      e979d1:	00 
      e979d2:	e8 af 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979d7:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e979dc:	e8 a5 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- 0xe9877b: mov    rdi,QWORD PTR [rsp+0x58]
      e98747:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e9874e:	00 
      e9874f:	e8 2a 9e 00 00       	call   ea257e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
      e98754:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9875b:	00 
      e9875c:	e8 8f 9e 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e98761:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e98768:	00 
      e98769:	e8 22 57 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9876e:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e98775:	00 
      e98776:	e8 f3 fa ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9877b:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98780:	e8 01 5d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98785:	48 8b bc 24 f8 02 00 	mov    rdi,QWORD PTR [rsp+0x2f8]
      e9878c:	00 
      e9878d:	e8 f4 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98792:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98799:	00 
      e9879a:	e8 e7 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9879f:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e987a4:	e8 db 09 00 00       	call   e99184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6059a>
      e987a9:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e987ae:	e8 d3 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987b3:	4c 8b a4 24 28 03 00 	mov    r12,QWORD PTR [rsp+0x328]
      e987ba:	00 
      e987bb:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e987c2:	00 
      e987c3:	e8 5a 53 c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e987c8:	4c 89 e7             	mov    rdi,r12
      e987cb:	e8 b6 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987d0:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
      e987d7:	00 
- 0xe98b19: mov    rdi,QWORD PTR [rsp+0x58]
      e98adb:	48 8b bb b8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb8]
      e98ae2:	e8 9f 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ae7:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
      e98aee:	e8 93 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98af3:	48 89 df             	mov    rdi,rbx
      e98af6:	e8 73 f7 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e98afb:	e9 61 fc ff ff       	jmp    e98761 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb77>
      e98b00:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b05:	e9 57 fc ff ff       	jmp    e98761 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb77>
      e98b0a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b0f:	e9 5a fc ff ff       	jmp    e9876e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb84>
      e98b14:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b19:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
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
- 0xe98c5c: mov    rdi,QWORD PTR [rsp+0x58]
      e98c2a:	00 
      e98c2b:	e8 b8 1b 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98c30:	4c 89 f7             	mov    rdi,r14
      e98c33:	e8 be a2 02 00       	call   ec2ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a30c>
      e98c38:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e98c3f:	00 
      e98c40:	e8 21 12 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e98c45:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98c4a:	e8 85 0f 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98c4f:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98c56:	00 
      e98c57:	e8 e4 a2 02 00       	call   ec2f40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a356>
      e98c5c:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98c61:	e8 e0 8a 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      e98c66:	eb 05                	jmp    e98c6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60083>
      e98c68:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c6d:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      e98c72:	e8 0f 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c77:	31 ff                	xor    edi,edi
      e98c79:	e8 08 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c7e:	4c 89 e7             	mov    rdi,r12
      e98c81:	e8 8a 53 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c86:	4c 89 e7             	mov    rdi,r12
      e98c89:	e8 8e 57 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c8e:	eb 05                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c90:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c95:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e98c9c:	00 
      e98c9d:	e8 e4 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ca2:	e9 f8 fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98ca7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cac:	e9 ee fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cb1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

## All same-family methods that touch +0x40 relative to P
### table target 0xec57ee; FDE=0xec57ee..0xec5afd
- 0xec5914: mov    QWORD PTR [rsp+0x40],rcx
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

### table target 0xec5b7c; FDE=0xec5b7c..0xec5d0e
- 0xec5bfd: lea    rdx,[rsp+0x40]
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
- 0xec5c57: lea    rdi,[rsp+0x40]
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
- 0xec5ccc: lea    rdi,[rsp+0x40]
      ec5ca8:	00 
      ec5ca9:	75 5e                	jne    ec5d09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d11f>
      ec5cab:	48 89 d8             	mov    rax,rbx
      ec5cae:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
      ec5cb5:	5b                   	pop    rbx
      ec5cb6:	41 5c                	pop    r12
      ec5cb8:	41 5e                	pop    r14
      ec5cba:	41 5f                	pop    r15
      ec5cbc:	c3                   	ret
      ec5cbd:	49 89 c6             	mov    r14,rax
      ec5cc0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec5cc5:	eb 14                	jmp    ec5cdb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d0f1>
      ec5cc7:	eb 19                	jmp    ec5ce2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d0f8>
      ec5cc9:	49 89 c6             	mov    r14,rax
      ec5ccc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ec5cd1:	e8 b8 86 1e 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
      ec5cd6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ec5cdb:	e8 b0 81 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ec5ce0:	eb 03                	jmp    ec5ce5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d0fb>
      ec5ce2:	49 89 c6             	mov    r14,rax
      ec5ce5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ec5ce9:	e8 98 87 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec5cee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec5cf5:	00 00 
      ec5cf7:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
      ec5cfe:	00 
      ec5cff:	75 08                	jne    ec5d09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d11f>
      ec5d01:	4c 89 f7             	mov    rdi,r14
      ec5d04:	e8 c7 9f ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ec5d09:	e8 a2 9d 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ec5d0e:	53                   	push   rbx
      ec5d0f:	48 89 fb             	mov    rbx,rdi
      ec5d12:	48 8d 05 cf ce 96 00 	lea    rax,[rip+0x96cecf]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
      ec5d19:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec5d1c:	48 81 c7 88 00 00 00 	add    rdi,0x88
      ec5d23:	e8 ac 3e 91 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      ec5d28:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
      ec5d2c:	e8 d3 f7 ff ff       	call   ec5504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c91a>
      ec5d31:	48 8d 7b 18          	lea    rdi,[rbx+0x18]

### table target 0xec691e; FDE=0xec691e..0xec69da
- 0xec6931: mov    QWORD PTR [rsp+0x40],rax
      ec690b:	41 5f                	pop    r15
      ec690d:	ff e0                	jmp    rax
      ec690f:	cc                   	int3
      ec6910:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      ec6914:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ec6917:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
      ec691b:	ff e0                	jmp    rax
      ec691d:	cc                   	int3
      ec691e:	41 56                	push   r14
      ec6920:	53                   	push   rbx
      ec6921:	48 83 ec 48          	sub    rsp,0x48
      ec6925:	49 89 f6             	mov    r14,rsi
      ec6928:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec692f:	00 00 
      ec6931:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      ec6936:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
      ec693a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec693f:	c6 07 00             	mov    BYTE PTR [rdi],0x0
      ec6942:	83 4f 30 ff          	or     DWORD PTR [rdi+0x30],0xffffffff
      ec6946:	e8 39 6a fe ff       	call   ead384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7479a>
      ec694b:	41 8b 46 30          	mov    eax,DWORD PTR [r14+0x30]
      ec694f:	b9 ff ff ff ff       	mov    ecx,0xffffffff
      ec6954:	48 39 c8             	cmp    rax,rcx
      ec6957:	74 1f                	je     ec6978 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8dd8e>
      ec6959:	48 8d 0d 68 c3 96 00 	lea    rcx,[rip+0x96c368]        # 1832cc8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4c60>
      ec6960:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]
      ec6965:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      ec696a:	4c 89 f2             	mov    rdx,r14
      ec696d:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
      ec6970:	41 8b 46 30          	mov    eax,DWORD PTR [r14+0x30]
      ec6974:	89 44 24 38          	mov    DWORD PTR [rsp+0x38],eax
      ec6978:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ec697b:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      ec6980:	48 89 df             	mov    rdi,rbx
      ec6983:	ff 50 30             	call   QWORD PTR [rax+0x30]
      ec6986:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec698b:	e8 f4 69 fe ff       	call   ead384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7479a>
      ec6990:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec6997:	00 00 
- 0xec6999: cmp    rax,QWORD PTR [rsp+0x40]
      ec6960:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]
      ec6965:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      ec696a:	4c 89 f2             	mov    rdx,r14
      ec696d:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
      ec6970:	41 8b 46 30          	mov    eax,DWORD PTR [r14+0x30]
      ec6974:	89 44 24 38          	mov    DWORD PTR [rsp+0x38],eax
      ec6978:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ec697b:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      ec6980:	48 89 df             	mov    rdi,rbx
      ec6983:	ff 50 30             	call   QWORD PTR [rax+0x30]
      ec6986:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec698b:	e8 f4 69 fe ff       	call   ead384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7479a>
      ec6990:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec6997:	00 00 
      ec6999:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      ec699e:	75 35                	jne    ec69d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ddeb>
      ec69a0:	48 83 c4 48          	add    rsp,0x48
      ec69a4:	5b                   	pop    rbx
      ec69a5:	41 5e                	pop    r14
      ec69a7:	c3                   	ret
      ec69a8:	48 89 c7             	mov    rdi,rax
      ec69ab:	e8 f5 30 bb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ec69b0:	48 89 c3             	mov    rbx,rax
      ec69b3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec69b8:	e8 c7 69 fe ff       	call   ead384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7479a>
      ec69bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec69c4:	00 00 
      ec69c6:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      ec69cb:	75 08                	jne    ec69d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ddeb>
      ec69cd:	48 89 df             	mov    rdi,rbx
      ec69d0:	e8 fb 92 ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ec69d5:	e8 d6 90 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ec69da:	48 89 f7             	mov    rdi,rsi
      ec69dd:	48 89 d6             	mov    rsi,rdx
      ec69e0:	e9 db 6a fe ff       	jmp    ead4c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x748d6>
      ec69e5:	cc                   	int3
      ec69e6:	48 89 f7             	mov    rdi,rsi
      ec69e9:	48 89 d6             	mov    rsi,rdx
      ec69ec:	e9 ef 69 fe ff       	jmp    ead3e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x747f6>
- 0xec69c6: cmp    rax,QWORD PTR [rsp+0x40]
      ec6997:	00 00 
      ec6999:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      ec699e:	75 35                	jne    ec69d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ddeb>
      ec69a0:	48 83 c4 48          	add    rsp,0x48
      ec69a4:	5b                   	pop    rbx
      ec69a5:	41 5e                	pop    r14
      ec69a7:	c3                   	ret
      ec69a8:	48 89 c7             	mov    rdi,rax
      ec69ab:	e8 f5 30 bb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ec69b0:	48 89 c3             	mov    rbx,rax
      ec69b3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ec69b8:	e8 c7 69 fe ff       	call   ead384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7479a>
      ec69bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ec69c4:	00 00 
      ec69c6:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      ec69cb:	75 08                	jne    ec69d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ddeb>
      ec69cd:	48 89 df             	mov    rdi,rbx
      ec69d0:	e8 fb 92 ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ec69d5:	e8 d6 90 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ec69da:	48 89 f7             	mov    rdi,rsi
      ec69dd:	48 89 d6             	mov    rsi,rdx
      ec69e0:	e9 db 6a fe ff       	jmp    ead4c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x748d6>
      ec69e5:	cc                   	int3
      ec69e6:	48 89 f7             	mov    rdi,rsi
      ec69e9:	48 89 d6             	mov    rsi,rdx
      ec69ec:	e9 ef 69 fe ff       	jmp    ead3e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x747f6>
      ec69f1:	cc                   	int3
      ec69f2:	53                   	push   rbx
      ec69f3:	48 89 fb             	mov    rbx,rdi
      ec69f6:	48 8d 05 5b 9f 9b 00 	lea    rax,[rip+0x9b9f5b]        # 1880958 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3d040>
      ec69fd:	48 89 07             	mov    QWORD PTR [rdi],rax
      ec6a00:	48 83 c7 08          	add    rdi,0x8
      ec6a04:	e8 37 75 92 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ec6a09:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      ec6a0d:	e8 f4 e6 f3 ff       	call   e05106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd218c>
      ec6a12:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
      ec6a19:	e8 10 00 00 00       	call   ec6a2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de44>
      ec6a1e:	48 81 c3 50 01 00 00 	add    rbx,0x150
      ec6a25:	48 89 df             	mov    rdi,rbx

### table target 0xec70f2; FDE=0xec70f2..0xec7114
- 0xec70fa: mov    BYTE PTR [rdi+0x40],cl
      ec70d1:	e8 b0 73 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ec70d6:	48 89 df             	mov    rdi,rbx
      ec70d9:	5b                   	pop    rbx
      ec70da:	e9 8d f9 ff ff       	jmp    ec6a6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de82>
      ec70df:	cc                   	int3
      ec70e0:	53                   	push   rbx
      ec70e1:	48 89 fb             	mov    rbx,rdi
      ec70e4:	e8 c7 ff ff ff       	call   ec70b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e4c6>
      ec70e9:	48 89 df             	mov    rdi,rbx
      ec70ec:	5b                   	pop    rbx
      ec70ed:	e9 2e 6e 92 00       	jmp    17edf20 <_ZdlPv@plt>
      ec70f2:	48 89 f8             	mov    rax,rdi
      ec70f5:	31 c9                	xor    ecx,ecx
      ec70f7:	88 4f 38             	mov    BYTE PTR [rdi+0x38],cl
      ec70fa:	88 4f 40             	mov    BYTE PTR [rdi+0x40],cl
      ec70fd:	88 4f 48             	mov    BYTE PTR [rdi+0x48],cl
      ec7100:	88 4f 50             	mov    BYTE PTR [rdi+0x50],cl
      ec7103:	88 4f 58             	mov    BYTE PTR [rdi+0x58],cl
      ec7106:	0f 57 c0             	xorps  xmm0,xmm0
      ec7109:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ec710c:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      ec7110:	88 4f 20             	mov    BYTE PTR [rdi+0x20],cl
      ec7113:	c3                   	ret
      ec7114:	41 56                	push   r14
      ec7116:	53                   	push   rbx
      ec7117:	50                   	push   rax
      ec7118:	48 89 f3             	mov    rbx,rsi
      ec711b:	49 89 fe             	mov    r14,rdi
      ec711e:	48 8b 7e 48          	mov    rdi,QWORD PTR [rsi+0x48]
      ec7122:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      ec7129:	74 0c                	je     ec7137 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e54d>
      ec712b:	49 8b b6 c8 01 00 00 	mov    rsi,QWORD PTR [r14+0x1c8]
      ec7132:	e8 6d 00 00 00       	call   ec71a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e5ba>
      ec7137:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
      ec713b:	49 8b 96 c8 01 00 00 	mov    rdx,QWORD PTR [r14+0x1c8]
      ec7142:	49 8b b6 e0 01 00 00 	mov    rsi,QWORD PTR [r14+0x1e0]
      ec7149:	e8 95 00 00 00       	call   ec71e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e5f9>
      ec714e:	48 83 c3 28          	add    rbx,0x28
      ec7152:	49 8b 96 c8 01 00 00 	mov    rdx,QWORD PTR [r14+0x1c8]

### table target 0xec7114; FDE=0xec7114..0xec716f
- 0xec7137: lea    rdi,[rbx+0x40]
      ec7109:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ec710c:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      ec7110:	88 4f 20             	mov    BYTE PTR [rdi+0x20],cl
      ec7113:	c3                   	ret
      ec7114:	41 56                	push   r14
      ec7116:	53                   	push   rbx
      ec7117:	50                   	push   rax
      ec7118:	48 89 f3             	mov    rbx,rsi
      ec711b:	49 89 fe             	mov    r14,rdi
      ec711e:	48 8b 7e 48          	mov    rdi,QWORD PTR [rsi+0x48]
      ec7122:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      ec7129:	74 0c                	je     ec7137 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e54d>
      ec712b:	49 8b b6 c8 01 00 00 	mov    rsi,QWORD PTR [r14+0x1c8]
      ec7132:	e8 6d 00 00 00       	call   ec71a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e5ba>
      ec7137:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
      ec713b:	49 8b 96 c8 01 00 00 	mov    rdx,QWORD PTR [r14+0x1c8]
      ec7142:	49 8b b6 e0 01 00 00 	mov    rsi,QWORD PTR [r14+0x1e0]
      ec7149:	e8 95 00 00 00       	call   ec71e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e5f9>
      ec714e:	48 83 c3 28          	add    rbx,0x28
      ec7152:	49 8b 96 c8 01 00 00 	mov    rdx,QWORD PTR [r14+0x1c8]
      ec7159:	49 8b b6 d8 01 00 00 	mov    rsi,QWORD PTR [r14+0x1d8]
      ec7160:	48 89 df             	mov    rdi,rbx
      ec7163:	48 83 c4 08          	add    rsp,0x8
      ec7167:	5b                   	pop    rbx
      ec7168:	41 5e                	pop    r14
      ec716a:	e9 74 00 00 00       	jmp    ec71e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e5f9>
      ec716f:	cc                   	int3
      ec7170:	53                   	push   rbx
      ec7171:	4c 89 c6             	mov    rsi,r8
      ec7174:	48 89 fb             	mov    rbx,rdi
      ec7177:	e8 c4 6d 92 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ec717c:	48 89 d8             	mov    rax,rbx
      ec717f:	5b                   	pop    rbx
      ec7180:	c3                   	ret
      ec7181:	cc                   	int3
      ec7182:	48 89 f8             	mov    rax,rdi
      ec7185:	0f 57 c0             	xorps  xmm0,xmm0
      ec7188:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      ec718c:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0

## Candidate writes to outer+0x58 in same giant factory
- FDE 0xe92f2c..0xe98f3b
### WRITE 0xe93343: mov    BYTE PTR [r14+0x58],bpl
      e932f6:	48 8d 0d d3 0a 54 ff 	lea    rcx,[rip+0xffffffffff540ad3]        # 3d3dd0 <_ZTSN5boost17bad_function_callE@@Base+0x1116>
      e932fd:	6a 0b                	push   0xb
      e932ff:	5a                   	pop    rdx
      e93300:	6a 20                	push   0x20
      e93302:	41 58                	pop    r8
      e93304:	6a 3c                	push   0x3c
      e93306:	41 59                	pop    r9
      e93308:	e8 1d 41 75 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
      e9330d:	89 c5                	mov    ebp,eax
      e9330f:	bf c0 00 00 00       	mov    edi,0xc0
      e93314:	e8 e7 ab 95 00       	call   17edf00 <_Znwm@plt>
      e93319:	49 89 c6             	mov    r14,rax
      e9331c:	4c 63 ed             	movsxd r13,ebp
      e9331f:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
      e93326:	00 
      e93327:	49 89 1f             	mov    QWORD PTR [r15],rbx
      e9332a:	48 8b 05 6f e7 a1 00 	mov    rax,QWORD PTR [rip+0xa1e76f]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e93331:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e93335:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e93339:	4c 89 f7             	mov    rdi,r14
      e9333c:	e8 4d 4f c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93341:	31 ed                	xor    ebp,ebp
      e93343:	41 88 6e 58          	mov    BYTE PTR [r14+0x58],bpl
      e93347:	49 8d 7e 60          	lea    rdi,[r14+0x60]
      e9334b:	4c 89 fe             	mov    rsi,r15
      e9334e:	e8 9d 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e93353:	4d 89 ae 90 00 00 00 	mov    QWORD PTR [r14+0x90],r13
      e9335a:	41 88 ae 98 00 00 00 	mov    BYTE PTR [r14+0x98],bpl
      e93361:	41 88 ae a0 00 00 00 	mov    BYTE PTR [r14+0xa0],bpl
      e93368:	4c 89 f7             	mov    rdi,r14
      e9336b:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
      e93372:	4c 89 e6             	mov    rsi,r12
      e93375:	e8 48 e3 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e9337a:	4c 89 b4 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],r14
      e93381:	00 
      e93382:	4c 89 ff             	mov    rdi,r15
      e93385:	e8 e0 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9338a:	6a 70                	push   0x70
      e9338c:	5f                   	pop    rdi
      e9338d:	e8 6e ab 95 00       	call   17edf00 <_Znwm@plt>
      e93392:	48 89 c3             	mov    rbx,rax
      e93395:	66 0f ef c0          	pxor   xmm0,xmm0
      e93399:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9339e:	48 8d 05 23 7a 97 00 	lea    rax,[rip+0x977a23]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e933a5:	48 89 03             	mov    QWORD PTR [rbx],rax
      e933a8:	4c 8d 63 20          	lea    r12,[rbx+0x20]
      e933ac:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
      e933b3:	00 
      e933b4:	48 8d b4 24 20 0f 00 	lea    rsi,[rsp+0xf20]
      e933bb:	00 
      e933bc:	4c 89 ff             	mov    rdi,r15
      e933bf:	e8 2c 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e933c4:	48 8d 05 f5 0f 9b 00 	lea    rax,[rip+0x9b0ff5]        # 18443c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaa8>
      e933cb:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      e933cf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      e933d3:	4c 89 fe             	mov    rsi,r15
      e933d6:	e8 15 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e933db:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e933e2:	00 00 
      e933e4:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14
      e933e8:	48 83 7b 50 00       	cmp    QWORD PTR [rbx+0x50],0x0

### WRITE 0xe939e4: mov    QWORD PTR [rbx+0x58],rax
      e9397f:	ff 51 30             	call   QWORD PTR [rcx+0x30]
      e93982:	bf 00 02 00 00       	mov    edi,0x200
      e93987:	e8 74 a5 95 00       	call   17edf00 <_Znwm@plt>
      e9398c:	48 89 c3             	mov    rbx,rax
      e9398f:	66 0f ef c0          	pxor   xmm0,xmm0
      e93993:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93998:	48 8d 05 c9 9a 96 00 	lea    rax,[rip+0x969ac9]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e9399f:	48 89 03             	mov    QWORD PTR [rbx],rax
      e939a2:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
      e939a9:	ba c8 00 00 00       	mov    edx,0xc8
      e939ae:	31 f6                	xor    esi,esi
      e939b0:	e8 db b1 95 00       	call   17eeb90 <memset@plt>
      e939b5:	48 8d 05 e4 49 9e 00 	lea    rax,[rip+0x9e49e4]        # 18783a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34a88>
      e939bc:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e939c0:	48 8d 43 28          	lea    rax,[rbx+0x28]
      e939c4:	66 0f ef c0          	pxor   xmm0,xmm0
      e939c8:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
      e939cd:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      e939d1:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
      e939d6:	f3 0f 7f 43 48       	movdqu XMMWORD PTR [rbx+0x48],xmm0
      e939db:	48 8d 43 60          	lea    rax,[rbx+0x60]
      e939df:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
      e939e4:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
      e939e8:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      e939ed:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e939f4:	00 
      e939f5:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
      e939fc:	f3 0f 7f 83 98 00 00 	movdqu XMMWORD PTR [rbx+0x98],xmm0
      e93a03:	00 
      e93a04:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
      e93a0b:	f3 0f 7f 83 a8 00 00 	movdqu XMMWORD PTR [rbx+0xa8],xmm0
      e93a12:	00 
      e93a13:	f3 0f 7f 83 b8 00 00 	movdqu XMMWORD PTR [rbx+0xb8],xmm0
      e93a1a:	00 
      e93a1b:	48 8d 83 d0 00 00 00 	lea    rax,[rbx+0xd0]
      e93a22:	f3 0f 7f 83 d0 00 00 	movdqu XMMWORD PTR [rbx+0xd0],xmm0
      e93a29:	00 
      e93a2a:	48 89 83 c8 00 00 00 	mov    QWORD PTR [rbx+0xc8],rax
      e93a31:	f3 0f 7f 83 e0 00 00 	movdqu XMMWORD PTR [rbx+0xe0],xmm0
      e93a38:	00 
      e93a39:	f3 0f 7f 83 f0 00 00 	movdqu XMMWORD PTR [rbx+0xf0],xmm0
      e93a40:	00 
      e93a41:	f3 0f 7f 83 00 01 00 	movdqu XMMWORD PTR [rbx+0x100],xmm0
      e93a48:	00 
      e93a49:	f3 0f 7f 83 10 01 00 	movdqu XMMWORD PTR [rbx+0x110],xmm0
      e93a50:	00 
      e93a51:	f3 0f 7f 83 20 01 00 	movdqu XMMWORD PTR [rbx+0x120],xmm0
      e93a58:	00 
      e93a59:	48 c7 83 30 01 00 00 	mov    QWORD PTR [rbx+0x130],0x1
      e93a60:	01 00 00 00 
      e93a64:	c6 83 40 01 00 00 00 	mov    BYTE PTR [rbx+0x140],0x0
      e93a6b:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]
      e93a72:	e8 17 48 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93a77:	48 8d bb a8 01 00 00 	lea    rdi,[rbx+0x1a8]
      e93a7e:	e8 0b 48 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93a83:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e93a88:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e93a8c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e93a8f:	48 8d 35 77 fa 53 ff 	lea    rsi,[rip+0xffffffffff53fa77]        # 3d350d <_ZTSN5boost17bad_function_callE@@Base+0x853>
      e93a96:	48 8d 0d 83 fa 53 ff 	lea    rcx,[rip+0xffffffffff53fa83]        # 3d3520 <_ZTSN5boost17bad_function_callE@@Base+0x866>
      e93a9d:	6a 0b                	push   0xb

### WRITE 0xe93da0: mov    DWORD PTR [rsp+0x58],r12d
      e93d4b:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
      e93d50:	74 4e                	je     e93da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b1b6>
      e93d52:	48 8d 35 e2 f4 53 ff 	lea    rsi,[rip+0xffffffffff53f4e2]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
      e93d59:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93d60:	00 
      e93d61:	e8 e9 7a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e93d66:	84 c0                	test   al,al
      e93d68:	74 06                	je     e93d70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b186>
      e93d6a:	6a 02                	push   0x2
      e93d6c:	41 5c                	pop    r12
      e93d6e:	eb 30                	jmp    e93da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b1b6>
      e93d70:	48 8d 35 bb f4 53 ff 	lea    rsi,[rip+0xffffffffff53f4bb]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
      e93d77:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93d7e:	00 
      e93d7f:	e8 cb 7a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e93d84:	84 c0                	test   al,al
      e93d86:	75 18                	jne    e93da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b1b6>
      e93d88:	48 8d 35 95 84 4a ff 	lea    rsi,[rip+0xffffffffff4a8495]        # 33c224 <_ZTSSt12bad_any_cast@@Base-0x53fa4>
      e93d8f:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93d96:	00 
      e93d97:	e8 b3 7a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e93d9c:	44 0f b6 e0          	movzx  r12d,al
      e93da0:	44 89 64 24 58       	mov    DWORD PTR [rsp+0x58],r12d
      e93da5:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93dac:	00 
      e93dad:	e8 7e 2f c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e93db2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e93db7:	48 8b 00             	mov    rax,QWORD PTR [rax]
      e93dba:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e93dbf:	bf 60 01 00 00       	mov    edi,0x160
      e93dc4:	e8 37 a1 95 00       	call   17edf00 <_Znwm@plt>
      e93dc9:	48 8b 94 24 80 01 00 	mov    rdx,QWORD PTR [rsp+0x180]
      e93dd0:	00 
      e93dd1:	49 89 d4             	mov    r12,rdx
      e93dd4:	49 83 c4 18          	add    r12,0x18
      e93dd8:	48 8b b4 24 70 01 00 	mov    rsi,QWORD PTR [rsp+0x170]
      e93ddf:	00 
      e93de0:	49 89 f6             	mov    r14,rsi
      e93de3:	49 83 c6 18          	add    r14,0x18
      e93de7:	66 0f ef c0          	pxor   xmm0,xmm0
      e93deb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93df0:	48 8d 0d e9 dc 99 00 	lea    rcx,[rip+0x99dce9]        # 1831ae0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a78>
      e93df7:	48 89 08             	mov    QWORD PTR [rax],rcx
      e93dfa:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      e93e01:	00 
      e93e02:	48 83 c0 20          	add    rax,0x20
      e93e06:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      e93e0b:	48 8d 05 06 dd 99 00 	lea    rax,[rip+0x99dd06]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
      e93e12:	45 84 ff             	test   r15b,r15b
      e93e15:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
      e93e1a:	74 27                	je     e93e43 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b259>
      e93e1c:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e93e23:	00 
      e93e24:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e93e29:	48 89 84 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],rax
      e93e30:	00 
      e93e31:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      e93e38:	00 
      e93e39:	48 89 84 24 40 0a 00 	mov    QWORD PTR [rsp+0xa40],rax
      e93e40:	00 
      e93e41:	eb 2f                	jmp    e93e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b288>

### WRITE 0xe93ee2: mov    BYTE PTR [rbp+0x58],al
      e93e85:	00 
      e93e86:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
      e93e8a:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e93e8e:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      e93e93:	48 8b 9c 24 78 01 00 	mov    rbx,QWORD PTR [rsp+0x178]
      e93e9a:	00 
      e93e9b:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e93ea0:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      e93ea5:	48 8d 05 04 fe 9a 00 	lea    rax,[rip+0x9afe04]        # 1843cb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x398>
      e93eac:	48 8b ac 24 90 00 00 	mov    rbp,QWORD PTR [rsp+0x90]
      e93eb3:	00 
      e93eb4:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      e93eb8:	69 c1 60 ea 00 00    	imul   eax,ecx,0xea60
      e93ebe:	48 98                	cdqe
      e93ec0:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
      e93ec4:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
      e93ec8:	48 89 45 38          	mov    QWORD PTR [rbp+0x38],rax
      e93ecc:	41 69 c5 60 ea 00 00 	imul   eax,r13d,0xea60
      e93ed3:	66 0f 7f 45 40       	movdqa XMMWORD PTR [rbp+0x40],xmm0
      e93ed8:	89 45 50             	mov    DWORD PTR [rbp+0x50],eax
      e93edb:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0
      e93ee0:	31 c0                	xor    eax,eax
      e93ee2:	88 45 58             	mov    BYTE PTR [rbp+0x58],al
      e93ee5:	88 45 60             	mov    BYTE PTR [rbp+0x60],al
      e93ee8:	48 8d 7d 68          	lea    rdi,[rbp+0x68]
      e93eec:	49 89 d5             	mov    r13,rdx
      e93eef:	49 89 f7             	mov    r15,rsi
      e93ef2:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      e93ef7:	e8 fa 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93efc:	48 8d 7d 78          	lea    rdi,[rbp+0x78]
      e93f00:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      e93f05:	e8 ec 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93f0a:	48 8d bd 88 00 00 00 	lea    rdi,[rbp+0x88]
      e93f11:	48 89 bc 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rdi
      e93f18:	00 
      e93f19:	e8 d8 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93f1e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e93f23:	48 89 85 98 00 00 00 	mov    QWORD PTR [rbp+0x98],rax
      e93f2a:	48 8d bd a0 00 00 00 	lea    rdi,[rbp+0xa0]
      e93f31:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e93f36:	e8 bb 5a 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e93f3b:	48 8d bd b0 00 00 00 	lea    rdi,[rbp+0xb0]
      e93f42:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e93f47:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e93f4e:	00 
      e93f4f:	e8 a4 52 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      e93f54:	48 63 45 50          	movsxd rax,DWORD PTR [rbp+0x50]
      e93f58:	48 39 45 28          	cmp    QWORD PTR [rbp+0x28],rax
      e93f5c:	0f 9f c0             	setg   al
      e93f5f:	8a 4c 24 48          	mov    cl,BYTE PTR [rsp+0x48]
      e93f63:	20 c1                	and    cl,al
      e93f65:	88 8d e0 00 00 00    	mov    BYTE PTR [rbp+0xe0],cl
      e93f6b:	8a 84 24 90 01 00 00 	mov    al,BYTE PTR [rsp+0x190]
      e93f72:	88 85 e1 00 00 00    	mov    BYTE PTR [rbp+0xe1],al
      e93f78:	31 c0                	xor    eax,eax
      e93f7a:	88 85 08 01 00 00    	mov    BYTE PTR [rbp+0x108],al
      e93f80:	66 0f ef c0          	pxor   xmm0,xmm0
      e93f84:	f3 0f 7f 85 e8 00 00 	movdqu XMMWORD PTR [rbp+0xe8],xmm0
      e93f8b:	00 
      e93f8c:	f3 0f 7f 85 f1 00 00 	movdqu XMMWORD PTR [rbp+0xf1],xmm0
      e93f93:	00 

### WRITE 0xe9421f: mov    QWORD PTR [rsp+0x58],rbx
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
      e94213:	74 05                	je     e9421a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b630>
      e94215:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9421a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      e9421f:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e94224:	f0 48 ff 03          	lock inc QWORD PTR [rbx]
      e94228:	6a 30                	push   0x30
      e9422a:	5b                   	pop    rbx
      e9422b:	48 89 df             	mov    rdi,rbx
      e9422e:	e8 cd 9c 95 00       	call   17edf00 <_Znwm@plt>
      e94233:	49 89 c7             	mov    r15,rax
      e94236:	66 0f ef c0          	pxor   xmm0,xmm0
      e9423a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9423f:	48 8d 05 1a d9 99 00 	lea    rax,[rip+0x99d91a]        # 1831b60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3af8>
      e94246:	49 89 07             	mov    QWORD PTR [r15],rax
      e94249:	49 8d 47 20          	lea    rax,[r15+0x20]
      e9424d:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e94253:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e94257:	6a 48                	push   0x48
      e94259:	5f                   	pop    rdi
      e9425a:	e8 a1 9c 95 00       	call   17edf00 <_Znwm@plt>
      e9425f:	4c 89 f9             	mov    rcx,r15
      e94262:	48 83 c1 18          	add    rcx,0x18
      e94266:	66 0f ef c0          	pxor   xmm0,xmm0
      e9426a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9426f:	48 8d 15 22 d9 99 00 	lea    rdx,[rip+0x99d922]        # 1831b98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3b30>
      e94276:	48 89 10             	mov    QWORD PTR [rax],rdx
      e94279:	48 89 c2             	mov    rdx,rax
      e9427c:	48 83 c2 18          	add    rdx,0x18
      e94280:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e94285:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
      e9428a:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
      e9428f:	48 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [rsp+0x90]
      e94296:	00 
      e94297:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      e9429c:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
      e942a3:	00 
      e942a4:	0f 29 84 24 30 03 00 	movaps XMMWORD PTR [rsp+0x330],xmm0
      e942ab:	00 
      e942ac:	48 89 ac 24 40 03 00 	mov    QWORD PTR [rsp+0x340],rbp
      e942b3:	00 
      e942b4:	4c 89 a4 24 48 03 00 	mov    QWORD PTR [rsp+0x348],r12
      e942bb:	00 

### WRITE 0xe94ea2: and    QWORD PTR [r12+0x58],0x0
      e94e3e:	41 0f 44 ec          	cmove  ebp,r12d
      e94e42:	bf 50 01 00 00       	mov    edi,0x150
      e94e47:	e8 b4 90 95 00       	call   17edf00 <_Znwm@plt>
      e94e4c:	49 89 c4             	mov    r12,rax
      e94e4f:	66 0f ef c0          	pxor   xmm0,xmm0
      e94e53:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94e58:	48 8d 05 b9 f9 9a 00 	lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e5f:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
      e94e6a:	00 
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94e8e:	00 f0 3f 
      e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      e94e96:	31 c0                	xor    eax,eax
      e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
      e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e94ebf:	00 
      e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      e94ec5:	4c 89 ee             	mov    rsi,r13
      e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e94ed4:	00 00 
      e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
      e94edd:	00 
      e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
      e94ee5:	00 
      e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
      e94eed:	00 
      e94eee:	48 89 df             	mov    rdi,rbx
      e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
      e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e94f00:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e94f07:	00 
      e94f08:	49 8d 84 24 b0 00 00 	lea    rax,[r12+0xb0]
      e94f0f:	00 
      e94f10:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e94f17:	00 
      e94f18:	49 8d 84 24 b8 00 00 	lea    rax,[r12+0xb8]
      e94f1f:	00 
      e94f20:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      e94f27:	00 
      e94f28:	66 0f ef c0          	pxor   xmm0,xmm0
      e94f2c:	f3 41 0f 7f 84 24 18 	movdqu XMMWORD PTR [r12+0x118],xmm0
      e94f33:	01 00 00 
      e94f36:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
      e94f3d:	00 
      e94f3e:	49 89 84 24 28 01 00 	mov    QWORD PTR [r12+0x128],rax
      e94f45:	00 
      e94f46:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]

### WRITE 0xe956cd: movdqu XMMWORD PTR [r12+0x58],xmm0
      e95668:	48 8d 05 99 d4 99 00 	lea    rax,[rip+0x99d499]        # 1832b08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4aa0>
      e9566f:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e95674:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e9567b:	4d 89 74 24 30       	mov    QWORD PTR [r12+0x30],r14
      e95680:	48 8d 35 3d b7 4d ff 	lea    rsi,[rip+0xffffffffff4db73d]        # 370dc4 <_ZTSSt12bad_any_cast@@Base-0x1f404>
      e95687:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9568e:	00 
      e9568f:	e8 ea 43 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e95694:	4d 8d 7c 24 18       	lea    r15,[r12+0x18]
      e95699:	49 8d 5c 24 38       	lea    rbx,[r12+0x38]
      e9569e:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e956a5:	00 
      e956a6:	48 89 df             	mov    rdi,rbx
      e956a9:	4c 89 f6             	mov    rsi,r14
      e956ac:	4c 89 ea             	mov    rdx,r13
      e956af:	e8 66 c0 92 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
      e956b4:	4c 89 ef             	mov    rdi,r13
      e956b7:	e8 d4 87 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e956bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e956c1:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e956c8:	00 
      e956c9:	66 0f ef c0          	pxor   xmm0,xmm0
      e956cd:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
      e956d4:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e956db:	bd 00 00 80 3f       	mov    ebp,0x3f800000
      e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
      e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e956ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e956ef:	e8 02 43 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e956fb:	00 
      e956fc:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
      e95703:	00 
      e95704:	e8 85 2b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95709:	4d 89 e6             	mov    r14,r12
      e9570c:	49 81 c6 d8 00 00 00 	add    r14,0xd8
      e95713:	66 0f ef c0          	pxor   xmm0,xmm0
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e9571e:	00 00 00 
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
      e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>
      e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e95768:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e9576f:	00 
      e95770:	b9 60 ea 00 00       	mov    ecx,0xea60
      e95775:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e9577a:	48 89 df             	mov    rdi,rbx
      e9577d:	4c 89 fb             	mov    rbx,r15
      e95780:	4c 89 ea             	mov    rdx,r13

### WRITE 0xe95775: mov    QWORD PTR [rsp+0x58],rbx
      e9570c:	49 81 c6 d8 00 00 00 	add    r14,0xd8
      e95713:	66 0f ef c0          	pxor   xmm0,xmm0
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e9571e:	00 00 00 
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
      e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>
      e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e95768:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e9576f:	00 
      e95770:	b9 60 ea 00 00       	mov    ecx,0xea60
      e95775:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e9577a:	48 89 df             	mov    rdi,rbx
      e9577d:	4c 89 fb             	mov    rbx,r15
      e95780:	4c 89 ea             	mov    rdx,r13
      e95783:	e8 fc c0 92 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
      e95788:	4c 89 ef             	mov    rdi,r13
      e9578b:	e8 0e 1b c1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      e95790:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
      e95795:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
      e9579c:	00 
      e9579d:	4d 89 38             	mov    QWORD PTR [r8],r15
      e957a0:	48 8d 35 ea 78 c0 ff 	lea    rsi,[rip+0xffffffffffc078ea]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e957a7:	48 8d 0d 8c d5 02 00 	lea    rcx,[rip+0x2d58c]        # ec2d3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a150>
      e957ae:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e957b5:	00 
      e957b6:	6a 08                	push   0x8
      e957b8:	41 59                	pop    r9
      e957ba:	48 89 ef             	mov    rdi,rbp
      e957bd:	31 d2                	xor    edx,edx
      e957bf:	e8 d0 4f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e957c4:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e957c8:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e957cf:	00 
      e957d0:	4c 89 ee             	mov    rsi,r13
      e957d3:	48 89 ea             	mov    rdx,rbp
      e957d6:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e957d9:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e957e0:	00 
      e957e1:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e957e6:	4c 89 f6             	mov    rsi,r14
      e957e9:	e8 04 44 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e957ee:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      e957f2:	e8 8f 8c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e957f7:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e957fe:	00 
      e957ff:	4c 89 ef             	mov    rdi,r13
      e95802:	e8 e1 4f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e95807:	31 ff                	xor    edi,edi
      e95809:	e8 78 8c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### WRITE 0xe958e6: mov    QWORD PTR [rsp+0x58],rbp
      e9588b:	e8 f6 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95890:	31 ff                	xor    edi,edi
      e95892:	e8 85 8b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95897:	31 ff                	xor    edi,edi
      e95899:	e8 e8 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9589e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e958a5:	00 
      e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e958b9:	00 
      e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      e958c1:	00 
      e958c2:	e8 f7 63 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e958c7:	6a 50                	push   0x50
      e958c9:	5f                   	pop    rdi
      e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
      e958cf:	48 89 c5             	mov    rbp,rax
      e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
      e95963:	00 
      e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95969:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
      e95970:	00 00 
      e95972:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
      e95979:	00 00 
      e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e95980:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e95984:	48 8b 83 78 05 00 00 	mov    rax,QWORD PTR [rbx+0x578]
      e9598b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### WRITE 0xe9714b: movups XMMWORD PTR [r14+0x58],xmm0
      e970f4:	49 89 4e 30          	mov    QWORD PTR [r14+0x30],rcx
      e970f8:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e970fd:	48 8b 84 24 38 03 00 	mov    rax,QWORD PTR [rsp+0x338]
      e97104:	00 
      e97105:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
      e9710c:	00 
      e9710d:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
      e97112:	48 85 c0             	test   rax,rax
      e97115:	74 05                	je     e9711c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e532>
      e97117:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9711c:	48 8b 84 24 48 03 00 	mov    rax,QWORD PTR [rsp+0x348]
      e97123:	00 
      e97124:	0f 28 84 24 40 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x340]
      e9712b:	00 
      e9712c:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      e97131:	48 85 c0             	test   rax,rax
      e97134:	74 05                	je     e9713b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e551>
      e97136:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9713b:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e97142:	00 
      e97143:	0f 28 84 24 50 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x350]
      e9714a:	00 
      e9714b:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      e97150:	48 85 c0             	test   rax,rax
      e97153:	74 05                	je     e9715a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e570>
      e97155:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9715a:	48 8b 84 24 68 03 00 	mov    rax,QWORD PTR [rsp+0x368]
      e97161:	00 
      e97162:	0f 28 84 24 60 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x360]
      e97169:	00 
      e9716a:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      e9716f:	48 85 c0             	test   rax,rax
      e97172:	74 05                	je     e97179 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e58f>
      e97174:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e97179:	48 8b 84 24 78 03 00 	mov    rax,QWORD PTR [rsp+0x378]
      e97180:	00 
      e97181:	66 0f 6f 84 24 70 03 	movdqa xmm0,XMMWORD PTR [rsp+0x370]
      e97188:	00 00 
      e9718a:	f3 41 0f 7f 46 78    	movdqu XMMWORD PTR [r14+0x78],xmm0
      e97190:	48 85 c0             	test   rax,rax
      e97193:	74 05                	je     e9719a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e5b0>
      e97195:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9719a:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]
      e971a1:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e971a8:	00 
      e971a9:	4c 89 ff             	mov    rdi,r15
      e971ac:	e8 df 30 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e971b1:	49 8d be c0 00 00 00 	lea    rdi,[r14+0xc0]
      e971b8:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
      e971bf:	00 
      e971c0:	e8 7b 6d 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e971c5:	4d 89 f7             	mov    r15,r14
      e971c8:	49 83 c7 20          	add    r15,0x20
      e971cc:	49 83 a6 d8 00 00 00 	and    QWORD PTR [r14+0xd8],0x0
      e971d3:	00 
      e971d4:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e971db:	00 
      e971dc:	e8 89 2d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e971e1:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e971e6:	e8 9b 72 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e971eb:	31 ff                	xor    edi,edi

