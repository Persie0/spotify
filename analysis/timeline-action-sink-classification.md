# TimelineConductor common action sink classification

0x13825fa is shared by play/pause/stop/seek/resume/video-subscribe-after-play/smart-skip-embedded-podcast-ad and forwards to 0x1382113.
0x1382113 finally calls 0x1624e22 on its first argument after building a structured action/state payload.

## final sink helper: 0x1624e22 FDE=(23219746, 23220275)
     1624e22:	41 57                	push   r15
     1624e24:	41 56                	push   r14
     1624e26:	41 54                	push   r12
     1624e28:	53                   	push   rbx
     1624e29:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
     1624e30:	48 89 cb             	mov    rbx,rcx
     1624e33:	49 89 d6             	mov    r14,rdx
     1624e36:	49 89 f4             	mov    r12,rsi
     1624e39:	49 89 ff             	mov    r15,rdi
     1624e3c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1624e43:	00 00 
     1624e45:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     1624e4c:	00 
     1624e4d:	0f 57 c0             	xorps  xmm0,xmm0
     1624e50:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
     1624e57:	00 
     1624e58:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     1624e5b:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1624e60:	4c 89 e7             	mov    rdi,r12
     1624e63:	e8 38 ae 15 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
     1624e68:	84 c0                	test   al,al
     1624e6a:	0f 84 15 01 00 00    	je     1624f85 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x200f3>
     1624e70:	49 83 7f 30 00       	cmp    QWORD PTR [r15+0x30],0x0
     1624e75:	0f 84 90 00 00 00    	je     1624f0b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20079>
     1624e7b:	0f 57 c0             	xorps  xmm0,xmm0
     1624e7e:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     1624e85:	00 
     1624e86:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1624e8d:	00 00 
     1624e8f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1624e94:	e8 33 e5 12 00       	call   17533cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107538>
     1624e99:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1624e9e:	c6 47 04 01          	mov    BYTE PTR [rdi+0x4],0x1
     1624ea2:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     1624ea9:	00 
     1624eaa:	4c 89 e6             	mov    rsi,r12
     1624ead:	e8 a8 e5 12 00       	call   175345a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1075c6>
     1624eb2:	4c 89 e7             	mov    rdi,r12
     1624eb5:	e8 20 9d 12 00       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
     1624eba:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     1624ebe:	0f b7 10             	movzx  edx,WORD PTR [rax]
     1624ec1:	48 89 d6             	mov    rsi,rdx
     1624ec4:	48 f7 d6             	not    rsi
     1624ec7:	48 01 c6             	add    rsi,rax
     1624eca:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1624ecf:	e8 46 7b 47 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     1624ed4:	49 8b 7f 30          	mov    rdi,QWORD PTR [r15+0x30]
     1624ed8:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     1624edd:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     1624ee4:	00 
     1624ee5:	e8 a6 8e 49 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1624eea:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1624eef:	e8 9c 8f 1c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1624ef4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1624ef9:	e8 84 88 63 ff       	call   c5d782 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aa722>
     1624efe:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1624f05:	00 
     1624f06:	e8 85 8f 1c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1624f0b:	4c 89 e7             	mov    rdi,r12
     1624f0e:	e8 c7 9c 12 00       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
     1624f13:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     1624f17:	0f b7 10             	movzx  edx,WORD PTR [rax]
     1624f1a:	48 89 d6             	mov    rsi,rdx
     1624f1d:	48 f7 d6             	not    rsi
     1624f20:	48 01 c6             	add    rsi,rax
     1624f23:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1624f28:	e8 ed 7a 47 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     1624f2d:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     1624f34:	00 
     1624f35:	48 89 e2             	mov    rdx,rsp
     1624f38:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     1624f3c:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
     1624f43:	00 
     1624f44:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     1624f47:	0f 57 c0             	xorps  xmm0,xmm0
     1624f4a:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
     1624f51:	00 
     1624f52:	48 83 a4 24 d0 00 00 	and    QWORD PTR [rsp+0xd0],0x0
     1624f59:	00 00 
     1624f5b:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1624f5e:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     1624f63:	4c 89 ff             	mov    rdi,r15
     1624f66:	4c 89 f1             	mov    rcx,r14
     1624f69:	49 89 d8             	mov    r8,rbx
     1624f6c:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1624f6f:	89 c3                	mov    ebx,eax
     1624f71:	48 89 e7             	mov    rdi,rsp
     1624f74:	e8 17 8f 1c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1624f79:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1624f7e:	e8 0d 8f 1c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1624f83:	eb 03                	jmp    1624f88 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x200f6>
     1624f85:	6a 01                	push   0x1
     1624f87:	5b                   	pop    rbx
     1624f88:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1624f8f:	00 
     1624f90:	e8 fb 8e 1c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1624f95:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1624f9c:	00 00 
     1624f9e:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
     1624fa5:	00 
     1624fa6:	0f 85 82 00 00 00    	jne    162502e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2019c>
     1624fac:	89 d8                	mov    eax,ebx
     1624fae:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
     1624fb5:	5b                   	pop    rbx
     1624fb6:	41 5c                	pop    r12
     1624fb8:	41 5e                	pop    r14
     1624fba:	41 5f                	pop    r15
     1624fbc:	c3                   	ret
     1624fbd:	48 89 c3             	mov    rbx,rax
     1624fc0:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1624fc5:	e8 c6 8e 1c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1624fca:	eb 1c                	jmp    1624fe8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20156>
     1624fcc:	eb 17                	jmp    1624fe5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20153>
     1624fce:	48 89 c3             	mov    rbx,rax
     1624fd1:	eb 1f                	jmp    1624ff2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20160>
     1624fd3:	48 89 c3             	mov    rbx,rax
     1624fd6:	48 89 e7             	mov    rdi,rsp
     1624fd9:	e8 b2 8e 1c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1624fde:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1624fe3:	eb 15                	jmp    1624ffa <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20168>
     1624fe5:	48 89 c3             	mov    rbx,rax
     1624fe8:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1624fed:	e8 90 87 63 ff       	call   c5d782 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aa722>
     1624ff2:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1624ff9:	00 
     1624ffa:	e8 91 8e 1c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1624fff:	eb 05                	jmp    1625006 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20174>
     1625001:	eb 00                	jmp    1625003 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20171>
     1625003:	48 89 c3             	mov    rbx,rax
     1625006:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     162500d:	00 
     162500e:	e8 7d 8e 1c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1625013:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162501a:	00 00 
     162501c:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
     1625023:	00 
     1625024:	75 08                	jne    162502e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2019c>
     1625026:	48 89 df             	mov    rdi,rbx
     1625029:	e8 a2 ac 44 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     162502e:	e8 7d aa 1c 00       	call   17efab0 <__stack_chk_fail@plt>

## field serializer A: 0x176575c FDE=(24532828, 24532882)
     176575c:	53                   	push   rbx
     176575d:	48 89 fb             	mov    rbx,rdi
     1765760:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1765763:	40 f6 c7 03          	test   dil,0x3
     1765767:	74 0a                	je     1765773 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198df>
     1765769:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     176576d:	5b                   	pop    rbx
     176576e:	e9 dd 8f 08 00       	jmp    17ee750 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKcm@plt>
     1765773:	48 85 c9             	test   rcx,rcx
     1765776:	74 0a                	je     1765782 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198ee>
     1765778:	48 89 cf             	mov    rdi,rcx
     176577b:	e8 69 ff ff ff       	call   17656e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119855>
     1765780:	eb 0b                	jmp    176578d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198f9>
     1765782:	48 89 f7             	mov    rdi,rsi
     1765785:	48 89 d6             	mov    rsi,rdx
     1765788:	e8 8a ff ff ff       	call   1765717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119883>
     176578d:	48 89 03             	mov    QWORD PTR [rbx],rax
     1765790:	5b                   	pop    rbx
     1765791:	c3                   	ret

## field serializer B: 0x1765792 FDE=(24532882, 24532965)
     1765792:	41 56                	push   r14
     1765794:	53                   	push   rbx
     1765795:	50                   	push   rax
     1765796:	48 89 fb             	mov    rbx,rdi
     1765799:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     176579c:	40 f6 c7 03          	test   dil,0x3
     17657a0:	74 10                	je     17657b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11991e>
     17657a2:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     17657a6:	48 83 c4 08          	add    rsp,0x8
     17657aa:	5b                   	pop    rbx
     17657ab:	41 5e                	pop    r14
     17657ad:	e9 ce 88 08 00       	jmp    17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     17657b2:	49 89 d6             	mov    r14,rdx
     17657b5:	48 89 f7             	mov    rdi,rsi
     17657b8:	e8 79 60 31 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     17657bd:	4d 85 f6             	test   r14,r14
     17657c0:	74 0d                	je     17657cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11993b>
     17657c2:	4c 89 f7             	mov    rdi,r14
     17657c5:	48 89 c6             	mov    rsi,rax
     17657c8:	e8 1c ff ff ff       	call   17656e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119855>
     17657cd:	eb 0b                	jmp    17657da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119946>
     17657cf:	48 89 c7             	mov    rdi,rax
     17657d2:	48 89 d6             	mov    rsi,rdx
     17657d5:	e8 3d ff ff ff       	call   1765717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119883>
     17657da:	48 89 03             	mov    QWORD PTR [rbx],rax
     17657dd:	48 83 c4 08          	add    rsp,0x8
     17657e1:	5b                   	pop    rbx
     17657e2:	41 5e                	pop    r14
     17657e4:	c3                   	ret

## field serializer C: 0x17657e6 FDE=(24532966, 24533071)
     17657e6:	41 56                	push   r14
     17657e8:	53                   	push   rbx
     17657e9:	50                   	push   rax
     17657ea:	48 89 f3             	mov    rbx,rsi
     17657ed:	49 89 fe             	mov    r14,rdi
     17657f0:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     17657f3:	40 f6 c7 03          	test   dil,0x3
     17657f7:	74 13                	je     176580c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119978>
     17657f9:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     17657fd:	48 89 de             	mov    rsi,rbx
     1765800:	48 83 c4 08          	add    rsp,0x8
     1765804:	5b                   	pop    rbx
     1765805:	41 5e                	pop    r14
     1765807:	e9 22 62 31 ff       	jmp    a7ba2e <JNI_OnUnload@@Base+0x32fb>
     176580c:	48 85 d2             	test   rdx,rdx
     176580f:	74 0c                	je     176581d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119989>
     1765811:	48 89 d7             	mov    rdi,rdx
     1765814:	e8 e5 4b 02 00       	call   178a3fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e56a>
     1765819:	6a 03                	push   0x3
     176581b:	eb 0a                	jmp    1765827 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119993>
     176581d:	6a 18                	push   0x18
     176581f:	5f                   	pop    rdi
     1765820:	e8 db 86 08 00       	call   17edf00 <_Znwm@plt>
     1765825:	6a 02                	push   0x2
     1765827:	59                   	pop    rcx
     1765828:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
     176582c:	48 89 50 10          	mov    QWORD PTR [rax+0x10],rdx
     1765830:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     1765833:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1765836:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     176583b:	0f 57 c0             	xorps  xmm0,xmm0
     176583e:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     1765841:	48 09 c1             	or     rcx,rax
     1765844:	49 89 0e             	mov    QWORD PTR [r14],rcx
     1765847:	48 83 c4 08          	add    rsp,0x8
     176584b:	5b                   	pop    rbx
     176584c:	41 5e                	pop    r14
     176584e:	c3                   	ret

## payload cleanup: 0x1652f72 FDE=(23408498, 23408620)
     1652f72:	53                   	push   rbx
     1652f73:	48 89 fb             	mov    rbx,rdi
     1652f76:	48 83 c7 08          	add    rdi,0x8
     1652f7a:	e8 89 7a 45 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     1652f7f:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     1652f83:	e8 20 29 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652f88:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     1652f8c:	e8 17 29 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652f91:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     1652f95:	e8 0e 29 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652f9a:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     1652f9e:	e8 05 29 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652fa3:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     1652fa7:	e8 fc 28 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652fac:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1652fb0:	e8 f3 28 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652fb5:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     1652fb9:	e8 ea 28 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652fbe:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
     1652fc2:	e8 e1 28 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652fc7:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     1652fcb:	e8 d8 28 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652fd0:	48 8b 7b 60          	mov    rdi,QWORD PTR [rbx+0x60]
     1652fd4:	e8 cf 28 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652fd9:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
     1652fdd:	e8 c6 28 11 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1652fe2:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
     1652fe6:	5b                   	pop    rbx
     1652fe7:	e9 bc 28 11 00       	jmp    17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>

## Direct callers of final sink 0x1624e22
### caller 0xab6da0 FDE=(11234298, 11234976)
      ab6d5e:	4c 89 ff             	mov    rdi,r15
      ab6d61:	e8 2a 71 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab6d66:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      ab6d6b:	48 83 66 08 00       	and    QWORD PTR [rsi+0x8],0x0
      ab6d70:	48 8d 05 29 d3 dd 00 	lea    rax,[rip+0xddd329]        # 18940a0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xfe0>
      ab6d77:	48 89 06             	mov    QWORD PTR [rsi],rax
      ab6d7a:	48 c7 46 10 01 00 00 	mov    QWORD PTR [rsi+0x10],0x1
      ab6d81:	00 
      ab6d82:	4c 89 76 18          	mov    QWORD PTR [rsi+0x18],r14
      ab6d86:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      ab6d8a:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      ab6d8f:	40 88 2a             	mov    BYTE PTR [rdx],bpl
      ab6d92:	40 88 6a 18          	mov    BYTE PTR [rdx+0x18],bpl
      ab6d96:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      ab6d9b:	48 8d 4c 24 70       	lea    rcx,[rsp+0x70]
      ab6da0:	e8 7d e0 b6 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      ab6da5:	89 c5                	mov    ebp,eax
      ab6da7:	48 8d 5c 24 58       	lea    rbx,[rsp+0x58]
      ab6dac:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      ab6db1:	e8 b4 31 fc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ab6db6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ab6dbb:	e8 70 ff fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      ab6dc0:	85 ed                	test   ebp,ebp
      ab6dc2:	74 1b                	je     ab6ddf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3d7f>
      ab6dc4:	48 8d 35 52 55 8b ff 	lea    rsi,[rip+0xffffffffff8b5552]        # 36c31d <_ZTSSt12bad_any_cast@@Base-0x23eab>
      ab6dcb:	48 8d 0d 06 b9 8c ff 	lea    rcx,[rip+0xffffffffff8cb906]        # 3826d8 <_ZTSSt12bad_any_cast@@Base-0xdaf0>
      ab6dd2:	6a 03                	push   0x3
      ab6dd4:	5f                   	pop    rdi
      ab6dd5:	6a 55                	push   0x55
      ab6dd7:	5a                   	pop    rdx
      ab6dd8:	31 c0                	xor    eax,eax
      ab6dda:	e8 f3 fa d1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      ab6ddf:	48 89 df             	mov    rdi,rbx
      ab6de2:	e8 21 3c ff ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
      ab6de7:	eb 7b                	jmp    ab6e64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3e04>
      ab6de9:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      ab6dee:	4c 89 fe             	mov    rsi,r15
      ab6df1:	e8 4a 71 d3 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ab6df6:	40 8a 6c 24 70       	mov    bpl,BYTE PTR [rsp+0x70]
      ab6dfb:	48 8b 9c 24 80 00 00 	mov    rbx,QWORD PTR [rsp+0x80]

### caller 0xb54d84 FDE=(11880854, 11882234)
      b54d4a:	48 8b 57 e0          	mov    rdx,QWORD PTR [rdi-0x20]
      b54d4e:	f6 c2 01             	test   dl,0x1
      b54d51:	0f 85 f6 00 00 00    	jne    b54e4d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1ded>
      b54d57:	4c 89 f6             	mov    rsi,r14
      b54d5a:	e8 33 0a c1 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      b54d5f:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
      b54d63:	31 c0                	xor    eax,eax
      b54d65:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
      b54d6a:	88 02                	mov    BYTE PTR [rdx],al
      b54d6c:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      b54d6f:	48 8d 8c 24 c0 00 00 	lea    rcx,[rsp+0xc0]
      b54d76:	00 
      b54d77:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      b54d7c:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      b54d83:	00 
      b54d84:	e8 99 00 ad 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      b54d89:	89 c3                	mov    ebx,eax
      b54d8b:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      b54d92:	00 
      b54d93:	e8 d2 51 f2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b54d98:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      b54d9d:	e8 8e 1f f5 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      b54da2:	85 db                	test   ebx,ebx
      b54da4:	74 1d                	je     b54dc3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1d63>
      b54da6:	48 8d 35 cf d1 8f ff 	lea    rsi,[rip+0xffffffffff8fd1cf]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b54dad:	48 8d 0d 67 5a 7d ff 	lea    rcx,[rip+0xffffffffff7d5a67]        # 32a81b <_ZTSSt12bad_any_cast@@Base-0x659ad>
      b54db4:	6a 04                	push   0x4
      b54db6:	5f                   	pop    rdi
      b54db7:	ba 84 03 00 00       	mov    edx,0x384
      b54dbc:	31 c0                	xor    eax,eax
      b54dbe:	e8 0f 1b c8 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      b54dc3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b54dca:	00 
      b54dcb:	e8 50 bc f6 ff       	call   ac0a20 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9c0>
      b54dd0:	48 89 e7             	mov    rdi,rsp
      b54dd3:	e8 b8 90 c9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b54dd8:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      b54ddd:	e8 ae 90 c9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b54de2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b54de7:	e8 a4 90 c9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### caller 0xb5c4bf FDE=(11906558, 11913524)
      b5c485:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
      b5c48c:	00 
      b5c48d:	e8 fe 19 c9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b5c492:	e9 b9 01 00 00       	jmp    b5c650 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa95f0>
      b5c497:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      b5c49b:	31 c0                	xor    eax,eax
      b5c49d:	48 8d 94 24 f0 02 00 	lea    rdx,[rsp+0x2f0]
      b5c4a4:	00 
      b5c4a5:	88 02                	mov    BYTE PTR [rdx],al
      b5c4a7:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      b5c4aa:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
      b5c4b1:	00 
      b5c4b2:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      b5c4b7:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
      b5c4be:	00 
      b5c4bf:	e8 5e 89 ac 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      b5c4c4:	89 c3                	mov    ebx,eax
      b5c4c6:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
      b5c4cd:	00 
      b5c4ce:	e8 97 da f1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b5c4d3:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      b5c4da:	00 
      b5c4db:	e8 50 a8 f4 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      b5c4e0:	85 db                	test   ebx,ebx
      b5c4e2:	0f 85 68 01 00 00    	jne    b5c650 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa95f0>
      b5c4e8:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      b5c4ed:	48 8b 28             	mov    rbp,QWORD PTR [rax]
      b5c4f0:	48 8d 5d 18          	lea    rbx,[rbp+0x18]
      b5c4f4:	48 8d 84 24 90 00 00 	lea    rax,[rsp+0x90]
      b5c4fb:	00 
      b5c4fc:	48 39 c3             	cmp    rbx,rax
      b5c4ff:	0f 84 33 01 00 00    	je     b5c638 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa95d8>
      b5c505:	f3 0f 10 84 24 b0 00 	movss  xmm0,DWORD PTR [rsp+0xb0]
      b5c50c:	00 00 
      b5c50e:	f3 0f 11 45 38       	movss  DWORD PTR [rbp+0x38],xmm0
      b5c513:	4c 8b bc 24 a0 00 00 	mov    r15,QWORD PTR [rsp+0xa0]
      b5c51a:	00 
      b5c51b:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
      b5c51f:	48 85 c0             	test   rax,rax
      b5c522:	74 71                	je     b5c595 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa9535>

### caller 0xb64302 FDE=(11944448, 11944974)
      b642bf:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      b642c4:	c6 86 a8 00 00 00 01 	mov    BYTE PTR [rsi+0xa8],0x1
      b642cb:	c7 86 a4 00 00 00 07 	mov    DWORD PTR [rsi+0xa4],0x7
      b642d2:	00 00 00 
      b642d5:	48 63 43 48          	movsxd rax,DWORD PTR [rbx+0x48]
      b642d9:	48 89 86 88 00 00 00 	mov    QWORD PTR [rsi+0x88],rax
      b642e0:	81 4e 10 10 18 00 00 	or     DWORD PTR [rsi+0x10],0x1810
      b642e7:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      b642eb:	31 c0                	xor    eax,eax
      b642ed:	48 89 e2             	mov    rdx,rsp
      b642f0:	88 02                	mov    BYTE PTR [rdx],al
      b642f2:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      b642f5:	48 8d 8c 24 e0 00 00 	lea    rcx,[rsp+0xe0]
      b642fc:	00 
      b642fd:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      b64302:	e8 1b 0b ac 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      b64307:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      b6430e:	00 
      b6430f:	e8 56 5c f1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b64314:	48 89 e7             	mov    rdi,rsp
      b64317:	e8 14 2a f4 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      b6431c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      b64321:	e8 f0 e4 ae 00       	call   1652816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6982>
      b64326:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
      b6432c:	41 83 fd 01          	cmp    r13d,0x1
      b64330:	48 8d 05 31 72 d0 00 	lea    rax,[rip+0xd07231]        # 186b568 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x27c50>
      b64337:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b6433c:	0f 57 c0             	xorps  xmm0,xmm0
      b6433f:	0f 11 44 24 30       	movups XMMWORD PTR [rsp+0x30],xmm0
      b64344:	0f 94 44 24 40       	sete   BYTE PTR [rsp+0x40]
      b64349:	c7 44 24 30 03 00 00 	mov    DWORD PTR [rsp+0x30],0x3
      b64350:	00 
      b64351:	31 ff                	xor    edi,edi
      b64353:	e8 ca 01 00 00       	call   b64522 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb14c2>
      b64358:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
      b6435d:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      b64361:	44 89 70 18          	mov    DWORD PTR [rax+0x18],r14d
      b64365:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
      b64369:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      b6436c:	4c 89 fe             	mov    rsi,r15

### caller 0xb6e1a0 FDE=(11985058, 11985493)
      b6e15d:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      b6e162:	c6 86 a8 00 00 00 01 	mov    BYTE PTR [rsi+0xa8],0x1
      b6e169:	c7 86 a4 00 00 00 08 	mov    DWORD PTR [rsi+0xa4],0x8
      b6e170:	00 00 00 
      b6e173:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
      b6e177:	48 89 86 88 00 00 00 	mov    QWORD PTR [rsi+0x88],rax
      b6e17e:	81 4e 10 10 18 00 00 	or     DWORD PTR [rsi+0x10],0x1810
      b6e185:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      b6e189:	31 c0                	xor    eax,eax
      b6e18b:	48 89 e2             	mov    rdx,rsp
      b6e18e:	88 02                	mov    BYTE PTR [rdx],al
      b6e190:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      b6e193:	48 8d 8c 24 e0 00 00 	lea    rcx,[rsp+0xe0]
      b6e19a:	00 
      b6e19b:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      b6e1a0:	e8 7d 6c ab 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      b6e1a5:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      b6e1ac:	00 
      b6e1ad:	e8 b8 bd f0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b6e1b2:	48 89 e7             	mov    rdi,rsp
      b6e1b5:	e8 76 8b f3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      b6e1ba:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      b6e1bf:	e8 52 46 ae 00       	call   1652816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6982>
      b6e1c4:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
      b6e1c8:	4c 89 fe             	mov    rsi,r15
      b6e1cb:	48 89 da             	mov    rdx,rbx
      b6e1ce:	41 ff 56 28          	call   QWORD PTR [r14+0x28]
      b6e1d2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b6e1d9:	00 00 
      b6e1db:	48 3b 84 24 18 01 00 	cmp    rax,QWORD PTR [rsp+0x118]
      b6e1e2:	00 
      b6e1e3:	75 6b                	jne    b6e250 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbb1f0>
      b6e1e5:	48 81 c4 20 01 00 00 	add    rsp,0x120
      b6e1ec:	5b                   	pop    rbx
      b6e1ed:	41 5c                	pop    r12
      b6e1ef:	41 5d                	pop    r13
      b6e1f1:	41 5e                	pop    r14
      b6e1f3:	41 5f                	pop    r15
      b6e1f5:	c3                   	ret
      b6e1f6:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe

### caller 0xb7055b FDE=(11994396, 11994738)
      b70520:	53                   	push   rbx
      b70521:	48 83 ec 60          	sub    rsp,0x60
      b70525:	48 89 fb             	mov    rbx,rdi
      b70528:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b7052f:	00 00 
      b70531:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      b70536:	48 8b bf 70 01 00 00 	mov    rdi,QWORD PTR [rdi+0x170]
      b7053d:	4c 8d bb 48 04 00 00 	lea    r15,[rbx+0x448]
      b70544:	31 c0                	xor    eax,eax
      b70546:	48 89 e2             	mov    rdx,rsp
      b70549:	88 02                	mov    BYTE PTR [rdx],al
      b7054b:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      b7054e:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      b70553:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      b70558:	4c 89 fe             	mov    rsi,r15
      b7055b:	e8 c2 48 ab 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      b70560:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      b70565:	e8 00 9a f0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b7056a:	48 89 e7             	mov    rdi,rsp
      b7056d:	e8 be 67 f3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      b70572:	4c 8d b3 d0 00 00 00 	lea    r14,[rbx+0xd0]
      b70579:	4c 89 f7             	mov    rdi,r14
      b7057c:	e8 b7 13 c5 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
      b70581:	48 8d bb 78 05 00 00 	lea    rdi,[rbx+0x578]
      b70588:	e8 3d ff ff ff       	call   b704ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd46a>
      b7058d:	48 8d bb 30 05 00 00 	lea    rdi,[rbx+0x530]
      b70594:	e8 fb fe ff ff       	call   b70494 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd434>
      b70599:	48 8b bb 20 05 00 00 	mov    rdi,QWORD PTR [rbx+0x520]
      b705a0:	e8 e1 de f2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b705a5:	4c 89 ff             	mov    rdi,r15
      b705a8:	e8 69 22 ae 00       	call   1652816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6982>
      b705ad:	48 8d bb f8 03 00 00 	lea    rdi,[rbx+0x3f8]
      b705b4:	e8 6f b1 f0 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b705b9:	48 8d bb a0 03 00 00 	lea    rdi,[rbx+0x3a0]
      b705c0:	e8 a1 98 c6 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b705c5:	48 8d bb 48 03 00 00 	lea    rdi,[rbx+0x348]
      b705cc:	e8 95 98 c6 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b705d1:	48 8d bb 20 03 00 00 	lea    rdi,[rbx+0x320]
      b705d8:	e8 73 da c7 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
      b705dd:	48 8b bb 10 03 00 00 	mov    rdi,QWORD PTR [rbx+0x310]

### caller 0xb7ab34 FDE=(12036472, 12037088)
      b7aafa:	0f 85 8b 00 00 00    	jne    b7ab8b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc7b2b>
      b7ab00:	e8 8d ac be 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      b7ab05:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
      b7ab09:	8a 48 58             	mov    cl,BYTE PTR [rax+0x58]
      b7ab0c:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      b7ab11:	88 4e 56             	mov    BYTE PTR [rsi+0x56],cl
      b7ab14:	80 4e 11 08          	or     BYTE PTR [rsi+0x11],0x8
      b7ab18:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      b7ab1b:	31 c0                	xor    eax,eax
      b7ab1d:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      b7ab22:	88 02                	mov    BYTE PTR [rdx],al
      b7ab24:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      b7ab27:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
      b7ab2e:	00 
      b7ab2f:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      b7ab34:	e8 e9 a2 aa 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      b7ab39:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      b7ab40:	00 
      b7ab41:	e8 24 f4 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b7ab46:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      b7ab4b:	e8 e0 c1 f2 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      b7ab50:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      b7ab55:	e8 50 46 f4 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      b7ab5a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b7ab61:	00 00 
      b7ab63:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
      b7ab6a:	00 
      b7ab6b:	75 6e                	jne    b7abdb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc7b7b>
      b7ab6d:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
      b7ab74:	5b                   	pop    rbx
      b7ab75:	41 5c                	pop    r12
      b7ab77:	41 5d                	pop    r13
      b7ab79:	41 5e                	pop    r14
      b7ab7b:	41 5f                	pop    r15
      b7ab7d:	5d                   	pop    rbp
      b7ab7e:	c3                   	ret
      b7ab7f:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      b7ab83:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      b7ab86:	e9 11 ff ff ff       	jmp    b7aa9c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc7a3c>
      b7ab8b:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe

### caller 0xb7fd99 FDE=(12057354, 12058263)
      b7fd63:	75 98                	jne    b7fcfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xccc9d>
      b7fd65:	85 db                	test   ebx,ebx
      b7fd67:	75 0d                	jne    b7fd76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xccd16>
      b7fd69:	c6 84 24 c3 00 00 00 	mov    BYTE PTR [rsp+0xc3],0x1
      b7fd70:	01 
      b7fd71:	80 4c 24 31 04       	or     BYTE PTR [rsp+0x31],0x4
      b7fd76:	49 8b be 88 01 00 00 	mov    rdi,QWORD PTR [r14+0x188]
      b7fd7d:	31 c0                	xor    eax,eax
      b7fd7f:	48 89 e2             	mov    rdx,rsp
      b7fd82:	88 02                	mov    BYTE PTR [rdx],al
      b7fd84:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      b7fd87:	48 8d 8c 24 e0 00 00 	lea    rcx,[rsp+0xe0]
      b7fd8e:	00 
      b7fd8f:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      b7fd94:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      b7fd99:	e8 84 50 aa 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      b7fd9e:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      b7fda5:	00 
      b7fda6:	e8 bf a1 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b7fdab:	48 89 e7             	mov    rdi,rsp
      b7fdae:	e8 7d 6f f2 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      b7fdb3:	48 8d 35 c2 21 8d ff 	lea    rsi,[rip+0xffffffffff8d21c2]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b7fdba:	48 8d 0d 6a 98 7f ff 	lea    rcx,[rip+0xffffffffff7f986a]        # 37962b <_ZTSSt12bad_any_cast@@Base-0x16b9d>
      b7fdc1:	6a 04                	push   0x4
      b7fdc3:	5f                   	pop    rdi
      b7fdc4:	ba 1e 03 00 00       	mov    edx,0x31e
      b7fdc9:	45 89 e0             	mov    r8d,r12d
      b7fdcc:	41 89 d9             	mov    r9d,ebx
      b7fdcf:	31 c0                	xor    eax,eax
      b7fdd1:	e8 fc 6a c5 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      b7fdd6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      b7fddb:	e8 36 2a ad 00       	call   1652816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6982>
      b7fde0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b7fde7:	00 00 
      b7fde9:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
      b7fdf0:	00 
      b7fdf1:	0f 85 9b 00 00 00    	jne    b7fe92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcce32>
      b7fdf7:	48 81 c4 18 01 00 00 	add    rsp,0x118
      b7fdfe:	5b                   	pop    rbx
      b7fdff:	41 5c                	pop    r12

### caller 0xb8f431 FDE=(12120192, 12121618)
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

### caller 0xb92d97 FDE=(12135578, 12135919)
      b92d5b:	48 8b 57 e8          	mov    rdx,QWORD PTR [rdi-0x18]
      b92d5f:	f6 c2 01             	test   dl,0x1
      b92d62:	75 75                	jne    b92dd9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdfd79>
      b92d64:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      b92d69:	e8 78 2a bd 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      b92d6e:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      b92d73:	e8 18 b1 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b92d78:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      b92d7c:	31 c0                	xor    eax,eax
      b92d7e:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      b92d83:	88 02                	mov    BYTE PTR [rdx],al
      b92d85:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      b92d88:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      b92d8d:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      b92d92:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      b92d97:	e8 86 20 a9 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      b92d9c:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      b92da1:	e8 c4 71 ee ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b92da6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      b92dab:	e8 80 3f f1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      b92db0:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      b92db5:	e8 2a bc f2 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      b92dba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b92dc1:	00 00 
      b92dc3:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
      b92dca:	00 
      b92dcb:	75 15                	jne    b92de2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdfd82>
      b92dcd:	48 81 c4 a0 00 00 00 	add    rsp,0xa0
      b92dd4:	5b                   	pop    rbx
      b92dd5:	41 5e                	pop    r14
      b92dd7:	5d                   	pop    rbp
      b92dd8:	c3                   	ret
      b92dd9:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      b92ddd:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      b92de0:	eb 82                	jmp    b92d64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdfd04>
      b92de2:	e8 c9 cc c5 00       	call   17efab0 <__stack_chk_fail@plt>
      b92de7:	48 89 c7             	mov    rdi,rax
      b92dea:	e8 b6 6c ee ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      b92def:	cc                   	int3
      b92df0:	53                   	push   rbx

### caller 0xbd09e4 FDE=(12385942, 12389145)
      bd09b8:	72 0e                	jb     bd09c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11d968>
      bd09ba:	84 c9                	test   cl,cl
      bd09bc:	0f 98 c1             	sets   cl
      bd09bf:	84 c0                	test   al,al
      bd09c1:	0f 98 c0             	sets   al
      bd09c4:	38 c1                	cmp    cl,al
      bd09c6:	74 48                	je     bd0a10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11d9b0>
      bd09c8:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      bd09cb:	31 c0                	xor    eax,eax
      bd09cd:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      bd09d2:	88 02                	mov    BYTE PTR [rdx],al
      bd09d4:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      bd09d7:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      bd09dc:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      bd09e1:	4c 89 e6             	mov    rsi,r12
      bd09e4:	e8 39 44 a5 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      bd09e9:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      bd09ee:	e8 77 95 ea ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      bd09f3:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      bd09f8:	e8 33 63 ed ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      bd09fd:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      bd0a02:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
      bd0a08:	4c 89 f7             	mov    rdi,r14
      bd0a0b:	e8 66 f4 ff ff       	call   bcfe76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11ce16>
      bd0a10:	48 89 df             	mov    rdi,rbx
      bd0a13:	e8 d0 ab ea ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
      bd0a18:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      bd0a1d:	e8 4c f4 ff ff       	call   bcfe6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11ce0e>
      bd0a22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bd0a29:	00 00 
      bd0a2b:	48 3b 84 24 88 00 00 	cmp    rax,QWORD PTR [rsp+0x88]
      bd0a32:	00 
      bd0a33:	0f 85 db 00 00 00    	jne    bd0b14 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11dab4>
      bd0a39:	48 81 c4 90 00 00 00 	add    rsp,0x90
      bd0a40:	5b                   	pop    rbx
      bd0a41:	41 5c                	pop    r12
      bd0a43:	41 5d                	pop    r13
      bd0a45:	41 5e                	pop    r14
      bd0a47:	41 5f                	pop    r15
      bd0a49:	c3                   	ret

### caller 0xbd2f63 FDE=(12398230, 12398630)
      bd2f26:	0f 85 ad 00 00 00    	jne    bd2fd9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11ff79>
      bd2f2c:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      bd2f31:	e8 b0 28 b9 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      bd2f36:	4c 8d 73 30          	lea    r14,[rbx+0x30]
      bd2f3a:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
      bd2f3f:	4c 89 ff             	mov    rdi,r15
      bd2f42:	e8 49 af c1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      bd2f47:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
      bd2f4c:	31 c0                	xor    eax,eax
      bd2f4e:	48 89 e2             	mov    rdx,rsp
      bd2f51:	88 02                	mov    BYTE PTR [rdx],al
      bd2f53:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      bd2f56:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      bd2f5b:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      bd2f60:	4c 89 f6             	mov    rsi,r14
      bd2f63:	e8 ba 1e a5 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      bd2f68:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      bd2f6d:	e8 f8 6f ea ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      bd2f72:	48 89 e7             	mov    rdi,rsp
      bd2f75:	e8 b6 3d ed ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      bd2f7a:	49 39 9c 24 90 00 00 	cmp    QWORD PTR [r12+0x90],rbx
      bd2f81:	00 
      bd2f82:	75 10                	jne    bd2f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11ff34>
      bd2f84:	48 89 df             	mov    rdi,rbx
      bd2f87:	e8 56 b8 ec ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
      bd2f8c:	49 89 84 24 90 00 00 	mov    QWORD PTR [r12+0x90],rax
      bd2f93:	00 
      bd2f94:	49 ff 8c 24 a0 00 00 	dec    QWORD PTR [r12+0xa0]
      bd2f9b:	00 
      bd2f9c:	49 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [r12+0x98]
      bd2fa3:	00 
      bd2fa4:	48 89 de             	mov    rsi,rbx
      bd2fa7:	e8 a6 6d ed ff       	call   aa9d52 <JNI_OnUnload@@Base+0x3161f>
      bd2fac:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      bd2fb0:	e8 ef f2 ff ff       	call   bd22a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11f244>
      bd2fb5:	48 89 df             	mov    rdi,rbx
      bd2fb8:	e8 63 af c1 00       	call   17edf20 <_ZdlPv@plt>
      bd2fbd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bd2fc4:	00 00 
      bd2fc6:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]

### caller 0xbd3289 FDE=(12398740, 12399455)
      bd324e:	49 83 c7 40          	add    r15,0x40
      bd3252:	48 8b 57 c8          	mov    rdx,QWORD PTR [rdi-0x38]
      bd3256:	f6 c2 01             	test   dl,0x1
      bd3259:	0f 85 97 00 00 00    	jne    bd32f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120296>
      bd325f:	4c 89 fe             	mov    rsi,r15
      bd3262:	e8 2b 25 b9 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      bd3267:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
      bd326b:	31 c0                	xor    eax,eax
      bd326d:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
      bd3272:	88 02                	mov    BYTE PTR [rdx],al
      bd3274:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      bd3277:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
      bd327e:	00 
      bd327f:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      bd3284:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      bd3289:	e8 94 1b a5 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      bd328e:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      bd3295:	00 
      bd3296:	e8 cf 6c ea ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      bd329b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      bd32a0:	e8 8b 3a ed ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      bd32a5:	48 81 c3 a8 00 00 00 	add    rbx,0xa8
      bd32ac:	48 89 df             	mov    rdi,rbx
      bd32af:	4c 89 f6             	mov    rsi,r14
      bd32b2:	e8 17 50 f7 ff       	call   b482ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9526e>
      bd32b7:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      bd32bc:	e8 25 92 f0 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      bd32c1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bd32c8:	00 00 
      bd32ca:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
      bd32d1:	00 
      bd32d2:	0f 85 82 00 00 00    	jne    bd335a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1202fa>
      bd32d8:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
      bd32df:	5b                   	pop    rbx
      bd32e0:	41 5c                	pop    r12
      bd32e2:	41 5d                	pop    r13
      bd32e4:	41 5e                	pop    r14
      bd32e6:	41 5f                	pop    r15
      bd32e8:	5d                   	pop    rbp
      bd32e9:	c3                   	ret

### caller 0xc39f1e FDE=(12820050, 12820429)
      c39ee4:	80 4f d8 02          	or     BYTE PTR [rdi-0x28],0x2
      c39ee8:	48 8b 57 d0          	mov    rdx,QWORD PTR [rdi-0x30]
      c39eec:	f6 c2 01             	test   dl,0x1
      c39eef:	75 7a                	jne    c39f6b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x186f0b>
      c39ef1:	48 89 e6             	mov    rsi,rsp
      c39ef4:	e8 99 b8 b2 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      c39ef9:	48 8b bb b0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb0]
      c39f00:	31 c0                	xor    eax,eax
      c39f02:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      c39f07:	88 02                	mov    BYTE PTR [rdx],al
      c39f09:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c39f0c:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
      c39f13:	00 
      c39f14:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      c39f19:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      c39f1e:	e8 ff ae 9e 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c39f23:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      c39f2a:	00 
      c39f2b:	e8 3a 00 e4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c39f30:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      c39f35:	e8 f6 cd e6 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c39f3a:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      c39f3f:	e8 4a 53 e8 ff       	call   abf28e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc22e>
      c39f44:	48 89 e7             	mov    rdi,rsp
      c39f47:	e8 44 3f bb 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c39f4c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c39f53:	00 00 
      c39f55:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
      c39f5c:	00 
      c39f5d:	75 69                	jne    c39fc8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x186f68>
      c39f5f:	48 81 c4 c0 00 00 00 	add    rsp,0xc0
      c39f66:	5b                   	pop    rbx
      c39f67:	41 5e                	pop    r14
      c39f69:	5d                   	pop    rbp
      c39f6a:	c3                   	ret
      c39f6b:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      c39f6f:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      c39f72:	e9 7a ff ff ff       	jmp    c39ef1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x186e91>
      c39f77:	48 89 c3             	mov    rbx,rax
      c39f7a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]

### caller 0xc3edc8 FDE=(12839112, 12840736)
      c3ed87:	4c 89 b4 24 48 01 00 	mov    QWORD PTR [rsp+0x148],r14
      c3ed8e:	00 
      c3ed8f:	80 8c 24 38 01 00 00 	or     BYTE PTR [rsp+0x138],0x2
      c3ed96:	02 
      c3ed97:	49 8b bd f0 00 00 00 	mov    rdi,QWORD PTR [r13+0xf0]
      c3ed9e:	31 c0                	xor    eax,eax
      c3eda0:	88 84 24 08 01 00 00 	mov    BYTE PTR [rsp+0x108],al
      c3eda7:	88 84 24 20 01 00 00 	mov    BYTE PTR [rsp+0x120],al
      c3edae:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
      c3edb5:	00 00 
      c3edb7:	48 89 ee             	mov    rsi,rbp
      c3edba:	4c 8d b4 24 08 01 00 	lea    r14,[rsp+0x108]
      c3edc1:	00 
      c3edc2:	4c 89 f2             	mov    rdx,r14
      c3edc5:	4c 89 f9             	mov    rcx,r15
      c3edc8:	e8 55 60 9e 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c3edcd:	4c 89 ff             	mov    rdi,r15
      c3edd0:	e8 95 b1 e3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c3edd5:	4c 89 f7             	mov    rdi,r14
      c3edd8:	e8 53 7f e6 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c3eddd:	48 89 ef             	mov    rdi,rbp
      c3ede0:	e8 29 bd e6 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      c3ede5:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      c3edec:	00 
      c3eded:	e8 9e f0 ba 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c3edf2:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]
      c3edf7:	80 7c 24 6c 00       	cmp    BYTE PTR [rsp+0x6c],0x0
      c3edfc:	74 62                	je     c3ee60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18be00>
      c3edfe:	0f 10 84 24 e0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xe0]
      c3ee05:	00 
      c3ee06:	0f 10 8c 24 f0 00 00 	movups xmm1,XMMWORD PTR [rsp+0xf0]
      c3ee0d:	00 
      c3ee0e:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      c3ee13:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
      c3ee17:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      c3ee1c:	44 89 f6             	mov    esi,r14d
      c3ee1f:	e8 96 02 00 00       	call   c3f0ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c05a>
      c3ee24:	84 db                	test   bl,bl
      c3ee26:	75 0f                	jne    c3ee37 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18bdd7>
      c3ee28:	4c 89 ef             	mov    rdi,r13

### caller 0xc4156c FDE=(12850220, 12850767)
      c4152f:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
      c41533:	48 8b 57 e8          	mov    rdx,QWORD PTR [rdi-0x18]
      c41537:	f6 c2 01             	test   dl,0x1
      c4153a:	0f 85 92 00 00 00    	jne    c415d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18e572>
      c41540:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      c41545:	e8 48 42 b2 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      c4154a:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
      c4154e:	31 c0                	xor    eax,eax
      c41550:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
      c41555:	88 02                	mov    BYTE PTR [rdx],al
      c41557:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c4155a:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
      c41561:	00 
      c41562:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      c41567:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      c4156c:	e8 b1 38 9e 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c41571:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      c41578:	00 
      c41579:	e8 ec 89 e3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c4157e:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      c41583:	e8 a8 57 e6 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c41588:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      c4158d:	e8 52 d4 e7 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      c41592:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      c41597:	e8 f4 c8 ba 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c4159c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      c415a1:	e8 ea c8 ba 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c415a6:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      c415ab:	e8 e0 c8 ba 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c415b0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c415b7:	00 00 
      c415b9:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
      c415c0:	00 
      c415c1:	0f 85 83 00 00 00    	jne    c4164a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18e5ea>
      c415c7:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
      c415ce:	5b                   	pop    rbx
      c415cf:	41 5e                	pop    r14
      c415d1:	c3                   	ret
      c415d2:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      c415d6:	48 8b 12             	mov    rdx,QWORD PTR [rdx]

### caller 0xc4a5c0 FDE=(12887084, 12887942)
      c4a581:	e8 60 b2 b1 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      c4a586:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
      c4a58b:	4c 89 ff             	mov    rdi,r15
      c4a58e:	e8 fd 38 ba 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c4a593:	48 63 c5             	movsxd rax,ebp
      c4a596:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      c4a59b:	48 89 46 30          	mov    QWORD PTR [rsi+0x30],rax
      c4a59f:	80 4e 10 08          	or     BYTE PTR [rsi+0x10],0x8
      c4a5a3:	48 8b bb 38 01 00 00 	mov    rdi,QWORD PTR [rbx+0x138]
      c4a5aa:	31 c0                	xor    eax,eax
      c4a5ac:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      c4a5b1:	88 02                	mov    BYTE PTR [rdx],al
      c4a5b3:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c4a5b6:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      c4a5bb:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      c4a5c0:	e8 5d a8 9d 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c4a5c5:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      c4a5ca:	e8 9b f9 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c4a5cf:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      c4a5d4:	e8 57 c7 e5 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c4a5d9:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      c4a5de:	e8 c7 4b e7 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      c4a5e3:	45 8b 26             	mov    r12d,DWORD PTR [r14]
      c4a5e6:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
      c4a5ea:	e9 c3 00 00 00       	jmp    c4a6b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x197652>
      c4a5ef:	48 8d 44 24 30       	lea    rax,[rsp+0x30]
      c4a5f4:	48 89 58 f8          	mov    QWORD PTR [rax-0x8],rbx
      c4a5f8:	4c 89 28             	mov    QWORD PTR [rax],r13
      c4a5fb:	31 c9                	xor    ecx,ecx
      c4a5fd:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
      c4a602:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      c4a606:	0f 11 44 24 40       	movups XMMWORD PTR [rsp+0x40],xmm0
      c4a60b:	89 6c 24 50          	mov    DWORD PTR [rsp+0x50],ebp
      c4a60f:	48 8d 0d 02 76 80 ff 	lea    rcx,[rip+0xffffffffff807602]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      c4a616:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      c4a61b:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      c4a620:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
      c4a626:	0f 57 c0             	xorps  xmm0,xmm0
      c4a629:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
      c4a62f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0

### caller 0xc4aa98 FDE=(12888120, 12888944)
      c4aa5c:	48 89 e6             	mov    rsi,rsp
      c4aa5f:	48 89 df             	mov    rdi,rbx
      c4aa62:	e8 2b ad b1 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      c4aa67:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      c4aa6c:	4c 89 66 30          	mov    QWORD PTR [rsi+0x30],r12
      c4aa70:	4c 89 6e 38          	mov    QWORD PTR [rsi+0x38],r13
      c4aa74:	80 4e 10 18          	or     BYTE PTR [rsi+0x10],0x18
      c4aa78:	49 8b be 38 01 00 00 	mov    rdi,QWORD PTR [r14+0x138]
      c4aa7f:	31 c0                	xor    eax,eax
      c4aa81:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      c4aa86:	88 02                	mov    BYTE PTR [rdx],al
      c4aa88:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c4aa8b:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
      c4aa92:	00 
      c4aa93:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      c4aa98:	e8 85 a3 9d 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c4aa9d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      c4aaa4:	00 
      c4aaa5:	e8 c0 f4 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c4aaaa:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      c4aaaf:	e8 7c c2 e5 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c4aab4:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      c4aab9:	e8 26 3f e7 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      c4aabe:	48 89 e7             	mov    rdi,rsp
      c4aac1:	e8 ca 33 ba 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c4aac6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c4aacd:	00 00 
      c4aacf:	48 3b 84 24 f8 00 00 	cmp    rax,QWORD PTR [rsp+0xf8]
      c4aad6:	00 
      c4aad7:	75 1d                	jne    c4aaf6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x197a96>
      c4aad9:	48 81 c4 00 01 00 00 	add    rsp,0x100
      c4aae0:	5b                   	pop    rbx
      c4aae1:	41 5c                	pop    r12
      c4aae3:	41 5d                	pop    r13
      c4aae5:	41 5e                	pop    r14
      c4aae7:	41 5f                	pop    r15
      c4aae9:	c3                   	ret
      c4aaea:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      c4aaee:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      c4aaf1:	e9 66 ff ff ff       	jmp    c4aa5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1979fc>

### caller 0xc62b6c FDE=(12986268, 12987427)
      c62b28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c62b2b:	ff 50 30             	call   QWORD PTR [rax+0x30]
      c62b2e:	80 bb f8 02 00 00 00 	cmp    BYTE PTR [rbx+0x2f8],0x0
      c62b35:	75 07                	jne    c62b3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1afade>
      c62b37:	c6 83 f8 02 00 00 01 	mov    BYTE PTR [rbx+0x2f8],0x1
      c62b3e:	48 89 83 f0 02 00 00 	mov    QWORD PTR [rbx+0x2f0],rax
      c62b45:	48 8b bb b0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b0]
      c62b4c:	49 81 c7 90 00 00 00 	add    r15,0x90
      c62b53:	31 c0                	xor    eax,eax
      c62b55:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
      c62b5a:	88 02                	mov    BYTE PTR [rdx],al
      c62b5c:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c62b5f:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      c62b64:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      c62b69:	4c 89 fe             	mov    rsi,r15
      c62b6c:	e8 b1 22 9c 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c62b71:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      c62b76:	e8 ef 73 e1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c62b7b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      c62b80:	e8 ab 41 e4 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c62b85:	48 89 df             	mov    rdi,rbx
      c62b88:	31 f6                	xor    esi,esi
      c62b8a:	e8 33 c6 ff ff       	call   c5f1c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ac162>
      c62b8f:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      c62b94:	c6 80 58 01 00 00 01 	mov    BYTE PTR [rax+0x158],0x1
      c62b9b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c62ba2:	00 00 
      c62ba4:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
      c62bab:	00 
      c62bac:	75 70                	jne    c62c1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1afbbe>
      c62bae:	48 81 c4 98 00 00 00 	add    rsp,0x98
      c62bb5:	5b                   	pop    rbx
      c62bb6:	41 5c                	pop    r12
      c62bb8:	41 5d                	pop    r13
      c62bba:	41 5e                	pop    r14
      c62bbc:	41 5f                	pop    r15
      c62bbe:	5d                   	pop    rbp
      c62bbf:	c3                   	ret
      c62bc0:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      c62bc4:	48 8b 12             	mov    rdx,QWORD PTR [rdx]

### caller 0xc6b830 FDE=(13022820, 13024175)
      c6b7fc:	74 11                	je     c6b80f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b87af>
      c6b7fe:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      c6b803:	4c 89 fe             	mov    rsi,r15
      c6b806:	e8 43 64 a7 00       	call   16e1c4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95dba>
      c6b80b:	84 c0                	test   al,al
      c6b80d:	75 7e                	jne    c6b88d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b882d>
      c6b80f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      c6b812:	31 c0                	xor    eax,eax
      c6b814:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      c6b819:	88 02                	mov    BYTE PTR [rdx],al
      c6b81b:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c6b81e:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
      c6b825:	00 
      c6b826:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      c6b82b:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      c6b830:	e8 ed 95 9b 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c6b835:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      c6b83c:	00 
      c6b83d:	e8 28 e7 e0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c6b842:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      c6b847:	e8 e4 b4 e3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c6b84c:	80 7b 70 00          	cmp    BYTE PTR [rbx+0x70],0x0
      c6b850:	74 0f                	je     c6b861 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b8801>
      c6b852:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      c6b857:	4c 89 ff             	mov    rdi,r15
      c6b85a:	e8 51 03 00 00       	call   c6bbb0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b8b50>
      c6b85f:	eb 2c                	jmp    c6b88d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b882d>
      c6b861:	0f 57 c0             	xorps  xmm0,xmm0
      c6b864:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
      c6b868:	4c 89 63 28          	mov    QWORD PTR [rbx+0x28],r12
      c6b86c:	4c 89 6b 40          	mov    QWORD PTR [rbx+0x40],r13
      c6b870:	0f 11 43 48          	movups XMMWORD PTR [rbx+0x48],xmm0
      c6b874:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
      c6b878:	c6 43 68 00          	mov    BYTE PTR [rbx+0x68],0x0
      c6b87c:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      c6b881:	4c 89 ff             	mov    rdi,r15
      c6b884:	e8 27 03 00 00       	call   c6bbb0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b8b50>
      c6b889:	c6 43 70 01          	mov    BYTE PTR [rbx+0x70],0x1
      c6b88d:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
      c6b892:	4c 89 ff             	mov    rdi,r15

### caller 0xc6ba15 FDE=(13022820, 13024175)
      c6b9dd:	74 15                	je     c6b9f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b8994>
      c6b9df:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      c6b9e4:	4c 89 f6             	mov    rsi,r14
      c6b9e7:	e8 62 62 a7 00       	call   16e1c4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95dba>
      c6b9ec:	84 c0                	test   al,al
      c6b9ee:	0f 85 93 00 00 00    	jne    c6ba87 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b8a27>
      c6b9f4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      c6b9f7:	31 c0                	xor    eax,eax
      c6b9f9:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      c6b9fe:	88 02                	mov    BYTE PTR [rdx],al
      c6ba00:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c6ba03:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
      c6ba0a:	00 
      c6ba0b:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      c6ba10:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      c6ba15:	e8 08 94 9b 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c6ba1a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      c6ba21:	00 
      c6ba22:	e8 43 e5 e0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c6ba27:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      c6ba2c:	e8 ff b2 e3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c6ba31:	80 bb b8 00 00 00 00 	cmp    BYTE PTR [rbx+0xb8],0x0
      c6ba38:	74 0f                	je     c6ba49 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b89e9>
      c6ba3a:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      c6ba3f:	4c 89 f7             	mov    rdi,r14
      c6ba42:	e8 0f 02 00 00       	call   c6bc56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b8bf6>
      c6ba47:	eb 3e                	jmp    c6ba87 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b8a27>
      c6ba49:	0f 57 c0             	xorps  xmm0,xmm0
      c6ba4c:	0f 11 83 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm0
      c6ba53:	48 89 6b 78          	mov    QWORD PTR [rbx+0x78],rbp
      c6ba57:	4c 89 ab 90 00 00 00 	mov    QWORD PTR [rbx+0x90],r13
      c6ba5e:	4c 89 ab 98 00 00 00 	mov    QWORD PTR [rbx+0x98],r13
      c6ba65:	0f 11 83 a0 00 00 00 	movups XMMWORD PTR [rbx+0xa0],xmm0
      c6ba6c:	c6 83 b0 00 00 00 00 	mov    BYTE PTR [rbx+0xb0],0x0
      c6ba73:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      c6ba78:	4c 89 f7             	mov    rdi,r14
      c6ba7b:	e8 d6 01 00 00       	call   c6bc56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b8bf6>
      c6ba80:	c6 83 b8 00 00 00 01 	mov    BYTE PTR [rbx+0xb8],0x1
      c6ba87:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      c6ba8c:	e8 53 2f e5 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>

### caller 0xc7070a FDE=(13042924, 13043684)
      c706d1:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
      c706d8:	00 
      c706d9:	48 89 4e 50          	mov    QWORD PTR [rsi+0x50],rcx
      c706dd:	49 63 56 20          	movsxd rdx,DWORD PTR [r14+0x20]
      c706e1:	48 01 ca             	add    rdx,rcx
      c706e4:	48 89 56 58          	mov    QWORD PTR [rsi+0x58],rdx
      c706e8:	0d 80 01 00 00       	or     eax,0x180
      c706ed:	89 46 10             	mov    DWORD PTR [rsi+0x10],eax
      c706f0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      c706f4:	31 c0                	xor    eax,eax
      c706f6:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
      c706fb:	88 02                	mov    BYTE PTR [rdx],al
      c706fd:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c70700:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      c70705:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      c7070a:	e8 13 47 9b 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c7070f:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      c70714:	e8 51 98 e0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c70719:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      c7071e:	e8 0d 66 e3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c70723:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      c7072a:	00 
      c7072b:	e8 7a ea e4 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      c70730:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      c70735:	e8 56 d7 b7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c7073a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c70741:	00 00 
      c70743:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
      c7074a:	00 
      c7074b:	0f 85 8e 00 00 00    	jne    c707df <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bd77f>
      c70751:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
      c70758:	5b                   	pop    rbx
      c70759:	41 5c                	pop    r12
      c7075b:	41 5d                	pop    r13
      c7075d:	41 5e                	pop    r14
      c7075f:	41 5f                	pop    r15
      c70761:	5d                   	pop    rbp
      c70762:	c3                   	ret
      c70763:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      c70767:	48 8b 12             	mov    rdx,QWORD PTR [rdx]

### caller 0xc73038 FDE=(13053034, 13054861)
      c72ffb:	f6 c2 01             	test   dl,0x1
      c72ffe:	0f 85 a8 02 00 00    	jne    c732ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c024c>
      c73004:	4c 89 f6             	mov    rsi,r14
      c73007:	e8 46 2d e9 ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      c7300c:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx
      c73010:	48 8b bb 30 03 00 00 	mov    rdi,QWORD PTR [rbx+0x330]
      c73017:	31 c0                	xor    eax,eax
      c73019:	48 8d 54 24 70       	lea    rdx,[rsp+0x70]
      c7301e:	88 02                	mov    BYTE PTR [rdx],al
      c73020:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c73023:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
      c7302a:	00 
      c7302b:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      c73030:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
      c73037:	00 
      c73038:	e8 e5 1d 9b 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c7303d:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      c73044:	00 
      c73045:	e8 20 6f e0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c7304a:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      c7304f:	e8 dc 3c e3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c73054:	48 8d 84 24 60 02 00 	lea    rax,[rsp+0x260]
      c7305b:	00 
      c7305c:	4c 8b 70 f8          	mov    r14,QWORD PTR [rax-0x8]
      c73060:	49 39 c6             	cmp    r14,rax
      c73063:	0f 84 69 01 00 00    	je     c731d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c0172>
      c73069:	4c 8d bc 24 b8 00 00 	lea    r15,[rsp+0xb8]
      c73070:	00 
      c73071:	4c 8d ac 24 a0 00 00 	lea    r13,[rsp+0xa0]
      c73078:	00 
      c73079:	48 8d 6c 24 50       	lea    rbp,[rsp+0x50]
      c7307e:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      c73083:	49 63 5e 20          	movsxd rbx,DWORD PTR [r14+0x20]
      c73087:	41 8b 46 3c          	mov    eax,DWORD PTR [r14+0x3c]
      c7308b:	01 84 24 48 02 00 00 	add    DWORD PTR [rsp+0x248],eax
      c73092:	41 8b 46 40          	mov    eax,DWORD PTR [r14+0x40]
      c73096:	01 84 24 4c 02 00 00 	add    DWORD PTR [rsp+0x24c],eax
      c7309d:	41 8b 46 44          	mov    eax,DWORD PTR [r14+0x44]
      c730a1:	01 84 24 50 02 00 00 	add    DWORD PTR [rsp+0x250],eax
      c730a8:	41 83 7e 38 00       	cmp    DWORD PTR [r14+0x38],0x0

### caller 0xc73199 FDE=(13053034, 13054861)
      c7315b:	48 c1 e8 0a          	shr    rax,0xa
      c7315f:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      c73166:	00 
      c73167:	81 8c 24 b0 00 00 00 	or     DWORD PTR [rsp+0xb0],0xfe
      c7316e:	fe 00 00 00 
      c73172:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      c73176:	48 8b b8 30 03 00 00 	mov    rdi,QWORD PTR [rax+0x330]
      c7317d:	31 c0                	xor    eax,eax
      c7317f:	88 44 24 50          	mov    BYTE PTR [rsp+0x50],al
      c73183:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
      c73187:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
      c7318e:	00 00 
      c73190:	4c 89 ee             	mov    rsi,r13
      c73193:	48 89 ea             	mov    rdx,rbp
      c73196:	4c 89 e1             	mov    rcx,r12
      c73199:	e8 84 1c 9b 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c7319e:	4c 89 e7             	mov    rdi,r12
      c731a1:	e8 c4 6d e0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c731a6:	48 89 ef             	mov    rdi,rbp
      c731a9:	e8 82 3b e3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c731ae:	4c 89 ef             	mov    rdi,r13
      c731b1:	e8 58 79 e3 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      c731b6:	4c 89 f7             	mov    rdi,r14
      c731b9:	e8 24 b6 e2 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
      c731be:	49 89 c6             	mov    r14,rax
      c731c1:	48 8d 84 24 60 02 00 	lea    rax,[rsp+0x260]
      c731c8:	00 
      c731c9:	49 39 c6             	cmp    r14,rax
      c731cc:	0f 85 b1 fe ff ff    	jne    c73083 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c0023>
      c731d2:	4c 8d b4 24 f8 00 00 	lea    r14,[rsp+0xf8]
      c731d9:	00 
      c731da:	4c 89 f7             	mov    rdi,r14
      c731dd:	e8 3e d8 e4 ff       	call   ac0a20 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9c0>
      c731e2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      c731e7:	e8 a4 ac b7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c731ec:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      c731f1:	e8 9a ac b7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c731f6:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      c731fb:	e8 90 ac b7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c73200:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]

### caller 0xc765e3 FDE=(13063558, 13068958)
      c765a0:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      c765a5:	48 8b b8 30 03 00 00 	mov    rdi,QWORD PTR [rax+0x330]
      c765ac:	31 c0                	xor    eax,eax
      c765ae:	88 84 24 20 01 00 00 	mov    BYTE PTR [rsp+0x120],al
      c765b5:	88 84 24 38 01 00 00 	mov    BYTE PTR [rsp+0x138],al
      c765bc:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
      c765c3:	00 00 
      c765c5:	48 8d b4 24 00 02 00 	lea    rsi,[rsp+0x200]
      c765cc:	00 
      c765cd:	4c 8d a4 24 20 01 00 	lea    r12,[rsp+0x120]
      c765d4:	00 
      c765d5:	4c 89 e2             	mov    rdx,r12
      c765d8:	48 8d 9c 24 d0 01 00 	lea    rbx,[rsp+0x1d0]
      c765df:	00 
      c765e0:	48 89 d9             	mov    rcx,rbx
      c765e3:	e8 3a e8 9a 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c765e8:	48 89 df             	mov    rdi,rbx
      c765eb:	e8 7a 39 e0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c765f0:	4c 89 e7             	mov    rdi,r12
      c765f3:	e8 38 07 e3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c765f8:	4d 89 fc             	mov    r12,r15
      c765fb:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]
      c76600:	41 8b 44 24 08       	mov    eax,DWORD PTR [r12+0x8]
      c76605:	48 01 84 24 80 01 00 	add    QWORD PTR [rsp+0x180],rax
      c7660c:	00 
      c7660d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      c76612:	49 03 04 24          	add    rax,QWORD PTR [r12]
      c76616:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      c7661b:	41 8b 47 08          	mov    eax,DWORD PTR [r15+0x8]
      c7661f:	48 01 84 24 a0 01 00 	add    QWORD PTR [rsp+0x1a0],rax
      c76626:	00 
      c76627:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      c7662c:	49 03 07             	add    rax,QWORD PTR [r15]
      c7662f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c76634:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
      c76639:	8b 41 08             	mov    eax,DWORD PTR [rcx+0x8]
      c7663c:	48 01 84 24 b0 01 00 	add    QWORD PTR [rsp+0x1b0],rax
      c76643:	00 
      c76644:	4c 03 29             	add    r13,QWORD PTR [rcx]
      c76647:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]

### caller 0xc7675c FDE=(13063558, 13068958)
      c7671c:	4c 89 6e 78          	mov    QWORD PTR [rsi+0x78],r13
      c76720:	4c 89 66 58          	mov    QWORD PTR [rsi+0x58],r12
      c76724:	4c 89 be 88 00 00 00 	mov    QWORD PTR [rsi+0x88],r15
      c7672b:	81 cb 40 55 00 00    	or     ebx,0x5540
      c76731:	89 5e 10             	mov    DWORD PTR [rsi+0x10],ebx
      c76734:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      c76739:	48 8b b8 30 03 00 00 	mov    rdi,QWORD PTR [rax+0x330]
      c76740:	31 c0                	xor    eax,eax
      c76742:	48 8d 94 24 d0 01 00 	lea    rdx,[rsp+0x1d0]
      c76749:	00 
      c7674a:	88 02                	mov    BYTE PTR [rdx],al
      c7674c:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      c7674f:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
      c76756:	00 
      c76757:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      c7675c:	e8 c1 e6 9a 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      c76761:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
      c76768:	00 
      c76769:	e8 fc 37 e0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c7676e:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      c76775:	00 
      c76776:	e8 b5 05 e3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      c7677b:	48 8b 9c 24 a0 00 00 	mov    rbx,QWORD PTR [rsp+0xa0]
      c76782:	00 
      c76783:	4c 8b 94 24 a8 00 00 	mov    r10,QWORD PTR [rsp+0xa8]
      c7678a:	00 
      c7678b:	4d 89 d0             	mov    r8,r10
      c7678e:	49 29 d8             	sub    r8,rbx
      c76791:	49 c1 f8 04          	sar    r8,0x4
      c76795:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      c7679c:	00 
      c7679d:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      c767a0:	8b 40 10             	mov    eax,DWORD PTR [rax+0x10]
      c767a3:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
      c767a7:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
      c767ab:	48 8d 35 6e f5 7b ff 	lea    rsi,[rip+0xffffffffff7bf56e]        # 435d20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b76f>
      c767b2:	48 8d 0d 19 b9 6d ff 	lea    rcx,[rip+0xffffffffff6db919]        # 3520d2 <_ZTSSt12bad_any_cast@@Base-0x3e0f6>
      c767b9:	6a 04                	push   0x4
      c767bb:	5f                   	pop    rdi
      c767bc:	ba f6 05 00 00       	mov    edx,0x5f6

### caller 0xca2c8f FDE=(13249294, 13250087)
      ca2c5d:	e8 dc e6 e3 ff       	call   ae133e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2e2de>
      ca2c62:	49 83 c4 02          	add    r12,0x2
      ca2c66:	4d 39 ec             	cmp    r12,r13
      ca2c69:	75 ea                	jne    ca2c55 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1efbf5>
      ca2c6b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      ca2c6e:	48 85 ff             	test   rdi,rdi
      ca2c71:	74 36                	je     ca2ca9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1efc49>
      ca2c73:	31 c0                	xor    eax,eax
      ca2c75:	48 89 e2             	mov    rdx,rsp
      ca2c78:	88 02                	mov    BYTE PTR [rdx],al
      ca2c7a:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      ca2c7d:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
      ca2c84:	00 
      ca2c85:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      ca2c8a:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      ca2c8f:	e8 8e 21 98 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      ca2c94:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      ca2c9b:	00 
      ca2c9c:	e8 c9 72 dd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ca2ca1:	48 89 e7             	mov    rdi,rsp
      ca2ca4:	e8 87 40 e0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      ca2ca9:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ca2cae:	e8 c9 8a 71 00       	call   13bb77c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x200d00>
      ca2cb3:	48 8b 73 50          	mov    rsi,QWORD PTR [rbx+0x50]
      ca2cb7:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
      ca2cbb:	f3 4c 0f b8 ce       	popcnt r9,rsi
      ca2cc0:	49 83 f9 01          	cmp    r9,0x1
      ca2cc4:	77 09                	ja     ca2ccf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1efc6f>
      ca2cc6:	48 8d 46 ff          	lea    rax,[rsi-0x1]
      ca2cca:	48 21 c1             	and    rcx,rax
      ca2ccd:	eb 10                	jmp    ca2cdf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1efc7f>
      ca2ccf:	48 39 f1             	cmp    rcx,rsi
      ca2cd2:	72 0b                	jb     ca2cdf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1efc7f>
      ca2cd4:	48 89 c8             	mov    rax,rcx
      ca2cd7:	31 d2                	xor    edx,edx
      ca2cd9:	48 f7 f6             	div    rsi
      ca2cdc:	48 89 d1             	mov    rcx,rdx
      ca2cdf:	4c 8b 53 48          	mov    r10,QWORD PTR [rbx+0x48]
      ca2ce3:	49 8b 04 ca          	mov    rax,QWORD PTR [r10+rcx*8]
      ca2ce7:	48 89 c7             	mov    rdi,rax

### caller 0xcc2843 FDE=(13378972, 13380443)
      cc2800:	49 f7 7d 20          	idiv   QWORD PTR [r13+0x20]
      cc2804:	89 84 24 98 01 00 00 	mov    DWORD PTR [rsp+0x198],eax
      cc280b:	81 c9 00 1c 00 00    	or     ecx,0x1c00
      cc2811:	89 8c 24 48 01 00 00 	mov    DWORD PTR [rsp+0x148],ecx
      cc2818:	48 8b bb 90 06 00 00 	mov    rdi,QWORD PTR [rbx+0x690]
      cc281f:	31 c0                	xor    eax,eax
      cc2821:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
      cc2828:	00 
      cc2829:	88 02                	mov    BYTE PTR [rdx],al
      cc282b:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cc282e:	48 8d 8c 24 00 01 00 	lea    rcx,[rsp+0x100]
      cc2835:	00 
      cc2836:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cc283b:	48 8d b4 24 38 01 00 	lea    rsi,[rsp+0x138]
      cc2842:	00 
      cc2843:	e8 da 25 96 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc2848:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      cc284f:	00 
      cc2850:	e8 15 77 db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc2855:	4c 8d a4 24 c8 00 00 	lea    r12,[rsp+0xc8]
      cc285c:	00 
      cc285d:	4c 89 e7             	mov    rdi,r12
      cc2860:	e8 cb 44 de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc2865:	48 8b bb 38 07 00 00 	mov    rdi,QWORD PTR [rbx+0x738]
      cc286c:	48 85 ff             	test   rdi,rdi
      cc286f:	0f 84 e1 00 00 00    	je     cc2956 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f8f6>
      cc2875:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc2878:	ff 50 28             	call   QWORD PTR [rax+0x28]
      cc287b:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      cc2882:	00 
      cc2883:	48 89 07             	mov    QWORD PTR [rdi],rax
      cc2886:	48 89 57 08          	mov    QWORD PTR [rdi+0x8],rdx
      cc288a:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
      cc2891:	00 
      cc2892:	e8 8b 83 ec ff       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
      cc2897:	84 c0                	test   al,al
      cc2899:	0f 85 b7 00 00 00    	jne    cc2956 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f8f6>
      cc289f:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      cc28a6:	00 
      cc28a7:	48 89 ee             	mov    rsi,rbp

### caller 0xcc2df2 FDE=(13380596, 13383094)
      cc2daf:	45 31 c0             	xor    r8d,r8d
      cc2db2:	80 b8 70 01 00 00 01 	cmp    BYTE PTR [rax+0x170],0x1
      cc2db9:	ba 00 00 00 00       	mov    edx,0x0
      cc2dbe:	19 d2                	sbb    edx,edx
      cc2dc0:	0b 90 6c 01 00 00    	or     edx,DWORD PTR [rax+0x16c]
      cc2dc6:	89 56 4c             	mov    DWORD PTR [rsi+0x4c],edx
      cc2dc9:	81 c9 80 02 00 00    	or     ecx,0x280
      cc2dcf:	89 4e 10             	mov    DWORD PTR [rsi+0x10],ecx
      cc2dd2:	49 8b bd 90 06 00 00 	mov    rdi,QWORD PTR [r13+0x690]
      cc2dd9:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
      cc2dde:	44 88 02             	mov    BYTE PTR [rdx],r8b
      cc2de1:	44 88 42 18          	mov    BYTE PTR [rdx+0x18],r8b
      cc2de5:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
      cc2dec:	00 
      cc2ded:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cc2df2:	e8 2b 20 96 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc2df7:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      cc2dfe:	00 
      cc2dff:	e8 66 71 db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc2e04:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      cc2e09:	e8 22 3f de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc2e0e:	49 8b 06             	mov    rax,QWORD PTR [r14]
      cc2e11:	80 b8 68 01 00 00 00 	cmp    BYTE PTR [rax+0x168],0x0
      cc2e18:	0f 84 9c 05 00 00    	je     cc33ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21035a>
      cc2e1e:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      cc2e25:	00 
      cc2e26:	e8 51 70 00 00       	call   cc9e7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216e1c>
      cc2e2b:	49 8b bd f0 05 00 00 	mov    rdi,QWORD PTR [r13+0x5f0]
      cc2e32:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc2e35:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc2e3b:	c6 44 24 60 20       	mov    BYTE PTR [rsp+0x60],0x20
      cc2e40:	48 89 44 24 61       	mov    QWORD PTR [rsp+0x61],rax
      cc2e45:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      cc2e4c:	00 
      cc2e4d:	80 4f f8 01          	or     BYTE PTR [rdi-0x8],0x1
      cc2e51:	48 89 54 24 69       	mov    QWORD PTR [rsp+0x69],rdx
      cc2e56:	c6 44 24 71 00       	mov    BYTE PTR [rsp+0x71],0x0
      cc2e5b:	48 8b 57 f0          	mov    rdx,QWORD PTR [rdi-0x10]
      cc2e5f:	f6 c2 01             	test   dl,0x1
      cc2e62:	0f 85 eb 05 00 00    	jne    cc3453 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2103f3>

### caller 0xcc338c FDE=(13380596, 13383094)
      cc334d:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      cc3354:	00 
      cc3355:	e8 36 ab b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc335a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      cc335f:	e8 2c ab b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc3364:	49 8b bd 90 06 00 00 	mov    rdi,QWORD PTR [r13+0x690]
      cc336b:	31 c0                	xor    eax,eax
      cc336d:	48 8d 94 24 90 00 00 	lea    rdx,[rsp+0x90]
      cc3374:	00 
      cc3375:	88 02                	mov    BYTE PTR [rdx],al
      cc3377:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cc337a:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      cc337f:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cc3384:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
      cc338b:	00 
      cc338c:	e8 91 1a 96 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc3391:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      cc3396:	e8 cf 6b db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc339b:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      cc33a2:	00 
      cc33a3:	e8 88 39 de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc33a8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      cc33af:	00 
      cc33b0:	e8 6b d6 df ff       	call   ac0a20 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9c0>
      cc33b5:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
      cc33ba:	49 8b 85 f0 05 00 00 	mov    rax,QWORD PTR [r13+0x5f0]
      cc33c1:	49 83 a5 f0 05 00 00 	and    QWORD PTR [r13+0x5f0],0x0
      cc33c8:	00 
      cc33c9:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
      cc33ce:	48 89 02             	mov    QWORD PTR [rdx],rax
      cc33d1:	0f b6 44 24 14       	movzx  eax,BYTE PTR [rsp+0x14]
      cc33d6:	44 0f b6 4c 24 07    	movzx  r9d,BYTE PTR [rsp+0x7]
      cc33dc:	48 89 ef             	mov    rdi,rbp
      cc33df:	4c 89 ee             	mov    rsi,r13
      cc33e2:	4c 89 f1             	mov    rcx,r14
      cc33e5:	4d 89 f8             	mov    r8,r15
      cc33e8:	41 54                	push   r12
      cc33ea:	50                   	push   rax
      cc33eb:	e8 bc 42 00 00       	call   cc76ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21464c>
      cc33f0:	58                   	pop    rax

### caller 0xcc3917 FDE=(13383094, 13384674)
      cc38d4:	80 b8 70 01 00 00 01 	cmp    BYTE PTR [rax+0x170],0x1
      cc38db:	ba 00 00 00 00       	mov    edx,0x0
      cc38e0:	19 d2                	sbb    edx,edx
      cc38e2:	0b 90 6c 01 00 00    	or     edx,DWORD PTR [rax+0x16c]
      cc38e8:	89 56 4c             	mov    DWORD PTR [rsi+0x4c],edx
      cc38eb:	81 c9 80 03 00 00    	or     ecx,0x380
      cc38f1:	89 4e 10             	mov    DWORD PTR [rsi+0x10],ecx
      cc38f4:	48 8b bb 90 06 00 00 	mov    rdi,QWORD PTR [rbx+0x690]
      cc38fb:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
      cc3902:	00 
      cc3903:	44 88 22             	mov    BYTE PTR [rdx],r12b
      cc3906:	44 88 62 18          	mov    BYTE PTR [rdx+0x18],r12b
      cc390a:	48 8d 8c 24 e0 00 00 	lea    rcx,[rsp+0xe0]
      cc3911:	00 
      cc3912:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cc3917:	e8 06 15 96 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc391c:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      cc3923:	00 
      cc3924:	e8 41 66 db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc3929:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      cc3930:	00 
      cc3931:	e8 fa 33 de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc3936:	45 31 c0             	xor    r8d,r8d
      cc3939:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
      cc3940:	00 
      cc3941:	48 85 c0             	test   rax,rax
      cc3944:	41 0f 94 c0          	sete   r8b
      cc3948:	45 01 c0             	add    r8d,r8d
      cc394b:	45 84 ed             	test   r13b,r13b
      cc394e:	45 0f 45 c4          	cmovne r8d,r12d
      cc3952:	49 89 c4             	mov    r12,rax
      cc3955:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      cc395c:	00 
      cc395d:	c6 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],0x1
      cc3964:	01 
      cc3965:	b8 60 01 00 00       	mov    eax,0x160
      cc396a:	48 03 45 00          	add    rax,QWORD PTR [rbp+0x0]
      cc396e:	49 8b 4f 30          	mov    rcx,QWORD PTR [r15+0x30]
      cc3972:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
      cc3977:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]

### caller 0xcc3f1a FDE=(13384674, 13387367)
      cc3edd:	48 8b 57 d0          	mov    rdx,QWORD PTR [rdi-0x30]
      cc3ee1:	f6 c2 01             	test   dl,0x1
      cc3ee4:	0f 85 8d 06 00 00    	jne    cc4577 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211517>
      cc3eea:	48 89 de             	mov    rsi,rbx
      cc3eed:	e8 a0 18 aa 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      cc3ef2:	49 8b be 90 06 00 00 	mov    rdi,QWORD PTR [r14+0x690]
      cc3ef9:	31 c0                	xor    eax,eax
      cc3efb:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
      cc3f02:	00 
      cc3f03:	88 02                	mov    BYTE PTR [rdx],al
      cc3f05:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cc3f08:	48 8d 8c 24 f0 00 00 	lea    rcx,[rsp+0xf0]
      cc3f0f:	00 
      cc3f10:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cc3f15:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
      cc3f1a:	e8 03 0f 96 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc3f1f:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      cc3f26:	00 
      cc3f27:	e8 3e 60 db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc3f2c:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      cc3f33:	00 
      cc3f34:	e8 f7 2d de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc3f39:	85 ed                	test   ebp,ebp
      cc3f3b:	74 51                	je     cc3f8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210f2e>
      cc3f3d:	48 89 df             	mov    rdi,rbx
      cc3f40:	e8 f1 78 db ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      cc3f45:	48 89 d1             	mov    rcx,rdx
      cc3f48:	48 8d 3d 34 19 66 ff 	lea    rdi,[rip+0xffffffffff661934]        # 325883 <_ZTSSt12bad_any_cast@@Base-0x6a945>
      cc3f4f:	6a 06                	push   0x6
      cc3f51:	5e                   	pop    rsi
      cc3f52:	48 89 c2             	mov    rdx,rax
      cc3f55:	e8 26 79 db ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
      cc3f5a:	84 c0                	test   al,al
      cc3f5c:	74 34                	je     cc3f92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210f32>
      cc3f5e:	49 8b be 30 06 00 00 	mov    rdi,QWORD PTR [r14+0x630]
      cc3f65:	48 85 ff             	test   rdi,rdi
      cc3f68:	74 2c                	je     cc3f96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210f36>
      cc3f6a:	e8 4f 9b 02 00       	call   cedabe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23aa5e>
      cc3f6f:	48 85 c0             	test   rax,rax
      cc3f72:	74 22                	je     cc3f96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210f36>

### caller 0xcc49a4 FDE=(13387368, 13388448)
      cc4962:	0f 85 b5 00 00 00    	jne    cc4a1d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2119bd>
      cc4968:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      cc496d:	e8 74 0e aa 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      cc4972:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
      cc4977:	4c 89 ff             	mov    rdi,r15
      cc497a:	e8 11 95 b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc497f:	49 8b be 90 06 00 00 	mov    rdi,QWORD PTR [r14+0x690]
      cc4986:	31 c0                	xor    eax,eax
      cc4988:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
      cc498d:	88 02                	mov    BYTE PTR [rdx],al
      cc498f:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cc4992:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      cc4997:	48 8d b4 24 98 00 00 	lea    rsi,[rsp+0x98]
      cc499e:	00 
      cc499f:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      cc49a4:	e8 79 04 96 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc49a9:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      cc49ae:	e8 b7 55 db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc49b3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cc49b8:	e8 73 23 de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc49bd:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      cc49c4:	00 
      cc49c5:	e8 1c 7b e1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      cc49ca:	48 85 db             	test   rbx,rbx
      cc49cd:	0f 95 c0             	setne  al
      cc49d0:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      cc49d7:	00 00 
      cc49d9:	48 3b 8c 24 10 01 00 	cmp    rcx,QWORD PTR [rsp+0x110]
      cc49e0:	00 
      cc49e1:	0f 85 b4 00 00 00    	jne    cc4a9b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a3b>
      cc49e7:	48 81 c4 18 01 00 00 	add    rsp,0x118
      cc49ee:	5b                   	pop    rbx
      cc49ef:	41 5c                	pop    r12
      cc49f1:	41 5d                	pop    r13
      cc49f3:	41 5e                	pop    r14
      cc49f5:	41 5f                	pop    r15
      cc49f7:	5d                   	pop    rbp
      cc49f8:	c3                   	ret
      cc49f9:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cc49fd:	48 8b 12             	mov    rdx,QWORD PTR [rdx]

### caller 0xcc4d77 FDE=(13388818, 13389388)
      cc4d34:	e8 ad 0a aa 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      cc4d39:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
      cc4d3e:	4c 89 ef             	mov    rdi,r13
      cc4d41:	e8 4a 91 b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc4d46:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      cc4d4b:	44 89 66 48          	mov    DWORD PTR [rsi+0x48],r12d
      cc4d4f:	44 89 7e 5c          	mov    DWORD PTR [rsi+0x5c],r15d
      cc4d53:	81 4e 10 40 08 00 00 	or     DWORD PTR [rsi+0x10],0x840
      cc4d5a:	49 8b be 90 06 00 00 	mov    rdi,QWORD PTR [r14+0x690]
      cc4d61:	31 c0                	xor    eax,eax
      cc4d63:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      cc4d68:	88 02                	mov    BYTE PTR [rdx],al
      cc4d6a:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cc4d6d:	49 83 65 20 00       	and    QWORD PTR [r13+0x20],0x0
      cc4d72:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
      cc4d77:	e8 a6 00 96 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc4d7c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cc4d81:	e8 e4 51 db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc4d86:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      cc4d8b:	e8 a0 1f de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc4d90:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      cc4d95:	e8 4c 77 e1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      cc4d9a:	eb 1c                	jmp    cc4db8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211d58>
      cc4d9c:	48 8d 54 24 78       	lea    rdx,[rsp+0x78]
      cc4da1:	4c 89 22             	mov    QWORD PTR [rdx],r12
      cc4da4:	48 c7 42 08 e8 03 00 	mov    QWORD PTR [rdx+0x8],0x3e8
      cc4dab:	00 
      cc4dac:	4c 89 f7             	mov    rdi,r14
      cc4daf:	89 ee                	mov    esi,ebp
      cc4db1:	e8 a0 0b 00 00       	call   cc5956 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2128f6>
      cc4db6:	89 c3                	mov    ebx,eax
      cc4db8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4dbf:	00 00 
      cc4dc1:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
      cc4dc8:	00 
      cc4dc9:	75 7c                	jne    cc4e47 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211de7>
      cc4dcb:	89 d8                	mov    eax,ebx
      cc4dcd:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
      cc4dd4:	5b                   	pop    rbx
      cc4dd5:	41 5c                	pop    r12

### caller 0xcc5238 FDE=(13389788, 13390625)
      cc51f5:	e8 ec 05 aa 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      cc51fa:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      cc51ff:	4c 89 ff             	mov    rdi,r15
      cc5202:	e8 89 8c b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc5207:	f2 48 0f 2c 44 24 08 	cvttsd2si rax,QWORD PTR [rsp+0x8]
      cc520e:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      cc5213:	48 89 46 50          	mov    QWORD PTR [rsi+0x50],rax
      cc5217:	80 4e 11 01          	or     BYTE PTR [rsi+0x11],0x1
      cc521b:	49 8b be 90 06 00 00 	mov    rdi,QWORD PTR [r14+0x690]
      cc5222:	31 c0                	xor    eax,eax
      cc5224:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      cc5229:	88 02                	mov    BYTE PTR [rdx],al
      cc522b:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cc522e:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      cc5233:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
      cc5238:	e8 e5 fb 95 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc523d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cc5242:	e8 23 4d db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc5247:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      cc524c:	e8 df 1a de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc5251:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      cc5256:	e8 8b 72 e1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      cc525b:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
      cc5262:	00 
      cc5263:	e8 7e 4e ec ff       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
      cc5268:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc526f:	00 00 
      cc5271:	48 3b 84 24 38 03 00 	cmp    rax,QWORD PTR [rsp+0x338]
      cc5278:	00 
      cc5279:	0f 85 9d 00 00 00    	jne    cc531c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2122bc>
      cc527f:	89 d8                	mov    eax,ebx
      cc5281:	48 81 c4 40 03 00 00 	add    rsp,0x340
      cc5288:	5b                   	pop    rbx
      cc5289:	41 5c                	pop    r12
      cc528b:	41 5e                	pop    r14
      cc528d:	41 5f                	pop    r15
      cc528f:	5d                   	pop    rbp
      cc5290:	c3                   	ret
      cc5291:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cc5295:	48 8b 12             	mov    rdx,QWORD PTR [rdx]

### caller 0xcc54e7 FDE=(13390626, 13391260)
      cc54a4:	e8 3d 03 aa 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      cc54a9:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      cc54ae:	4c 89 ff             	mov    rdi,r15
      cc54b1:	e8 da 89 b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc54b6:	f2 48 0f 2c 44 24 08 	cvttsd2si rax,QWORD PTR [rsp+0x8]
      cc54bd:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      cc54c2:	48 89 46 50          	mov    QWORD PTR [rsi+0x50],rax
      cc54c6:	80 4e 11 01          	or     BYTE PTR [rsi+0x11],0x1
      cc54ca:	49 8b be 90 06 00 00 	mov    rdi,QWORD PTR [r14+0x690]
      cc54d1:	31 c0                	xor    eax,eax
      cc54d3:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      cc54d8:	88 02                	mov    BYTE PTR [rdx],al
      cc54da:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cc54dd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      cc54e2:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
      cc54e7:	e8 36 f9 95 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc54ec:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cc54f1:	e8 74 4a db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc54f6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      cc54fb:	e8 30 18 de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc5500:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      cc5505:	e8 dc 6f e1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      cc550a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc5511:	00 00 
      cc5513:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
      cc551a:	00 
      cc551b:	75 7a                	jne    cc5597 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212537>
      cc551d:	89 d8                	mov    eax,ebx
      cc551f:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
      cc5526:	5b                   	pop    rbx
      cc5527:	41 5e                	pop    r14
      cc5529:	41 5f                	pop    r15
      cc552b:	5d                   	pop    rbp
      cc552c:	c3                   	ret
      cc552d:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cc5531:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      cc5534:	e9 1d ff ff ff       	jmp    cc5456 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2123f6>
      cc5539:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cc553d:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      cc5540:	e9 5a ff ff ff       	jmp    cc549f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21243f>

### caller 0xcc5c64 FDE=(13392214, 13393490)
      cc5c23:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
      cc5c28:	4c 89 ff             	mov    rdi,r15
      cc5c2b:	e8 60 82 b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc5c30:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
      cc5c37:	00 
      cc5c38:	44 89 6e 48          	mov    DWORD PTR [rsi+0x48],r13d
      cc5c3c:	83 4e 5c ff          	or     DWORD PTR [rsi+0x5c],0xffffffff
      cc5c40:	81 4e 10 40 08 00 00 	or     DWORD PTR [rsi+0x10],0x840
      cc5c47:	49 8b be 90 06 00 00 	mov    rdi,QWORD PTR [r14+0x690]
      cc5c4e:	31 c0                	xor    eax,eax
      cc5c50:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      cc5c55:	88 02                	mov    BYTE PTR [rdx],al
      cc5c57:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cc5c5a:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      cc5c5f:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      cc5c64:	e8 b9 f1 95 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc5c69:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      cc5c6e:	e8 f7 42 db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc5c73:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      cc5c78:	e8 b3 10 de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc5c7d:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      cc5c84:	00 
      cc5c85:	e8 5c 68 e1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      cc5c8a:	6a 01                	push   0x1
      cc5c8c:	41 5f                	pop    r15
      cc5c8e:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc5c95:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5c98:	6a 01                	push   0x1
      cc5c9a:	41 58                	pop    r8
      cc5c9c:	4c 89 e6             	mov    rsi,r12
      cc5c9f:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]
      cc5ca3:	31 c9                	xor    ecx,ecx
      cc5ca5:	45 89 f9             	mov    r9d,r15d
      cc5ca8:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      cc5cae:	49 8b be 30 06 00 00 	mov    rdi,QWORD PTR [r14+0x630]
      cc5cb5:	48 85 ff             	test   rdi,rdi
      cc5cb8:	74 05                	je     cc5cbf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212c5f>
      cc5cba:	e8 c9 7b 02 00       	call   ced888 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a828>
      cc5cbf:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
      cc5cc6:	00 

### caller 0xcc5d6f FDE=(13392214, 13393490)
      cc5d2f:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
      cc5d34:	4c 89 ff             	mov    rdi,r15
      cc5d37:	e8 54 81 b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc5d3c:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
      cc5d43:	00 
      cc5d44:	89 6e 48             	mov    DWORD PTR [rsi+0x48],ebp
      cc5d47:	83 4e 5c ff          	or     DWORD PTR [rsi+0x5c],0xffffffff
      cc5d4b:	81 4e 10 40 08 00 00 	or     DWORD PTR [rsi+0x10],0x840
      cc5d52:	49 8b be 90 06 00 00 	mov    rdi,QWORD PTR [r14+0x690]
      cc5d59:	31 c0                	xor    eax,eax
      cc5d5b:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      cc5d60:	88 02                	mov    BYTE PTR [rdx],al
      cc5d62:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cc5d65:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      cc5d6a:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      cc5d6f:	e8 ae f0 95 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cc5d74:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      cc5d79:	e8 ec 41 db ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cc5d7e:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      cc5d83:	e8 a8 0f de ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cc5d88:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      cc5d8f:	00 
      cc5d90:	e8 51 67 e1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      cc5d95:	48 85 db             	test   rbx,rbx
      cc5d98:	0f 95 c0             	setne  al
      cc5d9b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      cc5da2:	00 00 
      cc5da4:	48 3b 8c 24 20 01 00 	cmp    rcx,QWORD PTR [rsp+0x120]
      cc5dab:	00 
      cc5dac:	0f 85 9b 00 00 00    	jne    cc5e4d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212ded>
      cc5db2:	48 81 c4 28 01 00 00 	add    rsp,0x128
      cc5db9:	5b                   	pop    rbx
      cc5dba:	41 5c                	pop    r12
      cc5dbc:	41 5d                	pop    r13
      cc5dbe:	41 5e                	pop    r14
      cc5dc0:	41 5f                	pop    r15
      cc5dc2:	5d                   	pop    rbp
      cc5dc3:	c3                   	ret
      cc5dc4:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cc5dc8:	48 8b 12             	mov    rdx,QWORD PTR [rdx]

### caller 0xcd38d7 FDE=(13449148, 13449644)
      cd3897:	e8 f6 1e a9 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      cd389c:	41 0f 10 46 60       	movups xmm0,XMMWORD PTR [r14+0x60]
      cd38a1:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      cd38a6:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
      cd38aa:	41 0f 10 46 70       	movups xmm0,XMMWORD PTR [r14+0x70]
      cd38af:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
      cd38b3:	81 4e 10 f0 00 00 00 	or     DWORD PTR [rsi+0x10],0xf0
      cd38ba:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
      cd38be:	31 c0                	xor    eax,eax
      cd38c0:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      cd38c5:	88 02                	mov    BYTE PTR [rdx],al
      cd38c7:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cd38ca:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
      cd38d1:	00 
      cd38d2:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cd38d7:	e8 46 15 95 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cd38dc:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cd38e3:	00 
      cd38e4:	e8 81 66 da ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cd38e9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      cd38ee:	e8 3d 34 dd ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cd38f3:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      cd38f8:	e8 23 d1 de ff       	call   ac0a20 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9c0>
      cd38fd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cd3904:	00 00 
      cd3906:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
      cd390d:	00 
      cd390e:	0f 85 93 00 00 00    	jne    cd39a7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x220947>
      cd3914:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
      cd391b:	5b                   	pop    rbx
      cd391c:	41 5e                	pop    r14
      cd391e:	c3                   	ret
      cd391f:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cd3923:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      cd3926:	e9 fb fe ff ff       	jmp    cd3826 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2207c6>
      cd392b:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cd392f:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      cd3932:	e9 1f ff ff ff       	jmp    cd3856 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2207f6>
      cd3937:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cd393b:	48 8b 12             	mov    rdx,QWORD PTR [rdx]

### caller 0xcdd608 FDE=(13489032, 13489945)
      cdd5c4:	0f 85 ec 00 00 00    	jne    cdd6b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22a656>
      cdd5ca:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      cdd5d1:	00 
      cdd5d2:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      cdd5d7:	e8 0a 82 a8 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      cdd5dc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cdd5e1:	e8 aa 08 b1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cdd5e6:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
      cdd5ed:	31 c0                	xor    eax,eax
      cdd5ef:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      cdd5f4:	88 02                	mov    BYTE PTR [rdx],al
      cdd5f6:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cdd5f9:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
      cdd5fe:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cdd603:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      cdd608:	e8 15 78 94 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cdd60d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cdd612:	e8 53 c9 d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cdd617:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      cdd61c:	e8 0f 97 dc ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cdd621:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      cdd626:	e8 f5 33 de ff       	call   ac0a20 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9c0>
      cdd62b:	48 8d b3 40 20 00 00 	lea    rsi,[rbx+0x2040]
      cdd632:	48 8d bb f0 1e 00 00 	lea    rdi,[rbx+0x1ef0]
      cdd639:	e8 22 14 a7 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
      cdd63e:	48 8d b3 88 20 00 00 	lea    rsi,[rbx+0x2088]
      cdd645:	48 8d bb 38 1f 00 00 	lea    rdi,[rbx+0x1f38]
      cdd64c:	e8 2f 0a b1 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cdd651:	48 8b 83 a0 20 00 00 	mov    rax,QWORD PTR [rbx+0x20a0]
      cdd658:	48 89 83 50 1f 00 00 	mov    QWORD PTR [rbx+0x1f50],rax
      cdd65f:	83 bb 38 20 00 00 02 	cmp    DWORD PTR [rbx+0x2038],0x2
      cdd666:	0f 94 83 28 24 00 00 	sete   BYTE PTR [rbx+0x2428]
      cdd66d:	6a 01                	push   0x1
      cdd66f:	5e                   	pop    rsi
      cdd670:	48 89 df             	mov    rdi,rbx
      cdd673:	e8 22 f8 ff ff       	call   cdce9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x229e3a>
      cdd678:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cdd67f:	00 00 
      cdd681:	48 3b 84 24 70 01 00 	cmp    rax,QWORD PTR [rsp+0x170]
      cdd688:	00 

### caller 0xcdf8e0 FDE=(13498112, 13498807)
      cdf8a1:	49 63 84 24 1c 01 00 	movsxd rax,DWORD PTR [r12+0x11c]
      cdf8a8:	00 
      cdf8a9:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      cdf8ad:	41 83 bf 80 00 00 00 	cmp    DWORD PTR [r15+0x80],0x4
      cdf8b4:	04 
      cdf8b5:	0f 94 43 61          	sete   BYTE PTR [rbx+0x61]
      cdf8b9:	81 4b 10 a0 04 00 00 	or     DWORD PTR [rbx+0x10],0x4a0
      cdf8c0:	49 8b be 10 01 00 00 	mov    rdi,QWORD PTR [r14+0x110]
      cdf8c7:	31 c0                	xor    eax,eax
      cdf8c9:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
      cdf8ce:	88 02                	mov    BYTE PTR [rdx],al
      cdf8d0:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cdf8d3:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      cdf8d8:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cdf8dd:	48 89 de             	mov    rsi,rbx
      cdf8e0:	e8 3d 55 94 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cdf8e5:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      cdf8ea:	e8 7b a6 d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cdf8ef:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cdf8f4:	e8 37 74 dc ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cdf8f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cdf900:	00 00 
      cdf902:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      cdf909:	00 
      cdf90a:	0f 85 a2 00 00 00    	jne    cdf9b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c952>
      cdf910:	48 81 c4 88 00 00 00 	add    rsp,0x88
      cdf917:	5b                   	pop    rbx
      cdf918:	41 5c                	pop    r12
      cdf91a:	41 5d                	pop    r13
      cdf91c:	41 5e                	pop    r14
      cdf91e:	41 5f                	pop    r15
      cdf920:	5d                   	pop    rbp
      cdf921:	c3                   	ret
      cdf922:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cdf926:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      cdf929:	e9 47 fe ff ff       	jmp    cdf775 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c715>
      cdf92e:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      cdf932:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      cdf935:	e9 75 fe ff ff       	jmp    cdf7af <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c74f>
      cdf93a:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe

### caller 0xcdfbe8 FDE=(13499176, 13499532)
      cdfba6:	0f 84 86 00 00 00    	je     cdfc32 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22cbd2>
      cdfbac:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      cdfbb1:	e8 da e2 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cdfbb6:	49 8d b6 80 01 00 00 	lea    rsi,[r14+0x180]
      cdfbbd:	41 c6 86 e0 01 00 00 	mov    BYTE PTR [r14+0x1e0],0x1
      cdfbc4:	01 
      cdfbc5:	41 80 8e 91 01 00 00 	or     BYTE PTR [r14+0x191],0x2
      cdfbcc:	02 
      cdfbcd:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
      cdfbd4:	31 c0                	xor    eax,eax
      cdfbd6:	48 89 e2             	mov    rdx,rsp
      cdfbd9:	88 02                	mov    BYTE PTR [rdx],al
      cdfbdb:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cdfbde:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      cdfbe3:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cdfbe8:	e8 35 52 94 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cdfbed:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      cdfbf2:	e8 73 a3 d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cdfbf7:	48 89 e7             	mov    rdi,rsp
      cdfbfa:	e8 31 71 dc ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cdfbff:	49 83 c6 08          	add    r14,0x8
      cdfc03:	48 83 bb 90 0e 00 00 	cmp    QWORD PTR [rbx+0xe90],0x0
      cdfc0a:	00 
      cdfc0b:	74 11                	je     cdfc1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22cbbe>
      cdfc0d:	48 83 c3 48          	add    rbx,0x48
      cdfc11:	48 89 df             	mov    rdi,rbx
      cdfc14:	4c 89 f6             	mov    rsi,r14
      cdfc17:	e8 6c 05 00 00       	call   ce0188 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22d128>
      cdfc1c:	eb 47                	jmp    cdfc65 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22cc05>
      cdfc1e:	48 81 c3 a0 0e 00 00 	add    rbx,0xea0
      cdfc25:	48 89 df             	mov    rdi,rbx
      cdfc28:	4c 89 f6             	mov    rsi,r14
      cdfc2b:	e8 38 6e fe ff       	call   cc6a68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213a08>
      cdfc30:	eb 33                	jmp    cdfc65 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22cc05>
      cdfc32:	0f 57 c0             	xorps  xmm0,xmm0
      cdfc35:	48 89 e1             	mov    rcx,rsp
      cdfc38:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
      cdfc3b:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
      cdfc40:	6a 01                	push   0x1
      cdfc42:	5e                   	pop    rsi

### caller 0xce1241 FDE=(13504212, 13505725)
      ce1205:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
      ce120c:	00 
      ce120d:	4c 89 e7             	mov    rdi,r12
      ce1210:	e8 7b cc b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ce1215:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
      ce121c:	31 c0                	xor    eax,eax
      ce121e:	48 8d 94 24 00 01 00 	lea    rdx,[rsp+0x100]
      ce1225:	00 
      ce1226:	88 02                	mov    BYTE PTR [rdx],al
      ce1228:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      ce122b:	49 83 64 24 20 00    	and    QWORD PTR [r12+0x20],0x0
      ce1231:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
      ce1238:	00 
      ce1239:	48 8d 8c 24 30 01 00 	lea    rcx,[rsp+0x130]
      ce1240:	00 
      ce1241:	e8 dc 3b 94 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      ce1246:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      ce124d:	00 
      ce124e:	e8 17 8d d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ce1253:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      ce125a:	00 
      ce125b:	e8 d0 5a dc ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      ce1260:	4c 8d a3 d0 12 00 00 	lea    r12,[rbx+0x12d0]
      ce1267:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
      ce126e:	00 
      ce126f:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
      ce1273:	e8 be a5 d9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ce1278:	49 89 c5             	mov    r13,rax
      ce127b:	49 89 d6             	mov    r14,rdx
      ce127e:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
      ce1285:	00 
      ce1286:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
      ce128a:	e8 a7 a5 d9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ce128f:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      ce1294:	48 89 54 24 20       	mov    QWORD PTR [rsp+0x20],rdx
      ce1299:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      ce129e:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      ce12a3:	89 ac 24 9c 00 00 00 	mov    DWORD PTR [rsp+0x9c],ebp
      ce12aa:	44 89 bc 24 98 00 00 	mov    DWORD PTR [rsp+0x98],r15d
      ce12b1:	00 

### caller 0xce2071 FDE=(13507826, 13509379)
      ce2032:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
      ce2039:	00 
      ce203a:	e8 a7 37 a8 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      ce203f:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      ce2046:	00 
      ce2047:	e8 44 be b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ce204c:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
      ce2053:	31 c0                	xor    eax,eax
      ce2055:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
      ce205a:	88 02                	mov    BYTE PTR [rdx],al
      ce205c:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      ce205f:	48 8d 8c 24 d0 00 00 	lea    rcx,[rsp+0xd0]
      ce2066:	00 
      ce2067:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      ce206c:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
      ce2071:	e8 ac 2d 94 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      ce2076:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      ce207d:	00 
      ce207e:	e8 e7 7e d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ce2083:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ce2088:	e8 a3 4c dc ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      ce208d:	48 8d bb c8 11 00 00 	lea    rdi,[rbx+0x11c8]
      ce2094:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
      ce209b:	00 
      ce209c:	e8 19 74 fe ff       	call   cc94ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21645a>
      ce20a1:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      ce20a8:	00 
      ce20a9:	e8 38 80 ea ff       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
      ce20ae:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      ce20b3:	e8 f0 02 67 00       	call   13523a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19792c>
      ce20b8:	48 81 bb 18 21 00 00 	cmp    QWORD PTR [rbx+0x2118],0x1388
      ce20bf:	88 13 00 00 
      ce20c3:	0f 8c ef 00 00 00    	jl     ce21b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22f158>
      ce20c9:	48 8d bb 68 13 00 00 	lea    rdi,[rbx+0x1368]
      ce20d0:	4c 89 f6             	mov    rsi,r14
      ce20d3:	e8 84 02 00 00       	call   ce235c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22f2fc>
      ce20d8:	48 c7 c1 78 ec ff ff 	mov    rcx,0xffffffffffffec78
      ce20df:	48 03 8b 18 21 00 00 	add    rcx,QWORD PTR [rbx+0x2118]
      ce20e6:	48 8d 05 2b fb 76 ff 	lea    rax,[rip+0xffffffffff76fb2b]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      ce20ed:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]

### caller 0xce417a FDE=(13516206, 13517405)
      ce413e:	48 8b 84 24 00 01 00 	mov    rax,QWORD PTR [rsp+0x100]
      ce4145:	00 
      ce4146:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
      ce414d:	00 
      ce414e:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
      ce4152:	80 4e 10 02          	or     BYTE PTR [rsi+0x10],0x2
      ce4156:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      ce415a:	48 8b b8 10 01 00 00 	mov    rdi,QWORD PTR [rax+0x110]
      ce4161:	31 c0                	xor    eax,eax
      ce4163:	48 8d 54 24 70       	lea    rdx,[rsp+0x70]
      ce4168:	88 02                	mov    BYTE PTR [rdx],al
      ce416a:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      ce416d:	48 8d 8c 24 c0 00 00 	lea    rcx,[rsp+0xc0]
      ce4174:	00 
      ce4175:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      ce417a:	e8 a3 0c 94 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      ce417f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      ce4186:	00 
      ce4187:	e8 de 5d d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ce418c:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      ce4191:	e8 9a 2b dc ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      ce4196:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      ce419d:	00 
      ce419e:	e8 43 5f ea ff       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
      ce41a3:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      ce41aa:	00 
      ce41ab:	e8 5e 69 dc ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      ce41b0:	e9 db fd ff ff       	jmp    ce3f90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x230f30>
      ce41b5:	48 89 c3             	mov    rbx,rax
      ce41b8:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      ce41bf:	00 
      ce41c0:	e8 fd 72 f6 ff       	call   c4b4c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x198462>
      ce41c5:	4c 89 ef             	mov    rdi,r13
      ce41c8:	e8 c3 9c b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ce41cd:	eb 52                	jmp    ce4221 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2311c1>
      ce41cf:	eb 4d                	jmp    ce421e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2311be>
      ce41d1:	48 89 c3             	mov    rbx,rax
      ce41d4:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      ce41db:	00 
      ce41dc:	e8 89 5d d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### caller 0xce6102 FDE=(13522720, 13526524)
      ce60c5:	81 c9 00 00 30 00    	or     ecx,0x300000
      ce60cb:	66 0f 76 c0          	pcmpeqd xmm0,xmm0
      ce60cf:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      ce60d4:	f3 0f 7f 86 b8 00 00 	movdqu XMMWORD PTR [rsi+0xb8],xmm0
      ce60db:	00 
      ce60dc:	89 4e 10             	mov    DWORD PTR [rsi+0x10],ecx
      ce60df:	49 8b be 10 01 00 00 	mov    rdi,QWORD PTR [r14+0x110]
      ce60e6:	31 c0                	xor    eax,eax
      ce60e8:	48 8d 94 24 d0 03 00 	lea    rdx,[rsp+0x3d0]
      ce60ef:	00 
      ce60f0:	88 02                	mov    BYTE PTR [rdx],al
      ce60f2:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      ce60f5:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
      ce60fc:	00 
      ce60fd:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      ce6102:	e8 1b ed 93 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      ce6107:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
      ce610e:	00 
      ce610f:	e8 56 3e d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ce6114:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
      ce611b:	00 
      ce611c:	e8 0f 0c dc ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      ce6121:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ce6126:	e8 51 57 77 00       	call   145b87c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a0e00>
      ce612b:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ce6130:	e8 51 83 db ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ce6135:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      ce613c:	00 
      ce613d:	e8 32 8b ff ff       	call   cdec74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22bc14>
      ce6142:	41 80 be 10 03 00 00 	cmp    BYTE PTR [r14+0x310],0x0
      ce6149:	00 
      ce614a:	0f 85 9d 02 00 00    	jne    ce63ed <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23338d>
      ce6150:	49 8b be 50 14 00 00 	mov    rdi,QWORD PTR [r14+0x1450]
      ce6157:	48 85 ff             	test   rdi,rdi
      ce615a:	75 46                	jne    ce61a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x233142>
      ce615c:	49 8b b6 10 01 00 00 	mov    rsi,QWORD PTR [r14+0x110]
      ce6163:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      ce6168:	e8 b6 23 00 00       	call   ce8523 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2354c3>
      ce616d:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      ce6172:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0

### caller 0xce793b FDE=(13530976, 13531719)
      ce78fd:	83 bc 24 48 01 00 00 	cmp    DWORD PTR [rsp+0x148],0x4
      ce7904:	04 
      ce7905:	48 89 46 40          	mov    QWORD PTR [rsi+0x40],rax
      ce7909:	0f 94 46 58          	sete   BYTE PTR [rsi+0x58]
      ce790d:	48 63 c5             	movsxd rax,ebp
      ce7910:	48 89 46 50          	mov    QWORD PTR [rsi+0x50],rax
      ce7914:	81 4e 10 e0 01 00 00 	or     DWORD PTR [rsi+0x10],0x1e0
      ce791b:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
      ce7922:	31 c0                	xor    eax,eax
      ce7924:	48 8d 94 24 90 00 00 	lea    rdx,[rsp+0x90]
      ce792b:	00 
      ce792c:	88 02                	mov    BYTE PTR [rdx],al
      ce792e:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      ce7931:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      ce7936:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      ce793b:	e8 e2 d4 93 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      ce7940:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      ce7945:	e8 20 26 d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ce794a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      ce7951:	00 
      ce7952:	e8 d9 f3 db ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      ce7957:	48 89 e7             	mov    rdi,rsp
      ce795a:	e8 51 91 dd ff       	call   ac0ab0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda50>
      ce795f:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      ce7966:	00 
      ce7967:	e8 4c 80 ff ff       	call   cdf9b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c958>
      ce796c:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      ce7973:	00 
      ce7974:	e8 6d 27 ea ff       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
      ce7979:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ce7980:	00 00 
      ce7982:	48 3b 84 24 b0 02 00 	cmp    rax,QWORD PTR [rsp+0x2b0]
      ce7989:	00 
      ce798a:	0f 85 b2 00 00 00    	jne    ce7a42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2349e2>
      ce7990:	48 81 c4 b8 02 00 00 	add    rsp,0x2b8
      ce7997:	5b                   	pop    rbx
      ce7998:	41 5e                	pop    r14
      ce799a:	41 5f                	pop    r15
      ce799c:	5d                   	pop    rbp
      ce799d:	c3                   	ret

### caller 0xce7b04 FDE=(13531720, 13532057)
      ce7ac5:	4c 89 e7             	mov    rdi,r12
      ce7ac8:	e8 c3 63 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ce7acd:	49 69 c7 e8 03 00 00 	imul   rax,r15,0x3e8
      ce7ad4:	48 99                	cqo
      ce7ad6:	48 f7 fb             	idiv   rbx
      ce7ad9:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      ce7ade:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
      ce7ae2:	80 4e 10 02          	or     BYTE PTR [rsi+0x10],0x2
      ce7ae6:	49 8b be 10 01 00 00 	mov    rdi,QWORD PTR [r14+0x110]
      ce7aed:	31 c0                	xor    eax,eax
      ce7aef:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      ce7af4:	88 02                	mov    BYTE PTR [rdx],al
      ce7af6:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      ce7af9:	49 83 64 24 20 00    	and    QWORD PTR [r12+0x20],0x0
      ce7aff:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      ce7b04:	e8 19 d3 93 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      ce7b09:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ce7b0e:	e8 57 24 d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ce7b13:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ce7b18:	e8 13 f2 db ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      ce7b1d:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      ce7b22:	e8 e7 2f dc ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      ce7b27:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ce7b2e:	00 00 
      ce7b30:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      ce7b37:	00 
      ce7b38:	75 5a                	jne    ce7b94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x234b34>
      ce7b3a:	48 81 c4 88 00 00 00 	add    rsp,0x88
      ce7b41:	5b                   	pop    rbx
      ce7b42:	41 5c                	pop    r12
      ce7b44:	41 5e                	pop    r14
      ce7b46:	41 5f                	pop    r15
      ce7b48:	c3                   	ret
      ce7b49:	48 89 c3             	mov    rbx,rax
      ce7b4c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ce7b51:	e8 14 24 d9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ce7b56:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ce7b5b:	e8 d0 f1 db ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      ce7b60:	eb 0d                	jmp    ce7b6f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x234b0f>
      ce7b62:	48 89 c3             	mov    rbx,rax

### caller 0xcedbc3 FDE=(13556616, 13556745)
      cedb89:	48 83 ec 60          	sub    rsp,0x60
      cedb8d:	48 89 fb             	mov    rbx,rdi
      cedb90:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cedb97:	00 00 
      cedb99:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      cedb9e:	80 bf 98 00 00 00 00 	cmp    BYTE PTR [rdi+0x98],0x0
      cedba5:	74 33                	je     cedbda <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23ab7a>
      cedba7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      cedbab:	48 8d 73 10          	lea    rsi,[rbx+0x10]
      cedbaf:	31 c0                	xor    eax,eax
      cedbb1:	48 89 e2             	mov    rdx,rsp
      cedbb4:	88 02                	mov    BYTE PTR [rdx],al
      cedbb6:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      cedbb9:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      cedbbe:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      cedbc3:	e8 5a 72 93 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      cedbc8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      cedbcd:	e8 98 c3 d8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      cedbd2:	48 89 e7             	mov    rdi,rsp
      cedbd5:	e8 56 91 db ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      cedbda:	48 83 c3 10          	add    rbx,0x10
      cedbde:	48 89 df             	mov    rdi,rbx
      cedbe1:	e8 18 18 96 00       	call   164f3fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356a>
      cedbe6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cedbed:	00 00 
      cedbef:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      cedbf4:	75 06                	jne    cedbfc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23ab9c>
      cedbf6:	48 83 c4 60          	add    rsp,0x60
      cedbfa:	5b                   	pop    rbx
      cedbfb:	c3                   	ret
      cedbfc:	e8 af 1e b0 00       	call   17efab0 <__stack_chk_fail@plt>
      cedc01:	48 89 c7             	mov    rdi,rax
      cedc04:	e8 9c be d8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      cedc09:	cc                   	int3
      cedc0a:	53                   	push   rbx
      cedc0b:	48 89 fb             	mov    rbx,rdi
      cedc0e:	e8 75 ff ff ff       	call   cedb88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23ab28>
      cedc13:	48 89 df             	mov    rdi,rbx
      cedc16:	5b                   	pop    rbx
      cedc17:	e9 04 03 b0 00       	jmp    17edf20 <_ZdlPv@plt>

### caller 0xd1640d FDE=(13722464, 13722777)
      d163d3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d163d8:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
      d163dc:	48 8b 57 e8          	mov    rdx,QWORD PTR [rdi-0x18]
      d163e0:	f6 c2 01             	test   dl,0x1
      d163e3:	75 67                	jne    d1644c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2633ec>
      d163e5:	48 89 de             	mov    rsi,rbx
      d163e8:	e8 a5 f3 a4 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d163ed:	49 8b be a0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1a0]
      d163f4:	31 c0                	xor    eax,eax
      d163f6:	48 89 e2             	mov    rdx,rsp
      d163f9:	88 02                	mov    BYTE PTR [rdx],al
      d163fb:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d163fe:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      d16403:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d16408:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      d1640d:	e8 10 ea 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d16412:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d16417:	e8 4e 3b d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d1641c:	48 89 e7             	mov    rdi,rsp
      d1641f:	e8 0c 09 d9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d16424:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d16429:	e8 b6 85 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d1642e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d16435:	00 00 
      d16437:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      d1643e:	00 
      d1643f:	75 53                	jne    d16494 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263434>
      d16441:	48 81 c4 88 00 00 00 	add    rsp,0x88
      d16448:	5b                   	pop    rbx
      d16449:	41 5e                	pop    r14
      d1644b:	c3                   	ret
      d1644c:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d16450:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d16453:	eb 90                	jmp    d163e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263385>
      d16455:	48 89 c3             	mov    rbx,rax
      d16458:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d1645d:	e8 08 3b d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d16462:	48 89 e7             	mov    rdi,rsp
      d16465:	e8 c6 08 d9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d1646a:	eb 03                	jmp    d1646f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26340f>

### caller 0xd16a8d FDE=(13724132, 13724469)
      d16a4f:	48 8b 4f e8          	mov    rcx,QWORD PTR [rdi-0x18]
      d16a53:	f6 c1 01             	test   cl,0x1
      d16a56:	0f 85 85 00 00 00    	jne    d16ae1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263a81>
      d16a5c:	48 8d 35 cf f8 62 ff 	lea    rsi,[rip+0xffffffffff62f8cf]        # 346332 <_ZTSSt12bad_any_cast@@Base-0x49e96>
      d16a63:	6a 0c                	push   0xc
      d16a65:	5a                   	pop    rdx
      d16a66:	e8 f1 ec a4 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
      d16a6b:	49 8b be a0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1a0]
      d16a72:	31 c0                	xor    eax,eax
      d16a74:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      d16a79:	88 02                	mov    BYTE PTR [rdx],al
      d16a7b:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d16a7e:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      d16a83:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d16a88:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      d16a8d:	e8 90 e3 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d16a92:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d16a97:	e8 ce 34 d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d16a9c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d16aa1:	e8 8a 02 d9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d16aa6:	49 81 c6 c8 04 00 00 	add    r14,0x4c8
      d16aad:	4c 89 f7             	mov    rdi,r14
      d16ab0:	e8 f3 1f e1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d16ab5:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d16aba:	e8 25 7f da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d16abf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d16ac6:	00 00 
      d16ac8:	48 3b 84 24 88 00 00 	cmp    rax,QWORD PTR [rsp+0x88]
      d16acf:	00 
      d16ad0:	75 5e                	jne    d16b30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263ad0>
      d16ad2:	89 d8                	mov    eax,ebx
      d16ad4:	48 81 c4 90 00 00 00 	add    rsp,0x90
      d16adb:	5b                   	pop    rbx
      d16adc:	41 5e                	pop    r14
      d16ade:	41 5f                	pop    r15
      d16ae0:	c3                   	ret
      d16ae1:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe
      d16ae5:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      d16ae8:	e9 6f ff ff ff       	jmp    d16a5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2639fc>
      d16aed:	48 89 c3             	mov    rbx,rax

### caller 0xd17945 FDE=(13726914, 13728354)
      d17908:	f6 c1 01             	test   cl,0x1
      d1790b:	0f 85 a1 00 00 00    	jne    d179b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264952>
      d17911:	48 8d 35 95 55 65 ff 	lea    rsi,[rip+0xffffffffff655595]        # 36cead <_ZTSSt12bad_any_cast@@Base-0x2331b>
      d17918:	6a 0e                	push   0xe
      d1791a:	5a                   	pop    rdx
      d1791b:	e8 3c de a4 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
      d17920:	48 8b bb a0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a0]
      d17927:	31 c0                	xor    eax,eax
      d17929:	48 8d 54 24 48       	lea    rdx,[rsp+0x48]
      d1792e:	88 02                	mov    BYTE PTR [rdx],al
      d17930:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d17933:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
      d1793a:	00 
      d1793b:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d17940:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      d17945:	e8 d8 d4 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d1794a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      d17951:	00 
      d17952:	e8 13 26 d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d17957:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d1795c:	e8 cf f3 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d17961:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
      d17968:	e8 3b 11 e1 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      d1796d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      d17972:	e8 6d 70 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d17977:	48 89 df             	mov    rdi,rbx
      d1797a:	e8 21 e7 ff ff       	call   d160a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263040>
      d1797f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      d17984:	e8 07 65 ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d17989:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d17990:	00 00 
      d17992:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
      d17999:	00 
      d1799a:	0f 85 bd 00 00 00    	jne    d17a5d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2649fd>
      d179a0:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
      d179a7:	5b                   	pop    rbx
      d179a8:	41 5c                	pop    r12
      d179aa:	41 5d                	pop    r13
      d179ac:	41 5e                	pop    r14
      d179ae:	41 5f                	pop    r15

### caller 0xd182cd FDE=(13730106, 13730882)
      d1828f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      d18294:	e8 c3 d4 a4 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
      d18299:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      d1829d:	48 8b b8 a0 01 00 00 	mov    rdi,QWORD PTR [rax+0x1a0]
      d182a4:	31 c0                	xor    eax,eax
      d182a6:	88 44 24 28          	mov    BYTE PTR [rsp+0x28],al
      d182aa:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al
      d182ae:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
      d182b5:	00 00 
      d182b7:	48 89 de             	mov    rsi,rbx
      d182ba:	49 89 de             	mov    r14,rbx
      d182bd:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
      d182c2:	48 89 da             	mov    rdx,rbx
      d182c5:	4c 8d 6c 24 70       	lea    r13,[rsp+0x70]
      d182ca:	4c 89 e9             	mov    rcx,r13
      d182cd:	e8 50 cb 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d182d2:	4c 89 ef             	mov    rdi,r13
      d182d5:	e8 90 1c d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d182da:	48 89 df             	mov    rdi,rbx
      d182dd:	e8 4e ea d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d182e2:	4c 89 f7             	mov    rdi,r14
      d182e5:	e8 fa 66 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d182ea:	b0 01                	mov    al,0x1
      d182ec:	4c 89 ef             	mov    rdi,r13
      d182ef:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
      d182f3:	4c 8b 44 24 18       	mov    r8,QWORD PTR [rsp+0x18]
      d182f8:	eb 20                	jmp    d1831a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2652ba>
      d182fa:	41 83 fd 01          	cmp    r13d,0x1
      d182fe:	75 1a                	jne    d1831a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2652ba>
      d18300:	45 84 ff             	test   r15b,r15b
      d18303:	75 15                	jne    d1831a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2652ba>
      d18305:	49 8b ae 38 02 00 00 	mov    rbp,QWORD PTR [r14+0x238]
      d1830c:	49 89 e8             	mov    r8,rbp
      d1830f:	49 c1 e8 08          	shr    r8,0x8
      d18313:	45 8a be 40 02 00 00 	mov    r15b,BYTE PTR [r14+0x240]
      d1831a:	49 ff c4             	inc    r12
      d1831d:	49 83 fc 06          	cmp    r12,0x6
      d18321:	0f 85 6c fe ff ff    	jne    d18193 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x265133>
      d18327:	eb 18                	jmp    d18341 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2652e1>
      d18329:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe

### caller 0xd19110 FDE=(13731858, 13738390)
      d190da:	48 89 de             	mov    rsi,rbx
      d190dd:	31 d2                	xor    edx,edx
      d190df:	e8 6e cc de ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      d190e4:	49 8b bc 24 a0 01 00 	mov    rdi,QWORD PTR [r12+0x1a0]
      d190eb:	00 
      d190ec:	31 c0                	xor    eax,eax
      d190ee:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
      d190f5:	00 
      d190f6:	88 02                	mov    BYTE PTR [rdx],al
      d190f8:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d190fb:	48 8d 8c 24 e0 00 00 	lea    rcx,[rsp+0xe0]
      d19102:	00 
      d19103:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d19108:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
      d1910f:	00 
      d19110:	e8 0d bd 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d19115:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      d1911c:	00 
      d1911d:	e8 48 0e d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d19122:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      d19129:	00 
      d1912a:	e8 01 dc d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d1912f:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
      d19136:	00 
      d19137:	e8 a8 58 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d1913c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      d19143:	00 
      d19144:	e8 df 65 a9 00       	call   17af728 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163894>
      d19149:	48 8d 05 98 9f b0 00 	lea    rax,[rip+0xb09f98]        # 18230e8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18da8>
      d19150:	48 8d 8c 24 10 02 00 	lea    rcx,[rsp+0x210]
      d19157:	00 
      d19158:	48 89 41 d0          	mov    QWORD PTR [rcx-0x30],rax
      d1915c:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
      d19161:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
      d19165:	4c 89 71 f0          	mov    QWORD PTR [rcx-0x10],r14
      d19169:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0
      d1916d:	48 8d 84 24 48 02 00 	lea    rax,[rsp+0x248]
      d19174:	00 
      d19175:	48 89 40 e8          	mov    QWORD PTR [rax-0x18],rax
      d19179:	4c 89 70 f0          	mov    QWORD PTR [rax-0x10],r14

### caller 0xd196a9 FDE=(13731858, 13738390)
      d19666:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
      d1966d:	00 
      d1966e:	48 8d 35 bd cc 62 ff 	lea    rsi,[rip+0xffffffffff62ccbd]        # 346332 <_ZTSSt12bad_any_cast@@Base-0x49e96>
      d19675:	6a 0c                	push   0xc
      d19677:	5a                   	pop    rdx
      d19678:	e8 df c0 a4 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
      d1967d:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      d19682:	48 8b b8 a0 01 00 00 	mov    rdi,QWORD PTR [rax+0x1a0]
      d19689:	88 9c 24 e0 00 00 00 	mov    BYTE PTR [rsp+0xe0],bl
      d19690:	88 9c 24 f8 00 00 00 	mov    BYTE PTR [rsp+0xf8],bl
      d19697:	48 83 a4 24 00 02 00 	and    QWORD PTR [rsp+0x200],0x0
      d1969e:	00 00 
      d196a0:	48 89 ee             	mov    rsi,rbp
      d196a3:	4c 89 fa             	mov    rdx,r15
      d196a6:	4c 89 e9             	mov    rcx,r13
      d196a9:	e8 74 b7 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d196ae:	4c 89 ef             	mov    rdi,r13
      d196b1:	e8 b4 08 d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d196b6:	4c 89 ff             	mov    rdi,r15
      d196b9:	e8 72 d6 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d196be:	48 89 ef             	mov    rdi,rbp
      d196c1:	e8 1e 53 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d196c6:	b0 01                	mov    al,0x1
      d196c8:	49 ff c4             	inc    r12
      d196cb:	49 83 fc 06          	cmp    r12,0x6
      d196cf:	0f 85 d4 fe ff ff    	jne    d195a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x266549>
      d196d5:	eb 18                	jmp    d196ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26668f>
      d196d7:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d196db:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d196de:	e9 56 ff ff ff       	jmp    d19639 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2665d9>
      d196e3:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe
      d196e7:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      d196ea:	e9 77 ff ff ff       	jmp    d19666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x266606>
      d196ef:	a8 01                	test   al,0x1
      d196f1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      d196f6:	75 13                	jne    d1970b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2666ab>
      d196f8:	41 c6 84 24 10 04 00 	mov    BYTE PTR [r12+0x410],0x1
      d196ff:	00 01 
      d19701:	4c 89 e7             	mov    rdi,r12
      d19704:	e8 97 c9 ff ff       	call   d160a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263040>

### caller 0xd19bbf FDE=(13731858, 13738390)
      d19b7e:	48 89 dd             	mov    rbp,rbx
      d19b81:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      d19b86:	48 8b b8 a0 01 00 00 	mov    rdi,QWORD PTR [rax+0x1a0]
      d19b8d:	31 c0                	xor    eax,eax
      d19b8f:	88 84 24 40 01 00 00 	mov    BYTE PTR [rsp+0x140],al
      d19b96:	88 84 24 58 01 00 00 	mov    BYTE PTR [rsp+0x158],al
      d19b9d:	48 83 a4 24 90 01 00 	and    QWORD PTR [rsp+0x190],0x0
      d19ba4:	00 00 
      d19ba6:	4c 89 e6             	mov    rsi,r12
      d19ba9:	4c 8d b4 24 40 01 00 	lea    r14,[rsp+0x140]
      d19bb0:	00 
      d19bb1:	4c 89 f2             	mov    rdx,r14
      d19bb4:	48 8d 9c 24 70 01 00 	lea    rbx,[rsp+0x170]
      d19bbb:	00 
      d19bbc:	48 89 d9             	mov    rcx,rbx
      d19bbf:	e8 5e b2 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d19bc4:	48 89 df             	mov    rdi,rbx
      d19bc7:	e8 9e 03 d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d19bcc:	4c 89 f7             	mov    rdi,r14
      d19bcf:	e8 5c d1 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d19bd4:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      d19bdb:	00 
      d19bdc:	e8 7b 58 f3 ff       	call   c4f45c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19c3fc>
      d19be1:	ff 84 24 08 01 00 00 	inc    DWORD PTR [rsp+0x108]
      d19be8:	4c 89 e7             	mov    rdi,r12
      d19beb:	e8 f4 4d da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d19bf0:	48 89 eb             	mov    rbx,rbp
      d19bf3:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      d19bf8:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      d19bfd:	e8 84 48 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d19c02:	4c 89 ef             	mov    rdi,r13
      d19c05:	4c 89 fe             	mov    rsi,r15
      d19c08:	e8 65 d4 d9 ff       	call   ab7072 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4012>
      d19c0d:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
      d19c13:	4c 89 ef             	mov    rdi,r13
      d19c16:	e8 6b d8 f5 ff       	call   c77486 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c4426>
      d19c1b:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      d19c20:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      d19c27:	00 
      d19c28:	0f 85 84 fc ff ff    	jne    d198b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x266852>

### caller 0xd1e4d4 FDE=(13755408, 13755680)
      d1e495:	48 98                	cdqe
      d1e497:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      d1e49c:	c7 44 24 38 3f 00 00 	mov    DWORD PTR [rsp+0x38],0x3f
      d1e4a3:	00 
      d1e4a4:	48 8d 35 d1 3a 73 ff 	lea    rsi,[rip+0xffffffffff733ad1]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      d1e4ab:	31 d2                	xor    edx,edx
      d1e4ad:	e8 a0 78 de ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      d1e4b2:	48 8b bb a0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a0]
      d1e4b9:	31 c0                	xor    eax,eax
      d1e4bb:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      d1e4c0:	88 02                	mov    BYTE PTR [rdx],al
      d1e4c2:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d1e4c5:	48 8d 4c 24 70       	lea    rcx,[rsp+0x70]
      d1e4ca:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d1e4cf:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      d1e4d4:	e8 49 69 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d1e4d9:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      d1e4de:	e8 87 ba d5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d1e4e3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d1e4e8:	e8 43 88 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d1e4ed:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d1e4f2:	e8 17 c6 d8 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      d1e4f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d1e4fe:	00 00 
      d1e500:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
      d1e507:	00 
      d1e508:	75 09                	jne    d1e513 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26b4b3>
      d1e50a:	48 81 c4 b0 00 00 00 	add    rsp,0xb0
      d1e511:	5b                   	pop    rbx
      d1e512:	c3                   	ret
      d1e513:	e8 98 15 ad 00       	call   17efab0 <__stack_chk_fail@plt>
      d1e518:	48 89 c7             	mov    rdi,rax
      d1e51b:	e8 85 b5 d5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      d1e520:	41 57                	push   r15
      d1e522:	41 56                	push   r14
      d1e524:	41 54                	push   r12
      d1e526:	53                   	push   rbx
      d1e527:	48 83 ec 68          	sub    rsp,0x68
      d1e52b:	48 89 f3             	mov    rbx,rsi
      d1e52e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### caller 0xd1f616 FDE=(13759512, 13761120)
      d1f5d6:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      d1f5da:	48 8b b8 a0 01 00 00 	mov    rdi,QWORD PTR [rax+0x1a0]
      d1f5e1:	31 c0                	xor    eax,eax
      d1f5e3:	88 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],al
      d1f5ea:	88 84 24 98 00 00 00 	mov    BYTE PTR [rsp+0x98],al
      d1f5f1:	48 83 a4 24 f0 00 00 	and    QWORD PTR [rsp+0xf0],0x0
      d1f5f8:	00 00 
      d1f5fa:	48 89 ee             	mov    rsi,rbp
      d1f5fd:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
      d1f604:	00 
      d1f605:	4c 89 fa             	mov    rdx,r15
      d1f608:	48 89 eb             	mov    rbx,rbp
      d1f60b:	48 8d ac 24 d0 00 00 	lea    rbp,[rsp+0xd0]
      d1f612:	00 
      d1f613:	48 89 e9             	mov    rcx,rbp
      d1f616:	e8 07 58 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d1f61b:	48 89 ef             	mov    rdi,rbp
      d1f61e:	e8 47 a9 d5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d1f623:	4c 89 ff             	mov    rdi,r15
      d1f626:	e8 05 77 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d1f62b:	48 89 df             	mov    rdi,rbx
      d1f62e:	e8 b1 f3 d9 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d1f633:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d1f638:	e8 53 e8 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d1f63d:	48 89 dd             	mov    rbp,rbx
      d1f640:	e9 cd 02 00 00       	jmp    d1f912 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c8b2>
      d1f645:	48 89 ef             	mov    rdi,rbp
      d1f648:	e8 e9 c1 d5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      d1f64d:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
      d1f650:	4c 89 ff             	mov    rdi,r15
      d1f653:	48 89 c6             	mov    rsi,rax
      d1f656:	ff 91 d8 00 00 00    	call   QWORD PTR [rcx+0xd8]
      d1f65c:	49 89 dc             	mov    r12,rbx
      d1f65f:	48 85 c0             	test   rax,rax
      d1f662:	0f 85 8b 02 00 00    	jne    d1f8f3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c893>
      d1f668:	41 f6 06 01          	test   BYTE PTR [r14],0x1
      d1f66c:	74 04                	je     d1f672 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c612>
      d1f66e:	4d 8b 6e 10          	mov    r13,QWORD PTR [r14+0x10]
      d1f672:	f6 44 24 30 01       	test   BYTE PTR [rsp+0x30],0x1
      d1f677:	48 8d 4c 24 31       	lea    rcx,[rsp+0x31]

### caller 0xd1f769 FDE=(13759512, 13761120)
      d1f727:	e8 66 60 a4 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d1f72c:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      d1f730:	48 8b b8 a0 01 00 00 	mov    rdi,QWORD PTR [rax+0x1a0]
      d1f737:	31 c0                	xor    eax,eax
      d1f739:	88 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],al
      d1f740:	88 84 24 98 00 00 00 	mov    BYTE PTR [rsp+0x98],al
      d1f747:	48 83 a4 24 f0 00 00 	and    QWORD PTR [rsp+0xf0],0x0
      d1f74e:	00 00 
      d1f750:	48 89 de             	mov    rsi,rbx
      d1f753:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
      d1f75a:	00 
      d1f75b:	4c 89 fa             	mov    rdx,r15
      d1f75e:	48 8d ac 24 d0 00 00 	lea    rbp,[rsp+0xd0]
      d1f765:	00 
      d1f766:	48 89 e9             	mov    rcx,rbp
      d1f769:	e8 b4 56 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d1f76e:	48 89 ef             	mov    rdi,rbp
      d1f771:	e8 f4 a7 d5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d1f776:	4c 89 ff             	mov    rdi,r15
      d1f779:	e8 b2 75 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d1f77e:	4c 89 f7             	mov    rdi,r14
      d1f781:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
      d1f786:	48 89 de             	mov    rsi,rbx
      d1f789:	e8 f2 e8 ac 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      d1f78e:	48 8d ac 24 a0 00 00 	lea    rbp,[rsp+0xa0]
      d1f795:	00 
      d1f796:	41 83 66 1c 00       	and    DWORD PTR [r14+0x1c],0x0
      d1f79b:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      d1f79f:	c6 80 12 04 00 00 01 	mov    BYTE PTR [rax+0x412],0x1
      d1f7a6:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d1f7ab:	ff 40 2c             	inc    DWORD PTR [rax+0x2c]
      d1f7ae:	48 89 ef             	mov    rdi,rbp
      d1f7b1:	e8 2e f2 d9 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d1f7b6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      d1f7bb:	e8 d0 e6 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d1f7c0:	48 89 df             	mov    rdi,rbx
      d1f7c3:	e8 c8 e6 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d1f7c8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d1f7cd:	e8 be e6 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d1f7d2:	e9 db fc ff ff       	jmp    d1f4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c452>

### caller 0xd1f8d6 FDE=(13759512, 13761120)
      d1f898:	00 
      d1f899:	4c 89 f6             	mov    rsi,r14
      d1f89c:	e8 f1 5e a4 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d1f8a1:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      d1f8a5:	48 8b b8 a0 01 00 00 	mov    rdi,QWORD PTR [rax+0x1a0]
      d1f8ac:	31 c0                	xor    eax,eax
      d1f8ae:	88 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],al
      d1f8b5:	88 84 24 98 00 00 00 	mov    BYTE PTR [rsp+0x98],al
      d1f8bc:	48 83 a4 24 f0 00 00 	and    QWORD PTR [rsp+0xf0],0x0
      d1f8c3:	00 00 
      d1f8c5:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
      d1f8cc:	00 
      d1f8cd:	48 89 de             	mov    rsi,rbx
      d1f8d0:	4c 89 fa             	mov    rdx,r15
      d1f8d3:	4c 89 e9             	mov    rcx,r13
      d1f8d6:	e8 47 55 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d1f8db:	4c 89 ef             	mov    rdi,r13
      d1f8de:	e8 87 a6 d5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d1f8e3:	4c 89 ff             	mov    rdi,r15
      d1f8e6:	e8 45 74 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d1f8eb:	48 89 df             	mov    rdi,rbx
      d1f8ee:	e8 f1 f0 d9 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      d1f8f3:	48 89 ef             	mov    rdi,rbp
      d1f8f6:	e8 95 e5 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d1f8fb:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d1f900:	e8 8b e5 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d1f905:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      d1f90a:	48 8d ac 24 a0 00 00 	lea    rbp,[rsp+0xa0]
      d1f911:	00 
      d1f912:	4c 89 e7             	mov    rdi,r12
      d1f915:	4c 89 f6             	mov    rsi,r14
      d1f918:	e8 77 ee ff ff       	call   d1e794 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26b734>
      d1f91d:	49 89 c6             	mov    r14,rax
      d1f920:	4d 3b 74 24 08       	cmp    r14,QWORD PTR [r12+0x8]
      d1f925:	0f 85 37 fb ff ff    	jne    d1f462 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c402>
      d1f92b:	eb 24                	jmp    d1f951 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c8f1>
      d1f92d:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d1f931:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d1f934:	e9 8d fc ff ff       	jmp    d1f5c6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c566>
      d1f939:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe

### caller 0xd20101 FDE=(13762000, 13763147)
      d200c8:	48 83 fa 06          	cmp    rdx,0x6
      d200cc:	75 e8                	jne    d200b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26d056>
      d200ce:	48 98                	cdqe
      d200d0:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      d200d5:	48 89 46 60          	mov    QWORD PTR [rsi+0x60],rax
      d200d9:	c7 46 10 ff 03 00 00 	mov    DWORD PTR [rsi+0x10],0x3ff
      d200e0:	49 8b bc 24 a0 01 00 	mov    rdi,QWORD PTR [r12+0x1a0]
      d200e7:	00 
      d200e8:	31 c0                	xor    eax,eax
      d200ea:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
      d200ef:	88 02                	mov    BYTE PTR [rdx],al
      d200f1:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d200f4:	48 8d 8c 24 e0 00 00 	lea    rcx,[rsp+0xe0]
      d200fb:	00 
      d200fc:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d20101:	e8 1c 4d 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d20106:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      d2010d:	00 
      d2010e:	e8 57 9e d5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d20113:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d20118:	e8 13 6c d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d2011d:	4c 8b 75 48          	mov    r14,QWORD PTR [rbp+0x48]
      d20121:	4d 85 f6             	test   r14,r14
      d20124:	0f 84 aa 00 00 00    	je     d201d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26d174>
      d2012a:	31 db                	xor    ebx,ebx
      d2012c:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
      d20131:	48 8d 6c 24 30       	lea    rbp,[rsp+0x30]
      d20136:	4c 8d ac 24 e0 00 00 	lea    r13,[rsp+0xe0]
      d2013d:	00 
      d2013e:	48 83 64 24 58 00    	and    QWORD PTR [rsp+0x58],0x0
      d20144:	49 8d 76 10          	lea    rsi,[r14+0x10]
      d20148:	48 8d 05 d9 41 b7 00 	lea    rax,[rip+0xb741d9]        # 1894328 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1268>
      d2014f:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      d20154:	48 8d 05 9d f6 71 ff 	lea    rax,[rip+0xffffffffff71f69d]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d2015b:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      d20160:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
      d20166:	48 c7 44 24 60 01 00 	mov    QWORD PTR [rsp+0x60],0x1
      d2016d:	00 00 
      d2016f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      d20174:	31 d2                	xor    edx,edx

### caller 0xd201ab FDE=(13762000, 13763147)
      d2016f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      d20174:	31 d2                	xor    edx,edx
      d20176:	e8 17 56 a4 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d2017b:	49 63 46 28          	movsxd rax,DWORD PTR [r14+0x28]
      d2017f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      d20184:	80 4c 24 60 02       	or     BYTE PTR [rsp+0x60],0x2
      d20189:	49 8b bc 24 a0 01 00 	mov    rdi,QWORD PTR [r12+0x1a0]
      d20190:	00 
      d20191:	88 5c 24 30          	mov    BYTE PTR [rsp+0x30],bl
      d20195:	88 5c 24 48          	mov    BYTE PTR [rsp+0x48],bl
      d20199:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
      d201a0:	00 00 
      d201a2:	4c 89 fe             	mov    rsi,r15
      d201a5:	48 89 ea             	mov    rdx,rbp
      d201a8:	4c 89 e9             	mov    rcx,r13
      d201ab:	e8 72 4c 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d201b0:	4c 89 ef             	mov    rdi,r13
      d201b3:	e8 b2 9d d5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d201b8:	48 89 ef             	mov    rdi,rbp
      d201bb:	e8 70 6b d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d201c0:	4c 89 ff             	mov    rdi,r15
      d201c3:	e8 46 a9 d8 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      d201c8:	4d 8b 36             	mov    r14,QWORD PTR [r14]
      d201cb:	4d 85 f6             	test   r14,r14
      d201ce:	0f 85 6a ff ff ff    	jne    d2013e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26d0de>
      d201d4:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      d201db:	00 
      d201dc:	e8 27 a8 d8 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
      d201e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d201e8:	00 00 
      d201ea:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
      d201f1:	00 
      d201f2:	75 12                	jne    d20206 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26d1a6>
      d201f4:	48 81 c4 18 01 00 00 	add    rsp,0x118
      d201fb:	5b                   	pop    rbx
      d201fc:	41 5c                	pop    r12
      d201fe:	41 5d                	pop    r13
      d20200:	41 5e                	pop    r14
      d20202:	41 5f                	pop    r15
      d20204:	5d                   	pop    rbp

### caller 0xd2538c FDE=(13782062, 13785944)
      d25349:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      d2534e:	e8 3f 04 a4 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d25353:	49 8b bd e0 00 00 00 	mov    rdi,QWORD PTR [r13+0xe0]
      d2535a:	31 c0                	xor    eax,eax
      d2535c:	88 84 24 a0 01 00 00 	mov    BYTE PTR [rsp+0x1a0],al
      d25363:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
      d2536a:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
      d25371:	00 00 
      d25373:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
      d2537a:	00 
      d2537b:	4c 89 fa             	mov    rdx,r15
      d2537e:	4d 89 fe             	mov    r14,r15
      d25381:	4c 8d bc 24 70 03 00 	lea    r15,[rsp+0x370]
      d25388:	00 
      d25389:	4c 89 f9             	mov    rcx,r15
      d2538c:	e8 91 fa 8f 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d25391:	4c 89 ff             	mov    rdi,r15
      d25394:	e8 d1 4b d5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d25399:	4c 89 f7             	mov    rdi,r14
      d2539c:	e8 8f 19 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d253a1:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
      d253a8:	00 
      d253a9:	4c 89 f7             	mov    rdi,r14
      d253ac:	e8 f9 9d d9 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d253b1:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      d253b6:	e8 d5 8a ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d253bb:	4c 89 f7             	mov    rdi,r14
      d253be:	48 89 ee             	mov    rsi,rbp
      d253c1:	e8 7a 8b ac 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d253c6:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      d253cd:	00 
      d253ce:	4c 89 f6             	mov    rsi,r14
      d253d1:	e8 56 e6 ff ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
      d253d6:	4c 89 f7             	mov    rdi,r14
      d253d9:	e8 b2 8a ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d253de:	ff 44 24 54          	inc    DWORD PTR [rsp+0x54]
      d253e2:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      d253e9:	00 
      d253ea:	e8 a1 8a ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d253ef:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]

### caller 0xd25598 FDE=(13782062, 13785944)
      d2555e:	31 d2                	xor    edx,edx
      d25560:	e8 ed 07 de ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      d25565:	48 8d b4 24 c8 01 00 	lea    rsi,[rsp+0x1c8]
      d2556c:	00 
      d2556d:	44 89 76 30          	mov    DWORD PTR [rsi+0x30],r14d
      d25571:	80 4e 10 08          	or     BYTE PTR [rsi+0x10],0x8
      d25575:	49 8b bd e0 00 00 00 	mov    rdi,QWORD PTR [r13+0xe0]
      d2557c:	31 c0                	xor    eax,eax
      d2557e:	48 8d 94 24 70 03 00 	lea    rdx,[rsp+0x370]
      d25585:	00 
      d25586:	88 02                	mov    BYTE PTR [rdx],al
      d25588:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d2558b:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
      d25592:	00 
      d25593:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d25598:	e8 85 f8 8f 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d2559d:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
      d255a4:	00 
      d255a5:	e8 c0 49 d5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d255aa:	48 8d bc 24 70 03 00 	lea    rdi,[rsp+0x370]
      d255b1:	00 
      d255b2:	e8 79 17 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d255b7:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]
      d255be:	00 
      d255bf:	e8 e6 9b d9 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d255c4:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      d255cb:	00 
      d255cc:	e8 bf 88 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d255d1:	49 8b 5d 38          	mov    rbx,QWORD PTR [r13+0x38]
      d255d5:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]
      d255dc:	00 
      d255dd:	48 8d b4 24 38 01 00 	lea    rsi,[rsp+0x138]
      d255e4:	00 
      d255e5:	e8 56 89 ac 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d255ea:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d255ed:	48 8d b4 24 c8 01 00 	lea    rsi,[rsp+0x1c8]
      d255f4:	00 
      d255f5:	48 89 df             	mov    rdi,rbx
      d255f8:	ff 50 30             	call   QWORD PTR [rax+0x30]
      d255fb:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]

### caller 0xd25823 FDE=(13782062, 13785944)
      d257e9:	31 d2                	xor    edx,edx
      d257eb:	e8 62 05 de ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      d257f0:	48 8d b4 24 c8 01 00 	lea    rsi,[rsp+0x1c8]
      d257f7:	00 
      d257f8:	83 66 30 00          	and    DWORD PTR [rsi+0x30],0x0
      d257fc:	80 4e 10 08          	or     BYTE PTR [rsi+0x10],0x8
      d25800:	49 8b bd e0 00 00 00 	mov    rdi,QWORD PTR [r13+0xe0]
      d25807:	31 c0                	xor    eax,eax
      d25809:	48 8d 94 24 70 03 00 	lea    rdx,[rsp+0x370]
      d25810:	00 
      d25811:	88 02                	mov    BYTE PTR [rdx],al
      d25813:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d25816:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
      d2581d:	00 
      d2581e:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d25823:	e8 fa f5 8f 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d25828:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
      d2582f:	00 
      d25830:	e8 35 47 d5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d25835:	48 8d bc 24 70 03 00 	lea    rdi,[rsp+0x370]
      d2583c:	00 
      d2583d:	e8 ee 14 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d25842:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]
      d25849:	00 
      d2584a:	e8 5b 99 d9 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d2584f:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      d25856:	00 
      d25857:	e8 34 86 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d2585c:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]
      d25863:	00 
      d25864:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
      d2586b:	00 
      d2586c:	e8 7b 18 d9 ff       	call   ab70ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x408c>
      d25871:	f6 84 24 c8 01 00 00 	test   BYTE PTR [rsp+0x1c8],0x1
      d25878:	01 
      d25879:	74 0a                	je     d25885 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x272825>
      d2587b:	4c 8b 84 24 d8 01 00 	mov    r8,QWORD PTR [rsp+0x1d8]
      d25882:	00 
      d25883:	eb 08                	jmp    d2588d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27282d>
      d25885:	4c 8d 84 24 c9 01 00 	lea    r8,[rsp+0x1c9]

### caller 0xd2de08 FDE=(13819300, 13819523)
      d2ddce:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      d2ddd2:	48 8d 05 1f 1a 71 ff 	lea    rax,[rip+0xffffffffff711a1f]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d2ddd9:	48 89 07             	mov    QWORD PTR [rdi],rax
      d2dddc:	48 c7 47 f8 01 00 00 	mov    QWORD PTR [rdi-0x8],0x1
      d2dde3:	00 
      d2dde4:	31 c9                	xor    ecx,ecx
      d2dde6:	e8 71 79 a3 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
      d2ddeb:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
      d2ddef:	31 c0                	xor    eax,eax
      d2ddf1:	48 89 e2             	mov    rdx,rsp
      d2ddf4:	88 02                	mov    BYTE PTR [rdx],al
      d2ddf6:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d2ddf9:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
      d2ddfe:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d2de03:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      d2de08:	e8 15 70 8f 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d2de0d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d2de12:	e8 53 c1 d4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d2de17:	48 89 e7             	mov    rdi,rsp
      d2de1a:	e8 11 8f d7 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d2de1f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d2de24:	e8 e5 cc d7 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      d2de29:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d2de30:	00 00 
      d2de32:	48 3b 44 24 78       	cmp    rax,QWORD PTR [rsp+0x78]
      d2de37:	75 45                	jne    d2de7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27ae1e>
      d2de39:	48 81 c4 80 00 00 00 	add    rsp,0x80
      d2de40:	5b                   	pop    rbx
      d2de41:	c3                   	ret
      d2de42:	48 89 c3             	mov    rbx,rax
      d2de45:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d2de4a:	e8 1b c1 d4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d2de4f:	48 89 e7             	mov    rdi,rsp
      d2de52:	e8 d9 8e d7 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d2de57:	eb 03                	jmp    d2de5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27adfc>
      d2de59:	48 89 c3             	mov    rbx,rax
      d2de5c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d2de61:	e8 a8 cc d7 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      d2de66:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d2de6d:	00 00 

### caller 0xd301a4 FDE=(13828416, 13828639)
      d3016a:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      d3016e:	48 8d 05 83 f6 70 ff 	lea    rax,[rip+0xffffffffff70f683]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d30175:	48 89 07             	mov    QWORD PTR [rdi],rax
      d30178:	48 c7 47 f8 01 00 00 	mov    QWORD PTR [rdi-0x8],0x1
      d3017f:	00 
      d30180:	31 c9                	xor    ecx,ecx
      d30182:	e8 d5 55 a3 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
      d30187:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
      d3018b:	31 c0                	xor    eax,eax
      d3018d:	48 89 e2             	mov    rdx,rsp
      d30190:	88 02                	mov    BYTE PTR [rdx],al
      d30192:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d30195:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
      d3019a:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d3019f:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      d301a4:	e8 79 4c 8f 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d301a9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d301ae:	e8 b7 9d d4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d301b3:	48 89 e7             	mov    rdi,rsp
      d301b6:	e8 75 6b d7 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d301bb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d301c0:	e8 49 a9 d7 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      d301c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d301cc:	00 00 
      d301ce:	48 3b 44 24 78       	cmp    rax,QWORD PTR [rsp+0x78]
      d301d3:	75 45                	jne    d3021a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27d1ba>
      d301d5:	48 81 c4 80 00 00 00 	add    rsp,0x80
      d301dc:	5b                   	pop    rbx
      d301dd:	c3                   	ret
      d301de:	48 89 c3             	mov    rbx,rax
      d301e1:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d301e6:	e8 7f 9d d4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d301eb:	48 89 e7             	mov    rdi,rsp
      d301ee:	e8 3d 6b d7 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d301f3:	eb 03                	jmp    d301f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27d198>
      d301f5:	48 89 c3             	mov    rbx,rax
      d301f8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d301fd:	e8 0c a9 d7 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      d30202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d30209:	00 00 

### caller 0xd378b9 FDE=(13858614, 13859222)
      d3787f:	4c 89 f7             	mov    rdi,r14
      d37882:	e8 09 66 ab 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d37887:	8a 83 41 01 00 00    	mov    al,BYTE PTR [rbx+0x141]
      d3788d:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      d37892:	88 46 51             	mov    BYTE PTR [rsi+0x51],al
      d37895:	31 c0                	xor    eax,eax
      d37897:	88 46 52             	mov    BYTE PTR [rsi+0x52],al
      d3789a:	80 4e 11 03          	or     BYTE PTR [rsi+0x11],0x3
      d3789e:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
      d378a2:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      d378a7:	88 02                	mov    BYTE PTR [rdx],al
      d378a9:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d378ac:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
      d378b1:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
      d378b8:	00 
      d378b9:	e8 64 d5 8e 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d378be:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      d378c5:	00 
      d378c6:	e8 9f 26 d4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d378cb:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      d378d0:	e8 5b f4 d6 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d378d5:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      d378da:	e8 41 91 d8 ff       	call   ac0a20 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9c0>
      d378df:	48 89 e7             	mov    rdi,rsp
      d378e2:	e8 a9 65 ab 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d378e7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d378ee:	00 00 
      d378f0:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
      d378f7:	00 
      d378f8:	0f 85 93 00 00 00    	jne    d37991 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a17>
      d378fe:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
      d37905:	5b                   	pop    rbx
      d37906:	41 5c                	pop    r12
      d37908:	41 5e                	pop    r14
      d3790a:	41 5f                	pop    r15
      d3790c:	c3                   	ret
      d3790d:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d37911:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d37914:	e9 ed fe ff ff       	jmp    d37806 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x488c>
      d37919:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe

### caller 0xd5ffb8 FDE=(14024446, 14024784)
      d5ff81:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
      d5ff85:	83 4f e8 04          	or     DWORD PTR [rdi-0x18],0x4
      d5ff89:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      d5ff8d:	48 8b 57 e0          	mov    rdx,QWORD PTR [rdi-0x20]
      d5ff91:	f6 c2 01             	test   dl,0x1
      d5ff94:	75 6b                	jne    d60001 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d087>
      d5ff96:	e8 f7 57 a0 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d5ff9b:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      d5ff9f:	31 c0                	xor    eax,eax
      d5ffa1:	48 89 e2             	mov    rdx,rsp
      d5ffa4:	88 02                	mov    BYTE PTR [rdx],al
      d5ffa6:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d5ffa9:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      d5ffae:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d5ffb3:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      d5ffb8:	e8 65 4e 8c 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d5ffbd:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d5ffc2:	e8 a3 9f d1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d5ffc7:	48 89 e7             	mov    rdi,rsp
      d5ffca:	e8 61 6d d4 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d5ffcf:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d5ffd4:	e8 d1 f1 d5 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d5ffd9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d5ffe0:	00 00 
      d5ffe2:	48 3b 84 24 88 00 00 	cmp    rax,QWORD PTR [rsp+0x88]
      d5ffe9:	00 
      d5ffea:	75 5f                	jne    d6004b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d0d1>
      d5ffec:	48 81 c4 90 00 00 00 	add    rsp,0x90
      d5fff3:	5b                   	pop    rbx
      d5fff4:	c3                   	ret
      d5fff5:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d5fff9:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d5fffc:	e9 76 ff ff ff       	jmp    d5ff77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cffd>
      d60001:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d60005:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d60008:	eb 8c                	jmp    d5ff96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d01c>
      d6000a:	48 89 c3             	mov    rbx,rax
      d6000d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d60012:	e8 53 9f d1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d60017:	48 89 e7             	mov    rdi,rsp

### caller 0xd65e3e FDE=(14048644, 14048982)
      d65e07:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
      d65e0b:	83 4f e8 04          	or     DWORD PTR [rdi-0x18],0x4
      d65e0f:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      d65e13:	48 8b 57 e0          	mov    rdx,QWORD PTR [rdi-0x20]
      d65e17:	f6 c2 01             	test   dl,0x1
      d65e1a:	75 6b                	jne    d65e87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f0d>
      d65e1c:	e8 71 f9 9f 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d65e21:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      d65e25:	31 c0                	xor    eax,eax
      d65e27:	48 89 e2             	mov    rdx,rsp
      d65e2a:	88 02                	mov    BYTE PTR [rdx],al
      d65e2c:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d65e2f:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      d65e34:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d65e39:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      d65e3e:	e8 df ef 8b 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d65e43:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d65e48:	e8 1d 41 d1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d65e4d:	48 89 e7             	mov    rdi,rsp
      d65e50:	e8 db 0e d4 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d65e55:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d65e5a:	e8 4b 93 d5 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d65e5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d65e66:	00 00 
      d65e68:	48 3b 84 24 88 00 00 	cmp    rax,QWORD PTR [rsp+0x88]
      d65e6f:	00 
      d65e70:	75 5f                	jne    d65ed1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f57>
      d65e72:	48 81 c4 90 00 00 00 	add    rsp,0x90
      d65e79:	5b                   	pop    rbx
      d65e7a:	c3                   	ret
      d65e7b:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d65e7f:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d65e82:	e9 76 ff ff ff       	jmp    d65dfd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32e83>
      d65e87:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d65e8b:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d65e8e:	eb 8c                	jmp    d65e1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32ea2>
      d65e90:	48 89 c3             	mov    rbx,rax
      d65e93:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d65e98:	e8 cd 40 d1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d65e9d:	48 89 e7             	mov    rdi,rsp

### caller 0xd66070 FDE=(14049206, 14049544)
      d66039:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
      d6603d:	83 4f e8 04          	or     DWORD PTR [rdi-0x18],0x4
      d66041:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      d66045:	48 8b 57 e0          	mov    rdx,QWORD PTR [rdi-0x20]
      d66049:	f6 c2 01             	test   dl,0x1
      d6604c:	75 6b                	jne    d660b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3313f>
      d6604e:	e8 3f f7 9f 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d66053:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      d66057:	31 c0                	xor    eax,eax
      d66059:	48 89 e2             	mov    rdx,rsp
      d6605c:	88 02                	mov    BYTE PTR [rdx],al
      d6605e:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d66061:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      d66066:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d6606b:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      d66070:	e8 ad ed 8b 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d66075:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d6607a:	e8 eb 3e d1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d6607f:	48 89 e7             	mov    rdi,rsp
      d66082:	e8 a9 0c d4 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d66087:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d6608c:	e8 19 91 d5 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d66091:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d66098:	00 00 
      d6609a:	48 3b 84 24 88 00 00 	cmp    rax,QWORD PTR [rsp+0x88]
      d660a1:	00 
      d660a2:	75 5f                	jne    d66103 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33189>
      d660a4:	48 81 c4 90 00 00 00 	add    rsp,0x90
      d660ab:	5b                   	pop    rbx
      d660ac:	c3                   	ret
      d660ad:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d660b1:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d660b4:	e9 76 ff ff ff       	jmp    d6602f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330b5>
      d660b9:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d660bd:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d660c0:	eb 8c                	jmp    d6604e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330d4>
      d660c2:	48 89 c3             	mov    rbx,rax
      d660c5:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d660ca:	e8 9b 3e d1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d660cf:	48 89 e7             	mov    rdi,rsp

### caller 0xd8c355 FDE=(14205738, 14205876)
      d8c324:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d8c328:	c3                   	ret
      d8c329:	cc                   	int3
      d8c32a:	53                   	push   rbx
      d8c32b:	48 83 ec 60          	sub    rsp,0x60
      d8c32f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8c336:	00 00 
      d8c338:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      d8c33d:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      d8c341:	31 c0                	xor    eax,eax
      d8c343:	48 89 e2             	mov    rdx,rsp
      d8c346:	88 02                	mov    BYTE PTR [rdx],al
      d8c348:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d8c34b:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      d8c350:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d8c355:	e8 c8 8a 89 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d8c35a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d8c35f:	e8 06 dc ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8c364:	48 89 e7             	mov    rdi,rsp
      d8c367:	e8 c4 a9 d1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d8c36c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8c373:	00 00 
      d8c375:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      d8c37a:	75 33                	jne    d8c3af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59435>
      d8c37c:	48 83 c4 60          	add    rsp,0x60
      d8c380:	5b                   	pop    rbx
      d8c381:	c3                   	ret
      d8c382:	48 89 c3             	mov    rbx,rax
      d8c385:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d8c38a:	e8 db db ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8c38f:	48 89 e7             	mov    rdi,rsp
      d8c392:	e8 99 a9 d1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d8c397:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8c39e:	00 00 
      d8c3a0:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      d8c3a5:	75 08                	jne    d8c3af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59435>
      d8c3a7:	48 89 df             	mov    rdi,rbx
      d8c3aa:	e8 21 39 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8c3af:	e8 fc 36 a6 00       	call   17efab0 <__stack_chk_fail@plt>
      d8c3b4:	53                   	push   rbx

### caller 0xd8c413 FDE=(14205928, 14206066)
      d8c3e2:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d8c3e6:	c3                   	ret
      d8c3e7:	cc                   	int3
      d8c3e8:	53                   	push   rbx
      d8c3e9:	48 83 ec 60          	sub    rsp,0x60
      d8c3ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8c3f4:	00 00 
      d8c3f6:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      d8c3fb:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      d8c3ff:	31 c0                	xor    eax,eax
      d8c401:	48 89 e2             	mov    rdx,rsp
      d8c404:	88 02                	mov    BYTE PTR [rdx],al
      d8c406:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d8c409:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      d8c40e:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d8c413:	e8 0a 8a 89 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d8c418:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d8c41d:	e8 48 db ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8c422:	48 89 e7             	mov    rdi,rsp
      d8c425:	e8 06 a9 d1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d8c42a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8c431:	00 00 
      d8c433:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      d8c438:	75 33                	jne    d8c46d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x594f3>
      d8c43a:	48 83 c4 60          	add    rsp,0x60
      d8c43e:	5b                   	pop    rbx
      d8c43f:	c3                   	ret
      d8c440:	48 89 c3             	mov    rbx,rax
      d8c443:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d8c448:	e8 1d db ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8c44d:	48 89 e7             	mov    rdi,rsp
      d8c450:	e8 db a8 d1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d8c455:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8c45c:	00 00 
      d8c45e:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      d8c463:	75 08                	jne    d8c46d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x594f3>
      d8c465:	48 89 df             	mov    rdi,rbx
      d8c468:	e8 63 38 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8c46d:	e8 3e 36 a6 00       	call   17efab0 <__stack_chk_fail@plt>
      d8c472:	48 8d 05 ef b0 a9 00 	lea    rax,[rip+0xa9b0ef]        # 1827568 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3b98>

### caller 0xd8c63b FDE=(14206290, 14206682)
      d8c603:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d8c608:	80 4f e8 04          	or     BYTE PTR [rdi-0x18],0x4
      d8c60c:	48 8d 73 10          	lea    rsi,[rbx+0x10]
      d8c610:	48 8b 57 e0          	mov    rdx,QWORD PTR [rdi-0x20]
      d8c614:	f6 c2 01             	test   dl,0x1
      d8c617:	75 64                	jne    d8c67d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59703>
      d8c619:	e8 74 91 9d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d8c61e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d8c622:	31 c0                	xor    eax,eax
      d8c624:	48 89 e2             	mov    rdx,rsp
      d8c627:	88 02                	mov    BYTE PTR [rdx],al
      d8c629:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d8c62c:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      d8c631:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d8c636:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      d8c63b:	e8 e2 87 89 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d8c640:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d8c645:	e8 20 d9 ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8c64a:	48 89 e7             	mov    rdi,rsp
      d8c64d:	e8 de a6 d1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d8c652:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d8c657:	e8 4e 2b d3 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d8c65c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8c663:	00 00 
      d8c665:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      d8c66c:	00 
      d8c66d:	75 66                	jne    d8c6d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5975b>
      d8c66f:	48 81 c4 88 00 00 00 	add    rsp,0x88
      d8c676:	5b                   	pop    rbx
      d8c677:	41 5e                	pop    r14
      d8c679:	41 5f                	pop    r15
      d8c67b:	5d                   	pop    rbp
      d8c67c:	c3                   	ret
      d8c67d:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d8c681:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d8c684:	eb 93                	jmp    d8c619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5969f>
      d8c686:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d8c68a:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d8c68d:	e9 69 ff ff ff       	jmp    d8c5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59681>
      d8c692:	eb 19                	jmp    d8c6ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59733>

### caller 0xd8c8a3 FDE=(14206906, 14207318)
      d8c863:	48 8b 57 e0          	mov    rdx,QWORD PTR [rdi-0x20]
      d8c867:	f6 c2 01             	test   dl,0x1
      d8c86a:	0f 85 83 00 00 00    	jne    d8c8f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59979>
      d8c870:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      d8c875:	e8 6c 8f 9d 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      d8c87a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      d8c87f:	e8 0c 16 a6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d8c884:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      d8c888:	31 c0                	xor    eax,eax
      d8c88a:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      d8c88f:	88 02                	mov    BYTE PTR [rdx],al
      d8c891:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d8c894:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      d8c899:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d8c89e:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      d8c8a3:	e8 7a 85 89 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d8c8a8:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      d8c8ad:	e8 b8 d6 ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8c8b2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d8c8b7:	e8 74 a4 d1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d8c8bc:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d8c8c1:	e8 e4 28 d3 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d8c8c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8c8cd:	00 00 
      d8c8cf:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
      d8c8d6:	00 
      d8c8d7:	75 78                	jne    d8c951 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x599d7>
      d8c8d9:	48 81 c4 98 00 00 00 	add    rsp,0x98
      d8c8e0:	5b                   	pop    rbx
      d8c8e1:	41 5e                	pop    r14
      d8c8e3:	41 5f                	pop    r15
      d8c8e5:	5d                   	pop    rbp
      d8c8e6:	c3                   	ret
      d8c8e7:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d8c8eb:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d8c8ee:	e9 4d ff ff ff       	jmp    d8c840 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x598c6>
      d8c8f3:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d8c8f7:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d8c8fa:	e9 71 ff ff ff       	jmp    d8c870 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x598f6>
      d8c8ff:	48 89 c3             	mov    rbx,rax

### caller 0xd8cbc6 FDE=(14207792, 14208084)
      d8cb8c:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d8cb91:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
      d8cb95:	48 8d 73 08          	lea    rsi,[rbx+0x8]
      d8cb99:	48 8b 57 e8          	mov    rdx,QWORD PTR [rdi-0x18]
      d8cb9d:	f6 c2 01             	test   dl,0x1
      d8cba0:	75 63                	jne    d8cc05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59c8b>
      d8cba2:	e8 eb 8b 9d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d8cba7:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
      d8cbab:	31 c0                	xor    eax,eax
      d8cbad:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      d8cbb2:	88 02                	mov    BYTE PTR [rdx],al
      d8cbb4:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      d8cbb7:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      d8cbbc:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d8cbc1:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      d8cbc6:	e8 57 82 89 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      d8cbcb:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      d8cbd0:	e8 95 d3 ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8cbd5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d8cbda:	e8 51 a1 d1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d8cbdf:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d8cbe4:	e8 c1 25 d3 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d8cbe9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8cbf0:	00 00 
      d8cbf2:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
      d8cbf9:	00 
      d8cbfa:	75 53                	jne    d8cc4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59cd5>
      d8cbfc:	48 81 c4 a0 00 00 00 	add    rsp,0xa0
      d8cc03:	5b                   	pop    rbx
      d8cc04:	c3                   	ret
      d8cc05:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      d8cc09:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      d8cc0c:	eb 94                	jmp    d8cba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59c28>
      d8cc0e:	48 89 c3             	mov    rbx,rax
      d8cc11:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      d8cc16:	e8 4f d3 ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8cc1b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d8cc20:	e8 0b a1 d1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d8cc25:	eb 03                	jmp    d8cc2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59cb0>
      d8cc27:	48 89 c3             	mov    rbx,rax

### caller 0xdb63c8 FDE=(14376564, 14379773)
      db638b:	e8 56 f4 9a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      db6390:	48 8d 9c 24 c0 00 00 	lea    rbx,[rsp+0xc0]
      db6397:	00 
      db6398:	48 89 df             	mov    rdi,rbx
      db639b:	e8 f0 7a a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      db63a0:	49 8b bd f8 02 00 00 	mov    rdi,QWORD PTR [r13+0x2f8]
      db63a7:	31 c0                	xor    eax,eax
      db63a9:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
      db63b0:	00 
      db63b1:	88 02                	mov    BYTE PTR [rdx],al
      db63b3:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      db63b6:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      db63bb:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      db63c0:	48 8d 8c 24 c0 00 00 	lea    rcx,[rsp+0xc0]
      db63c7:	00 
      db63c8:	e8 55 ea 86 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      db63cd:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      db63d4:	00 
      db63d5:	e8 90 3b cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      db63da:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      db63e1:	00 
      db63e2:	e8 49 09 cf ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      db63e7:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      db63ec:	e8 b9 8d d0 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      db63f1:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      db63f6:	e8 95 7a a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      db63fb:	eb 62                	jmp    db645f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x834e5>
      db63fd:	40 84 ed             	test   bpl,bpl
      db6400:	75 5d                	jne    db645f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x834e5>
      db6402:	49 8b 45 38          	mov    rax,QWORD PTR [r13+0x38]
      db6406:	80 78 30 00          	cmp    BYTE PTR [rax+0x30],0x0
      db640a:	74 53                	je     db645f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x834e5>
      db640c:	80 78 38 00          	cmp    BYTE PTR [rax+0x38],0x0
      db6410:	75 4d                	jne    db645f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x834e5>
      db6412:	48 8b 58 28          	mov    rbx,QWORD PTR [rax+0x28]
      db6416:	49 8d 95 a0 00 00 00 	lea    rdx,[r13+0xa0]
      db641d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      db6422:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      db6427:	e8 d7 71 ea ff       	call   c5d603 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aa5a3>
      db642c:	49 8b 7d 38          	mov    rdi,QWORD PTR [r13+0x38]

### caller 0xdb6849 FDE=(14376564, 14379773)
      db680c:	e8 d5 ef 9a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      db6811:	48 8d 9c 24 c0 00 00 	lea    rbx,[rsp+0xc0]
      db6818:	00 
      db6819:	48 89 df             	mov    rdi,rbx
      db681c:	e8 6f 76 a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      db6821:	49 8b bd f8 02 00 00 	mov    rdi,QWORD PTR [r13+0x2f8]
      db6828:	31 c0                	xor    eax,eax
      db682a:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
      db6831:	00 
      db6832:	88 02                	mov    BYTE PTR [rdx],al
      db6834:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      db6837:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      db683c:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      db6841:	48 8d 8c 24 c0 00 00 	lea    rcx,[rsp+0xc0]
      db6848:	00 
      db6849:	e8 d4 e5 86 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      db684e:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      db6855:	00 
      db6856:	e8 0f 37 cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      db685b:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      db6862:	00 
      db6863:	e8 c8 04 cf ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      db6868:	49 8b 7d 38          	mov    rdi,QWORD PTR [r13+0x38]
      db686c:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      db6870:	48 85 c0             	test   rax,rax
      db6873:	74 18                	je     db688d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83913>
      db6875:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      db6878:	48 89 c7             	mov    rdi,rax
      db687b:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      db687e:	84 c0                	test   al,al
      db6880:	74 07                	je     db6889 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8390f>
      db6882:	31 db                	xor    ebx,ebx
      db6884:	40 b5 01             	mov    bpl,0x1
      db6887:	eb 0f                	jmp    db6898 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8391e>
      db6889:	49 8b 7d 38          	mov    rdi,QWORD PTR [r13+0x38]
      db688d:	31 ed                	xor    ebp,ebp
      db688f:	31 f6                	xor    esi,esi
      db6891:	e8 da 70 00 00       	call   dbd970 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a9f6>
      db6896:	89 c3                	mov    ebx,eax
      db6898:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]

### caller 0xdb71ad FDE=(14380256, 14381941)
      db716d:	0f 85 1d 01 00 00    	jne    db7290 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84316>
      db7173:	48 8d 35 68 3e 57 ff 	lea    rsi,[rip+0xffffffffff573e68]        # 32afe2 <_ZTSSt12bad_any_cast@@Base-0x651e6>
      db717a:	4c 89 f7             	mov    rdi,r14
      db717d:	e8 d0 eb d4 ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      db7182:	48 8b bb 60 05 00 00 	mov    rdi,QWORD PTR [rbx+0x560]
      db7189:	31 c0                	xor    eax,eax
      db718b:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]
      db7192:	00 
      db7193:	88 02                	mov    BYTE PTR [rdx],al
      db7195:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      db7198:	48 8d 8c 24 b0 01 00 	lea    rcx,[rsp+0x1b0]
      db719f:	00 
      db71a0:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      db71a5:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
      db71ac:	00 
      db71ad:	e8 70 dc 86 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      db71b2:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      db71b9:	00 
      db71ba:	e8 ab 2d cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      db71bf:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      db71c6:	00 
      db71c7:	e8 64 fb ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      db71cc:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      db71d3:	00 
      db71d4:	e8 d1 7f d0 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      db71d9:	48 8d bb c0 05 00 00 	lea    rdi,[rbx+0x5c0]
      db71e0:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
      db71e7:	00 
      db71e8:	e8 6d e2 d1 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
      db71ed:	80 bb 00 07 00 00 00 	cmp    BYTE PTR [rbx+0x700],0x0
      db71f4:	74 16                	je     db720c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84292>
      db71f6:	48 8b b3 f0 06 00 00 	mov    rsi,QWORD PTR [rbx+0x6f0]
      db71fd:	8b bb e8 06 00 00    	mov    edi,DWORD PTR [rbx+0x6e8]
      db7203:	e8 18 46 cc ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
      db7208:	84 c0                	test   al,al
      db720a:	75 17                	jne    db7223 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x842a9>
      db720c:	48 81 c3 e8 06 00 00 	add    rbx,0x6e8
      db7213:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]
      db721a:	00 
      db721b:	48 89 df             	mov    rdi,rbx

### caller 0xdba759 FDE=(14394414, 14396039)
      dba71a:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      dba71f:	4c 89 f7             	mov    rdi,r14
      dba722:	e8 bf b0 9a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      dba727:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
      dba72c:	4c 89 f7             	mov    rdi,r14
      dba72f:	e8 5c 37 a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dba734:	48 8b bb 50 02 00 00 	mov    rdi,QWORD PTR [rbx+0x250]
      dba73b:	31 c0                	xor    eax,eax
      dba73d:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      dba742:	88 02                	mov    BYTE PTR [rdx],al
      dba744:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dba747:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
      dba74c:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
      dba753:	00 
      dba754:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      dba759:	e8 c4 a6 86 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dba75e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      dba763:	e8 02 f8 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dba768:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      dba76d:	e8 be c5 ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dba772:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      dba779:	00 
      dba77a:	e8 2b 4a d0 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      dba77f:	8a 83 28 04 00 00    	mov    al,BYTE PTR [rbx+0x428]
      dba785:	81 fd 93 01 00 00    	cmp    ebp,0x193
      dba78b:	75 1d                	jne    dba7aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87830>
      dba78d:	84 c0                	test   al,al
      dba78f:	74 19                	je     dba7aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87830>
      dba791:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      dba796:	48 89 df             	mov    rdi,rbx
      dba799:	ba 93 01 00 00       	mov    edx,0x193
      dba79e:	e8 15 15 00 00       	call   dbbcb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88d3e>
      dba7a3:	6a 03                	push   0x3
      dba7a5:	e9 fe 00 00 00       	jmp    dba8a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8792e>
      dba7aa:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
      dba7af:	4c 8d 3d fa a7 b8 00 	lea    r15,[rip+0xb8a7fa]        # 1944fb0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xdbf8>
      dba7b6:	8b 4c 24 20          	mov    ecx,DWORD PTR [rsp+0x20]
      dba7ba:	4c 39 fa             	cmp    rdx,r15
      dba7bd:	75 1b                	jne    dba7da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87860>
      dba7bf:	83 f9 08             	cmp    ecx,0x8

### caller 0xdbb2b5 FDE=(14397204, 14398328)
      dbb278:	4c 89 ff             	mov    rdi,r15
      dbb27b:	e8 66 a5 9a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      dbb280:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
      dbb287:	00 
      dbb288:	4c 89 ff             	mov    rdi,r15
      dbb28b:	e8 00 2c a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dbb290:	49 8b be 50 02 00 00 	mov    rdi,QWORD PTR [r14+0x250]
      dbb297:	31 c0                	xor    eax,eax
      dbb299:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
      dbb29e:	88 02                	mov    BYTE PTR [rdx],al
      dbb2a0:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dbb2a3:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      dbb2a8:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
      dbb2ad:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
      dbb2b4:	00 
      dbb2b5:	e8 68 9b 86 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dbb2ba:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      dbb2c1:	00 
      dbb2c2:	e8 a3 ec cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbb2c7:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      dbb2cc:	e8 5f ba ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dbb2d1:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      dbb2d6:	e8 cf 3e d0 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      dbb2db:	31 c0                	xor    eax,eax
      dbb2dd:	81 3b a0 01 00 00    	cmp    DWORD PTR [rbx],0x1a0
      dbb2e3:	6a 12                	push   0x12
      dbb2e5:	e9 81 fd ff ff       	jmp    dbb06b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x880f1>
      dbb2ea:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      dbb2ee:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      dbb2f1:	e9 1c ff ff ff       	jmp    dbb212 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88298>
      dbb2f6:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      dbb2fa:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      dbb2fd:	e9 6e ff ff ff       	jmp    dbb270 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x882f6>
      dbb302:	48 89 c3             	mov    rbx,rax
      dbb305:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      dbb30c:	00 
      dbb30d:	e8 58 ec cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbb312:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      dbb317:	e8 14 ba ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dbb31c:	eb 17                	jmp    dbb335 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x883bb>

### caller 0xdbb957 FDE=(14399422, 14400009)
      dbb915:	0f 85 8b 00 00 00    	jne    dbb9a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88a2c>
      dbb91b:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      dbb920:	48 89 df             	mov    rdi,rbx
      dbb923:	e8 be 9e 9a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      dbb928:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
      dbb92d:	48 89 df             	mov    rdi,rbx
      dbb930:	e8 5b 25 a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dbb935:	49 8b bf 50 02 00 00 	mov    rdi,QWORD PTR [r15+0x250]
      dbb93c:	31 c0                	xor    eax,eax
      dbb93e:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      dbb943:	88 02                	mov    BYTE PTR [rdx],al
      dbb945:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dbb948:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      dbb94d:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      dbb952:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      dbb957:	e8 c6 94 86 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dbb95c:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      dbb961:	e8 04 e6 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbb966:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      dbb96b:	e8 c0 b3 ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dbb970:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      dbb975:	e8 30 38 d0 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      dbb97a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dbb981:	00 00 
      dbb983:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
      dbb98a:	00 
      dbb98b:	75 77                	jne    dbba04 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88a8a>
      dbb98d:	48 81 c4 a0 00 00 00 	add    rsp,0xa0
      dbb994:	5b                   	pop    rbx
      dbb995:	41 5e                	pop    r14
      dbb997:	41 5f                	pop    r15
      dbb999:	c3                   	ret
      dbb99a:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      dbb99e:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      dbb9a1:	e9 25 ff ff ff       	jmp    dbb8cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88951>
      dbb9a6:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      dbb9aa:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      dbb9ad:	e9 69 ff ff ff       	jmp    dbb91b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x889a1>
      dbb9b2:	48 89 c3             	mov    rbx,rax
      dbb9b5:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]

### caller 0xdbe3b7 FDE=(14410468, 14410884)
      dbe37c:	48 8b 71 20          	mov    rsi,QWORD PTR [rcx+0x20]
      dbe380:	83 4f e0 18          	or     DWORD PTR [rdi-0x20],0x18
      dbe384:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      dbe388:	48 8b 57 d8          	mov    rdx,QWORD PTR [rdi-0x28]
      dbe38c:	f6 c2 01             	test   dl,0x1
      dbe38f:	0f 85 c4 00 00 00    	jne    dbe459 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b4df>
      dbe395:	e8 f8 73 9a 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      dbe39a:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      dbe39e:	31 c0                	xor    eax,eax
      dbe3a0:	48 89 e2             	mov    rdx,rsp
      dbe3a3:	88 02                	mov    BYTE PTR [rdx],al
      dbe3a5:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dbe3a8:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      dbe3ad:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      dbe3b2:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      dbe3b7:	e8 66 6a 86 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dbe3bc:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      dbe3c1:	e8 a4 bb cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbe3c6:	48 89 e7             	mov    rdi,rsp
      dbe3c9:	e8 62 89 ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dbe3ce:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      dbe3d3:	e8 48 26 d0 ff       	call   ac0a20 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9c0>
      dbe3d8:	48 8b bb 20 01 00 00 	mov    rdi,QWORD PTR [rbx+0x120]
      dbe3df:	e8 a2 00 ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbe3e4:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
      dbe3eb:	e8 96 00 ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbe3f0:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
      dbe3f7:	e8 6e bb cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbe3fc:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
      dbe403:	e8 7e 00 ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbe408:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      dbe40f:	e8 20 5a ff ff       	call   db3e34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80eba>
      dbe414:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
      dbe418:	e8 3d 5a ff ff       	call   db3e5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80ee0>
      dbe41d:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
      dbe421:	e8 6e 6a 8a 00       	call   1664e94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19000>
      dbe426:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
      dbe42a:	e8 57 00 ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbe42f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dbe436:	00 00 

### caller 0xdbf862 FDE=(14415028, 14416248)
      dbf823:	83 4f c8 40          	or     DWORD PTR [rdi-0x38],0x40
      dbf827:	48 83 c2 07          	add    rdx,0x7
      dbf82b:	48 8b 4f c0          	mov    rcx,QWORD PTR [rdi-0x40]
      dbf82f:	f6 c1 01             	test   cl,0x1
      dbf832:	0f 85 27 01 00 00    	jne    dbf95f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c9e5>
      dbf838:	e8 1f 5f 9a 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
      dbf83d:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
      dbf844:	31 c0                	xor    eax,eax
      dbf846:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
      dbf84b:	88 02                	mov    BYTE PTR [rdx],al
      dbf84d:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dbf850:	48 8d 8c 24 10 01 00 	lea    rcx,[rsp+0x110]
      dbf857:	00 
      dbf858:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      dbf85d:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      dbf862:	e8 bb 55 86 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dbf867:	4c 8d 73 18          	lea    r14,[rbx+0x18]
      dbf86b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      dbf872:	00 
      dbf873:	e8 f2 a6 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbf878:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      dbf87d:	e8 ae 74 ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dbf882:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      dbf887:	e8 f2 a4 3d 00       	call   1199d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361194>
      dbf88c:	48 89 e7             	mov    rdi,rsp
      dbf88f:	e8 c0 75 ce ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
      dbf894:	48 8b bb e8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1e8]
      dbf89b:	e8 e6 eb cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbf8a0:	48 8d bb c8 01 00 00 	lea    rdi,[rbx+0x1c8]
      dbf8a7:	e8 9a 1e a0 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      dbf8ac:	48 8b bb c0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1c0]
      dbf8b3:	e8 ce eb cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbf8b8:	48 8b bb b0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b0]
      dbf8bf:	e8 c2 eb cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbf8c4:	48 8d bb 48 01 00 00 	lea    rdi,[rbx+0x148]
      dbf8cb:	e8 58 be cb ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      dbf8d0:	48 8b bb 40 01 00 00 	mov    rdi,QWORD PTR [rbx+0x140]
      dbf8d7:	e8 aa eb cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbf8dc:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
      dbf8e3:	e8 b6 1c 84 00       	call   160159e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x446b22>

### caller 0xdc5aa4 FDE=(14439736, 14441397)
      dc5a5f:	48 19 c9             	sbb    rcx,rcx
      dc5a62:	49 0b 8e b8 00 00 00 	or     rcx,QWORD PTR [r14+0xb8]
      dc5a69:	41 3b 44 24 70       	cmp    eax,DWORD PTR [r12+0x70]
      dc5a6e:	ba 00 00 00 00       	mov    edx,0x0
      dc5a73:	48 19 d2             	sbb    rdx,rdx
      dc5a76:	48 09 ca             	or     rdx,rcx
      dc5a79:	48 89 96 90 01 00 00 	mov    QWORD PTR [rsi+0x190],rdx
      dc5a80:	81 4e 14 00 c0 00 00 	or     DWORD PTR [rsi+0x14],0xc000
      dc5a87:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
      dc5a8c:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
      dc5a90:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
      dc5a95:	88 02                	mov    BYTE PTR [rdx],al
      dc5a97:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dc5a9a:	48 8d 4c 24 70       	lea    rcx,[rsp+0x70]
      dc5a9f:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      dc5aa4:	e8 79 f3 85 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dc5aa9:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      dc5aae:	e8 b7 44 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc5ab3:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      dc5ab8:	e8 73 12 ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dc5abd:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      dc5ac4:	00 
      dc5ac5:	e8 ca d6 88 00       	call   1653194 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7300>
      dc5aca:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dc5ad1:	00 00 
      dc5ad3:	48 3b 84 24 60 02 00 	cmp    rax,QWORD PTR [rsp+0x260]
      dc5ada:	00 
      dc5adb:	0f 85 cf 00 00 00    	jne    dc5bb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92c36>
      dc5ae1:	48 81 c4 68 02 00 00 	add    rsp,0x268
      dc5ae8:	5b                   	pop    rbx
      dc5ae9:	41 5c                	pop    r12
      dc5aeb:	41 5d                	pop    r13
      dc5aed:	41 5e                	pop    r14
      dc5aef:	41 5f                	pop    r15
      dc5af1:	5d                   	pop    rbp
      dc5af2:	c3                   	ret
      dc5af3:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      dc5af7:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      dc5afa:	e9 4d fc ff ff       	jmp    dc574c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x927d2>
      dc5aff:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe

### caller 0xdc5f27 FDE=(14441472, 14442501)
      dc5ee9:	89 c1                	mov    ecx,eax
      dc5eeb:	81 c9 00 00 06 00    	or     ecx,0x60000
      dc5ef1:	89 4b 20             	mov    DWORD PTR [rbx+0x20],ecx
      dc5ef4:	41 8a 8e c8 00 00 00 	mov    cl,BYTE PTR [r14+0xc8]
      dc5efb:	88 8b c0 00 00 00    	mov    BYTE PTR [rbx+0xc0],cl
      dc5f01:	0d 00 00 0e 00       	or     eax,0xe0000
      dc5f06:	89 43 20             	mov    DWORD PTR [rbx+0x20],eax
      dc5f09:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      dc5f0d:	31 c0                	xor    eax,eax
      dc5f0f:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      dc5f14:	88 02                	mov    BYTE PTR [rdx],al
      dc5f16:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dc5f19:	49 83 64 24 20 00    	and    QWORD PTR [r12+0x20],0x0
      dc5f1f:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      dc5f24:	4c 89 fe             	mov    rsi,r15
      dc5f27:	e8 f6 ee 85 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dc5f2c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      dc5f31:	e8 34 40 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc5f36:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      dc5f3b:	e8 f0 0d ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dc5f40:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dc5f47:	00 00 
      dc5f49:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
      dc5f50:	00 
      dc5f51:	0f 85 a9 00 00 00    	jne    dc6000 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93086>
      dc5f57:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
      dc5f5e:	5b                   	pop    rbx
      dc5f5f:	41 5c                	pop    r12
      dc5f61:	41 5d                	pop    r13
      dc5f63:	41 5e                	pop    r14
      dc5f65:	41 5f                	pop    r15
      dc5f67:	5d                   	pop    rbp
      dc5f68:	c3                   	ret
      dc5f69:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      dc5f6d:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      dc5f70:	e9 5d fd ff ff       	jmp    dc5cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92d58>
      dc5f75:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe
      dc5f79:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      dc5f7c:	e9 b6 fd ff ff       	jmp    dc5d37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92dbd>
      dc5f81:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe

### caller 0xdc60cc FDE=(14442502, 14442795)
      dc6097:	ff 
      dc6098:	66 0f 5c 0d 10 68 5c 	subpd  xmm1,XMMWORD PTR [rip+0xffffffffff5c6810]        # 38c8b0 <_ZTSSt12bad_any_cast@@Base-0x3918>
      dc609f:	ff 
      dc60a0:	66 0f 7c c9          	haddpd xmm1,xmm1
      dc60a4:	f2 0f 5e c1          	divsd  xmm0,xmm1
      dc60a8:	f2 0f 11 43 70       	movsd  QWORD PTR [rbx+0x70],xmm0
      dc60ad:	80 4b 21 02          	or     BYTE PTR [rbx+0x21],0x2
      dc60b1:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      dc60b5:	31 c0                	xor    eax,eax
      dc60b7:	48 89 e2             	mov    rdx,rsp
      dc60ba:	88 02                	mov    BYTE PTR [rdx],al
      dc60bc:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dc60bf:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      dc60c4:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      dc60c9:	4c 89 f6             	mov    rsi,r14
      dc60cc:	e8 51 ed 85 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dc60d1:	48 81 c3 98 00 00 00 	add    rbx,0x98
      dc60d8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      dc60dd:	e8 88 3e cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc60e2:	48 89 e7             	mov    rdi,rsp
      dc60e5:	e8 46 0c ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dc60ea:	48 89 df             	mov    rdi,rbx
      dc60ed:	e8 36 56 cb ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      dc60f2:	4c 89 f7             	mov    rdi,r14
      dc60f5:	e8 ec 63 d1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      dc60fa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dc6101:	00 00 
      dc6103:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
      dc6108:	75 14                	jne    dc611e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x931a4>
      dc610a:	48 83 c4 58          	add    rsp,0x58
      dc610e:	5b                   	pop    rbx
      dc610f:	41 5e                	pop    r14
      dc6111:	c3                   	ret
      dc6112:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe
      dc6116:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      dc6119:	e9 36 ff ff ff       	jmp    dc6054 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x930da>
      dc611e:	e8 8d 99 a2 00       	call   17efab0 <__stack_chk_fail@plt>
      dc6123:	48 89 c7             	mov    rdi,rax
      dc6126:	e8 7a 39 cb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      dc612b:	cc                   	int3

### caller 0xdc67de FDE=(14444454, 14444634)
      dc67a7:	48 83 ec 60          	sub    rsp,0x60
      dc67ab:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dc67b2:	00 00 
      dc67b4:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      dc67b9:	83 7f 60 00          	cmp    DWORD PTR [rdi+0x60],0x0
      dc67bd:	7e 53                	jle    dc6812 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93898>
      dc67bf:	48 89 fb             	mov    rbx,rdi
      dc67c2:	48 8d 77 40          	lea    rsi,[rdi+0x40]
      dc67c6:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      dc67ca:	31 c0                	xor    eax,eax
      dc67cc:	48 89 e2             	mov    rdx,rsp
      dc67cf:	88 02                	mov    BYTE PTR [rdx],al
      dc67d1:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dc67d4:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      dc67d9:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      dc67de:	e8 3f e6 85 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dc67e3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      dc67e8:	e8 7d 37 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc67ed:	48 89 e7             	mov    rdi,rsp
      dc67f0:	e8 3b 05 ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dc67f5:	83 a3 88 00 00 00 00 	and    DWORD PTR [rbx+0x88],0x0
      dc67fc:	80 63 50 f7          	and    BYTE PTR [rbx+0x50],0xf7
      dc6800:	83 7b 60 00          	cmp    DWORD PTR [rbx+0x60],0x0
      dc6804:	7e 0c                	jle    dc6812 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93898>
      dc6806:	48 83 c3 58          	add    rbx,0x58
      dc680a:	48 89 df             	mov    rdi,rbx
      dc680d:	e8 d4 a0 cf ff       	call   ac08e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd886>
      dc6812:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dc6819:	00 00 
      dc681b:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      dc6820:	75 33                	jne    dc6855 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x938db>
      dc6822:	48 83 c4 60          	add    rsp,0x60
      dc6826:	5b                   	pop    rbx
      dc6827:	c3                   	ret
      dc6828:	48 89 c3             	mov    rbx,rax
      dc682b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      dc6830:	e8 35 37 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc6835:	48 89 e7             	mov    rdi,rsp
      dc6838:	e8 f3 04 ce ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dc683d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### caller 0xdc7e28 FDE=(14448622, 14450598)
      dc7df4:	41 5f                	pop    r15
      dc7df6:	5d                   	pop    rbp
      dc7df7:	c3                   	ret
      dc7df8:	d1 e8                	shr    eax,1
      dc7dfa:	48 89 83 28 01 00 00 	mov    QWORD PTR [rbx+0x128],rax
      dc7e01:	83 8b f8 00 00 00 60 	or     DWORD PTR [rbx+0xf8],0x60
      dc7e08:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      dc7e0c:	31 c0                	xor    eax,eax
      dc7e0e:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
      dc7e13:	88 02                	mov    BYTE PTR [rdx],al
      dc7e15:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dc7e18:	48 8d 8c 24 c0 00 00 	lea    rcx,[rsp+0xc0]
      dc7e1f:	00 
      dc7e20:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      dc7e25:	48 89 ee             	mov    rsi,rbp
      dc7e28:	e8 f5 cf 85 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dc7e2d:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      dc7e34:	00 
      dc7e35:	e8 30 21 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc7e3a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      dc7e3f:	e8 ec ee cd ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dc7e44:	48 8b 5b 20          	mov    rbx,QWORD PTR [rbx+0x20]
      dc7e48:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      dc7e4d:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      dc7e51:	e8 3a 24 cb ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      dc7e56:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      dc7e5d:	00 
      dc7e5e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      dc7e63:	e8 d8 60 a2 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      dc7e68:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      dc7e6f:	00 
      dc7e70:	4c 89 ee             	mov    rsi,r13
      dc7e73:	e8 c8 60 a2 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      dc7e78:	48 8d 05 99 9d 68 ff 	lea    rax,[rip+0xffffffffff689d99]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      dc7e7f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      dc7e84:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      dc7e89:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
      dc7e8f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      dc7e96:	00 
      dc7e97:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]

### caller 0xdc8722 FDE=(14452022, 14452939)
      dc86df:	48 69 c0 40 42 0f 00 	imul   rax,rax,0xf4240
      dc86e6:	48 2b 83 a8 01 00 00 	sub    rax,QWORD PTR [rbx+0x1a8]
      dc86ed:	b9 40 42 0f 00       	mov    ecx,0xf4240
      dc86f2:	48 99                	cqo
      dc86f4:	48 f7 f9             	idiv   rcx
      dc86f7:	48 89 83 48 01 00 00 	mov    QWORD PTR [rbx+0x148],rax
      dc86fe:	80 8b f9 00 00 00 08 	or     BYTE PTR [rbx+0xf9],0x8
      dc8705:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      dc8709:	31 c0                	xor    eax,eax
      dc870b:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
      dc8710:	88 02                	mov    BYTE PTR [rdx],al
      dc8712:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dc8715:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
      dc871c:	00 
      dc871d:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      dc8722:	e8 fb c6 85 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dc8727:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      dc872e:	00 
      dc872f:	e8 36 18 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc8734:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      dc8739:	e8 f2 e5 cd ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dc873e:	4c 8b 7b 20          	mov    r15,QWORD PTR [rbx+0x20]
      dc8742:	48 8d b3 60 01 00 00 	lea    rsi,[rbx+0x160]
      dc8749:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      dc874e:	e8 3d 1b cb ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      dc8753:	0f 10 44 24 40       	movups xmm0,XMMWORD PTR [rsp+0x40]
      dc8758:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      dc875f:	00 
      dc8760:	0f 29 47 e8          	movaps XMMWORD PTR [rdi-0x18],xmm0
      dc8764:	44 89 77 f8          	mov    DWORD PTR [rdi-0x8],r14d
      dc8768:	49 c1 ee 20          	shr    r14,0x20
      dc876c:	44 88 77 fc          	mov    BYTE PTR [rdi-0x4],r14b
      dc8770:	48 81 c3 d0 00 00 00 	add    rbx,0xd0
      dc8777:	48 89 de             	mov    rsi,rbx
      dc877a:	e8 c1 57 a2 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      dc877f:	48 8d 05 92 94 68 ff 	lea    rax,[rip+0xffffffffff689492]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      dc8786:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      dc878b:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      dc8790:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
      dc8796:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]

### caller 0xdc8dea FDE=(14453706, 14454784)
      dc8da7:	48 69 c0 40 42 0f 00 	imul   rax,rax,0xf4240
      dc8dae:	48 2b 83 a8 01 00 00 	sub    rax,QWORD PTR [rbx+0x1a8]
      dc8db5:	b9 40 42 0f 00       	mov    ecx,0xf4240
      dc8dba:	48 99                	cqo
      dc8dbc:	48 f7 f9             	idiv   rcx
      dc8dbf:	48 89 83 48 01 00 00 	mov    QWORD PTR [rbx+0x148],rax
      dc8dc6:	80 8b f9 00 00 00 08 	or     BYTE PTR [rbx+0xf9],0x8
      dc8dcd:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      dc8dd1:	31 c0                	xor    eax,eax
      dc8dd3:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      dc8dd8:	88 02                	mov    BYTE PTR [rdx],al
      dc8dda:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      dc8ddd:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
      dc8de4:	00 
      dc8de5:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      dc8dea:	e8 33 c0 85 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      dc8def:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      dc8df6:	00 
      dc8df7:	e8 6e 11 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc8dfc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      dc8e01:	e8 2a df cd ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      dc8e06:	4c 8b 7b 20          	mov    r15,QWORD PTR [rbx+0x20]
      dc8e0a:	48 8d b3 60 01 00 00 	lea    rsi,[rbx+0x160]
      dc8e11:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      dc8e16:	e8 75 14 cb ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      dc8e1b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      dc8e20:	4c 89 f6             	mov    rsi,r14
      dc8e23:	e8 18 51 a2 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      dc8e28:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      dc8e2d:	40 88 6f f8          	mov    BYTE PTR [rdi-0x8],bpl
      dc8e31:	48 81 c3 d0 00 00 00 	add    rbx,0xd0
      dc8e38:	48 89 de             	mov    rsi,rbx
      dc8e3b:	e8 00 51 a2 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      dc8e40:	48 8d 05 d1 8d 68 ff 	lea    rax,[rip+0xffffffffff688dd1]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      dc8e47:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      dc8e4c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      dc8e51:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
      dc8e57:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      dc8e5e:	00 
      dc8e5f:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]

### caller 0xde2dc8 FDE=(14559994, 14561359)
      de2d93:	49 89 c4             	mov    r12,rax
      de2d96:	4c 39 e8             	cmp    rax,r13
      de2d99:	75 98                	jne    de2d33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xafdb9>
      de2d9b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      de2da0:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      de2da4:	31 c0                	xor    eax,eax
      de2da6:	48 8d 94 24 e0 00 00 	lea    rdx,[rsp+0xe0]
      de2dad:	00 
      de2dae:	88 02                	mov    BYTE PTR [rdx],al
      de2db0:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      de2db3:	48 8d 8c 24 30 02 00 	lea    rcx,[rsp+0x230]
      de2dba:	00 
      de2dbb:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      de2dc0:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
      de2dc7:	00 
      de2dc8:	e8 55 20 84 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      de2dcd:	89 c3                	mov    ebx,eax
      de2dcf:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
      de2dd6:	00 
      de2dd7:	e8 8e 71 c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      de2ddc:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      de2de3:	00 
      de2de4:	e8 47 3f cc ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      de2de9:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      de2df0:	00 
      de2df1:	e8 36 f1 86 00       	call   1651f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098>
      de2df6:	85 db                	test   ebx,ebx
      de2df8:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
      de2dfd:	0f 84 50 01 00 00    	je     de2f53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaffd9>
      de2e03:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
      de2e0a:	00 
      de2e0b:	4c 89 f7             	mov    rdi,r14
      de2e0e:	89 de                	mov    esi,ebx
      de2e10:	e8 7b b9 a0 00       	call   17ee790 <_ZNSt6__ndk19to_stringEi@plt>
      de2e15:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      de2e19:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
      de2e20:	00 
      de2e21:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      de2e25:	0f 29 84 24 30 02 00 	movaps XMMWORD PTR [rsp+0x230],xmm0
      de2e2c:	00 

### caller 0xde3486 FDE=(14561360, 14562654)
      de344d:	e8 c0 d0 cd ff       	call   ac0512 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4b2>
      de3452:	41 ff 06             	inc    DWORD PTR [r14]
      de3455:	49 83 c4 20          	add    r12,0x20
      de3459:	4c 89 e7             	mov    rdi,r12
      de345c:	4c 89 fe             	mov    rsi,r15
      de345f:	e8 1c ac a0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      de3464:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      de3468:	31 c0                	xor    eax,eax
      de346a:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      de346f:	88 02                	mov    BYTE PTR [rdx],al
      de3471:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      de3474:	48 8d 8c 24 f0 01 00 	lea    rcx,[rsp+0x1f0]
      de347b:	00 
      de347c:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      de3481:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      de3486:	e8 97 19 84 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      de348b:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
      de3492:	00 
      de3493:	e8 d2 6a c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      de3498:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      de349d:	e8 8e 38 cc ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      de34a2:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      de34a7:	e8 7e ed 86 00       	call   165222a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6396>
      de34ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      de34b3:	00 00 
      de34b5:	48 3b 84 24 20 02 00 	cmp    rax,QWORD PTR [rsp+0x220]
      de34bc:	00 
      de34bd:	0f 85 96 00 00 00    	jne    de3559 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb05df>
      de34c3:	48 81 c4 28 02 00 00 	add    rsp,0x228
      de34ca:	5b                   	pop    rbx
      de34cb:	41 5c                	pop    r12
      de34cd:	41 5d                	pop    r13
      de34cf:	41 5e                	pop    r14
      de34d1:	41 5f                	pop    r15
      de34d3:	5d                   	pop    rbp
      de34d4:	c3                   	ret
      de34d5:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      de34d9:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      de34dc:	e9 22 fd ff ff       	jmp    de3203 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb0289>
      de34e1:	48 89 c3             	mov    rbx,rax

### caller 0xdf1cbc FDE=(14621006, 14622676)
      df1c82:	f6 c2 01             	test   dl,0x1
      df1c85:	0f 85 d3 00 00 00    	jne    df1d5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbede4>
      df1c8b:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
      df1c92:	00 
      df1c93:	4c 89 f6             	mov    rsi,r14
      df1c96:	e8 f7 3a 97 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      df1c9b:	31 c0                	xor    eax,eax
      df1c9d:	88 44 24 30          	mov    BYTE PTR [rsp+0x30],al
      df1ca1:	88 44 24 48          	mov    BYTE PTR [rsp+0x48],al
      df1ca5:	48 83 a4 24 50 03 00 	and    QWORD PTR [rsp+0x350],0x0
      df1cac:	00 00 
      df1cae:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      df1cb3:	48 89 ee             	mov    rsi,rbp
      df1cb6:	48 89 da             	mov    rdx,rbx
      df1cb9:	4c 89 f9             	mov    rcx,r15
      df1cbc:	e8 61 31 83 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      df1cc1:	4c 89 ff             	mov    rdi,r15
      df1cc4:	e8 a1 82 c8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      df1cc9:	48 89 df             	mov    rdi,rbx
      df1ccc:	e8 5f 50 cb ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      df1cd1:	48 89 ef             	mov    rdi,rbp
      df1cd4:	e8 21 e7 85 00       	call   16503fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4566>
      df1cd9:	49 8d 86 e0 02 00 00 	lea    rax,[r14+0x2e0]
      df1ce0:	49 83 c6 68          	add    r14,0x68
      df1ce4:	4d 39 e6             	cmp    r14,r12
      df1ce7:	49 89 c6             	mov    r14,rax
      df1cea:	0f 85 f0 fc ff ff    	jne    df19e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbea66>
      df1cf0:	eb 78                	jmp    df1d6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbedf0>
      df1cf2:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      df1cf6:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      df1cf9:	e9 e1 fd ff ff       	jmp    df1adf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbeb65>
      df1cfe:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      df1d02:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      df1d05:	e9 fb fd ff ff       	jmp    df1b05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbeb8b>
      df1d0a:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      df1d0e:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      df1d11:	e9 28 fe ff ff       	jmp    df1b3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbebc4>
      df1d16:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      df1d1a:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      df1d1d:	e9 45 fe ff ff       	jmp    df1b67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbebed>

### caller 0xe0be60 FDE=(14728166, 14728906)
      e0be2a:	4d 85 e4             	test   r12,r12
      e0be2d:	74 08                	je     e0be37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8ebd>
      e0be2f:	4c 89 64 24 58       	mov    QWORD PTR [rsp+0x58],r12
      e0be34:	83 c8 08             	or     eax,0x8
      e0be37:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      e0be3c:	4c 89 6e 28          	mov    QWORD PTR [rsi+0x28],r13
      e0be40:	83 c8 04             	or     eax,0x4
      e0be43:	89 46 10             	mov    DWORD PTR [rsi+0x10],eax
      e0be46:	48 8b 7d 10          	mov    rdi,QWORD PTR [rbp+0x10]
      e0be4a:	31 c0                	xor    eax,eax
      e0be4c:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      e0be51:	88 02                	mov    BYTE PTR [rdx],al
      e0be53:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      e0be56:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      e0be5b:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      e0be60:	e8 bd 8f 81 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      e0be65:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      e0be6a:	e8 fb e0 c6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e0be6f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      e0be74:	e8 b7 ae c9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e0be79:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      e0be7d:	e8 48 00 00 00       	call   e0beca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8f50>
      e0be82:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      e0be87:	e8 58 2b cb ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      e0be8c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e0be93:	00 00 
      e0be95:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
      e0be9c:	00 
      e0be9d:	75 1e                	jne    e0bebd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8f43>
      e0be9f:	48 81 c4 98 00 00 00 	add    rsp,0x98
      e0bea6:	5b                   	pop    rbx
      e0bea7:	41 5c                	pop    r12
      e0bea9:	41 5d                	pop    r13
      e0beab:	41 5e                	pop    r14
      e0bead:	41 5f                	pop    r15
      e0beaf:	5d                   	pop    rbp
      e0beb0:	c3                   	ret
      e0beb1:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      e0beb5:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      e0beb8:	e9 61 ff ff ff       	jmp    e0be1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8ea4>

### caller 0xe15c82 FDE=(14768436, 14770026)
      e15c45:	4c 8d bc 24 38 20 00 	lea    r15,[rsp+0x2038]
      e15c4c:	00 
      e15c4d:	4c 89 ff             	mov    rdi,r15
      e15c50:	e8 d3 5a c6 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      e15c55:	48 8b bb c0 12 00 00 	mov    rdi,QWORD PTR [rbx+0x12c0]
      e15c5c:	31 c0                	xor    eax,eax
      e15c5e:	41 88 06             	mov    BYTE PTR [r14],al
      e15c61:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
      e15c65:	49 83 67 08 00       	and    QWORD PTR [r15+0x8],0x0
      e15c6a:	48 8d b4 24 f0 2f 00 	lea    rsi,[rsp+0x2ff0]
      e15c71:	00 
      e15c72:	48 8d 94 24 50 10 00 	lea    rdx,[rsp+0x1050]
      e15c79:	00 
      e15c7a:	48 8d 8c 24 20 20 00 	lea    rcx,[rsp+0x2020]
      e15c81:	00 
      e15c82:	e8 9b f1 80 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      e15c87:	48 8d bc 24 20 20 00 	lea    rdi,[rsp+0x2020]
      e15c8e:	00 
      e15c8f:	e8 d6 42 c6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e15c94:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e15c9b:	00 
      e15c9c:	e8 8f 10 c9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e15ca1:	48 8d 05 18 3d b1 00 	lea    rax,[rip+0xb13d18]        # 19299c0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dd0>
      e15ca8:	48 39 44 24 08       	cmp    QWORD PTR [rsp+0x8],rax
      e15cad:	75 23                	jne    e15cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2d58>
      e15caf:	81 3c 24 28 23 00 00 	cmp    DWORD PTR [rsp],0x2328
      e15cb6:	75 1a                	jne    e15cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2d58>
      e15cb8:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]
      e15cbc:	3d ad 01 00 00       	cmp    eax,0x1ad
      e15cc1:	0f 84 59 01 00 00    	je     e15e20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2ea6>
      e15cc7:	3d f7 01 00 00       	cmp    eax,0x1f7
      e15ccc:	0f 84 4e 01 00 00    	je     e15e20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2ea6>
      e15cd2:	41 8b 6d 08          	mov    ebp,DWORD PTR [r13+0x8]
      e15cd6:	83 fd 09             	cmp    ebp,0x9
      e15cd9:	74 09                	je     e15ce4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2d6a>
      e15cdb:	83 fd 03             	cmp    ebp,0x3
      e15cde:	0f 85 3c 01 00 00    	jne    e15e20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2ea6>
      e15ce4:	80 bb e6 14 00 00 00 	cmp    BYTE PTR [rbx+0x14e6],0x0
      e15ceb:	74 5b                	je     e15d48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2dce>
      e15ced:	48 8b bb 50 02 00 00 	mov    rdi,QWORD PTR [rbx+0x250]

### caller 0xe17181 FDE=(14774470, 14774774)
      e17148:	49 89 e6             	mov    r14,rsp
      e1714b:	4c 89 f7             	mov    rdi,r14
      e1714e:	e8 3d 6d 9d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e17153:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
      e17158:	4c 89 ff             	mov    rdi,r15
      e1715b:	e8 c8 45 c6 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      e17160:	49 8b bc 24 c0 12 00 	mov    rdi,QWORD PTR [r12+0x12c0]
      e17167:	00 
      e17168:	31 c0                	xor    eax,eax
      e1716a:	41 88 06             	mov    BYTE PTR [r14],al
      e1716d:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
      e17171:	49 83 67 08 00       	and    QWORD PTR [r15+0x8],0x0
      e17176:	48 89 e2             	mov    rdx,rsp
      e17179:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      e1717e:	48 89 de             	mov    rsi,rbx
      e17181:	e8 9c dc 80 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      e17186:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      e1718b:	e8 da 2d c6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e17190:	48 89 e7             	mov    rdi,rsp
      e17193:	e8 98 fb c8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e17198:	48 8d 35 13 12 56 ff 	lea    rsi,[rip+0xffffffffff561213]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      e1719f:	48 8d 0d 80 95 55 ff 	lea    rcx,[rip+0xffffffffff559580]        # 370726 <_ZTSSt12bad_any_cast@@Base-0x1faa2>
      e171a6:	6a 02                	push   0x2
      e171a8:	5f                   	pop    rdi
      e171a9:	ba b4 03 00 00       	mov    edx,0x3b4
      e171ae:	31 c0                	xor    eax,eax
      e171b0:	e8 1d f7 9b 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e171b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e171bc:	00 00 
      e171be:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
      e171c3:	75 24                	jne    e171e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe426f>
      e171c5:	48 83 c4 58          	add    rsp,0x58
      e171c9:	5b                   	pop    rbx
      e171ca:	41 5c                	pop    r12
      e171cc:	41 5e                	pop    r14
      e171ce:	41 5f                	pop    r15
      e171d0:	c3                   	ret
      e171d1:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      e171d5:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      e171d8:	e9 1d ff ff ff       	jmp    e170fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4180>

### caller 0xe17c97 FDE=(14776530, 14777651)
      e17c58:	48 8b 57 98          	mov    rdx,QWORD PTR [rdi-0x68]
      e17c5c:	f6 c2 01             	test   dl,0x1
      e17c5f:	0f 85 ad 00 00 00    	jne    e17d12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4d98>
      e17c65:	4c 89 f6             	mov    rsi,r14
      e17c68:	e8 25 db 94 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      e17c6d:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e17c72:	48 8b b8 c0 12 00 00 	mov    rdi,QWORD PTR [rax+0x12c0]
      e17c79:	31 c0                	xor    eax,eax
      e17c7b:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
      e17c80:	88 02                	mov    BYTE PTR [rdx],al
      e17c82:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      e17c85:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
      e17c8c:	00 
      e17c8d:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      e17c92:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      e17c97:	e8 86 d1 80 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      e17c9c:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      e17ca3:	00 
      e17ca4:	e8 c1 22 c6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e17ca9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      e17cae:	e8 7d f0 c8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e17cb3:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      e17cb8:	e8 4d 81 83 00       	call   164fe0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f76>
      e17cbd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e17cc4:	00 00 
      e17cc6:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
      e17ccd:	00 
      e17cce:	75 4e                	jne    e17d1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4da4>
      e17cd0:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
      e17cd7:	5b                   	pop    rbx
      e17cd8:	41 5c                	pop    r12
      e17cda:	41 5d                	pop    r13
      e17cdc:	41 5e                	pop    r14
      e17cde:	41 5f                	pop    r15
      e17ce0:	5d                   	pop    rbp
      e17ce1:	c3                   	ret
      e17ce2:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      e17ce6:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      e17ce9:	e9 06 ff ff ff       	jmp    e17bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4c7a>
      e17cee:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe

### caller 0xe250ac FDE=(14830970, 14834141)
      e25070:	4c 8d a4 24 40 03 00 	lea    r12,[rsp+0x340]
      e25077:	00 
      e25078:	4c 89 e7             	mov    rdi,r12
      e2507b:	e8 10 8e 9c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e25080:	49 8b be 68 20 00 00 	mov    rdi,QWORD PTR [r14+0x2068]
      e25087:	31 c0                	xor    eax,eax
      e25089:	48 8d 94 24 a0 01 00 	lea    rdx,[rsp+0x1a0]
      e25090:	00 
      e25091:	88 02                	mov    BYTE PTR [rdx],al
      e25093:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      e25096:	49 83 64 24 20 00    	and    QWORD PTR [r12+0x20],0x0
      e2509c:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
      e250a3:	00 
      e250a4:	48 8d 8c 24 40 03 00 	lea    rcx,[rsp+0x340]
      e250ab:	00 
      e250ac:	e8 71 fd 7f 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      e250b1:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
      e250b8:	00 
      e250b9:	e8 ac 4e c5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e250be:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      e250c5:	00 
      e250c6:	e8 65 1c c8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e250cb:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
      e250cf:	4c 89 fe             	mov    rsi,r15
      e250d2:	e8 b9 8c c9 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      e250d7:	e9 91 06 00 00       	jmp    e2576d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf27f3>
      e250dc:	41 80 bf 90 00 00 00 	cmp    BYTE PTR [r15+0x90],0x0
      e250e3:	00 
      e250e4:	74 53                	je     e25139 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf21bf>
      e250e6:	49 8d 47 78          	lea    rax,[r15+0x78]
      e250ea:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e250ef:	49 89 dc             	mov    r12,rbx
      e250f2:	48 8d 5c 24 58       	lea    rbx,[rsp+0x58]
      e250f7:	4c 89 73 f8          	mov    QWORD PTR [rbx-0x8],r14
      e250fb:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
      e25102:	00 
      e25103:	48 89 df             	mov    rdi,rbx
      e25106:	e8 db 09 00 00       	call   e25ae6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2b6c>
      e2510b:	48 89 ab a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rbp
      e25112:	4c 89 e3             	mov    rbx,r12

### caller 0xe25193 FDE=(14830970, 14834141)
      e25153:	f6 c2 01             	test   dl,0x1
      e25156:	0f 85 ee 07 00 00    	jne    e2594a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf29d0>
      e2515c:	48 8d 35 d1 c7 52 ff 	lea    rsi,[rip+0xffffffffff52c7d1]        # 351934 <_ZTSSt12bad_any_cast@@Base-0x3e894>
      e25163:	e8 ea 0b ce ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      e25168:	49 8b be 68 20 00 00 	mov    rdi,QWORD PTR [r14+0x2068]
      e2516f:	31 c0                	xor    eax,eax
      e25171:	48 8d 94 24 a0 01 00 	lea    rdx,[rsp+0x1a0]
      e25178:	00 
      e25179:	88 02                	mov    BYTE PTR [rdx],al
      e2517b:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
      e2517e:	48 8d 8c 24 40 03 00 	lea    rcx,[rsp+0x340]
      e25185:	00 
      e25186:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      e2518b:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
      e25192:	00 
      e25193:	e8 8a fc 7f 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
      e25198:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
      e2519f:	00 
      e251a0:	e8 c5 4d c5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e251a5:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      e251ac:	00 
      e251ad:	e8 7e 1b c8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e251b2:	4c 8d b4 24 40 03 00 	lea    r14,[rsp+0x340]
      e251b9:	00 
      e251ba:	4c 89 f7             	mov    rdi,r14
      e251bd:	e8 08 56 84 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
      e251c2:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
      e251c6:	4c 89 f6             	mov    rsi,r14
      e251c9:	e8 c2 8b c9 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      e251ce:	48 8b bc 24 58 03 00 	mov    rdi,QWORD PTR [rsp+0x358]
      e251d5:	00 
      e251d6:	e8 c3 95 c7 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
      e251db:	e9 8d 05 00 00       	jmp    e2576d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf27f3>
      e251e0:	4d 8d 47 79          	lea    r8,[r15+0x79]
      e251e4:	4d 8b 4d 00          	mov    r9,QWORD PTR [r13+0x0]
      e251e8:	48 8d 35 c3 31 55 ff 	lea    rsi,[rip+0xffffffffff5531c3]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      e251ef:	48 8d 0d 5f b5 54 ff 	lea    rcx,[rip+0xffffffffff54b55f]        # 370755 <_ZTSSt12bad_any_cast@@Base-0x1fa73>
      e251f6:	6a 06                	push   0x6
      e251f8:	5f                   	pop    rdi
      e251f9:	ba 96 01 00 00       	mov    edx,0x196

## Strings in one-hop callees of 0x1624e22
### callee 0x175345a FDE=(24458330, 24458947)
- '   '
### callee 0xa6fcd0 FDE=(10943696, 10943824)
- 'libunwind: %s - %s\n'
- '_Unwind_Resume'
- "_Unwind_Resume() can't return"
