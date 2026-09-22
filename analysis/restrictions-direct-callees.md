# Restrictions direct callee trace

Purpose: follow direct callees left open by the descriptor-helper trace. The strongest target is `16609b0`, called with `rdx=bundle+0x10`; a write to `rdx+0x20` would resolve exactly to the Restrictions factory field `bundle+0x30`.

## Summary table

| target | insns | refs | writes | exact bundle+0x30 writes | bundle+0x30 aliases/passes | calls |
|---:|---:|---:|---:|---:|---:|---:|
| `0x16609b0` | `12` | `7` | `3` | `0` | `0` | `0` |
| `0x1660346` | `147` | `37` | `12` | `0` | `0` | `16` |
| `0x165feb3` | `39` | `0` | `0` | `0` | `0` | `2` |
| `0x1660070` | `8` | `0` | `0` | `0` | `0` | `2` |

## Details

### `16609b0 reached from 165ffb0 with rdx=bundle+0x10` at `0x16609b0`

- why: strong direct callee: a write to rdx+0x20 would be bundle+0x30
- initial origins: `rdi=descriptor, rsi=local_out, rdx=bundle+0x10`
- instructions scanned: `12`
- tracked refs: `7`
- tracked writes: `3`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` aliases/passes: `0`

#### Entry excerpt
```text
 16609b0:	8b 4f 18             	mov    ecx,DWORD PTR [rdi+0x18]
 16609b3:	8b 47 20             	mov    eax,DWORD PTR [rdi+0x20]
 16609b6:	03 4f 1c             	add    ecx,DWORD PTR [rdi+0x1c]
 16609b9:	89 4f 18             	mov    DWORD PTR [rdi+0x18],ecx
 16609bc:	31 d2                	xor    edx,edx
 16609be:	2b 47 3c             	sub    eax,DWORD PTR [rdi+0x3c]
 16609c1:	7e 07                	jle    16609ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b36>
 16609c3:	29 c1                	sub    ecx,eax
 16609c5:	89 4f 18             	mov    DWORD PTR [rdi+0x18],ecx
 16609c8:	89 c2                	mov    edx,eax
 16609ca:	89 57 1c             	mov    DWORD PTR [rdi+0x1c],edx
 16609cd:	c3                   	ret
```

#### Tracked writes
| addr | resolved location | instruction |
|---:|---|---|
| `0x16609b9` | `descriptor+0x18` | `16609b9:	89 4f 18             	mov    DWORD PTR [rdi+0x18],ecx` |
| `0x16609c5` | `descriptor+0x18` | `16609c5:	89 4f 18             	mov    DWORD PTR [rdi+0x18],ecx` |
| `0x16609ca` | `descriptor+0x1c` | `16609ca:	89 57 1c             	mov    DWORD PTR [rdi+0x1c],edx` |

### `1660346 reached from slot-fill helpers` at `0x1660346`

- why: descriptor skip/parser helper reached from 153d2a4 and 153d0d0
- initial origins: `rdi=descriptor, rdx=descriptor_stream, rcx=descriptor_remaining`
- instructions scanned: `147`
- tracked refs: `37`
- tracked writes: `12`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` aliases/passes: `0`

#### Entry excerpt
```text
 1660346:	55                   	push   rbp
 1660347:	41 56                	push   r14
 1660349:	53                   	push   rbx
 166034a:	48 83 ec 10          	sub    rsp,0x10
 166034e:	48 89 fb             	mov    rbx,rdi
 1660351:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1660358:	00 00
 166035a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 166035f:	8b 47 38             	mov    eax,DWORD PTR [rdi+0x38]
 1660362:	83 e0 07             	and    eax,0x7
 1660365:	83 f8 05             	cmp    eax,0x5
 1660368:	0f 87 f9 00 00 00    	ja     1660467 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x145d3>
 166036e:	48 8d 0d 53 b8 d3 fe 	lea    rcx,[rip+0xfffffffffed3b853]        # 39bbc8 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x87a9>
 1660375:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
 1660379:	48 01 c8             	add    rax,rcx
 166037c:	ff e0                	jmp    rax
 166037e:	48 89 e6             	mov    rsi,rsp
 1660381:	48 89 df             	mov    rdi,rbx
 1660384:	e8 f3 01 00 00       	call   166057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146e8>
 1660389:	84 c0                	test   al,al
 166038b:	0f 84 9c 01 00 00    	je     166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>
 1660391:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
 1660395:	48 85 ff             	test   rdi,rdi
 1660398:	0f 84 8f 01 00 00    	je     166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>
 166039e:	8b 73 38             	mov    esi,DWORD PTR [rbx+0x38]
 16603a1:	c1 ee 03             	shr    esi,0x3
 16603a4:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
 16603a8:	e8 b9 ba ff ff       	call   165be66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xffd2>
 16603ad:	e9 7b 01 00 00       	jmp    166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>
 16603b2:	8b 43 18             	mov    eax,DWORD PTR [rbx+0x18]
 16603b5:	85 c0                	test   eax,eax
 16603b7:	0f 84 b7 00 00 00    	je     1660474 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x145e0>
 16603bd:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
 16603c1:	0f b6 29             	movzx  ebp,BYTE PTR [rcx]
 16603c4:	40 84 ed             	test   bpl,bpl
 16603c7:	0f 88 a7 00 00 00    	js     1660474 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x145e0>
 16603cd:	48 ff c1             	inc    rcx
 16603d0:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
 16603d4:	ff c8                	dec    eax
 16603d6:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax
 16603d9:	e9 b0 00 00 00       	jmp    166048e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x145fa>
 16603de:	8b 43 18             	mov    eax,DWORD PTR [rbx+0x18]
 16603e1:	83 f8 08             	cmp    eax,0x8
 16603e4:	0f 82 5c 01 00 00    	jb     1660546 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146b2>
 16603ea:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
 16603ee:	48 8d 51 08          	lea    rdx,[rcx+0x8]
 16603f2:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
 16603f6:	83 c0 f8             	add    eax,0xfffffff8
 16603f9:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax
 16603fc:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 16603ff:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 1660403:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
 1660407:	48 85 ff             	test   rdi,rdi
 166040a:	0f 84 1d 01 00 00    	je     166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>
 1660410:	8b 73 38             	mov    esi,DWORD PTR [rbx+0x38]
 1660413:	c1 ee 03             	shr    esi,0x3
 1660416:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
 166041a:	e8 ab bb ff ff       	call   165bfca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10136>
 166041f:	e9 09 01 00 00       	jmp    166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>
 1660424:	8b 43 18             	mov    eax,DWORD PTR [rbx+0x18]
 1660427:	83 f8 04             	cmp    eax,0x4
 166042a:	0f 82 2e 01 00 00    	jb     166055e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146ca>
 1660430:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
 1660434:	48 8d 51 04          	lea    rdx,[rcx+0x4]
 1660438:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
 166043c:	83 c0 fc             	add    eax,0xfffffffc
 166043f:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax
 1660442:	8b 01                	mov    eax,DWORD PTR [rcx]
 1660444:	89 04 24             	mov    DWORD PTR [rsp],eax
 1660447:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
 166044b:	48 85 ff             	test   rdi,rdi
 166044e:	0f 84 d9 00 00 00    	je     166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>
 1660454:	8b 73 38             	mov    esi,DWORD PTR [rbx+0x38]
 1660457:	c1 ee 03             	shr    esi,0x3
 166045a:	8b 14 24             	mov    edx,DWORD PTR [rsp]
 166045d:	e8 44 bb ff ff       	call   165bfa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10112>
 1660462:	e9 c6 00 00 00       	jmp    166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>
 1660467:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
 166046c:	c6 03 00             	mov    BYTE PTR [rbx],0x0
 166046f:	e9 b9 00 00 00       	jmp    166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>
...
```

#### Tracked writes
| addr | resolved location | instruction |
|---:|---|---|
| `0x16603d0` | `descriptor+0x10` | `16603d0:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx` |
| `0x16603d6` | `descriptor+0x18` | `16603d6:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax` |
| `0x16603f2` | `descriptor+0x10` | `16603f2:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x16603f9` | `descriptor+0x18` | `16603f9:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax` |
| `0x1660438` | `descriptor+0x10` | `1660438:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x166043f` | `descriptor+0x18` | `166043f:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax` |
| `0x1660467` | `descriptor+0x18` | `1660467:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0` |
| `0x166046c` | `descriptor` | `166046c:	c6 03 00             	mov    BYTE PTR [rbx],0x0` |
| `0x16604f5` | `descriptor+0x10` | `16604f5:	48 89 73 10          	mov    QWORD PTR [rbx+0x10],rsi` |
| `0x16604f9` | `descriptor+0x18` | `16604f9:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x1660524` | `descriptor+0x10` | `1660524:	48 01 4b 10          	add    QWORD PTR [rbx+0x10],rcx` |
| `0x166052a` | `descriptor+0x18` | `166052a:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax` |

#### Calls/jumps with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x166037c` | `0x?` | `rdi=descriptor, rdx=descriptor_stream` | `166037c:	ff e0                	jmp    rax` |
| `0x1660384` | `0x166057c` | `rdi=descriptor, rdx=descriptor_stream` | `1660384:	e8 f3 01 00 00       	call   166057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146e8>` |
| `0x16603a8` | `0x165be66` | `rdi=load(descriptor)+0x30, rsi=load(descriptor)+0x38` | `16603a8:	e8 b9 ba ff ff       	call   165be66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xffd2>` |
| `0x16603ad` | `0x166052d` | `rdi=load(descriptor)+0x30, rsi=load(descriptor)+0x38` | `16603ad:	e9 7b 01 00 00       	jmp    166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>` |
| `0x16603d9` | `0x166048e` | `rdi=load(descriptor)+0x30, rsi=load(descriptor)+0x38, rcx=load(descriptor)+0x10` | `16603d9:	e9 b0 00 00 00       	jmp    166048e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x145fa>` |
| `0x166041a` | `0x165bfca` | `rdi=load(descriptor)+0x30, rsi=load(descriptor)+0x38, rcx=load(descriptor)+0x10` | `166041a:	e8 ab bb ff ff       	call   165bfca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10136>` |
| `0x166041f` | `0x166052d` | `rdi=load(descriptor)+0x30, rsi=load(descriptor)+0x38, rcx=load(descriptor)+0x10` | `166041f:	e9 09 01 00 00       	jmp    166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>` |
| `0x166045d` | `0x165bfa6` | `rdi=load(descriptor)+0x30, rsi=load(descriptor)+0x38, rcx=load(descriptor)+0x10` | `166045d:	e8 44 bb ff ff       	call   165bfa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10112>` |
| `0x1660462` | `0x166052d` | `rdi=load(descriptor)+0x30, rsi=load(descriptor)+0x38, rcx=load(descriptor)+0x10` | `1660462:	e9 c6 00 00 00       	jmp    166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>` |
| `0x166046f` | `0x166052d` | `rdi=load(descriptor)+0x30, rsi=load(descriptor)+0x38, rcx=load(descriptor)+0x10` | `166046f:	e9 b9 00 00 00       	jmp    166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>` |
| `0x166047e` | `0x166073c` | `rdi=descriptor, rsi=descriptor+0x40, rcx=load(descriptor)+0x10, r14=descriptor+0x40` | `166047e:	e8 b9 02 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x166049d` | `0x165be8c` | `rdi=load(descriptor)+0x30, rsi=load(descriptor)+0x38, rcx=load(descriptor)+0x10, r14=descriptor+0x40` | `166049d:	e8 ea b9 ff ff       	call   165be8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff8>` |
| `0x16604cd` | `0x1660872` | `rdi=descriptor, rsi=load(load(descriptor))+0x10, r14=descriptor+0x40, rdx=load(descriptor)+0x40` | `16604cd:	e9 a0 03 00 00       	jmp    1660872 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x149de>` |
| `0x16604e0` | `0x16608ee` | `rdi=descriptor, rsi=load(load(descriptor))+0x10, r14=load(descriptor)+0x40, rdx=load(descriptor)+0x40` | `16604e0:	e8 09 04 00 00       	call   16608ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14a5a>` |
| `0x16604ec` | `0x166052d` | `rdi=descriptor, rsi=load(load(descriptor))+0x10, r14=load(descriptor)+0x40, rdx=load(descriptor)+0x40` | `16604ec:	eb 3f                	jmp    166052d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14699>` |
| `0x166051c` | `0x17ee750` | `rdi=load(descriptor)+0x18, rsi=load(descriptor)+0x40, r14=load(descriptor)+0x40, rdx=load(descriptor)+0x40` | `166051c:	e9 2f e2 18 00       	jmp    17ee750 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKcm@plt>` |

### `165feb3 internal tail from 165fe6a` at `0x165feb3`

- why: 165fe6a jumps here while preserving r14=bundle+0x10
- initial origins: `rdi=descriptor, rsi=local_out, rdx=descriptor_stream, r14=bundle+0x10`
- instructions scanned: `39`
- tracked refs: `0`
- tracked writes: `0`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` aliases/passes: `0`

#### Entry excerpt
```text
 165feb3:	03 43 1c             	add    eax,DWORD PTR [rbx+0x1c]
 165feb6:	8b 53 20             	mov    edx,DWORD PTR [rbx+0x20]
 165feb9:	29 c2                	sub    edx,eax
 165febb:	be ff ff ff 7f       	mov    esi,0x7fffffff
 165fec0:	89 d7                	mov    edi,edx
 165fec2:	31 f7                	xor    edi,esi
 165fec4:	01 ca                	add    edx,ecx
 165fec6:	39 cf                	cmp    edi,ecx
 165fec8:	0f 42 d6             	cmovb  edx,esi
 165fecb:	85 c9                	test   ecx,ecx
 165fecd:	0f 48 d6             	cmovs  edx,esi
 165fed0:	8b 6b 3c             	mov    ebp,DWORD PTR [rbx+0x3c]
 165fed3:	39 d5                	cmp    ebp,edx
 165fed5:	0f 4c d5             	cmovl  edx,ebp
 165fed8:	89 53 3c             	mov    DWORD PTR [rbx+0x3c],edx
 165fedb:	39 c2                	cmp    edx,eax
 165fedd:	0f 4d d0             	cmovge edx,eax
 165fee0:	89 53 18             	mov    DWORD PTR [rbx+0x18],edx
 165fee3:	29 d0                	sub    eax,edx
 165fee5:	89 43 1c             	mov    DWORD PTR [rbx+0x1c],eax
 165fee8:	48 89 df             	mov    rdi,rbx
 165feeb:	e8 c0 0a 00 00       	call   16609b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b1c>
 165fef0:	eb 03                	jmp    165fef5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14061>
 165fef2:	8b 6b 3c             	mov    ebp,DWORD PTR [rbx+0x3c]
 165fef5:	41 89 6f 08          	mov    DWORD PTR [r15+0x8],ebp
 165fef9:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
 165fefd:	49 89 07             	mov    QWORD PTR [r15],rax
 165ff00:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
 165ff04:	8b 43 24             	mov    eax,DWORD PTR [rbx+0x24]
 165ff07:	ff c0                	inc    eax
 165ff09:	89 43 24             	mov    DWORD PTR [rbx+0x24],eax
 165ff0c:	3b 43 28             	cmp    eax,DWORD PTR [rbx+0x28]
 165ff0f:	7d 0b                	jge    165ff1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14088>
 165ff11:	48 83 c4 08          	add    rsp,0x8
 165ff15:	5b                   	pop    rbx
 165ff16:	41 5e                	pop    r14
 165ff18:	41 5f                	pop    r15
 165ff1a:	5d                   	pop    rbp
 165ff1b:	c3                   	ret
```

#### Calls/jumps with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x165feeb` | `0x16609b0` | `r14=bundle+0x10` | `165feeb:	e8 c0 0a 00 00       	call   16609b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b1c>` |
| `0x165fef0` | `0x165fef5` | `r14=bundle+0x10` | `165fef0:	eb 03                	jmp    165fef5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14061>` |

### `1660070 internal tail from 1660032` at `0x1660070`

- why: 1660032 jumps here after writing into bundle substructures
- initial origins: `rdi=descriptor, rsi=substructure`
- instructions scanned: `8`
- tracked refs: `0`
- tracked writes: `0`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` aliases/passes: `0`

#### Entry excerpt
```text
 1660070:	b0 01                	mov    al,0x1
 1660072:	eb 07                	jmp    166007b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141e7>
 1660074:	e8 cd 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>
 1660079:	31 c0                	xor    eax,eax
 166007b:	48 83 c4 08          	add    rsp,0x8
 166007f:	5b                   	pop    rbx
 1660080:	41 5e                	pop    r14
 1660082:	c3                   	ret
```

#### Calls/jumps with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x1660072` | `0x166007b` | `rdi=descriptor, rsi=substructure` | `1660072:	eb 07                	jmp    166007b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141e7>` |
| `0x1660074` | `0x1660346` | `rdi=descriptor, rsi=substructure` | `1660074:	e8 cd 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
