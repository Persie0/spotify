# Restrictions slot-object relocation trace

Purpose: raw `.data.rel.ro` bytes for AP `0x187e2f8` are zero before relocation, so this resolves dynamic relocations for the slot-object vtable entries. The wrapper helpers dispatch `slot_obj.vtable+0x90` and `slot_obj.vtable+0x98`; these entries must be read from the RELA table, not from raw file bytes.

## Relocated AP entries

| offset | relocation address | resolved target | relocation line |
|---:|---:|---:|---|
| `+0x0` | `0x187e2f8` | `0x153d24c` | `000000000187e2f8  0000000000000008 R_X86_64_RELATIVE                         153d24c` |
| `+0x8` | `0x187e300` | `0x153d270` | `000000000187e300  0000000000000008 R_X86_64_RELATIVE                         153d270` |
| `+0x10` | `0x187e308` | `0x153d282` | `000000000187e308  0000000000000008 R_X86_64_RELATIVE                         153d282` |
| `+0x18` | `0x187e310` | `0xa3fa60` | `000000000187e310  0000000000000008 R_X86_64_RELATIVE                         a3fa60` |
| `+0x20` | `0x187e318` | `0x165d0fa` | `000000000187e318  0000000000000008 R_X86_64_RELATIVE                         165d0fa` |
| `+0x28` | `0x187e320` | `0x165dd40` | `000000000187e320  0000000000000008 R_X86_64_RELATIVE                         165dd40` |
| `+0x30` | `0x187e328` | `0x153d2a4` | `000000000187e328  0000000000000008 R_X86_64_RELATIVE                         153d2a4` |
| `+0x38` | `0x187e330` | `0x153d37c` | `000000000187e330  0000000000000008 R_X86_64_RELATIVE                         153d37c` |
| `+0x40` | `0x187e338` | `0x153d3bc` | `000000000187e338  0000000000000008 R_X86_64_RELATIVE                         153d3bc` |
| `+0x48` | `0x187e340` | `0x153d414` | `000000000187e340  0000000000000008 R_X86_64_RELATIVE                         153d414` |
| `+0x50` | `0x187e348` | `0x153d41c` | `000000000187e348  0000000000000008 R_X86_64_RELATIVE                         153d41c` |
| `+0x58` | `0x187e350` | `unresolved/0` | `` |
| `+0x60` | `0x187e358` | `unresolved/0` | `` |
| `+0x68` | `0x187e360` | `0x153d090` | `000000000187e360  0000000000000008 R_X86_64_RELATIVE                         153d090` |
| `+0x70` | `0x187e368` | `0x153d0be` | `000000000187e368  0000000000000008 R_X86_64_RELATIVE                         153d0be` |
| `+0x78` | `0x187e370` | `0xd40db2` | `000000000187e370  0000000000000008 R_X86_64_RELATIVE                         d40db2` |
| `+0x80` | `0x187e378` | `0xa3fa60` | `000000000187e378  0000000000000008 R_X86_64_RELATIVE                         a3fa60` |
| `+0x88` | `0x187e380` | `0x165d0fa` | `000000000187e380  0000000000000008 R_X86_64_RELATIVE                         165d0fa` |
| `+0x90` | `0x187e388` | `0x165dd40` **semantic target** | `000000000187e388  0000000000000008 R_X86_64_RELATIVE                         165dd40` |
| `+0x98` | `0x187e390` | `0x153d0d0` **semantic target** | `000000000187e390  0000000000000008 R_X86_64_RELATIVE                         153d0d0` |
| `+0xa0` | `0x187e398` | `0x153d1a8` | `000000000187e398  0000000000000008 R_X86_64_RELATIVE                         153d1a8` |

## AP +0x90 resolved target 0x165dd40

### Body excerpt
```text
 165dd40:	55                   	push   rbp
 165dd41:	41 57                	push   r15
 165dd43:	41 56                	push   r14
 165dd45:	41 55                	push   r13
 165dd47:	41 54                	push   r12
 165dd49:	53                   	push   rbx
 165dd4a:	48 83 ec 28          	sub    rsp,0x28
 165dd4e:	48 89 f3             	mov    rbx,rsi
 165dd51:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 165dd54:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 165dd59:	ff 50 48             	call   QWORD PTR [rax+0x48]
 165dd5c:	48 89 c1             	mov    rcx,rax
 165dd5f:	8b 40 14             	mov    eax,DWORD PTR [rax+0x14]
 165dd62:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 165dd66:	8b 43 20             	mov    eax,DWORD PTR [rbx+0x20]
 165dd69:	89 44 24 14          	mov    DWORD PTR [rsp+0x14],eax
 165dd6d:	c7 43 20 01 00 00 00 	mov    DWORD PTR [rbx+0x20],0x1
 165dd74:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
 165dd79:	8b 41 10             	mov    eax,DWORD PTR [rcx+0x10]
 165dd7c:	48 85 c0             	test   rax,rax
 165dd7f:	0f 84 df 05 00 00    	je     165e364 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124d0>
 165dd85:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 165dd89:	48 03 4c 24 08       	add    rcx,QWORD PTR [rsp+0x8]
 165dd8e:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
 165dd92:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 165dd97:	4c 8b 79 08          	mov    r15,QWORD PTR [rcx+0x8]
 165dd9b:	48 6b c0 28          	imul   rax,rax,0x28
 165dd9f:	4c 01 f8             	add    rax,r15
 165dda2:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 165dda7:	41 0f b7 47 06       	movzx  eax,WORD PTR [r15+0x6]
 165ddac:	3d ff ff 00 00       	cmp    eax,0xffff
 165ddb1:	74 15                	je     165ddc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11f34>
 165ddb3:	89 c1                	mov    ecx,eax
 165ddb5:	c1 e9 05             	shr    ecx,0x5
 165ddb8:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
 165ddbc:	8b 0c 8a             	mov    ecx,DWORD PTR [rdx+rcx*4]
 165ddbf:	0f a3 c1             	bt     ecx,eax
 165ddc2:	0f 83 8d 05 00 00    	jae    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165ddc8:	41 0f b6 47 04       	movzx  eax,BYTE PTR [r15+0x4]
 165ddcd:	83 e0 3f             	and    eax,0x3f
 165ddd0:	83 f8 37             	cmp    eax,0x37
 165ddd3:	0f 87 7c 05 00 00    	ja     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165ddd9:	45 8b 67 18          	mov    r12d,DWORD PTR [r15+0x18]
 165dddd:	4c 03 64 24 08       	add    r12,QWORD PTR [rsp+0x8]
 165dde2:	48 8d 0d 4b da d3 fe 	lea    rcx,[rip+0xfffffffffed3da4b]        # 39b834 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x8415>
 165dde9:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
 165dded:	48 01 c8             	add    rax,rcx
 165ddf0:	ff e0                	jmp    rax
 165ddf2:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165ddf5:	41 8b 14 24          	mov    edx,DWORD PTR [r12]
 165ddf9:	48 89 df             	mov    rdi,rbx
 165ddfc:	e8 1d 07 00 00       	call   165e51e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1268a>
 165de01:	e9 4f 05 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de06:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165de0b:	85 c9                	test   ecx,ecx
 165de0d:	0f 84 42 05 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de13:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165de16:	6a 02                	push   0x2
 165de18:	5a                   	pop    rdx
 165de19:	48 89 df             	mov    rdi,rbx
 165de1c:	e8 61 ee ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165de21:	31 ed                	xor    ebp,ebp
 165de23:	89 e8                	mov    eax,ebp
 165de25:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165de29:	8b 34 81             	mov    esi,DWORD PTR [rcx+rax*4]
 165de2c:	48 89 df             	mov    rdi,rbx
 165de2f:	e8 d8 07 00 00       	call   165e60c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12778>
 165de34:	ff c5                	inc    ebp
 165de36:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
 165de3b:	75 e6                	jne    165de23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11f8f>
 165de3d:	e9 13 05 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de42:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165de47:	85 c9                	test   ecx,ecx
 165de49:	0f 84 06 05 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de4f:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165de52:	6a 03                	push   0x3
 165de54:	5a                   	pop    rdx
 165de55:	48 89 df             	mov    rdi,rbx
 165de58:	e8 25 ee ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165de5d:	31 ed                	xor    ebp,ebp
 165de5f:	89 e8                	mov    eax,ebp
 165de61:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165de65:	48 8b 34 c1          	mov    rsi,QWORD PTR [rcx+rax*8]
 165de69:	48 89 df             	mov    rdi,rbx
 165de6c:	e8 b5 07 00 00       	call   165e626 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12792>
 165de71:	ff c5                	inc    ebp
 165de73:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
 165de78:	75 e5                	jne    165de5f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11fcb>
 165de7a:	e9 d6 04 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de7f:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165de82:	49 8b 14 24          	mov    rdx,QWORD PTR [r12]
 165de86:	48 89 df             	mov    rdi,rbx
 165de89:	e8 06 06 00 00       	call   165e494 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12600>
 165de8e:	e9 c2 04 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de93:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165de98:	85 c9                	test   ecx,ecx
 165de9a:	0f 84 b5 04 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165dea0:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165dea3:	6a 01                	push   0x1
 165dea5:	5a                   	pop    rdx
 165dea6:	48 89 df             	mov    rdi,rbx
 165dea9:	e8 d4 ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165deae:	31 ed                	xor    ebp,ebp
 165deb0:	89 e8                	mov    eax,ebp
 165deb2:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165deb6:	48 8b 34 c1          	mov    rsi,QWORD PTR [rcx+rax*8]
 165deba:	48 89 df             	mov    rdi,rbx
 165debd:	e8 ba ee ff ff       	call   165cd7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ee8>
 165dec2:	ff c5                	inc    ebp
 165dec4:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
 165dec9:	75 e5                	jne    165deb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1201c>
 165decb:	e9 85 04 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165ded0:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165ded3:	48 89 df             	mov    rdi,rbx
 165ded6:	4c 89 e2             	mov    rdx,r12
 165ded9:	e8 2e eb ff ff       	call   165ca0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10b78>
 165dede:	e9 72 04 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165dee3:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165dee8:	85 c9                	test   ecx,ecx
 165deea:	0f 84 65 04 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165def0:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165def3:	31 ed                	xor    ebp,ebp
 165def5:	48 89 df             	mov    rdi,rbx
 165def8:	31 d2                	xor    edx,edx
 165defa:	e8 83 ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165deff:	89 e8                	mov    eax,ebp
 165df01:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165df05:	8b 34 81             	mov    esi,DWORD PTR [rcx+rax*4]
 165df08:	48 89 df             	mov    rdi,rbx
 165df0b:	e8 94 06 00 00       	call   165e5a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12710>
 165df10:	ff c5                	inc    ebp
 165df12:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
 165df17:	75 e6                	jne    165deff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1206b>
 165df19:	e9 37 04 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165df1e:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165df21:	41 8b 14 24          	mov    edx,DWORD PTR [r12]
 165df25:	e9 ba 02 00 00       	jmp    165e1e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12350>
 165df2a:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165df2d:	41 0f b6 14 24       	movzx  edx,BYTE PTR [r12]
 165df32:	e9 c1 02 00 00       	jmp    165e1f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12364>
 165df37:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165df3c:	85 c9                	test   ecx,ecx
 165df3e:	0f 84 11 04 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165df44:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165df47:	31 ed                	xor    ebp,ebp
 165df49:	48 89 df             	mov    rdi,rbx
 165df4c:	31 d2                	xor    edx,edx
 165df4e:	e8 2f ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165df53:	89 e8                	mov    eax,ebp
 165df55:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165df59:	0f be 34 01          	movsx  esi,BYTE PTR [rcx+rax*1]
 165df5d:	48 89 df             	mov    rdi,rbx
 165df60:	e8 6f 06 00 00       	call   165e5d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12740>
 165df65:	ff c5                	inc    ebp
 165df67:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
 165df6c:	75 e5                	jne    165df53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x120bf>
 165df6e:	e9 e2 03 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165df73:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165df78:	85 c9                	test   ecx,ecx
 165df7a:	0f 84 d5 03 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165df80:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165df83:	31 ed                	xor    ebp,ebp
 165df85:	48 89 df             	mov    rdi,rbx
 165df88:	31 d2                	xor    edx,edx
 165df8a:	e8 f3 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165df8f:	89 e8                	mov    eax,ebp
 165df91:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165df95:	0f bf 34 41          	movsx  esi,WORD PTR [rcx+rax*2]
 165df99:	48 89 df             	mov    rdi,rbx
 165df9c:	e8 03 06 00 00       	call   165e5a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12710>
 165dfa1:	ff c5                	inc    ebp
 165dfa3:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
 165dfa8:	75 e5                	jne    165df8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x120fb>
 165dfaa:	e9 a6 03 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165dfaf:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165dfb4:	85 c9                	test   ecx,ecx
 165dfb6:	0f 84 99 03 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165dfbc:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165dfbf:	31 ed                	xor    ebp,ebp
 165dfc1:	48 89 df             	mov    rdi,rbx
 165dfc4:	31 d2                	xor    edx,edx
 165dfc6:	e8 b7 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165dfcb:	89 e8                	mov    eax,ebp
 165dfcd:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165dfd1:	48 8b 34 c1          	mov    rsi,QWORD PTR [rcx+rax*8]
 165dfd5:	48 89 df             	mov    rdi,rbx
 165dfd8:	e8 99 ed ff ff       	call   165cd76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ee2>
 165dfdd:	ff c5                	inc    ebp
 165dfdf:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
 165dfe4:	75 e5                	jne    165dfcb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12137>
 165dfe6:	e9 6a 03 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165dfeb:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165dfee:	41 0f b6 4f 05       	movzx  ecx,BYTE PTR [r15+0x5]
 165dff3:	ff c1                	inc    ecx
 165dff5:	48 89 df             	mov    rdi,rbx
 165dff8:	4c 89 e2             	mov    rdx,r12
 165dffb:	e8 f2 ea ff ff       	call   165caf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c5e>
 165e000:	e9 50 03 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e005:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165e00a:	85 c9                	test   ecx,ecx
 165e00c:	0f 84 43 03 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e012:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e015:	31 ed                	xor    ebp,ebp
 165e017:	48 89 df             	mov    rdi,rbx
 165e01a:	31 d2                	xor    edx,edx
 165e01c:	e8 61 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e021:	89 e8                	mov    eax,ebp
 165e023:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165e027:	0f b6 34 01          	movzx  esi,BYTE PTR [rcx+rax*1]
 165e02b:	48 89 df             	mov    rdi,rbx
 165e02e:	e8 21 ed ff ff       	call   165cd54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ec0>
 165e033:	ff c5                	inc    ebp
 165e035:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
 165e03a:	75 e5                	jne    165e021 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1218d>
 165e03c:	e9 14 03 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e041:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165e046:	85 c9                	test   ecx,ecx
 165e048:	0f 84 07 03 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e04e:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e051:	31 ed                	xor    ebp,ebp
... truncated 100 instructions ...
```

### Calls and notable field refs
| addr | instruction |
|---:|---|
| `0x165dd54` | ` 165dd54:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi` |
| `0x165dd59` | ` 165dd59:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x165dd66` | ` 165dd66:	8b 43 20             	mov    eax,DWORD PTR [rbx+0x20]` |
| `0x165dd6d` | ` 165dd6d:	c7 43 20 01 00 00 00 	mov    DWORD PTR [rbx+0x20],0x1` |
| `0x165dd74` | ` 165dd74:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx` |
| `0x165dd79` | ` 165dd79:	8b 41 10             	mov    eax,DWORD PTR [rcx+0x10]` |
| `0x165dd89` | ` 165dd89:	48 03 4c 24 08       	add    rcx,QWORD PTR [rsp+0x8]` |
| `0x165dd92` | ` 165dd92:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]` |
| `0x165dd97` | ` 165dd97:	4c 8b 79 08          	mov    r15,QWORD PTR [rcx+0x8]` |
| `0x165dda2` | ` 165dda2:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0x165ddd9` | ` 165ddd9:	45 8b 67 18          	mov    r12d,DWORD PTR [r15+0x18]` |
| `0x165dddd` | ` 165dddd:	4c 03 64 24 08       	add    r12,QWORD PTR [rsp+0x8]` |
| `0x165ddfc` | ` 165ddfc:	e8 1d 07 00 00       	call   165e51e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1268a>` |
| `0x165de06` | ` 165de06:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165de1c` | ` 165de1c:	e8 61 ee ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165de2f` | ` 165de2f:	e8 d8 07 00 00       	call   165e60c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12778>` |
| `0x165de36` | ` 165de36:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165de42` | ` 165de42:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165de58` | ` 165de58:	e8 25 ee ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165de6c` | ` 165de6c:	e8 b5 07 00 00       	call   165e626 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12792>` |
| `0x165de73` | ` 165de73:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165de89` | ` 165de89:	e8 06 06 00 00       	call   165e494 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12600>` |
| `0x165de93` | ` 165de93:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165dea9` | ` 165dea9:	e8 d4 ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165debd` | ` 165debd:	e8 ba ee ff ff       	call   165cd7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ee8>` |
| `0x165dec4` | ` 165dec4:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165ded9` | ` 165ded9:	e8 2e eb ff ff       	call   165ca0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10b78>` |
| `0x165dee3` | ` 165dee3:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165defa` | ` 165defa:	e8 83 ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165df0b` | ` 165df0b:	e8 94 06 00 00       	call   165e5a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12710>` |
| `0x165df12` | ` 165df12:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165df37` | ` 165df37:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165df4e` | ` 165df4e:	e8 2f ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165df60` | ` 165df60:	e8 6f 06 00 00       	call   165e5d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12740>` |
| `0x165df67` | ` 165df67:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165df73` | ` 165df73:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165df8a` | ` 165df8a:	e8 f3 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165df9c` | ` 165df9c:	e8 03 06 00 00       	call   165e5a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12710>` |
| `0x165dfa3` | ` 165dfa3:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165dfaf` | ` 165dfaf:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165dfc6` | ` 165dfc6:	e8 b7 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165dfd8` | ` 165dfd8:	e8 99 ed ff ff       	call   165cd76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ee2>` |
| `0x165dfdf` | ` 165dfdf:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165dffb` | ` 165dffb:	e8 f2 ea ff ff       	call   165caf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c5e>` |
| `0x165e005` | ` 165e005:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165e01c` | ` 165e01c:	e8 61 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165e02e` | ` 165e02e:	e8 21 ed ff ff       	call   165cd54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ec0>` |
| `0x165e035` | ` 165e035:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165e041` | ` 165e041:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165e058` | ` 165e058:	e8 25 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165e069` | ` 165e069:	e8 e6 ec ff ff       	call   165cd54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ec0>` |
| `0x165e070` | ` 165e070:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165e086` | ` 165e086:	e8 37 eb ff ff       	call   165cbc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d2e>` |
| `0x165e090` | ` 165e090:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165e0a7` | ` 165e0a7:	e8 d6 eb ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165e0b9` | ` 165e0b9:	e8 96 ec ff ff       	call   165cd54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ec0>` |
| `0x165e0c0` | ` 165e0c0:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165e0cc` | ` 165e0cc:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165e0e3` | ` 165e0e3:	e8 9a eb ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165e0f5` | ` 165e0f5:	e8 aa 04 00 00       	call   165e5a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12710>` |
| `0x165e0fc` | ` 165e0fc:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165e108` | ` 165e108:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165e11e` | ` 165e11e:	e8 5f eb ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165e135` | ` 165e135:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x165e13b` | ` 165e13b:	e8 1c eb ff ff       	call   165cc5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dc8>` |
| `0x165e142` | ` 165e142:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165e15a` | ` 165e15a:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]` |
| `0x165e171` | ` 165e171:	e8 0c eb ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165e183` | ` 165e183:	e8 4c 04 00 00       	call   165e5d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12740>` |
| `0x165e18a` | ` 165e18a:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]` |
| `0x165e1aa` | ` 165e1aa:	e8 75 e7 ff ff       	call   165c924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a90>` |

## AP +0x98 resolved target 0x153d0d0

### Body excerpt
```text
 153d0d0:	41 57                	push   r15
 153d0d2:	41 56                	push   r14
 153d0d4:	41 54                	push   r12
 153d0d6:	53                   	push   rbx
 153d0d7:	48 83 ec 18          	sub    rsp,0x18
 153d0db:	48 89 f3             	mov    rbx,rsi
 153d0de:	49 89 fe             	mov    r14,rdi
 153d0e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 153d0e8:	00 00
 153d0ea:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 153d0ef:	48 8d 57 10          	lea    rdx,[rdi+0x10]
 153d0f3:	48 89 e6             	mov    rsi,rsp
 153d0f6:	48 89 df             	mov    rdi,rbx
 153d0f9:	e8 6c 2d 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>
 153d0fe:	4d 8d 7e 30          	lea    r15,[r14+0x30]
 153d102:	4d 8d 66 18          	lea    r12,[r14+0x18]
 153d106:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
 153d109:	85 c9                	test   ecx,ecx
 153d10b:	74 5f                	je     153d16c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826f0>
 153d10d:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
 153d111:	0f b6 02             	movzx  eax,BYTE PTR [rdx]
 153d114:	84 c0                	test   al,al
 153d116:	78 54                	js     153d16c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826f0>
 153d118:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax
 153d11b:	48 ff c2             	inc    rdx
 153d11e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
 153d122:	ff c9                	dec    ecx
 153d124:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx
 153d127:	c1 e8 03             	shr    eax,0x3
 153d12a:	83 f8 01             	cmp    eax,0x1
 153d12d:	74 29                	je     153d158 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826dc>
 153d12f:	83 f8 02             	cmp    eax,0x2
 153d132:	74 0e                	je     153d142 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826c6>
 153d134:	85 c0                	test   eax,eax
 153d136:	74 3e                	je     153d176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826fa>
 153d138:	48 89 df             	mov    rdi,rbx
 153d13b:	e8 06 32 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>
 153d140:	eb c4                	jmp    153d106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38268a>
 153d142:	48 89 df             	mov    rdi,rbx
 153d145:	4c 89 fe             	mov    rsi,r15
 153d148:	e8 e7 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>
 153d14d:	0f b6 c0             	movzx  eax,al
 153d150:	01 c0                	add    eax,eax
 153d152:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
 153d156:	eb ae                	jmp    153d106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38268a>
 153d158:	48 89 df             	mov    rdi,rbx
 153d15b:	4c 89 e6             	mov    rsi,r12
 153d15e:	e8 d1 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>
 153d163:	0f b6 c0             	movzx  eax,al
 153d166:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
 153d16a:	eb 9a                	jmp    153d106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38268a>
 153d16c:	48 89 df             	mov    rdi,rbx
 153d16f:	e8 b2 2d 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>
 153d174:	eb b1                	jmp    153d127 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826ab>
 153d176:	48 89 e6             	mov    rsi,rsp
 153d179:	48 89 df             	mov    rdi,rbx
 153d17c:	e8 2f 2e 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>
 153d181:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
 153d184:	0f 95 c0             	setne  al
 153d187:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 153d18e:	00 00
 153d190:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 153d195:	75 0c                	jne    153d1a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382727>
 153d197:	48 83 c4 18          	add    rsp,0x18
 153d19b:	5b                   	pop    rbx
 153d19c:	41 5c                	pop    r12
 153d19e:	41 5e                	pop    r14
 153d1a0:	41 5f                	pop    r15
 153d1a2:	c3                   	ret
```

### Calls and notable field refs
| addr | instruction |
|---:|---|
| `0x153d0ea` | ` 153d0ea:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0x153d0ef` | ` 153d0ef:	48 8d 57 10          	lea    rdx,[rdi+0x10]` |
| `0x153d0f9` | ` 153d0f9:	e8 6c 2d 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153d0fe` | ` 153d0fe:	4d 8d 7e 30          	lea    r15,[r14+0x30]` |
| `0x153d102` | ` 153d102:	4d 8d 66 18          	lea    r12,[r14+0x18]` |
| `0x153d106` | ` 153d106:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]` |
| `0x153d10d` | ` 153d10d:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]` |
| `0x153d118` | ` 153d118:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153d11e` | ` 153d11e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153d124` | ` 153d124:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153d13b` | ` 153d13b:	e8 06 32 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153d148` | ` 153d148:	e8 e7 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>` |
| `0x153d152` | ` 153d152:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153d15e` | ` 153d15e:	e8 d1 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>` |
| `0x153d166` | ` 153d166:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153d16f` | ` 153d16f:	e8 b2 2d 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>` |
| `0x153d17c` | ` 153d17c:	e8 2f 2e 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>` |
| `0x153d190` | ` 153d190:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]` |

## Interpretation

The slot-object wrapper dispatch targets are now resolved from relocations. These methods are the concrete semantic implementation behind constructor calls through `15e768e` and `15e75f2`.
