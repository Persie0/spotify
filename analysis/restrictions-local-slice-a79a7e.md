# Restrictions local slice around `0x14ce666` and helper `a79a7e`

Purpose: continue from the proven `bundle+0x30 == rsp+0x310` edge and inspect the only local materialization block plus the immediate helper reached at `0x14ce717`.

## Slice summary
- local slice: `0x14ce638..0x14ce740`
- local instructions parsed: 64
- calls in local slice: 6
- helper target: `0xa79a7e` / `JNI_OnUnload@@Base`
- xrefs to helper target: 5651
- helper early calls in first 0x260 bytes: 23
- helper arg-memory refs in first 0x260 bytes: 0

## Local instruction table with stack/arg annotations
| addr | instruction | notes |
|---|---|---|
| `0x14ce63f` | `14ce63f:	4c 89 bc 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r15` | `stack 0x380; interesting-stack` |
| `0x14ce647` | `14ce647:	c6 84 24 88 03 00 00 	mov    BYTE PTR [rsp+0x388],0x1` | `stack 0x388; interesting-stack` |
| `0x14ce652` | `14ce652:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12` | `stack 0xa0; interesting-stack` |
| `0x14ce659` | `14ce659:	00` | `` |
| `0x14ce65a` | `14ce65a:	e8 91 fa 31 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` | `CALL args: rdi=r15` |
| `0x14ce65f` | `14ce65f:	48 8d 05 62 fd 3a 00 	lea    rax,[rip+0x3afd62]        # 187e3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3aab0>` | `` |
| `0x14ce666` | `14ce666:	48 8d 8c 24 10 03 00 	lea    rcx,[rsp+0x310]` | `stack 0x310; interesting-stack` |
| `0x14ce66d` | `14ce66d:	00` | `` |
| `0x14ce66e` | `14ce66e:	48 89 41 d0          	mov    QWORD PTR [rcx-0x30],rax` | `` |
| `0x14ce672` | `14ce672:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0` | `` |
| `0x14ce677` | `14ce677:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx` | `` |
| `0x14ce67b` | `14ce67b:	48 b8 00 00 00 00 04 	movabs rax,0x400000000` | `` |
| `0x14ce682` | `14ce682:	00 00 00` | `` |
| `0x14ce685` | `14ce685:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax` | `` |
| `0x14ce689` | `14ce689:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0` | `` |
| `0x14ce68d` | `14ce68d:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0` | `` |
| `0x14ce691` | `14ce691:	48 8d 8c 24 50 03 00 	lea    rcx,[rsp+0x350]` | `stack 0x350; interesting-stack` |
| `0x14ce698` | `14ce698:	00` | `` |
| `0x14ce699` | `14ce699:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx` | `` |
| `0x14ce69d` | `14ce69d:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax` | `` |
| `0x14ce6a1` | `14ce6a1:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0` | `` |
| `0x14ce6a5` | `14ce6a5:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0` | `` |
| `0x14ce6a9` | `14ce6a9:	83 61 98 00          	and    DWORD PTR [rcx-0x68],0x0` | `` |
| `0x14ce6ad` | `14ce6ad:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]` | `stack 0x2b0; interesting-stack` |
| `0x14ce6b4` | `14ce6b4:	00` | `` |
| `0x14ce6b5` | `14ce6b5:	4c 89 e6             	mov    rsi,r12` | `` |
| `0x14ce6b8` | `14ce6b8:	e8 83 f8 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` | `CALL args: rdi=[rsp+0x2b0] address, rsi=r12, rcx=[rsp+0x350] address` |
| `0x14ce6bd` | `14ce6bd:	f6 84 24 b0 02 00 00 	test   BYTE PTR [rsp+0x2b0],0x1` | `stack 0x2b0; interesting-stack` |
| `0x14ce6c4` | `14ce6c4:	01` | `` |
| `0x14ce6c5` | `14ce6c5:	74 40                	je     14ce707 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c8b>` | `` |
| `0x14ce6c7` | `14ce6c7:	48 8b b4 24 c0 02 00 	mov    rsi,QWORD PTR [rsp+0x2c0]` | `stack 0x2c0` |
| `0x14ce6ce` | `14ce6ce:	00` | `` |
| `0x14ce6cf` | `14ce6cf:	eb 3e                	jmp    14ce70f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c93>` | `` |
| `0x14ce6d1` | `14ce6d1:	6a 20                	push   0x20` | `` |
| `0x14ce6d3` | `14ce6d3:	5f                   	pop    rdi` | `` |
| `0x14ce6d4` | `14ce6d4:	e8 27 f8 31 00       	call   17edf00 <_Znwm@plt>` | `CALL args: rsi=[rsp+0x2c0], rcx=[rsp+0x350] address` |
| `0x14ce6d9` | `14ce6d9:	49 89 c5             	mov    r13,rax` | `` |
| `0x14ce6dc` | `14ce6dc:	66 0f ef c0          	pxor   xmm0,xmm0` | `` |
| `0x14ce6e0` | `14ce6e0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0` | `` |
| `0x14ce6e5` | `14ce6e5:	48 8d 05 94 ab 3a 00 	lea    rax,[rip+0x3aab94]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>` | `` |
| `0x14ce6ec` | `14ce6ec:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax` | `` |
| `0x14ce6f0` | `14ce6f0:	4c 89 eb             	mov    rbx,r13` | `` |
| `0x14ce6f3` | `14ce6f3:	48 83 c3 18          	add    rbx,0x18` | `` |
| `0x14ce6f7` | `14ce6f7:	48 8d 05 ba ab 3a 00 	lea    rax,[rip+0x3aabba]        # 18792b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x359a0>` | `` |
| `0x14ce6fe` | `14ce6fe:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` | `` |
| `0x14ce702` | `14ce702:	e9 5c 01 00 00       	jmp    14ce863 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313de7>` | `` |
| `0x14ce707` | `14ce707:	48 8d b4 24 b1 02 00 	lea    rsi,[rsp+0x2b1]` | `stack 0x2b1` |
| `0x14ce70e` | `14ce70e:	00` | `` |
| `0x14ce70f` | `14ce70f:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]` | `stack 0x3a0` |
| `0x14ce716` | `14ce716:	00` | `` |
| `0x14ce717` | `14ce717:	e8 62 b3 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` | `CALL args: rdi=[rsp+0x3a0] address, rsi=[rsp+0x2b1] address, rcx=[rsp+0x350] address` |
| `0x14ce71c` | `14ce71c:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]` | `stack 0x230` |
| `0x14ce724` | `14ce724:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]` | `stack 0x3a0` |
| `0x14ce72c` | `14ce72c:	e8 f9 f5 2d 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>` | `CALL args: rdi=[rsp+0x230] address, rsi=[rsp+0x3a0] address, rcx=[rsp+0x350] address` |
| `0x14ce731` | `14ce731:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]` | `stack 0x3a0` |
| `0x14ce739` | `14ce739:	e8 52 f7 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` | `CALL args: rdi=[rsp+0x3a0] address, rsi=[rsp+0x3a0] address, rcx=[rsp+0x350] address` |
| `0x14ce73e` | `14ce73e:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]` | `stack 0x2b0; interesting-stack` |

## Calls in the local slice
| call | tracked args before call | instruction |
|---|---|---|
| `0x14ce65a` | `rdi=r15` | `14ce65a:	e8 91 fa 31 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0x14ce6b8` | `rdi=[rsp+0x2b0] address, rsi=r12, rcx=[rsp+0x350] address` | `14ce6b8:	e8 83 f8 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0x14ce6d4` | `rsi=[rsp+0x2c0], rcx=[rsp+0x350] address` | `14ce6d4:	e8 27 f8 31 00       	call   17edf00 <_Znwm@plt>` |
| `0x14ce717` | `rdi=[rsp+0x3a0] address, rsi=[rsp+0x2b1] address, rcx=[rsp+0x350] address` | `14ce717:	e8 62 b3 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x14ce72c` | `rdi=[rsp+0x230] address, rsi=[rsp+0x3a0] address, rcx=[rsp+0x350] address` | `14ce72c:	e8 f9 f5 2d 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>` |
| `0x14ce739` | `rdi=[rsp+0x3a0] address, rsi=[rsp+0x3a0] address, rcx=[rsp+0x350] address` | `14ce739:	e8 52 f7 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |

### Contexts for local calls
#### call `0x14ce65a`
```text
     14ce638:	41 89 85 b0 00 00 00 	mov    DWORD PTR [r13+0xb0],eax
     14ce63f:	4c 89 bc 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r15
     14ce646:	00 
     14ce647:	c6 84 24 88 03 00 00 	mov    BYTE PTR [rsp+0x388],0x1
     14ce64e:	01 
     14ce64f:	4c 89 ff             	mov    rdi,r15
     14ce652:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     14ce659:	00 
     14ce65a:	e8 91 fa 31 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     14ce65f:	48 8d 05 62 fd 3a 00 	lea    rax,[rip+0x3afd62]        # 187e3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3aab0>
     14ce666:	48 8d 8c 24 10 03 00 	lea    rcx,[rsp+0x310]
     14ce66d:	00 
     14ce66e:	48 89 41 d0          	mov    QWORD PTR [rcx-0x30],rax
     14ce672:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
     14ce677:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
```

#### call `0x14ce6b8`
```text
     14ce699:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
     14ce69d:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
     14ce6a1:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0
     14ce6a5:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0
     14ce6a9:	83 61 98 00          	and    DWORD PTR [rcx-0x68],0x0
     14ce6ad:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14ce6b4:	00 
     14ce6b5:	4c 89 e6             	mov    rsi,r12
     14ce6b8:	e8 83 f8 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14ce6bd:	f6 84 24 b0 02 00 00 	test   BYTE PTR [rsp+0x2b0],0x1
     14ce6c4:	01 
     14ce6c5:	74 40                	je     14ce707 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c8b>
     14ce6c7:	48 8b b4 24 c0 02 00 	mov    rsi,QWORD PTR [rsp+0x2c0]
     14ce6ce:	00 
     14ce6cf:	eb 3e                	jmp    14ce70f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c93>
```

#### call `0x14ce6d4`
```text
     14ce6bd:	f6 84 24 b0 02 00 00 	test   BYTE PTR [rsp+0x2b0],0x1
     14ce6c4:	01 
     14ce6c5:	74 40                	je     14ce707 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c8b>
     14ce6c7:	48 8b b4 24 c0 02 00 	mov    rsi,QWORD PTR [rsp+0x2c0]
     14ce6ce:	00 
     14ce6cf:	eb 3e                	jmp    14ce70f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c93>
     14ce6d1:	6a 20                	push   0x20
     14ce6d3:	5f                   	pop    rdi
     14ce6d4:	e8 27 f8 31 00       	call   17edf00 <_Znwm@plt>
     14ce6d9:	49 89 c5             	mov    r13,rax
     14ce6dc:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce6e0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce6e5:	48 8d 05 94 ab 3a 00 	lea    rax,[rip+0x3aab94]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14ce6ec:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14ce6f0:	4c 89 eb             	mov    rbx,r13
```

#### call `0x14ce717`
```text
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
```

#### call `0x14ce72c`
```text
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
```

#### call `0x14ce739`
```text
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
```

## Focus context: `0x14ce666`
```text
     14ce612:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14ce617:	41 89 85 80 00 00 00 	mov    DWORD PTR [r13+0x80],eax
     14ce61e:	f3 41 0f 7f 85 88 00 	movdqu XMMWORD PTR [r13+0x88],xmm0
     14ce625:	00 00 
     14ce627:	49 83 a5 a8 00 00 00 	and    QWORD PTR [r13+0xa8],0x0
     14ce62e:	00 
     14ce62f:	f3 41 0f 7f 85 98 00 	movdqu XMMWORD PTR [r13+0x98],xmm0
     14ce636:	00 00 
     14ce638:	41 89 85 b0 00 00 00 	mov    DWORD PTR [r13+0xb0],eax
     14ce63f:	4c 89 bc 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r15
     14ce646:	00 
     14ce647:	c6 84 24 88 03 00 00 	mov    BYTE PTR [rsp+0x388],0x1
     14ce64e:	01 
     14ce64f:	4c 89 ff             	mov    rdi,r15
     14ce652:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     14ce659:	00 
     14ce65a:	e8 91 fa 31 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     14ce65f:	48 8d 05 62 fd 3a 00 	lea    rax,[rip+0x3afd62]        # 187e3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3aab0>
     14ce666:	48 8d 8c 24 10 03 00 	lea    rcx,[rsp+0x310]
     14ce66d:	00 
     14ce66e:	48 89 41 d0          	mov    QWORD PTR [rcx-0x30],rax
     14ce672:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
     14ce677:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
     14ce67b:	48 b8 00 00 00 00 04 	movabs rax,0x400000000
     14ce682:	00 00 00 
     14ce685:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
     14ce689:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0
     14ce68d:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0
     14ce691:	48 8d 8c 24 50 03 00 	lea    rcx,[rsp+0x350]
     14ce698:	00 
     14ce699:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
     14ce69d:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
     14ce6a1:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0
     14ce6a5:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0
     14ce6a9:	83 61 98 00          	and    DWORD PTR [rcx-0x68],0x0
     14ce6ad:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14ce6b4:	00 
     14ce6b5:	4c 89 e6             	mov    rsi,r12
     14ce6b8:	e8 83 f8 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14ce6bd:	f6 84 24 b0 02 00 00 	test   BYTE PTR [rsp+0x2b0],0x1
     14ce6c4:	01 
     14ce6c5:	74 40                	je     14ce707 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c8b>
     14ce6c7:	48 8b b4 24 c0 02 00 	mov    rsi,QWORD PTR [rsp+0x2c0]
     14ce6ce:	00 
     14ce6cf:	eb 3e                	jmp    14ce70f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c93>
     14ce6d1:	6a 20                	push   0x20
     14ce6d3:	5f                   	pop    rdi
     14ce6d4:	e8 27 f8 31 00       	call   17edf00 <_Znwm@plt>
     14ce6d9:	49 89 c5             	mov    r13,rax
     14ce6dc:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce6e0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce6e5:	48 8d 05 94 ab 3a 00 	lea    rax,[rip+0x3aab94]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14ce6ec:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14ce6f0:	4c 89 eb             	mov    rbx,r13
     14ce6f3:	48 83 c3 18          	add    rbx,0x18
     14ce6f7:	48 8d 05 ba ab 3a 00 	lea    rax,[rip+0x3aabba]        # 18792b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x359a0>
     14ce6fe:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
```

## Focus context: call `0x14ce717 -> a79a7e`
```text
     14ce6b8:	e8 83 f8 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14ce6bd:	f6 84 24 b0 02 00 00 	test   BYTE PTR [rsp+0x2b0],0x1
     14ce6c4:	01 
     14ce6c5:	74 40                	je     14ce707 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c8b>
     14ce6c7:	48 8b b4 24 c0 02 00 	mov    rsi,QWORD PTR [rsp+0x2c0]
     14ce6ce:	00 
     14ce6cf:	eb 3e                	jmp    14ce70f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c93>
     14ce6d1:	6a 20                	push   0x20
     14ce6d3:	5f                   	pop    rdi
     14ce6d4:	e8 27 f8 31 00       	call   17edf00 <_Znwm@plt>
     14ce6d9:	49 89 c5             	mov    r13,rax
     14ce6dc:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce6e0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
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
```

## Xrefs to helper `a79a7e`
| call | containing function | instruction |
|---|---|---|
| `0xa3d357` | `_ZNSt6__ndk114collate_bynameIcEC1EPKcm@@Base` | `a3d357:	e8 22 c7 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa3d8c7` | `_ZNSt6__ndk114collate_bynameIwEC1EPKcm@@Base` | `a3d8c7:	e8 b2 c1 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa3eac6` | `_ZNSt6__ndk112ctype_bynameIcEC1EPKcm@@Base` | `a3eac6:	e8 b3 af 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa3f057` | `_ZNSt6__ndk112ctype_bynameIwEC1EPKcm@@Base` | `a3f057:	e8 22 aa 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa3fb67` | `_ZNSt6__ndk17codecvtIwc9mbstate_tEC1EPKcm@@Base` | `a3fb67:	e8 12 9f 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa43b5f` | `_ZNSt6__ndk115numpunct_bynameIcE6__initEPKc@@Base` | `a43b5f:	e8 1a 5f 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa43e9f` | `_ZNSt6__ndk115numpunct_bynameIwE6__initEPKc@@Base` | `a43e9f:	e8 da 5b 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa45c14` | `_ZNSt6__ndk110__time_getC1EPKc@@Base` | `a45c14:	e8 65 3e 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa49cd4` | `_ZNSt6__ndk110__time_putC1EPKc@@Base` | `a49cd4:	e8 a5 fd 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa4a04e` | `_ZNSt6__ndk117moneypunct_bynameIcLb0EE4initEPKc@@Base` | `a4a04e:	e8 2b fa 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa4a883` | `_ZNSt6__ndk117moneypunct_bynameIcLb1EE4initEPKc@@Base` | `a4a883:	e8 f6 f1 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa4ac9d` | `_ZNSt6__ndk117moneypunct_bynameIwLb0EE4initEPKc@@Base` | `a4ac9d:	e8 dc ed 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa4b5e2` | `_ZNSt6__ndk117moneypunct_bynameIwLb1EE4initEPKc@@Base` | `a4b5e2:	e8 97 e4 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa4ec2b` | `_ZNSt6__ndk14__fs10filesystem18directory_iteratorC1ERKNS1_4pathEPNS_10error_codeENS1_17directory_optionsE@@Base` | `a4ec2b:	e8 4e ae 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa4fd77` | `_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base` | `a4fd77:	e8 02 9d 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa5180f` | `_ZNSt6__ndk14__fs10filesystem11__canonicalERKNS1_4pathEPNS_10error_codeE@@Base` | `a5180f:	e8 6a 82 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa5293d` | `_ZNSt6__ndk14__fs10filesystem18__create_directoryERKNS1_4pathES4_PNS_10error_codeE@@Base` | `a5293d:	e8 3c 71 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa538a2` | `_ZNSt6__ndk14__fs10filesystem11__file_sizeERKNS1_4pathEPNS_10error_codeE@@Base` | `a538a2:	e8 d7 61 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa53c87` | `_ZNSt6__ndk14__fs10filesystem17__last_write_timeERKNS1_4pathEPNS_10error_codeE@@Base` | `a53c87:	e8 f2 5d 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa552d7` | `_ZNSt6__ndk14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE@@Base` | `a552d7:	e8 a2 47 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa554b7` | `_ZNSt6__ndk14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE@@Base` | `a554b7:	e8 c2 45 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa738cb` | `JNI_OnLoad@@Base` | `a738cb:	e8 ae 61 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa73bb3` | `JNI_OnLoad@@Base` | `a73bb3:	e8 c6 5e 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa73cbe` | `JNI_OnLoad@@Base` | `a73cbe:	e8 bb 5d 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa73d80` | `JNI_OnLoad@@Base` | `a73d80:	e8 f9 5c 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa7409a` | `JNI_OnLoad@@Base` | `a7409a:	e8 df 59 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa74179` | `JNI_OnLoad@@Base` | `a74179:	e8 00 59 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa744ea` | `JNI_OnLoad@@Base` | `a744ea:	e8 8f 55 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa745ed` | `JNI_OnLoad@@Base` | `a745ed:	e8 8c 54 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa746f0` | `JNI_OnLoad@@Base` | `a746f0:	e8 89 53 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa74938` | `JNI_OnLoad@@Base` | `a74938:	e8 41 51 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa74c53` | `JNI_OnLoad@@Base` | `a74c53:	e8 26 4e 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa74dea` | `JNI_OnLoad@@Base` | `a74dea:	e8 8f 4c 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa75590` | `JNI_OnLoad@@Base` | `a75590:	e8 e9 44 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa757b8` | `JNI_OnLoad@@Base` | `a757b8:	e8 c1 42 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa7587a` | `JNI_OnLoad@@Base` | `a7587a:	e8 ff 41 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa759f3` | `JNI_OnLoad@@Base` | `a759f3:	e8 86 40 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa75af6` | `JNI_OnLoad@@Base` | `a75af6:	e8 83 3f 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa75dd8` | `JNI_OnLoad@@Base` | `a75dd8:	e8 a1 3c 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa75e22` | `JNI_OnLoad@@Base` | `a75e22:	e8 57 3c 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |

### Xref contexts
#### caller `0xa3d357` in `_ZNSt6__ndk114collate_bynameIcEC1EPKcm@@Base`
```text
      a3d347:	48 83 c4 38          	add    rsp,0x38
      a3d34b:	5b                   	pop    rbx
      a3d34c:	41 5e                	pop    r14
      a3d34e:	c3                   	ret
      a3d34f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a3d354:	4c 89 f6             	mov    rsi,r14
      a3d357:	e8 22 c7 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a3d35c:	48 8d 35 1f 82 90 ff 	lea    rsi,[rip+0xffffffffff90821f]        # 345582 <_ZTSSt12bad_any_cast@@Base-0x4ac46>
      a3d363:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a3d368:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a3d36d:	e8 27 8a 07 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a3d372:	f6 44 24 08 01       	test   BYTE PTR [rsp+0x8],0x1
```

#### caller `0xa3d8c7` in `_ZNSt6__ndk114collate_bynameIwEC1EPKcm@@Base`
```text
      a3d8b7:	48 83 c4 38          	add    rsp,0x38
      a3d8bb:	5b                   	pop    rbx
      a3d8bc:	41 5e                	pop    r14
      a3d8be:	c3                   	ret
      a3d8bf:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a3d8c4:	4c 89 f6             	mov    rsi,r14
      a3d8c7:	e8 b2 c1 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a3d8cc:	48 8d 35 a8 5c 8e ff 	lea    rsi,[rip+0xffffffffff8e5ca8]        # 32357b <_ZTSSt12bad_any_cast@@Base-0x6cc4d>
      a3d8d3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a3d8d8:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a3d8dd:	e8 b7 84 07 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a3d8e2:	f6 44 24 08 01       	test   BYTE PTR [rsp+0x8],0x1
```

#### caller `0xa3eac6` in `_ZNSt6__ndk112ctype_bynameIcEC1EPKcm@@Base`
```text
      a3eab6:	48 83 c4 38          	add    rsp,0x38
      a3eaba:	5b                   	pop    rbx
      a3eabb:	41 5e                	pop    r14
      a3eabd:	c3                   	ret
      a3eabe:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a3eac3:	4c 89 f6             	mov    rsi,r14
      a3eac6:	e8 b3 af 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a3eacb:	48 8d 35 1f 2f 92 ff 	lea    rsi,[rip+0xffffffffff922f1f]        # 3619f1 <_ZTSSt12bad_any_cast@@Base-0x2e7d7>
      a3ead2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a3ead7:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a3eadc:	e8 b8 72 07 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a3eae1:	f6 44 24 08 01       	test   BYTE PTR [rsp+0x8],0x1
```

#### caller `0xa3f057` in `_ZNSt6__ndk112ctype_bynameIwEC1EPKcm@@Base`
```text
      a3f047:	48 83 c4 38          	add    rsp,0x38
      a3f04b:	5b                   	pop    rbx
      a3f04c:	41 5e                	pop    r14
      a3f04e:	c3                   	ret
      a3f04f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a3f054:	4c 89 f6             	mov    rsi,r14
      a3f057:	e8 22 aa 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a3f05c:	48 8d 35 90 34 94 ff 	lea    rsi,[rip+0xffffffffff943490]        # 3824f3 <_ZTSSt12bad_any_cast@@Base-0xdcd5>
      a3f063:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a3f068:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a3f06d:	e8 27 6d 07 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a3f072:	f6 44 24 08 01       	test   BYTE PTR [rsp+0x8],0x1
```

#### caller `0xa3fb67` in `_ZNSt6__ndk17codecvtIwc9mbstate_tEC1EPKcm@@Base`
```text
      a3fb57:	48 83 c4 38          	add    rsp,0x38
      a3fb5b:	5b                   	pop    rbx
      a3fb5c:	41 5e                	pop    r14
      a3fb5e:	c3                   	ret
      a3fb5f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a3fb64:	4c 89 f6             	mov    rsi,r14
      a3fb67:	e8 12 9f 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a3fb6c:	48 8d 35 5c 8e 90 ff 	lea    rsi,[rip+0xffffffffff908e5c]        # 3489cf <_ZTSSt12bad_any_cast@@Base-0x477f9>
      a3fb73:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a3fb78:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a3fb7d:	e8 17 62 07 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a3fb82:	f6 44 24 08 01       	test   BYTE PTR [rsp+0x8],0x1
```

#### caller `0xa43b5f` in `_ZNSt6__ndk115numpunct_bynameIcE6__initEPKc@@Base`
```text
      a43b50:	41 5c                	pop    r12
      a43b52:	41 5e                	pop    r14
      a43b54:	41 5f                	pop    r15
      a43b56:	c3                   	ret
      a43b57:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a43b5c:	4c 89 fe             	mov    rsi,r15
      a43b5f:	e8 1a 5f 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a43b64:	48 8d 35 45 d9 8f ff 	lea    rsi,[rip+0xffffffffff8fd945]        # 3414b0 <_ZTSSt12bad_any_cast@@Base-0x4ed18>
      a43b6b:	48 89 e7             	mov    rdi,rsp
      a43b6e:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a43b73:	e8 21 22 07 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a43b78:	f6 04 24 01          	test   BYTE PTR [rsp],0x1
```

#### caller `0xa43e9f` in `_ZNSt6__ndk115numpunct_bynameIwE6__initEPKc@@Base`
```text
      a43e90:	41 5c                	pop    r12
      a43e92:	41 5e                	pop    r14
      a43e94:	41 5f                	pop    r15
      a43e96:	c3                   	ret
      a43e97:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a43e9c:	4c 89 fe             	mov    rsi,r15
      a43e9f:	e8 da 5b 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a43ea4:	48 8d 35 3c 42 91 ff 	lea    rsi,[rip+0xffffffffff91423c]        # 3580e7 <_ZTSSt12bad_any_cast@@Base-0x380e1>
      a43eab:	48 89 e7             	mov    rdi,rsp
      a43eae:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a43eb3:	e8 e1 1e 07 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a43eb8:	f6 04 24 01          	test   BYTE PTR [rsp],0x1
```

#### caller `0xa45c14` in `_ZNSt6__ndk110__time_getC1EPKc@@Base`
```text
      a45c05:	5b                   	pop    rbx
      a45c06:	41 5e                	pop    r14
      a45c08:	c3                   	ret
      a45c09:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
      a45c0e:	4c 89 f7             	mov    rdi,r14
      a45c11:	48 89 de             	mov    rsi,rbx
      a45c14:	e8 65 3e 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a45c19:	48 8d 35 ee 32 92 ff 	lea    rsi,[rip+0xffffffffff9232ee]        # 368f0e <_ZTSSt12bad_any_cast@@Base-0x272ba>
      a45c20:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a45c25:	4c 89 f2             	mov    rdx,r14
      a45c28:	e8 6c 01 07 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a45c2d:	f6 44 24 08 01       	test   BYTE PTR [rsp+0x8],0x1
```

#### caller `0xa49cd4` in `_ZNSt6__ndk110__time_putC1EPKc@@Base`
```text
      a49cc5:	5b                   	pop    rbx
      a49cc6:	41 5e                	pop    r14
      a49cc8:	c3                   	ret
      a49cc9:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
      a49cce:	4c 89 f7             	mov    rdi,r14
      a49cd1:	48 89 de             	mov    rsi,rbx
      a49cd4:	e8 a5 fd 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a49cd9:	48 8d 35 15 17 91 ff 	lea    rsi,[rip+0xffffffffff911715]        # 35b3f5 <_ZTSSt12bad_any_cast@@Base-0x34dd3>
      a49ce0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a49ce5:	4c 89 f2             	mov    rdx,r14
      a49ce8:	e8 ac c0 06 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a49ced:	f6 44 24 08 01       	test   BYTE PTR [rsp+0x8],0x1
```

#### caller `0xa4a04e` in `_ZNSt6__ndk117moneypunct_bynameIcLb0EE4initEPKc@@Base`
```text
      a4a03f:	41 5c                	pop    r12
      a4a041:	41 5e                	pop    r14
      a4a043:	41 5f                	pop    r15
      a4a045:	c3                   	ret
      a4a046:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a4a04b:	4c 89 fe             	mov    rsi,r15
      a4a04e:	e8 2b fa 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a4a053:	48 8d 35 d0 e0 90 ff 	lea    rsi,[rip+0xffffffffff90e0d0]        # 35812a <_ZTSSt12bad_any_cast@@Base-0x3809e>
      a4a05a:	48 89 e7             	mov    rdi,rsp
      a4a05d:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a4a062:	e8 32 bd 06 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a4a067:	f6 04 24 01          	test   BYTE PTR [rsp],0x1
```

#### caller `0xa4a883` in `_ZNSt6__ndk117moneypunct_bynameIcLb1EE4initEPKc@@Base`
```text
      a4a874:	41 5c                	pop    r12
      a4a876:	41 5e                	pop    r14
      a4a878:	41 5f                	pop    r15
      a4a87a:	c3                   	ret
      a4a87b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      a4a880:	4c 89 fe             	mov    rsi,r15
      a4a883:	e8 f6 f1 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a4a888:	48 8d 35 9b d8 90 ff 	lea    rsi,[rip+0xffffffffff90d89b]        # 35812a <_ZTSSt12bad_any_cast@@Base-0x3809e>
      a4a88f:	48 89 e7             	mov    rdi,rsp
      a4a892:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      a4a897:	e8 fd b4 06 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a4a89c:	f6 04 24 01          	test   BYTE PTR [rsp],0x1
```

#### caller `0xa4ac9d` in `_ZNSt6__ndk117moneypunct_bynameIwLb0EE4initEPKc@@Base`
```text
      a4ac89:	5d                   	pop    rbp
      a4ac8a:	c3                   	ret
      a4ac8b:	48 8d 3d 37 89 8d ff 	lea    rdi,[rip+0xffffffffff8d8937]        # 3235c9 <_ZTSSt12bad_any_cast@@Base-0x6cbff>
      a4ac92:	e8 c9 4f da 00       	call   17efc60 <_ZNSt6__ndk121__throw_runtime_errorEPKc@plt>
      a4ac97:	48 89 e7             	mov    rdi,rsp
      a4ac9a:	4c 89 fe             	mov    rsi,r15
      a4ac9d:	e8 dc ed 02 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a4aca2:	48 8d 35 81 d4 90 ff 	lea    rsi,[rip+0xffffffffff90d481]        # 35812a <_ZTSSt12bad_any_cast@@Base-0x3809e>
      a4aca9:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      a4acae:	48 89 e2             	mov    rdx,rsp
      a4acb1:	e8 e3 b0 06 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      a4acb6:	f6 44 24 30 01       	test   BYTE PTR [rsp+0x30],0x1
```

## Helper `a79a7e` early body
```text
      a79a7e:	41 56                	push   r14
      a79a80:	53                   	push   rbx
      a79a81:	50                   	push   rax
      a79a82:	48 89 f3             	mov    rbx,rsi
      a79a85:	49 89 fe             	mov    r14,rdi
      a79a88:	48 89 f7             	mov    rdi,rsi
      a79a8b:	e8 80 44 d7 00       	call   17edf10 <strlen@plt>
      a79a90:	4c 89 f7             	mov    rdi,r14
      a79a93:	48 89 de             	mov    rsi,rbx
      a79a96:	48 89 c2             	mov    rdx,rax
      a79a99:	48 83 c4 08          	add    rsp,0x8
      a79a9d:	5b                   	pop    rbx
      a79a9e:	41 5e                	pop    r14
      a79aa0:	e9 fb 43 d7 00       	jmp    17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
      a79aa5:	50                   	push   rax
      a79aa6:	e8 c5 43 d7 00       	call   17ede70 <__cxa_begin_catch@plt>
      a79aab:	e8 d0 43 d7 00       	call   17ede80 <_ZSt9terminatev@plt>
      a79ab0:	41 57                	push   r15
      a79ab2:	41 56                	push   r14
      a79ab4:	41 55                	push   r13
      a79ab6:	41 54                	push   r12
      a79ab8:	53                   	push   rbx
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
      a79b33:	8a 4c 24 21          	mov    cl,BYTE PTR [rsp+0x21]
      a79b37:	64 48 8b 14 25 28 00 	mov    rdx,QWORD PTR fs:0x28
      a79b3e:	00 00 
      a79b40:	48 3b 54 24 28       	cmp    rdx,QWORD PTR [rsp+0x28]
      a79b45:	75 18                	jne    a79b5f <JNI_OnUnload@@Base+0x142c>
      a79b47:	0f b6 f8             	movzx  edi,al
      a79b4a:	0f b6 f1             	movzx  esi,cl
      a79b4d:	48 83 c4 30          	add    rsp,0x30
      a79b51:	5b                   	pop    rbx
      a79b52:	41 5c                	pop    r12
      a79b54:	41 5d                	pop    r13
      a79b56:	41 5e                	pop    r14
      a79b58:	41 5f                	pop    r15
      a79b5a:	e9 67 b0 d5 00       	jmp    17d4bc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9e7>
      a79b5f:	e8 4c 5f d7 00       	call   17efab0 <__stack_chk_fail@plt>
      a79b64:	48 89 c7             	mov    rdi,rax
      a79b67:	e8 39 ff ff ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      a79b6c:	41 57                	push   r15
      a79b6e:	41 56                	push   r14
      a79b70:	41 55                	push   r13
      a79b72:	41 54                	push   r12
      a79b74:	53                   	push   rbx
      a79b75:	48 83 ec 30          	sub    rsp,0x30
      a79b79:	89 d3                	mov    ebx,edx
      a79b7b:	49 89 f7             	mov    r15,rsi
      a79b7e:	49 89 fc             	mov    r12,rdi
      a79b81:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79b88:	00 00 
      a79b8a:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      a79b8f:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
      a79b94:	4c 89 f7             	mov    rdi,r14
      a79b97:	e8 50 af d5 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>
      a79b9c:	4d 8b 36             	mov    r14,QWORD PTR [r14]
      a79b9f:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      a79ba4:	4c 89 ef             	mov    rdi,r13
      a79ba7:	4c 89 f6             	mov    rsi,r14
      a79baa:	4c 89 e2             	mov    rdx,r12
      a79bad:	4c 89 f9             	mov    rcx,r15
      a79bb0:	e8 c0 bb d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>
      a79bb5:	49 8b 4d 08          	mov    rcx,QWORD PTR [r13+0x8]
      a79bb9:	48 85 c9             	test   rcx,rcx
      a79bbc:	74 23                	je     a79be1 <JNI_OnUnload@@Base+0x14ae>
      a79bbe:	48 8b 35 f3 96 f6 00 	mov    rsi,QWORD PTR [rip+0xf696f3]        # 19e32b8 <__cxa_new_handler@@Base+0x2b48>
      a79bc5:	48 8b 15 dc 96 f6 00 	mov    rdx,QWORD PTR [rip+0xf696dc]        # 19e32a8 <__cxa_new_handler@@Base+0x2b38>
      a79bcc:	4c 89 f7             	mov    rdi,r14
      a79bcf:	41 89 d8             	mov    r8d,ebx
      a79bd2:	31 c0                	xor    eax,eax
      a79bd4:	e8 0d 01 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>
```

### Helper arg-memory refs in early body
- none found in first 0x260 bytes

### Helper calls in early body
- `0xa79a8b` `a79a8b:	e8 80 44 d7 00       	call   17edf10 <strlen@plt>`
- `0xa79aa6` `a79aa6:	e8 c5 43 d7 00       	call   17ede70 <__cxa_begin_catch@plt>`
- `0xa79aab` `a79aab:	e8 d0 43 d7 00       	call   17ede80 <_ZSt9terminatev@plt>`
- `0xa79adb` `a79adb:	e8 0c b0 d5 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>`
- `0xa79af4` `a79af4:	e8 7c bc d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa79b18` `a79b18:	e8 c9 01 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa79b20` `a79b20:	e8 c3 b0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>`
- `0xa79b2a` `a79b2a:	e8 97 c1 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>`
- `0xa79b5f` `a79b5f:	e8 4c 5f d7 00       	call   17efab0 <__stack_chk_fail@plt>`
- `0xa79b67` `a79b67:	e8 39 ff ff ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>`
- `0xa79b97` `a79b97:	e8 50 af d5 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>`
- `0xa79bb0` `a79bb0:	e8 c0 bb d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa79bd4` `a79bd4:	e8 0d 01 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa79bdc` `a79bdc:	e8 07 b0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>`
- `0xa79be6` `a79be6:	e8 db c0 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>`
- `0xa79c1b` `a79c1b:	e8 90 5e d7 00       	call   17efab0 <__stack_chk_fail@plt>`
- `0xa79c23` `a79c23:	e8 7d fe ff ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>`
- `0xa79c54` `a79c54:	e8 93 ae d5 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>`
- `0xa79c6d` `a79c6d:	e8 03 bb d5 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>`
- `0xa79c91` `a79c91:	e8 50 00 00 00       	call   a79ce6 <JNI_OnUnload@@Base+0x15b3>`
- `0xa79c99` `a79c99:	e8 4a af d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>`
- `0xa79ca3` `a79ca3:	e8 1e c0 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>`
- `0xa79cd8` `a79cd8:	e8 d3 5d d7 00       	call   17efab0 <__stack_chk_fail@plt>`

## Interpretation
- If `0x14ce717` passes the freshly allocated/string-built object rather than `rsp+0x310` directly, then `a79a7e` is probably an insertion/registration helper that receives pieces assembled from the local object.
- Strong evidence would be either a tracked argument holding `[rsp+0x310]`/nearby stack object, or helper arg-memory refs that immediately dereference the same constructed object fields.
- If the tracker loses the object through PLT/new/string calls, the next trace should bind concrete argument registers at `0x14ce717` from the table above and then inspect matching fields inside `a79a7e`.
