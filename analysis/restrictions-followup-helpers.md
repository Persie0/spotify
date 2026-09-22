# Restrictions follow-up helper trace

Purpose: follow the post-`rsp+0x310` helper path after `analysis/restrictions-local-slice-a79a7e.md`.

## Caller points
| caller | address | context |
|---|---:|---|
| `local-call-17add2a` | `0x14ce72c` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` |
| `a79a7e-call-17d5775` | `0xa79af4` | `JNI_OnUnload@@Base` |
| `a79a7e-format-call-a79ce6` | `0xa79b18` | `JNI_OnUnload@@Base` |

### Caller context `local-call-17add2a` at `0x14ce72c`
```text
     14ce6e5:	48 8d 05 94 ab 3a 00 	lea    rax,[rip+0x3aab94]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14ce6ec:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14ce6f0:	4c 89 eb             	mov    rbx,r13
     14ce6f3:	48 83 c3 18          	add    rbx,0x18
     14ce6f7:	48 8d 05 ba ab 3a 00 	lea    rax,[rip+0x3aabba]        # 18792b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x359a0>
     14ce6fe:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     14ce702:	e9 5c 01 00 00       	jmp    14ce863 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313de7>
     14ce707:	48 8d b4 24 b1 02 00 	lea    rsi,[rsp+0x2b1]
     14ce70e:	00 
     14ce70f:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ce716:	00 
     14ce717:	e8 62 b3 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14ce71c:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14ce723:	00 
     14ce724:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ce72b:	00 
     14ce72c:	e8 f9 f5 2d 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>
     14ce731:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ce738:	00 
     14ce739:	e8 52 f7 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ce73e:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14ce745:	00 
     14ce746:	e8 45 f7 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ce74b:	48 8b 84 24 38 02 00 	mov    rax,QWORD PTR [rsp+0x238]
     14ce752:	00 
     14ce753:	83 78 10 ff          	cmp    DWORD PTR [rax+0x10],0xffffffff
     14ce757:	0f 84 cc 00 00 00    	je     14ce829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313dad>
     14ce75d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ce764:	00 
     14ce765:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
     14ce76c:	00 
```

### Caller context `a79a7e-call-17d5775` at `0xa79af4`
```text
      a79ab9:	48 83 ec 30          	sub    rsp,0x30
      a79abd:	89 d3                	mov    ebx,edx
      a79abf:	49 89 f7             	mov    r15,rsi
      a79ac2:	49 89 fc             	mov    r12,rdi
      a79ac5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79acc:	00 00 
      a79ace:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      a79ad3:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
      a79ad8:	4c 89 f7             	mov    rdi,r14
      a79adb:	e8 0c b0 d5 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>
      a79ae0:	4d 8b 36             	mov    r14,QWORD PTR [r14]
      a79ae3:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      a79ae8:	4c 89 ef             	mov    rdi,r13
      a79aeb:	4c 89 f6             	mov    rsi,r14
      a79aee:	4c 89 e2             	mov    rdx,r12
      a79af1:	4c 89 f9             	mov    rcx,r15
      a79af4:	e8 7c bc d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>
      a79af9:	49 8b 4d 08          	mov    rcx,QWORD PTR [r13+0x8]
      a79afd:	48 85 c9             	test   rcx,rcx
      a79b00:	74 23                	je     a79b25 <JNI_OnUnload@@Base+0x13f2>
      a79b02:	48 8b 35 af 97 f6 00 	mov    rsi,QWORD PTR [rip+0xf697af]        # 19e32b8 <__cxa_new_handler@@Base+0x2b48>
      a79b09:	48 8b 15 90 97 f6 00 	mov    rdx,QWORD PTR [rip+0xf69790]        # 19e32a0 <__cxa_new_handler@@Base+0x2b30>
      a79b10:	4c 89 f7             	mov    rdi,r14
      a79b13:	41 89 d8             	mov    r8d,ebx
      a79b16:	31 c0                	xor    eax,eax
      a79b18:	e8 c9 01 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>
      a79b1d:	4c 89 f7             	mov    rdi,r14
      a79b20:	e8 c3 b0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a79b25:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a79b2a:	e8 97 c1 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a79b2f:	8a 44 24 20          	mov    al,BYTE PTR [rsp+0x20]
```

### Caller context `a79a7e-format-call-a79ce6` at `0xa79b18`
```text
      a79adb:	e8 0c b0 d5 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>
      a79ae0:	4d 8b 36             	mov    r14,QWORD PTR [r14]
      a79ae3:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      a79ae8:	4c 89 ef             	mov    rdi,r13
      a79aeb:	4c 89 f6             	mov    rsi,r14
      a79aee:	4c 89 e2             	mov    rdx,r12
      a79af1:	4c 89 f9             	mov    rcx,r15
      a79af4:	e8 7c bc d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>
      a79af9:	49 8b 4d 08          	mov    rcx,QWORD PTR [r13+0x8]
      a79afd:	48 85 c9             	test   rcx,rcx
      a79b00:	74 23                	je     a79b25 <JNI_OnUnload@@Base+0x13f2>
      a79b02:	48 8b 35 af 97 f6 00 	mov    rsi,QWORD PTR [rip+0xf697af]        # 19e32b8 <__cxa_new_handler@@Base+0x2b48>
      a79b09:	48 8b 15 90 97 f6 00 	mov    rdx,QWORD PTR [rip+0xf69790]        # 19e32a0 <__cxa_new_handler@@Base+0x2b30>
      a79b10:	4c 89 f7             	mov    rdi,r14
      a79b13:	41 89 d8             	mov    r8d,ebx
      a79b16:	31 c0                	xor    eax,eax
      a79b18:	e8 c9 01 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>
      a79b1d:	4c 89 f7             	mov    rdi,r14
      a79b20:	e8 c3 b0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a79b25:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a79b2a:	e8 97 c1 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a79b2f:	8a 44 24 20          	mov    al,BYTE PTR [rsp+0x20]
      a79b33:	8a 4c 24 21          	mov    cl,BYTE PTR [rsp+0x21]
      a79b37:	64 48 8b 14 25 28 00 	mov    rdx,QWORD PTR fs:0x28
      a79b3e:	00 00 
      a79b40:	48 3b 54 24 28       	cmp    rdx,QWORD PTR [rsp+0x28]
      a79b45:	75 18                	jne    a79b5f <JNI_OnUnload@@Base+0x142c>
      a79b47:	0f b6 f8             	movzx  edi,al
      a79b4a:	0f b6 f1             	movzx  esi,cl
      a79b4d:	48 83 c4 30          	add    rsp,0x30
      a79b51:	5b                   	pop    rbx
```

## Helper summaries
| helper | label/context | direct xrefs | arg-memory refs in window | arg-derived writes | calls in window | returns in window |
|---|---|---:|---:|---:|---:|---:|
| `17add2a` / `0x17add2a` | `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | 7 | 6 | 4 | 20 | 8 |
| `17d5775` / `0x17d5775` | `Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base` | 64 | 3 | 0 | 8 | 1 |
| `a79ce6` / `0xa79ce6` | `JNI_OnUnload@@Base` | 17 | 2 | 1 | 32 | 10 |

## Helper `17add2a` at `0x17add2a`

### Entry body window
```text
     17add2a:	41 57                	push   r15
     17add2c:	41 56                	push   r14
     17add2e:	53                   	push   rbx
     17add2f:	49 89 f7             	mov    r15,rsi
     17add32:	48 89 fb             	mov    rbx,rdi
     17add35:	48 8d 05 1c f7 0f 00 	lea    rax,[rip+0xff71c]        # 18ad458 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1a398>
     17add3c:	48 89 07             	mov    QWORD PTR [rdi],rax
     17add3f:	6a 18                	push   0x18
     17add41:	5f                   	pop    rdi
     17add42:	e8 b9 01 04 00       	call   17edf00 <_Znwm@plt>
     17add47:	49 89 c6             	mov    r14,rax
     17add4a:	c6 40 15 01          	mov    BYTE PTR [rax+0x15],0x1
     17add4e:	41 f6 07 01          	test   BYTE PTR [r15],0x1
     17add52:	74 06                	je     17add5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161ec6>
     17add54:	4d 8b 7f 10          	mov    r15,QWORD PTR [r15+0x10]
     17add58:	eb 03                	jmp    17add5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161ec9>
     17add5a:	49 ff c7             	inc    r15
     17add5d:	6a 02                	push   0x2
     17add5f:	5e                   	pop    rsi
     17add60:	4c 89 ff             	mov    rdi,r15
     17add63:	e8 28 75 01 00       	call   17c5290 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1793fc>
     17add68:	41 89 46 10          	mov    DWORD PTR [r14+0x10],eax
     17add6c:	83 f8 ff             	cmp    eax,0xffffffff
     17add6f:	0f 57 c0             	xorps  xmm0,xmm0
     17add72:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     17add76:	41 0f 94 46 14       	sete   BYTE PTR [r14+0x14]
     17add7b:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     17add7f:	5b                   	pop    rbx
     17add80:	41 5e                	pop    r14
     17add82:	41 5f                	pop    r15
     17add84:	c3                   	ret
     17add85:	48 89 c3             	mov    rbx,rax
     17add88:	4c 89 f7             	mov    rdi,r14
     17add8b:	e8 90 01 04 00       	call   17edf20 <_ZdlPv@plt>
     17add90:	48 89 df             	mov    rdi,rbx
     17add93:	e8 38 1f 2c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     17add98:	53                   	push   rbx
     17add99:	48 89 fb             	mov    rbx,rdi
     17add9c:	48 8d 05 b5 f6 0f 00 	lea    rax,[rip+0xff6b5]        # 18ad458 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1a398>
     17adda3:	48 89 07             	mov    QWORD PTR [rdi],rax
     17adda6:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     17addaa:	8b 78 10             	mov    edi,DWORD PTR [rax+0x10]
     17addad:	83 ff ff             	cmp    edi,0xffffffff
     17addb0:	74 0f                	je     17addc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f2d>
     17addb2:	80 78 15 00          	cmp    BYTE PTR [rax+0x15],0x0
     17addb6:	74 09                	je     17addc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f2d>
     17addb8:	e8 7e 76 01 00       	call   17c543b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1795a7>
     17addbd:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     17addc1:	83 48 10 ff          	or     DWORD PTR [rax+0x10],0xffffffff
     17addc5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     17addc9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     17addcc:	48 85 c0             	test   rax,rax
     17addcf:	74 18                	je     17adde9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f55>
     17addd1:	48 89 c7             	mov    rdi,rax
     17addd4:	e8 17 07 04 00       	call   17ee4f0 <_ZdaPv@plt>
     17addd9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     17adddd:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     17adde2:	48 85 ff             	test   rdi,rdi
     17adde5:	75 07                	jne    17addee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f5a>
     17adde7:	5b                   	pop    rbx
     17adde8:	c3                   	ret
     17adde9:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     17addee:	5b                   	pop    rbx
     17addef:	e9 2c 01 04 00       	jmp    17edf20 <_ZdlPv@plt>
     17addf4:	48 89 c7             	mov    rdi,rax
     17addf7:	e8 a9 bc 2c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     17addfc:	53                   	push   rbx
     17addfd:	48 89 fb             	mov    rbx,rdi
     17ade00:	e8 93 ff ff ff       	call   17add98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f04>
     17ade05:	48 89 df             	mov    rdi,rbx
     17ade08:	5b                   	pop    rbx
     17ade09:	e9 12 01 04 00       	jmp    17edf20 <_ZdlPv@plt>
     17ade0e:	41 57                	push   r15
     17ade10:	41 56                	push   r14
     17ade12:	41 54                	push   r12
     17ade14:	53                   	push   rbx
     17ade15:	50                   	push   rax
     17ade16:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
     17ade1a:	41 80 7c 24 14 00    	cmp    BYTE PTR [r12+0x14],0x0
     17ade20:	74 04                	je     17ade26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f92>
     17ade22:	31 c0                	xor    eax,eax
     17ade24:	eb 7b                	jmp    17adea1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16200d>
     17ade26:	48 89 d3             	mov    rbx,rdx
     17ade29:	49 89 f7             	mov    r15,rsi
     17ade2c:	49 89 fe             	mov    r14,rdi
     17ade2f:	41 8b 44 24 0c       	mov    eax,DWORD PTR [r12+0xc]
     17ade34:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     17ade38:	48 85 c0             	test   rax,rax
     17ade3b:	74 21                	je     17ade5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161fca>
     17ade3d:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
     17ade42:	48 01 ce             	add    rsi,rcx
     17ade45:	48 29 c6             	sub    rsi,rax
     17ade48:	49 89 37             	mov    QWORD PTR [r15],rsi
     17ade4b:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     17ade4f:	8b 40 0c             	mov    eax,DWORD PTR [rax+0xc]
     17ade52:	89 03                	mov    DWORD PTR [rbx],eax
     17ade54:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     17ade58:	83 60 0c 00          	and    DWORD PTR [rax+0xc],0x0
     17ade5c:	eb 41                	jmp    17ade9f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16200b>
     17ade5e:	48 85 f6             	test   rsi,rsi
     17ade61:	75 16                	jne    17ade79 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161fe5>
     17ade63:	bf 00 20 00 00       	mov    edi,0x2000
     17ade68:	e8 03 0f 04 00       	call   17eed70 <_Znam@plt>
     17ade6d:	49 89 04 24          	mov    QWORD PTR [r12],rax
     17ade71:	4d 8b 66 08          	mov    r12,QWORD PTR [r14+0x8]
     17ade75:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     17ade79:	41 8b 7c 24 10       	mov    edi,DWORD PTR [r12+0x10]
     17ade7e:	ba 00 20 00 00       	mov    edx,0x2000
     17ade83:	e8 ad 74 01 00       	call   17c5335 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1794a1>
     17ade88:	85 c0                	test   eax,eax
     17ade8a:	7e 21                	jle    17adead <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162019>
     17ade8c:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
     17ade90:	89 41 08             	mov    DWORD PTR [rcx+0x8],eax
     17ade93:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
     17ade97:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
     17ade9a:	49 89 0f             	mov    QWORD PTR [r15],rcx
     17ade9d:	89 03                	mov    DWORD PTR [rbx],eax
     17ade9f:	b0 01                	mov    al,0x1
     17adea1:	48 83 c4 08          	add    rsp,0x8
     17adea5:	5b                   	pop    rbx
    ... truncated 178 additional instructions ...
```

### Arg-memory refs
| addr | arg-derived location | instruction |
|---|---|---|
| `0x17add3c` | `arg:rdi` | `17add3c:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x17add4e` | `arg:rsi` | `17add4e:	41 f6 07 01          	test   BYTE PTR [r15],0x1` |
| `0x17add54` | `arg:rsi+10` | `17add54:	4d 8b 7f 10          	mov    r15,QWORD PTR [r15+0x10]` |
| `0x17add7b` | `arg:rdi+8` | `17add7b:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14` |
| `0x17ade52` | `arg:rdx` | `17ade52:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x17ade9d` | `arg:rdx` | `17ade9d:	89 03                	mov    DWORD PTR [rbx],eax` |

### Arg-derived writes
| addr | arg-derived location | instruction |
|---|---|---|
| `0x17add3c` | `arg:rdi` | `17add3c:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x17add7b` | `arg:rdi+8` | `17add7b:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14` |
| `0x17ade52` | `arg:rdx` | `17ade52:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x17ade9d` | `arg:rdx` | `17ade9d:	89 03                	mov    DWORD PTR [rbx],eax` |

### Calls inside helper window
| call | tracked arg state | instruction |
|---|---|---|
| `0x17add42` | `rsi=arg:rsi, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17add42:	e8 b9 01 04 00       	call   17edf00 <_Znwm@plt>` |
| `0x17add63` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17add63:	e8 28 75 01 00       	call   17c5290 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1793fc>` |
| `0x17add8b` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17add8b:	e8 90 01 04 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x17add93` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17add93:	e8 38 1f 2c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x17addb8` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17addb8:	e8 7e 76 01 00       	call   17c543b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1795a7>` |
| `0x17addd4` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17addd4:	e8 17 07 04 00       	call   17ee4f0 <_ZdaPv@plt>` |
| `0x17addf7` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17addf7:	e8 a9 bc 2c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x17ade00` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17ade00:	e8 93 ff ff ff       	call   17add98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f04>` |
| `0x17ade68` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17ade68:	e8 03 0f 04 00       	call   17eed70 <_Znam@plt>` |
| `0x17ade83` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17ade83:	e8 ad 74 01 00       	call   17c5335 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1794a1>` |
| `0x17adef9` | `r8=arg:r8, r9=arg:r9` | `17adef9:	e8 13 75 01 00       	call   17c5411 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17957d>` |
| `0x17adf3b` | `r8=arg:r8, r9=arg:r9` | `17adf3b:	e8 64 75 01 00       	call   17c54a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179610>` |
| `0x17adf67` | `r8=arg:r8, r9=arg:r9` | `17adf67:	e8 44 1b 04 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x17adf98` | `r8=arg:r8, r9=arg:r9` | `17adf98:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x17adfaa` | `r8=arg:r8, r9=arg:r9` | `17adfaa:	e8 92 75 01 00       	call   17c5541 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1796ad>` |
| `0x17adfd7` | `r8=arg:r8, r9=arg:r9` | `17adfd7:	e8 d4 1a 04 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x17ae00c` | `r8=arg:r8, r9=arg:r9` | `17ae00c:	e8 00 74 01 00       	call   17c5411 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17957d>` |
| `0x17ae065` | `r8=arg:r8, r9=arg:r9` | `17ae065:	e8 96 fe 03 00       	call   17edf00 <_Znwm@plt>` |
| `0x17ae092` | `r8=arg:r8, r9=arg:r9` | `17ae092:	e8 e9 ff 03 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>` |
| `0x17ae0a9` | `r8=arg:r8, r9=arg:r9` | `17ae0a9:	e8 ee 9b 2f ff       	call   aa7c9c <JNI_OnUnload@@Base+0x2f569>` |

### First direct xrefs
- `0xd6caf3` in `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`: `d6caf3:	e8 32 12 a4 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>`
- `0xdcc2cf` in `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`: `dcc2cf:	e8 56 1a 9e 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>`
- `0x12e3d78` in `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`: `12e3d78:	e8 ad 9f 4c 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>`
- `0x13f966b` in `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`: `13f966b:	e8 ba 46 3b 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>`
- `0x14ce72c` in `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`: `14ce72c:	e8 f9 f5 2d 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>`
- `0x16300c5` in `_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`: `16300c5:	e8 60 dc 17 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>`
- `0x17af546` in `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`: `17af546:	e8 df e7 ff ff       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>`

## Helper `17d5775` at `0x17d5775`

### Entry body window
```text
     17d5775:	55                   	push   rbp
     17d5776:	41 57                	push   r15
     17d5778:	41 56                	push   r14
     17d577a:	41 55                	push   r13
     17d577c:	41 54                	push   r12
     17d577e:	53                   	push   rbx
     17d577f:	48 83 ec 58          	sub    rsp,0x58
     17d5783:	49 89 cd             	mov    r13,rcx
     17d5786:	49 89 d4             	mov    r12,rdx
     17d5789:	49 89 f7             	mov    r15,rsi
     17d578c:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     17d5791:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17d5798:	00 00 
     17d579a:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     17d579f:	0f 57 c0             	xorps  xmm0,xmm0
     17d57a2:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
     17d57a7:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     17d57ac:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     17d57af:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
     17d57b4:	c6 44 24 48 00       	mov    BYTE PTR [rsp+0x48],0x0
     17d57b9:	48 85 c9             	test   rcx,rcx
     17d57bc:	74 3c                	je     17d57fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x161b>
     17d57be:	0f 88 2b 03 00 00    	js     17d5aef <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1910>
     17d57c4:	4d 89 fe             	mov    r14,r15
     17d57c7:	4e 8d 3c 6d 00 00 00 	lea    r15,[r13*2+0x0]
     17d57ce:	00 
     17d57cf:	4c 89 ff             	mov    rdi,r15
     17d57d2:	e8 29 87 01 00       	call   17edf00 <_Znwm@plt>
     17d57d7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     17d57dc:	4a 8d 2c 68          	lea    rbp,[rax+r13*2]
     17d57e0:	48 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],rbp
     17d57e5:	48 89 c7             	mov    rdi,rax
     17d57e8:	31 f6                	xor    esi,esi
     17d57ea:	4c 89 fa             	mov    rdx,r15
     17d57ed:	e8 9e 93 01 00       	call   17eeb90 <memset@plt>
     17d57f2:	48 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],rbp
     17d57f7:	4d 89 f7             	mov    r15,r14
     17d57fa:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
     17d57ff:	41 c6 46 08 01       	mov    BYTE PTR [r14+0x8],0x1
     17d5804:	4c 89 f7             	mov    rdi,r14
     17d5807:	e8 16 62 2a ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
     17d580c:	4d 85 ed             	test   r13,r13
     17d580f:	0f 8e 2e 02 00 00    	jle    17d5a43 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1864>
     17d5815:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     17d581a:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     17d581f:	48 29 c1             	sub    rcx,rax
     17d5822:	48 d1 e9             	shr    rcx,1
     17d5825:	4b 8d 14 2c          	lea    rdx,[r12+r13*1]
     17d5829:	4b 8d 34 2c          	lea    rsi,[r12+r13*1]
     17d582d:	48 83 c6 fe          	add    rsi,0xfffffffffffffffe
     17d5831:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     17d5836:	4b 8d 34 2c          	lea    rsi,[r12+r13*1]
     17d583a:	48 ff ce             	dec    rsi
     17d583d:	48 89 74 24 18       	mov    QWORD PTR [rsp+0x18],rsi
     17d5842:	45 31 c0             	xor    r8d,r8d
     17d5845:	31 ed                	xor    ebp,ebp
     17d5847:	4d 8d 6c 24 01       	lea    r13,[r12+0x1]
     17d584c:	45 0f b6 1c 24       	movzx  r11d,BYTE PTR [r12]
     17d5851:	45 84 db             	test   r11b,r11b
     17d5854:	78 08                	js     17d585e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x167f>
     17d5856:	4d 89 ec             	mov    r12,r13
     17d5859:	e9 6d 01 00 00       	jmp    17d59cb <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x17ec>
     17d585e:	44 89 de             	mov    esi,r11d
     17d5861:	83 e6 e0             	and    esi,0xffffffe0
     17d5864:	45 0f b6 d0          	movzx  r10d,r8b
     17d5868:	81 fe c0 00 00 00    	cmp    esi,0xc0
     17d586e:	75 55                	jne    17d58c5 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x16e6>
     17d5870:	41 b0 01             	mov    r8b,0x1
     17d5873:	49 39 d5             	cmp    r13,rdx
     17d5876:	0f 83 46 01 00 00    	jae    17d59c2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x17e3>
     17d587c:	45 0f b6 4d 00       	movzx  r9d,BYTE PTR [r13+0x0]
     17d5881:	44 89 ce             	mov    esi,r9d
     17d5884:	83 e6 c0             	and    esi,0xffffffc0
     17d5887:	81 fe 80 00 00 00    	cmp    esi,0x80
     17d588d:	0f 85 2f 01 00 00    	jne    17d59c2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x17e3>
     17d5893:	41 83 e3 1f          	and    r11d,0x1f
     17d5897:	41 c1 e3 06          	shl    r11d,0x6
     17d589b:	41 83 e1 3f          	and    r9d,0x3f
     17d589f:	45 09 d9             	or     r9d,r11d
     17d58a2:	49 83 c4 02          	add    r12,0x2
     17d58a6:	41 83 f9 7f          	cmp    r9d,0x7f
     17d58aa:	6a 01                	push   0x1
     17d58ac:	5e                   	pop    rsi
     17d58ad:	44 0f 46 d6          	cmovbe r10d,esi
     17d58b1:	be fd ff 00 00       	mov    esi,0xfffd
     17d58b6:	44 0f 46 ce          	cmovbe r9d,esi
     17d58ba:	45 89 d0             	mov    r8d,r10d
     17d58bd:	45 89 cb             	mov    r11d,r9d
     17d58c0:	e9 06 01 00 00       	jmp    17d59cb <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x17ec>
     17d58c5:	44 89 de             	mov    esi,r11d
     17d58c8:	83 e6 f0             	and    esi,0xfffffff0
     17d58cb:	81 fe e0 00 00 00    	cmp    esi,0xe0
     17d58d1:	75 72                	jne    17d5945 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1766>
     17d58d3:	41 b0 01             	mov    r8b,0x1
     17d58d6:	4c 3b 6c 24 18       	cmp    r13,QWORD PTR [rsp+0x18]
     17d58db:	0f 83 e1 00 00 00    	jae    17d59c2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x17e3>
     17d58e1:	41 0f b6 74 24 01    	movzx  esi,BYTE PTR [r12+0x1]
     17d58e7:	41 0f b6 7c 24 02    	movzx  edi,BYTE PTR [r12+0x2]
     17d58ed:	41 89 f9             	mov    r9d,edi
     17d58f0:	41 c1 e1 08          	shl    r9d,0x8
     17d58f4:	41 09 f1             	or     r9d,esi
     17d58f7:	41 81 e1 c0 c0 00 00 	and    r9d,0xc0c0
     17d58fe:	41 81 f9 80 80 00 00 	cmp    r9d,0x8080
     17d5905:	0f 85 b7 00 00 00    	jne    17d59c2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x17e3>
     17d590b:	41 c1 e3 0c          	shl    r11d,0xc
     17d590f:	45 0f b7 c3          	movzx  r8d,r11w
     17d5913:	83 e6 3f             	and    esi,0x3f
     17d5916:	c1 e6 06             	shl    esi,0x6
     17d5919:	44 09 c6             	or     esi,r8d
     17d591c:	83 e7 3f             	and    edi,0x3f
     17d591f:	09 f7                	or     edi,esi
     17d5921:	49 83 c4 03          	add    r12,0x3
     17d5925:	81 ff 00 08 00 00    	cmp    edi,0x800
     17d592b:	6a 01                	push   0x1
     17d592d:	5e                   	pop    rsi
     17d592e:	44 0f 42 d6          	cmovb  r10d,esi
     17d5932:	be fd ff 00 00       	mov    esi,0xfffd
     17d5937:	0f 42 fe             	cmovb  edi,esi
     17d593a:	45 89 d0             	mov    r8d,r10d
     17d593d:	41 89 fb             	mov    r11d,edi
    ... truncated 120 additional instructions ...
```

### Arg-memory refs
| addr | arg-derived location | instruction |
|---|---|---|
| `0x17d5847` | `arg:rdx+1` | `17d5847:	4d 8d 6c 24 01       	lea    r13,[r12+0x1]` |
| `0x17d584c` | `arg:rdx` | `17d584c:	45 0f b6 1c 24       	movzx  r11d,BYTE PTR [r12]` |
| `0x17d587c` | `arg:rdx+1` | `17d587c:	45 0f b6 4d 00       	movzx  r9d,BYTE PTR [r13+0x0]` |

### Arg-derived writes
- none in bounded window

### Calls inside helper window
| call | tracked arg state | instruction |
|---|---|---|
| `0x17d57d2` | `rsi=arg:rsi, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17d57d2:	e8 29 87 01 00       	call   17edf00 <_Znwm@plt>` |
| `0x17d57ed` | `rsi=arg:rsi, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17d57ed:	e8 9e 93 01 00       	call   17eeb90 <memset@plt>` |
| `0x17d5807` | `rsi=arg:rsi, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `17d5807:	e8 16 62 2a ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>` |
| `0x17d5a60` | `r8=arg:r8, r9=arg:r9` | `17d5a60:	e8 83 f1 ff ff       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0x17d5a72` | `r8=arg:r8, r9=arg:r9` | `17d5a72:	ff 90 18 05 00 00    	call   QWORD PTR [rax+0x518]` |
| `0x17d5a88` | `r8=arg:r8, r9=arg:r9` | `17d5a88:	e8 5b f1 ff ff       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0x17d5abe` | `r8=arg:r8, r9=arg:r9` | `17d5abe:	e8 03 02 00 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0x17d5acb` | `r8=arg:r8, r9=arg:r9` | `17d5acb:	e8 94 5c 2a ff       	call   a7b764 <JNI_OnUnload@@Base+0x3031>` |

### First direct xrefs
- `0xa79af4` in `JNI_OnUnload@@Base`: `a79af4:	e8 7c bc d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa79bb0` in `JNI_OnUnload@@Base`: `a79bb0:	e8 c0 bb d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa79c6d` in `JNI_OnUnload@@Base`: `a79c6d:	e8 03 bb d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa7c358` in `JNI_OnUnload@@Base`: `a7c358:	e8 18 94 d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa7c37d` in `JNI_OnUnload@@Base`: `a7c37d:	e8 f3 93 d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9bdbf` in `JNI_OnUnload@@Base`: `a9bdbf:	e8 b1 99 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9bdf2` in `JNI_OnUnload@@Base`: `a9bdf2:	e8 7e 99 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9bf53` in `JNI_OnUnload@@Base`: `a9bf53:	e8 1d 98 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9bf86` in `JNI_OnUnload@@Base`: `a9bf86:	e8 ea 97 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9c0ec` in `JNI_OnUnload@@Base`: `a9c0ec:	e8 84 96 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9c120` in `JNI_OnUnload@@Base`: `a9c120:	e8 50 96 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9c2f6` in `JNI_OnUnload@@Base`: `a9c2f6:	e8 7a 94 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9c32a` in `JNI_OnUnload@@Base`: `a9c32a:	e8 46 94 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9c5f2` in `JNI_OnUnload@@Base`: `a9c5f2:	e8 7e 91 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9c64f` in `JNI_OnUnload@@Base`: `a9c64f:	e8 21 91 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9c68c` in `JNI_OnUnload@@Base`: `a9c68c:	e8 e4 90 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9c988` in `JNI_OnUnload@@Base`: `a9c988:	e8 e8 8d d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9d016` in `JNI_OnUnload@@Base`: `a9d016:	e8 5a 87 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9d117` in `JNI_OnUnload@@Base`: `a9d117:	e8 59 86 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa9d246` in `JNI_OnUnload@@Base`: `a9d246:	e8 2a 85 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- truncated 44 additional xrefs

## Helper `a79ce6` at `0xa79ce6`

### Entry body window
```text
      a79ce6:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
      a79ced:	49 89 e2             	mov    r10,rsp
      a79cf0:	49 89 4a 18          	mov    QWORD PTR [r10+0x18],rcx
      a79cf4:	4d 89 42 20          	mov    QWORD PTR [r10+0x20],r8
      a79cf8:	4d 89 4a 28          	mov    QWORD PTR [r10+0x28],r9
      a79cfc:	84 c0                	test   al,al
      a79cfe:	74 31                	je     a79d31 <JNI_OnUnload@@Base+0x15fe>
      a79d00:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      a79d05:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
      a79d0a:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
      a79d0f:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
      a79d14:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
      a79d19:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
      a79d20:	00 
      a79d21:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
      a79d28:	00 
      a79d29:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
      a79d30:	00 
      a79d31:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79d38:	00 00 
      a79d3a:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
      a79d41:	00 
      a79d42:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
      a79d49:	00 
      a79d4a:	4c 89 51 10          	mov    QWORD PTR [rcx+0x10],r10
      a79d4e:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
      a79d55:	00 
      a79d56:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      a79d5a:	48 b8 18 00 00 00 30 	movabs rax,0x3000000018
      a79d61:	00 00 00 
      a79d64:	48 89 01             	mov    QWORD PTR [rcx],rax
      a79d67:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a79d6a:	ff 90 70 04 00 00    	call   QWORD PTR [rax+0x470]
      a79d70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79d77:	00 00 
      a79d79:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
      a79d80:	00 
      a79d81:	75 08                	jne    a79d8b <JNI_OnUnload@@Base+0x1658>
      a79d83:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
      a79d8a:	c3                   	ret
      a79d8b:	e8 20 5d d7 00       	call   17efab0 <__stack_chk_fail@plt>
      a79d90:	41 56                	push   r14
      a79d92:	53                   	push   rbx
      a79d93:	50                   	push   rax
      a79d94:	49 89 fe             	mov    r14,rdi
      a79d97:	6a 10                	push   0x10
      a79d99:	5f                   	pop    rdi
      a79d9a:	e8 11 41 d7 00       	call   17edeb0 <__cxa_allocate_exception@plt>
      a79d9f:	48 89 c3             	mov    rbx,rax
      a79da2:	48 89 c7             	mov    rdi,rax
      a79da5:	4c 89 f6             	mov    rsi,r14
      a79da8:	e8 29 00 00 00       	call   a79dd6 <JNI_OnUnload@@Base+0x16a3>
      a79dad:	48 8b 35 9c 7c e3 00 	mov    rsi,QWORD PTR [rip+0xe37c9c]        # 18b1a50 <_ZTISt12length_error@@Base+0xb8450>
      a79db4:	48 8b 15 8d 7c e3 00 	mov    rdx,QWORD PTR [rip+0xe37c8d]        # 18b1a48 <_ZNSt12length_errorD1Ev@@Base+0xe5bdf8>
      a79dbb:	48 89 df             	mov    rdi,rbx
      a79dbe:	e8 1d 41 d7 00       	call   17edee0 <__cxa_throw@plt>
      a79dc3:	49 89 c6             	mov    r14,rax
      a79dc6:	48 89 df             	mov    rdi,rbx
      a79dc9:	e8 f2 40 d7 00       	call   17edec0 <__cxa_free_exception@plt>
      a79dce:	4c 89 f7             	mov    rdi,r14
      a79dd1:	e8 fa 5e ff ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      a79dd6:	53                   	push   rbx
      a79dd7:	48 89 fb             	mov    rbx,rdi
      a79dda:	e8 11 41 d7 00       	call   17edef0 <_ZNSt11logic_errorC2EPKc@plt>
      a79ddf:	48 8b 05 72 7c e3 00 	mov    rax,QWORD PTR [rip+0xe37c72]        # 18b1a58 <_ZTVSt12length_error@@Base+0xb8480>
      a79de6:	48 83 c0 10          	add    rax,0x10
      a79dea:	48 89 03             	mov    QWORD PTR [rbx],rax
      a79ded:	5b                   	pop    rbx
      a79dee:	c3                   	ret
      a79def:	53                   	push   rbx
      a79df0:	48 89 fb             	mov    rbx,rdi
      a79df3:	e8 08 41 d7 00       	call   17edf00 <_Znwm@plt>
      a79df8:	48 89 da             	mov    rdx,rbx
      a79dfb:	5b                   	pop    rbx
      a79dfc:	c3                   	ret
      a79dfd:	80 3d bc 94 f6 00 00 	cmp    BYTE PTR [rip+0xf694bc],0x0        # 19e32c0 <__cxa_new_handler@@Base+0x2b50>
      a79e04:	74 01                	je     a79e07 <JNI_OnUnload@@Base+0x16d4>
      a79e06:	c3                   	ret
      a79e07:	c6 05 b2 94 f6 00 01 	mov    BYTE PTR [rip+0xf694b2],0x1        # 19e32c0 <__cxa_new_handler@@Base+0x2b50>
      a79e0e:	48 8d 3d 13 00 00 00 	lea    rdi,[rip+0x13]        # a79e28 <JNI_OnUnload@@Base+0x16f5>
      a79e15:	48 8d 35 ac 94 f6 00 	lea    rsi,[rip+0xf694ac]        # 19e32c8 <__cxa_new_handler@@Base+0x2b58>
      a79e1c:	48 8d 15 dd a1 d7 00 	lea    rdx,[rip+0xd7a1dd]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
      a79e23:	e9 38 40 d7 00       	jmp    17ede60 <__cxa_atexit@plt>
      a79e28:	48 89 f8             	mov    rax,rdi
      a79e2b:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      a79e2e:	48 83 20 00          	and    QWORD PTR [rax],0x0
      a79e32:	48 85 ff             	test   rdi,rdi
      a79e35:	74 06                	je     a79e3d <JNI_OnUnload@@Base+0x170a>
      a79e37:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a79e3a:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
      a79e3d:	c3                   	ret
      a79e3e:	41 57                	push   r15
      a79e40:	41 56                	push   r14
      a79e42:	53                   	push   rbx
      a79e43:	48 83 ec 60          	sub    rsp,0x60
      a79e47:	48 89 f3             	mov    rbx,rsi
      a79e4a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79e51:	00 00 
      a79e53:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      a79e58:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a79e5d:	e8 1b b6 d5 00       	call   17d547d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x129e>
      a79e62:	6a 10                	push   0x10
      a79e64:	5f                   	pop    rdi
      a79e65:	e8 96 40 d7 00       	call   17edf00 <_Znwm@plt>
      a79e6a:	49 89 c7             	mov    r15,rax
      a79e6d:	48 8d 05 6c 30 d8 00 	lea    rax,[rip+0xd8306c]        # 17fcee0 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2c00>
      a79e74:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a79e79:	48 89 02             	mov    QWORD PTR [rdx],rax
      a79e7c:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
      a79e80:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      a79e85:	4c 89 ff             	mov    rdi,r15
      a79e88:	e8 97 8a b9 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>
      a79e8d:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
      a79e91:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a79e96:	e8 cf 00 00 00       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      a79e9b:	6a 18                	push   0x18
      a79e9d:	5f                   	pop    rdi
      a79e9e:	e8 5d 40 d7 00       	call   17edf00 <_Znwm@plt>
      a79ea3:	49 89 c6             	mov    r14,rax
      a79ea6:	48 89 e7             	mov    rdi,rsp
    ... truncated 132 additional instructions ...
```

### Arg-memory refs
| addr | arg-derived location | instruction |
|---|---|---|
| `0xa79d67` | `arg:rdi` | `a79d67:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xa79d6a` | `load(arg:rdi)+470` | `a79d6a:	ff 90 70 04 00 00    	call   QWORD PTR [rax+0x470]` |

### Arg-derived writes
| addr | arg-derived location | instruction |
|---|---|---|
| `0xa79d6a` | `load(arg:rdi)+470` | `a79d6a:	ff 90 70 04 00 00    	call   QWORD PTR [rax+0x470]` |

### Calls inside helper window
| call | tracked arg state | instruction |
|---|---|---|
| `0xa79d6a` | `rdi=arg:rdi, rsi=arg:rsi, rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `a79d6a:	ff 90 70 04 00 00    	call   QWORD PTR [rax+0x470]` |
| `0xa79d8b` | `rdi=arg:rdi, rsi=arg:rsi, rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `a79d8b:	e8 20 5d d7 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xa79d9a` | `rsi=arg:rsi, rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `a79d9a:	e8 11 41 d7 00       	call   17edeb0 <__cxa_allocate_exception@plt>` |
| `0xa79da8` | `rsi=arg:rdi, rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `a79da8:	e8 29 00 00 00       	call   a79dd6 <JNI_OnUnload@@Base+0x16a3>` |
| `0xa79dbe` | `r8=arg:r8, r9=arg:r9` | `a79dbe:	e8 1d 41 d7 00       	call   17edee0 <__cxa_throw@plt>` |
| `0xa79dc9` | `r8=arg:r8, r9=arg:r9` | `a79dc9:	e8 f2 40 d7 00       	call   17edec0 <__cxa_free_exception@plt>` |
| `0xa79dd1` | `r8=arg:r8, r9=arg:r9` | `a79dd1:	e8 fa 5e ff ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xa79dda` | `r8=arg:r8, r9=arg:r9` | `a79dda:	e8 11 41 d7 00       	call   17edef0 <_ZNSt11logic_errorC2EPKc@plt>` |
| `0xa79df3` | `r8=arg:r8, r9=arg:r9` | `a79df3:	e8 08 41 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa79e5d` | `r8=arg:r8, r9=arg:r9` | `a79e5d:	e8 1b b6 d5 00       	call   17d547d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x129e>` |
| `0xa79e65` | `r8=arg:r8, r9=arg:r9` | `a79e65:	e8 96 40 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa79e88` | `r8=arg:r8, r9=arg:r9` | `a79e88:	e8 97 8a b9 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>` |
| `0xa79e96` | `r8=arg:r8, r9=arg:r9` | `a79e96:	e8 cf 00 00 00       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xa79e9e` | `r8=arg:r8, r9=arg:r9` | `a79e9e:	e8 5d 40 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa79ec6` | `r8=arg:r8, r9=arg:r9` | `a79ec6:	e8 bf 00 00 00       	call   a79f8a <JNI_OnUnload@@Base+0x1857>` |
| `0xa79ecb` | `r8=arg:r8, r9=arg:r9` | `a79ecb:	e8 dc 00 00 00       	call   a79fac <JNI_OnUnload@@Base+0x1879>` |
| `0xa79ee1` | `r8=arg:r8, r9=arg:r9` | `a79ee1:	e8 f0 d7 d4 00       	call   17c76d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b842>` |
| `0xa79ef9` | `r8=arg:r8, r9=arg:r9` | `a79ef9:	e8 c8 bd d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa79f09` | `r8=arg:r8, r9=arg:r9` | `a79f09:	e8 b8 bd d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa79f19` | `r8=arg:r8, r9=arg:r9` | `a79f19:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0xa79f21` | `r8=arg:r8, r9=arg:r9` | `a79f21:	e8 6a 3f d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa79f43` | `r8=arg:r8, r9=arg:r9` | `a79f43:	e8 68 5b d7 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xa79f50` | `r8=arg:r8, r9=arg:r9` | `a79f50:	e8 15 00 00 00       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xa79f58` | `r8=arg:r8, r9=arg:r9` | `a79f58:	e8 c3 3f d7 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xa79f65` | `r8=arg:r8, r9=arg:r9` | `a79f65:	e8 3b fb ff ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xa79f9b` | `r8=arg:r8, r9=arg:r9` | `a79f9b:	e8 4e 8f b9 00       	call   1612eee <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe05c>` |
| `0xa79fba` | `r8=arg:r8, r9=arg:r9` | `a79fba:	e8 00 00 00 00       	call   a79fbf <JNI_OnUnload@@Base+0x188c>` |
| `0xa79fc0` | `r8=arg:r8, r9=arg:r9` | `a79fc0:	e8 00 00 00 00       	call   a79fc5 <JNI_OnUnload@@Base+0x1892>` |
| `0xa79ff6` | `r8=arg:r8, r9=arg:r9` | `a79ff6:	e8 d9 ff ff ff       	call   a79fd4 <JNI_OnUnload@@Base+0x18a1>` |
| `0xa7a02b` | `r8=arg:r8, r9=arg:r9` | `a7a02b:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xa7a034` | `r8=arg:r8, r9=arg:r9` | `a7a034:	ff 51 28             	call   QWORD PTR [rcx+0x28]` |
| `0xa7a045` | `r8=arg:r8, r9=arg:r9` | `a7a045:	e8 ce b2 d5 00       	call   17d5318 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1139>` |

### First direct xrefs
- `0xa764cc` in `JNI_OnLoad@@Base`: `a764cc:	e8 15 38 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa79b18` in `JNI_OnUnload@@Base`: `a79b18:	e8 c9 01 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa79bd4` in `JNI_OnUnload@@Base`: `a79bd4:	e8 0d 01 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa79c91` in `JNI_OnUnload@@Base`: `a79c91:	e8 50 00 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa7c3a9` in `JNI_OnUnload@@Base`: `a7c3a9:	e8 38 d9 ff ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9c9a4` in `JNI_OnUnload@@Base`: `a9c9a4:	e8 3d d3 fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9d147` in `JNI_OnUnload@@Base`: `a9d147:	e8 9a cb fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9d321` in `JNI_OnUnload@@Base`: `a9d321:	e8 c0 c9 fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9d47b` in `JNI_OnUnload@@Base`: `a9d47b:	e8 66 c8 fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9d593` in `JNI_OnUnload@@Base`: `a9d593:	e8 4e c7 fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9d6ff` in `JNI_OnUnload@@Base`: `a9d6ff:	e8 e2 c5 fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9d817` in `JNI_OnUnload@@Base`: `a9d817:	e8 ca c4 fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9d9d8` in `JNI_OnUnload@@Base`: `a9d9d8:	e8 09 c3 fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9dc0c` in `JNI_OnUnload@@Base`: `a9dc0c:	e8 d5 c0 fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa9ff04` in `JNI_OnUnload@@Base`: `a9ff04:	e8 dd 9d fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xaa0067` in `JNI_OnUnload@@Base`: `aa0067:	e8 7a 9c fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xaa02e1` in `JNI_OnUnload@@Base`: `aa02e1:	e8 00 9a fd ff       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`

## Interpretation
- `17add2a` is the key follow-up if it writes to its first argument (`rdi`, caller `rsp+0x230`) using the second argument (`rsi`, caller `rsp+0x3a0`).
- `17d5775` is the key follow-up if it builds the temporary object consumed by `a79a7e`; its arg refs show whether original caller `rdi/rsi` data is copied or only formatted.
- If neither helper writes toward the provider setup bundle, the `rsp+0x310` local object is probably an unrelated local/exception/string object near the provider-vector block, not the true Restrictions `bundle+0x30` source.
