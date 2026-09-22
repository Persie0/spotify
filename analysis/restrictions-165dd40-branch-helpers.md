# Restrictions 0x165dd40 branch-helper trace
Purpose: continue after resolving slot AP `0x187e2f8` relocations. `0x165dd40` is the relocated `slot_obj.vtable+0x90` target reached via wrapper `15e768e`; this report traces the branch helpers called from the descriptor interpreter.
## Parent interpreter callsites
### call at `0x165ddfc`
```text
 165dded:	48 01 c8             	add    rax,rcx
 165ddf0:	ff e0                	jmp    rax
 165ddf2:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165ddf5:	41 8b 14 24          	mov    edx,DWORD PTR [r12]
 165ddf9:	48 89 df             	mov    rdi,rbx
 165ddfc:	e8 1d 07 00 00       	call   165e51e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1268a>
 165de01:	e9 4f 05 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de06:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
```
### call at `0x165de1c`
```text
 165de0d:	0f 84 42 05 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de13:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165de16:	6a 02                	push   0x2
 165de18:	5a                   	pop    rdx
 165de19:	48 89 df             	mov    rdi,rbx
 165de1c:	e8 61 ee ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165de21:	31 ed                	xor    ebp,ebp
 165de23:	89 e8                	mov    eax,ebp
```
### call at `0x165de2f`
```text
 165de21:	31 ed                	xor    ebp,ebp
 165de23:	89 e8                	mov    eax,ebp
 165de25:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165de29:	8b 34 81             	mov    esi,DWORD PTR [rcx+rax*4]
 165de2c:	48 89 df             	mov    rdi,rbx
 165de2f:	e8 d8 07 00 00       	call   165e60c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12778>
 165de34:	ff c5                	inc    ebp
 165de36:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
```
### call at `0x165de58`
```text
 165de49:	0f 84 06 05 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de4f:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165de52:	6a 03                	push   0x3
 165de54:	5a                   	pop    rdx
 165de55:	48 89 df             	mov    rdi,rbx
 165de58:	e8 25 ee ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165de5d:	31 ed                	xor    ebp,ebp
 165de5f:	89 e8                	mov    eax,ebp
```
### call at `0x165dea9`
```text
 165de9a:	0f 84 b5 04 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165dea0:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165dea3:	6a 01                	push   0x1
 165dea5:	5a                   	pop    rdx
 165dea6:	48 89 df             	mov    rdi,rbx
 165dea9:	e8 d4 ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165deae:	31 ed                	xor    ebp,ebp
 165deb0:	89 e8                	mov    eax,ebp
```
### call at `0x165defa`
```text
 165deea:	0f 84 65 04 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165def0:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165def3:	31 ed                	xor    ebp,ebp
 165def5:	48 89 df             	mov    rdi,rbx
 165def8:	31 d2                	xor    edx,edx
 165defa:	e8 83 ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165deff:	89 e8                	mov    eax,ebp
 165df01:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165df4e`
```text
 165df3e:	0f 84 11 04 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165df44:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165df47:	31 ed                	xor    ebp,ebp
 165df49:	48 89 df             	mov    rdi,rbx
 165df4c:	31 d2                	xor    edx,edx
 165df4e:	e8 2f ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165df53:	89 e8                	mov    eax,ebp
 165df55:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165df8a`
```text
 165df7a:	0f 84 d5 03 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165df80:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165df83:	31 ed                	xor    ebp,ebp
 165df85:	48 89 df             	mov    rdi,rbx
 165df88:	31 d2                	xor    edx,edx
 165df8a:	e8 f3 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165df8f:	89 e8                	mov    eax,ebp
 165df91:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165dfc6`
```text
 165dfb6:	0f 84 99 03 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165dfbc:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165dfbf:	31 ed                	xor    ebp,ebp
 165dfc1:	48 89 df             	mov    rdi,rbx
 165dfc4:	31 d2                	xor    edx,edx
 165dfc6:	e8 b7 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165dfcb:	89 e8                	mov    eax,ebp
 165dfcd:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165e01c`
```text
 165e00c:	0f 84 43 03 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e012:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e015:	31 ed                	xor    ebp,ebp
 165e017:	48 89 df             	mov    rdi,rbx
 165e01a:	31 d2                	xor    edx,edx
 165e01c:	e8 61 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e021:	89 e8                	mov    eax,ebp
 165e023:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165e058`
```text
 165e048:	0f 84 07 03 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e04e:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e051:	31 ed                	xor    ebp,ebp
 165e053:	48 89 df             	mov    rdi,rbx
 165e056:	31 d2                	xor    edx,edx
 165e058:	e8 25 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e05d:	89 e8                	mov    eax,ebp
 165e05f:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165e0a7`
```text
 165e097:	0f 84 b8 02 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e09d:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e0a0:	31 ed                	xor    ebp,ebp
 165e0a2:	48 89 df             	mov    rdi,rbx
 165e0a5:	31 d2                	xor    edx,edx
 165e0a7:	e8 d6 eb ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e0ac:	89 e8                	mov    eax,ebp
 165e0ae:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165e0e3`
```text
 165e0d3:	0f 84 7c 02 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e0d9:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e0dc:	31 ed                	xor    ebp,ebp
 165e0de:	48 89 df             	mov    rdi,rbx
 165e0e1:	31 d2                	xor    edx,edx
 165e0e3:	e8 9a eb ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e0e8:	89 e8                	mov    eax,ebp
 165e0ea:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165e11e`
```text
 165e10f:	0f 84 40 02 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e115:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e118:	6a 04                	push   0x4
 165e11a:	5a                   	pop    rdx
 165e11b:	48 89 df             	mov    rdi,rbx
 165e11e:	e8 5f eb ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e123:	31 ed                	xor    ebp,ebp
 165e125:	89 e8                	mov    eax,ebp
```
### call at `0x165e171`
```text
 165e161:	0f 84 ee 01 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e167:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e16a:	31 ed                	xor    ebp,ebp
 165e16c:	48 89 df             	mov    rdi,rbx
 165e16f:	31 d2                	xor    edx,edx
 165e171:	e8 0c eb ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e176:	89 e8                	mov    eax,ebp
 165e178:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165e245`
```text
 165e235:	0f 84 1a 01 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e23b:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e23e:	31 ed                	xor    ebp,ebp
 165e240:	48 89 df             	mov    rdi,rbx
 165e243:	31 d2                	xor    edx,edx
 165e245:	e8 38 ea ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e24a:	89 e8                	mov    eax,ebp
 165e24c:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165e280`
```text
 165e270:	0f 84 df 00 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e276:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e279:	31 ed                	xor    ebp,ebp
 165e27b:	48 89 df             	mov    rdi,rbx
 165e27e:	31 d2                	xor    edx,edx
 165e280:	e8 fd e9 ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e285:	89 e8                	mov    eax,ebp
 165e287:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165e2c2`
```text
 165e2b7:	ff c5                	inc    ebp
 165e2b9:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e2bc:	6a 01                	push   0x1
 165e2be:	5a                   	pop    rdx
 165e2bf:	48 89 df             	mov    rdi,rbx
 165e2c2:	e8 bb e9 ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e2c7:	45 31 f6             	xor    r14d,r14d
 165e2ca:	45 31 ed             	xor    r13d,r13d
```
### call at `0x165e300`
```text
 165e2f4:	74 5f                	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e2f6:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e2f9:	31 ed                	xor    ebp,ebp
 165e2fb:	48 89 df             	mov    rdi,rbx
 165e2fe:	31 d2                	xor    edx,edx
 165e300:	e8 7d e9 ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e305:	89 e8                	mov    eax,ebp
 165e307:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
### call at `0x165e335`
```text
 165e329:	74 2a                	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165e32b:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165e32e:	31 ed                	xor    ebp,ebp
 165e330:	48 89 df             	mov    rdi,rbx
 165e333:	31 d2                	xor    edx,edx
 165e335:	e8 48 e9 ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165e33a:	89 e8                	mov    eax,ebp
 165e33c:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
```
## Helper summary
| helper | refs | writes | tracked calls | likely role |
|---|---:|---:|---:|---|
| `165e51e` | 13 | 14 | 2 | writes/updates builder object |
| `165cc82` | 13 | 13 | 2 | writes/updates builder object |
| `165e60c` | 15 | 9 | 6 | writes/updates builder object |

## Helper `165e51e` body

```text
 165e51e:	41 56                	push   r14
 165e520:	53                   	push   rbx
 165e521:	50                   	push   rax
 165e522:	89 d3                	mov    ebx,edx
 165e524:	49 89 fe             	mov    r14,rdi
 165e527:	89 f0                	mov    eax,esi
 165e529:	2b 47 20             	sub    eax,DWORD PTR [rdi+0x20]
 165e52c:	89 77 20             	mov    DWORD PTR [rdi+0x20],esi
 165e52f:	83 f8 0e             	cmp    eax,0xe
 165e532:	77 1c                	ja     165e550 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x126bc>
 165e534:	c0 e0 03             	shl    al,0x3
 165e537:	0c 02                	or     al,0x2
 165e539:	41 83 7e 10 00       	cmp    DWORD PTR [r14+0x10],0x0
 165e53e:	74 21                	je     165e561 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x126cd>
 165e540:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
 165e544:	88 01                	mov    BYTE PTR [rcx],al
 165e546:	49 ff 46 08          	inc    QWORD PTR [r14+0x8]
 165e54a:	41 ff 4e 10          	dec    DWORD PTR [r14+0x10]
 165e54e:	eb 24                	jmp    165e574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x126e0>
 165e550:	8d 34 f5 02 00 00 00 	lea    esi,[rsi*8+0x2]
 165e557:	4c 89 f7             	mov    rdi,r14
 165e55a:	e8 1f e1 ff ff       	call   165c67e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107ea>
 165e55f:	eb 13                	jmp    165e574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x126e0>
 165e561:	49 8d 76 24          	lea    rsi,[r14+0x24]
 165e565:	41 88 46 24          	mov    BYTE PTR [r14+0x24],al
 165e569:	6a 01                	push   0x1
 165e56b:	5a                   	pop    rdx
 165e56c:	4c 89 f7             	mov    rdi,r14
 165e56f:	e8 8c e0 ff ff       	call   165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>
 165e574:	41 83 7e 10 04       	cmp    DWORD PTR [r14+0x10],0x4
 165e579:	72 18                	jb     165e593 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x126ff>
 165e57b:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 165e57f:	89 18                	mov    DWORD PTR [rax],ebx
 165e581:	49 83 46 08 04       	add    QWORD PTR [r14+0x8],0x4
 165e586:	41 83 46 10 fc       	add    DWORD PTR [r14+0x10],0xfffffffc
 165e58b:	48 83 c4 08          	add    rsp,0x8
 165e58f:	5b                   	pop    rbx
 165e590:	41 5e                	pop    r14
 165e592:	c3                   	ret
 165e593:	4c 89 f7             	mov    rdi,r14
 165e596:	89 de                	mov    esi,ebx
 165e598:	48 83 c4 08          	add    rsp,0x8
 165e59c:	5b                   	pop    rbx
 165e59d:	41 5e                	pop    r14
 165e59f:	e9 30 eb ff ff       	jmp    165d0d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11240>
 165e5a4:	85 f6                	test   esi,esi
 165e5a6:	78 1e                	js     165e5c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12732>
 165e5a8:	83 fe 7f             	cmp    esi,0x7f
 165e5ab:	0f 87 19 e1 ff ff    	ja     165c6ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10836>
 165e5b1:	83 7f 10 00          	cmp    DWORD PTR [rdi+0x10],0x0
 165e5b5:	74 17                	je     165e5ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1273a>
 165e5b7:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 165e5bb:	40 88 30             	mov    BYTE PTR [rax],sil
 165e5be:	48 ff 47 08          	inc    QWORD PTR [rdi+0x8]
 165e5c2:	ff 4f 10             	dec    DWORD PTR [rdi+0x10]
 165e5c5:	c3                   	ret
 165e5c6:	48 63 f6             	movsxd rsi,esi
 165e5c9:	e9 e0 e1 ff ff       	jmp    165c7ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1091a>
 165e5ce:	e9 f7 e0 ff ff       	jmp    165c6ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10836>
 165e5d3:	cc                   	int3
 165e5d4:	8d 04 36             	lea    eax,[rsi+rsi*1]
 165e5d7:	c1 fe 1f             	sar    esi,0x1f
 165e5da:	31 c6                	xor    esi,eax
 165e5dc:	83 fe 7f             	cmp    esi,0x7f
 165e5df:	77 15                	ja     165e5f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12762>
 165e5e1:	83 7f 10 00          	cmp    DWORD PTR [rdi+0x10],0x0
 165e5e5:	74 0f                	je     165e5f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12762>
 165e5e7:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 165e5eb:	40 88 30             	mov    BYTE PTR [rax],sil
 165e5ee:	48 ff 47 08          	inc    QWORD PTR [rdi+0x8]
 165e5f2:	ff 4f 10             	dec    DWORD PTR [rdi+0x10]
 165e5f5:	c3                   	ret
 165e5f6:	e9 cf e0 ff ff       	jmp    165c6ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10836>
 165e5fb:	cc                   	int3
 165e5fc:	48 8d 04 36          	lea    rax,[rsi+rsi*1]
 165e600:	48 c1 fe 3f          	sar    rsi,0x3f
 165e604:	48 31 c6             	xor    rsi,rax
 165e607:	e9 a2 e1 ff ff       	jmp    165c7ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1091a>
```
### Tracked refs
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165e529` | `builder/output object` | `rdi+0x20` | `165e529:	2b 47 20             	sub    eax,DWORD PTR [rdi+0x20]` |
| `0x165e539` | `builder/output object` | `r14+0x10` | `165e539:	41 83 7e 10 00       	cmp    DWORD PTR [r14+0x10],0x0` |
| `0x165e540` | `builder/output object` | `r14+0x8` | `165e540:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]` |
| `0x165e550` | `descriptor field id/value` | `rsi*8+0x2` | `165e550:	8d 34 f5 02 00 00 00 	lea    esi,[rsi*8+0x2]` |
| `0x165e561` | `builder/output object` | `r14+0x24` | `165e561:	49 8d 76 24          	lea    rsi,[r14+0x24]` |
| `0x165e574` | `builder/output object` | `r14+0x10` | `165e574:	41 83 7e 10 04       	cmp    DWORD PTR [r14+0x10],0x4` |
| `0x165e57b` | `builder/output object` | `r14+0x8` | `165e57b:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]` |
| `0x165e5b1` | `builder/output object` | `rdi+0x10` | `165e5b1:	83 7f 10 00          	cmp    DWORD PTR [rdi+0x10],0x0` |
| `0x165e5b7` | `builder/output object` | `rdi+0x8` | `165e5b7:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x165e5d4` | `addr(builder/output object:r14+0x24)` | `rsi+rsi*1` | `165e5d4:	8d 04 36             	lea    eax,[rsi+rsi*1]` |
| `0x165e5e1` | `builder/output object` | `rdi+0x10` | `165e5e1:	83 7f 10 00          	cmp    DWORD PTR [rdi+0x10],0x0` |
| `0x165e5e7` | `builder/output object` | `rdi+0x8` | `165e5e7:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x165e5fc` | `addr(builder/output object:r14+0x24)` | `rsi+rsi*1` | `165e5fc:	48 8d 04 36          	lea    rax,[rsi+rsi*1]` |

### Tracked writes
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165e52c` | `builder/output object` | `rdi+0x20` | `165e52c:	89 77 20             	mov    DWORD PTR [rdi+0x20],esi` |
| `0x165e544` | `load(builder/output object:r14+0x8)` | `rcx` | `165e544:	88 01                	mov    BYTE PTR [rcx],al` |
| `0x165e546` | `builder/output object` | `r14+0x8` | `165e546:	49 ff 46 08          	inc    QWORD PTR [r14+0x8]` |
| `0x165e54a` | `builder/output object` | `r14+0x10` | `165e54a:	41 ff 4e 10          	dec    DWORD PTR [r14+0x10]` |
| `0x165e565` | `builder/output object` | `r14+0x24` | `165e565:	41 88 46 24          	mov    BYTE PTR [r14+0x24],al` |
| `0x165e57f` | `load(builder/output object:r14+0x8)` | `rax` | `165e57f:	89 18                	mov    DWORD PTR [rax],ebx` |
| `0x165e581` | `builder/output object` | `r14+0x8` | `165e581:	49 83 46 08 04       	add    QWORD PTR [r14+0x8],0x4` |
| `0x165e586` | `builder/output object` | `r14+0x10` | `165e586:	41 83 46 10 fc       	add    DWORD PTR [r14+0x10],0xfffffffc` |
| `0x165e5bb` | `load(builder/output object:rdi+0x8)` | `rax` | `165e5bb:	40 88 30             	mov    BYTE PTR [rax],sil` |
| `0x165e5be` | `builder/output object` | `rdi+0x8` | `165e5be:	48 ff 47 08          	inc    QWORD PTR [rdi+0x8]` |
| `0x165e5c2` | `builder/output object` | `rdi+0x10` | `165e5c2:	ff 4f 10             	dec    DWORD PTR [rdi+0x10]` |
| `0x165e5eb` | `load(builder/output object:rdi+0x8)` | `rax` | `165e5eb:	40 88 30             	mov    BYTE PTR [rax],sil` |
| `0x165e5ee` | `builder/output object` | `rdi+0x8` | `165e5ee:	48 ff 47 08          	inc    QWORD PTR [rdi+0x8]` |
| `0x165e5f2` | `builder/output object` | `rdi+0x10` | `165e5f2:	ff 4f 10             	dec    DWORD PTR [rdi+0x10]` |

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0x165e55a` | `rdi=builder/output object, rsi=descriptor field id/value, rdx=descriptor scalar/value, rcx=load(builder/output object:r14+0x8), r14=builder/output object` | `165e55a:	e8 1f e1 ff ff       	call   165c67e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107ea>` |
| `0x165e56f` | `rdi=builder/output object, rsi=addr(builder/output object:r14+0x24), rdx=descriptor scalar/value, rcx=load(builder/output object:r14+0x8), r14=builder/output object` | `165e56f:	e8 8c e0 ff ff       	call   165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>` |

## Helper `165cc82` body

```text
 165cc82:	55                   	push   rbp
 165cc83:	41 56                	push   r14
 165cc85:	53                   	push   rbx
 165cc86:	89 d5                	mov    ebp,edx
 165cc88:	48 89 fb             	mov    rbx,rdi
 165cc8b:	89 f0                	mov    eax,esi
 165cc8d:	2b 47 20             	sub    eax,DWORD PTR [rdi+0x20]
 165cc90:	89 77 20             	mov    DWORD PTR [rdi+0x20],esi
 165cc93:	83 f9 01             	cmp    ecx,0x1
 165cc96:	75 1c                	jne    165ccb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10e20>
 165cc98:	83 f8 0e             	cmp    eax,0xe
 165cc9b:	77 39                	ja     165ccd6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10e42>
 165cc9d:	c0 e0 03             	shl    al,0x3
 165cca0:	40 00 e8             	add    al,bpl
 165cca3:	83 7b 10 00          	cmp    DWORD PTR [rbx+0x10],0x0
 165cca7:	74 51                	je     165ccfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10e66>
 165cca9:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 165ccad:	88 01                	mov    BYTE PTR [rcx],al
 165ccaf:	e9 88 00 00 00       	jmp    165cd3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ea8>
 165ccb4:	41 89 ce             	mov    r14d,ecx
 165ccb7:	83 f8 0e             	cmp    eax,0xe
 165ccba:	77 2d                	ja     165cce9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10e55>
 165ccbc:	c0 e0 03             	shl    al,0x3
 165ccbf:	0c 05                	or     al,0x5
 165ccc1:	83 7b 10 00          	cmp    DWORD PTR [rbx+0x10],0x0
 165ccc5:	74 49                	je     165cd10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10e7c>
 165ccc7:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 165cccb:	88 01                	mov    BYTE PTR [rcx],al
 165cccd:	48 ff 43 08          	inc    QWORD PTR [rbx+0x8]
 165ccd1:	ff 4b 10             	dec    DWORD PTR [rbx+0x10]
 165ccd4:	eb 4c                	jmp    165cd22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10e8e>
 165ccd6:	40 0f b6 c5          	movzx  eax,bpl
 165ccda:	8d 34 f0             	lea    esi,[rax+rsi*8]
 165ccdd:	48 89 df             	mov    rdi,rbx
 165cce0:	5b                   	pop    rbx
 165cce1:	41 5e                	pop    r14
 165cce3:	5d                   	pop    rbp
 165cce4:	e9 95 f9 ff ff       	jmp    165c67e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107ea>
 165cce9:	8d 34 f5 05 00 00 00 	lea    esi,[rsi*8+0x5]
 165ccf0:	48 89 df             	mov    rdi,rbx
 165ccf3:	e8 86 f9 ff ff       	call   165c67e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107ea>
 165ccf8:	eb 28                	jmp    165cd22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10e8e>
 165ccfa:	48 8d 73 24          	lea    rsi,[rbx+0x24]
 165ccfe:	88 43 24             	mov    BYTE PTR [rbx+0x24],al
 165cd01:	6a 01                	push   0x1
 165cd03:	5a                   	pop    rdx
 165cd04:	48 89 df             	mov    rdi,rbx
 165cd07:	5b                   	pop    rbx
 165cd08:	41 5e                	pop    r14
 165cd0a:	5d                   	pop    rbp
 165cd0b:	e9 f0 f8 ff ff       	jmp    165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>
 165cd10:	48 8d 73 24          	lea    rsi,[rbx+0x24]
 165cd14:	88 43 24             	mov    BYTE PTR [rbx+0x24],al
 165cd17:	6a 01                	push   0x1
 165cd19:	5a                   	pop    rdx
 165cd1a:	48 89 df             	mov    rdi,rbx
 165cd1d:	e8 de f8 ff ff       	call   165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>
 165cd22:	40 0f b6 c5          	movzx  eax,bpl
 165cd26:	42 8d 34 f0          	lea    esi,[rax+r14*8]
 165cd2a:	83 fe 7f             	cmp    esi,0x7f
 165cd2d:	77 19                	ja     165cd48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10eb4>
 165cd2f:	83 7b 10 00          	cmp    DWORD PTR [rbx+0x10],0x0
 165cd33:	74 13                	je     165cd48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10eb4>
 165cd35:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 165cd39:	40 88 30             	mov    BYTE PTR [rax],sil
 165cd3c:	48 ff 43 08          	inc    QWORD PTR [rbx+0x8]
 165cd40:	ff 4b 10             	dec    DWORD PTR [rbx+0x10]
 165cd43:	5b                   	pop    rbx
 165cd44:	41 5e                	pop    r14
 165cd46:	5d                   	pop    rbp
 165cd47:	c3                   	ret
 165cd48:	48 89 df             	mov    rdi,rbx
 165cd4b:	5b                   	pop    rbx
 165cd4c:	41 5e                	pop    r14
 165cd4e:	5d                   	pop    rbp
 165cd4f:	e9 76 f9 ff ff       	jmp    165c6ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10836>
 165cd54:	83 fe 7f             	cmp    esi,0x7f
 165cd57:	0f 87 6d f9 ff ff    	ja     165c6ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10836>
 165cd5d:	83 7f 10 00          	cmp    DWORD PTR [rdi+0x10],0x0
 165cd61:	0f 84 63 f9 ff ff    	je     165c6ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10836>
 165cd67:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 165cd6b:	40 88 30             	mov    BYTE PTR [rax],sil
 165cd6e:	48 ff 47 08          	inc    QWORD PTR [rdi+0x8]
 165cd72:	ff 4f 10             	dec    DWORD PTR [rdi+0x10]
 165cd75:	c3                   	ret
 165cd76:	e9 33 fa ff ff       	jmp    165c7ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1091a>
 165cd7b:	cc                   	int3
 165cd7c:	41 57                	push   r15
 165cd7e:	41 56                	push   r14
```
### Tracked refs
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165cc8d` | `builder/output object` | `rdi+0x20` | `165cc8d:	2b 47 20             	sub    eax,DWORD PTR [rdi+0x20]` |
| `0x165cca3` | `builder/output object` | `rbx+0x10` | `165cca3:	83 7b 10 00          	cmp    DWORD PTR [rbx+0x10],0x0` |
| `0x165cca9` | `builder/output object` | `rbx+0x8` | `165cca9:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0x165ccc1` | `builder/output object` | `rbx+0x10` | `165ccc1:	83 7b 10 00          	cmp    DWORD PTR [rbx+0x10],0x0` |
| `0x165ccc7` | `builder/output object` | `rbx+0x8` | `165ccc7:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0x165ccda` | `descriptor field id` | `rax+rsi*8` | `165ccda:	8d 34 f0             	lea    esi,[rax+rsi*8]` |
| `0x165cce9` | `descriptor field id` | `rsi*8+0x5` | `165cce9:	8d 34 f5 05 00 00 00 	lea    esi,[rsi*8+0x5]` |
| `0x165ccfa` | `builder/output object` | `rbx+0x24` | `165ccfa:	48 8d 73 24          	lea    rsi,[rbx+0x24]` |
| `0x165cd10` | `builder/output object` | `rbx+0x24` | `165cd10:	48 8d 73 24          	lea    rsi,[rbx+0x24]` |
| `0x165cd2f` | `builder/output object` | `rbx+0x10` | `165cd2f:	83 7b 10 00          	cmp    DWORD PTR [rbx+0x10],0x0` |
| `0x165cd35` | `builder/output object` | `rbx+0x8` | `165cd35:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x165cd5d` | `builder/output object` | `rdi+0x10` | `165cd5d:	83 7f 10 00          	cmp    DWORD PTR [rdi+0x10],0x0` |
| `0x165cd67` | `builder/output object` | `rdi+0x8` | `165cd67:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |

### Tracked writes
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165cc90` | `builder/output object` | `rdi+0x20` | `165cc90:	89 77 20             	mov    DWORD PTR [rdi+0x20],esi` |
| `0x165ccad` | `load(builder/output object:rbx+0x8)` | `rcx` | `165ccad:	88 01                	mov    BYTE PTR [rcx],al` |
| `0x165cccb` | `load(builder/output object:rbx+0x8)` | `rcx` | `165cccb:	88 01                	mov    BYTE PTR [rcx],al` |
| `0x165cccd` | `builder/output object` | `rbx+0x8` | `165cccd:	48 ff 43 08          	inc    QWORD PTR [rbx+0x8]` |
| `0x165ccd1` | `builder/output object` | `rbx+0x10` | `165ccd1:	ff 4b 10             	dec    DWORD PTR [rbx+0x10]` |
| `0x165ccfe` | `builder/output object` | `rbx+0x24` | `165ccfe:	88 43 24             	mov    BYTE PTR [rbx+0x24],al` |
| `0x165cd14` | `builder/output object` | `rbx+0x24` | `165cd14:	88 43 24             	mov    BYTE PTR [rbx+0x24],al` |
| `0x165cd39` | `load(builder/output object:rbx+0x8)` | `rax` | `165cd39:	40 88 30             	mov    BYTE PTR [rax],sil` |
| `0x165cd3c` | `builder/output object` | `rbx+0x8` | `165cd3c:	48 ff 43 08          	inc    QWORD PTR [rbx+0x8]` |
| `0x165cd40` | `builder/output object` | `rbx+0x10` | `165cd40:	ff 4b 10             	dec    DWORD PTR [rbx+0x10]` |
| `0x165cd6b` | `load(builder/output object:rdi+0x8)` | `rax` | `165cd6b:	40 88 30             	mov    BYTE PTR [rax],sil` |
| `0x165cd6e` | `builder/output object` | `rdi+0x8` | `165cd6e:	48 ff 47 08          	inc    QWORD PTR [rdi+0x8]` |
| `0x165cd72` | `builder/output object` | `rdi+0x10` | `165cd72:	ff 4f 10             	dec    DWORD PTR [rdi+0x10]` |

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0x165ccf3` | `rdi=builder/output object, rsi=descriptor field id, rdx=constant/type tag, rcx=load(builder/output object:rbx+0x8), rbx=builder/output object` | `165ccf3:	e8 86 f9 ff ff       	call   165c67e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107ea>` |
| `0x165cd1d` | `rdi=builder/output object, rsi=addr(builder/output object:rbx+0x24), rdx=constant/type tag, rcx=load(builder/output object:rbx+0x8), rbx=builder/output object` | `165cd1d:	e8 de f8 ff ff       	call   165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>` |

## Helper `165e60c` body

```text
 165e60c:	83 7f 10 04          	cmp    DWORD PTR [rdi+0x10],0x4
 165e610:	0f 82 be ea ff ff    	jb     165d0d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11240>
 165e616:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 165e61a:	89 30                	mov    DWORD PTR [rax],esi
 165e61c:	48 83 47 08 04       	add    QWORD PTR [rdi+0x8],0x4
 165e621:	83 47 10 fc          	add    DWORD PTR [rdi+0x10],0xfffffffc
 165e625:	c3                   	ret
 165e626:	83 7f 10 08          	cmp    DWORD PTR [rdi+0x10],0x8
 165e62a:	0f 82 b6 ea ff ff    	jb     165d0e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11252>
 165e630:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 165e634:	48 89 30             	mov    QWORD PTR [rax],rsi
 165e637:	48 83 47 08 08       	add    QWORD PTR [rdi+0x8],0x8
 165e63c:	83 47 10 f8          	add    DWORD PTR [rdi+0x10],0xfffffff8
 165e640:	c3                   	ret
 165e641:	cc                   	int3
 165e642:	55                   	push   rbp
 165e643:	41 57                	push   r15
 165e645:	41 56                	push   r14
 165e647:	41 55                	push   r13
 165e649:	41 54                	push   r12
 165e64b:	53                   	push   rbx
 165e64c:	50                   	push   rax
 165e64d:	48 89 f3             	mov    rbx,rsi
 165e650:	49 89 fe             	mov    r14,rdi
 165e653:	45 31 ff             	xor    r15d,r15d
 165e656:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 165e659:	b9 00 00 00 00       	mov    ecx,0x0
 165e65e:	48 85 c0             	test   rax,rax
 165e661:	74 03                	je     165e666 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x127d2>
 165e663:	8b 48 08             	mov    ecx,DWORD PTR [rax+0x8]
 165e666:	41 39 cf             	cmp    r15d,ecx
 165e669:	74 4f                	je     165e6ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12826>
 165e66b:	44 89 f9             	mov    ecx,r15d
 165e66e:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 165e671:	48 6b e9 0c          	imul   rbp,rcx,0xc
 165e675:	4c 89 f7             	mov    rdi,r14
 165e678:	e8 af d9 ff ff       	call   165c02c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10198>
 165e67d:	49 89 c4             	mov    r12,rax
 165e680:	41 8b 44 2d 08       	mov    eax,DWORD PTR [r13+rbp*1+0x8]
 165e685:	41 89 44 24 08       	mov    DWORD PTR [r12+0x8],eax
 165e68a:	49 8b 4c 2d 00       	mov    rcx,QWORD PTR [r13+rbp*1+0x0]
 165e68f:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
 165e693:	a8 04                	test   al,0x4
 165e695:	74 1e                	je     165e6b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12821>
 165e697:	49 8b 2c 24          	mov    rbp,QWORD PTR [r12]
 165e69b:	6a 18                	push   0x18
 165e69d:	5f                   	pop    rdi
 165e69e:	e8 5d f8 18 00       	call   17edf00 <_Znwm@plt>
 165e6a3:	49 89 c5             	mov    r13,rax
 165e6a6:	48 89 c7             	mov    rdi,rax
 165e6a9:	48 89 ee             	mov    rsi,rbp
 165e6ac:	e8 8f f8 18 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 165e6b1:	4d 89 2c 24          	mov    QWORD PTR [r12],r13
 165e6b5:	41 ff c7             	inc    r15d
 165e6b8:	eb 9c                	jmp    165e656 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x127c2>
 165e6ba:	48 83 c4 08          	add    rsp,0x8
 165e6be:	5b                   	pop    rbx
 165e6bf:	41 5c                	pop    r12
 165e6c1:	41 5d                	pop    r13
 165e6c3:	41 5e                	pop    r14
 165e6c5:	41 5f                	pop    r15
 165e6c7:	5d                   	pop    rbp
 165e6c8:	c3                   	ret
 165e6c9:	48 89 c3             	mov    rbx,rax
 165e6cc:	4c 89 ef             	mov    rdi,r13
 165e6cf:	e8 4c f8 18 00       	call   17edf20 <_ZdlPv@plt>
 165e6d4:	48 89 df             	mov    rdi,rbx
 165e6d7:	e8 f4 15 41 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 165e6dc:	55                   	push   rbp
 165e6dd:	41 57                	push   r15
 165e6df:	41 56                	push   r14
 165e6e1:	41 55                	push   r13
 165e6e3:	41 54                	push   r12
 165e6e5:	53                   	push   rbx
 165e6e6:	48 83 ec 28          	sub    rsp,0x28
 165e6ea:	48 89 fb             	mov    rbx,rdi
 165e6ed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 165e6f0:	ff 50 48             	call   QWORD PTR [rax+0x48]
 165e6f3:	8b 48 10             	mov    ecx,DWORD PTR [rax+0x10]
 165e6f6:	48 85 c9             	test   rcx,rcx
 165e6f9:	0f 84 33 06 00 00    	je     165ed32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12e9e>
 165e6ff:	8b 50 14             	mov    edx,DWORD PTR [rax+0x14]
 165e702:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
 165e707:	48 01 da             	add    rdx,rbx
 165e70a:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
 165e70f:	4c 8b 68 08          	mov    r13,QWORD PTR [rax+0x8]
```
### Tracked refs
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165e60c` | `builder/output object` | `rdi+0x10` | `165e60c:	83 7f 10 04          	cmp    DWORD PTR [rdi+0x10],0x4` |
| `0x165e616` | `builder/output object` | `rdi+0x8` | `165e616:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x165e626` | `builder/output object` | `rdi+0x10` | `165e626:	83 7f 10 08          	cmp    DWORD PTR [rdi+0x10],0x8` |
| `0x165e630` | `builder/output object` | `rdi+0x8` | `165e630:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x165e656` | `descriptor element value` | `rbx` | `165e656:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x165e663` | `load(descriptor element value:rbx)` | `rax+0x8` | `165e663:	8b 48 08             	mov    ecx,DWORD PTR [rax+0x8]` |
| `0x165e66e` | `load(descriptor element value:rbx)` | `rax` | `165e66e:	4c 8b 28             	mov    r13,QWORD PTR [rax]` |
| `0x165e680` | `load(load(descriptor element value:rbx):rax)` | `r13+rbp*1+0x8` | `165e680:	41 8b 44 2d 08       	mov    eax,DWORD PTR [r13+rbp*1+0x8]` |
| `0x165e68a` | `load(load(descriptor element value:rbx):rax)` | `r13+rbp*1+0x0` | `165e68a:	49 8b 4c 2d 00       	mov    rcx,QWORD PTR [r13+rbp*1+0x0]` |
| `0x165e697` | `load(descriptor element value:rbx)` | `r12` | `165e697:	49 8b 2c 24          	mov    rbp,QWORD PTR [r12]` |
| `0x165e6ed` | `load(descriptor element value:rbx)` | `rdi` | `165e6ed:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x165e6f0` | `load(load(descriptor element value:rbx):rdi)` | `rax+0x48` | `165e6f0:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x165e6f3` | `load(load(descriptor element value:rbx):rdi)` | `rax+0x10` | `165e6f3:	8b 48 10             	mov    ecx,DWORD PTR [rax+0x10]` |
| `0x165e6ff` | `load(load(descriptor element value:rbx):rdi)` | `rax+0x14` | `165e6ff:	8b 50 14             	mov    edx,DWORD PTR [rax+0x14]` |
| `0x165e70f` | `load(load(descriptor element value:rbx):rdi)` | `rax+0x8` | `165e70f:	4c 8b 68 08          	mov    r13,QWORD PTR [rax+0x8]` |

### Tracked writes
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165e61a` | `load(builder/output object:rdi+0x8)` | `rax` | `165e61a:	89 30                	mov    DWORD PTR [rax],esi` |
| `0x165e61c` | `builder/output object` | `rdi+0x8` | `165e61c:	48 83 47 08 04       	add    QWORD PTR [rdi+0x8],0x4` |
| `0x165e621` | `builder/output object` | `rdi+0x10` | `165e621:	83 47 10 fc          	add    DWORD PTR [rdi+0x10],0xfffffffc` |
| `0x165e634` | `load(builder/output object:rdi+0x8)` | `rax` | `165e634:	48 89 30             	mov    QWORD PTR [rax],rsi` |
| `0x165e637` | `builder/output object` | `rdi+0x8` | `165e637:	48 83 47 08 08       	add    QWORD PTR [rdi+0x8],0x8` |
| `0x165e63c` | `builder/output object` | `rdi+0x10` | `165e63c:	83 47 10 f8          	add    DWORD PTR [rdi+0x10],0xfffffff8` |
| `0x165e685` | `load(descriptor element value:rbx)` | `r12+0x8` | `165e685:	41 89 44 24 08       	mov    DWORD PTR [r12+0x8],eax` |
| `0x165e68f` | `load(descriptor element value:rbx)` | `r12` | `165e68f:	49 89 0c 24          	mov    QWORD PTR [r12],rcx` |
| `0x165e6b1` | `load(descriptor element value:rbx)` | `r12` | `165e6b1:	4d 89 2c 24          	mov    QWORD PTR [r12],r13` |

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0x165e678` | `rdi=builder/output object, rsi=descriptor element value, r13=load(load(descriptor element value:rbx):rax), r14=builder/output object, rbx=descriptor element value, rax=load(descriptor element value:rbx)` | `165e678:	e8 af d9 ff ff       	call   165c02c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10198>` |
| `0x165e69e` | `rdi=builder/output object, rsi=descriptor element value, rcx=load(load(load(descriptor element value:rbx):rax):r13+rbp*1+0x0), r12=load(descriptor element value:rbx), r13=load(load(descriptor element value:rbx):rax), r14=builder/output object, rbx=descriptor element value, rax=load(descriptor element value:rbx)` | `165e69e:	e8 5d f8 18 00       	call   17edf00 <_Znwm@plt>` |
| `0x165e6ac` | `rdi=load(descriptor element value:rbx), rsi=load(load(descriptor element value:rbx):r12), rcx=load(load(load(descriptor element value:rbx):rax):r13+rbp*1+0x0), r12=load(descriptor element value:rbx), r13=load(descriptor element value:rbx), r14=builder/output object, rbx=descriptor element value, rax=load(descriptor element value:rbx)` | `165e6ac:	e8 8f f8 18 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0x165e6cf` | `rdi=load(descriptor element value:rbx), rsi=load(load(descriptor element value:rbx):r12), rcx=load(load(load(descriptor element value:rbx):rax):r13+rbp*1+0x0), r12=load(descriptor element value:rbx), r13=load(descriptor element value:rbx), r14=builder/output object, rbx=load(descriptor element value:rbx), rax=load(descriptor element value:rbx)` | `165e6cf:	e8 4c f8 18 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x165e6d7` | `rdi=load(descriptor element value:rbx), rsi=load(load(descriptor element value:rbx):r12), rcx=load(load(load(descriptor element value:rbx):rax):r13+rbp*1+0x0), r12=load(descriptor element value:rbx), r13=load(descriptor element value:rbx), r14=builder/output object, rbx=load(descriptor element value:rbx), rax=load(descriptor element value:rbx)` | `165e6d7:	e8 f4 15 41 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x165e6f0` | `rdi=load(descriptor element value:rbx), rsi=load(load(descriptor element value:rbx):r12), rcx=load(load(load(descriptor element value:rbx):rax):r13+rbp*1+0x0), r12=load(descriptor element value:rbx), r13=load(descriptor element value:rbx), r14=builder/output object, rbx=load(descriptor element value:rbx), rax=load(load(descriptor element value:rbx):rdi)` | `165e6f0:	ff 50 48             	call   QWORD PTR [rax+0x48]` |

## Interpretation

The key question is whether these helpers directly build the child-readiness object or only populate a descriptor/materialization builder. A helper that writes through `rdi`/builder strongly suggests materialization into an output object used by the constructor path; lack of direct `child+0x18` handling keeps the semantic edge one layer deeper.
