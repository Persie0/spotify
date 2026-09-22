# Restrictions builder/buffer helper trace

Purpose: continue below `0x165dd40` branch helpers. `165e51e`, `165cc82`, and `165e60c` write a builder/output object; this report classifies their deeper buffer/growth/emit callees.

## Summary

| helper | role hint | refs | writes | calls | child+0x18 hits | interpretation |
|---|---|---:|---:|---:|---:|---|
| `165c600` | append/copy bytes into builder output buffer | 9 | 5 | 3 | 0 | builder buffer/capacity emit helper |
| `165c67e` | emit encoded scalar through slow path | 4 | 6 | 0 | 0 | builder buffer/capacity emit helper |
| `165c6ca` | single-byte emit slow path / capacity refill | 3 | 21 | 0 | 0 | builder buffer/capacity emit helper |
| `165c7ae` | multi-byte varint emit slow path | 5 | 18 | 0 | 0 | builder buffer/capacity emit helper |
| `165d0d4` | 32-bit scalar emit fallback from 165e51e | 7 | 2 | 2 | 0 | builder buffer/capacity emit helper |

## Helper `165c600`

Role hint: append/copy bytes into builder output buffer

```text
 165c600:	41 57                	push   r15
 165c602:	41 56                	push   r14
 165c604:	41 55                	push   r13
 165c606:	41 54                	push   r12
 165c608:	53                   	push   rbx
 165c609:	89 d3                	mov    ebx,edx
 165c60b:	49 89 f4             	mov    r12,rsi
 165c60e:	49 89 fd             	mov    r13,rdi
 165c611:	4c 8d 77 10          	lea    r14,[rdi+0x10]
 165c615:	4c 8d 7f 08          	lea    r15,[rdi+0x8]
 165c619:	41 8b 16             	mov    edx,DWORD PTR [r14]
 165c61c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
 165c61f:	39 d3                	cmp    ebx,edx
 165c621:	76 3d                	jbe    165c660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107cc>
 165c623:	4c 89 e6             	mov    rsi,r12
 165c626:	e8 a5 34 19 00       	call   17efad0 <memcpy@plt>
 165c62b:	41 80 7d 00 00       	cmp    BYTE PTR [r13+0x0],0x0
 165c630:	74 41                	je     165c673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107df>
 165c632:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
 165c636:	49 01 c4             	add    r12,rax
 165c639:	29 c3                	sub    ebx,eax
 165c63b:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
 165c63f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 165c642:	4c 89 fe             	mov    rsi,r15
 165c645:	4c 89 f2             	mov    rdx,r14
 165c648:	ff 50 10             	call   QWORD PTR [rax+0x10]
 165c64b:	84 c0                	test   al,al
 165c64d:	75 ca                	jne    165c619 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10785>
 165c64f:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
 165c654:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
 165c659:	41 c6 45 00 00       	mov    BYTE PTR [r13+0x0],0x0
 165c65e:	eb 13                	jmp    165c673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107df>
 165c660:	89 da                	mov    edx,ebx
 165c662:	4c 89 e6             	mov    rsi,r12
 165c665:	e8 66 34 19 00       	call   17efad0 <memcpy@plt>
 165c66a:	48 63 c3             	movsxd rax,ebx
 165c66d:	49 01 07             	add    QWORD PTR [r15],rax
 165c670:	41 29 1e             	sub    DWORD PTR [r14],ebx
 165c673:	5b                   	pop    rbx
 165c674:	41 5c                	pop    r12
 165c676:	41 5d                	pop    r13
 165c678:	41 5e                	pop    r14
 165c67a:	41 5f                	pop    r15
 165c67c:	c3                   	ret
 165c67d:	cc                   	int3
```
### Buffer/capacity events
| addr | origin | mem | kind | instruction |
|---:|---|---|---|---|
| `0x165c611` | `builder/output object` | `rdi+0x10` | `read` | `165c611:	4c 8d 77 10          	lea    r14,[rdi+0x10]` |
| `0x165c615` | `builder/output object` | `rdi+0x8` | `read` | `165c615:	4c 8d 7f 08          	lea    r15,[rdi+0x8]` |
| `0x165c632` | `builder/output object` | `r13+0x10` | `read` | `165c632:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]` |
| `0x165c648` | `load(load(builder/output object:r13+0x18):rdi)` | `rax+0x10` | `read` | `165c648:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x165c64f` | `builder/output object` | `r13+0x8` | `write` | `165c64f:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0` |
| `0x165c654` | `builder/output object` | `r13+0x10` | `write` | `165c654:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0` |

### Tracked writes
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165c64f` | `builder/output object` | `r13+0x8` | `165c64f:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0` |
| `0x165c654` | `builder/output object` | `r13+0x10` | `165c654:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0` |
| `0x165c659` | `builder/output object` | `r13+0x0` | `165c659:	41 c6 45 00 00       	mov    BYTE PTR [r13+0x0],0x0` |
| `0x165c66d` | `addr(builder/output object:rdi+0x8)` | `r15` | `165c66d:	49 01 07             	add    QWORD PTR [r15],rax` |
| `0x165c670` | `addr(builder/output object:rdi+0x10)` | `r14` | `165c670:	41 29 1e             	sub    DWORD PTR [r14],ebx` |

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0x165c626` | `rdi=load(addr(builder/output object:rdi+0x8):r15), rsi=source buffer / inline byte area, rdx=byte count, r12=source buffer / inline byte area, r13=builder/output object, r14=addr(builder/output object:rdi+0x10), r15=addr(builder/output object:rdi+0x8)` | `165c626:	e8 a5 34 19 00       	call   17efad0 <memcpy@plt>` |
| `0x165c648` | `rdi=load(builder/output object:r13+0x18), rsi=addr(builder/output object:rdi+0x8), rdx=addr(builder/output object:rdi+0x10), r12=source buffer / inline byte area, r13=builder/output object, r14=addr(builder/output object:rdi+0x10), r15=addr(builder/output object:rdi+0x8), rax=load(load(builder/output object:r13+0x18):rdi)` | `165c648:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x165c665` | `rdi=load(builder/output object:r13+0x18), rsi=source buffer / inline byte area, rdx=addr(builder/output object:rdi+0x10), r12=source buffer / inline byte area, r13=builder/output object, r14=addr(builder/output object:rdi+0x10), r15=addr(builder/output object:rdi+0x8), rax=load(load(builder/output object:r13+0x18):rdi)` | `165c665:	e8 66 34 19 00       	call   17efad0 <memcpy@plt>` |

## Helper `165c67e`

Role hint: emit encoded scalar through slow path

```text
 165c67e:	81 fe ff 3f 00 00    	cmp    esi,0x3fff
 165c684:	0f 87 40 00 00 00    	ja     165c6ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10836>
 165c68a:	89 f1                	mov    ecx,esi
 165c68c:	80 c9 80             	or     cl,0x80
 165c68f:	83 7f 10 02          	cmp    DWORD PTR [rdi+0x10],0x2
 165c693:	72 1b                	jb     165c6b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1081c>
 165c695:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 165c699:	88 08                	mov    BYTE PTR [rax],cl
 165c69b:	c1 ee 07             	shr    esi,0x7
 165c69e:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 165c6a2:	40 88 70 01          	mov    BYTE PTR [rax+0x1],sil
 165c6a6:	48 83 47 08 02       	add    QWORD PTR [rdi+0x8],0x2
 165c6ab:	83 47 10 fe          	add    DWORD PTR [rdi+0x10],0xfffffffe
 165c6af:	c3                   	ret
 165c6b0:	48 8d 47 24          	lea    rax,[rdi+0x24]
 165c6b4:	88 4f 24             	mov    BYTE PTR [rdi+0x24],cl
 165c6b7:	c1 ee 07             	shr    esi,0x7
 165c6ba:	40 88 77 25          	mov    BYTE PTR [rdi+0x25],sil
 165c6be:	6a 02                	push   0x2
 165c6c0:	5a                   	pop    rdx
 165c6c1:	48 89 c6             	mov    rsi,rax
 165c6c4:	e9 37 ff ff ff       	jmp    165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>
 165c6c9:	cc                   	int3
```
### Buffer/capacity events
| addr | origin | mem | kind | instruction |
|---:|---|---|---|---|
| `0x165c68f` | `builder/output object` | `rdi+0x10` | `read` | `165c68f:	83 7f 10 02          	cmp    DWORD PTR [rdi+0x10],0x2` |
| `0x165c695` | `builder/output object` | `rdi+0x8` | `read` | `165c695:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x165c69e` | `builder/output object` | `rdi+0x8` | `read` | `165c69e:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x165c6a6` | `builder/output object` | `rdi+0x8` | `write` | `165c6a6:	48 83 47 08 02       	add    QWORD PTR [rdi+0x8],0x2` |
| `0x165c6ab` | `builder/output object` | `rdi+0x10` | `write` | `165c6ab:	83 47 10 fe          	add    DWORD PTR [rdi+0x10],0xfffffffe` |
| `0x165c6b0` | `builder/output object` | `rdi+0x24` | `read` | `165c6b0:	48 8d 47 24          	lea    rax,[rdi+0x24]` |
| `0x165c6b4` | `builder/output object` | `rdi+0x24` | `write` | `165c6b4:	88 4f 24             	mov    BYTE PTR [rdi+0x24],cl` |

### Tracked writes
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165c699` | `load(builder/output object:rdi+0x8)` | `rax` | `165c699:	88 08                	mov    BYTE PTR [rax],cl` |
| `0x165c6a2` | `load(builder/output object:rdi+0x8)` | `rax+0x1` | `165c6a2:	40 88 70 01          	mov    BYTE PTR [rax+0x1],sil` |
| `0x165c6a6` | `builder/output object` | `rdi+0x8` | `165c6a6:	48 83 47 08 02       	add    QWORD PTR [rdi+0x8],0x2` |
| `0x165c6ab` | `builder/output object` | `rdi+0x10` | `165c6ab:	83 47 10 fe          	add    DWORD PTR [rdi+0x10],0xfffffffe` |
| `0x165c6b4` | `builder/output object` | `rdi+0x24` | `165c6b4:	88 4f 24             	mov    BYTE PTR [rdi+0x24],cl` |
| `0x165c6ba` | `builder/output object` | `rdi+0x25` | `165c6ba:	40 88 77 25          	mov    BYTE PTR [rdi+0x25],sil` |

### Calls with tracked args
No calls with tracked args in scanned window.

## Helper `165c6ca`

Role hint: single-byte emit slow path / capacity refill

```text
 165c6ca:	83 7f 10 05          	cmp    DWORD PTR [rdi+0x10],0x5
 165c6ce:	72 6b                	jb     165c73b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108a7>
 165c6d0:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 165c6d4:	89 f1                	mov    ecx,esi
 165c6d6:	80 c9 80             	or     cl,0x80
 165c6d9:	88 08                	mov    BYTE PTR [rax],cl
 165c6db:	81 fe 80 00 00 00    	cmp    esi,0x80
 165c6e1:	0f 82 81 00 00 00    	jb     165c768 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108d4>
 165c6e7:	89 f1                	mov    ecx,esi
 165c6e9:	c1 e9 07             	shr    ecx,0x7
 165c6ec:	89 ca                	mov    edx,ecx
 165c6ee:	80 ca 80             	or     dl,0x80
 165c6f1:	88 50 01             	mov    BYTE PTR [rax+0x1],dl
 165c6f4:	81 fe 00 40 00 00    	cmp    esi,0x4000
 165c6fa:	0f 82 86 00 00 00    	jb     165c786 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108f2>
 165c700:	89 f1                	mov    ecx,esi
 165c702:	c1 e9 0e             	shr    ecx,0xe
 165c705:	89 ca                	mov    edx,ecx
 165c707:	80 ca 80             	or     dl,0x80
 165c70a:	88 50 02             	mov    BYTE PTR [rax+0x2],dl
 165c70d:	81 fe 00 00 20 00    	cmp    esi,0x200000
 165c713:	72 7e                	jb     165c793 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108ff>
 165c715:	89 f1                	mov    ecx,esi
 165c717:	c1 e9 15             	shr    ecx,0x15
 165c71a:	89 ca                	mov    edx,ecx
 165c71c:	80 ca 80             	or     dl,0x80
 165c71f:	88 50 03             	mov    BYTE PTR [rax+0x3],dl
 165c722:	81 fe 00 00 00 10    	cmp    esi,0x10000000
 165c728:	72 76                	jb     165c7a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1090c>
 165c72a:	c1 ee 1c             	shr    esi,0x1c
 165c72d:	40 88 70 04          	mov    BYTE PTR [rax+0x4],sil
 165c731:	48 83 47 08 05       	add    QWORD PTR [rdi+0x8],0x5
 165c736:	83 47 10 fb          	add    DWORD PTR [rdi+0x10],0xfffffffb
 165c73a:	c3                   	ret
 165c73b:	48 8d 47 24          	lea    rax,[rdi+0x24]
 165c73f:	81 fe 80 00 00 00    	cmp    esi,0x80
 165c745:	72 2c                	jb     165c773 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108df>
 165c747:	48 89 c2             	mov    rdx,rax
 165c74a:	89 f1                	mov    ecx,esi
 165c74c:	41 89 f0             	mov    r8d,esi
 165c74f:	41 80 c8 80          	or     r8b,0x80
 165c753:	44 88 02             	mov    BYTE PTR [rdx],r8b
 165c756:	48 ff c2             	inc    rdx
 165c759:	c1 e9 07             	shr    ecx,0x7
 165c75c:	81 fe ff 3f 00 00    	cmp    esi,0x3fff
 165c762:	89 ce                	mov    esi,ecx
 165c764:	77 e6                	ja     165c74c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108b8>
 165c766:	eb 10                	jmp    165c778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108e4>
 165c768:	40 88 30             	mov    BYTE PTR [rax],sil
 165c76b:	48 ff 47 08          	inc    QWORD PTR [rdi+0x8]
 165c76f:	ff 4f 10             	dec    DWORD PTR [rdi+0x10]
 165c772:	c3                   	ret
 165c773:	89 f1                	mov    ecx,esi
 165c775:	48 89 c2             	mov    rdx,rax
 165c778:	88 0a                	mov    BYTE PTR [rdx],cl
 165c77a:	29 c2                	sub    edx,eax
 165c77c:	ff c2                	inc    edx
 165c77e:	48 89 c6             	mov    rsi,rax
 165c781:	e9 7a fe ff ff       	jmp    165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>
 165c786:	88 48 01             	mov    BYTE PTR [rax+0x1],cl
 165c789:	48 83 47 08 02       	add    QWORD PTR [rdi+0x8],0x2
 165c78e:	83 47 10 fe          	add    DWORD PTR [rdi+0x10],0xfffffffe
 165c792:	c3                   	ret
 165c793:	88 48 02             	mov    BYTE PTR [rax+0x2],cl
 165c796:	48 83 47 08 03       	add    QWORD PTR [rdi+0x8],0x3
 165c79b:	83 47 10 fd          	add    DWORD PTR [rdi+0x10],0xfffffffd
 165c79f:	c3                   	ret
 165c7a0:	88 48 03             	mov    BYTE PTR [rax+0x3],cl
 165c7a3:	48 83 47 08 04       	add    QWORD PTR [rdi+0x8],0x4
 165c7a8:	83 47 10 fc          	add    DWORD PTR [rdi+0x10],0xfffffffc
 165c7ac:	c3                   	ret
 165c7ad:	cc                   	int3
```
### Buffer/capacity events
| addr | origin | mem | kind | instruction |
|---:|---|---|---|---|
| `0x165c6ca` | `builder/output object` | `rdi+0x10` | `read` | `165c6ca:	83 7f 10 05          	cmp    DWORD PTR [rdi+0x10],0x5` |
| `0x165c6d0` | `builder/output object` | `rdi+0x8` | `read` | `165c6d0:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x165c731` | `builder/output object` | `rdi+0x8` | `write` | `165c731:	48 83 47 08 05       	add    QWORD PTR [rdi+0x8],0x5` |
| `0x165c736` | `builder/output object` | `rdi+0x10` | `write` | `165c736:	83 47 10 fb          	add    DWORD PTR [rdi+0x10],0xfffffffb` |
| `0x165c73b` | `builder/output object` | `rdi+0x24` | `read` | `165c73b:	48 8d 47 24          	lea    rax,[rdi+0x24]` |
| `0x165c76b` | `builder/output object` | `rdi+0x8` | `write` | `165c76b:	48 ff 47 08          	inc    QWORD PTR [rdi+0x8]` |
| `0x165c76f` | `builder/output object` | `rdi+0x10` | `write` | `165c76f:	ff 4f 10             	dec    DWORD PTR [rdi+0x10]` |
| `0x165c789` | `builder/output object` | `rdi+0x8` | `write` | `165c789:	48 83 47 08 02       	add    QWORD PTR [rdi+0x8],0x2` |
| `0x165c78e` | `builder/output object` | `rdi+0x10` | `write` | `165c78e:	83 47 10 fe          	add    DWORD PTR [rdi+0x10],0xfffffffe` |
| `0x165c796` | `builder/output object` | `rdi+0x8` | `write` | `165c796:	48 83 47 08 03       	add    QWORD PTR [rdi+0x8],0x3` |
| `0x165c79b` | `builder/output object` | `rdi+0x10` | `write` | `165c79b:	83 47 10 fd          	add    DWORD PTR [rdi+0x10],0xfffffffd` |
| `0x165c7a3` | `builder/output object` | `rdi+0x8` | `write` | `165c7a3:	48 83 47 08 04       	add    QWORD PTR [rdi+0x8],0x4` |
| `0x165c7a8` | `builder/output object` | `rdi+0x10` | `write` | `165c7a8:	83 47 10 fc          	add    DWORD PTR [rdi+0x10],0xfffffffc` |

### Tracked writes
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165c6d9` | `load(builder/output object:rdi+0x8)` | `rax` | `165c6d9:	88 08                	mov    BYTE PTR [rax],cl` |
| `0x165c6f1` | `load(builder/output object:rdi+0x8)` | `rax+0x1` | `165c6f1:	88 50 01             	mov    BYTE PTR [rax+0x1],dl` |
| `0x165c70a` | `load(builder/output object:rdi+0x8)` | `rax+0x2` | `165c70a:	88 50 02             	mov    BYTE PTR [rax+0x2],dl` |
| `0x165c71f` | `load(builder/output object:rdi+0x8)` | `rax+0x3` | `165c71f:	88 50 03             	mov    BYTE PTR [rax+0x3],dl` |
| `0x165c72d` | `load(builder/output object:rdi+0x8)` | `rax+0x4` | `165c72d:	40 88 70 04          	mov    BYTE PTR [rax+0x4],sil` |
| `0x165c731` | `builder/output object` | `rdi+0x8` | `165c731:	48 83 47 08 05       	add    QWORD PTR [rdi+0x8],0x5` |
| `0x165c736` | `builder/output object` | `rdi+0x10` | `165c736:	83 47 10 fb          	add    DWORD PTR [rdi+0x10],0xfffffffb` |
| `0x165c753` | `addr(builder/output object:rdi+0x24)` | `rdx` | `165c753:	44 88 02             	mov    BYTE PTR [rdx],r8b` |
| `0x165c768` | `addr(builder/output object:rdi+0x24)` | `rax` | `165c768:	40 88 30             	mov    BYTE PTR [rax],sil` |
| `0x165c76b` | `builder/output object` | `rdi+0x8` | `165c76b:	48 ff 47 08          	inc    QWORD PTR [rdi+0x8]` |
| `0x165c76f` | `builder/output object` | `rdi+0x10` | `165c76f:	ff 4f 10             	dec    DWORD PTR [rdi+0x10]` |
| `0x165c778` | `addr(builder/output object:rdi+0x24)` | `rdx` | `165c778:	88 0a                	mov    BYTE PTR [rdx],cl` |
| `0x165c786` | `addr(builder/output object:rdi+0x24)` | `rax+0x1` | `165c786:	88 48 01             	mov    BYTE PTR [rax+0x1],cl` |
| `0x165c789` | `builder/output object` | `rdi+0x8` | `165c789:	48 83 47 08 02       	add    QWORD PTR [rdi+0x8],0x2` |
| `0x165c78e` | `builder/output object` | `rdi+0x10` | `165c78e:	83 47 10 fe          	add    DWORD PTR [rdi+0x10],0xfffffffe` |
| `0x165c793` | `addr(builder/output object:rdi+0x24)` | `rax+0x2` | `165c793:	88 48 02             	mov    BYTE PTR [rax+0x2],cl` |
| `0x165c796` | `builder/output object` | `rdi+0x8` | `165c796:	48 83 47 08 03       	add    QWORD PTR [rdi+0x8],0x3` |
| `0x165c79b` | `builder/output object` | `rdi+0x10` | `165c79b:	83 47 10 fd          	add    DWORD PTR [rdi+0x10],0xfffffffd` |
| `0x165c7a0` | `addr(builder/output object:rdi+0x24)` | `rax+0x3` | `165c7a0:	88 48 03             	mov    BYTE PTR [rax+0x3],cl` |
| `0x165c7a3` | `builder/output object` | `rdi+0x8` | `165c7a3:	48 83 47 08 04       	add    QWORD PTR [rdi+0x8],0x4` |
| `0x165c7a8` | `builder/output object` | `rdi+0x10` | `165c7a8:	83 47 10 fc          	add    DWORD PTR [rdi+0x10],0xfffffffc` |

### Calls with tracked args
No calls with tracked args in scanned window.

## Helper `165c7ae`

Role hint: multi-byte varint emit slow path

```text
 165c7ae:	8b 4f 10             	mov    ecx,DWORD PTR [rdi+0x10]
 165c7b1:	83 f9 0a             	cmp    ecx,0xa
 165c7b4:	72 39                	jb     165c7ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1095b>
 165c7b6:	48 89 f2             	mov    rdx,rsi
 165c7b9:	48 c1 ea 1c          	shr    rdx,0x1c
 165c7bd:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 165c7c1:	49 89 f0             	mov    r8,rsi
 165c7c4:	49 c1 e8 38          	shr    r8,0x38
 165c7c8:	75 5b                	jne    165c825 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10991>
 165c7ca:	85 d2                	test   edx,edx
 165c7cc:	0f 84 fd 00 00 00    	je     165c8cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a3b>
 165c7d2:	81 fa ff 3f 00 00    	cmp    edx,0x3fff
 165c7d8:	0f 87 06 01 00 00    	ja     165c8e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a50>
 165c7de:	81 fa 80 00 00 00    	cmp    edx,0x80
 165c7e4:	0f 83 1a 01 00 00    	jae    165c904 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a70>
 165c7ea:	6a 05                	push   0x5
 165c7ec:	59                   	pop    rcx
 165c7ed:	eb 77                	jmp    165c866 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109d2>
 165c7ef:	48 8d 47 24          	lea    rax,[rdi+0x24]
 165c7f3:	48 81 fe 80 00 00 00 	cmp    rsi,0x80
 165c7fa:	0f 82 a3 00 00 00    	jb     165c8a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a0f>
 165c800:	48 89 c1             	mov    rcx,rax
 165c803:	49 89 f0             	mov    r8,rsi
 165c806:	89 f2                	mov    edx,esi
 165c808:	80 ca 80             	or     dl,0x80
 165c80b:	88 11                	mov    BYTE PTR [rcx],dl
 165c80d:	48 ff c1             	inc    rcx
 165c810:	49 c1 e8 07          	shr    r8,0x7
 165c814:	48 81 fe ff 3f 00 00 	cmp    rsi,0x3fff
 165c81b:	4c 89 c6             	mov    rsi,r8
 165c81e:	77 e6                	ja     165c806 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10972>
 165c820:	e9 84 00 00 00       	jmp    165c8a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a15>
 165c825:	4c 8d 48 ff          	lea    r9,[rax-0x1]
 165c829:	4c 89 4f 08          	mov    QWORD PTR [rdi+0x8],r9
 165c82d:	ff c1                	inc    ecx
 165c82f:	89 4f 10             	mov    DWORD PTR [rdi+0x10],ecx
 165c832:	44 88 40 08          	mov    BYTE PTR [rax+0x8],r8b
 165c836:	6a 0a                	push   0xa
 165c838:	59                   	pop    rcx
 165c839:	49 89 f0             	mov    r8,rsi
 165c83c:	49 c1 e8 31          	shr    r8,0x31
 165c840:	41 80 c8 80          	or     r8b,0x80
 165c844:	44 88 40 07          	mov    BYTE PTR [rax+0x7],r8b
 165c848:	49 89 f0             	mov    r8,rsi
 165c84b:	49 c1 e8 2a          	shr    r8,0x2a
 165c84f:	41 80 c8 80          	or     r8b,0x80
 165c853:	44 88 40 06          	mov    BYTE PTR [rax+0x6],r8b
 165c857:	49 89 f0             	mov    r8,rsi
 165c85a:	49 c1 e8 23          	shr    r8,0x23
 165c85e:	41 80 c8 80          	or     r8b,0x80
 165c862:	44 88 40 05          	mov    BYTE PTR [rax+0x5],r8b
 165c866:	80 ca 80             	or     dl,0x80
 165c869:	88 50 04             	mov    BYTE PTR [rax+0x4],dl
 165c86c:	89 f2                	mov    edx,esi
 165c86e:	c1 ea 15             	shr    edx,0x15
 165c871:	80 ca 80             	or     dl,0x80
 165c874:	88 50 03             	mov    BYTE PTR [rax+0x3],dl
 165c877:	89 f2                	mov    edx,esi
 165c879:	c1 ea 0e             	shr    edx,0xe
 165c87c:	80 ca 80             	or     dl,0x80
 165c87f:	88 50 02             	mov    BYTE PTR [rax+0x2],dl
 165c882:	89 f2                	mov    edx,esi
 165c884:	c1 ea 07             	shr    edx,0x7
 165c887:	80 ca 80             	or     dl,0x80
 165c88a:	88 50 01             	mov    BYTE PTR [rax+0x1],dl
 165c88d:	40 80 ce 80          	or     sil,0x80
 165c891:	40 88 30             	mov    BYTE PTR [rax],sil
 165c894:	89 ca                	mov    edx,ecx
 165c896:	80 64 10 ff 7f       	and    BYTE PTR [rax+rdx*1-0x1],0x7f
 165c89b:	48 01 57 08          	add    QWORD PTR [rdi+0x8],rdx
 165c89f:	29 4f 10             	sub    DWORD PTR [rdi+0x10],ecx
 165c8a2:	c3                   	ret
 165c8a3:	49 89 f0             	mov    r8,rsi
 165c8a6:	48 89 c1             	mov    rcx,rax
 165c8a9:	44 88 01             	mov    BYTE PTR [rcx],r8b
 165c8ac:	48 89 ce             	mov    rsi,rcx
 165c8af:	48 29 c6             	sub    rsi,rax
 165c8b2:	48 8d 56 01          	lea    rdx,[rsi+0x1]
 165c8b6:	48 83 fa 0a          	cmp    rdx,0xa
 165c8ba:	75 0b                	jne    165c8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a33>
 165c8bc:	41 c0 e0 07          	shl    r8b,0x7
 165c8c0:	44 08 41 ff          	or     BYTE PTR [rcx-0x1],r8b
 165c8c4:	48 89 f2             	mov    rdx,rsi
 165c8c7:	48 89 c6             	mov    rsi,rax
 165c8ca:	e9 31 fd ff ff       	jmp    165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>
 165c8cf:	81 fe ff 3f 00 00    	cmp    esi,0x3fff
 165c8d5:	77 1d                	ja     165c8f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a60>
 165c8d7:	81 fe 80 00 00 00    	cmp    esi,0x80
 165c8dd:	73 34                	jae    165c913 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a7f>
 165c8df:	6a 01                	push   0x1
 165c8e1:	59                   	pop    rcx
 165c8e2:	eb a9                	jmp    165c88d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109f9>
 165c8e4:	81 fa 00 00 20 00    	cmp    edx,0x200000
 165c8ea:	73 20                	jae    165c90c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a78>
 165c8ec:	6a 07                	push   0x7
 165c8ee:	59                   	pop    rcx
 165c8ef:	e9 54 ff ff ff       	jmp    165c848 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109b4>
 165c8f4:	81 fe 00 00 20 00    	cmp    esi,0x200000
 165c8fa:	73 1f                	jae    165c91b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a87>
 165c8fc:	6a 03                	push   0x3
 165c8fe:	59                   	pop    rcx
 165c8ff:	e9 73 ff ff ff       	jmp    165c877 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109e3>
```
### Buffer/capacity events
| addr | origin | mem | kind | instruction |
|---:|---|---|---|---|
| `0x165c7ae` | `builder/output object` | `rdi+0x10` | `read` | `165c7ae:	8b 4f 10             	mov    ecx,DWORD PTR [rdi+0x10]` |
| `0x165c7bd` | `builder/output object` | `rdi+0x8` | `read` | `165c7bd:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x165c7ef` | `builder/output object` | `rdi+0x24` | `read` | `165c7ef:	48 8d 47 24          	lea    rax,[rdi+0x24]` |
| `0x165c829` | `builder/output object` | `rdi+0x8` | `write` | `165c829:	4c 89 4f 08          	mov    QWORD PTR [rdi+0x8],r9` |
| `0x165c82f` | `builder/output object` | `rdi+0x10` | `write` | `165c82f:	89 4f 10             	mov    DWORD PTR [rdi+0x10],ecx` |
| `0x165c832` | `addr(builder/output object:rdi+0x24)` | `rax+0x8` | `write` | `165c832:	44 88 40 08          	mov    BYTE PTR [rax+0x8],r8b` |
| `0x165c89b` | `builder/output object` | `rdi+0x8` | `write` | `165c89b:	48 01 57 08          	add    QWORD PTR [rdi+0x8],rdx` |
| `0x165c89f` | `builder/output object` | `rdi+0x10` | `write` | `165c89f:	29 4f 10             	sub    DWORD PTR [rdi+0x10],ecx` |

### Tracked writes
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165c80b` | `addr(builder/output object:rdi+0x24)` | `rcx` | `165c80b:	88 11                	mov    BYTE PTR [rcx],dl` |
| `0x165c829` | `builder/output object` | `rdi+0x8` | `165c829:	4c 89 4f 08          	mov    QWORD PTR [rdi+0x8],r9` |
| `0x165c82f` | `builder/output object` | `rdi+0x10` | `165c82f:	89 4f 10             	mov    DWORD PTR [rdi+0x10],ecx` |
| `0x165c832` | `addr(builder/output object:rdi+0x24)` | `rax+0x8` | `165c832:	44 88 40 08          	mov    BYTE PTR [rax+0x8],r8b` |
| `0x165c844` | `addr(builder/output object:rdi+0x24)` | `rax+0x7` | `165c844:	44 88 40 07          	mov    BYTE PTR [rax+0x7],r8b` |
| `0x165c853` | `addr(builder/output object:rdi+0x24)` | `rax+0x6` | `165c853:	44 88 40 06          	mov    BYTE PTR [rax+0x6],r8b` |
| `0x165c862` | `addr(builder/output object:rdi+0x24)` | `rax+0x5` | `165c862:	44 88 40 05          	mov    BYTE PTR [rax+0x5],r8b` |
| `0x165c869` | `addr(builder/output object:rdi+0x24)` | `rax+0x4` | `165c869:	88 50 04             	mov    BYTE PTR [rax+0x4],dl` |
| `0x165c874` | `addr(builder/output object:rdi+0x24)` | `rax+0x3` | `165c874:	88 50 03             	mov    BYTE PTR [rax+0x3],dl` |
| `0x165c87f` | `addr(builder/output object:rdi+0x24)` | `rax+0x2` | `165c87f:	88 50 02             	mov    BYTE PTR [rax+0x2],dl` |
| `0x165c88a` | `addr(builder/output object:rdi+0x24)` | `rax+0x1` | `165c88a:	88 50 01             	mov    BYTE PTR [rax+0x1],dl` |
| `0x165c891` | `addr(builder/output object:rdi+0x24)` | `rax` | `165c891:	40 88 30             	mov    BYTE PTR [rax],sil` |
| `0x165c896` | `encoded varint/large scalar` | `rax+rdx*1-0x1` | `165c896:	80 64 10 ff 7f       	and    BYTE PTR [rax+rdx*1-0x1],0x7f` |
| `0x165c896` | `addr(builder/output object:rdi+0x24)` | `rax+rdx*1-0x1` | `165c896:	80 64 10 ff 7f       	and    BYTE PTR [rax+rdx*1-0x1],0x7f` |
| `0x165c89b` | `builder/output object` | `rdi+0x8` | `165c89b:	48 01 57 08          	add    QWORD PTR [rdi+0x8],rdx` |
| `0x165c89f` | `builder/output object` | `rdi+0x10` | `165c89f:	29 4f 10             	sub    DWORD PTR [rdi+0x10],ecx` |
| `0x165c8a9` | `addr(builder/output object:rdi+0x24)` | `rcx` | `165c8a9:	44 88 01             	mov    BYTE PTR [rcx],r8b` |
| `0x165c8c0` | `addr(builder/output object:rdi+0x24)` | `rcx-0x1` | `165c8c0:	44 08 41 ff          	or     BYTE PTR [rcx-0x1],r8b` |

### Calls with tracked args
No calls with tracked args in scanned window.

## Helper `165d0d4`

Role hint: 32-bit scalar emit fallback from 165e51e

```text
 165d0d4:	48 8d 47 24          	lea    rax,[rdi+0x24]
 165d0d8:	89 77 24             	mov    DWORD PTR [rdi+0x24],esi
 165d0db:	6a 04                	push   0x4
 165d0dd:	5a                   	pop    rdx
 165d0de:	48 89 c6             	mov    rsi,rax
 165d0e1:	e9 1a f5 ff ff       	jmp    165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>
 165d0e6:	48 8d 47 24          	lea    rax,[rdi+0x24]
 165d0ea:	48 89 77 24          	mov    QWORD PTR [rdi+0x24],rsi
 165d0ee:	6a 08                	push   0x8
 165d0f0:	5a                   	pop    rdx
 165d0f1:	48 89 c6             	mov    rsi,rax
 165d0f4:	e9 07 f5 ff ff       	jmp    165c600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1076c>
 165d0f9:	cc                   	int3
 165d0fa:	55                   	push   rbp
 165d0fb:	41 57                	push   r15
 165d0fd:	41 56                	push   r14
 165d0ff:	41 55                	push   r13
 165d101:	41 54                	push   r12
 165d103:	53                   	push   rbx
 165d104:	48 83 ec 48          	sub    rsp,0x48
 165d108:	48 89 f3             	mov    rbx,rsi
 165d10b:	49 89 fe             	mov    r14,rdi
 165d10e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 165d115:	00 00
 165d117:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 165d11c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 165d11f:	ff 50 48             	call   QWORD PTR [rax+0x48]
 165d122:	8b 48 14             	mov    ecx,DWORD PTR [rax+0x14]
 165d125:	4c 01 f1             	add    rcx,r14
 165d128:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
 165d12d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 165d132:	8b 50 1c             	mov    edx,DWORD PTR [rax+0x1c]
 165d135:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
 165d13a:	4c 01 f2             	add    rdx,r14
 165d13d:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 165d142:	48 89 df             	mov    rdi,rbx
 165d145:	e8 a0 e8 ff ff       	call   165b9ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb56>
 165d14a:	4c 8d 7b 38          	lea    r15,[rbx+0x38]
 165d14e:	45 31 ed             	xor    r13d,r13d
 165d151:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
 165d156:	44 89 e8             	mov    eax,r13d
 165d159:	41 8d 6d 01          	lea    ebp,[r13+0x1]
 165d15d:	4c 6b f0 28          	imul   r14,rax,0x28
```
### Buffer/capacity events
| addr | origin | mem | kind | instruction |
|---:|---|---|---|---|
| `0x165d0d4` | `builder/output object` | `rdi+0x24` | `read` | `165d0d4:	48 8d 47 24          	lea    rax,[rdi+0x24]` |
| `0x165d0d8` | `builder/output object` | `rdi+0x24` | `write` | `165d0d8:	89 77 24             	mov    DWORD PTR [rdi+0x24],esi` |
| `0x165d0e6` | `builder/output object` | `rdi+0x24` | `read` | `165d0e6:	48 8d 47 24          	lea    rax,[rdi+0x24]` |
| `0x165d0ea` | `builder/output object` | `rdi+0x24` | `write` | `165d0ea:	48 89 77 24          	mov    QWORD PTR [rdi+0x24],rsi` |

### Tracked writes
| addr | origin | mem | instruction |
|---:|---|---|---|
| `0x165d0d8` | `builder/output object` | `rdi+0x24` | `165d0d8:	89 77 24             	mov    DWORD PTR [rdi+0x24],esi` |
| `0x165d0ea` | `builder/output object` | `rdi+0x24` | `165d0ea:	48 89 77 24          	mov    QWORD PTR [rdi+0x24],rsi` |

### Calls with tracked args
| addr | tracked args | instruction |
|---:|---|---|
| `0x165d11f` | `rdi=builder/output object, rsi=addr(builder/output object:rdi+0x24), r14=builder/output object, rbx=addr(builder/output object:rdi+0x24), rax=load(builder/output object:rdi)` | `165d11f:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x165d145` | `rdi=addr(builder/output object:rdi+0x24), rsi=addr(builder/output object:rdi+0x24), r14=builder/output object, rbx=addr(builder/output object:rdi+0x24), rax=load(builder/output object:rdi)` | `165d145:	e8 a0 e8 ff ff       	call   165b9ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb56>` |

## Interpretation

These helpers are expected to sit below the descriptor interpreter and operate on the builder/output buffer, not on the final child service object directly. If the `child+0x18 hits` column stays zero and writes are concentrated in builder fields like `+0x8`, `+0x10`, `+0x20`, and inline byte storage `+0x24`, the semantic edge remains: descriptor stream -> builder/output buffer -> later wrapper/storage into the returned child dependency.
