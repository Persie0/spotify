# Orbit ad method-table xrefs

The static table around VA 0x162578 contains raw-skippable, derived-skippable, seekable, interruptible, and delay-parser entrypoints at 0x18-byte intervals.

## Code references to table range

 156737c:	48 8d 3d 05 9e 48 00 	lea    rdi,[rip+0x489e05]        # 19f1188 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28b8>
 1567383:	e8 e8 6d 28 00       	call   17ee170 <__cxa_guard_acquire@plt>
 1567388:	85 c0                	test   eax,eax
 156738a:	74 b9                	je     1567345 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ac8c9>
 156738c:	48 83 25 d4 9d 48 00 	and    QWORD PTR [rip+0x489dd4],0x0        # 19f1168 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2898>
 1567393:	00 
 1567394:	48 8d 05 0d 5d 32 00 	lea    rax,[rip+0x325d0d]        # 188d0a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5d80>
 156739b:	48 89 05 be 9d 48 00 	mov    QWORD PTR [rip+0x489dbe],rax        # 19f1160 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2890>
 15673a2:	0f 57 c0             	xorps  xmm0,xmm0
 15673a5:	0f 11 05 c4 9d 48 00 	movups XMMWORD PTR [rip+0x489dc4],xmm0        # 19f1170 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28a0>
 15673ac:	48 83 25 cc 9d 48 00 	and    QWORD PTR [rip+0x489dcc],0x0        # 19f1180 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28b0>
 15673b3:	00 
 15673b4:	48 8d 3d 2f e0 0b 00 	lea    rdi,[rip+0xbe02f]        # 16253ea <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20558>
 15673bb:	4c 89 fe             	mov    rsi,r15
 15673be:	4c 89 ea             	mov    rdx,r13
 15673c1:	e8 9a 6a 28 00       	call   17ede60 <__cxa_atexit@plt>
 15673c6:	48 8d 3d bb 9d 48 00 	lea    rdi,[rip+0x489dbb]        # 19f1188 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28b8>
 15673cd:	e8 ae 6d 28 00       	call   17ee180 <__cxa_guard_release@plt>
 15673d2:	e9 6e ff ff ff       	jmp    1567345 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ac8c9>
 15673d7:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 15673db:	8b 48 18             	mov    ecx,DWORD PTR [rax+0x18]
 15673de:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
 15673e1:	48 8b 6f 08          	mov    rbp,QWORD PTR [rdi+0x8]
 15673e5:	48 89 e8             	mov    rax,rbp
 15673e8:	4c 29 e0             	sub    rax,r12
 15673eb:	6a 50                	push   0x50
 15673ed:	5e                   	pop    rsi
 15673ee:	48 99                	cqo
 15673f0:	48 f7 fe             	idiv   rsi
 15673f3:	39 c1                	cmp    ecx,eax
 15673f5:	0f 85 2e 01 00 00    	jne    1567529 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3acaad>
 15673fb:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 1567400:	85 c9                	test   ecx,ecx
--
 15675bc:	48 8d 3d f5 9b 48 00 	lea    rdi,[rip+0x489bf5]        # 19f11b8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28e8>
 15675c3:	e8 a8 6b 28 00       	call   17ee170 <__cxa_guard_acquire@plt>
 15675c8:	85 c0                	test   eax,eax
 15675ca:	0f 84 75 ff ff ff    	je     1567545 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3acac9>
 15675d0:	48 83 25 c0 9b 48 00 	and    QWORD PTR [rip+0x489bc0],0x0        # 19f1198 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28c8>
 15675d7:	00 
 15675d8:	48 8d 05 c9 5a 32 00 	lea    rax,[rip+0x325ac9]        # 188d0a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5d80>
 15675df:	48 89 05 aa 9b 48 00 	mov    QWORD PTR [rip+0x489baa],rax        # 19f1190 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28c0>
 15675e6:	0f 57 c0             	xorps  xmm0,xmm0
 15675e9:	0f 11 05 b0 9b 48 00 	movups XMMWORD PTR [rip+0x489bb0],xmm0        # 19f11a0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28d0>
 15675f0:	48 83 25 b8 9b 48 00 	and    QWORD PTR [rip+0x489bb8],0x0        # 19f11b0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28e0>
 15675f7:	00 
 15675f8:	48 8d 3d eb dd 0b 00 	lea    rdi,[rip+0xbddeb]        # 16253ea <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20558>
 15675ff:	48 8d 35 8a 9b 48 00 	lea    rsi,[rip+0x489b8a]        # 19f1190 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28c0>
 1567606:	48 8d 15 f3 c9 28 00 	lea    rdx,[rip+0x28c9f3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 156760d:	e8 4e 68 28 00       	call   17ede60 <__cxa_atexit@plt>
 1567612:	48 8d 3d 9f 9b 48 00 	lea    rdi,[rip+0x489b9f]        # 19f11b8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x28e8>
 1567619:	e8 62 6b 28 00       	call   17ee180 <__cxa_guard_release@plt>
 156761e:	e9 22 ff ff ff       	jmp    1567545 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3acac9>
 1567623:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 156762a:	00 00 
 156762c:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
 1567631:	75 62                	jne    1567695 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3acc19>
 1567633:	48 83 c4 78          	add    rsp,0x78
 1567637:	5b                   	pop    rbx
 1567638:	41 5c                	pop    r12
 156763a:	41 5d                	pop    r13
 156763c:	41 5e                	pop    r14
 156763e:	41 5f                	pop    r15
 1567640:	5d                   	pop    rbp
 1567641:	c3                   	ret
 1567642:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1567649:	00 00 
--
 16261f2:	4d 8d 66 18          	lea    r12,[r14+0x18]
 16261f6:	48 8d 53 18          	lea    rdx,[rbx+0x18]
 16261fa:	4c 89 e7             	mov    rdi,r12
 16261fd:	4c 89 fe             	mov    rsi,r15
 1626200:	e8 91 94 49 ff       	call   abf696 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc636>
 1626205:	0f 57 c0             	xorps  xmm0,xmm0
 1626208:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 162620d:	4d 89 7e 38          	mov    QWORD PTR [r14+0x38],r15
 1626211:	83 7b 30 00          	cmp    DWORD PTR [rbx+0x30],0x0
 1626215:	74 14                	je     162622b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21399>
 1626217:	49 8d 7e 28          	lea    rdi,[r14+0x28]
 162621b:	48 8d 73 28          	lea    rsi,[rbx+0x28]
 162621f:	48 8d 15 cc 03 00 00 	lea    rdx,[rip+0x3cc]        # 16265f2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21760>
 1626226:	e8 5b c5 15 00       	call   1782786 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1368f2>
 162622b:	41 8b 6e 10          	mov    ebp,DWORD PTR [r14+0x10]
 162622f:	40 f6 c5 01          	test   bpl,0x1
 1626233:	75 04                	jne    1626239 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x213a7>
 1626235:	31 c0                	xor    eax,eax
 1626237:	eb 0c                	jmp    1626245 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x213b3>
 1626239:	48 8b 73 40          	mov    rsi,QWORD PTR [rbx+0x40]
 162623d:	4c 89 ff             	mov    rdi,r15
 1626240:	e8 65 00 00 00       	call   16262aa <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21418>
 1626245:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
 1626249:	40 f6 c5 02          	test   bpl,0x2
 162624d:	75 04                	jne    1626253 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x213c1>
 162624f:	31 c0                	xor    eax,eax
 1626251:	eb 0c                	jmp    162625f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x213cd>
 1626253:	48 8b 73 48          	mov    rsi,QWORD PTR [rbx+0x48]
 1626257:	4c 89 ff             	mov    rdi,r15
 162625a:	e8 f1 00 00 00       	call   1626350 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x214be>
 162625f:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
 1626263:	40 f6 c5 04          	test   bpl,0x4
 1626267:	75 04                	jne    162626d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x213db>
--
 16268d6:	74 11                	je     16268e9 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21a57>
 16268d8:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 16268dc:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
 16268e0:	48 83 c6 08          	add    rsi,0x8
 16268e4:	e8 17 7c 12 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
 16268e9:	0f 57 c0             	xorps  xmm0,xmm0
 16268ec:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 16268f0:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
 16268f4:	41 83 7e 18 00       	cmp    DWORD PTR [r14+0x18],0x0
 16268f9:	74 17                	je     1626912 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21a80>
 16268fb:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
 16268ff:	49 83 c6 10          	add    r14,0x10
 1626903:	48 8d 15 12 00 00 00 	lea    rdx,[rip+0x12]        # 162691c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21a8a>
 162690a:	4c 89 f6             	mov    rsi,r14
 162690d:	e8 74 be 15 00       	call   1782786 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1368f2>
 1626912:	83 63 28 00          	and    DWORD PTR [rbx+0x28],0x0
 1626916:	5b                   	pop    rbx
 1626917:	41 5e                	pop    r14
 1626919:	41 5f                	pop    r15
 162691b:	c3                   	ret
 162691c:	41 57                	push   r15
 162691e:	41 56                	push   r14
 1626920:	53                   	push   rbx
 1626921:	49 89 f6             	mov    r14,rsi
 1626924:	48 89 fb             	mov    rbx,rdi
 1626927:	0f 18 4e 40          	prefetcht0 BYTE PTR [rsi+0x40]
 162692b:	48 85 ff             	test   rdi,rdi
 162692e:	74 0d                	je     162693d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21aab>
 1626930:	6a 28                	push   0x28
 1626932:	5e                   	pop    rsi
 1626933:	48 89 df             	mov    rdi,rbx
 1626936:	e8 f1 3a 16 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
 162693b:	eb 08                	jmp    1626945 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ab3>
--
 1626ab2:	74 11                	je     1626ac5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21c33>
 1626ab4:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 1626ab8:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
 1626abc:	48 83 c6 08          	add    rsi,0x8
 1626ac0:	e8 3b 7a 12 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
 1626ac5:	0f 57 c0             	xorps  xmm0,xmm0
 1626ac8:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 1626acc:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
 1626ad0:	41 83 7e 18 00       	cmp    DWORD PTR [r14+0x18],0x0
 1626ad5:	74 17                	je     1626aee <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21c5c>
 1626ad7:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
 1626adb:	49 83 c6 10          	add    r14,0x10
 1626adf:	48 8d 15 12 00 00 00 	lea    rdx,[rip+0x12]        # 1626af8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21c66>
 1626ae6:	4c 89 f6             	mov    rsi,r14
 1626ae9:	e8 98 bc 15 00       	call   1782786 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1368f2>
 1626aee:	83 63 28 00          	and    DWORD PTR [rbx+0x28],0x0
 1626af2:	5b                   	pop    rbx
 1626af3:	41 5e                	pop    r14
 1626af5:	41 5f                	pop    r15
 1626af7:	c3                   	ret
 1626af8:	41 57                	push   r15
 1626afa:	41 56                	push   r14
 1626afc:	53                   	push   rbx
 1626afd:	48 89 f3             	mov    rbx,rsi
 1626b00:	0f 18 4e 40          	prefetcht0 BYTE PTR [rsi+0x40]
 1626b04:	48 85 ff             	test   rdi,rdi
 1626b07:	74 16                	je     1626b1f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21c8d>
 1626b09:	49 89 ff             	mov    r15,rdi
 1626b0c:	6a 30                	push   0x30
 1626b0e:	5e                   	pop    rsi
 1626b0f:	e8 18 39 16 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
 1626b14:	49 89 c6             	mov    r14,rax
 1626b17:	48 89 c7             	mov    rdi,rax
--
 1628625:	49 8d 7e 08          	lea    rdi,[r14+0x8]
 1628629:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
 162862d:	48 83 c6 08          	add    rsi,0x8
 1628631:	e8 ca 5e 12 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
 1628636:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
 162863b:	0f 57 c0             	xorps  xmm0,xmm0
 162863e:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 1628643:	83 7b 18 00          	cmp    DWORD PTR [rbx+0x18],0x0
 1628647:	74 1a                	je     1628663 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237d1>
 1628649:	4c 89 f7             	mov    rdi,r14
 162864c:	48 83 c7 10          	add    rdi,0x10
 1628650:	48 83 c3 10          	add    rbx,0x10
 1628654:	48 8d 15 fb e6 ff ff 	lea    rdx,[rip+0xffffffffffffe6fb]        # 1626d56 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ec4>
 162865b:	48 89 de             	mov    rsi,rbx
 162865e:	e8 23 a1 15 00       	call   1782786 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1368f2>
 1628663:	41 83 66 28 00       	and    DWORD PTR [r14+0x28],0x0
 1628668:	4c 89 f0             	mov    rax,r14
 162866b:	48 83 c4 08          	add    rsp,0x8
 162866f:	5b                   	pop    rbx
 1628670:	41 5e                	pop    r14
 1628672:	c3                   	ret
 1628673:	cc                   	int3
 1628674:	0f 18 0d 1d eb 32 00 	prefetcht0 BYTE PTR [rip+0x32eb1d]        # 1957198 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x1fde0>
 162867b:	48 8d 05 16 eb 32 00 	lea    rax,[rip+0x32eb16]        # 1957198 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x1fde0>
 1628682:	48 8b 0d 17 eb 32 00 	mov    rcx,QWORD PTR [rip+0x32eb17]        # 19571a0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x1fde8>
 1628689:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 162868c:	c3                   	ret
 162868d:	cc                   	int3
 162868e:	48 89 f0             	mov    rax,rsi
 1628691:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 1628695:	48 8d 0d 04 60 26 00 	lea    rcx,[rip+0x266004]        # 188e6a0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x7378>
 162869c:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 162869f:	0f 57 c0             	xorps  xmm0,xmm0

## Guard/current-track constructor neighborhood (0xb2828e)


/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b28100 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x750a0>:
  b28100:	40 f6 c6 01          	test   sil,0x1
  b28104:	74 14                	je     b2811a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x750ba>
  b28106:	48 83 c3 08          	add    rbx,0x8
  b2810a:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
  b2810e:	48 83 c6 08          	add    rsi,0x8
  b28112:	48 89 df             	mov    rdi,rbx
  b28115:	e8 0e 7f c5 00       	call   1780028 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134194>
  b2811a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b28121:	00 00 
  b28123:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  b28128:	0f 85 b0 00 00 00    	jne    b281de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7517e>
  b2812e:	48 83 c4 28          	add    rsp,0x28
  b28132:	5b                   	pop    rbx
  b28133:	41 5e                	pop    r14
  b28135:	41 5f                	pop    r15
  b28137:	5d                   	pop    rbp
  b28138:	c3                   	ret
  b28139:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b2813d:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b28140:	e9 69 fd ff ff       	jmp    b27eae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x74e4e>
  b28145:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b28149:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b2814c:	e9 dd fd ff ff       	jmp    b27f2e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x74ece>
  b28151:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b28155:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b28158:	e9 51 fe ff ff       	jmp    b27fae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x74f4e>
  b2815d:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b28161:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b28164:	e9 c5 fe ff ff       	jmp    b2802e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x74fce>
  b28169:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b2816d:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b28170:	e9 39 ff ff ff       	jmp    b280ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7504e>
  b28175:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b28179:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b2817c:	e9 ff fc ff ff       	jmp    b27e80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x74e20>
  b28181:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b28185:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b28188:	e9 73 fd ff ff       	jmp    b27f00 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x74ea0>
  b2818d:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b28191:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b28194:	e9 e7 fd ff ff       	jmp    b27f80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x74f20>
  b28199:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b2819d:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b281a0:	e9 5b fe ff ff       	jmp    b28000 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x74fa0>
  b281a5:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
  b281a9:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
  b281ac:	e9 cf fe ff ff       	jmp    b28080 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75020>
  b281b1:	eb 06                	jmp    b281b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75159>
  b281b3:	eb 04                	jmp    b281b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75159>
  b281b5:	eb 02                	jmp    b281b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75159>
  b281b7:	eb 00                	jmp    b281b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75159>
  b281b9:	48 89 c3             	mov    rbx,rax
  b281bc:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  b281c1:	e8 ca 5c cc 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b281c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b281cd:	00 00 
  b281cf:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  b281d4:	75 08                	jne    b281de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7517e>
  b281d6:	48 89 df             	mov    rdi,rbx
  b281d9:	e8 f2 7a f4 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b281de:	e8 cd 78 cc 00       	call   17efab0 <__stack_chk_fail@plt>
  b281e3:	cc                   	int3
  b281e4:	53                   	push   rbx
  b281e5:	48 89 f3             	mov    rbx,rsi
  b281e8:	48 89 f7             	mov    rdi,rsi
  b281eb:	48 89 d6             	mov    rsi,rdx
  b281ee:	e8 a9 f5 ff ff       	call   b2779c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7473c>
  b281f3:	48 89 d8             	mov    rax,rbx
  b281f6:	5b                   	pop    rbx
  b281f7:	c3                   	ret
  b281f8:	53                   	push   rbx
  b281f9:	48 89 fb             	mov    rbx,rdi
  b281fc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b28200:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b28203:	ff 50 10             	call   QWORD PTR [rax+0x10]
  b28206:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  b2820a:	5b                   	pop    rbx
  b2820b:	e9 76 62 f7 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  b28210:	48 89 c7             	mov    rdi,rax
  b28213:	e8 8d 18 f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b28218:	53                   	push   rbx
  b28219:	48 89 fb             	mov    rbx,rdi
  b2821c:	e8 d7 ff ff ff       	call   b281f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75198>
  b28221:	48 89 df             	mov    rdi,rbx
  b28224:	5b                   	pop    rbx
  b28225:	e9 f6 5c cc 00       	jmp    17edf20 <_ZdlPv@plt>
  b2822a:	48 89 f8             	mov    rax,rdi
  b2822d:	48 8b 4e 10          	mov    rcx,QWORD PTR [rsi+0x10]
  b28231:	0f 10 46 08          	movups xmm0,XMMWORD PTR [rsi+0x8]
  b28235:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  b28238:	48 85 c9             	test   rcx,rcx
  b2823b:	74 05                	je     b28242 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x751e2>
  b2823d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  b28242:	c3                   	ret
  b28243:	cc                   	int3
  b28244:	48 83 c7 08          	add    rdi,0x8
  b28248:	e9 ab ff ff ff       	jmp    b281f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75198>
  b2824d:	cc                   	int3
  b2824e:	53                   	push   rbx
  b2824f:	48 89 fb             	mov    rbx,rdi
  b28252:	48 83 c7 08          	add    rdi,0x8
  b28256:	e8 9d ff ff ff       	call   b281f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75198>
  b2825b:	48 89 df             	mov    rdi,rbx
  b2825e:	5b                   	pop    rbx
  b2825f:	e9 bc 5c cc 00       	jmp    17edf20 <_ZdlPv@plt>
  b28264:	48 89 f8             	mov    rax,rdi
  b28267:	48 8b 4e 18          	mov    rcx,QWORD PTR [rsi+0x18]
  b2826b:	0f 10 46 10          	movups xmm0,XMMWORD PTR [rsi+0x10]
  b2826f:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  b28272:	48 85 c9             	test   rcx,rcx
  b28275:	74 05                	je     b2827c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521c>
  b28277:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  b2827c:	c3                   	ret
  b2827d:	cc                   	int3
  b2827e:	50                   	push   rax
  b2827f:	e8 7e 1b cb 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b28284:	58                   	pop    rax
  b28285:	c3                   	ret
  b28286:	48 89 c7             	mov    rdi,rax
  b28289:	e8 17 18 f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b2828e:	50                   	push   rax
  b2828f:	e8 6e 1b cb 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b28294:	58                   	pop    rax
  b28295:	c3                   	ret
  b28296:	48 89 c7             	mov    rdi,rax
  b28299:	e8 07 18 f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b2829e:	48 8d 05 23 0d ce 00 	lea    rax,[rip+0xce0d23]        # 1808fc8 <_ZTIN4asio22service_already_existsE@@Base+0xa7b0>
  b282a5:	48 89 07             	mov    QWORD PTR [rdi],rax
  b282a8:	e9 63 5d cc 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  b282ad:	cc                   	int3
  b282ae:	53                   	push   rbx
  b282af:	48 89 fb             	mov    rbx,rdi
  b282b2:	e8 e7 ff ff ff       	call   b2829e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7523e>
  b282b7:	48 89 df             	mov    rdi,rbx
  b282ba:	5b                   	pop    rbx
  b282bb:	e9 60 5c cc 00       	jmp    17edf20 <_ZdlPv@plt>
  b282c0:	53                   	push   rbx
  b282c1:	48 89 fb             	mov    rbx,rdi
  b282c4:	48 81 c7 b0 01 00 00 	add    rdi,0x1b0
  b282cb:	e8 96 1b cb 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b282d0:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
  b282d7:	e8 8a 1b cb 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b282dc:	48 8b bb 48 01 00 00 	mov    rdi,QWORD PTR [rbx+0x148]
  b282e3:	e8 9e 61 f7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b282e8:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
  b282ef:	e8 4c 00 00 00       	call   b28340 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x752e0>
  b282f4:	48 8d bb e8 00 00 00 	lea    rdi,[rbx+0xe8]
  b282fb:	e8 04 c6 fd ff       	call   b04904 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x518a4>
  b28300:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
  b28307:	e8 44 5d cc 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b2830c:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
  b28313:	e8 38 5d cc 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b28318:	48 8b bb 88 00 00 00 	mov    rdi,QWORD PTR [rbx+0x88]
  b2831f:	e8 62 61 f7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b28324:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
  b28328:	e8 7d 11 b0 00       	call   16294aa <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24618>
  b2832d:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
  b28331:	e8 34 1c f5 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b28336:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  b2833a:	5b                   	pop    rbx
  b2833b:	e9 72 61 f7 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  b28340:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
  b28343:	48 85 f6             	test   rsi,rsi
  b28346:	74 12                	je     b2835a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x752fa>
  b28348:	53                   	push   rbx
  b28349:	48 89 fb             	mov    rbx,rdi
  b2834c:	e8 0b 00 00 00       	call   b2835c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x752fc>
  b28351:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  b28354:	5b                   	pop    rbx
  b28355:	e9 c6 5b cc 00       	jmp    17edf20 <_ZdlPv@plt>
  b2835a:	c3                   	ret
  b2835b:	cc                   	int3
  b2835c:	41 57                	push   r15
  b2835e:	41 56                	push   r14
  b28360:	53                   	push   rbx
  b28361:	48 89 f3             	mov    rbx,rsi
  b28364:	49 89 fe             	mov    r14,rdi
  b28367:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  b2836b:	49 39 f7             	cmp    r15,rsi
  b2836e:	74 11                	je     b28381 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75321>
  b28370:	49 83 c7 c0          	add    r15,0xffffffffffffffc0
  b28374:	4c 89 ff             	mov    rdi,r15
  b28377:	e8 10 00 00 00       	call   b2838c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7532c>
  b2837c:	49 39 df             	cmp    r15,rbx
  b2837f:	75 ef                	jne    b28370 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75310>
  b28381:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
  b28385:	5b                   	pop    rbx
  b28386:	41 5e                	pop    r14
  b28388:	41 5f                	pop    r15
  b2838a:	c3                   	ret
  b2838b:	cc                   	int3
  b2838c:	53                   	push   rbx
  b2838d:	48 89 fb             	mov    rbx,rdi
  b28390:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
  b28394:	e8 19 61 f7 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  b28399:	48 89 df             	mov    rdi,rbx
  b2839c:	5b                   	pop    rbx
  b2839d:	e9 c8 1b f5 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  b283a2:	53                   	push   rbx
  b283a3:	48 89 fb             	mov    rbx,rdi
  b283a6:	48 8d 05 83 0b ce 00 	lea    rax,[rip+0xce0b83]        # 1808f30 <_ZTIN4asio22service_already_existsE@@Base+0xa718>
  b283ad:	48 89 07             	mov    QWORD PTR [rdi],rax
  b283b0:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b283b4:	e8 df 14 00 00       	call   b29898 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76838>
  b283b9:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  b283bd:	5b                   	pop    rbx
  b283be:	e9 c3 60 f7 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  b283c3:	48 89 c7             	mov    rdi,rax
  b283c6:	e8 da 16 f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b283cb:	cc                   	int3
  b283cc:	53                   	push   rbx
  b283cd:	48 89 fb             	mov    rbx,rdi
  b283d0:	e8 cd ff ff ff       	call   b283a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75342>
  b283d5:	48 89 df             	mov    rdi,rbx
  b283d8:	5b                   	pop    rbx
  b283d9:	e9 42 5b cc 00       	jmp    17edf20 <_ZdlPv@plt>
  b283de:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b283e2:	b0 01                	mov    al,0x1
  b283e4:	86 87 30 01 00 00    	xchg   BYTE PTR [rdi+0x130],al
  b283ea:	e9 a9 14 00 00       	jmp    b29898 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76838>
  b283ef:	cc                   	int3
  b283f0:	55                   	push   rbp
  b283f1:	41 57                	push   r15
  b283f3:	41 56                	push   r14
  b283f5:	41 55                	push   r13
  b283f7:	41 54                	push   r12
  b283f9:	53                   	push   rbx
  b283fa:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
  b28401:	49 89 fd             	mov    r13,rdi
  b28404:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b2840b:	00 00 
  b2840d:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
  b28414:	00 
  b28415:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
  b28419:	41 8a 86 30 01 00 00 	mov    al,BYTE PTR [r14+0x130]
  b28420:	a8 01                	test   al,0x1
  b28422:	0f 85 94 00 00 00    	jne    b284bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7545c>
  b28428:	49 89 d7             	mov    r15,rdx
  b2842b:	84 c9                	test   cl,cl
  b2842d:	0f 85 b7 00 00 00    	jne    b284ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7548a>
  b28433:	41 8a 86 c0 00 00 00 	mov    al,BYTE PTR [r14+0xc0]
  b2843a:	a8 01                	test   al,0x1
  b2843c:	0f 85 a8 00 00 00    	jne    b284ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7548a>
  b28442:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
  b28447:	48 89 df             	mov    rdi,rbx
  b2844a:	4c 89 f6             	mov    rsi,r14
  b2844d:	e8 a6 07 00 00       	call   b28bf8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75b98>
  b28452:	80 7b 38 00          	cmp    BYTE PTR [rbx+0x38],0x0
  b28456:	0f 84 84 00 00 00    	je     b284e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75480>
  b2845c:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  b28463:	00 
  b28464:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  b28469:	e8 4e 08 00 00       	call   b28cbc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75c5c>
  b2846e:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
  b28472:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
  b28479:	00 
  b2847a:	31 d2                	xor    edx,edx
  b2847c:	e8 73 08 00 00       	call   b28cf4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75c94>
  b28481:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  b28488:	00 
  b28489:	e8 76 c4 fd ff       	call   b04904 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x518a4>
  b2848e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  b28493:	e8 6c c4 fd ff       	call   b04904 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x518a4>
  b28498:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b2849f:	00 00 
  b284a1:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
  b284a8:	00 
  b284a9:	0f 85 fc 03 00 00    	jne    b288ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7584b>
  b284af:	4c 89 ef             	mov    rdi,r13
  b284b2:	e8 5a 66 b2 00       	call   164eb11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7d>
  b284b7:	e9 40 03 00 00       	jmp    b287fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7579c>
  b284bc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b284c3:	00 00 
  b284c5:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
  b284cc:	00 
  b284cd:	0f 85 d8 03 00 00    	jne    b288ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7584b>
  b284d3:	0f 57 c0             	xorps  xmm0,xmm0
  b284d6:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
  b284db:	e9 1c 03 00 00       	jmp    b287fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7579c>
  b284e0:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  b284e5:	e8 1a c4 fd ff       	call   b04904 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x518a4>
  b284ea:	48 8d 35 8b 9a 92 ff 	lea    rsi,[rip+0xffffffffff929a8b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  b284f1:	48 8d 0d 50 93 81 ff 	lea    rcx,[rip+0xffffffffff819350]        # 341848 <_ZTSSt12bad_any_cast@@Base-0x4e980>
  b284f8:	31 db                	xor    ebx,ebx
  b284fa:	6a 04                	push   0x4
  b284fc:	5f                   	pop    rdi
  b284fd:	ba b8 00 00 00       	mov    edx,0xb8
  b28502:	31 c0                	xor    eax,eax
  b28504:	e8 c9 e3 ca 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  b28509:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  b2850e:	88 1e                	mov    BYTE PTR [rsi],bl
  b28510:	88 5e 38             	mov    BYTE PTR [rsi+0x38],bl
  b28513:	4c 89 f7             	mov    rdi,r14
  b28516:	e8 37 08 00 00       	call   b28d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75cf2>
  b2851b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]

## ContextPlayer init neighborhood (0x10a1440)


/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000010a1300 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268716>:
 10a1300:	85 db                	test   ebx,ebx
 10a1302:	74 08                	je     10a130c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268722>
 10a1304:	48 89 df             	mov    rdi,rbx
 10a1307:	e8 d8 d6 a1 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
 10a130c:	48 89 df             	mov    rdi,rbx
 10a130f:	48 83 c4 08          	add    rsp,0x8
 10a1313:	5b                   	pop    rbx
 10a1314:	41 5e                	pop    r14
 10a1316:	e9 05 cc 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10a131b:	cc                   	int3
 10a131c:	53                   	push   rbx
 10a131d:	48 89 fb             	mov    rbx,rdi
 10a1320:	e8 8b ff ff ff       	call   10a12b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2686c6>
 10a1325:	48 89 df             	mov    rdi,rbx
 10a1328:	5b                   	pop    rbx
 10a1329:	e9 f2 cb 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10a132e:	0f 18 0d cb 60 85 00 	prefetcht0 BYTE PTR [rip+0x8560cb]        # 18f7400 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e810>
 10a1335:	48 8d 05 c4 60 85 00 	lea    rax,[rip+0x8560c4]        # 18f7400 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e810>
 10a133c:	48 8b 0d c5 60 85 00 	mov    rcx,QWORD PTR [rip+0x8560c5]        # 18f7408 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e818>
 10a1343:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10a1346:	c3                   	ret
 10a1347:	cc                   	int3
 10a1348:	48 89 f0             	mov    rax,rsi
 10a134b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10a134f:	48 8d 0d 7a ae 7a 00 	lea    rcx,[rip+0x7aae7a]        # 184c1d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x88b8>
 10a1356:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10a1359:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10a135e:	48 8d 0d 93 e4 39 ff 	lea    rcx,[rip+0xffffffffff39e493]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10a1365:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
 10a1369:	0f 57 c0             	xorps  xmm0,xmm0
 10a136c:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
 10a1370:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
 10a1374:	83 66 40 00          	and    DWORD PTR [rsi+0x40],0x0
 10a1378:	c3                   	ret
 10a1379:	cc                   	int3
 10a137a:	41 56                	push   r14
 10a137c:	53                   	push   rbx
 10a137d:	50                   	push   rax
 10a137e:	48 89 fb             	mov    rbx,rdi
 10a1381:	48 83 c7 08          	add    rdi,0x8
 10a1385:	e8 7e 96 a0 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10a138a:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 10a138e:	e8 15 45 6c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10a1393:	4c 8b 73 20          	mov    r14,QWORD PTR [rbx+0x20]
 10a1397:	4d 85 f6             	test   r14,r14
 10a139a:	74 08                	je     10a13a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2687ba>
 10a139c:	4c 89 f7             	mov    rdi,r14
 10a139f:	e8 b6 a4 61 00       	call   16bb85a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f9c6>
 10a13a4:	4c 89 f7             	mov    rdi,r14
 10a13a7:	e8 74 cb 74 00       	call   17edf20 <_ZdlPv@plt>
 10a13ac:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
 10a13b0:	4d 85 f6             	test   r14,r14
 10a13b3:	74 08                	je     10a13bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2687d3>
 10a13b5:	4c 89 f7             	mov    rdi,r14
 10a13b8:	e8 51 97 a0 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
 10a13bd:	4c 89 f7             	mov    rdi,r14
 10a13c0:	e8 5b cb 74 00       	call   17edf20 <_ZdlPv@plt>
 10a13c5:	48 8b 5b 30          	mov    rbx,QWORD PTR [rbx+0x30]
 10a13c9:	48 85 db             	test   rbx,rbx
 10a13cc:	74 08                	je     10a13d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2687ec>
 10a13ce:	48 89 df             	mov    rdi,rbx
 10a13d1:	e8 0e d6 a1 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
 10a13d6:	48 89 df             	mov    rdi,rbx
 10a13d9:	48 83 c4 08          	add    rsp,0x8
 10a13dd:	5b                   	pop    rbx
 10a13de:	41 5e                	pop    r14
 10a13e0:	e9 3b cb 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10a13e5:	cc                   	int3
 10a13e6:	53                   	push   rbx
 10a13e7:	48 89 fb             	mov    rbx,rdi
 10a13ea:	e8 8b ff ff ff       	call   10a137a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268790>
 10a13ef:	48 89 df             	mov    rdi,rbx
 10a13f2:	5b                   	pop    rbx
 10a13f3:	e9 28 cb 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10a13f8:	0f 18 0d 29 5e 85 00 	prefetcht0 BYTE PTR [rip+0x855e29]        # 18f7228 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e638>
 10a13ff:	48 8d 05 22 5e 85 00 	lea    rax,[rip+0x855e22]        # 18f7228 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e638>
 10a1406:	48 8b 0d 23 5e 85 00 	mov    rcx,QWORD PTR [rip+0x855e23]        # 18f7230 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e640>
 10a140d:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10a1410:	c3                   	ret
 10a1411:	cc                   	int3
 10a1412:	48 89 f0             	mov    rax,rsi
 10a1415:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10a1419:	48 8d 0d 70 ad 7a 00 	lea    rcx,[rip+0x7aad70]        # 184c190 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8878>
 10a1420:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10a1423:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10a1428:	48 8d 0d c9 e3 39 ff 	lea    rcx,[rip+0xffffffffff39e3c9]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10a142f:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
 10a1433:	0f 57 c0             	xorps  xmm0,xmm0
 10a1436:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
 10a143a:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
 10a143e:	c3                   	ret
 10a143f:	cc                   	int3
 10a1440:	55                   	push   rbp
 10a1441:	41 57                	push   r15
 10a1443:	41 56                	push   r14
 10a1445:	41 55                	push   r13
 10a1447:	41 54                	push   r12
 10a1449:	53                   	push   rbx
 10a144a:	50                   	push   rax
 10a144b:	48 89 fb             	mov    rbx,rdi
 10a144e:	48 8b af 70 03 00 00 	mov    rbp,QWORD PTR [rdi+0x370]
 10a1455:	48 85 ed             	test   rbp,rbp
 10a1458:	0f 84 05 01 00 00    	je     10a1563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268979>
 10a145e:	48 8b 83 78 03 00 00 	mov    rax,QWORD PTR [rbx+0x378]
 10a1465:	48 8d 48 58          	lea    rcx,[rax+0x58]
 10a1469:	48 8b 50 50          	mov    rdx,QWORD PTR [rax+0x50]
 10a146d:	48 89 95 f0 00 00 00 	mov    QWORD PTR [rbp+0xf0],rdx
 10a1474:	4c 8d b5 f8 00 00 00 	lea    r14,[rbp+0xf8]
 10a147b:	49 39 ce             	cmp    r14,rcx
 10a147e:	0f 84 df 00 00 00    	je     10a1563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268979>
 10a1484:	4c 8b 60 58          	mov    r12,QWORD PTR [rax+0x58]
 10a1488:	4c 8b 78 60          	mov    r15,QWORD PTR [rax+0x60]
 10a148c:	4d 89 fd             	mov    r13,r15
 10a148f:	4d 29 e5             	sub    r13,r12
 10a1492:	49 c1 fd 05          	sar    r13,0x5
 10a1496:	48 8b 95 f8 00 00 00 	mov    rdx,QWORD PTR [rbp+0xf8]
 10a149d:	48 8b b5 08 01 00 00 	mov    rsi,QWORD PTR [rbp+0x108]
 10a14a4:	48 89 f0             	mov    rax,rsi
 10a14a7:	48 29 d0             	sub    rax,rdx
 10a14aa:	48 c1 f8 05          	sar    rax,0x5
 10a14ae:	4c 39 e8             	cmp    rax,r13
 10a14b1:	73 66                	jae    10a1519 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26892f>
 10a14b3:	48 85 d2             	test   rdx,rdx
 10a14b6:	74 1e                	je     10a14d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2688ec>
 10a14b8:	4c 89 f7             	mov    rdi,r14
 10a14bb:	e8 22 11 d5 ff       	call   df25e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf668>
 10a14c0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 10a14c3:	e8 58 ca 74 00       	call   17edf20 <_ZdlPv@plt>
 10a14c8:	0f 57 c0             	xorps  xmm0,xmm0
 10a14cb:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 10a14cf:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 10a14d4:	31 f6                	xor    esi,esi
 10a14d6:	31 ff                	xor    edi,edi
 10a14d8:	4c 89 ea             	mov    rdx,r13
 10a14db:	e8 f2 4c a4 ff       	call   ae61d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x33172>
 10a14e0:	48 89 c1             	mov    rcx,rax
 10a14e3:	48 c1 e9 3b          	shr    rcx,0x3b
 10a14e7:	0f 85 93 00 00 00    	jne    10a1580 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268996>
 10a14ed:	48 89 c7             	mov    rdi,rax
 10a14f0:	e8 ee 4d a4 ff       	call   ae62e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x33283>
 10a14f5:	48 89 85 f8 00 00 00 	mov    QWORD PTR [rbp+0xf8],rax
 10a14fc:	48 89 85 00 01 00 00 	mov    QWORD PTR [rbp+0x100],rax
 10a1503:	48 c1 e2 05          	shl    rdx,0x5
 10a1507:	48 01 c2             	add    rdx,rax
 10a150a:	48 89 95 08 01 00 00 	mov    QWORD PTR [rbp+0x108],rdx
 10a1511:	4c 89 f7             	mov    rdi,r14
 10a1514:	4c 89 e6             	mov    rsi,r12
 10a1517:	eb 2a                	jmp    10a1543 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268959>
 10a1519:	48 8b ad 00 01 00 00 	mov    rbp,QWORD PTR [rbp+0x100]
 10a1520:	48 29 d5             	sub    rbp,rdx
 10a1523:	48 89 e8             	mov    rax,rbp
 10a1526:	48 c1 f8 05          	sar    rax,0x5
 10a152a:	4c 39 e8             	cmp    rax,r13
 10a152d:	73 1e                	jae    10a154d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268963>
 10a152f:	4c 01 e5             	add    rbp,r12
 10a1532:	4c 89 e7             	mov    rdi,r12
 10a1535:	48 89 ee             	mov    rsi,rbp
 10a1538:	e8 6d 2d 00 00       	call   10a42aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b6c0>
 10a153d:	4c 89 f7             	mov    rdi,r14
 10a1540:	48 89 ee             	mov    rsi,rbp
 10a1543:	4c 89 fa             	mov    rdx,r15
 10a1546:	e8 9b 2d 00 00       	call   10a42e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b6fc>
 10a154b:	eb 16                	jmp    10a1563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268979>
 10a154d:	4c 89 e7             	mov    rdi,r12
 10a1550:	4c 89 fe             	mov    rsi,r15
 10a1553:	e8 52 2d 00 00       	call   10a42aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b6c0>
 10a1558:	4c 89 f7             	mov    rdi,r14
 10a155b:	48 89 c6             	mov    rsi,rax
 10a155e:	e8 87 10 d5 ff       	call   df25ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf670>
 10a1563:	48 81 c3 18 04 00 00 	add    rbx,0x418
 10a156a:	48 89 df             	mov    rdi,rbx
 10a156d:	48 83 c4 08          	add    rsp,0x8
 10a1571:	5b                   	pop    rbx
 10a1572:	41 5c                	pop    r12
 10a1574:	41 5d                	pop    r13
 10a1576:	41 5e                	pop    r14
 10a1578:	41 5f                	pop    r15
 10a157a:	5d                   	pop    rbp
 10a157b:	e9 28 75 a8 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 10a1580:	e8 3b 30 96 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 10a1585:	cc                   	int3
 10a1586:	53                   	push   rbx
 10a1587:	48 89 fb             	mov    rbx,rdi
 10a158a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10a158d:	e8 c2 00 00 00       	call   10a1654 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268a6a>
 10a1592:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10a1596:	5b                   	pop    rbx
 10a1597:	e9 ea ce 9f ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a159c:	48 89 c7             	mov    rdi,rax
 10a159f:	e8 01 85 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10a15a4:	53                   	push   rbx
 10a15a5:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10a15a8:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 10a15ac:	48 85 db             	test   rbx,rbx
 10a15af:	74 24                	je     10a15d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689eb>
 10a15b1:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10a15b5:	e8 f8 01 d5 ff       	call   df17b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe838>
 10a15ba:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10a15be:	e8 11 86 73 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10a15c3:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
 10a15c7:	e8 9e 89 9d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10a15cc:	48 89 df             	mov    rdi,rbx
 10a15cf:	5b                   	pop    rbx
 10a15d0:	e9 4b c9 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10a15d5:	5b                   	pop    rbx
 10a15d6:	c3                   	ret
 10a15d7:	cc                   	int3
 10a15d8:	53                   	push   rbx
 10a15d9:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10a15dc:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 10a15e0:	48 85 db             	test   rbx,rbx
 10a15e3:	74 6c                	je     10a1651 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268a67>
 10a15e5:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]
 10a15ec:	e8 3d 3d 62 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 10a15f1:	48 8d bb 10 01 00 00 	lea    rdi,[rbx+0x110]
 10a15f8:	e8 31 3d 62 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 10a15fd:	48                   	rex.W
 10a15fe:	8d                   	.byte 0x8d
 10a15ff:	bb                   	.byte 0xbb

## Table bytes


/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64

Contents of section .rela.dyn:
 162400 a0998701 00000000 08000000 00000000  ................
 162410 381d4e01 00000000 a8998701 00000000  8.N.............
 162420 08000000 00000000 4a1d4e01 00000000  ........J.N.....
 162430 b0998701 00000000 08000000 00000000  ................
 162440 5c1d4e01 00000000 b8998701 00000000  \.N.............
 162450 08000000 00000000 9c1d4e01 00000000  ..........N.....
 162460 c0998701 00000000 08000000 00000000  ................
 162470 161f4e01 00000000 c8998701 00000000  ..N.............
 162480 08000000 00000000 2e1f4e01 00000000  ..........N.....
 162490 d0998701 00000000 08000000 00000000  ................
 1624a0 c81f4e01 00000000 d8998701 00000000  ..N.............
 1624b0 08000000 00000000 40204e01 00000000  ........@ N.....
 1624c0 e0998701 00000000 08000000 00000000  ................
 1624d0 da204e01 00000000 e8998701 00000000  . N.............
 1624e0 08000000 00000000 74214e01 00000000  ........t!N.....
 1624f0 f0998701 00000000 08000000 00000000  ................
 162500 b4214e01 00000000 f8998701 00000000  .!N.............
 162510 08000000 00000000 6a224e01 00000000  ........j"N.....
 162520 009a8701 00000000 08000000 00000000  ................
 162530 a4224e01 00000000 089a8701 00000000  ."N.............
 162540 08000000 00000000 3e234e01 00000000  ........>#N.....
 162550 109a8701 00000000 08000000 00000000  ................
 162560 d8234e01 00000000 189a8701 00000000  .#N.............
 162570 08000000 00000000 72244e01 00000000  ........r$N.....
 162580 209a8701 00000000 08000000 00000000   ...............
 162590 8a244e01 00000000 289a8701 00000000  .$N.....(.......
 1625a0 08000000 00000000 b8244e01 00000000  .........$N.....
 1625b0 309a8701 00000000 08000000 00000000  0...............
 1625c0 d0244e01 00000000 389a8701 00000000  .$N.....8.......
 1625d0 08000000 00000000 e8244e01 00000000  .........$N.....
 1625e0 409a8701 00000000 08000000 00000000  @...............
 1625f0 d0254e01 00000000 589a8701 00000000  .%N.....X.......
 162600 08000000 00000000 ca404e01 00000000  .........@N.....
 162610 609a8701 00000000 08000000 00000000  `...............
 162620 c2414e01 00000000 689a8701 00000000  .AN.....h.......
 162630 08000000 00000000 d4414e01 00000000  .........AN.....
 162640 709a8701 00000000 08000000 00000000  p...............
 162650 b0424e01 00000000 789a8701 00000000  .BN.....x.......
 162660 08000000 00000000 1c434e01 00000000  .........CN.....
 162670 809a8701 00000000 08000000 00000000  ................
 162680 284b4e01 00000000 889a8701 00000000  (KN.............
 162690 08000000 00000000 404c4e01 00000000  ........@LN.....
 1626a0 909a8701 00000000 08000000 00000000  ................
 1626b0 98bd2501 00000000 989a8701 00000000  ..%.............
 1626c0 08000000 00000000 4e4c4e01 00000000  ........NLN.....
 1626d0 a09a8701 00000000 08000000 00000000  ................
 1626e0 be4c4e01 00000000 a89a8701 00000000  .LN.............
 1626f0 08000000 00000000 ea4c4e01 00000000  .........LN.....

## Table relocations

0000000001879a18  0000000000000008 R_X86_64_RELATIVE                         14e2472
0000000001879a20  0000000000000008 R_X86_64_RELATIVE                         14e248a
0000000001879a38  0000000000000008 R_X86_64_RELATIVE                         14e24e8
